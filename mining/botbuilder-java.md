# botbuilder-java 
 
# Bad smells
I found 2319 bad smells with 89 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 531 | false |
| FieldMayBeFinal | 291 | false |
| DataFlowIssue | 153 | false |
| JavadocReference | 151 | false |
| UNCHECKED_WARNING | 109 | false |
| ConstantValue | 75 | false |
| UNUSED_IMPORT | 73 | false |
| RedundantCast | 68 | false |
| ArraysAsListWithZeroOrOneArgument | 68 | false |
| OptionalGetWithoutIsPresent | 61 | false |
| FieldCanBeLocal | 56 | false |
| DuplicatedCode | 56 | false |
| UnnecessaryLocalVariable | 54 | true |
| UnusedAssignment | 48 | false |
| WrapperTypeMayBePrimitive | 41 | false |
| JavadocDeclaration | 39 | false |
| StringEquality | 38 | false |
| StringOperationCanBeSimplified | 30 | false |
| JavadocLinkAsPlainText | 27 | false |
| WrongPackageStatement | 25 | false |
| NullableProblems | 24 | false |
| IntegerMultiplicationImplicitCastToLong | 15 | false |
| SimplifyStreamApiCallChains | 15 | false |
| NonFinalFieldInEnum | 12 | false |
| RedundantMethodOverride | 12 | false |
| RedundantCompareToJavaTime | 12 | false |
| DuplicateCondition | 10 | false |
| UnnecessaryModifier | 9 | true |
| TypeParameterExtendsObject | 9 | false |
| MismatchedJavadocCode | 9 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 8 | false |
| TrivialIf | 8 | false |
| CastCanBeRemovedNarrowingVariableType | 8 | false |
| ToArrayCallWithZeroLengthArrayArgument | 7 | true |
| CommentedOutCode | 7 | false |
| DuplicateBranchesInSwitch | 6 | false |
| IfStatementMissingBreakInLoop | 6 | false |
| OptionalIsPresent | 6 | false |
| CatchMayIgnoreException | 6 | false |
| UnnecessaryToStringCall | 6 | true |
| ManualMinMaxCalculation | 5 | false |
| AccessStaticViaInstance | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| AutoCloseableResource | 5 | false |
| RegExpSingleCharAlternation | 5 | false |
| EmptyStatementBody | 4 | false |
| UastIncorrectHttpHeaderInspection | 4 | false |
| DuplicateExpressions | 4 | false |
| NumberEquality | 4 | false |
| StringConcatenationInLoops | 4 | false |
| UnnecessarySemicolon | 4 | false |
| UseBulkOperation | 4 | false |
| StringBufferReplaceableByString | 3 | false |
| IgnoreResultOfCall | 3 | false |
| RedundantLengthCheck | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| ReplaceOnLiteralHasNoEffect | 3 | false |
| IOStreamConstructor | 3 | false |
| DanglingJavadoc | 3 | false |
| NewObjectEquality | 3 | false |
| UnnecessaryStringEscape | 2 | true |
| FinalPrivateMethod | 2 | false |
| UnnecessaryReturn | 2 | true |
| TrivialStringConcatenation | 2 | false |
| FinalizeNotProtected | 2 | false |
| FuseStreamOperations | 2 | false |
| RedundantStringFormatCall | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| RegExpDuplicateAlternationBranch | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| BusyWait | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| RefusedBequest | 1 | false |
| RegExpSimplifiable | 1 | false |
| SillyAssignment | 1 | false |
| RedundantTypeArguments | 1 | false |
| MalformedFormatString | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| OptionalAssignedToNull | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| UnpredictableBigDecimalConstructorCall | 1 | false |
| PointlessBooleanExpression | 1 | true |
| UnstableApiUsage | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new QueryResult\[queryResults.size()\]'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
    public QueryResult[] getLowScoreVariation(QueryResult[] queryResult) {
        List<QueryResult> queryResults = ActiveLearningUtils.getLowScoreVariation(Arrays.asList(queryResult));
        return queryResults.toArray(new QueryResult[queryResults.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Metadata\[filters.size()\]'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerRecognizer.java`
#### Snippet
```java
        options.setContext(context);
        options.setScoreThreshold(threshold);
        options.setStrictFilters(filters.toArray(new Metadata[filters.size()]));
        options.setTop(top);
        options.setQnAId(qnAId);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new QueryResult\[answerList.size()\]'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
            .filter(answer -> answer.getScore() > options.getScoreThreshold())
            .collect(Collectors.toList());
        results.setAnswers(answerList.toArray(new QueryResult[answerList.size()]));

        return CompletableFuture.completedFuture(results);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[sends.size()\]'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java
                }

                return CompletableFuture.allOf(sends.toArray(new CompletableFuture[sends.size()]));
            }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[resolved.size()\]'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            // Track any path that resolves to a constant path
            ArrayList<Object> resolved = ObjectPath.tryResolvePath(this, tpath);
            String[] segments = resolved.toArray(new String[resolved.size()]);
            if (resolved != null) {
                String npath = String.join("_", segments);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Match\[matches.size()\]'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java
        }

        return matches.toArray(new Match[matches.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Match\[realMatches.size()\]'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java
        });

        return realMatches.toArray(new Match[realMatches.size()]);
    }

```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
                // we are at the root and we should not send an EoC.
                return skillConversationReference
                        .getOAuthScope() != AuthenticationConstants.TO_CHANNEL_FROM_BOT_OAUTH_SCOPE
                        && skillConversationReference
                                .getOAuthScope() != GovernmentAuthenticationConstants.TO_CHANNEL_FROM_BOT_OAUTH_SCOPE;
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
                        .getOAuthScope() != AuthenticationConstants.TO_CHANNEL_FROM_BOT_OAUTH_SCOPE
                        && skillConversationReference
                                .getOAuthScope() != GovernmentAuthenticationConstants.TO_CHANNEL_FROM_BOT_OAUTH_SCOPE;
            }
            return true;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        final String uCaseName = name.toUpperCase();
        MemoryScope scope = configuration.getMemoryScopes().stream().filter((s) -> {
            return s.getName().toUpperCase() == uCaseName;
        }).findFirst().get();
        if (scope != null) {
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModels.java`
#### Snippet
```java
        final String cCode = cultureCode;

        if (SUPPORTED_LOCALES.stream().allMatch(o -> o != cCode)) {
            // Handle cases like EnglishOthers with cultureCode "en-*"
            List<String> fallbackCultureCodes = SUPPORTED_LOCALES.stream()
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
            add(RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor2));
            add(RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor3));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4));
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5));
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6));
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7));
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
        }

        if (result.getTimex() != "") {
            result.setResult(true);
        }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
        }

        if (result.getTimex() != "") {
            result.setResult(true);
        }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseSetParser.java`
#### Snippet
```java
                Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(this.config.getEachUnitRegex(), text)).findFirst();

                if (exactMatch.getMatch().get().getGroup("other").value != "") {
                    result.setTimex(result.getTimex().replace("1", "2"));
                }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
        }

        if (result.getTimex() != "") {
            result.setResult(true);
        }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
        }

        if (result.getTimex() != "") {
            result.setResult(true);
        }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
    private String combineMod(String originalMod, String newMod) {
        String combinedMod = newMod;
        if (originalMod != null && originalMod != "") {
            combinedMod = newMod + "-" + originalMod;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
    private boolean isBeforeOrAfterMod(String mod) {
        return !StringUtility.isNullOrEmpty(mod) &&
                (mod == Constants.BEFORE_MOD || mod == Constants.AFTER_MOD);
    }

```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
    private boolean isBeforeOrAfterMod(String mod) {
        return !StringUtility.isNullOrEmpty(mod) &&
                (mod == Constants.BEFORE_MOD || mod == Constants.AFTER_MOD);
    }

```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateExtractorConfiguration.java`
#### Snippet
```java
        };

        boolean enableDmy = getDmyDateFormat() || SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_DMY;

        if (enableDmy) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/AgoLaterUtil.java`
#### Snippet
```java
        String timex = durationParseResult.getTimexStr();

        if (((DateTimeResolutionResult)durationParseResult.getValue()).getMod() == Constants.MORE_THAN_MOD) {
            ret.setMod(Constants.MORE_THAN_MOD);
        } else if (((DateTimeResolutionResult)durationParseResult.getValue()).getMod() == Constants.LESS_THAN_MOD) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/AgoLaterUtil.java`
#### Snippet
```java
        if (((DateTimeResolutionResult)durationParseResult.getValue()).getMod() == Constants.MORE_THAN_MOD) {
            ret.setMod(Constants.MORE_THAN_MOD);
        } else if (((DateTimeResolutionResult)durationParseResult.getValue()).getMod() == Constants.LESS_THAN_MOD) {
            ret.setMod(Constants.LESS_THAN_MOD);
        }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseSetExtractor.java`
#### Snippet
```java
                    if (er.getStart() <= match.index && er.getText().contains(match.getGroup("weekday").value)) {
                        int len = er.getLength() + 1;
                        if (match.getGroup(Constants.PrefixGroupName).value != "") {
                            len += match.getGroup(Constants.PrefixGroupName).value.length();
                        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
        for (ExtractResult er : ers) {
            // if it is a multiple duration and its type is equal to Date then skip it.
            if (er.getData() != null && er.getData().toString() == Constants.MultipleDuration_Date) {
                continue;
            }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ExtractResult ersI = ers.get(i);
            ExtractResult ersJ = ers.get(j);
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ExtractResult ersI = ers.get(i);
            ExtractResult ersJ = ers.get(j);
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ExtractResult ersJ = ers.get(j);
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ExtractResult ersJ = ers.get(j);
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
                int middleEnd = ersJ != null ? ersJ.getStart() : 0;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            if (ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == Constants.SYS_DATETIME_TIME ||
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
                int middleEnd = ersJ != null ? ersJ.getStart() : 0;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
                boolean valid = false;
                // for cases like "tomorrow 3",  "tomorrow at 3"
                if (ersJ.getType() == SYS_NUM_INTEGER) {
                    Optional<Match> matches = Arrays.stream(RegExpUtility.getMatches(this.config.getDateNumberConnectorRegex(), input)).findFirst();
                    if (StringUtility.isNullOrEmpty(middleStr) || matches.isPresent()) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
            if (c == '.' || c == ':') {
                if (!StringUtils.isBlank(number)) {
                    number = number == "0" ? number : StringUtility.trimStart(number, "^[0]+","");
                    number = StringUtils.isBlank(number) ? "0" : number;
                    result += number;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
                number += c.toString();
                if (i == text.length() - 1) {
                    number = number == "0" ? number : StringUtility.trimStart(number, "^[0]+","");
                    number = StringUtils.isBlank(number) ? "0" : number;
                    result += number;
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
            int startSymbolLength = -1;

            if (symbolMatch.value != "" && symbolMatch.index == 0 && symbolMatch.length > startSymbolLength) {
                startSymbolLength = symbolMatch.length;
            }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
        // For alternative entities sequence which are all DatePeriod, we should create metadata even if context is null
        return (contextEr != null ||
            (originalErs.get(0).getType() == Constants.SYS_DATETIME_DATEPERIOD && originalErs.get(originalErs.size() - 1).getType() == Constants.SYS_DATETIME_DATEPERIOD));
    }

```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
        // For alternative entities sequence which are all DatePeriod, we should create metadata even if context is null
        return (contextEr != null ||
            (originalErs.get(0).getType() == Constants.SYS_DATETIME_DATEPERIOD && originalErs.get(originalErs.size() - 1).getType() == Constants.SYS_DATETIME_DATEPERIOD));
    }

```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
        for (int i = 0; i < ers.size(); i++) {
            ExtractResult er = ers.get(i);
            if ((BasePhoneNumberExtractor.countDigits(er.getText()) < 7 && er.getData().toString() != "ITPhoneNumber") ||
                Pattern.matches(SSN_FILTER_REGEX.toString(), er.getText())) {
                ers.remove(er);
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexParsing.java`
#### Snippet
```java
    public static void parseString(String timex, TimexProperty timexProperty) {
        // a reference to the present
        if (timex == "PRESENT_REF") {
            timexProperty.setNow(true);
        } else if (timex.startsWith("P")) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
    public static Boolean extract(String name, String timex, Map<String, String> result) {
        String lowerName = name.toLowerCase();
        String[] nameGroup = new String[lowerName == DATE_TIME_COLLECTION_NAME ? 2 : 1];

        if (lowerName == DATE_TIME_COLLECTION_NAME) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
        String[] nameGroup = new String[lowerName == DATE_TIME_COLLECTION_NAME ? 2 : 1];

        if (lowerName == DATE_TIME_COLLECTION_NAME) {
            nameGroup[0] = DATE_COLLECTION_NAME;
            nameGroup[1] = TIME_COLLECTION_NAME;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
        }

        if (numbers.size() > 0  && this.config.getExtractType() == Constants.SYS_UNIT_CURRENCY && prefixMatch.size() > 0 && suffixMatch.size() > 0) {

            for (ExtractResult number : numbers) {
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
        suffix = suffix == null ? new String() : suffix;

        Integer firstIllegalCharIndex = StringUtils.indexOfAny(key, new String(ILLEGAL_KEYS));

        // If there are no illegal characters, and the key is within length costraints,
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java

        // Add all good characters up to the first bad character to the builder first
        for (Integer index = 0; index < firstIllegalCharIndex; index++) {
            sanitizedKeyBuilder.append(key.charAt(index));
        }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
        // replacing any bad ones with
        // their designated replacement value from the
        for (Integer index = firstIllegalCharIndex; index < key.length(); index++) {
            Character ch = key.charAt(index);

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java

    private CompletableFuture<Object> innerReadBlob(BlobClient blobReference) {
        Integer i = 0;
        while (true) {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
        long secsDiff = Math.subtractExact(end.getEpochSecond(), begin.getEpochSecond());
        long totalHundredNanos = Math.multiplyExact(secsDiff, multipleProductValue);
        final Long ticks = Math.addExact(totalHundredNanos, (end.getNano() - begin.getNano()) / 100);
        return Long.toString(ticks, longRadix);
    }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
        String property = (String) segment;
        if (obj instanceof Map) {
            Boolean wasSet = false;
            Map<String, Object> dict = (Map<String, Object>) obj;
            for (String key : dict.keySet()) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                if (classOfNumber.getSimpleName().equals("Float")) {
                    try {
                        Float value = Float.parseFloat(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                } else if (classOfNumber.getSimpleName().equals("Integer")) {
                    try {
                        Integer value = Integer.parseInt(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                } else if (classOfNumber.getSimpleName().equals("Long")) {
                    try {
                        Long value = Long.parseLong(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                } else if (classOfNumber.getSimpleName().equals("Double")) {
                    try {
                        Double value = Double.parseDouble(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java

    private Boolean trackChange(String path, Object value) {
        Boolean hasPath = false;
        ArrayList<Object> segments = ObjectPath.tryResolvePath(this, path, false);
        if (segments != null) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
     */
    public Boolean anyPathChanged(int counter, Iterable<String> paths) {
        Boolean found = false;
        if (paths != null) {
            for (String path : paths) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
    private CompletableFuture<Boolean> validateContext(DialogContext dc, Map<String, Object> state,
            PromptOptions options, PromptRecognizerResult<T> recognized) {
        Boolean isValid = false;
        if (validator != null) {
            PromptValidatorContext<T> promptContext = new PromptValidatorContext<T>(dc.getContext(), recognized, state,
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDateParserConfiguration.java`
#### Snippet
```java

        String trimmedText = text.trim().toLowerCase();
        Integer swift = 0;

        Optional<Match> matchNext = Arrays.stream(RegExpUtility.getMatches(nextPrefixRegex, trimmedText)).findFirst();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
        Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(config.getNumberCombinedWithUnit(), text)).findFirst();
        if (match.isPresent()) {
            Double numVal = Double.parseDouble(match.get().getGroup("num").value) + parseNumberWithUnitAndSuffix(suffixStr);
            String numStr = StringUtility.format(numVal);

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        }

        Boolean noYear = false;
        if (year == 0) {
            year = referenceDate.getYear();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        int day = 0;
        int year = referenceDate.getYear();
        Boolean ambiguous = true;

        List<ExtractResult> er = this.config.getOrdinalExtractor().extract(trimmedText);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        String weekdayStr = match.get().getGroup("weekday").value;
        String monthStr = match.get().getGroup("month").value;
        Boolean noYear = false;
        int year;

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
    public static String generateDatePeriodTimex(LocalDateTime begin, LocalDateTime end, DatePeriodTimexType timexType,
                                                 LocalDateTime alternativeBegin, LocalDateTime alternativeEnd) {
        Boolean equalDurationLength;
        if (alternativeBegin == null || alternativeEnd == null) {
            equalDurationLength = true;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
                    // Cases like "from 3:30 to 4 on 1/1/2015" should be supported
                    // Cases like "from 3:30 to 4 people" is considered not valid
                    Boolean endWithValidToken = false;

                    // "No extra tokens after the time period"
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
        Match[] elementMatch = RegExpUtility.getMatches(GUID_ELEMENT_REGEX, textGUID);
        if (elementMatch.length > 0) {
            Integer startIndex = elementMatch[0].index;
            String guidElement = elementMatch[0].value;
            score -= startIndex == 0 ? NO_BOUNDARY_PENALTY : 0;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
        Match[] formatMatches = RegExpUtility.getMatches(FORMAT_INDICATOR_REGEX, phoneNumberText);
        if (formatMatches.length > 0) {
            Integer formatIndicatorCount = formatMatches.length;
            score += Math.min(formatIndicatorCount, MAX_FORMAT_INDICATOR_NUM) * FORMATTED_AWARD;
            Boolean anyMatch = Arrays.stream(formatMatches).anyMatch(match -> match.value.length() > 1);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
            Integer formatIndicatorCount = formatMatches.length;
            score += Math.min(formatIndicatorCount, MAX_FORMAT_INDICATOR_NUM) * FORMATTED_AWARD;
            Boolean anyMatch = Arrays.stream(formatMatches).anyMatch(match -> match.value.length() > 1);
            score -= anyMatch ? CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE : 0;
            if (Pattern.matches(SINGLE_BRACKER_REGEX, phoneNumberText) && !Pattern.matches(COMPLETE_BRACKET_REGEX, phoneNumberText)) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
        String number = new String();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            if (c == '.' || c == ':') {
                if (!StringUtils.isBlank(number)) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java

            if (BasePhoneNumberExtractor.countDigits(er.getText()) == 15) {
                Boolean flag = false;
                for (String numSpan : er.getText().split(" ")) {
                    if (BasePhoneNumberExtractor.countDigits(numSpan) == 4 || BasePhoneNumberExtractor.countDigits(numSpan) == 3) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
                    if (SPECIAL_BOUNDARY_MARKERS.contains(ch) &&
                        BasePhoneNumberExtractor.checkFormattedPhoneNumber(er.getText()) && er.getStart() >= 2) {
                        Character charGap = text.charAt(er.getStart() - 2);
                        if (!Character.isDigit(charGap) && !Character.isWhitespace(charGap)) {
                            // check if the extracted string has a non-digit string before "-".
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
                        if (!Character.isDigit(charGap) && !Character.isWhitespace(charGap)) {
                            // check if the extracted string has a non-digit string before "-".
                            Boolean flag = Pattern.matches("^[^0-9]+$", text.substring(0, er.getStart() - 2));

                            // Handle cases like "91a-677-0060".
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexParsing.java`
#### Snippet
```java

    private static void extractDateTime(String s, TimexProperty timexProperty) {
        Integer indexOfT = s.indexOf("T");

        if (indexOfT == -1) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
        }

        Boolean anyTrue = false;
        for (String nameItem : nameGroup) {
            for (Pattern entry : TIMEX_REGEX.get(nameItem)) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexDateHelpers.java`
#### Snippet
```java
            Integer dayOfWeek = TimexDateHelpers.getUSDayOfWeek(ds.getDayOfWeek());

            Integer isoDayOfWeek = (dayOfWeek == 0) ? 7 : dayOfWeek;
            if (isoDayOfWeek == 7) {
                weeks++;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexRelativeConvertEnglish.java`
#### Snippet
```java

    private static String getDateDay(DayOfWeek day) {
        Integer index = (day.getValue() == 0) ? 6 : day.getValue() - 1;
        return TimexConstantsEnglish.DAYS[index];
    }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java

    public static String generateCompoundDurationTimex(List<String> timexList) {
        Boolean isTimeDurationAlreadyExist = false;
        StringBuilder timexBuilder = new StringBuilder(Constants.GENERAL_PERIOD_PREFIX);

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        // https://en.wikipedia.org/wiki/ISO_8601
        LocalDateTime jan1 = LocalDateTime.of(year, 1, 1, 0, 0);
        Integer daysOffset = DayOfWeek.MONDAY.getValue() - TimexDateHelpers.getUSDayOfWeek(jan1.getDayOfWeek());
        LocalDateTime firstWeekDay = jan1;
        firstWeekDay = firstWeekDay.plusDays(daysOffset);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java

        TemporalField woy = WeekFields.ISO.weekOfYear();
        Integer firstWeek = jan1.get(woy);

        if ((firstWeek <= 1 || firstWeek >= 52) && daysOffset >= -3) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java

        if (result.getHour() != null && result.getHour() > 23) {
            Double days = Math.floor(result.getHour() / 24d);
            Integer hour = result.getHour() % 24;
            result.setHour(hour);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
    private static String nextDateValue(TimexProperty timex, LocalDateTime date) {
        if (timex.getDayOfMonth() != null) {
            Integer year = date.getYear();
            Integer month = date.getMonth().getValue();
            if (timex.getMonth() != null) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
    private static String lastDateValue(TimexProperty timex, LocalDateTime date) {
        if (timex.getDayOfMonth() != null) {
            Integer year = date.getYear();
            Integer month = date.getMonth().getValue();
            if (timex.getMonth() != null) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java

            if (timex.getMonth() != null) {
                Integer y = date.getYear();
                Pair<String, String> lastYearDateRange = TimexResolver.monthDateRange(y - 1, timex.getMonth());
                Pair<String, String> thisYearDateRange = TimexResolver.monthDateRange(y, timex.getMonth());
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
                int start = number.getStart();
                int length = number.getLength();
                Boolean numberPrefix = false;
                Boolean numberSuffix = false;

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
                int length = number.getLength();
                Boolean numberPrefix = false;
                Boolean numberSuffix = false;

                for (Matcher match : prefixMatch) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
    public Boolean isFromStreamingConnection() {
        if (serviceUrl != null) {
            Boolean isHttp = this.getServiceUrl().toLowerCase().startsWith("http");
            return !isHttp;
        }
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `matched` are written to, but never read
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java

        Map<Integer, PrefixUnitResult> mappingPrefix = new HashMap<Integer, PrefixUnitResult>();
        boolean[] matched = new boolean[source.length()];
        Arrays.fill(matched, false);
        List<ExtractResult> numbers = this.config.getUnitNumExtractor().extract(source);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/config/IChoiceParserConfiguration.java`
#### Snippet
```java

public interface IChoiceParserConfiguration<T> {
    public Map<String, Boolean> getResolutions();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IBooleanExtractorConfiguration.java`
#### Snippet
```java
    public Pattern getTrueRegex();

    public Pattern getFalseRegex();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IBooleanExtractorConfiguration.java`
#### Snippet
```java

public interface IBooleanExtractorConfiguration extends IChoiceExtractorConfiguration {
    public Pattern getTrueRegex();

    public Pattern getFalseRegex();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IChoiceExtractorConfiguration.java`
#### Snippet
```java
    public boolean getAllowPartialMatch();

    public int getMaxDistance();

    public boolean getOnlyTopMatch();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IChoiceExtractorConfiguration.java`
#### Snippet
```java
    public int getMaxDistance();

    public boolean getOnlyTopMatch();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IChoiceExtractorConfiguration.java`
#### Snippet
```java

public interface IChoiceExtractorConfiguration {
    public Map<Pattern, String> getMapRegexes();

    public Pattern getTokenRegex();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IChoiceExtractorConfiguration.java`
#### Snippet
```java
    public Map<Pattern, String> getMapRegexes();

    public Pattern getTokenRegex();

    public boolean getAllowPartialMatch();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/IChoiceExtractorConfiguration.java`
#### Snippet
```java
    public Pattern getTokenRegex();

    public boolean getAllowPartialMatch();

    public int getMaxDistance();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/StringReplacerCallback.java`
#### Snippet
```java

public interface StringReplacerCallback {
    public String replace(Matcher match);
}

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishTimeParserConfiguration.java`
#### Snippet
```java
        }

        if (trimmedPrefix.endsWith("pasadas") || trimmedPrefix.endsWith("pasados") || trimmedPrefix.endsWith("pasadas las") ||
            trimmedPrefix.endsWith("pasados las") || trimmedPrefix.endsWith("pasadas de las") || trimmedPrefix.endsWith("pasados de las")) {
            //deltaMin is positive
```

### EmptyStatementBody
`if` statement has empty body
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
            methods.add(config.getDateExtractor()::extract);

        } else if (firstEntityType.equals(Constants.SYS_DATETIME_DATEPERIOD) && lastEntityType.equals(Constants.SYS_DATETIME_DATEPERIOD)) {

            // For alt entities that are all DatePeriod, no need to share context
```

### EmptyStatementBody
`while` statement has empty body
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConstraintsHelper.java`
#### Snippet
```java
        List<DateRange> r = ranges;

        while (TimexConstraintsHelper.innerCollapseDateRanges(r)) {

        }
```

### EmptyStatementBody
`while` statement has empty body
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConstraintsHelper.java`
#### Snippet
```java
        List<TimeRange> r = ranges;

        while (TimexConstraintsHelper.innerCollapseTimeRanges(r)) {

        }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/CharacterWriter.java`
#### Snippet
```java
    public String write() {
        return String.format(
                "    public static final Character %s = \'%s\';",
                this.name,
                sanitize(String.valueOf(this.value)));
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/CharacterWriter.java`
#### Snippet
```java
    public String write() {
        return String.format(
                "    public static final Character %s = \'%s\';",
                this.name,
                sanitize(String.valueOf(this.value)));
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (25 lines)
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/BotFrameworkClient.java`
#### Snippet
```java
public abstract class BotFrameworkClient {

    // /**
    //  * Forwards an activity to a skill (bot).
    //  *
```

### CommentedOutCode
Commented out code (5 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
        return null;
// TODO default object
//        try {
//            return singleObject.newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
```

### CommentedOutCode
Commented out code (45 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialog.java`
#### Snippet
```java
    }

    // private CompletableFuture<Boolean> interceptOAuthCards(TurnContext turnContext, Activity activity,
    //         String connectionName) {

```

### CommentedOutCode
Commented out code (8 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModels.java`
#### Snippet
```java
                                                               .map(x -> x.getLocale()).collect(Collectors.toList());

    // private static List<String> supportedlocales;

    // static {
```

### CommentedOutCode
Commented out code (2 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
            // clone the prompt the set in the options (note ActivityEx has Properties so
            // this is the safest mechanism)
            // prompt =
            // JsonConvert.DeserializeObject<Activity>(JsonConvert.SerializeObject(prompt));
            prompt = Activity.clone(prompt);
```

### CommentedOutCode
Commented out code (2 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchTimePeriodExtractorConfiguration.java`
#### Snippet
```java
        .getSafeRegExp(FrenchDateTime.SpecificTimeBetweenAnd);
    //    TODO: What are these?
    //    public static final Pattern UnitRegex = RegExpUtility.getSafeRegExp(FrenchDateTime.UnitRegex);
    //    public static final Pattern FollowedUnit = RegExpUtility.getSafeRegExp(FrenchDateTime.FollowedUnit);
    public static final Pattern NumberCombinedWithUnit = RegExpUtility
```

### CommentedOutCode
Commented out code (4 lines)
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDateTimePeriodParserConfiguration.java`
#### Snippet
```java
    private final ImmutableMap<String, Integer> numbers;

    /*public static final Pattern MorningStartEndRegex = RegExpUtility.getSafeRegExp(SpanishDateTime.MorningStartEndRegex);
    public static final Pattern AfternoonStartEndRegex = RegExpUtility.getSafeRegExp(SpanishDateTime.AfternoonStartEndRegex);
    public static final Pattern EveningStartEndRegex = RegExpUtility.getSafeRegExp(SpanishDateTime.EveningStartEndRegex);
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexProperty.java`
#### Snippet
```java
    }

    public TimexProperty clone() {
        Boolean now = this.getNow();
        BigDecimal years = this.getYears();
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/RequestIdHeaderInterceptor.java`
#### Snippet
```java
        if (request.header("x-ms-client-request-id") == null) {
            request = chain.request().newBuilder()
                    .header("x-ms-client-request-id", UUID.randomUUID().toString())
                    .build();
        }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/BaseUrlHandler.java`
#### Snippet
```java
            request = request.newBuilder()
                    .url(baseHttpUrl)
                    .removeHeader("x-ms-parameterized-host")
                    .build();
        }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java
        Request.Builder requestBuilder = new Request.Builder().url(httpBuilder.build())
            .addHeader("Authorization", String.format("EndpointKey %s", endpointKey))
            .addHeader("Ocp-Apim-Subscription-Key", endpointKey)
            .addHeader("User-Agent", UserAgent.value())
            .post(body);
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java

        Request.Builder requestBuilder = new Request.Builder().url(httpBuilder.build())
                .addHeader("Ocp-Apim-Subscription-Key", getApplication().getEndpointKey()).post(body);
        return requestBuilder.build();
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/french/extractors/NumberExtractor.java`
#### Snippet
```java
                break;
            case Default:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/NumberExtractor.java`
#### Snippet
```java
                break;
            case Default:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/spanish/extractors/NumberExtractor.java`
#### Snippet
```java
                break;
            case Default:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/portuguese/extractors/NumberExtractor.java`
#### Snippet
```java
                break;
            case Default:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DurationParsingUtil.java`
#### Snippet
```java
                break;
            case "M":
                result = true;
                break;
            case "S":
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DurationParsingUtil.java`
#### Snippet
```java
                break;
            case "S":
                result = true;
                break;
            default:
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/ChoiceExtractor.java`
#### Snippet
```java
    }

    private final List<String> tokenize(String text) {

        List<String> tokens = new ArrayList<>();
```

### FinalPrivateMethod
'private' method declared `final`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/ChoiceExtractor.java`
#### Snippet
```java
    }

    private final double matchValue(List<String> source, List<String> match, int startPosition) {

        double matched = 0;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'Severity'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Severity.java`
#### Snippet
```java
    CRITICAL(4);

    private int value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'InputHints'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InputHints.java`
#### Snippet
```java
     * The actual serialized value for a InputHints instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'EndOfConversationCodes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/EndOfConversationCodes.java`
#### Snippet
```java
     * The actual serialized value for a EndOfConversationCodes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'SemanticActionStates'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SemanticActionStates.java`
#### Snippet
```java
     * The actual serialized value for a SemanticActionStates instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'ActivityImportance'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActivityImportance.java`
#### Snippet
```java
     * The actual serialized value for a ActivityImportance instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'DeliveryModes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/DeliveryModes.java`
#### Snippet
```java
     * The actual serialized value for a DeliveryModes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'InstallationUpdateActionTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InstallationUpdateActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a InstallationUpdateActionTypes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'ActionTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a ActionTypes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'TextFormatTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TextFormatTypes.java`
#### Snippet
```java
     * The actual serialized value for a TextFormatTypes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'ContactRelationUpdateActionTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ContactRelationUpdateActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a ContactRelationUpdateActionTypes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'RoleTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/RoleTypes.java`
#### Snippet
```java
     * The actual serialized value for a RoleTypes instance.
     */
    private String value;

    /**
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'AttachmentLayoutTypes'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentLayoutTypes.java`
#### Snippet
```java
     * The actual serialized value for a AttachmentLayoutTypes instance.
     */
    private String value;

    /**
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\d]` can be simplified to '\\d'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `durationStr.substring(0, durationStr.length() - 2)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DurationParsingUtil.java`
#### Snippet
```java
        // Resolve business days
        if (durationStr.endsWith(Constants.TimexBusinessDay)) {
            if (DoubleUtility.canParse(durationStr.substring(0, durationStr.length() - 2))) {

                double numVal = Double.parseDouble(durationStr.substring(0, durationStr.length() - 2));
```

### DuplicateExpressions
Multiple occurrences of `durationStr.substring(0, durationStr.length() - 2)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DurationParsingUtil.java`
#### Snippet
```java
            if (DoubleUtility.canParse(durationStr.substring(0, durationStr.length() - 2))) {

                double numVal = Double.parseDouble(durationStr.substring(0, durationStr.length() - 2));
                resultBuilder.put(Constants.TimexBusinessDay, numVal);
            }
```

### DuplicateExpressions
Multiple occurrences of `input.substring(match.index + match.length)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
                        endWithValidToken = true;
                    } else {
                        String afterStr = input.substring(match.index + match.length);

                        // "End with general ending tokens or "TokenBeforeDate" (like "on")
```

### DuplicateExpressions
Multiple occurrences of `input.substring(match.index + match.length)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
                        ret.add(new Token(match.index, match.index + match.length));
                    } else {
                        String afterStr = input.substring(match.index + match.length);

                        if ((this.config.getOptions().match(DateTimeOptions.EnablePreview)) && startsWithTimeZone(afterStr)) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
            } catch (HttpResponseException e) {
                if (e.getResponse().getStatusCode() == HttpStatus.SC_BAD_REQUEST) {
                    StringBuilder sb =
                        new StringBuilder("An error occurred while trying to write an object. The underlying ");
                    sb.append(BlobErrorCode.INVALID_BLOCK_LIST);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberRangeParser.java`
#### Snippet
```java
                        "StartValue", startValue,
                        "EndValue", endValue));
        result.setResolutionStr(new StringBuilder()
                        .append(leftBracket)
                        .append(startValueStr)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberRangeParser.java`
#### Snippet
```java
        }

        result.setResolutionStr(new StringBuilder()
                .append(leftBracket)
                .append(startValueStr)
```

## RuleId[id=Deprecation]
### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.connector;

```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.integration.spring;

```

### Deprecation
'com.microsoft.bot.integration.spring' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.integration.spring;

```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/BotSignIn.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ThrowSupplier.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ConnectorClient.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import com.microsoft.bot.restclient.RestClient;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/OAuthClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ConversationConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/Channels.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/Attachments.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import com.microsoft.bot.schema.AttachmentInfo;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/UserToken.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import com.microsoft.bot.schema.AadResourceUrls;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/OAuthClientConfig.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

import com.microsoft.bot.connector.authentication.AuthenticationConstants;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/Async.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ExecutorFactory.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector;

import java.util.concurrent.ExecutorService;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/Conversations.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotDependencyConfiguration.java`
#### Snippet
```java
    /**
     * Creates an InspectionState used by
     * {@link com.microsoft.bot.builder.inspection.InspectionMiddleware}. Default
     * scope of Singleton.
     *
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotDependencyConfiguration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration.spring;

import com.microsoft.bot.builder.ConversationState;
```

### Deprecation
'com.microsoft.bot.integration.spring' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotDependencyConfiguration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration.spring;

import com.microsoft.bot.builder.ConversationState;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/package-info.java`
#### Snippet
```java
 * This package contains the implementation classes for com.microsoft.bot.connector.rest.
 */
package com.microsoft.bot.connector.rest;

```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ConnectorConfiguration.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import java.io.InputStream;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/ErrorResponseException.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.restclient.RestException;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/UserAgent.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector;

import org.slf4j.LoggerFactory;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestOAuthClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.BotSignIn;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestTeamsConnectorClient.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.UserAgent;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConnectorClient.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.Attachments;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/teams/package-info.java`
#### Snippet
```java
 * This package contains the implementation classes for com.microsoft.bot.connector.teams.
 */
package com.microsoft.bot.connector.teams;

```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotController.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration.spring;

import com.microsoft.bot.builder.Bot;
```

### Deprecation
'com.microsoft.bot.integration.spring' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotController.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration.spring;

import com.microsoft.bot.builder.Bot;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/teams/TeamsConnectorClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.teams;

import com.microsoft.bot.restclient.RestClient;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/teams/TeamsOperations.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.teams;

import com.microsoft.bot.schema.teams.ConversationList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/package-info.java`
#### Snippet
```java
 * This package contains the implementation auth classes for com.microsoft.bot.connector.authentication.
 */
package com.microsoft.bot.connector.authentication;

```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/OAuthConfiguration.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
 * license information.
 */
package com.microsoft.bot.connector.rest;

import com.google.common.reflect.TypeToken;
```

### Deprecation
'buffer()' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
            throw new ErrorResponseException("getSignInUrl", response);
        }
        return new ServiceResponse<>(response.body().source().buffer().readUtf8(), response);
    }
    /**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestAttachments.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'encode(java.lang.String)' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestAttachments.java`
#### Snippet
```java
            + (baseUrl.endsWith("/") ? "" : "/")
            + "v3/attachments/{attachmentId}/views/{viewId}";
        uri = uri.replace("{attachmentId}", URLEncoder.encode(attachmentId));
        uri = uri.replace("{viewId}", URLEncoder.encode(viewId));

```

### Deprecation
'encode(java.lang.String)' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestAttachments.java`
#### Snippet
```java
            + "v3/attachments/{attachmentId}/views/{viewId}";
        uri = uri.replace("{attachmentId}", URLEncoder.encode(attachmentId));
        uri = uri.replace("{viewId}", URLEncoder.encode(viewId));

        return uri;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ChannelProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestTeamsOperations.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.google.common.reflect.TypeToken;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsValidator.java`
#### Snippet
```java
package com.microsoft.bot.connector.authentication;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/Retry.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SimpleChannelProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/RetryParams.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/TokenValidationParameters.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CertificateAppCredentialsOptions.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import java.io.InputStream;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationException.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ChannelValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/GovernmentChannelValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EnterpriseChannelValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SimpleCredentialProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/MicrosoftAppCredentials.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.net.MalformedURLException;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.integration.spring;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.integration.spring' is deprecated
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.integration.spring;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CredentialsAuthenticator.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.microsoft.aad.msal4j.ClientCredentialFactory;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/Authenticator.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import com.microsoft.aad.msal4j.IAuthenticationResult;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/OpenIdMetadataKey.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.security.interfaces.RSAPublicKey;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/RetryAfterHelper.java`
#### Snippet
```java
package com.microsoft.bot.connector.authentication;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentials.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.microsoft.aad.msal4j.IAuthenticationResult;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentialsInterceptor.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import okhttp3.Interceptor;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/RetryException.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AllowedCallersClaimsValidator.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.connector.authentication;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsIdentity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.auth0.jwt.interfaces.DecodedJWT;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/MicrosoftGovernmentAppCredentials.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/OpenIdMetadataResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EndorsementsValidator.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EndorsementsValidator.java`
#### Snippet
```java
     *
     * <p>
     * For example, if an {@link com.microsoft.bot.schema.Activity} comes from
     * WebChat, that activity's
     * {@link com.microsoft.bot.schema.Activity#getChannelId()} property is set to
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EndorsementsValidator.java`
#### Snippet
```java
     * For example, if an {@link com.microsoft.bot.schema.Activity} comes from
     * WebChat, that activity's
     * {@link com.microsoft.bot.schema.Activity#getChannelId()} property is set to
     * "webchat" and the signing party of the JWT token must have a corresponding
     * endorsement of “Webchat”.
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EndorsementsValidator.java`
#### Snippet
```java
     *                            channel to validate, typically extracted from the
     *                            activity's
     *                            {@link com.microsoft.bot.schema.Activity#getChannelId()}
     *                            property, that to which the Activity is
     *                            affinitized. Alternatively, it could represent a
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CredentialProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConfiguration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/GovernmentAuthenticationConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/OpenIdMetadata.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

/**
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CertificateAppCredentials.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import java.io.IOException;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CachingOpenIdMetadata.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.auth0.jwk.Jwk;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CachingOpenIdMetadataResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import java.util.concurrent.ConcurrentHashMap;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.auth0.jwt.JWT;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConversations.java`
#### Snippet
```java
 */

package com.microsoft.bot.connector.rest;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EmulatorValidation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.auth0.jwt.JWT;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CertificateAuthenticator.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.connector.authentication;

import com.microsoft.aad.msal4j.ClientCredentialFactory;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.connector.authentication;

import com.auth0.jwt.JWT;
```

### Deprecation
'create(okhttp3.MediaType, byte\[\])' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
        @Override public RequestBody convert(T value) throws IOException {
            byte[] bytes = adapter.writeValueAsBytes(value);
            return RequestBody.create(MediaType.parse("application/json; charset=UTF-8"), bytes);
        }
    }
```

### Deprecation
'buffer()' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/ServiceResponseBuilder.java`
#### Snippet
```java
                String responseContent = "";
                if (responseBody != null) {
                    responseContent = responseBody.source().buffer().clone().readUtf8();
                }
                throw exceptionType.getConstructor(String.class, Response.class, (Class<?>) responseTypes.get(0))
```

### Deprecation
'buffer()' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/ServiceResponseBuilder.java`
#### Snippet
```java
        // Deserialize
        else {
            String responseContent = responseBody.source().buffer().readUtf8();
            if (responseContent.length() <= 0) {
                return null;
```

### Deprecation
'constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonAdapter.java`
#### Snippet
```java
                javaTypeArgs[i] = constructJavaType(((ParameterizedType) type).getActualTypeArguments()[i]);
            }
            return mapper.getTypeFactory().constructType(type,
                TypeBindings.create((Class<?>) ((ParameterizedType) type).getRawType(), javaTypeArgs));
        } else {
```

### Deprecation
'WRITE_EMPTY_JSON_ARRAYS' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonAdapter.java`
#### Snippet
```java
    private static ObjectMapper initializeObjectMapper(ObjectMapper mapper) {
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)
```

### Deprecation
'configure(com.fasterxml.jackson.databind.MapperFeature, boolean)' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonAdapter.java`
#### Snippet
```java
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(new Jdk8Module())
```

### Deprecation
'com.microsoft.bot.applicationinsights' is deprecated
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.applicationinsights;

```

### Deprecation
'com.microsoft.bot.applicationinsights' is deprecated
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/core/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.applicationinsights.core.
 */
package com.microsoft.bot.applicationinsights.core;

```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.azure;

```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.azure.blobs.
 */
package com.microsoft.bot.azure.blobs;

```

### Deprecation
'com.microsoft.bot.applicationinsights' is deprecated
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/core/TelemetryInitializerMiddleware.java`
#### Snippet
```java
// license information.

package com.microsoft.bot.applicationinsights.core;

import com.microsoft.applicationinsights.core.dependencies.http.client.protocol.HttpClientContext;
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/queues/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.azure.queues.
 */
package com.microsoft.bot.azure.queues;

```

### Deprecation
'com.microsoft.bot.applicationinsights' is deprecated
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/AvailabilityTelemetry.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.applicationinsights;

import com.microsoft.applicationinsights.internal.schemav2.AvailabilityData;
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorageOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure;

import com.microsoft.azure.documentdb.ConnectionPolicy;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.ai.luis;

```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/DynamicList.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure;

import org.apache.commons.lang3.ArrayUtils;
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/queues/AzureQueueStorage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure.queues;

import com.azure.storage.queue.QueueClient;
```

### Deprecation
'com.microsoft.bot.applicationinsights' is deprecated
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/ApplicationInsightsBotTelemetryClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.applicationinsights;

import com.microsoft.applicationinsights.TelemetryClient;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/ListElement.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisApplication.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import okhttp3.HttpUrl;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/TelemetryRecognizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.microsoft.bot.builder.BotTelemetryClient;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/ExternalEntity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisTelemetryConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

/**
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.microsoft.bot.builder.BotTelemetryClient;
```

### Deprecation
'buffer()' is deprecated
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/LoggingInterceptor.java`
#### Snippet
```java
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE); // Buffer the entire body.
            Buffer buffer = source.buffer();

            Charset charset = StandardCharsets.UTF_8;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisSlot.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

/**
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/Configuration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import java.util.Properties;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/ConfigurationCredentialProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.connector.authentication.MicrosoftAppCredentials;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.integration;

```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/AdapterWithInspection.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.builder.ConversationState;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/ClasspathPropertiesConfiguration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import org.slf4j.LoggerFactory;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpAdapter.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.builder.Bot;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/SkillHttpClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import java.net.URI;
```

### Deprecation
'enableDefaultTyping()' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .findAndRegisterModules()
            .enableDefaultTyping();

        containerClient = new BlobContainerClientBuilder().connectionString(dataConnectionString)
```

### Deprecation
'download(java.io.OutputStream)' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
        while (true) {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                blobReference.download(outputStream);
                String contentString = outputStream.toString();

```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure.blobs;

import com.azure.core.exception.HttpResponseException;
```

### Deprecation
'uploadWithResponse(java.io.InputStream, long, com.azure.storage.blob.models.ParallelTransferOptions, com.azure.storage.blob.models.BlobHttpHeaders, java.util.Map, com.azure.storage.blob.models.AccessTier, com.azure.storage.blob.models.BlobRequestConditions, ...)' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
                InputStream stream = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
                // verify the corresponding length
                blobReference.uploadWithResponse(
                    stream,
                    stream.available(),
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/ConfigurationChannelProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.connector.authentication.SimpleChannelProvider;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.ai.qna;

```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/JoinOperator.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

/**
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/TelemetryQnAMaker.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import com.microsoft.bot.ai.qna.models.QueryResult;
```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/AdapterWithErrorHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.builder.ConversationState;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/AdapterWithErrorHandler.java`
#### Snippet
```java
    /**
     * Constructs an error handling BotFrameworkHttpAdapter by providing an
     * {@link com.microsoft.bot.builder.OnTurnErrorHandler}.
     *
     * <p>
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/AdapterWithErrorHandler.java`
#### Snippet
```java
    /**
     * Constructs an error handling BotFrameworkHttpAdapter by providing an
     * {@link com.microsoft.bot.builder.OnTurnErrorHandler}.
     *
     * <p>
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerEndpoint.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import java.io.IOException;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnADialogResponseOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.fasterxml.jackson.databind.JsonNode;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/BindToActivity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import com.microsoft.bot.dialogs.DialogContext;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.ai.qna.utils.
 */
package com.microsoft.bot.ai.qna.utils;

```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/QnACardBuilder.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure;

import com.codepoetics.protonpack.collectors.CompletableFutures;
```

### Deprecation
'enableDefaultTyping()' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .findAndRegisterModules()
            .enableDefaultTyping();

        client = new DocumentClient(
```

### Deprecation
'create(okhttp3.MediaType, java.lang.String)' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java

    private RequestBody buildRequestBody(String payloadBody) throws JsonProcessingException {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), payloadBody);
    }
}
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/TrainUtils.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import com.microsoft.bot.ai.qna.QnAMakerEndpoint;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.ai.qna.models.
 */
package com.microsoft.bot.ai.qna.models;

```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/QnATelemetryConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

/**
```

### Deprecation
'com.microsoft.bot.ai.luis' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.luis;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                    externalEntitiesNode.add(mapper.valueToTree(e));
                }
                luisOptions.put("externalEntities", externalEntitiesNode);
            }

```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                    dynamicListNode.add(mapper.valueToTree(e));
                }
                luisOptions.put("dynamicLists", dynamicListNode);
            }

```

### Deprecation
'create(okhttp3.MediaType, java.lang.String)' is deprecated
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java

        String contentAsText = mapper.writeValueAsString(content);
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), contentAsText);
    }

```

### Deprecation
'com.microsoft.bot.integration' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.integration;

import com.microsoft.bot.connector.ConversationConstants;
```

### Deprecation
'create(okhttp3.MediaType, java.lang.String)' is deprecated
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java

        try {
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonContent);
            Request request = buildRequest(activity, toUrl, body, token);
            Response response = httpClient.newCall(request).execute();
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/ActiveLearningUtils.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import com.microsoft.bot.ai.qna.models.QueryResult;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/Metadata.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import java.io.Serializable;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QueryResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/FeedbackRecords.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QueryResults.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'download(java.io.OutputStream)' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
    private CompletableFuture<Activity> getActivityFromBlobClient(BlobClient blobClient) {
        ByteArrayOutputStream content = new ByteArrayOutputStream();
        blobClient.download(content);
        String contentString = new String(content.toByteArray());
        try {
```

### Deprecation
'com.microsoft.bot.azure' is deprecated
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.azure.blobs;

import com.azure.core.exception.HttpResponseException;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/RankerTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

/**
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QnAResponseContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/FeedbackRecord.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QnARequestContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.ai.qna.dialogs.
 */
package com.microsoft.bot.ai.qna.dialogs;

```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialogOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.dialogs;

import com.microsoft.bot.ai.qna.QnADialogResponseOptions;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.dialogs;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.builder;

```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptStore.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QnAMakerTraceInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Severity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Bot.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Recognizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import com.google.common.collect.LinkedListMultimap;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/DelegatingTurnContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TraceTranscriptLogger.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/RegisterClassMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TypedInvokeResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/InvokeResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/StatePropertyInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/SendActivitiesHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptLogger.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/PropertyManager.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ShowTypingMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.ExecutorFactory;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerRecognizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ComponentRegistration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.ConcurrentHashMap;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextStateCollection.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.ConnectorClient;
```

### Deprecation
'enableDefaultTyping()' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .findAndRegisterModules();
        objectMapper.enableDefaultTyping();

        memory = values != null ? values : new ConcurrentHashMap<>();
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.utils;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/RecognizerConvert.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ConversationState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/UserTokenProvider.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.authentication.AppCredentials;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/DeleteActivityHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.ConversationReference;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.time.OffsetDateTime;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ConnectorClientBuilder.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/PagedResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/AutoSaveStateMiddleware.java`
#### Snippet
```java
// Licensed under the MIT license.

package com.microsoft.bot.builder;

import java.util.Arrays;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Storage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotCallbackHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/RecognizerResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/IntentScore.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/NextDelegate.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ChannelServiceHandler.java`
#### Snippet
```java
package com.microsoft.bot.builder;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/UserState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotStateSet.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/QueueStorage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/OnTurnErrorHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MessageFactory.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.ActionTypes;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptLoggerMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/EventFactory.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.builder;

import java.time.OffsetDateTime;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotAdapter.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Middleware.java`
#### Snippet
```java
     *         </p>
     *         <p>
     *         {@link TurnContext} {@link com.microsoft.bot.schema.Activity}
     */
    CompletableFuture<Void> onTurn(TurnContext turnContext, NextDelegate next);
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Middleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/StoreItem.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnStateConstants.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.builder;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/UpdateActivityHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotAssert.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/PrivateConversationState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import org.apache.commons.lang3.StringUtils;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/StatePropertyAccessor.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/NullBotTelemetryClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MiddlewareSet.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MiddlewareSet.java`
#### Snippet
```java
     *         </p>
     *         <p>
     *         {@link TurnContext} {@link com.microsoft.bot.schema.Activity}
     */
    @Override
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotTelemetryClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import java.time.Duration;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.builder.teams.
 */
package com.microsoft.bot.builder.teams;

```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/SkypeMentionNormalizeMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.databind.JsonNode;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/SetSpeakMiddleware.java`
#### Snippet
```java
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MT License.
package com.microsoft.bot.builder;

import java.io.IOException;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryTranscriptStore.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.codepoetics.protonpack.StreamUtils;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.builder.skills.
 */
package com.microsoft.bot.builder.skills;

```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextImpl.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.connector' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextImpl.java`
#### Snippet
```java
     * @param withActivity New replacement activity.
     * @return A task that represents the work queued to execute.
     * @throws com.microsoft.bot.connector.rest.ErrorResponseException The HTTP
     *                                                                 operation
     *                                                                 failed and
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/BotFrameworkSkill.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import java.net.URI;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.builder.skills;

import java.util.HashMap;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/BotFrameworkClient.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import java.net.URI;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationReference.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import com.microsoft.bot.schema.ConversationReference;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsSSOTokenExchangeMiddleware.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.builder.teams;

import java.net.HttpURLConnection;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsSSOTokenExchangeMiddleware.java`
#### Snippet
```java
     *         </p>
     *         <p>
     *         {@link TurnContext} {@link com.microsoft.bot.schema.Activity}
     */
    public CompletableFuture<Void> onTurn(TurnContext turnContext, NextDelegate next) {
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.ai.qna' is deprecated
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.ai.qna.dialogs;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.builder.inspection.
 */
package com.microsoft.bot.builder.inspection;

```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.microsoft.bot.builder.BotState;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionSessionsByStatus.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.microsoft.bot.schema.ConversationReference;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionActivityExtensions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.fasterxml.jackson.databind.JsonNode;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionSession.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.microsoft.bot.connector.ConnectorClient;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/integration/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.builder.integration.
 */
package com.microsoft.bot.builder.integration;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ThisPath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/integration/AdapterIntegration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.integration;

import com.microsoft.bot.builder.BotCallbackHandler;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.teams;

import com.microsoft.bot.builder.BotFrameworkAdapter;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.dialogs;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.skills;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogReason.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogTurnStatus.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogPath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStep.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InterceptionMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.microsoft.bot.builder.Middleware;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogInstance.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillInvokeException.java`
#### Snippet
```java
package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/BeginSkillDialogOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Recognizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Recognizer.java`
#### Snippet
```java
                candidate.put("intent", top.intent);
                candidate.put("score", top.score);
                candidate.put("result", Serialization.objectToTree(recognizerResult.getValue()));
                candidates.add(candidate);
            }
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContainer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogCommon.java`
#### Snippet
```java
package com.microsoft.bot.dialogs;

import com.microsoft.bot.builder.BotAdapter;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManagerResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.microsoft.bot.schema.Activity;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.inspection;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/TurnPath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogEvent.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogTurnResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogDependencies.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.microsoft.bot.builder.TurnContext;
```

### Deprecation
'com.microsoft.bot.builder.ActivityHandler' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
 */
@SuppressWarnings({"checkstyle:JavadocMethod", "checkstyle:DesignForExtension", "checkstyle:MethodLength"})
public class TeamsActivityHandler extends ActivityHandler {
    /**
     * Invoked when an invoke activity is received from the connector when the base
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
     * <p>
     * If using an OAuthPrompt, override this method to forward this
     * {@link com.microsoft.bot.schema.Activity} to the current dialog.
     * </p>
     *
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
     * <p>
     * When the {@link #onEventActivity(TurnContext)} method receives an event with
     * a {@link com.microsoft.bot.schema.Activity#getName()} of `tokens/response`, it calls this method.
     *
     * @param turnContext The context object for this turn.
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder.teams;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/PersistedStateKeys.java`
#### Snippet
```java
// Copyright (c) Microsoft Corporation. All rights reserved.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ScopePath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialogOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.net.URI;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SegmentType.java`
#### Snippet
```java
package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContextPath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogSet.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallDialog.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Segments.java`
#### Snippet
```java
package com.microsoft.bot.dialogs;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogEvents.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;
/**
 * Represents the events related to the "lifecycle" of the dialog.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/PathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory;
/**
 * Defines Path Resolver interface for transforming paths.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/ComponentMemoryScopes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory;

import com.microsoft.bot.dialogs.memory.scopes.MemoryScope;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.dialogs.memory.
 */
package com.microsoft.bot.dialogs.memory;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.databind.JsonNode;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/PersistedState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.HashMap;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManagerConfiguration.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.dialogs.memory.scopes.
 */
package com.microsoft.bot.dialogs.memory.scopes;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/ComponentPathResolvers.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory;
/**
 * Interface for declaring path resolvers in the memory system.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManager.java`
#### Snippet
```java
    /**
     * Initializes a new instance of the
     * {@link com.microsoft.bot.dialogs.DialogManager} class.
     *
     * @param rootDialog          Root dialog to use.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManager.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.time.OffsetDateTime;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/MemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.dialogs.DialogContext;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ThisMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.dialogs.DialogContext;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ConversationMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.builder.ConversationState;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import java.util.AbstractMap.SimpleEntry;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/SettingsMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import java.util.Properties;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/UserMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.builder.UserState;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogClassMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.dialogs.DialogContainer;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/BotStateMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ClassMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.microsoft.bot.dialogs.Dialog;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/PercentPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/AtAtPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/TurnMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import java.util.TreeMap;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.dialogs.memory.pathresolvers.
 */
package com.microsoft.bot.dialogs.memory.pathresolvers;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/DollarPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialog.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.dialogs;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.scopes;

import com.fasterxml.jackson.databind.node.ArrayNode;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/HashPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.dialogs.choices.
 */
package com.microsoft.bot.dialogs.choices;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/AtPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ListStyle.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/AliasPathResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory.pathresolvers;

import com.microsoft.bot.dialogs.memory.PathResolver;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/FindChoicesOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.fasterxml.jackson.databind.JsonNode;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/FoundChoice.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ChoiceFactoryOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Tokenizer.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Token.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ModelResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/TokenizerFunction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/FoundValue.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Channel.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.microsoft.bot.builder.TurnContext;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Choice.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/SortedValue.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/package-info.java`
#### Snippet
```java
 * This package contains the classes for com.microsoft.bot.dialogs.prompts.
 */
package com.microsoft.bot.dialogs.prompts;

```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidator.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.concurrent.CompletableFuture;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/FindValuesOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ChoiceRecognizers.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.microsoft.recognizers.text.IModel;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidatorContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPromptSettings.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.dialogs.prompts;

import com.microsoft.bot.connector.authentication.AppCredentials;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ChoiceFactory.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import com.microsoft.bot.builder.MessageFactory;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Find.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.choices;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.time.LocalDateTime;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.memory;

import java.util.AbstractMap;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
    /**
     * Initializes a new instance of the
     * {@link com.microsoft.bot.dialogs.memory.DialogStateManager} class.
     *
     * @param dc            The dialog context for the current turn of the
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
    /**
     * Initializes a new instance of the
     * {@link com.microsoft.bot.dialogs.memory.DialogStateManager} class.
     *
     * @param dc            The dialog context for the current turn of the
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import com.microsoft.bot.dialogs.choices.Choice;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModels.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.Arrays;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
     *
     *                  The value of dialogId must be unique within the
     *                  {@link com.microsoft.bot.dialogs.DialogSet} or
     *                  {@link com.microsoft.bot.dialogs.ComponentDialog} to which
     *                  the prompt is added.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
     *                  The value of dialogId must be unique within the
     *                  {@link com.microsoft.bot.dialogs.DialogSet} or
     *                  {@link com.microsoft.bot.dialogs.ComponentDialog} to which
     *                  the prompt is added.
     */
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.HashMap;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
 * When the prompt ends, it should return a Object that represents the value
 * that was prompted for. Use
 * {@link com.microsoft.bot.dialogs.DialogSet#add(Dialog)} or
 * {@link com.microsoft.bot.dialogs.ComponentDialog#addDialog(Dialog)} to add a
 * prompt to a dialog set or component dialog, respectively. Use
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
 * that was prompted for. Use
 * {@link com.microsoft.bot.dialogs.DialogSet#add(Dialog)} or
 * {@link com.microsoft.bot.dialogs.ComponentDialog#addDialog(Dialog)} to add a
 * prompt to a dialog set or component dialog, respectively. Use
 * {@link DialogContext#prompt(String, PromptOptions)} or
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
 * {@link DialogContext#prompt(String, PromptOptions)} or
 * {@link DialogContext#beginDialog(String, Object)} to start the prompt. If you
 * start a prompt from a {@link com.microsoft.bot.dialogs.WaterfallStep} in a
 * {@link com.microsoft.bot.dialogs.WaterfallDialog}, then the prompt result
 * will be available in the next step of the waterfall.
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
 * {@link DialogContext#beginDialog(String, Object)} to start the prompt. If you
 * start a prompt from a {@link com.microsoft.bot.dialogs.WaterfallStep} in a
 * {@link com.microsoft.bot.dialogs.WaterfallDialog}, then the prompt result
 * will be available in the next step of the waterfall.
 *
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptRecognizerResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModel.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.Map;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimeResolution.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

/**
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.HashMap;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.List;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.dialogs.prompts;

import java.util.ArrayList;
```

### Deprecation
'com.microsoft.bot.builder' is deprecated
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.builder;

import com.microsoft.bot.connector.Async;
```

### Deprecation
'com.microsoft.bot.dialogs' is deprecated
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.dialogs.prompts;

import java.net.HttpURLConnection;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/package-info.java`
#### Snippet
```java
 */
@Deprecated
package com.microsoft.bot.schema;

```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ResultPair.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SignInResource.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ThumbnailUrl.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenExchangeInvokeResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ErrorResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationsResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/EntitySerialization.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenExchangeResource.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Place.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AdaptiveCardInvokeResponse.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InputHints.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/MediaUrl.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/OAuthCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationResourceResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AdaptiveCardAuthentication.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationMembers.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/EndOfConversationCodes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/HandoffEventNames.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/CommandResultValue.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/CardImage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SemanticActionStates.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/PagedMembersResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Transcript.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Mention.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SemanticAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ReceiptCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActivityTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActivityImportance.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/DeliveryModes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/NanoClockHelper.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import java.time.Clock;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/BasicCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InstallationUpdateActionTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/MessageReactionTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InnerHttpError.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenExchangeInvokeRequest.java`
#### Snippet
```java
package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/MessageReaction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationAccount.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AdaptiveCardInvokeValue.java`
#### Snippet
```java


package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ThumbnailCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentView.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenExchangeRequest.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SigninCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Entity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TextHighlight.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenStatus.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActionTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TextFormatTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Error.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/CardAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SpeechConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenExchangeState.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ResourceResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/GeoCoordinates.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/CommandValue.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ContactRelationUpdateActionTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActivityEventNames.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ExpectedReplies.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenRequest.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/MediaCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/RoleTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TokenResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Attachment.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AnimationCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AadResourceUrls.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import java.util.Arrays;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/MediaEventValue.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ChannelAccount.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AdaptiveCardInvokeAction.java`
#### Snippet
```java
// Licensed under the MT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/CallerIdConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'configure(com.fasterxml.jackson.databind.MapperFeature, boolean)' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Serialization.java`
#### Snippet
```java
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.findAndRegisterModules();

```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Serialization.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Thing.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationParameters.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Pair.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ReceiptItem.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SignInConstants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

/**
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentData.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentLayoutTypes.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Fact.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SuggestedActions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/package-info.java`
#### Snippet
```java
 * This package contains the models classes for com.microsoft.bot.schema.teams.
 */
package com.microsoft.bot.schema.teams;

```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabResponseCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/HeroCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationReference.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import java.util.UUID;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionParameter.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingDetails.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/VideoCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionSuggestedAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabResponseCards.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardActionBase.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardOpenUri.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AudioCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionActionResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadBody.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/FileConsentCardResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingEventDetails.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadApp.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayload.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadMention.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardTextInput.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardActionCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadUser.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabSuggestedActions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleRequest.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleContinueResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardFact.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsChannelData.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsMeetingInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardHttpPOST.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingDetailsBase.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleTaskInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamDetails.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabResponsePayload.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleRequestContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingEndEventDetails.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabRequest.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardOpenUriTarget.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadReaction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionAttachment.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/CacheInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleMessageResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsPagedMembersResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadAttachment.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardViewAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardSection.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabSubmit.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleAction.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.core.JsonProcessingException;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/FileInfoCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema;

import com.microsoft.bot.schema.teams.NotificationInfo;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardInputBase.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleResponseBase.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/NotificationInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadConversation.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/SigninStateVerificationQuery.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionQueryOptions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsChannelAccount.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonGetter;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardMultichoiceInput.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/AttachmentExtensions.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.microsoft.bot.schema.Attachment;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/ChannelInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadFrom.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/FileDownloadInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabEntityContext.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingParticipantInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionQuery.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/FileUploadInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/FileConsentCard.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MeetingStartEventDetails.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TenantInfo.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardImage.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardDateInput.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/ConversationList.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabResponse.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessagingExtensionResult.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsMeetingParticipant.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/AppBasedLinkQuery.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardActionQuery.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/O365ConnectorCardMultichoiceInputChoice.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonProperty;
```

### Deprecation
'com.microsoft.bot.schema' is deprecated
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabSubmitData.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java
                            if (source.contains(preMatch.value + match.value)) {
                                isClean.set(false);
                                return;
                            }
                        });
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java

                if (!isClean.get()) {
                    return;
                }
            });
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                    day,
                    beginHour,
                    beginMinute >= 0 ? beginMinute : 0,
                    beginSecond >= 0 ? beginSecond : 0);

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                    beginHour,
                    beginMinute >= 0 ? beginMinute : 0,
                    beginSecond >= 0 ? beginSecond : 0);

            LocalDateTime endDateTime = DateUtil.safeCreateFromMinValue(
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                    day,
                    endHour,
                    endMinute >= 0 ? endMinute : 0,
                    endSecond >= 0 ? endSecond : 0);

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                    endHour,
                    endMinute >= 0 ? endMinute : 0,
                    endSecond >= 0 ? endSecond : 0);

            boolean hasLeftAm = !StringUtility.isNullOrEmpty(leftDesc) && leftDesc.toLowerCase().startsWith("a");
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
                List<String> matchList = QueryProcessor.split(preMatch, separators);
                for (String match : matchList) {
                    tempMaxPrefixMatchLen = tempMaxPrefixMatchLen >= match.length() ? tempMaxPrefixMatchLen : match.length();
                }
            }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizer.java`
#### Snippet
```java
        properties.put(LuisTelemetryConstants.INTENT_PROPERTY, topTwoIntents.size() > 0 ? topTwoIntents.get(0) : "");
        properties.put(LuisTelemetryConstants.INTENT_SCORE_PROPERTY,
                topTwoIntents.size() > 0 ? "" + recognizerResult.getIntents().get(topTwoIntents.get(0)).getScore()
                        : "0.00");
        properties.put(LuisTelemetryConstants.INTENT_2_PROPERTY, topTwoIntents.size() > 1 ? topTwoIntents.get(1) : "");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizer.java`
#### Snippet
```java
        properties.put(LuisTelemetryConstants.INTENT_2_PROPERTY, topTwoIntents.size() > 1 ? topTwoIntents.get(1) : "");
        properties.put(LuisTelemetryConstants.INTENT_SCORE_2_PROPERTY,
                topTwoIntents.size() > 1 ? "" + recognizerResult.getIntents().get(topTwoIntents.get(1)).getScore()
                        : "0.00");
        properties.put(LuisTelemetryConstants.FROM_ID_PROPERTY, turnContext.getActivity().getFrom().getId());
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'id' is assigned to itself
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/MessageActionsPayloadAttachment.java`
#### Snippet
```java
     */
    public void setId(String withId) {
        id = id;
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/chinese/parsers/ChineseNumberParserConfiguration.java`
#### Snippet
```java
                ChineseNumeric.HalfADozenText,
                ChineseNumeric.WordSeparatorToken,
                Collections.<String>emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        if (queryOptions != null) {
            if (
                queryOptions.getScoreThreshold() != hydratedOptions.getScoreThreshold()
                    && queryOptions.getScoreThreshold() != 0
            ) {
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
            }

            if (queryOptions.getTop() != hydratedOptions.getTop() && queryOptions.getTop() != 0) {
                hydratedOptions.setTop(queryOptions.getTop());
            }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
                        String nextUnitStr = unitMatch.get().getGroup("unit").value;

                        if (unitValueMap.get(nextUnitStr) != unitValueMap.get(currentUnit)) {
                            valid = true;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexRelativeConvertEnglish.java`
#### Snippet
```java
                if (timex.getWeekOfYear() != null) {
                    Integer thisWeek = TimexDateHelpers.weekOfYear(date);
                    if (thisWeek == timex.getWeekOfYear()) {
                        return timex.getWeekend() != null ? String.format("%1$s %2$s", TimexConstantsEnglish.THIS, TimexConstantsEnglish.WEEKEND)
                                : String.format("%1$s %2$s", TimexConstantsEnglish.THIS, Constants.WEEK_UNIT);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentialsInterceptor.java`
#### Snippet
```java
     */
    @Override
    public Response intercept(Chain chain) throws IOException {
        if (credentials.shouldSetToken(chain.request().url().url().toString())) {
            String token;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/retry/RetryHandler.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
            Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        ObjectWriter writer = mapper.writer();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
            Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        ObjectWriter writer = mapper.writer();
        return new JacksonRequestBodyConverter<>(writer);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
            Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        ObjectWriter writer = mapper.writer();
        return new JacksonRequestBodyConverter<>(writer);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
            Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        ObjectWriter writer = mapper.writer();
        return new JacksonRequestBodyConverter<>(writer);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
        }

        @Override public T convert(ResponseBody value) throws IOException {
            try (Reader reader = value.charStream()) {
                return adapter.readValue(reader);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        JavaType javaType = mapper.getTypeFactory().constructType(type);
        ObjectReader reader = mapper.readerFor(javaType);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        JavaType javaType = mapper.getTypeFactory().constructType(type);
        ObjectReader reader = mapper.readerFor(javaType);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        JavaType javaType = mapper.getTypeFactory().constructType(type);
        ObjectReader reader = mapper.readerFor(javaType);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/JacksonConverterFactory.java`
#### Snippet
```java
        }

        @Override public RequestBody convert(T value) throws IOException {
            byte[] bytes = adapter.writeValueAsBytes(value);
            return RequestBody.create(MediaType.parse("application/json; charset=UTF-8"), bytes);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/credentials/TokenCredentialsInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request newRequest = chain.request().newBuilder()
            .header("Authorization", credentials.getScheme() + " " + credentials.getToken(chain.request()))
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/credentials/BasicAuthenticationCredentialsInterceptor.java`
#### Snippet
```java
     */
    @Override
    public Response intercept(Chain chain) throws IOException {
        String auth = credentials.getUserName() + ":" + credentials.getPassword();
        auth = BaseEncoding.base64().encode(auth.getBytes(StandardCharsets.UTF_8));
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/UserAgentInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String header = request.header("User-Agent");
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/RequestIdHeaderInterceptor.java`
#### Snippet
```java
public final class RequestIdHeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (request.header("x-ms-client-request-id") == null) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/CustomHeadersInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        for (Map.Entry<String, List<String>> header : headers.entrySet()) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/BaseUrlHandler.java`
#### Snippet
```java
public final class BaseUrlHandler implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String parameters = request.header("x-ms-parameterized-host");
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/LoggingInterceptor.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:DesignForExtension")
    @Override
    public Response intercept(Chain chain) throws IOException {
        // get logger
        Request request = chain.request();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {
        throw new UnsupportedOperationException(notSupported);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java

    @Override
    public Collection<Object> values() {
        Set<String> keys = this.keySet();
        List<Object> objectList = new ArrayList<Object>();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java

    @Override
    public Set<Entry<String, Object>> entrySet() {
        Set<Entry<String, Object>> items = new HashSet<Entry<String, Object>>();
        Set<String> keys = this.keySet();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java
     */
    @Override
    public Set<String> keySet() {
        return new HashSet<String>(ObjectPath.getProperties(obj));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java

    @Override
    public final Set<Entry<String, Object>> entrySet() {
        Set<Entry<String, Object>> resultSet = new HashSet<Entry<String, Object>>();
        configuration.getMemoryScopes().forEach((scope) -> {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java

    @Override
    public final void putAll(Map<? extends String, ? extends Object> m) {
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/UserAgent.java`
#### Snippet
```java
 * <p>
 * Conforms to spec:
 * https://github.com/Microsoft/botbuilder-dotnet/blob/d342cd66d159a023ac435aec0fdf791f93118f5f/doc/UserAgents.md
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestTeamsConnectorClient.java`
#### Snippet
```java
 * The Bot Connector REST API allows your bot to send and receive messages to
 * channels configured in the [Bot Framework Developer
 * Portal](https://dev.botframework.com). The Connector service uses
 * industry-standard REST and JSON over HTTPS.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConnectorClient.java`
#### Snippet
```java
 * The Bot Connector REST API allows your bot to send and receive messages to
 * channels configured in the [Bot Framework Developer
 * Portal](https://dev.botframework.com). The Connector service uses
 * industry-standard REST and JSON over HTTPS.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConstants.java`
#### Snippet
```java
     * which tenant to obtain an access token from. By default, the channels only
     * accept tokens from "botframework.com". For more details see
     * https://aka.ms/bots/tenant-restriction.
     */
    public static final String TO_CHANNEL_FROM_BOT_LOGIN_URL_TEMPLATE =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConstants.java`
#### Snippet
```java
     * "azp" Claim. Authorized party - the party to which the ID Token was issued.
     * This claim follows the general format set forth in the OpenID Spec.
     * http://openid.net/specs/openid-connect-core-1_0.html#IDToken.
     */
    public static final String AUTHORIZED_PARTY = "azp";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConstants.java`
#### Snippet
```java
    /**
     * Audience Claim. From RFC 7519.
     * https://tools.ietf.org/html/rfc7519#section-4.1.3 The "aud" (audience) claim
     * identifies the recipients that the JWT is intended for. Each principal
     * intended to process the JWT MUST identify itself with a value in the audience
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AuthenticationConstants.java`
#### Snippet
```java

    /**
     * From RFC 7515 https://tools.ietf.org/html/rfc7515#section-4.1.4 The "kid"
     * (key ID) Header Parameter is a hint indicating which key was used to secure
     * the JWS. This parameter allows originators to explicitly signal a change of
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SimpleChannelProvider.java`
#### Snippet
```java
     * @param withChannelService The ChannelService to use. Null or empty strings
     *                           represent Public Azure, the string
     *                           'https://botframework.us' represents US Government
     *                           Azure, and other values are for private channels.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/AvailabilityTelemetry.java`
#### Snippet
```java
/**
 * We took this class from
 * https://github.com/microsoft/ApplicationInsights-Java/issues/1099 as this is
 * not already migrated in ApplicationInsights-Java library.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorageOptions.java`
#### Snippet
```java
     *
     * @param withCompatibilityMode Currently, max key length for cosmosdb is 1023:
     *                              https://docs.microsoft.com/en-us/azure/cosmos-db/concepts-limits#per-item-limits
     *                              The default for backwards compatibility is 255,
     *                              CosmosDbKeyEscape.MaxKeyLength.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
     * The list of illegal characters for Cosmos DB Keys comes from this list on the
     * CosmostDB docs:
     * https://docs.microsoft.com/dotnet/api/microsoft.azure.documents.resource.id?view=azure-dotnet#remarks
     *
     * Note: We are also escaping the "*" character, as that what we're using as our
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
     * behavior, and use the longer limit set
     * CosmosDbPartitionedStorageOptions.CompatibilityMode to false.
     * https://docs.microsoft.com/en-us/azure/cosmos-db/concepts-limits#per-item-limits.
     */
    public static final Integer MAX_KEY_LENGTH = 255;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisApplication.java`
#### Snippet
```java

    /**
     * Sets LUIS endpoint like https://westus.api.cognitive.microsoft.com.
     *
     * @param endpoint LUIS endpoint where application is hosted.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisApplication.java`
#### Snippet
```java
     * @param endpointKey   LUIS subscription or endpoint key.
     * @param endpoint      LUIS endpoint to use like
     *                      https://westus.api.cognitive.microsoft.com
     */
    public LuisApplication(String applicationId, String endpointKey, String endpoint) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisApplication.java`
#### Snippet
```java

    /**
     * LUIS endpoint like https://westus.api.cognitive.microsoft.com.
     */
    private String endpoint;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/SkillHttpClient.java`
#### Snippet
```java
     * @param originatingAudience The oauth audience scope, used during token
     *                            retrieval. (Either
     *                            https://api.getbotframework().com or bot app id.)
     * @param fromBotId           The MicrosoftAppId of the bot sending the
     *                            activity.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerEndpoint.java`
#### Snippet
```java
    /**
     * Sets the host path. For example
     * "https://westus.api.cognitive.microsoft.com/qnamaker/v2.0".
     *
     * @param withHost The host path.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerEndpoint.java`
#### Snippet
```java
    /**
     * Gets the host path. For example
     * "https://westus.api.cognitive.microsoft.com/qnamaker/v2.0".
     *
     * @return The host path.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
    /**
     * Gets the oauth audience scope, used during token retrieval
     * (either https://api.getbotframework().com or bot app id).
     * @return the FromBotOAuthScope value as a String.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
    /**
     * Sets the oauth audience scope, used during token retrieval
     * (either https://api.getbotframework().com or bot app id).
     * @param withFromBotOAuthScope The FromBotOAuthScope value.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModels.java`
#### Snippet
```java
     *
     * This is mostly a copy/paste from
     * https://github.com/microsoft/Recognizers-Text/blob/master/.NET/Microsoft.Recognizers.Text/C
     * lture.cs#L66 This doesn't directly use Recognizers-Text's MapToNearestLanguage because if
     * they add language support before we do, it will break our prompts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Place.java`
#### Snippet
```java

/**
 * Place (entity type: "https://schema.org/Place").
 */
public class Place implements EntitySerialization {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/GeoCoordinates.java`
#### Snippet
```java
    /**
     * Elevation of the location [WGS
     * 84](https://en.wikipedia.org/wiki/World_Geodetic_System).
     */
    @JsonProperty(value = "elevation")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/GeoCoordinates.java`
#### Snippet
```java

/**
 * GeoCoordinates (entity type: "https://schema.org/GeoCoordinates").
 */
public class GeoCoordinates implements EntitySerialization {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/GeoCoordinates.java`
#### Snippet
```java
    /**
     * Latitude of the location [WGS
     * 84](https://en.wikipedia.org/wiki/World_Geodetic_System).
     */
    @JsonProperty(value = "latitude")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/GeoCoordinates.java`
#### Snippet
```java
    /**
     * Longitude of the location [WGS
     * 84](https://en.wikipedia.org/wiki/World_Geodetic_System).
     */
    @JsonProperty(value = "longitude")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Thing.java`
#### Snippet
```java

/**
 * Thing (entity type: "https://schema.org/Thing").
 */
public class Thing {
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `trimmedText.startsWith("prochain")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
        final String trimmedText = text.trim().toLowerCase();

        if (trimmedText.startsWith("prochain") || trimmedText.startsWith("prochain") ||
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("prochain")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
        final String trimmedText = text.trim().toLowerCase();

        if (trimmedText.startsWith("prochain") || trimmedText.startsWith("prochain") ||
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("prochaine")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java

        if (trimmedText.startsWith("prochain") || trimmedText.startsWith("prochain") ||
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("prochaine")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java

        if (trimmedText.startsWith("prochain") || trimmedText.startsWith("prochain") ||
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("dernier")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
            trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière")) {
            swift = -1;
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("dernière")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
            trimmedText.startsWith("prochaine") || trimmedText.startsWith("prochaine")) {
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
            trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière")) {
            swift = -1;
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("dernier")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
            trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière")) {
            swift = -1;
        }
```

### DuplicateCondition
Duplicate condition `trimmedText.startsWith("dernière")`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
            swift = 1;
        } else if (trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière") ||
            trimmedText.startsWith("dernier") || trimmedText.startsWith("dernière")) {
            swift = -1;
        }
```

### DuplicateCondition
Duplicate condition `StringUtility.isNullOrEmpty(yearStr)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            day = this.config.getDayOfMonth().get(dayStr);

            if (!StringUtility.isNullOrEmpty(yearStr)) {

                year = this.config.getDateExtractor().getYearFromText(match.get());
```

### DuplicateCondition
Duplicate condition `StringUtility.isNullOrEmpty(yearStr)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
                year = this.config.getDateExtractor().getYearFromText(match.get());

            } else if (!StringUtility.isNullOrEmpty(yearStr)) {

                year = Integer.parseInt(yearStr);
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/retry/ExponentialBackoffRetryStrategy.java`
#### Snippet
```java
     * The minimum backoff time.
     */
    private final int minBackoff; //NOPMD
    /**
     * The maximum number of retry attempts.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/retry/ExponentialBackoffRetryStrategy.java`
#### Snippet
```java
     * between retries.
     */
    private final int deltaBackoff; //NOPMD
    /**
     * The maximum backoff time.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/retry/ExponentialBackoffRetryStrategy.java`
#### Snippet
```java
     * The maximum backoff time.
     */
    private final int maxBackoff; //NOPMD
    /**
     * The minimum backoff time.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java
    private TokenValidationParameters tokenValidationParameters;
    private List<String> allowedSigningAlgorithms;
    private OpenIdMetadataResolver openIdMetadataResolver;
    private OpenIdMetadata openIdMetadata;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/core/TelemetryInitializerMiddleware.java`
#### Snippet
```java

    private HttpContext httpContext;
    private final String botActivityKey = "BotBuilderActivity";
    private final TelemetryLoggerMiddleware telemetryLoggerMiddleware;
    private final Boolean logActivityTelemetry;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java

    private final Integer millisecondsTimeout = 2000;
    private final Integer retryTimes = 8;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
    private final BlobContainerClient containerClient;

    private final Integer millisecondsTimeout = 2000;
    private final Integer retryTimes = 8;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
    private static final HashSet<String> CHECKED_CONTAINERS = new HashSet<String>();

    private final Integer milisecondsTimeout = 2000;
    private final Integer retryTimes = 3;
    private final Integer longRadix = 16;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
    private final Integer retryTimes = 3;
    private final Integer longRadix = 16;
    private final Integer multipleProductValue = 10_000_000;

    private final ObjectMapper jsonSerializer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java

    private final Integer milisecondsTimeout = 2000;
    private final Integer retryTimes = 3;
    private final Integer longRadix = 16;
    private final Integer multipleProductValue = 10_000_000;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
    private final Integer milisecondsTimeout = 2000;
    private final Integer retryTimes = 3;
    private final Integer longRadix = 16;
    private final Integer multipleProductValue = 10_000_000;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManager.java`
#### Snippet
```java
public class DialogManager {

    private final String lastAccess = "_lastAccess";
    private String rootDialogId;
    private final String dialogStateProperty;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
    private final String stackKey = "stack";

    private final String activeDialogKey = "activeDialog";

    private final String parentKey = "parent";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
    private final String activeDialogKey = "activeDialog";

    private final String parentKey = "parent";

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
public class DialogContextMemoryScope extends MemoryScope {

    private final String stackKey = "stack";

    private final String activeDialogKey = "activeDialog";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/AtPathResolver.java`
#### Snippet
```java
public class AtPathResolver extends AliasPathResolver {

    private final String prefix = "turn.recognized.entities.";

    private static final char[] DELIMS = {'.', '[' };
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDatePeriodParserConfiguration.java`
#### Snippet
```java
    private final Pattern yearPeriodRegex;
    private final Pattern complexDatePeriodRegex;
    private final Pattern relativeDecadeRegex;
    private final Pattern referenceDatePeriodRegex;
    private final Pattern agoRegex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDatePeriodParserConfiguration.java`
#### Snippet
```java
    private final Pattern restOfDateRegex;
    private final Pattern laterEarlyPeriodRegex;
    private final Pattern weekWithWeekDayRangeRegex;
    private final Pattern yearPlusNumberRegex;
    private final Pattern decadeWithCenturyRegex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDatePeriodParserConfiguration.java`
#### Snippet
```java
    private final Pattern complexDatePeriodRegex;

    private final Pattern relativeDecadeRegex;

    private final Pattern referenceDatePeriodRegex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDatePeriodParserConfiguration.java`
#### Snippet
```java
    private final Pattern laterEarlyPeriodRegex;

    private final Pattern weekWithWeekDayRangeRegex;

    private final Pattern yearPlusNumberRegex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/EmailParser.java`
#### Snippet
```java

public class EmailParser extends BaseSequenceParser {
    private BaseSequenceConfiguration config;

    public EmailParser(BaseSequenceConfiguration config) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
public class GUIDParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java

public class GUIDParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";

    private static final Pattern GUID_ELEMENT_REGEX = Pattern.compile(BaseGUID.GUIDRegexElement);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;

    // @TODO move regexes to base resource files
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java

    // @TODO move regexes to base resource files
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";

    private static final Pattern COUNTRY_CODE_REGEX = Pattern.compile(BasePhoneNumbers.CountryCodeRegex);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
public class PhoneNumberParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    // @TODO move regexes to base resource files
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java

public class PhoneNumberParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
public class BaseURLExtractor extends BaseSequenceExtractor {
    private final URLConfiguration config;
    private StringMatcher tldMatcher;
    private Pattern ambiguousTimeTerm;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java

public class BaseURLExtractor extends BaseSequenceExtractor {
    private final URLConfiguration config;
    private StringMatcher tldMatcher;
    private Pattern ambiguousTimeTerm;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexProperty.java`
#### Snippet
```java
    private String timexValue;

    private HashSet<String> types;

    private Boolean now;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexProperty.java`
#### Snippet
```java
    private Time time;

    private String timexValue;

    private HashSet<String> types;
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
                boolean overlap = false;
                for (ExtractResult er : ers) {
                    if (er.getStart() <= timeNum.getStart() && er.getStart() + er.getLength() >= timeNum.getStart()) {
                        overlap = true;
                    }
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeZoneExtractor.java`
#### Snippet
```java
            }

            if (!isInside) {
                isAllSuffixInsideTokens = false;
            }
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/models/AbstractNumberWithUnitModel.java`
#### Snippet
```java

                    for (ModelResult extractionResult : extractionResults) {
                        if (extractionResult.start == result.start && extractionResult.end == result.end) {
                            badd = false;
                        }
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java
            boolean overlap = false;
            for (ExtractResult er : ers) {
                if (er.getStart() <= extractResult.getStart() && er.getStart() + er.getLength() >= extractResult.getStart()) {
                    overlap = true;
                }
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java

                for (Matcher match : prefixMatch) {
                    if (match.end() == start) {
                        numberPrefix = true;
                    }
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java

                for (Matcher match : suffixMatch) {
                    if (start + length == match.start()) {
                        numberSuffix = true;
                    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `URL.toString()` is ignored
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentials.java`
#### Snippet
```java
                AuthenticationConstants.TO_CHANNEL_FROM_BOT_LOGIN_URL_TEMPLATE, withAuthTenant
            );
            new URL(endPointUrl).toString();
            setAuthTenant(withAuthTenant);
        } catch (MalformedURLException e) {
```

### IgnoreResultOfCall
Result of `CompletableFuture.completedFuture()` is ignored
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TraceTranscriptLogger.java`
#### Snippet
```java
        } catch (JsonProcessingException e) {
            LOGGER.error("logActivity", e);
            CompletableFuture.completedFuture(null);
        }
        LOGGER.info(event);
```

### IgnoreResultOfCall
Result of `Throwable.getMessage()` is ignored
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/models/DateTimeModel.java`
#### Snippet
```java
            // Nothing to do. Exceptions in parse should not break users of recognizers.
            // No result.
            e.getMessage();
        }

```

## RuleId[id=FinalizeNotProtected]
### FinalizeNotProtected
'finalize()' should have protected access, not public
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextStateCollection.java`
#### Snippet
```java
     */
    @Override
    public void finalize() {
        try {
            close();
```

### FinalizeNotProtected
'finalize()' should have protected access, not public
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextImpl.java`
#### Snippet
```java
     */
    @Override
    public void finalize() {
        try {
            close();
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.microsoft.recognizers.text.sequence.resources.ChinesePhoneNumbers.NonWordBoundariesRegex' accessed via instance reference
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/ChineseIp.java`
#### Snippet
```java

    public static final String Ipv6EllipsisRegexOther = "({PhoneNumbersDefinitions.NonWordBoundariesRegex}::{PhoneNumbersDefinitions.NonWordBoundariesRegex}|{PhoneNumbersDefinitions.NonWordBoundariesRegex}:(:{BaseIp.BasicIpv6Element}){1,7}{PhoneNumbersDefinitions.WordBoundariesRegex}|{PhoneNumbersDefinitions.WordBoundariesRegex}({BaseIp.BasicIpv6Element}:){1,7}:{PhoneNumbersDefinitions.NonWordBoundariesRegex})"
            .replace("{PhoneNumbersDefinitions.NonWordBoundariesRegex}", PhoneNumbersDefinitions.NonWordBoundariesRegex)
            .replace("{PhoneNumbersDefinitions.WordBoundariesRegex}", PhoneNumbersDefinitions.WordBoundariesRegex)
            .replace("{BaseIp.BasicIpv6Element}", BaseIp.BasicIpv6Element);
```

### AccessStaticViaInstance
Static member 'com.microsoft.recognizers.text.sequence.resources.ChinesePhoneNumbers.WordBoundariesRegex' accessed via instance reference
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/ChineseIp.java`
#### Snippet
```java
    public static final String Ipv6EllipsisRegexOther = "({PhoneNumbersDefinitions.NonWordBoundariesRegex}::{PhoneNumbersDefinitions.NonWordBoundariesRegex}|{PhoneNumbersDefinitions.NonWordBoundariesRegex}:(:{BaseIp.BasicIpv6Element}){1,7}{PhoneNumbersDefinitions.WordBoundariesRegex}|{PhoneNumbersDefinitions.WordBoundariesRegex}({BaseIp.BasicIpv6Element}:){1,7}:{PhoneNumbersDefinitions.NonWordBoundariesRegex})"
            .replace("{PhoneNumbersDefinitions.NonWordBoundariesRegex}", PhoneNumbersDefinitions.NonWordBoundariesRegex)
            .replace("{PhoneNumbersDefinitions.WordBoundariesRegex}", PhoneNumbersDefinitions.WordBoundariesRegex)
            .replace("{BaseIp.BasicIpv6Element}", BaseIp.BasicIpv6Element);

```

### AccessStaticViaInstance
Static member 'com.microsoft.recognizers.text.sequence.resources.ChinesePhoneNumbers.WordBoundariesRegex' accessed via instance reference
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/ChineseIp.java`
#### Snippet
```java

    public static final String Ipv6Regex = "({PhoneNumbersDefinitions.WordBoundariesRegex}{BaseIp.MergedIpv6Regex}{PhoneNumbersDefinitions.WordBoundariesRegex})|({Ipv6EllipsisRegexOther})"
            .replace("{PhoneNumbersDefinitions.WordBoundariesRegex}", PhoneNumbersDefinitions.WordBoundariesRegex)
            .replace("{BaseIp.MergedIpv6Regex}", BaseIp.MergedIpv6Regex)
            .replace("{Ipv6EllipsisRegexOther}", Ipv6EllipsisRegexOther);
```

### AccessStaticViaInstance
Static member 'com.microsoft.recognizers.text.sequence.resources.ChinesePhoneNumbers.WordBoundariesRegex' accessed via instance reference
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/ChineseIp.java`
#### Snippet
```java

    public static final String Ipv4Regex = "({PhoneNumbersDefinitions.WordBoundariesRegex}(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)((\\.(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)){3}){PhoneNumbersDefinitions.EndWordBoundariesRegex})"
            .replace("{PhoneNumbersDefinitions.WordBoundariesRegex}", PhoneNumbersDefinitions.WordBoundariesRegex)
            .replace("{PhoneNumbersDefinitions.EndWordBoundariesRegex}", PhoneNumbersDefinitions.EndWordBoundariesRegex);

```

### AccessStaticViaInstance
Static member 'com.microsoft.recognizers.text.sequence.resources.ChinesePhoneNumbers.EndWordBoundariesRegex' accessed via instance reference
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/ChineseIp.java`
#### Snippet
```java
    public static final String Ipv4Regex = "({PhoneNumbersDefinitions.WordBoundariesRegex}(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)((\\.(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)){3}){PhoneNumbersDefinitions.EndWordBoundariesRegex})"
            .replace("{PhoneNumbersDefinitions.WordBoundariesRegex}", PhoneNumbersDefinitions.WordBoundariesRegex)
            .replace("{PhoneNumbersDefinitions.EndWordBoundariesRegex}", PhoneNumbersDefinitions.EndWordBoundariesRegex);

    public static final String Ipv6EllipsisRegexOther = "({PhoneNumbersDefinitions.NonWordBoundariesRegex}::{PhoneNumbersDefinitions.NonWordBoundariesRegex}|{PhoneNumbersDefinitions.NonWordBoundariesRegex}:(:{BaseIp.BasicIpv6Element}){1,7}{PhoneNumbersDefinitions.WordBoundariesRegex}|{PhoneNumbersDefinitions.WordBoundariesRegex}({BaseIp.BasicIpv6Element}:){1,7}:{PhoneNumbersDefinitions.NonWordBoundariesRegex})"
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getModelTypeName()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/models/BooleanModel.java`
#### Snippet
```java
    }

    public String getModelTypeName() {
        return Constants.MODEL_BOOLEAN;
    }
```

### RedundantMethodOverride
Method `getNegativeNumberTermsRegex()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/DoubleExtractor.java`
#### Snippet
```java

    @Override
    protected Optional<Pattern> getNegativeNumberTermsRegex() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getOptions()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/OrdinalExtractor.java`
#### Snippet
```java

    @Override
    protected NumberOptions getOptions() {
        return NumberOptions.None;
    }
```

### RedundantMethodOverride
Method `getOptions()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/DoubleExtractor.java`
#### Snippet
```java

    @Override
    protected NumberOptions getOptions() {
        return NumberOptions.None;
    }
```

### RedundantMethodOverride
Method `getNegativeNumberTermsRegex()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/OrdinalExtractor.java`
#### Snippet
```java

    @Override
    protected Optional<Pattern> getNegativeNumberTermsRegex() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getOptions()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/CardinalExtractor.java`
#### Snippet
```java

    @Override
    protected NumberOptions getOptions() {
        return NumberOptions.None;
    }
```

### RedundantMethodOverride
Method `getNegativeNumberTermsRegex()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/CardinalExtractor.java`
#### Snippet
```java

    @Override
    protected Optional<Pattern> getNegativeNumberTermsRegex() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getNegativeNumberTermsRegex()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/IntegerExtractor.java`
#### Snippet
```java

    @Override
    protected Optional<Pattern> getNegativeNumberTermsRegex() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getOptions()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/IntegerExtractor.java`
#### Snippet
```java

    @Override
    protected NumberOptions getOptions() {
        return NumberOptions.None;
    }
```

### RedundantMethodOverride
Method `getNegativeNumberTermsRegex()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/extractors/FractionExtractor.java`
#### Snippet
```java

    @Override
    protected Optional<Pattern> getNegativeNumberTermsRegex() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getRegexes()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
    protected final String extractType = Constants.SYS_URL;

    protected Map<Pattern, String> getRegexes() {
        return regexes;
    }
```

### RedundantMethodOverride
Method `getRegexes()` is identical to its super method
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseEmailExtractor.java`
#### Snippet
```java
    protected final String extractType = Constants.SYS_EMAIL;

    protected Map<Pattern, String> getRegexes() {
        return regexes;
    }
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Illegal format string specifier: flags ' 0' not allowed in '%0 %'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
        if (nextCalled) {
            return Async.completeExceptionally(new IllegalStateException(
                String.format("WaterfallStepContext.next(): method already called for dialog and step '%0 %1",
            parentWaterfall.getId(), index)
            ));
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
                writer.close();
            } catch (Exception e) {
                throw e;
            }
        }
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
                    ret.add(new Token(
                            (er != null) ? er.getStart() : 0,
                            ((er != null) ? er.getStart() + er.getLength() : 0) + ((match != null) ? match.get().index + match.get().length : 0)));
                }
            }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
7 \* (cardinal - 1): integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        }

        return firstWeekday.plusDays(7 * (cardinal - 1));
    }

```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* (weekNum - 1): integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            int weekNum = this.config.getCardinalMap().get(cardinalStr);
            targetWeekMonday = DateUtil.thisDate(getFirstThursday(year), DayOfWeek.MONDAY.getValue())
                    .plusDays(Constants.WeekDayCount * (weekNum - 1));

            ret.setTimex(TimexUtility.generateWeekOfYearTimex(year, weekNum));
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* (cardinal - 1): integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            LocalDateTime firstThursday = getFirstThursday(year, month);

            result = DateUtil.thisDate(firstThursday, DayOfWeek.MONDAY.getValue()).plusDays(Constants.WeekDayCount * (cardinal - 1));
        }

```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                if (this.config.isWeekOnly(trimmedText)) {
                    LocalDateTime thursday = DateUtil.thisDate(referenceDate, DayOfWeek.THURSDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

                    ret.setTimex(isRef ? TimexUtility.generateWeekTimex() : TimexUtility.generateWeekTimex(thursday));
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    ret.setTimex(isRef ? TimexUtility.generateWeekTimex() : TimexUtility.generateWeekTimex(thursday));

                    LocalDateTime beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.MONDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

                    LocalDateTime endValue = DateUtil.thisDate(referenceDate, DayOfWeek.SUNDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    LocalDateTime beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.MONDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

                    LocalDateTime endValue = DateUtil.thisDate(referenceDate, DayOfWeek.SUNDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

                    LocalDateTime endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                    if (earlyPrefix) {
                        endValue = DateUtil.thisDate(referenceDate, DayOfWeek.WEDNESDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                        endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
                    } else if (midPrefix) {
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                        endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
                    } else if (midPrefix) {
                        beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.TUESDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                        endValue = DateUtil.thisDate(referenceDate, DayOfWeek.FRIDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                        endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    } else if (midPrefix) {
                        beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.TUESDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                        endValue = DateUtil.thisDate(referenceDate, DayOfWeek.FRIDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                        endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
                    } else if (latePrefix) {
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                        endDate = inclusiveEndPeriod ? endValue : endValue.plusDays(1);
                    } else if (latePrefix) {
                        beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.THURSDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                    }

```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                if (this.config.isWeekend(trimmedText)) {
                    LocalDateTime beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.SATURDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                    LocalDateTime endValue = DateUtil.thisDate(referenceDate, DayOfWeek.SUNDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* swift: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                if (this.config.isWeekend(trimmedText)) {
                    LocalDateTime beginDate = DateUtil.thisDate(referenceDate, DayOfWeek.SATURDAY.getValue()).plusDays(Constants.WeekDayCount * swift);
                    LocalDateTime endValue = DateUtil.thisDate(referenceDate, DayOfWeek.SUNDAY.getValue()).plusDays(Constants.WeekDayCount * swift);

                    ret.setTimex(isRef ? TimexUtility.generateWeekendTimex() : TimexUtility.generateWeekendTimex(beginDate));
```

### IntegerMultiplicationImplicitCastToLong
Constants.WeekDayCount \* num: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            }

            LocalDateTime value = firstThursday.plusDays(Constants.WeekDayCount * num - 3);
            ret.setFutureValue(new Pair<>(value, value.plusDays(7)));
            ret.setPastValue(new Pair<>(value, value.plusDays(7)));
```

### IntegerMultiplicationImplicitCastToLong
7 \* offset: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
                break;
            case ByWeek:
                result = date.plusDays(7 * offset);
                break;
            case ByDay:
```

### IntegerMultiplicationImplicitCastToLong
weekOfYear \* 7: integer multiplication implicitly cast to long
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        }

        firstWeekDay = firstWeekDay.plusDays(weekOfYear * 7);

        return firstWeekDay;
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Null check can be eliminated with 'ifPresent'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java
            int afterStringOffset = er.getStart() + er.getLength() + whiteSpacesCount;

            Match match = Arrays.stream(RegExpUtility.getMatches(config.getCenturySuffixRegex(), trimmedAfterStr)).findFirst().orElse(null);

            if (match != null) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/ChoiceExtractDataResult.java`
#### Snippet
```java
import com.microsoft.recognizers.text.ExtractResult;

import java.util.ArrayList;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/parsers/OptionsParseDataResult.java`
#### Snippet
```java
package com.microsoft.recognizers.text.choice.parsers;

import java.util.ArrayList;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.DateTimeOptions;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDatePeriodExtractorConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.IExtractor;
import com.microsoft.recognizers.text.IParser;
import com.microsoft.recognizers.text.datetime.DateTimeOptions;
import com.microsoft.recognizers.text.datetime.config.BaseOptionsConfiguration;
import com.microsoft.recognizers.text.datetime.config.IOptionsConfiguration;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.Match;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDatePeriodExtractorConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.number.english.parsers.EnglishNumberParserConfiguration;
import com.microsoft.recognizers.text.number.parsers.BaseNumberParser;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDatePeriodExtractorConfiguration.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDatePeriodExtractorConfiguration.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.Match;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.utilities.RegexExtension;
import com.microsoft.recognizers.text.number.english.extractors.CardinalExtractor;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

```

### UNUSED_IMPORT
Unused import `import org.javatuples.Pair;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
import java.util.stream.Collectors;

import org.javatuples.Pair;

import org.javatuples.Pair;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDatePeriodParserConfiguration.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.parsers.BaseTimeZoneParser;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishMergedParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.parsers.BaseHolidayParser;
import com.microsoft.recognizers.text.datetime.parsers.BaseSetParser;
import com.microsoft.recognizers.text.datetime.parsers.BaseTimeZoneParser;
import com.microsoft.recognizers.text.datetime.parsers.IDateTimeParser;
import com.microsoft.recognizers.text.datetime.parsers.config.IMergedParserConfiguration;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.Match;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/TimeParser.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.utilities.DateUtil;
import com.microsoft.recognizers.text.datetime.utilities.RegexExtension;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;
import com.microsoft.recognizers.text.utilities.StringUtility;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.RegExpUtility;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/TimeParser.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.utilities.RegexExtension;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;
import com.microsoft.recognizers.text.utilities.StringUtility;

```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/TimeParser.java`
#### Snippet
```java

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/TimeParser.java`
#### Snippet
```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

public class TimeParser extends BaseTimeParser {
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.utilities.ConditionalMatch;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.extractors.config.ITimePeriodExtractorConfiguration;
import com.microsoft.recognizers.text.datetime.extractors.config.ResultIndex;
import com.microsoft.recognizers.text.datetime.utilities.ConditionalMatch;
import com.microsoft.recognizers.text.datetime.utilities.RegexExtension;
import com.microsoft.recognizers.text.datetime.utilities.TimeZoneUtility;
```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeZoneExtractor.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/config/ProcessedSuperfluousWords.java`
#### Snippet
```java
import com.microsoft.recognizers.text.matcher.MatchResult;

import java.util.List;

public class ProcessedSuperfluousWords {
```

### UNUSED_IMPORT
Unused import `import java.sql.Time;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
import com.microsoft.recognizers.text.utilities.StringUtility;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.Match;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.utilities.DateTimeResolutionResult;
import com.microsoft.recognizers.text.datetime.utilities.TimeZoneResolutionResult;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/config/ICommonDateTimeParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.utilities.IDateTimeUtilityConfiguration;

import java.util.regex.Pattern;

public interface ICommonDateTimeParserConfiguration extends IOptionsConfiguration {
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableList;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/config/IDateParserConfiguration.java`
#### Snippet
```java
package com.microsoft.recognizers.text.datetime.parsers.config;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.microsoft.recognizers.text.IExtractor;
```

### UNUSED_IMPORT
Unused import `import java.time.LocalDate;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/config/IHolidayParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.config.IOptionsConfiguration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/config/IHolidayParserConfiguration.java`
#### Snippet
```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.config.IOptionsConfiguration;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/config/IMergedParserConfiguration.java`
#### Snippet
```java
package com.microsoft.recognizers.text.datetime.parsers.config;

import com.microsoft.recognizers.text.datetime.config.IOptionsConfiguration;
import com.microsoft.recognizers.text.datetime.parsers.IDateTimeParser;
import com.microsoft.recognizers.text.matcher.StringMatcher;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/BaseDateTime.java`
#### Snippet
```java
package com.microsoft.recognizers.text.datetime.resources;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishTimeZone.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.RegExpUtility;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishCommonDateTimeParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.number.spanish.extractors.OrdinalExtractor;
import com.microsoft.recognizers.text.number.spanish.parsers.SpanishNumberParserConfiguration;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishCommonDateTimeParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.utilities.RegExpUtility;

import java.util.regex.Pattern;

public class SpanishCommonDateTimeParserConfiguration extends BaseDateParserConfiguration implements ICommonDateTimeParserConfiguration {
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishTimeExtractorConfiguration;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDateParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.resources.SpanishDateTime;
import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishDateExtractorConfiguration;
import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishTimeExtractorConfiguration;
import com.microsoft.recognizers.text.datetime.utilities.IDateTimeUtilityConfiguration;
import com.microsoft.recognizers.text.datetime.utilities.StringExtension;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.datetime.resources.EnglishDateTime;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDatePeriodParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.parsers.config.ICommonDateTimeParserConfiguration;
import com.microsoft.recognizers.text.datetime.parsers.config.IDatePeriodParserConfiguration;
import com.microsoft.recognizers.text.datetime.resources.EnglishDateTime;
import com.microsoft.recognizers.text.datetime.resources.SpanishDateTime;
import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishDatePeriodExtractorConfiguration;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.utilities.RegExpUtility;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDateTimePeriodParserConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishDateTimePeriodExtractorConfiguration;
import com.microsoft.recognizers.text.datetime.spanish.extractors.SpanishTimePeriodExtractorConfiguration;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

import java.util.Locale;
```

### UNUSED_IMPORT
Unused import `import java.util.Locale;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateUtil.java`
#### Snippet
```java
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateUtil {
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/AcAutomation.java`
#### Snippet
```java
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class AcAutomation<T> extends AbstractMatcher<T> {
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/StringMatcher.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/TrieTree.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/TrieTree.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.number.NumberMode;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/chinese/extractors/NumberExtractor.java`
#### Snippet
```java

import com.microsoft.recognizers.text.number.Constants;
import com.microsoft.recognizers.text.number.NumberMode;
import com.microsoft.recognizers.text.number.chinese.ChineseNumberExtractorMode;
import com.microsoft.recognizers.text.number.extractors.BaseNumberExtractor;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableMap;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/BaseNumbers.java`
#### Snippet
```java
package com.microsoft.recognizers.text.number.resources;

import com.google.common.collect.ImmutableMap;

public class BaseNumbers {
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/ChineseNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/EnglishNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/FrenchNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/PortugueseNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/SpanishNumeric.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/english/extractors/AgeExtractorConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.numberwithunit.resources.EnglishNumericWithUnit;

import java.util.Collections;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.numberwithunit.resources.EnglishNumericWithUnit;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/french/extractors/FrenchNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
import com.microsoft.recognizers.text.number.french.extractors.NumberExtractor;
import com.microsoft.recognizers.text.numberwithunit.extractors.INumberWithUnitExtractorConfiguration;
import com.microsoft.recognizers.text.numberwithunit.resources.EnglishNumericWithUnit;
import com.microsoft.recognizers.text.numberwithunit.resources.FrenchNumericWithUnit;
import com.microsoft.recognizers.text.utilities.DefinitionLoader;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/BaseCurrency.java`
#### Snippet
```java
package com.microsoft.recognizers.text.numberwithunit.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/BaseCurrency.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.List;
import java.util.Map;

```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/BaseCurrency.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/ChineseNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/EnglishNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/FrenchNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/GermanNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/JapaneseNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/PortugueseNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/SpanishNumericWithUnit.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.resources.datatypes.List;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/DictionaryWriter.java`
#### Snippet
```java

import com.microsoft.recognizers.text.resources.datatypes.Dictionary;
import com.microsoft.recognizers.text.resources.datatypes.List;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseIpExtractor.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseIpExtractor.java`
#### Snippet
```java
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseSequenceExtractor.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseSequenceExtractor.java`
#### Snippet
```java
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public abstract class BaseSequenceExtractor implements IExtractor {
```

### UNUSED_IMPORT
Unused import `import com.microsoft.recognizers.text.matcher.MatchResult;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
package com.microsoft.recognizers.text.sequence.extractors;

import com.microsoft.recognizers.text.matcher.MatchResult;
import com.microsoft.recognizers.text.matcher.StringMatcher;
import com.microsoft.recognizers.text.sequence.Constants;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

```

### UNUSED_IMPORT
Unused import `import java.util.stream.StreamSupport;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class BaseURLExtractor extends BaseSequenceExtractor {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `answerArray` are updated, but never queried
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerRecognizer.java`
#### Snippet
```java
                    ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
                    ObjectNode entitiesNode = mapper.createObjectNode();
                    List<String> answerArray = new ArrayList<String>();
                    answerArray.add(topAnswer.getAnswer());
                    ArrayNode entitiesArrayNode = entitiesNode.putArray("answer");
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
            .stream()
            .filter(answer -> answer.getScore() > options.getScoreThreshold())
            .collect(Collectors.toList());
        results.setAnswers(answerList.toArray(new QueryResult[answerList.size()]));

```

### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        if (slot.getType().equals(currentType)) {
            Stream<String> timexStream = Arrays.asList(slot.getTimexStr().split(",|\\(|\\)")).stream();
            String[] timexComponents = timexStream.filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);

            // Only handle DatePeriod like "(StartDate,EndDate,Duration)"
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
            if (appCredentials == null) {
                return Async.completeExceptionally(
                        new Exception(String.format("Unable to get appCredentials to connect to the skill")));
            }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/ResourcesGenerator.java`
#### Snippet
```java
                Path inputPath = FileSystems.getDefault().getPath(ResourcesPath, String.join(File.separator, config.input) + ".yaml");
                Path outputPath = FileSystems.getDefault().getPath(definition.outputPath, config.output + ".java");
                System.out.println(String.format("%s => %s", inputPath.toString(), outputPath.toString()));

                String header = String.join(LineBreak, config.header);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BasePercentageExtractor.java`
#### Snippet
```java
            if (type == 0) {
                // subsequence which won't be extracted
                ret += input.substring(start, end + 1);
                for (int i = start; i <= end; i++) {
                    positionMap.put(index++, i);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BasePercentageExtractor.java`
#### Snippet
```java
                // subsequence which will be extracted as number, type is negative for fraction number extraction
                String replaceText = type > 0 ? replaceNumText : replaceFracText;
                ret += replaceText;
                for (int i = 0; i < replaceText.length(); i++) {
                    positionMap.put(index++, start);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
                    number = number == "0" ? number : StringUtility.trimStart(number, "^[0]+","");
                    number = StringUtils.isBlank(number) ? "0" : number;
                    result += number;
                }

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
                }

                result += text.charAt(i);
                number = new String();
            } else {
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/SkillHttpClient.java`
#### Snippet
```java
     * @return task with invokeResponse.
     */
    public <T extends Object> CompletableFuture<TypedInvokeResponse<T>> postActivity(String originatingAudience,
            String fromBotId, BotFrameworkSkill toSkill, URI callbackUrl, Activity activity, Class<T> type) {
        return getSkillConversationId(originatingAudience, fromBotId, toSkill, activity)
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/SkillHttpClient.java`
#### Snippet
```java
     * @return task with optional invokeResponse of type T.
     */
    public <T extends Object> CompletableFuture<TypedInvokeResponse<T>> postActivity(String fromBotId,
            BotFrameworkSkill toSkill, URI callbackUrl, Activity activity, Class<T> type) {
        String originatingAudience = getChannelProvider() != null && getChannelProvider().isGovernment()
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
     */
    @Override
    public <T extends Object> CompletableFuture<TypedInvokeResponse<T>> postActivity(String fromBotId, String toBotId,
            URI toUrl, URI serviceUrl, String conversationId, Activity activity, Class<T> type) {

```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
    }

    private <T extends Object> CompletableFuture<TypedInvokeResponse<T>> securePostActivity(
        URI toUrl,
        Activity activity,
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
     * @return InvokeResponse.
     */
    public <T extends Object> CompletableFuture<TypedInvokeResponse<T>> postActivity(String botId, URI botEndpoint,
            Activity activity, Class<T> type) {

```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
     * @throws IllegalArgumentException Empty name
     */
    public <T extends Object> StatePropertyAccessor<T> createProperty(String name) throws IllegalArgumentException {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("name cannot be empty");
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/BotFrameworkClient.java`
#### Snippet
```java
     * @return   task with optional invokeResponse.
     */
    public abstract <T extends Object> CompletableFuture<TypedInvokeResponse<T>> postActivity(
        String fromBotId,
        String toBotId,
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {
        throw new UnsupportedOperationException(notSupported);
    }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java

    @Override
    public final void putAll(Map<? extends String, ? extends Object> m) {
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `sendX5c` initializer `true` is redundant
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CertificateAppCredentialsOptions.java`
#### Snippet
```java
    private InputStream pkcs12Certificate;
    private String pkcs12Password;
    private boolean sendX5c = true;

    /**
```

### UnusedAssignment
Variable `appId` initializer `null` is redundant
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenValidation.java`
#### Snippet
```java
        }

        String appId = null;

        String tokenVersion = claims.get(AuthenticationConstants.VERSION_CLAIM);
```

### UnusedAssignment
Variable `qnaResponse` initializer `null` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java
        String endpointKey = endpoint.getEndpointKey();
        Response response;
        JsonNode qnaResponse = null;
        try {
            Request request = buildRequest(requestUrl, endpointKey, buildRequestBody(payloadBody));
```

### UnusedAssignment
Variable `appCredentials` initializer `null` is redundant
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
        // If the credentials are in the cache, retrieve them from there
        String cacheKey = String.format("%s%s", appId, oAuthScope);
        AppCredentials appCredentials = null;
        appCredentials = appCredentialMapCache.get(cacheKey);
        if (appCredentials != null) {
```

### UnusedAssignment
Variable `jsonContent` initializer `""` is redundant
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
        Class<T> type
    ) {
        String jsonContent = "";
        try {
            ObjectMapper mapper = new JacksonAdapter().serializer();
```

### UnusedAssignment
Variable `jsonResponse` initializer `null` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        QnAMakerOptions options
    ) throws IOException {
        String jsonResponse = null;
        JacksonAdapter jacksonAdapter = new JacksonAdapter();
        QueryResults results = null;
```

### UnusedAssignment
Variable `results` initializer `null` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        String jsonResponse = null;
        JacksonAdapter jacksonAdapter = new JacksonAdapter();
        QueryResults results = null;

        jsonResponse = response.toString();
```

### UnusedAssignment
Variable `jsonRequest` initializer `null` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        );
        JacksonAdapter jacksonAdapter = new JacksonAdapter();
        String jsonRequest = null;

        JSONObject jsonObject = new JSONObject();
```

### UnusedAssignment
The value `i + 1` assigned to `start` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
                soFar.add(segment);
            }
            start = i + 1;

            if (eval) {
```

### UnusedAssignment
Variable `end` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/pathresolvers/AtPathResolver.java`
#### Snippet
```java
        path = path.trim();
        if (path.startsWith("@") && path.length() > 1 && isPathChar(path.charAt(1))) {
            int end = 0;
            int endperiod = path.indexOf(DELIMS[0]);
            int endbracket = path.indexOf(DELIMS[1]);
```

### UnusedAssignment
Variable `memoryScope` initializer `null` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        path = transformPath(path);

        MemoryScope memoryScope = null;
        StringBuilder remainingPath = new StringBuilder();

```

### UnusedAssignment
Variable `array` initializer `new ArrayNode(JsonNodeFactory.instance)` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
    @SuppressWarnings("PMD.UnusedFormalParameter")
    private static ResultPair<Object> tryGetFirstNestedValue(AtomicReference<String> remainingPath, Object memory) {
        ArrayNode array = new ArrayNode(JsonNodeFactory.instance);
        Object value;
        array = ObjectPath.tryGetPathValue(memory, remainingPath.get(), ArrayNode.class);
```

### UnusedAssignment
Variable `invokeValue` initializer `null` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
    protected CompletableFuture<InvokeResponse> onInvokeActivity(TurnContext turnContext) {
        if (StringUtils.equals(turnContext.getActivity().getName(), "adaptiveCard/action")) {
            AdaptiveCardInvokeValue invokeValue = null;
            try {
                invokeValue = getAdaptiveCardInvokeValue(turnContext.getActivity());
```

### UnusedAssignment
The value `""` assigned to `token` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/ChoiceExtractor.java`
#### Snippet
```java
        if (!StringUtility.isNullOrWhiteSpace(token)) {
            tokens.add(token);
            token = "";
        }

```

### UnusedAssignment
Variable `intPart` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseCJKNumberParser.java`
#### Snippet
```java
        String resultText = extResult.getText();
        String[] splitResult = cjkConfig.getFracSplitRegex().split(resultText);
        String intPart = "";
        String demoPart = "";
        String numPart = "";
```

### UnusedAssignment
Variable `demoPart` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseCJKNumberParser.java`
#### Snippet
```java
        String[] splitResult = cjkConfig.getFracSplitRegex().split(resultText);
        String intPart = "";
        String demoPart = "";
        String numPart = "";
        
```

### UnusedAssignment
Variable `numPart` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseCJKNumberParser.java`
#### Snippet
```java
        String intPart = "";
        String demoPart = "";
        String numPart = "";
        
        if (splitResult.length == 3) {
```

### UnusedAssignment
Variable `mulValue` initializer `1` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
        } else {
            int lastIndex = 0;
            double mulValue = 1;
            double partValue = 1;
            for (int i = 0; i < isEnd.length; i++) {
```

### UnusedAssignment
Variable `partValue` initializer `1` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
            int lastIndex = 0;
            double mulValue = 1;
            double partValue = 1;
            for (int i = 0; i < isEnd.length; i++) {
                if (isEnd[i]) {
```

### UnusedAssignment
Variable `intValue` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
            // Split mixed number with fraction
            double numerValue = 0;
            double intValue = 0;

            int mixedIndex = fracWords.size();
```

### UnusedAssignment
Variable `tmpIndex` initializer `-1` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
        int startIndex = 0;
        while (match.find()) {
            int tmpIndex = -1;
            String matched = match.group();
            double rep = config.getRoundNumberMap().get(matched);
```

### UnusedAssignment
Variable `timeOfDay` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchTimePeriodParserConfiguration.java`
#### Snippet
```java
        endMin = 0;

        String timeOfDay = "";
        if (FrenchDateTime.MorningTermList.stream().anyMatch(o -> trimmedText.endsWith(o))) {
            timeOfDay = Constants.Morning;
```

### UnusedAssignment
The value `null` assigned to `timex` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateTimeParserConfiguration.java`
#### Snippet
```java
            timex = "FUTURE_REF";
        } else {
            timex = null;
            return new ResultTimex(false, null);
        }
```

### UnusedAssignment
Variable `timeOfDay` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimePeriodParserConfiguration.java`
#### Snippet
```java
        endMin = 0;

        String timeOfDay = "";

        if (EnglishDateTime.MorningTermList.stream().anyMatch(trimmedText::endsWith)) {
```

### UnusedAssignment
The value `null` assigned to `timeStr` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDateTimePeriodParserConfiguration.java`
#### Snippet
```java
        endHour = 0;
        endMin = 0;
        timeStr = null;
        boolean result = false;

```

### UnusedAssignment
Variable `hour` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java
        String trimmedText = text.trim().toLowerCase();

        int hour = 0;
        int minute = 0;
        int second = 0;
```

### UnusedAssignment
Variable `hours` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
        }

        int hours = 0;
        final int minutes;
        if (utcOffset.contains(":")) {
```

### UnusedAssignment
Variable `hour` initializer `null` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
        // parse hour pattern, like "twenty one", "16"
        // create a extract comments which content the pass-in text
        Integer hour = null;
        if (config.getNumbers().containsKey(text)) {
            hour = config.getNumbers().get(text);
```

### UnusedAssignment
Variable `day` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        String trimmedText = text.trim().toLowerCase();
        int day = 0;

        List<ExtractResult> er = this.config.getOrdinalExtractor().extract(trimmedText);
```

### UnusedAssignment
Variable `pr1` initializer `null` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
    private DateTimeResolutionResult mergeTwoTimePoints(String text, LocalDateTime referenceTime) {
        DateTimeResolutionResult ret = new DateTimeResolutionResult();
        DateTimeParseResult pr1 = null;
        DateTimeParseResult pr2 = null;
        boolean validTimeNumber = false;
```

### UnusedAssignment
Variable `pr2` initializer `null` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
        DateTimeResolutionResult ret = new DateTimeResolutionResult();
        DateTimeParseResult pr1 = null;
        DateTimeParseResult pr2 = null;
        boolean validTimeNumber = false;

```

### UnusedAssignment
Variable `timeOfDay` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishTimePeriodParserConfiguration.java`
#### Snippet
```java
        endMin = 0;

        String timeOfDay = "";

        if (SpanishDateTime.EarlyMorningTermList.stream().anyMatch(trimmedText::endsWith)) {
```

### UnusedAssignment
Variable `ptTimex` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
            LocalDateTime beginTime = referenceDate;
            LocalDateTime endTime = referenceDate;
            String ptTimex = "";

            if (config.getUnitMap().containsKey(srcUnit)) {
```

### UnusedAssignment
Variable `dateStr` initializer `""` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
            ret.setComment(parseTimePeriodResult.comments);

            String dateStr = "";

            // Parse following date
```

### UnusedAssignment
Variable `day` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
    public static LocalDateTime calculateHolidayByEaster(int year, int days) {

        int day = 0;
        int month = 3;

```

### UnusedAssignment
Variable `beginDateResult` initializer `beginDate` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

    private GetModAndDateResult getModAndDate(LocalDateTime beginDate, LocalDateTime endDate, LocalDateTime referenceDate, String timex, boolean future) {
        LocalDateTime beginDateResult = beginDate;
        LocalDateTime endDateResult = endDate;
        boolean isBusinessDay = timex.endsWith(Constants.TimexBusinessDay);
```

### UnusedAssignment
The value `getModAndDateResult.beginDate` assigned to `beginDate` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                        !DurationParsingUtil.isMultipleDuration(durationResult.getTimex()) && !isMatch) {
                    getModAndDateResult = getModAndDate(beginDate, endDate, referenceDate, durationResult.getTimex(), true);
                    beginDate = getModAndDateResult.beginDate;
                    endDate = getModAndDateResult.endDate;

```

### UnusedAssignment
Variable `isDateRelative` initializer `false` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
    private DateContext getYearContext(String startDateStr, String endDateStr, String text) {
        boolean isEndDatePureYear = false;
        boolean isDateRelative = false;
        int contextYear = Constants.InvalidYear;

```

### UnusedAssignment
Variable `swift` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            }

            int swift = 0;
            String monthStr = match.getMatch().get().getGroup("month").value;
            if (!StringUtility.isNullOrEmpty(monthStr)) {
```

### UnusedAssignment
Variable `year` initializer `referenceDate.getYear()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        DateTimeResolutionResult ret = new DateTimeResolutionResult();
        int year = referenceDate.getYear();
        int month = referenceDate.getMonthValue();
        int beginDay;
```

### UnusedAssignment
The value changed at `futureYear++` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (noYear && startDate.isBefore(referenceDate)) {
            futureYear++;
        }

```

### UnusedAssignment
The value changed at `pastYear--` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (noYear && (startDate.isAfter(referenceDate) || startDate.isEqual(referenceDate))) {
            pastYear--;
        }

```

### UnusedAssignment
Variable `isMoreThan` initializer `false` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            if (!StringUtility.isNullOrEmpty(beforeString) && (isAgo || isLater)) {
                boolean isLessThanOrWithIn = false;
                boolean isMoreThan = false;

                // cases like "within 3 days from yesterday/tomorrow" does not make any sense
```

### UnusedAssignment
The value `String.format("%s%sS", result, timeSpan.get(ChronoUnit.SECONDS) % 60)` assigned to `result` is never used
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateTimeFormatUtil.java`
#### Snippet
```java

        if (timeSpan.get(ChronoUnit.SECONDS) % 60 > 0) {
            result = String.format("%s%sS", result, timeSpan.get(ChronoUnit.SECONDS) % 60);
        }

```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/MatchingUtil.java`
#### Snippet
```java

    public static MatchingUtilResult getAgoLaterIndex(String text, Pattern pattern) {
        int index = -1;
        ConditionalMatch match = RegexExtension.matchBegin(pattern, text, true);

```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java

                // add multiple duration type to extract result
                String type = null;

                if (timeUnit == totalUnit) {
```

### UnusedAssignment
Variable `closePos` initializer `0` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java
        int flags = regex.flags();

        int closePos = 0;
        int startPos = rawRegex.indexOf("(?<nlbii", 0);

```

### UnusedAssignment
Variable `newObj` initializer `null` is redundant
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Entity.java`
#### Snippet
```java

        // Deserialize
        T newObj = null;
        try {
            newObj = objectMapper.readValue(tempJson, classType);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                    String lastName = Arrays.stream(blobItem.getName().split("/"))
                        .reduce((first, second) -> second.length() > 0 ? second : first)
                        .get();
                    try {
                        conversationId = URLDecoder.decode(lastName, StandardCharsets.UTF_8.name());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        MemoryScope scope = configuration.getMemoryScopes().stream().filter((s) -> {
            return s.getName().toUpperCase() == uCaseName;
        }).findFirst().get();
        if (scope != null) {
            return scope.delete(dialogContext).thenApply(result -> null);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchTimeParser.java`
#### Snippet
```java
        final ConditionalMatch match = RegexExtension.matchExact(FrenchTimeExtractorConfiguration.IshRegex, text, true);
        if (match.getSuccess()) {
            final String hourStr = match.getMatch().get().getGroup(Constants.HourGroupName).value;
            int hour = Constants.HalfDayHourCount;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchTimeParserConfiguration.java`
#### Snippet
```java

        if (match.getSuccess()) {
            final String oclockStr = match.getMatch().get().getGroup("heures").value;
            if (StringUtility.isNullOrEmpty(oclockStr)) {
                final String matchAmStr = match.getMatch().get().getGroup(Constants.AmGroupName).value;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimeParserConfiguration.java`
#### Snippet
```java
        if (match.getSuccess()) {
            
            String oclockStr = match.getMatch().get().getGroup("oclock").value;
            if (StringUtility.isNullOrEmpty(oclockStr)) {
                
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimeParserConfiguration.java`
#### Snippet
```java
            
            Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(EnglishTimeExtractorConfiguration.LessThanOneHour, trimmedPrefix)).findFirst();
            String minStr = match.get().getGroup("deltamin").value;
            if (!StringUtility.isNullOrWhiteSpace(minStr)) {
                deltaMin = Integer.parseInt(minStr);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/TimeParser.java`
#### Snippet
```java
        ConditionalMatch match = RegexExtension.matchExact(EnglishTimeExtractorConfiguration.IshRegex, text, true);
        if (match.getSuccess()) {
            String hourStr = match.getMatch().get().getGroup(Constants.HourGroupName).value;
            int hour = Constants.HalfDayHourCount;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseSetParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {

            String sourceUnit = exactMatch.getMatch().get().getGroup("unit").value;
            if (!StringUtility.isNullOrEmpty(sourceUnit) && this.config.getUnitMap().containsKey(sourceUnit)) {

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java

        if (wholeMatch.getSuccess()) {
            String hourStr = wholeMatch.getMatch().get().getGroup(Constants.HourGroupName).value;
            if (StringUtility.isNullOrEmpty(hourStr)) {
                hourStr = wholeMatch.getMatch().get().getGroup("hournum").value.toLowerCase();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseHolidayParser.java`
#### Snippet
```java
            if (match.getSuccess()) {
                // LUIS value string will be set in Match2Date method
                DateTimeResolutionResult ret = match2Date(match.getMatch().get(), referenceDate);

                return ret;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java

            if (exactMatch.getSuccess()) {
                return match2Time(exactMatch.getMatch().get(), referenceTime);
            }
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
                    // Handing cases which contain relative term like "this 5/12"
                    if (match.get().index != offset) {
                        relativeStr = relativeRegex.getMatch().get().value;
                    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        if (exactMatch.getSuccess()) {
            int swift = getSwiftDay(exactMatch.getMatch().get().value);

            LocalDateTime value = referenceDate.toLocalDate().atStartOfDay().plusDays(swift);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {

            int swift = getSwiftDay(exactMatch.getMatch().get().getGroup("day").value);
            List<ExtractResult> numErs = this.config.getIntegerExtractor().extract(trimmedText);
            Object numberParsed = this.config.getNumberParser().parse(numErs.get(0)).getValue();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            int num = Math.round(((Double)numberParsed).floatValue());

            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = referenceDate;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.next(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.thisDate(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.last(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            int weekDay = this.config.getDayOfWeek().get(weekdayStr);
            LocalDateTime value = DateUtil.thisDate(referenceDate, this.config.getDayOfWeek().get(weekdayStr));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        int year = 0;

        String monthStr = match.get().getGroup("month").value.toLowerCase();
        String dayStr = match.get().getGroup("day").value.toLowerCase();
        String weekdayStr = match.get().getGroup("weekday").value.toLowerCase();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishTimeParserConfiguration.java`
#### Snippet
```java
        if (match.getSuccess()) {

            String oclockStr = match.getMatch().get().getGroup("oclock").value;
            if (StringUtility.isNullOrEmpty(oclockStr)) {

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
        if (match.getSuccess()) {
            // Cases like "half past seven" are not handled here
            if (!match.getMatch().get().getGroup(Constants.PrefixGroupName).value.equals("")) {
                return ret;
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java

            // get hours
            MatchGroup hourGroup = match.getMatch().get().getGroup(Constants.HourGroupName);
            String hourStr = hourGroup.captures[0].value;
            int afterHourIndex = hourGroup.captures[0].index + hourGroup.captures[0].length;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java

    private String determineResolutionDateTimeType(LinkedHashMap<String, String> pastResolutionStr) {
        switch (pastResolutionStr.keySet().stream().findFirst().get()) {
            case TimeTypeConstants.START_DATE:
                return Constants.SYS_DATETIME_DATEPERIOD;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
            if (beforeMatch.getSuccess()) {
                hasBefore = true;
                er.setStart(er.getStart() + beforeMatch.getMatch().get().length);
                er.setLength(er.getLength() - beforeMatch.getMatch().get().length);
                er.setText(er.getText().substring(beforeMatch.getMatch().get().length));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
            } else if (afterMatch.getSuccess()) {
                hasAfter = true;
                er.setStart(er.getStart() + afterMatch.getMatch().get().length);
                er.setLength(er.getLength() - afterMatch.getMatch().get().length);
                er.setText(er.getText().substring(afterMatch.getMatch().get().length));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
            } else if (sinceMatch.getSuccess()) {
                hasSince = true;
                er.setStart(er.getStart() + sinceMatch.getMatch().get().length);
                er.setLength(er.getLength() - sinceMatch.getMatch().get().length);
                er.setText(er.getText().substring(sinceMatch.getMatch().get().length));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
            } else if (aroundMatch.getSuccess()) {
                hasAround = true;
                er.setStart(er.getStart() + aroundMatch.getMatch().get().length);
                er.setLength(er.getLength() - aroundMatch.getMatch().get().length);
                er.setText(er.getText().substring(aroundMatch.getMatch().get().length));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
                if (match.getSuccess()) {
                    hasYearAfter = true;
                    er.setLength(er.getLength() - match.getMatch().get().length);
                    er.setText(er.getLength() > 0 ? er.getText().substring(0, er.getLength()) : "");
                    modStr = match.getMatch().get().value;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        String cardinalStr = match.getMatch().get().getGroup("cardinal").value.toLowerCase();
        String orderStr = match.getMatch().get().getGroup("order").value.toLowerCase();
        String numberStr = match.getMatch().get().getGroup("number").value;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        String cardinalStr = match.getMatch().get().getGroup("cardinal").value.toLowerCase();
        String orderQuarterStr = match.getMatch().get().getGroup("orderQuarter").value.toLowerCase();
        String orderStr = StringUtility.isNullOrEmpty(orderQuarterStr) ? match.getMatch().get().getGroup("order").value.toLowerCase() : null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        String cardinalStr = match.getMatch().get().getGroup("cardinal").value;
        String orderStr = match.getMatch().get().getGroup("order").value.toLowerCase();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                if (!combinedDurationEr.isEmpty()) {
                    durationPr = config.getDurationParser().parse(combinedDurationEr.stream().findFirst().get());
                    int startIndex = numberEr.getStart() + numberEr.getLength();
                    beforeStr = beforeStr.substring(startIndex).trim();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        String cardinalStr = match.getMatch().get().getGroup("cardinal").value;
        String monthStr = match.getMatch().get().getGroup("month").value;
        boolean noYear = false;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        ConditionalMatch match = RegexExtension.matchExact(this.config.getSeasonRegex(), text, true);
        if (match.getSuccess()) {
            String seasonStr = this.config.getSeasonMap().get(match.getMatch().get().getGroup("seas").value.toLowerCase());

            if (!match.getMatch().get().getGroup("EarlyPrefix").value.equals("")) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        if (match.getSuccess()) {

            String decadeStr = match.getMatch().get().getGroup("decade").value.toLowerCase();
            if (!IntegerUtility.canParse(decadeStr)) {
                if (this.config.getWrittenDecades().containsKey(decadeStr)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                swift = this.config.getSwiftDayOrMonth(trimmedText);

                String numStr = match.getMatch().get().getGroup("number").value.toLowerCase();
                List<ExtractResult> er = this.config.getIntegerExtractor().extract(numStr);
                if (er.size() == 1) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            ConditionalMatch exactMatch = RegexExtension.matchExact(this.config.getYearRegex(), text, true);
            if (exactMatch.getSuccess()) {
                year = this.config.getDateExtractor().getYearFromText(exactMatch.getMatch().get());
                if (!(year >= Constants.MinYearNum && year <= Constants.MaxYearNum)) {
                    year = Constants.InvalidYear;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                exactMatch = RegexExtension.matchExact(this.config.getYearPlusNumberRegex(), text, true);
                if (exactMatch.getSuccess()) {
                    year = this.config.getDateExtractor().getYearFromText(exactMatch.getMatch().get());
                    if (!StringUtility.isNullOrEmpty(exactMatch.getMatch().get().getGroup("special").value)) {
                        String specialYearPrefixes = this.config.getSpecialYearPrefixesMap().get(exactMatch.getMatch().get().getGroup("special").value.toLowerCase());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (match.getSuccess()) {
            if (!match.getMatch().get().getGroup("EarlyPrefix").value.equals("")) {
                earlyPrefix = true;
                trimmedText = match.getMatch().get().getGroup(Constants.SuffixGroupName).value;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (match.getSuccess()) {
            MatchGroup days = match.getMatch().get().getGroup("day");
            beginDay = this.config.getDayOfMonth().get(days.captures[0].value.toLowerCase());
            endDay = this.config.getDayOfMonth().get(days.captures[1].value.toLowerCase());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        ConditionalMatch match = RegexExtension.matchExact(this.config.getWhichWeekRegex(), text, true);
        if (match.getSuccess()) {
            int num = Integer.parseInt(match.getMatch().get().getGroup("number").value);
            int year = referenceDate.getYear();
            ret.setTimex(String.format("%04d-W%02d", year, num));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (match.getSuccess()) {
            String monthStr = match.getMatch().get().getGroup("month").value.toLowerCase();
            String orderStr = match.getMatch().get().getGroup("order").value.toLowerCase();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/MatchingUtil.java`
#### Snippet
```java

        if (match.getSuccess()) {
            index = match.getMatch().get().index + match.getMatch().get().length;
            return new MatchingUtilResult(true, index);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java

            if (match.getSuccess()) {
                int startToken = match.getMatch().get().index;
                String tokenString = input.substring(duration.getStart(), duration.getEnd());
                Match matchDate = Arrays.stream(RegExpUtility.getMatches(config.getDateUnitRegex(), tokenString)).findFirst().orElse(null);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java

            if (match.getSuccess()) {
                index = match.getMatch().get().index;
            }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java

                if (match.getSuccess()) {
                    index = match.getMatch().get().index;
                }
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java
            match = RegexExtension.matchBegin(config.getPastRegex(), afterStr, true);
            if (match.getSuccess()) {
                int matchLength = match.getMatch().get().index + match.getMatch().get().length;
                results.add(new Token(duration.getStart(), duration.getEnd() + matchLength));
                continue;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java
            match = RegexExtension.matchBegin(config.getFutureSuffixRegex(), afterStr, true);
            if (match.getSuccess()) {
                int matchLength = match.getMatch().get().index + match.getMatch().get().length;
                results.add(new Token(duration.getStart(), duration.getEnd() + matchLength));
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ConditionalMatch innerMatch = RegexExtension.matchBegin(this.config.getTimeOfDayRegex(), er.getText(), true);
            if (innerMatch.getSuccess()) {
                beforeStr = input.substring(0, ((er != null) ? er.getStart() : 0) + innerMatch.getMatch().get().length);
            }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
            String afterStr = text.substring(token.getStart() + token.getLength());
            ConditionalMatch match = RegexExtension.matchBegin(this.config.getSuffixAndRegex(), afterStr, true);
            if (match.getSuccess() && match.getMatch().get().index == 0) {
                result.add(new Token(token.getStart(), token.getStart() + token.getLength() + match.getMatch().get().length));
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java

            if (isInequalityPrefixMatched) {
                int length = er.getLength() + er.getStart() - match.getMatch().get().index;
                int start = match.getMatch().get().index;
                String text = input.substring(start, start + length);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
            String afterStr = text.substring(er.getStart() + er.getLength());
            ConditionalMatch match = RegexExtension.matchBegin(this.config.getFollowedUnit(), afterStr, true);
            if (match.getSuccess() && match.getMatch().get().index == 0) {
                result.add(new Token(er.getStart(), er.getStart() + er.getLength() + match.getMatch().get().length));
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimePeriodExtractor.java`
#### Snippet
```java
            Optional<Match> match = match(config.getWithinNextPrefixRegex(), beforeStr);
            if (matchPrefixRegexInSegment(beforeStr, match)) {
                int startToken = match.get().index;
                int durationLength = duration.getStart() + duration.getLength();
                match = match(config.getTimeUnitRegex(), input.substring(duration.getStart(), durationLength));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java
                    boolean isFollowedByOtherEntity = true;

                    if (match.getMatch().get().length == afterStr.trim().length()) {
                        isFollowedByOtherEntity = false;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                String suffixStr = text.substring(result.getStart() + result.getLength());
                ConditionalMatch beginMatch = RegexExtension.matchBegin(config.getRelativeMonthRegex(), suffixStr.trim(), true);
                if (beginMatch.getSuccess() && beginMatch.getMatch().get().index == 0) {
                    int spaceLen = suffixStr.length() - suffixStr.trim().length();
                    int resStart = result.getStart();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                beginMatch = RegexExtension.matchBegin(config.getWeekDayRegex(), suffixStr.trim(), true);
                if (beginMatch.getSuccess() && num >= 1 && num <= 5 && result.getType().equals("builtin.num.ordinal")) {
                    String weekDayStr = beginMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
                    if (config.getDayOfWeek().containsKey(weekDayStr)) {
                        int spaceLen = suffixStr.length() - suffixStr.trim().length();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                    ConditionalMatch relativeRegex = RegexExtension.matchEnd(config.getStrictRelativeRegex(), preText, true);
                    if (relativeRegex.getSuccess()) {
                        result.add(new Token(relativeRegex.getMatch().get().index, match.index + match.length));
                    } else {
                        result.add(new Token(match.index, match.index + match.length));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
        // Currently, we support alt entity sequence only when the second alt entity to the last alt entity share the same type
        if (isSupportedAltEntitySequence(extractResults)) {
            HashMap<String, Object> metadata = extractMetadata(extractResults.stream().findFirst().get(), parentText, extractResults);
            HashMap<String, Object> metadataCandidate = null;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

        if (isSupportedAltEntitySequence(extractResults)) {
            String firstEntityType = extractResults.stream().findFirst().get().getType();
            String lastEntityType = extractResults.get(extractResults.size() - 1).getType();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java
                if (fractionUnitCode != null && !fractionUnitCode.isEmpty() && fractionNumValue.isPresent() && fractionNumValue.get() != 0 &&
                    checkUnitsStringContains(fractionUnitCode, fractionUnitsString)) {
                    numberValue += Double.parseDouble(parseResultValue.get().number) * (1.0 / fractionNumValue.get());
                    result.setLength(parseResult.getStart() + parseResult.getLength() - result.getStart());
                    result.setResolutionStr(result.getResolutionStr() + " " + parseResult.getResolutionStr());
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `codeChallenge` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInResource(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `emulatorUrl` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInResource(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `finalRedirect` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInResource(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `codeChallenge` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInUrl(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `emulatorUrl` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInUrl(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `finalRedirect` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
        final String emulatorUrl = null;
        final String finalRedirect = null;
        return service.getSignInUrl(state, codeChallenge, emulatorUrl, finalRedirect)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `channelId` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        final String channelId = null;
        final String include = null;
        return service.getTokenStatus(userId, channelId, include)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `include` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        final String channelId = null;
        final String include = null;
        return service.getTokenStatus(userId, channelId, include)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `channelId` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        final String channelId = null;
        final String code = null;
        return service.getToken(userId, connectionName, channelId, code)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `code` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        final String channelId = null;
        final String code = null;
        return service.getToken(userId, connectionName, channelId, code)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Value `channelId` is always 'null'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        Validator.validate(aadResourceUrls);
        final String channelId = null;
        return service.getAadTokens(userId, connectionName, aadResourceUrls, channelId)
            .thenApply(responseBodyResponse -> {
                try {
```

### ConstantValue
Condition `zoned != null` is always `true`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/RetryAfterHelper.java`
#### Snippet
```java
                    try {
                        ZonedDateTime zoned = ZonedDateTime.parse(headerString, gmtFormat);
                        if (zoned != null) {
                            ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
                            long waitMillis = zoned.toInstant().toEpochMilli() - now.toInstant().toEpochMilli();
```

### ConstantValue
Value `token` is always 'null'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
            Iterable<PagedResponse<BlobItem>> resultSegment = containerClient
                .listBlobsByHierarchy("/", this.getOptionsWithMetadata(prefix), null)
                .iterableByPage(token);
            token = null;
            for (PagedResponse<BlobItem> blobPage : resultSegment) {
```

### ConstantValue
Condition `!StringUtils.isBlank(token)` is always `false`
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                }
            }
        } while (!StringUtils.isBlank(token) && conversations.size() < pageSize);

        PagedResult<TranscriptInfo> pagedResult = new PagedResult<TranscriptInfo>();
```

### ConstantValue
Condition `!StringUtils.isBlank(token) && conversations.size() < pageSize` is always `false`
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                }
            }
        } while (!StringUtils.isBlank(token) && conversations.size() < pageSize);

        PagedResult<TranscriptInfo> pagedResult = new PagedResult<TranscriptInfo>();
```

### ConstantValue
Value `token` is always 'null'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                }
            }
        } while (!StringUtils.isBlank(token) && conversations.size() < pageSize);

        PagedResult<TranscriptInfo> pagedResult = new PagedResult<TranscriptInfo>();
```

### ConstantValue
Value `handled` is always 'false'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContainer.java`
#### Snippet
```java
                dc.getDialogs().getTelemetryClient().trackTrace(traceMessage, Severity.WARNING, null);

                return TurnContext.traceActivity(dc.getContext(), traceMessage).thenApply(response -> handled);
            }

```

### ConstantValue
Condition `value instanceof Segments` is always `false`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SegmentType.java`
#### Snippet
```java

        if (!isInt) {
            if (value instanceof Segments) {
                segmentsValue = (Segments) value;
            } else {
```

### ConstantValue
Condition `memory instanceof Map` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogMemoryScope.java`
#### Snippet
```java
        if (dialogContext.getActiveDialog() != null) {
            Dialog dialog = dialogContext.findDialog(dialogContext.getActiveDialog().getId());
            if (dialog instanceof DialogContainer && memory instanceof Map<?, ?>) {
                dialogContext.getActiveDialog().getState().putAll((Map<String, Object>) memory);
                return;
```

### ConstantValue
Value `handled` is always 'true'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
            }

            return CompletableFuture.completedFuture(handled);
        });
    }
```

### ConstantValue
Condition `counter == null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                ResultPair<Integer> result = tryGetValue(trackedPath, Integer.class);
                if (result.result()) {
                    if (counter == null) {
                        counter = getValue(DialogPath.EVENTCOUNTER, 0, Integer.class);
                    }
```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        } catch (Exception err) {
            // Trace.TraceError(err.Message);
            return new ResultPair<>(false, instance);
        }

```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java

        if (memoryScope == null) {
            return new ResultPair<>(false, instance);
        }

```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            Object memory = memoryScope.getMemory(dialogContext);
            if (memory == null) {
                return new ResultPair<>(false, instance);
            }

```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            }

            return new ResultPair<>(false, instance);
        }

```

### ConstantValue
Condition `scope != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            return s.getName().toUpperCase() == uCaseName;
        }).findFirst().get();
        if (scope != null) {
            return scope.delete(dialogContext).thenApply(result -> null);
        }
```

### ConstantValue
Condition `resolved != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            ArrayList<Object> resolved = ObjectPath.tryResolvePath(this, tpath);
            String[] segments = resolved.toArray(new String[resolved.size()]);
            if (resolved != null) {
                String npath = String.join("_", segments);
                setValue(pathTracker + "." + npath, 0);
```

### ConstantValue
Condition `results != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
            opt.setLocale(determineCulture(activity, opt));
            List<ModelResult<FoundChoice>> results = ChoiceRecognizers.recognizeChoices(utterance, choices, opt);
            if (results != null && results.size() > 0) {
                result.setSucceeded(true);
                result.setValue(results.get(0).getResolution());
```

### ConstantValue
Condition `values instanceof HashMap` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
            HashMap<String, String> values = (HashMap<String, String>) turnContext.getActivity().getValue();
            String magicCode = "";
            if (values != null && values instanceof HashMap) {
                magicCode = (String) values.get("state");
            }
```

### ConstantValue
Condition `tempStack.size() >= 2` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
                        } else if (oldSym.equalsIgnoreCase(config.getWrittenIntegerSeparatorTexts().get(0)) || tempStack.size() < 2) {
                            tempStack.push(matchValue);
                        } else if (tempStack.size() >= 2) {
                            double sum = tempStack.pop() + matchValue;
                            sum = tempStack.pop() + sum;
```

### ConstantValue
Condition `currentValue < roundValue` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
                    if (previousValue < smHundreds && currentValue >= roundValue) {
                        roundValue = currentValue;
                    } else if (previousValue < smHundreds && currentValue < roundValue) {
                        splitIndex++;
                        break;
```

### ConstantValue
Condition `i > 0` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/NumberWithUnitTokenizer.java`
#### Snippet
```java
                tokens.add(new Token(i, 1, input.substring(i, i + 1)));
            } else {
                if (inToken && i > 0) {
                    char preChar = chars[i - 1];
                    if (isSplittableUnit(c, preChar)) {
```

### ConstantValue
Condition `FrenchDateTime.DefaultLanguageFallback == "DMY"` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
            add(RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor2));
            add(RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor3));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4));
```

### ConstantValue
Condition `FrenchDateTime.DefaultLanguageFallback == "DMY"` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5));
```

### ConstantValue
Condition `FrenchDateTime.DefaultLanguageFallback == "DMY"` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor4) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor5));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6));
```

### ConstantValue
Condition `FrenchDateTime.DefaultLanguageFallback == "DMY"` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateExtractorConfiguration.java`
#### Snippet
```java
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6));
            add(FrenchDateTime.DefaultLanguageFallback == "DMY" ?
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor6) :
                    RegExpUtility.getSafeRegExp(FrenchDateTime.DateExtractor7));
```

### ConstantValue
Value `hasMin` is always 'true'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimeParserConfiguration.java`
#### Snippet
```java
        hasMin = true;

        return new PrefixAdjustResult(hour, min, hasMin);
    }

```

### ConstantValue
Value `timex` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimePeriodParserConfiguration.java`
#### Snippet
```java
        } else {
            timex = null;
            return new MatchedTimeRangeResult(false, timex, beginHour, endHour, endMin);
        }

```

### ConstantValue
Condition `isSinglePoint` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    .put(ExtendedModelResult.ParentTextKey, parentText)
                    .build());
        } else if (isSinglePoint) {
            ret.setFutureResolution(ImmutableMap.<String, String>builder()
                    .put(singlePointType, singlePointResolution)
```

### ConstantValue
Condition `hasLeftPm` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                        beginDateTime = beginDateTime.minusHours(Constants.HalfDayHourCount);
                    }
                } else if (hasLeftPm) {
                    if (beginHour < Constants.HalfDayHourCount) {
                        beginDateTime = beginDateTime.plusHours(Constants.HalfDayHourCount);
```

### ConstantValue
Condition `hasRightPm` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                        endDateTime = endDateTime.minusHours(Constants.HalfDayHourCount);
                    }
                } else if (hasRightPm) {
                    if (endHour < Constants.HalfDayHourCount) {
                        endDateTime = endDateTime.plusHours(Constants.HalfDayHourCount);
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java

        // Pop, restore the MOD string
        if (hasBefore && pr != null && pr.getValue() != null) {

            pr.setStart(pr.getStart() - modStr.length());
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        }

        if (hasAfter && pr != null && pr.getValue() != null) {

            pr.setStart(pr.getStart() - modStr.length());
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        }

        if (hasSince && pr != null && pr.getValue() != null) {

            pr.setStart(pr.getStart() - modStr.length());
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        }

        if (hasAround && pr != null && pr.getValue() != null) {

            pr.setStart(pr.getStart() - modStr.length());
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        }

        if (hasYearAfter && pr != null && pr.getValue() != null) {

            pr.setText(pr.getText() + modStr);
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java

        // For cases like "3 pm or later on Monday"
        if (pr != null && pr.getValue() != null && pr.getType().equals(Constants.SYS_DATETIME_DATETIME)) {
            Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(config.getSuffixAfterRegex(), pr.getText())).findFirst();
            if (match.isPresent() && match.get().index != 0) {
```

### ConstantValue
Condition `pr != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        }

        if (config.getOptions().match(DateTimeOptions.SplitDateAndTime) && pr != null && pr.getValue() != null &&
                ((DateTimeResolutionResult)pr.getValue()).getSubDateTimeEntities() != null) {
            pr.setValue(dateTimeResolutionForSplit(pr));
```

### ConstantValue
Value `islunar` is always 'true'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        addResolutionFields(res, DateTimeResolutionKey.Mod, mod);
        addResolutionFields(res, ResolutionKey.Type, typeOutput);
        addResolutionFields(res, DateTimeResolutionKey.IsLunar, islunar ? Boolean.toString(islunar) : "");

        boolean hasTimeZone = false;
```

### ConstantValue
Value `islunar` is always 'true'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
                addResolutionFields(value, DateTimeResolutionKey.Mod, mod);
                addResolutionFields(value, ResolutionKey.Type, typeOutput);
                addResolutionFields(value, DateTimeResolutionKey.IsLunar, islunar ? Boolean.toString(islunar) : "");
                addResolutionFields(value, DateTimeResolutionKey.List, list);
                addResolutionFields(value, DateTimeResolutionKey.SourceEntity, sourceEntity);
```

### ConstantValue
Value `ambiguityFiltersDict` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java

    public final Iterable<Pair<Pattern, Pattern>> getAmbiguityFiltersDict() {
        return ambiguityFiltersDict;
    }

```

### ConstantValue
Value `timex` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishTimePeriodParserConfiguration.java`
#### Snippet
```java
        } else {
            timex = null;
            return new MatchedTimeRangeResult(false, timex, beginHour, endHour, endMin);
        }

```

### ConstantValue
Value `timeStr` is always 'null'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
        // Late/early only works with time of day
        // Only standard time of day (morinng, afternoon, evening and night) will not directly return
        MatchedTimeRangeResult matchedTimeRange = config.getMatchedTimeRange(timeText, timeStr, beginHour, endHour, endMin);
        timeStr = matchedTimeRange.getTimeStr();
        beginHour = matchedTimeRange.getBeginHour();
```

### ConstantValue
Condition `endHasDate` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
            String dateStr = pr1.getTimexStr().split("T")[0];
            result.setTimex(String.format("(%s,%s,PT%dH)", pr1.getTimexStr(), dateStr + pr2.getTimexStr(), ChronoUnit.HOURS.between(futureBegin, futureEnd)));
        } else if (endHasDate) {
            futureBegin = DateUtil.safeCreateFromMinValue(futureEnd.getYear(), futureEnd.getMonthValue(), futureEnd.getDayOfMonth(),
                    futureBegin.getHour(), futureBegin.getMinute(), futureBegin.getSecond());
```

### ConstantValue
Condition `getDmyDateFormat() || SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_D...` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateExtractorConfiguration.java`
#### Snippet
```java
        };

        boolean enableDmy = getDmyDateFormat() || SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_DMY;

        if (enableDmy) {
```

### ConstantValue
Condition `SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_DMY` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateExtractorConfiguration.java`
#### Snippet
```java
        };

        boolean enableDmy = getDmyDateFormat() || SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_DMY;

        if (enableDmy) {
```

### ConstantValue
Condition `enableDmy` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateExtractorConfiguration.java`
#### Snippet
```java
        boolean enableDmy = getDmyDateFormat() || SpanishDateTime.DefaultLanguageFallback == Constants.DefaultLanguageFallback_DMY;

        if (enableDmy) {
            DateRegexList.add(RegExpUtility.getSafeRegExp(SpanishDateTime.DateExtractor5));
            DateRegexList.add(RegExpUtility.getSafeRegExp(SpanishDateTime.DateExtractor8));
```

### ConstantValue
Condition `value == null` is always `false`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                retNow,
                "",
                value == null ? "" : ((DateTimeResolutionResult)retNow).getTimex());
        }

```

### ConstantValue
Condition `dateContext == null` is always `false`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                if (endResolution.getSuccess()) {
                    if (futureBegin.isAfter(futureEnd)) {
                        if (dateContext == null || dateContext.isEmpty()) {
                            futureBegin = pastBegin;
                        } else {
```

### ConstantValue
Condition `dateContext == null` is always `false`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                    if (pastEnd.isBefore(pastBegin)) {
                        if (dateContext == null || dateContext.isEmpty()) {
                            pastEnd = futureEnd;
                        } else {
```

### ConstantValue
Value `enablePreview` is always 'false'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimeZoneUtility.java`
#### Snippet
```java
        boolean enablePreview = options.match(DateTimeOptions.EnablePreview);
        if (!enablePreview) {
            return enablePreview;
        }

```

### ConstantValue
Condition `match != null` is always `true` when reached
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
                    ret.add(new Token(
                            (er != null) ? er.getStart() : 0,
                            ((er != null) ? er.getStart() + er.getLength() : 0) + ((match != null) ? match.get().index + match.get().length : 0)));
                }
            }
```

### ConstantValue
Condition `ersI != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
                    ersI.getType() == Constants.SYS_DATETIME_TIME && ersJ.getType() == Constants.SYS_DATETIME_DATE ||
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
                int middleEnd = ersJ != null ? ersJ.getStart() : 0;
                if (middleBegin > middleEnd) {
```

### ConstantValue
Condition `ersJ != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
                    ersI.getType() == Constants.SYS_DATETIME_DATE && ersJ.getType() == SYS_NUM_INTEGER) {
                int middleBegin = ersI != null ? ersI.getStart() + ersI.getLength() : 0;
                int middleEnd = ersJ != null ? ersJ.getStart() : 0;
                if (middleBegin > middleEnd) {
                    i = j + 1;
```

### ConstantValue
Condition `er != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            ConditionalMatch innerMatch = RegexExtension.matchBegin(this.config.getTimeOfDayRegex(), er.getText(), true);
            if (innerMatch.getSuccess()) {
                beforeStr = input.substring(0, ((er != null) ? er.getStart() : 0) + innerMatch.getMatch().get().length);
            }

```

### ConstantValue
Condition `num >= 1` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                suffixStr = text.substring(result.getStart() + result.getLength());
                beginMatch = RegexExtension.matchBegin(config.getWeekDayRegex(), suffixStr.trim(), true);
                if (beginMatch.getSuccess() && num >= 1 && num <= 5 && result.getType().equals("builtin.num.ordinal")) {
                    String weekDayStr = beginMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
                    if (config.getDayOfWeek().containsKey(weekDayStr)) {
```

### ConstantValue
Result of `contextErCandidates.size() - 1` is always '0'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
            List<ExtractResult> contextErCandidates = extractMethod.apply(er.getText());
            if (contextErCandidates.size() == 1) {
                contextEr = contextErCandidates.get(contextErCandidates.size() - 1);
                break;
            }
```

### ConstantValue
Result of `(month + 12) % 12` is always '0'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
                    month--;
                    if (month < 1) {
                        month = (month + 12) % 12;
                        year--;
                    }
```

### ConstantValue
Condition `halfUnitRegex != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/chinese/extractors/ChineseNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    public List<ExtractResult> expandHalfSuffix(String source, List<ExtractResult> result, List<ExtractResult> numbers) {
        // Expand Chinese phrase to the `half` patterns when it follows closely origin phrase.
        if (halfUnitRegex != null) {
            Match[] match = RegExpUtility.getMatches(halfUnitRegex, source);
            if (match.length > 0) {
```

### ConstantValue
Condition `key != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/NumberWithUnitParser.java`
#### Snippet
```java
        }

        if (key != null && !key.isEmpty() && unitMap != null) {

            String unitValue = null;
```

### ConstantValue
Condition `ret != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/NumberWithUnitParser.java`
#### Snippet
```java
        }

        if (ret != null) {
            ret.setText(ret.getText().toLowerCase(Locale.ROOT));
        }
```

### ConstantValue
Condition `result != null` is always `true`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java
                } else {
                    // If the fraction unit doesn't match the main unit, finish process this group.
                    if (result != null) {
                        result = createCurrencyResult(result, mainUnitIsoCode, numberValue, mainUnitValue);
                        results.add(result);
```

### ConstantValue
Result of `match.start()` is always '0'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java
            // Separated by connectors
            Matcher match = config.getCompoundUnitConnectorRegex().matcher(middleStr);
            if (match.find() && match.start() == 0 && (match.end() - match.start()) == middleStr.length()) {
                groups[idx + 1] = groups[idx];
            } else {
```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
        TypeT instance = null;
        if (this.getChannelData() == null) {
            return new ResultPair<>(false, instance);
        }

```

### ConstantValue
Value `instance` is always 'null'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
            instance = this.getChannelData(clsType);
        } catch (JsonProcessingException e) {
            return new ResultPair<TypeT>(false, instance);
        }
        return new ResultPair<TypeT>(true, instance);
```

## RuleId[id=RedundantCompareToJavaTime]
### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryTranscriptStore.java`
#### Snippet
```java
                    Stream<Activity> stream = transcript.stream()
                        .sorted(Comparator.comparing(Activity::getTimestamp))
                        .filter(a -> a.getTimestamp().compareTo(effectiveStartDate) >= 0);

                    if (continuationToken != null) {
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java


        boolean hasTimedOut = isTimeoutActivityType && OffsetDateTime.now(ZoneId.of("UTC")).compareTo(expires) > 0;

        if (hasTimedOut) {
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        if (noYear && pastDate.compareTo(referenceDate) >= 0) {
            pastDate = getMondayOfTargetWeek(cardinalStr, month, year - 1);
        }
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (noSpecificYear) {
            if (endDate.compareTo(referenceDate) < 0) {
                ret.setPastValue(new Pair<>(beginDate, endDate));

```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                LocalDateTime futureEndDate = DateUtil.safeCreateFromMinValue(year + 1, quarterNum * Constants.TrimesterMonthCount, 1).plusMonths(1);
                ret.setFutureValue(new Pair<>(futureBeginDate, futureEndDate));
            } else if (endDate.compareTo(referenceDate) > 0) {
                ret.setFutureValue(new Pair<>(beginDate, endDate));

```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        }

        if (!inputCentury && startDate.compareTo(referenceDate) >= 0) {
            pastYear -= 100;
        }
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        ret.setTimex(TimexUtility.generateDatePeriodTimexStr(futureBegin, futureEnd, DatePeriodTimexType.ByDay, pr1.getTimexStr(), pr2.getTimexStr()));

        if (pr1.getTimexStr().startsWith(Constants.TimexFuzzyYear) && futureBegin.compareTo(DateUtil.safeCreateFromMinValue(futureBegin.getYear(), 2, 28)) <= 0 &&
                futureEnd.compareTo(DateUtil.safeCreateFromMinValue(futureBegin.getYear(), 3, 1)) >= 0) {

```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

        if (pr1.getTimexStr().startsWith(Constants.TimexFuzzyYear) && futureBegin.compareTo(DateUtil.safeCreateFromMinValue(futureBegin.getYear(), 2, 28)) <= 0 &&
                futureEnd.compareTo(DateUtil.safeCreateFromMinValue(futureBegin.getYear(), 3, 1)) >= 0) {

            // Handle cases like "Feb 29th to March 1st".
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateContext.java`
#### Snippet
```java
            if (isFeb29th(year, month, day)) {
                if (isLeapYear(year)) {
                    if (futureDate.compareTo(referenceDate) < 0) {
                        futureDate = DateUtil.safeCreateFromMinValue(futureYear + 4, month, day);
                    } else {
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateContext.java`
#### Snippet
```java
                }
            } else {
                if (futureDate.compareTo(referenceDate) < 0 && DateUtil.isValidDate(year, month, day)) {
                    futureDate = DateUtil.safeCreateFromMinValue(year + 1, month, day);
                }
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateContext.java`
#### Snippet
```java
                }

                if (pastDate.compareTo(referenceDate) >= 0 && DateUtil.isValidDate(year, month, day)) {
                    pastDate = DateUtil.safeCreateFromMinValue(year - 1, month, day);
                }
```

### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexDateHelpers.java`
#### Snippet
```java
        Integer weeks = 1;

        while (ds.compareTo(de) < 0) {
            Integer dayOfWeek = TimexDateHelpers.getUSDayOfWeek(ds.getDayOfWeek());

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                .filter((scope) -> scope.getName().equalsIgnoreCase(name))
                .findFirst();
        return result.isPresent() ? result.get() : null;
    }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseSetExtractor.java`
#### Snippet
```java
                Pattern beforeEachDayRegex = this.config.getBeforeEachDayRegex();
                Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(beforeEachDayRegex, beforeStr)).findFirst();
                if (match.isPresent()) {
                    ret.add(new Token(match.get().index, er.getStart() + er.getLength()));
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseSetExtractor.java`
#### Snippet
```java
                Pattern eachDayRegex = this.config.getEachDayRegex();
                Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(eachDayRegex, afterStr)).findFirst();
                if (match.isPresent()) {
                    ret.add(new Token(er.getStart(), er.getStart() + er.getLength() + match.get().length));
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseSetExtractor.java`
#### Snippet
```java
            Pattern eachPrefixRegex = this.config.getEachPrefixRegex();
            Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(eachPrefixRegex, beforeStr)).findFirst();
            if (match.isPresent()) {
                ret.add(new Token(match.get().index, er.getStart() + er.getLength()));
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimePeriodExtractor.java`
#### Snippet
```java
            String beforeStr = input.substring(0, dateEr.getStart()).trim();
            Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(config.getPrefixDayRegex(), beforeStr)).findFirst();
            if (match.isPresent()) {
                results.add(new Token(match.get().index, dateStrEnd));
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java
                        null;

                String unit = parseResultValue.isPresent() ? parseResultValue.get().unit : null;
                Optional<Long> fractionNumValue = Optional.ofNullable(config.getCurrencyFractionNumMap().containsKey(unit) ?
                        config.getCurrencyFractionNumMap().get(unit) :
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeExtractor.java`
#### Snippet
```java
        Pattern pattern = this.config.getAtRegex();
        Match[] matches = RegExpUtility.getMatches(pattern, text);
        if (matches.length > 0) {
            for (Match match : matches) {
                if (match.index + match.length < text.length() && text.charAt(match.index + match.length) == '%') {
```

### RedundantLengthCheck
Redundant array length check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeExtractor.java`
#### Snippet
```java
            Pattern beforeAfterRegex = this.config.getTimeBeforeAfterRegex();
            Match[] matches = RegExpUtility.getMatches(beforeAfterRegex, text);
            if (matches.length > 0) {
                for (Match match : matches) {
                    ret.add(new Token(match.index, match.index + match.length));
```

### RedundantLengthCheck
Redundant array length check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeZoneExtractor.java`
#### Snippet
```java
        // Direct UTC matches
        Match[] directUtcMatches = RegExpUtility.getMatches(config.getDirectUtcRegex(), text.toLowerCase());
        if (directUtcMatches.length > 0) {
            for (Match match : directUtcMatches) {
                ret.add(new Token(match.index, match.index + match.length));
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TypedInvokeResponse.java`
#### Snippet
```java
     */
    public T getTypedBody() {
        return (T) super.getBody();
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextStateCollection.java`
#### Snippet
```java
        Object service = state.get(key);
        try {
            return (T) service;
        } catch (ClassCastException e) {
            return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.CompletableFuture' to 'java.util.concurrent.CompletableFuture'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
        return Async.tryCompletable(() -> {
            CachedBotState cachedState = turnContext.getTurnState().get(contextServiceKey);
            return (CompletableFuture<T>) CompletableFuture
                .completedFuture(cachedState.getState().get(propertyName));
        });
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
                        .replace(
                            contextServiceKey,
                            new CachedBotState((Map<String, Object>) val.get(storageKey))
                        );
                    return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
                .thenCombine(botState.getPropertyValue(turnContext, name), (loadResult, value) -> {
                    if (value != null) {
                        return (T) value;
                    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java

                    value = defaultValueFactory.get();
                    set(turnContext, (T) value).join();
                    return (T) value;
                });
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
                    value = defaultValueFactory.get();
                    set(turnContext, (T) value).join();
                    return (T) value;
                });
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
        // -Check for id if query is present in reverse index.
        Map<String, Integer> previousContextData =
            ObjectPath.getPathValue(
                dc.getActiveDialog().getState(),
                QNA_CONTEXT_DATA,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
        QnAMakerDialogOptions dialogOptions =
            ObjectPath.getPathValue(stepContext.getActiveDialog().getState(), OPTIONS, QnAMakerDialogOptions.class);
        List<QueryResult> response = (List<QueryResult>) stepContext.getResult();
        if (response != null && response.size() > 0) {
            // -Check if context is present and prompt exists
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
            if (answer.getContext() != null && answer.getContext().getPrompts().length > 0) {
                Map<String, Integer> previousContextData =
                    ObjectPath.getPathValue(
                        stepContext.getActiveDialog().getState(),
                        QNA_CONTEXT_DATA,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
            }

            List<String> suggestedQuestions = (List<String>) dc.getState().get("this.suggestedQuestions");
            if (
                suggestedQuestions != null
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java

        // If response is present then show that response, else default answer.
        List<QueryResult> response = (List<QueryResult>) stepContext.getResult();
        if (response != null && response.size() > 0) {
            stepContext.getContext().sendActivity(response.get(0).getAnswer()).join();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
        QnAMakerDialogOptions dialogOptions =
            ObjectPath.getPathValue(stepContext.getActiveDialog().getState(), OPTIONS, QnAMakerDialogOptions.class);
        List<QueryResult> trainResponses = (List<QueryResult>) stepContext.getValues().get(ValueProperty.QNA_DATA);
        String currentQuery = (String) stepContext.getValues().get(ValueProperty.CURRENT_QUERY);

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallDialog.java`
#### Snippet
```java
            // Create step context
            Object options = state.get(PERSISTED_OPTIONS);
            Map<String, Object> values = (Map<String, Object>) state.get(PERSISTED_VALUES);
            WaterfallStepContext stepContext =
                new WaterfallStepContext(this, dc, options, values, index, reason, result);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java

        if (obj instanceof Map) {
            Map<String, Object> dict = (Map<String, Object>) obj;
            List<Entry<String, Object>> matches = dict.entrySet().stream()
                .filter(key -> key.getKey().equalsIgnoreCase(property))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java

        if (obj instanceof Map) {
            return ((Map<String, Object>) obj).containsKey(name);
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
            return new ArrayList<>();
        } else if (obj instanceof Map) {
            return ((Map<String, Object>) obj).keySet();
        } else if (obj instanceof JsonNode) {
            List<String> fields = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
    public static <T> T mapValueTo(Object val, Class<T> valueType) {
        if (val.getClass().equals(valueType)) {
            return (T) val;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
     */
    public static <T> T merge(Object startObject, Object overlayObject) {
        return (T) assign(startObject, overlayObject);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java

                if (current instanceof List) {
                    current = ((List<Object>) current).get(index);
                } else if (current instanceof ArrayNode) {
                    current = ((ArrayNode) current).get(index);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
    public static void forEachProperty(Object obj, BiConsumer<String, Object> action) {
        if (obj instanceof Map) {
            ((Map<String, Object>) obj).forEach(action);
        } else if (obj instanceof ObjectNode) {
            ObjectNode node = (ObjectNode) obj;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
            }

            return (T) singleObject;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
        if (obj instanceof Map) {
            Boolean wasSet = false;
            Map<String, Object> dict = (Map<String, Object>) obj;
            for (String key : dict.keySet()) {
                if (key.equalsIgnoreCase(property)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
    public static <T> T assign(T startObject, Object overlayObject) {
        // FIXME this won't work for null startObject
        return (T) assign(startObject, overlayObject, startObject.getClass());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
                // lastSegment is a field name
                if (current instanceof Map) {
                    ((Map<String, Object>) current).remove((String) lastSegment);
                } else {
                    ((ObjectNode) current).remove((String) lastSegment);
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
     */
    public static <T> T clone(T obj) {
        return (T) Serialization.getAs(obj, obj.getClass());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogMemoryScope.java`
#### Snippet
```java
            Dialog dialog = dialogContext.findDialog(dialogContext.getActiveDialog().getId());
            if (dialog instanceof DialogContainer && memory instanceof Map<?, ?>) {
                dialogContext.getActiveDialog().getState().putAll((Map<String, Object>) memory);
                return;
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogMemoryScope.java`
#### Snippet
```java
            }
        } else if (dialogContext.getParent().getActiveDialog() != null) {
            dialogContext.getParent().getActiveDialog().getState().putAll((Map<String, Object>) memory);
            return;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
                result.setSucceeded(true);
                result.setValue(new ArrayList<DateTimeResolution>());
                List<Map<String, String>> values = (List<Map<String, String>>) results.get(0).resolution.get("values");
                for (Map<String, String> mapEntry : values) {
                    result.getValue().add(readResolution(mapEntry));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Float value = Float.parseFloat(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Integer value = Integer.parseInt(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Long value = Long.parseLong(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Double value = Double.parseDouble(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        if (instance instanceof Map) {
            final int count = counter;
            ((Map<String, Object>) instance).forEach((key, value) -> {
                checkChildren(key, value, trackedPath, count);
            });
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                if (value instanceof Map) {
                    final int count = counter;
                    ((Map<String, Object>) value).forEach((key, val) -> {
                        checkChildren(key, val, trackedPath, count);
                    });
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
        // Perform base recognition
        DialogInstance instance = dc.getActiveDialog();
        Map<String, Object> state = (Map<String, Object>) instance.getState().get(PERSISTED_STATE);
        PromptOptions options = (PromptOptions) instance.getState().get(PERSISTED_OPTIONS);
        return onRecognize(dc.getContext(), state, options).thenCompose(recognized -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java

        // Send initial prompt
        onPrompt(dc.getContext(), (Map<String, Object>) state.get(PERSISTED_STATE),
                (PromptOptions) state.get(PERSISTED_OPTIONS), false);
        return CompletableFuture.completedFuture(Dialog.END_OF_TURN);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
            // Perform base recognition
            Map<String, Object> state = dc.getActiveDialog().getState();
            return onRecognize(dc.getContext(), (Map<String, Object>) state.get(PERSISTED_STATE),
                    (PromptOptions) state.get(PERSISTED_OPTIONS))
                            .thenCompose(recognized -> CompletableFuture.completedFuture(recognized.getSucceeded()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/Prompt.java`
#### Snippet
```java
    @Override
    public CompletableFuture<Void> repromptDialog(TurnContext turnContext, DialogInstance instance) {
        Map<String, Object> state = (Map<String, Object>) instance.getState().get(PERSISTED_STATE);
        PromptOptions options = (PromptOptions) instance.getState().get(PERSISTED_OPTIONS);
        return onPrompt(turnContext, state, options, false).thenApply(result -> null);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
        // Perform base recognition
        DialogInstance instance = dc.getActiveDialog();
        Map<String, Object> state = (Map<String, Object>) instance.getState().get(persistedState);
        PromptOptions options = (PromptOptions) instance.getState().get(persistedOptions);
        return onRecognize(dc.getContext(), state, options).thenCompose(recognized -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java

        // Send initial prompt
        onPrompt(dc.getContext(), (Map<String, Object>) state.get(persistedState),
                (PromptOptions) state.get(persistedOptions), false);

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
    @Override
    public CompletableFuture<Void> repromptDialog(TurnContext turnContext, DialogInstance instance) {
        Map<String, Object> state = (Map<String, Object>) instance.getState().get(persistedState);
        PromptOptions options = (PromptOptions) instance.getState().get(persistedOptions);
        onPrompt(turnContext, state, options, false);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.recognizers.text.IModel' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/ModelFactory.java`
#### Snippet
```java
        IModel model = this.getModel(modelType, culture, options);
        if (model != null) {
            return (T)model;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.recognizers.text.IModel' to 'T'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/ModelFactory.java`
#### Snippet
```java
            model = this.getModel(modelType, fallbackCulture, options);
            if (model != null) {
                return (T)model;
            }
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
            }
        } else if (isTeamsVerificationInvoke(turnContext)) {
            HashMap<String, String> values = (HashMap<String, String>) turnContext.getActivity().getValue();
            String magicCode = "";
            if (values != null && values instanceof HashMap) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
        PromptRecognizerResult<TokenResponse> recognized =  recognizeToken(settings, dc).join();

        Map<String, Object> promptState = (Map<String, Object>) state.get(PERSISTED_STATE);
        PromptOptions promptOptions = (PromptOptions) state.get(PERSISTED_OPTIONS);

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'com.microsoft.recognizers.text.matcher.AaNode'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/AcAutomation.java`
#### Snippet
```java
            if (node.children != null) {
                for (Object item : node.getIterable()) {
                    queue.offer((AaNode<T>)item);
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/models/DateTimeModel.java`
#### Snippet
```java

                if (parseResult.getValue() instanceof List) {
                    parsedDateTimes.addAll((List<DateTimeParseResult>)parseResult.getValue());
                } else {
                    parsedDateTimes.add(parseResult);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.SortedMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/models/DateTimeModel.java`
#### Snippet
```java
        int end = parsedDateTime.getStart() + parsedDateTime.getLength() - 1;
        String typeName = parsedDateTime.getType();
        SortedMap<String, Object> resolution = (SortedMap<String, Object>)parsedDateTime.getValue();
        String text = parsedDateTime.getText();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/models/DateTimeModel.java`
#### Snippet
```java

    private String getParentText(DateTimeParseResult parsedDateTime) {
        Map<String, Object> map = (Map<String, Object>)parsedDateTime.getData();
        Object result = map.get(ExtendedModelResult.ParentTextKey);
        return String.valueOf(result);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimeZoneExtractorConfiguration.java`
#### Snippet
```java
    public static final Pattern LocationTimeSuffixRegex = RegExpUtility.getSafeRegExp(EnglishTimeZone.LocationTimeSuffixRegex, Pattern.CASE_INSENSITIVE);
    public static final StringMatcher LocationMatcher = new StringMatcher();
    public static final StringMatcher TimeZoneMatcher = buildMatcherFromLists(AbbreviationsList, FullNameList);

    public static final List<String> AmbiguousTimezoneList = EnglishTimeZone.AmbiguousTimezoneList;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java

    private void getResolution(ExtractResult er, DateTimeParseResult pr, DateTimeResolutionResult ret) {
        String parentText = ((Map<String, Object>)er.getData()).get(ExtendedModelResult.ParentTextKey).toString();
        String type = pr.getType();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    startPointType = TimeTypeConstants.START_DATE;
                    endPointType = TimeTypeConstants.END_DATE;
                    pastStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    endPointType = TimeTypeConstants.END_DATE;
                    pastStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    pastStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    break;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    pastEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    break;

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java

                    if (ret.getPastValue() instanceof Pair<?, ?>) {
                        pastStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                        pastEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                        futureStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    if (ret.getPastValue() instanceof Pair<?, ?>) {
                        pastStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                        pastEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                        futureStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                        futureEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                        pastStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                        pastEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                        futureStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                        futureEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    } else if (ret.getPastValue() instanceof LocalDateTime) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                        pastEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                        futureStartPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                        futureEndPointResolution = DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    } else if (ret.getPastValue() instanceof LocalDateTime) {
                        pastStartPointResolution = DateTimeFormatUtil.formatDateTime((LocalDateTime)ret.getPastValue());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    startPointType = TimeTypeConstants.START_TIME;
                    endPointType = TimeTypeConstants.END_TIME;
                    pastStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    endPointType = TimeTypeConstants.END_TIME;
                    pastStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    pastStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue0());
                    pastEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    break;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
                    pastEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getPastValue()).getValue1());
                    futureStartPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue0());
                    futureEndPointResolution = DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)ret.getFutureValue()).getValue1());
                    break;
                default:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java

        // Original type of the extracted entity
        String subType = ((Map<String, Object>)(er.getData())).get(Constants.SubType).toString();
        ExtractResult dateTimeEr = new ExtractResult();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
        boolean hasContext = false;
        ExtractResult contextEr = null;
        if (((Map<String, Object>)er.getData()).containsKey(Constants.Context)) {
            contextEr = (ExtractResult)((Map<String, Object>)er.getData()).get(Constants.Context);
            if (contextEr.getType().equals(Constants.ContextType_RelativeSuffix)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
        ExtractResult contextEr = null;
        if (((Map<String, Object>)er.getData()).containsKey(Constants.Context)) {
            contextEr = (ExtractResult)((Map<String, Object>)er.getData()).get(Constants.Context);
            if (contextEr.getType().equals(Constants.ContextType_RelativeSuffix)) {
                dateTimeEr.setText(String.format("%s %s", er.getText(), contextEr.getText()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            // Resolve timezome
            if (TimeZoneUtility.shouldResolveTimeZone(er, config.getOptions())) {
                Map<String, Object> metadata = (Map)er.getData();
                ExtractResult timezoneEr = (ExtractResult)metadata.get(Constants.SYS_DATETIME_TIMEZONE);
                ParseResult timezonePr = config.getTimeZoneParser().parse(timezoneEr);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java

            if (TimeZoneUtility.shouldResolveTimeZone(er, config.getOptions())) {
                Map<String, Object> metadata = (HashMap<String, Object>)er.getData();

                ExtractResult timezoneEr = (ExtractResult)metadata.get(Constants.SYS_DATETIME_TIMEZONE);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                futureResolution.put(
                        TimeTypeConstants.START_TIME,
                        DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue0()));
                futureResolution.put(
                        TimeTypeConstants.END_TIME,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                futureResolution.put(
                        TimeTypeConstants.END_TIME,
                        DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue1()));

                innerResult.setFutureResolution(futureResolution.build());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                pastResolution.put(
                        TimeTypeConstants.START_TIME,
                        DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue0()));
                pastResolution.put(
                        TimeTypeConstants.END_TIME,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                pastResolution.put(
                        TimeTypeConstants.END_TIME,
                        DateTimeFormatUtil.formatTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue1()));

                innerResult.setPastResolution(pastResolution.build());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
    private void resolveAmPm(Map<String, Object> resolutionDic, String keyName) {
        if (resolutionDic.containsKey(keyName)) {
            Map<String, String> resolution = (Map<String, String>)resolutionDic.get(keyName);

            Map<String, String> resolutionPm = new LinkedHashMap<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
    private void resolveWeekOf(Map<String, Object> resolutionDic, String keyName) {
        if (resolutionDic.containsKey(keyName)) {
            Map<String, String> resolution = (Map<String, String>)resolutionDic.get(keyName);

            LocalDateTime monday = DateUtil.tryParse(resolution.get(DateTimeResolutionKey.START));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
                }

                for (Map.Entry<String, String> q : ((Map<String, String>)p.getValue()).entrySet()) {
                    value.put(q.getKey(), q.getValue());
                }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.TreeMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
            // Only handle DatePeriod like "(StartDate,EndDate,Duration)"
            if (timexComponents.length == 3) {
                TreeMap<String, Object> value = (TreeMap<String, Object>)slot.getValue();
                String altTimex = "";

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
                if (value != null && value.containsKey(ResolutionKey.ValueSet)) {
                    if (value.get(ResolutionKey.ValueSet) instanceof List) {
                        List<HashMap<String, String>> valueSet = (List<HashMap<String, String>>)value.get(ResolutionKey.ValueSet);
                        if (!value.isEmpty()) {

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                        ret.setTimex(TimexUtility.generateDateTimePeriodTimex(beginTimex, endTimex, rangeTimexComponents.durationTimex));

                        Pair<LocalDateTime, LocalDateTime> timePeriodFutureValue = (Pair<LocalDateTime, LocalDateTime>)timePeriodResolutionResult.getFutureValue();
                        LocalDateTime beginTime = timePeriodFutureValue.getValue0();
                        LocalDateTime endTime = timePeriodFutureValue.getValue1();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java

            if (TimeZoneUtility.shouldResolveTimeZone(er, config.getOptions())) {
                Map<String, Object> metadata = (HashMap<String, Object>)er.getData();

                ExtractResult timezoneEr = (ExtractResult)metadata.get(Constants.SYS_DATETIME_TIMEZONE);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                    Map<String, String> futureResolution = ImmutableMap.<String, String>builder()
                            .put(TimeTypeConstants.START_DATETIME,
                                    DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue1()))
                            .build();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                            .put(TimeTypeConstants.START_DATETIME,
                                    DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue1()))
                            .build();
                    innerResult.setFutureResolution(futureResolution);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java

                    Map<String, String> pastResolution = ImmutableMap.<String, String>builder()
                            .put(TimeTypeConstants.START_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue1()))
                            .build();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                    Map<String, String> pastResolution = ImmutableMap.<String, String>builder()
                            .put(TimeTypeConstants.START_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATETIME, DateTimeFormatUtil.formatDateTime(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue1()))
                            .build();
                    innerResult.setPastResolution(pastResolution);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                DateTimeParseResult timePr = config.getTimePeriodParser().parse(timePeriodErs.get(0), referenceDate);
                if (timePr != null) {
                    Pair<LocalDateTime, LocalDateTime> periodFuture = (Pair<LocalDateTime, LocalDateTime>)((DateTimeResolutionResult)timePr.getValue()).getFutureValue();
                    Pair<LocalDateTime, LocalDateTime> periodPast = (Pair<LocalDateTime, LocalDateTime>)((DateTimeResolutionResult)timePr.getValue()).getPastValue();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                if (timePr != null) {
                    Pair<LocalDateTime, LocalDateTime> periodFuture = (Pair<LocalDateTime, LocalDateTime>)((DateTimeResolutionResult)timePr.getValue()).getFutureValue();
                    Pair<LocalDateTime, LocalDateTime> periodPast = (Pair<LocalDateTime, LocalDateTime>)((DateTimeResolutionResult)timePr.getValue()).getPastValue();

                    if (periodFuture == periodPast) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    innerResult.setFutureResolution(ImmutableMap.<String, String>builder()
                            .put(TimeTypeConstants.START_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue1()))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getFutureValue()).getValue1()))
                            .build());

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    innerResult.setPastResolution(ImmutableMap.<String, String>builder()
                            .put(TimeTypeConstants.START_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue1()))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue0()))
                            .put(TimeTypeConstants.END_DATE,
                                    DateTimeFormatUtil.formatDate(((Pair<LocalDateTime, LocalDateTime>)innerResult.getPastValue()).getValue1()))
                            .build());
                } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                startResolution = parseBaseDatePeriod(match.get().getGroup("start").value.trim(), referenceDate, dateContext);
                if (startResolution.getSuccess()) {
                    futureBegin = ((Pair<LocalDateTime, LocalDateTime>)startResolution.getFutureValue()).getValue0();
                    pastBegin = ((Pair<LocalDateTime, LocalDateTime>)startResolution.getPastValue()).getValue0();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                if (startResolution.getSuccess()) {
                    futureBegin = ((Pair<LocalDateTime, LocalDateTime>)startResolution.getFutureValue()).getValue0();
                    pastBegin = ((Pair<LocalDateTime, LocalDateTime>)startResolution.getPastValue()).getValue0();

                    if (startResolution.getTimex().contains("-W")) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                    if (endResolution.getSuccess()) {
                        futureEnd = ((Pair<LocalDateTime, LocalDateTime>)endResolution.getFutureValue()).getValue0();
                        pastEnd = ((Pair<LocalDateTime, LocalDateTime>)endResolution.getPastValue()).getValue0();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    if (endResolution.getSuccess()) {
                        futureEnd = ((Pair<LocalDateTime, LocalDateTime>)endResolution.getFutureValue()).getValue0();
                        pastEnd = ((Pair<LocalDateTime, LocalDateTime>)endResolution.getPastValue()).getValue0();

                        if (endResolution.getTimex().contains("-W")) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
        }

        HashMap<String, String> futureResolution = (HashMap<String, String>)resolutionDic.get(futureKey);
        HashMap<String, String> pastResolution = (HashMap<String, String>)resolutionDic.get(pastKey);
        futureResolution.put(DateTimeResolutionKey.Timex, timexes[0]);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java

        HashMap<String, String> futureResolution = (HashMap<String, String>)resolutionDic.get(futureKey);
        HashMap<String, String> pastResolution = (HashMap<String, String>)resolutionDic.get(pastKey);
        futureResolution.put(DateTimeResolutionKey.Timex, timexes[0]);
        pastResolution.put(DateTimeResolutionKey.Timex, timexes[1]);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimeZoneUtility.java`
#### Snippet
```java

        if (er.getData() instanceof Map) {
            Map<String, Object> metadata = (HashMap<String, Object>)er.getData();

            if (metadata.containsKey(Constants.SYS_DATETIME_TIMEZONE)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateContext.java`
#### Snippet
```java
        if (!isEmpty()) {
            resolutionResult.setTimex(TimexUtility.setTimexWithContext(resolutionResult.getTimex(), this));
            resolutionResult.setFutureValue(setDateRangeWithContext((Pair<LocalDateTime, LocalDateTime>)resolutionResult.getFutureValue()));
            resolutionResult.setPastValue(setDateRangeWithContext((Pair<LocalDateTime, LocalDateTime>)resolutionResult.getPastValue()));
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.javatuples.Pair'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateContext.java`
#### Snippet
```java
            resolutionResult.setTimex(TimexUtility.setTimexWithContext(resolutionResult.getTimex(), this));
            resolutionResult.setFutureValue(setDateRangeWithContext((Pair<LocalDateTime, LocalDateTime>)resolutionResult.getFutureValue()));
            resolutionResult.setPastValue(setDateRangeWithContext((Pair<LocalDateTime, LocalDateTime>)resolutionResult.getPastValue()));
        }

```

### UNCHECKED_WARNING
Unchecked call to 'apply(T)' as a member of raw type 'java.util.function.Function'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/SequenceRecognizer.java`
#### Snippet
```java
    private static List<ModelResult> recognizeByModel(Function getModelFunc, String query, SequenceOptions options) {
        SequenceRecognizer recognizer = new SequenceRecognizer(options, false);
        IModel model = (IModel)getModelFunc.apply(recognizer);
        return model.parse(query);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

        if (originalMetadata instanceof Map) {
            result = (Map)originalMetadata;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

        // Share the timeZone info
        Map<String, Object> metaDataOrigin = (HashMap<String, Object>)first.getData();
        if (metaDataOrigin != null && metaDataOrigin.containsKey(Constants.SYS_DATETIME_TIMEZONE)) {
            metadata.put(Constants.SYS_DATETIME_TIMEZONE, metaDataOrigin.get(Constants.SYS_DATETIME_TIMEZONE));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.HashSet'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
        int pivot = startIndex + 1;
        HashSet types = new HashSet<String>();
        types.add(ers.get(startIndex).getType());

        while (pivot < ers.size()) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.HashSet'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

            if (isSupportedAltEntitySequence(ers.subList(startIndex, startIndex + (pivot - startIndex + 1)))) {
                types.add(ers.get(pivot).getType());
                pivot++;
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/DictionaryWriter.java`
#### Snippet
```java
    private String getEntryValue(Object value, String valueType) {
        if (value instanceof ArrayList) {
            return String.join(", ", (String[])((ArrayList) value).stream().map(o -> String.format("\"%s\"", sanitize(o.toString(), valueType))).toArray(size -> new String[size]));
        }
        return  sanitize(value.toString(), valueType);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(IntFunction)' as a member of raw type 'java.util.stream.Stream'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/DictionaryWriter.java`
#### Snippet
```java
    private String getEntryValue(Object value, String valueType) {
        if (value instanceof ArrayList) {
            return String.join(", ", (String[])((ArrayList) value).stream().map(o -> String.format("\"%s\"", sanitize(o.toString(), valueType))).toArray(size -> new String[size]));
        }
        return  sanitize(value.toString(), valueType);
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java

        if (token instanceof ArrayList) {
            return new ListWriter(tokenName, "String", (String[])((ArrayList) token).stream().map(o -> o.toString()).toArray(size -> new String[size]));
        }

```

### UNCHECKED_WARNING
Unchecked call to 'toArray(IntFunction)' as a member of raw type 'java.util.stream.Stream'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java

        if (token instanceof ArrayList) {
            return new ListWriter(tokenName, "String", (String[])((ArrayList) token).stream().map(o -> o.toString()).toArray(size -> new String[size]));
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'TypeT'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java

        if (classType.isInstance(this.getChannelData())) {
            return (TypeT) this.getChannelData();
        }
        JsonNode node = MAPPER.valueToTree(this.getChannelData());
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `AuthenticationConstants.VERSION_CLAIM`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * Checks if the given list of claims represents a skill.
     *
     * A skill claim should contain: An {@link AuthenticationConstants.VERSION_CLAIM}
     * claim. An {@link AuthenticationConstants.AUTIENCE_CLAIM} claim. An
     * {@link AuthenticationConstants.APPID_CLAIM} claim (v1) or an a
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.AUTIENCE_CLAIM`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     *
     * A skill claim should contain: An {@link AuthenticationConstants.VERSION_CLAIM}
     * claim. An {@link AuthenticationConstants.AUTIENCE_CLAIM} claim. An
     * {@link AuthenticationConstants.APPID_CLAIM} claim (v1) or an a
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} claim (v2). And the appId
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.APPID_CLAIM`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * A skill claim should contain: An {@link AuthenticationConstants.VERSION_CLAIM}
     * claim. An {@link AuthenticationConstants.AUTIENCE_CLAIM} claim. An
     * {@link AuthenticationConstants.APPID_CLAIM} claim (v1) or an a
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} claim (v2). And the appId
     * claim should be different than the audience claim. When a channel (webchat,
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.AUTHORIZED_PARTY`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * claim. An {@link AuthenticationConstants.AUTIENCE_CLAIM} claim. An
     * {@link AuthenticationConstants.APPID_CLAIM} claim (v1) or an a
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} claim (v2). And the appId
     * claim should be different than the audience claim. When a channel (webchat,
     * teams, etc.) invokes a bot, the {@link AuthenticationConstants.AUTIENCE_CLAIM}
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.AUTIENCE_CLAIM`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} claim (v2). And the appId
     * claim should be different than the audience claim. When a channel (webchat,
     * teams, etc.) invokes a bot, the {@link AuthenticationConstants.AUTIENCE_CLAIM}
     * is set to {@link AuthenticationConstants.TO_BOT_FROM_CHANNEL_TOKEN_ISSUER} but
     * when a bot calls another bot, the audience claim is set to the appId of the
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.TO_BOT_FROM_CHANNEL_TOKEN_ISSUER`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * claim should be different than the audience claim. When a channel (webchat,
     * teams, etc.) invokes a bot, the {@link AuthenticationConstants.AUTIENCE_CLAIM}
     * is set to {@link AuthenticationConstants.TO_BOT_FROM_CHANNEL_TOKEN_ISSUER} but
     * when a bot calls another bot, the audience claim is set to the appId of the
     * bot being invoked. The protocol supports v1 and v2 tokens: For v1 tokens, the
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.APPID_CLAIM`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * when a bot calls another bot, the audience claim is set to the appId of the
     * bot being invoked. The protocol supports v1 and v2 tokens: For v1 tokens, the
     * {@link AuthenticationConstants.APPID_CLAIM} is present and set to the app Id
     * of the calling bot. For v2 tokens, the
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} is present and set to the app
```

### JavadocReference
Cannot resolve symbol `AuthenticationConstants.AUTHORIZED_PARTY`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/SkillValidation.java`
#### Snippet
```java
     * {@link AuthenticationConstants.APPID_CLAIM} is present and set to the app Id
     * of the calling bot. For v2 tokens, the
     * {@link AuthenticationConstants.AUTHORIZED_PARTY} is present and set to the app
     * Id of the calling bot.
     *
```

### JavadocReference
Cannot resolve symbol `CosmosDbPartitionedStorage.compatibilityMode`
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
     *                          CosmosDb max key length of 255. This behavior can be
     *                          overridden by setting
     *                          {@link CosmosDbPartitionedStorage.compatibilityMode}
     *                          to false. *
     * @return An escaped key that can be used safely with CosmosDB.
```

### JavadocReference
Cannot resolve symbol `authenticateRequest(Activity, String,
* CredentialProvider, ChannelProvider, AuthenticationConfiguration,
* HttpClient)`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ChannelServiceHandler.java`
#### Snippet
```java
     *
     * This code is very similar to the code in
     * {@link JwtTokenValidation#authenticateRequest(Activity, String,
     * CredentialProvider, ChannelProvider, AuthenticationConfiguration,
     * HttpClient)} , we should move this code somewhere in that library when
```

### JavadocReference
Cannot resolve symbol `HttpClient`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ChannelServiceHandler.java`
#### Snippet
```java
     * {@link JwtTokenValidation#authenticateRequest(Activity, String,
     * CredentialProvider, ChannelProvider, AuthenticationConfiguration,
     * HttpClient)} , we should move this code somewhere in that library when
     * we refactor auth, for now we keep it private to avoid adding more public
     * static functions that we will need to deprecate later.
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `getT`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `reading`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `createSkillConversationId(SkillConversationI
* FactoryOptions,System`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
/**
 * A class defining the parameters used in
 * {@link SkillConversationIdFactoryBase#createSkillConversationId(SkillConversationI
 * FactoryOptions,System#getThreading()#getCancellationToken())} .
 */
```

### JavadocReference
Cannot resolve symbol `SkillConversationI`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
/**
 * A class defining the parameters used in
 * {@link SkillConversationIdFactoryBase#createSkillConversationId(SkillConversationI
 * FactoryOptions,System#getThreading()#getCancellationToken())} .
 */
```

### JavadocReference
Cannot resolve symbol `getThreading`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
 * A class defining the parameters used in
 * {@link SkillConversationIdFactoryBase#createSkillConversationId(SkillConversationI
 * FactoryOptions,System#getThreading()#getCancellationToken())} .
 */
public class SkillConversationIdFactoryOptions {
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link ConversationReference} created using
     * {@link
     * CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     * Reference(),System#getThreading()#getCancellationToken())} for a
     * skillConversationId.
```

### JavadocReference
Cannot resolve symbol `Microsoft`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link ConversationReference} created using
     * {@link
     * CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     * Reference(),System#getThreading()#getCancellationToken())} for a
     * skillConversationId.
```

### JavadocReference
Cannot resolve symbol `getBot`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link ConversationReference} created using
     * {@link
     * CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     * Reference(),System#getThreading()#getCancellationToken())} for a
     * skillConversationId.
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     *                             Reference(),System#getThreading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `Microsoft`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     *                             Reference(),System#getThreading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `getBot`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     *                             Reference(),System#getThreading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
    /**
     * Gets the {@link SkillConversationReference} used during {@link
     * CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     * reading()#getCancellationToken())} for a skillConversationId.
     *
```

### JavadocReference
Cannot resolve symbol `getT`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
    /**
     * Gets the {@link SkillConversationReference} used during {@link
     * CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     * reading()#getCancellationToken())} for a skillConversationId.
     *
```

### JavadocReference
Cannot resolve symbol `reading`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link SkillConversationReference} used during {@link
     * CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     * reading()#getCancellationToken())} for a skillConversationId.
     *
     * @param skillConversationId  A skill conversationId created using {@link
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `getT`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `reading`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   The caller's {@link ConversationReference} for a skillConversationId, with originatingAudience.
```

### JavadocReference
Cannot resolve symbol `CreateSkillConversationId`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `getT`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocReference
Cannot resolve symbol `reading`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `IBot`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
     *
     * @param adapter                An instance of the {@link BotAdapter} that will handle the request.
     * @param bot                    The {@link IBot} instance.
     * @param conversationIdFactory  A {@link SkillConversationIdFactoryBase} to unpack the conversation ID and
     *                               map it to the calling bot.
```

### JavadocReference
Cannot resolve symbol `MiddlewareSet`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
     * @param channelProvider        The channel provider.
     *
     * Use a {@link MiddlewareSet} Object to add multiple middleware components
     * in the constructor. Use the Use({@link Middleware} ) method to add
     * additional middleware to the adapter after construction.
```

### JavadocReference
Cannot resolve symbol `Middleware`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
     *
     * Use a {@link MiddlewareSet} Object to add multiple middleware components
     * in the constructor. Use the Use({@link Middleware} ) method to add
     * additional middleware to the adapter after construction.
     */
```

### JavadocReference
Cannot resolve symbol `result`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
     * @return A CompletableFuture that represents the work queued to execute.
     *
     * In the next step of the waterfall, the {@link result} property of the waterfall step context
     * will contain the value of the .
     */
```

### JavadocReference
Cannot resolve symbol `TurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
 * Provides context for a step in a {@link WaterfallDialog} .
 *
 * The {@link DialogContext} property contains the {@link TurnContext}
 * for the current turn.
 */
```

### JavadocReference
Cannot resolve symbol `continueDialog(CancellationToken)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     *         result may also contain a return value. If this method is *not*
     *         overridden, the component dialog calls the
     *         {@link DialogContext#continueDialog(CancellationToken)} method on its
     *         inner dialog context. If the inner dialog stack is empty, the
     *         component dialog ends, and if a {@link DialogTurnResult#result} is
```

### JavadocReference
Cannot resolve symbol `CancellationToken`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     *         result may also contain a return value. If this method is *not*
     *         overridden, the component dialog calls the
     *         {@link DialogContext#continueDialog(CancellationToken)} method on its
     *         inner dialog context. If the inner dialog stack is empty, the
     *         component dialog ends, and if a {@link DialogTurnResult#result} is
```

### JavadocReference
Symbol `result` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     *         {@link DialogContext#continueDialog(CancellationToken)} method on its
     *         inner dialog context. If the inner dialog stack is empty, the
     *         component dialog ends, and if a {@link DialogTurnResult#result} is
     *         available, the component dialog uses that as its return value.
     */
```

### JavadocReference
Symbol `result` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     *         the result is passed to the next parent context, if one exists. The
     *         returned {@link DialogTurnResult} contains the return value in its
     *         {@link DialogTurnResult#result} property.
     */
    protected CompletableFuture<DialogTurnResult> endComponent(DialogContext outerDc, Object result) {
```

### JavadocReference
Symbol `telemetryClient` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     * @return The {@link ComponentDialog} after the operation is complete.
     *
     *         The added dialog's {@link Dialog#telemetryClient} is set to the
     *         {@link DialogContainer#telemetryClient} of the component dialog.
     */
```

### JavadocReference
Symbol `telemetryClient` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ComponentDialog.java`
#### Snippet
```java
     *
     *         The added dialog's {@link Dialog#telemetryClient} is set to the
     *         {@link DialogContainer#telemetryClient} of the component dialog.
     */
    public ComponentDialog addDialog(Dialog dialog) {
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `PromptValidator.FoundChoice`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *
     * @param dialogId      The ID to assign to this prompt.
     * @param validator     Optional, a {@link PromptValidator.FoundChoice} that
     *                      contains additional, custom validation for this prompt.
     * @param defaultLocale Optional, the default locale used to determine
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      language or language family.
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Cannot resolve symbol `Activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
```

### JavadocReference
Cannot resolve symbol `locale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `context`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `ITurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `defaultLocale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
     *                      is the used if no language or default locale is
     *                      available, or if the language or locale is not otherwise
```

### JavadocReference
Cannot resolve symbol `decimal`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
 *
 * The number prompt currently supports these types: {@link float} , {@link int}
 * , {@link long} , {@link double} , and {@link decimal} .
 * @param <T> numeric type for this prompt, which can be int, long, double, or float.
 */
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param classOfNumber Type of <T> used to determine within the class what type was created for. This is required
     *                      due to type erasure in Java not allowing checking the type of <T> during runtime.
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param classOfNumber Type of <T> used to determine within the class what type was created for. This is required
     *                      due to type erasure in Java not allowing checking the type of <T> during runtime.
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     * @param options     A prompt options Object constructed from the options
     *                    initially provided in the call to
     *                    {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry     true if this is the first time this prompt dialog instance
     *                    on the stack is prompting the user for input; otherwise,
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     * @param options     A prompt options Object constructed from the options
     *                    initially provided in the call to
     *                    {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry     true if this is the first time this prompt dialog instance
     *                    on the stack is prompting the user for input; otherwise,
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param validator     Validator that will be called each time the user
     *                      responds to the prompt.
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param validator     Validator that will be called each time the user
     *                      responds to the prompt.
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     * @param options     A prompt options Object constructed from the options
     *                    initially provided in the call to
     *                    {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     * @param options     A prompt options Object constructed from the options
     *                    initially provided in the call to
     *                    {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param validator     Validator that will be called each time the user
     *                      responds to the prompt.
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
     *
     * @param dialogId      Unique ID of the dialog within its parent
     *                      {@link DialogSet} or {@link ComponentDialog} .
     * @param validator     Validator that will be called each time the user
     *                      responds to the prompt.
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      language or language family.
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Symbol `locale` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `context`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `ITurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `defaultLocale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
     *                      is the used if no language or default locale is
     *                      available, or if the language or locale is not otherwise
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `ChoiceFactory`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java

    /**
     * Gets additional options passed to the {@link ChoiceFactory} and used to tweak the
     * style of choices rendered to the user.
     * @return Additional options for presenting the set of choices.
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       choice defaults.
     *
     *                       The value of {@link dialogId} must be unique within the
     *                       {@link DialogSet} or {@link ComponentDialog} to which
     *                       the prompt is added. If the {@link Activity#locale} of
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *
     *                       The value of {@link dialogId} must be unique within the
     *                       {@link DialogSet} or {@link ComponentDialog} to which
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *
     *                       The value of {@link dialogId} must be unique within the
     *                       {@link DialogSet} or {@link ComponentDialog} to which
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
```

### JavadocReference
Symbol `locale` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       The value of {@link dialogId} must be unique within the
     *                       {@link DialogSet} or {@link ComponentDialog} to which
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       {@link DialogSet} or {@link ComponentDialog} to which
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
     *                       .{@link ITurnContext#activity} is specified, then that
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
     *                       .{@link ITurnContext#activity} is specified, then that
     *                       local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `context`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       the prompt is added. If the {@link Activity#locale} of
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
     *                       .{@link ITurnContext#activity} is specified, then that
     *                       local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `ITurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
     *                       .{@link ITurnContext#activity} is specified, then that
     *                       local is used to determine language specific behavior;
     *                       otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       the {@link DialogContext}
     *                       .{@link DialogContext#context}
     *                       .{@link ITurnContext#activity} is specified, then that
     *                       local is used to determine language specific behavior;
     *                       otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `defaultLocale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                       .{@link ITurnContext#activity} is specified, then that
     *                       local is used to determine language specific behavior;
     *                       otherwise the {@link defaultLocale} is used. US-English
     *                       is the used if no language or default locale is
     *                       available, or if the language or locale is not
```

### JavadocReference
Cannot resolve symbol `ChoiceFactory`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java

    /**
     * Sets additional options passed to the {@link ChoiceFactory} and used to tweak the
     * style of choices rendered to the user.
     * @param choiceOptions Additional options for presenting the set of choices.
```

### JavadocReference
Cannot resolve symbol `GetSupportedCultures`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java

    /**
     * A map of Default Choices based on {@link GetSupportedCultures} . Can
     * be replaced by user using the constructor that contains choiceDefaults.
     */
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ConfirmPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     *                   additional, custom validation for this prompt.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     *                   additional, custom validation for this prompt.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
    public TextPrompt(String dialogId, PromptValidator<String> validator) {
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     * @param dialogId   The ID to assign to this prompt.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     * @param dialogId   The ID to assign to this prompt.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/TextPrompt.java`
#### Snippet
```java
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
    public TextPrompt(String dialogId) {
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
     *
     *                  The value of dialogId must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
     *
     *                  The value of dialogId must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     *                   custom validation for this prompt.
     *
     * The value of dialogId must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     *
     * The value of dialogId must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
    public AttachmentPrompt(String dialogId, PromptValidator<List<Attachment>> validator) {
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     * @param dialogId   The ID to assign to this prompt.
     *
     * The value of dialogId must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     *
     * The value of dialogId must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added.
     */
    public AttachmentPrompt(String dialogId) {
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/AttachmentPrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                        needs the custom choice defaults.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                        needs the custom choice defaults.
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
```

### JavadocReference
Symbol `locale` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
```

### JavadocReference
Cannot resolve symbol `context`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
```

### JavadocReference
Cannot resolve symbol `ITurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
```

### JavadocReference
Cannot resolve symbol `activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * The value of {@link dialogId} must be unique within the {@link DialogSet} or
     * {@link ComponentDialog} to which the prompt is added. If the {@link Activity#locale} of the
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
```

### JavadocReference
Cannot resolve symbol `defaultLocale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     * {@link DialogContext} .{@link DialogContext#context} .{@link ITurnContext#activity} is
     * specified, then that local is used to determine language specific behavior; otherwise the
     * {@link defaultLocale} is used. US-English is the used if no language or default locale is
     * available, or if the language or locale is not otherwise supported.
     */
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      language or language family.
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
```

### JavadocReference
Symbol `locale` is inaccessible from here
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      The value of {@link dialogId} must be unique within the
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `context`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      {@link DialogSet} or {@link ComponentDialog} to which
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
```

### JavadocReference
Cannot resolve symbol `ITurnContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `activity`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      the prompt is added. If the {@link Activity#locale} of
     *                      the {@link DialogContext} .{@link DialogContext#context}
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
```

### JavadocReference
Cannot resolve symbol `defaultLocale`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                      .{@link ITurnContext#activity} is specified, then that
     *                      local is used to determine language specific behavior;
     *                      otherwise the {@link defaultLocale} is used. US-English
     *                      is the used if no language or default locale is
     *                      available, or if the language or locale is not otherwise
```

### JavadocReference
Cannot resolve symbol `ChoiceFactory`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java

    /**
     * Gets additional options passed to the {@link ChoiceFactory} and used to tweak the
     * style of choices rendered to the user.
     * @return Additional options for presenting the set of choices.
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     * @param isRetry      true if this is the first time this prompt dialog instance on the
     *                     stack is prompting the user for input; otherwise, false.
```

### JavadocReference
Cannot resolve symbol `ChoiceFactory`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java

    /**
     * Sets additional options passed to the {@link ChoiceFactory} and used to tweak the
     * style of choices rendered to the user.
     * @param choiceOptions Additional options for presenting the set of choices.
```

### JavadocReference
Cannot resolve symbol `recognizeChoices(String, IList`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @return Options to control the recognition strategy.
```

### JavadocReference
Cannot resolve symbol `IList`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @return Options to control the recognition strategy.
```

### JavadocReference
Cannot resolve symbol `GetSupportedCultures`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java

    /**
     * A dictionary of Default Choices based on {@link GetSupportedCultures} . Can
     * be replaced by user using the constructor that contains choiceDefaults.
     */
```

### JavadocReference
Cannot resolve symbol `DialogContext`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `prompt(String, PromptOptions)`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
     *                     dialog stack.
     * @param options      A prompt options Object constructed from the options initially
     *                     provided in the call to {@link DialogContext#prompt(String, PromptOptions)} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocReference
Cannot resolve symbol `recognizeChoices(String, IList`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @param recognizerOptions Options to control the recognition strategy.
```

### JavadocReference
Cannot resolve symbol `IList`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @param recognizerOptions Options to control the recognition strategy.
```

### JavadocReference
Cannot resolve symbol `OnInvokeActivity`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * @return   A task that represents the work queued to execute.
     *
     * When the {@link OnInvokeActivity(TurnContext(InvokeActivity))} method
     * receives an Invoke with a {@link InvokeActivity.name} of
     * `adaptiveCard/action`, it calls this method.
```

### JavadocReference
Cannot resolve symbol `InvokeActivity`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * @return   A task that represents the work queued to execute.
     *
     * When the {@link OnInvokeActivity(TurnContext(InvokeActivity))} method
     * receives an Invoke with a {@link InvokeActivity.name} of
     * `adaptiveCard/action`, it calls this method.
```

### JavadocReference
Cannot resolve symbol `InvokeActivity.name`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     *
     * When the {@link OnInvokeActivity(TurnContext(InvokeActivity))} method
     * receives an Invoke with a {@link InvokeActivity.name} of
     * `adaptiveCard/action`, it calls this method.
     */
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *                  contains additional, custom validation for this prompt.
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `dialogId`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *                  prompt.
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
```

### JavadocReference
Cannot resolve symbol `DialogSet`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

### JavadocReference
Cannot resolve symbol `ComponentDialog`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
     *
     *                  The value of {@link dialogId} must be unique within the
     *                  {@link DialogSet} or {@link ComponentDialog} to which the
     *                  prompt is added.
     */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
public class BotFrameworkHttpClient extends BotFrameworkClient {

    private static Map<String, AppCredentials> appCredentialMapCache = new HashMap<String, AppCredentials>();;

    private ChannelProvider channelProvider;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(this.config.getYearPeriodRegex(), text)).findFirst();
        Optional<Match> matchMonth = Arrays.stream(RegExpUtility.getMatches(this.config.getMonthWithYear(), text)).findFirst();
        ;

        if (match.isPresent() && !matchMonth.isPresent()) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/spanish/extractors/SpanishNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
        this.cultureInfo = cultureInfo;

        this.unitNumExtractor = NumberExtractor.getInstance(NumberMode.Unit);;
        this.compoundUnitConnectorRegex =
                Pattern.compile(SpanishNumericWithUnit.CompoundUnitConnectorRegex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/portuguese/extractors/PortugueseNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
        this.cultureInfo = cultureInfo;

        this.unitNumExtractor = NumberExtractor.getInstance(NumberMode.Unit);;
        this.compoundUnitConnectorRegex =
                Pattern.compile(PortugueseNumericWithUnit.CompoundUnitConnectorRegex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `source` may produce `NullPointerException`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
            throw new ErrorResponseException("getSignInUrl", response);
        }
        return new ServiceResponse<>(response.body().source().buffer().readUtf8(), response);
    }
    /**
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/FlatteningSerializer.java`
#### Snippet
```java
                ObjectNode node = resCurrent;
                String key = field.getKey();
                JsonNode outNode = resCurrent.get(key);
                if (key.matches(".+[^\\\\]\\..+")) {
                    // Handle flattening properties
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/RestClient.java`
#### Snippet
```java

            if (connectionPool != null) {
                httpClientBuilder = httpClientBuilder.connectionPool(connectionPool);
            }
            if (dispatcher != null) {
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/RestClient.java`
#### Snippet
```java
            }
            if (dispatcher != null) {
                httpClientBuilder = httpClientBuilder.dispatcher(dispatcher);
            }

```

### DataFlowIssue
Argument `baseHttpUrl` might be null
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/BaseUrlHandler.java`
#### Snippet
```java
            HttpUrl baseHttpUrl = HttpUrl.parse(baseUrl);
            request = request.newBuilder()
                    .url(baseHttpUrl)
                    .removeHeader("x-ms-parameterized-host")
                    .build();
```

### DataFlowIssue
Method invocation `queryParameterValues` may produce `NullPointerException`
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisApplication.java`
#### Snippet
```java

        try {
            String endpointKeyParsed = HttpUrl.parse(applicationEndpoint).queryParameterValues("subscription-key")
                    .stream().findFirst().orElse("");

```

### DataFlowIssue
Argument `charset` might be null
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/LoggingInterceptor.java`
#### Snippet
```java

            if (isPlaintext(buffer)) {
                String content = buffer.clone().readString(charset);
                if (logLevel.isPrettyJson()) {
                    try {
```

### DataFlowIssue
Method invocation `contentLength` may produce `NullPointerException`
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/LoggingInterceptor.java`
#### Snippet
```java

        ResponseBody responseBody = response.body();
        long contentLength = responseBody.contentLength();
        String bodySize = contentLength != -1 ? contentLength + "-byte" : "unknown-length";

```

### DataFlowIssue
Argument `charset` might be null
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/interceptors/LoggingInterceptor.java`
#### Snippet
```java
                    new InputStreamReader(new GZIPInputStream(buffer.clone().inputStream())));
            } else {
                content = buffer.clone().readString(charset);
            }
            if (logLevel.isPrettyJson()) {
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java
            Request request = buildRequest(requestUrl, endpointKey, buildRequestBody(payloadBody));
            response = this.httpClient.newCall(request).execute();
            qnaResponse = mapper.readTree(response.body().string());
            if (!response.isSuccessful()) {
                String message = "Unexpected code " + response.code();
```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java

    private Request buildRequest(String requestUrl, String endpointKey, RequestBody body) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(requestUrl).newBuilder();
        Request.Builder requestBuilder = new Request.Builder().url(httpBuilder.build())
            .addHeader("Authorization", String.format("EndpointKey %s", endpointKey))
```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
        }

        HttpUrl.Builder httpBuilder = HttpUrl.parse(path.toString()).newBuilder();

        httpBuilder.addQueryParameter("verbose", Boolean.toString(includeInstanceData));
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                Request request = buildRequest(buildRequestBody(utterance));
                Response response = httpClient.newCall(request).execute();
                luisResponse = mapper.readTree(response.body().string());
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + luisResponse.toString());
```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java

    private Request buildRequest(Activity activity, URI url, RequestBody body, String token) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url.toString()).newBuilder();

        Request.Builder requestBuilder = new Request.Builder().url(httpBuilder.build());
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
            Response response = httpClient.newCall(request).execute();

            T result = Serialization.getAs(response.body().string(), type);
            TypedInvokeResponse<T> returnValue = new TypedInvokeResponse<T>(response.code(), result);
            return CompletableFuture.completedFuture(returnValue);
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
            ex.printStackTrace();
        }
        InputStream data = new ByteArrayInputStream(activityJson.getBytes(StandardCharsets.UTF_8));

        try {
```

### DataFlowIssue
Method invocation `setType` may produce `NullPointerException`
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                    ex.printStackTrace();
                }
                updatedActivity.setType(ActivityTypes.MESSAGE); // fixup original type (should be Message)
                Activity finalUpdatedActivity = updatedActivity;
                innerReadBlob(activity).thenAccept(activityAndBlob -> {
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                .listBlobsByHierarchy("/", this.getOptionsWithMetadata(prefix), null)
                .iterableByPage(token);
            token = null;
            for (PagedResponse<BlobItem> blobPage : resultSegment) {
                for (BlobItem blobItem : blobPage.getValue()) {
```

### DataFlowIssue
Method invocation `getScoreThreshold` may produce `NullPointerException`
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        if (queryOptions != null) {
            if (
                queryOptions.getScoreThreshold() != hydratedOptions.getScoreThreshold()
                    && queryOptions.getScoreThreshold() != 0
            ) {
```

### DataFlowIssue
Method invocation `getActivity` may produce `NullPointerException`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
            Async.completeExceptionally(new IllegalArgumentException("options cannot be null."));
        }
        ConversationReference conversationReference = options.getActivity().getConversationReference();
        String skillConversationId = UUID.randomUUID().toString();

```

### DataFlowIssue
Method invocation `getToken` may produce `NullPointerException`
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsSSOTokenExchangeMiddleware.java`
#### Snippet
```java
            RestOAuthClient userTokenClient = turnContext.getTurnState().get(RestOAuthClient.class);
            TokenExchangeRequest exchangeRequest = new TokenExchangeRequest();
            exchangeRequest.setToken(tokenExchangeRequest.getToken());
            if (userTokenClient != null) {
                tokenExchangeResponse = userTokenClient.getUserToken()
```

### DataFlowIssue
Casting `current` to `ArrayNode` will produce `ClassCastException` for any non-null value
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
                    // Expand array to index
                    int growBy = segment.intValue - ((Segments) current).size();
                    ((ArrayNode) current).add(growBy);
                }
                next = ((ArrayNode) current).get(segment.intValue);
```

### DataFlowIssue
Casting `current` to `ArrayNode` will produce `ClassCastException` for any non-null value
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
                    ((ArrayNode) current).add(growBy);
                }
                next = ((ArrayNode) current).get(segment.intValue);
            } else {
                next = getObjectProperty(current, segment.stringValue);
```

### DataFlowIssue
Method invocation `getActivities` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialog.java`
#### Snippet
```java
                    if (activity.getDeliveryMode() != null
                            && activity.getDeliveryMode().equals(DeliveryModes.EXPECT_REPLIES.toString())
                            && replies.getActivities() != null && replies.getActivities().size() > 0) {
                        // Track sent invoke responses, so more than one instanceof not sent.
                        boolean sentInvokeResponse = false;
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
        // top of stack is stack[0].
        memory.set(stackKey, stack);
        memory.put(activeDialogKey, Optional.ofNullable(dialogContext)
                                    .map(DialogContext::getActiveDialog)
                                    .map(DialogInstance::getId)
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/DialogContextMemoryScope.java`
#### Snippet
```java
                                    .map(DialogInstance::getId)
                                    .orElse(null));
        memory.put(parentKey, Optional.ofNullable(dialogContext)
                                    .map(DialogContext::getParent)
                                    .map(DialogContext::getActiveDialog)
```

### DataFlowIssue
Unboxing of `counter` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                }
                if (value instanceof Map) {
                    final int count = counter;
                    ((Map<String, Object>) value).forEach((key, val) -> {
                        checkChildren(key, val, trackedPath, count);
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BasePercentageParser.java`
#### Snippet
```java

            String resolutionStr = config.getCultureInfo() != null ?
                    NumberFormatUtility.format(ret.getValue(), config.getCultureInfo()) + "%" :
                    ret.getValue() + "%";
            ret.setResolutionStr(resolutionStr);
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BasePercentageParser.java`
#### Snippet
```java
            String resolutionStr = config.getCultureInfo() != null ?
                    NumberFormatUtility.format(ret.getValue(), config.getCultureInfo()) + "%" :
                    ret.getValue() + "%";
            ret.setResolutionStr(resolutionStr);
        } else {
```

### DataFlowIssue
Unboxing of `numbers.get(minStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchTimeParserConfiguration.java`
#### Snippet
```java
                } else {
                    minStr = match[0].getGroup("deltaminnum").value;
                    deltaMin = numbers.get(minStr);
                }
            }
```

### DataFlowIssue
Condition `entry.getValue() instanceof String[]` is redundant and can be replaced with a null check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchHolidayParserConfiguration.java`
#### Snippet
```java
        final HashMap<String, Iterable<String>> holidayNamesMap = new HashMap<>();
        for (final Map.Entry<String, String[]> entry : FrenchDateTime.HolidayNames.entrySet()) {
            if (entry.getValue() instanceof String[]) {
                holidayNamesMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
            }
```

### DataFlowIssue
Unboxing of `numbers.getOrDefault(minStr, 0)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishTimeParserConfiguration.java`
#### Snippet
```java
            } else {
                minStr = match.get().getGroup("deltaminnum").value;
                deltaMin = numbers.getOrDefault(minStr, 0);
            }
        }
```

### DataFlowIssue
Condition `entry.getValue() instanceof String[]` is redundant and can be replaced with a null check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishHolidayParserConfiguration.java`
#### Snippet
```java
        HashMap<String, Iterable<String>> newMap = new HashMap<>();
        for (Map.Entry<String, String[]> entry : EnglishDateTime.HolidayNames.entrySet()) {
            if (entry.getValue() instanceof String[]) {
                newMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDateTimePeriodParserConfiguration.java`
#### Snippet
```java
            result = true;
        } else {
            timeStr = null;
        }

```

### DataFlowIssue
Unboxing of `config.getDoubleNumbers().get(numStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

            if (config.getDoubleNumbers().containsKey(numStr)) {
                numVal = config.getDoubleNumbers().get(numStr);
            }
        }
```

### DataFlowIssue
Argument `unitStr` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String unitStr = config.getUnitMap().get(srcUnit);

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(timex);
```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String unitStr = config.getUnitMap().get(srcUnit);

                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(TimexUtility.generateDurationTimex(numVal, unitStr, isLessThanDay(unitStr)));
```

### DataFlowIssue
Argument `unitStr` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(TimexUtility.generateDurationTimex(numVal, unitStr, isLessThanDay(unitStr)));
                result.setFutureValue(timeValue);
                result.setPastValue(timeValue);
```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit.split(" ")[1])` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
            } else if (!StringUtility.isNullOrEmpty(match.get().getGroup(Constants.BusinessDayGroupName).value)) {
                String timex = TimexUtility.generateDurationTimex(numVal, Constants.TimexBusinessDay, false);
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit.split(" ")[1]);

                result.setTimex(timex);
```

### DataFlowIssue
Argument `unitStr` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String unitStr = config.getUnitMap().get(srcUnit);

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = Double.parseDouble(numStr) * config.getUnitValueMap().get(srcUnit);

```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = Double.parseDouble(numStr) * config.getUnitValueMap().get(srcUnit);

                result.setTimex(timex);
```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit.split(" ")[1])` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

                String timex = TimexUtility.generateDurationTimex(numVal, Constants.TimexBusinessDay, false);
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit.split(" ")[1]);

                result.setTimex(timex);
```

### DataFlowIssue
Argument `unitStr` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String unitStr = config.getUnitMap().get(srcUnit);

                String timex = TimexUtility.generateDurationTimex(numVal, unitStr, isLessThanDay(unitStr));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

                String timex = TimexUtility.generateDurationTimex(numVal, unitStr, isLessThanDay(unitStr));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(timex);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String unitStr = config.getUnitMap().get(srcUnit);

                if ((numVal > 1000) && (unitStr.equals("Y") || unitStr.equals("MON") || unitStr.equals("W"))) {
                    return result;
                }
```

### DataFlowIssue
Argument `unitStr` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                }

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

```

### DataFlowIssue
Unboxing of `config.getUnitValueMap().get(srcUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java

                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(timex);
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java
            if (StringUtility.isNullOrEmpty(hourStr)) {
                hourStr = wholeMatch.getMatch().get().getGroup("hournum").value.toLowerCase();
                hour = config.getNumbers().get(hourStr);
            } else {
                hour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `EnglishTimeZone.AbbrToMinMapping.get(text)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
    private boolean checkAbbrToMin(String text) {
        if (EnglishTimeZone.AbbrToMinMapping.containsKey(text)) {
            return EnglishTimeZone.AbbrToMinMapping.get(text) != Constants.InvalidOffsetValue;
        }
        return false;
```

### DataFlowIssue
Unboxing of `EnglishTimeZone.AbbrToMinMapping.getOrDefault(normalizedText, 0)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
            result.setResolutionStr(resolutionStr);
        } else if (checkAbbrToMin(normalizedText)) {
            int utcMinuteShift = EnglishTimeZone.AbbrToMinMapping.getOrDefault(normalizedText, 0);

            DateTimeResolutionResult value = getDateTimeResolutionResult(utcMinuteShift, text);
```

### DataFlowIssue
Unboxing of `EnglishTimeZone.FullToMinMapping.getOrDefault(normalizedText, 0)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
            result.setResolutionStr(resolutionStr);
        } else if (checkFullToMin(normalizedText)) {
            int utcMinuteShift = EnglishTimeZone.FullToMinMapping.getOrDefault(normalizedText, 0);

            DateTimeResolutionResult value = getDateTimeResolutionResult(utcMinuteShift, text);
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
                hours = Integer.parseInt(utcOffset);
            } catch (Exception e) {
                hours = 0;
            }
        }
```

### DataFlowIssue
Unboxing of `EnglishTimeZone.FullToMinMapping.get(text)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeZoneParser.java`
#### Snippet
```java
    private boolean checkFullToMin(String text) {
        if (EnglishTimeZone.FullToMinMapping.containsKey(text)) {
            return EnglishTimeZone.FullToMinMapping.get(text) != Constants.InvalidOffsetValue;
        }
        return false;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                hour = Integer.parseInt(text);
            } catch (Exception ignored) {
                hour = null;
            }
        }
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            // get hour
            String hourStr = match.getGroup("hournum").value.toLowerCase();
            hour = config.getNumbers().get(hourStr);

            // get minute
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(minStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java

            if (!StringUtility.isNullOrEmpty(minStr)) {
                minute = config.getNumbers().get(minStr);
                if (!StringUtility.isNullOrEmpty(tensStr)) {
                    minute += config.getNumbers().get(tensStr);
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(tensStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                minute = config.getNumbers().get(minStr);
                if (!StringUtility.isNullOrEmpty(tensStr)) {
                    minute += config.getNumbers().get(tensStr);
                }
                hasMin = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            hasMid = true;
            if (!StringUtility.isNullOrEmpty(match.getGroup("midnight").value)) {
                hour = 0;
                minute = 0;
                second = 0;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            if (!StringUtility.isNullOrEmpty(match.getGroup("midnight").value)) {
                hour = 0;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midmorning").value)) {
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                hour = 0;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midmorning").value)) {
                hour = 10;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midmorning").value)) {
                hour = 10;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midafternoon").value)) {
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                hour = 10;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midafternoon").value)) {
                hour = 14;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midafternoon").value)) {
                hour = 14;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midday").value)) {
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                hour = 14;
                minute = 0;
                second = 0;
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midday").value)) {
                hour = Constants.HalfDayHourCount;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
            } else if (!StringUtility.isNullOrEmpty(match.getGroup("midday").value)) {
                hour = Constants.HalfDayHourCount;
                minute = 0;
                second = 0;
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                hour = Constants.HalfDayHourCount;
                minute = 0;
                second = 0;
            }
        } else {
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                }

                hour = config.getNumbers().get(hourStr);
            } else {
                if (!IntegerUtility.canParse(hourStr)) {
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                    }

                    hour = config.getNumbers().get(hourStr.toLowerCase());
                } else {
                    hour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(minStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                minStr = match.getGroup("minnum").value;
                if (!StringUtility.isNullOrEmpty(minStr)) {
                    minute = config.getNumbers().get(minStr);
                    hasMin = true;
                }
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(tensStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                String tensStr = match.getGroup("tens").value;
                if (!StringUtility.isNullOrEmpty(tensStr)) {
                    minute += config.getNumbers().get(tensStr);
                    hasMin = true;
                }
```

### DataFlowIssue
Unboxing of `this.config.getDayOfMonth().get(dayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            int year = referenceDate.getYear();
            String dayStr = match.get().getGroup("day").value.toLowerCase();
            int day = this.config.getDayOfMonth().get(dayStr);

            ret.setTimex(DateTimeFormatUtil.luisDate(-1, -1, day));
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

            // Check whether the determined day of this week has passed.
            if (value.getDayOfWeek().getValue() > this.config.getDayOfWeek().get(weekdayStr)) {
                num--;
            }
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

            while (num-- > 0) {
                value = DateUtil.next(value, this.config.getDayOfWeek().get(weekdayStr));
            }

```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.next(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

            ret.setTimex(DateTimeFormatUtil.luisDate(value));
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.thisDate(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

            ret.setTimex(DateTimeFormatUtil.luisDate(value));
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            LocalDateTime value = DateUtil.last(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

            ret.setTimex(DateTimeFormatUtil.luisDate(value));
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (exactMatch.getSuccess()) {
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            int weekDay = this.config.getDayOfWeek().get(weekdayStr);
            LocalDateTime value = DateUtil.thisDate(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            String weekdayStr = exactMatch.getMatch().get().getGroup("weekday").value.toLowerCase();
            int weekDay = this.config.getDayOfWeek().get(weekdayStr);
            LocalDateTime value = DateUtil.thisDate(referenceDate, this.config.getDayOfWeek().get(weekdayStr));

            if (weekDay == 0) {
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        if (this.config.getMonthOfYear().containsKey(monthStr) && this.config.getDayOfMonth().containsKey(dayStr)) {

            month = this.config.getMonthOfYear().get(monthStr);
            day = this.config.getDayOfMonth().get(dayStr);

```

### DataFlowIssue
Unboxing of `this.config.getDayOfMonth().get(dayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

            month = this.config.getMonthOfYear().get(monthStr);
            day = this.config.getDayOfMonth().get(dayStr);

            if (!StringUtility.isNullOrEmpty(yearStr)) {
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(match.get().value.trim())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(this.config.getMonthRegex(), trimmedText)).findFirst();
        if (match.isPresent()) {
            month = this.config.getMonthOfYear().get(match.get().value.trim());
            day = num;

```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(match.get().getGroup("weekday").value)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
                month = referenceDate.getMonthValue();
                // resolve the date of wanted week day
                int wantedWeekDay = this.config.getDayOfWeek().get(match.get().getGroup("weekday").value);
                LocalDateTime firstDate = DateUtil.safeCreateFromMinValue(referenceDate.getYear(), referenceDate.getMonthValue(), 1);
                int firstWeekDay = firstDate.getDayOfWeek().getValue();
```

### DataFlowIssue
Unboxing of `this.config.getCardinalMap().get(cardinalStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        int year;

        int cardinal = this.config.isCardinalLast(cardinalStr) ? 5 : this.config.getCardinalMap().get(cardinalStr);

        int weekday = this.config.getDayOfWeek().get(weekdayStr);
```

### DataFlowIssue
Unboxing of `this.config.getDayOfWeek().get(weekdayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        int cardinal = this.config.isCardinalLast(cardinalStr) ? 5 : this.config.getCardinalMap().get(cardinalStr);

        int weekday = this.config.getDayOfWeek().get(weekdayStr);
        int month;
        if (StringUtility.isNullOrEmpty(monthStr)) {
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            year = referenceDate.plusMonths(swift).getYear();
        } else {
            month = this.config.getMonthOfYear().get(monthStr);
            year = referenceDate.getYear();
            noYear = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        // As suffix "day before yesterday" should be matched before suffix "day before" or "yesterday"
        if (config.getSameDayTerms().contains(trimmedText)) {
            swift = 0;
        } else if (endsWithTerms(trimmedText, config.getPlusTwoDayTerms())) {
            swift = 2;
```

### DataFlowIssue
Unboxing of `numbers.getOrDefault(minStr, 0)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishTimeParserConfiguration.java`
#### Snippet
```java
                } else {
                    minStr = match.get().getGroup("deltaminnum").value.toLowerCase();
                    deltaMin = numbers.getOrDefault(minStr, 0);
                }
            }
```

### DataFlowIssue
Condition `entry.getValue() instanceof String[]` is redundant and can be replaced with a null check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishHolidayParserConfiguration.java`
#### Snippet
```java
        HashMap<String, Iterable<String>> holidayNamesMap = new HashMap<>();
        for (Map.Entry<String, String[]> entry : SpanishDateTime.HolidayNames.entrySet()) {
            if (entry.getValue() instanceof String[]) {
                holidayNamesMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
            }
```

### DataFlowIssue
Condition `entry.getValue() instanceof String` is redundant and can be replaced with a null check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishHolidayParserConfiguration.java`
#### Snippet
```java
        HashMap<String, String> variableHolidaysTimexMap = new HashMap<>();
        for (Map.Entry<String, String> entry : SpanishDateTime.VariableHolidaysTimexDictionary.entrySet()) {
            if (entry.getValue() instanceof String) {
                variableHolidaysTimexMap.put(entry.getKey(), entry.getValue());
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java

        if (comment != null && !comment.isEmpty() && TimexUtility.hasDoubleTimex(comment)) {
            res = TimexUtility.processDoubleTimex(res, Constants.ResolveToFuture, Constants.ResolveToPast, timex);
        }

```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java

            if (config.getNumbers().containsKey(hourStr)) {
                beginHour = config.getNumbers().get(hourStr);
            } else {
                beginHour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java

            if (config.getNumbers().containsKey(hourStr)) {
                endHour = config.getNumbers().get(hourStr);
            } else {
                endHour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `this.config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                    beginHour = Integer.parseInt(hourStr);
                } else {
                    beginHour = this.config.getNumbers().get(hourStr);
                }

```

### DataFlowIssue
Unboxing of `this.config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                        endHour = Integer.parseInt(hourStr);
                    } else {
                        endHour = this.config.getNumbers().get(hourStr);
                    }

```

### DataFlowIssue
Dereference of `unitStr` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java

            if (config.getUnitMap().containsKey(srcUnit)) {
                switch (unitStr) {
                    case "D":
                        endTime = DateUtil.safeCreateFromMinValue(beginTime.getYear(), beginTime.getMonthValue(), beginTime.getDayOfMonth());
```

### DataFlowIssue
Unboxing of `this.config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java

        if (this.config.getNumbers().containsKey(hourStr)) {
            result.beginHour = this.config.getNumbers().get(hourStr);
        } else {
            result.beginHour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `this.config.getNumbers().get(hourStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java

        if (this.config.getNumbers().containsKey(hourStr)) {
            result.endHour = this.config.getNumbers().get(hourStr);
        } else {
            result.endHour = Integer.parseInt(hourStr);
```

### DataFlowIssue
Unboxing of `this.config.getCardinalMap().get(cardinalStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            halfNum = Integer.parseInt(numberStr);
        } else {
            halfNum = this.config.getCardinalMap().get(cardinalStr);
        }

```

### DataFlowIssue
Unboxing of `this.config.getCardinalMap().get(cardinalStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            }
        } else {
            quarterNum = this.config.getCardinalMap().get(cardinalStr);
        }

```

### DataFlowIssue
Unboxing of `this.config.getCardinalMap().get(cardinalStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            ret.setTimex(TimexUtility.generateWeekTimex(targetWeekMonday));
        } else {
            int weekNum = this.config.getCardinalMap().get(cardinalStr);
            targetWeekMonday = DateUtil.thisDate(getFirstThursday(year), DayOfWeek.MONDAY.getValue())
                    .plusDays(Constants.WeekDayCount * (weekNum - 1));
```

### DataFlowIssue
Dereference of `durationUnit` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            String durationStr = match.get().getGroup("duration").value;
            String durationUnit = this.config.getUnitMap().get(durationStr);
            switch (durationUnit) {
                case "W":
                    int diff = Constants.WeekDayCount - ((beginDate.getDayOfWeek().getValue()) == 0 ? Constants.WeekDayCount : beginDate.getDayOfWeek().getValue());
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            year = referenceDate.plusMonths(swift).getYear();
        } else {
            month = this.config.getMonthOfYear().get(monthStr);
            year = config.getDateExtractor().getYearFromText(match.getMatch().get());

```

### DataFlowIssue
Unboxing of `this.config.getWrittenDecades().get(decadeStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            if (!IntegerUtility.canParse(decadeStr)) {
                if (this.config.getWrittenDecades().containsKey(decadeStr)) {
                    decade = this.config.getWrittenDecades().get(decadeStr);
                } else if (this.config.getSpecialDecadeCases().containsKey(decadeStr)) {
                    firstTwoNumOfYear = this.config.getSpecialDecadeCases().get(decadeStr) / 100;
```

### DataFlowIssue
Unboxing of `this.config.getSpecialDecadeCases().get(decadeStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                    decade = this.config.getWrittenDecades().get(decadeStr);
                } else if (this.config.getSpecialDecadeCases().containsKey(decadeStr)) {
                    firstTwoNumOfYear = this.config.getSpecialDecadeCases().get(decadeStr) / 100;
                    decade = this.config.getSpecialDecadeCases().get(decadeStr) % 100;
                    inputCentury = true;
```

### DataFlowIssue
Unboxing of `this.config.getSpecialDecadeCases().get(decadeStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                } else if (this.config.getSpecialDecadeCases().containsKey(decadeStr)) {
                    firstTwoNumOfYear = this.config.getSpecialDecadeCases().get(decadeStr) / 100;
                    decade = this.config.getSpecialDecadeCases().get(decadeStr) % 100;
                    inputCentury = true;
                }
```

### DataFlowIssue
Unboxing of `this.config.getNumbers().get(centuryStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                if (!IntegerUtility.canParse(centuryStr)) {
                    if (this.config.getNumbers().containsKey(centuryStr)) {
                        firstTwoNumOfYear = this.config.getNumbers().get(centuryStr);
                    } else {
                        // handle the case like "one/two thousand", "one/two hundred", etc.
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                swift = this.config.getSwiftYear(trimmedText);

                month = this.config.getMonthOfYear().get(monthStr.toLowerCase());

                if (swift >= -1) {
```

### DataFlowIssue
Unboxing of `this.config.getDayOfMonth().get(days.captures[0].value.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        if (match.getSuccess()) {
            MatchGroup days = match.getMatch().get().getGroup("day");
            beginDay = this.config.getDayOfMonth().get(days.captures[0].value.toLowerCase());
            endDay = this.config.getDayOfMonth().get(days.captures[1].value.toLowerCase());

```

### DataFlowIssue
Unboxing of `this.config.getDayOfMonth().get(days.captures[1].value.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            MatchGroup days = match.getMatch().get().getGroup("day");
            beginDay = this.config.getDayOfMonth().get(days.captures[0].value.toLowerCase());
            endDay = this.config.getDayOfMonth().get(days.captures[1].value.toLowerCase());

            // parse year
```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            String monthStr = match.getMatch().get().getGroup("month").value;
            if (!StringUtility.isNullOrEmpty(monthStr)) {
                month = this.config.getMonthOfYear().get(monthStr.toLowerCase());
            } else {
                monthStr = match.getMatch().get().getGroup("relmonth").value.trim().toLowerCase();
```

### DataFlowIssue
Unboxing of `config.getCardinalMap().get(cardinalStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            cardinal = Constants.MaxWeekOfMonth;
        } else {
            cardinal = config.getCardinalMap().get(cardinalStr);
        }

```

### DataFlowIssue
Unboxing of `this.config.getMonthOfYear().get(monthStr.toLowerCase())` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            String orderStr = match.getMatch().get().getGroup("order").value.toLowerCase();

            int month = this.config.getMonthOfYear().get(monthStr.toLowerCase());

            int year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());
```

### DataFlowIssue
Unboxing of `unitValueMap.get(x)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
    public static String generateCompoundDurationTimex(Map<String, String> unitToTimexComponents, ImmutableMap<String, Long> unitValueMap) {
        List<String> unitList = new ArrayList<>(unitToTimexComponents.keySet());
        unitList.sort((x, y) -> unitValueMap.get(x) < unitValueMap.get(y) ? 1 : -1);
        unitList = unitList.stream().map(t -> unitToTimexComponents.get(t)).collect(Collectors.toList());
        return TimexHelpers.generateCompoundDurationTimex(unitList);
```

### DataFlowIssue
Unboxing of `unitValueMap.get(y)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
    public static String generateCompoundDurationTimex(Map<String, String> unitToTimexComponents, ImmutableMap<String, Long> unitValueMap) {
        List<String> unitList = new ArrayList<>(unitToTimexComponents.keySet());
        unitList.sort((x, y) -> unitValueMap.get(x) < unitValueMap.get(y) ? 1 : -1);
        unitList = unitList.stream().map(t -> unitToTimexComponents.get(t)).collect(Collectors.toList());
        return TimexHelpers.generateCompoundDurationTimex(unitList);
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/AbstractYearExtractor.java`
#### Snippet
```java
                // Exclude pure number like "nineteen", "twenty four"
                if (firstTwoYearNum < 100 && lastTwoYearNum == 0 || firstTwoYearNum < 100 && firstTwoYearNum % 10 == 0 && lastTwoYear.value.trim().split(" ").length == 1) {
                    year = Constants.InvalidYear;
                    return year;
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeExtractor.java`
#### Snippet
```java

        if (this.config.getOptions().match(DateTimeOptions.EnablePreview)) {
            timeErs = mergeTimeZones(timeErs, config.getTimeZoneExtractor().extract(input, reference), input);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java

        if (config.getOptions().match(DateTimeOptions.EnablePreview)) {
            timePeriodErs = TimeZoneUtility.mergeTimeZones(timePeriodErs, config.getTimeZoneExtractor().extract(input, reference), input);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
            }

            ret = AgoLaterUtil.extractorDurationWithBeforeAndAfter(input, er, ret, this.config.getUtilityConfiguration());
        }

```

### DataFlowIssue
Method invocation `getText` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java

            // handle "this morningh at 7am"
            ConditionalMatch innerMatch = RegexExtension.matchBegin(this.config.getTimeOfDayRegex(), er.getText(), true);
            if (innerMatch.getSuccess()) {
                beforeStr = input.substring(0, ((er != null) ? er.getStart() : 0) + innerMatch.getMatch().get().length);
```

### DataFlowIssue
Argument `unitMap.get(currentUnit)` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
                currentUnit = unitMatch.get().getGroup("unit").value;
                totalUnit++;
                if (DurationParsingUtil.isTimeDurationUnit(unitMap.get(currentUnit))) {
                    timeUnit++;
                }
```

### DataFlowIssue
Unboxing of `unitValueMap.get(nextUnitStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
                            valid = true;

                            if (unitValueMap.get(nextUnitStr) < unitValueMap.get(currentUnit)) {
                                currentUnit = nextUnitStr;
                            }
```

### DataFlowIssue
Unboxing of `unitValueMap.get(currentUnit)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
                            valid = true;

                            if (unitValueMap.get(nextUnitStr) < unitValueMap.get(currentUnit)) {
                                currentUnit = nextUnitStr;
                            }
```

### DataFlowIssue
Argument `unitMap.get(nextUnitStr)` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java
                        totalUnit++;

                        if (DurationParsingUtil.isTimeDurationUnit(unitMap.get(nextUnitStr))) {
                            timeUnit++;
                        }
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimePeriodExtractor.java`
#### Snippet
```java

        if (config.getOptions().match(DateTimeOptions.EnablePreview)) {
            ers = TimeZoneUtility.mergeTimeZones(ers, config.getTimeZoneExtractor().extract(input, reference), input);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java
        }

        ret = filterUnspecificDatePeriod(ret, input);

        // Remove common ambiguous cases
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java
        ret = filterAmbiguity(ret, input);

        ret = addMod(ret, input);

        // filtering
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java

        if (this.config.getOptions().match(DateTimeOptions.EnablePreview)) {
            ret = MatchingUtil.posProcessExtractionRecoverSuperfluousWords(ret, superfluousWordMatches, originInput);
        }

```

### DataFlowIssue
Argument `superfluousWordMatches` might be null
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java

        if (this.config.getOptions().match(DateTimeOptions.EnablePreview)) {
            ret = MatchingUtil.posProcessExtractionRecoverSuperfluousWords(ret, superfluousWordMatches, originInput);
        }

```

### DataFlowIssue
Unboxing of `config.getMonthOfYear().getOrDefault(match.get().getGroup("month").value.toLowerCase(), reference.ge...` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                    int endIndex = match.get().index + match.get().length + result.getLength();

                    int month = config.getMonthOfYear().getOrDefault(match.get().getGroup("month").value.toLowerCase(), reference.getMonthValue());

                    Pair<Integer, Integer> startEnd = extendWithWeekdayAndYear(startIndex, endIndex, month, num, text, reference);
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                // Handling cases like 'Thursday the 21st', which both 'Thursday' and '21st' refer to a same date
                matches = RegExpUtility.getMatches(config.getWeekDayAndDayOfMonthRegex(), text);
                isFound = false;
                for (Match matchCase : matches) {
                    if (matchCase != null) {
```

### DataFlowIssue
Unboxing of `config.getDayOfWeek().get(numWeekDayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                            // to see whether they refer to the same week day
                            String extractedWeekDayStr = matchCase.getGroup("weekday").value.toLowerCase();
                            int numWeekDay = config.getDayOfWeek().get(numWeekDayStr);
                            int extractedWeekDay = config.getDayOfWeek().get(extractedWeekDayStr);

```

### DataFlowIssue
Unboxing of `config.getDayOfWeek().get(extractedWeekDayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                            String extractedWeekDayStr = matchCase.getGroup("weekday").value.toLowerCase();
                            int numWeekDay = config.getDayOfWeek().get(numWeekDayStr);
                            int extractedWeekDay = config.getDayOfWeek().get(extractedWeekDayStr);

                            if (date != DateUtil.minValue() && numWeekDay == extractedWeekDay) {
```

### DataFlowIssue
Unboxing of `config.getMonthOfYear().getOrDefault(match.get().getGroup("month").value.toLowerCase(), reference.ge...` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                    int endIndex = result.getStart() + result.getLength() + match.get().length;

                    int month = config.getMonthOfYear().getOrDefault(match.get().getGroup("month").value.toLowerCase(), reference.getMonthValue());

                    Pair<Integer, Integer> startEnd = extendWithWeekdayAndYear(startIndex, endIndex, month, num, text, reference);
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java

            if (match.isPresent()) {
                tokens = AgoLaterUtil.extractorDurationWithBeforeAndAfter(text, duration, tokens, config.getUtilityConfiguration());
            }

```

### DataFlowIssue
Unboxing of `config.getDayOfWeek().get(numWeekDayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java

            if (config.getDayOfWeek().containsKey(numWeekDayStr) && config.getDayOfWeek().containsKey(extractedWeekDayStr)) {
                int weekDay1 = config.getDayOfWeek().get(numWeekDayStr);
                int weekday2 = config.getDayOfWeek().get(extractedWeekDayStr);
                if (date != DateUtil.minValue() && weekDay1 == weekday2) {
```

### DataFlowIssue
Unboxing of `config.getDayOfWeek().get(extractedWeekDayStr)` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
            if (config.getDayOfWeek().containsKey(numWeekDayStr) && config.getDayOfWeek().containsKey(extractedWeekDayStr)) {
                int weekDay1 = config.getDayOfWeek().get(numWeekDayStr);
                int weekday2 = config.getDayOfWeek().get(extractedWeekDayStr);
                if (date != DateUtil.minValue() && weekDay1 == weekday2) {
                    startIndexResult = matchWeekDay.get().index;
```

### DataFlowIssue
Method invocation `getData` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

        // Share the timeZone info
        Map<String, Object> metaDataOrigin = (HashMap<String, Object>)first.getData();
        if (metaDataOrigin != null && metaDataOrigin.containsKey(Constants.SYS_DATETIME_TIMEZONE)) {
            metadata.put(Constants.SYS_DATETIME_TIMEZONE, metaDataOrigin.get(Constants.SYS_DATETIME_TIMEZONE));
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java

        ers = resolveImplicitRelativeDatePeriod(ers, text);
        ers = pruneInvalidImplicitDate(ers);

        return ers;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                throw e;
```

### DataFlowIssue
Switch label `"DT"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        if (timex.getPartOfDay() != null) {
            switch (timex.getPartOfDay()) {
                case "DT":
                    timex = new TimexProperty(TimexCreator.DAYTIME);
                    break;
```

### DataFlowIssue
Switch label `"MO"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
                    timex = new TimexProperty(TimexCreator.DAYTIME);
                    break;
                case "MO":
                    timex = new TimexProperty(TimexCreator.MORNING);
                    break;
```

### DataFlowIssue
Switch label `"AF"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
                    timex = new TimexProperty(TimexCreator.MORNING);
                    break;
                case "AF":
                    timex = new TimexProperty(TimexCreator.AFTERNOON);
                    break;
```

### DataFlowIssue
Switch label `"EV"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
                    timex = new TimexProperty(TimexCreator.AFTERNOON);
                    break;
                case "EV":
                    timex = new TimexProperty(TimexCreator.EVENING);
                    break;
```

### DataFlowIssue
Switch label `"NI"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
                    timex = new TimexProperty(TimexCreator.EVENING);
                    break;
                case "NI":
                    timex = new TimexProperty(TimexCreator.NIGHT);
                    break;
```

### DataFlowIssue
Switch label `"MO"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
    private static Pair<String, String> partOfDayTimeRange(TimexProperty timex) {
        switch (timex.getPartOfDay()) {
            case "MO":
                return Pair.of("08:00:00", "12:00:00");
            case "AF":
```

### DataFlowIssue
Switch label `"AF"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
            case "MO":
                return Pair.of("08:00:00", "12:00:00");
            case "AF":
                return Pair.of("12:00:00", "16:00:00");
            case "EV":
```

### DataFlowIssue
Switch label `"EV"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
            case "AF":
                return Pair.of("12:00:00", "16:00:00");
            case "EV":
                return Pair.of("16:00:00", "20:00:00");
            case "NI":
```

### DataFlowIssue
Switch label `"NI"` is unreachable
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
            case "EV":
                return Pair.of("16:00:00", "20:00:00");
            case "NI":
                return Pair.of("20:00:00", "24:00:00");
            default:
```

### DataFlowIssue
Dereference of `value` may produce `NullPointerException`
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java

            if (mainUnitIsoCode == null || mainUnitIsoCode.isEmpty() || mainUnitIsoCode.startsWith(Constants.FAKE_ISO_CODE_PREFIX)) {
                pr.setValue(new UnitValue(value.number, value.unit));
            } else {
                pr.setValue(new CurrencyUnitValue(value.number, value.unit, mainUnitIsoCode));
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java
                    // If the fraction unit doesn't match the main unit, finish process this group.
                    if (result != null) {
                        result = createCurrencyResult(result, mainUnitIsoCode, numberValue, mainUnitValue);
                        results.add(result);
                        result = null;
```

### DataFlowIssue
Variable is already assigned to this value
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/BaseCurrencyParser.java`
#### Snippet
```java

        if (result != null) {
            result = createCurrencyResult(result, mainUnitIsoCode, numberValue, mainUnitValue);
            results.add(result);
        }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TaskModuleAction.java`
#### Snippet
```java
        }

        data.put("type", "task/fetch");

        try {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
        }
        List<QueryResult> answerList = Arrays.asList(results.getAnswers())
            .stream()
            .filter(answer -> answer.getScore() > options.getScoreThreshold())
            .collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
        // Append appropriate card if missing
        if (!channelSupportsOAuthCard(turnContext.getActivity().getChannelId())) {
            if (!prompt.getAttachments().stream().anyMatch(s -> s.getContent() instanceof SigninCard)) {
                SignInResource signInResource = tokenAdapter
                        .getSignInResource(turnContext, settings.getOAuthAppCredentials(), settings.getConnectionName(),
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java

            }
        } else if (!prompt.getAttachments().stream().anyMatch(s -> s.getContent() instanceof OAuthCard)) {
            ActionTypes cardActionType = ActionTypes.SIGNIN;
            SignInResource signInResource = tokenAdapter
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseCJKNumberParser.java`
#### Snippet
```java

        // check if the parser is configured to support specific types
        if (supportedTypes.isPresent() && !supportedTypes.get().stream().anyMatch(t -> extResult.getType().equals(t))) {
            return null;
        }
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDatePeriodParserConfiguration.java`
#### Snippet
```java
        return (FrenchDateTime.WeekTerms.stream().anyMatch(o -> trimmedText.endsWith(o)) ||
            (FrenchDateTime.WeekTerms.stream().anyMatch(o -> trimmedText.contains(o)) && (nextSuffix || pastSuffix))) &&
            !FrenchDateTime.WeekendTerms.stream().anyMatch(o -> trimmedText.endsWith(o));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimeZoneExtractorConfiguration.java`
#### Snippet
```java
        }

        matcherList.stream().forEach(
            item -> {
                if (!matcherList.contains(item)) {
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishDatePeriodParserConfiguration.java`
#### Snippet
```java
        return (SpanishDateTime.WeekTerms.stream().anyMatch(o -> trimmedText.endsWith(o)) ||
                SpanishDateTime.WeekTerms.stream().anyMatch(o -> trimmedText.contains(o)) && matchRelative.isPresent()) &&
                !SpanishDateTime.WeekendTerms.stream().anyMatch(o -> trimmedText.endsWith(o));
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        // Resolve dates list for date periods
        if (slot.getType().equals(Constants.SYS_DATETIME_DATEPERIOD) && val.getList() != null) {
            list = String.join(",", val.getList().stream().map(o -> DateTimeFormatUtil.luisDate((LocalDateTime)o)).collect(Collectors.toList()));
        }

```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        String currentType =  parserName + "." + Constants.SYS_DATETIME_DATEPERIOD;
        if (slot.getType().equals(currentType)) {
            Stream<String> timexStream = Arrays.asList(slot.getTimexStr().split(",|\\(|\\)")).stream();
            String[] timexComponents = timexStream.filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);

```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/MatchingUtil.java`
#### Snippet
```java
        return StreamSupport.stream(matchResults.spliterator(), false)
                .filter(item -> !StreamSupport.stream(matchResults.spliterator(), false)
                        .anyMatch(ritem -> (ritem.getStart() < item.getStart() && ritem.getEnd() >= item.getEnd()) ||
                                (ritem.getStart() <= item.getStart() && ritem.getEnd() > item.getEnd())))
                .collect(Collectors.toCollection(ArrayList::new));
```

### SimplifyStreamApiCallChains
Can be replaced with 'min()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java

        List<ExtractResult> timeZoneErs = config.getTimeZoneExtractor().extract(afterText);
        Optional<ExtractResult> firstTimeZone = timeZoneErs.stream().sorted(Comparator.comparingInt(t -> t.getStart())).findFirst();

        if (firstTimeZone.isPresent()) {
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java

    private boolean filterErs(ExtractResult simpleDateRange, List<ExtractResult> ers) {
        return !ers.stream().anyMatch(datePoint -> compareErs(simpleDateRange, datePoint));
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDurationExtractor.java`
#### Snippet
```java

    private List<ExtractResult> tagInequalityPrefix(String input, List<ExtractResult> result) {
        Stream<ExtractResult> resultStream = result.stream().map(er -> {
            String beforeString = input.substring(0, er.getStart());
            boolean isInequalityPrefixMatched = false;
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/QueryProcessor.java`
#### Snippet
```java
                delimiters.stream()
                        .map(s -> Pattern.quote(s))
                        .collect(Collectors.toList()));

        return Arrays.stream(input.split(delimitersRegex)).filter(s -> !s.isEmpty())
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/FormatUtility.java`
#### Snippet
```java
                delimiters.stream()
                        .map(s -> Pattern.quote(s))
                        .collect(Collectors.toList()));

        return Arrays.stream(input.split(delimitersRegex)).filter(s -> !s.isEmpty())
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
        }

        suffix = suffix == null ? new String() : suffix;

        Integer firstIllegalCharIndex = StringUtils.indexOfAny(key, new String(ILLEGAL_KEYS));
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbKeyEscape.java`
#### Snippet
```java
     */
    public static String escapeKey(String key) {
        return escapeKey(key, new String(), true);
    }

```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
        ByteArrayOutputStream content = new ByteArrayOutputStream();
        blobClient.download(content);
        String contentString = new String(content.toByteArray());
        try {
            return CompletableFuture.completedFuture(jsonSerializer.readValue(contentString, Activity.class));
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java
                for (BlobItem blobItem : blobPage.getValue()) {
                    // Unescape the Id we escaped when we saved it
                    String conversationId = new String();
                    String lastName = Arrays.stream(blobItem.getName().split("/"))
                        .reduce((first, second) -> second.length() > 0 ? second : first)
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QnARequestContext.java`
#### Snippet
```java

    @JsonProperty("previousUserQuery")
    private String previousUserQuery = new String();

    /**
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerPrompt.java`
#### Snippet
```java

    @JsonProperty("displayText")
    private String displayText = new String();

    @JsonProperty("qna")
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        ArrayList<Object> segments = ObjectPath.tryResolvePath(this, path, false);
        if (segments != null) {
            String root = segments.size() > 1 ? (String) segments.get(1) : new String();

            // Skip _* as first scope, i.e. _adaptive, _tracker, ...
```

### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
    public Boolean containsKey(String key) {
        for (MemoryScope scope : configuration.getMemoryScopes()) {
            if (scope.getName().toUpperCase().equals(key.toUpperCase())) {
                return true;
            }
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java

    private static String dropLeadingZeros(String text) {
        String result = new String();
        String number = new String();
        for (int i = 0; i < text.length(); i++) {
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
    private static String dropLeadingZeros(String text) {
        String result = new String();
        String number = new String();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java

                result += text.charAt(i);
                number = new String();
            } else {
                number += c.toString();
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexValue.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexValue.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexFormat.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexFormat.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexFormat.java`
#### Snippet
```java
        }

        return new String();
    }
}
```

### StringOperationCanBeSimplified
Unnecessary zero argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java

        int closePos = 0;
        int startPos = rawRegex.indexOf("(?<nlbii", 0);

        while (startPos >= 0) {
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
        // - OR -
        // date + duration
        return new String();
    }
}
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
    private static String convertDateRange(TimexProperty timex) {
        String season = (timex.getSeason() != null) ? TimexConstantsEnglish.SEASONS.get(timex.getSeason())
                : new String();

        String year = (timex.getYear() != null) ? timex.getYear().toString() : new String();
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
                : new String();

        String year = (timex.getYear() != null) ? timex.getYear().toString() : new String();

        if (timex.getWeekOfYear() != null) {
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
        String hour = (timex.getHour() == 0) ? "12"
                : (timex.getHour() > 12) ? String.valueOf(timex.getHour() - 12) : String.valueOf(timex.getHour());
        String minute = (timex.getMinute() == 0 && timex.getSecond() == 0) ? new String()
                : Constants.TIME_TIMEX_CONNECTOR
                        + String.format("%1$2s", String.valueOf(timex.getMinute())).replace(' ', '0');
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
                : Constants.TIME_TIMEX_CONNECTOR
                        + String.format("%1$2s", String.valueOf(timex.getMinute())).replace(' ', '0');
        String second = (timex.getSecond() == 0) ? new String()
                : Constants.TIME_TIMEX_CONNECTOR
                        + String.format("%1$2s", String.valueOf(timex.getSecond())).replace(' ', '0');
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java

    private static String convertTimexDurationToString(TimexProperty timex, Boolean includeSingleCount) {
        String result = new String();
        if (timex.getYears() != null) {
            result += TimexConvertEnglish.convertDurationPropertyToString(timex.getYears(), Constants.YEAR_UNIT,
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexRelativeConvertEnglish.java`
#### Snippet
```java
        }

        return new String();
    }
}
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexRelativeConvertEnglish.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
    public static String generateDurationTimex(TimexUnit unit, BigDecimal value) {
        if (value.intValue() == Constants.INVALID_VALUE) {
            return new String();
        }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
        }

        return new String();
    }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/parsers/NumberWithUnitParser.java`
#### Snippet
```java
                    String tmp = halfValue != null ? halfValue.getResolutionStr() : null;
                    if (tmp != null) {
                        resolutionStr += tmp.substring(1, tmp.length());
                    }
                }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'metadataBoost' is still used
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/QnAMakerTraceInfo.java`
#### Snippet
```java
    @Deprecated
    @JsonIgnore
    private Metadata[] metadataBoost;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'createConversation' is still used
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:InnerAssignment")
    @Deprecated
    public CompletableFuture<Void> createConversation(
        String channelId,
        String serviceUrl,
```

### DeprecatedIsStillUsed
Deprecated member 'ActivityHandler' is still used
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
 */
@Deprecated
public class ActivityHandler implements Bot {

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
        String minute = (timex.getMinute() == 0 && timex.getSecond() == 0) ? new String()
                : Constants.TIME_TIMEX_CONNECTOR
                        + String.format("%1$2s", String.valueOf(timex.getMinute())).replace(' ', '0');
        String second = (timex.getSecond() == 0) ? new String()
                : Constants.TIME_TIMEX_CONNECTOR
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
        String second = (timex.getSecond() == 0) ? new String()
                : Constants.TIME_TIMEX_CONNECTOR
                        + String.format("%1$2s", String.valueOf(timex.getSecond())).replace(' ', '0');
        String period = timex.getHour() < 12 ? Constants.AM : Constants.PM;

```

## RuleId[id=ReplaceOnLiteralHasNoEffect]
### ReplaceOnLiteralHasNoEffect
Replacement operation has no effect
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java

    public static final String SuffixBasicOrdinalRegex = "({BasicOrdinalRegex}|({ZeroToNineIntegerRegex}(und|\\s){BasicOrdinalRegex}))"
            .replace("{TensNumberIntegerRegex}", TensNumberIntegerRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{AnIntRegex}", AnIntRegex)
```

### ReplaceOnLiteralHasNoEffect
Replacement operation has no effect
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java

    public static final String HalfYearFrontRegex = "(?<year>((1[5-9]|20)\\d{2})|2100)(\\s*-\\s*|\\s+(the\\s+)?)?h(?<number>[1-2])"
            .replace("{YearRegex}", YearRegex);

    public static final String HalfYearBackRegex = "(the\\s+)?(h(?<number>[1-2])|({HalfYearTermRegex}))(\\s+of|\\s*,\\s*)?\\s+({YearRegex})"
```

### ReplaceOnLiteralHasNoEffect
Replacement operation has no effect
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java

    public static final String TimeRegex8 = ".^"
            .replace("{TimeSuffixFull}", TimeSuffixFull)
            .replace("{BasicTime}", BasicTime)
            .replace("{DescRegex}", DescRegex);
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
            List<String> abandonWords = config.getAmbiguousUnitList();
            for (String abandonWord : abandonWords) {
                if (separateWords.contains(abandonWord)) {
                    separateWords.remove(abandonWord);
                }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/Channel.java`
#### Snippet
```java
     */
    public static boolean hasMessageFeed(String channelId) {
        switch (channelId) {
            case Channels.CORTANA:
                return false;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java

    private static boolean channelRequiresSignInLink(String channelId) {
        switch (channelId) {
            case Channels.MSTEAMS:
                return true;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMakerRecognizer.java`
#### Snippet
```java
        properties.put(
            "Intents",
            !recognizerResult.getIntents().isEmpty()
                ? Serialization.toStringSilent(recognizerResult.getIntents())
                : null
        );
        properties.put(
            "Entities",
            recognizerResult.getEntities() != null
                ? Serialization.toStringSilent(recognizerResult.getEntities())
                : null
        );
        properties.put(
            "AdditionalProperties",
            !recognizerResult.getProperties().isEmpty()
                ? Serialization.toStringSilent(recognizerResult.getProperties())
                : null
        );
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
        if (context.getActivity().getConversation() == null) {
            return Async.completeExceptionally(
                new IllegalArgumentException("BotFrameworkAdapter.GetActivityMembers(): missing conversation")
            );
        }

        if (StringUtils.isEmpty(context.getActivity().getConversation().getId())) {
            return Async.completeExceptionally(
                new IllegalArgumentException("BotFrameworkAdapter.GetActivityMembers(): missing conversation.id")
            );
        }

        ConnectorClient connectorClient = context.getTurnState().get(CONNECTOR_CLIENT_KEY);
        String conversationId = context.getActivity().getConversation().getId();
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
                Activity activity = context.getActivity();
                String appId = getBotAppId(context);
                ConversationReference conversationReference = new ConversationReference();
                conversationReference.setActivityId(activity.getId());
                conversationReference.setBot(activity.getRecipient());
                conversationReference.setChannelId(activity.getChannelId());
                conversationReference.setConversation(activity.getConversation());
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
                conversationReference.setServiceUrl(activity.getServiceUrl());
                conversationReference.setUser(activity.getFrom());

                TokenExchangeState tokenExchangeState = new TokenExchangeState();
                tokenExchangeState.setConnectionName(connectionName);
                tokenExchangeState.setConversation(conversationReference);
                tokenExchangeState.setRelatesTo(activity.getRelatesTo());
                tokenExchangeState.setMsAppId(appId);

                String serializedState = Serialization.toString(tokenExchangeState);
                String state = Base64.getEncoder().encodeToString(serializedState.getBytes(StandardCharsets.UTF_8));
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ConversationState.java`
#### Snippet
```java
        if (turnContext.getActivity() == null) {
            throw new IllegalArgumentException("invalid activity");
        }

        if (StringUtils.isEmpty(turnContext.getActivity().getChannelId())) {
            throw new IllegalArgumentException("invalid activity-missing channelId");
        }

        if (
            turnContext.getActivity().getConversation() == null
                || StringUtils.isEmpty(turnContext.getActivity().getConversation().getId())
        ) {
            throw new IllegalArgumentException("invalid activity-missing Conversation.Id");
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerMiddleware.java`
#### Snippet
```java
        Map<String, String> properties = new HashMap<String, String>();
        properties.put(TelemetryConstants.RECIPIENTIDPROPERTY, activity.getRecipient().getId());
        properties.put(TelemetryConstants.CONVERSATIONIDPROPERTY, activity.getConversation().getId());
        properties.put(
            TelemetryConstants.CONVERSATIONNAMEPROPERTY,
            activity.getConversation().getName()
        );
```

### DuplicatedCode
Duplicated code
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
        turnContext.getActivity().setReplyToId(endOfConversationActivity.getReplyToId());
        turnContext.getActivity().setValue(endOfConversationActivity.getValue());
        turnContext.getActivity().setEntities(endOfConversationActivity.getEntities());
        turnContext.getActivity().setLocale(endOfConversationActivity.getLocale());
        turnContext.getActivity().setLocalTimestamp(endOfConversationActivity.getLocalTimestamp());
        turnContext.getActivity().setTimestamp(endOfConversationActivity.getTimestamp());
        turnContext.getActivity().setChannelData(endOfConversationActivity.getChannelData());
        for (Map.Entry<String, JsonNode> entry : endOfConversationActivity.getProperties().entrySet()) {
            turnContext.getActivity().setProperties(entry.getKey(), entry.getValue());
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ChannelValidation.java`
#### Snippet
```java
        TokenValidationParameters tokenValidationParameters = new TokenValidationParameters();
        tokenValidationParameters.validateIssuer = true;

        ArrayList<String> validIssuers = new ArrayList<String>();
        validIssuers.add(AuthenticationConstants.TO_BOT_FROM_CHANNEL_TOKEN_ISSUER);
        tokenValidationParameters.validIssuers = validIssuers;

        tokenValidationParameters.validateAudience = false;
        tokenValidationParameters.validateLifetime = true;
        tokenValidationParameters.clockSkew = Duration.ofMinutes(AuthenticationConstants.DEFAULT_CLOCKSKEW_MINUTES);
        tokenValidationParameters.requireSignedTokens = true;

        return tokenValidationParameters;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/EnterpriseChannelValidation.java`
#### Snippet
```java
        String appIdFromAudienceClaim =
            identity.claims().get(AuthenticationConstants.AUDIENCE_CLAIM);
        if (StringUtils.isEmpty(appIdFromAudienceClaim)) {
            // Claim is present, but doesn't have a value. Not Authorized.
            result.completeExceptionally(new AuthenticationException("No Audience Claim"));
            return result;
        }

        // Now check that the AppID in the claim set matches
        // what we're looking for. Note that in a multi-tenant bot, this value
        // comes from developer code that may be reaching out to a service, hence the
        // Async validation.

        return credentials.isValidAppId(appIdFromAudienceClaim).thenApply(isValid -> {
            if (!isValid) {
                throw new AuthenticationException(
                    String.format("Invalid AppId passed on token: '%s'.", appIdFromAudienceClaim)
                );
            }

            String serviceUrlClaim =
                identity.claims().get(AuthenticationConstants.SERVICE_URL_CLAIM);
            if (StringUtils.isEmpty(serviceUrl)) {
                throw new AuthenticationException(
                    String.format("Invalid serviceurl passed on token: '%s'.", serviceUrlClaim)
                );
            }

            if (!StringUtils.equals(serviceUrl, serviceUrlClaim)) {
                throw new AuthenticationException(
                    String.format("serviceurl doesn't match claim: '%s'.", serviceUrlClaim)
                );
            }

            return identity;
        });
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConversations.java`
#### Snippet
```java
        return client.restClient()
            .responseBuilderFactory()
            .<ResourceResponse, ErrorResponseException>newInstance(client.serializerAdapter())
            .register(HttpURLConnection.HTTP_OK, new TypeToken<ResourceResponse>() {
            }.getType())
            .register(HttpURLConnection.HTTP_CREATED, new TypeToken<ResourceResponse>() {
            }.getType())
            .register(HttpURLConnection.HTTP_ACCEPTED, new TypeToken<ResourceResponse>() {
            }.getType())
            .registerError(ErrorResponseException.class)
            .build(response);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConversations.java`
#### Snippet
```java
        if (conversationId == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter conversationId is required and cannot be null."
            ));
        }
        if (activityId == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter activityId is required and cannot be null."
            ));
        }
        if (activity == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter activity is required and cannot be null."
            ));
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        if (userId == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter userId is required and cannot be null."
            ));
        }
        if (connectionName == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter connectionName is required and cannot be null."
            ));
        }
        if (channelId == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter channelId is required and cannot be null."
            ));
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
        if (userId == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter userId is required and cannot be null."
            ));
        }
        if (connectionName == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter connectionName is required and cannot be null."
            ));
        }
        if (aadResourceUrls == null) {
            return Async.completeExceptionally(new IllegalArgumentException(
                "Parameter aadResourceUrls is required and cannot be null."
            ));
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
            List<Entry<String, Object>> matches = dict.entrySet().stream()
                .filter(key -> key.getKey().equalsIgnoreCase(property))
                .collect(Collectors.toList());

            if (matches.size() > 0) {
                return matches.get(0).getValue();
            }

            return null;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/choices/ChoiceRecognizers.java`
#### Snippet
```java
                ModelResult<FoundChoice> modelResult = new ModelResult<FoundChoice>();
                modelResult.setStart(match.getStart());
                modelResult.setEnd(match.getEnd());
                modelResult.setTypeName("choice");
                modelResult.setText(match.getText());
                modelResult.setResolution(resolution);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                ResultPair<Integer> result = tryGetValue(trackedPath, Integer.class);
                if (result.result()) {
                    if (counter == null) {
                        counter = getValue(DialogPath.EVENTCOUNTER, 0, Integer.class);
                    }
                    setValue(trackedPath, counter);
                }
                if (value instanceof Map) {
                    final int count = counter;
                    ((Map<String, Object>) value).forEach((key, val) -> {
                        checkChildren(key, val, trackedPath, count);
                    });
                } else if (value instanceof ObjectNode) {
                    ObjectNode node = (ObjectNode) value;
                    Iterator<String> fields = node.fieldNames();

                    while (fields.hasNext()) {
                        String field = fields.next();
                        checkChildren(field, node.findValue(field), trackedPath, counter);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ActivityPrompt.java`
#### Snippet
```java
        if (turnContext == null) {
            return Async.completeExceptionally(new IllegalArgumentException("turnContext cannot be null"));
        }

        if (options == null) {
            return Async.completeExceptionally(new IllegalArgumentException("options cannot be null"));
        }

        if (isRetry && options.getRetryPrompt() != null) {
            return turnContext.sendActivity(options.getRetryPrompt()).thenApply(result -> null);
        } else if (options.getPrompt() != null) {
            return turnContext.sendActivity(options.getPrompt()).thenApply(result -> null);
        }

        return CompletableFuture.completedFuture(null);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/DateTimePrompt.java`
#### Snippet
```java
            String utterance = turnContext.getActivity().getText();
            if (StringUtils.isEmpty(utterance)) {
                return CompletableFuture.completedFuture(result);
            }

            String culture = turnContext.getActivity().getLocale() != null ?  turnContext.getActivity().getLocale()
                             : defaultLocale != null ? defaultLocale : PromptCultureModels.ENGLISH_CULTURE;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDatePeriodParserConfiguration.java`
#### Snippet
```java
        String trimmedText = text.trim().toLowerCase();
        int swift = 0;

        Optional<Match> matchAfterNext = Arrays.stream(RegExpUtility.getMatches(afterNextSuffixRegex, trimmedText)).findFirst();
        Optional<Match> matchNext = Arrays.stream(RegExpUtility.getMatches(nextPrefixRegex, trimmedText)).findFirst();
        Optional<Match> matchPast = Arrays.stream(RegExpUtility.getMatches(previousPrefixRegex, trimmedText)).findFirst();
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishDatePeriodParserConfiguration.java`
#### Snippet
```java
        String trimmedText = text.trim().toLowerCase();
        int swift = -10;

        Optional<Match> matchAfterNext = Arrays.stream(RegExpUtility.getMatches(afterNextSuffixRegex, trimmedText)).findFirst();
        Optional<Match> matchNext = Arrays.stream(RegExpUtility.getMatches(nextPrefixRegex, trimmedText)).findFirst();
        Optional<Match> matchPast = Arrays.stream(RegExpUtility.getMatches(previousPrefixRegex, trimmedText)).findFirst();
        Optional<Match> matchThisPresent = Arrays.stream(RegExpUtility.getMatches(thisPrefixRegex, trimmedText)).findFirst();
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java
            if (index >= 0) {
                String prefix = beforeStr.substring(0, index).trim();
                String durationText = input.substring(duration.getStart(), duration.getStart() + duration.getLength());
                List<ExtractResult> numbersInPrefix = config.getCardinalExtractor().extract(prefix);
                List<ExtractResult> numbersInDuration = config.getCardinalExtractor().extract(durationText);

                // Cases like "2 upcoming days", should be supported here
                // Cases like "2 upcoming 3 days" is invalid, only extract "upcoming 3 days" by default
                if (!numbersInPrefix.isEmpty() && numbersInDuration.isEmpty()) {
                    ExtractResult lastNumber = numbersInPrefix.stream()
                            .sorted(Comparator.comparingInt(x -> x.getStart() + x.getLength()))
                            .reduce((acc, item) -> item).orElse(null);

                    // Prefix should ends with the last number
                    if (lastNumber.getStart() + lastNumber.getLength() == prefix.length()) {
                        results.add(new Token(lastNumber.getStart(), duration.getEnd()));
                    }

                } else {
                    results.add(new Token(index, duration.getEnd()));
                }

                continue;
            }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
        boolean isDecimal = false;
        if (match.index > 1 && (text.charAt(match.index - 1) == ',' ||
                text.charAt(match.index - 1) == '.') && Character.isDigit(text.charAt(match.index - 2)) && Character.isDigit(match.value.charAt(0))) {
            isDecimal = true;
        }
        
        return isDecimal;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimePeriodExtractor.java`
#### Snippet
```java
            for (ExtractResult timeNum : timeNumbers) {
                boolean overlap = false;
                for (ExtractResult er : ers) {
                    if (er.getStart() <= timeNum.getStart() && er.getStart() + er.getLength() >= timeNum.getStart()) {
                        overlap = true;
                    }
                }

                if (!overlap) {
                    ers.add(timeNum);
                }
            }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDatePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        final Matcher matcher = fromRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        final Matcher matcher = FromRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/extractors/FrenchDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        final Matcher matcher = BetweenRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/french/parsers/FrenchDateParserConfiguration.java`
#### Snippet
```java
        int swift = 0;

        Matcher regexMatcher = nextPrefixRegex.matcher(trimmedText);
        if (regexMatcher.find()) {
            swift = 1;
        }

        regexMatcher = previousPrefixRegex.matcher(trimmedText);
        if (regexMatcher.find()) {
            swift = -1;
        }

        return swift;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            int month = referenceDate.getMonthValue();
            int year = referenceDate.getYear();
            String dayStr = match.get().getGroup("DayOfMonth").value.toLowerCase();

            int start = match.get().getGroup("DayOfMonth").index;
            int length = match.get().getGroup("DayOfMonth").length;

            // create a extract comments which content ordinal string of text
            ExtractResult er = new ExtractResult(start, length, dayStr, null, null);

            Object numberParsed = this.config.getNumberParser().parse(er).getValue();
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        List<ExtractResult> er = this.config.getOrdinalExtractor().extract(trimmedText);
        if (er.size() == 0) {
            er = this.config.getIntegerExtractor().extract(trimmedText);
        }

        if (er.size() == 0) {
            return ret;
        }

        Object numberParsed = this.config.getNumberParser().parse(er.get(0)).getValue();
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            int year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());
            if (year == Constants.InvalidYear) {
                int swift = this.config.getSwiftYear(orderStr);
                if (swift < -1) {
                    return ret;
                }
                year = referenceDate.getYear() + swift;
            }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        ret.setFutureValue(inclusiveEndPeriod ?
                new Pair<>(targetWeekMonday, targetWeekMonday.plusDays(Constants.WeekDayCount - 1)) :
                new Pair<>(targetWeekMonday, targetWeekMonday.plusDays(Constants.WeekDayCount)));

        ret.setPastValue(inclusiveEndPeriod ?
                new Pair<>(targetWeekMonday, targetWeekMonday.plusDays(Constants.WeekDayCount - 1)) :
                new Pair<>(targetWeekMonday, targetWeekMonday.plusDays(Constants.WeekDayCount)));

        ret.setSuccess(true);

        return ret;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String timex = TimexUtility.generateDurationTimex(numVal, Constants.TimexBusinessDay, false);
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit.split(" ")[1]);

                result.setTimex(timex);
                result.setFutureValue(timeValue);
                result.setPastValue(timeValue);

                result.setSuccess(true);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                String timex = String.format("P%s%s%c", isLessThanDay(unitStr) ? "T" : "", numStr, unitStr.charAt(0));
                double timeValue = numVal * config.getUnitValueMap().get(srcUnit);

                result.setTimex(timex);
                result.setFutureValue(timeValue);
                result.setPastValue(timeValue);

                result.setSuccess(true);
                return result;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
                hasBefore = true;
                er.setStart(er.getStart() + beforeMatch.getMatch().get().length);
                er.setLength(er.getLength() - beforeMatch.getMatch().get().length);
                er.setText(er.getText().substring(beforeMatch.getMatch().get().length));
                modStr = beforeMatch.getMatch().get().value;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
            if (hasLeft || beginMinute != Constants.InvalidMinute || beginSecond != Constants.InvalidSecond) {
                ExtractResult er = new ExtractResult(
                        time1StartIndex,
                        time1EndIndex - time1StartIndex,
                        text.substring(time1StartIndex, time1EndIndex),
                        Constants.SYS_DATETIME_TIME);

                DateTimeParseResult pr = this.config.getTimeParser().parse(er, referenceTime);
                subDateTimeEntities.add(pr);
            }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
            endTime = endTime.plusHours(Constants.HalfDayHourCount);
            ((DateTimeResolutionResult)pr2.getValue()).setFutureValue(endTime);
            pr2.setTimexStr(String.format("T%s", endTime.getHour()));
            if (endTime.getMinute() > 0) {
                pr2.setTimexStr(String.format("%s:%s", pr2.getTimexStr(), endTime.getMinute()));
            }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDatePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        Matcher matcher = fromRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        Matcher matcher = FromRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimePeriodExtractorConfiguration.java`
#### Snippet
```java
        int index = -1;
        boolean result = false;
        Matcher matcher = BetweenRegex.matcher(text);
        if (matcher.find()) {
            result = true;
            index = matcher.start();
        }

        return new ResultIndex(result, index);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/DateTimeFormatUtil.java`
#### Snippet
```java
        if (timeSpan.toMinutes() % 60 > 0) {
            result = String.format("%s%sM", result, timeSpan.toMinutes() % 60);
        }

        if (timeSpan.get(ChronoUnit.SECONDS) % 60 > 0) {
            result = String.format("%s%sS", result, timeSpan.get(ChronoUnit.SECONDS) % 60);
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        LocalDateTime end = start.plusDays(7);
        TimexProperty value1 = new TimexProperty() {
            {
                setYear(start.getYear());
                setMonth(start.getMonth().getValue());
                setDayOfMonth(start.getDayOfMonth());
            }
        };
        TimexProperty value2 = new TimexProperty() {
            {
                setYear(end.getYear());
                setMonth(end.getMonth().getValue());
                setDayOfMonth(end.getDayOfMonth());
            }
        };
        return Pair.of(value1, value2);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/parsers/EnglishNumberParserConfiguration.java`
#### Snippet
```java
                String[] splitTokens = tokens.get(i).split(Pattern.quote("-"));
                if (splitTokens.length == 2 && getOrdinalNumberMap().containsKey(splitTokens[1])) {
                    words.add(splitTokens[0]);
                    words.add(splitTokens[1]);
                } else {
                    words.add(tokens.get(i));
                }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/english/parsers/EnglishNumberParserConfiguration.java`
#### Snippet
```java
                if (getOrdinalNumberMap().containsKey(tokens.get(i + 2))) {
                    words.add(tokens.get(i));
                    words.add(tokens.get(i + 2));
                } else {
                    words.add(tokens.get(i) + tokens.get(i + 1) + tokens.get(i + 2));
                }

                i += 2;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberExtractor.java`
#### Snippet
```java
                final Pattern key = pair.getKey();
                final Pattern value = pair.getValue();

                for (ExtractResult extractResult : extractResults) {
                    Optional<Match> keyMatch = Arrays.stream(RegExpUtility.getMatches(key, extractResult.getText())).findFirst();
                    if (keyMatch.isPresent()) {
                        final Match[] matches = RegExpUtility.getMatches(value, input);
                        extractResults = extractResults.stream()
                            .filter(er -> Arrays.stream(matches).noneMatch(m -> m.index < er.getStart() + er.getLength() && m.index + m.length > er.getStart()))
                            .collect(Collectors.toCollection(ArrayList::new));
                    }
                }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/french/parsers/FrenchNumberParserConfiguration.java`
#### Snippet
```java
        if (ordinalNumberMap.containsKey(numberStr)) {
            return ordinalNumberMap.get(numberStr);
        }

        if (cardinalNumberMap.containsKey(numberStr)) {
            return cardinalNumberMap.get(numberStr);
        }

        long value = 0;
        long finalValue = 0;
        StringBuilder strBuilder = new StringBuilder();
        int lastGoodChar = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            strBuilder.append(numberStr.charAt(i));

            String tmp = strBuilder.toString();
            if (cardinalNumberMap.containsKey(tmp) && cardinalNumberMap.get(tmp) > value) {
                lastGoodChar = i;
                value = cardinalNumberMap.get(tmp);
            }

            if ((i + 1) == numberStr.length()) {
                finalValue += value;
                strBuilder = new StringBuilder();
                i = lastGoodChar++;
                value = 0;
            }
        }

        return finalValue;
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseIpExtractor.java`
#### Snippet
```java
        HashMap<Match, String> matchSource = new HashMap<>();
        boolean[] matched = new boolean[text.length()];

        // Traverse every match results to see each position in the text is matched or
        // not.
        HashMap<Match[], String> collections = new HashMap<>();
        regexes.forEach((key, value) -> {
            Match[] matches = RegExpUtility.getMatches(key, text);
            collections.put(matches, value);
        });
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseIpExtractor.java`
#### Snippet
```java
                    Function<Match, Boolean> matchFunc = match -> match.index == start && match.length == length;

                    if (matchSource.keySet().stream().anyMatch(o -> matchFunc.apply(o))) {
                        Match srcMatch = (Match)matchSource.keySet().toArray()[0];
                        ExtractResult extResult = new ExtractResult();

                        extResult.setStart(start);
                        extResult.setLength(length);
                        extResult.setText(substr);
                        extResult.setType(this.extractType);
                        extResult.setData(matchSource.getOrDefault(srcMatch, null));
                        result.add(extResult);
                    }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/models/AbstractSequenceModel.java`
#### Snippet
```java
        List<ParseResult> parsedSequences = new ArrayList<ParseResult>();

        try {
            List<ExtractResult> extractResults = extractor.extract(query);

            for (ExtractResult result : extractResults) {
                parsedSequences.add(this.parser.parse(result));
            }
        } catch (Exception ex) {
            // Nothing to do. Exceptions in parse should not break users of recognizers.
            // No result.
        }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/models/GUIDModel.java`
#### Snippet
```java
        List<ParseResult> parsedSequences = new ArrayList<ParseResult>();

        // Preprocess the query
        query = QueryProcessor.preprocess(query);

        try {
            List<ExtractResult> extractResults = extractor.extract(query);

            for (ExtractResult result : extractResults) {
                parsedSequences.add(this.parser.parse(result));
            }
        } catch (Exception ex) {
            // Nothing to do. Exceptions in parse should not break users of recognizers.
            // No result.
        }

        return parsedSequences.stream().map(o -> {
            return new ModelResult(o.getText(), o.getStart(), o.getStart() + o.getLength() - 1, modelTypeName,
                    new TreeMap<String, Object>() {
                        {
                            put(ResolutionKey.Value, o.getResolutionStr());
                            put(ResolutionKey.Score, o.getValue());
                        }
                    });
        }).collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/FormatUtility.java`
#### Snippet
```java
        return query
                .replace('０', '0')
                .replace('１', '1')
                .replace('２', '2')
                .replace('３', '3')
                .replace('４', '4')
                .replace('５', '5')
                .replace('６', '6')
                .replace('７', '7')
                .replace('８', '8')
                .replace('９', '9')
                .replace('：', ':')
                .replace('－', '-')
                .replace('，', ',')
                .replace('／', '/')
                .replace('Ｇ', 'G')
                .replace('Ｍ', 'M')
                .replace('Ｔ', 'T')
                .replace('Ｋ', 'K')
                .replace('ｋ', 'k')
                .replace('．', '.')
                .replace('（', '(')
                .replace('）', ')');
```

### DuplicatedCode
Duplicated code
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/FormatUtility.java`
#### Snippet
```java
        if (query == null) {
            return null;
        }

        String norm = Normalizer.normalize(query, Normalizer.Form.NFD);
        int j = 0;
        char[] out = new char[query.length()];
        for (int i = 0, n = norm.length(); i < n; ++i) {
            char c = norm.charAt(i);
            int type = Character.getType(c);

            if (type != Character.NON_SPACING_MARK) {
                out[j] = c;
                j++;
            }
        }

        return new String(out);
```

### DuplicatedCode
Duplicated code
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotController.java`
#### Snippet
```java
                logger.error("Exception handling message", exception);

                if (exception instanceof CompletionException) {
                    if (exception.getCause() instanceof AuthenticationException) {
                        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
                    } else {
                        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
```

### DuplicatedCode
Duplicated code
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
        .handle((result, exception) -> {
            if (exception == null) {
                if (result != null) {
                    return new ResponseEntity<ResourceResponse>(
                        result,
                        HttpStatus.OK
                    );
                }
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }

            logger.error("Exception handling message", exception);

            if (exception instanceof CompletionException) {
                if (exception.getCause() instanceof AuthenticationException) {
                    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
                } else {
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        });
```

### DuplicatedCode
Duplicated code
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
        .handle((result, exception) -> {
            if (exception == null) {
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }

            logger.error("Exception handling message", exception);

            if (exception instanceof CompletionException) {
                if (exception.getCause() instanceof AuthenticationException) {
                    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
                } else {
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        });
```

### DuplicatedCode
Duplicated code
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
        .handle((result, exception) -> {
            if (exception == null) {
                if (result != null) {
                    return new ResponseEntity<List<ChannelAccount>>(
                        result,
                        HttpStatus.OK
                    );
                }
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }

            logger.error("Exception handling message", exception);

            if (exception instanceof CompletionException) {
                if (exception.getCause() instanceof AuthenticationException) {
                    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
                } else {
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        });
```

### DuplicatedCode
Duplicated code
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
        if (this.getRecipient() == null) {
            reply.setFrom(new ChannelAccount());
        } else {
            reply.setFrom(
                new ChannelAccount(this.getRecipient().getId(), this.getRecipient().getName())
            );
        }

        if (this.getFrom() == null) {
            reply.setRecipient(new ChannelAccount());
        } else {
            reply
                .setRecipient(new ChannelAccount(this.getFrom().getId(), this.getFrom().getName()));
        }

        if (!StringUtils.equalsIgnoreCase(this.getType(), ActivityTypes.CONVERSATION_UPDATE)
            || !StringUtils.equalsIgnoreCase(this.getChannelId(), "directline")
            && !StringUtils.equalsIgnoreCase(this.getChannelId(), "webchat")) {
                reply.replyToId = this.getId();
        } else {
            reply.replyToId = null;
        }

        reply.setServiceUrl(this.getServiceUrl());
        reply.setChannelId(this.getChannelId());
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerMiddleware.java`
#### Snippet
```java
                    properties.put(TelemetryConstants.ATTACHMENTSPROPERTY,
                                   Serialization.toString(activity.getAttachments()));
                } catch (JsonProcessingException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
                    }
                } else if (classOfNumber.getSimpleName().equals("Integer")) {
```

### CatchMayIgnoreException
Empty `catch` block
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
                    }
                } else if (classOfNumber.getSimpleName().equals("Long")) {
```

### CatchMayIgnoreException
Empty `catch` block
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
                    }
                } else if (classOfNumber.getSimpleName().equals("Double")) {
```

### CatchMayIgnoreException
Empty `catch` block
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
                    }
                }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/models/DateTimeModel.java`
#### Snippet
```java
            parsedDateTimes = parser.filterResults(query, parsedDateTimes);

        } catch (Exception e) {
            // Nothing to do. Exceptions in parse should not break users of recognizers.
            // No result.
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsValidator.java`
#### Snippet
```java
     * @param claims  The Map of claims to validate.
     *
     * @return   true if the validation is successful, false if not.
     */
    public abstract CompletableFuture<Void> validateClaims(Map<String, String> claims);
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsValidator.java`
#### Snippet
```java
     * @param claims  The Map of claims to validate.
     *
     * @return   true if the validation is successful, false if not.
     */
    public abstract CompletableFuture<Void> validateClaims(Map<String, String> claims);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AllowedCallersClaimsValidator.java`
#### Snippet
```java
     * @param claims  The Map of claims to validate.
     *
     * @return   true if the validation is successful, false if not.
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AllowedCallersClaimsValidator.java`
#### Snippet
```java
     * @param claims  The Map of claims to validate.
     *
     * @return   true if the validation is successful, false if not.
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/models/FeedbackRecords.java`
#### Snippet
```java
     * Gets the list of feedback records.
     *
     * @return List of {@link FeedbackRecord}.
     */
    public FeedbackRecord[] getRecords() {
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
     *
     * @param body The body for the InvokeResponseException.
     * @return true if this invocation caused this CompletableFuture to transition
     *         to a completed state, else false
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
     * Invoke a new InvokeResponseException with a HTTP 501 code status.
     *
     * @return true if this invocation caused this CompletableFuture to transition
     *         to a completed state, else false
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
     * @param path path to evaluate.
     * @param valueType value for the path.
     * @return true if successful.
     */
    public static <T> T tryGetPathValue(Object obj, String path, Class<T> valueType) {
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
     *              specified key, if the key is found; otherwise, the default value
     *              for the type of the value parameter.
     * @return true if the dialog state manager contains an element with the
     *         specified key;
     */
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/ResourcesGenerator.java`
#### Snippet
```java

    private static ResourceDefinitions Parse(String resourceDefinitionFile) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream(resourceDefinitionFile), "utf-8");
        BufferedReader br = new BufferedReader(reader);

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
        // Read and Parse YAML
        Yaml yaml = new Yaml(constructor);
        Map<String, Object> raw = yaml.load(new InputStreamReader(new FileInputStream(yamlFilePath.toString()), StandardCharsets.UTF_8));

        // Transform
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath.toString()), StandardCharsets.UTF_8));
            writer.write(headerComment);
            writer.write(lineBreak);
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/AdditionalPropertiesDeserializer.java`
#### Snippet
```java
     * @param mapper the object mapper for default deserializations
     */
    protected AdditionalPropertiesDeserializer(Class<?> vc, JsonDeserializer<?> defaultDeserializer, ObjectMapper mapper) {
        super(vc);
        this.defaultDeserializer = defaultDeserializer;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/FlatteningDeserializer.java`
#### Snippet
```java
     * @param mapper the object mapper for default deserializations
     */
    protected FlatteningDeserializer(Class<?> vc, JsonDeserializer<?> defaultDeserializer, ObjectMapper mapper) {
        super(vc);
        this.defaultDeserializer = defaultDeserializer;
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/french/extractors/CardinalExtractor.java`
#### Snippet
```java
        // Add Integer Regexes
        IntegerExtractor intExtract = new IntegerExtractor(placeholder);
        builder.putAll(intExtract.getRegexes());

        // Add Double Regexes
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/german/extractors/CardinalExtractor.java`
#### Snippet
```java
        // Add Integer Regexes
        IntegerExtractor intExtract = new IntegerExtractor(placeholder);
        builder.putAll(intExtract.getRegexes());

        // Add Double Regexes
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/chinese/extractors/NumberExtractor.java`
#### Snippet
```java
        // Add Cardinal
        CardinalExtractor cardExtractChs = new CardinalExtractor(mode);
        builder.putAll(cardExtractChs.getRegexes());

        // Add Fraction
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/chinese/extractors/CardinalExtractor.java`
#### Snippet
```java

        IntegerExtractor intExtractChs = new IntegerExtractor(mode);
        builder.putAll(intExtractChs.getRegexes());

        DoubleExtractor douExtractorChs = new DoubleExtractor();
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/spanish/extractors/CardinalExtractor.java`
#### Snippet
```java
        //Add Integer Regexes
        IntegerExtractor intExtract = new IntegerExtractor(placeholder);
        builder.putAll(intExtract.getRegexes());

        //Add Double Regexes
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/portuguese/extractors/CardinalExtractor.java`
#### Snippet
```java
        // Add Integer Regexes
        IntegerExtractor intExtract = new IntegerExtractor(placeholder);
        builder.putAll(intExtract.getRegexes());

        // Add Double Regexes
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseHolidayExtractor.java`
#### Snippet
```java
    public final List<ExtractResult> extract(String input, LocalDateTime reference) {
        List<Token> tokens = new ArrayList<>();
        tokens.addAll(holidayMatch(input));
        List<ExtractResult> ers = Token.mergeAllTokens(tokens, input, getExtractorName());
        for (ExtractResult er : ers) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDatePeriodExtractor.java`
#### Snippet
```java
        List<Token> tokens = new ArrayList<>();

        tokens.addAll(matchSimpleCases(input));

        List<ExtractResult> simpleCasesResults = Token.mergeAllTokens(tokens, input, getExtractorName());
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
                            logger.error("Read failed: {}", e.toString());
                            return Async.completeExceptionally(new RuntimeException(
                                String.format("Read failed: %s", e.toString())
                            ));
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManager.java`
#### Snippet
```java
                return Async.completeExceptionally(new IllegalStateException(
                    String.format("Unable to get an instance of %s from turnContext.",
                    ConversationState.class.toString())
                ));
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/ResourcesGenerator.java`
#### Snippet
```java
                Path inputPath = FileSystems.getDefault().getPath(ResourcesPath, String.join(File.separator, config.input) + ".yaml");
                Path outputPath = FileSystems.getDefault().getPath(definition.outputPath, config.output + ".java");
                System.out.println(String.format("%s => %s", inputPath.toString(), outputPath.toString()));

                String header = String.join(LineBreak, config.header);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/ResourcesGenerator.java`
#### Snippet
```java
                Path inputPath = FileSystems.getDefault().getPath(ResourcesPath, String.join(File.separator, config.input) + ".yaml");
                Path outputPath = FileSystems.getDefault().getPath(definition.outputPath, config.output + ".java");
                System.out.println(String.format("%s => %s", inputPath.toString(), outputPath.toString()));

                String header = String.join(LineBreak, config.header);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        }

        timexBuilder.append(value.toString());
        timexBuilder.append(TIMEX_UNIT_TO_STRING_MAP.get(unit));
        return timexBuilder.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java

        if (cloned.getId() == null) {
            cloned.setId(String.format("g_%s", UUID.randomUUID().toString()));
        }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TokenStoreItem` may be 'static'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsSSOTokenExchangeMiddleware.java`
#### Snippet
```java
     * Class to store the etag for token exchange.
     */
    private class TokenStoreItem implements StoreItem {

        private String etag;
```

### InnerClassMayBeStatic
Inner class `ValueProperty` may be 'static'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java
     * Helper class.
     */
    final class ValueProperty {
        public static final String CURRENT_QUERY = "currentQuery";
        public static final String QNA_DATA = "qnaData";
```

### InnerClassMayBeStatic
Inner class `InvokeResponseException` may be 'static'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * InvokeResponse Exception.
     */
    protected class InvokeResponseException extends Exception {

        private int statusCode;
```

### InnerClassMayBeStatic
Inner class `ParseTimePeriodResult` may be 'static'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
    }

    private class ParseTimePeriodResult {
        String comments;
        int beginHour;
```

### InnerClassMayBeStatic
Inner class `MergeModifierResult` may be 'static'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseMergedDateTimeExtractor.java`
#### Snippet
```java
    }

    private class MergeModifierResult {
        public final boolean result;
        public final ExtractResult er;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/CollectionFormat.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:linelength")
/**
 * Swagger collection format to use for joining {@link java.util.List} parameters in
 * paths, queries, and headers.
```

### DanglingJavadoc
Dangling Javadoc comment
in `libraries/bot-applicationinsights/src/main/java/com/microsoft/bot/applicationinsights/ApplicationInsightsBotTelemetryClient.java`
#### Snippet
```java
        }

        /**
         * This should be telemetryClient.trackAvailability(telemetry). However, it is
         * not present in TelemetryClient class
```

### DanglingJavadoc
Dangling Javadoc comment
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                String trackedPath = String.format("%s.%s", pathTracker, pathName);
                Integer counter = null;
                /**
                 *
                 */
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexUnit.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public enum TimexUnit {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRelativeConvert.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import com.microsoft.recognizers.datatypes.timex.expression.english.TimexRelativeConvertEnglish;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexValue.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.math.BigDecimal;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexParsing.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.util.HashMap;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/Time.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public class Time {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRange.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public class TimexRange {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimeRange.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public class TimeRange {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConstraintsHelper.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.util.List;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexCreator.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.math.BigDecimal;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/Constants.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public class Constants {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexSet.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

public class TimexSet {
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexProperty.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.math.BigDecimal;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/DateRange.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.time.LocalDateTime;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import com.microsoft.recognizers.text.utilities.RegExpUtility;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexFormat.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.math.BigDecimal;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/Resolution.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.util.ArrayList;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConvert.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import com.microsoft.recognizers.datatypes.timex.expression.english.TimexConvertEnglish;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexInference.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.util.HashSet;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexDateHelpers.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.time.DayOfWeek;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression.english' does not correspond to the file path 'com.microsoft.recognizers.text.expression.english'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConstantsEnglish.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression.english;

import java.util.HashMap;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRangeResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.time.DayOfWeek;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression.english' does not correspond to the file path 'com.microsoft.recognizers.text.expression.english'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexConvertEnglish.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression.english;

import com.microsoft.recognizers.datatypes.timex.expression.Constants;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression.english' does not correspond to the file path 'com.microsoft.recognizers.text.expression.english'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/english/TimexRelativeConvertEnglish.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression.english;

import com.microsoft.recognizers.datatypes.timex.expression.Constants;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import java.math.BigDecimal;
```

### WrongPackageStatement
Package name 'com.microsoft.recognizers.datatypes.timex.expression' does not correspond to the file path 'com.microsoft.recognizers.text.expression'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
// Licensed under the MIT License.

package com.microsoft.recognizers.datatypes.timex.expression;

import com.google.common.collect.Streams;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `diff` declared in one 'switch' branch and used in another
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            switch (durationUnit) {
                case "W":
                    int diff = Constants.WeekDayCount - ((beginDate.getDayOfWeek().getValue()) == 0 ? Constants.WeekDayCount : beginDate.getDayOfWeek().getValue());
                    endDate = beginDate.plusDays(diff);
                    timex = String.format("P%s%s", diff, Constants.TimexDay);
```

## RuleId[id=RegExpDuplicateAlternationBranch]
### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
        this.config = config;

        String singleIntFrac = config.getWordSeparatorToken() + "| -|"
                + getKeyRegex(config.getCardinalNumberMap().keySet()) + "|"
                + getKeyRegex(config.getOrdinalNumberMap().keySet());
```

### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java

        String singleIntFrac = config.getWordSeparatorToken() + "| -|"
                + getKeyRegex(config.getCardinalNumberMap().keySet()) + "|"
                + getKeyRegex(config.getOrdinalNumberMap().keySet());

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentials.java`
#### Snippet
```java
     */
    boolean shouldSetToken(String url) {
        if (StringUtils.isBlank(getAppId()) || getAppId().equals(AuthenticationConstants.ANONYMOUS_SKILL_APPID)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenValidation.java`
#### Snippet
```java
        // [1] = "[Big Long String]"
        String authScheme = parts[0];
        if (!StringUtils.equals(authScheme, "Bearer")) {
            // The scheme MUST be "Bearer"
            return false;
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/SetSpeakMiddleware.java`
#### Snippet
```java
            Document doc = dBuilder.parse(speakText);

            if (doc.getElementsByTagName(tagName).getLength() > 0) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/NumberWithUnitTokenizer.java`
#### Snippet
```java
        // Non-splittable currency units can't be mixed with digits. For example, '$100' or '100$' will be tokenized to '$' and '100',
        // '1$50' will be tokenized to '1', '$', and '50'
        if ((Character.isDigit(curChar) && specialTokenCharacters.contains(preChar)) || (specialTokenCharacters.contains(curChar) && Character.isDigit(preChar))) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseTimeExtractor.java`
#### Snippet
```java
    private boolean isDecimal(Match match, String text) {
        boolean isDecimal = false;
        if (match.index > 1 && (text.charAt(match.index - 1) == ',' ||
                text.charAt(match.index - 1) == '.') && Character.isDigit(text.charAt(match.index - 2)) && Character.isDigit(match.value.charAt(0))) {
            isDecimal = true;
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
    private boolean isDecimal(Match match, String text) {
        boolean isDecimal = false;
        if (match.index > 1 && (text.charAt(match.index - 1) == ',' ||
                text.charAt(match.index - 1) == '.') && Character.isDigit(text.charAt(match.index - 2)) && Character.isDigit(match.value.charAt(0))) {
            isDecimal = true;
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
    private List<ExtractResult> pruneInvalidImplicitDate(List<ExtractResult> ers) {
        ers.removeIf(er -> {
            if (er.getData() != null && er.getType().equals(Constants.SYS_DATETIME_DATE) && er.getData().equals(getExtractorName())) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
        }

        if (this.getChannelData() != null) {
            return true;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'supportedTypes'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
    protected final Set<String> roundNumberSet;

    protected Optional<List<String>> supportedTypes = Optional.empty();

    public void setSupportedTypes(List<String> types) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

    // parse a regex match which includes 'day', 'month' and 'year' (optional) group
    private DateTimeResolutionResult match2Date(Optional<Match> match, LocalDateTime referenceDate, String relativeStr) {

        DateTimeResolutionResult ret = new DateTimeResolutionResult();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/ConditionalMatch.java`
#### Snippet
```java
    private final boolean success;

    public ConditionalMatch(Optional<Match> match, boolean success) {
        this.match = match;
        this.success = success;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'match'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/ConditionalMatch.java`
#### Snippet
```java
public class ConditionalMatch {

    private final Optional<Match> match;
    private final boolean success;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimePeriodExtractor.java`
#### Snippet
```java
    }

    private boolean matchPrefixRegexInSegment(String beforeStr, Optional<Match> match) {
        return match.isPresent() && StringUtility.isNullOrWhiteSpace(beforeStr.substring(match.get().index + match.get().length));
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/ServiceResponseBuilder.java`
#### Snippet
```java
        else {
            String responseContent = responseBody.source().buffer().readUtf8();
            if (responseContent.length() <= 0) {
                return null;
            }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/ResourcesGenerator.java`
#### Snippet
```java

    private static ResourceDefinitions Parse(String resourceDefinitionFile) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream(resourceDefinitionFile), "utf-8");
        BufferedReader br = new BufferedReader(reader);

```

## RuleId[id=NewObjectEquality]
### NewObjectEquality
New object is compared using '=='
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
    private CompletableFuture<String> getToken(AppCredentials appCredentials) {
        // Get token for the skill call
        if (appCredentials == MicrosoftAppCredentials.empty()) {
            return CompletableFuture.completedFuture(null);
        } else {
```

### NewObjectEquality
New object is compared using '!='
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                            int extractedWeekDay = config.getDayOfWeek().get(extractedWeekDayStr);

                            if (date != DateUtil.minValue() && numWeekDay == extractedWeekDay) {
                                tokens.add(new Token(matchCase.index, result.getStart() + result.getLength()));
                                isFound = true;
```

### NewObjectEquality
New object is compared using '!='
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java
                int weekDay1 = config.getDayOfWeek().get(numWeekDayStr);
                int weekday2 = config.getDayOfWeek().get(extractedWeekDayStr);
                if (date != DateUtil.minValue() && weekDay1 == weekday2) {
                    startIndexResult = matchWeekDay.get().index;
                }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ResponseBody' used without 'try'-with-resources statement
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
            throw new ErrorResponseException("getSignInUrl", response);
        }
        return new ServiceResponse<>(response.body().source().buffer().readUtf8(), response);
    }
    /**
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/ServiceResponseBuilder.java`
#### Snippet
```java
        } else if (response.isSuccessful() && responseTypes.size() == 1) {
            return new ServiceResponse<>((T) buildBody(statusCode, responseBody), response);
        } else if (!throwOnGet404 && "GET".equals(response.raw().request().method()) && statusCode == 404) {
            return new ServiceResponse<>(null, response);
        } else {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/HttpRequestUtils.java`
#### Snippet
```java
        try {
            Request request = buildRequest(requestUrl, endpointKey, buildRequestBody(payloadBody));
            response = this.httpClient.newCall(request).execute();
            qnaResponse = mapper.readTree(response.body().string());
            if (!response.isSuccessful()) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
            try {
                Request request = buildRequest(buildRequestBody(utterance));
                Response response = httpClient.newCall(request).execute();
                luisResponse = mapper.readTree(response.body().string());
                if (!response.isSuccessful()) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonContent);
            Request request = buildRequest(activity, toUrl, body, token);
            Response response = httpClient.newCall(request).execute();

            T result = Serialization.getAs(response.body().string(), type);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'str.length() \> 0' covered by subsequent condition 'str.contains(...)'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/FlatteningDeserializer.java`
#### Snippet
```java
     */
    private static boolean containsDot(String str) {
       return str != null && str.length() > 0 && str.contains(".");
    }

```

### ConditionCoveredByFurtherCondition
Condition 'values != null' covered by subsequent condition 'values instanceof HashMap'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
            HashMap<String, String> values = (HashMap<String, String>) turnContext.getActivity().getValue();
            String magicCode = "";
            if (values != null && values instanceof HashMap) {
                magicCode = (String) values.get("state");
            }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java
        String currentType =  parserName + "." + Constants.SYS_DATETIME_DATEPERIOD;
        if (slot.getType().equals(currentType)) {
            Stream<String> timexStream = Arrays.asList(slot.getTimexStr().split(",|\\(|\\)")).stream();
            String[] timexComponents = timexStream.filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    // @TODO move regexes to base resource files
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java

    private static Pattern[] PERIOD_COLLECTION_NAME_PATTERNS = {
            Pattern.compile("^P(?<amount>\\d*\\.?\\d+)(?<dateUnit>Y|M|W|D)$"),
            Pattern.compile("^PT(?<hourAmount>\\d*\\.?\\d+)H(\\d*\\.?\\d+(M|S)){0,2}$"),
            Pattern.compile("^PT(\\d*\\.?\\d+H)?(?<minuteAmount>\\d*\\.?\\d+)M(\\d*\\.?\\d+S)?$"),
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
    private static Pattern[] PERIOD_COLLECTION_NAME_PATTERNS = {
            Pattern.compile("^P(?<amount>\\d*\\.?\\d+)(?<dateUnit>Y|M|W|D)$"),
            Pattern.compile("^PT(?<hourAmount>\\d*\\.?\\d+)H(\\d*\\.?\\d+(M|S)){0,2}$"),
            Pattern.compile("^PT(\\d*\\.?\\d+H)?(?<minuteAmount>\\d*\\.?\\d+)M(\\d*\\.?\\d+S)?$"),
            Pattern.compile("^PT(\\d*\\.?\\d+(H|M)){0,2}(?<secondAmount>\\d*\\.?\\d+)S$"), };
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
            Pattern.compile("^PT(?<hourAmount>\\d*\\.?\\d+)H(\\d*\\.?\\d+(M|S)){0,2}$"),
            Pattern.compile("^PT(\\d*\\.?\\d+H)?(?<minuteAmount>\\d*\\.?\\d+)M(\\d*\\.?\\d+S)?$"),
            Pattern.compile("^PT(\\d*\\.?\\d+(H|M)){0,2}(?<secondAmount>\\d*\\.?\\d+)S$"), };

    private static Map<String, Pattern[]> TIMEX_REGEX = new HashMap<String, Pattern[]>() {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/chinese/parsers/ChineseNumberParserConfiguration.java`
#### Snippet
```java
                    @Override
                    public int compare(String a, String b) {
                        return a.length() > b.length() ? 1 : -1;
                    }
                }) {
```

### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
    public static String generateCompoundDurationTimex(Map<String, String> unitToTimexComponents, ImmutableMap<String, Long> unitValueMap) {
        List<String> unitList = new ArrayList<>(unitToTimexComponents.keySet());
        unitList.sort((x, y) -> unitValueMap.get(x) < unitValueMap.get(y) ? 1 : -1);
        unitList = unitList.stream().map(t -> unitToTimexComponents.get(t)).collect(Collectors.toList());
        return TimexHelpers.generateCompoundDurationTimex(unitList);
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            // Track any path that resolves to a constant path
            ArrayList<Object> resolved = ObjectPath.tryResolvePath(this, tpath);
            String[] segments = resolved.toArray(new String[resolved.size()]);
            if (resolved != null) {
                String npath = String.join("_", segments);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `nodes.next()` to `Map.Entry` is redundant
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                Iterator<Map.Entry<String, JsonNode>> nodes = obj.fields();
                while (nodes.hasNext()) {
                    Map.Entry<String, JsonNode> property = (Map.Entry<String, JsonNode>) nodes.next();
                    String name = normalizeEntity(property.getKey());
                    boolean isArray = property.getValue().isArray();
```

### RedundantCast
Casting `nodes.next()` to `Map.Entry` is redundant
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                Iterator<Map.Entry<String, JsonNode>> nodes = elt.fields();
                while (nodes.hasNext()) {
                    Map.Entry<String, JsonNode> props = (Map.Entry<String, JsonNode>) nodes.next();

                    if (props == null) {
```

### RedundantCast
Casting `nodes.next()` to `Map.Entry` is redundant
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
                    nodes = elt.fields();
                    while (nodes.hasNext()) {
                        Map.Entry<String, JsonNode> tokenProp = (Map.Entry<String, JsonNode>) nodes.next();

                        if (tokenProp.getKey().contains("value")) {
```

### RedundantCast
Casting `ObjectPath.getPathValue(...)` to `QnAMakerDialogOptions` is redundant
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/dialogs/QnAMakerDialog.java`
#### Snippet
```java

            String reply = dc.getContext().getActivity().getText();
            QnAMakerDialogOptions dialogOptions = (QnAMakerDialogOptions) ObjectPath
                .getPathValue(dc.getActiveDialog().getState(), OPTIONS, QnAMakerDialogOptions.class);

```

### RedundantCast
Casting `new DollarPathResolver()` to `PathResolver` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
    public Iterable<PathResolver> getPathResolvers() {
        List<PathResolver> listToReturn = new ArrayList<PathResolver>();
        listToReturn.add((PathResolver) new DollarPathResolver());
        listToReturn.add((PathResolver) new HashPathResolver());
        listToReturn.add((PathResolver) new AtAtPathResolver());
```

### RedundantCast
Casting `new HashPathResolver()` to `PathResolver` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
        List<PathResolver> listToReturn = new ArrayList<PathResolver>();
        listToReturn.add((PathResolver) new DollarPathResolver());
        listToReturn.add((PathResolver) new HashPathResolver());
        listToReturn.add((PathResolver) new AtAtPathResolver());
        listToReturn.add((PathResolver) new AtPathResolver());
```

### RedundantCast
Casting `new AtAtPathResolver()` to `PathResolver` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
        listToReturn.add((PathResolver) new DollarPathResolver());
        listToReturn.add((PathResolver) new HashPathResolver());
        listToReturn.add((PathResolver) new AtAtPathResolver());
        listToReturn.add((PathResolver) new AtPathResolver());
        listToReturn.add((PathResolver) new PercentPathResolver());
```

### RedundantCast
Casting `new AtPathResolver()` to `PathResolver` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
        listToReturn.add((PathResolver) new HashPathResolver());
        listToReturn.add((PathResolver) new AtAtPathResolver());
        listToReturn.add((PathResolver) new AtPathResolver());
        listToReturn.add((PathResolver) new PercentPathResolver());
        return listToReturn;
```

### RedundantCast
Casting `new PercentPathResolver()` to `PathResolver` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogsComponentRegistration.java`
#### Snippet
```java
        listToReturn.add((PathResolver) new AtAtPathResolver());
        listToReturn.add((PathResolver) new AtPathResolver());
        listToReturn.add((PathResolver) new PercentPathResolver());
        return listToReturn;
    }
```

### RedundantCast
Casting `result` to `InspectionSessionsByStatus` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java

        return accessor.get(turnContext, InspectionSessionsByStatus::new).thenCompose(result -> {
            InspectionSessionsByStatus openSessions = (InspectionSessionsByStatus) result;
            openSessions.getAttachedSessions().remove(
                turnContext.getActivity().getConversation().getId()
```

### RedundantCast
Casting `result` to `InspectionSessionsByStatus` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java

        return accessor.get(turnContext, InspectionSessionsByStatus::new).thenCompose(result -> {
            InspectionSessionsByStatus sessions = (InspectionSessionsByStatus) result;
            String sessionId = openCommand(
                sessions,
```

### RedundantCast
Casting `dc.getActiveDialog().getState()` to `Map` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallDialog.java`
#### Snippet
```java
        if (index < steps.size()) {
            // Update persisted step index
            Map<String, Object> state = (Map<String, Object>) dc.getActiveDialog().getState();

            state.put(STEP_INDEX, index);
```

### RedundantCast
Casting `instance.getState()` to `Map` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallDialog.java`
#### Snippet
```java
    public CompletableFuture<Void> endDialog(TurnContext turnContext, DialogInstance instance, DialogReason reason) {
        if (reason == DialogReason.CANCEL_CALLED) {
            HashMap<String, Object> state = new HashMap<String, Object>((Map<String, Object>) instance.getState());

            // Create step context
```

### RedundantCast
Casting `instance.getState()` to `Map` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallDialog.java`
#### Snippet
```java
            getTelemetryClient().trackEvent("WaterfallCancel", properties);
        } else if (reason == DialogReason.END_CALLED) {
            HashMap<String, Object> state = new HashMap<String, Object>((Map<String, Object>) instance.getState());
            String instanceId = (String) state.get(PERSISTED_INSTANCEID);

```

### RedundantCast
Casting `assign(...)` to `T` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/ObjectPath.java`
#### Snippet
```java
     */
    public static <T> T merge(Object startObject, Object overlayObject, Class<T> type) {
        return (T) assign(startObject, overlayObject, type);
    }

```

### RedundantCast
Casting `repromptEvent` to `Activity` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialog.java`
#### Snippet
```java
        // connection Name instanceof not applicable for a RePrompt, as we don't expect
        // as OAuthCard in response.
        return sendToSkill(turnContext, (Activity) repromptEvent, skillConversationId).thenApply(result -> null);
    }

```

### RedundantCast
Casting `value` to `Object` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Float value = Float.parseFloat(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### RedundantCast
Casting `value` to `Object` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Integer value = Integer.parseInt(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### RedundantCast
Casting `value` to `Object` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Long value = Long.parseLong(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### RedundantCast
Casting `value` to `Object` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/NumberPrompt.java`
#### Snippet
```java
                        Double value = Double.parseDouble(text);
                        result.setSucceeded(true);
                        result.setValue((T) (Object) value);

                    } catch (NumberFormatException numberFormatException) {
```

### RedundantCast
Casting `ObjectPath.mapValueTo(...)` to `TypeT` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            }

            instance = (TypeT) ObjectPath.mapValueTo(memory, clsType);

            return new ResultPair<>(true, instance);
```

### RedundantCast
Casting `ObjectPath.mapValueTo(...)` to `TypeT` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
            if (getResult.result()) {
                if (StringUtils.isEmpty(remainingPath.toString())) {
                    instance = (TypeT) ObjectPath.mapValueTo(getResult.getRight(), clsType);
                    return new ResultPair<>(true, instance);
                }
```

### RedundantCast
Casting `ObjectPath.tryGetPathValue(...)` to `TypeT` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
                    return new ResultPair<>(true, instance);
                }
                instance = (TypeT) ObjectPath.tryGetPathValue(getResult.getRight(), remainingPath.toString(), clsType);

                return new ResultPair<>(true, instance);
```

### RedundantCast
Casting `ObjectPath.tryGetPathValue(...)` to `TypeT` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
        }

        instance = (TypeT) ObjectPath.tryGetPathValue(this, path, clsType);

        return new ResultPair<>(instance != null, instance);
```

### RedundantCast
Casting `values.get(...)` to `String` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java
            String magicCode = "";
            if (values != null && values instanceof HashMap) {
                magicCode = (String) values.get("state");
            }

```

### RedundantCast
Casting `(o1, o2) -> {...}` to `Comparator` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberRangeExtractor.java`
#### Snippet
```java

        //        extractNumber = extractNumber.OrderByDescending(num => num.Length).ThenByDescending(num => num.Start).ToList();
        Collections.sort(extractNumber, (Comparator<ExtractResult>)(o1, o2) -> {
            Integer x1 = ((ExtractResult)o1).getLength();
            Integer x2 = ((ExtractResult)o2).getLength();
```

### RedundantCast
Casting `o1` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberRangeExtractor.java`
#### Snippet
```java
        //        extractNumber = extractNumber.OrderByDescending(num => num.Length).ThenByDescending(num => num.Start).ToList();
        Collections.sort(extractNumber, (Comparator<ExtractResult>)(o1, o2) -> {
            Integer x1 = ((ExtractResult)o1).getLength();
            Integer x2 = ((ExtractResult)o2).getLength();
            int scomp = x2.compareTo(x1);
```

### RedundantCast
Casting `o2` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberRangeExtractor.java`
#### Snippet
```java
        Collections.sort(extractNumber, (Comparator<ExtractResult>)(o1, o2) -> {
            Integer x1 = ((ExtractResult)o1).getLength();
            Integer x2 = ((ExtractResult)o2).getLength();
            int scomp = x2.compareTo(x1);

```

### RedundantCast
Casting `o1` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberRangeExtractor.java`
#### Snippet
```java
            }

            x1 = ((ExtractResult)o1).getStart();
            x2 = ((ExtractResult)o2).getStart();
            return x2.compareTo(x1);
```

### RedundantCast
Casting `o2` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/extractors/BaseNumberRangeExtractor.java`
#### Snippet
```java

            x1 = ((ExtractResult)o1).getStart();
            x2 = ((ExtractResult)o2).getStart();
            return x2.compareTo(x1);
        });
```

### RedundantCast
Casting `c` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isChinese(char c) {
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
```

### RedundantCast
Casting `0x4E00` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
    }

```

### RedundantCast
Casting `0x9FBF` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
    }

```

### RedundantCast
Casting `0x3400` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
    }

```

### RedundantCast
Casting `0x4DBF` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
    }

```

### RedundantCast
Casting `c` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isKorean(char c) {
        int uc = (int)c;

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
```

### RedundantCast
Casting `0xAC00` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
```

### RedundantCast
Casting `0xD7AF` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        int uc = (int)c;

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
```

### RedundantCast
Casting `0x1100` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
```

### RedundantCast
Casting `0x11FF` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
```

### RedundantCast
Casting `0x3130` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
    }
```

### RedundantCast
Casting `0x318F` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
    }
```

### RedundantCast
Casting `0xFFB0` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
    }

```

### RedundantCast
Casting `0xFFDC` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
            (uc >= (int)0x1100 && uc <= (int)0x11FF) ||
            (uc >= (int)0x3130 && uc <= (int)0x318F) ||
            (uc >= (int)0xFFB0 && uc <= (int)0xFFDC);
    }

```

### RedundantCast
Casting `c` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isJapanese(char c) {
        int uc = (int)c;

        return (uc >= 0x3040 && uc <= 0x309F) ||
```

### RedundantCast
Casting `0x30FF` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

        return (uc >= 0x3040 && uc <= 0x309F) ||
            (uc >= 0x30A0 && uc <= (int)0x30FF) ||
            (uc >= (int)0xFF66 && uc <= (int)0xFF9D);
    }
```

### RedundantCast
Casting `0xFF66` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        return (uc >= 0x3040 && uc <= 0x309F) ||
            (uc >= 0x30A0 && uc <= (int)0x30FF) ||
            (uc >= (int)0xFF66 && uc <= (int)0xFF9D);
    }

```

### RedundantCast
Casting `0xFF9D` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java
        return (uc >= 0x3040 && uc <= 0x309F) ||
            (uc >= 0x30A0 && uc <= (int)0x30FF) ||
            (uc >= (int)0xFF66 && uc <= (int)0xFF9D);
    }

```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
            Optional<Match> matchYear = Arrays.stream(RegExpUtility.getMatches(this.config.getYearSuffix(), suffix)).findFirst();
            if (matchYear.isPresent()) {
                year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(matchYear.get());
                if (year != Constants.InvalidYear) {
                    ambiguous = false;
```

### RedundantCast
Casting `(c / 4)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int g = year % 19;
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

```

### RedundantCast
Casting `(((8 * c) + 13) / 25)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int g = year % 19;
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

```

### RedundantCast
Casting `(h / 28)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;
```

### RedundantCast
Casting `(h / 28)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;
```

### RedundantCast
Casting `(29 / (h + 1))` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;
```

### RedundantCast
Casting `((21 - g) / 11)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int c = year / 100;
        int h = (c - (int)(c / 4) - (int)(((8 * c) + 13) / 25) + (19 * g) + 15) % 30;
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;
```

### RedundantCast
Casting `(year / 4)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;

        if (day > 31) {
```

### RedundantCast
Casting `(c / 4)` to `int` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/HolidayFunctions.java`
#### Snippet
```java
        int i = h - ((int)(h / 28) * (1 - ((int)(h / 28) * (int)(29 / (h + 1)) * (int)((21 - g) / 11))));

        day = i - ((year + (int)(year / 4) + i + 2 - c + (int)(c / 4)) % 7) + 28;

        if (day > 31) {
```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
        String numberStr = match.getMatch().get().getGroup("number").value;

        int year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());

        if (year == Constants.InvalidYear) {
```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            }

            int year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());
            if (year == Constants.InvalidYear) {
                int swift = this.config.getSwiftYear(text);
```

### RedundantCast
Casting `retNow` to `DateTimeResolutionResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                retNow,
                "",
                value == null ? "" : ((DateTimeResolutionResult)retNow).getTimex());
        }

```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
                // (from|during|in|between)? 2012 (till|to|until|through|-) 2015
                if (!matches[0].value.equals("")) {
                    beginYear = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(matches[0]);
                    if (!(beginYear >= Constants.MinYearNum && beginYear <= Constants.MaxYearNum)) {
                        beginYear = Constants.InvalidYear;
```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

                if (!matches[1].value.equals("")) {
                    endYear = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(matches[1]);
                    if (!(endYear >= Constants.MinYearNum && endYear <= Constants.MaxYearNum)) {
                        endYear = Constants.InvalidYear;
```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

            // parse year
            year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());
            if (year != Constants.InvalidYear) {
                noYear = false;
```

### RedundantCast
Casting `this.config.getDateExtractor()` to `BaseDateExtractor` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java
            int month = this.config.getMonthOfYear().get(monthStr.toLowerCase());

            int year = ((BaseDateExtractor)this.config.getDateExtractor()).getYearFromText(match.getMatch().get());
            if (year == Constants.InvalidYear) {
                int swift = this.config.getSwiftYear(orderStr);
```

### RedundantCast
Casting `o.getValue()` to `String` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/models/AbstractNumberWithUnitModel.java`
#### Snippet
```java
                        resolutionValues.put(ResolutionKey.IsoCurrency, ((CurrencyUnitValue)o.getValue()).isoCurrency);
                    } else {
                        resolutionValues.put(ResolutionKey.Value, (String)o.getValue());
                    }

```

### RedundantCast
Casting `(xo, yo) -> {...}` to `Comparator` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java
        }

        Collections.sort(ers, (Comparator<ExtractResult>)(xo, yo) -> {
            ExtractResult x = (ExtractResult)xo;
            ExtractResult y = (ExtractResult)yo;
```

### RedundantCast
Casting `xo` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java

        Collections.sort(ers, (Comparator<ExtractResult>)(xo, yo) -> {
            ExtractResult x = (ExtractResult)xo;
            ExtractResult y = (ExtractResult)yo;
            return x.getStart() - y.getStart();
```

### RedundantCast
Casting `yo` to `ExtractResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java
        Collections.sort(ers, (Comparator<ExtractResult>)(xo, yo) -> {
            ExtractResult x = (ExtractResult)xo;
            ExtractResult y = (ExtractResult)yo;
            return x.getStart() - y.getStart();
        });
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `libraries/bot-connector/src/main/java/com/microsoft/bot/restclient/serializer/FlatteningDeserializer.java`
#### Snippet
```java
     * @param jsonNode the json node
     * @return the json parser
     * @throws IOException
     */
    private static JsonParser newJsonParserForNode(JsonNode jsonNode) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizer.java`
#### Snippet
```java
     * @param turnContext Context object containing information for a single turn of conversation with a user.
     * @param telemetryProperties Additional properties to be logged to telemetry with the LuisResult event.
     * @return
     */
    private Map<String, String> fillLuisEventProperties(RecognizerResult recognizerResult, TurnContext turnContext,
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/SkypeMentionNormalizeMiddleware.java`
#### Snippet
```java
     * @param context The context object for this turn.
     * @param next    The delegate to call to continue the bot middleware pipeline.
     * @return
     */
    @Override
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
 * A class defining the parameters used in
 * {@link SkillConversationIdFactoryBase#createSkillConversationId(SkillConversationI
 * FactoryOptions,System#getThreading()#getCancellationToken())} .
 */
public class SkillConversationIdFactoryOptions {
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryOptions.java`
#### Snippet
```java
 * A class defining the parameters used in
 * {@link SkillConversationIdFactoryBase#createSkillConversationId(SkillConversationI
 * FactoryOptions,System#getThreading()#getCancellationToken())} .
 */
public class SkillConversationIdFactoryOptions {
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link ConversationReference} created using
     * {@link
     * CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     * Reference(),System#getThreading()#getCancellationToken())} for a
     * skillConversationId.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link ConversationReference} created using
     * {@link
     * CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     * Reference(),System#getThreading()#getCancellationToken())} for a
     * skillConversationId.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     *                             Reference(),System#getThreading()#getCancellationToken())} .
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(Microsoft#getBot()#getSchema()#getConversatio
     *                             Reference(),System#getThreading()#getCancellationToken())} .
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
    /**
     * Gets the {@link SkillConversationReference} used during {@link
     * CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     * reading()#getCancellationToken())} for a skillConversationId.
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * Gets the {@link SkillConversationReference} used during {@link
     * CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     * reading()#getCancellationToken())} for a skillConversationId.
     *
     * @param skillConversationId  A skill conversationId created using {@link
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   The caller's {@link ConversationReference} for a skillConversationId, with originatingAudience.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     *
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactoryBase.java`
#### Snippet
```java
     * @param skillConversationId  A skill conversationId created using {@link
     *                             CreateSkillConversationId(SkillConversationIdFactoryOptions,System#getT
     *                             reading()#getCancellationToken())} .
     *
     * @return   A {@link CompletableFuture} representing the asynchronous operation.
```

### JavadocDeclaration
`@param withDialogs` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java

    /**
     * @param withDialogs
     * @param withTurnContext
     * @param withState
```

### JavadocDeclaration
`@param withTurnContext` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java
    /**
     * @param withDialogs
     * @param withTurnContext
     * @param withState
     */
```

### JavadocDeclaration
`@param withState` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java
     * @param withDialogs
     * @param withTurnContext
     * @param withState
     */
    private void init(DialogSet withDialogs, TurnContext withTurnContext, DialogState withState) {
```

### JavadocDeclaration
`@param reason` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java

    /**
     * @param reason
     * @return CompletableFuture<Void>
     */
```

### JavadocDeclaration
`@param reason` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java

    /**
     * @param reason
     * @param result
     * @return CompletableFuture<Void>
```

### JavadocDeclaration
`@param result` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContext.java`
#### Snippet
```java
    /**
     * @param reason
     * @param result
     * @return CompletableFuture<Void>
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
    /**
     * Invoked when a "tokens/response" event is received when the base behavior of
     * {@link #onEventActivity(TurnContext)} is used.
     *
     * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/teams/TeamsActivityHandler.java`
#### Snippet
```java
     * </p>
     * <p>
     * When the {@link #onEventActivity(TurnContext)} method receives an event with
     * a {@link com.microsoft.bot.schema.Activity#getName()} of `tokens/response`, it calls this method.
     *
```

### JavadocDeclaration
`@param dialogContext` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/BotStateMemoryScope.java`
#### Snippet
```java

    /**
     * @param dialogContext
     * @param force
     * @return A future that represents the
```

### JavadocDeclaration
`@param force` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/BotStateMemoryScope.java`
#### Snippet
```java
    /**
     * @param dialogContext
     * @param force
     * @return A future that represents the
     */
```

### JavadocDeclaration
`@param turnContext` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
     * Helper to determine if we should send an EoC to the parent or not.
     *
     * @param turnContext
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/Dialog.java`
#### Snippet
```java
     *
     * @param turnContext
     * @return
     */
    private static boolean sendEoCToParent(TurnContext turnContext) {
```

### JavadocDeclaration
Illegal character
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @return Options to control the recognition strategy.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @return Options to control the recognition strategy.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @param recognizerOptions Options to control the recognition strategy.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/ChoicePrompt.java`
#### Snippet
```java
    /**
     * Gets or sets additional options passed to the underlying
     * {@link ChoiceRecognizers#recognizeChoices(String, IList{Choice}, FindChoicesOptions)} method.
     *
     * @param recognizerOptions Options to control the recognition strategy.
```

### JavadocDeclaration
Illegal character
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * @return   A task that represents the work queued to execute.
     *
     * When the {@link OnInvokeActivity(TurnContext(InvokeActivity))} method
     * receives an Invoke with a {@link InvokeActivity.name} of
     * `adaptiveCard/action`, it calls this method.
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * before the specific CommandResult-handling logic before the call to the
     * base class
     * {@link ActivityHandler#onCommandResultActivity(TurnContext)}
     * method. Add logic to apply after the specific CommandResult-handling
     * logic after the call to the base class
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * method. Add logic to apply after the specific CommandResult-handling
     * logic after the call to the base class
     * {@link ActivityHandler#onCommandResultActivity(TurnContext)}
     * method. CommandResult activities communicate programmatic information
     * from a client or channel to a bot. The meaning of an CommandResult
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * logic that applies to all comand activities. Add logic to apply before
     * the specific command-handling logic before the call to the base class
     * {@link ActivityHandler#onCommandActivity(TurnContext)} method. Add
     * logic to apply after the specific command-handling logic after the call
     * to the base class
```

### JavadocDeclaration
Javadoc pointing to itself
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
     * logic to apply after the specific command-handling logic after the call
     * to the base class
     * {@link ActivityHandler#onCommandActivity(TurnContext)} method. Command
     * activities communicate programmatic information from a client or channel
     * to a bot. The meaning of an command activity is defined by the
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/BaseNumberParser.java`
#### Snippet
```java
     *
     * @param extractResult input arabic number
     * @return
     */
    protected ParseResult digitNumberParse(ExtractResult extractResult) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `executor` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ExecutorFactory.java`
#### Snippet
```java
    };

    private static ExecutorService executor =
        new ForkJoinPool(Runtime.getRuntime().availableProcessors() * 2, factory, null, false);

```

### FieldMayBeFinal
Field `factory` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/ExecutorFactory.java`
#### Snippet
```java
    }

    private static ForkJoinWorkerThreadFactory factory = new ForkJoinWorkerThreadFactory() {
        @Override
        public ForkJoinWorkerThread newThread(ForkJoinPool pool) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/BotController.java`
#### Snippet
```java
     * 'resources' folder.
     */
    private Logger logger = LoggerFactory.getLogger(BotController.class);

    /**
```

### FieldMayBeFinal
Field `service` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
public class RestBotSignIn implements BotSignIn {
    /** The Retrofit service to perform REST calls. */
    private BotSignInsService service;
    /** The service client containing this operation class. */
    private RestOAuthClient client;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestBotSignIn.java`
#### Snippet
```java
    private BotSignInsService service;
    /** The service client containing this operation class. */
    private RestOAuthClient client;
    /**
     * Initializes an instance of BotSignInsImpl.
```

### FieldMayBeFinal
Field `service` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestAttachments.java`
#### Snippet
```java
public class RestAttachments implements Attachments {
    /** The Retrofit service to perform REST calls. */
    private AttachmentsService service;
    /** The service client containing this operation class. */
    private RestConnectorClient client;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestAttachments.java`
#### Snippet
```java
    private AttachmentsService service;
    /** The service client containing this operation class. */
    private RestConnectorClient client;

    /**
```

### FieldMayBeFinal
Field `service` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestTeamsOperations.java`
#### Snippet
```java
public class RestTeamsOperations implements TeamsOperations {
    /** The Retrofit service to perform REST calls. */
    private TeamsService service;

    /** The service client containing this operation class. */
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestTeamsOperations.java`
#### Snippet
```java

    /** The service client containing this operation class. */
    private RestTeamsConnectorClient client;

    /**
```

### FieldMayBeFinal
Field `service` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
public class RestUserToken implements UserToken {
    /** The Retrofit service to perform REST calls. */
    private UserTokensService service;
    /** The service client containing this operation class. */
    private RestOAuthClient client;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestUserToken.java`
#### Snippet
```java
    private UserTokensService service;
    /** The service client containing this operation class. */
    private RestOAuthClient client;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-integration-spring/src/main/java/com/microsoft/bot/integration/spring/ChannelServiceController.java`
#### Snippet
```java
     * 'resources' folder.
     */
    private Logger logger = LoggerFactory.getLogger(BotController.class);

    private final ChannelServiceHandler handler;
```

### FieldMayBeFinal
Field `authScope` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentials.java`
#### Snippet
```java
    private String appId;
    private String authTenant;
    private String authScope;
    private Authenticator authenticator;

```

### FieldMayBeFinal
Field `credentials` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AppCredentialsInterceptor.java`
#### Snippet
```java
     * The credentials instance to apply to the HTTP client pipeline.
     */
    private AppCredentials credentials;

    /**
```

### FieldMayBeFinal
Field `allowedCallers` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/AllowedCallersClaimsValidator.java`
#### Snippet
```java
public class AllowedCallersClaimsValidator extends ClaimsValidator {

    private List<String> allowedCallers;

    /**
```

### FieldMayBeFinal
Field `claims` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsIdentity.java`
#### Snippet
```java
    private String issuer;
    private String type;
    private Map<String, String> claims;

    private ClaimsIdentity() {
```

### FieldMayBeFinal
Field `issuer` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsIdentity.java`
#### Snippet
```java
 */
public class ClaimsIdentity {
    private String issuer;
    private String type;
    private Map<String, String> claims;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/ClaimsIdentity.java`
#### Snippet
```java
public class ClaimsIdentity {
    private String issuer;
    private String type;
    private Map<String, String> claims;

```

### FieldMayBeFinal
Field `authenticator` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CertificateAppCredentials.java`
#### Snippet
```java
 */
public class CertificateAppCredentials extends AppCredentials {
    private Authenticator authenticator;

    /**
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CachingOpenIdMetadata.java`
#### Snippet
```java
    private String url;
    private long lastUpdated;
    private ObjectMapper mapper;
    private Map<String, Jwk> keyCache = new HashMap<>();
    private final Object sync = new Object();
```

### FieldMayBeFinal
Field `url` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/CachingOpenIdMetadata.java`
#### Snippet
```java
    private static final int CACHE_HOURS = 1;

    private String url;
    private long lastUpdated;
    private ObjectMapper mapper;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConversations.java`
#### Snippet
```java
     * The service client containing this operation class.
     */
    private RestConnectorClient client;

    /**
```

### FieldMayBeFinal
Field `service` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/rest/RestConversations.java`
#### Snippet
```java
     * The Retrofit service to perform REST calls.
     */
    private ConversationsService service;
    /**
     * The service client containing this operation class.
```

### FieldMayBeFinal
Field `tokenValidationParameters` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(CachingOpenIdMetadata.class);

    private TokenValidationParameters tokenValidationParameters;
    private List<String> allowedSigningAlgorithms;
    private OpenIdMetadataResolver openIdMetadataResolver;
```

### FieldMayBeFinal
Field `openIdMetadataResolver` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java
    private TokenValidationParameters tokenValidationParameters;
    private List<String> allowedSigningAlgorithms;
    private OpenIdMetadataResolver openIdMetadataResolver;
    private OpenIdMetadata openIdMetadata;

```

### FieldMayBeFinal
Field `allowedSigningAlgorithms` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java

    private TokenValidationParameters tokenValidationParameters;
    private List<String> allowedSigningAlgorithms;
    private OpenIdMetadataResolver openIdMetadataResolver;
    private OpenIdMetadata openIdMetadata;
```

### FieldMayBeFinal
Field `openIdMetadata` may be 'final'
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/JwtTokenExtractor.java`
#### Snippet
```java
    private List<String> allowedSigningAlgorithms;
    private OpenIdMetadataResolver openIdMetadataResolver;
    private OpenIdMetadata openIdMetadata;

    /**
```

### FieldMayBeFinal
Field `application` may be 'final'
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptions.java`
#### Snippet
```java
     * Luis Application instance.
     */
    private LuisApplication application;

    /**
```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsStorage.java`
#### Snippet
```java
public class BlobsStorage implements Storage {

    private ObjectMapper objectMapper;
    private final BlobContainerClient containerClient;

```

### FieldMayBeFinal
Field `luisRecognizerOptions` may be 'final'
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizer.java`
#### Snippet
```java
     * Luis Recognizer options to query the Luis Service.
     */
    private LuisRecognizerOptions luisRecognizerOptions;

    /**
```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
    private Logger logger = LoggerFactory.getLogger(CosmosDbPartitionedStorage.class);
    private CosmosDbPartitionedStorageOptions cosmosDbStorageOptions;
    private ObjectMapper objectMapper;
    private final Object cacheSync = new Object();
    private DocumentClient client;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
 */
public class CosmosDbPartitionedStorage implements Storage {
    private Logger logger = LoggerFactory.getLogger(CosmosDbPartitionedStorage.class);
    private CosmosDbPartitionedStorageOptions cosmosDbStorageOptions;
    private ObjectMapper objectMapper;
```

### FieldMayBeFinal
Field `cosmosDbStorageOptions` may be 'final'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
public class CosmosDbPartitionedStorage implements Storage {
    private Logger logger = LoggerFactory.getLogger(CosmosDbPartitionedStorage.class);
    private CosmosDbPartitionedStorageOptions cosmosDbStorageOptions;
    private ObjectMapper objectMapper;
    private final Object cacheSync = new Object();
```

### FieldMayBeFinal
Field `client` may be 'final'
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/CosmosDbPartitionedStorage.java`
#### Snippet
```java
    private ObjectMapper objectMapper;
    private final Object cacheSync = new Object();
    private DocumentClient client;
    private Database databaseCache;
    private DocumentCollection collectionCache;
```

### FieldMayBeFinal
Field `endpoint` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/TrainUtils.java`
#### Snippet
```java
 */
public class TrainUtils {
    private QnAMakerEndpoint endpoint;

    /**
```

### FieldMayBeFinal
Field `httpClient` may be 'final'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
    private CredentialProvider credentialProvider;

    private OkHttpClient httpClient;

    /**
```

### FieldMayBeFinal
Field `channelProvider` may be 'final'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
    private static Map<String, AppCredentials> appCredentialMapCache = new HashMap<String, AppCredentials>();;

    private ChannelProvider channelProvider;

    private CredentialProvider credentialProvider;
```

### FieldMayBeFinal
Field `credentialProvider` may be 'final'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
    private ChannelProvider channelProvider;

    private CredentialProvider credentialProvider;

    private OkHttpClient httpClient;
```

### FieldMayBeFinal
Field `appCredentialMapCache` may be 'final'
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/BotFrameworkHttpClient.java`
#### Snippet
```java
public class BotFrameworkHttpClient extends BotFrameworkClient {

    private static Map<String, AppCredentials> appCredentialMapCache = new HashMap<String, AppCredentials>();;

    private ChannelProvider channelProvider;
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/Severity.java`
#### Snippet
```java
    CRITICAL(4);

    private int value;

    /**
```

### FieldMayBeFinal
Field `logPersonalInformation` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
    private GenerateAnswerUtils generateAnswerHelper;
    private TrainUtils activeLearningTrainHelper;
    private Boolean logPersonalInformation;
    @JsonIgnore
    private BotTelemetryClient telemetryClient;
```

### FieldMayBeFinal
Field `telemetryClient` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
    private Boolean logPersonalInformation;
    @JsonIgnore
    private BotTelemetryClient telemetryClient;

    /**
```

### FieldMayBeFinal
Field `endpoint` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
public class QnAMaker implements QnAMakerClient, TelemetryQnAMaker {

    private QnAMakerEndpoint endpoint;

    private GenerateAnswerUtils generateAnswerHelper;
```

### FieldMayBeFinal
Field `activeLearningTrainHelper` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java

    private GenerateAnswerUtils generateAnswerHelper;
    private TrainUtils activeLearningTrainHelper;
    private Boolean logPersonalInformation;
    @JsonIgnore
```

### FieldMayBeFinal
Field `generateAnswerHelper` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/QnAMaker.java`
#### Snippet
```java
    private QnAMakerEndpoint endpoint;

    private GenerateAnswerUtils generateAnswerHelper;
    private TrainUtils activeLearningTrainHelper;
    private Boolean logPersonalInformation;
```

### FieldMayBeFinal
Field `innerTurnContext` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/DelegatingTurnContext.java`
#### Snippet
```java
     * The TurnContext being wrapped.
     */
    private TurnContext innerTurnContext;

    /**
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TraceTranscriptLogger.java`
#### Snippet
```java
     */
    // https://github.com/FasterXML/jackson-databind/wiki/Serialization-Features
    private static ObjectMapper mapper = new ObjectMapper()
        .enable(SerializationFeature.INDENT_OUTPUT)
        .findAndRegisterModules();
```

### FieldMayBeFinal
Field `delay` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ShowTypingMiddleware.java`
#### Snippet
```java
     * Initial delay before sending first typing indicator. Defaults to 500ms.
     */
    private long delay;

    /**
```

### FieldMayBeFinal
Field `period` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ShowTypingMiddleware.java`
#### Snippet
```java
     * 2000ms.
     */
    private long period;

    /**
```

### FieldMayBeFinal
Field `state` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextStateCollection.java`
#### Snippet
```java
     * Map of objects managed by this class.
     */
    private Map<String, Object> state = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
     * The... ummm... logger.
     */
    private Logger logger = LoggerFactory.getLogger(MemoryStorage.class);

    /**
```

### FieldMayBeFinal
Field `memory` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
     * The internal map for storage.
     */
    private Map<String, JsonNode> memory;

    /**
```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryStorage.java`
#### Snippet
```java
     * To/From JSON.
     */
    private ObjectMapper objectMapper;

    /**
```

### FieldMayBeFinal
Field `endpoint` may be 'final'
in `libraries/bot-ai-qna/src/main/java/com/microsoft/bot/ai/qna/utils/GenerateAnswerUtils.java`
#### Snippet
```java
 */
public class GenerateAnswerUtils {
    private QnAMakerEndpoint endpoint;
    private QnAMakerOptions options;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/RecognizerResult.java`
#### Snippet
```java
     * Additional properties.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/IntentScore.java`
#### Snippet
```java
     * Extra properties to include in the results.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `channelProvider` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ChannelServiceHandler.java`
#### Snippet
```java
public class ChannelServiceHandler {

    private ChannelProvider channelProvider;

    private final AuthenticationConfiguration authConfiguration;
```

### FieldMayBeFinal
Field `transcript` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptLoggerMiddleware.java`
#### Snippet
```java
     * Activity queue.
     */
    private Queue<Activity> transcript = new ConcurrentLinkedQueue<Activity>();

    /**
```

### FieldMayBeFinal
Field `transcriptLogger` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TranscriptLoggerMiddleware.java`
#### Snippet
```java
     * The TranscriptLogger to log to.
     */
    private TranscriptLogger transcriptLogger;

    /**
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
         * Object-JsonNode converter.
         */
        private ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

        /**
```

### FieldMayBeFinal
Field `contextServiceKey` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
     * The key for the state cache.
     */
    private String contextServiceKey;

    /**
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
     * The storage layer this state management object will use.
     */
    private Storage storage;

    private ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
```

### FieldMayBeFinal
Field `botState` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
         * The parent BotState.
         */
        private BotState botState;

        /**
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotState.java`
#### Snippet
```java
    private Storage storage;

    private ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    /**
```

### FieldMayBeFinal
Field `channels` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/MemoryTranscriptStore.java`
#### Snippet
```java
     * Map of channel transcripts.
     */
    private HashMap<String, HashMap<String, ArrayList<Activity>>> channels = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `bufferedReplyActivities` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TurnContextImpl.java`
#### Snippet
```java
    private final Activity activity;

    private List<Activity> bufferedReplyActivities = new ArrayList<>();

    /**
```

### FieldMayBeFinal
Field `logPersonalInformation` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerMiddleware.java`
#### Snippet
```java
     * from the user.
     */
    private boolean logPersonalInformation;

    /**
```

### FieldMayBeFinal
Field `telemetryClient` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/TelemetryLoggerMiddleware.java`
#### Snippet
```java
     * event.
     */
    private BotTelemetryClient telemetryClient;

    /**
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillConversationIdFactory.java`
#### Snippet
```java
public class SkillConversationIdFactory extends SkillConversationIdFactoryBase {

    private Storage storage;

    /**
```

### FieldMayBeFinal
Field `conversationReference` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionSession.java`
#### Snippet
```java

public class InspectionSession {
    private ConversationReference conversationReference;
    private Logger logger;
    private ConnectorClient connectorClient;
```

### FieldMayBeFinal
Field `connectorClient` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionSession.java`
#### Snippet
```java
    private ConversationReference conversationReference;
    private Logger logger;
    private ConnectorClient connectorClient;

    public InspectionSession(
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionSession.java`
#### Snippet
```java
public class InspectionSession {
    private ConversationReference conversationReference;
    private Logger logger;
    private ConnectorClient connectorClient;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/skills/SkillHandler.java`
#### Snippet
```java
     * 'resources' folder.
     */
    private Logger logger = LoggerFactory.getLogger(SkillHandler.class);

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InterceptionMiddleware.java`
#### Snippet
```java

public abstract class InterceptionMiddleware implements Middleware {
    private Logger logger;

    static class Intercept {
```

### FieldMayBeFinal
Field `dialogs` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogContainer.java`
#### Snippet
```java
public abstract class DialogContainer extends Dialog {
    @JsonIgnore
    private DialogSet dialogs = new DialogSet();

    /**
```

### FieldMayBeFinal
Field `credentials` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java
    private UserState userState;
    private ConversationState conversationState;
    private MicrosoftAppCredentials credentials;

    public InspectionMiddleware(InspectionState withInspectionState) {
```

### FieldMayBeFinal
Field `userState` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java

    private InspectionState inspectionState;
    private UserState userState;
    private ConversationState conversationState;
    private MicrosoftAppCredentials credentials;
```

### FieldMayBeFinal
Field `conversationState` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java
    private InspectionState inspectionState;
    private UserState userState;
    private ConversationState conversationState;
    private MicrosoftAppCredentials credentials;

```

### FieldMayBeFinal
Field `inspectionState` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java
    private static final String COMMAND = "/INSPECT";

    private InspectionState inspectionState;
    private UserState userState;
    private ConversationState conversationState;
```

### FieldMayBeFinal
Field `dialogState` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogSet.java`
#### Snippet
```java
public class DialogSet {
    private Map<String, Dialog> dialogs = new HashMap<>();
    private StatePropertyAccessor<DialogState> dialogState;
    @JsonIgnore
    private BotTelemetryClient telemetryClient;
```

### FieldMayBeFinal
Field `dialogs` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogSet.java`
#### Snippet
```java
 */
public class DialogSet {
    private Map<String, Dialog> dialogs = new HashMap<>();
    private StatePropertyAccessor<DialogState> dialogState;
    @JsonIgnore
```

### FieldMayBeFinal
Field `values` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
    private Object result;

    private Map<String, Object> values;

    /**
```

### FieldMayBeFinal
Field `reason` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
    private Object options;

    private DialogReason reason;

    private Object result;
```

### FieldMayBeFinal
Field `index` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
    }

    private int index;

    private Object options;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
    private int index;

    private Object options;

    private DialogReason reason;
```

### FieldMayBeFinal
Field `result` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/WaterfallStepContext.java`
#### Snippet
```java
    private DialogReason reason;

    private Object result;

    private Map<String, Object> values;
```

### FieldMayBeFinal
Field `initialTurnState` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/DialogManager.java`
#### Snippet
```java
    }

    private TurnContextStateCollection initialTurnState = new TurnContextStateCollection();

    /**
```

### FieldMayBeFinal
Field `obj` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/ReadOnlyObject.java`
#### Snippet
```java
    private final String notSupported = "This Object is final and cannot be modified.";

    private Object obj;

    /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/scopes/BotStateMemoryScope.java`
#### Snippet
```java
public class BotStateMemoryScope<T extends BotState> extends MemoryScope {

    private Class<T> type;

    /**
```

### FieldMayBeFinal
Field `dialogOptions` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/SkillDialog.java`
#### Snippet
```java
public class SkillDialog extends Dialog {

    private SkillDialogOptions dialogOptions;

    private final String deliverModeStateKey = "deliverymode";
```

### FieldMayBeFinal
Field `authConfiguration` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
     * The authentication configuration.
     */
    private AuthenticationConfiguration authConfiguration;

    /**
```

### FieldMayBeFinal
Field `channelProvider` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
     * The channel provider.
     */
    private ChannelProvider channelProvider;

    /**
```

### FieldMayBeFinal
Field `oAuthClients` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
     * OAuthClient cache.
     */
    private Map<String, OAuthClient> oAuthClients = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `connectorClients` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
     * ConnectorClient cache.
     */
    private Map<String, ConnectorClient> connectorClients = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `appCredentialMap` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
     * AppCredentials dictionary.
     */
    private Map<String, AppCredentials> appCredentialMap = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `state` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidatorContext.java`
#### Snippet
```java
public class PromptValidatorContext<T> {

    private Map<String, Object> state;
    private PromptOptions options;
    private TurnContext context;
```

### FieldMayBeFinal
Field `context` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidatorContext.java`
#### Snippet
```java
    private Map<String, Object> state;
    private PromptOptions options;
    private TurnContext context;
    private PromptRecognizerResult<T> recognized;

```

### FieldMayBeFinal
Field `recognized` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidatorContext.java`
#### Snippet
```java
    private PromptOptions options;
    private TurnContext context;
    private PromptRecognizerResult<T> recognized;

    /**
```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptValidatorContext.java`
#### Snippet
```java

    private Map<String, Object> state;
    private PromptOptions options;
    private TurnContext context;
    private PromptRecognizerResult<T> recognized;
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/memory/DialogStateManager.java`
#### Snippet
```java
    private int version;

    private ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    /**
```

### FieldMayBeFinal
Field `promptCultureModelArray` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/PromptCultureModels.java`
#### Snippet
```java
    };

    private static PromptCultureModel[] promptCultureModelArray =
    {
        BULGARIAN,
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/ModelFactory.java`
#### Snippet
```java

    // cacheKey: (string culture, Type modelType, string modelOptions)
    private static ConcurrentHashMap<Triplet<String, Type, String>, IModel> cache = new ConcurrentHashMap<Triplet<String, Type, String>, IModel>();

    private static final String fallbackCulture = Culture.English;
```

### FieldMayBeFinal
Field `statusCode` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java
    protected class InvokeResponseException extends Exception {

        private int statusCode;
        private Object body;

```

### FieldMayBeFinal
Field `body` may be 'final'
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ActivityHandler.java`
#### Snippet
```java

        private int statusCode;
        private Object body;

        /**
```

### FieldMayBeFinal
Field `config` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/parsers/ChoiceParser.java`
#### Snippet
```java
public class ChoiceParser<T> implements IParser {

    private IChoiceParserConfiguration<T> config;

    public ChoiceParser(IChoiceParserConfiguration<T> config) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/extractors/ChoiceExtractor.java`
#### Snippet
```java
public class ChoiceExtractor implements IExtractor {

    private IChoiceExtractorConfiguration config;

    public ChoiceExtractor(IChoiceExtractorConfiguration config) {
```

### FieldMayBeFinal
Field `dateParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateParser;

    public final IDateTimeParser getDateParser() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `dayTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.HalfMultiplierRegex);

    private static Pattern dayTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.DayTypeRegex);

```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `durationParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser durationParser;

    public final IDateTimeParser getDurationParser() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `halfMultiplierRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.DoubleMultiplierRegex);

    private static Pattern halfMultiplierRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.HalfMultiplierRegex);

```

### FieldMayBeFinal
Field `eachDayRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachDayRegex;

    public final Pattern getEachDayRegex() {
```

### FieldMayBeFinal
Field `eachUnitRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachUnitRegex;

    public final Pattern getEachUnitRegex() {
```

### FieldMayBeFinal
Field `eachPrefixRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachPrefixRegex;

    public final Pattern getEachPrefixRegex() {
```

### FieldMayBeFinal
Field `monthTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.WeekendTypeRegex);

    private static Pattern monthTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.MonthTypeRegex);

```

### FieldMayBeFinal
Field `weekendTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.WeekTypeRegex);

    private static Pattern weekendTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.WeekendTypeRegex);

```

### FieldMayBeFinal
Field `weekTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.DayTypeRegex);

    private static Pattern weekTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.WeekTypeRegex);

```

### FieldMayBeFinal
Field `dateTimeParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateTimeParser;

    public final IDateTimeParser getDateTimeParser() {
```

### FieldMayBeFinal
Field `unitMap` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private ImmutableMap<String, String> unitMap;

    public final ImmutableMap<String, String> getUnitMap() {
```

### FieldMayBeFinal
Field `setWeekDayRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern setWeekDayRegex;

    public final Pattern getSetWeekDayRegex() {
```

### FieldMayBeFinal
Field `doubleMultiplierRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private static Pattern doubleMultiplierRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.DoubleMultiplierRegex);

```

### FieldMayBeFinal
Field `yearTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.QuarterTypeRegex);

    private static Pattern yearTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.YearTypeRegex);

```

### FieldMayBeFinal
Field `dateTimePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateTimePeriodParser;

    public final IDateTimeParser getDateTimePeriodParser() {
```

### FieldMayBeFinal
Field `timeParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
public class EnglishSetParserConfiguration extends BaseOptionsConfiguration implements ISetParserConfiguration {

    private IDateTimeParser timeParser;

    public final IDateTimeParser getTimeParser() {
```

### FieldMayBeFinal
Field `setEachRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern setEachRegex;

    public final Pattern getSetEachRegex() {
```

### FieldMayBeFinal
Field `datePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser datePeriodParser;

    public final IDateTimeParser getDatePeriodParser() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `quarterTypeRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
            RegExpUtility.getSafeRegExp(EnglishDateTime.MonthTypeRegex);

    private static Pattern quarterTypeRegex =
            RegExpUtility.getSafeRegExp(EnglishDateTime.QuarterTypeRegex);

```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `periodicRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern periodicRegex;

    public final Pattern getPeriodicRegex() {
```

### FieldMayBeFinal
Field `timePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/parsers/EnglishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser timePeriodParser;

    public final IDateTimeParser getTimePeriodParser() {
```

### FieldMayBeFinal
Field `timeZoneExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeZoneExtractor;

    public final IDateTimeExtractor getTimeZoneExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `singleTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor singleTimeExtractor;

    public final IDateTimeExtractor getSingleTimeExtractor() {
```

### FieldMayBeFinal
Field `integerExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IExtractor integerExtractor;

    public final IExtractor getIntegerExtractor() {
```

### FieldMayBeFinal
Field `tokenBeforeDate` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
public class EnglishTimePeriodExtractorConfiguration extends BaseOptionsConfiguration implements ITimePeriodExtractorConfiguration {

    private String tokenBeforeDate;

    public final String getTokenBeforeDate() {
```

### FieldMayBeFinal
Field `utilityConfiguration` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeUtilityConfiguration utilityConfiguration;

    public final IDateTimeUtilityConfiguration getUtilityConfiguration() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `setExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor setExtractor;

    public final IDateTimeExtractor getSetExtractor() {
```

### FieldMayBeFinal
Field `dateTimeAltExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeListExtractor dateTimeAltExtractor;

    public final IDateTimeListExtractor getDateTimeAltExtractor() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `integerExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IExtractor integerExtractor;

    public final IExtractor getIntegerExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `timeZoneExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeZoneExtractor timeZoneExtractor;

    public final IDateTimeZoneExtractor getTimeZoneExtractor() {
```

### FieldMayBeFinal
Field `holidayExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/english/extractors/EnglishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor holidayExtractor;

    public final IDateTimeExtractor getHolidayExtractor() {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseSetParser.java`
#### Snippet
```java
    }

    private ISetParserConfiguration config;

    public BaseSetParser(ISetParserConfiguration configuration) {
```

### FieldMayBeFinal
Field `durationParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser durationParser;

    public final IDateTimeParser getDurationParser() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `setWeekDayRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern setWeekDayRegex;

    public final Pattern getSetWeekDayRegex() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateTimeParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateTimeParser;

    public final IDateTimeParser getDateTimeParser() {
```

### FieldMayBeFinal
Field `eachPrefixRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachPrefixRegex;

    public final Pattern getEachPrefixRegex() {
```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `unitMap` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private ImmutableMap<String, String> unitMap;

    public final ImmutableMap<String, String> getUnitMap() {
```

### FieldMayBeFinal
Field `dateParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateParser;

    public final IDateTimeParser getDateParser() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
public class SpanishSetParserConfiguration extends BaseOptionsConfiguration implements ISetParserConfiguration {

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `eachDayRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachDayRegex;

    public final Pattern getEachDayRegex() {
```

### FieldMayBeFinal
Field `setEachRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern setEachRegex;

    public final Pattern getSetEachRegex() {
```

### FieldMayBeFinal
Field `dateTimePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser dateTimePeriodParser;

    public final IDateTimeParser getDateTimePeriodParser() {
```

### FieldMayBeFinal
Field `datePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser datePeriodParser;

    public final IDateTimeParser getDatePeriodParser() {
```

### FieldMayBeFinal
Field `periodicRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern periodicRegex;

    public final Pattern getPeriodicRegex() {
```

### FieldMayBeFinal
Field `eachUnitRegex` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private Pattern eachUnitRegex;

    public final Pattern getEachUnitRegex() {
```

### FieldMayBeFinal
Field `timePeriodParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser timePeriodParser;

    public final IDateTimeParser getTimePeriodParser() {
```

### FieldMayBeFinal
Field `timeParser` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/parsers/SpanishSetParserConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeParser timeParser;

    public final IDateTimeParser getTimeParser() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateTimeExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishSetExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `dateTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimeExtractor;

    public final IDateTimeExtractor getDateTimeExtractor() {
```

### FieldMayBeFinal
Field `timeZoneExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeZoneExtractor timeZoneExtractor;

    public final IDateTimeZoneExtractor getTimeZoneExtractor() {
```

### FieldMayBeFinal
Field `setExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor setExtractor;

    public final IDateTimeExtractor getSetExtractor() {
```

### FieldMayBeFinal
Field `timePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePeriodExtractor;

    public final IDateTimeExtractor getTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `datePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor datePeriodExtractor;

    public final IDateTimeExtractor getDatePeriodExtractor() {
```

### FieldMayBeFinal
Field `dateExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor dateExtractor;

    public final IDateExtractor getDateExtractor() {
```

### FieldMayBeFinal
Field `integerExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IExtractor integerExtractor;

    public final IExtractor getIntegerExtractor() {
```

### FieldMayBeFinal
Field `holidayExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor holidayExtractor;

    public final IDateTimeExtractor getHolidayExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `dateTimeAltExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeListExtractor dateTimeAltExtractor;

    public final IDateTimeListExtractor getDateTimeAltExtractor() {
```

### FieldMayBeFinal
Field `dateTimePeriodExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor dateTimePeriodExtractor;

    public final IDateTimeExtractor getDateTimePeriodExtractor() {
```

### FieldMayBeFinal
Field `timeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishMergedExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeExtractor;

    public final IDateTimeExtractor getTimeExtractor() {
```

### FieldMayBeFinal
Field `timeZoneExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timeZoneExtractor;

    public final IDateTimeExtractor getTimeZoneExtractor() {
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    public final IDateTimeExtractor getDurationExtractor() {
```

### FieldMayBeFinal
Field `integerExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IExtractor integerExtractor;

    public final IExtractor getIntegerExtractor() {
```

### FieldMayBeFinal
Field `tokenBeforeDate` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
public class SpanishTimePeriodExtractorConfiguration extends BaseOptionsConfiguration implements ITimePeriodExtractorConfiguration {

    private String tokenBeforeDate;

    public final String getTokenBeforeDate() {
```

### FieldMayBeFinal
Field `utilityConfiguration` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeUtilityConfiguration utilityConfiguration;

    public final IDateTimeUtilityConfiguration getUtilityConfiguration() {
```

### FieldMayBeFinal
Field `singleTimeExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishTimePeriodExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor singleTimeExtractor;

    public final IDateTimeExtractor getSingleTimeExtractor() {
```

### FieldMayBeFinal
Field `datePointExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateExtractor datePointExtractor;

    @Override
```

### FieldMayBeFinal
Field `utilityConfiguration` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeUtilityConfiguration utilityConfiguration;

    @Override
```

### FieldMayBeFinal
Field `durationExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor durationExtractor;

    @Override
```

### FieldMayBeFinal
Field `timePointExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IDateTimeExtractor timePointExtractor;

    @Override
```

### FieldMayBeFinal
Field `integerExtractor` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/spanish/extractors/SpanishDateTimeExtractorConfiguration.java`
#### Snippet
```java
    }

    private IExtractor integerExtractor;

    @Override
```

### FieldMayBeFinal
Field `inclusiveEndPeriod` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

    private static final String parserName = Constants.SYS_DATETIME_DATEPERIOD; //"DatePeriod";
    private static boolean inclusiveEndPeriod = false;

    private final IDatePeriodParserConfiguration config;
```

### FieldMayBeFinal
Field `superfluousWordMatches` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/config/ProcessedSuperfluousWords.java`
#### Snippet
```java
public class ProcessedSuperfluousWords {
    private String text;
    private Iterable<MatchResult<String>> superfluousWordMatches;

    public ProcessedSuperfluousWords(String text, Iterable<MatchResult<String>> superfluousWordMatches) {
```

### FieldMayBeFinal
Field `text` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/config/ProcessedSuperfluousWords.java`
#### Snippet
```java

public class ProcessedSuperfluousWords {
    private String text;
    private Iterable<MatchResult<String>> superfluousWordMatches;

```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/config/URLConfiguration.java`
#### Snippet
```java

public class URLConfiguration implements ISequenceConfiguration {
    private SequenceOptions options;
    private Pattern ipUrlRegex;
    private Pattern urlRegex;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/config/IpConfiguration.java`
#### Snippet
```java

public class IpConfiguration implements ISequenceConfiguration {
    private SequenceOptions options;
    private Pattern ipv4Regex;
    private Pattern ipv6Regex;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/config/BaseSequenceConfiguration.java`
#### Snippet
```java

public class BaseSequenceConfiguration implements ISequenceConfiguration {
    private SequenceOptions options;

    public BaseSequenceConfiguration(SequenceOptions options) {
```

### FieldMayBeFinal
Field `options` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/config/PhoneNumberConfiguration.java`
#### Snippet
```java

public class PhoneNumberConfiguration implements ISequenceConfiguration {
    private SequenceOptions options;
    private Pattern falsePositivePrefixRegex;
    private String wordBoundariesRegex;
```

### FieldMayBeFinal
Field `config` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/EmailParser.java`
#### Snippet
```java

public class EmailParser extends BaseSequenceParser {
    private BaseSequenceConfiguration config;

    public EmailParser(BaseSequenceConfiguration config) {
```

### FieldMayBeFinal
Field `BASE_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
```

### FieldMayBeFinal
Field `PURE_DIGIT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";

```

### FieldMayBeFinal
Field `SCORE_LOWER_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
public class GUIDParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
```

### FieldMayBeFinal
Field `PURE_DIGIT_PENALTY` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";
```

### FieldMayBeFinal
Field `SCORE_UPPER_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java

public class GUIDParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
```

### FieldMayBeFinal
Field `FORMAT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String FORMAT_REGEX = "-";

    private static final Pattern GUID_ELEMENT_REGEX = Pattern.compile(BaseGUID.GUIDRegexElement);
```

### FieldMayBeFinal
Field `NO_FORMAT_PENALTY` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
    private static String PURE_DIGIT_REGEX = "^\\d*$";
```

### FieldMayBeFinal
Field `NO_BOUNDARY_PENALTY` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/GUIDParser.java`
#### Snippet
```java
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 100d;
    private static Double NO_BOUNDARY_PENALTY = 10d;
    private static Double NO_FORMAT_PENALTY = 10d;
    private static Double PURE_DIGIT_PENALTY = 15d;
```

### FieldMayBeFinal
Field `PURE_DIGIT_LENGTH_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;

    // @TODO move regexes to base resource files
```

### FieldMayBeFinal
Field `TYPICAL_FORMAT_DEDUCTION_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
```

### FieldMayBeFinal
Field `CONTINUE_DIGIT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";

```

### FieldMayBeFinal
Field `PHONE_NUMBER_LENGTH_BASE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;

```

### FieldMayBeFinal
Field `TAIL_SAME_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
    private static Integer PURE_DIGIT_LENGTH_LIMIT = 11;
```

### FieldMayBeFinal
Field `TAIL_SAME_DEDUCTION_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
```

### FieldMayBeFinal
Field `BASE_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
```

### FieldMayBeFinal
Field `TAIL_SAME_DIGIT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
```

### FieldMayBeFinal
Field `CONTINUE_DIGIT_DEDUCTION_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
```

### FieldMayBeFinal
Field `CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
```

### FieldMayBeFinal
Field `COMPLETE_BRACKET_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java

    // @TODO move regexes to base resource files
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
```

### FieldMayBeFinal
Field `PURE_DIGIT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";
```

### FieldMayBeFinal
Field `WRONG_FORMAT_DEDUCTION_SCORE` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double TAIL_SAME_DEDUCTION_SCORE = 10d;
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
```

### FieldMayBeFinal
Field `AREA_CODE_AWARD` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
```

### FieldMayBeFinal
Field `DIGIT_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static String PURE_DIGIT_REGEX = "^\\d*$";
    private static String CONTINUE_DIGIT_REGEX = "\\d{5}\\d*";
    private static String DIGIT_REGEX = "\\d";

    private static final Pattern COUNTRY_CODE_REGEX = Pattern.compile(BasePhoneNumbers.CountryCodeRegex);
```

### FieldMayBeFinal
Field `MAX_LENGTH_AWARD_NUM` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
    private static Integer PHONE_NUMBER_LENGTH_BASE = 8;
```

### FieldMayBeFinal
Field `SCORE_LOWER_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
public class PhoneNumberParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
```

### FieldMayBeFinal
Field `FORMATTED_AWARD` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
```

### FieldMayBeFinal
Field `SINGLE_BRACKER_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    // @TODO move regexes to base resource files
    private static String COMPLETE_BRACKET_REGEX = "\\(.*\\)";
    private static String SINGLE_BRACKER_REGEX = "\\(|\\)";
    private static String TAIL_SAME_DIGIT_REGEX = "([\\d])\\1{2,10}$";
    private static String PURE_DIGIT_REGEX = "^\\d*$";
```

### FieldMayBeFinal
Field `MAX_FORMAT_INDICATOR_NUM` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double CONTINUE_FORMAT_INDICATOR_DEDUCTION_SCORE = 20d;
    private static Double WRONG_FORMAT_DEDUCTION_SCORE = 20d;
    private static Integer MAX_FORMAT_INDICATOR_NUM = 3;
    private static Integer MAX_LENGTH_AWARD_NUM = 3;
    private static Integer TAIL_SAME_LIMIT = 2;
```

### FieldMayBeFinal
Field `SCORE_UPPER_LIMIT` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java

public class PhoneNumberParser extends BaseSequenceParser {
    private static Double SCORE_UPPER_LIMIT = 100d;
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
```

### FieldMayBeFinal
Field `LENGTH_AWARD` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
    private static Double LENGTH_AWARD = 10d;
    private static Double TYPICAL_FORMAT_DEDUCTION_SCORE = 40d;
    private static Double CONTINUE_DIGIT_DEDUCTION_SCORE = 10d;
```

### FieldMayBeFinal
Field `COUNTRY_CODE_AWARD` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/english/parsers/PhoneNumberParser.java`
#### Snippet
```java
    private static Double SCORE_LOWER_LIMIT = 0d;
    private static Double BASE_SCORE = 30d;
    private static Double COUNTRY_CODE_AWARD = 40d;
    private static Double AREA_CODE_AWARD = 30d;
    private static Double FORMATTED_AWARD = 20d;
```

### FieldMayBeFinal
Field `tldMatcher` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
public class BaseURLExtractor extends BaseSequenceExtractor {
    private final URLConfiguration config;
    private StringMatcher tldMatcher;
    private Pattern ambiguousTimeTerm;

```

### FieldMayBeFinal
Field `ambiguousTimeTerm` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
    private final URLConfiguration config;
    private StringMatcher tldMatcher;
    private Pattern ambiguousTimeTerm;

    protected final String extractType = Constants.SYS_URL;
```

### FieldMayBeFinal
Field `params` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/ParamsRegexWriter.java`
#### Snippet
```java

    private final String name;
    private ParamsRegex params;

    public ParamsRegexWriter(String name, ParamsRegex params) {
```

### FieldMayBeFinal
Field `def` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/SimpleRegexWriter.java`
#### Snippet
```java

    private String name;
    private SimpleRegex def;

    public SimpleRegexWriter(String name, SimpleRegex def) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/writters/SimpleRegexWriter.java`
#### Snippet
```java
public class SimpleRegexWriter implements ICodeWriter {

    private String name;
    private SimpleRegex def;

```

### FieldMayBeFinal
Field `config` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
    private static List<Character> SPECIAL_BOUNDARY_MARKERS = BasePhoneNumbers.SpecialBoundaryMarkers;

    private PhoneNumberConfiguration config;

    protected String extractType = Constants.SYS_PHONE_NUMBER;
```

### FieldMayBeFinal
Field `SPECIAL_BOUNDARY_MARKERS` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
    private static final Pattern SSN_FILTER_REGEX = Pattern.compile(BasePhoneNumbers.SSNFilterRegex);

    private static List<Character> SPECIAL_BOUNDARY_MARKERS = BasePhoneNumbers.SpecialBoundaryMarkers;

    private PhoneNumberConfiguration config;
```

### FieldMayBeFinal
Field `PERIOD_COLLECTION_NAME_PATTERNS` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
            Pattern.compile("^T(?<partOfDay>DT|NI|MO|AF|EV)$") };

    private static Pattern[] PERIOD_COLLECTION_NAME_PATTERNS = {
            Pattern.compile("^P(?<amount>\\d*\\.?\\d+)(?<dateUnit>Y|M|W|D)$"),
            Pattern.compile("^PT(?<hourAmount>\\d*\\.?\\d+)H(\\d*\\.?\\d+(M|S)){0,2}$"),
```

### FieldMayBeFinal
Field `TIMEX_REGEX` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
            Pattern.compile("^PT(\\d*\\.?\\d+(H|M)){0,2}(?<secondAmount>\\d*\\.?\\d+)S$"), };

    private static Map<String, Pattern[]> TIMEX_REGEX = new HashMap<String, Pattern[]>() {
        {
            put(DATE_COLLECTION_NAME, DATE_COLLECTION_NAME_PATTERNS);
```

### FieldMayBeFinal
Field `DATE_COLLECTION_NAME_PATTERNS` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
    private static final String PERIOD_COLLECTION_NAME = "period";

    private static Pattern[] DATE_COLLECTION_NAME_PATTERNS = {
            // date
            Pattern.compile("^(XXXX|(?<year>\\d\\d\\d\\d))-(?<month>\\d\\d)(-(?<dayOfMonth>\\d\\d))?"),
```

### FieldMayBeFinal
Field `TIME_COLLECTION_NAME_PATTERNS` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java
            Pattern.compile("^(XXXX|(?<year>\\d\\d\\d\\d))-W(?<weekOfYear>\\d\\d)(-(?<dayOfWeek>\\d)|-(?<weekend>WE))?"), };

    private static Pattern[] TIME_COLLECTION_NAME_PATTERNS = {
            // time
            Pattern.compile("T(?<hour>\\d\\d)Z?$"), Pattern.compile("T(?<hour>\\d\\d):(?<minute>\\d\\d)Z?$"),
```

### FieldMayBeFinal
Field `values` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/Resolution.java`
#### Snippet
```java

public class Resolution {
    private List<Entry> values;

    public List<Entry> getValues() {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/french/extractors/FrenchNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected FrenchNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/german/extractors/GermanNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected GermanNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/chinese/extractors/ChineseNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected ChineseNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/english/extractors/EnglishNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected EnglishNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/spanish/extractors/SpanishNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected SpanishNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `ambiguityFiltersDict` may be 'final'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/portuguese/extractors/PortugueseNumberWithUnitExtractorConfiguration.java`
#### Snippet
```java
    private final IExtractor unitNumExtractor;
    private final Pattern compoundUnitConnectorRegex;
    private Map<Pattern, Pattern> ambiguityFiltersDict;

    protected PortugueseNumberWithUnitExtractorConfiguration(CultureInfo cultureInfo) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InputHints.java`
#### Snippet
```java
     * The actual serialized value for a InputHints instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/EndOfConversationCodes.java`
#### Snippet
```java
     * The actual serialized value for a EndOfConversationCodes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/SemanticActionStates.java`
#### Snippet
```java
     * The actual serialized value for a SemanticActionStates instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActivityImportance.java`
#### Snippet
```java
     * The actual serialized value for a ActivityImportance instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/DeliveryModes.java`
#### Snippet
```java
     * The actual serialized value for a DeliveryModes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/InstallationUpdateActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a InstallationUpdateActionTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ConversationAccount.java`
#### Snippet
```java
     * object. This allows extensibility while maintaining the object.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Entity.java`
#### Snippet
```java
    }

    private HashMap<String, JsonNode> properties = new HashMap<String, JsonNode>();

    @JsonProperty(value = "type")
```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Entity.java`
#### Snippet
```java
 */
public class Entity implements EntitySerialization {
    private static ObjectMapper objectMapper;

    static {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a ActionTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/TextFormatTypes.java`
#### Snippet
```java
     * The actual serialized value for a TextFormatTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ContactRelationUpdateActionTypes.java`
#### Snippet
```java
     * The actual serialized value for a ContactRelationUpdateActionTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/RoleTypes.java`
#### Snippet
```java
     * The actual serialized value for a RoleTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Attachment.java`
#### Snippet
```java
     * object. This allows extensibility while maintaining the object.
     */
    private HashMap<String, JsonNode> properties = new HashMap<String, JsonNode>();

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/ChannelAccount.java`
#### Snippet
```java
     * object. This allows extensibility while maintaining the object.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Serialization.java`
#### Snippet
```java
    }

    private static ObjectMapper objectMapper;

    static {
```

### FieldMayBeFinal
Field `right` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Pair.java`
#### Snippet
```java
public class Pair<L, R> {
    private L left;
    private R right;

    /**
```

### FieldMayBeFinal
Field `left` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Pair.java`
#### Snippet
```java
 */
public class Pair<L, R> {
    private L left;
    private R right;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/AttachmentLayoutTypes.java`
#### Snippet
```java
     * The actual serialized value for a AttachmentLayoutTypes instance.
     */
    private String value;

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TeamsChannelData.java`
#### Snippet
```java
    private TeamsMeetingInfo meeting;

    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Activity.java`
#### Snippet
```java
     * object. This allows extensibility while maintaining the object.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/teams/TabSubmitData.java`
#### Snippet
```java
     * object. This allows extensibility while maintaining the object.
     */
    private HashMap<String, JsonNode> properties = new HashMap<>();

    /**
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
            writer.write(footer);
            writer.write(lineBreak);
        } catch (Exception e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/resources/CodeGenerator.java`
#### Snippet
```java
            try {
                writer.close();
            } catch (Exception e) {
                throw e;
            }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `validIssuers` is redundant
in `libraries/bot-connector/src/main/java/com/microsoft/bot/connector/authentication/GovernmentChannelValidation.java`
#### Snippet
```java
        TokenValidationParameters tokenValidationParameters = new TokenValidationParameters();

        ArrayList<String> validIssuers = new ArrayList<String>();
        tokenValidationParameters.validIssuers = validIssuers;

```

### UnnecessaryLocalVariable
Local variable `splitProperties` is redundant
in `libraries/bot-integration-core/src/main/java/com/microsoft/bot/integration/ClasspathPropertiesConfiguration.java`
#### Snippet
```java
        String baseProperty = properties.getProperty(key);
        if (baseProperty != null) {
            String[] splitProperties = baseProperty.split(",");
            return splitProperties;
        } else {
```

### UnnecessaryLocalVariable
Local variable `obj` is redundant
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
            ObjectNode nobj = JsonNodeFactory.instance.objectNode();
            // Fix datetime by reverting to simple timex
            JsonNode obj = source;
            JsonNode type = source.get("type");

```

### UnnecessaryLocalVariable
Local variable `arr` is redundant
in `libraries/bot-ai-luis-v3/src/main/java/com/microsoft/bot/ai/luis/LuisRecognizerOptionsV3.java`
#### Snippet
```java
            result = nobj;
        } else if (source.isArray()) {
            JsonNode arr = source;
            ArrayNode narr = JsonNodeFactory.instance.arrayNode();
            for (JsonNode elt : arr) {
```

### UnnecessaryLocalVariable
Local variable `blobName` is redundant
in `libraries/bot-azure/src/main/java/com/microsoft/bot/azure/blobs/BlobsTranscriptStore.java`
#### Snippet
```java

    private String getBlobName(Activity activity) {
        String blobName = String.format(
            "%s/%s/%s-%s.json",
            sanitizeKey(activity.getChannelId()),
```

### UnnecessaryLocalVariable
Local variable `handoffEvent` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/EventFactory.java`
#### Snippet
```java
        }

        Activity handoffEvent = createHandoffEvent(HandoffEventNames.HANDOFFSTATUS, handoffContext, conversation);
        return handoffEvent;
    }
```

### UnnecessaryLocalVariable
Local variable `openSessions` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java

        return accessor.get(turnContext, InspectionSessionsByStatus::new).thenCompose(result -> {
            InspectionSessionsByStatus openSessions = (InspectionSessionsByStatus) result;
            openSessions.getAttachedSessions().remove(
                turnContext.getActivity().getConversation().getId()
```

### UnnecessaryLocalVariable
Local variable `sessions` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/inspection/InspectionMiddleware.java`
#### Snippet
```java

        return accessor.get(turnContext, InspectionSessionsByStatus::new).thenCompose(result -> {
            InspectionSessionsByStatus sessions = (InspectionSessionsByStatus) result;
            String sessionId = openCommand(
                sessions,
```

### UnnecessaryLocalVariable
Local variable `credentials` is redundant
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
    protected CompletableFuture<AppCredentials> buildAppCredentials(String appId, String scope) {
        return credentialProvider.getAppPassword(appId).thenApply(appPassword -> {
            AppCredentials credentials = channelProvider != null && channelProvider.isGovernment()
                ? new MicrosoftGovernmentAppCredentials(appId, appPassword, null, scope)
                : new MicrosoftAppCredentials(appId, appPassword, null, scope);
```

### UnnecessaryLocalVariable
Local variable `modelResults` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/models/ChoiceModel.java`
#### Snippet
```java
        List<ParseResult> parseResults = extractResults.stream().map(exRes -> parser.parse(exRes)).collect(Collectors.toList());
        
        List<ModelResult> modelResults = parseResults.stream().map(
            parseRes -> new ModelResult(parseRes.getText(), parseRes.getStart(), parseRes.getStart() + parseRes.getLength() - 1, getModelTypeName(), getResolution(parseRes))
        ).collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/choice/parsers/ChoiceParser.java`
#### Snippet
```java
        ChoiceExtractDataResult data = (ChoiceExtractDataResult)extractResult.getData();
        Map<String, Boolean> resolutions = this.config.getResolutions();
        OptionsOtherMatchParseResult result = new OptionsOtherMatchParseResult(parseResult.getText(), resolutions.get(parseResult.getType()), data.score);

        return result;
```

### UnnecessaryLocalVariable
Local variable `finalResponse` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/bot/dialogs/prompts/OAuthPrompt.java`
#### Snippet
```java

                    result.setSucceeded(true);
                    TokenResponse finalResponse = tokenExchangeResponse;
                    TokenResponse response = new TokenResponse();
                    response.setChannelId(finalResponse.getChannelId());
```

### UnnecessaryLocalVariable
Local variable `uc` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isChinese(char c) {
        int uc = (int)c;

        return (uc >= (int)0x4E00 && uc <= (int)0x9FBF) || (uc >= (int)0x3400 && uc <= (int)0x4DBF);
```

### UnnecessaryLocalVariable
Local variable `uc` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isKorean(char c) {
        int uc = (int)c;

        return (uc >= (int)0xAC00 && uc <= (int)0xD7AF) ||
```

### UnnecessaryLocalVariable
Local variable `uc` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/SimpleTokenizer.java`
#### Snippet
```java

    protected boolean isJapanese(char c) {
        int uc = (int)c;

        return (uc >= 0x3040 && uc <= 0x309F) ||
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeAltParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseSetParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `suffixStr` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
        DateTimeResolutionResult result = new DateTimeResolutionResult();

        String suffixStr = text;

        // if there are NO spaces between number and unit
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
        }

        DateTimeParseResult result = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `suffixStr` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
        DateTimeResolutionResult result = new DateTimeResolutionResult();

        String suffixStr = text;

        // if there are NO spaces between number and unit
```

### UnnecessaryLocalVariable
Local variable `referenceDate` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java
    public DateTimeParseResult parse(ExtractResult er, LocalDateTime reference) {

        LocalDateTime referenceDate = reference;

        Object value = null;
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(er.getStart(), er.getLength(), er.getText(), er.getType(), er.getData(), value, "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

```

### UnnecessaryLocalVariable
Local variable `referenceDate` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseHolidayParser.java`
#### Snippet
```java
    public DateTimeParseResult parse(ExtractResult er, LocalDateTime reference) {
        
        LocalDateTime referenceDate = reference;
        Object value = null;

```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseHolidayParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseHolidayParser.java`
#### Snippet
```java
            if (match.getSuccess()) {
                // LUIS value string will be set in Match2Date method
                DateTimeResolutionResult ret = match2Date(match.getMatch().get(), referenceDate);

                return ret;
```

### UnnecessaryLocalVariable
Local variable `referenceTime` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
    public DateTimeParseResult parse(ExtractResult er, LocalDateTime reference) {

        LocalDateTime referenceTime = reference;

        Object value = null;
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `innerResult` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
    protected DateTimeResolutionResult internalParse(String text, LocalDateTime referenceTime) {

        DateTimeResolutionResult innerResult = parseBasicRegexMatch(text, referenceTime);
        return innerResult;
    }
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java

                    // LUIS value string will be set in Match2Date method
                    DateTimeResolutionResult ret = this.match2Date(match, referenceDate, relativeStr);
                    return ret;
                }
```

### UnnecessaryLocalVariable
Local variable `referenceDate` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
    public DateTimeParseResult parse(ExtractResult er, LocalDateTime reference) {

        LocalDateTime referenceDate = reference;

        Object value = null;
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `answerDay` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
                int firstWeekDay = firstDate.getDayOfWeek().getValue();
                LocalDateTime firstWantedWeekDay = firstDate.plusDays(wantedWeekDay > firstWeekDay ? wantedWeekDay - firstWeekDay : wantedWeekDay - firstWeekDay + 7);
                int answerDay = firstWantedWeekDay.getDayOfMonth() + (num - 1) * 7;
                day = answerDay;
                ambiguous = false;
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `referenceDate` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
    public DateTimeParseResult parse(ExtractResult er, LocalDateTime reference) {

        LocalDateTime referenceDate = reference;

        Object value = null;
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
        }

        DateTimeParseResult ret = new DateTimeParseResult(
                er.getStart(),
                er.getLength(),
```

### UnnecessaryLocalVariable
Local variable `ers` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeExtractor.java`
#### Snippet
```java
        }

        List<ExtractResult> ers = dateErs;
        ers.addAll(timeErs);

```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseSequenceParser.java`
#### Snippet
```java
    @Override
    public ParseResult parse(ExtractResult extResult) {
        ParseResult result = new ParseResult(extResult.getStart(), extResult.getLength(), extResult.getText(),
                extResult.getType(), null, null, extResult.getText());
        return result;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/parsers/BaseIpParser.java`
#### Snippet
```java
    @Override
    public ParseResult parse(ExtractResult extResult) {
        ParseResult result = new ParseResult(extResult.getStart(), extResult.getLength(), extResult.getText(),
                extResult.getType(), extResult.getData(), null, BaseIpParser.dropLeadingZeros(extResult.getText()));

```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateExtractor.java`
#### Snippet
```java

    private ExtractResult stripInequalityPrefix(ExtractResult er, Pattern regex) {
        ExtractResult result = er;
        Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(regex, er.getText())).findFirst();

```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseMentionExtractor.java`
#### Snippet
```java

    public BaseMentionExtractor() {
        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(Pattern.compile(BaseMention.MentionRegex), Constants.MENTION_REGEX);
```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseHashTagExtractor.java`
#### Snippet
```java
    
    public BaseHashTagExtractor() {
        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(Pattern.compile(BaseHashtag.HashtagRegex), Constants.HASHTAG_REGEX);
```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseURLExtractor.java`
#### Snippet
```java
    public BaseURLExtractor(URLConfiguration config) {
        this.config = config;
        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(config.getUrlRegex(), Constants.URL_REGEX);
```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseGUIDExtractor.java`
#### Snippet
```java
    
    public BaseGUIDExtractor() {
        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(Pattern.compile(BaseGUID.GUIDRegex), Constants.GUID_REGEX);
```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BaseIpExtractor.java`
#### Snippet
```java
    // https://tools.ietf.org/html/rfc5952
    public BaseIpExtractor(IpConfiguration config) {
        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(Pattern.compile(BaseIp.Ipv4Regex), Constants.IP_REGEX_IPV4);
```

### UnnecessaryLocalVariable
Local variable `regexes` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
        String endWordBoundariesRegex = config.getEndWordBoundariesRegex();

        Map<Pattern, String> regexes = new HashMap<Pattern, String>() {
            {
                put(Pattern
```

### UnnecessaryLocalVariable
Local variable `r` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConstraintsHelper.java`
#### Snippet
```java

    public static List<DateRange> collapseDateRanges(List<DateRange> ranges) {
        List<DateRange> r = ranges;

        while (TimexConstraintsHelper.innerCollapseDateRanges(r)) {
```

### UnnecessaryLocalVariable
Local variable `r` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexConstraintsHelper.java`
#### Snippet
```java
public class TimexConstraintsHelper {
    public static List<TimeRange> collapseTimeRanges(List<TimeRange> ranges) {
        List<TimeRange> r = ranges;

        while (TimexConstraintsHelper.innerCollapseTimeRanges(r)) {
```

### UnnecessaryLocalVariable
Local variable `timex` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexProperty.java`
#### Snippet
```java

    public static TimexProperty fromDate(LocalDateTime date) {
        TimexProperty timex = new TimexProperty() {
            {
                setYear(date.getYear());
```

### UnnecessaryLocalVariable
Local variable `next` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/utilities/RegExpUtility.java`
#### Snippet
```java
        }

        String next = (startPos == closePos) ?
                null :
                source.substring(startPos, closePos + 1);
```

### UnnecessaryLocalVariable
Local variable `timexResults` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRangeResolver.java`
#### Snippet
```java
                timexConstraints);

        List<TimexProperty> timexResults = candidatesFilteredByTime.stream().map(x -> {
            return new TimexProperty(x);
        }).collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `date` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexHelpers.java`
#### Snippet
```java
        Integer minute = timex.getMinute() != null ? timex.getMinute() : 0;
        Integer second = timex.getSecond() != null ? timex.getSecond() : 0;
        LocalDateTime date = LocalDateTime.of(year, month, day, hour, minute, second);

        return date;
```

### UnnecessaryLocalVariable
Local variable `x` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java

        Collections.sort(ers, (Comparator<ExtractResult>)(xo, yo) -> {
            ExtractResult x = (ExtractResult)xo;
            ExtractResult y = (ExtractResult)yo;
            return x.getStart() - y.getStart();
```

### UnnecessaryLocalVariable
Local variable `y` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/BaseMergedUnitExtractor.java`
#### Snippet
```java
        Collections.sort(ers, (Comparator<ExtractResult>)(xo, yo) -> {
            ExtractResult x = (ExtractResult)xo;
            ExtractResult y = (ExtractResult)yo;
            return x.getStart() - y.getStart();
        });
```

### UnnecessaryLocalVariable
Local variable `regex` is redundant
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
        int options = Pattern.UNICODE_CHARACTER_CLASS | (ignoreCase ? Pattern.CASE_INSENSITIVE : 0);

        Pattern regex = Pattern.compile(pattern, options);
        return regex;
    }
```

## RuleId[id=UnpredictableBigDecimalConstructorCall]
### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/utilities/TimexUtility.java`
#### Snippet
```java
                    break;
                default:
                    unitCount = new BigDecimal((end.getYear() - begin.getYear()) + (end.getMonthValue() - begin.getMonthValue()) / 12.0).stripTrailingZeros().toString();
            }
        }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/ShowTypingMiddleware.java`
#### Snippet
```java
                while (!Thread.currentThread().isInterrupted()) {
                    sendTypingActivity(turnContext).join();
                    Thread.sleep(period);
                }
            } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `libraries/bot-builder/src/main/java/com/microsoft/bot/builder/BotFrameworkAdapter.java`
#### Snippet
```java
                    int delayMs = (int) activity.getValue();
                    try {
                        Thread.sleep(delayMs);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/AgnosticNumberParserFactory.java`
#### Snippet
```java
                break;
            case Double:
                parser.setSupportedTypes(Arrays.asList(Constants.SYS_NUM_DOUBLE));
                break;
            case Fraction:
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/AgnosticNumberParserFactory.java`
#### Snippet
```java
                break;
            case Fraction:
                parser.setSupportedTypes(Arrays.asList(Constants.SYS_NUM_FRACTION));
                break;
            case Integer:
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/AgnosticNumberParserFactory.java`
#### Snippet
```java
                break;
            case Integer:
                parser.setSupportedTypes(Arrays.asList(Constants.SYS_NUM_INTEGER));
                break;
            case Ordinal:
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/parsers/AgnosticNumberParserFactory.java`
#### Snippet
```java
                break;
            case Ordinal:
                parser.setSupportedTypes(Arrays.asList(Constants.SYS_NUM_ORDINAL));
                break;
            case Percentage:
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/EnglishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("point");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("and");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/EnglishNumeric.java`
#### Snippet
```java
    public static final String WordSeparatorToken = "and";

    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("point");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/EnglishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("and");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("and");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/EnglishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("and");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("and");

    public static final String HalfADozenRegex = "half\\s+a\\s+dozen";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("und");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("durch");

    public static final String HalfADozenRegex = "ein\\s+halbes\\s+dutzend";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punkt");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("und");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("durch");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java
    public static final String WordSeparatorToken = "und";

    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("komma");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punkt");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/GermanNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("komma");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punkt");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("und");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/SpanishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("y");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("con");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/SpanishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("y");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("con");

    public static final String HalfADozenRegex = "media\\s+docena";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/SpanishNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("coma", "con");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("y");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/FrenchNumeric.java`
#### Snippet
```java
    public static final String WordSeparatorToken = "et";

    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("virgule");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("point", "points");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/matcher/NumberWithUnitTokenizer.java`
#### Snippet
```java

public class NumberWithUnitTokenizer extends SimpleTokenizer {
    private static final HashSet<Character> specialTokenCharacters = new HashSet<Character>(Arrays.asList('$')); 

    /* The main difference between this strategy and SimpleTokenizer is for cases like
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/PortugueseNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("e");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("com");

    public static final List<String> WrittenFractionSuffix = Arrays.asList("avo", "ava");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/PortugueseNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("virgula", "vírgula");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("ponto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("e");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/number/resources/PortugueseNumeric.java`
#### Snippet
```java
    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("ponto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("e");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("com");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
        .build();

    public static final List<String> MorningTermList = Arrays.asList("morning");

    public static final List<String> AfternoonTermList = Arrays.asList("afternoon");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> MealtimeBreakfastTermList = Arrays.asList("breakfast");

    public static final List<String> MealtimeBrunchTermList = Arrays.asList("brunch");

    public static final List<String> MealtimeLunchTermList = Arrays.asList("lunch", "lunchtime");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> YearTerms = Arrays.asList("year");

    public static final List<String> GenericYearTerms = Arrays.asList("y");

    public static final List<String> YearToDateTerms = Arrays.asList("year to date");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> WeekTerms = Arrays.asList("week");

    public static final List<String> YearTerms = Arrays.asList("year");

    public static final List<String> GenericYearTerms = Arrays.asList("y");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> WeekendTerms = Arrays.asList("weekend");

    public static final List<String> WeekTerms = Arrays.asList("week");

    public static final List<String> YearTerms = Arrays.asList("year");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> AfternoonTermList = Arrays.asList("afternoon");

    public static final List<String> EveningTermList = Arrays.asList("evening");

    public static final List<String> MealtimeBreakfastTermList = Arrays.asList("breakfast");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> FutureTerms = Arrays.asList("this", "next");

    public static final List<String> LastCardinalTerms = Arrays.asList("last");

    public static final List<String> MonthTerms = Arrays.asList("month");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> MonthToDateTerms = Arrays.asList("month to date");

    public static final List<String> WeekendTerms = Arrays.asList("weekend");

    public static final List<String> WeekTerms = Arrays.asList("week");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> GenericYearTerms = Arrays.asList("y");

    public static final List<String> YearToDateTerms = Arrays.asList("year to date");

    public static final String DoubleMultiplierRegex = "^(bi)(-|\\s)?";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> MorningTermList = Arrays.asList("morning");

    public static final List<String> AfternoonTermList = Arrays.asList("afternoon");

    public static final List<String> EveningTermList = Arrays.asList("evening");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> MealtimeDinnerTermList = Arrays.asList("dinner", "dinnertime", "supper");

    public static final List<String> DaytimeTermList = Arrays.asList("daytime");

    public static final List<String> NightTermList = Arrays.asList("night");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> MonthTerms = Arrays.asList("month");

    public static final List<String> MonthToDateTerms = Arrays.asList("month to date");

    public static final List<String> WeekendTerms = Arrays.asList("weekend");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> PlusTwoDayTerms = Arrays.asList("day after tomorrow", "day after tmr");

    public static final List<String> MinusTwoDayTerms = Arrays.asList("day before yesterday");

    public static final List<String> FutureTerms = Arrays.asList("this", "next");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> DaytimeTermList = Arrays.asList("daytime");

    public static final List<String> NightTermList = Arrays.asList("night");

    public static final List<String> SameDayTerms = Arrays.asList("today", "otd");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> LastCardinalTerms = Arrays.asList("last");

    public static final List<String> MonthTerms = Arrays.asList("month");

    public static final List<String> MonthToDateTerms = Arrays.asList("month to date");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/EnglishDateTime.java`
#### Snippet
```java
    public static final List<String> EveningTermList = Arrays.asList("evening");

    public static final List<String> MealtimeBreakfastTermList = Arrays.asList("breakfast");

    public static final List<String> MealtimeBrunchTermList = Arrays.asList("brunch");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
    public static final List<String> MonthToDateTerms = Arrays.asList("mes ate agora", "mes ate hoje", "mes ate a data");

    public static final List<String> WeekendTerms = Arrays.asList("fim de semana");

    public static final List<String> WeekTerms = Arrays.asList("semana");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
    public static final String DefaultLanguageFallback = "DMY";

    public static final List<String> DurationDateRestrictions = Arrays.asList();

    public static final ImmutableMap<String, String> AmbiguityFiltersDict = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
    public static final List<String> AfternoonTermList = Arrays.asList("passado o meio dia", "depois do meio dia");

    public static final List<String> EveningTermList = Arrays.asList("tarde");

    public static final List<String> NightTermList = Arrays.asList("noite");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
    public static final List<String> EveningTermList = Arrays.asList("tarde");

    public static final List<String> NightTermList = Arrays.asList("noite");

    public static final List<String> SameDayTerms = Arrays.asList("hoje", "este dia", "esse dia", "o dia");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
    public static final List<String> WeekendTerms = Arrays.asList("fim de semana");

    public static final List<String> WeekTerms = Arrays.asList("semana");

    public static final List<String> YearTerms = Arrays.asList("ano", "anos");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/PortugueseDateTime.java`
#### Snippet
```java
        .build();

    public static final List<String> EarlyMorningTermList = Arrays.asList("madrugada");

    public static final List<String> MorningTermList = Arrays.asList("manha", "manhã");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
    public static final String DefaultLanguageFallback = "DMY";

    public static final List<String> DurationDateRestrictions = Arrays.asList("hoy");

    public static final ImmutableMap<String, String> AmbiguityFiltersDict = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
    public static final List<String> WeekendTerms = Arrays.asList("finde", "fin de semana", "fines de semana");

    public static final List<String> WeekTerms = Arrays.asList("semana");

    public static final List<String> YearTerms = Arrays.asList("año", "años");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
        .build();

    public static final List<String> EarlyMorningTermList = Arrays.asList("madrugada");

    public static final List<String> MorningTermList = Arrays.asList("mañana", "la mañana");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
    public static final List<String> AfternoonTermList = Arrays.asList("pasado mediodia", "pasado el mediodia", "pasado mediodía", "pasado el mediodía", "pasado medio dia", "pasado el medio dia", "pasado medio día", "pasado el medio día");

    public static final List<String> EveningTermList = Arrays.asList("tarde");

    public static final List<String> NightTermList = Arrays.asList("noche");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/SpanishDateTime.java`
#### Snippet
```java
    public static final List<String> EveningTermList = Arrays.asList("tarde");

    public static final List<String> NightTermList = Arrays.asList("noche");

    public static final List<String> SameDayTerms = Arrays.asList("hoy", "el dia");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> NextYearTerms = Arrays.asList("明年");

    public static final List<String> YearAfterNextTerms = Arrays.asList("后年");

    public static final List<String> YearBeforeLastTerms = Arrays.asList("前年");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> WeekTerms = Arrays.asList("周", "星期");

    public static final List<String> YearTerms = Arrays.asList("年");

    public static final List<String> ThisYearTerms = Arrays.asList("今年");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> MonthTerms = Arrays.asList("月");

    public static final List<String> WeekendTerms = Arrays.asList("周末");

    public static final List<String> WeekTerms = Arrays.asList("周", "星期");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> DaytimeTermList = Arrays.asList("白天", "日间");

    public static final List<String> NightTermList = Arrays.asList("深夜");

    public static final ImmutableMap<String, Integer> DynastyYearMap = ImmutableMap.<String, Integer>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> YearAfterNextTerms = Arrays.asList("后年");

    public static final List<String> YearBeforeLastTerms = Arrays.asList("前年");

    public static final ImmutableMap<String, String> ParserConfigurationSeasonMap = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> LastYearTerms = Arrays.asList("去年");

    public static final List<String> NextYearTerms = Arrays.asList("明年");

    public static final List<String> YearAfterNextTerms = Arrays.asList("后年");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> YearTerms = Arrays.asList("年");

    public static final List<String> ThisYearTerms = Arrays.asList("今年");

    public static final List<String> LastYearTerms = Arrays.asList("去年");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
        .build();

    public static final List<String> MonthTerms = Arrays.asList("月");

    public static final List<String> WeekendTerms = Arrays.asList("周末");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/ChineseDateTime.java`
#### Snippet
```java
    public static final List<String> ThisYearTerms = Arrays.asList("今年");

    public static final List<String> LastYearTerms = Arrays.asList("去年");

    public static final List<String> NextYearTerms = Arrays.asList("明年");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final List<String> WeekendTerms = Arrays.asList("fin de semaine", "le weekend");

    public static final List<String> WeekTerms = Arrays.asList("semaine");

    public static final List<String> YearTerms = Arrays.asList("années", "ans", "an", "l'annees", "l'annee");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final List<String> DaytimeTermList = Arrays.asList("jour", "journee", "journée");

    public static final List<String> NightTermList = Arrays.asList("nuit");

    public static final List<String> SameDayTerms = Arrays.asList("aujourd'hui", "auj");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final List<String> LastCardinalTerms = Arrays.asList("dernières", "dernière", "dernieres", "derniere", "dernier");

    public static final List<String> MonthTerms = Arrays.asList("mois");

    public static final List<String> MonthToDateTerms = Arrays.asList("mois à ce jour");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final List<String> MonthTerms = Arrays.asList("mois");

    public static final List<String> MonthToDateTerms = Arrays.asList("mois à ce jour");

    public static final List<String> WeekendTerms = Arrays.asList("fin de semaine", "le weekend");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final List<String> MinusTwoDayTerms = Arrays.asList("avant-hier", "avant hier");

    public static final List<String> FutureStartTerms = Arrays.asList("cette");

    public static final List<String> FutureEndTerms = Arrays.asList("prochaine", "prochain");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/resources/FrenchDateTime.java`
#### Snippet
```java
    public static final String DefaultLanguageFallback = "DMY";

    public static final List<String> DurationDateRestrictions = Arrays.asList();

    public static final ImmutableMap<String, String> AmbiguityFiltersDict = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/resources/BasePhoneNumbers.java`
#### Snippet
```java
    public static final String FormatIndicatorRegex = "(\\s|-|/|\\.)+";

    public static final List<Character> ColonMarkers = Arrays.asList(':');

    public static final String ColonPrefixCheckRegex = "(([a-z])\\s*$)";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
        for (String regexString : collection) {
            List<String> regexTokens = new ArrayList<>();
            for (String token : QueryProcessor.split(regexString, Arrays.asList("|"))) {
                regexTokens.add(Pattern.quote(token));
            }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/extractors/NumberWithUnitExtractor.java`
#### Snippet
```java
    private final int maxPrefixMatchLen;

    private final List<String> separators = Arrays.asList("|");

    public NumberWithUnitExtractor(INumberWithUnitExtractorConfiguration config) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/ChineseNumericWithUnit.java`
#### Snippet
```java
public class ChineseNumericWithUnit {

    public static final List<String> AgeAmbiguousValues = Arrays.asList("岁");

    public static final ImmutableMap<String, String> AgeSuffixList = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/JapaneseNumericWithUnit.java`
#### Snippet
```java
public class JapaneseNumericWithUnit {

    public static final List<String> AgeAmbiguousValues = Arrays.asList("歳");

    public static final ImmutableMap<String, String> AgeSuffixList = ImmutableMap.<String, String>builder()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/numberwithunit/resources/EnglishNumericWithUnit.java`
#### Snippet
```java
        .build();

    public static final List<String> AmbiguousAreaUnitList = Arrays.asList("n/a");

    public static final ImmutableMap<String, String> CurrencySuffixList = ImmutableMap.<String, String>builder()
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`flag == false` can be simplified to '!flag'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/sequence/extractors/BasePhoneNumberExtractor.java`
#### Snippet
```java
                }

                if (flag == false) {
                    ers.remove(er);
                    i--;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseMergedDateTimeParser.java`
#### Snippet
```java

                for (Map.Entry<String, String> q : ((Map<String, String>)p.getValue()).entrySet()) {
                    value.put(q.getKey(), q.getValue());
                }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/extractors/BaseDateTimeAltExtractor.java`
#### Snippet
```java
        } else {
            for (Map.Entry<String, Object> data : newMetadata.entrySet()) {
                result.put(data.getKey(), data.getValue());
            }
        }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexRegex.java`
#### Snippet
```java

        for (Entry<String, String> entry : regexGroupNames.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `libraries/bot-schema/src/main/java/com/microsoft/bot/schema/Entity.java`
#### Snippet
```java

        for (Map.Entry<String, JsonNode> entry : tempEntity.properties.entrySet()) {
            this.properties.put(entry.getKey(), entry.getValue());
        }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/expression/TimexResolver.java`
#### Snippet
```java
            LocalTime defaultTime = LocalDateTime.MIN.toLocalTime();
            List<DateRange> dateRanges = Streams
                    .zip(startDateValues.stream(), endDateValues.stream(), (n, w) -> new DateRange() {
                        {
                            setStart(LocalDateTime.of(LocalDate.parse(n, formatter), defaultTime));
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDurationParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex()
        );

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimeParser.java`
#### Snippet
```java

        DateTimeParseResult ret = new DateTimeParseResult(er.getStart(), er.getLength(), er.getText(), er.getType(), er.getData(), value, "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

        return ret;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseHolidayParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex()
        );

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimeParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

        return ret;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

        return ret;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseTimePeriodParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

        return ret;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'DateTimeResolutionResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDateTimePeriodParser.java`
#### Snippet
```java
                value,
                "",
                value == null ? "" : ((DateTimeResolutionResult)value).getTimex());

        return ret;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'pr' to 'DateTimeParseResult'
in `libraries/bot-dialogs/src/main/java/com/microsoft/recognizers/text/datetime/parsers/BaseDatePeriodParser.java`
#### Snippet
```java

            if (pr != null) {
                ret.setTimex("(" + ((DateTimeParseResult)pr).getTimexStr());
                ret.setFutureValue(((DateTimeResolutionResult)pr.getValue()).getFutureValue());
                ret.setPastValue(((DateTimeResolutionResult)pr.getValue()).getPastValue());
```

