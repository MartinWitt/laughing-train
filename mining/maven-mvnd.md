# maven-mvnd 
 
# Bad smells
I found 363 bad smells with 41 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 70 | false |
| ReturnNull | 34 | false |
| AssignmentToMethodParameter | 27 | false |
| UtilityClassWithoutPrivateConstructor | 17 | true |
| SystemOutErr | 16 | false |
| UnnecessaryFullyQualifiedName | 14 | false |
| SimplifyStreamApiCallChains | 13 | false |
| EnhancedSwitchMigration | 11 | false |
| DynamicRegexReplaceableByCompiledPattern | 10 | false |
| UnusedAssignment | 8 | false |
| MethodOverridesStaticMethod | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| NestedAssignment | 7 | false |
| RedundantFieldInitialization | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| ZeroLengthArrayInitialization | 6 | false |
| ConstantValue | 6 | false |
| IOResource | 6 | false |
| DataFlowIssue | 6 | false |
| UnnecessaryLocalVariable | 5 | true |
| UnnecessaryModifier | 4 | true |
| IgnoreResultOfCall | 4 | false |
| StringBufferReplaceableByString | 3 | false |
| ThrowablePrintedToSystemOut | 3 | false |
| UnnecessaryUnboxing | 3 | false |
| RedundantMethodOverride | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| Convert2Lambda | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| BusyWait | 3 | false |
| ClassCanBeRecord | 3 | false |
| ThreadStartInConstruction | 3 | false |
| MarkedForRemoval | 2 | false |
| EmptyStatementBody | 2 | false |
| CommentedOutCode | 2 | false |
| CodeBlock2Expr | 2 | false |
| EmptyMethod | 2 | false |
| StringEqualsEmptyString | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| CStyleArrayDeclaration | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| ReadWriteStringCanBeUsed | 1 | false |
| DefaultAnnotationParam | 1 | false |
| SlowListContainsAll | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| InfiniteLoopStatement | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonFinalFieldOfException | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| UnnecessarySemicolon | 1 | false |
| Convert2MethodRef | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| CatchMayIgnoreException | 1 | false |
| RegExpUnexpectedAnchor | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| Java8MapApi | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectExecutorService.java`
#### Snippet
```java
    }

    static interface ProjectRunnable extends Runnable {
        public MavenProject getProject();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectExecutorService.java`
#### Snippet
```java

    static interface ProjectRunnable extends Runnable {
        public MavenProject getProject();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/src/main/java/org/mvndaemon/mvnd/client/ExecutionResult.java`
#### Snippet
```java
    int getExitCode();

    public static StringBuilder appendCommand(StringBuilder sb, List<String> args) {
        sb.append("mvnd");
        for (String arg : args) {
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
        private final String prefix;

        private OptionOrigin() {
            this.prefix = name() + ":";
        }
```

## RuleId[ruleID=MarkedForRemoval]
### MarkedForRemoval
'com.oracle.svm.core.annotate.AutomaticFeature' is deprecated and marked for removal
in `client/src/main/java/org/mvndaemon/mvnd/client/svm/ReflectionRegistration.java`
#### Snippet
```java
package org.mvndaemon.mvnd.client.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;

```

### MarkedForRemoval
'com.oracle.svm.core.annotate.AutomaticFeature' is deprecated and marked for removal
in `client/src/main/java/org/mvndaemon/mvnd/client/svm/ReflectionRegistration.java`
#### Snippet
```java
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
public class ReflectionRegistration implements Feature {
    public void beforeAnalysis(BeforeAnalysisAccess access) {
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
        if (projectId != null) {
            Boolean b = projects.get(projectId);
            if (b != Boolean.TRUE) {}
        }
        queue.add(
```

### EmptyStatementBody
`while` statement has empty body
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectExecutorService.java`
#### Snippet
```java
    public void awaitShutdown() throws InterruptedException {
        executor.shutdown();
        while (!executor.awaitTermination(5, TimeUnit.SECONDS))
            ;
    }
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (8 lines)
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
    private static Method cleanerCleanMethod;

    //    /** The jdk.incubator.foreign.MemorySegment class (JDK14+). */
    //    private static Class<?> memorySegmentClass;
    //
```

### CommentedOutCode
Commented out code (5 lines)
in `client/src/main/java/org/mvndaemon/mvnd/client/svm/ReflectionRegistration.java`
#### Snippet
```java
public class ReflectionRegistration implements Feature {
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        //        try {
        //            RuntimeReflection.register(AsiExtraField.class.getConstructors());
        //        } catch (SecurityException e) {
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `cbuf`
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java

            @Override
            public void write(char cbuf[], int off, int len) throws IOException {
                if (!firstLine) {
                    super.write(cbuf, off, len);
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `INSTANCE` from instance context
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/SmartBuilder.java`
#### Snippet
```java
    public SmartBuilder(LifecycleModuleBuilder moduleBuilder) {
        this.moduleBuilder = moduleBuilder;
        INSTANCE = this;
    }

```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
            case PRINT_OUT:
            case PRINT_ERR:
                return StringMessage.read(type, input);
        }
        throw new IllegalStateException("Unexpected message type: " + type);
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[ ]` can be simplified to ' '
in `daemon/src/main/java/org/apache/maven/cli/MvndHelpFormatter.java`
#### Snippet
```java
public class MvndHelpFormatter {
    private static final Pattern HTML_TAGS_PATTERN = Pattern.compile("<[^>]*>");
    private static final Pattern COLUMNS_DETECTOR_PATTERN = Pattern.compile("^[ ]+[^s]");
    private static final Pattern WS_PATTERN = Pattern.compile("\\s+");

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `common/src/main/java/org/mvndaemon/mvnd/common/TimeUtils.java`
#### Snippet
```java
            millis %= SECONDS_MILLIS;
        }
        if (millis >= ONE_UNIT || sb.length() == 0) {
            sb.append(millis / ONE_UNIT).append("ms");
        }
```

### SizeReplaceableByIsEmpty
`variable.length() > 0` can be replaced with '!variable.isEmpty()'
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        }
        if (substValue == null) {
            if (variable.length() > 0) {
                if (callback != null) {
                    substValue = callback.getValue(variable);
```

### SizeReplaceableByIsEmpty
`substValue.length() == 0` can be replaced with 'substValue.isEmpty()'
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        if (op != null) {
            if (op.startsWith(":-")) {
                if (substValue == null || substValue.length() == 0) {
                    substValue = op.substring(":-".length());
                }
```

### SizeReplaceableByIsEmpty
`substValue.length() != 0` can be replaced with '!substValue.isEmpty()'
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
                }
            } else if (op.startsWith(":+")) {
                if (substValue != null && substValue.length() != 0) {
                    substValue = op.substring(":+".length());
                }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                            break;
                        } else if (c == 127) {
                            if (sb.length() > 0) {
                                sb.setLength(sb.length() - 1);
                                terminal.writer().write("\b \b");
```

### SizeReplaceableByIsEmpty
`oldNodeUpstreams.size() == 0` can be replaced with 'oldNodeUpstreams.isEmpty()'
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
            final List<K> newNodeUpstreams;
            newDownstreams.computeIfAbsent(node, k -> new ArrayList<>());
            if (oldNodeUpstreams.size() == 0) {
                newNodeUpstreams = new ArrayList<>(oldNodeUpstreams);
            } else if (oldNodeUpstreams.size() == 1) {
```

### SizeReplaceableByIsEmpty
`dependencyManagement.getDependencies().size() > 0` can be replaced with '!dependencyManagement.getDependencies().isEmpty()'
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
            if ((dependencyManagement != null)
                    && ((dependencyManagement.getDependencies()) != null)
                    && (dependencyManagement.getDependencies().size() > 0)) {
                map = new AbstractMap<String, Artifact>() {
                    HashMap<String, Artifact> delegate;
```

## RuleId[ruleID=ReadWriteStringCanBeUsed]
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `client/src/main/java/org/mvndaemon/mvnd/client/Completion.java`
#### Snippet
```java
        }
        try {
            return new String(Files.readAllBytes(bashCompletionPath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("Could not read " + bashCompletionPath, e);
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        }
        String kbString = String.valueOf(bytes);
        return new StringBuilder(kbString.length() + 1)
                .append(kbString)
                .append(UNITS.charAt(unit))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        }
        String kbString = String.valueOf(kb);
        return new StringBuilder(kbString.length() + 1)
                .append(kbString)
                .append(UNITS.charAt(unit))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                        .append(String.format(
                                threadsFormat,
                                new StringBuilder(threadsFormat.length())
                                        .append(projectsCount)
                                        .append('/')
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, Record<V>>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<K, Record<V>> entry = iterator.next();
```

### BoundedWildcard
Can generalize to `? super V`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, Record<V>>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<K, Record<V>> entry = iterator.next();
```

### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<K, V> entry = iterator.next();
```

### BoundedWildcard
Can generalize to `? super V`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<K, V> entry = iterator.next();
```

### BoundedWildcard
Can generalize to `? extends CacheRecord`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
     * @param records the {@link CacheRecord}s to stop watching
     */
    void remove(List<CacheRecord> records) {
        for (CacheRecord record : records) {
            record.invalidate();
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java

    private boolean shouldEvict(
            List<MavenProject> projects,
            InvalidatingProjectArtifactsCache.CacheKey k,
            InvalidatingProjectArtifactsCache.Record v) {
```

### BoundedWildcard
Can generalize to `? extends GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private double gcRate(Deque<GcEvent> events) {
        GcEvent first = events.peekFirst();
        GcEvent last = events.peekLast();
```

### BoundedWildcard
Can generalize to `? super GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private void slideAndInsert(Deque<GcEvent> events, GcEvent event) {
        events.addLast(event);
        while (events.size() > MAX_EVENTS) {
```

### BoundedWildcard
Can generalize to `? extends GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private double averageUsage(Collection<GcEvent> events) {
        return events.stream().mapToLong(e -> e.usage.getUsed()).average().getAsDouble();
    }
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
    }

    static int artifactIdLength90thPercentile(List<MavenProject> projects) {
        if (projects.size() == 1) {
            return projects.get(0).getArtifactId().length();
```

### BoundedWildcard
Can generalize to `? super Message`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
    private static final Pattern TRAILING_EOLS_PATTERN = Pattern.compile("[\r\n]+$");

    public ClientDispatcher(Collection<Message> queue) {
        this.queue = queue;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
    }

    public static void environment(String workingDir, Map<String, String> clientEnv, Consumer<String> log) {
        Map<String, String> requested = new TreeMap<>(clientEnv);
        Map<String, String> actual = new TreeMap<>(System.getenv());
```

### BoundedWildcard
Can generalize to `? extends ClassRealmConstituent`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
    }

    private Set<String> populateRealm(ClassRealm classRealm, List<ClassRealmConstituent> constituents) {
        Set<String> includedIds = new LinkedHashSet<>();

```

### BoundedWildcard
Can generalize to `? extends ClassRealmManagerDelegate`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            Logger logger,
            PlexusContainer container,
            List<ClassRealmManagerDelegate> delegates,
            CoreExportsProvider exports) {
        this.logger = logger;
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            List<String> parentImports,
            Map<String, ClassLoader> foreignImports,
            List<Artifact> artifacts) {
        Set<String> artifactIds = new LinkedHashSet<>();

```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/SmartBuilderImpl.java`
#### Snippet
```java
    }

    private void submitAll(Set<MavenProject> readyProjects) {
        List<ProjectBuildTask> tasks = new ArrayList<>();
        for (MavenProject project : readyProjects) {
```

### BoundedWildcard
Can generalize to `? extends Timer`
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
        private final Map.Entry<String, Timer> mojo;

        Mojo(Map.Entry<String, Timer> mojo) {
            this.mojo = mojo;
        }
```

### BoundedWildcard
Can generalize to `? extends Map`
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
        private final Map.Entry<String, Map<String, Timer>> project;

        Project(Entry<String, Map<String, Timer>> project) {
            this.project = project;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java

                    @Override
                    public <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher) {
                        try {
                            synchronized (recvQueue) {
```

### BoundedWildcard
Can generalize to `? super T`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java

                    @Override
                    public <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher) {
                        try {
                            synchronized (recvQueue) {
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public String renderCriticalPath(DependencyGraph<MavenProject> graph) {
        return renderCriticalPath(graph, ReactorBuildStats::projectGAV);
    }
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public void recordBottlenecks(Set<MavenProject> projects, int degreeOfConcurrency, long durationNanos) {
        // only projects that result in single-threaded builds
        if (projects.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    private <K> K getCriticalProject(Stream<K> projects, Comparator<K> comparator) {
        return projects.min(comparator).orElse(null);
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    private <K> K getCriticalProject(Stream<K> projects, Comparator<K> comparator) {
        return projects.min(comparator).orElse(null);
    }
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public static ReactorBuildStats create(Collection<MavenProject> projects) {
        ImmutableMap.Builder<String, AtomicLong> serviceTimes = ImmutableMap.builder();
        ImmutableMap.Builder<String, AtomicLong> bottleneckTimes = ImmutableMap.builder();
```

### BoundedWildcard
Can generalize to `? super String`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/smart/LoggingOutputStream.java`
#### Snippet
```java
    }

    LoggingOutputStream(EolBaos out, Consumer<String> consumer) {
        super(out);
        this.buf = out;
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            private final Consumer<String> out;

            private StreamGobbler(InputStream in, Consumer<String> out) {
                this.in = in;
                this.out = out;
```

### BoundedWildcard
Can generalize to `? super String`
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java
    }

    private void validate(Artifact pluginArtifact, PluginDescriptor pluginDescriptor, List<String> errors) {
        if (!pluginArtifact.getGroupId().equals(pluginDescriptor.getGroupId())) {
            errors.add("Plugin's descriptor contains the wrong group ID: " + pluginDescriptor.getGroupId());
```

### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
     */
    private static <K> long calculateWeights(
            DependencyGraph<K> dependencyGraph, Map<K, Long> serviceTimes, K project, Map<K, Long> weights) {
        long weight = serviceTimes.get(project)
                + dependencyGraph
```

### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
            DependencyGraph<K> dependencyGraph,
            Map<String, AtomicLong> historicalServiceTimes,
            Function<K, String> toKey) {
        final long defaultServiceTime = average(historicalServiceTimes.values());

```

### BoundedWildcard
Can generalize to `? extends AtomicLong`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java

    private static <K> long getServiceTime(
            Map<String, AtomicLong> serviceTimes, K project, long defaultServiceTime, Function<K, String> toKey) {
        AtomicLong serviceTime = serviceTimes.get(toKey.apply(project));
        return serviceTime != null ? serviceTime.longValue() : defaultServiceTime;
```

### BoundedWildcard
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java

    private static <K> Map<K, Long> calculateWeights(
            DependencyGraph<K> dependencyGraph, Map<K, Long> serviceTimes, Collection<K> rootProjects) {
        Map<K, Long> weights = new HashMap<>();
        for (K rootProject : rootProjects) {
```

### BoundedWildcard
Can generalize to `? extends AtomicLong`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
    }

    private static long average(Collection<AtomicLong> values) {
        return (long)
                (values.stream().mapToLong(AtomicLong::longValue).average().orElse(1.0d));
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
    }

    private static boolean closeDirectByteBufferPrivileged(final ByteBuffer byteBuffer, final Consumer<String> log) {
        if (!byteBuffer.isDirect()) {
            // Nothing to do
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
    }

    public void addCommandLineOption(Collection<String> args, String value) {
        if (!options.isEmpty()) {
            args.add(options.keySet().iterator().next());
```

### BoundedWildcard
Can generalize to `? super StringBuilder`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        final Supplier<String> valueSupplier;

        public ValueSource(Function<StringBuilder, StringBuilder> descriptionFunction, Supplier<String> valueSupplier) {
            this.descriptionFunction = descriptionFunction;
            this.valueSupplier = valueSupplier;
```

### BoundedWildcard
Can generalize to `? super PropertiesBuilder`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
    }

    protected DaemonParameters derive(Consumer<PropertiesBuilder> customizer) {
        PropertiesBuilder builder = new PropertiesBuilder().putAll(this.properties);
        customizer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Path`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        }

        public EnvValue orLocalProperty(Function<Path, Properties> provider, Path localPropertiesPath) {
            if (localPropertiesPath != null) {
                return new EnvValue(
```

### BoundedWildcard
Can generalize to `? extends Properties`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        }

        public EnvValue orLocalProperty(Function<Path, Properties> provider, Path localPropertiesPath) {
            if (localPropertiesPath != null) {
                return new EnvValue(
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            String val,
            String currentKey,
            Map<String, String> cycleMap,
            Map<String, String> configProps,
            SubstitutionCallback callback,
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            String val,
            String currentKey,
            Map<String, String> cycleMap,
            Map<String, String> configProps,
            SubstitutionCallback callback,
```

### BoundedWildcard
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java

    private DaemonClientConnection connectToCanceledDaemon(
            Collection<DaemonInfo> busyDaemons, DaemonCompatibilitySpec constraint) {
        DaemonClientConnection connection = null;
        List<DaemonInfo> canceledBusy =
```

### BoundedWildcard
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
    }

    private DaemonClientConnection findConnection(List<DaemonInfo> compatibleDaemons) {
        for (DaemonInfo daemon : compatibleDaemons) {
            try {
```

### BoundedWildcard
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
    }

    private List<DaemonInfo> getCompatibleDaemons(Iterable<DaemonInfo> daemons, DaemonCompatibilitySpec constraint) {
        List<DaemonInfo> compatibleDaemons = new LinkedList<>();
        for (DaemonInfo daemon : daemons) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private void enableOnPresentOption(
            final CommandLine commandLine, final String option, final Consumer<Boolean> setting) {
        if (commandLine.hasOption(option)) {
            setting.accept(true);
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private void disableOnPresentOption(
            final CommandLine commandLine, final String option, final Consumer<Boolean> setting) {
        if (commandLine.hasOption(option)) {
            setting.accept(false);
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private void enableOnAbsentOption(
            final CommandLine commandLine, final char option, final Consumer<Boolean> setting) {
        if (!commandLine.hasOption(option)) {
            setting.accept(true);
```

### BoundedWildcard
Can generalize to `? extends File`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private ClassRealm setupContainerRealm(
            ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath, List<CoreExtensionEntry> extensions)
            throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends CoreExtensionEntry`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private ClassRealm setupContainerRealm(
            ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath, List<CoreExtensionEntry> extensions)
            throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
     *                       general and {@code groupId:artifactId} when there is a name clash).
     */
    private String getResumeFromSelector(List<MavenProject> mavenProjects, MavenProject failedProject) {
        for (MavenProject buildProject : mavenProjects) {
            if (failedProject.getArtifactId().equals(buildProject.getArtifactId())
```

### BoundedWildcard
Can generalize to `? super String`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private void logSummary(
            ExceptionSummary summary, Map<String, String> references, String indent, boolean showErrors) {
        String referenceKey = "";

```

### BoundedWildcard
Can generalize to `? extends T`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    }

    private static <T> List<T> reverse(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
```

### BoundedWildcard
Can generalize to `? super Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void setDaemonDispatch(Consumer<Message> daemonDispatch) {
        this.daemonDispatch = daemonDispatch;
    }
```

### BoundedWildcard
Can generalize to `? super AttributedString`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    }

    private void addProjectLine(final List<AttributedString> lines, Project prj) {
        final MojoStartedEvent execution = prj.runningExecution;
        final AttributedStringBuilder asb = new AttributedStringBuilder();
```

### BoundedWildcard
Can generalize to `? super Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void setDaemonReceive(Consumer<Message> daemonReceive) {
        this.daemonReceive = daemonReceive;
    }
```

### BoundedWildcard
Can generalize to `? super AttributedString`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    }

    private void addStatusLine(final List<AttributedString> lines, int dispLines, final int projectsCount) {
        if (name != null || buildStatus != null) {
            AttributedStringBuilder asb = new AttributedStringBuilder();
```

### BoundedWildcard
Can generalize to `? extends Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void accept(List<Message> entries) {
        assert "main".equals(Thread.currentThread().getName());
        for (Message entry : entries) {
```

### BoundedWildcard
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public void store(Function<K, String> toString, Appendable w) {
        getProjects().forEach(k -> {
            try {
```

### BoundedWildcard
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams) {
        this.projects = projects;
        this.upstreams = upstreams;
```

### BoundedWildcard
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams) {
        this.projects = projects;
        this.upstreams = upstreams;
```

### BoundedWildcard
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    DependencyGraph(
            List<K> projects,
            Map<K, List<K>> upstreams,
            Map<K, List<K>> downstreams,
            Map<K, Set<K>> transitiveUpstreams) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
            List<K> projects,
            Map<K, List<K>> upstreams,
            Map<K, List<K>> downstreams,
            Map<K, Set<K>> transitiveUpstreams) {
        this.projects = projects;
```

### BoundedWildcard
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
        }

        List<K> ensembleWithChildrenOf(List<K> list, K node) {
            final List<K> result = Stream.concat(
                            list.stream().filter(k -> !Objects.equals(k, node)),
```

### BoundedWildcard
Can generalize to `? super ProjectBuildingResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

    private boolean build(
            List<ProjectBuildingResult> results,
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
```

### BoundedWildcard
Can generalize to `? super MavenProject`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    private boolean build(
            List<ProjectBuildingResult> results,
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
            List<InterimResult> interimResults,
```

### BoundedWildcard
Can generalize to `? extends InterimResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
            List<InterimResult> interimResults,
            ProjectBuildingRequest request,
            Map<File, Boolean> profilesXmls,
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private List<String> getProfileIds(List<Profile> profiles) {
        return profiles.stream().map(Profile::getId).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super InterimResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    private boolean build(
            List<ProjectBuildingResult> results,
            List<InterimResult> interimResults,
            Map<File, MavenProject> projectIndex,
            File pomFile,
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    private void initParent(
            MavenProject project,
            Map<File, MavenProject> projects,
            boolean buildParentIfNotExisting,
            ModelBuildingResult result,
```

### BoundedWildcard
Can generalize to `? extends File`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
            List<InterimResult> interimResults,
            Map<File, MavenProject> projectIndex,
            List<File> pomFiles,
            Set<File> aggregatorFiles,
            boolean root,
```

## RuleId[ruleID=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return version;
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                System.err.println("Failed to load native library:" + libPath.getName() + ". osinfo: "
                        + OSInfo.getNativeLibFolderPathForCurrentOS());
                System.err.println(e);
                return false;
            }
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `agent/src/main/java/org/mvndaemon/mvnd/agent/Agent.java`
#### Snippet
```java
                        return data;
                    } catch (Throwable e) {
                        System.err.println(e);
                        throw new IllegalClassFormatException(e.toString());
                    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java

            // Set executable (x) flag to enable Java to load the native library
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            // Set executable (x) flag to enable Java to load the native library
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);

```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);

            // Check whether the contents are properly copied from the resource folder
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                if (!lckFile.exists()) {
                    try {
                        nativeLibFile.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old native lib" + e.getMessage());
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
            frequencyDistribution.compute(
                    p.getArtifactId().length(),
                    (k, v) -> (v == null) ? Integer.valueOf(1) : Integer.valueOf(v.intValue() + 1));
        }
        int _90PercCount = Math.round(0.9f * projects.size());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
        int cnt = 0;
        for (Entry<Integer, Integer> en : frequencyDistribution.entrySet()) {
            cnt += en.getValue().intValue();
            if (cnt >= _90PercCount) {
                return en.getKey().intValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
            cnt += en.getValue().intValue();
            if (cnt >= _90PercCount) {
                return en.getKey().intValue();
            }
        }
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
        defaultPhase = LifecyclePhase.NONE,
        threadSafe = true,
        requiresProject = true,
        requiresDependencyResolution = ResolutionScope.NONE)
public class DocMojo extends AbstractMojo {
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `createKey()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java

    @Override
    public Key createKey(Plugin plugin, List<RemoteRepository> repositories, RepositorySystemSession session) {
        return super.createKey(plugin, repositories, session);
    }
```

### RedundantMethodOverride
Method `init()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    @Override
    public void init(Context context) throws Exception {
        super.init(context);
    }
```

### RedundantMethodOverride
Method `close()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    @Override
    public void close() throws Exception {
        super.close();
    }
```

## RuleId[ruleID=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java

    private boolean daemonOptsMatch(DaemonInfo daemon) {
        return daemon.getOptions().containsAll(options) && daemon.getOptions().size() == options.size();
    }

```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`b = b << 1` could be simplified to 'b \<\<= 1'
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
        long b = min;
        while (b < a) {
            b = b << 1;
        }
        return b;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        byte[] buf = new byte[32];
        while ((readLen = in.read(buf, 0, buf.length)) >= 0) {
            b.write(buf, 0, readLen);
        }
```

### NestedAssignment
Result of assignment expression used
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
        byte[] buf = new byte[8192];
        int n;
        while ((n = in.read(buf)) > 0) {
            out.write(buf, 0, n);
        }
```

### NestedAssignment
Result of assignment expression used
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            }
            long rem;
            while ((rem = time - System.currentTimeMillis()) > 0) {
                try {
                    switch (getState()) {
```

### NestedAssignment
Result of assignment expression used
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            stateLock.lock();
            try {
                registry.store(info = info.withState(state));
                condition.signalAll();
            } finally {
```

### NestedAssignment
Result of assignment expression used
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
        do {
            criticalPath.add(project);
        } while ((project = getCriticalProject(graph.getDownstreamProjects(project), comparator)) != null);
        return criticalPath;
    }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                try (BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
                    String line;
                    while (!cancelled && (line = r.readLine()) != null) {
                        out.accept(line);
                    }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
            int len = 0;
            char[] buf = new char[bufSize];
            while ((len = in.read(buf)) >= 0) {
                result.append(buf, 0, len);
            }
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
    private void accept() {
        try {
            while (true) {
                try (SocketChannel socket = this.socket.accept()) {
                    client(socket);
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
                AtomicReference<String> purgeMessage = new AtomicReference<>();
                Thread purgeLog = new Thread(
                        () -> {
                            purgeMessage.set(purgeLogs());
                        },
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
                // try inverted upstream bound
                Map<Set<K>, Set<K>> mapByUpstreams = new HashMap<>();
                graph.transitiveUpstreams.forEach((k, ups) -> {
                    mapByUpstreams.computeIfAbsent(ups, n -> new HashSet<>()).add(k);
                });
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `nativeLibraryPath` is accessed in both synchronized and unsynchronized contexts
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java

    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nativeLibrarySourceUrl` is accessed in both synchronized and unsynchronized contexts
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
    private final Object lck;
    private final FileChannel channel;
    private MappedByteBuffer buffer;
    private long size;

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `common/src/main/java/org/mvndaemon/mvnd/common/ProcessHelper.java`
#### Snippet
```java
public class ProcessHelper {

    public static void killChildrenProcesses() {}
}

```

### EmptyMethod
Method only calls its super
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    @Override
    public void close() throws Exception {
        super.close();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
public class MvndNativeLoader {

    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
    private static class Timer {
        private long startTime = 0;
        private long endTime = 0;

        public long startTime() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    private static class Timer {
        private long startTime = 0;
        private long endTime = 0;

```

### RedundantFieldInitialization
Field initialization to `0.0f` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/JavaVersion.java`
#### Snippet
```java
public class JavaVersion {

    private static float javaSpec = 0.0f;

    public static float getJavaSpec() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private String threadsFormat;

    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private int doneProjects = 0;
    private String buildStatus;
    private boolean displayDone = false;
    private boolean noBuffering;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
    private boolean displayDone = false;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `InputHandler`
in `daemon/src/main/java/org/mvndaemon/mvnd/interactivity/DaemonPrompter.java`
#### Snippet
```java
@Priority(10)
@Typed({Prompter.class, InputHandler.class, OutputHandler.class})
public class DaemonPrompter extends AbstractInputHandler implements Prompter, InputHandler, OutputHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DaemonPrompter.class);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-25-17-12-20.026.html`
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
'instanceof' on 'catch' parameter `t`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            } catch (Throwable t) {
                LOGGER.error("Problem in daemon expiration check", t);
                if (t instanceof Error) {
                    // never swallow java.lang.Error
                    throw (Error) t;
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    static class ExitException extends Exception {
        static final long serialVersionUID = 1L;
        int exitCode;

        ExitException(int exitCode) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
            prefixes[options.size()] = "-D" + property + "=";
        } else {
            prefixes = options.keySet().toArray(new String[0]);
        }
        return prefixes;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
            }
            if (Environment.STOP.removeCommandLineOption(args) != null) {
                DaemonInfo[] dis = registry.getAll().toArray(new DaemonInfo[0]);
                if (dis.length > 0) {
                    output.accept(Message.out("Stopping " + dis.length + " running daemons"));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            MavenExecutionRequestPopulator executionRequestPopulator = null;
            try {
                CliRequest cliRequest = new CliRequest(new String[0], classWorld);
                cliRequest.commandLine = new CommandLine.Builder().build();
                container.setLookupRealm(null);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        try {
            CliRequest req = new CliRequest(null, null);
            req.args = arguments.toArray(new String[0]);
            req.workingDirectory = new File(workingDirectory).getCanonicalPath();
            req.multiModuleProjectDirectory = new File(projectDirectory);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                }

                mavenConfig = cliManager.parse(args.toArray(new String[0]));
                List<?> unrecongized = mavenConfig.getArgList();
                if (!unrecongized.isEmpty()) {
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `BuildException` ends with 'Exception'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
    }

    public static class BuildException extends Message {
        final String message;
        final String className;
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `readLen` initializer `0` is redundant
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java

    private static String readFully(InputStream in) throws IOException {
        int readLen = 0;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        byte[] buf = new byte[32];
```

### UnusedAssignment
The value `null` assigned to `v` is never used
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                            }
                            v.record.invalidate();
                            v = null;
                        }
                        return new Record<>(mappingFunction.apply(k));
```

### UnusedAssignment
Variable `len` initializer `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
        try (Reader in = new BufferedReader(
                new InputStreamReader(cl.getResourceAsStream(resourcePath), StandardCharsets.UTF_8), bufSize)) {
            int len = 0;
            char[] buf = new char[bufSize];
            while ((len = in.read(buf)) >= 0) {
```

### UnusedAssignment
Variable `exitCode` initializer `0` is redundant
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
        }

        int exitCode = 0;
        boolean noBuffering = batchMode || parameters.noBuffering();
        try (TerminalOutput output = new TerminalOutput(noBuffering, parameters.rollingWindowSize(), logFile)) {
```

### UnusedAssignment
Variable `executionRequestPopulator` initializer `null` is redundant
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                }
            });
            MavenExecutionRequestPopulator executionRequestPopulator = null;
            try {
                CliRequest cliRequest = new CliRequest(new String[0], classWorld);
```

### UnusedAssignment
The value `null` assigned to `executionRequestPopulator` is never used
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                        resolver.loadCoreExtensions(cliRequest.request, providedArtifacts, extensions));
            } finally {
                executionRequestPopulator = null;
                container.dispose();
            }
```

### UnusedAssignment
Variable `linesPerProject` initializer `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private String threadsFormat;

    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                results.add(new DefaultProjectBuildingResult(project, result.getProblems(), resolutionResult));
            } catch (ModelBuildingException e) {
                DefaultProjectBuildingResult result = null;
                if (project == null || interimResult.result.getEffectiveModel() == null) {
                    result = new DefaultProjectBuildingResult(e.getModelId(), interimResult.pomFile, e.getProblems());
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java

    private double averageUsage(Collection<GcEvent> events) {
        return events.stream().mapToLong(e -> e.usage.getUsed()).average().getAsDouble();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
                            .filter(arg::startsWith)
                            .max(Comparator.comparing(String::length))
                            .get();
                    value = arg.substring(opt.length());
                    if (value.isEmpty()) {
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
                .values()
                .stream()
                .map(Optional::get)
                .collect(Collectors.toList());
        for (DaemonStopEvent stopEvent : recentStopEvents) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `v` is always 'null'
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                    v = null;
                }
                return v;
            });
            return record != null ? record.record : null;
```

### ConstantValue
Value `recordArtifacts` is always 'null'
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java
            } catch (PluginResolutionException e) {
                pluginArtifactsCache.put(cacheKey, e);
                pluginArtifactsCache.register(project, cacheKey, recordArtifacts);
                throw new PluginManagerException(plugin, e.getMessage(), e);
            }
```

### ConstantValue
Condition `idx < variable.length()` is always `true` when reached
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        int idx = idx1 >= 0 && idx2 >= 0 ? Math.min(idx1, idx2) : idx1 >= 0 ? idx1 : idx2;
        String op = null;
        if (idx >= 0 && idx < variable.length()) {
            op = variable.substring(idx);
            variable = variable.substring(0, idx);
```

### ConstantValue
Value `exception` is always 'null'
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
                                        args)
                                .toString(),
                        exception);
            }
            return this;
```

### ConstantValue
Condition `buildStatus != null` is always `true`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                        .style(AttributedStyle.DEFAULT);

            } else if (buildStatus != null) {
                asb.style(AttributedStyle.BOLD).append(buildStatus).style(AttributedStyle.DEFAULT);
            }
```

### ConstantValue
Value `recursive` is always 'true'
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                    aggregatorFiles,
                    false,
                    recursive,
                    config,
                    poolBuilder)) {
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        }

        public static ExecutionFailureEvent read(DataInputStream input) throws IOException {
            String projectId = readUTF(input);
            boolean halted = input.readBoolean();
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final boolean password;

        public static Prompt read(DataInputStream input) throws IOException {
            String projectId = Message.readUTF(input);
            String uid = Message.readUTF(input);
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final int artifactIdDisplayLength;

        public static BuildStarted read(DataInputStream input) throws IOException {
            final String projectId = readUTF(input);
            final int projectCount = input.readInt();
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String message;

        public static Message read(DataInputStream input) throws IOException {
            String projectId = Message.readUTF(input);
            String uid = Message.readUTF(input);
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final int exitCode;

        public static Message read(DataInputStream input) throws IOException {
            int exitCode = input.readInt();
            return new BuildFinished(exitCode);
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String executionId;

        public static MojoStartedEvent read(DataInputStream input) throws IOException {
            final String artifactId = readUTF(input);
            final String pluginGroupId = readUTF(input);
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String stackTrace;

        public static Message read(DataInputStream input) throws IOException {
            String message = readUTF(input);
            String className = readUTF(input);
```

### MethodOverridesStaticMethod
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final Map<String, String> env;

        public static Message read(DataInputStream input) throws IOException {
            List<String> args = readStringList(input);
            String workingDir = readUTF(input);
```

## RuleId[ruleID=IOResource]
### IOResource
'LoggingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                    }
                });
                System.setOut(new LoggingOutputStream(s -> sendQueue.add(Message.out(s))).printStream());
                System.setErr(new LoggingOutputStream(s -> sendQueue.add(Message.err(s))).printStream());
                int exitCode = cli.main(
```

### IOResource
'LoggingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                });
                System.setOut(new LoggingOutputStream(s -> sendQueue.add(Message.out(s))).printStream());
                System.setErr(new LoggingOutputStream(s -> sendQueue.add(Message.err(s))).printStream());
                int exitCode = cli.main(
                        buildRequest.getArgs(),
```

### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
                    .start();
            process.waitFor();
            Scanner sc = new Scanner(process.getErrorStream());
            sc.next();
            sc.next();
```

### IOResource
'LoggingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
```

### IOResource
'LoggingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CLibrary` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/CLibrary.java`
#### Snippet
```java
 */
@SuppressWarnings("unused")
public class CLibrary {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `OSInfo` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
 * @author leo
 */
public class OSInfo {

    public static final String X86 = "x86";
```

### UtilityClassWithoutPrivateConstructor
Class `MvndHelpFormatter` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/apache/maven/cli/MvndHelpFormatter.java`
#### Snippet
```java
 * Combines the help message from the stock Maven with {@code mvnd}'s help message.
 */
public class MvndHelpFormatter {
    private static final Pattern HTML_TAGS_PATTERN = Pattern.compile("<[^>]*>");
    private static final Pattern COLUMNS_DETECTOR_PATTERN = Pattern.compile("^[ ]+[^s]");
```

### UtilityClassWithoutPrivateConstructor
Class `MvndNativeLoader` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
 * usage: call {@link #initialize()} before using mvndnative.
 */
public class MvndNativeLoader {

    private static boolean loaded = false;
```

### UtilityClassWithoutPrivateConstructor
Class `Holder` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Connection.java`
#### Snippet
```java
    <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher);

    class Holder {
        static Connection CURRENT;
    }
```

### UtilityClassWithoutPrivateConstructor
Class `DaemonExpiration` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonExpiration.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/MasterExpirationStrategy.java
 */
public class DaemonExpiration {

    public interface DaemonExpirationStrategy {
```

### UtilityClassWithoutPrivateConstructor
Class `ProjectComparator` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
 * https://github.com/takari/takari-smart-builder/blob/takari-smart-builder-0.6.1/src/main/java/io/takari/maven/builder/smart/ProjectComparator.java
 */
class ProjectComparator {

    public static Comparator<MavenProject> create(DependencyGraph<MavenProject> graph) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/ProcessHelper.java`
#### Snippet
```java
package org.mvndaemon.mvnd.common;

public class ProcessHelper {

    public static void killChildrenProcesses() {}
```

### UtilityClassWithoutPrivateConstructor
Class `SocketHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketHelper.java`
#### Snippet
```java
import java.nio.channels.SocketChannel;

public class SocketHelper {

    public static SocketChannel openUnixSocket() throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `IoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class IoUtils {
    public static String readResource(ClassLoader cl, String resourcePath) {
        final StringBuilder result = new StringBuilder();
```

### UtilityClassWithoutPrivateConstructor
Class `AgentHelper` has only 'static' members, and lacks a 'private' constructor
in `helper/src/main/java/org/mvndaemon/mvnd/pump/AgentHelper.java`
#### Snippet
```java
import java.io.PrintStream;

public class AgentHelper {

    public static void pump(InputStream stream, PrintStream out) {
```

### UtilityClassWithoutPrivateConstructor
Class `Agent` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/org/mvndaemon/mvnd/agent/Agent.java`
#### Snippet
```java
import javassist.CtClass;

public class Agent {

    public static final String START_WITH_PIPES = "if (redirects != null\n"
```

### UtilityClassWithoutPrivateConstructor
Class `MavenDaemon` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/MavenDaemon.java`
#### Snippet
```java
import java.util.stream.Stream;

public class MavenDaemon {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BufferHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
 * https://github.com/classgraph/classgraph/blob/latest/src/main/java/nonapi/io/github/classgraph/utils/FileUtils.java#L543
 */
public class BufferHelper {

    private static boolean PRE_JAVA_9 =
```

### UtilityClassWithoutPrivateConstructor
Class `JavaVersion` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/JavaVersion.java`
#### Snippet
```java
package org.mvndaemon.mvnd.common;

public class JavaVersion {

    private static float javaSpec = 0.0f;
```

### UtilityClassWithoutPrivateConstructor
Class `BufferCaster` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferCaster.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/base-services/src/main/java/org/gradle/internal/io/BufferCaster.java
 */
public class BufferCaster {
    /**
     * Without this cast, when the code compiled by Java 9+ is executed on Java 8, it will throw
```

### UtilityClassWithoutPrivateConstructor
Class `Completion` has only 'static' members, and lacks a 'private' constructor
in `client/src/main/java/org/mvndaemon/mvnd/client/Completion.java`
#### Snippet
```java
import java.nio.file.Path;

public class Completion {

    public static String getCompletion(String shell, DaemonParameters daemonParameters) {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonExpirationStatus.java`
#### Snippet
```java
    QUIET_EXPIRE,
    GRACEFUL_EXPIRE,
    IMMEDIATE_EXPIRE;
}

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `in` might be null
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                }
                try (OutputStream out = new FileOutputStream(extractedLibFile)) {
                    copy(in, out);
                }
            } finally {
```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                nativeLibrarySourceUrl = MvndNativeLoader.class
                        .getResource(nativeLibraryFilePath)
                        .toExternalForm();
                return true;
            }
```

### DataFlowIssue
Dereference of `last` may produce `NullPointerException`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
        GcEvent last = events.peekLast();
        // Total number of garbage collection events observed in the window
        double gcCountDelta = last.count - first.count;
        // Time interval between the first event in the window and the last
        double timeDelta = Duration.between(first.timestamp, last.timestamp).toMillis();
```

### DataFlowIssue
Dereference of `first` may produce `NullPointerException`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
        GcEvent last = events.peekLast();
        // Total number of garbage collection events observed in the window
        double gcCountDelta = last.count - first.count;
        // Time interval between the first event in the window and the last
        double timeDelta = Duration.between(first.timestamp, last.timestamp).toMillis();
```

### DataFlowIssue
Condition `cause instanceof LinkageError` is redundant and can be replaced with a null check
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

                    throw new PluginContainerException(mojoDescriptor, pluginRealm, os.toString(), cause);
                } else if (cause instanceof LinkageError) {
                    ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
                    PrintStream ps = new PrintStream(os);
```

### DataFlowIssue
Argument `cl.getResourceAsStream(resourcePath)` might be null
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
        final int bufSize = 1024;
        try (Reader in = new BufferedReader(
                new InputStreamReader(cl.getResourceAsStream(resourcePath), StandardCharsets.UTF_8), bufSize)) {
            int len = 0;
            char[] buf = new char[bufSize];
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            final int exitCode = ps.waitFor(1000);
            if (exitCode != 0) {
                LOGGER.warn(Stream.of(cmd).collect(Collectors.joining(" ")) + " exited with " + exitCode + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            if (exitCode != 0) {
                LOGGER.warn(Stream.of(cmd).collect(Collectors.joining(" ")) + " exited with " + exitCode + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
        } catch (IOException e) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            LOGGER.warn("Could not execute " + Stream.of(cmd).collect(Collectors.joining(" ")));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        exec(cmd, output);
        List<String> javaHomeLines =
                output.stream().filter(l -> l.contains(" java.home = ")).collect(Collectors.toList());
        if (javaHomeLines.size() == 1) {
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    LOGGER.warn(
                            "Could not parse the output of " + Stream.of(cmd).collect(Collectors.joining(" "))
                                    + " as a long:\n"
                                    + output.stream().collect(Collectors.joining("\n")));
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                            "Could not parse the output of " + Stream.of(cmd).collect(Collectors.joining(" "))
                                    + " as a long:\n"
                                    + output.stream().collect(Collectors.joining("\n")));
                }
            } else {
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                }
            } else {
                LOGGER.warn("Unexpected output of " + Stream.of(cmd).collect(Collectors.joining(" ")) + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            } else {
                LOGGER.warn("Unexpected output of " + Stream.of(cmd).collect(Collectors.joining(" ")) + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
            return -1;
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            exec(cmd, output);
            final List<String> nonEmptyLines =
                    output.stream().filter(l -> !l.isEmpty()).collect(Collectors.toList());
            if (nonEmptyLines.size() >= 2) {
                try {
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    LOGGER.warn("Could not parse the second line of "
                            + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " output as a long:\n"
                            + nonEmptyLines.stream().collect(Collectors.joining("\n")));
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                            + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " output as a long:\n"
                            + nonEmptyLines.stream().collect(Collectors.joining("\n")));
                }
            } else {
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                }
            } else {
                LOGGER.warn("Unexpected output of " + Stream.of(cmd).collect(Collectors.joining(" ")) + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            } else {
                LOGGER.warn("Unexpected output of " + Stream.of(cmd).collect(Collectors.joining(" ")) + ":\n"
                        + output.stream().collect(Collectors.joining("\n")));
            }
            return -1;
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    public String toString() {
        StringBuilder sb = new StringBuilder();
        store(k -> k.toString(), sb);
        return sb.toString();
    }
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve field 'theCaseInsensitiveEnvironment'
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theCaseInsensitiveEnvironmentField =
                    processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
                    }
                }
            } catch (IOException ignored) {
                LOGGER.debug("could not load /proc/self", ignored);
            }
```

## RuleId[ruleID=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public ServerSocketChannel openServerSocket() throws IOException {
        switch (this) {
            case inet:
                return ServerSocketChannel.open().bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public static String toString(SocketAddress address) {
        switch (familyOf(address)) {
            case inet:
                InetSocketAddress isa = (InetSocketAddress) address;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public SocketChannel openSocket() throws IOException {
        switch (this) {
            case inet:
                return SocketChannel.open();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
                case TRANSFER_INITIATED:
                    return "TransferInitiated";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
                case PROJECT_STARTED:
                    return "ProjectStarted";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
            return null;
        }
        switch (type) {
            case BUILD_REQUEST:
                return BuildRequest.read(input);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        @Override
        public String toString() {
            switch (type) {
                case KEEP_ALIVE:
                    return "KeepAlive";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
                case PROJECT_LOG_MESSAGE:
                    return "ProjectLogMessage";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

    public static int getClassOrder(Message m) {
        switch (m.getType()) {
            case KEEP_ALIVE:
            case BUILD_REQUEST:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    private boolean doAccept(Message entry) {
        switch (entry.getType()) {
            case Message.BUILD_STARTED: {
                BuildStarted bs = (BuildStarted) entry;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
            case Message.KEYBOARD_INPUT: {
                char keyStroke = ((StringMessage) entry).getMessage().charAt(0);
                switch (keyStroke) {
                    case KEY_PLUS:
                        linesPerProject = Math.min(10, linesPerProject + 1);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            } while (tokenBuffer.remaining() > 0);
        } catch (final IOException e) {
            LOGGER.debug("Discarding EOFException: {}", e.toString(), e);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/SimpleAppender.java`
#### Snippet
```java
            buf.append(ThrowableProxyUtil.asString(tp));
        }
        System.out.print(buf.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonConnection.java`
#### Snippet
```java
        } catch (EOFException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Discarding EOFException: {}", e.toString(), e);
            }
            return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
            Arrays.fill(buf, '=');
            w.printf("%s%n", new String(buf));
            logMessage = "log available in " + log.toString();
        } catch (IOException e) {
            logMessage = "an exception occurred when writing log to " + log.toString() + ": " + e.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
            logMessage = "log available in " + log.toString();
        } catch (IOException e) {
            logMessage = "an exception occurred when writing log to " + log.toString() + ": " + e.toString();
        }
        if (exceptions.isEmpty()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
            logMessage = "log available in " + log.toString();
        } catch (IOException e) {
            logMessage = "an exception occurred when writing log to " + log.toString() + ": " + e.toString();
        }
        if (exceptions.isEmpty()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                                        .append('/')
                                        .append(maxThreads)
                                        .toString()))
                        .style(AttributedStyle.DEFAULT);

```

## RuleId[ruleID=RegExpUnexpectedAnchor]
### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
    private static final String DELIM_START = "${";
    private static final String DELIM_STOP = "}";
    private static final String MARKER = "$__";

    /**
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        public boolean asBoolean() {
            final String val = get();
            return "".equals(val) || Boolean.parseBoolean(val);
        }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

            // effective line, with indent and reset if end is colored
            line = indent + line + ("".equals(nextColor) ? "" : ANSI_RESET);

            if ((i == lines.length - 1) && (showErrors || (summary.getException() instanceof InternalErrorException))) {
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
        @Override
        public void store(OutputStream out, String comments) throws IOException {
            this.store(new OutputStreamWriter(out, "8859_1"), comments);
        }

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
            }
        } catch (Throwable e) {
            System.err.println("Error while running uname -m: " + e.getMessage());
            return "unknown";
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
        if (args.length >= 1) {
            if ("--os".equals(args[0])) {
                System.out.print(getOSName());
                return;
            } else if ("--arch".equals(args[0])) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
                return;
            } else if ("--arch".equals(args[0])) {
                System.out.print(getArchName());
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
        }

        System.out.print(getNativeLibFolderPathForCurrentOS());
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return version;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return false;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                return true;
            } catch (UnsatisfiedLinkError e) {
                System.err.println("Failed to load native library:" + libPath.getName() + ". osinfo: "
                        + OSInfo.getNativeLibFolderPathForCurrentOS());
                System.err.println(e);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                System.err.println("Failed to load native library:" + libPath.getName() + ". osinfo: "
                        + OSInfo.getNativeLibFolderPathForCurrentOS());
                System.err.println(e);
                return false;
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                        nativeLibFile.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old native lib" + e.getMessage());
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/SimpleAppender.java`
#### Snippet
```java
            buf.append(ThrowableProxyUtil.asString(tp));
        }
        System.out.print(buf.toString());
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/org/mvndaemon/mvnd/agent/Agent.java`
#### Snippet
```java
                        return data;
                    } catch (Throwable e) {
                        System.err.println(e);
                        throw new IllegalClassFormatException(e.toString());
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
                            ProcessHandle.of(di.getPid()).ifPresent(ProcessHandle::destroyForcibly);
                        } catch (Exception t) {
                            System.out.println("Daemon " + di.getId() + ": " + t);
                        } finally {
                            registry.remove(di.getId());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        MavenExecutionResult result = maven.execute(request);

        LoggingOutputStream.forceFlush(System.out);
        LoggingOutputStream.forceFlush(System.err);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

        LoggingOutputStream.forceFlush(System.out);
        LoggingOutputStream.forceFlush(System.err);

        eventSpyDispatcher.onEvent(result);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                Message.StringMessage d = (Message.StringMessage) entry;
                clearDisplay();
                System.out.printf("%s%n", d.getMessage());
                break;
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                Message.StringMessage d = (Message.StringMessage) entry;
                clearDisplay();
                System.err.printf("%s%n", d.getMessage());
                break;
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java

    static String translateArchNameToFolderName(String archName) {
        return archName.replaceAll("\\W", "");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
            return "AIX";
        } else {
            return osName.replaceAll("\\W", "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                versionData.load(versionFile.openStream());
                version = versionData.getProperty("version", version);
                version = version.trim().replaceAll("[^0-9.]", "");
            }
        } catch (IOException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            assert mvndnativeNativeLibraryName != null;
            if (mvndnativeNativeLibraryName.endsWith(".dylib")) {
                mvndnativeNativeLibraryName = mvndnativeNativeLibraryName.replace(".dylib", ".jnilib");
            }
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                output.stream().filter(l -> l.contains(" java.home = ")).collect(Collectors.toList());
        if (javaHomeLines.size() == 1) {
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
        }
        return null;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
            for (EnumConstantSource enumConst : source.getEnumConstants()) {
                final JavaDocSource<EnumConstantSource> javaDoc = enumConst.getJavaDoc();
                final String javadocText = javaDoc.getText().replaceAll("&#47;", "/");
                optionsProperties.setProperty(enumConst.getName(), javadocText);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
    public static String cygpath(String result) {
        String path = result.replace('/', '\\');
        if (path.matches("\\\\cygdrive\\\\[a-z]\\\\.*")) {
            String s = path.substring("\\cygdrive\\".length());
            result = s.substring(0, 1).toUpperCase(Locale.ENGLISH) + ":" + s.substring(1);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java

    private static String unescape(String val) {
        val = val.replaceAll("\\" + MARKER, "\\$");
        int escape = val.indexOf(ESCAPE_CHAR);
        while (escape >= 0 && escape < val.length() - 1) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

            if (configFile.isFile()) {
                for (String arg : new String(Files.readAllBytes(configFile.toPath())).split("\\s+")) {
                    if (!arg.isEmpty()) {
                        args.add(arg);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        }

        String[] lines = msg.split("(\r\n)|(\r)|(\n)");
        String currentColor = "";

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file.attribute` is unnecessary and can be removed
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
    /**
     * A state of a file given by {@link BasicFileAttributes#lastModifiedTime()} and
     * {@link java.nio.file.attribute.BasicFileAttributes#fileKey()} at the time of {@link FileState} creation.
     */
    static class FileState {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file.attribute` is unnecessary and can be removed
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
/**
 * A factory for {@link Cache} objects invalidating its entries based on {@link BasicFileAttributes#lastModifiedTime()}
 * and {@link java.nio.file.attribute.BasicFileAttributes#fileKey()}.
 */
public class TimestampCacheFactory implements CacheFactory {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.nio.file` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
                WatchEvent.Modifier[] mods;
                try {
                    mods = new WatchEvent.Modifier[] {com.sun.nio.file.SensitivityWatchEventModifier.HIGH};
                } catch (Throwable t) {
                    mods = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary and can be removed
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

            if (mojo instanceof Mojo) {
                org.slf4j.Logger mojoLogger = LoggerFactory.getLogger(mojoDescriptor.getImplementation());
                ((Mojo) mojo).setLog(new MojoLogWrapper(mojoLogger));
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `common/src/main/java/org/mvndaemon/mvnd/common/MavenDaemon.java`
#### Snippet
```java
                                    try {
                                        return Files.list(p);
                                    } catch (java.io.IOException e) {
                                        throw new RuntimeException("Could not list " + p, e);
                                    }
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        cliRequest.showErrors = cliRequest.verbose || cliRequest.commandLine.hasOption(CLIManager.ERRORS);

        ch.qos.logback.classic.Level level;
        if (cliRequest.verbose) {
            level = ch.qos.logback.classic.Level.DEBUG;
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        ch.qos.logback.classic.Level level;
        if (cliRequest.verbose) {
            level = ch.qos.logback.classic.Level.DEBUG;
        } else if (cliRequest.quiet) {
            level = ch.qos.logback.classic.Level.WARN;
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            level = ch.qos.logback.classic.Level.DEBUG;
        } else if (cliRequest.quiet) {
            level = ch.qos.logback.classic.Level.WARN;
        } else {
            level = ch.qos.logback.classic.Level.INFO;
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            level = ch.qos.logback.classic.Level.WARN;
        } else {
            level = ch.qos.logback.classic.Level.INFO;
        }
        ((ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(level);
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        final ch.qos.logback.classic.Logger mvndLogger =
                (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("org.mvndaemon.mvnd");
        mvndLogger.setLevel(ch.qos.logback.classic.Level.toLevel(System.getProperty("mvnd.log.level"), null));

        // LOG STREAMS
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            ch.qos.logback.classic.Logger stderr =
                    (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stderr");
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                    (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stderr");
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

    @Inject
    private org.eclipse.aether.RepositorySystem repoSystem;

    @Inject
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.resolution` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
            pomArtifact = pomResult.getArtifact();
            localProject = pomResult.getRepository() instanceof WorkspaceRepository;
        } catch (org.eclipse.aether.resolution.ArtifactResolutionException e) {
            if (e.getResults().get(0).isMissing() && allowStubModel) {
                return build(null, createStubModelSource(artifact), config);
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            } catch (Throwable t) {
                LOGGER.debug("Error killing children processes", t);
                t.printStackTrace();
            }
            long rem;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `MemoryExpirationStrategy()` of an abstract class should not be declared 'public'
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonExpiration.java`
#### Snippet
```java
        final double minFreeMemoryPercentage;

        public MemoryExpirationStrategy(double minFreeMemoryPercentage) {
            this.minFreeMemoryPercentage = minFreeMemoryPercentage;
        }
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(summary.getReference())) {
            referenceKey = references.get(summary.getReference());
            if (referenceKey == null) {
                referenceKey = "[Help " + (references.size() + 1) + "]";
                references.put(summary.getReference(), referenceKey);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            stdOut.start();

            this.shutDownHook = new Thread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new PrivilegedAction() can be replaced with lambda
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
    public static boolean closeDirectByteBuffer(final ByteBuffer byteBuffer, final Consumer<String> log) {
        if (byteBuffer != null && byteBuffer.isDirect()) {
            return AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
                @Override
                public Boolean run() {
```

### Convert2Lambda
Anonymous new PrivilegedAction() can be replaced with lambda
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java

    static {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            @Override
            public Object run() {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `nextLineEnd`
in `daemon/src/main/java/org/apache/maven/cli/MvndHelpFormatter.java`
#### Snippet
```java

                } else {
                    nextLineEnd = stringBuilder.length() + lineLength;
                    stringBuilder.append(System.lineSeparator()).append(indent).append(token);
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
    private static PathMatcher getPathMatcher(String pattern) {
        if (!pattern.startsWith("glob:") && !pattern.startsWith("regex:")) {
            pattern = "glob:" + pattern;
        }
        return FileSystems.getDefault().getPathMatcher(pattern);
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = PARENT_CLASSLOADER;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parentImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (parentImports != null) {
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `parentImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `foreignImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (foreignImports != null) {
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `foreignImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `projectId`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/smart/ProjectBuildLogAppender.java`
#### Snippet
```java
        if (forkingProjectId != null) {
            if (projectId != null) {
                projectId = forkingProjectId + "/" + projectId;
            } else {
                projectId = forkingProjectId;
```

### AssignmentToMethodParameter
Assignment to method parameter `projectId`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/smart/ProjectBuildLogAppender.java`
#### Snippet
```java
                projectId = forkingProjectId + "/" + projectId;
            } else {
                projectId = forkingProjectId;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutMs`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            final long deadline = System.currentTimeMillis() + timeoutMs;
            final boolean timeouted = !process.waitFor(timeoutMs, TimeUnit.MILLISECONDS);
            timeoutMs = Math.max(0, deadline - System.currentTimeMillis());
            stdOut.join(timeoutMs);
            stdOut.assertSuccess();
```

### AssignmentToMethodParameter
Assignment to method parameter `bytes`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        int unit = 0;
        while (bytes >= KB && unit < UNITS.length() - 1) {
            bytes /= KB;
            unit++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `kb`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        int unit = 1;
        while (kb >= KB && unit < UNITS.length() - 1) {
            kb /= KB;
            unit++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
        if (buf.length > 1024) {
            LOGGER.warn("Attempting to write string longer than 1024 bytes: '{}'. Please raise an issue.", str);
            str = str.substring(0, 1033);
            while (buf.length > 1024) {
                str = str.substring(0, str.length() - 12) + "…";
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
            str = str.substring(0, 1033);
            while (buf.length > 1024) {
                str = str.substring(0, str.length() - 12) + "…";
                buf = str.getBytes(StandardCharsets.UTF_8);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
        if (path.matches("\\\\cygdrive\\\\[a-z]\\\\.*")) {
            String s = path.substring("\\cygdrive\\".length());
            result = s.substring(0, 1).toUpperCase(Locale.ENGLISH) + ":" + s.substring(1);
        }
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `common/src/main/java/org/mvndaemon/mvnd/common/TimeUtils.java`
#### Snippet
```java
        if (millis >= DAYS_MILLIS) {
            sb.append(millis / DAYS_MILLIS).append("d");
            millis %= DAYS_MILLIS;
        }
        if (millis >= HOURS_MILLIS) {
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `common/src/main/java/org/mvndaemon/mvnd/common/TimeUtils.java`
#### Snippet
```java
        if (millis >= HOURS_MILLIS) {
            sb.append(millis / HOURS_MILLIS).append("h");
            millis %= HOURS_MILLIS;
        }
        if (millis >= MINUTES_MILLIS) {
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `common/src/main/java/org/mvndaemon/mvnd/common/TimeUtils.java`
#### Snippet
```java
        if (millis >= MINUTES_MILLIS) {
            sb.append(millis / MINUTES_MILLIS).append("m");
            millis %= MINUTES_MILLIS;
        }
        if (millis >= SECONDS_MILLIS) {
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `common/src/main/java/org/mvndaemon/mvnd/common/TimeUtils.java`
#### Snippet
```java
        if (millis >= SECONDS_MILLIS) {
            sb.append(millis / SECONDS_MILLIS).append("s");
            millis %= SECONDS_MILLIS;
        }
        if (millis >= ONE_UNIT || sb.length() == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `cycleMap`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            throws IllegalArgumentException {
        if (cycleMap == null) {
            cycleMap = new HashMap<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        // the variable, and the trailing characters to get the new
        // value.
        val = val.substring(0, startDelim) + substValue + val.substring(stopDelim + DELIM_STOP.length());

        // Now perform substitution again, since there could still
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        // Now perform substitution again, since there could still
        // be substitutions to make.
        val = doSubstVars(
                val, currentKey, cycleMap, configProps, callback, substituteFromConfig, defaultsToEmptyString);

```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java

    private static String unescape(String val) {
        val = val.replaceAll("\\" + MARKER, "\\$");
        int escape = val.indexOf(ESCAPE_CHAR);
        while (escape >= 0 && escape < val.length() - 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            char c = val.charAt(escape + 1);
            if (c == '{' || c == '}' || c == ESCAPE_CHAR) {
                val = val.substring(0, escape) + val.substring(escape + 1);
            }
            escape = val.indexOf(ESCAPE_CHAR, escape + 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `threadConfiguration`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    int calculateDegreeOfConcurrency(String threadConfiguration) {
        if (threadConfiguration.endsWith("C")) {
            threadConfiguration = threadConfiguration.substring(0, threadConfiguration.length() - 1);

            if (!NumberUtils.isParsable(threadConfiguration)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        }

        indent += "  ";

        for (ExceptionSummary child : summary.getChildren()) {
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `records`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
        record.getDependencyPaths().forEach(p -> {
            final List<CacheRecord> records = recordsByPath.computeIfAbsent(p, k -> new ArrayList<>());
            synchronized (records) {
                records.add(record);
                registrationsByDir.compute(p.getParent(), this::register);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `records`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
                    final List<CacheRecord> records = recordsByPath.remove(path);
                    if (records != null) {
                        synchronized (records) {
                            LOG.debug("Invalidating records for path {}: {}", path, records);
                            remove(records);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `records`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
                            final List<CacheRecord> records = en.getValue();
                            if (records != null) {
                                synchronized (records) {
                                    LOG.debug("Invalidating records of path {}: {}", path, records);
                                    remove(records);
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                return v;
            });
            return record != null ? record.record : null;
        }

```

### ReturnNull
Return of `null`
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                    return "EOF on first stream but not second";
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingExtensionRealmCache.java`
#### Snippet
```java
    public CacheRecord get(Key key) {
        Record r = cache.get(key);
        return r != null ? r.record : null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
            } catch (NoSuchFileException e) {
                // we allow this exception in case of a missing reactor artifact
                return null;
            } catch (IOException e) {
                throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
        if (value == null) {
            LOG.debug("Already stopped watching path {}", key);
            return null;
        } else {
            final int cnt = value.count.decrementAndGet();
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
                LOG.debug("Unwatching path {}", key);
                value.watchKey.cancel();
                return null;
            } else {
                LOG.debug("Still " + cnt + " watchers for path {}", key);
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingProjectArtifactsCache.java`
#### Snippet
```java
            return r.record;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
    public CacheRecord get(Key key) {
        Record r = cache.get(key);
        return r != null ? r.record : null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginArtifactsCache.java`
#### Snippet
```java
            return r.record;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
    public PluginDescriptor get(Key key) {
        Record r = cache.get(key);
        return r != null ? clone(r.descriptor) : null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java

    static String trimTrailingEols(String message) {
        return message == null ? null : TRAILING_EOLS_PATTERN.matcher(message).replaceFirst("");
    }
}
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLogger.java`
#### Snippet
```java
     */
    public Logger getChildLogger(String name) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java
            return new InetSocketAddress(InetAddress.getLoopbackAddress(), 0);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
            public Object run() {
                lookupCleanMethodPrivileged();
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
        int sz = buffer.getShort();
        if (sz == -1) {
            return null;
        }
        if (sz < -1 || sz > 1024) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        int len = input.readInt();
        if (len == -1) {
            return null;
        }
        final char[] chars = new char[len];
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        int type = input.read();
        if (type < 0) {
            return null;
        }
        switch (type) {
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
                result = Environment.cygpath(result);
            }
            return result == null ? null : Paths.get(result);
        }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonConnection.java`
#### Snippet
```java
                LOGGER.debug("Discarding EOFException: {}", e.toString(), e);
            }
            return null;
        } catch (IOException e) {
            throw new DaemonException.RecoverableMessageIOException(
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
        Duration purgeLogPeriod = parameters.purgeLogPeriod();
        if (!Files.isDirectory(storage) || !TimeUtils.isPositive(purgeLogPeriod)) {
            return null;
        }
        String date = DateTimeFormatter.ofPattern("yyyy-MM-dd")
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
        }
        if (exceptions.isEmpty() && deleted.isEmpty()) {
            return null;
        }
        String logMessage;
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            LOGGER.debug("Cannot connect to daemon {} due to {}. Ignoring.", daemon, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            return MavenExecutionRequest.CHECKSUM_POLICY_WARN;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            return MavenExecutionRequest.REACTOR_MAKE_BOTH;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    static File resolveFile(File file, String workingDirectory) {
        if (file == null) {
            return null;
        } else if (file.isAbsolute()) {
            return file;
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private AttributedString formatFailures() {
        if (failures.isEmpty()) {
            return null;
        }
        AttributedStringBuilder asb = new AttributedStringBuilder();
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                this.transfers.getOrDefault(projectId, Collections.emptyMap()).values();
        if (transfers.isEmpty()) {
            return null;
        }
        TransferEvent event = transfers.iterator().next();
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                            }
                            v.record.invalidate();
                            v = null;
                        }
                        return new Record<>(mappingFunction.apply(k));
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                    }
                    v.record.invalidate();
                    v = null;
                }
                return v;
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `parent` is redundant
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
        Objects.requireNonNull(plugin, "plugin cannot be null");

        ClassLoader parent = PARENT_CLASSLOADER;

        Map<String, ClassLoader> foreignImports = Collections.<String, ClassLoader>singletonMap("", getMavenApiRealm());
```

### UnnecessaryLocalVariable
Local variable `exitCode` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            } catch (Exception ignored) {
            }
            final int exitCode = timeouted ? TIMEOUT_EXIT_CODE : process.exitValue();
            return exitCode;
        }
```

### UnnecessaryLocalVariable
Local variable `pluginDescriptor` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java
            Reader reader = ReaderFactory.newXmlReader(is);

            PluginDescriptor pluginDescriptor = builder.build(reader, descriptorLocation);

            return pluginDescriptor;
```

### UnnecessaryLocalVariable
Local variable `process` is redundant
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
                    .environment()
                    .put(Environment.JDK_JAVA_OPTIONS.getEnvironmentVariable(), parameters.jdkJavaOpts());
            Process process = processBuilder
                    .directory(workingDir.toFile())
                    .command(args)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java

        List<K> ensembleWithChildrenOf(List<K> list, K node) {
            final List<K> result = Stream.concat(
                            list.stream().filter(k -> !Objects.equals(k, node)),
                            graph.getDownstreamProjects(node).filter(k -> graph.transitiveUpstreams.get(k).stream()
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            while (connection == null && System.currentTimeMillis() - start < CANCELED_WAIT_TIMEOUT) {
                try {
                    sleep(200);
                    connection = connectToIdleDaemon(registry.getIdle(), constraint);
                } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
            try {
                sleep(50L);
            } catch (InterruptedException e) {
                throw new DaemonException.InterruptedException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
            try {
                sleep(200L);
            } catch (InterruptedException e) {
                throw new DaemonException.InterruptedException(e);
```

## RuleId[ruleID=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonStopEvent.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonStopEvent.java
 */
public class DaemonStopEvent implements Serializable {

    private final String daemonId;
```

### ClassCanBeRecord
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
    }

    public static class DocumentedEnumEntry<E> {

        private final E entry;
```

### ClassCanBeRecord
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/context/DaemonCompatibilitySpec.java
 */
public class DaemonCompatibilitySpec {

    private final Path javaHome;
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            this.process = process;
            this.stdOut = new StreamGobbler(process.getInputStream(), outputConsumer);
            stdOut.start();

            this.shutDownHook = new Thread(new Runnable() {
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonClientConnection.java`
#### Snippet
```java
        this.newDaemon = newDaemon;
        this.receiver = new Thread(this::doReceive);
        this.receiver.start();
        this.parameters = parameters;
        this.maxKeepAliveMs = parameters.keepAlive().toMillis() * parameters.maxLostKeepAlive();
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
            final Thread r = new Thread(this::readInputLoop);
            r.setDaemon(true);
            r.start();
            this.reader = r;
        } else {
```

