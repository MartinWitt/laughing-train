# commons-exec 
 
# Bad smells
I found 137 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 46 | false |
| SynchronizeOnThis | 10 | false |
| DuplicateThrows | 8 | false |
| CommentedOutCode | 7 | false |
| ObsoleteCollection | 6 | false |
| UnnecessaryStringEscape | 5 | true |
| PublicFieldAccessedInSynchronizedContext | 5 | false |
| SystemOutErr | 5 | false |
| RedundantFieldInitialization | 5 | false |
| BoundedWildcard | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| ReturnNull | 4 | false |
| IndexOfReplaceableByContains | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| BusyWait | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| UnusedAssignment | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryInitCause | 1 | false |
| NestedAssignment | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ConstantValue | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DebugUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/exec/util/DebugUtils.java`
#### Snippet
```java
 *
 */
public class DebugUtils
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MapUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java
 *
 */
public class MapUtils
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
 *
 */
public class StringUtils {

    private static final String[] EMPTY_STRING_ARRAY = new String[0];
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/org/apache/commons/exec/environment/EnvironmentUtils.java`
#### Snippet
```java
        int i = 0;
        for (final Entry<String, String> entry : environment.entrySet()) {
            final String key  = entry.getKey() == null ? "" : entry.getKey().toString();
            final String value = entry.getValue() == null ? "" : entry.getValue().toString();
            result[i] = key + "=" + value;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/org/apache/commons/exec/environment/EnvironmentUtils.java`
#### Snippet
```java
        for (final Entry<String, String> entry : environment.entrySet()) {
            final String key  = entry.getKey() == null ? "" : entry.getKey().toString();
            final String value = entry.getValue() == null ? "" : entry.getValue().toString();
            result[i] = key + "=" + value;
            i++;
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/exec/OS.java`
#### Snippet
```java
                } else {
                    throw new RuntimeException(
                            "Don\'t know how to detect os family \""
                                    + family + "\"");
                }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
        final int inDoubleQuote = 2;
        int state = normal;
        final StringTokenizer tok = new StringTokenizer(toProcess, "\"\' ", true);
        final ArrayList<String> list = new ArrayList<>();
        StringBuilder current = new StringBuilder();
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
            switch (state) {
            case inQuote:
                if ("\'".equals(nextTok)) {
                    lastTokenHasBeenQuoted = true;
                    state = normal;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
                break;
            default:
                if ("\'".equals(nextTok)) {
                    state = inQuote;
                } else if ("\"".equals(nextTok)) {
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java

    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final String SINGLE_QUOTE = "\'";
    private static final String DOUBLE_QUOTE = "\"";
    private static final char SLASH_CHAR = '/';
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/exec/environment/OpenVmsProcessingEnvironment.java`
#### Snippet
```java
package org.apache.commons.exec.environment;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.HashMap;
```

### CommentedOutCode
Commented out code (55 lines)
in `src/main/java/org/apache/commons/exec/environment/OpenVmsProcessingEnvironment.java`
#### Snippet
```java
     */

//    /**
//     * Find the list of environment variables for this process.
//     *
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
    @Deprecated
    protected BufferedReader runProcEnvCommand() throws IOException {
//        final ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final Executor exe = new DefaultExecutor();
//        exe.setStreamHandler(new PumpStreamHandler(out));
```

### CommentedOutCode
Commented out code (37 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
    @Deprecated
    protected CommandLine getProcEnvCommand() {
//        String executable;
//        String[] arguments = null;
//        if (OS.isFamilyOS2()) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
//        }
        final CommandLine commandLine = null;
//        if (executable != null) {
//            commandLine = new CommandLine(executable);
//            commandLine.addArguments(arguments);
```

### CommentedOutCode
Commented out code (25 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
    }

//    /**
//     * ByteArrayOutputStream#toString doesn't seem to work reliably on OS/390,
//     * at least not the way we use it in the execution context.
```

### CommentedOutCode
Commented out code (28 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java

// No longer needed
//        if (procEnvironment == null) {
//            procEnvironment = createEnvironmentMap();
//            final BufferedReader in = runProcEnvCommand();
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java

    /** the list of currently running processes */
    private final Vector<Process> processes = new Vector<>();

    /** The thread registered at the JVM to execute the shutdown handler */
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java

    /** the list of currently running processes */
    private final Vector<Process> processes = new Vector<>();

    /** The thread registered at the JVM to execute the shutdown handler */
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
     * The arguments of the command.
     */
    private final Vector<Argument> arguments = new Vector<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
     * The arguments of the command.
     */
    private final Vector<Argument> arguments = new Vector<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
public class Watchdog implements Runnable {

    private final Vector<TimeoutObserver> observers = new Vector<>(1);

    private final long timeoutMillis;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
public class Watchdog implements Runnable {

    private final Vector<TimeoutObserver> observers = new Vector<>(1);

    private final long timeoutMillis;
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `src/main/java/org/apache/commons/exec/ExecuteException.java`
#### Snippet
```java
     */
    @Override
    public Throwable getCause() {
        return this.cause;
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
                try {
                    wait(timeLeftMillis);
                } catch (final InterruptedException e) {
                }
                timeLeftMillis = timeoutMillis - (System.currentTimeMillis() - startTimeMillis);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
                            }
                            // just append the unresolved variable declaration
                            argBuf.append("${").append(nameBuf.toString()).append("}");
                        }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Argument` may be 'static'
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
     * Encapsulates a command line argument.
     */
    class Argument {

        private final String value;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java
     * @return the cloned map
     */
    public static <K, V> Map<K, V> copy(final Map<K, V> source) {
        return source == null ? null : new HashMap<>(source);
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java
     * @return the cloned map
     */
    public static <K, V> Map<K, V> copy(final Map<K, V> source) {
        return source == null ? null : new HashMap<>(source);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/exec/environment/EnvironmentUtils.java`
#### Snippet
```java
     * @param keyAndValue the key/value pair
     */
    public static void addVariableToEnvironment(final Map<String, String> environment, final String keyAndValue) {
        final String[] parsedVariable = parseEnvironmentVariable(keyAndValue);
        environment.put(parsedVariable[0], parsedVariable[1]);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/exec/environment/EnvironmentUtils.java`
#### Snippet
```java
     * @param keyAndValue the key/value pair
     */
    public static void addVariableToEnvironment(final Map<String, String> environment, final String keyAndValue) {
        final String[] parsedVariable = parseEnvironmentVariable(keyAndValue);
        environment.put(parsedVariable[0], parsedVariable[1]);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `buf` accessed in synchronized context
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java

        public synchronized String toString(final Charset charset) {
            return new String(buf, 0, count, charset);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java

        public synchronized String toString(final Charset charset) {
            return new String(buf, 0, count, charset);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `procEnvironment` accessed in synchronized context
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
    public synchronized Map<String, String> getProcEnvironment() throws IOException {

        if (procEnvironment == null) {
            procEnvironment = this.createProcEnvironment();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `procEnvironment` accessed in synchronized context
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java

        if (procEnvironment == null) {
            procEnvironment = this.createProcEnvironment();
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `procEnvironment` accessed in synchronized context
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
        // or setting an evironment variable
        final Map<String, String> copy = createEnvironmentMap();
        copy.putAll(procEnvironment);
        return copy;
    }
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
                    // Java 1.5 does not support public IOException(String message, Throwable cause)
                    final IOException ioe = new IOException(e.getMessage());
                    ioe.initCause(e);
                    throw ioe;
                }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/util/DebugUtils.java`
#### Snippet
```java

        if (isDebugEnabled()) {
            System.err.println(msg);
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java
            final boolean removed = Runtime.getRuntime().removeShutdownHook(destroyProcessThread);
            if (!removed) {
                System.err.println("Could not remove shutdown hook");
            }
            /*
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java
                    process.destroy();
                } catch (final Throwable t) {
                    System.err.println("Unable to terminate process during process shutdown");
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/PumpStreamHandler.java`
#### Snippet
```java
     */
    public PumpStreamHandler() {
        this(System.out, System.err);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/PumpStreamHandler.java`
#### Snippet
```java
     */
    public PumpStreamHandler() {
        this(System.out, System.err);
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ExecuteResultHandler.java`
#### Snippet
```java
 * the executed process, i.e. the exit value or an exception.
 *
 * @see org.apache.commons.exec.Executor#execute(CommandLine, java.util.Map, ExecuteResultHandler)
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     * <ul>
     *  <li>an array of exit values to be considered successful</li>
     *  <li>an empty array for auto-detect of successful exit codes relying on {@link org.apache.commons.exec.Executor#isFailure(int)}</li>
     *  <li>null to indicate to skip checking of exit codes</li>
     * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     *
     * If an undefined exit value is returned by the process then
     * {@link org.apache.commons.exec.Executor#execute(CommandLine)}  will
     * throw an {@link org.apache.commons.exec.ExecuteException}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     * If an undefined exit value is returned by the process then
     * {@link org.apache.commons.exec.Executor#execute(CommandLine)}  will
     * throw an {@link org.apache.commons.exec.ExecuteException}.
     *
     * @param values a list of the exit codes
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     * Define the {@code exitValue} of the process to be considered
     * successful. If a different exit value is returned by
     * the process then {@link org.apache.commons.exec.Executor#execute(CommandLine)}
     * will throw an {@link org.apache.commons.exec.ExecuteException}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     * successful. If a different exit value is returned by
     * the process then {@link org.apache.commons.exec.Executor#execute(CommandLine)}
     * will throw an {@link org.apache.commons.exec.ExecuteException}
     *
     * @param value the exit code representing successful execution
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecuteResultHandler.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.ExecuteResultHandler#onProcessFailed(org.apache.commons.exec.ExecuteException)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecuteResultHandler.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.ExecuteResultHandler#onProcessFailed(org.apache.commons.exec.ExecuteException)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecuteResultHandler.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.ExecuteResultHandler#onProcessComplete(int)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * @param len the length of block
     * @throws IOException if the data cannot be written into the stream.
     * @see java.io.OutputStream#write(byte[], int, int)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * Flush this log stream.
     *
     * @see java.io.OutputStream#flush()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * Writes all remaining data from the buffer.
     *
     * @see java.io.OutputStream#close()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     *
     * @param cc data to log (byte).
     * @see java.io.OutputStream#write(int)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ProcessDestroyer.java`
#### Snippet
```java
     *            the process to remove
     * @return {@code true} if the specified
     *      {@link java.lang.Process} was
     *      successfully removed
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ProcessDestroyer.java`
#### Snippet
```java

/**
 * Destroys all registered {@link java.lang.Process} after a certain event,
 * typically when the VM exits
 * @see org.apache.commons.exec.ShutdownHookProcessDestroyer
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ProcessDestroyer.java`
#### Snippet
```java
 * Destroys all registered {@link java.lang.Process} after a certain event,
 * typically when the VM exits
 * @see org.apache.commons.exec.ShutdownHookProcessDestroyer
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ProcessDestroyer.java`
#### Snippet
```java
     *      the process to add
     * @return {@code true} if the specified
     *      {@link java.lang.Process} was
     *      successfully added
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ExecuteWatchdog.java`
#### Snippet
```java
 * has returned.
 *
 * @see org.apache.commons.exec.Executor
 * @see org.apache.commons.exec.Watchdog
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/ExecuteWatchdog.java`
#### Snippet
```java
 *
 * @see org.apache.commons.exec.Executor
 * @see org.apache.commons.exec.Watchdog
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/TimeoutObserver.java`
#### Snippet
```java
 * Interface for classes that want to be notified by Watchdog.
 *
 * @see org.apache.commons.exec.Watchdog
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
 * Generalization of {@code ExecuteWatchdog}
 *
 * @see org.apache.commons.exec.ExecuteWatchdog
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec.launcher` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/launcher/CommandLauncherImpl.java`
#### Snippet
```java
            final File workingDir) throws IOException;

    /** @see org.apache.commons.exec.launcher.CommandLauncher#isFailure(int) */
    @Override
    public boolean isFailure(final int exitValue)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec.launcher` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/launcher/VmsCommandLauncher.java`
#### Snippet
```java
    }

    /** @see org.apache.commons.exec.launcher.CommandLauncher#isFailure(int) */
    @Override
    public boolean isFailure(final int exitValue) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#getProcessDestroyer()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine, java.util.Map)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine, java.util.Map)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
     * into our {@code System.out} and {@code System.err} to avoid
     * into our {@code System.out} and {@code System.err} to avoid
     * a blocked or deadlocked subprocess (see{@link java.lang.Process Process}).
     */
    public DefaultExecutor() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#getWorkingDirectory()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setStreamHandler(org.apache.commons.exec.ExecuteStreamHandler)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setStreamHandler(org.apache.commons.exec.ExecuteStreamHandler)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#getStreamHandler()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    }

    /** @see org.apache.commons.exec.Executor#setExitValue(int) */
    @Override
    public void setExitValue(final int value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine,
     *      org.apache.commons.exec.ExecuteResultHandler)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine,
     *      org.apache.commons.exec.ExecuteResultHandler)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setWatchdog(org.apache.commons.exec.ExecuteWatchdog)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setWatchdog(org.apache.commons.exec.ExecuteWatchdog)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setWorkingDirectory(java.io.File)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setWorkingDirectory(java.io.File)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine,
     *      java.util.Map, org.apache.commons.exec.ExecuteResultHandler)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine,
     *      java.util.Map, org.apache.commons.exec.ExecuteResultHandler)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    /**
     * @see org.apache.commons.exec.Executor#execute(CommandLine,
     *      java.util.Map, org.apache.commons.exec.ExecuteResultHandler)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#getWatchdog()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.exec.Executor#setProcessDestroyer(ProcessDestroyer)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java


    /** @see org.apache.commons.exec.Executor#setExitValues(int[]) */
    @Override
    public void setExitValues(final int[] values) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.exec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    }

    /** @see org.apache.commons.exec.Executor#isFailure(int) */
    @Override
    public boolean isFailure(final int exitValue) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/exec/StreamPumper.java`
#### Snippet
```java
        int length;
        try {
            while ((length = is.read(buf)) > 0) {
                os.write(buf, 0, length);
            }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/exec/util/DebugUtils.java`
#### Snippet
```java
        if (isDebugEnabled()) {
            System.err.println(msg);
            e.printStackTrace();
        }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `LogOutputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * @param charset Character Set to use when processing lines
     */
    public LogOutputStream(final int level, final Charset charset) {
        this.level = level;
        this.charset = charset == null ? Charset.defaultCharset() : charset;
```

### NonProtectedConstructorInAbstractClass
Constructor `LogOutputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * Uses the default level of 999.
     */
    public LogOutputStream() {
        this(999);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LogOutputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
     * @param level loglevel used to log data written to this stream.
     */
    public LogOutputStream(final int level) {
        this(level, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CommandLauncherProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/exec/launcher/CommandLauncherProxy.java`
#### Snippet
```java
public abstract class CommandLauncherProxy extends CommandLauncherImpl {

    public CommandLauncherProxy(final CommandLauncher launcher) {
        myLauncher = launcher;
    }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `added` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java

    /** Whether or not this ProcessDestroyer has been registered as a shutdown hook */
    private boolean added = false;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `procEnvironment` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java

    /** the environment variables of the process */
    protected Map<String, String> procEnvironment;

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java
     * Whether or not this ProcessDestroyer is currently running as shutdown hook
     */
    private volatile boolean running = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java

    /** Whether or not this ProcessDestroyer has been registered as a shutdown hook */
    private boolean added = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/exec/ShutdownHookProcessDestroyer.java`
#### Snippet
```java

    /** The thread registered at the JVM to execute the shutdown handler */
    private ProcessDestroyerImpl destroyProcessThread = null;

    /** Whether or not this ProcessDestroyer has been registered as a shutdown hook */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/exec/LogOutputStream.java`
#### Snippet
```java
    private final ByteArrayOutputStreamX buffer = new ByteArrayOutputStreamX(INTIAL_SIZE);

    private boolean skip = false;

    private final int level;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/exec/PumpStreamHandler.java`
#### Snippet
```java

    /** the last exception being caught */
    private IOException caught = null;

    /**
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-12-15-12-36.394.html`
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
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java

        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java
     */
    public static <K, V> Map<K, V> copy(final Map<K, V> source) {
        return source == null ? null : new HashMap<>(source);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
//        exe.execute(getProcEnvCommand());
//        return new BufferedReader(new StringReader(toString(out)));
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/exec/environment/EnvironmentUtils.java`
#### Snippet
```java
    public static String[] toStrings(final Map<String, String> environment) {
        if (environment == null) {
            return null;
        }
        final String[] result = new String[environment.size()];
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `commandLine` is redundant
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
//            executable = null;
//        }
        final CommandLine commandLine = null;
//        if (executable != null) {
//            commandLine = new CommandLine(executable);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/exec/CommandLine.java`
#### Snippet
```java
        if (toProcess == null || toProcess.isEmpty()) {
            // no command? no string
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
        this.streamHandler = new PumpStreamHandler();
        this.launcher = CommandLauncherFactory.createVMLauncher();
        this.exitValues = new int[0];
        this.workingDirectory = new File(".");
        this.exceptionCaught = null;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/ExecuteWatchdog.java`
#### Snippet
```java
        this.process = processToMonitor;
        this.processStarted = true;
        this.notifyAll();
        if (this.hasWatchdog) {
            watchdog.start();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/ExecuteWatchdog.java`
#### Snippet
```java
        this.processStarted = true;
        this.caught = e;
        this.notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/ExecuteWatchdog.java`
#### Snippet
```java
        while (!processStarted && caught == null) {
            try {
                this.wait();
            } catch (final InterruptedException e) {
                throw new RuntimeException(e.getMessage());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/StreamPumper.java`
#### Snippet
```java
    public synchronized void waitFor() throws InterruptedException {
        while (!isFinished()) {
            wait();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/StreamPumper.java`
#### Snippet
```java
    @Override
    public void run() {
        synchronized (this) {
            // Just in case this object is reused in the future
            finished = false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/StreamPumper.java`
#### Snippet
```java
                }
            }
            synchronized (this) {
                finished = true;
                notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/StreamPumper.java`
#### Snippet
```java
            synchronized (this) {
                finished = true;
                notifyAll();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
        final long startTimeMillis = System.currentTimeMillis();
        boolean isWaiting;
        synchronized (this) {
            long timeLeftMillis = timeoutMillis - (System.currentTimeMillis() - startTimeMillis);
            isWaiting = timeLeftMillis > 0;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
            while (!stopped && isWaiting) {
                try {
                    wait(timeLeftMillis);
                } catch (final InterruptedException e) {
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/exec/Watchdog.java`
#### Snippet
```java
    public synchronized void stop() {
        stopped = true;
        notifyAll();
    }

```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     */
    void execute(CommandLine command, Map<String, String> environment, ExecuteResultHandler handler)
        throws ExecuteException, IOException;
}

```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     */
    int execute(CommandLine command)
        throws ExecuteException, IOException;

    /**
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     */
    void execute(CommandLine command, ExecuteResultHandler handler)
        throws ExecuteException, IOException;

    /**
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/Executor.java`
#### Snippet
```java
     */
    int execute(CommandLine command, Map<String, String> environment)
        throws ExecuteException, IOException;

    /**
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    @Override
    public void execute(final CommandLine command, final Map<String, String> environment,
            final ExecuteResultHandler handler) throws ExecuteException, IOException {

        if (workingDirectory != null && !workingDirectory.exists()) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    @Override
    public int execute(final CommandLine command, final Map<String, String> environment)
            throws ExecuteException, IOException {

        if (workingDirectory != null && !workingDirectory.exists()) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
     */
    @Override
    public int execute(final CommandLine command) throws ExecuteException,
            IOException {
        return execute(command, (Map<String, String>) null);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    @Override
    public void execute(final CommandLine command, final ExecuteResultHandler handler)
            throws ExecuteException, IOException {
        execute(command, null, handler);
    }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/commons/exec/DefaultExecuteResultHandler.java`
#### Snippet
```java

        while (!hasResult()) {
            Thread.sleep(SLEEP_TIME_MS);
        }
    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/commons/exec/DefaultExecuteResultHandler.java`
#### Snippet
```java

        while (!hasResult() && System.currentTimeMillis() < untilMillis) {
            Thread.sleep(SLEEP_TIME_MS);
        }
    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/commons/exec/InputStreamPumper.java`
#### Snippet
```java
                }
                os.flush();
                Thread.sleep(SLEEPING_TIME);
            }
        } catch (final Exception e) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/exec/util/MapUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> merge(final Map<K, V> lhs, final Map<K, V> rhs) {

        Map<K, V> result = null;

        if (lhs == null || lhs.isEmpty()) {
```

### UnusedAssignment
Variable `del` initializer `' '` is redundant
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java

            char ch = argStr.charAt(cIdx);
            char del = ' ';

            switch (ch) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `commandLine` is always 'null'
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
//            commandLine.addArguments(arguments);
//        }
        return commandLine;
    }

```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`cleanedArgument.indexOf(DOUBLE_QUOTE) > -1` can be replaced with 'cleanedArgument.contains(DOUBLE_QUOTE)'
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java

        final StringBuilder buf = new StringBuilder();
        if (cleanedArgument.indexOf(DOUBLE_QUOTE) > -1) {
            if (cleanedArgument.indexOf(SINGLE_QUOTE) > -1) {
                throw new IllegalArgumentException(
```

### IndexOfReplaceableByContains
`cleanedArgument.indexOf(SINGLE_QUOTE) > -1` can be replaced with 'cleanedArgument.contains(SINGLE_QUOTE)'
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        if (cleanedArgument.indexOf(DOUBLE_QUOTE) > -1) {
            if (cleanedArgument.indexOf(SINGLE_QUOTE) > -1) {
                throw new IllegalArgumentException(
                        "Can't handle single and double quotes in same argument");
```

### IndexOfReplaceableByContains
`cleanedArgument.indexOf(SINGLE_QUOTE) > -1` can be replaced with 'cleanedArgument.contains(SINGLE_QUOTE)'
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
                    SINGLE_QUOTE).toString();
        }
        if (cleanedArgument.indexOf(SINGLE_QUOTE) > -1
                || cleanedArgument.indexOf(" ") > -1) {
            return buf.append(DOUBLE_QUOTE).append(cleanedArgument).append(
```

### IndexOfReplaceableByContains
`cleanedArgument.indexOf(" ") > -1` can be replaced with 'cleanedArgument.contains(" ")'
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
        }
        if (cleanedArgument.indexOf(SINGLE_QUOTE) > -1
                || cleanedArgument.indexOf(" ") > -1) {
            return buf.append(DOUBLE_QUOTE).append(cleanedArgument).append(
                    DOUBLE_QUOTE).toString();
```

