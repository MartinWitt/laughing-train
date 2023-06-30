# maven-mvnd 
 
# Bad smells
I found 177 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 34 | false |
| JavadocLinkAsPlainText | 18 | false |
| DataFlowIssue | 17 | false |
| JavadocDeclaration | 12 | false |
| UnusedAssignment | 10 | false |
| AutoCloseableResource | 7 | false |
| FieldMayBeFinal | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| IgnoreResultOfCall | 6 | false |
| JavadocReference | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| ConstantValue | 4 | false |
| TrivialIf | 3 | false |
| ThrowablePrintedToSystemOut | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| BusyWait | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| UnnecessaryModifier | 2 | true |
| CommentedOutCode | 2 | false |
| IOStreamConstructor | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| RedundantTypeArguments | 2 | false |
| FieldCanBeLocal | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| LoopConditionNotUpdatedInsideLoop | 1 | false |
| UnnecessarySemicolon | 1 | false |
| EmptyStatementBody | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| CStyleArrayDeclaration | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| RegExpUnexpectedAnchor | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| SlowListContainsAll | 1 | false |
| InfiniteLoopStatement | 1 | false |
| RedundantCast | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                .setName("maven");

        Set<String> exportedArtifacts = new HashSet<>(coreEntry.getExportedArtifacts());
        Set<String> exportedPackages = new HashSet<>(coreEntry.getExportedPackages());
        for (CoreExtensionEntry extension : extensionsEntries) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

        Set<String> exportedArtifacts = new HashSet<>(coreEntry.getExportedArtifacts());
        Set<String> exportedPackages = new HashSet<>(coreEntry.getExportedPackages());
        for (CoreExtensionEntry extension : extensionsEntries) {
            exportedArtifacts.addAll(extension.getExportedArtifacts());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator\>'
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java

        public Set<Map.Entry<Object, Object>> entrySet() {
            Comparator<Map.Entry<Object, Object>> comparator = Comparator.comparing(e -> (Comparable) e.getKey());
            final Set<Map.Entry<Object, Object>> result = new TreeSet<>(comparator);
            result.addAll(super.entrySet());
```

### UNCHECKED_WARNING
Unchecked method 'comparing(Function)' invocation
in `build-plugin/src/main/java/org/mvndaemon/mvnd/plugin/doc/DocMojo.java`
#### Snippet
```java

        public Set<Map.Entry<Object, Object>> entrySet() {
            Comparator<Map.Entry<Object, Object>> comparator = Comparator.comparing(e -> (Comparable) e.getKey());
            final Set<Map.Entry<Object, Object>> result = new TreeSet<>(comparator);
            result.addAll(super.entrySet());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                .setName("maven");

        Set<String> exportedArtifacts = new HashSet<>(coreEntry.getExportedArtifacts());
        Set<String> exportedPackages = new HashSet<>(coreEntry.getExportedPackages());
        for (CoreExtensionEntry extension : extensionsEntries) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

        Set<String> exportedArtifacts = new HashSet<>(coreEntry.getExportedArtifacts());
        Set<String> exportedPackages = new HashSet<>(coreEntry.getExportedPackages());
        for (CoreExtensionEntry extension : extensionsEntries) {
            exportedArtifacts.addAll(extension.getExportedArtifacts());
```

## RuleId[id=LoopConditionNotUpdatedInsideLoop]
### LoopConditionNotUpdatedInsideLoop
Variable 'stopDelim' is not updated inside loop
in `common/src/main/java/org/mvndaemon/mvnd/common/InterpolationHelper.java`
#### Snippet
```java
            // greater than the stop delimiter we have found.
            startDelim = val.indexOf(DELIM_START);
            while (stopDelim >= 0) {
                int idx = val.indexOf(DELIM_START, startDelim + DELIM_START.length());
                if ((idx < 0) || (idx > stopDelim)) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `waitFor(long, TimeUnit, String[])`
in `common/src/main/java/org/mvndaemon/mvnd/common/OsUtils.java`
#### Snippet
```java
    /**
     * A simple wrapper over {@link Process} that manages its destroying and offers Java 8-like
     * {@link #waitFor(long, TimeUnit, String[])} with timeout.
     */
    public static class CommandProcess implements AutoCloseable {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.internal.impl.synccontext.named.NamedLockFactoryAdapterFactoryImpl`
in `daemon/src/main/java/org/mvndaemon/mvnd/syncontext/DaemonNamedLockFactoryAdapterFactoryImpl.java`
#### Snippet
```java
/**
 * Mvnd named lock factory implementation: it differs from
 * {@link org.eclipse.aether.internal.impl.synccontext.named.NamedLockFactoryAdapterFactoryImpl} only by default values.
 */
@Singleton
```

### JavadocReference
Cannot resolve symbol `Terminal`
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
    /**
     * A {@link ClientLog} that first collects all incoming messages in a {@link List} and outputs them to a JLine
     * {@link Terminal} upon {@link #close()}.
     */
    class MessageCollector implements ClientLog {
```

### JavadocReference
Cannot resolve symbol `ILoggerFactory`
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLoggerManager.java`
#### Snippet
```java

/**
 * Use an SLF4J {@link ILoggerFactory} as a backing for a Plexus
 * {@link LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
```

### JavadocReference
Cannot resolve symbol `LoggerManager`
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLoggerManager.java`
#### Snippet
```java
/**
 * Use an SLF4J {@link ILoggerFactory} as a backing for a Plexus
 * {@link LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
 *
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `e.getCause() instanceof PluginResolutionException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
            return r.record;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginContainerException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof PluginContainerException) {
                throw (PluginContainerException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginDescriptorParsingException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
            return clone(r.descriptor);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginDescriptorParsingException) {
                throw (PluginDescriptorParsingException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginResolutionException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
                throw (PluginDescriptorParsingException) e.getCause();
            }
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof InvalidPluginDescriptorException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof InvalidPluginDescriptorException) {
                throw (InvalidPluginDescriptorException) e.getCause();
            }
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

### DataFlowIssue
Condition `exception instanceof LifecycleExecutionException` is redundant and can be replaced with a null check
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                logSummary(summary, references, "", cliRequest.showErrors);

                if (exception instanceof LifecycleExecutionException) {
                    MavenProject project = ((LifecycleExecutionException) exception).getProject();
                    if (project != null) {
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
Condition `e.getCause() instanceof PluginResolutionException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
            return r.record;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginContainerException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof PluginContainerException) {
                throw (PluginContainerException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginDescriptorParsingException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
            return clone(r.descriptor);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginDescriptorParsingException) {
                throw (PluginDescriptorParsingException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof PluginResolutionException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
                throw (PluginDescriptorParsingException) e.getCause();
            }
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
```

### DataFlowIssue
Condition `e.getCause() instanceof InvalidPluginDescriptorException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof InvalidPluginDescriptorException) {
                throw (InvalidPluginDescriptorException) e.getCause();
            }
```

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
Condition `exception instanceof LifecycleExecutionException` is redundant and can be replaced with a null check
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                logSummary(summary, references, "", cliRequest.showErrors);

                if (exception instanceof LifecycleExecutionException) {
                    MavenProject project = ((LifecycleExecutionException) exception).getProject();
                    if (project != null) {
```

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=EmptyStatementBody]
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

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
        @Override
        public String toString() {
            return "InputResponse{" + "data='" + data + "\'" + '}';
        }

```

## RuleId[id=CStyleArrayDeclaration]
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=JavaReflectionMemberAccess]
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

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
            case PRINT_OUT:
            case PRINT_ERR:
                return StringMessage.read(type, input);
            case REQUEST_INPUT:
                return RequestInput.read(input);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java

        private String mnemonic() {
            switch (type) {
                case PROJECT_LOG_MESSAGE:
                    return "ProjectLogMessage";
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
            if (i == cnt) {
                cnt = input.read(byteBuf, 0, Math.min(UTF_BUFS_BYTE_CNT, len - charIdx));
                if (cnt < 0) {
                    throw new EOFException();
                }
                i = 0;
            }
            final int a = byteBuf[i++] & 0xff;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/mvndaemon/mvnd/common/logging/TerminalOutput.java`
#### Snippet
```java
                projects.values().stream().flatMap(p -> p.log.stream()).forEach(log);
                clearDisplay();
                try {
                    log.close();
                } catch (IOException e1) {
                    throw new RuntimeException(e1);
                }
                final AttributedStyle s = new AttributedStyle().bold().foreground(AttributedStyle.RED);
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        this.buildEventListener = buildEventListener;
        try {
            CliRequest req = new CliRequest(null, null);
            req.args = arguments.toArray(new String[0]);
            req.workingDirectory = new File(workingDirectory).getCanonicalPath();
            req.multiModuleProjectDirectory = new File(projectDirectory);
            return doMain(req, clientEnv);
        } finally {
            this.buildEventListener = BuildEventListener.dummy();
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        Properties props = (Properties) System.getProperties().clone();
        ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(container.getContainerRealm());
            initialize(cliRequest);
            environment(cliRequest.workingDirectory, clientEnv);
            cli(cliRequest);
            properties(cliRequest);
            logging(cliRequest);
            informativeCommands(cliRequest);
            version(cliRequest);
            container(cliRequest);
            configure(cliRequest, eventSpyDispatcher, configurationProcessors);
            toolchains(cliRequest);
            populateRequest(cliRequest);
            encryption(cliRequest);
            return execute(cliRequest);
        } catch (ExitException e) {
            return e.exitCode;
        } finally {
            eventSpyDispatcher.close();
            System.setProperties(props);
            Thread.currentThread().setContextClassLoader(tccl);
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        cliRequest.classWorld = classWorld;

        if (cliRequest.workingDirectory == null) {
            cliRequest.workingDirectory = System.getProperty("user.dir");
        }

        if (cliRequest.multiModuleProjectDirectory == null) {
            buildEventListener.log(String.format("-D%s system property is not set.", MULTIMODULE_PROJECT_DIRECTORY));
            throw new ExitException(1);
        }
        System.setProperty("maven.multiModuleProjectDirectory", cliRequest.multiModuleProjectDirectory.toString());
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        CLIManager cliManager = newCLIManager();

        CommandLine mavenConfig = null;
        try {
            File configFile = new File(cliRequest.multiModuleProjectDirectory, MVN_MAVEN_CONFIG);

            if (configFile.isFile()) {
                try (Stream<String> lines = Files.lines(configFile.toPath(), Charset.defaultCharset())) {
                    String[] args = lines.filter(arg -> !arg.isEmpty()).toArray(String[]::new);
                    mavenConfig = cliManager.parse(args);
                    List<?> unrecognized = mavenConfig.getArgList();
                    if (!unrecognized.isEmpty()) {
                        // This file can only contain options, not args (goals or phases)
                        throw new ParseException("Unrecognized maven.config file entries: " + unrecognized);
                    }
                }
            }
        } catch (ParseException e) {
            buildEventListener.log("Unable to parse maven.config: " + e.getMessage());
            buildEventListener.log("Run 'mvnd --help' for available options.");
            throw new ExitException(1);
        }

        try {
            if (mavenConfig == null) {
                cliRequest.commandLine = cliManager.parse(cliRequest.args);
            } else {
                cliRequest.commandLine = cliMerge(cliManager.parse(cliRequest.args), mavenConfig);
            }
        } catch (ParseException e) {
            buildEventListener.log("Unable to parse command line options: " + e.getMessage());
            buildEventListener.log("Run 'mvnd --help' for available options.");
            throw new ExitException(1);
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (cliRequest.commandLine.hasOption(CLIManager.HELP)) {
            buildEventListener.log(MvndHelpFormatter.displayHelp(newCLIManager()));
            throw new ExitException(0);
        }

        if (cliRequest.commandLine.hasOption(CLIManager.VERSION)) {
            if (cliRequest.commandLine.hasOption(CLIManager.QUIET)) {
                buildEventListener.log(CLIReportingUtils.showVersionMinimal());
            } else {
                buildEventListener.log(CLIReportingUtils.showVersion());
            }
            throw new ExitException(0);
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        CommandLine.Builder commandLineBuilder = new CommandLine.Builder();

        // the args are easy, cli first then config file
        for (String arg : mavenArgs.getArgs()) {
            commandLineBuilder.addArg(arg);
        }
        for (String arg : mavenConfig.getArgs()) {
            commandLineBuilder.addArg(arg);
        }

        // now add all options, except for -D with cli first then config file
        List<Option> setPropertyOptions = new ArrayList<>();
        for (Option opt : mavenArgs.getOptions()) {
            if (String.valueOf(CLIManager.SET_SYSTEM_PROPERTY).equals(opt.getOpt())) {
                setPropertyOptions.add(opt);
            } else {
                commandLineBuilder.addOption(opt);
            }
        }
        for (Option opt : mavenConfig.getOptions()) {
            commandLineBuilder.addOption(opt);
        }
        // finally add the CLI system properties
        for (Option opt : setPropertyOptions) {
            commandLineBuilder.addOption(opt);
        }
        return commandLineBuilder.build();
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
((ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(level);

        // LOG COLOR
        String styleColor = cliRequest.getUserProperties().getProperty(STYLE_COLOR_PROPERTY, "auto");
        if ("always".equals(styleColor)) {
            MessageUtils.setColorEnabled(true);
        } else if ("never".equals(styleColor)) {
            MessageUtils.setColorEnabled(false);
        } else if (!"auto".equals(styleColor)) {
            throw new IllegalArgumentException("Invalid color configuration option [" + styleColor
                    + "]. Supported values are (auto|always|never).");
        } else if (cliRequest.commandLine.hasOption(CLIManager.BATCH_MODE)
                || cliRequest.commandLine.hasOption(CLIManager.LOG_FILE)) {
            MessageUtils.setColorEnabled(false);
        }

        // Workaround for https://github.com/apache/maven-mvnd/issues/39
        final ch.qos.logback.classic.Logger mvndLogger =
                (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("org.mvndaemon.mvnd");
        mvndLogger.setLevel(ch.qos.logback.classic.Level.toLevel(System.getProperty("mvnd.log.level"), null));

        // LOG STREAMS
        if (cliRequest.commandLine.hasOption(CLIManager.LOG_FILE)) {
            File logFile = new File(cliRequest.commandLine.getOptionValue(CLIManager.LOG_FILE));
            logFile = resolveFile(logFile, cliRequest.workingDirectory);

            // redirect stdout and stderr to file
            try {
                PrintStream ps = new PrintStream(new FileOutputStream(logFile), true);
                System.setOut(ps);
                System.setErr(ps);
            } catch (FileNotFoundException e) {
                //
                // Ignore
                //
            }
        } else if (!Environment.MVND_RAW_STREAMS
                .asOptional()
                .map(Boolean::parseBoolean)
                .orElse(Boolean.FALSE)) {
            ch.qos.logback.classic.Logger stdout =
                    (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stdout");
            ch.qos.logback.classic.Logger stderr =
                    (ch.qos.logback.classic.Logger) slf4jLoggerFactory.getLogger("stderr");
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (cliRequest.showErrors) {
            slf4jLogger.info("Error stacktraces are turned on.");
        }

        if (MavenExecutionRequest.CHECKSUM_POLICY_WARN.equals(cliRequest.request.getGlobalChecksumPolicy())) {
            slf4jLogger.info("Disabling strict checksum verification on all artifact downloads.");
        } else if (MavenExecutionRequest.CHECKSUM_POLICY_FAIL.equals(cliRequest.request.getGlobalChecksumPolicy())) {
            slf4jLogger.info("Enabling strict checksum verification on all artifact downloads.");
        }

        if (slf4jLogger.isDebugEnabled()) {
            slf4jLogger.debug("Message scheme: {}", (MessageUtils.isColorEnabled() ? "color" : "plain"));
            if (MessageUtils.isColorEnabled()) {
                MessageBuilder buff = MessageUtils.buffer();
                buff.a("Message styles: ");
                buff.a(MessageUtils.level().debug("debug")).a(' ');
                buff.a(MessageUtils.level().info("info")).a(' ');
                buff.a(MessageUtils.level().warning("warning")).a(' ');
                buff.a(MessageUtils.level().error("error")).a(' ');

                buff.success("success").a(' ');
                buff.failure("failure").a(' ');
                buff.strong("strong").a(' ');
                buff.mojo("mojo").a(' ');
                buff.project("project");
                slf4jLogger.debug(buff.toString());
            }
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        Map<String, Object> data = new HashMap<>();
        data.put("plexus", container);
        data.put("workingDirectory", cliRequest.workingDirectory);
        data.put("systemProperties", cliRequest.systemProperties);
        data.put("userProperties", cliRequest.userProperties);
        data.put("versionProperties", CLIReportingUtils.getBuildProperties());
        eventSpyDispatcher.init(() -> data);
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
ClassRealm coreRealm = classWorld.getClassRealm("plexus.core");
        if (coreRealm == null) {
            coreRealm = classWorld.getRealms().iterator().next();
        }

        List<File> extClassPath = Stream.of(
                        Environment.MVND_EXT_CLASSPATH.asString().split(","))
                .filter(s -> s != null && !s.isEmpty())
                .map(File::new)
                .collect(Collectors.toList());

        CoreExtensionEntry coreEntry = CoreExtensionEntry.discoverFrom(coreRealm);

        List<CoreExtension> extensions = Stream.of(
                        Environment.MVND_CORE_EXTENSIONS.asString().split(";"))
                .filter(s -> s != null && !s.isEmpty())
                .map(s -> {
                    String[] parts = s.split(":");
                    CoreExtension ce = new CoreExtension();
                    ce.setGroupId(parts[0]);
                    ce.setArtifactId(parts[1]);
                    ce.setVersion(parts[2]);
                    return ce;
                })
                .collect(Collectors.toList());
        List<CoreExtensionEntry> extensionsEntries =
                loadCoreExtensions(extensions, coreRealm, coreEntry.getExportedArtifacts());
        ClassRealm containerRealm = setupContainerRealm(classWorld, coreRealm, extClassPath, extensionsEntries);

        ContainerConfiguration cc = new DefaultContainerConfiguration()
                .setClassWorld(classWorld)
                .setRealm(containerRealm)
                .setClassPathScanning(PlexusConstants.SCANNING_INDEX)
                .setAutoWiring(true)
                .setJSR250Lifecycle(true)
                .setName("maven");

        Set<String> exportedArtifacts = new HashSet<>(coreEntry.getExportedArtifacts());
        Set<String> exportedPackages = new HashSet<>(coreEntry.getExportedPackages());
        for (CoreExtensionEntry extension : extensionsEntries) {
            exportedArtifacts.addAll(extension.getExportedArtifacts());
            exportedPackages.addAll(extension.getExportedPackages());
        }
        exportedPackages.add("org.codehaus.plexus.components.interactivity");
        exportedPackages.add("org.mvndaemon.mvnd.interactivity");
        exportedArtifacts.add("org.codehaus.plexus:plexus-interactivity-api");

        final CoreExports exports = new CoreExports(containerRealm, exportedArtifacts, exportedPackages);
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        container.setLookupRealm(null);
        Thread.currentThread().setContextClassLoader(container.getContainerRealm());

        container.setLoggerManager(plexusLoggerManager);

        for (CoreExtensionEntry extension : extensionsEntries) {
            container.discoverComponents(
                    extension.getClassRealm(),
                    new SessionScopeModule(container),
                    new MojoExecutionScopeModule(container));
        }
        return container;
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            if (extensions.isEmpty()) {
                return Collections.emptyList();
            }
            ContainerConfiguration cc = new DefaultContainerConfiguration() //
                    .setClassWorld(classWorld) //
                    .setRealm(containerRealm) //
                    .setClassPathScanning(PlexusConstants.SCANNING_INDEX) //
                    .setAutoWiring(true) //
                    .setJSR250Lifecycle(true) //
                    .setName("maven");

            DefaultPlexusContainer container = new DefaultPlexusContainer(cc, new AbstractModule() {
                @Override
                protected void configure() {
                    bind(ILoggerFactory.class).toInstance(slf4jLoggerFactory);
                }
            });
            MavenExecutionRequestPopulator executionRequestPopulator = null;
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                CliRequest cliRequest = new CliRequest(new String[0], classWorld);
                cliRequest.commandLine = new CommandLine.Builder().build();
                container.setLookupRealm(null);
                container.setLoggerManager(plexusLoggerManager);
                container.getLoggerManager().setThresholds(cliRequest.request.getLoggingLevel());
                Thread.currentThread().setContextClassLoader(container.getContainerRealm());
                executionRequestPopulator = container.lookup(MavenExecutionRequestPopulator.class);
                final Map<String, ConfigurationProcessor> configurationProcessors =
                        container.lookupMap(ConfigurationProcessor.class);
                final EventSpyDispatcher eventSpyDispatcher = container.lookup(EventSpyDispatcher.class);
                properties(cliRequest);
                configure(cliRequest, eventSpyDispatcher, configurationProcessors);
                LoggingExecutionListener executionListener = container.lookup(LoggingExecutionListener.class);
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
            ClassRealm extRealm = classWorld.newRealm("maven.ext", null);
            extRealm.setParentRealm(coreRealm);
            slf4jLogger.debug("Populating class realm {}", extRealm.getId());
            for (File file : extClassPath) {

                extRealm.addURL(file.toURI().toURL());
            }
            for (CoreExtensionEntry entry : reverse(extensions)) {
                Set<String> exportedPackages = entry.getExportedPackages();
                ClassRealm realm = entry.getClassRealm();
                for (String exportedPackage : exportedPackages) {
                    extRealm.importFrom(realm, exportedPackage);
                }
                if (exportedPackages.isEmpty()) {
                    // sisu uses realm imports to establish component visibility
                    extRealm.importFrom(realm, realm.getId());
                }
            }
            return extRealm;
        }
        return coreRealm;
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        String extClassPath = cliRequest.userProperties.getProperty(EXT_CLASS_PATH);
        if (extClassPath == null) {
            extClassPath = cliRequest.systemProperties.getProperty(EXT_CLASS_PATH);
        }

        List<File> jars = new ArrayList<>();

        if (extClassPath != null) {
            for (String jar : extClassPath.split(File.pathSeparator)) {
                File file = resolveFile(new File(jar), cliRequest.workingDirectory);
                slf4jLogger.debug("  Included {}", file);
                jars.add(file);
            }
        }

        return jars;
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        commands(cliRequest);

        MavenExecutionRequest request = executionRequestPopulator.populateDefaults(cliRequest.request);

        eventSpyDispatcher.onEvent(request);

        slf4jLogger.info(buffer().a("Processing build on daemon ")
                .strong(Environment.MVND_ID.asString())
                .toString());

        MavenExecutionResult result = maven.execute(request);

        LoggingOutputStream.forceFlush(System.out);
        LoggingOutputStream.forceFlush(System.err);

        eventSpyDispatcher.onEvent(result);
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            ExceptionHandler handler = new DefaultExceptionHandler();

            Map<String, String> references = new LinkedHashMap<>();

            List<MavenProject> failedProjects = new ArrayList<>();

            for (Throwable exception : result.getExceptions()) {
                ExceptionSummary summary = handler.handleException(exception);

                logSummary(summary, references, "", cliRequest.showErrors);

                if (exception instanceof LifecycleExecutionException) {
                    MavenProject project = ((LifecycleExecutionException) exception).getProject();
                    if (project != null) {
                        failedProjects.add(project);
                    }
                }
            }

            slf4jLogger.error("");

            if (!cliRequest.showErrors) {
                slf4jLogger.error(
                        "To see the full stack trace of the errors, re-run Maven with the {} switch.",
                        buffer().strong("-e"));
            }
            if (!slf4jLogger.isDebugEnabled()) {
                slf4jLogger.error(
                        "Re-run Maven using the {} switch to enable full debug logging.", buffer().strong("-X"));
            }

            if (!references.isEmpty()) {
                slf4jLogger.error("");
                slf4jLogger.error("For more information about the errors and possible solutions"
                        + ", please read the following articles:");

                for (Entry<String, String> entry : references.entrySet()) {
                    slf4jLogger.error("{} {}", buffer().strong(entry.getValue()), entry.getKey());
                }
            }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            } else if (!failedProjects.isEmpty()) {
                List<MavenProject> sortedProjects = result.getTopologicallySortedProjects();

                // Sort the failedProjects list in the topologically sorted order.
                failedProjects.sort(comparing(sortedProjects::indexOf));

                MavenProject firstFailedProject = failedProjects.get(0);
                if (!firstFailedProject.equals(sortedProjects.get(0))) {
                    String resumeFromSelector = getResumeFromSelector(sortedProjects, firstFailedProject);
                    logBuildResumeHint("mvn <args> -rf " + resumeFromSelector);
                }
            }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        String msg = summary.getMessage();

        if (!summary.getReference().isEmpty()) {
            String referenceKey =
                    references.computeIfAbsent(summary.getReference(), k -> "[Help " + (references.size() + 1) + "]");
            if (msg.indexOf('\n') < 0) {
                msg += " -> " + buffer().strong(referenceKey);
            } else {
                msg += "\n-> " + buffer().strong(referenceKey);
            }
        }

        String[] lines = msg.split("(\r\n)|(\r)|(\n)");
        String currentColor = "";

        for (int i = 0; i < lines.length; i++) {
            // add eventual current color inherited from previous line
            String line = currentColor + lines[i];

            // look for last ANSI escape sequence to check if nextColor
            Matcher matcher = LAST_ANSI_SEQUENCE.matcher(line);
            String nextColor = "";
            if (matcher.find()) {
                nextColor = matcher.group(1);
                if (ANSI_RESET.equals(nextColor)) {
                    // last ANSI escape code is reset: no next color
                    nextColor = "";
                }
            }

            // effective line, with indent and reset if end is colored
            line = indent + line + ("".equals(nextColor) ? "" : ANSI_RESET);

            if ((i == lines.length - 1) && (showErrors || (summary.getException() instanceof InternalErrorException))) {
                slf4jLogger.error(line, summary.getException());
            } else {
                slf4jLogger.error(line);
            }

            currentColor = nextColor;
        }

        indent += "  ";

        for (ExceptionSummary child : summary.getChildren()) {
            logSummary(child, references, indent, showErrors);
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
cliRequest.request.setEventSpyDispatcher(eventSpyDispatcher);

        //
        // We expect at most 2 implementations to be available. The SettingsXmlConfigurationProcessor implementation
        // is always available in the core and likely always will be, but we may have another ConfigurationProcessor
        // present supplied by the user. The rule is that we only allow the execution of one ConfigurationProcessor.
        // If there is more than one then we execute the one supplied by the user, otherwise we execute the
        // the default SettingsXmlConfigurationProcessor.
        //
        int userSuppliedConfigurationProcessorCount = configurationProcessors.size() - 1;

        if (userSuppliedConfigurationProcessorCount == 0) {
            //
            // Our settings.xml source is historically how we have configured Maven from the CLI so we are going to
            // have to honour its existence forever. So let's run it.
            //
            configurationProcessors.get(SettingsXmlConfigurationProcessor.HINT).process(cliRequest);
        } else if (userSuppliedConfigurationProcessorCount == 1) {
            //
            // Run the user supplied ConfigurationProcessor
            //
            for (Entry<String, ConfigurationProcessor> entry : configurationProcessors.entrySet()) {
                String hint = entry.getKey();
                if (!hint.equals(SettingsXmlConfigurationProcessor.HINT)) {
                    ConfigurationProcessor configurationProcessor = entry.getValue();
                    configurationProcessor.process(cliRequest);
                }
            }
        } else if (userSuppliedConfigurationProcessorCount > 1) {
            //
            // There are too many ConfigurationProcessors so we don't know which one to run so report the error.
            //
            StringBuilder sb = new StringBuilder(String.format(
                    "\nThere can only be one user supplied ConfigurationProcessor, there are %s:\n\n",
                    userSuppliedConfigurationProcessorCount));
            for (Entry<String, ConfigurationProcessor> entry : configurationProcessors.entrySet()) {
                String hint = entry.getKey();
                if (!hint.equals(SettingsXmlConfigurationProcessor.HINT)) {
                    ConfigurationProcessor configurationProcessor = entry.getValue();
                    sb.append(String.format(
                            "%s\n", configurationProcessor.getClass().getName()));
                }
            }
            sb.append("\n");
            throw new Exception(sb.toString());
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
File userToolchainsFile;

        if (cliRequest.commandLine.hasOption(CLIManager.ALTERNATE_USER_TOOLCHAINS)) {
            userToolchainsFile = new File(cliRequest.commandLine.getOptionValue(CLIManager.ALTERNATE_USER_TOOLCHAINS));
            userToolchainsFile = resolveFile(userToolchainsFile, cliRequest.workingDirectory);

            if (!userToolchainsFile.isFile()) {
                throw new FileNotFoundException(
                        "The specified user toolchains file does not exist: " + userToolchainsFile);
            }
        } else {
            userToolchainsFile = DEFAULT_USER_TOOLCHAINS_FILE;
        }

        File globalToolchainsFile;

        if (cliRequest.commandLine.hasOption(CLIManager.ALTERNATE_GLOBAL_TOOLCHAINS)) {
            globalToolchainsFile =
                    new File(cliRequest.commandLine.getOptionValue(CLIManager.ALTERNATE_GLOBAL_TOOLCHAINS));
            globalToolchainsFile = resolveFile(globalToolchainsFile, cliRequest.workingDirectory);

            if (!globalToolchainsFile.isFile()) {
                throw new FileNotFoundException(
                        "The specified global toolchains file does not exist: " + globalToolchainsFile);
            }
        } else {
            globalToolchainsFile = DEFAULT_GLOBAL_TOOLCHAINS_FILE;
        }

        cliRequest.request.setGlobalToolchainsFile(globalToolchainsFile);
        cliRequest.request.setUserToolchainsFile(userToolchainsFile);

        DefaultToolchainsBuildingRequest toolchainsRequest = new DefaultToolchainsBuildingRequest();
        if (globalToolchainsFile.isFile()) {
            toolchainsRequest.setGlobalToolchainsSource(new FileSource(globalToolchainsFile));
        }
        if (userToolchainsFile.isFile()) {
            toolchainsRequest.setUserToolchainsSource(new FileSource(userToolchainsFile));
        }

        eventSpyDispatcher.onEvent(toolchainsRequest);

        slf4jLogger.debug(
                "Reading global toolchains from {}",
                getLocation(toolchainsRequest.getGlobalToolchainsSource(), globalToolchainsFile));
        slf4jLogger.debug(
                "Reading user toolchains from {}",
                getLocation(toolchainsRequest.getUserToolchainsSource(), userToolchainsFile));

        ToolchainsBuildingResult toolchainsResult = toolchainsBuilder.build(toolchainsRequest);

        eventSpyDispatcher.onEvent(toolchainsResult);

        executionRequestPopulator.populateFromToolchains(cliRequest.request, toolchainsResult.getEffectiveToolchains());

        if (!toolchainsResult.getProblems().isEmpty() && slf4jLogger.isWarnEnabled()) {
            slf4jLogger.warn("");
            slf4jLogger.warn("Some problems were encountered while building the effective toolchains");

            for (Problem problem : toolchainsResult.getProblems()) {
                slf4jLogger.warn("{} @ {}", problem.getMessage(), problem.getLocation());
            }

            slf4jLogger.warn("");
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            if (profileOptionValues != null) {
                for (String profileOptionValue : profileOptionValues) {
                    StringTokenizer profileTokens = new StringTokenizer(profileOptionValue, ",");

                    while (profileTokens.hasMoreTokens()) {
                        String profileAction = profileTokens.nextToken().trim();

                        if (profileAction.startsWith("-") || profileAction.startsWith("!")) {
                            inactiveProfiles.add(profileAction.substring(1));
                        } else if (profileAction.startsWith("+")) {
                            activeProfiles.add(profileAction.substring(1));
                        } else {
                            activeProfiles.add(profileAction);
                        }
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (file == null) {
            return null;
        } else if (file.isAbsolute()) {
            return file;
        } else if (file.getPath().startsWith(File.separator)) {
            // drive-relative Windows path
            return file.getAbsoluteFile();
        } else {
            return new File(workingDirectory, file.getPath()).getAbsoluteFile();
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        if (props != null) {
            boolean caseSensitive = Os.current() == Os.WINDOWS;
            for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
                String key = "env."
                        + (caseSensitive ? entry.getKey() : entry.getKey().toUpperCase(Locale.ENGLISH));
                props.setProperty(key, entry.getValue());
            }
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginDescriptorCache.java`
#### Snippet
```java
        try {
            Record r = cache.computeIfAbsent(key, k -> {
                try {
                    return new Record(clone(supplier.load()));
                } catch (PluginDescriptorParsingException
                        | PluginResolutionException
                        | InvalidPluginDescriptorException e) {
                    throw new RuntimeException(e);
                }
            });
            return clone(r.descriptor);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginDescriptorParsingException) {
                throw (PluginDescriptorParsingException) e.getCause();
            }
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof InvalidPluginDescriptorException) {
                throw (InvalidPluginDescriptorException) e.getCause();
            }
            throw e;
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingPluginRealmCache.java`
#### Snippet
```java
        try {
            Record r = cache.computeIfAbsent(key, k -> {
                try {
                    return new Record(supplier.load());
                } catch (PluginResolutionException | PluginContainerException e) {
                    throw new RuntimeException(e);
                }
            });
            return r.record;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof PluginResolutionException) {
                throw (PluginResolutionException) e.getCause();
            }
            if (e.getCause() instanceof PluginContainerException) {
                throw (PluginContainerException) e.getCause();
            }
            throw e;
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
try {
            if (event instanceof MavenExecutionRequest) {
                /*  Store the multiModuleProjectDirectory path */
                multiModuleProjectDirectory = ((MavenExecutionRequest) event)
                        .getMultiModuleProjectDirectory()
                        .toPath();
                pattern = Environment.MVND_PLUGIN_REALM_EVICT_PATTERN
                        .asOptional()
                        .orElse(Environment.MVND_PLUGIN_REALM_EVICT_PATTERN.getDefault());
                if (!pattern.isEmpty()) {
                    String[] patterns = pattern.split(",");
                    List<PathMatcher> matchers = new ArrayList<>();
                    for (String pattern : patterns) {
                        if (pattern.startsWith("mvn:")) {
                            String[] parts = pattern.substring("mvn:".length()).split(":");
                            String groupId, artifactId, version;
                            if (parts.length >= 3) {
                                version = parts[2];
                            } else {
                                version = "*";
                            }
                            if (parts.length >= 2) {
                                groupId = parts[0];
                                artifactId = parts[1];
                            } else {
                                groupId = "*";
                                artifactId = parts[0];
                            }
                            pattern = "glob:**/" + ("*".equals(groupId) ? "" : groupId.replace('.', '/') + "/")
                                    + artifactId + "/" + ("*".equals(version) ? "**" : version + "/**");
                        }
                        matchers.add(getPathMatcher(pattern));
                    }
                    if (matchers.size() == 1) {
                        matcher = matchers.iterator().next();
                    } else {
                        matcher = path -> matchers.stream().anyMatch(f -> f.matches(path));
                    }
                }
            } else if (event instanceof MavenExecutionResult) {
                /* Evict the entries referring to jars under multiModuleProjectDirectory */
                pluginCache.cache.removeIf(this::shouldEvict);
                extensionCache.cache.removeIf(this::shouldEvict);
                MavenExecutionResult mer = (MavenExecutionResult) event;
                List<MavenProject> projects = mer.getTopologicallySortedProjects();
                projectArtifactsCache.cache.removeIf(
                        (k, r) -> shouldEvict(projects, (InvalidatingProjectArtifactsCache.CacheKey) k, r));
            }
        } catch (Exception e) {
            LOG.warn("Could not notify CliPluginRealmCache", e);
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
        try {
            for (URL url : v.record.getRealm().getURLs()) {
                if (url.getProtocol().equals("file")) {
                    final Path path = Paths.get(url.toURI());
                    if (path.startsWith(multiModuleProjectDirectory)) {
                        LOG.debug(
                                "Removing PluginRealmCache entry {} because it refers to an artifact in the build tree {}",
                                k,
                                path);
                        return true;
                    } else if (matcher != null && matcher.matches(path)) {
                        LOG.debug(
                                "Removing PluginRealmCache entry {} because its components {} matches the eviction pattern '{}'",
                                k,
                                path,
                                pattern);
                        return true;
                    }
                }
            }
            return false;
        } catch (URISyntaxException e) {
            return true;
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
        try {
            for (URL url : v.record.getRealm().getURLs()) {
                if (url.getProtocol().equals("file")) {
                    final Path path = Paths.get(url.toURI());
                    if (path.startsWith(multiModuleProjectDirectory)) {
                        LOG.debug(
                                "Removing ExtensionRealmCache entry {} because it refers to an artifact in the build tree {}",
                                k,
                                path);
                        return true;
                    } else if (matcher != null && matcher.matches(path)) {
                        LOG.debug(
                                "Removing ExtensionRealmCache entry {} because its components {} matches the eviction pattern '{}'",
                                k,
                                path,
                                pattern);
                        return true;
                    }
                }
            }
            return false;
        } catch (URISyntaxException e) {
            return true;
        }
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/plugin/CachingPluginVersionResolver.java`
#### Snippet
```java
        Map<String, PluginVersionResult> cache =
                getCache(request.getRepositorySession().getData());
        String key = getKey(request);
        PluginVersionResult result = cache.get(key);
        if (result == null) {
            result = super.resolve(request);
            cache.putIfAbsent(key, result);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/plugin/CachingPluginVersionResolver.java`
#### Snippet
```java
        Map<String, PluginVersionResult> cache = (Map<String, PluginVersionResult>) data.get(CACHE_KEY);
        while (cache == null) {
            cache = new ConcurrentHashMap<>(256);
            if (data.set(CACHE_KEY, null, cache)) {
                break;
            }
            cache = (Map<String, PluginVersionResult>) data.get(CACHE_KEY);
        }
        return cache;
```

### DuplicatedCode
Duplicated code
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                    String selector = token.trim();
                    boolean active = true;
                    if (selector.charAt(0) == '-' || selector.charAt(0) == '!') {
                        active = false;
                        selector = selector.substring(1);
                    } else if (token.charAt(0) == '+') {
                        selector = selector.substring(1);
                    }

                    boolean optional = selector.charAt(0) == '?';
                    selector = selector.substring(optional ? 1 : 0);
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=RegExpSimplifiable]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
                    new FileOutputStream(extractedLckFile).close();
                }
                try (OutputStream out = new FileOutputStream(extractedLibFile)) {
                    copy(in, out);
                }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
            // Check whether the contents are properly copied from the resource folder
            try (InputStream nativeIn = MvndNativeLoader.class.getResourceAsStream(nativeLibraryFilePath)) {
                try (InputStream extractedLibIn = new FileInputStream(extractedLibFile)) {
                    String eq = contentsEquals(nativeIn, extractedLibIn);
                    if (eq != null) {
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=UnnecessaryToStringCall]
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

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/SimpleAppender.java`
#### Snippet
```java
            buf.append(ThrowableProxyUtil.asString(tp));
        }
        System.out.print(buf.toString());
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingProjectArtifactsCache.java`
#### Snippet
```java
            }
            collect = scopesToCollect == null
                    ? Collections.<String>emptySet()
                    : Collections.unmodifiableSet(new HashSet<>(scopesToCollect));
            resolve = scopesToResolve == null
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingProjectArtifactsCache.java`
#### Snippet
```java
                    : Collections.unmodifiableSet(new HashSet<>(scopesToCollect));
            resolve = scopesToResolve == null
                    ? Collections.<String>emptySet()
                    : Collections.unmodifiableSet(new HashSet<>(scopesToResolve));
            this.aggregating = aggregating;
```

## RuleId[id=RegExpUnexpectedAnchor]
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonState.java`
#### Snippet
```java
/**
 * File origin
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/api/DaemonStateControl.java
 */
public enum DaemonState {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonStopEvent.java`
#### Snippet
```java
 *
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonStopEvent.java
 */
public class DaemonStopEvent implements Serializable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonExpirationStatus.java`
#### Snippet
```java
 *
 * File origin:
 * https://github.com/gradle/gradle/blob/v6.5.1/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/expiry/DaemonExpirationStatus.java
 */
public enum DaemonExpirationStatus {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonInfo.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonInfo.java
 */
public class DaemonInfo {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/context/DaemonCompatibilitySpec.java
 */
public class DaemonCompatibilitySpec {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferCaster.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/base-services/src/main/java/org/gradle/internal/io/BufferCaster.java
 */
public class BufferCaster {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
/**
 * Original code from
 * https://github.com/classgraph/classgraph/blob/latest/src/main/java/nonapi/io/github/classgraph/utils/FileUtils.java#L543
 */
public class BufferHelper {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonConnection.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/messaging/src/main/java/org/gradle/internal/remote/internal/inet/SocketConnection.java
 *
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/apache/maven/blob/maven-3.6.2/maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java
 *
 * @author Jason van Zyl
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
 *
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonRegistry.java
 * https://github.com/OpenHFT/Java-Lang/blob/master/lang/src/main/java/net/openhft/lang/io/AbstractBytes.java
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/registry/DaemonRegistry.java
 * https://github.com/OpenHFT/Java-Lang/blob/master/lang/src/main/java/net/openhft/lang/io/AbstractBytes.java
 */
public class DaemonRegistry implements AutoCloseable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/DaemonExpiration.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/MasterExpirationStrategy.java
 */
public class DaemonExpiration {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonClientConnection.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DaemonClientConnection.java
 */
public class DaemonClientConnection implements Closeable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonDiagnostics.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/diagnostics/DaemonDiagnostics.java
 */
public class DaemonDiagnostics {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLogger.java`
#### Snippet
```java
 * <p>
 * Adapted from
 * https://github.com/apache/maven/blob/maven-3.6.3/maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLogger.java
 * The main change is that the MDC property for redirecting the log to the correct maven project is set
 * when the logger is instantiated (usually when injected into a mojo).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLoggerManager.java`
#### Snippet
```java
 * <p>
 * Adapted from
 * https://github.com/apache/maven/blob/maven-3.6.3/maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java
 * This class has no differences with the above beyond formatting. Its purpose is simply to be able to call the
 * Slf4Logger.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/gradle/gradle/blob/v5.6.2/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DefaultDaemonConnector.java
 */
public class DaemonConnector {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
/**
 * File origin:
 * https://github.com/apache/maven/blob/maven-3.6.2/maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java
 *
 * @author Jason van Zyl
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    private final ToolchainsBuilder toolchainsBuilder;

    private final DefaultSecDispatcher dispatcher;

    private final Map<String, ConfigurationProcessor> configurationProcessors;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    private final ToolchainsBuilder toolchainsBuilder;

    private final DefaultSecDispatcher dispatcher;

    private final Map<String, ConfigurationProcessor> configurationProcessors;
```

## RuleId[id=IgnoreResultOfCall]
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
Result of `BlockingQueue.remove()` is ignored
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                                            .orElse(null);
                                    if (t != null) {
                                        recvQueue.remove(t);
                                        LOGGER.info("Received response: {}", t);
                                        return t;
```

### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                        case StopRequested:
                            LOGGER.debug("Cancel: daemon is busy, sleeping until state changes.");
                            condition.await(rem, TimeUnit.MILLISECONDS);
                            break;
                        case Broken:
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonConnection.java`
#### Snippet
```java
                return true;
            }
            if (Objects.equals(e.getMessage(), "Connection reset")) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java

        boolean noSnapshotUpdates = false;
        if (commandLine.hasOption(CLIManager.SUPRESS_SNAPSHOT_UPDATES)) {
            noSnapshotUpdates = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
        boolean updateSnapshots = false;

        if (commandLine.hasOption(CLIManager.UPDATE_SNAPSHOTS)) {
            updateSnapshots = true;
        }
```

## RuleId[id=ThrowablePrintedToSystemOut]
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ServerSocketChannel' used without 'try'-with-resources statement
in `common/src/main/java/org/mvndaemon/mvnd/common/SocketFamily.java`
#### Snippet
```java
        switch (this) {
            case inet:
                return ServerSocketChannel.open().bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
            case unix:
                return SocketHelper.openUnixServerSocket();
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
    }
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                });
                System.setIn(daemonInputStream);
                System.setOut(new LoggingOutputStream(s -> sendQueue.add(Message.out(s))).printStream());
                System.setErr(new LoggingOutputStream(s -> sendQueue.add(Message.err(s))).printStream());
                int exitCode = cli.main(
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
                System.setIn(daemonInputStream);
                System.setOut(new LoggingOutputStream(s -> sendQueue.add(Message.out(s))).printStream());
                System.setErr(new LoggingOutputStream(s -> sendQueue.add(Message.err(s))).printStream());
                int exitCode = cli.main(
                        buildRequest.getArgs(),
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stdout.setLevel(ch.qos.logback.classic.Level.INFO);
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
```

### AutoCloseableResource
'LoggingOutputStream' used without 'try'-with-resources statement
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
            stderr.setLevel(ch.qos.logback.classic.Level.INFO);
            System.setOut(new LoggingOutputStream(s -> stdout.info("[stdout] " + s)).printStream());
            System.setErr(new LoggingOutputStream(s -> stderr.warn("[stderr] " + s)).printStream());
        }
    }
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonCompatibilitySpec.java`
#### Snippet
```java

    private boolean daemonOptsMatch(DaemonInfo daemon) {
        return daemon.getOptions().containsAll(options) && daemon.getOptions().size() == options.size();
    }

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
    private void accept() {
        try {
            while (true) {
                try (SocketChannel socket = this.socket.accept()) {
                    try {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `0` to `int` is redundant
in `common/src/main/java/org/mvndaemon/mvnd/common/DaemonRegistry.java`
#### Snippet
```java
                    if (updater != null) {
                        updater.run();
                        BufferCaster.cast(buffer).position((int) 0);
                        buffer.putInt(infosMap.size());
                        for (DaemonInfo di : infosMap.values()) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param modelProfile` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param settingsPolicy` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsPolicy
     * @return a RepositoryPolicy
     */
```

### JavadocDeclaration
`@param settingsRepo` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsRepo
     * @return a repository
     */
```

### JavadocDeclaration
`@param modelRepo` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelRepo
     * @return a repository
     */
```

### JavadocDeclaration
`@param dominant` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param dominant
     * @param recessive
     */
```

### JavadocDeclaration
`@param recessive` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
    /**
     * @param dominant
     * @param recessive
     */
    public static Settings merge(Settings dominant, Settings recessive) {
```

### JavadocDeclaration
`@param modelPolicy` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelPolicy
     * @return a RepositoryPolicy
     */
```

### JavadocDeclaration
`@param settingsProfile` tag description is missing
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param cliManager` tag description is missing
in `daemon/src/main/java/org/apache/maven/cli/MvndHelpFormatter.java`
#### Snippet
```java
     * Returns Maven option descriptions combined with mvnd options descriptions
     *
     * @param  cliManager
     * @return            the string containing the help message
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
     * @param  libraryFileName       Library name.
     * @param  targetFolder          Target folder.
     * @return
     */
    private static boolean extractAndLoadLibraryFile(
```

### JavadocDeclaration
`@throws` tag description is missing
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
     * Loads mvndnative library using given path and name of the library.
     *
     * @throws
     */
    private static void loadMvndNativeLibrary() throws Exception {
```

### JavadocDeclaration
Class reference expected
in `native/src/main/java/org/mvndaemon/mvnd/nativ/MvndNativeLoader.java`
#### Snippet
```java
     * Loads mvndnative library using given path and name of the library.
     *
     * @throws
     */
    private static void loadMvndNativeLibrary() throws Exception {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `cygwin` may be 'final'
in `common/src/main/java/org/mvndaemon/mvnd/common/Os.java`
#### Snippet
```java
    MAC(true),
    WINDOWS(false) {
        private boolean cygwin;

        {
```

### FieldMayBeFinal
Field `PRE_JAVA_9` may be 'final'
in `common/src/main/java/org/mvndaemon/mvnd/common/BufferHelper.java`
#### Snippet
```java
public class BufferHelper {

    private static boolean PRE_JAVA_9 =
            System.getProperty("java.specification.version", "9").startsWith("1.");

```

### FieldMayBeFinal
Field `aggregating` may be 'final'
in `daemon/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingProjectArtifactsCache.java`
#### Snippet
```java
        private final Set<String> resolve;

        private boolean aggregating;

        private final int hashCode;
```

### FieldMayBeFinal
Field `projectId` may be 'final'
in `common/src/main/java/org/mvndaemon/mvnd/common/Message.java`
#### Snippet
```java
    public static class RequestInput extends Message {

        private String projectId;

        public static RequestInput read(DataInputStream input) throws IOException {
```

### FieldMayBeFinal
Field `projectId` may be 'final'
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLogger.java`
#### Snippet
```java

    private org.slf4j.Logger logger;
    private String projectId;

    public Slf4jLogger(org.slf4j.Logger logger) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLogger.java`
#### Snippet
```java
public class Slf4jLogger implements Logger {

    private org.slf4j.Logger logger;
    private String projectId;

```

### FieldMayBeFinal
Field `loggerFactory` may be 'final'
in `logging/src/main/java/org/mvndaemon/mvnd/logging/internal/Slf4jLoggerManager.java`
#### Snippet
```java
public class Slf4jLoggerManager implements LoggerManager {

    private ILoggerFactory loggerFactory;

    public Slf4jLoggerManager() {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u005B` can be replaced with '\['
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    private static final Pattern LAST_ANSI_SEQUENCE = Pattern.compile("(\u001B\\[[;\\d]*[ -/]*[@-~])[^\u001B]*$");

    private static final String ANSI_RESET = "\u001B\u005Bm";

    private static void configure(
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u005B` can be replaced with '\['
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
    private static final Pattern LAST_ANSI_SEQUENCE = Pattern.compile("(\u001B\\[[;\\d]*[ -/]*[@-~])[^\u001B]*$");

    private static final String ANSI_RESET = "\u001B\u005Bm";

    private static void configure(
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
    private static org.apache.maven.api.model.RepositoryPolicy convertRepositoryPolicy(
            RepositoryPolicy settingsPolicy) {
        org.apache.maven.api.model.RepositoryPolicy policy = org.apache.maven.api.model.RepositoryPolicy.newBuilder()
                .enabled(Boolean.toString(settingsPolicy.isEnabled()))
                .updatePolicy(settingsPolicy.getUpdatePolicy())
```

### UnnecessaryLocalVariable
Local variable `repo` is redundant
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
     */
    private static Repository convertToSettingsRepository(org.apache.maven.api.model.Repository modelRepo) {
        Repository repo = Repository.newBuilder()
                .id(modelRepo.getId())
                .layout(modelRepo.getLayout())
```

### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `daemon-m40/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
     */
    private static RepositoryPolicy convertRepositoryPolicy(org.apache.maven.api.model.RepositoryPolicy modelPolicy) {
        RepositoryPolicy policy = RepositoryPolicy.newBuilder()
                .enabled(modelPolicy.isEnabled())
                .updatePolicy(modelPolicy.getUpdatePolicy())
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

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/mvndaemon/mvnd/client/DaemonConnector.java`
#### Snippet
```java
            while (connection == null && System.currentTimeMillis() < stop) {
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
                sleep(200L);
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
                sleep(50L);
            } catch (InterruptedException e) {
                throw new DaemonException.InterruptedException(e);
```

## RuleId[id=UnusedAssignment]
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
Variable `root` initializer `path.substring(0, 1)` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
                return ExecHelper.exec(false, "cygpath", p).trim();
            } catch (IOException e) {
                String root = path.substring(0, 1);
                String p = path.substring(3);
                return "/cygdrive/" + root.toLowerCase(Locale.ROOT) + "/" + p.replace('\\', '/');
```

### UnusedAssignment
Variable `p` initializer `path.substring(3)` is redundant
in `daemon/src/main/java/org/mvndaemon/mvnd/cli/EnvHelper.java`
#### Snippet
```java
            } catch (IOException e) {
                String root = path.substring(0, 1);
                String p = path.substring(3);
                return "/cygdrive/" + root.toLowerCase(Locale.ROOT) + "/" + p.replace('\\', '/');
            }
```

### UnusedAssignment
Variable `executionRequestPopulator` initializer `null` is redundant
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
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
in `daemon-m40/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                        resolver.loadCoreExtensions(cliRequest.request, providedArtifacts, extensions));
            } finally {
                executionRequestPopulator = null;
                container.dispose();
            }
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
Variable `executionRequestPopulator` initializer `null` is redundant
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
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
in `daemon-m39/src/main/java/org/apache/maven/cli/DaemonMavenCli.java`
#### Snippet
```java
                        resolver.loadCoreExtensions(cliRequest.request, providedArtifacts, extensions));
            } finally {
                executionRequestPopulator = null;
                container.dispose();
            }
```

## RuleId[id=OptionalGetWithoutIsPresent]
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

## RuleId[id=ConstantValue]
### ConstantValue
Condition `event instanceof MavenExecutionResult` is always `false`
in `daemon-m40/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
                    }
                }
            } else if (event instanceof MavenExecutionResult) {
                /* Evict the entries referring to jars under multiModuleProjectDirectory */
                pluginCache.cache.removeIf(this::shouldEvict);
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
Condition `event instanceof MavenExecutionResult` is always `false`
in `daemon-m39/src/main/java/org/mvndaemon/mvnd/cache/invalidating/InvalidatingRealmCacheEventSpy.java`
#### Snippet
```java
                    }
                }
            } else if (event instanceof MavenExecutionResult) {
                /* Evict the entries referring to jars under multiModuleProjectDirectory */
                pluginCache.cache.removeIf(this::shouldEvict);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `info`
in `daemon/src/main/java/org/mvndaemon/mvnd/daemon/Server.java`
#### Snippet
```java
            stateLock.lock();
            try {
                registry.store(info = info.withState(state));
                condition.signalAll();
            } finally {
```

