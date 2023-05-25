# commons-exec 
 
# Bad smells
I found 37 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateThrows | 8 | false |
| CommentedOutCode | 7 | false |
| UnnecessaryStringEscape | 5 | true |
| BusyWait | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| UnusedAssignment | 2 | false |
| RedundantCast | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| DanglingJavadoc | 1 | false |
| ConstantValue | 1 | false |
| UnnecessaryInitCause | 1 | false |
| IgnoreResultOfCall | 1 | false |
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `values.clone()` to `int[]` is redundant
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
    @Override
    public void setExitValues(final int[] values) {
        this.exitValues = values == null ? null : (int[]) values.clone();
    }

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
Commented out code (28 lines)
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java

// No longer needed
//        if (procEnvironment == null) {
//            procEnvironment = createEnvironmentMap();
//            final BufferedReader in = runProcEnvCommand();
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/org/apache/commons/exec/util/StringUtils.java`
#### Snippet
```java
            char del = ' ';

            switch (ch) {

            case '$':
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

## RuleId[id=BusyWait]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/exec/environment/DefaultProcessingEnvironment.java`
#### Snippet
```java
public class DefaultProcessingEnvironment {

    /** the line separator of the system */
//    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `src/main/java/org/apache/commons/exec/DefaultExecutor.java`
#### Snippet
```java
                // Process.waitFor should clear interrupt status when throwing InterruptedException
                // but we have to do that manually
                Thread.interrupted();
            }

```

