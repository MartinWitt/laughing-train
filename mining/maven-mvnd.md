# maven-mvnd 
 
# Bad smells
I found 363 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 68 | false |
| RuleId[ruleID=ReturnNull] | 32 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 26 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 17 | false |
| RuleId[ruleID=SystemOutErr] | 16 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 13 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 13 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 12 | false |
| RuleId[ruleID=EnhancedSwitchMigration] | 11 | false |
| RuleId[ruleID=UnusedAssignment] | 8 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 8 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 7 | true |
| RuleId[ruleID=NestedAssignment] | 7 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 7 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 7 | true |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 6 | false |
| RuleId[ruleID=ConstantValue] | 6 | false |
| RuleId[ruleID=IOResource] | 6 | false |
| RuleId[ruleID=DataFlowIssue] | 6 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 5 | true |
| RuleId[ruleID=UnnecessaryModifier] | 4 | true |
| RuleId[ruleID=IgnoreResultOfCall] | 4 | false |
| RuleId[ruleID=CommentedOutCode] | 3 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 3 | false |
| RuleId[ruleID=MissortedModifiers] | 3 | false |
| RuleId[ruleID=ThrowablePrintedToSystemOut] | 3 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 3 | false |
| RuleId[ruleID=RedundantMethodOverride] | 3 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 3 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 3 | false |
| RuleId[ruleID=Convert2Lambda] | 3 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 3 | false |
| RuleId[ruleID=BusyWait] | 3 | false |
| RuleId[ruleID=ClassCanBeRecord] | 3 | false |
| RuleId[ruleID=ThreadStartInConstruction] | 3 | false |
| RuleId[ruleID=EmptyStatementBody] | 2 | false |
| RuleId[ruleID=AccessStaticViaInstance] | 2 | false |
| RuleId[ruleID=CodeBlock2Expr] | 2 | false |
| RuleId[ruleID=EmptyMethod] | 2 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 2 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 2 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=CStyleArrayDeclaration] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=RegExpSimplifiable] | 1 | false |
| RuleId[ruleID=ReadWriteStringCanBeUsed] | 1 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 1 | false |
| RuleId[ruleID=SlowListContainsAll] | 1 | false |
| RuleId[ruleID=InfiniteLoopStatement] | 1 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 1 | false |
| RuleId[ruleID=RedundantImplements] | 1 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 1 | false |
| RuleId[ruleID=NonFinalFieldOfException] | 1 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=Convert2MethodRef] | 1 | false |
| RuleId[ruleID=JavaReflectionMemberAccess] | 1 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 1 | false |
| RuleId[ruleID=RegExpUnexpectedAnchor] | 1 | false |
| RuleId[ruleID=UnnecessaryInitCause] | 1 | false |
| RuleId[ruleID=CharsetObjectCanBeUsed] | 1 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 1 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 1 | true |
| RuleId[ruleID=Java8MapApi] | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `client/src/main/java/org/mvndaemon/mvnd/client/ExecutionResult.java`
#### Snippet
```java
    int getExitCode();

    public static StringBuilder appendCommand(StringBuilder sb, List<String> args) {
        sb.append("mvnd");
        for (String arg : args) {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `private` is redundant for enum constructors
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
        private final String prefix;

        private OptionOrigin() {
            this.prefix = name() + ":";
        }
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectExecutorService.java`
#### Snippet
```java

    static interface ProjectRunnable extends Runnable {
        public MavenProject getProject();
    }

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectExecutorService.java`
#### Snippet
```java
    }

    static interface ProjectRunnable extends Runnable {
        public MavenProject getProject();
    }
```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`if` statement has empty body
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
        if (projectId != null) {
            Boolean b = projects.get(projectId);
            if (b != Boolean.TRUE) {
            }
        }
```

### RuleId[ruleID=EmptyStatementBody]
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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `INSTANCE` from instance context
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/SmartBuilder.java`
#### Snippet
```java
    public SmartBuilder(LifecycleModuleBuilder moduleBuilder) {
        this.moduleBuilder = moduleBuilder;
        INSTANCE = this;
    }

```

