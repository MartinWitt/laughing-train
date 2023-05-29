# santuario-xml-security-java 
 
# Bad smells
I found 1979 bad smells with 48 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 1377 | false |
| UnusedAssignment | 116 | false |
| FieldMayBeFinal | 96 | false |
| DataFlowIssue | 73 | false |
| DuplicatedCode | 56 | false |
| FinalStaticMethod | 28 | false |
| ConstantValue | 27 | false |
| FinalMethodInFinalClass | 25 | false |
| JavadocLinkAsPlainText | 20 | false |
| UnnecessaryModifier | 17 | true |
| DanglingJavadoc | 16 | false |
| ProtectedMemberInFinalClass | 12 | true |
| UnnecessaryLocalVariable | 11 | true |
| EmptyStatementBody | 8 | false |
| DuplicateBranchesInSwitch | 8 | false |
| UnnecessaryInitCause | 6 | false |
| TrivialStringConcatenation | 5 | false |
| RedundantMethodOverride | 5 | false |
| TrivialIf | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| UnnecessaryLabelOnBreakStatement | 4 | false |
| IfStatementWithIdenticalBranches | 4 | false |
| UnnecessaryStringEscape | 3 | true |
| CommentedOutCode | 3 | false |
| ManualMinMaxCalculation | 3 | false |
| ThrowFromFinallyBlock | 3 | false |
| JavadocReference | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| RedundantCast | 3 | false |
| CastCanBeRemovedNarrowingVariableType | 3 | false |
| DuplicateExpressions | 2 | false |
| RedundantTypeArguments | 2 | false |
| PointlessNullCheck | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| MismatchedJavadocCode | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| ConditionCoveredByFurtherCondition | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryLabelOnContinueStatement | 1 | false |
| FinalPrivateMethod | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| ExplicitArrayFilling | 1 | false |
| FieldCanBeLocal | 1 | false |
| UNUSED_IMPORT | 1 | false |
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
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
public class InputProcessorChainImpl implements InputProcessorChain {

    protected static final transient Logger LOG = LoggerFactory.getLogger(InputProcessorChainImpl.class);

    private List<InputProcessor> inputProcessors;
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
in `src/main/java/org/apache/xml/security/stax/impl/util/DigestOutputStream.java`
#### Snippet
```java
public class DigestOutputStream extends OutputStream {

    protected static final transient Logger LOG = LoggerFactory.getLogger(DigestOutputStream.class);
    protected static final transient boolean isDebugEnabled = LOG.isDebugEnabled();

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
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/LogInputProcessor.java`
#### Snippet
```java
public class LogInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(LogInputProcessor.class);

    public LogInputProcessor(XMLSecurityProperties securityProperties) {
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
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java
public abstract class AbstractSignatureOutputProcessor extends AbstractOutputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureOutputProcessor.class);

    private final List<SignaturePartDef> signaturePartDefList = new ArrayList<>();
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
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor.java`
#### Snippet
```java
public abstract class AbstractSignatureReferenceVerifyInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureReferenceVerifyInputProcessor.class);

    protected static final Integer maximumAllowedReferencesPerManifest =
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
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
public abstract class AbstractDecryptInputProcessor extends AbstractInputProcessor {

    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractDecryptInputProcessor.class);

    protected static final Integer maximumAllowedXMLStructureDepth =
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
in `src/main/java/org/apache/xml/security/stax/config/XIncludeHandler.java`
#### Snippet
```java
public class XIncludeHandler extends DefaultHandler {

    private static final transient Logger LOG = LoggerFactory.getLogger(XIncludeHandler.class);

    private static final String xIncludeNS = "http://www.w3.org/2001/XInclude";
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java

        int i;
        for (i = size; i > 0 && xmldsigBytes[size - i] == 0; i--); //NOPMD

        int j = i;
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java

        int k;
        for (k = size; k > 0 && xmldsigBytes[totalSize - k] == 0; k--); //NOPMD

        int l = k;
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
        byte rLength = asn1Bytes[3];
        int i;
        for (i = rLength; i > 0 && asn1Bytes[4 + rLength - i] == 0; i--); //NOPMD

        byte sLength = asn1Bytes[5 + rLength];
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
        byte sLength = asn1Bytes[5 + rLength];
        int j;
        for (j = sLength; j > 0 && asn1Bytes[6 + rLength + sLength - j] == 0; j--); //NOPMD

