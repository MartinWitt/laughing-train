# identity-credential 
 
# Bad smells
I found 51 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 11 | false |
| UnnecessaryLocalVariable | 7 | true |
| DuplicatedCode | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| DataFlowIssue | 5 | false |
| ConstantValue | 4 | false |
| JavadocDeclaration | 3 | false |
| PointlessBitwiseExpression | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| AutoCloseableResource | 1 | false |
| EmptyStatementBody | 1 | false |
| UnnecessaryUnaryMinus | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
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

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `secretKey` is redundant
in `identity/src/main/java/com/android/identity/internal/Util.java`
#### Snippet
```java
            byte[] derivedKey = computeHkdf("HmacSha256", sharedSecret, salt, info, 32);

            SecretKey secretKey = new SecretKeySpec(derivedKey, "");
            return secretKey;
        } catch (InvalidKeyException
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `identity/src/main/java/com/android/identity/mdoc/mso/MobileSecurityObjectGenerator.java`
#### Snippet
```java

        Set<String> namespaceSet = new HashSet<>();
        namespaceSet.addAll(authorizedDataElements.keySet());
        namespaceSet.retainAll(mAuthorizedNameSpaces);

```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `identity/src/main/java/com/android/identity/mdoc/mso/MobileSecurityObjectGenerator.java`
#### Snippet
```java

        Set<String> namespaceSet = new HashSet<>();
        namespaceSet.addAll(mAuthorizedDataElements.keySet());
        namespaceSet.retainAll(authorizedNameSpaces);

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

## RuleId[id=ConstantValue]
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

