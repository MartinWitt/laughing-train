# encrypted-config-value 
 
# Bad smells
I found 18 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AbstractClassNeverImplemented | 7 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| SystemOutErr | 3 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| BoundedWildcard | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `encrypted-config-value-bundle-dropwizard1/src/main/java/com/palantir/config/crypto/GenerateKeyCommand.java`
#### Snippet
```java

        // print to console, notifying that we did something
        System.out.println("Wrote key to " + path);
        if (!keyPairFiles.pathsEqual()) {
            System.out.println("Wrote private key to " + keyPairFiles.decryptionKeyFile());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `encrypted-config-value-bundle-dropwizard1/src/main/java/com/palantir/config/crypto/GenerateKeyCommand.java`
#### Snippet
```java
        System.out.println("Wrote key to " + path);
        if (!keyPairFiles.pathsEqual()) {
            System.out.println("Wrote private key to " + keyPairFiles.decryptionKeyFile());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `encrypted-config-value-bundle-dropwizard1/src/main/java/com/palantir/config/crypto/EncryptConfigValueCommand.java`
#### Snippet
```java

        // print the resulting encrypted value to the console
        System.out.println(encryptedValue);
    }
}
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`fieldBuilder.length() > 0` can be replaced with '!fieldBuilder.isEmpty()'
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/util/StringSubstitutionException.java`
#### Snippet
```java
    private StringSubstitutionException extend(String prefix, boolean prefixIsArrayIndex) {
        StringBuilder extendedFieldBuilder = new StringBuilder(prefix);
        if (fieldBuilder.length() > 0 && !lastExtensionWasArrayIndex) {
            extendedFieldBuilder.append(".");
        }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `privatePath` is redundant
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyFileUtils.java`
#### Snippet
```java
     */
    private static Path privatePath(Path path) {
        Path privatePath = path.resolveSibling(path.getFileName() + ".private");
        return privatePath;
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesKeyPair.java`
#### Snippet
```java

    public static KeyPair newKeyPair() {
        javax.crypto.KeyGenerator keyGen;
        try {
            keyGen = javax.crypto.KeyGenerator.getInstance(Algorithm.AES.toString());
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesKeyPair.java`
#### Snippet
```java
        javax.crypto.KeyGenerator keyGen;
        try {
            keyGen = javax.crypto.KeyGenerator.getInstance(Algorithm.AES.toString());
        } catch (NoSuchAlgorithmException e) {
            throw new SafeRuntimeException(e);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesGcmEncrypter.java`
#### Snippet
```java

        return Suppliers.silently(() -> {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");

            byte[] ivBytes = new byte[IV_SIZE_BITS / Byte.SIZE];
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesGcmEncrypter.java`
#### Snippet
```java

        return Suppliers.silently(() -> {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");

            byte[] ivBytes = new byte[IV_SIZE_BITS / Byte.SIZE];
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesGcmEncrypter.java`
#### Snippet
```java

            GCMParameterSpec gcmSpecWithIv = new GCMParameterSpec(TAG_SIZE_BITS, ivBytes);
            cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, secretKeySpec, gcmSpecWithIv);
            byte[] encrypted = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends JsonNode`
in `encrypted-config-value-bundle-dropwizard1/src/main/java/com/palantir/config/crypto/SubstitutingConfigurationFactory.java`
#### Snippet
```java
            ObjectMapper objectMapper,
            String propertyPrefix,
            JsonNodeVisitor<JsonNode> substitutor) {
        super(klass, validator, objectMapper, propertyPrefix);
        this.substitutor = substitutor;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AesEncryptedValue` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/aes/AesEncryptedValue.java`
#### Snippet
```java
@JsonDeserialize(as = ImmutableAesEncryptedValue.class)
@JsonSerialize(as = AesEncryptedValue.class)
public abstract class AesEncryptedValue extends EncryptedValue {
    public enum Mode {
        GCM,
```

### AbstractClassNeverImplemented
Abstract class `LegacyEncryptedValue` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/LegacyEncryptedValue.java`
#### Snippet
```java

@Value.Immutable
public abstract class LegacyEncryptedValue extends EncryptedValue {

    @Value.Parameter
```

### AbstractClassNeverImplemented
Abstract class `KeyPairFiles` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyPairFiles.java`
#### Snippet
```java
 */
@Value.Immutable
public abstract class KeyPairFiles {

    public abstract Path encryptionKeyFile();
```

### AbstractClassNeverImplemented
Abstract class `RsaEncryptedValue` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/algorithm/rsa/RsaEncryptedValue.java`
#### Snippet
```java
@JsonDeserialize(as = ImmutableRsaEncryptedValue.class)
@JsonSerialize(as = RsaEncryptedValue.class)
public abstract class RsaEncryptedValue extends EncryptedValue {

    public enum Mode {
```

### AbstractClassNeverImplemented
Abstract class `EncryptedValue` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/EncryptedValue.java`
#### Snippet
```java
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
public abstract class EncryptedValue {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final String PREFIX = "enc:";
```

### AbstractClassNeverImplemented
Abstract class `KeyWithType` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyWithType.java`
#### Snippet
```java
 */
@Value.Immutable
public abstract class KeyWithType {

    public abstract KeyType getType();
```

### AbstractClassNeverImplemented
Abstract class `KeyPair` has no concrete subclass
in `encrypted-config-value/src/main/java/com/palantir/config/crypto/KeyPair.java`
#### Snippet
```java
 */
@Value.Immutable
public abstract class KeyPair {

    public abstract KeyWithType encryptionKey();
```

