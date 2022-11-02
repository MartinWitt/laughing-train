# hcoles/pitest
# Bad smells
I found 484 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 129 | false |
| OptionalGetWithoutIsPresent | 39 | false |
| ReturnNull | 26 | false |
| RedundantFieldInitialization | 25 | false |
| UtilityClassWithoutPrivateConstructor | 20 | false |
| ConstantConditions | 18 | false |
| OptionalContainsCollection | 17 | false |
| OptionalUsedAsFieldOrParameterType | 17 | false |
| SystemOutErr | 17 | false |
| UnnecessaryQualifierForThis | 16 | false |
| DynamicRegexReplaceableByCompiledPattern | 16 | false |
| TrivialStringConcatenation | 12 | false |
| AbstractClassNeverImplemented | 11 | false |
| Convert2MethodRef | 9 | false |
| UnnecessarySuperQualifier | 6 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| AssignmentToMethodParameter | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| IgnoreResultOfCall | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| CastCanBeRemovedNarrowingVariableType | 5 | false |
| RedundantMethodOverride | 4 | false |
| EmptyMethod | 4 | false |
| RedundantSuppression | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| SizeReplaceableByIsEmpty | 3 | true |
| ThrowFromFinallyBlock | 3 | false |
| NestedAssignment | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| IOResource | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| UnnecessaryStringEscape | 2 | false |
| RedundantImplements | 2 | false |
| ExceptionNameDoesntEndWithException | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| FieldMayBeStatic | 2 | false |
| StringEqualsEmptyString | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UseBulkOperation | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| CommentedOutCode | 1 | false |
| RegExpRedundantEscape | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| UnnecessaryReturn | 1 | true |
| UnnecessaryUnboxing | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| RedundantStringFormatCall | 1 | false |
| UnusedAssignment | 1 | false |
| OptionalIsPresent | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
## WrapperTypeMayBePrimitive
### WrapperTypeMayBePrimitive
Type may be primitive
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/InlineConstantMutator.java`
#### Snippet
```java

    private void mutate(final Integer constant) {
      final Integer replacement;

      switch (constant.intValue()) {
```

## UnnecessaryStringEscape
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pitest-entry/src/main/java/org/pitest/process/ArgLineParser.java`
#### Snippet
```java
        }

        final StringTokenizer tokenizer = new StringTokenizer(in, "\"\' \\", true);
        List<String> tokens = new ArrayList<>();

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pitest-entry/src/main/java/org/pitest/process/ArgLineParser.java`
#### Snippet
```java

    private static final String ESCAPE_CHAR = "\\";
    private static final String SINGLE_QUOTE = "\'";
    public static final String DOUBLE_QUOTE = "\"";

```

## CommentedOutCode
### CommentedOutCode
Commented out code (2 lines)
in `pitest/src/main/java/org/pitest/mutationtest/execute/MemoryWatchdog.java`
#### Snippet
```java
        final long max = mu.getMax();
        final long alert = (max * threshold) / 100;
        // LOG.info("Setting a threshold shutdown on pool: " + mp.getName()
        // + " for: " + alert);
        mp.setUsageThreshold(alert);
```

## RegExpRedundantEscape
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `pitest/src/main/java/org/pitest/plugin/FeatureParser.java`
#### Snippet
```java

  private String[] split(String body) {
    return body.split("\\]");
  }

```

## UnnecessaryQualifierForThis
### UnnecessaryQualifierForThis
Qualifier `GregorMutater` on 'this' is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
    final ClassContext context = new ClassContext();
    context.setTargetMutation(Optional.empty());
    Optional<byte[]> bytes = GregorMutater.this.byteSource.getBytes(
        classToMutate.asInternalName());
    
```

### UnnecessaryQualifierForThis
Qualifier `TimeOutDecoratedTestSource` on 'this' is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/execute/TimeOutDecoratedTestSource.java`
#### Snippet
```java
  private Function<TestInfo, Stream<TestUnit>> testToTestUnit() {
    return a -> {
      final TestUnit tu = TimeOutDecoratedTestSource.this.allTests.get(a
          .getName());
      if (tu != null) {
```

### UnnecessaryQualifierForThis
Qualifier `TimeOutDecoratedTestSource` on 'this' is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/execute/TimeOutDecoratedTestSource.java`
#### Snippet
```java
            .of(new MutationTimeoutDecorator(tu,
                new TimeOutSystemExitSideEffect(
                    TimeOutDecoratedTestSource.this.r),
                    TimeOutDecoratedTestSource.this.timeoutStrategy, a.getTime()));
      }
```

### UnnecessaryQualifierForThis
Qualifier `TimeOutDecoratedTestSource` on 'this' is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/execute/TimeOutDecoratedTestSource.java`
#### Snippet
```java
                new TimeOutSystemExitSideEffect(
                    TimeOutDecoratedTestSource.this.r),
                    TimeOutDecoratedTestSource.this.timeoutStrategy, a.getTime()));
      }
      return Stream.empty();
```

### UnnecessaryQualifierForThis
Qualifier `LoggingCallsFilter` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/logging/LoggingCallsFilter.java`
#### Snippet
```java

  private Predicate<MutationDetails> isOnLoggingLine() {
    return a -> LoggingCallsFilter.this.lines.contains(a.getClassLine().getLineNumber());
  }

```

### UnnecessaryQualifierForThis
Qualifier `AvoidForLoopCounterFilter` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/timeout/AvoidForLoopCounterFilter.java`
#### Snippet
```java
    return a -> {
      final int instruction = a.getInstructionIndex();
      final MethodTree method = AvoidForLoopCounterFilter.this.currentClass.method(a.getId().getLocation()).get();
      final AbstractInsnNode mutatedInstruction = method.instruction(instruction);

```

### UnnecessaryQualifierForThis
Qualifier `ImplicitNullCheckFilter` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ImplicitNullCheckFilter.java`
#### Snippet
```java
    return a -> {
      final int instruction = a.getInstructionIndex();
      final MethodTree method = ImplicitNullCheckFilter.this.currentClass.method(a.getId().getLocation())
          .get();

```

### UnnecessaryQualifierForThis
Qualifier `MethodReferenceNullCheckFilter` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/MethodReferenceNullCheckFilter.java`
#### Snippet
```java
    return a -> {
      final int instruction = a.getInstructionIndex();
      final MethodTree method = MethodReferenceNullCheckFilter.this.currentClass.methods().stream()
          .filter(MethodMatchers.forLocation(a.getId().getLocation()))
          .findFirst()
```

### UnnecessaryQualifierForThis
Qualifier `MutationStatisticsPrecursor` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
  private Consumer<MutationResult> register() {
    return mr -> {
      MutationStatisticsPrecursor.this.numberOfTestsRun = MutationStatisticsPrecursor.this.numberOfTestsRun
          + mr.getNumberOfTestsRun();
      final String key = mr.getDetails().getId().getMutator();
```

### UnnecessaryQualifierForThis
Qualifier `MutationStatisticsPrecursor` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
  private Consumer<MutationResult> register() {
    return mr -> {
      MutationStatisticsPrecursor.this.numberOfTestsRun = MutationStatisticsPrecursor.this.numberOfTestsRun
          + mr.getNumberOfTestsRun();
      final String key = mr.getDetails().getId().getMutator();
```

### UnnecessaryQualifierForThis
Qualifier `MutationStatisticsPrecursor` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
          + mr.getNumberOfTestsRun();
      final String key = mr.getDetails().getId().getMutator();
      ScorePrecursor total = MutationStatisticsPrecursor.this.mutatorTotalMap
          .get(key);
      if (total == null) {
```

### UnnecessaryQualifierForThis
Qualifier `MutationStatisticsPrecursor` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
      if (total == null) {
        total = new ScorePrecursor(key);
        MutationStatisticsPrecursor.this.mutatorTotalMap.put(key, total);
      }
      total.registerResult(mr.getStatus());
```

### UnnecessaryQualifierForThis
Qualifier `AnnotatedLineFactory` on 'this' is unnecessary in this context
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/AnnotatedLineFactory.java`
#### Snippet
```java

  private boolean isLineCovered(final int line) {
    final Predicate<ClassInfo> predicate = a -> !AnnotatedLineFactory.this.statistics.getTestsForClassLine(
        new ClassLine(a.getName().asInternalName(), line)).isEmpty();
    return FCollection.contains(this.classesInFile, predicate);
```

### UnnecessaryQualifierForThis
Qualifier `ReportOptions` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
      // target classes predicate covers both classes and tests
      return Prelude.and(or(Glob.toGlobPredicates(this.targetClasses)),
          not(isBlackListed(ReportOptions.this.excludedTestClasses)));
    } else {
      return Prelude.and(or(this.targetTests),
```

### UnnecessaryQualifierForThis
Qualifier `ReportOptions` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
    } else {
      return Prelude.and(or(this.targetTests),
          not(isBlackListed(ReportOptions.this.excludedTestClasses)));
    }
  }
```

### UnnecessaryQualifierForThis
Qualifier `ReportOptions` on 'this' is unnecessary in this context
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  public Predicate<String> getTargetClassesFilter() {
    final Predicate<String> filter = Prelude.and(or(Glob.toGlobPredicates(this.targetClasses)),
        not(isBlackListed(Glob.toGlobPredicates(ReportOptions.this.excludedClasses))));
    checkNotTryingToMutateSelf(filter);
    return filter;
```

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `pitest/src/main/java/org/pitest/util/ServiceLoader.java`
#### Snippet
```java
      }
      final String name = line.trim();
      if (name.length() == 0) {
        continue;
      }
```

### SizeReplaceableByIsEmpty
`blocks.size() > 0` can be replaced with '!blocks.isEmpty()'
in `pitest/src/main/java/org/pitest/coverage/analysis/ControlFlowAnalyser.java`
#### Snippet
```java
        lastLine = lnn.line;
      } else if (jumpTargets.contains(ins) && (blockStart != i)) {
        if (blockLines.isEmpty() && blocks.size() > 0 && !blocks
            .get(blocks.size() - 1).getLines().isEmpty()) {
          blockLines.addAll(blocks.get(blocks.size() - 1).getLines());
```

### SizeReplaceableByIsEmpty
`blocks.size() > 0` can be replaced with '!blocks.isEmpty()'
in `pitest/src/main/java/org/pitest/coverage/analysis/ControlFlowAnalyser.java`
#### Snippet
```java
        blockLines = smallSet();
      } else if (endsBlock(ins)) {
        if (blockLines.isEmpty() && blocks.size() > 0 && !blocks
            .get(blocks.size() - 1).getLines().isEmpty()) {
          blockLines.addAll(blocks.get(blocks.size() - 1).getLines());
```

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `pitest/src/main/java/org/pitest/mutationtest/execute/CommandLineMessage.java`
#### Snippet
```java

  public static void report(final String message) {
    final StringBuilder sb = new StringBuilder();
    sb.append("---------------------------------------------------------------------------------\n");
    sb.append(message + "\n");
```

## NonShortCircuitBoolean
### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.hasNotNullAnnotation |= desc.endsWith("NotNull;")`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/returns/NullReturnValsMutator.java`
#### Snippet
```java
  @Override
  public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
    this.hasNotNullAnnotation |= desc.endsWith("NotNull;");
    return super.visitAnnotation(desc, visible);
  }
```

## UnnecessaryReturn
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java
      } catch (final NoTestsRemainException e1) {
        rc.notifySkipped(this.getDescription());
        return;
      }
    }
```

## TrivialStringConcatenation
### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/util/TimeSpan.java`
#### Snippet
```java

    if (hours != 0) {
      return "" + hours + " hours, " + minutes + " minutes and " + seconds
          + " seconds";
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/util/TimeSpan.java`
#### Snippet
```java

    if (minutes != 0) {
      return "" + minutes + " minutes and " + seconds + " seconds";
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/util/TimeSpan.java`
#### Snippet
```java

    if (seconds != 0) {
      return "" + seconds + " seconds";
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java
  public static String randomFilename() {
    return System.currentTimeMillis()
        + ("" + Math.random()).replaceAll("\\.", "");
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/plugin/export/MutantExportInterceptor.java`
#### Snippet
```java
      int i) throws IOException {
    final MutationDetails md = indexable.get(i);
    final Path mutantFolder = this.mutantsDir.resolve("" + i);
    Files.createDirectories(mutantFolder);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest/src/main/java/org/pitest/mutationtest/execute/MutationTestWorker.java`
#### Snippet
```java
    final MutationStatusTestPair mutationDetected;
    if (DEBUG) {
      LOG.fine("" + relevantTests.size() + " relevant test for "
          + mutatedClass.getDetails().getMethod());
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java

  public void start() throws IOException {
    final String[] args = { "" + this.port };

    final ProcessBuilder processBuilder = createProcessBuilder(
```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/xml/XMLReportListener.java`
#### Snippet
```java
    sb.append("<" + topTag + ">");
    for (Integer each : values) {
      sb.append(makeNode("" + each, tag));
    }
    sb.append("</" + topTag + ">");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/xml/XMLReportListener.java`
#### Snippet
```java
        + makeNode(clean(details.getId().getLocation().getMethodDesc()),
            methodDescription)
        + makeNode("" + details.getLineNumber(), lineNumber)
        + makeNode(clean(details.getMutator()), mutator)
        + makeNodes(indexes, details.getId().getIndexes(), index)
```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/StatusCount.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "" + this.status + " " + this.count;
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/MutationCoverage.java`
#### Snippet
```java

  private String timeSpan(final long t0) {
    return "" + ((System.currentTimeMillis() - t0) / 1000) + " seconds";
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/Line.java`
#### Snippet
```java
  public String getNumberOfMutationsForDisplay() {
    if (getNumberOfMutations() > 0) {
      return "" + getNumberOfMutations();
    } else {
      return "";
```

## ConstantConditions
### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/junit/ParameterisedJUnitTestFinder.java`
#### Snippet
```java
  private Function<Description, TestUnit> parameterizedToTestUnit(final Class<?> clazz) {
    return a -> new AdaptedJUnitTestUnit(clazz,
        Optional.ofNullable(new ParameterisedTestFilter(a.toString())));
  }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/junit/JUnitCustomRunnerTestUnitFinder.java`
#### Snippet
```java
    }
    return new AdaptedJUnitTestUnit(clazz,
        Optional.ofNullable(createFilterFor(description)));
  }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/junit/JUnitCustomRunnerTestUnitFinder.java`
#### Snippet
```java
  private static Optional<Class> findClassRuleClass() {
    try {
      return Optional.ofNullable(Class.forName("org.junit.ClassRule"));
    } catch (final ClassNotFoundException ex) {
      return Optional.empty();
```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/junit/JUnitCompatibleConfiguration.java`
#### Snippet
```java
      final String version = junit.runner.Version.id();
      if (isInvalidVersion(version)) {
        return Optional.ofNullable(new PitHelpError(Help.WRONG_JUNIT_VERSION, version));
      }
    } catch (final NoClassDefFoundError er) {
```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/junit/JUnitCompatibleConfiguration.java`
#### Snippet
```java
      }
    } catch (final NoClassDefFoundError er) {
      return Optional.ofNullable(new PitHelpError(Help.NO_JUNIT));
    }

```

### ConstantConditions
Condition `confStart != -1` is always `true`
in `pitest/src/main/java/org/pitest/plugin/FeatureParser.java`
#### Snippet
```java
    final int confStart = a.indexOf('(') + 1;
    final int end = a.indexOf(')');
    if ((confStart != -1) && (confStart < end)) {
      final String[] parts = split(a.substring(confStart, end));
      for (final String part : parts) {
```

### ConstantConditions
Argument `transformBytes(IsolationUtils.getContextClassLoader(), name, bs)` might be null
in `pitest/src/main/java/org/pitest/coverage/execute/JavassistCoverageInterceptor.java`
#### Snippet
```java
        final byte[] bs = getOriginalBytes(classPath, name);
        return new ByteArrayInputStream(
            transformBytes(IsolationUtils.getContextClassLoader(), name, bs));
      } else {
        return returnNormalBytes(classPath, name);
```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/classpath/ArchiveClassPathRoot.java`
#### Snippet
```java
  @Override
  public Optional<String> cacheLocation() {
    return Optional.ofNullable(this.file.getAbsolutePath());
  }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
  @Override
  public Optional<String> cacheLocation() {
    return Optional.ofNullable(this.root.getAbsolutePath());
  }

```

### ConstantConditions
Dereference of `file.listFiles()` may produce `NullPointerException`
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
  private Collection<String> classNames(final File file) {
    final List<String> classNames = new LinkedList<>();
    for (final File f : file.listFiles()) {
      if (f.isDirectory()) {
        classNames.addAll(classNames(f));
```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest/src/main/java/org/pitest/classpath/CompoundClassPathRoot.java`
#### Snippet
```java
    }

    return Optional.ofNullable(classpath.toString());
  }