## RuleId[ruleID=CStyleArrayDeclaration]
### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `cbuf`
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java

            @Override
            public void write(char cbuf[], int off, int len) throws IOException {
                if (!firstLine) {
                    super.write(cbuf, off, len);
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
Commented out code (8 lines)
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
    private static Method cleanerCleanMethod;

    //    /** The jdk.incubator.foreign.MemorySegment class (JDK14+). */
    //    private static Class<?> memorySegmentClass;
    //
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (6 lines)
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            socketChannel.configureBlocking(true);

            //            Socket socket = socketChannel.socket();
            //            socket.connect(address, CONNECT_TIMEOUT);
            //            if (socket.getLocalSocketAddress().equals(socket.getRemoteSocketAddress())) {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
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
### RuleId[ruleID=RegExpSimplifiable]
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
### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`dependencyManagement.getDependencies().size() > 0` can be replaced with '!dependencyManagement.getDependencies().isEmpty()'
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
            final DependencyManagement dependencyManagement = project.getDependencyManagement();
            if ((dependencyManagement != null) && ((dependencyManagement.getDependencies()) != null)
                    && (dependencyManagement.getDependencies().size() > 0)) {
                map = new AbstractMap<String, Artifact>() {
                    HashMap<String, Artifact> delegate;
```

## RuleId[ruleID=ReadWriteStringCanBeUsed]
### RuleId[ruleID=ReadWriteStringCanBeUsed]
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
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        }
        String kbString = String.valueOf(bytes);
        return new StringBuilder(kbString.length() + 1).append(kbString).append(UNITS.charAt(unit)).toString();
    }

```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        }
        String kbString = String.valueOf(kb);
        return new StringBuilder(kbString.length() + 1).append(kbString).append(UNITS.charAt(unit)).toString();
    }

```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                                String.format(
                                        threadsFormat,
                                        new StringBuilder(threadsFormat.length())
                                                .append(projectsCount)
                                                .append('/')
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            private final Consumer<String> out;

            private StreamGobbler(InputStream in, Consumer<String> out) {
                this.in = in;
                this.out = out;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
    }

    private static boolean closeDirectByteBufferPrivileged(final ByteBuffer byteBuffer, final Consumer<String> log) {
        if (!byteBuffer.isDirect()) {
            // Nothing to do
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StringBuilder`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        final Supplier<String> valueSupplier;

        public ValueSource(Function<StringBuilder, StringBuilder> descriptionFunction, Supplier<String> valueSupplier) {
            this.descriptionFunction = descriptionFunction;
            this.valueSupplier = valueSupplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PropertiesBuilder`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
    }

    protected DaemonParameters derive(Consumer<PropertiesBuilder> customizer) {
        PropertiesBuilder builder = new PropertiesBuilder().putAll(this.properties);
        customizer.accept(builder);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        }

        public EnvValue orLocalProperty(Function<Path, Properties> provider, Path localPropertiesPath) {
            if (localPropertiesPath != null) {
                return new EnvValue(this, envKey, new ValueSource(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Properties`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        }

        public EnvValue orLocalProperty(Function<Path, Properties> provider, Path localPropertiesPath) {
            if (localPropertiesPath != null) {
                return new EnvValue(this, envKey, new ValueSource(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
    }

    public void addCommandLineOption(Collection<String> args, String value) {
        if (!options.isEmpty()) {
            args.add(options.keySet().iterator().next());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
    }

    private DaemonClientConnection findConnection(List<DaemonInfo> compatibleDaemons) {
        for (DaemonInfo daemon : compatibleDaemons) {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
    }

    private DaemonClientConnection connectToCanceledDaemon(Collection<DaemonInfo> busyDaemons,
            DaemonCompatibilitySpec constraint) {
        DaemonClientConnection connection = null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DaemonInfo`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
    }

    private List<DaemonInfo> getCompatibleDaemons(Iterable<DaemonInfo> daemons, DaemonCompatibilitySpec constraint) {
        List<DaemonInfo> compatibleDaemons = new LinkedList<>();
        for (DaemonInfo daemon : daemons) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
    private static String doSubstVars(String val,
            String currentKey,
            Map<String, String> cycleMap,
            Map<String, String> configProps,
            SubstitutionCallback callback,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
    private static String doSubstVars(String val,
            String currentKey,
            Map<String, String> cycleMap,
            Map<String, String> configProps,
            SubstitutionCallback callback,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, Record<V>>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<K, Record<V>> entry = iterator.next();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, Record<V>>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<K, Record<V>> entry = iterator.next();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
    }

    private boolean shouldEvict(List<MavenProject> projects, InvalidatingProjectArtifactsCache.CacheKey k,
            InvalidatingProjectArtifactsCache.Record v) {
        return projects.stream().anyMatch(p -> k.matches(p.getGroupId(), p.getArtifactId(), p.getVersion()));
```

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<K, V> entry = iterator.next();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java

        @Override
        public void removeIf(BiPredicate<K, V> predicate) {
            for (Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<K, V> entry = iterator.next();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private double averageUsage(Collection<GcEvent> events) {
        return events.stream().mapToLong(e -> e.usage.getUsed()).average().getAsDouble();
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private double gcRate(Deque<GcEvent> events) {
        GcEvent first = events.peekFirst();
        GcEvent last = events.peekLast();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GcEvent`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
    }

    private void slideAndInsert(Deque<GcEvent> events, GcEvent event) {
        events.addLast(event);
        while (events.size() > MAX_EVENTS) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
    }

    static int artifactIdLength90thPercentile(List<MavenProject> projects) {
        if (projects.size() == 1) {
            return projects.get(0).getArtifactId().length();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Message`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
    private static final Pattern TRAILING_EOLS_PATTERN = Pattern.compile("[\r\n]+$");

    public ClientDispatcher(Collection<Message> queue) {
        this.queue = queue;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassRealmConstituent`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
    }

    private Set<String> populateRealm(ClassRealm classRealm, List<ClassRealmConstituent> constituents) {
        Set<String> includedIds = new LinkedHashSet<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassRealmManagerDelegate`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
    @Inject
    public MvndClassRealmManager(Logger logger, PlexusContainer container,
            List<ClassRealmManagerDelegate> delegates, CoreExportsProvider exports) {
        this.logger = logger;
        this.world = ((MutablePlexusContainer) container).getClassWorld();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Artifact`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
    private ClassRealm createRealm(String baseRealmId, ClassRealmRequest.RealmType type, ClassLoader parent,
            List<String> parentImports,
            Map<String, ClassLoader> foreignImports, List<Artifact> artifacts) {
        Set<String> artifactIds = new LinkedHashSet<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
    }

    public static void environment(String workingDir, Map<String, String> clientEnv, Consumer<String> log) {
        Map<String, String> requested = new TreeMap<>(clientEnv);
        Map<String, String> actual = new TreeMap<>(System.getenv());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java

                    @Override
                    public <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher) {
                        try {
                            synchronized (recvQueue) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java

                    @Override
                    public <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher) {
                        try {
                            synchronized (recvQueue) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Timer`
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
        private final Map.Entry<String, Timer> mojo;

        Mojo(Map.Entry<String, Timer> mojo) {
            this.mojo = mojo;
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
        private final Map.Entry<String, Map<String, Timer>> project;

        Project(Entry<String, Map<String, Timer>> project) {
            this.project = project;
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public static ReactorBuildStats create(Collection<MavenProject> projects) {
        ImmutableMap.Builder<String, AtomicLong> serviceTimes = ImmutableMap.builder();
        ImmutableMap.Builder<String, AtomicLong> bottleneckTimes = ImmutableMap.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    private <K> K getCriticalProject(Stream<K> projects, Comparator<K> comparator) {
        return projects.min(comparator).orElse(null);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    private <K> K getCriticalProject(Stream<K> projects, Comparator<K> comparator) {
        return projects.min(comparator).orElse(null);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/SmartBuilderImpl.java`
#### Snippet
```java
    }

    private void submitAll(Set<MavenProject> readyProjects) {
        List<ProjectBuildTask> tasks = new ArrayList<>();
        for (MavenProject project : readyProjects) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public String renderCriticalPath(DependencyGraph<MavenProject> graph) {
        return renderCriticalPath(graph, ReactorBuildStats::projectGAV);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ReactorBuildStats.java`
#### Snippet
```java
    }

    public void recordBottlenecks(Set<MavenProject> projects, int degreeOfConcurrency,
            long durationNanos) {
        // only projects that result in single-threaded builds
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/smart/LoggingOutputStream.java`
#### Snippet
```java
    }

    LoggingOutputStream(EolBaos out, Consumer<String> consumer) {
        super(out);
        this.buf = out;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AttributedString`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    }

    private void addStatusLine(final List<AttributedString> lines, int dispLines, final int projectsCount) {
        if (name != null || buildStatus != null) {
            AttributedStringBuilder asb = new AttributedStringBuilder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void setDaemonReceive(Consumer<Message> daemonReceive) {
        this.daemonReceive = daemonReceive;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void accept(List<Message> entries) {
        assert "main".equals(Thread.currentThread().getName());
        for (Message entry : entries) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AttributedString`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    }

    private void addProjectLine(final List<AttributedString> lines, Project prj) {
        final MojoStartedEvent execution = prj.runningExecution;
        final AttributedStringBuilder asb = new AttributedStringBuilder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Message`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    @Override
    public void setDaemonDispatch(Consumer<Message> daemonDispatch) {
        this.daemonDispatch = daemonDispatch;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtomicLong`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
    }

    private static <K> long getServiceTime(Map<String, AtomicLong> serviceTimes, K project,
            long defaultServiceTime, Function<K, String> toKey) {
        AtomicLong serviceTime = serviceTimes.get(toKey.apply(project));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java

    private static <K> Map<K, Long> calculateWeights(DependencyGraph<K> dependencyGraph,
            Map<K, Long> serviceTimes, Collection<K> rootProjects) {
        Map<K, Long> weights = new HashMap<>();
        for (K rootProject : rootProjects) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AtomicLong`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
    }

    private static long average(Collection<AtomicLong> values) {
        return (long) (values.stream().mapToLong(AtomicLong::longValue)
                .average().orElse(1.0d));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
    static <K> Comparator<K> create0(DependencyGraph<K> dependencyGraph,
            Map<String, AtomicLong> historicalServiceTimes,
            Function<K, String> toKey) {
        final long defaultServiceTime = average(historicalServiceTimes.values());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
     */
    private static <K> long calculateWeights(DependencyGraph<K> dependencyGraph,
            Map<K, Long> serviceTimes, K project, Map<K, Long> weights) {
        long weight = serviceTimes.get(project)
                + dependencyGraph.getDownstreamProjects(project)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    }

    private void logSummary(ExceptionSummary summary, Map<String, String> references, String indent,
            boolean showErrors) {
        String referenceKey = "";
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    }

    private ClassRealm setupContainerRealm(ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath,
            List<CoreExtensionEntry> extensions) throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CoreExtensionEntry`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

    private ClassRealm setupContainerRealm(ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath,
            List<CoreExtensionEntry> extensions) throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
            ClassRealm extRealm = classWorld.newRealm("maven.ext", null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
     *                       general and {@code groupId:artifactId} when there is a name clash).
     */
    private String getResumeFromSelector(List<MavenProject> mavenProjects, MavenProject failedProject) {
        for (MavenProject buildProject : mavenProjects) {
            if (failedProject.getArtifactId().equals(buildProject.getArtifactId()) && !failedProject.equals(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    }

    private static <T> List<T> reverse(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public void store(Function<K, String> toString, Appendable w) {
        getProjects().forEach(k -> {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
        }

        List<K> ensembleWithChildrenOf(List<K> list, K node) {
            final List<K> result = Stream.concat(
                    list.stream().filter(k -> !Objects.equals(k, node)),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams,
            Map<K, Set<K>> transitiveUpstreams) {
        this.projects = projects;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams,
            Map<K, Set<K>> transitiveUpstreams) {
        this.projects = projects;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams) {
        this.projects = projects;
        this.upstreams = upstreams;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java
    }

    public DependencyGraph(List<K> projects, Map<K, List<K>> upstreams, Map<K, List<K>> downstreams) {
        this.projects = projects;
        this.upstreams = upstreams;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private String findProfilesXml(ModelBuildingResult result, Map<File, Boolean> profilesXmls) {
        for (String modelId : result.getModelIds()) {
            Model model = result.getRawModel(modelId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProjectBuildingResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private boolean build(List<ProjectBuildingResult> results, List<MavenProject> projects,
            Map<String, MavenProject> projectIndex, List<InterimResult> interimResults,
            ProjectBuildingRequest request, Map<File, Boolean> profilesXmls,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MavenProject`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private boolean build(List<ProjectBuildingResult> results, List<MavenProject> projects,
            Map<String, MavenProject> projectIndex, List<InterimResult> interimResults,
            ProjectBuildingRequest request, Map<File, Boolean> profilesXmls,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends InterimResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

    private boolean build(List<ProjectBuildingResult> results, List<MavenProject> projects,
            Map<String, MavenProject> projectIndex, List<InterimResult> interimResults,
            ProjectBuildingRequest request, Map<File, Boolean> profilesXmls,
            RepositorySystemSession session) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends InterimResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private void populateReactorModelPool(ReactorModelPool reactorModelPool, List<InterimResult> interimResults) {
        for (InterimResult interimResult : interimResults) {
            Model model = interimResult.result.getEffectiveModel();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super InterimResult`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:parameternumber")
    private boolean build(List<ProjectBuildingResult> results, List<InterimResult> interimResults,
            Map<String, MavenProject> projectIndex, File pomFile, Set<File> aggregatorFiles,
            boolean isRoot, boolean recursive, InternalConfig config) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Profile`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private List<String> getProfileIds(List<Profile> profiles) {
        List<String> ids = new ArrayList<>(profiles.size());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    }

    private void initParent(MavenProject project, Map<String, MavenProject> projects, boolean buildParentIfNotExisting,
            ModelBuildingResult result, ProjectBuildingRequest projectBuildingRequest) {
        Model parentModel = result.getModelIds().size() > 1 && !result.getModelIds().get(1).isEmpty()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:parameternumber")
    private boolean build(List<ProjectBuildingResult> results, List<InterimResult> interimResults,
            Map<String, MavenProject> projectIndex, List<File> pomFiles, Set<File> aggregatorFiles,
            boolean isRoot, boolean recursive, InternalConfig config) {
        boolean noErrors = true;
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonDiagnostics.java`
#### Snippet
```java
public class DaemonDiagnostics {

    private final static int TAIL_SIZE = 200;

    private final String id;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonClientConnection.java`
#### Snippet
```java
public class DaemonClientConnection implements Closeable {

    private final static Logger LOG = LoggerFactory.getLogger(DaemonClientConnection.class);

    private final DaemonConnection connection;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonExpiration.java`
#### Snippet
```java
    }

    private static abstract class MemoryExpirationStrategy implements DaemonExpirationStrategy {
        static final long MIN_THRESHOLD_BYTES = 384 * 1024 * 1024;
        static final long MAX_THRESHOLD_BYTES = 1024 * 1024 * 1024;
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setReadable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java

            // Set executable (x) flag to enable Java to load the native library
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setWritable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            // Set executable (x) flag to enable Java to load the native library
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setExecutable()` is ignored
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            extractedLibFile.setReadable(true);
            extractedLibFile.setWritable(true);
            extractedLibFile.setExecutable(true);

            // Check whether the contents are properly copied from the resource folder
```

### RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=ThrowablePrintedToSystemOut]
### RuleId[ruleID=ThrowablePrintedToSystemOut]
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

### RuleId[ruleID=ThrowablePrintedToSystemOut]
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

### RuleId[ruleID=ThrowablePrintedToSystemOut]
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

## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.maven.bridge.MavenRepositorySystem.buildArtifactRepository(org.apache.maven.model.Repository)' accessed via instance reference
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                DeploymentRepository r = project.getDistributionManagement().getRepository();
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = repositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(),
                            Arrays.asList(repo));
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'org.apache.maven.bridge.MavenRepositorySystem.buildArtifactRepository(org.apache.maven.model.Repository)' accessed via instance reference
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                DeploymentRepository r = project.getDistributionManagement().getSnapshotRepository();
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = repositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(),
                            Arrays.asList(repo));
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java
        for (MavenProject p : projects) {
            frequencyDistribution.compute(p.getArtifactId().length(),
                    (k, v) -> (v == null) ? Integer.valueOf(1) : Integer.valueOf(v.intValue() + 1));
        }
        int _90PercCount = Math.round(0.9f * projects.size());
```

### RuleId[ruleID=UnnecessaryUnboxing]
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

### RuleId[ruleID=UnnecessaryUnboxing]
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

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `createKey()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java

    @Override
    public Key createKey(Plugin plugin, List<RemoteRepository> repositories, RepositorySystemSession session) {
        return super.createKey(plugin, repositories, session);
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `close()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    @Override
    public void close() throws Exception {
        super.close();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `init()` only delegates to its super method
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    @Override
    public void init(Context context) throws Exception {
        super.init(context);
    }
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
 * Extracts JavaDoc blocks from enum entries and stores them into a properties file.
 */
@Mojo(name = "doc", defaultPhase = LifecyclePhase.NONE, threadSafe = true, requiresProject = true, requiresDependencyResolution = ResolutionScope.NONE)
public class DocMojo extends AbstractMojo {

```

## RuleId[ruleID=SlowListContainsAll]
### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java

    private boolean daemonOptsMatch(DaemonInfo daemon) {
        return daemon.getOptions().containsAll(options)
                && daemon.getOptions().size() == options.size();
    }
```

## RuleId[ruleID=InfiniteLoopStatement]
### RuleId[ruleID=InfiniteLoopStatement]
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

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
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
### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
                // We've sent the request, so it gives us a bit of time to purge the logs
                AtomicReference<String> purgeMessage = new AtomicReference<>();
                Thread purgeLog = new Thread(() -> {
                    purgeMessage.set(purgeLogs());
                }, "Log purge");
```

### RuleId[ruleID=CodeBlock2Expr]
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
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
    private final Object lck;
    private final FileChannel channel;
    private MappedByteBuffer buffer;
    private long size;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `nativeLibraryPath` is accessed in both synchronized and unsynchronized contexts
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java

    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `nativeLibrarySourceUrl` is accessed in both synchronized and unsynchronized contexts
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;

    /**
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `common/src/main/java/org/mvndaemon/mvnd/common/ProcessHelper.java`
#### Snippet
```java
public class ProcessHelper {

    public static void killChildrenProcesses() {
    }

```

### RuleId[ruleID=EmptyMethod]
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
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0f` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/JavaVersion.java`
#### Snippet
```java
public class JavaVersion {

    private static float javaSpec = 0.0f;

    public static float getJavaSpec() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java

    private static class Timer {
        private long startTime = 0;
        private long endTime = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/timing/BuildTimeEventSpy.java`
#### Snippet
```java
    private static class Timer {
        private long startTime = 0;
        private long endTime = 0;

        public long startTime() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private int doneProjects = 0;
    private String buildStatus;
    private boolean displayDone = false;
    private boolean noBuffering;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    private String threadsFormat;
    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
    private boolean displayDone = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    /** String format for formatting the actual/hidden/max thread counts */
    private String threadsFormat;
    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
public class MvndNativeLoader {

    private static boolean loaded = false;
    private static String nativeLibraryPath;
    private static String nativeLibrarySourceUrl;
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `InputHandler`
in `daemon/src/main/java/org/mvndaemon/mvnd/interactivity/DaemonPrompter.java`
#### Snippet
```java
@Priority(10)
@Typed({ Prompter.class, InputHandler.class, OutputHandler.class })
public class DaemonPrompter extends AbstractInputHandler implements Prompter, InputHandler, OutputHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DaemonPrompter.class);
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
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
### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `exitCode` of exception class
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            extends Exception {
        static final long serialVersionUID = 1L;
        int exitCode;

        ExitException(int exitCode) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
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

### RuleId[ruleID=ZeroLengthArrayInitialization]
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

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(plugin, parent, null, foreignImports,
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
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

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                }

                mavenConfig = cliManager.parse(args.toArray(new String[0]));
                List<?> unrecongized = mavenConfig.getArgList();
                if (!unrecongized.isEmpty()) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
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

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
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
### RuleId[ruleID=UnusedAssignment]
Variable `len` initializer `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
                        StandardCharsets.UTF_8),
                bufSize)) {
            int len = 0;
            char[] buf = new char[bufSize];
            while ((len = in.read(buf)) >= 0) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `exitCode` initializer `0` is redundant
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
        }

        int exitCode = 0;
        boolean noBuffering = batchMode || parameters.noBuffering();
        try (TerminalOutput output = new TerminalOutput(noBuffering, parameters.rollingWindowSize(), logFile)) {
```

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
Variable `readLen` initializer `0` is redundant
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java

    private static String readFully(InputStream in) throws IOException {
        int readLen = 0;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        byte[] buf = new byte[32];
```

### RuleId[ruleID=UnusedAssignment]
Variable `linesPerProject` initializer `0` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    /** String format for formatting the actual/hidden/max thread counts */
    private String threadsFormat;
    private int linesPerProject = 0;
    private int doneProjects = 0;
    private String buildStatus;
```

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
The value `null` assigned to `executionRequestPopulator` is never used
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                        .unmodifiableList(resolver.loadCoreExtensions(cliRequest.request, providedArtifacts, extensions));
            } finally {
                executionRequestPopulator = null;
                container.dispose();
            }
```

### RuleId[ruleID=UnusedAssignment]
Variable `result` initializer `null` is redundant
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                results.add(new DefaultProjectBuildingResult(project, result.getProblems(), resolutionResult));
            } catch (ModelBuildingException e) {
                DefaultProjectBuildingResult result = null;
                if (project == null) {
                    result = new DefaultProjectBuildingResult(e.getModelId(), interimResult.pomFile, e.getProblems());
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
                } else {
                    String opt = Stream.of(prefixes).filter(arg::startsWith)
                            .max(Comparator.comparing(String::length)).get();
                    value = arg.substring(opt.length());
                    if (value.isEmpty()) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java

    private double averageUsage(Collection<GcEvent> events) {
        return events.stream().mapToLong(e -> e.usage.getUsed()).average().getAsDouble();
    }

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `exception` is always 'null'
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
                        ExecutionResult.appendCommand(
                                new StringBuilder("Build exited with non-zero exit code " + exitCode + ": "), args).toString(),
                        exception);
            }
            return this;
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `buildStatus != null` is always `true`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                        .style(AttributedStyle.DEFAULT);

            } else if (buildStatus != null) {
                asb
                        .style(AttributedStyle.BOLD)
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Value `recursive` is always 'true'
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

            if (!build(results, interimResult.modules, projectIndex, moduleFiles, aggregatorFiles, false,
                    recursive, config)) {
                noErrors = false;
            }
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final boolean password;

        public static Prompt read(DataInputStream input) throws IOException {
            String projectId = Message.readUTF(input);
            String uid = Message.readUTF(input);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final int exitCode;

        public static Message read(DataInputStream input) throws IOException {
            int exitCode = input.readInt();
            return new BuildFinished(exitCode);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        }

        public static ExecutionFailureEvent read(DataInputStream input) throws IOException {
            String projectId = readUTF(input);
            boolean halted = input.readBoolean();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final Map<String, String> env;

        public static Message read(DataInputStream input) throws IOException {
            List<String> args = readStringList(input);
            String workingDir = readUTF(input);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String executionId;

        public static MojoStartedEvent read(DataInputStream input) throws IOException {
            final String artifactId = readUTF(input);
            final String pluginGroupId = readUTF(input);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final int artifactIdDisplayLength;

        public static BuildStarted read(DataInputStream input) throws IOException {
            final String projectId = readUTF(input);
            final int projectCount = input.readInt();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String stackTrace;

        public static Message read(DataInputStream input) throws IOException {
            String message = readUTF(input);
            String className = readUTF(input);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `read()` tries to override a static method of a superclass
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        final String message;

        public static Message read(DataInputStream input) throws IOException {
            String projectId = Message.readUTF(input);
            String uid = Message.readUTF(input);
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
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

### RuleId[ruleID=IOResource]
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

### RuleId[ruleID=IOResource]
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

### RuleId[ruleID=IOResource]
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(plugin, parent, null, foreignImports,
```

### RuleId[ruleID=IOResource]
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

### RuleId[ruleID=IOResource]
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
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProcessHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/ProcessHelper.java`
#### Snippet
```java
package org.mvndaemon.mvnd.common;

public class ProcessHelper {

    public static void killChildrenProcesses() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `IoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class IoUtils {
    public static String readResource(ClassLoader cl, String resourcePath) {
        final StringBuilder result = new StringBuilder();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Completion` has only 'static' members, and lacks a 'private' constructor
in `client/src/main/java/org/mvndaemon/mvnd/client/Completion.java`
#### Snippet
```java
import java.nio.file.Path;

public class Completion {

    public static String getCompletion(String shell, DaemonParameters daemonParameters) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AgentHelper` has only 'static' members, and lacks a 'private' constructor
in `helper/src/main/java/org/mvndaemon/mvnd/pump/AgentHelper.java`
#### Snippet
```java
import java.io.PrintStream;

public class AgentHelper {

    public static void pump(InputStream stream, PrintStream out) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SocketHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketHelper.java`
#### Snippet
```java
import java.nio.channels.SocketChannel;

public class SocketHelper {

    public static SocketChannel openUnixSocket() throws IOException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MavenDaemon` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/MavenDaemon.java`
#### Snippet
```java
import java.util.stream.Stream;

public class MavenDaemon {

    public static void main(String[] args) throws Exception {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JavaVersion` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/JavaVersion.java`
#### Snippet
```java
package org.mvndaemon.mvnd.common;

public class JavaVersion {

    private static float javaSpec = 0.0f;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BufferHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
 * https://github.com/classgraph/classgraph/blob/latest/src/main/java/nonapi/io/github/classgraph/utils/FileUtils.java#L543
 */
public class BufferHelper {

    private static boolean PRE_JAVA_9 = System.getProperty("java.specification.version", "9").startsWith("1.");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Holder` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Connection.java`
#### Snippet
```java
    <T extends Message> T request(Message request, Class<T> responseType, Predicate<T> matcher);

    class Holder {
        static Connection CURRENT;
    }
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DaemonExpiration` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonExpiration.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/MasterExpirationStrategy.java
 */
public class DaemonExpiration {

    public interface DaemonExpirationStrategy {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CLibrary` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/CLibrary.java`
#### Snippet
```java
 */
@SuppressWarnings("unused")
public class CLibrary {

    static {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OSInfo` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
 * @author leo
 */
public class OSInfo {

    public static final String X86 = "x86";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProjectComparator` has only 'static' members, and lacks a 'private' constructor
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/ProjectComparator.java`
#### Snippet
```java
 * https://github.com/takari/takari-smart-builder/blob/takari-smart-builder-0.6.1/src/main/java/io/takari/maven/builder/smart/ProjectComparator.java
 */
class ProjectComparator {

    public static Comparator<MavenProject> create(DependencyGraph<MavenProject> graph) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Agent` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/org/mvndaemon/mvnd/agent/Agent.java`
#### Snippet
```java
import javassist.CtClass;

public class Agent {

    public static final String START_WITH_PIPES = "if (redirects != null\n"
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MvndNativeLoader` has only 'static' members, and lacks a 'private' constructor
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
 * usage: call {@link #initialize()} before using mvndnative.
 */
public class MvndNativeLoader {

    private static boolean loaded = false;
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `cl.getResourceAsStream(resourcePath)` might be null
in `common/src/main/java/org/mvndaemon/mvnd/common/IoUtils.java`
#### Snippet
```java
        try (Reader in = new BufferedReader(
                new InputStreamReader(
                        cl.getResourceAsStream(resourcePath),
                        StandardCharsets.UTF_8),
                bufSize)) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `cause instanceof LinkageError` is redundant and can be replaced with a null check
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

                    throw new PluginContainerException(mojoDescriptor, pluginRealm, os.toString(), cause);
                } else if (cause instanceof LinkageError) {
                    ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
                    PrintStream ps = new PrintStream(os);
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `toExternalForm` may produce `NullPointerException`
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            // Load library
            if (loadNativeLibrary(extractedLibFile)) {
                nativeLibrarySourceUrl = MvndNativeLoader.class.getResource(nativeLibraryFilePath).toExternalForm();
                return true;
            }
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonExpirationStatus.java`
#### Snippet
```java
    QUIET_EXPIRE,
    GRACEFUL_EXPIRE,
    IMMEDIATE_EXPIRE;
}

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                    return Long.parseLong(output.get(0).trim());
                } catch (NumberFormatException e) {
                    LOGGER.warn("Could not parse the output of " + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " as a long:\n"
                            + output.stream().collect(Collectors.joining("\n")));
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                    LOGGER.warn("Could not parse the output of " + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " as a long:\n"
                            + output.stream().collect(Collectors.joining("\n")));
                }
            } else {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            final List<String> output = new ArrayList<String>(1);
            exec(cmd, output);
            final List<String> nonEmptyLines = output.stream().filter(l -> !l.isEmpty()).collect(Collectors.toList());
            if (nonEmptyLines.size() >= 2) {
                try {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                    return Long.parseLong(nonEmptyLines.get(1).trim()) / KB;
                } catch (NumberFormatException e) {
                    LOGGER.warn("Could not parse the second line of " + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " output as a long:\n"
                            + nonEmptyLines.stream().collect(Collectors.joining("\n")));
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                    LOGGER.warn("Could not parse the second line of " + Stream.of(cmd).collect(Collectors.joining(" "))
                            + " output as a long:\n"
                            + nonEmptyLines.stream().collect(Collectors.joining("\n")));
                }
            } else {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
        exec(cmd, output);
        List<String> javaHomeLines = output.stream().filter(l -> l.contains(" java.home = "))
                .collect(Collectors.toList());
        if (javaHomeLines.size() == 1) {
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
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
### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve field 'theCaseInsensitiveEnvironment'
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theCaseInsensitiveEnvironmentField = processEnvironmentClass
                    .getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
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
### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public SocketChannel openSocket() throws IOException {
        switch (this) {
        case inet:
            return SocketChannel.open();
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public static String toString(SocketAddress address) {
        switch (familyOf(address)) {
        case inet:
            InetSocketAddress isa = (InetSocketAddress) address;
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java

    public ServerSocketChannel openServerSocket() throws IOException {
        switch (this) {
        case inet:
            return ServerSocketChannel.open().bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
            case PROJECT_LOG_MESSAGE:
                return "ProjectLogMessage";
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

    public static int getClassOrder(Message m) {
        switch (m.getType()) {
        case KEEP_ALIVE:
        case BUILD_REQUEST:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
            case TRANSFER_INITIATED:
                return "TransferInitiated";
```

### RuleId[ruleID=EnhancedSwitchMigration]
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

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
            case PROJECT_STARTED:
                return "ProjectStarted";
```

### RuleId[ruleID=EnhancedSwitchMigration]
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

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java

    private boolean doAccept(Message entry) {
        switch (entry.getType()) {
        case Message.BUILD_STARTED: {
            BuildStarted bs = (BuildStarted) entry;
```

### RuleId[ruleID=EnhancedSwitchMigration]
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
### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            } while (tokenBuffer.remaining() > 0);
        } catch (final IOException e) {
            LOGGER.debug("Discarding EOFException: {}", e.toString(), e);
        }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/SimpleAppender.java`
#### Snippet
```java
            buf.append(ThrowableProxyUtil.asString(tp));
        }
        System.out.print(buf.toString());
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                                                .append(Math.max(0, projectsCount - dispLines))
                                                .append('/')
                                                .append(maxThreads).toString()))
                        .style(AttributedStyle.DEFAULT);

```

## RuleId[ruleID=RegExpUnexpectedAnchor]
### RuleId[ruleID=RegExpUnexpectedAnchor]
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
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
        public boolean asBoolean() {
            final String val = get();
            return "".equals(val) || Boolean.parseBoolean(val);
        }

```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

            // effective line, with indent and reset if end is colored
            line = indent + line + ("".equals(nextColor) ? "" : ANSI_RESET);

            if ((i == lines.length - 1) && (showErrors
```

## RuleId[ruleID=UnnecessaryInitCause]
### RuleId[ruleID=UnnecessaryInitCause]
Unnecessary `Throwable.initCause()` call
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
                    if (result == null || result.getEffectiveModel() == null) {
                        throw (ProjectBuildingException) new ProjectBuildingException(e.getModelId(), e.getMessage(), pomFile)
                                .initCause(e);
                    }
                    // validation error, continue project building and delay failing to help IDEs
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/SimpleAppender.java`
#### Snippet
```java
            buf.append(ThrowableProxyUtil.asString(tp));
        }
        System.out.print(buf.toString());
    }

```

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java
        }

        System.out.print(getNativeLibFolderPathForCurrentOS());
    }

```

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        MavenExecutionResult result = maven.execute(request);

        LoggingOutputStream.forceFlush(System.out);
        LoggingOutputStream.forceFlush(System.err);

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

        LoggingOutputStream.forceFlush(System.out);
        LoggingOutputStream.forceFlush(System.err);

        eventSpyDispatcher.onEvent(result);
```

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

### RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=CharsetObjectCanBeUsed]
### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.ISO_8859_1 can be used instead
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
        public void store(OutputStream out, String comments)
                throws IOException {
            this.store(new OutputStreamWriter(out, "8859_1"), comments);
        }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
                .collect(Collectors.toList());
        if (javaHomeLines.size() == 1) {
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
        }
        return null;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java
                final JavaDocSource<EnumConstantSource> javaDoc = enumConst.getJavaDoc();
                final String javadocText = javaDoc.getText()
                        .replaceAll("&#47;", "/");
                optionsProperties.setProperty(enumConst.getName(), javadocText);
            }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java

    private static String unescape(String val) {
        val = val.replaceAll("\\" + MARKER, "\\$");
        int escape = val.indexOf(ESCAPE_CHAR);
        while (escape >= 0 && escape < val.length() - 1) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/mvndaemon/mvnd/execution/DefaultBuildResumptionDataRepository.java`
#### Snippet
```java
                && StringUtils.isEmpty(request.getResumeFrom())) {
            String propertyValue = properties.getProperty(REMAINING_PROJECTS);
            Stream.of(propertyValue.split(PROPERTY_DELIMITER))
                    .filter(StringUtils::isNotEmpty)
                    .forEach(request.getSelectedProjects()::add);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `native/src/main/java/org/mvndaemon/mvnd/nativ/OSInfo.java`
#### Snippet
```java

    static String translateArchNameToFolderName(String archName) {
        return archName.replaceAll("\\W", "");
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

            if (configFile.isFile()) {
                for (String arg : new String(Files.readAllBytes(configFile.toPath())).split("\\s+")) {
                    if (!arg.isEmpty()) {
                        args.add(arg);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    static int calculateDegreeOfConcurrencyWithCoreMultiplier(String threadConfiguration) {
        int procs = Runtime.getRuntime().availableProcessors();
        return (int) (Float.parseFloat(threadConfiguration.replace("C", "")) * procs);
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        }

        String[] lines = msg.split("(\r\n)|(\r)|(\n)");
        String currentColor = "";

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.nio.file` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/WatchServiceCacheFactory.java`
#### Snippet
```java
                try {
                    mods = new WatchEvent.Modifier[] {
                            com.sun.nio.file.SensitivityWatchEventModifier.HIGH
                    };
                } catch (Throwable t) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        cliRequest.showErrors = cliRequest.debug || cliRequest.commandLine.hasOption(CLIManager.ERRORS);

        ch.qos.logback.classic.Level level;
        if (cliRequest.debug) {
            level = ch.qos.logback.classic.Level.DEBUG;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        ch.qos.logback.classic.Level level;
        if (cliRequest.debug) {
            level = ch.qos.logback.classic.Level.DEBUG;
        } else if (cliRequest.quiet) {
            level = ch.qos.logback.classic.Level.WARN;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        final ch.qos.logback.classic.Logger mvndLogger = (ch.qos.logback.classic.Logger) slf4jLoggerFactory
                .getLogger("org.mvndaemon.mvnd");
        mvndLogger.setLevel(ch.qos.logback.classic.Level.toLevel(System.getProperty("mvnd.log.level"), null));

        // LOG STREAMS
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            ch.qos.logback.classic.Logger stdout = (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stdout");
            ch.qos.logback.classic.Logger stderr = (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stderr");
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            ch.qos.logback.classic.Logger stderr = (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stderr");
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether` is unnecessary, and can be replaced with an import
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java

    @Inject
    private org.eclipse.aether.RepositorySystem repoSystem;

    @Inject
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
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
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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
### RuleId[ruleID=Java8MapApi]
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
### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            stdOut.start();

            this.shutDownHook = new Thread(new Runnable() {
                @Override
                public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new PrivilegedAction() can be replaced with lambda
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java

    static {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            @Override
            public Object run() {
```

### RuleId[ruleID=Convert2Lambda]
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

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nextLineEnd`
in `daemon/src/main/java/org/apache/maven/cli/MvndHelpFormatter.java`
#### Snippet
```java

                } else {
                    nextLineEnd = stringBuilder.length() + lineLength;
                    stringBuilder
                            .append(System.lineSeparator())
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java

    private static String unescape(String val) {
        val = val.replaceAll("\\" + MARKER, "\\$");
        int escape = val.indexOf(ESCAPE_CHAR);
        while (escape >= 0 && escape < val.length() - 1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cycleMap`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            throws IllegalArgumentException {
        if (cycleMap == null) {
            cycleMap = new HashMap<>();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        // the variable, and the trailing characters to get the new
        // value.
        val = val.substring(0, startDelim) + substValue + val.substring(stopDelim + DELIM_STOP.length());

        // Now perform substitution again, since there could still
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
        // Now perform substitution again, since there could still
        // be substitutions to make.
        val = doSubstVars(val, currentKey, cycleMap, configProps, callback, substituteFromConfig,
                defaultsToEmptyString);

```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parent`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = PARENT_CLASSLOADER;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parentImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (parentImports != null) {
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parentImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `foreignImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java

        if (foreignImports != null) {
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `foreignImports`
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parent`
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = new URLClassLoader(new URL[0]);
        }
        pluginRealm = classRealmManager.createPluginRealm(plugin, parent, null, foreignImports,
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `indent`
in `daemon/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        }

        indent += "  ";

        for (ExceptionSummary child : summary.getChildren()) {
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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
### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            return javaHomeLines.get(0).trim().replaceFirst("java.home = ", "");
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DefaultClient.java`
#### Snippet
```java
        Duration purgeLogPeriod = parameters.purgeLogPeriod();
        if (!Files.isDirectory(storage) || !TimeUtils.isPositive(purgeLogPeriod)) {
            return null;
        }
        String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").withZone(ZoneId.systemDefault()).format(Instant.now());
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
                result = Environment.cygpath(result);
            }
            return result == null ? null : Paths.get(result);
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonParameters.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            LOGGER.debug("Cannot connect to daemon {} due to {}. Ignoring.", daemon, e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/impl/TimestampCacheFactory.java`
#### Snippet
```java
                return v;
            });
            return record != null ? record.record : null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingExtensionRealmCache.java`
#### Snippet
```java
    public CacheRecord get(Key key) {
        Record r = cache.get(key);
        return r != null ? r.record : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingProjectArtifactsCache.java`
#### Snippet
```java
            return r.record;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
    public CacheRecord get(Key key) {
        Record r = cache.get(key);
        return r != null ? r.record : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginArtifactsCache.java`
#### Snippet
```java
            return r.record;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
    public PluginDescriptor get(Key key) {
        Record r = cache.get(key);
        return r != null ? clone(r.descriptor) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonMemoryStatus.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/ClientDispatcher.java`
#### Snippet
```java

    static String trimTrailingEols(String message) {
        return message == null ? null : TRAILING_EOLS_PATTERN.matcher(message).replaceFirst("");
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLogger.java`
#### Snippet
```java
     */
    public Logger getChildLogger(String name) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
        Collection<TransferEvent> transfers = this.transfers.getOrDefault(projectId, Collections.emptyMap()).values();
        if (transfers.isEmpty()) {
            return null;
        }
        TransferEvent event = transfers.iterator().next();
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `daemon/src/main/java/org/apache/maven/project/CachingProjectBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
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

### RuleId[ruleID=AssignmentToLambdaParameter]
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

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
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

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `process` is redundant
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.environment().put(Environment.JDK_JAVA_OPTIONS.getEnvironmentVariable(), parameters.jdkJavaOpts());
            Process process = processBuilder
                    .directory(workingDir.toFile())
                    .command(args)
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `parent` is redundant
in `daemon/src/main/java/org/apache/maven/classrealm/MvndClassRealmManager.java`
#### Snippet
```java
        Objects.requireNonNull(plugin, "plugin cannot be null");

        ClassLoader parent = PARENT_CLASSLOADER;

        Map<String, ClassLoader> foreignImports = Collections.<String, ClassLoader> singletonMap("", getMavenApiRealm());
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `pluginDescriptor` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/plugin/CliMavenPluginManager.java`
#### Snippet
```java
            Reader reader = ReaderFactory.newXmlReader(is);

            PluginDescriptor pluginDescriptor = builder.build(reader, descriptorLocation);

            return pluginDescriptor;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/builder/DependencyGraph.java`
#### Snippet
```java

        List<K> ensembleWithChildrenOf(List<K> list, K node) {
            final List<K> result = Stream.concat(
                    list.stream().filter(k -> !Objects.equals(k, node)),
                    graph.getDownstreamProjects(node)
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
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

### RuleId[ruleID=BusyWait]
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

### RuleId[ruleID=BusyWait]
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

## RuleId[ruleID=ClassCanBeRecord]
### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonStopEvent.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonStopEvent.java
 */
public class DaemonStopEvent implements Serializable {

    private final String daemonId;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/context/DaemonCompatibilitySpec.java
 */
public class DaemonCompatibilitySpec {

    private final Path javaHome;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `common/src/main/java/org/mvndaemon/mvnd/common/Environment.java`
#### Snippet
```java
    }

    public static class DocumentedEnumEntry<E> {

        private final E entry;
```

## RuleId[ruleID=ThreadStartInConstruction]
### RuleId[ruleID=ThreadStartInConstruction]
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

### RuleId[ruleID=ThreadStartInConstruction]
Call to `start()` during object construction
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
            this.process = process;
            this.stdOut = new StreamGobbler(process.getInputStream(), outputConsumer);
            stdOut.start();

            this.shutDownHook = new Thread(new Runnable() {
```

### RuleId[ruleID=ThreadStartInConstruction]
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

