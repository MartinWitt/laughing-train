# Artemis 
 
# Bad smells
I found 1458 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 305 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 181 | false |
| RuleId[ruleID=ReturnNull] | 174 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 111 | false |
| RuleId[ruleID=KotlinAnnotator] | 85 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 82 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 55 | false |
| RuleId[ruleID=DataFlowIssue] | 48 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 40 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 31 | false |
| RuleId[ruleID=EqualsAndHashcode] | 26 | false |
| RuleId[ruleID=MissortedModifiers] | 25 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 20 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 20 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 20 | true |
| RuleId[ruleID=MismatchedJavadocCode] | 19 | false |
| RuleId[ruleID=RedundantImplements] | 16 | false |
| RuleId[ruleID=PackageDirectoryMismatch] | 14 | false |
| RuleId[ruleID=SlowListContainsAll] | 13 | false |
| RuleId[ruleID=CodeBlock2Expr] | 13 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 13 | false |
| RuleId[ruleID=OptionalContainsCollection] | 10 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 9 | false |
| RuleId[ruleID=EmptyMethod] | 8 | false |
| RuleId[ruleID=ConstantValue] | 7 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 6 | false |
| RuleId[ruleID=UnusedAssignment] | 6 | false |
| RuleId[ruleID=OptionalIsPresent] | 6 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 6 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 6 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 5 | false |
| RuleId[ruleID=MethodOverloadsParentMethod] | 5 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 4 | true |
| RuleId[ruleID=UnnecessaryStringEscape] | 4 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 4 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 4 | false |
| RuleId[ruleID=UnusedSymbol] | 4 | false |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 3 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 3 | true |
| RuleId[ruleID=FieldMayBeStatic] | 3 | false |
| RuleId[ruleID=Convert2MethodRef] | 3 | false |
| RuleId[ruleID=ClassCanBeRecord] | 3 | false |
| RuleId[ruleID=CommentedOutCode] | 2 | false |
| RuleId[ruleID=DuplicateExpressions] | 2 | false |
| RuleId[ruleID=NullableProblems] | 2 | false |
| RuleId[ruleID=SimplifyOptionalCallChains] | 2 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 2 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 2 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 2 | false |
| RuleId[ruleID=MissingSerialAnnotation] | 2 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 2 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=RefusedBequest] | 1 | false |
| RuleId[ruleID=RegExpSimplifiable] | 1 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 1 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=FuseStreamOperations] | 1 | false |
| RuleId[ruleID=DoubleBraceInitialization] | 1 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 1 | false |
| RuleId[ruleID=IOResource] | 1 | false |
| RuleId[ruleID=RemoveExplicitTypeArguments] | 1 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 1 | false |
| RuleId[ruleID=ObviousNullCheck] | 1 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 1 | false |
| RuleId[ruleID=SetReplaceableByEnumSet] | 1 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 1 | false |
| RuleId[ruleID=BusyWait] | 1 | false |
| RuleId[ruleID=CopyConstructorMissesField] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new ConversationParticipant\[conversation.getConversationParticipants().size()\]'
in `src/main/java/de/tum/in/www1/artemis/service/metis/ConversationService.java`
#### Snippet
```java
        Optional<Conversation> existingConversation = existingConversations.stream().filter((conversation1) -> conversation1.getConversationParticipants().stream()
                .anyMatch(conversationParticipant -> conversationParticipant.getUser().getId().equals(
                        conversation.getConversationParticipants().toArray(new ConversationParticipant[conversation.getConversationParticipants().size()])[0].getUser().getId())))
                .findAny();

```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Task\[defaultTasks.size()\]'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                // This conversion is required because the attributes are passed as varargs-parameter which is only possible
                // for array collections
                var defaultTasksArray = defaultTasks.toArray(new Task<?, ?>[defaultTasks.size()]);
                var finalTasksArray = finalTasks.toArray(new Task<?, ?>[finalTasks.size()]);
                var artifactsArray = artifacts.toArray(new Artifact[artifacts.size()]);
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Task\[finalTasks.size()\]'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                // for array collections
                var defaultTasksArray = defaultTasks.toArray(new Task<?, ?>[defaultTasks.size()]);
                var finalTasksArray = finalTasks.toArray(new Task<?, ?>[finalTasks.size()]);
                var artifactsArray = artifacts.toArray(new Artifact[artifacts.size()]);

```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Artifact\[artifacts.size()\]'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                var defaultTasksArray = defaultTasks.toArray(new Task<?, ?>[defaultTasks.size()]);
                var finalTasksArray = finalTasks.toArray(new Task<?, ?>[finalTasks.size()]);
                var artifactsArray = artifacts.toArray(new Artifact[artifacts.size()]);

                // assign tasks and artifacts to job
```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (notificationType) { case TUTORIAL_GROUP_DELETED -> text = "The tutorial group " ...` statement on enum type 'de.tum.in.www1.artemis.domain.enumeration.NotificationType' misses cases: 'EXERCISE_SUBMISSION_ASSESSED', ...
in `src/main/java/de/tum/in/www1/artemis/domain/notification/TutorialGroupNotificationFactory.java`
#### Snippet
```java
        var title = findCorrespondingNotificationTitleOrThrow(notificationType);
        var text = "";
        switch (notificationType) {
            case TUTORIAL_GROUP_DELETED -> text = "The tutorial group " + tutorialGroup.getTitle() + " has been deleted.";

            case TUTORIAL_GROUP_UPDATED -> text = "The tutorial group " + tutorialGroup.getTitle() + " has been updated.";
        }
        var notification = new TutorialGroupNotification(tutorialGroup, title, text, notificationType);
        setNotificationTarget(notification);
```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (programmingLanguage) { case JAVA, KOTLIN -> { fileService.replac...` statement on enum type 'de.tum.in.www1.artemis.domain.enumeration.ProgrammingLanguage' misses cases: 'PYTHON', 'C', 'HASKELL', 'VHDL', 'ASSEMBLER', ...
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        ProjectType projectType = programmingExercise.getProjectType();

        switch (programmingLanguage) {
            case JAVA, KOTLIN -> {
                fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFolder}",
                        programmingExercise.getPackageFolderName());
                replacements.put("${packageName}", programmingExercise.getPackageName());
            }
            case SWIFT -> {
                switch (projectType) {
                    case PLAIN -> {
                        fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFolder}",
                                programmingExercise.getPackageName());
                        fileService.replaceVariablesInFileName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFile}", programmingExercise.getPackageName());
                        replacements.put("${packageName}", programmingExercise.getPackageName());
                    }
                    case XCODE -> {
                        fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${appName}", programmingExercise.getPackageName());
                        fileService.replaceVariablesInFileName(repository.getLocalPath().toAbsolutePath().toString(), "${appName}", programmingExercise.getPackageName());
                        replacements.put("${appName}", programmingExercise.getPackageName());
                    }
                }
            }
        }

        // there is no need in python to replace package names
```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (projectType) { case PLAIN -> { fileService.repla...` statement on enum type 'de.tum.in.www1.artemis.domain.enumeration.ProjectType' misses cases: 'MAVEN_MAVEN', 'PLAIN_MAVEN', 'FACT', 'GCC', ...
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            }
            case SWIFT -> {
                switch (projectType) {
                    case PLAIN -> {
                        fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFolder}",
                                programmingExercise.getPackageName());
                        fileService.replaceVariablesInFileName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFile}", programmingExercise.getPackageName());
                        replacements.put("${packageName}", programmingExercise.getPackageName());
                    }
                    case XCODE -> {
                        fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${appName}", programmingExercise.getPackageName());
                        fileService.replaceVariablesInFileName(repository.getLocalPath().toAbsolutePath().toString(), "${appName}", programmingExercise.getPackageName());
                        replacements.put("${appName}", programmingExercise.getPackageName());
                    }
                }
            }
        }
```

## RuleId[ruleID=UnnecessaryStringEscape]
### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (env.acceptsProfiles(Profiles.of(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT))) {
            log.error("Exception in {}.{}() with cause = \'{}\' and exception = \'{}\'", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                    e.getCause() != null ? e.getCause() : "NULL", e.getMessage(), e);

```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `FilePathService.fileUploadPath` from instance context
in `src/main/java/de/tum/in/www1/artemis/service/FilePathService.java`
#### Snippet
```java
    @Value("${artemis.file-upload-path}")
    public void setFileUploadPathStatic(String fileUploadPath) {
        FilePathService.fileUploadPath = fileUploadPath;
    }

```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `src/main/java/de/tum/in/www1/artemis/web/websocket/QuizSubmissionWebsocketService.java`
#### Snippet
```java
            // send updated submission over websocket (use a thread to prevent that the outbound channel blocks the inbound channel (e.g. due a slow client))
            // to improve the performance, this is currently deactivated: slow clients might lead to bottlenecks so that more important messages can not be distributed any more
            // new Thread(() -> sendSubmissionToUser(username, exerciseId, quizSubmission)).start();

            // log.info("WS.Inbound: Sent quiz submission (async) back to user {} in quiz {} after {} ?s ", principal.getName(), exerciseId, (System.nanoTime() - start) / 1000);
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
            // students should not see statistics
            // TODO: this would be useful, but leads to problems when the quiz schedule service wants to access the statistics again later on
            // quizExercise.setQuizPointStatistic(null);
            // quizExercise.getQuizQuestions().forEach(quizQuestion -> quizQuestion.setQuizQuestionStatistic(null));
        }
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\.` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
     */
    public String removeIllegalCharacters(String string) {
        return string.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");
    }

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\.` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java

        // sanitize the filename and replace all invalid characters with with an underscore
        filename = filename.replaceAll("[^a-zA-Z\\d\\.\\-]", "_");

        // Check the allowed file extensions
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
        for (String key : principal.getAttributes().keySet()) {
            final String escapedKey = Pattern.quote(key);
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
    }

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
    }

```

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExerciseTestCase.java`
#### Snippet
```java
     * @return a clone of the object.
     */
    public ProgrammingExerciseTestCase clone() {
        ProgrammingExerciseTestCase clone = new ProgrammingExerciseTestCase().testName(this.getTestName()).weight(this.getWeight()).active(this.isActive())
                .bonusPoints(this.getBonusPoints()).bonusMultiplier(this.getBonusMultiplier()).visibility(visibility).exercise(this.exercise);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `exerciseToLectureUnitProgress.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
        List<StudentParticipation> participationsOfTheStudent = getStudentParticipationsWithSubmissionsAndResults(user, individualExercises, teamExercises);

        for (Exercise exercise : exerciseToLectureUnitProgress.keySet()) {
            // exercise -> participation -> submission -> result until possibly the latest result is found for the student
            Optional<Result> optionalResult = findLastResultOfExerciseInListOfParticipations(exercise, participationsOfTheStudent);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `exercisesOfUser.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
        studentExams = studentExams.stream().filter(studentExam -> !excludeStudentExams.contains(studentExam)).collect(Collectors.toSet());
        Map<User, List<Exercise>> exercisesOfUser = getExercisesOfUserMap(studentExams);
        for (final var user : exercisesOfUser.keySet()) {
            final var studentParticipations = studentParticipationRepository.findByStudentIdAndIndividualExercisesWithEagerSubmissionsResultIgnoreTestRuns(user.getId(),
                    exercisesOfUser.get(user));
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `exercisesOfUser.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
        Set<StudentExam> unsubmittedStudentExams = studentExamRepository.findAllUnsubmittedWithExercisesByExamId(exam.getId());
        Map<User, List<Exercise>> exercisesOfUser = getExercisesOfUserMap(unsubmittedStudentExams);
        for (final var user : exercisesOfUser.keySet()) {
            // fetch all studentParticipations of a user, with submissions and results eagerly loaded
            final var studentParticipations = studentParticipationRepository.findByStudentIdAndIndividualExercisesWithEagerSubmissionsResultIgnoreTestRuns(user.getId(),
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `userSubmissionMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
        int count = 0;

        for (String username : userSubmissionMap.keySet()) {
            try {
                // first case: the user submitted the quizSubmission
```

## RuleId[ruleID=KotlinAnnotator]
### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}


```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

//TODO: declare strategy interface
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}


```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}


```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

//TODO: declare strategy interface
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Context
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {

    //TODO: add the missing attributes
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Policy
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java

//TODO: add the missing constructor and members
class Policy {

    //TODO: add `configure` method which accepts two boolean parameters
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing constructor and members
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing constructor and members
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

//TODO: declare strategy interface
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing constructor and members
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: QuickSort
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {

    private lateinit var a: Array<Int>
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
    fun configure(timeIsImportant: Boolean, spaceIsImportant: Boolean) {
        if (timeIsImportant && !spaceIsImportant) {
            println("Time is important ?> Merge Sort!")
            context.sortAlgorithm = MergeSort()
        } else if (timeIsImportant && spaceIsImportant) {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: sortAlgorithm
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
        if (timeIsImportant && !spaceIsImportant) {
            println("Time is important ?> Merge Sort!")
            context.sortAlgorithm = MergeSort()
        } else if (timeIsImportant && spaceIsImportant) {
            println("Time & Space are important ?> Quick Sort!")
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
            context.sortAlgorithm = MergeSort()
        } else if (timeIsImportant && spaceIsImportant) {
            println("Time & Space are important ?> Quick Sort!")
            context.sortAlgorithm = QuickSort()
        }
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: sortAlgorithm
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
        } else if (timeIsImportant && spaceIsImportant) {
            println("Time & Space are important ?> Quick Sort!")
            context.sortAlgorithm = QuickSort()
        }
    }
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Policy
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {

    fun configure(timeIsImportant: Boolean, spaceIsImportant: Boolean) {
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: QuickSort
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java

//TODO: add the missing inheritance
class QuickSort {

    private lateinit var a: Array<Int>
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

interface SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

interface SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

interface SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: until
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
        var i = lo
        var j = mid
        for (k in lo until hi) {
            when {
                i == mid -> aux[k] = a[j++]
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: until
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java

        // copy back
        for (k in lo until hi)
            a[k] = aux[k]
    }
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: MergeSort
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java

//TODO: add the missing inheritance
class MergeSort {

    /***********************************************************************
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Context
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {

    var sortAlgorithm: SortStrategy? = null
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: error
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java

    fun sort() {
        val arr = this.array ?: error("No array specified!")
        val sortAlgorithm = this.sortAlgorithm ?: error("No sort algorithm specified!")
        sortAlgorithm.performSort(arr)
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: error
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
    fun sort() {
        val arr = this.array ?: error("No array specified!")
        val sortAlgorithm = this.sortAlgorithm ?: error("No sort algorithm specified!")
        sortAlgorithm.performSort(arr)
    }
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=KotlinAnnotator]
Too many arguments for public constructor Policy() defined in Policy
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
fun main() {
    val sortingContext = Context()
    val policy = Policy(sortingContext)

    var array = Client.createIntegerArray(10)
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: array
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
    for (i in 0..9) {
        array = Client.scrambleArray(array)
        sortingContext.array = array
        Client.simulateRuntimeConfigurationChange(policy)
        print("Unsorted Array a = ")
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: print
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
        sortingContext.array = array
        Client.simulateRuntimeConfigurationChange(policy)
        print("Unsorted Array a = ")
        Client.printIntegerArray(array)
        sortingContext.sort()
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: sort
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
        print("Unsorted Array a = ")
        Client.printIntegerArray(array)
        sortingContext.sort()
        print("Sorted Array a = ")
        Client.printIntegerArray(array)
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: print
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
        Client.printIntegerArray(array)
        sortingContext.sort()
        print("Sorted Array a = ")
        Client.printIntegerArray(array)
    }
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}

fun main() {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}

fun main() {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}

fun main() {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: Random
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun createIntegerArray(size: Int = 30): Array<Int> {
        return Array(size) { Random.nextInt(0, 100) }
    }

```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Client
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
import kotlin.random.Random

object Client {

    fun createIntegerArray(size: Int = 30): Array<Int> {
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: random
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random

object Client {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: joinToString
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: toList
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun scrambleArray(array: Array<Int>): Array<Int> {
        return array.toList().shuffled().toTypedArray()
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: Random
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = false)
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = false)
        } else {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: configure
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
        if (Random.nextBoolean()) {
            println("Time is important!")
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = false)
        } else {
            println("Time and space are important!")
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = false)
        } else {
            println("Time and space are important!")
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = true)
        }
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: configure
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
        } else {
            println("Time and space are important!")
            sortPolicy.configure(timeIsImportant = true, spaceIsImportant = true)
        }
    }
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: until
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
        var i = lo
        var j = mid
        for (k in lo until hi) {
            when {
                i == mid -> aux[k] = a[j++]
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: until
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java

        // copy back
        for (k in lo until hi)
            a[k] = aux[k]
    }
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {
```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: MergeSort
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {

    /***********************************************************************
```

### RuleId[ruleID=KotlinAnnotator]
Conflicting overloads: public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt, public fun \`\`(): Unit defined in root package in file QuickSort.kt, public fun \`\`(): Unit defined in root package in file Policy.kt, public fun \`\`(): Unit defined in root package in file MergeSort.kt, public fun \`\`(): Unit defined in root package in file Context.kt, public fun \`\`(): Unit defined in root package in file SortStrategy.kt, public fun \`\`(): Unit defined in root package in file Main.kt, public fun \`\`(): Unit defined in root package in file Client.kt
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Function declaration must have a name
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: packageName
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: Random
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
            //TODO: configure policy
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
            //TODO: configure policy

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

        } else {
            println("Time and space are important!")
            //TODO: configure policy

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: println
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: joinToString
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }

```

### RuleId[ruleID=KotlinAnnotator]
Redeclaration: Client
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
import kotlin.random.Random

object Client {

    fun createIntegerArray(size: Int = 30): Array<Int> {
```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: Random
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun createIntegerArray(size: Int = 30): Array<Int> {
        return Array(size) { Random.nextInt(0, 100) }
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: toList
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java

    fun scrambleArray(array: Array<Int>): Array<Int> {
        return array.toList().shuffled().toTypedArray()
    }

```

### RuleId[ruleID=KotlinAnnotator]
Unresolved reference: random
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random

object Client {
```

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`{1}` is redundant
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
public class TutorialGroupResource {

    private static final String TITLE_REGEX = "^[a-zA-Z0-9]{1}[a-zA-Z0-9- ]{0,19}$";

    public static final String ENTITY_NAME = "tutorialGroup";
```

## RuleId[ruleID=DuplicateExpressions]
### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `Path.of(actualPath)`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
    public String publicPathForActualPath(String actualPath, @Nullable Long entityId) {
        // first extract filename
        String filename = Path.of(actualPath).getFileName().toString();

        // generate part for id
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `Path.of(actualPath)`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
        }
        if (actualPath.contains(FilePathService.getFileUploadExercisesFilePath())) {
            final var path = Path.of(actualPath);
            final long exerciseId;
            try {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`participation.getResults().size() == 0` can be replaced with 'participation.getResults().isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextExerciseResource.java`
#### Snippet
```java

        // if no results, check if there are really no results or the relation to results was not updated yet
        if (participation.getResults().size() == 0) {
            List<Result> results = resultRepository.findByParticipationIdOrderByCompletionDateDesc(participation.getId());
            participation.setResults(new HashSet<>(results));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`tutorialGroupStatusDTO.status_explanation().trim().length() > 0` can be replaced with '!tutorialGroupStatusDTO.status_explanation().trim().isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
        tutorialGroupService.isAllowedToModifySessionsOfTutorialGroup(sessionToCancel.getTutorialGroup(), null);
        sessionToCancel.setStatus(TutorialGroupSessionStatus.CANCELLED);
        if (tutorialGroupStatusDTO != null && tutorialGroupStatusDTO.status_explanation() != null && tutorialGroupStatusDTO.status_explanation().trim().length() > 0) {
            sessionToCancel.setStatusExplanation(tutorialGroupStatusDTO.status_explanation().trim());
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`nextSessions.size() > 0` can be replaced with '!nextSessions.isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java
        else {
            var nextSessions = tutorialGroupSessionRepository.findNextSessionsOfStatus(tutorialGroup.getId(), ZonedDateTime.now(), TutorialGroupSessionStatus.ACTIVE);
            if (nextSessions.size() > 0) {
                nextSessionOptional = Optional.of(nextSessions.get(0));
            }
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StaticCodeAnalysisCategory`
in `src/main/java/de/tum/in/www1/artemis/web/rest/StaticCodeAnalysisResource.java`
#### Snippet
```java
     * @param exerciseId path variable
     */
    private void validateCategories(Set<StaticCodeAnalysisCategory> categories, Long exerciseId) {
        for (var category : categories) {
            // Each category must have an id
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
            AuthorizationCheckService authCheckService, ProgrammingExerciseRepository programmingExerciseRepository,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, GradingCriterionRepository gradingCriterionRepository,
            SubmissionRepository submissionRepository, ExerciseDateService exerciseDateService) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
            ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, GradingCriterionRepository gradingCriterionRepository,
            SubmissionRepository submissionRepository, ExerciseDateService exerciseDateService) {
        this.programmingSubmissionService = programmingSubmissionService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Complaint`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ComplaintResource.java`
#### Snippet
```java
    }

    private List<Complaint> buildComplaintsListForAssessor(List<Complaint> complaints, Principal principal, boolean assessorSameAsCaller, boolean isTestRun,
            boolean isAtLeastInstructor) {
        List<Complaint> responseComplaints = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Complaint`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ComplaintResource.java`
#### Snippet
```java
    }

    private void filterOutUselessDataFromComplaints(List<Complaint> complaints, boolean filterOutStudentFromComplaints) {
        if (filterOutStudentFromComplaints) {
            complaints.forEach(this::filterOutStudentFromComplaint);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SAML2Service`
in `src/main/java/de/tum/in/www1/artemis/web/rest/UserJWTController.java`
#### Snippet
```java
    private final Optional<SAML2Service> saml2Service;

    public UserJWTController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, Optional<SAML2Service> saml2Service) {
        this.tokenProvider = tokenProvider;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtheneScheduleService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
            ExerciseRepository exerciseRepository, TextExerciseRepository textExerciseRepository, AuthorizationCheckService authCheckService,
            TextSubmissionService textSubmissionService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            GradingCriterionRepository gradingCriterionRepository, TextAssessmentService textAssessmentService, Optional<AtheneScheduleService> atheneScheduleService,
            ExamSubmissionService examSubmissionService, PlagiarismService plagiarismService, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider) {
        super(submissionRepository, resultService, authCheckService, userRepository, exerciseRepository, textSubmissionService, studentParticipationRepository);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtheneTrackingTokenProvider`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
            TextSubmissionService textSubmissionService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            GradingCriterionRepository gradingCriterionRepository, TextAssessmentService textAssessmentService, Optional<AtheneScheduleService> atheneScheduleService,
            ExamSubmissionService examSubmissionService, PlagiarismService plagiarismService, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider) {
        super(submissionRepository, resultService, authCheckService, userRepository, exerciseRepository, textSubmissionService, studentParticipationRepository);
        this.textSubmissionRepository = textSubmissionRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentExam`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExamResource.java`
#### Snippet
```java
    }

    private static void breakCyclesForSerialization(List<StudentExam> studentExams) {
        for (StudentExam studentExam : studentExams) {
            studentExam.getExam().setRegisteredUsers(null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Team`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TeamResource.java`
#### Snippet
```java
     * @param teams    Teams of exercise
     */
    private void sendTeamAssignmentUpdates(Exercise exercise, List<Team> teams) {
        // Get participation to given exercise into a map which participation identifiers as key and a lists of all participation with that identifier as value
        Map<String, List<StudentParticipation>> participationsMap = studentParticipationRepository
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
    }

    private ResponseEntity<Resource> returnZipFileForRepositoryExport(Optional<File> zipFile, String repositoryName, ProgrammingExercise exercise, long startTime)
            throws IOException {
        if (zipFile.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingLanguageFeatureService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
    public ProgrammingExerciseExportImportResource(ProgrammingExerciseRepository programmingExerciseRepository, UserRepository userRepository,
            AuthorizationCheckService authCheckService, CourseService courseService, ProgrammingExerciseImportService programmingExerciseImportService,
            ProgrammingExerciseExportService programmingExerciseExportService, Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, SubmissionPolicyService submissionPolicyService,
            ProgrammingExerciseTaskRepository programmingExerciseTaskRepository) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
     * @return a list of results as described above for the given exercise.
     */
    private List<Result> resultsForExercise(Exercise exercise, List<StudentParticipation> participations, boolean withSubmissions) {
        final List<Result> results = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
    public ResultResource(ProgrammingExerciseParticipationService programmingExerciseParticipationService, ParticipationService participationService,
            ExampleSubmissionRepository exampleSubmissionRepository, ResultService resultService, ExerciseRepository exerciseRepository, AuthorizationCheckService authCheckService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, LtiNewResultService ltiNewResultService, ResultRepository resultRepository,
            WebsocketMessagingService messagingService, UserRepository userRepository, ExamDateService examDateService,
            ProgrammingExerciseGradingService programmingExerciseGradingService, ParticipationRepository participationRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LectureUnit`
in `src/main/java/de/tum/in/www1/artemis/web/rest/LearningGoalResource.java`
#### Snippet
```java
    }

    private Set<LectureUnit> getLectureUnitsFromDatabase(Set<LectureUnit> lectureUnitsFromClient) {
        Set<LectureUnit> lectureUnitsFromDatabase = new HashSet<>();
        if (lectureUnitsFromClient != null && !lectureUnitsFromClient.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingLanguageFeatureService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java

    public ProgrammingExercisePlagiarismResource(ProgrammingExerciseRepository programmingExerciseRepository, AuthorizationCheckService authCheckService,
            PlagiarismResultRepository plagiarismResultRepository, Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService,
            ProgrammingPlagiarismDetectionService programmingPlagiarismDetectionService) {
        this.programmingExerciseRepository = programmingExerciseRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtheneTrackingTokenProvider`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            TextExerciseRepository textExerciseRepository, TextSubmissionRepository textSubmissionRepository, UserRepository userRepository,
            TextSubmissionService textSubmissionService, WebsocketMessagingService messagingService, ExerciseRepository exerciseRepository, ResultRepository resultRepository,
            GradingCriterionRepository gradingCriterionRepository, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider, ExamService examService,
            Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService, FeedbackConflictRepository feedbackConflictRepository,
            ExampleSubmissionRepository exampleSubmissionRepository, SubmissionRepository submissionRepository, FeedbackRepository feedbackRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AutomaticTextAssessmentConflictService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            TextSubmissionService textSubmissionService, WebsocketMessagingService messagingService, ExerciseRepository exerciseRepository, ResultRepository resultRepository,
            GradingCriterionRepository gradingCriterionRepository, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider, ExamService examService,
            Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService, FeedbackConflictRepository feedbackConflictRepository,
            ExampleSubmissionRepository exampleSubmissionRepository, SubmissionRepository submissionRepository, FeedbackRepository feedbackRepository,
            SingleUserNotificationService singleUserNotificationService, ResultService resultService) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExerciseScoresChartResource.java`
#### Snippet
```java
    }

    private Set<Exercise> filterExercises(Set<Exercise> exercises) {
        return exercises.stream().filter(this::isExerciseFinished).collect(Collectors.toSet());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VcsUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
    public CourseResource(UserRepository userRepository, CourseService courseService, CourseRepository courseRepository, ExerciseService exerciseService,
            OAuth2JWKSService oAuth2JWKSService, AuthorizationCheckService authCheckService, TutorParticipationRepository tutorParticipationRepository,
            SubmissionService submissionService, Optional<VcsUserManagementService> optionalVcsUserManagementService, AssessmentDashboardService assessmentDashboardService,
            ExerciseRepository exerciseRepository, Optional<CIUserManagementService> optionalCiUserManagementService, FileService fileService,
            TutorialGroupsConfigurationService tutorialGroupsConfigurationService) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CIUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
            OAuth2JWKSService oAuth2JWKSService, AuthorizationCheckService authCheckService, TutorParticipationRepository tutorParticipationRepository,
            SubmissionService submissionService, Optional<VcsUserManagementService> optionalVcsUserManagementService, AssessmentDashboardService assessmentDashboardService,
            ExerciseRepository exerciseRepository, Optional<CIUserManagementService> optionalCiUserManagementService, FileService fileService,
            TutorialGroupsConfigurationService tutorialGroupsConfigurationService) {
        this.courseService = courseService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ProgrammingExerciseResource(ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository,
            UserRepository userRepository, AuthorizationCheckService authCheckService, CourseService courseService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, ExerciseService exerciseService,
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ProgrammingExerciseResource(ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository,
            UserRepository userRepository, AuthorizationCheckService authCheckService, CourseService courseService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, ExerciseService exerciseService,
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingLanguageFeatureService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
            Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService, CourseRepository courseRepository, GitService gitService,
            AuxiliaryRepositoryService auxiliaryRepositoryService, SubmissionPolicyService submissionPolicyService,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LdapUserService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/admin/AdminUserResource.java`
#### Snippet
```java

    public AdminUserResource(UserRepository userRepository, UserService userService, UserCreationService userCreationService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, AuthorityRepository authorityRepository, Optional<LdapUserService> ldapUserService) {
        this.userRepository = userRepository;
        this.userService = userService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/StudentsAppearMultipleTimesException.java`
#### Snippet
```java
    }

    private static Map<String, Object> getParameters(List<User> students) {
        Map<String, List<Pair<String, String>>> params = new HashMap<>();
        params.put("students", students.stream().map(student -> Pair.of(student.getLogin(), student.getRegistrationNumber())).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/StudentsAlreadyAssignedException.java`
#### Snippet
```java
    }

    private static Map<String, Object> getConflict(Pair<User, Team> conflict) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("studentLogin", conflict.getFirst().getLogin());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Team`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/StudentsAlreadyAssignedException.java`
#### Snippet
```java
    }

    private static Map<String, Object> getConflict(Pair<User, Team> conflict) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("studentLogin", conflict.getFirst().getLogin());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
            CourseRepository courseRepository, QuizExerciseRepository quizExerciseRepository, ExerciseRepository exerciseRepository,
            ProgrammingExerciseRepository programmingExerciseRepository, AuthorizationCheckService authCheckService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            AuditEventRepository auditEventRepository, GuidedTourConfiguration guidedTourConfiguration, TeamRepository teamRepository, FeatureToggleService featureToggleService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, SubmissionRepository submissionRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TutorialGroupSession`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/errors/ScheduleOverlapsWithSessionException.java`
#### Snippet
```java
    }

    private static Map<String, Object> getParameters(Set<TutorialGroupSession> overlappingSessions, ZoneId zoneId) {
        Map<String, List<String>> params = new HashMap<>();
        params.put("sessions", overlappingSessions.stream().map(session -> session.getStart().withZoneSameInstant(zoneId).format(DateTimeFormatter.ISO_LOCAL_DATE)).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
     * @return a map of <filename, error | null>
     */
    protected Map<String, String> saveFileSubmissions(List<FileSubmission> submissions, Repository repository) {
        // If updating the file fails due to an IOException, we send an error message for the specific file and try to update the rest
        Map<String, String> fileSaveResult = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TutorialGroupSession`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/errors/SessionOverlapsWithSessionException.java`
#### Snippet
```java
    }

    private static Map<String, Object> getParameters(Set<TutorialGroupSession> overlappingSessions, ZoneId zoneId) {
        Map<String, List<String>> params = new HashMap<>();
        params.put("sessions", overlappingSessions.stream().map(session -> session.getStart().withZoneSameInstant(zoneId).format(DateTimeFormatter.ISO_LOCAL_DATE)).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HealthContributor`
in `src/main/java/de/tum/in/www1/artemis/config/MetricsBean.java`
#### Snippet
```java
    }

    private void registerHealthContributors(List<HealthContributor> healthContributors) {
        // Publish the health status for each HealthContributor one Gauge with name ARTEMIS_HEALTH_NAME that has several values (one for each HealthIndicator),
        // using different values for the ARTEMIS_HEALTH_TAG tag
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/ParticipationTeamWebsocketService.java`
#### Snippet
```java
    }

    private void updateValue(Map<String, Instant> map, long participationId, String username) {
        map.put(participationId + "-" + username, Instant.now());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Instant`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/ParticipationTeamWebsocketService.java`
#### Snippet
```java
    }

    private void updateValue(Map<String, Instant> map, long participationId, String username) {
        map.put(participationId + "-" + username, Instant.now());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DataSource`
in `src/main/java/de/tum/in/www1/artemis/config/LiquibaseConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SpringLiquibase liquibase(@LiquibaseDataSource ObjectProvider<DataSource> liquibaseDataSource, LiquibaseProperties liquibaseProperties,
            ObjectProvider<DataSource> dataSourceObjectProvider, DataSourceProperties dataSourceProperties) {
        SpringLiquibase liquibase = SpringLiquibaseUtil.createSpringLiquibase(liquibaseDataSource.getIfAvailable(), liquibaseProperties, dataSourceObjectProvider.getIfUnique(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DataSource`
in `src/main/java/de/tum/in/www1/artemis/config/LiquibaseConfiguration.java`
#### Snippet
```java
    @Bean
    public SpringLiquibase liquibase(@LiquibaseDataSource ObjectProvider<DataSource> liquibaseDataSource, LiquibaseProperties liquibaseProperties,
            ObjectProvider<DataSource> dataSourceObjectProvider, DataSourceProperties dataSourceProperties) {
        SpringLiquibase liquibase = SpringLiquibaseUtil.createSpringLiquibase(liquibaseDataSource.getIfAvailable(), liquibaseProperties, dataSourceObjectProvider.getIfUnique(),
                dataSourceProperties);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthenticationProvider`
in `src/main/java/de/tum/in/www1/artemis/config/SecurityConfiguration.java`
#### Snippet
```java

    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder, UserDetailsService userDetailsService, TokenProvider tokenProvider,
            CorsFilter corsFilter, SecurityProblemSupport problemSupport, PasswordService passwordService, Optional<AuthenticationProvider> remoteUserAuthenticationProvider) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.userDetailsService = userDetailsService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Saml2X509Credential`
in `src/main/java/de/tum/in/www1/artemis/config/SAML2Configuration.java`
#### Snippet
```java
    }

    private void addDecryptionInformation(Collection<Saml2X509Credential> credentialsSink, SAML2Properties.RelyingPartyProperties config) {
        if (!this.checkFiles(config)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Saml2X509Credential`
in `src/main/java/de/tum/in/www1/artemis/config/SAML2Configuration.java`
#### Snippet
```java


    private void addSigningInformation(Collection<Saml2X509Credential> credentialsSink, SAML2Properties.RelyingPartyProperties config) {
        if (!this.checkFiles(config)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20211214_184200.java`
#### Snippet
```java
     * @param userList a batch of at max 100 users to be processed
     */
    private void processUsers(List<User> userList) {
        userList = userList.stream().peek(user -> {
            // This user is either already external or a user with a default `isInternal` value
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PersistentAuditEvent`
in `src/main/java/de/tum/in/www1/artemis/config/audit/AuditEventConverter.java`
#### Snippet
```java
     * @return the converted list.
     */
    public List<AuditEvent> convertToAuditEvent(Iterable<PersistentAuditEvent> persistentAuditEvents) {
        if (persistentAuditEvents == null) {
            return Collections.emptyList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `src/main/java/de/tum/in/www1/artemis/config/ProgrammingLanguageConfiguration.java`
#### Snippet
```java
     * @param buildImages The build images as defined in the configuration.
     */
    private void checkImageForAllProgrammingLanguagesDefined(final Map<ProgrammingLanguage, Map<ProjectType, String>> buildImages) {
        for (ProgrammingLanguage language : ProgrammingLanguage.values()) {
            if (!buildImages.containsKey(language)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `src/main/java/de/tum/in/www1/artemis/config/ProgrammingLanguageConfiguration.java`
#### Snippet
```java
     * @return A map of programming languages to the CI build images that are defined for it.
     */
    private Map<ProgrammingLanguage, Map<ProjectType, String>> loadImages(final Map<String, Map<String, String>> imageConfig) {
        final Map<ProgrammingLanguage, Map<ProjectType, String>> buildImages = new EnumMap<>(ProgrammingLanguage.class);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/domain/Result.java`
#### Snippet
```java
    }

    public void addFeedbacks(List<Feedback> feedbacks) {
        feedbacks.forEach(this::addFeedback);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/domain/Result.java`
#### Snippet
```java
     * @param skipAutomaticResults if true automatic results won't be updated
     */
    public void updateAllFeedbackItems(List<Feedback> feedbacks, boolean skipAutomaticResults) {
        for (Feedback feedback : feedbacks) {
            if (skipAutomaticResults && feedback.getType() == FeedbackType.AUTOMATIC) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `src/main/java/de/tum/in/www1/artemis/domain/Feedback.java`
#### Snippet
```java
     */
    @JsonIgnore
    public double computeTotalScore(double inputScore, Map<Long, Integer> gradingInstructions) {
        double totalScore = inputScore;
        if (gradingInstructions.get(getGradingInstruction().getId()) != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExamAction`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/monitoring/ExamActivity.java`
#### Snippet
```java
    }

    public void addExamActions(List<ExamAction> examActions) {
        this.examActions.addAll(examActions);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
     */
    @Nullable
    public StudentParticipation findRelevantParticipation(List<StudentParticipation> participations) {
        StudentParticipation relevantParticipation = null;
        for (StudentParticipation participation : participations) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
     */
    @Nullable
    public StudentParticipation findParticipation(List<StudentParticipation> participations) {
        for (StudentParticipation participation : participations) {
            if (this.equals(participation.getExercise())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
     */
    private List<GradingInstruction> copyGradingInstruction(GradingCriterion originalGradingCriterion, GradingCriterion newGradingCriterion,
            Map<Long, GradingInstruction> gradingInstructionCopyTracker) {
        List<GradingInstruction> newGradingInstructions = new ArrayList<>();
        for (GradingInstruction originalGradingInstruction : originalGradingCriterion.getStructuredGradingInstructions()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GradingInstruction`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
     */
    private List<GradingInstruction> copyGradingInstruction(GradingCriterion originalGradingCriterion, GradingCriterion newGradingCriterion,
            Map<Long, GradingInstruction> gradingInstructionCopyTracker) {
        List<GradingInstruction> newGradingInstructions = new ArrayList<>();
        for (GradingInstruction originalGradingInstruction : originalGradingCriterion.getStructuredGradingInstructions()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
     * @return filtered submission
     */
    public Submission findAppropriateSubmissionByResults(Set<Submission> submissions) {
        List<Submission> submissionsWithRatedResult = new ArrayList<>();
        List<Submission> submissionsWithUnratedResult = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ShortAnswerSpotCounter`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/ShortAnswerQuestionStatistic.java`
#### Snippet
```java
    }

    private void handleCountersForCorrectSpots(ShortAnswerSubmittedAnswer shortAnswerSubmittedAnswer, Consumer<ShortAnswerSpotCounter> changeCounterIfSpotIsCorrect) {
        if (shortAnswerSubmittedAnswer.getSubmittedTexts() != null) {
            for (ShortAnswerSpotCounter spotCounter : shortAnswerSpotCounters) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
    @Nullable
    @Override
    public Submission findAppropriateSubmissionByResults(Set<Submission> submissions) {
        return submissions.stream().filter(submission -> {
            Result result = submission.getLatestResult();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizExercise.java`
#### Snippet
```java

    @Override
    public StudentParticipation findRelevantParticipation(List<StudentParticipation> participations) {
        for (StudentParticipation participation : participations) {
            if (participation.getExercise() != null && participation.getExercise().equals(this)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
     * @return an instance of SingleUserNotification
     */
    public static SingleUserNotification createNotification(TutorialGroup tutorialGroup, NotificationType notificationType, Set<User> users, User responsibleForAction) {
        var title = findCorrespondingNotificationTitleOrThrow(notificationType);
        if (users.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Lecture`
in `src/main/java/de/tum/in/www1/artemis/service/LectureService.java`
#### Snippet
```java
     * @return lectures with filtered attachments
     */
    public Set<Lecture> filterActiveAttachments(Set<Lecture> lecturesWithAttachments, User user) {
        Set<Lecture> lecturesWithFilteredAttachments = new HashSet<>();
        for (Lecture lecture : lecturesWithAttachments) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CourseStatisticsAverageScore`
in `src/main/java/de/tum/in/www1/artemis/service/StatisticsService.java`
#### Snippet
```java
     * @param exercises the exercises which we want to sort
     */
    private void sortAfterReleaseDate(List<CourseStatisticsAverageScore> exercises) {
        exercises.sort((exerciseA, exerciseB) -> {
            var releaseDateA = exerciseA.getReleaseDate();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
    private final ProgrammingExerciseRepository programmingExerciseRepository;

    public ConsistencyCheckService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.versionControlService = versionControlService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
    private final ProgrammingExerciseRepository programmingExerciseRepository;

    public ConsistencyCheckService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.versionControlService = versionControlService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExerciseScoresAggregatedInformation`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseScoresChartService.java`
#### Snippet
```java
    }

    private ExerciseScoresDTO createExerciseScoreDTO(Map<Long, ExerciseScoresAggregatedInformation> exerciseIdToAggregatedInformation,
            Map<Long, StudentScore> individualExerciseIdToStudentScore, Map<Long, TeamScore> teamExerciseIdToTeamScore, Exercise exercise) {
        ExerciseScoresDTO exerciseScoresDTO = new ExerciseScoresDTO(exercise);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentScore`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseScoresChartService.java`
#### Snippet
```java

    private ExerciseScoresDTO createExerciseScoreDTO(Map<Long, ExerciseScoresAggregatedInformation> exerciseIdToAggregatedInformation,
            Map<Long, StudentScore> individualExerciseIdToStudentScore, Map<Long, TeamScore> teamExerciseIdToTeamScore, Exercise exercise) {
        ExerciseScoresDTO exerciseScoresDTO = new ExerciseScoresDTO(exercise);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TeamScore`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseScoresChartService.java`
#### Snippet
```java

    private ExerciseScoresDTO createExerciseScoreDTO(Map<Long, ExerciseScoresAggregatedInformation> exerciseIdToAggregatedInformation,
            Map<Long, StudentScore> individualExerciseIdToStudentScore, Map<Long, TeamScore> teamExerciseIdToTeamScore, Exercise exercise) {
        ExerciseScoresDTO exerciseScoresDTO = new ExerciseScoresDTO(exercise);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
    }

    private List<ScoreDTO> calculateScores(Set<Exercise> exercises, Set<User> users, Double scoreCalculationDenominator) {
        // 0.0 means we can not reasonably calculate the achieved points / scores
        if (scoreCalculationDenominator.equals(0.0)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
    }

    private List<ScoreDTO> calculateScores(Set<Exercise> exercises, Set<User> users, Double scoreCalculationDenominator) {
        // 0.0 means we can not reasonably calculate the achieved points / scores
        if (scoreCalculationDenominator.equals(0.0)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
     * @return an unmodifiable list of all participant scores of the exercises converted to DTOs
     */
    public List<ParticipantScoreDTO> getParticipantScoreDTOs(Pageable pageable, Set<Exercise> exercises) {
        Set<Exercise> individualExercisesOfCourse = exercises.stream().filter(exercise -> exercise.getMode().equals(ExerciseMode.INDIVIDUAL)).collect(Collectors.toSet());
        Set<Exercise> teamExercisesOfCourse = exercises.stream().filter(exercise -> exercise.getMode().equals(ExerciseMode.TEAM)).collect(Collectors.toSet());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
     * @return an unmodifiable list of DTOs containing the statistics for every user / team
     */
    public List<ParticipantScoreAverageDTO> getParticipantScoreAverageDTOs(Set<Exercise> exercises) {
        Set<Exercise> individualExercises = exercises.stream().filter(exercise -> exercise.getMode().equals(ExerciseMode.INDIVIDUAL)).collect(Collectors.toSet());
        Set<Exercise> teamExercises = exercises.stream().filter(exercise -> exercise.getMode().equals(ExerciseMode.TEAM)).collect(Collectors.toSet());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
     * @param feedbacks the feedbacks which are copied
     */
    private void copyFeedbackToResult(Result result, List<Feedback> feedbacks) {
        feedbacks.forEach(feedback -> {
            Feedback newFeedback = feedback.copyFeedback();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Complaint`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
     * @return the list of DTOs
     */
    private List<SubmissionWithComplaintDTO> getSubmissionsWithComplaintsFromComplaints(List<Complaint> complaints) {
        List<SubmissionWithComplaintDTO> submissionWithComplaintDTOs = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
     * @param submittedOnly Flag whether to only consider submitted submissions when finding the latest one
     */
    public void reduceParticipationSubmissionsToLatest(List<StudentParticipation> participations, boolean submittedOnly) {
        participations.forEach(participation -> {
            participation.getExercise().setStudentParticipations(null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Team`
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
     * @return list of teams that now contains students in given maps
     */
    private List<Team> convertTeamsStudentsToUsersInMaps(List<Team> teams, Map<String, User> studentsWithLogin, Map<String, User> studentsWithRegistrationNumber) {
        List<Team> convertedTeams = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
     * @return list of teams that now contains students in given maps
     */
    private List<Team> convertTeamsStudentsToUsersInMaps(List<Team> teams, Map<String, User> studentsWithLogin, Map<String, User> studentsWithRegistrationNumber) {
        List<Team> convertedTeams = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
     * @return list of teams that now contains students in given maps
     */
    private List<Team> convertTeamsStudentsToUsersInMaps(List<Team> teams, Map<String, User> studentsWithLogin, Map<String, User> studentsWithRegistrationNumber) {
        List<Team> convertedTeams = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
    private final ParticipationService participationService;

    public TeamService(TeamRepository teamRepository, UserRepository userRepository, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ParticipationService participationService) {
        this.teamRepository = teamRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/ComplaintService.java`
#### Snippet
```java
     * @param exercises the exercises for which the numbers of unevaluated complaints should be calculated
     */
    public void calculateNrOfOpenComplaints(Set<Exercise> exercises, boolean examMode) {
        final List<ExerciseMapEntry> numberOfComplaintsOfExercise;
        final List<ExerciseMapEntry> numberOfComplaintResponsesOfExercise;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentQueueService.java`
#### Snippet
```java
     * @param textCluster Cluster
     */
    public void setAddedDistances(List<TextBlock> textBlockList, TextCluster textCluster) {
        textBlockList.forEach(textBlock -> {
            double addedDistance = calculateAddedDistance(textBlock, textCluster);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentQueueService.java`
#### Snippet
```java
     * If a textBlock has no cluster or is already assessable, it isn't in the map
     */
    public Map<TextBlock, Double> calculateSmallerClusterPercentageBatch(List<TextSubmission> textSubmissionList) {
        Map<TextBlock, Double> result = new HashMap<>();
        if (textSubmissionList.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseService.java`
#### Snippet
```java
     * @return A list of filled <code>CourseManagementOverviewExerciseStatisticsDTO</code>
     */
    private List<CourseManagementOverviewExerciseStatisticsDTO> generateCourseManagementDTOs(Set<Exercise> exercisesForManagementOverview, Integer amountOfStudentsInCourse,
            Map<Long, Double> averageScoreById) {
        List<CourseManagementOverviewExerciseStatisticsDTO> statisticsDTOS = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GradingInstruction`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseService.java`
#### Snippet
```java
     * @return list including Feedback entries that have to be deleted due to updated grading instructions
     */
    public List<Feedback> getFeedbackToBeDeletedAfterGradingInstructionUpdate(boolean deleteFeedbackAfterGradingInstructionUpdate, List<GradingInstruction> gradingInstructions,
            Exercise exercise) {
        List<Feedback> feedbackToBeDeleted = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/AssessmentDashboardService.java`
#### Snippet
```java
     * @param examMode                      - if the exercises are part of an exam
     */
    private void calculateNumberOfSubmissions(Set<Exercise> programmingExercises, Set<Exercise> nonProgrammingExercises, boolean examMode) {
        final List<ExerciseMapEntry> programmingSubmissionsCounts;
        final List<ExerciseMapEntry> submissionCounts;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/AssessmentDashboardService.java`
#### Snippet
```java
     * @param examMode                      - if the exercises are part of an exam
     */
    private void calculateNumberOfSubmissions(Set<Exercise> programmingExercises, Set<Exercise> nonProgrammingExercises, boolean examMode) {
        final List<ExerciseMapEntry> programmingSubmissionsCounts;
        final List<ExerciseMapEntry> submissionCounts;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/EmailSummaryService.java`
#### Snippet
```java
     * @param allPossiblyRelevantExercisesForSummary are used to find the relevant exercises for this concrete user
     */
    private void prepareEmailSummaryForUser(User user, Set<Exercise> allPossiblyRelevantExercisesForSummary) {
        // Get all courses with exercises, lectures and exams (filtered for given user)
        List<Course> courses = courseService.findAllActiveForUser(user);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/TextBlockService.java`
#### Snippet
```java
     * @param textBlocks Iterable of TextBlocks.
     */
    public void saveAll(Iterable<TextBlock> textBlocks) {
        textBlockRepository.saveAll(textBlocks);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `src/main/java/de/tum/in/www1/artemis/service/StaticCodeAnalysisService.java`
#### Snippet
```java

    public StaticCodeAnalysisService(StaticCodeAnalysisCategoryRepository staticCodeAnalysisCategoryRepository,
            Map<ProgrammingLanguage, List<StaticCodeAnalysisDefaultCategory>> staticCodeAnalysisDefaultConfigurations, ProgrammingTriggerService programmingTriggerService) {
        this.staticCodeAnalysisCategoryRepository = staticCodeAnalysisCategoryRepository;
        this.staticCodeAnalysisDefaultConfigurations = staticCodeAnalysisDefaultConfigurations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/StaticCodeAnalysisService.java`
#### Snippet
```java
     * @return The filtered list of feedback objects
     */
    public List<Feedback> categorizeScaFeedback(Result result, List<Feedback> staticCodeAnalysisFeedback, ProgrammingExercise programmingExercise) {
        var categoryPairs = getCategoriesWithMappingForExercise(programmingExercise);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/ResultService.java`
#### Snippet
```java

    @NotNull
    private List<Feedback> saveFeedbackWithHibernateWorkaround(@NotNull Result result, List<Feedback> feedbackList) {
        // Avoid hibernate exception
        List<Feedback> savedFeedbacks = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AutomaticTextFeedbackService`
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentService.java`
#### Snippet
```java
    public TextAssessmentService(UserRepository userRepository, ComplaintResponseService complaintResponseService, ComplaintRepository complaintRepository,
            FeedbackRepository feedbackRepository, ResultRepository resultRepository, StudentParticipationRepository studentParticipationRepository, ResultService resultService,
            SubmissionRepository submissionRepository, TextBlockService textBlockService, Optional<AutomaticTextFeedbackService> automaticTextFeedbackService,
            ExamDateService examDateService, FeedbackConflictRepository feedbackConflictRepository, GradingCriterionRepository gradingCriterionRepository,
            SubmissionService submissionService, LtiNewResultService ltiNewResultService) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionExportService.java`
#### Snippet
```java
     * @throws IOException if an error occurred while zipping
     */
    private Optional<File> createZipFileFromParticipations(Exercise exercise, List<StudentParticipation> participations, boolean enableFilterAfterDueDate,
            @Nullable ZonedDateTime lateSubmissionFilter, Path outputDir, List<String> exportErrors, List<ArchivalReportEntry> reportData) throws IOException {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionExportService.java`
#### Snippet
```java
     */
    private Optional<File> createZipFileFromParticipations(Exercise exercise, List<StudentParticipation> participations, boolean enableFilterAfterDueDate,
            @Nullable ZonedDateTime lateSubmissionFilter, Path outputDir, List<String> exportErrors, List<ArchivalReportEntry> reportData) throws IOException {

        Course course = exercise.getCourseViaExerciseGroupOrCourseMember();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ArchivalReportEntry`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionExportService.java`
#### Snippet
```java
     */
    private Optional<File> createZipFileFromParticipations(Exercise exercise, List<StudentParticipation> participations, boolean enableFilterAfterDueDate,
            @Nullable ZonedDateTime lateSubmissionFilter, Path outputDir, List<String> exportErrors, List<ArchivalReportEntry> reportData) throws IOException {

        Course course = exercise.getCourseViaExerciseGroupOrCourseMember();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
     * @return the cloned list of text blocks
     */
    private Set<TextBlock> copyTextBlocks(Set<TextBlock> originalTextBlocks, TextSubmission newSubmission) {
        log.debug("Copying the TextBlocks to new TextSubmission: {}", newSubmission);
        var newTextBlocks = new HashSet<TextBlock>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
     * @param newSubmission      The submission which has newly created text blocks
     */
    private void updateFeedbackReferencesWithNewTextBlockIds(Set<TextBlock> originalTextBlocks, TextSubmission newSubmission) {
        Result newResult = newSubmission.getLatestResult();
        List<Feedback> newFeedbackList = newResult.getFeedbacks();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IndividualLectureUnitProgress`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
    }

    private void fillInScoreAchievedByStudentUsingParticipantScores(User user, Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress,
            List<Exercise> individualExercises, List<Exercise> teamExercises) {
        for (Exercise exercise : individualExercises) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java

    private void fillInScoreAchievedByStudentUsingParticipantScores(User user, Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress,
            List<Exercise> individualExercises, List<Exercise> teamExercises) {
        for (Exercise exercise : individualExercises) {
            Optional<StudentScore> studentScoreOptional = studentScoreRepository.findStudentScoreByExerciseAndUserLazy(exercise, user);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java

    private void fillInScoreAchievedByStudentUsingParticipantScores(User user, Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress,
            List<Exercise> individualExercises, List<Exercise> teamExercises) {
        for (Exercise exercise : individualExercises) {
            Optional<StudentScore> studentScoreOptional = studentScoreRepository.findStudentScoreByExerciseAndUserLazy(exercise, user);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
    }

    private void fillInScoreAchievedByStudentUsingParticipationsSubmissionsResults(User user, Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress,
            List<Exercise> individualExercises, List<Exercise> teamExercises) {
        // for all relevant exercises the participations with submissions and results will be batch-loaded
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IndividualLectureUnitProgress`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
    }

    private void fillInScoreAchievedByStudentUsingParticipationsSubmissionsResults(User user, Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress,
            List<Exercise> individualExercises, List<Exercise> teamExercises) {
        // for all relevant exercises the participations with submissions and results will be batch-loaded
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExerciseUnit`
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
     * @return progress of the user in the exercise units
     */
    public Set<IndividualLectureUnitProgress> calculateExerciseUnitsProgress(Set<ExerciseUnit> exerciseUnits, User user, boolean useParticipantScoreTable) {
        // for each exercise unit, the exercise will be mapped to a freshly created lecture unit progress.
        Map<Exercise, IndividualLectureUnitProgress> exerciseToLectureUnitProgress = exerciseUnits.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentDTO`
in `src/main/java/de/tum/in/www1/artemis/service/CourseService.java`
#### Snippet
```java
     * @return the list of students who could not be registered for the course, because they could NOT be found in the Artemis database and could NOT be found in the TUM LDAP
     */
    public List<StudentDTO> registerUsersForCourseGroup(Long courseId, List<StudentDTO> studentDTOs, String courseGroup) {
        var course = courseRepository.findByIdElseThrow(courseId);
        String courseGroupName = course.defineCourseGroupName(courseGroup);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/service/CourseService.java`
#### Snippet
```java
     */

    private List<StatisticsEntry> removeDuplicateActiveUserRows(List<StatisticsEntry> activeUserRows, ZonedDateTime startDate) {
        int startIndex = statisticsRepository.getWeekOfDate(startDate);
        Map<Integer, List<String>> usersByDate = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Course`
in `src/main/java/de/tum/in/www1/artemis/service/CourseService.java`
#### Snippet
```java
     * @param startTimeInMillis start time for logging purposes
     */
    public void fetchParticipationsWithSubmissionsAndResultsForCourses(List<Course> courses, User user, long startTimeInMillis) {
        Set<Exercise> exercises = courses.stream().flatMap(course -> course.getExercises().stream()).collect(Collectors.toSet());
        List<StudentParticipation> participationsOfUserInExercises = studentParticipationRepository.getAllParticipationsOfUserInExercises(user, exercises);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/CourseService.java`
#### Snippet
```java
     * @param usersInGroup  user whose variables are removed
     */
    private void removeUserVariables(List<User> usersInGroup) {
        usersInGroup.forEach(user -> {
            user.setLastNotificationRead(null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Result`
in `src/main/java/de/tum/in/www1/artemis/service/QuizStatisticService.java`
#### Snippet
```java
     * @param quiz    the quizExercise with Questions where the results should contain to
     */
    public void updateStatistics(Set<Result> results, QuizExercise quiz) {

        if (results != null && quiz != null && quiz.getQuizQuestions() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/BuildLogEntryService.java`
#### Snippet
```java
     * @return filtered build logs
     */
    private List<BuildLogEntry> removeUnnecessaryLogs(List<BuildLogEntry> buildLogEntries, ProgrammingLanguage programmingLanguage) {
        List<BuildLogEntry> filteredLogs = new ArrayList<>();
        for (BuildLogEntry buildLog : buildLogEntries) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/BuildLogEntryService.java`
#### Snippet
```java
     * @return the saved build logs
     */
    public List<BuildLogEntry> saveBuildLogs(List<BuildLogEntry> buildLogs, ProgrammingSubmission programmingSubmission) {
        return buildLogs.stream().map(buildLogEntry -> {
            // Truncate the log so that it fits into the database
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/BuildLogEntryService.java`
#### Snippet
```java
     * @return boolean indicating a build log should be added to the overall build logs
     */
    public boolean checkIfBuildLogIsNotADuplicate(ProgrammingLanguage programmingLanguage, List<BuildLogEntry> buildLogs, String shortenedLogString) {
        // C outputs duplicate but necessary output, so we need to skip it
        boolean skipLanguage = ProgrammingLanguage.C.equals(programmingLanguage);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseImportService.java`
#### Snippet
```java
     * @return The cloned list of feedback
     */
    private List<Feedback> copyFeedback(List<Feedback> originalFeedbacks, Result newResult, Map<Long, GradingInstruction> gradingInstructionCopyTracker) {
        List<Feedback> newFeedbacks = new ArrayList<>();
        for (final var originalFeedback : originalFeedbacks) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GradingInstruction`
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseImportService.java`
#### Snippet
```java
     * @return The cloned list of feedback
     */
    private List<Feedback> copyFeedback(List<Feedback> originalFeedbacks, Result newResult, Map<Long, GradingInstruction> gradingInstructionCopyTracker) {
        List<Feedback> newFeedbacks = new ArrayList<>();
        for (final var originalFeedback : originalFeedbacks) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `src/main/java/de/tum/in/www1/artemis/service/ZipFileService.java`
#### Snippet
```java
     * @throws IOException if an error occurred while zipping
     */
    public void createZipFile(Path zipFilePath, List<Path> paths, boolean createParentDir) throws IOException {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFilePath))) {
            paths.stream().filter(path -> Files.isReadable(path) && !Files.isDirectory(path)).forEach(path -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `src/main/java/de/tum/in/www1/artemis/service/ZipFileService.java`
#### Snippet
```java
    }

    private void createZipFileFromPathStream(Path zipFilePath, Stream<Path> paths, Path pathsRoot, @Nullable Predicate<Path> extraFilter) throws IOException {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFilePath))) {
            var filteredPaths = paths.filter(path -> Files.isReadable(path) && !Files.isDirectory(path));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `src/main/java/de/tum/in/www1/artemis/service/ZipFileService.java`
#### Snippet
```java
    }

    private void createZipFileFromPathStream(Path zipFilePath, Stream<Path> paths, Path pathsRoot, @Nullable Predicate<Path> extraFilter) throws IOException {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFilePath))) {
            var filteredPaths = paths.filter(path -> Files.isReadable(path) && !Files.isDirectory(path));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextAssessmentQueueService`
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
    public TextSubmissionService(TextSubmissionRepository textSubmissionRepository, SubmissionRepository submissionRepository,
            StudentParticipationRepository studentParticipationRepository, ParticipationService participationService, ResultRepository resultRepository,
            UserRepository userRepository, Optional<TextAssessmentQueueService> textAssessmentQueueService, AuthorizationCheckService authCheckService,
            SubmissionVersionService submissionVersionService, FeedbackRepository feedbackRepository, ExamDateService examDateService, ExerciseDateService exerciseDateService,
            CourseRepository courseRepository, ParticipationRepository participationRepository, ComplaintRepository complaintRepository) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextAssessmentEvent`
in `src/main/java/de/tum/in/www1/artemis/service/TutorEffortService.java`
#### Snippet
```java
     * @return the number of minutes spent
     */
    private double calculateTutorOverallTimeSpent(List<TextAssessmentEvent> tutorEvents) {
        double timeSeconds = 0;
        int index = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PlagiarismCase`
in `src/main/java/de/tum/in/www1/artemis/service/CourseScoreCalculationService.java`
#### Snippet
```java
    }

    private PlagiarismVerdict findMostServerePlagiarismVerdict(Collection<PlagiarismCase> plagiarismCasesForSingleStudent) {
        if (plagiarismCasesForSingleStudent.isEmpty()) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/CourseScoreCalculationService.java`
#### Snippet
```java
     * @return a StudentScore instance with the presentation score, relative and absolute points achieved by the given student and the most severe plagiarism verdict
     */
    public CourseScoresDTO.StudentScore calculateCourseScoreForStudent(Long studentId, List<StudentParticipation> participationsOfStudent, double maxPointsInCourse,
            double reachableMaxPointsInCourse, PlagiarismMapping plagiarismMapping) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/TutorLeaderboardService.java`
#### Snippet
```java

    @NotNull
    private List<TutorLeaderboardDTO> aggregateTutorLeaderboardData(List<User> tutors, List<TutorLeaderboardAssessments> assessments, List<TutorLeaderboardComplaints> complaints,
            List<TutorLeaderboardMoreFeedbackRequests> feedbackRequests, List<TutorLeaderboardComplaintResponses> complaintResponses,
            List<TutorLeaderboardAnsweredMoreFeedbackRequests> answeredFeedbackRequests, boolean isExam) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
     * @return all participations where the individual due date actually changed.
     */
    public List<StudentParticipation> updateIndividualDueDates(final Exercise exercise, final List<StudentParticipation> participations) {
        final List<StudentParticipation> changedParticipations = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final TeamScoreRepository teamScoreRepository;

    public ParticipationService(GitService gitService, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ParticipationRepository participationRepository, StudentParticipationRepository studentParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingExerciseRepository programmingExerciseRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final TeamScoreRepository teamScoreRepository;

    public ParticipationService(GitService gitService, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ParticipationRepository participationRepository, StudentParticipationRepository studentParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingExerciseRepository programmingExerciseRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextFeedbackConflictRequestDTO`
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
     * @return solved conflicts
     */
    private List<FeedbackConflict> findSolvedConflictsInResponse(List<TextFeedbackConflictRequestDTO> textFeedbackConflictRequestDTOS,
            List<FeedbackConflictResponseDTO> feedbackConflictResponseDTOS) {
        List<Long> feedbackIds = textFeedbackConflictRequestDTOS.stream().map(TextFeedbackConflictRequestDTO::getFeedbackId).toList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FeedbackConflictResponseDTO`
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
     */
    private List<FeedbackConflict> findSolvedConflictsInResponse(List<TextFeedbackConflictRequestDTO> textFeedbackConflictRequestDTOS,
            List<FeedbackConflictResponseDTO> feedbackConflictResponseDTOS) {
        List<Long> feedbackIds = textFeedbackConflictRequestDTOS.stream().map(TextFeedbackConflictRequestDTO::getFeedbackId).toList();
        List<FeedbackConflict> storedConflicts = this.feedbackConflictRepository.findAllConflictsByFeedbackList(feedbackIds);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
     */
    @Async
    public void asyncCheckFeedbackConsistency(Set<TextBlock> textBlocks, List<Feedback> feedbackList, long exerciseId) {
        // Null blocks are passed in some test cases
        if (textBlocks == null || feedbackList == null || textBlocks.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
     */
    @Async
    public void asyncCheckFeedbackConsistency(Set<TextBlock> textBlocks, List<Feedback> feedbackList, long exerciseId) {
        // Null blocks are passed in some test cases
        if (textBlocks == null || feedbackList == null || textBlocks.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/CourseExamExportService.java`
#### Snippet
```java
    }

    private void logMessageAndAppendToList(String message, List<String> messageList, Exception ex) {
        log.error(message, ex);
        messageList.add(message);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/CourseExamExportService.java`
#### Snippet
```java
     * @return                      List of paths of the exported exercises
     */
    private List<Path> exportExercises(String notificationTopic, Set<Exercise> exercises, Path outputDir, int progress, int totalExerciseCount, List<String> exportErrors,
            List<ArchivalReportEntry> reportData) {
        List<Path> exportedExercises = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ArchivalReportEntry`
in `src/main/java/de/tum/in/www1/artemis/service/CourseExamExportService.java`
#### Snippet
```java
     * @throws IOException if any error occurs
     */
    private Path writeReport(List<ArchivalReportEntry> data, Path outputDir) throws IOException {
        List<String> lines = data.stream().map(ArchivalReportEntry::toString).collect(Collectors.toCollection(ArrayList::new));
        lines.add(0, ArchivalReportEntry.getHeadline());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java

    @Async
    public void sendNotificationEmailForMultipleUsers(Notification notification, List<User> users, Object notificationSubject) {
        users.forEach(user -> sendNotificationEmail(notification, user, notificationSubject));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentDTO`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamRegistrationService.java`
#### Snippet
```java
     * @return the list of students who could not be registered for the exam, because they could NOT be found in the Artemis database and could NOT be found in the TUM LDAP
     */
    public List<StudentDTO> registerStudentsForExam(Long courseId, Long examId, List<StudentDTO> studentDTOs) {
        var course = courseRepository.findByIdElseThrow(courseId);
        var exam = examRepository.findWithRegisteredUsersById(examId).orElseThrow(() -> new EntityNotFoundException("Exam", examId));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Authority`
in `src/main/java/de/tum/in/www1/artemis/service/dto/UserDTO.java`
#### Snippet
```java
    public UserDTO(Long id, String login, String name, String firstName, String lastName, String email, String visibleRegistrationNumber, boolean activated, String imageUrl,
            String langKey, boolean isInternal, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, ZonedDateTime lastNotificationRead,
            Set<Authority> authorities, Set<String> groups, Set<GuidedTourSetting> guidedTourSettings, Set<Organization> organizations, String accessToken) {

        this.id = id;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Team`
in `src/main/java/de/tum/in/www1/artemis/service/team/TeamImportStrategy.java`
#### Snippet
```java
     * @param destinationExercise Exercise in which the cloned teams should be saved
     */
    protected void cloneTeamsIntoDestinationExercise(List<Team> originalTeams, Exercise destinationExercise) {
        List<Team> clonedTeams = originalTeams.stream().map(Team::new).map(team -> team.exercise(destinationExercise)).toList();
        teamRepository.saveAll(clonedTeams);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Team`
in `src/main/java/de/tum/in/www1/artemis/service/team/strategies/CreateOnlyStrategy.java`
#### Snippet
```java
     * @return an unmodifiable list of those source teams that have no conflicts
     */
    private List<Team> getConflictFreeTeams(List<Team> existingTeams, List<Team> newTeams) {
        Set<String> existingTeamShortNames = existingTeams.stream().map(Team::getShortName).collect(Collectors.toSet());
        Set<User> existingTeamStudents = existingTeams.stream().flatMap(team -> team.getStudents().stream()).collect(Collectors.toSet());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VcsUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    public UserCreationService(UserRepository userRepository, PasswordService passwordService, AuthorityRepository authorityRepository, CourseRepository courseRepository,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService, CacheManager cacheManager,
            OrganizationRepository organizationRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CIUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    public UserCreationService(UserRepository userRepository, PasswordService passwordService, AuthorityRepository authorityRepository, CourseRepository courseRepository,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService, CacheManager cacheManager,
            OrganizationRepository organizationRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/OracleGenerator.java`
#### Snippet
```java
    }

    private static Collection<JavaClass> getClassesFromFiles(List<Path> javaSourceFiles) {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaParameter`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/SerializerUtil.java`
#### Snippet
```java
     * @return The JSON array containing the string representations of the parameter types.
     */
    static JsonArray serializeParameters(List<JavaParameter> parameters) {
        JsonArray parametersArray = new JsonArray();
        for (JavaParameter parameter : parameters) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaAnnotation`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/SerializerUtil.java`
#### Snippet
```java
     * @param annotations List of annotations to filter
     */
    private static void filterAnnotations(List<JavaAnnotation> annotations) {
        annotations.removeIf(javaAnnotation -> javaAnnotation.getType().isA(Override.class.getName()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaField`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
    }

    private void removeTemplateElements(List<JavaField> fieldDiff) {
        // If the template is non-existent, then the enum/attributes diff consists of all the attributes of the solution type.
        if (templateClass != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaAnnotation`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
    }

    private boolean annotationsAreEqual(List<JavaAnnotation> solutionAnnotations, List<JavaAnnotation> templateAnnotations) {
        return checkListEquality(solutionAnnotations.stream().map(annotation -> annotation.getType().getSimpleName()).toList(),
                templateAnnotations.stream().map(annotation -> annotation.getType().getSimpleName()).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaAnnotation`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
    }

    private boolean annotationsAreEqual(List<JavaAnnotation> solutionAnnotations, List<JavaAnnotation> templateAnnotations) {
        return checkListEquality(solutionAnnotations.stream().map(annotation -> annotation.getType().getSimpleName()).toList(),
                templateAnnotations.stream().map(annotation -> annotation.getType().getSimpleName()).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JavaClass`
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
    }

    private boolean isValueDifferent(Function<JavaClass, Boolean> valueGetter) {
        return templateClass == null ? valueGetter.apply(solutionClass) : (valueGetter.apply(solutionClass) && !valueGetter.apply(templateClass));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
     * @param filePaths A list of all paths to the files that should be deleted
     */
    public void deleteFiles(List<Path> filePaths) {
        for (Path filePath : filePaths) {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LdapUserService`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java

    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VcsUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
            ExerciseHintActivationRepository exerciseHintActivationRepository, TutorialGroupRegistrationRepository tutorialGroupRegistrationRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CIUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
            ExerciseHintActivationRepository exerciseHintActivationRepository, TutorialGroupRegistrationRepository tutorialGroupRegistrationRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GuidedTourSetting`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
     * @return the updated user object with the changed guided tour settings
     */
    public User updateGuidedTourSettings(Set<GuidedTourSetting> guidedTourSettings) {
        User loggedInUser = userRepository.getUserWithGroupsAuthoritiesAndGuidedTourSettings();
        loggedInUser.getGuidedTourSettings().clear();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Post`
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostingService.java`
#### Snippet
```java
     * @param postsInCourse list of posts whose authors are populated with their groups, authorities, and authorRole
     */
    void setAuthorRoleOfPostings(List<Post> postsInCourse) {
        // prepares a unique set of userIds that authored the current list of postings
        Set<Long> userIds = new HashSet<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
     * @param startedDate             the Date to which the InitializationDate should be set, in order to link StudentExam <-> participation
     */
    private void setUpExerciseParticipationsAndSubmissionsWithInitializationDate(StudentExam studentExam, List<StudentParticipation> generatedParticipations,
            ZonedDateTime startedDate) {
        User student = studentExam.getUser();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
    }

    private void saveSubmission(User currentUser, List<StudentParticipation> existingParticipations, Exercise exercise) {
        if (exercise instanceof ProgrammingExercise) {
            // there is an edge case in which the student exam does not contain the latest programming submission (e.g. when the user was offline in between)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentExam`
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
     * @return a map of the User as key, and a list of the users exercises as value
     */
    public Map<User, List<Exercise>> getExercisesOfUserMap(Set<StudentExam> studentExams) {
        return studentExams.stream().collect(
                Collectors.toMap(StudentExam::getUser, studentExam -> studentExam.getExercises().stream().filter(exercise -> !(exercise instanceof QuizExercise)).toList()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ExerciseHintService.java`
#### Snippet
```java
    }

    private int subsequentNumberOfSubmissionsForTaskWithStatus(List<Submission> submissions, ProgrammingExerciseTask task, boolean successful) {
        int subsequentNumberSuccessfulSubmissionsForTask = 0;
        for (Submission submission : submissions) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExerciseHint`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ExerciseHintService.java`
#### Snippet
```java
     */
    private Set<ExerciseHint> getAvailableExerciseHintsForTask(Optional<Integer> subsequentNumberSuccessfulSubmissionsForPreviousTask,
            int subsequentNumberOfUnsuccessfulSubmissionsForCurrentTask, Set<ExerciseHint> taskHints) {
        Set<ExerciseHint> availableHintsForTask = new HashSet<>();
        for (ExerciseHint hint : taskHints) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChangeBlock`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/GroupedFile.java`
#### Snippet
```java
    }

    public void setCommonChanges(Collection<ChangeBlock> commonChanges) {
        this.commonChanges = new TreeSet<>(commonChanges);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Set`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
     * @param exercise the exercise for which the report should be updated
     */
    public void createTestwiseCoverageReport(Map<String, Set<CoverageFileReport>> fileReportByTestCaseName, ProgrammingExercise exercise, ProgrammingSubmission submission) {
        // If the report already exists, do not create a new report. This is the case if the build plan will be re-run
        boolean reportAlreadyExists = coverageReportRepository.existsBySubmissionId(submission.getId());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestwiseCoverageReportDTO`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
     * @return coverage file reports mapped by the test case name
     */
    public Map<String, Set<CoverageFileReport>> createTestwiseCoverageFileReportsWithoutTestsByTestCaseName(List<TestwiseCoverageReportDTO> coverageReports) {
        Map<String, Set<CoverageFileReport>> fileReportsByTestName = new HashMap<>();
        coverageReports.forEach(coveragePerTestDTO -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaTypeVariable`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralElement.java`
#### Snippet
```java
     * @return The String representation
     */
    default String getGenericTypesString(List<JavaTypeVariable<JavaGenericDeclaration>> typeParameters) {
        return "<" + typeParameters.stream().map(JavaType::getGenericValue).map(type -> type.substring(1, type.length() - 1)).collect(Collectors.joining(", ")) + ">";
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaParameter`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralElement.java`
#### Snippet
```java
     * @return false if any parameter does not match
     */
    default boolean doParametersMatch(List<String> parameters, List<JavaParameter> solutionParameters, List<JavaTypeVariable<JavaGenericDeclaration>> genericDeclarations) {
        if (parameters == null) {
            return solutionParameters.isEmpty();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaTypeVariable`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralElement.java`
#### Snippet
```java
     * @return false if any parameter does not match
     */
    default boolean doParametersMatch(List<String> parameters, List<JavaParameter> solutionParameters, List<JavaTypeVariable<JavaGenericDeclaration>> genericDeclarations) {
        if (parameters == null) {
            return solutionParameters.isEmpty();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     * @return true if at least one submission is not empty else false
     */
    private boolean hasNonEmptySubmission(Set<Submission> submissions, Exercise exercise) {
        if (exercise instanceof ProgrammingExercise) {
            return submissions.stream().anyMatch(submission -> submission.getType() == SubmissionType.MANUAL);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     * @return exam result for a student who participated in the exam
     */
    private ExamScoresDTO.StudentResult calculateStudentResultWithGrade(StudentExam studentExam, List<StudentParticipation> participationsOfStudent, Exam exam,
            Optional<GradingScale> gradingScale, boolean calculateFirstCorrectionPoints, List<QuizSubmittedAnswerCount> quizSubmittedAnswerCounts,
            PlagiarismMapping plagiarismMapping, ExamBonusCalculator examBonusCalculator) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GradingScale`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     */
    private ExamScoresDTO.StudentResult calculateStudentResultWithGrade(StudentExam studentExam, List<StudentParticipation> participationsOfStudent, Exam exam,
            Optional<GradingScale> gradingScale, boolean calculateFirstCorrectionPoints, List<QuizSubmittedAnswerCount> quizSubmittedAnswerCounts,
            PlagiarismMapping plagiarismMapping, ExamBonusCalculator examBonusCalculator) {
        User user = studentExam.getUser();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     * @return sum of rounded max points if exercises are given, else 0.0
     */
    private double calculateMaxPointsSum(List<Exercise> exercises, Course course) {
        if (exercises != null) {
            var exercisesIncluded = exercises.stream().filter(exercise -> exercise.getIncludedInOverallScore() == IncludedInOverallScore.INCLUDED_COMPLETELY);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GradingScale`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java

    @Nullable
    private ExamBonusCalculator createExamBonusCalculator(Optional<GradingScale> gradingScale, Collection<Long> studentIds) {
        if (gradingScale.isEmpty() || gradingScale.get().getBonusFrom().isEmpty()) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     * @return sum of rounded max bonus points if exercises are given, else 0.0
     */
    private double calculateMaxBonusPointsSum(List<Exercise> exercises, Course course) {
        if (exercises != null) {
            return roundScoreSpecifiedByCourseSettings(exercises.stream().map(this::calculateMaxBonusPoints).reduce(0.0, Double::sum), course);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
    }

    private Map<Long, Double> calculateAchievedPointsForExercises(List<StudentParticipation> participationsOfStudent, Course course, PlagiarismMapping plagiarismMapping) {
        return participationsOfStudent.stream().collect(Collectors.toMap(participation -> participation.getExercise().getId(), participation -> {
            PlagiarismCase plagiarismCase = plagiarismMapping.getPlagiarismCase(participation.getStudent().get().getId(), participation.getExercise().getId());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLObject`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/CommunicationDiagramParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<UMLCommunicationLink> parseCommunicationLink(JsonObject relationshipJson, Map<String, UMLObject> objectMap) throws IOException {

        UMLObject source = UMLModelParser.findElement(relationshipJson, objectMap, RELATIONSHIP_SOURCE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/SyntaxTreeParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<SyntaxTreeLink> parseSyntaxTreeLink(JsonObject relationshipJson, Map<String, UMLElement> allSyntaxTreeElements) throws IOException {
        UMLElement source = UMLModelParser.findElement(relationshipJson, allSyntaxTreeElements, RELATIONSHIP_SOURCE);
        UMLElement target = UMLModelParser.findElement(relationshipJson, allSyntaxTreeElements, RELATIONSHIP_TARGET);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void resolveParentComponent(Map<String, UMLElement> allUmlElementsMap, Map<UMLElement, String> ownerRelationships) {
        for (var ownerEntry : ownerRelationships.entrySet()) {
            String ownerId = ownerEntry.getValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void resolveParentComponent(Map<String, UMLElement> allUmlElementsMap, Map<UMLElement, String> ownerRelationships) {
        for (var ownerEntry : ownerRelationships.entrySet()) {
            String ownerId = ownerEntry.getValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void findOwner(Map<UMLElement, String> ownerRelationships, JsonObject jsonObject, UMLElement umlElement) {
        if (jsonObject.has(ELEMENT_OWNER) && !jsonObject.get(ELEMENT_OWNER).isJsonNull()) {
            String ownerId = jsonObject.get(ELEMENT_OWNER).getAsString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @return the UMLComponent object parsed from the JSON object
     */
    protected static void findOwner(Map<UMLElement, String> ownerRelationships, JsonObject jsonObject, UMLElement umlElement) {
        if (jsonObject.has(ELEMENT_OWNER) && !jsonObject.get(ELEMENT_OWNER).isJsonNull()) {
            String ownerId = jsonObject.get(ELEMENT_OWNER).getAsString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
     * @return the UMLComponentInterface object parsed from the JSON object
     */
    protected static Optional<UMLComponentRelationship> parseComponentRelationship(JsonObject relationshipJson, Map<String, UMLElement> allUmlElementsMap) throws IOException {

        String relationshipType = relationshipJson.get(RELATIONSHIP_TYPE).getAsString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/PetriNetParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<PetriNetArc> parsePetriNetArc(JsonObject relationshipJson, Map<String, UMLElement> allSyntaxTreeElements) throws IOException {
        String multiplicity = relationshipJson.get(ELEMENT_NAME).getAsString();
        UMLElement source = UMLModelParser.findElement(relationshipJson, allSyntaxTreeElements, RELATIONSHIP_SOURCE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLActivityElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ActivityDiagramParser.java`
#### Snippet
```java
     * @throws IOException when no activity elements could be found in the activityElementMap for the source and target ID in the JSON object
     */
    private static UMLControlFlow parseControlFlow(JsonObject controlFlowJson, Map<String, UMLActivityElement> activityElementMap) throws IOException {
        UMLActivityElement source = UMLModelParser.findElement(controlFlowJson, activityElementMap, RELATIONSHIP_SOURCE);
        UMLActivityElement target = UMLModelParser.findElement(controlFlowJson, activityElementMap, RELATIONSHIP_TARGET);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Set`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/GroupGitDiffAndCoverageEntriesByFilePathAndTestCase.java`
#### Snippet
```java
    }

    private List<GroupedFile> createGroupedFiles(Map<String, Set<ProgrammingExerciseGitDiffEntry>> gitDiffEntriesPerFile,
            Map<String, Set<TestwiseCoverageReportEntry>> coverageEntriesPerFile, SortedSet<String> commonFilePaths) {
        return commonFilePaths.stream().flatMap(filePath -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Set`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/GroupGitDiffAndCoverageEntriesByFilePathAndTestCase.java`
#### Snippet
```java

    private List<GroupedFile> createGroupedFiles(Map<String, Set<ProgrammingExerciseGitDiffEntry>> gitDiffEntriesPerFile,
            Map<String, Set<TestwiseCoverageReportEntry>> coverageEntriesPerFile, SortedSet<String> commonFilePaths) {
        return commonFilePaths.stream().flatMap(filePath -> {
            var gitDiffEntries = gitDiffEntriesPerFile.get(filePath);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/UseCaseDiagramParser.java`
#### Snippet
```java
     * @throws IOException when no object could be found in the allUmlElementsMap for the source and target ID in the JSON object
     */
    private static Optional<UMLUseCaseAssociation> parseUseCaseAssociation(JsonObject relationshipJson, Map<String, UMLElement> allUmlElementsMap) throws IOException {

        String relationshipType = relationshipJson.get(RELATIONSHIP_TYPE).getAsString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/FlowchartParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<FlowchartFlowline> parseFlowchartFlowline(JsonObject relationshipJson, Map<String, UMLElement> allFlowchartElements) throws IOException {
        UMLElement source = UMLModelParser.findElement(relationshipJson, allFlowchartElements, RELATIONSHIP_SOURCE);
        UMLElement target = UMLModelParser.findElement(relationshipJson, allFlowchartElements, RELATIONSHIP_TARGET);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLObject`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ObjectDiagramParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<UMLObjectLink> parseObjectLink(JsonObject relationshipJson, Map<String, UMLObject> objectMap) throws IOException {

        UMLObject source = UMLModelParser.findElement(relationshipJson, objectMap, RELATIONSHIP_SOURCE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLPackage`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
     * @return the UMLClass object parsed from the JSON object
     */
    private static UMLClass parseClass(String classType, JsonObject classJson, JsonArray modelElements, Map<String, UMLPackage> umlPackageMap) {
        Map<String, JsonObject> jsonElementMap = UMLModelParser.generateJsonElementMap(modelElements);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLClass`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
     * @throws IOException when no class could be found in the classMap for the source and target ID in the JSON object
     */
    private static Optional<UMLRelationship> parseRelationship(JsonObject relationshipJson, Map<String, UMLClass> classMap, Map<String, UMLPackage> packageMap) throws IOException {
        String relationshipType = relationshipJson.get(RELATIONSHIP_TYPE).getAsString();
        relationshipType = CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, relationshipType);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralTestCaseService.java`
#### Snippet
```java
    }

    private Map<String, JavaClass> getClassesFromFiles(List<Path> javaSourceFiles) throws StructuralSolutionEntryGenerationException {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaClass`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralTestCaseService.java`
#### Snippet
```java
     */
    private List<ProgrammingExerciseSolutionEntry> generateStructuralSolutionEntries(Set<ProgrammingExerciseTestCase> testCases, Repository solutionRepository,
            StructuralClassElements[] classElements, Map<String, JavaClass> solutionClasses) {
        return Arrays.stream(classElements).flatMap(classElement -> {
            var packageName = classElement.getStructuralClass().getPackageName();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralTestCaseService.java`
#### Snippet
```java
     * @return A SolutionEntry if testCase is present otherwise null
     */
    private ProgrammingExerciseSolutionEntry createSolutionEntry(String filePath, String code, Optional<ProgrammingExerciseTestCase> testCase) {
        return testCase.map(actualTestCase -> {
            var solutionEntry = new ProgrammingExerciseSolutionEntry();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLMessage`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/communication/UMLCommunicationLink.java`
#### Snippet
```java
    private final List<UMLMessage> messages;

    public UMLCommunicationLink(UMLObject source, UMLObject target, List<UMLMessage> messages, String jsonElementID) {
        super(jsonElementID);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/FeedbackSelector.java`
#### Snippet
```java
     * @return the feedback that is selected for suggestion
     */
    public static Feedback selectFeedback(ModelElement modelElement, List<Feedback> feedbackList, Result result) {
        if (feedbackList == null || feedbackList.isEmpty()) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ModelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
     * @return an unmodifiable list of clusters that have more than one element in them
     */
    public List<ModelCluster> buildClusters(List<ModelingSubmission> modelingSubmissions, ModelingExercise exercise) {
        // The elements that has no other similar elements or are the first of their kind
        HashSet<UMLElement> uniqueElements = new HashSet<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UMLElement`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
     * @param elements the model containing the model elements for which the context should be set
     */
    private static void setContextOfModelElements(List<UMLElement> elements) {
        Context context;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
     * @param submission the submission that element belongs to
     */
    private void selectCluster(UMLElement element, Set<UMLElement> uniqueModelElements, Map<Integer, ModelCluster> clusters, ModelingExercise exercise,
            ModelingSubmission submission) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VcsUserManagementService`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/UserScheduleService.java`
#### Snippet
```java
    private final Map<Long, ScheduledFuture<?>> nonActivatedAccountsFutures = new ConcurrentHashMap<>();

    public UserScheduleService(UserRepository userRepository, Optional<VcsUserManagementService> optionalVcsUserManagementService, CacheManager cacheManager) {
        this.userRepository = userRepository;
        this.optionalVcsUserManagementService = optionalVcsUserManagementService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtheneScheduleService`
in `src/main/java/de/tum/in/www1/artemis/service/messaging/InstanceMessageReceiveService.java`
#### Snippet
```java
            ModelingExerciseRepository modelingExerciseRepository, ModelingExerciseScheduleService modelingExerciseScheduleService,
            ExamMonitoringScheduleService examMonitoringScheduleService, TextExerciseRepository textExerciseRepository, ExerciseRepository exerciseRepository,
            Optional<AtheneScheduleService> atheneScheduleService, HazelcastInstance hazelcastInstance, UserRepository userRepository, UserScheduleService userScheduleService,
            NotificationScheduleService notificationScheduleService, ParticipantScoreSchedulerService participantScoreSchedulerService) {
        this.programmingExerciseRepository = programmingExerciseRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/AutomaticProgrammingExerciseCleanupService.java`
#### Snippet
```java
    }

    private void checkLastResults(ProgrammingExerciseStudentParticipation participation, Set<ProgrammingExerciseStudentParticipation> participationsWithBuildPlanToDelete,
            AtomicLong countNoResult, AtomicLong countSuccessfulLatestResult, AtomicLong countUnsuccessfulLatestResult) {
        Result result = participation.findLatestResult();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/AutomaticProgrammingExerciseCleanupService.java`
#### Snippet
```java
    // returns false if the participation should be cleaned after the criteria checked in this method
    private boolean checkBuildAndTestExercises(ProgrammingExercise programmingExercise, ProgrammingExerciseStudentParticipation participation,
            Set<ProgrammingExerciseStudentParticipation> participationsWithBuildPlanToDelete, AtomicLong countAfterBuildAndTestDate) {
        if (programmingExercise.getBuildAndTestStudentSubmissionsAfterDueDate() != null) {
            if (programmingExercise.getBuildAndTestStudentSubmissionsAfterDueDate().isAfter(now())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationServerHealthIndicator.java`
#### Snippet
```java
    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    public ContinuousIntegrationServerHealthIndicator(Optional<ContinuousIntegrationService> continuousIntegrationService) {
        this.continuousIntegrationService = continuousIntegrationService;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Authority`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
    }

    private static Collection<GrantedAuthority> toGrantedAuthorities(final Collection<Authority> authorities) {
        return authorities.stream().map(Authority::getName).map(SimpleGrantedAuthority::new).collect(Collectors.toSet());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/VersionControlServerHealthIndicator.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    public VersionControlServerHealthIndicator(Optional<VersionControlService> versionControlService) {
        this.versionControlService = versionControlService;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BambooRepositoryDTO`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/BitbucketBambooUpdateService.java`
#### Snippet
```java
    }

    private BambooRepositoryDTO lookupRepository(String name, List<BambooRepositoryDTO> list) {
        var repository = list.stream().filter(repo -> name.equals(repo.getName())).findFirst();
        if (repository.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/BitbucketBambooUpdateService.java`
#### Snippet
```java
    @Override
    public void updatePlanRepository(String bambooProjectKey, String buildPlanKey, String bambooRepositoryName, String bitbucketProjectKey, String bitbucketRepositoryName,
            String branchName, Optional<List<String>> optionalTriggeredByRepositories) {
        try {
            log.debug("Update plan repository for build plan {}", buildPlanKey);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ProgrammingExerciseScheduleService.java`
#### Snippet
```java
     */
    private List<ProgrammingExerciseStudentParticipation> invokeOperationOnAllParticipationsThatSatisfy(Long programmingExerciseId,
            BiConsumer<ProgrammingExercise, ProgrammingExerciseStudentParticipation> operation, Predicate<ProgrammingExerciseStudentParticipation> condition,
            String operationName) {
        log.info("Invoking (scheduled) task '{}' for programming exercise with id {}.", operationName, programmingExerciseId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ProgrammingExerciseScheduleService.java`
#### Snippet
```java
     */
    private List<ProgrammingExerciseStudentParticipation> invokeOperationOnAllParticipationsThatSatisfy(Long programmingExerciseId,
            BiConsumer<ProgrammingExercise, ProgrammingExerciseStudentParticipation> operation, Predicate<ProgrammingExerciseStudentParticipation> condition,
            String operationName) {
        log.info("Invoking (scheduled) task '{}' for programming exercise with id {}.", operationName, programmingExerciseId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ProgrammingExerciseScheduleService.java`
#### Snippet
```java
     */
    private List<ProgrammingExerciseStudentParticipation> invokeOperationOnAllParticipationsThatSatisfy(Long programmingExerciseId,
            BiConsumer<ProgrammingExercise, ProgrammingExerciseStudentParticipation> operation, Predicate<ProgrammingExerciseStudentParticipation> condition,
            String operationName) {
        log.info("Invoking (scheduled) task '{}' for programming exercise with id {}.", operationName, programmingExerciseId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LdapUserService`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java

    public JiraAuthenticationProvider(UserRepository userRepository, @Qualifier("jiraRestTemplate") RestTemplate restTemplate,
            @Qualifier("shortTimeoutJiraRestTemplate") RestTemplate shortTimeoutRestTemplate, Optional<LdapUserService> ldapUserService, PasswordService passwordService,
            AuthorityService authorityService, UserCreationService userCreationService) {
        super(userRepository, passwordService, userCreationService);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractContinuousIntegrationService.java`
#### Snippet
```java
     * @return the number of matching log entries
     */
    protected Integer countMatchingLogs(List<BuildLogEntry> buildLogEntries, String searchString) {
        return Math.toIntExact(buildLogEntries.stream().filter(buildLogEntry -> buildLogEntry.getLog().contains(searchString)).count());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractContinuousIntegrationService.java`
#### Snippet
```java
     * @return the ZonedDateTime of the found BuildLogEntry, or null if none was found
     */
    protected ZonedDateTime getTimestampForLogEntry(List<BuildLogEntry> buildLogEntries, Predicate<BuildLogEntry> matchingPredicate, int skipEntries) {
        return buildLogEntries.stream().filter(matchingPredicate).skip(skipEntries).findFirst().map(BuildLogEntry::getTime).orElse(null);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BuildLogEntry`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractContinuousIntegrationService.java`
#### Snippet
```java
     * @return the ZonedDateTime of the found BuildLogEntry, or null if none was found
     */
    protected ZonedDateTime getTimestampForLogEntry(List<BuildLogEntry> buildLogEntries, Predicate<BuildLogEntry> matchingPredicate, int skipEntries) {
        return buildLogEntries.stream().filter(matchingPredicate).skip(skipEntries).findFirst().map(BuildLogEntry::getTime).orElse(null);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextBlock`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneService.java`
#### Snippet
```java
     * @param exerciseId   The exerciseId of the exercise the blocks belong to
     */
    public void processClusters(List<TextCluster> textClusters, Map<String, TextBlock> textBlockMap, Long exerciseId) {

        final List<TextCluster> savedClusters = textClusterRepository.saveAll(textClusters);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TextSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneService.java`
#### Snippet
```java
         */
        @NotNull
        private static List<TextSubmission> createSubmissionDTOs(@NotNull List<TextSubmission> submissions) {
            return submissions.stream().map(textSubmission -> {
                final TextSubmission submission = new TextSubmission();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Transactional(readOnly = true) // TODO: remove transactional
    public void filterLateSubmissions(Repository repository, Optional<Submission> lastValidSubmission, ZonedDateTime filterLateSubmissionsDate) {
        if (filterLateSubmissionsDate == null) {
            // No date set in client and exercise has no due date
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabService.java`
#### Snippet
```java
     * @param accessLevel the access level to give
     */
    private void addUsersToExerciseGroup(List<User> users, ProgrammingExercise exercise, AccessLevel accessLevel) {
        for (final var user : users) {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabService.java`
#### Snippet
```java

    @Override
    public void setRepositoryPermissionsToReadOnly(VcsRepositoryUrl repositoryUrl, String projectKey, Set<User> users) {
        users.forEach(user -> updateMemberPermissionInRepository(repositoryUrl, user.getLogin(), REPORTER));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationUpdateService`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java

    public BambooService(GitService gitService, ProgrammingSubmissionRepository programmingSubmissionRepository,
            Optional<ContinuousIntegrationUpdateService> continuousIntegrationUpdateService, BambooBuildPlanService bambooBuildPlanService, FeedbackRepository feedbackRepository,
            @Qualifier("bambooRestTemplate") RestTemplate restTemplate, @Qualifier("shortTimeoutBambooRestTemplate") RestTemplate shortTimeoutRestTemplate, ObjectMapper mapper,
            UrlService urlService, BuildLogEntryService buildLogService, TestwiseCoverageService testwiseCoverageService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends QuizSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
     * @return                  the number of processed submissions (submit or timeout)
     */
    private int saveQuizSubmissionWithParticipationAndResultToDatabase(@NotNull QuizExercise quizExercise, Map<String, QuizSubmission> userSubmissionMap, Map<String, Long> userBatchMap, Map<Long, QuizBatch> batchCache) {

        int count = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
     * @return                  the number of processed submissions (submit or timeout)
     */
    private int saveQuizSubmissionWithParticipationAndResultToDatabase(@NotNull QuizExercise quizExercise, Map<String, QuizSubmission> userSubmissionMap, Map<String, Long> userBatchMap, Map<Long, QuizBatch> batchCache) {

        int count = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends QuizBatch`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
     * @return                  the number of processed submissions (submit or timeout)
     */
    private int saveQuizSubmissionWithParticipationAndResultToDatabase(@NotNull QuizExercise quizExercise, Map<String, QuizSubmission> userSubmissionMap, Map<String, Long> userBatchMap, Map<Long, QuizBatch> batchCache) {

        int count = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
     * @param accessLevel           access level that shall be set for a user
     */
    private void updateMemberExercisePermissions(List<ProgrammingExercise> programmingExercises, Long gitlabUserId, AccessLevel accessLevel) {
        programmingExercises.forEach(exercise -> {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
     * @param updatedCourse         course with updated groups
     */
    private void setPermissionsForNewGroupMembers(List<ProgrammingExercise> programmingExercises, Set<User> newUsers, Course updatedCourse) {
        final var userApi = gitlabApi.getUserApi();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
     * @param accessLevel the access level that the user should get as part of the group/project
     */
    public void addUserToGroupsOfExercises(Long userId, List<ProgrammingExercise> exercises, AccessLevel accessLevel) throws GitLabException {
        for (final var exercise : exercises) {
            addUserToGroup(exercise.getProjectKey(), userId, accessLevel);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
     * @param gitlabUserId          gitlabUserId for which the permissions shall be updated
     */
    private void removeMemberFromExercises(List<ProgrammingExercise> programmingExercises, Long gitlabUserId) {
        programmingExercises.forEach(exercise -> {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
     * @param updatedCourse         course with updated groups
     */
    private void updateOldGroupMembers(List<ProgrammingExercise> programmingExercises, Set<User> oldUsers, Course updatedCourse) {
        final var userApi = gitlabApi.getUserApi();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsUserManagementService.java`
#### Snippet
```java
     * @param programmingExercises list of programmingExercises for which the permissions should be changed
     */
    private void assignPermissionsToInstructorAndEditorAndTAsForCourse(Course course, List<ProgrammingExercise> programmingExercises) {
        var instructors = userRepository.findAllInGroupWithAuthorities(course.getInstructorGroupName()).stream().map(User::getLogin).collect(Collectors.toSet());
        var editors = userRepository.findAllInGroupWithAuthorities(course.getEditorGroupName()).stream().map(User::getLogin).collect(Collectors.toSet());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsUserManagementService.java`
#### Snippet
```java
     */
    private void removePermissionsFromInstructorsAndEditorsAndTAsForCourse(String instructorGroup, String editorGroup, String teachingAssistantGroup, Course course,
            List<ProgrammingExercise> programmingExercises) {
        // Fetch all instructors and editors and teaching assistants belonging to the group that was removed from the course.
        var oldInstructors = userRepository.findAllInGroupWithAuthorities(instructorGroup);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PlagiarismCase`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/PlagiarismCaseService.java`
#### Snippet
```java
         * @return a populated PlagiarismMapping instance
         */
        public static PlagiarismMapping createFromPlagiarismCases(Collection<PlagiarismCase> plagiarismCases) {
            Map<Long, Map<Long, PlagiarismCase>> outerMap = new HashMap<>();
            for (PlagiarismCase plagiarismCase : plagiarismCases) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Task`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * @param artifacts the list containing all artifacts for the build plan to be created
     */
    private void modifyBuildConfigurationForStaticCodeAnalysisForJavaAndKotlinExercise(boolean isMavenProject, List<Task<?, ?>> finalTasks, List<Artifact> artifacts) {
        // Create artifacts and a final task for the execution of static code analysis
        List<StaticCodeAnalysisTool> staticCodeAnalysisTools = StaticCodeAnalysisTool.getToolsForProgrammingLanguage(ProgrammingLanguage.JAVA);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Artifact`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * @param artifacts the list containing all artifacts for the build plan to be created
     */
    private void modifyBuildConfigurationForStaticCodeAnalysisForJavaAndKotlinExercise(boolean isMavenProject, List<Task<?, ?>> finalTasks, List<Artifact> artifacts) {
        // Create artifacts and a final task for the execution of static code analysis
        List<StaticCodeAnalysisTool> staticCodeAnalysisTools = StaticCodeAnalysisTool.getToolsForProgrammingLanguage(ProgrammingLanguage.JAVA);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    public BambooBuildPlanService(ResourceLoaderService resourceLoaderService, BambooServer bambooServer, Environment env, Optional<VersionControlService> versionControlService,
            ProgrammingLanguageConfiguration programmingLanguageConfiguration) {
        this.resourceLoaderService = resourceLoaderService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Task`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * @param finalTasks the list containing the final tasks for the build plan to be created
     */
    private void modifyBuildConfigurationForSequentialTestsForJavaAndKotlinExercise(boolean isMavenProject, List<Task<?, ?>> defaultTasks, List<Task<?, ?>> finalTasks) {
        if (isMavenProject) {
            defaultTasks
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Task`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * @param finalTasks the list containing the final tasks for the build plan to be created
     */
    private void modifyBuildConfigurationForSequentialTestsForJavaAndKotlinExercise(boolean isMavenProject, List<Task<?, ?>> defaultTasks, List<Task<?, ?>> finalTasks) {
        if (isMavenProject) {
            defaultTasks
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Task`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     * @param artifacts the list containing all artifacts for the build plan to be created
     */
    private void modifyBuildConfigurationForRegularTestsForJavaAndKotlinExercise(boolean isMavenProject, boolean recordTestwiseCoverage, List<Task<?, ?>> defaultTasks,
            List<Task<?, ?>> finalTasks, List<Artifact> artifacts) {
        if (isMavenProject) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Task`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     */
    private void modifyBuildConfigurationForRegularTestsForJavaAndKotlinExercise(boolean isMavenProject, boolean recordTestwiseCoverage, List<Task<?, ?>> defaultTasks,
            List<Task<?, ?>> finalTasks, List<Artifact> artifacts) {
        if (isMavenProject) {
            String goals = "clean test";
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Artifact`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
     */
    private void modifyBuildConfigurationForRegularTestsForJavaAndKotlinExercise(boolean isMavenProject, boolean recordTestwiseCoverage, List<Task<?, ?>> defaultTasks,
            List<Task<?, ?>> finalTasks, List<Artifact> artifacts) {
        if (isMavenProject) {
            String goals = "clean test";
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    }

    private VcsCheckoutTask createCheckoutTask(String assignmentPath, String testPath, Optional<String> solutionPath, List<AuxiliaryRepository> auxiliaryRepositories) {
        List<CheckoutItem> checkoutItems = new ArrayList<>();
        checkoutItems.add(new CheckoutItem().repository(new VcsRepositoryIdentifier().name(TEST_REPO_NAME)).path(testPath));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
    public ProgrammingExerciseParticipationService(SolutionProgrammingExerciseParticipationRepository solutionParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository studentParticipationRepository, ParticipationRepository participationRepository, TeamRepository teamRepository,
            TemplateProgrammingExerciseParticipationRepository templateParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService, ProgrammingExerciseRepository programmingExerciseRepository) {
        this.studentParticipationRepository = studentParticipationRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
    }

    private List<Repository> downloadRepositories(ProgrammingExercise programmingExercise, List<ProgrammingExerciseParticipation> participations, String targetPath) {
        // Used for sending progress notifications
        var topic = plagiarismWebsocketService.getProgrammingExercisePlagiarismCheckTopic(programmingExercise.getId());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Repository`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
    }

    private void deleteLocalRepositories(List<Repository> repositories) {
        repositories.parallelStream().forEach(repository -> {
            var localPath = repository.getLocalPath();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
     * @param participations the participations for which the method triggerBuild should be executed.
     */
    public void triggerBuildForParticipations(List<ProgrammingExerciseStudentParticipation> participations) {
        var index = 0;
        for (var participation : participations) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java

    public ProgrammingTriggerService(ProgrammingSubmissionRepository programmingSubmissionRepository, ProgrammingExerciseRepository programmingExerciseRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, AuditEventRepository auditEventRepository, ResultRepository resultRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingMessagingService programmingMessagingService) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ModelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ModelingPlagiarismDetectionService.java`
#### Snippet
```java
     * @return List of submission id pairs and similarity score
     */
    public ModelingPlagiarismResult checkPlagiarism(List<ModelingSubmission> modelingSubmissions, double minimumSimilarity, int minimumModelSize, int minimumScore,
            Long exerciseId) {
        String topic = plagiarismWebsocketService.getModelingExercisePlagiarismCheckTopic(exerciseId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PlagiarismComparison`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ModelingPlagiarismDetectionService.java`
#### Snippet
```java
     * Calculate the similarity distribution of the given comparisons.
     */
    private int[] calculateSimilarityDistribution(Set<PlagiarismComparison<ModelingSubmissionElement>> comparisons) {
        int[] similarityDistribution = new int[10];

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCaseDTO`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
     * @throws EntityNotFoundException if the programming exercise could not be found.
     */
    public Set<ProgrammingExerciseTestCase> update(Long exerciseId, Set<ProgrammingExerciseTestCaseDTO> testCaseProgrammingExerciseTestCaseDTOS) throws EntityNotFoundException {
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTestCasesById(exerciseId)
                .orElseThrow(() -> new EntityNotFoundException("Programming Exercise", exerciseId));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
     * @return true, if the sum of weights is valid as specified above.
     */
    public static boolean isTestCaseWeightSumValid(ProgrammingExercise exercise, Set<ProgrammingExerciseTestCase> testCases) {
        if (testCases.isEmpty()) {
            return true;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
    }

    private Set<ProgrammingExerciseTestCase> getTestCasesFromFeedbacks(List<Feedback> feedbacks, ProgrammingExercise exercise) {
        // Filter out sca feedback and create test cases out of the feedbacks
        return feedbacks.stream().filter(feedback -> !feedback.isStaticCodeAnalysisFeedback())
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
     * @param programmingLanguage the programming language of the exercise
     */
    public void setTestCaseType(Set<ProgrammingExerciseTestCase> testCases, ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage != ProgrammingLanguage.JAVA) {
            testCases.forEach(testCase -> testCase.setType(ProgrammingExerciseTestCaseType.DEFAULT));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
    }

    private Set<ProgrammingExerciseTestCase> getTestCasesWithUpdatedActivation(Set<ProgrammingExerciseTestCase> existingTestCases,
            Set<ProgrammingExerciseTestCase> testCasesFromFeedbacks) {
        // We compare the new generated test cases from feedback with the existing test cases from the database
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
    public ProgrammingSubmissionService(ProgrammingSubmissionRepository programmingSubmissionRepository, ProgrammingExerciseRepository programmingExerciseRepository,
            SubmissionRepository submissionRepository, UserRepository userRepository, AuthorizationCheckService authCheckService,
            ProgrammingMessagingService programmingMessagingService, Optional<VersionControlService> versionControlService, ResultRepository resultRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, ExamSubmissionService examSubmissionService, GitService gitService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            SubmissionRepository submissionRepository, UserRepository userRepository, AuthorizationCheckService authCheckService,
            ProgrammingMessagingService programmingMessagingService, Optional<VersionControlService> versionControlService, ResultRepository resultRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, ExamSubmissionService examSubmissionService, GitService gitService,
            StudentParticipationRepository studentParticipationRepository, FeedbackRepository feedbackRepository, ExamDateService examDateService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/AuxiliaryRepositoryService.java`
#### Snippet
```java
     * @param newAuxiliaryRepositories The newly added auxiliary repositories
     */
    public void validateAndAddAuxiliaryRepositoriesOfProgrammingExercise(ProgrammingExercise programmingExercise, List<AuxiliaryRepository> newAuxiliaryRepositories) {
        List<AuxiliaryRepository> auxiliaryRepositories = new ArrayList<>(Objects
                .requireNonNullElse(programmingExercise.getAuxiliaryRepositories(), new ArrayList<AuxiliaryRepository>()).stream().filter(repo -> repo.getId() != null).toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/AuxiliaryRepositoryService.java`
#### Snippet
```java

    private void validateAndUpdateExistingAuxiliaryRepositoriesOfProgrammingExercise(ProgrammingExercise programmingExercise,
            List<AuxiliaryRepository> updatedAuxiliaryRepositories, ProgrammingExercise updatedExercise) {
        // Get all repositories that are unchanged and are still present in the updated exercise
        List<AuxiliaryRepository> auxiliaryRepositories = new ArrayList<>(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/AuxiliaryRepositoryService.java`
#### Snippet
```java
    }

    private void validateAuxiliaryRepositoryCheckoutDirectoryDuplication(AuxiliaryRepository auxiliaryRepository, List<AuxiliaryRepository> otherRepositories) {
        for (AuxiliaryRepository repo : otherRepositories) {
            if (repo.getCheckoutDirectory() != null && repo.getCheckoutDirectory().equals(auxiliaryRepository.getCheckoutDirectory())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/AuxiliaryRepositoryService.java`
#### Snippet
```java
    }

    private void validateAuxiliaryRepositoryNameDuplication(AuxiliaryRepository auxiliaryRepository, List<AuxiliaryRepository> otherRepositories) {
        for (AuxiliaryRepository existingRepository : otherRepositories) {
            if (existingRepository.getName().equals(auxiliaryRepository.getName())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketService.java`
#### Snippet
```java

    @Override
    public void setRepositoryPermissionsToReadOnly(VcsRepositoryUrl repositoryUrl, String projectKey, Set<User> users) throws BitbucketException {
        users.forEach(user -> setStudentRepositoryPermission(repositoryUrl, projectKey, user.getLogin(), VersionControlRepositoryPermission.REPO_READ));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java

    public ProgrammingExerciseImportBasicService(ExerciseHintService exerciseHintService, ExerciseHintRepository exerciseHintRepository,
            Optional<VersionControlService> versionControlService, ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository, StaticCodeAnalysisCategoryRepository staticCodeAnalysisCategoryRepository,
            ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseService programmingExerciseService, StaticCodeAnalysisService staticCodeAnalysisService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TutorialGroupSession`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java

    @NotNull
    private Set<TutorialGroupSession> findOverlappingExistingSessions(TutorialGroup tutorialGroup, List<TutorialGroupSession> individualSessions) {
        var overlappingIndividualSessions = new HashSet<TutorialGroupSession>();
        for (var individualSession : individualSessions) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TutorialGroupSchedule`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
     * @param newSchedule                 the new schedule of the tutorial group
     */
    public void updateSchedule(TutorialGroupsConfiguration tutorialGroupsConfiguration, TutorialGroup tutorialGroup, Optional<TutorialGroupSchedule> oldSchedule,
            Optional<TutorialGroupSchedule> newSchedule) {
        if (oldSchedule.isPresent() && newSchedule.isPresent()) { // update existing schedule -> delete all scheduled sessions and recreate using the new schedule
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TutorialGroupSchedule`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
     */
    public void updateSchedule(TutorialGroupsConfiguration tutorialGroupsConfiguration, TutorialGroup tutorialGroup, Optional<TutorialGroupSchedule> oldSchedule,
            Optional<TutorialGroupSchedule> newSchedule) {
        if (oldSchedule.isPresent() && newSchedule.isPresent()) { // update existing schedule -> delete all scheduled sessions and recreate using the new schedule
            updateAllSessionsToNewSchedule(tutorialGroupsConfiguration, tutorialGroup, oldSchedule.get(), newSchedule.get());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NotificationSetting`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
     */
    private Map<NotificationType, Boolean> convertNotificationSettingsToNotificationTypesWithActivationStatus(NotificationSettingsCommunicationChannel communicationChannel,
            Set<NotificationSetting> notificationSettings) {
        Map<NotificationType, Boolean> resultingMap = new HashMap<>();
        for (NotificationSetting setting : notificationSettings) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NotificationSetting`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
     * @return a set of settings ids
     */
    private Set<String> extractSettingsIdsFromNotificationSettingsSet(Set<NotificationSetting> notificationSettings) {
        Set<String> settingsIds = new HashSet<>();
        notificationSettings.forEach(setting -> settingsIds.add(setting.getSettingId()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    }

    private void updateAuxiliaryRepositoriesForNewExercise(List<AuxiliaryRepository> newRepositories, List<AuxiliaryRepository> oldRepositories,
            AbstractBaseProgrammingExerciseParticipation participation, String targetExerciseProjectKey, ProgrammingExercise newExercise) {
        for (int i = 0; i < newRepositories.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuxiliaryRepository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    }

    private void updateAuxiliaryRepositoriesForNewExercise(List<AuxiliaryRepository> newRepositories, List<AuxiliaryRepository> oldRepositories,
            AbstractBaseProgrammingExerciseParticipation participation, String targetExerciseProjectKey, ProgrammingExercise newExercise) {
        for (int i = 0; i < newRepositories.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final ProgrammingExerciseImportBasicService programmingExerciseImportBasicService;

    public ProgrammingExerciseImportService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseService programmingExerciseService, GitService gitService, FileService fileService, UserRepository userRepository,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, UrlService urlService, TemplateUpgradePolicy templateUpgradePolicy,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final ProgrammingExerciseImportBasicService programmingExerciseImportBasicService;

    public ProgrammingExerciseImportService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseService programmingExerciseService, GitService gitService, FileService fileService, UserRepository userRepository,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, UrlService urlService, TemplateUpgradePolicy templateUpgradePolicy,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JWK`
in `src/main/java/de/tum/in/www1/artemis/security/OAuth2JWKSService.java`
#### Snippet
```java
    }

    private void generateAndAddKey(ClientRegistration clientRegistration, List<JWK> keys) {
        if (clientRegistration == null) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/repository/SubmittedAnswerRepository.java`
#### Snippet
```java
     * @param participations the student participations for which the submitted answers in quiz submissions should be loaded
     */
    default void loadQuizSubmissionsSubmittedAnswers(Collection<StudentParticipation> participations) {
        for (var participation : participations) {
            if (participation.getExercise() instanceof QuizExercise) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

    public ProgrammingExerciseService(ProgrammingExerciseRepository programmingExerciseRepository, FileService fileService, GitService gitService,
            Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository, ParticipationService participationService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exam`
in `src/main/java/de/tum/in/www1/artemis/repository/ExamRepository.java`
#### Snippet
```java
     * @return only the visible exams
     */
    default Set<Exam> filterVisibleExams(Set<Exam> exams) {
        return exams.stream().filter(exam -> Boolean.TRUE.equals(exam.isVisibleToStudents())).collect(Collectors.toSet());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

    public ProgrammingExerciseService(ProgrammingExerciseRepository programmingExerciseRepository, FileService fileService, GitService gitService,
            Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository, ParticipationService participationService,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/repository/StudentParticipationRepository.java`
#### Snippet
```java
     * @return an unmodifiable list of participations of the user in the exercises
     */
    default List<StudentParticipation> getAllParticipationsOfUserInExercises(User user, Set<Exercise> exercises) {
        Map<ExerciseMode, List<Exercise>> exercisesGroupedByExerciseMode = exercises.stream().collect(Collectors.groupingBy(Exercise::getMode));
        List<Exercise> individualExercises = Objects.requireNonNullElse(exercisesGroupedByExerciseMode.get(ExerciseMode.INDIVIDUAL), List.of());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TutorialGroupRegistrationImportDTO`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java

    private Map<TutorialGroupRegistrationImportDTO, User> filterOutWithoutMatchingUser(Course course, Set<TutorialGroupRegistrationImportDTO> registrations,
            Set<TutorialGroupRegistrationImportDTO> failedRegistrations) {
        Set<User> matchingUsers = tryToFindMatchingUsers(course, registrations);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java
    }

    private void registerMultipleStudentsToTutorialGroup(Set<User> students, TutorialGroup tutorialGroup, TutorialGroupRegistrationType registrationType, User responsibleUser,
            boolean sendNotification) {
        Set<User> registeredStudents = tutorialGroupRegistrationRepository.findAllByTutorialGroupAndType(tutorialGroup, registrationType).stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentDTO`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java
     * @return The students that could not be found and thus not registered.
     */
    public Set<StudentDTO> registerMultipleStudents(TutorialGroup tutorialGroup, Set<StudentDTO> studentDTOs, TutorialGroupRegistrationType registrationType,
            User responsibleUser) {
        Set<User> foundStudents = new HashSet<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java
    }

    private Map<TutorialGroupRegistrationImportDTO, User> filterOutMultipleRegistrationsForSameUser(Map<TutorialGroupRegistrationImportDTO, User> registrationToUser,
            Set<TutorialGroupRegistrationImportDTO> failedRegistrations) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TutorialGroupRegistrationImportDTO`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java

    private Map<TutorialGroupRegistrationImportDTO, User> filterOutMultipleRegistrationsForSameUser(Map<TutorialGroupRegistrationImportDTO, User> registrationToUser,
            Set<TutorialGroupRegistrationImportDTO> failedRegistrations) {

        // reverse the map
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TutorialGroupRegistrationImportDTO`
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupService.java`
#### Snippet
```java

    private Set<TutorialGroupRegistrationImportDTO> filterOutWithoutTitle(Set<TutorialGroupRegistrationImportDTO> registrations,
            Set<TutorialGroupRegistrationImportDTO> failedRegistrations) {
        var registrationsWithTitle = new HashSet<TutorialGroupRegistrationImportDTO>();
        var registrationsWithoutTitle = new HashSet<TutorialGroupRegistrationImportDTO>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExampleSubmission`
in `src/main/java/de/tum/in/www1/artemis/repository/ResultRepository.java`
#### Snippet
```java
     * @return list of result for example submissions
     */
    default List<Result> getResultForExampleSubmissions(Set<ExampleSubmission> exampleSubmissions) {
        List<Result> results = new ArrayList<>();
        for (ExampleSubmission exampleSubmission : exampleSubmissions) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/repository/ResultRepository.java`
#### Snippet
```java
     * @return the total points
     */
    default double calculateTotalPoints(List<Feedback> assessments) {
        double totalPoints = 0.0;
        var gradingInstructions = new HashMap<Long, Integer>(); // { instructionId: noOfEncounters }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/repository/StudentExamRepository.java`
#### Snippet
```java
     * @return List of StudentExams generated for the given users
     */
    default List<StudentExam> createRandomStudentExams(Exam exam, Set<User> users) {
        List<StudentExam> studentExams = new ArrayList<>();
        SecureRandom random = new SecureRandom();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @param startDate the startDate of the result list
     */
    default void sortDataIntoWeeks(List<StatisticsEntry> outcome, List<Integer> result, ZonedDateTime startDate) {
        for (StatisticsEntry entry : outcome) {
            ZonedDateTime date = (ZonedDateTime) entry.getDay();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @return A List<StatisticsData> with only distinct users per timeslot
     */
    private List<StatisticsEntry> filterDuplicatedUsers(SpanType span, List<StatisticsEntry> result, ZonedDateTime startDate, GraphType graphType) {
        Map<Integer, List<String>> users = new HashMap<>();
        for (StatisticsEntry listElement : result) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @param startDate the startDate of the result list
     */
    default void sortDataIntoMonths(List<StatisticsEntry> outcome, List<Integer> result, ZonedDateTime startDate) {
        for (StatisticsEntry entry : outcome) {
            ZonedDateTime date = (ZonedDateTime) entry.getDay();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @param startDate the startDate of the result list
     */
    default void sortDataIntoDays(List<StatisticsEntry> outcome, List<Integer> result, ZonedDateTime startDate) {
        for (StatisticsEntry entry : outcome) {
            ZonedDateTime date = (ZonedDateTime) entry.getDay();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @param index the index of the map which should be considered, can be a date or an integer
     */
    default void addUserToTimeslot(Map<Integer, List<String>> users, StatisticsEntry userStatisticEntry, Integer index) {
        String username = userStatisticEntry.getUsername();
        List<String> usersInSameSlot = users.get(index);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatisticsEntry`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @param result the list in which the converted outcome should be inserted
     */
    default void sortDataIntoHours(List<StatisticsEntry> outcome, List<Integer> result) {
        for (StatisticsEntry entry : outcome) {
            int hourIndex = ((ZonedDateTime) entry.getDay()).getHour();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `src/main/java/de/tum/in/www1/artemis/repository/StatisticsRepository.java`
#### Snippet
```java
     * @return A List<StatisticsData> with no duplicated user per timeslot
     */
    private List<StatisticsEntry> mergeUsersPerTimeslotIntoList(Map<Integer, List<String>> users, SpanType span, ZonedDateTime startDate) {
        List<StatisticsEntry> returnList = new ArrayList<>();
        users.forEach((timeIndex, userList) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Feedback`
in `src/main/java/de/tum/in/www1/artemis/repository/FeedbackRepository.java`
#### Snippet
```java
     * @return all elements of the original list with the saved feedback items (i.e. the ones without result) having an id now.
     */
    default List<Feedback> saveFeedbacks(List<Feedback> feedbackList) {
        List<Feedback> updatedFeedbackList = new ArrayList<>();
        for (var feedback : feedbackList) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GradingCriterion`
in `src/main/java/de/tum/in/www1/artemis/repository/FeedbackRepository.java`
#### Snippet
```java
     * @return list including feedback entries which are associated with the grading instructions
     */
    default List<Feedback> findFeedbackByExerciseGradingCriteria(List<GradingCriterion> gradingCriteria) {
        List<Long> gradingInstructionsIds = gradingCriteria.stream().flatMap(gradingCriterion -> gradingCriterion.getStructuredGradingInstructions().stream())
                .map(GradingInstruction::getId).toList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StaticCodeAnalysisReportDTO`
in `src/main/java/de/tum/in/www1/artemis/repository/FeedbackRepository.java`
#### Snippet
```java
     * @return Feedback objects representing the static code analysis findings
     */
    default List<Feedback> createFeedbackFromStaticCodeAnalysisReports(List<StaticCodeAnalysisReportDTO> reports) {
        ObjectMapper mapper = new ObjectMapper();
        List<Feedback> feedbackList = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exercise`
in `src/main/java/de/tum/in/www1/artemis/repository/CourseRepository.java`
#### Snippet
```java
     * @return the filtered and relevant exercises for manual assessment
     */
    default Set<Exercise> getInterestingExercisesForAssessmentDashboards(Set<Exercise> exercises) {
        return exercises.stream()
                .filter(exercise -> exercise instanceof TextExercise || exercise instanceof ModelingExercise || exercise instanceof FileUploadExercise
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java

    @NotNull
    private User unwrapOptionalUser(Optional<User> optionalUser, String currentUserLogin) {
        return optionalUser.orElseThrow(() -> new EntityNotFoundException("No user found with login: " + currentUserLogin));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends User`
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java
     * @return A list of filtered users
     */
    default List<User> findAllUserInGroupAndNotIn(String groupName, Collection<User> excludedUsers) {
        // For an empty list, we have to use another query, because Hibernate builds an invalid query with empty lists
        if (!excludedUsers.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseStudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
     * @return List of zip file paths
     */
    public List<Path> exportStudentRepositories(ProgrammingExercise programmingExercise, @NotNull List<ProgrammingExerciseStudentParticipation> participations,
            RepositoryExportOptionsDTO repositoryExportOptions, Path outputDir, List<String> exportErrors) {
        var programmingExerciseId = programmingExercise.getId();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
     */
    public List<Path> exportStudentRepositories(ProgrammingExercise programmingExercise, @NotNull List<ProgrammingExerciseStudentParticipation> participations,
            RepositoryExportOptionsDTO repositoryExportOptions, Path outputDir, List<String> exportErrors) {
        var programmingExerciseId = programmingExercise.getId();
        if (repositoryExportOptions.isExportAllParticipants()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java

    private Optional<File> exportRepository(VcsRepositoryUrl repositoryUrl, String repositoryName, String zippedRepoName, ProgrammingExercise exercise, Path outputDir,
            @Nullable Predicate<Path> contentFilter, List<String> exportErrors) {
        try {
            // It's not guaranteed that the repository url is defined (old courses).
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
    }

    private Optional<ProgrammingExercise> loadExerciseForRepoExport(long exerciseId, String repositoryName, List<String> exportErrors) {
        var exerciseOrEmpty = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(exerciseId);
        if (exerciseOrEmpty.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ArchivalReportEntry`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
     */
    public Path exportProgrammingExerciseRepositories(ProgrammingExercise exercise, Boolean includingStudentRepos, Path outputDir, List<String> exportErrors,
            List<ArchivalReportEntry> reportData) {
        log.info("Exporting programming exercise {} with title {}", exercise.getId(), exercise.getTitle());
        // List to add paths of files that should be contained in the zip folder of exported programming exercise repositories:
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param allTests of the given programming exercise.
     */
    private void createFeedbackForNotExecutedTests(Result result, Set<ProgrammingExerciseTestCase> allTests) {
        List<Feedback> feedbacksForNotExecutedTestCases = allTests.stream().filter(wasNotExecuted(result))
                .map(testCase -> new Feedback().type(FeedbackType.AUTOMATIC).text(testCase.getTestName()).detailText("Test was not executed.")).toList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param allTests of the given programming exercise.
     */
    private void setVisibilityForFeedbacksWithTestCase(Result result, final Set<ProgrammingExerciseTestCase> allTests) {
        for (Feedback feedback : result.getFeedbacks()) {
            allTests.stream().filter(testCase -> testCase.getTestName().equalsIgnoreCase(feedback.getText())).findFirst()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param issuesSingleStudent The issues map for one student
     */
    private void mergeCategoryIssuesMap(final Map<String, Map<Integer, Integer>> issuesAllStudents, final Map<String, Integer> issuesSingleStudent) {
        for (var entry : issuesSingleStudent.entrySet()) {
            final String category = entry.getKey();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param testCases of the programming exercise.
     */
    private void retainAutomaticFeedbacksWithTestCase(Result result, final Set<ProgrammingExerciseTestCase> testCases) {
        // Remove automatic feedbacks not associated with test cases
        result.getFeedbacks().removeIf(feedback -> feedback.getType() == FeedbackType.AUTOMATIC && !feedback.isStaticCodeAnalysisFeedback()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @return a set of test cases that are visible to the student.
     */
    private Set<ProgrammingExerciseTestCase> filterTestCasesForStudents(final Set<ProgrammingExerciseTestCase> testCases, boolean isBeforeDueDate) {
        return testCases.stream().filter(testCase -> !testCase.isInvisible()).filter(testCase -> !(isBeforeDueDate && testCase.isAfterDueDate())).collect(Collectors.toSet());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @return the total score for this result without penalty deductions.
     */
    private double calculateSuccessfulTestPoints(final ProgrammingExercise programmingExercise, final Result result, final Set<ProgrammingExerciseTestCase> successfulTestCases,
            int totalTestCaseCount, double weightSum) {
        double successfulTestPoints = successfulTestCases.stream().mapToDouble(test -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StudentParticipation`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @return all results that have been updated.
     */
    private Stream<Result> updateResults(final ProgrammingExercise exercise, final Set<ProgrammingExerciseTestCase> allTestCases, final List<StudentParticipation> participations) {
        final Set<ProgrammingExerciseTestCase> testCasesBeforeDueDate = filterTestCasesForStudents(allTestCases, true);
        final Set<ProgrammingExerciseTestCase> testCasesAfterDueDate = filterTestCasesForStudents(allTestCases, false);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProgrammingExerciseTestCase`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @return the final total score that should be given to the result.
     */
    private double calculateScore(final ProgrammingExercise programmingExercise, final Set<ProgrammingExerciseTestCase> allTests, final Result result,
            final Set<ProgrammingExerciseTestCase> successfulTestCases, final List<Feedback> staticCodeAnalysisFeedback, boolean applySubmissionPolicy) {
        if (successfulTestCases.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param feedback The given feedback object
     */
    private void addFeedbackToStatistics(final Map<String, Integer> categoryIssuesMap, final Map<String, ProgrammingExerciseGradingStatisticsDTO.TestCaseStats> testCaseStatsMap,
            final Feedback feedback) {
        if (feedback.isStaticCodeAnalysisFeedback()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * @param feedback The given feedback object
     */
    private void addFeedbackToStatistics(final Map<String, Integer> categoryIssuesMap, final Map<String, ProgrammingExerciseGradingStatisticsDTO.TestCaseStats> testCaseStatsMap,
            final Feedback feedback) {
        if (feedback.isStaticCodeAnalysisFeedback()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContinuousIntegrationService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java

    public ProgrammingExerciseGradingService(ProgrammingExerciseTestCaseService testCaseService, StudentParticipationRepository studentParticipationRepository,
            ResultRepository resultRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ProgrammingTriggerService programmingTriggerService, SimpMessageSendingOperations messagingTemplate, StaticCodeAnalysisService staticCodeAnalysisService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VersionControlService`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java

    public ProgrammingExerciseGradingService(ProgrammingExerciseTestCaseService testCaseService, StudentParticipationRepository studentParticipationRepository,
            ResultRepository resultRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ProgrammingTriggerService programmingTriggerService, SimpMessageSendingOperations messagingTemplate, StaticCodeAnalysisService staticCodeAnalysisService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/domain/notification/TutorialGroupNotification.java`
#### Snippet
```java

    @JsonIgnore
    public final static Set<NotificationType> TUTORIAL_GROUP_NOTIFICATION_TYPES = Set.of(TUTORIAL_GROUP_DELETED, TUTORIAL_GROUP_UPDATED);

    // ToDo: Idea: Reuse jhi_type_column to allow tutorial group notifications to be sent to only for example officially registered students and not self registered students
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final public`
in `src/main/java/de/tum/in/www1/artemis/service/ldap/LdapUserDto.java`
#### Snippet
```java
@Entry(base = "ou=users", objectClasses = { "imdPerson" })
@Profile("ldap")
final public class LdapUserDto {

    @Id
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract public`
in `src/main/java/de/tum/in/www1/artemis/service/team/TeamImportStrategy.java`
#### Snippet
```java
    }

    abstract public void importTeams(Exercise sourceExercise, Exercise destinationExercise);

    abstract public void importTeams(Exercise exercise, List<Team> teams);
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract public`
in `src/main/java/de/tum/in/www1/artemis/service/team/TeamImportStrategy.java`
#### Snippet
```java
    abstract public void importTeams(Exercise sourceExercise, Exercise destinationExercise);

    abstract public void importTeams(Exercise exercise, List<Team> teams);

    /**
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_EXERCISE_POST = "notification.exercise-notification.new-exercise-post";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_REPLY_FOR_EXERCISE_POST = "notification.exercise-notification.new-reply-for-exercise-post";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__FILE_SUBMISSION_SUCCESSFUL = "notification.exercise-notification.file-submission-successful";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_REPLY_FOR_EXERCISE_POST = "notification.exercise-notification.new-reply-for-exercise-post";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__FILE_SUBMISSION_SUCCESSFUL = "notification.exercise-notification.file-submission-successful";

    // lecture notification settings group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_COURSE_POST = "notification.course-wide-discussion.new-course-post";

    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_REPLY_FOR_COURSE_POST = "notification.course-wide-discussion.new-reply-for-course-post";

    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_ANNOUNCEMENT_POST = "notification.course-wide-discussion.new-announcement-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__TUTOR_NOTIFICATION__TUTORIAL_GROUP_REGISTRATION = "notification.tutor-notification.tutorial-group-registration";

    public final static String NOTIFICATION__TUTOR_NOTIFICATION__TUTORIAL_GROUP_ASSIGN_UNASSIGN = "notification.tutor-notification.tutorial-group-assign-unassign";

    // editor notification setting group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__TUTORIAL_GROUP_NOTIFICATION__TUTORIAL_GROUP_REGISTRATION = "notification.tutorial-group-notification.tutorial-group-registration";

    public final static String NOTIFICATION__TUTORIAL_GROUP_NOTIFICATION__TUTORIAL_GROUP_DELETE_UPDATE = "notification.tutorial-group-notification.tutorial-group-delete-update";

    // tutor notification setting group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__LECTURE_NOTIFICATION__NEW_LECTURE_POST = "notification.lecture-notification.new-lecture-post";

    public final static String NOTIFICATION__LECTURE_NOTIFICATION__NEW_REPLY_FOR_LECTURE_POST = "notification.lecture-notification.new-reply-for-lecture-post";

    // tutorial group notification settings group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_RELEASED = "notification.exercise-notification.exercise-released";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_OPEN_FOR_PRACTICE = "notification.exercise-notification.exercise-open-for-practice";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_EXERCISE_POST = "notification.exercise-notification.new-exercise-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    // if webapp or email is not explicitly set for a specific setting -> no support for this communication channel for this setting
    // this has to match the properties in the notification settings structure file on the client that hides the related UI elements
    public final static Set<NotificationSetting> DEFAULT_NOTIFICATION_SETTINGS = new HashSet<>(Arrays.asList(
            // weekly summary
            new NotificationSetting(false, false, NOTIFICATION__WEEKLY_SUMMARY__BASIC_WEEKLY_SUMMARY),
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__LECTURE_NOTIFICATION__ATTACHMENT_CHANGES = "notification.lecture-notification.attachment-changes";

    public final static String NOTIFICATION__LECTURE_NOTIFICATION__NEW_LECTURE_POST = "notification.lecture-notification.new-lecture-post";

    public final static String NOTIFICATION__LECTURE_NOTIFICATION__NEW_REPLY_FOR_LECTURE_POST = "notification.lecture-notification.new-reply-for-lecture-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_REPLY_FOR_COURSE_POST = "notification.course-wide-discussion.new-reply-for-course-post";

    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_ANNOUNCEMENT_POST = "notification.course-wide-discussion.new-announcement-post";

    // exercise notification setting group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // lecture notification settings group
    public final static String NOTIFICATION__LECTURE_NOTIFICATION__ATTACHMENT_CHANGES = "notification.lecture-notification.attachment-changes";

    public final static String NOTIFICATION__LECTURE_NOTIFICATION__NEW_LECTURE_POST = "notification.lecture-notification.new-lecture-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
     * Each SettingId can be based on multiple different NotificationTypes
     */
    private final static Map<String, NotificationType[]> NOTIFICATION_SETTING_ID_TO_NOTIFICATION_TYPES_MAP = Map.ofEntries(
            Map.entry(NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_SUBMISSION_ASSESSED, new NotificationType[] { EXERCISE_SUBMISSION_ASSESSED }),
            Map.entry(NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_RELEASED, new NotificationType[] { EXERCISE_RELEASED }),
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // instructor notification setting group
    public final static String NOTIFICATION__INSTRUCTOR_NOTIFICATION__COURSE_AND_EXAM_ARCHIVING_STARTED = "notification.instructor-notification.course-and-exam-archiving-started";

    // if webapp or email is not explicitly set for a specific setting -> no support for this communication channel for this setting
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // editor notification setting group
    public final static String NOTIFICATION__EDITOR_NOTIFICATION__PROGRAMMING_TEST_CASES_CHANGED = "notification.editor-notification.programming-test-cases-changed";

    // instructor notification setting group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // tutorial group notification settings group
    public final static String NOTIFICATION__TUTORIAL_GROUP_NOTIFICATION__TUTORIAL_GROUP_REGISTRATION = "notification.tutorial-group-notification.tutorial-group-registration";

    public final static String NOTIFICATION__TUTORIAL_GROUP_NOTIFICATION__TUTORIAL_GROUP_DELETE_UPDATE = "notification.tutorial-group-notification.tutorial-group-delete-update";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // tutor notification setting group
    public final static String NOTIFICATION__TUTOR_NOTIFICATION__TUTORIAL_GROUP_REGISTRATION = "notification.tutor-notification.tutorial-group-registration";

    public final static String NOTIFICATION__TUTOR_NOTIFICATION__TUTORIAL_GROUP_ASSIGN_UNASSIGN = "notification.tutor-notification.tutorial-group-assign-unassign";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_OPEN_FOR_PRACTICE = "notification.exercise-notification.exercise-open-for-practice";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_EXERCISE_POST = "notification.exercise-notification.new-exercise-post";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__NEW_REPLY_FOR_EXERCISE_POST = "notification.exercise-notification.new-reply-for-exercise-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_SUBMISSION_ASSESSED = "notification.exercise-notification.exercise-submission-assessed";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_RELEASED = "notification.exercise-notification.exercise-released";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_OPEN_FOR_PRACTICE = "notification.exercise-notification.exercise-open-for-practice";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // course wide discussion notification setting group
    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_COURSE_POST = "notification.course-wide-discussion.new-course-post";

    public final static String NOTIFICATION__COURSE_WIDE_DISCUSSION__NEW_REPLY_FOR_COURSE_POST = "notification.course-wide-discussion.new-reply-for-course-post";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // weekly summary
    public final static String NOTIFICATION__WEEKLY_SUMMARY__BASIC_WEEKLY_SUMMARY = "notification.weekly-summary.basic-weekly-summary";

    // course wide discussion notification setting group
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java

    // exercise notification setting group
    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_SUBMISSION_ASSESSED = "notification.exercise-notification.exercise-submission-assessed";

    public final static String NOTIFICATION__EXERCISE_NOTIFICATION__EXERCISE_RELEASED = "notification.exercise-notification.exercise-released";
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Getter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    }

    public ZonedDateTime getHideNotificationsUntil() {
        return hideNotificationsUntil;
    }
```

### RuleId[ruleID=NullableProblems]
Setter parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    }

    public void setHideNotificationsUntil(ZonedDateTime hideNotificationsUntil) {
        this.hideNotificationsUntil = hideNotificationsUntil;
    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionExportService.java`
#### Snippet
```java
        if (((ModelingSubmission) submission).getModel() == null) {
            if (!file.exists()) {
                file.createNewFile(); // create empty file if submission is empty
            }
        }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java

        if (!dir.exists()) {
            dir.mkdirs();
        }
        Files.copy(file.getInputStream(), savedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionExportService.java`
#### Snippet
```java
        if (((TextSubmission) submission).getText() == null) {
            if (!file.exists()) {
                file.createNewFile(); // create empty file if submission is empty
            }
        }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionExportService.java`
#### Snippet
```java

        if (!submissionExportFile.exists()) {
            submissionExportFile.createNewFile();
        }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setExecutable()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
            // make gradlew executable
            if (targetFilePath.endsWith("gradlew")) {
                copyPath.toFile().setExecutable(true);
            }
        }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/TextPlagiarismDetectionService.java`
#### Snippet
```java
            final var submissionsFolderName = "./tmp/submissions";
            final var submissionFolderFile = new File(submissionsFolderName);
            submissionFolderFile.mkdirs();

            final List<TextSubmission> textSubmissions = textSubmissionsForComparison(textExercise, minimumScore, minimumSize);
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ResponseUtil` is the same as one of its superclass' names
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/ResponseUtil.java`
#### Snippet
```java
 * use e.g. AccessForbiddenException, EntityNotFoundException, BadRequestAlertException, ConflictException
 */
public final class ResponseUtil implements tech.jhipster.web.util.ResponseUtil {

    /**
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `File` is the same as one of its superclass' names
in `src/main/java/de/tum/in/www1/artemis/domain/File.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class File extends java.io.File {

    private Repository repository;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Claims` is the same as one of its superclass' names
in `src/main/java/de/tum/in/www1/artemis/domain/lti/Claims.java`
#### Snippet
```java
package de.tum.in.www1.artemis.domain.lti;

public class Claims extends uk.ac.ox.ctl.lti13.lti.Claims {

    public static final String AGS_CLAIM = "https://purl.imsglobal.org/spec/lti-ags/claim/endpoint";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Repository` is the same as one of its superclass' names
in `src/main/java/de/tum/in/www1/artemis/domain/Repository.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.participation.ProgrammingExerciseParticipation;

public class Repository extends org.eclipse.jgit.internal.storage.file.FileRepository {

    private ProgrammingExerciseParticipation participation;
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common parts with variables can be extracted from 'if'
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
        List<FeedbackConflict> feedbackConflicts = this.feedbackConflictRepository.findAllWithEagerFeedbackResultAndSubmissionByFeedbackId(feedbackId);
        Set<TextSubmission> textSubmissionSet = feedbackConflicts.stream().map(conflict -> {
            if (conflict.getFirstFeedback().getId() == feedbackId) {
                TextSubmission textSubmission = (TextSubmission) conflict.getSecondFeedback().getResult().getSubmission();
                textSubmission.setResults(List.of(conflict.getSecondFeedback().getResult()));
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/LectureUnitService.java`
#### Snippet
```java
        Optional<LectureUnitCompletion> existingCompletion = lectureUnitCompletionRepository.findByLectureUnitIdAndUserId(lectureUnit.getId(), user.getId());
        if (completed) {
            if (!existingCompletion.isPresent()) {
                // Create a completion status for this lecture unit (only if it does not exist)
                LectureUnitCompletion completion = new LectureUnitCompletion();
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/metis/ConversationService.java`
#### Snippet
```java
                .findAny();

        if (!existingConversation.isPresent()) {
            conversation.setCourse(course);

```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingSubmissionResource.java`
#### Snippet
```java
            @RequestParam(defaultValue = "false") boolean assessedByTutor, @RequestParam(value = "correction-round", defaultValue = "0") int correctionRound) {
        log.debug("REST request to get all modeling upload submissions");
        return super.getAllSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
            @RequestParam(defaultValue = "false") boolean assessedByTutor, @RequestParam(value = "correction-round", defaultValue = "0") int correctionRound) {
        log.debug("REST request to get all TextSubmissions");
        return super.getAllSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadSubmissionResource.java`
#### Snippet
```java
            @RequestParam(defaultValue = "false") boolean assessedByTutor, @RequestParam(value = "correction-round", defaultValue = "0") int correctionRound) {
        log.debug("REST request to get all file upload submissions");
        return super.getAllSubmissions(exerciseId, submittedOnly, assessedByTutor, correctionRound);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadAssessmentResource.java`
#### Snippet
```java
        // if a result exists, we want to override it, otherwise create a new one
        var resultId = submission.getLatestResult() != null ? submission.getLatestResult().getId() : null;
        return super.saveAssessment(submission, submit, feedbacks, resultId);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
        }
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.TEACHING_ASSISTANT, submission.getParticipation().getExercise(), null);
        return super.cancelAssessment(submissionId);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
        checkAuthorization(exercise, null);
        final TextSubmission textSubmission = textSubmissionRepository.getTextSubmissionWithResultAndTextBlocksAndFeedbackByResultIdElseThrow(resultId);
        ResponseEntity<Result> response = super.saveAssessment(textSubmission, true, textAssessment.getFeedbacks(), resultId);

        if (response.getStatusCode().is2xxSuccessful()) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, textExercise, null);
        }
        final var response = super.saveExampleAssessment(exampleSubmissionId, textAssessment.getFeedbacks());
        if (response.getStatusCode().is2xxSuccessful()) {
            final Submission submission = response.getBody().getSubmission();
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.TEACHING_ASSISTANT, result.getParticipation().getExercise(), null);
        final var textSubmission = textSubmissionRepository.getTextSubmissionWithResultAndTextBlocksAndFeedbackByResultIdElseThrow(resultId);
        ResponseEntity<Result> response = super.saveAssessment(textSubmission, false, textAssessment.getFeedbacks(), resultId);

        if (response.getStatusCode().is2xxSuccessful()) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingAssessmentResource.java`
#### Snippet
```java
    public ResponseEntity<Result> saveModelingExampleAssessment(@PathVariable long exampleSubmissionId, @RequestBody List<Feedback> feedbacks) {
        log.debug("REST request to save modeling example assessment : {}", exampleSubmissionId);
        return super.saveExampleAssessment(exampleSubmissionId, feedbacks);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingAssessmentResource.java`
#### Snippet
```java
    public ResponseEntity<Result> getModelingExampleAssessment(@PathVariable long exerciseId, @PathVariable long submissionId) {
        log.debug("REST request to get example assessment for tutors text assessment: {}", submissionId);
        return super.getExampleAssessment(exerciseId, submissionId);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingAssessmentResource.java`
#### Snippet
```java
            @RequestParam(value = "submit", defaultValue = "false") boolean submit, @RequestBody List<Feedback> feedbacks) {
        Submission submission = submissionRepository.findOneWithEagerResultAndFeedback(submissionId);
        return super.saveAssessment(submission, submit, feedbacks, resultId);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Set<String>> getFileNames(@PathVariable Long participationId) {
        return super.executeAndCheckForExceptions(() -> {
            Repository repository = getRepository(participationId, RepositoryActionType.READ, true);
            var nonFolderFileNames = super.repositoryService.getFiles(repository).entrySet().stream().filter(mapEntry -> mapEntry.getValue().equals(FileType.FILE))
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        return super.executeAndCheckForExceptions(() -> {
            Repository repository = getRepository(participationId, RepositoryActionType.READ, true);
            var nonFolderFileNames = super.repositoryService.getFiles(repository).entrySet().stream().filter(mapEntry -> mapEntry.getValue().equals(FileType.FILE))
                    .map(Map.Entry::getKey).collect(Collectors.toSet());

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Map<String, String>> getFilesWithContent(@PathVariable Long participationId) {
        return super.executeAndCheckForExceptions(() -> {
            Repository repository = getRepository(participationId, RepositoryActionType.READ, true);
            var filesWithContent = super.repositoryService.getFilesWithContent(repository);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        return super.executeAndCheckForExceptions(() -> {
            Repository repository = getRepository(participationId, RepositoryActionType.READ, true);
            var filesWithContent = super.repositoryService.getFilesWithContent(repository);
            return new ResponseEntity<>(filesWithContent, HttpStatus.OK);
        });
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Map<String, Boolean>> getFilesWithInformationAboutChange(@PathVariable Long participationId) {
        return super.executeAndCheckForExceptions(() -> {
            Repository repository = getRepository(participationId, RepositoryActionType.READ, true);
            var participation = participationRepository.findByIdElseThrow(participationId);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java

            Repository templateRepository = getRepository(exercise.getTemplateParticipation().getId(), RepositoryActionType.READ, true);
            var filesWithInformationAboutChange = super.repositoryService.getFilesWithInformationAboutChange(repository, templateRepository);
            return new ResponseEntity<>(filesWithInformationAboutChange, HttpStatus.OK);
        });
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/config/lti/CustomLti13Configurer.java`
#### Snippet
```java

    public CustomLti13Configurer() {
        super.ltiPath(LTI13_BASE_PATH);
        super.loginInitiationPath(LOGIN_INITIATION_PATH);
        super.loginPath(LOGIN_PATH);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/config/lti/CustomLti13Configurer.java`
#### Snippet
```java
    public CustomLti13Configurer() {
        super.ltiPath(LTI13_BASE_PATH);
        super.loginInitiationPath(LOGIN_INITIATION_PATH);
        super.loginPath(LOGIN_PATH);
        super.useState(true);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/config/lti/CustomLti13Configurer.java`
#### Snippet
```java
        super.ltiPath(LTI13_BASE_PATH);
        super.loginInitiationPath(LOGIN_INITIATION_PATH);
        super.loginPath(LOGIN_PATH);
        super.useState(true);
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/config/lti/CustomLti13Configurer.java`
#### Snippet
```java
        super.loginInitiationPath(LOGIN_INITIATION_PATH);
        super.loginPath(LOGIN_PATH);
        super.useState(true);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/domain/File.java`
#### Snippet
```java
    @Override
    public String toString() {
        String path = repository.getLocalPath().relativize(super.toPath()).toString();
        // Unify separator
        if (!"/".equals(File.separator)) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/domain/Repository.java`
#### Snippet
```java

    public void closeBeforeDelete() {
        super.close();
        super.doClose();
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/domain/Repository.java`
#### Snippet
```java
    public void closeBeforeDelete() {
        super.close();
        super.doClose();
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionService.java`
#### Snippet
```java
    public Optional<ModelingSubmission> findRandomSubmissionWithoutExistingAssessment(boolean lockSubmission, int correctionRound, ModelingExercise modelingExercise,
            boolean isExamMode) {
        var submissionWithoutResult = super.getRandomAssessableSubmission(modelingExercise, isExamMode, correctionRound);
        if (submissionWithoutResult.isEmpty()) {
            return Optional.empty();
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/QuizExerciseImportService.java`
#### Snippet
```java
        QuizExercise newExercise = new QuizExercise();

        super.copyExerciseBasis(newExercise, importedExercise, new HashMap<>());
        newExercise.setRandomizeQuestionOrder(importedExercise.isRandomizeQuestionOrder());
        newExercise.setAllowedNumberOfAttempts(importedExercise.getAllowedNumberOfAttempts());
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadExerciseImportService.java`
#### Snippet
```java
        log.debug("Copying the exercise basis from {}", importedExercise);
        FileUploadExercise newExercise = new FileUploadExercise();
        super.copyExerciseBasis(newExercise, importedExercise, new HashMap<>());
        newExercise.setFilePattern(importedExercise.getFilePattern());
        newExercise.setExampleSolution(importedExercise.getExampleSolution());
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
        TextExercise newExercise = new TextExercise();

        super.copyExerciseBasis(newExercise, importedExercise, gradingInstructionCopyTracker);
        newExercise.setExampleSolution(importedExercise.getExampleSolution());
        return newExercise;
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
     */
    public Optional<FileUploadSubmission> getRandomFileUploadSubmissionEligibleForNewAssessment(FileUploadExercise fileUploadExercise, boolean examMode, int correctionRound) {
        var submissionWithoutResult = super.getRandomAssessableSubmission(fileUploadExercise, examMode, correctionRound);
        if (submissionWithoutResult.isPresent()) {
            FileUploadSubmission fileUploadSubmission = (FileUploadSubmission) submissionWithoutResult.get();
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/ModelingExerciseImportService.java`
#### Snippet
```java
        log.debug("Copying the exercise basis from {}", importedExercise);
        ModelingExercise newExercise = new ModelingExercise();
        super.copyExerciseBasis(newExercise, importedExercise, gradingInstructionCopyTracker);

        newExercise.setDiagramType(((ModelingExercise) importedExercise).getDiagramType());
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
            return textAssessmentQueueService.get().getProposedTextSubmission(textExercise);
        }
        var submissionWithoutResult = super.getRandomAssessableSubmission(textExercise, examMode, correctionRound);
        if (submissionWithoutResult.isPresent()) {
            TextSubmission textSubmission = (TextSubmission) submissionWithoutResult.get();
```

## RuleId[ruleID=SlowListContainsAll]
### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/web/rest/lecture/LectureUnitResource.java`
#### Snippet
```java

        // Ensure that all received lecture unit ids are already part of the lecture
        if (!lectureUnits.stream().map(LectureUnit::getId).toList().containsAll(orderedLectureUnitIds)) {
            throw new ConflictException("Received lecture unit is not part of the lecture", "LectureUnit", "lectureMismatch");
        }
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java
            return false;
        }
        return solutionList.containsAll(templateList);
    }

```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/JavaClassDiff.java`
#### Snippet
```java

        // Otherwise, check if the list of the parameters of the solution executable contains all the parameters in the template executable.
        return solutionParams.containsAll(templateParams);
    }

```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
        UMLContainerElement otherElement = (UMLContainerElement) obj;

        return otherElement.subElements.size() == subElements.size() && otherElement.subElements.containsAll(subElements) && subElements.containsAll(otherElement.subElements);
    }
}
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
        UMLContainerElement otherElement = (UMLContainerElement) obj;

        return otherElement.subElements.size() == subElements.size() && otherElement.subElements.containsAll(subElements) && subElements.containsAll(otherElement.subElements);
    }
}
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java
        UMLActivity otherActivity = (UMLActivity) obj;

        return otherActivity.childElements.size() == childElements.size() && otherActivity.childElements.containsAll(childElements)
                && childElements.containsAll(otherActivity.childElements);
    }
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java

        return otherActivity.childElements.size() == childElements.size() && otherActivity.childElements.containsAll(childElements)
                && childElements.containsAll(otherActivity.childElements);
    }
}
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        UMLMethod otherMethod = (UMLMethod) obj;

        if (otherMethod.getParameters().size() != getParameters().size() || !otherMethod.getParameters().containsAll(getParameters())
                || !getParameters().containsAll(otherMethod.getParameters())) {
            return false;
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java

        if (otherMethod.getParameters().size() != getParameters().size() || !otherMethod.getParameters().containsAll(getParameters())
                || !getParameters().containsAll(otherMethod.getParameters())) {
            return false;
        }
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        if (!otherClass.getAttributes().containsAll(getAttributes()) || !getAttributes().containsAll(otherClass.getAttributes())) {
            return false;
        }
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        if (!otherClass.getAttributes().containsAll(getAttributes()) || !getAttributes().containsAll(otherClass.getAttributes())) {
            return false;
        }
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        return otherClass.getMethods().containsAll(getMethods()) && getMethods().containsAll(otherClass.getMethods());
    }
}
```

### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        return otherClass.getMethods().containsAll(getMethods()) && getMethods().containsAll(otherClass.getMethods());
    }
}
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`start = start + lineOrSentence.length() + LINE_SEPARATOR_LENGTH` could be simplified to 'start += lineOrSentence.length() + LINE_SEPARATOR_LENGTH'
in `src/main/java/de/tum/in/www1/artemis/service/TextBlockService.java`
#### Snippet
```java
                final int startIndex = start + offset;
                final int endIndex = startIndex + lineOrSentenceTrimed.length();
                start = start + lineOrSentence.length() + LINE_SEPARATOR_LENGTH;
                if (startIndex == endIndex || lineOrSentence.isBlank())
                    continue; // Do *not* define a text block for an empty line.
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/domain/GradingCriterion.java`
#### Snippet
```java
        this.structuredGradingInstructions = structuredGradingInstructions;
        if (structuredGradingInstructions != null) {
            this.structuredGradingInstructions.forEach(structuredGradingInstruction -> {
                structuredGradingInstruction.setGradingCriterion(this);
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentQueueService.java`
#### Snippet
```java
            throw new IllegalArgumentException("All TextSubmissions have to be from the same Exercise");
        }
        textSubmissionList.forEach(textSubmission -> {
            textSubmission.getBlocks().forEach(textBlock -> {
                if (textBlock.getCluster() == null) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/ExampleSubmissionService.java`
#### Snippet
```java
        var gradingCriteria = this.gradingCriterionRepository.findByExerciseIdWithEagerGradingCriteria(exercise.getId());
        Map<Long, GradingInstruction> gradingInstructionCopyTracker = new HashMap<>();
        gradingCriteria.stream().flatMap(gradingCriterion -> gradingCriterion.getStructuredGradingInstructions().stream()).forEach(gradingInstruction -> {
            gradingInstructionCopyTracker.put(gradingInstruction.getId(), gradingInstruction);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
        Set<LearningGoal> learningGoals = learningGoalRepository.findAllByCourseIdWithLectureUnitsUnidirectional(course.getId());
        // TODO: Move the loading of lecture units to its own endpoint
        learningGoals.forEach(learningGoal -> {
            learningGoal.setLectureUnits(new HashSet<>(lectureUnitRepository.findAllByLearningGoalId(learningGoal.getId())));
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/LearningGoalService.java`
#### Snippet
```java
        // if the user is a student the not yet released lecture units need to be filtered out
        if (authCheckService.isOnlyStudentInCourse(course, user)) {
            learningGoals.forEach(learningGoal -> {
                learningGoal.getLectureUnits().removeIf(lectureUnit -> !lectureUnit.isVisibleToStudents());
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamImportService.java`
#### Snippet
```java
        AtomicInteger numberOfInvalidProgrammingExercises = new AtomicInteger(0);
        // Iterate over all exercises
        exerciseGroupList.forEach(exerciseGroup -> {
            exerciseGroup.getExercises().forEach(exercise -> {
                if (exercise.getExerciseType() == ExerciseType.PROGRAMMING) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
        userRepository.save(user);

        optionalCIUserManagementService.ifPresent(service -> {
            service.updateUser(user, newPassword);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
        });

        optionalVcsUserManagementService.ifPresent(service -> {
            service.updateVcsUser(user.getLogin(), user, new HashSet<>(), new HashSet<>(), newPassword);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostingService.java`
#### Snippet
```java
        }
        else if (postDTO.getPost().getConversation() != null) {
            postDTO.getPost().getConversation().getConversationParticipants().forEach(conversationParticipant -> {
                messagingTemplate.convertAndSendToUser(conversationParticipant.getUser().getLogin(),
                        genericTopicName + "/conversations/" + postDTO.getPost().getConversation().getId(), postDTO);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ModelingExerciseScheduleService.java`
#### Snippet
```java
        // For any course exercise that needsToBeScheduled (buildAndTestAfterDueDate and/or manual assessment)
        if (exercise.getDueDate() != null && ZonedDateTime.now().isBefore(exercise.getDueDate())) {
            scheduleService.scheduleTask(exercise, ExerciseLifecycle.DUE, () -> {
                buildModelingClusters(exercise).run();
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ModelingExerciseScheduleService.java`
#### Snippet
```java
            var buildDate = endDate.plusMinutes(EXAM_END_WAIT_TIME_FOR_COMPASS_MINUTES);
            exercise.setClusterBuildDate(buildDate);
            scheduleService.scheduleTask(exercise, ExerciseLifecycle.BUILD_COMPASS_CLUSTERS_AFTER_EXAM, () -> {
                buildModelingClusters(exercise).run();
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ParticipantScoreSchedulerService.java`
#### Snippet
```java
    public void shutdown() {
        // Stop all running tasks, we will reschedule them on startup again
        scheduledTasks.values().forEach(future -> {
            future.cancel(true);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java

        // Export the auxiliary repositories and add them to list
        auxiliaryRepositories.forEach(auxiliaryRepository -> {
            pathsToBeZipped.add(exportInstructorAuxiliaryRepositoryForExercise(exercise.getId(), auxiliaryRepository, outputDir, exportErrors).map(File::toPath).orElse(null));
        });
```

## RuleId[ruleID=PackageDirectoryMismatch]
### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

//TODO: declare strategy interface
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}


```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing constructor and members
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Policy.kt`
#### Snippet
```java
package ${packageName}

class Policy(private val context: Context) {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

class QuickSort : SortStrategy {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/QuickSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/SortStrategy.kt`
#### Snippet
```java
package ${packageName}

interface SortStrategy {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

//TODO: add the missing inheritance
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Context.kt`
#### Snippet
```java
package ${packageName}

class Context {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Main.kt`
#### Snippet
```java
package ${packageName}

fun main() {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
package ${packageName}

class MergeSort : SortStrategy {
```

### RuleId[ruleID=PackageDirectoryMismatch]
Package directive does not match the file location
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
package ${packageName}

import kotlin.random.Random
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
    @Pointcut("within(@org.springframework.stereotype.Repository *)" + " || within(@org.springframework.stereotype.Service *)"
            + " || within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {
        // Method is empty as this is just a Pointcut, the implementations are in the advices.
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/de/tum/in/www1/artemis/aop/logging/LoggingAspect.java`
#### Snippet
```java
     */
    @Pointcut("within(de.tum.in.www1.artemis.repository..*)" + " || within(de.tum.in.www1.artemis.service..*)" + " || within(de.tum.in.www1.artemis.web.rest..*)")
    public void applicationPackagePointcut() {
        // Method is empty as this is just a Pointcut, the implementations are in the advices.
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
    @JsonIgnore(false)
    @JsonProperty
    public String getCreatedBy() {
        return super.getCreatedBy();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
    @JsonIgnore(false)
    @JsonProperty
    public Instant getCreatedDate() {
        return super.getCreatedDate();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
    @JsonIgnore(false)
    @JsonProperty
    public String getLastModifiedBy() {
        return super.getLastModifiedBy();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
    @JsonIgnore(false)
    @JsonProperty
    public Instant getLastModifiedDate() {
        return super.getLastModifiedDate();
    }
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `src/main/java/de/tum/in/www1/artemis/service/connectors/CIUserManagementService.java`
#### Snippet
```java
     * @param password The user's password
     */
    void updateUserLogin(String oldLogin, User user, String password) throws ContinuousIntegrationException;

    /**
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/de/tum/in/www1/artemis/service/feature/FeatureToggleAspect.java`
#### Snippet
```java
     */
    @Pointcut("@within(featureToggle) || @annotation(featureToggle)")
    public void callAt(FeatureToggle featureToggle) {
    }

```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/web/rest/dto/PostContextFilter.java`
#### Snippet
```java
    private boolean filterToOwn = false;

    private boolean filterToAnsweredOrReacted = false;

    private PostSortCriterion postSortCriterion;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/web/rest/dto/PostContextFilter.java`
#### Snippet
```java
    private String searchText;

    private boolean filterToUnresolved = false;

    private boolean filterToOwn = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/web/rest/dto/PostContextFilter.java`
#### Snippet
```java
    private boolean filterToUnresolved = false;

    private boolean filterToOwn = false;

    private boolean filterToAnsweredOrReacted = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketBrokerHealthIndicator.java`
#### Snippet
```java
public class WebsocketBrokerHealthIndicator implements HealthIndicator, ApplicationListener<BrokerAvailabilityEvent> {

    private boolean isBrokerAvailable = false; // Will be updated to true by event listener once connection is established

    // Split the addresses by comma
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/TextBlock.java`
#### Snippet
```java
    @SuppressWarnings("FieldCanBeLocal")
    @Column(name = "position_in_cluster")
    private Integer positionInCluster = null;

    @Column(name = "added_distance")
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    // currently this is only the case for the course scores page and its csv export, and also for the individual student exam detail
    @Transient
    private String visibleRegistrationNumberTransient = null;

    @Email
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java

    @Column(name = "last_notification_read")
    private ZonedDateTime lastNotificationRead = null;

    // hides all notifications with a notification date until (before) the given date in the notification sidebar.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    @Nullable
    @Column(name = "hide_notifications_until")
    private ZonedDateTime hideNotificationsUntil = null;

    @Column(name = "is_internal")
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    @Nullable
    @Column(name = "vcs_access_token")
    private String vcsAccessToken = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java
    @NotNull
    @Column(nullable = false)
    private boolean activated = false;

    @Size(min = 2, max = 6)
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/User.java`
#### Snippet
```java

    @Column(name = "reset_date")
    private Instant resetDate = null;

    @Column(name = "last_notification_read")
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/NotificationSetting.java`
#### Snippet
```java

    @Column(name = "email", columnDefinition = "boolean default false", nullable = false)
    private boolean email = false;

    @ManyToOne(fetch = FetchType.LAZY)
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/GradeStep.java`
#### Snippet
```java

    @Column(name = "upper_bound_inclusive")
    private boolean upperBoundInclusive = false; // default

    @Column(name = "grade_name")
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java

    @Transient
    private boolean isGradingInstructionFeedbackUsedTransient = false;

    @Transient
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java

    @Transient
    private boolean studentAssignedTeamIdComputedTransient = false; // set to true if studentAssignedTeamIdTransient was computed for the exercise

    @Transient
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/Course.java`
#### Snippet
```java
    @Column(name = "test_course")
    @JsonView(QuizView.Before.class)
    private boolean testCourse = false;

    @Enumerated(EnumType.STRING)
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/MultipleChoiceQuestion.java`
#### Snippet
```java
    @Column(name = "single_choice")
    @JsonView(QuizView.Before.class)
    private boolean singleChoice = false;

    public List<AnswerOption> getAnswerOptions() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
     */
    @Transient
    private boolean checkoutSolutionRepositoryTransient = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/domain/notification/Notification.java`
#### Snippet
```java

    @Column(name = "outdated", columnDefinition = "boolean default false")
    private boolean outdated = false;

    @ManyToOne
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/dto/UserDTO.java`
#### Snippet
```java
    private String imageUrl;

    private boolean activated = false;

    @Size(min = 2, max = 6)
```

## RuleId[ruleID=EqualsAndHashcode]
### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/dto/TeamAssignmentPayload.java`
#### Snippet
```java

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TeamAssignmentPayload {

    @NotNull
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/domain/TempIdObject.java`
#### Snippet
```java

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class TempIdObject extends DomainObject {

    /**
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/domain/hestia/ProgrammingExerciseSolutionEntry.java`
#### Snippet
```java
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProgrammingExerciseSolutionEntry extends DomainObject {

    @Column(name = "file_path")
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/domain/hestia/ProgrammingExerciseTask.java`
#### Snippet
```java
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProgrammingExerciseTask extends DomainObject {

    @Column(name = "task_name")
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/GroupedFile.java`
#### Snippet
```java
 * that belong to the same file. For each {@link ProgrammingExerciseTestCase} that covered the file a separate GroupedFile exists.
 */
public class GroupedFile {

    // The path of the file
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.deployment.UMLNode;

public abstract class UMLContainerElement extends UMLElement implements Serializable {

    private List<UMLElement> subElements = new ArrayList<>();
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/object/UMLObjectLink.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLObjectLink extends UMLElement {

    public static final String UML_OBJECT_LINK_TYPE = "ObjectLink";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/usecase/UMLSystemBoundary.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLSystemBoundary extends UMLContainerElement {

    public static final String UML_SYSTEM_BOUNDARY_TYPE = "UseCaseSystem";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/usecase/UMLUseCaseAssociation.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLUseCaseAssociation extends UMLElement {

    // NOTE: this is also used in deployment diagrams
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLActivity extends UMLActivityElement implements Serializable {

    public static final String UML_ACTIVITY_TYPE = "Activity";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLControlFlow.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLControlFlow extends UMLElement implements Serializable {

    public static final String UML_CONTROL_FLOW_TYPE = "ActivityControlFlow";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityElement.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public abstract class UMLActivityElement extends UMLElement implements Serializable {

    // TODO: use UML Container Element instead
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/component/UMLComponent.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.SimilarityUtils;

public class UMLComponent extends UMLContainerElement {

    public static final String UML_COMPONENT_TYPE = "Component";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/component/UMLComponentInterface.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.SimilarityUtils;

public class UMLComponentInterface extends UMLElement {

    public static final String UML_COMPONENT_INTERFACE_TYPE = "ComponentInterface";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/petrinet/PetriNetArc.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class PetriNetArc extends UMLElement {

    public static final String PETRI_NET_ARC_TYPE = "PetriNetArc";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/component/UMLComponentRelationship.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLComponentRelationship extends UMLElement {

    // NOTE: this is also used in deployment diagrams
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/flowchart/FlowchartFlowline.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class FlowchartFlowline extends UMLElement {

    public static final String FLOWCHART_FLOWLINE_TYPE = "FlowchartFlowline";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/deployment/UMLArtifact.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.SimilarityUtils;

public class UMLArtifact extends UMLElement {

    public static final String UML_ARTIFACT_TYPE = "DeploymentArtifact";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/deployment/UMLNode.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.SimilarityUtils;

public class UMLNode extends UMLContainerElement {

    public static final String UML_NODE_TYPE = "DeploymentNode";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/syntaxtree/SyntaxTreeLink.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class SyntaxTreeLink extends UMLElement {

    public static final String SYNTAX_TREE_LINK_TYPE = "SyntaxTreeLink";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLPackage.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLPackage extends UMLContainerElement implements Serializable {

    public static final String UML_PACKAGE_TYPE = "Package";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLAttribute extends UMLElement implements Serializable {

    public static final String UML_ATTRIBUTE_TYPE = "ClassAttribute";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLMethod extends UMLElement implements Serializable {

    public static final String UML_METHOD_TYPE = "ClassMethod";
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLRelationship.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLRelationship extends UMLElement implements Serializable {

    public enum UMLRelationshipType {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLClass extends UMLElement implements Serializable {

    public enum UMLClassType {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/communication/UMLCommunicationLink.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLCommunicationLink extends UMLElement {

    public static final String UML_COMMUNICATION_LINK_TYPE = "CommunicationLink";
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/FileSubmissionError.java`
#### Snippet
```java
 * Class for marshalling and sending errors encountered when trying to persist file updates received by websocket.
 */
public class FileSubmissionError extends Error implements Serializable {

    private Long participationId;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/domain/Attachment.java`
#### Snippet
```java
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Attachment extends DomainObject implements Serializable {

    @Transient
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.deployment.UMLNode;

public abstract class UMLContainerElement extends UMLElement implements Serializable {

    private List<UMLElement> subElements = new ArrayList<>();
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivity.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLActivity extends UMLActivityElement implements Serializable {

    public static final String UML_ACTIVITY_TYPE = "Activity";
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLControlFlow.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLControlFlow extends UMLElement implements Serializable {

    public static final String UML_CONTROL_FLOW_TYPE = "ActivityControlFlow";
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityElement.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public abstract class UMLActivityElement extends UMLElement implements Serializable {

    // TODO: use UML Container Element instead
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityNode.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLActivityNode extends UMLActivityElement implements Serializable {

    public enum UMLActivityNodeType {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityDiagram.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLActivityDiagram extends UMLDiagram implements Serializable {

    private List<UMLActivityNode> activityNodeList;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLPackage.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLPackage extends UMLContainerElement implements Serializable {

    public static final String UML_PACKAGE_TYPE = "Package";
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClassDiagram.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLClassDiagram extends UMLDiagram implements Serializable {

    private final List<UMLClass> classList;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLAttribute extends UMLElement implements Serializable {

    public static final String UML_ATTRIBUTE_TYPE = "ClassAttribute";
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLMethod extends UMLElement implements Serializable {

    public static final String UML_METHOD_TYPE = "ClassMethod";
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLRelationship.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLRelationship extends UMLElement implements Serializable {

    public enum UMLRelationshipType {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class UMLClass extends UMLElement implements Serializable {

    public enum UMLClassType {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `ArtemisAuthenticationProvider`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
@Primary
@ComponentScan("de.tum.in.www1.artemis.*")
public class JiraAuthenticationProvider extends ArtemisAuthenticationProviderImpl implements ArtemisAuthenticationProvider {

    private final Logger log = LoggerFactory.getLogger(JiraAuthenticationProvider.class);
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `ArtemisAuthenticationProvider`
in `src/main/java/de/tum/in/www1/artemis/security/ArtemisInternalAuthenticationProvider.java`
#### Snippet
```java
@Component
@ConditionalOnProperty(value = "artemis.user-management.use-external", havingValue = "false")
public class ArtemisInternalAuthenticationProvider extends ArtemisAuthenticationProviderImpl implements ArtemisAuthenticationProvider {

    public ArtemisInternalAuthenticationProvider(UserRepository userRepository, PasswordService passwordService, UserCreationService userCreationService) {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `src/main/webapp/app/overview/header-course.component.html`
#### Snippet
```java
            <ng-container *ngIf="courseDescription">
                <h5 class="fw-medium">{{ courseDescription }}</h5>
                <h6 class="fw-medium" role="button" *ngIf="enableShowMore" (click)="toggleCourseDescription()">
                    {{ 'artemisApp.courseOverview.' + (longDescriptionShown ? 'showLess' : 'showMore') | artemisTranslate }}
                </h6>
```

### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `src/main/webapp/app/assessment/structured-grading-instructions-assessment-layout/structured-grading-instructions-assessment-layout.component.html`
#### Snippet
```java
            class="rounded"
            *ngFor="let instruction of criterion!.structuredGradingInstructions; let instructionIndex = index"
            draggable="{{ allowDrop }}"
            (dragstart)="disableDrag()"
            (dragstart)="drag($event, instruction)"
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `NetworkingError` does not end with 'Exception'
in `src/main/java/de/tum/in/www1/artemis/exception/NetworkingError.java`
#### Snippet
```java
package de.tum.in.www1.artemis.exception;

public class NetworkingError extends Exception {

    public NetworkingError(String message) {
```

## RuleId[ruleID=FuseStreamOperations]
### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
        PostContextFilter postContextFilter = new PostContextFilter();
        postContextFilter.setCourseId(courseId);
        List<Post> coursePosts = this.getCoursePosts(postContextFilter, false, null).stream().collect(Collectors.toCollection(ArrayList::new));

        // sort course posts by calculated similarity scores
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/web/rest/NotificationSettingsResource.java`
#### Snippet
```java
            throw new BadRequestAlertException("Error occurred during saving of Notification Settings", "NotificationSettings", "notificationSettingsEmptyAfterSave");
        }
        NotificationSetting[] resultAsArray = resultAsList.toArray(new NotificationSetting[0]);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, "notificationSetting", "test")).body(resultAsArray);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/ResourceLoaderService.java`
#### Snippet
```java
        }

        return resources != null ? resources : new Resource[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/util/UrlUtils.java`
#### Snippet
```java
        }

        return UriComponentsBuilder.fromHttpUrl(baseUrl).pathSegment(parsedSegments.toArray(new String[0]));
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
        }

        String[] methodParams = {};
        if (methodParts.length == 2) {
            methodParams = methodParts[1].split(",");
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
        return new Plan(createBuildProject(projectName, projectKey), planKey, planKey).description(planDescription)
                .pluginConfigurations(new ConcurrentBuilds().useSystemWideDefault(true)).planRepositories(planRepositories.toArray(VcsRepository[]::new))
                .triggers(new BitbucketServerTrigger().selectedTriggeringRepositories(vcsTriggerRepositories.toArray(new VcsRepositoryIdentifier[0])))
                .planBranchManagement(createPlanBranchManagement()).notifications(createNotification());
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
        var tasks = readScriptTasksFromTemplate(programmingLanguage, "", sequentialBuildRuns, false, null);
        tasks.add(0, checkoutTask);
        return defaultStage.jobs(defaultJob.tasks(tasks.toArray(new Task[0])).finalTasks(testParserTask));
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                var tasks = readScriptTasksFromTemplate(programmingLanguage, File.separator + projectType.name().toLowerCase(), sequentialBuildRuns, false, null);
                tasks.add(0, checkoutTask);
                defaultJob.tasks(tasks.toArray(new Task[0]));

                // Final tasks:
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                    defaultJob.artifacts(artifacts);
                    var scaTasks = readScriptTasksFromTemplate(programmingLanguage, "", false, true, null);
                    defaultJob.finalTasks(scaTasks.toArray(new Task[0]));
                }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                var tasks = readScriptTasksFromTemplate(programmingLanguage, subDirectory, sequentialBuildRuns, false, replacements);
                tasks.add(0, checkoutTask);
                defaultJob.tasks(tasks.toArray(new Task[0])).finalTasks(testParserTask);
                if (Boolean.TRUE.equals(staticCodeAnalysisEnabled)) {
                    // Create artifacts and a final task for the execution of static code analysis
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
                    defaultJob.artifacts(artifacts);
                    var scaTasks = readScriptTasksFromTemplate(programmingLanguage, subDirectory, false, true, null);
                    defaultJob.finalTasks(scaTasks.toArray(new Task[0]));
                }
                if (isXcodeProject) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
                TextPlagiarismResult textPlagiarismResult = new TextPlagiarismResult();
                textPlagiarismResult.setExercise(programmingExercise);
                textPlagiarismResult.setSimilarityDistribution(new int[0]);

                log.info("Finished programmingExerciseExportService.checkPlagiarism call for {} comparisons in {}", textPlagiarismResult.getComparisons().size(),
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
        Map<NotificationType, Boolean> resultingMap = new HashMap<>();
        for (NotificationSetting setting : notificationSettings) {
            NotificationType[] tmpNotificationTypes = NOTIFICATION_SETTING_ID_TO_NOTIFICATION_TYPES_MAP.getOrDefault(setting.getSettingId(), new NotificationType[0]);
            switch (communicationChannel) {
                case WEBAPP -> Arrays.stream(tmpNotificationTypes).forEach(type -> resultingMap.put(type, setting.isWebapp()));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
                        }
                        if (!existingProjectTypeTestFileResources.isEmpty()) {
                            fileService.copyResources(existingProjectTypeTestFileResources.toArray(new Resource[] {}), projectTypePrefix, packagePath, false);
                        }
                    }
```

## RuleId[ruleID=DoubleBraceInitialization]
### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/HeaderUtil.java`
#### Snippet
```java
     */
    public static HttpHeaders createAuthorization(String username, String password) {
        HttpHeaders authorizationHeaders = new HttpHeaders() {

            {
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'ProgrammingExerciseStudentParticipation' type conflicts with preceding 'instanceof StudentParticipation' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
            if (participation instanceof StudentParticipation) {
                // do not try to report results for template or solution participations
                ltiNewResultService.onNewResult((ProgrammingExerciseStudentParticipation) participation);
            }
            log.info("The new result for {} was saved successfully", planKey);
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `QuizSubmissionException` ends with 'Exception'
in `src/main/java/de/tum/in/www1/artemis/exception/QuizSubmissionException.java`
#### Snippet
```java
package de.tum.in.www1.artemis.exception;

public class QuizSubmissionException extends Throwable {

    public QuizSubmissionException(String error) {
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `QuizJoinException` ends with 'Exception'
in `src/main/java/de/tum/in/www1/artemis/exception/QuizJoinException.java`
#### Snippet
```java
package de.tum.in.www1.artemis.exception;

public class QuizJoinException extends Throwable {

    private String error;
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `conversation` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/metis/MessageService.java`
#### Snippet
```java

            final User user = this.userRepository.getUserWithGroupsAndAuthorities();
            Conversation conversation = null;

            // checks
```

### RuleId[ruleID=UnusedAssignment]
Variable `testsStarted` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
        ZonedDateTime jobStarted = getTimestampForLogEntry(buildLogEntries, ""); // First entry;
        ZonedDateTime agentSetupCompleted = null;
        ZonedDateTime testsStarted = null;
        ZonedDateTime testsFinished = null;
        ZonedDateTime scaStarted = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `testsFinished` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
        ZonedDateTime agentSetupCompleted = null;
        ZonedDateTime testsStarted = null;
        ZonedDateTime testsFinished = null;
        ZonedDateTime scaStarted = null;
        ZonedDateTime scaFinished = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `scaStarted` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
        ZonedDateTime testsStarted = null;
        ZonedDateTime testsFinished = null;
        ZonedDateTime scaStarted = null;
        ZonedDateTime scaFinished = null;
        ZonedDateTime jobFinished = buildLogEntries.get(buildLogEntries.size() - 1).getTime(); // Last entry
```

### RuleId[ruleID=UnusedAssignment]
Variable `scaFinished` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
        ZonedDateTime testsFinished = null;
        ZonedDateTime scaStarted = null;
        ZonedDateTime scaFinished = null;
        ZonedDateTime jobFinished = buildLogEntries.get(buildLogEntries.size() - 1).getTime(); // Last entry
        Integer dependenciesDownloadedCount = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `sortCriterion` initializer `null` is redundant
in `src/main/java/de/tum/in/www1/artemis/repository/specs/MessageSpecs.java`
#### Snippet
```java
        return ((root, query, criteriaBuilder) -> {

            Expression<?> sortCriterion = null;

            // sort by creation date
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `participant instanceof User user` is always `true`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ParticipantScoreSchedulerService.java`
#### Snippet
```java
                    return teamScore;
                }
                else if (participant instanceof User user) {
                    var studentScore = new StudentScore();
                    studentScore.setUser(user);
```

### RuleId[ruleID=ConstantValue]
Value `vcsRepositoryUrl` is always 'null'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsInternalUrlService.java`
#### Snippet
```java
        if (vcsRepositoryUrl == null) {
            log.warn("Cannot replace url to internal url {} because the url is null.", internalVcsUrl);
            return vcsRepositoryUrl;
        }

```

### RuleId[ruleID=ConstantValue]
Condition `buildPlan.isBuilding()` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            return BuildStatus.QUEUED;
        }
        else if (buildPlan.isActive() && buildPlan.isBuilding()) {
            return BuildStatus.BUILDING;
        }
```

### RuleId[ruleID=ConstantValue]
Condition `testCase.getBonusMultiplier() == null` is always `false`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java

    private static void validateTestCase(ProgrammingExerciseTestCase testCase) {
        if (testCase.getWeight() == null || testCase.getBonusMultiplier() == null || testCase.getBonusPoints() == null || testCase.getVisibility() == null) {
            throw new BadRequestAlertException(ErrorConstants.PARAMETERIZED_TYPE, "Test case " + testCase.getTestName() + " must not have settings that are null.",
                    "TestCaseGrading", "settingNull", Map.of("testCase", testCase.getTestName(), "skipAlert", true));
```

### RuleId[ruleID=ConstantValue]
Condition `testCase.getBonusPoints() == null` is always `false`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java

    private static void validateTestCase(ProgrammingExerciseTestCase testCase) {
        if (testCase.getWeight() == null || testCase.getBonusMultiplier() == null || testCase.getBonusPoints() == null || testCase.getVisibility() == null) {
            throw new BadRequestAlertException(ErrorConstants.PARAMETERIZED_TYPE, "Test case " + testCase.getTestName() + " must not have settings that are null.",
                    "TestCaseGrading", "settingNull", Map.of("testCase", testCase.getTestName(), "skipAlert", true));
```

### RuleId[ruleID=ConstantValue]
Condition `searchText.substring(1) != null` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/repository/specs/MessageSpecs.java`
#### Snippet
```java
            }
            // search by text or #message
            else if (searchText.startsWith("#") && (searchText.substring(1) != null && !searchText.substring(1).isBlank())) {
                // if searchText starts with a # and is followed by a message id, filter for message with id
                return criteriaBuilder.equal(root.get(Post_.ID), Integer.parseInt(searchText.substring(1)));
```

### RuleId[ruleID=ConstantValue]
Condition `searchText.substring(1) != null` is always `true` when reached
in `src/main/java/de/tum/in/www1/artemis/repository/specs/PostSpecs.java`
#### Snippet
```java
            }
            // search by text or #post
            else if (searchText.startsWith("#") && (searchText.substring(1) != null && !searchText.substring(1).isBlank())) {
                // if searchText starts with a # and is followed by a post id, filter for post with id
                return criteriaBuilder.equal(root.get(Post_.ID), Integer.parseInt(searchText.substring(1)));
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        if (programmingExerciseParticipation.getBuildPlanId() != null) {
            // If a build is already queued/running for the given participation, we just return. Note: We don't check that the running build belongs to the failed submission.
            ContinuousIntegrationService.BuildStatus buildStatus = continuousIntegrationService.get().getBuildStatus(programmingExerciseParticipation);
            if (buildStatus == ContinuousIntegrationService.BuildStatus.BUILDING || buildStatus == ContinuousIntegrationService.BuildStatus.QUEUED) {
                // We inform the user through the websocket that the submission is still in progress (build is running/queued, result should arrive soon).
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
        String lastCommitHash = null;
        try {
            Commit commit = versionControlService.get().getLastCommitDetails(requestBody);
            lastCommitHash = commit.getCommitHash();
            log.info("create new programmingSubmission with commitHash: {} for exercise {}", lastCommitHash, exerciseId);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
     */
    private void validateStaticCodeAnalysisSettings(ProgrammingExercise programmingExercise) {
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        programmingExercise.validateStaticCodeAnalysisSettings(programmingLanguageFeature);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
        String planKey;
        try {
            planKey = continuousIntegrationService.get().getPlanKey(requestBody);
        }
        catch (ContinuousIntegrationException cISException) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
        // Create a participation and a submitted empty submission if they do not exist yet
        StudentParticipation participation = participationService.createParticipationWithEmptySubmissionIfNotExisting(exercise, student.get(), SubmissionType.EXTERNAL);
        Submission submission = participationRepository.findByIdWithLegalSubmissionsElseThrow(participation.getId()).findLatestSubmission().get();
        result.setParticipation(participation);
        result.setSubmission(submission);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findByIdElseThrow(exerciseId);
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);
        var programmingLanguageFeature = programmingLanguageFeatureService.get().getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        if (!programmingLanguageFeature.isPlagiarismCheckSupported()) {
            throw new BadRequestAlertException("Artemis does not support plagiarism checks for the programming language " + programmingExercise.getProgrammingLanguage(),
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);
        ProgrammingLanguage language = programmingExercise.getProgrammingLanguage();
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get().getProgrammingLanguageFeatures(language);

        if (!programmingLanguageFeature.isPlagiarismCheckSupported()) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExerciseResource.java`
#### Snippet
```java
        if (exercise instanceof ProgrammingExercise programmingExercise) {
            // TODO: instead fetch the policy without programming exercise, should be faster
            SubmissionPolicy policy = programmingExerciseRepository.findWithSubmissionPolicyById(programmingExercise.getId()).get().getSubmissionPolicy();
            programmingExercise.setSubmissionPolicy(policy);
            programmingExercise.checksAndSetsIfProgrammingExerciseIsLocalSimulation();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingAssessmentResource.java`
#### Snippet
```java
        newManualResult.setId(existingManualResult.getId());
        // load assessor
        existingManualResult = resultRepository.findWithEagerSubmissionAndFeedbackAndAssessorById(existingManualResult.getId()).get();

        // make sure that the participation and submission cannot be manipulated on the client side
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ResponseEntity<BuildLogStatisticsDTO> getBuildLogStatistics(@PathVariable Long exerciseId) {
        log.debug("REST request to get build log statistics for ProgrammingExercise with id : {}", exerciseId);
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(exerciseId).get();
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, null);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
     */
    private void validateStaticCodeAnalysisSettings(ProgrammingExercise programmingExercise) {
        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());
        programmingExercise.validateStaticCodeAnalysisSettings(programmingLanguageFeature);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
        User user = userRepository.getUserWithGroupsAndAuthorities();
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, programmingExercise, user);
        continuousIntegrationService.get().recreateBuildPlansForExercise(programmingExercise);
        return ResponseEntity.ok().build();
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
     */
    private void checkProgrammingExerciseForError(ProgrammingExercise exercise) {
        if (!continuousIntegrationService.get().checkIfBuildPlanExists(exercise.getProjectKey(), exercise.getTemplateBuildPlanId())) {
            throw new BadRequestAlertException("The Template Build Plan ID seems to be invalid.", "Exercise", ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_BUILD_PLAN_ID);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
            throw new BadRequestAlertException("The Template Build Plan ID seems to be invalid.", "Exercise", ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_BUILD_PLAN_ID);
        }
        if (exercise.getVcsTemplateRepositoryUrl() == null || !versionControlService.get().repositoryUrlIsValid(exercise.getVcsTemplateRepositoryUrl())) {
            throw new BadRequestAlertException("The Template Repository URL seems to be invalid.", "Exercise",
                    ProgrammingExerciseResourceErrorKeys.INVALID_TEMPLATE_REPOSITORY_URL);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
        submissionPolicyService.validateSubmissionPolicyCreation(programmingExercise);

        ProgrammingLanguageFeature programmingLanguageFeature = programmingLanguageFeatureService.get()
                .getProgrammingLanguageFeatures(programmingExercise.getProgrammingLanguage());

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
        participation = participationService.resumeProgrammingExercise(participation);
        // Note: in this case we might need an empty commit to make sure the build plan works correctly for subsequent student commits
        continuousIntegrationService.get().performEmptySetupCommit(participation);
        addLatestResultToParticipation(participation);
        participation.getExercise().filterSensitiveInformation();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
        checkAccessPermissionOwner(participation, user);

        return continuousIntegrationService.get().retrieveLatestArtifact(participation);
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/TestRepositoryResource.java`
#### Snippet
```java
    String getOrRetrieveBranchOfDomainObject(Long exerciseId) {
        ProgrammingExercise exercise = programmingExerciseRepository.findByIdElseThrow(exerciseId);
        return versionControlService.get().getOrRetrieveBranchOfExercise(exercise);
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java

        // Otherwise attempt to fetch the build logs from the CI
        List<BuildLogEntry> logs = continuousIntegrationService.get().getLatestBuildLogs(programmingSubmission);

        return new ResponseEntity<>(logs, HttpStatus.OK);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        }
        else if (participation instanceof ProgrammingExerciseStudentParticipation studentParticipation) {
            return versionControlService.get().getOrRetrieveBranchOfStudentParticipation(studentParticipation);
        }
        else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        else {
            ProgrammingExercise programmingExercise = programmingExerciseRepository.getProgrammingExerciseFromParticipation(programmingParticipation);
            return versionControlService.get().getOrRetrieveBranchOfExercise(programmingExercise);
        }
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        boolean lockRepositoryPolicyEnforced = false;

        if (programmingExerciseRepository.findWithSubmissionPolicyById(programmingExercise.getId()).get().getSubmissionPolicy() instanceof LockRepositoryPolicy policy) {
            lockRepositoryPolicyEnforced = submissionPolicyService.isParticipationLocked(policy, participation);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
        }
        else {
            String branch = versionControlService.get().getOrRetrieveBranchOfParticipation(programmingParticipation);
            return gitService.getOrCheckoutRepository(repositoryUrl, pullOnGet, branch);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/domain/Lecture.java`
#### Snippet
```java
            return Optional.empty();
        }
        return getLectureUnits().stream().map((lectureUnit) -> lectureUnit.getCompletionDate(user).get()).sorted().findFirst();
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
        List<ConsistencyErrorDTO> result = new ArrayList<>();

        if (!versionControlService.get().checkIfProjectExists(programmingExercise.getProjectKey(), programmingExercise.getProjectName())) {
            result.add(new ConsistencyErrorDTO(programmingExercise, ConsistencyErrorDTO.ErrorType.VCS_PROJECT_MISSING));
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
        List<ConsistencyErrorDTO> result = new ArrayList<>();

        if (!continuousIntegrationService.get().checkIfBuildPlanExists(programmingExercise.getProjectKey(), programmingExercise.getTemplateBuildPlanId())) {
            result.add(new ConsistencyErrorDTO(programmingExercise, ConsistencyErrorDTO.ErrorType.TEMPLATE_BUILD_PLAN_MISSING));
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipantScoreService.java`
#### Snippet
```java
        Set<Exercise> teamExercises = exercises.stream().filter(Exercise::isTeamMode).collect(Collectors.toSet());

        Course course = exercises.stream().findAny().get().getCourseViaExerciseGroupOrCourseMember();

        // For every student we want to calculate the score
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
            Set<User> usersToRemove = new HashSet<>(existingTeam.getStudents());
            usersToRemove.removeAll(updatedTeam.getStudents());
            usersToRemove.forEach(user -> versionControlService.get().removeMemberFromRepository(participation.getVcsRepositoryUrl(), user));

            // Users in the updated team that were not yet part of the existing team need to be added
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
            Set<User> usersToAdd = new HashSet<>(updatedTeam.getStudents());
            usersToAdd.removeAll(existingTeam.getStudents());
            usersToAdd.forEach(user -> versionControlService.get().addMemberToRepository(participation.getVcsRepositoryUrl(), user));
        });
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TutorParticipationService.java`
#### Snippet
```java

            // Return the highest priority error (the closest instructor feedback match)
            return matchingInstructorFeedback.stream().map(feedback -> tutorFeedbackMatchesInstructorFeedback(tutorFeedback, feedback).get()).max(Comparator.naturalOrder());
        }
        else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
        }
        else {
            return participation.isOwnedBy(SecurityUtils.getCurrentUserLogin().get());
        }
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java

    public TextSubmission findOneWithEagerResultFeedbackAndTextBlocks(Long submissionId) {
        return textSubmissionRepository.findWithEagerResultsAndFeedbackAndTextBlocksById(submissionId).get();
    }
}
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            final var targetPlanName = participation.addPracticePrefixIfTestRun(username.toUpperCase());
            // the next action includes recovery, which means if the build plan has already been copied, we simply retrieve the build plan id and do not copy it again
            final var buildPlanId = continuousIntegrationService.get().copyBuildPlan(projectKey, planName, projectKey, buildProjectName, targetPlanName, true);
            participation.setBuildPlanId(buildPlanId);
            participation.setInitializationState(InitializationState.BUILD_PLAN_COPIED);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // NOTE: we have to get the repository slug of the template participation here, because not all exercises (in particular old ones) follow the naming conventions
            final var templateRepoName = urlService.getRepositorySlugFromRepositoryUrl(sourceURL);
            String templateBranch = versionControlService.get().getOrRetrieveBranchOfExercise(programmingExercise);
            // the next action includes recovery, which means if the repository has already been copied, we simply retrieve the repository url and do not copy it again
            var newRepoUrl = versionControlService.get().copyRepository(projectKey, templateRepoName, templateBranch, projectKey, repoName);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // ignore participations without repository URL
        if (participation.getRepositoryUrl() != null) {
            versionControlService.get().deleteRepository(participation.getVcsRepositoryUrl());
            gitService.deleteLocalRepository(participation.getVcsRepositoryUrl());
            participation.setRepositoryUrl(null);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            if (deleteBuildPlan && buildPlanId != null) {
                final var projectKey = programmingExerciseParticipation.getProgrammingExercise().getProjectKey();
                continuousIntegrationService.get().deleteBuildPlan(projectKey, buildPlanId);
            }
            if (deleteRepository && programmingExerciseParticipation.getRepositoryUrl() != null) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            if (deleteRepository && programmingExerciseParticipation.getRepositoryUrl() != null) {
                try {
                    versionControlService.get().deleteRepository(repositoryUrl);
                }
                catch (Exception ex) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // Step 2c) we might need to perform an empty commit (as a workaround, depending on the CI system) here, because it should not trigger a new programming submission
        // (when the web hook was already initialized, see below)
        continuousIntegrationService.get().performEmptySetupCommit(participation);
        // Note: we configure the repository webhook last, so that the potential empty commit does not trigger a new programming submission (see empty-commit-necessary)
        // Step 3) configure the web hook of the student repository
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private ProgrammingExerciseStudentParticipation configureRepositoryWebHook(ProgrammingExerciseStudentParticipation participation) {
        if (!participation.getInitializationState().hasCompletedState(InitializationState.INITIALIZED)) {
            versionControlService.get().addWebHookForParticipation(participation);
        }
        return participation;
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (participation.getBuildPlanId() != null) {
            final var projectKey = ((ProgrammingExercise) participation.getExercise()).getProjectKey();
            continuousIntegrationService.get().deleteBuildPlan(projectKey, participation.getBuildPlanId());
            participation.setInitializationState(INACTIVE);
            participation.setBuildPlanId(null);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (!participation.getInitializationState().hasCompletedState(InitializationState.BUILD_PLAN_CONFIGURED)) {
            try {
                String branch = versionControlService.get().getOrRetrieveBranchOfStudentParticipation(participation);
                continuousIntegrationService.get().configureBuildPlan(participation, branch);
            }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            try {
                String branch = versionControlService.get().getOrRetrieveBranchOfStudentParticipation(participation);
                continuousIntegrationService.get().configureBuildPlan(participation, branch);
            }
            catch (ContinuousIntegrationException ex) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // create a new participation only if no participation can be found
            if (exercise instanceof ProgrammingExercise) {
                participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
            }
            else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
                // restrict access for the student
                try {
                    versionControlService.get().setRepositoryPermissionsToReadOnly(programmingParticipation.getVcsRepositoryUrl(), programmingExercise.getProjectKey(),
                            programmingParticipation.getStudents());
                }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (optionalStudentParticipation.isEmpty()) {
            // create a new participation only if no participation can be found
            participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
            participation.setInitializationState(UNINITIALIZED);
            participation.setExercise(exercise);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            // do not allow the student to access the repository if this is an exam exercise that has not started yet
            boolean allowAccess = !exercise.isExamExercise() || ZonedDateTime.now().isAfter(exercise.getIndividualReleaseDate());
            versionControlService.get().configureRepository(exercise, participation, allowAccess);
            participation.setInitializationState(InitializationState.REPO_CONFIGURED);
            return programmingExerciseStudentParticipationRepository.saveAndFlush(participation);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // create a new participation only if no participation can be found
        if (exercise instanceof ProgrammingExercise) {
            participation = new ProgrammingExerciseStudentParticipation(versionControlService.get().getDefaultBranchOfArtemis());
        }
        else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextAssessmentConflictService.java`
#### Snippet
```java
        List<TextFeedbackConflictRequestDTO> textFeedbackConflictRequestDTOS = feedbackList.stream().flatMap(feedback -> {
            Optional<TextBlock> textBlock = textBlockRepository
                    .findById(textBlocks.stream().filter(block -> block.getId().equals(feedback.getReference())).findFirst().get().getId());
            if (textBlock.isPresent() && textBlock.get().getCluster() != null && feedback.getDetailText() != null) {
                return Stream.of(new TextFeedbackConflictRequestDTO(textBlock.get().getId(), textBlock.get().getText(), textBlock.get().getCluster().getId(), feedback.getId(),
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
        newUser.setInternal(isInternal);

        final var authority = authorityRepository.findById(STUDENT.getAuthority()).get();
        // needs to be mutable --> new HashSet<>(Set.of(...))
        final var authorities = new HashSet<>(Set.of(authority));
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/metis/ConversationService.java`
#### Snippet
```java
        // update the last time user has read the conversation
        ConversationParticipant readingParticipant = conversation.getConversationParticipants().stream()
                .filter(conversationParticipant -> conversationParticipant.getUser().getId().equals(user.getId())).findAny().get();
        readingParticipant.setLastRead(ZonedDateTime.now());
        conversationParticipantRepository.save(readingParticipant);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
                    for (int correctionRound = 0; correctionRound < exam.getNumberOfCorrectionRoundsInExam(); correctionRound++) {
                        // required so that the submission is counted in the assessment dashboard
                        latestSubmission.get().submitted(true);
                        submissionService.addResultWithFeedbackByCorrectionRound(studentParticipation, assessor, 0D, "Empty submission", correctionRound);
                    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
        Set<ExerciseGroup> mandatoryExerciseGroups = exam.getExerciseGroups().stream().filter(ExerciseGroup::getIsMandatory).collect(Collectors.toSet());
        for (ExerciseGroup exerciseGroup : mandatoryExerciseGroups) {
            Exercise groupRepresentativeExercise = exerciseGroup.getExercises().stream().findAny().get();
            if (groupRepresentativeExercise.getIncludedInOverallScore().equals(IncludedInOverallScore.INCLUDED_COMPLETELY)) {
                pointsReachableByMandatoryExercises += groupRepresentativeExercise.getMaxPoints();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
        Double pointsReachable = 0.0;
        for (ExerciseGroup exerciseGroup : exam.getExerciseGroups()) {
            Exercise groupRepresentativeExercise = exerciseGroup.getExercises().stream().findAny().get();
            if (groupRepresentativeExercise.getIncludedInOverallScore().equals(IncludedInOverallScore.INCLUDED_COMPLETELY)) {
                pointsReachable += groupRepresentativeExercise.getMaxPoints();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
    private Map<Long, Double> calculateAchievedPointsForExercises(List<StudentParticipation> participationsOfStudent, Course course, PlagiarismMapping plagiarismMapping) {
        return participationsOfStudent.stream().collect(Collectors.toMap(participation -> participation.getExercise().getId(), participation -> {
            PlagiarismCase plagiarismCase = plagiarismMapping.getPlagiarismCase(participation.getStudent().get().getId(), participation.getExercise().getId());
            double plagiarismPointDeductionPercentage = plagiarismCase != null ? plagiarismCase.getVerdictPointDeduction() : 0.0;

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
            // Adding student results information to DTO
            List<StudentParticipation> participationsOfStudent = studentParticipations.stream()
                    .filter(studentParticipation -> studentParticipation.getStudent().get().getId().equals(studentExam.getUser().getId())).toList();
            var studentResult = calculateStudentResultWithGrade(studentExam, participationsOfStudent, exam, gradingScale, true, submittedAnswerCounts, plagiarismMapping,
                    examBonusCalculator);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneService.java`
#### Snippet
```java

        // Get knowledge of exercise
        TextAssessmentKnowledge textAssessmentKnowledge = textExerciseRepository.findById(exerciseId).get().getKnowledge();
        // Map textBlocks to submissions
        List<TextBlock> textBlocks = new ArrayList<>();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    private URI getSshUri(VcsRepositoryUrl vcsRepositoryUrl) throws URISyntaxException {
        URI templateUri = new URI(sshUrlTemplate.get());
        // Example Bitbucket: ssh://git@bitbucket.ase.in.tum.de:7999/se2021w07h02/se2021w07h02-ga27yox.git
        // Example Gitlab: ssh://git@gitlab.ase.in.tum.de:2222/se2021w07h02/se2021w07h02-ga27yox.git
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                // Example: /Users/artemis/.ssh/artemis/id_rsa contains /Users/artemis/.ssh/artemis
                if (gitSshPrivateKeyPath.isPresent() && uri.getPath().contains(gitSshPrivateKeyPath.get())) {
                    return gitSshPrivateKeyPassphrase.get().toCharArray();
                }
                else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                return lookup(hostName, port, userName);
            }
        }).setSshDirectory(new java.io.File(gitSshPrivateKeyPath.get())).setHomeDirectory(new java.io.File(System.getProperty("user.home"))).build(new JGitKeyCache());

        sshCallback = transport -> {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
    public void configureBuildPlanForParticipation(ProgrammingExerciseParticipation participation) {
        // Refetch the programming exercise with the template participation and assign it to programmingExerciseParticipation to make sure it is initialized (and not a proxy)
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(participation.getProgrammingExercise().getId()).get();
        participation.setProgrammingExercise(programmingExercise);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            String newBranch, Optional<List<String>> optionalTriggeredByRepositories) throws BambooException {
        final var vcsRepoName = urlService.getRepositorySlugFromRepositoryUrlString(newRepoUrl);
        continuousIntegrationUpdateService.get().updatePlanRepository(buildProjectKey, buildPlanKey, ciRepoName, repoProjectKey, vcsRepoName, newBranch,
                optionalTriggeredByRepositories);
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
        List<VcsRepository<?, ?>> planRepositories = new ArrayList<>();
        planRepositories.add(
                createBuildPlanRepository(ASSIGNMENT_REPO_NAME, projectKey, repositoryName, versionControlService.get().getDefaultBranchOfRepository(projectKey, repositoryName)));
        planRepositories.add(createBuildPlanRepository(TEST_REPO_NAME, projectKey, vcsTestRepositorySlug,
                versionControlService.get().getDefaultBranchOfRepository(projectKey, vcsTestRepositorySlug)));
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        if (participation.getInitializationState().hasCompletedState(InitializationState.REPO_CONFIGURED)) {
            // TODO: this calls protect branches which might not be necessary if the branches have already been protected during "start exercise" which is typically the case
            versionControlService.get().configureRepository(programmingExercise, participation, true);
        }
        else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
    public void lockStudentRepository(ProgrammingExercise programmingExercise, ProgrammingExerciseStudentParticipation participation) {
        if (participation.getInitializationState().hasCompletedState(InitializationState.REPO_CONFIGURED)) {
            versionControlService.get().setRepositoryPermissionsToReadOnly(participation.getVcsRepositoryUrl(), programmingExercise.getProjectKey(), participation.getStudents());
        }
        else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        newExercise.setSolutionParticipation(solutionParticipation);
        solutionParticipation.setBuildPlanId(newExercise.generateBuildPlanId(BuildPlanType.SOLUTION));
        solutionParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), solutionRepoName).toString());
        solutionParticipation.setProgrammingExercise(newExercise);
        solutionParticipationRepository.save(solutionParticipation);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
        TemplateProgrammingExerciseParticipation templateParticipation = new TemplateProgrammingExerciseParticipation();
        templateParticipation.setBuildPlanId(newExercise.generateBuildPlanId(BuildPlanType.TEMPLATE));
        templateParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), exerciseRepoName).toString());
        templateParticipation.setProgrammingExercise(newExercise);
        newExercise.setTemplateParticipation(templateParticipation);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
        long start = System.nanoTime();

        final var programmingExercise = programmingExerciseRepository.findWithAllParticipationsById(programmingExerciseId).get();
        JPlagResult result = computeJPlagResult(programmingExercise, similarityThreshold, minimumScore);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
        String topic = plagiarismWebsocketService.getProgrammingExercisePlagiarismCheckTopic(programmingExerciseId);

        final var programmingExercise = programmingExerciseRepository.findWithAllParticipationsById(programmingExerciseId).get();

        // Only one plagiarism check per course allowed
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
                    // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
                }
                continuousIntegrationService.get().triggerBuild(participation);
                // TODO: this is a workaround, in the future we should use the participation to notify the client and avoid using the submission
                programmingMessagingService.notifyUserAboutSubmission(submission.get());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
    public void setTestCasesChangedAndTriggerTestCaseUpdate(long programmingExerciseId) throws EntityNotFoundException {
        setTestCasesChanged(programmingExerciseId, true);
        var programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationById(programmingExerciseId).get();

        try {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java

        try {
            continuousIntegrationService.get().triggerBuild(programmingExercise.getSolutionParticipation());
            continuousIntegrationService.get().triggerBuild(programmingExercise.getTemplateParticipation());
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
        ProgrammingSubmission submission = createSubmissionWithCommitHashAndSubmissionType(participation, commitHash, submissionType);
        try {
            continuousIntegrationService.get().triggerBuild((ProgrammingExerciseParticipation) submission.getParticipation());
            programmingMessagingService.notifyUserAboutSubmission(submission);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
                // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
            }
            continuousIntegrationService.get().triggerBuild(programmingExerciseParticipation);
            programmingMessagingService.notifyUserAboutSubmission(submission);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            // we can find this out by looking into the requestBody, e.g. changes=[{ref={id=refs/heads/BitbucketStationSupplies, displayId=BitbucketStationSupplies, type=BRANCH}
            // if the branch is different from main, throw an IllegalArgumentException, but make sure the REST call still returns 200 to Bitbucket
            commit = versionControlService.get().getLastCommitDetails(requestBody);
            log.info("NotifyPush invoked due to the commit {} by {} with {} in branch {}", commit.getCommitHash(), commit.getAuthorName(), commit.getAuthorEmail(),
                    commit.getBranch());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            // Note: in this case we do not need an empty commit: when we trigger the build manually (below), subsequent commits will work correctly
            try {
                continuousIntegrationService.get().triggerBuild(programmingExerciseParticipation);
            }
            catch (ContinuousIntegrationException ex) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java
        // Set values we don't want to copy to null
        setupExerciseForImport(newExercise);
        newExercise.setBranch(versionControlService.get().getDefaultBranchOfArtemis());

        // Note: same order as when creating an exercise
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java
    private void setupTestRepository(ProgrammingExercise newExercise) {
        final var testRepoName = newExercise.generateRepositoryName(RepositoryType.TESTS);
        newExercise.setTestRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(newExercise.getProjectKey(), testRepoName).toString());
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
        final var targetKey = newExercise.getProjectKey();
        final var targetName = newExercise.getCourseViaExerciseGroupOrCourseMember().getShortName().toUpperCase() + " " + newExercise.getTitle();
        continuousIntegrationService.get().createProjectForExercise(newExercise);
        continuousIntegrationService.get().copyBuildPlan(templateKey, templatePlanName, targetKey, targetName, templatePlanName, false);
        continuousIntegrationService.get().copyBuildPlan(templateKey, solutionPlanName, targetKey, targetName, solutionPlanName, true);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
     */
    private void adjustProjectName(Map<String, String> replacements, String projectKey, String repositoryName, User user) throws GitAPIException, IOException {
        final var repositoryUrl = versionControlService.get().getCloneRepositoryUrl(projectKey, repositoryName);
        Repository repository = gitService.getOrCheckoutRepository(repositoryUrl, true);
        fileService.replaceVariablesInFileRecursive(repository.getLocalPath().toAbsolutePath().toString(), replacements, List.of("gradle-wrapper.jar"));
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // First, create a new project for our imported exercise
        versionControlService.get().createProjectForExercise(newExercise);
        // Copy all repositories
        String templateRepoName = urlService.getRepositorySlugFromRepositoryUrlString(templateExercise.getTemplateRepositoryUrl());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            AuxiliaryRepository newAuxiliaryRepository = newRepositories.get(i);
            AuxiliaryRepository oldAuxiliaryRepository = oldRepositories.get(i);
            String auxiliaryBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);
            continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, participation.getBuildPlanId(), newAuxiliaryRepository.getName(),
                    targetExerciseProjectKey, newAuxiliaryRepository.getRepositoryUrl(), oldAuxiliaryRepository.getRepositoryUrl(), auxiliaryBranch, Optional.empty());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            AuxiliaryRepository oldAuxiliaryRepository = oldRepositories.get(i);
            String auxiliaryBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);
            continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, participation.getBuildPlanId(), newAuxiliaryRepository.getName(),
                    targetExerciseProjectKey, newAuxiliaryRepository.getRepositoryUrl(), oldAuxiliaryRepository.getRepositoryUrl(), auxiliaryBranch, Optional.empty());
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        try {
            continuousIntegrationService.get().triggerBuild(templateParticipation);
            continuousIntegrationService.get().triggerBuild(solutionParticipation);
        }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
            SolutionProgrammingExerciseParticipation solutionParticipation, String targetExerciseProjectKey, String oldExerciseRepoUrl, String oldSolutionRepoUrl,
            String oldTestRepoUrl, List<AuxiliaryRepository> oldBuildPlanAuxiliaryRepositories) {
        String newExerciseBranch = versionControlService.get().getOrRetrieveBranchOfExercise(newExercise);

        // update 2 repositories for the BASE build plan --> adapt the triggers so that only the assignment repo (and not the tests' repo) will trigger the BASE build plan
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // update 2 repositories for the BASE build plan --> adapt the triggers so that only the assignment repo (and not the tests' repo) will trigger the BASE build plan
        continuousIntegrationService.get().updatePlanRepository(targetExerciseProjectKey, templateParticipation.getBuildPlanId(), ASSIGNMENT_REPO_NAME, targetExerciseProjectKey,
                newExercise.getTemplateRepositoryUrl(), oldExerciseRepoUrl, newExerciseBranch, Optional.of(List.of(ASSIGNMENT_REPO_NAME)));

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

        templateParticipation.setBuildPlanId(templatePlanId); // Set build plan id to newly created BaseBuild plan
        templateParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(projectKey, exerciseRepoName).toString());
        solutionParticipation.setBuildPlanId(solutionPlanId);
        solutionParticipation.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(projectKey, solutionRepoName).toString());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
    private void setURLsForAuxiliaryRepositoriesOfExercise(ProgrammingExercise programmingExercise) {
        programmingExercise.getAuxiliaryRepositories().forEach(repo -> repo.setRepositoryUrl(
                versionControlService.get().getCloneRepositoryUrl(programmingExercise.getProjectKey(), programmingExercise.generateRepositoryName(repo.getName())).toString()));
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        }

        continuousIntegrationService.get().giveProjectPermissions(exercise.getProjectKey(), adminGroups,
                List.of(CIPermission.CREATE, CIPermission.READ, CIPermission.CREATEREPOSITORY, CIPermission.ADMIN));
        if (teachingAssistantGroup != null) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        var solutionRepoUrl = programmingExercise.getVcsSolutionRepositoryUrl();

        continuousIntegrationService.get().createProjectForExercise(programmingExercise);
        // template build plan
        continuousIntegrationService.get().createBuildPlanForExercise(programmingExercise, TEMPLATE.getName(), exerciseRepoUrl, testsRepoUrl, solutionRepoUrl);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            // The template repo can be re-written, so we can unprotect the default branch.
            var templateVcsRepositoryUrl = programmingExercise.getVcsTemplateRepositoryUrl();
            String templateBranch = versionControlService.get().getOrRetrieveBranchOfExercise(programmingExercise);
            versionControlService.get().unprotectBranch(templateVcsRepositoryUrl, templateBranch);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
    private void createRepositoriesForNewExercise(ProgrammingExercise programmingExercise) throws GitAPIException {
        final String projectKey = programmingExercise.getProjectKey();
        versionControlService.get().createProjectForExercise(programmingExercise); // Create project
        versionControlService.get().createRepository(projectKey, programmingExercise.generateRepositoryName(RepositoryType.TEMPLATE), null); // Create template repository
        versionControlService.get().createRepository(projectKey, programmingExercise.generateRepositoryName(RepositoryType.TESTS), null); // Create tests repository
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        final User exerciseCreator = userRepository.getUser();

        programmingExercise.setBranch(versionControlService.get().getDefaultBranchOfArtemis());
        createRepositoriesForNewExercise(programmingExercise);
        initParticipations(programmingExercise);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        String projectKey = programmingExercise.getProjectKey();
        String projectName = programmingExercise.getProjectName();
        boolean projectExists = versionControlService.get().checkIfProjectExists(projectKey, projectName);
        if (projectExists) {
            var errorMessageVcs = "Project already exists on the Version Control Server: " + projectName + ". Please choose a different title and short name!";
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            throw new BadRequestAlertException(errorMessageVcs, "ProgrammingExercise", "vcsProjectExists");
        }
        String errorMessageCis = continuousIntegrationService.get().checkIfProjectExists(projectKey, projectName);
        if (errorMessageCis != null) {
            throw new BadRequestAlertException(errorMessageCis, "ProgrammingExercise", "ciProjectExists");
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        log.debug("Project Key: " + projectKey);
        log.debug("Project Name: " + projectName);
        boolean projectExists = versionControlService.get().checkIfProjectExists(projectKey, projectName);
        if (projectExists) {
            return true;
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            return true;
        }
        String errorMessageCis = continuousIntegrationService.get().checkIfProjectExists(projectKey, projectName);
        return errorMessageCis != null;
        // means the project does not exist in version control server and does not exist in continuous integration server
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            final var templateBuildPlanId = programmingExercise.getTemplateBuildPlanId();
            if (templateBuildPlanId != null) {
                continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), templateBuildPlanId);
            }
            final var solutionBuildPlanId = programmingExercise.getSolutionBuildPlanId();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            final var solutionBuildPlanId = programmingExercise.getSolutionBuildPlanId();
            if (solutionBuildPlanId != null) {
                continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), solutionBuildPlanId);
            }
            continuousIntegrationService.get().deleteProject(programmingExercise.getProjectKey());
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
                continuousIntegrationService.get().deleteBuildPlan(programmingExercise.getProjectKey(), solutionBuildPlanId);
            }
            continuousIntegrationService.get().deleteProject(programmingExercise.getProjectKey());

            if (programmingExercise.getTemplateRepositoryUrl() != null) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

            if (programmingExercise.getTemplateRepositoryUrl() != null) {
                versionControlService.get().deleteRepository(templateRepositoryUrlAsUrl);
            }
            if (programmingExercise.getSolutionRepositoryUrl() != null) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            }
            if (programmingExercise.getSolutionRepositoryUrl() != null) {
                versionControlService.get().deleteRepository(solutionRepositoryUrlAsUrl);
            }
            if (programmingExercise.getTestRepositoryUrl() != null) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            }
            if (programmingExercise.getTestRepositoryUrl() != null) {
                versionControlService.get().deleteRepository(testRepositoryUrlAsUrl);
            }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            programmingExercise.getAuxiliaryRepositories().forEach(repo -> {
                if (repo.getRepositoryUrl() != null) {
                    versionControlService.get().deleteRepository(repo.getVcsRepositoryUrl());
                }
            });
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            });

            versionControlService.get().deleteProject(programmingExercise.getProjectKey());
        }
        /*
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        for (AuxiliaryRepository repo : programmingExercise.getAuxiliaryRepositories()) {
            String repositoryName = programmingExercise.generateRepositoryName(repo.getName());
            versionControlService.get().createRepository(projectKey, repositoryName, null);
            repo.setRepositoryUrl(versionControlService.get().getCloneRepositoryUrl(programmingExercise.getProjectKey(), repositoryName).toString());
            Repository vcsRepository = gitService.getOrCheckoutRepository(repo.getVcsRepositoryUrl(), true);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            RepositoryExportOptionsDTO repositoryExportOptions) {
        ProgrammingExercise programmingExercise = programmingExerciseRepository.findWithTemplateAndSolutionParticipationTeamAssignmentConfigCategoriesById(programmingExerciseId)
                .get();

        Path outputDir = fileService.getUniquePath(repoDownloadClonePath);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
                // Try to get the actual date, the push might be 10s - 3min earlier, depending on how long the build takes.
                // Note: the whole method is a fallback in case creating the submission initially (when the user pushed the code) was not successful for whatever reason
                submissionDate = versionControlService.get().getPushDate(participation, commitHash.get(), null);
            }
            catch (VersionControlException e) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
            // repository when a lock repository policy is present. At this point, we know that the programming
            // exercise exists.
            SubmissionPolicy submissionPolicy = programmingExerciseRepository.findWithSubmissionPolicyById(programmingExercise.getId()).get().getSubmissionPolicy();
            if (submissionPolicy instanceof LockRepositoryPolicy policy) {
                submissionPolicyService.handleLockRepositoryPolicy(processedResult, (Participation) participation, policy);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
        Result newResult = null;
        try {
            var buildResult = continuousIntegrationService.get().convertBuildResult(requestBody);
            checkCorrectBranchElseThrow(participation, buildResult);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
    private Result updateLatestSemiAutomaticResultWithNewAutomaticFeedback(long lastSemiAutomaticResultId, Result newAutomaticResult) {
        // Note: fetch the semi-automatic result with feedback and assessor again from the database
        var latestSemiAutomaticResult = resultRepository.findByIdWithEagerFeedbacksAndAssessor(lastSemiAutomaticResultId).get();
        // this makes it the most recent result, but optionally keeps the draft state of an unfinished manual result
        latestSemiAutomaticResult.setCompletionDate(latestSemiAutomaticResult.getCompletionDate() != null ? newAutomaticResult.getCompletionDate() : null);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
            }
            if (Strings.isNullOrEmpty(participationDefaultBranch)) {
                participationDefaultBranch = versionControlService.get().getOrRetrieveBranchOfExercise(participation.getProgrammingExercise());
            }

```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
        log.info("sun.jnu.encoding={}", System.getProperty("sun.jnu.encoding"));
        log.info("Default Charset={}", Charset.defaultCharset());
        log.info("Default Charset in Use={}", new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding());
        this.fileService = fileService;
        this.zipFileService = zipFileService;
```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/CoverageReportResource.java`
#### Snippet
```java

        var optionalReportWithoutFileReports = testwiseCoverageService.getCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(exercise);
        if (optionalReportWithoutFileReports.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/CoverageReportResource.java`
#### Snippet
```java

        var optionalReportWithFileReports = testwiseCoverageService.getFullCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(exercise);
        if (optionalReportWithFileReports.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
    public Optional<CoverageReport> getFullCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(ProgrammingExercise programmingExercise) {
        var optionalLazyReport = getCoverageReportForLatestSolutionSubmissionFromProgrammingExercise(programmingExercise);
        if (optionalLazyReport.isEmpty()) {
            return Optional.empty();
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
            tutorialGroupScheduleRepository.delete(oldSchedule.get());
        }
        else if (newSchedule.isPresent()) { // new schedule present but not old schedule -> create new schedule
            saveScheduleAndGenerateScheduledSessions(tutorialGroupsConfiguration, tutorialGroup, newSchedule.get());
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/repository/ExamRepository.java`
#### Snippet
```java
    default Set<Exercise> findAllExercisesByExamId(long examId) {
        var exam = findWithExerciseGroupsAndExercisesById(examId);
        if (exam.isEmpty()) {
            return Set.of();
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java
    default boolean isCurrentUser(String login) {
        var currentUserLogin = SecurityUtils.getCurrentUserLogin();
        if (currentUserLogin.isEmpty()) {
            return false;
        }
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `assignmentTopic` may be 'static'
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/TeamWebsocketService.java`
#### Snippet
```java
    private final SimpMessageSendingOperations messagingTemplate;

    private final String assignmentTopic = "/topic/team-assignments";

    public TeamWebsocketService(SimpMessageSendingOperations messagingTemplate) {
```

### RuleId[ruleID=FieldMayBeStatic]
Field `newAnnouncementDE` may be 'static'
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
    private final String newAnnouncementEN = "New announcement \"%s\" in course \"%s\"";

    private final String newAnnouncementDE = "Neue Ank?ndigung \"%s\" im Kurs \"%s\"";

    // time related variables
```

### RuleId[ruleID=FieldMayBeStatic]
Field `newAnnouncementEN` may be 'static'
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java

    // Translation that can not be done via i18n Resource Bundle (for Thymeleaf) but has to be set in this service via Java
    private final String newAnnouncementEN = "New announcement \"%s\" in course \"%s\"";

    private final String newAnnouncementDE = "Neue Ank?ndigung \"%s\" im Kurs \"%s\"";
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/StringUtil.java`
#### Snippet
```java
 * Utility class for String manipulation
 */
public class StringUtil {

    public static String ILLEGAL_CHARACTERS = "#%&{}\\<>*?/$!'\":@+`|=";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PageUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/web/rest/util/PageUtil.java`
#### Snippet
```java
import de.tum.in.www1.artemis.web.rest.dto.PageableSearchDTO;

public class PageUtil {

    @NotNull
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TutorialGroupDateUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupDateUtil.java`
#### Snippet
```java
import java.time.format.DateTimeParseException;

public class TutorialGroupDateUtil {

    /*
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Scopes` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/lti/Scopes.java`
#### Snippet
```java
package de.tum.in.www1.artemis.domain.lti;

public class Scopes {

    public static final String AGS_SCORE = "https://purl.imsglobal.org/spec/lti-ags/scope/score";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ScoringStrategyShortAnswerUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/scoring/ScoringStrategyShortAnswerUtil.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.quiz.*;

public class ScoringStrategyShortAnswerUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TutorialGroupNotificationFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/notification/TutorialGroupNotificationFactory.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.tutorialgroups.TutorialGroup;

public class TutorialGroupNotificationFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NotificationTitleTypeConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/notification/NotificationTitleTypeConstants.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.enumeration.NotificationType;

public class NotificationTitleTypeConstants {

    public static final String LIVE_EXAM_EXERCISE_UPDATE_NOTIFICATION_TITLE = "Live Exam Exercise Update";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NotificationTargetFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/notification/NotificationTargetFactory.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.tutorialgroups.TutorialGroup;

public class NotificationTargetFactory {

    // shared constants
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GroupNotificationFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/notification/GroupNotificationFactory.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.metis.Post;

public class GroupNotificationFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SingleUserNotificationFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/domain/notification/SingleUserNotificationFactory.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.tutorialgroups.TutorialGroup;

public class SingleUserNotificationFactory {

    private static final String POST_NOTIFICATION_TEXT = "Your post got replied.";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpRequestUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/HttpRequestUtils.java`
#### Snippet
```java
import inet.ipaddr.IPAddressString;

public class HttpRequestUtils {

    private static final String[] IP_HEADER_CANDIDATES = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED",
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TimeLogUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/TimeLogUtil.java`
#### Snippet
```java
package de.tum.in.www1.artemis.service.util;

public class TimeLogUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RoundingUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/RoundingUtil.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.Course;

public class RoundingUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `XmlFileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/XmlFileUtils.java`
#### Snippet
```java
import org.xml.sax.SAXException;

public class XmlFileUtils {

    private static final Logger log = LoggerFactory.getLogger(XmlFileUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UrlUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/UrlUtils.java`
#### Snippet
```java
import org.springframework.web.util.UriComponentsBuilder;

public class UrlUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OracleGenerator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/OracleGenerator.java`
#### Snippet
```java
 * </ol>
 */
public class OracleGenerator {

    private static final Logger log = LoggerFactory.getLogger(OracleGenerator.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SerializerUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/util/structureoraclegenerator/SerializerUtil.java`
#### Snippet
```java
 * repetition.
 */
class SerializerUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SimilarityUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/utils/SimilarityUtils.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class SimilarityUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CompassConfiguration` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/utils/CompassConfiguration.java`
#### Snippet
```java
 * All similarity related parameters
 */
public class CompassConfiguration {

    /*
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JSONMapping` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/utils/JSONMapping.java`
#### Snippet
```java
 * JSON keywords
 */
public class JSONMapping {

    // general
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NameSimilarity` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/strategy/NameSimilarity.java`
#### Snippet
```java
import me.xdrop.fuzzywuzzy.FuzzySearch;

public class NameSimilarity {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UMLModelParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/UMLModelParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLElement;

public class UMLModelParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommunicationDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/CommunicationDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.object.UMLObject;

public class CommunicationDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SyntaxTreeParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/SyntaxTreeParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.syntaxtree.SyntaxTreeTerminal;

public class SyntaxTreeParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ComponentDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ComponentDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.component.UMLComponentRelationship;

public class ComponentDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DeploymentDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/DeploymentDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.deployment.*;

public class DeploymentDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PetriNetParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/PetriNetParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.petrinet.PetriNetTransition;

public class PetriNetParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ActivityDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ActivityDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.activity.*;

public class ActivityDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UseCaseDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/UseCaseDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.usecase.*;

public class UseCaseDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FlowchartParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/FlowchartParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.flowchart.*;

public class FlowchartParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ObjectDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ObjectDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.object.*;

public class ObjectDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassDiagramParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.umlmodel.classdiagram.*;

public class ClassDiagramParser {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FeedbackSelector` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/FeedbackSelector.java`
#### Snippet
```java
import de.tum.in.www1.artemis.service.compass.utils.CompassConfiguration;

public class FeedbackSelector {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JenkinsBuildLogParseUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildLogParseUtils.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.BuildLogEntry;

public class JenkinsBuildLogParseUtils {

    // Pattern of the DateTime that is included in the logs received from Jenkins
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JenkinsBuildPlanUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanUtils.java`
#### Snippet
```java
import org.w3c.dom.Node;

public class JenkinsBuildPlanUtils {

    private static final String PIPELINE_SCRIPT_DETECTION_COMMENT = "// ARTEMIS: JenkinsPipeline";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JenkinsJobPermissionsUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobPermissionsUtils.java`
#### Snippet
```java
import org.w3c.dom.*;

public class JenkinsJobPermissionsUtils {

    public static void removePermissionsFromFolder(Document jobConfig, Set<JenkinsJobPermission> permissionsToRemove, Set<String> userLogins) throws DOMException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MessageSpecs` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/repository/specs/MessageSpecs.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.metis.Post_;

public class MessageSpecs {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InetSocketAddressValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/validation/InetSocketAddressValidator.java`
#### Snippet
```java
import java.util.Optional;

public class InetSocketAddressValidator {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PostSpecs` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/repository/specs/PostSpecs.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.metis.*;

public class PostSpecs {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UserSpecs` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
 * This class contains possible specifications to query for specified users.
 */
public class UserSpecs {

    private static final long FILTER_EMPTY_COURSES = -1;
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalRelation.java`
#### Snippet
```java
         * The tail learning goal matches the head learning goal (e.g., a duplicate).
         */
        MATCHES;
    }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
        }

        try (var reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8)); var writer = new BufferedWriter(new FileWriter(tempFile, StandardCharsets.UTF_8));) {
            Map.Entry<Pattern, Boolean> matchingStartPattern = null;
            String line = reader.readLine();
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java
        }
        Attachment result = attachmentRepository.save(attachment);
        this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(result.getLink()));
        return ResponseEntity.created(new URI("/api/attachments/" + result.getId())).body(result);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java
            relatedEntity = "lecture " + attachment.getLecture().getTitle();
            try {
                this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(attachment.getLink()));
            }
            catch (RuntimeException exception) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/AttachmentResource.java`
#### Snippet
```java

        Attachment result = attachmentRepository.save(attachment);
        this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(result.getLink()));
        if (notificationText != null) {
            groupNotificationService.notifyStudentGroupAboutAttachmentChange(result, notificationText);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `split` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadSubmissionResource.java`
#### Snippet
```java
    private static void checkFilePattern(MultipartFile file, FileUploadExercise exercise) {
        // Check the pattern
        final String[] splittedFileName = file.getOriginalFilename().split("\\.");
        final String fileSuffix = splittedFileName[splittedFileName.length - 1].toLowerCase();
        final String filePattern = String.join("|", exercise.getFilePattern().toLowerCase().replaceAll("\\s", "").split(","));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java

        if (response.getStatusCode().is2xxSuccessful()) {
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, exercise, response.getBody().getFeedbacks());

            // call feedback conflict service
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            // call feedback conflict service
            if (exercise.isAutomaticAssessmentEnabled() && automaticTextAssessmentConflictService.isPresent()) {
                this.automaticTextAssessmentConflictService.get().asyncCheckFeedbackConsistency(textAssessment.getTextBlocks(), textSubmission.getLatestResult().getFeedbacks(),
                        exercise.getId());
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSubmission` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
        final var response = super.saveExampleAssessment(exampleSubmissionId, textAssessment.getFeedbacks());
        if (response.getStatusCode().is2xxSuccessful()) {
            final Submission submission = response.getBody().getSubmission();
            final var textSubmission = textSubmissionService.findOneWithEagerResultFeedbackAndTextBlocks(submission.getId());
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, textExerciseRepository.findByIdElseThrow(exerciseId), response.getBody().getFeedbacks());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java

        if (response.getStatusCode().is2xxSuccessful()) {
            saveTextBlocks(textAssessment.getTextBlocks(), textSubmission, (TextExercise) result.getParticipation().getExercise(), response.getBody().getFeedbacks());
        }

```

### RuleId[ruleID=DataFlowIssue]
Argument `e.getMessage()` might be null
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
        }
        else {
            return new HttpEntity<>(e.getMessage());
        }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRequestURI` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
        }
        ProblemBuilder builder = Problem.builder().withType(Problem.DEFAULT_TYPE.equals(problem.getType()) ? ErrorConstants.DEFAULT_TYPE : problem.getType())
                .withStatus(problem.getStatus()).withTitle(problem.getTitle()).with(PATH_KEY, request.getNativeRequest(HttpServletRequest.class).getRequestURI());

        if (problem instanceof ConstraintViolationProblem) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `participation` might be null
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
            // set view
            var view = quizExercise.viewForStudentsInQuizExercise(quizBatch.get());
            MappingJacksonValue value = new MappingJacksonValue(participation);
            value.setSerializationView(view);
            return value;
```

### RuleId[ruleID=DataFlowIssue]
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
            throw new BadRequestException("You can not activate a session that is cancelled by a overlapping with a free period");
        }
        checkEntityIdMatchesPathIds(sessionToActivate, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId), Optional.ofNullable(sessionId));
        tutorialGroupService.isAllowedToModifySessionsOfTutorialGroup(sessionToActivate.getTutorialGroup(), null);
        sessionToActivate.setStatus(TutorialGroupSessionStatus.ACTIVE);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/config/WebConfigurer.java`
#### Snippet
```java
     */
    private String resolvePathPrefix() {
        String fullExecutablePath = decode(this.getClass().getResource("").getPath(), StandardCharsets.UTF_8);
        String rootPath = Path.of(".").toUri().normalize().getPath();
        String extractedPath = fullExecutablePath.replace(rootPath, "");
```

### RuleId[ruleID=DataFlowIssue]
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        var oldTutorialGroup = this.tutorialGroupRepository.findByIdWithTeachingAssistantAndRegistrationsElseThrow(tutorialGroupId);
        updatedTutorialGroup.setCourse(oldTutorialGroup.getCourse());
        checkEntityIdMatchesPathIds(oldTutorialGroup, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId));
        var responsibleUser = userRepository.getUserWithGroupsAndAuthorities();
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, oldTutorialGroup.getCourse(), responsibleUser);
```

### RuleId[ruleID=DataFlowIssue]
Function may return null, but it's not allowed here
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, courseFromDatabase, null);
        var registrations = tutorialGroupService.importRegistrations(courseFromDatabase, importDTOs);
        var sortedRegistrations = registrations.stream().sorted(Comparator.comparing(TutorialGroupRegistrationImportDTO::title)).toList();
        return ResponseEntity.ok().body(sortedRegistrations);
    }
```

### RuleId[ruleID=DataFlowIssue]
Passing a non-null argument to `Optional`
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
        var responsibleUser = userRepository.getUserWithGroupsAndAuthorities();
        authorizationCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.INSTRUCTOR, tutorialGroupFromDatabase.getCourse(), responsibleUser);
        checkEntityIdMatchesPathIds(tutorialGroupFromDatabase, Optional.ofNullable(courseId), Optional.ofNullable(tutorialGroupId));
        Set<StudentDTO> notFoundStudentDtos = tutorialGroupService.registerMultipleStudents(tutorialGroupFromDatabase, studentDtos,
                TutorialGroupRegistrationType.INSTRUCTOR_REGISTRATION, responsibleUser);
```

### RuleId[ruleID=DataFlowIssue]
Argument `getStartTime()` might be null
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizBatch.java`
#### Snippet
```java
    public Long getRemainingTime() {
        return isStarted()
                ? getQuizExercise() == null ? 0 : ChronoUnit.SECONDS.between(ZonedDateTime.now(), ChronoUnit.SECONDS.addTo(getStartTime(), getQuizExercise().getDuration()))
                : null;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isBefore` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizExercise.java`
#### Snippet
```java
        super.validateDates();
        quizBatches.forEach(quizBatch -> {
            if (quizBatch.getStartTime().isBefore(getReleaseDate())) {
                throw new BadRequestAlertException("Start time must not be before release date!", getTitle(), "noValidDates");
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `evict` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/AttachmentUnitService.java`
#### Snippet
```java
    private void evictCache(MultipartFile file, AttachmentUnit attachmentUnit) {
        if (file != null && !file.isEmpty()) {
            this.cacheManager.getCache("files").evict(fileService.actualPathForPublicPath(attachmentUnit.getAttachment().getLink()));
        }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setSubmission` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
        }

        submissions.forEach(submission -> submission.getLatestResult().setSubmission(null));
        return submissions;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAssessor` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
            // if disabled, please switch tutorAssessUnique within the tests
            submissionsWithoutResult = submissionsWithoutResult.stream()
                    .filter(submission -> !submission.getResultForCorrectionRound(correctionRound - 1).getAssessor().equals(userRepository.getUser())).toList();
        }

```

### RuleId[ruleID=DataFlowIssue]
Argument `originalSubmission.getLatestResult()` might be null
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
            newSubmission = submissionRepository.saveAndFlush(newSubmission);
            newSubmission.setBlocks(copyTextBlocks(((TextSubmission) originalSubmission).getBlocks(), newSubmission));
            newSubmission.addResult(copyExampleResult(originalSubmission.getLatestResult(), newSubmission, gradingInstructionCopyTracker));
            newSubmission = submissionRepository.saveAndFlush(newSubmission);
            newSubmission = textSubmissionRepository.findByIdWithEagerResultsAndFeedbackAndTextBlocksElseThrow(newSubmission.getId());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFeedbacks` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/TextExerciseImportService.java`
#### Snippet
```java
    private void updateFeedbackReferencesWithNewTextBlockIds(Set<TextBlock> originalTextBlocks, TextSubmission newSubmission) {
        Result newResult = newSubmission.getLatestResult();
        List<Feedback> newFeedbackList = newResult.getFeedbacks();
        Set<TextBlock> newSubmissionTextBlocks = newSubmission.getBlocks();

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        final var submissionId = submission.getId();
        var filename = file.getOriginalFilename();
        if (filename.contains("\\")) {
            // this can happen on Windows computers, then we want to take the last element of the file path
            var components = filename.split("\\\\");
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // Note: we configure the repository webhook last, so that the potential empty commit does not trigger a new programming submission (see empty-commit-necessary)
        // Step 3) configure the web hook of the student repository
        participation = configureRepositoryWebHook(participation);
        // Step 4a) Set the InitializationState to initialized to indicate, the programming exercise is ready
        participation.setInitializationState(INITIALIZED);
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            programmingParticipation = copyRepository(programmingExercise, programmingExercise.getVcsTemplateRepositoryUrl(), programmingParticipation);
            programmingParticipation = configureRepository(programmingExercise, programmingParticipation);
            programmingParticipation = configureRepositoryWebHook(programmingParticipation);
            participation = programmingParticipation;
            if (programmingExercise.getBuildAndTestStudentSubmissionsAfterDueDate() != null || programmingExercise.getAssessmentType() != AssessmentType.AUTOMATIC
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getScore` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/MailService.java`
#### Snippet
```java
            StudentParticipation studentParticipation = exercise.getStudentParticipations().stream()
                    .filter(participation -> participation.getStudent().orElseThrow().equals(recipientStudent)).findFirst().orElseThrow();
            Double score = studentParticipation.findLatestResult().getScore();
            context.setVariable(ASSESSED_SCORE, score);
            context.setVariable(RELATIVE_SCORE, exercise.getMaxPoints() / score);
```

### RuleId[ruleID=DataFlowIssue]
Argument `status` might be null
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
                log.warn("Unable to add exam exercise start status to distributed cache because it is null");
            }
            messagingTemplate.convertAndSend(EXAM_EXERCISE_START_STATUS_TOPIC.formatted(examId), status);
        }
        catch (Exception e) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
        UMLAttribute otherAttribute = (UMLAttribute) obj;

        return Objects.equals(otherAttribute.getAttributeType(), getAttributeType()) && Objects.equals(otherAttribute.getParentElement().getName(), getParentElement().getName());
    }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
        UMLAttribute otherAttribute = (UMLAttribute) obj;

        return Objects.equals(otherAttribute.getAttributeType(), getAttributeType()) && Objects.equals(otherAttribute.getParentElement().getName(), getParentElement().getName());
    }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLAttribute.java`
#### Snippet
```java
     */
    private boolean parentsSimilar(UMLAttribute referenceAttribute) {
        if (parentElement.getSimilarityID() != -1 && referenceAttribute.getParentElement().getSimilarityID() != -1) {
            return parentElement.getSimilarityID() == referenceAttribute.getParentElement().getSimilarityID();
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        }

        return Objects.equals(otherMethod.getReturnType(), getReturnType()) && Objects.equals(otherMethod.getParentElement().getName(), getParentElement().getName());
    }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLMethod.java`
#### Snippet
```java
        }

        return Objects.equals(otherMethod.getReturnType(), getReturnType()) && Objects.equals(otherMethod.getParentElement().getName(), getParentElement().getName());
    }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java

            if (element instanceof UMLAttribute attribute) {
                context = new Context(attribute.getParentElement().getSimilarityID());
            }
            else if (element instanceof UMLMethod method) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSimilarityID` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
            }
            else if (element instanceof UMLMethod method) {
                context = new Context(method.getParentElement().getSimilarityID());
            }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/athene/AtheneHealthIndicator.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(atheneUrl + "/queueStatus", JsonNode.class);
            var isUp = status.get("total").isNumber();
            health = new ConnectorHealth(isUp);
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
                // If JIRA requires a CAPTCHA. Communicate this to the client
                if (e.getResponseHeaders() != null && e.getResponseHeaders().containsKey("X-Authentication-Denied-Reason")) {
                    String authenticationDeniedReason = e.getResponseHeaders().get("X-Authentication-Denied-Reason").get(0);
                    if (authenticationDeniedReason.toLowerCase().contains("captcha")) {
                        throw new CaptchaRequiredException("CAPTCHA required");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(jiraUrl + "/status", JsonNode.class);
            health = status.get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
            var uri = UriComponentsBuilder.fromHttpUrl(serverUrl.toString()).pathSegment("job", projectKey, "job", planKey, "lastBuild", "api", "json").build().toUri();
            var response = restTemplate.getForObject(uri, JsonNode.class);
            var isJobBuilding = response.get("building").asBoolean();
            return isJobBuilding ? ContinuousIntegrationService.BuildStatus.BUILDING : ContinuousIntegrationService.BuildStatus.INACTIVE;
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
        try {
            final var response = restTemplate.exchange(jenkinsURL.toString() + "/crumbIssuer/api/json", HttpMethod.GET, entity, JsonNode.class);
            final var sessionId = response.getHeaders().get("Set-Cookie").get(0);
            headersToAuthenticate.add("Jenkins-Crumb", response.getBody().get("crumb").asText());
            headersToAuthenticate.add("Cookie", sessionId);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsAuthorizationInterceptor.java`
#### Snippet
```java
            final var response = restTemplate.exchange(jenkinsURL.toString() + "/crumbIssuer/api/json", HttpMethod.GET, entity, JsonNode.class);
            final var sessionId = response.getHeaders().get("Set-Cookie").get(0);
            headersToAuthenticate.add("Jenkins-Crumb", response.getBody().get("crumb").asText());
            headersToAuthenticate.add("Cookie", sessionId);
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabService.java`
#### Snippet
```java
            final var uri = Endpoints.HEALTH.buildEndpoint(gitlabServerUrl.toString()).build().toUri();
            final var healthResponse = shortTimeoutRestTemplate.getForObject(uri, JsonNode.class);
            final var status = healthResponse.get("status").asText();
            if (!status.equals("ok")) {
                return new ConnectorHealth(false, Map.of("status", status, "url", gitlabServerUrl));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java

        // Note: Content-Type might contain additional elements such as the UTF-8 encoding, therefore we now use contains instead of equals
        if (response.getHeaders().containsKey("Content-Type") && response.getHeaders().get("Content-Type").get(0).contains("text/html")) {
            // This is an "Index of" HTML page.
            String html = new String(response.getBody(), StandardCharsets.UTF_8);
```

### RuleId[ruleID=DataFlowIssue]
Argument `response.getBody()` might be null
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        if (response.getHeaders().containsKey("Content-Type") && response.getHeaders().get("Content-Type").get(0).contains("text/html")) {
            // This is an "Index of" HTML page.
            String html = new String(response.getBody(), StandardCharsets.UTF_8);
            Pattern pattern = Pattern.compile("href=\"(.*?)\"", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(html);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.exchange(serverUrl + "/rest/api/latest/server", HttpMethod.GET, null, JsonNode.class);
            health = status.getBody().get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `name` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
            case C -> {
                // Default tasks:
                var tasks = readScriptTasksFromTemplate(programmingLanguage, File.separator + projectType.name().toLowerCase(), sequentialBuildRuns, false, null);
                tasks.add(0, checkoutTask);
                defaultJob.tasks(tasks.toArray(new Task[0]));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketService.java`
#### Snippet
```java
        try {
            final var status = shortTimeoutRestTemplate.getForObject(bitbucketServerUrl + "/status", JsonNode.class);
            health = status.get("state").asText().equals("RUNNING") ? new ConnectorHealth(true) : new ConnectorHealth(false);
        }
        catch (Exception emAll) {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `projectType` may produce `NullPointerException`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            }
            case SWIFT -> {
                switch (projectType) {
                    case PLAIN -> {
                        fileService.replaceVariablesInDirectoryName(repository.getLocalPath().toAbsolutePath().toString(), "${packageNameFolder}",
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/de/tum/in/www1/artemis/service/metis/ConversationService.java`
#### Snippet
```java

        List<Conversation> conversations = conversationRepository.findActiveConversationsOfUserWithConversationParticipants(courseId, user.getId());
        conversations.stream().forEach(conversation -> filterSensitiveInformation(conversation, user));

        return conversations;
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostService.java`
#### Snippet
```java
            // protect sample solution, grading instructions, etc.
            plagiarismCasePosts.stream().map(Post::getExercise).filter(Objects::nonNull).forEach(Exercise::filterSensitiveInformation);
            plagiarismCasePosts.stream().forEach(post -> post.setCourse(course));

            return plagiarismCasePosts;
```

## RuleId[ruleID=MissingSerialAnnotation]
### RuleId[ruleID=MissingSerialAnnotation]
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/de/tum/in/www1/artemis/domain/PersistentAuditEvent.java`
#### Snippet
```java
public class PersistentAuditEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
```

### RuleId[ruleID=MissingSerialAnnotation]
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/de/tum/in/www1/artemis/security/UserNotActivatedException.java`
#### Snippet
```java
public class UserNotActivatedException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public UserNotActivatedException(String message) {
```

## RuleId[ruleID=RemoveExplicitTypeArguments]
### RuleId[ruleID=RemoveExplicitTypeArguments]
Remove explicit type arguments
in `src/main/resources/templates/kotlin/exercise/src/${packageNameFolder}/MergeSort.kt`
#### Snippet
```java
    fun performSort(a: Array<Int>) {
        val n = a.size
        val aux = Array<Int>(n) { 0 }
        sort(a, aux, 0, n)
    }
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'LegacyPasswordService' is still used
in `src/main/java/de/tum/in/www1/artemis/service/user/LegacyPasswordService.java`
#### Snippet
```java
@Service
@Deprecated
public class LegacyPasswordService {

    @Value("${artemis.encryption-password}")
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### RuleId[ruleID=MethodOverloadsParentMethod]
Method `cancelAssessment()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadAssessmentResource.java`
#### Snippet
```java
    @PutMapping("/file-upload-submissions/{submissionId}/cancel-assessment")
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Void> cancelAssessment(@PathVariable Long submissionId) {
        return super.cancelAssessment(submissionId);
    }
```

### RuleId[ruleID=MethodOverloadsParentMethod]
Method `cancelAssessment()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingAssessmentResource.java`
#### Snippet
```java
    @PutMapping("/modeling-submissions/{submissionId}/cancel-assessment")
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Void> cancelAssessment(@PathVariable Long submissionId) {
        return super.cancelAssessment(submissionId);
    }
```

### RuleId[ruleID=MethodOverloadsParentMethod]
Method `cancelAssessment()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingAssessmentResource.java`
#### Snippet
```java
    @PutMapping("/programming-submissions/{submissionId}/cancel-assessment")
    @PreAuthorize("hasRole('TA')")
    public ResponseEntity<Void> cancelAssessment(@PathVariable Long submissionId) {
        return super.cancelAssessment(submissionId);
    }
```

### RuleId[ruleID=MethodOverloadsParentMethod]
Method `getRandomAssessableSubmission()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
     * @return a programmingSubmission without any manual result or an empty Optional if no submission without manual result could be found
     */
    public Optional<ProgrammingSubmission> getRandomAssessableSubmission(ProgrammingExercise programmingExercise, boolean examMode, int correctionRound) {
        var submissionWithoutResult = super.getRandomAssessableSubmission(programmingExercise, examMode, correctionRound);
        if (submissionWithoutResult.isPresent()) {
```

### RuleId[ruleID=MethodOverloadsParentMethod]
Method `getNextAssessableSubmission()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
     * @return a programmingSubmission without any manual result or an empty Optional if no submission without manual result could be found
     */
    public Optional<ProgrammingSubmission> getNextAssessableSubmission(ProgrammingExercise programmingExercise, boolean examMode, int correctionRound) {
        var submissionWithoutResult = super.getNextAssessableSubmission(programmingExercise, examMode, correctionRound);
        if (submissionWithoutResult.isPresent()) {
```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains array `byte[]`
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java
                .toList();

        Optional<byte[]> file = fileService.mergePdfFiles(attachmentLinks, lectureRepository.getLectureTitle(lectureId));
        if (file.isEmpty()) {
            log.error("Failed to merge PDF lecture units for lecture with id {}", lectureId);
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains array `byte[]`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
     * @return byte array of the merged file
     */
    public Optional<byte[]> mergePdfFiles(List<String> paths, String mergedPdfFileName) {
        if (paths == null || paths.isEmpty()) {
            return Optional.empty();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationUpdateService.java`
#### Snippet
```java
     */
    void updatePlanRepository(String projectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String vcsRepoName, String branchName,
            Optional<List<String>> triggeredBy);
}

```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationService.java`
#### Snippet
```java
     */
    void updatePlanRepository(String buildProjectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String newRepoUrl, String existingRepoUrl, String newBranch,
            Optional<List<String>> optionalTriggeredByRepositories);

    /**
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/BitbucketBambooUpdateService.java`
#### Snippet
```java
    @Override
    public void updatePlanRepository(String bambooProjectKey, String buildPlanKey, String bambooRepositoryName, String bitbucketProjectKey, String bitbucketRepositoryName,
            String branchName, Optional<List<String>> optionalTriggeredByRepositories) {
        try {
            log.debug("Update plan repository for build plan {}", buildPlanKey);
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
    @Override
    public void updatePlanRepository(String buildProjectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String newRepoUrl, String existingRepoUrl,
            String newDefaultBranch, Optional<List<String>> optionalTriggeredByRepositories) {
        jenkinsBuildPlanService.updateBuildPlanRepositories(buildProjectKey, buildPlanKey, newRepoUrl, existingRepoUrl);
    }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
    @Override
    public void updatePlanRepository(String buildProjectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String newRepoUrl, String existingRepoUrl,
            String newBranch, Optional<List<String>> optionalTriggeredByRepositories) throws BambooException {
        final var vcsRepoName = urlService.getRepositorySlugFromRepositoryUrlString(newRepoUrl);
        continuousIntegrationUpdateService.get().updatePlanRepository(buildProjectKey, buildPlanKey, ciRepoName, repoProjectKey, vcsRepoName, newBranch,
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Set`
in `src/main/java/de/tum/in/www1/artemis/repository/TextBlockRepository.java`
#### Snippet
```java
public interface TextBlockRepository extends JpaRepository<TextBlock, String> {

    Optional<Set<TextBlock>> findAllByCluster(TextCluster textCluster);

    @EntityGraph(type = LOAD, attributePaths = { "cluster" })
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Set`
in `src/main/java/de/tum/in/www1/artemis/repository/hestia/ProgrammingExerciseTaskRepository.java`
#### Snippet
```java
            AND tc.exercise.id = :exerciseId
            """)
    Optional<Set<ProgrammingExerciseTask>> findByExerciseIdWithTestCaseAndSolutionEntries(@Param("exerciseId") long exerciseId);

    /**
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Set`>
in `src/main/java/de/tum/in/www1/artemis/repository/plagiarism/PlagiarismComparisonRepository.java`
#### Snippet
```java

    @EntityGraph(type = LOAD, attributePaths = { "submissionA", "submissionA.plagiarismCase", "submissionB", "submissionB.plagiarismCase" })
    Optional<Set<PlagiarismComparison<?>>> findBySubmissionA_SubmissionIdOrSubmissionB_SubmissionId(long submissionA_submissionId, long submissionB_submissionId);

    @Modifying
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/de/tum/in/www1/artemis/service/metis/AnswerPostService.java`
#### Snippet
```java

        // sets the post as resolved if there exists any resolving answer
        post.setResolved(post.getAnswers().stream().anyMatch(answerPost1 -> answerPost1.doesResolvePost()));
        // deletes the answerPost from database and persists updates on the post properties
        postRepository.save(post);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/de/tum/in/www1/artemis/service/metis/AnswerPostService.java`
#### Snippet
```java
            existingAnswerPost.setResolvesPost(answerPost.doesResolvePost());
            // sets the post as resolved if there exists any resolving answer
            existingAnswerPost.getPost().setResolved(existingAnswerPost.getPost().getAnswers().stream().anyMatch(answer -> answer.doesResolvePost()));
            postRepository.save(existingAnswerPost.getPost());
        }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/de/tum/in/www1/artemis/service/metis/PostingService.java`
#### Snippet
```java
        // fetches and sets groups and authorities of all posting authors involved, which are used to display author role icon in the posting header
        // converts fetched set to hashmap type for performant matching of authors
        Map<Long, User> authors = userRepository.findAllWithGroupsAndAuthoritiesByIdIn(userIds).stream().collect(Collectors.toMap(user -> user.getId(), Function.identity()));

        // sets respective author role to display user authority icon on posting headers
```

## RuleId[ruleID=ObviousNullCheck]
### RuleId[ruleID=ObviousNullCheck]
Redundant null-check: a value of primitive type 'long' is never null
in `src/main/java/de/tum/in/www1/artemis/service/StatisticsService.java`
#### Snippet
```java
        }
        exerciseManagementStatisticsDTO.setNumberOfParticipations(numberOfParticipationsOfStudentsOrTeams);
        exerciseManagementStatisticsDTO.setNumberOfStudentsOrTeamsInCourse(Objects.requireNonNullElse(numberOfStudentsOrTeams, 0L));

        // post stats
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'programmingExerciseTestCaseService' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220210_160300.java`
#### Snippet
```java
    private final ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository;

    private final ProgrammingExerciseTestCaseService programmingExerciseTestCaseService;

    public MigrationEntry20220210_160300(ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository,
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'passwordService' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20211214_184200.java`
#### Snippet
```java
    private final UserRepository userRepository;

    private final LegacyPasswordService passwordService;

    public MigrationEntry20211214_184200(UserRepository userRepository, LegacyPasswordService passwordService) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'passwordService' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220302_164200.java`
#### Snippet
```java
    private final LegacyPasswordService legacyPasswordService;

    private final PasswordService passwordService;

    public MigrationEntry20220302_164200(UserRepository userRepository, LegacyPasswordService legacyPasswordService, PasswordService passwordService) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'legacyPasswordService' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220302_164200.java`
#### Snippet
```java
    private final UserRepository userRepository;

    private final LegacyPasswordService legacyPasswordService;

    private final PasswordService passwordService;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'programmingExerciseTaskService' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220516_180000.java`
#### Snippet
```java
    private final ExerciseHintRepository exerciseHintRepository;

    private final ProgrammingExerciseTaskService programmingExerciseTaskService;

    public MigrationEntry20220516_180000(ProgrammingExerciseRepository programmingExerciseRepository, ExerciseHintRepository exerciseHintRepository,
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'repository' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/domain/File.java`
#### Snippet
```java
public class File extends java.io.File {

    private Repository repository;

    public File(java.io.File file, Repository repository) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'totalNumberOfAssessmentsTransient' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java

    @Transient
    private DueDateStat totalNumberOfAssessmentsTransient;

    @Transient
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'numberOfAssessmentsOfCorrectionRoundsTransient' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java

    @Transient
    private DueDateStat[] numberOfAssessmentsOfCorrectionRoundsTransient;

    @Transient
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'numberOfSubmissionsTransient' in a Serializable class
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
    // NOTE: Helpers variable names must be different from Getter name, so that Jackson ignores the @Transient annotation, but Hibernate still respects it
    @Transient
    private DueDateStat numberOfSubmissionsTransient;

    @Transient
```

## RuleId[ruleID=MismatchedJavadocCode]
### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionService.java`
#### Snippet
```java
     *
     * @param courseId the id of the course
     * @return number of locked submissions for the current user in the given course
     */
    public List<Submission> getLockedSubmissions(long courseId) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseService.java`
#### Snippet
```java
     * @param course corresponding course
     * @param user   the user entity
     * @return a List of all Exercises for the given course
     */
    public Set<Exercise> findAllForCourse(Course course, User user) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/service/TextBlockService.java`
#### Snippet
```java
     *
     * @param submission TextSubmission to split
     * @return List of TextBlocks
     */
    public Set<TextBlock> splitSubmissionIntoBlocks(TextSubmission submission) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/service/hestia/TestwiseCoverageService.java`
#### Snippet
```java
     * count the same covered lines multiple times.
     * @param report the report for which the line counts of its file reports should be caluclated and saved
     * @return the number of covered lines by file path
     */
    private Map<String, Integer> calculateAndSaveUniqueLineCountsByFilePath(CoverageReport report) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/TextBlockRepository.java`
#### Snippet
```java
     * finds their respective cluster and retrieves the number of other blocks in the same cluster
     * @param submissionId the id of the Submission
     * @return the number of other TextBlock's in the same cluster as the block with given `id`
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/repository/ExerciseRepository.java`
#### Snippet
```java
     * @param courseId the id of the course
     * @param login the login of the corresponding user
     * @return list of exercises
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return set but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ExerciseRepository.java`
#### Snippet
```java
     * @param courseId the course to get the exercises for
     * @param now the current date time
     * @return a set of exercises
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return list but the return type is set
in `src/main/java/de/tum/in/www1/artemis/repository/AttachmentUnitRepository.java`
#### Snippet
```java
     * @param lectureId the id of the lecture
     * @param attachmentType the attachment type
     * @return the list of all attachment units with the given lecture id and attachment type
     * @throws EntityNotFoundException if no results are found
     */
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/repository/StudentParticipationRepository.java`
#### Snippet
```java
     * @param courseId      the id of the course for which to consider participations
     * @param teamShortName the short name of the team for which to consider participations
     * @return the number of submissions per participation in the given course for the team
     */
    default Map<Long, Integer> countLegalSubmissionsPerParticipationByCourseIdAndTeamShortNameAsMap(long courseId, String teamShortName) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is map
in `src/main/java/de/tum/in/www1/artemis/repository/StudentParticipationRepository.java`
#### Snippet
```java
     *
     * @param exerciseId the id of the exercise for which to consider participations
     * @return the number of submissions per participation in the given exercise
     */
    default Map<Long, Integer> countSubmissionsPerParticipationByExerciseIdAsMap(long exerciseId) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ProgrammingExerciseRepository.java`
#### Snippet
```java
     *
     * @param exerciseIds the exercise ids we are interested in
     * @return the number of distinct submissions belonging to the exercise id
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintResponseRepository.java`
#### Snippet
```java
     * @param exerciseIds    - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintResponseRepository.java`
#### Snippet
```java
     * @param exerciseIds    - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintRepository.java`
#### Snippet
```java
     * @param exerciseIds    - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ComplaintRepository.java`
#### Snippet
```java
     * @param exerciseIds    - the id of the course we want to filter by
     * @param complaintType - complaint type we want to filter by
     * @return number of complaints associated to exercise exerciseId
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/ModelElementRepository.java`
#### Snippet
```java
     * finds their respective cluster and retrieves the number of other blocks in the same cluster
     * @param submissionId the id of the Submission
     * @return the number of other TextBlock's in the same cluster as the block with given `id`
     */
    @Query("""
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return number but the return type is list
in `src/main/java/de/tum/in/www1/artemis/repository/SubmissionRepository.java`
#### Snippet
```java
     * Should be used for exam dashboard to ignore test run submissions
     * @param exerciseIds the exercise id we are interested in
     * @return the number of submissions belonging to the exercise id, which have the submitted flag set to true and the submission date before the exercise due date, or no
     *         exercise due date at all
     */
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * Check if the provided test was found in the result's feedbacks with positive = true.
     * @param result of the build run.
     * @return true if there is a positive feedback for a given test.
     */
    private Predicate<ProgrammingExerciseTestCase> isSuccessful(Result result) {
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
     * Check if the provided test was not found in the result's feedbacks.
     * @param result of the build run.
     * @return true if there is no feedback for a given test.
     */
    private Predicate<ProgrammingExerciseTestCase> wasNotExecuted(Result result) {
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/CombineChangeBlocks.java`
#### Snippet
```java
                            newChangeBlocks.add(new GroupedFile.ChangeBlock(lines));
                            // Skip the next change block, as it has already been processed
                            i++;
                            continue;
                        }
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/de/tum/in/www1/artemis/service/notifications/NotificationSettingsService.java`
#### Snippet
```java
        Map<NotificationType, Boolean> notificationSettingWithActivationStatusMap = convertNotificationSettingsToNotificationTypesWithActivationStatus(communicationChannel,
                notificationSettings);
        Set<NotificationType> deactivatedNotificationTypes = new HashSet<>();
        notificationSettingWithActivationStatusMap.forEach((notificationType, isActivated) -> {
            if (!isActivated) {
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220302_164200.java`
#### Snippet
```java
            // Set internal state again due to an issue with setting the correct status during registration (PR #4806)
            // As the passwords of all external users were set to the encrypted empty string in Migration Entry 20211214_184200
            user.setInternal(!"".equals(password));
        }

```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseTaskService.java`
#### Snippet
```java
    private List<String> extractTestCaseNames(String capturedTestCaseNames) {
        List<String> testCaseNames = new ArrayList<>();
        if ("".equals(capturedTestCaseNames)) {
            return testCaseNames;
        }
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
    private final SubmissionRepository submissionRepository;

    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final UserRepository userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
            AuthorizationCheckService authCheckService, ProgrammingExerciseRepository programmingExerciseRepository,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, GradingCriterionRepository gradingCriterionRepository,
            SubmissionRepository submissionRepository, ExerciseDateService exerciseDateService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingSubmissionResource.java`
#### Snippet
```java
            ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, GradingCriterionRepository gradingCriterionRepository,
            SubmissionRepository submissionRepository, ExerciseDateService exerciseDateService) {
        this.programmingSubmissionService = programmingSubmissionService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'saml2Service'
in `src/main/java/de/tum/in/www1/artemis/web/rest/UserJWTController.java`
#### Snippet
```java
    private final Optional<SAML2Service> saml2Service;

    public UserJWTController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, Optional<SAML2Service> saml2Service) {
        this.tokenProvider = tokenProvider;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'saml2Service'
in `src/main/java/de/tum/in/www1/artemis/web/rest/UserJWTController.java`
#### Snippet
```java
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    private final Optional<SAML2Service> saml2Service;

    public UserJWTController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, Optional<SAML2Service> saml2Service) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'atheneTrackingTokenProvider'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
    private final PlagiarismService plagiarismService;

    private final Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider;

    public TextSubmissionResource(SubmissionRepository submissionRepository, ResultService resultService, TextSubmissionRepository textSubmissionRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'atheneScheduleService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
            ExerciseRepository exerciseRepository, TextExerciseRepository textExerciseRepository, AuthorizationCheckService authCheckService,
            TextSubmissionService textSubmissionService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            GradingCriterionRepository gradingCriterionRepository, TextAssessmentService textAssessmentService, Optional<AtheneScheduleService> atheneScheduleService,
            ExamSubmissionService examSubmissionService, PlagiarismService plagiarismService, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider) {
        super(submissionRepository, resultService, authCheckService, userRepository, exerciseRepository, textSubmissionService, studentParticipationRepository);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'atheneTrackingTokenProvider'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
            TextSubmissionService textSubmissionService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            GradingCriterionRepository gradingCriterionRepository, TextAssessmentService textAssessmentService, Optional<AtheneScheduleService> atheneScheduleService,
            ExamSubmissionService examSubmissionService, PlagiarismService plagiarismService, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider) {
        super(submissionRepository, resultService, authCheckService, userRepository, exerciseRepository, textSubmissionService, studentParticipationRepository);
        this.textSubmissionRepository = textSubmissionRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'atheneScheduleService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
    private final GradingCriterionRepository gradingCriterionRepository;

    private final Optional<AtheneScheduleService> atheneScheduleService;

    private final ExamSubmissionService examSubmissionService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'zipFile'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
    }

    private ResponseEntity<Resource> returnZipFileForRepositoryExport(Optional<File> zipFile, String repositoryName, ProgrammingExercise exercise, long startTime)
            throws IOException {
        if (zipFile.isEmpty()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
    public ProgrammingExerciseExportImportResource(ProgrammingExerciseRepository programmingExerciseRepository, UserRepository userRepository,
            AuthorizationCheckService authCheckService, CourseService courseService, ProgrammingExerciseImportService programmingExerciseImportService,
            ProgrammingExerciseExportService programmingExerciseExportService, Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, SubmissionPolicyService submissionPolicyService,
            ProgrammingExerciseTaskRepository programmingExerciseTaskRepository) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
    private final ProgrammingExerciseExportService programmingExerciseExportService;

    private final Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService;

    private final AuxiliaryRepositoryRepository auxiliaryRepositoryRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'registrationEnabled'
in `src/main/java/de/tum/in/www1/artemis/web/rest/AccountResource.java`
#### Snippet
```java

    @Value("${artemis.user-management.registration.enabled:#{null}}")
    private Optional<Boolean> registrationEnabled;

    @Value("${artemis.user-management.registration.allowed-email-pattern:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedEmailPattern'
in `src/main/java/de/tum/in/www1/artemis/web/rest/AccountResource.java`
#### Snippet
```java

    @Value("${artemis.user-management.registration.allowed-email-pattern:#{null}}")
    private Optional<Pattern> allowedEmailPattern;

    private final Logger log = LoggerFactory.getLogger(AccountResource.class);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'existingGradingScale'
in `src/main/java/de/tum/in/www1/artemis/web/rest/GradingScaleResource.java`
#### Snippet
```java
    }

    private void validateGradingScale(Optional<GradingScale> existingGradingScale, GradingScale gradingScale) {
        if (existingGradingScale.isPresent()) {
            throw new BadRequestAlertException("A grading scale already exists", ENTITY_NAME, "gradingScaleAlreadyExists");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
    public ResultResource(ProgrammingExerciseParticipationService programmingExerciseParticipationService, ParticipationService participationService,
            ExampleSubmissionRepository exampleSubmissionRepository, ResultService resultService, ExerciseRepository exerciseRepository, AuthorizationCheckService authCheckService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, LtiNewResultService ltiNewResultService, ResultRepository resultRepository,
            WebsocketMessagingService messagingService, UserRepository userRepository, ExamDateService examDateService,
            ProgrammingExerciseGradingService programmingExerciseGradingService, ParticipationRepository participationRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ResultResource.java`
#### Snippet
```java
    private final UserRepository userRepository;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final ProgrammingExerciseParticipationService programmingExerciseParticipationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java

    public ProgrammingExercisePlagiarismResource(ProgrammingExerciseRepository programmingExerciseRepository, AuthorizationCheckService authCheckService,
            PlagiarismResultRepository plagiarismResultRepository, Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService,
            ProgrammingPlagiarismDetectionService programmingPlagiarismDetectionService) {
        this.programmingExerciseRepository = programmingExerciseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExercisePlagiarismResource.java`
#### Snippet
```java
    private final PlagiarismResultRepository plagiarismResultRepository;

    private final Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService;

    private final ProgrammingPlagiarismDetectionService programmingPlagiarismDetectionService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalComplaintResponse'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ComplaintResponseResource.java`
#### Snippet
```java
    }

    private ResponseEntity<ComplaintResponse> handleComplaintResponse(long complaintId, Principal principal, Optional<ComplaintResponse> optionalComplaintResponse) {
        if (optionalComplaintResponse.isEmpty()) {
            throw new EntityNotFoundException("ComplaintResponse with " + complaintId + " was not found!");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'automaticTextAssessmentConflictService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
    private final Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider;

    private final Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService;

    private final GradingCriterionRepository gradingCriterionRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'atheneTrackingTokenProvider'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
    private final ExampleSubmissionRepository exampleSubmissionRepository;

    private final Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider;

    private final Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'atheneTrackingTokenProvider'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            TextExerciseRepository textExerciseRepository, TextSubmissionRepository textSubmissionRepository, UserRepository userRepository,
            TextSubmissionService textSubmissionService, WebsocketMessagingService messagingService, ExerciseRepository exerciseRepository, ResultRepository resultRepository,
            GradingCriterionRepository gradingCriterionRepository, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider, ExamService examService,
            Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService, FeedbackConflictRepository feedbackConflictRepository,
            ExampleSubmissionRepository exampleSubmissionRepository, SubmissionRepository submissionRepository, FeedbackRepository feedbackRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'automaticTextAssessmentConflictService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentResource.java`
#### Snippet
```java
            TextSubmissionService textSubmissionService, WebsocketMessagingService messagingService, ExerciseRepository exerciseRepository, ResultRepository resultRepository,
            GradingCriterionRepository gradingCriterionRepository, Optional<AtheneTrackingTokenProvider> atheneTrackingTokenProvider, ExamService examService,
            Optional<AutomaticTextAssessmentConflictService> automaticTextAssessmentConflictService, FeedbackConflictRepository feedbackConflictRepository,
            ExampleSubmissionRepository exampleSubmissionRepository, SubmissionRepository submissionRepository, FeedbackRepository feedbackRepository,
            SingleUserNotificationService singleUserNotificationService, ResultService resultService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'textAssessmentAnalyticsEnabled'
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextAssessmentEventResource.java`
#### Snippet
```java

    @Value("${info.text-assessment-analytics-enabled}")
    private Optional<Boolean> textAssessmentAnalyticsEnabled;

    public TextAssessmentEventResource(TextAssessmentEventRepository textAssessmentEventRepository, AuthorizationCheckService authCheckService, UserRepository userRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'language'
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java
    @GetMapping({ "files/templates/{language}/{projectType}/{filename}", "files/templates/{language}/{filename}", "/files/templates/{filename:.+}" })
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity<byte[]> getTemplateFile(@PathVariable Optional<ProgrammingLanguage> language, @PathVariable Optional<ProjectType> projectType,
            @PathVariable String filename) {
        log.debug("REST request to get file '{}' for programming language {} and project type {}", filename, language, projectType);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java
    @GetMapping({ "files/templates/{language}/{projectType}/{filename}", "files/templates/{language}/{filename}", "/files/templates/{filename:.+}" })
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity<byte[]> getTemplateFile(@PathVariable Optional<ProgrammingLanguage> language, @PathVariable Optional<ProjectType> projectType,
            @PathVariable String filename) {
        log.debug("REST request to get file '{}' for programming language {} and project type {}", filename, language, projectType);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalCiUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCiUserManagementService;

    private final ExerciseRepository exerciseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedCourseRegistrationUsernamePattern'
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java

    @Value("${artemis.user-management.course-registration.allowed-username-pattern:#{null}}")
    private Optional<Pattern> allowedCourseRegistrationUsernamePattern;

    @Value("${artemis.course-archives-path}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
    public CourseResource(UserRepository userRepository, CourseService courseService, CourseRepository courseRepository, ExerciseService exerciseService,
            OAuth2JWKSService oAuth2JWKSService, AuthorizationCheckService authCheckService, TutorParticipationRepository tutorParticipationRepository,
            SubmissionService submissionService, Optional<VcsUserManagementService> optionalVcsUserManagementService, AssessmentDashboardService assessmentDashboardService,
            ExerciseRepository exerciseRepository, Optional<CIUserManagementService> optionalCiUserManagementService, FileService fileService,
            TutorialGroupsConfigurationService tutorialGroupsConfigurationService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalCiUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
            OAuth2JWKSService oAuth2JWKSService, AuthorizationCheckService authCheckService, TutorParticipationRepository tutorParticipationRepository,
            SubmissionService submissionService, Optional<VcsUserManagementService> optionalVcsUserManagementService, AssessmentDashboardService assessmentDashboardService,
            ExerciseRepository exerciseRepository, Optional<CIUserManagementService> optionalCiUserManagementService, FileService fileService,
            TutorialGroupsConfigurationService tutorialGroupsConfigurationService) {
        this.courseService = courseService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/CourseResource.java`
#### Snippet
```java
    private final AssessmentDashboardService assessmentDashboardService;

    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCiUserManagementService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ProgrammingExerciseResource(ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository,
            UserRepository userRepository, AuthorizationCheckService authCheckService, CourseService courseService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, ExerciseService exerciseService,
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    public ProgrammingExerciseResource(ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository,
            UserRepository userRepository, AuthorizationCheckService authCheckService, CourseService courseService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, ExerciseService exerciseService,
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
            ExerciseDeletionService exerciseDeletionService, ProgrammingExerciseService programmingExerciseService, StudentParticipationRepository studentParticipationRepository,
            StaticCodeAnalysisService staticCodeAnalysisService, GradingCriterionRepository gradingCriterionRepository,
            Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService, CourseRepository courseRepository, GitService gitService,
            AuxiliaryRepositoryService auxiliaryRepositoryService, SubmissionPolicyService submissionPolicyService,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'programmingLanguageFeatureService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    private final GradingCriterionRepository gradingCriterionRepository;

    private final Optional<ProgrammingLanguageFeatureService> programmingLanguageFeatureService;

    private final CourseRepository courseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    private final AuthorizationCheckService authCheckService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;

    private final ExerciseService exerciseService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/admin/AdminUserResource.java`
#### Snippet
```java

    public AdminUserResource(UserRepository userRepository, UserService userService, UserCreationService userCreationService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, AuthorityRepository authorityRepository, Optional<LdapUserService> ldapUserService) {
        this.userRepository = userRepository;
        this.userService = userService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/admin/AdminUserResource.java`
#### Snippet
```java
    private final AuthorityRepository authorityRepository;

    private final Optional<LdapUserService> ldapUserService;

    public AdminUserResource(UserRepository userRepository, UserService userService, UserCreationService userCreationService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
    private final AuthorizationCheckService authCheckService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final UserRepository userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
            CourseRepository courseRepository, QuizExerciseRepository quizExerciseRepository, ExerciseRepository exerciseRepository,
            ProgrammingExerciseRepository programmingExerciseRepository, AuthorizationCheckService authCheckService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, UserRepository userRepository, StudentParticipationRepository studentParticipationRepository,
            AuditEventRepository auditEventRepository, GuidedTourConfiguration guidedTourConfiguration, TeamRepository teamRepository, FeatureToggleService featureToggleService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, SubmissionRepository submissionRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'courseId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupsConfigurationResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupsConfiguration tutorialGroupsConfiguration, Optional<Long> courseId, Optional<Long> tutorialGroupConfigurationId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroupsConfiguration.getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tutorialGroupConfigurationId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupsConfigurationResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupsConfiguration tutorialGroupsConfiguration, Optional<Long> courseId, Optional<Long> tutorialGroupConfigurationId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroupsConfiguration.getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
    protected final AuthorizationCheckService authCheckService;

    protected final Optional<ContinuousIntegrationService> continuousIntegrationService;

    protected final GitService gitService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
    protected final ProgrammingExerciseRepository programmingExerciseRepository;

    protected final Optional<VersionControlService> versionControlService;

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'courseId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupFreePeriodResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupFreePeriod tutorialGroupFreePeriod, Optional<Long> courseId, Optional<Long> tutorialGroupsConfigurationId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroupFreePeriod.getTutorialGroupsConfiguration().getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tutorialGroupsConfigurationId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupFreePeriodResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupFreePeriod tutorialGroupFreePeriod, Optional<Long> courseId, Optional<Long> tutorialGroupsConfigurationId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroupFreePeriod.getTutorialGroupsConfiguration().getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/TestRepositoryResource.java`
#### Snippet
```java

    public TestRepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        super(userRepository, authCheckService, gitService, continuousIntegrationService, repositoryService, versionControlService, programmingExerciseRepository);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/TestRepositoryResource.java`
#### Snippet
```java

    public TestRepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        super(userRepository, authCheckService, gitService, continuousIntegrationService, repositoryService, versionControlService, programmingExerciseRepository);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'courseId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupSession tutorialGroupSession, Optional<Long> courseId, Optional<Long> tutorialGroupId, Optional<Long> sessionId) {
        sessionId.ifPresent(sessionIdValue -> {
            if (!tutorialGroupSession.getId().equals(sessionIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tutorialGroupId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupSession tutorialGroupSession, Optional<Long> courseId, Optional<Long> tutorialGroupId, Optional<Long> sessionId) {
        sessionId.ifPresent(sessionIdValue -> {
            if (!tutorialGroupSession.getId().equals(sessionIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'sessionId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupSessionResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroupSession tutorialGroupSession, Optional<Long> courseId, Optional<Long> tutorialGroupId, Optional<Long> sessionId) {
        sessionId.ifPresent(sessionIdValue -> {
            if (!tutorialGroupSession.getId().equals(sessionIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'resultId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java
     */
    @GetMapping(value = "/repository/{participationId}/buildlogs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BuildLogEntry>> getBuildLogs(@PathVariable Long participationId, @RequestParam(name = "resultId") Optional<Long> resultId) {
        log.debug("REST request to get build log : {}", participationId);

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java

    public RepositoryProgrammingExerciseParticipationResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, RepositoryService repositoryService,
            ProgrammingExerciseParticipationService participationService, ProgrammingExerciseRepository programmingExerciseRepository,
            ParticipationRepository participationRepository, ExamSubmissionService examSubmissionService, BuildLogEntryService buildLogService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryProgrammingExerciseParticipationResource.java`
#### Snippet
```java

    public RepositoryProgrammingExerciseParticipationResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService, RepositoryService repositoryService,
            ProgrammingExerciseParticipationService participationService, ProgrammingExerciseRepository programmingExerciseRepository,
            ParticipationRepository participationRepository, ExamSubmissionService examSubmissionService, BuildLogEntryService buildLogService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'hikariDataSource'
in `src/main/java/de/tum/in/www1/artemis/config/MetricsBean.java`
#### Snippet
```java

    public MetricsBean(MeterRegistry meterRegistry, Environment env, TaskScheduler taskScheduler, WebSocketMessageBrokerStats webSocketStats, SimpUserRegistry userRegistry,
            WebSocketHandler websocketHandler, List<HealthContributor> healthContributors, Optional<HikariDataSource> hikariDataSource) {
        this.meterRegistry = meterRegistry;
        this.env = env;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'courseId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroup tutorialGroup, Optional<Long> courseId, Optional<Long> tutorialGroupId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroup.getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tutorialGroupId'
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
    }

    private void checkEntityIdMatchesPathIds(TutorialGroup tutorialGroup, Optional<Long> courseId, Optional<Long> tutorialGroupId) {
        courseId.ifPresent(courseIdValue -> {
            if (!tutorialGroup.getCourse().getId().equals(courseIdValue)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'remoteUserAuthenticationProvider'
in `src/main/java/de/tum/in/www1/artemis/config/SecurityConfiguration.java`
#### Snippet
```java
    private final PasswordService passwordService;

    private final Optional<AuthenticationProvider> remoteUserAuthenticationProvider;

    @Value("${spring.prometheus.monitoringIp:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'monitoringIpAddress'
in `src/main/java/de/tum/in/www1/artemis/config/SecurityConfiguration.java`
#### Snippet
```java

    @Value("${spring.prometheus.monitoringIp:#{null}}")
    private Optional<String> monitoringIpAddress;

    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder, UserDetailsService userDetailsService, TokenProvider tokenProvider,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'remoteUserAuthenticationProvider'
in `src/main/java/de/tum/in/www1/artemis/config/SecurityConfiguration.java`
#### Snippet
```java

    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder, UserDetailsService userDetailsService, TokenProvider tokenProvider,
            CorsFilter corsFilter, SecurityProblemSupport problemSupport, PasswordService passwordService, Optional<AuthenticationProvider> remoteUserAuthenticationProvider) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.userDetailsService = userDetailsService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'sentryDsn'
in `src/main/java/de/tum/in/www1/artemis/config/SentryConfiguration.java`
#### Snippet
```java

    @Value("${info.sentry.dsn}")
    private Optional<String> sentryDsn;

    @Value("${info.test-server}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'isTestServer'
in `src/main/java/de/tum/in/www1/artemis/config/SentryConfiguration.java`
#### Snippet
```java

    @Value("${info.test-server}")
    private Optional<Boolean> isTestServer;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/config/ProgrammingLanguageConfiguration.java`
#### Snippet
```java
     * @return the docker image name
     */
    public String getImage(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType) {
        final Map<ProjectType, String> languageImages = images.get(programmingLanguage);
        final ProjectType configuredProjectType = projectType.map(this::getConfiguredProjectType).orElse(DEFAULT_PROJECT_TYPE);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'templateFileSystemPath'
in `src/main/java/de/tum/in/www1/artemis/service/ResourceLoaderService.java`
#### Snippet
```java

    @Value("${artemis.template-path:#{null}}")
    private Optional<String> templateFileSystemPath;

    // Files that start with a prefix that is included in this list can be overwritten from the file system
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final ProgrammingExerciseRepository programmingExerciseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
    private final ProgrammingExerciseRepository programmingExerciseRepository;

    public ConsistencyCheckService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.versionControlService = versionControlService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
    private final ProgrammingExerciseRepository programmingExerciseRepository;

    public ConsistencyCheckService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
        this.versionControlService = versionControlService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/ConsistencyCheckService.java`
#### Snippet
```java
public class ConsistencyCheckService {

    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
    private final UserRepository userRepository;

    private final Optional<VersionControlService> versionControlService;

    private final ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/TeamService.java`
#### Snippet
```java
    private final ParticipationService participationService;

    public TeamService(TeamRepository teamRepository, UserRepository userRepository, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ParticipationService participationService) {
        this.teamRepository = teamRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for parameter 'examId'
in `src/main/java/de/tum/in/www1/artemis/service/ComplaintService.java`
#### Snippet
```java
     * @return the saved complaint
     */
    public Complaint createComplaint(Complaint complaint, OptionalLong examId, Principal principal) {
        Result originalResult = resultRepository.findByIdWithEagerFeedbacksAndAssessor(complaint.getResult().getId())
                .orElseThrow(() -> new BadRequestAlertException("The result you are referring to does not exist", ENTITY_NAME, "resultnotfound"));
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'automaticTextFeedbackService'
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentService.java`
#### Snippet
```java
    private final TextBlockService textBlockService;

    private final Optional<AutomaticTextFeedbackService> automaticTextFeedbackService;

    private final FeedbackConflictRepository feedbackConflictRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'automaticTextFeedbackService'
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentService.java`
#### Snippet
```java
    public TextAssessmentService(UserRepository userRepository, ComplaintResponseService complaintResponseService, ComplaintRepository complaintRepository,
            FeedbackRepository feedbackRepository, ResultRepository resultRepository, StudentParticipationRepository studentParticipationRepository, ResultService resultService,
            SubmissionRepository submissionRepository, TextBlockService textBlockService, Optional<AutomaticTextFeedbackService> automaticTextFeedbackService,
            ExamDateService examDateService, FeedbackConflictRepository feedbackConflictRepository, GradingCriterionRepository gradingCriterionRepository,
            SubmissionService submissionService, LtiNewResultService ltiNewResultService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exercise'
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     * @return true if the user is at least a teaching assistant (also if the user is instructor or admin) in the course of the given exercise
     */
    public <T extends Exercise> boolean isAtLeastTeachingAssistantForExercise(Optional<T> exercise) {
        return exercise.filter(this::isAtLeastTeachingAssistantForExercise).isPresent();
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'textAssessmentQueueService'
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
    public TextSubmissionService(TextSubmissionRepository textSubmissionRepository, SubmissionRepository submissionRepository,
            StudentParticipationRepository studentParticipationRepository, ParticipationService participationService, ResultRepository resultRepository,
            UserRepository userRepository, Optional<TextAssessmentQueueService> textAssessmentQueueService, AuthorizationCheckService authCheckService,
            SubmissionVersionService submissionVersionService, FeedbackRepository feedbackRepository, ExamDateService examDateService, ExerciseDateService exerciseDateService,
            CourseRepository courseRepository, ParticipationRepository participationRepository, ComplaintRepository complaintRepository) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'textAssessmentQueueService'
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
    private final TextSubmissionRepository textSubmissionRepository;

    private final Optional<TextAssessmentQueueService> textAssessmentQueueService;

    private final SubmissionVersionService submissionVersionService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalGradedStudentParticipation'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
     */
    private StudentParticipation startPracticeMode(ProgrammingExercise exercise, ProgrammingExerciseStudentParticipation participation, boolean setInitializationDate,
            Optional<StudentParticipation> optionalGradedStudentParticipation, boolean useGradedParticipation) {
        // Step 1a) create the student repository (based on the template repository or graded participation)
        if (useGradedParticipation && optionalGradedStudentParticipation.isPresent()
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;

    private final ParticipationRepository participationRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final GitService gitService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalGradedStudentParticipation'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
     * @return the participation connecting the given exercise and user
     */
    public StudentParticipation startPracticeMode(Exercise exercise, Participant participant, Optional<StudentParticipation> optionalGradedStudentParticipation,
            boolean useGradedParticipation) {
        if (!(exercise instanceof ProgrammingExercise programmingExercise)) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final TeamScoreRepository teamScoreRepository;

    public ParticipationService(GitService gitService, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ParticipationRepository participationRepository, StudentParticipationRepository studentParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingExerciseRepository programmingExerciseRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private final TeamScoreRepository teamScoreRepository;

    public ParticipationService(GitService gitService, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ParticipationRepository participationRepository, StudentParticipationRepository studentParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingExerciseRepository programmingExerciseRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedLdapUsernamePattern'
in `src/main/java/de/tum/in/www1/artemis/service/ldap/LdapUserService.java`
#### Snippet
```java

    @Value("${artemis.user-management.ldap.allowed-username-pattern:#{null}}")
    private Optional<Pattern> allowedLdapUsernamePattern;

    private final LdapUserRepository ldapUserRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'adminGroupName'
in `src/main/java/de/tum/in/www1/artemis/service/user/AuthorityService.java`
#### Snippet
```java

    @Value("${artemis.user-management.external.admin-group-name:#{null}}")
    private Optional<String> adminGroupName;

    private final CourseRepository courseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedEmailPatternReadable'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.registration.allowed-email-pattern-readable:#{null}}")
    private Optional<String> allowedEmailPatternReadable;

    @Value("${artemis.user-management.ldap.allowed-username-pattern:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'registrationEnabled'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.registration.enabled:#{null}}")
    private Optional<Boolean> registrationEnabled;

    @Value("${artemis.user-management.registration.allowed-email-pattern:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'accountName'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.login.account-name:#{null}}")
    private Optional<String> accountName;

    @Override
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedEmailPattern'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.registration.allowed-email-pattern:#{null}}")
    private Optional<Pattern> allowedEmailPattern;

    @Value("${artemis.user-management.registration.allowed-email-pattern-readable:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'needsToAcceptTerms'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.accept-terms:#{null}}")
    private Optional<Boolean> needsToAcceptTerms;

    @Value("${artemis.user-management.registration.enabled:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedLdapUsernamePattern'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.ldap.allowed-username-pattern:#{null}}")
    private Optional<Pattern> allowedLdapUsernamePattern;

    @Value("${artemis.user-management.course-registration.allowed-username-pattern:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'allowedCourseRegistrationUsernamePattern'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserManagementInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.user-management.course-registration.allowed-username-pattern:#{null}}")
    private Optional<Pattern> allowedCourseRegistrationUsernamePattern;

    @Value("${artemis.user-management.login.account-name:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'tutorialGroupEditors'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    @Value("${info.guided-tour.course-group-editors:#{null}}")
    private Optional<String> tutorialGroupEditors;

    @Value("${info.guided-tour.course-group-instructors:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
    private final OrganizationRepository organizationRepository;

    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCIUserManagementService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'tutorialGroupTutors'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    @Value("${info.guided-tour.course-group-tutors:#{null}}")
    private Optional<String> tutorialGroupTutors;

    @Value("${info.guided-tour.course-group-editors:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    public UserCreationService(UserRepository userRepository, PasswordService passwordService, AuthorityRepository authorityRepository, CourseRepository courseRepository,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService, CacheManager cacheManager,
            OrganizationRepository organizationRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalCIUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    public UserCreationService(UserRepository userRepository, PasswordService passwordService, AuthorityRepository authorityRepository, CourseRepository courseRepository,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService, CacheManager cacheManager,
            OrganizationRepository organizationRepository) {
        this.userRepository = userRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'tutorialGroupStudents'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    @Value("${info.guided-tour.course-group-students:#{null}}")
    private Optional<String> tutorialGroupStudents;

    @Value("${info.guided-tour.course-group-tutors:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'tutorialGroupInstructors'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java

    @Value("${info.guided-tour.course-group-instructors:#{null}}")
    private Optional<String> tutorialGroupInstructors;

    private final Logger log = LoggerFactory.getLogger(UserCreationService.class);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalCIUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCIUserManagementService;

    private final CacheManager cacheManager;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'artemisInternalAdminUsername'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java

    @Value("${artemis.user-management.internal-admin.username:#{null}}")
    private Optional<String> artemisInternalAdminUsername;

    @Value("${artemis.user-management.internal-admin.password:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    private final Optional<LdapUserService> ldapUserService;

    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCIUserManagementService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'artemisInternalAdminPassword'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java

    @Value("${artemis.user-management.internal-admin.password:#{null}}")
    private Optional<String> artemisInternalAdminPassword;

    private final UserCreationService userCreationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalCIUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final Optional<CIUserManagementService> optionalCIUserManagementService;

    private final ArtemisAuthenticationProvider artemisAuthenticationProvider;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    private final AuthorityService authorityService;

    private final Optional<LdapUserService> ldapUserService;

    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java

    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
            ExerciseHintActivationRepository exerciseHintActivationRepository, TutorialGroupRegistrationRepository tutorialGroupRegistrationRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalCIUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/user/UserService.java`
#### Snippet
```java
    public UserService(UserCreationService userCreationService, UserRepository userRepository, AuthorityService authorityService, AuthorityRepository authorityRepository,
            CacheManager cacheManager, Optional<LdapUserService> ldapUserService, GuidedTourSettingsRepository guidedTourSettingsRepository, PasswordService passwordService,
            Optional<VcsUserManagementService> optionalVcsUserManagementService, Optional<CIUserManagementService> optionalCIUserManagementService,
            ArtemisAuthenticationProvider artemisAuthenticationProvider, StudentScoreRepository studentScoreRepository, InstanceMessageSendService instanceMessageSendService,
            ExerciseHintActivationRepository exerciseHintActivationRepository, TutorialGroupRegistrationRepository tutorialGroupRegistrationRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'latestSubmission'
in `src/main/java/de/tum/in/www1/artemis/service/exam/StudentExamService.java`
#### Snippet
```java
     * @return the latestSubmission
     */
    public Optional<Submission> prepareProgrammingSubmission(Optional<Submission> latestSubmission, StudentParticipation studentParticipation) {
        if (latestSubmission.isEmpty() && studentParticipation.getExercise() instanceof ProgrammingExercise
                && ((ProgrammingExercise) studentParticipation.getExercise()).areManualResultsAllowed()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'subsequentNumberSuccessfulSubmissionsForPreviousTask'
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ExerciseHintService.java`
#### Snippet
```java
     * @return the available exercise hints
     */
    private Set<ExerciseHint> getAvailableExerciseHintsForTask(Optional<Integer> subsequentNumberSuccessfulSubmissionsForPreviousTask,
            int subsequentNumberOfUnsuccessfulSubmissionsForCurrentTask, Set<ExerciseHint> taskHints) {
        Set<ExerciseHint> availableHintsForTask = new HashSet<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'gradingScale'
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
     */
    private ExamScoresDTO.StudentResult calculateStudentResultWithGrade(StudentExam studentExam, List<StudentParticipation> participationsOfStudent, Exam exam,
            Optional<GradingScale> gradingScale, boolean calculateFirstCorrectionPoints, List<QuizSubmittedAnswerCount> quizSubmittedAnswerCounts,
            PlagiarismMapping plagiarismMapping, ExamBonusCalculator examBonusCalculator) {
        User user = studentExam.getUser();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'gradingScale'
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java

    @Nullable
    private ExamBonusCalculator createExamBonusCalculator(Optional<GradingScale> gradingScale, Collection<Long> studentIds) {
        if (gradingScale.isEmpty() || gradingScale.get().getBonusFrom().isEmpty()) {
            return null;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'testCase'
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralTestCaseService.java`
#### Snippet
```java
     * @return A SolutionEntry if testCase is present otherwise null
     */
    private ProgrammingExerciseSolutionEntry createSolutionEntry(String filePath, String code, Optional<ProgrammingExerciseTestCase> testCase) {
        return testCase.map(actualTestCase -> {
            var solutionEntry = new ProgrammingExerciseSolutionEntry();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/UserScheduleService.java`
#### Snippet
```java
    private final Map<Long, ScheduledFuture<?>> nonActivatedAccountsFutures = new ConcurrentHashMap<>();

    public UserScheduleService(UserRepository userRepository, Optional<VcsUserManagementService> optionalVcsUserManagementService, CacheManager cacheManager) {
        this.userRepository = userRepository;
        this.optionalVcsUserManagementService = optionalVcsUserManagementService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'optionalVcsUserManagementService'
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/UserScheduleService.java`
#### Snippet
```java
    private final UserRepository userRepository;

    private final Optional<VcsUserManagementService> optionalVcsUserManagementService;

    private final CacheManager cacheManager;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'atheneScheduleService'
in `src/main/java/de/tum/in/www1/artemis/service/messaging/InstanceMessageReceiveService.java`
#### Snippet
```java
            ModelingExerciseRepository modelingExerciseRepository, ModelingExerciseScheduleService modelingExerciseScheduleService,
            ExamMonitoringScheduleService examMonitoringScheduleService, TextExerciseRepository textExerciseRepository, ExerciseRepository exerciseRepository,
            Optional<AtheneScheduleService> atheneScheduleService, HazelcastInstance hazelcastInstance, UserRepository userRepository, UserScheduleService userScheduleService,
            NotificationScheduleService notificationScheduleService, ParticipantScoreSchedulerService participantScoreSchedulerService) {
        this.programmingExerciseRepository = programmingExerciseRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'atheneScheduleService'
in `src/main/java/de/tum/in/www1/artemis/service/messaging/InstanceMessageReceiveService.java`
#### Snippet
```java
    private final ParticipantScoreSchedulerService participantScoreSchedulerService;

    private final Optional<AtheneScheduleService> atheneScheduleService;

    private final UserScheduleService userScheduleService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'triggeredBy'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationUpdateService.java`
#### Snippet
```java
     */
    void updatePlanRepository(String projectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String vcsRepoName, String branchName,
            Optional<List<String>> triggeredBy);
}

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'optionalTriggeredByRepositories'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationService.java`
#### Snippet
```java
     */
    void updatePlanRepository(String buildProjectKey, String buildPlanKey, String ciRepoName, String repoProjectKey, String newRepoUrl, String existingRepoUrl, String newBranch,
            Optional<List<String>> optionalTriggeredByRepositories);

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'lastScheduledRun'
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ParticipantScoreSchedulerService.java`
#### Snippet
```java
    private final Map<Integer, ScheduledFuture<?>> scheduledTasks = new ConcurrentHashMap<>();

    private Optional<Instant> lastScheduledRun = Optional.empty();

    private final ParticipantScoreRepository participantScoreRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationServerHealthIndicator.java`
#### Snippet
```java
public class ContinuousIntegrationServerHealthIndicator implements HealthIndicator {

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    public ContinuousIntegrationServerHealthIndicator(Optional<ContinuousIntegrationService> continuousIntegrationService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/ContinuousIntegrationServerHealthIndicator.java`
#### Snippet
```java
    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    public ContinuousIntegrationServerHealthIndicator(Optional<ContinuousIntegrationService> continuousIntegrationService) {
        this.continuousIntegrationService = continuousIntegrationService;
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'saml2EnablePassword'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java

    @Value("${info.saml2.enable-password:#{null}}")
    private Optional<Boolean> saml2EnablePassword;

    private final Logger log = LoggerFactory.getLogger(SAML2Service.class);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/VersionControlServerHealthIndicator.java`
#### Snippet
```java
public class VersionControlServerHealthIndicator implements HealthIndicator {

    private final Optional<VersionControlService> versionControlService;

    public VersionControlServerHealthIndicator(Optional<VersionControlService> versionControlService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/VersionControlServerHealthIndicator.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    public VersionControlServerHealthIndicator(Optional<VersionControlService> versionControlService) {
        this.versionControlService = versionControlService;
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
    private final RestTemplate shortTimeoutRestTemplate;

    private final Optional<LdapUserService> ldapUserService;

    private final AuthorityService authorityService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'ldapUserService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java

    public JiraAuthenticationProvider(UserRepository userRepository, @Qualifier("jiraRestTemplate") RestTemplate restTemplate,
            @Qualifier("shortTimeoutJiraRestTemplate") RestTemplate shortTimeoutRestTemplate, Optional<LdapUserService> ldapUserService, PasswordService passwordService,
            AuthorityService authorityService, UserCreationService userCreationService) {
        super(userRepository, passwordService, userCreationService);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'gitlabSshKeysUrlPath'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitlabInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-keys-url-path:#{null}}")
    private Optional<String> gitlabSshKeysUrlPath;

    @Value("${artemis.version-control.version-control-access-token:#{false}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'gitlabSshUrlTemplate'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitlabInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-template-clone-url:#{null}}")
    private Optional<String> gitlabSshUrlTemplate;

    @Value("${artemis.version-control.ssh-keys-url-path:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsXmlConfigBuilder.java`
#### Snippet
```java
     * @return The parsed XML document containing the Jenkins build config
     */
    Document buildBasicConfig(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType, InternalVcsRepositoryURLs internalVcsRepositoryURLs,
            boolean isStaticCodeAnalysisEnabled, boolean isSequentialRuns, boolean isTestwiseCoverageEnabled);
}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'sshUrlTemplate'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-template-clone-url:#{null}}")
    private Optional<String> sshUrlTemplate;

    @Value("${artemis.version-control.default-branch:main}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'gitToken'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Value("${artemis.version-control.token:#{null}}")
    private Optional<String> gitToken;

    @Value("${artemis.version-control.ssh-private-key-folder-path:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'lastValidSubmission'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Transactional(readOnly = true) // TODO: remove transactional
    public void filterLateSubmissions(Repository repository, Optional<Submission> lastValidSubmission, ZonedDateTime filterLateSubmissionsDate) {
        if (filterLateSubmissionsDate == null) {
            // No date set in client and exercise has no due date
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'gitSshPrivateKeyPassphrase'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-private-key-password:#{null}}")
    private Optional<String> gitSshPrivateKeyPassphrase;

    @Value("${artemis.version-control.ssh-template-clone-url:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'gitSshPrivateKeyPath'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-private-key-folder-path:#{null}}")
    private Optional<String> gitSshPrivateKeyPath;

    @Value("${artemis.version-control.ssh-private-key-password:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'internalCiUrl'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsInternalUrlService.java`
#### Snippet
```java

    @Value("${jenkins.internal-urls.ci-url:#{null}}")
    private Optional<URL> internalCiUrl;

    @Value("${jenkins.internal-urls.vcs-url:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'internalVcsUrl'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsInternalUrlService.java`
#### Snippet
```java

    @Value("${jenkins.internal-urls.vcs-url:#{null}}")
    private Optional<URL> internalVcsUrl;

    private static final Logger log = LoggerFactory.getLogger(JenkinsInternalUrlService.class);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationUpdateService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java

    public BambooService(GitService gitService, ProgrammingSubmissionRepository programmingSubmissionRepository,
            Optional<ContinuousIntegrationUpdateService> continuousIntegrationUpdateService, BambooBuildPlanService bambooBuildPlanService, FeedbackRepository feedbackRepository,
            @Qualifier("bambooRestTemplate") RestTemplate restTemplate, @Qualifier("shortTimeoutBambooRestTemplate") RestTemplate shortTimeoutRestTemplate, ObjectMapper mapper,
            UrlService urlService, BuildLogEntryService buildLogService, TestwiseCoverageService testwiseCoverageService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationUpdateService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
    private final GitService gitService;

    private final Optional<ContinuousIntegrationUpdateService> continuousIntegrationUpdateService;

    private final BambooBuildPlanService bambooBuildPlanService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalProjectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanCreator.java`
#### Snippet
```java

    // at the moment, only Java and Swift are supported
    private String createStaticCodeAnalysisScript(ProgrammingLanguage programmingLanguage, Optional<ProjectType> optionalProjectType) {
        StringBuilder script = new StringBuilder();
        String lineEnding = "&#xd;";
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanCreator.java`
#### Snippet
```java
    }

    public String getPipelineScript(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType, InternalVcsRepositoryURLs internalVcsRepositoryURLs,
            boolean isStaticCodeAnalysisEnabled, boolean isSequentialRuns, boolean isTestwiseCoverageEnabled) {
        var pipelinePath = getResourcePath(programmingLanguage, projectType, isStaticCodeAnalysisEnabled, isSequentialRuns);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanCreator.java`
#### Snippet
```java
    }

    private String[] getResourcePath(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType, boolean isStaticCodeAnalysisEnabled, boolean isSequentialRuns) {
        if (programmingLanguage == null) {
            throw new IllegalArgumentException("ProgrammingLanguage should not be null");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanCreator.java`
#### Snippet
```java
    }

    private String createTestwiseCoverageAnalysisScript(Optional<ProjectType> projectType) {
        StringBuilder script = new StringBuilder();
        String lineEnding = "&#xd;";
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanCreator.java`
#### Snippet
```java
    }

    private Map<String, String> getReplacements(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType, InternalVcsRepositoryURLs internalVcsRepositoryURLs,
            boolean isStaticCodeAnalysisEnabled, boolean isTestwiseCoverageAnalysisEnabled) {
        Map<String, String> replacements = new HashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'bitbucketSshUrlTemplate'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-template-clone-url:#{null}}")
    private Optional<String> bitbucketSshUrlTemplate;

    @Value("${artemis.version-control.ssh-keys-url-path:#{null}}")
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'bitbucketSshKeysUrlPath'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketInfoContributor.java`
#### Snippet
```java

    @Value("${artemis.version-control.ssh-keys-url-path:#{null}}")
    private Optional<String> bitbucketSshKeysUrlPath;

    @Override
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'bitbucketToken'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketAuthorizationInterceptor.java`
#### Snippet
```java

    @Value("${artemis.version-control.token:#{null}}")
    private Optional<String> bitbucketToken;

    @NotNull
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    public BambooBuildPlanService(ResourceLoaderService resourceLoaderService, BambooServer bambooServer, Environment env, Optional<VersionControlService> versionControlService,
            ProgrammingLanguageConfiguration programmingLanguageConfiguration) {
        this.resourceLoaderService = resourceLoaderService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    private final Environment env;

    private final Optional<VersionControlService> versionControlService;

    public BambooBuildPlanService(ResourceLoaderService resourceLoaderService, BambooServer bambooServer, Environment env, Optional<VersionControlService> versionControlService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'projectType'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    }

    private DockerConfiguration dockerConfigurationImageNameFor(ProgrammingLanguage programmingLanguage, Optional<ProjectType> projectType) {
        var dockerImage = programmingLanguageConfiguration.getImage(programmingLanguage, projectType);
        return new DockerConfiguration().image(dockerImage);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'solutionPath'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooBuildPlanService.java`
#### Snippet
```java
    }

    private VcsCheckoutTask createCheckoutTask(String assignmentPath, String testPath, Optional<String> solutionPath, List<AuxiliaryRepository> auxiliaryRepositories) {
        List<CheckoutItem> checkoutItems = new ArrayList<>();
        checkoutItems.add(new CheckoutItem().repository(new VcsRepositoryIdentifier().name(TEST_REPO_NAME)).path(testPath));
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
    private final TeamRepository teamRepository;

    private final Optional<VersionControlService> versionControlService;

    private final AuthorizationCheckService authCheckService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseParticipationService.java`
#### Snippet
```java
    public ProgrammingExerciseParticipationService(SolutionProgrammingExerciseParticipationRepository solutionParticipationRepository,
            ProgrammingExerciseStudentParticipationRepository studentParticipationRepository, ParticipationRepository participationRepository, TeamRepository teamRepository,
            TemplateProgrammingExerciseParticipationRepository templateParticipationRepository, Optional<VersionControlService> versionControlService,
            UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService, ProgrammingExerciseRepository programmingExerciseRepository) {
        this.studentParticipationRepository = studentParticipationRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java
    private final ProgrammingExerciseParticipationService programmingExerciseParticipationService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final AuditEventRepository auditEventRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingTriggerService.java`
#### Snippet
```java

    public ProgrammingTriggerService(ProgrammingSubmissionRepository programmingSubmissionRepository, ProgrammingExerciseRepository programmingExerciseRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, AuditEventRepository auditEventRepository, ResultRepository resultRepository,
            ProgrammingExerciseStudentParticipationRepository programmingExerciseStudentParticipationRepository, ProgrammingMessagingService programmingMessagingService) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
    private final ExamSubmissionService examSubmissionService;

    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
    public ProgrammingSubmissionService(ProgrammingSubmissionRepository programmingSubmissionRepository, ProgrammingExerciseRepository programmingExerciseRepository,
            SubmissionRepository submissionRepository, UserRepository userRepository, AuthorizationCheckService authCheckService,
            ProgrammingMessagingService programmingMessagingService, Optional<VersionControlService> versionControlService, ResultRepository resultRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, ExamSubmissionService examSubmissionService, GitService gitService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            SubmissionRepository submissionRepository, UserRepository userRepository, AuthorizationCheckService authCheckService,
            ProgrammingMessagingService programmingMessagingService, Optional<VersionControlService> versionControlService, ResultRepository resultRepository,
            Optional<ContinuousIntegrationService> continuousIntegrationService, ParticipationService participationService,
            ProgrammingExerciseParticipationService programmingExerciseParticipationService, ExamSubmissionService examSubmissionService, GitService gitService,
            StudentParticipationRepository studentParticipationRepository, FeedbackRepository feedbackRepository, ExamDateService examDateService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final GitService gitService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java
    private final ExerciseHintRepository exerciseHintRepository;

    private final Optional<VersionControlService> versionControlService;

    private final ProgrammingExerciseParticipationService programmingExerciseParticipationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportBasicService.java`
#### Snippet
```java

    public ProgrammingExerciseImportBasicService(ExerciseHintService exerciseHintService, ExerciseHintRepository exerciseHintRepository,
            Optional<VersionControlService> versionControlService, ProgrammingExerciseParticipationService programmingExerciseParticipationService,
            ProgrammingExerciseTestCaseRepository programmingExerciseTestCaseRepository, StaticCodeAnalysisCategoryRepository staticCodeAnalysisCategoryRepository,
            ProgrammingExerciseRepository programmingExerciseRepository, ProgrammingExerciseService programmingExerciseService, StaticCodeAnalysisService staticCodeAnalysisService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'oldSchedule'
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
     * @param newSchedule                 the new schedule of the tutorial group
     */
    public void updateSchedule(TutorialGroupsConfiguration tutorialGroupsConfiguration, TutorialGroup tutorialGroup, Optional<TutorialGroupSchedule> oldSchedule,
            Optional<TutorialGroupSchedule> newSchedule) {
        if (oldSchedule.isPresent() && newSchedule.isPresent()) { // update existing schedule -> delete all scheduled sessions and recreate using the new schedule
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'newSchedule'
in `src/main/java/de/tum/in/www1/artemis/service/tutorialgroups/TutorialGroupScheduleService.java`
#### Snippet
```java
     */
    public void updateSchedule(TutorialGroupsConfiguration tutorialGroupsConfiguration, TutorialGroup tutorialGroup, Optional<TutorialGroupSchedule> oldSchedule,
            Optional<TutorialGroupSchedule> newSchedule) {
        if (oldSchedule.isPresent() && newSchedule.isPresent()) { // update existing schedule -> delete all scheduled sessions and recreate using the new schedule
            updateAllSessionsToNewSchedule(tutorialGroupsConfiguration, tutorialGroup, oldSchedule.get(), newSchedule.get());
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final ProgrammingExerciseService programmingExerciseService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final ProgrammingExerciseImportBasicService programmingExerciseImportBasicService;

    public ProgrammingExerciseImportService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseService programmingExerciseService, GitService gitService, FileService fileService, UserRepository userRepository,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, UrlService urlService, TemplateUpgradePolicy templateUpgradePolicy,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final ProgrammingExerciseImportBasicService programmingExerciseImportBasicService;

    public ProgrammingExerciseImportService(Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            ProgrammingExerciseService programmingExerciseService, GitService gitService, FileService fileService, UserRepository userRepository,
            AuxiliaryRepositoryRepository auxiliaryRepositoryRepository, UrlService urlService, TemplateUpgradePolicy templateUpgradePolicy,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java
    private final Logger log = LoggerFactory.getLogger(ProgrammingExerciseImportService.class);

    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

    public ProgrammingExerciseService(ProgrammingExerciseRepository programmingExerciseRepository, FileService fileService, GitService gitService,
            Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository, ParticipationService participationService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

    public ProgrammingExerciseService(ProgrammingExerciseRepository programmingExerciseRepository, FileService fileService, GitService gitService,
            Optional<VersionControlService> versionControlService, Optional<ContinuousIntegrationService> continuousIntegrationService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
            SolutionProgrammingExerciseParticipationRepository solutionProgrammingExerciseParticipationRepository, ParticipationService participationService,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final ParticipationRepository participationRepository;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
    private final GitService gitService;

    private final Optional<VersionControlService> versionControlService;

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'dueDate'
in `src/main/java/de/tum/in/www1/artemis/repository/ResultRepository.java`
#### Snippet
```java
     * @return the saved result
     */
    default Result submitResult(Result result, Exercise exercise, Optional<ZonedDateTime> dueDate) {
        double maxPoints = exercise.getMaxPoints();
        double bonusPoints = Objects.requireNonNullElse(exercise.getBonusPoints(), 0.0);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optionalUser'
in `src/main/java/de/tum/in/www1/artemis/repository/UserRepository.java`
#### Snippet
```java

    @NotNull
    private User unwrapOptionalUser(Optional<User> optionalUser, String currentUserLogin) {
        return optionalUser.orElseThrow(() -> new EntityNotFoundException("No user found with login: " + currentUserLogin));
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;

    private final ProgrammingExerciseTestCaseService testCaseService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java
    private final Logger log = LoggerFactory.getLogger(ProgrammingExerciseGradingService.class);

    private final Optional<ContinuousIntegrationService> continuousIntegrationService;

    private final Optional<VersionControlService> versionControlService;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'continuousIntegrationService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java

    public ProgrammingExerciseGradingService(ProgrammingExerciseTestCaseService testCaseService, StudentParticipationRepository studentParticipationRepository,
            ResultRepository resultRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ProgrammingTriggerService programmingTriggerService, SimpMessageSendingOperations messagingTemplate, StaticCodeAnalysisService staticCodeAnalysisService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'versionControlService'
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseGradingService.java`
#### Snippet
```java

    public ProgrammingExerciseGradingService(ProgrammingExerciseTestCaseService testCaseService, StudentParticipationRepository studentParticipationRepository,
            ResultRepository resultRepository, Optional<ContinuousIntegrationService> continuousIntegrationService, Optional<VersionControlService> versionControlService,
            ProgrammingTriggerService programmingTriggerService, SimpMessageSendingOperations messagingTemplate, StaticCodeAnalysisService staticCodeAnalysisService,
            TemplateProgrammingExerciseParticipationRepository templateProgrammingExerciseParticipationRepository,
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadExerciseResource.java`
#### Snippet
```java
            return false;
        }
        var filePattern = exercise.getFilePattern().toLowerCase().replaceAll("\\s+", "");
        var allowedFileEndings = filePattern.split(",");
        var isValid = true;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/TeamResource.java`
#### Snippet
```java
        }
        // Remove all special characters and check if the resulting shortname is valid
        var shortName = team.getShortName().replaceAll("[^0-9a-z]", "").toLowerCase();
        Matcher shortNameMatcher = SHORT_NAME_PATTERN.matcher(shortName);
        if (!shortNameMatcher.matches()) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
        List<String> participantIdentifierList = new ArrayList<>();
        if (!repositoryExportOptions.isExportAllParticipants()) {
            participantIdentifiers = participantIdentifiers.replaceAll("\\s+", "");
            participantIdentifierList = Arrays.asList(participantIdentifiers.split(","));
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/AccountResource.java`
#### Snippet
```java
    public void changeLanguageKey(@RequestBody String languageKey) {
        User user = userRepository.getUser();
        String langKey = languageKey.replaceAll("\"", "").toLowerCase().trim();
        if (!"en".equals(langKey) && !"de".equals(langKey)) {
            throw new BadRequestAlertException("Language key %s not supported!".formatted(languageKey), "Account", "invalidLanguageKey");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadSubmissionResource.java`
#### Snippet
```java
        final String[] splittedFileName = file.getOriginalFilename().split("\\.");
        final String fileSuffix = splittedFileName[splittedFileName.length - 1].toLowerCase();
        final String filePattern = String.join("|", exercise.getFilePattern().toLowerCase().replaceAll("\\s", "").split(","));
        if (!fileSuffix.matches(filePattern)) {
            throw new BadRequestAlertException("The uploaded file has the wrong type!", ENTITY_NAME, "fileUploadSubmissionIllegalFileType");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
    public ResponseEntity<Problem> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, @Nonnull NativeWebRequest request) {
        BindingResult result = ex.getBindingResult();
        List<FieldErrorVM> fieldErrors = result.getFieldErrors().stream().map(f -> new FieldErrorVM(f.getObjectName().replaceFirst("DTO$", ""), f.getField(), f.getCode()))
                .toList();

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/web/rest/tutorialgroups/TutorialGroupResource.java`
#### Snippet
```java
            throw new BadRequestException("A tutorial group with this title already exists in the course.");
        }
        if (!tutorialGroup.getTitle().matches(TITLE_REGEX)) {
            throw new BadRequestException("Title can only contain letters, numbers, spaces and dashes.");
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20211214_184200.java`
#### Snippet
```java
            // Users without a password or with a Bcrypt password that are set to isInternal=false have to be old users => Cleanup
            // Keep in mind that we already don't have any proper internal users at this stage
            if (encryptedPassword == null || encryptedPassword.matches("^\\$2[abxy]\\$\\d{2}\\$.*$")) {
                user.setInternal(false);
                user.setPassword(passwordService.encryptPassword(""));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220302_164200.java`
#### Snippet
```java
        }
        // The admin gets created beforehand if the account doesn't exist yet. This would be captured here.
        if (user.getPassword().matches("^\\$2[abxy]\\$\\d{2}\\$.*$")) {
            // If the password is a Bcrypt password at this point, it has to be a proper internal user we don't need to handle anymore.
            // Just to be sure, we set the correct internal state
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20220516_180000.java`
#### Snippet
```java
                var hintIdsString = matcher.group("hintIds");
                hintIdStrings.add("{" + hintIdsString + "}");
                Arrays.stream(hintIdsString.split(",")).map(String::trim).filter(hintId -> hintId.matches("\\d+")).map(Long::parseLong).forEach(hintId -> {
                    if (textHint.getId().equals(hintId)) {
                        textHint.setProgrammingExerciseTask(task);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/VcsRepositoryUrl.java`
#### Snippet
```java
        else { // e.g. http(s) or ssh
            String path = getURI().getPath();
            path = path.replaceAll(".git$", "");
            path = path.replaceAll("/$", "");
            path = path.replaceAll("^/.*scm", "");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/VcsRepositoryUrl.java`
#### Snippet
```java
            String path = getURI().getPath();
            path = path.replaceAll(".git$", "");
            path = path.replaceAll("/$", "");
            path = path.replaceAll("^/.*scm", "");
            return path;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/VcsRepositoryUrl.java`
#### Snippet
```java
            path = path.replaceAll(".git$", "");
            path = path.replaceAll("/$", "");
            path = path.replaceAll("^/.*scm", "");
            return path;
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/OnlineCourseConfiguration.java`
#### Snippet
```java
            throw new BadRequestAlertException("Invalid online course configuration", ENTITY_NAME, "invalidOnlineCourseConfiguration");
        }
        if (StringUtils.isBlank(userPrefix) || !userPrefix.matches(LOGIN_REGEX)) {
            throw new BadRequestAlertException("Invalid user prefix, must match login regex defined in Constants.java", ENTITY_NAME, "invalidUserPrefix");
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/TextSubmission.java`
#### Snippet
```java
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/BaseExercise.java`
#### Snippet
```java
     */
    public void setTitle(String title) {
        this.title = title != null ? title.strip().replaceAll("\\s+", " ") : null;
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/lti/Lti13ClientRegistration.java`
#### Snippet
```java

        Lti13ToolConfiguration toolConfiguration = new Lti13ToolConfiguration();
        String domain = serverUrl.split("://").length >= 1 ? serverUrl.split("://")[1] : ""; // Domain cannot include protocol
        toolConfiguration.setDomain(domain);
        toolConfiguration.setTargetLinkUri(serverUrl + "/courses/" + course.getId());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/lti/Lti13ClientRegistration.java`
#### Snippet
```java

        Lti13ToolConfiguration toolConfiguration = new Lti13ToolConfiguration();
        String domain = serverUrl.split("://").length >= 1 ? serverUrl.split("://")[1] : ""; // Domain cannot include protocol
        toolConfiguration.setDomain(domain);
        toolConfiguration.setTargetLinkUri(serverUrl + "/courses/" + course.getId());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
    public void forceNewProjectKey() {
        Course course = getCourseViaExerciseGroupOrCourseMember();
        this.projectKey = (course.getShortName() + this.getShortName()).toUpperCase().replaceAll("\\s+", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/domain/plagiarism/PlagiarismSubmission.java`
#### Snippet
```java
        PlagiarismSubmission<TextSubmissionElement> submission = new PlagiarismSubmission<>();

        String[] submissionIdAndStudentLogin = jplagSubmission.getName().split("[-.]");

        long submissionId = 0;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        }
        // replace all illegal characters with ascii characters \w means A-Za-z0-9 to avoid problems during download later on
        filename = filename.replaceAll("[^\\w.-]", "");
        // if the filename is now too short, we prepend "file"
        // this prevents potential problems when users call their file e.g. ???.pdf
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/util/UrlUtils.java`
#### Snippet
```java
        // Go through all path segments and replace variable segments with the supplied args
        for (var pathSegment : pathSegments) {
            if (pathSegment.matches("<.*>")) {
                // If we don't have enough args, throw an error
                if (segmentCtr == args.length) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
        for (Resource resource : resources) {
            // Replace windows separator with "/"
            String fileUrl = java.net.URLDecoder.decode(resource.getURL().toString(), StandardCharsets.UTF_8).replaceAll("\\\\", "/");
            // cut the prefix (e.g. 'exercise', 'solution', 'test') from the actual path
            int index = fileUrl.indexOf(prefix);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java

        String fileContent = Files.readString(replaceFilePath, charset);
        fileContent = fileContent.replaceAll("\\r\\n?", "\n");
        Files.writeString(replaceFilePath, fileContent, charset);
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
            }
            else {
                filename = filenameBase + ZonedDateTime.now().toString().substring(0, 23).replaceAll("[:.]", "-") + "_" + UUID.randomUUID().toString().substring(0, 8) + "."
                        + fileExtension;
            }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
            if (!keepFileName) {
                // append a timestamp and some randomness to the filename to avoid conflicts
                newFilename = fileNameAddition + ZonedDateTime.now().toString().substring(0, 23).replaceAll(":|\\.", "-") + "_" + UUID.randomUUID().toString().substring(0, 8) + "."
                        + fileExtension;
            }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
     */
    public String removeIllegalCharacters(String string) {
        return string.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java

        // sanitize the filename and replace all invalid characters with with an underscore
        filename = filename.replaceAll("[^a-zA-Z\\d\\.\\-]", "_");

        // Check the allowed file extensions
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
    protected static UMLMethod parseMethod(JsonObject methodJson) {
        String completeMethodName = methodJson.get(ELEMENT_NAME).getAsString();
        String[] methodEntryArray = completeMethodName.replaceAll("\\s+", "").split(":");
        String[] methodParts = methodEntryArray[0].split("[()]");

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
        String completeMethodName = methodJson.get(ELEMENT_NAME).getAsString();
        String[] methodEntryArray = completeMethodName.replaceAll("\\s+", "").split(":");
        String[] methodParts = methodEntryArray[0].split("[()]");

        String methodName = "";
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/parsers/ClassDiagramParser.java`
#### Snippet
```java
     */
    protected static UMLAttribute parseAttribute(JsonObject attributeJson) {
        String[] attributeNameArray = attributeJson.get(ELEMENT_NAME).getAsString().replaceAll("\\s+", "").split(":");
        String attributeName = attributeNameArray[0];
        String attributeType = "";
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralTestCaseService.java`
#### Snippet
```java
            var name = classElement.getStructuralClass().getName();
            var solutionClass = solutionClasses.get(packageName + "." + name);
            String filePath = "src/" + packageName.replaceAll("\\.", "/") + "/" + name + ".java";
            if (solutionClass != null) {
                try {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/SAML2Service.java`
#### Snippet
```java
            output = output.replaceAll("\\{" + escapedKey + "\\}", getAttributeValue(principal, key));
        }
        return output.replaceAll("\\{[^\\}]*?\\}", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
        // Replace the exercise name in the repository folder name with the participation ID.
        // This is necessary to be able to refer back to the correct participation after the JPlag detection run.
        String updatedRepoFolderName = repoFolderName.replaceAll("/[a-zA-Z0-9]*-", "/" + participation.getId() + "-");
        Path localPath = Path.of(targetPath, updatedRepoFolderName);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
    public Path zipRepository(Repository repository, String zipFilename, String repositoryDir, @Nullable Predicate<Path> contentFilter) throws IOException, UncheckedIOException {
        // Strip slashes from name
        var zipFilenameWithoutSlash = zipFilename.replaceAll("\\s", "");

        if (!zipFilenameWithoutSlash.endsWith(".zip")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildLogParseUtils.java`
#### Snippet
```java

    private static String stripLogEndOfLine(String log) {
        return log.replaceAll("[\\r\\n]", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java

    private String getCleanPlanName(String name) {
        return name.toUpperCase().replaceAll("[^A-Z0-9]", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java

        // remove potential username from repo URL. Jenkins uses the Artemis Admin user and will fail if other usernames are in the URL
        final var repoUrl = newRepoUrl.replaceAll("(https?://)(.*@)(.*)", "$1$3");
        final Document jobConfig = jenkinsJobService.getJobConfigForJobInFolder(buildProjectKey, buildPlanKey);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabService.java`
#### Snippet
```java
        public VcsRepositoryUrl withUser(String username) {
            this.username = username;
            return new GitLabRepositoryUrl(uri.toString().replaceAll("(https?://)(.*)", "$1" + username + "@$2"));
        }
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java

    private String getCleanPlanName(String name) {
        return name.toUpperCase().replaceAll("[^A-Z0-9]", "");
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
            String testCaseName = testCase.getTestName();
            // set type depending on the test case name
            if (testCaseName.matches(METHOD_TEST_REGEX) || testCaseName.matches(ATTRIBUTES_TEST_REGEX) || testCaseName.matches(CONSTRUCTORS_TEST_REGEX)
                    || testCaseName.matches(CLASS_TEST_REGEX)) {
                testCase.setType(ProgrammingExerciseTestCaseType.STRUCTURAL);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
            String testCaseName = testCase.getTestName();
            // set type depending on the test case name
            if (testCaseName.matches(METHOD_TEST_REGEX) || testCaseName.matches(ATTRIBUTES_TEST_REGEX) || testCaseName.matches(CONSTRUCTORS_TEST_REGEX)
                    || testCaseName.matches(CLASS_TEST_REGEX)) {
                testCase.setType(ProgrammingExerciseTestCaseType.STRUCTURAL);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
            String testCaseName = testCase.getTestName();
            // set type depending on the test case name
            if (testCaseName.matches(METHOD_TEST_REGEX) || testCaseName.matches(ATTRIBUTES_TEST_REGEX) || testCaseName.matches(CONSTRUCTORS_TEST_REGEX)
                    || testCaseName.matches(CLASS_TEST_REGEX)) {
                testCase.setType(ProgrammingExerciseTestCaseType.STRUCTURAL);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseTestCaseService.java`
#### Snippet
```java
            // set type depending on the test case name
            if (testCaseName.matches(METHOD_TEST_REGEX) || testCaseName.matches(ATTRIBUTES_TEST_REGEX) || testCaseName.matches(CONSTRUCTORS_TEST_REGEX)
                    || testCaseName.matches(CLASS_TEST_REGEX)) {
                testCase.setType(ProgrammingExerciseTestCaseType.STRUCTURAL);
            }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/BitbucketService.java`
#### Snippet
```java
        public VcsRepositoryUrl withUser(String username) {
            this.username = username;
            return new BitbucketRepositoryUrl(uri.toString().replaceAll("(https?://)(.*)", "$1" + username + "@$2"));
        }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in pom.xml
        replacements.put("<artifactId>" + templateExercise.getTitle().replaceAll(" ", "-"), "<artifactId>" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in settings.gradle
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in pom.xml
        replacements.put("<artifactId>" + templateExercise.getTitle().replaceAll(" ", "-"), "<artifactId>" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in settings.gradle
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in settings.gradle
        replacements.put("rootProject.name = '" + templateExercise.getTitle().replaceAll(" ", "-"), "rootProject.name = '" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in readme.md (Gradle)
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in settings.gradle
        replacements.put("rootProject.name = '" + templateExercise.getTitle().replaceAll(" ", "-"), "rootProject.name = '" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in readme.md (Gradle)
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in readme.md (Gradle)
        replacements.put("testImplementation(':" + templateExercise.getTitle().replaceAll(" ", "-"), "testImplementation(':" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in .project
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseImportService.java`
#### Snippet
```java

        // Used in readme.md (Gradle)
        replacements.put("testImplementation(':" + templateExercise.getTitle().replaceAll(" ", "-"), "testImplementation(':" + newExercise.getTitle().replaceAll(" ", "-"));

        // Used in .project
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
        // there is no need in python to replace package names

        replacements.put("${exerciseNamePomXml}", programmingExercise.getTitle().replaceAll(" ", "-")); // Used e.g. in artifactId
        replacements.put("${exerciseName}", programmingExercise.getTitle());
        replacements.put("${studentWorkingDirectory}", Constants.STUDENT_WORKING_DIRECTORY);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
     */
    public boolean preCheckProjectExistsOnVCSOrCI(ProgrammingExercise programmingExercise, String courseShortName) {
        String projectKey = courseShortName + programmingExercise.getShortName().toUpperCase().replaceAll("\\s+", "");
        String projectName = courseShortName + " " + programmingExercise.getTitle();
        log.debug("Project Key: " + projectKey);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/repository/FeedbackRepository.java`
#### Snippet
```java
    private static Pattern prepareJVMResultMessageMatcher(List<String> jvmExceptionsToFilter) {
        // Replace all "." with "\\." and join with regex alternative symbol "|"
        String assertionRegex = jvmExceptionsToFilter.stream().map(s -> s.replaceAll("\\.", "\\\\.")).reduce("", (a, b) -> String.join("|", a, b));
        // Match any of the exceptions at the start of the line and with ": " after it
        String pattern = String.format("^(?:%s): \n*", assertionRegex);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            }
            if (artifactIdNode != null) {
                String artifactId = (artifactIdNode.getTextContent() + "-" + participantIdentifier).replaceAll(" ", "-").toLowerCase();
                artifactIdNode.setTextContent(artifactId);
            }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.enumeration` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipantScoreResource.java`
#### Snippet
```java
     * GET /courses/:courseId/participant-scores/average-participant  gets the average scores of the participants in the course
     * <p>
     * Important: Exercises with {@link de.tum.in.www1.artemis.domain.enumeration.IncludedInOverallScore#NOT_INCLUDED} will be not taken into account!
     *
     * @param courseId the id of the course for which to get the average scores of the participants
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.enumeration` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipantScoreResource.java`
#### Snippet
```java
     * GET /courses/:courseId/participant-scores/average  gets the average score of the course
     * <p>
     * Important: Exercises with {@link de.tum.in.www1.artemis.domain.enumeration.IncludedInOverallScore#NOT_INCLUDED} will be not taken into account!
     *
     * @param courseId                the id of the course for which to get the average score
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.enumeration` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipantScoreResource.java`
#### Snippet
```java
     * GET /exams/:examId/participant-scores/average gets the average score of the exam
     * <p>
     * Important: Exercises with {@link de.tum.in.www1.artemis.domain.enumeration.IncludedInOverallScore#NOT_INCLUDED} will be not taken into account!
     *
     * @param examId                  the id of the exam for which to get the average score
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.enumeration` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipantScoreResource.java`
#### Snippet
```java
     * GET /exams/:examId/participant-scores/average-participant  gets the average scores of the participants in the exam
     * <p>
     * Important: Exercises with {@link de.tum.in.www1.artemis.domain.enumeration.IncludedInOverallScore#NOT_INCLUDED} will be not taken into account!
     *
     * @param examId the id of the exam for which to get the average scores of the participants
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/web/rest/admin/AdminUserResource.java`
#### Snippet
```java
    public ResponseEntity<List<String>> deleteUsers(@RequestParam(name = "login") List<String> logins) {
        log.debug("REST request to delete {} users", logins.size());
        List<String> deletedUsers = new java.util.ArrayList<>();

        // Get current user and remove current user from list of logins
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.hestia` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/ProgrammingExerciseTaskResource.java`
#### Snippet
```java

/**
 * REST controller for managing {@link de.tum.in.www1.artemis.domain.hestia.ProgrammingExerciseTask}.
 */
@RestController
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.exception` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java

    @ExceptionHandler
    public ResponseEntity<Problem> handleUsernameAlreadyUsedException(de.tum.in.www1.artemis.exception.UsernameAlreadyUsedException ex, NativeWebRequest request) {
        LoginAlreadyUsedException problem = new LoginAlreadyUsedException();
        return create(problem, request, HeaderUtil.createFailureAlert(applicationName, true, problem.getEntityName(), problem.getErrorKey(), problem.getMessage()));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.hestia` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/ProgrammingExerciseSolutionEntryResource.java`
#### Snippet
```java

/**
 * REST controller for managing {@link de.tum.in.www1.artemis.domain.hestia.ProgrammingExerciseSolutionEntry}.
 */
@RestController
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain.hestia` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/web/rest/hestia/ExerciseHintResource.java`
#### Snippet
```java

/**
 * REST controller for managing {@link de.tum.in.www1.artemis.domain.hestia.ExerciseHint}.
 */
@RestController
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.springframework.web.client` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/config/RestTemplateConfiguration.java`
#### Snippet
```java

/**
 * For now only provides a basic {@link org.springframework.web.client.RestTemplate RestTemplate} bean. Can be extended
 * to further customize how requests to other REST APIs are handled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.hazelcast.spring.cache` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/config/CacheConfiguration.java`
#### Snippet
```java
    public CacheManager cacheManager(HazelcastInstance hazelcastInstance) {
        log.debug("Starting HazelcastCacheManager");
        return new com.hazelcast.spring.cache.HazelcastCacheManager(hazelcastInstance);
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.jgit.internal.storage.file` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/domain/Repository.java`
#### Snippet
```java
import de.tum.in.www1.artemis.domain.participation.ProgrammingExerciseParticipation;

public class Repository extends org.eclipse.jgit.internal.storage.file.FileRepository {

    private ProgrammingExerciseParticipation participation;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.hibernate.annotations` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizBatch.java`
#### Snippet
```java
@Entity
@Table(name = "quiz_batch")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QuizBatch extends DomainObject {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.hibernate.annotations` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/domain/modeling/ModelElement.java`
#### Snippet
```java
@Entity
@Table(name = "model_element")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ModelElement implements Serializable {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.domain` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/service/RatingService.java`
#### Snippet
```java

/**
 * Service Implementation for managing {@link de.tum.in.www1.artemis.domain.Rating}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/service/RepositoryService.java`
#### Snippet
```java
        }
        InputStream inputStream = new FileInputStream(file.get());
        byte[] fileInBytes = org.apache.commons.io.IOUtils.toByteArray(inputStream);
        inputStream.close();
        return fileInBytes;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
        for (Resource resource : resources) {
            // Replace windows separator with "/"
            String fileUrl = java.net.URLDecoder.decode(resource.getURL().toString(), StandardCharsets.UTF_8).replaceAll("\\\\", "/");
            // cut the prefix (e.g. 'exercise', 'solution', 'test') from the actual path
            int index = fileUrl.indexOf(prefix);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.tum.in.www1.artemis.service.hestia.behavioral` is unnecessary and can be removed
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/CreateCommonChangeBlocks.java`
#### Snippet
```java
/**
 * For each {@link GroupedFile}:
 * Takes the common lines (intersection of covered and changed lines) and creates {@link de.tum.in.www1.artemis.service.hestia.behavioral.GroupedFile.ChangeBlock}s
 * from them. Each ChangeBlock represents one continuous block of common lines.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.http` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
        catch (HttpResponseException e) {
            // We don't throw an exception if the project doesn't exist in Jenkins (404 status)
            if (e.getStatusCode() != org.apache.http.HttpStatus.SC_NOT_FOUND) {
                log.error(e.getMessage(), e);
                throw new JenkinsException("Error while trying to delete job in Jenkins for " + jobName, e);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
                if (isMaven) {
                    String stagePomXmlPath = templatePath + "/stagePom.xml";
                    if (new java.io.File(projectTemplatePath + "/stagePom.xml").exists()) {
                        stagePomXmlPath = projectTemplatePath + "/stagePom.xml";
                    }
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
            if (!keepFileName) {
                // append a timestamp and some randomness to the filename to avoid conflicts
                newFilename = fileNameAddition + ZonedDateTime.now().toString().substring(0, 23).replaceAll(":|\\.", "-") + "_" + UUID.randomUUID().toString().substring(0, 8) + "."
                        + fileExtension;
            }
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileResource.java`
#### Snippet
```java
        }
        catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/domain/TextCluster.java`
#### Snippet
```java
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/domain/TextCluster.java`
#### Snippet
```java
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/de/tum/in/www1/artemis/domain/participation/ProgrammingExerciseParticipation.java`
#### Snippet
```java
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractSubmissionResource()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/web/rest/AbstractSubmissionResource.java`
#### Snippet
```java
    protected final StudentParticipationRepository studentParticipationRepository;

    public AbstractSubmissionResource(SubmissionRepository submissionRepository, ResultService resultService, AuthorizationCheckService authCheckService,
            UserRepository userRepository, ExerciseRepository exerciseRepository, SubmissionService submissionService,
            StudentParticipationRepository studentParticipationRepository) {
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AssessmentResource()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/web/rest/AssessmentResource.java`
#### Snippet
```java
    protected final SingleUserNotificationService singleUserNotificationService;

    public AssessmentResource(AuthorizationCheckService authCheckService, UserRepository userRepository, ExerciseRepository exerciseRepository, AssessmentService assessmentService,
            ResultRepository resultRepository, ExamService examService, WebsocketMessagingService messagingService, ExampleSubmissionRepository exampleSubmissionRepository,
            SubmissionRepository submissionRepository, SingleUserNotificationService singleUserNotificationService) {
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `HttpStatusException()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/HttpStatusException.java`
#### Snippet
```java
    private final String errorKey;

    public HttpStatusException(URI type, String defaultMessage, Status status, String entityName, String errorKey, Map<String, Object> parameters) {
        super(type, defaultMessage, status, null, null, null, parameters);
        this.entityName = entityName;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `RepositoryResource()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/web/rest/repository/RepositoryResource.java`
#### Snippet
```java
    protected final Optional<VersionControlService> versionControlService;

    public RepositoryResource(UserRepository userRepository, AuthorizationCheckService authCheckService, GitService gitService,
            Optional<ContinuousIntegrationService> continuousIntegrationService, RepositoryService repositoryService, Optional<VersionControlService> versionControlService,
            ProgrammingExerciseRepository programmingExerciseRepository) {
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `SubmissionExportService()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionExportService.java`
#### Snippet
```java
    private final FileService fileService;

    public SubmissionExportService(ExerciseRepository exerciseRepository, ZipFileService zipFileService, FileService fileService) {
        this.exerciseRepository = exerciseRepository;
        this.zipFileService = zipFileService;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ExerciseImportService()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/ExerciseImportService.java`
#### Snippet
```java
    private final Logger log = LoggerFactory.getLogger(ExerciseImportService.class);

    public ExerciseImportService(ExampleSubmissionRepository exampleSubmissionRepository, SubmissionRepository submissionRepository, ResultRepository resultRepository) {
        this.exampleSubmissionRepository = exampleSubmissionRepository;
        this.submissionRepository = submissionRepository;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TeamImportStrategy()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/team/TeamImportStrategy.java`
#### Snippet
```java
    protected final TeamRepository teamRepository;

    public TeamImportStrategy(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BehavioralKnowledgeSource()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/BehavioralKnowledgeSource.java`
#### Snippet
```java
    protected BehavioralBlackboard blackboard;

    public BehavioralKnowledgeSource(BehavioralBlackboard blackboard) {
        this.blackboard = blackboard;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLElement.java`
#### Snippet
```java
    }

    public UMLElement(String jsonElementID) {
        this.jsonElementID = jsonElementID;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLElement.java`
#### Snippet
```java
     * empty constructor used to make mockito happy
     */
    public UMLElement() {
    }

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLDiagram()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLDiagram.java`
#### Snippet
```java
    }

    public UMLDiagram(long modelSubmissionId) {
        this.modelSubmissionId = modelSubmissionId;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLDiagram()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLDiagram.java`
#### Snippet
```java
     * to make mockito happy
     */
    public UMLDiagram() {
    }

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLContainerElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
     * empty constructor used to make mockito happy
     */
    public UMLContainerElement() {
        super();
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLContainerElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
    }

    public UMLContainerElement(String jsonElementID) {
        super(jsonElementID);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLContainerElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/UMLContainerElement.java`
#### Snippet
```java
    }

    public UMLContainerElement(String jsonElementID, List<UMLElement> subElements) {
        super(jsonElementID);
        this.subElements = subElements;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLActivityElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityElement.java`
#### Snippet
```java
     * to make mockito happy
     */
    public UMLActivityElement() {
    }

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `UMLActivityElement()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityElement.java`
#### Snippet
```java
    }

    public UMLActivityElement(String name, String jsonElementID) {
        super(jsonElementID);
        this.name = name;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractVersionControlService()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractVersionControlService.java`
#### Snippet
```java
    protected final ProgrammingExerciseRepository programmingExerciseRepository;

    public AbstractVersionControlService(ApplicationContext applicationContext, GitService gitService, UrlService urlService,
            ProgrammingExerciseStudentParticipationRepository studentParticipationRepository, ProgrammingExerciseRepository programmingExerciseRepository) {
        this.applicationContext = applicationContext;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractContinuousIntegrationService()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractContinuousIntegrationService.java`
#### Snippet
```java
    protected final TestwiseCoverageService testwiseCoverageService;

    public AbstractContinuousIntegrationService(ProgrammingSubmissionRepository programmingSubmissionRepository, FeedbackRepository feedbackRepository,
            BuildLogEntryService buildLogService, BuildLogStatisticsEntryRepository buildLogStatisticsEntryRepository, RestTemplate restTemplate,
            RestTemplate shortTimeoutRestTemplate, TestwiseCoverageService testwiseCoverageService) {
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ArtemisAuthenticationProviderImpl()` of an abstract class should not be declared 'public'
in `src/main/java/de/tum/in/www1/artemis/security/ArtemisAuthenticationProviderImpl.java`
#### Snippet
```java
    protected final PasswordService passwordService;

    public ArtemisAuthenticationProviderImpl(UserRepository userRepository, PasswordService passwordService, UserCreationService userCreationService) {
        this.userRepository = userRepository;
        this.passwordService = passwordService;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `modelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingSubmissionResource.java`
#### Snippet
```java

        // Prevent multiple submissions (currently only for exam submissions)
        modelingSubmission = (ModelingSubmission) examSubmissionService.preventMultipleSubmissions(exercise, modelingSubmission, user);
        // Check if the user is allowed to submit
        modelingSubmissionService.checkSubmissionAllowanceElseThrow(exercise, modelingSubmission, user);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `modelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ModelingSubmissionResource.java`
#### Snippet
```java
        modelingSubmissionService.checkSubmissionAllowanceElseThrow(exercise, modelingSubmission, user);

        modelingSubmission = modelingSubmissionService.handleModelingSubmission(modelingSubmission, exercise, user);
        modelingSubmissionService.hideDetails(modelingSubmission, user);
        long end = System.currentTimeMillis();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tutorId`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ComplaintResource.java`
#### Snippet
```java
        // Only instructors can access all complaints about an exercise without filtering by tutorId
        if (!isAtLeastInstructor) {
            tutorId = userRepository.getUser().getId();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tutorId`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ComplaintResource.java`
#### Snippet
```java

        if (!isAtLeastInstructor) {
            tutorId = user.getId();
        }
        List<Complaint> complaints;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `lecture`
in `src/main/java/de/tum/in/www1/artemis/web/rest/LectureResource.java`
#### Snippet
```java

    private Lecture filterLectureContentForUser(Lecture lecture, User user) {
        lecture = lectureService.filterActiveAttachments(lecture, user);

        // The Objects::nonNull is needed here because the relationship lecture -> lecture units is ordered and
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/QuizSubmissionResource.java`
#### Snippet
```java

        // Prevent multiple submissions (currently only for exam submissions)
        quizSubmission = (QuizSubmission) examSubmissionService.preventMultipleSubmissions(quizExercise, quizSubmission, user);

        QuizSubmission updatedQuizSubmission = quizSubmissionService.saveSubmissionForExamMode(quizExercise, quizSubmission, user);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `textSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java

        // Prevent multiple submissions (currently only for exam submissions)
        textSubmission = (TextSubmission) examSubmissionService.preventMultipleSubmissions(exercise, textSubmission, user);
        // Check if the user is allowed to submit
        textSubmissionService.checkSubmissionAllowanceElseThrow(exercise, textSubmission, user);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `textSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/TextSubmissionResource.java`
#### Snippet
```java
        textSubmissionService.checkSubmissionAllowanceElseThrow(exercise, textSubmission, user);

        textSubmission = textSubmissionService.handleTextSubmission(textSubmission, exercise, user);
        textSubmissionService.hideDetails(textSubmission, user);
        long end = System.currentTimeMillis();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participantIdentifiers`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseExportImportResource.java`
#### Snippet
```java
        List<String> participantIdentifierList = new ArrayList<>();
        if (!repositoryExportOptions.isExportAllParticipants()) {
            participantIdentifiers = participantIdentifiers.replaceAll("\\s+", "");
            participantIdentifierList = Arrays.asList(participantIdentifiers.split(","));
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/QuizExerciseResource.java`
#### Snippet
```java
        }

        quizExercise = quizExerciseService.save(quizExercise);
        exerciseService.logUpdate(quizExercise, quizExercise.getCourseViaExerciseGroupOrCourseMember(), user);
        groupNotificationScheduleService.checkAndCreateAppropriateNotificationsWhenUpdatingExercise(originalQuiz, quizExercise, notificationText);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/QuizExerciseResource.java`
#### Snippet
```java
        authCheckService.checkHasAtLeastRoleInCourseElseThrow(Role.EDITOR, course, null);

        quizExercise = quizExerciseService.save(quizExercise);

        return ResponseEntity.created(new URI("/api/quiz-exercises/" + quizExercise.getId()))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/QuizExerciseResource.java`
#### Snippet
```java
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.INSTRUCTOR, quizExercise, user);

        quizExercise = quizExerciseService.reEvaluate(quizExercise, originalQuizExercise);
        exerciseService.logUpdate(quizExercise, quizExercise.getCourseViaExerciseGroupOrCourseMember(), user);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileUploadSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/FileUploadSubmissionResource.java`
#### Snippet
```java

        // Prevent multiple submissions (currently only for exam submissions)
        fileUploadSubmission = (FileUploadSubmission) examSubmissionService.preventMultipleSubmissions(exercise, fileUploadSubmission, user);
        // Check if the user is allowed to submit
        fileUploadSubmissionService.checkSubmissionAllowanceElseThrow(exercise, fileUploadSubmission, user);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exampleSubmission`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ExampleSubmissionResource.java`
#### Snippet
```java
            throw new BadRequestAlertException("The exercise id in the path does not match the exercise id of the submission", ENTITY_NAME, "idsNotMatching");
        }
        exampleSubmission = exampleSubmissionService.save(exampleSubmission);
        return ResponseEntity.ok(exampleSubmission);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newManualResult`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingAssessmentResource.java`
#### Snippet
```java
        newManualResult.setSubmission(submission);
        newManualResult.setHasComplaint(existingManualResult.getHasComplaint().isPresent() && existingManualResult.getHasComplaint().get());
        newManualResult = programmingAssessmentService.saveManualAssessment(newManualResult);

        if (submission.getParticipation() == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newManualResult`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingAssessmentResource.java`
#### Snippet
```java

        if (submit) {
            newManualResult = resultRepository.submitManualAssessment(existingManualResult.getId());
            Optional<User> optionalStudent = ((StudentParticipation) submission.getParticipation()).getStudent();
            if (optionalStudent.isPresent()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `updatedProgrammingExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ProgrammingExerciseResource.java`
#### Snippet
```java
        var user = userRepository.getUserWithGroupsAndAuthorities();
        authCheckService.checkHasAtLeastRoleForExerciseElseThrow(Role.EDITOR, existingProgrammingExercise, user);
        updatedProgrammingExercise = programmingExerciseService.updateTimeline(updatedProgrammingExercise, notificationText);
        exerciseService.logUpdate(updatedProgrammingExercise, updatedProgrammingExercise.getCourseViaExerciseGroupOrCourseMember(), user);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, updatedProgrammingExercise.getTitle()))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `textUnit`
in `src/main/java/de/tum/in/www1/artemis/web/rest/lecture/TextUnitResource.java`
#### Snippet
```java
        // persist lecture unit before lecture to prevent "null index column for collection" error
        textUnit.setLecture(null);
        textUnit = textUnitRepository.saveAndFlush(textUnit);
        textUnit.setLecture(lecture);
        lecture.addLectureUnit(textUnit);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java

            // quiz has ended => get participation from database and add full quizExercise
            quizExercise = quizExerciseRepository.findByIdWithQuestionsElseThrow(quizExercise.getId());
            StudentParticipation participation = participationForQuizWithResult(quizExercise, user.getLogin());
            if (participation == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
            // Quiz is active => construct Participation from
            // filtered quizExercise and submission from HashMap
            quizExercise = quizExerciseRepository.findByIdWithQuestionsElseThrow(quizExercise.getId());
            quizExercise.setQuizBatches(quizBatch.stream().collect(Collectors.toSet()));
            quizExercise.filterForStudentsDuringQuiz();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
    private void addLatestResultToParticipation(StudentParticipation participation) {
        // Load results of participation as they are not contained in the current object
        participation = studentParticipationRepository.findByIdWithResultsElseThrow(participation.getId());

        Result result = participation.findLatestLegalResult();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exerciseUnit`
in `src/main/java/de/tum/in/www1/artemis/web/rest/lecture/ExerciseUnitResource.java`
#### Snippet
```java
        // persist lecture unit before lecture to prevent "null index column for collection" error
        exerciseUnit.setLecture(null);
        exerciseUnit = exerciseUnitRepository.saveAndFlush(exerciseUnit);
        exerciseUnit.setLecture(lecture);
        lecture.addLectureUnit(exerciseUnit);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `videoUnit`
in `src/main/java/de/tum/in/www1/artemis/web/rest/lecture/VideoUnitResource.java`
#### Snippet
```java
        // persist lecture unit before lecture to prevent "null index column for collection" error
        videoUnit.setLecture(null);
        videoUnit = videoUnitRepository.saveAndFlush(videoUnit);
        videoUnit.setLecture(lecture);
        lecture.addLectureUnit(videoUnit);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `submission`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/ParticipationTeamWebsocketService.java`
#### Snippet
```java

        if (submission instanceof ModelingSubmission modelingSubmission && exercise instanceof ModelingExercise modelingExercise) {
            submission = modelingSubmissionService.handleModelingSubmission(modelingSubmission, modelingExercise, user);
            modelingSubmissionService.hideDetails(submission, user);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `submission`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/ParticipationTeamWebsocketService.java`
#### Snippet
```java
        }
        else if (submission instanceof TextSubmission textSubmission && exercise instanceof TextExercise textExercise) {
            submission = textSubmissionService.handleTextSubmission(textSubmission, textExercise, user);
            textSubmissionService.hideDetails(submission, user);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `userList`
in `src/main/java/de/tum/in/www1/artemis/config/migration/entries/MigrationEntry20211214_184200.java`
#### Snippet
```java
     */
    private void processUsers(List<User> userList) {
        userList = userList.stream().peek(user -> {
            // This user is either already external or a user with a default `isInternal` value
            String encryptedPassword = user.getPassword();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `modelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionService.java`
#### Snippet
```java
            automaticResult.setSubmission(modelingSubmission);
            modelingSubmission.addResult(automaticResult);
            modelingSubmission = modelingSubmissionRepository.save(modelingSubmission);
        }
        return modelingSubmission;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `modelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionService.java`
#### Snippet
```java
        // remove result from submission (in the unlikely case it is passed here), so that students cannot inject a result
        modelingSubmission.setResults(new ArrayList<>());
        modelingSubmission = modelingSubmissionRepository.save(modelingSubmission);

        // versioning of submission
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `modelingSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/ModelingSubmissionService.java`
#### Snippet
```java
            modelingSubmission.setSubmitted(true);
        }
        modelingSubmission = save(modelingSubmission, exercise, user, participation);
        return modelingSubmission;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionPolicyService.java`
#### Snippet
```java
        final Long participationId = participation.getId();
        int submissionCompensation = 0;
        participation = participationRepository.findByIdWithLatestSubmissionAndResult(participationId)
                .orElseThrow(() -> new EntityNotFoundException("Participation", participationId));
        var submissions = participation.getSubmissions();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newPolicy`
in `src/main/java/de/tum/in/www1/artemis/service/SubmissionPolicyService.java`
#### Snippet
```java
        else {
            removeSubmissionPolicyFromProgrammingExercise(programmingExercise);
            newPolicy = addSubmissionPolicyToProgrammingExercise(newPolicy, programmingExercise);
            return enableSubmissionPolicy(newPolicy);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/service/QuizExerciseService.java`
#### Snippet
```java
        // and delete the now orphaned entries from the database
        log.debug("Save quiz to database: {}", quizExercise);
        quizExercise = quizExerciseRepository.saveAndFlush(quizExercise);

        // fix references in all drag and drop questions and short answer questions (step 2/2)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/service/QuizExerciseService.java`
#### Snippet
```java
        updateResultsOnQuizChanges(quizExercise);

        quizExercise = save(quizExercise);

        if (updateOfResultsAndStatisticsNecessary) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizExercise`
in `src/main/java/de/tum/in/www1/artemis/service/QuizExerciseService.java`
#### Snippet
```java
        if (updateOfResultsAndStatisticsNecessary) {
            // make sure we have all objects available before updating the statistics to avoid lazy / proxy issues
            quizExercise = quizExerciseRepository.findByIdWithQuestionsAndStatisticsElseThrow(quizExercise.getId());
            quizStatisticService.recalculateStatistics(quizExercise);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `quizSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/QuizSubmissionService.java`
#### Snippet
```java
        quizSubmission.calculateAndUpdateScores(quizExercise);
        // save parent submission object
        quizSubmission = quizSubmissionRepository.save(quizSubmission);

        // create result
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `result`
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentService.java`
#### Snippet
```java
        else {
            // We are the first ones to open assess this submission, we want to lock it.
            result = new Result();
            result.setParticipation(participation);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `result`
in `src/main/java/de/tum/in/www1/artemis/service/TextAssessmentService.java`
#### Snippet
```java
            resultService.createNewRatedManualResult(result, false);
            result.setCompletionDate(null);
            result = resultRepository.save(result);
            result.setSubmission(textSubmission);
            textSubmission.addResult(result);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileUploadSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        }

        fileUploadSubmission = save(fileUploadSubmission, file, participation, exercise);
        return fileUploadSubmission;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileUploadSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java

        // Note: we save before the new file path is set to potentially remove the old file on the file system
        fileUploadSubmission = fileUploadSubmissionRepository.save(fileUploadSubmission);
        fileUploadSubmission.setFilePath(newFilePath);
        // Note: we save again so that the new file is stored on the file system
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileUploadSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        fileUploadSubmission.setFilePath(newFilePath);
        // Note: we save again so that the new file is stored on the file system
        fileUploadSubmission = fileUploadSubmissionRepository.save(fileUploadSubmission);

        return fileUploadSubmission;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileUploadSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/FileUploadSubmissionService.java`
#### Snippet
```java
        // We need to set id for newly created submissions
        if (fileUploadSubmission.getId() == null) {
            fileUploadSubmission = fileUploadSubmissionRepository.save(fileUploadSubmission);
        }
        final var newLocalFilePath = saveFileForSubmission(file, fileUploadSubmission, exercise);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastTeachingAssistantInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return isTeachingAssistantInCourse(course, user) || isEditorInCourse(course, user) || isInstructorInCourse(course, user) || isAdmin(user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastStudentForExercise(@NotNull Exercise exercise, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return isStudentInCourse(exercise.getCourseViaExerciseGroupOrCourseMember(), user) || isAtLeastTeachingAssistantForExercise(exercise, user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isStudentInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getStudentGroupName());
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isEditorInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getEditorGroupName());
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastInstructorInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getInstructorGroupName()) || isAdmin(user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastStudentInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return isStudentInCourse(course, user) || isTeachingAssistantInCourse(course, user) || isEditorInCourse(course, user) || isInstructorInCourse(course, user)
                || isAdmin(user);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastEditorInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return isEditorInCourse(course, user) || isInstructorInCourse(course, user) || isAdmin(user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
    private User loadUserIfNeeded(@Nullable User user) {
        if (user == null) {
            user = userRepository.getUserWithGroupsAndAuthorities();
        }
        else if (user.getGroups() == null || !Hibernate.isInitialized(user.getGroups())) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
        }
        else if (user.getGroups() == null || !Hibernate.isInitialized(user.getGroups())) {
            user = userRepository.getUserWithGroupsAndAuthorities(user.getLogin());
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isOnlyStudentInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getStudentGroupName()) && !isAtLeastTeachingAssistantInCourse(course, user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isTeachingAssistantInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getTeachingAssistantGroupName());
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isOwnerOfParticipation(@NotNull StudentParticipation participation, @Nullable User user) {
        user = loadUserIfNeeded(user);
        if (participation.getParticipant() == null) {
            return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAllowedToSeeExercise(@NotNull Exercise exercise, @Nullable User user) {
        user = loadUserIfNeeded(user);
        if (isAdmin(user)) {
            return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isInstructorInCourse(@NotNull Course course, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return user.getGroups().contains(course.getInstructorGroupName());
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAtLeastTeachingAssistantForExercise(@NotNull Exercise exercise, @Nullable User user) {
        user = loadUserIfNeeded(user);
        return isAtLeastTeachingAssistantInCourse(exercise.getCourseViaExerciseGroupOrCourseMember(), user);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `user`
in `src/main/java/de/tum/in/www1/artemis/service/AuthorizationCheckService.java`
#### Snippet
```java
     */
    public boolean isAllowedToSeeLectureUnit(@NotNull LectureUnit lectureUnit, @Nullable User user) {
        user = loadUserIfNeeded(user);
        if (isAdmin(user)) {
            return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `textSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
        // remove result from submission (in the unlikely case it is passed here), so that students cannot inject a result
        textSubmission.setResults(new ArrayList<>());
        textSubmission = textSubmissionRepository.save(textSubmission);

        // versioning of submission
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `textSubmission`
in `src/main/java/de/tum/in/www1/artemis/service/TextSubmissionService.java`
#### Snippet
```java
            textSubmission.setSubmitted(true);
        }
        textSubmission = save(textSubmission, participation, exercise, user);
        return textSubmission;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        if (useGradedParticipation && optionalGradedStudentParticipation.isPresent()
                && optionalGradedStudentParticipation.get() instanceof ProgrammingExerciseStudentParticipation programmingExerciseStudentParticipation) {
            participation = copyRepository(exercise, programmingExerciseStudentParticipation.getVcsRepositoryUrl(), participation);
        }
        else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        }
        else {
            participation = copyRepository(exercise, exercise.getVcsTemplateRepositoryUrl(), participation);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private StudentParticipation startProgrammingParticipation(ProgrammingExercise exercise, ProgrammingExerciseStudentParticipation participation, boolean setInitializationDate) {
        // Step 1b) configure the student repository (e.g. access right, etc.)
        participation = configureRepository(exercise, participation);
        // Step 2a) create the build plan (based on the BASE build plan)
        participation = copyBuildPlan(participation);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        participation = configureRepository(exercise, participation);
        // Step 2a) create the build plan (based on the BASE build plan)
        participation = copyBuildPlan(participation);
        // Step 2b) configure the build plan (e.g. access right, hooks, etc.)
        participation = configureBuildPlan(participation);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        participation = copyBuildPlan(participation);
        // Step 2b) configure the build plan (e.g. access right, hooks, etc.)
        participation = configureBuildPlan(participation);
        // Step 2c) we might need to perform an empty commit (as a workaround, depending on the CI system) here, because it should not trigger a new programming submission
        // (when the web hook was already initialized, see below)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // Note: we configure the repository webhook last, so that the potential empty commit does not trigger a new programming submission (see empty-commit-necessary)
        // Step 3) configure the web hook of the student repository
        participation = configureRepositoryWebHook(participation);
        // Step 4a) Set the InitializationState to initialized to indicate, the programming exercise is ready
        participation.setInitializationState(INITIALIZED);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        // this method assumes that the student git repository already exists (compare startProgrammingExercise) so steps 1, 2 and 5 are not necessary
        // Step 2a) create the build plan (based on the BASE build plan)
        participation = copyBuildPlan(participation);
        // Step 2b) configure the build plan (e.g. access right, hooks, etc.)
        participation = configureBuildPlan(participation);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
        participation = copyBuildPlan(participation);
        // Step 2b) configure the build plan (e.g. access right, hooks, etc.)
        participation = configureBuildPlan(participation);
        // Note: the repository webhook (step 1c) already exists, so we don't need to set it up again, the empty commit hook (step 2c) is also not necessary here
        // and must be handled by the calling method in case it would be necessary
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
            participation.setInitializationState(INITIALIZED);
        }
        participation = programmingExerciseStudentParticipationRepository.saveAndFlush(participation);
        if (participation.getInitializationDate() == null) {
            // only set the date if it was not set before (which should NOT be the case)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `participation`
in `src/main/java/de/tum/in/www1/artemis/service/ParticipationService.java`
#### Snippet
```java
    private StudentParticipation startProgrammingExercise(ProgrammingExercise exercise, ProgrammingExerciseStudentParticipation participation, boolean setInitializationDate) {
        // Step 1a) create the student repository (based on the template repository)
        participation = copyRepository(exercise, exercise.getVcsTemplateRepositoryUrl(), participation);

        return startProgrammingParticipation(exercise, participation, setInitializationDate);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `password`
in `src/main/java/de/tum/in/www1/artemis/service/user/UserCreationService.java`
#### Snippet
```java
            // Set random password for null passwords
            if (password == null) {
                password = RandomUtil.generatePassword();
            }
            String passwordHash = passwordService.hashPassword(password);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newFilePath`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
                Path target = targetFile.toPath();
                Files.move(source, target, REPLACE_EXISTING);
                newFilePath = publicPathForActualPath(target.toString(), entityId);
                log.debug("Moved File from {} to {}", source, target);
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sourceRepositoryName`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractVersionControlService.java`
#### Snippet
```java
    public VcsRepositoryUrl copyRepository(String sourceProjectKey, String sourceRepositoryName, String sourceBranch, String targetProjectKey, String targetRepositoryName)
            throws VersionControlException {
        sourceRepositoryName = sourceRepositoryName.toLowerCase();
        targetRepositoryName = targetRepositoryName.toLowerCase();
        final String targetRepoSlug = targetProjectKey.toLowerCase() + "-" + targetRepositoryName;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `targetRepositoryName`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/AbstractVersionControlService.java`
#### Snippet
```java
            throws VersionControlException {
        sourceRepositoryName = sourceRepositoryName.toLowerCase();
        targetRepositoryName = targetRepositoryName.toLowerCase();
        final String targetRepoSlug = targetProjectKey.toLowerCase() + "-" + targetRepositoryName;
        // get the remote url of the source repo
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `optionalTriggeredByRepositories`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/BitbucketBambooUpdateService.java`
#### Snippet
```java
            // previous exercise
            if (optionalTriggeredByRepositories.isPresent() && bambooRepository.getName().equals(OLD_ASSIGNMENT_REPO_NAME)) {
                optionalTriggeredByRepositories = Optional
                        .of(optionalTriggeredByRepositories.get().stream().map(trigger -> trigger.replace(Constants.ASSIGNMENT_REPO_NAME, OLD_ASSIGNMENT_REPO_NAME)).toList());
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newRepoUrl`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
     */
    public void updateBuildPlanRepositories(String buildProjectKey, String buildPlanKey, String newRepoUrl, String existingRepoUrl) {
        newRepoUrl = jenkinsInternalUrlService.toInternalVcsUrl(newRepoUrl);
        existingRepoUrl = jenkinsInternalUrlService.toInternalVcsUrl(existingRepoUrl);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `existingRepoUrl`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsBuildPlanService.java`
#### Snippet
```java
    public void updateBuildPlanRepositories(String buildProjectKey, String buildPlanKey, String newRepoUrl, String existingRepoUrl) {
        newRepoUrl = jenkinsInternalUrlService.toInternalVcsUrl(newRepoUrl);
        existingRepoUrl = jenkinsInternalUrlService.toInternalVcsUrl(existingRepoUrl);

        // remove potential username from repo URL. Jenkins uses the Artemis Admin user and will fail if other usernames are in the URL
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            Matcher matcher = pattern.matcher(html);
            if (matcher.find()) {
                url = matcher.group(1);
                // Recursively walk through the responses until we get the actual artifact.
                return retrieveArtifactPage(serverUrl + url);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `commitHash`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingSubmissionService.java`
#### Snippet
```java
            ProgrammingExercise programmingExercise = programmingExerciseRepository.findByIdWithTemplateAndSolutionParticipationElseThrow(programmingExerciseId);
            try {
                commitHash = gitService.getLastCommitHash(programmingExercise.getVcsTestRepositoryUrl()).getName();
            }
            catch (EntityNotFoundException ex) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `programmingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

        // Save programming exercise to prevent transient exception
        programmingExercise = programmingExerciseRepository.save(programmingExercise);

        setupBuildPlansForNewExercise(programmingExercise);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `programmingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java

        // save to get the id required for the webhook
        programmingExercise = programmingExerciseRepository.saveAndFlush(programmingExercise);

        programmingExerciseTaskService.updateTasksFromProblemStatement(programmingExercise);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `result`
in `src/main/java/de/tum/in/www1/artemis/repository/ResultRepository.java`
#### Snippet
```java
        // Workaround to prevent the assessor turning into a proxy object after saving
        var assessor = result.getAssessor();
        result = save(result);
        result.setAssessor(assessor);
        return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `result`
in `src/main/java/de/tum/in/www1/artemis/repository/plagiarism/PlagiarismResultRepository.java`
#### Snippet
```java
    default PlagiarismResult<?> savePlagiarismResultAndRemovePrevious(PlagiarismResult<?> result) {
        Optional<PlagiarismResult<?>> optionalPreviousResult = findFirstByExerciseIdOrderByLastModifiedDateDesc(result.getExercise().getId());
        result = save(result);
        optionalPreviousResult.ifPresent(this::delete);
        return result;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
            // session is closed, cannot return any response
            log.info("Session closed SockJsMessageDeliveryException occurred: {}", e.getMessage());
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
    public ResponseEntity<Problem> process(@Nullable ResponseEntity<Problem> entity, @NotNull NativeWebRequest request) {
        if (entity == null) {
            return null;
        }
        Problem problem = entity.getBody();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/web/rest/errors/ExceptionTranslator.java`
#### Snippet
```java
            log.info("Broken pipe IOException occurred: {}", e.getMessage());
            // socket is closed, cannot return any response
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/web/rest/ParticipationResource.java`
#### Snippet
```java
                log.error("Participation in quiz {} not found for user {}", quizExercise.getTitle(), username);
                // TODO properly handle this case
                return null;
            }
            StudentParticipation participation = optionalParticipation.get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/web/websocket/team/ParticipationTeamWebsocketService.java`
#### Snippet
```java
        Pattern pattern = Pattern.compile("^" + getDestination("(\\d*)"));
        Matcher matcher = pattern.matcher(destination);
        return matcher.find() ? Long.parseLong(matcher.group(1)) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/config/LiquibaseConfiguration.java`
#### Snippet
```java
                return result.getString("latest_version");
            }
            return null;
        }
        catch (SQLException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/config/LiquibaseConfiguration.java`
#### Snippet
```java
            log.info(e.getMessage());
            // if no changelog or no version cane be found, it means it is not yet available, we do not need to throw an exception
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/config/audit/AuditEventConverter.java`
#### Snippet
```java
    public AuditEvent convertToAuditEvent(PersistentAuditEvent persistentAuditEvent) {
        if (persistentAuditEvent == null) {
            return null;
        }
        return new AuditEvent(persistentAuditEvent.getAuditEventDate(), persistentAuditEvent.getPrincipal(), persistentAuditEvent.getAuditEventType(),
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/AuxiliaryRepository.java`
#### Snippet
```java
        String repositoryUrl = getRepositoryUrl();
        if (repositoryUrl == null || repositoryUrl.isEmpty()) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/AuxiliaryRepository.java`
#### Snippet
```java
            log.error("Malformed URI {} could not be used to instantiate VcsRepositoryUrl.", getRepositoryUrl(), e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/config/websocket/WebsocketConfiguration.java`
#### Snippet
```java
            return new ReactorNettyTcpClient<>(client -> client.remoteAddress(addressIterator::next), new StompReactorNettyCodec());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Submission.java`
#### Snippet
```java
    public Long getDurationInMinutes() {
        if (this.participation == null || this.participation.getInitializationDate() == null || this.submissionDate == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/TextCluster.java`
#### Snippet
```java
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalRelation.java`
#### Snippet
```java
        public RelationType convertToEntityAttribute(String value) {
            if (value == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalRelation.java`
#### Snippet
```java
        public String convertToDatabaseColumn(RelationType type) {
            if (type == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ComplaintResponse.java`
#### Snippet
```java
    public ZonedDateTime lockEndDate() {
        if (getCreatedDate() == null) {
            return null;
        }
        ZonedDateTime createdDateInUTC = ZonedDateTime.ofInstant(getCreatedDate(), ZoneOffset.UTC);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalTaxonomy.java`
#### Snippet
```java
        public String convertToDatabaseColumn(LearningGoalTaxonomy taxonomy) {
            if (taxonomy == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/LearningGoalTaxonomy.java`
#### Snippet
```java
        public LearningGoalTaxonomy convertToEntityAttribute(String value) {
            if (value == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/GradeStep.java`
#### Snippet
```java
            log.debug("getNumericValue failed for: " + this.gradeName, e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/ExamSession.java`
#### Snippet
```java

    public IPAddress getIpAddress() {
        return ipAddress != null ? new IPAddressString(ipAddress).getAddress() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Feedback.java`
#### Snippet
```java
    public String getReferenceElementId() {
        if (reference == null || !reference.contains(":")) {
            return null;
        }
        return reference.split(":")[1];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Feedback.java`
#### Snippet
```java
    public String getReferenceElementType() {
        if (!reference.contains(":")) {
            return null;
        }
        return reference.split(":")[0];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
    public Result findLatestResultWithCompletionDate(Participation participation) {
        if (participation.getResults() == null) {
            return null;
        }
        Optional<Result> latestResult = participation.getResults().stream().filter(result -> result.getCompletionDate() != null).max((result1, result2) -> {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
            return this.getExerciseGroup().getExam();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
                // this is an edge case that is treated differently: the student has not submitted before the due date and the client would otherwise think
                // that there is no result for the submission and would display a red trigger button.
                return null;
            }
            if (submissionsWithUnratedResult.size() == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Exercise.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/Exam.java`
#### Snippet
```java
    public Boolean isVisibleToStudents() {
        if (visibleDate == null) {  // no visible date means the exam is configured wrongly and should not be visible!
            return null;
        }
        return visibleDate.isBefore(ZonedDateTime.now());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/Exam.java`
#### Snippet
```java
    public Boolean isStarted() {
        if (startDate == null) {   // no start date means the exam is configured wrongly and we cannot answer the question!
            return null;
        }
        return startDate.isBefore(ZonedDateTime.now());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/StudentExam.java`
#### Snippet
```java
        if (exam.isTestExam()) {
            if (this.startedDate == null) {
                return null;
            }
            return this.startedDate.plusSeconds(workingTime);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/StudentExam.java`
#### Snippet
```java
        if (exam.isTestExam()) {
            if (this.startedDate == null) {
                return null;
            }
            return this.startedDate.plusSeconds(workingTime + gracePeriodInSeconds);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/exam/StudentExam.java`
#### Snippet
```java
    public Boolean isEnded() {
        if (this.getExam() == null || this.getExam().getStartDate() == null || this.getWorkingTime() == null) {
            return null;
        }
        if (Boolean.TRUE.equals(testRun)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/Course.java`
#### Snippet
```java

    public OnlineCourseConfiguration getOnlineCourseConfiguration() {
        return Hibernate.isInitialized(onlineCourseConfiguration) ? onlineCourseConfiguration : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/MultipleChoiceQuestion.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizBatch.java`
#### Snippet
```java
        return isStarted()
                ? getQuizExercise() == null ? 0 : ChronoUnit.SECONDS.between(ZonedDateTime.now(), ChronoUnit.SECONDS.addTo(getStartTime(), getQuizExercise().getDuration()))
                : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            return templateParticipation.getBuildPlanId();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            return solutionParticipation.getBuildPlanId();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
        var solutionRepositoryUrl = getSolutionRepositoryUrl();
        if (solutionRepositoryUrl == null || solutionRepositoryUrl.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
        var templateRepositoryUrl = getTemplateRepositoryUrl();
        if (templateRepositoryUrl == null || templateRepositoryUrl.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            return templateParticipation.getRepositoryUrl();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            return solutionParticipation.getRepositoryUrl();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
    public VcsRepositoryUrl getVcsTestRepositoryUrl() {
        if (testRepositoryUrl == null || testRepositoryUrl.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/ProgrammingExercise.java`
#### Snippet
```java
            log.warn("Cannot create URI for testRepositoryUrl: {} due to the following error: {}", testRepositoryUrl, e.getMessage());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/ShortAnswerSubmittedAnswer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/DragAndDropSubmittedAnswer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizSubmission.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/ShortAnswerQuestion.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/ShortAnswerQuestion.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/DragAndDropQuestion.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/DragAndDropQuestion.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/lecture/AttachmentUnit.java`
#### Snippet
```java
    @Override
    public ZonedDateTime getReleaseDate() {
        return attachment == null ? null : attachment.getReleaseDate();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/lecture/AttachmentUnit.java`
#### Snippet
```java
    @Override
    public String getName() {
        return attachment == null ? null : attachment.getName();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/lecture/ExerciseUnit.java`
#### Snippet
```java
    @Override
    public ZonedDateTime getReleaseDate() {
        return exercise == null ? null : exercise.getReleaseDate();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/lecture/ExerciseUnit.java`
#### Snippet
```java
    @Override
    public String getName() {
        return exercise == null ? null : exercise.getTitle();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/metis/Post.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizExercise.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizExercise.java`
#### Snippet
```java
        if (shouldFilterForStudents()) {
            // results are never relevant before quiz has ended => return null
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/quiz/QuizExercise.java`
#### Snippet
```java
            return getOverallQuizPoints();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/statistics/BuildLogStatisticsEntry.java`
#### Snippet
```java
        public Integer durationInSeconds() {
            if (from == null || to == null) {
                return null;
            }
            else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/participation/ProgrammingExerciseStudentParticipation.java`
#### Snippet
```java
        }
        else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/participation/ProgrammingExerciseParticipation.java`
#### Snippet
```java
        var repoUrl = getRepositoryUrl();
        if (repoUrl == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/domain/participation/ProgrammingExerciseParticipation.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/LectureImportService.java`
#### Snippet
```java
            // TODO: Import exercises and link them to the exerciseUnit
            // We have a dedicated exercise import system, so this is left out for now
            return null;
        }
        return null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/LectureImportService.java`
#### Snippet
```java
            return null;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/WebsocketMessagingService.java`
#### Snippet
```java
        Pattern pattern = Pattern.compile("^" + getNonPersonalExerciseResultDestination("(\\d*)"));
        Matcher matcher = pattern.matcher(destination);
        return matcher.find() ? Long.parseLong(matcher.group(1)) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/AutomaticTextFeedbackService.java`
#### Snippet
```java
            }

            return null;
        }).filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/OnlineCourseConfigurationService.java`
#### Snippet
```java
    public ClientRegistration getClientRegistration(OnlineCourseConfiguration onlineCourseConfiguration) {
        if (onlineCourseConfiguration == null) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/OnlineCourseConfigurationService.java`
#### Snippet
```java
        catch (IllegalArgumentException e) {
            log.error("Could not build Client Registration from onlineCourseConfiguration");
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/CourseScoreCalculationService.java`
#### Snippet
```java
    Result getResultForParticipation(Participation participation, ZonedDateTime dueDate) {
        if (participation == null) {
            return null;
        }
        var resultsSet = participation.getResults();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/CourseScoreCalculationService.java`
#### Snippet
```java
    private PlagiarismVerdict findMostServerePlagiarismVerdict(Collection<PlagiarismCase> plagiarismCasesForSingleStudent) {
        if (plagiarismCasesForSingleStudent.isEmpty()) {
            return null;
        }
        var studentVerdictsFromExercises = plagiarismCasesForSingleStudent.stream().map(PlagiarismCase::getVerdict).toList();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/CourseScoreCalculationService.java`
#### Snippet
```java
        Set<Exercise> courseExercises = exerciseRepository.findAllExercisesByCourseId(courseId);
        if (courseExercises.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamDateService.java`
#### Snippet
```java
    public Set<ZonedDateTime> getAllIndividualExamEndDates(Exam exam) {
        if (exam.getStartDate() == null) {
            return null;
        }
        var workingTimes = studentExamRepository.findAllDistinctWorkingTimesByExamId(exam.getId());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamDateService.java`
#### Snippet
```java
        ZonedDateTime latestEndDate = getLatestIndividualExamEndDate(exam);
        if (latestEndDate == null) {
            return null;
        }
        int gracePeriodInSeconds = Objects.requireNonNullElse(exam.getGracePeriod(), 0);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/FileService.java`
#### Snippet
```java
        }
        else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/metis/ReactionService.java`
#### Snippet
```java
        }
        else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/metis/MessageService.java`
#### Snippet
```java

        // conversation object must be provided in all cases. we do not throw an exception here in order to not leak implementation details
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
        var reports = programmingExerciseGitDiffReportRepository.findByProgrammingExerciseId(programmingExercise.getId());
        if (reports.isEmpty()) {
            return null;
        }
        else if (reports.size() == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
            // Check if the filePath is /dev/null (which means the file was deleted) and instead return null
            if (DiffEntry.DEV_NULL.equals(filePath)) {
                return null;
            }
            // Git diff usually puts the two repos into the subfolders 'a' and 'b' for comparison, which we filter out here
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
            // Check if the filePath is /dev/null (which means the file was deleted) and instead return null
            if (DiffEntry.DEV_NULL.equals(filePath)) {
                return null;
            }
            // Git diff usually puts the two repos into the subfolders 'a' and 'b' for comparison, which we filter out here
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
        var solutionParticipationOptional = solutionProgrammingExerciseParticipationRepository.findByProgrammingExerciseId(programmingExercise.getId());
        if (templateParticipationOptional.isEmpty() || solutionParticipationOptional.isEmpty()) {
            return null;
        }
        var templateParticipation = templateParticipationOptional.get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/ProgrammingExerciseGitDiffReportService.java`
#### Snippet
```java
        var solutionSubmissionOptional = programmingSubmissionRepository.findFirstByParticipationIdOrderBySubmissionDateDesc(solutionParticipation.getId());
        if (templateSubmissionOptional.isEmpty() || solutionSubmissionOptional.isEmpty()) {
            return null;
        }
        var templateSubmission = templateSubmissionOptional.get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/AddUncoveredLinesAsPotentialCodeBlocks.java`
#### Snippet
```java
        }
        if (potentialLines.isEmpty()) {
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/behavioral/knowledgesource/AddUncoveredLinesAsPotentialCodeBlocks.java`
#### Snippet
```java
        }
        if (potentialLines.isEmpty()) {
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralAttribute.java`
#### Snippet
```java

    private JavaField getSolutionAttribute(JavaClass solutionClass) {
        return solutionClass == null ? null : solutionClass.getFields().stream().filter(field -> field.getName().equals(this.getName())).findFirst().orElse(null);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralConstructor.java`
#### Snippet
```java
    private JavaConstructor getSolutionConstructor(JavaClass solutionClass) {
        if (solutionClass == null) {
            return null;
        }
        return solutionClass.getConstructors().stream()
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/hestia/structural/StructuralMethod.java`
#### Snippet
```java
    private JavaMethod getSolutionMethod(JavaClass solutionClass) {
        if (solutionClass == null) {
            return null;
        }
        return solutionClass.getMethods().stream().filter(javaMethod -> javaMethod.getName().equals(this.getName())).filter(javaMethod -> {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/CompassService.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/CompassService.java`
#### Snippet
```java
            // this can happen for empty submissions in exams
            if (elements == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/CompassService.java`
#### Snippet
```java
            }
            if (feedbacksForSuggestion.isEmpty()) {
                return null;
            }
            result.getFeedbacks().clear(); // Note, that a result is always initialized with an empty list -> no NPE here
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/object/UMLObjectDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
            if (sourceGradingScale.getCourse() != null) {
                CourseScoresDTO courseScores = courseScoreCalculationService.calculateCourseScores(sourceGradingScale.getCourse().getId(), studentIds);
                return courseScores != null ? courseScores.toBonusSourceResultMap() : null;
            }
            else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/exam/ExamService.java`
#### Snippet
```java
        catch (AccessForbiddenException e) {
            // The current user does not have access to the bonus exam or course, so they should see the grade without bonus.
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/usecase/UMLUseCaseDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/activity/UMLActivityDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/petrinet/PetriNet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/component/UMLComponentDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/syntaxtree/SyntaxTree.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClassDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/deployment/UMLDeploymentDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/flowchart/Flowchart.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/communication/UMLCommunicationDiagram.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/umlmodel/classdiagram/UMLClass.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/FeedbackSelector.java`
#### Snippet
```java
    public static Feedback selectFeedback(ModelElement modelElement, List<Feedback> feedbackList, Result result) {
        if (feedbackList == null || feedbackList.isEmpty()) {
            return null;
        }
        // counts the amount of feedback elements that have the same credits assigned, i.e. maps "credits -> amount" for every unique credit number
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/FeedbackSelector.java`
#### Snippet
```java

        if (confidence < CompassConfiguration.ELEMENT_CONFIDENCE_THRESHOLD) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/compass/controller/ModelClusterFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/EmptyQuizExerciseCache.java`
#### Snippet
```java
    @Override
    QuizExercise getExercise() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ParticipantScoreSchedulerService.java`
#### Snippet
```java
                }
                else {
                    return null;
                }
            });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/BitbucketBambooUpdateService.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/Lti13Service.java`
#### Snippet
```java
    private String getScoresUrl(String lineItemUrl) {
        if (StringUtils.isEmpty(lineItemUrl)) {
            return null;
        }
        StringBuilder builder = new StringBuilder(lineItemUrl);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/Lti10Service.java`
#### Snippet
```java
        // this is the success case
        log.info("LTI Oauth Request Verification successful");
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/dto/BambooRepositoryDTO.java`
#### Snippet
```java

    public String getIdString() {
        return this.id == null ? null : Long.toString(this.id);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
        if (optionalUser.isPresent() && optionalUser.get().isInternal()) {
            // User found but is internal. Skip external authentication.
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jira/JiraAuthenticationProvider.java`
#### Snippet
```java
            return new UsernamePasswordAuthenticationToken(user.getLogin(), user.getPassword(), user.getGrantedAuthorities());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/apollon/ApollonConversionService.java`
#### Snippet
```java
            log.error(ex.getMessage());
        }
        return null;

    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
        // Empty Git repos don't have HEAD
        if (originHeadRef == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                }
                else {
                    return null;
                }
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
    public ObjectId getLastCommitHash(VcsRepositoryUrl repoUrl) throws EntityNotFoundException {
        if (repoUrl == null || repoUrl.getURI() == null) {
            return null;
        }
        // Get HEAD ref of repo without cloning it locally
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java

            if (headRef == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                // In this case we should remove the repository if cached, because it can't exist anymore.
                cachedRepositories.remove(localPath);
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
        catch (IOException | InvalidRefNameException ex) {
            log.warn("Cannot get existing checkout out repository by local path: {}", ex.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
                    @Override
                    public String getValue(String key) {
                        return null;
                    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
            if (job == null) {
                // means the project does not exist
                return null;
            }
            else if (job.getUrl() == null || job.getUrl().isEmpty()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
            }
            else if (job.getUrl() == null || job.getUrl().isEmpty()) {
                return null;
            }
            else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
    public ResponseEntity<byte[]> retrieveLatestArtifact(ProgrammingExerciseParticipation participation) {
        // TODO, not necessary for the core functionality
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsService.java`
#### Snippet
```java
        if (participation.getBuildPlanId() == null) {
            // The build plan does not exist, the build status cannot be retrieved
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
    private BambooBuildPlanDTO getBuildPlan(String planKey, boolean expand, boolean logNotFound) {
        if (planKey == null) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
                    log.error("The build plan {} could not be found", planKey);
                }
                return null;
            }
            log.info(ex.getMessage());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            }
            log.info(ex.getMessage());
            return null;
        }
        catch (Exception ex) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        catch (Exception ex) {
            log.info(ex.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
                }

                return null;
            }
        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
            log.warn("Cannot get the build status, because the build plan for the participation {} was cleaned up already!", participation);
            // The build plan does not exist, the build status cannot be retrieved
            return null;
        }
        final var buildPlan = getBuildPlan(participation.getBuildPlanId(), false, true);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bamboo/BambooService.java`
#### Snippet
```java
        // Filter the first build plan in case it was automatically executed when the build plan was created.
        if (isFirstBuildForThisPlan(buildResult)) {
            return null;
        }
        return buildResult;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
    public QuizExercise getQuizExercise(Long quizExerciseId) {
        if (quizExerciseId == null) {
            return null;
        }
        QuizExercise quizExercise = ((QuizExerciseCache) quizCache.getReadCacheFor(quizExerciseId)).getExercise();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/quiz/QuizScheduleService.java`
#### Snippet
```java
    public QuizSubmission getQuizSubmission(Long quizExerciseId, String username) {
        if (quizExerciseId == null || username == null) {
            return null;
        }
        QuizSubmission quizSubmission = ((QuizExerciseCache) quizCache.getReadCacheFor(quizExerciseId)).getSubmissions().get(username);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/gitlab/GitLabUserManagementService.java`
#### Snippet
```java
            // in case the user does not exist in Gitlab, we cannot update it
            log.warn("User {} does not exist in Gitlab and cannot be updated!", userLogin);
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
        var job = jenkinsServer.getJob(folderName);
        if (job == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
        if (folderJobName == null || jobName == null) {
            log.warn("Cannot get the job, because projectKey {} or jobName {} is null", folderJobName, jobName);
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
        if (folder == null) {
            log.warn("Cannot get the job {} in folder {} because it doesn't exist.", jobName, folderJobName);
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
            final var job = jenkinsServer.getJob(folderName);
            if (job == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
            final var folderJob = jenkinsServer.getFolderJob(job);
            if (!folderJob.isPresent()) {
                return null;
            }
            return folderJob.get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/jobs/JenkinsJobService.java`
#### Snippet
```java
    public Document getFolderConfig(String folderName) throws IOException {
        if (jenkinsServer.getJob(folderName) == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/jenkins/JenkinsUserManagementService.java`
#### Snippet
```java
        catch (HttpClientErrorException e) {
            if (e.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/dto/BitbucketRepositoryDTO.java`
#### Snippet
```java
    public String getCloneSshUrl() {
        if (this.links == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/connectors/bitbucket/dto/BitbucketRepositoryDTO.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/PlagiarismCaseService.java`
#### Snippet
```java
        public PlagiarismCase getPlagiarismCase(Long studentId, Long exerciseId) {
            var innerMap = studentIdToExerciseIdToPlagiarismCaseMap.get(studentId);
            return innerMap != null ? innerMap.get(exerciseId) : null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/plagiarism/ProgrammingPlagiarismDetectionService.java`
#### Snippet
```java
        if (!reportFolderFile.mkdirs()) {
            log.error("Cannot generate JPlag report because directories couldn't be created: {}", reportFolder);
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
            @Override
            public String getName() {
                return null;
            }
        };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
    private static String extractPrincipal(Authentication authentication) {
        if (authentication == null) {
            return null;
        }
        else if (authentication.getPrincipal() instanceof UserDetails springSecurityUser) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
            return (String) authentication.getPrincipal();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
            @Override
            public Object getDetails() {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/SecurityUtils.java`
#### Snippet
```java
            @Override
            public Object getCredentials() {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/jwt/JWTFilter.java`
#### Snippet
```java
            return jwt;
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/jwt/TokenProvider.java`
#### Snippet
```java
        if (authorityClaim == null) {
            // leads to a 401 unauthorized error
            return null;
        }
        List<? extends GrantedAuthority> authorities = Arrays.stream(authorityClaim.toString().split(",")).map(SimpleGrantedAuthority::new).toList();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13TokenRetriever.java`
#### Snippet
```java
        catch (JOSEException e) {
            log.error("Could not create keypair for clientRegistrationId {}", clientRegistration.getRegistrationId());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13TokenRetriever.java`
#### Snippet
```java
        SignedJWT signedJWT = createJWT(clientRegistration);
        if (signedJWT == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13TokenRetriever.java`
#### Snippet
```java
            ResponseEntity<String> exchange = restTemplate.exchange(requestEntity, String.class);
            if (exchange.getBody() == null) {
                return null;
            }
            return JsonParser.parseString(exchange.getBody()).getAsJsonObject().get("access_token").getAsString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/security/lti/Lti13TokenRetriever.java`
#### Snippet
```java
        catch (HttpClientErrorException e) {
            log.error("Could not retrieve access token for client {}: {}", clientRegistration.getClientId(), e.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/ResultRepository.java`
#### Snippet
```java
            return correctionRoundsDataStats;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
        if (participation.getVcsRepositoryUrl() == null) {
            log.warn("Ignore participation {} for export, because its repository URL is null", participation.getId());
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            if (repository == null) {
                log.warn("Cannot checkout repository for participation id: {}", participation.getId());
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            log.error("Failed to create zip for participation id {} with exercise id {} because of the following exception ", participation.getId(),
                    participation.getProgrammingExercise().getId(), ex);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
                log.info(info);
                exportErrors.add(info);
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            log.info(error);
            exportErrors.add(error);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
        if (pathsToZippedRepos.isEmpty()) {
            log.warn("The zip file could not be created. Ignoring the request to export repositories for exercise {}", programmingExercise.getTitle());
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
            log.info(error);
            exportErrors.add(error);
            return null;
        }
        finally {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseExportService.java`
#### Snippet
```java
        catch (IOException ex) {
            log.error("Creating zip file for programming exercise {} did not work correctly: {} ", programmingExercise.getTitle(), ex.getMessage());
            return null;
        }
        finally {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
            return getAllUsersMatchingAuthorities(authorities);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
    public static Specification<User> getWithOrWithoutRegistrationNumberSpecification(Boolean noRegistrationNumber, Boolean withRegistrationNumber) {
        if (!noRegistrationNumber && !withRegistrationNumber) {
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
    public static Specification<User> getInternalOrExternalSpecification(boolean internal, boolean external) {
        if (!internal && !external) {
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
    public static Specification<User> getActivatedOrDeactivatedSpecification(boolean activated, boolean deactivated) {
        if (!activated && !deactivated) {
            return null;
        }
        else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/de/tum/in/www1/artemis/repository/specs/UserSpecs.java`
#### Snippet
```java
            return getAllUsersMatchingCourses(courseIds);
        }
        return null;
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `learningGoal`
in `src/main/java/de/tum/in/www1/artemis/service/LectureService.java`
#### Snippet
```java
        var learningGoals = lectureUnits.stream().flatMap(lectureUnit -> lectureUnit.getLearningGoals().stream()).collect(Collectors.toSet());
        learningGoalRepository.saveAll(learningGoals.stream().map(learningGoal -> {
            learningGoal = learningGoalRepository.findByIdWithLectureUnitsElseThrow(learningGoal.getId());
            lectureUnits.forEach(learningGoal.getLectureUnits()::remove);
            return learningGoal;
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `feedback`
in `src/main/java/de/tum/in/www1/artemis/service/ResultService.java`
#### Snippet
```java
            feedback.setResult(null);
            // persist the child object without an association to the parent object.
            feedback = feedbackRepository.saveAndFlush(feedback);
            // restore the association to the parent object
            feedback.setResult(result);
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `learningGoal`
in `src/main/java/de/tum/in/www1/artemis/service/LectureUnitService.java`
#### Snippet
```java
            Set<LearningGoal> learningGoals = lectureUnitToDelete.getLearningGoals();
            learningGoalRepository.saveAll(learningGoals.stream().map(learningGoal -> {
                learningGoal = learningGoalRepository.findByIdWithLectureUnitsElseThrow(learningGoal.getId());
                learningGoal.getLectureUnits().remove(lectureUnitToDelete);
                return learningGoal;
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `activity`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/cache/monitoring/ExamMonitoringScheduleService.java`
#### Snippet
```java
            ((ExamMonitoringCache) examCache.getTransientWriteCacheFor(examId)).updateActivity(studentExamId, activity -> {
                if (activity == null) {
                    activity = new ExamActivity();
                    activity.setStudentExamId(studentExamId);
                    // Since we don't store the activity in the database at the moment, we reuse the student exam id
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `programmingExercise`
in `src/main/java/de/tum/in/www1/artemis/service/scheduled/ProgrammingExerciseScheduleService.java`
#### Snippet
```java
                        individualDueDates.add(new Tuple<>(dueDate, participation));
                    }
                    programmingExercise = programmingExerciseRepository.findByIdWithTemplateAndSolutionParticipationElseThrow(programmingExercise.getId());
                    programmingExerciseParticipationService.unlockStudentRepository(programmingExercise, participation);
                };
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `repository`
in `src/main/java/de/tum/in/www1/artemis/service/programming/ProgrammingExerciseService.java`
#### Snippet
```java
            // a sorted collection (list).
            repository.setExercise(null);
            repository = auxiliaryRepositoryRepository.save(repository);
            repository.setExercise(exercise);
            savedRepositories.add(repository);
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/de/tum/in/www1/artemis/service/connectors/GitService.java`
#### Snippet
```java
            log.warn("Clone is already in progress. This will lead to an error. Wait for a second");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
```

## RuleId[ruleID=CopyConstructorMissesField]
### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'exercise'
in `src/main/java/de/tum/in/www1/artemis/domain/Team.java`
#### Snippet
```java
     * @param team Team which to copy
     */
    public Team(@NotNull Team team) {
        this.name = team.name;
        this.shortName = team.shortName;
```

## RuleId[ruleID=ClassCanBeRecord]
### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `src/main/java/de/tum/in/www1/artemis/domain/StaticCodeAnalysisDefaultCategory.java`
#### Snippet
```java
    }

    public static class CategoryMapping {

        private final StaticCodeAnalysisTool tool;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `src/main/java/de/tum/in/www1/artemis/domain/StaticCodeAnalysisDefaultCategory.java`
#### Snippet
```java
 * Read-only POJO for storing static code analysis configurations initialized at start-up of Artemis
 */
public class StaticCodeAnalysisDefaultCategory {

    private final String name;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `src/main/java/de/tum/in/www1/artemis/service/dto/TextFeedbackConflictRequestDTO.java`
#### Snippet
```java
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TextFeedbackConflictRequestDTO {

    private final String textBlockId;
```

## RuleId[ruleID=UnusedSymbol]
### RuleId[ruleID=UnusedSymbol]
Function "createIntegerArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
object Client {

    fun createIntegerArray(size: Int = 30): Array<Int> {
        return Array(size) { Random.nextInt(0, 100) }
    }
```

### RuleId[ruleID=UnusedSymbol]
Function "printIntegerArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun printIntegerArray(a: Array<Int>) {
        println(a.joinToString(prefix = "[", postfix = "]"))
    }
```

### RuleId[ruleID=UnusedSymbol]
Function "scrambleArray" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun scrambleArray(array: Array<Int>): Array<Int> {
        return array.toList().shuffled().toTypedArray()
    }
```

### RuleId[ruleID=UnusedSymbol]
Function "simulateRuntimeConfigurationChange" is never used
in `src/main/resources/templates/kotlin/solution/src/${packageNameFolder}/Client.kt`
#### Snippet
```java
    }

    fun simulateRuntimeConfigurationChange(sortPolicy: Policy) {
        if (Random.nextBoolean()) {
            println("Time is important!")
```