```

### ConstantConditions
Method invocation `getClassName` may produce `NullPointerException`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
    context.setTargetMutation(Optional.ofNullable(id));

    final Optional<byte[]> bytes = this.byteSource.getBytes(id.getClassName()
        .asJavaName());

```

### ConstantConditions
Dereference of `state.peek()` may produce `NullPointerException`
in `pitest-entry/src/main/java/org/pitest/process/ArgLineParser.java`
#### Snippet
```java
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            switch (state.peek()) {
                case START:
                    if (token.equals(SINGLE_QUOTE)) {
```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java
    final ClassInfo info = this.knownClasses.get(name);
    if (info != null) {
      return Optional.ofNullable(info);
    }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java

  private Optional<ClassInfo> contructClassInfo(final ClassInfoBuilder classData) {
    return Optional.ofNullable(new ClassInfo(resolveClass(classData.superClass),
        resolveClass(classData.outerClass), classData));
  }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/JarCreatingJarFinder.java`
#### Snippet
```java
      final FileOutputStream fos = new FileOutputStream(randomName);
      createJarFromClassPathResources(fos, randomName.getAbsolutePath());
      return Optional.ofNullable(randomName.getAbsolutePath());

    } catch (final IOException ex) {
```

### ConstantConditions
Condition `files == null` is always `false`
in `pitest-maven/src/main/java/org/pitest/maven/report/AbstractPitAggregationReportMojo.java`
#### Snippet
```java

    final List<File> files = FileUtils.getFiles(latestReportDir, filter, "");
    return files == null ? new ArrayList<>() : files;
  }

```

### ConstantConditions
Passing a non-null argument to `Optional`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
      if (this.historyInputLocation.exists()
          && (this.historyInputLocation.length() > 0)) {
        return Optional.ofNullable(new InputStreamReader(new FileInputStream(
            this.historyInputLocation), StandardCharsets.UTF_8));
      }
      return Optional.empty();
```

## BoundedWildcard
### BoundedWildcard
Can generalize to `? extends TestUnitFinder`
in `pitest/src/main/java/org/pitest/junit/CompoundTestUnitFinder.java`
#### Snippet
```java
  private final List<TestUnitFinder> tufs;

  public CompoundTestUnitFinder(final List<TestUnitFinder> tufs) {
    this.tufs = tufs;
  }
```

### BoundedWildcard
Can generalize to `? super Description`
in `pitest/src/main/java/org/pitest/junit/RunnerSuiteFinder.java`
#### Snippet
```java
  }

  private void flattenChildren(final List<Description> allChildren,
      final Description description) {
    for (final Description each : description.getChildren()) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/CommaAwareArgsProcessor.java`
#### Snippet
```java
    }

    private String replaceCommas(String single, Set<Integer> modifiedIndices) {
        StringBuilder newString = new StringBuilder();
        boolean inSpecialRegion = false;
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java

  private static String createName(final Class<?> clazz,
      final Optional<Filter> filter) {
    if (filter.isPresent()) {
      return filter.get().describe();
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java

  public AdaptedJUnitTestUnit(
      final Class<?> clazz, final Optional<Filter> filter) {
    super(new org.pitest.testapi.Description(createName(clazz, filter), clazz));
    this.clazz = clazz;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/plugin/FeatureParser.java`
#### Snippet
```java
  }

  private void extractValue(String part, Map<String, List<String>> vals) {
    final String[] pairs = part.split("\\[");
    for (int i = 0; i != pairs.length; i = i + 2) {
```

### BoundedWildcard
Can generalize to `? extends S`
in `pitest/src/main/java/org/pitest/util/ServiceLoader.java`
#### Snippet
```java
  }

  private static <S> void createServicesFromStream(final Class<S> ifc,
      final ClassLoader loader, final Collection<S> services,
      final InputStream is) throws IOException {
```

### BoundedWildcard
Can generalize to `? super TestResult`
in `pitest/src/main/java/org/pitest/testapi/execute/containers/ConcreteResultCollector.java`
#### Snippet
```java
  private final Collection<TestResult> feedback;

  public ConcreteResultCollector(final Collection<TestResult> feedback) {
    this.feedback = feedback;
  }
```

### BoundedWildcard
Can generalize to `? extends TestUnit`
in `pitest/src/main/java/org/pitest/testapi/execute/MultipleTestGroup.java`
#### Snippet
```java
  private final List<TestUnit> children;

  public MultipleTestGroup(final List<TestUnit> children) {
    super(new Description("MultipleTestGroup"));
    this.children = children;
```

### BoundedWildcard
Can generalize to `? extends T`
in `pitest/src/main/java/org/pitest/plugin/FeatureSelector.java`
#### Snippet
```java
  }

  private List<T> selectFeatures(List<FeatureSetting> features, Collection<T> filters) {
    final List<T> factories = new ArrayList<>(filters);
    final Map<String, Collection<T>> featureMap = FCollection.bucket(factories, byFeatureName());
```

### BoundedWildcard
Can generalize to `? super TestUnit`
in `pitest/src/main/java/org/pitest/testapi/execute/FindTestUnits.java`
#### Snippet
```java
  }

  private void findTestUnits(final List<TestUnit> tus,
      final Set<Class<?>> visitedClasses, final Class<?> suiteClass) {
    visitedClasses.add(suiteClass);
```

### BoundedWildcard
Can generalize to `? super Class`
in `pitest/src/main/java/org/pitest/testapi/execute/FindTestUnits.java`
#### Snippet
```java

  private void findTestUnits(final List<TestUnit> tus,
      final Set<Class<?>> visitedClasses, final Class<?> suiteClass) {
    visitedClasses.add(suiteClass);
    final Collection<Class<?>> tcs = this.config.testSuiteFinder().apply(
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/coverage/CoverageTransformer.java`
#### Snippet
```java
  private final Map<String, String> computeCache = new ConcurrentHashMap<>();

  public CoverageTransformer(final Predicate<String> filter) {
    this.filter = filter;
  }
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/OptionsParser.java`
#### Snippet
```java
  }

  private Collection<Path> asPaths(List<File> values) {
    return values.stream()
            .map(File::toPath)
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java

  private static Predicate<String> convertToJVMClassFilter(
      final Predicate<String> child) {
    return a -> child.test(a.replace("/", "."));
  }
```

