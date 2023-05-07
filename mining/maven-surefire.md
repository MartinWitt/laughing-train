# maven-surefire 
 
# Bad smells
I found 318 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantCast | 64 | false |
| Deprecation | 62 | false |
| JavadocReference | 25 | false |
| DeprecatedIsStillUsed | 22 | false |
| RedundantTypeArguments | 21 | false |
| NullableProblems | 20 | false |
| UNCHECKED_WARNING | 13 | false |
| IOStreamConstructor | 12 | false |
| IgnoreResultOfCall | 9 | false |
| ConstantValue | 8 | false |
| DataFlowIssue | 7 | false |
| DuplicatedCode | 6 | false |
| DanglingJavadoc | 6 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| UnnecessaryToStringCall | 3 | true |
| TrivialIf | 3 | false |
| RedundantMethodOverride | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| FieldMayBeFinal | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnusedAssignment | 2 | false |
| UnnecessarySemicolon | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RefusedBequest | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CollectionContainsUrl | 1 | false |
| RegExpSimplifiable | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ThreadRun | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| CdiInjectionPointsInspection | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| InfiniteLoopStatement | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| JavaReflectionInvocation | 1 | false |
| StringConcatenationInLoops | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Filter\[filters.size()\]'
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
                .ifPresent(filters::add);

        return filters.toArray(new Filter<?>[filters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[cats.size()\]'
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/GroupMatcherCategoryFilter.java`
#### Snippet
```java

            cats.remove(null);
            boolean result = matcher.enabled(cats.toArray(new Class<?>[cats.size()]));

            if (!result) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[result.size()\]'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TestsToRun.java`
#### Snippet
```java
            result.add(clazz);
        }
        return result.toArray(new Class<?>[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new RunOrder\[result.size()\]'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/RunOrder.java`
#### Snippet
```java
            }
        }
        return result.toArray(new RunOrder[result.size()]);
    }

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
        // Iterate over recorded failures
        for (TestIdentifier identifier :
                new LinkedHashSet<>(adapter.getFailures().keySet())) {
            builder.selectors(selectUniqueId(identifier.getUniqueId()));
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.maven.surefire.api.stream.AbstractStreamDecoder.Memento' to 'org.apache.maven.surefire.api.stream.AbstractStreamDecoder.Memento'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/EventConsumerThread.java`
#### Snippet
```java
            Memento memento = eventDecoder.new Memento();
            do {
                Event event = eventDecoder.decode(memento);
                if (event != null && !disabled) {
                    eventHandler.handleEvent(event);
```

### UNCHECKED_WARNING
Unchecked call to 'handle(T)' as a member of raw type 'org.apache.maven.plugin.surefire.booterclient.output.ForkedProcessReportEventListener'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/ForkedProcessEventNotifier.java`
#### Snippet
```java
            ReportEntry reportEntry = testControlEvent.getReportEntry();
            if (listener != null) {
                listener.handle(reportEntry);
            }
        } else if (event.isJvmExitError()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.maven.surefire.api.report.TestReportListener' to 'org.apache.maven.surefire.api.report.TestReportListener'
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/TestSet.java`
#### Snippet
```java
        allScheduled = true;
        if (isAllTestsDone()) {
            replay(reporterManager);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.maven.surefire.api.report.TestReportListener' to 'org.apache.maven.surefire.api.report.TestReportListener'
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/TestSet.java`
#### Snippet
```java
        numberOfCompletedChildren.incrementAndGet();
        if (allScheduled && isAllTestsDone() && reportImmediately) {
            replay(reporterManager);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
                    plugin,
                    getPluginArtifactMap());
            return new LinkedHashSet<>(providerArtifacts.values());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
                    plugin,
                    getPluginArtifactMap());
            return new LinkedHashSet<>(providerArtifacts.values());
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
            alignProviderVersions(providerArtifacts);

            return new LinkedHashSet<>(providerArtifacts.values());
        }

```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
            alignProviderVersions(providerArtifacts);

            return new LinkedHashSet<>(providerArtifacts.values());
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.maven.surefire.api.stream.AbstractStreamDecoder.Memento' to 'org.apache.maven.surefire.api.stream.AbstractStreamDecoder.Memento'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/CommandChannelDecoder.java`
#### Snippet
```java
        do {
            try {
                Command command = decoder.decode(memento);
                if (command != null) {
                    return command;
```

### UNCHECKED_WARNING
Unchecked call to 'getAnnotation(Class)' as a member of raw type 'java.lang.Class'
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/JUnit48Reflector.java`
#### Snippet
```java
        return clazz != null
                && category != null
                && (clazz.getAnnotation(category) != null || isCategoryAnnotationPresent(clazz.getSuperclass()));
    }
}
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNG740Configurator.java`
#### Snippet
```java
            Class enumClass = loadClass(XmlSuite.class.getClassLoader(), "org.testng.xml.XmlSuite$ParallelMode");
            try {
                Enum<?> parallelEnum = Enum.valueOf(enumClass, parallel.toUpperCase());
                invokeSetter(suite, "setParallel", enumClass, parallelEnum);
            } catch (IllegalArgumentException e) {
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.maven.surefire.api.report.TestReportListener', required 'org.apache.maven.surefire.api.report.TestReportListener'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/ForkingReporterFactory.java`
#### Snippet
```java

    @Override
    public TestReportListener createTestReportListener() {
        return new ForkingRunListener(eventChannel, trimstackTrace);
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ResolvePathResult`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/ResolvePathResultWrapper.java`
#### Snippet
```java

/**
 * Wraps {@link ResolvePathResult} and place marker.
 */
final class ResolvePathResultWrapper {
```

### JavadocReference
Cannot resolve symbol `Logger`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/log/PluginConsoleLogger.java`
#### Snippet
```java

/**
 * Wrapper logger of miscellaneous implementations of {@link Logger}.
 *
 * This instance is synchronized. The logger operations are mutually exclusive to standard out, standard err and console
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.surefire.shared.utils.cli.Commandline`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/lazytestprovider/Commandline.java`
#### Snippet
```java

/**
 * A {@link org.apache.maven.surefire.shared.utils.cli.Commandline} implementation.
 *
 * @author Andreas Gudian
```

### JavadocReference
Symbol `getChildren()` is inaccessible from here
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/WrappedRunners.java`
#### Snippet
```java
 * <br>
 * Old JUnit versions do not cache children after the first call of
 * {@link org.junit.runners.ParentRunner#getChildren()}.
 * Due to performance reasons, the children have to be observed just once.
 *
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
     * @param asScanList true if dependency or directory scanner
     * @return list of patterns
     * @throws MojoFailureException if the excludes breaks a pattern format
     */
    @Nonnull
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
     * @param asScanList true if dependency or directory scanner
     * @return list of patterns
     * @throws MojoFailureException if the includes breaks a pattern format
     */
    @Nonnull
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNG`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
    /**
     * Constructs a new instance that will listen to
     * test updates from a {@link org.testng.TestNG} class instance.
     * <br>
     * <br>It is assumed that the requisite {@link org.testng.TestNG#addListener(ITestListener)}
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNG`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
     * test updates from a {@link org.testng.TestNG} class instance.
     * <br>
     * <br>It is assumed that the requisite {@link org.testng.TestNG#addListener(ITestListener)}
     * method call has already associated with this instance <i>before</i> the test
     * suite is run.
```

### JavadocReference
Cannot resolve symbol `addListener(ITestListener)`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
     * test updates from a {@link org.testng.TestNG} class instance.
     * <br>
     * <br>It is assumed that the requisite {@link org.testng.TestNG#addListener(ITestListener)}
     * method call has already associated with this instance <i>before</i> the test
     * suite is run.
```

### JavadocReference
Cannot resolve symbol `ITestListener`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
     * test updates from a {@link org.testng.TestNG} class instance.
     * <br>
     * <br>It is assumed that the requisite {@link org.testng.TestNG#addListener(ITestListener)}
     * method call has already associated with this instance <i>before</i> the test
     * suite is run.
```

### JavadocReference
Cannot resolve symbol `XmlSuite`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNG740Configurator.java`
#### Snippet
```java
     * Convert and apply the value of the [parallel] setting.
     * <p>
     * <b>NOTE</b>: Since TestNG 7.4, the value of the {@code parallel} setting of the {@link XmlSuite} class has been
     * specified via a <b>ParallelMode</b> enumeration. This method converts the [parallel] setting specified in the
     * Surefire plugin configuration to its corresponding constant and applies this to the specified suite object.
```

### JavadocReference
Cannot resolve symbol `XmlSuite`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNG740Configurator.java`
#### Snippet
```java
     * Surefire plugin configuration to its corresponding constant and applies this to the specified suite object.
     *
     * @param suite TestNG {@link XmlSuite} object
     * @param options Surefire plugin configuration options
     * @throws TestSetFailedException if unable to convert specified [parallel] setting
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNG`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java

/**
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
```

### JavadocReference
Cannot resolve symbol `configure(java.util.Map)`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java

/**
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNGCommandLineArgs`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
```

### JavadocReference
Cannot resolve symbol `LISTENER_COMMAND_OPT`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * TestNG configurator for 5.3+ versions. TestNG exposes a {@link org.testng.TestNG#configure(java.util.Map)} method.
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNGCommandLineArgs`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
```

### JavadocReference
Cannot resolve symbol `JUNIT_DEF_OPT`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * All supported TestNG options are passed in String format, except
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNGCommandLineArgs`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
```

### JavadocReference
Cannot resolve symbol `SKIP_FAILED_INVOCATION_COUNT_OPT`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#LISTENER_COMMAND_OPT} which is {@link java.util.List List&gt;Class&lt;},
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNGCommandLineArgs`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
 * <br>
```

### JavadocReference
Cannot resolve symbol `OBJECT_FACTORY_COMMAND_OPT`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#JUNIT_DEF_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
 * <br>
```

### JavadocReference
Cannot resolve symbol `org.testng.TestNGCommandLineArgs`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
 * <br>
 * Test classes and/or suite files are not passed along as options parameters, but configured separately.
```

### JavadocReference
Cannot resolve symbol `REPORTERS_LIST`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
 * {@link org.testng.TestNGCommandLineArgs#SKIP_FAILED_INVOCATION_COUNT_OPT} which is a {@link Boolean},
 * {@link org.testng.TestNGCommandLineArgs#OBJECT_FACTORY_COMMAND_OPT} which is a {@link Class},
 * {@link org.testng.TestNGCommandLineArgs#REPORTERS_LIST} which is a {@link java.util.List List&gt;ReporterConfig&lt;}.
 * <br>
 * Test classes and/or suite files are not passed along as options parameters, but configured separately.
```

### JavadocReference
Cannot resolve symbol `Log`
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/PluginConsoleLogger.java`
#### Snippet
```java

/**
 * Wrapper logger of miscellaneous implementations of {@link Log}.
 *
 * @author <a href="mailto:tibordigana@apache.org">Tibor Digana (tibor17)</a>
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/LineConsumerThread.java`
#### Snippet
```java
    public void run() {
        try (Scanner stream = new Scanner(channel, encoding.name());
                CountdownCloseable c = countdownCloseable; ) {
            boolean isError = false;
            while (stream.hasNextLine()) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `read` may produce `NullPointerException`
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireForkChannel.java`
#### Snippet
```java
            int read;
            do {
                read = getChannel().read(buffer).get();
            } while (read != -1 && buffer.hasRemaining());

```

### DataFlowIssue
Argument `testSuite` might be null
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3Reflector.java`
#### Snippet
```java

        if (isJUnit3Available()) {
            testsSuiteConstructor = ReflectionUtils.getConstructor(testSuite, constructorParamTypes);
            addListenerMethod = tryGetMethod(testResultClass, ADD_LISTENER_METHOD, interfacesImplementedByDynamicProxy);
            testInterfaceRunMethod = getMethod(testInterface, RUN_METHOD, testResultClass);
```

### DataFlowIssue
Argument `testInterface` might be null
in `surefire-providers/common-junit3/src/main/java/org/apache/maven/surefire/common/junit3/JUnit3Reflector.java`
#### Snippet
```java
            testsSuiteConstructor = ReflectionUtils.getConstructor(testSuite, constructorParamTypes);
            addListenerMethod = tryGetMethod(testResultClass, ADD_LISTENER_METHOD, interfacesImplementedByDynamicProxy);
            testInterfaceRunMethod = getMethod(testInterface, RUN_METHOD, testResultClass);
        } else {
            testsSuiteConstructor = null;
```

### DataFlowIssue
Casting `obj` to `AndGroupMatcher` will produce `ClassCastException` for any non-null value
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/OrGroupMatcher.java`
#### Snippet
```java
            return false;
        }
        AndGroupMatcher other = (AndGroupMatcher) obj;
        return getMatchers().equals(other.getMatchers());
    }
```

### DataFlowIssue
Argument `classLoader` might be null
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
            }

            this.bundle = ResourceBundle.getBundle(this.bundleName, locale, classLoader);
            if (!this.bundle.getLocale().getLanguage().equals(locale.getLanguage())) {
                this.bundle = ResourceBundle.getBundle(this.bundleName, Locale.getDefault(), classLoader);
```

### DataFlowIssue
Argument `path` might be null
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
        if (s != null && !isRegex) {
            String path = convertToPath(s);
            path = fromFullyQualifiedClass(path);
            if (path != null && !path.startsWith(WILDCARD_PATH_PREFIX)) {
                path = WILDCARD_PATH_PREFIX + path;
```

### DataFlowIssue
Method invocation `getRunTime` may produce `NullPointerException`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
                if (line.charAt(0) == ' ') {
                    previous = new RunEntryStatistics(
                            previous.getRunTime(),
                            previous.getSuccessfulBuilds(),
                            previous.getClassMethod().getClazz(),
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/ReportTestSuite.java`
#### Snippet
```java
        this.fullClassName = fullClassName;
        int lastDotPosition = fullClassName.lastIndexOf(".");
        name = fullClassName.substring(lastDotPosition + 1, fullClassName.length());
        packageName = lastDotPosition == -1 ? "" : fullClassName.substring(0, lastDotPosition);
        return this;
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `surefire-api/src/main/java/org/apache/maven/surefire/api/suite/RunResult.java`
#### Snippet
```java
            e.printStackTrace(pw);
        }
        return new String(out.toByteArray());
    }

```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `runTime`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/ThreadedExecutionScheduler.java`
#### Snippet
```java
    private final int numThreads;

    private final int runTime[];

    private final List<Class<?>>[] lists;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
    AbstractDirectConfigurator() {
        Map<String, Setter> options = new HashMap<>();
        // options.put( ProviderParameterNames.TESTNG_GROUPS_PROP, new Setter( "setGroups", String.class ) );
        // options.put( ProviderParameterNames.TESTNG_EXCLUDEDGROUPS_PROP, new Setter( "setExcludedGroups", String.class
        // ) );
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'DefaultStatelessReportMojoConfiguration' is still used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/DefaultStatelessReportMojoConfiguration.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultStatelessReportMojoConfiguration extends StatelessReportMojoConfiguration {
    private final Map<String, Deque<WrappedReportEntry>> testClassMethodRunHistory;

```

### DeprecatedIsStillUsed
Deprecated member 'NonConcurrentRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/NonConcurrentRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
class NonConcurrentRunListener extends JUnit4RunListener {
    private Description currentTestSetDescription;

```

### DeprecatedIsStillUsed
Deprecated member 'MethodsParallelRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/MethodsParallelRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
final class MethodsParallelRunListener extends ConcurrentRunListener {
    private volatile TestSet lastStarted;

```

### DeprecatedIsStillUsed
Deprecated member 'ClassesParallelRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ClassesParallelRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
final class ClassesParallelRunListener extends ConcurrentRunListener {
    ClassesParallelRunListener(Map<String, TestSet> classMethodCounts, ReporterFactory reporterFactory) {
        super(reporterFactory, false, classMethodCounts);
```

### DeprecatedIsStillUsed
Deprecated member 'TestMethod' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/TestMethod.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
class TestMethod implements TestOutputReceiver<TestOutputReportEntry> {
    private static final InheritableThreadLocal<TestMethod> TEST_METHOD = new InheritableThreadLocal<>();

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
Deprecated member 'disableXmlReport' is still used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
    @Deprecated // todo make readonly to handle system property
    @Parameter(property = "disableXmlReport", defaultValue = "false")
    private boolean disableXmlReport;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'addURL' is still used
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    @Override
    @Deprecated
    public void addURL(URL url) {
        // avoid duplicates
        // todo avoid URL due to calling equals method may cause some overhead due to resolving host or file.
```

### DeprecatedIsStillUsed
Deprecated member 'isChildDelegation' is still used
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/AbstractPathConfiguration.java`
#### Snippet
```java

    @Deprecated
    public boolean isChildDelegation() {
        return childDelegation;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ConcurrentRunListener' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java
 */
@Deprecated // remove this class after StatelessXmlReporter is capable of parallel test sets processing
abstract class ConcurrentRunListener implements TestReportListener<TestOutputReportEntry> {
    private final Map<String, TestSet> classMethodCounts;

```

### DeprecatedIsStillUsed
Deprecated member 'ConfigurableParallelComputer' is still used
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConfigurableParallelComputer.java`
#### Snippet
```java
 */
@Deprecated
public class ConfigurableParallelComputer extends Computer {
    private static final ThreadFactory DAEMON_THREAD_FACTORY = DaemonThreadFactory.newDaemonThreadFactory();

```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/VerifyMojo.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec() {
        return skipExec;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'failIfNoSpecifiedTestsDeprecated' is still used
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    @Deprecated
    @Parameter(property = "it.failIfNoSpecifiedTests", defaultValue = "true")
    private boolean failIfNoSpecifiedTestsDeprecated;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec() {
        return skipExec;
    }
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
Deprecated member 'DefaultDirectoryScanner' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/DefaultDirectoryScanner.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultDirectoryScanner implements DirectoryScanner {

    private static final String FS = System.getProperty("file.separator");
```

### DeprecatedIsStillUsed
Deprecated member 'ResolvedTest' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
// will be renamed to ResolvedTestPattern
@Deprecated
public final class ResolvedTest {
    /**
     * Type of patterns in ResolvedTest constructor.
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
Deprecated member 'includes' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    private final List<String> includes;

    @Deprecated
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
Deprecated member 'getSpecificTests' is still used
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/DirectoryScannerParameters.java`
#### Snippet
```java

    @Deprecated
    public List<String> getSpecificTests() {
        return specificTests;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'isSkipExec' is still used
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean isSkipExec() {
        return skipExec;
    }
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/util/FailsafeSummaryXmlUtils.java`
#### Snippet
```java
                FAILSAFE_SUMMARY_XML_TEMPLATE,
                fromRunResult.getFailsafeCode(),
                String.valueOf(fromRunResult.isTimeout()),
                fromRunResult.getCompletedCount(),
                fromRunResult.getErrors(),
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/Classpath.java`
#### Snippet
```java

    @Override
    public Classpath clone() {
        return new Classpath(unmodifiableElements);
    }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/providerapi/ServiceLoader.java`
#### Snippet
```java
                        }
                    }
                    if (!names.contains(line)) {
                        names.add(line);
                    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `maven-surefire-common/src/main/java/org/apache/maven/surefire/stream/EventDecoder.java`
#### Snippet
```java
        if (sink == null) {
            return null;
        }

        try {
            OutputStream fos = new FileOutputStream(sink, true);
            final OutputStream os = new BufferedOutputStream(fos, DEBUG_SINK_BUFFER_SIZE);
            addShutDownHook(new Thread(new FutureTask<>(() -> {
                os.close();
                return null;
            })));
            return os;
        } catch (FileNotFoundException e) {
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/LegacyPojoStackTraceWriter.java`
#### Snippet
```java
        if (t != null) {
            StringWriter w = new StringWriter();
            try (PrintWriter stackTrace = new PrintWriter(w)) {
                t.printStackTrace(stackTrace);
            }
            StringBuffer builder = w.getBuffer();
            if (isMultiLineExceptionMessage(t)) {
                // SUREFIRE-986
                String exc = t.getClass().getName() + ": ";
                if (StringUtils.startsWith(builder, exc)) {
                    builder.insert(exc.length(), '\n');
                }
            }
            return builder.toString();
        }
        return "";
```

### DuplicatedCode
Duplicated code
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/LegacyPojoStackTraceWriter.java`
#### Snippet
```java
        String msg = t.getLocalizedMessage();
        if (msg != null) {
            int countNewLines = 0;
            for (int i = 0, length = msg.length(); i < length; i++) {
                if (msg.charAt(i) == '\n') {
                    if (++countNewLines == 2) {
                        break;
                    }
                }
            }
            return countNewLines > 1 || countNewLines == 1 && !msg.trim().endsWith("\n");
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `surefire-providers/common-java5/src/main/java/org/apache/maven/surefire/report/SmartStackTraceParser.java`
#### Snippet
```java
        int countNewLines = 0;
        for (int i = 0, length = msg.length(); i < length; i++) {
            if (msg.charAt(i) == '\n') {
                if (++countNewLines == 2) {
                    break;
                }
            }
        }
        return countNewLines > 1 || countNewLines == 1 && !msg.trim().endsWith("\n");
```

### DuplicatedCode
Duplicated code
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/FilterFactory.java`
#### Snippet
```java
        String groups = providerProperties.get(TESTNG_GROUPS_PROP);

        GroupMatcher included = null;
        if (isNotBlank(groups)) {
            try {
                included = new GroupMatcherParser(groups).parse();
            } catch (ParseException e) {
                throw new IllegalArgumentException(
                        "Invalid group expression: '" + groups + "'. Reason: " + e.getMessage(), e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/TestNGReporter.java`
#### Snippet
```java
        IClass clazz = result.getTestClass();
        String className = clazz.getName();
        String methodName = testName(result);
        long testRunId = classMethodIndexer.indexClassMethod(className, methodName);
        StackTraceWriter stackTraceWriter = new PojoStackTraceWriter(
                clazz.getRealClass().getName(), result.getMethod().getMethodName(), result.getThrowable());
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `urls` may contain URL objects
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    private final ClassLoader parent = ClassLoader.getSystemClassLoader();

    private final Set<URL> urls = new HashSet<>();

    private final String roleName;
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[,]` can be simplified to ','
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/JUnitPlatformProvider.java`
#### Snippet
```java
        return isBlank(property)
                ? empty()
                : of(stream(property.split("[,]+"))
                        .filter(StringUtils::isNotBlank)
                        .map(String::trim)
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `surefire-providers/common-junit4/src/main/java/org/apache/maven/surefire/common/junit4/JUnit4ProviderUtil.java`
#### Snippet
```java
     *
     * @param allFailures the list of failures for a given test class
     * @return the list of descriptions
     */
    public static Set<Description> generateFailingTestDescriptions(List<Failure> allFailures) {
```

## RuleId[id=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/util/CommandlineExecutor.java`
#### Snippet
```java
    public void close() {
        if (shutdownHook != null) {
            shutdownHook.run();
            removeShutdownHook(shutdownHook);
            shutdownHook = null;
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/InvokerStrategy.java`
#### Snippet
```java
    private final Queue<Thread> activeThreads = new ConcurrentLinkedQueue<>();

    protected InvokerStrategy(ConsoleLogger logger) {
        super(logger);
    }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireProperties.java`
#### Snippet
```java

    public static SurefireProperties loadProperties(File file) throws IOException {
        return file == null ? new SurefireProperties() : loadProperties(new FileInputStream(file));
    }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/ConsoleOutputFileReporter.java`
#### Snippet
```java
                    }
                    File file = getReportFile(reportsDirectory, reportEntryName, reportNameSuffix, "-output.txt");
                    os = new BufferedOutputStream(new FileOutputStream(file), STREAM_BUFFER_SIZE);
                    fileOutputStream.set(os, OPEN);
                }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/FileReporter.java`
#### Snippet
```java
    private static BufferedWriter createFileReporterWriter(File reportFile, Charset encoding)
            throws FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reportFile), encoding), 64 * 1024);
    }
}
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/StatelessXmlReporter.java`
#### Snippet
```java
        //noinspection ResultOfMethodCallIgnored
        reportDir.mkdirs();
        return new BufferedOutputStream(new FileOutputStream(reportFile), 64 * 1024);
    }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/JarManifestForkConfiguration.java`
#### Snippet
```java
        }
        Path parent = file.getParentFile().toPath();
        OutputStream fos = new BufferedOutputStream(new FileOutputStream(file), 64 * 1024);

        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(fos)) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemPropertyManager.java`
#### Snippet
```java

    private static PropertiesWrapper loadProperties(File file) throws IOException {
        return loadProperties(new FileInputStream(file));
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SystemUtils.java`
#### Snippet
```java
        }
        Properties properties = new Properties();
        try (InputStream is = new FileInputStream(release)) {
            properties.load(is);
            String javaVersion = properties.getProperty("JAVA_VERSION").replace("\"", "");
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/ForkedBooter.java`
#### Snippet
```java
            throws FileNotFoundException {
        File surefirePropertiesFile = new File(tmpDir, propFileName);
        return surefirePropertiesFile.exists() ? new FileInputStream(surefirePropertiesFile) : null;
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/util/FailsafeSummaryXmlUtils.java`
#### Snippet
```java
        XPath xpath = xpathFactory.newXPath();

        try (Reader reader = new InputStreamReader(new FileInputStream(failsafeSummaryXml), UTF_8)) {
            Node root = (Node) xpath.evaluate("/", new InputSource(reader), NODE);

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/TestSuiteXmlParser.java`
#### Snippet
```java
    public List<ReportTestSuite> parse(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
        File f = new File(xmlPath);
        try (InputStreamReader stream = new InputStreamReader(new FileInputStream(f), UTF_8)) {
            return parse(stream);
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
        if (file.exists()) {
            try {
                return fromStream(new FileInputStream(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
            statsFile.delete();
        }
        OutputStream os = new FileOutputStream(statsFile);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, UTF_8), 64 * 1024)) {
            List<RunEntryStatistics> items = new ArrayList<>(runEntryStatistics.values());
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.maven.plugin.surefire.extensions.DefaultStatelessReportMojoConfiguration' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
                isForking ? new ConcurrentHashMap<String, Deque<WrappedReportEntry>>() : this.testClassMethodRunHistory;

        DefaultStatelessReportMojoConfiguration xmlReporterConfig = new DefaultStatelessReportMojoConfiguration(
                resolveReportsDirectory(forkNumber),
                reportNameSuffix,
```

### Deprecation
'org.apache.maven.plugin.surefire.extensions.DefaultStatelessReportMojoConfiguration' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/StartupReportConfiguration.java`
#### Snippet
```java
                isForking ? new ConcurrentHashMap<String, Deque<WrappedReportEntry>>() : this.testClassMethodRunHistory;

        DefaultStatelessReportMojoConfiguration xmlReporterConfig = new DefaultStatelessReportMojoConfiguration(
                resolveReportsDirectory(forkNumber),
                reportNameSuffix,
```

### Deprecation
'convertSlashToSystemFileSeparator(java.lang.String)' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/SpecificFileFilter.java`
#### Snippet
```java
import org.apache.maven.surefire.shared.utils.io.SelectorUtils;

import static org.apache.maven.plugin.surefire.util.ScannerUtil.convertSlashToSystemFileSeparator;

/**
```

### Deprecation
'org.apache.maven.plugin.surefire.extensions.DefaultStatelessReportMojoConfiguration' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireStatelessReporter.java`
#### Snippet
```java
    @Override
    public StatelessReportEventListener<WrappedReportEntry, TestSetStats> createListener(
            DefaultStatelessReportMojoConfiguration configuration) {
        return new StatelessXmlReporter(
                configuration.getReportsDirectory(),
```

### Deprecation
'org.apache.maven.plugin.surefire.extensions.DefaultStatelessReportMojoConfiguration' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireStatelessReporter.java`
#### Snippet
```java
 */
public class SurefireStatelessReporter
        extends StatelessReporter<WrappedReportEntry, TestSetStats, DefaultStatelessReportMojoConfiguration> {
    /**
     * Activated in the injection point of MOJO.
```

### Deprecation
'org.apache.maven.plugin.surefire.extensions.DefaultStatelessReportMojoConfiguration' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/junit5/JUnit5Xml30StatelessReporter.java`
#### Snippet
```java
    @Override
    public StatelessReportEventListener<WrappedReportEntry, TestSetStats> createListener(
            DefaultStatelessReportMojoConfiguration configuration) {
        return new StatelessXmlReporter(
                configuration.getReportsDirectory(),
```

### Deprecation
'isChildDelegation()' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/BooterSerializer.java`
#### Snippet
```java
        properties.setClasspath(SUREFIRE_CLASSPATH, cp.getProviderClasspath());
        properties.setProperty(ENABLE_ASSERTIONS, toString(cp.isEnableAssertions()));
        properties.setProperty(CHILD_DELEGATION, toString(cp.isChildDelegation()));
        ProcessCheckerType processChecker = startupConfiguration.getProcessChecker();
        properties.setNullableProperty(PROCESS_CHECKER, processChecker == null ? null : processChecker.getType());
```

### Deprecation
'getIncludes()' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/BooterSerializer.java`
#### Snippet
```java
        DirectoryScannerParameters directoryScannerParameters = providerConfiguration.getDirScannerParams();
        if (directoryScannerParameters != null) {
            properties.addList(directoryScannerParameters.getIncludes(), INCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getExcludes(), EXCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getSpecificTests(), SPECIFIC_TEST_PROPERTY_PREFIX);
```

### Deprecation
'getExcludes()' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/BooterSerializer.java`
#### Snippet
```java
        if (directoryScannerParameters != null) {
            properties.addList(directoryScannerParameters.getIncludes(), INCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getExcludes(), EXCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getSpecificTests(), SPECIFIC_TEST_PROPERTY_PREFIX);
            properties.setProperty(TEST_CLASSES_DIRECTORY, directoryScannerParameters.getTestClassesDirectory());
```

### Deprecation
'getSpecificTests()' is deprecated
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/BooterSerializer.java`
#### Snippet
```java
            properties.addList(directoryScannerParameters.getIncludes(), INCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getExcludes(), EXCLUDES_PROPERTY_PREFIX);
            properties.addList(directoryScannerParameters.getSpecificTests(), SPECIFIC_TEST_PROPERTY_PREFIX);
            properties.setProperty(TEST_CLASSES_DIRECTORY, directoryScannerParameters.getTestClassesDirectory());
        }
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestSet' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
 */
final class JUnitCoreRunListener extends JUnit4RunListener {
    private final Map<String, TestSet> classMethodCounts;

    /**
```

### Deprecation
'org.apache.maven.surefire.junitcore.ConcurrentRunListener' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
 * Methods annotated with @Ignore trigger no further events.
 *
 * @see org.apache.maven.surefire.junitcore.ConcurrentRunListener for details about parallel running
 */
final class JUnitCoreRunListener extends JUnit4RunListener {
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestSet' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
            final String testClassName = extractClassName(description.getDisplayName());
            if (testClassName != null) {
                final TestSet testSet;
                if (classMethodCounts.containsKey(testClassName)) {
                    testSet = classMethodCounts.get(testClassName);
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestSet' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
                    testSet = classMethodCounts.get(testClassName);
                } else {
                    testSet = new TestSet(testClassName, getRunMode(), classMethodIndexer);
                    classMethodCounts.put(testClassName, testSet);
                }
```

### Deprecation
'org.apache.maven.surefire.junitcore.ConcurrentRunListener' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
     * @param classMethodCounts A map of methods
     */
    JUnitCoreRunListener(ConcurrentRunListener reporter, Map<String, TestSet> classMethodCounts) {
        super(reporter);
        this.classMethodCounts = classMethodCounts;
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestSet' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java
     * @param classMethodCounts A map of methods
     */
    JUnitCoreRunListener(ConcurrentRunListener reporter, Map<String, TestSet> classMethodCounts) {
        super(reporter);
        this.classMethodCounts = classMethodCounts;
```

### Deprecation
'org.apache.maven.surefire.junitcore.NonConcurrentRunListener' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreProvider.java`
#### Snippet
```java
        final JUnit4RunListener listener;
        if (isSingleThreaded()) {
            listener = new NonConcurrentRunListener(reporterFactory.createTestReportListener());
        } else {
            Map<String, TestSet> testSetMap = new ConcurrentHashMap<>();
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestSet' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreProvider.java`
#### Snippet
```java
            listener = new NonConcurrentRunListener(reporterFactory.createTestReportListener());
        } else {
            Map<String, TestSet> testSetMap = new ConcurrentHashMap<>();
            boolean parallelClasses = isParallelTypes();
            boolean parallelBoth = isParallelMethodsAndTypes();
```

### Deprecation
'org.apache.maven.surefire.junitcore.ConcurrentRunListener' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreProvider.java`
#### Snippet
```java
            boolean parallelClasses = isParallelTypes();
            boolean parallelBoth = isParallelMethodsAndTypes();
            ConcurrentRunListener concurrentListener =
                    createInstance(testSetMap, reporterFactory, parallelClasses, parallelBoth);
            listener = new JUnitCoreRunListener(concurrentListener, testSetMap);
```

### Deprecation
'org.apache.maven.surefire.junitcore.ConcurrentRunListener' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreProvider.java`
#### Snippet
```java
import static org.apache.maven.surefire.common.junit4.JUnit4RunListenerFactory.createCustomListeners;
import static org.apache.maven.surefire.common.junit4.Notifier.pureNotifier;
import static org.apache.maven.surefire.junitcore.ConcurrentRunListener.createInstance;

/**
```

### Deprecation
'addURL(java.net.URL)' is deprecated
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/Classpath.java`
#### Snippet
```java
            IsolatedClassLoader classLoader = new IsolatedClassLoader(parent, childDelegation, roleName);
            for (String classPathElement : unmodifiableElements) {
                classLoader.addURL(new File(classPathElement).toURI().toURL());
            }
            if (parent != null) {
```

### Deprecation
'getIncludes()' is deprecated
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
                constructor,
                directoryScannerParameters.getTestClassesDirectory(),
                directoryScannerParameters.getIncludes(),
                directoryScannerParameters.getExcludes(),
                directoryScannerParameters.getSpecificTests(),
```

### Deprecation
'getExcludes()' is deprecated
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
                directoryScannerParameters.getTestClassesDirectory(),
                directoryScannerParameters.getIncludes(),
                directoryScannerParameters.getExcludes(),
                directoryScannerParameters.getSpecificTests(),
                RunOrder.asString(directoryScannerParameters.getRunOrder()));
```

### Deprecation
'getSpecificTests()' is deprecated
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/SurefireReflector.java`
#### Snippet
```java
                directoryScannerParameters.getIncludes(),
                directoryScannerParameters.getExcludes(),
                directoryScannerParameters.getSpecificTests(),
                RunOrder.asString(directoryScannerParameters.getRunOrder()));
    }
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/MethodFilter.java`
#### Snippet
```java
        Collection<Filter> includedFilters = new LinkedHashSet<>();
        Collection<Filter> excludedFilters = new LinkedHashSet<>();
        for (ResolvedTest test : testResolver.getIncludedPatterns()) {
            includedFilters.add(new RequestedTest(test, true));
        }
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/MethodFilter.java`
#### Snippet
```java
            includedFilters.add(new RequestedTest(test, true));
        }
        for (ResolvedTest test : testResolver.getExcludedPatterns()) {
            excludedFilters.add(new RequestedTest(test, false));
        }
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/RequestedTest.java`
#### Snippet
```java
    private static final String CLASS_FILE_EXTENSION = ".class";

    private final ResolvedTest test;
    private final boolean isPositiveFilter;

```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-providers/common-junit48/src/main/java/org/apache/maven/surefire/common/junit48/RequestedTest.java`
#### Snippet
```java
    private final boolean isPositiveFilter;

    RequestedTest(ResolvedTest test, boolean isPositiveFilter) {
        this.test = test;
        this.isPositiveFilter = isPositiveFilter;
```

### Deprecation
'org.apache.maven.surefire.junitcore.TestMethod' is deprecated
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/ConcurrentRunListener.java`
#### Snippet
```java

import static java.lang.ThreadLocal.withInitial;
import static org.apache.maven.surefire.junitcore.TestMethod.getThreadTestMethod;

/**
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
 * using specific ClassLoader.
 */
public class TestListResolver implements GenericTestPattern<ResolvedTest, String, String> {
    private static final String JAVA_CLASS_FILE_EXTENSION = ".class";

```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    private static void updatedFilters(
            boolean isExcluded,
            ResolvedTest test,
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            ResolvedTest test,
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        if (isExcluded) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        if (isExcluded) {
            excludedFilters.add(test);
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    private static final TestListResolver EMPTY = new TestListResolver("");

    private final Set<ResolvedTest> includedPatterns;

    private final Set<ResolvedTest> excludedPatterns;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            boolean isExcluded,
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        for (String method : split(methods, "+")) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        for (String method : split(methods, "+")) {
            method = method.trim();
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        for (String method : split(methods, "+")) {
            method = method.trim();
            ResolvedTest test = new ResolvedTest(clazz, method, false);
            if (!test.isEmpty()) {
                updatedFilters(isExcluded, test, patterns, includedFilters, excludedFilters);
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        for (String method : split(methods, "+")) {
            method = method.trim();
            ResolvedTest test = new ResolvedTest(clazz, method, false);
            if (!test.isEmpty()) {
                updatedFilters(isExcluded, test, patterns, includedFilters, excludedFilters);
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    private final Set<ResolvedTest> includedPatterns;

    private final Set<ResolvedTest> excludedPatterns;

    private final boolean hasIncludedMethodPatterns;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    public static TestListResolver newTestListResolver(
            Set<ResolvedTest> includedPatterns, Set<ResolvedTest> excludedPatterns) {
        return new TestListResolver(
                haveMethodPatterns(includedPatterns),
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    public static TestListResolver newTestListResolver(
            Set<ResolvedTest> includedPatterns, Set<ResolvedTest> excludedPatterns) {
        return new TestListResolver(
                haveMethodPatterns(includedPatterns),
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            boolean hasIncludedMethodPatterns,
            boolean hasExcludedMethodPatterns,
            Set<ResolvedTest> includedPatterns,
            Set<ResolvedTest> excludedPatterns) {
        this.includedPatterns = includedPatterns;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            boolean hasExcludedMethodPatterns,
            Set<ResolvedTest> includedPatterns,
            Set<ResolvedTest> excludedPatterns) {
        this.includedPatterns = includedPatterns;
        this.excludedPatterns = excludedPatterns;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    @Override
    public Set<ResolvedTest> getExcludedPatterns() {
        return excludedPatterns;
    }
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    }

    private static boolean haveMethodPatterns(Set<ResolvedTest> patterns) {
        for (ResolvedTest pattern : patterns) {
            if (pattern.hasTestMethodPattern()) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    private static boolean haveMethodPatterns(Set<ResolvedTest> patterns) {
        for (ResolvedTest pattern : patterns) {
            if (pattern.hasTestMethodPattern()) {
                return true;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    }

    private static String aggregatedTest(String testPrefix, Set<ResolvedTest> tests) {
        StringBuilder aggregatedTest = new StringBuilder();
        for (ResolvedTest test : tests) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    private static String aggregatedTest(String testPrefix, Set<ResolvedTest> tests) {
        StringBuilder aggregatedTest = new StringBuilder();
        for (ResolvedTest test : tests) {
            String readableTest = test.toString();
            if (!readableTest.isEmpty()) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
import static java.util.Collections.singleton;
import static java.util.Collections.unmodifiableSet;
import static org.apache.maven.surefire.api.testset.ResolvedTest.Type.CLASS;
import static org.apache.maven.surefire.api.testset.ResolvedTest.Type.METHOD;
import static org.apache.maven.surefire.shared.utils.StringUtils.isBlank;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
import static java.util.Collections.unmodifiableSet;
import static org.apache.maven.surefire.api.testset.ResolvedTest.Type.CLASS;
import static org.apache.maven.surefire.api.testset.ResolvedTest.Type.METHOD;
import static org.apache.maven.surefire.shared.utils.StringUtils.isBlank;
import static org.apache.maven.surefire.shared.utils.StringUtils.isNotBlank;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    @Override
    public Set<ResolvedTest> getIncludedPatterns() {
        return includedPatterns;
    }
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
                shouldRun = true;
            } else {
                for (ResolvedTest filter : getIncludedPatterns()) {
                    if (filter.matchAsInclusive(testClassFile, methodName)) {
                        shouldRun = true;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

            if (shouldRun) {
                for (ResolvedTest filter : getExcludedPatterns()) {
                    if (filter.matchAsExclusive(testClassFile, methodName)) {
                        shouldRun = false;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
    public TestListResolver(Collection<String> tests) {
        final IncludedExcludedPatterns patterns = new IncludedExcludedPatterns();
        final Set<ResolvedTest> includedFilters = new LinkedHashSet<>(0);
        final Set<ResolvedTest> excludedFilters = new LinkedHashSet<>(0);

```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
        final IncludedExcludedPatterns patterns = new IncludedExcludedPatterns();
        final Set<ResolvedTest> includedFilters = new LinkedHashSet<>(0);
        final Set<ResolvedTest> excludedFilters = new LinkedHashSet<>(0);

        for (final String csvTests : tests) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            String request,
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        final boolean isExcluded = request.startsWith("!");
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            IncludedExcludedPatterns patterns,
            Collection<ResolvedTest> includedFilters,
            Collection<ResolvedTest> excludedFilters) {
        final boolean isExcluded = request.startsWith("!");
        ResolvedTest test = null;
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            Collection<ResolvedTest> excludedFilters) {
        final boolean isExcluded = request.startsWith("!");
        ResolvedTest test = null;
        request = removeExclamationMark(request);
        if (isRegexPrefixedPattern(request)) {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            final boolean hasMethod = !unwrapped[1].isEmpty();
            if (hasClass && hasMethod) {
                test = new ResolvedTest(unwrapped[0], unwrapped[1], true);
            } else if (hasClass) {
                test = new ResolvedTest(CLASS, unwrapped[0], true);
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
                test = new ResolvedTest(unwrapped[0], unwrapped[1], true);
            } else if (hasClass) {
                test = new ResolvedTest(CLASS, unwrapped[0], true);
            } else if (hasMethod) {
                test = new ResolvedTest(METHOD, unwrapped[1], true);
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
                test = new ResolvedTest(CLASS, unwrapped[0], true);
            } else if (hasMethod) {
                test = new ResolvedTest(METHOD, unwrapped[1], true);
            }
        } else {
```

### Deprecation
'org.apache.maven.surefire.api.testset.ResolvedTest' is deprecated
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java
            final int indexOfMethodSeparator = request.indexOf('#');
            if (indexOfMethodSeparator == -1) {
                test = new ResolvedTest(CLASS, request, false);
            } else {
                String clazz = request.substring(0, indexOfMethodSeparator);
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/SurefireDependencyResolver.java`
#### Snippet
```java

    @Inject
    SurefireDependencyResolver(RepositorySystem repositorySystem) {
        this.repositorySystem = repositorySystem;
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/DependencyScanner.java`
#### Snippet
```java
                    scanArtifact(artifact, filter, classes);
                } catch (IOException e) {
                    throw new MojoExecutionException("Could not scan dependency " + artifact.toString(), e);
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
                                    + "\nCommand was " + cli.toString() + detail + errorCode + testsInProgress,
                            cause);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                    globalResult = globalResult.aggregate(cur);
                } else {
                    throw new SurefireBooterForkException("No results for " + result.toString());
                }
            } catch (InterruptedException e) {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/SharedThreadPoolStrategy.java`
#### Snippet
```java
                }
            } catch (CancellationException e) {
                /**
                 * Cancelled by {@link Future#cancel(boolean)} in {@link stop()} and {@link stopNow()}.
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
        if (shutdownScheduler != null) {
            shutdownScheduler.shutdownNow();
            /**
             * Clear <i>interrupted status</i> of the (main) Thread.
             * Could be previously interrupted by {@link InvokerStrategy} after triggering immediate shutdown.
```

### DanglingJavadoc
Dangling Javadoc comment
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:linelength")
    /**
     * A list of {@literal <include>} elements specifying the test filter (by pattern) of tests which should be
     * included in testing. If it is not specified and the {@code test} parameter is unspecified as well, the default
```

### DanglingJavadoc
Dangling Javadoc comment
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:linelength")
    /**
     * Specify this parameter to run individual tests by file name, overriding parameter {@code includes} and
     * {@code excludes}. Each pattern you specify here will be used to create an include pattern formatted like
```

### DanglingJavadoc
Dangling Javadoc comment
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:linelength")
    /**
     * Specify this parameter to run individual tests by file name, overriding the parameter {@code includes} and
     * {@code excludes}. Each pattern you specify here will be used to create an include pattern formatted like
```

### DanglingJavadoc
Dangling Javadoc comment
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:linelength")
    /**
     * A list of {@literal <include>} elements specifying the tests (by pattern) that should be included in testing.
     * When not specified and when the {@code test} parameter is not specified, the default includes will be
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/WrappedReportEntry.java`
#### Snippet
```java
            Utf8RecodingDeferredFileOutputStream stdout,
            Utf8RecodingDeferredFileOutputStream stdErr) {
        this(original, reportEntryType, estimatedElapsed, stdout, stdErr, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/TestSetRunListener.java`
#### Snippet
```java
        final WrappedReportEntry wrap = wrapTestSet(report);
        final List<String> testResults =
                briefOrPlainFormat ? detailsForThis.getTestResults() : Collections.<String>emptyList();
        fileReporter.testSetCompleted(wrap, detailsForThis, testResults);
        simpleXMLReporter.testSetCompleted(wrap, detailsForThis);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    @Nonnull
    private static <K, V> Map<K, V> toImmutable(@Nullable Map<K, V> map) {
        return map == null ? Collections.<K, V>emptyMap() : new ImmutableMap<>(map);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/NonConcurrentRunListener.java`
#### Snippet
```java

    private TestSetReportEntry createTestSetReportEntryStarted(Description description) {
        return createReportEntryForTestSet(description, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/TestSet.java`
#### Snippet
```java

    private TestSetReportEntry createReportEntryStarted() {
        return createReportEntry(null, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreWrapper.java`
#### Snippet
```java

    void execute(TestsToRun testsToRun, Filter filter) throws TestSetFailedException {
        execute(testsToRun, true, Collections.<RunListener>emptyList(), filter);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ShutdownResult.java`
#### Snippet
```java

    public ShutdownResult(Collection<Description> triggeredTests, Collection<Description> incompleteTests) {
        this.triggeredTests = triggeredTests == null ? Collections.<Description>emptySet() : triggeredTests;
        this.incompleteTests = incompleteTests == null ? Collections.<Description>emptySet() : incompleteTests;
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ShutdownResult.java`
#### Snippet
```java
    public ShutdownResult(Collection<Description> triggeredTests, Collection<Description> incompleteTests) {
        this.triggeredTests = triggeredTests == null ? Collections.<Description>emptySet() : triggeredTests;
        this.incompleteTests = incompleteTests == null ? Collections.<Description>emptySet() : incompleteTests;
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        public List<String[]> getJpmsArguments(@Nonnull ProviderRequirements forkRequirements) {
            boolean hasTestDescriptor = forkRequirements.isModularPath() && forkRequirements.hasTestModuleDescriptor();
            return hasTestDescriptor ? getJpmsArgs() : Collections.<String[]>emptyList();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
            // resulting runner for Computer#getSuite() scheduled by master scheduler
            ParentRunner all = createFinalRunner(removeNullRunners(
                    Arrays.<Runner>asList(suiteSuites, suiteClasses, createSuite(notParallelRunners))));
            all.setScheduler(master);
            return all;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java
                return setSchedulers(suiteSuites.wrappingSuite, suiteClasses.wrappingSuite);
            } catch (TestSetFailedException e) {
                throw new InitializationError(Collections.<Throwable>singletonList(e));
            }
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/LazyTestsToRun.java`
#### Snippet
```java
     */
    LazyTestsToRun(MasterProcessChannelEncoder eventChannel, CommandReader commandReader) {
        super(Collections.<Class<?>>emptySet());
        this.eventChannel = eventChannel;
        this.commandReader = commandReader;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/StartupConfiguration.java`
#### Snippet
```java
                classLoaderConfig,
                processChecker,
                Collections.<String[]>emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-failsafe-plugin/src/main/java/org/apache/maven/plugin/failsafe/IntegrationTestMojo.java`
#### Snippet
```java
    @Override
    protected final List<File> suiteXmlFiles() {
        return hasSuiteXmlFiles() ? Arrays.asList(suiteXmlFiles) : Collections.<File>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TestsToRun.java`
#### Snippet
```java

    public static TestsToRun fromClass(Class<?> clazz) throws TestSetFailedException {
        return new TestsToRun(Collections.<Class<?>>singleton(clazz));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/booter/BaseProviderFactory.java`
#### Snippet
```java
     */
    public void setMainCliOptions(List<CommandLineOption> mainCliOptions) {
        this.mainCliOptions = mainCliOptions == null ? Collections.<CommandLineOption>emptyList() : mainCliOptions;
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/CategorizedReportEntry.java`
#### Snippet
```java
                elapsed,
                message,
                Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/SimpleReportEntry.java`
#### Snippet
```java
                null,
                message,
                Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/report/SimpleReportEntry.java`
#### Snippet
```java
                stackTraceWriter,
                elapsed,
                Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/TestListResolver.java`
#### Snippet
```java

    public TestListResolver(String csvTests) {
        this(csvTests == null ? Collections.<String>emptySet() : singleton(csvTests));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-surefire-plugin/src/main/java/org/apache/maven/plugin/surefire/SurefirePlugin.java`
#### Snippet
```java
    @Override
    protected final List<File> suiteXmlFiles() {
        return hasSuiteXmlFiles() ? Arrays.asList(suiteXmlFiles) : Collections.<File>emptyList();
    }

```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `surefire-providers/surefire-junit3/src/main/java/org/apache/maven/surefire/junit/TestListenerInvocationHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final File tempDirectory;

    @Nullable
    private final String debugLine;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
 */
public abstract class DefaultForkConfiguration extends ForkConfiguration {
    @Nonnull
    private final Classpath booterClasspath;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final ConsoleLogger log;

    @Nonnull
    private final ForkNodeFactory forkNodeFactory;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final Map<String, String> environmentVariables;

    @Nonnull
    private final String[] excludedEnvironmentVariables;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final String argLine;

    @Nonnull
    private final Map<String, String> environmentVariables;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final String debugLine;

    @Nonnull
    private final File workingDirectory;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final Platform pluginPlatform;

    @Nonnull
    private final ConsoleLogger log;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final boolean reuseForks;

    @Nonnull
    private final Platform pluginPlatform;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final Properties modelProperties;

    @Nullable
    private final String argLine;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final File workingDirectory;

    @Nonnull
    private final Properties modelProperties;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/DefaultForkConfiguration.java`
#### Snippet
```java
    private final Classpath booterClasspath;

    @Nonnull
    private final File tempDirectory;

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/Classpath.java`
#### Snippet
```java

    @Override
    public Iterator<String> iterator() {
        return unmodifiableElements.iterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/CommandReader.java`
#### Snippet
```java

        @Override
        public Iterator<String> iterator() {
            return new ClassesIterator(eventChannel);
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/LazyTestsToRun.java`
#### Snippet
```java
     * */
    @Override
    public Iterator<Class<?>> iterator() {
        return new BlockingIterator();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `surefire-extensions-api/src/main/java/org/apache/maven/surefire/extensions/ForkChannel.java`
#### Snippet
```java
 */
public abstract class ForkChannel implements Closeable {
    @Nonnull
    private final ForkNodeArguments arguments;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/DaemonThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(Runnable r) {
        Thread t = DEFAULT_THREAD_FACTORY.newThread(r);
        t.setName(namePrefix + threadNumber.getAndIncrement());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/DaemonThreadFactory.java`
#### Snippet
```java

        @Override
        public Thread newThread(Runnable r) {
            return newDaemonThread(r, name);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
        return new InputStream() {
            @Override
            public synchronized int read(byte[] b, int off, int len) throws IOException {
                if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0) {
                    throw new IndexOutOfBoundsException("b.length = " + b.length + ", off = " + off + ", len = " + len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
        return new OutputStream() {
            @Override
            public synchronized void write(byte[] b, int off, int len) throws IOException {
                if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0) {
                    throw new IndexOutOfBoundsException("b.length = " + b.length + ", off = " + off + ", len = " + len);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/ImmutableMap.java`
#### Snippet
```java

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entries = new LinkedHashSet<>();
        Node<K, V> node = first;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
    /**
     * The beginning part of Windows WMIC format yyyymmddHHMMSS.xxx <br>
     * https://technet.microsoft.com/en-us/library/ee198928.aspx <br>
     * We use UTC time zone which avoids DST changes, see SUREFIRE-1512.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/PpidChecker.java`
#### Snippet
```java
    /**
     * The etime is in the form of [[dd-]hh:]mm:ss on Unix like systems.
     * See the workaround https://issues.apache.org/jira/browse/SUREFIRE-1451.
     */
    static final Pattern UNIX_CMD_OUT_PATTERN = compile("^(((\\d+)-)?(\\d{1,2}):)?(\\d{1,2}):(\\d{1,2})\\s+(\\d+)$");
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/InverseGroupMatcher.java`
#### Snippet
```java
        InverseGroupMatcher other = (InverseGroupMatcher) obj;
        if (matcher == null) {
            if (other.matcher != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `surefire-grouper/src/main/java/org/apache/maven/surefire/group/match/InverseGroupMatcher.java`
#### Snippet
```java
                return false;
            }
        } else if (!matcher.equals(other.matcher)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
                atLeastOneDirectoryExists = hasReportFiles(i.next());
            }
            if (!atLeastOneDirectoryExists) {
                return false;
            }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/output/InPluginProcessDumpSingleton.java`
#### Snippet
```java

    public File getEventStreamBinaryFile(File reportsDirectory, int jvmRun) {
        reportsDirectory.mkdirs();
        return new File(reportsDirectory, format(EVENTS_BINARY_DUMP_FILENAME_FORMATTER, jvmRun));
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/NonSharedThreadPoolStrategy.java`
#### Snippet
```java
        boolean wasRunning = disable();
        getThreadPool().shutdown();
        getThreadPool().awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return wasRunning;
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
        try {
            // Should stop immediately, as we got all the results if we are here
            executorService.awaitTermination(60 * 60, SECONDS);
        } catch (InterruptedException e) {
            currentThread().interrupt();
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
             * Could be previously interrupted by {@link InvokerStrategy} after triggering immediate shutdown.
             */
            Thread.interrupted();
            try {
                shutdownScheduler.awaitTermination(Long.MAX_VALUE, NANOSECONDS);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputer.java`
#### Snippet
```java
            Thread.interrupted();
            try {
                shutdownScheduler.awaitTermination(Long.MAX_VALUE, NANOSECONDS);
            } catch (InterruptedException e) {
                notInterrupted = false;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/DumpFileUtils.java`
#### Snippet
```java
     */
    public static synchronized File newDumpFile(File reportsDir, String dumpFileName) {
        reportsDir.mkdirs();
        return new File(reportsDir, dumpFileName);
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java

    public synchronized void deleteAll() {
        tempFiles.forEach(File::delete);
        tempFiles.clear();
        tempDir.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
        tempFiles.forEach(File::delete);
        tempFiles.clear();
        tempDir.delete();
    }

```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java

            try {
                tempFile.createNewFile();
            } catch (IOException ex) {
                throw new UncheckedIOException("Unable to create temporary file " + tempFile.getAbsolutePath(), ex);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `reset()` is identical to its super method
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/NullConsoleReporter.java`
#### Snippet
```java

    @Override
    public void reset() {}
}

```

### RedundantMethodOverride
Method `extendJvmArgLine()` is identical to its super method
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/AbstractClasspathForkConfiguration.java`
#### Snippet
```java
    @Override
    @Nonnull
    protected String extendJvmArgLine(@Nonnull String jvmArgLine) {
        return jvmArgLine;
    }
```

### RedundantMethodOverride
Method `createStackTraceWriter()` is identical to its super method
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/JUnitCoreRunListener.java`
#### Snippet
```java

    @Override
    protected StackTraceWriter createStackTraceWriter(Failure failure) {
        return new JUnit4StackTraceWriter(failure);
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!(runner instanceof ErrorReportingRunner)' covered by subsequent condition 'runner instanceof ParentRunner'
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/ParallelComputerBuilder.java`
#### Snippet
```java

        private boolean canSchedule(Runner runner) {
            return !(runner instanceof ErrorReportingRunner) && runner instanceof ParentRunner;
        }

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`do` statement cannot complete without throwing an exception
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/EventConsumerThread.java`
#### Snippet
```java
                EventDecoder eventDecoder = decoder) {
            Memento memento = eventDecoder.new Memento();
            do {
                Event event = eventDecoder.decode(memento);
                if (event != null && !disabled) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java

        if (storage != null && cache != null) {
            ((Buffer) cache).flip();
            byte[] array = cache.array();
            int offset = cache.arrayOffset() + ((Buffer) cache).position();
```

### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
            ((Buffer) cache).flip();
            byte[] array = cache.array();
            int offset = cache.arrayOffset() + ((Buffer) cache).position();
            int length = cache.remaining();
            ((Buffer) cache).clear();
```

### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
            int offset = cache.arrayOffset() + ((Buffer) cache).position();
            int length = cache.remaining();
            ((Buffer) cache).clear();
            storage.write(array, offset, length);
            // the data that you wrote with the mode "rw" may still only be kept in memory and may be read back
```

### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
            }
        } else {
            ((Buffer) cache).flip();
            int minLength = cache.remaining() + decodedString.length + NL_BYTES.length;
            byte[] buffer = getLargeCache(minLength);
```

### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
            System.arraycopy(
                    cache.array(),
                    cache.arrayOffset() + ((Buffer) cache).position(),
                    buffer,
                    bufferLength,
```

### RedundantCast
Casting `cache` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/report/Utf8RecodingDeferredFileOutputStream.java`
#### Snippet
```java
                    cache.remaining());
            bufferLength += cache.remaining();
            ((Buffer) cache).clear();

            System.arraycopy(decodedString, 0, buffer, bufferLength, decodedString.length);
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/extensions/SurefireForkChannel.java`
#### Snippet
```java
            }

            ((Buffer) buffer).flip();
            String clientSessionId = new String(buffer.array(), US_ASCII);
            if (!clientSessionId.equals(sessionId)) {
```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/EventChannelEncoder.java`
#### Snippet
```java
                    estimateBufferLength(BOOTERCODE_SYSPROPS.getOpcode().length(), runMode, encoder, 0, 1, key, value);
            result = result != null && result.capacity() >= bufferLength ? result : ByteBuffer.allocate(bufferLength);
            ((Buffer) result).clear();
            // :maven-surefire-event:sys-prop:<runMode>:<testRunId>:UTF-8:<integer>:<key>:<integer>:<value>:
            encode(encoder, result, BOOTERCODE_SYSPROPS, runMode, testRunId, key, value);
```

### RedundantCast
Casting `frame` to `Buffer` is redundant
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/spi/EventChannelEncoder.java`
#### Snippet
```java
                String event = new String(
                        frame.array(),
                        frame.arrayOffset() + ((Buffer) frame).position(),
                        frame.remaining(),
                        getCharset());
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/AbstractNoninterruptibleWritableChannel.java`
#### Snippet
```java

        if (src.remaining() != src.capacity()) {
            ((Buffer) src).flip();
        }

```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/AbstractNoninterruptibleWritableChannel.java`
#### Snippet
```java
        int countWrittenBytes = src.remaining();
        writeImpl(src);
        ((Buffer) src).position(((Buffer) src).limit());
        if (flush) {
            flushImpl();
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/AbstractNoninterruptibleWritableChannel.java`
#### Snippet
```java
        int countWrittenBytes = src.remaining();
        writeImpl(src);
        ((Buffer) src).position(((Buffer) src).limit());
        if (flush) {
            flushImpl();
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
            protected void writeImpl(ByteBuffer src) throws IOException {
                int count = src.remaining();
                bos.write(src.array(), src.arrayOffset() + ((Buffer) src).position(), count);
                bytesCounter.getAndAdd(count);
            }
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
            @Override
            protected int readImpl(ByteBuffer src) throws IOException {
                int count = bis.read(src.array(), src.arrayOffset() + ((Buffer) src).position(), src.remaining());
                if (count > 0) {
                    ((Buffer) src).position(count + ((Buffer) src).position());
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
                int count = bis.read(src.array(), src.arrayOffset() + ((Buffer) src).position(), src.remaining());
                if (count > 0) {
                    ((Buffer) src).position(count + ((Buffer) src).position());
                }
                return count;
```

### RedundantCast
Casting `src` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/internal/Channels.java`
#### Snippet
```java
                int count = bis.read(src.array(), src.arrayOffset() + ((Buffer) src).position(), src.remaining());
                if (count > 0) {
                    ((Buffer) src).position(count + ((Buffer) src).position());
                }
                return count;
```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
        String nonNullString = nonNull(string);

        int counterPosition = ((Buffer) result).position();

        result.put(INT_BINARY).put((byte) ':');
```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
        result.put(INT_BINARY).put((byte) ':');

        int msgStart = ((Buffer) result).position();
        encoder.encode(wrap(nonNullString), result, true);
        int msgEnd = ((Buffer) result).position();
```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
        int msgStart = ((Buffer) result).position();
        encoder.encode(wrap(nonNullString), result, true);
        int msgEnd = ((Buffer) result).position();
        int encodedMsgSize = msgEnd - msgStart;
        result.putInt(counterPosition, encodedMsgSize);
```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamEncoder.java`
#### Snippet
```java
        result.putInt(counterPosition, encodedMsgSize);

        ((Buffer) result).position(msgEnd);

        result.put((byte) ':');
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        ByteBuffer bb = memento.bb;
        if ((0xff & bb.get()) != ':') {
            throw new MalformedFrameException(memento.getLine().getPositionByteBuffer(), ((Buffer) bb).position());
        }
    }
```

### RedundantCast
Casting `memento.getCharBuffer()` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java

    protected String readString(@Nonnull Memento memento) throws IOException, MalformedFrameException {
        ((Buffer) memento.getCharBuffer()).clear();
        int readCount = readInt(memento);
        if (readCount < 0) {
```

### RedundantCast
Casting `memento.getByteBuffer()` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        if (readCount < 0) {
            throw new MalformedFrameException(
                    memento.getLine().getPositionByteBuffer(), ((Buffer) memento.getByteBuffer()).position());
        }
        read(memento, readCount + DELIMITER_LENGTH);
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        ByteBuffer bb = memento.getByteBuffer();
        byte[] array = bb.array();
        int offset = bb.arrayOffset() + ((Buffer) bb).position();
        ((Buffer) bb).position(((Buffer) bb).position() + length);
        boolean isDefaultEncoding = false;
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        byte[] array = bb.array();
        int offset = bb.arrayOffset() + ((Buffer) bb).position();
        ((Buffer) bb).position(((Buffer) bb).position() + length);
        boolean isDefaultEncoding = false;
        if (length == DEFAULT_STREAM_ENCODING_BYTES.length) {
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        byte[] array = bb.array();
        int offset = bb.arrayOffset() + ((Buffer) bb).position();
        ((Buffer) bb).position(((Buffer) bb).position() + length);
        boolean isDefaultEncoding = false;
        if (length == DEFAULT_STREAM_ENCODING_BYTES.length) {
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            return charset;
        } catch (IllegalArgumentException e) {
            throw new MalformedFrameException(memento.getLine().getPositionByteBuffer(), ((Buffer) bb).position());
        }
    }
```

### RedundantCast
Casting `memento.getByteBuffer()` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        if (memento.getData().size() != expectedDataElements) {
            throw new MalformedFrameException(
                    memento.getLine().getPositionByteBuffer(), ((Buffer) memento.getByteBuffer()).position());
        }
    }
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
    protected @Nonnull StreamReadStatus read(@Nonnull Memento memento, int recommendedCount) throws IOException {
        ByteBuffer buffer = memento.getByteBuffer();
        if (buffer.remaining() >= recommendedCount && ((Buffer) buffer).limit() != 0) {
            return OVERFLOW;
        } else {
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            return OVERFLOW;
        } else {
            if (((Buffer) buffer).position() != 0
                    && recommendedCount > buffer.capacity() - ((Buffer) buffer).position()) {
                ((Buffer) buffer.compact()).flip();
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        } else {
            if (((Buffer) buffer).position() != 0
                    && recommendedCount > buffer.capacity() - ((Buffer) buffer).position()) {
                ((Buffer) buffer.compact()).flip();
                memento.getLine().setPositionByteBuffer(0);
```

### RedundantCast
Casting `buffer.compact()` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            if (((Buffer) buffer).position() != 0
                    && recommendedCount > buffer.capacity() - ((Buffer) buffer).position()) {
                ((Buffer) buffer.compact()).flip();
                memento.getLine().setPositionByteBuffer(0);
            }
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
                memento.getLine().setPositionByteBuffer(0);
            }
            int mark = ((Buffer) buffer).position();
            ((Buffer) buffer).position(((Buffer) buffer).limit());
            ((Buffer) buffer).limit(min(((Buffer) buffer).position() + recommendedCount, buffer.capacity()));
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
            int mark = ((Buffer) buffer).position();
            ((Buffer) buffer).position(((Buffer) buffer).limit());
            ((Buffer) buffer).limit(min(((Buffer) buffer).position() + recommendedCount, buffer.capacity()));
            return read(buffer, mark, recommendedCount);
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
            int mark = ((Buffer) buffer).position();
            ((Buffer) buffer).position(((Buffer) buffer).limit());
            ((Buffer) buffer).limit(min(((Buffer) buffer).position() + recommendedCount, buffer.capacity()));
            return read(buffer, mark, recommendedCount);
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            int mark = ((Buffer) buffer).position();
            ((Buffer) buffer).position(((Buffer) buffer).limit());
            ((Buffer) buffer).limit(min(((Buffer) buffer).position() + recommendedCount, buffer.capacity()));
            return read(buffer, mark, recommendedCount);
        }
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            int mark = ((Buffer) buffer).position();
            ((Buffer) buffer).position(((Buffer) buffer).limit());
            ((Buffer) buffer).limit(min(((Buffer) buffer).position() + recommendedCount, buffer.capacity()));
            return read(buffer, mark, recommendedCount);
        }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            byte[] header = getEncodedMagicNumber();
            byte[] bbArray = bb.array();
            for (int start = bb.arrayOffset() + ((Buffer) bb).position(), length = header.length;
                    shift < length;
                    shift++) {
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
                if (bbArray[shift + start] != header[shift]) {
                    throw new MalformedFrameException(
                            memento.getLine().getPositionByteBuffer(), ((Buffer) bb).position() + shift);
                }
            }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
        } finally {
            ((Buffer) bb).position(((Buffer) bb).position() + shift);
        }

```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
        } finally {
            ((Buffer) bb).position(((Buffer) bb).position() + shift);
        }

```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        if (bb.hasRemaining()) {
            int bytesToWrite = bb.remaining();
            memento.getLine().write(bb, ((Buffer) bb).position(), bytesToWrite);
            ((Buffer) bb).position(((Buffer) bb).position() + bytesToWrite);
        }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            int bytesToWrite = bb.remaining();
            memento.getLine().write(bb, ((Buffer) bb).position(), bytesToWrite);
            ((Buffer) bb).position(((Buffer) bb).position() + bytesToWrite);
        }
    }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            int bytesToWrite = bb.remaining();
            memento.getLine().write(bb, ((Buffer) bb).position(), bytesToWrite);
            ((Buffer) bb).position(((Buffer) bb).position() + bytesToWrite);
        }
    }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
                    .onMalformedInput(REPLACE)
                    .onUnmappableCharacter(REPLACE);
            ((Buffer) bb).limit(0);
        }

```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        try {
            while (!isEnd
                    && ((Buffer) buffer).position() - oldPosition < recommendedCount
                    && ((Buffer) buffer).position() < ((Buffer) buffer).limit()) {
                isEnd = channel.read(buffer) == -1;
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            while (!isEnd
                    && ((Buffer) buffer).position() - oldPosition < recommendedCount
                    && ((Buffer) buffer).position() < ((Buffer) buffer).limit()) {
                isEnd = channel.read(buffer) == -1;
            }
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            while (!isEnd
                    && ((Buffer) buffer).position() - oldPosition < recommendedCount
                    && ((Buffer) buffer).position() < ((Buffer) buffer).limit()) {
                isEnd = channel.read(buffer) == -1;
            }
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
        } finally {
            ((Buffer) buffer).limit(((Buffer) buffer).position());
            ((Buffer) buffer).position(oldPosition);
            int readBytes = buffer.remaining();
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            }
        } finally {
            ((Buffer) buffer).limit(((Buffer) buffer).position());
            ((Buffer) buffer).position(oldPosition);
            int readBytes = buffer.remaining();
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        } finally {
            ((Buffer) buffer).limit(((Buffer) buffer).position());
            ((Buffer) buffer).position(oldPosition);
            int readBytes = buffer.remaining();
            boolean readComplete = readBytes >= recommendedCount;
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            boolean readComplete = readBytes >= recommendedCount;
            if (!isEnd || readComplete) {
                debugStream(buffer.array(), buffer.arrayOffset() + ((Buffer) buffer).position(), buffer.remaining());
                readStatus = readComplete ? OVERFLOW : UNDERFLOW;
            }
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        read(memento, readCount + DELIMITER_LENGTH);
        ByteBuffer bb = memento.getByteBuffer();
        Segment segment = new Segment(bb.array(), bb.arrayOffset() + ((Buffer) bb).position(), readCount);
        ((Buffer) bb).position(((Buffer) bb).position() + readCount);
        checkDelimiter(memento);
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        ByteBuffer bb = memento.getByteBuffer();
        Segment segment = new Segment(bb.array(), bb.arrayOffset() + ((Buffer) bb).position(), readCount);
        ((Buffer) bb).position(((Buffer) bb).position() + readCount);
        checkDelimiter(memento);
        return segment;
```

### RedundantCast
Casting `bb` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        ByteBuffer bb = memento.getByteBuffer();
        Segment segment = new Segment(bb.array(), bb.arrayOffset() + ((Buffer) bb).position(), readCount);
        ((Buffer) bb).position(((Buffer) bb).position() + readCount);
        checkDelimiter(memento);
        return segment;
```

### RedundantCast
Casting `output` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        memento.getDecoder().reset();
        final CharBuffer output = memento.getCharBuffer();
        ((Buffer) output).clear();
        final ByteBuffer input = memento.getByteBuffer();
        final List<String> strings = new ArrayList<>();
```

### RedundantCast
Casting `output` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            } while (isLastChunk && bytesToDecode > 0 && output.hasRemaining());

            strings.add(((Buffer) output).flip().toString());
            ((Buffer) output).clear();
        }
```

### RedundantCast
Casting `output` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java

            strings.add(((Buffer) output).flip().toString());
            ((Buffer) output).clear();
        }

```

### RedundantCast
Casting `output` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java

        memento.getDecoder().reset();
        ((Buffer) output).clear();

        return toString(strings);
```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            @Nonnegative int errorStreamFrom)
            throws MalformedFrameException {
        int limit = ((Buffer) input).limit();
        ((Buffer) input).limit(((Buffer) input).position() + bytesToDecode);

```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            throws MalformedFrameException {
        int limit = ((Buffer) input).limit();
        ((Buffer) input).limit(((Buffer) input).position() + bytesToDecode);

        CoderResult result = decoder.decode(input, output, endOfInput);
```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
            throws MalformedFrameException {
        int limit = ((Buffer) input).limit();
        ((Buffer) input).limit(((Buffer) input).position() + bytesToDecode);

        CoderResult result = decoder.decode(input, output, endOfInput);
```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java
        CoderResult result = decoder.decode(input, output, endOfInput);
        if (result.isError() || result.isMalformed()) {
            throw new MalformedFrameException(errorStreamFrom, ((Buffer) input).position());
        }

```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/stream/AbstractStreamDecoder.java`
#### Snippet
```java

        int decodedBytes = bytesToDecode - input.remaining();
        ((Buffer) input).limit(limit);
        return decodedBytes;
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `answers` may be 'final'
in `surefire-providers/surefire-testng-utils/src/main/java/org/apache/maven/surefire/testng/utils/GroupMatcherMethodSelector.java`
#### Snippet
```java
    private static GroupMatcher matcher;

    private Map<ITestNGMethod, Boolean> answers = new HashMap<>();

    @Override
```

### FieldMayBeFinal
Field `instance` may be 'final'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
public final class SureFireFileManager {

    private static TempFileManager instance = create();

    private static TempFileManager create() {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `maven-surefire-report-plugin/src/main/java/org/apache/maven/plugins/surefire/report/AbstractSurefireReportMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${reactorProjects}", readonly = true)
    private List<MavenProject> reactorProjects;

    /**
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/TestNGMapConfigurator.java`
#### Snippet
```java
            Class<?> reporterConfig = Class.forName("org.testng.ReporterConfig");
            Method deserialize = reporterConfig.getMethod("deserialize", String.class);
            Object rc = deserialize.invoke(null, val);
            ArrayList<Object> reportersList = new ArrayList<>();
            reportersList.add(rc);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `percentage` is redundant
in `surefire-report-parser/src/main/java/org/apache/maven/plugins/surefire/report/SurefireReportParser.java`
#### Snippet
```java
     */
    public float computePercentage(int tests, int errors, int failures, int skipped) {
        float percentage = tests == 0 ? 0 : ((float) (tests - errors - failures - skipped) / (float) tests);
        return percentage;
    }
```

### UnnecessaryLocalVariable
Local variable `tempDirCandidate` is redundant
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/TempFileManager.java`
#### Snippet
```java
    private static File calcTempDir(String subDirName) {
        String tempDirName = subDirName == null ? null : subDirName.trim().isEmpty() ? null : subDirName.trim();
        File tempDirCandidate =
                tempDirName == null ? new File(getJavaIoTmpDir()) : new File(getJavaIoTmpDir(), tempDirName);
        return tempDirCandidate;
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/booterclient/ForkStarter.java`
#### Snippet
```java
                    String testsInProgress = forkClient.hasTestsInProgress() ? "\nCrashed tests:" : "";
                    for (String test : forkClient.testsInProgress()) {
                        testsInProgress += "\n" + test;
                    }
                    // noinspection ThrowFromFinallyBlock
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `getFailIfNoTests()` assigned to `actualFailIfNoTests` is never used
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/AbstractSurefireMojo.java`
#### Snippet
```java
        DirectoryScannerParameters directoryScannerParameters = null;
        if (hasSuiteXmlFiles() && !isSpecificTestSpecified()) {
            actualFailIfNoTests = getFailIfNoTests();
            if (!isTestNg) {
                throw new MojoExecutionException("suiteXmlFiles is configured, but there is no TestNG dependency");
```

### UnusedAssignment
Variable `childDelegation` initializer `true` is redundant
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/IsolatedClassLoader.java`
#### Snippet
```java
    private final String roleName;

    private boolean childDelegation = true;

    private static final URL[] EMPTY_URL_ARRAY = new URL[0];
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `i < subDirectories.length` is always `true` when reached
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
        StringBuilder pkg = new StringBuilder();
        for (int i = 0; i < subDirectories.length; i++) {
            if (i > 0 && i < subDirectories.length) {
                pkg.append('/');
            }
```

### ConstantValue
Condition `i < subDirectories.length` is always `true` when reached
in `maven-surefire-common/src/main/java/org/apache/maven/plugin/surefire/util/FileScanner.java`
#### Snippet
```java
        StringBuilder pkg = new StringBuilder();
        for (int i = 0; i < subDirectories.length; i++) {
            if (i > 0 && i < subDirectories.length) {
                pkg.append('.');
            }
```

### ConstantValue
Method reference result is always 'true'
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java
        String display = testIdentifier.getDisplayName();

        if (testSource.filter(MethodSource.class::isInstance).isPresent()) {
            MethodSource methodSource = testSource.map(MethodSource.class::cast).get();
            String realClassName = methodSource.getClassName();
```

### ConstantValue
Condition `testSource.filter(ClassSource.class::isInstance).isPresent()` is always `false`
in `surefire-providers/surefire-junit-platform/src/main/java/org/apache/maven/surefire/junitplatform/RunListenerAdapter.java`
#### Snippet
```java

            return new String[] {source[0], source[1], methodDesc, methodDisp};
        } else if (testSource.filter(ClassSource.class::isInstance).isPresent()) {
            List<String> parentClassDisplays = collectAllTestIdentifiersInHierarchy(testIdentifier)
                    .filter(identifier -> identifier
```

### ConstantValue
Condition `testClasses.add(test)` is always `true`
in `surefire-booter/src/main/java/org/apache/maven/surefire/booter/CommandReader.java`
#### Snippet
```java

    private boolean insertToQueue(String test) {
        return isNotBlank(test) && !isQueueFull() && testClasses.add(test);
    }

```

### ConstantValue
Condition `setter != null` is always `true`
in `surefire-providers/surefire-testng/src/main/java/org/apache/maven/surefire/testng/conf/AbstractDirectConfigurator.java`
#### Snippet
```java
        public void invoke(Object target, String value) throws Exception {
            Method setter = target.getClass().getMethod(setterName, paramClass);
            if (setter != null) {
                setter.invoke(target, convertValue(value));
            }
```

### ConstantValue
Condition `userSuffix != null` is always `true`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/util/SureFireFileManager.java`
#### Snippet
```java
                .orElse(Long.toString(System.currentTimeMillis()));

        if (userSuffix != null) {
            subDirName += "-" + userSuffix;
        }
```

### ConstantValue
Condition `path != null` is always `true`
in `surefire-api/src/main/java/org/apache/maven/surefire/api/testset/ResolvedTest.java`
#### Snippet
```java
            String path = convertToPath(s);
            path = fromFullyQualifiedClass(path);
            if (path != null && !path.startsWith(WILDCARD_PATH_PREFIX)) {
                path = WILDCARD_PATH_PREFIX + path;
            }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'prioritizedTest1' to 'PrioritizedTest'
in `surefire-api/src/main/java/org/apache/maven/surefire/api/runorder/RunEntryStatisticsMap.java`
#### Snippet
```java
        ThreadedExecutionScheduler threadedExecutionScheduler = new ThreadedExecutionScheduler(threadCount);
        for (Object prioritizedTest1 : prioritizedTests) {
            threadedExecutionScheduler.addTest((PrioritizedTest) prioritizedTest1);
        }

```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `isDestroyed`
in `surefire-providers/surefire-junit47/src/main/java/org/apache/maven/surefire/junitcore/pc/AbstractThreadPoolStrategy.java`
#### Snippet
```java
                disable();
                threadPool.shutdown();
                this.isDestroyed |= threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            }
            return isDestroyed;
```

