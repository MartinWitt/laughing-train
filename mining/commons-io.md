# commons-io 
 
# Bad smells
I found 243 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 73 | false |
| DeprecatedIsStillUsed | 57 | false |
| PointlessBitwiseExpression | 20 | false |
| MismatchedJavadocCode | 14 | false |
| DuplicatedCode | 9 | false |
| PointlessArithmeticExpression | 7 | false |
| ProtectedMemberInFinalClass | 7 | true |
| UNCHECKED_WARNING | 4 | false |
| DataFlowIssue | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| AutoCloseableResource | 4 | false |
| Deprecation | 3 | false |
| ConstantValue | 3 | false |
| EmptyStatementBody | 2 | false |
| CommentedOutCode | 2 | false |
| UnnecessaryLabelOnBreakStatement | 2 | false |
| RegExpSimplifiable | 2 | false |
| DuplicateExpressions | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| FieldCanBeLocal | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| MagicConstant | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StaticInitializerReferencesSubClass | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| RedundantArrayCreation | 1 | true |
| IOStreamConstructor | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| UnnecessaryContinue | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| BusyWait | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Spliterator.ORDERED, Spliterator.DISTINCT, Spliterator.SORTED, Spliterator.SIZED, ... or their combination
in `src/main/java/org/apache/commons/io/function/UncheckedIOSpliterator.java`
#### Snippet
```java
    @Override
    public int characteristics() {
        return delegate.characteristics();
    }

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedLong(final byte[] data, final int offset, final long value) {
        data[offset + 0] = (byte) (value >> 0 & 0xff);
        data[offset + 1] = (byte) (value >> 8 & 0xff);
        data[offset + 2] = (byte) (value >> 16 & 0xff);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static short readSwappedShort(final byte[] data, final int offset) {
        return (short)(((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8));
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedInteger(final byte[] data, final int offset, final int value) {
        data[offset + 0] = (byte) (value >> 0 & 0xff);
        data[offset + 1] = (byte) (value >> 8 & 0xff);
        data[offset + 2] = (byte) (value >> 16 & 0xff);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static long readSwappedUnsignedInteger(final byte[] data, final int offset) {
        final long low = ((data[offset + 0] & 0xff) << 0) +
                     ((data[offset + 1] & 0xff) << 8) +
                     ((data[offset + 2] & 0xff) << 16);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static int readSwappedUnsignedShort(final byte[] data, final int offset) {
        return ((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8);
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static int readSwappedInteger(final byte[] data, final int offset) {
        return ((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8) +
            ((data[offset + 2] & 0xff) << 16) +
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedShort(final byte[] data, final int offset, final short value) {
        data[offset + 0] = (byte)(value >> 0 & 0xff);
        data[offset + 1] = (byte)(value >> 8 & 0xff);
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.util.List\>' to 'java.util.List'
in `src/main/java/org/apache/commons/io/IOExceptionList.java`
#### Snippet
```java
     */
    public <T extends Throwable> List<T> getCauseList() {
        return (List<T>) causeList;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List\>' to 'java.util.List'
in `src/main/java/org/apache/commons/io/IOExceptionList.java`
#### Snippet
```java
     */
    public <T extends Throwable> List<T> getCauseList(final Class<T> clazz) {
        return (List<T>) causeList;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `src/main/java/org/apache/commons/io/IOExceptionList.java`
#### Snippet
```java
     */
    public <T extends Throwable> T getCause(final int index) {
        return (T) causeList.get(index);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator\[\]' to 'java.util.Comparator\[\]'
in `src/main/java/org/apache/commons/io/comparator/CompositeFileComparator.java`
#### Snippet
```java
     */
    public CompositeFileComparator(final Iterable<Comparator<File>> delegates) {
        this.delegates = delegates == null ? emptyArray() : StreamSupport.stream(delegates.spliterator(), false).toArray(Comparator[]::new);
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java
        this.offset = 0;
        this.eod = data.length;
        this.markedOffset = this.offset;
    }

```

### DataFlowIssue
Argument `reader` might be null
in `src/main/java/org/apache/commons/io/input/Tailer.java`
#### Snippet
```java
                if (length > position) {
                    // The file has more content than it did last time
                    position = readLines(reader);
                    last = tailable.lastModifiedFileTime();
                } else if (newer) {
```

### DataFlowIssue
Method invocation `seek` may produce `NullPointerException`
in `src/main/java/org/apache/commons/io/input/Tailer.java`
#### Snippet
```java
                     */
                    position = 0;
                    reader.seek(position); // cannot be null here

                    // Now we can read new lines
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/main/java/org/apache/commons/io/filefilter/DelegateFileFilter.java`
#### Snippet
```java
    @Override
    public String toString() {
        final String delegate = fileFilter != null ? fileFilter.toString() : filenameFilter.toString();
        return super.toString() + "(" + delegate + ")";
    }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'List.contains()'
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        }
        final String fileExt = getExtension(fileName);
        return Stream.of(extensions).anyMatch(fileExt::equals);
    }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`do` statement has empty body
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
    @Override
    public void close() throws IOException {
        do { // NOPMD
             // empty
        } while (nextReader() != null);
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/commons/io/function/IOSpliterator.java`
#### Snippet
```java
     */
    default void forEachRemaining(final IOConsumer<? super T> action) {
        while (tryAdvance(action)) { // NOPMD
        }
    }
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass ForceFileDeleteStrategy from superclass FileDeleteStrategy initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/io/FileDeleteStrategy.java`
#### Snippet
```java
     * even if the file represents a non-empty directory.
     */
    public static final FileDeleteStrategy FORCE = new ForceFileDeleteStrategy();

    /** The name of the strategy. */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
                }
            }
            // relativeDirList1 = tmpRelativeDirList1;
            // relativeDirList2 = tmpRelativeDirList2;
            relativeFileList1 = tmpRelativeFileList1;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java

        final boolean equals;
        // final List<Path> relativeDirList1; // might need later?
        // final List<Path> relativeDirList2; // might need later?
        final List<Path> relativeFileList1;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CloseShieldWriter' is still used
in `src/main/java/org/apache/commons/io/output/CloseShieldWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public CloseShieldWriter(final Writer writer) {
        super(writer);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WriterOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public WriterOutputStream(final Writer writer, final CharsetDecoder decoder, final int bufferSize, final boolean writeImmediately) {
        checkIbmJdkWithBrokenUTF16(CharsetDecoders.toCharsetDecoder(decoder).charset());
        this.writer = writer;
```

### DeprecatedIsStillUsed
Deprecated member 'WriterOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public WriterOutputStream(final Writer writer, final CharsetDecoder decoder) {
        this(writer, decoder, BUFFER_SIZE, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WriterOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public WriterOutputStream(final Writer writer, final String charsetName, final int bufferSize, final boolean writeImmediately) {
        this(writer, Charsets.toCharset(charsetName), bufferSize, writeImmediately);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WriterOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public WriterOutputStream(final Writer writer, final Charset charset) {
        this(writer, charset, BUFFER_SIZE, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WriterOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public WriterOutputStream(final Writer writer, final String charsetName) {
        this(writer, charsetName, BUFFER_SIZE, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'LockableFileWriter' is still used
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public LockableFileWriter(final File file, final Charset charset, final boolean append, String lockDir) throws IOException {
        // init file to create/append
        final File absFile = Objects.requireNonNull(file, "file").getAbsoluteFile();
```

### DeprecatedIsStillUsed
Deprecated member 'LockableFileWriter' is still used
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public LockableFileWriter(final String fileName) throws IOException {
        this(fileName, false, null);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'LockableFileWriter' is still used
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public LockableFileWriter(final File file, final String charsetName) throws IOException {
        this(file, charsetName, false, null);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'LockableFileWriter' is still used
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public LockableFileWriter(final File file) throws IOException {
        this(file, false, null);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'IOExceptionWithCause' is still used
in `src/main/java/org/apache/commons/io/IOExceptionWithCause.java`
#### Snippet
```java
 */
@Deprecated
public class IOExceptionWithCause extends IOException {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'CloseShieldInputStream' is still used
in `src/main/java/org/apache/commons/io/input/CloseShieldInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public CloseShieldInputStream(final InputStream inputStream) {
        super(inputStream);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'UnsynchronizedByteArrayOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/UnsynchronizedByteArrayOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public UnsynchronizedByteArrayOutputStream(final int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Negative initial size: " + size);
```

### DeprecatedIsStillUsed
Deprecated member 'UnsynchronizedByteArrayOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/UnsynchronizedByteArrayOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public UnsynchronizedByteArrayOutputStream() {
        this(DEFAULT_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'BufferedFileChannelInputStream' is still used
in `src/main/java/org/apache/commons/io/input/BufferedFileChannelInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public BufferedFileChannelInputStream(final Path path) throws IOException {
        this(path, IOUtils.DEFAULT_BUFFER_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'BufferedFileChannelInputStream' is still used
in `src/main/java/org/apache/commons/io/input/BufferedFileChannelInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public BufferedFileChannelInputStream(final Path path, final int bufferSize) throws IOException {
        Objects.requireNonNull(path, "path");
        fileChannel = FileChannel.open(path, StandardOpenOption.READ);
```

### DeprecatedIsStillUsed
Deprecated member 'CloseShieldReader' is still used
in `src/main/java/org/apache/commons/io/input/CloseShieldReader.java`
#### Snippet
```java
     */
    @Deprecated
    public CloseShieldReader(final Reader reader) {
        super(reader);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'writeStringToFile' is still used
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void writeStringToFile(final File file, final String data) throws IOException {
        writeStringToFile(file, data, Charset.defaultCharset(), false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'readFileToString' is still used
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String readFileToString(final File file) throws IOException {
        return readFileToString(file, Charset.defaultCharset());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'writeStringToFile' is still used
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void writeStringToFile(final File file, final String data, final boolean append) throws IOException {
        writeStringToFile(file, data, Charset.defaultCharset(), append);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DirectoryWalker' is still used
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
 */
@Deprecated
public abstract class DirectoryWalker<T> {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'freeSpaceKb' is still used
in `src/main/java/org/apache/commons/io/FileSystemUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static long freeSpaceKb(final String path) throws IOException {
        return freeSpaceKb(path, -1);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'freeSpace' is still used
in `src/main/java/org/apache/commons/io/FileSystemUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static long freeSpace(final String path) throws IOException {
        return INSTANCE.freeSpaceOS(path, OS, false, Duration.ofMillis(-1));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'QueueInputStream' is still used
in `src/main/java/org/apache/commons/io/input/QueueInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public QueueInputStream(final BlockingQueue<Integer> blockingQueue) {
        this(blockingQueue, Duration.ZERO);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'UnsynchronizedByteArrayInputStream' is still used
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public UnsynchronizedByteArrayInputStream(final byte[] data, final int offset, final int length) {
        if (offset < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
```

### DeprecatedIsStillUsed
Deprecated member 'CopyUtils' is still used
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
 */
@Deprecated
public class CopyUtils {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ReadAheadInputStream' is still used
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public ReadAheadInputStream(final InputStream inputStream, final int bufferSizeInBytes) {
        this(inputStream, bufferSizeInBytes, newExecutorService(), true);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'CloseShieldOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/CloseShieldOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public CloseShieldOutputStream(final OutputStream outputStream) {
        super(outputStream);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'NullPrintStream' is still used
in `src/main/java/org/apache/commons/io/output/NullPrintStream.java`
#### Snippet
```java
     */
    @Deprecated
    public NullPrintStream() {
        // Relies on the default charset which is OK since we are not actually writing.
        super(NullOutputStream.INSTANCE);
```

### DeprecatedIsStillUsed
Deprecated member 'LINE_SEPARATOR' is still used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MessageDigestCalculatingInputStream' is still used
in `src/main/java/org/apache/commons/io/input/MessageDigestCalculatingInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public MessageDigestCalculatingInputStream(final InputStream inputStream, final MessageDigest messageDigest) {
        super(inputStream, new MessageDigestMaintainingObserver(messageDigest));
        this.messageDigest = messageDigest;
```

### DeprecatedIsStillUsed
Deprecated member 'MessageDigestCalculatingInputStream' is still used
in `src/main/java/org/apache/commons/io/input/MessageDigestCalculatingInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public MessageDigestCalculatingInputStream(final InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, getDefaultMessageDigest());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'readBasicFileAttributesUnchecked' is still used
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static BasicFileAttributes readBasicFileAttributesUnchecked(final Path path) {
        return readBasicFileAttributes(path, EMPTY_LINK_OPTION_ARRAY);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'NOFOLLOW_LINK_OPTION_ARRAY' is still used
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = {LinkOption.NOFOLLOW_LINKS};

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'readBasicFileAttributes' is still used
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static BasicFileAttributes readBasicFileAttributes(final Path path) throws IOException {
        return Files.readAttributes(path, BasicFileAttributes.class);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WildcardFilter' is still used
in `src/main/java/org/apache/commons/io/filefilter/WildcardFilter.java`
#### Snippet
```java
 */
@Deprecated
public class WildcardFilter extends AbstractFileFilter implements Serializable {

    private static final long serialVersionUID = -5037645902506953517L;
```

### DeprecatedIsStillUsed
Deprecated member 'WildcardFileFilter' is still used
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public WildcardFileFilter(final List<String> wildcards) {
        this(wildcards, IOCase.SENSITIVE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WildcardFileFilter' is still used
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public WildcardFileFilter(final String wildcard, final IOCase ioCase) {
        this(ioCase, wildcard);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WildcardFileFilter' is still used
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public WildcardFileFilter(final String... wildcards) {
        this(IOCase.SENSITIVE, wildcards);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'WildcardFileFilter' is still used
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public WildcardFileFilter(final String wildcard) {
        this(IOCase.SENSITIVE, requireWildcards(wildcard));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'RandomAccessFileInputStream' is still used
in `src/main/java/org/apache/commons/io/input/RandomAccessFileInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public RandomAccessFileInputStream(final RandomAccessFile file, final boolean closeOnClose) {
        this.randomAccessFile = Objects.requireNonNull(file, "file");
        this.closeOnClose = closeOnClose;
```

### DeprecatedIsStillUsed
Deprecated member 'RandomAccessFileInputStream' is still used
in `src/main/java/org/apache/commons/io/input/RandomAccessFileInputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public RandomAccessFileInputStream(final RandomAccessFile file) {
        this(file, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DeferredFileOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public DeferredFileOutputStream(final int threshold, final File outputFile) {
        this(threshold, outputFile, null, null, null, AbstractByteArrayOutputStream.DEFAULT_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DeferredFileOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public DeferredFileOutputStream(final int threshold, final int initialBufferSize, final String prefix, final String suffix, final File directory) {
        this(threshold, null, Objects.requireNonNull(prefix, "prefix"), suffix, directory, initialBufferSize);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DeferredFileOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public DeferredFileOutputStream(final int threshold, final int initialBufferSize, final File outputFile) {
        this(threshold, outputFile, null, null, null, initialBufferSize);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DeferredFileOutputStream' is still used
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public DeferredFileOutputStream(final int threshold, final String prefix, final String suffix, final File directory) {
        this(threshold, null, Objects.requireNonNull(prefix, "prefix"), suffix, directory, AbstractByteArrayOutputStream.DEFAULT_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'XmlStreamWriter' is still used
in `src/main/java/org/apache/commons/io/output/XmlStreamWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public XmlStreamWriter(final OutputStream out) {
        this(out, StandardCharsets.UTF_8);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final String fileName, final Charset charset) throws IOException {
        this(new File(fileName), charset, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final File file, final Charset charset) throws IOException {
        this(file, charset, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final File file, final CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("resource") // Call site is responsible for closing a new instance.
    public FileWriterWithEncoding(final File file, final String charsetName, final boolean append) throws IOException {
        this(initWriter(file, charsetName, append));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final String fileName, final CharsetEncoder encoding) throws IOException {
        this(new File(fileName), encoding, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final String fileName, final String charsetName) throws IOException {
        this(new File(fileName), charsetName, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileWriterWithEncoding' is still used
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public FileWriterWithEncoding(final File file, final String charsetName) throws IOException {
        this(file, charsetName, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ReversedLinesFileReader' is still used
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
     */
    @Deprecated
    public ReversedLinesFileReader(final File file, final int blockSize, final String charsetName) throws IOException {
        this(file.toPath(), blockSize, charsetName);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ReversedLinesFileReader' is still used
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
     */
    @Deprecated
    public ReversedLinesFileReader(final Path file, final int blockSize, final Charset charset) throws IOException {
        this.blockSize = blockSize;
        this.charset = Charsets.toCharset(charset);
```

### DeprecatedIsStillUsed
Deprecated member 'ReversedLinesFileReader' is still used
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
     */
    @Deprecated
    public ReversedLinesFileReader(final Path file, final Charset charset) throws IOException {
        this(file, DEFAULT_BLOCK_SIZE, charset);
    }
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `innerLoop1` on break statement
in `src/main/java/org/apache/commons/io/FileSystemUtils.java`
#### Snippet
```java
              // the free space bytes count
              bytesEnd = j + 1;
              break innerLoop1;
            }
            j--;
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `innerLoop2` on break statement
in `src/main/java/org/apache/commons/io/FileSystemUtils.java`
#### Snippet
```java
              // beginning of the free space bytes count
              bytesStart = j + 1;
              break innerLoop2;
            }
            j--;
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'invokeCleaner'
in `src/main/java/org/apache/commons/io/input/ByteBufferCleaner.java`
#### Snippet
```java
            field.setAccessible(true);
            theUnsafe = field.get(null);
            invokeCleaner = unsafeClass.getMethod("invokeCleaner", ByteBuffer.class);
        }

```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    public static void copyFile(final File srcFile, final File destFile, final boolean preserveFileDate) throws IOException {
        copyFile(srcFile, destFile, preserveFileDate, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
    }

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
        data[offset + 0] = (byte) (value >> 0 & 0xff);
        data[offset + 1] = (byte) (value >> 8 & 0xff);
        data[offset + 2] = (byte) (value >> 16 & 0xff);
        data[offset + 3] = (byte) (value >> 24 & 0xff);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
        if (eof) {
            throw new IOException("Read after end of file");
        }
        if (position == size) {
            return doEndOfFile();
        }
        position += length;
        int returnLength = length;
        if (position > size) {
            returnLength = length - (int)(position - size);
            position = size;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
        if (!markSupported) {
            throw UnsupportedOperationExceptions.reset();
        }
        if (mark < 0) {
            throw new IOException("No position has been marked");
        }
        if (position > mark + readlimit) {
            throw new IOException("Marked position [" + mark +
                    "] is no longer valid - passed the read limit [" +
                    readlimit + "]");
        }
        position = mark;
        eof = false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
        if (eof) {
            throw new IOException("Skip after end of file");
        }
        if (position == size) {
            return doEndOfFile();
        }
        position += numberOfBytes;
        long returnLength = numberOfBytes;
        if (position > size) {
            returnLength = numberOfBytes - (position - size);
            position = size;
        }
        return returnLength;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
        try {
            beforeRead(1);
            final int b = in.read();
            afterRead(b != EOF ? 1 : EOF);
            return b;
        } catch (final IOException e) {
            handleIOException(e);
            return EOF;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/UnixLineEndingInputStream.java`
#### Snippet
```java
        final int target = this.target.read();
        atEos = target == EOF;
        if (atEos) {
            return target;
        }
        atSlashLf = target == LF;
        atSlashCr = target == CR;
        return target;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
        if (cTEnc.equals(UTF_16BE) || cTEnc.equals(UTF_16LE)) {
            if (bomEnc != null) {
                final String msg = MessageFormat.format(HTTP_EX_1, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            }
            return cTEnc;
        }

        // UTF-16 content type encoding
        if (cTEnc.equals(UTF_16)) {
            if (bomEnc != null && bomEnc.startsWith(UTF_16)) {
                return bomEnc;
            }
            final String msg = MessageFormat.format(HTTP_EX_2, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
        if (bomEnc.equals(UTF_16BE) || bomEnc.equals(UTF_16LE)) {
            if (xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc)) {
                final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            if (xmlEnc != null && !xmlEnc.equals(UTF_16) && !xmlEnc.equals(bomEnc)) {
                final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            return bomEnc;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/io/output/ChunkedOutputStream.java`
#### Snippet
```java
        int bytes = length;
        int dstOffset = srcOffset;
        while(bytes > 0) {
            final int chunk = Math.min(bytes, chunkSize);
            out.write(data, dstOffset, chunk);
            bytes -= chunk;
            dstOffset += chunk;
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     * Pattern capturing the encoding of the "xml" processing instruction.
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);

    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     * Pattern capturing the encoding of the "xml" processing instruction.
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);

    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/SuffixFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file name ends with one of our suffixes
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/SizeFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file name matches
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/FileFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file is a file
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/NameFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file name matches
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/DirectoryFileFilter.java`
#### Snippet
```java
     * @param file the File to check
     *
     * @return true if the file is a directory
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/RegexFileFilter.java`
#### Snippet
```java
     * @param path the path
     * @param attributes the path attributes
     * @return true if the file name matches one of the regular expressions
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/AgeFileFilter.java`
#### Snippet
```java
     * @param file the File to check
     *
     * @return true if the file name matches
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/org/apache/commons/io/IOCase.java`
#### Snippet
```java
     * @param str1  the first string to compare, not null
     * @param str2  the second string to compare, not null
     * @return true if equal using the case rules
     * @throws NullPointerException if either string is null
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/IOFileFilter.java`
#### Snippet
```java
     *
     * @param path the Path to check.
     * @return true if this path matches the test.
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/SymbolicLinkFileFilter.java`
#### Snippet
```java
     *
     * @param path the File Path to check
     * @return true if the file exists and is a symbolic link to either another file or a directory.
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/PrefixFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file name starts with one of our prefixes
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/WildcardFilter.java`
#### Snippet
```java
     * @param file the file to check
     *
     * @return true if the file name matches one of the wildcards
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     * @param file the file to check
     *
     * @return true if the file name matches one of the wildcards.
     * @since 2.9.0
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/NotFileFilter.java`
#### Snippet
```java
     * @param file the File to check
     *
     * @return true if the filter returns false
     * @since 2.9.0
     */
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/commons/io/output/XmlStreamWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    public XmlStreamWriter(final File file, final String defaultEncoding) throws FileNotFoundException {
        this(new FileOutputStream(file), defaultEncoding);
    }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
     * The current position within the byte array {@code buf}.
     */
    protected int pos;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
     * The current limit, which when passed, invalidates the current mark.
     */
    protected int markLimit;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
     * The currently marked position. -1 indicates no mark has been set or the mark has been invalidated.
     */
    protected int markPos = IOUtils.EOF;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
     * The total number of bytes inside the byte array {@code buf}.
     */
    protected int count;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
     * The buffer containing the current bytes read from the target InputStream.
     */
    protected volatile byte[] buffer;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
         * Constructs a new initialized instance.
         */
        protected BigIntegerPathCounters() {
            super(Counters.bigIntegerCounter(), Counters.bigIntegerCounter(), Counters.bigIntegerCounter());
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
         * Constructs a new initialized instance.
         */
        protected LongPathCounters() {
            super(Counters.longCounter(), Counters.longCounter(), Counters.longCounter());
        }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `required == length ? IOUtils.EOF : length - required`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                read = localIn.read(buffer, offset, required);
                if (read == IOUtils.EOF) {
                    return required == length ? IOUtils.EOF : length - required;
                }
            } else {
```

### DuplicateExpressions
Multiple occurrences of `required == length ? IOUtils.EOF : length - required`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
            } else {
                if (fillBuffer(localIn, localBuf) == IOUtils.EOF) {
                    return required == length ? IOUtils.EOF : length - required;
                }
                // localBuf may have been invalidated by fillBuffer()
```

## RuleId[id=Deprecation]
### Deprecation
'toString(int)' is deprecated
in `src/main/java/org/apache/commons/io/output/AbstractByteArrayOutputStream.java`
#### Snippet
```java
 * to be copied to the new buffer. This class is designed to behave exactly
 * like the original. The only exception is the deprecated
 * {@link java.io.ByteArrayOutputStream#toString(int)} method that has been
 * ignored.
 * </p>
```

### Deprecation
'readBasicFileAttributes(java.nio.file.Path)' is deprecated
in `src/main/java/org/apache/commons/io/filefilter/PathVisitorFileFilter.java`
#### Snippet
```java
        try {
            final Path path = file.toPath();
            return visitFile(path, file.exists() ? PathUtils.readBasicFileAttributes(path) : null) == FileVisitResult.CONTINUE;
        } catch (final IOException e) {
            return handle(e) == FileVisitResult.CONTINUE;
```

### Deprecation
'readBasicFileAttributes(java.nio.file.Path)' is deprecated
in `src/main/java/org/apache/commons/io/filefilter/PathVisitorFileFilter.java`
#### Snippet
```java
        try {
            final Path path = dir.toPath().resolve(name);
            return accept(path, PathUtils.readBasicFileAttributes(path)) == FileVisitResult.CONTINUE;
        } catch (final IOException e) {
            return handle(e) == FileVisitResult.CONTINUE;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
        if (pos < count) {
            /* There are bytes available in the buffer. */
            final int copylength = count - pos >= length ? length : count - pos;
            System.arraycopy(localBuf, pos, buffer, offset, copylength);
            pos += copylength;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                }

                read = count - pos >= required ? required : count - pos;
                System.arraycopy(localBuf, pos, buffer, offset, read);
                pos += read;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
                        if (byteBuffer.position() > 0) {
                            byteBuffer.flip();
                            builder.append(StandardCharsets.UTF_8.decode(byteBuffer).toString());
                            byteBuffer.clear();
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/io/monitor/FileAlterationObserver.java`
#### Snippet
```java
        if (fileFilter != null) {
            builder.append(", ");
            builder.append(fileFilter.toString());
        }
        builder.append(", listeners=");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/io/comparator/ReverseFileComparator.java`
#### Snippet
```java
    @Override
    public String toString() {
        return super.toString() + "[" + delegate.toString() + "]";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/io/filefilter/NotFileFilter.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "NOT (" + filter.toString() + ")";
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/FilterCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // no allocation
    @Override
    public void write(final String str) throws IOException {
        forAllWriters(w -> w.write(str));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/FilterCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // no allocation
    @Override
    public void write(final char[] cbuf) throws IOException {
        forAllWriters(w -> w.write(cbuf));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/FilterCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // no allocation
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        forAllWriters(w -> w.write(cbuf, off, len));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/FilterCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // no allocation
    @Override
    public void write(final String str, final int off, final int len) throws IOException {
        forAllWriters(w -> w.write(str, off, len));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ClosedWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        throw new IOException("write(" + new String(cbuf) + ", " + off + ", " + len + ") failed: stream is closed");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/AppendableWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {
        // appendable.append will add "null" for a null String; add an explicit null check
        Objects.requireNonNull(str, "String is missing");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/AppendableWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        Objects.requireNonNull(cbuf, "Character array is missing");
        if (len < 0 || off + len > cbuf.length) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] chr) throws IOException {
        try {
            beforeRead(IOUtils.length(chr));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final CharBuffer target) throws IOException {
        try {
            beforeRead(IOUtils.length(target));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ReaderInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] array, int off, int len) throws IOException {
        Objects.requireNonNull(array, "array");
        if (len < 0 || off < 0 || off + len > array.length) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ReaderInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/AbstractByteArrayOutputStream.java`
#### Snippet
```java

    @Override
    public abstract void write(final byte[] b, final int off, final int len);

    /**
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b, int off, int len) throws IOException {
        while (len > 0) {
            final int c = Math.min(len, decoderIn.remaining());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/UncheckedFilterOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b) throws UncheckedIOException {
        Uncheck.accept(super::write, b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/UncheckedFilterOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b, final int off, final int len) throws UncheckedIOException {
        Uncheck.accept(super::write, b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ProxyOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] bts, final int st, final int end) throws IOException {
        try {
            beforeWrite(end);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ProxyOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] bts) throws IOException {
        try {
            final int len = IOUtils.length(bts);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        out.write(cbuf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf) throws IOException {
        out.write(cbuf);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {
        out.write(str, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str) throws IOException {
        out.write(str);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/BrokenWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        throw exceptionSupplier.get();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/MemoryMappedFileInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        ensureOpen();
        if (!buffer.hasRemaining()) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/BufferedFileChannelInputStream.java`
#### Snippet
```java

    @Override
    public synchronized int read(final byte[] b, final int offset, int len) throws IOException {
        if (offset < 0 || len < 0 || offset + len < 0 || offset + len > b.length) {
            throw new IndexOutOfBoundsException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ClosedReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf, final int off, final int len) {
        return EOF;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf, int off, int len) throws IOException {
        Objects.requireNonNull(cbuf, "cbuf");
        if (len < 0 || off < 0 || off + len > cbuf.length) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UnsynchronizedFilterInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buffer, final int offset, final int count) throws IOException {
        return inputStream.read(buffer, offset, count);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UnsynchronizedFilterInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buffer) throws IOException {
        return read(buffer, 0, buffer.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] bytes) throws IOException {
        return read(bytes, 0, bytes.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] bytes, final int offset, final int length) throws IOException {
        if (eof) {
            throw new IOException("Read after end of file");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/NullReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] chars) throws IOException {
        return read(chars, 0, chars.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/NullReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] chars, final int offset, final int length) throws IOException {
        if (eof) {
            throw new IOException("Read after end of file");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b, final int off, final int len) {
        // To /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b) throws IOException {
        // To /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ChunkedOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] data, final int srcOffset, final int length) throws IOException {
        int bytes = length;
        int dstOffset = srcOffset;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/StringBuilderWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String value) {
        if (value != null) {
            builder.append(value);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/StringBuilderWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] value, final int offset, final int length) {
        if (value != null) {
            builder.append(value, offset, length);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] bts) throws IOException {
        try {
            beforeRead(IOUtils.length(bts));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] bts, final int off, final int len) throws IOException {
        try {
            beforeRead(len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/SwappedDataInputStream.java`
#### Snippet
```java
     */
    @Override
    public void readFully(final byte[] data, final int offset, final int length) throws IOException, EOFException {
        int remaining = length;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/SwappedDataInputStream.java`
#### Snippet
```java
     */
    @Override
    public void readFully(final byte[] data) throws IOException, EOFException {
        readFully(data, 0, data.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] buf, final int offset, final int len) throws IOException {
        return reader.read(buf, offset, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] dest) {
        Objects.requireNonNull(dest, "dest");
        return read(dest, 0, dest.length);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] dest, final int off, final int len) {
        Objects.requireNonNull(dest, "dest");
        if (off < 0 || len < 0 || off + len > dest.length) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int offset, int len) throws IOException {
        if (offset < 0 || len < 0 || len > b.length - offset) {
            throw new IndexOutOfBoundsException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] array, int off, int len) throws IOException {
        Objects.requireNonNull(array, "array");
        if (len < 0 || off + len > array.length) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedFilterReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final CharBuffer target) throws UncheckedIOException {
        return Uncheck.apply(super::read, target);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedFilterReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf) throws UncheckedIOException {
        return Uncheck.apply(super::read, cbuf);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/buffer/CircularBufferInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] targetBuffer, final int offset, final int length) throws IOException {
        Objects.requireNonNull(targetBuffer, "targetBuffer");
        if (offset < 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedBufferedReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf) throws UncheckedIOException {
        return Uncheck.apply(super::read, cbuf);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedBufferedReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final CharBuffer target) throws UncheckedIOException {
        return Uncheck.apply(super::read, target);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedBufferedReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf, final int off, final int len) throws UncheckedIOException {
        return Uncheck.apply(super::read, cbuf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedFilterInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b) throws UncheckedIOException {
        return Uncheck.apply(super::read, b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/UncheckedFilterInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b, final int off, final int len) throws UncheckedIOException {
        return Uncheck.apply(super::read, b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/UncheckedFilterWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str) throws UncheckedIOException {
        Uncheck.accept(super::write, str);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/UncheckedFilterWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf) throws UncheckedIOException {
        Uncheck.accept(super::write, cbuf);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str) {
        //to /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] chr, final int st, final int end) {
        //to /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] chr) {
        //to /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str, final int st, final int end) {
        //to /dev/null
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/CharSequenceReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] array, final int offset, final int length) {
        if (idx >= end()) {
            return EOF;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ProxyWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf) throws IOException {
        try {
            final int len = IOUtils.length(cbuf);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ProxyWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String str) throws IOException {
        try {
            final int len = IOUtils.length(str);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/BrokenReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf, final int off, final int len) throws IOException {
        throw exceptionSupplier.get();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/BoundedInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        if (isMaxLength()) {
            onMaxLength(maxCount, count);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/BoundedInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b) throws IOException {
        return this.read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/ThresholdingOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        checkThreshold(len);
        getStream().write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] cbuf, final int off, final int len) throws IOException {
        int c;
        for (int i = 0; i < len; i++) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/RandomAccessFileInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] bytes) throws IOException {
        return randomAccessFile.read(bytes);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/input/RandomAccessFileInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] bytes, final int offset, final int length) throws IOException {
        return randomAccessFile.read(bytes, offset, length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/io/output/XmlStreamWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        if (prologWriter != null) {
            detectEncoding(cbuf, off, len);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     *   Socket socket = null;
     *   try {
     *       socket = new Socket("http://www.foo.com/", 80);
     *       // process socket
     *       socket.close();
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
    private final Charset charset;
    private final SeekableByteChannel channel;
    private final long totalByteLength;
    private final long totalBlockCount;
    private final byte[][] newLineSequences;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
    private final SeekableByteChannel channel;
    private final long totalByteLength;
    private final long totalBlockCount;
    private final byte[][] newLineSequences;
    private final int avoidNewlineSplitBufferSize;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java
            try {
                executorService.shutdownNow();
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (final InterruptedException e) {
                final InterruptedIOException iio = new InterruptedIOException(e.getMessage());
```

### IgnoreResultOfCall
Result of `CharSequenceInputStream.read()` is ignored
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java
        long skipped = 0;
        while (n > 0 && available() > 0) {
            this.read();
            n--;
            skipped++;
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `reaper`
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        exitWhenFinished = true;
        if (reaper != null) {
            synchronized (reaper) {
                reaper.interrupt();
            }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
            validOctets++;
        }
        return validOctets <= IPV6_MAX_HEX_GROUPS && (validOctets >= IPV6_MAX_HEX_GROUPS || containsCompressedZeroes);
    }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
                break;
            }
            nextReader();
        }
        return c;
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
        do { // NOPMD
             // empty
        } while (nextReader() != null);
    }

```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
            final int readLen = reader.read(cbuf, off, len);
            if (readLen == EOF) {
                nextReader();
            } else {
                count += readLen;
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
    public static Stream<Path> walk(final Path start, final PathFilter pathFilter, final int maxDepth, final boolean readAttributes,
        final FileVisitOption... options) throws IOException {
        return Files.walk(start, maxDepth, options)
            .filter(path -> pathFilter.accept(path, readAttributes ? readBasicFileAttributesUnchecked(path) : null) == FileVisitResult.CONTINUE);
    }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
                    tracker.clear();
                } catch (final InterruptedException e) {
                    continue;
                }
            }
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedShort(final OutputStream output, final short value) throws IOException {
        output.write((byte) (value >> 0 & 0xff));
        output.write((byte) (value >> 8 & 0xff));
    }
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedLong(final OutputStream output, final long value) throws IOException {
        output.write((byte) (value >> 0 & 0xff));
        output.write((byte) (value >> 8 & 0xff));
        output.write((byte) (value >> 16 & 0xff));
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
    public static int swapInteger(final int value) {
        return
            ((value >> 0 & 0xff) << 24) +
            ((value >> 8 & 0xff) << 16) +
            ((value >> 16 & 0xff) << 8) +
```

### PointlessBitwiseExpression
`(value >> 24 & 0xff) << 0` can be replaced with '(value \>\> 24 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
            ((value >> 8 & 0xff) << 16) +
            ((value >> 16 & 0xff) << 8) +
            ((value >> 24 & 0xff) << 0);
    }

```

### PointlessBitwiseExpression
`(data[offset + 0] & 0xff) << 0` can be replaced with '(data\[offset + 0\] \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static short readSwappedShort(final byte[] data, final int offset) {
        return (short)(((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8));
    }
```

### PointlessBitwiseExpression
`(value1 & 0xff) << 0` can be replaced with '(value1 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
        final int value3 = read(input);
        final int value4 = read(input);
        final long low = ((value1 & 0xff) << 0) + ((value2 & 0xff) << 8) + ((value3 & 0xff) << 16);
        final long high = value4 & 0xff;
        return (high << 24) + (0xffffffffL & low);
```

### PointlessBitwiseExpression
`(value1 & 0xff) << 0` can be replaced with '(value1 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
        final int value3 = read(input);
        final int value4 = read(input);
        return ((value1 & 0xff) << 0) + ((value2 & 0xff) << 8) + ((value3 & 0xff) << 16) + ((value4 & 0xff) << 24);
    }

```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
    public static long swapLong(final long value) {
        return
            ((value >> 0 & 0xff) << 56) +
            ((value >> 8 & 0xff) << 48) +
            ((value >> 16 & 0xff) << 40) +
```

### PointlessBitwiseExpression
`(value >> 56 & 0xff) << 0` can be replaced with '(value \>\> 56 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
            ((value >> 40 & 0xff) << 16) +
            ((value >> 48 & 0xff) << 8) +
            ((value >> 56 & 0xff) << 0);
    }

```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedShort(final byte[] data, final int offset, final short value) {
        data[offset + 0] = (byte)(value >> 0 & 0xff);
        data[offset + 1] = (byte)(value >> 8 & 0xff);
    }
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedInteger(final OutputStream output, final int value) throws IOException {
        output.write((byte) (value >> 0 & 0xff));
        output.write((byte) (value >> 8 & 0xff));
        output.write((byte) (value >> 16 & 0xff));
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedLong(final byte[] data, final int offset, final long value) {
        data[offset + 0] = (byte) (value >> 0 & 0xff);
        data[offset + 1] = (byte) (value >> 8 & 0xff);
        data[offset + 2] = (byte) (value >> 16 & 0xff);
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static void writeSwappedInteger(final byte[] data, final int offset, final int value) {
        data[offset + 0] = (byte) (value >> 0 & 0xff);
        data[offset + 1] = (byte) (value >> 8 & 0xff);
        data[offset + 2] = (byte) (value >> 16 & 0xff);
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static short swapShort(final short value) {
        return (short) (((value >> 0 & 0xff) << 8) +
            ((value >> 8 & 0xff) << 0));
    }
```

### PointlessBitwiseExpression
`(value >> 8 & 0xff) << 0` can be replaced with '(value \>\> 8 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
    public static short swapShort(final short value) {
        return (short) (((value >> 0 & 0xff) << 8) +
            ((value >> 8 & 0xff) << 0));
    }

```

### PointlessBitwiseExpression
`(data[offset + 0] & 0xff) << 0` can be replaced with '(data\[offset + 0\] \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static long readSwappedUnsignedInteger(final byte[] data, final int offset) {
        final long low = ((data[offset + 0] & 0xff) << 0) +
                     ((data[offset + 1] & 0xff) << 8) +
                     ((data[offset + 2] & 0xff) << 16);
```

### PointlessBitwiseExpression
`(read(input) & 0xff) << 0` can be replaced with '(read(input) \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static short readSwappedShort(final InputStream input) throws IOException {
        return (short) (((read(input) & 0xff) << 0) + ((read(input) & 0xff) << 8));
    }

```

### PointlessBitwiseExpression
`(value1 & 0xff) << 0` can be replaced with '(value1 \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
        final int value2 = read(input);

        return ((value1 & 0xff) << 0) + ((value2 & 0xff) << 8);
    }

```

### PointlessBitwiseExpression
`(data[offset + 0] & 0xff) << 0` can be replaced with '(data\[offset + 0\] \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static int readSwappedUnsignedShort(final byte[] data, final int offset) {
        return ((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8);
    }
```

### PointlessBitwiseExpression
`(data[offset + 0] & 0xff) << 0` can be replaced with '(data\[offset + 0\] \& 0xff)'
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
     */
    public static int readSwappedInteger(final byte[] data, final int offset) {
        return ((data[offset + 0] & 0xff) << 0) +
            ((data[offset + 1] & 0xff) << 8) +
            ((data[offset + 2] & 0xff) << 16) +
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00e9` can be replaced with 'é'
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
            return;
        }
        final String TEST_STRING_2 = "v\u00e9s";
        final byte[] bytes = TEST_STRING_2.getBytes(charset);

```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
                permissions.addAll(updatePermissions);
            } else {
                permissions.removeAll(updatePermissions);
            }
            Files.setPosixFilePermissions(path, permissions);
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\".[^\"]*\")`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     * Pattern capturing the encoding of the "xml" processing instruction.
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);

    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'.[^']*')`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     * Pattern capturing the encoding of the "xml" processing instruction.
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);

    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/commons/io/ThreadUtils.java`
#### Snippet
```java
        Duration remainingDuration = duration;
        do {
            Thread.sleep(remainingDuration.toMillis(), getNanosOfMilli(remainingDuration));
            remainingDuration = Duration.between(Instant.now(), finishInstant);
        } while (!remainingDuration.isNegative());
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
        final Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path, linkOptions);
        // @formatter:off
        final List<PosixFilePermission> readPermissions = Arrays.asList(
                PosixFilePermission.OWNER_READ
                //PosixFilePermission.GROUP_READ,
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
                //PosixFilePermission.OTHERS_READ
            );
        final List<PosixFilePermission> writePermissions = Arrays.asList(
                PosixFilePermission.OWNER_WRITE
                //PosixFilePermission.GROUP_WRITE,
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/commons/io/CloseableURLConnection.java`
#### Snippet
```java

    @Override
    public boolean equals(final Object obj) {
        return urlConnection.equals(obj);
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `localBuf != buffer` is always `false`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                }
                // localBuf may have been invalidated by fillBuffer()
                if (localBuf != buffer) {
                    localBuf = buffer;
                    if (localBuf == null) {
```

### ConstantValue
Condition `INSTANCE != null` is always `true`
in `src/main/java/org/apache/commons/io/input/ByteBufferCleaner.java`
#### Snippet
```java
     */
    static boolean isSupported() {
        return INSTANCE != null;
    }
}
```

### ConstantValue
Value `readOnly` is always 'true'
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
            // RO
            // File, then parent dir (if any).
            setPosixReadOnlyFile(path, readOnly, linkOptions);
            setPosixDeletePermissions(parent, false, linkOptions);
        } else {
```

