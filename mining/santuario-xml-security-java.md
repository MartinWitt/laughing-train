# santuario-xml-security-java 
 
# Bad smells
I found 1272 bad smells with 157 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 275 | false |
| ReturnNull | 245 | false |
| UnusedAssignment | 116 | false |
| DataFlowIssue | 73 | false |
| SizeReplaceableByIsEmpty | 53 | true |
| UnnecessarySuperQualifier | 46 | false |
| AssignmentToMethodParameter | 45 | false |
| NonProtectedConstructorInAbstractClass | 43 | true |
| RedundantFieldInitialization | 40 | false |
| BoundedWildcard | 29 | false |
| FinalStaticMethod | 28 | false |
| ConstantValue | 27 | false |
| NestedAssignment | 25 | false |
| StaticCallOnSubclass | 23 | false |
| RedundantSuppression | 19 | false |
| UnnecessaryModifier | 17 | true |
| UtilityClassWithoutPrivateConstructor | 12 | true |
| ProtectedMemberInFinalClass | 12 | true |
| UnnecessaryLocalVariable | 11 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 10 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 10 | false |
| DuplicateBranchesInSwitch | 8 | false |
| UnnecessaryInitCause | 6 | false |
| TrivialStringConcatenation | 5 | false |
| RedundantMethodOverride | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| IfStatementWithIdenticalBranches | 4 | false |
| NonFinalFieldOfException | 4 | false |
| AbstractMethodCallInConstructor | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| UnnecessaryStringEscape | 3 | true |
| CommentedOutCode | 3 | false |
| ManualMinMaxCalculation | 3 | false |
| ThrowFromFinallyBlock | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| EmptyMethod | 3 | false |
| CallToStringConcatCanBeReplacedByOperator | 3 | false |
| CastConflictsWithInstanceof | 3 | false |
| IndexOfReplaceableByContains | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| CastCanBeRemovedNarrowingVariableType | 3 | false |
| DuplicateExpressions | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| SynchronizeOnThis | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| MismatchedJavadocCode | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SystemOutErr | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| Anonymous2MethodRef | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| FinalPrivateMethod | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| UNUSED_IMPORT | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| NonStrictComparisonCanBeEquality | 1 | true |
| CaughtExceptionImmediatelyRethrown | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Element\[list.size()\]'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        return list.toArray(new Element[list.size()]);
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/ext/InboundXMLSec.java`
#### Snippet
```java
public class InboundXMLSec {

    protected static final transient Logger LOG = LoggerFactory.getLogger(InboundXMLSec.class);

    private static final XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/OutputProcessorChainImpl.java`
#### Snippet
```java
public class OutputProcessorChainImpl implements OutputProcessorChain {

    protected static final transient Logger LOG = LoggerFactory.getLogger(OutputProcessorChainImpl.class);

    private List<OutputProcessor> outputProcessors;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
public class InputProcessorChainImpl implements InputProcessorChain {

    protected static final transient Logger LOG = LoggerFactory.getLogger(InputProcessorChainImpl.class);

    private List<InputProcessor> inputProcessors;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/util/DigestOutputStream.java`
#### Snippet
```java

    protected static final transient Logger LOG = LoggerFactory.getLogger(DigestOutputStream.class);
    protected static final transient boolean isDebugEnabled = LOG.isDebugEnabled();

    private final MessageDigest messageDigest;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/util/DigestOutputStream.java`
#### Snippet
```java
public class DigestOutputStream extends OutputStream {

    protected static final transient Logger LOG = LoggerFactory.getLogger(DigestOutputStream.class);
    protected static final transient boolean isDebugEnabled = LOG.isDebugEnabled();

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/util/SignerOutputStream.java`
#### Snippet
```java
public class SignerOutputStream extends OutputStream {

    protected static final transient Logger LOG = LoggerFactory.getLogger(SignerOutputStream.class);
    protected static final transient boolean isDebugEnabled = LOG.isDebugEnabled();

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/util/SignerOutputStream.java`
#### Snippet
```java

    protected static final transient Logger LOG = LoggerFactory.getLogger(SignerOutputStream.class);
    protected static final transient boolean isDebugEnabled = LOG.isDebugEnabled();

    private final SignatureAlgorithm signatureAlgorithm;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/LogInputProcessor.java`
#### Snippet
```java
public class LogInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(LogInputProcessor.class);

    public LogInputProcessor(XMLSecurityProperties securityProperties) {
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
public abstract class AbstractSignatureReferenceVerifyInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureReferenceVerifyInputProcessor.class);

    protected static final Integer maximumAllowedReferencesPerManifest =
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLSignatureOutputProcessor.java`
#### Snippet
```java
public class XMLSignatureOutputProcessor extends AbstractSignatureOutputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(XMLSignatureOutputProcessor.class);

    public XMLSignatureOutputProcessor() throws XMLSecurityException {
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
public abstract class AbstractSignatureInputHandler extends AbstractInputSecurityHeaderHandler {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureInputHandler.class);
    private static final Set<String> C14N_ALGORITHMS;

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
public class XMLEncryptedKeyInputHandler extends AbstractInputSecurityHeaderHandler {

    private static final transient Logger LOG = LoggerFactory.getLogger(XMLEncryptedKeyInputHandler.class);

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java
public abstract class AbstractSignatureOutputProcessor extends AbstractOutputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureOutputProcessor.class);

    private final List<SignaturePartDef> signaturePartDefList = new ArrayList<>();
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
public abstract class AbstractDecryptInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractDecryptInputProcessor.class);

    protected static final Integer maximumAllowedXMLStructureDepth =
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
public class XMLEncryptOutputProcessor extends AbstractEncryptOutputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(XMLEncryptOutputProcessor.class);

    public XMLEncryptOutputProcessor() throws XMLSecurityException {
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
public abstract class AbstractSignatureEndingOutputProcessor extends AbstractBufferingOutputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureEndingOutputProcessor.class);

    private List<SignaturePartDef> signaturePartDefList;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
public class XIncludeHandler extends DefaultHandler {

    private static final transient Logger LOG = LoggerFactory.getLogger(XIncludeHandler.class);

