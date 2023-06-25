# pty4j 
 
# Bad smells
I found 85 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 27 | false |
| Deprecation | 21 | false |
| CatchMayIgnoreException | 7 | false |
| MarkedForRemoval | 6 | false |
| NullableProblems | 6 | false |
| CStyleArrayDeclaration | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| CommentedOutCode | 2 | false |
| DuplicatedCode | 2 | false |
| ConstantValue | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| DataFlowIssue | 1 | false |
| UNUSED_IMPORT | 1 | false |
| RedundantTypeArguments | 1 | false |
| UnusedAssignment | 1 | false |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myVersionValue` may be 'final'
in `src/com/pty4j/windows/WindowsVersion.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(WindowsVersion.class);
  private static LazyValue<Version> myVersionValue = new LazyValue<Version>(new Callable<Version>() {
    @Override
    public Version call() throws Exception {
```

### FieldMayBeFinal
Field `writeEvent` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private WinNT.HANDLE readEvent;
  private WinNT.HANDLE writeEvent;

  private WinNT.HANDLE[] readWaitHandles;
```

### FieldMayBeFinal
Field `writeOver` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private WinNT.OVERLAPPED readOver = new WinNT.OVERLAPPED();
  private WinNT.OVERLAPPED writeOver = new WinNT.OVERLAPPED();

  /**
```

### FieldMayBeFinal
Field `writeActual` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private IntByReference readActual = new IntByReference();
  private IntByReference writeActual = new IntByReference();
  private IntByReference peekActual = new IntByReference();

```

### FieldMayBeFinal
Field `readEvent` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private Memory writeBuffer = new Memory(16 * 1024);

  private WinNT.HANDLE readEvent;
  private WinNT.HANDLE writeEvent;

```

### FieldMayBeFinal
Field `peekActual` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private IntByReference readActual = new IntByReference();
  private IntByReference writeActual = new IntByReference();
  private IntByReference peekActual = new IntByReference();

  private WinNT.OVERLAPPED readOver = new WinNT.OVERLAPPED();
```

### FieldMayBeFinal
Field `writeLock` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private ReentrantLock readLock = new ReentrantLock();
  private ReentrantLock writeLock = new ReentrantLock();

  private Memory readBuffer = new Memory(16 * 1024);
```

### FieldMayBeFinal
Field `shutdownEvent` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  boolean myCloseHandleOnFinalize;

  private WinNT.HANDLE shutdownEvent;
  private volatile boolean shutdownFlag = false;
  private volatile boolean myFinalizedFlag = false;
```

### FieldMayBeFinal
Field `myHandle` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

public class NamedPipe {
  private WinNT.HANDLE myHandle;
  boolean myCloseHandleOnFinalize;

```

### FieldMayBeFinal
Field `readOver` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private IntByReference peekActual = new IntByReference();

  private WinNT.OVERLAPPED readOver = new WinNT.OVERLAPPED();
  private WinNT.OVERLAPPED writeOver = new WinNT.OVERLAPPED();

```

### FieldMayBeFinal
Field `writeWaitHandles` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  private WinNT.HANDLE[] readWaitHandles;
  private WinNT.HANDLE[] writeWaitHandles;

  private IntByReference readActual = new IntByReference();
```

### FieldMayBeFinal
Field `readLock` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private volatile boolean myFinalizedFlag = false;

  private ReentrantLock readLock = new ReentrantLock();
  private ReentrantLock writeLock = new ReentrantLock();

```

### FieldMayBeFinal
Field `readWaitHandles` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private WinNT.HANDLE writeEvent;

  private WinNT.HANDLE[] readWaitHandles;
  private WinNT.HANDLE[] writeWaitHandles;

```

### FieldMayBeFinal
Field `readActual` may be 'final'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
  private WinNT.HANDLE[] writeWaitHandles;

  private IntByReference readActual = new IntByReference();
  private IntByReference writeActual = new IntByReference();
  private IntByReference peekActual = new IntByReference();
```

### FieldMayBeFinal
Field `myConsole` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private String myErrSlaveName;
    private int myErrMasterFD;
    private boolean myConsole;
    volatile Throwable myException;

```

### FieldMayBeFinal
Field `myMasterFD` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private String myDir;
    private String mySlaveName;
    private int myMasterFD;
    private String myErrSlaveName;
    private int myErrMasterFD;
```

### FieldMayBeFinal
Field `myCommand` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  // same thread.
  class Reaper extends Thread {
    private String[] myCommand;
    private String[] myEnv;
    private String myDir;
```

### FieldMayBeFinal
Field `myErrSlaveName` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private String mySlaveName;
    private int myMasterFD;
    private String myErrSlaveName;
    private int myErrMasterFD;
    private boolean myConsole;
```

### FieldMayBeFinal
Field `mySlaveName` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private String[] myEnv;
    private String myDir;
    private String mySlaveName;
    private int myMasterFD;
    private String myErrSlaveName;
```

### FieldMayBeFinal
Field `myDir` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private String[] myCommand;
    private String[] myEnv;
    private String myDir;
    private String mySlaveName;
    private int myMasterFD;
```

### FieldMayBeFinal
Field `myErrMasterFD` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
    private int myMasterFD;
    private String myErrSlaveName;
    private int myErrMasterFD;
    private boolean myConsole;
    volatile Throwable myException;
```

### FieldMayBeFinal
Field `myEnv` may be 'final'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  class Reaper extends Thread {
    private String[] myCommand;
    private String[] myEnv;
    private String myDir;
    private String mySlaveName;
```

### FieldMayBeFinal
Field `myConinPipe` may be 'final'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java

  private WinNT.HANDLE myProcess;
  private NamedPipe myConinPipe;
  private NamedPipe myConoutPipe;
  private NamedPipe myConerrPipe;
```

### FieldMayBeFinal
Field `myStatusByRef` may be 'final'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  // for INFINITE waits.
  private class WaitForExitThread extends Thread {
    private IntByReference myStatusByRef = new IntByReference(-1);

    @Override
```

### FieldMayBeFinal
Field `myConoutPipe` may be 'final'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private WinNT.HANDLE myProcess;
  private NamedPipe myConinPipe;
  private NamedPipe myConoutPipe;
  private NamedPipe myConerrPipe;

```

### FieldMayBeFinal
Field `INSTANCE` may be 'final'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  }

  private static WinPtyLib INSTANCE = Native.loadLibrary(getLibraryPath(), WinPtyLib.class);

  private static String getLibraryPath() {
```

### FieldMayBeFinal
Field `myConerrPipe` may be 'final'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  private NamedPipe myConinPipe;
  private NamedPipe myConoutPipe;
  private NamedPipe myConerrPipe;

  private boolean myChildExited = false;
```

## RuleId[id=CStyleArrayDeclaration]
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
in `src/com/pty4j/windows/WinPTYInputStream.java`
#### Snippet
```java
  @Override
  public int read() throws IOException {
    byte b[] = new byte[1];
    if (1 != read(b, 0, 1)) {
      return -1;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/com/pty4j/unix/PTYOutputStream.java`
#### Snippet
```java
    if (b == null) {
      throw new NullPointerException();
    } else if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length) || ((off + len) < 0)) {
      throw new IndexOutOfBoundsException();
    } else if (len == 0) {
      return;
    }
```

### DuplicatedCode
Duplicated code
in `src/com/pty4j/unix/PtyHelpers.java`
#### Snippet
```java
    result.c_iflag = settings.c_iflag;
    result.c_oflag = settings.c_oflag;
    result.c_cflag = settings.c_cflag;
    result.c_lflag = settings.c_lflag;
    System.arraycopy(settings.c_cc, 0, result.c_cc, 0, settings.c_cc.length);
    result.c_ispeed = settings.c_ispeed;
    result.c_ospeed = settings.c_ospeed;
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

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/windows/CygwinPTYInputStream.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/windows/CygwinPTYInputStream.java`
#### Snippet
```java
  protected void finalize() throws Throwable {
    close();
    super.finalize();
  }
}
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
  private static final C_lib m_Clib = Native.loadLibrary("c", C_lib.class);

  private static final Linux_Util_lib m_Utillib = Native.loadLibrary("util", Linux_Util_lib.class);

  // CONSTUCTORS
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/linux/OSFacadeImpl.java`
#### Snippet
```java
  }

  private static final C_lib m_Clib = Native.loadLibrary("c", C_lib.class);

  private static final Linux_Util_lib m_Utillib = Native.loadLibrary("util", Linux_Util_lib.class);
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java

  private static final FreeBSD_C_lib m_Clib = Native.loadLibrary("c", FreeBSD_C_lib.class);
  private static final FreeBSD_Util_lib m_Utillib = Native.loadLibrary("util", FreeBSD_Util_lib.class);

  // CONSTUCTORS
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/freebsd/OSFacadeImpl.java`
#### Snippet
```java
  }

  private static final FreeBSD_C_lib m_Clib = Native.loadLibrary("c", FreeBSD_C_lib.class);
  private static final FreeBSD_Util_lib m_Utillib = Native.loadLibrary("util", FreeBSD_Util_lib.class);

```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/macosx/OSFacadeImpl.java`
#### Snippet
```java
  // VARIABLES

  private static final MacOSX_C_lib m_Clib = Native.loadLibrary("c", MacOSX_C_lib.class);

  // CONSTUCTORS
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java

  @Override
  protected synchronized void finalize() throws Throwable {
    // Once the object begins finalization, we can't assume much about other
    // objects referenced by this object, because they may have already been
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/windows/NamedPipe.java`
#### Snippet
```java
      close();
    }
    super.finalize();
  }
}
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java
  protected void finalize() throws Throwable {
    close();
    super.finalize();
  }

```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java

  private static final OpenBSD_C_lib m_Clib = Native.loadLibrary("c", OpenBSD_C_lib.class);
  private static final OpenBSD_Util_lib m_Utillib = Native.loadLibrary("util", OpenBSD_Util_lib.class);

  // CONSTUCTORS
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/unix/openbsd/OSFacadeImpl.java`
#### Snippet
```java
  // VARIABLES

  private static final OpenBSD_C_lib m_Clib = Native.loadLibrary("c", OpenBSD_C_lib.class);
  private static final OpenBSD_Util_lib m_Utillib = Native.loadLibrary("util", OpenBSD_Util_lib.class);

```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    closeUnusedStreams();
    super.finalize();
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/unix/UnixPtyProcess.java`
#### Snippet
```java
  protected void finalize() throws Throwable {
    closeUnusedStreams();
    super.finalize();
  }

```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/windows/CygwinPTYOutputStream.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/windows/CygwinPTYOutputStream.java`
#### Snippet
```java
  protected void finalize() throws Throwable {
    close();
    super.finalize();
  }
}
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
```

### Deprecation
'finalize()' is deprecated
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  protected void finalize() throws Throwable {
    close();
    super.finalize();
  }

```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  }

  private static WinPtyLib INSTANCE = Native.loadLibrary(getLibraryPath(), WinPtyLib.class);

  private static String getLibraryPath() {
```

### Deprecation
'loadLibrary(java.lang.String, java.lang.Class)' is deprecated
in `src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
  }

  static final Kern32 KERNEL32 = Native.loadLibrary("kernel32", Kern32.class);

  interface Kern32 extends Library {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/com/pty4j/windows/WinPtyProcess.java`
#### Snippet
```java
    @NotNull
    private static String convertEnvironment(@Nullable Map<String, String> environment) {
        return Advapi32Util.getEnvironmentBlock(environment != null ? environment : Collections.<String, String>emptyMap());
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/windows/CygwinPTYInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] buf, int off, int len) throws IOException {
    if (myClosed) {
      return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/unix/PTYInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] buf, int off, int len) throws IOException {
    if (buf == null) {
      throw new NullPointerException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/windows/WinPTYOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    if (b == null) {
      throw new NullPointerException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/unix/PTYOutputStream.java`
#### Snippet
```java
  }

  @Override public void write(byte[] b, int off, int len) throws IOException {
    if (b == null) {
      throw new NullPointerException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/windows/CygwinPTYOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    if (myClosed) {
      return;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/com/pty4j/windows/WinPTYInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] buf, int off, int len) throws IOException {
    return myNamedPipe.read(buf, off, len);
  }
```

## RuleId[id=ConstantValue]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/com/pty4j/windows/WinPTYOutputStream.java`
#### Snippet
```java

public class WinPTYOutputStream extends OutputStream {
  private final WinPty myWinPty;
  private final NamedPipe myNamedPipe;
  private final boolean myPatchNewline;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/com/pty4j/unix/Pty.java`
#### Snippet
```java
      String version = System.getProperty("os.version").toLowerCase(Locale.US);
      String[] strings = version.split("\\.");
      if (strings.length > 1 && strings[0].equals("10") && Integer.valueOf(strings[1]) <= 6) return true;
    }
    return false;
```