### BoundedWildcard
Can generalize to `? extends TestUnit`
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java
  }

  private static List<TestUnit> removeTestsExecutedDuringDiscovery(List<TestUnit> tus) {
    List<TestUnit> toExecute = tus.stream()
            .filter(t -> !(t instanceof ExecutedInDiscovery))
```

### BoundedWildcard
Can generalize to `? super LabelNode`
in `pitest/src/main/java/org/pitest/coverage/analysis/ControlFlowAnalyser.java`
#### Snippet
```java

  private static void addtryCatchBoundaries(final MethodNode mn,
      final Set<LabelNode> jumpTargets) {
    for (final Object each : mn.tryCatchBlocks) {
      final TryCatchBlockNode tcb = (TryCatchBlockNode) each;
```

### BoundedWildcard
Can generalize to `? extends TestUnit`
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageWorker.java`
#### Snippet
```java
  }

  private static List<TestUnit> decorateForCoverage(final List<TestUnit> plainTests,
      final CoverageReceiver queue) {
    return plainTests.stream()
```

### BoundedWildcard
Can generalize to `? super Integer`
in `pitest/src/main/java/org/pitest/classinfo/MethodFilteringAdapter.java`
#### Snippet
```java

  public MethodFilteringAdapter(final ClassVisitor writer,
      final F5<Integer, String, String, String, String[], Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.filter = filter;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/classinfo/MethodFilteringAdapter.java`
#### Snippet
```java

  public MethodFilteringAdapter(final ClassVisitor writer,
      final F5<Integer, String, String, String, String[], Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.filter = filter;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/classinfo/MethodFilteringAdapter.java`
#### Snippet
```java

  public MethodFilteringAdapter(final ClassVisitor writer,
      final F5<Integer, String, String, String, String[], Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.filter = filter;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/classinfo/MethodFilteringAdapter.java`
#### Snippet
```java

  public MethodFilteringAdapter(final ClassVisitor writer,
      final F5<Integer, String, String, String, String[], Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.filter = filter;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java

  public ComputeClassWriter(final ClassByteArraySource bytes,
      final Map<String, String> cache, final int flags) {
    super(flags);
    this.bytes = bytes;
```

### BoundedWildcard
Can generalize to `? extends TestSuiteFinder`
in `pitest/src/main/java/org/pitest/extension/common/CompoundTestSuiteFinder.java`
#### Snippet
```java
  private final Collection<TestSuiteFinder> children;

  public CompoundTestSuiteFinder(final Collection<TestSuiteFinder> children) {
    this.children = children;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassPathRoot`
in `pitest/src/main/java/org/pitest/classpath/CompoundClassPathRoot.java`
#### Snippet
```java

  private  static List<ClassPathRoot> wrapToAvoidIOOperations(
      List<ClassPathRoot> roots) {
    return FCollection.map(roots, NameCachingRoot.toCachingRoot());
  }
```

### BoundedWildcard
Can generalize to `? extends Predicate`
in `pitest/src/main/java/org/pitest/functional/predicate/Or.java`
#### Snippet
```java
  private final Set<Predicate<A>> ps = new LinkedHashSet<>();

  public Or(final Iterable<Predicate<A>> ps) {
    for (final Predicate<A> each : ps) {
      this.ps.add(each);
```

### BoundedWildcard
Can generalize to `? extends TestUnitFinder`
in `pitest/src/main/java/org/pitest/mutationtest/config/PrioritisingTestUnitFinder.java`
#### Snippet
```java
    private final List<TestUnitFinder> orderedChildren;

    PrioritisingTestUnitFinder(List<TestUnitFinder> orderedChildren) {
        this.orderedChildren = orderedChildren;
    }
```

### BoundedWildcard
Can generalize to `? extends TestSuiteFinder`
in `pitest/src/main/java/org/pitest/mutationtest/config/PrioritisingTestSuiteFinder.java`
#### Snippet
```java
    private final List<TestSuiteFinder> orderedChildren;

    PrioritisingTestSuiteFinder(List<TestSuiteFinder> orderedChildren) {
        this.orderedChildren = orderedChildren;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java
  }

  public static <T> boolean contains(final T[] xs, final Predicate<T> predicate) {
    for (final T x : xs) {
      if (predicate.test(x)) {
```

### BoundedWildcard
Can generalize to `? super A`
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java

  public static <A, B> void flatMapTo(final A[] as,
      final Function<A, ? extends Iterable<B>> f, final Collection<? super B> bs) {
    if (as != null) {
      for (final A a : as) {
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java
public abstract class FArray {

  public static <T> void filter(final T[] xs, final Predicate<T> predicate,
      final Collection<T> dest) {
    if (xs != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java

  public static <T> void filter(final T[] xs, final Predicate<T> predicate,
      final Collection<T> dest) {
    if (xs != null) {
      for (final T x : xs) {
```

### BoundedWildcard
Can generalize to `? super A`
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java

  public static <A, B> List<B> flatMap(final A[] as,
      final Function<A, ? extends Iterable<B>> f) {
    final List<B> bs = emptyList();
    flatMapTo(as, f, bs);
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java
  }

  public ClassPath(final Collection<File> files) {
    this(createRoots(FCollection.filter(files, exists())));
  }
```

### BoundedWildcard
Can generalize to `? super A`
in `pitest/src/main/java/org/pitest/functional/prelude/Prelude.java`
#### Snippet
```java
  }

  public static <A, B> Consumer<A> putToMap(final Map<A, B> map,
      final B value) {
    return key -> map.put(key, value);
```

### BoundedWildcard
Can generalize to `? super ClassPathRoot`
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java
  }

  public ClassPath getComponent(final Predicate<ClassPathRoot> predicate) {
    return new ClassPath(FCollection.filter(this.root, predicate).toArray(
        new ClassPathRoot[0]));
```

### BoundedWildcard
Can generalize to `? super ClassPathRoot`
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java
  }

  private static void handleArchive(final List<ClassPathRoot> rs, final File f)
      throws IOException {
    try {
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java

  // fixme should not be determining type here
  private static List<ClassPathRoot> createRoots(final Collection<File> files) {
    File lastFile = null;
    try {
```

### BoundedWildcard
Can generalize to `? extends Configuration`
in `pitest/src/main/java/org/pitest/mutationtest/config/PrioritisingTestConfiguration.java`
#### Snippet
```java
    }

    private TestSuiteFinder makeSuiteFinder(List<Configuration> children) {
        List<TestSuiteFinder> finders = children.stream()
                .map(Configuration::testSuiteFinder)
```

### BoundedWildcard
Can generalize to `? extends Configuration`
in `pitest/src/main/java/org/pitest/mutationtest/config/PrioritisingTestConfiguration.java`
#### Snippet
```java
    }

    private TestUnitFinder makeFinder(List<Configuration> children) {
        List<TestUnitFinder> finders = children.stream()
                .map(Configuration::testUnitFinder)
```

### BoundedWildcard
Can generalize to `? extends T`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java

  public static <T> List<List<T>> splitToLength(
      final int targetLength, final Iterable<T> ts) {
    final List<List<T>> list = new ArrayList<>();
    List<T> temp = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends B`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java

  public static <A, B> List<B> map(final Iterable<? extends A> as,
      final Function<A, B> f) {
    final List<B> bs = emptyList();
    mapTo(as, f, bs);
```

### BoundedWildcard
Can generalize to `? extends B`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java
  }

  public static <A, B> Map<A, Collection<B>> bucket(final Iterable<B> bs,
      final Function<B, A> f) {
    final Map<A, Collection<B>> bucketed = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super B`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java

  public static <A, B> Map<A, Collection<B>> bucket(final Iterable<B> bs,
      final Function<B, A> f) {
    final Map<A, Collection<B>> bucketed = new HashMap<>();
    for (final B each : bs) {
```

### BoundedWildcard
Can generalize to `? extends A`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java

  public static <A, B> Map<A, Collection<B>> bucket(final Iterable<B> bs,
      final Function<B, A> f) {
    final Map<A, Collection<B>> bucketed = new HashMap<>();
    for (final B each : bs) {
```

### BoundedWildcard
Can generalize to `? super A`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java
  }

  public static <A, B> A fold(final BiFunction<A, B, A> f, final A z,
      final Iterable<? extends B> xs) {
    A p = z;
```

### BoundedWildcard
Can generalize to `? extends A`
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java
  }

  public static <A, B> A fold(final BiFunction<A, B, A> f, final A z,
      final Iterable<? extends B> xs) {
    A p = z;
```

### BoundedWildcard
Can generalize to `? super MethodInfo`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/MutatingClassVisitor.java`
#### Snippet
```java

  MutatingClassVisitor(final ClassVisitor delegateClassVisitor,
      final ClassContext context, final Predicate<MethodInfo> filter,
      final List<MethodMutatorFactory> mutators) {
    super(ASMVersion.ASM_VERSION, delegateClassVisitor);
```

### BoundedWildcard
Can generalize to `? extends MethodMutatorFactory`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/MutatingClassVisitor.java`
#### Snippet
```java
  MutatingClassVisitor(final ClassVisitor delegateClassVisitor,
      final ClassContext context, final Predicate<MethodInfo> filter,
      final List<MethodMutatorFactory> mutators) {
    super(ASMVersion.ASM_VERSION, delegateClassVisitor);
    this.context = context;
```

### BoundedWildcard
Can generalize to `? extends MethodMutatorFactory`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
  }

  private List<MethodMutatorFactory> orderAndDeDuplicate(Collection<MethodMutatorFactory> mutators) {
    // deduplication is based on object identity, so dubious that this adds any value
    // however left in place for now to replicate HashSet behaviour
```

### BoundedWildcard
Can generalize to `? extends List`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/MutatorGroup.java`
#### Snippet
```java
    void register(Map<String, List<MethodMutatorFactory>> mutators);

    default List<MethodMutatorFactory> gather(Map<String, List<MethodMutatorFactory>> mutators, String...keys) {
        return Arrays.stream(keys)
                .flatMap(k -> mutators.get(k).stream())
```

### BoundedWildcard
Can generalize to `? extends MethodMutatorFactory`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/Mutator.java`
#### Snippet
```java

  private static Collection<MethodMutatorFactory> combine(
      Collection<MethodMutatorFactory> a, Collection<MethodMutatorFactory> b) {
    final List<MethodMutatorFactory> l = new ArrayList<>(a);
    l.addAll(b);
```

### BoundedWildcard
Can generalize to `? extends MethodMutatorFactory`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/Mutator.java`
#### Snippet
```java

  private static Collection<MethodMutatorFactory> combine(
      Collection<MethodMutatorFactory> a, Collection<MethodMutatorFactory> b) {
    final List<MethodMutatorFactory> l = new ArrayList<>(a);
    l.addAll(b);
```

### BoundedWildcard
Can generalize to `? extends List`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/Mutator.java`
#### Snippet
```java
  }

  private static Function<String, Iterable<MethodMutatorFactory>> fromString(Map<String, List<MethodMutatorFactory>> mutators) {
    return a -> {

```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/MethodCallMethodVisitor.java`
#### Snippet
```java
      final MutationContext context, final MethodVisitor writer,
      final MethodMutatorFactory factory,
      final BiFunction<String, String, Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.factory = factory;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/MethodCallMethodVisitor.java`
#### Snippet
```java
      final MutationContext context, final MethodVisitor writer,
      final MethodMutatorFactory factory,
      final BiFunction<String, String, Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
    this.factory = factory;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/RemoveSwitchMutatorGroup.java`
#### Snippet
```java
public class RemoveSwitchMutatorGroup implements MutatorGroup {
    @Override
    public void register(Map<String, List<MethodMutatorFactory>> mutators) {
        mutators.put("REMOVE_SWITCH", RemoveSwitchMutator.makeMutators());
    }
```

### BoundedWildcard
Can generalize to `? super List`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/RemoveSwitchMutatorGroup.java`
#### Snippet
```java
public class RemoveSwitchMutatorGroup implements MutatorGroup {
    @Override
    public void register(Map<String, List<MethodMutatorFactory>> mutators) {
        mutators.put("REMOVE_SWITCH", RemoveSwitchMutator.makeMutators());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigDecimalMutator.java`
#### Snippet
```java
    }

    private static void put(Map<String, Replacement> map, Replacement replacement) {
      map.put(replacement.sourceName, replacement);
    }
```

### BoundedWildcard
Can generalize to `? super Replacement`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigDecimalMutator.java`
#### Snippet
```java
    }

    private static void put(Map<String, Replacement> map, Replacement replacement) {
      map.put(replacement.sourceName, replacement);
    }
```

### BoundedWildcard
Can generalize to `? extends TestUnit`
in `pitest/src/main/java/org/pitest/mutationtest/execute/TimeOutDecoratedTestSource.java`
#### Snippet
```java
  }

  private void mapTests(final List<TestUnit> tests) {
    for (final TestUnit each : tests) {
      this.allTests.put(each.getDescription().getQualifiedName(), each);
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigIntegerMutator.java`
#### Snippet
```java
    }

    private static void put(Map<String, Replacement> map, Replacement replacement) {
      map.put(replacement.sourceName, replacement);
    }
```

### BoundedWildcard
Can generalize to `? super Replacement`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigIntegerMutator.java`
#### Snippet
```java
    }

    private static void put(Map<String, Replacement> map, Replacement replacement) {
      map.put(replacement.sourceName, replacement);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest/src/main/java/org/pitest/mutationtest/mocksupport/BendJavassistToMyWillTransformer.java`
#### Snippet
```java
  private final Map<String, String> computeCache = new ConcurrentHashMap<>();

  public BendJavassistToMyWillTransformer(final Predicate<String> filter, Function<ClassWriter,ClassVisitor> transformation) {
    this.filter = filter;
    this.transformation = transformation;
```

### BoundedWildcard
Can generalize to `? super ClassWriter`
in `pitest/src/main/java/org/pitest/mutationtest/mocksupport/BendJavassistToMyWillTransformer.java`
#### Snippet
```java
  private final Map<String, String> computeCache = new ConcurrentHashMap<>();

  public BendJavassistToMyWillTransformer(final Predicate<String> filter, Function<ClassWriter,ClassVisitor> transformation) {
    this.filter = filter;
    this.transformation = transformation;
```

### BoundedWildcard
Can generalize to `? extends ClassVisitor`
in `pitest/src/main/java/org/pitest/mutationtest/mocksupport/BendJavassistToMyWillTransformer.java`
#### Snippet
```java
  private final Map<String, String> computeCache = new ConcurrentHashMap<>();

  public BendJavassistToMyWillTransformer(final Predicate<String> filter, Function<ClassWriter,ClassVisitor> transformation) {
    this.filter = filter;
    this.transformation = transformation;
```

### BoundedWildcard
Can generalize to `? super SafeDataOutputStream`
in `pitest-entry/src/main/java/org/pitest/util/SocketReadingCallable.java`
#### Snippet
```java

  SocketReadingCallable(final ServerSocket socket,
      final Consumer<SafeDataOutputStream> sendInitialData,
      final ReceiveStrategy receive) {
    this.socket = socket;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/util/StreamMonitor.java`
#### Snippet
```java
   */
  public StreamMonitor(final InputStream in,
      final Consumer<String> inputHandler) {
    super("PIT Stream Monitor");
    this.in = in;
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-aggregator/src/main/java/org/pitest/aggregate/ReportAggregator.java`
#### Snippet
```java
  }

  private Collection<Path> asPaths(Collection<File> files) {
    return files.stream()
            .map(File::toPath)
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-aggregator/src/main/java/org/pitest/aggregate/ReportAggregator.java`
#### Snippet
```java
    }

    public Builder sourceCodeDirectories(final List<File> sourceCodeDirectories) {
      this.sourceCodeDirectories.clear();
      for (final File file : sourceCodeDirectories) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-aggregator/src/main/java/org/pitest/aggregate/ReportAggregator.java`
#### Snippet
```java
    }

    public Builder compiledCodeDirectories(final List<File> compiledCodeDirectories) {
      this.compiledCodeDirectories.clear();
      for (final File file : compiledCodeDirectories) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-aggregator/src/main/java/org/pitest/aggregate/ReportAggregator.java`
#### Snippet
```java
    }

    public Builder mutationResultsFiles(final List<File> mutationResultsFiles) {
      this.mutationResultsFiles.clear();
      for (final File file : mutationResultsFiles) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `pitest-aggregator/src/main/java/org/pitest/aggregate/ReportAggregator.java`
#### Snippet
```java
    }

    public Builder lineCoverageFiles(final List<File> lineCoverageFiles) {
      this.lineCoverageFiles.clear();
      for (final File file : lineCoverageFiles) {
```

### BoundedWildcard
Can generalize to `? extends BlockCoverage`
in `pitest-entry/src/main/java/org/pitest/coverage/export/DefaultCoverageExporter.java`
#### Snippet
```java

  @Override
  public void recordCoverage(final Collection<BlockCoverage> coverage) {
    final Writer out = this.outputStrategy
        .createWriterForFile("linecoverage.xml");
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `pitest-entry/src/main/java/org/pitest/coverage/execute/DefaultCoverageGenerator.java`
#### Snippet
```java
  }

  private void gatherCoverageData(final Collection<ClassInfo> tests,
      final CoverageData coverage) throws IOException, InterruptedException {

```

### BoundedWildcard
Can generalize to `? super CoverageResult`
in `pitest-entry/src/main/java/org/pitest/coverage/execute/Receive.java`
#### Snippet
```java
  private final Consumer<CoverageResult> handler;

  Receive(final Consumer<CoverageResult> handler) {
    this.handler = handler;
  }
```

### BoundedWildcard
Can generalize to `? super BlockLocation`
in `pitest-entry/src/main/java/org/pitest/coverage/execute/Receive.java`
#### Snippet
```java

  private void readProbeHit(final SafeDataInputStream is,
      final Set<BlockLocation> hits) {
    final long encoded = is.readLong();
    final BlockLocation location = probeToBlock(encoded);
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest-entry/src/main/java/org/pitest/sequence/Match.java`
#### Snippet
```java
  }

  default Match<T> or(final Match<T> other) {
    return (c, t) -> {
      Result r = this.test(c,t);
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest-entry/src/main/java/org/pitest/sequence/Match.java`
#### Snippet
```java
  }

  default Match<T> and(final Match<T> other) {
      return (c, t) -> {
        Result r = this.test(c,t);
```

### BoundedWildcard
Can generalize to `? super ClassLine`
in `pitest-entry/src/main/java/org/pitest/coverage/LegacyClassCoverage.java`
#### Snippet
```java
    }
    private void addTestToClassLine(ClassName clazz,
                                    Map<ClassLine, Set<TestInfo>> linesToTests,
                                    TestInfo test,
                                    int line) {
```

### BoundedWildcard
Can generalize to `? super ClassName`
in `pitest/src/main/java/org/pitest/mutationtest/execute/MutationTestWorker.java`
#### Snippet
```java

  public MutationTestWorker(
      final F3<ClassName, ClassLoader, byte[], Boolean> hotswap,
      final Mutater mutater, final ClassLoader loader, final boolean fullMutationMatrix) {
    this.loader = loader;
```

### BoundedWildcard
Can generalize to `? super ClassLoader`
in `pitest/src/main/java/org/pitest/mutationtest/execute/MutationTestWorker.java`
#### Snippet
```java

  public MutationTestWorker(
      final F3<ClassName, ClassLoader, byte[], Boolean> hotswap,
      final Mutater mutater, final ClassLoader loader, final boolean fullMutationMatrix) {
    this.loader = loader;
```

### BoundedWildcard
Can generalize to `? super LabelNode`
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java

  private static Match<AbstractInsnNode> storeJumpTarget(
      final SlotWrite<LabelNode> label) {
    return (c, t) -> {
      if (t instanceof JumpInsnNode ) {
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java


  public static <T extends AbstractInsnNode> Match<AbstractInsnNode> writeNodeToSlot(final SlotWrite<T> slot, final Class<T> clazz) {
    return (c, t) -> {
      if (clazz.isAssignableFrom(t.getClass()) ) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java


  public static <T extends AbstractInsnNode> Match<AbstractInsnNode> writeNodeToSlot(final SlotWrite<T> slot, final Class<T> clazz) {
    return (c, t) -> {
      if (clazz.isAssignableFrom(t.getClass()) ) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java
   * Records if a instruction matches the target, but always returns true
   */
  public static  Match<AbstractInsnNode> recordTarget(final SlotRead<AbstractInsnNode> target, final SlotWrite<Boolean> found) {
    return (c, t) -> {
      if (c.retrieve(target).get() == t) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java

  public static Match<AbstractInsnNode> aVariableAccess(
      final SlotWrite<Integer> counterVariable) {
    return (c, t) -> {
      if (t instanceof VarInsnNode) {
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java
  }

  private static void addLaunchJavaAgents(List<String> cmd) {
    final RuntimeMXBean rt = ManagementFactory.getRuntimeMXBean();
    final List<String> agents = FCollection.filter(rt.getInputArguments(),
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java
  }

  private static void removeFromClassPath(List<String> cmd, Predicate<String> match) {
    for (int i = cmd.size() - 1; i >= 0; i--) {
      if (match.test(cmd.get(i))) {
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java

  private static void addPITJavaAgent(JavaAgent agentJarLocator,
      List<String> cmd) {
    final Optional<String> jarLocation = agentJarLocator.getJarLocation();
    jarLocation.ifPresent(l -> cmd.add("-javaagent:" + l));
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java
  }

  private void createClasspathJar(String classPath, final List<String> cmd) {
    if (this.processArgs.useClasspathJar()) {
      try {
```

### BoundedWildcard
Can generalize to `? super MutationInterceptor`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/CompoundMutationInterceptor.java`
#### Snippet
```java
  }

  public CompoundMutationInterceptor filter(Predicate<MutationInterceptor> p) {
    return new CompoundMutationInterceptor(children.stream()
            .filter(p)
```

### BoundedWildcard
Can generalize to `? super List`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/DefaultGrouper.java`
#### Snippet
```java

  private void shrinkToMaximumUnitSize(
      final List<List<MutationDetails>> chunked,
      final Collection<MutationDetails> each) {
    if (this.unitSize > 0) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/logging/LoggingCallsFilter.java`
#### Snippet
```java
  private int                 currentLineNumber;

  LoggingLineScanner(final Set<Integer> lines, final Set<String> loggingClasses) {
    super(ASMVersion.ASM_VERSION);
    this.lines = lines;
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/timeout/AvoidForLoopCounterFilter.java`
#### Snippet
```java
  }

  private static Match<AbstractInsnNode> recordInstruction(SlotWrite<AbstractInsnNode> slot) {
    return (c,t) -> result(true, c.store(slot, t));
  }
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/StringSwitchFilter.java`
#### Snippet
```java
            );

    private static Match<AbstractInsnNode> store(SlotWrite<AbstractInsnNode> slot) {
        return (c,n) -> result(true, c.store(slot, n));
    }
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/AssertFilter.java`
#### Snippet
```java


    private static Match<AbstractInsnNode> store(SlotWrite<AbstractInsnNode> slot) {
        return (c, n) -> result(true, c.store(slot, n));
    }
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/EnumSwitchFilter.java`
#### Snippet
```java
    }

    private static Match<AbstractInsnNode> store(SlotWrite<AbstractInsnNode> slot) {
        return (c, n) -> result(true, c.store(slot, n));
    }
```

### BoundedWildcard
Can generalize to `? extends AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ForEachLoopFilter.java`
#### Snippet
```java
  }

  private boolean mightContainForLoop(List<AbstractInsnNode> instructions) {
    return instructions.stream()
            .anyMatch(hasNextMethodCall().or(ARRAYLENGTH).asPredicate());
```

### BoundedWildcard
Can generalize to `? extends List`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/TryWithResourcesFilter.java`
#### Snippet
```java
  }

  private static Match<AbstractInsnNode> isLabel(SlotRead<List<LabelNode>> read) {
    return aLabel().and((c,t) -> result(c.retrieve(read).get().contains(t), c));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PathNamePredicate.java`
#### Snippet
```java
  private final Predicate<String> stringFilter;

  public PathNamePredicate(final Predicate<String> stringFilter) {
    this.stringFilter = stringFilter;
  }
```

### BoundedWildcard
Can generalize to `? extends MutationResultListener`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/CompoundTestListener.java`
#### Snippet
```java
  private final Iterable<MutationResultListener> children;

  public CompoundTestListener(final Iterable<MutationResultListener> children) {
    this.children = children;
  }
```

### BoundedWildcard
Can generalize to `? super MutationDetails`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/InlinedFinallyBlockFilter.java`
#### Snippet
```java
  }

  private void checkForInlinedCode(Collection<MutationDetails> mutantsToReturn,
                                  Collection<MutationDetails> similarMutantsOnSameLine) {

```

### BoundedWildcard
Can generalize to `? extends List`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/InlinedFinallyBlockFilter.java`
#### Snippet
```java
  }

  private static Match<AbstractInsnNode> handlerLabel(Slot<List> handlers) {
    return (c,t) -> {
      if (t instanceof LabelNode) {
```

### BoundedWildcard
Can generalize to `? super Location`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/staticinitializers/StaticInitializerInterceptor.java`
#### Snippet
```java
  }

  private void visit(Map<Location, List<Call>> callTree, Set<Location> visited, Location l) {
    // avoid stack overflow if methods call each other in a cycle
    if (visited.contains(l)) {
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EmptyReturnsFilter.java`
#### Snippet
```java


    private static Match<AbstractInsnNode> store(SlotWrite<AbstractInsnNode> slot) {
        return (c, n) -> result(true, c.store(slot, n));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PluginServices.java`
#### Snippet
```java
  }

  private <T extends ProvidesFeature> Collection<T> adjustMissingFeatures(Collection<T> allPlugins) {
    // Some features are 'missing', just placeholders to features that
    // can be provided by an external plugin. We list them so it is
```

### BoundedWildcard
Can generalize to `? super Feature`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/SettingsFactory.java`
#### Snippet
```java
  }

  public void describeFeatures(Consumer<Feature> enabled, Consumer<Feature> disabled) {
    final FeatureParser parser = new FeatureParser();
    final Collection<ProvidesFeature> available = new ArrayList<>(this.plugins.findFeatures());
```

### BoundedWildcard
Can generalize to `? super Feature`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/SettingsFactory.java`
#### Snippet
```java
  }

  public void describeFeatures(Consumer<Feature> enabled, Consumer<Feature> disabled) {
    final FeatureParser parser = new FeatureParser();
    final Collection<ProvidesFeature> available = new ArrayList<>(this.plugins.findFeatures());
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `pitest-entry/src/main/java/org/pitest/mutationtest/verify/DefaultBuildVerifier.java`
#### Snippet
```java

  private void checkAtLeastOneClassHasLineNumbers(
      final Collection<ClassInfo> codeClasses) {
    // perform only a weak check for line numbers as
    // some jvm languages are not guaranteed to produce them for all classes
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `pitest-entry/src/main/java/org/pitest/mutationtest/verify/DefaultBuildVerifier.java`
#### Snippet
```java
  }

  private boolean hasAtLeastOneClass(final Collection<ClassInfo> codeClasses) {
    return FCollection.contains(codeClasses, aConcreteClass());
  }
```

### BoundedWildcard
Can generalize to `? extends Future`
in `pitest-entry/src/main/java/org/pitest/mutationtest/execute/MutationAnalysisExecutor.java`
#### Snippet
```java
  }

  private void processResult(List<Future<MutationMetaData>> results)
      throws InterruptedException, ExecutionException {
    for (final Future<MutationMetaData> f : results) {
```

### BoundedWildcard
Can generalize to `? extends MutationAnalysisUnit`
in `pitest-entry/src/main/java/org/pitest/mutationtest/execute/MutationAnalysisExecutor.java`
#### Snippet
```java

  // entry point for mutation testing
  public void run(final List<MutationAnalysisUnit> testUnits) {

    LOG.fine("Running " + testUnits.size() + " units");
```

### BoundedWildcard
Can generalize to `? extends MutationResultListener`
in `pitest-entry/src/main/java/org/pitest/mutationtest/execute/MutationAnalysisExecutor.java`
#### Snippet
```java

  public MutationAnalysisExecutor(int numberOfThreads,
      List<MutationResultListener> listeners) {
    this.listeners = listeners;
    this.executor = new ThreadPoolExecutor(numberOfThreads, numberOfThreads,
```

### BoundedWildcard
Can generalize to `? super MutationIdentifier`
in `pitest-entry/src/main/java/org/pitest/mutationtest/execute/MutationTestCommunicationThread.java`
#### Snippet
```java
    private final Map<MutationIdentifier, MutationStatusTestPair> idMap;

    Receive(final Map<MutationIdentifier, MutationStatusTestPair> idMap) {
      this.idMap = idMap;
    }
```

### BoundedWildcard
Can generalize to `? super MutationStatusTestPair`
in `pitest-entry/src/main/java/org/pitest/mutationtest/execute/MutationTestCommunicationThread.java`
#### Snippet
```java
    private final Map<MutationIdentifier, MutationStatusTestPair> idMap;

    Receive(final Map<MutationIdentifier, MutationStatusTestPair> idMap) {
      this.idMap = idMap;
    }
```

### BoundedWildcard
Can generalize to `? extends StatusCount`
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/Score.java`
#### Snippet
```java
  private final long totalWithCoverage;

  public Score(final String name, Iterable<StatusCount> counts,
               long totalMutations, long totalDetected, long totalWithCoverage) {
    this.mutatorName = name;
```

### BoundedWildcard
Can generalize to `? extends ClassHistory`
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/DefaultCodeHistory.java`
#### Snippet
```java
  public DefaultCodeHistory(final ClassInfoSource code,
      final Map<MutationIdentifier, MutationStatusTestPair> previousResults,
      final Map<ClassName, ClassHistory> previousClassPath) {
    this.code = code;
    this.previousResults = previousResults;
```

### BoundedWildcard
Can generalize to `? extends Reader`
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/ObjectOutputStreamHistoryStore.java`
#### Snippet
```java
  }

  private BufferedReader createReader(Optional<Reader> input) {
    return input.map(BufferedReader::new)
            .orElse(null);
```

### BoundedWildcard
Can generalize to `? extends ReportGenerationStrategy`
in `pitest-maven/src/main/java/org/pitest/maven/report/generator/ReportGenerationManager.java`
#### Snippet
```java

  public ReportGenerationManager(final ReportSourceLocator reportLocator,
      final List<ReportGenerationStrategy> reportGenerationStrategyList) {
    this.reportLocator = reportLocator;
    this.reportGenerationStrategyList = reportGenerationStrategyList;
```

### BoundedWildcard
Can generalize to `? super MavenProject`
in `pitest-maven/src/main/java/org/pitest/maven/AbstractPitMojo.java`
#### Snippet
```java

  public AbstractPitMojo(final GoalStrategy strategy, final Predicate<Artifact> filter,
      final PluginServices plugins, final Predicate<MavenProject> emptyProjectCheck) {
    this.goalStrategy = strategy;
    this.filter = filter;
```

### BoundedWildcard
Can generalize to `? extends X`
in `pitest-maven/src/main/java/org/pitest/maven/AbstractPitMojo.java`
#### Snippet
```java
  }

  private <X> ArrayList<X> withoutNulls(List<X> originalList) {
    if (originalList == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-maven/src/main/java/org/pitest/maven/MojoToReportOptionsConverter.java`
#### Snippet
```java
  }

  private void addOwnDependenciesToClassPath(final List<String> classPath) {
    for (final Artifact dependency : filteredDependencies()) {
      this.log.info("Adding " + dependency.getGroupId() + ":"
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/AnnotatedLineFactory.java`
#### Snippet
```java
  public AnnotatedLineFactory(
      final Collection<MutationResult> mutations,
      final ReportCoverage statistics, final Collection<ClassInfo> classes) {
    this.mutations = mutations;
    this.statistics = statistics;
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationHtmlReportListener.java`
#### Snippet
```java

  private Collection<String> classInfoToNames(
      final Collection<ClassInfo> classes) {
    return FCollection.map(classes, classInfoToJavaName());
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  }

  private void checkNotTryingToMutateSelf(final Predicate<String> filter) {
    if (filter.test(Pitest.class.getName())) {
      throw new PitHelpError(Help.BAD_FILTER);
```

### BoundedWildcard
Can generalize to `? extends T`
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java
  }

  private Set<StateContext<T>> run(List<T> sequence, Context initialContext) {
    Set<StateContext<T>> currentState = new HashSet<>();
    addState(currentState, new StateContext<>(this.start, initialContext));
```

### BoundedWildcard
Can generalize to `? super StateContext`
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java


  private static <T> void addState(Set<StateContext<T>> set, StateContext<T> state) {

    if (state.state instanceof Split) {
```

### BoundedWildcard
Can generalize to `? super T`
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java
  private final State<T> start;

  NFASequenceMatcher(Match<T> ignore, State<T> state, boolean debug) {
    this.ignore = ignore;
    this.start = state;
```

## AbstractClassNeverImplemented
### AbstractClassNeverImplemented
Abstract class `Id` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/Id.java`
#### Snippet
```java
package org.pitest.util;

public abstract class Id {
  public static final byte DESCRIBE = 1;
  public static final byte REPORT   = 2;
```

### AbstractClassNeverImplemented
Abstract class `Unchecked` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/Unchecked.java`
#### Snippet
```java
package org.pitest.util;

public abstract class Unchecked {

  public static RuntimeException translateCheckedException(final Throwable ex) {
```

### AbstractClassNeverImplemented
Abstract class `Functions` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/Functions.java`
#### Snippet
```java
import java.util.function.Predicate;

public abstract class Functions {

  public static Function<String, String> classNameToJVMClassName() {
```

### AbstractClassNeverImplemented
Abstract class `IsolationUtils` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/IsolationUtils.java`
#### Snippet
```java
import static org.pitest.util.Unchecked.translateCheckedException;

public abstract class IsolationUtils {
  public static ClassLoader getContextClassLoader() {
    return Thread.currentThread().getContextClassLoader();
```

### AbstractClassNeverImplemented
Abstract class `StreamUtil` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/StreamUtil.java`
#### Snippet
```java
import java.nio.channels.WritableByteChannel;

public abstract class StreamUtil {

  public static byte[] streamToByteArray(final InputStream in)
```

### AbstractClassNeverImplemented
Abstract class `ServiceLoader` has no concrete subclass
in `pitest/src/main/java/org/pitest/util/ServiceLoader.java`
#### Snippet
```java
 *
 */
public abstract class ServiceLoader {

  public static <S> Collection<S> load(final Class<S> ifc) {
```

### AbstractClassNeverImplemented
Abstract class `FArray` has no concrete subclass
in `pitest/src/main/java/org/pitest/functional/FArray.java`
#### Snippet
```java
 * Slightly functional style operations for arrays.
 */
public abstract class FArray {

  public static <T> void filter(final T[] xs, final Predicate<T> predicate,
```

### AbstractClassNeverImplemented
Abstract class `Reflection` has no concrete subclass
in `pitest/src/main/java/org/pitest/reflection/Reflection.java`
#### Snippet
```java
 *
 */
public abstract class Reflection {

  public static Method publicMethod(final Class<?> clazz,
```

### AbstractClassNeverImplemented
Abstract class `Prelude` has no concrete subclass
in `pitest/src/main/java/org/pitest/functional/prelude/Prelude.java`
#### Snippet
```java
 *
 */
public abstract class Prelude {

  @SafeVarargs
```

### AbstractClassNeverImplemented
Abstract class `FCollection` has no concrete subclass
in `pitest/src/main/java/org/pitest/functional/FCollection.java`
#### Snippet
```java
 * Functional programming style operations for plain old Java iterables.
 */
public abstract class FCollection {

  public static <A, B> void mapTo(final Iterable<? extends A> as,
```

### AbstractClassNeverImplemented
Abstract class `CommandLineMessage` has no concrete subclass
in `pitest/src/main/java/org/pitest/mutationtest/execute/CommandLineMessage.java`
#### Snippet
```java
package org.pitest.mutationtest.execute;

public abstract class CommandLineMessage {

  public static void report(final String message) {
```

## IgnoreResultOfCall
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/UndatedReportDirCreationStrategy.java`
#### Snippet
```java
  public File createReportDir(final String base) {
    final File reportDir = new File(base);
    reportDir.mkdirs();
    return reportDir;
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/DatedDirectoryReportDirCreationStrategy.java`
#### Snippet
```java
    final File reportDir = new File(addPathSeparatorIfMissing(base)
        + timeString);
    reportDir.mkdirs();
    return reportDir;
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/DirectoryResultOutputStrategy.java`
#### Snippet
```java
        final File directoryFile = new File(directory);
        if (!directoryFile.exists()) {
          directoryFile.mkdirs();
        }
      }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/JarCreatingJarFinder.java`
#### Snippet
```java
    if (this.location.isPresent()) {
      final File f = new File(this.location.get());
      f.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/FileWriterFactory.java`
#### Snippet
```java
  @Override
  public PrintWriter create() {
    this.file.getParentFile().mkdirs();
    try {
      if (this.writer == null) {
```

## UnnecessaryUnboxing
### UnnecessaryUnboxing
Unnecessary unboxing `constant.intValue()`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/InlineConstantMutator.java`
#### Snippet
```java
      final Integer replacement;

      switch (constant.intValue()) {
      case 1:
        replacement = 0;
```

## RedundantMethodOverride
### RedundantMethodOverride
Method `visitMethodInsn()` only delegates to its super method
in `pitest/src/main/java/org/pitest/coverage/analysis/ArrayProbeCoverageMethodVisitor.java`
#### Snippet
```java

  @Override
  public void visitMethodInsn(int opcode, String owner, String name,
      String desc, boolean itf) {

```

### RedundantMethodOverride
Method `visitFieldInsn()` only delegates to its super method
in `pitest/src/main/java/org/pitest/coverage/analysis/ArrayProbeCoverageMethodVisitor.java`
#### Snippet
```java

  @Override
  public void visitFieldInsn(int opcode, String owner, String name,
      String desc) {
    super.visitFieldInsn(opcode, owner, name, desc);
```

### RedundantMethodOverride
Method `visitTryCatchBlock()` only delegates to its super method
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/NullMutateEverything.java`
#### Snippet
```java

  @Override
  public void visitTryCatchBlock(Label start, Label end, Label handler,
      String type) {
    // Can't mutate try catch blocks as they are not modelled as an instruction in ASM
```

### RedundantMethodOverride
Method `visitMethodInsn()` only delegates to its super method
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/MemberVariableMutator.java`
#### Snippet
```java
     */
    @Override
    public void visitMethodInsn(final int opcode, final String owner,
        final String name, final String desc, boolean itf) {
      super.visitMethodInsn(opcode, owner, name, desc, itf);
```

## ThrowFromFinallyBlock
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java
        }
      } catch (final IOException e) {
        throw translateCheckedException(e);
      }
    }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `pitest-aggregator/src/main/java/org/pitest/aggregate/DataLoader.java`
#### Snippet
```java
          inputStream.close();
        } catch (IOException e) {
          throw new ReportAggregationException(CANNOT_CLOSE_ERR, e);
        }
      }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `pitest-entry/src/main/java/org/pitest/util/SocketReadingCallable.java`
#### Snippet
```java
        this.socket.close();
      } catch (final IOException e) {
        throw Unchecked.translateCheckedException(e);
      }
    }
```

## IfStatementWithIdenticalBranches
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/blocks/BlockTrackingMethodDecorator.java`
#### Snippet
```java
      private void visitAnything() {
        if ((i == curBlock.getFirstInstruction())) {
          if (i == 0) {
            //ignore the very first block since we are 0 based
            if (!blocks.isEmpty()) {
```

## UnnecessarySuperQualifier
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/RemoveConditionalMutator.java`
#### Snippet
```java
      case Opcodes.IF_ICMPLE:
      case Opcodes.IF_ICMPLT:
        super.visitInsn(Opcodes.POP2);
        break;
      default:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/RemoveConditionalMutator.java`
#### Snippet
```java
        break;
      default:
        super.visitInsn(Opcodes.POP);
      }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/MemberVariableMutator.java`
#### Snippet
```java
        // pop the values which PUTFIELD would have used
        if (Type.getType(desc).getSize() == 2) {
          super.visitInsn(Opcodes.POP2);
          super.visitInsn(Opcodes.POP);
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/MemberVariableMutator.java`
#### Snippet
```java
        if (Type.getType(desc).getSize() == 2) {
          super.visitInsn(Opcodes.POP2);
          super.visitInsn(Opcodes.POP);
        } else {
          super.visitInsn(Opcodes.POP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/MemberVariableMutator.java`
#### Snippet
```java
          super.visitInsn(Opcodes.POP);
        } else {
          super.visitInsn(Opcodes.POP);
          super.visitInsn(Opcodes.POP);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/MemberVariableMutator.java`
#### Snippet
```java
        } else {
          super.visitInsn(Opcodes.POP);
          super.visitInsn(Opcodes.POP);
        }
      } else {
```

## NestedAssignment
### NestedAssignment
Result of assignment expression used
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/OptionsParser.java`
#### Snippet
```java
      try (BufferedReader classPathFileBR = new BufferedReader(new FileReader(userArgs.valueOf(this.classPathFile).getAbsoluteFile()))) {
        String element;
        while ((element = classPathFileBR.readLine()) != null) {
          elements.add(element);
        }
```

### NestedAssignment
Result of assignment expression used
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java
      int numRead = 0;

      while ((numRead = reader.read(buf)) != -1) {
        final String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
```

### NestedAssignment
Result of assignment expression used
in `pitest-entry/src/main/java/org/pitest/util/StreamMonitor.java`
#### Snippet
```java

      String output;
      while ( ( output = reader.readLine() ) != null ) {
        this.inputHandler.accept(output);
      }
```

## ReplaceAssignmentWithOperatorAssignment
### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `pitest/src/main/java/org/pitest/plugin/FeatureParser.java`
#### Snippet
```java
  private void extractValue(String part, Map<String, List<String>> vals) {
    final String[] pairs = part.split("\\[");
    for (int i = 0; i != pairs.length; i = i + 2) {
      final String key = pairs[i].trim();
      List<String> current = vals.get(key);
```

### ReplaceAssignmentWithOperatorAssignment
`this.probeCount = this.probeCount + number` could be simplified to 'this.probeCount += number'
in `pitest/src/main/java/org/pitest/coverage/CoverageClassVisitor.java`
#### Snippet
```java

  public void registerProbes(final int number) {
    this.probeCount = this.probeCount + number;
  }

```

### ReplaceAssignmentWithOperatorAssignment
`this.instructionIndex = this.instructionIndex + 1` could be simplified to 'this.instructionIndex += 1'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/MethodMutationContext.java`
#### Snippet
```java
  @Override
  public void increment() {
    this.instructionIndex = this.instructionIndex + 1;

  }
```

### ReplaceAssignmentWithOperatorAssignment
`total = total + each.getValue().duration()` could be simplified to 'total += each.getValue().duration()'
in `pitest-entry/src/main/java/org/pitest/util/Timings.java`
#### Snippet
```java
    long total = 0;
    for (final Entry<Stage, TimeSpan> each : this.timings.entrySet()) {
      total = total + each.getValue().duration();
      ps.println("> " + each.getKey() + " : " + each.getValue());
    }
```

### ReplaceAssignmentWithOperatorAssignment
`MutationStatisticsPrecursor.this.numberOfTestsRun = MutationStatisticsPrecursor.this.numberOfTestsRu...` could be simplified to 'MutationStatisticsPrecursor.this.numberOfTestsRun += mr.getNumberOfTestsRun()'
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
  private Consumer<MutationResult> register() {
    return mr -> {
      MutationStatisticsPrecursor.this.numberOfTestsRun = MutationStatisticsPrecursor.this.numberOfTestsRun
          + mr.getNumberOfTestsRun();
      final String key = mr.getDetails().getId().getMutator();
      ScorePrecursor total = MutationStatisticsPrecursor.this.mutatorTotalMap
```

## FieldAccessedSynchronizedAndUnsynchronized
### FieldAccessedSynchronizedAndUnsynchronized
Field `ignore` is accessed in both synchronized and unsynchronized contexts
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
    // we do not want to transform classes from this as they are already handled
    // by the primary mechanism
    private static ClassLoader ignore;

    // Map of loaders we have transformed the current class in, so we can restore them
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentMutant` is accessed in both synchronized and unsynchronized contexts
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
public class CatchNewClassLoadersTransformer implements ClassFileTransformer {

    private static byte[] currentMutant;
    private static String currentClass;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentClass` is accessed in both synchronized and unsynchronized contexts
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java

    private static byte[] currentMutant;
    private static String currentClass;

    // The context classloader at the point pitest started.
```

## EmptyMethod
### EmptyMethod
All implementations of this method are empty
in `pitest/src/main/java/org/pitest/coverage/analysis/AbstractCoverageStrategy.java`
#### Snippet
```java
  abstract void prepare();

  abstract void generateProbeReportCode();

  abstract void insertProbe();
```

### EmptyMethod
All implementations of this method are empty
in `pitest/src/main/java/org/pitest/testapi/TestListener.java`
#### Snippet
```java
public interface TestListener {

  void onRunStart();

  void onTestStart(Description d);
```

### EmptyMethod
All implementations of this method are empty
in `pitest/src/main/java/org/pitest/testapi/TestListener.java`
#### Snippet
```java
  void onTestFailure(TestResult tr);

  void onTestSkipped(TestResult tr);

  void onTestSuccess(TestResult tr);
```

### EmptyMethod
All implementations of this method are empty
in `pitest/src/main/java/org/pitest/testapi/TestListener.java`
#### Snippet
```java
  void onTestSuccess(TestResult tr);

  void onRunEnd();

}
```

## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/org/pitest/util/PitError.java`
#### Snippet
```java
  private static BiFunction<StringBuilder, String, StringBuilder> append() {
    return new BiFunction<StringBuilder, String, StringBuilder>() {
      private int position = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptingRunListener.java`
#### Snippet
```java
  private final org.pitest.testapi.Description description;
  private final ResultCollector                rc;
  private boolean                              failed = false;

  AdaptingRunListener(final org.pitest.testapi.Description description,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest/src/main/java/org/pitest/testapi/execute/ExitingResultCollector.java`
#### Snippet
```java

  private final ResultCollector child;
  private boolean               hadFailure = false;

  public ExitingResultCollector(final ResultCollector child) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/org/pitest/coverage/analysis/AbstractCoverageStrategy.java`
#### Snippet
```java
  private final InstructionCounter counter;

  protected int                    probeCount = 0;

  AbstractCoverageStrategy(List<Block> blocks, InstructionCounter counter,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/blocks/ConcreteBlockCounter.java`
#### Snippet
```java
public class ConcreteBlockCounter implements BlockCounter {

  private int     currentBlock = 0;
  private int     currentBlockThisMethod = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/blocks/ConcreteBlockCounter.java`
#### Snippet
```java

  private int     currentBlock = 0;
  private int     currentBlockThisMethod = 0;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/org/pitest/mutationtest/execute/CheckTestHasFailedResultListener.java`
#### Snippet
```java
  private final List<Description>   failingTests = new ArrayList<>();
  private final boolean       recordPassingTests;
  private int                 testsRun        = 0;

  public CheckTestHasFailedResultListener(boolean recordPassingTests) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest/src/main/java/sun/pitest/CodeCoverageStore.java`
#### Snippet
```java

  private static InvokeReceiver                invokeQueue;
  private static int                           classId           = 0;

  public static final String PROBE_FIELD_NAME                    = "$$pitCoverageProbes";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/process/ProcessArgs.java`
#### Snippet
```java
  private String              javaExecutable;
  private Map<String, String> environmentVariables;
  private boolean             useClasspathJar = false;

  private ProcessArgs(final String launchClassPath) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `pitest-entry/src/main/java/org/pitest/process/ProcessArgs.java`
#### Snippet
```java
  private List<String>        jvmArgs    = Collections.emptyList();
  private JavaAgent           javaAgentFinder;
  private File                workingDir = null;
  private String              javaExecutable;
  private Map<String, String> environmentVariables;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-entry/src/main/java/org/pitest/coverage/execute/DefaultCoverageGenerator.java`
#### Snippet
```java
      private final String[] spinner = new String[] { "\u0008/", "\u0008-",
          "\u0008\\", "\u0008|" };
      int i = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/SpinnerListener.java`
#### Snippet
```java
  private final PrintStream     out;

  private int                   position      = 0;

  public SpinnerListener(final PrintStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/MutationStatisticsPrecursor.java`
#### Snippet
```java
class MutationStatisticsPrecursor {
  private final Map<String, ScorePrecursor> mutatorTotalMap  = new HashMap<>();
  private long                              numberOfTestsRun = 0;

  public void registerResults(final Collection<MutationResult> results) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java
  private long numberOfMutations             = 0;
  private long numberOfMutationsDetected     = 0;
  private long numberOfMutationsWithCoverage = 0;

  public long getNumberOfFiles() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java
  private long numberOfLinesCovered          = 0;
  private long numberOfMutations             = 0;
  private long numberOfMutationsDetected     = 0;
  private long numberOfMutationsWithCoverage = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java
  private long numberOfFiles                 = 0;
  private long numberOfLines                 = 0;
  private long numberOfLinesCovered          = 0;
  private long numberOfMutations             = 0;
  private long numberOfMutationsDetected     = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java
public class MutationTotals {

  private long numberOfFiles                 = 0;
  private long numberOfLines                 = 0;
  private long numberOfLinesCovered          = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java
  private long numberOfLines                 = 0;
  private long numberOfLinesCovered          = 0;
  private long numberOfMutations             = 0;
  private long numberOfMutationsDetected     = 0;
  private long numberOfMutationsWithCoverage = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationTotals.java`
#### Snippet
```java

  private long numberOfFiles                 = 0;
  private long numberOfLines                 = 0;
  private long numberOfLinesCovered          = 0;
  private long numberOfMutations             = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  private TestGroupConfig                groupConfig;

  private boolean                        fullMutationMatrix            = false;

  private int                            mutationUnitSize;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  private Verbosity                      verbosity                      = Verbosity.DEFAULT;
  private boolean                        failWhenNoMutations            = false;
  private boolean                        skipFailingTests               = false;

  private final Collection<String>       outputs                        = new LinkedHashSet<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  private int                            mutationUnitSize;
  private boolean                        shouldCreateTimestampedReports = true;
  private boolean                        detectInlinedCode              = false;
  private boolean                        exportLineCoverage             = false;
  private int                            mutationThreshold;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  private boolean                        shouldCreateTimestampedReports = true;
  private boolean                        detectInlinedCode              = false;
  private boolean                        exportLineCoverage             = false;
  private int                            mutationThreshold;
  private int                            coverageThreshold;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java
  private final List<String>             jvmArgs                        = new ArrayList<>();

  private int                            numberOfThreads                = 0;
  private float                          timeoutFactor                  = PercentAndConstantTimeoutStrategy.DEFAULT_FACTOR;
  private long                           timeoutConstant                = PercentAndConstantTimeoutStrategy.DEFAULT_CONSTANT;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/ReportOptions.java`
#### Snippet
```java

  private Verbosity                      verbosity                      = Verbosity.DEFAULT;
  private boolean                        failWhenNoMutations            = false;
  private boolean                        skipFailingTests               = false;

```

## RedundantImplements
### RedundantImplements
Redundant interface declaration `ClassPathRoot`
in `pitest/src/main/java/org/pitest/classpath/ArchiveClassPathRoot.java`
#### Snippet
```java
 * ClassPathRoot wrapping a jar or zip file
 */
public class ArchiveClassPathRoot implements ClassPathRoot, IOHeavyRoot {

  private final File file;
```

### RedundantImplements
Redundant interface declaration `ClassPathRoot`
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
 * See the License for the specific language governing permissions and limitations under the License.
 */
public class DirectoryClassPathRoot implements ClassPathRoot, IOHeavyRoot {

  private final File root;
```

## CallToStringConcatCanBeReplacedByOperator
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
  @Override
  public InputStream getData(final String classname) throws IOException {
    final String filename = classname.replace('.', File.separatorChar).concat(
        ".class");
    final File file = new File(this.root, filename);
```

## ExceptionNameDoesntEndWithException
### ExceptionNameDoesntEndWithException
Exception class name `PitHelpError` does not end with 'Exception'
in `pitest/src/main/java/org/pitest/help/PitHelpError.java`
#### Snippet
```java
package org.pitest.help;

public class PitHelpError extends RuntimeException {

  private static final long serialVersionUID = 1L;
```

### ExceptionNameDoesntEndWithException
Exception class name `PitError` does not end with 'Exception'
in `pitest/src/main/java/org/pitest/util/PitError.java`
#### Snippet
```java
import org.pitest.functional.FCollection;

public final class PitError extends RuntimeException {

  private static final long serialVersionUID = 1L;
```

## RedundantStringFormatCall
### RedundantStringFormatCall
Redundant call to `format()`
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/MutationCoverage.java`
#### Snippet
```java
    final CoverageSummary coverage = combinedStatistics.getCoverageSummary();
    if (coverage != null) {
      ps.println(String.format(">> Line Coverage: %d/%d (%d%%)", coverage.getNumberOfCoveredLines(),
              coverage.getNumberOfLines(), coverage.getCoverage()));
    }
```

## ZeroLengthArrayInitialization
### ZeroLengthArrayInitialization
Allocation of zero length array
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java
  public ClassPath getComponent(final Predicate<ClassPathRoot> predicate) {
    return new ClassPath(FCollection.filter(this.root, predicate).toArray(
        new ClassPathRoot[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/MethodInfo.java`
#### Snippet
```java

  public MethodInfo() {
    this(new ClassInfo(0, 0, "", "", "", new String[0]), 0, "", "()V");
  }

```

## UnusedAssignment
### UnusedAssignment
Variable `numRead` initializer `0` is redundant
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
      char[] buf = new char[1024];
      int numRead = 0;

      while ((numRead = reader.read(buf)) != -1) {
```

## OptionalGetWithoutIsPresent
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/MutationCoverageReport.java`
#### Snippet
```java
    if (!pr.isOk()) {
      parser.printHelp();
      System.out.println(">>>> " + pr.getErrorMessage().get());
    } else {
      final ReportOptions data = pr.getOptions();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/MutationCoverageReport.java`
#### Snippet
```java
      throw Unchecked.translateCheckedException(result.getError().get());
    }
    return result.getStatistics().get();

  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java

  public String getLocalClassPath() {
    return this.root.cacheLocation().get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest/src/main/java/org/pitest/mutationtest/config/PrioritisingTestConfiguration.java`
#### Snippet
```java
                .map(Configuration::verifyEnvironment)
                .findFirst()
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
        .asJavaName());

    final ClassReader reader = new ClassReader(bytes.get());
    final ClassWriter w = new ComputeClassWriter(this.byteSource,
        this.computeCache, FrameOptions.pickFlags(bytes.get()));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java

    final List<MutationDetails> details = context.getMutationDetails(context
        .getTargetMutation().get());

    return new Mutant(details.get(0), w.toByteArray());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest/src/main/java/org/pitest/mutationtest/execute/HotSwap.java`
#### Snippet
```java
        || !this.lastMutatedClass.equals(clazzName)) {
      this.lastClassPreMutation = byteSource.getBytes(clazzName.asJavaName())
          .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/plugin/export/MutantExportInterceptor.java`
#### Snippet
```java
    try {
      Files.createDirectories(this.mutantsDir);
      writeBytecodeToDisk(this.source.getBytes(clazz.name().asJavaName()).get(), classDir);
    } catch (final IOException e) {
      throw new RuntimeException("Couldn't create direectory for " + clazz, e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java
  public static  Match<AbstractInsnNode> recordTarget(final SlotRead<AbstractInsnNode> target, final SlotWrite<Boolean> found) {
    return (c, t) -> {
      if (c.retrieve(target).get() == t) {
        return result(true, c.store(found, true));
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java

  public static  Match<AbstractInsnNode> isInstruction(final SlotRead<AbstractInsnNode> target) {
    return (c, t) -> result(c.retrieve(target).get() == t, c);
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/MutationSource.java`
#### Snippet
```java
    } else {
      final ClassTree tree = ClassTree
          .fromBytes(this.source.getBytes(clazz.asJavaName()).get());

      this.interceptor.begin(tree);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/RegionInterceptor.java`
#### Snippet
```java
        return a -> {
            final int instruction = a.getInstructionIndex();
            final MethodTree method = this.currentClass.method(a.getId().getLocation()).get();

            List<Region> regions = cache.computeIfAbsent(method, this::computeRegions);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/timeout/InfiniteLoopFilter.java`
#### Snippet
```java
        .filter(forLocation(each.getId().getLocation()))
        .findFirst();
    return infiniteLoopMatcher().matches(mutantMethod.get().instructions());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/timeout/InfiniteLoopFilter.java`
#### Snippet
```java

    final MethodTree method = this.currentClass.method(location)
        .get();

    //  give up if our matcher thinks loop is already infinite
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EqualsPerformanceShortcutFilter.java`
#### Snippet
```java

    return inEquals.stream()
        .filter(isShortcutEquals(maybeEquals.get(), m).negate())
        .collect(Collectors.toList());
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EqualsPerformanceShortcutFilter.java`
#### Snippet
```java
        .filter(MethodMatchers.forLocation(tree.asLocation()))
        .findFirst()
        .get();

    return ALWAYS_FALSE.matches(mutantEquals.instructions());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/timeout/AvoidForLoopCounterFilter.java`
#### Snippet
```java
    return a -> {
      final int instruction = a.getInstructionIndex();
      final MethodTree method = AvoidForLoopCounterFilter.this.currentClass.method(a.getId().getLocation()).get();
      final AbstractInsnNode mutatedInstruction = method.instruction(instruction);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/StringSwitchFilter.java`
#### Snippet
```java
        Context context = Context.start();
        List<Region> regions = STRING_SWITCH.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
        return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/StringSwitchFilter.java`
#### Snippet
```java
        Context context = Context.start();
        List<Region> regions = STRING_SWITCH.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
        return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/AssertFilter.java`
#### Snippet
```java
        Context context = Context.start();
        List<Region> regions = ASSERT_GET.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
        return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/AssertFilter.java`
#### Snippet
```java
        Context context = Context.start();
        List<Region> regions = ASSERT_GET.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
        return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ImplicitNullCheckFilter.java`
#### Snippet
```java
      final int instruction = a.getInstructionIndex();
      final MethodTree method = ImplicitNullCheckFilter.this.currentClass.method(a.getId().getLocation())
          .get();

      final AbstractInsnNode mutatedInstruction = method.instruction(instruction);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/MethodReferenceNullCheckFilter.java`
#### Snippet
```java
          .filter(MethodMatchers.forLocation(a.getId().getLocation()))
          .findFirst()
          .get();

      final AbstractInsnNode mutatedInstruction = method.instruction(instruction);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/EnumSwitchFilter.java`
#### Snippet
```java
        Context context = Context.start();
        return ENUM_SWITCH.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/EnumSwitchFilter.java`
#### Snippet
```java
        Context context = Context.start();
        return ENUM_SWITCH.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ForEachLoopFilter.java`
#### Snippet
```java
    Context context = Context.start(DEBUG).store(LOOP_INSTRUCTIONS.write(), new ArrayList<>());
    return ITERATOR_LOOP.contextMatches(method.instructions(), context).stream()
            .flatMap(c -> c.retrieve(LOOP_INSTRUCTIONS.read()).get().stream())
            .collect(Collectors.toSet());
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/TryWithResourcesFilter.java`
#### Snippet
```java

  private static Match<AbstractInsnNode> isLabel(SlotRead<List<LabelNode>> read) {
    return aLabel().and((c,t) -> result(c.retrieve(read).get().contains(t), c));
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/TryWithResourcesFilter.java`
#### Snippet
```java
    context = context.store(HANDLERS.write(), handlers);
    List<Region> regions = TRY_WITH_RESOURCES.contextMatches(method.instructions(), context).stream()
            .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
            .collect(Collectors.toList());
    return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/TryWithResourcesFilter.java`
#### Snippet
```java
    context = context.store(HANDLERS.write(), handlers);
    List<Region> regions = TRY_WITH_RESOURCES.contextMatches(method.instructions(), context).stream()
            .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
            .collect(Collectors.toList());
    return regions;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PathNamePredicate.java`
#### Snippet
```java

  private Boolean cacheLocationMatchesFilter(final ClassPathRoot classPathRoot) {
    final String cacheLocationValue = classPathRoot.cacheLocation().get();
    return this.stringFilter.test(cacheLocationValue);
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ForEachLoopFilter.java`
#### Snippet
```java
    return a -> {
      final int instruction = a.getInstructionIndex();
      final MethodTree method = currentClass.method(a.getId().getLocation()).get();

      //performance hack
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/ForEachLoopFilter.java`
#### Snippet
```java
  private static Match<AbstractInsnNode> mutationPoint() {
    return (c,t) -> {
      c.retrieve(LOOP_INSTRUCTIONS.read()).get().add(t);
      return result(true, c);
    };
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/InlinedFinallyBlockFilter.java`
#### Snippet
```java
      if (t instanceof LabelNode) {
        LabelNode label = (LabelNode) t;
        List<LabelNode> labels = c.retrieve(handlers.read()).get();
        return result(labels.contains(label), c);
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/InlinedFinallyBlockFilter.java`
#### Snippet
```java

  private boolean isInFinallyBlock(MutationDetails m) {
    MethodTree method = currentClass.method(m.getId().getLocation()).get();
    List<LabelNode> handlers = method.rawNode().tryCatchBlocks.stream()
            .filter(t -> t.type == null)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EmptyReturnsFilter.java`
#### Snippet
```java
        Context context = Context.start();
        return zeroValues.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(AVOID.read()).get(), c.retrieve(AVOID.read()).get()))
                .collect(Collectors.toList());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EmptyReturnsFilter.java`
#### Snippet
```java
        Context context = Context.start();
        return zeroValues.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(AVOID.read()).get(), c.retrieve(AVOID.read()).get()))
                .collect(Collectors.toList());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/DefaultCodeHistory.java`
#### Snippet
```java

    final Optional<ClassInfo> current = this.code.fetchClass(className);
    return !current.get().getHierarchicalId().equals(historic.getId());

  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-maven/src/main/java/org/pitest/maven/RunPitStrategy.java`
#### Snippet
```java
      throw new MojoExecutionException("fail", result.getError().get());
    }
    return result.getStatistics().get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/EntryPoint.java`
#### Snippet
```java

    final KnownLocationJavaAgentFinder ja = new KnownLocationJavaAgentFinder(
        jac.getJarLocation().get());

    final ResultOutputStrategy reportOutput = settings.getOutputStrategy();
```

## StringConcatenationInsideStringBufferAppend
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `pitest/src/main/java/org/pitest/util/PitError.java`
#### Snippet
```java
      public StringBuilder apply(final StringBuilder a, final String b) {
        this.position++;
        return a.append("\n " + this.position + " : " + b);
      }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `pitest/src/main/java/org/pitest/mutationtest/execute/CommandLineMessage.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("---------------------------------------------------------------------------------\n");
    sb.append(message + "\n");
    sb.append("---------------------------------------------------------------------------------\n");
    System.out.println(sb);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/xml/XMLReportListener.java`
#### Snippet
```java
  private String makeNodes(Tag topTag, List<Integer> values, final Tag tag) {
    StringBuilder sb = new StringBuilder();
    sb.append("<" + topTag + ">");
    for (Integer each : values) {
      sb.append(makeNode("" + each, tag));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/xml/XMLReportListener.java`
#### Snippet
```java
      sb.append(makeNode("" + each, tag));
    }
    sb.append("</" + topTag + ">");
    return sb.toString();
  }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/Score.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    for (final StatusCount each : this.counts) {
      sb.append(each + " ");
      i++;
      if ((i % 4) == 0) {
```

## IOResource
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `pitest/src/main/java/org/pitest/util/SafeDataOutputStream.java`
#### Snippet
```java
  private byte[] toByteArray(Serializable value) throws IOException {
    try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
      final ObjectOutput out = new ObjectOutputStream(bos);
      out.writeObject(value);
      out.flush();
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/ObjectOutputStreamHistoryStore.java`
#### Snippet
```java
    try {
      final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      final ObjectOutputStream objectOutputStream = new ObjectOutputStream(
          byteArrayOutputStream);
      objectOutputStream.writeObject(t);
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/ObjectOutputStreamHistoryStore.java`
#### Snippet
```java
      final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
          Base64.getDecoder().decode(string));
      final ObjectInputStream objectInputStream = new ObjectInputStream(
          byteArrayInputStream);
      return clazz.cast(objectInputStream.readObject());
```

## OptionalIsPresent
### OptionalIsPresent
Can be replaced with single expression in functional style
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java

    final Optional<ClassInfo> maybeInfo = nameToClassInfo(name);
    if (maybeInfo.isPresent()) {
      this.knownClasses.put(name, maybeInfo.get());
    }
```

## FieldMayBeStatic
### FieldMayBeStatic
Field `expectedOwner` may be 'static'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigDecimalMutator.java`
#### Snippet
```java
    private final MethodMutatorFactory factory;
    private final MutationContext context;
    private final String expectedOwner = "java/math/BigDecimal";

    private BigDecimalMathMutator(MethodMutatorFactory factory, MutationContext context,
```

### FieldMayBeStatic
Field `expectedOwner` may be 'static'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigIntegerMutator.java`
#### Snippet
```java
    private final MethodMutatorFactory factory;
    private final MutationContext context;
    private final String expectedOwner = "java/math/BigInteger";

    private BigIntegerMathMutator(MethodMutatorFactory factory, MutationContext context,
```

## UtilityClassWithoutPrivateConstructor
### UtilityClassWithoutPrivateConstructor
Class `HotSwapAgent` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/boot/HotSwapAgent.java`
#### Snippet
```java
import java.lang.instrument.UnmodifiableClassException;

public class HotSwapAgent {

  private static Instrumentation instrumentation;
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtil` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/util/StringUtil.java`
#### Snippet
```java
package org.pitest.util;

public class StringUtil {

  public static String newLine() {
```

### UtilityClassWithoutPrivateConstructor
Class `MutationCoverageReport` has only 'static' members, and lacks a 'private' constructor
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/MutationCoverageReport.java`
#### Snippet
```java
 * Entry point for command line interface
 */
public class MutationCoverageReport {

  public static void main(final String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Log` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/util/Log.java`
#### Snippet
```java
import java.util.logging.Logger;

public class Log {

  private static final Logger LOGGER = Logger.getLogger("PIT");
```

### UtilityClassWithoutPrivateConstructor
Class `ManifestUtils` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/util/ManifestUtils.java`
#### Snippet
```java
 * Ugly static methods to create and parse classpath manifests
 */
public class ManifestUtils {

  public static final String CLASSPATH_JAR_FILE_PREFIX = "pitest-classpath-jar-file-";
```

### UtilityClassWithoutPrivateConstructor
Class `FrameOptions` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/bytecode/FrameOptions.java`
#### Snippet
```java
import org.objectweb.asm.ClassWriter;

public class FrameOptions {

  private static final int JAVA_7 = 51;
```

### UtilityClassWithoutPrivateConstructor
Class `ASMVersion` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/bytecode/ASMVersion.java`
#### Snippet
```java
import org.objectweb.asm.Opcodes;

public class ASMVersion {
  public static final int ASM_VERSION = Opcodes.ASM9;
}
```

### UtilityClassWithoutPrivateConstructor
Class `CoverageMinion` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java
import static org.pitest.util.Unchecked.translateCheckedException;

public class CoverageMinion {

  private static final Logger LOG = Log.getLogger();
```

### UtilityClassWithoutPrivateConstructor
Class `ControlFlowAnalyser` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/coverage/analysis/ControlFlowAnalyser.java`
#### Snippet
```java
import static org.objectweb.asm.Opcodes.RETURN;

public class ControlFlowAnalyser {

  private static final int LIKELY_NUMBER_OF_LINES_PER_BLOCK = 7;
```

### UtilityClassWithoutPrivateConstructor
Class `Streams` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/functional/Streams.java`
#### Snippet
```java
import java.util.stream.Stream;

public class Streams {
  public static <T> Stream<T> fromOptional(java.util.Optional<T> opt) {
    return opt.map(Stream::of).orElseGet(Stream::empty);
```

### UtilityClassWithoutPrivateConstructor
Class `Mutator` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/Mutator.java`
#### Snippet
```java
import java.util.stream.Collectors;

public final class Mutator {

  private static final Map<String, List<MethodMutatorFactory>> MUTATORS;
```

### UtilityClassWithoutPrivateConstructor
Class `MemoryWatchdog` has only 'static' members, and lacks a 'private' constructor
in `pitest/src/main/java/org/pitest/mutationtest/execute/MemoryWatchdog.java`
#### Snippet
```java
import javax.management.NotificationListener;

public class MemoryWatchdog {
  // private static final Logger LOG = Log.getLogger();

```

### UtilityClassWithoutPrivateConstructor
Class `FileUtil` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java
import java.io.InputStreamReader;

public class FileUtil {

  public static String readToString(final InputStream is)
```

### UtilityClassWithoutPrivateConstructor
Class `AnalysisFunctions` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/AnalysisFunctions.java`
#### Snippet
```java
import org.pitest.mutationtest.engine.MutationDetails;

public class AnalysisFunctions {
  public static Function<MethodTree, Predicate<MutationDetails>> matchMutationsInMethod() {
    return method -> {
```

### UtilityClassWithoutPrivateConstructor
Class `MethodMatchers` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/MethodMatchers.java`
#### Snippet
```java
import org.pitest.mutationtest.engine.Location;

public class MethodMatchers {
  /**
   * Match a method based on its name, as methods can be overloaded
```

### UtilityClassWithoutPrivateConstructor
Class `ArgLineParser` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/process/ArgLineParser.java`
#### Snippet
```java
 * contain single or double quotes, which might be escaped.
 */
public class ArgLineParser {

    private static final String ESCAPE_CHAR = "\\";
```

### UtilityClassWithoutPrivateConstructor
Class `OpcodeMatchers` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/OpcodeMatchers.java`
#### Snippet
```java


public class OpcodeMatchers {

    public static final Match<AbstractInsnNode> NOP = opCode(Opcodes.NOP);
```

### UtilityClassWithoutPrivateConstructor
Class `QueryStart` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/sequence/QueryStart.java`
#### Snippet
```java
 * @param <T> type of sequence
 */
public class QueryStart<T> {

  public static <T> SequenceQuery<T> match(Match<T> p) {
```

### UtilityClassWithoutPrivateConstructor
Class `InstructionMatchers` has only 'static' members, and lacks a 'private' constructor
in `pitest-entry/src/main/java/org/pitest/bytecode/analysis/InstructionMatchers.java`
#### Snippet
```java
import org.pitest.sequence.SlotWrite;

public class InstructionMatchers {

  public static Match<AbstractInsnNode> anyInstruction() {
```

### UtilityClassWithoutPrivateConstructor
Class `ConfidenceMap` has only 'static' members, and lacks a 'private' constructor
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/ConfidenceMap.java`
#### Snippet
```java
import org.pitest.mutationtest.DetectionStatus;

class ConfidenceMap {

  private static final EnumSet<DetectionStatus> HIGH = EnumSet
```

## SimplifyStreamApiCallChains
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/config/Mutator.java`
#### Snippet
```java

    mutatorFactories.stream()
            .forEach(m -> m.register(MUTATORS));
  }

```

## OptionalContainsCollection
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/coverage/analysis/LineMapper.java`
#### Snippet
```java
    final Map<BlockLocation, Set<Integer>> map = new HashMap<>();

    final Optional<byte[]> maybeBytes = this.source.getBytes(clazz.asInternalName());
    // classes generated at runtime eg by mocking frameworks
    // will be instrumented but not available on the classpath
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classinfo/ClassByteArraySource.java`
#### Snippet
```java
   * @return bytes option of byte[]
   */
  Optional<byte[]> getBytes(String clazz);

}
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classpath/ClassPathByteArraySource.java`
#### Snippet
```java

  @Override
  public Optional<byte[]> getBytes(final String classname) {
    try {
      return Optional.ofNullable(this.classPath.getClassData(classname));
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classinfo/CachingByteArraySource.java`
#### Snippet
```java

  @Override
  public Optional<byte[]> getBytes(String clazz) {
    Optional<byte[]> maybeBytes = this.cache.get(clazz);
    if (maybeBytes != null) {
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classinfo/CachingByteArraySource.java`
#### Snippet
```java
  @Override
  public Optional<byte[]> getBytes(String clazz) {
    Optional<byte[]> maybeBytes = this.cache.get(clazz);
    if (maybeBytes != null) {
      return maybeBytes;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classinfo/CachingByteArraySource.java`
#### Snippet
```java

  private final ClassByteArraySource child;
  private final Map<String,Optional<byte[]>> cache;

  public CachingByteArraySource(ClassByteArraySource child, int maxSize) {
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classpath/ClassloaderByteArraySource.java`
#### Snippet
```java

  @Override
  public Optional<byte[]> getBytes(final String classname) {
    try {
      return Optional.ofNullable(this.cp.getClassData(classname));
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
   */
  private ClassReader typeInfo(final String type) {
    final Optional<byte[]> maybeBytes = this.bytes.getBytes(type);
    if (!maybeBytes.isPresent()) {
      throw new PitError("Could not find class defintiion for " + type);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
    final ClassContext context = new ClassContext();
    context.setTargetMutation(Optional.empty());
    Optional<byte[]> bytes = GregorMutater.this.byteSource.getBytes(
        classToMutate.asInternalName());
    
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/GregorMutater.java`
#### Snippet
```java
    context.setTargetMutation(Optional.ofNullable(id));

    final Optional<byte[]> bytes = this.byteSource.getBytes(id.getClassName()
        .asJavaName());

```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java

  private Optional<ClassInfo> nameToClassInfo(final ClassName name) {
    final Optional<byte[]> bytes = querySource(name);
    if (bytes.isPresent()) {
      final ClassInfoBuilder classData = ClassInfoVisitor.getClassInfo(name,
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java
  }

  public Optional<byte[]> querySource(final ClassName name) {
    if (this.unknownClasses.contains(name)) {
      return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/classinfo/Repository.java`
#### Snippet
```java
      return Optional.empty();
    }
    final Optional<byte[]> option = this.source.getBytes(name.asJavaName());
    if (option.isPresent()) {
      return option;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/classpath/CodeSource.java`
#### Snippet
```java

  @Override
  public Optional<byte[]> getBytes(String clazz) {
    return fetchClassBytes(ClassName.fromString(clazz));
  }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/classpath/CodeSource.java`
#### Snippet
```java
  }

  public Optional<byte[]> fetchClassBytes(final ClassName clazz) {
    return this.classRepository.querySource(clazz);
  }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/JarCreatingJarFinder.java`
#### Snippet
```java

  private byte[] classBytes(final String className) {
    final Optional<byte[]> bytes = this.classByteSource.getBytes(className);

    if (bytes.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/MutationCoverage.java`
#### Snippet
```java
    final ClassByteArraySource clSource = ClassloaderByteArraySource.fromContext();
    return clazz -> {
      final Optional<byte[]> maybeBytes = bas.getBytes(clazz);
      if (maybeBytes.isPresent()) {
        return maybeBytes;
```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'getFirstBlock' is still used
in `pitest/src/main/java/org/pitest/mutationtest/engine/MutationDetails.java`
#### Snippet
```java
   */
  @Deprecated
  public int getFirstBlock() {
    return this.blocks.get(0);
  }
```

## Convert2MethodRef
### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/coverage/LegacyClassCoverage.java`
#### Snippet
```java
    public Collection<TestInfo> getTestsForClass(ClassName clazz) {
        return this.lineCoverage.getOrDefault(clazz, Collections.emptyMap()).values().stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.toSet());
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/DefaultTestPrioritiser.java`
#### Snippet
```java
            .map(block -> new BlockLocation(mutation.getId().getLocation(), block))
            .flatMap(loc -> this.coverage.getTestsForBlockLocation(loc).stream())
            .collect(Collectors.toCollection(() -> new HashSet<>()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/staticinitializers/StaticInitializerInterceptor.java`
#### Snippet
```java
      // so collect a set of private methods within the class first
      Set<Location> privateMethods = tree.methods().stream()
              .filter(m -> m.isPrivate())
              .map(MethodTree::asLocation)
              .collect(Collectors.toSet());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/equivalent/EmptyReturnsFilter.java`
#### Snippet
```java
        this.returnMatch = returnMatch;
        this.mutatorIds = Arrays.stream(mutators)
                .map(m -> m.getGloballyUniqueId())
                .collect(Collectors.toSet());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PluginServices.java`
#### Snippet
```java
    Map<Feature, List<T>> missing = allPlugins.stream()
            .filter(f -> f.provides().isMissing())
            .collect(Collectors.groupingBy(f -> f.provides()));

    Map<Feature, List<T>> real = allPlugins.stream()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PluginServices.java`
#### Snippet
```java
    Map<Feature, List<T>> real = allPlugins.stream()
            .filter(f -> !f.provides().isMissing())
            .collect(Collectors.groupingBy(f -> f.provides()));

    Stream<T> notImplemented = missing.entrySet().stream()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/config/PluginServices.java`
#### Snippet
```java

    return Stream.concat(real.values().stream()
                    .flatMap(v -> v.stream()), notImplemented)
            .collect(Collectors.toList());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/DirectorySourceLocator.java`
#### Snippet
```java
                .distinct()
                .map(c -> toFileName(c, fileName))
                .map(file -> root.resolve(file))
                .filter(Files::exists)
                .filter(Files::isRegularFile)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pitest-maven/src/main/java/org/pitest/maven/AbstractPitMojo.java`
#### Snippet
```java

      String operators =  this.plugins.findMutationOperators().stream()
              .map(m -> m.getName())
              .collect(Collectors.joining(","));

```

## UnnecessaryToStringCall
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pitest/src/main/java/org/pitest/util/Log.java`
#### Snippet
```java
        final StringWriter sink = new StringWriter();
        throwable.printStackTrace(new PrintWriter(sink, true));
        buf.append(sink.toString());
      }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/Score.java`
#### Snippet
```java
      i++;
      if ((i % 4) == 0) {
        out.println("> " + sb.toString());
        sb = new StringBuilder();
      }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pitest-entry/src/main/java/org/pitest/mutationtest/statistics/Score.java`
#### Snippet
```java
      }
    }
    out.println("> " + sb.toString());
  }

```

## StringEqualsEmptyString
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/DirectorySourceLocator.java`
#### Snippet
```java

    private String toFileName(ClassName packge, String fileName) {
        if (packge.asJavaName().equals("")) {
            return fileName;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `pitest-ant/src/main/java/org/pitest/ant/PitestTask.java`
#### Snippet
```java

  private void setOption(final ConfigOption option, final String value) {
    if (!"".equals(value)) {
      this.options.put(option.getParamName(), value);
    }
```

## RedundantSuppression
### RedundantSuppression
Redundant suppression
in `pitest-entry/src/main/java/org/pitest/sequence/Context.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  <S> Optional<S> retrieve(SlotRead<S> slot);

  default boolean debug() {
```

### RedundantSuppression
Redundant suppression
in `pitest-entry/src/main/java/org/pitest/sequence/EmptyContext.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public <S> Optional<S> retrieve(SlotRead<S> slot) {
        return Optional.empty();
    }
```

### RedundantSuppression
Redundant suppression
in `pitest-maven/src/main/java/org/pitest/maven/NonEmptyProjectCheck.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public boolean test(MavenProject project) {
    return FCollection.contains(project.getTestCompileSourceRoots(), exists()) 
        && FCollection.contains(project.getCompileSourceRoots(), exists());
```

### RedundantSuppression
Redundant suppression
in `pitest-maven/src/main/java/org/pitest/maven/report/AbstractPitAggregationReportMojo.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private List<File> getCompiledDirs(final MavenProject project)
      throws Exception {
    final List<String> sourceRoots = new ArrayList<>();
```

## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'errorMessage'
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/ParseResult.java`
#### Snippet
```java

  private final ReportOptions  options;
  private final Optional<String> errorMessage;

  public ParseResult(final ReportOptions options, final String errorMessage) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'filter'
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java

  private final Class<?>                     clazz;
  private final Optional<Filter>               filter;


```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'filter'
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java

  private static String createName(final Class<?> clazz,
      final Optional<Filter> filter) {
    if (filter.isPresent()) {
      return filter.get().describe();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'filter'
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java

  public AdaptedJUnitTestUnit(
      final Class<?> clazz, final Optional<Filter> filter) {
    super(new org.pitest.testapi.Description(createName(clazz, filter), clazz));
    this.clazz = clazz;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'CLASS_RULE'
in `pitest/src/main/java/org/pitest/junit/JUnitCustomRunnerTestUnitFinder.java`
#### Snippet
```java

  @SuppressWarnings("rawtypes")
  private static final Optional<Class> CLASS_RULE = findClassRuleClass();


```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'testee'
in `pitest/src/main/java/org/pitest/coverage/TestInfo.java`
#### Snippet
```java

  public TestInfo(final String definingClass, final String name,
      final int time, final Optional<ClassName> testee, final int blocksCovered) {
    this.definingClass = internIfNotNull(definingClass);
    this.name = name;
```

### OptionalUsedAsFieldOrParameterType
`java.util.Optional` used as type for parameter 'opt'
in `pitest/src/main/java/org/pitest/functional/Streams.java`
#### Snippet
```java

public class Streams {
  public static <T> Stream<T> fromOptional(java.util.Optional<T> opt) {
    return opt.map(Stream::of).orElseGet(Stream::empty);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/ClassContext.java`
#### Snippet
```java
  }

  public void setTargetMutation(final Optional<MutationIdentifier> target) {
    this.target = target;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'target'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/ClassContext.java`
#### Snippet
```java
  private String                      sourceFile;

  private Optional<MutationIdentifier>  target       = Optional.empty();
  private final List<MutationDetails> mutations    = new ArrayList<>();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'killingTest'
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/csv/CSVReportListener.java`
#### Snippet
```java
  }

  private String createKillingTestDesc(final Optional<String> killingTest) {
    return killingTest.orElse("none");
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'killingTest'
in `pitest-entry/src/main/java/org/pitest/mutationtest/report/xml/XMLReportListener.java`
#### Snippet
```java
  }

  private String createKillingTestDesc(final Optional<String> killingTest) {
    return killingTest.map(s -> createTestDesc(Arrays.asList(s)))
            .orElse(null);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'error'
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/AnalysisResult.java`
#### Snippet
```java

  private final Optional<CombinedStatistics> statistics;
  private final Optional<Exception>          error;

  private AnalysisResult(final CombinedStatistics statistics,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'statistics'
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/AnalysisResult.java`
#### Snippet
```java
public final class AnalysisResult {

  private final Optional<CombinedStatistics> statistics;
  private final Optional<Exception>          error;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'location'
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/JarCreatingJarFinder.java`
#### Snippet
```java
      .getName();

  private Optional<String>             location              = Optional.empty();

  private final ClassByteArraySource classByteSource;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'input'
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/ObjectOutputStreamHistoryStore.java`
#### Snippet
```java

  public ObjectOutputStreamHistoryStore(final WriterFactory output,
      final Optional<Reader> input) {
    this.outputFactory = output;
    this.input = createReader(input);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'input'
in `pitest-entry/src/main/java/org/pitest/mutationtest/incremental/ObjectOutputStreamHistoryStore.java`
#### Snippet
```java
  }

  private BufferedReader createReader(Optional<Reader> input) {
    return input.map(BufferedReader::new)
            .orElse(null);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'historyWriter'
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/EntryPoint.java`
#### Snippet
```java
  }

  private HistoryStore makeHistoryStore(ReportOptions data,  Optional<WriterFactory> historyWriter) {
    final Optional<Reader> reader = data.createHistoryReader();
    if (!reader.isPresent() && !historyWriter.isPresent()) {
```

## SystemOutErr
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/boot/HotSwapAgent.java`
#### Snippet
```java
  public static void premain(final String agentArguments, // NO_UCD
      final Instrumentation inst) {
    System.out.println("Installing PIT agent");
    instrumentation = inst;
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/MutationCoverageReport.java`
#### Snippet
```java
    if (!pr.isOk()) {
      parser.printHelp();
      System.out.println(">>>> " + pr.getErrorMessage().get());
    } else {
      final ReportOptions data = pr.getOptions();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/coverage/CoverageTransformer.java`
#### Snippet
```java
        return transformBytes(pickLoader(loader), className, classfileBuffer);
      } catch (final RuntimeException t) {
        System.err.println("RuntimeException while transforming  " + className);
        t.printStackTrace();
        throw t;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-command-line/src/main/java/org/pitest/mutationtest/commandline/OptionsParser.java`
#### Snippet
```java
  public void printHelp() {
    try {
      this.parser.printHelpOn(System.out);
    } catch (final IOException ex) {
      throw Unchecked.translateCheckedException(ex);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java
      exitCode = ExitCode.TEST_PLUGIN_ISSUE;
    } catch (final Throwable ex) {
      ex.printStackTrace(System.out);
      LOG.log(Level.SEVERE, "Error calculating coverage. Process will exit.",
          ex);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/functional/prelude/Prelude.java`
#### Snippet
```java

  public static <T> Consumer<T> printlnWith(final T t) {
    return a -> System.out.println(t + " : " + a);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/functional/prelude/Prelude.java`
#### Snippet
```java

  public static <T> Consumer<T> println() {
    return printlnTo(System.out);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/mutationtest/execute/CommandLineMessage.java`
#### Snippet
```java
    sb.append(message + "\n");
    sb.append("---------------------------------------------------------------------------------\n");
    System.out.println(sb);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/mutationtest/execute/HotSwap.java`
#### Snippet
```java
    try {

      System.out.println("Hotswap loader " + loader);

      restoreLastClass(this.byteSource, clazzName, loader);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/mutationtest/execute/MutationTestMinion.java`
#### Snippet
```java
      this.reporter.done(ExitCode.OK);
    } catch (final Throwable ex) {
      ex.printStackTrace(System.out);
      LOG.log(Level.WARNING, "Error during mutation test", ex);
      this.reporter.done(ExitCode.UNKNOWN_ERROR);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/mutationtest/execute/MutationTestMinion.java`
#### Snippet
```java
      instance.run();
    } catch (final Throwable ex) {
      ex.printStackTrace(System.out);
      LOG.log(Level.WARNING, "Error during mutation test", ex);
    } finally {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/process/ProcessArgs.java`
#### Snippet
```java
  private final String        launchClassPath;
  private Consumer<String> stdout     = println(String.class);
  private Consumer<String> stdErr     = printlnTo(String.class, System.err);
  private List<String>        jvmArgs    = Collections.emptyList();
  private JavaAgent           javaAgentFinder;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/coverage/execute/DefaultCoverageGenerator.java`
#### Snippet
```java
        }
        if (DefaultCoverageGenerator.this.verbosity.showSpinner()) {
          System.out.printf("%s", this.spinner[this.i % this.spinner.length]);
        }
        this.i++;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/sequence/Context.java`
#### Snippet
```java
  default <T> void debug(String msg, T t) {
    if (debug()) {
      System.out.println(msg + " for " + t);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/coverage/CoverageData.java`
#### Snippet
```java

    if (description.getFirstTestClass() == null) {
      System.out.println(description);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/MutationCoverage.java`
#### Snippet
```java
  private void printStats(CombinedStatistics combinedStatistics) {
    MutationStatistics stats = combinedStatistics.getMutationStatistics();
    final PrintStream ps = System.out;

    ps.println(StringUtil.separatorLine('='));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/MutationCoverage.java`
#### Snippet
```java

    if (this.data.getVerbosity().showSpinner()) {
      ls.add(new SpinnerListener(System.out));
    }
    return ls;
```

## ConditionCoveredByFurtherCondition
### ConditionCoveredByFurtherCondition
Condition 's != null' covered by subsequent condition 's == EndMatch.MATCH'
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java
    return currentState.stream()
            .map(c -> c.state)
            .anyMatch(s -> s != null && s == EndMatch.MATCH);
  }

```

### ConditionCoveredByFurtherCondition
Condition 's.state != null' covered by subsequent condition 's.state == EndMatch.MATCH'
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java
    Set<StateContext<T>> currentState = run(sequence, initialContext);
    return currentState.stream()
            .filter(s -> s.state != null && s.state == EndMatch.MATCH)
            .map(c -> c.context)
            .collect(Collectors.toList());
```

## DynamicRegexReplaceableByCompiledPattern
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/util/Functions.java`
#### Snippet
```java

  public static Function<String, String> jvmClassToClassName() {
    return a -> a.replace("/", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/util/Functions.java`
#### Snippet
```java

  public static Function<String, String> classNameToJVMClassName() {
    return a -> a.replace(".", "/");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/util/Glob.java`
#### Snippet
```java
      rectifiedGlob = convertGlobToRegex(glob);
    }
    rectifiedGlob = rectifiedGlob.replace("+", "\\+");
    this.regex = Pattern.compile(rectifiedGlob);
  }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/util/ManifestUtils.java`
#### Snippet
```java
      Attributes att = mf.getMainAttributes();
      String cp = att.getValue(Attributes.Name.CLASS_PATH);
      String[] parts = cp.split("file:");
      return Arrays.stream(parts)
              .filter(part -> !part.isEmpty())
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java
  private static Predicate<String> convertToJVMClassFilter(
      final Predicate<String> child) {
    return a -> child.test(a.replace("/", "."));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/classpath/OtherClassLoaderClassPathRoot.java`
#### Snippet
```java
  public InputStream getData(final String name) {
    // TODO will this work for archives? Need to consider remote hetrogenous os
    return this.loader.getResourceAsStream(name.replace(".", "/") + ".class");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
   */
  private boolean typeImplements(String type, ClassReader info, final String itf) {
    final String cleanItf = itf.replace(".", "/");
    while (!"java/lang/Object".equals(type)) {
      final String[] itfs = info.getInterfaces();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/ClassContext.java`
#### Snippet
```java

  public String getJavaClassName() {
    return this.classInfo.getName().replace("/", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest/src/main/java/org/pitest/mutationtest/mocksupport/JavassistInputStreamInterceptorAdapater.java`
#### Snippet
```java

  private static String classToName(final Class<?> clazz) {
    return clazz.getName().replace(".", "/");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java
  public static String randomFilename() {
    return System.currentTimeMillis()
        + ("" + Math.random()).replaceAll("\\.", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-entry/src/main/java/org/pitest/process/ArgLineParser.java`
#### Snippet
```java
            return "";
        }
        return in.replaceAll("\\s", " ").trim();
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/annotations/ExcludedAnnotationInterceptor.java`
#### Snippet
```java

  boolean shouldAvoid(String desc) {
    final String matchAgainst = desc.replace(";", "");
    for (final String each : this.configuredAnnotations) {
      if (matchAgainst.endsWith(each)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/DirectorySourceLocator.java`
#### Snippet
```java
            return fileName;
        }
        return packge.asJavaName().replace(".", File.separator) + File.separator + fileName;
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-entry/src/main/java/org/pitest/mutationtest/tooling/JarCreatingJarFinder.java`
#### Snippet
```java
      throws IOException {
    final String className = clazz.getName();
    final ZipEntry ze = new ZipEntry(className.replace(".", "/") + ".class");
    jos.putNextEntry(ze);
    jos.write(classBytes(className));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-maven/src/main/java/org/pitest/maven/SurefireConfigConverter.java`
#### Snippet
```java

  private Predicate<String> filenameToClassFilter(String filename) {
    return new Glob(filename.replace(".java", "").replace("/", "."));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pitest-maven/src/main/java/org/pitest/maven/SurefireConfigConverter.java`
#### Snippet
```java

  private Predicate<String> filenameToClassFilter(String filename) {
    return new Glob(filename.replace(".java", "").replace("/", "."));
  }

```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `org.pitest.testapi` is unnecessary, and can be replaced with an import
in `pitest/src/main/java/org/pitest/junit/adapter/CustomRunnerExecutor.java`
#### Snippet
```java
  private final ResultCollector                rc;

  public CustomRunnerExecutor(final org.pitest.testapi.Description description,
      final Runner runner, final ResultCollector rc) {
    this.runner = runner;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.pitest.testapi` is unnecessary, and can be replaced with an import
in `pitest/src/main/java/org/pitest/junit/adapter/CustomRunnerExecutor.java`
#### Snippet
```java
public class CustomRunnerExecutor {

  private final org.pitest.testapi.Description description;
  private final Runner                         runner;
  private final ResultCollector                rc;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.pitest.testapi` is unnecessary, and can be replaced with an import
in `pitest/src/main/java/org/pitest/junit/adapter/AdaptedJUnitTestUnit.java`
#### Snippet
```java
  public AdaptedJUnitTestUnit(
      final Class<?> clazz, final Optional<Filter> filter) {
    super(new org.pitest.testapi.Description(createName(clazz, filter), clazz));
    this.clazz = clazz;
    this.filter = filter;
```

### UnnecessaryFullyQualifiedName
Qualifier `junit.runner` is unnecessary, and can be replaced with an import
in `pitest/src/main/java/org/pitest/junit/JUnitCompatibleConfiguration.java`
#### Snippet
```java
  public Optional<PitHelpError> verifyEnvironment() {
    try {
      final String version = junit.runner.Version.id();
      if (isInvalidVersion(version)) {
        return Optional.ofNullable(new PitHelpError(Help.WRONG_JUNIT_VERSION, version));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `pitest/src/main/java/org/pitest/functional/Streams.java`
#### Snippet
```java

public class Streams {
  public static <T> Stream<T> fromOptional(java.util.Optional<T> opt) {
    return opt.map(Stream::of).orElseGet(Stream::empty);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `pitest-entry/src/main/java/org/pitest/util/FileUtil.java`
#### Snippet
```java

  public static String readToString(final InputStream is)
      throws java.io.IOException {
    final StringBuilder fileData = new StringBuilder(1000);
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
```

## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `pitest/src/main/java/org/pitest/coverage/CoverageTransformer.java`
#### Snippet
```java
      } catch (final RuntimeException t) {
        System.err.println("RuntimeException while transforming  " + className);
        t.printStackTrace();
        throw t;
      }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationHtmlReportListener.java`
#### Snippet
```java
      cssWriter.close();
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationHtmlReportListener.java`
#### Snippet
```java
      writer.close();
    } catch (final IOException e) {
      e.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `pitest-html-report/src/main/java/org/pitest/mutationtest/report/html/MutationHtmlReportListener.java`
#### Snippet
```java
      writer.close();
    } catch (final IOException e) {
      e.printStackTrace();
    }

```

## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `AbstractTestUnit()` of an abstract class should not be declared 'public'
in `pitest/src/main/java/org/pitest/testapi/AbstractTestUnit.java`
#### Snippet
```java
  private final Description description;

  public AbstractTestUnit(final Description description) {
    this.description = description;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `MethodFilteringAdapter()` of an abstract class should not be declared 'public'
in `pitest/src/main/java/org/pitest/classinfo/MethodFilteringAdapter.java`
#### Snippet
```java
  private final F5<Integer, String, String, String, String[], Boolean> filter;

  public MethodFilteringAdapter(final ClassVisitor writer,
      final F5<Integer, String, String, String, String[], Boolean> filter) {
    super(ASMVersion.ASM_VERSION, writer);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInsnMutator()` of an abstract class should not be declared 'public'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/AbstractInsnMutator.java`
#### Snippet
```java
  private final MethodInfo           methodInfo;

  public AbstractInsnMutator(final MethodMutatorFactory factory,
      final MethodInfo methodInfo, final MutationContext context,
      final MethodVisitor delegateMethodVisitor) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJumpMutator()` of an abstract class should not be declared 'public'
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/AbstractJumpMutator.java`
#### Snippet
```java
  }

  public AbstractJumpMutator(final MethodMutatorFactory factory,
      final MutationContext context, final MethodVisitor writer) {
    super(ASMVersion.ASM_VERSION, writer);
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `type`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
    while (!"java/lang/Object".equals(type)) {
      b.append(';').append(type);
      type = info.getSuperName();
      info = typeInfo(type);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `info`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
      b.append(';').append(type);
      type = info.getSuperName();
      info = typeInfo(type);
    }
    return b;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
        }
      }
      type = info.getSuperName();
      info = typeInfo(type);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `info`
in `pitest/src/main/java/org/pitest/classinfo/ComputeClassWriter.java`
#### Snippet
```java
      }
      type = info.getSuperName();
      info = typeInfo(type);
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `bootstrapMethodHandle`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigDecimalMutator.java`
#### Snippet
```java
    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle,
        Object... bootstrapMethodArguments) {
      bootstrapMethodHandle = mutateHandle(bootstrapMethodHandle);
      Object[] methodArgs = new Object[bootstrapMethodArguments.length];
      for (int i = 0; i < bootstrapMethodArguments.length; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bootstrapMethodHandle`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/BigIntegerMutator.java`
#### Snippet
```java
    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle,
        Object... bootstrapMethodArguments) {
      bootstrapMethodHandle = mutateHandle(bootstrapMethodHandle);
      Object[] methodArgs = new Object[bootstrapMethodArguments.length];
      for (int i = 0; i < bootstrapMethodArguments.length; i++) {
```

## ReturnNull
### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/testapi/Description.java`
#### Snippet
```java
  private String internIfNotNull(final String string) {
    if (string == null) {
      return null;
    }
    return string.intern();
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/coverage/CoverageTransformer.java`
#### Snippet
```java
      return writer.toByteArray();
    } catch (AlreadyInstrumentedException ex) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/coverage/CoverageTransformer.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/coverage/TestInfo.java`
#### Snippet
```java
  private static String internIfNotNull(final String string) {
    if (string == null) {
      return null;
    }
    return string.intern();
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/coverage/execute/JavassistCoverageInterceptor.java`
#### Snippet
```java
      return writer.toByteArray();
    } catch (AlreadyInstrumentedException ex) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/ArchiveClassPathRoot.java`
#### Snippet
```java
        return new URL("jar:file:" + zip.getName() + "!/" + entry.getName());
      } else {
        return null;
      }
    } finally {
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/ArchiveClassPathRoot.java`
#### Snippet
```java
      final ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");
      if (entry == null) {
        return null;
      }
      return StreamUtil.copyStream(zip.getInputStream(entry));
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
      return new FileInputStream(file);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/DirectoryClassPathRoot.java`
#### Snippet
```java
      return f.toURI().toURL();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/NameCachingRoot.java`
#### Snippet
```java
    final Collection<String> names = classNames();
    if (!names.contains(ClassName.fromString(name).asJavaName())) {
      return null;
    }
    return this.child.getData(name);
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/CompoundClassPathRoot.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/CompoundClassPathRoot.java`
#### Snippet
```java
      return findRootForResource(name);
    } catch (final IOException exception) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/CompoundClassPathRoot.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/classpath/ClassPath.java`
#### Snippet
```java
        return StreamUtil.streamToByteArray(is);
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/InlineConstantMutator.java`
#### Snippet
```java
        return 1D;
      default:
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/engine/gregor/mutators/experimental/SwitchMutator.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
            // loaded by parent
            if (clazz.getClassLoader() != loader) {
                return null;
            }
            return clazz;
```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
            // Does not occur when we only mutate for the Quarkus loader, but
            // left in place for when/if the list expands
            return null;
        }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
                            final ProtectionDomain protectionDomain, final byte[] classfileBuffer) {
        if (loader == null || ignore == loader) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
        // killed mutants if we insert.
        if (!loader.getClass().getName().startsWith("io.quarkus.bootstrap.classloading")) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
            // skip if class already loaded
            if (classBeingRedefined != null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/execute/CatchNewClassLoadersTransformer.java`
#### Snippet
```java
            return currentMutant;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `pitest/src/main/java/org/pitest/mutationtest/mocksupport/BendJavassistToMyWillTransformer.java`
#### Snippet
```java
      return writer.toByteArray();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pitest-maven/src/main/java/org/pitest/maven/report/PitAggregationMojo.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pitest-maven/src/main/java/org/pitest/maven/AbstractPitMojo.java`
#### Snippet
```java
  private <X> ArrayList<X> withoutNulls(List<X> originalList) {
    if (originalList == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `pitest-maven/src/main/java/org/pitest/maven/AbstractPitMojo.java`
#### Snippet
```java
    final MavenProject executionProject = this.project.getExecutionProject();
    if (executionProject == null) {
      return null;
    }
    return executionProject.getBasedir();
```

## UnnecessaryLocalVariable
### UnnecessaryLocalVariable
Local variable `v` is redundant
in `pitest/src/main/java/org/pitest/util/StringUtil.java`
#### Snippet
```java
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      final int v = c;

      if (v == 0) {
```

### UnnecessaryLocalVariable
Local variable `toExecute` is redundant
in `pitest/src/main/java/org/pitest/coverage/execute/CoverageMinion.java`
#### Snippet
```java

  private static List<TestUnit> removeTestsExecutedDuringDiscovery(List<TestUnit> tus) {
    List<TestUnit> toExecute = tus.stream()
            .filter(t -> !(t instanceof ExecutedInDiscovery))
            .collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `regions` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/StringSwitchFilter.java`
#### Snippet
```java
    protected List<Region> computeRegions(MethodTree method) {
        Context context = Context.start();
        List<Region> regions = STRING_SWITCH.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `regions` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/AssertFilter.java`
#### Snippet
```java
    protected List<Region> computeRegions(MethodTree method) {
        Context context = Context.start();
        List<Region> regions = ASSERT_GET.contextMatches(method.instructions(), context).stream()
                .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
                .collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `regions` is redundant
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/intercept/javafeatures/TryWithResourcesFilter.java`
#### Snippet
```java
    Context context = Context.start(DEBUG);
    context = context.store(HANDLERS.write(), handlers);
    List<Region> regions = TRY_WITH_RESOURCES.contextMatches(method.instructions(), context).stream()
            .map(c -> new Region(c.retrieve(START.read()).get(), c.retrieve(END.read()).get()))
            .collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `nextStates` is redundant
in `pitest-entry/src/main/java/org/pitest/sequence/SequenceQuery.java`
#### Snippet
```java
      }

      final Set<StateContext<T>> nextStates = step(currentState, t);
      currentState = nextStates;

```

## UseBulkOperation
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `pitest-entry/src/main/java/org/pitest/process/WrappingProcess.java`
#### Snippet
```java

    for (final Map.Entry<String, String> entry : environmentVariables.entrySet()) {
      environment.put(entry.getKey(), entry.getValue());
    }
  }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `pitest-entry/src/main/java/org/pitest/mutationtest/build/DefaultGrouper.java`
#### Snippet
```java
      for (final List<MutationDetails> ms : FCollection.splitToLength(
          this.unitSize, each)) {
        chunked.add(ms);
      }
    } else {
```

## CastCanBeRemovedNarrowingVariableType
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'm' to 'MethodNode'
in `pitest/src/main/java/org/pitest/coverage/analysis/LineMapper.java`
#### Snippet
```java
      cr.accept(classNode, ClassReader.EXPAND_FRAMES);
      for (final Object m : classNode.methods) {
        final MethodNode mn = (MethodNode) m;
        final Location l = Location.location(clazz,
            mn.name, mn.desc);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'each' to 'TryCatchBlockNode'
in `pitest/src/main/java/org/pitest/coverage/analysis/ControlFlowAnalyser.java`
#### Snippet
```java
      final Set<LabelNode> jumpTargets) {
    for (final Object each : mn.tryCatchBlocks) {
      final TryCatchBlockNode tcb = (TryCatchBlockNode) each;
      jumpTargets.add(tcb.handler);
    }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'dependencyObject' to 'Dependency'
in `pitest-maven/src/main/java/org/pitest/maven/report/PitAggregationMojo.java`
#### Snippet
```java
        Artifact.SCOPE_RUNTIME, Artifact.SCOPE_PROVIDED, Artifact.SCOPE_TEST);
    for (final Object dependencyObject : getProject().getDependencies()) {
      final Dependency dependency = (Dependency) dependencyObject;
      if (scopeList.contains(dependency.getScope())) {
        final MavenProject project = findProjectFromReactor(dependency);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'artifactObj' to 'Artifact'
in `pitest-maven/src/main/java/org/pitest/maven/report/AbstractPitAggregationReportMojo.java`
#### Snippet
```java
            PluginServices.makeForLoader(this.getClass().getClassLoader())))) {

      final Artifact artifact = (Artifact) artifactObj;
      sourceRoots.add(artifact.getFile().getAbsolutePath());
    }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'artifact' to 'Artifact'
in `pitest-maven/src/main/java/org/pitest/maven/MojoToReportOptionsConverter.java`
#### Snippet
```java

    for (Object artifact : this.mojo.getProject().getArtifacts()) {
      final Artifact dependency = (Artifact) artifact;

      if (this.mojo.getClasspathDependencyExcludes().contains(
```