    private static final String xIncludeNS = "http://www.w3.org/2001/XInclude";
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/ext/OutboundXMLSec.java`
#### Snippet
```java
            // If none is configured then generate one
            String keyAlgorithm =
                JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(securityProperties.getEncryptionSymAlgorithm());
            KeyGenerator keyGen;
            try {
```

### StaticCallOnSubclass
Static method `getKeyLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/ext/OutboundXMLSec.java`
#### Snippet
```java
            if (keyAlgorithm.contains("AES")) {
                int keyLength =
                    JCEAlgorithmMapper.getKeyLengthFromURI(securityProperties.getEncryptionSymAlgorithm());
                keyGen.init(keyLength);
            }
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java

        String digestMethodAlgorithm = referenceType.getDigestMethod().getAlgorithm();
        String jceName = JCEAlgorithmMapper.translateURItoJCEID(digestMethodAlgorithm);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(digestMethodAlgorithm);
        if (jceName == null) {
```

### StaticCallOnSubclass
Static method `getJCEProviderFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
        String digestMethodAlgorithm = referenceType.getDigestMethod().getAlgorithm();
        String jceName = JCEAlgorithmMapper.translateURItoJCEID(digestMethodAlgorithm);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(digestMethodAlgorithm);
        if (jceName == null) {
            throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `getAlgorithmClassFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory.java`
#### Snippet
```java

    public SignatureAlgorithm getSignatureAlgorithm(String algoURI) throws XMLSecurityException, NoSuchProviderException, NoSuchAlgorithmException {
        String algorithmClass = JCEAlgorithmMapper.getAlgorithmClassFromURI(algoURI);
        if (algorithmClass == null) {
            throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory.java`
#### Snippet
```java
                                           new Object[] {algoURI});
        }
        String jceName = JCEAlgorithmMapper.translateURItoJCEID(algoURI);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algoURI);
        if ("MAC".equalsIgnoreCase(algorithmClass)) {
```

### StaticCallOnSubclass
Static method `getJCEProviderFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory.java`
#### Snippet
```java
        }
        String jceName = JCEAlgorithmMapper.translateURItoJCEID(algoURI);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algoURI);
        if ("MAC".equalsIgnoreCase(algorithmClass)) {
            return new HMACSignatureAlgorithm(jceName, jceProvider);
```

### StaticCallOnSubclass
Static method `getJCEKeyAlgorithmFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                        }

                        String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                        key = new SecretKeySpec(getSecret(this, correlationID, algorithmURI), algoFamily);
                        setSecretKey(algorithmURI, key);
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                            throw new XMLSecurityException("stax.encryption.noEncAlgo");
                        }
                        String jceName = JCEAlgorithmMapper.translateURItoJCEID(algorithmURI);
                        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algorithmURI);
                        if (jceName == null) {
```

### StaticCallOnSubclass
Static method `getJCEProviderFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                        }
                        String jceName = JCEAlgorithmMapper.translateURItoJCEID(algorithmURI);
                        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algorithmURI);
                        if (jceName == null) {
                            throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                    inboundSecurityContext.registerSecurityEvent(algorithmSuiteSecurityEvent);

                                    jceDigestAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(digestMethodType.getAlgorithm());
                                }

```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                        XMLSecurityUtils.getQNameType(encryptedKeyType.getEncryptionMethod().getContent(), XMLSecurityConstants.TAG_xenc11_MGF);
                                if (mgfType != null) {
                                    String jceMGFAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(mgfType.getAlgorithm());
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
```

### StaticCallOnSubclass
Static method `getKeyLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                    "Generating a faked one to mitigate timing attacks.");

                            int keyLength = JCEAlgorithmMapper.getKeyLengthFromURI(symmetricAlgorithmURI);
                            this.decryptedKey = XMLSecurityConstants.generateBytes(keyLength / 8);
                            return this.decryptedKey;
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java
            throws XMLSecurityException {

        String jceName = JCEAlgorithmMapper.translateURItoJCEID(digestAlgorithm);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(digestAlgorithm);
        if (jceName == null) {
```

### StaticCallOnSubclass
Static method `getJCEProviderFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java

        String jceName = JCEAlgorithmMapper.translateURItoJCEID(digestAlgorithm);
        String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(digestAlgorithm);
        if (jceName == null) {
            throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        Cipher symCipher;
        try {
            String jceName = JCEAlgorithmMapper.translateURItoJCEID(algorithmURI);
            String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algorithmURI);
            if (jceName == null) {
```

### StaticCallOnSubclass
Static method `getJCEProviderFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        try {
            String jceName = JCEAlgorithmMapper.translateURItoJCEID(algorithmURI);
            String jceProvider = JCEAlgorithmMapper.getJCEProviderFromURI(algorithmURI);
            if (jceName == null) {
                throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `getIVLengthFromURI()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java

                final String algorithmURI = encryptedDataType.getEncryptionMethod().getAlgorithm();
                final int ivLength = JCEAlgorithmMapper.getIVLengthFromURI(algorithmURI) / 8;
                Cipher symCipher = getCipher(algorithmURI);

```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java
            try {
                //initialize the cipher
                String jceAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionSymAlgorithm);
                if (jceAlgorithm == null) {
                    throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java

                        //encrypt the symmetric session key with the public key from the receiver:
                        String jceid = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportAlgorithm);
                        if (jceid == null) {
                            throw new XMLSecurityException("algorithms.NoSuchMap",
```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                                String jceDigestAlgorithm = "SHA-1";
                                if (encryptionKeyTransportDigestAlgorithm != null) {
                                    jceDigestAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportDigestAlgorithm);
                                }

```

### StaticCallOnSubclass
Static method `translateURItoJCEID()` declared in class 'org.apache.xml.security.algorithms.JCEMapper' but referenced via subclass 'org.apache.xml.security.stax.config.JCEAlgorithmMapper'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                                MGF1ParameterSpec mgfParameterSpec = new MGF1ParameterSpec("SHA-1");
                                if (encryptionKeyTransportMGFAlgorithm != null) {
                                    String jceMGFAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportMGFAlgorithm);
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
```

### StaticCallOnSubclass
Static method `newInstance()` declared in class 'javax.xml.transform.TransformerFactory' but referenced via subclass 'javax.xml.transform.sax.SAXTransformerFactory'
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
                try {
                    XMLReader xmlReader = XMLReaderFactory.createXMLReader();
                    SAXTransformerFactory saxTransformerFactory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
                    saxTransformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
                    try {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
public class ResolverXPointer implements ResourceResolver, ResourceResolverLookup {

    private Pattern pattern = Pattern.compile("^#xpointer\\((/)|(id\\([\"\']([^\"\']*)[\"\']\\))\\)");
    private String id;
    private boolean rootNodeOccured = false;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
public class ResolverXPointer implements ResourceResolver, ResourceResolverLookup {

    private Pattern pattern = Pattern.compile("^#xpointer\\((/)|(id\\([\"\']([^\"\']*)[\"\']\\))\\)");
    private String id;
    private boolean rootNodeOccured = false;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
public class ResolverXPointer implements ResourceResolver, ResourceResolverLookup {

    private Pattern pattern = Pattern.compile("^#xpointer\\((/)|(id\\([\"\']([^\"\']*)[\"\']\\))\\)");
    private String id;
    private boolean rootNodeOccured = false;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
            os.flush();

            //this.getReferencedBytes(diOs);
            //mda.update(data);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
        // important: The ds:Reference must be added to the associated ds:Manifest
        //            or ds:SignedInfo _before_ the this.resolverResult() is called.
        // this.manifest.appendChild(this.constructionElement);
        // this.manifest.appendChild(this.doc.createTextNode("\n"));

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        }

        /*
        CipherValue newCipherValue(byte[] value) {
            return new CipherValueImpl(value);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `oldVals`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        int oldCapacity = keys.length;
        String[] oldKeys = keys;
        NameSpaceSymbEntry oldVals[] = entries;

        keys = new String[newCapacity];
```

### CStyleArrayDeclaration
C-style array declaration of local variable `x509Digests`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        throws XMLSecurityException {

        XMLX509Digest x509Digests[] = null;

        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);
```

### CStyleArrayDeclaration
C-style array declaration of local variable `x509childNodes`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        XMLX509Digest x509Digests[] = null;

        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);

        if (x509childNodes == null || x509childNodes.length <= 0) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `attrs2`
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
            NamedNodeMap attrs = currentElement.getAttributes();
            int attrsLength = attrs.getLength();
            Attr attrs2[] = new Attr[attrsLength];

            for (int i = 0; i < attrsLength; i++) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformEnvelopedSignature.java`
#### Snippet
```java
                return XMLSecurityConstants.TransformMethod.XMLSecEvent;
            case InputStream:
                return XMLSecurityConstants.TransformMethod.XMLSecEvent;
            default:
                throw new IllegalArgumentException("Unsupported class " + forInput.name());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformBase64Decode.java`
#### Snippet
```java
                return XMLSecurityConstants.TransformMethod.InputStream;
            case InputStream:
                return XMLSecurityConstants.TransformMethod.InputStream;
            default:
                throw new IllegalArgumentException("Unsupported class " + forInput.name());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    break;
                case XMLStreamConstants.SPACE:
                    if (currentDocumentLevel == DocumentLevel.NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT) {
                        outputTextToWriter(xmlSecEvent.asCharacters().getText(), outputStream);
                    }
                    break;
                case XMLStreamConstants.START_DOCUMENT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.ATTRIBUTE:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.DTD:
                    break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.DTD:
                    break;
                case XMLStreamConstants.CDATA:
                    outputTextToWriter(xmlSecEvent.asCharacters().getData(), outputStream);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    break;
                case XMLStreamConstants.NAMESPACE:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.NOTATION_DECLARATION:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.NOTATION_DECLARATION:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.ENTITY_DECLARATION:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
                case XMLStreamConstants.ENTITY_DECLARATION:
                    throw new XMLStreamException("illegal event :" + XMLSecurityUtils.getXMLEventAsString(xmlSecEvent));
            }
        } catch (IOException e) {
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @throws IOException
     */
    private static final void outputTextToWriter(
        final String text, final OutputStream writer
    ) throws IOException {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[s]` can be simplified to 's'
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverHttp.java`
#### Snippet
```java
    private String uri;
    private String baseURI;
    private Pattern pattern = Pattern.compile("^http[s]?://.*");

    public ResolverHttp() {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
     */
    public static String getQNameString(String prefix, String localName) {
        String qName = prefix == null || prefix.length() == 0
                ? localName : prefix + ":" + localName;

```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
                                        String nsURI, String prefix)
    {
        String qName = (prefix == null || prefix.length() == 0)
                       ? tag : prefix + ":" + tag;
        return doc.createElementNS(nsURI, qName);
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMExcC14NMethod.java`
#### Snippet
```java
                                               CanonicalizationMethod.EXCLUSIVE,
                                               prefix);
        if (prefix == null || prefix.length() == 0) {
            eElem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns",
                                 CanonicalizationMethod.EXCLUSIVE);
```

### SizeReplaceableByIsEmpty
`uri.length() == 0` can be replaced with 'uri.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/Utils.java`
#### Snippet
```java
     */
    public static String parseIdFromSameDocumentURI(String uri) {
        if (uri.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`uri.length() == 0` can be replaced with 'uri.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/Utils.java`
#### Snippet
```java
     */
    public static boolean sameDocumentURI(String uri) {
        return uri != null && (uri.length() == 0 || uri.charAt(0) == '#');
    }

```

### SizeReplaceableByIsEmpty
`uri.length() != 0` can be replaced with '!uri.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java

        // Check if same-document URI and already registered on the context
        if (uri != null && uri.length() != 0 && uri.charAt(0) == '#') {
            String id = uri.substring(1);

```

### SizeReplaceableByIsEmpty
`baseURI.length() > 0` can be replaced with '!baseURI.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java

                result.setMIMEType("text/xml");
                if (baseURI != null && baseURI.length() > 0) {
                    result.setSourceURI(baseURI.concat(uriAttr.getNodeValue()));
                } else {
```

### SizeReplaceableByIsEmpty
`dsPrefix.length() == 0` can be replaced with 'dsPrefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfo.java`
#### Snippet
```java
            (DOMUtils.getOwnerDocument(pNode), "KeyInfo",
             XMLSignature.XMLNS, dsPrefix);
        if (dsPrefix == null || dsPrefix.length() == 0) {
            kiElem.setAttributeNS("http://www.w3.org/2000/xmlns/",
                                  "xmlns", XMLSignature.XMLNS);
```

### SizeReplaceableByIsEmpty
`uri.length() == 0` can be replaced with 'uri.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            // reference dependencies in the XPath Transform - so be on
            // the safe side, and skip and do at end in the final sweep
            if (uri.length() == 0) {
                List<Transform> transforms = ref.getTransforms();
                for (Transform transform : transforms) {
```

### SizeReplaceableByIsEmpty
`dsPrefix.length() == 0` can be replaced with 'dsPrefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java

        // append xmlns attribute
        if (dsPrefix == null || dsPrefix.length() == 0) {
            sigElem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns",
                                   XMLSignature.XMLNS);
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
            (XPathFilter2ParameterSpec)getParameterSpec();
        String prefix = DOMUtils.getNSPrefix(context, Transform.XPATH2);
        String qname = prefix == null || prefix.length() == 0
                       ? "xmlns" : "xmlns:" + prefix;
        @SuppressWarnings("unchecked")
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            }
            DOMUtils.setAttribute(namedCurveElem, "URI", "urn:oid:" + oid);
            String qname = (prefix == null || prefix.length() == 0)
                       ? "xmlns" : "xmlns:" + prefix;
            namedCurveElem.setAttributeNS("http://www.w3.org/2000/xmlns/",
```

### SizeReplaceableByIsEmpty
`namespaceValue.length() == 0` can be replaced with 'namespaceValue.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/helper/C14nHelper.java`
#### Snippet
```java
    public static boolean namespaceIsAbsolute(String namespaceValue) {
        // assume empty namespaces are absolute
        if (namespaceValue.length() == 0) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            element.getAttributeNS(null, "DESCRIPTION");

                        if (description != null && description.length() > 0) {
                            LOG.debug("Register Resolver: {}: {}", javaClass, description);
                        } else {
```

### SizeReplaceableByIsEmpty
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            element.getAttributeNS(null, "DESCRIPTION");

                        if (description != null && description.length() > 0) {
                            LOG.debug("Register Resolver: {}: {}", javaClass, description);
                        } else {
```

### SizeReplaceableByIsEmpty
`entries[i].uri.length() != 0` can be replaced with '!entries\[i\].uri.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        List<NameSpaceSymbEntry> a = new ArrayList<>();
        for (int i = 0;i < entries.length;i++) {
            if (entries[i] != null && entries[i].uri.length() != 0) {
                a.add(entries[i]);
            }
```

### SizeReplaceableByIsEmpty
`output.length() == 0` can be replaced with 'output.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        if (LOG.isDebugEnabled()) {
            LOG.debug(" " + step + ":   " + output);
            if (output.length() == 0) {
                LOG.debug("\t\t\t\t" + input);
            } else {
```

### SizeReplaceableByIsEmpty
`input.length() != 0` can be replaced with '!input.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java

        // While the input buffer is not empty, loop as follows
        while (input.length() != 0) {
            // 2A. If the input buffer begins with a prefix of "./",
            // then remove that prefix from the input buffer
```

### SizeReplaceableByIsEmpty
`base.length() != 0` can be replaced with '!base.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                    }
                }
                if (base != null && base.length() != 0) {
                    baseAttr.setValue(base);
                    col.add(baseAttr);
```

### SizeReplaceableByIsEmpty
`rpath.length() == 0` can be replaced with 'rpath.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                tquery = rquery;
            } else {
                if (rpath.length() == 0) {
                    tpath = bpath;
                    if (rquery != null) {
```

### SizeReplaceableByIsEmpty
`bpath.length() == 0` can be replaced with 'bpath.isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                        tpath = removeDotSegments(rpath);
                    } else {
                        if (bauthority != null && bpath.length() == 0) {
                            tpath = "/" + rpath;
                        } else {
```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java

        String prefix = ElementProxy.getDefaultPrefix(this.getBaseNamespace());
        if (prefix != null && prefix.length() > 0) {
            getElement().setAttributeNS(Constants.NamespaceSpecNS, "xmlns:" + prefix,
                                        this.getBaseNamespace());
```

### SizeReplaceableByIsEmpty
`element.getPrefix().length() == 0` can be replaced with 'element.getPrefix().isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
            String prefix = null;
            if (element.getNamespaceURI() != null
                && !(element.getPrefix() == null || element.getPrefix().length() == 0)) {
                prefix = element.getPrefix();
            } else {
```

### SizeReplaceableByIsEmpty
`element.getPrefix().length() == 0` can be replaced with 'element.getPrefix().isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
        String prefix = null;
        if (element.getNamespaceURI() != null
            && !(element.getPrefix() == null || element.getPrefix().length() == 0)) {
            prefix = element.getPrefix();
        } else {
```

### SizeReplaceableByIsEmpty
`nsprefix.getValue().length() == 0` can be replaced with 'nsprefix.getValue().isEmpty()'
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
        parents.clear();
        Attr nsprefix = ns.getMappingWithoutRendered(XMLNS);
        if (nsprefix != null && nsprefix.getValue().length() == 0) {
            ns.addMappingAndRender(
                    XMLNS, "", getNullNode(nsprefix.getOwnerDocument()));
```

### SizeReplaceableByIsEmpty
`reference.length() > 0` can be replaced with '!reference.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
     */
    public static String dropReferenceMarker(String reference) {
        if (reference != null && reference.length() > 0 && reference.charAt(0) == '#') {
            return reference.substring(1);
        }
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecNamespaceImpl.java`
#### Snippet
```java
    @Override
    public boolean isDefaultNamespaceDeclaration() {
        return prefix.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`namespaceURI.length() == 0` can be replaced with 'namespaceURI.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            String uri = getNamespaceURI();
            // No namespace?
            if (namespaceURI.length() == 0) {
                if (uri != null && uri.length() > 0) {
                    throw new XMLStreamException("Expected empty namespace, instead have '" + uri + "'.");
```

### SizeReplaceableByIsEmpty
`uri.length() > 0` can be replaced with '!uri.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            // No namespace?
            if (namespaceURI.length() == 0) {
                if (uri != null && uri.length() > 0) {
                    throw new XMLStreamException("Expected empty namespace, instead have '" + uri + "'.");
                }
```

### SizeReplaceableByIsEmpty
`attributeName.getNamespaceURI().length() != 0` can be replaced with '!attributeName.getNamespaceURI().isEmpty()'
in `src/main/java/org/apache/xml/security/stax/ext/AbstractOutputProcessor.java`
#### Snippet
```java

            final QName attributeName = xmlSecAttribute.getName();
            if (attributeName.getNamespaceURI() != null && attributeName.getNamespaceURI().length() != 0
                && !declaredNamespaces.contains(xmlSecAttribute.getAttributeNamespace())) {
                xmlSecStartElement.addNamespace(xmlSecAttribute.getAttributeNamespace());
```

### SizeReplaceableByIsEmpty
`baseURI.length() == 0` can be replaced with 'baseURI.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverFilesystem.java`
#### Snippet
```java
        try {
            URI tmp;
            if (baseURI == null || baseURI.length() == 0) {
                tmp = new URI(uri);
            } else {
```

### SizeReplaceableByIsEmpty
`baseURI.length() == 0` can be replaced with 'baseURI.isEmpty()'
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverHttp.java`
#### Snippet
```java
        try {
            URI tmp;
            if (baseURI == null || baseURI.length() == 0) {
                tmp = new URI(uri);
            } else {
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java

        String prefix = ElementProxy.getDefaultPrefix(getBaseNamespace());
        if (prefix == null || prefix.length() == 0) {
            getElement().setAttributeNS(Constants.NamespaceSpecNS, "xmlns", getBaseNamespace());
        } else {
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java

        if (toXml) {
            if (value.length() > 0 && value.charAt(0) == '#') {
                value = '\\' + value;
            }
```

### SizeReplaceableByIsEmpty
`context.baseUri.length() > 0` can be replaced with '!context.baseUri.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java

        result.setMIMEType("text/xml");
        if (context.baseUri != null && context.baseUri.length() > 0) {
            result.setSourceURI(context.baseUri.concat(context.uriToResolve));
        } else {
```

### SizeReplaceableByIsEmpty
`xencPrefix.length() == 0` can be replaced with 'xencPrefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        }

        if (xencPrefix == null || xencPrefix.length() == 0) {
            return doc.createElementNS(EncryptionConstants.EncryptionSpecNS, elementName);
        }
```

### SizeReplaceableByIsEmpty
`xenc11Prefix.length() == 0` can be replaced with 'xenc11Prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        }

        if (xenc11Prefix == null || xenc11Prefix.length() == 0) {
            return doc.createElementNS(EncryptionConstants.EncryptionSpec11NS, elementName);
        }
```

### SizeReplaceableByIsEmpty
`ds11Prefix.length() == 0` can be replaced with 'ds11Prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        }

        if (ds11Prefix == null || ds11Prefix.length() == 0) {
            return doc.createElementNS(Constants.SignatureSpec11NS, elementName);
        }
```

### SizeReplaceableByIsEmpty
`dsPrefix.length() == 0` can be replaced with 'dsPrefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        }

        if (dsPrefix == null || dsPrefix.length() == 0) {
            return doc.createElementNS(Constants.SignatureSpecNS, elementName);
        }
```

### SizeReplaceableByIsEmpty
`baseURI.length() == 0` can be replaced with 'baseURI.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverLocalFilesystem.java`
#### Snippet
```java
    private static URI getNewURI(String uri, String baseURI) throws URISyntaxException {
        URI newUri = null;
        if (baseURI == null || baseURI.length() == 0) {
            newUri = new URI(uri);
        } else {
```

### SizeReplaceableByIsEmpty
`context.baseUri.length() > 0` can be replaced with '!context.baseUri.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverFragment.java`
#### Snippet
```java

        result.setMIMEType("text/xml");
        if (context.baseUri != null && context.baseUri.length() > 0) {
            result.setSourceURI(context.baseUri.concat(context.uriToResolve));
        } else {
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
        String ns;

        if (prefix == null || prefix.length() == 0) {
            throw new XMLSecurityException("defaultNamespaceCannotBeSetHere");
        } else if ("xmlns".equals(prefix)) {
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
            String baseName = this.getBaseNamespace();
            String prefix = ElementProxy.getDefaultPrefix(baseName);
            if (prefix == null || prefix.length() == 0) {
                result = doc.createElementNS(namespace, localName);
                result.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", namespace);
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
            result = doc.createElementNS(null, localName);
        } else {
            if (prefix == null || prefix.length() == 0) {
                result = doc.createElementNS(namespace, localName);
                result.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", namespace);
```

### SizeReplaceableByIsEmpty
`baseURI.length() == 0` can be replaced with 'baseURI.isEmpty()'
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
    private static URI getNewURI(String uri, String baseURI) throws URISyntaxException {
        URI newUri = null;
        if (baseURI == null || baseURI.length() == 0) {
            newUri = new URI(uri);
        } else {
```

### SizeReplaceableByIsEmpty
`hmacLength.length() != 0` can be replaced with '!hmacLength.isEmpty()'
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
        if (n != null) {
            String hmacLength = XMLUtils.getFullTextChildrenFromNode(n);
            if (hmacLength != null && hmacLength.length() != 0) {
                this.hmacOutputLength = new HMACOutputLength(Integer.parseInt(hmacLength));
            }
```

### SizeReplaceableByIsEmpty
`xmlnsDsPrefix.length() == 0` can be replaced with 'xmlnsDsPrefix.isEmpty()'
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java

        String xmlnsDsPrefix = getDefaultPrefix(Constants.SignatureSpecNS);
        if (xmlnsDsPrefix == null || xmlnsDsPrefix.length() == 0) {
            getElement().setAttributeNS(
                Constants.NamespaceSpecNS, "xmlns", Constants.SignatureSpecNS
```

### SizeReplaceableByIsEmpty
`xmlnsDsPrefix.length() == 0` can be replaced with 'xmlnsDsPrefix.isEmpty()'
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java

        String xmlnsDsPrefix = getDefaultPrefix(Constants.SignatureSpecNS);
        if (xmlnsDsPrefix == null || xmlnsDsPrefix.length() == 0) {
            getElement().setAttributeNS(
                Constants.NamespaceSpecNS, "xmlns", Constants.SignatureSpecNS
```

### SizeReplaceableByIsEmpty
`inclusiveNamespaces.length() == 0` can be replaced with 'inclusiveNamespaces.isEmpty()'
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
        SortedSet<String> prefixes = new TreeSet<>();

        if (inclusiveNamespaces == null || inclusiveNamespaces.length() == 0) {
            return prefixes;
        }
```

### SizeReplaceableByIsEmpty
`algorithmURI.length() == 0` can be replaced with 'algorithmURI.isEmpty()'
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
        String algorithmURI = element.getAttributeNS(null, Constants._ATT_ALGORITHM);

        if (algorithmURI == null || algorithmURI.length() == 0) {
            Object[] exArgs = { Constants._ATT_ALGORITHM, Constants._TAG_TRANSFORM };
            throw new TransformationException("xml.WrongContent", exArgs);
```

### SizeReplaceableByIsEmpty
`type.length() == 0` can be replaced with 'type.isEmpty()'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             */
            public void setType(String type) {
                if (type == null || type.length() == 0) {
                    this.type = null;
                } else {
```

### SizeReplaceableByIsEmpty
`target.length() == 0` can be replaced with 'target.isEmpty()'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /** {@inheritDoc} */
            public void setTarget(String target) {
                if (target == null || target.length() == 0) {
                    this.target = null;
                } else if (target.charAt(0) == '#') {
```

### SizeReplaceableByIsEmpty
`encoding.length() == 0` can be replaced with 'encoding.isEmpty()'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             */
            public void setEncoding(String encoding) {
                if (encoding == null || encoding.length() == 0) {
                    this.encoding = null;
                } else {
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) || ...`
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                        final String encryptionKeyTransportMGFAlgorithm = getSecurityProperties().getEncryptionKeyTransportMGFAlgorithm();

                        if (XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) ||
                                XMLSecurityConstants.NS_XENC_RSAOAEPMGF1P.equals(encryptionKeyTransportAlgorithm)) {

                            byte[] oaepParams = getSecurityProperties().getEncryptionKeyTransportOAEPParams();
```

### DuplicateExpressions
Multiple occurrences of `XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) || ...`
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java

                            AlgorithmParameterSpec algorithmParameterSpec = null;
                            if (XMLSecurityConstants.NS_XENC11_RSAOAEP.equals(encryptionKeyTransportAlgorithm) ||
                                    XMLSecurityConstants.NS_XENC_RSAOAEPMGF1P.equals(encryptionKeyTransportAlgorithm)) {

                                String jceDigestAlgorithm = "SHA-1";
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java

    private InputStream writeWrapperEndElement() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        //close the dummy wrapper element:
        stringBuilder.append("</");
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a constructor
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
            if (id != null) {
                this.id = id;
                return;
            }
        }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `validateRefs &= refValid`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            boolean refValid = ref.validate(vc);
            LOG.debug("Reference [{}] is valid: {}", ref.getURI(), refValid);
            validateRefs &= refValid;
        }
        if (!validateRefs) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `validateMans &= refValid`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
                                "Manifest ref [{}] is valid: {}", ref.getURI(),  refValid
                            );
                            validateMans &= refValid;
                        }
                    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java
            sa.update(arg0, arg1, arg2);
        } catch (XMLSignatureException e) {
            throw new RuntimeException("" + e);
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java
            sa.update(arg0);
        } catch (XMLSignatureException e) {
            throw new RuntimeException("" + e);
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java
            sa.update((byte)arg0);
        } catch (XMLSignatureException e) {
            throw new RuntimeException("" + e);
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
                            || c2 >= 97 && c2 <= 102)) {
                        try {
                            char ch = (char) Byte.parseByte("" + c1 + c2, 16);

                            sb.append(ch);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
                XMLUtils.createElementInSignatureSpace(doc, Constants._TAG_HMACOUTPUTLENGTH);
            Text HMText =
                doc.createTextNode("" + hmacOutputLength.length);

            HMElem.appendChild(HMText);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
            keySpec =
                new SecretKeySpec(
                    rawKey, 0, rawKey.length > size ? size : rawKey.length, keyAlgorithm
                );
        } else if (rawKey.length > MAX_SYMMETRIC_KEY_SIZE) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/xml/security/utils/UnsyncByteArrayInputStream.java`
#### Snippet
```java
        }

        int copylen = this.count - pos < length ? this.count - pos : length;
        System.arraycopy(buf, pos, b, offset, copylen);
        pos += copylen;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/xml/security/utils/UnsyncByteArrayInputStream.java`
#### Snippet
```java
        pos = offset;
        mark = offset;
        count = offset + length > buf.length ? buf.length : offset + length;
    }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
     * @return true if the library is already initialized.
     */
    public static final synchronized boolean isInitialized() {
        return Init.alreadyInitialized;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @throws InvalidCanonicalizerException
     */
    public static final Canonicalizer getInstance(String algorithmURI)
        throws InvalidCanonicalizerException {
        return new Canonicalizer(algorithmURI);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @throws KeyResolverException
     */
    public static final PublicKey getPublicKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @throws KeyResolverException
     */
    public static final X509Certificate getX509Certificate(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @throws IOException
     */
    protected static final void outputAttrToWriter(
        final String name, final String value,
        final OutputStream writer, final Map<String, byte[]> cache
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @throws IOException
     */
    private static final void outputTextToWriter(
        final String text, final OutputStream writer
    ) throws IOException {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isPad(byte octet) {
        return octet == PAD;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     */
    public static final Element encodeToElement(Document doc, String localName, byte[] bytes) {
        Element el = XMLUtils.createElementInSignatureSpace(doc, localName);
        Text text = doc.createTextNode(encode(bytes));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(String base64Data, OutputStream os)
        throws Base64DecodingException, IOException {
        byte[] bytes = new byte[base64Data.length()];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromText(Text text)
        throws Base64DecodingException {
        return new BigInteger(1, Base64.decode(text.getData()));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return String with Base64 encoding
     */
    public static final String encode(BigInteger big) {
        byte[] bytes = XMLUtils.getBytes(big, big.bitLength());
        return XMLUtils.encodeToString(bytes);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param biginteger
     */
    public static final void fillElementWithBigInteger(Element element, BigInteger biginteger) {

        String encodedInt = encode(biginteger);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(byte[] base64Data, OutputStream os)
        throws Base64DecodingException, IOException {
        decode(base64Data, os, -1);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(InputStream is, OutputStream os)
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final void decode(byte[] base64Data, OutputStream os, int len)
        throws Base64DecodingException, IOException {
        // remove white spaces
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a <code>String</code> with encoded data
     */
    public static final String  encode(byte[] binaryData, int length) {
        if (length < 4) {
            length = Integer.MAX_VALUE;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final byte[] decode(BufferedReader reader)
        throws IOException, Base64DecodingException {

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the new length
     */
    protected static final int removeWhiteSpace(byte[] data) {
        if (data == null) {
            return 0;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
    static final byte[] getBytes(BigInteger big, int bitlen) {

        //round bitlen
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final int getBytesInternal(String s, byte[] result) {
        int length = s.length();

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException if there is a problem decoding the data
     */
    public static final byte[] decode(String encoded) throws Base64DecodingException {
        if (encoded == null) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the <code>String</code> with encoded data
     */
    public static final String encode(byte[] binaryData) {
        return XMLUtils.ignoreLineBreaks()
            ? encode(binaryData, Integer.MAX_VALUE)
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromElement(Element element)
        throws Base64DecodingException {
        return new BigInteger(1, Base64.decode(element));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
    public static final byte[] encode(BigInteger big, int bitlen) {

        //round bitlen
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final byte[] decodeInternal(byte[] base64Data, int len)
        throws Base64DecodingException {
        // remove white spaces
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final byte[] decode(Element element) throws Base64DecodingException {

        Node sibling = element.getFirstChild();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     */
    public static final byte[] decode(byte[] base64) throws Base64DecodingException  {
        return decodeInternal(base64, -1);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isWhiteSpace(byte octet) {
        return octet == 0x20 || octet == 0xd || octet == 0xa || octet == 0x9;
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractEncryptEndingOutputProcessor` has no concrete subclass
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptEndingOutputProcessor.java`
#### Snippet
```java
 *
 */
public abstract class AbstractEncryptEndingOutputProcessor extends AbstractBufferingOutputProcessor {

    public AbstractEncryptEndingOutputProcessor() throws XMLSecurityException {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends XMLStructure`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMStructure.java`
#### Snippet
```java
        DOMCryptoContext context) throws MarshalException;

    protected boolean equalsContent(List<XMLStructure> content, List<XMLStructure> otherContent) {
        int size = content.size();
        if (size != otherContent.size()) {
```

### BoundedWildcard
Can generalize to `? extends XMLStructure`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMStructure.java`
#### Snippet
```java
        DOMCryptoContext context) throws MarshalException;

    protected boolean equalsContent(List<XMLStructure> content, List<XMLStructure> otherContent) {
        int size = content.size();
        if (size != otherContent.size()) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/Utils.java`
#### Snippet
```java
     * @return the Set of Nodes
     */
    static Set<Node> toNodeSet(Iterator<Node> i) {
        Set<Node> nodeSet = new HashSet<>();
        while (i.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
         */
        @SuppressWarnings("fallthrough")
        private void nodeSetMinusCommentNodes(Node node, List<Node> nodeSet,
                                              Node prevSibling)
        {
```

### BoundedWildcard
Can generalize to `? super Attr`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
     * @param result the list where to fill the unrendered xmlns definitions.
     **/
    public void getUnrenderedNodes(Collection<Attr> result) {
        for (NameSpaceSymbEntry n : symb.entrySet()) {
            //put them rendered?
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
        final String str,
        final OutputStream out,
        Map<String, byte[]> cache
    ) throws IOException {
        byte[] result = cache.get(str);
```

### BoundedWildcard
Can generalize to `? extends StorageResolverSpi`
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
         * @param resolvers
         */
        public StorageResolverIterator(Iterator<StorageResolverSpi> resolvers) {
            this.resolvers = resolvers;
            currentResolver = findNextResolver();
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
    }

    private static Element getDocumentElement(Set<Node> set) {
        Element e = null;
        for (Node currentNode : set) {
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `src/main/java/org/apache/xml/security/stax/ext/AbstractBufferingOutputProcessor.java`
#### Snippet
```java

    protected void flushBufferAndCallbackAfterHeader(OutputProcessorChain outputProcessorChain,
                                                     Deque<XMLSecEvent> xmlSecEventDeque)
            throws XMLStreamException, XMLSecurityException {

```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `src/main/java/org/apache/xml/security/stax/ext/AbstractInputSecurityHeaderHandler.java`
#### Snippet
```java
    }

    protected List<QName> getElementPath(Deque<XMLSecEvent> eventDeque) throws XMLSecurityException {
        XMLSecEvent xmlSecEvent = eventDeque.peek();
        return xmlSecEvent.getElementPath();
```

### BoundedWildcard
Can generalize to `? extends SecurityTokenConstants.KeyIdentifier`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
    }

    public void setSignatureKeyIdentifiers(List<SecurityTokenConstants.KeyIdentifier> signatureKeyIdentifiers) {
        this.signatureKeyIdentifiers.clear();
        this.signatureKeyIdentifiers.addAll(signatureKeyIdentifiers);
```

### BoundedWildcard
Can generalize to `? super XMLSecNamespace`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java

    @Override
    public void getNamespacesFromCurrentScope(List<XMLSecNamespace> comparableNamespaceList) {
        if (parentXMLSecStartELement != null) {
            parentXMLSecStartELement.getNamespacesFromCurrentScope(comparableNamespaceList);
```

### BoundedWildcard
Can generalize to `? super QName`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java

    @Override
    public void getElementPath(List<QName> list) {
        super.getElementPath(list);
        list.add(this.getName());
```

### BoundedWildcard
Can generalize to `? super XMLSecAttribute`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java

    @Override
    public void getAttributesFromCurrentScope(List<XMLSecAttribute> comparableAttributeList) {
        comparableAttributeList.addAll(attributes);
        if (parentXMLSecStartELement != null) {
```

### BoundedWildcard
Can generalize to `? extends XMLSecEvent`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
        private final ArrayDeque<XMLSecEvent> xmlSecEventList;

        public InternalReplayProcessor(XMLSecurityProperties securityProperties, ArrayDeque<XMLSecEvent> xmlSecEventList) {
            super(securityProperties);
            this.xmlSecEventList = xmlSecEventList;
```

### BoundedWildcard
Can generalize to `? extends SecurePart`
in `src/main/java/org/apache/xml/security/stax/ext/AbstractOutputProcessor.java`
#### Snippet
```java
    }

    protected SecurePart securePartMatches(XMLSecStartElement xmlSecStartElement, Map<Object, SecurePart> secureParts) {
        SecurePart securePart = null;
        if (secureParts != null) {
```

### BoundedWildcard
Can generalize to `? extends XMLSecAttribute`
in `src/main/java/org/apache/xml/security/stax/ext/AbstractOutputProcessor.java`
#### Snippet
```java

    public XMLSecStartElement addAttributes(XMLSecStartElement xmlSecStartElement,
                                            List<XMLSecAttribute> attributeList) throws XMLStreamException {

        List<XMLSecNamespace> declaredNamespaces = xmlSecStartElement.getOnElementDeclaredNamespaces();
```

### BoundedWildcard
Can generalize to `? extends QName`
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    }

    public void setElementPath(List<QName> elementPath) {
        this.elementPath = Collections.unmodifiableList(elementPath);
    }
```

### BoundedWildcard
Can generalize to `? extends QName`
in `src/main/java/org/apache/xml/security/stax/securityEvent/AbstractElementSecurityEvent.java`
#### Snippet
```java
    }

    public void setElementPath(List<QName> elementPath) {
        this.elementPath = new ArrayList<>(elementPath);
    }
```

### BoundedWildcard
Can generalize to `? extends ResourceResolverSpi`
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     */
    public static XMLSignatureInput resolve(
        List<ResourceResolverSpi> individualResolvers, ResourceResolverContext context
    ) throws ResourceResolverException {
        LOG.debug(
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @return the owner document
     */
    public static Document getOwnerDocument(Set<Node> xpathNodeSet) {
        NullPointerException npe = null;
        for (Node node : xpathNodeSet) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @return nodes with the constrain
     */
    public static Set<Node> excludeNodeFromSet(Node signatureElement, Set<Node> inputSet) {
        return inputSet.stream().filter((inputNode) ->
                !XMLUtils.isDescendantOrSelf(signatureElement, inputNode)).collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    @SuppressWarnings("fallthrough")
    private static void getSetRec(final Node rootNode, final Set<Node> result,
                                final Node exclude, final boolean com) {
        if (rootNode == exclude) {
```

### BoundedWildcard
Can generalize to `? super DocumentBuilder`
in `src/main/java/org/apache/xml/security/parser/XMLParserImpl.java`
#### Snippet
```java
    }

    private static void repoolDocumentBuilder(DocumentBuilder db, Queue<DocumentBuilder> queue) {
        if (queue != null) {
            db.reset();
```

### BoundedWildcard
Can generalize to `? extends DocumentBuilder`
in `src/main/java/org/apache/xml/security/parser/XMLParserImpl.java`
#### Snippet
```java
    }

    private static DocumentBuilder getDocumentBuilder(boolean disallowDocTypeDeclarations, Queue<DocumentBuilder> queue) throws ParserConfigurationException {
        DocumentBuilder db = queue.poll();
        if (db == null) {
```

### BoundedWildcard
Can generalize to `? extends VerifiedReference`
in `src/main/java/org/apache/xml/security/signature/VerifiedReference.java`
#### Snippet
```java
     * of verified references associated with this Manifest
     */
    public VerifiedReference(boolean valid, String uri, List<VerifiedReference> manifestReferences) {
        this.valid = valid;
        this.uri = uri;
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
         */
        @SuppressWarnings("fallthrough")
        private void nodeSetMinusCommentNodes(Node node, List<Node> nodeSet,
                                              Node prevSibling)
        {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
     * @return if rooted bye the rootnodes
     */
    static boolean rooted(Node currentNode, Set<Node> nodeList) {
        if (nodeList.isEmpty()) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends NodeList`
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
    }

    private static Set<Node> convertNodeListToSet(List<NodeList> l) {
        Set<Node> result = new HashSet<>();
        for (NodeList rootNodes : l) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `hashCode()` is identical to its super method
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMCanonicalizationMethod.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getAlgorithm().hashCode();
```

### RedundantMethodOverride
Method `getPreferredTransformMethod()` is identical to its super method
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java

    @Override
    public XMLSecurityConstants.TransformMethod getPreferredTransformMethod(XMLSecurityConstants.TransformMethod forInput) {
        switch (forInput) {
            case XMLSecEvent:
```

### RedundantMethodOverride
Method `getBaseNamespace()` is identical to its super method
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @return URI of this element
     */
    public String getBaseNamespace() {
        return Constants.SignatureSpecNS;
    }
```

### RedundantMethodOverride
Method `getBaseNamespace()` is identical to its super method
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public String getBaseNamespace() {
        return Constants.SignatureSpecNS;
    }
```

### RedundantMethodOverride
Method `getBaseNamespace()` is identical to its super method
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
        // Create DigestMethod Element without actually instantiating a MessageDigest Object
        Algorithm digestAlgorithm = new Algorithm(getDocument(), messageDigestAlgorithm) {
            public String getBaseNamespace() {
                return Constants.SignatureSpecNS;
            }
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    xi.getOctetStreamReal().close();
                } catch (IOException e) {
                    throw new XMLSignatureException(e);
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    dos.close();
                } catch (IOException e) {
                    throw new XMLSignatureException(e);
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
                }
            } catch (IOException ex) {
                throw new ReferenceNotInitializedException(ex);
            }
        }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                    ((ApacheData)data).getXMLSignatureInput();
                if (in.isElement()) {
                    if (inclusiveNamespaces != null) {
                        canonicalizer.canonicalizeSubtree(in.getSubNode(), inclusiveNamespaces, writer);
                        return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            } else if (data instanceof DOMSubTreeData) {
                DOMSubTreeData subTree = (DOMSubTreeData)data;
                if (inclusiveNamespaces != null) {
                    canonicalizer.canonicalizeSubtree(subTree.getRoot(), inclusiveNamespaces, writer);
                    return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            }

            if (inclusiveNamespaces != null) {
                canonicalizer.canonicalizeXPathNodeSet(nodeSet, inclusiveNamespaces, writer);
                return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecNamespaceImpl.java`
#### Snippet
```java
        if (nsMap != null) {
            XMLSecNamespace xmlSecNamespace = nsMap.get(uriToUse);
            if (xmlSecNamespace != null) {
                return xmlSecNamespace;
            } else {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
    ) throws CanonicalizationException {
        inclusiveNSSet = InclusiveNamespaces.prefixStr2Set(inclusiveNamespaces);
        super.engineCanonicalize(rootNode, writer, secureValidation);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
    ) throws CanonicalizationException {
        inclusiveNSSet = InclusiveNamespaces.prefixStr2Set(inclusiveNamespaces);
        super.engineCanonicalizeXPathNodeSet(xpathNodeSet, writer);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
    ) throws CanonicalizationException{
        inclusiveNSSet = InclusiveNamespaces.prefixStr2Set(inclusiveNamespaces);
        super.engineCanonicalizeSubTree(rootNode, excl, writer);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                        byte[] sha1Bytes = generateDigest(encryptedBytes);
                        String sha1Identifier = XMLUtils.encodeToString(sha1Bytes);
                        super.setSha1Identifier(sha1Identifier);

                        try {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
                    @Override
                    public void close() throws IOException {
                        super.flush();
                        try {
                            byte[] bytes = cipher.doFinal();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformBase64Decode.java`
#### Snippet
```java
                    public void close() throws IOException {
                        //do not close the parent output stream!
                        super.flush();
                    }
                },
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java
                public void close() throws IOException {
                    //do not close the parent output stream!
                    super.flush();
                }
            });
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            List<Comparable> list = super.peekFirst();
            if (list == Collections.<Comparable>emptyList()) {
                super.removeFirst();
                list = new ArrayList<>();
                super.addFirst(list);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                super.removeFirst();
                list = new ArrayList<>();
                super.addFirst(list);
            }
            return list;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
        public Object containsOnStack(final Object o) {
            //Important: iteration order from head to tail!
            final Iterator<List<Comparable>> elementIterator = super.iterator();
            while (elementIterator.hasNext()) {
                final List list = elementIterator.next();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
    public boolean verify(boolean followManifests)
        throws MissingResourceFailureException, XMLSecurityException {
        return super.verifyReferences(followManifests);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
    public boolean verify()
        throws MissingResourceFailureException, XMLSecurityException {
        return super.verifyReferences(false);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
    public void printStackTrace() {
        synchronized (System.err) {
            super.printStackTrace(System.err);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
    public String toString() {
        String s = this.getClass().getName();
        String message = super.getLocalizedMessage();

        if (message != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
        }

        if (super.getCause() != null) {
            message = message + "\nOriginal Exception was " + super.getCause().toString();
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java

        if (super.getCause() != null) {
            message = message + "\nOriginal Exception was " + super.getCause().toString();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );

                if (null != super.getId()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

                if (null != super.getId()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
                if (null != super.getType()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
                if (null != super.getType()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                if (null != super.getType()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
                if (null != super.getMimeType()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
                if (null != super.getMimeType()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_MIMETYPE, super.getMimeType()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getMimeType()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_MIMETYPE, super.getMimeType()
                    );
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );
                }
                if (null != super.getEncoding()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_ENCODING, super.getEncoding()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getEncoding()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_ENCODING, super.getEncoding()
                    );
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );
                }
                if (null != super.getEncryptionMethod()) {
                    result.appendChild(
                        ((EncryptionMethodImpl)super.getEncryptionMethod()).toElement()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getEncryptionMethod()) {
                    result.appendChild(
                        ((EncryptionMethodImpl)super.getEncryptionMethod()).toElement()
                    );
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );
                }
                if (null != super.getKeyInfo()) {
                    result.appendChild(super.getKeyInfo().getElement().cloneNode(true));
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                if (null != super.getKeyInfo()) {
                    result.appendChild(super.getKeyInfo().getElement().cloneNode(true));
                }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }

                result.appendChild(((CipherDataImpl) super.getCipherData()).toElement());
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

                result.appendChild(((CipherDataImpl) super.getCipherData()).toElement());
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
                        super.getEncryptionProperties()).toElement());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
                        super.getEncryptionProperties()).toElement());
                }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );

                if (null != super.getId()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

                if (null != super.getId()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
                if (null != super.getType()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    result.setAttributeNS(null, EncryptionConstants._ATT_ID, super.getId());
                }
                if (null != super.getType()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                if (null != super.getType()) {
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
                if (null != super.getMimeType()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    result.setAttributeNS(null, EncryptionConstants._ATT_TYPE, super.getType());
                }
                if (null != super.getMimeType()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_MIMETYPE, super.getMimeType()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getMimeType()) {
                    result.setAttributeNS(
                        null, EncryptionConstants._ATT_MIMETYPE, super.getMimeType()
                    );
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );
                }
                if (null != super.getEncoding()) {
                    result.setAttributeNS(null, Constants._ATT_ENCODING, super.getEncoding());
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                if (null != super.getEncoding()) {
                    result.setAttributeNS(null, Constants._ATT_ENCODING, super.getEncoding());
                }
                if (null != getRecipient()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    );
                }
                if (null != super.getEncryptionMethod()) {
                    result.appendChild(((EncryptionMethodImpl)
                        super.getEncryptionMethod()).toElement());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getEncryptionMethod()) {
                    result.appendChild(((EncryptionMethodImpl)
                        super.getEncryptionMethod()).toElement());
                }
                if (null != super.getKeyInfo()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                        super.getEncryptionMethod()).toElement());
                }
                if (null != super.getKeyInfo()) {
                    result.appendChild(super.getKeyInfo().getElement().cloneNode(true));
                }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                if (null != super.getKeyInfo()) {
                    result.appendChild(super.getKeyInfo().getElement().cloneNode(true));
                }
                result.appendChild(((CipherDataImpl) super.getCipherData()).toElement());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    result.appendChild(super.getKeyInfo().getElement().cloneNode(true));
                }
                result.appendChild(((CipherDataImpl) super.getCipherData()).toElement());
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                result.appendChild(((CipherDataImpl) super.getCipherData()).toElement());
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
                        super.getEncryptionProperties()).toElement());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (null != super.getEncryptionProperties()) {
                    result.appendChild(((EncryptionPropertiesImpl)
                        super.getEncryptionProperties()).toElement());
                }
                if (referenceList != null && !referenceList.isEmpty()) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
import org.apache.xml.security.utils.XMLUtils;

import java.io.IOException;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
        int read = 0;
        byte[] buf = new byte[4096];
        while ((read = inputStream.read(buf)) != -1) {
            outputStream.write(buf, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/stax/impl/OutputProcessorChainImpl.java`
#### Snippet
```java
                                       int startPos, List<OutputProcessor> outputProcessors) {
        this.outboundSecurityContext = outboundSecurityContext;
        this.curPos = this.startPos = startPos;
        documentContext = documentContextImpl;
        this.outputProcessors = outputProcessors;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
                                      int startPos, List<InputProcessor> inputProcessors) {
        this.inboundSecurityContext = inboundSecurityContext;
        this.curPos = this.startPos = startPos;
        this.documentContext = documentContextImpl;
        this.inputProcessors = inputProcessors;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                    jceName,
                                    Cipher.SECRET_KEY);
                            return this.decryptedKey = key.getEncoded();
                        } catch (IllegalStateException e) {
                            throw new XMLSecurityException(e);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java
        }
        if (this.outputStream != null) {
            return this.xmlEventWriterForOutputStream = getXmlOutputFactory().createXMLEventWriter(new FilterOutputStream(outputStream) {
                @Override
                public void close() throws IOException {
                    //do not close the parent output stream!
                    super.flush();
                }
            });
        }
        return null;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
            int len;

            while ((len = inputStream.read(buf)) > 0) {
                baos.write(buf, 0, len);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
            byte[] buf = new byte[4 * 1024];
            int len;
            while ((len = inputStream.read(buf)) > 0) {
                baos.write(buf, 0, len);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
        int k;

        for (int j = 0; (k = string.indexOf("\\20", j)) >= 0; j = k + 3) {
            sb.append(trim(string.substring(i, k))).append("\\ ");

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java

        try (StringReader sr = new StringReader(string)) {
            while ((i = sr.read()) > -1) {
                c = (char) i;

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java

            //for name component
            for (int j = 0; (k = DN.indexOf(',', j)) >= 0; j = k + 1) {
                l += countQuotes(DN, j, k);

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java

        try (StringReader sr = new StringReader(string)) {
            while ((i = sr.read()) > -1) {
                if (i < 32) {
                    sb.append('\\');
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
        int k;

        for (int j = 0; (k = str.indexOf(symbol, j)) >= 0; j = k + 1) {
            l += countQuotes(str, j, k);

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java

        try (StringReader sr = new StringReader(string)) {
            while ((i = sr.read()) > -1) {
                c = (char) i;

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
        int k;

        for (int j = 0; (k = str.indexOf('+', j)) >= 0; j = k + 1) {
            l += countQuotes(str, j, k);

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
                char c;

                while ((i = sr.read()) > -1) {
                    c = (char) i;

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) {
            //Check if they are PAD characters
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        int read;
        //the begin
        while ((read = is.read()) > 0) {
            byte readed = (byte)read;
            if (isWhiteSpace(readed)) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            }

            if ((data[index++] = readed) == -1) {
                //if found "no data" just return null
                throw new Base64DecodingException("decoding.general");
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) { //Check if they are PAD characters
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) { //Check if they are PAD characters
            if (isPad(d3) && isPad(d4)) {               //Two PAD e.g. 3c[Pad][Pad]
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        try {
            String line;
            while (null != (line = reader.readLine())) {
                byte[] bytes = decode(line);
                baos.write(bytes);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
                int summarized = 0;

                while ((read = inputStream.read(buf)) >= 0) {
                    baos.write(buf, 0, read);
                    summarized += read;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
            int bytesread = 0;
            try {
                while ((bytesread = inputOctetStreamProxy.read(buffer)) != -1) {
                    diOs.write(buffer, 0, bytesread);
                }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                byte[] buf = new byte[8192];
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    while ((numBytes = serializedData.read(buf)) != -1) {
                        byte[] data = c.update(buf, 0, numBytes);
                        baos.write(data);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`baseURI = baseURI + "/"` could be simplified to 'baseURI += "/"'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        if (baseURI != null) {
            if (baseURI.endsWith("..")) {
                baseURI = baseURI + "/";
            }
            URI base = new URI(baseURI);
```

### ReplaceAssignmentWithOperatorAssignment
`newSize = newSize << 1` could be simplified to 'newSize \<\<= 1'
in `src/main/java/org/apache/xml/security/utils/UnsyncByteArrayOutputStream.java`
#### Snippet
```java
        int newSize = size;
        while (newPos > newSize) {
            newSize = newSize << 1;
            // Deal with overflow
            if (newSize < 0) {
```

### ReplaceAssignmentWithOperatorAssignment
`trimmed = trimmed + " "` could be simplified to 'trimmed += " "'
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
        if (str.length() > i && trimmed.endsWith("\\")
            && !trimmed.endsWith("\\\\") && str.charAt(i) == ' ') {
            trimmed = trimmed + " ";
        }

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `curPos` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
    private List<InputProcessor> inputProcessors;
    private int startPos;
    private int curPos;

    private final InboundSecurityContext inboundSecurityContext;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inputProcessors` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
    protected static final transient Logger LOG = LoggerFactory.getLogger(InputProcessorChainImpl.class);

    private List<InputProcessor> inputProcessors;
    private int startPos;
    private int curPos;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xmlOutputFactory` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java
public class TransformIdentity implements Transformer {

    private static XMLOutputFactory xmlOutputFactory;
    private static XMLInputFactory xmlInputFactory;
    private OutputStream outputStream;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xmlInputFactory` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java

    private static XMLOutputFactory xmlOutputFactory;
    private static XMLInputFactory xmlInputFactory;
    private OutputStream outputStream;
    private XMLEventWriter xmlEventWriterForOutputStream;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `resourceResolvers` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/ResourceResolverMapper.java`
#### Snippet
```java
public final class ResourceResolverMapper {

    private static List<ResourceResolverLookup> resourceResolvers;

    private ResourceResolverMapper() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `properties` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/ConfigurationProperties.java`
#### Snippet
```java
public final class ConfigurationProperties {

    private static Properties properties;
    private static Class<?> callingClass;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `handlerClassMap` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/SecurityHeaderHandlerMapper.java`
#### Snippet
```java
public final class SecurityHeaderHandlerMapper {

    private static Map<QName, Class<?>> handlerClassMap;

    private SecurityHeaderHandlerMapper() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `algorithmsClassMapInOut` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/TransformerAlgorithmMapper.java`
#### Snippet
```java
public final class TransformerAlgorithmMapper {

    private static Map<String, Class<?>> algorithmsClassMapInOut;
    private static Map<String, Class<?>> algorithmsClassMapIn;
    private static Map<String, Class<?>> algorithmsClassMapOut;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `algorithmsClassMapIn` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/TransformerAlgorithmMapper.java`
#### Snippet
```java

    private static Map<String, Class<?>> algorithmsClassMapInOut;
    private static Map<String, Class<?>> algorithmsClassMapIn;
    private static Map<String, Class<?>> algorithmsClassMapOut;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `algorithmsClassMapOut` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/xml/security/stax/config/TransformerAlgorithmMapper.java`
#### Snippet
```java
    private static Map<String, Class<?>> algorithmsClassMapInOut;
    private static Map<String, Class<?>> algorithmsClassMapIn;
    private static Map<String, Class<?>> algorithmsClassMapOut;

    private TransformerAlgorithmMapper() {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
    }

    public static void init() {
        // Do nothing
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
    }

    protected void handleReferenceList(final InputProcessorChain inputProcessorChain,
                                       final EncryptedKeyType encryptedKeyType,
                                       final XMLSecurityProperties securityProperties) throws XMLSecurityException {
```

### EmptyMethod
All implementations of this method are empty
in `src/main/java/org/apache/xml/security/stax/securityToken/InboundSecurityToken.java`
#### Snippet
```java
     * @throws XMLSecurityException if the key couldn't be verified or the key isn't valid
     */
    void verify() throws XMLSecurityException;

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private SignedInfo si;
    private Document ownerDoc = null;
    private Element localSigElem = null;
    private Element sigElem = null;
    private boolean validationStatus;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private List<XMLObject> objects;
    private SignedInfo si;
    private Document ownerDoc = null;
    private Element localSigElem = null;
    private Element sigElem = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
        private String valueBase64;
        private Element sigValueElem;
        private boolean validated = false;
        private boolean validationStatus;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private Document ownerDoc = null;
    private Element localSigElem = null;
    private Element sigElem = null;
    private boolean validationStatus;
    private boolean validated = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private Element sigElem = null;
    private boolean validationStatus;
    private boolean validated = false;
    private KeySelectorResult ksr;
    private Map<String, XMLStructure> signatureIdMap;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    private Element refElem;
    private boolean digested = false;
    private boolean validated = false;
    private boolean validationStatus;
    private Data derefData;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    private byte[] calcDigestValue;
    private Element refElem;
    private boolean digested = false;
    private boolean validated = false;
    private boolean validationStatus;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java

    /** Field alreadyInitialized */
    private static boolean alreadyInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java

    /**This prefix-URI has been already render or not.*/
    boolean rendered = false;

    NameSpaceSymbEntry(String name, Attr n, boolean rendered, String prefix) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java

    /**The last output in the URI for this prefix (This for speed reason).*/
    String lastrendered = null;

    /**This prefix-URI has been already render or not.*/
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
    }

    private int currentLevel = 0;
    private int lastlevel = 0;
    private XmlsStackElement cur;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
    private static class XmlsStackElement {
        int level;
        boolean rendered = false;
        final List<Attr> nodes = new ArrayList<>();
    }
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java

    private int currentLevel = 0;
    private int lastlevel = 0;
    private XmlsStackElement cur;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     */
    private SortedSet<String> inclusiveNSSet = Collections.emptySortedSet();
    private boolean propagateDefaultNamespace = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
    private final List<InputProcessor> inputProcessorList = new ArrayList<>();
    private boolean skipDocumentEvents = false;
    private boolean disableSchemaValidation = false;

    private List<XMLSecurityConstants.Action> actions = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
    private Key signatureKey;
    private X509Certificate[] signatureCerts;
    private boolean addExcC14NInclusivePrefixes = false;
    private List<SecurityTokenConstants.KeyIdentifier> signatureKeyIdentifiers = new ArrayList<>();
    private String signatureKeyName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java

    private final List<InputProcessor> inputProcessorList = new ArrayList<>();
    private boolean skipDocumentEvents = false;
    private boolean disableSchemaValidation = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java

    private QName signaturePositionQName;
    private boolean signaturePositionStart = false;
    private AlgorithmParameterSpec algorithmParameterSpec;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
    private Element openStartElement;
    private NSContext namespaceContext = new NSContext(null);
    private boolean endDocumentWritten = false;
    private boolean haveToWriteEndElement = false;
    private SecurePart signEntireRequestPart;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
    private NSContext namespaceContext = new NSContext(null);
    private boolean endDocumentWritten = false;
    private boolean haveToWriteEndElement = false;
    private SecurePart signEntireRequestPart;
    private SecurePart encryptEntireRequestPart;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEventReaderInputProcessor.java`
#### Snippet
```java
    private final XMLStreamReader xmlStreamReader;
    private XMLSecStartElement parentXmlSecStartElement;
    private boolean EOF = false;

    public XMLEventReaderInputProcessor(XMLSecurityProperties securityProperties, XMLStreamReader xmlStreamReader) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
    private int startIndexForProcessor;
    private InternalBufferProcessor internalBufferProcessor;
    private boolean signatureElementFound = false;
    private boolean encryptedDataElementFound = false;
    private boolean decryptOnly = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
    private InternalBufferProcessor internalBufferProcessor;
    private boolean signatureElementFound = false;
    private boolean encryptedDataElementFound = false;
    private boolean decryptOnly = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
    private boolean signatureElementFound = false;
    private boolean encryptedDataElementFound = false;
    private boolean decryptOnly = false;

    public XMLSecurityInputProcessor(XMLSecurityProperties securityProperties) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
        private XMLSecStartElement startElement;
        private int elementCounter;
        private boolean finished = false;

        public InternalSignatureReferenceVerifier(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        private XMLStreamReader xmlStreamReader;
        private XMLSecStartElement parentXmlSecStartElement;
        private boolean encryptedHeader = false;
        private final InboundSecurityToken inboundSecurityToken;
        private boolean rootElementProcessed;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverSameDocument.java`
#### Snippet
```java

    private String id;
    private boolean firstElementOccured = false;

    public ResolverSameDocument() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractSecurityToken.java`
#### Snippet
```java
    private PublicKey publicKey;
    private X509Certificate[] x509Certificates;
    private boolean asymmetric = false;
    private String sha1Identifier;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java

    //prevent recursive key references
    private boolean invoked = false;

    private InboundSecurityContext inboundSecurityContext;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    private final List<InboundSecurityToken> wrappedTokens = new ArrayList<>();
    private InboundSecurityToken keyWrappingToken;
    private boolean includedInMessage = false;

    public AbstractInboundSecurityToken(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
    private Pattern pattern = Pattern.compile("^#xpointer\\((/)|(id\\([\"\']([^\"\']*)[\"\']\\))\\)");
    private String id;
    private boolean rootNodeOccured = false;

    public ResolverXPointer() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java

    protected List<String> inclusiveNamespaces;
    protected boolean propagateDefaultNamespace = false;

    public Canonicalizer20010315_Excl(boolean includeComments) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent.java`
#### Snippet
```java

    private int keyLength;
    private boolean derivedKey = false;
    private String algorithmURI;
    private XMLSecurityConstants.AlgorithmUsage algorithmUsage;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
    private static final Map<String, byte[]> CACHE = Collections.synchronizedMap(new WeakHashMap<String, byte[]>());
    private final C14NStack<XMLSecEvent> outputStack = new C14NStack<>();
    private boolean includeComments = false;
    private DocumentLevel currentDocumentLevel = DocumentLevel.NODE_BEFORE_DOCUMENT_ELEMENT;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
    private final ContentHandler contentHandler;
    private URL systemId;
    private boolean skipEvents = false;

    private final Map<URI, Document> uriDocMap;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java

    /** Field alreadyInitialized */
    private static boolean alreadyInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     *
     */
    private boolean excludeComments = false;

    private boolean isNodeSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
    private boolean excludeComments = false;

    private boolean isNodeSet = false;
    /**
     * A cached bytes
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
    private List<NodeFilter> nodeFilters = new ArrayList<>();

    private boolean needsToBeExpanded = false;
    private OutputStream outputStream;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * to indicate that the References inside Manifests should be validated.
     */
    private boolean followManifestsDuringValidation = false;

    private Element signatureValueElement;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-30-04-58-33.911.html`
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
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java
                result.setMIMEType("text/xml");
                if (baseURI != null && baseURI.length() > 0) {
                    result.setSourceURI(baseURI.concat(uriAttr.getNodeValue()));
                } else {
                    result.setSourceURI(uriAttr.getNodeValue());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
        result.setMIMEType("text/xml");
        if (context.baseUri != null && context.baseUri.length() > 0) {
            result.setSourceURI(context.baseUri.concat(context.uriToResolve));
        } else {
            result.setSourceURI(context.uriToResolve);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverFragment.java`
#### Snippet
```java
        result.setMIMEType("text/xml");
        if (context.baseUri != null && context.baseUri.length() > 0) {
            result.setSourceURI(context.baseUri.concat(context.uriToResolve));
        } else {
            result.setSourceURI(context.uriToResolve);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        if (numberQuadruple == 0) {
            return new byte[0];
        }

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `baseURI` of exception class
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
    private String uri;

    private String baseURI;

    /**
```

### NonFinalFieldOfException
Non-final field `uri` of exception class
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private String uri;

    private String baseURI;
```

### NonFinalFieldOfException
Non-final field `uninitializedReference` of exception class
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java

    /** Field uninitializedReference */
    private Reference uninitializedReference;

    /**
```

### NonFinalFieldOfException
Non-final field `msgID` of exception class
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java

    /** Field msgID */
    protected String msgID;

    /**
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java

    public static XMLInputFactory getXmlInputFactory() {
        synchronized(TransformIdentity.class) {
            if (xmlInputFactory == null) {
                xmlInputFactory = XMLInputFactory.newInstance();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java

    protected static XMLOutputFactory getXmlOutputFactory() {
        synchronized(TransformIdentity.class) {
            if (xmlOutputFactory == null) {
                xmlOutputFactory = XMLOutputFactory.newInstance();
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'DOMCryptoContext' type conflicts with preceding 'instanceof XMLSignContext' check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    }
                    t.marshal(transformsElem, dsPrefix,
                              (DOMCryptoContext)context);
                    allTransforms.add(t);
                    xi.updateOutputStream(os, true);
```

### CastConflictsWithInstanceof
Cast to 'DOMX509IssuerSerial' type conflicts with preceding 'instanceof X509IssuerSerial' check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMX509Data.java`
#### Snippet
```java
            } else if (object instanceof XMLStructure) {
                if (object instanceof X509IssuerSerial) {
                    ((DOMX509IssuerSerial)object).marshal
                        (xdElem, dsPrefix, context);
                } else {
```

### CastConflictsWithInstanceof
Cast to 'javax.xml.crypto.dom.DOMStructure' type conflicts with preceding 'instanceof XMLStructure' check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMX509Data.java`
#### Snippet
```java
                } else {
                    javax.xml.crypto.dom.DOMStructure domContent =
                        (javax.xml.crypto.dom.DOMStructure)object;
                    DOMUtils.appendChild(xdElem, domContent.getNode());
                }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `transformElem` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
        Document ownerDoc = DOMUtils.getOwnerDocument(parent);

        Element transformElem = null;
        if ("Transforms".equals(parent.getLocalName())) {
            transformElem = DOMUtils.createElement(ownerDoc, "Transform",
```

### UnusedAssignment
Variable `nodeSet` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
        try {
            boolean secVal = Utils.secureValidation(xc);
            Set<Node> nodeSet = null;
            if (data instanceof ApacheData) {
                XMLSignatureInput in =
```

### UnusedAssignment
Variable `signingKey` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
        }

        Key signingKey = null;
        try {
            KeySelectorResult keySelectorResult = signContext.getKeySelector().select(ki,
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java
        node.normalize();

        Element element = null;
        if (node.getNodeType() == Node.DOCUMENT_NODE) {
            element = ((Document) node).getDocumentElement();
```

### UnusedAssignment
Variable `filter` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
                throw new MarshalException("filter cannot be null");
            }
            XPathType.Filter filter = null;
            if ("intersect".equals(filterVal)) {
                filter = XPathType.Filter.INTERSECT;
```

### UnusedAssignment
Variable `ecParams` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
                }
            }
            ECParameterSpec ecParams = null;
            Element curElem = DOMUtils.getFirstChildElement(kvtElem);
            if (curElem == null) {
```

### UnusedAssignment
Variable `ecPoint` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            }
            curElem = DOMUtils.getNextSiblingElement(curElem, "PublicKey", XMLDSIG_11_XMLNS);
            ECPoint ecPoint = null;

            try {
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
        throws XMLParserException, java.io.IOException, CanonicalizationException {

        Document document = null;
        try (java.io.InputStream bais = new ByteArrayInputStream(inputBytes)) {
            document = XMLUtils.read(bais, secureValidation);
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
        throws XMLSignatureException
    {
        Data data = null;
        if (appliedTransformData == null) {
            data = dereference(signContext);
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
        throws XMLSignatureException
    {
        Data data = null;

        // use user-specified URIDereferencer if specified; otherwise use deflt
```

### UnusedAssignment
Variable `spi` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                        (((OctetStreamData)data).getOctetStream());
                } else if (data instanceof NodeSetData) {
                    TransformService spi = null;
                    if (provider == null) {
                        spi = TransformService.getInstance(c14nalg, "DOM");
```

### UnusedAssignment
Variable `spi` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                if (context instanceof XMLSignContext && c14n11
                    && !xi.isOctetStream() && !xi.isOutputStreamSet()) {
                    TransformService spi = null;
                    if (provider == null) {
                        spi = TransformService.getInstance(c14nalg, "DOM");
```

### UnusedAssignment
Variable `transformsElem` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java

                    DOMTransform t = new DOMTransform(spi);
                    Element transformsElem = null;
                    String dsPrefix = DOMUtils.getSignaturePrefix(context);
                    if (allTransforms.isEmpty()) {
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java
        node.normalize();

        Element element = null;
        if (node.getNodeType() == Node.DOCUMENT_NODE) {
            element = ((Document) node).getDocumentElement();
```

### UnusedAssignment
Variable `rendered` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java

    /**This prefix-URI has been already render or not.*/
    boolean rendered = false;

    NameSpaceSymbEntry(String name, Attr n, boolean rendered, String prefix) {
```

### UnusedAssignment
Variable `extraByte` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                expanded = true;
            }
            byte extraByte = 0;
            if (c < 0x800) {
                // 0x00000080 - 0x000007FF
```

### UnusedAssignment
Variable `extraByte` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                continue;
            }
            byte extraByte = 0;
            if (c < 0x800) {
                // 0x00000080 - 0x000007FF
```

### UnusedAssignment
Variable `extraByte` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
            return;
        }
        byte extraByte = 0;
        if (c < 0x800) {
            // 0x00000080 - 0x000007FF
```

### UnusedAssignment
Variable `end` initializer `-1` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                // including, the next "/" character or the end of the input buffer.
            } else {
                int end = -1;
                int begin = input.indexOf('/');
                if (begin == 0) {
```

### UnusedAssignment
Variable `e` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        }
        boolean parentRendered = false;
        XmlsStackElement e = null;
        if (size == -1) {
            parentRendered = true;
```

### UnusedAssignment
Variable `prefix` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
            }

            String prefix = null;
            if (element.getNamespaceURI() != null
                && !(element.getPrefix() == null || element.getPrefix().length() == 0)) {
```

### UnusedAssignment
Variable `prefix` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
                    XMLNS, "", getNullNode(element.getOwnerDocument()));
        }
        String prefix = null;
        if (element.getNamespaceURI() != null
            && !(element.getPrefix() == null || element.getPrefix().length() == 0)) {
```

### UnusedAssignment
Variable `doc` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
            return;
        }
        Document doc = null;
        if (input.getSubNode() != null) {
            doc = XMLUtils.getOwnerDocument(input.getSubNode());
```

### UnusedAssignment
Variable `x509Digests` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        throws XMLSecurityException {

        XMLX509Digest x509Digests[] = null;

        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);
```

### UnusedAssignment
Variable `doc` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
            return;
        }
        Document doc = null;
        if (input.getSubNode() != null) {
            doc = XMLUtils.getOwnerDocument(input.getSubNode());
```

### UnusedAssignment
Variable `ecParams` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
    public PublicKey getPublicKey() throws XMLSecurityException {
        try {
            ECParameterSpec ecParams = null;
            Element curElem = getFirstChildElement(getElement());
            if (curElem == null) {
```

### UnusedAssignment
Variable `ecPoint` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
            }
            curElem = getNextSiblingElement(curElem, "PublicKey", Constants.SignatureSpec11NS);
            ECPoint ecPoint = null;

            try {
```

### UnusedAssignment
Variable `keyResolverSpi` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
    public static void registerAtStart(String className) {
        JavaUtils.checkRegisterPermission();
        KeyResolverSpi keyResolverSpi = null;
        Exception ex = null;
        try {
```

### UnusedAssignment
Variable `x509data` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
    ) throws KeyResolverException {

        X509Data x509data = null;
        try {
            x509data = new X509Data(element, baseURI);
```

### UnusedAssignment
Variable `referentElement` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        XMLSignatureInput resource = resolveInput(uriAttr, baseURI, secureValidation);

        Element referentElement = null;
        try {
            referentElement = obtainReferenceElement(resource, secureValidation);
```

### UnusedAssignment
Variable `currentNodeIsVisible` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
            return;
        }
        boolean currentNodeIsVisible = false;
        NameSpaceSymbTable ns = new NameSpaceSymbTable();
        if (currentNode != null && Node.ELEMENT_NODE == currentNode.getNodeType()) {
```

### UnusedAssignment
Variable `ele` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
        // Visit them in reverse order.
        ListIterator<Node> it2 = parents.listIterator(parents.size()-1);
        Element ele = null;
        while (it2.hasPrevious()) {
            ele = (Element) it2.previous();
```

### UnusedAssignment
Variable `size` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
    public static SecretKey prepareSecretKey(String symEncAlgo, byte[] rawKey) {
        // Do an additional check on the keysize required by the encryption algorithm
        int size = 0;
        try {
            size = JCEMapper.getKeyLengthFromURI(symEncAlgo) / 8;
```

### UnusedAssignment
Variable `read` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        int read = 0;
        byte[] buf = new byte[4096];
        while ((read = inputStream.read(buf)) != -1) {
```

### UnusedAssignment
Variable `tokenSecurityEvent` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
        SecurityTokenConstants.TokenType tokenType = inboundSecurityToken.getTokenType();

        TokenSecurityEvent tokenSecurityEvent = null;
        if (SecurityTokenConstants.X509V1Token.equals(tokenType)
                || SecurityTokenConstants.X509V3Token.equals(tokenType)
```

### UnusedAssignment
Variable `childTransformer` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Class<Transformer> transformerClass = (Class<Transformer>) TransformerAlgorithmMapper.getTransformerClass(algorithm, direction);
        Transformer childTransformer = null;

        try {
```

### UnusedAssignment
Variable `decryptOnly` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
    private boolean signatureElementFound = false;
    private boolean encryptedDataElementFound = false;
    private boolean decryptOnly = false;

    public XMLSecurityInputProcessor(XMLSecurityProperties securityProperties) {
```

### UnusedAssignment
Variable `internalSignatureOutputProcessor` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLSignatureOutputProcessor.java`
#### Snippet
```java
                    LOG.debug("Matched securePart for signature");

                    InternalSignatureOutputProcessor internalSignatureOutputProcessor = null;

                    SignaturePartDef signaturePartDef = new SignaturePartDef();
```

### UnusedAssignment
The value `0` assigned to `index` is never used
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
        } else {
            iterator = reparseSignedInfo(inputProcessorChain, securityProperties, signatureType, eventDeque, index).descendingIterator();
            index = 0;
        }

```

### UnusedAssignment
Variable `encryptedHeader` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        private XMLStreamReader xmlStreamReader;
        private XMLSecStartElement parentXmlSecStartElement;
        private boolean encryptedHeader = false;
        private final InboundSecurityToken inboundSecurityToken;
        private boolean rootElementProcessed;
```

### UnusedAssignment
Variable `nextEvent` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
                // differently compared to the usual inlined bytes. Note this only works if we have a single xop:Include
                // chile element
                XMLSecEvent nextEvent = null;
                subInputProcessorChain.reset();
                if (isSecurityHeaderEvent) {
```

### UnusedAssignment
Variable `decryptInputStream` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
                }

                InputStream decryptInputStream = null;  //NOPMD
                if (nextEvent.isStartElement() && nextEvent.asStartElement().getName().equals(XMLSecurityConstants.TAG_XOP_INCLUDE)) {
                    try {
```

### UnusedAssignment
Variable `subOutputProcessorChain` initializer `outputProcessorChain.createSubChain(this)` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java
                            encryptEvent(xmlSecEvent);
                        } else if (SecurePart.Modifier.Content == getEncryptionPartDef().getModifier()) {
                            OutputProcessorChain subOutputProcessorChain = outputProcessorChain.createSubChain(this);
                            outputProcessorChain.processEvent(xmlSecEvent);
                            subOutputProcessorChain = outputProcessorChain.createSubChain(this);
```

### UnusedAssignment
Variable `base64EncoderStream` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java

                characterEventGeneratorOutputStream = new CharacterEventGeneratorOutputStream();
                Base64OutputStream base64EncoderStream = null;  //NOPMD
                if (XMLUtils.isIgnoreLineBreaks()) {
                    base64EncoderStream = new Base64OutputStream(characterEventGeneratorOutputStream, true, 0, null);
```

### UnusedAssignment
Variable `attributes` initializer `new ArrayList<>(1)` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
        OutputProcessorChain subOutputProcessorChain = outputProcessorChain.createSubChain(this);

        List<XMLSecAttribute> attributes = new ArrayList<>(1);
        String signatureId = null;
        if (securityProperties.isSignatureGenerateIds()) {
```

### UnusedAssignment
Variable `includedInMessage` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    private final List<InboundSecurityToken> wrappedTokens = new ArrayList<>();
    private InboundSecurityToken keyWrappingToken;
    private boolean includedInMessage = false;

    public AbstractInboundSecurityToken(
```

### UnusedAssignment
Variable `includeComments` initializer `false` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
    private static final Map<String, byte[]> CACHE = Collections.synchronizedMap(new WeakHashMap<String, byte[]>());
    private final C14NStack<XMLSecEvent> outputStack = new C14NStack<>();
    private boolean includeComments = false;
    private DocumentLevel currentDocumentLevel = DocumentLevel.NODE_BEFORE_DOCUMENT_ELEMENT;

```

### UnusedAssignment
Variable `refBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
        throws FileNotFoundException, IOException {

        byte[] refBytes = null;

        try (InputStream inputStream = Files.newInputStream(Paths.get(fileName));
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
                throw new SAXException("XML file not found: " + href);
            }
            Document document = null;
            try {
                document = uriDocMap.get(url.toURI());
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
    static String changeWStoXML(String string) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c;

```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
    static String changeLess32toXML(String string) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        try (StringReader sr = new StringReader(string)) {
```

### UnusedAssignment
Variable `attrValue` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
        String attrType = normalizeAT(str.substring(0, i));
        // only normalize if value is a String
        String attrValue = null;
        if (attrType.charAt(0) >= '0' && attrType.charAt(0) <= '9') {
            attrValue = str.substring(i + 1);
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
    static String changeLess32toRFC(String string) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c;

```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
            StringBuilder sb = new StringBuilder();
            try (StringReader sr = new StringReader(value.substring(1, value.length() - 1))) {
                int i = 0;
                char c;

```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

        Node startParent = null;
        Node processedNode = null;
        if (startNode != null) {
            startParent = startNode.getParentNode();
```

### UnusedAssignment
Variable `processedNode` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

        Node startParent = null;
        Node processedNode = null;
        Element foundElement = null;
        if (startNode != null) {
```

### UnusedAssignment
Variable `newUri` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverLocalFilesystem.java`
#### Snippet
```java

    private static URI getNewURI(String uri, String baseURI) throws URISyntaxException {
        URI newUri = null;
        if (baseURI == null || baseURI.length() == 0) {
            newUri = new URI(uri);
```

### UnusedAssignment
Variable `selectedElem` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverFragment.java`
#### Snippet
```java
        Document doc = context.attr.getOwnerElement().getOwnerDocument();

        Node selectedElem = null;
        if (context.uriToResolve.isEmpty()) {
            /*
```

### UnusedAssignment
Variable `decodedData` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        }

        byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

```

### UnusedAssignment
Variable `b1` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b2` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b3` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b4` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
Variable `encodedIndex` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        int i = 0;
        int encodedIndex = 0;
        int dataIndex = 0;

```

### UnusedAssignment
Variable `dataIndex` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        int i = 0;
        int encodedIndex = 0;
        int dataIndex = 0;

        //decodedData = new byte[ (numberQuadruple)*3];
```

### UnusedAssignment
The value changed at `dataIndex++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) {
            //Check if they are PAD characters
```

### UnusedAssignment
The value changed at `encodedIndex++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            decodedData[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4) ;
            decodedData[encodedIndex++] = (byte)(((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
            decodedData[encodedIndex++] = (byte)(b3 << 6 | b4);
        }
        encodedIndex = 0;
```

### UnusedAssignment
Variable `b1` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int index = 0;
```

### UnusedAssignment
Variable `b2` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int index = 0;
```

### UnusedAssignment
Variable `b3` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int index = 0;
```

### UnusedAssignment
Variable `b4` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int index = 0;
```

### UnusedAssignment
The value changed at `index++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
                data[index++] = readed;
                if (index == 3) {
                    data[index++] = (byte)is.read();
                }
                break;
```

### UnusedAssignment
Variable `b1` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b2` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b3` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `b4` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //byte[] decodedData = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;

        int i = 0;
        int dataIndex = 0;

```

### UnusedAssignment
The value changed at `dataIndex++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
        if (b3 == -1 || b4 == -1) { //Check if they are PAD characters
            if (isPad(d3) && isPad(d4)) {               //Two PAD e.g. 3c[Pad][Pad]
```

### UnusedAssignment
Variable `encodedData` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        int quartesPerLine = length / 4;
        int numberLines = (numberQuartet - 1) / quartesPerLine;
        char[] encodedData = null;

        encodedData = new char[numberQuartet * 4 + numberLines * 2];
```

### UnusedAssignment
Variable `k` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        encodedData = new char[numberQuartet * 4 + numberLines * 2];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
Variable `l` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        encodedData = new char[numberQuartet * 4 + numberLines * 2];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
Variable `b1` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        encodedData = new char[numberQuartet * 4 + numberLines * 2];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
Variable `b2` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        encodedData = new char[numberQuartet * 4 + numberLines * 2];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
Variable `b3` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        encodedData = new char[numberQuartet * 4 + numberLines * 2];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
```

### UnusedAssignment
The value changed at `encodedIndex++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            encodedData[encodedIndex++] = lookUpBase64Alphabet[k << 4];
            encodedData[encodedIndex++] = PAD;
            encodedData[encodedIndex++] = PAD;
        } else if (fewerThan24bits == SIXTEENBIT) {
            b1 = binaryData[dataIndex];
```

### UnusedAssignment
The value changed at `encodedIndex++` is never used
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            encodedData[encodedIndex++] = lookUpBase64Alphabet[val2 | (k << 4)];
            encodedData[encodedIndex++] = lookUpBase64Alphabet[l << 2];
            encodedData[encodedIndex++] = PAD;
        }

```

### UnusedAssignment
Variable `retBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        throws IOException, Base64DecodingException {

        byte[] retBytes = null;
        UnsyncByteArrayOutputStream baos = new UnsyncByteArrayOutputStream();
        try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
    ) {
        Document doc = getDocument();
        Element result = null;
        if (namespace == null) {
            result = doc.createElementNS(null, localName);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     */
    public static Element createElementForFamily(Document doc, String namespace, String localName) {
        Element result = null;
        String prefix = ElementProxy.getDefaultPrefix(namespace);

```

### UnusedAssignment
Variable `read` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
                InputStream inputStream = urlConnection.getInputStream()) {
                byte[] buf = new byte[4096];
                int read = 0;
                int summarized = 0;

```

### UnusedAssignment
Variable `newUri` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java

    private static URI getNewURI(String uri, String baseURI) throws URISyntaxException {
        URI newUri = null;
        if (baseURI == null || baseURI.length() == 0) {
            newUri = new URI(uri);
```

### UnusedAssignment
Variable `c14nizer` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
            diOs.write(bytes);
        } else if (inputOctetStreamProxy == null) {
            CanonicalizerBase c14nizer = null;
            if (c14n11) {
                c14nizer = new Canonicalizer11_OmitComments();
```

### UnusedAssignment
Variable `bytesread` initializer `0` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
        } else {
            byte[] buffer = new byte[4 * 1024];
            int bytesread = 0;
            try {
                while ((bytesread = inputOctetStreamProxy.read(buffer)) != -1) {
```

### UnusedAssignment
Variable `objectElem` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java

        // If it exists use it, but it's not mandatory
        Element objectElem = null;
        if (keyInfoElem != null
            && Constants.SignatureSpecNS.equals(keyInfoElem.getNamespaceURI())
```

### UnusedAssignment
Variable `contextDocument` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java
            Document d = XMLUtils.read(inputStream, secureValidation);

            Document contextDocument = null;
            if (Node.DOCUMENT_NODE == ctx.getNodeType()) {
                contextDocument = (Document)ctx;
```

### UnusedAssignment
Variable `output` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
        try {
            Transforms transforms = this.getTransforms();
            XMLSignatureInput output = null;

            if (transforms != null) {
```

### UnusedAssignment
Variable `base64EncodedEncryptedOctets` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
     */
    private byte[] getDecryptBytes() throws XMLEncryptionException {
        String base64EncodedEncryptedOctets = null;

        if (cipherData.getDataType() == CipherData.REFERENCE_TYPE) {
```

### UnusedAssignment
Variable `input` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java

            Attr uriAttr = cr.getURIAsAttr();
            XMLSignatureInput input = null;

            try {
```

### UnusedAssignment
Variable `contextDocument` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java
    private Node deserialize(Node ctx, Source source) throws XMLEncryptionException {
        try {
            Document contextDocument = null;
            if (Node.DOCUMENT_NODE == ctx.getNodeType()) {
                contextDocument = (Document)ctx;
```

### UnusedAssignment
Variable `prefixList` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
        super(doc);

        SortedSet<String> prefixList = null;
        if (prefixes instanceof SortedSet<?>) {
            prefixList = (SortedSet<String>)prefixes;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
    ) throws IOException, CanonicalizationException,
        InvalidCanonicalizerException, TransformationException {
        XMLSignatureInput result = null;

        try {
```

### UnusedAssignment
Variable `inputDoc` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
            }

            Document inputDoc = null;
            if (input.getSubNode() != null) {
                inputDoc = XMLUtils.getOwnerDocument(input.getSubNode());
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            ReferenceList result = new ReferenceListImpl(type);
            NodeList list = null;
            if (ReferenceList.DATA_REFERENCE == type) {
                list =
```

### UnusedAssignment
Variable `tmpType` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    this.type = null;
                } else {
                    URI tmpType = null;
                    try {
                        tmpType = new URI(type);
```

### UnusedAssignment
Variable `cipherType` initializer `Integer.MIN_VALUE` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private CipherValue cipherValue;
            private CipherReference cipherReference;
            private int cipherType = Integer.MIN_VALUE;

            /**
```

### UnusedAssignment
Variable `encryptedBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        contextDocument = doc;

        byte[] encryptedBytes = null;
        Cipher c;

```

### UnusedAssignment
Variable `tmpTarget` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    this.target = target;
                } else {
                    URI tmpTarget = null;
                    try {
                        tmpTarget = new URI(target);
```

### UnusedAssignment
Variable `tmpEncoding` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    this.encoding = null;
                } else {
                    URI tmpEncoding = null;
                    try {
                        tmpEncoding = new URI(encoding);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         */
        EncryptedKey newEncryptedKey(Element element) throws XMLEncryptionException {
            EncryptedKey result = null;
            NodeList dataElements =
                element.getElementsByTagNameNS(
```

### UnusedAssignment
Variable `tmpAlgorithm` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             */
            public EncryptionMethodImpl(String algorithm) {
                URI tmpAlgorithm = null;
                try {
                    tmpAlgorithm = new URI(algorithm);
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
    public EncryptedData createEncryptedData(int type, String value) throws XMLEncryptionException {
        EncryptedData result = null;
        CipherData data = null;

        if (CipherData.REFERENCE_TYPE == type) {
```

### UnusedAssignment
Variable `encryptedBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        }

        byte[] encryptedBytes = null;

        // Now create the working cipher if none was created already
```

### UnusedAssignment
Variable `tmpAlgorithm` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            public AgreementMethodImpl(String algorithm) {
                agreementMethodInformation = new LinkedList<>();
                URI tmpAlgorithm = null;
                try {
                    tmpAlgorithm = new URI(algorithm);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         */
        EncryptedData newEncryptedData(Element element) throws XMLEncryptionException {
            EncryptedData result = null;

            NodeList dataElements =
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
    public EncryptedKey createEncryptedKey(int type, String value) throws XMLEncryptionException {
        EncryptedKey result = null;
        CipherData data = null;

        if (CipherData.REFERENCE_TYPE == type) {
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`input.indexOf("//") > -1` can be replaced with 'input.contains("//")'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        // with "/" until no more occurrences of "//" are in the input buffer.
        String input = path;
        while (input.indexOf("//") > -1) {
            input = input.replaceAll("//", "/");
        }
```

### IndexOfReplaceableByContains
`str.indexOf("namespace") != -1` can be replaced with 'str.contains("namespace")'
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
     */
    private boolean needsCircumvent(String str) {
        return str.indexOf("namespace") != -1 || str.indexOf("name()") != -1;
    }

```

### IndexOfReplaceableByContains
`str.indexOf("name()") != -1` can be replaced with 'str.contains("name()")'
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
     */
    private boolean needsCircumvent(String str) {
        return str.indexOf("namespace") != -1 || str.indexOf("name()") != -1;
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `validationStatus` is always 'false'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            validationStatus = false;
            validated = true;
            return validationStatus;
        }

```

### ConstantValue
Condition `validateRefs` at the left side of assignment expression is always `true`. Can be simplified
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            boolean refValid = ref.validate(vc);
            LOG.debug("Reference [{}] is valid: {}", ref.getURI(), refValid);
            validateRefs &= refValid;
        }
        if (!validateRefs) {
```

### ConstantValue
Value `validationStatus` is always 'false'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            validationStatus = false;
            validated = true;
            return validationStatus;
        }

```

### ConstantValue
Condition `validateMans` at the left side of assignment expression is always `true`. Can be simplified
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
                                "Manifest ref [{}] is valid: {}", ref.getURI(),  refValid
                            );
                            validateMans &= refValid;
                        }
                    }
```

### ConstantValue
Condition `dos != null` is always `true`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                }
            }
            if (dos != null) {
                try {
                    dos.close();
```

### ConstantValue
Condition `description != null` is always `true`
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            element.getAttributeNS(null, "DESCRIPTION");

                        if (description != null && description.length() > 0) {
                            LOG.debug("Register Resolver: {}: {}", javaClass, description);
                        } else {
```

### ConstantValue
Condition `description != null` is always `true`
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            element.getAttributeNS(null, "DESCRIPTION");

                        if (description != null && description.length() > 0) {
                            LOG.debug("Register Resolver: {}: {}", javaClass, description);
                        } else {
```

### ConstantValue
Condition `c <= 0x7FFFFFFF` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                // already outside valid Character range, just for completeness
                extraByte = 4;
            } else if (c <= 0x7FFFFFFF) {
                // 0x04000000 - 0x7FFFFFFF
                // 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
```

### ConstantValue
Condition `c <= 0x7FFFFFFF` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                // already outside valid Character range, just for completeness
                extraByte = 4;
            } else if (c <= 0x7FFFFFFF) {
                // 0x04000000 - 0x7FFFFFFF
                // 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
```

### ConstantValue
Condition `c <= 0x7FFFFFFF` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
            // already outside valid Character range, just for completeness
            extraByte = 4;
        } else if (c <= 0x7FFFFFFF) {
            // 0x04000000 - 0x7FFFFFFF
            // 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
```

### ConstantValue
Condition `sibling.getNodeType() != Node.ELEMENT_NODE` is always `false` when reached
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        if (sibling == null || sibling.getNodeType() != Node.ELEMENT_NODE) {
            /* No Elements found */
            Object[] exArgs = { "Elements", Constants._TAG_X509DATA };
```

### ConstantValue
Condition `x509childNodes == null` is always `false`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);

        if (x509childNodes == null || x509childNodes.length <= 0) {
            return null;
        }
```

### ConstantValue
Condition `els == null` is always `false`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
            Element[] els =
                XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509CERTIFICATE);
            if (els == null || els.length == 0) {
                Element el =
                    XMLUtils.selectDsNode(element.getFirstChild(), Constants._TAG_X509DATA, 0);
```

### ConstantValue
Condition `x509childNodes != null` is always `true`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SKI);

        return x509childNodes != null && x509childNodes.length > 0;
    }

```

### ConstantValue
Condition `x509childNodes != null` is always `true`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
        Element[] x509childNodes =
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SKI);
        if (!(x509childNodes != null && x509childNodes.length > 0)) {
            return null;
        }
```

### ConstantValue
Condition `x509childNodes != null` is always `true`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
        Element[] x509childNodes =
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SUBJECTNAME);
        if (!(x509childNodes != null && x509childNodes.length > 0)) {
            return null;
        }
```

### ConstantValue
Condition `x509childNodes != null` is always `true`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SUBJECTNAME);

        return x509childNodes != null && x509childNodes.length > 0;
    }

```

### ConstantValue
Value `secureValidation` is always 'false'
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                }
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
                XMLSignatureInput resource2 = resolveInput(rm2, baseURI, secureValidation);
                Element e2 = obtainReferenceElement(resource2, secureValidation);
                if (e2 == element) {
```

### ConstantValue
Value `secureValidation` is always 'false'
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
                XMLSignatureInput resource2 = resolveInput(rm2, baseURI, secureValidation);
                Element e2 = obtainReferenceElement(resource2, secureValidation);
                if (e2 == element) {
                    LOG.debug("Error: Can't have RetrievalMethods pointing to each other");
```

### ConstantValue
Value `secureValidation` is always 'false'
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                }
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
                XMLSignatureInput resource2 = resolveInput(rm2, baseURI, secureValidation);
                Element e2 = obtainReferenceElement(resource2, secureValidation);
                if (e2 == element) {
```

### ConstantValue
Value `secureValidation` is always 'false'
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
                XMLSignatureInput resource2 = resolveInput(rm2, baseURI, secureValidation);
                Element e2 = obtainReferenceElement(resource2, secureValidation);
                if (e2 == element) {
                    LOG.debug("Error: Can't have RetrievalMethods pointing to each other");
```

### ConstantValue
Value `elementStack` is always 'null'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
        Element element;
        if (elementStack == null) {
            element = new Element(elementStack, namespaceContext, namespaceURI, localName, prefix);
            if (signEntireRequestPart != null) {
                signEntireRequestPart.setName(new QName(namespaceURI, localName, prefix));
```

### ConstantValue
Condition `m != null` is always `true`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
                // A reflection hack to avoid breaking the ResourceResolver interface for SANTUARIO-407.
                Method m = resolver.getClass().getMethod("matches", XMLSecStartElement.class, QName.class);
                if (m != null
                    && (Boolean)m.invoke(resolver, xmlSecStartElement, getSecurityProperties().getIdAttributeNS())) {
                    if (referenceTypes == Collections.<ReferenceType>emptyList()) {
```

### ConstantValue
Value `followManifests` is always 'true'
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java

                        boolean referencedManifestValid =
                            referencedManifest.verifyReferences(followManifests);

                        if (!referencedManifestValid) {
```

### ConstantValue
Condition `hmacLength != null` is always `true`
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
        if (n != null) {
            String hmacLength = XMLUtils.getFullTextChildrenFromNode(n);
            if (hmacLength != null && hmacLength.length() != 0) {
                this.hmacOutputLength = new HMACOutputLength(Integer.parseInt(hmacLength));
            }
```

### ConstantValue
Condition `algorithmURI == null` is always `false`
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
        String algorithmURI = element.getAttributeNS(null, Constants._ATT_ALGORITHM);

        if (algorithmURI == null || algorithmURI.length() == 0) {
            Object[] exArgs = { Constants._ATT_ALGORITHM, Constants._TAG_TRANSFORM };
            throw new TransformationException("xml.WrongContent", exArgs);
```

### ConstantValue
Condition `null != children` is always `true`
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
                NodeList children = element.getChildNodes();
                if (null != children) {
                    serializedOctets = serializer.serializeToByteArray(children);
                } else {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Init` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
 * of the files of this library. We ensure that this call is only executed once.
 */
public class Init {

    /** The namespace for CONF file **/
```

### UtilityClassWithoutPrivateConstructor
Class `KeyResolver` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
 * represent child element of KeyInfo.
 */
public class KeyResolver {

    private static final org.slf4j.Logger LOG =
```

### UtilityClassWithoutPrivateConstructor
Class `XMLSecurityConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityConstants.java`
#### Snippet
```java
 *
 */
public class XMLSecurityConstants {

    public static final DatatypeFactory datatypeFactory;
```

### UtilityClassWithoutPrivateConstructor
Class `XMLSecurityUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
/**
 */
public class XMLSecurityUtils {

    private static final int MAX_SYMMETRIC_KEY_SIZE = 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `XMLSec` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
 * with this class.
 */
public class XMLSec {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `IDGenerator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/impl/util/IDGenerator.java`
#### Snippet
```java
/**
 */
public class IDGenerator {

    public static String generateID(String prefix) {
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityEventConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/securityEvent/SecurityEventConstants.java`
#### Snippet
```java
/**
 */
public class SecurityEventConstants {

    public static final Event SignatureValue = new Event("SignatureValue");
```

### UtilityClassWithoutPrivateConstructor
Class `Init` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/config/Init.java`
#### Snippet
```java
 *
 */
public class Init {

    private static URI initialized;
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityTokenConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/stax/securityToken/SecurityTokenConstants.java`
#### Snippet
```java
import org.apache.xml.security.stax.ext.ComparableType;

public class SecurityTokenConstants {

    public static final TokenUsage TokenUsage_Signature = new TokenUsage("Signature");
```

### UtilityClassWithoutPrivateConstructor
Class `RFC2253Parser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
import java.io.StringReader;

public class RFC2253Parser {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceResolver` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
 * file/entity in which the URI occurs (the baseURI is the same as the SystemId).
 */
public class ResourceResolver {

    private static final org.slf4j.Logger LOG =
```

### UtilityClassWithoutPrivateConstructor
Class `XMLCipherUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/xml/security/encryption/XMLCipherUtil.java`
#### Snippet
```java
import org.apache.xml.security.utils.EncryptionConstants;

public final class XMLCipherUtil {

    private static final org.slf4j.Logger LOG =
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `this.references.get(i) instanceof Reference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMManifest.java`
#### Snippet
```java
        }
        for (int i = 0, size = this.references.size(); i < size; i++) {
            if (!(this.references.get(i) instanceof Reference)) {
                throw new ClassCastException
                    ("references["+i+"] is not a valid type");
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod.java`
#### Snippet
```java
    static DigestMethod unmarshal(Element dmElem) throws MarshalException {
        String alg = DOMUtils.getAttributeValue(dmElem, "Algorithm");
        if (alg.equals(DigestMethod.SHA1)) {
            return new SHA1(dmElem);
        } else if (alg.equals(SHA224)) {
```

### DataFlowIssue
Condition `this.keyInfoTypes.get(i) instanceof XMLStructure` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfo.java`
#### Snippet
```java
        }
        for (int i = 0, size = this.keyInfoTypes.size(); i < size; i++) {
            if (!(this.keyInfoTypes.get(i) instanceof XMLStructure)) {
                throw new ClassCastException
                    ("content["+i+"] is not a valid KeyInfo type");
```

### DataFlowIssue
Condition `this.content.get(i) instanceof XMLStructure` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLObject.java`
#### Snippet
```java
                new ArrayList<>(content));
            for (int i = 0, size = this.content.size(); i < size; i++) {
                if (!(this.content.get(i) instanceof XMLStructure)) {
                    throw new ClassCastException
                        ("content["+i+"] is not a valid type");
```

### DataFlowIssue
Argument `algorithm` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
        if (provider == null) {
            try {
                spi = TransformService.getInstance(algorithm, "DOM");
            } catch (NoSuchAlgorithmException e1) {
                throw new MarshalException(e1);
```

### DataFlowIssue
Argument `algorithm` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
        } else {
            try {
                spi = TransformService.getInstance(algorithm, "DOM", provider);
            } catch (NoSuchAlgorithmException nsae) {
                try {
```

### DataFlowIssue
Condition `this.externalElements.get(i) instanceof XMLStructure` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMPGPData.java`
#### Snippet
```java
                Collections.unmodifiableList(new ArrayList<>(other));
            for (int i = 0, size = this.externalElements.size(); i < size; i++) {
                if (!(this.externalElements.get(i) instanceof XMLStructure)) {
                    throw new ClassCastException
                        ("other["+i+"] is not a valid PGPData type");
```

### DataFlowIssue
Condition `this.externalElements.get(i) instanceof XMLStructure` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMPGPData.java`
#### Snippet
```java
                Collections.unmodifiableList(new ArrayList<>(other));
            for (int i = 0, size = this.externalElements.size(); i < size; i++) {
                if (!(this.externalElements.get(i) instanceof XMLStructure)) {
                    throw new ClassCastException
                        ("other["+i+"] is not a valid PGPData type");
```

### DataFlowIssue
Condition `this.transforms.get(i) instanceof Transform` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRetrievalMethod.java`
#### Snippet
```java
                new ArrayList<>(transforms));
            for (int i = 0, size = this.transforms.size(); i < size; i++) {
                if (!(this.transforms.get(i) instanceof Transform)) {
                    throw new ClassCastException
                        ("transforms["+i+"] is not a valid type");
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureMethod.java`
#### Snippet
```java
    static SignatureMethod unmarshal(Element smElem) throws MarshalException {
        String alg = DOMUtils.getAttributeValue(smElem, "Algorithm");
        if (alg.equals(SignatureMethod.RSA_SHA1)) {
            return new SHA1withRSA(smElem);
        } else if (alg.equals(RSA_SHA224)) {
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                    if (inclusiveNamespaces != null) {
                        canonicalizer.canonicalizeSubtree(in.getSubNode(), inclusiveNamespaces, writer);
                        return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
                    } else {
                        canonicalizer.canonicalizeSubtree(in.getSubNode(), writer);
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                    } else {
                        canonicalizer.canonicalizeSubtree(in.getSubNode(), writer);
                        return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
                    }
                } else if (in.isNodeSet()) {
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                } else {
                    canonicalizer.canonicalize(Utils.readBytesFromStream(in.getOctetStream()), writer, secVal);
                    return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
                }
            } else if (data instanceof DOMSubTreeData) {
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                if (inclusiveNamespaces != null) {
                    canonicalizer.canonicalizeSubtree(subTree.getRoot(), inclusiveNamespaces, writer);
                    return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
                } else {
                    canonicalizer.canonicalizeSubtree(subTree.getRoot(), writer);
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
                } else {
                    canonicalizer.canonicalizeSubtree(subTree.getRoot(), writer);
                    return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
                }
            } else if (data instanceof NodeSetData) {
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            } else {
                canonicalizer.canonicalize(Utils.readBytesFromStream(((OctetStreamData)data).getOctetStream()), writer, secVal);
                return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
            }

```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            if (inclusiveNamespaces != null) {
                canonicalizer.canonicalizeXPathNodeSet(nodeSet, inclusiveNamespaces, writer);
                return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
            } else {
                canonicalizer.canonicalizeXPathNodeSet(nodeSet, writer);
```

### DataFlowIssue
Argument `getC14nBytes(writer, isByteArrayOutputStream)` might be null
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            } else {
                canonicalizer.canonicalizeXPathNodeSet(nodeSet, writer);
                return new OctetStreamData(new ByteArrayInputStream(getC14nBytes(writer, isByteArrayOutputStream)));
            }
        } catch (Exception e) {
```

### DataFlowIssue
Condition `obj instanceof Reference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java
        for (int i = 0, size = this.references.size(); i < size; i++) {
            Object obj = this.references.get(i);
            if (!(obj instanceof Reference)) {
                throw new ClassCastException("list of references contains " +
                    "an illegal type");
```

### DataFlowIssue
Condition `this.content.get(i) instanceof XMLStructure` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureProperty.java`
#### Snippet
```java
                new ArrayList<>(content));
            for (int i = 0, size = this.content.size(); i < size; i++) {
                if (!(this.content.get(i) instanceof XMLStructure)) {
                    throw new ClassCastException
                        ("content["+i+"] is not a valid type");
```

### DataFlowIssue
Condition `this.objects.get(i) instanceof XMLObject` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
                Collections.unmodifiableList(new ArrayList<>(objs));
            for (int i = 0, size = this.objects.size(); i < size; i++) {
                if (!(this.objects.get(i) instanceof XMLObject)) {
                    throw new ClassCastException
                        ("objs["+i+"] is not an XMLObject");
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
                String uri = DOMUtils.getAttributeValue(curElem, "URI");
                // strip off "urn:oid"
                if (uri.startsWith("urn:oid:")) {
                    String oid = uri.substring("urn:oid:".length());
                    ecParams = getECParameterSpec(oid);
```

### DataFlowIssue
Condition `this.properties.get(i) instanceof SignatureProperty` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureProperties.java`
#### Snippet
```java
                new ArrayList<>(properties));
            for (int i = 0, size = this.properties.size(); i < size; i++) {
                if (!(this.properties.get(i) instanceof SignatureProperty)) {
                    throw new ClassCastException
                        ("properties["+i+"] is not a valid type");
```

### DataFlowIssue
Condition `this.allTransforms.get(i) instanceof Transform` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
            this.allTransforms = new ArrayList<>(appliedTransforms);
            for (int i = 0, size = this.allTransforms.size(); i < size; i++) {
                if (!(this.allTransforms.get(i) instanceof Transform)) {
                    throw new ClassCastException
                        ("appliedTransforms["+i+"] is not a valid type");
```

### DataFlowIssue
Condition `this.transforms.get(i) instanceof Transform` is redundant and can be replaced with a null check
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
            this.transforms = new ArrayList<>(transforms);
            for (int i = 0, size = this.transforms.size(); i < size; i++) {
                if (!(this.transforms.get(i) instanceof Transform)) {
                    throw new ClassCastException
                        ("transforms["+i+"] is not a valid type");
```

### DataFlowIssue
Method invocation `getTextContent` may produce `NullPointerException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRSAPSSSignatureMethod.java`
#### Snippet
```java
                params.setSaltLength(saltLength);
            } catch (NumberFormatException ex) {
                throw new MarshalException("Invalid salt length supplied: " + saltLengthNode.getTextContent());
            }
            params.setDigestName(digestName);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                        }
                    } else {
                        output = output.delete(index, output.length());
                    }
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                        }
                    } else {
                        output = output.delete(index, output.length());
                    }
                }
```

### DataFlowIssue
Method invocation `getElementPath` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/ext/AbstractInputSecurityHeaderHandler.java`
#### Snippet
```java
    protected List<QName> getElementPath(Deque<XMLSecEvent> eventDeque) throws XMLSecurityException {
        XMLSecEvent xmlSecEvent = eventDeque.peek();
        return xmlSecEvent.getElementPath();
    }

```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/ext/OutboundXMLSec.java`
#### Snippet
```java
            //the sun JCE provider expects the real key size for 3DES (112 or 168 bit)
            //whereas bouncy castle expects the block size of 128 or 192 bits
            if (keyAlgorithm.contains("AES")) {
                int keyLength =
                    JCEAlgorithmMapper.getKeyLengthFromURI(securityProperties.getEncryptionSymAlgorithm());
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
        } catch (Exception e) {
            // ignore - some unknown (to JCEMapper) encryption algorithm
            size = 0;
        }
        String keyAlgorithm = JCEMapper.getJCEKeyAlgorithmFromURI(symEncAlgo);
```

### DataFlowIssue
Argument `keyAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
            keySpec =
                new SecretKeySpec(
                    rawKey, 0, rawKey.length > size ? size : rawKey.length, keyAlgorithm
                );
        } else if (rawKey.length > MAX_SYMMETRIC_KEY_SIZE) {
```

### DataFlowIssue
Argument `keyAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
            keySpec =
                new SecretKeySpec(
                    rawKey, 0, MAX_SYMMETRIC_KEY_SIZE, keyAlgorithm
                );
        } else {
```

### DataFlowIssue
Argument `keyAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
                );
        } else {
            keySpec = new SecretKeySpec(rawKey, keyAlgorithm);
        }
        return keySpec;
```

### DataFlowIssue
Method invocation `engineSetParameter` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                if (XMLSignature.ALGO_ID_SIGNATURE_RSA_PSS.equals(algorithmURI)) {
                    PSSParameterSpec spec = rsaPSSParameterSpec(signatureType);
                    signatureAlgorithm.engineSetParameter(spec);
                }
                signatureAlgorithm.engineInitVerify(verifyKey);
```

### DataFlowIssue
Method invocation `engineInitVerify` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                    signatureAlgorithm.engineSetParameter(spec);
                }
                signatureAlgorithm.engineInitVerify(verifyKey);
                signerOutputStream = new SignerOutputStream(signatureAlgorithm);
                bufferedSignerOutputStream = new UnsyncBufferedOutputStream(signerOutputStream);
```

### DataFlowIssue
Argument `algoFamily` might be null
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java

                        String algoFamily = JCEAlgorithmMapper.getJCEKeyAlgorithmFromURI(algorithmURI);
                        key = new SecretKeySpec(getSecret(this, correlationID, algorithmURI), algoFamily);
                        setSecretKey(algorithmURI, key);
                        return key;
```

### DataFlowIssue
Argument `jceMGFAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                if (mgfType != null) {
                                    String jceMGFAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(mgfType.getAlgorithm());
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
                                OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec(jceDigestAlgorithm, "MGF1", mgfParameterSpec, pSource);
```

### DataFlowIssue
Argument `jceDigestAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLEncryptedKeyInputHandler.java`
#### Snippet
```java
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
                                OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec(jceDigestAlgorithm, "MGF1", mgfParameterSpec, pSource);
                                cipher.init(Cipher.UNWRAP_MODE, wrappingSecurityToken.getSecretKey(algorithmURI, algorithmUsage, correlationID), oaepParameterSpec);
                            } else {
```

### DataFlowIssue
Argument `jceMGFAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                                if (encryptionKeyTransportMGFAlgorithm != null) {
                                    String jceMGFAlgorithm = JCEAlgorithmMapper.translateURItoJCEID(encryptionKeyTransportMGFAlgorithm);
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
                                algorithmParameterSpec = new OAEPParameterSpec(jceDigestAlgorithm, "MGF1", mgfParameterSpec, pSource);
```

### DataFlowIssue
Argument `jceDigestAlgorithm` might be null
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                                    mgfParameterSpec = new MGF1ParameterSpec(jceMGFAlgorithm);
                                }
                                algorithmParameterSpec = new OAEPParameterSpec(jceDigestAlgorithm, "MGF1", mgfParameterSpec, pSource);
                            }

```

### DataFlowIssue
Method invocation `engineSetParameter` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
                    getSecurityProperties().getSignatureAlgorithm());
            if (getSecurityProperties().getAlgorithmParameterSpec() != null) {
                signatureAlgorithm.engineSetParameter(getSecurityProperties().getAlgorithmParameterSpec());
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
```

### DataFlowIssue
Method invocation `engineInitSign` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
            key = XMLSecurityUtils.prepareSecretKey(sigAlgorithm, key.getEncoded());
        }
        signatureAlgorithm.engineInitSign(key);

        SignedInfoProcessor signedInfoProcessor =
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer11.java`
#### Snippet
```java
            }
            utilizedAttributes.add(comparableAttribute);
            outputStack.peek().add(comparableAttribute);
        }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
            utilizedNamespaces = new ArrayList<>(2);
            utilizedNamespaces.add(elementNamespace);
            outputStack.peek().add(elementNamespace);
        }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
                }
                utilizedNamespaces.add(attributeNamespace);
                outputStack.peek().add(attributeNamespace);
            }
        }
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
                    }
                    utilizedNamespaces.add(comparableNamespace);
                    outputStack.peek().add(comparableNamespace);
                }
            }
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                        utilizedNamespaces = new ArrayList<>();
                        utilizedAttributes = new ArrayList<>();
                        outputStack.peek().add(XMLSecEventFactory.createXMLSecNamespace(null, ""));
                        outputStack.push(Collections.<Comparable>emptyList());

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                utilizedNamespaces.remove(comparableNamespace);
            }
            outputStack.peek().add(comparableNamespace);

            //don't add xmlns="" declarations:
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            utilizedNamespaces = new ArrayList<>(2);
            utilizedNamespaces.add(elementNamespace);
            outputStack.peek().add(elementNamespace);
        }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            }
            utilizedNamespaces.add(comparableNamespace);
            outputStack.peek().add(comparableNamespace);
        }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                }
                utilizedNamespaces.add(attributeNamespace);
                outputStack.peek().add(attributeNamespace);
            }
        }
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            }
            utilizedAttributes.add(comparableAttribute);
            outputStack.peek().add(comparableAttribute);
        }

```

### DataFlowIssue
Argument `id` might be null
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
            if (context.secureValidation) {
                Element start = context.attr.getOwnerDocument().getDocumentElement();
                if (!XMLUtils.protectAgainstWrappingAttack(start, id)) {
                    Object[] exArgs = { id };
                    throw new ResourceResolverException(
```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
                String providerId = JCEMapper.getProviderId();
                if (providerId == null) {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID);

                } else {
```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java

                } else {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID, providerId);
                }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java

            } else {
                this.signatureAlgorithm = Signature.getInstance(algorithmID, provider);
            }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
                String providerId = JCEMapper.getProviderId();
                if (providerId == null) {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID);

                } else {
```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java

                } else {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID, providerId);
                }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java

            } else {
                this.signatureAlgorithm = Signature.getInstance(algorithmID, provider);
            }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
                String providerId = JCEMapper.getProviderId();
                if (providerId == null) {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID);

                } else {
```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java

                } else {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID, providerId);
                }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java

            } else {
                this.signatureAlgorithm = Signature.getInstance(algorithmID, provider);
            }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
                String providerId = JCEMapper.getProviderId();
                if (providerId == null) {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID);

                } else {
```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java

                } else {
                    this.signatureAlgorithm = Signature.getInstance(algorithmID, providerId);
                }

```

### DataFlowIssue
Argument `algorithmID` might be null
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java

            } else {
                this.signatureAlgorithm = Signature.getInstance(algorithmID, provider);
            }

```

### DataFlowIssue
Argument `str` might be null
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
            }
            String str = XMLUtils.getStrFromNode(xpathnode);
            input.setNeedsToBeExpanded(needsCircumvent(str));

            XPathFactory xpathFactory = getXPathFactory();
```

### DataFlowIssue
Argument `xpathContainer.getXPathFilterTextNode()` might be null
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java

                String str =
                    XMLUtils.getStrFromNode(xpathContainer.getXPathFilterTextNode());

                XPathAPI xpathAPIInstance = xpathFactory.newXPathAPI();
```

### DataFlowIssue
Argument `jceAlgorithm` might be null
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        try {
            if (requestedJCEProvider == null) {
                c = Cipher.getInstance(jceAlgorithm);
            } else {
                c = Cipher.getInstance(jceAlgorithm, requestedJCEProvider);
```

### DataFlowIssue
Argument `jceAlgorithm` might be null
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                c = Cipher.getInstance(jceAlgorithm);
            } else {
                c = Cipher.getInstance(jceAlgorithm, requestedJCEProvider);
            }
        } catch (NoSuchAlgorithmException nsae) {
```

### DataFlowIssue
Argument `jceAlgorithm` might be null
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        try {
            if (requestedJCEProvider == null) {
                c = Cipher.getInstance(jceAlgorithm);
            } else {
                c = Cipher.getInstance(jceAlgorithm, requestedJCEProvider);
```

### DataFlowIssue
Argument `jceAlgorithm` might be null
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                c = Cipher.getInstance(jceAlgorithm);
            } else {
                c = Cipher.getInstance(jceAlgorithm, requestedJCEProvider);
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
```

### DataFlowIssue
Argument `jceDigestAlgorithm` might be null
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                }
            }
            return new OAEPParameterSpec(jceDigestAlgorithm, "MGF1", mgfParameterSpec, pSource);
        }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMExcC14NMethod.java`
#### Snippet
```java

        ExcC14NParameterSpec params = (ExcC14NParameterSpec)spec;
        StringBuilder prefixListAttr = new StringBuilder("");
        List<String> prefixList = getParameterSpecPrefixList(params);
        for (int i = 0, size = prefixList.size(); i < size; i++) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'setIdToSign' is still used
in `src/main/java/org/apache/xml/security/stax/ext/SecurePart.java`
#### Snippet
```java
     */
    @Deprecated
    public void setIdToSign(String idToSign) {
        setIdToSecure(idToSign);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ENCRYPT' is still used
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Action ENCRYPT = ENCRYPTION;

    public static final QName TAG_dsigmore_RSAPSSPARAMS = new QName(NS_DSIG_MORE_2007_05, "RSAPSSParams", PREFIX_DSIG_MORE_PSS);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Expected cipher.outputSize = " +
                        Integer.toString(c.getOutputSize(serializedOctets.length)));
                }
            }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            if (LOG.isDebugEnabled()) {
                LOG.debug("Actual cipher.outputSize = "
                             + Integer.toString(encryptedBytes.length));
            }
        } catch (IllegalStateException | IllegalBlockSizeException
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'uninitializedReference' in a Serializable class
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java

    /** Field uninitializedReference */
    private Reference uninitializedReference;

    /**
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/jcp/xml/dsig/internal/SignerOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] arg0, int arg1, int arg2) {
        super.write(arg0, arg1, arg2);
        try {
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/jcp/xml/dsig/internal/MacOutputStream.java`
#### Snippet
```java

    @Override
    public void write(int arg0) {
        super.write(arg0);
        mac.update((byte) arg0);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/jcp/xml/dsig/internal/MacOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] arg0, int arg1, int arg2) {
        super.write(arg0, arg1, arg2);
        mac.update(arg0, arg1, arg2);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/jcp/xml/dsig/internal/SignerOutputStream.java`
#### Snippet
```java

    @Override
    public void write(int arg0) {
        super.write(arg0);
        try {
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/UnsyncByteArrayInputStream.java`
#### Snippet
```java
     */
    @Override
    public void reset() {
        pos = mark;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/UnsyncByteArrayInputStream.java`
#### Snippet
```java
     */
    @Override
    public void mark(int readlimit) {
        mark = pos;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void write(byte[] arg0, int arg1, int arg2) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Canonicalized SignedInfo:");
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void write(int arg0) {
        try {
            sa.update((byte)arg0);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/DigesterOutputStream.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void write(byte[] arg0, int arg1, int arg2) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Pre-digested input:");
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `src/main/java/org/apache/xml/security/utils/DigesterOutputStream.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void write(int arg0) {
        mda.update((byte)arg0);
    }
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `unmarshalKeyValue()` during object construction
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
     */
    public DOMKeyValue(Element kvtElem) throws MarshalException {
        this.publicKey = unmarshalKeyValue(kvtElem);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `retrieveSecurityToken()` during object construction
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java

            InboundSecurityToken inboundSecurityToken =
                retrieveSecurityToken(signatureType, securityProperties, inboundSecurityContext);
            this.inboundSecurityToken = inboundSecurityToken;

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getBaseNamespace()` during object construction
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java

        this.wrappedDoc = doc;
        this.wrappedElement = createElementForFamilyLocal(this.getBaseNamespace(), this.getBaseLocalName());
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getBaseLocalName()` during object construction
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java

        this.wrappedDoc = doc;
        this.wrappedElement = createElementForFamilyLocal(this.getBaseNamespace(), this.getBaseLocalName());
    }

```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
         * @param node the node (document or element) referenced by the
         *	 URI fragment. If null, returns an empty set.
         * @return a set of nodes (minus any comment nodes)
         */
        private List<Node> dereferenceSameDocumentURI(Node node) {
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
         * @param node the node (document or element) referenced by the
         *	 URI fragment. If null, returns an empty set.
         * @return a set of nodes (minus any comment nodes)
         */
        private List<Node> dereferenceSameDocumentURI(Node node) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor.java`
#### Snippet
```java
                    }

                    protected void createKeyInfoStructureForEncryptedKey(
                        OutputProcessorChain outputProcessorChain,
                        OutboundSecurityToken securityToken
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/config/JCEAlgorithmMapper.java`
#### Snippet
```java
    }

    protected static synchronized void init(JCEAlgorithmMappingsType jceAlgorithmMappingsType) throws Exception {
        List<AlgorithmType> algorithms = jceAlgorithmMappingsType.getAlgorithm();

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/config/ResourceResolverMapper.java`
#### Snippet
```java
    }

    protected static synchronized void init(ResourceResolversType resourceResolversType,
            Class<?> callingClass) throws Exception {
        List<ResolverType> handlerList = resourceResolversType.getResolver();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/config/ConfigurationProperties.java`
#### Snippet
```java
    }

    protected static synchronized void init(PropertiesType propertiesType,
            Class<?> callingClass) throws Exception {
        properties = new Properties();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/config/SecurityHeaderHandlerMapper.java`
#### Snippet
```java
    }

    protected static synchronized void init(SecurityHeaderHandlersType securityHeaderHandlersType,
            Class<?> callingClass) throws Exception {
        List<HandlerType> handlerList = securityHeaderHandlersType.getHandler();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/stax/config/TransformerAlgorithmMapper.java`
#### Snippet
```java
    }

    protected static synchronized void init(TransformAlgorithmsType transformAlgorithms,
            Class<?> callingClass) throws Exception {
        List<TransformAlgorithmType> algorithms = transformAlgorithms.getTransformAlgorithm();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isPad(byte octet) {
        return octet == PAD;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final byte[] decodeInternal(byte[] base64Data, int len)
        throws Base64DecodingException {
        // remove white spaces
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final void decode(byte[] base64Data, OutputStream os, int len)
        throws Base64DecodingException, IOException {
        // remove white spaces
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the new length
     */
    protected static final int removeWhiteSpace(byte[] data) {
        if (data == null) {
            return 0;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final int getBytesInternal(String s, byte[] result) {
        int length = s.length();

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isWhiteSpace(byte octet) {
        return octet == 0x20 || octet == 0xd || octet == 0xa || octet == 0x9;
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
                }

                LOG.debug("Fetched {} bytes from URI {}", summarized, uriNew.toString());

                XMLSignatureInput result = new XMLSignatureInput(baos.toByteArray());
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            int c;
            if (Character.isHighSurrogate(text[i]) && i + 1 != length && Character.isLowSurrogate(text[i+1])) {
                c = Character.toCodePoint(text[i], text[++i]);
            } else {
                c = text[i];
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `r`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    result.add(r);
                    while (r != null && r.getNodeType() == Node.TEXT_NODE) {
                        r = r.getNextSibling();
                    }
                    if (r == null) {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `InternalBufferProcessor` may be 'static'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
     * Temporary Processor to buffer all events until the end of the required actions
     */
    public class InternalBufferProcessor extends AbstractInputProcessor {

        private final ArrayDeque<XMLSecEvent> xmlSecEventList = new ArrayDeque<>();
```

### InnerClassMayBeStatic
Inner class `SignatureVerifier` may be 'static'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
     */

    public abstract class SignatureVerifier {

        private final SignatureType signatureType;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `pSibling` declared in one 'switch' branch and used in another
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
                    }
                    nodeSet.add(node);
                    Node pSibling = null;
                    for (Node child = node.getFirstChild(); child != null;
                        child = child.getNextSibling()) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `pSibling` declared in one 'switch' branch and used in another
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
                        }
                    }
                    Node pSibling = null;
                    for (Node child = node.getFirstChild(); child != null;
                        child = child.getNextSibling()) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `position` declared in one 'switch' branch and used in another
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
            }

            int position = getPositionRelativeToDocumentElement(currentNode);

            if (position == NODE_AFTER_DOCUMENT_ELEMENT) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings("rawtypes")
    public KeyInfo newKeyInfo(List content) {
        return newKeyInfo(content, null);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public KeyInfo newKeyInfo(List content, String id) {
        return new DOMKeyInfo(content, id);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public PGPData newPGPData(byte[] keyId, byte[] keyPacket, List other) {
        return new DOMPGPData(keyId, keyPacket, other);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public PGPData newPGPData(byte[] keyPacket, List other) {
        return new DOMPGPData(keyPacket, other);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public RetrievalMethod newRetrievalMethod(String uri, String type,
        List transforms) {
        if (uri == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfoFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes" })
    public X509Data newX509Data(List content) {
        return new DOMX509Data(content);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
         */
        @SuppressWarnings("fallthrough")
        private void nodeSetMinusCommentNodes(Node node, List<Node> nodeSet,
                                              Node prevSibling)
        {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public XMLSignature newXMLSignature(SignedInfo si, KeyInfo ki,
        List objects, String id, String signatureValueId) {
        return new DOMXMLSignature(si, ki, objects, id, signatureValueId);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Reference newReference(String uri, DigestMethod dm, List transforms,
        String type, String id) {
        return new DOMReference(uri, type, dm, transforms, id, getProvider());
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Reference newReference(String uri, DigestMethod dm,
        List appliedTransforms, Data result, List transforms, String type,
        String id) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Reference newReference(String uri, DigestMethod dm, List transforms,
        String type, String id, byte[] digestValue) {
        if (digestValue == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes" })
    public SignedInfo newSignedInfo(CanonicalizationMethod cm,
        SignatureMethod sm, List references) {
        return newSignedInfo(cm, sm, references, null);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public SignedInfo newSignedInfo(CanonicalizationMethod cm,
        SignatureMethod sm, List references, String id) {
        return new DOMSignedInfo(cm, sm, references, id);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java
    // Object factory methods
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public XMLObject newXMLObject(List content, String id, String mimeType,
        String encoding) {
        return new DOMXMLObject(content, id, mimeType, encoding);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes" })
    public Manifest newManifest(List references) {
        return newManifest(references, null);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Manifest newManifest(List references, String id) {
        return new DOMManifest(references, id);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public SignatureProperties newSignatureProperties(List props, String id) {
        return new DOMSignatureProperties(props, id);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public SignatureProperty newSignatureProperty
        (List info, String target, String id) {
        return new DOMSignatureProperty(info, target, id);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
         */
        @SuppressWarnings("fallthrough")
        private void nodeSetMinusCommentNodes(Node node, List<Node> nodeSet,
                                              Node prevSibling)
        {
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
        if (ex != null) {
            throw (IllegalArgumentException) new
                    IllegalArgumentException("Invalid KeyResolver class name").initCause(ex);
        }
    }
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    } catch (URISyntaxException ex) {
                        throw (IllegalArgumentException)
                                new IllegalArgumentException().initCause(ex);
                    }
                    this.type = tmpType.toString();
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    } catch (URISyntaxException ex) {
                        throw (IllegalArgumentException)
                                new IllegalArgumentException().initCause(ex);
                    }
                    this.target = tmpTarget.toString();
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    } catch (URISyntaxException ex) {
                        throw (IllegalArgumentException)
                                new IllegalArgumentException().initCause(ex);
                    }
                    this.encoding = tmpEncoding.toString();
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                } catch (URISyntaxException ex) {
                    throw (IllegalArgumentException)
                            new IllegalArgumentException().initCause(ex);
                }
                this.algorithm = tmpAlgorithm.toString();
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                } catch (URISyntaxException ex) {
                    throw (IllegalArgumentException)
                            new IllegalArgumentException().initCause(ex);
                }
                algorithmURI = tmpAlgorithm.toString();
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);

        if (x509childNodes == null || x509childNodes.length <= 0) {
            return null;
        }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     */
    public void printStackTrace() {
        synchronized (System.err) {
            super.printStackTrace(System.err);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
    public void printStackTrace() {
        synchronized (System.err) {
            super.printStackTrace(System.err);
        }
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'prefix != null' covered by subsequent condition '"xmlns".equals(...)'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
                    Attr attr = (Attr)attributes.item(i);
                    String prefix = attr.getPrefix();
                    if (prefix != null && "xmlns".equals(prefix)) {
                        namespaceMap.put(attr.getLocalName(), attr.getValue());
                    }
```

### ConditionCoveredByFurtherCondition
Condition 'prefix != null' covered by subsequent condition '"xmlns".equals(...)'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathTransform.java`
#### Snippet
```java
                Attr attr = (Attr)attributes.item(i);
                String prefix = attr.getPrefix();
                if (prefix != null && "xmlns".equals(prefix)) {
                    namespaceMap.put(attr.getLocalName(), attr.getValue());
                }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        String input = path;
        while (input.indexOf("//") > -1) {
            input = input.replaceAll("//", "/");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
            } else if ("/.".equals(input)) {
                // FIXME: what is complete path segment?
                input = input.replaceFirst("/.", "/");
                printStep("2B", output.toString(), input);
                // 2C. if the input buffer begins with a prefix of "/../" or "/..",
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
            } else if ("/..".equals(input)) {
                // FIXME: what is complete path segment?
                input = input.replaceFirst("/..", "/");
                if (output.length() == 0) {
                    output.append('/');
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
        }

        String[] tokens = inclusiveNamespaces.split("\\s");
        for (String prefix : tokens) {
            if ("#default".equals(prefix)) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto.dsig` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java

        ResourceResolverContext resContext = new ResourceResolverContext(uriAttr, baseURI, secVal);
        if ((uriRef instanceof javax.xml.crypto.dsig.Reference) || resContext.isURISafeToResolve()) {
            try {
                XMLSignatureInput in = ResourceResolver.resolve(resContext);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/DigesterOutputStream.java`
#### Snippet
```java
 */
public class DigesterOutputStream extends OutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DigesterOutputStream.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/DigesterOutputStream.java`
#### Snippet
```java
public class DigesterOutputStream extends OutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DigesterOutputStream.class);

    private final boolean buffer;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMHMACSignatureMethod.java`
#### Snippet
```java
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.MacProvider";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMHMACSignatureMethod.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMHMACSignatureMethod.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMHMACSignatureMethod.class);

    // see RFC 4051 for these algorithm definitions
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureMethod.java`
#### Snippet
```java
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.SignatureProvider";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSignatureMethod.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureMethod.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSignatureMethod.class);

    private SignatureMethodParameterSpec params;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java

    static {
        org.apache.xml.security.Init.init();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
    }

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ApacheCanonicalizer.class);
    protected Canonicalizer canonicalizer;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ApacheCanonicalizer.class);
    protected Canonicalizer canonicalizer;
    private Transform apacheTransform;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java
    public static final int MAXIMUM_REFERENCE_COUNT = 30;

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSignedInfo.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMSignedInfo.class);

    /** Signature - NOT Recommended RSAwithMD5 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java

    static {
        org.apache.xml.security.Init.init();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    implements XMLSignature {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMXMLSignature.class);
    private String id;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMXMLSignature.class);
    private String id;
    private SignatureValue sv;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheTransform.java`
#### Snippet
```java
    }

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ApacheTransform.class);
    private Transform transform;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheTransform.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ApacheTransform.class);
    private Transform transform;
    protected Document ownerDoc;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheTransform.java`
#### Snippet
```java

    static {
        org.apache.xml.security.Init.init();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     */
    public void engineCanonicalize(byte[] inputBytes, OutputStream writer, boolean secureValidation)
        throws XMLParserException, java.io.IOException, CanonicalizationException {

        Document document = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java

        Document document = null;
        try (java.io.InputStream bais = new ByteArrayInputStream(inputBytes)) {
            document = XMLUtils.read(bais, secureValidation);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.c14n` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
            return dos.getDigestValue();
        } catch (NoSuchAlgorithmException | TransformException | MarshalException
                | IOException | org.apache.xml.security.c14n.CanonicalizationException e) {
            throw new XMLSignatureException(e);
        } finally { //NOPMD
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
            () -> Boolean.getBoolean("com.sun.org.apache.xml.internal.security.useC14N11"));

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMReference.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMReference.class);

    private final DigestMethod digestMethod;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRSAPSSSignatureMethod.java`
#### Snippet
```java
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.SignatureProvider";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMRSAPSSSignatureMethod.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRSAPSSSignatureMethod.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMRSAPSSSignatureMethod.class);

    private final SignatureMethodParameterSpec params;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary and can be removed
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMX509Data.java`
#### Snippet
```java
     * @param content a list of one or more X.509 data types. Valid types are
     *    {@link String} (subject names), <code>byte[]</code> (subject key ids),
     *    {@link java.security.cert.X509Certificate}, {@link X509CRL},
     *    or {@link javax.xml.crypto.XMLStructure}
     *    objects or elements from an external namespace). The list is
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMX509Data.java`
#### Snippet
```java
     *    {@link String} (subject names), <code>byte[]</code> (subject key ids),
     *    {@link java.security.cert.X509Certificate}, {@link X509CRL},
     *    or {@link javax.xml.crypto.XMLStructure}
     *    objects or elements from an external namespace). The list is
     *    defensively copied to protect against subsequent modification.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
    public static final String CONF_NS = "http://www.xmlsecurity.org/NS/#configuration";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Init.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Init.class);

    /** Field alreadyInitialized */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     */
    public void canonicalize(byte[] inputBytes, OutputStream writer, boolean secureValidation)
        throws XMLParserException, java.io.IOException, CanonicalizationException {
        canonicalizerSpi.engineCanonicalize(inputBytes, writer, secureValidation);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
public class NameSpaceSymbTable {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NameSpaceSymbTable.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(NameSpaceSymbTable.class);

    private static final String XMLNS = "xmlns";
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.interfaces` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
        addReturnToSelf();

        if (pk instanceof java.security.interfaces.DSAPublicKey) {
            DSAKeyValue dsa = new DSAKeyValue(getDocument(), pk);

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.interfaces` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
            appendSelf(dsa);
            addReturnToSelf();
        } else if (pk instanceof java.security.interfaces.RSAPublicKey) {
            RSAKeyValue rsa = new RSAKeyValue(getDocument(), pk);

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.interfaces` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
            appendSelf(rsa);
            addReturnToSelf();
        } else if (pk instanceof java.security.interfaces.ECPublicKey) {
            ECKeyValue ec = new ECKeyValue(getDocument(), pk);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
class XmlAttrStack {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XmlAttrStack.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XmlAttrStack.class);

    private static class XmlsStackElement {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     *
     * @throws XMLSecurityException
     * @see java.security.cert.X509Extension#getExtensionValue(java.lang.String)
     */
    public static byte[] getSKIBytesFromCert(X509Certificate cert)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
public class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLX509SKI.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLX509SKI.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
public class XMLX509IssuerSerial extends SignatureElementProxy implements XMLX509DataContent {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLX509IssuerSerial.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLX509IssuerSerial.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
        try {
            this.addBase64Text(x509certificate.getEncoded());
        } catch (java.security.cert.CertificateEncodingException ex) {
            throw new XMLSecurityException(ex);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
public class X509Data extends SignatureElementProxy implements KeyInfoContent {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509Data.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509Data.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
public class KeyInfo extends SignatureElementProxy {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyInfo.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyInfo.class);

    // We need at least one StorageResolver otherwise
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        List<StorageResolver> list = new ArrayList<>(1);
        list.add(null);
        nullList = java.util.Collections.unmodifiableList(list);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/storage/implementations/KeyStoreResolver.java`
#### Snippet
```java
public class KeyStoreResolver extends StorageResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyStoreResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/storage/implementations/KeyStoreResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyStoreResolver.class);

    /** Field keyStore */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
public class StorageResolver {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(StorageResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(StorageResolver.class);

    /** Field storageResolvers */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
public class X509DigestResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509DigestResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509DigestResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.utils` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * <br>
     * IMPORTANT: This method expects to work on a modified DOM tree, i.e. a DOM which has
     * been prepared using {@link org.apache.xml.security.utils.XMLUtils#circumventBug2650(
     * org.w3c.dom.Document)}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * IMPORTANT: This method expects to work on a modified DOM tree, i.e. a DOM which has
     * been prepared using {@link org.apache.xml.security.utils.XMLUtils#circumventBug2650(
     * org.w3c.dom.Document)}.
     *
     * @param element
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
public class X509CertificateResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509CertificateResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509CertificateResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java
public class SecretKeyResolver extends KeyResolverSpi
{
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecretKeyResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java
{
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SecretKeyResolver.class);

    private final KeyStore keyStore;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
public class KeyResolver {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyResolver.class);

    private static List<KeyResolverSpi> resolverList = new CopyOnWriteArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
public class DEREncodedKeyValueResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DEREncodedKeyValueResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DEREncodedKeyValueResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
public class RSAKeyValueResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RSAKeyValueResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RSAKeyValueResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
public class X509IssuerSerialResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509IssuerSerialResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509IssuerSerialResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
public class X509SKIResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SKIResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SKIResolver.class);


```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
public class EncryptedKeyResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RSAKeyValueResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RSAKeyValueResolver.class);

    private final Key kek;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
public class ECKeyValueResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ECKeyValueResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ECKeyValueResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
public class DSAKeyValueResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DSAKeyValueResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DSAKeyValueResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
public class KeyInfoReferenceResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyInfoReferenceResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(KeyInfoReferenceResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
public class X509SubjectNameResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SubjectNameResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(X509SubjectNameResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    protected javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    public javax.crypto.SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
public class RetrievalMethodResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RetrievalMethodResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(RetrievalMethodResolver.class);

    /** {@inheritDoc} */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.stax.ext` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
 * The order of processors is defined by:
 * <ol>
 *     <li>{@link org.apache.xml.security.stax.ext.XMLSecurityConstants.Phase} (required)</li>
 *     <li>
 *         Action order (optional): allows grouping processors per action without them accidentally being reordered
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
public class PrivateKeyResolver extends KeyResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PrivateKeyResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(PrivateKeyResolver.class);

    private final KeyStore keyStore;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/stax/ext/InboundXMLSec.java`
#### Snippet
```java

        DocumentContextImpl documentContext = new DocumentContextImpl();
        documentContext.setEncoding(xmlStreamReader.getEncoding() != null ? xmlStreamReader.getEncoding() : java.nio.charset.StandardCharsets.UTF_8.name());
        //woodstox 3.2.9 returns null when used with a DOMSource
        Location location = xmlStreamReader.getLocation();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.stax.ext` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
     * @param securityProperties The configuration to validate
     * @return The validated configuration
     * @throws org.apache.xml.security.stax.ext.XMLSecurityConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.stax.ext` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
     * @throws XMLSecurityException
     *          if the initialisation failed
     * @throws org.apache.xml.security.stax.ext.XMLSecurityConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.stax.ext` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
     * @throws XMLSecurityException
     *          if the initialisation failed
     * @throws org.apache.xml.security.stax.ext.XMLSecurityConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.stax.ext` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
     * @param securityProperties The configuration to validate
     * @return The validated configuration
     * @throws org.apache.xml.security.stax.ext.XMLSecurityConfigurationException
     *          if the configuration is invalid
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/stax/impl/util/DigestOutputStream.java`
#### Snippet
```java
        messageDigest.update(arg0, arg1, arg2);
        if (isDebugEnabled) {
            stringBuilder.append(new String(arg0, arg1, arg2, java.nio.charset.StandardCharsets.UTF_8));
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/stax/impl/util/SignerOutputStream.java`
#### Snippet
```java
            signatureAlgorithm.engineUpdate(arg0, arg1, arg2);
            if (isDebugEnabled) {
                stringBuilder.append(new String(arg0, arg1, arg2, java.nio.charset.StandardCharsets.UTF_8));
            }
        } catch (XMLSecurityException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartDocumentImpl.java`
#### Snippet
```java
    @Override
    public String getCharacterEncodingScheme() {
        return characterEncodingScheme != null ? characterEncodingScheme : java.nio.charset.StandardCharsets.UTF_8.name();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java
                xmlEventWriter = new XMLSecurityEventWriter(
                        XMLSecurityConstants.xmlOutputFactoryNonRepairingNs.createXMLStreamWriter(
                                cipherOutputStream, java.nio.charset.StandardCharsets.UTF_8.name()));
                //we have to output a fake element to workaround text-only encryption:
                xmlEventWriter.add(wrapperStartElement);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.exceptions` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/securityToken/SecurityToken.java`
#### Snippet
```java
     *
     * @return The certificate chain
     * @throws org.apache.xml.security.exceptions.XMLSecurityException if the certificates can't be retrieved
     */
    X509Certificate[] getX509Certificates() throws XMLSecurityException;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.exceptions` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/stax/securityToken/SecurityToken.java`
#### Snippet
```java
     * Returns the public key if one exists and already initialized, null otherwise
     * @return the public key
     * @throws org.apache.xml.security.exceptions.XMLSecurityException
     */
    PublicKey getPublicKey() throws XMLSecurityException;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/ClassLoaderUtils.java`
#### Snippet
```java
public final class ClassLoaderUtils {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ClassLoaderUtils.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/ClassLoaderUtils.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ClassLoaderUtils.class);

    private ClassLoaderUtils() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/IgnoreAllErrorHandler.java`
#### Snippet
```java
public class IgnoreAllErrorHandler implements ErrorHandler {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(IgnoreAllErrorHandler.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/IgnoreAllErrorHandler.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(IgnoreAllErrorHandler.class);

    /** Field throwExceptions */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/utils/IgnoreAllErrorHandler.java`
#### Snippet
```java

/**
 * This {@link org.xml.sax.ErrorHandler} does absolutely nothing but LOG
 * the events.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/IgnoreAllErrorHandler.java`
#### Snippet
```java

    private static boolean getProperty(final String name) {
        return java.security.AccessController.doPrivileged(
            (java.security.PrivilegedAction<Boolean>) () -> Boolean.getBoolean(name));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/IgnoreAllErrorHandler.java`
#### Snippet
```java
    private static boolean getProperty(final String name) {
        return java.security.AccessController.doPrivileged(
            (java.security.PrivilegedAction<Boolean>) () -> Boolean.getBoolean(name));
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
public final class JavaUtils {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JavaUtils.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JavaUtils.class);

    private static final SecurityPermission REGISTER_PERMISSION =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java
 */
public class SignerOutputStream extends ByteArrayOutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignerOutputStream.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java
public class SignerOutputStream extends ByteArrayOutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignerOutputStream.class);

    final SignatureAlgorithm sa;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/DigesterOutputStream.java`
#### Snippet
```java
 */
public class DigesterOutputStream extends ByteArrayOutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DigesterOutputStream.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/DigesterOutputStream.java`
#### Snippet
```java
public class DigesterOutputStream extends ByteArrayOutputStream {
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DigesterOutputStream.class);

    final MessageDigestAlgorithm mda;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.utils.resolver` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
/**
 * This Exception is thrown if something related to the
 * {@link org.apache.xml.security.utils.resolver.ResourceResolver} goes wrong.
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
            return MessageFormat.format(resourceBundle.getString(msgID), exArgs);
        } catch (Throwable t) {
            if (org.apache.xml.security.Init.isInitialized()) {
                return "No message with ID \"" + msgID
                + "\" found in resource bundle \""
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
            return resourceBundle.getString(msgID);
        } catch (Throwable t) {
            if (org.apache.xml.security.Init.isInitialized()) {
                return "No message with ID \"" + msgID
                + "\" found in resource bundle \""
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
            return MessageFormat.format(resourceBundle.getString(msgID), exArgs);
        } catch (Throwable t) {
            if (org.apache.xml.security.Init.isInitialized()) {
                return "No message with ID \"" + msgID
                + "\" found in resource bundle \""
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
public class ResolverXPointer extends ResourceResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverXPointer.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverXPointer.class);

    private static final String XP = "#xpointer(id(";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
public class ResourceResolver {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResourceResolver.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResourceResolver.class);

    /** these are the system-wide resolvers */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    (PrivilegedAction<Boolean>) () -> Boolean.getBoolean("org.apache.xml.security.ignoreLineBreaks"));

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(XMLUtils.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(XMLUtils.class);

    private static XMLParser xmlParserImpl =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        try {
            if (addPreamble) {
                os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverLocalFilesystem.java`
#### Snippet
```java
public class ResolverLocalFilesystem extends ResourceResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverLocalFilesystem.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverLocalFilesystem.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverLocalFilesystem.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverFragment.java`
#### Snippet
```java
public class ResolverFragment extends ResourceResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverFragment.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverFragment.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverFragment.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
public abstract class ElementProxy {

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ElementProxy.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java

    protected static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ElementProxy.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/parser/XMLParserImpl.java`
#### Snippet
```java
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setNamespaceAware(true);
        f.setFeature(javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING, true);
        f.setFeature("http://apache.org/xml/features/disallow-doctype-decl", disallowDocTypeDeclarations);
        return f.newDocumentBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
public class ResolverDirectHTTP extends ResourceResolverSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverDirectHTTP.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(ResolverDirectHTTP.class);

    /** Field properties[] */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java

/**
 * Raised if verifying a {@link org.apache.xml.security.signature.Reference} fails
 * because of an uninitialized {@link org.apache.xml.security.signature.XMLSignatureInput}
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
/**
 * Raised if verifying a {@link org.apache.xml.security.signature.Reference} fails
 * because of an uninitialized {@link org.apache.xml.security.signature.XMLSignatureInput}
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java

/**
 * Thrown by {@link org.apache.xml.security.signature.SignedInfo#verify()} when
 * testing the signature fails because of uninitialized
 * {@link org.apache.xml.security.signature.Reference}s.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
 * Thrown by {@link org.apache.xml.security.signature.SignedInfo#verify()} when
 * testing the signature fails because of uninitialized
 * {@link org.apache.xml.security.signature.Reference}s.
 *
 * @see ReferenceNotInitializedException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java

    /**
     * used to set the uninitialized {@link org.apache.xml.security.signature.Reference}
     *
     * @param reference the Reference object
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java

    /**
     * used to get the uninitialized {@link org.apache.xml.security.signature.Reference}
     *
     * This allows to supply the correct {@link org.apache.xml.security.signature.XMLSignatureInput}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * used to get the uninitialized {@link org.apache.xml.security.signature.Reference}
     *
     * This allows to supply the correct {@link org.apache.xml.security.signature.XMLSignatureInput}
     * to the {@link org.apache.xml.security.signature.Reference} to try again verification.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     *
     * This allows to supply the correct {@link org.apache.xml.security.signature.XMLSignatureInput}
     * to the {@link org.apache.xml.security.signature.Reference} to try again verification.
     *
     * @return the Reference object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java

    /**
     * Some InputStreams do not support the {@link java.io.InputStream#reset}
     * method, so we read it in completely and work on our Proxy.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
public class SignatureAlgorithm extends Algorithm {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureAlgorithm.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureAlgorithm.class);

    /** All available algorithm classes are registered here */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.spec` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#digest()}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#digest()}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#digest()} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#digest()} method
     */
    public byte[] digest() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#isEqual}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#isEqual}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param digesta
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param digesta
     * @param digestb
     * @return the result of the {@link java.security.MessageDigest#isEqual} method
     */
    public static boolean isEqual(byte[] digesta, byte[] digestb) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param offset
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
     * @throws java.security.DigestException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @throws java.security.DigestException
     */
    public int digest(byte[] buf, int offset, int len) throws java.security.DigestException {
        return algorithm.digest(buf, offset, len);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
        Constants.XML_DSIG_NS_MORE_07_05 + "sha3-512";

    /** Field algorithm stores the actual {@link java.security.MessageDigest} */
    private final MessageDigest algorithm;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#getProvider}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#getProvider}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getProvider} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getProvider} method
     */
    public java.security.Provider getJCEProvider() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @return the result of the {@link java.security.MessageDigest#getProvider} method
     */
    public java.security.Provider getJCEProvider() {
        return algorithm.getProvider();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Returns the actual {@link java.security.MessageDigest} algorithm object
     *
     * @return the actual {@link java.security.MessageDigest} algorithm object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * Returns the actual {@link java.security.MessageDigest} algorithm object
     *
     * @return the actual {@link java.security.MessageDigest} algorithm object
     */
    public MessageDigest getAlgorithm() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#getDigestLength}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#getDigestLength}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getDigestLength} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getDigestLength} method
     */
    public int getDigestLength() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#getAlgorithm}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#getAlgorithm}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getAlgorithm} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getAlgorithm} method
     */
    public String getJCEAlgorithmString() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     *
     * @param input
     * @return the result of the {@link java.security.MessageDigest#digest(byte[])} method
     */
    public byte[] digest(byte[] input) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.MessageDigest#reset}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java

    /**
     * Normalizes a {@link org.w3c.dom.Comment} value
     *
     * @param currentPI
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.MessageDigest#reset}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link org.apache.xml.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * (throws a {@link org.apache.xml.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify()
     * @see org.apache.xml.security.signature.MissingResourceFailureException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify()
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify()
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
    public static final int MAXIMUM_REFERENCE_COUNT = 30;

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Manifest.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Manifest.class);

    private static Integer referenceCount =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link org.apache.xml.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * (throws a {@link org.apache.xml.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify(boolean)
     * @see org.apache.xml.security.signature.MissingResourceFailureException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * because of an uninitialized {@link XMLSignatureInput}
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify(boolean)
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @see org.apache.xml.security.signature.Reference#verify
     * @see org.apache.xml.security.signature.SignedInfo#verify(boolean)
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
    /**
     * This <code>addDocument</code> method is used to add a new resource to the
     * signed info. A {@link org.apache.xml.security.signature.Reference} is built
     * from the supplied values.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
     */
    protected abstract String engineGetJCEAlgorithmString();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.spec` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
public abstract class SignatureEDDSA extends SignatureAlgorithmSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureEDDSA.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureEDDSA.class);

    private final Signature signatureAlgorithm;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
public class JCEMapper {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JCEMapper.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(JCEMapper.class);

    private static Map<String, Algorithm> algorithmsMap = new ConcurrentHashMap<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.encryption` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/encryption/Transforms.java`
#### Snippet
```java
 * </pre>
 *
 * @see org.apache.xml.security.encryption.CipherReference
 */
public interface Transforms {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.spec` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
        try {
            this.macAlgorithm = (provider == null) ? Mac.getInstance(algorithmID) : Mac.getInstance(algorithmID, provider);
        } catch (java.security.NoSuchAlgorithmException ex) {
            Object[] exArgs = { algorithmID, ex.getLocalizedMessage() };

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
public abstract class IntegrityHmac extends SignatureAlgorithmSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(IntegrityHmac.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(IntegrityHmac.class);

    /** Field macAlgorithm */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
    public static final String URI = Constants.SignatureSpecNS + "dsa-sha1";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureDSA.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureDSA.class);

    /** Field algorithm */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * if the Signatures match on the SignedInfo.
     *
     * @param pk {@link java.security.PublicKey} part of the keypair or
     * {@link javax.crypto.SecretKey} that was used to sign
     * @return true if the signature is valid, false otherwise
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     *
     * @param pk {@link java.security.PublicKey} part of the keypair or
     * {@link javax.crypto.SecretKey} that was used to sign
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
            Constants.XML_DSIG_NS_MORE_07_05 + "rsa-pss";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLSignature.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLSignature.class);

    /** ds:Signature.ds:SignedInfo element */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     *
     * @param signingKey the {@link java.security.PrivateKey} or
     * {@link javax.crypto.SecretKey} that is used to sign.
     * @throws XMLSignatureException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * Proxy method for {@link SignedInfo#createSecretKey(byte[])}. If you want
     * to create a MAC, this method helps you to obtain the
     * {@link javax.crypto.SecretKey} from octets.
     *
     * @param secretKeyBytes
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
public abstract class SignatureECDSA extends SignatureAlgorithmSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureECDSA.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureECDSA.class);

    private final Signature signatureAlgorithm;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
            () -> Boolean.getBoolean("org.apache.xml.security.useC14N11"));

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Reference.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Reference.class);

    private Manifest manifest;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
 * This includes:
 *
 * Construct a <CODE>ds:Reference</CODE> from an {@link org.w3c.dom.Element}.
 *
 * <p>Create a new reference</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
public abstract class SignatureBaseRSA extends SignatureAlgorithmSpi {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureBaseRSA.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(SignatureBaseRSA.class);

    /** Field algorithm */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipherUtil.java`
#### Snippet
```java
public final class XMLCipherUtil {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipherUtil.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipherUtil.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipherUtil.class);

    private static final boolean gcmUseIvParameterSpec =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
public class XMLCipherInput {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipherInput.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipherInput.class);

    /** The data we are working with */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
        = "http://www.w3.org/2002/06/xmldsig-filter2";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Transforms.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Transforms.class);

    private Element[] transformsElement;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.transforms` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java

/**
 * Holder of the {@link org.apache.xml.security.transforms.Transform} steps to
 * be performed on the data.
 * The input to the first Transform is the result of dereferencing the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java

        /**
         * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
        public int isNodeInclude(Node currentNode) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java

        /**
         * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
        public int isNodeInclude(Node currentNode) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
public class TransformXPath extends TransformSpi {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransformXPath.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransformXPath.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java

        /**
         * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
        public int isNodeInclude(Node n) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java

        /**
         * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
        public int isNodeInclude(Node n) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
public final class Transform extends SignatureElementProxy {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Transform.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(Transform.class);

    /** All available Transform classes are registered here */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXSLT.java`
#### Snippet
```java
    static final String XSLTSTYLESHEET = "stylesheet";

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(TransformXSLT.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXSLT.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(TransformXSLT.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.xml.security.signature` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java

    /**
     * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
     */
    public int isNodeInclude(Node currentNode) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java

    /**
     * @see org.apache.xml.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
     */
    public int isNodeInclude(Node currentNode) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @throws XMLEncryptionException
     * @return the XMLCipher
     * @see javax.crypto.Cipher#getInstance(java.lang.String)
     */
    public static XMLCipher getInstance(String transformation) throws XMLEncryptionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @throws XMLEncryptionException
     * @return the XMLCipher
     * @see javax.crypto.Cipher#getInstance(java.lang.String)
     */
    public static XMLCipher getInstance(String transformation) throws XMLEncryptionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
public class XMLCipher {

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipher.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(XMLCipher.class);

    /** Triple DES EDE (192 bit key) in CBC mode */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *   following: ENCRYPT_MODE, DECRYPT_MODE, WRAP_MODE or UNWRAP_MODE)
     * @param key
     * @see javax.crypto.Cipher#init(int, java.security.Key)
     * @throws XMLEncryptionException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *   following: ENCRYPT_MODE, DECRYPT_MODE, WRAP_MODE or UNWRAP_MODE)
     * @param key
     * @see javax.crypto.Cipher#init(int, java.security.Key)
     * @throws XMLEncryptionException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.transform.dom` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        try {
            final javax.xml.transform.dom.DOMResult domResult = new javax.xml.transform.dom.DOMResult();
            final javax.xml.transform.TransformerFactory transformerFactory =
                    javax.xml.transform.TransformerFactory.newInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.transform.dom` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        try {
            final javax.xml.transform.dom.DOMResult domResult = new javax.xml.transform.dom.DOMResult();
            final javax.xml.transform.TransformerFactory transformerFactory =
                    javax.xml.transform.TransformerFactory.newInstance();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.transform` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        try {
            final javax.xml.transform.dom.DOMResult domResult = new javax.xml.transform.dom.DOMResult();
            final javax.xml.transform.TransformerFactory transformerFactory =
                    javax.xml.transform.TransformerFactory.newInstance();
            transformerFactory.newTransformer().transform(
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.transform` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            final javax.xml.transform.dom.DOMResult domResult = new javax.xml.transform.dom.DOMResult();
            final javax.xml.transform.TransformerFactory transformerFactory =
                    javax.xml.transform.TransformerFactory.newInstance();
            transformerFactory.newTransformer().transform(
                    new javax.xml.transform.stream.StreamSource(
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.transform.stream` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
                    javax.xml.transform.TransformerFactory.newInstance();
            transformerFactory.newTransformer().transform(
                    new javax.xml.transform.stream.StreamSource(
                            new java.io.ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))), domResult);

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            transformerFactory.newTransformer().transform(
                    new javax.xml.transform.stream.StreamSource(
                            new java.io.ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))), domResult);

            boolean result = false;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DOMKeyValue()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
    private final K publicKey;

    public DOMKeyValue(K key) throws KeyException {
        if (key == null) {
            throw new NullPointerException("key cannot be null");
```

### NonProtectedConstructorInAbstractClass
Constructor `DOMKeyValue()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
     * @param kvtElem a KeyValue child element
     */
    public DOMKeyValue(Element kvtElem) throws MarshalException {
        this.publicKey = unmarshalKeyValue(kvtElem);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Canonicalizer20010315Excl()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     * @param includeComments
     */
    public Canonicalizer20010315Excl(boolean includeComments) {
        super(includeComments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Canonicalizer20010315()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param includeComments
     */
    public Canonicalizer20010315(boolean includeComments) {
        this(includeComments, false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Canonicalizer20010315()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param c14n11 Whether this is a Canonical XML 1.1 implementation or not
     */
    public Canonicalizer20010315(boolean includeComments, boolean c14n11) {
        super(includeComments);
        xmlattrStack = new XmlAttrStack(c14n11);
```

### NonProtectedConstructorInAbstractClass
Constructor `ComparableType()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/ext/ComparableType.java`
#### Snippet
```java
    private String name;

    public ComparableType(String name) {
        this.name = name;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/ext/AbstractInputProcessor.java`
#### Snippet
```java
    private Set<Object> afterProcessors;

    public AbstractInputProcessor(XMLSecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSignatureReferenceVerifyInputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
    private final List<ReferenceType> processedReferences;

    public AbstractSignatureReferenceVerifyInputProcessor(
            InputProcessorChain inputProcessorChain,
            SignatureType signatureType, InboundSecurityToken inboundSecurityToken,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEncryptEndingOutputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptEndingOutputProcessor.java`
#### Snippet
```java
public abstract class AbstractEncryptEndingOutputProcessor extends AbstractBufferingOutputProcessor {

    public AbstractEncryptEndingOutputProcessor() throws XMLSecurityException {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureVerifier()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
        private Transformer transformer;

        public SignatureVerifier(SignatureType signatureType, InboundSecurityContext inboundSecurityContext,
                                 XMLSecurityProperties securityProperties) throws XMLSecurityException {
            this.signatureType = signatureType;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSignatureOutputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java
    private InternalSignatureOutputProcessor activeInternalSignatureOutputProcessor;

    public AbstractSignatureOutputProcessor() throws XMLSecurityException {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDecryptInputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
    private final ArrayDeque<XMLSecEvent> tmpXmlEventList = new ArrayDeque<>();

    public AbstractDecryptInputProcessor(XMLSecurityProperties securityProperties) throws XMLSecurityException {
        super(securityProperties);
        keyInfoType = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDecryptedEventReaderInputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        private Thread decryptionThread;

        public AbstractDecryptedEventReaderInputProcessor(
                XMLSecurityProperties securityProperties, SecurePart.Modifier encryptionModifier,
                boolean encryptedHeader, XMLSecStartElement xmlSecStartElement,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDecryptInputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
    }

    public AbstractDecryptInputProcessor(KeyInfoType keyInfoType, ReferenceList referenceList,
                                         XMLSecurityProperties securityProperties) throws XMLSecurityException {
        super(securityProperties);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInternalEncryptionOutputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java
        private int elementCounter;

        public AbstractInternalEncryptionOutputProcessor(EncryptionPartDef encryptionPartDef,
                                                         XMLSecStartElement xmlSecStartElement, String encoding)
                throws XMLSecurityException {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEncryptOutputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor.java`
#### Snippet
```java
    private AbstractInternalEncryptionOutputProcessor activeInternalEncryptionOutputProcessor;

    public AbstractEncryptOutputProcessor() throws XMLSecurityException {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Canonicalizer20010315()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315.java`
#### Snippet
```java
public abstract class Canonicalizer20010315 extends CanonicalizerBase {

    public Canonicalizer20010315(boolean includeComments) {
        super(includeComments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSignatureEndingOutputProcessor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
    private List<SignaturePartDef> signaturePartDefList;

    public AbstractSignatureEndingOutputProcessor(AbstractSignatureOutputProcessor signatureOutputProcessor)
            throws XMLSecurityException {
        super();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSecurityToken()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractSecurityToken.java`
#### Snippet
```java
    protected final List<SecurityTokenConstants.TokenUsage> tokenUsages = new ArrayList<>();

    public AbstractSecurityToken(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("No id specified");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInboundSecurityToken()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    private boolean includedInMessage = false;

    public AbstractInboundSecurityToken(
            InboundSecurityContext inboundSecurityContext, String id,
            SecurityTokenConstants.KeyIdentifier keyIdentifier, boolean includedInMessage) {
```

### NonProtectedConstructorInAbstractClass
Constructor `Canonicalizer20010315_Excl()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
    protected boolean propagateDefaultNamespace = false;

    public Canonicalizer20010315_Excl(boolean includeComments) {
        super(includeComments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TokenSecurityEvent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/securityEvent/TokenSecurityEvent.java`
#### Snippet
```java
    private T securityToken;

    public TokenSecurityEvent(Event securityEventType) {
        super(securityEventType);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractElementSecurityEvent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/securityEvent/AbstractElementSecurityEvent.java`
#### Snippet
```java
    private XMLSecEvent xmlSecEvent;

    public AbstractElementSecurityEvent(SecurityEventConstants.Event securityEventType) {
        super(securityEventType);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CanonicalizerBase()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
    protected boolean firstCall = true;

    public CanonicalizerBase(boolean includeComments) {
        this.includeComments = includeComments;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSecuredElementSecurityEvent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/securityEvent/AbstractSecuredElementSecurityEvent.java`
#### Snippet
```java
    private List<XMLSecurityConstants.ContentType> protectionOrder;

    public AbstractSecuredElementSecurityEvent(
            SecurityEventConstants.Event securityEventType, SecurityToken securityToken,
            List<XMLSecurityConstants.ContentType> protectionOrder) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSecuredElementSecurityEvent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/stax/securityEvent/AbstractSecuredElementSecurityEvent.java`
#### Snippet
```java
    }

    public AbstractSecuredElementSecurityEvent(
            SecurityEventConstants.Event securityEventType, SecurityToken securityToken,
            List<XMLSecurityConstants.ContentType> protectionOrder, boolean signed, boolean encrypted) {
```

### NonProtectedConstructorInAbstractClass
Constructor `Signature11ElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     * @throws XMLSecurityException
     */
    public Signature11ElementProxy(Element element, String baseURI) throws XMLSecurityException {
        super(element, baseURI);

```

### NonProtectedConstructorInAbstractClass
Constructor `Signature11ElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     * @param doc
     */
    public Signature11ElementProxy(Document doc) {
        if (doc == null) {
            throw new RuntimeException("Document is null");
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     * @param doc
     */
    public SignatureElementProxy(Document doc) {
        if (doc == null) {
            throw new RuntimeException("Document is null");
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     * @throws XMLSecurityException
     */
    public SignatureElementProxy(Element element, String baseURI) throws XMLSecurityException {
        super(element, baseURI);

```

### NonProtectedConstructorInAbstractClass
Constructor `ElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     */
    public ElementProxy() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `ElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param doc
     */
    public ElementProxy(Document doc) {
        if (doc == null) {
            throw new RuntimeException("Document is null");
```

### NonProtectedConstructorInAbstractClass
Constructor `ElementProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @throws XMLSecurityException
     */
    public ElementProxy(Element element, String baseURI) throws XMLSecurityException {
        if (element == null) {
            throw new XMLSecurityException("ElementProxy.nullElement");
```

### NonProtectedConstructorInAbstractClass
Constructor `Algorithm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
     * @throws XMLSecurityException
     */
    public Algorithm(Element element, String baseURI) throws XMLSecurityException {
        super(element, baseURI);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Algorithm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
     * @param algorithmURI is the URI of the algorithm as String
     */
    public Algorithm(Document doc, String algorithmURI) {
        super(doc);
        this.setAlgorithmURI(algorithmURI);
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureEDDSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
    }

    public SignatureEDDSA(Provider provider) throws XMLSignatureException {
        String algorithmID = JCEMapper.translateURItoJCEID(this.engineGetURI());
        LOG.debug("Created SignatureEDDSA using {}", algorithmID);
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureEDDSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
     * @throws XMLSignatureException
     */
    public SignatureEDDSA() throws XMLSignatureException {
        this(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `IntegrityHmac()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
    }

    public IntegrityHmac(Provider provider) throws XMLSignatureException {
        String algorithmID = JCEMapper.translateURItoJCEID(this.engineGetURI());
        LOG.debug("Created IntegrityHmacSHA1 using {}", algorithmID);
```

### NonProtectedConstructorInAbstractClass
Constructor `IntegrityHmac()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @throws XMLSignatureException
     */
    public IntegrityHmac() throws XMLSignatureException {
        this(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureECDSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
    }

    public SignatureECDSA(Provider provider) throws XMLSignatureException {
        String algorithmID = JCEMapper.translateURItoJCEID(this.engineGetURI());
        LOG.debug("Created SignatureECDSA using {}", algorithmID);
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureECDSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * @throws XMLSignatureException
     */
    public SignatureECDSA() throws XMLSignatureException {
        this(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureBaseRSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
     * @throws XMLSignatureException
     */
    public SignatureBaseRSA() throws XMLSignatureException {
        this(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SignatureBaseRSA()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
    }

    public SignatureBaseRSA(Provider provider) throws XMLSignatureException {
        String algorithmID = JCEMapper.translateURItoJCEID(this.engineGetURI());
        LOG.debug("Created SignatureRSA using {}", algorithmID);
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new NodeSetData() can be replaced with method reference
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                try {
                    final Set<Node> s = xsi.getNodeSet();
                    return new NodeSetData() {
                        public Iterator<Node> iterator() { return s.iterator(); }
                    };
```

### Anonymous2MethodRef
Anonymous new PrivilegedAction() can be replaced with method reference
in `src/main/java/org/apache/xml/security/parser/XMLParserImpl.java`
#### Snippet
```java
        final SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
                public ClassLoader run() {
                    return clazz.getClassLoader();
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
                LOG.debug(ex.getMessage(), ex);
                // Impossible...
            } catch (XMLSecurityException ex) {
                throw ex;
            }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRSAPSSSignatureMethod.java`
#### Snippet
```java
        }
        if (params == null) {
            params = getDefaultParameterSpec();
        }
        checkParams((SignatureMethodParameterSpec)params);
```

### AssignmentToMethodParameter
Assignment to method parameter `baseURI`
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
        if (baseURI != null) {
            if (baseURI.endsWith("..")) {
                baseURI = baseURI + "/";
            }
            URI base = new URI(baseURI);
```

### AssignmentToMethodParameter
Assignment to method parameter `currentNode`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
                        nextSibling = nextSibling.getNextSibling()) {
                        outputTextToWriter(nextSibling.getNodeValue(), writer);
                        currentNode = nextSibling;
                        sibling = currentNode.getNextSibling();
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `currentNode`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
                return;
            }
            currentNode = sibling;
            sibling = currentNode.getNextSibling();
        } while(true);
```

### AssignmentToMethodParameter
Assignment to method parameter `documentLevel`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java

            case Node.ELEMENT_NODE :
                documentLevel = NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT;
                if (currentNode == excludeNode) {
                    break;
```

### AssignmentToMethodParameter
Assignment to method parameter `documentLevel`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
                parentNode = parentNode.getParentNode();
                if (parentNode == null || Node.ELEMENT_NODE != parentNode.getNodeType()) {
                    documentLevel = NODE_AFTER_DOCUMENT_ELEMENT;
                    parentNode = null;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `currentNode`
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
                return;
            }
            currentNode = sibling;
            sibling = currentNode.getNextSibling();
        } while(true);
```

### AssignmentToMethodParameter
Assignment to method parameter `requestSecurityEvents`
in `src/main/java/org/apache/xml/security/stax/ext/InboundXMLSec.java`
#### Snippet
```java

        if (requestSecurityEvents == null) {
            requestSecurityEvents = Collections.emptyList();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `securityProperties`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
        }

        securityProperties = validateAndApplyDefaultsToInboundSecurityProperties(securityProperties);
        return new InboundXMLSec(securityProperties);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `securityProperties`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSec.java`
#### Snippet
```java
        }

        securityProperties = validateAndApplyDefaultsToOutboundSecurityProperties(securityProperties);
        return new OutboundXMLSec(securityProperties);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/xml/security/stax/impl/util/TrimmerOutputStream.java`
#### Snippet
```java
                return;
            }
            len -= missingBytes;
            off += missingBytes;
            preTrimmed += missingBytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/xml/security/stax/impl/util/TrimmerOutputStream.java`
#### Snippet
```java
            }
            len -= missingBytes;
            off += missingBytes;
            preTrimmed += missingBytes;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSecEvent`
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLSignatureOutputProcessor.java`
#### Snippet
```java
                                List<XMLSecAttribute> attributeList = new ArrayList<>(1);
                                attributeList.add(createAttribute(securityProperties.getIdAttributeNS(), signaturePartDef.getSigRefId()));
                                xmlSecEvent = addAttributes(xmlSecStartElement, attributeList);
                            }
                        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
        } else {
            iterator = reparseSignedInfo(inputProcessorChain, securityProperties, signatureType, eventDeque, index).descendingIterator();
            index = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSecEvent`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
            subInputProcessorChain.reset();
            if (isSecurityHeaderEvent) {
                xmlSecEvent = subInputProcessorChain.processHeaderEvent();
            } else {
                xmlSecEvent = subInputProcessorChain.processEvent();
```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSecEvent`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
                xmlSecEvent = subInputProcessorChain.processHeaderEvent();
            } else {
                xmlSecEvent = subInputProcessorChain.processEvent();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `src/main/java/org/apache/xml/security/stax/config/Init.java`
#### Snippet
```java
                        throw new XMLSecurityConfigurationException("empty", "security-config.xml not found in classpath");
                    }
                    uri = resource.toURI();
                }
                saxParser.parse(uri.toURL().toExternalForm(), new XIncludeHandler(unmarshallerHandler));
```

### AssignmentToMethodParameter
Assignment to method parameter `namespaceURI`
in `src/main/java/org/apache/xml/security/utils/DOMNamespaceContext.java`
#### Snippet
```java
        }
        if (namespaceURI.equals(NULL_NS_URI)) {
            namespaceURI = null;
        }
        if (context != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/xml/security/utils/DOMNamespaceContext.java`
#### Snippet
```java
        }
        if (prefix.equals(DEFAULT_NS_PREFIX)) {
            prefix = null;
        }
        if (context != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bitlen`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

        //round bitlen
        bitlen = ((bitlen + 7) >> 3) << 3;

        if (bitlen < big.bitLength()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `sibling`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                list.add((Element)sibling);
            }
            sibling = sibling.getNextSibling();
        }
        return list.toArray(new Element[list.size()]);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            }

            node = sibling;
            sibling = node.getNextSibling();
        } while (true);
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    return (Element)sibling;
                }
                number--;
            }
            sibling = sibling.getNextSibling();
```

### AssignmentToMethodParameter
Assignment to method parameter `sibling`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                number--;
            }
            sibling = sibling.getNextSibling();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    return (Element)sibling;
                }
                number--;
            }
            sibling = sibling.getNextSibling();
```

### AssignmentToMethodParameter
Assignment to method parameter `sibling`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                number--;
            }
            sibling = sibling.getNextSibling();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    return (Element)sibling;
                }
                number--;
            }
            sibling = sibling.getNextSibling();
```

### AssignmentToMethodParameter
Assignment to method parameter `sibling`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                number--;
            }
            sibling = sibling.getNextSibling();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                    return (Element)sibling;
                }
                number--;
            }
            sibling = sibling.getNextSibling();
```

### AssignmentToMethodParameter
Assignment to method parameter `sibling`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                number--;
            }
            sibling = sibling.getNextSibling();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `startNode`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bitlen`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //round bitlen
        bitlen = ((bitlen + 7) >> 3) << 3;

        if (bitlen < big.bitLength()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        // remove white spaces
        if (len == -1) {
            len = removeWhiteSpace(base64Data);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        // remove white spaces
        if (len == -1) {
            len = removeWhiteSpace(base64Data);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    public static final String  encode(byte[] binaryData, int length) {
        if (length < 4) {
            length = Integer.MAX_VALUE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bitlen`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        //round bitlen
        bitlen = ((bitlen + 7) >> 3) << 3;

        if (bitlen < big.bitLength()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `rawLen`
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java

        if (rawLen < 0) {
            rawLen = maxLen;
        } else if (rawLen < maxLen) {
            throw new IOException("Invalid signature length");
```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSignatureInput`
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
                LOG.debug("Perform the ({})th {} transform", i, t.getURI());
                checkSecureValidation(t);
                xmlSignatureInput = t.performTransform(xmlSignatureInput, secureValidation);
            }
            if (last >= 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `xmlSignatureInput`
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
                LOG.debug("Perform the ({})th {} transform", last, t.getURI());
                checkSecureValidation(t);
                xmlSignatureInput = t.performTransform(xmlSignatureInput, os, secureValidation);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `signatureElement`
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java
            }

            signatureElement = signatureElement.getParentNode();
        }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
            elem.setIdAttributeNode(attr, true);
        }
        return (attr == null) ? null : attr.getValue();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
                (nsURI, context.getDefaultNamespacePrefix());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
    public static String getAttributeValue(Element elem, String name) {
        Attr attr = elem.getAttributeNodeNS(null, name);
        return (attr == null) ? null : attr.getValue();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/Utils.java`
#### Snippet
```java
    public static String parseIdFromSameDocumentURI(String uri) {
        if (uri.length() == 0) {
            return null;
        }
        String id = uri.substring(1);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/DigesterOutputStream.java`
#### Snippet
```java
            return new ByteArrayInputStream(bos.toByteArray());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMPGPData.java`
#### Snippet
```java

    public byte[] getKeyId() {
        return keyId == null ? null : keyId.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMPGPData.java`
#### Snippet
```java

    public byte[] getKeyPacket() {
        return keyPacket == null ? null : keyPacket.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRetrievalMethod.java`
#### Snippet
```java
                return new DOMX509Data(kiElem);
            } else {
                return null; // unsupported
            }
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
            return ((ByteArrayOutputStream)outputStream).toByteArray();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java

        public byte[] getValue() {
            return (value == null) ? null : value.clone();
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheTransform.java`
#### Snippet
```java
                in = transform.performTransform(in, os, secVal);
                if (!in.isNodeSet() && !in.isElement()) {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
        } catch (InvalidKeySpecException e) {
            //@@@ should dump exception to LOG
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
        PublicKey unmarshalKeyValue(Element kvElem) throws MarshalException {
            externalPublicKey = new javax.xml.crypto.dom.DOMStructure(kvElem);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
                return SECP521R1;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
                match = SECP521R1;
            } else {
                return null;
            }
            return match.getObjectId();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java

    public byte[] getCalculatedDigestValue() {
        return calcDigestValue == null ? null
                                        : calcDigestValue.clone();
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java

    public byte[] getDigestValue() {
        return digestValue == null ? null : digestValue.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    // LOG a warning
                    LOG.warn("cannot cache dereferenced data: " + e);
                    return null;
                }
            } else if (xsi.isElement()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    // LOG a warning
                    LOG.warn("cannot cache dereferenced data: " + ioe);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            System.getProperty("org.apache.xml.security.resource.config");
                        if (cfile == null) {
                            return null;
                        }
                        return ClassLoaderUtils.getResourceAsStream(cfile, Init.class);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        NameSpaceSymbEntry entry = symb.get(prefix);
        if (entry == null) {
            return null;
        }
        if (entry.rendered) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        }
        if (entry.rendered) {
            return null;
        }
        return entry.n;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        if (entry == null) {
            //There is no definition for the prefix(a bug?).
            return null;
        }
        if (entry.rendered) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        if (entry.rendered) {
            //No need to render an entry already rendered.
            return null;
        }
        // Mark this entry as render.
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
            return (NameSpaceSymbEntry)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
                return ob.n;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        if (ob != null && ob.lastrendered != null && ob.lastrendered.equals(uri)) {
            ne.rendered = true;
            return null;
        }
        return ne.n;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
            }

            return null;
        } catch (XMLSignatureException ex) {
            throw new XMLSecurityException(ex);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new KeyValue(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new KeyName(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new KeyInfoReference(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509SubjectName(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509SKI(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509CRL(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
    public Element itemUnknownElement(int i) {
        LOG.debug("itemUnknownElement not implemented: {}", i);
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509Digest(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509Certificate(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
            return new XMLX509IssuerSerial(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        LOG.debug("I couldn't find a private key using the system-wide key resolvers");

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new X509Data(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return cipher.loadEncryptedKey(e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new MgmtData(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        LOG.debug("I couldn't find a X509Certificate using the system-wide key resolvers");

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        LOG.debug("I couldn't find a key using the system-wide key resolvers");

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            currentChild = currentChild.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new PGPData(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new DEREncodedKeyValue(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new SPKIData(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        LOG.debug("I couldn't find a secret key using the system-wide key resolvers");

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            return new RetrievalMethod(e, this.baseURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
    ) throws KeyResolverException {
        if (!engineCanResolve(element, baseURI, storage)) {
            return null;
        }
        return engineResolveSecretKey(element, baseURI, storage, secureValidation);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
    ) throws KeyResolverException {
        if (!engineCanResolve(element, baseURI, storage)) {
            return null;
        }
        return engineResolveX509Certificate(element, baseURI, storage, secureValidation);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
    ) throws KeyResolverException {
        if (!engineCanResolve(element, baseURI, storage)) {
            return null;
        }
        return engineResolvePublicKey(element, baseURI, storage, secureValidation);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
    ) throws KeyResolverException {
        if (!engineCanResolve(element, baseURI, storage)) {
            return null;
        }
        return engineResolvePrivateKey(element, baseURI, storage, secureValidation);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
    protected SecretKey engineResolveSecretKey(Element element, String baseURI, StorageResolver storage, boolean secureValidation)
        throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java

        if (x509childNodes == null || x509childNodes.length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
                    return engineResolveX509Certificate(el, baseURI, storage, secureValidation);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
                }
            }
            return null;
        } catch (XMLSecurityException ex) {
            LOG.debug("Security Exception", ex);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509CertificateResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java

        LOG.debug("I can't");
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SecretKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
            return SECP521R1;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
            match = SECP521R1;
        } else {
            return null;
        }
        return match.getObjectId();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
    public PrivateKey engineLookupAndResolvePrivateKey(Element element, String baseURI, StorageResolver storage, boolean secureValidation)
        throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
    protected SecretKey engineResolveSecretKey(Element element, String baseURI, StorageResolver storage, boolean secureValidation)
        throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DEREncodedKeyValueResolver.java`
#### Snippet
```java
    protected X509Certificate engineResolveX509Certificate(Element element, String baseURI, StorageResolver storage, boolean secureValidation)
        throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
            x509data = new X509Data(element, baseURI);
        } catch (XMLSecurityException ex) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java

        if (!x509data.containsIssuerSerial()) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
            }

            return null;
        } catch (XMLSecurityException ex) {
            LOG.debug("XMLSecurityException", ex);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509IssuerSerialResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
    ) {
        if (element == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java

        if (rsaKeyElement == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RSAKeyValueResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SKI);
        if (!(x509childNodes != null && x509childNodes.length > 0)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
    ) {
        if (element == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
    ) {
        if (element == null) {
            return null;
        }
        Element ecKeyElement = null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java

        if (ecKeyElement == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/ECKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.debug("XMLSecurityException", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        if (referentElement == null) {
            LOG.debug("De-reference of KeyInfoReference URI returned null: {}", uriAttr.getValue());
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        } else if (resource.isNodeSet()) {
            LOG.debug("De-reference of KeyInfoReference returned an unsupported NodeSet");
            return null;
        } else {
            // Retrieved resource is a byte stream
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
    ) {
        if (element == null) {
            return null;
        }
        Element dsaKeyElement = null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java

        if (dsaKeyElement == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SUBJECTNAME);
        if (!(x509childNodes != null && x509childNodes.length > 0)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
            }

            return null;
        } catch (XMLSecurityException ex) {
            LOG.debug("XMLSecurityException", ex);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SubjectNameResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
            return KeyResolver.getPublicKey(e, baseURI, storage, secureValidation);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                        LOG.debug(error);
                    }
                    return null;
                }
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                if (e2 == element) {
                    LOG.debug("Error: Can't have RetrievalMethods pointing to each other");
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
            LOG.debug("IOException", ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                    return cert.getPublicKey();
                }
                return null;
            }
            Element e = obtainReferenceElement(resource, secureValidation);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                        LOG.debug(error);
                    }
                    return null;
                }
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
                if (e2 == element) {
                    LOG.debug("Error: Can't have RetrievalMethods pointing to each other");
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
             LOG.debug("IOException", ex);
         }
         return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
            return KeyResolver.getX509Certificate(e, baseURI, storage, secureValidation);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        Element element, String baseURI, StorageResolver storage, boolean secureValidation
    ) throws KeyResolverException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
    public SecurityTokenConstants.KeyIdentifier getSignatureKeyIdentifier() {
        if (signatureKeyIdentifiers.isEmpty()) {
            return null;
        }
        return signatureKeyIdentifiers.get(0);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
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
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
                return parentNamespaceContext.getPrefix(namespaceURI);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
                return parentNamespaceContext.getNamespaceURI(prefix);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityEventReader.java`
#### Snippet
```java
            return this.xmlSecEvent;
        } catch (NoSuchElementException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEventBaseImpl.java`
#### Snippet
```java
        @Override
        public String getSystemId() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEventBaseImpl.java`
#### Snippet
```java
    public XMLSecStartElement getStartElementAtLevel(int level) {
        if (getDocumentLevel() < level) {
            return null;
        }
        return parentXMLSecStartELement.getStartElementAtLevel(level);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEventBaseImpl.java`
#### Snippet
```java
        @Override
        public String getPublicId() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEventBaseImpl.java`
#### Snippet
```java
    @Override
    public QName getSchemaType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            return attribute.getValue();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            return true;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            @Override
            public String getPublicId() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
                    return xmlSecStartElement.getNamespaceURI(prefix);
                }
                return null;
            default:
                throw new IllegalStateException(ERR_STATE_NOT_ELEM);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
            @Override
            public String getSystemId() {
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecDTDImpl.java`
#### Snippet
```java
    @Override
    public Object getProcessedDTD() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    @Override
    public String getNotationName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    @Override
    public String getReplacementText() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    @Override
    public String getSystemId() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    @Override
    public String getBaseURI() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    @Override
    public String getPublicId() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
                    return parentXMLSecStartELement.getNamespaceContext().getPrefix(namespaceURI);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
                    return parentXMLSecStartELement.getNamespaceURI(prefix);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
        int thisLevel = getDocumentLevel();
        if (thisLevel < level) {
            return null;
        } else if (thisLevel == level) {
            return this;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
            return parentXMLSecStartELement.getNamespaceURI(prefix);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
    public XMLSecEvent processHeaderEvent(InputProcessorChain inputProcessorChain)
            throws XMLStreamException, XMLSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
        public XMLSecEvent processHeaderEvent(InputProcessorChain inputProcessorChain)
                throws XMLStreamException, XMLSecurityException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor.java`
#### Snippet
```java
        public XMLSecEvent processHeaderEvent(InputProcessorChain inputProcessorChain)
                throws XMLStreamException, XMLSecurityException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory.java`
#### Snippet
```java
            return new PKISignatureAlgorithm(jceName, jceProvider);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
            return this.references.get(refId.getValue());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java
            });
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken.java`
#### Snippet
```java
    public KeyIdentifier getKeyIdentifier() {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken.java`
#### Snippet
```java
    public Key getSecretKey(String algorithmURI) throws XMLSecurityException {
        if (algorithmURI == null) {
            return null;
        }
        Key key = keyTable.get(algorithmURI);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverSameDocument.java`
#### Snippet
```java
        if (uri != null && (uri.isEmpty() || uri.charAt(0) == '#')) {
            if (uri.startsWith("#xpointer")) {
                return null;
            }
            return this;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverSameDocument.java`
#### Snippet
```java
            return this;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverSameDocument.java`
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
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverFilesystem.java`
#### Snippet
```java
    public ResourceResolverLookup canResolve(String uri, String baseURI) {
        if (uri == null) {
            return null;
        }
        if (uri.startsWith("file:") || baseURI != null && baseURI.startsWith("file:")) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverFilesystem.java`
#### Snippet
```java
            return this;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
                         String correlationID) throws XMLSecurityException {
        if (algorithmURI == null) {
            return null;
        }
        Key key = keyTable.get(algorithmURI);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
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
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
            return this;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverHttp.java`
#### Snippet
```java
    public ResourceResolverLookup canResolve(String uri, String baseURI) {
        if (uri == null) {
            return null;
        }
        if (pattern.matcher(uri).matches() || baseURI != null && pattern.matcher(baseURI).matches()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverHttp.java`
#### Snippet
```java
            return this;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java

        if (inclusiveNamespaces == null || inclusiveNamespaces.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent.java`
#### Snippet
```java
            return KeyValueTokenType.valueOf(algo);
        } catch (IllegalArgumentException e) {
            return null;
        } catch (XMLSecurityException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent.java`
#### Snippet
```java
            return null;
        } catch (XMLSecurityException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/ClassLoaderUtils.java`
#### Snippet
```java

        try {
            return (url != null) ? url.openStream() : null;
        } catch (IOException e) {
            LOG.debug(e.getMessage(), e);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/ClassLoaderUtils.java`
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
in `src/main/java/org/apache/xml/security/utils/ClassLoaderUtils.java`
#### Snippet
```java
            }
            public URL nextElement() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/DOMNamespaceContext.java`
#### Snippet
```java
        }
        if (namespaceURI == null && context != null) {
            return context.lookupNamespaceURI(null) != null ? null : DEFAULT_NS_PREFIX;
        } else if (XML_NS_URI.equals(namespaceURI)) {
            return XML_NS_PREFIX;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/DOMNamespaceContext.java`
#### Snippet
```java
            return XMLNS_ATTRIBUTE;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/HelperNodeList.java`
#### Snippet
```java
    public Document getOwnerDocument() {
        if (this.getLength() == 0) {
            return null;
        }
        return XMLUtils.getOwnerDocument(this.item(0));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
                        return namespaceSplit[0];
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
                @Override
                public Iterator<String> getPrefixes(String namespaceURI) {
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
                        return namespaceSplit[1];
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            sibling = sibling.getNextSibling();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    public static final byte[] decode(String encoded) throws Base64DecodingException {
        if (encoded == null) {
            return null;
        }
        byte[] bytes = new byte[encoded.length()];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

        if (binaryData == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
            return new BigInteger(1, XMLUtils.decode(XMLUtils.getFullTextChildrenFromNode(n)));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/SignatureProperties.java`
#### Snippet
```java

            if (propertyElem == null) {
                return null;
            }
            return new SignatureProperty(propertyElem, this.baseURI);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
        if (!("http://www.w3.org/2001/10/xml-exc-c14n#".equals(c14nMethodURI) ||
            "http://www.w3.org/2001/10/xml-exc-c14n#WithComments".equals(c14nMethodURI))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
                return inclusiveNamespaces;
            } catch (XMLSecurityException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
        }
        if (inputOctetStreamProxy == null) {
            return null;
        }
        try {   //NOPMD
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
            return algorithmsMap.get(algorithmURI);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
            return algorithm.jceName;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
            return algorithm.jceProvider;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
            return algorithm.algorithmClass;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
             return algorithm.requiredKey;
         }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
            return new ObjectContainer(objElem, this.baseURI);
        } catch (XMLSecurityException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
    public MessageDigestAlgorithm getMessageDigestAlgorithm() throws XMLSignatureException {
        if (digestMethodElem == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java

        if (uri.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
                return this.oid;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
            return (Exception)this.getCause();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `qName` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
     */
    public static String getQNameString(String prefix, String localName) {
        String qName = prefix == null || prefix.length() == 0
                ? localName : prefix + ":" + localName;

```

### UnnecessaryLocalVariable
Local variable `idEqual` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
            SignatureValue osv = (SignatureValue)o;

            boolean idEqual =
                id == null ? osv.getId() == null : id.equals(osv.getId());

```

### UnnecessaryLocalVariable
Local variable `dkey` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
        DSA(DSAPublicKey key) throws KeyException {
            super(key);
            DSAPublicKey dkey = key;
            DSAParams params = dkey.getParams();
            p = new DOMCryptoBinary(params.getP());
```

### UnnecessaryLocalVariable
Local variable `rkey` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
        RSA(RSAPublicKey key) throws KeyException {
            super(key);
            RSAPublicKey rkey = key;
            exponent = new DOMCryptoBinary(rkey.getPublicExponent());
            modulus = new DOMCryptoBinary(rkey.getModulus());
```

### UnnecessaryLocalVariable
Local variable `pk` is redundant
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
                    )
                );
            PublicKey pk = rsaFactory.generatePublic(rsaKeyspec);

            return pk;
```

### UnnecessaryLocalVariable
Local variable `pk` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/DSAKeyValueResolver.java`
#### Snippet
```java
        try {
            DSAKeyValue dsaKeyValue = new DSAKeyValue(dsaKeyElement, baseURI);
            PublicKey pk = dsaKeyValue.getPublicKey();

            return pk;
```

### UnnecessaryLocalVariable
Local variable `schema` is redundant
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
            }
        });
        Schema schema = schemaFactory.newSchema(
                new Source[]{
                        new StreamSource(ClassLoaderUtils.getResourceAsStream("bindings/schemas/exc-c14n.xsd", XMLSecurityConstants.class)),
```

### UnnecessaryLocalVariable
Local variable `token` is redundant
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
                    XMLSecurityUtils.getQNameType(keyInfoType.getContent(), XMLSecurityConstants.TAG_dsig_KeyName);
            if (keyName != null) {
                KeyNameSecurityToken token = getSecurityToken(keyName, securityProperties, inboundSecurityContext, keyUsage);
                return token;
            }
```

### UnnecessaryLocalVariable
Local variable `inclusiveNamespaces` is redundant
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
        if (inclusiveElement != null) {
            try {
                String inclusiveNamespaces =
                    new InclusiveNamespaces(
                        inclusiveElement,
```

### UnnecessaryLocalVariable
Local variable `doc` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
        // select all nodes, also the comments.
        try {
            Document doc = XMLUtils.read(this.getOctetStream(), secureValidation);
            this.subNode = doc;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `attrs3` is redundant
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java

            Arrays.sort(attrs2, ATTR_COMPARE);
            Object[] attrs3 = attrs2;

            for (int i = 0; i < attrsLength; i++) {
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'referencedElem' to 'Element'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java
                if (secVal) {
                    Element start = referencedElem.getOwnerDocument().getDocumentElement();
                    if (!XMLUtils.protectAgainstWrappingAttack(start, (Element)referencedElem, id)) {
                        String error = "Multiple Elements with the same ID " + id + " were detected";
                        throw new URIReferenceException(error);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'ob' to 'SymbMap'
in `src/main/java/org/apache/xml/security/c14n/implementations/NameSpaceSymbTable.java`
#### Snippet
```java
        Object ob = level.remove(size);
        if (ob != null) {
            symb = (SymbMap)ob;
            if (size == 0) {
                cloned = false;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'securityToken' to 'GenericOutboundSecurityToken'
in `src/main/java/org/apache/xml/security/stax/ext/OutboundXMLSec.java`
#### Snippet
```java
                new GenericOutboundSecurityToken(securityTokenid, SecurityTokenConstants.DefaultToken, key, x509Certificates);
        if (securityProperties.getSignatureVerificationKey() instanceof PublicKey) {
            ((GenericOutboundSecurityToken)securityToken).setPublicKey(
                (PublicKey)securityProperties.getSignatureVerificationKey());
        }
```

