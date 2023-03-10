# commons-io 
 
# Bad smells
I found 419 bad smells with 23 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 64 | false |
| RedundantSuppression | 43 | false |
| ReturnNull | 33 | false |
| BoundedWildcard | 31 | false |
| AssignmentToMethodParameter | 30 | false |
| PointlessBitwiseExpression | 20 | false |
| PublicFieldAccessedInSynchronizedContext | 19 | false |
| DeprecatedIsStillUsed | 18 | false |
| MismatchedJavadocCode | 14 | false |
| NestedAssignment | 13 | false |
| EmptyMethod | 13 | false |
| UtilityClassWithoutPrivateConstructor | 13 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| PointlessArithmeticExpression | 7 | false |
| UtilityClassWithPublicConstructor | 7 | false |
| MethodOverridesStaticMethod | 6 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 6 | false |
| UnnecessaryBoxing | 6 | false |
| MissortedModifiers | 5 | false |
| AssignmentToForLoopParameter | 5 | false |
| DataFlowIssue | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| WhileLoopSpinsOnField | 3 | false |
| SynchronizeOnThis | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| CommentedOutCode | 2 | false |
| RegExpSimplifiable | 2 | false |
| DuplicateExpressions | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| ExceptionNameDoesntEndWithException | 2 | false |
| ArrayEquality | 2 | false |
| ConstantValue | 2 | false |
| IOResource | 2 | false |
| Convert2MethodRef | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| Finalize | 1 | false |
| MagicConstant | 1 | false |
| StaticInitializerReferencesSubClass | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| IgnoreResultOfCall | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| SystemOutErr | 1 | false |
| UnnecessaryContinue | 1 | false |
| BusyWait | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/io/input/AutoCloseInputStream.java`
#### Snippet
```java
     */
    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
```

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
    public static void writeSwappedShort(final byte[] data, final int offset, final short value) {
        data[offset + 0] = (byte)(value >> 0 & 0xff);
        data[offset + 1] = (byte)(value >> 8 & 0xff);
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

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

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
                if (fillbuf(localIn, localBuf) == IOUtils.EOF) {
                    return required == length ? IOUtils.EOF : length - required;
                }
                // localBuf may have been invalidated by fillbuf
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `match &= k >= 0 && data[k] == newLineSequence[j]`
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
                for (int j = newLineSequence.length - 1; j >= 0; j--) {
                    final int k = i + j - (newLineSequence.length - 1);
                    match &= k >= 0 && data[k] == newLineSequence[j];
                }
                if (match) {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends IOException`
in `src/main/java/org/apache/commons/io/input/BrokenReader.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public BrokenReader(final Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends IOFileFilter`
in `src/main/java/org/apache/commons/io/filefilter/OrFileFilter.java`
#### Snippet
```java
     */
    @Override
    public void setFileFilters(final List<IOFileFilter> fileFilters) {
        this.fileFilters.clear();
        this.fileFilters.addAll(Objects.requireNonNull(fileFilters, "fileFilters"));
```

### BoundedWildcard
Can generalize to `? extends IOFileFilter`
in `src/main/java/org/apache/commons/io/filefilter/AndFileFilter.java`
#### Snippet
```java
     */
    @Override
    public void setFileFilters(final List<IOFileFilter> fileFilters) {
        this.fileFilters.clear();
        this.fileFilters.addAll(fileFilters);
```

