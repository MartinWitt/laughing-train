# pty4j 
 
# Bad smells
I found 179 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToStaticFieldFromInstanceMethod | 40 | false |
| RedundantFieldInitialization | 18 | false |
| UnnecessaryFullyQualifiedName | 17 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 15 | false |
| SynchronizeOnThis | 11 | false |
| CatchMayIgnoreException | 7 | false |
| Finalize | 6 | false |
| MarkedForRemoval | 6 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| SystemOutErr | 6 | false |
| AssignmentToMethodParameter | 6 | false |
| ReturnNull | 5 | false |
| NestedAssignment | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| BoundedWildcard | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| CommentedOutCode | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| ThreadStartInConstruction | 2 | false |
| ConstantValue | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| DataFlowIssue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryBoxing | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| UNUSED_IMPORT | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Convert2Lambda | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/windows/CygwinPTYOutputStream.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/windows/CygwinPTYInputStream.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    closeUnusedStreams();
    super.finalize();
```

### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  @Override
  protected synchronized void finalize() throws Throwable {
    // Once the object begins finalization, we can't assume much about other
    // objects referenced by this object, because they may have already been
```

### Finalize
'finalize()' should not be overridden
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java
    // each {int, short, short} structure is represented by two ints
    int[] poll_fds = new int[]{pipeFd, JTermios.POLLIN, fd, JTermios.POLLIN};
    while (true) {
      if (JTermios.poll(poll_fds, 2, -1) > 0) break;

```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
                         @Nullable Integer initialRows) throws IOException {
    String cmd = command[0];
    SecurityManager s = System.getSecurityManager();
    if (s != null) {
      s.checkExec(cmd);
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
                         @Nullable Integer initialRows) throws IOException {
    String cmd = command[0];
    SecurityManager s = System.getSecurityManager();
    if (s != null) {
      s.checkExec(cmd);
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    SecurityManager s = System.getSecurityManager();
    if (s != null) {
      s.checkExec(cmd);
    }
    if (environment == null) {
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
  private static void checkExec(@NotNull List<String> command) {
    String exec = command.size() > 0 ? command.get(0) : null;
    SecurityManager s = System.getSecurityManager();
    if (s != null && exec != null) {
      s.checkExec(exec);
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
  private static void checkExec(@NotNull List<String> command) {
    String exec = command.size() > 0 ? command.get(0) : null;
    SecurityManager s = System.getSecurityManager();
    if (s != null && exec != null) {
      s.checkExec(exec);
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
    SecurityManager s = System.getSecurityManager();
    if (s != null && exec != null) {
      s.checkExec(exec);
    }
  }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ConsoleProcessListChildProcessMain` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
import com.sun.jna.win32.W32APIOptions;

public class ConsoleProcessListChildProcessMain {
  static final String PREFIX = "Process list count: ";
  static final String SUFFIX = " attached to the console";
```

### UtilityClassWithoutPrivateConstructor
Class `WindowsVersion` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/windows/WindowsVersion.java`
#### Snippet
```java
import java.util.concurrent.Callable;

class WindowsVersion {

  private static final Logger LOG = LoggerFactory.getLogger(WindowsVersion.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessUtils` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/windows/conpty/ProcessUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

final class ProcessUtils {

  public static WinBase.PROCESS_INFORMATION startProcess(@NotNull PseudoConsole pseudoConsole,
```

### UtilityClassWithoutPrivateConstructor
Class `PtyUtil` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/util/PtyUtil.java`
#### Snippet
```java
 * @author traff
 */
public class PtyUtil {

  public static final String PREFERRED_NATIVE_FOLDER_KEY = "pty4j.preferred.native.folder";
```

### UtilityClassWithoutPrivateConstructor
Class `PtyHelpers` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
 * emulating such system calls on non POSIX systems.
 */
public class PtyHelpers {
  private static final Logger LOG = LoggerFactory.getLogger(PtyHelpers.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ConsoleProcessListFetcher` has only 'static' members, and lacks a 'private' constructor
in `src/com/pty4j/windows/conpty/ConsoleProcessListFetcher.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ConsoleProcessListFetcher {
  private static final Logger LOG = LoggerFactory.getLogger(ConsoleProcessListFetcher.class);
  private static final int TIMEOUT_MILLIS = 5000;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/com/pty4j/windows/CygwinPtyProcess.java`
#### Snippet
```java
            KERNEL32.CancelIo(handle);

            success = false;
          }
          else {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java

    term.c_cc[JTermios.VEOF] = CTRLKEY('D');
//    term.c_cc[VEOL] = -1;
//    term.c_cc[VEOL2] = -1;
    term.c_cc[VERASE] = 0x7f;           // DEL
```

### CommentedOutCode
Commented out code (5 lines)
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    term.c_cc[JTermios.VSTART] = CTRLKEY('Q');
    term.c_cc[JTermios.VSTOP] = CTRLKEY('S');
//    term.c_cc[VLNEXT] = CTRLKEY('V');
//    term.c_cc[VDISCARD] = CTRLKEY('O');
//    term.c_cc[VMIN] = 1;
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ONLCR` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
   */
  public OSFacadeImpl() {
    PtyHelpers.ONLCR = 0x04;

    PtyHelpers.VINTR = 0;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VINTR` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.ONLCR = 0x04;

    PtyHelpers.VINTR = 0;
    PtyHelpers.VQUIT = 1;
    PtyHelpers.VERASE = 2;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VQUIT` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.VINTR = 0;
    PtyHelpers.VQUIT = 1;
    PtyHelpers.VERASE = 2;
    PtyHelpers.VKILL = 3;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VERASE` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VINTR = 0;
    PtyHelpers.VQUIT = 1;
    PtyHelpers.VERASE = 2;
    PtyHelpers.VKILL = 3;
    PtyHelpers.VSUSP = 10;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VKILL` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VQUIT = 1;
    PtyHelpers.VERASE = 2;
    PtyHelpers.VKILL = 3;
    PtyHelpers.VSUSP = 10;
    PtyHelpers.VREPRINT = 12;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VSUSP` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VERASE = 2;
    PtyHelpers.VKILL = 3;
    PtyHelpers.VSUSP = 10;
    PtyHelpers.VREPRINT = 12;
    PtyHelpers.VWERASE = 14;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VREPRINT` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VKILL = 3;
    PtyHelpers.VSUSP = 10;
    PtyHelpers.VREPRINT = 12;
    PtyHelpers.VWERASE = 14;

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VWERASE` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VSUSP = 10;
    PtyHelpers.VREPRINT = 12;
    PtyHelpers.VWERASE = 14;

    PtyHelpers.ECHOKE = 0x01;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOKE` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VWERASE = 14;

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOCTL` from instance context
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ONLCR` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
   */
  public OSFacadeImpl() {
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VERASE` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VWERASE` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VKILL` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VREPRINT` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VINTR` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VQUIT` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VSUSP` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOKE` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOCTL` from instance context
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ONLCR` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
   */
  public OSFacadeImpl() {
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VERASE` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VWERASE` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VKILL` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VREPRINT` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VINTR` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VQUIT` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VSUSP` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOKE` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOCTL` from instance context
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ONLCR` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
   */
  public OSFacadeImpl() {
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VERASE` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.ONLCR = 0x02;

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VWERASE` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VKILL` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VERASE = 3;
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VREPRINT` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VWERASE = 4;
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VINTR` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VKILL = 5;
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VQUIT` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VREPRINT = 6;
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.VSUSP` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VINTR = 8;
    PtyHelpers.VQUIT = 9;
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOKE` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    PtyHelpers.VSUSP = 10;

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `PtyHelpers.ECHOCTL` from instance context
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java

    PtyHelpers.ECHOKE = 0x01;
    PtyHelpers.ECHOCTL = 0x40;
  }

```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `b`
in `src/com/pty4j/unix/PTYInputStream.java`
#### Snippet
```java
  @Override
  public int read() throws IOException {
    byte b[] = new byte[1];
    if (1 != read(b, 0, 1)) {
      return -1;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `b`
in `src/com/pty4j/windows/CygwinPTYInputStream.java`
#### Snippet
```java
  @Override
  public int read() throws IOException {
    byte b[] = new byte[1];
    if (1 != read(b, 0, 1)) {
      return -1;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `b`
in `src/com/pty4j/windows/WinPTYInputStream.java`
#### Snippet
```java
  @Override
  public int read() throws IOException {
    byte b[] = new byte[1];
    if (1 != read(b, 0, 1)) {
      return -1;
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
            try {
                myInputStream.close();
            } catch (IOException e) { }
        }
        if (!myUsedOutputStream) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
            try {
                myOutputStream.close();
            } catch (IOException e) { }
        }
        if (!myUsedErrorStream) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
            try {
                myErrorStream.close();
            } catch (IOException e) { }
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
        pipe.close();
      }
    } catch (IOException e) {
    }
  }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      }
    }
    catch (IOException e) {
    }
    try {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      }
    }
    catch (IOException e) {
    }
    try {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      }
    }
    catch (IOException e) {
    }
  }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`command.size() > 0` can be replaced with '!command.isEmpty()'
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java

  private static void checkExec(@NotNull List<String> command) {
    String exec = command.size() > 0 ? command.get(0) : null;
    SecurityManager s = System.getSecurityManager();
    if (s != null && exec != null) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/com/pty4j/util/LazyValue.java`
#### Snippet
```java
  private volatile Pair<T, Throwable> myResult;

  public LazyValue(@NotNull Callable<T> provider) {
    myProvider = provider;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/com/pty4j/util/LazyValue.java`
#### Snippet
```java
  }

  private T unpack(@NotNull Pair<T, Throwable> result) throws Exception {
    if (result.second != null) {
      if (result.second instanceof Exception) {
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `src/com/pty4j/util/LazyValue.java`
#### Snippet
```java
  }

  private T unpack(@NotNull Pair<T, Throwable> result) throws Exception {
    if (result.second != null) {
      if (result.second instanceof Exception) {
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `myCloseHandleOnFinalize` accessed in synchronized context
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
    // this flag is set, avoid using the ReentrantLock objects.
    myFinalizedFlag = true;
    if (myCloseHandleOnFinalize) {
      close();
    }
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/com/pty4j/windows/CygwinPtyProcess.java`
#### Snippet
```java
    }

    new Thread() {
      @Override
      public void run() {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
      try {
        while (myExitCode == null && remaining > 0) {
          //noinspection ResultOfMethodCallIgnored
          myCondition.awaitNanos(remaining);
          remaining = unit.toNanos(timeout) - (System.nanoTime() - startTime);
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java
      String version = System.getProperty("os.version").toLowerCase(Locale.US);
      String[] strings = version.split("\\.");
      if (strings.length > 1 && strings[0].equals("10") && Integer.valueOf(strings[1]) <= 6) return true;
    }
    return false;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("single argument expected: pid");
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
      pid = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      System.err.println("Cannot parse pid from " + args[0]);
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
    }
    if (!Kernel32.INSTANCE.FreeConsole()) {
      System.err.println(LastErrorExceptionEx.getErrorMessage("FreeConsole"));
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
    }
    if (!Kernel32.INSTANCE.AttachConsole(pid)) {
      System.err.println(LastErrorExceptionEx.getErrorMessage("AttachConsole"));
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
    int count = result.intValue();
    if (count == 0) {
      System.err.println(LastErrorExceptionEx.getErrorMessage("GetConsoleProcessList"));
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/ConsoleProcessListChildProcessMain.java`
#### Snippet
```java
      return;
    }
    System.out.println(PREFIX + count + SUFFIX);
  }

```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
      myLock.lock();
      try {
        while (myExitCode == null) {
          myCondition.await();
        }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
Native.LONG_SIZE \* MAX_COUNT: integer multiplication implicitly cast to long
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
    }
    int MAX_COUNT = 64;
    Pointer buffer = new Memory(Native.LONG_SIZE * MAX_COUNT);
    PointerByReference errPtr = new PointerByReference();
    try {
```

### IntegerMultiplicationImplicitCastToLong
Native.WCHAR_SIZE \* bufferLength: integer multiplication implicitly cast to long
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
    }
    int bufferLength = 1024;
    Pointer buffer = new Memory(Native.WCHAR_SIZE * bufferLength);
    PointerByReference errPtr = new PointerByReference();
    try {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/com/pty4j/unix/PTYInputStream.java`
#### Snippet
```java
   * Implementation of read for the InputStream.
   *
   * @throws java.io.IOException on error.
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix` is unnecessary and can be removed
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java

/**
 * Provides a {@link com.pty4j.unix.PtyHelpers.OSFacade} implementation for Linux.
 */
public class OSFacadeImpl implements PtyHelpers.OSFacade {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/com/pty4j/windows/WinPTYInputStream.java`
#### Snippet
```java
   * Implementation of read for the InputStream.
   *
   * @throws java.io.IOException on error.
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/NativePtyExecutor.java`
#### Snippet
```java
  }

  private interface Pty4J extends com.sun.jna.Library {
    int exec_pty(String full_path, String[] argv, String[] envp, String dirpath, String pts_name, int fdm,
                 String err_pts_name, int err_fdm, boolean console);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
  // INNER TYPES

  private interface MacOSX_C_lib extends com.sun.jna.Library {
    int kill(int pid, int signal);

```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java

  @Override
  public int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset) {
    return m_Clib.sigprocmask(how, set, oldset);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java

  @Override
  public int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset) {
    return m_Clib.sigprocmask(how, set, oldset);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix` is unnecessary and can be removed
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java

/**
 * Provides a {@link com.pty4j.unix.PtyHelpers.OSFacade} implementation for MacOSX.
 */
public class OSFacadeImpl implements PtyHelpers.OSFacade {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    int waitpid(int pid, int[] stat, int options);

    int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset);

    String strerror(int errno);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
    int waitpid(int pid, int[] stat, int options);

    int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset);

    String strerror(int errno);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix.macosx` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
  private static final LazyValue<OSFacade> OS_FACADE_VALUE = new LazyValue<>(() -> {
    if (Platform.isMac()) {
      return new com.pty4j.unix.macosx.OSFacadeImpl();
    }
    if (Platform.isFreeBSD()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix.freebsd` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    }
    if (Platform.isFreeBSD()) {
      return new com.pty4j.unix.freebsd.OSFacadeImpl();
    }
    if (Platform.isOpenBSD()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix.openbsd` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    }
    if (Platform.isOpenBSD()) {
      return new com.pty4j.unix.openbsd.OSFacadeImpl();
    }
    if (Platform.isLinux() || Platform.isAndroid()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j.unix.linux` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    }
    if (Platform.isLinux() || Platform.isAndroid()) {
      return new com.pty4j.unix.linux.OSFacadeImpl();
    }
    if (Platform.isWindows()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    int waitpid(int pid, int[] stat, int options);

    int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset);

    String strerror(int errno);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.ptr` is unnecessary, and can be replaced with an import
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    int waitpid(int pid, int[] stat, int options);

    int sigprocmask(int how, com.sun.jna.ptr.IntByReference set, com.sun.jna.ptr.IntByReference oldset);

    String strerror(int errno);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.pty4j` is unnecessary and can be removed
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java
   * Returns the current window size of this Pty.
   *
   * @return a {@link com.pty4j.WinSize} instance with information about the master sid of the Pty.
   * @throws UnixPtyException in case obtaining the window size failed.
   */
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicBoolean;`
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
    }
    catch (Exception e) {
      e.printStackTrace();
      return 25;
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
        }
        catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java
      ProcessUtils.closeHandles(processInformation);
    } catch (IOException e) {
      e.printStackTrace();
    }
    pseudoConsole.close();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
      winpty = null;
      processHandle.setValue(null);
      coninPipe = conoutPipe = conerrPipe = null;

    } finally {
```

### NestedAssignment
Result of assignment expression used
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
      winpty = null;
      processHandle.setValue(null);
      coninPipe = conoutPipe = conerrPipe = null;

    } finally {
```

### NestedAssignment
Result of assignment expression used
in `src/com/pty4j/windows/conpty/ConsoleProcessListFetcher.java`
#### Snippet
```java
      try {
        int readCount;
        while (!myIsStopped && (readCount = myReader.read(buf)) >= 0) {
          myBuffer.append(buf, 0, readCount);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/com/pty4j/util/ExtractedNative.java`
#### Snippet
```java
      byte[] buffer = new byte[8192];
      int bufferSize;
      while ((bufferSize = in.read(buffer)) >= 0) {
        md5.update(buffer, 0, bufferSize);
      }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `src/com/pty4j/windows/WindowsVersion.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(WindowsVersion.class);
  private static LazyValue<Version> myVersionValue = new LazyValue<Version>(new Callable<Version>() {
    @Override
    public Version call() throws Exception {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myStatusByRef` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  // for INFINITE waits.
  private class WaitForExitThread extends Thread {
    private IntByReference myStatusByRef = new IntByReference(-1);

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myClosed` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private boolean myChildExited = false;
  private int myStatus = -1;
  private boolean myClosed = false;
  private WinSize myLastWinSize;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `INSTANCE` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  }

  private static WinPtyLib INSTANCE = Native.loadLibrary(getLibraryPath(), WinPtyLib.class);

  private static String getLibraryPath() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myProcess` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private Pointer myWinpty;

  private WinNT.HANDLE myProcess;
  private NamedPipe myConinPipe;
  private NamedPipe myConoutPipe;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myWinpty` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
    !Boolean.getBoolean("disable.minimal.initial.terminal.window.height");

  private Pointer myWinpty;

  private WinNT.HANDLE myProcess;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myExitCode` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java

  private int pid = 0;
  private int myExitCode;
  private boolean isDone;
  private OutputStream out;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pid` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  private final boolean myConsoleMode;

  private int pid = 0;
  private int myExitCode;
  private boolean isDone;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myHandle` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

public class NamedPipe {
  private WinNT.HANDLE myHandle;
  boolean myCloseHandleOnFinalize;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `writeEvent` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private WinNT.HANDLE readEvent;
  private WinNT.HANDLE writeEvent;

  private WinNT.HANDLE[] readWaitHandles;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `writeLock` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private ReentrantLock readLock = new ReentrantLock();
  private ReentrantLock writeLock = new ReentrantLock();

  private Memory readBuffer = new Memory(16 * 1024);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readEvent` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private Memory writeBuffer = new Memory(16 * 1024);

  private WinNT.HANDLE readEvent;
  private WinNT.HANDLE writeEvent;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readLock` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private volatile boolean myFinalizedFlag = false;

  private ReentrantLock readLock = new ReentrantLock();
  private ReentrantLock writeLock = new ReentrantLock();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myResourceNamePrefix` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/util/ExtractedNative.java`
#### Snippet
```java
  private static final ExtractedNative INSTANCE = new ExtractedNative();
  private String myResourceOsArchSubPath;
  private String myResourceNamePrefix;
  private boolean myInitialized;
  private volatile File myDestDir;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myResourceOsArchSubPath` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/util/ExtractedNative.java`
#### Snippet
```java

  private static final ExtractedNative INSTANCE = new ExtractedNative();
  private String myResourceOsArchSubPath;
  private String myResourceNamePrefix;
  private boolean myInitialized;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myInitialized` is accessed in both synchronized and unsynchronized contexts
in `src/com/pty4j/util/ExtractedNative.java`
#### Snippet
```java
  private String myResourceOsArchSubPath;
  private String myResourceNamePrefix;
  private boolean myInitialized;
  private volatile File myDestDir;

```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/com/pty4j/windows/WindowsVersion.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(WindowsVersion.class);
  private static LazyValue<Version> myVersionValue = new LazyValue<Version>(new Callable<Version>() {
    @Override
    public Version call() throws Exception {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/pty4j/windows/conpty/WinHandleInputStream.java`
#### Snippet
```java
  private volatile boolean myClosed;
  private final ReentrantLock myLock = new ReentrantLock();
  private int myReadCount = 0; // guarded by myLock
  private final Condition myReadCountChanged = myLock.newCondition();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
    private boolean myUsedInputStream = false;
    private boolean myUsedOutputStream = false;
    private boolean myUsedErrorStream = false;

    @Deprecated
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
    private final boolean myConsoleMode;

    private boolean myUsedInputStream = false;
    private boolean myUsedOutputStream = false;
    private boolean myUsedErrorStream = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java

    private boolean myUsedInputStream = false;
    private boolean myUsedOutputStream = false;
    private boolean myUsedErrorStream = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private WinSize myLastWinSize;

  private int openInputStreamCount = 0;

  WinPty(@NotNull String cmdline,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private NamedPipe myConerrPipe;

  private boolean myChildExited = false;
  private int myStatus = -1;
  private boolean myClosed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private boolean myChildExited = false;
  private int myStatus = -1;
  private boolean myClosed = false;
  private WinSize myLastWinSize;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  private final boolean myConsoleMode;

  private int pid = 0;
  private int myExitCode;
  private boolean isDone;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/conpty/PseudoConsole.java`
#### Snippet
```java
  private final WinEx.HPCON hpc;
  private WinSize myLastWinSize;
  private boolean myClosed = false;

  private static WinEx.COORDByValue getSizeCoords(@NotNull WinSize size) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/PtyProcessBuilder.java`
#### Snippet
```java
  private boolean myCygwin;
  private File myLogFile;
  private boolean myRedirectErrorStream = false;
  private Integer myInitialColumns;
  private Integer myInitialRows;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/PtyProcessBuilder.java`
#### Snippet
```java
  private boolean myWindowsAnsiColorEnabled = false;
  private boolean myUnixOpenTtyToPreserveOutputAfterTermination = false;
  private boolean myUseWinConPty = false;

  public PtyProcessBuilder() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/PtyProcessBuilder.java`
#### Snippet
```java
  private Integer myInitialColumns;
  private Integer myInitialRows;
  private boolean myWindowsAnsiColorEnabled = false;
  private boolean myUnixOpenTtyToPreserveOutputAfterTermination = false;
  private boolean myUseWinConPty = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/PtyProcessBuilder.java`
#### Snippet
```java
  private Integer myInitialRows;
  private boolean myWindowsAnsiColorEnabled = false;
  private boolean myUnixOpenTtyToPreserveOutputAfterTermination = false;
  private boolean myUseWinConPty = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
  public static int ONLCR = 0x04;

  public static int VINTR = 0;
  public static int VQUIT = 1;
  public static int VERASE = 2;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private WinNT.HANDLE shutdownEvent;
  private volatile boolean shutdownFlag = false;
  private volatile boolean myFinalizedFlag = false;

  private ReentrantLock readLock = new ReentrantLock();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private WinNT.HANDLE shutdownEvent;
  private volatile boolean shutdownFlag = false;
  private volatile boolean myFinalizedFlag = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/pty4j/windows/conpty/ConsoleProcessListFetcher.java`
#### Snippet
```java
    private final StringBuilder myBuffer = new StringBuilder();
    private final Thread myThread;
    private boolean myIsStopped = false;

    private StreamGobbler(Reader reader) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/com/pty4j/windows/conpty/WinConPtyProcess.java`
#### Snippet
```java

  private static class ExitCodeInfo {
    private Integer myExitCode = null;
    private final ReentrantLock myLock = new ReentrantLock();
    private final Condition myCondition = myLock.newCondition();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/com/pty4j/unix/PTYInputStream.java`
#### Snippet
```java
    }
    byte[] tmpBuf = new byte[len];
    len = myPty.read(tmpBuf, len);
    if (len <= 0) {
      return -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `src/com/pty4j/windows/WinPTYOutputStream.java`
#### Snippet
```java
        }
      }
      b = newBuf;
      off = 0;
      len = newPos;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/com/pty4j/windows/WinPTYOutputStream.java`
#### Snippet
```java
      }
      b = newBuf;
      off = 0;
      len = newPos;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/com/pty4j/windows/WinPTYOutputStream.java`
#### Snippet
```java
      b = newBuf;
      off = 0;
      len = newPos;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `dir`
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    myConsoleMode = consoleMode;
    if (dir == null) {
      dir = ".";
    }
    if (pty == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `environment`
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    }
    if (environment == null) {
      environment = new String[0];
    }
    final String slaveName = pty.getSlaveName();
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `LastErrorExceptionEx` does not end with 'Exception'
in `src/com/pty4j/windows/conpty/LastErrorExceptionEx.java`
#### Snippet
```java
import java.io.IOException;

public class LastErrorExceptionEx extends IOException {

  public LastErrorExceptionEx(@NotNull String action) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/com/pty4j/windows/conpty/WinEx.java`
#### Snippet
```java
      Pointer p = getPointer().getPointer(0);
      if (p == null) {
        return null;
      }
      HPCON hpc = new HPCON();
```

### ReturnNull
Return of `null`
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java

  private static WString toWString(String string) {
    return string == null ? null : new WString(string);
  }

```

### ReturnNull
Return of `null`
in `src/com/pty4j/util/Pair.java`
#### Snippet
```java

  public static <T> T getSecond(Pair<?, T> pair) {
    return pair != null ? pair.second : null;
  }

```

### ReturnNull
Return of `null`
in `src/com/pty4j/util/Pair.java`
#### Snippet
```java

  public static <T> T getFirst(Pair<T, ?> pair) {
    return pair != null ? pair.first : null;
  }

```

### ReturnNull
Return of `null`
in `src/com/pty4j/windows/conpty/ConsoleProcessListFetcher.java`
#### Snippet
```java
    return systemPropertyKeys.stream().map(key -> {
      String value = System.getProperty(key);
      return value != null ? "-D" + key + "=" + value : null;
    }).filter(Objects::nonNull).collect(Collectors.toList());
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    }
    if (environment == null) {
      environment = new String[0];
    }
    final String slaveName = pty.getSlaveName();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/com/pty4j/util/PtyUtil.java`
#### Snippet
```java

  public static String[] toStringArray(Map<String, String> environment) {
    if (environment == null) return new String[0];
    return environment.entrySet().stream()
      .map(entry -> entry.getKey() + "=" + entry.getValue())
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  synchronized int waitFor() throws InterruptedException {
    while (!myChildExited) {
      wait();
    }
    return myStatus;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
      Kernel32.INSTANCE.WaitForSingleObject(myProcess, INFINITE);
      Kernel32.INSTANCE.GetExitCodeProcess(myProcess, myStatusByRef);
      synchronized (WinPty.this) {
        WinPty.this.myChildExited = true;
        WinPty.this.myStatus = myStatusByRef.getValue();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
        WinPty.this.myStatus = myStatusByRef.getValue();
        closeUnusedProcessHandle();
        WinPty.this.notifyAll();
      }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      }
      // Tell spawner that the process started.
      synchronized (UnixPtyProcess.this) {
        UnixPtyProcess.this.notifyAll();
      }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      // Tell spawner that the process started.
      synchronized (UnixPtyProcess.this) {
        UnixPtyProcess.this.notifyAll();
      }
      if (pid != -1) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
        // Sync with spawner and notify when done.
        myExitCode = PtyHelpers.getPtyExecutor().waitForProcessExitAndGetExitCode(pid);
        synchronized (UnixPtyProcess.this) {
          isDone = true;
          UnixPtyProcess.this.notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
        synchronized (UnixPtyProcess.this) {
          isDone = true;
          UnixPtyProcess.this.notifyAll();
        }
        myPty.breakRead();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    reaper.start();
    // Wait until the subprocess is started or error.
    synchronized (this) {
      while (pid == 0) {
        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
      while (pid == 0) {
        try {
          wait();
        }
        catch (InterruptedException e) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  public synchronized int waitFor() throws InterruptedException {
    while (!isDone) {
      wait();
    }
    return myExitCode;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/pty4j/util/ExtractedNative.java`
#### Snippet
```java
      myResourceOsArchSubPath = Objects.requireNonNullElse(myResourceOsArchSubPath, PtyUtil.getNativeLibraryOsArchSubPath());
      myResourceNamePrefix = Objects.requireNonNullElse(myResourceNamePrefix, DEFAULT_RESOURCE_NAME_PREFIX);
      synchronized (this) {
        if (!myInitialized) {
          doInit();
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
      Thread waitForExit = new WaitForExitThread();
      waitForExit.setDaemon(true);
      waitForExit.start();

      winpty = null;
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `src/com/pty4j/windows/conpty/ConsoleProcessListFetcher.java`
#### Snippet
```java
      myReader = reader;
      myThread = new Thread(this, "ConsoleProcessListFetcher output reader");
      myThread.start();
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `openInputStreamCount` initializer `0` is redundant
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private WinSize myLastWinSize;

  private int openInputStreamCount = 0;

  WinPty(@NotNull String cmdline,
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `myClosed` is always 'true'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  synchronized void setWinSize(@NotNull WinSize winSize) throws IOException {
    if (myClosed) {
      throw new IOException("Unable to set window size: closed=" + myClosed + ", winSize=" + winSize);
    }
    boolean result = INSTANCE.winpty_set_size(myWinpty, winSize.getColumns(), winSize.getRows(), null);
```

### ConstantValue
Condition `isUTF8` is always `true`
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java

    boolean isUTF8 = true;
    term.c_iflag = JTermios.ICRNL | JTermios.IXON | JTermios.IXANY | IMAXBEL | JTermios.BRKINT | (isUTF8 ? IUTF8 : 0);
    term.c_oflag = JTermios.OPOST | ONLCR;
    term.c_cflag = JTermios.CREAD | JTermios.CS8 | HUPCL;
```

