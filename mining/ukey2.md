# ukey2 
 
# Bad smells
I found 108 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 60 | false |
| JavadocDeclaration | 13 | false |
| UnusedAssignment | 8 | false |
| SuspiciousNameCombination | 5 | false |
| CharsetObjectCanBeUsed | 5 | false |
| FieldMayBeFinal | 4 | false |
| UnnecessaryModifier | 3 | true |
| DataFlowIssue | 3 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| TrivialIf | 2 | false |
| DanglingJavadoc | 1 | false |
## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

    // Points on the curve satisfy y^2 = x^3 + ax + b  (mod p)
    BigInteger lhs = squareMod(y, p);
    BigInteger rhs = squareMod(x, p).add(EC_P256_A) // = (x^2 + a)
        .multiply(x).mod(p) // = x(x^2 + a) = x^3 + ax
```

### SuspiciousNameCombination
'encodedX' should probably not be passed as parameter 'y'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
  public static DHPrivateKey parseDh2048PrivateKey(byte[] encodedX)
      throws InvalidKeySpecException {
    validateDhEncoding(encodedX);  // Could be stricter for x, but should be fine to use this
    BigInteger x;
    try {
```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
      throw new InvalidKeySpecException();
    }
    validateDhGroupElement(x);  // Again, this validation should be good enough
    return new DHPrivateKeyShim(x, new DHParameterSpec(DH_P, DH_G));
  }
