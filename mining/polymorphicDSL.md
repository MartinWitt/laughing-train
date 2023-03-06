# polymorphicDSL 
 
# Bad smells
I found 1784 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 1344 | false |
| OptionalUsedAsFieldOrParameterType | 80 | false |
| OptionalContainsCollection | 71 | false |
| UNUSED_IMPORT | 32 | false |
| RedundantMethodOverride | 30 | false |
| ReplaceAssignmentWithOperatorAssignment | 23 | false |
| BoundedWildcard | 21 | false |
| OptionalIsPresent | 16 | false |
| ReturnNull | 13 | false |
| UnnecessaryLocalVariable | 13 | true |
| FinalStaticMethod | 11 | false |
| ConstantValue | 9 | false |
| SimplifyStreamApiCallChains | 9 | false |
| UnusedAssignment | 8 | false |
| DataFlowIssue | 8 | false |
| ConfusingOctalEscape | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| ClassNameSameAsAncestorName | 5 | false |
| UnnecessarySuperQualifier | 5 | false |
| RedundantFieldInitialization | 5 | false |
| ZeroLengthArrayInitialization | 5 | false |
| MethodOverloadsParentMethod | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| NullArgumentToVariableArgMethod | 3 | false |
| PointlessArithmeticExpression | 2 | false |
| EmptyStatementBody | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| CodeBlock2Expr | 2 | true |
| MismatchedCollectionQueryUpdate | 2 | false |
| RedundantImplements | 2 | false |
| RedundantSuppression | 2 | false |
| Anonymous2MethodRef | 2 | false |
| Java8MapApi | 2 | false |
| UnnecessaryModifier | 1 | true |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| MalformedFormatString | 1 | false |
| ExtendsAnnotation | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| NonFinalFieldOfException | 1 | false |
| FuseStreamOperations | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DoubleNegation | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ReplaceAllDot | 1 | false |
| SamePackageImport | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/com/pdsl/runners/PdslTest.java`
#### Snippet
```java
    String[] excludesResources() default "";
    String startRule() default DEFAULT_ALL_RULE;
    static String DEFAULT_ALL_RULE = "polymorphicDslAllRules" ;
}

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * getFilteredPhraseBodyList().size()` can be replaced with 'getFilteredPhraseBodyList().size()'
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      }
      size += dataSize;
      size += 1 * getFilteredPhraseBodyList().size();
    }
    if (phrasesSkippedDueToFailure_ != 0) {
```

### PointlessArithmeticExpression
`1 * getUnfilteredPhraseBodyList().size()` can be replaced with 'getUnfilteredPhraseBodyList().size()'
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      }
      size += dataSize;
      size += 1 * getUnfilteredPhraseBodyList().size();
    }
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `descriptor` from instance context
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
```

## RuleId[id=ConfusingOctalEscape]
### ConfusingOctalEscape
Octal escape sequence `\013` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "trategicReportData.proto\022\026com.pdsl.repor" +
      "ts.proto\"e\n\023StrategicReportData\022N\n\027opera" +
      "tional_report_data\030\001 \003(\0132-.com.pdsl.repo" +
      "rts.proto.OperationalReportData\"v\n\025Opera" +
      "tionalReportData\022\023\n\013application\030\001 \001(\t\022H\n" +
```

### ConfusingOctalEscape
Octal escape sequence `\013` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "rts.proto.OperationalReportData\"v\n\025Opera" +
      "tionalReportData\022\023\n\013application\030\001 \001(\t\022H\n" +
      "\024tactical_report_data\030\002 \003(\0132*.com.pdsl.r" +
      "eports.proto.TacticalReportData\"\371\001\n\022Tact" +
      "icalReportData\022\036\n\026unfiltered_phrase_body" +
```

### ConfusingOctalEscape
Octal escape sequence `\013` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "eports.proto.TacticalReportData\"\371\001\n\022Tact" +
      "icalReportData\022\036\n\026unfiltered_phrase_body" +
      "\030\001 \003(\t\022a\n\025context_to_test_cases\030\002 \003(\0132B." +
      "com.pdsl.reports.proto.TacticalReportDat" +
      "a.ContextToTestCasesEntry\032`\n\027ContextToTe" +
```

### ConfusingOctalEscape
Octal escape sequence `\022` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "com.pdsl.reports.proto.TacticalReportDat" +
      "a.ContextToTestCasesEntry\032`\n\027ContextToTe" +
      "stCasesEntry\022\013\n\003key\030\001 \001(\t\0224\n\005value\030\002 \001(\013" +
      "2%.com.pdsl.reports.proto.TestCaseGroup:" +
      "\0028\001\"[\n\rTestCaseGroup\022J\n\025technical_report" +
```

### ConfusingOctalEscape
Octal escape sequence `\002` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "stCasesEntry\022\013\n\003key\030\001 \001(\t\0224\n\005value\030\002 \001(\013" +
      "2%.com.pdsl.reports.proto.TestCaseGroup:" +
      "\0028\001\"[\n\rTestCaseGroup\022J\n\025technical_report" +
      "_data\030\001 \003(\0132+.com.pdsl.reports.proto.Tec" +
      "hnicalReportData\"\317\002\n\023TechnicalReportData" +
```

### ConfusingOctalEscape
Octal escape sequence `\013` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "2%.com.pdsl.reports.proto.TestCaseGroup:" +
      "\0028\001\"[\n\rTestCaseGroup\022J\n\025technical_report" +
      "_data\030\001 \003(\0132+.com.pdsl.reports.proto.Tec" +
      "hnicalReportData\"\317\002\n\023TechnicalReportData" +
      "\022\027\n\017test_case_title\030\001 \001(\t\022B\n\006status\030\002 \001(" +
