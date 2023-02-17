# maven-surefire 
 
# Bad smells
I found 492 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 106 | false |
| BoundedWildcard | 62 | false |
| UnnecessaryFullyQualifiedName | 45 | false |
| AssignmentToMethodParameter | 25 | false |
| DeprecatedIsStillUsed | 21 | false |
| RedundantSuppression | 17 | false |
| NonShortCircuitBoolean | 16 | false |
| Convert2Lambda | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 13 | false |
| NullableProblems | 12 | false |
| SystemOutErr | 11 | false |
| EmptyMethod | 10 | false |
| DefaultAnnotationParam | 8 | false |
| UtilityClassWithoutPrivateConstructor | 8 | true |
| NonProtectedConstructorInAbstractClass | 8 | true |
| NestedAssignment | 7 | false |
| InstanceofCatchParameter | 7 | false |
| ZeroLengthArrayInitialization | 6 | false |
| ConstantValue | 6 | false |
| DataFlowIssue | 6 | false |
| IgnoreResultOfCall | 5 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| RedundantFieldInitialization | 5 | false |
| SynchronizeOnThis | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| MissortedModifiers | 4 | false |
| IOResource | 4 | false |
| RedundantMethodOverride | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| UnnecessaryBoxing | 3 | false |
| Java8MapApi | 3 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| RedundantImplements | 2 | false |
| UnusedAssignment | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| Anonymous2MethodRef | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| CommentedOutCode | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| RefusedBequest | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| RegExpSimplifiable | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| InfiniteLoopStatement | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessarySemicolon | 1 | false |
| OptionalContainsCollection | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| CollectionContainsUrl | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ThreadRun | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| JavaReflectionInvocation | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| WaitNotInLoop | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[cats.size()\]'
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/GroupMatcherCategoryFilter.java`
#### Snippet
```java

            cats.remove( null );
            boolean result = matcher.enabled( cats.toArray( new Class<?>[cats.size()] ) );

            if ( !result )
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Filter\[ filters.size() \]'
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
            .ifPresent( filters::add );

        return filters.toArray( new Filter<?>[ filters.size() ] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new RunOrder\[result.size()\]'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/RunOrder.java`
#### Snippet
```java
            }
        }
        return result.toArray( new RunOrder[result.size()] );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[result.size()\]'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TestsToRun.java`
#### Snippet
```java
            result.add( clazz );
        }
        return result.toArray( new Class<?>[result.size()] );
    }

```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
    {
        Map<String, Setter> options = new HashMap<>();
        // options.put( ProviderParameterNames.TESTNG_GROUPS_PROP, new Setter( "setGroups", String.class ) );
        // options.put( ProviderParameterNames.TESTNG_EXCLUDEDGROUPS_PROP, new Setter( "setExcludedGroups", String.class
        // ) );
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `runTime`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/ThreadedExecutionScheduler.java`
#### Snippet
```java
    private final int numThreads;

    private final int runTime[];

    private final List<Class<?>>[] lists;
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/Classpath.java`
#### Snippet
```java

    @Override
    public Classpath clone()
    {
        return new Classpath( unmodifiableElements );
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `source.keySet()` may be replaced with 'entrySet()' iteration
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireProperties.java`
#### Snippet
```java
        if ( source != null )
        {
            for ( String key : source.keySet() )
            {
                String value = source.get( key );
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[,]` can be simplified to ','
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
        String property = parameters.getProviderProperties().get( key );
        return isBlank( property ) ? empty()
                        : of( stream( property.split( "[,]+" ) )
                                              .filter( StringUtils::isNotBlank )
                                              .map( String::trim )
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `isFailure | isError`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetStats.java`
#### Snippet
```java
        final boolean isFailure = failures > 0;
        final boolean isError = errors > 0;
        final boolean isFailureOrError = isFailure | isError;
        final boolean isSkipped = skipped > 0;
        final  MessageBuilder builder = buffer();
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `printedFailures | printedErrors | printedFlakes`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/DefaultReporterFactory.java`
#### Snippet
```java
        if ( reportConfiguration.isPrintSummary() )
        {
            if ( printedFailures | printedErrors | printedFlakes )
            {
                log( "" );
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `createOutErrElementsInside & stackTrace != null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
        }

        boolean hasNestedElements = createOutErrElementsInside & stackTrace != null;

        if ( stackTrace != null )
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `dumpError &= !classpathElementUri.absolute`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/JarManifestForkConfiguration.java`
#### Snippet
```java
                        toClasspathElementUri( parent, classPathElement, dumpLogDirectory, dumpError );
                // too many errors in dump file with the same root cause may slow down the Boot Manifest-JAR startup
                dumpError &= !classpathElementUri.absolute;
                cp.append( classpathElementUri.uri );
                if ( isDirectory( classPathElement ) && !classpathElementUri.uri.endsWith( "/" ) )
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isError |= stream.ioException() != null`
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/LineConsumerThread.java`
#### Snippet
```java
                {
                    String line = stream.nextLine();
                    isError |= stream.ioException() != null;
                    if ( !isError && !disabled )
                    {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isDefaultEncoding &= DEFAULT_STREAM_ENCODING_BYTES[i] == array[offset + i]`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            for ( int i = 0; i < length; i++ )
            {
                isDefaultEncoding &= DEFAULT_STREAM_ENCODING_BYTES[i] == array[offset + i];
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `patterns.hasExcludedMethodPatterns |= test.hasTestMethodPattern()`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        {
            excludedFilters.add( test );
            patterns.hasExcludedMethodPatterns |= test.hasTestMethodPattern();
        }
        else
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `patterns.hasIncludedMethodPatterns |= test.hasTestMethodPattern()`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        {
            includedFilters.add( test );
            patterns.hasIncludedMethodPatterns |= test.hasTestMethodPattern();
        }
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFailure | hasError`
in `surefire-logger-api/src/main/java/org/apache/maven/plugin/surefire/log/api/Level.java`
#### Snippet
```java
                                      boolean hasSkipped, boolean hasFlake )
    {
        boolean isRed = hasFailure | hasError;
        if ( isRed )
        {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasSkipped | hasFlake`
in `surefire-logger-api/src/main/java/org/apache/maven/plugin/surefire/log/api/Level.java`
#### Snippet
```java
            return FAILURE;
        }
        boolean isYellow = hasSkipped | hasFlake;
        if ( isYellow )
        {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.isDestroyed |= threadPool.awaitTermination( Long.MAX_VALUE, TimeUnit.NANOSECONDS )`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/AbstractThreadPoolStrategy.java`
#### Snippet
```java
                disable();
                threadPool.shutdown();
                this.isDestroyed |= threadPool.awaitTermination( Long.MAX_VALUE, TimeUnit.NANOSECONDS );
            }
            return isDestroyed;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `notInterrupted &= shutdownThreadPoolsAwaitingKilled()`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
            }
        }
        notInterrupted &= shutdownThreadPoolsAwaitingKilled();
        return notInterrupted;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isNotInterrupted &= slave.destroy()`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
            for ( Controller slave : slaves )
            {
                isNotInterrupted &= slave.destroy();
            }
            return isNotInterrupted;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `splitPool &= concurrency.capacity <= 0`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
            allGroups.put( METHODS, concurrency.methods );
            poolCapacity = concurrency.capacity;
            splitPool &= concurrency.capacity <= 0; // fault if negative; should not happen
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `notInterrupted &= m.shutdownThreadPoolsAwaitingKilled()`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
            if ( m != null )
            {
                notInterrupted &= m.shutdownThreadPoolsAwaitingKilled();
            }
            return notInterrupted;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `doParallel & pool != null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
        {
            SchedulingStrategy strategy =
                    doParallel & pool != null
                    ? new SharedThreadPoolStrategy( ParallelComputerBuilder.this.logger, pool )
                    : new InvokerStrategy( ParallelComputerBuilder.this.logger );
```

## RuleId[ruleID=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `surefire-providers/surefire-junit3/src/main/java/org/apache/maven/surefire/junit/TestListenerInvocationHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super TestOutputReportEntry`
in `surefire-providers/surefire-junit3/src/main/java/org/apache/maven/surefire/junit/JUnit3Reporter.java`
#### Snippet
```java
    private volatile RunMode runMode;

    JUnit3Reporter( TestReportListener<TestOutputReportEntry> reporter )
    {
        this.reporter = reporter;
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/Classpath.java`
#### Snippet
```java
    }

    private void addTo( @Nonnull Collection<String> c )
    {
        c.addAll( unmodifiableElements );
```

### BoundedWildcard
Can generalize to `? super Class`
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/GroupMatcherCategoryFilter.java`
#### Snippet
```java
    }

    private static void findSuperclassCategories( Set<Class<?>> cats, Class<?> clazz )
    {
        if ( IS_CATEGORY_INHERITED && hasSuperclass( clazz ) )
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/CombinedCategoryFilter.java`
#### Snippet
```java
    }

    private boolean allFiltersMatchDescription( Collection<Filter> filters, Description description )
    {
        for ( Filter f : filters )
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/CombinedCategoryFilter.java`
#### Snippet
```java
    }

    private String joinFilters( Collection<Filter> filters, String sep )
    {
        boolean isFirst = true;
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/CombinedCategoryFilter.java`
#### Snippet
```java
    }

    private boolean anyFilterMatchesDescription( Collection<Filter> filters, Description description )
    {
        for ( Filter f : filters )
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/ClasspathCache.java`
#### Snippet
```java
    }

    public static Classpath setCachedClasspath( @Nonnull String key, @Nonnull Set<Artifact> artifacts )
    {
        Collection<String> files = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends File`
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/SurefireReportParser.java`
#### Snippet
```java
    private final List<File> reportsDirectories;

    public SurefireReportParser( List<File> reportsDirectories, Locale locale, ConsoleLogger consoleLogger )
    {
        this.reportsDirectories = reportsDirectories;
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
    private final TestListResolver filter;

    public DependencyScanner( List<File> dependenciesToScan, TestListResolver filter )
    {
        this.dependenciesToScan = dependenciesToScan;
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
    }

    private static void scanArtifact( File artifact, TestFilter<String, String> filter, Set<String> classes )
        throws IOException
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
    }

    private static void scanArtifact( File artifact, TestFilter<String, String> filter, Set<String> classes )
        throws IOException
    {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
     * empty if none match
     */
    public static List<Artifact> filter( List<Artifact> artifacts, List<String> artifactPatterns )
    {
        if ( artifactPatterns == null || artifacts == null || artifacts.isEmpty() )
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
    }

    private void scan( Collection<String> scannedJavaClassNames,
                       TestFilter<String, String> filter, File basedir, String... subDirectories )
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java

    private void scan( Collection<String> scannedJavaClassNames,
                       TestFilter<String, String> filter, File basedir, String... subDirectories )
    {
        File[] filesAndDirs = basedir.listFiles();
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireDependencyResolver.java`
#### Snippet
```java
    }

    Map<String, Artifact> resolvePluginDependencies( Plugin plugin, Map<String, Artifact> pluginResolvedDependencies )
        throws MojoExecutionException
    {
```

### BoundedWildcard
Can generalize to `? super WrappedReportEntry`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java

    @SuppressWarnings( "checkstyle:parameternumber" )
    public TestSetRunListener( StatelessTestsetInfoConsoleReportEventListener<WrappedReportEntry, TestSetStats>
                                           consoleReporter,
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
```

### BoundedWildcard
Can generalize to `? super TestSetStats`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java

    @SuppressWarnings( "checkstyle:parameternumber" )
    public TestSetRunListener( StatelessTestsetInfoConsoleReportEventListener<WrappedReportEntry, TestSetStats>
                                           consoleReporter,
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
```

### BoundedWildcard
Can generalize to `? super WrappedReportEntry`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
    public TestSetRunListener( StatelessTestsetInfoConsoleReportEventListener<WrappedReportEntry, TestSetStats>
                                           consoleReporter,
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
                                       fileReporter,
                               StatelessReportEventListener<WrappedReportEntry, TestSetStats> simpleXMLReporter,
```

### BoundedWildcard
Can generalize to `? super TestSetStats`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
    public TestSetRunListener( StatelessTestsetInfoConsoleReportEventListener<WrappedReportEntry, TestSetStats>
                                           consoleReporter,
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
                                       fileReporter,
                               StatelessReportEventListener<WrappedReportEntry, TestSetStats> simpleXMLReporter,
```

### BoundedWildcard
Can generalize to `? super WrappedReportEntry`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
                                       fileReporter,
                               StatelessReportEventListener<WrappedReportEntry, TestSetStats> simpleXMLReporter,
                               ConsoleOutputReportEventListener testOutputReceiver,
                               StatisticsReporter statisticsReporter, boolean trimStackTrace,
```

### BoundedWildcard
Can generalize to `? super TestSetStats`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
                               StatelessTestsetInfoFileReportEventListener<WrappedReportEntry, TestSetStats>
                                       fileReporter,
                               StatelessReportEventListener<WrappedReportEntry, TestSetStats> simpleXMLReporter,
                               ConsoleOutputReportEventListener testOutputReceiver,
                               StatisticsReporter statisticsReporter, boolean trimStackTrace,
```

### BoundedWildcard
Can generalize to `? extends DefaultReporterFactory`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/DefaultReporterFactory.java`
#### Snippet
```java

    @Override
    public void mergeFromOtherFactories( Collection<DefaultReporterFactory> factories )
    {
        for ( DefaultReporterFactory factory : factories )
```

### BoundedWildcard
Can generalize to `? super Event`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/EventConsumerThread.java`
#### Snippet
```java
    public EventConsumerThread( @Nonnull String threadName,
                                @Nonnull ReadableByteChannel channel,
                                @Nonnull EventHandler<Event> eventHandler,
                                @Nonnull CountdownCloseable countdownCloseable,
                                @Nonnull ForkNodeArguments arguments )
```

### BoundedWildcard
Can generalize to `? extends WrappedReportEntry`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
     * @return the TestResultType for the given test
     */
    private TestResultType getTestResultType( List<WrappedReportEntry> methodEntryList )
    {
        List<ReportEntryType> testResultTypeList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
    public StatelessXmlReporter( File reportsDirectory, String reportNameSuffix, boolean trimStackTrace,
                                 int rerunFailingTestsCount,
                                 Map<String, Deque<WrappedReportEntry>> testClassMethodRunHistoryMap,
                                 String xsdSchemaLocation, String xsdVersion, boolean phrasedFileName,
                                 boolean phrasedSuiteName, boolean phrasedClassName, boolean phrasedMethodName )
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/MultipleFailureException.java`
#### Snippet
```java
    }

    private String toMessage( Function<Throwable, String> msg )
    {
        StringBuilder messages = new StringBuilder();
```

### BoundedWildcard
Can generalize to `? super Event`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/ThreadedStreamConsumer.java`
#### Snippet
```java
        private final MultipleFailureException errors = new MultipleFailureException();

        Pumper( EventHandler<Event> target )
        {
            this.target = target;
```

### BoundedWildcard
Can generalize to `? extends RunListener`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/Notifier.java`
#### Snippet
```java
    }

    public final Notifier addListeners( Collection<RunListener> given )
    {
        for ( RunListener listener : given )
```

### BoundedWildcard
Can generalize to `? extends Description`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/MatchDescriptions.java`
#### Snippet
```java
    private final List<Filter> filters = new ArrayList<>();

    public MatchDescriptions( Iterable<Description> descriptions )
    {
        for ( Description description : descriptions )
```

### BoundedWildcard
Can generalize to `? extends Future`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
    }

    private static RunResult awaitResultsDone( Collection<Future<RunResult>> results, ExecutorService executorService )
        throws SurefireBooterForkException
    {
```

### BoundedWildcard
Can generalize to `? extends Failure`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4ProviderUtil.java`
#### Snippet
```java
     * @return the list of descriptions
     */
    public static Set<Description> generateFailingTestDescriptions( List<Failure> allFailures )
    {
        Set<Description> failingTestDescriptions = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/LineConsumerThread.java`
#### Snippet
```java

    public LineConsumerThread( @Nonnull String threadName,
                               @Nonnull ReadableByteChannel channel, @Nonnull EventHandler<String> eventHandler,
                               @Nonnull CountdownCloseable countdownCloseable, @Nonnull Charset encoding )
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultScanResult.java`
#### Snippet
```java

    @Override
    public void writeTo( Map<String, String> properties )
    {
        for ( int i = 0, size = classes.size(); i < size; i++ )
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultScanResult.java`
#### Snippet
```java

    @Override
    public void writeTo( Map<String, String> properties )
    {
        for ( int i = 0, size = classes.size(); i < size; i++ )
```

### BoundedWildcard
Can generalize to `? super TestOutputReportEntry`
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java
    private volatile RunMode runMode;

    RunListenerAdapter( TestReportListener<TestOutputReportEntry> runListener )
    {
        this.runListener = runListener;
```

### BoundedWildcard
Can generalize to `? super OutputReportEntry`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/ConsoleOutputCapture.java`
#### Snippet
```java
        private final TestOutputReceiver<OutputReportEntry> target;

        ForwardingPrintStream( boolean stdout, TestOutputReceiver<OutputReportEntry> target )
        {
            super( new NullOutputStream() );
```

### BoundedWildcard
Can generalize to `? extends File`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGXmlTestSuite.java`
#### Snippet
```java
     * xml file(s). The XML files are suite definitions files according to TestNG DTD.
     */
    TestNGXmlTestSuite( List<File> suiteFiles, String testSourceDirectory, Map<String, String> confOptions,
                        File reportsDirectory, int skipAfterFailureCount )
    {
```

### BoundedWildcard
Can generalize to `? super TestOutputReportEntry`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
     * @param reportManager Instance to report suite status to
     */
    public TestNGReporter( TestReportListener<TestOutputReportEntry> reportManager )
    {
        this.reporter = reportManager;
```

### BoundedWildcard
Can generalize to `? extends MT`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
    protected AbstractStreamDecoder( @Nonnull ReadableByteChannel channel,
                                     @Nonnull ForkNodeArguments arguments,
                                     @Nonnull Map<Segment, MT> messageTypes )
    {
        this.channel = channel;
```

### BoundedWildcard
Can generalize to `? super Priority`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
    }

    private Map<String, Priority> getPriorities( Comparator<Priority> priorityComparator )
    {
        Map<String, Priority> priorities = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends PrioritizedTest`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
    }

    private static List<Class<?>> transformToClasses( List<PrioritizedTest> tests )
    {
        List<Class<?>> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super ResolvedTest`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    private static void updatedFilters( boolean isExcluded, ResolvedTest test, IncludedExcludedPatterns patterns,
                                        Collection<ResolvedTest> includedFilters,
                                        Collection<ResolvedTest> excludedFilters )
    {
```

### BoundedWildcard
Can generalize to `? super ResolvedTest`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    private static void updatedFilters( boolean isExcluded, ResolvedTest test, IncludedExcludedPatterns patterns,
                                        Collection<ResolvedTest> includedFilters,
                                        Collection<ResolvedTest> excludedFilters )
    {
        if ( isExcluded )
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
    }

    private void addPropIfNotNull( Map<String, String> options, Map<String, String> result, String prop )
    {
        if ( options.containsKey( prop ) )
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
    }

    private void addPropIfNotNull( Map<String, String> options, Map<String, String> result, String prop )
    {
        if ( options.containsKey( prop ) )
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
     * @param classMethodCounts A map of methods
     */
    JUnitCoreRunListener( ConcurrentRunListener reporter, Map<String, TestSet> classMethodCounts )
    {
        super( reporter );
```

### BoundedWildcard
Can generalize to `? super TestOutputReportEntry`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/LogicalStream.java`
#### Snippet
```java
    }

    void writeDetails( TestOutputReceiver<TestOutputReportEntry> outputReceiver )
    {
        for ( TestOutputReportEntry entry = output.poll(); entry != null; entry = output.poll() )
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
    }

    private static void printShutdownHook( Collection<String> executedTests, Collection<String> incompleteTests,
                                           Future<ShutdownResult> testsBeforeShutdown )
        throws ExecutionException, InterruptedException
```

### BoundedWildcard
Can generalize to `? super String`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
    }

    private static void printShutdownHook( Collection<String> executedTests, Collection<String> incompleteTests,
                                           Future<ShutdownResult> testsBeforeShutdown )
        throws ExecutionException, InterruptedException
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java

        private void addEngineByApi( String engineGroupId, String engineArtifactId, String engineVersion,
                                     Map<String, Artifact> providerArtifacts ) throws MojoExecutionException
        {
            for ( Artifact dep : resolve( engineGroupId, engineArtifactId, engineVersion, null, "jar" ) )
```

### BoundedWildcard
Can generalize to `? super Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java

        private void addEngineByApi( String engineGroupId, String engineArtifactId, String engineVersion,
                                     Map<String, Artifact> providerArtifacts ) throws MojoExecutionException
        {
            for ( Artifact dep : resolve( engineGroupId, engineArtifactId, engineVersion, null, "jar" ) )
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
    }

    private static Set<Artifact> retainInProcArtifactsUnique( Set<Artifact> providerArtifacts,
                                                         Artifact... inPluginArtifacts )
    {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
     * @return The filtered result
     */
    private static Set<Artifact> filterArtifacts( Set<Artifact> artifacts, ArtifactFilter filter )
    {
        Set<Artifact> filteredArtifacts = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        }

        private void alignProviderVersions( Map<String, Artifact> providerArtifacts ) throws MojoExecutionException
        {
            String version = junitPlatformArtifact.getBaseVersion();
```

### BoundedWildcard
Can generalize to `? super Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        }

        private void alignProviderVersions( Map<String, Artifact> providerArtifacts ) throws MojoExecutionException
        {
            String version = junitPlatformArtifact.getBaseVersion();
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        }

        private Classpath setCachedClasspath( @Nonnull String key, @Nonnull Set<Artifact> artifacts )
        {
            Collection<String> files = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
    }

    private static Classpath createInProcClasspath( Classpath providerClasspath, Set<Artifact> newArtifacts )
    {
        Classpath inprocClasspath = providerClasspath.clone();
```

### BoundedWildcard
Can generalize to `? extends Description`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/SingleThreadScheduler.java`
#### Snippet
```java
    }

    private Collection<Description> copyExisting( Collection<Description> descriptions )
    {
        Collection<Description> activeChildren = new ConcurrentLinkedQueue<>( descriptions );
```

### BoundedWildcard
Can generalize to `? extends GroupMatcher`
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/AndGroupMatcher.java`
#### Snippet
```java
    }

    public AndGroupMatcher( Collection<GroupMatcher> matchers )
    {
        for ( GroupMatcher matcher : matchers )
```

### BoundedWildcard
Can generalize to `? extends GroupMatcher`
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/OrGroupMatcher.java`
#### Snippet
```java
    }

    public OrGroupMatcher( Collection<GroupMatcher> matchers )
    {
        for ( GroupMatcher matcher : matchers )
```

### BoundedWildcard
Can generalize to `? extends Runner`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
    }

    private static List<Runner> removeNullRunners( Collection<Runner> runners )
    {
        final List<Runner> onlyRunners = new ArrayList<>( runners );
```

### BoundedWildcard
Can generalize to `? extends TestSet`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java

    ConcurrentRunListener( final ReporterFactory reporterFactory, boolean reportImmediately,
                           Map<String, TestSet> classMethodCounts )
    {
        this.reportImmediately = reportImmediately;
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nonnull private final Platform pluginPlatform;
    @Nonnull private final ConsoleLogger log;
    @Nonnull private final ForkNodeFactory forkNodeFactory;

    @SuppressWarnings( "checkstyle:parameternumber" )
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
{
    @Nonnull private final Classpath booterClasspath;
    @Nonnull private final File tempDirectory;
    @Nullable
    private final String debugLine;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nullable private final String argLine;
    @Nonnull private final Map<String, String> environmentVariables;
    @Nonnull private final String[] excludedEnvironmentVariables;
    private final boolean debug;
    private final int forkCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final String debugLine;
    @Nonnull private final File workingDirectory;
    @Nonnull private final Properties modelProperties;
    @Nullable private final String argLine;
    @Nonnull private final Map<String, String> environmentVariables;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final boolean reuseForks;
    @Nonnull private final Platform pluginPlatform;
    @Nonnull private final ConsoleLogger log;
    @Nonnull private final ForkNodeFactory forkNodeFactory;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nonnull private final File workingDirectory;
    @Nonnull private final Properties modelProperties;
    @Nullable private final String argLine;
    @Nonnull private final Map<String, String> environmentVariables;
    @Nonnull private final String[] excludedEnvironmentVariables;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nullable
    private final String debugLine;
    @Nonnull private final File workingDirectory;
    @Nonnull private final Properties modelProperties;
    @Nullable private final String argLine;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nonnull private final Classpath booterClasspath;
    @Nonnull private final File tempDirectory;
    @Nullable
    private final String debugLine;
    @Nonnull private final File workingDirectory;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final int forkCount;
    private final boolean reuseForks;
    @Nonnull private final Platform pluginPlatform;
    @Nonnull private final ConsoleLogger log;
    @Nonnull private final ForkNodeFactory forkNodeFactory;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
        extends ForkConfiguration
{
    @Nonnull private final Classpath booterClasspath;
    @Nonnull private final File tempDirectory;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nonnull private final Properties modelProperties;
    @Nullable private final String argLine;
    @Nonnull private final Map<String, String> environmentVariables;
    @Nonnull private final String[] excludedEnvironmentVariables;
    private final boolean debug;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/ForkChannel.java`
#### Snippet
```java
public abstract class ForkChannel implements Closeable
{
    @Nonnull
    private final ForkNodeArguments arguments;

```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ProcessInfo.java`
#### Snippet
```java
    }

    static @Nonnull ProcessInfo windowsProcessInfo( String pid, long startTimestamp )
    {
        return new ProcessInfo( pid, startTimestamp );
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ProcessInfo.java`
#### Snippet
```java
     * <pre>/bin/ps -o etime= -p 123</pre>
     */
    static @Nonnull ProcessInfo unixProcessInfo( String pid, long etime )
    {
        return new ProcessInfo( pid, etime );
```

### MissortedModifiers
Missorted modifiers `abstract @Nonnull`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
        }

        abstract @Nonnull ProcessInfo consumeLine( String line, ProcessInfo previousProcessInfo ) throws Exception;

        ProcessInfo execute( String... command )
```

### MissortedModifiers
Missorted modifiers `protected @Nonnull`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
    }

    protected @Nonnull StreamReadStatus read( @Nonnull Memento memento, int recommendedCount ) throws IOException
    {
        ByteBuffer buffer = memento.getByteBuffer();
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/InPluginProcessDumpSingleton.java`
#### Snippet
```java
    public File getEventStreamBinaryFile( File reportsDirectory, int jvmRun )
    {
        reportsDirectory.mkdirs();
        return new File( reportsDirectory, format( EVENTS_BINARY_DUMP_FILENAME_FORMATTER, jvmRun ) );
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
    public synchronized void deleteAll()
    {
        tempFiles.forEach( File::delete );
        tempFiles.clear();
        tempDir.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
        tempFiles.forEach( File::delete );
        tempFiles.clear();
        tempDir.delete();
    }

```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
            try
            {
                tempFile.createNewFile();
            }
            catch ( IOException ex )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/DumpFileUtils.java`
#### Snippet
```java
    public static synchronized File newDumpFile( File reportsDir, String dumpFileName )
    {
        reportsDir.mkdirs();
        return new File( reportsDir, dumpFileName );
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `JUnitCore` is the same as one of its superclass' names
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreWrapper.java`
#### Snippet
```java
    }

    private final class JUnitCore
        extends org.apache.maven.surefire.junitcore.JUnitCore
    {
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/FailsafeReportMojo.java`
#### Snippet
```java
     * @since 2.21.0
     */
    @Parameter( defaultValue = "", property = "failsafe.report.title" )
    private String title;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/FailsafeReportMojo.java`
#### Snippet
```java
     * @since 2.21.0
     */
    @Parameter( defaultValue = "", property = "failsafe.report.description" )
    private String description;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/SurefireReportMojo.java`
#### Snippet
```java
     * @since 2.21.0
     */
    @Parameter( defaultValue = "", property = "surefire.report.title" )
    private String title;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/SurefireReportMojo.java`
#### Snippet
```java
     * @since 2.21.0
     */
    @Parameter( defaultValue = "", property = "surefire.report.description" )
    private String description;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
     * @since 2.6
     */
    @Parameter( defaultValue = "" )
    private String classpathDependencyScopeExclude;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
     * and 'testcase'--'classname' - reportNameSuffix is added to the attribute value.
     */
    @Parameter( property = "surefire.reportNameSuffix", defaultValue = "" )
    private String reportNameSuffix;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
 */
@SuppressWarnings( "unused" )
@Mojo( name = "verify", defaultPhase = LifecyclePhase.VERIFY, requiresProject = true, threadSafe = true )
public class VerifyMojo
        extends AbstractMojo
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
 * @author Stephen Connolly
 */
@Mojo( name = "integration-test", requiresProject = true, requiresDependencyResolution = ResolutionScope.TEST,
             defaultPhase = LifecyclePhase.INTEGRATION_TEST, threadSafe = true )
public class IntegrationTestMojo
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `reset()` is identical to its super method
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/NullConsoleReporter.java`
#### Snippet
```java

    @Override
    public void reset()
    {
    }
```

### RedundantMethodOverride
Method `extendJvmArgLine()` is identical to its super method
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/AbstractClasspathForkConfiguration.java`
#### Snippet
```java
    @Override
    @Nonnull
    protected String extendJvmArgLine( @Nonnull String jvmArgLine )
    {
        return jvmArgLine;
```

### RedundantMethodOverride
Method `createStackTraceWriter()` is identical to its super method
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java

    @Override
    protected StackTraceWriter createStackTraceWriter( Failure failure )
    {
        return new JUnit4StackTraceWriter( failure );
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireProperties.java`
#### Snippet
```java
        if ( value != null )
        {
            super.setProperty( key, value );
        }
    }
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`do` statement cannot complete without throwing an exception
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/EventConsumerThread.java`
#### Snippet
```java
        {
            Memento memento = eventDecoder.new Memento();
            do
            {
                Event event = eventDecoder.decode( memento );
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
            {
                byte[] buffer = new byte[CACHE_SIZE];
                for ( int readCount; ( readCount = storage.read( buffer ) ) != -1; )
                {
                    out.write( buffer, 0, readCount );
```

### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
    {
        byte[] buffer;
        if ( largeCache == null || ( buffer = largeCache.get() ) == null || buffer.length < minLength )
        {
            buffer = new byte[minLength];
```

### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/StreamFeeder.java`
#### Snippet
```java
        try ( CommandEncoder encoder = new CommandEncoder( channel ) )
        {
            for ( Command cmd; ( cmd = commandReader.readNextCommand() ) != null; )
            {
                if ( !disabled )
```

### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/providerapi/ServiceLoader.java`
#### Snippet
```java
            try ( BufferedReader reader = getReader( url ) )
            {
                for ( String line; ( line = reader.readLine() ) != null; )
                {
                    int ci = line.indexOf( '#' );
```

### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/TestLessInputStream.java`
#### Snippet
```java
            do
            {
                for ( Node successor; ( successor = currentTail.next.get() ) != null; )
                {
                    currentTail = successor;
```

### NestedAssignment
Result of assignment expression used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
        public void run()
        {
            for ( Closeable closeable; ( closeable = testProvidingInputStream.poll() ) != null; )
            {
                try
```

### NestedAssignment
Result of assignment expression used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreWrapper.java`
#### Snippet
```java
                    String reason = e.getClass().getName();
                    Ignore reasonForSkippedTest = createIgnored( reason );
                    for ( String clazz; ( clazz = stoppedTests.poll() ) != null; )
                    {
                        Description skippedTest = createDescription( clazz, reasonForSkippedTest );
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}", readonly = true )
    private List<MavenProject> reactorProjects;

    /**
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `testStdOut` is accessed in both synchronized and unsynchronized contexts
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
    private final Object lock;

    private Utf8RecodingDeferredFileOutputStream testStdOut = initDeferred( "stdout" );

    private Utf8RecodingDeferredFileOutputStream testStdErr = initDeferred( "stderr" );
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testStdErr` is accessed in both synchronized and unsynchronized contexts
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
    private Utf8RecodingDeferredFileOutputStream testStdOut = initDeferred( "stdout" );

    private Utf8RecodingDeferredFileOutputStream testStdErr = initDeferred( "stderr" );

    @SuppressWarnings( "checkstyle:parameternumber" )
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `binaryDumpStreamFile` is accessed in both synchronized and unsynchronized contexts
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/DumpErrorSingleton.java`
#### Snippet
```java
    private File dumpFile;
    private File dumpStreamFile;
    private File binaryDumpStreamFile;

    private DumpErrorSingleton()
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java

    @Component
    private Logger logger;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java

    @Component
    private Logger logger;

    private Collection<CommandLineOption> cli;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireProperties.java`
#### Snippet
```java
    {
        items.add( key );
        return super.put( key, value );
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        {
            Object k = e.nextElement();
            Object v = properties.get( k );
            if ( k.getClass() == String.class && v.getClass() == String.class )
            {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    }

    public void setTestFailureIgnore( boolean testFailureIgnore )
    {
        // ignore
```

### EmptyMethod
The method is empty
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/ForkClient.java`
#### Snippet
```java
    }

    public void close( boolean hadTimeout )
    {
        // no op
```

### EmptyMethod
Empty method overrides empty method
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/NullConsoleReporter.java`
#### Snippet
```java

    @Override
    public void reset()
    {
    }
```

### EmptyMethod
All implementations of this method are empty
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/CloseableIterator.java`
#### Snippet
```java
    protected abstract boolean doHasNext();
    protected abstract T doNext();
    protected abstract void doRemove();

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/Completable.java`
#### Snippet
```java
    };

    void complete() throws IOException, InterruptedException;
}

```

### EmptyMethod
All implementations of this method are empty
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/ConsoleOutputReportEventListener.java`
#### Snippet
```java
{
    void testSetStarting( TestSetReportEntry report );
    void testSetCompleted( TestSetReportEntry report );
    void close();
    void writeTestOutput( TestOutputReportEntry reportEntry );
```

### EmptyMethod
All implementations of this method are empty
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/StatelessTestsetInfoConsoleReportEventListener.java`
#### Snippet
```java
    public abstract void testSetStarting( TestSetReportEntry report );
    public abstract void testSetCompleted( R report, S testSetStats, List<String> testResults );
    public abstract void reset();

    public ConsoleLogger getConsoleLogger()
```

### EmptyMethod
The method is empty
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    }

    protected void beforeExecute()
    {
    }
```

### EmptyMethod
The method is empty
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    }

    protected void afterExecute()
    {
    }
```

### EmptyMethod
The method is empty
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
    }

    public void onConfigurationSuccess( ITestResult result )
    {
        // DGF Don't record configuration successes as separate tests
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `surefire-providers/surefire-testng-utils/src/main/java/org/apache/maven/surefire/testng/utils/MethodSelector.java`
#### Snippet
```java
        implements IMethodSelector
{
    private static volatile TestListResolver testListResolver = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/Priority.java`
#### Snippet
```java
    int priority;

    int totalRuntime = 0;

    int minSuccessRate = Integer.MAX_VALUE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    private volatile boolean shutdown = false;

    private volatile boolean started = false;

    private volatile boolean finished = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    private final ConsoleLogger logger;

    private volatile boolean shutdown = false;

    private volatile boolean started = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    private volatile boolean started = false;

    private volatile boolean finished = false;

    private volatile Controller masterController;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Closeable`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/AbstractCommandReader.java`
#### Snippet
```java
 */
public abstract class AbstractCommandReader
        implements CommandReader, NotifiableTestStream, Closeable
{
}
```

### RedundantImplements
Redundant interface declaration `Annotation`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4Reflector.java`
#### Snippet
```java
    @SuppressWarnings( "ClassExplicitlyAnnotation" )
    private static class IgnoredWithUserError
        implements Annotation, Ignore
    {
        private final String value;
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-17-01-16-53.313.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/CommandReader.java`
#### Snippet
```java
                // If #stop() method is called, reader thread is interrupted
                // and exception is InterruptedIOException or its cause is InterruptedException.
                if ( !( e instanceof InterruptedIOException || e.getCause() instanceof InterruptedException ) )
                {
                    String msg = "[SUREFIRE] std/in stream corrupted";
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
        {
            Throwable e =
                t instanceof InvocationTargetException ? ( (InvocationTargetException) t ).getTargetException() : t;
            DumpErrorSingleton.getSingleton().dumpException( e );
            logger.error( e.getLocalizedMessage(), e );
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
            catch ( Exception e )
            {
                if ( !( e instanceof InterruptedException || e instanceof InterruptedIOException
                    || e.getCause() instanceof InterruptedException ) )
                {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
            catch ( Exception e )
            {
                if ( !( e instanceof InterruptedException || e instanceof InterruptedIOException
                    || e.getCause() instanceof InterruptedException ) )
                {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/EventConsumerThread.java`
#### Snippet
```java
        catch ( IOException e )
        {
            if ( e instanceof InterruptedIOException || e.getCause() instanceof InterruptedException )
            {
                Thread.currentThread().interrupt();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/LineConsumerThread.java`
#### Snippet
```java
        catch ( IOException e )
        {
            if ( e instanceof InterruptedIOException || e.getCause() instanceof InterruptedException )
            {
                Thread.currentThread().interrupt();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `surefire-providers/surefire-junit4/src/main/java/org/apache/maven/surefire/junit4/JUnit4Provider.java`
#### Snippet
```java
        catch ( Throwable e )
        {
            if ( isFailFast() && e instanceof StoppedByUserException )
            {
                String reason = e.getClass().getName();
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/ForkClient.java`
#### Snippet
```java
        if ( testSetReporter == null )
        {
            synchronized ( this )
            {
                if ( testSetReporter == null )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CountdownCloseable.java`
#### Snippet
```java
        if ( countdown > 0 )
        {
            wait();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CountdownCloseable.java`
#### Snippet
```java
            finally
            {
                notifyAll();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        if ( consoleLogger == null )
        {
            synchronized ( this )
            {
                if ( consoleLogger == null )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
        if ( consoleLogger == null )
        {
            synchronized ( this )
            {
                if ( consoleLogger == null )
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java
    protected final String[] getExcludedEnvironmentVariables()
    {
        return excludedEnvironmentVariables == null ? new String[0] : excludedEnvironmentVariables;
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/Commandline.java`
#### Snippet
```java
    public Commandline()
    {
        this( new String[0] );
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4Reflector.java`
#### Snippet
```java
            Method method = getMethod( Description.class, "createSuiteDescription", PARAMS_WITH_ANNOTATIONS );
            // may throw exception probably with broken JUnit 4.x
            return invokeMethodWithArray( null, method, description, new Annotation[0] );
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultDirectoryScanner.java`
#### Snippet
```java
        Set<Class<?>> result = new LinkedHashSet<>();

        String[] specific = specificTests == null ? new String[0] : processIncludesExcludes( specificTests );
        SpecificTestClassFilter specificTestFilter = new SpecificTestClassFilter( specific );

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
        encodeHeader( result, operation );

        byte[] runmode = runMode == null ? new byte[0] : runMode.getRunmodeBinary();
        result.put( (byte) runmode.length );
        result.put( (byte) ':' );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    protected final String[] getExcludedEnvironmentVariables()
    {
        return excludedEnvironmentVariables == null ? new String[0] : excludedEnvironmentVariables;
    }

```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `childDelegation` initializer `true` is redundant
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    private final String roleName;

    private boolean childDelegation = true;

    private static final URL[] EMPTY_URL_ARRAY = new URL[0];
```

### UnusedAssignment
The value `getFailIfNoTests()` assigned to `actualFailIfNoTests` is never used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        if ( hasSuiteXmlFiles() && !isSpecificTestSpecified() )
        {
            actualFailIfNoTests = getFailIfNoTests();
            if ( !isTestNg )
            {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `testClasses.add( test )` is always `true`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/CommandReader.java`
#### Snippet
```java
    private boolean insertToQueue( String test )
    {
        return isNotBlank( test ) && !isQueueFull() && testClasses.add( test );
    }

```

### ConstantValue
Condition `i < subDirectories.length` is always `true` when reached
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
        for ( int i = 0; i < subDirectories.length; i++ )
        {
            if ( i > 0 && i < subDirectories.length )
            {
                pkg.append( '.' );
```

### ConstantValue
Condition `i < subDirectories.length` is always `true` when reached
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
        for ( int i = 0; i < subDirectories.length; i++ )
        {
            if ( i > 0 && i < subDirectories.length )
            {
                pkg.append( '/' );
```

### ConstantValue
Condition `userSuffix != null` is always `true`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
                        .orElse( Long.toString( System.currentTimeMillis() ) );

        if ( userSuffix != null )
        {
            subDirName += "-" + userSuffix;
```

### ConstantValue
Condition `path != null` is always `true`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
            String path = convertToPath( s );
            path = fromFullyQualifiedClass( path );
            if ( path != null && !path.startsWith( WILDCARD_PATH_PREFIX ) )
            {
                path = WILDCARD_PATH_PREFIX + path;
```

### ConstantValue
Condition `setter != null` is always `true`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
        {
            Method setter = target.getClass().getMethod( setterName, paramClass );
            if ( setter != null )
            {
                setter.invoke( target, convertValue( value ) );
```

## RuleId[ruleID=IOResource]
### IOResource
'EncodingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
        else
        {
            EncodingOutputStream eos = new EncodingOutputStream( fw );
            xmlWriter.writeText( "" ); // Cheat sax to emit element
            outputStreamWriter.flush();
```

### IOResource
'BufferedInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
    {
        requireNonNull( is, "the stream should not be null" );
        final InputStream bis = bufferSize == 0 ? is : new BufferedInputStream( is, bufferSize );

        return new AbstractNoninterruptibleReadableChannel()
```

### IOResource
'BufferedOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
    {
        requireNonNull( out, "the stream should not be null" );
        final OutputStream bos = bufferSize == 0 ? out : new BufferedOutputStream( out, bufferSize );

        return new AbstractNoninterruptibleWritableChannel()
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
                }

                for ( Scanner scanner = new Scanner( method ); scanner.hasNextLine(); wasFirstLine = true )
                {
                    String methodLine = scanner.nextLine();
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SystemPropertyManager` has only 'static' members, and lacks a 'private' constructor
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemPropertyManager.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 */
public class SystemPropertyManager
{

```

### UtilityClassWithoutPrivateConstructor
Class `ClasspathCache` has only 'static' members, and lacks a 'private' constructor
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/ClasspathCache.java`
#### Snippet
```java
 */
@Deprecated
public class ClasspathCache
{
    private static final ConcurrentHashMap<String, Classpath> CLASSPATHS =
```

### UtilityClassWithoutPrivateConstructor
Class `JUnit4RunListenerFactory` has only 'static' members, and lacks a 'private' constructor
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListenerFactory.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 */
public class JUnit4RunListenerFactory
{
    public static List<RunListener> createCustomListeners( String listeners )
```

### UtilityClassWithoutPrivateConstructor
Class `SureFireFileManager` has only 'static' members, and lacks a 'private' constructor
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
 * @author Markus Spann
 */
public final class SureFireFileManager
{

```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/Constants.java`
#### Snippet
```java
 *
 */
public final class Constants
{
    private static final String MAGIC_NUMBER_FOR_EVENTS = "maven-surefire-event";
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderParameterNames` has only 'static' members, and lacks a 'private' constructor
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/ProviderParameterNames.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 */
public class ProviderParameterNames
{
    public static final String TESTNG_EXCLUDEDGROUPS_PROP = "excludegroups";
```

### UtilityClassWithoutPrivateConstructor
Class `ConsoleOutputCapture` has only 'static' members, and lacks a 'private' constructor
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/ConsoleOutputCapture.java`
#### Snippet
```java
 * <br>
 */
public final class ConsoleOutputCapture
{
    public static void startCapture( TestOutputReceiver<OutputReportEntry> target )
```

### UtilityClassWithoutPrivateConstructor
Class `SchedulingStrategies` has only 'static' members, and lacks a 'private' constructor
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/SchedulingStrategies.java`
#### Snippet
```java
 * @since 2.16
 */
public class SchedulingStrategies
{
    private static final ThreadFactory DAEMON_THREAD_FACTORY = DaemonThreadFactory.newDaemonThreadFactory();
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/LineConsumerThread.java`
#### Snippet
```java
    {
        try ( Scanner stream = new Scanner( channel, encoding.name() );
              CountdownCloseable c = countdownCloseable; )
        {
            boolean isError = false;
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `testSuite` might be null
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3Reflector.java`
#### Snippet
```java
        if ( isJUnit3Available() )
        {
            testsSuiteConstructor = ReflectionUtils.getConstructor( testSuite, constructorParamTypes );
            addListenerMethod =
                    tryGetMethod( testResultClass, ADD_LISTENER_METHOD, interfacesImplementedByDynamicProxy );
```

### DataFlowIssue
Argument `testInterface` might be null
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3Reflector.java`
#### Snippet
```java
            addListenerMethod =
                    tryGetMethod( testResultClass, ADD_LISTENER_METHOD, interfacesImplementedByDynamicProxy );
            testInterfaceRunMethod = getMethod( testInterface, RUN_METHOD, testResultClass );
        }
        else
```

### DataFlowIssue
Method invocation `read` may produce `NullPointerException`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireForkChannel.java`
#### Snippet
```java
            do
            {
                read = getChannel().read( buffer ).get();
            } while ( read != -1 && buffer.hasRemaining() );

```

### DataFlowIssue
Argument `path` might be null
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        {
            String path = convertToPath( s );
            path = fromFullyQualifiedClass( path );
            if ( path != null && !path.startsWith( WILDCARD_PATH_PREFIX ) )
            {
```

### DataFlowIssue
Method invocation `getRunTime` may produce `NullPointerException`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
                if ( line.charAt( 0 ) == ' ' )
                {
                    previous = new RunEntryStatistics( previous.getRunTime(),
                            previous.getSuccessfulBuilds(),
                            previous.getClassMethod().getClazz(),
```

### DataFlowIssue
Casting `obj` to `AndGroupMatcher` will produce `ClassCastException` for any non-null value
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/OrGroupMatcher.java`
#### Snippet
```java
            return false;
        }
        AndGroupMatcher other = (AndGroupMatcher) obj;
        return getMatchers().equals( other.getMatchers() );
    }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/ReportTestSuite.java`
#### Snippet
```java
        this.fullClassName = fullClassName;
        int lastDotPosition = fullClassName.lastIndexOf( "." );
        name = fullClassName.substring( lastDotPosition + 1, fullClassName.length() );
        packageName = lastDotPosition == -1 ? "" : fullClassName.substring( 0, lastDotPosition );
        return this;
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `surefire-api/src/main/java/org/apache/maven/surefire/api/suite/RunResult.java`
#### Snippet
```java
            e.printStackTrace( pw );
        }
        return new String( out.toByteArray() );
    }

```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
    }

    private Optional<List<String>> getPropertiesList( String key )
    {
        String property = parameters.getProviderProperties().get( key );
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'addURL' is still used
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    @Override
    @Deprecated
    public void addURL( URL url )
    {
        // avoid duplicates
```

### DeprecatedIsStillUsed
Deprecated member 'isChildDelegation' is still used
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/AbstractPathConfiguration.java`
#### Snippet
```java

    @Deprecated
    public boolean isChildDelegation()
    {
        return childDelegation;
```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec()
    {
        return skipExec;
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultStatelessReportMojoConfiguration' is still used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/DefaultStatelessReportMojoConfiguration.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultStatelessReportMojoConfiguration
        extends StatelessReportMojoConfiguration
{
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultDirectoryScanner' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultDirectoryScanner.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultDirectoryScanner
    implements DirectoryScanner
{
```

### DeprecatedIsStillUsed
Deprecated member 'ResolvedTest' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
// will be renamed to ResolvedTestPattern
@Deprecated
public final class ResolvedTest
{
    /**
```

### DeprecatedIsStillUsed
Deprecated member 'reportsDirectory' is still used
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
    @Deprecated
    @Parameter
    private File reportsDirectory;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'TestMethod' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/TestMethod.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
class TestMethod
    implements TestOutputReceiver<TestOutputReportEntry>
{
```

### DeprecatedIsStillUsed
Deprecated member 'ClassesParallelRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ClassesParallelRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
final class ClassesParallelRunListener
    extends ConcurrentRunListener
{
```

### DeprecatedIsStillUsed
Deprecated member 'MethodsParallelRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/MethodsParallelRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
final class MethodsParallelRunListener
    extends ConcurrentRunListener
{
```

### DeprecatedIsStillUsed
Deprecated member 'NonConcurrentRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/NonConcurrentRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
class NonConcurrentRunListener
    extends JUnit4RunListener
{
```

### DeprecatedIsStillUsed
Deprecated member 'disableXmlReport' is still used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
    @Deprecated // todo make readonly to handle system property
    @Parameter( property = "disableXmlReport", defaultValue = "false" )
    private boolean disableXmlReport;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'systemProperties' is still used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
    @Deprecated
    @Parameter
    private Properties systemProperties;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec()
    {
        return skipExec;
```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec()
    {
        return skipExec;
```

### DeprecatedIsStillUsed
Deprecated member 'ConfigurableParallelComputer' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConfigurableParallelComputer.java`
#### Snippet
```java
 */
@Deprecated
public class ConfigurableParallelComputer
    extends Computer
{
```

### DeprecatedIsStillUsed
Deprecated member 'excludes' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    private final List<String> excludes;

    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'ConcurrentRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
abstract class ConcurrentRunListener
    implements TestReportListener<TestOutputReportEntry>
{
```

### DeprecatedIsStillUsed
Deprecated member 'getSpecificTests' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    public List<String> getSpecificTests()
    {
        return specificTests;
```

### DeprecatedIsStillUsed
Deprecated member 'specificTests' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    private final List<String> specificTests;

    private final RunOrder[] runOrder;
```

### DeprecatedIsStillUsed
Deprecated member 'includes' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    private final List<String> includes;

    @Deprecated
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/util/FailsafeSummaryXmlUtils.java`
#### Snippet
```java
        String xml = format( Locale.ROOT, FAILSAFE_SUMMARY_XML_TEMPLATE,
                fromRunResult.getFailsafeCode(),
                String.valueOf( fromRunResult.isTimeout() ),
                fromRunResult.getCompletedCount(),
                fromRunResult.getErrors(),
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/providerapi/ServiceLoader.java`
#### Snippet
```java
                        }
                    }
                    if ( !names.contains( line ) )
                    {
                        names.add( line );
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `isClassPathConfig()` during object construction
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/AbstractPathConfiguration.java`
#### Snippet
```java
                                         boolean enableAssertions, boolean childDelegation )
    {
        if ( isClassPathConfig() == isModularPathConfig() )
        {
            throw new IllegalStateException( "modular path and class path should be exclusive" );
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `isModularPathConfig()` during object construction
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/AbstractPathConfiguration.java`
#### Snippet
```java
                                         boolean enableAssertions, boolean childDelegation )
    {
        if ( isClassPathConfig() == isModularPathConfig() )
        {
            throw new IllegalStateException( "modular path and class path should be exclusive" );
```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4ProviderUtil.java`
#### Snippet
```java
     *
     * @param allFailures the list of failures for a given test class
     * @return the list of descriptions
     */
    public static Set<Description> generateFailingTestDescriptions( List<Failure> allFailures )
```

## RuleId[ruleID=CollectionContainsUrl]
### CollectionContainsUrl
Set `urls` may contain URL objects
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    private final ClassLoader parent = ClassLoader.getSystemClassLoader();

    private final Set<URL> urls = new HashSet<>();

    private final String roleName;
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/InvokerStrategy.java`
#### Snippet
```java
    private final Queue<Thread> activeThreads = new ConcurrentLinkedQueue<>();

    protected InvokerStrategy( ConsoleLogger logger )
    {
        super( logger );
```

## RuleId[ruleID=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CommandlineExecutor.java`
#### Snippet
```java
        if ( shutdownHook != null )
        {
            shutdownHook.run();
            removeShutdownHook( shutdownHook );
            shutdownHook = null;
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
                catch ( IOException e )
                {
                    throw new MojoExecutionException( "Could not scan dependency " + artifact.toString(), e );
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                else
                {
                    throw new SurefireBooterForkException( "No results for " + result.toString() );
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                    throw new SurefireBooterForkException(
                        "The forked VM terminated without properly saying goodbye. VM crash or System.exit called?"
                            + "\nCommand was " + cli.toString() + detail + errorCode + testsInProgress, cause );
                }
            }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    @Override
    @SuppressWarnings( "deprecation" )
    protected boolean isSkipExecution()
    {
        return isSkip() || isSkipTests() || isSkipITs() || isSkipExec();
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        if ( getToolchainsMethod != null )
        {
            //noinspection unchecked
            List<Toolchain> tcs = invokeMethodWithArray( toolchainManager,
                getToolchainsMethod, session, "jdk", toolchainArgs );
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireProperties.java`
#### Snippet
```java
        for ( Object key : getStringKeySet() )
        {
            //noinspection SuspiciousMethodCalls
            if ( KEYS_THAT_CANNOT_BE_USED_AS_SYSTEM_PROPERTIES.contains( key ) )
            {
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireForkChannel.java`
#### Snippet
```java
    public void close() throws IOException
    {
        //noinspection unused,EmptyTryBlock,EmptyTryBlock
        try ( Closeable c1 = getChannel(); Closeable c2 = server; Closeable c3 = out )
        {
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
 */
//todo this is no more stateless due to existence of testClassMethodRunHistoryMap since of 2.19.
public class StatelessXmlReporter
        implements StatelessReportEventListener<WrappedReportEntry, TestSetStats>
{
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
        if ( report.getStackTraceWriter() != null )
        {
            //noinspection ThrowableResultOfMethodCallIgnored
            SafeThrowable t = report.getStackTraceWriter().getThrowable();
            if ( t != null )
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
            addAll( resolvedReportsDirectories, this.reportsDirectories );
        }
        //noinspection deprecation
        if ( reportsDirectory != null )
        {
```

### RedundantSuppression
Redundant suppression
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
        if ( reportsDirectory != null )
        {
            //noinspection deprecation
            resolvedReportsDirectories.add( reportsDirectory );
        }
```

### RedundantSuppression
Redundant suppression
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/ThreadedExecutionScheduler.java`
#### Snippet
```java
        final int leastBusySlot = findLeastBusySlot();
        runTime[leastBusySlot] += prioritizedTest.getTotalRuntime();
        //noinspection unchecked
        lists[leastBusySlot].add( prioritizedTest.getClazz() );
    }
```

### RedundantSuppression
Redundant suppression
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
        finally
        {
            //noinspection ResultOfMethodCallIgnored
            Thread.interrupted();

```

### RedundantSuppression
Redundant suppression
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
                }

                //noinspection ResultOfMethodCallIgnored
                Thread.interrupted();

```

### RedundantSuppression
Redundant suppression
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
 */
@SuppressWarnings( "ThrowableResultOfMethodCallIgnored" )
public class SmartStackTraceParser
{
    private final SafeThrowable throwable;
```

### RedundantSuppression
Redundant suppression
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java

    @SuppressWarnings( "ThrowableResultOfMethodCallIgnored" )
    public String getString()
    {
        if ( testClass == null )
```

### RedundantSuppression
Redundant suppression
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
    @Override
    @SuppressWarnings( { "ThrowableResultOfMethodCallIgnored" } )
    public void testFailure( Failure failure )
        throws Exception
    {
```

### RedundantSuppression
Redundant suppression
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/JUnit48TestChecker.java`
#### Snippet
```java

    @SuppressWarnings( { "unchecked" } )
    private boolean isAbstractWithEnclosedRunner( Class testClass )
    {
        return jUnit4TestChecker.isRunWithPresentInClassLoader()
```

### RedundantSuppression
Redundant suppression
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
 * @since 2.16
 */
public final class ParallelComputerBuilder
{
    private static final ThreadFactory DAEMON_THREAD_FACTORY = DaemonThreadFactory.newDaemonThreadFactory();
```

### RedundantSuppression
Redundant suppression
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
        String methodName = testName( result );
        long testRunId = classMethodIndexer.indexClassMethod( className, methodName );
        //noinspection ThrowableResultOfMethodCallIgnored
        Throwable t = result.getThrowable();
        String reason = t == null ? null : t.getMessage();
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreParameters.java`
#### Snippet
```java
    private static boolean property( Map<String, String> properties, String key, boolean fallback )
    {
        return properties.containsKey( key ) ? Boolean.valueOf( properties.get( key ) ) : fallback;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreParameters.java`
#### Snippet
```java
    private static double property( Map<String, String> properties, String key, double fallback )
    {
        return properties.containsKey( key ) ? Double.valueOf( properties.get( key ) ) : fallback;
    }
}
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreParameters.java`
#### Snippet
```java
    private static int property( Map<String, String> properties, String key, int fallback )
    {
        return properties.containsKey( key ) ? Integer.valueOf( properties.get( key ) ) : fallback;
    }

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ProviderFactory.java`
#### Snippet
```java
        throws TestSetFailedException, InvocationTargetException
    {
        final PrintStream orgSystemOut = System.out;
        final PrintStream orgSystemErr = System.err;
        // Note that System.out/System.err are also read in the "ReporterConfiguration" instantiation
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ProviderFactory.java`
#### Snippet
```java
    {
        final PrintStream orgSystemOut = System.out;
        final PrintStream orgSystemErr = System.err;
        // Note that System.out/System.err are also read in the "ReporterConfiguration" instantiation
        // in createProvider below. These are the same values as here.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/LegacyMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
    public MasterProcessChannelEncoder createEncoder( @Nonnull ForkNodeArguments forkingArguments )
    {
        WritableBufferedByteChannel channel = newBufferedChannel( System.out );
        schedulePeriodicFlusher( FLUSH_PERIOD_MILLIS, channel );
        return new EventChannelEncoder( channel );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
        this.statisticsFile = statisticsFile;
        this.requiresRunHistory = requiresRunHistory;
        this.originalSystemOut = System.out;
        this.originalSystemErr = System.err;
        this.rerunFailingTestsCount = rerunFailingTestsCount;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
        this.requiresRunHistory = requiresRunHistory;
        this.originalSystemOut = System.out;
        this.originalSystemErr = System.err;
        this.rerunFailingTestsCount = rerunFailingTestsCount;
        this.xsdSchemaLocation = xsdSchemaLocation;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/NativeStdOutStreamConsumer.java`
#### Snippet
```java
        synchronized ( outStreamLock )
        {
            System.out.println( message );
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/NativeStdErrStreamConsumer.java`
#### Snippet
```java
        synchronized ( errStreamLock )
        {
            System.err.println( message );
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
                {
                    // In case of debugging forked JVM, see PRINTABLE_JVM_NATIVE_STREAM.
                    System.out.println( s );
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
        throws TestSetFailedException
    {
        System.out.println( "\n\n\n\nCONFIGURING TESTNG\n\n\n\n" );
        // kind of ugly, but listeners are configured differently
        final String listeners = options.remove( "listener" );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGExecutor.java`
#### Snippet
```java
        if ( isCliDebugOrShowErrors( mainCliOptions ) )
        {
            System.out.println( "Configuring TestNG with: " + configurator.getClass().getSimpleName() );
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/SingleGroupMatcher.java`
#### Snippet
```java
            // class is not available at runtime, for instance this would happen in reactor projects
            // in which not all modules have the required class on the classpath/module path
            System.out.println( "[WARNING] Couldn't load group class '" + enabled + "' in Surefire|Failsafe plugin. "
                    + "The group class is ignored!" );
        }
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
     */
    @Parameter( property = "encoding", defaultValue = "${project.reporting.outputEncoding}" )
    private String encoding;

    /**
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!(runner instanceof ErrorReportingRunner)' covered by subsequent condition 'runner instanceof ParentRunner'
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
        private boolean canSchedule( Runner runner )
        {
            return !( runner instanceof ErrorReportingRunner ) && runner instanceof ParentRunner;
        }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        {
            properties.load( is );
            String javaVersion = properties.getProperty( "JAVA_VERSION" ).replace( "\"", "" );
            StringTokenizer versions = new StringTokenizer( javaVersion, "._" );

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireHelper.java`
#### Snippet
```java
    {
        String threadNumberAsString = String.valueOf( threadNumber );
        return argLine.replace( THREAD_NUMBER_PLACEHOLDER, threadNumberAsString )
                .replace( FORK_NUMBER_PLACEHOLDER, threadNumberAsString );
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireHelper.java`
#### Snippet
```java
        String threadNumberAsString = String.valueOf( threadNumber );
        return argLine.replace( THREAD_NUMBER_PLACEHOLDER, threadNumberAsString )
                .replace( FORK_NUMBER_PLACEHOLDER, threadNumberAsString );
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/ScannerUtil.java`
#### Snippet
```java
    @Nonnull public static String convertSlashToSystemFileSeparator( @Nonnull String path )
    {
        return ( IS_NON_UNIX_FS ? path.replace( "/", FS ) : path );
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private static String stripWhitespace( @Nonnull String argLine )
    {
        return argLine.replaceAll( "\\s", " " );
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/JarManifestForkConfiguration.java`
#### Snippet
```java
            String uriFormEncoded = URLEncoder.encode( input, encoding.name() );

            String uriPathEncoded = uriFormEncoded.replaceAll( "\\+", "%20" );
            uriPathEncoded = uriPathEncoded.replaceAll( "%2F|%5C", "/" );

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/JarManifestForkConfiguration.java`
#### Snippet
```java

            String uriPathEncoded = uriFormEncoded.replaceAll( "\\+", "%20" );
            uriPathEncoded = uriPathEncoded.replaceAll( "%2F|%5C", "/" );

            return uriPathEncoded;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
        String property = parameters.getProviderProperties().get( key );
        return isBlank( property ) ? empty()
                        : of( stream( property.split( "[,]+" ) )
                                              .filter( StringUtils::isNotBlank )
                                              .map( String::trim )
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
                        .filter( Objects::nonNull )
                        .findFirst()
                        .map( u -> u.replaceAll( "[^A-Za-z0-9\\-_]", "" ) )
                        .map( u -> u.isEmpty() ? null : u )
                        .orElse( Long.toString( System.currentTimeMillis() ) );
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java
                    .filter( identifier -> !identifier.getSource().isPresent() )
                    .map( TestIdentifier::getLegacyReportingName )
                    .anyMatch( legacyReportingName -> legacyReportingName.matches( "^\\[.+]$" ) );

            boolean parameterized = isNotBlank( methodSource.getMethodParameterTypes() ) || hasParameterizedParent;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNG513Configurator.java`
#### Snippet
```java

        StringBuilder sb = new StringBuilder();
        String[] classNames = listenerClasses.split( "\\s*,\\s*(\\r?\\n)?\\s*" );
        for ( int i = 0; i < classNames.length; i++ )
        {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
                        throw new IllegalArgumentException( "Exclamation mark not expected in 'exclusion': " + exc );
                    }
                    exc = exc.replace( ",", ",!" );
                    if ( !exc.startsWith( "!" ) )
                    {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java

        List<Class> classes = new ArrayList<>();
        String[] classNames = listenerClasses.split( "\\s*,\\s*(\\r?\\n)?\\s*" );
        for ( String className : classNames )
        {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `junit.framework` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3TestChecker.java`
#### Snippet
```java
            if ( isPublic( modifiers ) && isStatic( modifiers ) )
            {
                return junit.framework.Test.class.isAssignableFrom( suite.getReturnType() );
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemPropertyManager.java`
#### Snippet
```java
     * @param inStream The stream to read from, will be closed
     * @return The properties
     * @throws java.io.IOException If something bad happens
     */
    public static PropertiesWrapper loadProperties( InputStream inStream )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/JUnit48TestChecker.java`
#### Snippet
```java
    private boolean isRunWithEnclosedRunner( Class testClass )
    {
        @SuppressWarnings( "unchecked" ) org.junit.runner.RunWith runWithAnnotation =
            (org.junit.runner.RunWith) testClass.getAnnotation( org.junit.runner.RunWith.class );
        return ( runWithAnnotation != null && Enclosed.class.equals( runWithAnnotation.value() ) );
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/JUnit48TestChecker.java`
#### Snippet
```java
    {
        @SuppressWarnings( "unchecked" ) org.junit.runner.RunWith runWithAnnotation =
            (org.junit.runner.RunWith) testClass.getAnnotation( org.junit.runner.RunWith.class );
        return ( runWithAnnotation != null && Enclosed.class.equals( runWithAnnotation.value() ) );
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/JUnit48TestChecker.java`
#### Snippet
```java
    {
        @SuppressWarnings( "unchecked" ) org.junit.runner.RunWith runWithAnnotation =
            (org.junit.runner.RunWith) testClass.getAnnotation( org.junit.runner.RunWith.class );
        return ( runWithAnnotation != null && Enclosed.class.equals( runWithAnnotation.value() ) );
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/ConsoleOutputFileReporter.java`
#### Snippet
```java

/**
 * Surefire output consumer proxy that writes test output to a {@link java.io.File} for each test suite.
 *
 * @author Kristian Rosenvold
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.booter` is unnecessary and can be removed
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
     * @param dumpLogDirectory     directory for dump log file
     * @return CommandLine able to flush entire command going to be sent to forked JVM
     * @throws org.apache.maven.surefire.booter.SurefireBooterForkException when unable to perform the fork
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.booter` is unnecessary and can be removed
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkConfiguration.java`
#### Snippet
```java
     * @param dumpLogDirectory     directory for dump log file
     * @return CommandLine able to flush entire command going to be sent to forked JVM
     * @throws org.apache.maven.surefire.booter.SurefireBooterForkException
     *          when unable to perform the fork
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.surefire.booterclient.lazytestprovider` is unnecessary and can be removed
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/NotifiableTestStream.java`
#### Snippet
```java
 * Implemented by {@link TestProvidingInputStream} and {@link TestLessInputStream} where the method
 * {@link TestLessInputStream#provideNewTest()} purposefully does nothing. Some methods in
 * {@link org.apache.maven.plugin.surefire.booterclient.lazytestprovider.TestLessInputStream.TestLessInputStreamBuilder}
 * throw {@link UnsupportedOperationException}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/ThreadedStreamConsumer.java`
#### Snippet
```java
         * <br>
         * If {@link org.apache.maven.plugin.surefire.report.ConsoleOutputFileReporter#writeTestOutput} throws
         * {@link java.io.IOException} and then {@code target.consumeLine()} throws any RuntimeException, this method
         * MUST NOT skip reading the events from the forked JVM; otherwise we could simply lost events
         * e.g. acquire-next-test which means that {@link ForkClient} could hang on waiting for old test to complete
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/Notifier.java`
#### Snippet
```java

    /**
     * Fire stop even to plugin process and/or call {@link org.junit.runner.notification.RunNotifier#pleaseStop()}.
     */
    private void fireStopEvent()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4TestChecker.java`
#### Snippet
```java
    {
        jUnit3TestChecker = new JUnit3TestChecker( testClassLoader );
        runWith = tryLoadClass( testClassLoader, org.junit.runner.RunWith.class.getName() );
        nonAbstractClassFilter = new NonAbstractClassFilter();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit` is unnecessary, and can be replaced with an import
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4TestChecker.java`
#### Snippet
```java
            for ( Annotation lAnnotation : lMethod.getAnnotations() )
            {
                if ( org.junit.Test.class.isAssignableFrom( lAnnotation.annotationType() ) )
                {
                    return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4StackTraceWriter.java`
#### Snippet
```java

/**
 * Writes out a specific {@link org.junit.runner.notification.Failure} for
 * surefire as a stacktrace.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called after a specific test has finished.
     *
     * @see org.junit.runner.notification.RunListener#testFinished(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called after a specific test has finished.
     *
     * @see org.junit.runner.notification.RunListener#testFinished(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has failed.
     *
     * @see org.junit.runner.notification.RunListener#testFailure(org.junit.runner.notification.Failure)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has failed.
     *
     * @see org.junit.runner.notification.RunListener#testFailure(org.junit.runner.notification.Failure)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has been skipped (for whatever reason).
     *
     * @see org.junit.runner.notification.RunListener#testIgnored(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has been skipped (for whatever reason).
     *
     * @see org.junit.runner.notification.RunListener#testIgnored(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has started.
     *
     * @see org.junit.runner.notification.RunListener#testStarted(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * Called when a specific test has started.
     *
     * @see org.junit.runner.notification.RunListener#testStarted(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner.notification` is unnecessary and can be removed
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4RunListener.java`
#### Snippet
```java
     * {@link org.apache.maven.surefire.api.report.RunListener#testSucceeded} event is not fired.
     * This is necessary because JUnit4 always fires a
     * {@link org.junit.runner.notification.RunListener#testRunFinished(Result)}
     * event-- even if there was a failure.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/CloseableIterator.java`
#### Snippet
```java
 * If the iterator has been closed before calling {@link #hasNext()} then the method returns {@code false}.
 * If the iterator was closed after {@link #hasNext() hasNext returns true} but before {@link #next()}, the
 * method {@link #next()} throws {@link java.util.NoSuchElementException}.
 * The method {@link #remove()} throws {@link IllegalStateException} if the iterator has been closed.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
     * with user-defined prefix and suffix (both may be null or empty and won't be trimmed).
     * <p>
     * This method behaves similarly to {@link java.io.File#createTempFile(String, String)} and
     * may be used as a drop-in replacement.<br>
     * This method is {@code synchronized} to help ensure uniqueness of temporary files.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.testng` is unnecessary and can be removed
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java

/**
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java

/**
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
 * Methods annotated with @Ignore trigger no further events.
 *
 * @see org.apache.maven.surefire.junitcore.ConcurrentRunListener for details about parallel running
 */
final class JUnitCoreRunListener
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
     * Called right before any tests from a specific class are run.
     *
     * @see org.junit.runner.notification.RunListener#testRunStarted(org.junit.runner.Description)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runners` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/WrappedRunners.java`
#### Snippet
```java
 * <br>
 * Old JUnit versions do not cache children after the first call of
 * {@link org.junit.runners.ParentRunner#getChildren()}.
 * Due to performance reasons, the children have to be observed just once.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerUtil.java`
#### Snippet
```java
/**
 * An algorithm which configures {@link ParallelComputer} with allocated thread resources by given
 * {@link org.apache.maven.surefire.junitcore.JUnitCoreParameters}.
 * The {@code AbstractSurefireMojo} has to provide correct combinations of thread-counts and
 * configuration parameter {@code parallel}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore.pc` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerUtil.java`
#### Snippet
```java
 *
 * @author Tibor Digana (tibor17)
 * @see org.apache.maven.surefire.junitcore.pc.ParallelComputerBuilder
 * @since 2.16
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore.pc` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java

        /**
         * @see org.apache.maven.surefire.junitcore.pc.Destroyable#destroy()
         */
        boolean destroy()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * @param description     JUnit description of class
     * @param masterScheduler a reference to
     * {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy, int)}
     *                        or {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy)}
     * @param strategy        scheduling strategy
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * @param masterScheduler a reference to
     * {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy, int)}
     *                        or {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy)}
     * @param strategy        scheduling strategy
     * @param concurrency     determines maximum concurrent children scheduled a time via {@link #schedule(Runnable)}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * @param concurrency     determines maximum concurrent children scheduled a time via {@link #schedule(Runnable)}
     *
     * @see #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy)
     * @see #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy, int)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     *
     * @see #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy)
     * @see #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy, int)
     */
    public Scheduler( ConsoleLogger logger, Description description, Scheduler masterScheduler,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runners.model` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
 * <br>
 * The scheduler objects should be first created (and wired) and set in runners
 * {@link org.junit.runners.ParentRunner#setScheduler(org.junit.runners.model.RunnerScheduler)}.
 * <br>
 * A new instance of scheduling strategy should be passed to the constructor of this scheduler.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * against other groups of schedulers. The schedulers share one pool.
     * <br>
     * Unlike in {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, SchedulingStrategy, int)} which was
     * limiting the <code>concurrency</code> of children of a runner where this scheduler was set, {@code this}
     * <code>balancer</code> is limiting the concurrency of all children in runners having schedulers created by this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore.pc` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    /**
     * Should be used with individual pools on suites, classes and methods, see
     * {@link org.apache.maven.surefire.junitcore.pc.ParallelComputerBuilder#useSeparatePools()}.
     * <br>
     * Cached thread pool is infinite and can be always shared.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * <br>
     * Set this scheduler in a e.g. one suite of classes, then every individual class runner should reference
     * {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, Scheduler, SchedulingStrategy)}
     * or {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, Scheduler, SchedulingStrategy, int)}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit.runner` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
     * Set this scheduler in a e.g. one suite of classes, then every individual class runner should reference
     * {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, Scheduler, SchedulingStrategy)}
     * or {@link #Scheduler(ConsoleLogger, org.junit.runner.Description, Scheduler, SchedulingStrategy, int)}.
     *
     * @param logger current logger implementation
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConfigurableParallelComputer.java`
#### Snippet
```java
        try
        {
            if ( !fService.awaitTermination( 10, java.util.concurrent.TimeUnit.SECONDS ) )
            {
                throw new RuntimeException( "Executor did not shut down within timeout" );
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConfigurableParallelComputer.java`
#### Snippet
```java

    @Override
    public Runner getSuite( RunnerBuilder builder, java.lang.Class<?>[] classes )
        throws InitializationError
    {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.surefire.junitcore` is unnecessary and can be removed
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java
 * parallel=both; same as parallel=methods
 *
 * @see org.apache.maven.surefire.junitcore.JUnitCoreRunListener for details about regular junit run listening
 * @author Kristian Rosenvold
 */
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
            catch ( IOException e )
            {
                e.printStackTrace();
            }
        }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractMasterProcessChannelProcessorFactory()` of an abstract class should not be declared 'public'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/AbstractMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
    private final ScheduledExecutorService flusher;

    public AbstractMasterProcessChannelProcessorFactory()
    {
        flusher = newScheduledThreadPool( 1, newDaemonThreadFactory( STREAM_FLUSHER ) );
```

### NonProtectedConstructorInAbstractClass
Constructor `StatelessTestsetInfoConsoleReportEventListener()` of an abstract class should not be declared 'public'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/StatelessTestsetInfoConsoleReportEventListener.java`
#### Snippet
```java
    private final ConsoleLogger logger;

    public StatelessTestsetInfoConsoleReportEventListener( ConsoleLogger logger )
    {
        this.logger = logger;
```

### NonProtectedConstructorInAbstractClass
Constructor `StatelessTestsetInfoFileReportEventListener()` of an abstract class should not be declared 'public'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/StatelessTestsetInfoFileReportEventListener.java`
#### Snippet
```java
    private final Charset encoding;

    public StatelessTestsetInfoFileReportEventListener( File reportsDirectory, String reportNameSuffix,
                                                        Charset encoding )
    {
```

### NonProtectedConstructorInAbstractClass
Constructor `CountDownLauncher()` of an abstract class should not be declared 'public'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CountDownLauncher.java`
#### Snippet
```java
    private final AtomicInteger countDown;

    public CountDownLauncher( int count )
    {
        if ( count <= 0 )
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTestControlEvent()` of an abstract class should not be declared 'public'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/event/AbstractTestControlEvent.java`
#### Snippet
```java
    private final T reportEntry;

    public AbstractTestControlEvent( ForkedProcessEventType eventType, T reportEntry )
    {
        super( eventType );
```

### NonProtectedConstructorInAbstractClass
Constructor `Event()` of an abstract class should not be declared 'public'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/event/Event.java`
#### Snippet
```java
    private final ForkedProcessEventType eventType;

    public Event( ForkedProcessEventType eventType )
    {
        this.eventType = eventType;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStreamEncoder()` of an abstract class should not be declared 'public'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
    private final WritableByteChannel out;

    public AbstractStreamEncoder( WritableByteChannel out )
    {
        this.out = out;
```

### NonProtectedConstructorInAbstractClass
Constructor `ParallelComputer()` of an abstract class should not be declared 'public'
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
    private ScheduledExecutorService shutdownScheduler;

    public ParallelComputer( double timeoutInSeconds, double timeoutForcedInSeconds )
    {
        this.timeoutNanos = secondsToNanos( timeoutInSeconds );
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/Platform.java`
#### Snippet
```java
    private static Callable<Long> pidJob()
    {
        return new Callable<Long>()
        {
            @Override
            public Long call() throws Exception
```

### Anonymous2MethodRef
Anonymous new Iterable() can be replaced with method reference
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/TestLessInputStream.java`
#### Snippet
```java
        public TestLessInputStreamBuilder()
        {
            iterableCachable = new Iterable<Command>()
            {
                @Override
                public Iterator<Command> iterator()
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
            String testClassName = methodEntry.getSourceName();
            Map<String, List<WrappedReportEntry>> stats = classMethodStatistics.get( testClassName );
            if ( stats == null )
            {
                stats = new LinkedHashMap<>();
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
            String methodName = methodEntry.getName();
            List<WrappedReportEntry> methodRuns = stats.get( methodName );
            if ( methodRuns == null )
            {
                methodRuns = new ArrayList<>();
```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreParameters.java`
#### Snippet
```java
    private static String property( Map<String, String> properties, String key, String fallback )
    {
        return properties.containsKey( key ) ? properties.get( key ) : fallback;
    }

```

## RuleId[ruleID=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
            Class<?> reporterConfig = Class.forName( "org.testng.ReporterConfig" );
            Method deserialize = reporterConfig.getMethod( "deserialize", String.class );
            Object rc = deserialize.invoke( null, val );
            ArrayList<Object> reportersList = new ArrayList<>();
            reportersList.add( rc );
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/AbstractMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
    {
        final AtomicLong bufferOverflows = new AtomicLong();
        flusher.scheduleWithFixedDelay( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
    private Runnable createPingJob( final AtomicBoolean pingDone, final PpidChecker pluginProcessChecker  )
    {
        return new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
    private void flushEventChannelOnExit()
    {
        Runnable target = new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
    private Runnable processCheckerJob( final PingScheduler pingMechanism )
    {
        return new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
    {
        getJvmTerminator()
                .schedule( new Runnable()
                {
                    @Override
                    public void run()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/Platform.java`
#### Snippet
```java
    private static Callable<Long> pidJob()
    {
        return new Callable<Long>()
        {
            @Override
            public Long call() throws Exception
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                                                    final Shutdown shutdownType )
    {
        return SHUTDOWN_HOOK_THREAD_FACTORY.newThread( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
    private ScheduledFuture<?> triggerTimeoutCheck()
    {
        return timeoutCheckScheduler.scheduleWithFixedDelay( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
    private ScheduledFuture<?> triggerPingTimerForShutdown( final Iterable<TestProvidingInputStream> streams )
    {
        return pingThreadScheduler.scheduleWithFixedDelay( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                                                             final Shutdown shutdownType )
    {
        return SHUTDOWN_HOOK_THREAD_FACTORY.newThread( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                                                            final Shutdown shutdownType )
    {
        return SHUTDOWN_HOOK_THREAD_FACTORY.newThread( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
    private ScheduledFuture<?> triggerPingTimerForShutdown( final TestLessInputStreamBuilder builder )
    {
        return pingThreadScheduler.scheduleWithFixedDelay( new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
    private Callable<ShutdownResult> createForcedShutdownTask()
    {
        return new Callable<ShutdownResult>()
        {
            @Override
            public ShutdownResult call()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
    private Callable<ShutdownResult> createShutdownTask()
    {
        return new Callable<ShutdownResult>()
        {
            @Override
            public ShutdownResult call()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/Scheduler.java`
#### Snippet
```java
    private Runnable wrapTask( final Runnable task )
    {
        return new Runnable()
        {
            @Override
            public void run()
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `from`
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/TestSuiteXmlParser.java`
#### Snippet
```java
            for ( int i = 0; i < len; i++ )
            {
                char c = s[from++];
                if ( c != ' ' && c != '\t' && c != '\n' && c != '\r' && c != '\f' )
                {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireHelper.java`
#### Snippet
```java
        if ( IS_OS_WINDOWS && path.length() > MAX_PATH_LENGTH_WINDOWS )
        {
            path = path.startsWith( "\\\\" ) ? "\\\\?\\UNC\\" + path.substring( 2 ) : "\\\\?\\" + path;
        }
        return path;
```

### AssignmentToMethodParameter
Assignment to method parameter `ext`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
    {
        this.basedir = basedir;
        ext = ext.trim();
        if ( isBlank( ext ) )
        {
```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
        if ( output == null )
        {
            output = "null";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `description`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4ProviderUtil.java`
#### Snippet
```java
            if ( it.hasNext() )
            {
                description = it.next();
                clazz = extractClassName( description.getDisplayName() );
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
    {
        // use only the file name from the supplied prefix
        prefix = prefix == null ? "" : ( new File( prefix ) ).getName();
        suffix = suffix == null ? "" : suffix;

```

### AssignmentToMethodParameter
Assignment to method parameter `suffix`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
        // use only the file name from the supplied prefix
        prefix = prefix == null ? "" : ( new File( prefix ) ).getName();
        suffix = suffix == null ? "" : suffix;

        String name = String.join( "-", prefix, baseName + "_" + FILE_ID.getAndIncrement() ) + suffix;
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    public ResolvedTest( Type type, String pattern, boolean isRegex )
    {
        pattern = tryBlank( pattern );
        final boolean isClass = type == Type.CLASS;
        description = description( isClass ? pattern : null, !isClass ? pattern : null, isRegex );
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if ( isRegex && pattern != null )
        {
            pattern = wrapRegex( pattern );
        }
        classPattern = isClass ? reformatClassPattern( pattern, isRegex ) : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `classPattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    public ResolvedTest( String classPattern, String methodPattern, boolean isRegex )
    {
        classPattern = tryBlank( classPattern );
        methodPattern = tryBlank( methodPattern );
        description = description( classPattern, methodPattern, isRegex );
```

### AssignmentToMethodParameter
Assignment to method parameter `methodPattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    {
        classPattern = tryBlank( classPattern );
        methodPattern = tryBlank( methodPattern );
        description = description( classPattern, methodPattern, isRegex );

```

### AssignmentToMethodParameter
Assignment to method parameter `classPattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if ( isRegex && classPattern != null )
        {
            classPattern = wrapRegex( classPattern );
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `methodPattern`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if ( isRegex && methodPattern != null )
        {
            methodPattern = wrapRegex( methodPattern );
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `testClassFile`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    public boolean matchAsExclusive( String testClassFile, String methodName )
    {
        testClassFile = tryBlank( testClassFile );
        methodName = tryBlank( methodName );

```

### AssignmentToMethodParameter
Assignment to method parameter `methodName`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    {
        testClassFile = tryBlank( testClassFile );
        methodName = tryBlank( methodName );

        return !isEmpty() && canMatchExclusive( testClassFile, methodName ) && match( testClassFile, methodName );
```

### AssignmentToMethodParameter
Assignment to method parameter `testClassFile`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
            if ( separatorChar != '/' )
            {
                testClassFile = testClassFile.replace( '/', separatorChar );
                classPattern = classPattern.replace( '/', separatorChar );
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `testClassFile`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    public boolean matchAsInclusive( String testClassFile, String methodName )
    {
        testClassFile = tryBlank( testClassFile );
        methodName = tryBlank( methodName );

```

### AssignmentToMethodParameter
Assignment to method parameter `methodName`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
    {
        testClassFile = tryBlank( testClassFile );
        methodName = tryBlank( methodName );

        return isEmpty() || alwaysInclusiveQuietly( testClassFile ) || match( testClassFile, methodName );
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
            if ( className.endsWith( JAVA_FILE_EXTENSION ) )
            {
                className = className.substring( 0, className.length() - JAVA_FILE_EXTENSION.length() )
                                    + CLASS_FILE_EXTENSION;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            byte[] array = bb.array();
            int pos = bb.arrayOffset() + position;
            while ( length-- > 0 )
            {
                positionByteBuffer++;
```

### AssignmentToMethodParameter
Assignment to method parameter `request`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        final boolean isExcluded = request.startsWith( "!" );
        ResolvedTest test = null;
        request = removeExclamationMark( request );
        if ( isRegexPrefixedPattern( request ) )
        {
```

### AssignmentToMethodParameter
Assignment to method parameter `regex`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    static String[] unwrapRegex( String regex )
    {
        regex = regex.trim();
        int from = REGEX_HANDLER_PREFIX.length();
        int to = regex.length() - PATTERN_HANDLER_SUFFIX.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `cause`
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
            resp.append( "Caused by: " );
            resp.append( toString( cause, asList( cause.getStackTrace() ), filter ) );
            cause = cause.getCause();
        }
        return resp.toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `testClass`
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
        while ( !testClass.getName().equals( lookFor ) && testClass.getSuperclass() != null )
        {
            testClass = testClass.getSuperclass();
        }
        return testClass.getName().equals( lookFor );
```

### AssignmentToMethodParameter
Assignment to method parameter `mergedSummary`
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/util/FailsafeSummaryXmlUtils.java`
#### Snippet
```java
        {
            RunResult runResult = toRunResult( mergedSummaryFile );
            mergedSummary = mergedSummary.aggregate( runResult );
        }

```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3Reflector.java`
#### Snippet
```java
        catch ( NoSuchMethodException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit3/src/main/java/org/apache/maven/surefire/junit/TestListenerInvocationHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PropertiesWrapper.java`
#### Snippet
```java
    {
        String number = getProperty( propertyName );
        return number == null ? null : Long.parseLong( number );
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PropertiesWrapper.java`
#### Snippet
```java
        if ( property == null )
        {
            return null;
        }
        TypeEncodedValue typeEncodedValue = new TypeEncodedValue( File.class.getName(), property );
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PropertiesWrapper.java`
#### Snippet
```java
        else
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ProcessCheckerType.java`
#### Snippet
```java
        if ( isBlank( type ) )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedNodeArg.java`
#### Snippet
```java
    public File getCommandStreamBinaryFile()
    {
        return isDebug ? DumpErrorSingleton.getSingleton().getCommandStreamBinaryFile() : null;
    }
}
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/TypeEncodedValue.java`
#### Snippet
```java
        if ( type.trim().isEmpty() )
        {
            return null;
        }
        else if ( type.equals( String.class.getName() ) )
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
        if ( resolver == null )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
        if ( suiteDefinition == null )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
        if ( runOrderParameters == null )
        {
            return null;
        }
        //Can't use the constructor with the RunOrder parameter. Using it causes some integration tests to fail.
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
        if ( directoryScannerParameters == null )
        {
            return null;
        }
        //Can't use the constructor with the RunOrder parameter. Using it causes some integration tests to fail.
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
        if ( testArtifactInfo == null )
        {
            return null;
        }
        Class<?>[] arguments = { String.class, String.class };
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
            {
                File jdk = parent.getParentFile();
                return new File( jdk, "bin" ).isDirectory() ? jdk : null;
            }
            return parent;
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
            return parent;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
            return reflectClassLoader( ClassLoader.class, "getPlatformClassLoader" );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
            catch ( NumberFormatException e )
            {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        catch ( RuntimeException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        if ( !release.isFile() )
        {
            return null;
        }
        Properties properties = new Properties();
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
            else
            {
                return null;
            }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        catch ( IOException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/StartupConfiguration.java`
#### Snippet
```java
        if ( str == null )
        {
            return null;
        }
        int end = str.length();
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/AbstractMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
                                  // All business data is already safely flushed by test events, then by sending BYE
                                  // event at the exit time and finally by flushEventChannelOnExit() in ForkedBooter.
                                  return null;
                              }
                          }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
                                                   {
                                                       pingScheduler.shutdown();
                                                       return null;
                                                   }
                                               }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
    {
        File surefirePropertiesFile = new File( tmpDir, propFileName );
        return surefirePropertiesFile.exists() ? new FileInputStream( surefirePropertiesFile ) : null;
    }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
            return new LazyTestsToRun( eventChannel, commandReader );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/RequestedTest.java`
#### Snippet
```java
    private String classFile( Class<?> realTestClass )
    {
        return realTestClass == null ? null : realTestClass.getName().replace( '.', '/' ) + CLASS_FILE_EXTENSION;
    }
}
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/SurefireMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
        if ( query == null )
        {
            return null;
        }
        for ( StringTokenizer tokenizer = new StringTokenizer( query, "&" ); tokenizer.hasMoreTokens(); )
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/SurefireMasterProcessChannelProcessorFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/stream/CommandDecoder.java`
#### Snippet
```java
        if ( sink == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/stream/CommandDecoder.java`
#### Snippet
```java
            {
                os.close();
                return null;
            } ) ) );
            return os;
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/stream/CommandDecoder.java`
#### Snippet
```java
        catch ( FileNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/stream/CommandDecoder.java`
#### Snippet
```java
                memento.getLine().write( memento.getByteBuffer(), e.readFrom(), length );
            }
            return null;
        }
        catch ( RuntimeException e )
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/stream/CommandDecoder.java`
#### Snippet
```java
        {
            getArguments().dumpStreamException( e );
            return null;
        }
        catch ( IOException e )
```

### ReturnNull
Return of `null`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/EventChannelEncoder.java`
#### Snippet
```java
        if ( stw == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
                        trimStackTrace, rerunFailingTestsCount, xsdSchemaLocation, testClassMethodRunHistory );

        return xmlReporter.isDisable() ? null : xmlReporter.createListener( xmlReporterConfig );
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
                ? consoleOutputReporter.createListener( resolveReportsDirectory( forkNum ), reportNameSuffix, forkNum )
                : consoleOutputReporter.createListener( originalSystemOut, originalSystemErr );
        return consoleOutputReporter.isDisable() ? null : outputReport;
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
    {
        return !testsetReporter.isDisable() && shouldReportToConsole()
                ? testsetReporter.createListener( consoleLogger ) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
        return !testsetReporter.isDisable() && isUseFile() && isBriefOrPlainFormat()
            ? testsetReporter.createListener( resolveReportsDirectory( forkNumber ), reportNameSuffix, encoding )
            : null;
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/WrappedReportEntry.java`
#### Snippet
```java
    {
        StackTraceWriter w = original.getStackTraceWriter();
        return w == null ? null : ( trimStackTrace ? w.writeTrimmedTraceToString() : w.writeTraceToString() );
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/Platform.java`
#### Snippet
```java
        catch ( Exception e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ChecksumCalculator.java`
#### Snippet
```java
        if ( bytes == null )
        {
            return null;
        }
        final StringBuilder result = new StringBuilder( 2 * bytes.length );
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireForkChannel.java`
#### Snippet
```java
        try
        {
            return session == null ? null : session.get();
        }
        catch ( ExecutionException e )
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/BooterSerializer.java`
#### Snippet
```java
        if ( value == null )
        {
            return null;
        }
        String valueToUse = value instanceof Class ? ( (Class<?>) value ).getName() : value.toString();
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/DefaultCommandReader.java`
#### Snippet
```java
        if ( isClosed() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/DefaultCommandReader.java`
#### Snippet
```java
        {
            close();
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/DefaultCommandReader.java`
#### Snippet
```java
        if ( isClosed() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/Notifier.java`
#### Snippet
```java
    public final Queue<String> getRemainingTestClasses()
    {
        return failFast ? testClassNames : null;
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
        if ( sink == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
            {
                os.close();
                return null;
            } ) ) );
            return os;
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
        catch ( FileNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
    {
        boolean exists = traceMessage != null || stackTrace != null || smartTrimmedStackTrace != null;
        return exists ? new DeserializedStacktraceWriter( traceMessage, smartTrimmedStackTrace, stackTrace ) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
                memento.getLine().write( memento.getByteBuffer(), e.readFrom(), length );
            }
            return null;
        }
        catch ( RuntimeException e )
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
        {
            getArguments().dumpStreamException( e );
            return null;
        }
        catch ( IOException e )
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/TestLessInputStream.java`
#### Snippet
```java
                    node = next;
                }
                return next == null ? null : next.command;
            }
        }
```

### ReturnNull
Return of `null`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4Reflector.java`
#### Snippet
```java
    {
        final Ignore ignore = getAnnotatedIgnore( description );
        return ignore != null ? ignore.value() : null;
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4Reflector.java`
#### Snippet
```java
    {
        Method getAnnotation = tryGetMethod( d.getClass(), "getAnnotation", PARAMS );
        return getAnnotation == null ? null : (Ignore) invokeMethodWithArray( d, getAnnotation, IGNORE_PARAMS );
    }

```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
        public File getCommandStreamBinaryFile()
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
        {
            return debug ? InPluginProcessDumpSingleton.getSingleton()
                .getEventStreamBinaryFile( dumpLogDir, forkChannelId ) : null;
        }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
                        .findFirst()
                        .map( u -> u.replaceAll( "[^A-Za-z0-9\\-_]", "" ) )
                        .map( u -> u.isEmpty() ? null : u )
                        .orElse( Long.toString( System.currentTimeMillis() ) );

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/RunOrder.java`
#### Snippet
```java
        if ( name == null )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TestsToRun.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/ReflectionUtils.java`
#### Snippet
```java
        catch ( NoSuchMethodException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/ReflectionUtils.java`
#### Snippet
```java
        catch ( NoSuchMethodException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/ReflectionUtils.java`
#### Snippet
```java
        {
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultRunOrderCalculator.java`
#### Snippet
```java
        else
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java
        Long startTime = testStartTime.remove( testIdentifier );
        long endTime = System.currentTimeMillis();
        return startTime == null ? null : (int) ( endTime - startTime );
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java
        {
            SafeThrowable t = throwable == null ? null : new SafeThrowable( throwable );
            return t == null ? null : t.getMessage();
        }
        catch ( Throwable t )
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/suite/RunResult.java`
#### Snippet
```java
            return FAILURE;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/suite/RunResult.java`
#### Snippet
```java
        if ( e == null )
        {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/BaseProviderFactory.java`
#### Snippet
```java
    {
        return directoryScannerParameters == null
                ? null : new DefaultDirectoryScanner( directoryScannerParameters.getTestClassesDirectory(),
                                            directoryScannerParameters.getIncludes(),
                                            directoryScannerParameters.getExcludes(),
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestRequest.java`
#### Snippet
```java
            return files;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if ( isBlank( className ) )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if ( s == null )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        {
            String trimmed = s.trim();
            return StringUtils.isEmpty( trimmed ) ? null : trimmed;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/CategorizedReportEntry.java`
#### Snippet
```java
        if ( isBlank ( sourceText ) )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            read( memento, DELIMITER_LENGTH );
            checkDelimiter( memento );
            return null;
        }
        return readLongPrivate( memento );
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            read( memento, DELIMITER_LENGTH );
            checkDelimiter( memento );
            return null;
        }
        return readInt( memento );
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    {
        return fullyQualifiedTestClass == null
            ? null
            : fullyQualifiedTestClass.replace( '.', '/' ) + JAVA_CLASS_FILE_EXTENSION;
    }
```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    public static String toClassFileName( Class<?> test )
    {
        return test == null ? null : toClassFileName( test.getName() );
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/SimpleReportEntry.java`
#### Snippet
```java
    public String getGroup()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/SimpleReportEntry.java`
#### Snippet
```java
        {
            SafeThrowable t = stackTraceWriter == null ? null : stackTraceWriter.getThrowable();
            return t == null ? null : t.getMessage();
        }
        catch ( Throwable t )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGDirectoryTestSuite.java`
#### Snippet
```java
        catch ( ClassNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGDirectoryTestSuite.java`
#### Snippet
```java
        catch ( ClassNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
            if ( !project.isExecutionRoot() )
            {
                return null;
            }
            if ( this.reportsDirectories == null )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
        if ( val == null )
        {
            return null;
        }
        else if ( type.isAssignableFrom( val.getClass() ) )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
            if ( value == null )
            {
                return null;
            }
            if ( paramClass.isAssignableFrom( value.getClass() ) )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGExecutor.java`
#### Snippet
```java
        if ( clazz == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGExecutor.java`
#### Snippet
```java
        if ( groups == null && excludedGroups == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGExecutor.java`
#### Snippet
```java
        else
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
            {
                boolean stampedStatusWithTimeout = ParallelComputer.this.forcedShutdownStatus.tryTimeout();
                return stampedStatusWithTimeout ? ParallelComputer.this.describeStopped( true ) : null;
            }
        };
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
            {
                boolean stampedStatusWithTimeout = ParallelComputer.this.shutdownStatus.tryTimeout();
                return stampedStatusWithTimeout ? ParallelComputer.this.describeStopped( false ) : null;
            }
        };
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        if ( getDependenciesToScan() == null )
        {
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
            return tcs.get( 0 );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/PojoStackTraceWriter.java`
#### Snippet
```java
    public SafeThrowable getThrowable()
    {
        return t == null ? null : new SafeThrowable( t );
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
    {
        final List<Runner> onlyRunners = removeNullRunners( runners );
        return onlyRunners.isEmpty() ? null : new Suite( null, onlyRunners )
        {
        };
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
        {
            Class c = Class.forName( "net.jcip.annotations.NotThreadSafe" );
            return c.isAnnotation() ? (Class<? extends Annotation>) c : null;
        }
        catch ( ClassNotFoundException e )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
        catch ( ClassNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
        {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            return classLoader == null ? null : classLoader.loadClass( name );
        }
        catch ( ClassNotFoundException e )
```

### ReturnNull
Return of `null`
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
        catch ( ClassNotFoundException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
                summary.getFailure().substring( firstForkExceptionFailureMessage.length() ) );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
    protected String[] getDefaultIncludes()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit4/src/main/java/org/apache/maven/surefire/junit4/JUnit4Provider.java`
#### Snippet
```java
    {
        TestListResolver methodFilter = optionallyWildcardFilter( testResolver );
        return methodFilter.isEmpty() || methodFilter.isWildcard() ? null : new TestResolverFilter( methodFilter );
    }
}
```

### ReturnNull
Return of `null`
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
        try
        {
            return f == null ? null : f.getAbsoluteFile().getCanonicalFile();
        }
        catch ( IOException e )
```

### ReturnNull
Return of `null`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java
                logger.error( writer.writeTraceToString() );
            }
            return null;
        }
        else
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tempDirCandidate` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
        String tempDirName = subDirName == null ? null
                        : subDirName.trim().isEmpty() ? null : subDirName.trim();
        File tempDirCandidate = tempDirName == null ? new File( getJavaIoTmpDir() )
                        : new File( getJavaIoTmpDir(), tempDirName );
        return tempDirCandidate;
```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CountdownCloseable.java`
#### Snippet
```java
        if ( countdown > 0 )
        {
            wait();
        }
    }
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'prioritizedTest1' to 'PrioritizedTest'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
        for ( Object prioritizedTest1 : prioritizedTests )
        {
            threadedExecutionScheduler.addTest( (PrioritizedTest) prioritizedTest1 );
        }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'ReportPlugin'
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
                for ( Object o : project.getReportPlugins() )
                {
                    ReportPlugin report = (ReportPlugin) o;

                    String artifactId = report.getArtifactId();
```

