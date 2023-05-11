# hadoop-crypto 
 
# Bad smells
I found 103 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 56 | false |
| Deprecation | 22 | false |
| NullableProblems | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| DuplicatedCode | 2 | false |
| JavadocDeclaration | 2 | false |
| FieldMayBeFinal | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UnstableApiUsage | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| FieldCanBeLocal | 1 | false |
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            stream.write(wrappingIv);

            String keyAlgorithm = secretKey.getAlgorithm();
            stream.writeInt(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.writeInt(encryptedKey.length);
            stream.write(encryptedKey);

            byte[] iv = keyMaterial.getIv();
            stream.writeInt(iv.length);
            stream.write(iv);

            stream.close();
            return byteStream.toByteArray();
```

### DuplicatedCode
Duplicated code
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            int algorithmLength = stream.readInt();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);

            int keyLength = stream.readInt();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);

            int ivLength = stream.readInt();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);

            String algorithm = new String(algorithmBytes, StandardCharsets.UTF_8);
            SecretKey secretKey = (SecretKey) keyUnwrappingCipher.unwrap(secretKeyBytes, algorithm, Cipher.SECRET_KEY);
            return KeyMaterial.of(secretKey, iv);
```

## RuleId[id=Deprecation]
### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/SymmetricKeySerializerV4.java`
#### Snippet
```java
                | InvalidKeyException
                | InvalidAlgorithmParameterException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            return byteStream.toByteArray();
        } catch (IOException | InvalidKeyException | IllegalBlockSizeException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'com.palantir.crypto2.keys.serialization.KeySerializerV1' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
 * </pre>
 *
 * {@link KeySerializerV1} incorrectly wrote the length values for the algorithm, wrapped key, and iv as bytes rather
 * than ints which meant certain {@link KeyMaterial} couldn't be properly serialized/deserialized when {@link KeyPair}s
 * of certain lengths were used.
```

### Deprecation
'com.palantir.crypto2.keys.serialization.SymmetricKeySerializerV3' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializers.java`
#### Snippet
```java
            KeySerializerV2.INSTANCE.getVersion(), KeySerializerV2.INSTANCE);
    private static final Map<Integer, ? extends SymmetricKeySerializer> SYMMETRIC_SERIALIZERS = ImmutableMap.of(
            SymmetricKeySerializerV3.INSTANCE.getVersion(), SymmetricKeySerializerV3.INSTANCE,
            SymmetricKeySerializerV4.INSTANCE.getVersion(), SymmetricKeySerializerV4.INSTANCE);

