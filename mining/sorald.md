# sorald 
 
# Bad smells
I found 103 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 23 | false |
| SystemOutErr | 16 | false |
| NullableProblems | 7 | false |
| UnnecessaryModifier | 6 | true |
| ThrowablePrintStackTrace | 5 | false |
| RedundantFieldInitialization | 5 | false |
| ReturnNull | 5 | false |
| ConstantValue | 5 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| SizeReplaceableByIsEmpty | 3 | true |
| IgnoreResultOfCall | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| DataFlowIssue | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| UnnecessaryStringEscape | 1 | true |
| StringOperationCanBeSimplified | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| DoubleBraceInitialization | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (event.type()) { case EXEC_START: execStart = System.currentTimeM...` statement on enum type 'sorald.event.EventType' misses cases: 'MINING_START', and 'MINING_END'
in `sorald/src/main/java/sorald/event/collectors/RepairStatisticsCollector.java`
#### Snippet
```java
    @Override
    public void registerEvent(SoraldEvent event) {
        switch (event.type()) {
            case EXEC_START:
                execStart = System.currentTimeMillis();
                break;
            case EXEC_END:
                execEnd = System.currentTimeMillis();
                break;
            case PARSE_START:
                parseStart = System.currentTimeMillis();
                break;
            case PARSE_END:
                assert parseStart != INVALID_TIME;
                long parseEnd = System.currentTimeMillis();
                parseTotal += parseEnd - parseStart;
                parseStart = INVALID_TIME;
                break;
            case REPAIR_START:
                repairStart = System.nanoTime();
                break;
            case REPAIR_END:
                assert repairStart != INVALID_TIME;
                long repairEnd = System.nanoTime();
                repairTotal += repairEnd - repairStart;
                repairStart = INVALID_TIME;
                break;
            case REPAIR:
                addRepair((RepairEvent) event);
                break;
            case CRASH:
                crashes.add(event);
                break;
            case MINED:
                var mined = (MinedViolationEvent) event;

                if (execEnd == INVALID_TIME) {
                    // we have not yet reached end of execution, so this is a before-warning
                    addToEventMap(mined.getRuleKey(), mined, minedViolationsBefore);
                } else {
                    // end of execution has been reached, so this is an after-warning
                    addToEventMap(mined.getRuleKey(), mined, minedViolationsAfter);
                }
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (event.type()) { case MINING_START: miningStartTime = System.curr...` statement on enum type 'sorald.event.EventType' misses cases: 'EXEC_START', 'EXEC_END', 'PARSE_START', ...
in `sorald/src/main/java/sorald/event/collectors/MinerStatisticsCollector.java`
#### Snippet
```java
    @Override
    public void registerEvent(SoraldEvent event) {
        switch (event.type()) {
            case MINING_START:
                miningStartTime = System.currentTimeMillis();
                break;
            case MINING_END:
                miningEndTime = System.currentTimeMillis();
                break;
            case MINED:
                MinedViolationEvent minedViolationEvent = (MinedViolationEvent) event;

                if (!ruleToViolations.containsKey(violationToRuleId(minedViolationEvent)))
                    ruleToViolations.put(violationToRuleId(minedViolationEvent), new ArrayList<>());

                ruleToViolations
                        .get(violationToRuleId(minedViolationEvent))
                        .add(minedViolationEvent.getWarningLocation());
                break;
        }
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/annotations/ProcessorAnnotation.java`
#### Snippet
```java
    public String key();

    public String description();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/annotations/ProcessorAnnotation.java`
#### Snippet
```java
@Target(ElementType.TYPE)
public @interface ProcessorAnnotation {
    public String key();

    public String description();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getAllRules();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRules();

    /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `sorald/src/main/java/sorald/Main.java`
#### Snippet
```java
import sorald.cli.Cli;

public class Main {
    public static void main(String[] args) {
        int exitStatus = Cli.createCli().execute(args);
```

### UtilityClassWithoutPrivateConstructor
Class `StatsOutputAnalyzer` has only 'static' members, and lacks a 'private' constructor
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
import sorald.Constants;

public class StatsOutputAnalyzer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File(Constants.PATH_TO_STATS_OUTPUT));
```

### UtilityClassWithoutPrivateConstructor
Class `CodeGenerator` has only 'static' members, and lacks a 'private' constructor
in `sorald/src/main/java/sorald/CodeGenerator.java`
#### Snippet
```java

/** Wrapper class for all (present and future) code generation in Sorald. */
public class CodeGenerator {

    public static void main(String[] args) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getFirst` may produce `NullPointerException`
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java
                    int index = maxFiles - currentAddedFiles;
                    Pair<Node, Node> splitted = splitFileNode(node, index);
                    segment.add(splitted.getFirst());
                    resources4Repair.addFirst(splitted.getSecond());
                    segments.add(segment);
```

### DataFlowIssue
Dereference of `filesList` may produce `NullPointerException`
in `sorald/src/main/java/sorald/segment/SoraldTreeBuilderAlgorithm.java`
#### Snippet
```java
            File[] filesList = currentDir.listFiles();
            Node fileNode = new Node(node);
            for (File f : filesList) {
                if (f.isDirectory()) {
                    node.getChildren().add(new Node(node, f.getAbsolutePath()));
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `sorald/src/main/java/sorald/sonar/SonarProcessorRepository.java`
#### Snippet
```java
nS1656: Variables should not be self-assigned\nS1854: Unused assignments should be removed\nS1860: Synchronization should not be based on Strings or boxed primitives\nS1948: Fields in a \"Serializable\" class should either be transient or serializable\nS2057: Every class implementing Serializable should declare a static final serialVersionUID.\n\t(incomplete: This processor does not address the case where the class already has a serialVersionUID with a non long type.)\nS2095: Resources should be closed\nS2097: \"equals(Object obj)\" should test argument type\nS2111: \"BigDecimal(double)\" should not be used\nS2116: \"hashCode\" and \"toString\" should not be called on array instances\nS2142: \"InterruptedException\" should not be ignored\nS2164: Math should not be performed on floats\n\t(incomplete: does not cast the operands to double when the expected type of the result is float.)\nS2167: \"compareTo\" should not return \"Integer.MIN_VALUE\"\nS2184: Math operands should be cast before assignment\nS2204: \".equals()\" should not be used to test the values of \"Atomic\" classes\nS2225: \"toString()\" and \"clone()\" methods should not return null\n\t(incomplete: does not fix null returning clone())\nS2272: \"Iterator.next()\" methods should throw \"NoSuchElementException\"\nS2755: XML parsers should not be vulnerable to XXE attacks\n\t(incomplete: This processor is a WIP and currently supports a subset of rule 2755. See Sorald\'s documentation for details.)\nS3032: JEE applications should not \"getClassLoader\"\nS3067: \"getClass\" should not be used for synchronization\nS3984: Exception should not be created without being thrown\nS4065: \"ThreadLocal.withInitial\" should be preferred\nS4973: Strings and Boxed types should be compared using \"equals()\"";

    @Override
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java
                                new IllegalStateException(
                                        getClass().getName() + " does not have a key"))
                .toString();
    }

```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `passedRuleParameters .keySet()` may be replaced with 'Map.forEach()' iteration
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java
            Map<Rule, Map<String, String>> passedRuleParameters) {
        Map<RuleKey, Map<String, String>> parsedRuleParameters = new HashMap<>();
        passedRuleParameters
                .keySet()
                .forEach(
                        rule ->
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`node.getChildren().size() != 0` can be replaced with '!node.getChildren().isEmpty()'
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java
            if (currentAddedFiles + node.getJavaFilesNbs() > maxFiles) {
                // keep splitting dir node if does not fit until not-splittable
                if (node.isDirNode() && node.getChildren().size() != 0) {
                    resources4Repair.addAll(0, node.getChildren());
                } else {
```

### SizeReplaceableByIsEmpty
`fileNode.getJavaFiles().size() != 0` can be replaced with '!fileNode.getJavaFiles().isEmpty()'
in `sorald/src/main/java/sorald/segment/SoraldTreeBuilderAlgorithm.java`
#### Snippet
```java
                }
            }
            if (fileNode.getJavaFiles().size() != 0) {
                node.getChildren().add(fileNode);
            }
```

### SizeReplaceableByIsEmpty
`node.getJavaFiles().size() != 0` can be replaced with '!node.getJavaFiles().isEmpty()'
in `sorald/src/main/java/sorald/segment/SoraldTreeBuilderAlgorithm.java`
#### Snippet
```java
            }
        }
        if (node.getJavaFiles().size() != 0) {
            node.updateJavaFileNbs(node.getJavaFiles().size());
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
    public static List<File> findFilesByExtension(File directory, String ext) throws IOException {
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory.toString() + " is not a directory");
        }
        try (Stream<Path> files = Files.walk(directory.toPath())) {
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `sorald/src/main/java/sorald/processor/XxeProcessingProcessor.java`
#### Snippet
```java

        Set<ModifierKind> modifiers =
                new HashSet<>(Arrays.asList(ModifierKind.PRIVATE, ModifierKind.STATIC));
        CtTypeReference<?> returnType = returnExp.getType().getTypeDeclaration().getReference();
        CtMethod<T> method =
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RepairEvent`
in `sorald/src/main/java/sorald/event/models/repair/RuleRepairStatistics.java`
#### Snippet
```java

    private static List<WarningLocation> toWarningLocations(
            List<RepairEvent> repairEvents, Path projectPath) {
        return repairEvents.stream()
                .map(
```

### BoundedWildcard
Can generalize to `? extends PluginRequirementsCheckResult`
in `sorald/src/main/java/sorald/sonar/SonarLintEngine.java`
#### Snippet
```java

    private static Collection<PluginInfo> getAllPlugins(
            Map<String, PluginRequirementsCheckResult> pluginCheckResultByKeys) {
        return pluginCheckResultByKeys.values().stream()
                .map(PluginRequirementsCheckResult::getPlugin)
```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `sorald/src/main/java/sorald/processor/UnclosedResourcesProcessor.java`
#### Snippet
```java
     */
    private CtBlock<?> moveStatementsToNewBlock(
            List<CtStatement> statements, int firstStatementToMove) {
        var statementsToMove = statements.subList(firstStatementToMove, statements.size());
        CtBlock<?> block = getFactory().createBlock();
```

### BoundedWildcard
Can generalize to `? extends SoraldEventHandler`
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java
    }

    public SoraldAbstractProcessor<E> setEventHandlers(List<SoraldEventHandler> eventHandlers) {
        this.eventHandlers = eventHandlers;
        return this;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java
    }

    public SoraldAbstractProcessor<E> setBestFits(Map<CtElement, RuleViolation> bestFits) {
        this.bestFits = Collections.unmodifiableMap(bestFits);
        return this;
```

### BoundedWildcard
Can generalize to `? extends RuleViolation`
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java
    }

    public SoraldAbstractProcessor<E> setBestFits(Map<CtElement, RuleViolation> bestFits) {
        this.bestFits = Collections.unmodifiableMap(bestFits);
        return this;
```

### BoundedWildcard
Can generalize to `? super Character`
in `sorald/src/main/java/sorald/sonar/BestFitScanner.java`
#### Snippet
```java
    }

    private static int reverseFind(String s, int startIdx, Predicate<Character> predicate) {
        int searchPos = startIdx;
        while (searchPos > 0 && !predicate.test(s.charAt(searchPos))) {
```

### BoundedWildcard
Can generalize to `? extends RuleViolation`
in `sorald/src/main/java/sorald/sonar/BestFitScanner.java`
#### Snippet
```java
    /** All rule violations must concern the same rule as the processor. */
    private static void checkRuleViolationsConcernProcessorRule(
            Set<RuleViolation> ruleViolations, SoraldAbstractProcessor<?> processor) {
        String procKey = processor.getRuleKey();
        ruleViolations.stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `sorald-api/src/main/java/sorald/support/IdentityHashSet.java`
#### Snippet
```java
     * @return An identity hash set with all unique elements from the collection.
     */
    public static <T> Set<T> newIdentityHashSet(Collection<T> collection) {
        Set<T> set = Collections.newSetFromMap(new IdentityHashMap<>());
        set.addAll(collection);
```

### BoundedWildcard
Can generalize to `? super String`
in `sorald/src/main/java/sorald/event/collectors/RepairStatisticsCollector.java`
#### Snippet
```java

    private <T extends SoraldEvent> void addToEventMap(
            String key, T event, Map<String, List<T>> eventsMap) {
        eventsMap.putIfAbsent(key, new ArrayList<>());
        eventsMap.get(key).add(event);
```

### BoundedWildcard
Can generalize to `? extends RuleViolation`
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
    }

    private String parseRuleKey(Rules rules, List<RuleViolation> ruleViolations) {
        return withSonarPrefix(
                ruleViolations.isEmpty()
```

### BoundedWildcard
Can generalize to `? extends SoraldEventHandler`
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
            File target,
            String ruleKey,
            List<SoraldEventHandler> eventHandlers,
            List<String> classpath) {
        Rule rule = new SonarRule(ruleKey);
```

### BoundedWildcard
Can generalize to `? super LinkedList`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
            SoraldAbstractProcessor<?> processor,
            Set<RuleViolation> violations,
            Function<LinkedList<Node>, CtModel> parseSegment) {
        Node rootNode = SoraldTreeBuilderAlgorithm.buildTree(inputDir.toString());
        LinkedList<LinkedList<Node>> segments =
```

### BoundedWildcard
Can generalize to `? extends CtModel`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
            SoraldAbstractProcessor<?> processor,
            Set<RuleViolation> violations,
            Function<LinkedList<Node>, CtModel> parseSegment) {
        Node rootNode = SoraldTreeBuilderAlgorithm.buildTree(inputDir.toString());
        LinkedList<LinkedList<Node>> segments =
```

### BoundedWildcard
Can generalize to `? extends Node`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
    }

    private void reportSegmentCrash(LinkedList<Node> segment, Exception e) {
        List<String> paths =
                segment.stream()
```

### BoundedWildcard
Can generalize to `? extends Node`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
    }

    Launcher createSegmentLauncher(List<Node> segment) {
        Launcher launcher = new Launcher();

```

### BoundedWildcard
Can generalize to `? extends JavaInputFile`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java

    private static StandaloneAnalysisConfiguration getAnalysisConfigurationWithoutCliOptions(
            File projectRoot, List<JavaInputFile> inputFiles, List<Rule> rules) {
        return StandaloneAnalysisConfiguration.builder()
                .setBaseDir(projectRoot.toPath())
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java

    private static StandaloneAnalysisConfiguration getAnalysisConfigurationWithoutCliOptions(
            File projectRoot, List<JavaInputFile> inputFiles, List<Rule> rules) {
        return StandaloneAnalysisConfiguration.builder()
                .setBaseDir(projectRoot.toPath())
```

### BoundedWildcard
Can generalize to `? extends File`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java
    private Collection<RuleViolation> analyze(
            File projectRoot,
            List<File> files,
            List<Rule> rules,
            CLIConfigForStaticAnalyzer cliOptions) {
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java

    private static Map<RuleKey, Map<String, String>> putRuleParameters(
            Map<Rule, Map<String, String>> passedRuleParameters) {
        Map<RuleKey, Map<String, String>> parsedRuleParameters = new HashMap<>();
        passedRuleParameters
```

### BoundedWildcard
Can generalize to `? extends Map`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java

    private static Map<RuleKey, Map<String, String>> putRuleParameters(
            Map<Rule, Map<String, String>> passedRuleParameters) {
        Map<RuleKey, Map<String, String>> parsedRuleParameters = new HashMap<>();
        passedRuleParameters
```

### BoundedWildcard
Can generalize to `? extends JavaInputFile`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java
    private static StandaloneAnalysisConfiguration getAnalysisConfigurationWithCliOptions(
            File projectRoot,
            List<JavaInputFile> inputFiles,
            List<Rule> rules,
            CLIConfigForStaticAnalyzer cliOptions) {
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `sorald/src/main/java/sorald/sonar/SonarStaticAnalyzer.java`
#### Snippet
```java
            File projectRoot,
            List<JavaInputFile> inputFiles,
            List<Rule> rules,
            CLIConfigForStaticAnalyzer cliOptions) {
        return StandaloneAnalysisConfiguration.builder()
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return a collection of all rules.
     */
    @Nonnull
    public Collection<Rule> getAllRules();

```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return All rules with any of the given types.
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

```

### NullableProblems
Overridden method parameters are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return All rules with any of the given types.
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}
```

### NullableProblems
Overridden method parameters are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}

```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return a collection of rules that are handled by Sorald.
     */
    @Nonnull
    public Collection<Rule> getHandledRules();

```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/ProcessorRepository.java`
#### Snippet
```java
     * @return A list of all available processors.
     */
    @Nonnull
    List<Class<? extends SoraldAbstractProcessor<?>>> getAllProcessors();
}
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        if (os.contains("Windows")) {
            File cacheDir = new File(home + "\\Cache\\sorald\\");
            cacheDir.mkdirs();
            return cacheDir;
        } else if (os.contains("Linux")) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        } else if (os.contains("Linux")) {
            File cacheDir = new File(home + "/.cache/sorald/");
            cacheDir.mkdirs();
            return cacheDir;
        } else if (os.contains("Mac")) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        } else if (os.contains("Mac")) {
            File cacheDir = new File(home + "/Library/Caches/sorald/");
            cacheDir.mkdirs();
            return cacheDir;
        }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/cli/Cli.java`
#### Snippet
```java
        @Override
        public Integer call() {
            new CommandLine(this).usage(System.out);
            return -1;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/processor/ArrayHashCodeAndToStringProcessor.java`
#### Snippet
```java
            method = (CtMethod) arraysClass.getMethodsByName(Constants.TOSTRING_METHOD_NAME).get(0);
        } else {
            System.err.println("Unhandled case. Something went wrong.");
        }
        CtExecutableReference refToMethod = getFactory().Executable().createReference(method);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
        sc.close();

        System.out.println("TotalRepos: " + totalRepos);
        System.out.println("TotalWarnings: " + totalWarnings);
        System.out.println("AVGWarnings: " + (totalWarnings / totalRepos));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java

        System.out.println("TotalRepos: " + totalRepos);
        System.out.println("TotalWarnings: " + totalWarnings);
        System.out.println("AVGWarnings: " + (totalWarnings / totalRepos));
        System.out.println("RepoWithMaxWarnings: " + repoWithMaxWarnings);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
        System.out.println("TotalRepos: " + totalRepos);
        System.out.println("TotalWarnings: " + totalWarnings);
        System.out.println("AVGWarnings: " + (totalWarnings / totalRepos));
        System.out.println("RepoWithMaxWarnings: " + repoWithMaxWarnings);
        System.out.println("MaxRepoWarnings: " + maxRepoWarnings);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
        System.out.println("TotalWarnings: " + totalWarnings);
        System.out.println("AVGWarnings: " + (totalWarnings / totalRepos));
        System.out.println("RepoWithMaxWarnings: " + repoWithMaxWarnings);
        System.out.println("MaxRepoWarnings: " + maxRepoWarnings);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
        System.out.println("AVGWarnings: " + (totalWarnings / totalRepos));
        System.out.println("RepoWithMaxWarnings: " + repoWithMaxWarnings);
        System.out.println("MaxRepoWarnings: " + maxRepoWarnings);

        statsPerWarningType.entrySet().stream()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
        statsPerWarningType.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/segment/Node.java`
#### Snippet
```java
            if (node.getJavaFilesNbs() != 0) {
                if (node.isFileNode()) {
                    System.out.println(
                            "Files path: "
                                    + node.getParent().getRootPath()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/segment/Node.java`
#### Snippet
```java
                                    + node.getJavaFilesNbs());
                } else {
                    System.out.println(
                            "Dir path: "
                                    + node.getRootPath()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java
    public static Pair<Node, Node> splitFileNode(Node fileNode, int index) {
        if (!(index > 0 || index < fileNode.getJavaFiles().size())) {
            System.out.println(
                    "Invalid index: " + index + " Files: " + fileNode.getJavaFiles().size());
            return null;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/MineSonarWarnings.java`
#### Snippet
```java
        warnings.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java

    private static void printEndProcess(SoraldAbstractProcessor<?> processor) {
        System.out.println("-----Number of fixes------");
        System.out.println(processor.getClass().getSimpleName() + ": " + processor.getNbFixes());
        System.out.println("-----End of report------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
    private static void printEndProcess(SoraldAbstractProcessor<?> processor) {
        System.out.println("-----Number of fixes------");
        System.out.println(processor.getClass().getSimpleName() + ": " + processor.getNbFixes());
        System.out.println("-----End of report------");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
        System.out.println("-----Number of fixes------");
        System.out.println(processor.getClass().getSimpleName() + ": " + processor.getNbFixes());
        System.out.println("-----End of report------");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
        Set<RuleViolation> ruleViolations = resolveRuleViolations(eventHandlers, classpath);
        if (ruleViolations.isEmpty()) {
            System.out.println("No rule violations found, nothing to do ...");
        } else {
            SoraldAbstractProcessor<?> proc =
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `SonarLintEngine` is the same as one of its superclass' names
in `sorald/src/main/java/sorald/sonar/SonarLintEngine.java`
#### Snippet
```java
import sorald.util.ConfigLoader;

public final class SonarLintEngine extends AbstractSonarLintEngine {

    // The order of these initialisations is important as each field is dependent upon the previous
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java
                }

                curRepo = line.split(": ")[1];

                if (!line.contains("not_cloned")) // a line like: RepoName: discover not_cloned
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sorald/src/main/java/sorald/processor/BigDecimalDoubleConstructorProcessor.java`
#### Snippet
```java
            CtConstructorCall newCtConstructorCall = cons.clone();
            CtExpression arg = (CtExpression) cons.getArguments().get(0);
            String argValue = arg.toString().replaceAll("[fFdD]", "");
            CtLiteral<String> literal = getFactory().Code().createLiteral(argValue);
            newCtConstructorCall.getArguments().set(0, literal);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.sonarsource.sonarlint.core.client.api.common.analysis` is unnecessary and can be removed
in `sorald/src/main/java/sorald/sonar/ScannedViolation.java`
#### Snippet
```java
import sorald.rule.RuleViolation;

/** Facade around {@link org.sonarsource.sonarlint.core.client.api.common.analysis.Issue} */
class ScannedViolation extends RuleViolation {
    private final Issue issue;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.parsers` is unnecessary and can be removed
in `sorald/src/main/java/sorald/processor/XxeProcessingProcessor.java`
#### Snippet
```java
    /**
     * Create the following method on the provided type, where FACTORYTYPE is the type of the target
     * of the newInstanceInvocation (e.g. {@link javax.xml.parsers.DocumentBuilderFactory}). <br>
     * <code>
     *     private static FACTORYTYPE createFACTORYTYPE() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `sorald/src/main/java/sorald/sonar/SonarProcessorRepository.java`
#### Snippet
```java
    private static final Map<String, Class<? extends SoraldAbstractProcessor<?>>>
            RULE_KEY_TO_PROCESSOR =
                    new java.util.HashMap<>() {
                        {
                            put("S1068", UnusedPrivateFieldProcessor.class);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/miner/MineSonarWarnings.java`
#### Snippet
```java
                isCloned = true;
            } catch (Exception e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `sorald-api/src/main/java/sorald/event/models/CrashEvent.java`
#### Snippet
```java
        this.description = description;
        this.exception = exception;
        exception.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/sonar/ProjectScanner.java`
#### Snippet
```java
                filesToScan = FileUtils.findFilesByExtension(target, Constants.JAVA_EXT);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
                            } catch (Exception e) {
                                reportSegmentCrash(segment, e);
                                e.printStackTrace();
                                return null;
                            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
                | InvocationTargetException
                | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SoraldAbstractProcessor()` of an abstract class should not be declared 'public'
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public SoraldAbstractProcessor() {
        super();
        // we must override the processed element types as they depend on the concrete type of
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sorald/src/main/java/sorald/sonar/ProcessorsClassGenerator.java`
#### Snippet
```java
        extends AbstractAnnotationProcessor<ProcessorAnnotation, CtClass<T>> {
    private CtCompilationUnit cu = null;
    private CtType<?> processorsClass = null;
    private final SortedMap<String, CtClass<?>> processorMap = new TreeMap<>();
    private final SortedMap<String, String> descriptions = new TreeMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sorald/src/main/java/sorald/sonar/ProcessorsClassGenerator.java`
#### Snippet
```java
public class ProcessorsClassGenerator<T>
        extends AbstractAnnotationProcessor<ProcessorAnnotation, CtClass<T>> {
    private CtCompilationUnit cu = null;
    private CtType<?> processorsClass = null;
    private final SortedMap<String, CtClass<?>> processorMap = new TreeMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `sorald/src/main/java/sorald/event/collectors/RepairStatisticsCollector.java`
#### Snippet
```java
    private long parseStart = INVALID_TIME;
    private long repairStart = INVALID_TIME;
    private long parseTotal = 0;
    private long repairTotal = 0;
    private final List<SoraldEvent> crashes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `sorald/src/main/java/sorald/event/collectors/RepairStatisticsCollector.java`
#### Snippet
```java
    private long repairStart = INVALID_TIME;
    private long parseTotal = 0;
    private long repairTotal = 0;
    private final List<SoraldEvent> crashes = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
                                + "situational._",
                required = true)
        String ruleKey = null;

        @CommandLine.Option(
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-16-20-21-24.209.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java
            System.out.println(
                    "Invalid index: " + index + " Files: " + fileNode.getJavaFiles().size());
            return null;
        }

```

### ReturnNull
Return of `null`
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java

        if (!fileNode.isFileNode()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
                                reportSegmentCrash(segment, e);
                                e.printStackTrace();
                                return null;
                            }
                        })
```

### ReturnNull
Return of `null`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
                    .setEventHandlers(eventHandlers);
        }
        return null;
    }
}
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `replacement` is redundant
in `sorald/src/main/java/sorald/processor/DeadStoreProcessor.java`
#### Snippet
```java
            CtVariableWrite<?> varWrite =
                    (CtVariableWrite<?>) ((CtUnaryOperator<?>) element).getOperand();
            CtVariableRead<?> replacement = convertToVarRead(varWrite);
            return replacement;
        } else {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `sorald/src/main/java/sorald/processor/IteratorNextExceptionProcessor.java`
#### Snippet
```java
                        getFactory()
                                .createConstructorCall(
                                        noSuchElementClass.getReference(), new CtExpression[] {})));
        CtBlock block = getFactory().Core().createBlock();
        block.addStatement(throwStmnt);
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `sorald/src/main/java/sorald/sonar/SonarProcessorRepository.java`
#### Snippet
```java
    private static final Map<String, Class<? extends SoraldAbstractProcessor<?>>>
            RULE_KEY_TO_PROCESSOR =
                    new java.util.HashMap<>() {
                        {
                            put("S1068", UnusedPrivateFieldProcessor.class);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sorald/src/main/java/sorald/processor/DeadStoreProcessor.java`
#### Snippet
```java
        return statementLists.stream()
                .reduce((lhs, rhs) -> greedyFindDeepestCommonParent(lhs, rhs, depths))
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sorald/src/main/java/sorald/processor/ThreadLocalWithInitial.java`
#### Snippet
```java
                .filter(v -> v.getSimpleName().equals("initialValue"))
                .findFirst()
                .get();
    }
}
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `handledRules` is always `true` when reached
in `sorald/src/main/java/sorald/rule/RuleProvider.java`
#### Snippet
```java
        // `handledRules` is redundant here, but I am leaving it for the sake of
        // readability.
        if (ruleTypes.isEmpty() && handledRules) {
            return new ArrayList<>(getHandledRules());
        }
```

### ConstantValue
Condition `!ruleTypes.isEmpty()` is always `true`
in `sorald/src/main/java/sorald/rule/RuleProvider.java`
#### Snippet
```java
        // `ruleTypes` is redundant here, but I am leaving it for the sake of
        // readability.
        if (!ruleTypes.isEmpty() && !handledRules) {
            return new ArrayList<>(getRulesByType(ruleTypes));
        }
```

### ConstantValue
Result of `ruleTypes.isEmpty()` is always 'false'
in `sorald/src/main/java/sorald/rule/RuleProvider.java`
#### Snippet
```java
        // `ruleTypes` is redundant here, but I am leaving it for the sake of
        // readability.
        if (!ruleTypes.isEmpty() && !handledRules) {
            return new ArrayList<>(getRulesByType(ruleTypes));
        }
```

### ConstantValue
Condition `!instanceOfFieldAccess` is always `true`
in `sorald/src/main/java/sorald/processor/SelfAssignementProcessor.java`
#### Snippet
```java
        if (instanceOfFieldAccess) {
            element.delete();
        } else if (!instanceOfFieldAccess && instanceOfVariableAccess) {
            CtField<?> field = type.getField(leftExpression2Check.toString());
            if (field != null) {
```

### ConstantValue
Value `instanceOfFieldAccess` is always 'false'
in `sorald/src/main/java/sorald/processor/SelfAssignementProcessor.java`
#### Snippet
```java
        if (instanceOfFieldAccess) {
            element.delete();
        } else if (!instanceOfFieldAccess && instanceOfVariableAccess) {
            CtField<?> field = type.getField(leftExpression2Check.toString());
            if (field != null) {
```

