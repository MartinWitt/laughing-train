# commons-crypto 
 
# Bad smells
I found 116 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 28 | false |
| RedundantSuppression | 23 | false |
| SystemOutErr | 11 | false |
| AssignmentToMethodParameter | 6 | false |
| ReturnNull | 6 | false |
| MissortedModifiers | 5 | false |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| CallToStringConcatCanBeReplacedByOperator | 4 | false |
| RedundantStringFormatCall | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| NestedAssignment | 3 | false |
| Finalize | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| UnusedAssignment | 2 | false |
| FieldMayBeStatic | 1 | false |
| CommentedOutCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/crypto/cipher/OpenSsl.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        clean();
    }
```

### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCipher.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        OpenSslNativeJna.EVP_CIPHER_CTX_free(context);
        super.finalize();
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `IV_LENGTH` may be 'static'
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCipher.java`
#### Snippet
```java
    private final String transformation;

    private final int IV_LENGTH = 16;

    /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AES` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/crypto/utils/AES.java`
#### Snippet
```java
 * @since 1.2.0
 */
public class AES {

    /** The AES algorithm name. */
```

### UtilityClassWithoutPrivateConstructor
Class `Crypto` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/crypto/Crypto.java`
#### Snippet
```java
 * class loading.
 */
public final class Crypto {

    private static class ComponentPropertiesHolder {
```

### UtilityClassWithoutPrivateConstructor
Class `OpenSslJna` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
 * Provides access to package protected class objects and a {@link #main(String[])} method that prints version information.
 */
public final class OpenSslJna {

    private final static String KEY_DEBUG = Crypto.CONF_PREFIX + "debug";
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCryptoRandom.java`
#### Snippet
```java

        //cleanup locks
        //OpenSslNativeJna.CRYPTO_set_locking_callback(null);
        //LOCK.unlock();
    }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/crypto/random/JavaCryptoRandom.java`
#### Snippet
```java
     * @return int an {@code int} containing the user-specified number of random bits (right justified, with leading zeros).
     */
    protected int next(final int numBits) {
        Utils.checkArgument(numBits >= 0 && numBits <= 32);
        // Can't simply invoke instance.next(bits) here, because that is package protected.
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/crypto/utils/Utils.java`
#### Snippet
```java
              }
          } catch (final Exception ex) {
              System.err.println("Could not load '" + SYSTEM_PROPERTIES_FILE + "' from classpath: " + ex.toString());
          }
          return defaultedProps;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NegativeCacheSentinel` has no concrete subclass
in `src/main/java/org/apache/commons/crypto/utils/ReflectionUtils.java`
#### Snippet
```java
     * getClassByName. {@link #getClassByNameOrNull(String)}.
     */
    private static abstract class NegativeCacheSentinel {
        // noop
    }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/commons/crypto/utils/ReflectionUtils.java`
#### Snippet
```java
     * getClassByName. {@link #getClassByNameOrNull(String)}.
     */
    private static abstract class NegativeCacheSentinel {
        // noop
    }
```

### MissortedModifiers
Missorted modifiers `synchronized public`
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java
     */
    @Override
    synchronized public void close() {
        if (stream != null) {
            IoUtils.closeQuietly(stream);
```

### MissortedModifiers
Missorted modifiers `synchronized public`
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java
     */
    @Override
    synchronized public void nextBytes(final byte[] bytes) {
        int off = 0;
        int n = 0;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
final class OsInfo {

    private final static HashMap<String, String> archMapping = new HashMap<>();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
public final class OpenSslJna {

    private final static String KEY_DEBUG = Crypto.CONF_PREFIX + "debug";

    /**
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/crypto/jna/OpenSslNativeJna.java`
#### Snippet
```java
        OpenSslJna.debug(String.format("OpenSslNativeJna detected version 0x%x", VERSION));

        VERSION_X_Y = VERSION & 0xffff0000; // keep only major.minor
        if (VERSION_X_Y == VERSION_1_0_X) {
            OpenSslJna.debug("Creating OpenSsl10XNativeJna");
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    private static BufferedInputStream buffer(final InputStream inputStream) {
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    private static boolean contentsEquals(final InputStream input1, final InputStream input2) throws IOException {
        if (input1 == input2) {
            return true;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/jna/OpenSslNativeJna.java`
#### Snippet
```java
        final String libraryName = System.getProperty(Crypto.CONF_PREFIX + OpenSslNativeJna.class.getSimpleName(), "crypto");
        OpenSslJna.debug("OpenSslNativeJna NativeLibrary.getInstance('%s')", libraryName);
        @SuppressWarnings("resource") // NativeLibrary.getInstance returns a singleton
        final NativeLibrary crypto = NativeLibrary.getInstance(libraryName);
        OpenSslJna.debug("OpenSslNativeJna NativeLibrary.getInstance('%s') -> %s", libraryName, crypto);
        Function versionFunction = null;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the StreamInput
    protected CryptoInputStream(final InputStream inputStream, final CryptoCipher cipher,
            final int bufferSize, final Key key, final AlgorithmParameterSpec params)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the ChannelInput
    protected CryptoInputStream(final ReadableByteChannel channel, final CryptoCipher cipher,
            final int bufferSize, final Key key, final AlgorithmParameterSpec params)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CryptoInputStream.
    public CryptoInputStream(final String transformation,
            final Properties properties, final InputStream inputStream, final Key key,
            final AlgorithmParameterSpec params) throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CryptoInputStream.
    public CryptoInputStream(final String transformation,
            final Properties properties, final ReadableByteChannel channel, final Key key,
            final AlgorithmParameterSpec params) throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the StreamOutput
    protected CryptoOutputStream(final OutputStream outputStream, final CryptoCipher cipher,
            final int bufferSize, final Key key, final AlgorithmParameterSpec params)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CryptoOutputStream.
    public CryptoOutputStream(final String transformation,
            final Properties properties, final OutputStream outputStream, final Key key,
            final AlgorithmParameterSpec params) throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CryptoOutputStream.
    public CryptoOutputStream(final String transformation,
            final Properties properties, final WritableByteChannel out, final Key key,
            final AlgorithmParameterSpec params) throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the ChannelOutput
    protected CryptoOutputStream(final WritableByteChannel channel, final CryptoCipher cipher,
            final int bufferSize, final Key key, final AlgorithmParameterSpec params)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the StreamInput
    protected CtrCryptoInputStream(final InputStream inputStream, final CryptoCipher cipher,
            final int bufferSize, final byte[] key, final byte[] iv, final long streamOffset)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CtrCryptoInputStream.
    public CtrCryptoInputStream(final Properties properties, final InputStream inputStream, final byte[] key,
            final byte[] iv, final long streamOffset) throws IOException {
        this(inputStream, Utils.getCipherInstance(
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CtrCryptoInputStream.
    public CtrCryptoInputStream(final Properties properties, final ReadableByteChannel in,
            final byte[] key, final byte[] iv, final long streamOffset) throws IOException {
        this(in, Utils.getCipherInstance(
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the ChannelInput
    protected CtrCryptoInputStream(final ReadableByteChannel channel, final CryptoCipher cipher,
            final int bufferSize, final byte[] key, final byte[] iv, final long streamOffset)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing the instance closes the StreamOutput
    protected CtrCryptoOutputStream(final OutputStream outputStream, final CryptoCipher cipher,
            final int bufferSize, final byte[] key, final byte[] iv, final long streamOffset)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CtrCryptoOutputStream.
    public CtrCryptoOutputStream(final Properties properties, final OutputStream outputStream,
            final byte[] key, final byte[] iv, final long streamOffset) throws IOException {
        this(outputStream, Utils.getCipherInstance(
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoOutputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by CtrCryptoOutputStream.
    public CtrCryptoOutputStream(final Properties properties, final WritableByteChannel channel,
            final byte[] key, final byte[] iv, final long streamOffset) throws IOException {
        this(channel, Utils.getCipherInstance(
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoOutputStream.java`
#### Snippet
```java
     */
   @SuppressWarnings("resource") // Closing the instance closes the ChannelOutput
   protected CtrCryptoOutputStream(final WritableByteChannel channel,
            final CryptoCipher cipher, final int bufferSize, final byte[] key, final byte[] iv,
            final long streamOffset) throws IOException {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The CryptoCipher returned by getCipherInstance() is closed by PositionedCryptoInputStream.
    public PositionedCryptoInputStream(final Properties properties, final Input in, final byte[] key,
            final byte[] iv, final long streamOffset) throws IOException {
        this(properties, in, Utils.getCipherInstance(AES.CTR_NO_PADDING, properties),
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getCryptoCipher does not allocate
    private void decryptBuffer(final CipherState state, final ByteBuffer inByteBuffer,
            final ByteBuffer outByteBuffer) throws IOException {
        final int inputSize = inByteBuffer.remaining();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Caller calls #returnToPool(CipherState)
    private CipherState getCipherState() throws IOException {
        final CipherState state = cipherStatePool.poll();
        return state != null ? state : new CipherState(Utils.getCipherInstance(AES.CTR_NO_PADDING, properties));
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getCryptoCipher does not allocate
    private void resetCipher(final CipherState state, final long position, final byte[] iv) {
        final long counter = getCounter(position);
        CtrCryptoInputStream.calculateIV(getInitIV(), counter, iv);
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/cipher/OpenSslGaloisCounterMode.java`
#### Snippet
```java
            return OpenSslNative.ctrl(context, type, arg, null);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/utils/Utils.java`
#### Snippet
```java
              }
          } catch (final Exception ex) {
              System.err.println("Could not load '" + SYSTEM_PROPERTIES_FILE + "' from classpath: " + ex.toString());
          }
          return defaultedProps;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/Crypto.java`
#### Snippet
```java
    private static void info(final String format, final Object... args) {
        if (!quiet) { // suppress output for testing
          System.out.println(String.format(format, args));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
        if (args.length >= 1) {
            if ("--os".equals(args[0])) {
                System.out.println(getOSName());
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
            }
            if ("--arch".equals(args[0])) {
                System.out.println(getArchName());
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
        }

        System.out.println(getNativeLibFolderPathForCurrentOS());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
        // TODO Find a better way to do this later.
        if (isDebug()) {
            System.out.println(String.format(format, args));
            if (args != null && args.length > 0 && args[0] instanceof Throwable) {
                ((Throwable) args[0]).printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
            System.out.println(String.format(format, args));
            if (args != null && args.length > 0 && args[0] instanceof Throwable) {
                ((Throwable) args[0]).printStackTrace(System.out);
            }
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
        if (initialisationError != null) {
            info("initialisationError(): %s", initialisationError);
            System.err.flush(); // helpful for stack traces to not mix in other output.
            throw initialisationError; // propagate to make error obvious
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
    private static void info(final String format, final Object... args) {
        // TODO Find a better way to do this later.
        System.out.println(String.format(format, args));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
        // TODO Find a better way to do this later.
        if (Boolean.getBoolean(KEY_DEBUG)) {
            System.out.println(String.format(Objects.toString(format), args));
        }
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
     */
    private static String translateArchNameToFolderName(final String archName) {
        return archName.replaceAll("\\W", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
            return "AIX";
        }
        return osName.replaceAll("\\W", "");
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.output` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/output/StreamOutput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.output.Output#write(ByteBuffer)}.
     * Writes a sequence of bytes to this output from the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#read(long, byte[], int, int)}
     * . Reads up to {@code len} bytes of data from the input stream into
     * an array of bytes. An attempt is made to read as many as {@code len}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java

    /**
     * Constructs a {@link org.apache.commons.crypto.stream.input.StreamInput}.
     *
     * @param inputStream the InputStream object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#read(ByteBuffer)}.
     * Reads a sequence of bytes from input into the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#skip(long)}. Skips
     * over and discards {@code n} bytes of data from this input stream.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#seek(long)}. Closes
     * this input and releases any system resources associated with the under
     * layer input.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/StreamInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#seek(long)}. Seeks to
     * the given offset from the start of the stream. The next read() will be
     * from that location.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link java.io.OutputStream#write(byte[], int, int)}.
     * Encryption is buffer based. If there is enough room in {@link #inBuffer},
     * then write to this buffer. If {@link #inBuffer} is full, then do
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link java.io.OutputStream#write(byte[])}. Writes the
     * specified byte to this output stream.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link java.nio.channels.WritableByteChannel#write(ByteBuffer)}. Writes a
     * sequence of bytes to this channel from the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link java.nio.channels.ReadableByteChannel#read(ByteBuffer)}. Reads a
     * sequence of bytes from this channel into the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link java.io.InputStream#read(byte[], int, int)}.
     * Decryption is buffer based. If there is data in {@link #outBuffer}, then
     * read it out of this buffer. If there is no data in {@link #outBuffer},
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link java.io.InputStream#read()}. Reads the next byte of
     * data from the input stream.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link java.io.InputStream#skip(long)}. Skips over and
     * discards {@code n} bytes of data from this input stream.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/random/JavaCryptoRandom.java`
#### Snippet
```java

    /**
     * Overrides {@link java.lang.AutoCloseable#close()}. For {@link JavaCryptoRandom}, we don't need to recycle resource.
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java

    /**
     * Overrides {@link java.lang.AutoCloseable#close()}. Closes the OS stream.
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.cipher` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/cipher/CryptoCipherFactory.java`
#### Snippet
```java
     * The value of CLASSES_KEY needs to be the full name of a
     * class that implements the
     * {@link org.apache.commons.crypto.cipher.CryptoCipher CryptoCipher} interface
     * The internal classes are listed in the enum
     * {@link CipherProvider CipherProvider}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.random` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
     * The value of the CLASSES_KEY needs to be the full name of a
     * class that implements the
     * {@link org.apache.commons.crypto.random.CryptoRandom CryptoRandom} interface
     * The internal classes are listed in the enum
     * {@link RandomProvider RandomProvider}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/random/OpenSslCryptoRandom.java`
#### Snippet
```java

    /**
     * Overrides {@link java.lang.AutoCloseable#close()}.
     * Does nothing.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCryptoRandom.java`
#### Snippet
```java

    /**
     * Overrides {@link java.lang.AutoCloseable#close()}. Closes OpenSSL context
     * if native enabled.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Constructs the
     * {@link org.apache.commons.crypto.stream.input.ChannelInput}.
     *
     * @param channel the ReadableByteChannel object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#read(long, byte[], int, int)}
     * . Reads up to {@code len} bytes of data from the input stream into
     * an array of bytes. An attempt is made to read as many as {@code len}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#seek(long)}. Closes
     * this input and releases any system resources associated with the under
     * layer input.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#skip(long)}. Skips
     * over and discards {@code n} bytes of data from this input stream.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#seek(long)}. Seeks to
     * the given offset from the start of the stream. The next read() will be
     * from that location.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.input` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/input/ChannelInput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.input.Input#read(ByteBuffer)}.
     * Reads a sequence of bytes from input into the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.output` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/output/ChannelOutput.java`
#### Snippet
```java
    /**
     * Overrides the
     * {@link org.apache.commons.crypto.stream.output.Output#write(ByteBuffer)}.
     * Writes a sequence of bytes to this output from the given buffer.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.crypto.stream.output` is unnecessary and can be removed
in `src/main/java/org/apache/commons/crypto/stream/output/ChannelOutput.java`
#### Snippet
```java
    /**
     * Constructs a
     * {@link org.apache.commons.crypto.stream.output.ChannelOutput}.
     *
     * @param channel the WritableByteChannel object.
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
    public int read() throws IOException {
        int n;
        while ((n = read(oneByteBuf, 0, 1)) == 0) { //NOPMD
            /* no op */
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
    private void cleanCipherStatePool() {
        CipherState cs;
        while ((cs = cipherStatePool.poll()) != null) {
            try {
                cs.getCryptoCipher().close();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
    private void cleanByteBufferPool() {
        ByteBuffer buf;
        while ((buf = byteBufferPool.poll()) != null) {
            CryptoInputStream.freeDirectBuffer(buf);
        }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `stream` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java
    private static final int RESERVOIR_LENGTH = 8192;

    private transient FileInputStream stream;

    private final byte[] reservoir = new byte[RESERVOIR_LENGTH];
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java
    private final byte[] reservoir = new byte[RESERVOIR_LENGTH];

    private int pos = reservoir.length;

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/crypto/Crypto.java`
#### Snippet
```java
    public static final String LIB_TEMPDIR_KEY = Crypto.CONF_PREFIX + "lib.tempdir";

    private static boolean quiet = false;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/crypto/utils/IoUtils.java`
#### Snippet
```java
            }
            toRead -= ret;
            off += ret;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
            if (len < remaining) {
                inBuffer.put(array, off, len);
                len = 0;
            } else {
                inBuffer.put(array, off, remaining);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
            } else {
                inBuffer.put(array, off, remaining);
                off += remaining;
                len -= remaining;
                encrypt();
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/crypto/stream/CryptoOutputStream.java`
#### Snippet
```java
                inBuffer.put(array, off, remaining);
                off += remaining;
                len -= remaining;
                encrypt();
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
         * the number of skipped bytes from the user's point of view.
         */
        n -= outBuffer.remaining();
        long skipped = input.skip(n);
        if (skipped < 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
            if (j++ < 8) { // Big-endian, and long is 8 bytes length
                sum += (byte) counter & 0xff;
                counter >>>= 8;
            }
            IV[i] = (byte) sum;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-07-17-38-58.005.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/crypto/cipher/CryptoCipherFactory.java`
#### Snippet
```java
    private static final String CLASSES_DEFAULT =
            CipherProvider.OPENSSL.getClassName()
            .concat(",")
            .concat(CipherProvider.JCE.getClassName());

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/crypto/cipher/CryptoCipherFactory.java`
#### Snippet
```java
            CipherProvider.OPENSSL.getClassName()
            .concat(",")
            .concat(CipherProvider.JCE.getClassName());

    /**
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
    private static final String CLASSES_DEFAULT =
        RandomProvider.OPENSSL.getClassName()
        .concat(",")
        .concat(RandomProvider.JAVA.getClassName());

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
        RandomProvider.OPENSSL.getClassName()
        .concat(",")
        .concat(RandomProvider.JAVA.getClassName());

    /**
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/utils/ReflectionUtils.java`
#### Snippet
```java
                // Leave a marker that the class isn't found
                map.put(name, new WeakReference<>(NEGATIVE_CACHE_SENTINEL));
                return null;
            }
            // two putters can race here, but they'll put the same class
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/utils/ReflectionUtils.java`
#### Snippet
```java
        }
        if (clazz == NEGATIVE_CACHE_SENTINEL) {
            return null; // not found
        }
        // cache hit
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
            if (inputStream == null) {
                debug("Resource not found: %s", nativeLibraryFilePath);
                return null;
            }
            // Extract a native library file into the target directory
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
        } catch (final IOException e) {
            debug("Ignoring %s", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
                System.loadLibrary(libname);
            }
            return null; // OK
        } catch (final Exception | UnsatisfiedLinkError t) {
            return t;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/crypto/jna/OpenSsl11XNativeJna.java`
#### Snippet
```java
    @Override
    public PointerByReference _RAND_SSLeay() {
        return null; // Not available
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCryptoRandom.java`
#### Snippet
```java
    public void nextBytes(final byte[] bytes) {

        synchronized (OpenSslJnaCryptoRandom.class) {
            // this method is synchronized for now
            // to support multithreading https://wiki.openssl.org/index.php/Manual:Threads(3) needs to be done
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/org/apache/commons/crypto/Crypto.java`
#### Snippet
```java
    private static void info(final String format, final Object... args) {
        if (!quiet) { // suppress output for testing
          System.out.println(String.format(format, args));
        }
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/org/apache/commons/crypto/NativeCodeLoader.java`
#### Snippet
```java
        // TODO Find a better way to do this later.
        if (isDebug()) {
            System.out.println(String.format(format, args));
            if (args != null && args.length > 0 && args[0] instanceof Throwable) {
                ((Throwable) args[0]).printStackTrace(System.out);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
    private static void info(final String format, final Object... args) {
        // TODO Find a better way to do this later.
        System.out.println(String.format(format, args));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJna.java`
#### Snippet
```java
        // TODO Find a better way to do this later.
        if (Boolean.getBoolean(KEY_DEBUG)) {
            System.out.println(String.format(Objects.toString(format), args));
        }
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
                final String SUN_CLASS = "sun.nio.ch.DirectBuffer";
                final Class<?>[] interfaces = buffer.getClass().getInterfaces();
                final Object[] EMPTY_OBJECT_ARRAY = {};

                for (final Class<?> clazz : interfaces) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `versionFunction` initializer `null` is redundant
in `src/main/java/org/apache/commons/crypto/jna/OpenSslNativeJna.java`
#### Snippet
```java
        final NativeLibrary crypto = NativeLibrary.getInstance(libraryName);
        OpenSslJna.debug("OpenSslNativeJna NativeLibrary.getInstance('%s') -> %s", libraryName, crypto);
        Function versionFunction = null;
        try {
            versionFunction = crypto.getFunction("SSLeay");
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/crypto/random/OsCryptoRandom.java`
#### Snippet
```java
    synchronized public void nextBytes(final byte[] bytes) {
        int off = 0;
        int n = 0;
        while (off < bytes.length) {
            fillReservoir(0);
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/crypto/cipher/CryptoCipherFactory.java`
#### Snippet
```java
            } catch (final Exception e) {
                lastException = e;
                errorMessage.append("{" + klass + "}");
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/crypto/cipher/CryptoCipherFactory.java`
#### Snippet
```java
            return cipher;
        }
        errorMessage.append(" is not available or transformation " + transformation + " is not supported.");
        throw new GeneralSecurityException(errorMessage.toString(), lastException);
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
            } catch (final ClassCastException e) {
                lastException = e;
                errorMessage.append("Class: [" + klassName + "] is not a CryptoRandom.");
            } catch (final ClassNotFoundException e) {
                lastException = e;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
            } catch (final ClassNotFoundException e) {
                lastException = e;
                errorMessage.append("CryptoRandom: [" + klassName + "] not found.");
            } catch (final Exception e) {
                lastException = e;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/crypto/random/CryptoRandomFactory.java`
#### Snippet
```java
            } catch (final Exception e) {
                lastException = e;
                errorMessage.append("CryptoRandom: [" + klassName + "] failed with " + e.getMessage());
            }
        }
```

