# ws-wss4j 
 
# Bad smells
I found 1494 bad smells with 151 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 377 | false |
| ReturnNull | 200 | false |
| UnusedAssignment | 119 | false |
| SizeReplaceableByIsEmpty | 109 | true |
| ConstantValue | 64 | false |
| DataFlowIssue | 55 | false |
| ZeroLengthArrayInitialization | 53 | false |
| BoundedWildcard | 51 | false |
| WhileCanBeForeach | 48 | false |
| AssignmentToMethodParameter | 42 | false |
| RedundantFieldInitialization | 37 | false |
| UnnecessaryContinue | 35 | false |
| StaticCallOnSubclass | 31 | false |
| UnnecessaryUnboxing | 30 | false |
| UnnecessarySuperQualifier | 29 | false |
| UnnecessaryModifier | 13 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 13 | false |
| CastCanBeRemovedNarrowingVariableType | 12 | false |
| NestedAssignment | 11 | false |
| TrivialStringConcatenation | 10 | false |
| MissortedModifiers | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 10 | false |
| AssignmentToForLoopParameter | 9 | false |
| RedundantSuppression | 9 | false |
| EmptyMethod | 8 | false |
| DuplicateExpressions | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| ReplaceNullCheck | 6 | false |
| NonProtectedConstructorInAbstractClass | 6 | true |
| UnnecessaryToStringCall | 5 | true |
| NonStrictComparisonCanBeEquality | 5 | true |
| UnnecessaryLocalVariable | 5 | true |
| NonShortCircuitBoolean | 4 | false |
| RedundantMethodOverride | 4 | false |
| DuplicateBranchesInSwitch | 3 | false |
| DuplicateThrows | 3 | false |
| MethodOverridesStaticMethod | 3 | false |
| IOResource | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| UnnecessaryBoxing | 3 | false |
| Java8MapApi | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| UnnecessaryReturn | 2 | true |
| AbstractClassNeverImplemented | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| JavaReflectionInvocation | 2 | false |
| UseBulkOperation | 2 | false |
| SuspiciousSystemArraycopy | 1 | false |
| CommentedOutCode | 1 | false |
| RedundantArrayCreation | 1 | true |
| MisspelledEquals | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| ExplicitArrayFilling | 1 | false |
| IgnoreResultOfCall | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonFinalFieldOfException | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| ComparatorMethodParameterNotUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Convert2Lambda | 1 | false |
| CopyConstructorMissesField | 1 | false |
| SuspiciousTernaryOperatorInVarargsCall | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Key\[subjectKeyMap.size()\]'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                        Map<String, Key> subjectKeyMap = subjectSecurityToken.getSecretKey();
                        if (!subjectKeyMap.isEmpty()) {
                            subjectSecretKey = subjectKeyMap.values().toArray(new Key[subjectKeyMap.size()])[0];
                        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[implementedInterfaces.size()\]'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
        List<Class<?>> implementedInterfaces = new ArrayList<>();
        getImplementedInterfaces(inboundSecurityToken.getClass(), implementedInterfaces);
        Class<?>[] interfaces = implementedInterfaces.toArray(new Class<?>[implementedInterfaces.size()]);

        return (InboundSecurityToken) Proxy.newProxyInstance(
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    //unused tokens must be checked (algorithms etc)

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PolicyEnforcer.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
public final class SAML2ComponentBuilder {

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SAML2ComponentBuilder.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSCrypto.java`
#### Snippet
```java
class WSSCrypto {

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSCrypto.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler.java`
#### Snippet
```java
public class WSSSignatureInputHandler extends AbstractSignatureInputHandler {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSSignatureInputHandler.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSEncryptedKeyInputHandler.java`
#### Snippet
```java
public class WSSEncryptedKeyInputHandler extends XMLEncryptedKeyInputHandler {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSEncryptedKeyInputHandler.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
public class DecryptInputProcessor extends AbstractDecryptInputProcessor {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DecryptInputProcessor.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java
        extends org.apache.xml.security.stax.impl.securityToken.X509SecurityToken implements X509SecurityToken {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SecurityTokenImpl.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/UsernameTokenValidatorImpl.java`
#### Snippet
```java
public class UsernameTokenValidatorImpl implements UsernameTokenValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(UsernameTokenValidatorImpl.class);

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/SamlTokenValidatorImpl.java`
#### Snippet
```java
public class SamlTokenValidatorImpl extends SignatureTokenValidatorImpl implements SamlTokenValidator {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlTokenValidatorImpl.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/BinarySecurityTokenValidatorImpl.java`
#### Snippet
```java
public class BinarySecurityTokenValidatorImpl implements BinarySecurityTokenValidator {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(BinarySecurityTokenValidatorImpl.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/TimestampValidatorImpl.java`
#### Snippet
```java
public class TimestampValidatorImpl implements TimestampValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TimestampValidatorImpl.class);

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/JAASUsernameTokenValidatorImpl.java`
#### Snippet
```java
public class JAASUsernameTokenValidatorImpl implements UsernameTokenValidator {

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JAASUsernameTokenValidatorImpl.class);

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java
public class InboundWSSec {

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(InboundWSSec.class);

```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `dropReferenceMarker()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler.java`
#### Snippet
```java
                securityTokenReferenceType.getAny(), WSSConstants.TAG_WSSE_REFERENCE);
        if (referenceType != null) {
            attributeValue = WSSUtils.dropReferenceMarker(referenceType.getURI());
            if (WSSConstants.NS_SAML10_TYPE.equals(referenceType.getValueType())) {
                attributeName = WSSConstants.ATT_NULL_ASSERTION_ID;
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler.java`
#### Snippet
```java
                        inputProcessorChain.getSecurityContext().registerSecurityEvent(algorithmSuiteSecurityEvent);

                        String algo = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                        return new SecretKeySpec(keyBytes, algo);
                    }
```

### StaticCallOnSubclass
Static method `dropReferenceMarker()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
                    Map.Entry<String, ReferenceType> next = iterator.next();
                    final ReferenceType referenceType = next.getValue();
                    String uri = WSSUtils.dropReferenceMarker(referenceType.getURI());

                    Iterator<String> encryptedDataIterator = encryptedDataRefs.iterator();
```

### StaticCallOnSubclass
Static method `createKeyValueTokenStructure()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureEndingOutputProcessor.java`
#### Snippet
```java

        if (WSSecurityTokenConstants.KeyIdentifier_KeyValue.equals(keyIdentifier)) {
            WSSUtils.createKeyValueTokenStructure(this, outputProcessorChain, x509Certificates);
        } else {
            boolean isSAMLToken = false;
```

### StaticCallOnSubclass
Static method `createX509IssuerSerialStructure()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureEndingOutputProcessor.java`
#### Snippet
```java
                WSSUtils.createBSTReferenceStructure(this, outputProcessorChain, id, WSSConstants.NS_WSS_ENC_KEY_VALUE_TYPE, true);
            } else if (WSSecurityTokenConstants.KeyIdentifier_IssuerSerial.equals(keyIdentifier)) {
                WSSUtils.createX509IssuerSerialStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_SkiKeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### StaticCallOnSubclass
Static method `getTransformer()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                                inclusiveNamespacesType.getPrefixList());
                    }
                    parentTransformer = WSSUtils.getTransformer(
                            null, outputStream, transformerProperties, algorithm, XMLSecurityConstants.DIRECTION.IN);
                }
```

### StaticCallOnSubclass
Static method `getTransformer()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java

            if (parentTransformer != null) {
                parentTransformer = WSSUtils.getTransformer(
                        parentTransformer, null, transformerProperties, algorithm, XMLSecurityConstants.DIRECTION.IN);
            } else {
```

### StaticCallOnSubclass
Static method `getTransformer()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                        parentTransformer, null, transformerProperties, algorithm, XMLSecurityConstants.DIRECTION.IN);
            } else {
                parentTransformer = WSSUtils.getTransformer(
                        null, outputStream, transformerProperties, algorithm, XMLSecurityConstants.DIRECTION.IN);
            }
```

### StaticCallOnSubclass
Static method `generateBytes()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityConstants' but referenced via subclass 'org.apache.wss4j.stax.ext.WSSConstants'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/UsernameTokenOutputProcessor.java`
#### Snippet
```java
            if (usernameTokenPasswordType == WSSConstants.UsernameTokenPasswordType.PASSWORD_DIGEST
                || ((WSSSecurityProperties) getSecurityProperties()).isAddUsernameTokenNonce()) {
                nonceValue = WSSConstants.generateBytes(16);
            }

```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
                        byte[] secretKey = getSecretKeyUsingCallback();
                        if (secretKey != null && secretKey.length > 0) {
                            String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                            key = new SecretKeySpec(secretKey, algoFamily);
                            setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java

                String encryptionSymAlgorithm = getSecurityProperties().getEncryptionSymAlgorithm();
                String jceAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionSymAlgorithm);
                if (jceAlgorithm == null) {
                    throw new XMLSecurityException("algorithms.NoSuchMap", new Object[] {encryptionSymAlgorithm});
```

### StaticCallOnSubclass
Static method `getJaxbUnmarshaller()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityConstants' but referenced via subclass 'org.apache.wss4j.stax.ext.WSSConstants'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
            Object object = null;
            try {
                Unmarshaller unmarshaller = WSSConstants.getJaxbUnmarshaller(securityProperties.isDisableSchemaValidation());
                object = unmarshaller.unmarshal(new XMLSecurityEventReader(eventQueue, idx));
            } catch (JAXBException e) {
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                    Key key = super.getKey(algorithmURI, algorithmUsage, correlationID);
                    if (key == null) {
                        String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                        key = new SecretKeySpec(XMLUtils.decode(stringBuilder.toString()), algoFamily);
                        setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `getKeyLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                    length = ((WSSSecurityProperties)getSecurityProperties()).getDerivedSignatureKeyLength();
                } else {
                    length = JCEAlgorithmMapper.getKeyLengthFromURI(getSecurityProperties().getSignatureAlgorithm()) / 8;
                    if (length == 0) {
                        length = KeyUtils.getKeyLength(getSecurityProperties().getSignatureAlgorithm()) / 8;
```

### StaticCallOnSubclass
Static method `getKeyLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                    length = ((WSSSecurityProperties)getSecurityProperties()).getDerivedEncryptionKeyLength();
                } else {
                    length = JCEAlgorithmMapper.getKeyLengthFromURI(getSecurityProperties().getEncryptionSymAlgorithm()) / 8;
                    if (length == 0) {
                        length = KeyUtils.getKeyLength(getSecurityProperties().getEncryptionSymAlgorithm()) / 8;
```

### StaticCallOnSubclass
Static method `generateBytes()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityConstants' but referenced via subclass 'org.apache.wss4j.stax.ext.WSSConstants'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
            byte[] label = defaultLabel.getBytes(StandardCharsets.UTF_8);

            byte[] nonce = WSSConstants.generateBytes(16);

            byte[] seed = new byte[label.length + nonce.length];
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                        return key;
                    }
                    String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                    key = new SecretKeySpec(derivedKeyBytes, algoFamily);
                    setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `createX509IssuerSerialStructure()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                WSSUtils.createBSTReferenceStructure(this, outputProcessorChain, tokenId, valueType, true);
            } else if (WSSecurityTokenConstants.KeyIdentifier_IssuerSerial.equals(keyIdentifier)) {
                WSSUtils.createX509IssuerSerialStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_SkiKeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/OutboundUsernameSecurityToken.java`
#### Snippet
```java
            UsernameTokenUtil.generateDerivedKey(getPassword(), salt, iterations);

        String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
        key = new SecretKeySpec(secretToken, algoFamily);
        setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl.java`
#### Snippet
```java

        byte[] secretToken = generateDerivedKey(wsInboundSecurityContext);
        String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
        key = new SecretKeySpec(secretToken, algoFamily);
        setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `createKeyValueTokenStructure()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
            if ((x509Certificates == null || x509Certificates.length == 0)
                && securityToken.getKeyWrappingToken().getPublicKey() != null) {
                WSSUtils.createKeyValueTokenStructure(this, outputProcessorChain,
                                                      securityToken.getKeyWrappingToken().getPublicKey());
                return;
```

### StaticCallOnSubclass
Static method `createX509IssuerSerialStructure()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java

            if (WSSecurityTokenConstants.KeyIdentifier_IssuerSerial.equals(keyIdentifier)) {
                WSSUtils.createX509IssuerSerialStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_SkiKeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                try {
                    //encrypt the symmetric session key with the public key from the receiver:
                    String jceid = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportAlgorithm);
                    Cipher cipher = Cipher.getInstance(jceid);

```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                            getSecurityProperties().getEncryptionKeyTransportDigestAlgorithm();
                        if (encryptionKeyTransportDigestAlgorithm != null) {
                            jceDigestAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportDigestAlgorithm);
                        }

```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                        MGF1ParameterSpec mgfParameterSpec = new MGF1ParameterSpec("SHA-1");
                        if (encryptionKeyTransportMGFAlgorithm != null) {
                            String jceMGFAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportMGFAlgorithm);
                            mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                        }
```

### StaticCallOnSubclass
Static method `setJaxbContext()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityConstants' but referenced via subclass 'org.apache.wss4j.stax.ext.WSSConstants'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
            Init.init(ClassLoaderUtils.getResource("wss/wss-config.xml", WSSec.class).toURI(), WSSec.class);

            WSSConstants.setJaxbContext(
                    JAXBContext.newInstance(
                            org.apache.wss4j.binding.wss10.ObjectFactory.class,
```

### StaticCallOnSubclass
Static method `setJaxbSchemas()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityConstants' but referenced via subclass 'org.apache.wss4j.stax.ext.WSSConstants'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java

            Schema schema = loadWSSecuritySchemas();
            WSSConstants.setJaxbSchemas(schema);
        } catch (XMLSecurityException | JAXBException
            | SAXException | URISyntaxException e) {
```

### StaticCallOnSubclass
Static method `dropReferenceMarker()` declared in class 'org.apache.xml.security.stax.ext.XMLSecurityUtils' but referenced via subclass 'org.apache.wss4j.stax.utils.WSSUtils'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R5204);
        }
        uri = WSSUtils.dropReferenceMarker(uri);
        //referenced BST:*/
        //we have to search BST somewhere in the doc. First we will check for a BST already processed and
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        if (securityToken == null || securityToken.getSecretKey(symmetricEncryptionAlgorithm) == null) {
            //prepare the symmetric session key for all encryption parts
            String keyAlgorithm = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(securityProperties.getEncryptionSymAlgorithm());
            KeyGenerator keyGen;
            try {
```

### StaticCallOnSubclass
Static method `getKeyLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
            //whereas bouncy castle expects the block size of 128 or 192 bits
            if (keyAlgorithm.contains("AES")) {
                int keyLength = JCEAlgorithmMapper.getKeyLengthFromURI(securityProperties.getEncryptionSymAlgorithm());
                keyGen.init(keyLength);
            }
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
            } else if (secretKey != null) {
                x509Certificates = null;
                String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(signatureAlgorithm);
                key = new SecretKeySpec(secretKey, algoFamily);
            } else {
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'java.security.cert.Certificate\[\]' is not assignable to destination parameter `x509certs` of type 'java.security.cert.X509Certificate\[\]'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
                    X509Certificate[] x509certs = new X509Certificate[foundCertChain.length + 1];
                    x509certs[0] = certs[0];
                    System.arraycopy(foundCertChain, 0, x509certs, 1, foundCertChain.length);

                    List<X509Certificate> certList = Arrays.asList(x509certs);
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredElementsAssertionState.java`
#### Snippet
```java

        Iterator<Map.Entry<List<QName>, Boolean>> elementMapIterator = pathElements.entrySet().iterator();
        while (elementMapIterator.hasNext()) {
            Map.Entry<List<QName>, Boolean> next = elementMapIterator.next();
            List<QName> qNameList = next.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredElementsAssertionState.java`
#### Snippet
```java
        clearErrorMessage();
        Iterator<Map.Entry<List<QName>, Boolean>> elementMapIterator = pathElements.entrySet().iterator();
        while (elementMapIterator.hasNext()) {
            Map.Entry<List<QName>, Boolean> next = elementMapIterator.next();
            if (Boolean.FALSE.equals(next.getValue())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/EncryptedElementsAssertionState.java`
#### Snippet
```java

        Iterator<List<QName>> pathElementIterator = pathElements.iterator();
        while (pathElementIterator.hasNext()) {
            List<QName> pathElements = pathElementIterator.next();
            if (WSSUtils.pathMatches(pathElements, encryptedElementSecurityEvent.getElementPath())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignedElementsAssertionState.java`
#### Snippet
```java

        Iterator<List<QName>> pathElementIterator = pathElements.iterator();
        while (pathElementIterator.hasNext()) {
            List<QName> pathElements = pathElementIterator.next();
            if (WSSUtils.pathMatches(pathElements, signedSecurityEvent.getElementPath())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredPartsAssertionState.java`
#### Snippet
```java
        clearErrorMessage();
        Iterator<Map.Entry<Header, Boolean>> elementMapIterator = headers.entrySet().iterator();
        while (elementMapIterator.hasNext()) {
            Map.Entry<Header, Boolean> next = elementMapIterator.next();
            if (Boolean.FALSE.equals(next.getValue())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredPartsAssertionState.java`
#### Snippet
```java

        Iterator<Map.Entry<Header, Boolean>> elementMapIterator = headers.entrySet().iterator();
        while (elementMapIterator.hasNext()) {
            Map.Entry<Header, Boolean> next = elementMapIterator.next();
            Header header = next.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/ContentEncryptedElementsAssertionState.java`
#### Snippet
```java

        Iterator<List<QName>> pathElementIterator = pathElements.iterator();
        while (pathElementIterator.hasNext()) {
            List<QName> pathElements = pathElementIterator.next();
            if (WSSUtils.pathMatches(pathElements, contentEncryptedElementSecurityEvent.getElementPath())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureProtectionAssertionState.java`
#### Snippet
```java
            // Store all matching Signature/SignatureConfirmation Elements
            Iterator<List<QName>> pathElementsIterator = elementPaths.iterator();
            while (pathElementsIterator.hasNext()) {
                List<QName> qNameList = pathElementsIterator.next();
                if (WSSUtils.pathMatches(qNameList, encryptedElementSecurityEvent.getElementPath())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java
        @SuppressWarnings({"unchecked", "rawtypes"})
        Iterator<Map.Entry> services = wsdlDefinition.getAllServices().entrySet().iterator();
        while (services.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<QName, Service> serviceEntry = services.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java
            @SuppressWarnings({"unchecked", "rawtypes"})
            Iterator<Map.Entry> ports = service.getPorts().entrySet().iterator();
            while (ports.hasNext()) {
                @SuppressWarnings("unchecked")
                Map.Entry<QName, Port> portEntry = ports.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
        Iterator<Map<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>>> assertionStateMapIterator =
            this.failedAssertionStateMap.iterator();
        while (assertionStateMapIterator.hasNext()) {
            Map<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>> map =
                assertionStateMapIterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            Iterator<Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>>> entryIterator =
                entrySet.iterator();
            while (entryIterator.hasNext()) {
                Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>> eventCollectionEntry =
                    entryIterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                Iterator<Map.Entry<Assertion, List<Assertable>>> assertionStateEntryIterator =
                    assertionListMap.entrySet().iterator();
                while (assertionStateEntryIterator.hasNext()) {
                    Map.Entry<Assertion, List<Assertable>> entry = assertionStateEntryIterator.next();
                    List<Assertable> assertionStates = entry.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                    List<Assertable> assertionStates = entry.getValue();
                    Iterator<Assertable> assertableIterator = assertionStates.iterator();
                    while (assertableIterator.hasNext()) {
                        Assertable assertable = assertableIterator.next();
                        if (!assertable.isAsserted() && !assertable.isLogged()) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            Iterator<Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>>> iterator =
                map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>> mapEntry =
                    iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                Iterator<Map.Entry<Assertion, List<Assertable>>> assertionStateIterator =
                    mapEntry.getValue().entrySet().iterator();
                while (assertionStateIterator.hasNext()) {
                    Map.Entry<Assertion, List<Assertable>> assertionListEntry = assertionStateIterator.next();
                    List<Assertable> assertableList = assertionListEntry.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                    List<Assertable> assertableList = assertionListEntry.getValue();
                    Iterator<Assertable> assertableIterator = assertableList.iterator();
                    while (assertableIterator.hasNext()) {
                        Assertable assertable = assertableIterator.next();
                        if (!assertable.isAsserted()) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                        Iterator<Map.Entry<Assertion, List<Assertable>>> assertionStateIterator =
                            assertionListMap.entrySet().iterator();
                        while (assertionStateIterator.hasNext()) {
                            Map.Entry<Assertion, List<Assertable>> assertionStateEntry =
                                assertionStateIterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                            List<Assertable> assertionStates = assertionStateEntry.getValue();
                            Iterator<Assertable> assertableIterator = assertionStates.iterator();
                            while (assertableIterator.hasNext()) {
                                Assertable assertable = assertableIterator.next();
                                boolean asserted = assertable.assertEvent(securityEvent);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                    Iterator<Map.Entry<Assertion, List<Assertable>>> assertionStateIterator =
                        assertionListMap.entrySet().iterator();
                    while (assertionStateIterator.hasNext()) {
                        Map.Entry<Assertion, List<Assertable>> assertionStateEntry = assertionStateIterator.next();
                        List<Assertable> assertionStates = assertionStateEntry.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                        List<Assertable> assertionStates = assertionStateEntry.getValue();
                        Iterator<Assertable> assertableIterator = assertionStates.iterator();
                        while (assertableIterator.hasNext()) {
                            Assertable assertable = assertableIterator.next();
                            boolean asserted = assertable.assertEvent(securityEvent);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            int alternative = 0;
            Iterator<PolicyComponent> policyComponentIterator = policyComponents.iterator();
            while (policyComponentIterator.hasNext()) {
                PolicyComponent curPolicyComponent = policyComponentIterator.next();
                if (policyOperator instanceof ExactlyOne) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            Iterator<Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>>> iterator =
                map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>> mapEntry =
                    iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                Iterator<Map.Entry<Assertion, List<Assertable>>> assertionStateIterator =
                    mapEntry.getValue().entrySet().iterator();
                while (assertionStateIterator.hasNext()) {
                    Map.Entry<Assertion, List<Assertable>> assertionListEntry = assertionStateIterator.next();
                    List<Assertable> assertableList = assertionListEntry.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                    List<Assertable> assertableList = assertionListEntry.getValue();
                    Iterator<Assertable> assertableIterator = assertableList.iterator();
                    while (assertableIterator.hasNext()) {
                        Assertable assertable = assertableIterator.next();

```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            List<PolicyComponent> policyComponents = policyOperator.getPolicyComponents();
            Iterator<PolicyComponent> policyComponentIterator = policyComponents.iterator();
            while (policyComponentIterator.hasNext()) {
                PolicyComponent curPolicyComponent = policyComponentIterator.next();
                buildAssertionStateMap(curPolicyComponent, assertionStateMap, alternative);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            List<Assertable> assertablesList = getAssertableForAssertion(abstractSecurityAssertion);
            Iterator<Assertable> assertableIterator = assertablesList.iterator();
            while (assertableIterator.hasNext()) {
                Assertable assertable = assertableIterator.next();
                final Map<SecurityEventConstants.Event, Map<Assertion, List<Assertable>>> map =
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    private OperationPolicy findPolicyBySOAPAction(List<OperationPolicy> operationPolicies, String soapAction) {
        Iterator<OperationPolicy> operationPolicyIterator = operationPolicies.iterator();
        while (operationPolicyIterator.hasNext()) {
            OperationPolicy operationPolicy = operationPolicyIterator.next();
            if (soapAction.equals(operationPolicy.getOperationAction())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
                NodeSetData nodeSetData = (NodeSetData)data;
                Iterator<?> iterator = nodeSetData.iterator();
                while (iterator.hasNext()) {
                    Node node = (Node)iterator.next();
                    if (node instanceof Element && "SecurityTokenReference".equals(node.getLocalName())) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                        java.util.Iterator<?> iter = data.iterator();

                        while (iter.hasNext()) {
                            Node n = (Node)iter.next();
                            if (n instanceof Element) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                java.util.Iterator<?> referenceIterator =
                    xmlSignature.getSignedInfo().getReferences().iterator();
                while (referenceIterator.hasNext()) {
                    Reference reference = (Reference)referenceIterator.next();
                    boolean referenceValidationCheck = reference.validate(context);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java

        Iterator<Map.Entry<String, String>> iterator = paramMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            stringBuilder.append(SEMICOLON);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
        Map<String, String> sortedHeaders = new TreeMap<>();
        Iterator<Map.Entry<String, String>> iterator = headers.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String name = next.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java

        Iterator<Map.Entry<String, String>> entryIterator = sortedHeaders.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> next = entryIterator.next();
            String name = next.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `policy/src/main/java/org/apache/wss4j/policy/model/RequiredElements.java`
#### Snippet
```java
            Iterator<Map.Entry<String, String>> namespaceIterator =
                xPath.getPrefixNamespaceMap().entrySet().iterator();
            while (namespaceIterator.hasNext()) {
                Map.Entry<String, String> namespaceEntry = namespaceIterator.next();
                writer.writeNamespace(namespaceEntry.getKey(), namespaceEntry.getValue());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler.java`
#### Snippet
```java

        Iterator<ObjectType> objectTypeIterator = signatureType.getObject().iterator();
        while (objectTypeIterator.hasNext()) {
            ObjectType objectType = objectTypeIterator.next();
            ManifestType manifestType = XMLSecurityUtils.getQNameType(objectType.getContent(), WSSConstants.TAG_dsig_Manifest);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
            if (references != null) {
                Iterator<Map.Entry<String, ReferenceType>> iterator = references.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, ReferenceType> next = iterator.next();
                    final ReferenceType referenceType = next.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java

                    Iterator<String> encryptedDataIterator = encryptedDataRefs.iterator();
                    while (encryptedDataIterator.hasNext()) {
                        String s = encryptedDataIterator.next();
                        if (s.equals(uri)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
            List<JAXBElement<ReferenceType>> references = referenceList.getDataReferenceOrKeyReference();
            Iterator<JAXBElement<ReferenceType>> referenceTypeIterator = references.iterator();
            while (referenceTypeIterator.hasNext()) {
                ReferenceType referenceType = referenceTypeIterator.next().getValue();
                if (!referenceType.getURI().startsWith("#")) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptEndingOutputProcessor.java`
#### Snippet
```java
        int count = 0;
        Iterator<EncryptionPartDef> encryptionPartDefIterator = encryptionPartDefs.iterator();
        while (encryptionPartDefIterator.hasNext()) {
            EncryptionPartDef encryptionPartDef = encryptionPartDefIterator.next();

```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                            }
                            Iterator<Map.Entry<String, Key>> iterator = keyMap.entrySet().iterator();
                            while (iterator.hasNext()) {
                                Map.Entry<String, Key> next = iterator.next();
                                if (next.getValue().equals(subjectSecretKey)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SecurityHeaderReorderProcessor.java`
#### Snippet
```java
                    Map.Entry<XMLSecurityConstants.Action, Map<SecurityHeaderOrder, Deque<XMLSecEvent>>> next = iterator.next();
                    Iterator<Map.Entry<SecurityHeaderOrder, Deque<XMLSecEvent>>> entryIterator = next.getValue().entrySet().iterator();
                    while (entryIterator.hasNext()) {
                        Map.Entry<SecurityHeaderOrder, Deque<XMLSecEvent>> entry = entryIterator.next();
                        Deque<XMLSecEvent> xmlSecEvents = entry.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
        List<TokenSecurityEvent<? extends InboundSecurityToken>> tokenSecurityEvents = new ArrayList<>();
        Iterator<SecurityEvent> securityEventIterator = securityEventDeque.iterator();
        while (securityEventIterator.hasNext()) {
            SecurityEvent securityEvent = securityEventIterator.next();
            if (securityEvent instanceof TokenSecurityEvent) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java

        Iterator<EncryptionPartDef> encryptionPartDefIterator = encryptionPartDefs.iterator();
        while (encryptionPartDefIterator.hasNext()) {
            EncryptionPartDef encryptionPartDef = encryptionPartDefIterator.next();

```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
        //output the references to the encrypted data:
        Iterator<EncryptionPartDef> encryptionPartDefIterator = encryptionPartDefs.iterator();
        while (encryptionPartDefIterator.hasNext()) {
            EncryptionPartDef encryptionPartDef = encryptionPartDefIterator.next();

```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<QName> pathIterator = path.iterator();
        while (pathIterator.hasNext()) {
            QName qName = pathIterator.next();
            stringBuilder.append('/');
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java
            try {
                Iterator<SecurityEvent> securityEventIterator = requestSecurityEvents.iterator();
                while (securityEventIterator.hasNext()) {
                    SecurityEvent securityEvent = securityEventIterator.next();
                    if (securityEvent instanceof TokenSecurityEvent) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java
        if (!additionalInputProcessors.isEmpty()) {
            Iterator<InputProcessor> inputProcessorIterator = additionalInputProcessors.iterator();
            while (inputProcessorIterator.hasNext()) {
                InputProcessor inputProcessor = inputProcessorIterator.next();
                inputProcessorChain.addProcessor(inputProcessor);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/UsernameTokenSignedAction.java`
#### Snippet
```java
        // UsernameToken Element. This way the server gets the UsernameToken
        // first, can check it and are prepared to compute the Signature key.
        // sign.prependToHeader(reqData.getSecHeader());
        // builder.prependToHeader(reqData.getSecHeader());

```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
        try {
            Class<?> c = Class.forName("org.bouncycastle.asn1.x500.X500Name");
            cons = c.getConstructor(new Class[] {String.class});
        } catch (Exception e) { //NOPMD
          //ignore
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            break;
        case WSConstants.ENCR:
            reason = WSPasswordCallback.SECRET_KEY;
            break;
        case WSConstants.DKT_ENCR:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            break;
        case WSConstants.DKT_ENCR:
            reason = WSPasswordCallback.SECRET_KEY;
            break;
        default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/transformer/AttachmentContentSignatureTransform.java`
#### Snippet
```java
                return XMLSecurityConstants.TransformMethod.InputStream;
            case InputStream:
                return XMLSecurityConstants.TransformMethod.InputStream;
            default:
                throw new IllegalArgumentException("Unsupported class " + forInput.name());
```

## RuleId[id=MisspelledEquals]
### MisspelledEquals
`equal()` method should probably be 'equals()'
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSecurityAssertion.java`
#### Snippet
```java

    @Override
    public boolean equal(PolicyComponent policyComponent) {
        return policyComponent == this;
    }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `WSSConstants.SIGNATURE.equals(action) || WSSConstants.SAML_TOKEN_SIGNED.equals(a...`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor.java`
#### Snippet
```java
            XMLSecurityConstants.Action action = getAction();
            String tokenId = null;
            if (WSSConstants.SIGNATURE.equals(action)
                    || WSSConstants.SAML_TOKEN_SIGNED.equals(action)) {
                tokenId = outputProcessorChain.getSecurityContext().get(WSSConstants.PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE);
            } else if (WSSConstants.ENCRYPTION.equals(action)) {
```

### DuplicateExpressions
Multiple occurrences of `WSSConstants.SIGNATURE.equals(action) || WSSConstants.SAML_TOKEN_SIGNED.equals(action)`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor.java`
#### Snippet
```java
            boolean includeToken = false;
            WSSecurityTokenConstants.KeyIdentifier keyIdentifier = null;
            if ((WSSConstants.SIGNATURE.equals(action) || WSSConstants.SAML_TOKEN_SIGNED.equals(action))
                && !getSecurityProperties().getSignatureKeyIdentifiers().isEmpty()) {
                includeToken = ((WSSSecurityProperties) getSecurityProperties()).isIncludeSignatureToken();
```

### DuplicateExpressions
Multiple occurrences of `XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) |...`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                final String encryptionKeyTransportMGFAlgorithm = getSecurityProperties().getEncryptionKeyTransportMGFAlgorithm();

                if (XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm)
                    || XMLSecurityConstants.NS_XENC_RSAOAEPMGF1P.equals(encryptionKeyTransportAlgorithm)) {

                    byte[] oaepParams = getSecurityProperties().getEncryptionKeyTransportOAEPParams();
```

### DuplicateExpressions
Multiple occurrences of `XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) ...`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java

                    AlgorithmParameterSpec algorithmParameterSpec = null;
                    if (XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm)
                        || XMLSecurityConstants.NS_XENC_RSAOAEPMGF1P.equals(encryptionKeyTransportAlgorithm)) {

                        String jceDigestAlgorithm = "SHA-1";
```

### DuplicateExpressions
Multiple occurrences of `WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType)`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            }
        } else if (encodingType != null
                && (WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType))) {
            ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R6604);
        }
```

### DuplicateExpressions
Multiple occurrences of `WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType)`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
                    (WSInboundSecurityContext) inboundSecurityContext, callbackHandler, keyIdentifierType.getValue(),
                    securityTokenReferenceId);
        } else if (WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType)) {
            if (WSSConstants.NS_SAML20_TYPE.equals(valueType) && !WSSConstants.NS_SAML20_TOKEN_PROFILE_TYPE.equals(tokenType)) {
                ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R6617);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`xPathElement.length() == 0` can be replaced with 'xPathElement.isEmpty()'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/PolicyUtils.java`
#### Snippet
```java
        for (int j = 0; j < xPathElements.length; j++) {
            String xPathElement = xPathElements[j];
            if (xPathElement == null || xPathElement.length() == 0) {
                continue;
            }
```

### SizeReplaceableByIsEmpty
`claimTypeOptional.length() == 0` can be replaced with 'claimTypeOptional.isEmpty()'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
                String claimTypeOptional = claimType.getAttributeNS(null, "Optional");

                if (claimTypeOptional.length() == 0 || !Boolean.parseBoolean(claimTypeOptional)) {
                    String errorMsg = findClaimInAssertion(samlTokenSecurityEvent.getSamlAssertionWrapper(), URI.create(claimTypeUri));
                    if (errorMsg != null) {
```

### SizeReplaceableByIsEmpty
`uri.length() == 0` can be replaced with 'uri.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/WSDocInfo.java`
#### Snippet
```java
    public boolean hasResult(Integer tag, String uri) {
        String id = XMLUtils.getIDFromReference(uri);
        if (id == null || uri == null || uri.length() == 0) {
            return false;
        }
```

### SizeReplaceableByIsEmpty
`valueType.length() == 0` can be replaced with 'valueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
                || token instanceof PKIPathSecurity && !PKIPathSecurity.PKI_TYPE.equals(valueType)
                || token instanceof KerberosSecurity
                        && !(valueType == null || valueType.length() == 0)
                        && !WSConstants.WSS_GSS_KRB_V5_AP_REQ.equals(valueType)) {
                bspEnforcer.handleBSPRule(BSPRule.R3058);
```

### SizeReplaceableByIsEmpty
`encoding.length() != 0` can be replaced with '!encoding.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
            }
            String encoding = secRef.getKeyIdentifierEncodingType();
            if (encoding != null && encoding.length() != 0) {
                bspEnforcer.handleBSPRule(BSPRule.R6604);
            }
```

### SizeReplaceableByIsEmpty
`valueType.length() != 0` can be replaced with '!valueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
        if (samlAssertion.getSaml2() != null && secRef.containsReference()) {
            String valueType = secRef.getReference().getValueType();
            if (valueType != null && valueType.length() != 0) {
                bspEnforcer.handleBSPRule(BSPRule.R6614);
            }
```

### SizeReplaceableByIsEmpty
`symEncAlgo.length() == 0` can be replaced with 'symEncAlgo.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
        if (tmpE != null) {
            symEncAlgo = tmpE.getAttributeNS(null, "Algorithm");
            if (symEncAlgo == null || symEncAlgo.length() == 0) {
                throw new WSSecurityException(
                    WSSecurityException.ErrorCode.UNSUPPORTED_ALGORITHM, "noEncAlgo"
```

### SizeReplaceableByIsEmpty
`operationName.getNamespaceURI().length() == 0` can be replaced with 'operationName.getNamespaceURI().isEmpty()'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                if (soapOperationName.equals(operationName)) {
                    return operationPolicy;
                } else if ((operationName.getNamespaceURI() == null || operationName.getNamespaceURI().length() == 0)
                    && soapOperationName.getLocalPart().equals(operationName.getLocalPart())) {
                    noNamespaceOperation = operationPolicy;
```

### SizeReplaceableByIsEmpty
`actionToParse.length() == 0` can be replaced with 'actionToParse.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
        }
        actionToParse = actionToParse.trim();
        if (actionToParse.length() == 0) {
            return Collections.emptyList();
        }
```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
        String qName = localName;
        String prefix = parent.getPrefix();
        if (prefix != null && prefix.length() > 0) {
            qName = prefix + ":" + localName;
        }
```

### SizeReplaceableByIsEmpty
`hActor.length() == 0` can be replaced with 'hActor.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
     */
    public static boolean isActorEqual(String actor, String hActor) {
        if ((hActor == null || hActor.length() == 0)
            && (actor == null || actor.length() == 0)) {
            return true;
```

### SizeReplaceableByIsEmpty
`actor.length() == 0` can be replaced with 'actor.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
    public static boolean isActorEqual(String actor, String hActor) {
        if ((hActor == null || hActor.length() == 0)
            && (actor == null || actor.length() == 0)) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecBase.java`
#### Snippet
```java
        String newAttrPrefix = WSConstants.WSU_PREFIX;

        if (id == null || id.length() == 0) {
            if (WSConstants.ENC_NS.equals(bodyElement.getNamespaceURI())
                && (WSConstants.ENC_DATA_LN.equals(bodyElement.getLocalName())
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecBase.java`
#### Snippet
```java
        }

        if (id == null || id.length() == 0) {
            id = getIdAllocator().createId("id-", bodyElement);
            String prefix = XMLUtils.setNamespace(bodyElement, newAttrNs, newAttrPrefix);
```

### SizeReplaceableByIsEmpty
`actor.length() > 0` can be replaced with '!actor.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecHeader.java`
#### Snippet
```java
            );

        if (actor != null && actor.length() > 0) {
            String actorLocal = WSConstants.ATTR_ACTOR;
            if (WSConstants.URI_SOAP12_ENV.equals(soapNamespace)) {
```

### SizeReplaceableByIsEmpty
`customValueType.length() != 0` can be replaced with '!customValueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java
                    ref.setURI("#" + tokenIdentifier);
                }
                if (customValueType != null && customValueType.length() != 0) {
                    ref.setValueType(customValueType);
                }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SignatureConfirmation.java`
#### Snippet
```java

        String id = getID();
        if (id == null || id.length() == 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5441);
        }
```

### SizeReplaceableByIsEmpty
`getValueType().length() == 0` can be replaced with 'getValueType().isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
        LOG.debug("Successfully retrieved a service ticket");

        if (getValueType().length() == 0) {
            setValueType(WSConstants.WSS_GSS_KRB_V5_AP_REQ);
        }
```

### SizeReplaceableByIsEmpty
`valueType.length() != 0` can be replaced with '!valueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/Timestamp.java`
#### Snippet
```java
                    if (createdString == null) {
                        String valueType = currentChildElement.getAttributeNS(null, "ValueType");
                        if (valueType != null && valueType.length() != 0) {
                            // We can't have a ValueType attribute as per the BSP spec
                            bspEnforcer.handleBSPRule(BSPRule.R3225);
```

### SizeReplaceableByIsEmpty
`valueType.length() != 0` can be replaced with '!valueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/Timestamp.java`
#### Snippet
```java
                    } else {
                        String valueType = currentChildElement.getAttributeNS(null, "ValueType");
                        if (valueType != null && valueType.length() != 0) {
                            // We can't have a ValueType attribute as per the BSP spec
                            bspEnforcer.handleBSPRule(BSPRule.R3226);
```

### SizeReplaceableByIsEmpty
`valueType.length() == 0` can be replaced with 'valueType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/callback/DOMCallbackLookup.java`
#### Snippet
```java
        if (WSConstants.WSS_SAML_KI_VALUE_TYPE.equals(valueType)
            || WSConstants.WSS_SAML2_KI_VALUE_TYPE.equals(valueType)
            || valueType == null || valueType.length() == 0) {
            foundElement =
                XMLUtils.findSAMLAssertionElementById(
```

### SizeReplaceableByIsEmpty
`encKeyId.length() == 0` can be replaced with 'encKeyId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
    protected void createEncryptedKeyElement(X509Certificate remoteCert, Crypto crypto) throws WSSecurityException {
        encryptedKeyElement = createEncryptedKey(getDocument(), keyEncAlgo);
        if (encKeyId == null || encKeyId.length() == 0) {
            encKeyId = IDGenerator.generateID("EK-");
        }
```

### SizeReplaceableByIsEmpty
`encKeyId.length() == 0` can be replaced with 'encKeyId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
    protected void createEncryptedKeyElement(Key key) throws WSSecurityException {
        encryptedKeyElement = createEncryptedKey(getDocument(), keyEncAlgo);
        if (encKeyId == null || encKeyId.length() == 0) {
            encKeyId = IDGenerator.generateID("EK-");
        }
```

### SizeReplaceableByIsEmpty
`pwType.trim().length() == 0` can be replaced with 'pwType.trim().isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/UsernameTokenValidator.java`
#### Snippet
```java
            verifyDigestPassword(usernameToken, data);
        } else if (WSConstants.PASSWORD_TEXT.equals(pwType)
            || password != null && (pwType == null || pwType.trim().length() == 0)) {
            verifyPlaintextPassword(usernameToken, data);
        } else if (password != null) {
```

### SizeReplaceableByIsEmpty
`user.length() > 0` can be replaced with '!user.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java
        }

        if (!(user != null && user.length() > 0 && password != null && password.length() > 0)) {
            LOG.warn("User or password empty");
            throw new WSSecurityException(WSSecurityException.ErrorCode.FAILED_AUTHENTICATION);
```

### SizeReplaceableByIsEmpty
`password.length() > 0` can be replaced with '!password.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java
        }

        if (!(user != null && user.length() > 0 && password != null && password.length() > 0)) {
            LOG.warn("User or password empty");
            throw new WSSecurityException(WSSecurityException.ErrorCode.FAILED_AUTHENTICATION);
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureConfirmationProcessor.java`
#### Snippet
```java
            new WSSecurityEngineResult(WSConstants.SC, sigConf);
        String tokenId = sigConf.getID();
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`signatureAlgorithm.length() != 0` can be replaced with '!signatureAlgorithm.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

        String signatureAlgorithm = getString(WSHandlerConstants.SIG_ALGO, mc);
        if (signatureAlgorithm != null && signatureAlgorithm.length() != 0) {
            algorithmSuite.addSignatureMethod(signatureAlgorithm);
        }
```

### SizeReplaceableByIsEmpty
`signatureDigestAlgorithm.length() != 0` can be replaced with '!signatureDigestAlgorithm.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
        }
        String signatureDigestAlgorithm = getString(WSHandlerConstants.SIG_DIGEST_ALGO, mc);
        if (signatureDigestAlgorithm != null && signatureDigestAlgorithm.length() != 0) {
            algorithmSuite.addDigestAlgorithm(signatureDigestAlgorithm);
        }
```

### SizeReplaceableByIsEmpty
`encrAlgorithm.length() != 0` can be replaced with '!encrAlgorithm.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

        String encrAlgorithm = getString(WSHandlerConstants.ENC_SYM_ALGO, mc);
        if (encrAlgorithm != null && encrAlgorithm.length() != 0) {
            algorithmSuite.addEncryptionMethod(encrAlgorithm);
        }
```

### SizeReplaceableByIsEmpty
`transportAlgorithm.length() != 0` can be replaced with '!transportAlgorithm.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
        }
        String transportAlgorithm = getString(WSHandlerConstants.ENC_KEY_TRANSPORT, mc);
        if (transportAlgorithm != null && transportAlgorithm.length() != 0) {
            algorithmSuite.addKeyWrapAlgorithm(transportAlgorithm);
        }
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/DerivedKeyTokenProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addTokenElement(elem);
        String tokenId = dkt.getID();
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`type.length() == 0` can be replaced with 'type.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            Element passwordChild = passwordElements.get(0);
            String type = passwordChild.getAttributeNS(null, WSConstants.PASSWORD_TYPE_ATTR);
            if (type == null || type.length() == 0) {
                LOG.debug("The Username Token password does not have a Type attribute");
                bspEnforcer.handleBSPRule(BSPRule.R4201);
```

### SizeReplaceableByIsEmpty
`encodingType.length() == 0` can be replaced with 'encodingType.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            String encodingType = nonce.getAttributeNS(null, "EncodingType");
            // Encoding Type must be equal to Base64Binary
            if (encodingType == null || encodingType.length() == 0) {
                bspEnforcer.handleBSPRule(BSPRule.R4220);
            } else if (!WSConstants.BASE64_ENCODING.equals(encodingType)) {
```

### SizeReplaceableByIsEmpty
`createdString.length() != 0` can be replaced with '!createdString.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
        if (elementCreated != null) {
            String createdString = getCreated();
            if (createdString != null && createdString.length() != 0) {
                try {
                    created = ZonedDateTime.parse(createdString).toInstant();
```

### SizeReplaceableByIsEmpty
`id.length() != 0` can be replaced with '!id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
        // See if the token has been previously processed
        String id = elem.getAttributeNS(WSConstants.WSU_NS, "Id");
        if (id.length() != 0) {
            Element foundElement = data.getWsDocInfo().getTokenElement(id);
            if (elem.equals(foundElement)) {
```

### SizeReplaceableByIsEmpty
`id.length() != 0` can be replaced with '!id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
            new WSSecurityEngineResult(WSConstants.BST, token, certs);
        data.getWsDocInfo().addTokenElement(elem);
        if (id.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, id);
        }
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SecurityContextTokenProcessor.java`
#### Snippet
```java
            result.put(WSSecurityEngineResult.TAG_VALIDATED_TOKEN, Boolean.TRUE);
            String tokenId = sct.getID();
            if (tokenId.length() != 0) {
                result.put(WSSecurityEngineResult.TAG_ID, tokenId);
            }
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/TimestampProcessor.java`
#### Snippet
```java
            new WSSecurityEngineResult(WSConstants.TS, timestamp);
        String tokenId = timestamp.getID();
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`algo.length() == 0` can be replaced with 'algo.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
    public String getAlgorithm() {
        String algo = element.getAttributeNS(ns, "Algorithm");
        if (algo.length() == 0) {
            return ConversationConstants.DerivationAlgorithm.P_SHA_1;
        } else {
```

### SizeReplaceableByIsEmpty
`reference.getURI().length() == 0` can be replaced with 'reference.getURI().isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
            Reference reference = (Reference)refObject;

            if (reference.getURI() == null || reference.getURI().length() == 0
                || reference.getURI().equals(samlAssertion.getId())
                || reference.getURI().equals("#" + samlAssertion.getId())) {
```

### SizeReplaceableByIsEmpty
`id.length() != 0` can be replaced with '!id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
        }

        if (id.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, id);
        }
```

### SizeReplaceableByIsEmpty
`id.length() != 0` can be replaced with '!id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java
        // See if the token has been previously processed
        String id = elem.getAttributeNS(WSConstants.WSU_NS, "Id");
        if (id.length() != 0) {
            Element foundElement = data.getWsDocInfo().getTokenElement(id);
            if (elem.equals(foundElement)) {
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java
        WSSecurityEngineResult result = new WSSecurityEngineResult(action, token);
        String tokenId = token.getID();
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`encryptedDataId.length() != 0` can be replaced with '!encryptedDataId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedDataProcessor.java`
#### Snippet
```java
        WSSecurityEngineResult result =
                new WSSecurityEngineResult(WSConstants.ENCR, Collections.singletonList(dataRef));
        if (encryptedDataId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, encryptedDataId);
        }
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/ReferenceListProcessor.java`
#### Snippet
```java
            new WSSecurityEngineResult(WSConstants.ENCR, dataRefs);
        String tokenId = elem.getAttributeNS(null, "Id");
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`digestAlgorithm.length() != 0` can be replaced with '!digestAlgorithm.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
                String digestAlgorithm = EncryptionUtils.getDigestAlgorithm(encryptedKeyElement);
                String jceDigestAlgorithm = "SHA-1";
                if (digestAlgorithm != null && digestAlgorithm.length() != 0) {
                    jceDigestAlgorithm = JCEMapper.translateURItoJCEID(digestAlgorithm);
                }
```

### SizeReplaceableByIsEmpty
`attribute.length() != 0` can be replaced with '!attribute.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
    ) throws WSSecurityException {
        String attribute = elem.getAttributeNS(null, "Type");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R3209);
        }
```

### SizeReplaceableByIsEmpty
`attribute.length() != 0` can be replaced with '!attribute.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "MimeType");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5622);
        }
```

### SizeReplaceableByIsEmpty
`attribute.length() != 0` can be replaced with '!attribute.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "Encoding");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5623);
        }
```

### SizeReplaceableByIsEmpty
`attribute.length() != 0` can be replaced with '!attribute.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "Recipient");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5602);
        }
```

### SizeReplaceableByIsEmpty
`id.length() != 0` can be replaced with '!id.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        // See if this key has already been processed. If so then just return the result
        String id = elem.getAttributeNS(null, "Id");
        if (id.length() != 0) {
             WSSecurityEngineResult result = data.getWsDocInfo().getResult(id);
             if (result != null
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        result.put(WSSecurityEngineResult.TAG_TOKEN_ELEMENT, elem);
        String tokenId = elem.getAttributeNS(null, "Id");
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`uri.length() != 0` can be replaced with '!uri.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
            String uri = siRef.getURI();

            if (uri.length() != 0) {
                Element se = dereferenceSTR(doc, siRef, requestData, wsDocInfo);
                // If an STR Transform is not used then just find the cached element
```

### SizeReplaceableByIsEmpty
`tokenId.length() != 0` can be replaced with '!tokenId.isEmpty()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        result.put(WSSecurityEngineResult.TAG_CANONICALIZATION_METHOD, c14nMethod);
        String tokenId = elem.getAttributeNS(null, "Id");
        if (tokenId.length() != 0) {
            result.put(WSSecurityEngineResult.TAG_ID, tokenId);
        }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlVersion == SAMLVersion.VERSION_20) {
            id = ((org.opensaml.saml.saml2.core.Assertion)samlObject).getID();
            if (id == null || id.length() == 0) {
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
                id = IDGenerator.generateID("_");
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        } else if (samlVersion == SAMLVersion.VERSION_11) {
            id = ((org.opensaml.saml.saml1.core.Assertion)samlObject).getID();
            if (id == null || id.length() == 0) {
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
                id = IDGenerator.generateID("_");
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
            // If this is the default namespace, note the new in-scope
            // default is here.
            if (prefix.length() == 0) {
                currentDefaultNS = idx;
            }
```

### SizeReplaceableByIsEmpty
`stack[currentDefaultNS].getPrefix().length() == 0` can be replaced with 'stack\[currentDefaultNS\].getPrefix().isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
            while (currentDefaultNS > 0) {
                if (stack[currentDefaultNS] != null
                    && stack[currentDefaultNS].getPrefix().length() == 0) {
                    break;
                }
```

### SizeReplaceableByIsEmpty
`possiblePrefix.length() == 0` can be replaced with 'possiblePrefix.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
            if (map.getNamespaceHash() == hash && map.getNamespaceURI().equals(namespaceURI)) {
                String possiblePrefix = map.getPrefix();
                if (noDefault && possiblePrefix.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`keyAlgorithm.length() == 0` can be replaced with 'keyAlgorithm.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java
            //
            String keyAlgorithm = JCEMapper.getJCEKeyAlgorithmFromURI(algorithm);
            if (keyAlgorithm == null || keyAlgorithm.length() == 0) {
                keyAlgorithm = JCEMapper.translateURItoJCEID(algorithm);
            }
```

### SizeReplaceableByIsEmpty
`identifier.length() != 0` can be replaced with '!identifier.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/MemoryReplayCache.java`
#### Snippet
```java
        processTokenExpiry();

        if (identifier != null && identifier.length() != 0) {
            return ids.contains(identifier);
        }
```

### SizeReplaceableByIsEmpty
`identifier.length() == 0` can be replaced with 'identifier.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/MemoryReplayCache.java`
#### Snippet
```java
     */
    public void add(String identifier, Instant expiry) {
        if (identifier == null || identifier.length() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`elPrefix.length() > 0` can be replaced with '!elPrefix.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DOM2Writer.java`
#### Snippet
```java
                String elPrefix = node.getPrefix();
                String elNamespaceURI = node.getNamespaceURI();
                if (elPrefix != null && elNamespaceURI != null && elPrefix.length() > 0) {
                    boolean prefixIsDeclared = false;
                    try {
```

### SizeReplaceableByIsEmpty
`data.length() > 0` can be replaced with '!data.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DOM2Writer.java`
#### Snippet
```java
                out.print(node.getNodeName());
                String data = node.getNodeValue();
                if (data != null && data.length() > 0) {
                    out.print(' ');
                    out.print(data);
```

### SizeReplaceableByIsEmpty
`uri.length() == 0` can be replaced with 'uri.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/Reference.java`
#### Snippet
```java
        String uri = getURI();
        // Reference URI cannot be null or empty
        if (uri == null || uri.length() == 0) {
            throw new WSSecurityException(
                WSSecurityException.ErrorCode.INVALID_SECURITY, "badReferenceURI"
```

### SizeReplaceableByIsEmpty
`identifier.length() == 0` can be replaced with 'identifier.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheReplayCache.java`
#### Snippet
```java
     */
    public void add(String identifier, Instant expiry) {
        if (identifier == null || identifier.length() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`encoding.length() == 0` can be replaced with 'encoding.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java
        }
        String encoding = getEncodingType();
        if (encoding == null || encoding.length() == 0) {
            bspEnforcer.handleBSPRule(BSPRule.R3029);
        }
```

### SizeReplaceableByIsEmpty
`valueType.length() == 0` can be replaced with 'valueType.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java

        String valueType = getValueType();
        if (valueType == null || valueType.length() == 0) {
            bspEnforcer.handleBSPRule(BSPRule.R3031);
        }
```

### SizeReplaceableByIsEmpty
`attributeNS.length() == 0` can be replaced with 'attributeNS.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                // Try the wsu:Id first
                String attributeNS = se.getAttributeNS(WSU_NS, "Id");
                if (attributeNS.length() == 0 || !id.equals(attributeNS)) {
                    attributeNS = se.getAttributeNS(null, "Id");
                }
```

### SizeReplaceableByIsEmpty
`attributeNS.length() != 0` can be replaced with '!attributeNS.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                    attributeNS = se.getAttributeNS(null, "Id");
                }
                if (attributeNS.length() != 0 && id.equals(attributeNS)) {
                    if (!checkMultipleElements) {
                        return se;
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        }
        String id = ref.trim();
        if (id.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`namespace.length() == 0` can be replaced with 'namespace.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }

                if ((namespace == null || namespace.length() == 0)
                    && (ns == null || ns.length() == 0)) {
                    return (Element)startNode;
```

### SizeReplaceableByIsEmpty
`ns.length() == 0` can be replaced with 'ns.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

                if ((namespace == null || namespace.length() == 0)
                    && (ns == null || ns.length() == 0)) {
                    return (Element)startNode;
                }
```

### SizeReplaceableByIsEmpty
`namespace.length() == 0` can be replaced with 'namespace.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }

                if ((namespace == null || namespace.length() == 0)
                    && (ns == null || ns.length() == 0)) {
                    foundNodes.add((Element)startNode);
```

### SizeReplaceableByIsEmpty
`ns.length() == 0` can be replaced with 'ns.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

                if ((namespace == null || namespace.length() == 0)
                    && (ns == null || ns.length() == 0)) {
                    foundNodes.add((Element)startNode);
                }
```

### SizeReplaceableByIsEmpty
`sourceMethod.length() != 0` can be replaced with '!sourceMethod.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML1ComponentBuilder.java`
#### Snippet
```java
        if ("Password".equals(sourceMethod)) {
            transformedMethod = SAML1Constants.AUTH_METHOD_PASSWORD;
        } else if (sourceMethod != null && sourceMethod.length() != 0) {
            return sourceMethod;
        }
```

### SizeReplaceableByIsEmpty
`valueType.length() == 0` can be replaced with 'valueType.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            String valueType = getKeyIdentifierValueType();
            // ValueType cannot be null
            if (valueType == null || valueType.length() == 0) {
                bspEnforcer.handleBSPRule(BSPRule.R3054);
            }
```

### SizeReplaceableByIsEmpty
`encodingType.length() != 0` can be replaced with '!encodingType.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            String encodingType = getFirstElement().getAttributeNS(null, "EncodingType");
            // Encoding Type must be equal to Base64Binary if it's specified
            if (encodingType.length() != 0 && !WSS4JConstants.BASE64_ENCODING.equals(encodingType)) {
                bspEnforcer.handleBSPRule(BSPRule.R3071);
            }
```

### SizeReplaceableByIsEmpty
`encodingType.length() == 0` can be replaced with 'encodingType.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            if (!WSS4JConstants.WSS_SAML_KI_VALUE_TYPE.equals(valueType)
                && !WSS4JConstants.WSS_SAML2_KI_VALUE_TYPE.equals(valueType)
                && encodingType.length() == 0) {
                bspEnforcer.handleBSPRule(BSPRule.R3070);
            }
```

### SizeReplaceableByIsEmpty
`sourceMethod.length() != 0` can be replaced with '!sourceMethod.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
        if ("Password".equalsIgnoreCase(sourceMethod)) {
            transformedMethod = SAML2Constants.AUTH_CONTEXT_CLASS_REF_PASSWORD;
        } else if (sourceMethod != null && sourceMethod.length() != 0) {
            return sourceMethod;
        }
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinDevice.java`
#### Snippet
```java
                X509CRL crl = (X509CRL)cf.generateCRL(is);

                if (provider == null || provider.length() == 0) {
                    crlCertStore =
                        CertStore.getInstance(
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
            } else {
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
        try {
            String provider = getCryptoProvider();
            if (provider == null || provider.length() == 0) {
                certificateFactory = CertificateFactory.getInstance("X.509");
            } else {
```

### SizeReplaceableByIsEmpty
`label.length() == 0` can be replaced with 'label.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/derivedKey/DerivedKeyUtils.java`
#### Snippet
```java
        DerivationAlgorithm algo = AlgoFactory.getInstance(algorithm);
        byte[] labelBytes;
        if (label == null || label.length() == 0) {
            String defaultLabel = ConversationConstants.DEFAULT_LABEL + ConversationConstants.DEFAULT_LABEL;
            labelBytes = defaultLabel.getBytes(StandardCharsets.UTF_8);
```

### SizeReplaceableByIsEmpty
`attName.getNamespaceURI().length() == 0` can be replaced with 'attName.getNamespaceURI().isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
    public static String getAttribute(Element element, QName attName) {
        Attr attr;
        if (attName.getNamespaceURI() == null || attName.getNamespaceURI().length() == 0) {
            attr = element.getAttributeNode(attName.getLocalPart());
        } else {
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
            } else {
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/SP12Constants.java`
#### Snippet
```java
    @Override
    public IncludeTokenType getInclusionFromAttributeValue(String value) {
        if (value == null || value.length() == 0) {
            return IncludeTokenType.INCLUDE_TOKEN_ALWAYS;
        } else if (INCLUDE_ALWAYS.equals(value)) {
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/SP11Constants.java`
#### Snippet
```java
    @Override
    public IncludeTokenType getInclusionFromAttributeValue(String value) throws IllegalArgumentException {
        if (value == null || value.length() == 0) {
            return IncludeTokenType.INCLUDE_TOKEN_ALWAYS;
        } else if (INCLUDE_ALWAYS.equals(value)) {
```

### SizeReplaceableByIsEmpty
`stack[currentDefaultNS].getPrefix().length() == 0` can be replaced with 'stack\[currentDefaultNS\].getPrefix().isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
            while (currentDefaultNS > 0) {
                if (stack[currentDefaultNS] != null
                    && stack[currentDefaultNS].getPrefix().length() == 0) {
                    break;
                }
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
            // If this is the default namespace, note the new in-scope
            // default is here.
            if (prefix.length() == 0) {
                currentDefaultNS = idx;
            }
```

### SizeReplaceableByIsEmpty
`possiblePrefix.length() == 0` can be replaced with 'possiblePrefix.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
            if (map.getNamespaceHash() == hash && map.getNamespaceURI().equals(namespaceURI)) {
                String possiblePrefix = map.getPrefix();
                if (noDefault && possiblePrefix.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`elPrefix.length() > 0` can be replaced with '!elPrefix.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
                String elPrefix = node.getPrefix();
                String elNamespaceURI = node.getNamespaceURI();
                if (elPrefix != null && elNamespaceURI != null && elPrefix.length() > 0) {
                    boolean prefixIsDeclared = false;
                    try {
```

### SizeReplaceableByIsEmpty
`data.length() > 0` can be replaced with '!data.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
                out.print(node.getNodeName());
                String data = node.getNodeValue();
                if (data != null && data.length() > 0) {
                    out.print(' ');
                    out.print(data);
```

### SizeReplaceableByIsEmpty
`keystoreProvider.length() == 0` can be replaced with 'keystoreProvider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            keystoreProvider = keystoreProvider.trim();

            if (keystoreProvider.length() == 0) {
                keystoreProvider = null;
            }
```

### SizeReplaceableByIsEmpty
`trustProvider.length() == 0` can be replaced with 'trustProvider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            trustProvider = trustProvider.trim();

            if (trustProvider.length() == 0) {
                trustProvider = null;
            } else {
```

### SizeReplaceableByIsEmpty
`keystoreProvider.length() == 0` can be replaced with 'keystoreProvider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            }
            try {
                if (keystoreProvider == null || keystoreProvider.length() == 0) {
                    crlCertStore =
                            CertStore.getInstance(
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        try {
            if (provider == null || provider.length() == 0) {
                if (keyStoreProvider != null && keyStoreProvider.length() != 0) {
                    try {
```

### SizeReplaceableByIsEmpty
`keyStoreProvider.length() != 0` can be replaced with '!keyStoreProvider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
        try {
            if (provider == null || provider.length() == 0) {
                if (keyStoreProvider != null && keyStoreProvider.length() != 0) {
                    try {
                        certificateFactory =
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        try {
            if (provider == null || provider.length() == 0) {
                ks = KeyStore.getInstance(type);
            } else {
```

### SizeReplaceableByIsEmpty
`storepass.length() == 0` can be replaced with 'storepass.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            }

            ks.load(input, storepass == null || storepass.length() == 0
                ? new char[0] : storepass.toCharArray());
        } catch (IOException | GeneralSecurityException e) {
```

### SizeReplaceableByIsEmpty
`provider.length() == 0` can be replaced with 'provider.isEmpty()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
            } else {
```

### SizeReplaceableByIsEmpty
`headerName.length() == 0` can be replaced with 'headerName.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/builders/RequiredPartsBuilder.java`
#### Snippet
```java
                    && spVersion.getNamespace().equals(child.getNamespaceURI())) {
                String headerName = child.getAttributeNS(null, SPConstants.NAME);
                if (headerName.length() == 0) {
                    if (ignoreNameElement) {
                        headerName = null;
```

### SizeReplaceableByIsEmpty
`headerNamespace.length() == 0` can be replaced with 'headerNamespace.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/builders/RequiredPartsBuilder.java`
#### Snippet
```java
                }
                String headerNamespace = child.getAttributeNS(null, SPConstants.NAMESPACE);
                if (headerNamespace == null || headerNamespace.length() == 0) {
                    throw new IllegalArgumentException(SPConstants.ERR_INVALID_POLICY);
                }
```

### SizeReplaceableByIsEmpty
`filter.length() == 0` can be replaced with 'filter.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
                addDeclaredNamespaces(child, declaredNamespaces);
                String filter = child.getAttributeNS(null, SPConstants.FILTER);
                if (filter == null || filter.length() == 0) {
                    throw new IllegalArgumentException(SPConstants.ERR_INVALID_POLICY);
                }
```

### SizeReplaceableByIsEmpty
`xPathVersion.length() == 0` can be replaced with 'xPathVersion.isEmpty()'
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
    protected String getXPathVersion(Element element) {
        String xPathVersion = element.getAttributeNS(null, SPConstants.XPATH_VERSION);
        if (xPathVersion == null || xPathVersion.length() == 0) {
            xPathVersion = "1.0";
        }
```

### SizeReplaceableByIsEmpty
`created.length() != 0` can be replaced with '!created.isEmpty()'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/UsernameTokenOutputProcessor.java`
#### Snippet
```java
                }

                if (created != null && created.length() != 0) {
                    createStartElementAndOutputAsEvent(subOutputProcessorChain, WSSConstants.TAG_WSU_CREATED, false, null);
                    createCharactersAndOutputAsEvent(subOutputProcessorChain, created);
```

### SizeReplaceableByIsEmpty
`valueType.length() != 0` can be replaced with '!valueType.isEmpty()'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            if (WSSecurityTokenConstants.SAML_20_TOKEN.equals(samlTokenType)) {
                String valueType = referenceType.getValueType();
                if (valueType != null && valueType.length() != 0) {
                    ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R6614);
                }
```

### SizeReplaceableByIsEmpty
`actionToParse.length() == 0` can be replaced with 'actionToParse.isEmpty()'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
        }
        actionToParse = actionToParse.trim();
        if (actionToParse.length() == 0) {
            return;
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder suffix` can be replaced with 'String'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        int insertionIndex = str.indexOf('>');
        StringBuilder prefix = new StringBuilder(str.substring(0, insertionIndex));
        StringBuilder suffix = new StringBuilder(str.substring(insertionIndex, str.length()));

        // Don't add more than 20 prefixes
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            securityEventQueue.clear();

            return;
        } else {
            securityEventQueue.push(securityEvent);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
        }
        if (top == 0) {
            return;
        }
    }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasDerivedKeys &= hasDerivedKeys(wrappedSecurityToken)`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
        for (int i = 0; i < securityToken.getWrappedTokens().size(); i++) {
            SecurityToken wrappedSecurityToken = securityToken.getWrappedTokens().get(i);
            hasDerivedKeys &= hasDerivedKeys(wrappedSecurityToken);
        }
        return hasDerivedKeys;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `asserted &= assertToken(tokenSecurityEvent, abstractToken)`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
        }

        asserted &= assertToken(tokenSecurityEvent, abstractToken);
        if (asserted) {
            setAsserted(true);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `body |= !SPUtils.hasChildElements(element)`
in `policy/src/main/java/org/apache/wss4j/policy/builders/EncryptedPartsBuilder.java`
#### Snippet
```java
        final List<Header> headers = getHeaders(element, true, spVersion);
        final Attachments attachments = getAttachments(element, spVersion);
        body |= !SPUtils.hasChildElements(element);

        EncryptedParts encryptedParts = new EncryptedParts(spVersion, body, attachments, headers);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `body |= signAllHeaders`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedPartsBuilder.java`
#### Snippet
```java
        final Attachments attachments = getAttachments(element, spVersion);
        final boolean signAllHeaders = !SPUtils.hasChildElements(element);
        body |= signAllHeaders;
        SignedParts signedParts = new SignedParts(spVersion, body, attachments, headers, signAllHeaders);
        signedParts.setOptional(SPUtils.isOptional(element));
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java
            keySpec =
                new SecretKeySpec(
                    rawKey, 0, rawKey.length > size ? size : rawKey.length, keyAlgorithm
                );
        } else if (rawKey.length > MAX_SYMMETRIC_KEY_SIZE) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
     */
    public void addIteration(Document doc, int iteration) {
        String text = "" + iteration;
        elementIteration =
            doc.createElementNS(
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java

        // Test for replay attacks
        String identifier = timeStamp.getCreatedString() + "" + Arrays.hashCode(signatureValue)
            + "" + Arrays.hashCode(key.getEncoded());

```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        // Test for replay attacks
        String identifier = timeStamp.getCreatedString() + "" + Arrays.hashCode(signatureValue)
            + "" + Arrays.hashCode(key.getEncoded());

        if (replayCache.contains(identifier)) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
            final String cacheKey =
                    timestampSecurityEvent.getCreated().get(ChronoField.MILLI_OF_SECOND)
                    + "" + Arrays.hashCode(getSignatureType().getSignatureValue().getValue());
            if (replayCache.contains(cacheKey)) {
                throw new WSSecurityException(WSSecurityException.ErrorCode.MESSAGE_EXPIRED);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/UsernameTokenOutputProcessor.java`
#### Snippet
```java
                    if (iterations > 0) {
                        createStartElementAndOutputAsEvent(subOutputProcessorChain, WSSConstants.TAG_WSSE11_ITERATION, true, null);
                        createCharactersAndOutputAsEvent(subOutputProcessorChain, "" + iterations);
                        createEndElementAndOutputAsEvent(subOutputProcessorChain, WSSConstants.TAG_WSSE11_ITERATION);
                    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                        getSecurityProperties().isUseSingleCert());
                createStartElementAndOutputAsEvent(subOutputProcessorChain, getOffsetName(), false, null);
                createCharactersAndOutputAsEvent(subOutputProcessorChain, "" + offset);
                createEndElementAndOutputAsEvent(subOutputProcessorChain, getOffsetName());
                createStartElementAndOutputAsEvent(subOutputProcessorChain, getLengthName(), false, null);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                createEndElementAndOutputAsEvent(subOutputProcessorChain, getOffsetName());
                createStartElementAndOutputAsEvent(subOutputProcessorChain, getLengthName(), false, null);
                createCharactersAndOutputAsEvent(subOutputProcessorChain, "" + length);
                createEndElementAndOutputAsEvent(subOutputProcessorChain, getLengthName());
                createStartElementAndOutputAsEvent(subOutputProcessorChain, getNonceName(), false, null);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java

        //prevent recursive key reference DOS:
        Integer invokeCount = inboundSecurityContext.<Integer>get("" + Thread.currentThread().hashCode());
        if (invokeCount == null) {
            invokeCount = 0;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            throw new WSSecurityException(WSSecurityException.ErrorCode.INVALID_SECURITY_TOKEN);
        }
        inboundSecurityContext.put("" + Thread.currentThread().hashCode(), invokeCount);

        SecurityTokenProvider<? extends InboundSecurityToken> securityTokenProvider =
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            throw new WSSecurityException(WSSecurityException.ErrorCode.INVALID_SECURITY, "noKeyinfo");
        } finally {
            inboundSecurityContext.remove("" + Thread.currentThread().hashCode());
        }
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CryptoFactory` has no concrete subclass
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
 * CryptoFactory.
 */
public abstract class CryptoFactory {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CryptoFactory.class);
```

### AbstractClassNeverImplemented
Abstract class `WSSecurityEventConstants` has no concrete subclass
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants.java`
#### Snippet
```java
import org.apache.xml.security.stax.securityEvent.SecurityEventConstants;

public abstract class WSSecurityEventConstants extends SecurityEventConstants { //NOPMD

    public static final Event NO_SECURITY = new Event("NoSecurity");
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Assertion`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    }

    private void addAssertionState(Map<Assertion, List<Assertable>> assertables,
                                   Assertion keyAssertion,
                                   Assertable assertable) {
```

### BoundedWildcard
Can generalize to `? extends Map`>>
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    private void buildAssertionStateMap(
            PolicyComponent policyComponent,
            List<Map<SecurityEventConstants.Event,
            Map<Assertion, List<Assertable>>>> assertionStateMap,
            int alternative
    ) throws WSSPolicyException {
```

### BoundedWildcard
Can generalize to `? extends WSSecurityEngineResult`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/SignatureUtils.java`
#### Snippet
```java
    }

    public static void verifySignedElement(Element elem, List<WSSecurityEngineResult> signedResults)
        throws WSSecurityException {
        if (signedResults != null) {
```

### BoundedWildcard
Can generalize to `? extends WSSecurityEngineResult`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/DOMSAMLUtil.java`
#### Snippet
```java
    public static boolean compareCredentials(
        SAMLKeyInfo subjectKeyInfo,
        List<WSSecurityEngineResult> signedResults,
        Certificate[] tlsCerts
    ) {
```

### BoundedWildcard
Can generalize to `? extends WSSecurityEngineResult`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/DOMSAMLUtil.java`
#### Snippet
```java
        SamlAssertionWrapper assertionWrapper,
        Element body,
        List<WSSecurityEngineResult> signed
    ) {
        for (WSSecurityEngineResult signedResult : signed) {
```

### BoundedWildcard
Can generalize to `? extends Element`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
    }

    public static void inlineAttachments(List<Element> includeElements,
                                         CallbackHandler attachmentCallbackHandler,
                                         boolean removeAttachments) throws WSSecurityException {
```

### BoundedWildcard
Can generalize to `? extends javax.xml.crypto.dsig.Reference`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
     */
    public void computeSignature(
        List<javax.xml.crypto.dsig.Reference> referenceList,
        Element siblingElement
    ) throws WSSecurityException {
```

### BoundedWildcard
Can generalize to `? extends WSEncryptionPart`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
    public List<javax.xml.crypto.dsig.Reference> addReferencesToSign(
        Document doc,
        List<WSEncryptionPart> references,
        WSDocInfo wsDocInfo,
        XMLSignatureFactory signatureFactory,
```

### BoundedWildcard
Can generalize to `? extends javax.xml.crypto.dsig.Reference`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
     */
    public void computeSignature(
        List<javax.xml.crypto.dsig.Reference> referenceList,
        boolean prepend,
        Element siblingElement
```

### BoundedWildcard
Can generalize to `? extends javax.xml.crypto.dsig.Reference`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
     */
    public void computeSignature(
        List<javax.xml.crypto.dsig.Reference> referenceList,
        boolean prepend,
        Element siblingElement
```

### BoundedWildcard
Can generalize to `? super String`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        String encryptionAlgorithm,
        WSEncryptionPart attachmentEncryptionPart,
        List<String> encDataRef,
        List<Element> attachmentEncryptedDataElements
    ) throws WSSecurityException {
```

### BoundedWildcard
Can generalize to `? super Element`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        WSEncryptionPart attachmentEncryptionPart,
        List<String> encDataRef,
        List<Element> attachmentEncryptedDataElements
    ) throws WSSecurityException {
        if (attachmentCallbackHandler == null) {
```

### BoundedWildcard
Can generalize to `? extends WSEncryptionPart`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        SecretKey secretKey,
        String encryptionAlgorithm,
        List<WSEncryptionPart> references,
        List<Element> attachmentEncryptedDataElements
    ) throws WSSecurityException {
```

### BoundedWildcard
Can generalize to `? extends WSSecurityEngineResult`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

    protected boolean checkReceiverResults(
        List<WSSecurityEngineResult> wsResult, List<Integer> actions
    ) {
        int size = actions.size();
```

### BoundedWildcard
Can generalize to `? extends WSSecurityEngineResult`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

    protected boolean checkReceiverResultsAnyOrder(
        List<WSSecurityEngineResult> wsResult, List<Integer> actions
    ) {
        List<Integer> recordedActions = new ArrayList<>(actions.size());
```

### BoundedWildcard
Can generalize to `? super WSEncryptionPart`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

    private void splitEncParts(boolean required, String tmpS,
                               List<WSEncryptionPart> parts, RequestData reqData)
        throws WSSecurityException {
        WSEncryptionPart encPart = null;
```

### BoundedWildcard
Can generalize to `? extends HandlerAction`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

    private HandlerAction getSignatureActionThatSignsATimestamp(
        List<HandlerAction> actions, RequestData reqData
    ) {
        for (HandlerAction action : actions) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
    public static <T> Class<? extends T> loadClass(String clazz,
                                                   boolean warn,
                                                   Class<T> type) throws ClassNotFoundException {
        return loadClass(clazz, warn).asSubclass(type);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
     * @throws ClassNotFoundException
     */
    public static <T> Class<? extends T> loadClass(String clazz, Class<T> type)
            throws ClassNotFoundException {
        return loadClass(clazz, true, type);
```

### BoundedWildcard
Can generalize to `? extends T`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
    public static <T> Class<? extends T> loadClass(ClassLoader loader,
                                                   String clazz,
                                                   Class<T> type) throws ClassNotFoundException {
        try {
            if (loader != null) {
```

### BoundedWildcard
Can generalize to `? extends AuthenticationStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML1ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AuthenticationStatement> createSamlv1AuthenticationStatement(
        List<AuthenticationStatementBean> authBeans
    ) throws org.opensaml.security.SecurityException, WSSecurityException {
        List<AuthenticationStatement> authenticationStatements = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends AuthDecisionStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML1ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AuthorizationDecisionStatement> createSamlv1AuthorizationDecisionStatement(
            List<AuthDecisionStatementBean> decisionData)
        throws org.opensaml.security.SecurityException, WSSecurityException {
        List<AuthorizationDecisionStatement> authDecisionStatements = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends AttributeStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML1ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AttributeStatement> createSamlv1AttributeStatement(
        List<AttributeStatementBean> attributeData
    ) throws org.opensaml.security.SecurityException, WSSecurityException {
        if (attributeStatementV1Builder == null) {
```

### BoundedWildcard
Can generalize to `? extends AttributeStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AttributeStatement> createAttributeStatement(
        List<AttributeStatementBean> attributeData
    ) {
        List<AttributeStatement> attributeStatements = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends AuthDecisionStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AuthzDecisionStatement> createAuthorizationDecisionStatement(
        List<AuthDecisionStatementBean> decisionData
    ) {
        List<AuthzDecisionStatement> authDecisionStatements = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends AuthenticationStatementBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static List<AuthnStatement> createAuthnStatement(
        List<AuthenticationStatementBean> authBeans
    ) {
        List<AuthnStatement> authnStatements = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends DelegateBean`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static DelegationRestrictionType createDelegationRestriction(
        List<DelegateBean> delegates
    ) {
        if (delegationRestrictionBuilder == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java

    public static void readAndReplaceEncryptedAttachmentHeaders(
            Map<String, String> headers, InputStream attachmentInputStream) throws IOException, WSSecurityException {

        //read and replace headers
```

### BoundedWildcard
Can generalize to `? super String`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java

    public static void readAndReplaceEncryptedAttachmentHeaders(
            Map<String, String> headers, InputStream attachmentInputStream) throws IOException, WSSecurityException {

        //read and replace headers
```

### BoundedWildcard
Can generalize to `? extends List`
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSecurityAssertion.java`
#### Snippet
```java
    }

    public boolean isAsserted(Map<QName, List<AssertionState>> assertionStatesMap) {
        List<AssertionState> assertionStateList = assertionStatesMap.get(getName());
        if (assertionStateList != null) {
```

### BoundedWildcard
Can generalize to `? extends Header`
in `policy/src/main/java/org/apache/wss4j/policy/model/RequiredParts.java`
#### Snippet
```java
    private final List<Header> headers = new ArrayList<>();

    public RequiredParts(SPConstants.SPVersion version, List<Header> headers) {
        super(version);
        this.headers.addAll(headers);
```

### BoundedWildcard
Can generalize to `? extends XPath`
in `policy/src/main/java/org/apache/wss4j/policy/model/RequiredElements.java`
#### Snippet
```java
    private final List<XPath> xPaths = new ArrayList<>();

    public RequiredElements(SPConstants.SPVersion version, String xPathVersion, List<XPath> xPaths) {
        super(version);

```

### BoundedWildcard
Can generalize to `? super TrustAnchor`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
     * @throws KeyStoreException if a problem occurs accessing the keyStore
     */
    protected void addTrustAnchors(Set<TrustAnchor> set, KeyStore keyStore)
            throws KeyStoreException, WSSecurityException {
        Enumeration<String> aliases = keyStore.aliases();
```

### BoundedWildcard
Can generalize to `? super String`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
    }

    protected void addDeclaredNamespaces(Element element, Map<String, String> declaredNamespaces) {
        if (element.getParentNode() != null && element.getParentNode() instanceof Element) {
            addDeclaredNamespaces((Element) element.getParentNode(), declaredNamespaces);
```

### BoundedWildcard
Can generalize to `? super String`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
    }

    protected void addDeclaredNamespaces(Element element, Map<String, String> declaredNamespaces) {
        if (element.getParentNode() != null && element.getParentNode() instanceof Element) {
            addDeclaredNamespaces((Element) element.getParentNode(), declaredNamespaces);
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler.java`
#### Snippet
```java

    private void checkBSPCompliance(InputProcessorChain inputProcessorChain, UsernameTokenType usernameTokenType,
                                    List<XMLSecEvent> xmlSecEvents) throws WSSecurityException {

        final WSInboundSecurityContext securityContext = (WSInboundSecurityContext) inputProcessorChain.getSecurityContext();
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
            InputProcessorChain subInputProcessorChain,
            InternalSecurityHeaderBufferProcessor internalSecurityHeaderBufferProcessor,
            Deque<XMLSecEvent> xmlSecEventList) {

        subInputProcessorChain.removeProcessor(internalSecurityHeaderBufferProcessor);
```

### BoundedWildcard
Can generalize to `? extends InboundSecurityToken`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityContextTokenInputHandler.java`
#### Snippet
```java

    private SecurityContextTokenSecurityEvent createTokenSecurityEvent(AbstractSecurityContextTokenType securityContextTokenType,
                                                                       SecurityTokenProvider<InboundSecurityToken> securityTokenProvider)
            throws XMLSecurityException {
        SecurityContextTokenSecurityEvent securityContextTokenSecurityEvent = new SecurityContextTokenSecurityEvent();
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/TimestampInputHandler.java`
#### Snippet
```java

    private void checkBSPCompliance(InputProcessorChain inputProcessorChain, TimestampType timestampType,
                                    List<XMLSecEvent> xmlSecEvents) throws WSSecurityException {
        final WSInboundSecurityContext securityContext = (WSInboundSecurityContext) inputProcessorChain.getSecurityContext();
        if (timestampType.getCreated() == null) {
```

### BoundedWildcard
Can generalize to `? extends InboundSecurityToken`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
        SAMLTokenVerifierInputProcessor(XMLSecurityProperties securityProperties,
                                        SamlAssertionWrapper samlAssertionWrapper,
                                        SecurityTokenProvider<InboundSecurityToken> securityTokenProvider,
                                        InboundSecurityToken subjectSecurityToken,
                                        boolean soap12) {
```

### BoundedWildcard
Can generalize to `? extends TokenSecurityEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java

    private void removeTokenSecurityEvent(TokenSecurityEvent<? extends InboundSecurityToken> tokenSecurityEvent,
                                          List<TokenSecurityEvent<? extends InboundSecurityToken>> tokenSecurityEventList) {
        for (int i = 0; i < tokenSecurityEventList.size(); i++) {
            TokenSecurityEvent<? extends InboundSecurityToken> securityEvent = tokenSecurityEventList.get(i);
```

### BoundedWildcard
Can generalize to `? extends TokenSecurityEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    }

    private void setTokenUsage(List<TokenSecurityEvent<? extends InboundSecurityToken>> tokenSecurityEvents,
                               WSSecurityTokenConstants.TokenUsage tokenUsage) throws XMLSecurityException {
        for (int i = 0; i < tokenSecurityEvents.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends TokenSecurityEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    private TokenSecurityEvent<? extends InboundSecurityToken> getTokenSecurityEvent(
            InboundSecurityToken securityToken,
            List<TokenSecurityEvent<? extends InboundSecurityToken>> tokenSecurityEvents) throws XMLSecurityException {
        if (securityToken != null) {
            for (int i = 0; i < tokenSecurityEvents.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends TokenSecurityEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    }

    private boolean containsSecurityToken(List<TokenSecurityEvent<? extends InboundSecurityToken>> supportingTokens,
                                          SecurityToken securityToken) {
        if (securityToken != null) {
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/TokenContext.java`
#### Snippet
```java

    public TokenContext(WSSSecurityProperties wssSecurityProperties, WSInboundSecurityContext wsInboundSecurityContext,
                        List<XMLSecEvent> xmlSecEvents, List<QName> elementPath) {

        this.wssSecurityProperties = wssSecurityProperties;
```

### BoundedWildcard
Can generalize to `? super Class`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
    }

    private static void getImplementedInterfaces(Class<?> clazz, List<Class<?>> interfaceList) {
        if (clazz == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends QName`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
    }

    public static boolean isInSecurityHeader(XMLSecEvent xmlSecEvent, List<QName> elementPath, String actorOrRole) {
        if (elementPath.size() > 2) {
            final QName secondLevelElementName = elementPath.get(1);
```

### BoundedWildcard
Can generalize to `? extends QName`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
    }

    public static boolean isInSOAPBody(List<QName> elementPath) {
        if (elementPath.size() > 1) {
            final QName secondLevelElementName = elementPath.get(1);
```

### BoundedWildcard
Can generalize to `? extends QName`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
    }

    public static boolean isInSOAPHeader(List<QName> elementPath) {
        if (elementPath.size() > 1) {
            final QName secondLevelElementName = elementPath.get(1);
```

### BoundedWildcard
Can generalize to `? extends SecurityEventListener`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java
    public XMLStreamReader processInMessage(
            XMLStreamReader xmlStreamReader, List<SecurityEvent> requestSecurityEvents,
            List<SecurityEventListener> securityEventListeners) throws XMLStreamException, WSSecurityException {

        if (requestSecurityEvents == null) {
```

### BoundedWildcard
Can generalize to `? super SecurePart`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
    }

    private static void splitEncParts(String tmpS, List<SecurePart> parts, String soapNS) {
        SecurePart encPart = null;
        String[] rawParts = tmpS.split(";");
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    private final static QName _Nonce_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Nonce");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    private final static QName _Nonce_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Nonce");

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    private final static QName _Nonce_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Nonce");

```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
public class ObjectFactory {

    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java

    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
```

### MissortedModifiers
Missorted modifiers `final static`
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/ObjectFactory.java`
#### Snippet
```java
    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosContext.java`
#### Snippet
```java
        if (!disposed) {
            if (kerberosToken != null) {
                for (int i = 0; i < kerberosToken.length; i++) {
                    kerberosToken[i] = 0;
                }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheReplayCache.java`
#### Snippet
```java
                    File file = diskstorePath.toFile();
                    if (file.exists() && file.canWrite()) {
                        file.delete();
                    }
                }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/EncryptedKeySTRParser.java`
#### Snippet
```java

        Integer action = (Integer) result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null && WSConstants.BST == action.intValue()) {
            BinarySecurity token =
                (BinarySecurity)result.get(
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/EncryptedKeySTRParser.java`
#### Snippet
```java
            parserResult.setCerts(certs);
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/EncryptedKeySTRParser.java`
#### Snippet
```java
            parserResult.setCerts(certs);
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java

        Integer action = (Integer) result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null && WSConstants.ENCR == action.intValue()) {
            STRParserUtil.checkEncryptedKeyBSPCompliance(secRef, data.getBSPEnforcer());
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
        } else if (action != null && WSConstants.DKT == action.intValue()) {
            DerivedKeyToken dkt =
                (DerivedKeyToken)result.get(WSSecurityEngineResult.TAG_DERIVED_KEY_TOKEN);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setPrincipal(dkt.createPrincipal());
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setPrincipal(dkt.createPrincipal());
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.SCT == action.intValue() || WSConstants.BST == action.intValue())) {
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.SCT == action.intValue() || WSConstants.BST == action.intValue())) {
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());
            UsernameToken usernameToken =
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());
            UsernameToken usernameToken =
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
        Integer action = (Integer)result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
        Integer action = (Integer)result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
        } else if (action != null && WSConstants.ENCR == action.intValue()) {
            STRParserUtil.checkEncryptedKeyBSPCompliance(secRef, data.getBSPEnforcer());
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
        } else if (action != null && (WSConstants.SCT == action.intValue() || WSConstants.BST == action.intValue())) {
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
        } else if (action != null && (WSConstants.SCT == action.intValue() || WSConstants.BST == action.intValue())) {
            byte[] secretKey = (byte[])result.get(WSSecurityEngineResult.TAG_SECRET);
            parserResult.setSecretKey(secretKey);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/DerivedKeyTokenSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(secretKey);
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureConfirmationAction.java`
#### Snippet
```java
                // See if it's a signature action
                if (resultAction != null
                    && (WSConstants.SIGN == resultAction.intValue()
                        || WSConstants.ST_SIGNED == resultAction.intValue()
                        || WSConstants.UT_SIGN == resultAction.intValue())) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureConfirmationAction.java`
#### Snippet
```java
                if (resultAction != null
                    && (WSConstants.SIGN == resultAction.intValue()
                        || WSConstants.ST_SIGNED == resultAction.intValue()
                        || WSConstants.UT_SIGN == resultAction.intValue())) {
                    byte[] sigVal = (byte[]) result.get(WSSecurityEngineResult.TAG_SIGNATURE_VALUE);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureConfirmationAction.java`
#### Snippet
```java
                    && (WSConstants.SIGN == resultAction.intValue()
                        || WSConstants.ST_SIGNED == resultAction.intValue()
                        || WSConstants.UT_SIGN == resultAction.intValue())) {
                    byte[] sigVal = (byte[]) result.get(WSSecurityEngineResult.TAG_SIGNATURE_VALUE);
                    wsc.build(sigVal);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
        Integer action = (Integer) result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
        Integer action = (Integer) result.get(WSSecurityEngineResult.TAG_ACTION);
        if (action != null
            && (WSConstants.UT_NOPASSWORD == action.intValue() || WSConstants.UT == action.intValue())) {
            STRParserUtil.checkUsernameTokenBSPCompliance(secRef, data.getBSPEnforcer());

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java

            parserResult.setPrincipal(usernameToken.createPrincipal());
        } else if (action != null && WSConstants.BST == action.intValue()) {
            BinarySecurity token =
                (BinarySecurity)result.get(
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                parserResult.setTrustedCredential(true);
            }
        } else if (action != null && WSConstants.ENCR == action.intValue()) {
            STRParserUtil.checkEncryptedKeyBSPCompliance(secRef, data.getBSPEnforcer());

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
            String id = (String)result.get(WSSecurityEngineResult.TAG_ID);
            parserResult.setPrincipal(new CustomTokenPrincipal(id));
        } else if (action != null && WSConstants.SCT == action.intValue()) {
            parserResult.setSecretKey((byte[])result.get(WSSecurityEngineResult.TAG_SECRET));
            SecurityContextToken sct =
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                );
            parserResult.setPrincipal(new CustomTokenPrincipal(sct.getIdentifier()));
        } else if (action != null && WSConstants.DKT == action.intValue()) {
            DerivedKeyToken dkt =
                (DerivedKeyToken)result.get(WSSecurityEngineResult.TAG_DERIVED_KEY_TOKEN);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(dkt.deriveKey(keyLength, secret));
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
            parserResult.setSecretKey(dkt.deriveKey(keyLength, secret));
        } else if (action != null
            && (WSConstants.ST_UNSIGNED == action.intValue() || WSConstants.ST_SIGNED == action.intValue())) {
            SamlAssertionWrapper samlAssertion =
                (SamlAssertionWrapper)result.get(WSSecurityEngineResult.TAG_SAML_ASSERTION);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            for (WSSecurityEngineResult wser : wsSecEngineResults) {
                Integer wserAction = (Integer) wser.get(WSSecurityEngineResult.TAG_ACTION);
                if (wserAction != null && wserAction.intValue() == WSConstants.SIGN) {
                    X509Certificate cert =
                        (X509Certificate)wser.get(WSSecurityEngineResult.TAG_X509_CERTIFICATE);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getSecurityEventType()` is identical to its super method
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SecureConversationTokenAssertionState.java`
#### Snippet
```java

    @Override
    public SecurityEventConstants.Event[] getSecurityEventType() {
        return new SecurityEventConstants.Event[]{
                WSSecurityEventConstants.SECURITY_CONTEXT_TOKEN
```

### RedundantMethodOverride
Method `isFeatureSupported()` is identical to its super method
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentCompleteSignatureTransform.java`
#### Snippet
```java

    @Override
    public boolean isFeatureSupported(String feature) {
        if (feature == null) {
            throw new NullPointerException();
```

### RedundantMethodOverride
Method `serialize()` is identical to its super method
in `policy/src/main/java/org/apache/wss4j/policy/model/TransportBinding.java`
#### Snippet
```java

    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }
```

### RedundantMethodOverride
Method `getName()` is identical to its super method
in `policy/src/main/java/org/apache/wss4j/policy/model/SignedParts.java`
#### Snippet
```java

    @Override
    public QName getName() {
        return getVersion().getSPConstants().getSignedParts();
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
        // retrieval
        //
        if (super.getWsDocInfo() == null) {
            WSDocInfo wsDocInfo = new WSDocInfo(getDocument());
            super.setWsDocInfo(wsDocInfo);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
        if (super.getWsDocInfo() == null) {
            WSDocInfo wsDocInfo = new WSDocInfo(getDocument());
            super.setWsDocInfo(wsDocInfo);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
        if (wsDocInfo == null) {
            wsDocInfo = new WSDocInfo(getDocument());
            super.setWsDocInfo(wsDocInfo);
        }
        wsDocInfo.setCrypto(cr);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
                byte[] ivBytes = new byte[ivLen];

                int read = super.in.read(ivBytes, 0, ivLen);
                while (read != ivLen) {
                    read += super.in.read(ivBytes, read, ivLen - read);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
                int read = super.in.read(ivBytes, 0, ivLen);
                while (read != ivLen) {
                    read += super.in.read(ivBytes, read, ivLen - read);
                }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/BootstrapPolicy.java`
#### Snippet
```java

    public QName getName() {
        return super.getVersion().getSPConstants().getBootstrapPolicy();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/BootstrapPolicy.java`
#### Snippet
```java

    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, nestedPolicy);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractTokenWrapper.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractTokenWrapper.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/TransportBinding.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractToken.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Wss10.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Wss10.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Layout.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Layout.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/SupportingTokens.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/SupportingTokens.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Trust10.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/Trust10.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractBinding.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractBinding.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
    @Override
    public void serialize(XMLStreamWriter writer) throws XMLStreamException {
        super.serialize(writer, getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
    @Override
    public PolicyComponent normalize() {
        return super.normalize(getPolicy());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java
            //WSS 1.1 EncryptedHeader Element:
            if (elementPath.size() == 3 && WSSUtils.isInSOAPHeader(elementPath)
                && Modifier.Content != super.getEncryptionPartDef().getModifier()) {
                doEncryptedHeader = true;

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509ThumbprintSHA1SecurityTokenImpl.java`
#### Snippet
```java
                throw new WSSecurityException(WSSecurityException.ErrorCode.SECURITY_TOKEN_UNAVAILABLE);
            }
            super.setX509Certificates(new X509Certificate[]{certs[0]});
            this.alias = getCrypto().getX509Identifier(certs[0]);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SKISecurityTokenImpl.java`
#### Snippet
```java
                throw new WSSecurityException(WSSecurityException.ErrorCode.SECURITY_TOKEN_UNAVAILABLE);
            }
            super.setX509Certificates(new X509Certificate[]{certs[0]});
            this.alias = getCrypto().getX509Identifier(certs[0]);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509IssuerSerialTokenImpl.java`
#### Snippet
```java
                throw new WSSecurityException(WSSecurityException.ErrorCode.SECURITY_TOKEN_UNAVAILABLE);
            }
            super.setX509Certificates(new X509Certificate[]{certs[0]});
            return this.alias = getCrypto().getX509Identifier(certs[0]);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl.java`
#### Snippet
```java
            key = pwcb.getKeyObject();
            if (this.key instanceof PrivateKey) {
                super.setAsymmetric(true);
            }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl.java`
#### Snippet
```java
        }
        if (key != null) {
            super.setSecretKey(algorithmURI, key);
            return key;
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `ws-security-common/src/main/java/org/apache/wss4j/common/WSEncryptionPart.java`
#### Snippet
```java
        this.id = id;
        encModifier = encMod;
        name = namespace = null;
    }

```

### NestedAssignment
Result of assignment expression used
in `ws-security-common/src/main/java/org/apache/wss4j/common/WSEncryptionPart.java`
#### Snippet
```java
    public WSEncryptionPart(String id) {
        this.id = id;
        name = namespace = encModifier = null;
    }

```

### NestedAssignment
Result of assignment expression used
in `ws-security-common/src/main/java/org/apache/wss4j/common/WSEncryptionPart.java`
#### Snippet
```java
    public WSEncryptionPart(String id) {
        this.id = id;
        name = namespace = encModifier = null;
    }

```

### NestedAssignment
Result of assignment expression used
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java
                int numBytes;
                byte[] buf = new byte[8192];
                while ((numBytes = inputStream.read(buf)) != -1) {
                    crlfOutputStream.write(buf, 0, numBytes);
                }
```

### NestedAssignment
Result of assignment expression used
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java
                int numBytes;
                byte[] buf = new byte[8192];
                while ((numBytes = inputStream.read(buf)) != -1) {
                    outputStream.write(buf, 0, numBytes);
                }
```

### NestedAssignment
Result of assignment expression used
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
        int ch;
        int lineLength = 0;
        while ((ch = attachmentInputStream.read()) != -1) {
            if (ch == '\r') {
                cr = true;
```

### NestedAssignment
Result of assignment expression used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler.java`
#### Snippet
```java
                                SecurityTokenProvider<? extends InboundSecurityToken> securityTokenProvider =
                                        inputProcessorChain.getSecurityContext().getSecurityTokenProvider(attributeValue);
                                return this.securityToken = new SecurityTokenReferenceImpl(
                                        securityTokenProvider.getSecurityToken(),
                                        xmlSecEventList,
                                        (WSInboundSecurityContext) inputProcessorChain.getSecurityContext(),
                                        securityTokenReferenceId,
                                        WSSecurityTokenConstants.KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE);
                            }

```

### NestedAssignment
Result of assignment expression used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509IssuerSerialTokenImpl.java`
#### Snippet
```java
            }
            super.setX509Certificates(new X509Certificate[]{certs[0]});
            return this.alias = getCrypto().getX509Identifier(certs[0]);
        }
        return this.alias;
```

### NestedAssignment
Result of assignment expression used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/HttpsSecurityTokenImpl.java`
#### Snippet
```java
                X509Certificate[] certs = getX509Certificates();
                if (certs != null && certs.length > 0) {
                    return this.principal = certs[0].getSubjectX500Principal();
                }

```

### NestedAssignment
Result of assignment expression used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java
                X509Certificate[] certs = getX509Certificates();
                if (certs != null && certs.length > 0) {
                    return this.principal = certs[0].getSubjectX500Principal();
                }
                return this.principal = new PublicKeyPrincipalImpl(getPublicKey());
```

### NestedAssignment
Result of assignment expression used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java
                    return this.principal = certs[0].getSubjectX500Principal();
                }
                return this.principal = new PublicKeyPrincipalImpl(getPublicKey());
            } catch (XMLSecurityException e) {
                throw new WSSecurityException(WSSecurityException.ErrorCode.INVALID_SECURITY_TOKEN, e);
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `initiator` is accessed in both synchronized and unsynchronized contexts
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    private final Deque<SecurityEvent> securityEventQueue = new LinkedList<>();
    private boolean operationSecurityEventOccured = false;
    private boolean initiator;
    private String actorOrRole;
    private int attachmentCount;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `faultOccurred` is accessed in both synchronized and unsynchronized contexts
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    private int attachmentCount;
    private boolean noSecurityHeader;
    private boolean faultOccurred;
    private final PolicyAsserter policyAsserter;
    private boolean soap12;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noSecurityHeader` is accessed in both synchronized and unsynchronized contexts
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    private String actorOrRole;
    private int attachmentCount;
    private boolean noSecurityHeader;
    private boolean faultOccurred;
    private final PolicyAsserter policyAsserter;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `addJceProviders` is accessed in both synchronized and unsynchronized contexts
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
     * with some JVMs (such as IBMs).
     */
    private static boolean addJceProviders = true;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `builderFactory` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java

    private static XMLObjectProviderRegistry providerRegistry;
    private static XMLObjectBuilderFactory builderFactory;
    private static MarshallerFactory marshallerFactory;
    private static UnmarshallerFactory unmarshallerFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `marshallerFactory` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
    private static XMLObjectProviderRegistry providerRegistry;
    private static XMLObjectBuilderFactory builderFactory;
    private static MarshallerFactory marshallerFactory;
    private static UnmarshallerFactory unmarshallerFactory;
    private static boolean samlEngineInitialized = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `unmarshallerFactory` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
    private static XMLObjectBuilderFactory builderFactory;
    private static MarshallerFactory marshallerFactory;
    private static UnmarshallerFactory unmarshallerFactory;
    private static boolean samlEngineInitialized = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `providerRegistry` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(OpenSAMLUtil.class);

    private static XMLObjectProviderRegistry providerRegistry;
    private static XMLObjectBuilderFactory builderFactory;
    private static MarshallerFactory marshallerFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `installed` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
    private static final String NAME = "TLSP";
    private static final ThreadLocal<Provider> PROVIDER = new ThreadLocal<>();
    private static boolean installed = false;

    public static synchronized void install() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `addJceProviders` is accessed in both synchronized and unsynchronized contexts
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
     * with some JVMs (such as IBMs).
     */
    private static boolean addJceProviders = true;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `asserted` is accessed in both synchronized and unsynchronized contexts
in `policy/src/main/java/org/apache/wss4j/policy/AssertionState.java`
#### Snippet
```java

    private State state = State.INIT;
    private boolean asserted;
    private boolean logged;
    private Assertion assertion;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `state` is accessed in both synchronized and unsynchronized contexts
in `policy/src/main/java/org/apache/wss4j/policy/AssertionState.java`
#### Snippet
```java
    }

    private State state = State.INIT;
    private boolean asserted;
    private boolean logged;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `soap12` is accessed in both synchronized and unsynchronized contexts
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    private boolean allowRSA15KeyTransportAlgorithm = false;
    private boolean disableBSPEnforcement;
    private boolean soap12;

    private List<BSPRule> ignoredBSPRules = Collections.emptyList();
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
        Provider p = getProvider();
        if (p != null) {
            return p.get(key);
        } else {
            return null;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
        Provider p = getProvider();
        if (p != null) {
            p.putAll(t);
        }
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheReplayCache.java`
#### Snippet
```java
    }

    public void initComplete() {
    }
    public void preShutdown() {
```

### EmptyMethod
The method is empty
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java

    // Allow subclasses to decorate the Subject if required.
    protected void decorateSubject(Subject subject) {

    }
```

### EmptyMethod
The method is empty
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/SignatureTrustValidator.java`
#### Snippet
```java
     * @throws WSSecurityException
     */
    protected void validateCertificates(X509Certificate[] certificates)
        throws WSSecurityException {
        // Nothing
```

### EmptyMethod
All implementations of this method are empty
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/PolicyAsserter.java`
#### Snippet
```java
public interface PolicyAsserter {

    void assertPolicy(Assertion assertion);

    void unassertPolicy(Assertion assertion, String reason);
```

### EmptyMethod
All implementations of this method are empty
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/PolicyAsserter.java`
#### Snippet
```java
    void assertPolicy(Assertion assertion);

    void unassertPolicy(Assertion assertion, String reason);

    void assertPolicy(QName qName);
```

### EmptyMethod
All implementations of this method are empty
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/PolicyAsserter.java`
#### Snippet
```java
    void unassertPolicy(Assertion assertion, String reason);

    void assertPolicy(QName qName);

    void unassertPolicy(QName qName, String reason);
```

### EmptyMethod
All implementations of this method are empty
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/PolicyAsserter.java`
#### Snippet
```java
    void assertPolicy(QName qName);

    void unassertPolicy(QName qName, String reason);
}

```

### EmptyMethod
The method is empty
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
    }

    public static void init() {
        // Do nothing
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyInputProcessor.java`
#### Snippet
```java
    private final PolicyEnforcer policyEnforcer;
    private boolean initDone = false;
    private boolean transportSecurityActive = false;

    public PolicyInputProcessor(PolicyEnforcer policyEnforcer, XMLSecurityProperties securityProperties) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyInputProcessor.java`
#### Snippet
```java

    private final PolicyEnforcer policyEnforcer;
    private boolean initDone = false;
    private boolean transportSecurityActive = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java

    private final Deque<SecurityEvent> securityEventQueue = new LinkedList<>();
    private boolean operationSecurityEventOccured = false;
    private boolean initiator;
    private String actorOrRole;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
public final class WSSecurityUtil {

    private static boolean isSAAJ14 = false;

    private static final org.slf4j.Logger LOG =
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
     * to static initialization code at construction time.
     */
    private static boolean staticallyInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
    private Element elementNonce;
    private int length = 32;
    private int offset = 0;
    private int generation = -1;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
    private static MarshallerFactory marshallerFactory;
    private static UnmarshallerFactory unmarshallerFactory;
    private static boolean samlEngineInitialized = false;

    private OpenSAMLUtil() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/CRLFOutputStream.java`
#### Snippet
```java
    private static final byte[] CRLF = new byte[]{CR, LF};

    private boolean lastByteCR = false;

    public CRLFOutputStream(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
    private static final String NAME = "TLSP";
    private static final ThreadLocal<Provider> PROVIDER = new ThreadLocal<>();
    private static boolean installed = false;

    public static synchronized void install() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl.java`
#### Snippet
```java
    private String createdTime;
    private String passwordType;
    private boolean digest = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSymmetricAsymmetricBinding.java`
#### Snippet
```java
    private boolean encryptSignature = false;
    private boolean protectTokens = false;
    private boolean onlySignEntireHeadersAndBody = false;

    protected AbstractSymmetricAsymmetricBinding(SPConstants.SPVersion version, Policy nestedPolicy) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSymmetricAsymmetricBinding.java`
#### Snippet
```java
    private ProtectionOrder protectionOrder = ProtectionOrder.SignBeforeEncrypting;
    private boolean encryptSignature = false;
    private boolean protectTokens = false;
    private boolean onlySignEntireHeadersAndBody = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSymmetricAsymmetricBinding.java`
#### Snippet
```java

    private ProtectionOrder protectionOrder = ProtectionOrder.SignBeforeEncrypting;
    private boolean encryptSignature = false;
    private boolean protectTokens = false;
    private boolean onlySignEntireHeadersAndBody = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
    protected PasswordEncryptor passwordEncryptor;

    private boolean certProviderHandlesNameConstraints = false;
    private boolean enablePrivateKeyCaching = true;
    private Map<String, PrivateKey> privateKeyCache = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler.java`
#### Snippet
```java
        private final QName attribute;
        private final String attributeValue;
        private boolean refFound = false;
        private boolean end = false;
        private QName startElementName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler.java`
#### Snippet
```java
        private final String attributeValue;
        private boolean refFound = false;
        private boolean end = false;
        private QName startElementName;
        private int startElementLevel;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
    private WSSCrypto encryptionWSSCrypto;
    private String encryptionUser;
    private boolean useReqSigCertForEncryption = false;
    private String encryptionCompressionAlgorithm;
    private boolean enableRevocation = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
     */
    private boolean handleCustomPasswordTypes = false;
    private boolean allowUsernameTokenNoPassword = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
    private boolean useDerivedKeyForMAC = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
    private boolean handleCustomPasswordTypes = false;
    private boolean allowUsernameTokenNoPassword = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
    private boolean useDerivedKeyForMAC = true;
    private WSSConstants.UsernameTokenPasswordType usernameTokenPasswordType;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
    private WSSCrypto signatureWSSCrypto;
    private String signatureUser;
    private boolean enableSignatureConfirmationVerification = false;
    private boolean includeSignatureToken;
    private boolean includeEncryptionToken;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
    private boolean useReqSigCertForEncryption = false;
    private String encryptionCompressionAlgorithm;
    private boolean enableRevocation = false;
    private ReplayCache timestampReplayCache;
    private ReplayCache nonceReplayCache;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
     * reject custom token types in the callback handler.
     */
    private boolean handleCustomPasswordTypes = false;
    private boolean allowUsernameTokenNoPassword = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
public class WSSSignatureReferenceVerifyInputProcessor extends AbstractSignatureReferenceVerifyInputProcessor {

    private boolean replayChecked = false;

    public WSSSignatureReferenceVerifyInputProcessor(InputProcessorChain inputProcessorChain,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
        private final String securityTokenReferenceId;
        private boolean senderVouches = false;
        private boolean includeSTR = false;

        FinalSAMLTokenOutputProcessor(OutboundSecurityToken securityToken, SamlAssertionWrapper samlAssertionWrapper,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
        private final SamlAssertionWrapper samlAssertionWrapper;
        private final String securityTokenReferenceId;
        private boolean senderVouches = false;
        private boolean includeSTR = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java
    class InternalEncryptionOutputProcessor extends AbstractInternalEncryptionOutputProcessor {

        private boolean doEncryptedHeader = false;
        private final OutboundSecurityToken securityToken;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    private boolean operationSecurityEventOccured = false;
    private boolean messageEncryptionTokenOccured = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
    private boolean disableBSPEnforcement;
    private boolean soap12;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
    private final Deque<SecurityEvent> securityEventQueue = new ArrayDeque<>();
    private boolean operationSecurityEventOccured = false;
    private boolean messageEncryptionTokenOccured = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
    private boolean disableBSPEnforcement;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java

    private final Deque<SecurityEvent> securityEventQueue = new ArrayDeque<>();
    private boolean operationSecurityEventOccured = false;
    private boolean messageEncryptionTokenOccured = false;
    private boolean allowRSA15KeyTransportAlgorithm = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean signatureAction = false;
        boolean encryptionAction = false;
        boolean signedSAML = false;
        boolean kerberos = false;
        boolean signatureKerberos = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean signedSAML = false;
        boolean kerberos = false;
        boolean signatureKerberos = false;
        boolean encryptionKerberos = false;
        boolean derivedSignature = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean signatureKerberos = false;
        boolean encryptionKerberos = false;
        boolean derivedSignature = false;
        boolean derivedEncryption = false;
    }
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean kerberos = false;
        boolean signatureKerberos = false;
        boolean encryptionKerberos = false;
        boolean derivedSignature = false;
        boolean derivedEncryption = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
    private static class ConfiguredAction {
        boolean signatureAction = false;
        boolean encryptionAction = false;
        boolean signedSAML = false;
        boolean kerberos = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean encryptionAction = false;
        boolean signedSAML = false;
        boolean kerberos = false;
        boolean signatureKerberos = false;
        boolean encryptionKerberos = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java

    private static class ConfiguredAction {
        boolean signatureAction = false;
        boolean encryptionAction = false;
        boolean signedSAML = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        boolean encryptionKerberos = false;
        boolean derivedSignature = false;
        boolean derivedEncryption = false;
    }
}
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-05-01-07-26.818.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java
                }
            } else {
                if (e instanceof NoSuchAlgorithmException) {    //NOPMD
                    throw new WSSecurityException(
                        WSSecurityException.ErrorCode.UNSUPPORTED_ALGORITHM, e, "unsupportedKeyTransp",
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'org.apache.wss4j.common.ext.WSSecurityException', in the throws list already.
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

        private X509Certificate[] getCertificatesUsingCallback()
            throws WSSConfigurationException, WSSecurityException {

            SubjectBean subjectBean = samlCallback.getSubject();
```

### DuplicateThrows
There is a more general exception, 'org.apache.wss4j.common.ext.WSSecurityException', in the throws list already.
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

        private PrivateKey getPrivateKeyUsingCallback()
            throws WSSConfigurationException, WSSecurityException {

            SubjectBean subjectBean = samlCallback.getSubject();
```

### DuplicateThrows
There is a more general exception, 'org.apache.wss4j.common.ext.WSSecurityException', in the throws list already.
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

        private byte[] getSecretKeyUsingCallback()
            throws WSSConfigurationException, WSSecurityException {

            SubjectBean subjectBean = samlCallback.getSubject();
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `errorCode` of exception class
in `ws-security-common/src/main/java/org/apache/wss4j/common/ext/WSSecurityException.java`
#### Snippet
```java
    }

    private ErrorCode errorCode;

    public WSSecurityException(ErrorCode errorCode) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
        }

        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        String text = XMLUtils.getElementText(element);
        if (text == null) {
            return new byte[0];
        }
        return org.apache.xml.security.utils.XMLUtils.decode(text);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
            }
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecUsernameToken.java`
#### Snippet
```java
    public byte[] getDerivedKey(byte[] saltValue) throws WSSecurityException {
        if (ut == null || !useDerivedKey) {
            return new byte[0];
        }
        if (passwordsAreEncoded) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            return org.apache.xml.security.utils.XMLUtils.decode(salt);
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
            return new X509Certificate[]{cert};
        }
        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/ext/WSSecurityException.java`
#### Snippet
```java

    public WSSecurityException(ErrorCode errorCode, String msgId) {
        super(msgId, new Object[]{});
        this.errorCode = errorCode;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }

        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
        } catch (WSSecurityException ex) {
            LOG.debug(ex.getMessage(), ex);
            return new byte[0];
        }
        if (useForMac) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
    public static byte[] doRawPasswordDigest(byte[] nonce, String created, byte[] password) throws WSSecurityException {
        try {
            byte[] b1 = nonce != null ? nonce : new byte[0];
            byte[] b2 = created != null ? created.getBytes(StandardCharsets.UTF_8) : new byte[0];
            byte[] b3 = password;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
        try {
            byte[] b1 = nonce != null ? nonce : new byte[0];
            byte[] b2 = created != null ? created.getBytes(StandardCharsets.UTF_8) : new byte[0];
            byte[] b3 = password;
            byte[] b4 = new byte[b1.length + b2.length + b3.length];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return getSignatureValue(sig);
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        }

        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java
        String text = XMLUtils.getElementText(element);
        if (text == null) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/PKIPathSecurity.java`
#### Snippet
```java
        byte[] data = getToken();
        if (data == null) {
            return new X509Certificate[0];
        }
        if (crypto == null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/BouncyCastleUtils.java`
#### Snippet
```java
            return authorityKeyIdentifier.getKeyIdentifier();
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/BouncyCastleUtils.java`
#### Snippet
```java
            return subjectKeyIdentifier.getKeyIdentifier();
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
    public X509Certificate[] getX509IssuerSerial(Crypto crypto) throws WSSecurityException {
        if (crypto == null) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            issuerSerial = getIssuerSerial();
            if (issuerSerial == null) {
                return new X509Certificate[0];
            }
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
    public X509Certificate[] getKeyIdentifier(Crypto crypto) throws WSSecurityException {
        if (crypto == null) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
        }

        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoClientAction.java`
#### Snippet
```java
            secContext.requestCredDeleg(Boolean.FALSE);

            byte[] token = new byte[0];
            return secContext.initSecContext(token, 0, token.length);
        } catch (GSSException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoClientAction.java`
#### Snippet
```java
        }

        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
            );
        }
        return new Certificate[]{};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
    ) throws WSSecurityException, NoSuchAlgorithmException, CertificateEncodingException {
        if (keyIdentifierBytes == null) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java

        if (certs == null || certs.length == 0) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
        byte[] bytes = cert.getExtensionValue(NAME_CONSTRAINTS_OID);
        if (bytes == null || bytes.length <= 0) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoServiceAction.java`
#### Snippet
```java
        }

        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosClientExceptionAction.java`
#### Snippet
```java
        secContext.requestCredDeleg(requestCredDeleg);

        byte[] token = new byte[0];
        byte[] returnedToken = secContext.initSecContext(token, 0, token.length);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
    public X509Certificate[] getX509Certificates(CryptoType cryptoType) throws WSSecurityException {
        if (cryptoType == null) {
            return new X509Certificate[0];
        }
        CryptoType.TYPE type = cryptoType.getType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        }
        CryptoType.TYPE type = cryptoType.getType();
        X509Certificate[] certs = new X509Certificate[0];
        switch (type) {
        case ISSUER_SERIAL:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        }

        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        //
        String issuerString = certs[0].getIssuerX500Principal().getName();
        X509Certificate[] foundCerts = new X509Certificate[0];
        if (certs.length == 1) {
            CryptoType cryptoType = new CryptoType(CryptoType.TYPE.SUBJECT_DN);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
    private X509Certificate[] getX509CertificatesSKI(byte[] skiBytes) throws WSSecurityException {
        if (trustedCerts == null) {
            return new X509Certificate[0];
        }
        for (X509Certificate trustedCert : trustedCerts) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            }
        }
        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        }

        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java

        if (trustedCerts == null) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            }
        }
        return new X509Certificate[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        LOG.debug("No thumbprint match found in {}", keystore);
        return new Certificate[]{};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        if (certs == null || certs.length == 0) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
    public X509Certificate[] getX509Certificates(CryptoType cryptoType) throws WSSecurityException {
        if (cryptoType == null) {
            return new X509Certificate[0];
        }
        CryptoType.TYPE type = cryptoType.getType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
        }
        CryptoType.TYPE type = cryptoType.getType();
        X509Certificate[] certs = new X509Certificate[0];
        switch (type) {
        case ISSUER_SERIAL:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        LOG.debug("No SKI match found in {}", keystore);
        return new Certificate[]{};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

            ks.load(input, storepass == null || storepass.length() == 0
                ? new char[0] : storepass.toCharArray());
        } catch (IOException | GeneralSecurityException e) {
            LOG.debug(e.getMessage(), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        LOG.debug("No issuer serial match found in {}", keystore);
        return new Certificate[]{};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        if (certs == null || certs.length == 0) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

            Key keyTmp = keystore.getKey(identifier, pwd == null
                                         ? new char[]{} : pwd.toCharArray());
            if (!(keyTmp instanceof PrivateKey)) {
                String msg = "Key is not a private key, alias: [" + identifier + "]";
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        if (certs == null || certs.isEmpty()) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

        if (certs == null || certs.length == 0) {
            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
    private X509Certificate[] getX509Certificates(String identifier) throws WSSecurityException {
        if (identifier == null) {
            return new X509Certificate[0];
        }
        Certificate[] certs = null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

            if (certs == null) {
                return new X509Certificate[0];
            }
        } catch (KeyStoreException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
            }

            return new X509Certificate[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
            }

            return new byte[0];
        }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `hasDerivedKeys` initializer `false` is redundant
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java

        //WSP1.3, 5.3 Token Properties
        boolean hasDerivedKeys = false;
        hasDerivedKeys = hasDerivedKeys(tokenSecurityEvent.getSecurityToken());
        String namespace = getAssertion().getName().getNamespaceURI();
```

### UnusedAssignment
Variable `samlAssertion` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
        WSSecurityEngineResult result = request.getWsDocInfo().getResult(keyIdentifierValue);

        SamlAssertionWrapper samlAssertion = null;
        Element token = null;
        if (result != null) {
```

### UnusedAssignment
Variable `token` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java

        SamlAssertionWrapper samlAssertion = null;
        Element token = null;
        if (result != null) {
            samlAssertion =
```

### UnusedAssignment
Variable `keyValue` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
    public static PublicKey parseKeyValue(Element keyInfoElement,
                                          XMLSignatureFactory signatureFactory) throws WSSecurityException {
        KeyValue keyValue = null;
        try {
            //
```

### UnusedAssignment
Variable `samlAssertion` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                            data.getCallbackHandler(), uri, secRef.getReference().getValueType()
                        );
                    SamlAssertionWrapper samlAssertion = null;
                    if (processedToken == null) {
                        List<WSSecurityEngineResult> samlResult = proc.handleToken(token, data);
```

### UnusedAssignment
Variable `parts` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/UsernameTokenSignedAction.java`
#### Snippet
```java
        // builder.prependToHeader(reqData.getSecHeader());

        List<WSEncryptionPart> parts = null;
        if (!signatureToken.getParts().isEmpty()) {
            parts = signatureToken.getParts();
```

### UnusedAssignment
Variable `symmetricKey` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/EncryptionAction.java`
#### Snippet
```java
        }

        SecretKey symmetricKey = null;
        if (ephemeralKey != null) {
            symmetricKey = KeyUtils.prepareSecretKey(wsEncrypt.getSymmetricEncAlgorithm(), ephemeralKey);
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        String result = "";
        if (Node.ELEMENT_NODE == decryptedNode.getNodeType()) {
            result = decryptedNode.getNodeName();
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        byte[] bytes = JavaUtils.getBytesFromStream(attachmentInputStream);

        Document document = null;
        try {
            document = org.apache.xml.security.utils.XMLUtils.read(new ByteArrayInputStream(bytes), true);
```

### UnusedAssignment
Variable `xmlCipher` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        XMLCipher xmlCipher = null;
        try {
            if (encryptionSerializer != null) {
```

### UnusedAssignment
Variable `mustunderstand` initializer `true` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecHeader.java`
#### Snippet
```java
    private String actor;

    private boolean mustunderstand = true;

    private Element securityHeader;
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java

        if (getSignatureAlgorithm() == null) {
            PublicKey key = null;
            if (certs != null && certs[0] != null) {
                key = certs[0].getPublicKey();
```

### UnusedAssignment
Variable `signContext` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
            // Prepend the signature element to the security header (after the assertion)
            //
            XMLSignContext signContext = null;
            if (siblingElement != null && siblingElement.getNextSibling() != null) {
                signContext =
```

### UnusedAssignment
Variable `transform` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
                }
                if (idToSign != null) {
                    Transform transform = null;
                    if ("STRTransform".equals(elemName)) {
                        Element ctx = createSTRParameter(doc);
```

### UnusedAssignment
Variable `elementsToSign` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
                } else {
                    String nmSpace = encPart.getNamespace();
                    List<Element> elementsToSign = null;
                    if (element != null) {
                        elementsToSign = Collections.singletonList(element);
```

### UnusedAssignment
Variable `signContext` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
            // Figure out where to insert the signature element
            //
            XMLSignContext signContext = null;
            Element securityHeaderElement = getSecurityHeader().getSecurityHeaderElement();
            if (prepend) {
```

### UnusedAssignment
Variable `signContext` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
            // Figure out where to insert the signature element
            //
            XMLSignContext signContext = null;
            Element securityHeaderElement = getSecurityHeader().getSecurityHeaderElement();
            if (prepend) {
```

### UnusedAssignment
Variable `kiChildren` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java

    protected void marshalKeyInfo(WSDocInfo wsDocInfo) throws WSSecurityException {
        List<XMLStructure> kiChildren = null;
        if (customKeyInfoElement == null) {
            XMLStructure structure = new DOMStructure(secRef.getElement());
```

### UnusedAssignment
Variable `certBytes` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
            }

            byte[] certBytes = null;
            if (!useSingleCert) {
                bstToken.setAttributeNS(null, "ValueType", PKIPathSecurity.PKI_TYPE);
```

### UnusedAssignment
Variable `binarySecurity` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
            getWsDocInfo().addTokenElement(bstToken, false);
        } else {
            BinarySecurity binarySecurity = null;
            if (!useSingleCert) {
                binarySecurity = new PKIPathSecurity(getDocument());
```

### UnusedAssignment
Variable `loginContext` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
    ) throws WSSecurityException {
        // Get a TGT from the KDC using JAAS
        LoginContext loginContext = null;
        try {
            if (callbackHandler == null) {
```

### UnusedAssignment
Variable `serializedOctets` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        AbstractSerializer serializer = new TransformSerializer(true);

        byte[] serializedOctets = null;
        if (type.equals(EncryptionConstants.TYPE_CONTENT)) {
            NodeList children = elementToEncrypt.getChildNodes();
```

### UnusedAssignment
Variable `encryptedBytes` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        }

        byte[] encryptedBytes = null;
        try {
            encryptedBytes = cipher.doFinal(serializedOctets);
```

### UnusedAssignment
Variable `xmlCipher` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
    ) throws WSSecurityException {

        XMLCipher xmlCipher = null;
        try {
            if (encryptionSerializer != null) {
```

### UnusedAssignment
Variable `user` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java
        }

        String user = null;
        String password = null;

```

### UnusedAssignment
Variable `password` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java

        String user = null;
        String password = null;

        UsernameToken usernameToken = credential.getUsernametoken();
```

### UnusedAssignment
Variable `expandXOP` initializer `false` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

        String value = getString(WSHandlerConstants.EXPAND_XOP_INCLUDE_FOR_SIGNATURE, reqData.getMsgContext());
        boolean expandXOP = false;
        if (value != null) {
            expandXOP =
```

### UnusedAssignment
Variable `encPart` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
                               List<WSEncryptionPart> parts, RequestData reqData)
        throws WSSecurityException {
        WSEncryptionPart encPart = null;
        String[] rawParts = tmpS.split(";");

```

### UnusedAssignment
Variable `cbClass` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
    ) throws WSSecurityException {

        Class<? extends CallbackHandler> cbClass = null;
        CallbackHandler cbHandler = null;
        try {
```

### UnusedAssignment
Variable `cbHandler` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

        Class<? extends CallbackHandler> cbClass = null;
        CallbackHandler cbHandler = null;
        try {
            cbClass =
```

### UnusedAssignment
Variable `secret` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/DerivedKeyTokenProcessor.java`
#### Snippet
```java
        }

        byte[] secret = null;
        Element secRefElement = dkt.getSecurityTokenReferenceElement();
        if (secRefElement != null) {
```

### UnusedAssignment
Variable `nonceValue` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            return;
        }
        byte[] nonceValue = null;
        try {
            nonceValue = UsernameTokenUtil.generateNonce(16);
```

### UnusedAssignment
Variable `certs` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java

        BinarySecurity token = createSecurityToken(elem, data);
        X509Certificate[] certs = null;
        Validator validator = data.getValidator(new QName(elem.getNamespaceURI(),
                                                          elem.getLocalName()));
```

### UnusedAssignment
Variable `token` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
    ) throws WSSecurityException {
        String type = element.getAttributeNS(null, "ValueType");
        BinarySecurity token = null;
        if (X509Security.X509_V3_TYPE.equals(type)) {
            token = new X509Security(element, data.getBSPEnforcer());
```

### UnusedAssignment
Variable `loginContext` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/KerberosTokenValidator.java`
#### Snippet
```java

        // Get a TGT from the KDC using JAAS
        LoginContext loginContext = null;
        try {
            if (callbackHandler != null) {
```

### UnusedAssignment
Variable `krbServiceCtx` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/KerberosTokenValidator.java`
#### Snippet
```java
            new KerberosServiceExceptionAction(token, service,
                                               isUsernameServiceNameForm(), spnego);
        KerberosServiceContext krbServiceCtx = null;
        try {
            krbServiceCtx = Subject.doAs(subject, action);
```

### UnusedAssignment
Variable `secret` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SecurityContextTokenProcessor.java`
#### Snippet
```java
            id = XMLUtils.getIDFromReference(id);

            byte[] secret = null;
            try {
                secret = getSecret(data.getCallbackHandler(), sct.getIdentifier());
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
                );

            PublicKey key = null;
            if (samlKeyInfo.getCerts() != null && samlKeyInfo.getCerts()[0] != null) {
                key = samlKeyInfo.getCerts()[0].getPublicKey();
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java

        data.getWsDocInfo().addTokenElement(elem);
        WSSecurityEngineResult result = null;
        if (samlAssertion.isSigned()) {
            result = new WSSecurityEngineResult(WSConstants.ST_SIGNED, samlAssertion);
```

### UnusedAssignment
Variable `symmetricKey` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/ReferenceListProcessor.java`
#### Snippet
```java
                keyInfoElement, "SecurityTokenReference", WSConstants.WSSE_NS
            );
        SecretKey symmetricKey = null;
        Principal principal = null;
        if (secRefToken == null) {
```

### UnusedAssignment
Variable `attachmentId` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java

        String attachmentUri = ((ApacheOctetStreamData) data).getURI();
        String attachmentId = null;
        try {
            attachmentId = AttachmentUtils.getAttachmentId(attachmentUri);
```

### UnusedAssignment
Variable `ownerDoc` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java

    private static void appendChild(Node parent, Node child) {
        Document ownerDoc = null;
        if (parent.getNodeType() == Node.DOCUMENT_NODE) {
            ownerDoc = (Document)parent;
```

### UnusedAssignment
Variable `symmetricKey` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }

        SecretKey symmetricKey = null;
        try {
            symmetricKey = KeyUtils.prepareSecretKey(symEncAlgo, decryptedData);
```

### UnusedAssignment
Variable `encryptedEphemeralKey` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }

        byte[] encryptedEphemeralKey = null;
        byte[] decryptedBytes = null;
        Element refList =
```

### UnusedAssignment
Variable `decryptedBytes` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java

        byte[] encryptedEphemeralKey = null;
        byte[] decryptedBytes = null;
        Element refList =
            XMLUtils.getDirectChildElement(elem, "ReferenceList", WSConstants.ENC_NS);
```

### UnusedAssignment
Variable `samlSubject` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
    ) throws WSSecurityException {
        for (org.opensaml.saml.saml1.core.Statement stmt : assertion.getStatements()) {
            org.opensaml.saml.saml1.core.Subject samlSubject = null;
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
                org.opensaml.saml.saml1.core.AttributeStatement attrStmt =
```

### UnusedAssignment
Variable `keyInfoFactory` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        // (public key) credential
        //
        KeyInfoFactory keyInfoFactory = null;
        try {
            keyInfoFactory = KeyInfoFactory.getInstance("DOM", "ApacheXMLDSig");
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        // signature refers to
        //
        Key key = null;
        if (certs != null && certs.length > 0 && certs[0] != null) {
            key = certs[0].getPublicKey();
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
    ) throws WSSecurityException {
        Marshaller marshaller = marshallerFactory.getMarshaller(xmlObject);
        Element element = null;
        DocumentFragment frag = doc == null ? null : doc.createDocumentFragment();
        try {
```

### UnusedAssignment
Variable `saltValue` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
     */
    public static byte[] generateSalt(boolean useForMac) {
        byte[] saltValue = null;
        try {
            saltValue = generateNonce(16);
```

### UnusedAssignment
Variable `sha` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
        System.arraycopy(salt, 0, pwSalt, password.length, salt.length);

        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA1");
```

### UnusedAssignment
Variable `credential` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            }

            BasicCredential credential = null;
            if (samlKeyInfo.getCerts() != null) {
                credential = new BasicX509Credential(samlKeyInfo.getCerts()[0]);
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
     */
    public static URL getResource(ClassLoader loader, String resource) {
        URL url = null;
        try {
            if (loader != null) {
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
     */
    public static URL getResource(String resource) {
        URL url = null;
        try {
            ClassLoader classLoader = getTCL();
```

### UnusedAssignment
The value `false` assigned to `hasChildren` is never used
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DOM2Writer.java`
#### Snippet
```java
                out.print(LS);
            }
            hasChildren = false;
        }
    }
```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        }
        Node startParent = startNode.getParentNode();
        Node processedNode = null;
        Element foundElement = null;
        String id = XMLUtils.getIDFromReference(value);
```

### UnusedAssignment
Variable `attr` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
    public static String getNamespace(String prefix, Node e) {
        while (e != null && e.getNodeType() == Node.ELEMENT_NODE) {
            Attr attr = null;
            if (prefix == null) {
                attr = ((Element) e).getAttributeNode("xmlns");
```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        }
        Node startParent = startNode.getParentNode();
        Node processedNode = null;

        while (startNode != null) {
```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        }
        Node startParent = startNode.getParentNode();
        Node processedNode = null;

        while (startNode != null) {
```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        }
        Node startParent = startNode.getParentNode();
        Node processedNode = null;

        List<Element> foundNodes = new ArrayList<>();
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
        throws WSSecurityException {
        Document doc = element.getOwnerDocument();
        byte[] data = null;
        try {
            data = cert.getEncoded();
```

### UnusedAssignment
Variable `encodedCert` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
    public void setKeyIdentifierThumb(X509Certificate cert) throws WSSecurityException {
        Document doc = element.getOwnerDocument();
        byte[] encodedCert = null;
        try {
            encodedCert = cert.getEncoded();
```

### UnusedAssignment
Variable `subjectConfirmationData` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
        KeyInfoBean keyInfoBean
    ) throws org.opensaml.security.SecurityException, WSSecurityException {
        SubjectConfirmationData subjectConfirmationData = null;
        KeyInfo keyInfo = null;
        if (keyInfoBean == null) {
```

### UnusedAssignment
Variable `keyInfo` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
    ) throws org.opensaml.security.SecurityException, WSSecurityException {
        SubjectConfirmationData subjectConfirmationData = null;
        KeyInfo keyInfo = null;
        if (keyInfoBean == null) {
            if (subjectConfirmationDataBuilder == null) {
```

### UnusedAssignment
Variable `validator` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
            // Verify the trust path using the above settings
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
```

### UnusedAssignment
Variable `path` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
    public X509Certificate[] getCertificatesFromBytes(byte[] data)
        throws WSSecurityException {
        CertPath path = null;
        try (InputStream in = new ByteArrayInputStream(data)) {
            path = getCertificateFactory().generateCertPath(in);
```

### UnusedAssignment
Variable `loginContext` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java

        // Get a TGT from the KDC using JAAS
        LoginContext loginContext = null;
        try {
            if (callbackHandler == null) {
```

### UnusedAssignment
Variable `krbCtx` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java
                                                  true,
                                                  mutualAuth);
            KerberosContext krbCtx = null;
            try {
                krbCtx = (KerberosContext) Subject.doAs(clientSubject, action);
```

### UnusedAssignment
Variable `loginContext` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java
    ) throws WSSecurityException {
        // Get a TGT from the KDC using JAAS
        LoginContext loginContext = null;
        try {
            if (callbackHandler == null) {
```

### UnusedAssignment
Variable `krbCtx` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java
                new KerberosServiceExceptionAction(ticket, service,
                                                   isUsernameServiceNameForm, true);
            KerberosServiceContext krbCtx = null;
            try {
                krbCtx = (KerberosServiceContext) Subject.doAs(subject, action);
```

### UnusedAssignment
Variable `secContext` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosServiceExceptionAction.java`
#### Snippet
```java
        GSSManager gssManager = GSSManager.getInstance();

        GSSContext secContext = null;
        GSSName gssService = gssManager.createName(serviceName, isUsernameServiceNameForm
                                                   ? GSSName.NT_USER_NAME : GSSName.NT_HOSTBASED_SERVICE);
```

### UnusedAssignment
Variable `krbServiceCtx` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosServiceExceptionAction.java`
#### Snippet
```java
        }

        KerberosServiceContext krbServiceCtx = null;

        try {
```

### UnusedAssignment
Variable `oid` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosClientExceptionAction.java`
#### Snippet
```java
        GSSName gssService = gssManager.createName(serviceName, isUsernameServiceNameForm
                                                   ? GSSName.NT_USER_NAME : GSSName.NT_HOSTBASED_SERVICE);
        Oid oid = null;
        GSSCredential credentials = delegatedCredential;
        if (spnego) {
```

### UnusedAssignment
Variable `digest` initializer `false` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl.java`
#### Snippet
```java
    private String createdTime;
    private String passwordType;
    private boolean digest = false;

    /**
```

### UnusedAssignment
Variable `validator` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            // Verify the trust path using the above settings
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
```

### UnusedAssignment
Variable `issuerName` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        // back on a direct conversion to a BC X509Name
        //
        Object issuerName = null;
        try {
            X500Principal issuerRDN = new X500Principal(issuer);
```

### UnusedAssignment
Variable `sha` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
     */
    private X509Certificate[] getX509Certificates(byte[] thumb) throws WSSecurityException {
        MessageDigest sha = null;

        if (trustedCerts == null) {
```

### UnusedAssignment
Variable `cryptoClass` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
        }

        Class<? extends Crypto> cryptoClass = null;
        if (cryptoClassName == null
            || cryptoClassName.equals("org.apache.wss4j.common.crypto.Merlin")
```

### UnusedAssignment
Variable `c` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
        LOG.debug("Using Crypto Engine [{}]", cryptoClass);
        try {
            Constructor<? extends Crypto> c = null;
            try {
                Class<?>[] classes = new Class[]{Properties.class, ClassLoader.class};
```

### UnusedAssignment
Variable `c` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
        LOG.debug("Using Crypto Engine [{}]", cryptoClass);
        try {
            Constructor<? extends Crypto> c = null;
            try {
                Class<?>[] classes = new Class[]{Map.class, ClassLoader.class};
```

### UnusedAssignment
The value `false` assigned to `hasChildren` is never used
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
                out.print(LS);
            }
            hasChildren = false;
        }
    }
```

### UnusedAssignment
Variable `attr` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
    private static String getNamespace(String prefix, Node e) {
        while (e != null && e.getNodeType() == Node.ELEMENT_NODE) {
            Attr attr = null;
            if (prefix == null) {
                attr = ((Element) e).getAttributeNode("xmlns");
```

### UnusedAssignment
Variable `sha` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
     */
    private X509Certificate[] getX509Certificates(byte[] thumbprint) throws WSSecurityException {
        MessageDigest sha = null;

        try {
```

### UnusedAssignment
Variable `ks` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
    protected KeyStore load(InputStream input, String storepass, String provider, String type)
        throws WSSecurityException {
        KeyStore ks = null;

        try {
```

### UnusedAssignment
Variable `issuerName` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
        // back on a direct conversion to a BC X509Name
        //
        Object issuerName = null;
        try {
            X500Principal issuerRDN = new X500Principal(issuer);
```

### UnusedAssignment
Variable `validator` initializer `null` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            // Verify the trust path using the above settings
            String provider = getCryptoProvider();
            CertPathValidator validator = null;
            if (provider == null || provider.length() == 0) {
                validator = CertPathValidator.getInstance("PKIX");
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/SpnegoContextTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `asymmetricSignature` initializer `SPConstants.RSA_SHA1` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
        private String encryptionDigest;
        private String symmetricSignature = SPConstants.HMAC_SHA1;
        private String asymmetricSignature = SPConstants.RSA_SHA1;

        public AlgorithmSuiteType(String name, String digest, String encryption, String symmetricKeyWrap, //NOPMD
```

### UnusedAssignment
Variable `symmetricSignature` initializer `SPConstants.HMAC_SHA1` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
        private String ns;
        private String encryptionDigest;
        private String symmetricSignature = SPConstants.HMAC_SHA1;
        private String asymmetricSignature = SPConstants.RSA_SHA1;

```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/UsernameTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/HttpsTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/X509TokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/KerberosTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/SecureConversationTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/KeyValueTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/SamlTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `nestedPolicy` initializer `null` is redundant
in `policy/src/main/java/org/apache/wss4j/policy/builders/SecurityContextTokenBuilder.java`
#### Snippet
```java
        final Element nestedPolicyElement = SPUtils.getFirstPolicyChildElement(element);

        Policy nestedPolicy = null;
        if (nestedPolicyElement == null) {
            nestedPolicy = new Policy();
```

### UnusedAssignment
Variable `crypto` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSCrypto.java`
#### Snippet
```java
        }

        Merlin crypto = null;
        if (cryptoProperties != null) {
            try {
```

### UnusedAssignment
Variable `signatureTokenProvider` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
            String sigTokenId =
                outputProcessorChain.getSecurityContext().get(WSSConstants.PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE);
            SecurityTokenProvider<OutboundSecurityToken> signatureTokenProvider = null;
            if (sigTokenId != null) {
                signatureTokenProvider =
```

### UnusedAssignment
Variable `includeSTR` initializer `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
        private final String securityTokenReferenceId;
        private boolean senderVouches = false;
        private boolean includeSTR = false;

        FinalSAMLTokenOutputProcessor(OutboundSecurityToken securityToken, SamlAssertionWrapper samlAssertionWrapper,
```

### UnusedAssignment
Variable `senderVouches` initializer `false` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
        private final SamlAssertionWrapper samlAssertionWrapper;
        private final String securityTokenReferenceId;
        private boolean senderVouches = false;
        private boolean includeSTR = false;

```

### UnusedAssignment
Variable `cipher` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java
                }
                //initialize the cipher
                Cipher cipher = null;
                try {
                    cipher = Cipher.getInstance(jceAlgorithm);
```

### UnusedAssignment
Variable `credential` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
            samlTokenValidator.validate(sigSecurityToken, wssSecurityProperties);

            BasicCredential credential = null;
            if (sigSecurityToken.getX509Certificates() != null) {
                credential = new BasicX509Credential(sigSecurityToken.getX509Certificates()[0]);
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
            };
        } else {
            Object object = null;
            try {
                Unmarshaller unmarshaller = WSSConstants.getJaxbUnmarshaller(securityProperties.isDisableSchemaValidation());
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
    protected <T> T parseStructure(Deque<XMLSecEvent> eventDeque, int index, XMLSecurityProperties securityProperties)
            throws XMLSecurityException {
        Document document = null;
        try {
            document = ((WSSSecurityProperties) securityProperties).getDocumentCreator().newDocument();
```

### UnusedAssignment
Variable `tokenProvider` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor.java`
#### Snippet
```java
            }

            SecurityTokenProvider<OutboundSecurityToken> tokenProvider = null;
            if (tokenId != null) {
                tokenProvider =
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/DerivedKeyTokenOutputProcessor.java`
#### Snippet
```java
                public Key getSecretKey(String algorithmURI) throws WSSecurityException {

                    Key key = null;
                    try {
                        key = super.getSecretKey(algorithmURI);
```

### UnusedAssignment
Variable `krbCtx` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken.java`
#### Snippet
```java
                                                  contextAndServiceNameCallback.isUsernameServiceNameForm(),
                                                  contextAndServiceNameCallback.isRequestCredDeleg());
            KerberosContext krbCtx = null;
            try {
                krbCtx = Subject.doAs(clientSubject, action);
```

### UnusedAssignment
Variable `krbServiceCtx` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosServiceSecurityTokenImpl.java`
#### Snippet
```java
                                                   contextAndServiceNameCallback.isUsernameServiceNameForm(),
                                                   false);
            KerberosServiceContext krbServiceCtx = null;
            try {
                krbServiceCtx = Subject.doAs(subject, action);
```

### UnusedAssignment
Variable `encryptedKeySecurityTokenProvider` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
            }

            SecurityTokenProvider<OutboundSecurityToken> encryptedKeySecurityTokenProvider = null;
            GenericOutboundSecurityToken encryptedKeySecurityToken = null;

```

### UnusedAssignment
Variable `encryptedKeySecurityToken` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java

            SecurityTokenProvider<OutboundSecurityToken> encryptedKeySecurityTokenProvider = null;
            GenericOutboundSecurityToken encryptedKeySecurityToken = null;

            String sigTokenId =
```

### UnusedAssignment
Variable `publicKey` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                OutputProcessorChain subOutputProcessorChain = outputProcessorChain.createSubChain(this);

                PublicKey publicKey = null;
                if (securityToken.getKeyWrappingToken().getX509Certificates() != null
                    && securityToken.getKeyWrappingToken().getX509Certificates().length > 0) {
```

### UnusedAssignment
Variable `kerberosId` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        GenericOutboundSecurityToken securityToken =
            getOutboundSecurityToken(outputProcessorChain, WSSConstants.PROP_USE_THIS_TOKEN_ID_FOR_KERBEROS);
        String kerberosId = null;
        // First off, see if we have a supplied token
        if (securityToken == null) {
```

### UnusedAssignment
Variable `signatureTokenProvider` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        String tokenId =
            outputProcessorChain.getSecurityContext().get(id);
        SecurityTokenProvider<OutboundSecurityToken> signatureTokenProvider = null;
        if (tokenId != null) {
            signatureTokenProvider =
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        String password = pwCb.getPassword();
        byte[] secretKey = pwCb.getKey();
        Key key = null;
        X509Certificate[] x509Certificates = null;
        try {
```

### UnusedAssignment
Variable `x509Certificates` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        byte[] secretKey = pwCb.getKey();
        Key key = null;
        X509Certificate[] x509Certificates = null;
        try {
            if (password != null && securityProperties.getSignatureCrypto() != null) {
```

### UnusedAssignment
Variable `crypto` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
    ) {
        try {
            Crypto crypto = null;
            if (signature) {
                crypto = properties.getSignatureCrypto();
```

### UnusedAssignment
Variable `cbClass` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
    ) throws WSSecurityException {

        Class<? extends CallbackHandler> cbClass = null;
        CallbackHandler cbHandler = null;
        try {
```

### UnusedAssignment
Variable `cbHandler` initializer `null` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java

        Class<? extends CallbackHandler> cbClass = null;
        CallbackHandler cbHandler = null;
        try {
            cbClass =
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `attributeStatements == null` is always `false`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        List<org.opensaml.saml.saml1.core.AttributeStatement> attributeStatements =
                assertion.getAttributeStatements();
        if (attributeStatements == null || attributeStatements.isEmpty()) {
            return "Attribute " + claimURI + " not found in the SAMLAssertion";
        }
```

### ConstantValue
Condition `attribute.getAttributeValues() != null` is always `true`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
                String desiredRole = attributeNamespace.relativize(claimURI).toString();
                if (attribute.getAttributeName().equals(desiredRole)
                        && attribute.getAttributeValues() != null && !attribute.getAttributeValues().isEmpty()) {
                    return null;
                }
```

### ConstantValue
Condition `refUri != null` is always `true`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java
                        Element element = (Element) policyNodeList.item(j);
                        String refUri = element.getAttributeNS(WSSConstants.NS_WSU10, "Id");
                        if (refUri != null && refUri.equals(uri)) {
                            found = true;
                            Policy policy = parsePolicy(element);
```

### ConstantValue
Condition `uri == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/WSDocInfo.java`
#### Snippet
```java
    public boolean hasResult(Integer tag, String uri) {
        String id = XMLUtils.getIDFromReference(uri);
        if (id == null || uri == null || uri.length() == 0) {
            return false;
        }
```

### ConstantValue
Condition `symEncAlgo == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
        if (tmpE != null) {
            symEncAlgo = tmpE.getAttributeNS(null, "Algorithm");
            if (symEncAlgo == null || symEncAlgo.length() == 0) {
                throw new WSSecurityException(
                    WSSecurityException.ErrorCode.UNSUPPORTED_ALGORITHM, "noEncAlgo"
```

### ConstantValue
Condition `typeStr != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
        if (encBodyData != null) {
            String typeStr = ((Element)encBodyData).getAttributeNS(null, "Type");
            if (typeStr != null) {
                 return typeStr.equals(WSConstants.ENC_NS + "Content");
            }
```

### ConstantValue
Value `enableRevocation` is always 'true'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/EncryptionAction.java`
#### Snippet
```java
            X509Certificate[] certs = crypto.getX509Certificates(cryptoType);
            if (certs != null && certs.length > 0) {
                crypto.verifyTrust(certs, enableRevocation, null, null);
            }
        }
```

### ConstantValue
Condition `typeStr != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        String typeStr = encData.getAttributeNS(null, "Type");
        String xopURI = getXOPURIFromEncryptedData(encData);
        if (typeStr != null
            && (WSConstants.SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_CONTENT_ONLY.equals(typeStr)
                || WSConstants.SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_COMPLETE.equals(typeStr))) {
```

### ConstantValue
Condition `xopURI != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
        for (Element includeElement : includeElements) {
            String xopURI = includeElement.getAttributeNS(null, "href");
            if (xopURI != null) {
                // Retrieve the attachment bytes
                byte[] attachmentBytes =
```

### ConstantValue
Condition `id == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecBase.java`
#### Snippet
```java
        String newAttrPrefix = WSConstants.WSU_PREFIX;

        if (id == null || id.length() == 0) {
            if (WSConstants.ENC_NS.equals(bodyElement.getNamespaceURI())
                && (WSConstants.ENC_DATA_LN.equals(bodyElement.getLocalName())
```

### ConstantValue
Condition `id == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecBase.java`
#### Snippet
```java
        }

        if (id == null || id.length() == 0) {
            id = getIdAllocator().createId("id-", bodyElement);
            String prefix = XMLUtils.setNamespace(bodyElement, newAttrNs, newAttrPrefix);
```

### ConstantValue
Condition `sv != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SignatureConfirmation.java`
#### Snippet
```java

        String sv = element.getAttributeNS(null, SC_VALUE_ATTR);
        if (sv != null) {
            signatureValue = org.apache.xml.security.utils.XMLUtils.decode(sv);
        }
```

### ConstantValue
Condition `privateCredentials == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
    private KerberosTicket getKerberosTicket(Subject clientSubject, KerberosTicket previousTicket) {
        Set<KerberosTicket> privateCredentials = clientSubject.getPrivateCredentials(KerberosTicket.class);
        if (privateCredentials == null || privateCredentials.isEmpty()) {
            LOG.debug("Kerberos client subject private credentials are null");
            return null;
```

### ConstantValue
Condition `valueType != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/Timestamp.java`
#### Snippet
```java
                    if (createdString == null) {
                        String valueType = currentChildElement.getAttributeNS(null, "ValueType");
                        if (valueType != null && valueType.length() != 0) {
                            // We can't have a ValueType attribute as per the BSP spec
                            bspEnforcer.handleBSPRule(BSPRule.R3225);
```

### ConstantValue
Condition `valueType != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/Timestamp.java`
#### Snippet
```java
                    } else {
                        String valueType = currentChildElement.getAttributeNS(null, "ValueType");
                        if (valueType != null && valueType.length() != 0) {
                            // We can't have a ValueType attribute as per the BSP spec
                            bspEnforcer.handleBSPRule(BSPRule.R3226);
```

### ConstantValue
Condition `null != children` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        if (type.equals(EncryptionConstants.TYPE_CONTENT)) {
            NodeList children = elementToEncrypt.getChildNodes();
            if (null != children) {
                serializedOctets = serializer.serializeToByteArray(children);
            } else {
```

### ConstantValue
Condition `xopURI != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
                            for (Element includeElement : includeElements) {
                                String xopURI = includeElement.getAttributeNS(null, "href");
                                if (xopURI != null) {
                                    // Delete the attachment

```

### ConstantValue
Value `useDerivedKeyForMAC` is always 'true'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
        boolean useDerivedKeyForMAC = Boolean.parseBoolean(derivedMAC);
        if (useDerivedKeyForMAC) {
            reqData.setUseDerivedKeyForMAC(useDerivedKeyForMAC);
        }

```

### ConstantValue
Condition `certConstraintsList != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
    private Collection<Pattern> getCertConstraints(String certConstraints, String separator) throws WSSecurityException {
        String[] certConstraintsList = certConstraints.split(separator);
        if (certConstraintsList != null && certConstraintsList.length > 0) {
            Collection<Pattern> certConstraintsCollection =
                new ArrayList<>(certConstraintsList.length);
```

### ConstantValue
Condition `type == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            Element passwordChild = passwordElements.get(0);
            String type = passwordChild.getAttributeNS(null, WSConstants.PASSWORD_TYPE_ATTR);
            if (type == null || type.length() == 0) {
                LOG.debug("The Username Token password does not have a Type attribute");
                bspEnforcer.handleBSPRule(BSPRule.R4201);
```

### ConstantValue
Condition `encodingType == null` is always `false`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
            String encodingType = nonce.getAttributeNS(null, "EncodingType");
            // Encoding Type must be equal to Base64Binary
            if (encodingType == null || encodingType.length() == 0) {
                bspEnforcer.handleBSPRule(BSPRule.R4220);
            } else if (!WSConstants.BASE64_ENCODING.equals(encodingType)) {
```

### ConstantValue
Condition `xopUri != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
        if (elementChild != null && elementChild.hasAttributeNS(null, "href")) {
            String xopUri = elementChild.getAttributeNS(null, "href");
            if (xopUri != null && xopUri.startsWith("cid:")) {
                byte[] content = WSSecurityUtil.getBytesFromAttachment(xopUri, data);
                token.setRawToken(content);
```

### ConstantValue
Condition `typeStr != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedAssertionProcessor.java`
#### Snippet
```java
        // Type must be "Element" if specified
        String typeStr = encryptedDataElement.getAttributeNS(null, "Type");
        if (typeStr != null && !(WSConstants.ENC_NS + "Element").equals(typeStr)) {
            throw new WSSecurityException(
                WSSecurityException.ErrorCode.INVALID_SECURITY, "badElement",
```

### ConstantValue
Condition `attribute != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
    ) throws WSSecurityException {
        String attribute = elem.getAttributeNS(null, "Type");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R3209);
        }
```

### ConstantValue
Condition `attribute != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "MimeType");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5622);
        }
```

### ConstantValue
Condition `attribute != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "Encoding");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5623);
        }
```

### ConstantValue
Condition `attribute != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
        }
        attribute = elem.getAttributeNS(null, "Recipient");
        if (attribute != null && attribute.length() != 0) {
            bspEnforcer.handleBSPRule(BSPRule.R5602);
        }
```

### ConstantValue
Condition `xopUri != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        if (elementChild != null && elementChild.hasAttributeNS(null, "href")) {
            String xopUri = elementChild.getAttributeNS(null, "href");
            if (xopUri != null && xopUri.startsWith("cid:")) {
                return true;
            }
```

### ConstantValue
Condition `secretKey != null` is always `true`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                } else if (publicKey != null) {
                    algorithmSuiteValidator.checkAsymmetricKeyLength(publicKey);
                } else if (secretKey != null) {
                    algorithmSuiteValidator.checkSymmetricKeyLength(secretKey.length);
                }
```

### ConstantValue
Condition `getSaml1().getAuthenticationStatements() != null` is always `true` when reached
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            }
        } else if (getSamlVersion().equals(SAMLVersion.VERSION_11)
            && getSaml1().getAuthenticationStatements() != null) {
            List<AuthenticationStatement> authnStatements =
                getSaml1().getAuthenticationStatements();
```

### ConstantValue
Condition `cacheManagerClass != null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/WSS4JCacheUtil.java`
#### Snippet
```java
        try {
            Class<?> cacheManagerClass = Class.forName("org.ehcache.CacheManager");
            if (cacheManagerClass != null) {
                ehCacheInstalled = true;
            }
```

### ConstantValue
Condition `startNode != null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        String id = XMLUtils.getIDFromReference(value);

        while (startNode != null && id != null) {
            // start node processing at this point
            if (startNode.getNodeType() == Node.ELEMENT_NODE) {
```

### ConstantValue
Value `foundElement` is always 'null'
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            }
        }
        return foundElement;
    }

```

### ConstantValue
Condition `startNode != null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        Node processedNode = null;

        while (startNode != null) {
            // start node processing at this point
            if (startNode.getNodeType() == Node.ELEMENT_NODE) {
```

### ConstantValue
Condition `startNode != null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        Node processedNode = null;

        while (startNode != null) {
            // start node processing at this point
            if (startNode.getNodeType() == Node.ELEMENT_NODE
```

### ConstantValue
Condition `startNode != null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

        List<Element> foundNodes = new ArrayList<>();
        while (startNode != null) {
            // start node processing at this point
            if (startNode.getNodeType() == Node.ELEMENT_NODE
```

### ConstantValue
Condition `foundCerts == null` is always `false`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
                // If the certs have not been found, the issuer is not in the keystore/truststore
                // As a direct result, do not trust the transmitted certificate
                if (foundCerts == null || foundCerts.length < 1) {
                    String subjectString = certs[0].getSubjectX500Principal().getName();
                    LOG.debug(
```

### ConstantValue
Condition `keystoreProvider.length() == 0` is always `false` when reached
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            }
            try {
                if (keystoreProvider == null || keystoreProvider.length() == 0) {
                    crlCertStore =
                            CertStore.getInstance(
```

### ConstantValue
Condition `truststore == null` is always `true`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
        super();

        if (truststore == null && loadCACerts) {
            String cacertsPath = System.getProperty("java.home") + "/lib/security/cacerts";

```

### ConstantValue
Condition `headerNamespace == null` is always `false`
in `policy/src/main/java/org/apache/wss4j/policy/builders/RequiredPartsBuilder.java`
#### Snippet
```java
                }
                String headerNamespace = child.getAttributeNS(null, SPConstants.NAMESPACE);
                if (headerNamespace == null || headerNamespace.length() == 0) {
                    throw new IllegalArgumentException(SPConstants.ERR_INVALID_POLICY);
                }
```

### ConstantValue
Condition `filter == null` is always `false`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
                addDeclaredNamespaces(child, declaredNamespaces);
                String filter = child.getAttributeNS(null, SPConstants.FILTER);
                if (filter == null || filter.length() == 0) {
                    throw new IllegalArgumentException(SPConstants.ERR_INVALID_POLICY);
                }
```

### ConstantValue
Condition `xPathVersion == null` is always `false`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedElementsBuilder.java`
#### Snippet
```java
    protected String getXPathVersion(Element element) {
        String xPathVersion = element.getAttributeNS(null, SPConstants.XPATH_VERSION);
        if (xPathVersion == null || xPathVersion.length() == 0) {
            xPathVersion = "1.0";
        }
```

### ConstantValue
Condition `!WSSConstants.NS_C14N_EXCL.equals(algorithm)` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                        securityContext.handleBSPRule(BSPRule.R5423);
                        if (j == transformTypes.size() - 1
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
```

### ConstantValue
Result of `WSSConstants.NS_C14N_EXCL.equals(algorithm)` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                        securityContext.handleBSPRule(BSPRule.R5423);
                        if (j == transformTypes.size() - 1
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
```

### ConstantValue
Condition `!WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                        if (j == transformTypes.size() - 1
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
```

### ConstantValue
Result of `WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                        if (j == transformTypes.size() - 1
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
```

### ConstantValue
Condition `!WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
                            securityContext.handleBSPRule(BSPRule.R5412);
```

### ConstantValue
Result of `WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            && !WSSConstants.NS_C14N_EXCL.equals(algorithm)
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
                            securityContext.handleBSPRule(BSPRule.R5412);
```

### ConstantValue
Condition `!WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
                            securityContext.handleBSPRule(BSPRule.R5412);
                        }
```

### ConstantValue
Result of `WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            && !WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_CONTENT_SIG_TRANS.equals(algorithm)
                            && !WSSConstants.SWA_ATTACHMENT_COMPLETE_SIG_TRANS.equals(algorithm)) {
                            securityContext.handleBSPRule(BSPRule.R5412);
                        }
```

### ConstantValue
Condition `WSSConstants.NS_C14N_EXCL.equals(algorithm)` is always `false`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            XMLSecurityUtils.getQNameType(transformType.getContent(),
                                                          XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces);
                        if (WSSConstants.NS_C14N_EXCL.equals(algorithm)
                                && inclusiveNamespacesType != null
                                && inclusiveNamespacesType.getPrefixList().isEmpty()) {
```

### ConstantValue
Condition `WSSConstants.NS_C14N_EXCL.equals(algorithm) && inclusiveNamespacesTy...` is always `false`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            XMLSecurityUtils.getQNameType(transformType.getContent(),
                                                          XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces);
                        if (WSSConstants.NS_C14N_EXCL.equals(algorithm)
                                && inclusiveNamespacesType != null
                                && inclusiveNamespacesType.getPrefixList().isEmpty()) {
                            securityContext.handleBSPRule(BSPRule.R5407);
                        }
```

### ConstantValue
Condition `WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)` is always `false`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                            securityContext.handleBSPRule(BSPRule.R5407);
                        }
                        if (WSSConstants.SOAPMESSAGE_NS10_STR_TRANSFORM.equals(algorithm)) {
                            if (inclusiveNamespacesType != null
                                    && inclusiveNamespacesType.getPrefixList().isEmpty()) {
```

### ConstantValue
Value `senderVouches` is always 'true'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

                finalSAMLTokenOutputProcessor = new FinalSAMLTokenOutputProcessor(securityToken, samlAssertionWrapper,
                        securityTokenReferenceId, senderVouches, includeSTR);
                finalSAMLTokenOutputProcessor.setAction(getAction(), getActionOrder());

```

### ConstantValue
Value `includeSTR` is always 'true'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

                finalSAMLTokenOutputProcessor = new FinalSAMLTokenOutputProcessor(securityToken, samlAssertionWrapper,
                        securityTokenReferenceId, senderVouches, includeSTR);
                finalSAMLTokenOutputProcessor.setAction(getAction(), getActionOrder());

```

### ConstantValue
Value `senderVouches` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

                finalSAMLTokenOutputProcessor = new FinalSAMLTokenOutputProcessor(null, samlAssertionWrapper,
                        securityTokenReferenceId, senderVouches, includeSTR);

                final SAMLSecurityTokenProvider securityTokenProvider =
```

### ConstantValue
Value `includeSTR` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

                finalSAMLTokenOutputProcessor = new FinalSAMLTokenOutputProcessor(null, samlAssertionWrapper,
                        securityTokenReferenceId, senderVouches, includeSTR);

                final SAMLSecurityTokenProvider securityTokenProvider =
```

### ConstantValue
Value `includeSTR` is always 'false'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
                finalSAMLTokenOutputProcessor = new FinalSAMLTokenOutputProcessor(null, samlAssertionWrapper,
                                                                                  securityTokenReferenceId, senderVouches,
                                                                                  includeSTR);
            }

```

### ConstantValue
Condition `privateCredentials == null` is always `false`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken.java`
#### Snippet
```java
    private KerberosTicket getKerberosTicket(Subject clientSubject, KerberosTicket previousTicket) {
        Set<KerberosTicket> privateCredentials = clientSubject.getPrivateCredentials(KerberosTicket.class);
        if (privateCredentials == null || privateCredentials.isEmpty()) {
            return null;
        }
```

### ConstantValue
Value `match` is always 'true'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
            boolean match = matchesTokenOrWrappedTokenId(wrappedTokens.get(i), id, tokenUsage);
            if (match) {
                return match;
            }
        }
```

### ConstantValue
Condition `passwordType != null` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/JAASUsernameTokenValidatorImpl.java`
#### Snippet
```java
        }
        String password = null;
        if (passwordType != null) {
            password = passwordType.getValue();
        }
```

### ConstantValue
Condition `WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType)` is always `true` when reached
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            }
        } else if (encodingType != null
                && (WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType))) {
            ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R6604);
        }
```

### ConstantValue
Condition `WSSConstants.NS_SAML20_TYPE.equals(valueType)` is always `true` when reached
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            }
        } else if (encodingType != null
                && (WSSConstants.NS_SAML10_TYPE.equals(valueType) || WSSConstants.NS_SAML20_TYPE.equals(valueType))) {
            ((WSInboundSecurityContext) inboundSecurityContext).handleBSPRule(BSPRule.R6604);
        }
```

### ConstantValue
Condition `certConstraintsList != null` is always `true`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
    private static Collection<Pattern> getCertConstraints(String certConstraints, String certConstraintsSeparator) {
        String[] certConstraintsList = certConstraints.split(certConstraintsSeparator);
        if (certConstraintsList != null && certConstraintsList.length > 0) {
            Collection<Pattern> certConstraintsCollection =
                new ArrayList<>(certConstraintsList.length);
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getInstance()` tries to override a static method of a superclass
in `policy/src/main/java/org/apache/wss4j/policy/SP13Constants.java`
#### Snippet
```java
    }

    public static synchronized SP13Constants getInstance() {
        if (sp13Constants == null) {
            sp13Constants = new SP13Constants();
```

### MethodOverridesStaticMethod
Method `createX509SubjectKeyIdentifierStructure()` tries to override a static method of a superclass
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
    }

    public static void createX509SubjectKeyIdentifierStructure(AbstractOutputProcessor abstractOutputProcessor,
                                                               OutputProcessorChain outputProcessorChain,
                                                               X509Certificate[] x509Certificates)
```

### MethodOverridesStaticMethod
Method `createTokenSecurityEvent()` tries to override a static method of a superclass
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static TokenSecurityEvent<? extends InboundSecurityToken>
        createTokenSecurityEvent(final InboundSecurityToken inboundSecurityToken, String correlationID)
            throws WSSecurityException {
        WSSecurityTokenConstants.TokenType tokenType = inboundSecurityToken.getTokenType();
```

## RuleId[id=IOResource]
### IOResource
'CRLFOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java

            } else if (mimeType != null && mimeType.matches("(?i)(text/).*")) {
                CRLFOutputStream crlfOutputStream = new CRLFOutputStream(outputStream); //NOPMD
                int numBytes;
                byte[] buf = new byte[8192];
```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
        }

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, StandardCharsets.UTF_8);

        Iterator<Map.Entry<String, String>> entryIterator = sortedHeaders.entrySet().iterator();
```

### IOResource
'LimitingInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
                try {
                    Constructor<InputStream> constructor = transformerClass.getConstructor(InputStream.class);
                    inputStream = new LimitingInputStream(
                            constructor.newInstance(inputStream), MAX_ALLOWED_DECOMPRESSED_BYTES);
                } catch (InvocationTargetException | NoSuchMethodException
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `WSSec` has only 'static' members, and lacks a 'private' constructor
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
 * with this class.
 */
public class WSSec {

    //todo outgoing client setup per policy
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/bean/Version.java`
#### Snippet
```java
public enum Version {

    SAML_20, SAML_11, SAML_10;

}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/OnlySignEntireHeadersAndBodyAssertionState.java`
#### Snippet
```java
        if (asserted) {
            String namespace = getAssertion().getName().getNamespaceURI();
            policyAsserter.assertPolicy(new QName(namespace, SPConstants.ONLY_SIGN_ENTIRE_HEADERS_AND_BODY));
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignedPartsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }

```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredElementsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/EncryptedElementsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignedElementsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IncludeTimeStampAssertionState.java`
#### Snippet
```java
        if (asserted) {
            String namespace = getAssertion().getName().getNamespaceURI();
            policyAsserter.assertPolicy(new QName(namespace, SPConstants.INCLUDE_TIMESTAMP));
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/EncryptedPartsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }

```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenProtectionAssertionState.java`
#### Snippet
```java
        if (initialAssertionState) {
            String namespace = getAssertion().getName().getNamespaceURI();
            policyAsserter.assertPolicy(new QName(namespace, SPConstants.PROTECT_TOKENS));
        }

```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/RequiredPartsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }

```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState.java`
#### Snippet
```java
        if (asserted) {
            String namespace = getAssertion().getName().getNamespaceURI();
            policyAsserter.assertPolicy(new QName(namespace, SPConstants.REQUIRE_SIGNATURE_CONFIRMATION));
        }
    }
```

### DataFlowIssue
Argument `attribute.getAttributeNamespace()` might be null
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
            for (org.opensaml.saml.saml1.core.Attribute attribute : attributes) {

                URI attributeNamespace = URI.create(attribute.getAttributeNamespace());
                String desiredRole = attributeNamespace.relativize(claimURI).toString();
                if (attribute.getAttributeName().equals(desiredRole)
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
                URI attributeNamespace = URI.create(attribute.getAttributeNamespace());
                String desiredRole = attributeNamespace.relativize(claimURI).toString();
                if (attribute.getAttributeName().equals(desiredRole)
                        && attribute.getAttributeValues() != null && !attribute.getAttributeValues().isEmpty()) {
                    return null;
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/ContentEncryptedElementsAssertionState.java`
#### Snippet
```java

        if (asserted) {
            policyAsserter.assertPolicy(getAssertion());
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureProtectionAssertionState.java`
#### Snippet
```java
        if (asserted) {
            String namespace = getAssertion().getName().getNamespaceURI();
            policyAsserter.assertPolicy(new QName(namespace, SPConstants.ENCRYPT_SIGNATURE));
        }
    }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/ProtectionOrderAssertionState.java`
#### Snippet
```java
            switch (protectionOrder) {  //NOPMD
            case SignBeforeEncrypting:
                policyAsserter.assertPolicy(new QName(namespace, SPConstants.SIGN_BEFORE_ENCRYPTING));
                break;
            case EncryptBeforeSigning:
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/ProtectionOrderAssertionState.java`
#### Snippet
```java
                break;
            case EncryptBeforeSigning:
                policyAsserter.assertPolicy(new QName(namespace, SPConstants.ENCRYPT_BEFORE_SIGNING));
                break;
            }
```

### DataFlowIssue
Method invocation `assertPolicy` may produce `NullPointerException`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/AlgorithmSuiteAssertionState.java`
#### Snippet
```java
        if (asserted) {
            AlgorithmSuite algorithmSuite = (AlgorithmSuite) getAssertion();
            policyAsserter.assertPolicy(getAssertion());
            String namespace = algorithmSuite.getAlgorithmSuiteType().getNamespace();
            String name = algorithmSuite.getAlgorithmSuiteType().getName();
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SecurityTokenRefSTRParser.java`
#### Snippet
```java
                if (el.equals(WSConstants.BINARY_TOKEN)) {
                    Processor proc = data.getWssConfig().getProcessor(WSConstants.BINARY_TOKEN);
                    List<WSSecurityEngineResult> bstResult = proc.handleToken(token, data);
                    BinarySecurity bstToken =
                            (BinarySecurity)bstResult.get(0).get(WSSecurityEngineResult.TAG_BINARY_SECURITY_TOKEN);
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
            }
            Processor proc = request.getWssConfig().getProcessor(WSConstants.SAML_TOKEN);
            List<WSSecurityEngineResult> samlResult = proc.handleToken(token, request);
            return
                (SamlAssertionWrapper)samlResult.get(0).get(
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                if (el.equals(WSConstants.BINARY_TOKEN)) {
                    Processor proc = data.getWssConfig().getProcessor(WSConstants.BINARY_TOKEN);
                    List<WSSecurityEngineResult> bstResult = proc.handleToken(token, parameters.getData());
                    BinarySecurity bstToken =
                        (BinarySecurity)bstResult.get(0).get(WSSecurityEngineResult.TAG_BINARY_SECURITY_TOKEN);
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                    SamlAssertionWrapper samlAssertion = null;
                    if (processedToken == null) {
                        List<WSSecurityEngineResult> samlResult = proc.handleToken(token, data);
                        samlAssertion =
                            (SamlAssertionWrapper)samlResult.get(0).get(
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
                    STRParserUtil.checkEncryptedKeyBSPCompliance(secRef, data.getBSPEnforcer());
                    Processor proc = data.getWssConfig().getProcessor(WSConstants.ENCRYPTED_KEY);
                    List<WSSecurityEngineResult> encrResult = proc.handleToken(token, data);
                    secretKey =
                        (byte[])encrResult.get(0).get(WSSecurityEngineResult.TAG_SECRET);
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SecurityContextToken.java`
#### Snippet
```java
    public void setIdentifier(String uuid) {
        Text node = getFirstNode(elementIdentifier);
        node.setData(uuid);
    }

```

### DataFlowIssue
Method invocation `execute` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
                (String)getProperty(reqData.getMsgContext(), WSHandlerConstants.SIG_CONF_DONE);
            if (done == null) {
                wssConfig.getAction(WSConstants.SC).execute(this, null, reqData);
            }
        }
```

### DataFlowIssue
Method invocation `execute` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java

            if (WSConstants.NO_SECURITY != actionToDo.getAction()) {
                wssConfig.getAction(actionToDo.getAction()).execute(
                    this, actionToDo.getActionToken(), reqData);
            }
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
                byte[] decodedNonce = org.apache.xml.security.utils.XMLUtils.decode(getNonce());
                if (passwordsAreEncoded) {
                    node.setData(UsernameTokenUtil.doPasswordDigest(decodedNonce, getCreated(),
                                                  org.apache.xml.security.utils.XMLUtils.decode(pwd)));
                } else {
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
                                                  org.apache.xml.security.utils.XMLUtils.decode(pwd)));
                } else {
                    node.setData(UsernameTokenUtil.doPasswordDigest(decodedNonce, getCreated(), pwd));
                }
            } else {
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
                }
            } else {
                node.setData(pwd);
            }
            if (passwordType != null) {
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
    public void setName(String name) {
        Text node = getFirstNode(elementUsername);
        node.setData(name);
    }

```

### DataFlowIssue
Method invocation `getCerts` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java

            PublicKey key = null;
            if (samlKeyInfo.getCerts() != null && samlKeyInfo.getCerts()[0] != null) {
                key = samlKeyInfo.getCerts()[0].getPublicKey();
            } else if (samlKeyInfo.getPublicKey() != null) {
```

### DataFlowIssue
Argument `sig.getDOM()` might be null
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
            // Not checking signature here, just marshalling into an XMLSignature
            // structure for testing the transform/digest algorithms etc.
            XMLValidateContext context = new DOMValidateContext(key, sig.getDOM());
            context.setProperty("org.apache.jcp.xml.dsig.secureValidation", Boolean.TRUE);
            context.setProperty("org.jcp.xml.dsig.secureValidation", Boolean.TRUE);
```

### DataFlowIssue
Method invocation `handleToken` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedDataProcessor.java`
#### Snippet
```java
            WSSConfig wssConfig = data.getWssConfig();
            Processor encrKeyProc = wssConfig.getProcessor(WSConstants.ENCRYPTED_KEY);
            encrKeyResults = encrKeyProc.handleToken(encryptedKeyElement, data);
            byte[] symmKey =
                (byte[])encrKeyResults.get(0).get(WSSecurityEngineResult.TAG_SECRET);
```

### DataFlowIssue
Argument `encryptedDataElement` might be null
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java

        return EncryptionUtils.decryptEncryptedData(
            doc, dataRefURI, encryptedDataElement, symmetricKey, symEncAlgo, data.getAttachmentCallbackHandler(),
            data.getEncryptionSerializer()
        );
```

### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
            }

            if (!(SecurityTokenReference.SECURITY_TOKEN_REFERENCE.equals(child.getLocalName())
                && WSConstants.WSSE_NS.equals(child.getNamespaceURI()))) {
                data.getBSPEnforcer().handleBSPRule(BSPRule.R5417);
```

### DataFlowIssue
Method invocation `marshall` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
            try {
                if (doc == null) {
                    element = marshaller.marshall(xmlObject);
                } else {
                    element = marshaller.marshall(xmlObject, doc);
```

### DataFlowIssue
Method invocation `marshall` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
                    element = marshaller.marshall(xmlObject);
                } else {
                    element = marshaller.marshall(xmlObject, doc);
                }
            } catch (MarshallingException ex) {
```

### DataFlowIssue
Method invocation `setCanonicalizationAlgorithm` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            c14nAlgo = defaultCanonicalizationAlgorithm;
        }
        signature.setCanonicalizationAlgorithm(c14nAlgo);
        LOG.debug("Using Canonicalization algorithm {}", c14nAlgo);

```

### DataFlowIssue
Method invocation `getNotBefore` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return getSaml2().getConditions().getNotBefore();
        } else {
            return getSaml1().getConditions().getNotBefore();
        }
    }
```

### DataFlowIssue
Method invocation `getNotOnOrAfter` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return getSaml2().getConditions().getNotOnOrAfter();
        } else {
            return getSaml1().getConditions().getNotOnOrAfter();
        }
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DOM2Writer.java`
#### Snippet
```java
                    }
                } else {
                    hasChildren = false;
                    out.print("/>");
                    if (pretty) {
```

### DataFlowIssue
Method invocation `getSerialNumber` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
                    return false;
                }
                if (!compare(getIssuerSerial().getSerialNumber(), tokenReference.getIssuerSerial().getSerialNumber())) {
                    return false;
                }
```

### DataFlowIssue
Method invocation `getIssuer` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java

        try {
            issuer = getIssuerSerial().getIssuer();
            serialNumber = getIssuerSerial().getSerialNumber();
        } catch (WSSecurityException e) {
```

### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            bspEnforcer.handleBSPRule(BSPRule.R3061);
        }
        if ("KeyIdentifier".equals(child.getLocalName())
            && WSS4JConstants.WSSE_NS.equals(child.getNamespaceURI())) {

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
                Audience audience = audienceBuilder.buildObject();
                audience.setURI(audienceURI);
                proxyRestriction.getAudiences().add(audience);
            }
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
                    }
                } else {
                    hasChildren = false;
                    out.print("/>");
                    if (pretty) {
```

### DataFlowIssue
Method invocation `getSessionKey` may produce `NullPointerException`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken.java`
#### Snippet
```java
                } else {
                    KerberosTicket serviceTicket = getKerberosTicket(clientSubject, tgt);
                    secretKey = serviceTicket.getSessionKey();
                }

```

### DataFlowIssue
Argument `x509Certificates` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java

            if (WSSecurityTokenConstants.KeyIdentifier_IssuerSerial.equals(keyIdentifier)) {
                WSSUtils.createX509IssuerSerialStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_SkiKeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### DataFlowIssue
Argument `x509Certificates` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                WSSUtils.createX509IssuerSerialStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_SkiKeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_X509KeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509KeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### DataFlowIssue
Argument `x509Certificates` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                WSSUtils.createX509SubjectKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KeyIdentifier_X509KeyIdentifier.equals(keyIdentifier)) {
                WSSUtils.createX509KeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KEYIDENTIFIER_THUMBPRINT_IDENTIFIER.equals(keyIdentifier)) {
                WSSUtils.createThumbprintKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
```

### DataFlowIssue
Argument `x509Certificates` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
                WSSUtils.createX509KeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KEYIDENTIFIER_THUMBPRINT_IDENTIFIER.equals(keyIdentifier)) {
                WSSUtils.createThumbprintKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KEYIDENTIFIER_ENCRYPTED_KEY_SHA1_IDENTIFIER.equals(keyIdentifier)) {
                //not applicable, fallback to thumbprint...
```

### DataFlowIssue
Argument `x509Certificates` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
            } else if (WSSecurityTokenConstants.KEYIDENTIFIER_ENCRYPTED_KEY_SHA1_IDENTIFIER.equals(keyIdentifier)) {
                //not applicable, fallback to thumbprint...
                WSSUtils.createThumbprintKeyIdentifierStructure(this, outputProcessorChain, x509Certificates);
            } else if (WSSecurityTokenConstants.KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE.equals(keyIdentifier)) {
                String valueType;
```

### DataFlowIssue
Method invocation `getSubjectName` may produce `NullPointerException`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl.java`
#### Snippet
```java
                @Override
                public String getName() {
                    return samlAssertionWrapper.getSubjectName();
                }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl.java`
#### Snippet
```java
                @Override
                public String getId() {
                    return samlAssertionWrapper.getId();
                }
            };
```

### DataFlowIssue
Variable is already assigned to this value
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
                }
            } else if (secretKey != null) {
                x509Certificates = null;
                String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(signatureAlgorithm);
                key = new SecretKeySpec(secretKey, algoFamily);
```

### DataFlowIssue
Argument `certConstraints` might be null
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            }
            Collection<Pattern> issuerCertConstraints =
                getCertConstraints(certConstraints, certConstraintsSeparator);
            properties.setIssuerDNConstraints(issuerCertConstraints);
        }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        int insertionIndex = str.indexOf('>');
        StringBuilder prefix = new StringBuilder(str.substring(0, insertionIndex));
        StringBuilder suffix = new StringBuilder(str.substring(insertionIndex, str.length()));

        // Don't add more than 20 prefixes
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            elementToStream(doc.getDocumentElement(), baos);
            return new String(baos.toByteArray(), StandardCharsets.UTF_8);
        }
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'EXPAND_XOP_INCLUDE_FOR_SIGNATURE' is still used
in `ws-security-common/src/main/java/org/apache/wss4j/common/ConfigurationConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String EXPAND_XOP_INCLUDE_FOR_SIGNATURE = "expandXOPIncludeForSignature";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT_WITH_KERBEROS_TOKEN' is still used
in `ws-security-common/src/main/java/org/apache/wss4j/common/ConfigurationConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ENCRYPT_WITH_KERBEROS_TOKEN = "EncryptWithKerberosToken";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT_DERIVED' is still used
in `ws-security-common/src/main/java/org/apache/wss4j/common/ConfigurationConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ENCRYPT_DERIVED = "EncryptDerived";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT' is still used
in `ws-security-common/src/main/java/org/apache/wss4j/common/ConfigurationConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ENCRYPT = "Encrypt";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT_WITH_DERIVED_KEY' is still used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSConstants.java`
#### Snippet
```java
    public static final Action ENCRYPTION_WITH_DERIVED_KEY = new Action("EncryptionWithDerivedKey");
    @Deprecated
    public static final Action ENCRYPT_WITH_DERIVED_KEY = ENCRYPTION_WITH_DERIVED_KEY;
    public static final Action SAML_TOKEN_SIGNED = new Action(ConfigurationConstants.SAML_TOKEN_SIGNED);
    public static final Action SAML_TOKEN_UNSIGNED = new Action(ConfigurationConstants.SAML_TOKEN_UNSIGNED);
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT_WITH_KERBEROS_TOKEN' is still used
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSConstants.java`
#### Snippet
```java
    public static final Action ENCRYPTION_WITH_KERBEROS_TOKEN = new Action("EncryptionWithKerberosToken");
    @Deprecated
    public static final Action ENCRYPT_WITH_KERBEROS_TOKEN = ENCRYPTION_WITH_KERBEROS_TOKEN;
    public static final Action KERBEROS_TOKEN = new Action("KerberosToken");
    public static final Action CUSTOM_TOKEN = new Action("CustomToken");
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'tokenObject' in a Serializable class
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/CustomTokenPrincipal.java`
#### Snippet
```java
    private Element tokenElement;
    private String name;
    private Object tokenObject;

    public Object getTokenObject() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'samlAssertion' in a Serializable class
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/SAMLTokenPrincipalImpl.java`
#### Snippet
```java

    private String name;
    private SamlAssertionWrapper samlAssertion;

    public SAMLTokenPrincipalImpl(SamlAssertionWrapper samlAssertion) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
        }
    };
    protected WsuIdAllocator idAllocator = DEFAULT_ID_ALLOCATOR;

    /**
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
                }
                stringBuilder.append(c1);
                i++;
            } else if (DOUBLE_QUOTE == c) {
                stringBuilder.append(BACKSLASH);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            } else if (BACKSLASH == c) {
                stringBuilder.append(c1);
                i++;
            } else {
                stringBuilder.append(c);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            if (DOUBLE_QUOTE == ch) {
                stringBuilder.append(ch);
                for (i++; i < length; i++) { //NOPMD
                    ch = text.charAt(i);
                    stringBuilder.append(ch);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            if (DOUBLE_QUOTE == ch) {
                stringBuilder.append(ch);
                for (i++; i < length; i++) { //NOPMD
                    ch = text.charAt(i);
                    stringBuilder.append(ch);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            if (LEFT_PARENTHESIS == ch) {
                inComment++;
                for (i++; i < length; i++) { //NOPMD
                    ch = text.charAt(i);
                    if (LEFT_PARENTHESIS == ch) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            if (LEFT_PARENTHESIS == ch) {
                inComment++;
                for (i++; i < length; i++) { //NOPMD
                    ch = text.charAt(i);
                    if (LEFT_PARENTHESIS == ch) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            if (CARRIAGE_RETURN == ch1 && LINEFEED == ch2 && (SPACE == ch3 || HTAB == ch3)) {

                i += 2;
                if (i >= length - 3) {
                    for (i++; i < length; i++) { //NOPMD
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
                i += 2;
                if (i >= length - 3) {
                    for (i++; i < length; i++) { //NOPMD
                        stringBuilder.append(text.charAt(i));
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
                i += 2;
                if (i >= length - 3) {
                    for (i++; i < length; i++) { //NOPMD
                        stringBuilder.append(text.charAt(i));
                    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        return prefix.toString() + suffix.toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        return prefix.toString() + suffix.toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java
        }
        if (storeBytesInAttachment && attachmentCallbackHandler != null) {
            final String attachmentId = "_" + UUID.randomUUID().toString();
            AttachmentUtils.storeBytesInAttachment(element, element.getOwnerDocument(), attachmentId,
                                                  data, attachmentCallbackHandler);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            + "] from provider [" + keystore.getProvider()
            + "] with size [" + keystore.size() + "] and aliases: {"
            + sb.toString() + "}";
        return msg;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/TimestampValidatorImpl.java`
#### Snippet
```java
            if (expiresDate != null && tokenContext.getWssSecurityProperties().isStrictTimestampCheck()
                && expiresDate.toInstant().isBefore(rightNow)) {
                LOG.debug("Time now: {}", rightNow.toString());
                throw new WSSecurityException(WSSecurityException.ErrorCode.MESSAGE_EXPIRED, "invalidTimestamp",
                                              new Object[] {"The security semantics of the message have expired"});
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `FinalEncryptedKeyOutputProcessor` may be 'static'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptedKeyOutputProcessor.java`
#### Snippet
```java
    }

    class FinalEncryptedKeyOutputProcessor extends AbstractOutputProcessor {

        private final OutboundSecurityToken securityToken;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `child` declared in one 'switch' branch and used in another
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DOM2Writer.java`
#### Snippet
```java
        switch (type) {
            case Node.DOCUMENT_NODE:
                Node child = node.getFirstChild();
                while (child != null) {
                    print(child, namespaceStack, out, pretty, indent);
```

### SwitchStatementWithConfusingDeclaration
Local variable `child` declared in one 'switch' branch and used in another
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
        switch (type) {
            case Node.DOCUMENT_NODE:
                Node child = node.getFirstChild();
                while (child != null) {
                    print(child, namespaceStack, out, pretty, indent);
```

### SwitchStatementWithConfusingDeclaration
Local variable `documentLevel` declared in one 'switch' branch and used in another
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
                case XMLStreamConstants.START_ELEMENT:
                    XMLSecStartElement xmlSecStartElement = xmlSecEvent.asStartElement();
                    int documentLevel = xmlSecStartElement.getDocumentLevel();

                    if (documentLevel == 1) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java

                // Set the Transform algorithms as well
                @SuppressWarnings("unchecked")
                List<Transform> transforms = reference.getTransforms();
                List<String> transformAlgorithms = new ArrayList<>(transforms.size());
                for (Transform transform : transforms) {
```

### RedundantSuppression
Redundant suppression
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java

                // Set the Transform algorithms as well
                @SuppressWarnings("unchecked")
                List<Transform> transforms = siRef.getTransforms();
                List<String> transformAlgorithms = new ArrayList<>(transforms.size());
                for (Transform transform : transforms) {
```

### RedundantSuppression
Redundant suppression
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java

    @SuppressWarnings("resource")
    protected Data processAttachment(XMLCryptoContext context, OutputStream os, String attachmentUri,
                                     Attachment attachment) throws TransformException {
        try {
```

### RedundantSuppression
Redundant suppression
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureProtectionAssertionState.java`
#### Snippet
```java
            }
        } else if (securityEvent instanceof TokenSecurityEvent) {
            @SuppressWarnings("unchecked")
            TokenSecurityEvent<? extends SecurityToken> tokenSecurityEvent
                = (TokenSecurityEvent<? extends SecurityToken>) securityEvent;
            tokenSecurityEvents.add(tokenSecurityEvent);
        }
```

### RedundantSuppression
Redundant suppression
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenProtectionAssertionState.java`
#### Snippet
```java
            }
        } else if (securityEvent instanceof TokenSecurityEvent) {
            @SuppressWarnings("unchecked")
            TokenSecurityEvent<? extends SecurityToken> tokenSecurityEvent
                = (TokenSecurityEvent<? extends SecurityToken>) securityEvent;
            tokenSecurityEvents.add(tokenSecurityEvent);
        } else { //Operation
```

### RedundantSuppression
Redundant suppression
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                }
                currentNode = currentNode.appendChild(element);
                @SuppressWarnings("unchecked")
                Iterator<Namespace> namespaceIterator = xmlSecStartElement.getNamespaces();
                while (namespaceIterator.hasNext()) {
                    XMLSecNamespace next = (XMLSecNamespace)namespaceIterator.next();
```

### RedundantSuppression
Redundant suppression
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                    parseXMLEvent(next, currentNode, document);
                }
                @SuppressWarnings("unchecked")
                Iterator<Attribute> attributesIterator = xmlSecStartElement.getAttributes();
                while (attributesIterator.hasNext()) {
                    XMLSecAttribute next = (XMLSecAttribute)attributesIterator.next();
```

### RedundantSuppression
Redundant suppression
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
                SecurityEvent securityEvent = securityEventList.get(i);
                if (securityEvent instanceof TokenSecurityEvent) {
                    @SuppressWarnings("unchecked")
                    TokenSecurityEvent<? extends SecurityToken> tokenSecurityEvent
                        = (TokenSecurityEvent<? extends SecurityToken>) securityEvent;
                    TokenUsage mainSig = WSSecurityTokenConstants.TOKENUSAGE_MAIN_SIGNATURE;
                    if (!tokenSecurityEvent.getSecurityToken().getTokenUsages().contains(mainSig)) {
```

### RedundantSuppression
Redundant suppression
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
                SecurityEvent securityEvent = securityEventList.get(i);
                if (securityEvent instanceof TokenSecurityEvent) {
                    @SuppressWarnings("unchecked")
                    TokenSecurityEvent<? extends SecurityToken> tokenSecurityEvent
                        = (TokenSecurityEvent<? extends SecurityToken>) securityEvent;
                    TokenUsage mainSig = WSSecurityTokenConstants.TOKENUSAGE_MAIN_SIGNATURE;
                    if (!tokenSecurityEvent.getSecurityToken().getTokenUsages().contains(mainSig)) {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/EncryptionAction.java`
#### Snippet
```java
        wsEncrypt.setUseThisCert(encryptionToken.getCertificate());
        Crypto crypto = encryptionToken.getCrypto();
        boolean enableRevocation = Boolean.valueOf(handler.getStringOption(WSHandlerConstants.ENABLE_REVOCATION));
        if (enableRevocation && crypto != null) {
            CryptoType cryptoType = new CryptoType(CryptoType.TYPE.ALIAS);
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinDevice.java`
#### Snippet
```java
                loadCACerts = false;
            }
        } else if (Boolean.valueOf(loadCacerts)) {
            String cacertsPath = (System.getProperty("java.home") + "/lib/security/cacerts").trim();
            try (InputStream is = Files.newInputStream(Paths.get(cacertsPath))) {
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
                loadCacerts = loadCacerts.trim();
            }
            if (Boolean.valueOf(loadCacerts)) {
                String cacertsPath = (System.getProperty("java.home") + "/lib/security/cacerts").trim();
                try (InputStream is = Files.newInputStream(Paths.get(cacertsPath))) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
            keyName = XMLUtils.getElementText(keyNmElem);
        }
        if (keyName == null || keyName.length() <= 0) {
            LOG.debug("No Key Name available");
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java
                certs = new X509Certificate[] {useThisCert};
            }
            if (certs == null || certs.length <= 0) {
                throw new WSSecurityException(
                        WSSecurityException.ErrorCode.FAILURE,
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
                certs = new X509Certificate[] {useThisCert};
            }
            if (certs == null || certs.length <= 0) {
                throw new WSSecurityException(
                        WSSecurityException.ErrorCode.FAILURE,
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
                }
                X509Certificate[] certs = crypto.getX509Certificates(cryptoType);
                if (certs == null || certs.length <= 0) {
                    throw new WSSecurityException(
                                                  WSSecurityException.ErrorCode.FAILURE,
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
    protected byte[] getNameConstraints(final X509Certificate cert) throws WSSecurityException {
        byte[] bytes = cert.getExtensionValue(NAME_CONSTRAINTS_OID);
        if (bytes == null || bytes.length <= 0) {
            return new byte[0];
        }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            doc.createElementNS(WSS4JConstants.XOP_NS, "xop:Include");
        try {
            xopInclude.setAttributeNS(null, "href", "cid:" + URLEncoder.encode(attachmentId, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
            throw new WSSecurityException(WSSecurityException.ErrorCode.FAILURE, e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
    public static String getAttachmentId(String xopUri) throws WSSecurityException {
        try {
            return URLDecoder.decode(xopUri.substring("cid:".length()), StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new WSSecurityException(
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'prefix != null' covered by subsequent condition '"xmlns".equals(...)'
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
                Attr attr = (Attr) namedNodeMap.item(i);
                String prefix = attr.getPrefix();
                if (prefix != null && "xmlns".equals(prefix)) {
                    xmlStreamWriter.writeNamespace(attr.getLocalName(), attr.getValue());
                } else if (prefix == null && "xmlns".equals(attr.getLocalName())) {
```

### ConditionCoveredByFurtherCondition
Condition 'typeStr != null' covered by subsequent condition 'WSSConstants.SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_CONTENT_ONLY.equals(...) \|\| WSSConstants.SWA_ATTACHM ...'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java

        String typeStr = encryptedDataType.getType();
        if (typeStr != null
            && (WSSConstants.SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_CONTENT_ONLY.equals(typeStr)
                || WSSConstants.SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_COMPLETE.equals(typeStr))) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java

        List<Integer> actions = new ArrayList<>();
        String[] single = actionToParse.split("\\s");
        for (String parsedAction : single) {
            if (parsedAction.equals(WSHandlerConstants.NO_SECURITY)) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java

            if (mimeType != null
                && (mimeType.matches("(?i)(text/xml).*")
                    || mimeType.matches("(?i)(application/xml).*")
                    || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java
            if (mimeType != null
                && (mimeType.matches("(?i)(text/xml).*")
                    || mimeType.matches("(?i)(application/xml).*")
                    || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
                /* 5.4.2:
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java
                && (mimeType.matches("(?i)(text/xml).*")
                    || mimeType.matches("(?i)(application/xml).*")
                    || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
                /* 5.4.2:
                 * Content of an XML Content-Type MUST be XML canonicalized using
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/AttachmentContentSignatureTransform.java`
#### Snippet
```java
                canon.canonicalizeXPathNodeSet(xmlSignatureInput.getNodeSet(), outputStream);

            } else if (mimeType != null && mimeType.matches("(?i)(text/).*")) {
                CRLFOutputStream crlfOutputStream = new CRLFOutputStream(outputStream); //NOPMD
                int numBytes;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/transformer/AttachmentContentSignatureTransform.java`
#### Snippet
```java

        if (mimeType != null
            && (mimeType.matches("(?i)(text/xml).*")
                || mimeType.matches("(?i)(application/xml).*")
                || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/transformer/AttachmentContentSignatureTransform.java`
#### Snippet
```java
        if (mimeType != null
            && (mimeType.matches("(?i)(text/xml).*")
                || mimeType.matches("(?i)(application/xml).*")
                || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
            /* 5.4.2:
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/transformer/AttachmentContentSignatureTransform.java`
#### Snippet
```java
            && (mimeType.matches("(?i)(text/xml).*")
                || mimeType.matches("(?i)(application/xml).*")
                || mimeType.matches("(?i)(application|image)/.*\\+xml.*"))) {
            /* 5.4.2:
             * Content of an XML Content-Type MUST be XML canonicalized using
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/transformer/AttachmentContentSignatureTransform.java`
#### Snippet
```java
            canon.transform(inputStream);

        } else if (mimeType != null && mimeType.matches("(?i)(text/).*")) {
            CRLFOutputStream crlfOutputStream = new CRLFOutputStream(getOutputStream());    //NOPMD
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            return;
        }
        String[] single = actionToParse.split("\\s");
        List<Action> actions = new ArrayList<>();
        for (int i = 0; i < single.length; i++) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
    }

    protected String findClaimInAssertion(org.opensaml.saml.saml2.core.Assertion assertion, URI claimURI) {
        List<org.opensaml.saml.saml2.core.AttributeStatement> attributeStatements =
                assertion.getAttributeStatements();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java

    protected String findClaimInAssertion(org.opensaml.saml.saml2.core.Assertion assertion, URI claimURI) {
        List<org.opensaml.saml.saml2.core.AttributeStatement> attributeStatements =
                assertion.getAttributeStatements();
        if (attributeStatements == null || attributeStatements.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        }

        for (org.opensaml.saml.saml2.core.AttributeStatement statement : attributeStatements) {
            List<org.opensaml.saml.saml2.core.Attribute> attributes = statement.getAttributes();
            for (org.opensaml.saml.saml2.core.Attribute attribute : attributes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java

        for (org.opensaml.saml.saml2.core.AttributeStatement statement : attributeStatements) {
            List<org.opensaml.saml.saml2.core.Attribute> attributes = statement.getAttributes();
            for (org.opensaml.saml.saml2.core.Attribute attribute : attributes) {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        for (org.opensaml.saml.saml2.core.AttributeStatement statement : attributeStatements) {
            List<org.opensaml.saml.saml2.core.Attribute> attributes = statement.getAttributes();
            for (org.opensaml.saml.saml2.core.Attribute attribute : attributes) {

                if (attribute.getName().equals(claimURI.toString())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
    }

    protected String findClaimInAssertion(org.opensaml.saml.saml1.core.Assertion assertion, URI claimURI) {
        List<org.opensaml.saml.saml1.core.AttributeStatement> attributeStatements =
                assertion.getAttributeStatements();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java

    protected String findClaimInAssertion(org.opensaml.saml.saml1.core.Assertion assertion, URI claimURI) {
        List<org.opensaml.saml.saml1.core.AttributeStatement> attributeStatements =
                assertion.getAttributeStatements();
        if (attributeStatements == null || attributeStatements.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        }

        for (org.opensaml.saml.saml1.core.AttributeStatement statement : attributeStatements) {

            List<org.opensaml.saml.saml1.core.Attribute> attributes = statement.getAttributes();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        for (org.opensaml.saml.saml1.core.AttributeStatement statement : attributeStatements) {

            List<org.opensaml.saml.saml1.core.Attribute> attributes = statement.getAttributes();
            for (org.opensaml.saml.saml1.core.Attribute attribute : attributes) {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java

            List<org.opensaml.saml.saml1.core.Attribute> attributes = statement.getAttributes();
            for (org.opensaml.saml.saml1.core.Attribute attribute : attributes) {

                URI attributeNamespace = URI.create(attribute.getAttributeNamespace());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java
public class PolicyEnforcerFactory {

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PolicyEnforcerFactory.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PolicyEnforcerFactory.class);

    private final List<AssertionBuilder<Element>> assertionBuilders;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
public final class STRParserUtil {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRParserUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRParserUtil.class);

    private STRParserUtil() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
                //
                return keyValue.getPublicKey();
            } catch (java.security.KeyException ex) {
                LOG.error(ex.getMessage(), ex);
                throw new WSSecurityException(WSSecurityException.ErrorCode.FAILED_CHECK, ex);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java

public final class X509Util {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509Util.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
public final class X509Util {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509Util.class);

    private X509Util() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
    //unused tokens must be checked (algorithms etc)

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PolicyEnforcer.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PolicyEnforcer.class);

    private static final QName SOAP11_FAULT = new QName(WSSConstants.NS_SOAP11, "Fault");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/DOMSAMLUtil.java`
#### Snippet
```java
public final class DOMSAMLUtil  {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSAMLUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/DOMSAMLUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSAMLUtil.class);

    private DOMSAMLUtil() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureConfirmationAction.java`
#### Snippet
```java

public class SignatureConfirmationAction implements Action {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureConfirmationAction.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureConfirmationAction.java`
#### Snippet
```java
public class SignatureConfirmationAction implements Action {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureConfirmationAction.class);

    @SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SAMLTokenSignedAction.java`
#### Snippet
```java
public class SAMLTokenSignedAction implements Action {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenSignedAction.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SAMLTokenSignedAction.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenSignedAction.class);

    public void execute(WSHandler handler, SecurityActionToken actionToken, RequestData reqData)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/UsernameTokenSignedAction.java`
#### Snippet
```java
            parts.add(WSSecurityUtil.getDefaultEncryptionPart(doc));
        }
        List<javax.xml.crypto.dsig.Reference> referenceList = sign.addReferencesToSign(parts);

        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureDerivedAction.java`
#### Snippet
```java
            wsSign.prepare(key);

            List<javax.xml.crypto.dsig.Reference> referenceList = wsSign.addReferencesToSign(wsSign.getParts());

            // Put the DerivedKeyToken Element in the right place in the security header
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureAction.java`
#### Snippet
```java
            }

            List<javax.xml.crypto.dsig.Reference> referenceList = wsSign.addReferencesToSign(parts);

            if (signBST
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSecurityEngine.java`
#### Snippet
```java
 */
public class WSSecurityEngine {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecurityEngine.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSecurityEngine.java`
#### Snippet
```java
public class WSSecurityEngine {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecurityEngine.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
    private static boolean isSAAJ14 = false;

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecurityUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecurityUtil.class);

    private static final ClassValue<Method> GET_DOM_ELEMENTS_METHODS = new ClassValue<Method>() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSecurityEngineResult.java`
#### Snippet
```java


public class WSSecurityEngineResult extends java.util.HashMap<String, Object> {

    //
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecUsernameToken.java`
#### Snippet
```java
 */
public class WSSecUsernameToken extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecUsernameToken.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecUsernameToken.java`
#### Snippet
```java
public class WSSecUsernameToken extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecUsernameToken.class);

    private String passwordType = WSConstants.PASSWORD_DIGEST;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.utils` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecUsernameToken.java`
#### Snippet
```java
        }
        if (passwordsAreEncoded) {
            return UsernameTokenUtil.generateDerivedKey(org.apache.xml.security.utils.XMLUtils.decode(password),
                                                        saltValue, iteration);
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSAMLToken.java`
#### Snippet
```java
public class WSSecSAMLToken extends WSSecBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSAMLToken.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSAMLToken.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSAMLToken.class);

    private SamlAssertionWrapper saml;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
    ) throws WSSecurityException {
        try {
            java.security.Key key;
            if (senderVouches) {
                key = issuerCrypto.getPrivateKey(issuerKeyName, issuerKeyPW);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
    private void addIssuerSerial(X509Certificate cert, SecurityTokenReference secRef, boolean isQuoteDelimited) {
        final String issuer = cert.getIssuerDN().getName();
        final java.math.BigInteger serialNumber = cert.getSerialNumber();
        final DOMX509IssuerSerial domIssuerSerial =
                new DOMX509IssuerSerial(getDocument(), issuer, serialNumber, isQuoteDelimited);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
public class WSSecSignatureSAML extends WSSecSignature {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureSAML.class);
    private boolean senderVouches;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureSAML.class);
    private boolean senderVouches;
    private SecurityTokenReference secRefSaml;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecTimestamp.java`
#### Snippet
```java

public class WSSecTimestamp extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecTimestamp.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecTimestamp.java`
#### Snippet
```java
public class WSSecTimestamp extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecTimestamp.class);

    private Timestamp ts;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.transform` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
                        WSProviderConfig.appendJceProvider(
                            "STRTransform",
                            new org.apache.wss4j.dom.transform.STRTransformProvider()
                        );

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.UT,
                org.apache.wss4j.dom.action.UsernameTokenAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.UT_NOPASSWORD,
                org.apache.wss4j.dom.action.UsernameTokenAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ENCR,
                org.apache.wss4j.dom.action.EncryptionAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SIGN,
                org.apache.wss4j.dom.action.SignatureAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.DKT_SIGN,
                org.apache.wss4j.dom.action.SignatureDerivedAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.DKT_ENCR,
                org.apache.wss4j.dom.action.EncryptionDerivedAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ST_SIGNED,
                org.apache.wss4j.dom.action.SAMLTokenSignedAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ST_UNSIGNED,
                org.apache.wss4j.dom.action.SAMLTokenUnsignedAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.TS,
                org.apache.wss4j.dom.action.TimestampAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.UT_SIGN,
                org.apache.wss4j.dom.action.UsernameTokenSignedAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SC,
                org.apache.wss4j.dom.action.SignatureConfirmationAction.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.action` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.CUSTOM_TOKEN,
                org.apache.wss4j.dom.action.CustomTokenAction.class
            );
        } catch (final Exception ex) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            LOG.debug(ex.getMessage(), ex);
        }
        DEFAULT_ACTIONS = java.util.Collections.unmodifiableMap(tmp);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SAML_TOKEN,
                org.apache.wss4j.dom.processor.SAMLTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SAML2_TOKEN,
                org.apache.wss4j.dom.processor.SAMLTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ENCRYPTED_ASSERTION,
                org.apache.wss4j.dom.processor.EncryptedAssertionProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ENCRYPTED_KEY,
                org.apache.wss4j.dom.processor.EncryptedKeyProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SIGNATURE,
                org.apache.wss4j.dom.processor.SignatureProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.TIMESTAMP,
                org.apache.wss4j.dom.processor.TimestampProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.USERNAME_TOKEN,
                org.apache.wss4j.dom.processor.UsernameTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.REFERENCE_LIST,
                org.apache.wss4j.dom.processor.ReferenceListProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SIGNATURE_CONFIRMATION,
                org.apache.wss4j.dom.processor.SignatureConfirmationProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.DERIVED_KEY_TOKEN_05_02,
                org.apache.wss4j.dom.processor.DerivedKeyTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SECURITY_CONTEXT_TOKEN_05_02,
                org.apache.wss4j.dom.processor.SecurityContextTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.BINARY_TOKEN,
                org.apache.wss4j.dom.processor.BinarySecurityTokenProcessor.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.processor` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.ENCRYPTED_DATA,
                org.apache.wss4j.dom.processor.EncryptedDataProcessor.class
            );
        } catch (final Exception ex) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            LOG.debug(ex.getMessage(), ex);
        }
        DEFAULT_PROCESSORS = java.util.Collections.unmodifiableMap(tmp);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.validate` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SAML_TOKEN,
                org.apache.wss4j.dom.validate.SamlAssertionValidator.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.validate` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SAML2_TOKEN,
                org.apache.wss4j.dom.validate.SamlAssertionValidator.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.validate` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.SIGNATURE,
                org.apache.wss4j.dom.validate.SignatureTrustValidator.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.validate` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.TIMESTAMP,
                org.apache.wss4j.dom.validate.TimestampValidator.class
            );
            tmp.put(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.dom.validate` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            tmp.put(
                WSConstants.USERNAME_TOKEN,
                org.apache.wss4j.dom.validate.UsernameTokenValidator.class
            );
        } catch (final Exception ex) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            LOG.debug(ex.getMessage(), ex);
        }
        DEFAULT_VALIDATORS = java.util.Collections.unmodifiableMap(tmp);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
    }

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSConfig.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSConfig.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureConfirmation.java`
#### Snippet
```java
 */
public class WSSecSignatureConfirmation extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureConfirmation.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureConfirmation.java`
#### Snippet
```java
public class WSSecSignatureConfirmation extends WSSecBase {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureConfirmation.class);

    private SignatureConfirmation sc;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncrypt.java`
#### Snippet
```java
 */
public class WSSecEncrypt extends WSSecEncryptedKey {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecEncrypt.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncrypt.java`
#### Snippet
```java
public class WSSecEncrypt extends WSSecEncryptedKey {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecEncrypt.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java
public abstract class WSSecDerivedKeyBase extends WSSecSignatureBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecDerivedKeyBase.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecDerivedKeyBase.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
    }

    private List<javax.xml.crypto.dsig.Reference> addAttachmentReferences(
        WSEncryptionPart encPart,
        DigestMethod digestMethod,
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
        }

        List<javax.xml.crypto.dsig.Reference> attachmentReferenceList = new ArrayList<>();
        if (attachmentRequestCallback.getAttachments() != null) {
            for (Attachment attachment : attachmentRequestCallback.getAttachments()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
                        );

                    javax.xml.crypto.dsig.Reference reference =
                        signatureFactory.newReference(
                            "cid:" + attachment.getId(), digestMethod, transforms, null, null
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
public class WSSecSignatureBase extends WSSecBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureBase.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignatureBase.class);

    private List<Element> clonedElements = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
     * @throws WSSecurityException
     */
    public List<javax.xml.crypto.dsig.Reference> addReferencesToSign(
        Document doc,
        List<WSEncryptionPart> references,
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
        //create separate list for attachment and append it after same document references
        //are processed.
        List<javax.xml.crypto.dsig.Reference> attachmentReferenceList = null;
        List<javax.xml.crypto.dsig.Reference> referenceList = new ArrayList<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
        //are processed.
        List<javax.xml.crypto.dsig.Reference> attachmentReferenceList = null;
        List<javax.xml.crypto.dsig.Reference> referenceList = new ArrayList<>();

        for (WSEncryptionPart encPart : references) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
                        continue;
                    }
                    javax.xml.crypto.dsig.Reference reference =
                        signatureFactory.newReference(
                            "#" + idToSign,
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureBase.java`
#### Snippet
```java
                                transformSpec
                            );
                        javax.xml.crypto.dsig.Reference reference =
                            signatureFactory.newReference(
                                "#" + wsuId,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
    ) throws WSSecurityException {
        try {
            java.security.Key key = getDerivedKey(sigAlgo);
            SignatureMethod signatureMethod =
                signatureFactory.newSignatureMethod(sigAlgo, null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
public class WSSecDKSign extends WSSecDerivedKeyBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecDKSign.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecDKSign.class);

    private String sigAlgo = WSConstants.HMAC_SHA1;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
        keyInfo =
            keyInfoFactory.newKeyInfo(
                java.util.Collections.singletonList(structure), keyInfoUri
            );

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
    ) throws WSSecurityException {
        try {
            java.security.Key key;
            if (secretKey == null) {
                key = crypto.getPrivateKey(user, password);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
    private void addIssuerSerial(X509Certificate[] certs,boolean isCommaDelimited) throws WSSecurityException {
        String issuer = certs[0].getIssuerX500Principal().getName();
        java.math.BigInteger serialNumber = certs[0].getSerialNumber();

        DOMX509IssuerSerial domIssuerSerial
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java

            case WSConstants.KEY_VALUE:
                java.security.PublicKey publicKey = certs[0].getPublicKey();

                try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
                    keyInfo =
                        keyInfoFactory.newKeyInfo(Collections.singletonList(keyValue), keyInfoUri);
                } catch (java.security.KeyException ex) {
                    LOG.error("", ex);
                    throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
public class WSSecSignature extends WSSecSignatureBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignature.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecSignature.class);

    protected XMLSignatureFactory signatureFactory;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
public class KerberosSecurity extends BinarySecurity {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosSecurity.class);
    private SecretKey secretKey;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosSecurity.class);
    private SecretKey secretKey;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
                        KeyInfo keyInfo =
                            keyInfoFactory.newKeyInfo(
                                java.util.Collections.singletonList(keyValue), keyInfoUri
                            );

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java

                        keyInfo.marshal(new DOMStructure(encryptedKeyElement), null);
                    } catch (java.security.KeyException | MarshalException ex) {
                        LOG.error("", ex);
                        throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
            throws WSSecurityException {
        String issuer = remoteCert.getIssuerX500Principal().getName();
        java.math.BigInteger serialNumber = remoteCert.getSerialNumber();
        DOMX509IssuerSerial domIssuerSerial =
                new DOMX509IssuerSerial(getDocument(), issuer, serialNumber, isCommaDelimited);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
public class WSSecEncryptedKey extends WSSecBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecEncryptedKey.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSecEncryptedKey.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/UsernameTokenValidator.java`
#### Snippet
```java
public class UsernameTokenValidator implements Validator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameTokenValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/UsernameTokenValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameTokenValidator.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java
public class JAASUsernameTokenValidator implements Validator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JAASUsernameTokenValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/JAASUsernameTokenValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JAASUsernameTokenValidator.class);

    private String contextName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/SignatureTrustValidator.java`
#### Snippet
```java
public class SignatureTrustValidator implements Validator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureTrustValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/SignatureTrustValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureTrustValidator.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureConfirmationProcessor.java`
#### Snippet
```java

public class SignatureConfirmationProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureConfirmationProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureConfirmationProcessor.java`
#### Snippet
```java
public class SignatureConfirmationProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureConfirmationProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureConfirmationProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addResult(result);
        data.getWsDocInfo().addTokenElement(elem);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
 */
public abstract class WSHandler {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSHandler.class);
    protected Map<String, Crypto> cryptos = new ConcurrentHashMap<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
public abstract class WSHandler {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSHandler.class);
    protected Map<String, Crypto> cryptos = new ConcurrentHashMap<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
        new QName(WSConstants.WSSE_NS, WSConstants.USERNAME_TOKEN_LN);

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameToken.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameToken.class);

    private Element element;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java
            if (elem.equals(foundElement)) {
                WSSecurityEngineResult result = data.getWsDocInfo().getResult(id);
                return java.util.Collections.singletonList(result);
            } else if (foundElement != null) {
                throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/BinarySecurityTokenProcessor.java`
#### Snippet
```java

        data.getWsDocInfo().addResult(result);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/KerberosTokenValidator.java`
#### Snippet
```java
public class KerberosTokenValidator implements Validator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosTokenValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/KerberosTokenValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosTokenValidator.class);

    private String serviceName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/SamlAssertionValidator.java`
#### Snippet
```java
public class SamlAssertionValidator extends SignatureTrustValidator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlAssertionValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/validate/SamlAssertionValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlAssertionValidator.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SecurityContextTokenProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addTokenElement(elem);
        data.getWsDocInfo().addResult(result);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/TimestampProcessor.java`
#### Snippet
```java

public class TimestampProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(TimestampProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/TimestampProcessor.java`
#### Snippet
```java
public class TimestampProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(TimestampProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/TimestampProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addTokenElement(elem);
        data.getWsDocInfo().addResult(result);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedAssertionProcessor.java`
#### Snippet
```java
public class EncryptedAssertionProcessor implements Processor {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedAssertionProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedAssertionProcessor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedAssertionProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
public class DerivedKeyToken {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DerivedKeyToken.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DerivedKeyToken.class);

    // These are the elements that are used to create the SecurityContextToken
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java

public class SAMLTokenProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenProcessor.class);
    private XMLSignatureFactory signatureFactory;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
public class SAMLTokenProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenProcessor.class);
    private XMLSignatureFactory signatureFactory;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
        if (elem.equals(foundElement)) {
            WSSecurityEngineResult result = data.getWsDocInfo().getResult(id);
            return java.util.Collections.singletonList(result);
        } else if (foundElement != null) {
            throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
        }
        data.getWsDocInfo().addResult(result);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java
            if (elem.equals(foundElement)) {
                WSSecurityEngineResult result = data.getWsDocInfo().getResult(id);
                return java.util.Collections.singletonList(result);
            } else if (foundElement != null) {
                throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addTokenElement(elem);
        data.getWsDocInfo().addResult(result);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java

public class UsernameTokenProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameTokenProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/UsernameTokenProcessor.java`
#### Snippet
```java
public class UsernameTokenProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(UsernameTokenProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedDataProcessor.java`
#### Snippet
```java
public class EncryptedDataProcessor implements Processor {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedDataProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedDataProcessor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedDataProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/ReferenceListProcessor.java`
#### Snippet
```java

public class ReferenceListProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ReferenceListProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/ReferenceListProcessor.java`
#### Snippet
```java
public class ReferenceListProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ReferenceListProcessor.class);

    public List<WSSecurityEngineResult> handleToken(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransformUtil.java`
#### Snippet
```java
 */
public final class STRTransformUtil {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRTransformUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransformUtil.java`
#### Snippet
```java
public final class STRTransformUtil {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRTransformUtil.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/SignatureEncryptionActionToken.java`
#### Snippet
```java
public abstract class SignatureEncryptionActionToken implements SecurityActionToken {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureEncryptionActionToken.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/SignatureEncryptionActionToken.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureEncryptionActionToken.class);

    private X509Certificate certificate;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/NamePasswordCallbackHandler.java`
#### Snippet
```java
public class NamePasswordCallbackHandler implements CallbackHandler {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NamePasswordCallbackHandler.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/NamePasswordCallbackHandler.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NamePasswordCallbackHandler.class);

    private static final String PASSWORD_CALLBACK_NAME = "setObject";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/bsp/BSPEnforcer.java`
#### Snippet
```java
public class BSPEnforcer {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(BSPEnforcer.class);

    private List<BSPRule> ignoredBSPRules = Collections.emptyList();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/bsp/BSPEnforcer.java`
#### Snippet
```java
public class BSPEnforcer {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(BSPEnforcer.class);

    private List<BSPRule> ignoredBSPRules = Collections.emptyList();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dom` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
            throw new ClassCastException("context must be of type DOMCryptoContext");
        }
        if (!(parent instanceof javax.xml.crypto.dom.DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dom` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
        }
        transformElement = (Element)
            ((javax.xml.crypto.dom.DOMStructure) parent).getNode();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
    private Element transformElement;

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRTransform.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(STRTransform.class);

    public final AlgorithmParameterSpec getParameterSpec() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dom` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
            throw new ClassCastException("context must be of type DOMCryptoContext");
        }
        if (!(parent instanceof javax.xml.crypto.dom.DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dom` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransform.java`
#### Snippet
```java
        }
        Element transformElement2 = (Element)
            ((javax.xml.crypto.dom.DOMStructure) parent).getNode();
        appendChild(transformElement2, transformElement);
        transformElement = transformElement2;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.core.xml.schema.impl` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/WSS4JXSBase64BinaryUnmarshaller.java`
#### Snippet
```java
 * https://issues.apache.org/jira/browse/WSS-695
 */
public final class WSS4JXSBase64BinaryUnmarshaller extends org.opensaml.core.xml.schema.impl.XSBase64BinaryUnmarshaller {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java

public class EncryptedKeyProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedKeyProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
public class EncryptedKeyProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptedKeyProcessor.class);

    private final Provider provider;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
     */
    public static SAMLKeyInfo getCredentialFromSubject(
        org.opensaml.saml.saml2.core.Assertion assertion,
        SAMLKeyInfoProcessor keyInfoProcessor,
        Crypto sigCrypto
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        Crypto sigCrypto
    ) throws WSSecurityException {
        org.opensaml.saml.saml2.core.Subject samlSubject = assertion.getSubject();
        if (samlSubject != null) {
            List<org.opensaml.saml.saml2.core.SubjectConfirmation> subjectConfList =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        org.opensaml.saml.saml2.core.Subject samlSubject = assertion.getSubject();
        if (samlSubject != null) {
            List<org.opensaml.saml.saml2.core.SubjectConfirmation> subjectConfList =
                samlSubject.getSubjectConfirmations();
            for (org.opensaml.saml.saml2.core.SubjectConfirmation subjectConfirmation : subjectConfList) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            List<org.opensaml.saml.saml2.core.SubjectConfirmation> subjectConfList =
                samlSubject.getSubjectConfirmations();
            for (org.opensaml.saml.saml2.core.SubjectConfirmation subjectConfirmation : subjectConfList) {
                SubjectConfirmationData subjConfData =
                    subjectConfirmation.getSubjectConfirmationData();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
     */
    public static SAMLKeyInfo getCredentialFromSubject(
        org.opensaml.saml.saml1.core.Assertion assertion,
        SAMLKeyInfoProcessor keyInfoProcessor,
        Crypto sigCrypto
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        Crypto sigCrypto
    ) throws WSSecurityException {
        for (org.opensaml.saml.saml1.core.Statement stmt : assertion.getStatements()) {
            org.opensaml.saml.saml1.core.Subject samlSubject = null;
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
    ) throws WSSecurityException {
        for (org.opensaml.saml.saml1.core.Statement stmt : assertion.getStatements()) {
            org.opensaml.saml.saml1.core.Subject samlSubject = null;
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
                org.opensaml.saml.saml1.core.AttributeStatement attrStmt =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        for (org.opensaml.saml.saml1.core.Statement stmt : assertion.getStatements()) {
            org.opensaml.saml.saml1.core.Subject samlSubject = null;
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
                org.opensaml.saml.saml1.core.AttributeStatement attrStmt =
                    (org.opensaml.saml.saml1.core.AttributeStatement) stmt;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            org.opensaml.saml.saml1.core.Subject samlSubject = null;
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
                org.opensaml.saml.saml1.core.AttributeStatement attrStmt =
                    (org.opensaml.saml.saml1.core.AttributeStatement) stmt;
                samlSubject = attrStmt.getSubject();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            if (stmt instanceof org.opensaml.saml.saml1.core.AttributeStatement) {
                org.opensaml.saml.saml1.core.AttributeStatement attrStmt =
                    (org.opensaml.saml.saml1.core.AttributeStatement) stmt;
                samlSubject = attrStmt.getSubject();
            } else if (stmt instanceof org.opensaml.saml.saml1.core.AuthenticationStatement) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
                    (org.opensaml.saml.saml1.core.AttributeStatement) stmt;
                samlSubject = attrStmt.getSubject();
            } else if (stmt instanceof org.opensaml.saml.saml1.core.AuthenticationStatement) {
                org.opensaml.saml.saml1.core.AuthenticationStatement authStmt =
                    (org.opensaml.saml.saml1.core.AuthenticationStatement) stmt;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
                samlSubject = attrStmt.getSubject();
            } else if (stmt instanceof org.opensaml.saml.saml1.core.AuthenticationStatement) {
                org.opensaml.saml.saml1.core.AuthenticationStatement authStmt =
                    (org.opensaml.saml.saml1.core.AuthenticationStatement) stmt;
                samlSubject = authStmt.getSubject();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            } else if (stmt instanceof org.opensaml.saml.saml1.core.AuthenticationStatement) {
                org.opensaml.saml.saml1.core.AuthenticationStatement authStmt =
                    (org.opensaml.saml.saml1.core.AuthenticationStatement) stmt;
                samlSubject = authStmt.getSubject();
            } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
                samlSubject = authStmt.getSubject();
            } else {
                org.opensaml.saml.saml1.core.AuthorizationDecisionStatement authzStmt =
                    (org.opensaml.saml.saml1.core.AuthorizationDecisionStatement)stmt;
                samlSubject = authzStmt.getSubject();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            } else {
                org.opensaml.saml.saml1.core.AuthorizationDecisionStatement authzStmt =
                    (org.opensaml.saml.saml1.core.AuthorizationDecisionStatement)stmt;
                samlSubject = authzStmt.getSubject();
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig.keyinfo` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java

        try {
            javax.xml.crypto.dsig.keyinfo.KeyInfo keyInfo =
                keyInfoFactory.unmarshalKeyInfo(keyInfoStructure);
            List<?> list = keyInfo.getContent();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                    if (dereferencedData instanceof NodeSetData) {
                        NodeSetData data = (NodeSetData)dereferencedData;
                        java.util.Iterator<?> iter = data.iterator();

                        while (iter.hasNext()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                    xmlSignature.getSignatureValue().validate(context);
                LOG.debug("Signature Validation check: " + signatureValidationCheck);
                java.util.Iterator<?> referenceIterator =
                    xmlSignature.getSignedInfo().getReferences().iterator();
                while (referenceIterator.hasNext()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        data.getWsDocInfo().addResult(result);
        data.getWsDocInfo().addTokenElement(elem);
        return java.util.Collections.singletonList(result);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
                NodeSetData data = (NodeSetData)siRef.getDereferencedData();
                if (data != null) {
                    java.util.Iterator<?> iter = data.iterator();

                    Node securityTokenReference = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java

public class SignatureProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
public class SignatureProcessor implements Processor {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureProcessor.class);

    private XMLSignatureFactory signatureFactory;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        WSDocInfo wsDocInfo
    ) throws WSSecurityException {
        java.util.Iterator<?> referenceIterator =
            xmlSignature.getSignedInfo().getReferences().iterator();
        CallbackLookup callbackLookup = wsDocInfo.getCallbackLookup();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java

    private static void signXMLObject(XMLObject xmlObject) throws WSSecurityException {
        if (xmlObject instanceof org.opensaml.saml.saml1.core.Response) {
            org.opensaml.saml.saml1.core.Response response =
                    (org.opensaml.saml.saml1.core.Response)xmlObject;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
    private static void signXMLObject(XMLObject xmlObject) throws WSSecurityException {
        if (xmlObject instanceof org.opensaml.saml.saml1.core.Response) {
            org.opensaml.saml.saml1.core.Response response =
                    (org.opensaml.saml.saml1.core.Response)xmlObject;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
        if (xmlObject instanceof org.opensaml.saml.saml1.core.Response) {
            org.opensaml.saml.saml1.core.Response response =
                    (org.opensaml.saml.saml1.core.Response)xmlObject;

            // Sign any Assertions
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
            // Sign any Assertions
            if (response.getAssertions() != null) {
                for (org.opensaml.saml.saml1.core.Assertion assertion : response.getAssertions()) {
                    signObject(assertion.getSignature());
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java

            signObject(response.getSignature());
        } else if (xmlObject instanceof org.opensaml.saml.saml2.core.Response) {
            org.opensaml.saml.saml2.core.Response response =
                    (org.opensaml.saml.saml2.core.Response)xmlObject;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
            signObject(response.getSignature());
        } else if (xmlObject instanceof org.opensaml.saml.saml2.core.Response) {
            org.opensaml.saml.saml2.core.Response response =
                    (org.opensaml.saml.saml2.core.Response)xmlObject;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
        } else if (xmlObject instanceof org.opensaml.saml.saml2.core.Response) {
            org.opensaml.saml.saml2.core.Response response =
                    (org.opensaml.saml.saml2.core.Response)xmlObject;

            // Sign any Assertions
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
            // Sign any Assertions
            if (response.getAssertions() != null) {
                for (org.opensaml.saml.saml2.core.Assertion assertion : response.getAssertions()) {
                    signObject(assertion.getSignature());
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
 */
public final class OpenSAMLUtil {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(OpenSAMLUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
public final class OpenSAMLUtil {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(OpenSAMLUtil.class);

    private static XMLObjectProviderRegistry providerRegistry;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DateUtil.java`
#### Snippet
```java
public final class DateUtil {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DateUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/DateUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DateUtil.class);

    private static final DateTimeFormatter MILLISECOND_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
    public static final int DEFAULT_ITERATION = 1000;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsernameTokenUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsernameTokenUtil.class);

    private UsernameTokenUtil() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
     * Field LOG
     */
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlAssertionWrapper.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
     */
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlAssertionWrapper.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlVersion == SAMLVersion.VERSION_20) {
            org.opensaml.saml.saml2.core.Subject subject =
                ((org.opensaml.saml.saml2.core.Assertion)samlObject).getSubject();
            List<org.opensaml.saml.saml2.core.SubjectConfirmation> confirmations =
                subject.getSubjectConfirmations();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        } else if (samlVersion == SAMLVersion.VERSION_11) {
            List<SubjectStatement> subjectStatements = new ArrayList<>();
            org.opensaml.saml.saml1.core.Assertion saml1 =
                (org.opensaml.saml.saml1.core.Assertion)samlObject;
            subjectStatements.addAll(saml1.getSubjectStatements());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            List<SubjectStatement> subjectStatements = new ArrayList<>();
            org.opensaml.saml.saml1.core.Assertion saml1 =
                (org.opensaml.saml.saml1.core.Assertion)samlObject;
            subjectStatements.addAll(saml1.getSubjectStatements());
            subjectStatements.addAll(saml1.getAuthenticationStatements());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
     * @return the saml1 (type Assertion) of this SamlAssertionWrapper object.
     */
    public org.opensaml.saml.saml1.core.Assertion getSaml1() {
        if (samlVersion == SAMLVersion.VERSION_11) {
            return (org.opensaml.saml.saml1.core.Assertion)samlObject;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
    public org.opensaml.saml.saml1.core.Assertion getSaml1() {
        if (samlVersion == SAMLVersion.VERSION_11) {
            return (org.opensaml.saml.saml1.core.Assertion)samlObject;
        }
        return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlVersion.equals(SAMLVersion.VERSION_11)) {
            // Build a SAML v1.1 assertion
            org.opensaml.saml.saml1.core.Assertion saml1 =
                SAML1ComponentBuilder.createSamlv1Assertion(issuer);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java

                // Build the complete assertion
                org.opensaml.saml.saml1.core.Conditions conditions =
                    SAML1ComponentBuilder.createSamlv1Conditions(samlCallback.getConditions());
                saml1.setConditions(conditions);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java

                if (samlCallback.getAdvice() != null) {
                    org.opensaml.saml.saml1.core.Advice advice =
                        SAML1ComponentBuilder.createAdvice(samlCallback.getAdvice());
                    saml1.setAdvice(advice);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        } else if (samlVersion.equals(SAMLVersion.VERSION_20)) {
            // Build a SAML v2.0 assertion
            org.opensaml.saml.saml2.core.Assertion saml2 = SAML2ComponentBuilder.createAssertion();
            Issuer samlIssuer = SAML2ComponentBuilder.createIssuer(issuer, issuerFormat, issuerQualifier);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            }

            org.opensaml.saml.saml2.core.Conditions conditions =
                SAML2ComponentBuilder.createConditions(samlCallback.getConditions());
            saml2.setConditions(conditions);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java

            if (samlCallback.getAdvice() != null) {
                org.opensaml.saml.saml2.core.Advice advice =
                    SAML2ComponentBuilder.createAdvice(samlCallback.getAdvice());
                saml2.setAdvice(advice);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
    public String getIssuerString() {
        if (samlVersion == SAMLVersion.VERSION_20
            && ((org.opensaml.saml.saml2.core.Assertion)samlObject).getIssuer() != null) {
            return ((org.opensaml.saml.saml2.core.Assertion)samlObject).getIssuer().getValue();
        } else if (samlVersion == SAMLVersion.VERSION_11
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlVersion == SAMLVersion.VERSION_20
            && ((org.opensaml.saml.saml2.core.Assertion)samlObject).getIssuer() != null) {
            return ((org.opensaml.saml.saml2.core.Assertion)samlObject).getIssuer().getValue();
        } else if (samlVersion == SAMLVersion.VERSION_11
            && ((org.opensaml.saml.saml1.core.Assertion)samlObject).getIssuer() != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return ((org.opensaml.saml.saml2.core.Assertion)samlObject).getIssuer().getValue();
        } else if (samlVersion == SAMLVersion.VERSION_11
            && ((org.opensaml.saml.saml1.core.Assertion)samlObject).getIssuer() != null) {
            return ((org.opensaml.saml.saml1.core.Assertion)samlObject).getIssuer();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        } else if (samlVersion == SAMLVersion.VERSION_11
            && ((org.opensaml.saml.saml1.core.Assertion)samlObject).getIssuer() != null) {
            return ((org.opensaml.saml.saml1.core.Assertion)samlObject).getIssuer();
        }
        LOG.error(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
     * @return the saml2 (type Assertion) of this SamlAssertionWrapper object.
     */
    public org.opensaml.saml.saml2.core.Assertion getSaml2() {
        if (samlVersion == SAMLVersion.VERSION_20) {
            return (org.opensaml.saml.saml2.core.Assertion)samlObject;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
    public org.opensaml.saml.saml2.core.Assertion getSaml2() {
        if (samlVersion == SAMLVersion.VERSION_20) {
            return (org.opensaml.saml.saml2.core.Assertion)samlObject;
        }
        return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java

        this.samlObject = samlObject;
        if (samlObject instanceof org.opensaml.saml.saml1.core.Assertion) {
            samlVersion = SAMLVersion.VERSION_11;
        } else if (samlObject instanceof org.opensaml.saml.saml2.core.Assertion) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlObject instanceof org.opensaml.saml.saml1.core.Assertion) {
            samlVersion = SAMLVersion.VERSION_11;
        } else if (samlObject instanceof org.opensaml.saml.saml2.core.Assertion) {
            samlVersion = SAMLVersion.VERSION_20;
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            LOG.debug(
                "The SAML version was null in getSamlVersion(). Recomputing SAML version...");
            if (samlObject instanceof org.opensaml.saml.saml1.core.Assertion) {
                samlVersion = SAMLVersion.VERSION_11;
            } else if (samlObject instanceof org.opensaml.saml.saml2.core.Assertion) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            if (samlObject instanceof org.opensaml.saml.saml1.core.Assertion) {
                samlVersion = SAMLVersion.VERSION_11;
            } else if (samlObject instanceof org.opensaml.saml.saml2.core.Assertion) {
                samlVersion = SAMLVersion.VERSION_20;
            } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        String id = null;
        if (samlVersion == SAMLVersion.VERSION_20) {
            id = ((org.opensaml.saml.saml2.core.Assertion)samlObject).getID();
            if (id == null || id.length() == 0) {
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
                id = IDGenerator.generateID("_");
                ((org.opensaml.saml.saml2.core.Assertion)samlObject).setID(id);
            }
        } else if (samlVersion == SAMLVersion.VERSION_11) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            }
        } else if (samlVersion == SAMLVersion.VERSION_11) {
            id = ((org.opensaml.saml.saml1.core.Assertion)samlObject).getID();
            if (id == null || id.length() == 0) {
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                LOG.error("SamlAssertionWrapper: ID was null, seeting a new ID value");
                id = IDGenerator.generateID("_");
                ((org.opensaml.saml.saml1.core.Assertion)samlObject).setID(id);
            }
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java

        if (getSamlVersion().equals(SAMLVersion.VERSION_20) && getSaml2().getConditions() != null) {
            org.opensaml.saml.saml2.core.Conditions conditions = getSaml2().getConditions();
            if (conditions != null && conditions.getAudienceRestrictions() != null
                && !conditions.getAudienceRestrictions().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                && !conditions.getAudienceRestrictions().isEmpty()) {
                boolean foundAddress = false;
                for (org.opensaml.saml.saml2.core.AudienceRestriction audienceRestriction
                    : conditions.getAudienceRestrictions()) {
                    if (audienceRestriction.getAudiences() != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                    : conditions.getAudienceRestrictions()) {
                    if (audienceRestriction.getAudiences() != null) {
                        List<org.opensaml.saml.saml2.core.Audience> audiences =
                            audienceRestriction.getAudiences();
                        for (org.opensaml.saml.saml2.core.Audience audience : audiences) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
 */
public class NSStack {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NSStack.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
public class NSStack {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NSStack.class);

    private Mapping[] stack;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                        List<org.opensaml.saml.saml2.core.Audience> audiences =
                            audienceRestriction.getAudiences();
                        for (org.opensaml.saml.saml2.core.Audience audience : audiences) {
                            String audienceURI = audience.getURI();
                            if (audienceRestrictions.contains(audienceURI)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            }
        } else if (getSamlVersion().equals(SAMLVersion.VERSION_11) && getSaml1().getConditions() != null) {
            org.opensaml.saml.saml1.core.Conditions conditions = getSaml1().getConditions();
            if (conditions != null && conditions.getAudienceRestrictionConditions() != null
                && !conditions.getAudienceRestrictionConditions().isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                && !conditions.getAudienceRestrictionConditions().isEmpty()) {
                boolean foundAddress = false;
                for (org.opensaml.saml.saml1.core.AudienceRestrictionCondition audienceRestriction
                    : conditions.getAudienceRestrictionConditions()) {
                    if (audienceRestriction.getAudiences() != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                    : conditions.getAudienceRestrictionConditions()) {
                    if (audienceRestriction.getAudiences() != null) {
                        List<org.opensaml.saml.saml1.core.Audience> audiences =
                            audienceRestriction.getAudiences();
                        for (org.opensaml.saml.saml1.core.Audience audience : audiences) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                        List<org.opensaml.saml.saml1.core.Audience> audiences =
                            audienceRestriction.getAudiences();
                        for (org.opensaml.saml.saml1.core.Audience audience : audiences) {
                            String audienceURI = audience.getURI();
                            if (audienceRestrictions.contains(audienceURI)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            subjectKeyInfo =
                SAMLUtil.getCredentialFromSubject(
                    (org.opensaml.saml.saml1.core.Assertion)samlObject, keyInfoProcessor, sigCrypto
                );
        } else if (samlVersion == SAMLVersion.VERSION_20) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            subjectKeyInfo =
                SAMLUtil.getCredentialFromSubject(
                    (org.opensaml.saml.saml2.core.Assertion)samlObject, keyInfoProcessor, sigCrypto
                );
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
    private void parseElement(Element element) throws WSSecurityException {
        XMLObject xmlObject = OpenSAMLUtil.fromDom(element);
        if (xmlObject instanceof org.opensaml.saml.saml1.core.Assertion) {
            this.samlObject = (SAMLObject)xmlObject;
            samlVersion = SAMLVersion.VERSION_11;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            this.samlObject = (SAMLObject)xmlObject;
            samlVersion = SAMLVersion.VERSION_11;
        } else if (xmlObject instanceof org.opensaml.saml.saml2.core.Assertion) {
            this.samlObject = (SAMLObject)xmlObject;
            samlVersion = SAMLVersion.VERSION_20;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml2.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        if (samlVersion == SAMLVersion.VERSION_20) {
            org.opensaml.saml.saml2.core.Subject subject =
                ((org.opensaml.saml.saml2.core.Assertion)samlObject).getSubject();
            if (subject != null && subject.getNameID() != null) {
                return subject.getNameID().getValue();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.opensaml.saml.saml1.core` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
        } else if (samlVersion == SAMLVersion.VERSION_11) {
            Subject samlSubject = null;
            for (Statement stmt : ((org.opensaml.saml.saml1.core.Assertion)samlObject).getStatements()) {
                if (stmt instanceof AttributeStatement) {
                    AttributeStatement attrStmt = (AttributeStatement) stmt;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java

public final class KeyUtils {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KeyUtils.class);
    private static final int MAX_SYMMETRIC_KEY_SIZE = 1024;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java
public final class KeyUtils {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KeyUtils.class);
    private static final int MAX_SYMMETRIC_KEY_SIZE = 1024;
    private static final Map<String, Integer> DEFAULT_DERIVED_KEY_LENGTHS = new HashMap<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/WSS4JCacheUtil.java`
#### Snippet
```java
public final class WSS4JCacheUtil {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSS4JCacheUtil.class);
    private static final boolean EH_CACHE_INSTALLED;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/WSS4JCacheUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSS4JCacheUtil.class);
    private static final boolean EH_CACHE_INSTALLED;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
 */
public final class Loader {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(Loader.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
public final class Loader {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(Loader.class);

    private Loader() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheReplayCache.java`
#### Snippet
```java
public class EHCacheReplayCache implements ReplayCache {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EHCacheReplayCache.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheReplayCache.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EHCacheReplayCache.class);

    private final Cache<String, EHCacheValue> cache;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java
    public static final QName TOKEN_BST = new QName(WSS4JConstants.WSSE_NS, "BinarySecurityToken");
    public static final QName TOKEN_KI = new QName(WSS4JConstants.WSSE_NS, "KeyIdentifier");
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(BinarySecurity.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/BinarySecurity.java`
#### Snippet
```java
    public static final QName TOKEN_KI = new QName(WSS4JConstants.WSSE_NS, "KeyIdentifier");
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(BinarySecurity.class);

    private Element element;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLUtils.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLUtils.class);

    private XMLUtils() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/JasyptPasswordEncryptor.java`
#### Snippet
```java
    public static final String DEFAULT_ALGORITHM = "PBEWithMD5AndTripleDES";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JasyptPasswordEncryptor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/JasyptPasswordEncryptor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JasyptPasswordEncryptor.class);

    private final StandardPBEStringEncryptor passwordEncryptor;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/DERDecoder.java`
#### Snippet
```java
 */
public class DERDecoder {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DERDecoder.class);

    /** DER type identifier for a bit string value */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/DERDecoder.java`
#### Snippet
```java
 */
public class DERDecoder {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DERDecoder.class);

    /** DER type identifier for a bit string value */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
    public static final String X509_V3_TYPE = WSS4JConstants.X509TOKEN_NS + "#X509v3";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecurityTokenReference.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecurityTokenReference.class);

    private Element element;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSS4JResourceBundle.java`
#### Snippet
```java
public class WSS4JResourceBundle extends ResourceBundle {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSS4JResourceBundle.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSS4JResourceBundle.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSS4JResourceBundle.class);

    private final ResourceBundle wss4jSecResourceBundle;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
public final class SAML2ComponentBuilder {

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SAML2ComponentBuilder.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SAML2ComponentBuilder.class);

    private static volatile SAMLObjectBuilder<Assertion> assertionBuilder;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
            //ignore
        }
        org.apache.xml.security.Init.init();
        if (!wasSet) {
            try {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
public final class WSProviderConfig {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSProviderConfig.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSProviderConfig.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinDevice.java`
#### Snippet
```java
public class MerlinDevice extends Merlin {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(MerlinDevice.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinDevice.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(MerlinDevice.class);

    public MerlinDevice() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/AlgorithmSuiteValidator.java`
#### Snippet
```java
public class AlgorithmSuiteValidator {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(AlgorithmSuiteValidator.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/AlgorithmSuiteValidator.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(AlgorithmSuiteValidator.class);

    private final AlgorithmSuite algorithmSuite;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.spec` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/AlgorithmSuiteValidator.java`
#### Snippet
```java
        } else if (publicKey instanceof ECPublicKey) {
            final ECPublicKey ecpriv = (ECPublicKey) publicKey;
            final java.security.spec.ECParameterSpec spec = ecpriv.getParams();
            int length = spec.getOrder().bitLength();
            if (length < algorithmSuite.getMinimumEllipticCurveKeyLength()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoClientAction.java`
#### Snippet
```java
 */
public class DefaultSpnegoClientAction implements SpnegoClientAction {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DefaultSpnegoClientAction.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoClientAction.java`
#### Snippet
```java
public class DefaultSpnegoClientAction implements SpnegoClientAction {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DefaultSpnegoClientAction.class);

    private String serviceName;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
        } catch (NoSuchProviderException | NoSuchAlgorithmException
            | CertificateException | InvalidAlgorithmParameterException
            | java.security.cert.CertPathValidatorException
            | KeyStoreException e) {
                throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java
public class MerlinAKI extends Merlin {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(MerlinAKI.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/MerlinAKI.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(MerlinAKI.class);

    public MerlinAKI() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java
    public static final String NAME_CONSTRAINTS_OID = "2.5.29.30";  //NOPMD - not an IP address

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CryptoBase.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoBase.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CryptoBase.class);

    private static final Constructor<?> BC_509CLASS_CONS;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java
public class SpnegoTokenContext {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SpnegoTokenContext.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/SpnegoTokenContext.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SpnegoTokenContext.class);

    private GSSContext secContext;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoServiceAction.java`
#### Snippet
```java
 */
public class DefaultSpnegoServiceAction implements SpnegoServiceAction {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DefaultSpnegoServiceAction.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/spnego/DefaultSpnegoServiceAction.java`
#### Snippet
```java
public class DefaultSpnegoServiceAction implements SpnegoServiceAction {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DefaultSpnegoServiceAction.class);

    private byte[] ticket;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosContext.java`
#### Snippet
```java
 */
public class KerberosContext {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosContext.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/kerberos/KerberosContext.java`
#### Snippet
```java
public class KerberosContext {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KerberosContext.class);

    private boolean disposed;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/WSDerivedKeyTokenPrincipal.java`
#### Snippet
```java
 * <code>DerivedKeyToken</code>
 */
public class WSDerivedKeyTokenPrincipal implements java.io.Serializable, Principal {

    private static final long serialVersionUID = -8576876885462234466L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/derivedKey/P_SHA1.java`
#### Snippet
```java
public class P_SHA1 implements DerivationAlgorithm {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(P_SHA1.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/derivedKey/P_SHA1.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(P_SHA1.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl.java`
#### Snippet
```java
 * @see javax.security.auth.Subject
 */
public class WSUsernameTokenPrincipalImpl implements java.io.Serializable, UsernameTokenPrincipal {

    private static final long serialVersionUID = 5608648208455259722L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.neethi` is unnecessary, and can be replaced with an import
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
    public static Element getFirstPolicyChildElement(Element element) {
        Element policy = getFirstChildElement(element, SPConstants.P_LOCALNAME);
        if (policy != null && org.apache.neethi.Constants.isPolicyNS(policy.getNamespaceURI())) {
            return policy;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.neethi` is unnecessary, and can be replaced with an import
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            Attr attr = (Attr) attributes.item(x);
            QName qName = new QName(attr.getNamespaceURI(), attr.getLocalName());
            if (org.apache.neethi.Constants.isIgnorableAttribute(qName)) {
                return attr;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.neethi` is unnecessary, and can be replaced with an import
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            Attr attr = (Attr) attributes.item(x);
            QName qName = new QName(attr.getNamespaceURI(), attr.getLocalName());
            if (org.apache.neethi.Constants.isOptionalAttribute(qName)) {
                return attr;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
                validator.validate(path, param);
            }
        } catch (java.security.NoSuchProviderException | NoSuchAlgorithmException
            | java.security.cert.CertificateException
            | java.security.InvalidAlgorithmParameterException
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            }
        } catch (java.security.NoSuchProviderException | NoSuchAlgorithmException
            | java.security.cert.CertificateException
            | java.security.InvalidAlgorithmParameterException
            | java.security.cert.CertPathValidatorException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        } catch (java.security.NoSuchProviderException | NoSuchAlgorithmException
            | java.security.cert.CertificateException
            | java.security.InvalidAlgorithmParameterException
            | java.security.cert.CertPathValidatorException e) {
                throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
            | java.security.cert.CertificateException
            | java.security.InvalidAlgorithmParameterException
            | java.security.cert.CertPathValidatorException e) {
                throw new WSSecurityException(
                    WSSecurityException.ErrorCode.FAILURE, e, "certpath",
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
public class CertificateStore extends CryptoBase {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CertificateStore.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CertificateStore.class);

    private X509Certificate[] trustedCerts;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.neethi` is unnecessary and can be removed
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSecurityAssertion.java`
#### Snippet
```java
    @Override
    public short getType() {
        return org.apache.neethi.Constants.TYPE_ASSERTION;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
 */
public abstract class CryptoFactory {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CryptoFactory.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
public abstract class CryptoFactory {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(CryptoFactory.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            // Generate cert path
            if (foundIssuingCertChains != null && !foundIssuingCertChains.isEmpty()) {
                java.security.cert.CertPathValidatorException validatorException = null;
                // Try each potential issuing cert path for a match
                for (Certificate[] foundCertChain : foundIssuingCertChains) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
                        validatorException = null;
                        break;
                    } catch (java.security.cert.CertPathValidatorException e) {
                        validatorException = e;
                    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
        } catch (NoSuchProviderException | NoSuchAlgorithmException
            | CertificateException | InvalidAlgorithmParameterException
            | java.security.cert.CertPathValidatorException
            | KeyStoreException e) {
                throw new WSSecurityException(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
    public static final String X509_CRL_FILE = "x509crl.file";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Merlin.class);
    private static final String COMMA_SEPARATOR = ",";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Merlin.class);
    private static final String COMMA_SEPARATOR = ",";

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wss10;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wss10/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wss10;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wss11/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wss11;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wss11/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wss11;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wsu10/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wsu10;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wsu10/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wsu10;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wssc13/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wssc13;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wssc13/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wssc13;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wssc200502/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wssc200502;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `bindings/src/main/java/org/apache/wss4j/binding/wssc200502/package-info.java`
#### Snippet
```java
//

@jakarta.xml.bind.annotation.XmlSchema(namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc", elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package org.apache.wss4j.binding.wssc200502;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSCrypto.java`
#### Snippet
```java
class WSSCrypto {

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSCrypto.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSCrypto.java`
#### Snippet
```java

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSCrypto.class);

    private Class<? extends Merlin> cryptoClass = Merlin.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler.java`
#### Snippet
```java
public class WSSSignatureInputHandler extends AbstractSignatureInputHandler {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSSignatureInputHandler.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSSignatureInputHandler.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSEncryptedKeyInputHandler.java`
#### Snippet
```java
public class WSSEncryptedKeyInputHandler extends XMLEncryptedKeyInputHandler {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSEncryptedKeyInputHandler.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/WSSEncryptedKeyInputHandler.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSEncryptedKeyInputHandler.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
public class SecurityHeaderInputProcessor extends AbstractInputProcessor {

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecurityHeaderInputProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecurityHeaderInputProcessor.class);

    private final ArrayDeque<XMLSecEvent> xmlSecEventList = new ArrayDeque<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
public class DecryptInputProcessor extends AbstractDecryptInputProcessor {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DecryptInputProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DecryptInputProcessor.class);

    private static final Long MAX_ALLOWED_DECOMPRESSED_BYTES =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
public class SAMLTokenOutputProcessor extends AbstractOutputProcessor {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenOutputProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SAMLTokenOutputProcessor.class);

    public SAMLTokenOutputProcessor() throws XMLSecurityException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor.java`
#### Snippet
```java
public class WSSSignatureOutputProcessor extends AbstractSignatureOutputProcessor {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSSignatureOutputProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(WSSSignatureOutputProcessor.class);

    public WSSSignatureOutputProcessor() throws XMLSecurityException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java
public class EncryptOutputProcessor extends AbstractEncryptOutputProcessor {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptOutputProcessor.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(EncryptOutputProcessor.class);

    public EncryptOutputProcessor() throws XMLSecurityException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.common.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl.java`
#### Snippet
```java
     *
     * @return Returns the derived key a byte array
     * @throws org.apache.wss4j.common.ext.WSSecurityException
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
public class InboundWSSecurityContextImpl extends InboundSecurityContextImpl implements WSInboundSecurityContext {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InboundWSSecurityContextImpl.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InboundWSSecurityContextImpl.class);

    private final Deque<SecurityEvent> securityEventQueue = new ArrayDeque<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java
        extends org.apache.xml.security.stax.impl.securityToken.X509SecurityToken implements X509SecurityToken {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SecurityTokenImpl.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SecurityTokenImpl.class);

    private CallbackHandler callbackHandler;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/UsernameTokenValidatorImpl.java`
#### Snippet
```java
public class UsernameTokenValidatorImpl implements UsernameTokenValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(UsernameTokenValidatorImpl.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/UsernameTokenValidatorImpl.java`
#### Snippet
```java
public class UsernameTokenValidatorImpl implements UsernameTokenValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(UsernameTokenValidatorImpl.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/SamlTokenValidatorImpl.java`
#### Snippet
```java
public class SamlTokenValidatorImpl extends SignatureTokenValidatorImpl implements SamlTokenValidator {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlTokenValidatorImpl.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/SamlTokenValidatorImpl.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SamlTokenValidatorImpl.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/BinarySecurityTokenValidatorImpl.java`
#### Snippet
```java
public class BinarySecurityTokenValidatorImpl implements BinarySecurityTokenValidator {

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(BinarySecurityTokenValidatorImpl.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/BinarySecurityTokenValidatorImpl.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(BinarySecurityTokenValidatorImpl.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @param securityProperties The configuration to validate
     * @return The validated configuration
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @throws WSSecurityException
     *          if the initialisation failed
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @throws WSSecurityException
     *          if the initialisation failed
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wss10` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
            WSSConstants.setJaxbContext(
                    JAXBContext.newInstance(
                            org.apache.wss4j.binding.wss10.ObjectFactory.class,
                            org.apache.wss4j.binding.wss11.ObjectFactory.class,
                            org.apache.wss4j.binding.wsu10.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wss11` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                    JAXBContext.newInstance(
                            org.apache.wss4j.binding.wss10.ObjectFactory.class,
                            org.apache.wss4j.binding.wss11.ObjectFactory.class,
                            org.apache.wss4j.binding.wsu10.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc13.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wsu10` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.wss4j.binding.wss10.ObjectFactory.class,
                            org.apache.wss4j.binding.wss11.ObjectFactory.class,
                            org.apache.wss4j.binding.wsu10.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc13.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc200502.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wssc13` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.wss4j.binding.wss11.ObjectFactory.class,
                            org.apache.wss4j.binding.wsu10.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc13.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc200502.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wssc200502` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.wss4j.binding.wsu10.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc13.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc200502.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc11.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.xmlenc` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.wss4j.binding.wssc13.ObjectFactory.class,
                            org.apache.wss4j.binding.wssc200502.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc11.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.xmlenc11` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.wss4j.binding.wssc200502.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc11.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig11.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.xmldsig` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.xml.security.binding.xmlenc.ObjectFactory.class,
                            org.apache.xml.security.binding.xmlenc11.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig11.ObjectFactory.class,
                            org.apache.xml.security.binding.excc14n.ObjectFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.xmldsig11` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.xml.security.binding.xmlenc11.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig11.ObjectFactory.class,
                            org.apache.xml.security.binding.excc14n.ObjectFactory.class,
                            org.apache.xml.security.binding.xop.ObjectFactory.class
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.excc14n` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.xml.security.binding.xmldsig.ObjectFactory.class,
                            org.apache.xml.security.binding.xmldsig11.ObjectFactory.class,
                            org.apache.xml.security.binding.excc14n.ObjectFactory.class,
                            org.apache.xml.security.binding.xop.ObjectFactory.class
                    )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.binding.xop` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                            org.apache.xml.security.binding.xmldsig11.ObjectFactory.class,
                            org.apache.xml.security.binding.excc14n.ObjectFactory.class,
                            org.apache.xml.security.binding.xop.ObjectFactory.class
                    )
            );
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @throws WSSecurityException
     *          if the initialisation failed
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @param securityProperties The configuration to validate
     * @return The validated configuration
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.stax.ext` is unnecessary and can be removed
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
     * @throws WSSecurityException
     *          if the initialisation failed
     * @throws org.apache.wss4j.stax.ext.WSSConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/TimestampValidatorImpl.java`
#### Snippet
```java
public class TimestampValidatorImpl implements TimestampValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TimestampValidatorImpl.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/TimestampValidatorImpl.java`
#### Snippet
```java
public class TimestampValidatorImpl implements TimestampValidator {

    private static final transient org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TimestampValidatorImpl.class);

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/JAASUsernameTokenValidatorImpl.java`
#### Snippet
```java
public class JAASUsernameTokenValidatorImpl implements UsernameTokenValidator {

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JAASUsernameTokenValidatorImpl.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/validate/JAASUsernameTokenValidatorImpl.java`
#### Snippet
```java

    private static final transient org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JAASUsernameTokenValidatorImpl.class);

    private String contextName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wss10` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
    }

    private static InboundSecurityToken getSecurityToken(org.apache.wss4j.binding.wss10.ReferenceType referenceType,
                                                         String tokenType,
                                                         InboundSecurityContext inboundSecurityContext,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wss4j.binding.wss10` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
            }

            final org.apache.wss4j.binding.wss10.ReferenceType referenceType
                    = XMLSecurityUtils.getQNameType(securityTokenReferenceType.getAny(), WSSConstants.TAG_WSSE_REFERENCE);
            if (referenceType != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java
public class InboundWSSec {

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(InboundWSSec.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java

    protected static final transient org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(InboundWSSec.class);

    private static final XMLInputFactory XML_INPUT_FACTORY = XMLInputFactory.newInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
public final class ConfigurationConverter {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ConfigurationConverter.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ConfigurationConverter.class);

    private ConfigurationConverter() {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SecurityHeaderReorderProcessor.java`
#### Snippet
```java
            actionEventMap.put(outAction, new TreeMap<SecurityHeaderOrder, Deque<XMLSecEvent>>(new Comparator<SecurityHeaderOrder>() {
                @Override
                public int compare(SecurityHeaderOrder o1, SecurityHeaderOrder o2) {
                    if (WSSConstants.TAG_dsig_Signature.equals(o1.getSecurityHeaderElementName())) {
                        return 1;
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `ws-security-stax/src/main/resources/schemas/soap-1.1.xsd`
#### Snippet
```java
     <xs:simpleType>
     <xs:restriction base="xs:boolean">
	   <xs:pattern value="0|1"/>
	 </xs:restriction>
   </xs:simpleType>
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
        failedAssertionStateMap = new LinkedList<>();

        if (policyAsserter == null) {
            this.policyAsserter = new DummyPolicyAsserter();
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java

        public String createId(String prefix, Object o) {
            if (prefix == null) {
                return IDGenerator.generateID("_");
            }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        if (certs != null && certs.length > 0 && certs[0] != null) {
            key = certs[0].getPublicKey();
        } else if (publicKey != null) {
            key = publicKey;
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML2ComponentBuilder.java`
#### Snippet
```java
        Attribute attribute = attributeBuilder.buildObject();
        attribute.setFriendlyName(friendlyName);
        if (nameFormat == null) {
            attribute.setNameFormat(SAML2Constants.ATTRNAME_FORMAT_URI);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `bindings/src/main/java/org/apache/wss4j/binding/wss11/EncryptedHeaderType.java`
#### Snippet
```java
     */
    public boolean isMustUnderstand12() {
        if (mustUnderstand12 == null) {
            return false;
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `bindings/src/main/java/org/apache/wss4j/binding/wss11/EncryptedHeaderType.java`
#### Snippet
```java
     */
    public boolean isRelay() {
        if (relay == null) {
            return false;
        } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TokenAssertionState()` of an abstract class should not be declared 'public'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
    }

    public TokenAssertionState(AbstractSecurityAssertion assertion, boolean asserted,
                               PolicyAsserter policyAsserter, boolean initiator) {
        super(assertion, asserted);
```

### NonProtectedConstructorInAbstractClass
Constructor `TokenAssertionState()` of an abstract class should not be declared 'public'
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
    private PolicyAsserter policyAsserter;

    public TokenAssertionState(AbstractSecurityAssertion assertion, boolean asserted, boolean initiator) {
        this(assertion, asserted, null, initiator);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `WSSecDerivedKeyBase()` of an abstract class should not be declared 'public'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java
    private Crypto crypto;

    public WSSecDerivedKeyBase(WSSecHeader securityHeader) {
        super(securityHeader);
        setKeyIdentifierType(0);
```

### NonProtectedConstructorInAbstractClass
Constructor `WSSecDerivedKeyBase()` of an abstract class should not be declared 'public'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDerivedKeyBase.java`
#### Snippet
```java
    }

    public WSSecDerivedKeyBase(Document doc) {
        super(doc);
        setKeyIdentifierType(0);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSecuredParts()` of an abstract class should not be declared 'public'
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSecuredParts.java`
#### Snippet
```java
    private Attachments attachments;

    public AbstractSecuredParts(SPConstants.SPVersion version, boolean body, Attachments attachments,
                       List<Header> headers) {
        super(version, headers);
```

### NonProtectedConstructorInAbstractClass
Constructor `IssuedTokenSecurityEvent()` of an abstract class should not be declared 'public'
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/securityEvent/IssuedTokenSecurityEvent.java`
#### Snippet
```java
public abstract class IssuedTokenSecurityEvent<T extends SecurityToken> extends TokenSecurityEvent<T> {

    public IssuedTokenSecurityEvent(WSSecurityEventConstants.Event securityEventType) {
        super(securityEventType);
    }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new PrivilegedAction() can be replaced with method reference
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
     */
    public static ClassLoader getClassLoader(final Class<?> clazz) {
        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                return clazz.getClassLoader();
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                                   Assertable assertable) {
        List<Assertable> assertableList = assertables.get(keyAssertion);
        if (assertableList == null) {
            assertableList = new LinkedList<>();
            assertables.put(keyAssertion, assertableList);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
                    SecurityEventConstants.Event event = securityEventType[j];
                    Map<Assertion, List<Assertable>> assertables = map.get(event);
                    if (assertables == null) {
                        assertables = new HashMap<>();
                        map.put(event, assertables);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/MemoryReplayCache.java`
#### Snippet
```java
        synchronized (cache) {
            List<String> list = cache.get(expiry);
            if (list == null) {
                list = new ArrayList<>(1);
                cache.put(expiry, list);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SecurityHeaderReorderProcessor.java`
#### Snippet
```java
        for (int i = outActions.size() - 1; i >= 0; i--) {
            XMLSecurityConstants.Action outAction = outActions.get(i);
            actionEventMap.put(outAction, new TreeMap<SecurityHeaderOrder, Deque<XMLSecEvent>>(new Comparator<SecurityHeaderOrder>() {
                @Override
                public int compare(SecurityHeaderOrder o1, SecurityHeaderOrder o2) {
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'java.util.Properties'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
                    new Class[]{Properties.class, Map.class, PasswordEncryptor.class};
                c = cryptoClass.getConstructor(classes);
                return c.newInstance(map, loader, null);
            }
        } catch (Exception e) {
```

### JavaReflectionInvocation
Argument is not assignable to 'java.util.Map'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CryptoFactory.java`
#### Snippet
```java
                    new Class[]{Properties.class, Map.class, PasswordEncryptor.class};
                c = cryptoClass.getConstructor(classes);
                return c.newInstance(map, loader, null);
            }
        } catch (Exception e) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `secretKey`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/DOMSAMLUtil.java`
#### Snippet
```java
                    (Principal)signedResult.get(WSSecurityEngineResult.TAG_PRINCIPAL);
                if (principal instanceof WSDerivedKeyTokenPrincipal) {
                    secretKey = ((WSDerivedKeyTokenPrincipal)principal).getSecret();
                    if (MessageDigest.isEqual(secretKey, subjectSecretKey)) {
                        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `xpath`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
            return null;
        } else if (Node.ELEMENT_NODE == node.getNodeType()) {
            xpath = node.getNodeName() + "/" + xpath;
            return prependFullPath(xpath, node.getParentNode());
        } else if (Node.DOCUMENT_NODE == node.getNodeType()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `encData`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        Node previousSibling = encData.getPreviousSibling();
        if (content) {
            encData = (Element) encData.getParentNode();
            parent = encData.getParentNode();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `actor`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSecurityEngine.java`
#### Snippet
```java

        if (actor == null) {
            actor = "";
        }
        WSHandlerResult wsResult = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `clonedElement`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
     */
    public static Element cloneElement(Document doc, Element clonedElement) throws WSSecurityException {
        clonedElement = (Element)clonedElement.cloneNode(true);
        if (isSAAJ14) {
            // here we need register the jakarta.xml.soap.Node with new instance
```

### AssignmentToMethodParameter
Assignment to method parameter `clonedElement`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
        if (isSAAJ14) {
            // here we need register the jakarta.xml.soap.Node with new instance
            clonedElement = (Element)doc.importNode(clonedElement, true);
            clonedElement = (Element)getDomElement(clonedElement);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `clonedElement`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
            // here we need register the jakarta.xml.soap.Node with new instance
            clonedElement = (Element)doc.importNode(clonedElement, true);
            clonedElement = (Element)getDomElement(clonedElement);
        }
        return clonedElement;
```

### AssignmentToMethodParameter
Assignment to method parameter `dataRef`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKEncrypt.java`
#### Snippet
```java

        if (dataRef == null) {
            dataRef =
                getDocument().createElementNS(
                    WSConstants.ENC_NS, WSConstants.ENC_PREFIX + ":ReferenceList"
```

### AssignmentToMethodParameter
Assignment to method parameter `dataRef`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncrypt.java`
#### Snippet
```java

        if (dataRef == null) {
            dataRef =
                getDocument().createElementNS(
                    WSConstants.ENC_NS,
```

### AssignmentToMethodParameter
Assignment to method parameter `siblingElement`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
            if (prepend) {
                if (siblingElement == null) {
                    siblingElement = (Element)securityHeaderElement.getFirstChild();
                }
                if (siblingElement == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `siblingElement`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
                        child = child.getNextSibling();
                    }
                    siblingElement = (Element)child;
                }
                if (siblingElement == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `elementToEncrypt`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        //
        Node parent = elementToEncrypt.getParentNode();
        elementToEncrypt = (Element)parent.replaceChild(elem, elementToEncrypt);
        elem.appendChild(elementToEncrypt);

```

### AssignmentToMethodParameter
Assignment to method parameter `provider`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/KeyUtils.java`
#### Snippet
```java

        if (provider == null) {
            provider = JCEMapper.getProviderId();
        } else {
            JavaUtils.checkRegisterPermission();
```

### AssignmentToMethodParameter
Assignment to method parameter `expiry`
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/MemoryReplayCache.java`
#### Snippet
```java
        Instant maxTTL = now.plusSeconds(MAX_TTL);
        if (expiry == null || expiry.isBefore(now) || expiry.isAfter(maxTTL)) {
            expiry = now.plusSeconds(DEFAULT_TTL);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }
            // no more siblings, get parent, all children
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                return attr.getValue();
            }
            e = e.getParentNode();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }
            }
            e = e.getParentNode();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }
            // no more siblings, get parent, all children
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            }
            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }
            // no more siblings, get parent, all children
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            }
            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }
            // no more siblings, get parent, all children
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
    public static String concatParamValues(String a, String b) {
        if (DOUBLE_QUOTE == a.charAt(a.length() - 1)) {
            a = a.substring(0, a.length() - 1);
        }
        if (DOUBLE_QUOTE == b.charAt(0)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
        }
        if (DOUBLE_QUOTE == b.charAt(0)) {
            b = b.substring(1);
        }
        return a + b;
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
                return attr.getValue();
            }
            e = e.getParentNode();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `inputStream`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor.java`
#### Snippet
```java
                try {
                    Constructor<InputStream> constructor = transformerClass.getConstructor(InputStream.class);
                    inputStream = new LimitingInputStream(
                            constructor.newInstance(inputStream), MAX_ALLOWED_DECOMPRESSED_BYTES);
                } catch (InvocationTargetException | NoSuchMethodException
```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSecStartElement`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureEndingOutputProcessor.java`
#### Snippet
```java
        //we have to search for the SecurityHeaderElement for InclusiveNamespaces (same behavior as in wss-dom):
        while (!WSSConstants.TAG_WSSE_SECURITY.equals(xmlSecStartElement.getName())) {
            xmlSecStartElement = xmlSecStartElement.getParentXMLSecStartElement();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSecEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor.java`
#### Snippet
```java
                            List<XMLSecAttribute> attributeList = new ArrayList<>(1);
                            attributeList.add(createAttribute(WSSConstants.ATT_WSU_ID, signaturePartDef.getSigRefId()));
                            xmlSecEvent = addAttributes(xmlSecStartElement, attributeList);
                        }
                    } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `outputStream`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/EncryptOutputProcessor.java`
#### Snippet
```java
                try {
                    Constructor<OutputStream> constructor = transformerClass.getConstructor(OutputStream.class);
                    outputStream = constructor.newInstance(outputStream);
                } catch (InvocationTargetException | NoSuchMethodException
                    | InstantiationException | IllegalAccessException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `currentNode`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                    element.setPrefix(xmlSecStartElement.getName().getPrefix());
                }
                currentNode = currentNode.appendChild(element);
                @SuppressWarnings("unchecked")
                Iterator<Namespace> namespaceIterator = xmlSecStartElement.getNamespaces();
```

### AssignmentToMethodParameter
Assignment to method parameter `currentNode`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
            case XMLStreamConstants.END_ELEMENT:
                if (currentNode.getParentNode() != null) {
                    currentNode = currentNode.getParentNode();
                }
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `tokenSecurityEventList`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
            List<TokenSecurityEvent<? extends InboundSecurityToken>> tokenSecurityEventList) {
        if (tokenSecurityEventList == Collections.<TokenSecurityEvent<? extends InboundSecurityToken>>emptyList()) {
            tokenSecurityEventList = new ArrayList<>();
        }
        tokenSecurityEventList.add(tokenSecurityEvent);
```

### AssignmentToMethodParameter
Assignment to method parameter `securityEvent`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
                            WSSUtils.createTokenSecurityEvent(securityToken, tokenSecurityEvent.getCorrelationID());
                    setTokenUsage(newTokenSecurityEvent, WSSecurityTokenConstants.TOKENUSAGE_MAIN_ENCRYPTION);
                    securityEvent = newTokenSecurityEvent;
                    this.messageEncryptionTokenOccured = true;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `securityProperties`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
        }

        securityProperties = validateAndApplyDefaultsToOutboundSecurityProperties(securityProperties);
        return new OutboundWSSec(securityProperties);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `securityProperties`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
        }

        securityProperties = validateAndApplyDefaultsToInboundSecurityProperties(securityProperties);
        return new InboundWSSec(securityProperties, initiator, returnSecurityError);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `requestSecurityEvents`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/InboundWSSec.java`
#### Snippet
```java

        if (requestSecurityEvents == null) {
            requestSecurityEvents = Collections.emptyList();
        }

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
                        && !(parentAssertion instanceof TransportToken)) {
                    ignoreToken++;
                    continue loop;
                } else if (!initiator && !(parentAssertion instanceof InitiatorToken)
                        && !(parentAssertion instanceof InitiatorSignatureToken)
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
                        && !(parentAssertion instanceof TransportToken)) {
                    ignoreToken++;
                    continue loop;
                }
            } else if (WSSecurityTokenConstants.TokenUsage_Signature.equals(tokenUsage)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
                        && !(parentAssertion instanceof TransportToken)) {
                    ignoreToken++;
                    continue loop;
                } else if (!initiator && !(parentAssertion instanceof RecipientToken)
                        && !(parentAssertion instanceof RecipientEncryptionToken)
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
                        && !(parentAssertion instanceof TransportToken)) {
                    ignoreToken++;
                    continue loop;
                }
            } else if (WSSecurityTokenConstants.TokenUsage_Encryption.equals(tokenUsage)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState.java`
#### Snippet
```java
                    if (supportingTokensName.contains("Encrypted") && !tokenUsageName.contains("Encrypted")) {
                        ignoreToken++;
                        continue loop;
                    }
                }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-common/src/main/java/org/apache/wss4j/common/NamePasswordCallbackHandler.java`
#### Snippet
```java
        for (Callback callback : callbacks) {
            if (handleCallback(callback)) {
                continue;
            } else if (callback instanceof NameCallback) {
                ((NameCallback) callback).setName(username);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/X509Token.java`
#### Snippet
```java
                    }
                    x509Token.setRequireKeyIdentifierReference(true);
                    continue;
                } else if (requireIssuerSerialRef.getLocalPart().equals(assertionName)
                        && requireIssuerSerialRef.getNamespaceURI().equals(assertionNamespace)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/X509Token.java`
#### Snippet
```java
                    }
                    x509Token.setRequireIssuerSerialReference(true);
                    continue;
                } else if (requireEmbeddedRef.getLocalPart().equals(assertionName)
                        && requireEmbeddedRef.getNamespaceURI().equals(assertionNamespace)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/X509Token.java`
#### Snippet
```java
                    }
                    x509Token.setRequireEmbeddedTokenReference(true);
                    continue;
                } else if (requireThumbprintRef.getLocalPart().equals(assertionName)
                        && requireThumbprintRef.getNamespaceURI().equals(assertionNamespace)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/X509Token.java`
#### Snippet
```java
                    }
                    x509Token.setRequireThumbprintReference(true);
                    continue;

                }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/HttpsToken.java`
#### Snippet
```java
                    }
                    httpsToken.setAuthenticationType(authenticationType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/Wss11.java`
#### Snippet
```java
                    }
                    wss11.setRequireSignatureConfirmation(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/KerberosToken.java`
#### Snippet
```java
                    }
                    kerberosToken.setApReqTokenType(apReqTokenType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/IssuedToken.java`
#### Snippet
```java
                    }
                    issuedToken.setRequireInternalReference(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractTokenWrapper.java`
#### Snippet
```java
                    tokenWrapper.setToken(abstractToken);
                    abstractToken.setParentAssertion(tokenWrapper);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SamlToken.java`
#### Snippet
```java
                    }
                    samlToken.setSamlTokenType(samlTokenType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/TransportBinding.java`
#### Snippet
```java
                    }
                    transportBinding.setTransportToken((TransportToken) assertion);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/Wss10.java`
#### Snippet
```java
                    }
                    wss10.setMustSupportRefEmbeddedToken(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SpnegoContextToken.java`
#### Snippet
```java
                    }
                    spnegoContextToken.setMustNotSendRenew(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/KeyValueToken.java`
#### Snippet
```java
                    }
                    keyValueToken.setRsaKeyValue(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SecureConversationToken.java`
#### Snippet
```java
                    BootstrapPolicy bootstrap = (BootstrapPolicy) assertion;
                    secureConversationToken.setBootstrapPolicy(bootstrap);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/Layout.java`
#### Snippet
```java
                if (layoutType != null) {
                    layout.setLayoutType(layoutType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/RelToken.java`
#### Snippet
```java
                    }
                    relToken.setRelTokenType(samlTokenType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractSymmetricAsymmetricBinding.java`
#### Snippet
```java
                    }
                    asymmetricBindingBase.setOnlySignEntireHeadersAndBody(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SupportingTokens.java`
#### Snippet
```java
                    }
                    supportingTokens.setEncryptedElements((EncryptedElements) assertion);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SecurityContextToken.java`
#### Snippet
```java
                    }
                    securityContextToken.setSc10SecurityContextToken(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/Trust10.java`
#### Snippet
```java
                    }
                    trust10.setMustSupportIssuedTokens(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/UsernameToken.java`
#### Snippet
```java
                    }
                    usernameToken.setUsernameTokenType(usernameTokenType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/AbstractBinding.java`
#### Snippet
```java
                if (SPConstants.INCLUDE_TIMESTAMP.equals(assertionName)) {
                    binding.setIncludeTimestamp(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/AsymmetricBinding.java`
#### Snippet
```java
                    asymmetricBinding.setRecipientEncryptionToken(recipientEncryptionToken1);
                    recipientEncryptionToken1.setParentAssertion(asymmetricBinding);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/Trust13.java`
#### Snippet
```java
                    }
                    trust13.setMustSupportInteractiveChallenge(true);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
                    }
                    algorithmSuite.setXPathType(xPathType);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `policy/src/main/java/org/apache/wss4j/policy/model/SymmetricBinding.java`
#### Snippet
```java
                    }
                    symmetricBinding.setProtectionToken((ProtectionToken) assertion);
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler.java`
#### Snippet
```java
            if (xmlSecEvent.getEventType() == XMLStreamConstants.START_ELEMENT) {
                if (xmlSecEvent.asStartElement().getName().equals(WSSConstants.TAG_WSSE_USERNAME_TOKEN)) {
                    continue;
                } else if (xmlSecEvent.asStartElement().getName().equals(WSSConstants.TAG_WSSE_PASSWORD)) {
                    if (passwordIndex != -1) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/TimestampInputHandler.java`
#### Snippet
```java

                if (name.equals(WSSConstants.TAG_WSU_TIMESTAMP)) {
                    continue;
                } else if (name.equals(WSSConstants.TAG_WSU_CREATED)) {
                    if (createdIndex != -1) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
                if (attribute.getName().equals(claimURI.toString())
                        && attribute.getAttributeValues() != null && !attribute.getAttributeValues().isEmpty()) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
            child = child.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
            child = child.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
                if (attribute.getAttributeName().equals(desiredRole)
                        && attribute.getAttributeValues() != null && !attribute.getAttributeValues().isEmpty()) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
        String dialect = claimsPolicy.getAttributeNS(null, "Dialect");
        if (!DEFAULT_CLAIMS_NAMESPACE.equals(dialect)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/IssuedTokenAssertionState.java`
#### Snippet
```java
            child = child.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyInputProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureProtectionAssertionState.java`
#### Snippet
```java
            } catch (XMLSecurityException e) {
                // Just return null here
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/assertionStates/SignatureProtectionAssertionState.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSSAMLKeyInfoProcessor.java`
#### Snippet
```java
        //
        if (keyInfoElement == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSSAMLKeyInfoProcessor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/EncryptedKeySTRParser.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/WSDocInfo.java`
#### Snippet
```java
            }
        }
        return null;    //NOPMD
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/WSDocInfo.java`
#### Snippet
```java
        String id = XMLUtils.getIDFromReference(uri);
        if (id == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/WSDocInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/STRParserUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/X509Util.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/str/SignatureSTRParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/EncryptionDerivedAction.java`
#### Snippet
```java
            && reqData.getSignatureToken().getKeyIdentifier() != null) {
            setupSCTReference(wsEncrypt, reqData.getSignatureToken(), reqData.isUse200512Namespace());
            return null;
        } else {
            return setupSCTReference(wsEncrypt, passwordCallback, encryptionToken, reqData.isUse200512Namespace(), doc);
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/EncryptionDerivedAction.java`
#### Snippet
```java
        if (symmetricKey == null) {
            setupEKReference(wsEncrypt, reqData.getSignatureToken());
            return null;
        } else {
            return setupEKReference(wsEncrypt, reqData.getSecHeader(), encryptionToken, null, null, symmetricKey);
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/AbstractDerivedAction.java`
#### Snippet
```java
    protected Node findSibling(Element secHeader, String namespace, String localName) {
        if (secHeader == null) {
            return null;
        }
        Node firstChild = secHeader.getFirstChild();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/AbstractDerivedAction.java`
#### Snippet
```java
            firstChild = firstChild.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureDerivedAction.java`
#### Snippet
```java
        if (symmetricKey == null) {
            setupEKReference(wsSign, reqData.getEncryptionToken());
            return null;
        } else {
            return setupEKReference(wsSign, reqData.getSecHeader(), signatureToken, null, null, symmetricKey);
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/action/SignatureDerivedAction.java`
#### Snippet
```java
            && reqData.getEncryptionToken().getKeyIdentifier() != null) {
            setupSCTReference(wsSign, reqData.getEncryptionToken(), reqData.isUse200512Namespace());
            return null;
        } else {
            return setupSCTReference(wsSign, passwordCallback, signatureToken, reqData.isUse200512Namespace(), doc);
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
    public static String getXPath(Node decryptedNode) {
        if (decryptedNode == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
            result = prependFullPath(result, ((Attr)decryptedNode).getOwnerElement());
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        if (node == null) {
            // probably a detached node... not really useful
            return null;
        } else if (Node.ELEMENT_NODE == node.getNodeType()) {
            xpath = node.getNodeName() + "/" + xpath;
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/EncryptionUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
        Element soapHeaderElement = getSOAPHeader(doc);
        if (soapHeaderElement == null) { // no SOAP header at all
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
            } catch (NoSuchMethodException e) {
                //best effort to try, do nothing if NoSuchMethodException
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
                }
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
            return prependChildElement(header, foundSecurityHeader);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/util/WSSecurityUtil.java`
#### Snippet
```java
            } catch (NoSuchMethodException e) {
                //best effort to try, do nothing if NoSuchMethodException
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecUsernameToken.java`
#### Snippet
```java
    public String getId() {
        if (ut == null) {
            return null;
        }
        return ut.getID();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSAMLToken.java`
#### Snippet
```java
        }
        if (saml == null) {
            return null;
        }
        samlElement = saml.toDOM(getDocument());
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSAMLToken.java`
#### Snippet
```java
    public String getId() {
        if (saml == null) {
            return null;
        }
        return saml.getId();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/RequestData.java`
#### Snippet
```java
            return wssConfig.getValidator(qName);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecTimestamp.java`
#### Snippet
```java
    public String getId() {
        if (ts == null) {
            return null;
        }
        return ts.getID();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecTimestamp.java`
#### Snippet
```java
    public Element getElement() {
        if (ts == null) {
            return null;
        }
        return ts.getElement();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return (Processor)processorObject;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return (Action)actionObject;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return (Validator)validatorObject;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/engine/WSSConfig.java`
#### Snippet
```java
            return result.getClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureConfirmation.java`
#### Snippet
```java
    public String getId() {
        if (sc == null) {
            return null;
        }
        return sc.getID();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignatureConfirmation.java`
#### Snippet
```java
     */
    public Element getSignatureConfirmationElement() {
        return (sc != null) ? sc.getElement() : null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncrypt.java`
#### Snippet
```java

        if (encDataRefs.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SecurityContextToken.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SecurityContextToken.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/SecurityContextToken.java`
#### Snippet
```java
    private Text getFirstNode(Element e) {
        Node node = e.getFirstChild();
        return node != null && Node.TEXT_NODE == node.getNodeType() ? (Text) node : null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java
    public String getSignatureId() {
        if (sig == null) {
            return null;
        }
        return sig.getId();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
    public String getId() {
        if (sig == null) {
            return null;
        }
        return sig.getId();
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java
    public String getBSTTokenId() {
        if (bstToken == null) {
            return null;
        }
        return bstToken.getAttributeNS(WSS4JConstants.WSU_NS, "Id");
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
        if (privateCredentials == null || privateCredentials.isEmpty()) {
            LOG.debug("Kerberos client subject private credentials are null");
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/KerberosSecurity.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/callback/DOMCallbackLookup.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/Encryptor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
    public String getBSTTokenId() {
        if (bstToken == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecEncryptedKey.java`
#### Snippet
```java
            return bstToken.getElement();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            return Loader.getTCL();
        } catch (Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            return (String) o;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            // Only applies if a Signature is before a Timestamp
            if (action.getAction() == WSConstants.TS) {
                return null;
            } else if (action.getAction() == WSConstants.SIGN) {
                if (action.getActionToken() != null
```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/UsernameToken.java`
#### Snippet
```java
    private Text getFirstNode(Element e) {
        Node node = e.getFirstChild();
        return node != null && Node.TEXT_NODE == node.getNodeType() ? (Text) node : null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
            return new SecurityTokenReference(elementSecurityTokenReference, bspEnforcer);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/token/DerivedKeyToken.java`
#### Snippet
```java
    private Text getFirstNode(Element e) {
        Node node = e.getFirstChild();
        return node != null && Node.TEXT_NODE == node.getNodeType() ? (Text) node : null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/transform/STRTransformUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/EncryptedKeyProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLUtil.java`
#### Snippet
```java
            );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SAMLCallback.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/OpenSAMLUtil.java`
#### Snippet
```java
                + qName
            );
            return null;
        }
        return
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return (org.opensaml.saml.saml1.core.Assertion)samlObject;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return ((SignableSAMLObject)samlObject).getSignature();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            + "object or issuer is null"
        );
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
            return (org.opensaml.saml.saml2.core.Assertion)samlObject;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/SamlAssertionWrapper.java`
#### Snippet
```java
                        + "object or subject is null"
        );
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
    public String getPrefix(String namespaceURI, boolean noDefault) {
        if (namespaceURI == null || namespaceURI.isEmpty()) {
            return null;
        }
        int hash = namespaceURI.hashCode();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/NSStack.java`
#### Snippet
```java
    public Mapping next() {
        if (iterator > top) {
            return null;
        } else {
            return stack[iterator++];
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java

        try {
            return (url != null) ? url.openStream() : null;
        } catch (IOException e) {
            LOG.debug(e.getMessage(), e);
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/Loader.java`
#### Snippet
```java
        } catch (IOException e) {
            LOG.debug(e.getMessage(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheExpiry.java`
#### Snippet
```java
    @Override
    public Duration getExpiryForAccess(String s, Supplier<? extends EHCacheValue> supplier) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/cache/EHCacheExpiry.java`
#### Snippet
```java
    @Override
    public Duration getExpiryForUpdate(String s, Supplier<? extends EHCacheValue> supplier, EHCacheValue ehCacheValue) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        //
        if (startNode == null) {
            return null;
        }
        Node startParent = startNode.getParentNode();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                    } else {
                        LOG.warn("Multiple elements with the same 'Id' attribute value!");
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            e = e.getParentNode();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            e = e.getParentNode();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
    public static Element getDirectChildElement(Node parentNode, String localName, String namespace) {
        if (parentNode == null) {
            return null;
        }
        for (Node currentChild = parentNode.getFirstChild();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
    public static String getIDFromReference(String ref) {
        if (ref == null) {
            return null;
        }
        String id = ref.trim();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        String id = ref.trim();
        if (id.length() == 0) {
            return null;
        }
        if (id.charAt(0) == '#') {
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        //
        if (startNode == null || value == null) {
            return null;
        }
        Node startParent = startNode.getParentNode();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                    } else {
                        LOG.warn("Multiple elements with the same 'ID' attribute value!");
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java

            if (!found) {
                return null;
            }
            return builder.toString();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            return builder.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
        //
        if (startNode == null) {
            return null;
        }
        Node startParent = startNode.getParentNode();
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
                processedNode = processedNode.getParentNode();
                if (processedNode == startParent) {
                    return null;
                }
                // close parent node processing (processed node now)
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/XMLUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/saml/builder/SAML1ComponentBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
            return p.remove(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
            return p.getProperty(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
            return p.getService(type, algorithm);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
            return p.get(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/ThreadLocalSecurityProvider.java`
#### Snippet
```java
            return p.put(key, value);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            return elem.getAttributeNS(null, "EncodingType");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            return elem.getAttributeNS(null, "ValueType");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
        Element elem = getFirstElement();
        if (elem == null) {
            return null;
        }
        if (WSS4JConstants.X509_DATA_LN.equals(elem.getLocalName())) {
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            return XMLUtils.getElementText(getFirstElement());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
    public X509Certificate getX509SKIAlias(Crypto crypto) throws WSSecurityException {
        if (crypto == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            skiBytes = getSKIBytes();
            if (skiBytes == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/token/SecurityTokenReference.java`
#### Snippet
```java
            return certs[0];
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
                    LOG.debug("The provider " + name + " could not be added: " + t.getMessage(), t);
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
                    LOG.debug("The provider " + name + " could not be added: " + t.getMessage(), t);
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
                    LOG.debug("The provider " + name + " could not be added: " + t.getMessage(), t);
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/WSProviderConfig.java`
#### Snippet
```java
                    LOG.debug("The provider " + name + " could not be added: " + t.getMessage(), t);
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/principal/SAMLTokenPrincipalImpl.java`
#### Snippet
```java
            return samlAssertion.getId();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            return policy;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
    public static String getFirstChildElementText(Node parent, QName childNodeName) {
        Element element = getFirstChildElement(parent, childNodeName);
        return element != null ? element.getTextContent() : null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            attr = element.getAttributeNodeNS(attName.getNamespaceURI(), attName.getLocalPart());
        }
        return attr == null ? null : attr.getValue().trim();
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/SPUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        CallbackHandler callbackHandler
    ) throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        String password
    ) throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/CertificateStore.java`
#### Snippet
```java
        X509Certificate certificate, CallbackHandler callbackHandler
    ) throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
    public String getPrefix(String namespaceURI, boolean noDefault) {
        if (namespaceURI == null || namespaceURI.isEmpty()) {
            return null;
        }
        int hash = namespaceURI.hashCode();
```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/model/NSStack.java`
#### Snippet
```java
    public Mapping next() {
        if (iterator > top) {
            return null;
        } else {
            return stack[iterator++];
```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/model/DOM2Writer.java`
#### Snippet
```java
            e = e.getParentNode();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            throw new WSSecurityException(WSSecurityException.ErrorCode.FAILURE, e, "keystore");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            throw new WSSecurityException(WSSecurityException.ErrorCode.FAILURE, e, "keystore");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `policy/src/main/java/org/apache/wss4j/policy/builders/SignedPartsBuilder.java`
#### Snippet
```java
            child = SPUtils.getNextSiblingElement(child);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/EncryptedDataInputHandler.java`
#### Snippet
```java
                            return referenceType;
                        }
                        return null;
                    }
                };
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler.java`
#### Snippet
```java
            return created.toInstant();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SignatureConfirmationInputProcessor.java`
#### Snippet
```java
            throws XMLStreamException, XMLSecurityException {
        //should never be called
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return decryptionWSSCrypto.getCryptoProperties();
        }
        return null;    //NOPMD
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return encryptionWSSCrypto.getCryptoProperties();
        }
        return null;    //NOPMD
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java

        if (decryptionWSSCrypto == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java

        if (signatureVerificationWSSCrypto == null) {
            return null;
        }
        signatureVerificationWSSCrypto.setCrlCertStore(crlCertStore);
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java

        if (encryptionWSSCrypto == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return signatureWSSCrypto.getCryptoProperties();
        }
        return null;    //NOPMD
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return signatureVerificationWSSCrypto.getKeyStore();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return decryptionWSSCrypto.getKeyStore();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return signatureVerificationWSSCrypto.getCryptoProperties();
        }
        return null;    //NOPMD
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return encryptionWSSCrypto.getKeyStore();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
    public Crypto getSignatureCrypto() throws WSSConfigurationException {
        if (signatureWSSCrypto == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/ext/WSSSecurityProperties.java`
#### Snippet
```java
            return signatureWSSCrypto.getKeyStore();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
    public XMLSecEvent processHeaderEvent(InputProcessorChain inputProcessorChain)
            throws XMLStreamException, XMLSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
                throws XMLStreamException, XMLSecurityException {
            //should never be called because we remove this processor before
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SecurityHeaderInputProcessor.java`
#### Snippet
```java
        public XMLSecEvent processHeaderEvent(InputProcessorChain inputProcessorChain)
                throws XMLStreamException, XMLSecurityException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor.java`
#### Snippet
```java
                            LOG.debug(e.getMessage(), e);
                        }
                        return null;
                    }
                };
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/processor/input/SAMLTokenInputHandler.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/ECKeyValueSecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken.java`
#### Snippet
```java
        Set<KerberosTicket> privateCredentials = clientSubject.getPrivateCredentials(KerberosTicket.class);
        if (privateCredentials == null || privateCredentials.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/ExternalSecurityTokenImpl.java`
#### Snippet
```java
            return WSSecurityTokenConstants.SECURITY_CONTEXT_TOKEN;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/DsaKeyValueSecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/HttpsSecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/resourceResolvers/ResolverAttachment.java`
#### Snippet
```java
    @Override
    public InputStream getInputStreamFromExternalReference() throws XMLSecurityException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/resourceResolvers/ResolverAttachment.java`
#### Snippet
```java
    public ResourceResolverLookup canResolve(String uri, String baseURI) {
        if (uri == null) {
            return null;
        }
        if (uri.startsWith("cid:")) {
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/resourceResolvers/ResolverAttachment.java`
#### Snippet
```java
            return this;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl.java`
#### Snippet
```java
    @Override
    public Subject getSubject() throws WSSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
                    return concreteLSInput;
                }
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/utils/WSSUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/OutboundWSSec.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            return Loader.getTCL();
        } catch (Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            return WSSConstants.DerivedKeyTokenReference.SecurityContextToken;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            return WSSecurityTokenConstants.KEYIDENTIFIER_KERBEROS_SHA1_IDENTIFIER;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            return (String)value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
            LOG.debug(e.getMessage(), e);
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `b3` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/UsernameTokenUtil.java`
#### Snippet
```java
            byte[] b1 = nonce != null ? nonce : new byte[0];
            byte[] b2 = created != null ? created.getBytes(StandardCharsets.UTF_8) : new byte[0];
            byte[] b3 = password;
            byte[] b4 = new byte[b1.length + b2.length + b3.length];
            int offset = 0;
```

### UnnecessaryLocalVariable
Local variable `cipherInputStream` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/util/AttachmentUtils.java`
#### Snippet
```java
            throws WSSecurityException {

        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher) {

            private boolean firstRead = true;
```

### UnnecessaryLocalVariable
Local variable `msg` is redundant
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
            firstAlias = false;
        }
        String msg = " in keystore of type [" + keystore.getType()
            + "] from provider [" + keystore.getProvider()
            + "] with size [" + keystore.size() + "] and aliases: {"
```

### UnnecessaryLocalVariable
Local variable `schema` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/WSSec.java`
#### Snippet
```java
        });

        Schema schema = schemaFactory.newSchema(
                new Source[] {
                        new StreamSource(ClassLoaderUtils.getResourceAsStream("schemas/xml.xsd", WSSec.class)),
```

### UnnecessaryLocalVariable
Local variable `action` is redundant
in `ws-security-stax/src/main/java/org/apache/wss4j/stax/setup/ConfigurationConverter.java`
#### Snippet
```java
        WSSSecurityProperties properties
    ) {
        String action = getString(ConfigurationConstants.ACTION, config);

        String actionToParse = action;
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'ns' and 'encryptionDigest'
in `policy/src/main/java/org/apache/wss4j/policy/model/AlgorithmSuite.java`
#### Snippet
```java
        }

        public AlgorithmSuiteType(AlgorithmSuiteType algorithmSuiteType) {
            this.name = algorithmSuiteType.name;
            this.digest = algorithmSuiteType.digest;
```

## RuleId[id=SuspiciousTernaryOperatorInVarargsCall]
### SuspiciousTernaryOperatorInVarargsCall
Ternary operator in varargs call contains array and non-array branches
in `ws-security-common/src/main/java/org/apache/wss4j/common/NamePasswordCallbackHandler.java`
#### Snippet
```java
            try {
                Method method = callback.getClass().getMethod(cbname, arg);
                method.invoke(callback, arg == String.class ? password : password.toCharArray());
                return true;
            } catch (Exception e) {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `ws-security-policy-stax/src/main/java/org/apache/wss4j/policy/stax/enforcer/PolicyEnforcerFactory.java`
#### Snippet
```java
            for (int i = 0; i < customAssertionBuilders.size(); i++) {
                AssertionBuilder<Element> customAssertionBuilder = customAssertionBuilders.get(i);
                assertionBuilders.add(customAssertionBuilder);
            }
        }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/handler/WSHandler.java`
#### Snippet
```java
        List<Integer> recordedActions = new ArrayList<>(actions.size());
        for (Integer action : actions) {
            recordedActions.add(action);
        }

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'signContext' to 'DOMSignContext'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java

            // Add the elements to sign to the Signature Context
            getWsDocInfo().setTokensOnContext((DOMSignContext)signContext);

            sig.sign(signContext);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'binarySecurity' to 'X509Security'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/saml/WSSecSignatureSAML.java`
#### Snippet
```java
                    ref.setURI("#" + certUri);
                    BinarySecurity binarySecurity = new X509Security(getDocument());
                    ((X509Security) binarySecurity).setX509Certificate(cert);
                    binarySecurity.setID(certUri);
                    bstToken = binarySecurity.getElement();
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'signContext' to 'DOMSignContext'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecDKSign.java`
#### Snippet
```java

            // Add the elements to sign to the Signature Context
            wsDocInfo.setTokensOnContext((DOMSignContext)signContext);

            sig.sign(signContext);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'signContext' to 'DOMSignContext'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/message/WSSecSignature.java`
#### Snippet
```java

            // Add the elements to sign to the Signature Context
            getWsDocInfo().setTokensOnContext((DOMSignContext)signContext);
            sig.sign(signContext);

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'refObject' to 'Reference'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SAMLTokenProcessor.java`
#### Snippet
```java

        for (Object refObject : xmlSignature.getSignedInfo().getReferences()) {
            Reference reference = (Reference)refObject;

            if (reference.getURI() == null || reference.getURI().length() == 0
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'object' to 'XMLObject'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        for (Object object : xmlSignature.getObjects()) {
            if (object instanceof XMLObject) {
                XMLObject xmlObject = (XMLObject)object;
                for (Object xmlStructure : xmlObject.getContent()) {
                    if (xmlStructure instanceof Manifest) {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'refObject' to 'Reference'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        // Check References
        for (Object refObject : xmlSignature.getSignedInfo().getReferences()) {
            Reference reference = (Reference)refObject;
            if (reference.getTransforms().isEmpty()) {
                bspEnforcer.handleBSPRule(BSPRule.R5416);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'reference' to 'Reference'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        List<WSDataRef> protectedRefs = new ArrayList<>(signedInfo.getReferences().size());
        for (Object reference : signedInfo.getReferences()) {
            Reference siRef = (Reference)reference;
            String uri = siRef.getURI();

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'context' to 'DOMValidateContext'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
            testMessageReplay(elem, xmlSignature.getSignatureValue().getValue(), key, data, wsDocInfo);

            setElementsOnContext(xmlSignature, (DOMValidateContext)context, data, wsDocInfo);

            boolean signatureOk = xmlSignature.validate(context);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'transformObject' to 'Transform'
in `ws-security-dom/src/main/java/org/apache/wss4j/dom/processor/SignatureProcessor.java`
#### Snippet
```java
        for (Object transformObject : siRef.getTransforms()) {

            Transform transform = (Transform)transformObject;

            if (STRTransform.TRANSFORM_URI.equals(transform.getAlgorithm())) {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'refObject' to 'Reference'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/AlgorithmSuiteValidator.java`
#### Snippet
```java

        for (Object refObject : xmlSignature.getSignedInfo().getReferences()) {
            Reference reference = (Reference)refObject;
            // Digest Algorithm
            String digestMethod = reference.getDigestMethod().getAlgorithm();
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'privateKey' to 'PrivateKey'
in `ws-security-common/src/main/java/org/apache/wss4j/common/crypto/Merlin.java`
#### Snippet
```java
                Key privateKey = privateKeyCache.get(identifier);
                if (privateKey != null) {
                    return (PrivateKey) privateKey;
                }
            }
```

