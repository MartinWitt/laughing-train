# identity-credential 
 
# Bad smells
I found 94 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 12 | false |
| UnusedAssignment | 12 | false |
| OptionalUsedAsFieldOrParameterType | 9 | false |
| JavadocDeclaration | 9 | false |
| UnnecessaryLocalVariable | 8 | true |
| StringConcatenationInsideStringBufferAppend | 8 | false |
| DataFlowIssue | 5 | false |
| FieldMayBeFinal | 5 | false |
| DuplicateBranchesInSwitch | 5 | false |
| ConstantValue | 4 | false |
| AutoCloseableResource | 3 | false |
| PointlessBitwiseExpression | 3 | false |
| UNUSED_IMPORT | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| UseBulkOperation | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| EmptyStatementBody | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryUnaryMinus | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'mChannelInfoOperatingClass'
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodWifiAware.java`
#### Snippet
```java
    private final String mPassphraseInfoPassphrase;
    private final OptionalLong mChannelInfoChannelNumber;
    private final OptionalLong mChannelInfoOperatingClass;
    private final byte[] mBandInfoSupportedBands;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'channelInfoChannelNumber'
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodWifiAware.java`
#### Snippet
```java
     */
    public ConnectionMethodWifiAware(@Nullable String passphraseInfoPassphrase,
                                     OptionalLong channelInfoChannelNumber,
                                     OptionalLong channelInfoOperatingClass,
                                     @Nullable byte[] bandInfoSupportedBands) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'channelInfoOperatingClass'
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodWifiAware.java`
#### Snippet
```java
    public ConnectionMethodWifiAware(@Nullable String passphraseInfoPassphrase,
                                     OptionalLong channelInfoChannelNumber,
                                     OptionalLong channelInfoOperatingClass,
                                     @Nullable byte[] bandInfoSupportedBands) {
        mPassphraseInfoPassphrase = passphraseInfoPassphrase;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'mChannelInfoChannelNumber'
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodWifiAware.java`
#### Snippet
```java
    private static final String TAG = "ConnectionMethodWifiNAN";    // limit to <= 23 chars
    private final String mPassphraseInfoPassphrase;
    private final OptionalLong mChannelInfoChannelNumber;
    private final OptionalLong mChannelInfoOperatingClass;
    private final byte[] mBandInfoSupportedBands;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'status'
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java
        private final OptionalLong mStatus;

        private DecryptedMessage(@Nullable byte[] data, @NonNull OptionalLong status) {
            mData = data;
            mStatus = status;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'statusCode'
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java
    public byte[] encryptMessageWithInvalidEReaderKey(
            @Nullable byte[] messagePlaintext,
            @NonNull OptionalLong statusCode) {
        return encryptMessageHelper(messagePlaintext, statusCode, true);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'statusCode'
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java

    private @NonNull byte[] encryptMessageHelper(@Nullable byte[] messagePlaintext,
                                                 @NonNull OptionalLong statusCode,
                                                 boolean setInvalidEReaderKey) {
        byte[] messageCiphertext = null;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'mStatus'
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java
    public static class DecryptedMessage {
        private final byte[] mData;
        private final OptionalLong mStatus;

        private DecryptedMessage(@Nullable byte[] data, @NonNull OptionalLong status) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'statusCode'
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java
     */
    public @NonNull byte[] encryptMessage(@Nullable byte[] messagePlaintext,
                                          @NonNull OptionalLong statusCode) {
        return encryptMessageHelper(messagePlaintext, statusCode, false);
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'V' to 'T'
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            throw new IllegalArgumentException("Expected type " + clazz + ", got type " + valueStr);
        } else {
            return (T) value;
        }
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `identity/src/main/java/com/android/identity/storage/GenericStorageEngine.java`
#### Snippet
```java
    public void deleteAll() {
        try {
            for (File file : Files.list(mStorageDirectory.toPath())
                    .map(Path::toFile)
                    .filter(File::isFile)
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `identity/src/main/java/com/android/identity/storage/GenericStorageEngine.java`
#### Snippet
```java
        ArrayList<String> ret = new ArrayList<>();
        try {
            for (File file : Files.list(mStorageDirectory.toPath())
                    .map(Path::toFile)
                    .filter(File::isFile)
```

### AutoCloseableResource
'ASN1InputStream' used without 'try'-with-resources statement
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        }
        try {
            ASN1InputStream asn1InputStream = new ASN1InputStream(octetString);
            byte[] cborBytes = ((ASN1OctetString) asn1InputStream.readObject()).getOctets();

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `identity/src/main/java/com/android/identity/mdoc/response/DeviceResponseParser.java`
#### Snippet
```java

            boolean issuerSignedAuthenticated = Util.coseSign1CheckSignature(
                    issuerAuthDataItem, null, issuerAuthorityKey);
            Logger.d(TAG, "issuerSignedAuthenticated: " + issuerSignedAuthenticated);
            builder.setIssuerSignedAuthenticated(issuerSignedAuthenticated);
```

### DataFlowIssue
`null` is returned by the method declared as @NonNull
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        byte[] blobWithCoords = baos.toByteArray();
```

### DataFlowIssue
`null` is returned by the method declared as @NonNull
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        } catch (CborException e) {
            e.printStackTrace();
            return null;
        }
        return baos.toByteArray();
```

### DataFlowIssue
Argument `data` might be null
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        byte[] protectedHeadersBytes = cborEncode(protectedHeaders.build().get(0));

        byte[] toBeMACed = coseBuildToBeMACed(protectedHeadersBytes, data, detachedContent);

        byte[] mac;
```

### DataFlowIssue
Argument `detachedContent` might be null
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        byte[] protectedHeadersBytes = cborEncode(protectedHeaders.build().get(0));

        byte[] toBeMACed = coseBuildToBeMACed(protectedHeadersBytes, data, detachedContent);

        byte[] mac;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.security.cert.X509Certificate;`
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataGenerator.java`
#### Snippet
```java
import com.android.identity.internal.Util;

import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Calendar;`
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataGenerator.java`
#### Snippet
```java

import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                    return false;
                }
            } else {
                // we're the leaf certificate so we're not signing anything nor
                // do we need to be e.g. a CA certificate.
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Tag `hidden` is not allowed here
in `identity/src/main/java/com/android/identity/util/Constants.java`
#### Snippet
```java
     * BLE data retrieval flags.
     *
     * @hidden
     */
    @Retention(SOURCE)
```

### JavadocDeclaration
Tag `hidden` is not allowed here
in `identity/src/main/java/com/android/identity/util/Constants.java`
#### Snippet
```java
     * These values are defined in ISO/IEC 18013-5 Table 20.
     *
     * @hidden
     */
    @Retention(SOURCE)
```

### JavadocDeclaration
Tag `hidden` is not allowed here
in `identity/src/main/java/com/android/identity/util/Constants.java`
#### Snippet
```java
     * These values are defined in ISO/IEC 18013-5 Table 8.
     *
     * @hidden
     */
    @Retention(SOURCE)
```

### JavadocDeclaration
Javadoc pointing to itself
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethod.java`
#### Snippet
```java
     * {@code DeviceRetrievalMethod} CBOR is defined.
     *
     * <p>This is the reverse operation of {@link #toDeviceEngagement()}.
     *
     * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethod.java`
#### Snippet
```java
     * <p>This is the reverse operation of {@link #toDeviceEngagement()}.
     *
     * @return
     */
    public abstract @NonNull
```

### JavadocDeclaration
Tag `hidden` is not allowed here
in `identity/src/main/java/com/android/identity/mdoc/engagement/EngagementGenerator.java`
#### Snippet
```java
    public static final String ENGAGEMENT_VERSION_1_1 = "1.1";

    /** @hidden */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef(value = {ENGAGEMENT_VERSION_1_0, ENGAGEMENT_VERSION_1_1})
```

### JavadocDeclaration
Javadoc pointing to itself
in `identity/src/main/java/com/android/identity/credential/Credential.java`
#### Snippet
```java
         * Gets application specific data.
         *
         * <p>Gets data previously stored with {@link #getApplicationData(String)}.
         *
         * @param key the key for the data.
```

### JavadocDeclaration
Javadoc pointing to itself
in `identity/src/main/java/com/android/identity/credential/Credential.java`
#### Snippet
```java
         * Gets application specific data.
         *
         * <p>Gets data previously stored with {@link #getApplicationData(String)}.
         *
         * @param key the key for the data.
```

### JavadocDeclaration
Javadoc pointing to itself
in `identity/src/main/java/com/android/identity/credential/Credential.java`
#### Snippet
```java
     * Gets application specific data.
     *
     * <p>Gets data previously stored with {@link #getApplicationData(String)}.
     *
     * @param key the key for the data.
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `mAttestation` may be 'final'
in `identity/src/main/java/com/android/identity/keystore/KeystoreEngine.java`
#### Snippet
```java
     */
    class KeyInfo {
        private List<X509Certificate> mAttestation;
        private final @KeyPurpose int mKeyPurposes;
        private final @EcCurve int mEcCurve;
```

### FieldMayBeFinal
Field `mMap` may be 'final'
in `identity/src/main/java/com/android/identity/credential/NameSpacedData.java`
#### Snippet
```java
 */
public class NameSpacedData {
    private LinkedHashMap<String, LinkedHashMap<String, byte[]>> mMap;

    NameSpacedData() {
```

### FieldMayBeFinal
Field `mEncodedStaticAuthData` may be 'final'
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataParser.java`
#### Snippet
```java
 */
public class StaticAuthDataParser {
    private byte[] mEncodedStaticAuthData;

    /**
```

### FieldMayBeFinal
Field `mEncodedIssuerAuth` may be 'final'
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataGenerator.java`
#### Snippet
```java

    private Map<String, List<byte[]>> mDigestIDMapping = new HashMap<>();
    private byte[] mEncodedIssuerAuth;

    /**
```

### FieldMayBeFinal
Field `mKeyPurposes` may be 'final'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
    public static class CreateKeySettings extends KeystoreEngine.CreateKeySettings {
        private final String mAttestationKeyAlias;
        private @KeyPurpose int mKeyPurposes;
        private final @EcCurve int mEcCurve;
        private final boolean mPassphraseRequired;
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP256R1:
                signatureAlgorithmName = "SHA256withECDSA";
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP320R1:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP320R1:
                signatureAlgorithmName = "SHA256withECDSA";
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP384R1:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP384R1:
                signatureAlgorithmName = "SHA384withECDSA";
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP512R1:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
                break;
            case KeystoreEngine.EC_CURVE_BRAINPOOLP512R1:
                signatureAlgorithmName = "SHA512withECDSA";
                break;
            case KeystoreEngine.EC_CURVE_ED25519:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
                break;
            case KeystoreEngine.EC_CURVE_ED448:
                signatureAlgorithmName = "EdDSA";
                break;

```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `identity/src/main/java/com/android/identity/util/Constants.java`
#### Snippet
```java
     * for BLE data retrieval.
     */
    public static final int BLE_DATA_RETRIEVAL_OPTION_MDOC_CENTRAL_CLIENT_MODE = (1 << 0);
    /**
     * Flag indicating that the <em>mdoc peripheral server mode</em> should be supported
```

### PointlessBitwiseExpression
`1<<0` can be replaced with '1'
in `identity/src/main/java/com/android/identity/keystore/KeystoreEngine.java`
#### Snippet
```java
     * Purpose of key: signing.
     */
    int KEY_PURPOSE_SIGN = 1<<0;

    /**
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `identity/src/main/java/com/android/identity/util/CborUtil.java`
#### Snippet
```java


    public static final int DIAGNOSTICS_FLAG_EMBEDDED_CBOR = (1 << 0);

    public static final int DIAGNOSTICS_FLAG_PRETTY_PRINT = (1 << 1);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/credential/Credential.java`
#### Snippet
```java
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        List<DataItem> dataItems;
        try {
            dataItems = new CborDecoder(bais).decode();
        } catch (CborException e) {
            throw new IllegalStateException("Error decoded CBOR", e);
        }
        if (dataItems.size() != 1) {
            throw new IllegalStateException("Expected 1 item, found " + dataItems.size());
        }
        if (!(dataItems.get(0) instanceof co.nstant.in.cbor.model.Map)) {
            throw new IllegalStateException("Item is not a map");
        }
        co.nstant.in.cbor.model.Map map = (co.nstant.in.cbor.model.Map) dataItems.get(0);
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/credential/Credential.java`
#### Snippet
```java
            ret.mApplicationData = new LinkedHashMap<>();
            DataItem applicationDataDataItem = Util.cborMapExtractMap(dataItem, "applicationData");
            if (!(applicationDataDataItem instanceof co.nstant.in.cbor.model.Map)) {
                throw new IllegalStateException("applicationData not found or not map");
            }
            for (DataItem keyItem : ((co.nstant.in.cbor.model.Map) applicationDataDataItem).getKeys()) {
                String key = ((UnicodeString) keyItem).getString();
                byte[] value = Util.cborMapExtractByteString(applicationDataDataItem, key);
                ret.mApplicationData.put(key, value);
            }
            ret.mCredential = credential;
            return ret;
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        array.add(encodedProtectedHeaders);

        // We currently don't support Externally Supplied Data (RFC 8152 section 4.3)
        // so external_aad is the empty bstr
        byte[] emptyExternalAad = new byte[0];
        array.add(emptyExternalAad);

        // Next field is the payload, independently of how it's transported (RFC
        // 8152 section 4.4). Since our API specifies only one of |data| and
        // |detachedContent| can be non-empty, it's simply just the non-empty one.
        if (payload != null && payload.length > 0) {
            array.add(payload);
        } else {
            array.add(detachedContent);
        }
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        CborBuilder builder = new CborBuilder();
        ArrayBuilder<CborBuilder> array = builder.addArray();
        array.add(protectedHeadersBytes);
        MapBuilder<ArrayBuilder<CborBuilder>> unprotectedHeaders = array.addMap();
        try {
            if (certificateChain != null && certificateChain.size() > 0) {
                if (certificateChain.size() == 1) {
                    X509Certificate cert = certificateChain.iterator().next();
                    unprotectedHeaders.put(COSE_LABEL_X5CHAIN, cert.getEncoded());
                } else {
                    ArrayBuilder<MapBuilder<ArrayBuilder<CborBuilder>>> x5chainsArray =
                            unprotectedHeaders.putArray(COSE_LABEL_X5CHAIN);
                    for (X509Certificate cert : certificateChain) {
                        x5chainsArray.add(cert.getEncoded());
                    }
                }
            }
        } catch (CertificateEncodingException e) {
            throw new IllegalStateException("Error encoding certificate", e);
        }
        if (data == null || data.length == 0) {
            array.add(new SimpleValue(SimpleValueType.NULL));
        } else {
            array.add(data);
        }
        array.add(coseSignature);

        return builder.build().get(0);
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        int dataLen = (data != null ? data.length : 0);
        int detachedContentLen = (detachedContent != null ? detachedContent.length : 0);
        if (dataLen > 0 && detachedContentLen > 0) {
            throw new IllegalArgumentException("data and detachedContent cannot both be non-empty");
        }

        CborBuilder protectedHeaders = new CborBuilder();
        MapBuilder<CborBuilder> protectedHeadersMap = protectedHeaders.addMap();
        protectedHeadersMap.put(COSE_LABEL_ALG, signatureAlgorithm);
        byte[] protectedHeadersBytes = cborEncode(protectedHeaders.build().get(0));
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        if (coseSign1.getMajorType() != MajorType.ARRAY) {
            throw new IllegalArgumentException("Data item is not an array");
        }
        List<DataItem> items = castTo(co.nstant.in.cbor.model.Array.class, coseSign1).getDataItems();
        if (items.size() < 4) {
            throw new IllegalArgumentException("Expected at least four items in COSE_Sign1 array");
        }
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        try {
            AlgorithmParameters params = AlgorithmParameters.getInstance("EC");
            params.init(new ECGenParameterSpec("secp256r1"));
            ECParameterSpec ecParameters = params.getParameterSpec(ECParameterSpec.class);

            ECPoint ecPoint = new ECPoint(x, y);
            ECPublicKeySpec keySpec = new ECPublicKeySpec(ecPoint, ecParameters);
            KeyFactory kf = KeyFactory.getInstance("EC");
            ECPublicKey ecPublicKey = (ECPublicKey) kf.generatePublic(keySpec);
            return ecPublicKey;

        } catch (NoSuchAlgorithmException
                | InvalidParameterSpecException
                | InvalidKeySpecException e) {
            throw new IllegalStateException("Unexpected error", e);
        }
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                } else if (dataItem instanceof DoublePrecisionFloat) {
                    DecimalFormat df = new DecimalFormat("0",
                            DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                    df.setMaximumFractionDigits(340);
                    sb.append(df.format(((DoublePrecisionFloat) dataItem).getValue()));
                } else if (dataItem instanceof AbstractFloat) {
                    DecimalFormat df = new DecimalFormat("0",
                            DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                    df.setMaximumFractionDigits(340);
                    sb.append(df.format(((AbstractFloat) dataItem).getValue()));
                } else {
                    sb.append("break");
                }
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/keystore/BouncyCastleKeystore.java`
#### Snippet
```java
        byte[] data = mStorageEngine.get(PREFIX + alias);
        if (data == null) {
            throw new IllegalArgumentException("No key with given alias");
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        List<DataItem> dataItems;
        try {
            dataItems = new CborDecoder(bais).decode();
        } catch (CborException e) {
            throw new IllegalStateException("Error decoded CBOR", e);
        }
        if (dataItems.size() != 1) {
            throw new IllegalStateException("Expected 1 item, found " + dataItems.size());
        }
        if (!(dataItems.get(0) instanceof co.nstant.in.cbor.model.Map)) {
            throw new IllegalStateException("Item is not a map");
        }
        co.nstant.in.cbor.model.Map map = (co.nstant.in.cbor.model.Map) dataItems.get(0);
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethod.java`
#### Snippet
```java
        DataItem cmDataItem = Util.cborDecode(encodedDeviceRetrievalMethod);
        if (!(cmDataItem instanceof co.nstant.in.cbor.model.Array)) {
            throw new IllegalArgumentException("Top-level CBOR is not an array");
        }
        List<DataItem> items = ((Array) cmDataItem).getDataItems();
        if (items.size() != 3) {
            throw new IllegalArgumentException("Expected array with 3 elements, got " + items.size());
        }
        if (!(items.get(0) instanceof Number) || !(items.get(1) instanceof Number)) {
            throw new IllegalArgumentException("First two items are not numbers");
        }
        long type = ((Number) items.get(0)).getValue().longValue();
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/mdoc/origininfo/OriginInfoNfc.java`
#### Snippet
```java
        if (!(oiDataItem instanceof co.nstant.in.cbor.model.Map)) {
            throw new IllegalArgumentException("Top-level CBOR is not an map");
        }
        long cat = Util.cborMapExtractNumber(oiDataItem, "cat");
        long type = Util.cborMapExtractNumber(oiDataItem, "type");
        if (type != TYPE) {
            Logger.w(TAG, "Unexpected type " + type);
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `identity/src/main/java/com/android/identity/mdoc/response/DeviceResponseParser.java`
#### Snippet
```java
            Map<String, EntryData> innerMap = mIssuerData.get(namespaceName);
            if (innerMap == null) {
                throw new IllegalArgumentException("Namespace not in data");
            }
            EntryData entryData = innerMap.get(name);
            if (entryData == null || entryData.mValue == null) {
                throw new IllegalArgumentException("Entry not in data");
            }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `identity/src/main/java/com/android/identity/mdoc/sessionencryption/SessionEncryption.java`
#### Snippet
```java
    }

    protected final @Role int mRole;
    private boolean mSessionEstablishmentSent;

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `staticAuthData` is redundant
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataGenerator.java`
#### Snippet
```java
        DataItem digestIdMappingItem = digestIdBuilder.build().get(0);

        byte[] staticAuthData = Util.cborEncode(new CborBuilder()
                .addMap()
                .put(new UnicodeString("digestIdMapping"), digestIdMappingItem)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            ByteArrayInputStream bais = new ByteArrayInputStream(resultingCertBytes);
            X509Certificate result = (X509Certificate) cf.generateCertificate(bais);
            return result;
        } catch (IOException
```

### UnnecessaryLocalVariable
Local variable `item` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        byte[] x = sec1EncodeFieldElementAsOctetString(32, w.getAffineX());
        byte[] y = sec1EncodeFieldElementAsOctetString(32, w.getAffineY());
        DataItem item = new CborBuilder()
                .addMap()
                .put(COSE_KEY_KTY, COSE_KEY_TYPE_EC2)
```

### UnnecessaryLocalVariable
Local variable `embeddedItem` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        }
        byte[] encodedCbor = itemByteString.getBytes();
        DataItem embeddedItem = cborDecode(encodedCbor);
        return embeddedItem;
    }
```

### UnnecessaryLocalVariable
Local variable `secretKey` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            byte[] derivedKey = computeHkdf("HmacSha256", sharedSecret, salt, info, 32);

            SecretKey secretKey = new SecretKeySpec(derivedKey, "");
            return secretKey;
        } catch (InvalidKeyException
```

### UnnecessaryLocalVariable
Local variable `ecPublicKey` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            ECPublicKeySpec keySpec = new ECPublicKeySpec(ecPoint, ecParameters);
            KeyFactory kf = KeyFactory.getInstance("EC");
            ECPublicKey ecPublicKey = (ECPublicKey) kf.generatePublic(keySpec);
            return ecPublicKey;

```

### UnnecessaryLocalVariable
Local variable `item` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        byte[] x = sec1EncodeFieldElementAsOctetString(32, w.getAffineX());
        byte[] y = sec1EncodeFieldElementAsOctetString(32, malformedY);
        DataItem item = new CborBuilder()
                .addMap()
                .put(COSE_KEY_KTY, COSE_KEY_TYPE_EC2)
```

### UnnecessaryLocalVariable
Local variable `ecPublicKey` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            ECPublicKeySpec keySpec = new ECPublicKeySpec(ecPoint, ecParameters);
            KeyFactory kf = KeyFactory.getInstance("EC");
            ECPublicKey ecPublicKey = (ECPublicKey) kf.generatePublic(keySpec);
            return ecPublicKey;
        } catch (NoSuchAlgorithmException
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `identity/src/main/java/com/android/identity/mdoc/mso/MobileSecurityObjectGenerator.java`
#### Snippet
```java

        Set<String> namespaceSet = new HashSet<>();
        namespaceSet.addAll(mAuthorizedDataElements.keySet());
        namespaceSet.retainAll(authorizedNameSpaces);

```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `identity/src/main/java/com/android/identity/mdoc/mso/MobileSecurityObjectGenerator.java`
#### Snippet
```java

        Set<String> namespaceSet = new HashSet<>();
        namespaceSet.addAll(authorizedDataElements.keySet());
        namespaceSet.retainAll(mAuthorizedNameSpaces);

```

## RuleId[id=UnnecessaryUnaryMinus]
### UnnecessaryUnaryMinus
Unnecessary unary `-` operator
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        int numLines = lines.length;
        if (lineNumber < 0) {
            lineNumber = numLines - -lineNumber;
        }
        StringBuilder sb = new StringBuilder();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `dataItems` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/util/CborUtil.java`
#### Snippet
```java

        ByteArrayInputStream bais = new ByteArrayInputStream(encodedCbor);
        List<DataItem> dataItems = null;
        try {
            dataItems = new CborDecoder(bais).decode();
```

### UnusedAssignment
Variable `dataItems` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/util/CborUtil.java`
#### Snippet
```java
                    sb.append("<< ");
                    ByteArrayInputStream bais = new ByteArrayInputStream(bstrValue);
                    List<DataItem> dataItems = null;
                    try {
                        dataItems = new CborDecoder(bais).decode();
```

### UnusedAssignment
Variable `deviceAuthType` initializer `""` is redundant
in `identity/src/main/java/com/android/identity/mdoc/response/DeviceResponseGenerator.java`
#### Snippet
```java
                .build().get(0);

        String deviceAuthType = "";
        DataItem deviceAuthDataItem = null;
        if (encodedDeviceSignature != null && encodedDeviceMac != null) {
```

### UnusedAssignment
Variable `deviceAuthDataItem` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/mdoc/response/DeviceResponseGenerator.java`
#### Snippet
```java

        String deviceAuthType = "";
        DataItem deviceAuthDataItem = null;
        if (encodedDeviceSignature != null && encodedDeviceMac != null) {
            throw new IllegalArgumentException("Cannot specify both Signature and MAC");
```

### UnusedAssignment
Variable `mDigestIDMapping` initializer `new HashMap<>()` is redundant
in `identity/src/main/java/com/android/identity/mdoc/mso/StaticAuthDataGenerator.java`
#### Snippet
```java
public class StaticAuthDataGenerator {

    private Map<String, List<byte[]>> mDigestIDMapping = new HashMap<>();
    private byte[] mEncodedIssuerAuth;

```

### UnusedAssignment
Variable `ks` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
    X509Certificate signPublicKeyWithPrivateKey(@NonNull String keyToSignAlias,
            @NonNull String keyToSignWithAlias) {
        KeyStore ks = null;
        try {
            ks = KeyStore.getInstance("AndroidKeyStore");
```

### UnusedAssignment
Variable `mac` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            @NonNull String macAlgorithm, @NonNull final byte[] ikm, @NonNull final byte[] salt,
            @NonNull final byte[] info, int size) {
        Mac mac = null;
        try {
            mac = Mac.getInstance(macAlgorithm);
```

### UnusedAssignment
Variable `dataItems` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
    DataItem cborDecode(@NonNull byte[] encodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(encodedBytes);
        List<DataItem> dataItems = null;
        try {
            dataItems = new CborDecoder(bais).decode();
```

### UnusedAssignment
Variable `coseSignature` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        byte[] toBeSigned = coseBuildToBeSigned(protectedHeadersBytes, data, detachedContent);

        byte[] coseSignature = null;
        try {
            s.update(toBeSigned);
```

### UnusedAssignment
Variable `date` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        df.setTimeZone(parsedTz);
        Date date = null;
        try {
            date = df.parse(dateString);
```

### UnusedAssignment
Variable `dataItems` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java

        ByteArrayInputStream bais = new ByteArrayInputStream(encodedBytes);
        List<DataItem> dataItems = null;
        try {
            dataItems = new CborDecoder(bais).decode();
```

### UnusedAssignment
Variable `dataItem` initializer `null` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
    public static int cborGetLength(byte[] data) {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        DataItem dataItem = null;
        try {
            dataItem = new CborDecoder(bais).decodeNext();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `salt == null` is always `false`
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        }
        try {
            if (salt == null || salt.length == 0) {
                // According to RFC 5869, Section 2.2 the salt is optional. If no salt is provided
                // then HKDF uses a salt that is an array of zeros of the same length as the hash
```

### ConstantValue
Condition `payload != null` is always `true`
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        // 8152 section 4.4). Since our API specifies only one of |data| and
        // |detachedContent| can be non-empty, it's simply just the non-empty one.
        if (payload != null && payload.length > 0) {
            array.add(payload);
        } else {
```

### ConstantValue
Condition `detachedContent != null` is always `true`
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java

        int dataLen = payload.length;
        int detachedContentLen = (detachedContent != null ? detachedContent.length : 0);
        if (dataLen > 0 && detachedContentLen > 0) {
            throw new IllegalArgumentException("data and detachedContent cannot both be non-empty");
```

### ConstantValue
Condition `data == null` is always `false`
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
        /* MapBuilder<ArrayBuilder<CborBuilder>> unprotectedHeaders = */
        array.addMap();
        if (data == null || data.length == 0) {
            array.add(new SimpleValue(SimpleValueType.NULL));
        } else {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
     * Computes an HKDF.
     *
     * This is based on https://github.com/google/tink/blob/master/java/src/main/java/com/google
     * /crypto/tink/subtle/Hkdf.java
     * which is also Copyright (c) Google and also licensed under the Apache 2 license.
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `identity/src/main/java/com/android/identity/credential/NameSpacedData.java`
#### Snippet
```java
        List<String> ret = new ArrayList<>();
        for (String dataElementName : innerMap.keySet()) {
            ret.add(dataElementName);
        }
        return ret;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `identity/src/main/java/com/android/identity/credential/NameSpacedData.java`
#### Snippet
```java
        List<String> ret = new ArrayList<>();
        for (String nameSpaceName : mMap.keySet()) {
            ret.add(nameSpaceName);
        }
        return ret;
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodBle.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder("ble");
        if (mSupportsPeripheralServerMode) {
            sb.append(":peripheral_server_mode:uuid=" + mPeripheralServerModeUuid);
        }
        if (mSupportsCentralClientMode) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/mdoc/connectionmethod/ConnectionMethodBle.java`
#### Snippet
```java
        }
        if (mSupportsCentralClientMode) {
            sb.append(":central_client_mode:uuid=" + mCentralClientModeUuid);
        }
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/util/CborUtil.java`
#### Snippet
```java
                String strValue = Util.checkedStringValue(dataItem);
                String escapedStrValue = strValue.replace("\"", "\\\"");
                sb.append("\"" + escapedStrValue + "\"");
                break;

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                String value = checkedStringValue(dataItem);
                // TODO: escape ' in |value|
                sb.append("'" + value + "'");
            }
            break;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                    sb.append("]");
                } else {
                    sb.append("[\n" + indentString);
                    int count = 0;
                    for (DataItem item : items) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                            sb.append(",");
                        }
                        sb.append("\n" + indentString);
                    }
                    sb.append("]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                    sb.append("{}");
                } else {
                    sb.append("{\n" + indentString);
                    int count = 0;
                    for (DataItem key : keys) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
                            sb.append(",");
                        }
                        sb.append("\n" + indentString);
                    }
                    sb.append("}");
```