```

### SuspiciousNameCombination
'eitherXorY' should probably not be returned from method 'getX'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

    public BigInteger getX() {
      return eitherXorY;
    }

```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'eitherXorY'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
  public static class DHPrivateKeyShim extends DHKeyShim implements DHPrivateKey {
    public DHPrivateKeyShim(BigInteger x, DHParameterSpec params) {
      super(x, params);
    }
  }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContext.java`
#### Snippet
```java
  public String decodeMessageFromPeerAsString(byte[] message) throws SignatureException {
    try {
      return new String(decodeMessageFromPeer(message), UTF8);
    } catch (UnsupportedEncodingException e) {
      // Should never happen - we should always be able to UTF-8-encode a string
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContext.java`
#### Snippet
```java
  public byte[] encodeMessageToPeer(String payload) {
    try {
      return encodeMessageToPeer(payload.getBytes(UTF8));
    } catch (UnsupportedEncodingException e) {
      // Should never happen - we should always be able to UTF-8-encode a string
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/google/security/cryptauth/lib/securemessage/CryptoOps.java`
#### Snippet
```java
  public static byte[] utf8StringToBytes(String input) {
    try {
      return input.getBytes("UTF-8");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);  // Shouldn't happen, UTF-8 is universal
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

    try {
      salt = "UKEY2 v1 auth".getBytes(UTF_8);
    } catch (UnsupportedEncodingException e) {
      // unreachable in practice
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
    byte[] salt = null;
    try {
      salt = "UKEY2 v1 next".getBytes(UTF_8);
    } catch (UnsupportedEncodingException e) {
      // unreachable
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   */
  private KeyPair genKeyPair(HandshakeCipher cipher) throws HandshakeException {
    switch (cipher) {
      case P256_SHA512:
        return PublicKeyProtoUtil.generateEcP256KeyPair();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
  private void verifyCommitment(byte[] handshakeMessage) throws HandshakeException {
    byte[] actualClientFinishHash = null;
    switch (handshakeCipher) {
      case P256_SHA512:
        actualClientFinishHash = sha512(handshakeMessage);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/security/annotations/CryptoAnnotation.java`
#### Snippet
```java
  public enum Purpose {ENCRYPTION, AUTHENTICATION, OBFUSCATION,
    INTEGRITY_CHECK, PASSWORD, OTHER}
  public enum LeakSeverity {S0, S1, S2, S3, S4, NoRisk}
  public enum RemovalPriority {P0, P1, P2, P3, P4, WillNotFix}
  
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/security/annotations/CryptoAnnotation.java`
#### Snippet
```java
   * code at the discretion of the code owner.
   */
  public enum Purpose {ENCRYPTION, AUTHENTICATION, OBFUSCATION,
    INTEGRITY_CHECK, PASSWORD, OTHER}
  public enum LeakSeverity {S0, S1, S2, S3, S4, NoRisk}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/security/annotations/CryptoAnnotation.java`
#### Snippet
```java
    INTEGRITY_CHECK, PASSWORD, OTHER}
  public enum LeakSeverity {S0, S1, S2, S3, S4, NoRisk}
  public enum RemovalPriority {P0, P1, P2, P3, P4, WillNotFix}
  
  LeakSeverity leakSeverity();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `SecureGcmProto`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/TransportCryptoOps.java`
#### Snippet
```java

  /**
   * A type safe version of the {@link SecureGcmProto} {@code Type} codes.
   */
  public enum PayloadType {
```

### JavadocReference
Cannot resolve symbol `Header`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * @param header a serialized representation of a {@link Header}
   * @param body arbitrary payload data
   * @return a serialized representation of a {@link SecureMessageProto.HeaderAndBody}
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
   *
   * @param responderHello is an optional public value to attach in the header of
   *     the {@link SecureMessage} (in the DecryptionKeyId).
   */
  @VisibleForTesting
```

### JavadocReference
Cannot resolve symbol `SecureMessageProto.HeaderAndBody`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
   * @param header a serialized representation of a {@link Header}
   * @param body arbitrary payload data
   * @return a serialized representation of a {@link SecureMessageProto.HeaderAndBody}
   */
  private byte[] serializeHeaderAndBody(byte[] header, byte[] body) {
```

### JavadocReference
Cannot resolve symbol `GenericPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
  /**
   * Used by the initiator device to derive the shared key from the {@link PrivateKey} in the
   * {@link D2DHandshakeContext} and the responder's {@link GenericPublicKey} (contained in the
   * {@link ResponderHello} proto).
   */
```

### JavadocReference
Cannot resolve symbol `ResponderHello`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
   * Used by the initiator device to derive the shared key from the {@link PrivateKey} in the
   * {@link D2DHandshakeContext} and the responder's {@link GenericPublicKey} (contained in the
   * {@link ResponderHello} proto).
   */
  static SecretKey deriveSharedKeyFromGenericPublicKey(
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
   * To be used only with {@link #buildSignCryptedMessage(Key, SigType, Key, EncType, byte[])},
   * this value is sent <em>UNENCRYPTED</em> as part of the header. It should be used by the
   * recipient of the {@link SecureMessage} to identify an appropriate key to use for decrypting
   * the message body.
   */
```

### JavadocReference
Cannot resolve symbol `ResponderHello`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
   * can derive the shared secret that was used to sign/encrypt the message.
   *
   * @return the {@link ResponderHello} embedded in the signcrypted message.
   */
  static ResponderHello parseAndValidateResponderHello(
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Parses a {@link SecureMessage} containing a cleartext payload body, and verifies the signature.
   *
   * @return the parsed {@link HeaderAndBody} pair (which is fully verified)
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * The recipient of the {@link SecureMessage} should be able to uniquely determine the correct
   * verification key, given only this value.
   * <p>
```

### JavadocReference
Cannot resolve symbol `HeaderAndBody`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java
   * Parses a {@link SecureMessage} containing a cleartext payload body, and verifies the signature.
   *
   * @return the parsed {@link HeaderAndBody} pair (which is fully verified)
   * @throws SignatureException if signature verification fails
   * @see SecureMessageBuilder#buildSignedCleartextMessage(Key, SigType, byte[])
```

### JavadocReference
Cannot resolve symbol `ResponderHello`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
  /**
   * Used by the responder device to create a signcrypted message that contains
   * a payload and a {@link ResponderHello}.
   *
   * @param sharedKey used to signcrypt the {@link Payload}
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * Optional metadata to be sent along with the header information in this {@link SecureMessage}.
   * <p>
   * Note that this value will be sent <em>UNENCRYPTED</em> in all cases.
```

### JavadocReference
Cannot resolve symbol `Header`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Extracts the {@link Header} component from a {@link SecureMessage} but <em>DOES NOT VERIFY</em>
   * the signature when doing so. Callers should not trust the resulting output until after a
   * subsequent {@code parse*()} call has succeeded.
```

### JavadocReference
Cannot resolve symbol `ResponderHello`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
   * @param sharedKey used to signcrypt the {@link Payload}
   * @param publicDhKey the key the recipient will need to derive the shared DH secret.
   *   This key will be added to the {@link ResponderHello} in the header.
   * @param protocolVersion the protocol version to include in the proto
   */
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * Generates a signed {@link SecureMessage} with the payload {@code body} left
   * <em>UNENCRYPTED</em>.
   *
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Extracts the {@link Header} component from a {@link SecureMessage} but <em>DOES NOT VERIFY</em>
   * the signature when doing so. Callers should not trust the resulting output until after a
   * subsequent {@code parse*()} call has succeeded.
```

### JavadocReference
Cannot resolve symbol `DeviceToDeviceMessage`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
  /**
   * Used by the initiator device to decrypt the first payload portion that was sent in the
   * {@code responderHelloAndPayload}, and extract the {@link DeviceToDeviceMessage} contained
   * within it. In order to decrypt, the {@code sharedKey} must first be derived.
   *
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

/**
 * Utility class to parse and verify {@link SecureMessage} protos. Verifies the signature on the
 * message, and decrypts "signcrypted" messages (while simultaneously verifying the signature).
 *
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Parses a {@link SecureMessage} containing an encrypted payload body, extracting a decryption of
   * the payload body and verifying the signature.
   *
```

### JavadocReference
Cannot resolve symbol `GenericPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DCryptoOps.java`
#### Snippet
```java
   * within it. In order to decrypt, the {@code sharedKey} must first be derived.
   *
   * @see #deriveSharedKeyFromGenericPublicKey(PrivateKey, GenericPublicKey)
   */
  static DeviceToDeviceMessage decryptResponderHelloMessage(
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
   * <p>Doesn't currently support symmetric keys stored in a TPM (since we access the raw key).
   *
   * @see SecureMessageParser#parseSignedCleartextMessage(SecureMessage, Key, SigType)
   */
  public SecureMessage buildSignedCleartextMessage(Key signingKey, SigType sigType, byte[] body)
```

### JavadocReference
Cannot resolve symbol `HeaderAndBody`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java
   *
   * @param associatedData optional associated data bound to the signature (but not in the message)
   * @return the parsed {@link HeaderAndBody} pair (which is fully verified and decrypted)
   * @throws SignatureException if signature verification fails
   * @see SecureMessageBuilder#buildSignCryptedMessage(Key, SigType, Key, EncType, byte[])
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

/**
 * Builder for {@link SecureMessage} protos. Can be used to create either signed messages,
 * or "signcrypted" (encrypted then signed) messages that include a tight binding between the
 * ciphertext portion and a verification key identity.
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Parses a {@link SecureMessage} containing a cleartext payload body, and verifies the signature.
   *
   * @param associatedData optional associated data bound to the signature (but not in the message)
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * Additional data is "associated" with this {@link SecureMessage}, but will not be sent as
   * part of it. The recipient of the {@link SecureMessage} will need to provide the same data in
   * order to verify the message body. Setting this to {@code null} is equivalent to using an
```

### JavadocReference
Cannot resolve symbol `HeaderAndBody`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java
   *
   * @param associatedData optional associated data bound to the signature (but not in the message)
   * @return the parsed {@link HeaderAndBody} pair (which is fully verified)
   * @throws SignatureException if signature verification fails
   * @see SecureMessageBuilder#buildSignedCleartextMessage(Key, SigType, byte[])
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
  /**
   * Additional data is "associated" with this {@link SecureMessage}, but will not be sent as
   * part of it. The recipient of the {@link SecureMessage} will need to provide the same data in
   * order to verify the message body. Setting this to {@code null} is equivalent to using an
   * empty array (unlike the behavior of {@code VerificationKeyId} and {@code DecryptionKeyId}).
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java

  /**
   * Parses a {@link SecureMessage} containing an encrypted payload body, extracting a decryption of
   * the payload body and verifying the signature.
   *
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
   * <p>
   * If you will be using {@link #buildSignedCleartextMessage(Key, SigType, byte[])}, then anyone
   * observing the {@link SecureMessage} may be able to infer this associated data via an
   * "offline dictionary attack". That is, when no encryption is used, you will not be hiding this
   * data simply because it is not being sent over the wire.
```

### JavadocReference
Cannot resolve symbol `HeaderAndBody`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java
   * the payload body and verifying the signature.
   *
   * @return the parsed {@link HeaderAndBody} pair (which is fully verified and decrypted)
   * @throws SignatureException if signature verification fails
   * @see SecureMessageBuilder#buildSignCryptedMessage(Key, SigType, Key, EncType, byte[])
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java

  /**
   * Generates a signed and encrypted {@link SecureMessage}. If the signature type requires a public
   * key, such as with ECDSA_P256_SHA256, then the caller <em>must</em> set a verification id using
   * the {@link #setVerificationKeyId(byte[])} method. The verification key id will be bound to the
```

### JavadocReference
Cannot resolve symbol `SecureMessage`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageBuilder.java`
#### Snippet
```java
   *
   * @param encType <em>must not</em> be set to {@link EncType#NONE}
   * @see SecureMessageParser#parseSignCryptedMessage(SecureMessage, Key, SigType, Key, EncType)
   */
  public SecureMessage buildSignCryptedMessage(
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerPendingReview.java`
#### Snippet
```java
 *
 * <p>A {@link Cipher} object is created using one of the overloads of the
 * {@link Cipher#getInstance()} method. This method takes a specification of the transformer either
 * as a triple "Algorithm/Mode/Padding"  or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerPendingReview.java`
#### Snippet
```java
 * as a triple "Algorithm/Mode/Padding"  or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
 * {@link Cipher#getInstance()}, where either the insecure ECB mode or the provider's default mode
 * is used. This method annotation is used to suppress the Error Prone checker in use cases where an
 * exception has been granted by ISE after proper review. The annotation is BUILD-visibility
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerReviewed.java`
#### Snippet
```java
 *
 * <p>A {@link Cipher} object is created using one of the overloads of the
 * {@link Cipher#getInstance()} method. This method takes a specification of the transformer either
 * as a triple "Algorithm/Mode/Padding"  or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerReviewed.java`
#### Snippet
```java
 * as a triple "Algorithm/Mode/Padding"  or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
 * {@link Cipher#getInstance()}, where either the insecure ECB mode or the provider's default mode
 * is used. This method annotation is used to suppress the Error Prone checker in use cases where an
 * exception has been granted by ISE after proper review. The annotation is BUILD-visibility
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerNoReview.java`
#### Snippet
```java
 *
 * <p>A {@link Cipher} object is created using one of the overloads of the
 * {@link Cipher#getInstance()} method. This method takes a specification of the transformer either
 * as a triple "Algorithm/Mode/Padding" or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
```

### JavadocReference
Cannot resolve symbol `getInstance()`
in `src/main/java/com/google/security/annotations/SuppressInsecureCipherModeCheckerNoReview.java`
#### Snippet
```java
 * as a triple "Algorithm/Mode/Padding" or just "Algorithm", using the provider's default settings.
 * The InsecureCipherMode checker implemented in Error Prone flags all call sites of
 * {@link Cipher#getInstance()}, where either the insecure ECB mode or the provider's default mode
 * is used. This method annotation is used to suppress the Error Prone checker for legacy code
 * without review by ISE. The annotation is BUILD-visibility restricted and every use must be vetted
```

### JavadocReference
Cannot resolve symbol `GcmDeviceInfo`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/EnrollmentCryptoOps.java`
#### Snippet
```java
   * Used by the server to decrypt the client's enrollment request.
   * @param enrollmentMessage generated by the client's call to
   *        {@link #encryptEnrollmentMessage(GcmDeviceInfo, SecretKey, PrivateKey)}
   * @param masterKey the shared key derived from the key agreement
   * @return the client's enrollment request data
```

### JavadocReference
Cannot resolve symbol `EcP256PublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Encodes an {@link ECPublicKey} to an {@link EcP256PublicKey} proto message.
   */
  public static EcP256PublicKey encodeEcPublicKey(PublicKey pk) {
```

### JavadocReference
Cannot resolve symbol `SimpleRsaPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Extracts a {@link RSAPublicKey} from an {@link SimpleRsaPublicKey} proto message.
   *
   * @throws InvalidKeySpecException when the input RSA public key is invalid
```

### JavadocReference
Cannot resolve symbol `EcP256PublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Extracts a {@link ECPublicKey} from an {@link EcP256PublicKey} proto message.
   *
   * @throws InvalidKeySpecException if the input is not a valid NIST P-256 public key or if
```

### JavadocReference
Cannot resolve symbol `DhPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Encodes a 2048-bit {@link DhPublicKey} using the {@link #DH_G} group to a
   * {@link DhPublicKey} proto message.
   */
```

### JavadocReference
Cannot resolve symbol `DhPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
  /**
   * Encodes a 2048-bit {@link DhPublicKey} using the {@link #DH_G} group to a
   * {@link DhPublicKey} proto message.
   */
  public static DhPublicKey encodeDh2048PublicKey(PublicKey pk) {
```

### JavadocReference
Cannot resolve symbol `SimpleRsaPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Encodes a 2048-bit {@link RSAPublicKey} to an {@link SimpleRsaPublicKey} proto message.
   */
  public static SimpleRsaPublicKey encodeRsa2048PublicKey(PublicKey pk) {
```

### JavadocReference
Cannot resolve symbol `GenericPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Encodes an {@link ECPublicKey} to an {@link GenericPublicKey} proto message. The returned key
   * has a null-byte padded to the front in order to match the C++ implementation.
   */
```

### JavadocReference
Cannot resolve symbol `GenericPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Extracts a {@link PublicKey} from an {@link GenericPublicKey} proto message.
   *
   * @throws InvalidKeySpecException if the input is not a valid and/or supported public key type
```

### JavadocReference
Cannot resolve symbol `DhPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Extracts a {@link DHPublicKey} from an {@link DhPublicKey} proto message.
   *
   * @throws InvalidKeySpecException when the input DH public key is invalid
```

### JavadocReference
Cannot resolve symbol `GenericPublicKey`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

  /**
   * Encodes any supported {@link PublicKey} type as a {@link GenericPublicKey} proto message.
   *
   * @see SecureMessageProto constants (defined in the .proto file) for supported types
```

### JavadocReference
Cannot resolve symbol `SecureMessageProto`
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
   * Encodes any supported {@link PublicKey} type as a {@link GenericPublicKey} proto message.
   *
   * @see SecureMessageProto constants (defined in the .proto file) for supported types
   */
  public static GenericPublicKey encodePublicKey(PublicKey pk) {
```

### JavadocReference
Cannot resolve symbol `CipherCommitment`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Generates a {@link CipherCommitment} for the P256_SHA512 cipher.
   */
  private CipherCommitment generateP256SHA512Commitment() throws HandshakeException {
```

### JavadocReference
Cannot resolve symbol `Ukey2ClientInit`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Generates the byte[] encoding of a {@link Ukey2ClientInit} message.
   *
   * @throws HandshakeException
```

### JavadocReference
Cannot resolve symbol `Ukey2ClientFinished`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Generates and records a {@link Ukey2ClientFinished} message for the P256_SHA512 cipher.
   */
  private Ukey2ClientFinished generateP256SHA512ClientFinished(KeyPair p256KeyPair) {
```

### JavadocReference
Cannot resolve symbol `Ukey2ClientFinished`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Attempts to parse message 3 (which is a wrapped {@link Ukey2ClientFinished}). See go/ukey2 for
   * details.
   */
```

### JavadocReference
Cannot resolve symbol `Ukey2ServerInit`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Attempts to parse message 2 (which is a wrapped {@link Ukey2ServerInit}). See go/ukey2 for
   * details.
   */
```

### JavadocReference
Cannot resolve symbol `Ukey2Alert`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Returns a {@link Ukey2Alert} message of given type and having the loggable additional data if
   * present.
   */
```

### JavadocReference
Cannot resolve symbol `Ukey2Message`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Generates the serialized representation of a {@link Ukey2Message} based on the provided type
   * and data.
   */
```

### JavadocReference
Cannot resolve symbol `Ukey2ClientInit`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Attempts to parse message 1 (which is a wrapped {@link Ukey2ClientInit}). See go/ukey2 for
   * details.
   *
```

### JavadocReference
Cannot resolve symbol `Ukey2ServerInit`
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

  /**
   * Generates the byte[] encoding of a {@link Ukey2ServerInit} message.
   */
  private byte[] makeServerInitMessage() {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `sha512(rawMessage3Map.get(HandshakeCipher.P256_SHA512))` might be null
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
    cipherCommitment.setHandshakeCipher(UkeyProto.Ukey2HandshakeCipher.P256_SHA512);
    cipherCommitment.setCommitment(
        ByteString.copyFrom(sha512(rawMessage3Map.get(HandshakeCipher.P256_SHA512))));

    return cipherCommitment.build();
```

### DataFlowIssue
Argument `authString` might be null
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java

    handshakeState = InternalState.HANDSHAKE_VERIFICATION_IN_PROGRESS;
    return Arrays.copyOf(authString, byteLength);
  }

```

### DataFlowIssue
Argument `messageData` might be null
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
        throwIllegalArgumentException("Cannot send empty message data for non-alert messages");
      }
      message.setMessageData(ByteString.copyFrom(messageData));
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DDiffieHellmanKeyExchangeHandshake.java`
#### Snippet
```java
      // the last sequence number used by each side.
      // Note: initiatorEncodeKey == responderEncodeKey
      return new D2DConnectionContextV0(initiatorEncodeKey, 1 /** initialSequenceNumber */);
    } else {
      SecretKey encodeKey = isInitiator ? initiatorEncodeKey : responderEncodeKey;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param sharedKey` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV0.java`
#### Snippet
```java
   * {@link D2DHandshakeContext}
   *
   * @param sharedKey
   * @param initialSequenceNumber
   */
```

### JavadocDeclaration
`@param initialSequenceNumber` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV0.java`
#### Snippet
```java
   *
   * @param sharedKey
   * @param initialSequenceNumber
   */
  D2DConnectionContextV0(SecretKey sharedKey, int initialSequenceNumber) {
```

### JavadocDeclaration
`@param encodeKey` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV1.java`
#### Snippet
```java
   * {@link D2DHandshakeContext}
   *
   * @param encodeKey
   * @param decodeKey
   * @param initialEncodeSequenceNumber
```

### JavadocDeclaration
`@param decodeKey` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV1.java`
#### Snippet
```java
   *
   * @param encodeKey
   * @param decodeKey
   * @param initialEncodeSequenceNumber
   * @param initialDecodeSequenceNumber
```

### JavadocDeclaration
`@param initialEncodeSequenceNumber` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV1.java`
#### Snippet
```java
   * @param encodeKey
   * @param decodeKey
   * @param initialEncodeSequenceNumber
   * @param initialDecodeSequenceNumber
   */
```

### JavadocDeclaration
`@param initialDecodeSequenceNumber` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DConnectionContextV1.java`
#### Snippet
```java
   * @param decodeKey
   * @param initialEncodeSequenceNumber
   * @param initialDecodeSequenceNumber
   */
  D2DConnectionContextV1(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securemessage/CryptoOps.java`
#### Snippet
```java
   * @throws NoSuchAlgorithmException if the security provider is inadequate for {@code sigType}
   * @throws InvalidKeyException if {@code verificationKey} is incompatible with {@code sigType}
   * @throws SignatureException
   */
  static boolean verify(Key verificationKey, SigType sigType, byte[] signature, byte[] data)
```

### JavadocDeclaration
Wrong tag `CryptoAnnotation(`
in `src/main/java/com/google/security/annotations/CryptoAnnotation.java`
#### Snippet
```java
 * 
 * Example of usage:
 *  @CryptoAnnotation(
 *     purpose = CryptoAnnotation.Purpose.AUTHENTICATION,
 *     owner = "sweis",
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   * supported.
   *
   * @throws HandshakeException
   */
  private KeyPair genKeyPair(HandshakeCipher cipher) throws HandshakeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   * Generates the byte[] encoding of a {@link Ukey2ClientInit} message.
   *
   * @throws HandshakeException
   */
  private byte[] makeClientInitMessage() throws HandshakeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   * client.
   *
   * @throws HandshakeException
   */
  public static Ukey2Handshake forInitiator(HandshakeCipher cipher) throws HandshakeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   * server.
   *
   * @throws HandshakeException
   */
  public static Ukey2Handshake forResponder(HandshakeCipher cipher) throws HandshakeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
   * when the state returned byte {@link #getHandshakeState()} is {@link State#FINISHED}.
   *
   * @throws HandshakeException
   */
  public D2DConnectionContext toConnectionContext() throws HandshakeException {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securemessage/SecureMessageParser.java`
#### Snippet
```java
    // Try not to leak the specific reason for verification failures, due to security concerns.
    boolean verified = CryptoOps.verify(verificationKey, sigType, signature, signedData);
    HeaderAndBody result = null;
    try {
      result = HeaderAndBody.parseFrom(secmsg.getHeaderAndBody());
```

### UnusedAssignment
Variable `alert` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
      throws HandshakeException {
    if (message.hasMessageData()) {
      Ukey2Alert alert = null;
      try {
        alert = Ukey2Alert.parseFrom(message.getMessageData());
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
  private void parseMessage3(final byte[] handshakeMessage) throws HandshakeException {
    // Deserialize the protobuf; terminate the connection if deserialization fails.
    Ukey2Message message = null;
    try {
      message = Ukey2Message.parseFrom(handshakeMessage);
```

### UnusedAssignment
Variable `clientFinished` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
      throwHandshakeException("Expected message data, but didn't find it");
    }
    Ukey2ClientFinished clientFinished = null;
    try {
      clientFinished = Ukey2ClientFinished.parseFrom(message.getMessageData());
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
      throws AlertException, HandshakeException {
    // Deserialize the protobuf; send a BAD_MESSAGE message if deserialization fails
    Ukey2Message message = null;
    try {
      message = Ukey2Message.parseFrom(handshakeMessage);
```

### UnusedAssignment
Variable `serverInit` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
          "Expected message data, but didn't find it");
    }
    Ukey2ServerInit serverInit = null;
    try {
      serverInit = Ukey2ServerInit.parseFrom(message.getMessageData());
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
  private void parseMessage1(byte[] handshakeMessage) throws AlertException, HandshakeException {
    // Deserialize the protobuf; send a BAD_MESSAGE message if deserialization fails
    Ukey2Message message = null;
    try {
      message = Ukey2Message.parseFrom(handshakeMessage);
```

### UnusedAssignment
Variable `clientInit` initializer `null` is redundant
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ukey2Handshake.java`
#### Snippet
```java
          "Expected message data, but didn't find it");
    }
    Ukey2ClientInit clientInit = null;
    try {
      clientInit = Ukey2ClientInit.parseFrom(message.getMessageData());
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `ourKeyPair` may be 'final'
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DDiffieHellmanKeyExchangeHandshake.java`
#### Snippet
```java
 */
public class D2DDiffieHellmanKeyExchangeHandshake implements D2DHandshakeContext {
  private KeyPair ourKeyPair;
  private PublicKey theirPublicKey;
  private SecretKey initiatorEncodeKey;
```

### FieldMayBeFinal
Field `isInitiator` may be 'final'
in `src/main/java/com/google/security/cryptauth/lib/securegcm/D2DDiffieHellmanKeyExchangeHandshake.java`
#### Snippet
```java
  private SecretKey responderEncodeKey;
  private State handshakeState;
  private boolean isInitiator;
  private int protocolVersionToUse;

```

### FieldMayBeFinal
Field `eitherXorY` may be 'final'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java
  public abstract static class DHKeyShim {

    private BigInteger eitherXorY;
    private DHParameterSpec params;

```

### FieldMayBeFinal
Field `params` may be 'final'
in `src/main/java/com/google/security/cryptauth/lib/securemessage/PublicKeyProtoUtil.java`
#### Snippet
```java

    private BigInteger eitherXorY;
    private DHParameterSpec params;

    public DHKeyShim(BigInteger eitherXorY, DHParameterSpec params) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ed25519.java`
#### Snippet
```java

/**
 * Implements the Ed25519 twisted Edwards curve.  See http://ed25519.cr.yp.to/ for more details.
 */
public class Ed25519 {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/google/security/cryptauth/lib/securegcm/Ed25519.java`
#### Snippet
```java
  /**
   * Returns the sum of two points in extended representation
   * Uses: https://hyperelliptic.org/EFD/g1p/auto-twisted-extended-1.html#addition-add-2008-hwcd-3
   */
  static BigInteger[] addExtendedPoints(BigInteger[] p1, BigInteger[] p2)
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/google/security/cryptauth/lib/securegcm/KeyEncoding.java`
#### Snippet
```java

  public static boolean isLegacyPrivateKey(PrivateKey sk) {
    if (sk instanceof ECPrivateKey) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/google/security/cryptauth/lib/securegcm/KeyEncoding.java`
#### Snippet
```java

  public static boolean isLegacyPublicKey(PublicKey pk) {
    if (pk instanceof ECPublicKey) {
      return false;
    }
```

