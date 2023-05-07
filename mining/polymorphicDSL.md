# polymorphicDSL 
 
# Bad smells
I found 362 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 100 | false |
| FinalMethodInFinalClass | 35 | false |
| UNUSED_IMPORT | 34 | false |
| JavadocDeclaration | 27 | false |
| OptionalIsPresent | 16 | false |
| UnusedAssignment | 16 | false |
| UnnecessaryLocalVariable | 14 | true |
| DuplicatedCode | 11 | false |
| FinalStaticMethod | 11 | false |
| EqualsBetweenInconvertibleTypes | 10 | false |
| SimplifyStreamApiCallChains | 9 | false |
| ConstantValue | 9 | false |
| DataFlowIssue | 8 | false |
| FieldCanBeLocal | 6 | false |
| OptionalGetWithoutIsPresent | 6 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 5 | false |
| MalformedFormatString | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| Deprecation | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| NullableProblems | 3 | false |
| RedundantCast | 3 | false |
| PointlessArithmeticExpression | 2 | false |
| EmptyStatementBody | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UnnecessaryModifier | 1 | true |
| DoubleNegation | 1 | false |
| JavadocReference | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| ObviousNullCheck | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| SillyAssignment | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| ReplaceAllDot | 1 | false |
| ExtendsAnnotation | 1 | false |
| FuseStreamOperations | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=OptionalIsPresent]
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
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java

    public Optional<GherkinFeature> getGherkinFeature(URI featurePathOrId) {
        return builderOptional.isEmpty() ? Optional.empty() : Optional.of(builderOptional.get().withLocation(featurePathOrId).build());
    }

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
                        recursivelyGetTagsAndFilterPickles(childTestSpecification,
                                allGherkinItemTags, tagExpression, originalSourceLocation);
                if (filteredChildTestOptional.isPresent()) {
                    filteredChildren.add(filteredChildTestOptional.get());
                }
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
        try {
            Optional<List<FilteredPhrase>> phrases = phraseFilter.filterPhrases(stepBodyAsInputStream);
            if (phrases.isPresent()) {
                return Optional.of(new DefaultTestSpecification.Builder(title, originalResourceLocation).withPhrases(phrases.get()).build());
            } else {
```

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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `postFilteredTestId`
in `src/main/java/com/pdsl/reports/ReportListener.java`
#### Snippet
```java
     * Checks to see if the test ID has already been recorded in the report
     *
     * @param postFilteredTestId Identifier of the TestSpecification after filtering out phrases
     * @return true if report contains this test or false if not
     */
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: literal is never null
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java

        public Builder withRecognizerRule(String recognizerRule) {
            Preconditions.checkNotNull("Recognizer rule cannot be null!", recognizerRule);
            Preconditions.checkArgument(recognizerRule.isEmpty(), "Recognizer rule cannot be empty!");
            this.recognizerRule = Optional.of(recognizerRule);
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.StrategicReportData)
      com.pdsl.reports.proto.StrategicReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_StrategicReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TestCaseGroup)
      com.pdsl.reports.proto.TestCaseGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.OperationalReportData)
      com.pdsl.reports.proto.OperationalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_OperationalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TechnicalReportData)
      com.pdsl.reports.proto.TechnicalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TechnicalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:com.pdsl.reports.proto.TacticalReportData)
      com.pdsl.reports.proto.TacticalReportDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetContextToTestCases();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableContextToTestCases();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetContextToTestCases();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
        logger.info("Running tests...");
        MetadataTestRunResults results = walk(testCases, new PhraseRegistry(subgrammarListener), context);
        if (results.failingTestTotal() == 0) {
            logger.info(AnsiTerminalColorHelper.BRIGHT_GREEN + "All phrases successfully executed!" + AnsiTerminalColorHelper.RESET);
        } else {
            logger.error(AnsiTerminalColorHelper.BRIGHT_RED + "There were test failures!" + AnsiTerminalColorHelper.RESET);
        }
        return (PolymorphicDslTestRunResults) results;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/gherkin/PdslGherkinInterpreterImpl.java`
#### Snippet
```java
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GherkinParser parser = new GherkinParser(tokens);
        parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
        ParseTree tree = parser.gherkinDocument();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        return listener.getGherkinFeature(testResource);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      application_ = s;
      return s;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      application_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        application_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
      java.lang.Object ref = application_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        application_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/StrategicReportData.java`
#### Snippet
```java
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operationalReportData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operationalReportData_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pdsl.reports.proto.TestCaseGroup> map =
        internalGetContextToTestCases().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
        for (FrameworkMethod pdslTestMethod : frameworkMethods) {
            RecognizedBy recognizedBy = pdslTestMethod.getAnnotation(RecognizedBy.class);
            if (recognizedBy != null) {
                // Make sure that the parser has a rule called 'syntaxRule'
                boolean hasRecognizerRule = Arrays.stream(recognizedBy.dslRecognizerParser().getMethods())
                        .anyMatch(m -> m.getName().equals(recognizedBy.recognizerRule()));
                if (!hasRecognizerRule) {
                    throw new IllegalArgumentException(String.format("RecognizedBy is using a parser missing the expected rule '%s'%n\tClass: %s%n\tMethod: %s%n\tParser: %s%n",
                            recognizedBy.recognizerRule(),pdslTestMethod.getDeclaringClass().getSimpleName(), pdslTestMethod.getName(), recognizedBy.dslRecognizerParser().getSimpleName()));
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
                pdslExecutorRunner.run(notifier);
                List<MetadataTestRunResults> methodResults = pdslExecutorRunner.getMetadataTestRunResults();
                if (!methodResults.stream().anyMatch(r -> r.failingTestTotal() > 0)) {
                    notifier.fireTestFinished(describeChild(method));
                } else {
                    List<TestResult> failureReasons = methodResults.stream().filter(r -> r.failingTestTotal() > 0)
                            .map(MetadataTestRunResults::getTestResults)
                            .flatMap(Collection::stream)
                            .collect(Collectors.toList());
                    Preconditions.checkArgument(!failureReasons.isEmpty());
                    notifier.fireTestFailure(new Failure(describeChild(method), new TestRunResults.FailedTestResults(failureReasons)));
                }
                results.addAll(methodResults);
```

## RuleId[id=Deprecation]
### Deprecation
'com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner' is deprecated
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
```

### Deprecation
'internalBuildGeneratedFileFrom(java.lang.String\[\], com.google.protobuf.Descriptors.FileDescriptor\[\], com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner)' is deprecated
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
```

### Deprecation
'com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner' is deprecated
in `src/main/java/com/pdsl/reports/proto/StrategicReportDataOuterClass.java`
#### Snippet
```java
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
                } else {
                    Set<String> scenarioTags = new HashSet<>();
                    scenarioTags.addAll(tags);
                    this.tags = Optional.of(scenarioTags);
                }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/pdsl/gherkin/PickleJarFactory.java`
#### Snippet
```java
                for (GherkinExamplesTable table : scenario.getExamples().get()) {
                    Set<String> tableTags = new HashSet<>();
                    tableTags.addAll(tags);
                    for (Map<String, String> substitutions : table.getRows()) {
                        // steps list is guaranteed to be present by the pdslGherkinInterpreter
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
        List<FrameworkMethod> frameworkMethods = new ArrayList<>();
            // Validate annotations are valid
        frameworkMethods.addAll(
                getTestClass().getAnnotatedMethods(PdslTest.class));
        for (FrameworkMethod pdslTestMethod : frameworkMethods) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
        List<FrameworkMethod> frameworkMethods = new ArrayList<>();
        // Validate annotations are valid
        frameworkMethods.addAll(
                clazz.getAnnotatedMethods(PdslTest.class));
        for (FrameworkMethod pdslTestMethod : frameworkMethods) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private List<TestSpecification> getGherkinStepSpecificationScenarios(List<PickleJar.PickleJarScenario> scenarios, Set<String> parentTags, URI originalSourceLocation) {
        List<GherkinTestSpecification> gherkinTestSpecifications = new ArrayList<>();
        gherkinTestSpecifications.addAll(transformScenariosToTestSpecifications(scenarios, parentTags, originalSourceLocation));
        // Generics are not covarient. Cast to TestSpecification
        return gherkinTestSpecifications.stream()
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
in `src/main/java/com/pdsl/reports/proto/TestCaseGroup.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TestCaseGroup_descriptor;
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
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pdsl.reports.proto.StrategicReportDataOuterClass.internal_static_com_pdsl_reports_proto_TacticalReportData_descriptor;
```

## RuleId[id=UnnecessaryToStringCall]
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
in `src/main/java/com/pdsl/gherkin/models/GherkinString.java`
#### Snippet
```java
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("There was a problem when doing gherkin string substitutions!%n\tRaw string: <BEGIN>" + rawString + "<END>%n\tSubstitutions: " + substitutions.toString());
        }
        // If we didn't substitute everything in the string it was half formed
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'results' is initialized with self assignment
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslExecutable.java`
#### Snippet
```java
         */
        public MetadataTestRunResults execute() {
            MetadataTestRunResults results = results = visitor.isPresent() ? executor.runTestsWithMetadata(List.of(pdslTest), visitor.get(), context)
                    : executor.runTestsWithMetadata(List.of(pdslTest), listener.get(), context);

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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/pdsl/executors/MultiOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
        for (OutputStream stream : streams) {
            stream.write(b);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/pdsl/executors/MultiOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (OutputStream stream : streams) {
            stream.write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/pdsl/logging/PdslThreadSafeOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] bytes, int start, int stop) {
        String message = new String(bytes);
        // Multibyte characters may require us to have an earlier stop point
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
    public ParseTreeTraversal getParseTreeTraversal(PdslTest pdslTest) {
        try {
            if (pdslTest.listener().equals(EmptyParseTreeListenerProvider.class) && pdslTest.visitor().equals(EmptyParseTreeVisitorProvider.class) ) {
                throw new IllegalArgumentException("Either a listener or listener needs to be provided to the @PdslTest annotation!");
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
    public ParseTreeTraversal getParseTreeTraversal(PdslTest pdslTest) {
        try {
            if (pdslTest.listener().equals(EmptyParseTreeListenerProvider.class) && pdslTest.visitor().equals(EmptyParseTreeVisitorProvider.class) ) {
                throw new IllegalArgumentException("Either a listener or listener needs to be provided to the @PdslTest annotation!");
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
                throw new IllegalArgumentException("Either a listener or listener needs to be provided to the @PdslTest annotation!");
            }
            if (!pdslTest.visitor().equals(EmptyParseTreeVisitorProvider.class)) {
                Constructor<?> providerConstructor = pdslTest.visitor().getDeclaredConstructor();
                return new ParseTreeTraversal(((Provider<ParseTreeVisitor<?>>) providerConstructor.newInstance()).get());
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
    public ParseTreeListener getParseTreeListener(PdslTest pdslTest) {
        try {
            if (pdslTest.listener().equals(EmptyParseTreeListenerProvider.class)) {
                throw new IllegalStateException("No listener or visitor was provided in the @PdslTest. ");
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
                    pdslConfiguration.testCaseFactoryProvider(), TEST_CASEFACTORY_PROVIDER);
            Provider<? extends TestSpecificationFactoryGenerator> specificationFactory = (Provider<? extends TestSpecificationFactoryGenerator>) createPdslProviderFromClass(pdslConfiguration.specificationFactoryProvider(), SPECIFICATION_FACTORY_PROVIDER);
            Provider<? extends TraceableTestRunExecutor> executor = !pdslConfiguration.testRunExecutor().equals(EmptyTestExecutorProvider.class)
                    ? (Provider<? extends TraceableTestRunExecutor>) createPdslProviderFromClass(pdslConfiguration.testRunExecutor(), TEST_RUN_EXECUTOR)
                    : new DefaultExecutorProvider();
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
                    ? (Provider<? extends TraceableTestRunExecutor>) createPdslProviderFromClass(pdslConfiguration.testRunExecutor(), TEST_RUN_EXECUTOR)
                    : new DefaultExecutorProvider();
            Provider<? extends TestResourceFinderGenerator> resourceFinder = !pdslConfiguration.resourceFinder().equals(EmptyTestResourceFinder.class)
            ? (Provider<? extends TestResourceFinderGenerator>) createPdslProviderFromClass(pdslConfiguration.resourceFinder(), RESOURCE_FINDER)
                    : new DefaultResourceFinderGenerator(pdslConfiguration.resourceRoot());
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
            PdslConfiguration pdslConfiguration) {

            if(pdslConfiguration.dslRecognizerParser().equals(EmptyRecognizerParser.class)
                    ^ pdslConfiguration.dslRecognizerLexer().equals(EmptyRecognizerLexer.class)) {
                throw new IllegalArgumentException("If a dslRecognizerLexer or dslRecognizerParser is used at all in the @PdslGherkinAnnotation then BOTH of them must be present!");
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java

            if(pdslConfiguration.dslRecognizerParser().equals(EmptyRecognizerParser.class)
                    ^ pdslConfiguration.dslRecognizerLexer().equals(EmptyRecognizerLexer.class)) {
                throw new IllegalArgumentException("If a dslRecognizerLexer or dslRecognizerParser is used at all in the @PdslGherkinAnnotation then BOTH of them must be present!");
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
            this.testRunExecutor = testRunExecutor;
            this.resourceFinder = resourceFinder;
            this.classWideParserRecognizerOptional = pdslConfiguration.dslRecognizerParser().equals(EmptyRecognizerParser.class)
                    ? Optional.empty() : Optional.of(pdslConfiguration.dslRecognizerParser());
            this.classWideLexerRecognizerOptional = pdslConfiguration.dslRecognizerLexer().equals(EmptyRecognizerLexer.class)
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
            this.classWideParserRecognizerOptional = pdslConfiguration.dslRecognizerParser().equals(EmptyRecognizerParser.class)
                    ? Optional.empty() : Optional.of(pdslConfiguration.dslRecognizerParser());
            this.classWideLexerRecognizerOptional = pdslConfiguration.dslRecognizerLexer().equals(EmptyRecognizerLexer.class)
                    ? Optional.empty() : Optional.of(pdslConfiguration.dslRecognizerLexer());
        }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/PdslTestSuite.java`
#### Snippet
```java

        private final List<Runner> runners;
        private final String systemUnderTest;
        private final Optional<Class<? extends TraceableReportGenerator>> reportGenerator;
        private final Map<String /* Application */,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
    private final Provider<? extends TestResourceFinderGenerator> resourceFinderGeneratorProvider;
    private final Provider<? extends TraceableTestRunExecutor> executorProvider;
    private final ExecutorHelper executorHelper;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final String resourceRoot;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;
    private final String classWideRecognizerRule;
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;
    private final String classWideRecognizerRule;
    private final Collection<MetadataTestRunResults> results = new ArrayList<>();
    private final Provider<? extends TestResourceFinderGenerator> resourceFinderGeneratorProvider;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/junit/PdslGherkinJUnit4Runner.java`
#### Snippet
```java
    private final String applicationName;
    private final String resourceRoot;
    private final Optional<? extends Class<? extends Parser>> classWideRecognizerParser;
    private final Optional<? extends Class<? extends Lexer>> classWideRecognizerLexer;
    private final String classWideRecognizerRule;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java

    public static final class DefaultResourceFinderGenerator implements Provider<TestResourceFinderGenerator> {
        private final String resourceRoot;
        public DefaultResourceFinderGenerator(String resourceRoot)
        {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional`> used as type for field 'visitor'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslExecutable.java`
#### Snippet
```java
        private final TestCase pdslTest;
        private final TraceableTestRunExecutor executor;
        private final Optional<ParseTreeVisitor<?>> visitor;
        private final Optional<ParseTreeListener> listener;
        private final String context;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'listener'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslExecutable.java`
#### Snippet
```java
        private final TraceableTestRunExecutor executor;
        private final Optional<ParseTreeVisitor<?>> visitor;
        private final Optional<ParseTreeListener> listener;
        private final String context;

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
    private final List<PickleJarScenario> scenarios;
    private final List<PickleJarRule> rules;
    private final Optional<String> longDescription;

    public PickleJar(Builder builder) {
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
`Optional`> used as type for field 'listener'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
    private final Class<? extends Parser> parser;
    private final Class<? extends Lexer> lexer;
    private final Optional<Supplier<? extends ParseTreeListener>> listener;
    private final Optional<Supplier<? extends ParseTreeVisitor<?>>> visitor;
    private final String tagExpression;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizedByLexer'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
        private Class<? extends Lexer> lexer;
        private Optional<Class<? extends Parser>> recognizedByParser = Optional.empty();
        private Optional<Class<? extends Lexer>> recognizedByLexer = Optional.empty();
        private Optional<Supplier<? extends ParseTreeListener>> listener = Optional.empty();
        private Optional<Supplier<? extends ParseTreeVisitor<?>>> visitor = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'visitor'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
        private Optional<Class<? extends Lexer>> recognizedByLexer = Optional.empty();
        private Optional<Supplier<? extends ParseTreeListener>> listener = Optional.empty();
        private Optional<Supplier<? extends ParseTreeVisitor<?>>> visitor = Optional.empty();
        private String tagExpression = "";
        private String[] includesResources = {"*.feature"};
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recognizerRule'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
    private final String[] excludesResources;
    private final String startRule;
    private final Optional<String> recognizerRule;

    private PdslTestParameter(Builder builder) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'visitor'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
    private final Class<? extends Lexer> lexer;
    private final Optional<Supplier<? extends ParseTreeListener>> listener;
    private final Optional<Supplier<? extends ParseTreeVisitor<?>>> visitor;
    private final String tagExpression;
    private final String[] includesResources;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'listener'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
        private Optional<Class<? extends Parser>> recognizedByParser = Optional.empty();
        private Optional<Class<? extends Lexer>> recognizedByLexer = Optional.empty();
        private Optional<Supplier<? extends ParseTreeListener>> listener = Optional.empty();
        private Optional<Supplier<? extends ParseTreeVisitor<?>>> visitor = Optional.empty();
        private String tagExpression = "";
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recognizerRule'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
        private String[] excludesResources = {};
        private String startRule = DEFAULT_ALL_RULE;
        private Optional<String> recognizerRule = Optional.empty();

        public Builder(
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizedByParser'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
        private Class<? extends Parser> parser;
        private Class<? extends Lexer> lexer;
        private Optional<Class<? extends Parser>> recognizedByParser = Optional.empty();
        private Optional<Class<? extends Lexer>> recognizedByLexer = Optional.empty();
        private Optional<Supplier<? extends ParseTreeListener>> listener = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizedByLexer'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java

    private final Optional<Class<? extends Parser>> recognizedByParser;
    private final Optional<Class<? extends Lexer>> recognizedByLexer;
    private final Class<? extends Parser> parser;
    private final Class<? extends Lexer> lexer;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recognizedByParser'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java
public class PdslTestParameter {

    private final Optional<Class<? extends Parser>> recognizedByParser;
    private final Optional<Class<? extends Lexer>> recognizedByLexer;
    private final Class<? extends Parser> parser;
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
`Optional` used as type for field 'builderOptional'
in `src/main/java/com/pdsl/gherkin/PdslGherkinListenerImpl.java`
#### Snippet
```java

    private static final Set<Character> escapeCharacters = Set.of('\\', '|', 'n');
    private Optional<GherkinFeature.Builder> builderOptional = Optional.empty();

    public Optional<GherkinFeature> getGherkinFeature(URI featurePathOrId) {
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
`Optional` used as type for field 'metadata'
in `src/main/java/com/pdsl/testcases/TestBodyFragment.java`
#### Snippet
```java
public class TestBodyFragment {

    private final Optional<InputStream> metadata;
    private final List<FilteredPhrase> testPhrases;

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
`Optional` used as type for field 'metaData'
in `src/main/java/com/pdsl/testcases/DefaultTestSection.java`
#### Snippet
```java
public class DefaultTestSection implements TestSection {

    private final Optional<InputStream> metaData;
    private final Phrase phrase;

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
        private String title = "";
        private String longDescription = "";
        private Optional<List<GherkinStep>> stepsList = Optional.empty();

        public GherkinScenario build() {
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
`Optional`> used as type for field 'scenarios'
in `src/main/java/com/pdsl/gherkin/models/GherkinRule.java`
#### Snippet
```java
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
`Optional`> used as type for field 'dslRecognizerParser'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
        private String applicationName = "Polymorphic DSL System Under Test";
        private URI resourceRoot = Paths.get("./").toUri();
        private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
        private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
        private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'dslRecognizerLexer'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
        private URI resourceRoot = Paths.get("./").toUri();
        private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
        private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
        private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
        private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'dslRecognizerParser'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private String applicationName = "Polymorphic DSL System Under Test";
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'testRunExecutor'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
    private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'resourceFinder'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
        private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
        private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
        private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
        private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
        private Supplier<? extends TestSpecificationFactoryGenerator> specificationFactoryProvider;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'resourceFinder'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
    private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
    private final Supplier<? extends TestSpecificationFactoryGenerator> specificationFactoryProvider;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'testRunExecutor'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
        private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
        private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
        private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
        private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
        private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'dslRecognizerLexer'
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
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
`Optional``>` used as type for field 'recognizerLexer'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
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
        private PickleJarFactory pickleJarFactory = PickleJarFactory.DEFAULT;
        private Charset charset = Charset.defaultCharset();
        private Optional<? extends Class<? extends Parser>> recognizerParser = Optional.empty();
        private Optional<? extends Class<? extends Lexer>> recognizerLexer = Optional.empty();
        private Optional<String> recognizerRule = Optional.of(RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME);
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
`Optional``>` used as type for field 'recognizerLexer'
in `src/main/java/com/pdsl/gherkin/DefaultGherkinTestSpecificationFactory.java`
#### Snippet
```java
    private final Charset charset;
    private final Optional<? extends Class<? extends Parser>> recognizerParser;
    private final Optional<? extends Class<? extends Lexer>> recognizerLexer;
    private final Optional<String> recognizerRule;

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

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 3, expected: 2)
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGherkinInvocationContextProvider.java`
#### Snippet
```java
                .getTestSpecifications(testResources.stream().collect(Collectors.toUnmodifiableSet()));
        if (testSpecifications.isEmpty()) {
            throw new IllegalStateException(String.format("No test specifications could be produced from the resources!%n"
                            + "Test Specification Factory: %s%n"
                            + "Resources: %s%n", configParameter.getSpecificationFactoryProvider().get().getClass(),
```

### MalformedFormatString
Too many arguments for format string (found: 3, expected: 2)
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGherkinInvocationContextProvider.java`
#### Snippet
```java
        Optional<Collection<TestSpecification>> filteredSpecifications = gherkinTestSpecificationFactory.filterGherkinTestSpecificationsByTagExpression(testSpecifications.get(), pdslTestParameter.getTagExpression());
        if (filteredSpecifications.isEmpty()) {
            throw new IllegalStateException(String.format("All scenarios were filtered out!%n"
            + "Tag Expression: %s%n"
                            + "Resources: %s%n", pdslTestParameter.getTagExpression(),
```

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

### MalformedFormatString
Too many arguments for format string (found: 3, expected: 2)
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGeneralInvocationContextProvider.java`
#### Snippet
```java
                .getTestSpecifications(testResources.stream().collect(Collectors.toUnmodifiableSet()));
        if (testSpecifications.isEmpty()) {
            throw new IllegalStateException(String.format("No test specifications could be produced from the resources!%n"
                            + "Test Specification Factory: %s%n"
                            + "Resources: %s%n", configParameter.getSpecificationFactoryProvider().get().getClass(),
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
Unused import `import com.pdsl.specifications.TestSpecification;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java

import com.pdsl.runners.junit.JUnitConfigurationAccessor;
import com.pdsl.specifications.TestSpecification;
import com.pdsl.specifications.TestSpecificationFactory;
import org.junit.jupiter.engine.descriptor.JupiterDescriptorKey;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.specifications.TestSpecificationFactory;`
in `src/main/java/com/pdsl/runners/PdslConfigurationHelper.java`
#### Snippet
```java
import com.pdsl.runners.junit.JUnitConfigurationAccessor;
import com.pdsl.specifications.TestSpecification;
import com.pdsl.specifications.TestSpecificationFactory;
import org.junit.jupiter.engine.descriptor.JupiterDescriptorKey;

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

### UNUSED_IMPORT
Unused import `import com.pdsl.gherkin.DefaultGherkinTestSpecificationFactory;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.pdsl.executors.TraceableTestRunExecutor;
import com.pdsl.gherkin.DefaultGherkinTestSpecificationFactory;
import com.pdsl.gherkin.specifications.GherkinTestSpecificationFactory;
import com.pdsl.runners.*;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.gherkin.specifications.GherkinTestSpecificationFactory;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
import com.pdsl.executors.TraceableTestRunExecutor;
import com.pdsl.gherkin.DefaultGherkinTestSpecificationFactory;
import com.pdsl.gherkin.specifications.GherkinTestSpecificationFactory;
import com.pdsl.runners.*;
import com.pdsl.specifications.FileDelimitedTestSpecificationFactory;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.specifications.FileDelimitedTestSpecificationFactory;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
import com.pdsl.gherkin.specifications.GherkinTestSpecificationFactory;
import com.pdsl.runners.*;
import com.pdsl.specifications.FileDelimitedTestSpecificationFactory;
import com.pdsl.specifications.LineDelimitedTestSpecificationFactory;
import com.pdsl.specifications.TestResourceFinderGenerator;
```

### UNUSED_IMPORT
Unused import `import com.pdsl.transformers.PolymorphicDslPhraseFilter;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
import com.pdsl.testcases.PreorderTestCaseFactory;
import com.pdsl.testcases.TestCaseFactory;
import com.pdsl.transformers.PolymorphicDslPhraseFilter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGherkinInvocationContextProvider.java`
#### Snippet
```java
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
```

### UNUSED_IMPORT
Unused import `import com.pdsl.runners.PdslTest;`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslTestParameter.java`
#### Snippet
```java

import com.google.common.base.Preconditions;
import com.pdsl.runners.PdslTest;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `results` to `PolymorphicDslTestRunResults` is redundant
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
            logger.error(AnsiTerminalColorHelper.BRIGHT_RED + "There were test failures!" + AnsiTerminalColorHelper.RESET);
        }
        return (PolymorphicDslTestRunResults) results;
    }

```

### RedundantCast
Casting `results` to `PolymorphicDslTestRunResults` is redundant
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
            logger.error(AnsiTerminalColorHelper.BRIGHT_RED + "There were test failures!" + AnsiTerminalColorHelper.RESET);
        }
        return (PolymorphicDslTestRunResults) results;
    }
}
```

### RedundantCast
Casting `results` to `PolymorphicDslTestRunResults` is redundant
in `src/main/java/com/pdsl/executors/DefaultPolymorphicDslTestExecutor.java`
#### Snippet
```java
            logger.error(AnsiTerminalColorHelper.BRIGHT_RED + "There were test failures!" + AnsiTerminalColorHelper.RESET);
        }
        return (PolymorphicDslTestRunResults) results;
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `GherkinFeature`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
 * The PickleJar is roughly analogous to a {@code GherkinFeature}
 * <p>
 * The practical need for a PickleJar is that a {@GherkinFeature} is abstract enough that some further processing is needed
 * to determine what the actual test cases are, particularly with parameter substitutions in the text in the event
 * the scenario or rule has an Example table
```

### JavadocDeclaration
Wrong tag `Code`
in `src/main/java/com/pdsl/gherkin/PickleJar.java`
#### Snippet
```java
     * <p>
     * This scenario may represent a test created from a row from an Examples table, which in turn was from a
     * more abstract {@Code GherkinScenario}
     * <p>
     * In any case the PickleJarScenario does not have any examples table because it is intended to be more concrete,
```

### JavadocDeclaration
Wrong tag `PolymorphicDslTestExecutor`
in `src/main/java/com/pdsl/specifications/TestSpecification.java`
#### Snippet
```java
    /**
     * Returns a list of {@code Phrase}s that may contain a parse tree that will trigger code execution when consumed by a
     * {@PolymorphicDslTestExecutor}.
     * <p>
     * If this TestItem has no child test items then this method <i>must</i> return an optional contiaining a list with
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
     * @param inputStream the input to parse
     * @param syntaxRuleName the ANTLR rule in the provided parser to use for checking hte input
     * @return a new copy of the provided InputStream
     */
    static void checkGrammarValidity(Class<? extends Parser> parserClass, Class<? extends Lexer> lexerClass, InputStream inputStream, String syntaxRuleName) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/pdsl/transformers/TestSpecificationHelper.java`
#### Snippet
```java
     * @param parserClass the ANTLR parser grammar for the input
     * @param lexerClass the ANTLR lexer grammar for tokenizing the input
     * @return
     */
    static Optional<Parser> parserOf(InputStream inputStream, ErrorListenerStrategy strategy, Class<?> parserClass, Class<?> lexerClass) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/pdsl/gherkin/PdslGherkinRecognizer.java`
#### Snippet
```java
     * @param listener        The parse tree listener
     * @return a GherkinFeature matching the contents of the file
     * @throws IOException
     */
    GherkinFeature interpretGherkinFileStrictly(URI gherkinLocation, PdslGherkinListener listener) throws IOException;
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/pdsl/gherkin/PdslGherkinInterpreterImpl.java`
#### Snippet
```java
     * @param gherkinLocation The .feature file to convert to a GherkinFeature object
     * @param listener        The parse tree listener
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/pdsl/gherkin/PdslGherkinInterpreterImpl.java`
#### Snippet
```java
     * @param listener        The parse tree listener
     * @return
     * @throws IOException
     */
    public GherkinFeature interpretGherkinFileStrictly(URI gherkinLocation, PdslGherkinListener listener)
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/pdsl/gherkin/models/GherkinStep.java`
#### Snippet
```java
     * Returns the text content of this step including the docstring xor datatable if present
     *
     * @return
     */
    public String getFullRawStepText() {
```

### JavadocDeclaration
Wrong tag `code{PolymorphicDslTestExecutor}s.`
in `src/main/java/com/pdsl/testcases/TestCaseFactory.java`
#### Snippet
```java
/**
 * A factory that is able to convert TestSpecification objects into TestCases that are used as inputs for
 * @code{PolymorphicDslTestExecutor}s.
 */
public interface TestCaseFactory {
```

### JavadocDeclaration
Wrong tag `TestTemplate.`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGeneralInvocationContextProvider.java`
#### Snippet
```java
    /**
     * Creates InvocationContext using the PDSL test framework to use with a JUnit5
     * @TestTemplate.
     *
     */
```

### JavadocDeclaration
Wrong tag `Override`
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGeneralInvocationContextProvider.java`
#### Snippet
```java
 * 
 *  <pre>
 *   @Override
 *   public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
 *            return getInvocationContext(PdslConfigParameter.createGeneralPdslConfig(testCaseFactorySupplier, testSpecificationFactoryGeneratorSupplier,
```

### JavadocDeclaration
`@param testCases` tag description is missing
in `src/main/java/com/pdsl/executors/PolymorphicDslTestExecutor.java`
#### Snippet
```java
     * and assumes that the parse tree visitor is aware of any possible phrases that would be in the test cases
     *
     * @param testCases
     * @param subgrammarVisitor
     * @return the results of the test run
```

### JavadocDeclaration
`@param subgrammarVisitor` tag description is missing
in `src/main/java/com/pdsl/executors/PolymorphicDslTestExecutor.java`
#### Snippet
```java
     *
     * @param testCases
     * @param subgrammarVisitor
     * @return the results of the test run
     */
```

### JavadocDeclaration
`@param testCases` tag description is missing
in `src/main/java/com/pdsl/executors/PolymorphicDslTestExecutor.java`
#### Snippet
```java
     * and assumes that the parse tree listener is aware of any possible phrases that would be in the test cases
     *
     * @param testCases
     * @param subgrammarListener
     * @return the results of the test run
```

### JavadocDeclaration
`@param subgrammarListener` tag description is missing
in `src/main/java/com/pdsl/executors/PolymorphicDslTestExecutor.java`
#### Snippet
```java
     *
     * @param testCases
     * @param subgrammarListener
     * @return the results of the test run
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/pdsl/testcases/TestCase.java`
#### Snippet
```java
     *
     * No metadata or any other residual data from the original test resource this test case was created from is included.
     * @return
     */
    List<String> getUnfilteredPhraseBody();
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/main/java/com/pdsl/testcases/TestCase.java`
#### Snippet
```java
 * An executable test for PDSL to process with a test case executor of some kind.
 *
 * @see {com.pdsl.executors.TraceableTestRunExecutor}
 */
public interface TestCase {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/pdsl/testcases/TestCase.java`
#### Snippet
```java
     * {@link #getContextFilteredTestSectionIterator()}.
     *
     * @return
     */
    List<String> getContextFilteredPhraseBody();
```

### JavadocDeclaration
Wrong tag `link:com.pdsl.runners.junit.PdslJUnit4ConfigurableRunner`
in `src/main/java/com/pdsl/runners/PdslConfiguration.java`
#### Snippet
```java

/**
 * A configuration to be used by a PDSL test runner, such as {@link:com.pdsl.runners.junit.PdslJUnit4ConfigurableRunner}.
 *
 * If a <b>resourceRoot</b> is specified it will be prepended to all <i>includes</i> and </i>excludes</i> in every underlying
```

### JavadocDeclaration
Wrong tag `PdslTest.`
in `src/main/java/com/pdsl/runners/PdslConfiguration.java`
#### Snippet
```java
 *
 * If a <b>resourceRoot</b> is specified it will be prepended to all <i>includes</i> and </i>excludes</i> in every underlying
 * @PdslTest.
 *
 * If <b>dslRecognizerParser</b> and <b>dslRecognizerLexer</b> are specified they will be used as recognizers on all
```

### JavadocDeclaration
Wrong tag `PdslTest`
in `src/main/java/com/pdsl/runners/PdslConfiguration.java`
#### Snippet
```java
 *
 * If <b>dslRecognizerParser</b> and <b>dslRecognizerLexer</b> are specified they will be used as recognizers on all
 * @PdslTest grammars <i>unless</i> a @RecognizedBy annotation is also specified on the same method as the @PdslTest.
 *
 * <b>specificationFactoryProvider</b> is a required field that tells the framework how to convert to divide the
```

### JavadocDeclaration
Wrong tag `Foo`
in `src/main/java/com/pdsl/gherkin/filter/GherkinTagFilterer.java`
#### Snippet
```java
 * For example, the following test would match the tag expression "@Foo and not @Bazz" but not "@Gralt and @Foo":
 *
 * @Foo @Bar
 * Scenario: Some scenario
 *    Given some step
```

### JavadocDeclaration
`@param testInput` tag description is missing
in `src/main/java/com/pdsl/transformers/PolymorphicDslPhraseFilter.java`
#### Snippet
```java
     * Some phrases may be filtered out because they are deemed irrelevant to some context by the underlying grammar.
     *
     * @param testInput
     * @return An optional containing the FilteredPhrases which indicate whether or not they were recognized by the grammar
     */
```

### JavadocDeclaration
Wrong tag `GherkinRule`
in `src/main/java/com/pdsl/gherkin/models/GherkinBackground.java`
#### Snippet
```java

/**
 * A background that contains shared functionality with lower level {@code GherkinScenario} or {@GherkinRule}s.
 */
public class GherkinBackground {
```

### JavadocDeclaration
`@param pdslTest` tag description is missing
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
     * If neither are provided a runtime exception will be thrown.
     *
     * @param pdslTest
     * @return a ParseTreeTraversal containing either a visitor or listener instance.
     */
```

### JavadocDeclaration
`@param pdslTest` tag description is missing
in `src/main/java/com/pdsl/runners/ExecutorHelper.java`
#### Snippet
```java
    /**
     * @deprecated use getParseTreeTraversal instead. This will be removed in a future major release.
     * @param pdslTest
     * @return the ParseTreeListener made from the listenerProvider in the pdslTest
     */
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

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `phraseFilter` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGeneralInvocationContextProvider.java`
#### Snippet
```java
        // Otherwise use the recognizer specified in the configuration. If none specified, the parser used by the
        // pdslTest will be used as the recognizer as well.
        PolymorphicDslPhraseFilter phraseFilter = executorHelper.makeDefaultFilter(pdslTestParameter.getParser(),
                pdslTestParameter.getLexer(),
                configParameter.getDslRecognizerParser().isPresent() ? configParameter.getDslRecognizerParser().get() : pdslTestParameter.getParser(),
```

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
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            application_ = s;
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

## RuleId[id=UnusedAssignment]
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
Variable `accumulator` initializer `1` is redundant
in `src/main/java/com/pdsl/runners/junit/PdslExecutorRunner.java`
#### Snippet
```java
    private final List<MetadataTestRunResults> metadataTestRunResults;

    private int accumulator = 1;

    PdslExecutorRunner(Class<?> testClass, ParseTreeListener parseTreeListener, Collection<TestCase> testCases, TraceableTestRunExecutor executor, String context) throws InitializationError {
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
Variable `applicationName` initializer `"Polymorphic DSL System Under Test"` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java

    private String context = "Unspecified";
    private String applicationName = "Polymorphic DSL System Under Test";
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
```

### UnusedAssignment
Variable `recognizerRule` initializer `RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
    private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
    private final Supplier<? extends TestSpecificationFactoryGenerator> specificationFactoryProvider;
    private final Supplier<? extends TestCaseFactory> testCaseFactoryProvider;
```

### UnusedAssignment
Variable `resourceRoot` initializer `Paths.get("./").toUri()` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private String context = "Unspecified";
    private String applicationName = "Polymorphic DSL System Under Test";
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
```

### UnusedAssignment
Variable `context` initializer `"Unspecified"` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
public class PdslConfigParameter {

    private String context = "Unspecified";
    private String applicationName = "Polymorphic DSL System Under Test";
    private URI resourceRoot = Paths.get("./").toUri();
```

### UnusedAssignment
Variable `dslRecognizerParser` initializer `Optional.empty()` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private String applicationName = "Polymorphic DSL System Under Test";
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
```

### UnusedAssignment
Variable `testRunExecutor` initializer `Optional.empty()` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
    private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
```

### UnusedAssignment
Variable `resourceFinder` initializer `Optional.empty()` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
    private String recognizerRule = RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
    private final Supplier<? extends TestSpecificationFactoryGenerator> specificationFactoryProvider;
```

### UnusedAssignment
Variable `dslRecognizerLexer` initializer `Optional.empty()` is redundant
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslConfigParameter.java`
#### Snippet
```java
    private URI resourceRoot = Paths.get("./").toUri();
    private Optional<Class<? extends Parser>> dslRecognizerParser = Optional.empty();
    private Optional<Class<? extends Lexer>> dslRecognizerLexer = Optional.empty();
    private Optional<Supplier<? extends TraceableTestRunExecutor>> testRunExecutor = Optional.empty();
    private Optional<Supplier<? extends TestResourceFinderGenerator>> resourceFinder = Optional.empty();
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

## RuleId[id=ConstantValue]
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
in `src/main/java/com/pdsl/reports/proto/OperationalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getApplication()
        .equals(other.getApplication());
    result = result && getTacticalReportDataList()
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
in `src/main/java/com/pdsl/reports/proto/TechnicalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getTestCaseTitle()
        .equals(other.getTestCaseTitle());
    result = result && status_ == other.status_;
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
in `src/main/java/com/pdsl/reports/proto/TacticalReportData.java`
#### Snippet
```java

    boolean result = true;
    result = result && getUnfilteredPhraseBodyList()
        .equals(other.getUnfilteredPhraseBodyList());
    result = result && internalGetContextToTestCases().equals(
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslExecutable.java`
#### Snippet
```java
        public MetadataTestRunResults execute() {
            MetadataTestRunResults results = results = visitor.isPresent() ? executor.runTestsWithMetadata(List.of(pdslTest), visitor.get(), context)
                    : executor.runTestsWithMetadata(List.of(pdslTest), listener.get(), context);

            if (results.failingTestTotal() > 0) {
```

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
in `src/main/java/org/junit/jupiter/engine/descriptor/PdslGeneralInvocationContextProvider.java`
#### Snippet
```java
        }
        return new PdslExecutable(testCase, executor,
                pdslTestParameter.getListener().get().get(), parameter.getContext());
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

