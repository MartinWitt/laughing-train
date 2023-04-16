# hadoop-crypto 
 
# Bad smells
I found 33 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| IOResource | 4 | false |
| RedundantMethodOverride | 4 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UnstableApiUsage | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| Convert2Lambda | 1 | false |
| EmptyMethod | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FileStatus\[files.size()\]'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/StandaloneEncryptedFileSystem.java`
#### Snippet
```java
    public FileStatus[] listStatus(Path path) throws IOException {
        Collection<FileStatus> files = Collections2.filter(Arrays.asList(fs.listStatus(path)), NOT_KEY_MATERIAL);
        return files.toArray(new FileStatus[files.size()]);
    }

```

## RuleId[id=IOResource]
### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
    @Override
    public KeyMaterial unwrap(byte[] wrappedKeyMaterial, SecretKey key) {
        DataInputStream stream = new DataInputStream(new ByteArrayInputStream(wrappedKeyMaterial));

        try {
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
    @Override
    public KeyMaterial unwrap(byte[] wrappedKeyMaterial, PrivateKey key) {
        DataInputStream stream = new DataInputStream(new ByteArrayInputStream(wrappedKeyMaterial));
        Cipher keyUnwrappingCipher = KeySerializers.getCipher(Cipher.UNWRAP_MODE, key);

```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java
    private static int version(byte[] wrappedKeyMaterial) {
        try {
            DataInputStream stream = new DataInputStream(new ByteArrayInputStream(wrappedKeyMaterial));
            return stream.read();
        } catch (IOException e) {
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
    @Override
    public KeyMaterial unwrap(byte[] wrappedKeyMaterial, PrivateKey key) {
        DataInputStream stream = new DataInputStream(new ByteArrayInputStream(wrappedKeyMaterial));
        Cipher keyUnwrappingCipher = KeySerializers.getCipher(Cipher.UNWRAP_MODE, key);

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'first'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/EncryptedFileSystem.java`
#### Snippet
```java
    }

    private static <T> Optional<T> findFirst(Optional<T> first, Optional<T> second) {
        if (first.isPresent()) {
            return first;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'second'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/EncryptedFileSystem.java`
#### Snippet
```java
    }

    private static <T> Optional<T> findFirst(Optional<T> first, Optional<T> second) {
        if (first.isPresent()) {
            return first;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'privateKey'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/FileKeyStorageStrategy.java`
#### Snippet
```java
    private final FileSystem fs;
    private final PublicKey publicKey;
    private final Optional<PrivateKey> privateKey;

    public FileKeyStorageStrategy(FileSystem fs, KeyPair keyPair) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `initialize()` only delegates to its super method
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/EncryptedFileSystem.java`
#### Snippet
```java

    @Override
    public void initialize(URI name, Configuration conf) throws IOException {
        super.initialize(name, conf);
    }
```

### RedundantMethodOverride
Method `seek()` only delegates to its super method
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java

    @Override
    public void seek(long offset) throws IOException {
        super.seek(offset);
    }
```

### RedundantMethodOverride
Method `close()` only delegates to its super method
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java

    @Override
    public void close() throws IOException {
        super.close();
    }
```

### RedundantMethodOverride
Method `read()` only delegates to its super method
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java

    @Override
    public int read(byte[] bytes, int off, int len) throws IOException {
        return super.read(bytes, off, len);
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java
    @Override
    public long getPos() throws IOException {
        return super.getStreamPosition();
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.conf` is unnecessary and can be removed
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/EncryptedFileSystem.java`
#### Snippet
```java
 * A {@link FileSystem} wrapper that encrypts and decrypts the streams from the underlying {@link FileSystem}. The
 * encryption algorithm may be configured by setting {@link #CIPHER_ALGORITHM_KEY} in the {@link
 * org.apache.hadoop.conf.Configuration} to the desired {@link SeekableCipher} algorithm. If no algorithm is set then
 * {@link #DEFAULT_CIPHER_ALGORITHM} will be used. The symmetric key used to encrypt each file is stored and retrieved
 * using the provided {@link KeyStorageStrategy}.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/SymmetricKeySerializer.java`
#### Snippet
```java
public interface SymmetricKeySerializer {
    /**
     * Serializes the given {@link KeyMaterial} and wraps the {@link javax.crypto.SecretKey} using the provided {@link
     * SecretKey}. The produced {@code byte[]} can be unwrapped and deserialized using {@link #unwrap}.
     */
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'FsCipherOutputStream' is still used
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherOutputStream.java`
#### Snippet
```java
 */
@Deprecated
public final class FsCipherOutputStream extends FilterOutputStream {

    public FsCipherOutputStream(FSDataOutputStream delegate, SeekableCipher cipher) {
```

### DeprecatedIsStillUsed
Deprecated member 'getCipher' is still used
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/SeekableCipherFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public static SeekableCipher getCipher(String cipherAlgorithm) {
        switch (cipherAlgorithm) {
            case AesCtrCipher.ALGORITHM:
```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_CIPHER_ALGORITHM_KEY' is still used
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/EncryptedFileSystem.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String DEPRECATED_CIPHER_ALGORITHM_KEY = "fs.cipher";

    public static final String CIPHER_ALGORITHM_KEY = "fs.efs.cipher";
```

### DeprecatedIsStillUsed
Deprecated member 'SymmetricKeySerializerV3' is still used
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/SymmetricKeySerializerV3.java`
#### Snippet
```java
 */
@Deprecated
enum SymmetricKeySerializerV3 implements SymmetricKeySerializer {
    INSTANCE;

```

### DeprecatedIsStillUsed
Deprecated member 'KeySerializerV1' is still used
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
 */
@Deprecated
enum KeySerializerV1 implements KeySerializer {
    INSTANCE;

```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/StandaloneEncryptedFileSystem.java`
#### Snippet
```java

    private static final String DEFAULT_ALGORITHM = "RSA";
    private static final Predicate<FileStatus> NOT_KEY_MATERIAL = new Predicate<FileStatus>() {
        @Override
        public boolean apply(FileStatus status) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java

    @Override
    public void close() throws IOException {
        super.close();
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`strategies.size() > 0` can be replaced with '!strategies.isEmpty()'
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/ChainedAsyncKeyStorageStrategy.java`
#### Snippet
```java

    public ChainedAsyncKeyStorageStrategy(Executor executor, List<AsyncKeyStorageStrategy> strategies) {
        Preconditions.checkArgument(strategies.size() > 0, "Must specify at least one storage strategy");
        this.executor = executor;
        this.strategies = ImmutableList.copyOf(strategies);
```

### SizeReplaceableByIsEmpty
`strategies.size() > 0` can be replaced with '!strategies.isEmpty()'
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/ChainedKeyStorageStrategy.java`
#### Snippet
```java

    public ChainedKeyStorageStrategy(List<KeyStorageStrategy> strategies) {
        Preconditions.checkArgument(strategies.size() > 0, "Must specify at least one storage strategy");
        this.strategies = ImmutableList.copyOf(strategies);
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `KeyMaterial` has no concrete subclass
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/KeyMaterial.java`
#### Snippet
```java
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, jdkOnly = true)
public abstract class KeyMaterial {

    @Value.Parameter
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Path`
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
    public PathConvertingFileSystem(
            FileSystem delegate,
            Function<Path, Path> toFunc,
            Function<Path, Path> fromFunc,
            Function<URI, URI> fromUriFunc) {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
    public PathConvertingFileSystem(
            FileSystem delegate,
            Function<Path, Path> toFunc,
            Function<Path, Path> fromFunc,
            Function<URI, URI> fromUriFunc) {
```

### BoundedWildcard
Can generalize to `? super Path`
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
            FileSystem delegate,
            Function<Path, Path> toFunc,
            Function<Path, Path> fromFunc,
            Function<URI, URI> fromUriFunc) {
        super(delegate);
```

### BoundedWildcard
Can generalize to `? extends Path`
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
            FileSystem delegate,
            Function<Path, Path> toFunc,
            Function<Path, Path> fromFunc,
            Function<URI, URI> fromUriFunc) {
        super(delegate);
```

### BoundedWildcard
Can generalize to `? super URI`
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
            Function<Path, Path> toFunc,
            Function<Path, Path> fromFunc,
            Function<URI, URI> fromUriFunc) {
        super(delegate);
        this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super AsyncKeyStorageStrategy`
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/ChainedAsyncKeyStorageStrategy.java`
#### Snippet
```java
    }

    private CompletableFuture<Void> applyToStrategies(Function<AsyncKeyStorageStrategy, CompletableFuture<?>> mapper) {
        CompletableFuture<?>[] futures = strategies.stream().map(mapper).toArray(CompletableFuture[]::new);
        return CompletableFuture.allOf(futures);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'skipFully(java.io.InputStream, long)' is marked unstable with @Beta
in `crypto-core/src/main/java/com/palantir/crypto2/io/DecryptingSeekableInput.java`
#### Snippet
```java
        long jump = pos - decryptedStreamPos;
        if (0 < jump && jump < skipThreshold) {
            ByteStreams.skipFully(decryptedStream, jump);
            decryptedStreamPos = pos;
            return;
```

### UnstableApiUsage
'skipFully(java.io.InputStream, long)' is marked unstable with @Beta
in `crypto-core/src/main/java/com/palantir/crypto2/io/DecryptingSeekableInput.java`
#### Snippet
```java

        // Skip to the byte offset in the block where 'pos' is located
        ByteStreams.skipFully(decryptedStream, bytesToSkip);
        decryptedStreamPos = pos;
    }
```