        if (i > size || asn1Bytes[4 + rLength] != 2 || j > size) {
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
        int i;

        for (i = rLength; i > 0 && asn1Bytes[offset + 2 + rLength - i] == 0; i--); //NOPMD

        byte sLength = asn1Bytes[offset + 2 + rLength + 1];
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
        int j;

        for (j = sLength; j > 0 && asn1Bytes[offset + 2 + rLength + 2 + sLength - j] == 0; j--); //NOPMD

        int maxLen = Math.max(i, j);
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
        int i;

        for (i = rawLen; i > 0 && xmldsigBytes[rawLen - i] == 0; i--); //NOPMD

        int j = i;
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
        int k;

        for (k = rawLen; k > 0 && xmldsigBytes[2 * rawLen - k] == 0; k--); //NOPMD

        int l = k;
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
        // important: The ds:Reference must be added to the associated ds:Manifest
        //            or ds:SignedInfo _before_ the this.resolverResult() is called.
        // this.manifest.appendChild(this.constructionElement);
        // this.manifest.appendChild(this.doc.createTextNode("\n"));

```

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

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `loop` on break statement
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                    && xmlSecEvent.asStartElement().getName().equals(XMLSecurityConstants.TAG_dsig_SignedInfo)) {
                    signatureVerifier.processEvent(xmlSecEvent);
                    break loop;
                }
            }
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `loop` on break statement
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                if (XMLStreamConstants.END_ELEMENT == xmlSecEvent.getEventType()
                    && xmlSecEvent.asEndElement().getName().equals(XMLSecurityConstants.TAG_dsig_SignedInfo)) {
                    break loop;
                }
            }
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `loop` on break statement
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                    && xmlSecEvent.asStartElement().getName().equals(XMLSecurityConstants.TAG_dsig_SignedInfo)) {
                    transformer.transform(xmlSecEvent);
                    break loop;
                }
            }
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `loop` on break statement
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                if (XMLStreamConstants.END_ELEMENT == xmlSecEvent.getEventType()
                    && xmlSecEvent.asEndElement().getName().equals(XMLSecurityConstants.TAG_dsig_SignedInfo)) {
                    break loop;
                }
            }
```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `loop` on continue statement
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
                case COMMENT:
                case PROCESSING_INSTRUCTION:
                    continue loop;
                case ENTITY_REFERENCE:
                case SPACE:
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @throws InvalidCanonicalizerException
     */
    public static final Canonicalizer getInstance(String algorithmURI)
        throws InvalidCanonicalizerException {
        return new Canonicalizer(algorithmURI);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final byte[] decode(BufferedReader reader)
        throws IOException, Base64DecodingException {

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     */
    public static final Element encodeToElement(Document doc, String localName, byte[] bytes) {
        Element el = XMLUtils.createElementInSignatureSpace(doc, localName);
        Text text = doc.createTextNode(encode(bytes));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final int getBytesInternal(String s, byte[] result) {
        int length = s.length();

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the <code>String</code> with encoded data
     */
    public static final String encode(byte[] binaryData) {
        return XMLUtils.ignoreLineBreaks()
            ? encode(binaryData, Integer.MAX_VALUE)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(InputStream is, OutputStream os)
        throws Base64DecodingException, IOException {
        //byte[] decodedData = null;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final void decode(byte[] base64Data, OutputStream os, int len)
        throws Base64DecodingException, IOException {
        // remove white spaces
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(byte[] base64Data, OutputStream os)
        throws Base64DecodingException, IOException {
        decode(base64Data, os, -1);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromText(Text text)
        throws Base64DecodingException {
        return new BigInteger(1, Base64.decode(text.getData()));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromElement(Element element)
        throws Base64DecodingException {
        return new BigInteger(1, Base64.decode(element));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     */
    public static final byte[] decode(byte[] base64) throws Base64DecodingException  {
        return decodeInternal(base64, -1);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
    public static final byte[] encode(BigInteger big, int bitlen) {

        //round bitlen
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final byte[] decode(Element element) throws Base64DecodingException {

        Node sibling = element.getFirstChild();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isPad(byte octet) {
        return octet == PAD;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return String with Base64 encoding
     */
    public static final String encode(BigInteger big) {
        byte[] bytes = XMLUtils.getBytes(big, big.bitLength());
        return XMLUtils.encodeToString(bytes);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException if there is a problem decoding the data
     */
    public static final byte[] decode(String encoded) throws Base64DecodingException {
        if (encoded == null) {
            return null;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
    static final byte[] getBytes(BigInteger big, int bitlen) {

        //round bitlen
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return a <code>String</code> with encoded data
     */
    public static final String  encode(byte[] binaryData, int length) {
        if (length < 4) {
            length = Integer.MAX_VALUE;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param biginteger
     */
    public static final void fillElementWithBigInteger(Element element, BigInteger biginteger) {

        String encodedInt = encode(biginteger);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the new length
     */
    protected static final int removeWhiteSpace(byte[] data) {
        if (data == null) {
            return 0;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @throws Base64DecodingException
     */
    public static final void decode(String base64Data, OutputStream os)
        throws Base64DecodingException, IOException {
        byte[] bytes = new byte[base64Data.length()];
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final boolean isWhiteSpace(byte octet) {
        return octet == 0x20 || octet == 0xd || octet == 0xa || octet == 0x9;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    protected static final byte[] decodeInternal(byte[] base64Data, int len)
        throws Base64DecodingException {
        // remove white spaces
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * @return the XPATH2 tag
     */
    public final String getBaseLocalName() {
        return XPath2FilterContainer._TAG_XPATH2;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * @return XPATH2 tag namespace
     */
    public final String getBaseNamespace() {
        return XPath2FilterContainer.XPathFilter2NS;
    }
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
            sa.update((byte)arg0);
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
    }

    protected static final int getBytesInternal(String s, byte[] result) {
        int length = s.length();

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
    public static final BigInteger decodeBigIntegerFromText(Text text)
        throws Base64DecodingException {
        return new BigInteger(1, Base64.decode(text.getData()));
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
    }

    protected static final boolean isWhiteSpace(byte octet) {
        return octet == 0x20 || octet == 0xd || octet == 0xa || octet == 0x9;
    }
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java

                    currentDocumentLevel = DocumentLevel.NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT;
                    outputStack.push(Collections.<Comparable>emptyList());

                    final List<XMLSecNamespace> utilizedNamespaces;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                        utilizedAttributes = new ArrayList<>();
                        outputStack.peek().add(XMLSecEventFactory.createXMLSecNamespace(null, ""));
                        outputStack.push(Collections.<Comparable>emptyList());

                        utilizedNamespaces.addAll(getInitialUtilizedNamespaces(xmlSecStartElement, outputStack));
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java

    static {
        for (int i = 0; i < BASELENGTH; i++) {
            base64Alphabet[i] = -1;
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    * Look up useC14N11 system property. If true, an explicit C14N11 transform
    * will be added if necessary when generating the signature. See section
    * 3.1.1 of http://www.w3.org/2007/xmlsec/Drafts/xmldsig-core/ for more info.
    *
    * If true, overrides the same property if set in the XMLSignContext.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
 * as following in config.xml
 * <PRE>
 *  &lt;KeyResolver URI="http://www.w3.org/2000/09/xmldsig#KeyValue"
 *   JAVACLASS="MyPackage.MyKeyValueImpl"//gt;
 * </PRE>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
 * Abstract base class for canonicalization algorithms.
 * Please note that these implementations are NOT thread safe - please see the following JIRA for more information:
 * https://issues.apache.org/jira/browse/SANTUARIO-463
 */
public abstract class CanonicalizerBase extends CanonicalizerSpi {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * <PRE>
     * // set namespace with ds prefix
     * xpathContainer.setXPathNamespaceContext("ds", "http://www.w3.org/2000/09/xmldsig#");
     * xpathContainer.setXPathNamespaceContext("xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
     * </PRE>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * // set namespace with ds prefix
     * xpathContainer.setXPathNamespaceContext("ds", "http://www.w3.org/2000/09/xmldsig#");
     * xpathContainer.setXPathNamespaceContext("xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
     * </PRE>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
 * <pre>
 * Document doc;
 * MessageDigestAlgorithm sha1 = MessageDigestAlgorithm.getInstance("http://#sha1");
 * Reference ref = new Reference(new XMLSignatureInput(new FileInputStream("1.gif"),
 *                               "http://localhost/1.gif",
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
 * MessageDigestAlgorithm sha1 = MessageDigestAlgorithm.getInstance("http://#sha1");
 * Reference ref = new Reference(new XMLSignatureInput(new FileInputStream("1.gif"),
 *                               "http://localhost/1.gif",
 *                               (Transforms) null, sha1);
 * Element refElem = ref.toElement(doc);
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * Look up useC14N11 system property. If true, an explicit C14N11 transform
     * will be added if necessary when generating the signature. See section
     * 3.1.1 of http://www.w3.org/2007/xmlsec/Drafts/xmldsig-core/ for more info.
     */
    private static boolean useC14N11 =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/encryption/EncryptedType.java`
#### Snippet
```java
     * by [MIME]. For example, if the data that is encrypted is a base64 encoded
     * PNG, the transfer Encoding may be specified as
     * 'http://www.w3.org/2000/09/xmldsig#base64' and the MimeType as
     * 'image/png'.
     * <br>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14NExclusiveWithComments.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments</CODE>
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14N11.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/2006/12/xml-c14n11</CODE>
 * (C14N 1.1) transform.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformBase64Decode.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/2000/09/xmldsig#base64</CODE> decoding
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14N11_WithComments.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/2006/12/xml-c14n-11#WithComments</CODE>
 * (C14N 1.1 With Comments) transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14NWithComments.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments</CODE>
 * transform.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14N.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/TR/2001/REC-xml-c14n-20010315</CODE>
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
 * Class TransformXPath
 *
 * Implements the <CODE>http://www.w3.org/TR/1999/REC-xpath-19991116</CODE>
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXSLT.java`
#### Snippet
```java
 * Class TransformXSLT
 *
 * Implements the <CODE>http://www.w3.org/TR/1999/REC-xslt-19991116</CODE>
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java

/**
 * Implements the <CODE>http://www.w3.org/2000/09/xmldsig#enveloped-signature</CODE>
 * transform.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param transformation the name of the transformation, e.g.,
     *   <code>XMLCipher.TRIPLEDES</code> which is shorthand for
     *   &quot;http://www.w3.org/2001/04/xmlenc#tripledes-cbc&quot;
     */
    private static void validateTransformation(String transformation) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param transformation the name of the transformation, e.g.,
     *   <code>XMLCipher.TRIPLEDES</code> which is shorthand for
     *   &quot;http://www.w3.org/2001/04/xmlenc#tripledes-cbc&quot;
     * @throws XMLEncryptionException
     * @return the XMLCipher
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     */
    static class ResolverIterator implements Iterator<KeyResolverSpi> {
        private List<KeyResolverSpi> res;
        private Iterator<KeyResolverSpi> it;

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
Method `write()` is identical to its super method
in `src/main/java/org/apache/xml/security/stax/impl/util/ReplaceableOuputStream.java`
#### Snippet
```java

    @Override
    public void write(int b) throws IOException {
        out.write(b);
    }
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
                    Attr attr = (Attr)attributes.item(i);
                    String prefix = attr.getPrefix();
                    if (prefix != null && "xmlns".equals(prefix)) {
                        namespaceMap.put(attr.getLocalName(), attr.getValue());
                    }
```

### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathTransform.java`
#### Snippet
```java
                Attr attr = (Attr)attributes.item(i);
                String prefix = attr.getPrefix();
                if (prefix != null && "xmlns".equals(prefix)) {
                    namespaceMap.put(attr.getLocalName(), attr.getValue());
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
                expanded = true;
            }
            byte extraByte = 0;
            if (c < 0x800) {
                // 0x00000080 - 0x000007FF
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
Variable `x509Digests` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
        throws XMLSecurityException {

        XMLX509Digest x509Digests[] = null;

        Element x509childNodes[] = XMLUtils.selectDs11Nodes(element.getFirstChild(), Constants._TAG_X509DIGEST);
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
Variable `refBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
        throws FileNotFoundException, IOException {

        byte[] refBytes = null;

        try (InputStream inputStream = Files.newInputStream(Paths.get(fileName));
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
    static String changeWStoXML(String string) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c;

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
        EncryptedKey newEncryptedKey(Element element) throws XMLEncryptionException {
            EncryptedKey result = null;
            NodeList dataElements =
                element.getElementsByTagNameNS(
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
Variable `encryptedBytes` initializer `null` is redundant
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        }

        byte[] encryptedBytes = null;

        // Now create the working cipher if none was created already
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
Condition `c < 0x200000` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
            // 1110xxxx 10xxxxxx 10xxxxxx
            extraByte = 2;
        } else if (c < 0x200000) {
            // 0x00010000 - 0x001FFFFF
            // 11110xxx 10xxxxx 10xxxxxx 10xxxxxx
```

### ConstantValue
Condition `c < 0x200000` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                // 1110xxxx 10xxxxxx 10xxxxxx
                extraByte = 2;
            } else if (c < 0x200000) {
                // 0x00010000 - 0x001FFFFF
                // 11110xxx 10xxxxx 10xxxxxx 10xxxxxx
```

### ConstantValue
Condition `c < 0x200000` is always `true`
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
                // 1110xxxx 10xxxxxx 10xxxxxx
                extraByte = 2;
            } else if (c < 0x200000) {
                // 0x00010000 - 0x001FFFFF
                // 11110xxx 10xxxxx 10xxxxxx 10xxxxxx
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
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509SKIResolver.java`
#### Snippet
```java
            XMLUtils.selectDsNodes(element.getFirstChild(), Constants._TAG_X509SKI);

        return x509childNodes != null && x509childNodes.length > 0;
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `XMLSignatureException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
     * @return the transformed data
     * @throws NullPointerException if <code>data</code> is <code>null</code>
     * @throws XMLSignatureException if an unexpected error occurs while
     *    executing the transform
     */
```

### JavadocReference
Cannot resolve symbol `XMLSignatureException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
     * @throws NullPointerException if <code>data</code> or <code>context</code>
     *    is <code>null</code>
     * @throws XMLSignatureException if an unexpected error occurs while
     *    executing the transform
     */
```

### JavadocReference
Cannot resolve symbol `XMLSignatureException`
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMTransform.java`
#### Snippet
```java
     * @return the transformed data
     * @throws NullPointerException if <code>data</code> is <code>null</code>
     * @throws XMLSignatureException if an unexpected error occurs while
     *    executing the transform
     */
```

## RuleId[id=DataFlowIssue]
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
                        utilizedNamespaces = new ArrayList<>();
                        utilizedAttributes = new ArrayList<>();
                        outputStack.peek().add(XMLSecEventFactory.createXMLSecNamespace(null, ""));
                        outputStack.push(Collections.<Comparable>emptyList());

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

### StringOperationCanBeSimplified
`toString()` call can be replaced with 'contentEquals()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
            } else if (input.startsWith("../")) {
                input = input.substring(3);
                if (!"/".equals(output.toString())) {
                    output.append("../");
                }
```

### StringOperationCanBeSimplified
`toString()` call can be replaced with 'contentEquals()'
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                printStep("2D", output.toString(), input);
            } else if ("..".equals(input)) {
                if (!"/".equals(output.toString())) {
                    output.append("..");
                }
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/DigesterOutputStream.java`
#### Snippet
```java
        if (LOG.isDebugEnabled()) {
            LOG.debug("Pre-digested input:");
            StringBuilder sb = new StringBuilder(len);
            for (int i = offset; i < (offset + len); i++) {
                sb.append((char)input[i]);
            }
            LOG.debug(sb.toString());
        }
        md.update(input, offset, len);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
        if (context != null && !(context instanceof DOMCryptoContext)) {
            throw new ClassCastException
                ("context must be of type DOMCryptoContext");
        }
        if (parent == null) {
            throw new NullPointerException();
        }
        if (!(parent instanceof javax.xml.crypto.dom.DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
        transformElem = (Element)
            ((javax.xml.crypto.dom.DOMStructure)parent).getNode();
        ownerDoc = DOMUtils.getOwnerDocument(transformElem);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheCanonicalizer.java`
#### Snippet
```java
        if (ownerDoc == null) {
            throw new TransformException("transform must be marshalled");
        }

        if (apacheTransform == null) {
            try {
                apacheTransform =
                    new Transform(ownerDoc, getAlgorithm(), transformElem.getChildNodes());
                apacheTransform.setElement(transformElem, xc.getBaseURI());
                LOG.debug("Created transform for algorithm: {}", getAlgorithm());
            } catch (Exception ex) {
                throw new TransformException
                    ("Couldn't find Transform for: " + getAlgorithm(), ex);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMHMACSignatureMethod.java`
#### Snippet
```java
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("key must be SecretKey");
        }
        if (hmac == null) {
            try {
                Provider p = (Provider)context.getProperty(DOM_SIGNATURE_PROVIDER);
                hmac = (p == null)
                    ? Mac.getInstance(getJCAAlgorithm())
                    : Mac.getInstance(getJCAAlgorithm(), p);
            } catch (NoSuchAlgorithmException nsae) {
                throw new XMLSignatureException(nsae);
            }
        }
        if (outputLengthSet && outputLength < getDigestLength()) {
            throw new XMLSignatureException
                ("HMACOutputLength must not be less than " + getDigestLength());
        }
        hmac.init(key);
        ((DOMSignedInfo)si).canonicalize(context, new MacOutputStream(hmac));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            BigInteger p = bigInt(sfield);
            ECField field = new ECFieldFp(p);
            EllipticCurve curve = new EllipticCurve(field, bigInt(a),
                                                    bigInt(b));
            ECPoint g = new ECPoint(bigInt(x), bigInt(y));
            return new Curve(name, oid, curve, g, bigInt(n), h);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            if (data.length == 0 || data[0] != 4) {
                throw new IOException("Only uncompressed point format " +
                                      "supported");
            }
            // Per ANSI X9.62, an encoded point is a 1 byte type followed by
            // ceiling(LOG base 2 field-size / 8) bytes of x and the same of y.
            int n = (data.length - 1) / 2;
            if (n != (curve.getField().getFieldSize() + 7) >> 3) {
                throw new IOException("Point does not match field size");
            }

            byte[] xb = Arrays.copyOfRange(data, 1, 1 + n);
            byte[] yb = Arrays.copyOfRange(data, n + 1, n + 1 + n);

            return new ECPoint(new BigInteger(1, xb), new BigInteger(1, yb));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            int n = (curve.getField().getFieldSize() + 7) >> 3;
            byte[] xb = trimZeroes(point.getAffineX().toByteArray());
            byte[] yb = trimZeroes(point.getAffineY().toByteArray());
            if (xb.length > n || yb.length > n) {
                throw new RuntimeException("Point coordinates do not " +
                                           "match field size");
            }
            byte[] b = new byte[1 + (n << 1)];
            b[0] = 4; // uncompressed
            System.arraycopy(xb, 0, b, n - xb.length + 1, xb.length);
            System.arraycopy(yb, 0, b, b.length - yb.length, yb.length);
            return b;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            int i = 0;
            while (i < b.length - 1 && b[i] == 0) {
                i++;
            }
            if (i == 0) {
                return b;
            }
            return Arrays.copyOfRange(b, i, b.length);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            Curve match;
            if (matchCurve(params, SECP256R1)) {
                match = SECP256R1;
            } else if (matchCurve(params, SECP384R1)) {
                match = SECP384R1;
            } else if (matchCurve(params, SECP521R1)) {
                match = SECP521R1;
            } else {
                return null;
            }
            return match.getObjectId();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyValue.java`
#### Snippet
```java
            ECPoint ecPoint = null;

            try {
                String content = XMLUtils.getFullTextChildrenFromNode(curElem);
                ecPoint = decodePoint(XMLUtils.decode(content),
                                      ecParams.getCurve());
            } catch (IOException ioe) {
                throw new MarshalException("Invalid EC Point", ioe);
            }

            ECPublicKeySpec spec = new ECPublicKeySpec(ecPoint, ecParams);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
        if (resource.isElement()) {
            e = (Element) resource.getSubNode();
        } else if (resource.isNodeSet()) {
            // Retrieved resource is a nodeSet
            e = getDocumentElement(resource.getNodeSet());
        } else {
            // Retrieved resource is an inputStream
            byte[] inputBytes = resource.getBytes();
            e = getDocFromBytes(inputBytes, secureValidation);
            // otherwise, we parse the resource, create an Element and delegate
            LOG.debug("we have to parse {} bytes", inputBytes.length);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRSAPSSSignatureMethod.java`
#### Snippet
```java
        if (signature == null) {
            try {
                Provider p = (Provider)context.getProperty(DOM_SIGNATURE_PROVIDER);
                signature = (p == null)
                    ? Signature.getInstance(getJCAAlgorithm())
                    : Signature.getInstance(getJCAAlgorithm(), p);
            } catch (NoSuchAlgorithmException nsae) {
                throw new XMLSignatureException(nsae);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
                    TransformService spi = null;
                    if (provider == null) {
                        spi = TransformService.getInstance(c14nalg, "DOM");
                    } else {
                        try {
                            spi = TransformService.getInstance(c14nalg, "DOM", provider);
                        } catch (NoSuchAlgorithmException nsae) {
                            spi = TransformService.getInstance(c14nalg, "DOM");
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMURIDereferencer.java`
#### Snippet
```java
            String id = uri.substring(1);

            if (id.startsWith("xpointer(id(")) {
                int i1 = id.indexOf('\'');
                int i2 = id.indexOf('\'', i1+1);
                if (i1 >= 0 && i2 >= 0) {
                    id = id.substring(i1 + 1, i2);
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMUtils.java`
#### Snippet
```java
        if (elem == null) {
            throw new MarshalException("Missing " + localName + " element");
        }
        String name = elem.getLocalName();
        String namespace = elem.getNamespaceURI();
        if (!name.equals(localName) || namespace == null && namespaceURI != null
            || namespace != null && !namespace.equals(namespaceURI)) {
            throw new MarshalException("Invalid element name: " +
                namespace + ":" + name + ", expected " + namespaceURI + ":" + localName);
        }
        return elem;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java
        TransformService spi;
        if (getProvider() == null) {
            spi = TransformService.getInstance(algorithm, "DOM");
        } else {
            try {
                spi = TransformService.getInstance(algorithm, "DOM", getProvider());
            } catch (NoSuchAlgorithmException nsae) {
                spi = TransformService.getInstance(algorithm, "DOM");
            }
        }

        spi.init(params);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignatureFactory.java`
#### Snippet
```java
        TransformService spi;
        if (getProvider() == null) {
            spi = TransformService.getInstance(algorithm, "DOM");
        } else {
            try {
                spi = TransformService.getInstance(algorithm, "DOM", getProvider());
            } catch (NoSuchAlgorithmException nsae) {
                spi = TransformService.getInstance(algorithm, "DOM");
            }
        }

        if (params == null) {
            spi.init(null);
        } else {
            spi.init(params, null);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
                int length = attributes.getLength();
                Map<String, String> namespaceMap =
                    new HashMap<>((int) Math.ceil(length / 0.75));
                for (int i = 0; i < length; i++) {
                    Attr attr = (Attr)attributes.item(i);
                    String prefix = attr.getPrefix();
                    if (prefix != null && "xmlns".equals(prefix)) {
                        namespaceMap.put(attr.getLocalName(), attr.getValue());
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform.java`
#### Snippet
```java
            @SuppressWarnings("unchecked")
            Set<Map.Entry<String, String>> entries =
                xpathType.getNamespaceMap().entrySet();
            for (Map.Entry<String, String> entry : entries) {
                elem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" +
                                    entry.getKey(),
                                    entry.getValue());
            }

            transformElem.appendChild(elem);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                    Element[] resolverElem =
                        XMLUtils.selectNodes(el.getFirstChild(), CONF_NS, "Resolver");
                    List<String> classNames = new ArrayList<>(resolverElem.length);
                    for (Element element : resolverElem) {
                        String javaClass =
                            element.getAttributeNS(null, "JAVACLASS");
                        String description =
                            element.getAttributeNS(null, "DESCRIPTION");

                        if (description != null && description.length() > 0) {
                            LOG.debug("Register Resolver: {}: {}", javaClass, description);
                        } else {
                            LOG.debug("Register Resolver: {}: For unknown purposes", javaClass);
                        }
                        classNames.add(javaClass);
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
        JavaUtils.checkRegisterPermission();
        LOG.debug("Try to register {} {}", algorithmURI, implementingClass);

        // are we already registered?
        Class<? extends SignatureAlgorithmSpi> registeredClass = algorithmHash.get(algorithmURI);
        if (registeredClass != null) {
            Object[] exArgs = { algorithmURI, registeredClass };
            throw new AlgorithmAlreadyRegisteredException(
                "algorithm.alreadyRegistered", exArgs
            );
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
        if (!(secretKey instanceof SecretKey)) {
            String supplied = null;
            if (secretKey != null) {
                supplied = secretKey.getClass().getName();
            }
            String needed = SecretKey.class.getName();
            Object[] exArgs = { supplied, needed };

            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", exArgs);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
                    Node n = ns.addMappingAndRender(NName, NValue, attribute);

                    if (n != null) {
                        //Render the ns definition
                        result.add((Attr)n);
                        if (C14nHelper.namespaceIsRelative(attribute)) {
                            Object[] exArgs = { element.getTagName(), NName, attribute.getNodeValue() };
                            throw new CanonicalizationException(
                                "c14n.Canonicalizer.RelativeNamespace", exArgs
                            );
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
        String prefix = null;
        if (element.getNamespaceURI() != null
            && !(element.getPrefix() == null || element.getPrefix().length() == 0)) {
            prefix = element.getPrefix();
        } else {
            prefix = XMLNS;
        }
        visiblyUtilized.add(prefix);

        for (String s : visiblyUtilized) {
            Attr key = ns.getMapping(s);
            if (key != null) {
                result.add(key);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
        for (int i = 0; i < length; ) {
            int c = target.codePointAt(i);
            i += Character.charCount(c);
            if (c == 0x0D) {
                writer.write(XD.clone());
            } else {
                if (c < 0x80) {
                    writer.write(c);
                } else {
                    UtfHelpper.writeCodePointToUtf8(c, writer);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/c14n/implementations/UtfHelpper.java`
#### Snippet
```java
        byte write;
        int shift = 6 * extraByte;
        write = (byte)((0xFE << (6 - extraByte)) | (c >>> shift));
        out.write(write);
        for (int i = extraByte - 1; i >= 0; i--) {
            shift -= 6;
            write = (byte)(0x80 | ((c >>> shift) & 0x3F));
            out.write(write);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/c14n/implementations/XmlAttrStack.java`
#### Snippet
```java
                if (output.length() == 0) {
                    output.append('/');
                } else if (output.toString().endsWith("../")) {
                    output.append("..");
                } else if (output.toString().endsWith("..")) {
                    output.append("/..");
                } else {
                    int index = output.lastIndexOf("/");
                    if (index == -1) {
                        output = new StringBuilder();
                        if (input.charAt(0) == '/') {
                            input = input.substring(1);
                        }
                    } else {
                        output = output.delete(index, output.length());
                    }
                }
                printStep("2C", output.toString(), input);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            while (currentChild != null) {
                if (currentChild.getNodeType() == Node.ELEMENT_NODE) {
                    for (StorageResolver storage : storageResolvers) {
                        PublicKey pk =
                            keyResolver.engineLookupAndResolvePublicKey(
                                (Element) currentChild, uri, storage, secureValidation
                            );

                        if (pk != null) {
                            return pk;
                        }
                    }
                }
                currentChild = currentChild.getNextSibling();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            while (currentChild != null)      {
                if (currentChild.getNodeType() == Node.ELEMENT_NODE) {
                    for (StorageResolver storage : storageResolvers) {
                        SecretKey sk =
                            keyResolver.engineLookupAndResolveSecretKey(
                                (Element) currentChild, uri, storage, secureValidation
                            );

                        if (sk != null) {
                            return sk;
                        }
                    }
                }
                currentChild = currentChild.getNextSibling();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
            while (currentChild != null)      {
                if (currentChild.getNodeType() == Node.ELEMENT_NODE) {
                    // not using StorageResolvers at the moment
                    // since they cannot return private keys
                    PrivateKey pk =
                        keyResolver.engineLookupAndResolvePrivateKey(
                            (Element) currentChild, uri, null, secureValidation
                        );

                    if (pk != null) {
                        return pk;
                    }
                }
                currentChild = currentChild.getNextSibling();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
                    if (certSKI.equals(x509SKI)) {
                        LOG.debug("match !!! ");

                        try {
                            Key key = keyStore.getKey(alias, password);
                            if (key instanceof PrivateKey) {
                                return (PrivateKey) key;
                            }
                        } catch (Exception e) {
                            LOG.debug("Cannot recover the key", e);
                            // Keep searching
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
            Element e = obtainReferenceElement(resource, secureValidation);

            // Check to make sure that the reference is not to another RetrievalMethod
            // which points to this element
            if (XMLUtils.elementIsInSignatureSpace(e, Constants._TAG_RETRIEVALMETHOD)) {
                if (secureValidation) {
                    if (LOG.isDebugEnabled()) {
                        String error = "Error: It is forbidden to have one RetrievalMethod "
                                + "point to another with secure validation";
                        LOG.debug(error);
                    }
                    return null;
                }
                RetrievalMethod rm2 = new RetrievalMethod(e, baseURI);
                XMLSignatureInput resource2 = resolveInput(rm2, baseURI, secureValidation);
                Element e2 = obtainReferenceElement(resource2, secureValidation);
                if (e2 == element) {
                    LOG.debug("Error: Can't have RetrievalMethods pointing to each other");
                    return null;
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
        int length = target.length();

        for (int i = 0; i < length; i++) {
            char c = target.charAt(i);

            switch (c) {

            case 0x0D:
                this.writer.write("&amp;#xD;");
                break;

            case ' ':
                this.writer.write("&middot;");
                break;

            case '\n':
                this.writer.write("&para;\n");
                break;

            default:
                this.writer.write(c);
                break;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
            for (int i = startPhaseIdx; i < endPhaseIdx; i++) {
                InputProcessor inputProcessor = inputProcessors.get(i);
                if (newInputProcessor.getBeforeProcessors().contains(inputProcessor)
                        || newInputProcessor.getBeforeProcessors().contains(inputProcessor.getClass().getName())) {
                    idxToInsert = i + 1;
                    break;
                }
            }
            inputProcessors.add(idxToInsert, newInputProcessor);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler.java`
#### Snippet
```java
                InclusiveNamespaces inclusiveNamespacesType =
                        XMLSecurityUtils.getQNameType(
                                canonicalizationMethodType.getContent(),
                                XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces
                        );

                Map<String, Object> transformerProperties = null;
                if (inclusiveNamespacesType != null) {
                    transformerProperties = new HashMap<>();
                    transformerProperties.put(
                            Canonicalizer20010315_Excl.INCLUSIVE_NAMESPACES_PREFIX_LIST,
                            inclusiveNamespacesType.getPrefixList());
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverFilesystem.java`
#### Snippet
```java
            URI tmp;
            if (baseURI == null || baseURI.length() == 0) {
                tmp = new URI(uri);
            } else {
                tmp = new URI(baseURI).resolve(uri);
            }

            if (tmp.getFragment() != null) {
                tmp = new URI(tmp.getScheme(), tmp.getSchemeSpecificPart(), null);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecAttributeImpl.java`
#### Snippet
```java
        final int length = text.length();

        int i = 0;
        int idx = 0;
        while (i < length) {
            char c = text.charAt(i);
            if (c == '&') {
                writer.write(text, idx, i - idx);
                writer.write("&amp;");
                idx = i + 1;
            } else if (c == '"') {
                writer.write(text, idx, i - idx);
                writer.write("&quot;");
                idx = i + 1;
            }
            i++;
        }
        writer.write(text, idx, length - idx);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecStartElementImpl.java`
#### Snippet
```java
                for (int i = 0; i < namespaces.size(); i++) {
                    Namespace comparableNamespace = namespaces.get(i);
                    if (prefix.equals(comparableNamespace.getPrefix())) {
                        return comparableNamespace.getNamespaceURI();
                    }
                }
                if (parentXMLSecStartELement != null) {
                    return parentXMLSecStartELement.getNamespaceURI(prefix);
                }
                return null;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformBase64Decode.java`
#### Snippet
```java
                            @Override
                            public void transform(Object object) throws XMLStreamException {
                                if (base64OutputStream == null) {
                                    byteArrayOutputStream = new UnsyncByteArrayOutputStream();
                                    base64OutputStream = new Base64OutputStream(byteArrayOutputStream, false);
                                }
                                try {
                                    base64OutputStream.write((byte[]) object);
                                } catch (IOException e) {
                                    throw new XMLStreamException(e);
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/TransformIdentity.java`
#### Snippet
```java
        switch (forInput) {
            case XMLSecEvent:
                return XMLSecurityConstants.TransformMethod.XMLSecEvent;
            case InputStream:
                return XMLSecurityConstants.TransformMethod.InputStream;
            default:
                throw new IllegalArgumentException("Unsupported class " + forInput.name());
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer11.java`
#### Snippet
```java
            if (outputStack.containsOnStack(comparableAttribute) != null) {
                continue;
            }
            if (utilizedAttributes == Collections.<XMLSecAttribute>emptyList()) {
                utilizedAttributes = new ArrayList<>(2);
            }
            utilizedAttributes.add(comparableAttribute);
            outputStack.peek().add(comparableAttribute);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer11.java`
#### Snippet
```java
        List<XMLSecAttribute> elementAttributes = xmlSecStartElement.getOnElementDeclaredAttributes();
        for (int i = 0; i < elementAttributes.size(); i++) {
            XMLSecAttribute comparableAttribute = elementAttributes.get(i);
            //attributes with xml prefix are already processed in the for loop above
            //xml:id attributes must be handled like other attributes: emit but dont inherit
            final QName attributeName = comparableAttribute.getName();
            if (XML.equals(attributeName.getPrefix())) {
                continue;
            }
            if (utilizedAttributes == Collections.<XMLSecAttribute>emptyList()) {
                utilizedAttributes = new ArrayList<>(2);
            }
            utilizedAttributes.add(comparableAttribute);
        }

        return utilizedAttributes;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
        List<XMLSecNamespace> utilizedNamespaces = Collections.emptyList();

        XMLSecNamespace elementNamespace = xmlSecStartElement.getElementNamespace();
        final XMLSecNamespace found = (XMLSecNamespace) outputStack.containsOnStack(elementNamespace);
        //found means the prefix matched. so check the ns further
        if (found == null || found.getNamespaceURI() == null || !found.getNamespaceURI().equals(elementNamespace.getNamespaceURI())) {
            utilizedNamespaces = new ArrayList<>(2);
            utilizedNamespaces.add(elementNamespace);
            outputStack.peek().add(elementNamespace);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/Canonicalizer20010315_Excl.java`
#### Snippet
```java
        List<XMLSecAttribute> comparableAttributes = xmlSecStartElement.getOnElementDeclaredAttributes();
        for (int i = 0; i < comparableAttributes.size(); i++) {
            XMLSecAttribute comparableAttribute = comparableAttributes.get(i);
            XMLSecNamespace attributeNamespace = comparableAttribute.getAttributeNamespace();
            if ("xml".equals(attributeNamespace.getPrefix())) {
                continue;
            }
            if (attributeNamespace.getNamespaceURI() == null || attributeNamespace.getNamespaceURI().isEmpty()) {
                continue;
            }
            final XMLSecNamespace resultNamespace = (XMLSecNamespace) outputStack.containsOnStack(attributeNamespace);
            //resultNamespace means the prefix matched. so check the ns further
            if (resultNamespace == null || resultNamespace.getNamespaceURI() == null
                    || !resultNamespace.getNamespaceURI().equals(attributeNamespace.getNamespaceURI())) {

                if (utilizedNamespaces == Collections.<XMLSecNamespace>emptyList()) {
                    utilizedNamespaces = new ArrayList<>(2);
                }
                utilizedNamespaces.add(attributeNamespace);
                outputStack.peek().add(attributeNamespace);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
            switch (c) {

                case '&':
                    toWrite = _AMP_;
                    break;

                case '<':
                    toWrite = _LT_;
                    break;

                case '>':
                    toWrite = _GT_;
                    break;

                case 0xD:
                    toWrite = __XD_;
                    break;

                default:
                    if (c < 0x80) {
                        writer.write(c);
                    } else {
                        UtfHelpper.writeCodePointToUtf8(c, writer);
                    }
                    continue;
            }
            writer.write(toWrite);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
        for (int i = 0; i < length; ) {
            final int c = target.codePointAt(i);
            i += Character.charCount(c);
            if (c == 0x0D) {
                writer.write(__XD_);
            } else {
                if (c < 0x80) {
                    writer.write(c);
                } else {
                    UtfHelpper.writeCodePointToUtf8(c, writer);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        bitlen = ((bitlen + 7) >> 3) << 3;

        if (bitlen < big.bitLength()) {
            throw new IllegalArgumentException(I18n.translate("utils.Base64.IllegalBitlength"));
        }

        byte[] bigBytes = big.toByteArray();

        if (big.bitLength() % 8 != 0
            && big.bitLength() / 8 + 1 == bitlen / 8) {
            return bigBytes;
        }

        // some copying needed
        int startSrc = 0;    // no need to skip anything
        int bigLen = bigBytes.length;    //valid length of the string

        if (big.bitLength() % 8 == 0) {    // correct values
            startSrc = 1;    // skip sign bit

            bigLen--;    // valid length of the string
        }

        int startDst = bitlen / 8 - bigLen;    //pad with leading nulls
        byte[] resizedBytes = new byte[bitlen / 8];

        System.arraycopy(bigBytes, startSrc, resizedBytes, startDst, bigLen);

        return resizedBytes;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
                b1 = binaryData[dataIndex++];
                b2 = binaryData[dataIndex++];
                b3 = binaryData[dataIndex++];

                l = (byte)(b2 & 0x0f);
                k = (byte)(b1 & 0x03);

                byte val1 = ((b1 & SIGN) == 0) ? (byte)(b1 >> 2): (byte)((b1) >> 2 ^ 0xc0);

                byte val2 = ((b2 & SIGN) == 0) ? (byte)(b2 >> 4) : (byte)((b2) >> 4 ^ 0xf0);
                byte val3 = ((b3 & SIGN) == 0) ? (byte)(b3 >> 6) : (byte)((b3) >> 6 ^ 0xfc);


                encodedData[encodedIndex++] = lookUpBase64Alphabet[val1];
                encodedData[encodedIndex++] = lookUpBase64Alphabet[val2 | (k << 4)];
                encodedData[encodedIndex++] = lookUpBase64Alphabet[(l << 2) | val3];
                encodedData[encodedIndex++] = lookUpBase64Alphabet[b3 & 0x3f];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            l = ( byte ) (b2 & 0x0f);
            k = ( byte ) (b1 & 0x03);

            byte val1 = ((b1 & SIGN) == 0) ? (byte)(b1 >> 2) : (byte)((b1) >> 2 ^ 0xc0);
            byte val2 = ((b2 & SIGN) == 0) ? (byte)(b2 >> 4) : (byte)((b2) >> 4 ^ 0xf0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
        b1 = base64Alphabet[base64Data[dataIndex++]];
        b2 = base64Alphabet[base64Data[dataIndex++]];
        if (b1 == -1 || b2 == -1) {
             //if found "no data" just return null
            throw new Base64DecodingException("decoding.general");
        }


        byte d3, d4;
        b3 = base64Alphabet[d3 = base64Data[dataIndex++]];
        b4 = base64Alphabet[d4 = base64Data[dataIndex++]];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
            b1 = base64Alphabet[base64Data[dataIndex++]];
            b2 = base64Alphabet[base64Data[dataIndex++]];
            b3 = base64Alphabet[base64Data[dataIndex++]];
            b4 = base64Alphabet[base64Data[dataIndex++]];

            if (b1 == -1 || b2 == -1 || b3 == -1 || b4 == -1) {
                //if found "no data" just return null
                throw new Base64DecodingException("decoding.general");
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
                if ((b3 & 0x3 ) != 0) { //last 2 bits should be zero
                    throw new Base64DecodingException("decoding.general");
                }
                os.write((byte)(b1 << 2 | b2 >> 4));
                os.write((byte)(((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf)));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
            if (prefix == null || prefix.length() == 0) {
                result = doc.createElementNS(namespace, localName);
                result.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", namespace);
            } else {
                result = doc.createElementNS(namespace, prefix + ":" + localName);
                result.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:" + prefix, namespace);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/JDKXPathAPI.java`
#### Snippet
```java
        if (!str.equals(xpathStr) || xpathExpression == null) {
            if (xpf == null) {
                xpf = XPathFactory.newInstance();
                try {
                    xpf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
                } catch (XPathFactoryConfigurationException ex) {
                    throw new TransformerException(ex);
                }
            }
            XPath xpath = xpf.newXPath();
            xpath.setNamespaceContext(new DOMNamespaceContext(namespaceNode));
            xpathStr = str;
            try {
                xpathExpression = xpath.compile(xpathStr);
            } catch (XPathExpressionException ex) {
                throw new TransformerException(ex);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            processedNode = startNode;
            startNode = startNode.getFirstChild();

            // no child, this node is done.
            if (startNode == null) {
                // close node processing, get sibling
                startNode = processedNode.getNextSibling();
            }

            // no more siblings, get parent, all children
            // of parent are processed.
            while (startNode == null) {
                processedNode = processedNode.getParentNode();
                if (processedNode == startParent) {
                    return true;
                }
                // close parent node processing (processed node now)
                startNode = processedNode.getNextSibling();
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
        URI newUri = null;
        if (baseURI == null || baseURI.length() == 0) {
            newUri = new URI(uri);
        } else {
            newUri = new URI(baseURI).resolve(uri);
        }

        // if the URI contains a fragment, ignore it
        if (newUri.getFragment() != null) {
            return new URI(newUri.getScheme(), newUri.getSchemeSpecificPart(), null);
        }
        return newUri;
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

    protected static final int getBytesInternal(String s, byte[] result) {
        int length = s.length();

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

    protected static final boolean isWhiteSpace(byte octet) {
        return octet == 0x20 || octet == 0xd || octet == 0xa || octet == 0x9;
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

    protected static final boolean isPad(byte octet) {
        return octet == PAD;
    }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
                        outputStack.push(Collections.<Comparable>emptyList());

                        utilizedNamespaces.addAll(getInitialUtilizedNamespaces(xmlSecStartElement, outputStack));
                        utilizedAttributes.addAll(getInitialUtilizedAttributes(xmlSecStartElement, outputStack));

```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java

                        utilizedNamespaces.addAll(getInitialUtilizedNamespaces(xmlSecStartElement, outputStack));
                        utilizedAttributes.addAll(getInitialUtilizedAttributes(xmlSecStartElement, outputStack));

                        firstCall = false;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI.java`
#### Snippet
```java
import javax.xml.crypto.dsig.*;

/**
 * The XMLDSig RI Provider.
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/Init.java`
#### Snippet
```java
                            sigElem.getAttributeNS(null, "JAVACLASS");

                        /** $todo$ handle registering */

                        try {
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
        throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
            throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
        throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
        throws CanonicalizationException, DOMException, IOException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
        throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
        throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
            throws CanonicalizationException {

        /** $todo$ well, should we throw UnsupportedOperationException ? */
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
        }

        /**
         * Strip away first four bytes from the extensionValue
         * The first two bytes are the tag and length of the extensionValue
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        Node childNode = getElement().getFirstChild();
        while (childNode != null) {
            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
        Node childNode = getElement().getFirstChild();
        while (childNode != null) {
            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamReader.java`
#### Snippet
```java
        StringBuilder stringBuilder = new StringBuilder();

        /**
         * Need to loop to get rid of PIs, comments
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
    }

    /**
     * Encodes hex octets into Base64
     *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java
    ) throws TransformationException {
        try {
            /**
             * If the actual input is an octet stream, then the application MUST
             * convert the octet stream to an XPath node-set suitable for use by
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java
        String baseURI, boolean secureValidation
    ) throws TransformationException {
        /**
         * If the actual input is an octet stream, then the application MUST
         * convert the octet stream to an XPath node-set suitable for use by
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
                algorithmURI = tmpAlgorithm.toString();
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
                this.algorithm = tmpAlgorithm.toString();
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/xml/security/stax/ext/ComparableType.java`
#### Snippet
```java
            @SuppressWarnings("unchecked")
            T other = (T) obj;
            if (this.getName().equals(other.getName())) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/PrivateKeyResolver.java`
#### Snippet
```java
        if (XMLUtils.elementIsInSignatureSpace(element, Constants._TAG_X509DATA)) {
            PrivateKey privKey = resolveX509Data(element, baseURI);
            if (privKey != null) {
                return privKey;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/XMLSignatureEndingOutputProcessor.java`
#### Snippet
```java
        boolean include = true;

        if (!securityProperties.isSignatureIncludeDigestTransform() &&
                !transform.equals(NS_XMLDSIG_ENVELOPED_SIGNATURE)) {
            include = false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverSameDocument.java`
#### Snippet
```java
        } else {
            Attribute attribute = xmlSecStartElement.getAttributeByName(idAttributeNS);
            if (attribute != null && attribute.getValue().equals(id)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverContext.java`
#### Snippet
```java
                return false;
            }
            if (!uriToResolve.isEmpty() && uriToResolve.charAt(0) != '#' &&
                    baseUri != null && (baseUri.startsWith("file:") || baseUri.startsWith("http:"))) {
                return false;
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `transform` to `DOMTransform` is redundant
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRetrievalMethod.java`
#### Snippet
```java
        try {
            for (Transform transform : transforms) {
                data = ((DOMTransform)transform).transform(data, context);
            }
        } catch (Exception e) {
```

### RedundantCast
Casting `n` to `Element` is redundant
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
                        for (Node n : nl) {
                            if (n.getNodeType() == Node.ELEMENT_NODE
                                && ((Element) n).getNamespaceURI().equals(Constants.SignatureSpecNS)
                                && ((Element) n).getLocalName().equals(Constants._TAG_MANIFEST)
                            ) {
```

### RedundantCast
Casting `n` to `Element` is redundant
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
                            if (n.getNodeType() == Node.ELEMENT_NODE
                                && ((Element) n).getNamespaceURI().equals(Constants.SignatureSpecNS)
                                && ((Element) n).getLocalName().equals(Constants._TAG_MANIFEST)
                            ) {
                                try {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param ki` tag description is missing
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMKeyInfo.java`
#### Snippet
```java
    /**
     * A utility function to suppress casting warnings.
     * @param ki
     * @return the content of a KeyInfo Object
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureMethod.java`
#### Snippet
```java
     * @param sig the signature returned by {@code Signature.sign()}
     * @return the formatted signature
     * @throws IOException
     */
    abstract byte[] postSignFormat(Key key, byte[] sig) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignatureMethod.java`
#### Snippet
```java
     * @param sig the signature
     * @return the formatted signature
     * @throws IOException
     */
    abstract byte[] preVerifyFormat(Key key, byte[] sig) throws IOException;
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     * Constructor InvalidCanonicalizerException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public InvalidCanonicalizerException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public InvalidCanonicalizerException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     * Constructor InvalidCanonicalizerException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public InvalidCanonicalizerException(
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/InvalidCanonicalizerException.java`
#### Snippet
```java
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     */
    public InvalidCanonicalizerException(String msgID) {
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * C14n a node tree.
     *
     * @param rootNode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param rootNode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public abstract void engineCanonicalizeSubTree(Node rootNode, OutputStream writer)
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param xpathNodeSet
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public abstract void engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet, OutputStream writer)
```

### JavadocDeclaration
`@param inputBytes` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * Method canonicalize
     *
     * @param inputBytes
     * @param writer OutputStream to write the canonicalization result
     * @param secureValidation Whether secure validation is enabled
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param secureValidation Whether secure validation is enabled
     *
     * @throws XMLParserException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     *
     * @throws XMLParserException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @throws XMLParserException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public void engineCanonicalize(byte[] inputBytes, OutputStream writer, boolean secureValidation)
```

### JavadocDeclaration
ParserConfigurationException is not declared to be thrown by method engineCanonicalize
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @throws XMLParserException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public void engineCanonicalize(byte[] inputBytes, OutputStream writer, boolean secureValidation)
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * C14n a node tree.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public abstract void engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces, OutputStream writer)
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * C14n a node tree.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param propagateDefaultNamespace If true the default namespace will be propagated to the c14n-ized root element
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param propagateDefaultNamespace If true the default namespace will be propagated to the c14n-ized root element
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param propagateDefaultNamespace If true the default namespace will be propagated to the c14n-ized root element
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public abstract void engineCanonicalizeSubTree(
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizerSpi.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public abstract void engineCanonicalizeXPathNodeSet(
```

### JavadocDeclaration
`@param namespaceValue` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/C14nHelper.java`
#### Snippet
```java
     * Method namespaceIsAbsolute
     *
     * @param namespaceValue
     * @return true if the given namespace is absolute.
     */
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/C14nHelper.java`
#### Snippet
```java
     * Method namespaceIsRelative
     *
     * @param namespace
     * @return true if the given namespace is relative.
     */
```

### JavadocDeclaration
`@param namespaceValue` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/C14nHelper.java`
#### Snippet
```java
     * Method namespaceIsRelative
     *
     * @param namespaceValue
     * @return true if the given namespace is relative.
     */
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/C14nHelper.java`
#### Snippet
```java
     * Method namespaceIsAbsolute
     *
     * @param namespace
     * @return true if the given namespace is absolute.
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     * Constructor CanonicalizationException
     *
     * @param msgID
     */
    public CanonicalizationException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     * Constructor CanonicalizationException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public CanonicalizationException(
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     * Constructor CanonicalizationException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public CanonicalizationException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     * Constructor CanonicalizationException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/CanonicalizationException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public CanonicalizationException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param attr0` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/AttrCompare.java`
#### Snippet
```java
     * </UL>
     *
     * @param attr0
     * @param attr1
     * @return returns a negative integer, zero, or a positive integer as
```

### JavadocDeclaration
`@param attr1` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/helper/AttrCompare.java`
#### Snippet
```java
     *
     * @param attr0
     * @param attr1
     * @return returns a negative integer, zero, or a positive integer as
     *   obj0 is less than, equal to, or greater than obj1
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
```

### JavadocDeclaration
`@param implementingClass` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param node
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void canonicalizeSubtree(Node node, String inclusiveNamespaces,
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void canonicalizeXPathNodeSet(
```

### JavadocDeclaration
`@param inputBytes` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * wrapped with a <CODE>&gt;a&lt;...&gt;/a&lt;</CODE>.
     *
     * @param inputBytes
     * @param writer OutputStream to write the canonicalization result
     * @param secureValidation Whether secure validation is enabled
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param writer OutputStream to write the canonicalization result
     * @param secureValidation Whether secure validation is enabled
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws XMLParserException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param secureValidation Whether secure validation is enabled
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws XMLParserException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws XMLParserException
     */
    public void canonicalize(byte[] inputBytes, OutputStream writer, boolean secureValidation)
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param xpathNodeSet
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void canonicalizeXPathNodeSet(Set<Node> xpathNodeSet, OutputStream writer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param writer OutputStream to write the canonicalization result
     *
     * @throws CanonicalizationException
     */
    public void canonicalizeSubtree(Node node, OutputStream writer) throws CanonicalizationException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param node
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void canonicalizeSubtree(Node node, String inclusiveNamespaces, OutputStream writer)
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Constructor Canonicalizer
     *
     * @param algorithmURI
     * @throws InvalidCanonicalizerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param algorithmURI
     * @throws InvalidCanonicalizerException
     */
    private Canonicalizer(String algorithmURI) throws InvalidCanonicalizerException {
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Method getInstance
     *
     * @param algorithmURI
     * @return a Canonicalizer instance ready for the job
     * @throws InvalidCanonicalizerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param algorithmURI
     * @return a Canonicalizer instance ready for the job
     * @throws InvalidCanonicalizerException
     */
    public static final Canonicalizer getInstance(String algorithmURI)
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
```

### JavadocDeclaration
`@param implementingClass` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * Always throws a CanonicalizationException.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces, OutputStream writer)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * node set, as well as all other ancestors.
     *
     * @param element
     * @param ns
     * @param cache
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     *
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param cache` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException, DOMException, IOException
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * Always throws a CanonicalizationException.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void engineCanonicalizeSubTree(
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     * Always throws a CanonicalizationException.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerPhysical.java`
#### Snippet
```java
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException always
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyName.java`
#### Snippet
```java
     * Constructor KeyName
     *
     * @param doc
     * @param keyName
     */
```

### JavadocDeclaration
`@param keyName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyName.java`
#### Snippet
```java
     *
     * @param doc
     * @param keyName
     */
    public KeyName(Document doc, String keyName) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyName.java`
#### Snippet
```java
     * Constructor KeyName
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyName.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyName.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public KeyName(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyInfoReference.java`
#### Snippet
```java
     * Constructor RetrievalMethod
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyInfoReference.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyInfoReference.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public KeyInfoReference(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyInfoReference.java`
#### Snippet
```java
     * Constructor RetrievalMethod
     *
     * @param doc
     * @param uri
     */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyInfoReference.java`
#### Snippet
```java
     *
     * @param doc
     * @param uri
     */
    public KeyInfoReference(Document doc, String uri) {
```

### JavadocDeclaration
`@param includeComments` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     * Constructor Canonicalizer20010315Excl
     *
     * @param includeComments
     */
    public Canonicalizer20010315Excl(boolean includeComments) {
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
    /**
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @param secureValidation Whether secure validation is enabled
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     * @param writer OutputStream to write the canonicalization result
     * @param secureValidation Whether secure validation is enabled
     * @throws CanonicalizationException
     */
    public void engineCanonicalize(
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
    /**
     * Method engineCanonicalizeSubTree
     * @param rootNode
     * @param inclusiveNamespaces
     * @param excl A element to exclude from the c14n process.
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     * Method engineCanonicalizeSubTree
     * @param rootNode
     * @param inclusiveNamespaces
     * @param excl A element to exclude from the c14n process.
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl.java`
#### Snippet
```java
     * @param excl A element to exclude from the c14n process.
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void engineCanonicalizeSubTree(
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     * Constructor DEREncodedKeyValue
     *
     * @param doc
     * @param publicKey
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param publicKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param publicKey
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param publicKey
     * @throws XMLSecurityException
     */
    public DEREncodedKeyValue(Document doc, PublicKey publicKey) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     *
     * @return the public key
     * @throws XMLSecurityException
     */
    public PublicKey getPublicKey() throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     * Constructor DEREncodedKeyValue
     *
     * @param doc
     * @param encodedKey
     */
```

### JavadocDeclaration
`@param encodedKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param encodedKey
     */
    public DEREncodedKeyValue(Document doc, byte[] encodedKey) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     * Constructor DEREncodedKeyValue
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public DEREncodedKeyValue(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/SPKIData.java`
#### Snippet
```java
     * Constructor SPKIData
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/DEREncodedKeyValue.java`
#### Snippet
```java
     *
     * @return the public key
     * @throws XMLSecurityException
     */
    protected byte[] getEncodedDER(PublicKey publicKey) throws XMLSecurityException {
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/SPKIData.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/SPKIData.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public SPKIData(Element element, String baseURI)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/MgmtData.java`
#### Snippet
```java
     * Constructor MgmtData
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/MgmtData.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/MgmtData.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public MgmtData(Element element, String baseURI)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/MgmtData.java`
#### Snippet
```java
     * Constructor MgmtData
     *
     * @param doc
     * @param mgmtData
     */
```

### JavadocDeclaration
`@param mgmtData` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/MgmtData.java`
#### Snippet
```java
     *
     * @param doc
     * @param mgmtData
     */
    public MgmtData(Document doc, String mgmtData) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/PGPData.java`
#### Snippet
```java
     * Constructor PGPData
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/PGPData.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/PGPData.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public PGPData(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * Method getTransforms
     *
     * @throws XMLSecurityException
     * @return the transformations
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * Constructor RetrievalMethod
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public RetrievalMethod(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * Constructor RetrievalMethod
     *
     * @param doc
     * @param URI
     * @param transforms
```

### JavadocDeclaration
`@param URI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     *
     * @param doc
     * @param URI
     * @param transforms
     * @param Type
```

### JavadocDeclaration
`@param transforms` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * @param doc
     * @param URI
     * @param transforms
     * @param Type
     */
```

### JavadocDeclaration
`@param Type` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/RetrievalMethod.java`
#### Snippet
```java
     * @param URI
     * @param transforms
     * @param Type
     */
    public RetrievalMethod(Document doc, String URI, Transforms transforms, String Type) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * Constructor KeyValue
     *
     * @param doc
     * @param pk
     */
```

### JavadocDeclaration
`@param pk` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param pk
     */
    public KeyValue(Document doc, PublicKey pk) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * Constructor KeyValue
     *
     * @param doc
     * @param rsaKeyValue
     */
```

### JavadocDeclaration
`@param rsaKeyValue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param rsaKeyValue
     */
    public KeyValue(Document doc, RSAKeyValue rsaKeyValue) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * Constructor KeyValue
     *
     * @param doc
     * @param unknownKeyValue
     */
```

### JavadocDeclaration
`@param unknownKeyValue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param unknownKeyValue
     */
    public KeyValue(Document doc, Element unknownKeyValue) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * Constructor KeyValue
     *
     * @param doc
     * @param dsaKeyValue
     */
```

### JavadocDeclaration
`@param dsaKeyValue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param dsaKeyValue
     */
    public KeyValue(Document doc, DSAKeyValue dsaKeyValue) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * Constructor KeyValue
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public KeyValue(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/KeyValue.java`
#### Snippet
```java
     *
     * @return the public key
     * @throws XMLSecurityException
     */
    public PublicKey getPublicKey() throws XMLSecurityException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * org.w3c.dom.Document)}.
     *
     * @param element
     * @param ns
     * @param cache
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     *
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param cache` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException, DOMException, IOException
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces, OutputStream writer)
```

### JavadocDeclaration
`@param includeComments` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * Constructor Canonicalizer20010315
     *
     * @param includeComments
     * @param c14n11 Whether this is a Canonical XML 1.1 implementation or not
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * node set, as well as all other ancestors.
     *
     * @param element
     * @param ns
     * @param cache
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     *
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param cache` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException, DOMException, IOException
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException always
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * @param inclusiveNamespaces
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    public void engineCanonicalizeSubTree(
```

### JavadocDeclaration
`@param includeComments` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/Canonicalizer20010315.java`
#### Snippet
```java
     * Constructor Canonicalizer20010315
     *
     * @param includeComments
     */
    public Canonicalizer20010315(boolean includeComments) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     * Constructor XMLX509CRL
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509CRL(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     * Constructor X509CRL
     *
     * @param doc
     * @param crlBytes
     */
```

### JavadocDeclaration
`@param crlBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     *
     * @param doc
     * @param crlBytes
     */
    public XMLX509CRL(Document doc, byte[] crlBytes) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509CRL.java`
#### Snippet
```java
     *
     * @return the CRL bytes
     * @throws XMLSecurityException
     */
    public byte[] getCRLBytes() throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     * Constructor XMLX509SubjectName
     *
     * @param doc
     * @param x509certificate
     */
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509certificate
     */
    public XMLX509SubjectName(Document doc, X509Certificate x509certificate) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     * Constructor X509SubjectName
     *
     * @param doc
     * @param X509SubjectNameString
     */
```

### JavadocDeclaration
`@param X509SubjectNameString` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     *
     * @param doc
     * @param X509SubjectNameString
     */
    public XMLX509SubjectName(Document doc, String X509SubjectNameString) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     * Constructor X509SubjectName
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SubjectName.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509SubjectName(Element element, String baseURI)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * Constructor XMLX509Digest
     *
     * @param doc
     * @param x509certificate
     * @param algorithmURI
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * @param doc
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
     */
    public XMLX509Digest(Document doc, X509Certificate x509certificate, String algorithmURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * Constructor XMLX509Digest
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509Digest(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * Constructor XMLX509Digest
     *
     * @param doc
     * @param digestBytes
     * @param algorithmURI
```

### JavadocDeclaration
`@param digestBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     *
     * @param doc
     * @param digestBytes
     * @param algorithmURI
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * @param doc
     * @param digestBytes
     * @param algorithmURI
     */
    public XMLX509Digest(Document doc, byte[] digestBytes, String algorithmURI) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     *
     * @return the digestbytes
     * @throws XMLSecurityException
     */
    public byte[] getDigestBytes() throws XMLSecurityException {
```

### JavadocDeclaration
`@param cert` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * Method getDigestBytesFromCert
     *
     * @param cert
     * @param algorithmURI
     * @return digest bytes from the given certificate
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     *
     * @param cert
     * @param algorithmURI
     * @return digest bytes from the given certificate
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Digest.java`
#### Snippet
```java
     * @return digest bytes from the given certificate
     *
     * @throws XMLSecurityException
     */
    public static byte[] getDigestBytesFromCert(X509Certificate cert, String algorithmURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * Constructor XMLX509IssuerSerial
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
```

### JavadocDeclaration
`@param x509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
```

### JavadocDeclaration
`@param x509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
    public XMLX509IssuerSerial(Document doc, String x509IssuerName, BigInteger x509SerialNumber) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * Constructor XMLX509IssuerSerial
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
```

### JavadocDeclaration
`@param x509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
```

### JavadocDeclaration
`@param x509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
    public XMLX509IssuerSerial(Document doc, String x509IssuerName, String x509SerialNumber) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * Constructor XMLX509IssuerSerial
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
```

### JavadocDeclaration
`@param x509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
```

### JavadocDeclaration
`@param x509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * @param doc
     * @param x509IssuerName
     * @param x509SerialNumber
     */
    public XMLX509IssuerSerial(Document doc, String x509IssuerName, int x509SerialNumber) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * Constructor XMLX509IssuerSerial
     *
     * @param doc
     * @param x509certificate
     */
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509certificate
     */
    public XMLX509IssuerSerial(Document doc, X509Certificate x509certificate) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * Constructor XMLX509IssuerSerial
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509IssuerSerial.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509IssuerSerial(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @return the certificate bytes
     * @throws XMLSecurityException
     */
    public byte[] getCertificateBytes() throws XMLSecurityException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     * Constructor X509Certificate
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509Certificate(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     * Constructor X509Certificate
     *
     * @param doc
     * @param certificateBytes
     */
```

### JavadocDeclaration
`@param certificateBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @param doc
     * @param certificateBytes
     */
    public XMLX509Certificate(Document doc, byte[] certificateBytes) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @return the x509 certificate
     * @throws XMLSecurityException
     */
    public X509Certificate getX509Certificate() throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @return the publickey
     * @throws XMLSecurityException
     */
    public PublicKey getPublicKey() throws XMLSecurityException, IOException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     * Constructor XMLX509Certificate
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509Certificate.java`
#### Snippet
```java
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
    public XMLX509Certificate(Document doc, X509Certificate x509certificate)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/KeyValueContent.java`
#### Snippet
```java
     *
     * @return the public key
     * @throws XMLSecurityException
     */
    PublicKey getPublicKey() throws XMLSecurityException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     *
     * @return the skibytes
     * @throws XMLSecurityException
     */
    public byte[] getSKIBytes() throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * Constructor X509SKI
     *
     * @param doc
     * @param skiBytes
     */
```

### JavadocDeclaration
`@param skiBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     *
     * @param doc
     * @param skiBytes
     */
    public XMLX509SKI(Document doc, byte[] skiBytes) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * Constructor XMLX509SKI
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public XMLX509SKI(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * Constructor XMLX509SKI
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
    public XMLX509SKI(Document doc, X509Certificate x509certificate)
```

### JavadocDeclaration
`@param cert` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * Method getSKIBytesFromCert
     *
     * @param cert
     * @return ski bytes from the given certificate
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/x509/XMLX509SKI.java`
#### Snippet
```java
     * @return ski bytes from the given certificate
     *
     * @throws XMLSecurityException
     * @see java.security.cert.X509Extension#getExtensionValue(java.lang.String)
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * Constructor DSAKeyValue
     *
     * @param doc
     * @param P
     * @param Q
```

### JavadocDeclaration
`@param P` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param P
     * @param Q
     * @param G
```

### JavadocDeclaration
`@param Q` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param P
     * @param Q
     * @param G
     * @param Y
```

### JavadocDeclaration
`@param G` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * @param P
     * @param Q
     * @param G
     * @param Y
     */
```

### JavadocDeclaration
`@param Y` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * @param Q
     * @param G
     * @param Y
     */
    public DSAKeyValue(Document doc, BigInteger P, BigInteger Q, BigInteger G, BigInteger Y) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * Constructor DSAKeyValue
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
    public DSAKeyValue(Document doc, Key key) throws IllegalArgumentException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * Constructor DSAKeyValue
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/DSAKeyValue.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public DSAKeyValue(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemCertificate
     *
     * @param i
     * @return the X509Certificate, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509Certificate, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509Certificate itemCertificate(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param x509CertificateDigestBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addDigest
     *
     * @param x509CertificateDigestBytes
     * @param algorithmURI
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param x509CertificateDigestBytes
     * @param algorithmURI
     */
    public void addDigest(byte[] x509CertificateDigestBytes, String algorithmURI) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Constructor X509Data
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public X509Data(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param X509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addIssuerSerial
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
```

### JavadocDeclaration
`@param X509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
    public void addIssuerSerial(String X509IssuerName, BigInteger X509SerialNumber) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addDigest
     *
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param x509certificate
     * @param algorithmURI
     * @throws XMLSecurityException
     */
    public void addDigest(X509Certificate x509certificate, String algorithmURI)
```

### JavadocDeclaration
`@param skiBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addSKI
     *
     * @param skiBytes
     */
    public void addSKI(byte[] skiBytes) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemSubjectName
     *
     * @param i
     * @return the X509SubjectName, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509SubjectName, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509SubjectName itemSubjectName(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param xmlX509CRL` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509CRL
     */
    public void add(XMLX509CRL xmlX509CRL) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemDigest
     *
     * @param i
     * @return the X509Digest, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509Digest, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509Digest itemDigest(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemUnknownElement
     *
     * @param i
     * @return the Unknown Element at i
     * TODO implement
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Constructor X509Data
     *
     * @param doc
     */
    public X509Data(Document doc) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemSKI
     *
     * @param i
     * @return the X509SKI, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509SKI, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509SKI itemSKI(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemCRL
     *
     * @param i
     * @return the X509CRL, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509CRL, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509CRL itemCRL(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param xmlX509Certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509Certificate
     */
    public void add(XMLX509Certificate xmlX509Certificate) {
```

### JavadocDeclaration
`@param xmlX509SubjectName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509SubjectName
     */
    public void add(XMLX509SubjectName xmlX509SubjectName) {
```

### JavadocDeclaration
`@param crlBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addCRL
     *
     * @param crlBytes
     */
    public void addCRL(byte[] crlBytes) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addUnknownElement
     *
     * @param element
     */
    public void addUnknownElement(Element element) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addSubjectName
     *
     * @param x509certificate
     */
    public void addSubjectName(X509Certificate x509certificate) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addCertificate
     *
     * @param x509certificate
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param x509certificate
     * @throws XMLSecurityException
     */
    public void addCertificate(X509Certificate x509certificate)
```

### JavadocDeclaration
`@param xmlX509IssuerSerial` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509IssuerSerial
     */
    public void add(XMLX509IssuerSerial xmlX509IssuerSerial) {
```

### JavadocDeclaration
`@param X509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addIssuerSerial
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
```

### JavadocDeclaration
`@param X509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
    public void addIssuerSerial(String X509IssuerName, int X509SerialNumber) {
```

### JavadocDeclaration
`@param subjectName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addSubjectName
     *
     * @param subjectName
     */
    public void addSubjectName(String subjectName) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method itemIssuerSerial
     *
     * @param i
     * @return the X509IssuerSerial, null if not present
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * @param i
     * @return the X509IssuerSerial, null if not present
     * @throws XMLSecurityException
     */
    public XMLX509IssuerSerial itemIssuerSerial(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param x509certificateBytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addCertificate
     *
     * @param x509certificateBytes
     */
    public void addCertificate(byte[] x509certificateBytes) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addSKI
     *
     * @param x509certificate
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param x509certificate
     * @throws XMLSecurityException
     */
    public void addSKI(X509Certificate x509certificate)
```

### JavadocDeclaration
`@param X509IssuerName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method addIssuerSerial
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
```

### JavadocDeclaration
`@param X509SerialNumber` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     *
     * @param X509IssuerName
     * @param X509SerialNumber
     */
    public void addIssuerSerial(String X509IssuerName, String X509SerialNumber) {
```

### JavadocDeclaration
`@param xmlX509Digest` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509Digest
     */
    public void add(XMLX509Digest xmlX509Digest) {
```

### JavadocDeclaration
`@param xmlX509SKI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/X509Data.java`
#### Snippet
```java
     * Method add
     *
     * @param xmlX509SKI
     */
    public void add(XMLX509SKI xmlX509SKI) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     * Constructor StorageResolverException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public StorageResolverException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     * Constructor StorageResolverException
     *
     * @param msgID
     */
    public StorageResolverException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     * Constructor StorageResolverException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public StorageResolverException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     * Constructor StorageResolverException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolverException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public StorageResolverException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param x509cert` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/implementations/SingleCertificateResolver.java`
#### Snippet
```java
         * Constructor InternalIterator
         *
         * @param x509cert
         */
        public InternalIterator(X509Certificate x509cert) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * Constructor RSAKeyValue
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public RSAKeyValue(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * Constructor RSAKeyValue
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
    public RSAKeyValue(Document doc, Key key) throws IllegalArgumentException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * Constructor RSAKeyValue
     *
     * @param doc
     * @param modulus
     * @param exponent
```

### JavadocDeclaration
`@param modulus` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param modulus
     * @param exponent
     */
```

### JavadocDeclaration
`@param exponent` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/RSAKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param modulus
     * @param exponent
     */
    public RSAKeyValue(Document doc, BigInteger modulus, BigInteger exponent) {
```

### JavadocDeclaration
`@param resolver` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Constructor StorageResolver
     *
     * @param resolver
     */
    public StorageResolver(StorageResolverSpi resolver) {
```

### JavadocDeclaration
`@param resolver` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Method addResolver
     *
     * @param resolver
     */
    public void add(StorageResolverSpi resolver) {
```

### JavadocDeclaration
`@param keyStore` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Constructor StorageResolver
     *
     * @param keyStore
     */
    public StorageResolver(KeyStore keyStore) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Constructor StorageResolver
     *
     * @param x509certificate
     */
    public StorageResolver(X509Certificate x509certificate) {
```

### JavadocDeclaration
`@param x509certificate` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Method addCertificate
     *
     * @param x509certificate
     */
    public void add(X509Certificate x509certificate) {
```

### JavadocDeclaration
`@param keyStore` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
     * Method addKeyStore
     *
     * @param keyStore
     */
    public void add(KeyStore keyStore) {
```

### JavadocDeclaration
`@param resolvers` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/StorageResolver.java`
#### Snippet
```java
         * Constructor StorageResolverIterator
         *
         * @param resolvers
         */
        public StorageResolverIterator(Iterator<StorageResolverSpi> resolvers) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     * Constructor KeyResolverException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public KeyResolverException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     * Constructor KeyResolverException
     *
     * @param msgID
     */
    public KeyResolverException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     * Constructor KeyResolverException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public KeyResolverException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     * Constructor KeyResolverException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public KeyResolverException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param keyStore` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/implementations/KeyStoreResolver.java`
#### Snippet
```java
         * Constructor KeyStoreIterator
         *
         * @param keyStore
         */
        public KeyStoreIterator(KeyStore keyStore) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/storage/implementations/KeyStoreResolver.java`
#### Snippet
```java
     *
     * @param keyStore is the keystore which contains the Certificates
     * @throws StorageResolverException
     */
    public KeyStoreResolver(KeyStore keyStore) throws StorageResolverException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineResolveCertificate
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved X509Certificate key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved X509Certificate key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    protected abstract X509Certificate engineResolveX509Certificate(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * This method returns whether the KeyResolverSpi is able to perform the requested action.
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineLookupAndResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved public key from the registered from the element.
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved public key from the registered from the element.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
    public PublicKey engineLookupAndResolvePublicKey(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved SecretKey key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved SecretKey key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    protected abstract SecretKey engineResolveSecretKey(
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Parses a byte array and returns the parsed Element.
     *
     * @param bytes
     * @return the Document Element after parsing bytes
     * @throws KeyResolverException if something goes wrong
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineLookupResolveX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved X509Certificate key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved X509Certificate key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    public X509Certificate engineLookupResolveX509Certificate(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineLookupAndResolvePrivateKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved PrivateKey key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved PrivateKey key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved PrivateKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    public PrivateKey engineLookupAndResolvePrivateKey(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineLookupAndResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved SecretKey key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved SecretKey key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    public SecretKey engineLookupAndResolveSecretKey(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineResolvePrivateKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved PrivateKey key from the registered from the elements
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved PrivateKey key from the registered from the elements
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved PrivateKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
    protected abstract PrivateKey engineResolvePrivateKey(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * Method engineResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved public key from the registered from the element.
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return resolved public key from the registered from the element.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolverSpi.java`
#### Snippet
```java
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
    protected abstract PublicKey engineResolvePublicKey(
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Outputs a Text of CDATA section to the internal Writer.
     *
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
     */
    private static final void outputTextToWriter(
```

### JavadocDeclaration
`@param currentPI` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Outputs a PI to the internal Writer.
     *
     * @param currentPI
     * @param writer where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param currentPI
     * @param writer where to write the things
     * @throws IOException
     */
    protected void outputPItoWriter(
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * </UL>
     *
     * @param name
     * @param value
     * @param writer
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *
     * @param name
     * @param value
     * @param writer
     * @throws IOException
```

### JavadocDeclaration
`@param writer` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param name
     * @param value
     * @param writer
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param value
     * @param writer
     * @throws IOException
     */
    protected static final void outputAttrToWriter(
```

### JavadocDeclaration
`@param currentComment` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @param writer writer where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param currentComment
     * @param writer writer where to write the things
     * @throws IOException
     */
    protected void outputCommentToWriter(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param secureValidation Whether secure validation is enabled
     *
     * @throws CanonicalizationException
     */
    public void engineCanonicalize(XMLSignatureInput input, OutputStream writer, boolean secureValidation) throws CanonicalizationException {
```

### JavadocDeclaration
`@param el` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
    /**
     * Adds to ns the definitions from the parent elements of el
     * @param el
     * @param ns
     */
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Adds to ns the definitions from the parent elements of el
     * @param el
     * @param ns
     */
    private void getParentNameSpaces(Element el, NameSpaceSymbTable ns)  {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Output the attributes for this node in XPathNodeSet c14n.
     *
     * @param element
     * @param ns
     * @param cache
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param cache` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException, DOMException, IOException
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Output the attributes for this node in a Subtree c14n.
     *
     * @param element
     * @param ns
     * @param cache
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param cache` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param element
     * @param ns
     * @param cache
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException, DOMException, IOException
```

### JavadocDeclaration
`@param includeComments` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Constructor CanonicalizerBase
     *
     * @param includeComments
     */
    protected CanonicalizerBase(boolean includeComments) {
```

### JavadocDeclaration
`@param currentNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * Method canonicalizeSubTree, this function is a recursive one.
     *
     * @param currentNode
     * @param ns
     * @param endnode
```

### JavadocDeclaration
`@param ns` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *
     * @param currentNode
     * @param ns
     * @param endnode
     * @param documentLevel
```

### JavadocDeclaration
`@param endnode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param currentNode
     * @param ns
     * @param endnode
     * @param documentLevel
     * @param excludeNode
```

### JavadocDeclaration
`@param documentLevel` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param ns
     * @param endnode
     * @param documentLevel
     * @param excludeNode
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param excludeNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param endnode
     * @param documentLevel
     * @param excludeNode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param excludeNode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     * @throws IOException
     */
    private void canonicalizeSubTree(
```

### JavadocDeclaration
`@param currentNode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * xpathNodeSet field.
     *
     * @param currentNode
     * @param endnode
     * @param writer OutputStream to write the canonicalization result
```

### JavadocDeclaration
`@param endnode` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *
     * @param currentNode
     * @param endnode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param endnode
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     * @throws IOException
     */
    private void canonicalizeXPathNodeSet(Node currentNode, Node endnode, OutputStream writer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/c14n/implementations/CanonicalizerBase.java`
#### Snippet
```java
     *            a node to be excluded from the canonicalize operation
     * @param writer OutputStream to write the canonicalization result
     * @throws CanonicalizationException
     */
    protected void engineCanonicalizeSubTree(Node rootNode, Node excludeNode, OutputStream writer)
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     * Method checkSrorage
     *
     * @param storage
     * @throws KeyResolverException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     *
     * @param storage
     * @throws KeyResolverException
     */
    private void checkStorage(StorageResolver storage) throws KeyResolverException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     * Resolves from the storage resolver the actual certificate represented by the digest.
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return the certificate represented by the digest.
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @return the certificate represented by the digest.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/X509DigestResolver.java`
#### Snippet
```java
     * @param storage
     * @return the certificate represented by the digest.
     * @throws XMLSecurityException
     */
    private X509Certificate resolveCertificate(Element element, String baseURI, StorageResolver storage)
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
     * Constructor for use when a KEK needs to be derived from a KeyInfo
     * list
     * @param algorithm
     * @param internalKeyResolvers
     */
```

### JavadocDeclaration
`@param internalKeyResolvers` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
     * list
     * @param algorithm
     * @param internalKeyResolvers
     */
    public EncryptedKeyResolver(String algorithm, List<KeyResolverSpi> internalKeyResolvers) {
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
    /**
     * Constructor used for when a KEK has been set
     * @param algorithm
     * @param kek
     * @param internalKeyResolvers
```

### JavadocDeclaration
`@param kek` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
     * Constructor used for when a KEK has been set
     * @param algorithm
     * @param kek
     * @param internalKeyResolvers
     */
```

### JavadocDeclaration
`@param internalKeyResolvers` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/EncryptedKeyResolver.java`
#### Snippet
```java
     * @param algorithm
     * @param kek
     * @param internalKeyResolvers
     */
    public EncryptedKeyResolver(String algorithm, Key kek, List<KeyResolverSpi> internalKeyResolvers) {
```

### JavadocDeclaration
`@param classNames` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     *
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
```

### JavadocDeclaration
`@param className` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * Method getPublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return the public key contained in the element
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return the public key contained in the element
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @return the public key contained in the element
     *
     * @throws KeyResolverException
     */
    public static final PublicKey getPublicKey(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * Method getX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return The certificate represented by the element.
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return The certificate represented by the element.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @return The certificate represented by the element.
     *
     * @throws KeyResolverException
     */
    public static final X509Certificate getX509Certificate(
```

### JavadocDeclaration
`@param className` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @throws InstantiationException
     * @throws IllegalAccessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     *
     * @param className
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @param className
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     * Constructor DSAKeyValue
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     *
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     * @param doc
     * @param key
     * @throws IllegalArgumentException
     */
    public ECKeyValue(Document doc, Key key) throws IllegalArgumentException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     * Constructor DSAKeyValue
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/content/keyvalues/ECKeyValue.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public ECKeyValue(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param e` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
    /**
     * Retrieves a PublicKey from the given information
     * @param e
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * Retrieves a PublicKey from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * @param e
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return a PublicKey from the given information
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return a PublicKey from the given information
     * @throws KeyResolverException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * @param secureValidation
     * @return a PublicKey from the given information
     * @throws KeyResolverException
     */
    private static PublicKey resolveKey(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * Resolves the input from the given retrieval method
     * @return the input from the given retrieval method
     * @throws XMLSecurityException
     */
    private static XMLSignatureInput resolveInput(
```

### JavadocDeclaration
`@param e` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
    /**
     * Retrieves a x509Certificate from the given information
     * @param e
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * Retrieves a x509Certificate from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @return a x509Certificate from the given information
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * @param e
     * @param baseURI
     * @param storage
     * @return a x509Certificate from the given information
     * @throws KeyResolverException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/RetrievalMethodResolver.java`
#### Snippet
```java
     * @param storage
     * @return a x509Certificate from the given information
     * @throws KeyResolverException
     */
    private static X509Certificate resolveCertificate(
```

### JavadocDeclaration
`@param keyName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
    /**
     * Constructor.
     * @param keyName
     * @param privateKey
     */
```

### JavadocDeclaration
`@param privateKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
     * Constructor.
     * @param keyName
     * @param privateKey
     */
    public SingleKeyResolver(String keyName, PrivateKey privateKey) {
```

### JavadocDeclaration
`@param keyName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
    /**
     * Constructor.
     * @param keyName
     * @param publicKey
     */
```

### JavadocDeclaration
`@param publicKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
     * Constructor.
     * @param keyName
     * @param publicKey
     */
    public SingleKeyResolver(String keyName, PublicKey publicKey) {
```

### JavadocDeclaration
`@param keyName` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
    /**
     * Constructor.
     * @param keyName
     * @param secretKey
     */
```

### JavadocDeclaration
`@param secretKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/SingleKeyResolver.java`
#### Snippet
```java
     * Constructor.
     * @param keyName
     * @param secretKey
     */
    public SingleKeyResolver(String keyName, SecretKey secretKey) {
```

### JavadocDeclaration
`@param inputProcessorChain` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/InputProcessor.java`
#### Snippet
```java
     * Will be called from the framework when the next security-header XMLEvent is requested
     *
     * @param inputProcessorChain
     * @return The next XMLSecEvent
     * @throws XMLStreamException   thrown when a streaming error occurs
```

### JavadocDeclaration
`@param processor` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/InputProcessor.java`
#### Snippet
```java
     * Add this processor after the given processor
     *
     * @param processor
     */
    void addAfterProcessor(Object processor);
```

### JavadocDeclaration
`@param inputProcessorChain` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/InputProcessor.java`
#### Snippet
```java
     * Will be called from the framework when the next XMLEvent is requested
     *
     * @param inputProcessorChain
     * @return The next XMLSecEvent
     * @throws XMLStreamException   thrown when a streaming error occurs
```

### JavadocDeclaration
`@param processor` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/InputProcessor.java`
#### Snippet
```java
     * Add this processor before the given processor
     *
     * @param processor
     */
    void addBeforeProcessor(Object processor);
```

### JavadocDeclaration
`@param inputProcessorChain` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/InputProcessor.java`
#### Snippet
```java
     * Will be called when the whole document is processed.
     *
     * @param inputProcessorChain
     * @throws XMLStreamException   thrown when a streaming error occurs
     * @throws XMLSecurityException thrown when a Security failure occurs
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * Resolve the XML signature input represented by the specified URI.
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return the XML signature input represented by the specified URI.
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return the XML signature input represented by the specified URI.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemKeyName
     *
     * @param i
     * @return the asked KeyName element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked KeyName element, null if the index is too big
     * @throws XMLSecurityException
     */
    public KeyName itemKeyName(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param secureValidation
     * @return the XML signature input represented by the specified URI.
     * @throws XMLSecurityException
     */
    private XMLSignatureInput resolveInput(Attr uri, String baseURI, boolean secureValidation)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
    /**
     * Constructor KeyInfo
     * @param doc
     */
    public KeyInfo(Document doc) {
```

### JavadocDeclaration
`@param referentElement` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * Validate the Element referred to by the KeyInfoReference.
     *
     * @param referentElement
     * @param secureValidation
     *
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemEncryptedKey
     *
     * @param i
     * @return the asked EncryptedKey element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked EncryptedKey element, null if the index is too big
     * @throws XMLSecurityException
     */
    public EncryptedKey itemEncryptedKey(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     *
     * @param referentElement
     * @param secureValidation
     *
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemPGPData
     *
     * @param i
     * @return the asked PGPData element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param secureValidation
     *
     * @throws XMLSecurityException
     */
    private void validateReference(Element referentElement, boolean secureValidation) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked PGPData element, null if the index is too big
     * @throws XMLSecurityException
     */
    public PGPData itemPGPData(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
    PrivateKey getPrivateKeyFromStaticResolvers() throws KeyResolverException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * Resolve the KeyInfoReference Element's URI attribute into a KeyInfo instance.
     *
     * @param element
     * @param baseURI
     * @param storage
```

### JavadocDeclaration
`@param x509data` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addX509Data
     *
     * @param x509data
     */
    public void add(X509Data x509data) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
    PrivateKey getPrivateKeyFromInternalResolvers() throws KeyResolverException {
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
    X509Certificate getX509CertificateFromInternalResolvers()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * This method returns a private key. This is for Key Transport in XML Encryption.
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
    public PrivateKey getPrivateKey() throws KeyResolverException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
    SecretKey getSecretKeyFromStaticResolvers() throws KeyResolverException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */

```

### JavadocDeclaration
`@param pk` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addDEREncodedKeyValue
     *
     * @param pk
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @param pk
     * @throws XMLSecurityException
     */
    public void addDEREncodedKeyValue(PublicKey pk) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemDEREncodedKeyValue
     *
     * @param i
     * @return the asked DEREncodedKeyValue element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked DEREncodedKeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
    public DEREncodedKeyValue itemDEREncodedKeyValue(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
    public X509Certificate getX509Certificate() throws KeyResolverException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemMgmtData
     *
     * @param i
     * @return the asked MgmtData element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked MgmtData element, null if the index is too big
     * @throws XMLSecurityException
     */
    public MgmtData itemMgmtData(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemKeyValue
     *
     * @param i
     * @return the asked KeyValue element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param storage` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return the KeyInfo which is referred to by this KeyInfoReference, or null if can not be resolved
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked KeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
    public KeyValue itemKeyValue(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param mgmtdata` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addMgmtData
     *
     * @param mgmtdata
     */
    public void addMgmtData(String mgmtdata) {
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param baseURI
     * @param storage
     * @param secureValidation
     * @return the KeyInfo which is referred to by this KeyInfoReference, or null if can not be resolved
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param unknownKeyValueElement` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addKeyValue
     *
     * @param unknownKeyValueElement
     */
    public void addKeyValue(Element unknownKeyValueElement) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param secureValidation
     * @return the KeyInfo which is referred to by this KeyInfoReference, or null if can not be resolved
     * @throws XMLSecurityException
     */
    private KeyInfo resolveReferentKeyInfo(Element element, String baseURI,
```

### JavadocDeclaration
`@param keyvalue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param keyvalue
     */
    public void add(KeyValue keyvalue) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemRetrievalMethod
     *
     * @param i
     *@return the asked RetrievalMethod element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param resource` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * Resolve the Element effectively represented by the XML signature input source.
     *
     * @param resource
     * @param secureValidation
     * @return the Element effectively represented by the XML signature input source.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     *@return the asked RetrievalMethod element, null if the index is too big
     * @throws XMLSecurityException
     */
    public RetrievalMethod itemRetrievalMethod(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     *
     * @param resource
     * @param secureValidation
     * @return the Element effectively represented by the XML signature input source.
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@param storageResolver` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addStorageResolver
     *
     * @param storageResolver
     */
    public void addStorageResolver(StorageResolver storageResolver) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * This method returns a secret (symmetric) key. This is for XML Encryption.
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
    public SecretKey getSecretKey() throws KeyResolverException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @param secureValidation
     * @return the Element effectively represented by the XML signature input source.
     * @throws CanonicalizationException
     * @throws ParserConfigurationException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
    PublicKey getPublicKeyFromInternalResolvers() throws KeyResolverException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @return the Element effectively represented by the XML signature input source.
     * @throws CanonicalizationException
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
```

### JavadocDeclaration
`@param mgmtdata` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param mgmtdata
     */
    public void add(MgmtData mgmtdata) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws KeyResolverException
```

### JavadocDeclaration
`@param pk` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param pk
     */
    public void add(PublicKey pk) {
```

### JavadocDeclaration
`@param pk` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addKeyValue
     *
     * @param pk
     */
    public void addKeyValue(PublicKey pk) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws KeyResolverException
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Constructor KeyInfo
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java`
#### Snippet
```java
     * @throws IOException
     * @throws SAXException
     * @throws KeyResolverException
     */
    private Element obtainReferenceElement(XMLSignatureInput resource, boolean secureValidation)
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public KeyInfo(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
    X509Certificate getX509CertificateFromStaticResolvers()
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemKeyInfoReference
     *
     * @param i
     * @return the asked KeyInfoReference element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked KeyInfoReference element, null if the index is too big
     * @throws XMLSecurityException
     */
    public KeyInfoReference itemKeyInfoReference(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param keyname` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param keyname
     */
    public void add(KeyName keyname) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemSPKIData
     *
     * @param i
     * @return the asked SPKIData element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked SPKIData element, null if the index is too big
     * @throws XMLSecurityException
     */
    public SPKIData itemSPKIData(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param rsakeyvalue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param rsakeyvalue
     */
    public void add(RSAKeyValue rsakeyvalue) {
```

### JavadocDeclaration
`@param dsakeyvalue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param dsakeyvalue
     */
    public void add(DSAKeyValue dsakeyvalue) {
```

### JavadocDeclaration
`@param spkidata` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param spkidata
     */
    public void add(SPKIData spkidata) {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method itemX509Data
     *
     * @param i
     * @return the asked X509Data element, null if the index is too big
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param i
     * @return the asked X509Data element, null if the index is too big
     * @throws XMLSecurityException
     */
    public X509Data itemX509Data(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param URI` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addKeyInfoReference
     *
     * @param URI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @param URI
     * @throws XMLSecurityException
     */
    public void addKeyInfoReference(String URI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addRetrievalMethod
     *
     * @param uri
     * @param transforms
     * @param Type
```

### JavadocDeclaration
`@param transforms` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @param uri
     * @param transforms
     * @param Type
     */
```

### JavadocDeclaration
`@param Type` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * @param uri
     * @param transforms
     * @param Type
     */
    public void addRetrievalMethod(String uri, Transforms transforms, String Type) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addUnknownElement
     *
     * @param element
     */
    public void addUnknownElement(Element element) {
```

### JavadocDeclaration
`@param encryptedKey` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addEncryptedKey
     *
     * @param encryptedKey
     * @throws XMLEncryptionException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @param encryptedKey
     * @throws XMLEncryptionException
     */

```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return If the KeyInfo contains a PublicKey node
     * @throws KeyResolverException
     */
    public PublicKey getPublicKey() throws KeyResolverException {
```

### JavadocDeclaration
`@param derEncodedKeyValue` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param derEncodedKeyValue
     */
    public void add(DEREncodedKeyValue derEncodedKeyValue) {
```

### JavadocDeclaration
`@param keyInfoReference` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param keyInfoReference
     */
    public void add(KeyInfoReference keyInfoReference) {
```

### JavadocDeclaration
`@param keynameString` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addKeyName
     *
     * @param keynameString
     */
    public void addKeyName(String keynameString) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
    PublicKey getPublicKeyFromStaticResolvers() throws KeyResolverException {
```

### JavadocDeclaration
`@param realKeyResolver` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * object.
     *
     * @param realKeyResolver
     */
    public void registerInternalKeyResolver(KeyResolverSpi realKeyResolver) {
```

### JavadocDeclaration
`@param retrievalmethod` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method add
     *
     * @param retrievalmethod
     */
    public void add(RetrievalMethod retrievalmethod) {
```

### JavadocDeclaration
`@param pgpdata` tag description is missing
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Method addPGPData
     *
     * @param pgpdata
     */
    public void add(PGPData pgpdata) {
```

### JavadocDeclaration
`@param outputProcessorChain` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
     * Will be called when the whole document is processed.
     *
     * @param outputProcessorChain
     * @throws XMLStreamException   thrown when a streaming error occurs
     * @throws XMLSecurityException thrown when a Security failure occurs
```

### JavadocDeclaration
`@param processor` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
     * Add this processor after the given processor
     *
     * @param processor
     */
    void addAfterProcessor(Class<? extends OutputProcessor> processor);
```

### JavadocDeclaration
`@param xmlSecurityProperties` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
     * setter for the XMLSecurityProperties after instantiation of the processor
     *
     * @param xmlSecurityProperties
     */
    void setXMLSecurityProperties(XMLSecurityProperties xmlSecurityProperties);
```

### JavadocDeclaration
`@param processor` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
     * Add this processor before the given processor
     *
     * @param processor
     */
    void addBeforeProcessor(Class<? extends OutputProcessor> processor);
```

### JavadocDeclaration
`@param outputProcessorChain` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/OutputProcessor.java`
#### Snippet
```java
     *
     * @param xmlSecEvent          The next XMLEvent to process
     * @param outputProcessorChain
     * @throws XMLStreamException   thrown when a streaming error occurs
     * @throws XMLSecurityException thrown when a Security failure occurs
```

### JavadocDeclaration
`@param idToSign` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/SecurePart.java`
#### Snippet
```java
    /**
     * Use {@link #setIdToSecure(String)} instead.
     * @param idToSign
     */
    @Deprecated
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityConstants.java`
#### Snippet
```java
     *
     * @return a byte array of the given length
     * @throws XMLSecurityException
     */
    public static byte[] generateBytes(int length) throws XMLSecurityException {
```

### JavadocDeclaration
`@param securePart` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
     * Adds a part which must be encrypted by the framework
     *
     * @param securePart
     */
    public void addEncryptionPart(SecurePart securePart) {
```

### JavadocDeclaration
`@param actions` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
     * Specifies how to secure the document eg. Timestamp, Signature, Encrypt
     *
     * @param actions
     */
    public void setActions(List<XMLSecurityConstants.Action> actions) {
```

### JavadocDeclaration
`@param encryptionKeyIdentifier` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
     * Specifies the KeyIdentifierType to use in the secured document
     *
     * @param encryptionKeyIdentifier
     */
    public void setEncryptionKeyIdentifier(SecurityTokenConstants.KeyIdentifier encryptionKeyIdentifier) {
```

### JavadocDeclaration
`@param xmlSecEvent` tag description is missing
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityUtils.java`
#### Snippet
```java
     * Returns the XMLEvent type in String form
     *
     * @param xmlSecEvent
     * @return The XMLEvent type as string representation
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/SecurityTokenFactoryImpl.java`
#### Snippet
```java
     * @param data The <code>byte</code> array containing the X509 data
     * @return An X509 certificate
     * @throws XMLSecurityException
     */
    private static X509Certificate getCertificateFromBytes(byte[] data)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/securityToken/SecurityToken.java`
#### Snippet
```java
     * Returns the secret key's if already initialized, null otherwise
     * @return Algorithm-URI key map
     * @throws XMLSecurityException
     */
    Map<String, Key> getSecretKey() throws XMLSecurityException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/securityToken/SecurityToken.java`
#### Snippet
```java
     * Returns the public key if one exists and already initialized, null otherwise
     * @return the public key
     * @throws org.apache.xml.security.exceptions.XMLSecurityException
     */
    PublicKey getPublicKey() throws XMLSecurityException;
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/stax/securityToken/InboundSecurityToken.java`
#### Snippet
```java
     * Returns the public key if one exist for this token type
     *
     * @param algorithmURI
     * @param algorithmUsage
     * @return The Public-Key for asymmetric algorithms
```

### JavadocDeclaration
`@param algorithmUsage` tag description is missing
in `src/main/java/org/apache/xml/security/stax/securityToken/InboundSecurityToken.java`
#### Snippet
```java
     *
     * @param algorithmURI
     * @param algorithmUsage
     * @return The Public-Key for asymmetric algorithms
     * @throws XMLSecurityException if the key can't be loaded
```

### JavadocDeclaration
`@param algorithmUsage` tag description is missing
in `src/main/java/org/apache/xml/security/stax/securityToken/InboundSecurityToken.java`
#### Snippet
```java
     *
     * @param algorithmURI for the requested key
     * @param algorithmUsage
     * @return The requested key for the specified algorithmURI, or null if no matching key is found
     * @throws XMLSecurityException if the key can't be loaded
```

### JavadocDeclaration
`@param xpathnode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XPathAPI.java`
#### Snippet
```java
     *
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XPathAPI.java`
#### Snippet
```java
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     *  @return A NodeIterator, should never be null.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XPathAPI.java`
#### Snippet
```java
     *  @return A NodeIterator, should never be null.
     *
     * @throws TransformerException
     */
    NodeList selectNodeList(
```

### JavadocDeclaration
`@param xpathnode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JDKXPathAPI.java`
#### Snippet
```java
     *
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JDKXPathAPI.java`
#### Snippet
```java
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     *  @return A NodeIterator, should never be null.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JDKXPathAPI.java`
#### Snippet
```java
     *  @return A NodeIterator, should never be null.
     *
     * @throws TransformerException
     */
    public NodeList selectNodeList(
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     * Constructor Signature11ElementProxy
     *
     * @param doc
     */
    public Signature11ElementProxy(Document doc) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     * Constructor Signature11ElementProxy
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Signature11ElementProxy.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public Signature11ElementProxy(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/utils/HelperNodeList.java`
#### Snippet
```java
     * Method appendChild
     *
     * @param node
     * @throws IllegalArgumentException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/HelperNodeList.java`
#### Snippet
```java
     *
     * @param node
     * @throws IllegalArgumentException
     */
    public void appendChild(Node node) throws IllegalArgumentException {
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/xml/security/utils/HelperNodeList.java`
#### Snippet
```java
     * Method item
     *
     * @param index
     * @return node with index i
     */
```

### JavadocDeclaration
`@param allNodesMustHaveSameParent` tag description is missing
in `src/main/java/org/apache/xml/security/utils/HelperNodeList.java`
#### Snippet
```java

    /**
     * @param allNodesMustHaveSameParent
     */
    public HelperNodeList(boolean allNodesMustHaveSameParent) {
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * returns them as a byte array.
     *
     * @param inputStream
     * @return the bytes read from the stream
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * @return the bytes read from the stream
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static byte[] getBytesFromStream(InputStream inputStream) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * @param <T> the type of the class
     * @return the new instance
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * @return the new instance
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> T newInstanceWithEmptyConstructor(Class<T> clazz)
```

### JavadocDeclaration
`@param filename` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * Method writeBytesToFilename
     *
     * @param filename
     * @param bytes
     */
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     *
     * @param filename
     * @param bytes
     */
    public static void writeBytesToFilename(String filename, byte[] bytes) {
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * Method getBytesFromFile
     *
     * @param fileName
     * @return the bytes read from the file
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     * @return the bytes read from the file
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/JavaUtils.java`
#### Snippet
```java
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static byte[] getBytesFromFile(String fileName)
```

### JavadocDeclaration
`@param sa` tag description is missing
in `src/main/java/org/apache/xml/security/utils/SignerOutputStream.java`
#### Snippet
```java

    /**
     * @param sa
     */
    public SignerOutputStream(SignatureAlgorithm sa) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     * Constructor SignatureElementProxy
     *
     * @param doc
     */
    public SignatureElementProxy(Document doc) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     * Constructor SignatureElementProxy
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/SignatureElementProxy.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public SignatureElementProxy(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param mda` tag description is missing
in `src/main/java/org/apache/xml/security/utils/DigesterOutputStream.java`
#### Snippet
```java

    /**
     * @param mda
     */
    public DigesterOutputStream(MessageDigestAlgorithm mda) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverSpi.java`
#### Snippet
```java
     * @return the resource wrapped around a XMLSignatureInput
     *
     * @throws ResourceResolverException
     */
    public abstract XMLSignatureInput engineResolveURI(ResourceResolverContext context)
```

### JavadocDeclaration
`@param resourceBundle` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
    /**
     * Method init
     * @param resourceBundle
     */
    public static synchronized void init(ResourceBundle resourceBundle) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * Method getExceptionMessage
     *
     * @param msgID
     * @return message translated
     *
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * Method getExceptionMessage
     *
     * @param msgID
     * @param exArgs
     * @return message translated
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     * @return message translated
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * <CODE>exceptionMessagesResourceBundleBase</CODE>
     *
     * @param message
     * @param args is an <CODE>Object[]</CODE> array of strings which are inserted into
     * the String which is retrieved from the <CODE>ResouceBundle</CODE>
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * <CODE>XMLSecurityException.getExceptionMessage()</CODE>
     *
     * @param message
     * @return message translated
     */
```

### JavadocDeclaration
`@param languageCode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * Method init
     *
     * @param languageCode
     * @param countryCode
     */
```

### JavadocDeclaration
`@param countryCode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     *
     * @param languageCode
     * @param countryCode
     */
    public static synchronized void init(String languageCode, String countryCode) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     * Method getExceptionMessage
     *
     * @param msgID
     * @param originalException
     * @return message translated
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/utils/I18n.java`
#### Snippet
```java
     *
     * @param msgID
     * @param originalException
     * @return message translated
     */
```

### JavadocDeclaration
`@param currentPI` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * Outputs a PI to the internal Writer.
     *
     * @param currentPI
     * @param writer    where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * @param currentPI
     * @param writer    where to write the things
     * @throws IOException
     */
    protected static void outputPItoWriter(XMLSecProcessingInstruction currentPI, OutputStream writer, DocumentLevel position) throws IOException {
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * Outputs a Text of CDATA section to the internal Writer.
     *
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
     */
    protected static void outputTextToWriter(final String text, final OutputStream writer) throws IOException {
```

### JavadocDeclaration
`@param currentComment` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @param writer         writer where to write the things
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/stax/impl/transformer/canonicalizer/CanonicalizerBase.java`
#### Snippet
```java
     * @param currentComment
     * @param writer         writer where to write the things
     * @throws IOException
     */
    protected static void outputCommentToWriter(XMLSecComment currentComment, OutputStream writer, DocumentLevel position) throws IOException {
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method trim
     *
     * @param str
     * @return the string
     */
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method rfctoXML
     *
     * @param string
     * @return normalized string
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method semicolonToComma
     *
     * @param str
     * @return normalized string
     */
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method changeLess32toXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param string
     * @return normalized string
     * @throws IOException
     */
    static String changeLess32toXML(String string) throws IOException {
```

### JavadocDeclaration
`@param dn` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method xmldsigtoRFC2253
     *
     * @param dn
     * @return normalized string
     */
```

### JavadocDeclaration
`@param dn` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method normalize
     *
     * @param dn
     * @param toXml
     * @return normalized string
```

### JavadocDeclaration
`@param toXml` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param dn
     * @param toXml
     * @return normalized string
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method normalizeAT
     *
     * @param str
     * @return normalized string
     */
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method changeWStoXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param string
     * @return normalized string
     * @throws IOException
     */
    static String changeWStoXML(String string) throws IOException {
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method xmltoRFC
     *
     * @param string
     * @return normalized string
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method removeWSandReplace
     *
     * @param str
     * @param symbol
     * @param replace
```

### JavadocDeclaration
`@param symbol` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param str
     * @param symbol
     * @param replace
     * @return normalized string
```

### JavadocDeclaration
`@param replace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param str
     * @param symbol
     * @param replace
     * @return normalized string
     */
```

### JavadocDeclaration
`@param s` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Returns the number of Quotation from i to j
     *
     * @param s
     * @param i
     * @param j
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param s
     * @param i
     * @param j
     * @return number of quotes
```

### JavadocDeclaration
`@param j` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param s
     * @param i
     * @param j
     * @return number of quotes
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method removeWhiteSpace
     *
     * @param str
     * @param symbol
     * @return normalized string
```

### JavadocDeclaration
`@param symbol` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param str
     * @param symbol
     * @return normalized string
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method parseRDN
     *
     * @param str
     * @param toXml
     * @return normalized string
```

### JavadocDeclaration
`@param toXml` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
    static String parseRDN(String str, boolean toXml) throws IOException {
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method normalizeV
     *
     * @param str
     * @param toXml
     * @return normalized string
```

### JavadocDeclaration
`@param toXml` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
    static String normalizeV(String str, boolean toXml) throws IOException {
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method changeWStoRFC
     *
     * @param string
     * @return normalized string
     */
```

### JavadocDeclaration
`@param string` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method changeLess32toRFC
     *
     * @param string
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param string
     * @return normalized string
     * @throws IOException
     */
    static String changeLess32toRFC(String string) throws IOException {
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method parseATAV
     *
     * @param str
     * @param toXml
     * @return normalized string
```

### JavadocDeclaration
`@param toXml` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
    static String parseATAV(String str, boolean toXml) throws IOException {
```

### JavadocDeclaration
`@param dn` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method normalize
     *
     * @param dn
     * @return normalized string
     */
```

### JavadocDeclaration
`@param dn` tag description is missing
in `src/main/java/org/apache/xml/security/utils/RFC2253Parser.java`
#### Snippet
```java
     * Method rfc2253toXMLdsig
     *
     * @param dn
     * @return normalized string
     */
```

### JavadocDeclaration
`@param resourcePath` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverAnonymous.java`
#### Snippet
```java

    /**
     * @param resourcePath
     */
    public ResolverAnonymous(Path resourcePath) {
```

### JavadocDeclaration
`@param filename` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverAnonymous.java`
#### Snippet
```java

    /**
     * @param filename
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverAnonymous.java`
#### Snippet
```java
    /**
     * @param filename
     * @throws IOException
     */
    public ResolverAnonymous(String filename) throws IOException {
```

### JavadocDeclaration
`@param resourceResolverSpi` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
    /**
     * Registers a ResourceResolverSpi instance.
     * @param resourceResolverSpi
     * @param start
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@param start` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * Registers a ResourceResolverSpi instance.
     * @param resourceResolverSpi
     * @param start
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
```

### JavadocDeclaration
`@param individualResolvers` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * Method resolve
     *
     * @param individualResolvers
     * @param context
     * @return the resource
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     *
     * @param individualResolvers
     * @param context
     * @return the resource
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @return the resource
     *
     * @throws ResourceResolverException
     */
    public static XMLSignatureInput resolve(
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * Method resolve
     *
     * @param context
     * @return the resource
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @return the resource
     *
     * @throws ResourceResolverException
     */
    public static XMLSignatureInput resolve(ResourceResolverContext context)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
```

### JavadocDeclaration
`@param classNames` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * Registers a list of ResourceResolverSpi classes.
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolver.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
     * Method isXPointerSlash
     *
     * @param uri
     * @return true if begins with xpointer
     */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
     * Method getXPointerId
     *
     * @param uri
     * @return xpointerId to search.
     */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverXPointer.java`
#### Snippet
```java
     * Method isXPointerId
     *
     * @param uri
     * @return whether it has an xpointer id
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * Constructor ResourceResolverException
     *
     * @param originalException
     * @param uri
     * @param baseURI
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param uri
     * @param baseURI
     * @param msgID
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param originalException
     * @param uri
     * @param baseURI
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param uri
     * @param baseURI
     * @param msgID
     */
    public ResourceResolverException(Exception originalException,
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * Constructor ResourceResolverException
     *
     * @param msgID
     * @param uri
     * @param baseURI
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param uri
     * @param baseURI
     */
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param msgID
     * @param uri
     * @param baseURI
     */
    public ResourceResolverException(String msgID, String uri, String baseURI) {
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
    /**
     *
     * @param baseURI
     */
    public void setbaseURI(String baseURI) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * Constructor ResourceResolverException
     *
     * @param originalException
     * @param uri
     * @param baseURI
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param uri
     * @param baseURI
     * @param msgID
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param originalException
     * @param uri
     * @param baseURI
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param reader` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * with the bytes.
     *
     * @param reader
     * @return InputStream with the decoded bytes
     * @exception IOException passes what the reader throws
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return InputStream with the decoded bytes
     * @exception IOException passes what the reader throws
     * @throws IOException
     * @throws Base64DecodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @exception IOException passes what the reader throws
     * @throws IOException
     * @throws Base64DecodingException
     */
    public static final byte[] decode(BufferedReader reader)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * Method encodeToElement
     *
     * @param doc
     * @param localName
     * @param bytes
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     * @param doc
     * @param localName
     * @param bytes
     * @return an Element with the base64 encoded in the text.
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param doc
     * @param localName
     * @param bytes
     * @return an Element with the base64 encoded in the text.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param is containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
    public static final void decode(InputStream is, OutputStream os)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param base64Data Byte array containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
    public static final void decode(byte[] base64Data, OutputStream os)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param text Base 64 encoded text.
     * @return a decoded BigInteger
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromText(Text text)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * Method decodeBigIntegerFromElement
     *
     * @param element
     * @return the biginteger obtained from the node
     * @throws Base64DecodingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param element
     * @return the biginteger obtained from the node
     * @throws Base64DecodingException
     */
    public static final BigInteger decodeBigIntegerFromElement(Element element)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * base64 encoded BigInteger to the Element.
     *
     * @param element
     * @param biginteger
     */
```

### JavadocDeclaration
`@param biginteger` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     *
     * @param element
     * @param biginteger
     */
    public static final void fillElementWithBigInteger(Element element, BigInteger biginteger) {
```

### JavadocDeclaration
`@param base64` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * Method decode
     *
     * @param base64
     * @return the UTF bytes of the base64
     * @throws Base64DecodingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param base64
     * @return the UTF bytes of the base64
     * @throws Base64DecodingException
     *
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param base64Data String containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
    public static final void decode(String base64Data, OutputStream os)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * them as input for the <CODE>Base64.decode()</CODE> function.
     *
     * @param element
     * @return the byte obtained of the decoding the element
     * $todo$ not tested yet
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * @return the byte obtained of the decoding the element
     * $todo$ not tested yet
     * @throws Base64DecodingException
     */
    public static final byte[] decode(Element element) throws Base64DecodingException {
```

### JavadocDeclaration
`@param big` tag description is missing
in `src/main/java/org/apache/xml/security/utils/Base64.java`
#### Snippet
```java
     * Encode in Base64 the given <code>{@link BigInteger}</code>.
     *
     * @param big
     * @return String with Base64 encoding
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param uri
     * @param baseURI
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param baseURI
     * @param msgID
     * @param exArgs
     */
    public ResourceResolverException(Exception originalException, String uri,
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
    /**
     *
     * @param uri
     */
    public void setURI(String uri) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * Constructor ResourceResolverException
     *
     * @param msgID
     * @param exArgs
     * @param uri
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     * @param uri
     * @param baseURI
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param msgID
     * @param exArgs
     * @param uri
     * @param baseURI
     */
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverException.java`
#### Snippet
```java
     * @param exArgs
     * @param uri
     * @param baseURI
     */
    public ResourceResolverException(String msgID, Object[] exArgs, String uri,
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method length
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
     */
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method setDefaultPrefix
     *
     * @param namespace
     * @param prefix
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param namespace
     * @param prefix
     * @throws XMLSecurityException
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param namespace
     * @param prefix
     * @throws XMLSecurityException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the default prefix
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method addText
     *
     * @param text
     */
    public void addText(String text) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method setElement
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public void setElement(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * </PRE>
     *
     * @param prefix
     * @param uri
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param prefix
     * @param uri
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param prefix
     * @param uri
     * @throws XMLSecurityException
     */
    public void setXPathNamespaceContext(String prefix, String uri)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @return The base64 bytes from the text children of this element
     * @throws XMLSecurityException
     */
    public byte[] getBytesFromTextChild() throws XMLSecurityException {
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method addBase64Element
     *
     * @param bytes
     * @param localname
     */
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param bytes
     * @param localname
     */
    public void addBase64Element(byte[] bytes, String localname) {
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method addBase64Text
     *
     * @param bytes
     */
    public void addBase64Text(byte[] bytes) {
```

### JavadocDeclaration
`@param bi` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method addBigIntegerElement
     *
     * @param bi
     * @param localname
     */
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param bi
     * @param localname
     */
    public void addBigIntegerElement(BigInteger bi, String localname) {
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method getDefaultPrefix
     *
     * @param namespace
     * @return the default prefix bind to this element.
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * This method was refactored out of the constructor.
     *
     * @param doc
     * @param namespace
     * @param localName
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param doc
     * @param namespace
     * @param localName
     * @return The element created.
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param doc
     * @param namespace
     * @param localName
     * @return The element created.
     */
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method getVal
     *
     * @param localname
     * @param namespace
     * @return The biginteger contained in the given element
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param localname
     * @param namespace
     * @return The biginteger contained in the given element
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method guaranteeThatElementInCorrectSpace
     *
     * @throws XMLSecurityException
     */
    void guaranteeThatElementInCorrectSpace() throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Constructor ElementProxy
     *
     * @param doc
     */
    public ElementProxy(Document doc) {
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method addTextElement
     *
     * @param text
     * @param localname
     */
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param text
     * @param localname
     */
    public void addTextElement(String text, String localname) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Constructor ElementProxy
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public ElementProxy(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     * Method getTextFromChildElement
     *
     * @param localname
     * @param namespace
     * @return the Text of the textNode
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java
     *
     * @param localname
     * @param namespace
     * @return the Text of the textNode
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     * Constructor XMLParserException
     *
     * @param msgID
     */
    public XMLParserException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     * Constructor XMLParserException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public XMLParserException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     * Constructor XMLParserException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public XMLParserException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     * Constructor XMLParserException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/parser/XMLParserException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public XMLParserException(
```

### JavadocDeclaration
`@param n` tag description is missing
in `src/main/java/org/apache/xml/security/signature/NodeFilter.java`
#### Snippet
```java
     * in document order. The implementations can use this
     * restriction to optimize the transformation.
     * @param n
     * @param level the relative level in the tree
     * @return 1 if the node should be output.
```

### JavadocDeclaration
`@param n` tag description is missing
in `src/main/java/org/apache/xml/security/signature/NodeFilter.java`
#### Snippet
```java
    /**
     * Tells if a node must be output in c14n.
     * @param n
     * @return 1 if the node should be output.
     * 		   0 if node must not be output,
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     * Constructor XMLSignatureException
     *
     * @param msgID
     */
    public XMLSignatureException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     * Constructor XMLSignatureException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public XMLSignatureException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     * Constructor XMLSignatureException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public XMLSignatureException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     * Constructor XMLSignatureException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public XMLSignatureException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     * Constructor InvalidSignatureValueException
     *
     * @param msgID
     */
    public InvalidSignatureValueException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     * Constructor InvalidSignatureValueException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public InvalidSignatureValueException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     * Constructor InvalidSignatureValueException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public InvalidSignatureValueException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     * Constructor InvalidSignatureValueException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidSignatureValueException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public InvalidSignatureValueException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     * Constructor InvalidDigestValueException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public InvalidDigestValueException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     * Constructor InvalidDigestValueException
     *
     * @param msgID
     */
    public InvalidDigestValueException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     * Constructor InvalidDigestValueException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public InvalidDigestValueException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     * Constructor InvalidDigestValueException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/InvalidDigestValueException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public InvalidDigestValueException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/org/apache/xml/security/utils/resolver/implementations/ResolverDirectHTTP.java`
#### Snippet
```java
     * We resolve http URIs <I>without</I> fragment...
     *
     * @param context
     * @return true if can be resolved
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperty.java`
#### Snippet
```java
     * Method appendChild
     *
     * @param node
     * @return the node in this element.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperty.java`
#### Snippet
```java
     * @param element <code>SignatureProperty</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
    public SignatureProperty(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ObjectContainer.java`
#### Snippet
```java
     * @param element is <code>Object</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
    public ObjectContainer(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * This is the work horse for {@link #circumventBug2650}.
     *
     * @param node
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
```

### JavadocDeclaration
`@param xpathnode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * Method getStrFromNode
     *
     * @param xpathnode
     * @return the string for the node.
     */
```

### JavadocDeclaration
`@param contextNode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * <code>try{}</code> statement, but handle the Exceptions appropriately.</I>
     *
     * @param contextNode
     * @param os
     */
```

### JavadocDeclaration
`@param os` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param contextNode
     * @param os
     */
    public static void outputDOMc14nWithComments(Node contextNode, OutputStream os) {
```

### JavadocDeclaration
`@param e` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * Method addReturnToElement
     *
     * @param e
     */
    public static void addReturnToElement(Element e) {
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param nodeName
     * @param number
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
```

### JavadocDeclaration
`@param number` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * if the {@link Node} is a {@link Document}.
     *
     * @param xpathNodeSet
     * @return the owner document
     */
```

### JavadocDeclaration
`@param signatureElement` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param signatureElement
     * @param inputSet
     * @return nodes with the constrain
```

### JavadocDeclaration
`@param inputSet` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param signatureElement
     * @param inputSet
     * @return nodes with the constrain
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * hand in DOM spaces so that the nodes become visible in XPath space.
     *
     * @param doc
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption namespace and the local name
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption namespace and the local name
     * equals the supplied one
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param uri
     * @param nodeName
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
```

### JavadocDeclaration
`@param number` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption 1.1 namespace and the local name
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption 1.1 namespace and the local name
     * equals the supplied one
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * of the context node.
     *
     * @param ctx
     * @param descendantOrSelf
     * @return true if the node is descendant
```

### JavadocDeclaration
`@param descendantOrSelf` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param ctx
     * @param descendantOrSelf
     * @return true if the node is descendant
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * Method getFullTextChildrenFromNode
     *
     * @param node
     * @return the string of children
     */
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param nodeName
     * @param number
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
```

### JavadocDeclaration
`@param number` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
```

### JavadocDeclaration
`@param addPreamble` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     * @param addPreamble
     */
    public static void outputDOM(Node contextNode, OutputStream os, boolean addPreamble) {
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param rootNode
     * @param result
     * @param exclude
```

### JavadocDeclaration
`@param result` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param rootNode
     * @param result
     * @param exclude
     * @param com whether comments or not
```

### JavadocDeclaration
`@param exclude` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param rootNode
     * @param result
     * @param exclude
     * @param com whether comments or not
     */
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param nodeName
     * @param number
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
```

### JavadocDeclaration
`@param number` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * if the {@link Node} is a {@link Document}.
     *
     * @param node
     * @return the owner document of the node
     */
```

### JavadocDeclaration
`@param xpathNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * Method convertNodelistToSet
     *
     * @param xpathNodeSet
     * @return the set with the nodelist
     */
```

### JavadocDeclaration
`@param sibling` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java

    /**
     * @param sibling
     * @param uri
     * @param nodeName
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @return nodes with the constraint
```

### JavadocDeclaration
`@param nodeName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * @param sibling
     * @param uri
     * @param nodeName
     * @return nodes with the constraint
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperties.java`
#### Snippet
```java
     * @param element <code>SignatureProperties</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
    public SignatureProperties(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperties.java`
#### Snippet
```java
     * Constructor SignatureProperties
     *
     * @param doc
     */
    public SignatureProperties(Document doc) {
```

### JavadocDeclaration
`@param sp` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperties.java`
#### Snippet
```java
     * Method addSignatureProperty
     *
     * @param sp
     */
    public void addSignatureProperty(SignatureProperty sp) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignatureProperties.java`
#### Snippet
```java
     * @param i Index of the requested {@link SignatureProperty}
     * @return the <i>i</i><sup>th</sup> SignatureProperty
     * @throws XMLSignatureException
     */
    public SignatureProperty item(int i) throws XMLSignatureException {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     * Constructor ReferenceNotInitializedException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public ReferenceNotInitializedException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     * Constructor ReferenceNotInitializedException
     *
     * @param msgID
     */
    public ReferenceNotInitializedException(String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     * Constructor ReferenceNotInitializedException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public ReferenceNotInitializedException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     * Constructor ReferenceNotInitializedException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/ReferenceNotInitializedException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public ReferenceNotInitializedException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param reference` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
    /**
     * MissingKeyResourceFailureException constructor.
     * @param reference
     * @param msgID
     * @see #getReference
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * MissingKeyResourceFailureException constructor.
     * @param reference
     * @param msgID
     * @see #getReference
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * Constructor MissingResourceFailureException
     *
     * @param originalException
     * @param reference
     * @param msgID
```

### JavadocDeclaration
`@param reference` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param reference
     * @param msgID
     * @see #getReference
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * @param originalException
     * @param reference
     * @param msgID
     * @see #getReference
     */
```

### JavadocDeclaration
`@param reference` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * Constructor MissingResourceFailureException
     *
     * @param reference
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     *
     * @param reference
     * @param msgID
     * @param exArgs
     * @see #getReference
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * @param reference
     * @param msgID
     * @param exArgs
     * @see #getReference
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * Constructor MissingResourceFailureException
     *
     * @param originalException
     * @param reference
     * @param msgID
```

### JavadocDeclaration
`@param reference` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param reference
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * @param originalException
     * @param reference
     * @param msgID
     * @param exArgs
     * @see #getReference
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/MissingResourceFailureException.java`
#### Snippet
```java
     * @param reference
     * @param msgID
     * @param exArgs
     * @see #getReference
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     *
     * @return the canonicalization result octet stream of <code>SignedInfo</code> element
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @return the canonicalization result octet stream of <code>SignedInfo</code> element
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     * @throws IOException
     */
    public byte[] getCanonicalizedOctetStream()
```

### JavadocDeclaration
`@param os` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
    /**
     * Output the C14n stream to the given OutputStream.
     * @param os
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * Output the C14n stream to the given OutputStream.
     * @param os
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param os
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
    public void signInOctetStream(OutputStream os)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java

    /**
     * @param doc
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
```

### JavadocDeclaration
`@param signatureMethodElem` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
    /**
     * @param doc
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param canonicalizationMethodElem` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param doc
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
    public SignedInfo(
```

### JavadocDeclaration
`@param hMACOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param hMACOutputLength
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
    public SignedInfo(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param doc the {@link Document} in which <code>XMLsignature</code> will
     *    be placed
     * @throws XMLSecurityException
     */
    public SignedInfo(Document doc) throws XMLSecurityException {
```

### JavadocDeclaration
`@param hMACOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param hMACOutputLength
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param provider security provider to use
     * @param spec AlgorithmParameterSpec to use
     * @throws XMLSecurityException
     */
    public SignedInfo(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param element <code>SignedInfo</code>
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     *
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
    public boolean verify()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param followManifests defines whether the verification process has to verify referenced <CODE>ds:Manifest</CODE>s, too
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
    public boolean verify(boolean followManifests)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param secureValidation whether secure validation is enabled or not
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
    public SignedInfo(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     *    Canonicalization method
     * @param provider security provider to use
     * @throws XMLSecurityException
     */
    public SignedInfo(
```

### JavadocDeclaration
`@param secretKeyBytes` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * byte[] array password.
     *
     * @param secretKeyBytes
     * @return the secret key for the SignedInfo element.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
     * @param secureValidation whether secure validation is enabled or not
     * @param provider security provider to use
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
    /**
     *
     * @param doc
     * @param algorithmURI is the URI of the algorithm as String
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
     * Constructor Algorithm
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/Algorithm.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public Algorithm(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param os` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java

    /**
     * @param os
     */
    public void setOutputStream(OutputStream os) {
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Method getHTMLRepresentation
     *
     * @param inclusiveNamespaces
     * @throws XMLSignatureException
     * @return The HTML representation for this XMLSignature
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     *
     * @param inclusiveNamespaces
     * @throws XMLSignatureException
     * @return The HTML representation for this XMLSignature
     */
```

### JavadocDeclaration
`@param filter` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java

    /**
     * @param filter
     */
    public void addNodeFilter(NodeFilter filter) throws XMLParserException, IOException {
```

### JavadocDeclaration
`@param diOs` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java

    /**
     * @param diOs
     * @throws IOException
     * @throws CanonicalizationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
    /**
     * @param diOs
     * @throws IOException
     * @throws CanonicalizationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * @param diOs
     * @throws IOException
     * @throws CanonicalizationException
     */
    public void updateOutputStream(OutputStream diOs)
```

### JavadocDeclaration
`@param rootNode` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * method included the node and <I>all</I> its descendants in the output.
     *
     * @param rootNode
     */
    public XMLSignatureInput(Node rootNode) {
```

### JavadocDeclaration
`@param inputOctetStream` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * stream is directly read.
     *
     * @param inputOctetStream
     */
    public XMLSignatureInput(InputStream inputOctetStream)  {
```

### JavadocDeclaration
`@param mimeType` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Sets mimeType
     *
     * @param mimeType
     */
    public void setMIMEType(String mimeType) {
```

### JavadocDeclaration
`@param circumvent` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Returns the node set from input which was specified as the parameter of
     * {@link XMLSignatureInput} constructor
     * @param circumvent
     *
     * @return the node set
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     *
     * @return the node set
     * @throws XMLParserException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * @return the node set
     * @throws XMLParserException
     * @throws IOException
     */
    public Set<Node> getNodeSet(boolean circumvent) throws XMLParserException, IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * @return the Octet stream(byte Stream) from input which was specified as
     * the parameter of {@link XMLSignatureInput} constructor
     * @throws IOException
     */
    public InputStream getOctetStream() throws IOException  {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Method getHTMLRepresentation
     *
     * @throws XMLSignatureException
     * @return The HTML representation for this XMLSignature
     */
```

### JavadocDeclaration
`@param inputNodeSet` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Constructor XMLSignatureInput
     *
     * @param inputNodeSet
     */
    public XMLSignatureInput(Set<Node> inputNodeSet) {
```

### JavadocDeclaration
`@param sourceURI` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Sets SourceURI
     *
     * @param sourceURI
     */
    public void setSourceURI(String sourceURI) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * {@link XMLSignatureInput} constructor
     *
     * @throws CanonicalizationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     *
     * @throws CanonicalizationException
     * @throws IOException
     */
    public byte[] getBytes() throws IOException, CanonicalizationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     *
     * @return the node set
     * @throws XMLParserException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * @return the node set
     * @throws XMLParserException
     * @throws IOException
     */
    public Set<Node> getNodeSet() throws XMLParserException, IOException {
```

### JavadocDeclaration
`@param b` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java

    /**
     * @param b
     */
    public void setNodeSet(boolean b) {
```

### JavadocDeclaration
`@param currentPI` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * Normalizes a {@link org.w3c.dom.Comment} value
     *
     * @param currentPI
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param currentPI
     * @throws IOException
     */
    private void outputPItoWriter(ProcessingInstruction currentPI) throws IOException {
```

### JavadocDeclaration
`@param inclusiveNamespace` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param xmlSignatureInput the signature to pretty print
     * @param inclusiveNamespace
     */
    public XMLSignatureInputDebugger(
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * </UL>
     *
     * @param name
     * @param value
     * @throws IOException
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param name
     * @param value
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * @param name
     * @param value
     * @throws IOException
     */
    private void outputAttrToWriter(String name, String value) throws IOException {
```

### JavadocDeclaration
`@param currentComment` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param currentComment
     * @throws IOException
     */
    private void outputCommentToWriter(Comment currentComment) throws IOException {
```

### JavadocDeclaration
`@param currentNode` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * Method canonicalizeXPathNodeSet
     *
     * @param currentNode
     * @throws XMLSignatureException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param currentNode
     * @throws XMLSignatureException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * @param currentNode
     * @throws XMLSignatureException
     * @throws IOException
     */
    private void canonicalizeXPathNodeSet(Node currentNode)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @return The HTML Representation.
     * @throws XMLSignatureException
     */
    public String getHTMLRepresentation() throws XMLSignatureException {
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     * Method outputTextToWriter
     *
     * @param text
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInputDebugger.java`
#### Snippet
```java
     *
     * @param text
     * @throws IOException
     */
    private void outputTextToWriter(String text) throws IOException {
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     * @return the result of the {@link java.security.MessageDigest#digest(byte[])} method
     */
```

### JavadocDeclaration
`@param digesta` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param digesta
     * @param digestb
     * @return the result of the {@link java.security.MessageDigest#isEqual} method
```

### JavadocDeclaration
`@param digestb` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     *
     * @param digesta
     * @param digestb
     * @return the result of the {@link java.security.MessageDigest#isEqual} method
     */
```

### JavadocDeclaration
`@param buf` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     *
     * @param buf
     * @param offset
     * @param len
     */
```

### JavadocDeclaration
`@param len` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param buf
     * @param offset
     * @param len
     */
    public void update(byte[] buf, int offset, int len) {
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
    public void update(byte input) {
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
    public void update(byte[] input) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * Factory method for constructing a message digest algorithm by name.
     *
     * @param doc
     * @param algorithmURI
     * @return The MessageDigestAlgorithm element to attach in document and to digest
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     *
     * @param doc
     * @param algorithmURI
     * @return The MessageDigestAlgorithm element to attach in document and to digest
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param algorithmURI
     * @return The MessageDigestAlgorithm element to attach in document and to digest
     * @throws XMLSignatureException
     */
    public static MessageDigestAlgorithm getInstance(
```

### JavadocDeclaration
`@param buf` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     *
     * @param buf
     * @param offset
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
```

### JavadocDeclaration
`@param len` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param buf
     * @param offset
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
     * @throws java.security.DigestException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
     * @throws java.security.DigestException
     */
    public int digest(byte[] buf, int offset, int len) throws java.security.DigestException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * Constructor for the brave who pass their own message digest algorithms and the
     * corresponding URI.
     * @param doc
     * @param algorithmURI
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/MessageDigestAlgorithm.java`
#### Snippet
```java
     * corresponding URI.
     * @param doc
     * @param algorithmURI
     */
    private MessageDigestAlgorithm(Document doc, String algorithmURI)
```

### JavadocDeclaration
`@param referenceId` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * list of transformations to be performed.
     * @param digestURI The digest algorithm URI to be used.
     * @param referenceId
     * @param referenceType
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param referenceType` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param digestURI The digest algorithm URI to be used.
     * @param referenceId
     * @param referenceType
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param referenceId
     * @param referenceType
     * @throws XMLSignatureException
     */
    public void addDocument(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param index an index of into a {@link Manifest} or a {@link SignedInfo}
     * @return the results of reference validation at the specified index
     * @throws XMLSecurityException
     */
    public boolean getVerificationResult(int index) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * Method getReferencedContentPriorTransformsItem
     *
     * @param i
     * @return The contents before transformation of the reference i.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param i
     * @return The contents before transformation of the reference i.
     * @throws XMLSecurityException
     */
    public XMLSignatureInput getReferencedContentBeforeTransformsItem(int i)
```

### JavadocDeclaration
`@param followManifests` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * validations are available by using the {@link #getVerificationResult(int)} method
     *
     * @param followManifests
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @see org.apache.xml.security.signature.SignedInfo#verify(boolean)
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
    public boolean verifyReferences(boolean followManifests)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @see org.apache.xml.security.signature.SignedInfo#verify()
     * @see org.apache.xml.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
    public boolean verifyReferences()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param i Index of the requested {@link Reference}
     * @return the <i>i</i><sup>th</sup> reference
     * @throws XMLSecurityException
     */
    public Reference item(int i) throws XMLSecurityException {
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * Method getSignedContentItem
     *
     * @param i
     * @return The signed content of the i reference.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @return The signed content of the i reference.
     *
     * @throws XMLSignatureException
     */
    public byte[] getSignedContentItem(int i) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * process. This ensures that all necessary data is in place.
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
    public void generateDigestValues()
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @param secureValidation
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
    public Manifest(
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * Method getReferencedContentAfterTransformsItem
     *
     * @param i
     * @return The contents after transformation of the reference i.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param i
     * @return The contents after transformation of the reference i.
     * @throws XMLSecurityException
     */
    public XMLSignatureInput getReferencedContentAfterTransformsItem(int i)
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public Manifest(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param buf` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
     * @param offset
     * @param len
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param len` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
    protected abstract void engineUpdate(byte[] buf, int offset, int len)
```

### JavadocDeclaration
`@param HMACOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
    protected abstract void engineSetHMACOutputLength(int HMACOutputLength)
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException if this method is called on a MAC
     */
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    protected abstract void engineUpdate(byte[] input) throws XMLSignatureException;
```

### JavadocDeclaration
`@param params` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param params
     * @throws XMLSignatureException
     */
    protected abstract void engineSetParameter(AlgorithmParameterSpec params)
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    protected abstract void engineUpdate(byte input) throws XMLSignatureException;
```

### JavadocDeclaration
`@param signature` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
     */
    protected abstract boolean engineVerify(byte[] signature) throws XMLSignatureException;
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException if this method is called on a MAC
```

### JavadocDeclaration
`@param secureRandom` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException if this method is called on a MAC
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
     * Constructor SignatureEDDSA
     *
     * @throws XMLSignatureException
     */
    public SignatureEDDSA() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
         * Constructor SignatureEd25519
         *
         * @throws XMLSignatureException
         */
        public SignatureEd25519() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureEDDSA.java`
#### Snippet
```java
         * Constructor SignatureEd448
         *
         * @throws XMLSignatureException
         */
        public SignatureEd448() throws XMLSignatureException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * Method engineGetContextFromElement
     *
     * @param element
     */
    protected void engineGetContextFromElement(Element element) throws XMLSignatureException {
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * which is executed on the internal {@link javax.crypto.Mac#init(Key)} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException if this method is called on a Signature
```

### JavadocDeclaration
`@param algorithmParameterSpec` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException if this method is called on a Signature
     */
```

### JavadocDeclaration
`@param verificationKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     * Method engineInitVerify
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
    protected abstract void engineInitVerify(Key verificationKey) throws XMLSignatureException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithmSpi.java`
#### Snippet
```java
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
    protected abstract byte[] engineSign() throws XMLSignatureException;
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     * Method engineInitSign
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param algorithmParameterSpec` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
    protected void engineInitSign(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     * Constructor SignatureDSA
     *
     * @throws XMLSignatureException
     */
    public SignatureDSA() throws XMLSignatureException {
```

### JavadocDeclaration
`@param HMACOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureDSA.java`
#### Snippet
```java
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
    protected void engineSetHMACOutputLength(int HMACOutputLength) throws XMLSignatureException {
```

### JavadocDeclaration
`@param property` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptionProperties.java`
#### Snippet
```java
     * Adds an <code>EncryptionProperty</code>.
     *
     * @param property
     */
    void addEncryptionProperty(EncryptionProperty property);
```

### JavadocDeclaration
`@param property` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptionProperties.java`
#### Snippet
```java
     * Removes the specified <code>EncryptionProperty</code>.
     *
     * @param property
     */
    void removeEncryptionProperty(EncryptionProperty property);
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Method getJCEProviderFromURI
     *
     * @param algorithmURI
     * @return The JCEProvider for the given URI.
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Method getJCEKeyAlgorithmFromURI
     *
     * @param algorithmURI
     * @return The KeyAlgorithm for the given URI.
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
    /**
     * Method getAlgorithmClassFromURI
     * @param algorithmURI
     * @return the class name that implements this algorithm
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Method translateURItoJCEID
     *
     * @param algorithmURI
     * @return the JCE standard name corresponding to the given URI
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Method getAlgorithm
     *
     * @param algorithmURI
     * @return The Algorithm object for the given URI.
     */
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Returns the keylength in bits for a particular algorithm.
     *
     * @param algorithmURI
     * @return The length of the key used in the algorithm
     */
```

### JavadocDeclaration
`@param el` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
        /**
         * Gets data from element
         * @param el
         */
        public Algorithm(Element el) {
```

### JavadocDeclaration
`@param id` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     * Method register
     *
     * @param id
     * @param algorithm
     * @throws SecurityException if a security manager is installed and the
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
     *
     * @param id
     * @param algorithm
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the JCE algorithm
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param element ds:Signature element that contains the whole signature
     * @param baseURI URI to be prepended to all relative URIs
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
```

### JavadocDeclaration
`@param hmacOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param hmacOutputLength
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @throws XMLSecurityException
     */
    public XMLSignature(
```

### JavadocDeclaration
`@param hmacOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @param provider security provider to use.
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param hmacOutputLength
     * @param provider security provider to use.
     * @throws XMLSecurityException
     */
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI,
```

### JavadocDeclaration
`@param followManifests` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * to indicate that the References inside Manifests should be validated.
     *
     * @param followManifests
     * @see <a href="http://www.w3.org/TR/xmldsig-core/#sec-CoreValidation">
     * Core validation section in the XML Signature Rec.</a>
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
    /**
     *
     * @param msgID
     */
    public XMLEncryptionException(String msgID) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param digestURI URI of the digest algorithm to be used.
     * @see Manifest#addDocument
     * @throws XMLSignatureException
     */
    public void addDocument(
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java

    /**
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param hmacOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
    /**
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI,
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public XMLEncryptionException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param secureValidation whether secure secureValidation is enabled or not
     * @param provider security provider to use
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java

    /**
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param referenceURI URI according to the XML Signature specification.
     * @param trans List of transformations to be applied.
     * @throws XMLSignatureException
     */
    public void addDocument(String referenceURI, Transforms trans)
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
    /**
     * @param originalException
     * @param msgID
     */
    public XMLEncryptionException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * that was used to sign.
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
    public boolean checkSignatureValue(X509Certificate cert)
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
    /**
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param resolver` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * Adds a {@link ResourceResolverSpi} to enable the retrieval of resources.
     *
     * @param resolver
     */
    public void addResourceResolver(ResourceResolverSpi resolver) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @throws XMLSignatureException
     */
    public void addDocument(String referenceURI) throws XMLSignatureException {
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLEncryptionException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public XMLEncryptionException(String msgID, Object ... exArgs) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @param provider security provider to use.
     * @throws XMLSecurityException
     */
    public XMLSignature(
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
    /**
     *  Creates a XMLSignature in a Document
     * @param doc
     * @param baseURI
     * @param signatureMethodElem
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     *  Creates a XMLSignature in a Document
     * @param doc
     * @param baseURI
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
```

### JavadocDeclaration
`@param signatureMethodElem` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param doc
     * @param baseURI
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param canonicalizationMethodElem` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
    public XMLSignature(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI signature algorithm to use.
     * @throws XMLSecurityException
     */
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param signatureMethodURI the Signature method to be used.
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @throws XMLSecurityException
     */
    public XMLSignature(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be prepended to all relative URIs
     * @param secureValidation whether secure secureValidation is enabled or not
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
```

### JavadocDeclaration
`@param pk` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * the KeyInfo structure.
     *
     * @param pk
     */
    public void addKeyInfo(PublicKey pk) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param cert Certificate to be included. This should be the certificate of
     * the key that was used to sign.
     * @throws XMLSecurityException
     */
    public void addKeyInfo(X509Certificate cert) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param signingKey the {@link java.security.PrivateKey} or
     * {@link javax.crypto.SecretKey} that is used to sign.
     * @throws XMLSignatureException
     */
    public void sign(Key signingKey) throws XMLSignatureException {
```

### JavadocDeclaration
`@param secretKeyBytes` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * {@link javax.crypto.SecretKey} from octets.
     *
     * @param secretKeyBytes
     * @return the secret key created.
     * @see SignedInfo#createSecretKey(byte[])
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param referenceId Optional id attribute for this Reference
     * @param referenceType Optional mimetype for the URI
     * @throws XMLSignatureException
     */
    public void addDocument(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param signatureMethodURI signature algorithm to use.
     * @param provider security provider to use.
     * @throws XMLSecurityException
     */
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI, Provider provider)
```

### JavadocDeclaration
`@param asn1Bytes` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param asn1Bytes
     * @param rawLen
     * @return the decode bytes
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * or null if no such <code>ds:Object</code> element exists.
     *
     * @param i
     * @return the <code>i</code>th <code>ds:Object</code> child of the signature
     * or null if no such <code>ds:Object</code> element exists.
```

### JavadocDeclaration
`@param rawLen` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     *
     * @param asn1Bytes
     * @param rawLen
     * @return the decode bytes
     *
```

### JavadocDeclaration
`@param hmacOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @param provider security provider to use.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * @return the decode bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     * @see <A HREF="ftp://ftp.rfc-editor.org/in-notes/rfc4050.txt">3.3. ECDSA Signatures</A>
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSASHA224
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSASHA224() throws XMLSignatureException {
```

### JavadocDeclaration
`@param spec` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param canonicalizationMethodURI the canonicalization algorithm to be used to c14nize the SignedInfo element.
     * @param provider security provider to use.
     * @param spec
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@param xmldsigBytes` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param xmldsigBytes
     * @return the encoded ASN.1 bytes
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param provider security provider to use.
     * @param spec
     * @throws XMLSecurityException
     */
    public XMLSignature(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * @return the encoded ASN.1 bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     * @see <A HREF="ftp://ftp.rfc-editor.org/in-notes/rfc4050.txt">3.3. ECDSA Signatures</A>
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * {@link javax.crypto.SecretKey} that was used to sign
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
    public boolean checkSignatureValue(Key pk) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSASHA384
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSASHA384() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSARIPEMD160
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSARIPEMD160() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
     * @param baseURI URI to be prepended to all relative URIs
     * @param provider security provider to use
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
     * Constructor SignatureRSA
     *
     * @throws XMLSignatureException
     */
    public SignatureECDSA() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSASHA256
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSASHA256() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSASHA512
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSASHA512() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureECDSA.java`
#### Snippet
```java
         * Constructor SignatureECDSASHA1
         *
         * @throws XMLSignatureException
         */
        public SignatureECDSASHA1() throws XMLSignatureException {
```

### JavadocDeclaration
`@param params` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param params
     * @throws XMLSignatureException
     */
    public void setParameter(AlgorithmParameterSpec params) throws XMLSignatureException {
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param algorithmParameterSpec` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
    public void initSign(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @param secureValidation
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param secureValidation` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
    public SignatureAlgorithm(
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    public void update(byte input) throws XMLSignatureException {
```

### JavadocDeclaration
`@param signature` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if the signature is valid.
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @return true if the signature is valid.
     *
     * @throws XMLSignatureException
     */
    public boolean verify(byte[] signature) throws XMLSignatureException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public SignatureAlgorithm(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
    public byte[] sign() throws XMLSignatureException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @param hmacOutputLength
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param doc
     * @param algorithmURI
     * @param hmacOutputLength
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param hmacOutputLength` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param doc
     * @param algorithmURI
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param algorithmURI
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
    public SignatureAlgorithm(
```

### JavadocDeclaration
`@param buf` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
     * @param offset
     * @param len
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param len` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
    public void update(byte[] buf, int offset, int len) throws XMLSignatureException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param algorithmURI` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param doc
     * @param algorithmURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param doc
     * @param algorithmURI
     * @throws XMLSecurityException
     */
    public SignatureAlgorithm(Document doc, String algorithmURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    public void update(byte[] input) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
```

### JavadocDeclaration
`@param verificationKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
    public void initVerify(Key verificationKey) throws XMLSignatureException {
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param secureRandom` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
    public void initSign(Key signingKey, SecureRandom secureRandom) throws XMLSignatureException {
```

### JavadocDeclaration
`@param signingKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java
     *
     * @param signingKey
     * @throws XMLSignatureException
     */
    public void initSign(Key signingKey) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     *
     * @return The transforms that applied this reference.
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return The transforms that applied this reference.
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
    public Transforms getTransforms()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * Method getHTMLRepresentation
     * @return The HTML of the transformation
     * @throws XMLSignatureException
     */
    public String getHTMLRepresentation() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * Returns the XMLSignatureInput which is the result of the Transforms.
     * @return a XMLSignatureInput with all transformations applied.
     * @throws XMLSignatureException
     */
    public XMLSignatureInput getContentsAfterTransformation()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
    protected Reference(Element element, String baseURI, Manifest manifest, boolean secureValidation)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     *
     * @return the bytes that will be used to generated digest.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return the bytes that will be used to generated digest.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
    public byte[] getReferencedBytes()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
    protected Reference(Element element, String baseURI, Manifest manifest) throws XMLSecurityException {
```

### JavadocDeclaration
`@param manifest` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @param baseURI the URI of the resource where the XML instance will be stored
     * @param referenceURI URI indicate where is data which will digested
     * @param manifest
     * @param transforms {@link Transforms} applied to data
     * @param messageDigestAlgorithm {@link MessageDigestAlgorithm Digest algorithm} which is
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * Method generateDigestValue
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
    public void generateDigestValue()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return Gets a the node doing everything till the first c14n is needed
     *
     * @throws XMLSignatureException
     */
    public XMLSignatureInput getNodesetBeforeFirstCanonicalization()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return {@link MessageDigestAlgorithm}
     *
     * @throws XMLSignatureException
     */
    public MessageDigestAlgorithm getMessageDigestAlgorithm() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @param validating true if validating the reference
     * @return reference Calculate the digest of this reference.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return reference Calculate the digest of this reference.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
    private byte[] calculateDigest(boolean validating)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return the element to digest
     *
     * @throws XMLSignatureException
     * @see Manifest#verifyReferences()
     */
```

### JavadocDeclaration
`@param digestValue` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * Method setDigestValueElement
     *
     * @param digestValue
     */
    private void setDigestValueElement(byte[] digestValue) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     *
     * @return true if reference validation is success, otherwise false
     * @throws ReferenceNotInitializedException
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * @return true if reference validation is success, otherwise false
     * @throws ReferenceNotInitializedException
     * @throws XMLSecurityException
     */
    public boolean verify()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Serializer.java`
#### Snippet
```java
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
    byte[] serializeToByteArray(NodeList content) throws Exception;
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Serializer.java`
#### Snippet
```java

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Serializer.java`
#### Snippet
```java
    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Serializer.java`
#### Snippet
```java
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
    Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException, IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Serializer.java`
#### Snippet
```java
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>Element</code>.
     * @throws Exception
     */
    byte[] serializeToByteArray(Element element) throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacMD5
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacMD5() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacSHA256
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacSHA256() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacSHA224
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacSHA224() throws XMLSignatureException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineGetContextFromElement
     *
     * @param element
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param element
     * @throws XMLSignatureException
     */
    @Override
```

### JavadocDeclaration
`@param signature` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
     */
    protected boolean engineVerify(byte[] signature) throws XMLSignatureException {
```

### JavadocDeclaration
`@param secretKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineInitSign
     *
     * @param secretKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param algorithmParameterSpec` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param secretKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @param secretKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
    protected void engineInitSign(
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineAddContextToElement
     *
     * @param element
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method IntegrityHmac
     *
     * @throws XMLSignatureException
     */
    public IntegrityHmac() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacSHA1
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacSHA1() throws XMLSignatureException {
```

### JavadocDeclaration
`@param secretKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param secretKey
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/ReferenceList.java`
#### Snippet
```java
     * <code>DataReference</code> factory method. Returns a
     * <code>DataReference</code>.
     * @param uri
     * @return a <code>DataReference</code>.
     */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/ReferenceList.java`
#### Snippet
```java
     * <code>KeyReference</code> factory method. Returns a
     * <code>KeyReference</code>.
     * @param uri
     * @return a <code>KeyReference</code>.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param secretKey
     * @throws XMLSignatureException
     */
    protected void engineInitVerify(Key secretKey) throws XMLSignatureException {
```

### JavadocDeclaration
IllegalAccessException is not declared to be thrown by method add
in `src/main/java/org/apache/xml/security/encryption/ReferenceList.java`
#### Snippet
```java
     *
     * @param reference the reference to add.
     * @throws IllegalAccessException if the <code>Reference</code> is not an
     *   instance of <code>DataReference</code> or <code>KeyReference</code>.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacRIPEMD160
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacRIPEMD160() throws XMLSignatureException {
```

### JavadocDeclaration
`@param buf` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
     * @param offset
     * @param len
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param len` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
    protected void engineUpdate(byte[] buf, int offset, int len) throws XMLSignatureException {
```

### JavadocDeclaration
`@param secretKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineInitSign
     *
     * @param secretKey
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param secretKey
     * @throws XMLSignatureException
     */
    protected void engineInitSign(Key secretKey) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacSHA512
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacSHA512() throws XMLSignatureException {
```

### JavadocDeclaration
`@param length` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineSetHMACOutputLength
     *
     * @param length
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param length
     * @throws XMLSignatureException
     */
    @Override
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    protected void engineUpdate(byte[] input) throws XMLSignatureException {
```

### JavadocDeclaration
`@param secretKey` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * Method engineInitSign
     *
     * @param secretKey
     * @param secureRandom
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@param secureRandom` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param secretKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * @param secretKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
    protected void engineInitSign(Key secretKey, SecureRandom secureRandom)
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param input
     * @throws XMLSignatureException
     */
    protected void engineUpdate(byte input) throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
         * Constructor IntegrityHmacSHA384
         *
         * @throws XMLSignatureException
         */
        public IntegrityHmacSHA384() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
    protected byte[] engineSign() throws XMLSignatureException {
```

### JavadocDeclaration
`@param params` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/IntegrityHmac.java`
#### Snippet
```java
     *
     * @param params
     * @throws XMLSignatureException
     */
    protected void engineSetParameter(AlgorithmParameterSpec params) throws XMLSignatureException {
```

### JavadocDeclaration
`@param attribute` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptionProperty.java`
#### Snippet
```java
     * Returns the attribute's value in the <code>xml</code> namespace.
     *
     * @param attribute
     * @return the attribute's value.
     */
```

### JavadocDeclaration
`@param target` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptionProperty.java`
#### Snippet
```java
     * Sets the target.
     *
     * @param target
     */
    void setTarget(String target);
```

### JavadocDeclaration
`@param id` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptionProperty.java`
#### Snippet
```java
     * Sets the id.
     *
     * @param id
     */
    void setId(String id);
```

### JavadocDeclaration
`@param kanonce` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/AgreementMethod.java`
#### Snippet
```java
    /**
     * Sets the KANonce.jj
     * @param kanonce
     */
    void setKANonce(byte[] kanonce);
```

### JavadocDeclaration
`@param info` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Reference.java`
#### Snippet
```java
     * Removes the specified retrieval information.
     *
     * @param info
     */
    void removeElementRetrievalInformation(Element info);
```

### JavadocDeclaration
`@param info` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/Reference.java`
#### Snippet
```java
     * Adds retrieval information.
     *
     * @param info
     */
    void addElementRetrievalInformation(Element info);
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/CipherData.java`
#### Snippet
```java
     *
     * @param value the value of the <code>CipherData</code>.
     * @throws XMLEncryptionException
     */
    void setCipherValue(CipherValue value) throws XMLEncryptionException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/CipherData.java`
#### Snippet
```java
     *
     * @param reference an external location containing the encrypted octet sequence.
     * @throws XMLEncryptionException
     */
    void setCipherReference(CipherReference reference) throws XMLEncryptionException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/AbstractSerializer.java`
#### Snippet
```java
     * @return the <code>byte[]</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
    public byte[] serializeToByteArray(Element element) throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/AbstractSerializer.java`
#### Snippet
```java
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
    public byte[] serializeToByteArray(NodeList content) throws Exception {
```

### JavadocDeclaration
`@param encoding` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptedType.java`
#### Snippet
```java
     * <code>EncryptedType</code>.
     *
     * @param encoding
     */
    void setEncoding(String encoding);
```

### JavadocDeclaration
`@param id` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptedType.java`
#### Snippet
```java
     * Sets the id.
     *
     * @param id
     */
    void setId(String id);
```

### JavadocDeclaration
`@param properties` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/EncryptedType.java`
#### Snippet
```java
     * information about the generation of the <code>EncryptedType</code>.
     *
     * @param properties
     */
    void setEncryptionProperties(EncryptionProperties properties);
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java
    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
    public Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException, IOException {
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java

    /**
     * @param ctx
     * @param inputStream
     * @return the Node resulting from the parse of the source
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java
    /**
     * @param ctx
     * @param inputStream
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/DocumentSerializer.java`
#### Snippet
```java
     * @param inputStream
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
    private Node deserialize(Node ctx, InputStream inputStream) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     * Constructor AlgorithmAlreadyRegisteredException
     *
     * @param msgID
     */
    public AlgorithmAlreadyRegisteredException(String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     * Constructor AlgorithmAlreadyRegisteredException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public AlgorithmAlreadyRegisteredException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     * Constructor AlgorithmAlreadyRegisteredException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public AlgorithmAlreadyRegisteredException(
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     * Constructor AlgorithmAlreadyRegisteredException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public AlgorithmAlreadyRegisteredException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     * Constructor Base64DecodingException
     *
     * @param msgID
     */
    public Base64DecodingException(String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     * Constructor Base64DecodingException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public Base64DecodingException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     * Constructor Base64DecodingException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public Base64DecodingException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     * Constructor Base64DecodingException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/Base64DecodingException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public Base64DecodingException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA256
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA256() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA1MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA1MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA3_256MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA3_256MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA512MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA512MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
     * Constructor SignatureRSA
     *
     * @throws XMLSignatureException
     */
    public SignatureBaseRSA() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA3_512MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA3_512MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA3_224MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA3_224MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA384MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA384MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSAMD5
         *
         * @throws XMLSignatureException
         */
        public SignatureRSAMD5() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA256MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA256MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA3_384MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA3_384MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA224MGF1
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA224MGF1() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSARIPEMD160
         *
         * @throws XMLSignatureException
         */
        public SignatureRSARIPEMD160() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA384
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA384() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA224
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA224() throws XMLSignatureException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/SignatureBaseRSA.java`
#### Snippet
```java
         * Constructor SignatureRSASHA512
         *
         * @throws XMLSignatureException
         */
        public SignatureRSASHA512() throws XMLSignatureException {
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java
    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
    public Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException, IOException {
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java

    /**
     * @param ctx
     * @param source
     * @return the Node resulting from the parse of the source
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java
    /**
     * @param ctx
     * @param source
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/TransformSerializer.java`
#### Snippet
```java
     * @param source
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
    private Node deserialize(Node ctx, Source source) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     * @param originalException
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     * @param originalException
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * @param msgID
     * @param exArgs
     * @param originalException
     */
    public XMLSecurityException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * Constructor XMLSecurityException
     *
     * @param originalException
     */
    public XMLSecurityException(Exception originalException) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * Constructor XMLSecurityException
     *
     * @param msgID
     */
    public XMLSecurityException(String msgID) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public XMLSecurityException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgId` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     * Constructor InvalidTransformException
     *
     * @param msgId
     * @param exArgs
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param originalException
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/exceptions/XMLSecurityException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param originalException
     */
    public XMLSecurityException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     *
     * @param msgId
     * @param exArgs
     */
    public InvalidTransformException(String msgId, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgId` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     * Constructor InvalidTransformException
     *
     * @param msgId
     * @param exArgs
     * @param originalException
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     *
     * @param msgId
     * @param exArgs
     * @param originalException
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     * @param msgId
     * @param exArgs
     * @param originalException
     */
    public InvalidTransformException(Exception originalException, String msgId, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgId` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     * Constructor InvalidTransformException
     *
     * @param msgId
     * @param originalException
     */
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     *
     * @param msgId
     * @param originalException
     */
    public InvalidTransformException(Exception originalException, String msgId) {
```

### JavadocDeclaration
`@param msgId` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/InvalidTransformException.java`
#### Snippet
```java
     * Constructor InvalidTransformException
     *
     * @param msgId
     */
    public InvalidTransformException(String msgId) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     * Constructor TransformationException
     *
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     *
     * @param msgID
     * @param exArgs
     */
    public TransformationException(String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     * Constructor TransformationException
     *
     * @param originalException
     * @param msgID
     */
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     */
    public TransformationException(Exception originalException, String msgID) {
```

### JavadocDeclaration
`@param originalException` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     * Constructor TransformationException
     *
     * @param originalException
     * @param msgID
     * @param exArgs
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     *
     * @param originalException
     * @param msgID
     * @param exArgs
     */
```

### JavadocDeclaration
`@param exArgs` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     * @param originalException
     * @param msgID
     * @param exArgs
     */
    public TransformationException(Exception originalException, String msgID, Object[] exArgs) {
```

### JavadocDeclaration
`@param msgID` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformationException.java`
#### Snippet
```java
     * Constructor TransformationException
     *
     * @param msgID
     */
    public TransformationException(String msgID) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
     * Internal method to get bytes in decryption mode
     * @return the decrypted bytes
     * @throws XMLEncryptionException
     */
    private byte[] getDecryptBytes() throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
     *
     * @param data The <code>CipherData</code> object to read the bytes from
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
    public XMLCipherInput(CipherData data) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
     * @param input The <code>EncryptedType</code> object to read
     * the bytes from.
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
    public XMLCipherInput(EncryptedType input) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java
     * Dereferences the input and returns it as a single byte array.
     *
     * @throws XMLEncryptionException
     * @return The decripted bytes.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @param secureValidation Whether secure validation is enabled
     * @return {@link XMLSignatureInput} as the result of transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @return {@link XMLSignatureInput} as the result of transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws ParserConfigurationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws ParserConfigurationException
     * @throws SAXException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @throws InvalidCanonicalizerException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws TransformationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/TransformSpi.java`
#### Snippet
```java
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws TransformationException
     */
    protected abstract XMLSignatureInput enginePerformTransform(
```

### JavadocDeclaration
`@param xpath` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPathContainer.java`
#### Snippet
```java
     * Sets the TEXT value of the <CODE>ds:XPath</CODE> Element.
     *
     * @param xpath
     */
    public void setXPath(String xpath) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPathContainer.java`
#### Snippet
```java
     * Constructor XPathContainer
     *
     * @param doc
     */
    public XPathContainer(Document doc) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param os where to output the last transformation.
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
    public XMLSignatureInput performTransforms(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param xmlSignatureInput the input for the <code>Transform</code>s
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
    public XMLSignatureInput performTransforms(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param element  is <code>Transforms</code> element
     * @param baseURI the URI where the XML instance was stored
     * @throws DOMException
     * @throws InvalidTransformException
     * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param baseURI the URI where the XML instance was stored
     * @throws DOMException
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @throws DOMException
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
    public Transforms(Element element, String baseURI)
```

### JavadocDeclaration
`@param contextElement` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextElement
     * @throws TransformationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * transformation is applied to data
     * @param contextElement
     * @throws TransformationException
     */
    public void addTransform(String transformURI, Element contextElement)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param i index of {@link Transform} to return
     * @return the <i>i</i><sup>th</sup> Transform
     * @throws TransformationException
     */
    public Transform item(int i) throws TransformationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @throws TransformationException
     */
    public void addTransform(String transformURI) throws TransformationException {
```

### JavadocDeclaration
`@param contextNodes` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextNodes
     * @throws TransformationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transforms.java`
#### Snippet
```java
     * transformation is applied to data
     * @param contextNodes
     * @throws TransformationException
     */
    public void addTransform(String transformURI, NodeList contextNodes)
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     * Constructor XPathContainer
     *
     * @param doc
     * @param prefixList
     */
```

### JavadocDeclaration
`@param prefixList` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     *
     * @param doc
     * @param prefixList
     */
    public InclusiveNamespaces(Document doc, String prefixList) {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     * Constructor InclusiveNamespaces
     *
     * @param doc
     * @param prefixes
     */
```

### JavadocDeclaration
`@param prefixes` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     *
     * @param doc
     * @param prefixes
     */
    public InclusiveNamespaces(Document doc, Set<String> prefixes) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     * Constructor InclusiveNamespaces
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public InclusiveNamespaces(Element element, String baseURI)
```

### JavadocDeclaration
`@param inclusiveNamespaces` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/InclusiveNamespaces.java`
#### Snippet
```java
     * </UL>
     *
     * @param inclusiveNamespaces
     * @return A set to string
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Creates a new XPath2FilterContainer with the filter type "subtract".
     *
     * @param doc
     * @param xpath2filter
     * @return the filter.
```

### JavadocDeclaration
`@param xpath2filter` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param doc
     * @param xpath2filter
     * @return the filter.
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Constructor XPath2FilterContainer
     *
     * @param doc
     * @param xpath2filter
     * @param filterType
```

### JavadocDeclaration
`@param xpath2filter` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param doc
     * @param xpath2filter
     * @param filterType
     */
```

### JavadocDeclaration
`@param filterType` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * @param doc
     * @param xpath2filter
     * @param filterType
     */
    private XPath2FilterContainer(Document doc, String xpath2filter, String filterType) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Creates a XPath2FilterContainer from an existing Element; needed for verification.
     *
     * @param element
     * @param baseURI
     * @return the filter
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @return the filter
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * @return the filter
     *
     * @throws XMLSecurityException
     */
    public static XPath2FilterContainer newInstance(
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Method newInstances
     *
     * @param doc
     * @param params
     * @return the nodelist with the data
```

### JavadocDeclaration
`@param params` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param doc
     * @param params
     * @return the nodelist with the data
     */
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Creates a new XPath2FilterContainer with the filter type "union".
     *
     * @param doc
     * @param xpath2filter
     * @return the filter
```

### JavadocDeclaration
`@param xpath2filter` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param doc
     * @param xpath2filter
     * @return the filter
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Constructor XPath2FilterContainer
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@param baseURI` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    private XPath2FilterContainer(Element element, String baseURI) throws XMLSecurityException {
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     * Creates a new XPath2FilterContainer with the filter type "intersect".
     *
     * @param doc
     * @param xpath2filter
     * @return the filter.
```

### JavadocDeclaration
`@param xpath2filter` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/params/XPath2FilterContainer.java`
#### Snippet
```java
     *
     * @param doc
     * @param xpath2filter
     * @return the filter.
     */
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14NExclusive.java`
#### Snippet
```java
     * Method length
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
```

### JavadocDeclaration
`@param localname` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformC14NExclusive.java`
#### Snippet
```java
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @param element <code>ds:Transform</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     */
    public Transform(Element element, String baseURI)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @param contextChild the child element of <code>Transform</code> element
     * @param doc the proxy {@link Document}
     * @throws InvalidTransformException
     */
    public Transform(Document doc, String algorithmURI, Element contextChild)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
    public XMLSignatureInput performTransform(XMLSignatureInput input, boolean secureValidation)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
    public XMLSignatureInput performTransform(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * @param algorithmURI URI representation of <code>Transform algorithm</code>
     * @param contextNodes the child node list of <code>Transform</code> element
     * @throws InvalidTransformException
     */
    public Transform(Document doc, String algorithmURI, NodeList contextNodes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java
     * such as specified in
     * <a href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>Transform algorithm </a>
     * @throws InvalidTransformException
     */
    public Transform(Document doc, String algorithmURI) throws InvalidTransformException {
```

### JavadocDeclaration
`@param str` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath.java`
#### Snippet
```java

    /**
     * @param str
     * @return true if needs to be circumvent for bug.
     */
```

### JavadocDeclaration
`@param signatureElement` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java

    /**
     * @param signatureElement
     * @return the node that is the signature
     * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformEnvelopedSignature.java`
#### Snippet
```java
     * @param signatureElement
     * @return the node that is the signature
     * @throws TransformationException
     */
    private static Node searchSignatureElement(Node signatureElement)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
     *               If -1, choose one automatically.
     * @return the decoded bytes
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     * @see <A HREF="ftp://ftp.rfc-editor.org/in-notes/rfc4050.txt">3.3. ECDSA Signatures</A>
```

### JavadocDeclaration
`@param xmldsigBytes` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param xmldsigBytes
     * @return the encoded ASN.1 bytes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/algorithms/implementations/ECDSAUtils.java`
#### Snippet
```java
     * @param xmldsigBytes
     * @return the encoded ASN.1 bytes
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     * @see <A HREF="ftp://ftp.rfc-editor.org/in-notes/rfc4050.txt">3.3. ECDSA Signatures</A>
```

### JavadocDeclaration
`@param currentNode` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
    /**
     * Method rooted
     * @param currentNode
     * @param nodeList
     *
```

### JavadocDeclaration
`@param nodeList` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
     * Method rooted
     * @param currentNode
     * @param nodeList
     *
     * @return if rooted bye the rootnodes
```

### JavadocDeclaration
`@param currentNode` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
    /**
     * Method rooted
     * @param currentNode
     * @param nodeList
     *
```

### JavadocDeclaration
`@param nodeList` tag description is missing
in `src/main/java/org/apache/xml/security/transforms/implementations/TransformXPath2Filter.java`
#### Snippet
```java
     * Method rooted
     * @param currentNode
     * @param nodeList
     *
     * @return if rooted bye the rootnodes
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *
     * Does not modify the source document.
     * @param element
     * @return the bytes resulting from the decryption
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element
     * @return the bytes resulting from the decryption
     * @throws XMLEncryptionException
     */
    public byte[] decryptToByteArray(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param uri
         * @return a new CipherReference
         */
```

### JavadocDeclaration
`@param data` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             * Constructor.
             * @param data
             */
            protected EncryptedTypeImpl(CipherData data) {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param uri
             */
            public CipherReferenceImpl(String uri) {
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param type
             */
            public CipherDataImpl(int type) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new KeyInfo
         * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         * @param element
         * @return a new KeyInfo
         * @throws XMLEncryptionException
         */
        KeyInfo newKeyInfo(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new EncryptionMethod
         */
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param algorithm
         * @return a new EncryptionMethod
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param random The SecureRandom instance to use when initializing the Cipher
     * @return the <code>EncryptedKey</code>
     * @throws XMLEncryptionException
     */
    public EncryptedKey encryptKey(
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param doc
             */
            public TransformsImpl(Document doc) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element the <code>Element</code> that will be loaded
     * @return the <code>EncryptedKey</code>
     * @throws XMLEncryptionException
     */
    public EncryptedKey loadEncryptedKey(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param context the context <code>Document</code>.
     * @param element the <code>Element</code> that will be loaded
     * @throws XMLEncryptionException
     * @return the <code>EncryptedData</code>
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *    <code>false</code> otherwise
     * @return the <code>EncryptedData</code>
     * @throws Exception
     */
    public EncryptedData encryptData(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * perform encryption
     * @return the <code>EncryptedKey</code>
     * @throws XMLEncryptionException
     */
    public EncryptedKey encryptKey(Document doc, Key key) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param uri
             */
            public CipherReferenceImpl(Attr uri) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element the <code>EncryptedData</code> to decrypt.
     * @return the <code>Node</code> as a result of the decrypt operation.
     * @throws XMLEncryptionException
     */
    private Document decryptElement(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param value
         * @return a new CipherValue
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * to be decrypted.
     * @return a key corresponding to the given type
     * @throws XMLEncryptionException
     */
    public Key decryptKey(EncryptedKey encryptedKey) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param opmode the operation mode of this cipher (this is one of the
     *   following: ENCRYPT_MODE, DECRYPT_MODE, WRAP_MODE or UNWRAP_MODE)
     * @param key
     * @see javax.crypto.Cipher#init(int, java.security.Key)
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param key
     * @see javax.crypto.Cipher#init(int, java.security.Key)
     * @throws XMLEncryptionException
     */
    public void init(int opmode, Key key) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param algorithm
             */
            public AgreementMethodImpl(String algorithm) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param digestMethod      An optional digestMethod to use
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getProviderInstance(
```

### JavadocDeclaration
`@param properties` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param properties
             */
            public void setEncryptionProperties(EncryptionProperties properties) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new CipherValue
         */
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param type
             */
            public void setType(String type) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param element
             * @throws XMLSignatureException
             * @throws InvalidTransformException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             *
             * @param element
             * @throws XMLSignatureException
             * @throws InvalidTransformException
             * @throws XMLSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             * @param element
             * @throws XMLSignatureException
             * @throws InvalidTransformException
             * @throws XMLSecurityException
             * @throws TransformationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             * @throws XMLSignatureException
             * @throws InvalidTransformException
             * @throws XMLSecurityException
             * @throws TransformationException
             */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
             * @throws InvalidTransformException
             * @throws XMLSecurityException
             * @throws TransformationException
             */
            public TransformsImpl(Element element)
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             * Constructor.
             * @param algorithm
             */
            public EncryptionMethodImpl(String algorithm) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param digestMethod      An optional digestMethod to use
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getInstance(String transformation, String canon, String digestMethod)
```

### JavadocDeclaration
`@param data` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param data
             */
            public EncryptedKeyImpl(CipherData data) {
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             * Constructor.
             * @param type
             */
            public ReferenceListImpl(int type) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new EncryptionProperty
         */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new ReferenceList
         */
```

### JavadocDeclaration
`@param data` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param data
         * @return a new EncryptedData
         */
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
    private class Factory {
        /**
         * @param algorithm
         * @return a new AgreementMethod
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param digestMethod      An optional digestMethod to use
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getProviderInstance(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * </EncryptedData>
     * -->
     * @throws XMLEncryptionException
     */
    public EncryptedData createEncryptedData(int type, String value) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new EncryptedData
         * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         * @param element
         * @return a new EncryptedData
         * @throws XMLEncryptionException
         *
         */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
    /**
     *
     * @param element
     * @return the <code>Node</code> as a result of the decrypt operation.
     * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element
     * @return the <code>Node</code> as a result of the decrypt operation.
     * @throws XMLEncryptionException
     */
    private Document decryptElementContent(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param type
         * @return a new CipherData
         *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *   <code>NodeList</code> having replaced the content of the source
     *   <code>Element</code>.
     * @throws Exception
     */
    private Document encryptElementContent(Element element) throws /* XMLEncryption */Exception {
```

### JavadocDeclaration
`@param info` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param info
             */
            public void setKeyInfo(KeyInfo info) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element the <code>Element</code> that will be loaded
     * @return the <code>EncryptedKey</code>
     * @throws XMLEncryptionException
     */
    public EncryptedKey loadEncryptedKey(Document context, Element element)
```

### JavadocDeclaration
`@param data` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param data
             */
            public EncryptedDataImpl(CipherData data) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param provider          the JCE provider that supplies the transformation
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getProviderInstance(String transformation, String provider)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param algorithm Algorithm for the decrypted key
     * @return a key corresponding to the given type
     * @throws XMLEncryptionException
     */
    public Key decryptKey(EncryptedKey encryptedKey, String algorithm)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param transformation    the name of the transformation
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getInstance(Serializer serializer, String transformation) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new EncryptionProperties
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param oaepParams The OAEPParams to use
     * @return the <code>EncryptedKey</code>
     * @throws XMLEncryptionException
     */
    public EncryptedKey encryptKey(
```

### JavadocDeclaration
`@param keyResolver` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * UNWRAP modes.
     *
     * @param keyResolver
     */
    public void registerInternalKeyResolver(KeyResolverSpi keyResolver) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element the <code>Element</code> that will be encrypted.
     * @return the <code>EncryptedData</code>
     * @throws Exception
     */
    public EncryptedData encryptData(Document context, Element element) throws
```

### JavadocDeclaration
`@param doc` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param doc
         * @return a new Transforms
         */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new CipherData
         * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         * @param element
         * @return a new CipherData
         * @throws XMLEncryptionException
         */
        CipherData newCipherData(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @return the context <code>Document</code> with the encrypted
     *   <code>Element</code> having replaced the source <code>Element</code>.
     *  @throws Exception
     */
    private Document encryptElement(Element element) throws Exception{
```

### JavadocDeclaration
`@param content` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param element the <code>Element</code> which contents is to be
     *   encrypted.
     * @param content
     * @return the processed <code>Document</code>.
     * @throws Exception to indicate any exceptional conditions.
```

### JavadocDeclaration
`@param encryptedData` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param encryptedData
         * @return the XML Element form of that EncryptedData
         */
```

### JavadocDeclaration
`@param method` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param method
             */
            public void setEncryptionMethod(EncryptionMethod method) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *   <code>XMLCipher.TRIPLEDES</code> which is shorthand for
     *   &quot;http://www.w3.org/2001/04/xmlenc#tripledes-cbc&quot;
     * @throws XMLEncryptionException
     * @return the XMLCipher
     * @see javax.crypto.Cipher#getInstance(java.lang.String)
```

### JavadocDeclaration
`@param encoding` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param encoding
             */
            public void setEncoding(String encoding) {
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param type
             */
            public void setMimeType(String type) {
```

### JavadocDeclaration
`@param referenceList` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param referenceList
         * @return the XML Element form of that ReferenceList
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * </EncryptedData>
     * -->
     * @throws XMLEncryptionException
     */
    public EncryptedKey createEncryptedKey(int type, String value) throws XMLEncryptionException {
```

### JavadocDeclaration
`@param data` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param data
         * @return a new EncryptedKey
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *                          serializer
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getProviderInstance(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param serializedData the serialized data
     * @return the <code>EncryptedData</code>
     * @throws Exception
     */
    public EncryptedData encryptData(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *
     * @return The XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getInstance() throws XMLEncryptionException {
```

### JavadocDeclaration
`@param id` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            /**
             *
             * @param id
             */
            public void setId(String id) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new EncryptedKey
         * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         * @param element
         * @return a new EncryptedKey
         * @throws XMLEncryptionException
         */
        EncryptedKey newEncryptedKey(Element element) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     * @param provider          the JCE provider that supplies the transformation
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getProviderInstance(String provider) throws XMLEncryptionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
     *                          standard serializer
     * @return the XMLCipher
     * @throws XMLEncryptionException
     */
    public static XMLCipher getInstance(String transformation, String canon)
```

### JavadocDeclaration
`@param encryptedKey` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param encryptedKey
         * @return the XML Element form of that EncryptedKey
         */
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

            /**
             * @param value
             */
            public CipherValueImpl(String value) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        /**
         * @param element
         * @return a new CipherReference
         * @throws XMLEncryptionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
         * @param element
         * @return a new CipherReference
         * @throws XMLEncryptionException
         *
         */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `xi` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheOctetStreamData.java`
#### Snippet
```java
    implements ApacheData {

    private XMLSignatureInput xi;

    public ApacheOctetStreamData(XMLSignatureInput xi)
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRetrievalMethod.java`
#### Snippet
```java
    private final List<Transform> transforms;
    private String uri;
    private String type;
    private Attr here;

```

### FieldMayBeFinal
Field `uri` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMRetrievalMethod.java`
#### Snippet
```java

    private final List<Transform> transforms;
    private String uri;
    private String type;
    private Attr here;
```

### FieldMayBeFinal
Field `xi` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/ApacheNodeSetData.java`
#### Snippet
```java
public class ApacheNodeSetData implements ApacheData, NodeSetData {

    private XMLSignatureInput xi;

    public ApacheNodeSetData(XMLSignatureInput xi) {
```

### FieldMayBeFinal
Field `withComments` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
        private List<Node> nodeSet;
        private ListIterator<Node> li;
        private boolean withComments;

        DelayedNodeIterator(Node root, boolean excludeComments) {
```

### FieldMayBeFinal
Field `root` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java

    private boolean excludeComments;
    private Node root;

    public DOMSubTreeData(Node root, boolean excludeComments) {
```

### FieldMayBeFinal
Field `excludeComments` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
public class DOMSubTreeData implements NodeSetData {

    private boolean excludeComments;
    private Node root;

```

### FieldMayBeFinal
Field `root` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSubTreeData.java`
#### Snippet
```java
     */
    static class DelayedNodeIterator implements Iterator<Node> {
        private Node root;
        private List<Node> nodeSet;
        private ListIterator<Node> li;
```

### FieldMayBeFinal
Field `signatureMethod` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java
    private List<Reference> references;
    private CanonicalizationMethod canonicalizationMethod;
    private SignatureMethod signatureMethod;
    private String id;
    private Document ownerDoc;
```

### FieldMayBeFinal
Field `references` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java
        Constants.MoreAlgorithmsSpecNS + "hmac-md5";

    private List<Reference> references;
    private CanonicalizationMethod canonicalizationMethod;
    private SignatureMethod signatureMethod;
```

### FieldMayBeFinal
Field `canonicalizationMethod` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMSignedInfo.java`
#### Snippet
```java

    private List<Reference> references;
    private CanonicalizationMethod canonicalizationMethod;
    private SignatureMethod signatureMethod;
    private String id;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private static final org.slf4j.Logger LOG =
        org.slf4j.LoggerFactory.getLogger(DOMXMLSignature.class);
    private String id;
    private SignatureValue sv;
    private KeyInfo ki;
```

### FieldMayBeFinal
Field `objects` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private SignatureValue sv;
    private KeyInfo ki;
    private List<XMLObject> objects;
    private SignedInfo si;
    private Document ownerDoc = null;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
        implements SignatureValue
    {
        private String id;
        private byte[] value;
        private String valueBase64;
```

### FieldMayBeFinal
Field `si` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
    private KeyInfo ki;
    private List<XMLObject> objects;
    private SignedInfo si;
    private Document ownerDoc = null;
    private Element localSigElem = null;
```

### FieldMayBeFinal
Field `sv` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMXMLSignature.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(DOMXMLSignature.class);
    private String id;
    private SignatureValue sv;
    private KeyInfo ki;
    private List<XMLObject> objects;
```

### FieldMayBeFinal
Field `canonicalizerHash` may be 'final'
in `src/main/java/org/apache/xml/security/c14n/Canonicalizer.java`
#### Snippet
```java
        "http://santuario.apache.org/c14n/physical";

    private static Map<String, Class<? extends CanonicalizerSpi>> canonicalizerHash =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `useC14N11` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    * If true, overrides the same property if set in the XMLSignContext.
    */
    private static boolean useC14N11 =
        AccessController.doPrivileged((PrivilegedAction<Boolean>)
            () -> Boolean.getBoolean("com.sun.org.apache.xml.internal.security.useC14N11"));
```

### FieldMayBeFinal
Field `allTransforms` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    private final String id;
    private final List<Transform> transforms;
    private List<Transform> allTransforms;
    private final Data appliedTransformData;
    private Attr here;
```

### FieldMayBeFinal
Field `provider` may be 'final'
in `src/main/java/org/apache/jcp/xml/dsig/internal/dom/DOMReference.java`
#### Snippet
```java
    private InputStream dis;
    private MessageDigest md;
    private Provider provider;

    /**
```

### FieldMayBeFinal
Field `it` may be 'final'
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
    static class ResolverIterator implements Iterator<KeyResolverSpi> {
        private List<KeyResolverSpi> res;
        private Iterator<KeyResolverSpi> it;

        public ResolverIterator(List<KeyResolverSpi> list) {
```

### FieldMayBeFinal
Field `resolverList` may be 'final'
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(KeyResolver.class);

    private static List<KeyResolverSpi> resolverList = new CopyOnWriteArrayList<>();

    private static final AtomicBoolean defaultResolversAdded = new AtomicBoolean();
```

### FieldMayBeFinal
Field `res` may be 'final'
in `src/main/java/org/apache/xml/security/keys/keyresolver/KeyResolver.java`
#### Snippet
```java
     */
    static class ResolverIterator implements Iterator<KeyResolverSpi> {
        private List<KeyResolverSpi> res;
        private Iterator<KeyResolverSpi> it;

```

### FieldMayBeFinal
Field `internalKeyResolvers` may be 'final'
in `src/main/java/org/apache/xml/security/keys/KeyInfo.java`
#### Snippet
```java
     * Stores the individual (per-KeyInfo) {@link KeyResolverSpi}s
     */
    private List<KeyResolverSpi> internalKeyResolvers = new ArrayList<>();

    private boolean secureValidation = true;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/org/apache/xml/security/stax/ext/ComparableType.java`
#### Snippet
```java
public abstract class ComparableType<T extends ComparableType> implements Comparable<T> {

    private String name;

    public ComparableType(String name) {
```

### FieldMayBeFinal
Field `signatureKeyIdentifiers` may be 'final'
in `src/main/java/org/apache/xml/security/stax/ext/XMLSecurityProperties.java`
#### Snippet
```java
    private X509Certificate[] signatureCerts;
    private boolean addExcC14NInclusivePrefixes = false;
    private List<SecurityTokenConstants.KeyIdentifier> signatureKeyIdentifiers = new ArrayList<>();
    private String signatureKeyName;
    private boolean useSingleCert = true;
```

### FieldMayBeFinal
Field `inputProcessors` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java
    protected static final transient Logger LOG = LoggerFactory.getLogger(InputProcessorChainImpl.class);

    private List<InputProcessor> inputProcessors;
    private int startPos;
    private int curPos;
```

### FieldMayBeFinal
Field `startPos` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/InputProcessorChainImpl.java`
#### Snippet
```java

    private List<InputProcessor> inputProcessors;
    private int startPos;
    private int curPos;

```

### FieldMayBeFinal
Field `outputProcessors` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/OutputProcessorChainImpl.java`
#### Snippet
```java
    protected static final transient Logger LOG = LoggerFactory.getLogger(OutputProcessorChainImpl.class);

    private List<OutputProcessor> outputProcessors;
    private int startPos;
    private int curPos;
```

### FieldMayBeFinal
Field `startPos` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/OutputProcessorChainImpl.java`
#### Snippet
```java

    private List<OutputProcessor> outputProcessors;
    private int startPos;
    private int curPos;
    private XMLSecStartElement parentXmlSecStartElement;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecEntityDeclarationImpl.java`
#### Snippet
```java
    }

    private String name;

    @Override
```

### FieldMayBeFinal
Field `prefix` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/stax/XMLSecNamespaceImpl.java`
#### Snippet
```java
            Collections.synchronizedMap(new WeakHashMap<String, Map<String, XMLSecNamespace>>());

    private String prefix;
    private final String uri;
    private QName qName;
```

### FieldMayBeFinal
Field `elementName` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java

        private QName qName;
        private String elementName;
        private String elementNamespace;
        private String elementPrefix;
```

### FieldMayBeFinal
Field `parentNamespaceContext` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
    private static class NSContext implements NamespaceContext {

        private NamespaceContext parentNamespaceContext;
        private List<String> prefixNsList = Collections.emptyList();

```

### FieldMayBeFinal
Field `parentElement` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/XMLSecurityStreamWriter.java`
#### Snippet
```java
    private static class Element {

        private Element parentElement;

        private QName qName;
```

### FieldMayBeFinal
Field `value` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/KeyValue.java`
#### Snippet
```java

    private E key;
    private K value;

    public KeyValue(E key, K value) {
```

### FieldMayBeFinal
Field `key` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/KeyValue.java`
#### Snippet
```java
public class KeyValue<E, K> {

    private E key;
    private K value;

```

### FieldMayBeFinal
Field `buf` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream.java`
#### Snippet
```java
public class FullyBufferedOutputStream extends FilterOutputStream {

    private UnsyncByteArrayOutputStream buf = new UnsyncByteArrayOutputStream();

    public FullyBufferedOutputStream(OutputStream out) {
```

### FieldMayBeFinal
Field `startTrimLength` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/TrimmerOutputStream.java`
#### Snippet
```java

    private int preTrimmed;
    private int startTrimLength;
    private int endTrimLength;

```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/TrimmerOutputStream.java`
#### Snippet
```java
public class TrimmerOutputStream extends FilterOutputStream {

    private byte[] buffer;
    private int bufferedCount;

```

### FieldMayBeFinal
Field `endTrimLength` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/util/TrimmerOutputStream.java`
#### Snippet
```java
    private int preTrimmed;
    private int startTrimLength;
    private int endTrimLength;

    public TrimmerOutputStream(OutputStream out, int bufferSize, int startTrimLength, int endTrimLength) {
```

### FieldMayBeFinal
Field `xmlEventWriter` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/FinalOutputProcessor.java`
#### Snippet
```java
public class FinalOutputProcessor extends AbstractOutputProcessor {

    private XMLEventWriter xmlEventWriter;

    public FinalOutputProcessor(OutputStream outputStream, String encoding) throws XMLSecurityException {
```

### FieldMayBeFinal
Field `signaturePartDef` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java
    public class InternalSignatureOutputProcessor extends AbstractOutputProcessor {

        private SignaturePartDef signaturePartDef;
        private XMLSecStartElement xmlSecStartElement;
        private int elementCounter;
```

### FieldMayBeFinal
Field `xmlSecStartElement` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor.java`
#### Snippet
```java

        private SignaturePartDef signaturePartDef;
        private XMLSecStartElement xmlSecStartElement;
        private int elementCounter;

```

### FieldMayBeFinal
Field `mac` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/algorithms/HMACSignatureAlgorithm.java`
#### Snippet
```java
public class HMACSignatureAlgorithm implements SignatureAlgorithm {

    private Mac mac;

    public HMACSignatureAlgorithm(String jceName, String jceProvider) throws NoSuchProviderException, NoSuchAlgorithmException {
```

### FieldMayBeFinal
Field `signatureAlgorithm` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
        private byte[] signatureValue;
        private String inclusiveNamespacePrefixes;
        private SignatureAlgorithm signatureAlgorithm;
        private XMLSecStartElement xmlSecStartElement;
        private String signatureId;
```

### FieldMayBeFinal
Field `signaturePartDefList` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
    private static final transient Logger LOG = LoggerFactory.getLogger(AbstractSignatureEndingOutputProcessor.class);

    private List<SignaturePartDef> signaturePartDefList;

    public AbstractSignatureEndingOutputProcessor(AbstractSignatureOutputProcessor signatureOutputProcessor)
```

### FieldMayBeFinal
Field `xmlSecStartElement` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
        private String inclusiveNamespacePrefixes;
        private SignatureAlgorithm signatureAlgorithm;
        private XMLSecStartElement xmlSecStartElement;
        private String signatureId;

```

### FieldMayBeFinal
Field `signatureId` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/output/AbstractSignatureEndingOutputProcessor.java`
#### Snippet
```java
        private SignatureAlgorithm signatureAlgorithm;
        private XMLSecStartElement xmlSecStartElement;
        private String signatureId;

        public SignedInfoProcessor(SignatureAlgorithm signatureAlgorithm, String signatureId, XMLSecStartElement xmlSecStartElement)
```

### FieldMayBeFinal
Field `dsaKeyValueType` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/DsaKeyValueSecurityToken.java`
#### Snippet
```java
public class DsaKeyValueSecurityToken extends AbstractInboundSecurityToken {

    private DSAKeyValueType dsaKeyValueType;

    public DsaKeyValueSecurityToken(DSAKeyValueType dsaKeyValueType, InboundSecurityContext inboundSecurityContext) {
```

### FieldMayBeFinal
Field `keyName` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/KeyNameSecurityToken.java`
#### Snippet
```java
public class KeyNameSecurityToken extends AbstractInboundSecurityToken {

    private String keyName;

    public KeyNameSecurityToken(String keyName, InboundSecurityContext inboundSecurityContext) {
```

### FieldMayBeFinal
Field `rsaKeyValueType` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken.java`
#### Snippet
```java
public class RsaKeyValueSecurityToken extends AbstractInboundSecurityToken {

    private RSAKeyValueType rsaKeyValueType;

    public RsaKeyValueSecurityToken(RSAKeyValueType rsaKeyValueType, InboundSecurityContext inboundSecurityContext) {
```

### FieldMayBeFinal
Field `ecKeyValueType` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/ECKeyValueSecurityToken.java`
#### Snippet
```java
public class ECKeyValueSecurityToken extends AbstractInboundSecurityToken {

    private ECKeyValueType ecKeyValueType;

    public ECKeyValueSecurityToken(ECKeyValueType ecKeyValueType, InboundSecurityContext inboundSecurityContext)
```

### FieldMayBeFinal
Field `encryptedDataType` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor.java`
#### Snippet
```java
        private final InboundSecurityToken inboundSecurityToken;
        private boolean rootElementProcessed;
        private EncryptedDataType encryptedDataType;
        private Thread decryptionThread;

```

### FieldMayBeFinal
Field `keyIdentifier` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    private List<QName> elementPath;
    private XMLSecEvent xmlSecEvent;
    private SecurityTokenConstants.KeyIdentifier keyIdentifier;
    private final List<InboundSecurityToken> wrappedTokens = new ArrayList<>();
    private InboundSecurityToken keyWrappingToken;
```

### FieldMayBeFinal
Field `inboundSecurityContext` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken.java`
#### Snippet
```java
    private boolean invoked = false;

    private InboundSecurityContext inboundSecurityContext;
    private List<QName> elementPath;
    private XMLSecEvent xmlSecEvent;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverHttp.java`
#### Snippet
```java
    private String uri;
    private String baseURI;
    private Pattern pattern = Pattern.compile("^http[s]?://.*");

    public ResolverHttp() {
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `src/main/java/org/apache/xml/security/stax/impl/resourceResolvers/ResolverXPointer.java`
#### Snippet
```java
public class ResolverXPointer implements ResourceResolver, ResourceResolverLookup {

    private Pattern pattern = Pattern.compile("^#xpointer\\((/)|(id\\([\"\']([^\"\']*)[\"\']\\))\\)");
    private String id;
    private boolean rootNodeOccured = false;
```

### FieldMayBeFinal
Field `allowUnsafeResourceResolving` may be 'final'
in `src/main/java/org/apache/xml/security/utils/resolver/ResourceResolverContext.java`
#### Snippet
```java
public class ResourceResolverContext {

    private static boolean allowUnsafeResourceResolving =
            AccessController.doPrivileged(
                    (PrivilegedAction<Boolean>) () -> Boolean.getBoolean("org.apache.xml.security.allowUnsafeResourceResolving"));
```

### FieldMayBeFinal
Field `prefixMappings` may be 'final'
in `src/main/java/org/apache/xml/security/utils/ElementProxy.java`
#### Snippet
```java

    /** Field prefixMappings */
    private static Map<String, String> prefixMappings = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `parserPoolSize` may be 'final'
in `src/main/java/org/apache/xml/security/parser/XMLParserImpl.java`
#### Snippet
```java
public class XMLParserImpl implements XMLParser {

    private static int parserPoolSize =
            AccessController.doPrivileged(
                    (PrivilegedAction<Integer>) () -> Integer.getInteger("org.apache.xml.security.parser.pool-size", 20));
```

### FieldMayBeFinal
Field `ignoreLineBreaks` may be 'final'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
public final class XMLUtils {

    private static boolean ignoreLineBreaks =
            AccessController.doPrivileged(
                    (PrivilegedAction<Boolean>) () -> Boolean.getBoolean("org.apache.xml.security.ignoreLineBreaks"));
```

### FieldMayBeFinal
Field `xmlParserImpl` may be 'final'
in `src/main/java/org/apache/xml/security/utils/XMLUtils.java`
#### Snippet
```java
            org.slf4j.LoggerFactory.getLogger(XMLUtils.class);

    private static XMLParser xmlParserImpl =
            AccessController.doPrivileged(
                    (PrivilegedAction<XMLParser>) () -> {
```

### FieldMayBeFinal
Field `octetStream` may be 'final'
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceOctetStreamData.java`
#### Snippet
```java
 */
public class ReferenceOctetStreamData implements ReferenceData {
    private InputStream octetStream;
    private String uri;
    private String mimeType;
```

### FieldMayBeFinal
Field `withComments` may be 'final'
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
        private List<Node> nodeSet;
        private ListIterator<Node> li;
        private boolean withComments;

        DelayedNodeIterator(Node root, boolean excludeComments) {
```

### FieldMayBeFinal
Field `root` may be 'final'
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
     */
    static class DelayedNodeIterator implements Iterator<Node> {
        private Node root;
        private List<Node> nodeSet;
        private ListIterator<Node> li;
```

### FieldMayBeFinal
Field `root` may be 'final'
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java

    private boolean excludeComments;
    private Node root;

    public ReferenceSubTreeData(Node root, boolean excludeComments) {
```

### FieldMayBeFinal
Field `excludeComments` may be 'final'
in `src/main/java/org/apache/xml/security/signature/reference/ReferenceSubTreeData.java`
#### Snippet
```java
public class ReferenceSubTreeData implements ReferenceNodeSetData {

    private boolean excludeComments;
    private Node root;

```

### FieldMayBeFinal
Field `signatureMethod` may be 'final'
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java

    private Element c14nMethod;
    private Element signatureMethod;

    /**
```

### FieldMayBeFinal
Field `c14nMethod` may be 'final'
in `src/main/java/org/apache/xml/security/signature/SignedInfo.java`
#### Snippet
```java
    private byte[] c14nizedBytes;

    private Element c14nMethod;
    private Element signatureMethod;

```

### FieldMayBeFinal
Field `nodeFilters` may be 'final'
in `src/main/java/org/apache/xml/security/signature/XMLSignatureInput.java`
#### Snippet
```java
     * Node Filter list.
     */
    private List<NodeFilter> nodeFilters = new ArrayList<>();

    private boolean needsToBeExpanded = false;
```

### FieldMayBeFinal
Field `referenceCount` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(Manifest.class);

    private static Integer referenceCount =
        AccessController.doPrivileged(
            (PrivilegedAction<Integer>) () -> Integer.parseInt(System.getProperty("org.apache.xml.security.maxReferences",
```

### FieldMayBeFinal
Field `references` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Manifest.java`
#### Snippet
```java

    /** Field references */
    private List<Reference> references;
    private Element[] referencesEl;

```

### FieldMayBeFinal
Field `algorithmsMap` may be 'final'
in `src/main/java/org/apache/xml/security/algorithms/JCEMapper.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(JCEMapper.class);

    private static Map<String, Algorithm> algorithmsMap = new ConcurrentHashMap<>();

    private static String providerName;
```

### FieldMayBeFinal
Field `signatureValueElement` may be 'final'
in `src/main/java/org/apache/xml/security/signature/XMLSignature.java`
#### Snippet
```java
    private boolean followManifestsDuringValidation = false;

    private Element signatureValueElement;

    private static final int MODE_SIGN = 0;
```

### FieldMayBeFinal
Field `algorithmHash` may be 'final'
in `src/main/java/org/apache/xml/security/algorithms/SignatureAlgorithm.java`
#### Snippet
```java

    /** All available algorithm classes are registered here */
    private static Map<String, Class<? extends SignatureAlgorithmSpi>> algorithmHash =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `manifest` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
        org.slf4j.LoggerFactory.getLogger(Reference.class);

    private Manifest manifest;
    private XMLSignatureInput transformsOutput;

```

### FieldMayBeFinal
Field `useC14N11` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
     * 3.1.1 of http://www.w3.org/2007/xmlsec/Drafts/xmldsig-core/ for more info.
     */
    private static boolean useC14N11 =
        AccessController.doPrivileged((PrivilegedAction<Boolean>)
            () -> Boolean.getBoolean("org.apache.xml.security.useC14N11"));
```

### FieldMayBeFinal
Field `digestValueElement` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
    private Element digestMethodElem;

    private Element digestValueElement;

    private ReferenceData referenceData;
```

### FieldMayBeFinal
Field `digestMethodElem` may be 'final'
in `src/main/java/org/apache/xml/security/signature/Reference.java`
#### Snippet
```java
    private Transforms transforms;

    private Element digestMethodElem;

    private Element digestValueElement;
```

### FieldMayBeFinal
Field `cipherData` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipherInput.java`
#### Snippet
```java

    /** The data we are working with */
    private CipherData cipherData;

    private boolean secureValidation = true;
```

### FieldMayBeFinal
Field `transformSpiHash` may be 'final'
in `src/main/java/org/apache/xml/security/transforms/Transform.java`
#### Snippet
```java

    /** All available Transform classes are registered here */
    private static Map<String, TransformSpi> transformSpiHash = new ConcurrentHashMap<>();

    private final TransformSpi transformSpi;
```

### FieldMayBeFinal
Field `referenceNode` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private String referenceURI;
            private Transforms referenceTransforms;
            private Attr referenceNode;

            /**
```

### FieldMayBeFinal
Field `referenceURI` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        private class CipherReferenceImpl implements CipherReference {
            private String referenceURI;
            private Transforms referenceTransforms;
            private Attr referenceNode;
```

### FieldMayBeFinal
Field `referenceInformation` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private abstract class ReferenceImpl implements Reference {
                private String uri;
                private List<Element> referenceInformation;

                ReferenceImpl(String uri) {
```

### FieldMayBeFinal
Field `attributeMap` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private String target;
            private String id;
            private Map<String, String> attributeMap = new HashMap<>();
            private List<Element> encryptionInformation;

```

### FieldMayBeFinal
Field `algorithmURI` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private KeyInfo originatorKeyInfo;
            private KeyInfo recipientKeyInfo;
            private String algorithmURI;

            /**
```

### FieldMayBeFinal
Field `cipherData` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private EncryptionMethod encryptionMethod;
            private KeyInfo keyInfo;
            private CipherData cipherData;
            private EncryptionProperties encryptionProperties;

```

### FieldMayBeFinal
Field `digestAlg` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
    private boolean secureValidation = true;

    private String digestAlg;

    /** List of internal KeyResolvers for DECRYPT and UNWRAP modes. */
```

### FieldMayBeFinal
Field `encryptionProperties` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        private class EncryptionPropertiesImpl implements EncryptionProperties {
            private String id;
            private List<EncryptionProperty> encryptionProperties;

            /**
```

### FieldMayBeFinal
Field `encryptionMethodInformation` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private int keySize = Integer.MIN_VALUE;
            private byte[] oaepParams;
            private List<Element> encryptionMethodInformation;
            private String digestAlgorithm;
            private String mgfAlgorithm;
```

### FieldMayBeFinal
Field `references` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        private class ReferenceListImpl implements ReferenceList {
            private Class<?> sentry;
            private List<Reference> references;

            /**
```

### FieldMayBeFinal
Field `sentry` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        private class ReferenceListImpl implements ReferenceList {
            private Class<?> sentry;
            private List<Reference> references;

```

### FieldMayBeFinal
Field `encryptionInformation` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
            private String id;
            private Map<String, String> attributeMap = new HashMap<>();
            private List<Element> encryptionInformation;

            /**
```

### FieldMayBeFinal
Field `algorithm` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java

        private class EncryptionMethodImpl implements EncryptionMethod {
            private String algorithm;
            private int keySize = Integer.MIN_VALUE;
            private byte[] oaepParams;
```

### FieldMayBeFinal
Field `agreementMethodInformation` may be 'final'
in `src/main/java/org/apache/xml/security/encryption/XMLCipher.java`
#### Snippet
```java
        private class AgreementMethodImpl implements AgreementMethod {
            private byte[] kaNonce;
            private List<Element> agreementMethodInformation;
            private KeyInfo originatorKeyInfo;
            private KeyInfo recipientKeyInfo;
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

