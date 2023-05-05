# commons-crypto 
 
# Bad smells
I found 31 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 7 | false |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| RedundantStringFormatCall | 4 | false |
| DanglingJavadoc | 4 | false |
| DuplicatedCode | 2 | false |
| UnusedAssignment | 2 | false |
| FieldCanBeLocal | 2 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
        remaining = outBuffer.remaining();
        final int toRead = dst.remaining();
        if (toRead <= remaining) {
            final int limit = outBuffer.limit();
            outBuffer.limit(outBuffer.position() + toRead);
            dst.put(outBuffer);
            outBuffer.limit(limit);
            return toRead;
        }
        dst.put(outBuffer);
        return remaining;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
        final int inputSize = inBuffer.remaining();
        try {
            final int n = cipher.update(inBuffer, out);
            if (n < inputSize) {
                /**
                 * Typically code will not get here. CryptoCipher#update will
                 * consume all input data and put result in outBuffer.
                 * CryptoCipher#doFinal will reset the cipher context.
                 */
                cipher.doFinal(inBuffer, out);
                cipherReset = true;
            }
        } catch (final GeneralSecurityException e) {
            throw new IOException(e);
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/commons/crypto/stream/CryptoInputStream.java`
#### Snippet
```java
    public int read() throws IOException {
        int n;
        while ((n = read(oneByteBuf, 0, 1)) == 0) { //NOPMD
            /* no op */
        }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoOutputStream.java`
#### Snippet
```java
            final int n = cipher.update(inBuffer, out);
            if (n < inputSize) {
                /**
                 * Typically code will not get here. CryptoCipher#update will
                 * consume all input data and put result in outBuffer.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/crypto/jna/OpenSsl11XNativeJna.java`
#### Snippet
```java
    public static native PointerByReference EVP_CIPHER_CTX_new();

    /**
     * Clears all information from a cipher context and free up any allocated * memory associate
     * with it.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/crypto/stream/PositionedCryptoInputStream.java`
#### Snippet
```java
            final int n = state.getCryptoCipher().update(inByteBuffer, outByteBuffer);
            if (n < inputSize) {
                /**
                 * Typically code will not get here. CryptoCipher#update will
                 * consume all input data and put result in outBuffer.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java
            final int n = cipher.update(inBuffer, out);
            if (n < inputSize) {
                /**
                 * Typically code will not get here. CryptoCipher#update will
                 * consume all input data and put result in outBuffer.
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for PPC64 architecture, the value is:
     * {@value #PPC64}.
     */
    static final String PPC64 = "ppc64";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for PPC architecture, the value is:
     * {@value #PPC}.
     */
    static final String PPC = "ppc";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for IA64_32 architecture, the value is:
     * {@value #IA64_32}.
     */
    static final String IA64_32 = "ia64_32";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for X86_64 architecture, the value is:
     * {@value #X86_64}.
     */
    static final String X86_64 = "x86_64";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for IA64 architecture, the value is:
     * {@value #IA64}.
     */
    static final String IA64 = "ia64";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/OsInfo.java`
#### Snippet
```java
    /**
     * The constant string represents for X86 architecture, the value is:
     * {@value #X86}.
     */
    static final String X86 = "x86";
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/crypto/stream/CtrCryptoInputStream.java`
#### Snippet
```java

    /**
     * Overrides the {@link CtrCryptoInputStream#initCipher()}. Initializes the
     * cipher.
     */
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCipher.java`
#### Snippet
```java
        }
    }
    private PointerByReference algo;
    private final PointerByReference context;
    private final AlgorithmMode algorithmMode;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/crypto/jna/OpenSslJnaCipher.java`
#### Snippet
```java
    private final String transformation;

    private final int IV_LENGTH = 16;

    /**
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