```

### ConfusingOctalEscape
Octal escape sequence `\016` immediately followed by a digit
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "hnicalReportData\"\317\002\n\023TechnicalReportData" +
      "\022\027\n\017test_case_title\030\001 \001(\t\022B\n\006status\030\002 \001(" +
      "\01622.com.pdsl.reports.proto.TechnicalRepo" +
      "rtData.Status\022\026\n\016failing_phrase\030\003 \001(\t\022\026\n" +
      "\016failure_reason\030\004 \001(\t\022\034\n\024failing_phrase_" +
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder errorMessage` can be replaced with 'String'
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
        if (filteredPhrases.isEmpty() || filteredPhrases.stream().noneMatch(filteredPhrase -> filteredPhrase.getParseTree().isPresent())) { // Let the user know we couldn't parse
            String errorType = phrasesFilteredOut == testContent.size() ? "All phrases were filtered out of a test!" : "A test entirely failed to be parsed!";
            StringBuilder errorMessage = new StringBuilder(AnsiTerminalColorHelper.BRIGHT_YELLOW + errorType + RESET_ANSI);
            errorMessage.append(BOLD + "\n\tParser Context: " + RESET_ANSI + subgrammarParserConstructor.getName());
            String message = errorMessage.toString();
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `match &= visitNot(notContext)`
in `src/main/java/com/pdsl/gherkin/filter/GherkinTagsVisitorImpl.java`
#### Snippet
```java
        boolean match = true;
        for (GherkinTagsParser.NotContext notContext : ctx.not()) {
            match &= visitNot(notContext);
        }
         return match;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `match |= visitAnd(andContext)`
in `src/main/java/com/pdsl/gherkin/filter/GherkinTagsVisitorImpl.java`
#### Snippet
```java
        boolean match = false;
        for (GherkinTagsParser.AndContext andContext : ctx.and()) {
            match |= visitAnd(andContext);
        }
        return match;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/com/pdsl/logging/PdslThreadSafeOutputStream.java`
#### Snippet
```java
        //TODO: This is a bug. Find a way to handle character encoding instead of assuming
        // the caller wants to write the full array logged
        message = new String(bytes).substring(start, stop <= message.length() ? stop : message.length());
        logger.info(message);
    }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
      com.pdsl.reports.proto.OperationalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
      com.pdsl.reports.proto.TechnicalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pdsl.reports.proto.TechnicalReportData.getDescriptor().getEnumTypes().get(0);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
      com.pdsl.reports.proto.TestCaseGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
      com.pdsl.reports.proto.TacticalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder duplicateBody` are updated, but never queried
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
                if (previouslyExecutedTests.contains(testCase.getContextFilteredPhraseBody())) {
                    logger.warn("A test was skipped because after filtering it duplicated an earlier run test!%n\t%s", testCase.getTestTitle());
                    StringBuilder duplicateBody = new StringBuilder();
                    testCase.getContextFilteredTestSectionIterator().forEachRemaining(duplicateBody::append);
                    results.addTestResult(DefaultTestResult.duplicateTest(testCase));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TerminalNode`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
    }

    private List<String> terminalNodes2StringList(List<TerminalNode> nodeList) {
        List<String> tags = new LinkedList<>();
        nodeList.forEach(t -> tags.add(t.getText()));
```

### BoundedWildcard
Can generalize to `? extends TerminalNode`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
    }

    private String transformLongDescription(List<TerminalNode> description) {
        StringBuilder builder = new StringBuilder();
        description.forEach(d -> builder.append(d.getText()));
```

### BoundedWildcard
Can generalize to `? extends TerminalNode`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
    }

    private String list2String(List<TerminalNode> nodeList) {
        StringBuilder stringBuilder = new StringBuilder();
        nodeList.forEach(s -> stringBuilder.append(s.getText()));
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
    }

    private Map<String, List<String>> createSubstitutionMapping(List<List<String>> exampleContent) {
        // See if the rows first column or row contains the keys by convention
        boolean verticalHeaderRow = exampleContent.get(0).get(0).trim().equals("");
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
    }

    private String getDataTableText(List<List<String>> substitutedDataTable) {
        return String.join("\n",  // Separate each row by a line break
                substitutedDataTable.stream().map(row -> "|" + String.join("|", row) + "|") // Separate each cell with a pipe
```

### BoundedWildcard
Can generalize to `? extends GherkinStep`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
    }

    private List<String> getTextFromStepBody(List<GherkinStep> stepBody) {
        List<String> substitutedStepBody = new ArrayList<>();
        for (GherkinStep step : stepBody) {
```

### BoundedWildcard
Can generalize to `? extends GherkinScenario`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java


    private List<PickleJar.PickleJarScenario> convertScenariosToPickleJarScenarios(List<GherkinScenario> scenarios) {
        List<PickleJar.PickleJarScenario> pickleJarScenarios = new ArrayList<>();
        for (GherkinScenario scenario : scenarios) {
```

### BoundedWildcard
Can generalize to `? extends GherkinStep`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
    }

    private List<String> getTextSubstitutionsForStepBody(List<GherkinStep> stepBody, Map<String, String> substitutions) {
        List<String> substitutedStepBody = new ArrayList<>();
        for (GherkinStep step : stepBody) {
```

### BoundedWildcard
Can generalize to `? extends GherkinRule`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
    }

    private List<PickleJar.PickleJarRule> convertRulesToPickles(List<GherkinRule> rules) {
        List<PickleJar.PickleJarRule> pickleJarRules = new ArrayList<>();
        for (GherkinRule rule : rules) {
```

### BoundedWildcard
Can generalize to `? extends TestResult`
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java
    class FailedTestResults extends RuntimeException {
        private Collection<TestResult> failedResults;
        public FailedTestResults(Collection<TestResult> failedResults) {
            super("At least one child test failed during execution!", failedResults.stream()
                    .map(TestResult::getFailureReason)
```

### BoundedWildcard
Can generalize to `? extends MetadataTestRunResults`
in `src/main/java/com/pdsl/reports/TraceableReportGenerator.java`
#### Snippet
```java

    static Map<String, Map<String, List<TestResult>>> testResourceToContextHelper(
            Collection<MetadataTestRunResults> testRunResults) {
        Map<String, Map<String, List<TestResult>>> resourceToRuns = new HashMap<>();
        for (MetadataTestRunResults metadataTestRunResults : testRunResults) {
```

### BoundedWildcard
Can generalize to `? extends PickleJarScenario`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        }

        public Builder withFeatureLevelScenarios(List<PickleJarScenario> scenarios) {
            Preconditions.checkNotNull(scenarios, "Scenarios cannot be null!");
            this.scenarios.addAll(scenarios);
```

### BoundedWildcard
Can generalize to `? extends PickleJarRule`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        }

        public Builder withRules(List<PickleJarRule> rules) {
            Preconditions.checkNotNull(rules, "rules cannot be null!");
            this.rules.addAll(rules);
```

### BoundedWildcard
Can generalize to `? extends TestBodyFragment`
in `src/main/java/com/pdsl/testcases/DefaultPdslTestCase.java`
#### Snippet
```java
    private final List<String> contextFilteredPhraseBody;

    public DefaultPdslTestCase(String testCaseTitle, List<TestBodyFragment> testBodyFragments) {
        String errMessage = "Test case title cannot be empty or null!";
        Preconditions.checkNotNull(testCaseTitle, errMessage);
```

### BoundedWildcard
Can generalize to `? extends TestSpecification`
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java

    @Override
    public Collection<TestCase> processTestSpecification(Collection<TestSpecification> testSpecifications) {
        Collection<TestCase> testCases = new ArrayList<>(testSpecifications.size()); // Will likely need to be resized regardless
        for (TestSpecification testSpecification : testSpecifications) {
```

### BoundedWildcard
Can generalize to `? extends TestBodyFragment`
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java

    private List<TestCase> recursiveWalkAndCreateOnLeaf(TestSpecification testSpecification,
                                                        List<TestBodyFragment> parentTestBodyFragments,
                                                        Optional<InputStream> parentMetaData,
                                                        String rootId,
```

### BoundedWildcard
Can generalize to `? extends TestCase`
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
        }
    }
    private MetadataTestRunResults walk(Collection<TestCase> testCases, PhraseRegistry phraseRegistry, String context) {
        PolymorphicDslTestRunResults results = new PolymorphicDslTestRunResults(new PdslThreadSafeOutputStream(), context);
        Set<List<String>> previouslyExecutedTests = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends TestSpecification`
in `src/main/java/com/pdsl/testcases/SingleTestOutputPreorderTestCaseFactory.java`
#### Snippet
```java

    @Override
    public Collection<TestCase> processTestSpecification(Collection<TestSpecification> testCaseSpecifications) {
        Collection<TestCase> testCases = new ArrayList<>(testCaseSpecifications.size());
        for (TestSpecification testCaseSpecification : testCaseSpecifications) {
```

### BoundedWildcard
Can generalize to `? extends GherkinStep`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    }

    private Optional<List<FilteredPhrase>> processStepBodyContent(List<GherkinStep> stepBody) {
        List<InputStream> stepBodyAsStrings = stepBody.stream()
                .map(GherkinStep::getFullRawStepText)
```

### BoundedWildcard
Can generalize to `? extends PickleJar.PickleJarScenario`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    }

    private List<GherkinTestSpecification> transformScenariosToTestSpecifications(List<PickleJar.PickleJarScenario> scenarios, Set<String> parentTags, URI originalSourceLocation) {
        List<GherkinTestSpecification> gherkinTestSpecifications = new ArrayList<>();
        for (PickleJar.PickleJarScenario pickleJarScenario : scenarios) {
```

### BoundedWildcard
Can generalize to `? extends PickleJar.PickleJarRule`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    }

    private List<TestSpecification> transformRulesToTestSpecifications(List<PickleJar.PickleJarRule> rules, URI originalSourceLocation) {
        List<TestSpecification> testSpecifications = new ArrayList<>();
        for (PickleJar.PickleJarRule rule : rules) {
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorTechnicalReportGenerator.java`
#### Snippet
```java
            write(String.format("====== _%s_%n%n", results.getTestCaseTitle()));
            write(String.format("_Failed Step_:  \"*%s*%n%n", results.getFailingPhrase()));
            write(String.format("_Failure Reason_%n%n", results.getTestCaseTitle()));
            write(String.format("```%n%s%n```%n%n", results.getFailureReason()));
        }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * Protobuf type {@code com.pdsl.reports.proto.StrategicReportData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * Protobuf type {@code com.pdsl.reports.proto.OperationalReportData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * Protobuf type {@code com.pdsl.reports.proto.TechnicalReportData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * Protobuf type {@code com.pdsl.reports.proto.TestCaseGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   * Protobuf type {@code com.pdsl.reports.proto.TacticalReportData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `setRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
```

### RedundantMethodOverride
Method `addRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `clearOneof()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
```

### RedundantMethodOverride
Method `clearField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
```

### RedundantMethodOverride
Method `setField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `setRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
```

### RedundantMethodOverride
Method `clearOneof()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
```

### RedundantMethodOverride
Method `clearField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
```

### RedundantMethodOverride
Method `addRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `setField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
```

### RedundantMethodOverride
Method `clearOneof()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
```

### RedundantMethodOverride
Method `addRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `setField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `clearField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
```

### RedundantMethodOverride
Method `setRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
```

### RedundantMethodOverride
Method `clearOneof()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
```

### RedundantMethodOverride
Method `clearField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
```

### RedundantMethodOverride
Method `addRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `setField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `setRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
```

### RedundantMethodOverride
Method `clearField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
```

### RedundantMethodOverride
Method `setRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
```

### RedundantMethodOverride
Method `setField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
```

### RedundantMethodOverride
Method `clearOneof()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
```

### RedundantMethodOverride
Method `addRepeatedField()` only delegates to its super method
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

        public DefaultTestSpecification build() {
            Preconditions.checkArgument(!phrases.isEmpty() || !childItems.isEmpty(), "Phrases cannot be empty if you are not providing childItems!\n"
                    + "Use the other constructor if you have childItems or provide phrases");
            return new DefaultTestSpecification(this);
```

### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

        public DefaultTestSpecification build() {
            Preconditions.checkArgument(!phrases.isEmpty() || !childItems.isEmpty(), "Phrases cannot be empty if you are not providing childItems!\n"
                    + "Use the other constructor if you have childItems or provide phrases");
            return new DefaultTestSpecification(this);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/PdslGherkinInterpreterImpl.java`
#### Snippet
```java
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Optional;

```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListener.java`
#### Snippet
```java

import java.net.URI;
import java.net.URL;
import java.util.Optional;

```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java

import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/PdslGherkinRecognizer.java`
#### Snippet
```java
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Optional;

```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java

import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/gherkin/specifications/GherkinTestSpecification.java`
#### Snippet
```java
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.testcases.TestCase;`
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorOperationalReportGenerator.java`
#### Snippet
```java
import com.pdsl.reports.proto.TechnicalReportData;
import com.pdsl.reports.proto.TestCaseGroup;
import com.pdsl.testcases.TestCase;

import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import javax.inject.Provider;`
in `src/main/java/com/pdsl/reports/asciidoctor/DefaultAsciidoctorReportGeneratorProvider.java`
#### Snippet
```java
import org.asciidoctor.SafeMode;

import javax.inject.Provider;
import java.io.IOException;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import org.antlr.v4.runtime.Lexer;`
in `src/main/java/com/pdsl/runners/EmptyRecognizerParser.java`
#### Snippet
```java
package com.pdsl.runners;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.specifications.TestSpecification;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java

import com.pdsl.runners.junit.JUnitConfigurationAccessor;
import com.pdsl.specifications.TestSpecification;
import com.pdsl.specifications.TestSpecificationFactory;

```

### UNUSED_IMPORT
Unused import `import com.pdsl.specifications.TestSpecificationFactory;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import com.pdsl.runners.junit.JUnitConfigurationAccessor;
import com.pdsl.specifications.TestSpecification;
import com.pdsl.specifications.TestSpecificationFactory;

import javax.inject.Provider;
```

### UNUSED_IMPORT
Unused import `import javax.inject.Provider;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import com.pdsl.specifications.TestSpecificationFactory;

import javax.inject.Provider;
import java.lang.annotation.Annotation;
import java.net.URI;
```

### UNUSED_IMPORT
Unused import `import java.lang.annotation.Annotation;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java

import javax.inject.Provider;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.net.URI;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import javax.inject.Provider;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Collection;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import java.net.URI;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

/**
```

### UNUSED_IMPORT
Unused import `import com.pdsl.runners.PdslConfiguration;`
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
import com.pdsl.executors.TraceableTestRunExecutor;
import com.pdsl.reports.MetadataTestRunResults;
import com.pdsl.runners.PdslConfiguration;
import com.pdsl.runners.PdslGherkinApplication;
import com.pdsl.testcases.TestCase;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.runners.PdslGherkinApplication;`
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
import com.pdsl.reports.MetadataTestRunResults;
import com.pdsl.runners.PdslConfiguration;
import com.pdsl.runners.PdslGherkinApplication;
import com.pdsl.testcases.TestCase;
import org.antlr.v4.runtime.tree.ParseTreeListener;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.exceptions.PolymorphicDslFrameworkException;`
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java

import com.google.common.base.Preconditions;
import com.pdsl.exceptions.PolymorphicDslFrameworkException;
import com.pdsl.exceptions.PolymorphicDslTestResourceException;
import com.pdsl.executors.TraceableTestRunExecutor;
```

### UNUSED_IMPORT
Unused import `import org.antlr.v4.runtime.tree.ParseTreeListener;`
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.junit.Test;
import org.junit.runner.notification.Failure;
```

### UNUSED_IMPORT
Unused import `import java.net.MalformedURLException;`
in `src/main/java/com/pdsl/specifications/FileSystemTestResourceFinder.java`
#### Snippet
```java

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/specifications/FileSystemTestResourceFinder.java`
#### Snippet
```java
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import java.net.MalformedURLException;`
in `src/main/java/com/pdsl/specifications/LineDelimitedTestSpecificationFactory.java`
#### Snippet
```java
import javax.inject.Provider;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/specifications/LineDelimitedTestSpecificationFactory.java`
#### Snippet
```java
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/specifications/TestResourceFinder.java`
#### Snippet
```java

import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `src/main/java/com/pdsl/specifications/TestSpecification.java`
#### Snippet
```java
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.runners.TestSpecificationFactoryGenerator;`
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java
package com.pdsl.testcases;

import com.pdsl.runners.TestSpecificationFactoryGenerator;
import com.pdsl.specifications.LineDelimitedTestSpecificationFactory;
import com.pdsl.specifications.PolymorphicDslTransformationException;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.specifications.LineDelimitedTestSpecificationFactory;`
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java

import com.pdsl.runners.TestSpecificationFactoryGenerator;
import com.pdsl.specifications.LineDelimitedTestSpecificationFactory;
import com.pdsl.specifications.PolymorphicDslTransformationException;
import com.pdsl.specifications.TestSpecification;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
          if (operationalReportData_.isEmpty()) {
            operationalReportData_ = other.operationalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationalReportDataIsMutable();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
            operationalReportDataBuilder_ = null;
            operationalReportData_ = other.operationalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operationalReportData_ = java.util.Collections.unmodifiableList(operationalReportData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operationalReportData_ = operationalReportData_;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationalReportDataBuilder_.clear();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000002)` could be simplified to 'bitField0_ \&= \~0x00000002'
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          tacticalReportData_ = java.util.Collections.unmodifiableList(tacticalReportData_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tacticalReportData_ = tacticalReportData_;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000002)` could be simplified to 'bitField0_ \&= \~0x00000002'
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
          if (tacticalReportData_.isEmpty()) {
            tacticalReportData_ = other.tacticalReportData_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTacticalReportDataIsMutable();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000002)` could be simplified to 'bitField0_ \&= \~0x00000002'
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            tacticalReportDataBuilder_ = null;
            tacticalReportData_ = other.tacticalReportData_;
            bitField0_ = (bitField0_ & ~0x00000002);
            tacticalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000002)` could be simplified to 'bitField0_ \&= \~0x00000002'
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        tacticalReportDataBuilder_.clear();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000002)` could be simplified to 'bitField0_ \&= \~0x00000002'
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000020)` could be simplified to 'bitField0_ \&= \~0x00000020'
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder clearFilteredPhraseBody() {
      filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000020)` could be simplified to 'bitField0_ \&= \~0x00000020'
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        filteredPhraseBody_ = filteredPhraseBody_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.filteredPhraseBody_ = filteredPhraseBody_;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000020)` could be simplified to 'bitField0_ \&= \~0x00000020'
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        if (filteredPhraseBody_.isEmpty()) {
          filteredPhraseBody_ = other.filteredPhraseBody_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureFilteredPhraseBodyIsMutable();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000020)` could be simplified to 'bitField0_ \&= \~0x00000020'
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

      filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      phrasesSkippedDueToFailure_ = 0;

```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder clearUnfilteredPhraseBody() {
      unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        if (unfilteredPhraseBody_.isEmpty()) {
          unfilteredPhraseBody_ = other.unfilteredPhraseBody_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUnfilteredPhraseBodyIsMutable();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        unfilteredPhraseBody_ = unfilteredPhraseBody_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.unfilteredPhraseBody_ = unfilteredPhraseBody_;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      super.clear();
      unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableContextToTestCases().clear();
      return this;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        technicalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          technicalReportData_ = java.util.Collections.unmodifiableList(technicalReportData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.technicalReportData_ = technicalReportData_;
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
          if (technicalReportData_.isEmpty()) {
            technicalReportData_ = other.technicalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTechnicalReportDataIsMutable();
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
            technicalReportDataBuilder_ = null;
            technicalReportData_ = other.technicalReportData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            technicalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
```

### ReplaceAssignmentWithOperatorAssignment
`bitField0_ = (bitField0_ & ~0x00000001)` could be simplified to 'bitField0_ \&= \~0x00000001'
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        technicalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        technicalReportDataBuilder_.clear();
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                        logger.warn(String.format("%sFiltering out phrase:%n%s%nLexed as:%n\t%s%s%n",
                                AnsiTerminalColorHelper.BRIGHT_RED, baos.toString(), allTokens.stream().map(token -> {
                                    return String.format("%s,\t%s", token, pdslLexer.getVocabulary().getSymbolicName(token.getType()));
                                }).collect(Collectors.joining(String.format("%n\t"))), AnsiTerminalColorHelper.RESET));
                    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
                    String filteredTokens = allTokens.stream()
                                    .map(token -> {
                                        return String.format("\t%s: %s", pdslLexer.getVocabulary().getSymbolicName(token.getType()), token);
                                    })
                                    .collect(Collectors.joining(String.format("%n")));
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `failedResults` are queried, but never updated
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java

    class FailedTestResults extends RuntimeException {
        private Collection<TestResult> failedResults;
        public FailedTestResults(Collection<TestResult> failedResults) {
            super("At least one child test failed during execution!", failedResults.stream()
```

### MismatchedCollectionQueryUpdate
Contents of collection `results` are updated, but never queried
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
    private final Provider<? extends TestCaseFactory> testCaseFactoryProvider;
    private final Provider<? extends TraceableTestRunExecutor> testRunExecutor;
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
    private final Provider<? extends TestResourceFinderGenerator> resourceFinderGenerator;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'PdslGherkinHelperAnnotation' implements annotation interface `PdslConfiguration`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinHelperAnnotation.java`
#### Snippet
```java
import java.util.Objects;

class PdslGherkinHelperAnnotation implements Annotation, PdslConfiguration {
    private final PdslGherkinApplication annotation;
    PdslGherkinHelperAnnotation(PdslGherkinApplication annotation) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
public final class StrategicReportDataOuterClass {
  private StrategicReportDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/pdsl/transformers/PdslErrorListener.java`
#### Snippet
```java

class PdslErrorListener implements ANTLRErrorListener {
    private boolean errorFound = false;

    public boolean isErrorFound() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java

    private static class Accumulator {
        private int testNumber = 0;
        public int nextInt() {
            return testNumber++;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/pdsl/reports/DefaultTestResult.java`
#### Snippet
```java
    private final TechnicalReportData.Status status;
    private final TestCase testCase;
    private int phrasesSkippedDueToFailure = 0;
    private int passingPhraseTotal = 0;
    private Optional<Phrase> failingPhrase = Optional.empty();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/pdsl/reports/DefaultTestResult.java`
#### Snippet
```java
    private final TestCase testCase;
    private int phrasesSkippedDueToFailure = 0;
    private int passingPhraseTotal = 0;
    private Optional<Phrase> failingPhrase = Optional.empty();
    private Optional<Throwable> failureReason = Optional.empty();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    private int status_ = 0;
    /**
     * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Annotation`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinHelperAnnotation.java`
#### Snippet
```java
import java.util.Objects;

class PdslGherkinHelperAnnotation implements Annotation, PdslConfiguration {
    private final PdslGherkinApplication annotation;
    PdslGherkinHelperAnnotation(PdslGherkinApplication annotation) {
```

### RedundantImplements
Redundant interface declaration `TestRunResults`
in `src/main/java/com/pdsl/reports/PolymorphicDslTestRunResults.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class PolymorphicDslTestRunResults implements TestRunResults, MetadataTestRunResults, ReportListener {

    private final List<OutputStream> dslReports;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-06-19-54-41.482.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `FailedTestResults` does not end with 'Exception'
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java
    int totalFilteredDuplicateTests();

    class FailedTestResults extends RuntimeException {
        private Collection<TestResult> failedResults;
        public FailedTestResults(Collection<TestResult> failedResults) {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `failedResults` of exception class
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java

    class FailedTestResults extends RuntimeException {
        private Collection<TestResult> failedResults;
        public FailedTestResults(Collection<TestResult> failedResults) {
            super("At least one child test failed during execution!", failedResults.stream()
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java
                    .map(Arrays::asList)
                    .flatMap(List::stream)
                    .collect(Collectors.toList())
                    .toArray();
        }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/pdsl/runners/EmptyRecognizerLexer.java`
#### Snippet
```java
    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/pdsl/runners/EmptyRecognizerParser.java`
#### Snippet
```java
    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/pdsl/runners/EmptyRecognizerParser.java`
#### Snippet
```java
    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                    for (int i=0; i < parser.get().getTokenStream().size(); i++) {
                        Token token = parser.get().getTokenStream().get(i);
                        Lexer lexer = (Lexer) lexerClass.getDeclaredConstructor(CharStream.class).newInstance(CharStreams.fromStream(new ByteArrayInputStream(new byte[0])));
                        String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());
                        parsedTokens.append(String.format("%sType: %s%s%n%s%n%n%s", AnsiTerminalColorHelper.BRIGHT_RED, tokenType, AnsiTerminalColorHelper.RED,  token,AnsiTerminalColorHelper.RESET));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor =
      getDescriptor().getMessageTypes().get(0);
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                Parser syntaxParser = parser.get();
                // Get any helpful error messages using ANTLR4s default error correcting strategy
                syntaxRule.invoke(parserClass.cast(syntaxParser), null);
                bufferdInputStream.reset();
                // Run again and crash with a runtime exception if anything is incorrect
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                // Run again and crash with a runtime exception if anything is incorrect
                Optional<Parser> strictParser = parserOf(bufferdInputStream, ErrorListenerStrategy.GRAMMAR, parserClass, lexerClass);
                syntaxRule.invoke(parserClass.cast(strictParser.get()), null);
            } catch (IllegalAccessException | IOException e) {
                throw new PolymorphicDslTransformationException("Unable to check the syntax of the test resource!",
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
            // Remove error messages. These are provided in check grammar.
            parser.removeErrorListeners();
            return (ParseTree) subgrammarActivePhraseRule.invoke(parser, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new PolymorphicDslTransformationException("Could not make parse tree from phrase!", e);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `testCases` initializer `null` is redundant
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
            notifier.fireTestStarted(describeChild(method));
            RecognizedBy recognizedBy = method.getAnnotation(RecognizedBy.class);
            Collection<TestCase> testCases = null;
            try {
                testCases = recognizedBy == null ? getTestCases(pdslTest) : getTestCases(pdslTest, recognizedBy);
```

### UnusedAssignment
Variable `background` initializer `Optional.empty()` is redundant
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final List<PickleJarScenario> scenarios;
        private Optional<String> longDescription = Optional.empty();
        private Optional<GherkinBackground> background = Optional.empty();

        private PickleJarRule(Builder builder) {
```

### UnusedAssignment
Variable `longDescription` initializer `Optional.empty()` is redundant
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final String title;
        private final List<PickleJarScenario> scenarios;
        private Optional<String> longDescription = Optional.empty();
        private Optional<GherkinBackground> background = Optional.empty();

```

### UnusedAssignment
The value `builder.tags` assigned to `this.tags` is never used
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java

        private PickleJarScenario(Builder builder) {
            this.tags = builder.tags;
            this.longDescription = builder.longDescription;
            this.tags = builder.tags;
```

### UnusedAssignment
Variable `testCases` initializer `null` is redundant
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
            ExecutorHelper.ParseTreeTraversal traversal = executorHelper.getParseTreeTraversal(pdslTest);
            RecognizedBy recognizedBy = method.getAnnotation(RecognizedBy.class);
            Collection<TestCase> testCases = null;
            try {
                // Use the @RecognizedBy rule if specified, else @PdslConfiguration if specified, else default
```

### UnusedAssignment
Variable `accumulator` initializer `1` is redundant
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
    private final List<MetadataTestRunResults> metadataTestRunResults;

    private int accumulator = 1;

    PdslExecutorRunner(Class<?> testClass, ParseTreeListener parseTreeListener, Collection<TestCase> testCases, TraceableTestRunExecutor executor, String context) throws InitializationError {
```

### UnusedAssignment
Variable `passingPhraseTotal` initializer `0` is redundant
in `src/main/java/com/pdsl/reports/DefaultTestResult.java`
#### Snippet
```java
    private final TestCase testCase;
    private int phrasesSkippedDueToFailure = 0;
    private int passingPhraseTotal = 0;
    private Optional<Phrase> failingPhrase = Optional.empty();
    private Optional<Throwable> failureReason = Optional.empty();
```

### UnusedAssignment
The value `TestSpecificationHelper.checkGrammarValidity(recognizerParser.get(), recognizerLexer.get(), stepBodyAsStrings,
recognizerRule.isPresent() ? recognizerRule.get() : PdslTest.DEFAULT_ALL_RULE)` assigned to `stepBodyAsStrings` is never used
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private void checkGrammar(List<InputStream> stepBodyAsStrings) {
        if (recognizerParser.isPresent() && recognizerLexer.isPresent()) {
            stepBodyAsStrings = TestSpecificationHelper.checkGrammarValidity(recognizerParser.get(), recognizerLexer.get(), stepBodyAsStrings,
                    recognizerRule.isPresent() ? recognizerRule.get() : PdslTest.DEFAULT_ALL_RULE);
        }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                // Run again and crash with a runtime exception if anything is incorrect
                Optional<Parser> strictParser = parserOf(bufferdInputStream, ErrorListenerStrategy.GRAMMAR, parserClass, lexerClass);
                syntaxRule.invoke(parserClass.cast(strictParser.get()), null);
            } catch (IllegalAccessException | IOException e) {
                throw new PolymorphicDslTransformationException("Unable to check the syntax of the test resource!",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/pdsl/runners/junit/PdslStatement.java`
#### Snippet
```java
        }
        if (results.failingTestTotal() > 0) {
            throw results.getTestResults().stream().findFirst().get().getFailureReason().orElseThrow();
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
                            walker.walk(phraseRegistry.listener.get(), activePhrase.getParseTree());
                        } else {
                            phraseRegistry.visitor.get().visit(activePhrase.getParseTree());
                        }
                        phraseIndex++;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
            Optional<TestSpecification> stepBodyAsTestSpecification = processStepBody(pickleJarScenario.getTitleWithSubstitutions(), pickleJarScenario.getStepsWithSubstitutions(), originalSourceLocation);
            if (stepBodyAsTestSpecification.isPresent()) {
                topLevelScenario.withTestPhrases(stepBodyAsTestSpecification.get().getFilteredPhrases().get());
            } else { // Failure to parse step body
                // Logging on failure should be handled by the stepBodyHelperFactory
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `traceableReportGenerator == null` is always `false`
in `src/main/java/com/pdsl/runners/PdslTestSuite.java`
#### Snippet
```java
                try {
                    TraceableReportGenerator traceableReportGenerator = reportGeneratorClass.getDeclaredConstructor().newInstance();
                    if (traceableReportGenerator == null)  {
                        throw new InstantiationException("The TraceableReportGenerator Provider returned a null value!");
                    }
```

### ConstantValue
Value `location` is always 'null'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
            Preconditions.checkArgument(location == null, LOCATION_ERROR);
            // preconditions on argument delayed until building
            this.location = location;
        }

```

### ConstantValue
Condition `result` is always `true`
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getOperationalReportDataList()
        .equals(other.getOperationalReportDataList());
    result = result && unknownFields.equals(other.unknownFields);
```

### ConstantValue
Condition `childMetaData.isEmpty()` is always `true` when reached
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java
        if (parentMetaData.isPresent() && childMetaData.isPresent()) {
            childMetaData = Optional.of(combineMetadata(parentMetaData.get(), childMetaData.get()));
        } else if (parentMetaData.isPresent() && childMetaData.isEmpty()) {
            childMetaData = parentMetaData;
        }
```

### ConstantValue
Condition `pdslConfiguration != null` is always `true`
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
                String syntaxCheck = recognizedBy != null && recognizedBy.recognizerRule() != null
                        ? recognizedBy.recognizerRule()
                        : pdslConfiguration != null && pdslConfiguration.recognizerRule() != null
                            ? pdslConfiguration.recognizerRule() : RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
                final PolymorphicDslPhraseFilter phraseFilter;
```

### ConstantValue
Condition `result` is always `true`
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getApplication()
        .equals(other.getApplication());
    result = result && getTacticalReportDataList()
```

### ConstantValue
Condition `result` is always `true`
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getTestCaseTitle()
        .equals(other.getTestCaseTitle());
    result = result && status_ == other.status_;
```

### ConstantValue
Condition `result` is always `true`
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    boolean result = true;
    result = result && getTechnicalReportDataList()
        .equals(other.getTechnicalReportDataList());
    result = result && unknownFields.equals(other.unknownFields);
```

### ConstantValue
Condition `result` is always `true`
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getUnfilteredPhraseBodyList()
        .equals(other.getUnfilteredPhraseBodyList());
    result = result && internalGetContextToTestCases().equals(
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
                    cellText.append(c == 'n' ? "\n" : c);
                } else { // False escape
                    cellText.append("\\" + c);
                }
                possibleEscapeCharacter = false;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
            String errorType = phrasesFilteredOut == testContent.size() ? "All phrases were filtered out of a test!" : "A test entirely failed to be parsed!";
            StringBuilder errorMessage = new StringBuilder(AnsiTerminalColorHelper.BRIGHT_YELLOW + errorType + RESET_ANSI);
            errorMessage.append(BOLD + "\n\tParser Context: " + RESET_ANSI + subgrammarParserConstructor.getName());
            String message = errorMessage.toString();
            logger.warn(message);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
            if (step.getDocString().isPresent()) {
                GherkinString docString = step.getDocString().get().getGherkinString();
                substitutedStep.append("\n" + docString.getStringWithSubstitutions(substitutions));
            } else if (step.getDataTable().isPresent()) { //TODO: Maybe we should be storing the raw text of the data table as well to simplify this?
                // Perform all substitutions
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        StringBuilder backgroundText = new StringBuilder();
        if (background.getTitle().isPresent()) {
            backgroundText.append(background.getTitle().get().getRawString() + "\n");
        }
        if (background.getLongDescription().isPresent()) {
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
        if (docString.isPresent()) {
            str.append(docString.get().getGherkinString().getRawString());
        } else if (dataTable.isPresent()) {
            str.append(dataTable.get().toString());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
        this.title = builder.title.isEmpty() ? Optional.empty() : Optional.of(builder.title);
        this.rules = builder.rules.isEmpty() ? Optional.empty() : Optional.of(builder.rules);
        this.tags = builder.tags.isEmpty() ? Optional.empty() : builder.tags;
        this.location = builder.location;
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java

    public Optional<GherkinFeature> getGherkinFeature(URI featurePathOrId) {
        return builderOptional.isEmpty() ? Optional.empty() : Optional.of(builderOptional.get().withLocation(featurePathOrId).build());
    }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/specifications/GlobPathMatcher.java`
#### Snippet
```java
    @Override
    public boolean matches(Path path) {
        if (excludes.isPresent()) {
            return includes.stream().anyMatch(matcher -> matcher.matches(path))
                    && excludes.get().stream().noneMatch(matcher -> matcher.matches(path));
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
        // Find the files we will be testing
        Optional<Collection<URI>> resources = finder.scanForTestResources(Paths.get(resourceRoot).toUri());
        if (resources.isPresent()) {
            testResources.addAll(resources.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
        if (recognizerParser.isPresent() && recognizerLexer.isPresent()) {
            testContextForfiltering = TestSpecificationHelper.checkGrammarValidity(recognizerParser.get(), recognizerLexer.get(), testContent,
                    syntaxRuleName.isPresent() ? syntaxRuleName.get() : RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME);
        }
        List<FilteredPhrase> filteredPhrases = new ArrayList<>();
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java
        // Add phrases in this node if present
        if (testSpecification.getFilteredPhrases().isPresent()) {
            childTestBodyFragments.add(new TestBodyFragment(childMetaData.isPresent() ? childMetaData.get() : null, testSpecification.getFilteredPhrases().get()));
        }
        // Add phrases in child node if present
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/specifications/LineDelimitedTestSpecificationFactory.java`
#### Snippet
```java
                        .collect(Collectors.toList());
                Optional<List<FilteredPhrase>> parseTreesOptional = phraseFilter.filterPhrases(lines);
                if (parseTreesOptional.isPresent()) {
                    testSpecifications.add(new DefaultTestSpecification.Builder(uri.toString(), uri)
                            .withPhrases(parseTreesOptional.get())
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/specifications/FileDelimitedTestSpecificationFactory.java`
#### Snippet
```java
        Optional<List<FilteredPhrase>> parseTreesOptional =
            phraseFilter.filterPhrases(List.of(combined));
        if (parseTreesOptional.isPresent()) {
          testSpecifications.add(
              new DefaultTestSpecification.Builder(uri.toString(), uri)
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
        Preconditions.checkNotNull(child,
                "A null test case was created somehow! No way to run!");
            PdslStatement statement = parseTreeListener.isPresent()
                    ? new PdslStatement(List.of(child), parseTreeListener.get(), context, executor)
                    : new PdslStatement(List.of(child), parseTreeVisitor.orElseThrow(), context, executor);
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        if (recognizerParser.isPresent() && recognizerLexer.isPresent()) {
            stepBodyAsStrings = TestSpecificationHelper.checkGrammarValidity(recognizerParser.get(), recognizerLexer.get(), stepBodyAsStrings,
                    recognizerRule.isPresent() ? recognizerRule.get() : PdslTest.DEFAULT_ALL_RULE);
        }
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
                logger.debug("%sRule Background%s in %s", AnsiTerminalColorHelper.CYAN,  AnsiTerminalColorHelper.RESET, rule.getTitle());
                Optional<List<FilteredPhrase>> filteredBackgroundStepBody = processStepBodyContent(bg.getSteps().orElseThrow());
                if (filteredBackgroundStepBody.isPresent()) {
                    ruleBuilder.withTestPhrases(filteredBackgroundStepBody.get());
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
                logger.info( "%sTop level%s Background%s in %s%s", AnsiTerminalColorHelper.CYAN,  AnsiTerminalColorHelper.BRIGHT_CYAN, AnsiTerminalColorHelper.RESET, pickleJar.getLocation());
                Optional<List<FilteredPhrase>> filteredBackgroundStepBody = processStepBodyContent(bg.getSteps().get());
                if (filteredBackgroundStepBody.isPresent()) {
                    featureBuilder.withTestPhrases(filteredBackgroundStepBody.get());
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        });
        Optional<List<FilteredPhrase>> phrases = phraseFilter.filterPhrases(stepBodyAsInputStream);
        if (phrases.isPresent()) {
            return Optional.of(new DefaultTestSpecification.Builder(title, originalResourceLocation).withPhrases(phrases.get()).build());
        } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        for (TestSpecification specification : testSpecification) {
            Optional<TestSpecification> filteredValue = recursivelyGetTagsAndFilterPickles(specification, allPickleTags, tagExpression, specification.getOriginalTestResource());
            if (filteredValue.isPresent()) {
                filteredSpecifications.add(filteredValue.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
                        recursivelyGetTagsAndFilterPickles(childTestSpecification,
                                allGherkinItemTags, tagExpression, originalSourceLocation);
                if (filteredChildTestOptional.isPresent()) {
                    filteredChildren.add(filteredChildTestOptional.get());
                }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PdslConfigurationHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
 * This is purely for use of the PDSL framework and has no direct value to users of the framework.
 */
public class PdslConfigurationHelper {

    private static final ExecutorHelper INSTANCE = new ExecutorHelper();
```

## RuleId[id=DoubleNegation]
### DoubleNegation
Double negation in `(ctx.NOT() != null) != visitExpr(ctx.expr())`
in `src/main/java/com/pdsl/gherkin/filter/GherkinTagsVisitorImpl.java`
#### Snippet
```java
    @Override
    public Boolean visitNot(GherkinTagsParser.NotContext ctx) {
        return (ctx.NOT() != null) != visitExpr(ctx.expr());
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
        String[] classNameComponents = clazz.getName().split("\\.");
        return classNameComponents[classNameComponents.length - 1];
    };

    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
            Preconditions.checkArgument(location == null, LOCATION_ERROR);
            // preconditions on argument delayed until building
            this.location = location;
        }

```

### DataFlowIssue
Casting `failedResults.stream().map(...).filter(...).map(...).map(...).map(...).flatMap(...).collect(...).toA ...` to `StackTraceElement[]` will produce `ClassCastException` for any non-null value
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java
        @Override
        public StackTraceElement[] getStackTrace() {
            return (StackTraceElement[]) failedResults.stream()
                    .map(TestResult::getFailureReason)
                    .filter(Optional::isPresent)
```

### DataFlowIssue
Method invocation `isEmpty` will produce `NullPointerException`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java

            public Builder(String title, List<PickleJarScenario> scenarios) {
                Preconditions.checkArgument(title != null || title.isEmpty(), "Title cannot be null or empty!");
                this.title = title;
                this.scenarios = scenarios;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            this.tags = builder.tags;
            this.longDescription = builder.longDescription;
            this.tags = builder.tags;
            this.scenarioTitleWithParameterSubstitutionsIfNeeded = builder.titleWithSubstitutions;
            this.stepsWithParameterSubstitutionsIfNeeded = builder.stepsWithSubstitutions;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
                            throw new IllegalArgumentException("Illegal tags. Got confused by " + rawTag);
                        }
                        buildingTag = true;
                        break;
                }
```

### DataFlowIssue
Method invocation `getParseTree` may produce `NullPointerException`
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
                }
            } catch (Throwable e) {
                notifyStreams((AnsiTerminalColorHelper.BRIGHT_RED + activePhrase.getParseTree().getText() + "\n" + AnsiTerminalColorHelper.RESET).getBytes(charset));
                int phrasesSkippedDueToFailure = 0;
                while (testBody.hasNext()) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
        this.testCases = new ArrayList<>(testCases);
        metadataTestRunResults = new ArrayList<>(testCases.size());
        accumulator = 1;
        parseTreeListener = Optional.empty();
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
        parseTreeVisitor = Optional.empty();
        metadataTestRunResults = new ArrayList<>(testCases.size());
        accumulator = 1;
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorOperationalReportGenerator.java`
#### Snippet
```java
        long passed = operationalReportData.getTacticalReportDataList().stream()
                .flatMap(tactical -> tactical.getContextToTestCasesMap().entrySet().stream()
                        .map(Map.Entry::getValue))
                .map(TestCaseGroup::getTechnicalReportDataList)
                .flatMap(Collection::stream)
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorOperationalReportGenerator.java`
#### Snippet
```java
        long failed = operationalReportData.getTacticalReportDataList().stream()
                .flatMap(tactical -> tactical.getContextToTestCasesMap().entrySet().stream()
                        .map(Map.Entry::getValue))
                .map(TestCaseGroup::getTechnicalReportDataList)
                .flatMap(Collection::stream)
```

### SimplifyStreamApiCallChains
Can be replaced with '.keySet().stream()'
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorTacticalReportGenerator.java`
#### Snippet
```java
        write(String.format(".Context Ratios for %s%n", names.get(0)));
        // Specific column formatting
        List<String> testContexts = tacticalReportData.getContextToTestCasesMap().entrySet().stream().map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableList());
        StringBuilder contextHeader = new StringBuilder("[options=header, cols=\"h");
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
                pdslExecutorRunner.run(notifier);
                List<MetadataTestRunResults> methodResults = pdslExecutorRunner.getMetadataTestRunResults();
                if (!methodResults.stream().anyMatch(r -> r.failingTestTotal() > 0)) {
                    notifier.fireTestFinished(describeChild(method));
                } else {
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `src/main/java/com/pdsl/reports/TestRunResults.java`
#### Snippet
```java
                    .map(Optional::get)
                    .findFirst().orElseThrow());
            Preconditions.checkArgument(!failedResults.stream().anyMatch(r -> r.getStatus().equals(TechnicalReportData.Status.PASSED)),
                    "A passing test was included with the test results");

```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `src/main/java/com/pdsl/reports/PolymorphicDslTestRunResults.java`
#### Snippet
```java
    @Override
    public int failingTestTotal() {
        return results.stream().filter(testMetadata -> testMetadata.getStatus().equals(TechnicalReportData.Status.FAILED)).collect(Collectors.toList()).size();
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `src/main/java/com/pdsl/reports/PolymorphicDslTestRunResults.java`
#### Snippet
```java
    public int passingTestTotal() {
        return results.stream().filter(metadata -> metadata.getStatus().equals(TechnicalReportData.Status.PASSED))
                .collect(Collectors.toList()).size();
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
        return String.join("\n",  // Separate each row by a line break
                substitutedDataTable.stream().map(row -> "|" + String.join("|", row) + "|") // Separate each cell with a pipe
                        .collect(Collectors.toUnmodifiableList())) + "\n";
    }

```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
                pdslExecutorRunner.run(notifier);
                List<MetadataTestRunResults> methodResults = pdslExecutorRunner.getMetadataTestRunResults();
                if (!methodResults.stream().anyMatch(r -> r.failingTestTotal() > 0)) {
                    notifier.fireTestFinished(describeChild(method));
                } else {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'valueOf' is still used
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`>
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
    }

    public Optional<List<List<GherkinString>>> getDataTable() {
        return dataTable;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`>
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
    private final StepType stepType;
    private final Optional<GherkinDocString> docString;
    private final Optional<List<List<GherkinString>>> dataTable;
    private final String stepKeywordText;
    private final GherkinString stepContent;
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/runners/EmptyTestSpecificationFactory.java`
#### Snippet
```java
class EmptyTestSpecificationFactory implements TestSpecificationFactory, Annotation {
    @Override
    public Optional<Collection<TestSpecification>> getTestSpecifications(Set<URI> testContent) {
        return Optional.empty();
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> scenarios;


```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
    }

    public Optional<List<GherkinScenario>> getScenarios() {
        return scenarios;
    }
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java

    public Collection<TestSpecification> getTestSpecifications(TestSpecificationFactory testSpecificationFactory, Set<URI> testResources, PdslTest pdslTest) {
        Optional<Collection<TestSpecification>> testSpecifications = testSpecificationFactory.getTestSpecifications(testResources);
        if (testSpecifications.isEmpty()) {
            throw new IllegalArgumentException(String.format(
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
    public static class Builder {
        private final String id;
        private Optional<List<FilteredPhrase>> phrases = Optional.empty();
        private Optional<InputStream> metaData = Optional.empty();
        private Optional<List<TestSpecification>> childItems = Optional.empty();
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<TestSpecification>> nestedTestSpecifications() {
        return childItems;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
    private final Optional<List<FilteredPhrase>> phrases;
    private final Optional<InputStream> metaData;
    private final Optional<List<TestSpecification>> childItems;
    private final URI originalTestResource;

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<FilteredPhrase>> getFilteredPhrases() {
        return phrases;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

    private final String id;
    private final Optional<List<FilteredPhrase>> phrases;
    private final Optional<InputStream> metaData;
    private final Optional<List<TestSpecification>> childItems;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
        private Optional<List<FilteredPhrase>> phrases = Optional.empty();
        private Optional<InputStream> metaData = Optional.empty();
        private Optional<List<TestSpecification>> childItems = Optional.empty();
        private final URI originalTestResource;

```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/TestSpecificationFactory.java`
#### Snippet
```java
     * @return TestSpecification if the test content could be processed, empty if not
     */
    Optional<Collection<TestSpecification>> getTestSpecifications(Set<URI> testContent);


```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/testcases/GherkinTestCaseSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<FilteredPhrase>> getFilteredPhrases() {
        return testSpecification.getFilteredPhrases();
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/testcases/GherkinTestCaseSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<TestSpecification>> nestedTestSpecifications() {
        return testSpecification.nestedTestSpecifications();
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
        private List<GherkinScenario> gherkinScenarios = new ArrayList<>();
        private List<GherkinRule> rules = new ArrayList<>();
        private Optional<List<String>> tags = Optional.empty();
				private static final String LOCATION_ERROR = "Location cannot be null!";
        public Builder(URI location) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    }

    public Optional<List<String>> getTags() {
        return tags;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    }

    public Optional<List<GherkinScenario>> getOptionalGherkinScenarios() {
        return optionalGherkinScenarios;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
    private final URI location;

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    }

    public Optional<List<GherkinRule>> getRules() {
        return rules;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
    private final URI location;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
```

### OptionalContainsCollection
'Optional' contains collection `Map`>
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
    }

    public Optional<Map<String, List<String>>> getTable() {
        return table;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java

public class GherkinExamplesTable {
    private final Optional<List<String>> tags;
    private final Optional<String> title;
    private final Optional<String> longDescription;
```

### OptionalContainsCollection
'Optional' contains collection `Map`>
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
        private String longDescription = "";
        private List<String> tags = new ArrayList<>();
        private Optional<Map<String, List<String>>> table = Optional.empty();

        public GherkinExamplesTable build() {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
    }

    public Optional<List<String>> getTags() {
        return tags;
    }
```

### OptionalContainsCollection
'Optional' contains collection `Map`>
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<Map<String, List<String>>> table;

    private GherkinExamplesTable(Builder builder) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/GlobPathMatcher.java`
#### Snippet
```java
    private static final String GLOB = "glob:";
    private final List<PathMatcher> includes;
    private final Optional<List<PathMatcher>> excludes;

    private static PathMatcher getMatcher(String expression) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/specifications/GherkinTestSpecificationFactory.java`
#### Snippet
```java

public interface GherkinTestSpecificationFactory extends TestSpecificationFactory {
    Optional<Collection<TestSpecification>> filterGherkinTestSpecificationsByTagExpression(
            Collection<TestSpecification> testSpecification, String tagExpression);
}
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
        Set<URI> testResources = new HashSet<>();
        // Find the files we will be testing
        Optional<Collection<URI>> resources = finder.scanForTestResources(Paths.get(resourceRoot).toUri());
        if (resources.isPresent()) {
            testResources.addAll(resources.get());
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java

    private Collection<TestCase> getTestCases(GherkinTestSpecificationFactory gherkinTestSpecificationFactory, Set<URI> testResources, PdslTest pdslTest) {
        Optional<Collection<TestSpecification>> gherkinTestSpecifications = gherkinTestSpecificationFactory.getTestSpecifications(testResources);
        if (gherkinTestSpecifications.isPresent()) {
            gherkinTestSpecifications = gherkinTestSpecificationFactory.filterGherkinTestSpecificationsByTagExpression(
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/specifications/GherkinTestSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<TestSpecification>> nestedTestSpecifications() {
        return testSpecification.nestedTestSpecifications();
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/specifications/GherkinTestSpecification.java`
#### Snippet
```java

    @Override
    public Optional<List<FilteredPhrase>> getFilteredPhrases() {
        return testSpecification.getFilteredPhrases();
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    }

    public Optional<List<GherkinStep>> getStepsList() {
        return stepsList;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
    private final Optional<List<GherkinExamplesTable>> examples;

    public GherkinScenario(Builder builder) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
    private final Optional<List<GherkinExamplesTable>> examples;

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java

public class GherkinScenario {
    private final Optional<List<String>> tags;
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    public static class Builder {
        private final List<GherkinExamplesTable> examples = new ArrayList<>();
        private Optional<List<String>> tags = Optional.empty();
        private String title = "";
        private String longDescription = "";
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    }

    public Optional<List<GherkinExamplesTable>> getExamples() {
        return examples;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
        private String title = "";
        private String longDescription = "";
        private Optional<List<GherkinStep>> stepsList = Optional.empty();

        public GherkinScenario build() {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    }

    public Optional<List<String>> getTags() {
        return tags;
    }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            private final String titleWithSubstitutions;
            private final List<String> stepsWithSubstitutions;
            private Optional<Set<String>> tags = Optional.empty();
            private Optional<String> longDescription = Optional.empty();

```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        }

        public Optional<Set<String>> getTags() {
            return tags;
        }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final Optional<String> longDescription;
        private final List<String> stepsWithParameterSubstitutionsIfNeeded;
        private Optional<Set<String>> tags;

        private PickleJarScenario(Builder builder) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java

    @Override
    public Optional<List<FilteredPhrase>> filterPhrases(List<InputStream> testContent) {
        // Avoid changing the reference of the above variable to the streams we create here
        List<InputStream> testContextForfiltering = testContent;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/transformers/PolymorphicDslPhraseFilter.java`
#### Snippet
```java
     * @return An optional containing the FilteredPhrases which indicate whether or not they were recognized by the grammar
     */
    Optional<List<FilteredPhrase>> filterPhrases(List<InputStream> testInput);

}
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/TestSpecification.java`
#### Snippet
```java
     * @return An optional containing a collection of child TestItems if this TestItem is high level or empty if not
     */
    Optional<List<TestSpecification>> nestedTestSpecifications();

    /**
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/TestSpecification.java`
#### Snippet
```java
     * not
     */
    Optional<List<FilteredPhrase>> getFilteredPhrases();

    /**
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/reports/PolymorphicDslTestRunResults.java`
#### Snippet
```java

    @Override
    public Optional<List<TestResult>> duplicateTestSpecifications() {
        if (duplicateTestResults.isEmpty()) {
            return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/LineDelimitedTestSpecificationFactory.java`
#### Snippet
```java
    }

    public Optional<Collection<TestSpecification>> getTestSpecifications(Set<URI> resourceLocations) {
        Objects.requireNonNull(resourceLocations, "Resource paths cannot be null!");
        Preconditions.checkArgument(!resourceLocations.isEmpty(), "Test Resources cannot be empty!");
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/LineDelimitedTestSpecificationFactory.java`
#### Snippet
```java
                        .map(line -> new ByteArrayInputStream(line.getBytes(charset)))
                        .collect(Collectors.toList());
                Optional<List<FilteredPhrase>> parseTreesOptional = phraseFilter.filterPhrases(lines);
                if (parseTreesOptional.isPresent()) {
                    testSpecifications.add(new DefaultTestSpecification.Builder(uri.toString(), uri)
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java
    }

    public Optional<List<GherkinStep>> getSteps() {
        return steps;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> steps;

    public GherkinBackground(Builder builder) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
            notifier.fireTestStarted(describeChild(method));
            TestResourceFinder resourceFinder = resourceFinderGenerator.get().get(pdslTest.includesResources(), pdslTest.excludesResources());
            Optional<Collection<URI>> resources = resourceFinder.scanForTestResources(Paths.get(pdslConfiguration.resourceRoot()).toUri());
            if (resources.isEmpty()) {
                throw new PolymorphicDslTestResourceException(String.format("No test resources found!%n\tResource Finder Generator:%s%n\tResource Root:%s",
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/FileDelimitedTestSpecificationFactory.java`
#### Snippet
```java
  }
  @Override
  public Optional<Collection<TestSpecification>> getTestSpecifications(Set<URI> resourceLocations) {
    Objects.requireNonNull(resourceLocations, "Resource paths cannot be null!");
    Preconditions.checkArgument(!resourceLocations.isEmpty(), "Test Resources cannot be empty!");
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/specifications/FileDelimitedTestSpecificationFactory.java`
#### Snippet
```java
          throw new IllegalArgumentException(String.format("The input was empty!%nFile: %s", uri));
        }
        Optional<List<FilteredPhrase>> parseTreesOptional =
            phraseFilter.filterPhrases(List.of(combined));
        if (parseTreesOptional.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/TestResourceFinder.java`
#### Snippet
```java
     * @return an optional collection of URIs that map to relevant test resources.
     */
    Optional<Collection<URI>> scanForTestResources(URI uri);
}

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/reports/MetadataTestRunResults.java`
#### Snippet
```java

    /** Returns the number of tests that turned into duplicates after being filtered by PDSL. */
    Optional<List<TestResult>> duplicateTestSpecifications();
    String getContext();
}
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/FileSystemTestResourceFinder.java`
#### Snippet
```java
    }

    public Optional<Collection<URI>> scanForTestResources(Path path) {
        return scanForTestResources(path.toUri());
    }
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/specifications/FileSystemTestResourceFinder.java`
#### Snippet
```java

    @Override
    public Optional<Collection<URI>> scanForTestResources(URI uri) {
        Path sourceDirectory = Paths.get(uri.getPath());
        Preconditions.checkArgument(Files.exists(sourceDirectory), String.format("File did not exist at at this location! %s", uri));
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    }

    private Optional<List<FilteredPhrase>> processStepBodyContent(List<GherkinStep> stepBody) {
        List<InputStream> stepBodyAsStrings = stepBody.stream()
                .map(GherkinStep::getFullRawStepText)
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
                addBytesWithCorrectEncoding(ruleMetaData, getBackgroundText(bg));
                logger.debug("%sRule Background%s in %s", AnsiTerminalColorHelper.CYAN,  AnsiTerminalColorHelper.RESET, rule.getTitle());
                Optional<List<FilteredPhrase>> filteredBackgroundStepBody = processStepBodyContent(bg.getSteps().orElseThrow());
                if (filteredBackgroundStepBody.isPresent()) {
                    ruleBuilder.withTestPhrases(filteredBackgroundStepBody.get());
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java

    @Override
    public Optional<Collection<TestSpecification>> getTestSpecifications(Set<URI> testContent) {
        Preconditions.checkArgument(testContent != null && !testContent.isEmpty(), "filepaths cannot be null or empty!");
        List<TestSpecification> featureTestSpecifications = new ArrayList<>();
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
                addBytesWithCorrectEncoding(featureMetaData, getBackgroundText(bg));
                logger.info( "%sTop level%s Background%s in %s%s", AnsiTerminalColorHelper.CYAN,  AnsiTerminalColorHelper.BRIGHT_CYAN, AnsiTerminalColorHelper.RESET, pickleJar.getLocation());
                Optional<List<FilteredPhrase>> filteredBackgroundStepBody = processStepBodyContent(bg.getSteps().get());
                if (filteredBackgroundStepBody.isPresent()) {
                    featureBuilder.withTestPhrases(filteredBackgroundStepBody.get());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
            }
        });
        Optional<List<FilteredPhrase>> phrases = phraseFilter.filterPhrases(stepBodyAsInputStream);
        if (phrases.isPresent()) {
            return Optional.of(new DefaultTestSpecification.Builder(title, originalResourceLocation).withPhrases(phrases.get()).build());
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java

    @Override
    public Optional<Collection<TestSpecification>> filterGherkinTestSpecificationsByTagExpression(Collection<TestSpecification> testSpecification, String tagExpression) {
        if (tagExpression == null || tagExpression.isEmpty()) {
            return Optional.of(testSpecification);
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java
                                                                ParseTreeListener grammarListener) {
        // Use the file locations and convert the feature files to test specifications
        Optional<Collection<TestSpecification>> testSpecificationOptional = testSpecificationFactory.getTestSpecifications(testResources);
        if (testSpecificationOptional.isEmpty()) {
            throw new IllegalStateException("Test resources could not be converted to a Test Specification");
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java
        }
        // If tag expressions were provided filter the test specification
        Optional<Collection<TestSpecification>> filteredSpecification =
                testSpecificationFactory.filterGherkinTestSpecificationsByTagExpression(testSpecificationOptional.get(), tagExpression);
        if (filteredSpecification.isEmpty()) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java

    public MetadataTestRunResults runTestsWithMetadata(Set<URI> resources, String tagExpression, ParseTreeListener subgrammarListener, String context) {
        Optional<Collection<TestSpecification>> specification = testSpecificationFactory.getTestSpecifications(resources);
        if (specification.isEmpty()) {
            logger.warn("No resources could be converted to a test specification!");
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java
            return new PolymorphicDslTestRunResults(new PdslThreadSafeOutputStream(), context);
        }
        Optional<Collection<TestSpecification>> filteredSpecification =
                testSpecificationFactory.filterGherkinTestSpecificationsByTagExpression(specification.get(), tagExpression);
        if (filteredSpecification.isEmpty()) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `src/main/java/com/pdsl/gherkin/executors/GherkinTestExecutor.java`
#### Snippet
```java

    public MetadataTestRunResults runTestsWithMetadata(Set<URI> resources, ParseTreeListener subgrammarListener, String context) {
        Optional<Collection<TestSpecification>> specification = testSpecificationFactory.getTestSpecifications(resources);
        if (specification.isEmpty()) {
            logger.warn("No resources could be converted to a test specification!");
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `mergeFrom()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.StrategicReportData other) {
      if (other == com.pdsl.reports.proto.StrategicReportData.getDefaultInstance()) return this;
      if (operationalReportDataBuilder_ == null) {
```

### MethodOverloadsParentMethod
Method `mergeFrom()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.OperationalReportData other) {
      if (other == com.pdsl.reports.proto.OperationalReportData.getDefaultInstance()) return this;
      if (!other.getApplication().isEmpty()) {
```

### MethodOverloadsParentMethod
Method `mergeFrom()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TechnicalReportData other) {
      if (other == com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance()) return this;
      if (!other.getTestCaseTitle().isEmpty()) {
```

### MethodOverloadsParentMethod
Method `mergeFrom()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TestCaseGroup other) {
      if (other == com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance()) return this;
      if (technicalReportDataBuilder_ == null) {
```

### MethodOverloadsParentMethod
Method `mergeFrom()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TacticalReportData other) {
      if (other == com.pdsl.reports.proto.TacticalReportData.getDefaultInstance()) return this;
      if (!other.unfilteredPhraseBody_.isEmpty()) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
            str.append(docString.get().getGherkinString().getRawString());
        } else if (dataTable.isPresent()) {
            str.append(dataTable.get().toString());
        }
        return str.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
            List<? extends Token> allTokens = pdslLexer.getAllTokens();
            if (strategy.equals(ErrorListenerStrategy.GRAMMAR) && (allTokens.isEmpty() || errorListener.isErrorFound())) {
                throw new SentenceNotFoundException(String.format("Could not find the following sentence in the grammar:%n<START>%s<END>%n%nCommon errors include:%n\tNot having this sentence in the lexer%n\tForgetting to create a parser rule for this sentence%n\tLeading and trailing whitespace or newlines%n\tOptional End of file (EOF?) tokens needed at the end of your other lexer tokens%n%nTo further troubleshoot you may want to check for \"token recognition error\"s and/or the generated code directory logged earlier", baos.toString()));
            } else {
                if (allTokens.isEmpty()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                    if (strategy.equals(ErrorListenerStrategy.SUBGRAMMAR)) {
                        if (logger.isWarnEnabled()) {
                            logger.warn(String.format("%sFiltering out phrase:%n\t%s%s", AnsiTerminalColorHelper.BRIGHT_CYAN, baos.toString(), AnsiTerminalColorHelper.RESET));
                        }
                        return Optional.empty();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
                        logger.warn(AnsiTerminalColorHelper.BRIGHT_YELLOW + "A line was partially matched! This may indicate an error in the grammar!");
                        logger.warn(String.format("%sFiltering out phrase:%n%s%nLexed as:%n\t%s%s%n",
                                AnsiTerminalColorHelper.BRIGHT_RED, baos.toString(), allTokens.stream().map(token -> {
                                    return String.format("%s,\t%s", token, pdslLexer.getVocabulary().getSymbolicName(token.getType()));
                                }).collect(Collectors.joining(String.format("%n\t"))), AnsiTerminalColorHelper.RESET));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
            if (allTokens.isEmpty()) {
                if (logger.isWarnEnabled()) {
                    logger.warn(String.format("%sFiltering out phrase:%n%s<START>%s%s%s<END>", AnsiTerminalColorHelper.BRIGHT_CYAN, RESET_ANSI, AnsiTerminalColorHelper.BRIGHT_CYAN, baos.toString(), RESET_ANSI));
                }
                return Optional.empty();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
                    logger.warn(String.format("%sA line was partially matched! This may indicate an error in the grammar!%n", AnsiTerminalColorHelper.YELLOW));
                    logger.warn(String.format("The match was:%n%s%s%s", AnsiTerminalColorHelper.BRIGHT_YELLOW, filteredTokens, AnsiTerminalColorHelper.RESET));
                    logger.warn(String.format("%sFiltering out phrase:%n%s%n\tLexer:\t%s%s%n", AnsiTerminalColorHelper.BRIGHT_RED, baos.toString(), pdslLexer.getClass(), RESET_ANSI));
                }
                return Optional.empty();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/pdsl/gherkin/models/GherkinString.java`
#### Snippet
```java
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("There was a problem when doing gherkin string substitutions!%n\tRaw string: <BEGIN>" + rawString + "<END>%n\tSubstitutions: " + substitutions.toString());
        }
        // If we didn't substitute everything in the string it was half formed
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
    private Map<String, List<String>> createSubstitutionMapping(List<List<String>> exampleContent) {
        // See if the rows first column or row contains the keys by convention
        boolean verticalHeaderRow = exampleContent.get(0).get(0).trim().equals("");
        Map<String, List<String>> substitutions = new HashMap<>();
        if (verticalHeaderRow) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
    return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
  }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
      return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'docString'
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java

    private final StepType stepType;
    private final Optional<GherkinDocString> docString;
    private final Optional<List<List<GherkinString>>> dataTable;
    private final String stepKeywordText;
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'dataTable'
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
    private final StepType stepType;
    private final Optional<GherkinDocString> docString;
    private final Optional<List<List<GherkinString>>> dataTable;
    private final String stepKeywordText;
    private final GherkinString stepContent;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'reportGenerator'
in `src/main/java/com/pdsl/runners/PdslTestSuite.java`
#### Snippet
```java
        private final List<Runner> runners;
        private final String systemUnderTest;
        private final Optional<Class<? extends TraceableReportGenerator>> reportGenerator;
        private final Map<String /* Application */,
                Map<String /*Context*/, Collection<MetadataTestRunResults> /*Tests*/>> pdslResults = new HashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'title'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java

public class GherkinRule {
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> scenarios;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'scenarios'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> scenarios;


```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
public class GherkinRule {
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> scenarios;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
        private String title = "";
        private String longDescription = "";
        private Optional<GherkinBackground> background = Optional.empty();

        public GherkinRule build() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'listener'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
    public static class ParseTreeTraversal {
        private final Optional<ParseTreeVisitor<?>> visitor;
        private final Optional<ParseTreeListener> listener;

        public ParseTreeTraversal(ParseTreeVisitor<?> visitor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'classWideParserRecognizerOptional'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
        private final Provider<? extends TestResourceFinderGenerator> resourceFinder;

        private final Optional<Class<? extends Parser>> classWideParserRecognizerOptional;
        private final Optional<Class<? extends Lexer>> classWideLexerRecognizerOptional;
        public PdslProvidersDto(Provider<? extends TestSpecificationFactoryGenerator> testSpecificationFactoryGenerator,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'visitor'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
     */
    public static class ParseTreeTraversal {
        private final Optional<ParseTreeVisitor<?>> visitor;
        private final Optional<ParseTreeListener> listener;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'classWideLexerRecognizerOptional'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java

        private final Optional<Class<? extends Parser>> classWideParserRecognizerOptional;
        private final Optional<Class<? extends Lexer>> classWideLexerRecognizerOptional;
        public PdslProvidersDto(Provider<? extends TestSpecificationFactoryGenerator> testSpecificationFactoryGenerator,
            Provider<? extends TestCaseFactory> testCaseFactoryProvider,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'phrases'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
    public static class Builder {
        private final String id;
        private Optional<List<FilteredPhrase>> phrases = Optional.empty();
        private Optional<InputStream> metaData = Optional.empty();
        private Optional<List<TestSpecification>> childItems = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'childItems'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
    private final Optional<List<FilteredPhrase>> phrases;
    private final Optional<InputStream> metaData;
    private final Optional<List<TestSpecification>> childItems;
    private final URI originalTestResource;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metaData'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
    private final String id;
    private final Optional<List<FilteredPhrase>> phrases;
    private final Optional<InputStream> metaData;
    private final Optional<List<TestSpecification>> childItems;
    private final URI originalTestResource;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'phrases'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java

    private final String id;
    private final Optional<List<FilteredPhrase>> phrases;
    private final Optional<InputStream> metaData;
    private final Optional<List<TestSpecification>> childItems;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metaData'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
        private final String id;
        private Optional<List<FilteredPhrase>> phrases = Optional.empty();
        private Optional<InputStream> metaData = Optional.empty();
        private Optional<List<TestSpecification>> childItems = Optional.empty();
        private final URI originalTestResource;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'childItems'
in `src/main/java/com/pdsl/specifications/DefaultTestSpecification.java`
#### Snippet
```java
        private Optional<List<FilteredPhrase>> phrases = Optional.empty();
        private Optional<InputStream> metaData = Optional.empty();
        private Optional<List<TestSpecification>> childItems = Optional.empty();
        private final URI originalTestResource;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
        private List<GherkinScenario> gherkinScenarios = new ArrayList<>();
        private List<GherkinRule> rules = new ArrayList<>();
        private Optional<List<String>> tags = Optional.empty();
				private static final String LOCATION_ERROR = "Location cannot be null!";
        public Builder(URI location) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'title'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
public class GherkinFeature {
    private final String languageCode;
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
    private final URI location;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
        private String title = "";
        private String longDescription = "";
        private Optional<GherkinBackground> background = Optional.empty();
        private List<GherkinScenario> gherkinScenarios = new ArrayList<>();
        private List<GherkinRule> rules = new ArrayList<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'rules'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
    private final URI location;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'optionalGherkinScenarios'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
    private final Optional<List<String>> tags;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
    private final Optional<List<GherkinRule>> rules;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/models/GherkinFeature.java`
#### Snippet
```java
    private final String languageCode;
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<GherkinBackground> background;
    private final Optional<List<GherkinScenario>> optionalGherkinScenarios;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'builderOptional'
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java

    private static final Set<Character> escapeCharacters = Set.of('\\', '|', 'n');
    private Optional<GherkinFeature.Builder> builderOptional = Optional.empty();

    public Optional<GherkinFeature> getGherkinFeature(URI featurePathOrId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'title'
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
public class GherkinExamplesTable {
    private final Optional<List<String>> tags;
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<Map<String, List<String>>> table;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java

public class GherkinExamplesTable {
    private final Optional<List<String>> tags;
    private final Optional<String> title;
    private final Optional<String> longDescription;
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'table'
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
        private String longDescription = "";
        private List<String> tags = new ArrayList<>();
        private Optional<Map<String, List<String>>> table = Optional.empty();

        public GherkinExamplesTable build() {
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'table'
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<Map<String, List<String>>> table;

    private GherkinExamplesTable(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/models/GherkinExamplesTable.java`
#### Snippet
```java
    private final Optional<List<String>> tags;
    private final Optional<String> title;
    private final Optional<String> longDescription;
    private final Optional<Map<String, List<String>>> table;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'excludes'
in `src/main/java/com/pdsl/specifications/GlobPathMatcher.java`
#### Snippet
```java
    private static final String GLOB = "glob:";
    private final List<PathMatcher> includes;
    private final Optional<List<PathMatcher>> excludes;

    private static PathMatcher getMatcher(String expression) {
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'classWideRecognizerParser'
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final String applicationName;
    private final String resourceRoot;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;
    private final String classWideRecognizerRule;
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'classWideRecognizerLexer'
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final String resourceRoot;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;
    private final String classWideRecognizerRule;
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'title'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
public class GherkinScenario {
    private final Optional<List<String>> tags;
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'examples'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
    private final Optional<List<GherkinExamplesTable>> examples;

    public GherkinScenario(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'stepsList'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
    private final Optional<List<GherkinExamplesTable>> examples;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java

public class GherkinScenario {
    private final Optional<List<String>> tags;
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    private final Optional<List<String>> tags;
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> stepsList;
    private final Optional<List<GherkinExamplesTable>> examples;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
    public static class Builder {
        private final List<GherkinExamplesTable> examples = new ArrayList<>();
        private Optional<List<String>> tags = Optional.empty();
        private String title = "";
        private String longDescription = "";
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'stepsList'
in `src/main/java/com/pdsl/gherkin/models/GherkinScenario.java`
#### Snippet
```java
        private String title = "";
        private String longDescription = "";
        private Optional<List<GherkinStep>> stepsList = Optional.empty();

        public GherkinScenario build() {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            private final String titleWithSubstitutions;
            private final List<String> stepsWithSubstitutions;
            private Optional<Set<String>> tags = Optional.empty();
            private Optional<String> longDescription = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final List<PickleJarScenario> scenarios;
        private Optional<String> longDescription = Optional.empty();
        private Optional<GherkinBackground> background = Optional.empty();

        private PickleJarRule(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
    private final List<PickleJarScenario> scenarios;
    private final List<PickleJarRule> rules;
    private final Optional<String> longDescription;

    public PickleJar(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
    private final String languageCode;
    private final Set<String> featureTags;
    private final Optional<GherkinBackground> background;
    private final List<PickleJarScenario> scenarios;
    private final List<PickleJarRule> rules;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            private final List<String> stepsWithSubstitutions;
            private Optional<Set<String>> tags = Optional.empty();
            private Optional<String> longDescription = Optional.empty();

            public Builder(String titleWithSubstitutions, List<String> stepsWithSubstitutions) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final String title;
        private final List<PickleJarScenario> scenarios;
        private Optional<String> longDescription = Optional.empty();
        private Optional<GherkinBackground> background = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private Set<String> featureTags = new HashSet<>();
        private Optional<GherkinBackground> background = Optional.empty();
        private Optional<String> longDescription = Optional.empty();

        public Builder(URI location, String featureTitle, String languageCode) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            private final List<PickleJarScenario> scenarios;
            private Optional<String> longDescription = Optional.empty();
            private Optional<GherkinBackground> background = Optional.empty();

            public Builder(String title, List<PickleJarScenario> scenarios) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'tags'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final Optional<String> longDescription;
        private final List<String> stepsWithParameterSubstitutionsIfNeeded;
        private Optional<Set<String>> tags;

        private PickleJarScenario(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'background'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
        private final String languageCode;
        private Set<String> featureTags = new HashSet<>();
        private Optional<GherkinBackground> background = Optional.empty();
        private Optional<String> longDescription = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
    static class PickleJarScenario {
        private final String scenarioTitleWithParameterSubstitutionsIfNeeded;
        private final Optional<String> longDescription;
        private final List<String> stepsWithParameterSubstitutionsIfNeeded;
        private Optional<Set<String>> tags;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
            private final String title;
            private final List<PickleJarScenario> scenarios;
            private Optional<String> longDescription = Optional.empty();
            private Optional<GherkinBackground> background = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'syntaxRuleName'
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
    private final Optional<Class<? extends Lexer>> recognizerLexer;
    private final Method subgrammarActivePhraseRule;
    private final Optional<String> syntaxRuleName;
    public static String DEFAULT_ALL_RULES_METHOD_NAME = "polymorphicDslAllRules";

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizerParser'
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
    private final Constructor<? extends Parser> subgrammarParserConstructor;
    private final Constructor<? extends Lexer> subgrammarLexerConstructor;
    private final Optional<Class<? extends Parser>> recognizerParser;
    private final Optional<Class<? extends Lexer>> recognizerLexer;
    private final Method subgrammarActivePhraseRule;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizerLexer'
in `src/main/java/com/pdsl/transformers/DefaultPolymorphicDslPhraseFilter.java`
#### Snippet
```java
    private final Constructor<? extends Lexer> subgrammarLexerConstructor;
    private final Optional<Class<? extends Parser>> recognizerParser;
    private final Optional<Class<? extends Lexer>> recognizerLexer;
    private final Method subgrammarActivePhraseRule;
    private final Optional<String> syntaxRuleName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metadata'
in `src/main/java/com/pdsl/testcases/TestBodyFragment.java`
#### Snippet
```java
public class TestBodyFragment {

    private final Optional<InputStream> metadata;
    private final List<FilteredPhrase> testPhrases;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentMetaData'
in `src/main/java/com/pdsl/testcases/PreorderTestCaseFactory.java`
#### Snippet
```java
    private List<TestCase> recursiveWalkAndCreateOnLeaf(TestSpecification testSpecification,
                                                        List<TestBodyFragment> parentTestBodyFragments,
                                                        Optional<InputStream> parentMetaData,
                                                        String rootId,
                                                        Accumulator accumulator) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parseTreeListener'
in `src/main/java/com/pdsl/runners/junit/PdslStatement.java`
#### Snippet
```java
    private MetadataTestRunResults results;
    private final Collection<TestCase> testCases;
    private final Optional<ParseTreeListener> parseTreeListener;
    private final Optional<ParseTreeVisitor<?>> parseTreeVisitor;
    private final String context;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'parseTreeVisitor'
in `src/main/java/com/pdsl/runners/junit/PdslStatement.java`
#### Snippet
```java
    private final Collection<TestCase> testCases;
    private final Optional<ParseTreeListener> parseTreeListener;
    private final Optional<ParseTreeVisitor<?>> parseTreeVisitor;
    private final String context;
    private final TraceableTestRunExecutor executor;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metaData'
in `src/main/java/com/pdsl/testcases/DefaultTestSection.java`
#### Snippet
```java
public class DefaultTestSection implements TestSection {

    private final Optional<InputStream> metaData;
    private final Phrase phrase;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'visitor'
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
    private static final class PhraseRegistry {
        private final Optional<ParseTreeListener> listener;
        private final Optional<ParseTreeVisitor<?>> visitor;

        PhraseRegistry(ParseTreeListener listener) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outputStreams'
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(DefaultPolymorphicDslTestExecutor.class);
    private final ParseTreeWalker walker = new ParseTreeWalker();
    private final Optional<MultiOutputStream> outputStreams = Optional.of(new MultiOutputStream(new PdslThreadSafeOutputStream()));
    private final Charset charset = Charset.defaultCharset();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'listener'
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
     */
    private static final class PhraseRegistry {
        private final Optional<ParseTreeListener> listener;
        private final Optional<ParseTreeVisitor<?>> visitor;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'title'
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java
 */
public class GherkinBackground {
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> steps;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'steps'
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> steps;

    public GherkinBackground(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'longDescription'
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java
public class GherkinBackground {
    private final Optional<GherkinString> title;
    private final Optional<GherkinString> longDescription;
    private final Optional<List<GherkinStep>> steps;

```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'classWideRecognizerLexer'
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
    private final Provider<? extends TestResourceFinderGenerator> resourceFinderGenerator;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;

    public PdslJUnit4ConfigurableRunner(Class<?> testClass) throws InitializationError {
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'classWideRecognizerParser'
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
    private final Provider<? extends TestResourceFinderGenerator> resourceFinderGenerator;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parseTreeListener'
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
public class PdslExecutorRunner extends ParentRunner<TestCase> {
    private final TraceableTestRunExecutor executor;
    private final Optional<ParseTreeListener> parseTreeListener;
    private final Optional<ParseTreeVisitor<?>> parseTreeVisitor;
    private final List<TestCase> testCases;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'parseTreeVisitor'
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
    private final TraceableTestRunExecutor executor;
    private final Optional<ParseTreeListener> parseTreeListener;
    private final Optional<ParseTreeVisitor<?>> parseTreeVisitor;
    private final List<TestCase> testCases;
    private final String context;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'failingPhrase'
in `src/main/java/com/pdsl/reports/DefaultTestResult.java`
#### Snippet
```java
    private int phrasesSkippedDueToFailure = 0;
    private int passingPhraseTotal = 0;
    private Optional<Phrase> failingPhrase = Optional.empty();
    private Optional<Throwable> failureReason = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'failureReason'
in `src/main/java/com/pdsl/reports/DefaultTestResult.java`
#### Snippet
```java
    private int passingPhraseTotal = 0;
    private Optional<Phrase> failingPhrase = Optional.empty();
    private Optional<Throwable> failureReason = Optional.empty();

    public DefaultTestResult(int passingPhraseTotal, TestCase testCase, TechnicalReportData.Status status) {
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'recognizerLexer'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private final Charset charset;
    private final Optional<? extends Class<? extends Parser>> recognizerParser;
    private final Optional<? extends Class<? extends Lexer>> recognizerLexer;
    private final Optional<String> recognizerRule;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recognizerRule'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        private Optional<? extends Class<? extends Parser>> recognizerParser = Optional.empty();
        private Optional<? extends Class<? extends Lexer>> recognizerLexer = Optional.empty();
        private Optional<String> recognizerRule = Optional.of(RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME);

        public Builder(PolymorphicDslPhraseFilter polymorphicDslPhrasefilter) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recognizerRule'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private final Optional<? extends Class<? extends Parser>> recognizerParser;
    private final Optional<? extends Class<? extends Lexer>> recognizerLexer;
    private final Optional<String> recognizerRule;

    private DefaultGherkinTestSpecificationFactory(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'recognizerParser'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        private PickleJarFactory pickleJarFactory = PickleJarFactory.DEFAULT;
        private Charset charset = Charset.defaultCharset();
        private Optional<? extends Class<? extends Parser>> recognizerParser = Optional.empty();
        private Optional<? extends Class<? extends Lexer>> recognizerLexer = Optional.empty();
        private Optional<String> recognizerRule = Optional.of(RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME);
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'recognizerParser'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private final PickleJarFactory pickleJarFactory;
    private final Charset charset;
    private final Optional<? extends Class<? extends Parser>> recognizerParser;
    private final Optional<? extends Class<? extends Lexer>> recognizerLexer;
    private final Optional<String> recognizerRule;
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for field 'recognizerLexer'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
        private Charset charset = Charset.defaultCharset();
        private Optional<? extends Class<? extends Parser>> recognizerParser = Optional.empty();
        private Optional<? extends Class<? extends Lexer>> recognizerLexer = Optional.empty();
        private Optional<String> recognizerRule = Optional.of(RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME);

```

## RuleId[id=ReplaceAllDot]
### ReplaceAllDot
Suspicious regex expression "." in call to 'split()'
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
        // Check to see if required fields are available
        if (pdslConfiguration == null) {
            String[] classNameComponents = testClass.getName().split(".");
            throw new InitializationError(String.format("The class %s does not have the required @PdslConfiguration annotation.%n"
                    + "e.g.:%n%s", exampleConfiguration, className));
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorTacticalReportGenerator.java`
#### Snippet
```java
                    // If it starts with a pipe or it is a pipe NOT preceeded by a backslash, escape
                    tacticalReportData.getUnfilteredPhraseBodyList().get(i)
                            .replaceAll("([^\\\\])\\|", "$1\\\\|")));
        }
        write("|===%n%n");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
                } else if (c == '|') { // End of cell
                    cellData.add(cellText.toString() //trim() removes leading and trailing whitespace
                            .replaceAll("^[ \t]*", "") // Remove leading spaces and tabs
                            .replaceAll("[ \t]*$", "") // Remove trailing spaces and tabs
                    );
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java
                    cellData.add(cellText.toString() //trim() removes leading and trailing whitespace
                            .replaceAll("^[ \t]*", "") // Remove leading spaces and tabs
                            .replaceAll("[ \t]*$", "") // Remove trailing spaces and tabs
                    );
                    cellText = new StringBuilder();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/pdsl/runners/junit/PdslJUnit4ConfigurableRunner.java`
#### Snippet
```java
        // Check to see if required fields are available
        if (pdslConfiguration == null) {
            String[] classNameComponents = testClass.getName().split(".");
            throw new InitializationError(String.format("The class %s does not have the required @PdslConfiguration annotation.%n"
                    + "e.g.:%n%s", exampleConfiguration, className));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/pdsl/reports/asciidoctor/AsciidoctorReportGenerator.java`
#### Snippet
```java
        }
        String processedPath = options.map().get("destination_dir") != null ? (String)options.map().get("destination_dir")
                : adocURL.toString().replace(".adoc", ".html").replaceFirst("file:", "");
        logger.info(String.format("Wrote report to %s",processedPath));
        return Paths.get(processedPath).toUri().toURL();
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
public interface TestCaseGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.TestCaseGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  com.pdsl.reports.proto.TechnicalReportData getTechnicalReportData(int index);
  /**
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  com.pdsl.reports.proto.TechnicalReportDataOrBuilder getTechnicalReportDataOrBuilder(
      int index);
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  java.util.List<com.pdsl.reports.proto.TechnicalReportData> 
      getTechnicalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  java.util.List<com.pdsl.reports.proto.TechnicalReportData> 
      getTechnicalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
      getTechnicalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroupOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
      getTechnicalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.specifications` is unnecessary and can be removed
in `src/main/java/com/pdsl/specifications/Phrase.java`
#### Snippet
```java
     *
     * <p>This index ID is therefore only suitable for describing the phrase index as it existed previously in its
     * {@link com.pdsl.specifications.TestSpecification} when it was being interpreted by a
     * {@link com.pdsl.testcases.TestCaseFactory}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.specifications` is unnecessary and can be removed
in `src/main/java/com/pdsl/specifications/Phrase.java`
#### Snippet
```java
 * A string that was successful parsed by the DSL with a resulting phrase tree and an index.
 *
 * <p>When a {@link com.pdsl.testcases.TestCaseFactory} is processing a {@link com.pdsl.specifications.TestSpecification}
 * it must determine which phrases are relevant by context. Those that are deemed relevant are converted into Phrases
 * that will ultimately form the most important part of a {@link com.pdsl.testcases.TestCase}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.testcases` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/TestResult.java`
#### Snippet
```java

/**
 * The result from the execution of a single {@link com.pdsl.testcases.TestCase} that was processed by a
 * {@link com.pdsl.executors.TraceableTestRunExecutor}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  java.util.List<java.lang.String>
      getUnfilteredPhraseBodyList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  java.util.List<java.lang.String>
      getUnfilteredPhraseBodyList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */

  com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java

  com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue);
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
  com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue);
  /**
   * <code>map&lt;string, .com.pdsl.reports.proto.TestCaseGroup&gt; context_to_test_cases = 2;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>map&lt;string, .com.pdsl.reports.proto.TestCaseGroup&gt; context_to_test_cases = 2;</code>
   */
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCasesMap();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>map&lt;string, .com.pdsl.reports.proto.TestCaseGroup&gt; context_to_test_cases = 2;</code>
   */
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCasesMap();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>map&lt;string, .com.pdsl.reports.proto.TestCaseGroup&gt; context_to_test_cases = 2;</code>
   */
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCasesMap();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  com.google.protobuf.ByteString
      getUnfilteredPhraseBodyBytes(int index);

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * Use {@link #getContextToTestCasesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCases();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCases();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCases();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  getContextToTestCases();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */

  com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
      java.lang.String key);
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java

  com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
      java.lang.String key);
}

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
public interface TacticalReportDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.TacticalReportData)
    com.google.protobuf.MessageOrBuilder {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   */
  boolean containsContextToTestCases(
      java.lang.String key);
  /**
   * Use {@link #getContextToTestCasesMap()} instead.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  java.lang.String getUnfilteredPhraseBody(int index);
  /**
   * <code>repeated string unfiltered_phrase_body = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.StrategicReportData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData build() {
      com.pdsl.reports.proto.StrategicReportData result = buildPartial();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData build() {
      com.pdsl.reports.proto.StrategicReportData result = buildPartial();
      if (!result.isInitialized()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData build() {
      com.pdsl.reports.proto.StrategicReportData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.StrategicReportData parsedMessage = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.StrategicReportData parsedMessage = null;
      try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.StrategicReportData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.StrategicReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.StrategicReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrategicReportData> getParserForType() {
    return PARSER;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.google.protobuf.Parser<StrategicReportData> getParserForType() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> operationalReportDataBuilder_;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> operationalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> operationalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> operationalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  private static final com.google.protobuf.Parser<StrategicReportData>
      PARSER = new com.google.protobuf.AbstractParser<StrategicReportData>() {
    @java.lang.Override
    public StrategicReportData parsePartialFrom(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.StrategicReportData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    private void ensureOperationalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>(operationalReportData_);
        bitField0_ |= 0x00000001;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    private void ensureOperationalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>(operationalReportData_);
        bitField0_ |= 0x00000001;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData.Builder> 
         getOperationalReportDataBuilderList() {
      return getOperationalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData.Builder> 
         getOperationalReportDataBuilderList() {
      return getOperationalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return operationalReportDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.OperationalReportData getOperationalReportData(int index) {
    return operationalReportData_.get(index);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportDataOrBuilder getOperationalReportDataOrBuilder(
        int index) {
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Parser<StrategicReportData>
      PARSER = new com.google.protobuf.AbstractParser<StrategicReportData>() {
    @java.lang.Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.OperationalReportDataOrBuilder getOperationalReportDataOrBuilder(
      int index) {
    return operationalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  private StrategicReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  private StrategicReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operationalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.OperationalReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
            }
            operationalReportData_.add(
                input.readMessage(com.pdsl.reports.proto.OperationalReportData.parser(), extensionRegistry));
            break;
          }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        operationalReportData_ = java.util.Collections.unmodifiableList(operationalReportData_);
      }
      this.unknownFields = unknownFields.build();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
    return operationalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
    return operationalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     return true;
    }
    if (!(obj instanceof com.pdsl.reports.proto.StrategicReportData)) {
      return super.equals(obj);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.StrategicReportData other = (com.pdsl.reports.proto.StrategicReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.StrategicReportData other = (com.pdsl.reports.proto.StrategicReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOperationalReportDataFieldBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
      if (operationalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operationalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
      if (operationalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operationalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public java.util.List<com.pdsl.reports.proto.OperationalReportData> getOperationalReportDataList() {
      if (operationalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operationalReportData_);
      } else {
        return operationalReportDataBuilder_.getMessageList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder addOperationalReportData(
        com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return getOperationalReportDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
        getOperationalReportDataFieldBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
        getOperationalReportDataFieldBuilder() {
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
        getOperationalReportDataFieldBuilder() {
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
        getOperationalReportDataFieldBuilder() {
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        getOperationalReportDataFieldBuilder() {
      if (operationalReportDataBuilder_ == null) {
        operationalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder>(
                operationalReportData_,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        operationalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder>(
                operationalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        operationalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder>(
                operationalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        operationalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.OperationalReportData, com.pdsl.reports.proto.OperationalReportData.Builder, com.pdsl.reports.proto.OperationalReportDataOrBuilder>(
                operationalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder addOperationalReportDataBuilder() {
      return getOperationalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.OperationalReportData.getDefaultInstance());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.OperationalReportData.Builder addOperationalReportDataBuilder() {
      return getOperationalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.OperationalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder setOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public Builder addOperationalReportData(com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    private int bitField0_;

    private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_ =
      java.util.Collections.emptyList();
    private void ensureOperationalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    private int bitField0_;

    private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_ =
      java.util.Collections.emptyList();
    private void ensureOperationalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_ =
      java.util.Collections.emptyList();
    private void ensureOperationalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder setOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  };

  public static com.google.protobuf.Parser<StrategicReportData> parser() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  public static final int OPERATIONAL_REPORT_DATA_FIELD_NUMBER = 1;
  private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  public static final int OPERATIONAL_REPORT_DATA_FIELD_NUMBER = 1;
  private java.util.List<com.pdsl.reports.proto.OperationalReportData> operationalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < operationalReportData_.size(); i++) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < operationalReportData_.size(); i++) {
      output.writeMessage(1, operationalReportData_.get(i));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder addAllOperationalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.OperationalReportData> values) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder addAllOperationalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.OperationalReportData> values) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operationalReportData_);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder addOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData.Builder builderForValue) {
      if (operationalReportDataBuilder_ == null) {
        ensureOperationalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.StrategicReportData.getDefaultInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.StrategicReportData.getDefaultInstance();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.StrategicReportData.getDefaultInstance();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.StrategicReportData other) {
      if (other == com.pdsl.reports.proto.StrategicReportData.getDefaultInstance()) return this;
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    public Builder mergeFrom(com.pdsl.reports.proto.StrategicReportData other) {
      if (other == com.pdsl.reports.proto.StrategicReportData.getDefaultInstance()) return this;
      if (operationalReportDataBuilder_ == null) {
        if (!other.operationalReportData_.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
            bitField0_ = (bitField0_ & ~0x00000001);
            operationalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationalReportDataFieldBuilder() : null;
          } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  private StrategicReportData() {
    operationalReportData_ = java.util.Collections.emptyList();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.StrategicReportData) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.StrategicReportData) {
        return mergeFrom((com.pdsl.reports.proto.StrategicReportData)other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.StrategicReportData) {
        return mergeFrom((com.pdsl.reports.proto.StrategicReportData)other);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.StrategicReportData) {
        return mergeFrom((com.pdsl.reports.proto.StrategicReportData)other);
      } else {
        super.mergeFrom(other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.StrategicReportData)
  private static final com.pdsl.reports.proto.StrategicReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.StrategicReportData();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.StrategicReportData.class, com.pdsl.reports.proto.StrategicReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder getOperationalReportDataBuilder(
        int index) {
      return getOperationalReportDataFieldBuilder().getBuilder(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
 */
public  final class StrategicReportData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.StrategicReportData)
    StrategicReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  private static final com.pdsl.reports.proto.StrategicReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.StrategicReportData();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData getOperationalReportData(int index) {
      if (operationalReportDataBuilder_ == null) {
        return operationalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
      getOperationalReportDataOrBuilderList() {
    return operationalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
      getOperationalReportDataOrBuilderList() {
    return operationalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData buildPartial() {
      com.pdsl.reports.proto.StrategicReportData result = new com.pdsl.reports.proto.StrategicReportData(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData buildPartial() {
      com.pdsl.reports.proto.StrategicReportData result = new com.pdsl.reports.proto.StrategicReportData(this);
      int from_bitField0_ = bitField0_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData buildPartial() {
      com.pdsl.reports.proto.StrategicReportData result = new com.pdsl.reports.proto.StrategicReportData(this);
      int from_bitField0_ = bitField0_;
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.StrategicReportData buildPartial() {
      com.pdsl.reports.proto.StrategicReportData result = new com.pdsl.reports.proto.StrategicReportData(this);
      int from_bitField0_ = bitField0_;
      if (operationalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      if (operationalReportDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operationalReportData_ = java.util.Collections.unmodifiableList(operationalReportData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      super.clear();
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    size = 0;
    for (int i = 0; i < operationalReportData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operationalReportData_.get(i));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.OperationalReportData.Builder addOperationalReportDataBuilder(
        int index) {
      return getOperationalReportDataFieldBuilder().addBuilder(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        int index) {
      return getOperationalReportDataFieldBuilder().addBuilder(
          index, com.pdsl.reports.proto.OperationalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.StrategicReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
private static final long serialVersionUID = 0L;
  // Use StrategicReportData.newBuilder() to construct.
  private StrategicReportData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     */
    public Builder addOperationalReportData(
        int index, com.pdsl.reports.proto.OperationalReportData value) {
      if (operationalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public Builder clearOperationalReportData() {
      if (operationalReportDataBuilder_ == null) {
        operationalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
         getOperationalReportDataOrBuilderList() {
      if (operationalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
         getOperationalReportDataOrBuilderList() {
      if (operationalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        return operationalReportDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operationalReportData_);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  private static final com.google.protobuf.Parser<StrategicReportData>
      PARSER = new com.google.protobuf.AbstractParser<StrategicReportData>() {
    @java.lang.Override
    public StrategicReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    @java.lang.Override
    public StrategicReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    public StrategicReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrategicReportData(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrategicReportData(input, extensionRegistry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/logging/PdslThreadSafeOutputStream.java`
#### Snippet
```java
public final class PdslThreadSafeOutputStream extends OutputStream {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PdslThreadSafeOutputStream.class.getName());

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/logging/PdslThreadSafeOutputStream.java`
#### Snippet
```java
public final class PdslThreadSafeOutputStream extends OutputStream {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PdslThreadSafeOutputStream.class.getName());

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.gherkin` is unnecessary and can be removed
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
 * A factory for producing PickleJars from Test Resources.
 *
 * @see com.pdsl.gherkin.PickleJar
 */
public class PickleJarFactory {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  java.util.List<com.pdsl.reports.proto.TacticalReportData> 
      getTacticalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  java.util.List<com.pdsl.reports.proto.TacticalReportData> 
      getTacticalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
public interface OperationalReportDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.OperationalReportData)
    com.google.protobuf.MessageOrBuilder {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string application = 1;</code>
   */
  com.google.protobuf.ByteString
      getApplicationBytes();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string application = 1;</code>
   */
  java.lang.String getApplication();
  /**
   * <code>string application = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  com.pdsl.reports.proto.TacticalReportDataOrBuilder getTacticalReportDataOrBuilder(
      int index);
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
      getTacticalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
      getTacticalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  com.pdsl.reports.proto.TacticalReportData getTacticalReportData(int index);
  /**
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  com.pdsl.reports.proto.OperationalReportDataOrBuilder getOperationalReportDataOrBuilder(
      int index);
}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
public interface StrategicReportDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.StrategicReportData)
    com.google.protobuf.MessageOrBuilder {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
      getOperationalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  java.util.List<? extends com.pdsl.reports.proto.OperationalReportDataOrBuilder> 
      getOperationalReportDataOrBuilderList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  com.pdsl.reports.proto.OperationalReportData getOperationalReportData(int index);
  /**
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  java.util.List<com.pdsl.reports.proto.OperationalReportData> 
      getOperationalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.OperationalReportData operational_report_data = 1;</code>
   */
  java.util.List<com.pdsl.reports.proto.OperationalReportData> 
      getOperationalReportDataList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string test_case_title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTestCaseTitleBytes();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string test_case_title = 1;</code>
   */
  java.lang.String getTestCaseTitle();
  /**
   * <code>string test_case_title = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  com.google.protobuf.ByteString
      getFilteredPhraseBodyBytes(int index);

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string failing_phrase = 3;</code>
   */
  com.google.protobuf.ByteString
      getFailingPhraseBytes();

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
public interface TechnicalReportDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.TechnicalReportData)
    com.google.protobuf.MessageOrBuilder {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string failure_reason = 4;</code>
   */
  java.lang.String getFailureReason();
  /**
   * <code>string failure_reason = 4;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string failure_reason = 4;</code>
   */
  com.google.protobuf.ByteString
      getFailureReasonBytes();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  java.lang.String getFilteredPhraseBody(int index);
  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>string failing_phrase = 3;</code>
   */
  java.lang.String getFailingPhrase();
  /**
   * <code>string failing_phrase = 3;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
   */
  com.pdsl.reports.proto.TechnicalReportData.Status getStatus();

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  java.util.List<java.lang.String>
      getFilteredPhraseBodyList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportDataOrBuilder.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  java.util.List<java.lang.String>
      getFilteredPhraseBodyList();
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
 */
public  final class OperationalReportData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.OperationalReportData)
    OperationalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private static final com.pdsl.reports.proto.OperationalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.OperationalReportData();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    size = 0;
    if (!getApplicationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, application_);
    }
    for (int i = 0; i < tacticalReportData_.size(); i++) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    for (int i = 0; i < tacticalReportData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, tacticalReportData_.get(i));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
         getTacticalReportDataOrBuilderList() {
      if (tacticalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
         getTacticalReportDataOrBuilderList() {
      if (tacticalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        return tacticalReportDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tacticalReportData_);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public com.pdsl.reports.proto.TacticalReportData getTacticalReportData(int index) {
      if (tacticalReportDataBuilder_ == null) {
        return tacticalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.OperationalReportData parsedMessage = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.OperationalReportData parsedMessage = null;
      try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.OperationalReportData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.OperationalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.OperationalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>string application = 1;</code>
     */
    public java.lang.String getApplication() {
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public java.lang.String getApplication() {
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public java.lang.String getApplication() {
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        application_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        application_ = s;
        return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
private static final long serialVersionUID = 0L;
  // Use OperationalReportData.newBuilder() to construct.
  private OperationalReportData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    private java.util.List<com.pdsl.reports.proto.TacticalReportData> tacticalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTacticalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    private java.util.List<com.pdsl.reports.proto.TacticalReportData> tacticalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTacticalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    private java.util.List<com.pdsl.reports.proto.TacticalReportData> tacticalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTacticalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Parser<OperationalReportData>
      PARSER = new com.google.protobuf.AbstractParser<OperationalReportData>() {
    @java.lang.Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public com.pdsl.reports.proto.TacticalReportData.Builder getTacticalReportDataBuilder(
        int index) {
      return getTacticalReportDataFieldBuilder().getBuilder(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  public static final int TACTICAL_REPORT_DATA_FIELD_NUMBER = 2;
  private java.util.List<com.pdsl.reports.proto.TacticalReportData> tacticalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  public static final int TACTICAL_REPORT_DATA_FIELD_NUMBER = 2;
  private java.util.List<com.pdsl.reports.proto.TacticalReportData> tacticalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.OperationalReportData)
  private static final com.pdsl.reports.proto.OperationalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.OperationalReportData();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> tacticalReportDataBuilder_;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> tacticalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> tacticalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> tacticalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private static final com.google.protobuf.Parser<OperationalReportData>
      PARSER = new com.google.protobuf.AbstractParser<OperationalReportData>() {
    @java.lang.Override
    public OperationalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public OperationalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public OperationalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationalReportData(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationalReportData(input, extensionRegistry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public java.util.List<com.pdsl.reports.proto.TacticalReportData> getTacticalReportDataList() {
    return tacticalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public java.util.List<com.pdsl.reports.proto.TacticalReportData> getTacticalReportDataList() {
    return tacticalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  };

  public static com.google.protobuf.Parser<OperationalReportData> parser() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.OperationalReportData other) {
      if (other == com.pdsl.reports.proto.OperationalReportData.getDefaultInstance()) return this;
      if (!other.getApplication().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    public Builder mergeFrom(com.pdsl.reports.proto.OperationalReportData other) {
      if (other == com.pdsl.reports.proto.OperationalReportData.getDefaultInstance()) return this;
      if (!other.getApplication().isEmpty()) {
        application_ = other.application_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            bitField0_ = (bitField0_ & ~0x00000002);
            tacticalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTacticalReportDataFieldBuilder() : null;
          } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return getTacticalReportDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
        getTacticalReportDataFieldBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
        getTacticalReportDataFieldBuilder() {
      if (tacticalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
        getTacticalReportDataFieldBuilder() {
      if (tacticalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
        getTacticalReportDataFieldBuilder() {
      if (tacticalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        getTacticalReportDataFieldBuilder() {
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder>(
                tacticalReportData_,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder>(
                tacticalReportData_,
                ((bitField0_ & 0x00000002) == 0x00000002),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder>(
                tacticalReportData_,
                ((bitField0_ & 0x00000002) == 0x00000002),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TacticalReportData, com.pdsl.reports.proto.TacticalReportData.Builder, com.pdsl.reports.proto.TacticalReportDataOrBuilder>(
                tacticalReportData_,
                ((bitField0_ & 0x00000002) == 0x00000002),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public Builder addTacticalReportData(com.pdsl.reports.proto.TacticalReportData value) {
      if (tacticalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTacticalReportDataFieldBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.pdsl.reports.proto.OperationalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.pdsl.reports.proto.OperationalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder clearTacticalReportData() {
      if (tacticalReportDataBuilder_ == null) {
        tacticalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData buildPartial() {
      com.pdsl.reports.proto.OperationalReportData result = new com.pdsl.reports.proto.OperationalReportData(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData buildPartial() {
      com.pdsl.reports.proto.OperationalReportData result = new com.pdsl.reports.proto.OperationalReportData(this);
      int from_bitField0_ = bitField0_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData buildPartial() {
      com.pdsl.reports.proto.OperationalReportData result = new com.pdsl.reports.proto.OperationalReportData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData buildPartial() {
      com.pdsl.reports.proto.OperationalReportData result = new com.pdsl.reports.proto.OperationalReportData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          tacticalReportData_ = java.util.Collections.unmodifiableList(tacticalReportData_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
      getTacticalReportDataOrBuilderList() {
    return tacticalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.TacticalReportDataOrBuilder> 
      getTacticalReportDataOrBuilderList() {
    return tacticalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder addTacticalReportData(
        int index, com.pdsl.reports.proto.TacticalReportData.Builder builderForValue) {
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder setTacticalReportData(
        int index, com.pdsl.reports.proto.TacticalReportData.Builder builderForValue) {
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.OperationalReportData) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.OperationalReportData) {
        return mergeFrom((com.pdsl.reports.proto.OperationalReportData)other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.OperationalReportData) {
        return mergeFrom((com.pdsl.reports.proto.OperationalReportData)other);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.OperationalReportData) {
        return mergeFrom((com.pdsl.reports.proto.OperationalReportData)other);
      } else {
        super.mergeFrom(other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public com.pdsl.reports.proto.TacticalReportDataOrBuilder getTacticalReportDataOrBuilder(
        int index) {
      if (tacticalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder addTacticalReportData(
        com.pdsl.reports.proto.TacticalReportData.Builder builderForValue) {
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public com.pdsl.reports.proto.TacticalReportData.Builder addTacticalReportDataBuilder(
        int index) {
      return getTacticalReportDataFieldBuilder().addBuilder(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        int index) {
      return getTacticalReportDataFieldBuilder().addBuilder(
          index, com.pdsl.reports.proto.TacticalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.OperationalReportData.getDefaultInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.OperationalReportData.getDefaultInstance();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.OperationalReportData.getDefaultInstance();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder addTacticalReportData(
        int index, com.pdsl.reports.proto.TacticalReportData value) {
      if (tacticalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    private void ensureTacticalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        tacticalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TacticalReportData>(tacticalReportData_);
        bitField0_ |= 0x00000002;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    private void ensureTacticalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        tacticalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TacticalReportData>(tacticalReportData_);
        bitField0_ |= 0x00000002;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationalReportData> getParserForType() {
    return PARSER;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.google.protobuf.Parser<OperationalReportData> getParserForType() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    private int bitField0_;

    private java.lang.Object application_ = "";
    /**
     * <code>string application = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  private OperationalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private OperationalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            application_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              tacticalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TacticalReportData>();
              mutable_bitField0_ |= 0x00000002;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              tacticalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TacticalReportData>();
              mutable_bitField0_ |= 0x00000002;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            }
            tacticalReportData_.add(
                input.readMessage(com.pdsl.reports.proto.TacticalReportData.parser(), extensionRegistry));
            break;
          }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        tacticalReportData_ = java.util.Collections.unmodifiableList(tacticalReportData_);
      }
      this.unknownFields = unknownFields.build();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData build() {
      com.pdsl.reports.proto.OperationalReportData result = buildPartial();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData build() {
      com.pdsl.reports.proto.OperationalReportData result = buildPartial();
      if (!result.isInitialized()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.OperationalReportData build() {
      com.pdsl.reports.proto.OperationalReportData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>string application = 1;</code>
   */
  public com.google.protobuf.ByteString
      getApplicationBytes() {
    java.lang.Object ref = application_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public com.google.protobuf.ByteString
      getApplicationBytes() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      getApplicationBytes() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      application_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      application_ = b;
      return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TacticalReportData.Builder> 
         getTacticalReportDataBuilderList() {
      return getTacticalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TacticalReportData.Builder> 
         getTacticalReportDataBuilderList() {
      return getTacticalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder setApplication(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder addAllTacticalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.TacticalReportData> values) {
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder addAllTacticalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.TacticalReportData> values) {
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (tacticalReportDataBuilder_ == null) {
        ensureTacticalReportDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tacticalReportData_);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TacticalReportData> getTacticalReportDataList() {
      if (tacticalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tacticalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TacticalReportData> getTacticalReportDataList() {
      if (tacticalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tacticalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public java.util.List<com.pdsl.reports.proto.TacticalReportData> getTacticalReportDataList() {
      if (tacticalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tacticalReportData_);
      } else {
        return tacticalReportDataBuilder_.getMessageList();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.OperationalReportData.class, com.pdsl.reports.proto.OperationalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  private static final com.google.protobuf.Parser<OperationalReportData>
      PARSER = new com.google.protobuf.AbstractParser<OperationalReportData>() {
    @java.lang.Override
    public OperationalReportData parsePartialFrom(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
      com.pdsl.reports.proto.OperationalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
      com.pdsl.reports.proto.OperationalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
     */
    public com.pdsl.reports.proto.TacticalReportData.Builder addTacticalReportDataBuilder() {
      return getTacticalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.TacticalReportData.getDefaultInstance());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TacticalReportData.Builder addTacticalReportDataBuilder() {
      return getTacticalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.TacticalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public com.pdsl.reports.proto.TacticalReportDataOrBuilder getTacticalReportDataOrBuilder(
      int index) {
    return tacticalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private int bitField0_;
  public static final int APPLICATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object application_;
  /**
   * <code>string application = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     * <code>string application = 1;</code>
     */
    public com.google.protobuf.ByteString
        getApplicationBytes() {
      java.lang.Object ref = application_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public com.google.protobuf.ByteString
        getApplicationBytes() {
      java.lang.Object ref = application_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.lang.Object ref = application_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        application_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        application_ = b;
        return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder setTacticalReportData(
        int index, com.pdsl.reports.proto.TacticalReportData value) {
      if (tacticalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.OperationalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

      if (tacticalReportDataBuilder_ == null) {
        tacticalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     return true;
    }
    if (!(obj instanceof com.pdsl.reports.proto.OperationalReportData)) {
      return super.equals(obj);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.OperationalReportData other = (com.pdsl.reports.proto.OperationalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.OperationalReportData other = (com.pdsl.reports.proto.OperationalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
      com.pdsl.reports.proto.OperationalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.OperationalReportData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>string application = 1;</code>
   */
  public java.lang.String getApplication() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   */
  public java.lang.String getApplication() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  public java.lang.String getApplication() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      application_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      application_ = s;
      return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private OperationalReportData() {
    application_ = "";
    tacticalReportData_ = java.util.Collections.emptyList();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
     */
    public Builder setApplicationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.OperationalReportData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getApplicationBytes().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getApplicationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, application_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
                      throws java.io.IOException {
    if (!getApplicationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, application_);
    }
    for (int i = 0; i < tacticalReportData_.size(); i++) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TacticalReportData tactical_report_data = 2;</code>
   */
  public com.pdsl.reports.proto.TacticalReportData getTacticalReportData(int index) {
    return tacticalReportData_.get(index);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      return tacticalReportDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
  private StrategicReportDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>src/main/java/com/pdsl/reports/proto/S" +
      "trategicReportData.proto\022\026com.pdsl.repor" +
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor,
        new java.lang.String[] { "OperationalReportData", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor,
        new java.lang.String[] { "OperationalReportData", });
    internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor =
      getDescriptor().getMessageTypes().get(1);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_pdsl_reports_proto_OperationalReportData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor,
        new java.lang.String[] { "Application", "TacticalReportData", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor,
        new java.lang.String[] { "Application", "TacticalReportData", });
    internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor =
      getDescriptor().getMessageTypes().get(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor,
        new java.lang.String[] { "UnfilteredPhraseBody", "ContextToTestCases", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor,
        new java.lang.String[] { "UnfilteredPhraseBody", "ContextToTestCases", });
    internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor =
      internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor.getNestedTypes().get(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor.getNestedTypes().get(0);
    internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor =
      getDescriptor().getMessageTypes().get(3);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor,
        new java.lang.String[] { "TechnicalReportData", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor,
        new java.lang.String[] { "TechnicalReportData", });
    internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor =
      getDescriptor().getMessageTypes().get(4);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor,
        new java.lang.String[] { "TestCaseTitle", "Status", "FailingPhrase", "FailureReason", "FailingPhraseIndex", "FilteredPhraseBody", "PhrasesSkippedDueToFailure", });
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor,
        new java.lang.String[] { "TestCaseTitle", "Status", "FailingPhrase", "FailureReason", "FailingPhraseIndex", "FilteredPhraseBody", "PhrasesSkippedDueToFailure", });
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_StrategicReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
  static final 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string failing_phrase = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFailingPhraseBytes() {
    java.lang.Object ref = failingPhrase_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public com.google.protobuf.ByteString
      getFailingPhraseBytes() {
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      getFailingPhraseBytes() {
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failingPhrase_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failingPhrase_ = b;
      return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>repeated string filtered_phrase_body = 6;</code>
     */
    public com.google.protobuf.ByteString
        getFilteredPhraseBodyBytes(int index) {
      return filteredPhraseBody_.getByteString(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    private int bitField0_;

    private java.lang.Object testCaseTitle_ = "";
    /**
     * <code>string test_case_title = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    private java.lang.Object failingPhrase_ = "";
    /**
     * <code>string failing_phrase = 3;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    private java.lang.Object failureReason_ = "";
    /**
     * <code>string failure_reason = 4;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData build() {
      com.pdsl.reports.proto.TechnicalReportData result = buildPartial();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData build() {
      com.pdsl.reports.proto.TechnicalReportData result = buildPartial();
      if (!result.isInitialized()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData build() {
      com.pdsl.reports.proto.TechnicalReportData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string failing_phrase = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFailingPhraseBytes() {
      java.lang.Object ref = failingPhrase_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.google.protobuf.ByteString
        getFailingPhraseBytes() {
      java.lang.Object ref = failingPhrase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = failingPhrase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failingPhrase_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failingPhrase_ = b;
        return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  private TechnicalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  private TechnicalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            testCaseTitle_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            failingPhrase_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            failureReason_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              filteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              filteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000020;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string failure_reason = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFailureReasonBytes() {
      java.lang.Object ref = failureReason_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.google.protobuf.ByteString
        getFailureReasonBytes() {
      java.lang.Object ref = failureReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = failureReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureReason_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureReason_ = b;
        return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTestCaseTitleBytes().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTestCaseTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, testCaseTitle_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
                      throws java.io.IOException {
    if (!getTestCaseTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, testCaseTitle_);
    }
    if (status_ != com.pdsl.reports.proto.TechnicalReportData.Status.STATUS_UNSPECIFIED.getNumber()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, testCaseTitle_);
    }
    if (status_ != com.pdsl.reports.proto.TechnicalReportData.Status.STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, status_);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (!getFailingPhraseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, failingPhrase_);
    }
    if (!getFailureReasonBytes().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (!getFailureReasonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, failureReason_);
    }
    if (failingPhraseIndex_ != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    for (int i = 0; i < filteredPhraseBody_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, filteredPhraseBody_.getRaw(i));
    }
    if (phrasesSkippedDueToFailure_ != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.TechnicalReportData)
  private static final com.pdsl.reports.proto.TechnicalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TechnicalReportData();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TechnicalReportData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  public static final int FAILING_PHRASE_FIELD_NUMBER = 3;
  private volatile java.lang.Object failingPhrase_;
  /**
   * <code>string failing_phrase = 3;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string test_case_title = 1;</code>
   */
  public java.lang.String getTestCaseTitle() {
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public java.lang.String getTestCaseTitle() {
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public java.lang.String getTestCaseTitle() {
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testCaseTitle_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testCaseTitle_ = s;
      return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setFailingPhrase(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getFilteredPhraseBodyList() {
    return filteredPhraseBody_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setFilteredPhraseBody(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string failing_phrase = 3;</code>
   */
  public java.lang.String getFailingPhrase() {
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public java.lang.String getFailingPhrase() {
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public java.lang.String getFailingPhrase() {
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = failingPhrase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failingPhrase_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failingPhrase_ = s;
      return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
   */
  public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
    return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
    return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
    return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     return true;
    }
    if (!(obj instanceof com.pdsl.reports.proto.TechnicalReportData)) {
      return super.equals(obj);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TechnicalReportData other = (com.pdsl.reports.proto.TechnicalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TechnicalReportData other = (com.pdsl.reports.proto.TechnicalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    failureReason_ = "";
    failingPhraseIndex_ = 0;
    filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    phrasesSkippedDueToFailure_ = 0;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setTestCaseTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder clearFilteredPhraseBody() {
      filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
     */
    public Builder setStatus(com.pdsl.reports.proto.TechnicalReportData.Status value) {
      if (value == null) {
        throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData buildPartial() {
      com.pdsl.reports.proto.TechnicalReportData result = new com.pdsl.reports.proto.TechnicalReportData(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData buildPartial() {
      com.pdsl.reports.proto.TechnicalReportData result = new com.pdsl.reports.proto.TechnicalReportData(this);
      int from_bitField0_ = bitField0_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData buildPartial() {
      com.pdsl.reports.proto.TechnicalReportData result = new com.pdsl.reports.proto.TechnicalReportData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData buildPartial() {
      com.pdsl.reports.proto.TechnicalReportData result = new com.pdsl.reports.proto.TechnicalReportData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  public static final int FAILURE_REASON_FIELD_NUMBER = 4;
  private volatile java.lang.Object failureReason_;
  /**
   * <code>string failure_reason = 4;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder addFilteredPhraseBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setFailureReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setTestCaseTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TechnicalReportData) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TechnicalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TechnicalReportData)other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TechnicalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TechnicalReportData)other);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TechnicalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TechnicalReportData)other);
      } else {
        super.mergeFrom(other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    private com.google.protobuf.LazyStringList filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    private com.google.protobuf.LazyStringList filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  private int bitField0_;
  public static final int TEST_CASE_TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object testCaseTitle_;
  /**
   * <code>string test_case_title = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string test_case_title = 1;</code>
     */
    public java.lang.String getTestCaseTitle() {
      java.lang.Object ref = testCaseTitle_;
      if (!(ref instanceof java.lang.String)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public java.lang.String getTestCaseTitle() {
      java.lang.Object ref = testCaseTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public java.lang.String getTestCaseTitle() {
      java.lang.Object ref = testCaseTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = testCaseTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testCaseTitle_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testCaseTitle_ = s;
        return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
      com.pdsl.reports.proto.TechnicalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pdsl.reports.proto.TechnicalReportData.getDescriptor().getEnumTypes().get(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pdsl.reports.proto.TechnicalReportData.getDescriptor().getEnumTypes().get(0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>repeated string filtered_phrase_body = 6;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFilteredPhraseBodyList() {
      return filteredPhraseBody_.getUnmodifiableView();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TechnicalReportData other) {
      if (other == com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance()) return this;
      if (!other.getTestCaseTitle().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    public Builder mergeFrom(com.pdsl.reports.proto.TechnicalReportData other) {
      if (other == com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance()) return this;
      if (!other.getTestCaseTitle().isEmpty()) {
        testCaseTitle_ = other.testCaseTitle_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder addFilteredPhraseBody(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  public com.google.protobuf.ByteString
      getFilteredPhraseBodyBytes(int index) {
    return filteredPhraseBody_.getByteString(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      failingPhraseIndex_ = 0;

      filteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      phrasesSkippedDueToFailure_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
 */
public  final class TechnicalReportData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.TechnicalReportData)
    TechnicalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  private static final com.pdsl.reports.proto.TechnicalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TechnicalReportData();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TechnicalReportData> getParserForType() {
    return PARSER;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.google.protobuf.Parser<TechnicalReportData> getParserForType() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  private static final com.google.protobuf.Parser<TechnicalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TechnicalReportData>() {
    @java.lang.Override
    public TechnicalReportData parsePartialFrom(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  private static final com.google.protobuf.Parser<TechnicalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TechnicalReportData>() {
    @java.lang.Override
    public TechnicalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public TechnicalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public TechnicalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TechnicalReportData(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TechnicalReportData(input, extensionRegistry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>repeated string filtered_phrase_body = 6;</code>
     */
    public java.lang.String getFilteredPhraseBody(int index) {
      return filteredPhraseBody_.get(index);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TechnicalReportData parsedMessage = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TechnicalReportData parsedMessage = null;
      try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TechnicalReportData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TechnicalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TechnicalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setFailingPhraseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.TechnicalReportData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  public java.lang.String getFilteredPhraseBody(int index) {
    return filteredPhraseBody_.get(index);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
      return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TechnicalReportData.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
      return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      @SuppressWarnings("deprecation")
      com.pdsl.reports.proto.TechnicalReportData.Status result = com.pdsl.reports.proto.TechnicalReportData.Status.valueOf(status_);
      return result == null ? com.pdsl.reports.proto.TechnicalReportData.Status.UNRECOGNIZED : result;
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder setFailureReason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string test_case_title = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTestCaseTitleBytes() {
    java.lang.Object ref = testCaseTitle_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public com.google.protobuf.ByteString
      getTestCaseTitleBytes() {
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      getTestCaseTitleBytes() {
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = testCaseTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testCaseTitle_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testCaseTitle_ = b;
      return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  };

  public static com.google.protobuf.Parser<TechnicalReportData> parser() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string test_case_title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTestCaseTitleBytes() {
      java.lang.Object ref = testCaseTitle_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public com.google.protobuf.ByteString
        getTestCaseTitleBytes() {
      java.lang.Object ref = testCaseTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = testCaseTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testCaseTitle_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testCaseTitle_ = b;
        return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  public static final int FILTERED_PHRASE_BODY_FIELD_NUMBER = 6;
  private com.google.protobuf.LazyStringList filteredPhraseBody_;
  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.pdsl.reports.proto.TechnicalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.pdsl.reports.proto.TechnicalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string failure_reason = 4;</code>
   */
  public com.google.protobuf.ByteString
      getFailureReasonBytes() {
    java.lang.Object ref = failureReason_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public com.google.protobuf.ByteString
      getFailureReasonBytes() {
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      getFailureReasonBytes() {
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureReason_ = b;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureReason_ = b;
      return b;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TechnicalReportData.class, com.pdsl.reports.proto.TechnicalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TechnicalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   * <code>string failure_reason = 4;</code>
   */
  public java.lang.String getFailureReason() {
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public java.lang.String getFailureReason() {
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public java.lang.String getFailureReason() {
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    java.lang.Object ref = failureReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureReason_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureReason_ = s;
      return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Parser<TechnicalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TechnicalReportData>() {
    @java.lang.Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string failure_reason = 4;</code>
     */
    public java.lang.String getFailureReason() {
      java.lang.Object ref = failureReason_;
      if (!(ref instanceof java.lang.String)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public java.lang.String getFailureReason() {
      java.lang.Object ref = failureReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public java.lang.String getFailureReason() {
      java.lang.Object ref = failureReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = failureReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureReason_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureReason_ = s;
        return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
      com.pdsl.reports.proto.TechnicalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
      com.pdsl.reports.proto.TechnicalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     * <code>string failing_phrase = 3;</code>
     */
    public java.lang.String getFailingPhrase() {
      java.lang.Object ref = failingPhrase_;
      if (!(ref instanceof java.lang.String)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public java.lang.String getFailingPhrase() {
      java.lang.Object ref = failingPhrase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    public java.lang.String getFailingPhrase() {
      java.lang.Object ref = failingPhrase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.lang.Object ref = failingPhrase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failingPhrase_ = s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failingPhrase_ = s;
        return s;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    private void ensureFilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        filteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList(filteredPhraseBody_);
        bitField0_ |= 0x00000020;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
private static final long serialVersionUID = 0L;
  // Use TechnicalReportData.newBuilder() to construct.
  private TechnicalReportData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder addAllFilteredPhraseBody(
        java.lang.Iterable<java.lang.String> values) {
      ensureFilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
     */
    public Builder addAllFilteredPhraseBody(
        java.lang.Iterable<java.lang.String> values) {
      ensureFilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        java.lang.Iterable<java.lang.String> values) {
      ensureFilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, filteredPhraseBody_);
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TechnicalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    size = 0;
    if (!getTestCaseTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, testCaseTitle_);
    }
    if (status_ != com.pdsl.reports.proto.TechnicalReportData.Status.STATUS_UNSPECIFIED.getNumber()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, testCaseTitle_);
    }
    if (status_ != com.pdsl.reports.proto.TechnicalReportData.Status.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (status_ != com.pdsl.reports.proto.TechnicalReportData.Status.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (!getFailingPhraseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, failingPhrase_);
    }
    if (!getFailureReasonBytes().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (!getFailureReasonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, failureReason_);
    }
    if (failingPhraseIndex_ != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (failingPhraseIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, failingPhraseIndex_);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    if (phrasesSkippedDueToFailure_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, phrasesSkippedDueToFailure_);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  public static final int UNFILTERED_PHRASE_BODY_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList unfilteredPhraseBody_;
  /**
   * <code>repeated string unfiltered_phrase_body = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
      com.pdsl.reports.proto.TacticalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return getTechnicalReportDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
        getTechnicalReportDataFieldBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
        getTechnicalReportDataFieldBuilder() {
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
        getTechnicalReportDataFieldBuilder() {
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
        getTechnicalReportDataFieldBuilder() {
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        getTechnicalReportDataFieldBuilder() {
      if (technicalReportDataBuilder_ == null) {
        technicalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder>(
                technicalReportData_,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        technicalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder>(
                technicalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        technicalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder>(
                technicalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */

  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        technicalReportDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder>(
                technicalReportData_,
                ((bitField0_ & 0x00000001) == 0x00000001),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        internalGetContextToTestCases().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     * <code>repeated string unfiltered_phrase_body = 1;</code>
     */
    public java.lang.String getUnfilteredPhraseBody(int index) {
      return unfilteredPhraseBody_.get(index);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private int bitField0_;

    private com.google.protobuf.LazyStringList unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUnfilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TestCaseGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private int bitField0_;

    private com.google.protobuf.LazyStringList unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUnfilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getUnfilteredPhraseBodyList() {
    return unfilteredPhraseBody_;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Parser<TacticalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TacticalReportData>() {
    @java.lang.Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder putContextToTestCases(
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder putContextToTestCases(
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  private TestCaseGroup() {
    technicalReportData_ = java.util.Collections.emptyList();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableContextToTestCases().getMutableMap()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder addTechnicalReportData(
        com.pdsl.reports.proto.TechnicalReportData.Builder builderForValue) {
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.pdsl.reports.proto.TestCaseGroup value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableContextToTestCases().getMutableMap()
          .put(key, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TacticalReportData.getDefaultInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TacticalReportData.getDefaultInstance();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TacticalReportData.getDefaultInstance();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  public boolean containsContextToTestCases(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetContextToTestCases().getMap().containsKey(key);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public boolean containsContextToTestCases(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetContextToTestCases().getMap().containsKey(key);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TacticalReportData) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TacticalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TacticalReportData)other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TacticalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TacticalReportData)other);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TacticalReportData) {
        return mergeFrom((com.pdsl.reports.proto.TacticalReportData)other);
      } else {
        super.mergeFrom(other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return contextToTestCases_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetMutableContextToTestCases() {
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return contextToTestCases_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetMutableContextToTestCases() {
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return contextToTestCases_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetMutableContextToTestCases() {
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      onChanged();
      if (contextToTestCases_ == null) {
        contextToTestCases_ = com.google.protobuf.MapField.newMapField(
            ContextToTestCasesDefaultEntryHolder.defaultEntry);
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TacticalReportData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */

    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.String key,
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.pdsl.reports.proto.TestCaseGroup defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  private TacticalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private TacticalReportData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              unfilteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              unfilteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              contextToTestCases_ = com.google.protobuf.MapField.newMapField(
                  ContextToTestCasesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
            contextToTestCases__ = input.readMessage(
                ContextToTestCasesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
            contextToTestCases__ = input.readMessage(
                ContextToTestCasesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
            contextToTestCases__ = input.readMessage(
                ContextToTestCasesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
      getTechnicalReportDataOrBuilderList() {
    return technicalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
      getTechnicalReportDataOrBuilderList() {
    return technicalReportData_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */

  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
    return internalGetContextToTestCases().getMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */

  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
    return internalGetContextToTestCases().getMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */

  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
    return internalGetContextToTestCases().getMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData build() {
      com.pdsl.reports.proto.TacticalReportData result = buildPartial();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData build() {
      com.pdsl.reports.proto.TacticalReportData result = buildPartial();
      if (!result.isInitialized()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData build() {
      com.pdsl.reports.proto.TacticalReportData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    getMutableContextToTestCases() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    getMutableContextToTestCases() {
      return internalGetMutableContextToTestCases().getMutableMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    getMutableContextToTestCases() {
      return internalGetMutableContextToTestCases().getMutableMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    getMutableContextToTestCases() {
      return internalGetMutableContextToTestCases().getMutableMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  private static final com.google.protobuf.Parser<TestCaseGroup>
      PARSER = new com.google.protobuf.AbstractParser<TestCaseGroup>() {
    @java.lang.Override
    public TestCaseGroup parsePartialFrom(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
private static final long serialVersionUID = 0L;
  // Use TacticalReportData.newBuilder() to construct.
  private TacticalReportData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.pdsl.reports.proto.TacticalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.pdsl.reports.proto.TacticalReportData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TestCaseGroup parsedMessage = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TestCaseGroup parsedMessage = null;
      try {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TestCaseGroup parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TestCaseGroup) e.getUnfinishedMessage();
        throw e.unwrapIOException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TestCaseGroup) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static final int CONTEXT_TO_TEST_CASES_FIELD_NUMBER = 2;
  private static final class ContextToTestCasesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> defaultEntry =
            com.google.protobuf.MapEntry
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     return true;
    }
    if (!(obj instanceof com.pdsl.reports.proto.TestCaseGroup)) {
      return super.equals(obj);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private static final class ContextToTestCasesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> defaultEntry =
            com.google.protobuf.MapEntry
            .newDefaultInstance(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TestCaseGroup other = (com.pdsl.reports.proto.TestCaseGroup) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private static final class ContextToTestCasesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> defaultEntry =
            com.google.protobuf.MapEntry
            .newDefaultInstance(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TestCaseGroup other = (com.pdsl.reports.proto.TestCaseGroup) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> defaultEntry =
            com.google.protobuf.MapEntry
            .newDefaultInstance(
                com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor, 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return technicalReportDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
            com.google.protobuf.MapEntry
            .newDefaultInstance(
                com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
            .newDefaultInstance(
                com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_ContextToTestCasesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance());
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.TestCaseGroup prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder clearTechnicalReportData() {
      if (technicalReportDataBuilder_ == null) {
        technicalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  private static final com.google.protobuf.Parser<TestCaseGroup>
      PARSER = new com.google.protobuf.AbstractParser<TestCaseGroup>() {
    @java.lang.Override
    public TestCaseGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public TestCaseGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public TestCaseGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestCaseGroup(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestCaseGroup(input, extensionRegistry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup buildPartial() {
      com.pdsl.reports.proto.TestCaseGroup result = new com.pdsl.reports.proto.TestCaseGroup(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup buildPartial() {
      com.pdsl.reports.proto.TestCaseGroup result = new com.pdsl.reports.proto.TestCaseGroup(this);
      int from_bitField0_ = bitField0_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup buildPartial() {
      com.pdsl.reports.proto.TestCaseGroup result = new com.pdsl.reports.proto.TestCaseGroup(this);
      int from_bitField0_ = bitField0_;
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup buildPartial() {
      com.pdsl.reports.proto.TestCaseGroup result = new com.pdsl.reports.proto.TestCaseGroup(this);
      int from_bitField0_ = bitField0_;
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          technicalReportData_ = java.util.Collections.unmodifiableList(technicalReportData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TacticalReportData other) {
      if (other == com.pdsl.reports.proto.TacticalReportData.getDefaultInstance()) return this;
      if (!other.unfilteredPhraseBody_.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder setTechnicalReportData(
        int index, com.pdsl.reports.proto.TechnicalReportData value) {
      if (technicalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public Builder mergeFrom(com.pdsl.reports.proto.TacticalReportData other) {
      if (other == com.pdsl.reports.proto.TacticalReportData.getDefaultInstance()) return this;
      if (!other.unfilteredPhraseBody_.isEmpty()) {
        if (unfilteredPhraseBody_.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    public Builder mergeFrom(com.pdsl.reports.proto.TestCaseGroup other) {
      if (other == com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance()) return this;
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    public Builder mergeFrom(com.pdsl.reports.proto.TestCaseGroup other) {
      if (other == com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance()) return this;
      if (technicalReportDataBuilder_ == null) {
        if (!other.technicalReportData_.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
            bitField0_ = (bitField0_ & ~0x00000001);
            technicalReportDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTechnicalReportDataFieldBuilder() : null;
          } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public Builder putAllContextToTestCases(
        java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> values) {
      internalGetMutableContextToTestCases().getMutableMap()
          .putAll(values);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public Builder putAllContextToTestCases(
        java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> values) {
      internalGetMutableContextToTestCases().getMutableMap()
          .putAll(values);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public Builder putAllContextToTestCases(
        java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> values) {
      internalGetMutableContextToTestCases().getMutableMap()
          .putAll(values);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder setTechnicalReportData(
        int index, com.pdsl.reports.proto.TechnicalReportData.Builder builderForValue) {
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     return true;
    }
    if (!(obj instanceof com.pdsl.reports.proto.TacticalReportData)) {
      return super.equals(obj);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    private int bitField0_;

    private java.util.List<com.pdsl.reports.proto.TechnicalReportData> technicalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTechnicalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TacticalReportData other = (com.pdsl.reports.proto.TacticalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    private int bitField0_;

    private java.util.List<com.pdsl.reports.proto.TechnicalReportData> technicalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTechnicalReportDataIsMutable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    private java.util.List<com.pdsl.reports.proto.TechnicalReportData> technicalReportData_ =
      java.util.Collections.emptyList();
    private void ensureTechnicalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.equals(obj);
    }
    com.pdsl.reports.proto.TacticalReportData other = (com.pdsl.reports.proto.TacticalReportData) obj;

    boolean result = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  internalGetContextToTestCases() {
    if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  internalGetContextToTestCases() {
    if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  internalGetContextToTestCases() {
    if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
 */
public  final class TestCaseGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.TestCaseGroup)
    TestCaseGroupOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  internalGetContextToTestCases() {
    if (contextToTestCases_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ContextToTestCasesDefaultEntryHolder.defaultEntry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  private static final com.pdsl.reports.proto.TestCaseGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TestCaseGroup();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
 */
public  final class TacticalReportData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.pdsl.reports.proto.TacticalReportData)
    TacticalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportData.Builder addTechnicalReportDataBuilder(
        int index) {
      return getTechnicalReportDataFieldBuilder().addBuilder(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private static final com.pdsl.reports.proto.TacticalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TacticalReportData();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        int index) {
      return getTechnicalReportDataFieldBuilder().addBuilder(
          index, com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
      com.pdsl.reports.proto.TestCaseGroupOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pdsl.reports.proto.TacticalReportData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
      com.pdsl.reports.proto.TestCaseGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     * <code>repeated string unfiltered_phrase_body = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUnfilteredPhraseBodyBytes(int index) {
      return unfilteredPhraseBody_.getByteString(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTechnicalReportDataFieldBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
      com.pdsl.reports.proto.TestCaseGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < unfilteredPhraseBody_.size(); i++) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < unfilteredPhraseBody_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, unfilteredPhraseBody_.getRaw(i));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportDataOrBuilder getTechnicalReportDataOrBuilder(
        int index) {
      if (technicalReportDataBuilder_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
                      throws java.io.IOException {
    for (int i = 0; i < unfilteredPhraseBody_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, unfilteredPhraseBody_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
private static final long serialVersionUID = 0L;
  // Use TestCaseGroup.newBuilder() to construct.
  private TestCaseGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, unfilteredPhraseBody_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  };

  public static com.google.protobuf.Parser<TacticalReportData> parser() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    size = 0;
    for (int i = 0; i < technicalReportData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, technicalReportData_.get(i));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder addAllTechnicalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.TechnicalReportData> values) {
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder addAllTechnicalReportData(
        java.lang.Iterable<? extends com.pdsl.reports.proto.TechnicalReportData> values) {
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, technicalReportData_);
        onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < technicalReportData_.size(); i++) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < technicalReportData_.size(); i++) {
      output.writeMessage(1, technicalReportData_.get(i));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      super.clear();
      if (technicalReportDataBuilder_ == null) {
        technicalReportData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder addTechnicalReportData(
        int index, com.pdsl.reports.proto.TechnicalReportData value) {
      if (technicalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  public static final int TECHNICAL_REPORT_DATA_FIELD_NUMBER = 1;
  private java.util.List<com.pdsl.reports.proto.TechnicalReportData> technicalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  public static final int TECHNICAL_REPORT_DATA_FIELD_NUMBER = 1;
  private java.util.List<com.pdsl.reports.proto.TechnicalReportData> technicalReportData_;
  /**
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Parser<TestCaseGroup>
      PARSER = new com.google.protobuf.AbstractParser<TestCaseGroup>() {
    @java.lang.Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private static final com.google.protobuf.Parser<TacticalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TacticalReportData>() {
    @java.lang.Override
    public TacticalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public java.util.List<com.pdsl.reports.proto.TechnicalReportData> getTechnicalReportDataList() {
    return technicalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public TacticalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public java.util.List<com.pdsl.reports.proto.TechnicalReportData> getTechnicalReportDataList() {
    return technicalReportData_;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public TacticalReportData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TacticalReportData(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TechnicalReportData.Builder> 
         getTechnicalReportDataBuilderList() {
      return getTechnicalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TechnicalReportData.Builder> 
         getTechnicalReportDataBuilderList() {
      return getTechnicalReportDataFieldBuilder().getBuilderList();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TacticalReportData(input, extensionRegistry);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.TechnicalReportData getTechnicalReportData(int index) {
    return technicalReportData_.get(index);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder clear() {
      super.clear();
      unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableContextToTestCases().clear();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder addUnfilteredPhraseBody(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder addUnfilteredPhraseBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  private TestCaseGroup(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  private TestCaseGroup(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     * Use {@link #getContextToTestCasesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
      return getContextToTestCasesMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
      return getContextToTestCasesMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              technicalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TechnicalReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
      return getContextToTestCasesMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
      return getContextToTestCasesMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              technicalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TechnicalReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData buildPartial() {
      com.pdsl.reports.proto.TacticalReportData result = new com.pdsl.reports.proto.TacticalReportData(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
            }
            technicalReportData_.add(
                input.readMessage(com.pdsl.reports.proto.TechnicalReportData.parser(), extensionRegistry));
            break;
          }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData buildPartial() {
      com.pdsl.reports.proto.TacticalReportData result = new com.pdsl.reports.proto.TacticalReportData(this);
      int from_bitField0_ = bitField0_;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData buildPartial() {
      com.pdsl.reports.proto.TacticalReportData result = new com.pdsl.reports.proto.TacticalReportData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TacticalReportData buildPartial() {
      com.pdsl.reports.proto.TacticalReportData result = new com.pdsl.reports.proto.TacticalReportData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */

  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        technicalReportData_ = java.util.Collections.unmodifiableList(technicalReportData_);
      }
      this.unknownFields = unknownFields.build();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrDefault(
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.lang.String key,
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.pdsl.reports.proto.TestCaseGroup defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public Builder removeContextToTestCases(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableContextToTestCases().getMutableMap()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder removeContextToTestCases(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableContextToTestCases().getMutableMap()
          .remove(key);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     */
    public Builder addTechnicalReportData(
        int index, com.pdsl.reports.proto.TechnicalReportData.Builder builderForValue) {
      if (technicalReportDataBuilder_ == null) {
        ensureTechnicalReportDataIsMutable();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TacticalReportData parsedMessage = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TacticalReportData parsedMessage = null;
      try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pdsl.reports.proto.TacticalReportData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TacticalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pdsl.reports.proto.TacticalReportData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */

    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
      return internalGetContextToTestCases().getMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.pdsl.reports.proto.TestCaseGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */

    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
      return internalGetContextToTestCases().getMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public com.pdsl.reports.proto.TestCaseGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */

    public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCasesMap() {
      return internalGetContextToTestCases().getMap();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TestCaseGroup) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TestCaseGroup) {
        return mergeFrom((com.pdsl.reports.proto.TestCaseGroup)other);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TestCaseGroup) {
        return mergeFrom((com.pdsl.reports.proto.TestCaseGroup)other);
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pdsl.reports.proto.TestCaseGroup) {
        return mergeFrom((com.pdsl.reports.proto.TestCaseGroup)other);
      } else {
        super.mergeFrom(other);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TacticalReportData> getParserForType() {
    return PARSER;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public Builder addTechnicalReportData(com.pdsl.reports.proto.TechnicalReportData value) {
      if (technicalReportDataBuilder_ == null) {
        if (value == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public com.google.protobuf.Parser<TacticalReportData> getParserForType() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportData.Builder addTechnicalReportDataBuilder() {
      return getTechnicalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder setUnfilteredPhraseBody(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TechnicalReportData.Builder addTechnicalReportDataBuilder() {
      return getTechnicalReportDataFieldBuilder().addBuilder(
          com.pdsl.reports.proto.TechnicalReportData.getDefaultInstance());
    }
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.TestCaseGroup)
  private static final com.pdsl.reports.proto.TestCaseGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TestCaseGroup();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
      com.pdsl.reports.proto.TacticalReportDataOrBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
      com.pdsl.reports.proto.TacticalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder clearUnfilteredPhraseBody() {
      unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder addAllUnfilteredPhraseBody(
        java.lang.Iterable<java.lang.String> values) {
      ensureUnfilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */
    public Builder addAllUnfilteredPhraseBody(
        java.lang.Iterable<java.lang.String> values) {
      ensureUnfilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
   * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
   */
  public com.pdsl.reports.proto.TechnicalReportDataOrBuilder getTechnicalReportDataOrBuilder(
      int index) {
    return technicalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.Iterable<java.lang.String> values) {
      ensureUnfilteredPhraseBodyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, unfilteredPhraseBody_);
      onChanged();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
         getTechnicalReportDataOrBuilderList() {
      if (technicalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<? extends com.pdsl.reports.proto.TechnicalReportDataOrBuilder> 
         getTechnicalReportDataOrBuilderList() {
      if (technicalReportDataBuilder_ != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        return technicalReportDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(technicalReportData_);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  };

  public static com.google.protobuf.Parser<TestCaseGroup> parser() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> technicalReportDataBuilder_;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     * <code>repeated string unfiltered_phrase_body = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUnfilteredPhraseBodyList() {
      return unfilteredPhraseBody_.getUnmodifiableView();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetContextToTestCases() {
      if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetContextToTestCases() {
      if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetContextToTestCases() {
      if (contextToTestCases_ == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    internalGetContextToTestCases() {
      if (contextToTestCases_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ContextToTestCasesDefaultEntryHolder.defaultEntry);
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      size += 1 * getUnfilteredPhraseBodyList().size();
    }
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      size += 1 * getUnfilteredPhraseBodyList().size();
    }
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      size += 1 * getUnfilteredPhraseBodyList().size();
    }
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
      contextToTestCases__ = ContextToTestCasesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
      contextToTestCases__ = ContextToTestCasesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    for (java.util.Map.Entry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> entry
         : internalGetContextToTestCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
      contextToTestCases__ = ContextToTestCasesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, contextToTestCases__);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  public java.lang.String getUnfilteredPhraseBody(int index) {
    return unfilteredPhraseBody_.get(index);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> technicalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> technicalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pdsl.reports.proto.TechnicalReportData, com.pdsl.reports.proto.TechnicalReportData.Builder, com.pdsl.reports.proto.TechnicalReportDataOrBuilder> technicalReportDataBuilder_;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetContextToTestCases() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    private com.google.protobuf.MapField<
        java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
    private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
    internalGetContextToTestCases() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   * <code>repeated string unfiltered_phrase_body = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUnfilteredPhraseBodyBytes(int index) {
    return unfilteredPhraseBody_.getByteString(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
     */

    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pdsl.reports.proto.TestCaseGroup.class, com.pdsl.reports.proto.TestCaseGroup.Builder.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public com.pdsl.reports.proto.TestCaseGroup getContextToTestCasesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      if (!map.containsKey(key)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
          internalGetContextToTestCases().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    private void ensureUnfilteredPhraseBodyIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        unfilteredPhraseBody_ = new com.google.protobuf.LazyStringArrayList(unfilteredPhraseBody_);
        bitField0_ |= 0x00000001;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestCaseGroup> getParserForType() {
    return PARSER;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public com.google.protobuf.Parser<TestCaseGroup> getParserForType() {
    return PARSER;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    public boolean containsContextToTestCases(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetContextToTestCases().getMap().containsKey(key);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public boolean containsContextToTestCases(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetContextToTestCases().getMap().containsKey(key);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
                com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    private void ensureTechnicalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        technicalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TechnicalReportData>(technicalReportData_);
        bitField0_ |= 0x00000001;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  internalGetContextToTestCases() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    private void ensureTechnicalReportDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        technicalReportData_ = new java.util.ArrayList<com.pdsl.reports.proto.TechnicalReportData>(technicalReportData_);
        bitField0_ |= 0x00000001;
       }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.pdsl.reports.proto.TestCaseGroup> contextToTestCases_;
  private com.google.protobuf.MapField<java.lang.String, com.pdsl.reports.proto.TestCaseGroup>
  internalGetContextToTestCases() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  private static final com.google.protobuf.Parser<TacticalReportData>
      PARSER = new com.google.protobuf.AbstractParser<TacticalReportData>() {
    @java.lang.Override
    public TacticalReportData parsePartialFrom(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  private TacticalReportData() {
    unfilteredPhraseBody_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  // @@protoc_insertion_point(class_scope:com.pdsl.reports.proto.TacticalReportData)
  private static final com.pdsl.reports.proto.TacticalReportData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pdsl.reports.proto.TacticalReportData();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup getDefaultInstanceForType() {
      return com.pdsl.reports.proto.TestCaseGroup.getDefaultInstance();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   * Use {@link #getContextToTestCasesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
    return getContextToTestCasesMap();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
    return getContextToTestCasesMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
    return getContextToTestCasesMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> getContextToTestCases() {
    return getContextToTestCasesMap();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return PARSER.parseFrom(data);
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TacticalReportData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportData.Builder getTechnicalReportDataBuilder(
        int index) {
      return getTechnicalReportDataFieldBuilder().getBuilder(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public com.pdsl.reports.proto.TechnicalReportData getTechnicalReportData(int index) {
      if (technicalReportDataBuilder_ == null) {
        return technicalReportData_.get(index);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
        .parseWithIOException(PARSER, input);
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  }
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pdsl.reports.proto.TacticalReportData.class, com.pdsl.reports.proto.TacticalReportData.Builder.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  public static com.pdsl.reports.proto.TestCaseGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup build() {
      com.pdsl.reports.proto.TestCaseGroup result = buildPartial();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup build() {
      com.pdsl.reports.proto.TestCaseGroup result = buildPartial();
      if (!result.isInitialized()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    @java.lang.Override
    public com.pdsl.reports.proto.TestCaseGroup build() {
      com.pdsl.reports.proto.TestCaseGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TechnicalReportData> getTechnicalReportDataList() {
      if (technicalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(technicalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pdsl.reports.proto` is unnecessary and can be removed
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
     * <code>repeated .com.pdsl.reports.proto.TechnicalReportData technical_report_data = 1;</code>
     */
    public java.util.List<com.pdsl.reports.proto.TechnicalReportData> getTechnicalReportDataList() {
      if (technicalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(technicalReportData_);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    public java.util.List<com.pdsl.reports.proto.TechnicalReportData> getTechnicalReportDataList() {
      if (technicalReportDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(technicalReportData_);
      } else {
        return technicalReportDataBuilder_.getMessageList();
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.pdsl.runners.EmptyReportGenerator;`
in `src/main/java/com/pdsl/runners/PdslTestSuite.java`
#### Snippet
```java
import com.pdsl.reports.MetadataTestRunResults;
import com.pdsl.reports.TraceableReportGenerator;
import com.pdsl.runners.EmptyReportGenerator;
import com.pdsl.runners.junit.PdslGherkinJUnit4Runner;
import org.junit.runner.Runner;
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Provider() can be replaced with method reference
in `src/main/java/com/pdsl/runners/EmptyTestSpecificationFactory.java`
#### Snippet
```java

    static Provider<EmptyTestSpecificationFactory> getProvider() {
        return new Provider<EmptyTestSpecificationFactory>() {
            @Override
            public EmptyTestSpecificationFactory get() {
```

### Anonymous2MethodRef
Anonymous new com.google.protobuf.Internal.EnumLiteMap() can be replaced with method reference
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
          internalGetContextToTestCases().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `stepBodyAsStrings`
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private void checkGrammar(List<InputStream> stepBodyAsStrings) {
        if (recognizerParser.isPresent() && recognizerLexer.isPresent()) {
            stepBodyAsStrings = TestSpecificationHelper.checkGrammarValidity(recognizerParser.get(), recognizerLexer.get(), stepBodyAsStrings,
                    recognizerRule.isPresent() ? recognizerRule.get() : PdslTest.DEFAULT_ALL_RULE);
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyParseTreeListenerProvider.java`
#### Snippet
```java
    @Override
    public ParseTreeListener get() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyRecognizerLexer.java`
#### Snippet
```java
    @Override
    public String getGrammarFileName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyRecognizerLexer.java`
#### Snippet
```java
    @Override
    public ATN getATN() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyReportGenerator.java`
#### Snippet
```java
    @Override
    public URL generateReport(Map<String, Map<String, Collection<MetadataTestRunResults>>> testRunResults) throws IOException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyRecognizerParser.java`
#### Snippet
```java
    @Override
    public String getGrammarFileName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyRecognizerParser.java`
#### Snippet
```java
    @Override
    public ATN getATN() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyTestExecutorProvider.java`
#### Snippet
```java
    @Override
    public TraceableTestRunExecutor get() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinHelperAnnotation.java`
#### Snippet
```java
        @Override
        public TestSpecificationFactoryGenerator get() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/junit/PdslGherkinHelperAnnotation.java`
#### Snippet
```java
        @Override
        public TestCaseFactory get() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyParseTreeVisitorProvider.java`
#### Snippet
```java
    @Override
    public ParseTreeVisitor<Void> get() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/runners/EmptyTestResourceFinder.java`
#### Snippet
```java
    @Override
    public TestResourceFinderGenerator get() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
        case 2: return FAILED;
        case 3: return DUPLICATE;
        default: return null;
      }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `finder` is redundant
in `src/main/java/com/pdsl/specifications/FileSystemTestResourceGenerator.java`
#### Snippet
```java
        PathMatcher pathMatcher = new GlobPathMatcher(getGlobResourcePaths(includes),
                getGlobResourcePaths(excludes));
        TestResourceFinder finder = new FileSystemTestResourceFinder(pathMatcher);
        return finder;
    }
```

### UnnecessaryLocalVariable
Local variable `uri` is redundant
in `src/main/java/com/pdsl/specifications/FileDelimitedTestSpecificationFactory.java`
#### Snippet
```java
    List<TestSpecification> testSpecifications = new ArrayList<>(resourceLocations.size());
    for (URI resource : resourceLocations) {
      URI uri = resource;
      try (BufferedReader bufferedReader =
          new BufferedReader(new InputStreamReader(uri.toURL().openStream(), charset))) {
```

### UnnecessaryLocalVariable
Local variable `pattern` is redundant
in `src/main/java/com/pdsl/gherkin/models/GherkinString.java`
#### Snippet
```java
    static {
        String regex = "(<[^>]*>)";
        Pattern pattern = Pattern.compile(regex);
        parameterPattern = pattern;
    }
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            application_ = s;
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            testCaseTitle_ = s;
```

### UnnecessaryLocalVariable
Local variable `rawValue` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 16: {
            int rawValue = input.readEnum();

            status_ = rawValue;
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            failingPhrase_ = s;
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            failureReason_ = s;
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/com/pdsl/runners/EmptySpecificationFactoryProvider.java`
#### Snippet
```java
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) { return false; }
        return o.equals(INSTANCE);
```