```

### Deprecation
'com.palantir.crypto2.keys.serialization.SymmetricKeySerializerV3' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializers.java`
#### Snippet
```java
            KeySerializerV2.INSTANCE.getVersion(), KeySerializerV2.INSTANCE);
    private static final Map<Integer, ? extends SymmetricKeySerializer> SYMMETRIC_SERIALIZERS = ImmutableMap.of(
            SymmetricKeySerializerV3.INSTANCE.getVersion(), SymmetricKeySerializerV3.INSTANCE,
            SymmetricKeySerializerV4.INSTANCE.getVersion(), SymmetricKeySerializerV4.INSTANCE);

```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializers.java`
#### Snippet
```java
            return cipher;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'com.palantir.crypto2.keys.serialization.KeySerializerV1' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializers.java`
#### Snippet
```java

    private static final Map<Integer, ? extends KeySerializer> SERIALIZERS = ImmutableMap.of(
            KeySerializerV1.INSTANCE.getVersion(), KeySerializerV1.INSTANCE,
            KeySerializerV2.INSTANCE.getVersion(), KeySerializerV2.INSTANCE);
    private static final Map<Integer, ? extends SymmetricKeySerializer> SYMMETRIC_SERIALIZERS = ImmutableMap.of(
```

### Deprecation
'com.palantir.crypto2.keys.serialization.KeySerializerV1' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializers.java`
#### Snippet
```java

    private static final Map<Integer, ? extends KeySerializer> SERIALIZERS = ImmutableMap.of(
            KeySerializerV1.INSTANCE.getVersion(), KeySerializerV1.INSTANCE,
            KeySerializerV2.INSTANCE.getVersion(), KeySerializerV2.INSTANCE);
    private static final Map<Integer, ? extends SymmetricKeySerializer> SYMMETRIC_SERIALIZERS = ImmutableMap.of(
```

### Deprecation
'isFile(org.apache.hadoop.fs.Path)' is deprecated
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/StandaloneEncryptedFileSystem.java`
#### Snippet
```java
        // deletes both the payload files and the adjacent encryption materials. For files we can
        // rely on the EncryptedFileSystem handling removal of both the file and the key material.
        if (fs.isFile(path)) {
            return fs.delete(path, false);
        } else {
```

### Deprecation
'isFile(org.apache.hadoop.fs.Path)' is deprecated
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/StandaloneEncryptedFileSystem.java`
#### Snippet
```java
        // renames both the payload files and the adjacent encryption materials. For files we can
        // rely on the EncryptedFileSystem handling renaming both the file and the key material.
        if (fs.isFile(src)) {
            return fs.rename(src, dst);
        } else {
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/PublicKeys.java`
#### Snippet
```java
            return keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/AesCtrCipher.java`
#### Snippet
```java
            return cipher;
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/AesCtrCipher.java`
#### Snippet
```java
            cipher.init(currentOpmode, key, newIv);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            throw Throwables.propagate(e);
        }

```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/AesCtrCipher.java`
#### Snippet
```java
            return Cipher.getInstance(ALGORITHM, PROVIDER);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/AesCbcCipher.java`
#### Snippet
```java
            return cipher;
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/AesCbcCipher.java`
#### Snippet
```java
            return Cipher.getInstance(ALGORITHM, PROVIDER);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/KeyPairs.java`
#### Snippet
```java
            return new KeyPair(keyFactory.generatePublic(publicKs), privateKey.orElse(null));
        } catch (GeneralSecurityException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/FileKeyStorageStrategy.java`
#### Snippet
```java
            stream.write(wrappedKey);
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/FileKeyStorageStrategy.java`
#### Snippet
```java
            fs.delete(getKeyPath(fileKey), false);
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/FileKeyStorageStrategy.java`
#### Snippet
```java
            return KeyMaterials.unwrap(wrappedKey, privateKey.get());
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java
            maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw Throwables.propagate(e);
        }
        int safeSize = Math.min(maxAllowedKeyLength, desiredLength);
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java
            return keyGen.generateKey();
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw Throwables.propagate(e);
        }
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java

    /**
     * See {@link KeySerializer} to understand when to use {@link #wrap} vs. {@link #symmetricWrap}.
     */
    public static byte[] wrap(KeyMaterial keyMaterial, PublicKey key) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java

    /**
     * See {@link SymmetricKeySerializer} to understand when to use {@link #wrap} vs. {@link #symmetricWrap}.
     */
    public static byte[] symmetricWrap(KeyMaterial keyMaterial, SecretKey key) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] bytes) throws IOException {
        out.write(bytes);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] bytes, int off, int len) throws IOException {
        out.write(bytes, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] buf, int off, int len) throws IOException {
        return delegate.read(buf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `crypto-core/src/main/java/com/palantir/crypto2/io/DefaultSeekableInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] buf, int off, int len) throws IOException {
        return input.read(buf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `crypto-core/src/main/java/com/palantir/crypto2/io/CryptoStreamFactory.java`
#### Snippet
```java

        @Override
        public void write(byte[] buffer, int off, int len) throws IOException {
            validateArgs(buffer, off, len);
            doWrite(buffer, off, len);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `input` may be 'final'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherInputStream.java`
#### Snippet
```java
    private static final class FsSeekableInput implements SeekableInput {

        private FSDataInputStream input;

        private FsSeekableInput(FSDataInputStream input) {
```

### FieldMayBeFinal
Field `fromUriFunc` may be 'final'
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/PathConvertingFileSystem.java`
#### Snippet
```java
    private final Function<Path, Path> toFunc;
    private final Function<Path, Path> fromFunc;
    private Function<URI, URI> fromUriFunc;

    public PathConvertingFileSystem(
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/SymmetricKeySerializerV3.java`
#### Snippet
```java
 * limitation.
 *
 * [1] https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-38d.pdf
 */
@Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `crypto-core/src/main/java/com/palantir/crypto2/cipher/SeekableCipherFactory.java`
#### Snippet
```java
     * KeyMaterial)} directly.
     * <p>
     * ex: https://github.com/palantir/hadoop-crypto/pull/77
     */
    @Deprecated
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/StandaloneEncryptedFileSystem.java`
#### Snippet
```java
    // The raw underlying FileSystem that encrypted bytes and key material is stored on
    private FileSystem delegate;
    private KeyStorageStrategy keyStore;

    @Override
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

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherOutputStream.java`
#### Snippet
```java
    @Override
    public void write(byte[] bytes) throws IOException {
        out.write(bytes);
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherOutputStream.java`
#### Snippet
```java
    @Override
    public void write(byte[] bytes, int off, int len) throws IOException {
        out.write(bytes, off, len);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherInputStream.java`
#### Snippet
```java
        @Override
        public int read(byte[] bytes, int offset, int length) throws IOException {
            return input.read(bytes, offset, length);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/cipher/FsCipherInputStream.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            input.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java

        try {
            int version = stream.read();
            Preconditions.checkArgument(
                    VERSION == version,
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
                    version);

            int algorithmLength = stream.read();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            int algorithmLength = stream.read();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);

            int keyLength = stream.read();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            stream.readFully(algorithmBytes);

            int keyLength = stream.read();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            int keyLength = stream.read();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);

            int ivLength = stream.read();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            stream.readFully(secretKeyBytes);

            int ivLength = stream.read();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            int ivLength = stream.read();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);

            String algorithm = new String(algorithmBytes, StandardCharsets.UTF_8);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            String keyAlgorithm = secretKey.getAlgorithm();
            stream.write(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.write(encryptedKey.length);
            stream.write(encryptedKey);

            byte[] iv = keyMaterial.getIv();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            byte[] iv = keyMaterial.getIv();
            stream.write(iv.length);
            stream.write(iv);

            stream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV1.java`
#### Snippet
```java
            stream.write(iv);

            stream.close();
            return stream.toByteArray();
        } catch (IOException | InvalidKeyException | IllegalBlockSizeException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java

        try {
            stream.write(VERSION);

            String keyAlgorithm = secretKey.getAlgorithm();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java

            String keyAlgorithm = secretKey.getAlgorithm();
            stream.writeInt(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            String keyAlgorithm = secretKey.getAlgorithm();
            stream.writeInt(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.writeInt(encryptedKey.length);
            stream.write(encryptedKey);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.writeInt(encryptedKey.length);
            stream.write(encryptedKey);

            byte[] iv = keyMaterial.getIv();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java

            byte[] iv = keyMaterial.getIv();
            stream.writeInt(iv.length);
            stream.write(iv);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            byte[] iv = keyMaterial.getIv();
            stream.writeInt(iv.length);
            stream.write(iv);

            stream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            stream.write(iv);

            stream.close();
            return byteStream.toByteArray();
        } catch (IOException | InvalidKeyException | IllegalBlockSizeException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java

        try {
            int version = stream.read();
            Preconditions.checkArgument(
                    VERSION == version,
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
                    version);

            int algorithmLength = stream.readInt();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            int algorithmLength = stream.readInt();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);

            int keyLength = stream.readInt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            stream.readFully(algorithmBytes);

            int keyLength = stream.readInt();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            int keyLength = stream.readInt();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);

            int ivLength = stream.readInt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            stream.readFully(secretKeyBytes);

            int ivLength = stream.readInt();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeySerializerV2.java`
#### Snippet
```java
            int ivLength = stream.readInt();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);

            String algorithm = new String(algorithmBytes, StandardCharsets.UTF_8);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/DecryptingSeekableInput.java`
#### Snippet
```java
    @Override
    public int read(byte[] buffer, int offset, int length) throws IOException {
        int bytesRead = decryptedStream.read(buffer, offset, length);
        if (bytesRead != -1) {
            decryptedStreamPos += bytesRead;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

        try {
            stream.write(version);

            stream.write(wrappingIv);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            stream.write(version);

            stream.write(wrappingIv);

            String keyAlgorithm = secretKey.getAlgorithm();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

            String keyAlgorithm = secretKey.getAlgorithm();
            stream.writeInt(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            String keyAlgorithm = secretKey.getAlgorithm();
            stream.writeInt(keyAlgorithm.length());
            stream.write(keyAlgorithm.getBytes(StandardCharsets.UTF_8));

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.writeInt(encryptedKey.length);
            stream.write(encryptedKey);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            byte[] encryptedKey = keyWrappingCipher.wrap(secretKey);
            stream.writeInt(encryptedKey.length);
            stream.write(encryptedKey);

            byte[] iv = keyMaterial.getIv();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

            byte[] iv = keyMaterial.getIv();
            stream.writeInt(iv.length);
            stream.write(iv);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            byte[] iv = keyMaterial.getIv();
            stream.writeInt(iv.length);
            stream.write(iv);

            stream.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            stream.write(iv);

            stream.close();
            return byteStream.toByteArray();
        } catch (IOException | InvalidKeyException | IllegalBlockSizeException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

        try {
            int readVersion = stream.read();
            Preconditions.checkArgument(
                    readVersion == version,
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java

            byte[] wrappingIv = new byte[ivSize];
            stream.readFully(wrappingIv);
            Cipher keyUnwrappingCipher = cipherFactory.getCipher(Cipher.UNWRAP_MODE, key, wrappingIv);

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            Cipher keyUnwrappingCipher = cipherFactory.getCipher(Cipher.UNWRAP_MODE, key, wrappingIv);

            int algorithmLength = stream.readInt();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            int algorithmLength = stream.readInt();
            byte[] algorithmBytes = new byte[algorithmLength];
            stream.readFully(algorithmBytes);

            int keyLength = stream.readInt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            stream.readFully(algorithmBytes);

            int keyLength = stream.readInt();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            int keyLength = stream.readInt();
            byte[] secretKeyBytes = new byte[keyLength];
            stream.readFully(secretKeyBytes);

            int ivLength = stream.readInt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            stream.readFully(secretKeyBytes);

            int ivLength = stream.readInt();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/CipherSymmetricKeySerializer.java`
#### Snippet
```java
            int ivLength = stream.readInt();
            byte[] iv = new byte[ivLength];
            stream.readFully(iv);

            String algorithm = new String(algorithmBytes, StandardCharsets.UTF_8);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/DefaultSeekableInputStream.java`
#### Snippet
```java
    @Override
    public void close() throws IOException {
        input.close();
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/CryptoStreamFactory.java`
#### Snippet
```java
            while (remaining > 0) {
                int toWrite = Math.min(remaining, CHUNK_SIZE);
                out.write(buffer, currentOffset, toWrite);
                currentOffset += toWrite;
                remaining -= toWrite;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/CryptoStreamFactory.java`
#### Snippet
```java
    private static final Supplier<Boolean> OPENSSL_IS_AVAILABLE = Suppliers.memoize(() -> {
        try {
            ApacheCtrDecryptingSeekableInput.getCipherInstance().close();
            log.info("Detected OpenSSL: the openssl native implementation will be used for AES/CTR/NoPadding");
            return true;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/CryptoStreamFactory.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            input.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/CryptoStreamFactory.java`
#### Snippet
```java
        @Override
        public int read(byte[] bytes, int offset, int length) throws IOException {
            return input.read(bytes, offset, length);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-core/src/main/java/com/palantir/crypto2/io/ApacheCtrDecryptingSeekableInput.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            input.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `hadoop-crypto/src/main/java/com/palantir/crypto2/hadoop/FileKeyStorageStrategy.java`
#### Snippet
```java
        try (OutputStream stream = fs.create(getKeyPath(fileKey))) {
            byte[] wrappedKey = KeyMaterials.wrap(keyMaterial, publicKey);
            stream.write(wrappedKey);
        } catch (IOException e) {
            throw Throwables.propagate(e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `crypto-keys/src/main/java/com/palantir/crypto2/keys/serialization/KeyMaterials.java`
#### Snippet
```java
        try {
            DataInputStream stream = new DataInputStream(new ByteArrayInputStream(wrappedKeyMaterial));
            return stream.read();
        } catch (IOException e) {
            throw new SafeRuntimeException("Unable to read version from wrapped key", e);
```