### BoundedWildcard
Can generalize to `? super Path`
in `src/main/java/org/apache/commons/io/filefilter/RegexFileFilter.java`
#### Snippet
```java
     * @since 2.10.0
     */
    public RegexFileFilter(final Pattern pattern, final Function<Path, String> pathToString) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `src/main/java/org/apache/commons/io/input/BrokenInputStream.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public BrokenInputStream(final Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `src/main/java/org/apache/commons/io/output/BrokenOutputStream.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public BrokenOutputStream(final Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/io/function/IOConsumer.java`
#### Snippet
```java
     * @since 2.12.0
     */
    static <T> void forEach(final T[] array, final IOConsumer<T> action) throws IOException {
        IOStreams.forEach(IOStreams.of(array), action);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/io/function/IOConsumer.java`
#### Snippet
```java
     */
    @SafeVarargs
    static <T> void forAll(final IOConsumer<T> action, final T... array) throws IOExceptionList {
        IOStreams.forAll(IOStreams.of(array), action);
    }
```

### BoundedWildcard
Can generalize to `? super Path`
in `src/main/java/org/apache/commons/io/file/AccumulatorPathVisitor.java`
#### Snippet
```java
    }

    private void add(final List<Path> list, final Path dir) {
        list.add(dir.normalize());
    }
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `src/main/java/org/apache/commons/io/output/BrokenWriter.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public BrokenWriter(final Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
    }

    private Path toPath(final File file, final Supplier<Path> defaultPathSupplier) {
        return file != null ? file.toPath() : defaultPathSupplier == null ? null : defaultPathSupplier.get();
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/io/function/IOStreams.java`
#### Snippet
```java

    @SuppressWarnings("unused") // IOStreams.rethrow() throws
    static <T> void forEach(final Stream<T> stream, final IOConsumer<T> action) throws IOException {
        final IOConsumer<T> actualAction = toIOConsumer(action);
        of(stream).forEach(e -> Erase.accept(actualAction, e));
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/commons/io/filefilter/FileFilterUtils.java`
#### Snippet
```java
     * @throws NullPointerException if the filter is {@code null}.
     */
    private static <R, A> R filterFiles(final IOFileFilter filter, final Stream<File> stream,
        final Collector<? super File, A, R> collector) {
        Objects.requireNonNull(filter, "filter");
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
    }

    private static <R, A> R filterPaths(final PathFilter filter, final Stream<Path> stream, final Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(filter, "filter");
        Objects.requireNonNull(collector, "collector");
```

### BoundedWildcard
Can generalize to `? super PosixFileAttributes`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java

    private static <R> R withPosixFileAttributes(final Path path, final LinkOption[] linkOptions, final boolean overrideReadOnly,
        final IOFunction<PosixFileAttributes, R> function) throws IOException {
        final PosixFileAttributes posixFileAttributes = overrideReadOnly ? readPosixFileAttributes(path, linkOptions) : null;
        try {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @return A collection of relativized paths, optionally sorted.
     */
    static List<Path> relativize(final Collection<Path> collection, final Path parent, final boolean sort, final Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream().map(parent::relativize);
        if (sort) {
```

### BoundedWildcard
Can generalize to `? extends Closeable`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public static void closeQuietly(final Stream<Closeable> closeables) {
        if (closeables != null) {
            closeables.forEach(IOUtils::closeQuietly);
```

### BoundedWildcard
Can generalize to `? super IOException`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     * @since 2.7
     */
    public static void closeQuietly(final Closeable closeable, final Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super IOException`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     * @since 2.7
     */
    public static void close(final Closeable closeable, final IOConsumer<IOException> consumer) throws IOException {
        if (closeable != null) {
            try {
```

### BoundedWildcard
Can generalize to `? extends Closeable`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     * @since 2.12.0
     */
    public static void closeQuietly(final Iterable<Closeable> closeables) {
        if (closeables != null) {
            closeables.forEach(IOUtils::closeQuietly);
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     * @since 2.6
     */
    public static void copyToDirectory(final Iterable<File> sourceIterable, final File destinationDir) throws IOException {
        Objects.requireNonNull(sourceIterable, "sourceIterable");
        for (final File src : sourceIterable) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
    }

    private static List<File> toList(final Stream<File> stream) {
        return stream.collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     * @throws IOExceptionList if any I/O errors occur.
     */
    default void forAll(final IOConsumer<T> action, final BiFunction<Integer, IOException, IOException> exSupplier) throws IOExceptionList {
        final AtomicReference<List<IOException>> causeList = new AtomicReference<>();
        final AtomicInteger index = new AtomicInteger();
```

### BoundedWildcard
Can generalize to `? super IOException`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     * @throws IOExceptionList if any I/O errors occur.
     */
    default void forAll(final IOConsumer<T> action, final BiFunction<Integer, IOException, IOException> exSupplier) throws IOExceptionList {
        final AtomicReference<List<IOException>> causeList = new AtomicReference<>();
        final AtomicInteger index = new AtomicInteger();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     * @throws IOExceptionList if any I/O errors occur.
     */
    default void forAll(final IOConsumer<T> action, final BiFunction<Integer, IOException, IOException> exSupplier) throws IOExceptionList {
        final AtomicReference<List<IOException>> causeList = new AtomicReference<>();
        final AtomicInteger index = new AtomicInteger();
```

### BoundedWildcard
Can generalize to `? super U`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <U> U reduce(final U identity, final IOBiFunction<U, ? super T, U> accumulator, final IOBinaryOperator<U> combiner) throws IOException {
        return unwrap().reduce(identity, (t, u) -> Erase.apply(accumulator, t, u), (t, u) -> Erase.apply(combiner, t, u));
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <U> U reduce(final U identity, final IOBiFunction<U, ? super T, U> accumulator, final IOBinaryOperator<U> combiner) throws IOException {
        return unwrap().reduce(identity, (t, u) -> Erase.apply(accumulator, t, u), (t, u) -> Erase.apply(combiner, t, u));
    }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <R> R collect(final IOSupplier<R> supplier, final IOBiConsumer<R, ? super T> accumulator, final IOBiConsumer<R, R> combiner) throws IOException {
        return unwrap().collect(() -> Erase.get(supplier), (t, u) -> Erase.accept(accumulator, t, u), (t, u) -> Erase.accept(combiner, t, u));
    }
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <R> R collect(final IOSupplier<R> supplier, final IOBiConsumer<R, ? super T> accumulator, final IOBiConsumer<R, R> combiner) throws IOException {
        return unwrap().collect(() -> Erase.get(supplier), (t, u) -> Erase.accept(accumulator, t, u), (t, u) -> Erase.accept(combiner, t, u));
    }
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <R> R collect(final IOSupplier<R> supplier, final IOBiConsumer<R, ? super T> accumulator, final IOBiConsumer<R, R> combiner) throws IOException {
        return unwrap().collect(() -> Erase.get(supplier), (t, u) -> Erase.accept(accumulator, t, u), (t, u) -> Erase.accept(combiner, t, u));
    }
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // thrown by Erase.
    default <R> R collect(final IOSupplier<R> supplier, final IOBiConsumer<R, ? super T> accumulator, final IOBiConsumer<R, R> combiner) throws IOException {
        return unwrap().collect(() -> Erase.get(supplier), (t, u) -> Erase.accept(accumulator, t, u), (t, u) -> Erase.accept(combiner, t, u));
    }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
     * Counts using a {@code long} number.
     */
    private final static class LongCounter implements Counter {

        private long value;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
     * Counts files, directories, and sizes, as a visit proceeds, using BigInteger numbers.
     */
    private final static class BigIntegerPathCounters extends AbstractPathCounters {

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
     * Counts files, directories, and sizes, as a visit proceeds, using long numbers.
     */
    private final static class LongPathCounters extends AbstractPathCounters {

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
     * Counts nothing.
     */
    private final static class NoopCounter implements Counter {

        static final NoopCounter INSTANCE = new NoopCounter();
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/commons/io/input/ObservableInputStream.java`
#### Snippet
```java
     * Abstracts observer callback for {@link ObservableInputStream}s.
     */
    public static abstract class Observer {

        /**
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java
            // There is only one reader, and one writer, so the writer should signal only once,
            // but a while loop checking the wake-up condition is still needed to avoid spurious wakeups.
            while (readInProgress) {
                asyncReadComplete.await();
            }
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
        }
        int count = 0;
        while (reader != null) {
            final int readLen = reader.read(cbuf, off, len);
            if (readLen == EOF) {
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
    public int read() throws IOException {
        int c = EOF;
        while (reader != null) {
            c = reader.read();
            if (c != EOF) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/input/Tailer.java`
#### Snippet
```java
            int num;
            boolean seenCR = false;
            while (getRun() && (num = reader.read(inbuf)) != EOF) {
                for (int i = 0; i < num; i++) {
                    final byte ch = inbuf[i];
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java

                // --- check for newline ---
                if ((newLineMatchByteCount = getNewLineMatchByteCount(data, i)) > 0 /* found newline */) {
                    final int lineStart = i + 1;
                    final int lineLengthBytes = currentLastBytePos - lineStart + 1;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
            // Reassign buf, which will invalidate any local references
            // FIXME: what if buf was null?
            localBuf = buf = newbuf;
        } else if (markpos > 0) {
            System.arraycopy(localBuf, markpos, localBuf, 0, localBuf.length - markpos);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
        /* Set the new position and mark position */
        pos -= markpos;
        count = markpos = 0;
        final int bytesread = localIn.read(localBuf, pos, localBuf.length - pos);
        count = bytesread <= 0 ? pos : pos + bytesread;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
        int count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
        int count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n;
        while (EOF != (n = reader.read(buffer))) {
            writer.write(buffer, 0, n);
            count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        int read;

        while (offset < size && (read = input.read(data, offset, size - offset)) != EOF) {
            offset += read;
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        int read;
        long totalRead = 0;
        while (bytesToRead > 0 && EOF != (read = reader.read(buffer, 0, bytesToRead))) {
            writer.write(buffer, 0, read);
            totalRead += read;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        int read;
        long totalRead = 0;
        while (bytesToRead > 0 && EOF != (read = input.read(buffer, 0, bytesToRead))) {
            output.write(buffer, 0, read);
            totalRead += read;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n;
        while (EOF != (n = inputStream.read(buffer))) {
            outputStream.write(buffer, 0, n);
            count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n;
        while (EOF != (n = reader.read(buffer))) {
            buffer.flip();
            output.append(buffer, 0, n);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
            @Override
            public T next() {
                return t = t == IOStreams.NONE ? seed : Erase.apply(f, t);
            }
        };
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `mark` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullReader.java`
#### Snippet
```java
    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
    private boolean eof;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `position` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullReader.java`
#### Snippet
```java

    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eof` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullReader.java`
#### Snippet
```java
    private long mark = -1;
    private long readlimit;
    private boolean eof;
    private final boolean throwEofException;
    private final boolean markSupported;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `firstBytes` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int[] firstBytes;
    private int fbLength;
    private int fbIndex;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fbIndex` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
    private int[] firstBytes;
    private int fbLength;
    private int fbIndex;
    private int markFbIndex;
    private boolean markedAtStart;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/BoundedInputStream.java`
#### Snippet
```java

    /** the number of bytes already returned */
    private long pos;

    /** the marked position */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `q` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
     * Queue of {@link Tracker} instances being watched.
     */
    ReferenceQueue<Object> q = new ReferenceQueue<>();
    /**
     * Collection of {@link Tracker} instances in existence.
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `branch` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/output/TeeOutputStream.java`
#### Snippet
```java
     * TODO Make private and final in 3.0.
     */
    protected OutputStream branch;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eof` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
    private long mark = -1;
    private long readlimit;
    private boolean eof;
    private final boolean throwEofException;
    private final boolean markSupported;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mark` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java
    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
    private boolean eof;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `position` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/io/input/NullInputStream.java`
#### Snippet
```java

    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleEnd(final Collection<T> results) throws IOException {
        // do nothing - overridable by subclass
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleRestricted(final File directory, final int depth, final Collection<T> results) throws
            IOException {
        // do nothing - overridable by subclass
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleStart(final File startDirectory, final Collection<T> results) throws IOException {
        // do nothing - overridable by subclass
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeRead(final int n) throws IOException {
        // no-op
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterRead(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeRead(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
All implementations of this method are empty
in `src/main/java/org/apache/commons/io/monitor/FileAlterationListener.java`
#### Snippet
```java
     * @param observer The file system observer
     */
    void onStop(final FileAlterationObserver observer);
}

```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/monitor/FileAlterationObserver.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    public void destroy() throws Exception {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/output/ProxyCollectionWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterWrite(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/output/ProxyCollectionWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeWrite(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/output/ProxyOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterWrite(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/output/ProxyWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterWrite(final int n) throws IOException {
        // noop
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/io/output/ProxyWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeWrite(final int n) throws IOException {
        // noop
    }
```

## RuleId[id=PointlessBitwiseExpression]
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
     */
    public static void writeSwappedInteger(final OutputStream output, final int value) throws IOException {
        output.write((byte) (value >> 0 & 0xff));
        output.write((byte) (value >> 8 & 0xff));
        output.write((byte) (value >> 16 & 0xff));
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-10-18-48-07.182.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `IOExceptionWithCause` does not end with 'Exception'
in `src/main/java/org/apache/commons/io/IOExceptionWithCause.java`
#### Snippet
```java
 */
@Deprecated
public class IOExceptionWithCause extends IOException {

    /**
```

### ExceptionNameDoesntEndWithException
Exception class name `IOExceptionList` does not end with 'Exception'
in `src/main/java/org/apache/commons/io/IOExceptionList.java`
#### Snippet
```java
 * @since 2.7
 */
public class IOExceptionList extends IOException implements Iterable<Throwable> {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java
            } catch (final Throwable ex) {
                exception = ex;
                if (ex instanceof Error) {
                    // `readException` may not be reported to the user. Rethrow Error to make sure at least
                    // The user can see Error in UncaughtExceptionHandler.
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
        }
        // localBuf may have been invalidated by fillbuf
        if (localBuf != buf) {
            localBuf = buf;
            if (localBuf == null) {
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                }
                // localBuf may have been invalidated by fillbuf
                if (localBuf != buf) {
                    localBuf = buf;
                    if (localBuf == null) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/io/output/ByteArrayOutputStream.java`
#### Snippet
```java
            throw new IllegalArgumentException("Negative initial size: " + size);
        }
        synchronized (this) {
            needNewBuffer(size);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/io/output/ByteArrayOutputStream.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            writeImpl(b, off, len);
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    private void createLock() throws IOException {
        synchronized (LockableFileWriter.class) {
            if (!lockFile.createNewFile()) {
                throw new IOException("Can't write file, lock " + lockFile.getAbsolutePath() + " exists");
```

## RuleId[id=ConstantValue]
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `withLongCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/DeletingPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static DeletingPathVisitor withLongCounters() {
        return new DeletingPathVisitor(Counters.longPathCounters());
    }
```

### MethodOverridesStaticMethod
Method `withBigIntegerCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/DeletingPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static DeletingPathVisitor withBigIntegerCounters() {
        return new DeletingPathVisitor(Counters.bigIntegerPathCounters());
    }
```

### MethodOverridesStaticMethod
Method `withBigIntegerCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/CleaningPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static CountingPathVisitor withBigIntegerCounters() {
        return new CleaningPathVisitor(Counters.bigIntegerPathCounters());
    }
```

### MethodOverridesStaticMethod
Method `withLongCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/CleaningPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static CountingPathVisitor withLongCounters() {
        return new CleaningPathVisitor(Counters.longPathCounters());
    }
```

### MethodOverridesStaticMethod
Method `withLongCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/AccumulatorPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static AccumulatorPathVisitor withLongCounters() {
        return new AccumulatorPathVisitor(Counters.longPathCounters());
    }
```

### MethodOverridesStaticMethod
Method `withBigIntegerCounters()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/io/file/AccumulatorPathVisitor.java`
#### Snippet
```java
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static AccumulatorPathVisitor withBigIntegerCounters() {
        return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters());
    }
```

## RuleId[id=IOResource]
### IOResource
'StreamIterator' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/io/StreamIterator.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller MUST close or iterate to the end.
    public static <T> Iterator<T> iterator(final Stream<T> stream) {
        return new StreamIterator<>(stream).iterator;
    }

```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
            if (bytesRead > 0) {
                inputStream.reset();
                final BufferedReader bReader = new BufferedReader(new StringReader(xmlProlog.substring(0, firstGT + 1)));
                final StringBuilder prolog = new StringBuilder();
                IOConsumer.forEach(bReader.lines(), prolog::append);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/ThreadUtils.java`
#### Snippet
```java
 * @since 2.12.0
 */
public class ThreadUtils {

    static int getNanosOfMilli(final Duration duration) {
```

### UtilityClassWithoutPrivateConstructor
Class `EndianUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
 * @see org.apache.commons.io.input.SwappedDataInputStream
 */
public class EndianUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Counters` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
 * @since 2.7
 */
public class Counters {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `HexDump` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/HexDump.java`
#### Snippet
```java
 * </p>
 */
public class HexDump {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Charsets` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
 * @since 2.3
 */
public class Charsets {

    //
```

### UtilityClassWithoutPrivateConstructor
Class `UnsupportedOperationExceptions` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/input/UnsupportedOperationExceptions.java`
#### Snippet
```java
 * </p>
 */
class UnsupportedOperationExceptions {

    private static final String MARK_RESET = "mark/reset";
```

### UtilityClassWithoutPrivateConstructor
Class `FileCleaner` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/FileCleaner.java`
#### Snippet
```java
 */
@Deprecated
public class FileCleaner {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ByteBufferCleaner` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/input/ByteBufferCleaner.java`
#### Snippet
```java
 * </p>
 */
class ByteBufferCleaner {

    private interface Cleaner {
```

### UtilityClassWithoutPrivateConstructor
Class `FilenameUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
 * @since 1.1
 */
public class FilenameUtils {

    private static final String[] EMPTY_STRING_ARRAY = {};
```

### UtilityClassWithoutPrivateConstructor
Class `FileFilterUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/filefilter/FileFilterUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class FileFilterUtils {

    /* Constructed on demand and then cached */
```

### UtilityClassWithoutPrivateConstructor
Class `CopyUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
 */
@Deprecated
public class CopyUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
 * </p>
 */
public class IOUtils {
    // NOTE: This class is focused on InputStream, OutputStream, Reader and
    // Writer. Each method should take at least one of these as a parameter,
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
 * </p>
 */
public class FileUtils {

    /**
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'LockableFileWriter' is still used
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
     */
    @Deprecated
    public LockableFileWriter(final File file, final boolean append, final String lockDir) throws IOException {
        this(file, Charset.defaultCharset(), append, lockDir);
    }
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/io/function/UncheckedIOBaseStream.java`
#### Snippet
```java
    @Override
    public B onClose(final Runnable closeHandler) {
        return Uncheck.apply(delegate::onClose, () -> closeHandler.run()).unwrap();
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/io/function/IOPredicate.java`
#### Snippet
```java
     */
    static <T> IOPredicate<T> isEqual(final Object target) {
        return null == target ? Objects::isNull : object -> target.equals(object);
    }

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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override")
    @Override
    public void mark(final int readlimit) {
        this.markedOffset = this.offset;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override")
    @Override
    public void reset() {
        this.offset = this.markedOffset;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/UnsynchronizedFilterInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override") // by design.
    @Override
    public void reset() throws IOException {
        in.reset();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/UnsynchronizedFilterInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override") // by design.
    @Override
    public void mark(final int readlimit) {
        in.mark(readlimit);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/MarkShieldInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override")
    @Override
    public void reset() throws IOException {
        throw UnsupportedOperationExceptions.reset();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `src/main/java/org/apache/commons/io/input/MarkShieldInputStream.java`
#### Snippet
```java
    @SuppressWarnings("sync-override")
    @Override
    public void mark(final int readlimit) {
        // no-op
    }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in FileVisitResult
in `src/main/java/org/apache/commons/io/filefilter/SymbolicLinkFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file is a symbolic link.
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
in `src/main/java/org/apache/commons/io/filefilter/NotFileFilter.java`
#### Snippet
```java
     * @param file the File to check
     *
     * @return true if the filter returns false
     * @since 2.9.0
     */
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
in `src/main/java/org/apache/commons/io/filefilter/WildcardFileFilter.java`
#### Snippet
```java
     * @param file  the file to check
     *
     * @return true if the file name matches one of the wildcards.
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
in `src/main/java/org/apache/commons/io/filefilter/NameFileFilter.java`
#### Snippet
```java
     * @param file  the File to check
     *
     * @return true if the file name matches
     * @since 2.9.0
     */
```

## RuleId[id=ProtectedMemberInFinalClass]
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                System.arraycopy(array, i, array, i - 1, size - i);
                size--;
                i--;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                System.arraycopy(array, i + 1, array, i - 1, size - i);
                size -=2;
                i--;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                        System.arraycopy(array, i + 1, array, j + 1, size - i);
                        size -= i - j;
                        i = j + 1;
                        continue outer;
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                System.arraycopy(array, i + 1, array, prefix, size - i);
                size -= i + 1 - prefix;
                i = prefix + 1;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `src/main/java/org/apache/commons/io/FileSystemUtils.java`
#### Snippet
```java
        for (int k = 0; k < buf.length(); k++) {
            if (buf.charAt(k) == ',' || buf.charAt(k) == '.') {
                buf.deleteCharAt(k--);
            }
        }
```

## RuleId[id=UnnecessaryToStringCall]
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
in `src/main/java/org/apache/commons/io/filefilter/NotFileFilter.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "NOT (" + filter.toString() + ")";
    }

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
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
                        if (byteBuffer.position() > 0) {
                            byteBuffer.flip();
                            builder.append(StandardCharsets.UTF_8.decode(byteBuffer).toString());
                            byteBuffer.clear();
                        }
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
        final AccumulatorPathVisitor visitor = new AccumulatorPathVisitor(Counters.noopPathCounters(), fileFilter, dirPathFilter,
            (p, e) -> FileVisitResult.CONTINUE);
        final Set<FileVisitOption> optionSet = new HashSet<>();
        Collections.addAll(optionSet, options);
        Files.walkFileTree(directory.toPath(), optionSet, toMaxDepth(isDirFilterSet), visitor);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
        markFbIndex = fbIndex;
        markedAtStart = firstBytes == null;
        in.mark(readlimit);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
        }

        in.reset();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
    @Override
    public synchronized void mark(final int readlimit) {
        in.mark(readlimit);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
    public synchronized void reset() throws IOException {
        try {
            in.reset();
        } catch (final IOException e) {
            handleIOException(e);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `exitWhenFinished` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
    public synchronized void exitWhenFinished() {
        // synchronized block protects reaper
        exitWhenFinished = true;
        if (reaper != null) {
            synchronized (reaper) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        // synchronized block protects reaper
        exitWhenFinished = true;
        if (reaper != null) {
            synchronized (reaper) {
                reaper.interrupt();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        exitWhenFinished = true;
        if (reaper != null) {
            synchronized (reaper) {
                reaper.interrupt();
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        if (reaper != null) {
            synchronized (reaper) {
                reaper.interrupt();
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `exitWhenFinished` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
            deleteStrategy) {
        // synchronized block protects reaper
        if (exitWhenFinished) {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        if (reaper == null) {
            reaper = new Reaper();
            reaper.start();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        }
        if (reaper == null) {
            reaper = new Reaper();
            reaper.start();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reaper` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
        if (reaper == null) {
            reaper = new Reaper();
            reaper.start();
        }
        trackers.add(new Tracker(path, deleteStrategy, marker, q));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `q` accessed in synchronized context
in `src/main/java/org/apache/commons/io/FileCleaningTracker.java`
#### Snippet
```java
            reaper.start();
        }
        trackers.add(new Tracker(path, deleteStrategy, marker, q));
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `src/main/java/org/apache/commons/io/output/ByteArrayOutputStream.java`
#### Snippet
```java
    @Override
    public synchronized int size() {
        return count;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.branch` accessed in synchronized context
in `src/main/java/org/apache/commons/io/output/TeeOutputStream.java`
#### Snippet
```java
    public synchronized void write(final byte[] b, final int off, final int len) throws IOException {
        super.write(b, off, len);
        this.branch.write(b, off, len);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.branch` accessed in synchronized context
in `src/main/java/org/apache/commons/io/output/TeeOutputStream.java`
#### Snippet
```java
    public synchronized void write(final byte[] b) throws IOException {
        super.write(b);
        this.branch.write(b);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.branch` accessed in synchronized context
in `src/main/java/org/apache/commons/io/output/TeeOutputStream.java`
#### Snippet
```java
    public synchronized void write(final int b) throws IOException {
        super.write(b);
        this.branch.write(b);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
    public synchronized void reset() throws IOException {
        try {
            in.reset();
        } catch (final IOException e) {
            handleIOException(e);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
    public synchronized void mark(final int idx) throws IOException {
        try {
            in.mark(idx);
        } catch (final IOException e) {
            handleIOException(e);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Caller closes the result LineIterator.
    public static LineIterator lineIterator(final File file, final String charsetName) throws IOException {
        InputStream inputStream = null;
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedInputStream buffer(final InputStream inputStream) {
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedInputStream buffer(final InputStream inputStream, final int size) {
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedOutputStream buffer(final OutputStream outputStream) {
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedOutputStream buffer(final OutputStream outputStream, final int size) {
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static boolean contentEqualsIgnoreEOL(final Reader reader1, final Reader reader2) throws UncheckedIOException {
        if (reader1 == reader2) {
            return true;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // streams are closed by the caller.
    public static QueueInputStream copy(final java.io.ByteArrayOutputStream outputStream) throws IOException {
        Objects.requireNonNull(outputStream, "outputStream");
        final QueueInputStream in = new QueueInputStream();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // streams are closed by the caller.
    public static long copyLarge(final InputStream inputStream, final OutputStream outputStream, final byte[] buffer)
        throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // reader wraps input and is the responsibility of the caller.
    public static List<String> readLines(final Reader reader) throws UncheckedIOException {
        return toBufferedReader(reader).lines().collect(Collectors.toList());
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static void write(final String data, final OutputStream output, final Charset charset) throws IOException {
        if (data != null) {
            // Use Charset#encode(String), since calling String#getBytes(Charset) might result in
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/StreamIterator.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Caller MUST close or iterate to the end.
    public static <T> Iterator<T> iterator(final Stream<T> stream) {
        return new StreamIterator<>(stream).iterator;
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/comparator/CompositeFileComparator.java`
#### Snippet
```java
     * @param delegates The delegate file comparators
     */
    public CompositeFileComparator(@SuppressWarnings("unchecked") final Comparator<File>... delegates) {
        this.delegates = delegates == null ? emptyArray() : delegates.clone();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/file/spi/FileSystemProviders.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // FileSystem is not allocated here.
    public static FileSystemProvider getFileSystemProvider(final Path path) {
        return Objects.requireNonNull(path, "path").getFileSystem().provider();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/file/spi/FileSystemProviders.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // FileSystems.getDefault() returns a constant.
    public FileSystemProvider getFileSystemProvider(final String scheme) {
        Objects.requireNonNull(scheme, "scheme");
        // Check default provider first to avoid loading of installed providers.
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/filefilter/RegexFileFilter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public RegexFileFilter(final Pattern pattern) {
        this(pattern, (Function<Path, String> & Serializable) p -> p.getFileName().toString());
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // call to #empty()
    static <T> IOStream<T> of(final Iterable<T> values) {
        return values == null ? empty() : adapt(StreamSupport.stream(values.spliterator(), false));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @SafeVarargs // Creating a stream from an array is safe
    static <T> IOStream<T> of(final T... values) {
        return values == null || values.length == 0 ? empty() : adapt(Arrays.stream(values));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/IOStreamAdapter.java`
#### Snippet
```java

    @SuppressWarnings("resource")
    static <T> IOStream<T> adapt(final Stream<T> delegate) {
        return delegate != null ? new IOStreamAdapter<>(delegate) : IOStream.empty();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/IOStreams.java`
#### Snippet
```java

    @SuppressWarnings("resource") // adapt()
    static <T> void forAll(final Stream<T> stream, final IOConsumer<T> action, final BiFunction<Integer, IOException, IOException> exSupplier)
        throws IOExceptionList {
        IOStream.adapt(stream).forAll(action, IOIndexedException::new);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/UncheckedIOBaseStream.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public B parallel() {
        return delegate.parallel().unwrap();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/UncheckedIOBaseStream.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public B sequential() {
        return delegate.sequential().unwrap();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/function/UncheckedIOBaseStream.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public B unordered() {
        return delegate.unordered().unwrap();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/DemuxInputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // we actually close the stream here
    @Override
    public void close() throws IOException {
        IOUtils.close(inputStreamLocal.get());
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/DemuxInputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public int read() throws IOException {
        final InputStream inputStream = inputStreamLocal.get();
        if (null != inputStream) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // InputStream is managed through a InputStreamReader in this instance.
    public XmlStreamReader(final InputStream inputStream, final boolean lenient, final String defaultEncoding)
            throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // InputStream is managed through a InputStreamReader in this instance.
    public XmlStreamReader(final InputStream inputStream, final String httpContentType,
            final boolean lenient, final String defaultEncoding) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // InputStream is managed through another reader in this instance.
    public XmlStreamReader(final Path file) throws IOException {
        this(Files.newInputStream(Objects.requireNonNull(file, "file")));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
        final String contentType = urlConnection.getContentType();
        final InputStream inputStream = urlConnection.getInputStream();
        @SuppressWarnings("resource") // managed by the InputStreamReader tracked by this instance
        final BOMInputStream bomInput = new BOMInputStream(new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE), false, BOMS);
        final BOMInputStream piInput = new BOMInputStream(bomInput, true, XML_GUESS_BYTES);
        if (urlConnection instanceof HttpURLConnection || contentType != null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/AbstractByteArrayOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The result InputStream MUST be managed by the call site.
    protected <T extends InputStream> InputStream toInputStream(
            final InputStreamConstructor<T> isConstructor) {
        int remaining = count;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/DemuxOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // we actually close the stream here
    @Override
    public void close() throws IOException {
        IOUtils.close(outputStreamThreadLocal.get());
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/DemuxOutputStream.java`
#### Snippet
```java
    @Override
    public void flush() throws IOException {
        @SuppressWarnings("resource")
        final OutputStream output = outputStreamThreadLocal.get();
        if (null != output) {
            output.flush();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/DemuxOutputStream.java`
#### Snippet
```java
    @Override
    public void write(final int ch) throws IOException {
        @SuppressWarnings("resource")
        final OutputStream output = outputStreamThreadLocal.get();
        if (null != output) {
            output.write(ch);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Call site is responsible for closing a new instance.
    public FileWriterWithEncoding(final File file, final Charset encoding, final boolean append) throws IOException {
        super(initWriter(file, encoding, append));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Call site is responsible for closing a new instance.
    public FileWriterWithEncoding(final File file, final CharsetEncoder charsetEncoder, final boolean append) throws IOException {
        super(initWriter(file, charsetEncoder, append));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Call site is responsible for closing a new instance.
    public FileWriterWithEncoding(final File file, final String charsetName, final boolean append) throws IOException {
        super(initWriter(file, charsetName, append));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ProxyCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Fluent API.
    @Override
    public Writer append(final char c) throws IOException {
        try {
            beforeWrite(1);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ProxyCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Fluent API.
    @Override
    public Writer append(final CharSequence csq) throws IOException {
        try {
            final int len = IOUtils.length(csq);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ProxyCollectionWriter.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Fluent API.
    @Override
    public Writer append(final CharSequence csq, final int start, final int end) throws IOException {
        try {
            beforeWrite(end - start);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ThresholdingOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void flush() throws IOException {
        getStream().flush();
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ThresholdingOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final byte[] b) throws IOException {
        checkThreshold(b.length);
        getStream().write(b);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ThresholdingOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        checkThreshold(len);
        getStream().write(b, off, len);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/ThresholdingOutputStream.java`
#### Snippet
```java
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final int b) throws IOException {
        checkThreshold(1);
        getStream().write(b);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/io/output/XmlStreamWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public XmlStreamWriter(final File file, final String defaultEncoding) throws FileNotFoundException {
        this(new FileOutputStream(file), defaultEncoding);
    }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `EndianUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/EndianUtils.java`
#### Snippet
```java
 * @see org.apache.commons.io.input.SwappedDataInputStream
 */
public class EndianUtils {

    /**
```

### UtilityClassWithPublicConstructor
Class `HexDump` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/HexDump.java`
#### Snippet
```java
 * </p>
 */
public class HexDump {

    /**
```

### UtilityClassWithPublicConstructor
Class `FilenameUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
 * @since 1.1
 */
public class FilenameUtils {

    private static final String[] EMPTY_STRING_ARRAY = {};
```

### UtilityClassWithPublicConstructor
Class `FileFilterUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/filefilter/FileFilterUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class FileFilterUtils {

    /* Constructed on demand and then cached */
```

### UtilityClassWithPublicConstructor
Class `CopyUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
 */
@Deprecated
public class CopyUtils {

    /**
```

### UtilityClassWithPublicConstructor
Class `IOUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
 * </p>
 */
public class IOUtils {
    // NOTE: This class is focused on InputStream, OutputStream, Reader and
    // Writer. Each method should take at least one of these as a parameter,
```

### UtilityClassWithPublicConstructor
Class `FileUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
 * </p>
 */
public class FileUtils {

    /**
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
        @Override
        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(fileCounter.get()),
                Long.valueOf(directoryCounter.get()), Long.valueOf(byteCounter.get()));
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(fileCounter.get()),
                Long.valueOf(directoryCounter.get()), Long.valueOf(byteCounter.get()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(fileCounter.get()),
                Long.valueOf(directoryCounter.get()), Long.valueOf(byteCounter.get()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
        @Override
        public Long getLong() {
            return Long.valueOf(value.longValueExact());
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/file/Counters.java`
#### Snippet
```java
        @Override
        public Long getLong() {
            return Long.valueOf(value);
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/io/input/CharacterSetFilterReader.java`
#### Snippet
```java
        }
        final Set<Integer> unmodifiableSet = Collections.unmodifiableSet(skip);
        return c -> unmodifiableSet.contains(Integer.valueOf(c));
    }

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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/io/FileSystem.java`
#### Snippet
```java
        } catch (final SecurityException ex) {
            // we are not allowed to look at this property
            System.err.println("Caught a SecurityException reading the system property '" + property
                    + "'; the SystemUtils property value will default to null.");
            return null;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
 * </pre>
 *
 * @see org.apache.commons.io.ByteOrderMark
 * @see <a href="http://en.wikipedia.org/wiki/Byte_order_mark">Wikipedia - Byte Order Mark</a>
 * @since 2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/UnsynchronizedByteArrayInputStream.java`
#### Snippet
```java

/**
 * This is an alternative to {@link java.io.ByteArrayInputStream}
 * which removes the synchronization overhead for non-concurrent
 * access; as such this class is not thread-safe.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.stream` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/function/IOBaseStream.java`
#### Snippet
```java
     *
     * @return See {@link BaseStream#unordered() delegate}.
     * @see java.util.stream.BaseStream#unordered()
     */
    @SuppressWarnings("resource") // for unwrap()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/MessageDigestCalculatingInputStream.java`
#### Snippet
```java
/**
 * This class is an example for using an {@link ObservableInputStream}. It creates its own
 * {@link org.apache.commons.io.input.ObservableInputStream.Observer}, which calculates a checksum using a
 * MessageDigest, for example an MD5 sum.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/serialization/WildcardClassNameMatcher.java`
#### Snippet
```java
/**
 * A {@link ClassNameMatcher} that uses simplified regular expressions
 *  provided by {@link org.apache.commons.io.FilenameUtils#wildcardMatch(String, String) FilenameUtils.wildcardMatch}
 * <p>
 * This object is immutable and thread-safe.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/Tailer.java`
#### Snippet
```java
         * Gets the last modification {@link FileTime}.
         *
         * @return See {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
         * @throws IOException if an I/O error occurs.
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/AppendableOutputStream.java`
#### Snippet
```java
 * Object.
 * <p>
 * For example, can be used with any {@link java.io.Writer} or a {@link java.lang.StringBuilder}
 * or {@link java.lang.StringBuffer}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/AppendableOutputStream.java`
#### Snippet
```java
 * <p>
 * For example, can be used with any {@link java.io.Writer} or a {@link java.lang.StringBuilder}
 * or {@link java.lang.StringBuffer}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/filefilter/IOFileFilter.java`
#### Snippet
```java
     * Checks to see if the File should be accepted by this filter.
     * <p>
     * Defined in {@link java.io.FileFilter}.
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/filefilter/IOFileFilter.java`
#### Snippet
```java
     * Checks to see if the File should be accepted by this filter.
     * <p>
     * Defined in {@link java.io.FilenameFilter}.
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/QueueOutputStream.java`
#### Snippet
```java

/**
 * Simple alternative to JDK {@link java.io.PipedOutputStream}; queue input stream provides what's written in queue
 * output stream.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/Charsets.java`
#### Snippet
```java
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/FileWriterWithEncoding.java`
#### Snippet
```java
 * <p>
 * The encoding must be specified using either the name of the {@link Charset}, the {@link Charset}, or a
 * {@link CharsetEncoder}. If the default encoding is required then use the {@link java.io.FileWriter} directly, rather
 * than this implementation.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/filefilter/FileEqualsFileFilter.java`
#### Snippet
```java
 * Accepts only an exact {@link File} object match. You can use this filter to visit the start directory when walking a
 * file tree with
 * {@link java.nio.file.Files#walkFileTree(java.nio.file.Path, java.util.Set, int, java.nio.file.FileVisitor)}.
 *
 * @since 2.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/QueueInputStream.java`
#### Snippet
```java

/**
 * Simple alternative to JDK {@link java.io.PipedInputStream}; queue input stream provides what's written in queue
 * output stream.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/DirectoryStreamFilter.java`
#### Snippet
```java

/**
 * A {@link java.nio.file.DirectoryStream.Filter DirectoryStream.Filter} that delegates to a {@link PathFilter}.
 * <p>
 * You pass this filter to {@link java.nio.file.Files#newDirectoryStream(Path, DirectoryStream.Filter)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/ClassLoaderObjectInputStream.java`
#### Snippet
```java
     * @throws IOException in case of an I/O error
     * @throws ClassNotFoundException if the Class cannot be found
     * @see java.io.ObjectInputStream#resolveProxyClass(String[])
     * @since 2.1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/FilesUncheck.java`
#### Snippet
```java

    /**
     * Delegates to {@link Files#newDirectoryStream(Path, java.nio.file.DirectoryStream.Filter)} throwing
     * {@link UncheckedIOException} instead of {@link IOException}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/CountingInputStream.java`
#### Snippet
```java
     * @return the actual number of bytes skipped
     * @throws IOException if an I/O error occurs.
     * @see java.io.InputStream#skip(long)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
     * @return the number of chars read
     * @throws IOException If an I/O error occurs while calling the underlying reader's read method
     * @see java.io.Reader#read(char[], int, int)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
     * @return -1 on EOF or the character read
     * @throws IOException If an I/O error occurs while calling the underlying reader's read method
     * @see java.io.Reader#read()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
     *
     * @throws IOException If an I/O error occurs while calling the underlying reader's reset method
     * @see java.io.Reader#reset()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
 *
 * <p>
 * One use case is to avoid overrunning the readAheadLimit supplied to {@link java.io.Reader#mark(int)}, since reading
 * too many characters removes the ability to do a successful reset.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/input/BoundedReader.java`
#### Snippet
```java
     *
     * @throws IOException If an I/O error occurs while calling the underlying reader's mark method
     * @see java.io.Reader#mark(int)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/io/output/ByteArrayOutputStream.java`
#### Snippet
```java
    @Override
    public synchronized InputStream toInputStream() {
        return toInputStream(java.io.ByteArrayInputStream::new);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/filefilter/PathEqualsFileFilter.java`
#### Snippet
```java
 * Accepts only an exact {@link Path} object match. You can use this filter to visit the start directory when walking a
 * file tree with
 * {@link java.nio.file.Files#walkFileTree(java.nio.file.Path, java.util.Set, int, java.nio.file.FileVisitor)}.
 *
 * @since 2.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
    }

    /** @see java.io.Writer#close() */
    @Override
    public void close() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/NullWriter.java`
#### Snippet
```java
    }

    /** @see java.io.Writer#flush() */
    @Override
    public void flush() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/AppendableWriter.java`
#### Snippet
```java
 * Object.
 * <p>
 * For example, can be used with a {@link java.lang.StringBuilder}
 * or {@link java.lang.StringBuffer}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/AppendableWriter.java`
#### Snippet
```java
 * <p>
 * For example, can be used with a {@link java.lang.StringBuilder}
 * or {@link java.lang.StringBuffer}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
 * <p>
 * <b>NOTE</b>: You may be able to avoid using this class entirely simply by
 * using JDK {@link java.io.File File} objects and the two argument constructor
 * {@link java.io.File#File(java.io.File, String) File(File,String)}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
 * <b>NOTE</b>: You may be able to avoid using this class entirely simply by
 * using JDK {@link java.io.File File} objects and the two argument constructor
 * {@link java.io.File#File(java.io.File, String) File(File,String)}.
 * </p>
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
 * <b>NOTE</b>: You may be able to avoid using this class entirely simply by
 * using JDK {@link java.io.File File} objects and the two argument constructor
 * {@link java.io.File#File(java.io.File, String) File(File,String)}.
 * </p>
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io.output` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     * @return the current contents of this output stream.
     * @throws IOException if this stream is not yet closed or an error occurs.
     * @see org.apache.commons.io.output.ByteArrayOutputStream#toInputStream()
     *
     * @since 2.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a boolean.
     * </ul>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2, final LinkOption[] linkOptions, final OpenOption[] openOptions)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2, final LinkOption[] linkOptions, final OpenOption[] openOptions)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2, final LinkOption[] linkOptions, final OpenOption[] openOptions)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a boolean.
     * </ul>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a boolean.
     * </ul>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/CopyUtils.java`
#### Snippet
```java
 * would usually suggest wrapping in a BufferedInputStream. The
 * BufferedInputStream works by issuing infrequent
 * {@link java.io.InputStream#read(byte[] b, int off, int len)} requests on the
 * underlying InputStream, to fill an internal buffer, from which further
 * {@code read} requests can inexpensively get their data (until the buffer
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the named charset is unavailable.
     * @since 1.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *                   search. Use TrueFileFilter.INSTANCE to match all directories.
     * @return a collection of java.io.File with the matching files
     * @see org.apache.commons.io.FileUtils#listFiles
     * @see org.apache.commons.io.filefilter.FileFilterUtils
     * @see org.apache.commons.io.filefilter.NameFileFilter
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     * @throws IllegalArgumentException when an input is not a file.
     * @throws IOException If an I/O error occurs.
     * @see org.apache.commons.io.file.PathUtils#fileContentEquals(Path,Path,java.nio.file.LinkOption[],java.nio.file.OpenOption...)
     */
    public static boolean contentEquals(final File file1, final File file2) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     * @throws IllegalArgumentException when an input is not a file.
     * @throws IOException If an I/O error occurs.
     * @see org.apache.commons.io.file.PathUtils#fileContentEquals(Path,Path,java.nio.file.LinkOption[],java.nio.file.OpenOption...)
     */
    public static boolean contentEquals(final File file1, final File file2) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the named charset is unavailable.
     * @since 2.3
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *                 end of the file rather than overwriting
     * @throws IOException                 in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported by the VM
     * @since 2.1
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
    /**
     * Returns the last modification {@link FileTime} via
     * {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * <p>
     * Use this method to avoid issues with {@link File#lastModified()} like
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *
     * @param file The File to query.
     * @return See {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * @throws IOException if an I/O error occurs.
     * @since 2.12.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *                 end of the file rather than overwriting
     * @throws IOException                 in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported by the VM
     * @since 2.1
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
    /**
     * Returns the last modification time in milliseconds via
     * {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * <p>
     * For the best precision, use {@link #lastModifiedFileTime(File)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file.attribute` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *
     * @param file The File to query.
     * @return See {@link java.nio.file.attribute.FileTime#toMillis()}.
     * @throws UncheckedIOException if an I/O error occurs.
     * @since 2.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     * percent-encoded octets to characters by decoding with the UTF-8 character
     * set. This function is primarily intended for usage with
     * {@link java.net.URL} which unfortunately does not enforce proper URLs. As
     * such, this method will leniently accept invalid characters or malformed
     * percent-encoded octets and simply pass them literally through to the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
    /**
     * Returns the last modification time in milliseconds via
     * {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * <p>
     * For the best precision, use {@link #lastModifiedFileTime(File)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file.attribute` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     *
     * @param file The File to query.
     * @return See {@link java.nio.file.attribute.FileTime#toMillis()}.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/io/function/IOStream.java`
#### Snippet
```java

    /**
     * Null-safe version of {@link StreamSupport#stream(java.util.Spliterator, boolean)}.
     *
     * Copied from Apache Commons Lang.
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ProxyInputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/io/input/ProxyInputStream.java`
#### Snippet
```java
     * @param proxy  the InputStream to delegate to
     */
    public ProxyInputStream(final InputStream proxy) {
        super(proxy);
        // the proxy is stored in a protected superclass variable named 'in'
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFileFilter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/io/filefilter/AbstractFileFilter.java`
#### Snippet
```java
     * Constructs a new instance.
     */
    public AbstractFileFilter() {
        this(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProxyReader()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/io/input/ProxyReader.java`
#### Snippet
```java
     * @param proxy  the Reader to delegate to
     */
    public ProxyReader(final Reader proxy) {
        super(proxy);
        // the proxy is stored in a protected superclass variable named 'in'
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java
        while (n > 0 && available() > 0) {
            this.read();
            n--;
            skipped++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java
                final int chunk = Math.min(this.bBuf.remaining(), len);
                this.bBuf.get(array, off, chunk);
                off += chunk;
                len -= chunk;
                bytesRead += chunk;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/CharSequenceInputStream.java`
#### Snippet
```java
                this.bBuf.get(array, off, chunk);
                off += chunk;
                len -= chunk;
                bytesRead += chunk;
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
            b = readFirstBytes();
            if (b >= 0) {
                buf[off++] = (byte) (b & 0xFF);
                len--;
                firstCount++;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
            if (b >= 0) {
                buf[off++] = (byte) (b & 0xFF);
                len--;
                firstCount++;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/ReadAheadInputStream.java`
#### Snippet
```java
            }
        }
        len = Math.min(len, activeBuffer.remaining());
        activeBuffer.get(b, offset, len);

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
            } else {
                count += readLen;
                off += readLen;
                len -= readLen;
                if (len <= 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/SequenceReader.java`
#### Snippet
```java
                count += readLen;
                off += readLen;
                len -= readLen;
                if (len <= 0) {
                    break;
```

### AssignmentToMethodParameter
Assignment to method parameter `httpContentType`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
            XmlStreamReaderException ex) throws IOException {
        if (httpContentType != null && httpContentType.startsWith("text/html")) {
            httpContentType = httpContentType.substring("text/html".length());
            httpContentType = "text/xml" + httpContentType;
            try {
```

### AssignmentToMethodParameter
Assignment to method parameter `httpContentType`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
        if (httpContentType != null && httpContentType.startsWith("text/html")) {
            httpContentType = httpContentType.substring("text/html".length());
            httpContentType = "text/xml" + httpContentType;
            try {
                return calculateHttpEncoding(httpContentType, ex.getBomEncoding(),
```

### AssignmentToMethodParameter
Assignment to method parameter `ex`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
                        ex.getXmlGuessEncoding(), ex.getXmlEncoding(), true);
            } catch (final XmlStreamReaderException ex2) {
                ex = ex2;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `lockDir`
in `src/main/java/org/apache/commons/io/output/LockableFileWriter.java`
#### Snippet
```java
        // init lock file
        if (lockDir == null) {
            lockDir = FileUtils.getTempDirectoryPath();
        }
        final File lockDirFile = new File(lockDir);
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/BufferedFileChannelInputStream.java`
#### Snippet
```java
            return EOF;
        }
        len = Math.min(len, byteBuffer.remaining());
        byteBuffer.get(b, offset, len);
        return len;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/io/input/ReaderInputStream.java`
#### Snippet
```java
                final int c = Math.min(encoderOut.remaining(), len);
                encoderOut.get(array, off, c);
                off += c;
                len -= c;
                read += c;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/input/ReaderInputStream.java`
#### Snippet
```java
                encoderOut.get(array, off, c);
                off += c;
                len -= c;
                read += c;
            } else if (endOfInput) { // Already reach EOF in the last read
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName1`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        }
        if (normalize) {
            fileName1 = normalize(fileName1);
            if (fileName1 == null) {
                return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName2`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                return false;
            }
            fileName2 = normalize(fileName2);
            if (fileName2 == null) {
                return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `ioCase`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
            return false;
        }
        ioCase = IOCase.value(ioCase, IOCase.SENSITIVE);
        final String[] wcs = splitOnTokens(wildcardMatcher);
        boolean anyChars = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/io/FileSystem.java`
#### Snippet
```java
        final int sz = cs.length();
        if (start < 0) {
            start = 0;
        }
        if (searchChar < Character.MIN_SUPPLEMENTARY_CODE_POINT) {
```

### AssignmentToMethodParameter
Assignment to method parameter `directoryFilter`
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
            this.filter = null;
        } else {
            directoryFilter = directoryFilter != null ? directoryFilter : TrueFileFilter.TRUE;
            fileFilter = fileFilter != null ? fileFilter : TrueFileFilter.TRUE;
            directoryFilter = FileFilterUtils.makeDirectoryOnly(directoryFilter);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileFilter`
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
        } else {
            directoryFilter = directoryFilter != null ? directoryFilter : TrueFileFilter.TRUE;
            fileFilter = fileFilter != null ? fileFilter : TrueFileFilter.TRUE;
            directoryFilter = FileFilterUtils.makeDirectoryOnly(directoryFilter);
            fileFilter = FileFilterUtils.makeFileOnly(fileFilter);
```

### AssignmentToMethodParameter
Assignment to method parameter `directoryFilter`
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
            directoryFilter = directoryFilter != null ? directoryFilter : TrueFileFilter.TRUE;
            fileFilter = fileFilter != null ? fileFilter : TrueFileFilter.TRUE;
            directoryFilter = FileFilterUtils.makeDirectoryOnly(directoryFilter);
            fileFilter = FileFilterUtils.makeFileOnly(fileFilter);
            this.filter = directoryFilter.or(fileFilter);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileFilter`
in `src/main/java/org/apache/commons/io/DirectoryWalker.java`
#### Snippet
```java
            fileFilter = fileFilter != null ? fileFilter : TrueFileFilter.TRUE;
            directoryFilter = FileFilterUtils.makeDirectoryOnly(directoryFilter);
            fileFilter = FileFilterUtils.makeFileOnly(fileFilter);
            this.filter = directoryFilter.or(fileFilter);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `localBuf`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
            // Reassign buf, which will invalidate any local references
            // FIXME: what if buf was null?
            localBuf = buf = newbuf;
        } else if (markpos > 0) {
            System.arraycopy(localBuf, markpos, localBuf, 0, localBuf.length - markpos);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                return copylength;
            }
            offset += copylength;
            required = length - copylength;
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/io/input/UnsynchronizedBufferedInputStream.java`
#### Snippet
```java
                return length - required;
            }
            offset += read;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
            decoderIn.put(b, off, c);
            processInput(false);
            len -= c;
            off += c;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/io/output/WriterOutputStream.java`
#### Snippet
```java
            processInput(false);
            len -= c;
            off += c;
        }
        if (writeImmediately) {
```

### AssignmentToMethodParameter
Assignment to method parameter `lineEnding`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        }
        if (lineEnding == null) {
            lineEnding = System.lineSeparator();
        }
        for (final Object line : lines) {
```

### AssignmentToMethodParameter
Assignment to method parameter `lineEnding`
in `src/main/java/org/apache/commons/io/IOUtils.java`
#### Snippet
```java
        }
        if (lineEnding == null) {
            lineEnding = System.lineSeparator();
        }
        final Charset cs = Charsets.toCharset(charset);
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/input/BOMInputStream.java`
#### Snippet
```java
    public String getBOMCharsetName() throws IOException {
        getBOM();
        return byteOrderMark == null ? null : byteOrderMark.getCharsetName();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/attribute/FileTimes.java`
#### Snippet
```java
     */
    public static FileTime toFileTime(final Date date) {
        return date != null ? FileTime.fromMillis(date.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/attribute/FileTimes.java`
#### Snippet
```java
     */
    public static Date toDate(final FileTime fileTime) {
        return fileTime != null ? new Date(fileTime.toMillis()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/function/Constants.java`
#### Snippet
```java
     */
    @SuppressWarnings("rawtypes")
    static final IOBiFunction IO_BI_FUNCTION = (t, u) -> null;

    /**
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/ThreadMonitor.java`
#### Snippet
```java
    static Thread start(final Thread thread, final Duration timeout) {
        if (timeout.isZero() || timeout.isNegative()) {
            return null;
        }
        final Thread monitor = new Thread(new ThreadMonitor(thread, timeout), ThreadMonitor.class.getSimpleName());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/input/ReversedLinesFileReader.java`
#### Snippet
```java
                        + new String(leftOver, charset));
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    public static String getExtension(final String fileName) throws IllegalArgumentException {
        if (fileName == null) {
            return null;
        }
        final int index = indexOfExtension(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    public static String getName(final String fileName) {
        if (fileName == null) {
            return null;
        }
        return requireNonNullChars(fileName).substring(indexOfLastSeparator(fileName) + 1);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    private static String doGetFullPath(final String fileName, final boolean includeSeparator) {
        if (fileName == null) {
            return null;
        }
        final int prefix = getPrefixLength(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        final int prefix = getPrefixLength(fileName);
        if (prefix < 0) {
            return null;
        }
        if (prefix >= fileName.length()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    public static String removeExtension(final String fileName) {
        if (fileName == null) {
            return null;
        }
        requireNonNullChars(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    public static String getPrefix(final String fileName) {
        if (fileName == null) {
            return null;
        }
        final int len = getPrefixLength(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        final int len = getPrefixLength(fileName);
        if (len < 0) {
            return null;
        }
        if (len > fileName.length()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    private static String doGetPath(final String fileName, final int separatorAdd) {
        if (fileName == null) {
            return null;
        }
        final int prefix = getPrefixLength(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        final int prefix = getPrefixLength(fileName);
        if (prefix < 0) {
            return null;
        }
        final int index = indexOfLastSeparator(fileName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
    private static String doNormalize(final String fileName, final char separator, final boolean keepSeparator) {
        if (fileName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        final int prefix = getPrefixLength(fileName);
        if (prefix < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
                    (i == prefix + 2 || array[i - 3] == separator)) {
                if (i == prefix + 2) {
                    return null;
                }
                if (i == size - 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        final int prefix = getPrefixLength(fullFileNameToAdd);
        if (prefix < 0) {
            return null;
        }
        if (prefix > 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FilenameUtils.java`
#### Snippet
```java
        }
        if (basePath == null) {
            return null;
        }
        final int len = basePath.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FileSystem.java`
#### Snippet
```java
     */
    private static String replace(final String path, final char oldChar, final char newChar) {
        return path == null ? null : path.replace(oldChar, newChar);
    }
    private final boolean casePreserving;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FileSystem.java`
#### Snippet
```java
            System.err.println("Caught a SecurityException reading the system property '" + property
                    + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    public File getFile() {
        return outputPath != null ? outputPath.toFile() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java
     */
    public byte[] getData() {
        return memoryOutputStream != null ? memoryOutputStream.toByteArray() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/output/DeferredFileOutputStream.java`
#### Snippet
```java

    private Path toPath(final File file, final Supplier<Path> defaultPathSupplier) {
        return file != null ? file.toPath() : defaultPathSupplier == null ? null : defaultPathSupplier.get();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java

    private static Path readIfSymbolicLink(final Path path) throws IOException {
        return path != null ? Files.isSymbolicLink(path) ? Files.readSymbolicLink(path) : path : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
    public static List<AclEntry> getAclEntryList(final Path sourcePath) throws IOException {
        final AclFileAttributeView fileAttributeView = getAclFileAttributeView(sourcePath);
        return fileAttributeView == null ? null : fileAttributeView.getAcl();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java

    private static Path getParent(final Path path) {
        return path == null ? null : path.getParent();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
    public static <A extends BasicFileAttributes> A readAttributes(final Path path, final Class<A> type, final LinkOption... options) {
        try {
            return path == null ? null : Uncheck.apply(Files::readAttributes, path, type, options);
        } catch (final UnsupportedOperationException e) {
            // For example, on Windows.
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
        } catch (final UnsupportedOperationException e) {
            // For example, on Windows.
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/file/PathUtils.java`
#### Snippet
```java
        Path parent = getParent(path);
        parent = linkOption == LinkOption.NOFOLLOW_LINKS ? parent : readIfSymbolicLink(parent);
        return parent == null ? null : Files.createDirectories(parent, attrs);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
    public static File toFile(final URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        final String filename = url.getFile().replace('/', File.separatorChar);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/io/FileUtils.java`
#### Snippet
```java
     */
    private static File getParentFile(final File file) {
        return file == null ? null : file.getParentFile();
    }

```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\".[^\"]*\")`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'.[^']*')`
in `src/main/java/org/apache/commons/io/input/XmlStreamReader.java`
#### Snippet
```java
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

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

