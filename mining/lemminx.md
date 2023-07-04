# lemminx 
 
# Bad smells
I found 1224 bad smells with 129 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 377 | false |
| JavadocReference | 84 | false |
| JavadocLinkAsPlainText | 73 | false |
| DataFlowIssue | 64 | false |
| UnusedAssignment | 58 | false |
| UnnecessaryModifier | 57 | true |
| ConstantValue | 53 | false |
| FieldMayBeFinal | 38 | false |
| UnnecessaryLocalVariable | 36 | true |
| TrivialIf | 32 | false |
| RedundantCast | 27 | false |
| StringOperationCanBeSimplified | 25 | false |
| UnnecessarySemicolon | 22 | false |
| SimplifiableConditionalExpression | 18 | false |
| CatchMayIgnoreException | 17 | false |
| DuplicateBranchesInSwitch | 15 | false |
| ArraysAsListWithZeroOrOneArgument | 14 | false |
| PointlessBooleanExpression | 14 | true |
| DuplicatedCode | 13 | false |
| Deprecation | 11 | false |
| StringBufferReplaceableByString | 10 | false |
| UNUSED_IMPORT | 10 | false |
| DanglingJavadoc | 10 | false |
| CommentedOutCode | 9 | false |
| RegExpRedundantEscape | 9 | false |
| EmptyStatementBody | 8 | false |
| UnnecessaryStringEscape | 8 | true |
| RegExpSimplifiable | 8 | false |
| UNCHECKED_WARNING | 8 | false |
| SimplifyStreamApiCallChains | 8 | false |
| NullableProblems | 5 | false |
| RedundantMethodOverride | 5 | false |
| PointlessNullCheck | 5 | false |
| SwitchStatementWithTooFewBranches | 5 | false |
| UnnecessaryReturn | 4 | true |
| FieldCanBeLocal | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| MismatchedJavadocCode | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| StringEquality | 3 | false |
| IgnoreResultOfCall | 3 | false |
| RedundantLengthCheck | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| RegExpRedundantClassElement | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| RegExpRedundantNestedCharacterClass | 2 | false |
| DuplicateThrows | 2 | false |
| RedundantCollectionOperation | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| UnnecessaryContinue | 2 | false |
| UseBulkOperation | 2 | false |
| FinalMethodInFinalClass | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| InfiniteLoopStatement | 1 | false |
| FuseStreamOperations | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| MathRoundingWithIntArgument | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| AutoCloseableResource | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ArrayObjectsEquals | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[futures.size()\]'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
		if (!futures.isEmpty()) {
			CompletableFuture<Void> allFutures = CompletableFuture
					.allOf(futures.toArray(new CompletableFuture[futures.size()]));
			allFutures.thenAccept(Void -> {
				triggerValidation.accept(document);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new XMLValidationFilter\[filters.size()\]'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationRootSettings.java`
#### Snippet
```java
		filter.setPattern("**{.project,.classpath,plugin.xml,feature.xml,category.xml,.target,.product}");
		filters.add(filter);
		return filters.toArray(new XMLValidationFilter[filters.size()]);
	}
}
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
	public final String getLineDelimiter(int line) throws BadLocationException {
		Node node = nodeByLine(line);
		return node.delimiter == NO_DELIM ? null : node.delimiter;
	}

```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		}

		if (node.delimiter != NO_DELIM) {
			insertAfter(node, 0, NO_DELIM);
		}
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		// check deletion
		final int lineDelta;
		boolean delete = node.length == 0 && node.delimiter != NO_DELIM;
		if (delete) {
			lineDelta = -1;
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
public class DOMDocumentType extends DTDDeclNode implements org.w3c.dom.DocumentType {

	public static enum DocumentTypeKind {
		PUBLIC, SYSTEM, INVALID
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 *
	 */
	private static enum TriggeredBy {
		didOpen, //
		didChange, //
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
	public static final IXPathNodeMatcher[] EMPTY_NODE_MATCHER = new IXPathNodeMatcher[0];

	public enum MatcherType {
		ELEMENT, ATTRIBUTE, TEXT;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
public interface IXPathNodeMatcher {

	public static final IXPathNodeMatcher[] EMPTY_NODE_MATCHER = new IXPathNodeMatcher[0];

	public enum MatcherType {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
public interface IXPathNodeMatcher {

	public static final IXPathNodeMatcher[] EMPTY_NODE_MATCHER = new IXPathNodeMatcher[0];

	public enum MatcherType {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
public interface IXPathNodeMatcher {

	public static final IXPathNodeMatcher[] EMPTY_NODE_MATCHER = new IXPathNodeMatcher[0];

	public enum MatcherType {
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/PathFeature.java`
#### Snippet
```java
	private final String settingId;
	
	private PathFeature(String name, String settingId) {
		this.name = name;
		this.settingId = settingId;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/IXMLSettingFeature.java`
#### Snippet
```java
	 * @return the related settingId for this feature
	 */
	public String getSettingId();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/IXMLSettingFeature.java`
#### Snippet
```java
	 * @return a displayable name for this feature
	 */
	public String getName();

	/**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/LimitFeature.java`
#### Snippet
```java
	private final String settingId;
	
	private LimitFeature(String name, String settingId) {
		this.name = name;
		this.settingId = settingId;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IWorkspaceServiceParticipant.java`
#### Snippet
```java
	 * @see WorkspaceService#didChangeWorkspaceFolders(DidChangeWorkspaceFoldersParams)
	 */
	public void didChangeWorkspaceFolders(DidChangeWorkspaceFoldersParams params);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ISymbolsProviderParticipant.java`
#### Snippet
```java
public interface ISymbolsProviderParticipant {

	public enum SymbolStrategy {
		UNADAPTABLE, INSERT, REPLACE;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/save/ISaveContext.java`
#### Snippet
```java
	 * </ul>
	 */
	public enum SaveContextType {
		DOCUMENT, SETTINGS;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/commands/IXMLCommandService.java`
#### Snippet
```java
	 */
	@FunctionalInterface
	public interface IDelegateCommandHandler {

		/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionItemResolverRequest.java`
#### Snippet
```java
	 *          false otherwise
	 */
	public boolean isResolveAdditionalTextEditsSupported();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionItemResolverRequest.java`
#### Snippet
```java
	 *          false otherwise
	 */
	public boolean isResolveDocumentationSupported();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionRequest.java`
#### Snippet
```java
	 *          false otherwise
	 */
	public boolean isResolveAdditionalTextEditsSupported();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionRequest.java`
#### Snippet
```java
	 *          false otherwise
	 */
	public boolean isResolveDocumentationSupported();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionRequest.java`
#### Snippet
```java
	 * @return true if tag should be autoclosed with an end tag and false otherwise.
	 */
	public boolean isAutoCloseTags();

	/**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	 *
	 */
	public static enum EmptyElements {
		expand, collapse, ignore;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	}

	private XSDErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	private final String code;

	private XSDErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogErrorCode.java`
#### Snippet
```java
	private final String code;

	private XMLCatalogErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
	}

	private RelaxNGErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
	private final String code;

	private RelaxNGErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
public class EntitiesDocumentationUtils {

	public static enum EntityOriginType {

		PREDEFINED("Predefined"), LOCAL("Local"), EXTERNAL("External");
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
		private final String value;

		private PredefinedEntity(String value) {
			this.value = value;
		}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
		private final String label;

		private EntityOriginType(String label) {
			this.label = label;
		}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
	 *
	 */
	public static enum PredefinedEntity {

		lt("&#60;"), gt("&#62;"), amp("&#38;"), apos("&#39;"), quot("&#34;");
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	}

	private XIncludeErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	private final String code;

	private XIncludeErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java
public class AttributeDeclaration {

	public static enum DataType {
		UNKNOWN, DATE, DATE_TIME, DECIMAL, BOOLEAN, INTEGER;
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQuery.java`
#### Snippet
```java
public class SearchQuery {

	public static enum QueryDirection {
		FROM_2_TO, TO_2_FROM, BOTH;
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java
public class SearchNode implements DOMRange {

	public static enum Direction {
		FROM, TO;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesErrorCode.java`
#### Snippet
```java
	}

	private XMLReferencesErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesErrorCode.java`
#### Snippet
```java
	private final String code;

	private XMLReferencesErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelProvider.java`
#### Snippet
```java
public interface ContentModelProvider {

	public class Identifier {

		private final String publicId;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
public interface CMElementDeclaration {

	public static final Collection<CMElementDeclaration> ANY_ELEMENT_DECLARATIONS = Collections
			.unmodifiableCollection(Arrays.asList());

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
public interface CMElementDeclaration {

	public static final Collection<CMElementDeclaration> ANY_ELEMENT_DECLARATIONS = Collections
			.unmodifiableCollection(Arrays.asList());

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
public interface CMElementDeclaration {

	public static final Collection<CMElementDeclaration> ANY_ELEMENT_DECLARATIONS = Collections
			.unmodifiableCollection(Arrays.asList());

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/SurroundWithCommand.java`
#### Snippet
```java
	}

	public static enum SurroundWithKind {
		tags, //
		comments, //
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
		private String name;

		private GrammarBindingType(String name) {
			this.name = name != null ? name : name();
		}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ExternalResourceErrorCode.java`
#### Snippet
```java
	}

	private ExternalResourceErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ExternalResourceErrorCode.java`
#### Snippet
```java
	private final String code;

	private ExternalResourceErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	private final String code;

	private DTDErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	}

	private DTDErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	private final String code;

	private XMLSchemaErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	}

	private XMLSchemaErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	private final String code;

	private XMLSyntaxErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	}

	private XMLSyntaxErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtension.java`
#### Snippet
```java
	 *         resource
	 */
	public String resolve(String baseLocation, String publicId, String systemId);

	@Override
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadingException.java`
#### Snippet
```java
		private final String rawMessage;

		private CacheResourceDownloadingError(String rawMessage) {
			this.rawMessage = rawMessage;
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtension.java`
#### Snippet
```java
public interface URIResolverExtension extends XMLEntityResolver {

	public static final String DEFAULT = "default";
	
	default String getName() {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtension.java`
#### Snippet
```java
public interface URIResolverExtension extends XMLEntityResolver {

	public static final String DEFAULT = "default";
	
	default String getName() {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtension.java`
#### Snippet
```java
public interface URIResolverExtension extends XMLEntityResolver {

	public static final String DEFAULT = "default";
	
	default String getName() {
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadedException.java`
#### Snippet
```java
		private final String rawMessage;

		private CacheResourceDownloadedError(String rawMessage) {
			this.rawMessage = rawMessage;
		}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/InvalidURIException.java`
#### Snippet
```java
		private final String rawMessage;

		private InvalidURIError(String rawMessage) {
			this.rawMessage = rawMessage;
		}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		String documentText = getOwnerDocument().getText();
		int i = getStart() + 1;
		for (; i < documentText.length() && documentText.charAt(i) != '/' && documentText.charAt(i) != '<'; i++) {
		}
		if (i < documentText.length() && documentText.charAt(i) == '/') {
```

### EmptyStatementBody
`for` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		}
		i--;
		for (; i > 0 && Character.isWhitespace(documentText.charAt(i)); i--) {
		}
		return i + 1;
```

### EmptyStatementBody
`for` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
				return true;
			}
			for (; i < ch.length && peekChar(i) == ch[i]; i++) {
			}
			if (i == ch.length) {
```

### EmptyStatementBody
`for` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
		while (this.position + ch.length <= this.len) {
			int i = 0;
			for (; i < ch.length && peekChar(i) == ch[i]; i++) {
			}
			if (i == ch.length) {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		} else if (node.balance == -1) {
			rightLeftRotation(node, parent);
		} else if (ASSERT) {
			// Assert.isTrue(false);
		}
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		} else if (node.balance == 1) {
			leftRightRotation(node, parent);
		} else if (ASSERT) {
			// Assert.isTrue(false);
		}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
				if (range == null) {
					range = hover.getRange();
				} else {
					// TODO : compute the best range
				}
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
				return new Color(red, green, blue, alpha);
			}
			if (text.startsWith("rgb(") || text.startsWith("rgba(")) {

			}
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_NAME_REGEX = Pattern.compile("^[^\\s\\?\"'<>/=\\x00-\\x0F\\x7F\\x80-\\x9F]*");

	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_NAME_REGEX = Pattern.compile("^[^\\s\\?\"'<>/=\\x00-\\x0F\\x7F\\x80-\\x9F]*");

	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_NAME_REGEX = Pattern.compile("^[^\\s\\?\"'<>/=\\x00-\\x0F\\x7F\\x80-\\x9F]*");

	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _DQO = "\"".codePointAt(0);
	public final static int _SQO = "\"".codePointAt(0);
	public final static int _SIQ = "\'".codePointAt(0);
	public final static int _NWL = "\n".codePointAt(0);
	public final static int _CAR = "\r".codePointAt(0);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");

	public static final Pattern PROLOG_NAME_OPTIONS = Pattern.compile("^(xml)[\\s<>?]?");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");

	public static final Pattern PROLOG_NAME_OPTIONS = Pattern.compile("^(xml)[\\s<>?]?");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");

	public static final Pattern URL_VALUE_REGEX = Pattern.compile("^(\"[^<>\"]*\")|(\'[^<>\']*\')");

	public static final Pattern PROLOG_NAME_OPTIONS = Pattern.compile("^(xml)[\\s<>?]?");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/ServerCapabilitiesConstants.java`
#### Snippet
```java

	public static final CompletionOptions DEFAULT_COMPLETION_OPTIONS = new CompletionOptions(true,
			Arrays.asList(".", ":", "<", "\"", "=", "/", "\\", "?", "\'", "&", "#"));
	public static final TextDocumentSyncKind DEFAULT_SYNC_OPTION = TextDocumentSyncKind.Full;
	public static final DocumentLinkOptions DEFAULT_LINK_OPTIONS = new DocumentLinkOptions(true);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
					return finishToken(offset, TokenType.PrologName);
				}
				// if(PI_WITH_VARIABLES.matcher(name).matches()) { // name eg: xml-stylesheet
				// state = ScannerState.WithinTag;
				// return finishToken(offset, TokenType.PIName);
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		byte leftDepth = checkTreeStructure(node.left);
		byte rightDepth = checkTreeStructure(node.right);
//		Assert.isTrue(node.balance == rightDepth - leftDepth);
//		Assert.isTrue(node.left == null || node.left.parent == node);
//		Assert.isTrue(node.right == null || node.right.parent == node);
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
	 */
	private void delete(Node node) {
//		if (ASSERT) Assert.isTrue(node != null);
//		if (ASSERT) Assert.isTrue(node.length == 0);

```

### CommentedOutCode
Commented out code (9 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java

			// successor exists (otherwise node would not have right child, case 1)
//			if (ASSERT) Assert.isNotNull(successor);
//			// successor has no left child (a left child would be the real successor of node)
//			if (ASSERT) Assert.isTrue(successor.left == null);
```

### CommentedOutCode
Commented out code (16 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		int lineLength = l.delimiter != null ? l.length - l.delimiter.length() : l.length;

//		int lineOffset = -1;
//		int lineLength = -1;
//		if (lines == 0) {
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
				break; // propagate up
			default:
//					if (ASSERT)
//						Assert.isTrue(false);
			}
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		}

		// Assert.isTrue(node.offset == offLen[0]);
		// Assert.isTrue(node.line == offLen[1]);

```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
				break;
			default:
				// if (ASSERT)
				// Assert.isTrue(false);
			}
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	private boolean updateDocumentation() {
		// TODO : implement resolve of element documentation
		// if (request.isResolveDocumentationSupported()) {
		// return true;
		// }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\>` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");

}
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");

}
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ELEMENT_NAME_REGEX = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern ATTRIBUTE_NAME_REGEX = Pattern.compile("^[^\\s\\?\"'<>/=\\x00-\\x0F\\x7F\\x80-\\x9F]*");

	public static final Pattern ATTRIBUTE_VALUE_REGEX = Pattern.compile("^(\"[^\"]*\"?)|(\'[^\']*\'?)");
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	private static String cachePathSetting = null;

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	private static String cachePathSetting = null;

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

	public static String getCachePathSetting() {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 */
	private static Matcher getNamespaceMatcher(String name) {
		Pattern namespacePattern = Pattern.compile("^\\{\"(.*)\":(.*)(\\}|,)");
		return namespacePattern.matcher(name);
	}
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `org.eclipse.lemminx/src/main/resources/schemas/catalog/catalog-1.1.xsd`
#### Snippet
```java
         the whitespace characters because they're normalized by XML parsing. -->
    <xs:restriction base="xs:string">
      <xs:pattern value="[a-zA-Z0-9\-'\(\)+,./:=?;!*#@$_%]*"/>
    </xs:restriction>
  </xs:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `org.eclipse.lemminx/src/main/resources/schemas/catalog/catalog-1.1.xsd`
#### Snippet
```java
         the whitespace characters because they're normalized by XML parsing. -->
    <xs:restriction base="xs:string">
      <xs:pattern value="[a-zA-Z0-9\-'\(\)+,./:=?;!*#@$_%]*"/>
    </xs:restriction>
  </xs:simpleType>
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java

		@Override
		public final String toString() {
			String bal;
			switch (balance) {
```

## RuleId[id=RegExpRedundantClassElement]
### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern ENTITY_NAME_REGEX = Pattern.compile("");

	public static final Pattern ELEMENT_NAME_REGEX = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern ATTRIBUTE_NAME_REGEX = Pattern.compile("^[^\\s\\?\"'<>/=\\x00-\\x0F\\x7F\\x80-\\x9F]*");
```

### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DTD_ENTITY_VALUE = Pattern.compile("^\".*\"");

	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case PIEnd:
				case PrologEnd: {
					curr.end = scanner.getTokenEnd();
					curr.closed = true;
					curr = curr.parent;
					break;
				}

				case StartCommentTag: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				}

				case EndCommentTag: {
					curr.end = scanner.getTokenEnd();
					curr.closed = true;
					curr = curr.parent;
					break;
				}

				case Content: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				}

				case DTDDocTypeKindSYSTEM: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
				}

				case DTDDoctypePublicId: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				}

				case DTDEndElementContent: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.updateLastParameterEnd(scanner.getTokenEnd());
					break;
				}

				case DTDStartAttlist: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				}

				case DTDNotationKindSYSTEM: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
				}

				case DTDNotationPublicId: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

		case DTDAfterDoctypePublicId:
			if (stream.skipWhitespace()) {
				return finishToken(offset, TokenType.Whitespace);
			}

			state = ScannerState.DTDWithinDoctype;
			url = stream.advanceIfRegExp(URL_VALUE_REGEX); // scan the System Identifier URL
			if (!url.equals("")) {
				return finishToken(offset, TokenType.DTDDoctypeSystemId);
			}

			state = ScannerState.DTDUnrecognizedParameters;
			return internalScan();

		case DTDWithinContent:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
						break;
					case EndTagClose:
						if (offset <= scanner.getTokenEnd()) {
							if (currentTag != null && currentTag.length() > 0) {
								collectInsideContent(completionRequest, completionResponse, cancelChecker);
								return completionResponse;
							}
						}
						break;
					case Content:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
				return XMLPositionUtility.selectAttributeNameFromGivenNameAt(RelaxNGUtils.NAME_ATTR, offset, document);
			}
			case illegal_attribute_ignored: {
				String attrName = (String) arguments[0];
				return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
			}
			case invalid_ncname: {
				DOMNode node = document.findNodeAt(offset);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
		case MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ATTLISTDECL:
		case MSG_SPACE_REQUIRED_BEFORE_ELEMENT_TYPE_IN_ELEMENTDECL:
		case MSG_SPACE_REQUIRED_BEFORE_ENTITY_NAME_IN_ENTITYDECL: {
			return XMLPositionUtility.selectDTDDeclTagNameAt(offset, document);
		}

		case DTDNotFound: {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
			}
			case cvc_type_3_1_2:
				return XMLPositionUtility.selectStartTagName(offset, document);
			case DuplicateUnique:
				String attrValue = getString(arguments[0]);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
			return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
		}
		case AttributeNotUnique: {
			String attrName = getString(arguments[1]);
			return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
		}
		case AttributePrefixUnbound: {
			return XMLPositionUtility.selectAttributePrefixFromGivenNameAt(getString(arguments[1]), offset, document);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		case PrematureEOF:
		case XMLDeclUnterminated:
			break;
		default:
		}
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		switch (enabled) {
			case always:
				return true;
			case never:
				return false;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		switch (enabled) {
			case always:
				return true;
			case never:
				return false;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		switch (enabled) {
			case always:
				return true;
			case never:
				return false;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'GrammarBindingType'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
		XML_MODEL("xml-model"); // xml-model processing instruction

		private String name;

		private GrammarBindingType(String name) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[^\\s]` can be simplified to '\\S'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/SchemaLocation.java`
#### Snippet
```java
	// The text to match is of the form:
	// http://example.org/schema/root root.xsd http://example.org/schema/bison bison.xsd http://example.org/schema/potato potato.xsd
	private static final Pattern SCHEMA_LOCATION_PAIR_PATTERN = Pattern.compile("\\s*([^\\s]+)\\s+([^\\s]+)\\s*");

	public SchemaLocation(DOMAttr attr) {
```

### RegExpSimplifiable
`[^\\s]` can be simplified to '\\S'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/SchemaLocation.java`
#### Snippet
```java
	// The text to match is of the form:
	// http://example.org/schema/root root.xsd http://example.org/schema/bison bison.xsd http://example.org/schema/potato potato.xsd
	private static final Pattern SCHEMA_LOCATION_PAIR_PATTERN = Pattern.compile("\\s*([^\\s]+)\\s+([^\\s]+)\\s*");

	public SchemaLocation(DOMAttr attr) {
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");

}
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");

}
```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public static final Pattern DOCTYPE_NAME = Pattern.compile("^[_:\\w][_:\\w-.\\d]*");

	public static final Pattern DOCUMENTATION_CONTENT = Pattern.compile(".*<[\\S]+:?documentation[^\\>]*>(.*)<\\/[\\S]+:?documentation[\\s]*>.*");

}
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

	public static String getCachePathSetting() {
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `org.eclipse.lemminx/src/main/resources/schemas/xslt/xslt-3.0.xsd`
#### Snippet
```java
      <xs:simpleType>
        <xs:restriction base="xs:token">
          <xs:pattern value="Q\{[^{}]*\}[\i-[:]][\c-[:]]*"/>
        </xs:restriction>
      </xs:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `org.eclipse.lemminx/src/main/resources/schemas/xslt/xslt-3.0.xsd`
#### Snippet
```java
      <xs:simpleType>
        <xs:restriction base="xs:token">
          <xs:pattern value="Q\{[^{}]*\}[\i-[:]][\c-[:]]*"/>
        </xs:restriction>
      </xs:simpleType>
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("<attribute");
		result.append(" name=\"");
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("<element");
		result.append(" name=\"");
```

### StringBufferReplaceableByString
`StringBuilder snippets` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/SnippetsBuilder.java`
#### Snippet
```java

	public static String tabstops(int index) {
		StringBuilder snippets = new StringBuilder();
		snippets.append("$");
		snippets.append(index);
```

### StringBufferReplaceableByString
`StringBuilder tag` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
				if (element.isSelfClosed()) {
					// expand empty element: <example /> -> <example></example>
					StringBuilder tag = new StringBuilder();
					tag.append(">");
					tag.append("</");
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
		// in a real document.
		fDTDScanner.reset();
		StringBuilder buffer = new StringBuilder(internalSubset.length() + 2);
		buffer.append(internalSubset).append("]>");
		XMLInputSource is = new XMLInputSource(null, baseSystemId, null, new StringReader(buffer.toString()), null);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/Cardinality.java`
#### Snippet
```java
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		result.append(getMin());
```

### StringBufferReplaceableByString
`StringBuilder bindingName` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelSymbolsProviderParticipant.java`
#### Snippet
```java
			// ex: Binding: xsi:schemaLocation
			// --> binding name
			StringBuilder bindingName = new StringBuilder("Binding: ");
			bindingName.append(ReferencedGrammarInfo.getBindingKindAndResolvedBy(info));

```

### StringBufferReplaceableByString
`StringBuilder insertText` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
					}
					Range range = XMLPositionUtility.createRange(offset, offset, document);
					StringBuilder insertText = new StringBuilder();
					insertText.append(' ');
					insertText.append("xmlns:");
```

### StringBufferReplaceableByString
`StringBuilder generatedXml` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_elements_missing_expectedCodeActionResolver.java`
#### Snippet
```java
							.getPossibleRequiredElements()) {
						if (child.getLocalName().equals(request.getDataProperty(DATA_ELEMENT_FIELD))) {
							StringBuilder generatedXml = new StringBuilder();
							generatedXml
									.append(generator.generate(child, null, true, false, 1, true));
```

### StringBufferReplaceableByString
`StringBuilder generatedXml` can be replaced with 'String'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_elements_missing_expectedCodeAction.java`
#### Snippet
```java
					for (CMElementDeclaration child : (((CMRelaxNGElementDeclaration) matchesCMElement).getPossibleRequiredElements())) {
						if (!request.canSupportResolve()) {
							StringBuilder generatedXml = new StringBuilder();
							generatedXml
									.append(generator.generate(child, null, true, false, 1, true));
```

## RuleId[id=Deprecation]
### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java

	@Override
	public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(
			DocumentSymbolParams params) {

```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			boolean resultLimitExceeded = false;
			List<Either<SymbolInformation, DocumentSymbol>> symbols = null;

			if (hierarchicalDocumentSymbolSupport) {
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
						.stream() //
						.map(s -> {
							Either<SymbolInformation, DocumentSymbol> e = Either.forRight(s);
							return e;
						}) //
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
				symbols = result.stream() //
						.map(s -> {
							Either<SymbolInformation, DocumentSymbol> e = Either.forLeft(s);
							return e;
						}) //
```

### Deprecation
'getRangeLength()' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java

						if (range != null) {
							length = changeEvent.getRangeLength().intValue();
						} else {
							// range is optional and if not given, the whole file content is replaced
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
	}

	public List<SymbolInformation> findSymbolInformations(DOMDocument xmlDocument, XMLSymbolSettings symbolSettings) {
		return findSymbolInformations(xmlDocument, symbolSettings, NULL_CHECKER);
	}
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/SymbolInformationResult.java`
#### Snippet
```java
 * 
 */
public class SymbolInformationResult extends LimitList<SymbolInformation> {

	private static final long serialVersionUID = 1L;
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
	}

	private void findSymbolInformations(DOMNode node, String container, List<SymbolInformation> symbols,
			boolean ignoreNode, XMLSymbolFilter filter, boolean hasFilterForAttr, CancelChecker cancelChecker)
			throws BadLocationException {
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
			Range range = getSymbolRange(node);
			Location location = new Location(xmlDocument.getDocumentURI(), range);
			SymbolInformation symbol = new SymbolInformation(name, getSymbolKind(node), location, container);
			symbols.add(symbol);
		}
```

### Deprecation
'org.eclipse.lsp4j.SymbolInformation' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
			Range range = getSymbolRange(node);
			Location location = new Location(xmlDocument.getDocumentURI(), range);
			SymbolInformation symbol = new SymbolInformation(name, getSymbolKind(node), location, container);
			symbols.add(symbol);
		}
```

### Deprecation
'getRootUri()' is deprecated
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/ContentModelPlugin.java`
#### Snippet
```java
		registry.registerComponent(contentModelManager);
		if (params != null) {
			contentModelManager.setRootURI(params.getRootUri());
		}
		documentLinkParticipant = new ContentModelDocumentLinkParticipant(resolverManager);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		public void setRefreshCodeLenses(boolean isRefreshCodeLenses) {
			this.isRefreshCodeLenses = isRefreshCodeLenses;
			return;
		}

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			}
			if (inOpenTag) {
				return;
			}

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "While performing Completions the provided offset was a BadLocation", e);
			return;
		}
	}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
						null, response, sharedSettings);
			}
			return;
		}

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	public int getSplitAttributesIndentSize() {
		int splitAttributesIndentSize = this.splitAttributesIndentSize;
		return splitAttributesIndentSize < 0 ? 0 : splitAttributesIndentSize;
	}

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	 */
	public int getMaxLineWidth() {
		return maxLineWidth < 0 ? 0 : maxLineWidth;
	}

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`tracker != null ? tracker.isDirty() : false` can be simplified to 'tracker != null \&\& tracker.isDirty()'
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
	@Override
	public boolean isDirty() {
		return tracker != null ? tracker.isDirty() : false;
	}

```

### SimplifiableConditionalExpression
`seenAttributes != null ? seenAttributes.contains(attribute) : false` can be simplified to 'seenAttributes != null \&\& seenAttributes.contains(attribute)'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/CompletionResponse.java`
#### Snippet
```java
		 * if (node != null && node.hasAttribute(attribute)) { return true; }
		 */
		return seenAttributes != null ? seenAttributes.contains(attribute) : false;
	}

```

### SimplifiableConditionalExpression
`offset < text.length() ? text.charAt(offset) == '>' : false` can be simplified to 'offset \< text.length() \&\& text.charAt(offset) == '\>''
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					String text = xmlDocument.getText();
					// After the slash is a close bracket
					boolean closeBracketAfterSlash = offset < text.length() ? text.charAt(offset) == '>' : false;

					// Case: <a/| ...
```

### SimplifiableConditionalExpression
`element.getAttributeNodes() != null ? element.getAttributeNodes().size() == 1
: true` can be simplified to 'element.getAttributeNodes()==null \|\| element.getAttributeNodes().size() == 1'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
	 */
	private boolean shouldFormatClosingBracketNewLine(DOMElement element) {
		boolean isSingleAttribute = element.getAttributeNodes() != null ? element.getAttributeNodes().size() == 1
				: true;
		return (formatterDocument.getSharedSettings().getFormattingSettings().getClosingBracketNewLine()
```

### SimplifiableConditionalExpression
`capabilities != null ? capabilities.getTextDocument() != null : false` can be simplified to 'capabilities != null \&\& capabilities.getTextDocument() != null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/ClientCapabilitiesWrapper.java`
#### Snippet
```java
	public ClientCapabilitiesWrapper(ClientCapabilities capabilities, ExtendedClientCapabilities extendedCapabilities) {
		this.capabilities = capabilities;
		this.v3Supported = capabilities != null ? capabilities.getTextDocument() != null : false;
		this.extendedCapabilities = extendedCapabilities;
	}
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isResolveExternalEntities()
: false` can be simplified to 'validationSettings != null \&\& validationSettings.isResolveExternalEntities()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/diagnostics/DTDValidator.java`
#### Snippet
```java
		LSPXMLEntityManager entityManager = new LSPXMLEntityManager(reporterForXML, null);
		// Update the resolver external entities capability
		boolean resolveExternalEntities = validationSettings != null ? validationSettings.isResolveExternalEntities()
				: false;
		entityManager.setResolveExternalEntities(resolveExternalEntities);
```

### SimplifiableConditionalExpression
`tracker != null ? tracker.isDirty() : false` can be simplified to 'tracker != null \&\& tracker.isDirty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
	@Override
	public boolean isDirty() {
		return tracker != null ? tracker.isDirty() : false;
	}

```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isRelatedInformation() : false` can be simplified to 'validationSettings != null \&\& validationSettings.isRelatedInformation()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
		// for XML and Grammar.
		LSPErrorReporterForXSD reporterForXSD = new LSPErrorReporterForXSD(document, diagnostics, contentModelManager,
				validationSettings != null ? validationSettings.isRelatedInformation() : false,
				referencedGrammarDiagnosticsInfoCache);

```

### SimplifiableConditionalExpression
`validationSettings != null
? validationSettings.isResolveExternalEntities()
: false` can be simplified to 'validationSettings != null \&\& validationSettings.isResolveExternalEntities()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
			grammarPreparser.setFeature(Constants.XERCES_FEATURE_PREFIX + Constants.SCHEMA_VALIDATION_FEATURE, true);

			boolean resolveExternalEntities = validationSettings != null
					? validationSettings.isResolveExternalEntities()
					: false;
```

### SimplifiableConditionalExpression
`elementDeclaration == null ? false : elementDeclaration.getNillable()` can be simplified to 'elementDeclaration!=null \&\& elementDeclaration.getNillable()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
	@Override
	public boolean isNillable() {
		return elementDeclaration == null ? false : elementDeclaration.getNillable();
	}

```

### SimplifiableConditionalExpression
`documentOrGrammarURI != null
? documentOrGrammarURI.endsWith(document.getDocumentURI())
: true` can be simplified to 'documentOrGrammarURI==null \|\| documentOrGrammarURI.endsWith(document.getDocumentURI())'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
			DiagnosticSeverity diagnosticSeverity, boolean fatalError, DOMDocument document) {
		String documentOrGrammarURI = location.getExpandedSystemId();
		boolean errorForDocument = documentOrGrammarURI != null
				? documentOrGrammarURI.endsWith(document.getDocumentURI())
				: true;
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isRelatedInformation() : false` can be simplified to 'validationSettings != null \&\& validationSettings.isRelatedInformation()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGValidator.java`
#### Snippet
```java
		// for XML and Grammar.
		LSPErrorReporterForXML reporterForRNG = new LSPErrorReporterForXML(document, diagnostics, contentModelManager,
				validationSettings != null ? validationSettings.isRelatedInformation() : false,
				referencedGrammarDiagnosticsInfoCache);
		try {
```

### SimplifiableConditionalExpression
`tracker != null ? tracker.isDirty() : true` can be simplified to 'tracker==null \|\| tracker.isDirty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java

		public boolean isDirty() {
			return tracker != null ? tracker.isDirty() : true;
		}

```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isDisallowDocTypeDecl() : false` can be simplified to 'validationSettings != null \&\& validationSettings.isDisallowDocTypeDecl()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		this.disableDTDValidation = disableDTDValidation;
		// Disable DOCTYPE declaration if settings is set to true.
		boolean disallowDocTypeDecl = validationSettings != null ? validationSettings.isDisallowDocTypeDecl() : false;
		super.setFeature("http://apache.org/xml/features/disallow-doctype-decl", disallowDocTypeDecl);
		// Resolve external entities if settings is set to true.
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isResolveExternalEntities()
: false` can be simplified to 'validationSettings != null \&\& validationSettings.isResolveExternalEntities()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		super.setFeature("http://apache.org/xml/features/disallow-doctype-decl", disallowDocTypeDecl);
		// Resolve external entities if settings is set to true.
		boolean resolveExternalEntities = validationSettings != null ? validationSettings.isResolveExternalEntities()
				: false;
		super.setFeature("http://xml.org/sax/features/external-general-entities", resolveExternalEntities);
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.getXInclude().isEnabled() : false` can be simplified to 'validationSettings != null \&\& validationSettings.getXInclude().isEnabled()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		super.setFeature("http://xml.org/sax/features/external-parameter-entities", resolveExternalEntities);
		// Enable xi:include validation if settings is set to true.
		boolean isXIncludeEnabled = validationSettings != null ? validationSettings.getXInclude().isEnabled() : false;
		super.setFeature(XINCLUDE_FEATURE, isXIncludeEnabled);
		// Security manager
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isRelatedInformation() : false` can be simplified to 'validationSettings != null \&\& validationSettings.isRelatedInformation()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		Map<String, ReferencedGrammarDiagnosticsInfo> referencedGrammarDiagnosticsInfoCache = new HashMap<>();
		final LSPErrorReporterForXML reporterForXML = new LSPErrorReporterForXML(document, diagnostics,
				contentModelManager, validationSettings != null ? validationSettings.isRelatedInformation() : false,
				referencedGrammarDiagnosticsInfoCache);
		// When referenced grammar (XSD, DTD) have an error (ex : syntax error), the
```

### SimplifiableConditionalExpression
`validationSettings != null ? validationSettings.isRelatedInformation() : false` can be simplified to 'validationSettings != null \&\& validationSettings.isRelatedInformation()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		// for XML and Grammar.
		final LSPErrorReporterForXML reporterForGrammar = new LSPErrorReporterForXML(document, diagnostics,
				contentModelManager, validationSettings != null ? validationSettings.isRelatedInformation() : false,
				referencedGrammarDiagnosticsInfoCache);
		LSPXMLEntityManager entityManager = new LSPXMLEntityManager(reporterForXML, grammarPool);
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.lemminx/src/main/resources/schemas/xslt/xslt-3.0.xsd`
#### Snippet
```java
      <xs:simpleType>
        <xs:restriction base="xs:token">
          <xs:pattern value="Q\{[^{}]*\}[\i-[:]][\c-[:]]*"/>
        </xs:restriction>
      </xs:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.lemminx/src/main/resources/schemas/xslt/xslt-3.0.xsd`
#### Snippet
```java
      <xs:simpleType>
        <xs:restriction base="xs:token">
          <xs:pattern value="Q\{[^{}]*\}[\i-[:]][\c-[:]]*"/>
        </xs:restriction>
      </xs:simpleType>
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder str` are updated, but never queried
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java
			msg = key;
			if (arguments.length > 0) {
				StringBuilder str = new StringBuilder(msg);
				str.append('?');
				for (int i = 0; i < arguments.length; i++) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpOutputStream.java`
#### Snippet
```java

	@Override
	public void write(byte[] b) throws IOException {
	}

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpOutputStream.java`
#### Snippet
```java

	@Override
	public void write(byte[] b, int off, int len) {
	}

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpInputStream.java`
#### Snippet
```java
	
	@Override
	public int read(byte[] b) throws IOException {
		return -1;
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpInputStream.java`
#### Snippet
```java
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		return -1;
	}
```

### NullableProblems
Non-annotated method 'getAttribute' from 'DOMNode' implements non-null method from 'Element'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
 *
 */
public class DOMElement extends DOMNode implements org.w3c.dom.Element {

	String tag;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/AbstractCMRelaxNGCollector.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclarationCollector.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeDeclaration.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeValuesCollector.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeDeclarationCollector.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
 * NOTE : this class is hosted in 'com.thaiopensource.relaxng.pattern' because
 * {@link Pattern} implementation like {@link ElementPattern} are not public.
 * Once https://github.com/relaxng/jing-trang/issues/271 will be fixed we could
 * move this class in 'org.eclipse.lemminx.extensions.relaxng.contentmodel'
 * package.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?&gt;
 * </pre>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	/**
	 * Returns the XML Schema prefix (ex : 'xs' for
	 * xmlns:xs="http://www.w3.org/2001/XMLSchema")
	 * 
	 * @return the XML Schema prefix (ex : 'xs' for
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * 
	 * @return the XML Schema prefix (ex : 'xs' for
	 *         xmlns:xs="http://www.w3.org/2001/XMLSchema")
	 */
	public String getSchemaPrefix() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/URIUtils.java`
#### Snippet
```java
	/**
	 * Returns a well folder URI which ends with '/' according the URI specification
	 * https://tools.ietf.org/html/rfc3986#section-6 which is used with Xerces
	 * XMLEntityManager#expandSystemId
	 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/LevenshteinDistance.java`
#### Snippet
```java
 *
 * <p>
 * 	This class is a copy/paste of https://github.com/apache/commons-text/blob/8e31edfe60027e374129ae9c92050dfecd5321e4/src/main/java/org/apache/commons/text/similarity/LevenshteinDistance.java
 * </p>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
 *
 * <li>resolve completion :
 * https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#completionItem
 * </li>
 * <li>resolve codeAction :
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
 * </li>
 * <li>resolve codeAction :
 * https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#codeAction
 * </li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
 * Class to hold all settings from the client side.
 *
 * See https://github.com/eclipse/lemminx/blob/main/docs/Configuration.md for more
 * information.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/xmlmodel/XMLModelDTDValidator.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://java.sun.com/dtd/web-app_2_3.dtd"?&gt;
 * </pre>
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDDocumentLinkParticipant.java`
#### Snippet
```java
 * 
 * <code>
 * 	<!ENTITY % xinclude SYSTEM "http://www.docbook.org/xml/4.4/xinclude.mod">
 * </code>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/XSDURIResolverExtension.java`
#### Snippet
```java

	/**
	 * The XMLSchema namespace URI (= http://www.w3.org/2001/XMLSchema)
	 */
	private static final String SCHEMA_FOR_SCHEMA_URI_2001 = "http://www.w3.org/2001/XMLSchema"; //$NON-NLS-1$
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/XSDURIResolverExtension.java`
#### Snippet
```java

	/**
	 * The Namespace namespace URI (= http://www.w3.org/XML/1998/namespace)
	 */
	private static final String SCHEMA_FOR_NAMESPACE_URI_1998 = "http://www.w3.org/XML/1998/namespace"; //$NON-NLS-1$
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/xmlmodel/XMLModelSchemaValidator.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?&gt;
 * </pre>
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
	 * 
	 * Indicated by:
	 * https://msdn.microsoft.com/en-us/library/ms256143(v=vs.110).aspx xs:attribute
	 * tags have content of either an xs:annotation or xs:simpleType
	 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java

	/**
	 * The XSL namespace URI (= http://www.w3.org/1999/XSL/Transform)
	 */
	private static final String XSL_NAMESPACE_URI = "http://www.w3.org/1999/XSL/Transform"; //$NON-NLS-1$
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologPlugin.java`
#### Snippet
```java
/**
 * Plugin to handle `xsi` attributes or a namespace with the value of:
 * "http://www.w3.org/2001/XMLSchema-instance"
 *
 * Loaded by service loader in 'resources' folder.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
/**
 * This class holds values that represent the XSI xsd. Can be seen at
 * https://www.w3.org/2001/XMLSchema-instance
 */
public class XSISchemaModel {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
 * <pre>
 * &lt;beans
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
 * &lt;beans
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util
                            http://www.springframework.org/schema/util/spring-util.xsd"&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util
                            http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
                            http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util
                            http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
 * <pre>
 * &lt;beans
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
 * &lt;beans
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                            http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"&gt;
 * </pre>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
/**
 * This class holds values that represent the XSI xsd. Can be seen at
 * https://www.w3.org/2001/XMLSchema-instance
 */
public class PrologModel {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	/**
	 * Returns a pattern matcher looking for a string that matches the format of:
	 * "{"http://maven.apache.org/POM/4.0.0":propertiesa}"
	 * 
	 * @param name
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * With Namespace
	 * 
	 * arguments[0]: {"http://maven.apache.org/POM/4.0.0":propertiesa} arguments[1]:
	 * {"http://maven.apache.org/POM/4.0.0":groupId,
	 * "http://maven.apache.org/POM/4.0.0":version}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * arguments[0]: {"http://maven.apache.org/POM/4.0.0":propertiesa} arguments[1]:
	 * {"http://maven.apache.org/POM/4.0.0":groupId,
	 * "http://maven.apache.org/POM/4.0.0":version}
	 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * arguments[0]: {"http://maven.apache.org/POM/4.0.0":propertiesa} arguments[1]:
	 * {"http://maven.apache.org/POM/4.0.0":groupId,
	 * "http://maven.apache.org/POM/4.0.0":version}
	 * 
	 * Without Namespace
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * arguments[0]: elementName arguments[1]:
	 * {"http://maven.apache.org/POM/4.0.0":groupId,
	 * "http://maven.apache.org/POM/4.0.0":version}
	 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * arguments[0]: elementName arguments[1]:
	 * {"http://maven.apache.org/POM/4.0.0":groupId,
	 * "http://maven.apache.org/POM/4.0.0":version}
	 * 
	 * Without Namespace
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelDeclaration.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?&gt;
 * </pre>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogURIResolverExtension.java`
#### Snippet
```java
	/**
	 * The XML Catalog namespace URI (=
	 * http://www.oasis-open.org/committees/entity/release/1.1/catalog.xsd)
	 */
	private static final String CATALOG_NAMESPACE_URI = "urn:oasis:names:tc:entity:xmlns:xml:catalog"; //$NON-NLS-1$
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?&gt;
 *	&lt;book xmlns="http://docbook.org/ns/docbook"&gt;
 *		&lt;title /&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
 * <pre>
 * 	&lt;?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?&gt;
 *	&lt;book xmlns="http://docbook.org/ns/docbook"&gt;
 *		&lt;title /&gt;
 *	&lt;/book&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyCompactSchemaReader.java`
#### Snippet
```java
 * 
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyCompactSchemaReader.java`
#### Snippet
```java
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySAXSchemaReader.java`
#### Snippet
```java
 * 
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySAXSchemaReader.java`
#### Snippet
```java
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyCombineSchema.java`
#### Snippet
```java
 * 
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyCombineSchema.java`
#### Snippet
```java
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyPatternSchema.java`
#### Snippet
```java
 * 
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MyPatternSchema.java`
#### Snippet
```java
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySchemaReaderImpl.java`
#### Snippet
```java
 * 
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySchemaReaderImpl.java`
#### Snippet
```java
 * <ul>
 * <li>https://github.com/relaxng/jing-trang/pull/273</li>
 * <li>https://github.com/relaxng/jing-trang/issues/275</li>
 * </ul>
 * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xmlmodel/XMLModelRelaxNGValidator.java`
#### Snippet
```java
 * 
 * <pre>
 * 	&lt;?xml-model href="http://www.tei-c.org/release/xml/tei/custom/schema/relaxng/tei_lite.rng"?&gt;
 * </pre>
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
	 * Predefined entities.
	 * 
	 * @See https://www.w3.org/TR/xml/#sec-predefined-ent
	 *
	 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ReferencedGrammarInfo.java`
#### Snippet
```java
	/**
	 * Returns the grammar cache information and null otherwise. (grammar is not a
	 * remote grammar with http://)
	 * 
	 * @return the grammar cache information and null otherwise.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ReferencedGrammarInfo.java`
#### Snippet
```java
 * <li>which binding strategies is used (catalog, file association,
 * xsi:schemaLocation, xsi:noNamespaceSchemaLocation, DOCTYPE).</li>
 * <li>the cache file path (for remote grammar with http://)</li>
 * 
 * </p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
	 * <li>which binding strategies are used (catalog, file association,
	 * xsi:schemaLocation, xsi:noNamespaceSchemaLocation, DOCTYPE).</li>
	 * <li>the cache file path (for remote grammar with http://)</li>
	 *
	 * </p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelDocumentLinkParticipant.java`
#### Snippet
```java
 * <li>DTD SYSTEM (ex : <!DOCTYPE root-element SYSTEM "./extended.dtd" )</li>
 * <li>Entity SYSTEM (ex : <!ENTITY % xinclude SYSTEM
 * "http://www.docbook.org/xml/4.4/xinclude.mod"> )</li>
 * <li>XML Schema xsi:schemaLocation</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
	 * 
	 * TODO: This code is a workaround until this issue is fixed:
	 * https://github.com/microsoft/language-server-protocol/issues/887
	 * 
	 * @param message the message to extract the root name from
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
	 * 
	 * TODO: This code is a workaround until this issue is fixed:
	 * https://github.com/microsoft/language-server-protocol/issues/887
	 * 
	 * @param message the message to extract the root name from
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 * 
	 * TODO: This code is a workaround until this issue is fixed:
	 * https://github.com/microsoft/language-server-protocol/issues/887
	 * 
	 * @param diagnostic the diagnostic
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/IExternalGrammarLocationProvider.java`
#### Snippet
```java
	 * 
	 * <p>
	 * <b>http://apache.org/xml/properties/schema/external-schemaLocation</b> - The
	 * value for this property follows the same rules as the schemaLocation
	 * attribute for an XML document (i.e., multiple schemas are acceptable and must
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/IExternalGrammarLocationProvider.java`
#### Snippet
```java
	 * 
	 * <p>
	 * <b>http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation</b>
	 * - The value for this property follows the same rules as the
	 * noNamespaceSchemaLocation attribute for an XML document (i.e., only one
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPSAXParser.java`
#### Snippet
```java
 * <li>[BUG 2]: when Xerces XML grammar pool is used, the second validation
 * ignore the existing of entities. See
 * https://github.com/redhat-developer/vscode-xml/issues/234</li>
 * </ul>
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		 *                              resource to in the lemminx cache. Generally this
		 *                              is the URL to the resource. Ex.
		 *                              https://www.w3.org/2007/schema-for-xslt20.xsd
		 * @param resourceFromClasspath - the classpath location of the resource to
		 *                              deploy to the lemminx cache
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		 *                              resource to in the lemminx cache. Generally this
		 *                              is the URL to the resource. Ex.
		 *                              https://www.w3.org/2007/schema-for-xslt20.xsd
		 * @param resourceFromClasspath - the classpath location of the resource to
		 *                              deploy to the lemminx cache
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
	private final ProcessLanguageServer server;
	private ScheduledFuture<?> task;
	private ScheduledExecutorService service;

	public interface ProcessLanguageServer extends LanguageServer {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
class XMLFoldings {
	private static Logger LOGGER = Logger.getLogger(XMLFoldings.class.getName());
	private final XMLExtensionsRegistry extensionsRegistry;

	private static final Pattern REGION_PATTERN = Pattern.compile("\\s*#(region\\b)|(endregion\\b)");
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
	private final DOMElementFormatter elementFormatter;

	private final DOMAttributeFormatter attributeFormatter;

	private final DOMTextFormatter textFormatter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxRelatedInfoFinder.java`
#### Snippet
```java
public class XMLSyntaxRelatedInfoFinder implements IRelatedInfoFinder {

	private static String CLOSING_TAG_EXPECTED_HERE = "Closing tag expected here";

	@Override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
		}
		// Make sure it's not executable
		outFile.toFile().setExecutable(false);
	}

```

### IgnoreResultOfCall
Result of `LocalDateTime.parse()` is ignored
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java
		try {
			// Try to parse "2001-10-26T21:32:52+02:00"
			LocalDateTime.parse(value, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
			return DataType.DATE_TIME;
		} catch (Exception e) {
```

### IgnoreResultOfCall
Result of `LocalDateTime.parse()` is ignored
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java
			try {
				// Try to parse "2001-10-26T21:32:52"
				LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME);
				return DataType.DATE_TIME;
			} catch (Exception e1) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `available()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpInputStream.java`
#### Snippet
```java
	
	@Override
	public int available() throws IOException {
		return 0;
	}
```

### RedundantMethodOverride
Method `mark()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpInputStream.java`
#### Snippet
```java
	
	@Override
 	public synchronized void mark(int readlimit) {
 	}
	
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/NoOpInputStream.java`
#### Snippet
```java
	
	@Override
	public void close() throws IOException {
	}

```

### RedundantMethodOverride
Method `getNodeName()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java

	@Override
	public String getNodeName() {
		return getName();
	}
```

### RedundantMethodOverride
Method `getResolverParticipantId()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/DOMElementCompletionItem.java`
#### Snippet
```java

	@Override
	protected String getResolverParticipantId() {
		return ElementEndTagCompletionResolver.PARTICIPANT_ID;
	}
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static org.eclipse.lsp4j.jsonrpc.CompletableFutures.computeAsync;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
package org.eclipse.lemminx;

import static org.eclipse.lsp4j.jsonrpc.CompletableFutures.computeAsync;

import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import org.w3c.dom.Node;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java

import org.w3c.dom.Entity;
import org.w3c.dom.Node;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import org.eclipse.lsp4j.ResourceOperation;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
import org.eclipse.lsp4j.PrepareRenameResult;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.ResourceOperation;
import org.eclipse.lsp4j.TextDocumentEdit;
import org.eclipse.lsp4j.TextEdit;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameParticipant.java`
#### Snippet
```java
package org.eclipse.lemminx.services.extensions.rename;

import java.util.List;
import java.util.concurrent.CancellationException;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameResponse.java`
#### Snippet
```java
package org.eclipse.lemminx.services.extensions.rename;

import java.util.List;

import org.eclipse.lsp4j.ResourceOperation;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.lemminx.uriresolver.CacheResourceDownloadingException.CacheResourceDownloadingErr...`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/InvalidURIException.java`
#### Snippet
```java
import java.text.MessageFormat;

import org.eclipse.lemminx.uriresolver.CacheResourceDownloadingException.CacheResourceDownloadingError;

/**
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerSocketLauncher.java`
#### Snippet
```java
		InetSocketAddress _inetSocketAddress = new InetSocketAddress("0.0.0.0", _port);
		final AsynchronousServerSocketChannel serverSocket = _open.bind(_inetSocketAddress);
		while (true) {
			final AsynchronousSocketChannel socketChannel = serverSocket.accept().get();
			final InputStream in = Channels.newInputStream(socketChannel);
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/SchemaProvider.java`
#### Snippet
```java

	private static InputSource createInputSource(RelaxNGDescription description, XMLEntityResolver entityResolver)
			throws MalformedURIException, IOException {
		XMLInputSource source = entityResolver.resolveEntity(description);
		return source.getByteStream() != null ? new InputSource(source.getByteStream())
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/SchemaProvider.java`
#### Snippet
```java
	public static Schema loadSchema(RelaxNGDescription description, XMLEntityResolver entityResolver,
			XMLErrorReporter errorReporter, SchemaPatternBuilder schemaPatternBuilder)
			throws MalformedURIException, IOException, SAXException, IncorrectSchemaException {
		InputSource input = createInputSource(description, entityResolver);
		return loadSchema(input, entityResolver, errorReporter, schemaPatternBuilder, null);
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		}

		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isQuoted()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 */
	public static String convertToQuotelessValue(String value) {
		if (value == null || !isQuoted(value)) {
			return value;
		}
```

### PointlessNullCheck
Unnecessary 'null' check before 'isFileResource()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
		// Track the grammar
		String dtdURI = getDTDURI(grammar);
		if (dtdURI != null && URIUtils.isFileResource(dtdURI)) {
			// The DTD is a file, track when file changed
			tracker.addFileURI(dtdURI);
```

### PointlessNullCheck
Unnecessary 'null' check before 'isFileResource()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
				trackedURIs.add(location);
			}
			if (location != null && URIUtils.isFileResource(location)) {
				// The schema is a file, track when file changed
				tracker.addFileURI(location);
```

### PointlessNullCheck
Unnecessary 'null' check before 'isFileResource()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
		// Track the grammar
		String relaxNGURI = getRelaxNGURI(grammar);
		if (relaxNGURI != null && URIUtils.isFileResource(relaxNGURI)) {
			// The RelaxNG is a file, track when file changed
			tracker.addFileURI(relaxNGURI);
```

### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
				Collection<String> prefixes = parentElement.getAllPrefixes();
				for (String prefix : prefixes) {
					if (defaultPrefix != null && prefix.equals(defaultPrefix)) {
						continue;
					}
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
	}

	private static Field getField(Class<? extends Object> clazz, String name) throws NoSuchFieldException {
		try {
			return clazz.getDeclaredField(name);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `resultLimitExceeded` initializer `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java

		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			boolean resultLimitExceeded = false;
			List<Either<SymbolInformation, DocumentSymbol>> symbols = null;

```

### UnusedAssignment
Variable `symbols` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			boolean resultLimitExceeded = false;
			List<Either<SymbolInformation, DocumentSymbol>> symbols = null;

			if (hierarchicalDocumentSymbolSupport) {
```

### UnusedAssignment
Variable `fh` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LogHelper.java`
#### Snippet
```java
		}
		if (!f.exists() || f.canWrite()) {
			FileHandler fh = null;
			fh = new FileHandler(filePath, true);
			fh.setFormatter(new SimpleFormatter());
```

### UnusedAssignment
Variable `closed` initializer `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	public static final short DTD_DECL_NODE = 105;

	boolean closed = false;

	private XMLNamedNodeMap<DOMAttr> attributeNodes;
```

### UnusedAssignment
Variable `localName` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	private void parse(String xpathExpression) {
		String prefix = null;
		String localName = null;
		if (xpathExpression.startsWith("/")) {
			xpathExpression = xpathExpression.substring(1, xpathExpression.length());
```

### UnusedAssignment
Variable `nodeMatcher` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
			xpathExpression = xpathExpression.substring(0, xpathExpression.length() - 2);
		}
		IXPathNodeMatcher nodeMatcher = null;
		String[] paths = xpathExpression.split("/");
		for (int i = 0; i < paths.length; i++) {
```

### UnusedAssignment
Variable `condition` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		}
		Node testNode = node;
		IXPathNodeMatcher condition = null;
		for (int i = super.size() - 1; i >= 0; i--) {
			if (testNode == null) {
```

### UnusedAssignment
The value `false` assigned to `previousTokenWasEndTagOpen` is never used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
		}
		if (previousTokenWasEndTagOpen) {
			previousTokenWasEndTagOpen = false;
			if (token != TokenType.EndTag) {
				// The excepted token is not an EndTag, create a fake end tag element
```

### UnusedAssignment
Variable `isInsideDTDContent` initializer `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
	String lastDoctypeKind;
	String url;
	boolean isInsideDTDContent = false; // Either internal dtd in xml file OR external dtd in dtd file
	boolean isDeclCompleted = false; // If any type of DTD declaration was supplied with all the required properties
	TokenType tempToken;
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
						TextDocumentContentChangeEvent changeEvent = changes.get(i);
						Range range = changeEvent.getRange();
						int length = 0;

						if (range != null) {
```

### UnusedAssignment
Variable `lineOffset` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java
		}

		int lineOffset = -1;
		int lineLength = -1;
		if (lines == 0) {
```

### UnusedAssignment
Variable `lineLength` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java

		int lineOffset = -1;
		int lineLength = -1;
		if (lines == 0) {
			lineOffset = 0;
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLPrepareRename.java`
#### Snippet
```java
			CancelChecker cancelChecker) {

		IPrepareRenameRequest request = null;

		try {
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLTypeDefinition.java`
#### Snippet
```java
		cancelChecker.checkCanceled();

		ITypeDefinitionRequest request = null;
		try {
			request = new TypeDefinitionRequest(document, position, extensionsRegistry);
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDefinition.java`
#### Snippet
```java
	public List<? extends LocationLink> findDefinition(DOMDocument document, Position position,
			CancelChecker cancelChecker) {
		IDefinitionRequest request = null;
		try {
			request = new DefinitionRequest(document, position, extensionsRegistry);
```

### UnusedAssignment
Variable `startTagRange` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java

		DOMDocument xmlDocument = node.getOwnerDocument();
		Range startTagRange = null;
		Range endTagRange = null;
		if (node.isCDATA()) {
```

### UnusedAssignment
Variable `endTagRange` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
		DOMDocument xmlDocument = node.getOwnerDocument();
		Range startTagRange = null;
		Range endTagRange = null;
		if (node.isCDATA()) {
			Position startPos = null;
```

### UnusedAssignment
Variable `startPos` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
		Range endTagRange = null;
		if (node.isCDATA()) {
			Position startPos = null;
			Position endPos = null;
			Range tempRange = null;
```

### UnusedAssignment
Variable `endPos` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
		if (node.isCDATA()) {
			Position startPos = null;
			Position endPos = null;
			Range tempRange = null;
			try {
```

### UnusedAssignment
Variable `tempRange` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
			Position startPos = null;
			Position endPos = null;
			Range tempRange = null;
			try {
				startPos = xmlDocument.positionAt(node.getStart());
```

### UnusedAssignment
Variable `offset` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
	public List<DocumentHighlight> findDocumentHighlights(DOMDocument xmlDocument, Position position,
			CancelChecker cancelChecker) {
		int offset = -1;
		try {
			offset = xmlDocument.offsetAt(position);
```

### UnusedAssignment
Variable `renameRequest` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
		cancelChecker.checkCanceled();
		
		RenameRequest renameRequest = null;

		try {
```

### UnusedAssignment
Variable `startPos` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	private List<TextEdit> getCDATARenameTextEdits(DOMDocument xmlDocument, DOMElement element, Position position,
			String newText) {
		Position startPos = null;
		Position endPos = null;
		Range tempRange = null;
```

### UnusedAssignment
Variable `endPos` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
			String newText) {
		Position startPos = null;
		Position endPos = null;
		Range tempRange = null;

```

### UnusedAssignment
Variable `tempRange` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
		Position startPos = null;
		Position endPos = null;
		Range tempRange = null;

		try {
```

### UnusedAssignment
Variable `hoverRequest` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
	public Hover doHover(DOMDocument xmlDocument, Position position, SharedSettings settings,
			CancelChecker cancelChecker) {
		HoverRequest hoverRequest = null;
		try {
			hoverRequest = new HoverRequest(xmlDocument, position, settings, extensionsRegistry);
```

### UnusedAssignment
Variable `curr` initializer `text.charAt(i)` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMTextFormatter.java`
#### Snippet
```java
			String text = formatterDocument.getText();
			int i = text.length() - 1;
			char curr = text.charAt(i);
			boolean removeSpaces = true;
			int lineSeparatorOffset = i + 1;
```

### UnusedAssignment
Variable `contentEnd` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMCDATAFormatter.java`
#### Snippet
```java
			int spaceStart = -1;
			int spaceEnd = -1;
			int contentEnd = -1;
			int cDATAStartContent = cDATANode.getStartContent();
			int cDATAEndContent = cDATANode.getEndContent();
```

### UnusedAssignment
Variable `completionRequest` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java

		CompletionResponse completionResponse = new CompletionResponse();
		CompletionRequest completionRequest = null;
		try {
			completionRequest = new CompletionRequest(xmlDocument, position, settings, extensionsRegistry);
```

### UnusedAssignment
Variable `addQuotes` initializer `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	private void collectAttributeValueSuggestions(int valueStart, int valueEnd, CompletionRequest completionRequest,
			CompletionResponse completionResponse, CancelChecker cancelChecker) {
		boolean addQuotes = false;
		String valuePrefix;
		int offset = completionRequest.getOffset();
```

### UnusedAssignment
The value `false` assigned to `removeSpaces` is never used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
						// ex: <a> </a> [space][space] --> remove
						removeLeftSpaces(i, lineDelimiterOffset, edits);
						removeSpaces = false;
						return edits;
					}
```

### UnusedAssignment
Variable `fullOffset` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java

	private DOMElement getFullDocElemFromRangeElem(DOMElement elemFromRangeDoc) {
		int fullOffset = -1;

		if (elemFromRangeDoc.hasStartTag()) {
```

### UnusedAssignment
Variable `endElement` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	private static List<TextEdit> getAdditionalTextEdits(DOMNode node, int offset, String tagName,
			ISharedSettingsRequest request) {
		DOMElement endElement = null;
		if (isTextNode(node, offset)) {
			endElement = node.getOrphanEndElement(offset, tagName, true);
```

### UnusedAssignment
Variable `enforceStyle` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	public EnforceQuoteStyle getEnforceQuoteStyle() {
		String value = this.enforceQuoteStyle;
		EnforceQuoteStyle enforceStyle = null;

		try {
```

### UnusedAssignment
Variable `targetNamespacePrefix` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
			return;
		}
		String targetNamespacePrefix = null;
		int index = originAttrValue.indexOf(':');
		if (index != -1) {
```

### UnusedAssignment
Variable `range` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
		if (hasRelatedInformation && info.getGrammarDocument() != null) {
			DOMDocument grammarDocument = info.getGrammarDocument();
			Range range = null;
			if (schemaErrorCode != null) {
				range = XMLSchemaErrorCode.toLSPRange(location, schemaErrorCode, arguments, grammarDocument);
```

### UnusedAssignment
Variable `schema` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	private static Object[] cvc_2_4_a_solution(Object[] arguments) {
		Matcher m = getNamespaceMatcher(getString(arguments[0]));
		String schema = null;
		String name = null;
		String validNames = null;
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		Matcher m = getNamespaceMatcher(getString(arguments[0]));
		String schema = null;
		String name = null;
		String validNames = null;

```

### UnusedAssignment
Variable `validNames` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		String schema = null;
		String name = null;
		String validNames = null;

		if (m.matches()) {
```

### UnusedAssignment
Variable `msg` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		boolean usedNewResourceBundle = false;

		String msg = null;

		if (newResourceBundle.containsKey(key)) {
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		Matcher m = getNamespaceMatcher(getString(arguments[1]));

		String element = null;
		String missingChildElements = null;
		String schema = null;
```

### UnusedAssignment
Variable `missingChildElements` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java

		String element = null;
		String missingChildElements = null;
		String schema = null;

```

### UnusedAssignment
Variable `schema` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		String element = null;
		String missingChildElements = null;
		String schema = null;

		if (m.matches()) {
```

### UnusedAssignment
Variable `prev` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelAwareParserConfiguration.java`
#### Snippet
```java
			// configure XML document pipeline: insert after DTDValidator and
			// before XML Schema validator
			XMLDocumentSource prev = null;
			if (fFeatures.get(XMLSCHEMA_VALIDATION) == Boolean.TRUE) {
				// we don't have to worry about fSchemaValidator being null, since
```

### UnusedAssignment
Variable `startText` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/SurroundWithCommand.java`
#### Snippet
```java
		// Surround process
		boolean emptySelection = selection.getStart().equals(selection.getEnd());
		StringBuilder startText = null;
		StringBuilder endText = null;
		Position startPos = selection.getStart();
```

### UnusedAssignment
Variable `endText` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/SurroundWithCommand.java`
#### Snippet
```java
		boolean emptySelection = selection.getStart().equals(selection.getEnd());
		StringBuilder startText = null;
		StringBuilder endText = null;
		Position startPos = selection.getStart();
		Position endPos = selection.getEnd();
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java

	private CMDocument getCMDocumentFromCache(String key) {
		CMDocument document = null;
		synchronized (cmDocumentCache) {
			document = cmDocumentCache.get(key);
```

### UnusedAssignment
Variable `cacheInfoSymbol` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelSymbolsProviderParticipant.java`
#### Snippet
```java

			// Cache symbol information
			DocumentSymbol cacheInfoSymbol = null;
			if (!info.isInCache()) {
				cacheInfoSymbol = new DocumentSymbol("Cache: false", SymbolKind.Property, DUMMY_RANGE, DUMMY_RANGE);
```

### UnusedAssignment
Variable `startOffset` initializer `offset + 1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		}
		case ContentIllegalInProlog: {
			int startOffset = offset + 1;
			int endOffset = 0;
			int errorOffset = offset + 1;
```

### UnusedAssignment
Variable `endOffset` initializer `0` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		case ContentIllegalInProlog: {
			int startOffset = offset + 1;
			int endOffset = 0;
			int errorOffset = offset + 1;
			String text = document.getText();
```

### UnusedAssignment
Variable `offset` initializer `-1` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
					// xlink="http://www.w3.org/1999/xlink")
					DOMDocument document = parentElement.getOwnerDocument();
					int offset = -1;
					DOMElement documentElement = document.getDocumentElement();
					if (documentElement.hasAttributes()) {
```

### UnusedAssignment
Variable `insertStr` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_element_missingCodeActionResolver.java`
#### Snippet
```java
			ContentModelManager contentModelManager = request.getComponent(ContentModelManager.class);

			String insertStr = null;

			if ("true".equals(request.getDataProperty(DATA_REQUIRED_FIELD))) {
```

### UnusedAssignment
Variable `prev` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		// configure XML document pipeline: insert after DTDValidator and
		// before XML Schema validator
		XMLDocumentSource prev = null;
		if (fFeatures.get(XMLSCHEMA_VALIDATION) == Boolean.TRUE) {
			// we don't have to worry about fSchemaValidator being null, since
```

### UnusedAssignment
Variable `prev` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		// configure XML document pipeline: insert after DTDValidator and
		// before XML Schema validator
		XMLDocumentSource prev = null;
		if (fFeatures.get(XMLSCHEMA_VALIDATION) == Boolean.TRUE) {
			// we don't have to worry about fSchemaValidator being null, since
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtensionManager.java`
#### Snippet
```java
	@Override
	public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier) throws XNIException, IOException {
		XMLInputSource is = null;
		for (URIResolverExtension resolver : resolvers) {
			is = resolver.resolveEntity(resourceIdentifier);
```

### UnusedAssignment
The value `conn.getHeaderField("Location")` assigned to `actualURI` is never used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
				{
					allowedRedirects--;
					url = new URL(actualURI = conn.getHeaderField("Location")); //$NON-NLS-1$
					String protocol = url.getProtocol();
					if (!protocolsForCache.contains(formatProtocol(protocol))) {
```

### UnusedAssignment
Variable `uri` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java

	public static Path getResourceCachePath(String resourceURI) throws IOException {
		URI uri = null;
		try {
			uri = URI.create(resourceURI);
```

### UnusedAssignment
Variable `f` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		}

		CompletableFuture<Path> f = null;
		synchronized (resourcesLoading) {
			if (resourcesLoading.containsKey(resourceURI)) {
```

## RuleId[id=MathRoundingWithIntArgument]
### MathRoundingWithIntArgument
`floor()` with argument of type 'int'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		}
		while (low < high) {
			int mid = (int) Math.floor((low + high) / 2);
			if (p.apply(array.get(mid))) {
				high = mid;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `declaration != null` is always `true`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
				declaration = findElementDeclaration(elt.getLocalName(), namespace);
			} else {
				declaration = declaration != null ? declaration.findCMElement(elt.getLocalName(), namespace) : null;
			}
			if (declaration == null) {
```

### ConstantValue
Value `t` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/ExceptionUtils.java`
#### Snippet
```java
	public static Throwable getRootCause(Throwable t) {
		if (t == null) {
			return t;
		}
		while (t.getCause() != null) {
```

### ConstantValue
Value `isWhitespaceContent` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
			int preservedNewLines = getPreservedNewlines();
			if (preservedNewLines > 0) {
				int newLineCount = StringUtils.getNumberOfNewLines(text, isWhitespaceContent, delimiter,
						preservedNewLines);
				for (int i = 0; i < newLineCount - 1; i++) { // - 1 because the node after will insert a delimiter
```

### ConstantValue
Condition `i < value.length()` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java

		// left trim
		while (i < value.length() && Character.isWhitespace(c)) {
			i++;
			c = val[i];
```

### ConstantValue
Condition `filename != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/LimitExceededWarner.java`
#### Snippet
```java
	private void sendLimitExceededWarning(String uri, int resultLimit, LimitFeature feature) {
		String filename = Paths.get(URI.create(uri)).getFileName().toString();
		String message = filename != null ? filename + ": " : "";
		message += "For performance reasons, " + feature.getName() + " have been limited to " + resultLimit
				+ " items.\nIf a new limit is set, please close and reopen this file to recompute " + feature.getName() + ".";
```

### ConstantValue
Value `prefix` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		} else if (prefix == null && localName.startsWith(ATTR_NODE_SELECTOR)) {
			// ex : @id
			return new XPathAttributeNameMatcher(prefix, localName.substring(1, localName.length()), this);
		} else if (prefix != null && prefix.startsWith(ATTR_NODE_SELECTOR)) {
			// ex : @xml:id
```

### ConstantValue
Value `closeTag` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
					 * Try to find a start element with no tag : <>
					 */
					while (!(curr.isElement() && ((DOMElement) curr).isSameTag(closeTag)) && curr.parent != null) {
						curr.end = endTagOpenOffset;
						curr = curr.parent;
```

### ConstantValue
Condition `token != TokenType.EndTag` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
		if (previousTokenWasEndTagOpen) {
			previousTokenWasEndTagOpen = false;
			if (token != TokenType.EndTag) {
				// The excepted token is not an EndTag, create a fake end tag element
				DOMElement element = xmlDocument.createElement(endTagOpenOffset, endTagOpenOffset + 2);
```

### ConstantValue
Value `errorMessage` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
		stream.advance(1);
		state = isInsideDTDContent ? ScannerState.DTDWithinContent : ScannerState.WithinContent;
		return finishToken(offset, TokenType.Unknown, errorMessage);
	}

```

### ConstantValue
Condition `settings != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/HoverRequest.java`
#### Snippet
```java
	public boolean canSupportMarkupKind(String kind) {
		XMLHoverSettings hoverSettings = settings.getHoverSettings();
		return settings != null && hoverSettings.getCapabilities() != null
				&& hoverSettings.getCapabilities().getContentFormat() != null
				&& hoverSettings.getCapabilities().getContentFormat().contains(kind);
```

### ConstantValue
Condition `startsWithNumber` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
					if (ch == ':') {

						if (startsWithNumber) {
							startParam = i + 1;
						}
```

### ConstantValue
Condition `startsWithNumber` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
						break;
					} else if (ch == '|') {
						if (startsWithNumber) {
							startParam = i + 1;
							int index = line.indexOf(',', startExpr);
```

### ConstantValue
Value `hasFilterForAttr` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
			if (collectAttributes) {
				// Collect attributes from the DOM element
				List<DOMNode> attrToIgnore = getFilteredNodeAttributes(node, filter, hasFilterForAttr);
				for (DOMAttr attr : node.getAttributeNodes()) {
					findSymbolInformations(attr, containerName, symbols, attrToIgnore.contains(attr), filter, hasFilterForAttr,
```

### ConstantValue
Value `hasFilterForAttr` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
				List<DOMNode> attrToIgnore = getFilteredNodeAttributes(node, filter, hasFilterForAttr);
				for (DOMAttr attr : node.getAttributeNodes()) {
					findSymbolInformations(attr, containerName, symbols, attrToIgnore.contains(attr), filter, hasFilterForAttr,
							cancelChecker);
				}
```

### ConstantValue
Value `hasFilterForAttr` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
				if (collectAttributes) {
					// Collect attributes from the DOM element
					List<DOMNode> attrToIgnore = getFilteredNodeAttributes(node, filter, hasFilterForAttr);
					for (DOMAttr attr : node.getAttributeNodes()) {
						findDocumentSymbols(attr, childrenSymbols, attrToIgnore, filter, hasFilterForAttr, cancelChecker);
```

### ConstantValue
Value `hasFilterForAttr` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
					List<DOMNode> attrToIgnore = getFilteredNodeAttributes(node, filter, hasFilterForAttr);
					for (DOMAttr attr : node.getAttributeNodes()) {
						findDocumentSymbols(attr, childrenSymbols, attrToIgnore, filter, hasFilterForAttr, cancelChecker);
					}
				}
```

### ConstantValue
Condition `node != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			}
			DOMElement element = ((DOMElement) node);
			if (node != null && node.isElement() && !element.isSelfClosed() && element.hasTagName()
					&& !isEmptyElement(((DOMElement) node).getTagName()) && node.getStart() < offset
					&& (!element.hasEndTag() || (element.getTagName().equals(node.getParentNode().getNodeName())
```

### ConstantValue
Condition `node.getNodeName() != null` is always `true` when reached
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		} else {
			DOMNode node = xmlDocument.findNodeBefore(offset);
			if (node.isElement() && node.getNodeName() != null) {
				DOMElement element1 = (DOMElement) node;

```

### ConstantValue
Condition `parentNode != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			// no grammar, collect similar tags from the parent node
			Set<String> seenElements = new HashSet<>();
			if (parentNode != null && parentNode.isElement() && parentNode.hasChildNodes()) {
				parentNode.getChildren().forEach(node -> {
					DOMElement element = node.isElement() ? (DOMElement) node : null;
```

### ConstantValue
Condition `suffixIndex == suffix.length()` is always `false`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			// There is one of character of the suffix
			offset++;
			if (suffixIndex == suffix.length()) {
				// the suffix index is the last character of the suffix
				return offset;
```

### ConstantValue
Condition `onlySpaces` is always `true` when reached
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
			}
		}
		if (hasElement && onlySpaces) {
			return FormatElementCategory.IgnoreSpace;
		}
```

### ConstantValue
Value `range` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
			setupRangeFormatting(range);
		} else {
			setupFullFormatting(range);
		}

```

### ConstantValue
Condition `!hasOrphanEndTag` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		if (!hasOrphanEndTag && shouldGenerateFullElement) {
			// generate full element (ex : <foo attr="" ></foo>)
			String xml = generateFullElementContent(!hasOrphanEndTag && request.isAutoCloseTags());
			super.setTextEdit(Either.forLeft(new TextEdit(request.getReplaceRange(), xml)));
			super.setInsertTextFormat(InsertTextFormat.Snippet);
```

### ConstantValue
Value `baseSystemId` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			String baseSystemId = null;
			String systemId = null;
			document.loadInternalDTD(internalSubset, baseSystemId, systemId);
			return document;
		} catch (Exception e) {
```

### ConstantValue
Value `systemId` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			String baseSystemId = null;
			String systemId = null;
			document.loadInternalDTD(internalSubset, baseSystemId, systemId);
			return document;
		} catch (Exception e) {
```

### ConstantValue
Condition `matchName` is always `true` when reached
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
						// name node
						DTDDeclParameter targetElementName = targetElementDecl.getNameParameter();
						if ((!matchName || (matchName
								&& originNameNode.getParameter().equals(targetElementName.getParameter())))) {
							collector.accept(targetElementName);
```

### ConstantValue
Condition `valuesDocumentation == null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
		valuesDocumentation = null;
		this.docStrategy = currStrategy;
		if (valuesDocumentation == null) {
			valuesDocumentation = createValuesDocumentation(request);
		}
```

### ConstantValue
Condition `declaration != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
				declaration = findElementDeclaration(elt.getLocalName(), namespace);
			} else {
				declaration = declaration != null ? declaration.findCMElement(elt.getLocalName(), namespace) : null;
			}
			if (declaration == null) {
```

### ConstantValue
Condition `schemaLocation != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
					// collect xs:include XML Schema location
					String schemaLocation = targetElement.getAttribute(SCHEMA_LOCATION_ATTR);
					if (schemaLocation != null) {
						if (externalURIS == null) {
							externalURIS = new HashSet<>();
```

### ConstantValue
Value `searchInExternalSchema` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
						searchXSTargetAttributes(originAttr, bindingType, matchAttr, collector,
								externalDocument.getDocumentElement(), targetNamespacePrefix, originName, visitedURIs,
								searchInExternalSchema);
					}
				}
```

### ConstantValue
Condition `targetAttr != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
									// node is a xs:complexType, xs:simpleType element, xsl:element, xs:group which
									// matches the binding type of the originAttr
									if (targetAttr != null && (Objects.equal(originName, targetAttr.getValue()))) {
										collector.accept(originAttr, targetAttr);
									}
```

### ConstantValue
Condition `xp != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
						XSTerm t = xp.getTerm();
						if (t instanceof XSElementDeclaration) {
							if (xp != null) {
								elementOptionality.put(t.getName(), xp.getMinOccurs() == 0);
							}
```

### ConstantValue
Condition `declaration != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				declaration = findElementDeclaration(elt.getLocalName(), namespace);
			} else {
				declaration = declaration != null ? declaration.findCMElement(elt.getLocalName(), namespace) : null;
			}
			if (declaration == null) {
```

### ConstantValue
Value `inAnyLevel` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				}
				if (inAnyLevel && elt.hasChildNodes()) {
					LocationLink location = findXSAttribute(originAttribute, elt.getChildNodes(), inAnyLevel);
					if (location != null) {
						return location;
```

### ConstantValue
Value `inAnyLevel` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				}
				if (inAnyLevel && elt.hasChildNodes()) {
					location = findXSElement(originElement, elt.getChildNodes(), inAnyLevel);
					if (location != null) {
						return location;
```

### ConstantValue
Condition `msg == null` is always `false`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java

		// no message
		if (msg == null) {
			msg = key;
			if (arguments.length > 0) {
```

### ConstantValue
Condition `msg == null` is always `false`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
		}

		if (msg == null) {
			msg = fResourceBundle.getString("BadMessageKey");
			throw new MissingResourceException(msg, "XMLSchemaMessages", key);
```

### ConstantValue
Value `location` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
						ex.getCharacterOffset());
			} else {
				Position start = toLSPPosition(0, location, document.getTextDocument());
				Position end = toLSPPosition(0, location, document.getTextDocument());
				return new Range(start, end);
```

### ConstantValue
Value `location` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
			} else {
				Position start = toLSPPosition(0, location, document.getTextDocument());
				Position end = toLSPPosition(0, location, document.getTextDocument());
				return new Range(start, end);
			}
```

### ConstantValue
Condition `entity.getNodeName() != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesCompletionParticipant.java`
#### Snippet
```java
			List<Entity> entities = cmDocument.getEntities();
			for (Entity entity : entities) {
				if (entity.getNodeName() != null) {
					// provide completion for the external declared entity
					MarkupContent documentation = EntitiesDocumentationUtils.getDocumentation((DTDEntityDecl) entity,
```

### ConstantValue
Condition `entity.getNodeName() != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesCompletionParticipant.java`
#### Snippet
```java
		for (int i = 0; i < entities.getLength(); i++) {
			Entity entity = (Entity) entities.item(i);
			if (entity.getNodeName() != null) {
				// provide completion for the locally declared entity
				MarkupContent documentation = EntitiesDocumentationUtils.getDocumentation((DTDEntityDecl) entity,
```

### ConstantValue
Value `targetNamespacePrefix` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

		NodeList nodes = documentElement.getChildNodes();
		searchRNGOriginAttributes(nodes, targetAttrs, targetNamespacePrefix, collector, cancelChecker);
	}

```

### ConstantValue
Value `searchInExternalSchema` is always 'true'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
						searchRNGTargetAttributes(originAttr, bindingType, matchAttr, collector,
								externalDocument.getDocumentElement(), targetNamespacePrefix, originName, visitedURIs,
								searchInExternalSchema);
					}
				}
```

### ConstantValue
Condition `targetAttr != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
								if (isBounded(originAttr.getOwnerElement(), originBnding, targetElement)) {
									// node is a define element which matches the binding type of the originAttr
									if (targetAttr != null && (Objects.equal(originName, targetAttr.getValue()))) {
										collector.accept(originAttr, targetAttr);
									}
```

### ConstantValue
Condition `LocalDate.parse(value) != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java
		// Is xs:date ?
		try {
			if (LocalDate.parse(value) != null) {
				return DataType.DATE;
			}
```

### ConstantValue
Condition `hasCharacterContent` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2dtd/XML2DTDGenerator.java`
#### Snippet
```java
					// Mixed content
					dtd.addContent("(#PCDATA");
					if (hasCharacterContent) {
						for (ElementDeclaration elementInfo : children) {

```

### ConstantValue
Condition `elementDecl != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
				for (ElementDeclaration child : children) {
					String childName = child.getName();
					Cardinality childCardinality = elementDecl != null
							? elementDecl.getChildrenProperties().getCardinalities().get(childName)
							: null;
```

### ConstantValue
Condition `hasAttributes` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
							cancelChecker);
				}
			} else if (hasAttributes) {
				generateAttribute(schema, attributes, prefix, settings, cancelChecker);
				schema.endElement(prefix, ELEMENT_ELT);
```

### ConstantValue
Value `prefix` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/SurroundWithCommand.java`
#### Snippet
```java
				break;
			default:
				List<String> tags = getTags(node, prefix, offset, adjusted);
				String tag = tags.isEmpty() ? "" : tags.get(0);

```

### ConstantValue
Condition `resolvedId == null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
			// mapping we might be able to resolve a system identifier
			// specified as a location hint.
			if (resolvedId == null) {
				if (publicId != null && systemId != null) {
					resolvedId = resolvePublic(publicId, systemId);
```

### ConstantValue
Condition `resourceIdentifier != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
	private static boolean isXSDIncludeWithNamespace(XMLResourceIdentifier resourceIdentifier) {
		String namespaceURI = resourceIdentifier.getNamespace();
		if (resourceIdentifier != null && resourceIdentifier instanceof XSDDescription && namespaceURI != null
				&& (resourceIdentifier.getLiteralSystemId() != null
						&& !resourceIdentifier.getLiteralSystemId().contains(":"))) {
```

### ConstantValue
Condition `possibleElements != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_4_aCodeAction.java`
#### Snippet
```java

				Collection<CMElementDeclaration> possibleElements = getPossibleElements(element, request);
				if (possibleElements != null) {

					// When added to these collections, the names will be ordered alphabetically
```

### ConstantValue
Condition `!hasGrammar` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
			return;
		}
		if (!hasGrammar) {
			// No grammar, add a warn diagnostic with the severity coming from the settings.
			Range range = null;
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LSPClientLogHandler.java`
#### Snippet
```java
		sb.append(formattedDate).append(" ").append(record.getSourceClassName()).append(" ")
				.append(record.getSourceMethodName()).append("()").append(lineSeparator())
				.append("Message: " + record.getMessage());
		if (record.getThrown() != null) {
			StringWriter sw = new StringWriter();
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolFilter.java`
#### Snippet
```java
			return false;
		}
		if (expressions != null && expressions.length > 0) {
			// loop for list of XPath expression and returns the first expression which
			// matches the given node.
```

### RedundantLengthCheck
Redundant array length check
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolFilter.java`
#### Snippet
```java
	 */
	public XMLSymbolExpressionFilter getFilterForInlineAttr(DOMAttr attrNode){
		if (expressions != null && expressions.length > 0) {
			for (XMLSymbolExpressionFilter expression : expressions) {
				if (expression.match(attrNode) && expression.isInlineAttribute()) {
```

### RedundantLengthCheck
Redundant array length check
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java

	private static boolean onlyContainsNull(Object[] arr) {
		if (arr == null || arr.length == 0) {
			return true;
		}
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.lemminx.commons.TextDocument' to 'T'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocuments.java`
#### Snippet
```java
		TextDocument doc = new TextDocument(document);
		doc.setIncremental(isIncremental());
		return (T) doc;
	}

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	@Override
	public <T> T getComponent(Class clazz) {
		return (T) components.get(clazz);
	}

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/TelemetryCache.java`
#### Snippet
```java
			cache.put(key, tmp);
		} else {
			((Set<String>) cache.get(key)).add(value);
		}
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.xerces.xs.StringList' to 'java.util.Collection'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			StringList enumerations = typeDefinition.getLexicalEnumeration();
			if (enumerations != null && !enumerations.isEmpty()) {
				return enumerations;
			}
			XSObjectList memberTypes = typeDefinition.getMemberTypes();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
		Field f = getField(instance.getClass(), name);
		f.setAccessible(true);
		return (T) f.get(instance);
	}

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPSchemaParsingConfig.java`
#### Snippet
```java
		// with the custom entityManager.
		if (entityManager != null) {
			fProperties.put(ENTITY_MANAGER, entityManager);
			addComponent(entityManager);
		}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/XMLValidationFileCommand.java`
#### Snippet
```java
		// 2. trigger the validation for the given XML file
		Map map = JSONUtility.toModel(validationArgs, Map.class);
		validationService.validate(document, map);
		return null;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java

		fEntityManager = entityManager;
		fProperties.put(ENTITY_MANAGER, fEntityManager);
		addCommonComponent(fEntityManager);
	}
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ElementPatter`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclarationCollector.java`
#### Snippet
```java
/**
 * RelaxNG class used to collect content model elements children for a given
 * {@link ElementPatter}.
 * 
 * <p>
```

### JavadocReference
Cannot resolve symbol `launcherFuture`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerLauncher.java`
#### Snippet
```java
	 * RPC protocol defined by the LSP.
	 *
	 * @param launcherFuture The future returned by
	 *                       {@link org.eclipse.lsp4j.jsonrpc.Launcher#startListening()}.
	 *                       (I'm not 100% sure how it meant to be used though, as
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java
 * DTD Element Declaration <!ELEMENT
 * 
 * @see https://www.w3.org/TR/REC-xml/#dt-eldecl
 *
 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDAttlistDecl.java`
#### Snippet
```java
 * DTD Attribute List declaration <!ATTLIST
 * 
 * @see https://www.w3.org/TR/REC-xml/#attdecls
 *
 */
```

### JavadocReference
Cannot resolve symbol `kind`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java

	/**
	 * @param kind the DocumentTypeKind to set
	 */
	void setKind(int start, int end) {
```

### JavadocReference
Cannot resolve symbol `systemId`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java

	/**
	 * @param systemId the systemId to set
	 */
	void setSystemId(int start, int end) {
```

### JavadocReference
Cannot resolve symbol `publicId`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java

	/**
	 * @param publicId the publicId to set
	 */
	void setPublicId(int start, int end) {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
 * 
 * 
 * @see https://www.w3.org/TR/xml-model/
 */
public class XMLModel {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
 * DOM Entity declaration <!ENTITY
 * 
 * @see https://www.w3.org/TR/REC-xml/#dt-entdecl
 */
public class DTDEntityDecl extends DTDDeclNode implements Entity {
```

### JavadocReference
Cannot resolve symbol `attributeName`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is the default xmlns attribute and false
	 *         otherwise.
```

### JavadocReference
Cannot resolve symbol `attributeName`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is the no default xmlns attribute and false
	 *         otherwise.
```

### JavadocReference
Cannot resolve symbol `attributeName`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * Returns true if attribute name is a xmlns attribute and false otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is a xmlns attribute and false otherwise.
	 */
```

### JavadocReference
Cannot resolve symbol `xmlDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 * Validate and publish diagnostics for the given DOM document.
	 *
	 * @param xmlDocument the DOM document.
	 *
	 * @throws CancellationException when the DOM document content changed and
```

### JavadocReference
Cannot resolve symbol `testNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Returns true if element name is matched and false otherwise.
	 * 
	 * @param testNode
	 * @return
	 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
 * @author Angelo ZERR
 *
 * @see https://github.com/microsoft/language-server-protocol/issues/788
 */
public class ExtendedClientCapabilities {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/CodeLensKind.java`
#### Snippet
```java
 * @author Angelo ZERR
 * 
 * @see https://github.com/microsoft/language-server-protocol/issues/788
 */
public class CodeLensKind {
```

### JavadocReference
Cannot resolve symbol `featureName`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/LimitExceededWarner.java`
#### Snippet
```java
	 * 
	 * @param uri            the file uri
	 * @param featureName    the feature name
	 */
	public void onResultLimitExceeded(String uri, LimitFeature feature) {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.text.ILineTrackerExtension`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ILineTracker.java`
#### Snippet
```java
 * exist:
 * <ul>
 * <li> {@link org.eclipse.jface.text.ILineTrackerExtension} since version 3.1 introducing the concept
 *      of rewrite sessions.</li>
 * </ul>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.text.DefaultLineTracker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ILineTracker.java`
#### Snippet
```java
 * Clients may implement this interface or use the standard implementation
 * </p>
 * {@link org.eclipse.jface.text.DefaultLineTracker}or
 * {@link org.eclipse.jface.text.ConfigurableLineTracker}.
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.text.ConfigurableLineTracker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ILineTracker.java`
#### Snippet
```java
 * </p>
 * {@link org.eclipse.jface.text.DefaultLineTracker}or
 * {@link org.eclipse.jface.text.ConfigurableLineTracker}.
 */
public interface ILineTracker {
```

### JavadocReference
Cannot resolve symbol `fileContent`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * 
	 * @param replaceText the text to replace.
	 * @param fileContent the range to replace the text over.
	 * @param document
	 * @return the workspace edit of a given replacement text and range.
```

### JavadocReference
Cannot resolve symbol `range`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 *
	 * @param title
	 * @param range
	 * @param insertText
	 * @param document
```

### JavadocReference
Cannot resolve symbol `uri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelValidatorDelayer.java`
#### Snippet
```java
	 * <code>uri</code> with a delay.
	 * 
	 * @param uri      the document URI.
	 * @param document the document model to validate.
	 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/SnippetsBuilder.java`
#### Snippet
```java
 * Snippet syntax utilities.
 * 
 * @see https://github.com/Microsoft/language-server-protocol/blob/master/snippetSyntax.md
 */
public class SnippetsBuilder {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/SnippetsBuilder.java`
#### Snippet
```java
	 * @return the LSP choices snippets content.
	 * 
	 * @see https://github.com/Microsoft/language-server-protocol/blob/master/snippetSyntax.md#choice
	 */
	public static String choice(int index, Collection<String> values) {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/SnippetsBuilder.java`
#### Snippet
```java
	 * @return
	 * 
	 * @see https://github.com/Microsoft/language-server-protocol/blob/master/snippetSyntax.md#choice
	 */
	public static void choice(int index, Collection<String> values, StringBuilder snippets) {
```

### JavadocReference
Cannot resolve symbol `uri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 * Returns the model of the given text document Uri and null otherwise.
	 *
	 * @param uri the text document uri.
	 *
	 * @return the model of the given text document Uri and null otherwise.
```

### JavadocReference
Cannot resolve symbol `uri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 * Returns the model of the given text document Uri and null otherwise.
	 *
	 * @param uri the text document uri.
	 *
	 * @return the model of the given text document Uri and null otherwise.
```

### JavadocReference
Cannot resolve symbol `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 * Returns the range for the given <code>node</code>.
	 *
	 * @param node the node
	 * @return the range for the given <code>node</code>.
	 */
```

### JavadocReference
Cannot resolve symbol `suffixOnly`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 *
	 * @param element    the DOM element
	 * @param suffixOnly select the suffix portion, only when a prefix exists
	 * @return the range of the start tag of the given <code>element</code> and null
	 *         otherwise.
```

### JavadocReference
Cannot resolve symbol `limit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/LimitList.java`
#### Snippet
```java
	 * becomes negative.
	 * 
	 * @param limit the limit to decrement
	 */
	private void checkLimit() {
```

### JavadocReference
Cannot resolve symbol `xmlDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
	 * the given <code>position</code> and null otherwise.
	 *
	 * @param xmlDocument   the DOM document.
	 * @param position      the position.
	 * @param cancelChecker the cancel checker.
```

### JavadocReference
Cannot resolve symbol `textDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFormatter.java`
#### Snippet
```java
	 * update spaces / indent.
	 *
	 * @param textDocument   document to perform formatting on
	 * @param range          specified range in which formatting will be done
	 * @param sharedSettings settings containing formatting preferences
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/FormatElementCategory.java`
#### Snippet
```java
 * @author Angelo ZERR
 * 
 * @see https://www.oxygenxml.com/doc/versions/24.0/ug-editorEclipse/topics/format-and-indent-xml.html
 */
public enum FormatElementCategory {
```

### JavadocReference
Cannot resolve symbol `attrRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
	 * 
	 * @param hoverRequest  the hover request.
	 * @param attrRange     the attribute range
	 * @param cancelChecker the cancel checker.
	 * 
```

### JavadocReference
Cannot resolve symbol `settings`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 *
	 * @param registry
	 * @param settings
	 */
	void start(InitializeParams params, XMLExtensionsRegistry registry);
```

### JavadocReference
Cannot resolve symbol `hoverRequest`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 * onAttributeName method
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
```

### JavadocReference
Cannot resolve symbol `the`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
	 * @return the Value of MarkupContent {@link String}
```

### JavadocReference
Cannot resolve symbol `hoverRequest`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 * onAttributeValue method
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
```

### JavadocReference
Cannot resolve symbol `the`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
	 * @return the Value of MarkupContent {@link String}
```

### JavadocReference
Cannot resolve symbol `hoverRequest`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 * onText method
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
```

### JavadocReference
Cannot resolve symbol `the`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
	 * @return the Value of MarkupContent {@link String}
```

### JavadocReference
Cannot resolve symbol `hoverRequest`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 * onTag method
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
```

### JavadocReference
Cannot resolve symbol `the`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/hover/IHoverParticipant.java`
#### Snippet
```java
	 *
	 * @param hoverRequest the hover request.
	 * @param the          cancel checker.
	 * 
	 * @return the Value of MarkupContent {@link String}
```

### JavadocReference
Cannot resolve symbol `indentLevel`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/format/IFormatterParticipant.java`
#### Snippet
```java
	 * 
	 * @param formatterDocument the formatter document
	 * @param indentLevel       the current indent level of the attribute
	 * @param formattingOptions the formatting options that contain the settings
	 * @param attr              the attribute node
```

### JavadocReference
Cannot resolve symbol `request`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameResponse.java`
#### Snippet
```java
	 * Adds text document edit to rename response.
	 * 
	 * @param request A rename request
	 * @param textDocumentEdit A TextDocumentEdit object to be added to rename response
	 * @since 0.26
```

### JavadocReference
Cannot resolve symbol `request`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameResponse.java`
#### Snippet
```java
	 * Adds resource operation to rename response.
	 * 
	 * @param request A rename request
	 * @param resourceOperation A ResourceOperation object to store to rename response
	 * @since 0.26
```

### JavadocReference
Cannot resolve symbol `documentChanges`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameParticipant.java`
#### Snippet
```java
	 * 
	 * @param request A rename request
	 * @param documentChanges A list to collect either text document edits or rename operations
	 * @param cancelChecker Cancel checker
	 * @throws CancellationException if the computation was cancelled
```

### JavadocReference
Cannot resolve symbol `fieldName`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionItemResolverRequest.java`
#### Snippet
```java
	 * request as an boolean, or null if the field is not an boolean.
	 *
	 * @param fieldName the name of the field to retrieve the data from
	 * @return the value of a field from the supplementary data attached to the
	 *         request as an boolean, or null if the field is not an boolean
```

### JavadocReference
Cannot resolve symbol `parentElement`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractAttributeCompletionResolver.java`
#### Snippet
```java
	 * @param request       the completion resolve request
	 * @param toResolve     the unresolved completion item to resolve
	 * @param parentElement the parent element to where completion was opened on
	 * @param attr          the attribute that completion was opened on, may be null
	 */
```

### JavadocReference
Cannot resolve symbol `attr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractAttributeCompletionResolver.java`
#### Snippet
```java
	 * @param toResolve     the unresolved completion item to resolve
	 * @param parentElement the parent element to where completion was opened on
	 * @param attr          the attribute that completion was opened on, may be null
	 */
	protected abstract void resolveCompletionItem(DOMElement element, CompletionItem toResolve,
```

### JavadocReference
Cannot resolve symbol `element`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * Format the given DOM CDATA
	 *
	 * @param element the DOM CDATA to format.
	 *
	 */
```

### JavadocReference
Cannot resolve symbol `element`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * Format the given DOM Comment
	 *
	 * @param element the DOM Comment to format.
	 *
	 */
```

### JavadocReference
Cannot resolve symbol `element`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * Format the given DOM ProcessingIntsruction.
	 *
	 * @param element the DOM ProcessingIntsruction to format.
	 *
	 */
```

### JavadocReference
Cannot resolve symbol `codelens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCodeLensSettings.java`
#### Snippet
```java
	 * Update the codelens client capabilities.
	 * 
	 * @param codelens client capabilities
	 */
	public void setCodeLens(ExtendedCodeLensCapabilities codeLens) {
```

### JavadocReference
Cannot resolve symbol `characterOffset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
```

### JavadocReference
Cannot resolve symbol `key`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
 * XSD error code.
 *
 * @see https://wiki.xmldation.com/Support/Validator
 *
 *      All error code types and messages can be found in the Xerces library
```

### JavadocReference
Cannot resolve symbol `grammar`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * @param enclosingType the enclosing type of the XS element declaration which
	 *                      matches the XML element
	 * @param grammar       the Xerces grammar
	 * @return the location of the global xs:element declared in the given XML
	 *         Schema <code>targetSchema</code> which matches the given XML element
```

### JavadocReference
Cannot resolve symbol `position`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * @param attributeName
	 * @param element
	 * @param position
	 * @return
	 */
```

### JavadocReference
Cannot resolve symbol `diagnosticSeverity`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReferencedGrammarDiagnosticsInfo.java`
#### Snippet
```java
	 * Increment the error number to update the diagnostic root message.
	 * 
	 * @param diagnosticSeverity
	 */
	public void addError(boolean fatalError) {
```

### JavadocReference
Cannot resolve symbol `message`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelAwareParserConfiguration.java`
#### Snippet
```java
 * and provides support for xml-model association.
 *
 * @see https://www.w3.org/TR/xml-model/
 */
public class XMLModelAwareParserConfiguration extends XIncludeAwareParserConfiguration {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelDeclaration.java`
#### Snippet
```java
 * 
 * 
 * @see https://www.w3.org/TR/xml-model/
 *
 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
 * </pre>
 * 
 * @see https://www.w3.org/TR/xml-model/
 *
 */
```

### JavadocReference
Cannot resolve symbol `attributePath`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param pathToAttributeDirectory
	 * @param attributePath
	 * @param replaceRange
	 * @param response
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesCompletionParticipant.java`
#### Snippet
```java
	 * @param response    the completion response.
	 *
	 * @see https://www.w3.org/TR/xml/#sec-predefined-ent
	 */
	private void collectPredefinedEntityProposals(Range entityRange, boolean markdown, ICompletionResponse response) {
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
 * XInclude error code.
 *
 * @see https://wiki.xmldation.com/Support/Validator
 *
 *      All error code types and messages can be found in the Xerces library
```

### JavadocReference
Cannot resolve symbol `characterOffset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
```

### JavadocReference
Cannot resolve symbol `key`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocReference
Cannot resolve symbol `formatter`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/FileContentGeneratorManager.java`
#### Snippet
```java
	 * @param sharedSettings    the shared settings.
	 * @param generatorSettings the generator settings.
	 * @param formatter         the formatter.
	 * @return the result of the generation of the file content (ex : XSD, DTD) from
	 *         the given document source <code>document</code> (ex: XML) by using
```

### JavadocReference
Cannot resolve symbol `queryDirection`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
	 * @param node           the DOM node.
	 * @param expression     the reference expression.
	 * @param queryDirection the query direction.
	 * 
	 * @return the inversed direction of the given node according the given
```

### JavadocReference
Cannot resolve symbol `document`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
	 * <code>document</code> and null otherwise.
	 * 
	 * @param document              the DOM document.
	 * @param xmlReferencesSettings the XML references settings which hosts all
	 *                              references expressions.
```

### JavadocReference
Cannot resolve symbol `attribute`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
	 * Returns the declared attribute which match the given name and null otherwise.
	 * 
	 * @param attribute the DOM attribute
	 * @return the declared attribute which match the given name and null otherwise.
	 */
```

### JavadocReference
Cannot resolve symbol `type`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
	 * </p>
	 * 
	 * @param type         the type of the resource being resolved
	 * @param namespaceURI the namespace of the resource being resolved, or
	 *                     <code>null</code> if none was supplied
```

### JavadocReference
Cannot resolve symbol `key`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
 * DTD error code.
 *
 * @see https://wiki.xmldation.com/Support/Validator
 *
 */
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
 * XML Schema error code.
 *
 * @see https://wiki.xmldation.com/Support/Validator
 *
 */
```

### JavadocReference
Cannot resolve symbol `key`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocReference
Cannot resolve symbol `key`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocReference
Cannot resolve symbol `https`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
 * XML error code.
 *
 * @see https://wiki.xmldation.com/Support/Validator
 *
 */
```

### JavadocReference
Cannot resolve symbol `cmDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param element
	 * @param cmDocument
	 * @param cmElements
	 * @param defaultPrefix
```

### JavadocReference
Cannot resolve symbol `org.apache.xerces.util.XMLGrammarPoolImpl.XMLGrammarPoolImpl`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
 * <p>
 * This class is a copy/paste of
 * {@link org.apache.xerces.util.XMLGrammarPoolImpl.XMLGrammarPoolImpl} from
 * Xerces adapated to use .lemminx cache.
 * </p>
```

### JavadocReference
Cannot resolve symbol `filePath`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/IExternalGrammarLocationProvider.java`
#### Snippet
```java
	 * schema is allowed).
	 * 
	 * @param filePath the path for the XML file
	 * @return a {@link Map} associating the external-schemaLocation and/or
	 *         external-noNamespaceSchemaLocation to the schema location
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPoolWrapper.java`
#### Snippet
```java

	public void cacheGrammars(String grammarType, Grammar[] grammars) {
		for (Grammar grammar : grammars) {
			cachedGrammars.add(grammar);
		}
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/TokenType.java`
#### Snippet
```java

	//End of any DTD Decl Tag
	DTDEndTag;

	
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/ScannerState.java`
#### Snippet
```java
	DTDAfterAttlistAttributeName, DTDAfterAttlistAttributeType, DTDAfterEntityName, DTDUnrecognizedParameters, 
	DTDWithinNotation, DTDAfterNotationName, DTDAfterNotationPUBLIC, DTDAfterNotationSYSTEM, 
	DTDAfterNotationPublicId, DTDAfterEntityPUBLIC, DTDAfterEntitySYSTEM, DoctypeUnrecognizedParameters;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		didOpen, //
		didChange, //
		Other;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java

	public enum MatcherType {
		ELEMENT, ATTRIBUTE, TEXT;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

import org.eclipse.lemminx.dom.DOMDocumentType.DocumentTypeKind;
import org.eclipse.lemminx.utils.StringUtils;;

/**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
					(nestingLevelCounts.containsKey(level) ? nestingLevelCounts.get(level) : 0) + 1);
		}
	};

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ISymbolsProviderParticipant.java`
#### Snippet
```java

	public enum SymbolStrategy {
		UNADAPTABLE, INSERT, REPLACE;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/save/ISaveContext.java`
#### Snippet
```java
	 */
	public enum SaveContextType {
		DOCUMENT, SETTINGS;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/EnforceQuoteStyle.java`
#### Snippet
```java
 */
public enum EnforceQuoteStyle {
	preferred, ignore;
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/QuoteStyle.java`
#### Snippet
```java
public enum QuoteStyle {
	@SerializedName("single") singleQuotes,
	@SerializedName("double") doubleQuotes;
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	 */
	public static enum EmptyElements {
		expand, collapse, ignore;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
					return new Range(new Position(lineNumber, startNameColumnNumber),
							new Position(lineNumber, startNameColumnNumber + name.length()));
				};

				@Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelDeclaration.java`
#### Snippet
```java

	private enum State {
		Content, AttName, AfterAttName, AfterEquals, AttValue;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/SchemaProvider.java`
#### Snippet
```java
			protected XMLErrorHandler getErrorHandler() {
				return handler;
			};
		};
	}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
	public enum BindingType {
		DEFINE // defines a reference from an attribute (ex : ref/@name) to a define/@name attribute.
		, NONE;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java

	public static enum DataType {
		UNKNOWN, DATE, DATE_TIME, DECIMAL, BOOLEAN, INTEGER;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQuery.java`
#### Snippet
```java

	public static enum QueryDirection {
		FROM_2_TO, TO_2_FROM, BOTH;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java

	public static enum Direction {
		FROM, TO;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java
		INVALID_PREFIX,
		EMPTY_VALUE,
		OK;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/NamespacesEnabled.java`
#### Snippet
```java

public enum NamespacesEnabled {
	always, never, onNamespaceEncountered;
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/SchemaEnabled.java`
#### Snippet
```java

public enum SchemaEnabled {
	always, never, onValidSchema;
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadedException.java`
#### Snippet
```java
	public CacheResourceDownloadedError getErrorCode() {
		return errorCode;
	};
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getLocalName() {
		return getJingName().getLocalName();
	}

```

### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		result.append("<element");
		result.append(" name=\"");
		result.append(getJingName().getLocalName());
		result.append("\"");
		result.append(" namespaceUri=\"");
```

### DataFlowIssue
Method invocation `getNamespaceUri` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getNamespace() {
		return getJingName().getNamespaceUri();
	}

```

### DataFlowIssue
Argument `getModelDeclaration()` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
	 */
	public boolean isApplicable() {
		return isApplicableForDTD(getModelDeclaration()) || isApplicableForXSD(getModelDeclaration())
				|| isApplicableForRelaxNG(getModelDeclaration());
	}
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public NodeList getElementsByTagName(String arg0) {
		return null;
	}

```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public NodeList getElementsByTagNameNS(String arg0, String arg1) throws DOMException {
		return null;
	}

```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public String getAttributeNS(String arg0, String arg1) throws DOMException {
		return null;
	}

```

### DataFlowIssue
Casting `curr` to `DOMElement` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case StartTag: {
					DOMElement element = (DOMElement) curr;
					element.tag = scanner.getTokenText();
					curr.end = scanner.getTokenEnd();
```

### DataFlowIssue
Casting `curr` to `DOMElement` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				case StartTagClose:
					if (curr.isElement()) {
						DOMElement element = (DOMElement) curr;
						curr.end = scanner.getTokenEnd(); // might be later set to end tag position
						element.startTagCloseOffset = scanner.getTokenOffset();
```

### DataFlowIssue
Casting `curr` to `DOMProcessingInstruction` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
						}
					} else if (curr.isProcessingInstruction() || curr.isProlog()) {
						DOMProcessingInstruction element = (DOMProcessingInstruction) curr;
						curr.end = scanner.getTokenEnd(); // might be later set to end tag position
						element.startTagClose = true;
```

### DataFlowIssue
Casting `curr` to `DOMElement` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
					 * eg: <a><b><c></d> will set a,b,c end position to the start of |</d>
					 */
					while (!(curr.isElement() && ((DOMElement) curr).isSameTag(closeTag)) && curr.parent != null) {
						curr.end = endTagOpenOffset;
						curr = curr.parent;
```

### DataFlowIssue
Casting `curr` to `DOMElement` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
					if (curr.parent != null) {
						curr.closed = true;
						((DOMElement) curr).selfClosed = true;
						curr.end = scanner.getTokenEnd();
						lastClosed = curr;
```

### DataFlowIssue
Casting `curr` to `DOMElement` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
						lastClosed = curr;
						if (lastClosed.isElement()) {
							((DOMElement) curr).endTagCloseOffset = scanner.getTokenOffset();
						}
						if (curr.isDoctype()) {
```

### DataFlowIssue
Casting `curr` to `DOMCDATASection` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case CDATAContent: {
					DOMCDATASection cdataNode = (DOMCDATASection) curr;
					cdataNode.startContent = scanner.getTokenOffset();
					cdataNode.endContent = scanner.getTokenEnd();
```

### DataFlowIssue
Casting `curr` to `DOMProcessingInstruction` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case PIName: {
					DOMProcessingInstruction processingInstruction = ((DOMProcessingInstruction) curr);
					processingInstruction.target = scanner.getTokenText();
					processingInstruction.processingInstruction = true;
```

### DataFlowIssue
Casting `curr` to `DOMProcessingInstruction` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case PrologName: {
					DOMProcessingInstruction processingInstruction = ((DOMProcessingInstruction) curr);
					processingInstruction.target = scanner.getTokenText();
					processingInstruction.prolog = true;
```

### DataFlowIssue
Casting `curr` to `DOMProcessingInstruction` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case PIContent: {
					DOMProcessingInstruction processingInstruction = (DOMProcessingInstruction) curr;
					processingInstruction.startContent = scanner.getTokenOffset();
					processingInstruction.endContent = scanner.getTokenEnd();
```

### DataFlowIssue
Casting `curr` to `DOMComment` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case Comment: {
					DOMComment comment = (DOMComment) curr;
					comment.startContent = scanner.getTokenOffset();
					comment.endContent = scanner.getTokenEnd();
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDDoctypeName: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setName(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDDocTypeKindPUBLIC: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDDocTypeKindSYSTEM: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDDoctypePublicId: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setPublicId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDDoctypeSystemId: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setSystemId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDStartInternalSubset: {
					DOMDocumentType doctype = (DOMDocumentType) curr;
					doctype.setStartInternalSubset(scanner.getTokenOffset());
					inDTDInternalSubset = true;
```

### DataFlowIssue
Casting `curr` to `DTDElementDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDElementDeclName: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.setName(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDElementDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDElementCategory: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.setCategory(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDElementDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDStartElementContent: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.setContent(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDElementDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDElementContent: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.updateLastParameterEnd(scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDElementDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEndElementContent: {
					DTDElementDecl element = (DTDElementDecl) curr;
					element.updateLastParameterEnd(scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDAttlistDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDAttlistElementName: {
					DTDAttlistDecl attribute = (DTDAttlistDecl) curr;
					attribute.setName(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDAttlistDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDAttlistAttributeName: {
					DTDAttlistDecl attribute = (DTDAttlistDecl) curr;
					if (isInitialDeclaration == false) {
						// All additional declarations are created as new DTDAttlistDecl's
```

### DataFlowIssue
Casting `curr` to `DTDAttlistDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDAttlistAttributeType: {
					DTDAttlistDecl attribute = (DTDAttlistDecl) curr;
					attribute.setAttributeType(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDAttlistDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDAttlistAttributeValue: {
					DTDAttlistDecl attribute = (DTDAttlistDecl) curr;
					attribute.setAttributeValue(scanner.getTokenOffset(), scanner.getTokenEnd());

```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEntityPercent: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setPercent(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEntityName: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setName(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEntityValue: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setValue(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				case DTDEntityKindPUBLIC:
				case DTDEntityKindSYSTEM: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEntityPublicId: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setPublicId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDEntityDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEntitySystemId: {
					DTDEntityDecl entity = (DTDEntityDecl) curr;
					entity.setSystemId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDNotationDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDNotationName: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setName(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDNotationDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDNotationKindPUBLIC: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDNotationDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDNotationKindSYSTEM: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setKind(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDNotationDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDNotationPublicId: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setPublicId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DTDNotationDecl` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDNotationSystemId: {
					DTDNotationDecl notation = (DTDNotationDecl) curr;
					notation.setSystemId(scanner.getTokenOffset(), scanner.getTokenEnd());
					break;
```

### DataFlowIssue
Casting `curr` to `DOMDocumentType` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEndDoctypeTag: {
					((DOMDocumentType) curr).end = scanner.getTokenEnd();
					curr.closed = true;
					curr = curr.parent;
```

### DataFlowIssue
Casting `curr` to `DTDDeclNode` may produce `ClassCastException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDUnrecognizedParameters: {
					DTDDeclNode node = (DTDDeclNode) curr;
					node.setUnrecognized(scanner.getTokenOffset(), ((XMLScanner) scanner).getLastNonWhitespaceOffset());
					break;
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
				char ch = line.charAt(i);
				if (Character.isDigit(ch)) {
					startsWithNumber = true;
				} else {
					onlyNumber = false;
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
							}
						}
						nodesToIgnore.add(attrDecl);
					}
				}
```

### DataFlowIssue
Argument `element` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java

		if (node.isCDATA()) {
			return getCDATARenameTextEdits(xmlDocument, element, position, newText);
		}

```

### DataFlowIssue
Argument `element` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
		}

		if (isRenameTagName(xmlDocument, element, position)) {
			return getTagNameRenameTextEdits(xmlDocument, element, position, newText);
		}
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			valueStart = valueContentStart;
			valueEnd = valueContentEnd;
			addQuotes = false;
		} else {
			valuePrefix = text.substring(valueStart, offset);
```

### DataFlowIssue
Method invocation `getEnd` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
		int width = 0;
		if (isPreserveAttributeLineBreaks() && element.hasAttributes()
				&& hasLineBreak(getLastAttribute(element).getEnd(), startTagClose)) {
			spaceBeforeEmptyCloseTag = false;
			int indentLevel = parentConstraints.getIndentLevel();
```

### DataFlowIssue
Method invocation `getAttributeNodes` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	private boolean hasSingleAttributeInFullDoc(DOMElement element) {
		DOMElement fullElement = getFullDocElemFromRangeElem(element);
		return fullElement.getAttributeNodes().size() == 1;
	}

```

### DataFlowIssue
Method invocation `getEnd` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
				elementEndOffset = element.getStartTagCloseOffset();
			}
			if (!isSameLine(getLastAttribute(element).getEnd(), elementEndOffset)) {
				this.xmlBuilder.linefeed();
				this.xmlBuilder.indent(this.indentLevel);
```

### DataFlowIssue
Argument `startNode` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
				if (!startTagExistsInRangeDocument(node) && startTagExistsInFullDocument(node)) {
					DOMNode startNode = getFullDocElemFromRangeElem((DOMElement) node);
					int currentIndentLevel = getNodeIndentLevel(startNode);
					this.xmlBuilder.indent(currentIndentLevel);
					this.indentLevel = currentIndentLevel;
```

### DataFlowIssue
Method invocation `getEnd` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	private void formatElementStartTagCloseBracket(DOMElement element) throws BadLocationException {
		if (this.sharedSettings.getFormattingSettings().isPreserveAttributeLineBreaks() && element.hasAttributes()
				&& !isSameLine(getLastAttribute(element).getEnd(), element.getStartTagCloseOffset())) {
			xmlBuilder.linefeed();
			this.xmlBuilder.indent(this.indentLevel);
```

### DataFlowIssue
Method invocation `toArray` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
				}
				// Get annotations for base type
				for (Object xsObject : getElementAnnotations(baseType).toArray()) {
					if (((XSObject) xsObject) != null) {
						allAnnotations.addXSObject((XSObject) xsObject);
```

### DataFlowIssue
Dereference of `fComplexTypeDecls` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			// Find the location offset of the given complexType
			XSComplexTypeDecl[] fComplexTypeDecls = getXSComplexTypeDecls(grammar);
			for (int i = 0; i < fComplexTypeDecls.length; i++) {
				if (complexType.equals(fComplexTypeDecls[i])) {
					XMLLocator locator = fCTLocators[i];
```

### DataFlowIssue
Method invocation `setValues` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java

				// save root element state
				fRootElement.setValues(null, rootElementName, rootElementName, null);

				String eid = null;
```

### DataFlowIssue
Argument `filePathRange` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
				if (valuePath.length() == 1) {
					// only '/', so list Windows Drives
					Range replaceRange = adjustReplaceRange(xmlDocument, filePathRange, originalValuePath, "/");
					File[] drives = File.listRoots();
					for (File drive : drives) {
```

### DataFlowIssue
Argument `filePathRange` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
		// Get adjusted range for the completion item (insert at end, or overwrite some
		// existing text in the path)
		Range replaceRange = adjustReplaceRange(xmlDocument, filePathRange, originalValuePath, slashInAttribute);
		createNextValidCompletionPaths(validAttributePath, slashInAttribute, replaceRange, response, null);
	}
```

### DataFlowIssue
Argument `element` might be null
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
					if (element != null && element.isEmpty()) {
						return XMLPositionUtility.selectStartTagName(element);
					} else if (DOMUtils.containsTextOnly(element)) {
						return XMLPositionUtility.selectTrimmedText(offset, document);
					} else {
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
			char previous = text.charAt(offset - 1);
			if (previous == '<') {
				enclosed = false;
				offset--;
			} else {
```

### DataFlowIssue
Method invocation `getLine` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
		Position insertPosition = getEntityInsertPosition(document);
		String message = "Declare ENTITY " + entityName;
		String delimiter = document.lineDelimiter(insertPosition.getLine());

		XMLBuilder insertString = new XMLBuilder(settings, null, delimiter);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		}

		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		@Override
		public void collectDocumentToValidate(Predicate<DOMDocument> validateDocumentPredicate) {
			documents.all().stream().forEach(document -> {
				DOMDocument xmlDocument = document.getModel();
				if (xmlDocument != null && !documentsToValidate.contains(document)
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/TextEditUtils.java`
#### Snippet
```java
		spans.add(text.substring(lastModifiedOffset));
		return spans.stream() //
				.collect(Collectors.joining());
	}

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/RenameResponse.java`
#### Snippet
```java
			List<TextEdit> edits = new ArrayList<>();
			edits.addAll(existingTextDocumentEdit.getEdits());
			textDocumentEdit.getEdits().stream().forEach(te -> {
				if (!edits.contains(te)) {
					edits.add(te);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	public void initializeParams(InitializeParams params) {
		if (initialized) {
			extensions.stream().forEach(extension -> {
				try {
					extension.start(params, this);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	public void doSave(ISaveContext saveContext) {
		if (initialized) {
			extensions.stream().forEach(extension -> extension.doSave(saveContext));
		} else if (this.initialSaveContext == null
				|| (saveContext != null && saveContext.getType() == SaveContextType.SETTINGS)) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
			return;
		}
		children.stream().forEach(name -> {
			CMElementDeclaration element = findElementDeclaration(name, null);
			if (element != null) {
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
		}
		// Disable the DTD validation only if there are not <!ELEMENT or an <!ATTRLIST
		return !docType.getChildren().stream().anyMatch(node -> node.isDTDElementDecl() || node.isDTDAttListDecl());
	}

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		String name = getName();
		if (isDefaultXmlns()) {
			return name.substring(XMLNS_ATTR.length(), name.length());
		}
		return name.substring(XMLNS_NO_DEFAULT_ATTR.length(), name.length());
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
			return name.substring(XMLNS_ATTR.length(), name.length());
		}
		return name.substring(XMLNS_NO_DEFAULT_ATTR.length(), name.length());
	}

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
				return value.substring(1, value.length() - 1);
			}
			return value.substring(1, value.length());
		}
		return value;
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	private String toString(int indent) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < indent; i++) {
			result.append("\t");
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
			try {
				// get the wildcard index (ex : 0 for [@id='$0']).
				indexWildcard = Integer.parseInt(attrValue.substring(1, attrValue.length()));
			} catch (NumberFormatException e) {

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
				index++;
			}
			fileURI = fileURI.substring(index + 1, fileURI.length());
		}
		return fileURI;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		} else if (prefix == null && localName.startsWith(ATTR_NODE_SELECTOR)) {
			// ex : @id
			return new XPathAttributeNameMatcher(prefix, localName.substring(1, localName.length()), this);
		} else if (prefix != null && prefix.startsWith(ATTR_NODE_SELECTOR)) {
			// ex : @xml:id
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		} else if (prefix != null && prefix.startsWith(ATTR_NODE_SELECTOR)) {
			// ex : @xml:id
			return new XPathAttributeNameMatcher(prefix.substring(1, prefix.length()), localName, this);
		}
		return new XPathElementMatcher(prefix, localName, this);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		String localName = null;
		if (xpathExpression.startsWith("/")) {
			xpathExpression = xpathExpression.substring(1, xpathExpression.length());
		}
		boolean endsWithAny = false;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
				if (indexNS != -1) {
					prefix = localName.substring(0, indexNS);
					localName = localName.substring(indexNS + 1, localName.length());
				}
				int indexSquareBracket = localName.indexOf("[");
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
					nodeMatcher = this.createAndAddNodeMatcher(prefix, elementName);

					String attributesCondition = localName.substring(indexSquareBracket, localName.length());
					// ex : attributesCondition=[@type='pipeline'][@src='p1']

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
											XPathAttributeMatcher attributematcher = this.createAttributeMatcher(
													(XPathElementMatcher) nodeMatcher,
													attrName.toString().substring(1, attrName.length()),
													attrValue.toString());
											if (attributematcher.hasWildcard()) {
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/DocumentTelemetryInfo.java`
#### Snippet
```java
		String uri = doc.getDocumentURI();
		int index = uri.lastIndexOf('.');
		String fileExtension = uri.substring(index + 1, uri.length()).toLowerCase();
		boolean isXML = !DOMUtils.isXSD(doc) && !DOMUtils.isDTD(uri);
		Set<ReferencedGrammarInfo> referencedGrammarInfos = manager.getReferencedGrammarInfos(doc);
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
			}
		}
		return xsValue != null ? xsValue.getNormalizedValue().toString() : null;
	}

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
				return null;
			}
			return originAttrValue.substring(index + 1, originAttrValue.length());
		}
		return originAttrValue;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
		}
		if (start != -1) {
			locations.add(value.substring(start, value.length()));
		}
		return locations;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReferencedGrammarDiagnosticsInfo.java`
#### Snippet
```java
		}
		if (index != -1) {
			fileName = grammarURI.substring(index + 1, grammarURI.length());
		}
		return fileName;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
				// For Windows OS, remove the last '/' from file:///
				// ex: valuePath="C:/fold"
				valuePath = valuePath.substring(1, valuePath.length());
				if (valuePath.length() == 1) {
					// only '/', so list Windows Drives
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
			return schemaURI;
		}
		return schemaURI.substring(index + 1, schemaURI.length());
	}
}
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
				return null;
			}
			return originAttrValue.substring(index + 1, originAttrValue.length());
		}
		return originAttrValue;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java
		StringBuilder result = new StringBuilder();
		String text = node.getOwnerDocument().getText();
		result.append(text.substring(start, end));
		result.append(direction == Direction.FROM ? " -->" : " <--");
		return result.toString();
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesDiagnosticParticipant.java`
#### Snippet
```java
						String valueWithoutPrefix = value;
						if (from.getPrefix() != null) {
							valueWithoutPrefix = value.substring(from.getPrefix().length(), value.length());
						}
						String message = MessageFormat.format(UNDEFINED_REFERENCE_MESSSAGE, value,
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
			// In case of 'from' node, we need to remove the prefix
			String prefix = searchNode.getPrefix();
			return placeholder.substring(prefix.length(), placeholder.length());
		}
		return placeholder;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return schemaURI;
		}
		return schemaURI.substring(index + 1, schemaURI.length());
	}

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
					String namespaceURI = namespaceAntAttrName.substring(0, index);
					String prefix = document.getDocumentElement().getPrefix(namespaceURI);
					attrName = namespaceAntAttrName.substring(index + 1, namespaceAntAttrName.length());
					if (prefix != null && !prefix.isEmpty()) {
						attrName = prefix + ":" + attrName;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/CompletionSortTextHelper.java`
#### Snippet
```java
	public String next() {
		i++;
		return base + Integer.toString(i);
	}

```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/CompletionSortTextHelper.java`
#### Snippet
```java
		String tempBase = getSortText(kind);
		i++;
		return tempBase + Integer.toString(i);
	}

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReferencedGrammarDiagnosticsInfo.java`
#### Snippet
```java
		this.fatalError = fatalError;
		nbError++;
		diagnostic.setMessage("There " + (nbError > 1 ? "are" : "is") + " '" + String.valueOf(nbError) + "' error"
				+ (nbError > 1 ? "s" : "") + " in '" + getGrammarFileName() + "'.");
	}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
			try {
				HttpURLConnection httpConn = (HttpURLConnection) conn;
				return (String.valueOf(httpConn.getResponseCode())) + " " + httpConn.getResponseMessage();
			} catch (IOException e) {
				// connection refused and no code could be retrived, do nothing
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
		for (int i = 0; i < locations.getLength(); i++) {
			String location = locations.item(i);
			if (!trackedURIs.contains(location)) {
				trackedURIs.add(location);
			}
```

### RedundantCollectionOperation
Unnecessary 'contains()' check
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/MultipleContentHandler.java`
#### Snippet
```java

	public void addContentHandler(ContentHandler contentHandler) {
		if (!handlers.contains(contentHandler)) {
			handlers.add(contentHandler);
		}
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		}
		if (!StringUtils.isEmpty(namespaceURI)) {
			switch (namespaceURI) {
				case "http://www.w3.org/XML/1998/namespace":
					return "xml";
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/LimitExceededWarner.java`
#### Snippet
```java
	public void onResultLimitExceeded(String uri, LimitFeature feature) {
		int resultLimit = 0;
		switch(feature) {
			case SYMBOLS:
				resultLimit = getSharedSettings().getSymbolSettings().getMaxItemsComputed();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	private Node getTestParentNode(Node node) {
		short nodeType = node.getNodeType();
		switch (nodeType) {
		case Node.ATTRIBUTE_NODE:
			return ((Attr) node).getOwnerElement();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
					}
				} else if (cause instanceof CacheResourceDownloadedException) {
					switch (((CacheResourceDownloadedException) cause).getErrorCode()) {
						case ERROR_WHILE_DOWNLOADING:
							return ExternalResourceErrorCode.DownloadProblem.getCode();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	 */
	private static DiagnosticSeverity toLSPSeverity(int severity) {
		switch (severity) {
			case SEVERITY_WARNING:
				return DiagnosticSeverity.Warning;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/MyRequiredElementsFunction.java`
#### Snippet
```java
		Pattern p1 = p.getOperand1();
		if (!p1.isNullable()) {
			p1.apply(this);
		}
		Pattern p2 = p.getOperand2();
		if (!p2.isNullable()) {
			p2.apply(this);
		}
		return null;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_4_bCodeAction.java`
#### Snippet
```java
			Range diagnosticRange = diagnostic.getRange();
			int startOffset = document.offsetAt(diagnosticRange.getStart()) + 1;
			DOMNode node = document.findNodeAt(startOffset);

			if (node == null || !node.isElement()) {
				return;
			}

			DOMElement element = (DOMElement) node;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_element_missingCodeActionResolver.java`
#### Snippet
```java
			Range diagnosticRange = diagnostic.getRange();
			int startOffset = document.offsetAt(diagnosticRange.getStart()) + 1;
			DOMNode node = document.findNodeAt(startOffset);

			if (node == null || !node.isElement()) {
				return null;
			}

			DOMElement element = (DOMElement) node;
			Position childElementPositionStartTag = document.positionAt(element.getStartTagCloseOffset() + 1);
			Position childElementPositionEndTag = document.positionAt(element.getEndTagOpenOffset());

			Range targetRange = new Range(childElementPositionStartTag, childElementPositionEndTag);
			XMLGenerator generator = request.getXMLGenerator(targetRange);

			ContentModelManager contentModelManager = request.getComponent(ContentModelManager.class);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
		Collection<ElementDeclaration> children = elementDecl.getElements();
		Collection<AttributeDeclaration> attributes = elementDecl.getAttributes();
		boolean hasChildren = !children.isEmpty();
		boolean hasAttributes = !attributes.isEmpty();
		boolean hasCharacterContent = elementDecl.hasCharacterContent();
		boolean mixedContent = hasChildren && hasCharacterContent;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
		switch (dataType) {
			case DATE:
				return "date";
			case DATE_TIME:
				return "dateTime";
			case INTEGER:
				return "integer";
			case DECIMAL:
				return "decimal";
			case BOOLEAN:
				return "boolean";
			default:
				return null;
		}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
		CompletionItem item = new AttributeCompletionItem(attrName, canSupportSnippet, editRange, generateValue,
				defaultValue, enumerationValues, sharedSettings);
		MarkupContent markup = new MarkupContent();
		markup.setKind(MarkupKind.MARKDOWN);

		markup.setValue(StringUtils.getDefaultString(documentation));
		item.setDocumentation(markup);
		response.addCompletionItem(item);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGDocumentLinkParticipant.java`
#### Snippet
```java
					if (hrefAttr != null && !StringUtils.isEmpty(hrefAttr.getValue())) {
						String location = getResolvedLocation(document.getDocumentURI(), hrefAttr.getValue());
						DOMRange hrefRange = hrefAttr.getNodeAttrValue();
						try {
							links.add(createDocumentLink(hrefRange, location, true));
						} catch (BadLocationException e) {
							LOGGER.log(Level.SEVERE, "Creation of document link failed", e);
						}
					}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMAttr attr = findAttrToRename(request);
		if (attr != null) {
			Range range = XMLPositionUtility.selectAttributeValue(attr, true);
			String placeholder = attr.getValue();
			return Either.forRight(new PrepareRenameResult(range, placeholder));
		}
		return null;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMAttr attr = findAttrToRename(request);
		if (attr == null) {
			return null;
		}
		DOMElement ownerElement = attr.getOwnerElement();
		DOMDocument document = request.getXMLDocument();
		String newText = request.getNewText();
		List<Location> locations = getReferenceLocations(ownerElement, cancelChecker);
		return creatTextDocumentEdit(document, renameAttributeValueTextEdits(document, attr, newText, locations));
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMRange attrValue = attribute.getNodeAttrValue();
		List<TextEdit> textEdits = new ArrayList<>();

		int valueStart = attrValue.getStart();
		int valueEnd = attrValue.getEnd();
		Range range = XMLPositionUtility.createRange(valueStart, valueEnd, document);

		// make range not cover " on both ends
		reduceRangeFromBothEnds(range, 1);

		textEdits.add(new TextEdit(range, newText));
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMNode node = request.getNode();
		if (node == null || !node.isAttribute()) {
			return null;
		}

		DOMAttr attr = (DOMAttr) node;
		DOMElement ownerElement = attr.getOwnerElement();
		if (ownerElement == null) {
			return null;
		}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
			result.append(" - ");
			while (stream.peekChar() != _CCB && stream.peekChar() != _CMA) { // } | ,
				result.append((char) stream.peekChar());
				stream.advance(1);
			}
			result.append("\n");
			stream.advance(1);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
			Range startTagPrefixRange = null;
			Range suffixRangeStart = null;
			if (startTagRange != null) {
				Position startTagStartPosition = startTagRange.getStart();
				Position startTagPrefixPosition = new Position(startTagStartPosition.getLine(),
						startTagStartPosition.getCharacter() + indexOfColon);
				Position startTagEndPosition = startTagRange.getEnd();
				Position suffixStartPositionStart = new Position(startTagEndPosition.getLine(),
						startTagEndPosition.getCharacter() - suffixLength);
				startTagPrefixRange = new Range(startTagStartPosition, startTagPrefixPosition);
				suffixRangeStart = new Range(suffixStartPositionStart, startTagEndPosition);
			}
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/ContentModelSettings.java`
#### Snippet
```java
	 * Returns the list of the XML catalogs file path.
	 *
	 * @return the list of the XML catalogs file path.
	 */
	public String[] getCatalogs() {
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationSettings.java`
#### Snippet
```java

	/**
	 * Returns true if xi:include is to be validated and false otherwise.
	 *
	 * @return true if xi:include is to be validated and false otherwise.
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationSettings.java`
#### Snippet
```java
	 * Returns true if xi:include is to be validated and false otherwise.
	 *
	 * @return true if xi:include is to be validated and false otherwise.
	 */
	public XMLXIncludeSettings getXInclude() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
	 * Get XML catalogs.
	 *
	 * @return list of catalogs
	 */
	public String[] getCatalogs() {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
					.offsetAt(new Position(locator.getLineNumber() - 1, locator.getColumnNumber() - 1));
			return targetSchema.findNodeAt(offset);
		} catch (BadLocationException e) {
		}
		return null;
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LogHelper.java`
#### Snippet
```java
			try {
				Files.createDirectories(parentPath);
			} catch (IOException e) {

			}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
				// get the wildcard index (ex : 0 for [@id='$0']).
				indexWildcard = Integer.parseInt(attrValue.substring(1, attrValue.length()));
			} catch (NumberFormatException e) {

			}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
						try {
							Closeables.close(process.getOutputStream(), false);
						} catch (IOException e) {
						}
					}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
				findReferences(node, position, offset, context, locations, cancelChecker);
			}
		} catch (BadLocationException e) {

		}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
			try {
				return EmptyElements.valueOf(value);
			} catch (Exception e) {
			}
		}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
				try {
					range = new Range(new Position(0, 0), grammarDocument.positionAt(grammarDocument.getEnd()));
				} catch (BadLocationException e) {
				}
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
				try {
					eid = XMLEntityManager.expandSystemId(externalDoctype, locator.getExpandedSystemId(), false);
				} catch (java.io.IOException e) {
				}
				XMLDTDDescription grammarDesc = new XMLDTDDescription(null, externalDoctype,
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(new URL(xsdURI).openStream(), handler);
		} catch (Exception e) {

		}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
				}
				// Ignore the exception. Fallback to the literal system identifier.
				catch (URI.MalformedURIException ex) {
				}
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
		}
		// Ignore IOException. It cannot be thrown from this method.
		catch (IOException ex) {
		}
		return resolvedId;
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
					}
				}
			} catch (BadLocationException e) {
			}

```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
			try {
				return new Range(new Position(0, 0), document.positionAt(document.getEnd()));
			} catch (BadLocationException e) {
			}
		}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/completion/AttributeNameCompletionResolver.java`
#### Snippet
```java
				}
			}
		} catch (CacheResourceDownloadingException e) {
		}

```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/completion/AttributeValueCompletionResolver.java`
#### Snippet
```java
				}
			}
		} catch (CacheResourceDownloadingException e) {
		}
	}
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPSAXParser.java`
#### Snippet
```java
		try {
			eid = XMLEntityManager.expandSystemId(systemId, locator.getExpandedSystemId(), false);
		} catch (java.io.IOException e) {
		}

```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		try {
			tempDownloadDir = Files.createTempDirectory("lemminx-temp");
		} catch (Exception e) {
		}
		TEMP_DOWNLOAD_DIR = tempDownloadDir;
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
		public String internalSubset;

		protected Entry(int hash, XMLGrammarDescription desc, Grammar grammar, Entry next) {
			this.hash = hash;
			this.desc = desc;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
		// clear this entry; useful to promote garbage collection
		// since reduces reference count of objects to be destroyed
		protected void clear() {
			desc = null;
			grammar = null;
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/RenameResponse.java`
#### Snippet
```java
			TextDocumentEdit existingTextDocumentEdit = change.get();
			List<TextEdit> edits = new ArrayList<>();
			edits.addAll(existingTextDocumentEdit.getEdits());
			textDocumentEdit.getEdits().stream().forEach(te -> {
				if (!edits.contains(te)) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java

		String xmlModelInsertText = (documentElement == null && document.getLastChild() != null ? delimiter : "")
				+ xsdWithXmlModel.toString();
		Position xmlModelPosition = document.positionAt(beforeTagOffset);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java

		String insertText = (documentElement == null && document.getLastChild() != null ? delimiter : "")
				+ builder.toString();
		Position position = document.positionAt(beforeTagOffset);
		return CodeActionFactory.insertEdit(insertText, position, document.getTextDocument());
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TagInfo` may be 'static'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
	}
	
	class TagInfo {

		public final int startLine;
```

### InnerClassMayBeStatic
Inner class `FormattingVisitor` may be 'static'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/HtmlToPlainText.java`
#### Snippet
```java

	// the formatting rules, implemented in a breadth-first DOM traverse
	private class FormattingVisitor implements NodeVisitor {
		private StringBuilder accum = new StringBuilder(); // holds the accumulated text
		private int listNesting;
```

### InnerClassMayBeStatic
Inner class `DefaultURIResolverExtension` may be 'static'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtensionManager.java`
#### Snippet
```java
	}

	class DefaultURIResolverExtension implements URIResolverExtension {

		@Override
```

### InnerClassMayBeStatic
Inner class `ResourceInfo` may be 'static'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
	private final Set<String> protocolsForCache;

	class ResourceInfo {

		String resourceURI;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
					String closeTag = null;

					/**
					 * Try to find a start element with no tag : <>
					 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
					DOMNode current = curr;

					/**
					 * eg: <a><b><c></d> will set a,b,c end position to the start of |</d>
					 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

	@Override
	/**
	 * Starting offset position of the current token
	 * 
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

	@Override
	/**
	 * Ending offset position of the current token
	 * 
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java

						if (DOMNode.isIncluded(systemId, offset)) {
							/**
							 * Completion invoked within systemId parameter ie, completion offset is at |
							 * like so: <!DOCTYPE foo SYSTEM "./|">
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/xmlmodel/XMLModelSchemaValidator.java`
#### Snippet
```java
				// XML doesn't define a xmlns attribute in the root element -> same support than
				// xsi:noNamespaceSchemaLocation. Ex:
				/**
				 * <?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?> <book>
				 **/
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/xmlmodel/XMLModelSchemaValidator.java`
#### Snippet
```java
				// XML defines a xmlns attribute in the root element -> same support than
				// xsi:schemaLocation. Ex:
				/**
				 * <?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?>
				 * <book xmlns="http://docbook.org/ns/docbook">
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
			// Given this XML references sample

			/**
			 * <code>
			 * "xml.references": [
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
						for (XMLReferenceExpression expression : expressions) {
							// Given this XML reference expression sample
							/**
							 * <code>
							 * "expressions": [
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		}
		case ETagUnterminated: {
			/**
			 * Cases:
			 *
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		String value = getValue();
		if (value == null) {
			if (other.getValue() != null) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
				return false;
			}
		} else if (!value.equals(other.getValue())) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	public boolean isDTD() {
		String uri = this.getDocumentURI();
		if (DOMUtils.isDTD(uri)) {
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			return true;
		}
		if (offset > startTagOpenOffset && offset <= startTagCloseOffset) {
			// case <bean | >
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			return false;
		}
		if (offset > endTagOpenOffset + (afterBackSlash ? 1 : 0) && offset < getEnd()) {
			// case </bean | >
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
			char c = text.charAt(i);
			if (c == '`') {
				if (inBacktick) {
					inBacktick = false;
				} else {
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 */
	public static boolean isValidPath(Path path){
		if (Files.exists(path)) {
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/config/ConfigurationItemEdit.java`
#### Snippet
```java
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/config/ConfigurationItemEdit.java`
#### Snippet
```java
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/CDATASnippetContext.java`
#### Snippet
```java
		if (SnippetContextUtils.canAcceptExpression(request)) {
			DOMElement parent = request.getParentElement();
			if (parent == null) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/SnippetContextUtils.java`
#### Snippet
```java
				// <a></|</a>
				String text = request.getXMLDocument().getText();
				if (text.charAt(offset - 1) == '/') {
					// <a></|</a> -> should be ignore
					return false;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/SnippetContextUtils.java`
#### Snippet
```java
				// <a></|
				String text = request.getXMLDocument().getText();
				if (text.charAt(node.getEnd() - 1) == '/') {
					// <a></ -> should be ignore
					return false;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/SnippetContextUtils.java`
#### Snippet
```java
				return true;
			}
			if (offset >= node.getEnd()) {
				// <a></a>|
				return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLExcludedSymbolFile.java`
#### Snippet
```java
		}

		if(!Objects.equals(comparison.getPathMatcher(), getPathMatcher())) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java

	public static boolean isElementClosed(DOMElement element) {
		if (element.hasEndTag() || element.isSelfClosed()) {
			// <fo|o></foo>
			// <fo|o />
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
			return true;
		}
		if ((element.isStartTagClosed() && offset > element.getStartTagCloseOffset())
				|| element.isInInsideStartEndTag(offset)) {
			// <foo>
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/PathPatternMatcher.java`
#### Snippet
```java
				return false;
			}
			if(!Objects.equals(pattern, other.getPattern())) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/LSPErrorReporterForXSD.java`
#### Snippet
```java
			if (errorForDocument) {
				Range range = XMLSchemaErrorCode.toLSPRange(location, schemaCode, arguments, document);
				if (range != null) {
					return range;
				}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
		}

		if (attributeName.equals(element.getAttributeAtIndex(index).getName())) {
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AbstractXML2GrammarGenerator.java`
#### Snippet
```java
			return true;
		}
		if (name.indexOf(':') != -1) {
			// the attribute have prefix, ignore it (ex : xsi:schemaLocation).
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
			}
			DOMAttr attr = node.findAttrAt(offset);
			if (attr != null) {
				return attr;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLSchemaSettings.java`
#### Snippet
```java
		}
		XMLSchemaSettings other = (XMLSchemaSettings) obj;
		if (enabled != other.enabled) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLFileAssociation.java`
#### Snippet
```java
		}
		if (systemId == null) {
			if (other.systemId != null) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLFileAssociation.java`
#### Snippet
```java
				return false;
			}
		} else if (!systemId.equals(other.systemId)) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLNamespacesSettings.java`
#### Snippet
```java
		}
		XMLNamespacesSettings other = (XMLNamespacesSettings) obj;
		if (enabled != other.enabled) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLXIncludeSettings.java`
#### Snippet
```java
		}
		XMLXIncludeSettings other = (XMLXIncludeSettings) obj;
		if (enabled != other.enabled) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationSettings.java`
#### Snippet
```java
		}
		if (schema == null) {
			if (other.schema != null) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationSettings.java`
#### Snippet
```java
				return false;
			}
		} else if (!schema.equals(other.schema)) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
			if (errorForDocument) {
				Range range = XMLSyntaxErrorCode.toLSPRange(location, syntaxCode, arguments, document);
				if (range != null) {
					return range;
				}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
			if (schemaCode != null) {
				Range range = XMLSchemaErrorCode.toLSPRange(location, schemaCode, arguments, document);
				if (range != null) {
					return range;
				}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
					if (errorForDocument) {
						Range range = DTDErrorCode.toLSPRange(location, dtdCode, arguments, document);
						if (range != null) {
							return range;
						}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
						if (errorForDocument) {
							Range range = XIncludeErrorCode.toLSPRange(location, xIncludeCode, arguments, document);
							if (range != null) {
								return range;
							}
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	public void registerSnippets(InputStream in, ISnippetContext<?> defaultContext,
			TypeAdapter<? extends ISnippetContext<?>> contextDeserializer) throws IOException {
		registerSnippets(new InputStreamReader(in, StandardCharsets.UTF_8.name()), defaultContext, contextDeserializer);
	}

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'AsynchronousServerSocketChannel' used without 'try'-with-resources statement
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerSocketLauncher.java`
#### Snippet
```java
	 */
	public void launch(String[] args) throws Exception {
		AsynchronousServerSocketChannel _open = AsynchronousServerSocketChannel.open();
		int _port = getPort(args);
		InetSocketAddress _inetSocketAddress = new InetSocketAddress("0.0.0.0", _port);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'namespaceItem != null' covered by subsequent condition 'namespaceItem instanceof SchemaGrammar'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 */
	private static SchemaGrammar getSchemaGrammar(XSNamespaceItem namespaceItem) {
		return (namespaceItem != null && namespaceItem instanceof SchemaGrammar) ? (SchemaGrammar) namespaceItem : null;
	}

```

### ConditionCoveredByFurtherCondition
Condition 'conn != null' covered by subsequent condition 'conn instanceof HttpURLConnection'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
					resourcesLoading.remove(resourceURI);
				}
				if (conn != null && conn instanceof HttpURLConnection) {
					((HttpURLConnection) conn).disconnect();
				}
```

### ConditionCoveredByFurtherCondition
Condition 'conn != null' covered by subsequent condition 'conn instanceof HttpURLConnection'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
	 */
	private static String getHttpResponseCode(URLConnection conn) {
		if (conn != null && conn instanceof HttpURLConnection) {
			try {
				HttpURLConnection httpConn = (HttpURLConnection) conn;
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 */
	private static Matcher getNamespaceMatcher(String name) {
		Pattern namespacePattern = Pattern.compile("^\\{\"(.*)\":(.*)(\\}|,)");
		return namespacePattern.matcher(name);
	}
```

## RuleId[id=ArrayObjectsEquals]
### ArrayObjectsEquals
Arrays comparison should probably be done using 'Arrays.equals()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
		}
		String[] newCatalogs = catalogResolver != null ? catalogResolver.getCatalogList() : null;
		return !Objects.equals(oldCatalogs, newCatalogs);
	}

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param isWhitespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMCharacterData.java`
#### Snippet
```java
	 * Set true if this node's data is all whitespace
	 * 
	 * @param isWhitespace
	 */
	public void setWhitespace(boolean isWhitespace) {
```

### JavadocDeclaration
`@param attributeName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is the default xmlns attribute and false
	 *         otherwise.
```

### JavadocDeclaration
`@param attributeName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is the no default xmlns attribute and false
	 *         otherwise.
```

### JavadocDeclaration
`@param attributeName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * Returns true if attribute name is a xmlns attribute and false otherwise.
	 *
	 * @param attributeName
	 * @return true if attribute name is a xmlns attribute and false otherwise.
	 */
```

### JavadocDeclaration
`@param uri` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 * If the URI doesnt match, null is returned.
	 *
	 * @param uri
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 *
	 * @param uri
	 * @return
	 */
	public String getPrefixIfMatchesURI(String uri) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * If document has {@code <?xml ... ?>}
	 * 
	 * @return
	 */
	public boolean hasProlog() {
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * Returns true if 'offset' is within an internal DOCTYPE dtd. Else false.
	 * 
	 * @param offset
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * 
	 * @param offset
	 * @return
	 */
	public boolean isWithinInternalDTD(int offset) {
```

### JavadocDeclaration
`@param textOffset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param textOffset
	 * @return the element name on the left of the given position and null
	 *         otherwise.
```

### JavadocDeclaration
`@param elementName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param elementName
	 * @return the DTD Attribute list for the given element name and empty
	 *         otherwise.
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	 * with an angle bracket
	 *
	 * @returns the offset at which the given unclosed start tag should be closed
	 *          with an angle bracket
	 */
```

### JavadocDeclaration
`@param regex` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	/**
	 * Advances stream on regex, but will grab the first group
	 * @param regex
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	 * Advances stream on regex, but will grab the first group
	 * @param regex
	 * @return
	 */
	public String advanceIfRegExpGroup1(Pattern regex) {
```

### JavadocDeclaration
`@param n` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	/**
	 * Peeks at next char at position + n. peekChar() == peekChar(0)
	 * @param n
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	 * Peeks at next char at position + n. peekChar() == peekChar(0)
	 * @param n
	 * @return
	 */
	public int peekChar(int n) {
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	/**
	 * Peeks at the char at position 'offset' of the whole document
	 * @param offset
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	 * Peeks at the char at position 'offset' of the whole document
	 * @param offset
	 * @return
	 */
	public int peekCharAtOffset(int offset) {
```

### JavadocDeclaration
`@param settings` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 * Update settings of the language service.
	 *
	 * @param settings
	 */
	public void updateSettings(Object settings) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 * Save settings or XML file.
	 *
	 * @param context
	 */
	void doSave(SaveContext context) {
```

### JavadocDeclaration
`@param ` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 * function.
	 *
	 * @param <R>
	 * @param documentIdentifier the document indetifier.
	 * @param code               a bi function that accepts a {@link CancelChecker}
```

### JavadocDeclaration
`@param resolverExtensionManager` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 * 
	 * @param documentURI              the schema URI
	 * @param resolverExtensionManager
	 * @return the DOM document from the given XML Schema uri.
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 * @return an instance of SAX parser factory by disabling external entities
	 *         declarations.
	 * @throws SAXNotRecognizedException
	 * @throws SAXNotSupportedException
	 * @throws ParserConfigurationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 *         declarations.
	 * @throws SAXNotRecognizedException
	 * @throws SAXNotSupportedException
	 * @throws ParserConfigurationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 * @throws SAXNotRecognizedException
	 * @throws SAXNotSupportedException
	 * @throws ParserConfigurationException
	 */
	public static SAXParserFactory newSAXParserFactory()
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 * false otherwise.
	 * 
	 * @param document
	 * @param namespace
	 * @return true if the document element root is bound to the given namespace and
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
	 * 
	 * @param document
	 * @param namespace
	 * @return true if the document element root is bound to the given namespace and
	 *         false otherwise.
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 * is true.
	 * 
	 * @returns the least x for which p(x) is true or array.length if no element
	 *          full fills the given function.
	 */
```

### JavadocDeclaration
`@param node` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 * Returns true if the node included the given offset and false otherwise.
	 * 
	 * @param node
	 * @param offset
	 * @return true if the node included the given offset and false otherwise.
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 * 
	 * @param node
	 * @param offset
	 * @return true if the node included the given offset and false otherwise.
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 * 
	 * @param index Starting at 0, index of attribute you want
	 * @return
	 */
	public DOMAttr getAttributeAtIndex(int index) {
```

### JavadocDeclaration
`@param index` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 * Returns node child at the given index.
	 * 
	 * @param index
	 * @return node child at the given index.
	 */
```

### JavadocDeclaration
`@param resourceURI` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/URIUtils.java`
#### Snippet
```java
	 * <code>false</code> otherwise.
	 * 
	 * @param resourceURI
	 * @return <code>true</code> if the given URL is a file resource, false
	 *         otherwise.
```

### JavadocDeclaration
`@param uri` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/URIUtils.java`
#### Snippet
```java
	 * XMLEntityManager#expandSystemId
	 * 
	 * @param uri
	 * @return a well folder URI which ends with '/'
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
	 * @param testNode       node to test.
	 * @param wildcardValues wildcard values if node matcher define widcard.
	 * @return
	 */
	boolean match(Node testNode, Collection<String> wildcardValues);
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
	 * Returns the owner matcher.
	 * 
	 * @return
	 */
	XPathMatcher getOwnerMatcher();
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
	 * Returns matcher type.
	 * 
	 * @return
	 */
	MatcherType getType();
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/IXPathNodeMatcher.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @return
	 */
	boolean isAny();
```

### JavadocDeclaration
`@param testNode` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * matcher.
	 * 
	 * @param testNode
	 * @param wildcardValues
	 * @return
```

### JavadocDeclaration
`@param wildcardValues` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * 
	 * @param testNode
	 * @param wildcardValues
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * @param testNode
	 * @param wildcardValues
	 * @return
	 */
	private boolean matchAttributes(Node testNode,
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Returns the prefix.
	 * 
	 * @return
	 */
	public String getPrefix() {
```

### JavadocDeclaration
`@param testNode` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Returns true if element name is matched and false otherwise.
	 * 
	 * @param testNode
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * 
	 * @param testNode
	 * @return
	 */
	private boolean matchElement(String localName) {
```

### JavadocDeclaration
`@param testNode` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Returns true if element (name) is matched and false otherwise.
	 * 
	 * @param testNode
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * 
	 * @param testNode
	 * @return
	 */
	private boolean matchElement(Node testNode) {
```

### JavadocDeclaration
`@param matcher` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Add XPath attribute matcher.
	 * 
	 * @param matcher
	 */
	public void add(XPathAttributeMatcher matcher) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java
	 * Returns the element name to match.
	 * 
	 * @return
	 */
	public String getLocalName() {
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
	 * Does linefeeds and indentation.
	 *
	 * @param name
	 * @param value
	 * @param level
```

### JavadocDeclaration
`@param value` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
	 *
	 * @param name
	 * @param value
	 * @param level
	 * @return
```

### JavadocDeclaration
`@param level` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
	 * @param name
	 * @param value
	 * @param level
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
	 * @param value
	 * @param level
	 * @return
	 */
	public XMLBuilder addAttribute(String name, String value, int level, boolean surroundWithQuotes) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
	 * Returns true if attrValue is wilcard or false otherwise.
	 * 
	 * @return
	 */
	public boolean hasWildcard() {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
	 * Returns the attribute value to match.
	 * 
	 * @return
	 */
	public String getAttrValue() {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
	 * Returns the wildcard index and -1 if no wildcard is defined.
	 * 
	 * @return
	 */
	public int getIndexWildcard() {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
	 * Returns the attribute name to match.
	 * 
	 * @return
	 */
	public String getAttrName() {
```

### JavadocDeclaration
`@param text` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *
	 *
	 * @param text
	 * @param endOffset non-inclusive
	 * @return Start offset directly after the first whitespace.
```

### JavadocDeclaration
`@param value` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * and false otherwise.
	 *
	 * @param value
	 * @return true if <code>value</code> has matching surrounding quotes.
	 */
```

### JavadocDeclaration
`@param text` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * string, or an empty string.
	 *
	 * @param text
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *
	 * @param text
	 * @return
	 */
	public static String getDefaultString(String text) {
```

### JavadocDeclaration
`@param lineText` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * Returns the start whitespaces of the given line text.
	 *
	 * @param lineText
	 * @return the start whitespaces of the given line text.
	 */
```

### JavadocDeclaration
`@param str` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * given string builder.
	 *
	 * @param str
	 * @return the result of normalize space of the given string.
	 */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *
	 * @param str
	 * @return the result of normalize space of the given string.
	 */
	public static void normalizeSpace(String str, StringBuilder b) {
```

### JavadocDeclaration
`@param text` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * is always returned.
	 *
	 * @param text
	 * @param isWhitespace
	 * @param delimiter
```

### JavadocDeclaration
`@param isWhitespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *
	 * @param text
	 * @param isWhitespace
	 * @param delimiter
	 * @return
```

### JavadocDeclaration
`@param delimiter` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * @param text
	 * @param isWhitespace
	 * @param delimiter
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * @param isWhitespace
	 * @param delimiter
	 * @return
	 */
	public static int getNumberOfNewLines(String text, boolean isWhitespace, String delimiter, int newLineLimit) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * returns <code>value</code>.
	 *
	 * @param value
	 * @return <code>value</code> without surrounding quotes.
	 */
```

### JavadocDeclaration
`@param str` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 * Returns the result of normalize space of the given string.
	 *
	 * @param str
	 * @return the result of normalize space of the given string.
	 */
```

### JavadocDeclaration
`@param actionableNotificationSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
	 * Sets the actionableNotificationSupport boolean
	 *
	 * @param actionableNotificationSupport
	 */
	public void setActionableNotificationSupport(boolean actionableNotificationSupport) {
```

### JavadocDeclaration
`@param openSettingsCommandSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
	 * Sets the openSettingsCommandSupport boolean
	 *
	 * @param openSettingsCommandSupport
	 */
	public void setOpenSettingsCommandSupport(boolean openSettingsCommandSupport) {
```

### JavadocDeclaration
`@param shouldLanguageServerExitOnShutdown` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
	 * shutdown() request, without waiting for client to call exit()
	 *
	 * @param shouldLanguageServerExitOnShutdown
	 */
	public void setShouldLanguageServerExitOnShutdown(boolean shouldLanguageServerExitOnShutdown) {
```

### JavadocDeclaration
`@param bindingWizardSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
	 * Sets the bindingWizardSupport boolean
	 *
	 * @param bindingWizardSupport
	 */
	public void setBindingWizardSupport(boolean bindingWizardSupport) {
```

### JavadocDeclaration
`@param pathString` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 * Ensures there is no slash before a drive letter, and forces use of '\'
	 *
	 * @param pathString
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 *
	 * @param pathString
	 * @return
	 */
	public static String convertToWindowsPath(String pathString) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 * @param path the path
	 * @return the deployed path from the given <code>path</code>.
	 * @throws IOException
	 */
	public static Path getDeployedPath(Path path) throws IOException {
```

### JavadocDeclaration
`@param text` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 * is given "/" is returned by default.
	 *
	 * @param text
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 *
	 * @param text
	 * @return
	 */
	public static String getFilePathSlash(String text) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 * @param in      the input stream
	 * @param outFile the output file
	 * @throws IOException
	 */
	public static void saveToFile(InputStream in, Path outFile) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 * @param content the string content
	 * @param outFile the output file
	 * @throws IOException
	 */
	public static void saveToFile(String content, Path outFile) throws IOException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/AbstractXMLNotifier.java`
#### Snippet
```java
	 * Evicts the set identified by the provided key, from the cache
	 * 
	 * @param key
	 */
	public void evictKey(IXMLSettingFeature key) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/AbstractXMLNotifier.java`
#### Snippet
```java
	 * Evicts the provided value from all cached sets
	 * 
	 * @param value
	 */
	public void evictValue(String value) {
```

### JavadocDeclaration
`@param xpathExpression` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * Constructor of XPath Matcher with a XPath expression.
	 * 
	 * @param xpathExpression
	 */
	public XPathMatcher(String xpathExpression) {
```

### JavadocDeclaration
`@param node` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * Returns the DOM Node to test to match.
	 * 
	 * @param node
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * 
	 * @param node
	 * @return
	 */
	private Node getTestNode(Node node) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * @param node           the DOM Node to match.
	 * @param wildcardValues the list of wildcard values and null otherwise.
	 * @return
	 */
	public boolean match(final Node node, final Collection<String> wildcardValues) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * no wildcard.
	 * 
	 * @return
	 */
	public int getNbWildCard() {
```

### JavadocDeclaration
`@param selectedNode` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * Returns list of wildcard values of the given DOM Node.
	 * 
	 * @param selectedNode
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	 * 
	 * @param selectedNode
	 * @return
	 */
	public List<String> getWildcardValues(Node selectedNode) {
```

### JavadocDeclaration
`@param title` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * Create a CodeAction to remove the content from the given range.
	 *
	 * @param title
	 * @param range
	 * @param document
```

### JavadocDeclaration
`@param range` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 *
	 * @param title
	 * @param range
	 * @param document
	 * @param diagnostic
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param title
	 * @param range
	 * @param document
	 * @param diagnostic
	 * @return
```

### JavadocDeclaration
`@param diagnostic` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param range
	 * @param document
	 * @param diagnostic
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param document
	 * @param diagnostic
	 * @return
	 */
	public static CodeAction remove(String title, Range range, TextDocumentItem document, Diagnostic diagnostic) {
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param replaceText the text to replace.
	 * @param fileContent the range to replace the text over.
	 * @param document
	 * @return the workspace edit of a given replacement text and range.
	 */
```

### JavadocDeclaration
`@param title` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * Create a CodeAction to insert a new content at the end of the given range.
	 *
	 * @param title
	 * @param range
	 * @param insertText
```

### JavadocDeclaration
`@param range` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 *
	 * @param title
	 * @param range
	 * @param insertText
	 * @param document
```

### JavadocDeclaration
`@param insertText` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param title
	 * @param range
	 * @param insertText
	 * @param document
	 * @param diagnostic
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param range
	 * @param insertText
	 * @param document
	 * @param diagnostic
	 *
```

### JavadocDeclaration
`@param diagnostic` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
	 * @param insertText
	 * @param document
	 * @param diagnostic
	 *
	 * @return the CodeAction to insert a new content at the end of the given range.
```

### JavadocDeclaration
`@param incremental` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocuments.java`
#### Snippet
```java
	 * Set the incremental support.
	 * 
	 * @param incremental
	 */
	public void setIncremental(boolean incremental) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/SnippetsBuilder.java`
#### Snippet
```java
	 * @param index the snippet index.
	 * @param values the values for the choice.
	 * @return
	 * 
	 * @see https://github.com/Microsoft/language-server-protocol/blob/master/snippetSyntax.md#choice
```

### JavadocDeclaration
`@param suffix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/ISuffixPositionProvider.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param suffix 
	 * @return  the suffix position provider of the given <code>sufix</code> and null
	 * otherwise.
```

### JavadocDeclaration
`@param ` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 * Get or parse the model and apply the code function which expects the model.
	 *
	 * @param <R>
	 * @param documentIdentifier the document identifier.
	 * @param code               a bi function that accepts the parsed model and
```

### JavadocDeclaration
`@param ` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 * Get or parse the model and apply the code function which expects the model.
	 *
	 * @param <R>
	 * @param documentIdentifier the document indentifier.
	 * @param code               a bi function that accepts the parsedmodel and
```

### JavadocDeclaration
`@param registry` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/ISnippetRegistryLoader.java`
#### Snippet
```java
	 * Register snippets in the given snippet registry.
	 * 
	 * @param registry
	 * @throws Exception
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/ISnippetRegistryLoader.java`
#### Snippet
```java
	 * 
	 * @param registry
	 * @throws Exception
	 */
	void load(SnippetRegistry registry) throws Exception;
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 * the returned range will cover only "hello".
	 *
	 * @param offset
	 * @param document
	 * @return range covering the trimmed text belonging to the node located at
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 *
	 * @param offset
	 * @param document
	 * @return range covering the trimmed text belonging to the node located at
	 *         offset
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 * offset.
	 *
	 * @param offset
	 * @param document
	 * @return range covering the first child of the node located at offset
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 *
	 * @param offset
	 * @param document
	 * @return range covering the first child of the node located at offset
	 */
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 * implying it doesn't have a local name, it will return null.
	 *
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	 *
	 * @param element
	 * @return
	 */
	public static Range selectStartTagLocalName(DOMNode element) {
```

### JavadocDeclaration
`@param xmlDocument` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDiagnostics.java`
#### Snippet
```java
	 * Do validation with extension (XML Schema, etc)
	 *
	 * @param xmlDocument
	 * @param diagnostics
	 * @param validationSettings
```

### JavadocDeclaration
`@param diagnostics` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDiagnostics.java`
#### Snippet
```java
	 *
	 * @param xmlDocument
	 * @param diagnostics
	 * @param validationSettings
	 * @param validationArgs
```

### JavadocDeclaration
`@param validationSettings` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDiagnostics.java`
#### Snippet
```java
	 * @param xmlDocument
	 * @param diagnostics
	 * @param validationSettings
	 * @param validationArgs
	 * @param monitor
```

### JavadocDeclaration
`@param validationArgs` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDiagnostics.java`
#### Snippet
```java
	 * @param diagnostics
	 * @param validationSettings
	 * @param validationArgs
	 * @param monitor
	 */
```

### JavadocDeclaration
`@param monitor` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDiagnostics.java`
#### Snippet
```java
	 * @param validationSettings
	 * @param validationArgs
	 * @param monitor
	 */
	private void doExtensionsDiagnostics(DOMDocument xmlDocument, List<Diagnostic> diagnostics,
```

### JavadocDeclaration
`@param resultLimitExceeded` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/LimitList.java`
#### Snippet
```java
	 * Sets the resultLimitExceeded boolean
	 * 
	 * @param resultLimitExceeded
	 */
	void setResultLimitExceeded(boolean resultLimitExceeded) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * @param contextDeserializer the GSON context deserializer used to create Java
	 *                            context.
	 * @throws IOException
	 */
	public void registerSnippets(InputStream in, TypeAdapter<? extends ISnippetContext<?>> contextDeserializer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * @param contextDeserializer the GSON context deserializer used to create Java
	 *                            context.
	 * @throws IOException
	 */
	public void registerSnippets(Reader in, ISnippetContext<?> defaultContext,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * @param contextDeserializer the GSON context deserializer used to create Java
	 *                            context.
	 * @throws IOException
	 */
	public void registerSnippets(InputStream in, ISnippetContext<?> defaultContext,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 *                       snippet format.
	 * @param defaultContext the default context.
	 * @throws IOException
	 */
	public void registerSnippets(Reader in, ISnippetContext<?> defaultContext) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 *                       vscode snippet format.
	 * @param defaultContext the default context.
	 * @throws IOException
	 */
	public void registerSnippets(InputStream in, ISnippetContext<?> defaultContext) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * 
	 * @param in the JSON reader which declares snippets with vscode snippet format.
	 * @throws IOException
	 */
	public void registerSnippets(Reader in) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * @param contextDeserializer the GSON context deserializer used to create Java
	 *                            context.
	 * @throws IOException
	 */
	public void registerSnippets(Reader in, TypeAdapter<? extends ISnippetContext<?>> contextDeserializer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
	 * @param in the JSON input stream which declares snippets with vscode snippet
	 *           format.
	 * @throws IOException
	 */
	public void registerSnippets(InputStream in) throws IOException {
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/IXMLFullFormatter.java`
#### Snippet
```java
	 * @param uri            the uri.
	 * @param sharedSettings the shared settings.
	 * @param cancelChecker 
	 * 
	 * @return the formatted text document by using the shared settings.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * old namespace.
	 *
	 * @param document
	 * @param oldNamespace
	 * @param newNamespace
```

### JavadocDeclaration
`@param oldNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 *
	 * @param document
	 * @param oldNamespace
	 * @param newNamespace
	 * @param rootAttr
```

### JavadocDeclaration
`@param newNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param document
	 * @param oldNamespace
	 * @param newNamespace
	 * @param rootAttr
	 * @return
```

### JavadocDeclaration
`@param rootAttr` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param oldNamespace
	 * @param newNamespace
	 * @param rootAttr
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param newNamespace
	 * @param rootAttr
	 * @return
	 */
	private static List<TextEdit> renameAllNamespaceOccurrences(DOMDocument document, String oldNamespace,
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * namespaces that match the given old namespace.
	 *
	 * @param document
	 * @param edits
	 * @param elements
```

### JavadocDeclaration
`@param edits` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 *
	 * @param document
	 * @param edits
	 * @param elements
	 * @param oldNamespace
```

### JavadocDeclaration
`@param elements` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param document
	 * @param edits
	 * @param elements
	 * @param oldNamespace
	 * @param newNamespace
```

### JavadocDeclaration
`@param oldNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param edits
	 * @param elements
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
```

### JavadocDeclaration
`@param newNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param elements
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
	 */
	private static List<TextEdit> renameElementsNamespace(DOMDocument document, List<TextEdit> edits,
```

### JavadocDeclaration
`@param startTagRange` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * Creates a list of start and end tag rename's.
	 *
	 * @param startTagRange
	 * @param endTagRange
	 * @param newText
```

### JavadocDeclaration
`@param endTagRange` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 *
	 * @param startTagRange
	 * @param endTagRange
	 * @param newText
	 * @return
```

### JavadocDeclaration
`@param newText` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param startTagRange
	 * @param endTagRange
	 * @param newText
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param endTagRange
	 * @param newText
	 * @return
	 */
	private static List<TextEdit> getRenameList(Range startTagRange, Range endTagRange, String newText) {
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * namespace.
	 *
	 * @param document
	 * @param element
	 * @param oldNamespace
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 *
	 * @param document
	 * @param element
	 * @param oldNamespace
	 * @param newNamespace
```

### JavadocDeclaration
`@param oldNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param document
	 * @param element
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
```

### JavadocDeclaration
`@param newNamespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param element
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param oldNamespace
	 * @param newNamespace
	 * @return
	 */
	private static List<TextEdit> renameElementAttributeValueNamespace(DOMDocument document, DOMElement element,
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * Returns the ranges of the namespace of a start and end tag of an element.
	 *
	 * @param document
	 * @param element
	 * @param namespaceLength
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 *
	 * @param document
	 * @param element
	 * @param namespaceLength
	 * @return
```

### JavadocDeclaration
`@param namespaceLength` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param document
	 * @param element
	 * @param namespaceLength
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 * @param element
	 * @param namespaceLength
	 * @return
	 */
	private static Range[] createNamespaceRange(DOMDocument document, DOMElement element, int namespaceLength) {
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * and false otherwise.
	 * 
	 * @param document
	 * @return true if the reference support is applicable for the given document
	 *         and false otherwise.
```

### JavadocDeclaration
`@param node` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * Find the references
	 * 
	 * @param node
	 * @param position
	 * @param offset
```

### JavadocDeclaration
`@param position` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * 
	 * @param node
	 * @param position
	 * @param offset
	 * @param locations
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * @param node
	 * @param position
	 * @param offset
	 * @param locations
	 * @param cancelChecker
```

### JavadocDeclaration
`@param locations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * @param position
	 * @param offset
	 * @param locations
	 * @param cancelChecker
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractReferenceParticipant.java`
#### Snippet
```java
	 * @param offset
	 * @param locations
	 * @param cancelChecker
	 */
	protected abstract void findReferences(DOMNode node, Position position, int offset, ReferenceContext context,
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractDefinitionParticipant.java`
#### Snippet
```java
	 * and false otherwise.
	 * 
	 * @param document
	 * @return true if the definition support is applicable for the given document
	 *         and false otherwise.
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractDefinitionParticipant.java`
#### Snippet
```java
	 * Find the definition
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
```

### JavadocDeclaration
`@param locations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractDefinitionParticipant.java`
#### Snippet
```java
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractDefinitionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
	protected abstract void doFindDefinition(IDefinitionRequest request, List<LocationLink> locations,
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IPositionRequest.java`
#### Snippet
```java
	 * triggered.
	 * 
	 * @return
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IPositionRequest.java`
#### Snippet
```java
	 * 
	 * @return
	 * @throws BadLocationException
	 */
	LineIndentInfo getLineIndentInfo() throws BadLocationException;
```

### JavadocDeclaration
`@param context` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 * doSave is called on extension start up with a settings context to
	 * provide the xml settings to the extension.
	 * @param context
	 */
	default void doSave(ISaveContext context) {
```

### JavadocDeclaration
`@param registry` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 * registry.
	 *
	 * @param registry
	 */
	void stop(XMLExtensionsRegistry registry);
```

### JavadocDeclaration
`@param params` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 * {@link IHoverParticipant}, {@link IDiagnosticsParticipant} in the given
	 * registry.
	 * @param params
	 *
	 * @param registry
```

### JavadocDeclaration
`@param registry` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 * @param params
	 *
	 * @param registry
	 * @param settings
	 */
```

### JavadocDeclaration
`@param settings` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IXMLExtension.java`
#### Snippet
```java
	 *
	 * @param registry
	 * @param settings
	 */
	void start(InitializeParams params, XMLExtensionsRegistry registry);
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IDocumentLinkParticipant.java`
#### Snippet
```java
	 * Find document links of the given XML document.
	 * 
	 * @param document
	 * @param links
	 */
```

### JavadocDeclaration
`@param links` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IDocumentLinkParticipant.java`
#### Snippet
```java
	 * 
	 * @param document
	 * @param links
	 */
	void findDocumentLinks(DOMDocument document, List<DocumentLink> links);
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IDefinitionParticipant.java`
#### Snippet
```java
	 * Find definition.
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
```

### JavadocDeclaration
`@param locations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IDefinitionParticipant.java`
#### Snippet
```java
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/IDefinitionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
	void findDefinition(IDefinitionRequest request, List<LocationLink> locations, CancelChecker cancelChecker);
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ITypeDefinitionParticipant.java`
#### Snippet
```java
	 * Find type definition.
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
```

### JavadocDeclaration
`@param locations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ITypeDefinitionParticipant.java`
#### Snippet
```java
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ITypeDefinitionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
	void findTypeDefinition(ITypeDefinitionRequest request, List<LocationLink> locations, CancelChecker cancelChecker);
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractTypeDefinitionParticipant.java`
#### Snippet
```java
	 * Find the type definition
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
```

### JavadocDeclaration
`@param locations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractTypeDefinitionParticipant.java`
#### Snippet
```java
	 * 
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractTypeDefinitionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param locations
	 * @param cancelChecker
	 */
	protected abstract void doFindTypeDefinition(ITypeDefinitionRequest request, List<LocationLink> locations,
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/AbstractTypeDefinitionParticipant.java`
#### Snippet
```java
	 * document and false otherwise.
	 * 
	 * @param document
	 * @return true if the type definition support is applicable for the given
	 *         document and false otherwise.
```

### JavadocDeclaration
`@param validateDocumentPredicate` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/save/ISaveContext.java`
#### Snippet
```java
	 * This method is called to collect document to validate after the save.
	 * 
	 * @param validateDocumentPredicate
	 */
	void collectDocumentToValidate(Predicate<DOMDocument> validateDocumentPredicate);
```

### JavadocDeclaration
Wrong tag `dince`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/rename/IRenameResponse.java`
#### Snippet
```java
 * Rename response API.
 *
 * @dince 0.26
 */
public interface IRenameResponse {
```

### JavadocDeclaration
`@param s` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 * token after 'initialState'
	 *
	 * @param s
	 * @param offset
	 * @param intialState
```

### JavadocDeclaration
`@param offset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 *
	 * @param s
	 * @param offset
	 * @param intialState
	 * @param expectedToken
```

### JavadocDeclaration
`@param intialState` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 * @param s
	 * @param offset
	 * @param intialState
	 * @param expectedToken
	 * @return
```

### JavadocDeclaration
`@param expectedToken` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 * @param offset
	 * @param intialState
	 * @param expectedToken
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 * @param intialState
	 * @param expectedToken
	 * @return
	 */
	public static int getOffsetFollowedBy(String s, int offset, ScannerState intialState, TokenType expectedToken) {
```

### JavadocDeclaration
`@param node` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 * external DTD) and false otherwise.
	 *
	 * @param node
	 * @param xmlDocument
	 * @return true if completion was triggered inside DTD content (internal or
```

### JavadocDeclaration
`@param xmlDocument` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
	 *
	 * @param node
	 * @param xmlDocument
	 * @return true if completion was triggered inside DTD content (internal or
	 *         external DTD) and false otherwise.
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
	 * element and the closing bracket are in different lines.
	 *
	 * @param element
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
	 *
	 * @param element
	 * @throws BadLocationException
	 */
	private int formatElementStartTagOrSelfClosed(DOMElement element, XMLFormattingConstraints parentConstraints,
```

### JavadocDeclaration
BadLocationException is not declared to be thrown by method formatElementStartTagOrSelfClosed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
	 *
	 * @param element
	 * @throws BadLocationException
	 */
	private int formatElementStartTagOrSelfClosed(DOMElement element, XMLFormattingConstraints parentConstraints,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
	 * @return List containing multiple TextEdit of an XML document.
	 * 
	 * @throws BadLocationException
	 */
	public List<? extends TextEdit> format() throws BadLocationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionParticipant.java`
#### Snippet
```java
	 * @param request     the completion request
	 * @param response    the completion response
	 * @throws Exception
	 */
	void onAttributeValue(String valuePrefix, ICompletionRequest request, ICompletionResponse response,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionParticipant.java`
#### Snippet
```java
	 * @param request     the completion request
	 * @param response    the completion response
	 * @throws Exception
	 */
	void onDTDSystemId(String valuePrefix, ICompletionRequest request, ICompletionResponse response,
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionItemResolverRequest.java`
#### Snippet
```java
	 * false otherwise.
	 *
	 * @returns true if the editor supports delayed resolution of
	 *          additionalTextEdits and
	 *          false otherwise
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionItemResolverRequest.java`
#### Snippet
```java
	 * false otherwise.
	 *
	 * @returns true if the editor supports delayed resolution of documentation and
	 *          false otherwise
	 */
```

### JavadocDeclaration
`@param completionItem` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionResponse.java`
#### Snippet
```java
	 * Add completion item and mark as coming from grammar.
	 *
	 * @param completionItem
	 * @param comingFromGrammar
	 */
```

### JavadocDeclaration
`@param comingFromGrammar` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionResponse.java`
#### Snippet
```java
	 *
	 * @param completionItem
	 * @param comingFromGrammar
	 */
	void addCompletionItem(CompletionItem completionItem, boolean comingFromGrammar);
```

### JavadocDeclaration
`@param completionItem` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionResponse.java`
#### Snippet
```java
	 * Add completion item.
	 *
	 * @param completionItem
	 */
	void addCompletionItem(CompletionItem completionItem);
```

### JavadocDeclaration
`@param item` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionResponse.java`
#### Snippet
```java
	 * Add completion attribute.
	 *
	 * @param item
	 */
	void addCompletionAttribute(CompletionItem item);
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionRequest.java`
#### Snippet
```java
	 * false otherwise.
	 *
	 * @returns true if the editor supports delayed resolution of
	 *          additionalTextEdits and
	 *          false otherwise
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionRequest.java`
#### Snippet
```java
	 * false otherwise.
	 *
	 * @returns true if the editor supports delayed resolution of documentation and
	 *          false otherwise
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 *
	 * @return List containing a single TextEdit
	 * @throws BadLocationException
	 */
	public List<? extends TextEdit> format() throws BadLocationException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * (not the rangeDomDocument)
	 *
	 * @param element
	 * @return true if the provided element has one attribute in the fullDomDocument
	 *         (not the rangeDomDocument)
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * element and the closing bracket are in different lines.
	 *
	 * @param element
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 *
	 * @param element
	 * @throws BadLocationException
	 */
	private void formatElementStartTagSelfCloseBracket(DOMElement element) throws BadLocationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * @return true if first offset and second offset belong in the same line of the
	 *         document
	 * @throws BadLocationException
	 */
	private boolean isSameLine(int first, int second) throws BadLocationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * @param element the DOM element to format.
	 *
	 * @throws BadLocationException
	 */
	private void formatElement(DOMElement element) throws BadLocationException {
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 * element and the closing bracket are in different lines.
	 *
	 * @param element
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	 *
	 * @param element
	 * @throws BadLocationException
	 */
	private void formatElementStartTagCloseBracket(DOMElement element) throws BadLocationException {
```

### JavadocDeclaration
`@param enabled` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCodeLensSettings.java`
#### Snippet
```java
	 * Set true if codelens service is enabled and false otherwise.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
```

### JavadocDeclaration
`@param commandService` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	 * Sets the LS command service
	 *
	 * @param commandService
	 */
	public void setCommandService(IXMLCommandService commandService) {
```

### JavadocDeclaration
`@param validationService` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	 * Sets the XML document validation service
	 *
	 * @param validationService
	 */
	public void setValidationService(IXMLValidationService validationService) {
```

### JavadocDeclaration
`@param initializeParams` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/InitializationOptionsSettings.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param initializeParams
	 * @return the "settings" section of
	 *         {@link InitializeParams#getInitializationOptions()}.
```

### JavadocDeclaration
`@param updateEndTagName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	 * Update additional text edits if an orphan end tag should be updated.
	 * 
	 * @param updateEndTagName
	 * 
	 * @return true if client can support completion resolve of
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	 * @param request       the completion request.
	 * @param participantId the resolve participant id.
	 * @return
	 */
	protected JsonObject addResolveData(ICompletionRequest request, String participantId) {
```

### JavadocDeclaration
`@param initializationOptionsSettings` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * with contents from <code>initializationOptionsSettings</code>
	 *
	 * @param initializationOptionsSettings
	 * @return a new instance of <code>XMLGeneralClientSettings</code>
	 * with contents from <code>initializationOptionsSettings</code>
```

### JavadocDeclaration
`@param completion` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * Sets the completion settings
	 *
	 * @param completion
	 */
	public void setCompletion(XMLCompletionSettings completion) {
```

### JavadocDeclaration
`@param codeLens` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * Sets the code lens settings.
	 *
	 * @param codeLens
	 */
	public void setCodeLens(XMLCodeLensSettings codeLens) {
```

### JavadocDeclaration
`@param excluded` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolSettings.java`
#### Snippet
```java
	 * {@link XMLExcludedSymbolFile} objects within this object.
	 * 
	 * @param excluded
	 */
	public void setExcluded(String[] excluded) {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolSettings.java`
#### Snippet
```java
	 * 'setExcluded()'.
	 * 
	 * @param uri
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolSettings.java`
#### Snippet
```java
	 * 
	 * @param uri
	 * @return
	 */
	public boolean isExcluded(String uri) {
```

### JavadocDeclaration
`@param format` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * Sets the formatting options
	 *
	 * @param format
	 */
	public void setFormat(XMLFormattingOptions format) {
```

### JavadocDeclaration
`@param server` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * Sets the server
	 *
	 * @param server
	 */
	public void setServer(ServerSettings server) {
```

### JavadocDeclaration
`@param foldings` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLGeneralClientSettings.java`
#### Snippet
```java
	 * Sets the folding options
	 *
	 * @param foldings
	 */
	public void setFolding(XMLFoldingSettings foldings) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCompletionSettings.java`
#### Snippet
```java
	 * If tag should be autoclosed with an end tag.
	 *
	 * @return
	 */
	public boolean isAutoCloseTags() {
```

### JavadocDeclaration
`@param autoCloseTags` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCompletionSettings.java`
#### Snippet
```java
	 * Tag should be autoclosed with an end tag.
	 *
	 * @param autoCloseTags
	 */
	public void setAutoCloseTags(boolean autoCloseTags) {
```

### JavadocDeclaration
`@param autoCloseRemovesContent` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCompletionSettings.java`
#### Snippet
```java
	 * the element
	 *
	 * @param autoCloseRemovesContent
	 */
	public void setAutoCloseRemovesContent(boolean autoCloseRemovesContent) {
```

### JavadocDeclaration
`@param initializeParams` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/InitializationOptionsExtendedClientCapabilities.java`
#### Snippet
```java
	 * </pre>
	 * 
	 * @param initializeParams
	 * @return the "extendedClientCapabilities" section of
	 *         {@link InitializeParams#getInitializationOptions()}.
```

### JavadocDeclaration
`@param openSettingsCommandSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/SharedSettings.java`
#### Snippet
```java
	 * Sets the openSettingsCommandSupport boolean
	 *
	 * @param openSettingsCommandSupport
	 */
	public void setOpenSettingsCommandSupport(boolean openSettingsCommandSupport) {
```

### JavadocDeclaration
`@param actionableNotificationSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/SharedSettings.java`
#### Snippet
```java
	 * Sets the actionableNotificationSupport boolean
	 *
	 * @param actionableNotificationSupport
	 */
	public void setActionableNotificationSupport(boolean actionableNotificationSupport) {
```

### JavadocDeclaration
`@param bindingWizardSupport` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/SharedSettings.java`
#### Snippet
```java
	 * Sets the bindingWizardSupport boolean
	 *
	 * @param bindingWizardSupport
	 */
	public void setBindingWizardSupport(boolean bindingWizardSupport) {
```

### JavadocDeclaration
`@param newPreferences` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLPreferences.java`
#### Snippet
```java
	 * <code>XMLPreferences</code> instance
	 * 
	 * @param newPreferences
	 */
	public void merge(XMLPreferences newPreferences) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLPreferences.java`
#### Snippet
```java
	 * Returns the quote style
	 * 
	 * @return
	 */
	public QuoteStyle getQuoteStyle() {
```

### JavadocDeclaration
`@param quoteStyle` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLPreferences.java`
#### Snippet
```java
	 * Sets the quote style
	 * 
	 * @param quoteStyle
	 */
	public void setQuoteStyle(QuoteStyle quoteStyle) {
```

### JavadocDeclaration
`@param showSchemaDocumentationType` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLPreferences.java`
#### Snippet
```java
	 * Sets the showSchemaDocumentationType
	 * 
	 * @param showSchemaDocumentationType
	 */
	public void setShowSchemaDocumentationType(SchemaDocumentationType showSchemaDocumentationType) {
```

### JavadocDeclaration
`@param clientCapabilities` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/ServerCapabilitiesInitializer.java`
#### Snippet
```java
	 * A service's dynamic capability is indicated by the client.
	 * 
	 * @param clientCapabilities
	 * @return ServerCapabilities object
	 */
```

### JavadocDeclaration
`@param params` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/TelemetryManager.java`
#### Snippet
```java
	 * Send a telemetry event on start of the XML server
	 *
	 * @param params
	 */
	public void onInitialized(InitializedParams params) {
```

### JavadocDeclaration
`@param clientCapabilities` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/XMLCapabilityManager.java`
#### Snippet
```java
	 * clientCapabilities
	 *
	 * @param clientCapabilities
	 * @param extendedClientCapabilities
	 */
```

### JavadocDeclaration
`@param extendedClientCapabilities` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/XMLCapabilityManager.java`
#### Snippet
```java
	 *
	 * @param clientCapabilities
	 * @param extendedClientCapabilities
	 */
	public void setClientCapabilities(ClientCapabilities clientCapabilities,
```

### JavadocDeclaration
`@param value` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
	 * tags have content of either an xs:annotation or xs:simpleType
	 * 
	 * @param value
	 * 
	 * @return list of xs:annotation from the attribute declaration or type
```

### JavadocDeclaration
`@param characterOffset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
	 * @param reporter the lsp reporter.
	 * @return the XML Schema loader to use to validate the XML Schema.
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
```

### JavadocDeclaration
NoSuchFieldException is not declared to be thrown by method createSchemaLoader
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
	 * @param reporter the lsp reporter.
	 * @return the XML Schema loader to use to validate the XML Schema.
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
	 * @return the XML Schema loader to use to validate the XML Schema.
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	private static XMLSchemaLoader createSchemaLoader(XMLErrorReporter reporter, XMLEntityManager entityManager) {
```

### JavadocDeclaration
IllegalAccessException is not declared to be thrown by method createSchemaLoader
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
	 * @return the XML Schema loader to use to validate the XML Schema.
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	private static XMLSchemaLoader createSchemaLoader(XMLErrorReporter reporter, XMLEntityManager entityManager) {
```

### JavadocDeclaration
`@param elementDeclaration` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * Fill the given elements list from the given Xerces elementDeclaration
	 * 
	 * @param elementDeclaration
	 * @param elements
	 */
```

### JavadocDeclaration
`@param elements` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * 
	 * @param elementDeclaration
	 * @param elements
	 */
	void collectElement(XSElementDeclaration elementDeclaration, Collection<CMElementDeclaration> elements) {
```

### JavadocDeclaration
`@param elementDeclaration` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * <code>elementDeclaration</code> and null otherwise.
	 * 
	 * @param elementDeclaration
	 * @param xsLoader
	 * @return the Xerces DOM xs:element which have created the given instance
```

### JavadocDeclaration
`@param xsLoader` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * 
	 * @param elementDeclaration
	 * @param xsLoader
	 * @return the Xerces DOM xs:element which have created the given instance
	 *         <code>elementDeclaration</code> and null otherwise
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * @param inAnyLevel    true if search must be done in any level and false
	 *                      otherwise.
	 * @return
	 */
	private static LocationLink findXSElement(DOMElement originElement, NodeList children, boolean inAnyLevel) {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java
	 * retrieved by the given uri
	 * 
	 * @param uri
	 * @return the version coming from xsl:stylesheet/@version of the XML document
	 *         retrieved by the given uri
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPSecurityManager.java`
#### Snippet
```java
	/**
	 * Returns the Xerces security manager created from JVM arguments.
	 * @return
	 */
	public static SecurityManager getSecurityManager() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
	 * @param name     the field name.
	 * @return the field value of the given instance and field name.
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
	 * @return the field value of the given instance and field name.
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static <T> T getFieldValue(Object instance, String name)
```

### JavadocDeclaration
`@param originalValue` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
	 * attribute value
	 *
	 * @param originalValue
	 * @return offset from opening quote to first non-whitespace character of an
	 *         attribute value
```

### JavadocDeclaration
`@param completionOffset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * it from the list of attributes with this index.
	 *
	 * @param completionOffset
	 * @param element
	 * @return
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 *
	 * @param completionOffset
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * @param completionOffset
	 * @param element
	 * @return
	 */
	private static int getAttributeCompletionPosition(int completionOffset, DOMNode element) {
```

### JavadocDeclaration
`@param attributeName` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * list of attributes equals the provided attributeName
	 *
	 * @param attributeName
	 * @param element
	 * @param position
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 *
	 * @param attributeName
	 * @param element
	 * @param position
	 * @return
```

### JavadocDeclaration
`@param position` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * @param attributeName
	 * @param element
	 * @param position
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
	 * @param element
	 * @param position
	 * @return
	 */
	private static boolean isCurrentAttributeEqual(String attributeName, DOMNode element, int index) {
```

### JavadocDeclaration
`@param diagnosticSeverity` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReferencedGrammarDiagnosticsInfo.java`
#### Snippet
```java
	 * Increment the error number to update the diagnostic root message.
	 * 
	 * @param diagnosticSeverity
	 */
	public void addError(boolean fatalError) {
```

### JavadocDeclaration
`@param fatalError` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 * @param message                  the Xerces error message
	 * @param diagnosticSeverity       the the Xerces severity
	 * @param fatalError
	 * @param resolverExtensionManager the resolver
	 * @param syntaxCode               the Syntax error code and null otherwise.
```

### JavadocDeclaration
`@param location` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param location
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	 * @param resolverExtensionManager the resolver used to load the DOM document of
	 *                                 the referenced grammar.
	 * @return
	 */
	private ReferencedGrammarDiagnosticsInfo getReferencedGrammarDiagnosticsInfo(String grammarURI,
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * "{"http://maven.apache.org/POM/4.0.0":propertiesa}"
	 * 
	 * @param name
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param name
	 * @return
	 */
	private static Matcher getNamespaceMatcher(String name) {
```

### JavadocDeclaration
`@param names` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * Reformats a string of format: "[name1, name2, name3]"
	 * 
	 * @param names
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param names
	 * @return
	 */
	private static String reformatArrayElementNames(String names) {
```

### JavadocDeclaration
`@param code` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * Modifies the schema message arguments to a cleaned down format
	 * 
	 * @param code
	 * @param message
	 * @return
```

### JavadocDeclaration
`@param message` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * @param code
	 * @param message
	 * @return
	 */
	public static Object[] reformatSchemaArguments(XMLSchemaErrorCode code, Object[] arguments) {
```

### JavadocDeclaration
Wrong tag `xerces.internal`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
 * localizable error messages for the W3C XML Schema Language
 * 
 * @xerces.internal
 * 
 * @author Elena Litani, IBM
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * arguments[0]: propertiesa arguments[1]: {groupId, version}
	 * 
	 * @param arguments
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param arguments
	 * @return
	 */
	private static Object[] cvc_2_4_a_solution(Object[] arguments) {
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * arguments[0]: elementName arguments[1]: {groupId, version}
	 * 
	 * @param arguments
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	 * 
	 * @param arguments
	 * @return
	 */
	private static Object[] cvc_2_4_b_solution(Object[] arguments) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	 *                           otherwise.
	 * @param document           the DOM document.
	 * @return
	 */
	protected abstract Range toLSPRange(XMLLocator location, String key, Object[] arguments, String message,
```

### JavadocDeclaration
`@param exception` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	 * @param fatalError         true if Xerces report the error as fatal and false
	 *                           otherwise.
	 * @param exception
	 * @param document           the DOM document.
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param pathToAttributeDirectory` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * Creates the completion items based off the given absolute path
	 *
	 * @param pathToAttributeDirectory
	 * @param attributePath
	 * @param replaceRange
```

### JavadocDeclaration
`@param attributePath` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param pathToAttributeDirectory
	 * @param attributePath
	 * @param replaceRange
	 * @param response
```

### JavadocDeclaration
`@param replaceRange` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param pathToAttributeDirectory
	 * @param attributePath
	 * @param replaceRange
	 * @param response
	 * @param filter
```

### JavadocDeclaration
`@param response` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param attributePath
	 * @param replaceRange
	 * @param response
	 * @param filter
	 */
```

### JavadocDeclaration
`@param filter` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param replaceRange
	 * @param response
	 * @param filter
	 */
	private static void createNextValidCompletionPaths(Path pathToAttributeDirectory, String slash, Range replaceRange,
```

### JavadocDeclaration
`@param xmlDocument` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * ends with a slash then a Range right after it.
	 *
	 * @param xmlDocument
	 * @param fullRange
	 * @param attributeValue
```

### JavadocDeclaration
`@param fullRange` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param xmlDocument
	 * @param fullRange
	 * @param attributeValue
	 * @param slash
```

### JavadocDeclaration
`@param attributeValue` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param xmlDocument
	 * @param fullRange
	 * @param attributeValue
	 * @param slash
	 * @return
```

### JavadocDeclaration
`@param slash` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param fullRange
	 * @param attributeValue
	 * @param slash
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	 * @param attributeValue
	 * @param slash
	 * @return
	 */
	private static Range adjustReplaceRange(DOMDocument xmlDocument, Range fullRange, String attributeValue,
```

### JavadocDeclaration
Wrong tag `See`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
	 * Predefined entities.
	 * 
	 * @See https://www.w3.org/TR/xml/#sec-predefined-ent
	 *
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/IFileContentGenerator.java`
#### Snippet
```java
	 * @param generatorSettings the generator settings.
	 * @param formatter         the formatter.
	 * @param cancelChecker 
	 * @return the result of the generation of the file content (ex : XSD, DTD) from
	 *         the given document source <code>document</code> (ex: XML) by using
```

### JavadocDeclaration
`@param characterOffset` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 *
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 * @param characterOffset
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param doneID` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/ElementDeclaration.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param doneID
	 */
	void setAttributeID(boolean doneID) {
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@param cancelChecker` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AbstractXML2GrammarGenerator.java`
#### Snippet
```java
	 * @param grammarSettings the grammar settings
	 * @param out             the XML builder to update.
	 * @param cancelChecker
	 */
	protected abstract void generate(Grammar grammar, T grammarSettings, XMLBuilder out, CancelChecker cancelChecker);
```

### JavadocDeclaration
`@param namespaceURI` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMDocument.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param namespaceURI
	 * @return true if the model document defines the given namespace and false
	 *         otherwise.
```

### JavadocDeclaration
`@param tag` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
	 * and null otherwise.
	 * 
	 * @param tag
	 * @param namespace
	 * @return the declared element which matches the given XML tag name / namespace
```

### JavadocDeclaration
`@param namespace` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java
	 * 
	 * @param tag
	 * @param namespace
	 * @return the declared element which matches the given XML tag name / namespace
	 *         and null otherwise.
```

### JavadocDeclaration
`@param fileURI` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/FilesChangedTracker.java`
#### Snippet
```java
	 * Add file URI to track
	 * 
	 * @param fileURI
	 */
	public void addFileURI(URI fileURI) {
```

### JavadocDeclaration
`@param fileURI` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/FilesChangedTracker.java`
#### Snippet
```java
	 * Add file URI to track
	 * 
	 * @param fileURI
	 */
	public void addFileURI(String fileURI) {
```

### JavadocDeclaration
`@param catalogs` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/ContentModelSettings.java`
#### Snippet
```java
	 * Register the list of the XML catalogs file path.
	 *
	 * @param catalogs
	 */
	public void setCatalogs(String[] catalogs) {
```

### JavadocDeclaration
Wrong tag `returnthe`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationRootSettings.java`
#### Snippet
```java
	 * @param uri the XML document to validate.
	 * 
	 * @returnthe validation settings for the given uri and the global validation
	 *            settings otherwise.
	 */
```

### JavadocDeclaration
`@param url` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
	 * "ftp" and <code>false</code> otherwise.
	 * 
	 * @param url
	 * @return <code>true</code> if cache is enabled and url comes from "http(s)" or
	 *         "ftp" and <code>false</code> otherwise.
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
	 * 
	 * @return the cached resource path from the given url and null otherwise.
	 * @throws IOException
	 * @throws CacheResourceDownloadedException throws when resource is downloading.
	 */
```

### JavadocDeclaration
`@param fileAssociations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
	 * Set file associations.
	 *
	 * @param fileAssociations
	 * @return true if file associations changed and false otherwise
	 */
```

### JavadocDeclaration
`@param modelProvider` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
	 * @param publicId      the public identifier.
	 * @param systemId      the expanded system identifier.
	 * @param modelProvider
	 * @return the content model document loaded by the given uri and null
	 *         otherwise.
```

### JavadocDeclaration
`@param fileAssociations` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
	/**
	 * 
	 * @param fileAssociations
	 * @return true if file associations changed and false otherwise
	 */
```

### JavadocDeclaration
`@param elementDeclaration` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * generate only children and only required elements.
	 * 
	 * @param elementDeclaration
	 * @param prefix
	 * @param generateEndTag
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * 
	 * @param elementDeclaration
	 * @param prefix
	 * @param generateEndTag
	 * @param level                the level at which the first element will be
```

### JavadocDeclaration
`@param generateEndTag` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * @param elementDeclaration
	 * @param prefix
	 * @param generateEndTag
	 * @param level                the level at which the first element will be
	 *                             generated at
```

### JavadocDeclaration
`@param cmAttribute` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * otherwise.
	 * 
	 * @param cmAttribute
	 * @param attributeValue
	 * @param ownerElement
```

### JavadocDeclaration
`@param attributeValue` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * 
	 * @param cmAttribute
	 * @param attributeValue
	 * @param ownerElement
	 * @param support
```

### JavadocDeclaration
`@param ownerElement` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * @param cmAttribute
	 * @param attributeValue
	 * @param ownerElement
	 * @param support
	 * @return a markup content for attribute value documentation and null
```

### JavadocDeclaration
`@param support` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * @param attributeValue
	 * @param ownerElement
	 * @param support
	 * @return a markup content for attribute value documentation and null
	 *         otherwise.
```

### JavadocDeclaration
`@param elementDeclaration` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * Returns the XML generated from the given element declaration.
	 * 
	 * @param elementDeclaration
	 * @param prefix
	 * @return the XML generated from the given element declaration.
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * 
	 * @param elementDeclaration
	 * @param prefix
	 * @return the XML generated from the given element declaration.
	 */
```

### JavadocDeclaration
`@param cmElement` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * Returns a markup content for element documentation and null otherwise.
	 * 
	 * @param cmElement
	 * @param support
	 * @return a markup content for element documentation and null otherwise.
```

### JavadocDeclaration
`@param support` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * 
	 * @param cmElement
	 * @param support
	 * @return a markup content for element documentation and null otherwise.
	 */
```

### JavadocDeclaration
`@param documentation` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * If there is no content then null is returned.
	 * 
	 * @param documentation
	 * @param schemaURI
	 * @return
```

### JavadocDeclaration
`@param schemaURI` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * 
	 * @param documentation
	 * @param schemaURI
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * @param documentation
	 * @param schemaURI
	 * @return
	 */
	public static String generateDocumentation(String documentation, String schemaURI, boolean html) {
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 * @param children           the children of the element
	 * @param generatedElements  the list containing generated elements
	 * @return
	 */
	private boolean isAlreadyGenerated(CMElementDeclaration elementDeclaration,
```

### JavadocDeclaration
`@param location` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param location
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@param location` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param location
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param location` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	 * Create the LSP range from the SAX error.
	 *
	 * @param location
	 * @param key
	 * @param arguments
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@param key` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	 *
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	 * @param location
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	 * @param key
	 * @param arguments
	 * @param document
	 * @return the LSP range from the SAX error.
	 */
```

### JavadocDeclaration
`@param defaultPrefix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param parentElement       the parent DOM element
	 * @param cmElement           the content model element declaration
	 * @param defaultPrefix
	 * @param contentModelManager
	 * @param request
```

### JavadocDeclaration
`@param contentModelManager` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param cmElement           the content model element declaration
	 * @param defaultPrefix
	 * @param contentModelManager
	 * @param request
	 * @param response
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param defaultPrefix
	 * @param contentModelManager
	 * @param request
	 * @param response
	 * @throws BadLocationException
```

### JavadocDeclaration
`@param response` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param contentModelManager
	 * @param request
	 * @param response
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param response
	 * @throws BadLocationException
	 */
	private static void fillWithPossibleElementDeclaration(DOMElement parentElement, CMElementDeclaration cmElement,
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * Fill with children element declarations
	 *
	 * @param element
	 * @param cmDocument
	 * @param cmElements
```

### JavadocDeclaration
`@param cmDocument` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param element
	 * @param cmDocument
	 * @param cmElements
	 * @param defaultPrefix
```

### JavadocDeclaration
`@param cmElements` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param element
	 * @param cmDocument
	 * @param cmElements
	 * @param defaultPrefix
	 * @param forceUseOfPrefix
```

### JavadocDeclaration
`@param defaultPrefix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param cmDocument
	 * @param cmElements
	 * @param defaultPrefix
	 * @param forceUseOfPrefix
	 * @param request
```

### JavadocDeclaration
`@param forceUseOfPrefix` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param cmElements
	 * @param defaultPrefix
	 * @param forceUseOfPrefix
	 * @param request
	 * @param response
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param defaultPrefix
	 * @param forceUseOfPrefix
	 * @param request
	 * @param response
	 * @throws BadLocationException
```

### JavadocDeclaration
`@param response` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param forceUseOfPrefix
	 * @param request
	 * @param response
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param request
	 * @param response
	 * @throws BadLocationException
	 */
	private static void fillWithChildrenElementDeclaration(DOMElement element, Collection<CMDocument> cmDocuments,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_4_aCodeAction.java`
#### Snippet
```java
	 * @param componentProvider the component provider
	 * @return the possible elements for the given DOM element.
	 * @throws Exception
	 */
	private static Collection<CMElementDeclaration> getPossibleElements(DOMElement element,
```

### JavadocDeclaration
`@param list` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * Add completion item with all tag names of the node list.
	 *
	 * @param list
	 * @param tags
	 * @param request
```

### JavadocDeclaration
`@param tags` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 *
	 * @param list
	 * @param tags
	 * @param request
	 * @param response
```

### JavadocDeclaration
`@param request` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param list
	 * @param tags
	 * @param request
	 * @param response
	 */
```

### JavadocDeclaration
`@param response` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param tags
	 * @param request
	 * @param response
	 */
	private static void addTagName(NodeList list, Set<String> tags, ICompletionRequest request,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 * @param settings    the settings
	 * @param codeActions the list of code actions
	 * @throws BadLocationException
	 */
	private void addDoctypeAndEntityCodeAction(String entityName, Diagnostic diagnostic, DOMDocument document,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 * @param doc        the DOM document
	 * @return entity name from the error range and error message.
	 * @throws BadLocationException
	 */
	private static String getEntityName(Diagnostic diagnostic, DOMDocument doc) throws BadLocationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 * @param settings    the settings
	 * @param codeActions the list of code actions
	 * @throws BadLocationException
	 */
	private void addEntityCodeAction(String entityName, Diagnostic diagnostic, DOMDocument document,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 * @param codeActions     the code actions list to fill.
	 *
	 * @throws BadLocationException
	 */
	private void doCodeActionsForStartTagUnclosed(DOMElement element, DOMDocument document, Range diagnosticRange,
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 * @param document   the DOM document.
	 * @param diagnostic the diagnostic.
	 * @return
	 * @throws BadLocationException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 * @param diagnostic the diagnostic.
	 * @return
	 * @throws BadLocationException
	 */
	private static CodeAction removeTagCodeAction(DOMElement element, DOMDocument document, Diagnostic diagnostic)
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 * @param codeActions the code actions list to fill.
	 *
	 * @throws BadLocationException
	 */
	private void doCodeActionsForEndTagUnclosed(DOMElement element, DOMDocument document, Diagnostic diagnostic,
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 * @param codeActions the code actions list to fill.
	 *
	 * @throws BadLocationException
	 */
	private void doCodeActionsForStartTagClosed(DOMElement element, DOMDocument document, Range diagnosticRange,
```

### JavadocDeclaration
`@param command` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/customservice/XMLLanguageClientAPI.java`
#### Snippet
```java
	 * Notification to be sent to the client with a list of commands
	 * 
	 * @param command
	 */
	@JsonNotification("actionableNotification")
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
	 * @return the cached {@link ResourceToDeploy#resourceCachePath} in cache file
	 *         system.
	 * @throws IOException
	 */
	public static Path getResourceCachePath(ResourceToDeploy resource) throws IOException {
```

### JavadocDeclaration
`@param url` tag description is missing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
	 * "ftp" and <code>false</code> otherwise.
	 *
	 * @param url
	 * @return <code>true</code> if cache is enabled and url comes from "http(s)" or
	 *         "ftp" and <code>false</code> otherwise.
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `e1` to `CMElementDeclaration` is redundant
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
		});
		return sortedElements;
```

### RedundantCast
Casting `e2` to `CMElementDeclaration` is redundant
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
		});
		return sortedElements;
```

### RedundantCast
Casting `getXMLLanguageService().doCodeActions(...).stream().map(...).collect(...)` to `List`> is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
			}

			return (List<Either<Command, CodeAction>>) getXMLLanguageService()
					.doCodeActions(params.getContext(), params.getRange(), xmlDocument, sharedSettings, cancelChecker) //
					.stream() //
```

### RedundantCast
Casting `this` to `DOMProcessingInstruction` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	public boolean isProcessingInstruction() {
		return (getNodeType() == DOMNode.PROCESSING_INSTRUCTION_NODE)
				&& ((DOMProcessingInstruction) this).isProcessingInstruction();
	}

```

### RedundantCast
Casting `this` to `DOMProcessingInstruction` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	public boolean isProlog() {
		return (getNodeType() == DOMNode.PROCESSING_INSTRUCTION_NODE) && ((DOMProcessingInstruction) this).isProlog();
	}

```

### RedundantCast
Casting `node` to `Text` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
			return ((Attr) node).getOwnerElement();
		case Node.TEXT_NODE:
			return ((Text) node).getParentNode();
		}
		return node;
```

### RedundantCast
Casting `curr` to `DOMDocumentType` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java

				case DTDEndDoctypeTag: {
					((DOMDocumentType) curr).end = scanner.getTokenEnd();
					curr.closed = true;
					curr = curr.parent;
```

### RedundantCast
Casting `element.getFirstChild()` to `DOMNode` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java

		if (DOMUtils.containsTextOnly(element)) {
			DOMNode textNode = (DOMNode) element.getFirstChild();
			String text = element.getFirstChild().getTextContent();

```

### RedundantCast
Casting `first` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/NewFileSnippetContext.java`
#### Snippet
```java
				DOMElement first = (DOMElement) child;
				// check if element is just '<' or '<!'
				if (!(first.isElement() && ((DOMElement) first).getTagName() == null && !first.hasChildNodes())) {
					return false;
				}
```

### RedundantCast
Casting `originName` to `DOMRange` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDDefinitionParticipant.java`
#### Snippet
```java
		if (originName != null) {
			DTDUtils.searchDTDTargetElementDecl(originName, true, targetElementName -> {
				LocationLink location = XMLPositionUtility.createLocationLink((DOMRange) originName,
						(DOMRange) targetElementName);
				locations.add(location);
```

### RedundantCast
Casting `targetElementName` to `DOMRange` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDDefinitionParticipant.java`
#### Snippet
```java
			DTDUtils.searchDTDTargetElementDecl(originName, true, targetElementName -> {
				LocationLink location = XMLPositionUtility.createLocationLink((DOMRange) originName,
						(DOMRange) targetElementName);
				locations.add(location);
			});
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
			break;
		case Node.ELEMENT_NODE:
			attr = ((DOMElement) node).getAttributeNode("name");
			break;
		}
```

### RedundantCast
Casting `typeDefinition` to `XSComplexTypeDecl` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			if (((XSComplexTypeDecl) typeDefinition).getDerivationMethod() == XSConstants.DERIVATION_EXTENSION) {
				XSObjectListImpl allAnnotations = new XSObjectListImpl();
				XSTypeDefinition baseType = ((XSComplexTypeDecl) typeDefinition).getBaseType();
				// Get annotations for current type
				for (Object xsObject : annotation.toArray()) {
```

### RedundantCast
Casting `xsObject` to `XSObject` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
				// Get annotations for current type
				for (Object xsObject : annotation.toArray()) {
					if (((XSObject) xsObject) != null) {
						allAnnotations.addXSObject((XSObject) xsObject);
					}
```

### RedundantCast
Casting `xsObject` to `XSObject` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
				// Get annotations for base type
				for (Object xsObject : getElementAnnotations(baseType).toArray()) {
					if (((XSObject) xsObject) != null) {
						allAnnotations.addXSObject((XSObject) xsObject);
					}
```

### RedundantCast
Casting `namespace` to `SchemaGrammar` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				XSNamespaceItem namespace = namespaces.item(i);
				if (namespace instanceof SchemaGrammar && (elementDeclaration
						.equals(((SchemaGrammar) namespace).getElementDeclaration(elementDeclaration.getName())))) {
					return (SchemaGrammar) namespace;
				}
```

### RedundantCast
Casting `originElement` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			DOMNode node = targetSchema.findNodeAt(complexTypeOffset);
			if (node != null && node.isElement() && node.hasChildNodes()) {
				return findXSElement((DOMElement) originElement, node.getChildNodes(), true);
			}
		}
```

### RedundantCast
Casting `elt.getAttributeNode(...)` to `DOMAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				if (XSDUtils.isXSAttribute(elt)) {
					if (originAttribute.getName().equals(elt.getAttribute("name"))) {
						DOMAttr targetAttr = (DOMAttr) elt.getAttributeNode("name");
						LocationLink location = XMLPositionUtility.createLocationLink(originAttribute.getNodeAttrName(),
								targetAttr.getNodeAttrValue());
```

### RedundantCast
Casting `contentModelManager.getGrammarPool()` to `LSPXMLGrammarPool` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
		// To fix this problem, the grammar pool is updated by removing the referenced
		// grammars which have problems.
		LSPXMLGrammarPool grammarPool = (LSPXMLGrammarPool) contentModelManager.getGrammarPool();
		if (grammarPool == null) {
			return;
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
				DOMNode node = document.findNodeAt(offset);
				if (node != null) {
					if (node.isElement() && RelaxNGUtils.GRAMMAR_TAG.equals(((DOMElement) node).getLocalName())) {
						return XMLPositionUtility.selectStartTagName((DOMElement) node);
					}
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
				if (node != null) {
					if (node.isElement() && RelaxNGUtils.GRAMMAR_TAG.equals(((DOMElement) node).getLocalName())) {
						return XMLPositionUtility.selectStartTagName((DOMElement) node);
					}
				}
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
				DOMNode node = document.findNodeAt(offset);
				if (node != null && node.isElement()
						&& RelaxNGUtils.NAME_ATTR.equals(((DOMElement) node).getLocalName())) {
					// <element><name>::::</name></element>
					DOMElement name = (DOMElement) node;
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
					boolean hasText = DOMUtils.containsTextOnly(name);
					return hasText ? XMLPositionUtility.selectText((DOMText) name.getFirstChild())
							: XMLPositionUtility.selectStartTagName((DOMElement) node);
				}
				// <element name="::::"></element>
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
				DOMNode node = document.findNodeAt(offset);
				if (node != null && node.isElement()) {
					return XMLPositionUtility.selectStartTagName((DOMElement) node);
				}
			}
```

### RedundantCast
Casting `node` to `DOMElement` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
				break;
			case Node.ELEMENT_NODE:
				attr = ((DOMElement) node).getAttributeNode(NAME_ATTR);
				break;
		}
```

### RedundantCast
Casting `targetElement.getAttributeNode(...)` to `DOMAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
					// node is a define element which
					// matches the binding type of the originAttr
					DOMAttr targetAttr = (DOMAttr) targetElement.getAttributeNode(NAME_ATTR);
					if (targetAttr != null && (!matchAttr || Objects.equal(originName, targetAttr.getValue()))) {
						collector.accept(targetNamespacePrefix, targetAttr);
```

### RedundantCast
Casting `document.getFirstChild()` to `DOMRange` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeLensParticipant.java`
#### Snippet
```java
			range.setStart(new Position(0, 0));
		} else {
			range = XMLPositionUtility.createRange((DOMRange) document.getFirstChild());
		}
		range.setEnd(range.getStart());
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `sharedSettings` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	private final ModelValidatorDelayer<DOMDocument> xmlValidatorDelayer;

	private SharedSettings sharedSettings;
	private LimitExceededWarner limitExceededWarner;

```

### FieldMayBeFinal
Field `languageClient` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LSPClientLogHandler.java`
#### Snippet
```java
public class LSPClientLogHandler extends Handler {

	private LanguageClient languageClient;

	public LSPClientLogHandler(LanguageClient languageClient) {
```

### FieldMayBeFinal
Field `remark` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkdownConverter.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(MarkdownConverter.class.getName());

	private static Remark remark;

	private MarkdownConverter(){
```

### FieldMayBeFinal
Field `ownerMatcher` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/AbstractXPathNodeMatcher.java`
#### Snippet
```java
public abstract class AbstractXPathNodeMatcher implements IXPathNodeMatcher {

	private XPathMatcher ownerMatcher;

	public AbstractXPathNodeMatcher(XPathMatcher ownerMatcher) {
```

### FieldMayBeFinal
Field `uriSchemePattern` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	private static String cachePathSetting = null;

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

```

### FieldMayBeFinal
Field `endFilePattern` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
	private static Pattern endFilePattern = Pattern.compile(".*[\\\\\\/]\\.[\\S]+");

	public static String getCachePathSetting() {
```

### FieldMayBeFinal
Field `checkers` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/MultiCancelChecker.java`
#### Snippet
```java
public class MultiCancelChecker implements CancelChecker {

	private CancelChecker[] checkers;

	public MultiCancelChecker(CancelChecker... checkers) {
```

### FieldMayBeFinal
Field `DEFAULT_DELIMTER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
	private final Object lock = new Object();

	private static String DEFAULT_DELIMTER = System.lineSeparator();

	private ILineTracker lineTracker;
```

### FieldMayBeFinal
Field `task` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
	private volatile long lastActivityTime;
	private final ProcessLanguageServer server;
	private ScheduledFuture<?> task;
	private ScheduledExecutorService service;

```

### FieldMayBeFinal
Field `service` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
	private final ProcessLanguageServer server;
	private ScheduledFuture<?> task;
	private ScheduledExecutorService service;

	public interface ProcessLanguageServer extends LanguageServer {
```

### FieldMayBeFinal
Field `fDelimiterInfo` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java
	public final static String[] DELIMITERS = { "\r", "\n", "\r\n" }; //$NON-NLS-3$ //$NON-NLS-1$ //$NON-NLS-2$
	/** A predefined delimiter information which is always reused as return value */
	private DelimiterInfo fDelimiterInfo = new DelimiterInfo();

	/** The line information */
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLReference.java`
#### Snippet
```java
	private final XMLExtensionsRegistry extensionsRegistry;

	private static Logger LOGGER = Logger.getLogger(XMLReference.class.getName());

	public XMLReference(XMLExtensionsRegistry extensionsRegistry) {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
	private static final String WORD_PATTERN = "[^\\s>]+";

	private static Logger LOGGER = Logger.getLogger(XMLLinkedEditing.class.getName());

	private final XMLExtensionsRegistry extensionsRegistry;
```

### FieldMayBeFinal
Field `documentChanges` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/RenameResponse.java`
#### Snippet
```java
 */
class RenameResponse implements IRenameResponse {
	private List<Either<TextDocumentEdit, ResourceOperation>> documentChanges = new ArrayList<>();

	@Override
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDocumentLink.java`
#### Snippet
```java
	private final XMLExtensionsRegistry extensionsRegistry;

	private static Logger LOGGER = Logger.getLogger(XMLDocumentLink.class.getName());

	public XMLDocumentLink(XMLExtensionsRegistry extensionsRegistry) {
```

### FieldMayBeFinal
Field `fDelimiterInfo` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
	public final static String[] DELIMITERS = { "\r", "\n", "\r\n" }; //$NON-NLS-3$ //$NON-NLS-1$ //$NON-NLS-2$
	/** A predefined delimiter information which is always reused as return value */
	private DelimiterInfo fDelimiterInfo = new DelimiterInfo();

	/*
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
 */
class XMLFoldings {
	private static Logger LOGGER = Logger.getLogger(XMLFoldings.class.getName());
	private final XMLExtensionsRegistry extensionsRegistry;

```

### FieldMayBeFinal
Field `cache` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/TelemetryCache.java`
#### Snippet
```java
public class TelemetryCache {

	private Map<String, Object> cache = new HashMap<>();

	public void put(String key) {
```

### FieldMayBeFinal
Field `v3Supported` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/ClientCapabilitiesWrapper.java`
#### Snippet
```java
 */
public class ClientCapabilitiesWrapper {
	private boolean v3Supported;

	public ClientCapabilities capabilities;
```

### FieldMayBeFinal
Field `elementDecl` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java

	private String documentation;
	private CMDTDElementDeclaration elementDecl;

	public CMDTDAttributeDeclaration(CMDTDElementDeclaration elementDecl) {
```

### FieldMayBeFinal
Field `lineSeparator` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/DataType.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(DataType.class.getName());

	private static String lineSeparator = System.lineSeparator();

	private static final Map<String, DataType> dataTypes;
```

### FieldMayBeFinal
Field `accum` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/HtmlToPlainText.java`
#### Snippet
```java
	// the formatting rules, implemented in a breadth-first DOM traverse
	private class FormattingVisitor implements NodeVisitor {
		private StringBuilder accum = new StringBuilder(); // holds the accumulated text
		private int listNesting;
		// hit when the node is first seen
```

### FieldMayBeFinal
Field `lineSeparator` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
public class XSISchemaModel {

	private static String lineSeparator = System.lineSeparator();
	public static final String TYPE_DOC = "Specifies the type of an element. This attribute labels an element as a particular type, even though there might not be an element declaration in the schema binding that element to the type.";
	public static final String NIL_DOC = "Indicates if an element should contain content. Valid values are `true` or `false`";
```

### FieldMayBeFinal
Field `reporterForGrammar` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelAwareParserConfiguration.java`
#### Snippet
```java
	private XMLModelHandler xmlModelHandler;

	private XMLErrorReporter reporterForGrammar;

	/** Default constructor. */
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogDocumentLinkParticipant.java`
#### Snippet
```java
public class XMLCatalogDocumentLinkParticipant implements IDocumentLinkParticipant {

	private static Logger LOGGER = Logger.getLogger(XMLCatalogDocumentLinkParticipant.class.getName());

	@Override
```

### FieldMayBeFinal
Field `hasRelatedInfo` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java

	private final String source;
	private boolean hasRelatedInfo;

	private Exception currentError;
```

### FieldMayBeFinal
Field `report` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorHandler.java`
#### Snippet
```java
public class RelaxNGErrorHandler implements XMLErrorHandler {

	private XMLErrorReporter report;

	public RelaxNGErrorHandler(XMLErrorReporter report) {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeDocumentLinkParticipant.java`
#### Snippet
```java
public class XIncludeDocumentLinkParticipant implements IDocumentLinkParticipant {

	private static Logger LOGGER = Logger.getLogger(XIncludeDocumentLinkParticipant.class.getName());

	@Override
```

### FieldMayBeFinal
Field `childrenProperties` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/ElementDeclaration.java`
#### Snippet
```java
	private boolean hasCharacterContent;

	private ChildrenProperties childrenProperties;

	private int occurrences;
```

### FieldMayBeFinal
Field `cardinalities` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/ChildrenProperties.java`
#### Snippet
```java
	 * Map which stores cardinality per tag.
	 */
	private Map<String, Cardinality> cardinalities;

	public ChildrenProperties() {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
		XML_MODEL("xml-model"); // xml-model processing instruction

		private String name;

		private GrammarBindingType(String name) {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
public class XMLFileAssociationResolverExtension implements URIResolverExtension, IExternalGrammarLocationProvider {

	private static Logger LOGGER = Logger.getLogger(XMLFileAssociationResolverExtension.class.getName());

	private String rootUri;
```

### FieldMayBeFinal
Field `maxLevel` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	private final boolean canSupportSnippets;
	private final boolean autoCloseTags;
	private int maxLevel;
	private final DOMNode node;

```

### FieldMayBeFinal
Field `RELATED_INFO_FINDERS` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/AggregateRelatedInfoFinder.java`
#### Snippet
```java
public class AggregateRelatedInfoFinder implements IRelatedInfoFinder {

	private static IRelatedInfoFinder[] RELATED_INFO_FINDERS = {
		new XMLSyntaxRelatedInfoFinder()
	};
```

### FieldMayBeFinal
Field `telemetryManager` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DocumentTelemetryParticipant.java`
#### Snippet
```java
public class DocumentTelemetryParticipant implements IDocumentLifecycleParticipant {

	private TelemetryManager telemetryManager;

	private ContentModelManager contentManager;
```

### FieldMayBeFinal
Field `contentManager` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DocumentTelemetryParticipant.java`
#### Snippet
```java
	private TelemetryManager telemetryManager;

	private ContentModelManager contentManager;

	public DocumentTelemetryParticipant(TelemetryManager telemetryManager, ContentModelManager contentManager) {
```

### FieldMayBeFinal
Field `CLOSING_TAG_EXPECTED_HERE` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxRelatedInfoFinder.java`
#### Snippet
```java
public class XMLSyntaxRelatedInfoFinder implements IRelatedInfoFinder {

	private static String CLOSING_TAG_EXPECTED_HERE = "Closing tag expected here";

	@Override
```

### FieldMayBeFinal
Field `errorCode` may be 'final'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadedException.java`
#### Snippet
```java
	}

	private CacheResourceDownloadedError errorCode;

	public CacheResourceDownloadedException(String resourceURI, Path resourceCachePath,  String cause, Throwable e) {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
									if (!firstQuote) {
										firstQuote = true;
										continue;
									} else {
										// second quote, add attribute name
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
							if (Character.isWhitespace(ch)) {
								// whitespace, continue to eat character
								continue;
							} else {
								// the current character is not a whitespace, search the sufix index
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `e` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
					.map(ca -> {
						if (codeActionLiteralSupport) {
							Either<Command, CodeAction> e = Either.forRight(ca);
							return e;
						} else {
```

### UnnecessaryLocalVariable
Local variable `e` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
									ca.getEdit().getDocumentChanges().get(0).getLeft().getEdits());
							Command command = new Command(ca.getTitle(), "_xml.applyCodeAction", arguments);
							Either<Command, CodeAction> e = Either.forLeft(command);
							return e;
						}
```

### UnnecessaryLocalVariable
Local variable `e` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
						.stream() //
						.map(s -> {
							Either<SymbolInformation, DocumentSymbol> e = Either.forRight(s);
							return e;
						}) //
```

### UnnecessaryLocalVariable
Local variable `e` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
				symbols = result.stream() //
						.map(s -> {
							Either<SymbolInformation, DocumentSymbol> e = Either.forLeft(s);
							return e;
						}) //
```

### UnnecessaryLocalVariable
Local variable `range` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkupContentFactory.java`
#### Snippet
```java
		String content = createContent(values, markupKind);
		// Range
		Range range = defaultRange;
		return new Hover(new MarkupContent(markupKind, content), range);
	}
```

### UnnecessaryLocalVariable
Local variable `createAndAddContentEdit` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
		actionsToTake.add(Either.forLeft(new TextDocumentEdit(identifier, Collections.singletonList(te))));

		WorkspaceEdit createAndAddContentEdit = new WorkspaceEdit(actionsToTake);
		return createAndAddContentEdit;
	}
```

### UnnecessaryLocalVariable
Local variable `targetSelectionRange` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	public static LocationLink createLocationLink(Range origin, TargetRange target) {
		Range targetRange = target.getTargetRange();
		Range targetSelectionRange = targetRange;
		return new LocationLink(target.getTargetURI(), targetRange, targetSelectionRange, origin);
	}
```

### UnnecessaryLocalVariable
Local variable `targetSelectionRange` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	public static LocationLink createLocationLink(Range origin, DOMRange target) {
		Range targetRange = XMLPositionUtility.createRange(target);
		Range targetSelectionRange = targetRange;
		DOMDocument targetDocument = target.getOwnerDocument();
		return new LocationLink(targetDocument.getDocumentURI(), targetRange, targetSelectionRange, origin);
```

### UnnecessaryLocalVariable
Local variable `startExpr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
			return replace(line, lastDigitOffset, model, replace, newLine);
		} else if (next == '{') {
			int startExpr = dollarIndex;
			int endExpr = line.indexOf("}", startExpr);
			if (endExpr == -1) {
```

### UnnecessaryLocalVariable
Local variable `from` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMAttributeFormatter.java`
#### Snippet
```java

		if (!alreadyIndented) {
			int from = prevOffset;
			int to = attr.getStart();
			if (isMaxLineWidthSupported() && parentConstraints.getAvailableLineWidth() < 0
```

### UnnecessaryLocalVariable
Local variable `textEdits` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
		format(this.rangeDomDocument);

		List<? extends TextEdit> textEdits = getFormatTextEdit();
		return textEdits;
	}
```

### UnnecessaryLocalVariable
Local variable `elemFromFullDoc` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
		}

		DOMElement elemFromFullDoc = (DOMElement) this.fullDomDocument.findNodeAt(fullOffset);
		return elemFromFullDoc;
	}
```

### UnnecessaryLocalVariable
Local variable `startNodeIndentLevel` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java

		// the starting indent level is the parent's indent level + 1
		int startNodeIndentLevel = getNodeIndentLevel(startNodeParent) + 1;
		return startNodeIndentLevel;
	}
```

### UnnecessaryLocalVariable
Local variable `originNode` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDHighlightingParticipant.java`
#### Snippet
```java

			// highlight <!ELEMENT na|me
			DTDDeclParameter originNode = parameter;
			highlights.add(
					new DocumentHighlight(XMLPositionUtility.createRange(originNode), DocumentHighlightKind.Write));
```

### UnnecessaryLocalVariable
Local variable `targetNode` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDHighlightingParticipant.java`
#### Snippet
```java

			// highlight <!ELEMENT name (chi|ld or <!ATTLIST na|me
			DTDDeclParameter targetNode = parameter;
			highlights
					.add(new DocumentHighlight(XMLPositionUtility.createRange(targetNode), DocumentHighlightKind.Read));
```

### UnnecessaryLocalVariable
Local variable `noNamespaceSchemaLocation` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/xmlmodel/XMLModelSchemaValidator.java`
#### Snippet
```java
				 * <?xml-model href="http://www.docbook.org/xml/5.0/xsd/docbook.xsd"?> <book>
				 **/
				String noNamespaceSchemaLocation = href;
				XMLSchemaLoader.processExternalHints(null, noNamespaceSchemaLocation, fLocationPairs, errorReporter);
			} else {
```

### UnnecessaryLocalVariable
Local variable `originAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDHighlightingParticipant.java`
#### Snippet
```java
		if (bindingType != BindingType.NONE) {
			// It's an origin attribute, highlight the origin and target attribute
			DOMAttr originAttr = attr;
			highlights
					.add(new DocumentHighlight(XMLPositionUtility.createRange(originAttr.getNodeAttrValue().getStart(),
```

### UnnecessaryLocalVariable
Local variable `targetAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDHighlightingParticipant.java`
#### Snippet
```java
			// It's an target attribute, highlight all origin attributes linked to this
			// target attribute
			DOMAttr targetAttr = attr;
			highlights.add(new DocumentHighlight(
					XMLPositionUtility.createRange(targetAttr.getNodeAttrValue().getStart(),
```

### UnnecessaryLocalVariable
Local variable `location` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
					if (originAttribute.getName().equals(elt.getAttribute("name"))) {
						DOMAttr targetAttr = (DOMAttr) elt.getAttributeNode("name");
						LocationLink location = XMLPositionUtility.createLocationLink(originAttribute.getNodeAttrName(),
								targetAttr.getNodeAttrValue());
						return location;
```

### UnnecessaryLocalVariable
Local variable `location` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			if (originElement.getLocalName().equals(elt.getAttribute("name"))) {
				DOMAttr targetAttr = (DOMAttr) elt.getAttributeNode("name");
				LocationLink location = XMLPositionUtility.createLocationLink(originElement,
						targetAttr.getNodeAttrValue());
				return location;
```

### UnnecessaryLocalVariable
Local variable `parseException` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		}
		if (fatalError && !fContinueAfterFatalError) {
			XMLParseException parseException = (exception != null) ? new XMLParseException(location, message, exception)
					: new XMLParseException(location, message);
			throw parseException;
```

### UnnecessaryLocalVariable
Local variable `identifiers` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/contentmodel/CMRelaxNGContentModelProvider.java`
#### Snippet
```java
	@Override
	public Collection<Identifier> getIdentifiers(DOMDocument xmlDocument, String namespaceURI) {
		Collection<Identifier> identifiers = new ArrayList<>();
		return identifiers;
	}
```

### UnnecessaryLocalVariable
Local variable `fullValue` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
	private static void addCompletionItems(String value, ICompletionRequest request, ICompletionResponse response, boolean isInDoctype)
			throws Exception {
		String fullValue = value;
		if (isEmpty(fullValue) && !isInDoctype) {
			return;
```

### UnnecessaryLocalVariable
Local variable `originAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGHighlightingParticipant.java`
#### Snippet
```java
		if (bindingType != BindingType.NONE) {
			// It's an origin attribute, highlight the origin and target attribute
			DOMAttr originAttr = attr;
			highlights
					.add(new DocumentHighlight(XMLPositionUtility.createRange(originAttr.getNodeAttrValue().getStart(),
```

### UnnecessaryLocalVariable
Local variable `targetAttr` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGHighlightingParticipant.java`
#### Snippet
```java
			// It's an target attribute, highlight all origin attributes linked to this
			// target attribute
			DOMAttr targetAttr = attr;
			highlights.add(new DocumentHighlight(
					XMLPositionUtility.createRange(targetAttr.getNodeAttrValue().getStart(),
```

### UnnecessaryLocalVariable
Local variable `insertText` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesCompletionParticipant.java`
#### Snippet
```java
		item.setKind(CompletionItemKind.Keyword);
		item.setInsertTextFormat(InsertTextFormat.PlainText);
		String insertText = entityName;
		item.setFilterText(insertText);
		item.setTextEdit(Either.forLeft(new TextEdit(entityRange, insertText)));
```

### UnnecessaryLocalVariable
Local variable `parent` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
					break;
				}
				Node parent = documentElement;
				addTargetAttrs(parent, targetAttrs);
		}
```

### UnnecessaryLocalVariable
Local variable `parent` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
		}
		Set<String> externalURIS = null;
		Node parent = documentElement;
		NodeList children = parent.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
```

### UnnecessaryLocalVariable
Local variable `namespaceURI` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
			// grammars such as XML schema. Let it take precedence over
			// the external identifier if one exists.
			String namespaceURI = publicId;
			return catalogResolver.resolveIdentifier(namespaceURI, publicId, systemId, baseURI);
		}
```

### UnnecessaryLocalVariable
Local variable `insertText` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
							CompletionItem item = new CompletionItem();
							item.setLabel(value);
							String insertText = value;
							item.setLabel(value);
							item.setKind(CompletionItemKind.Value);
```

### UnnecessaryLocalVariable
Local variable `startTagNameEnd` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
						int tagNameLength = documentElement.getTagName().length();
						int startTagNameStart = documentElement.getStartTagOpenOffset() + 1;
						int startTagNameEnd = startTagNameStart + tagNameLength;
						offset = startTagNameEnd;
					}
```

### UnnecessaryLocalVariable
Local variable `makeSchemaFile` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missinggrammar/AbstractFixMissingGrammarCodeAction.java`
#### Snippet
```java

		// Create code action to create the XSD file with the generated XSD content
		CodeAction makeSchemaFile = CodeActionFactory.createFile(title, "file:///" + missingFilePath, schemaTemplate,
				diagnostic);
		return makeSchemaFile;
```

### UnnecessaryLocalVariable
Local variable `removeAction` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
		Position endPosition = document.positionAt(element.getEnd());
		String contentToRemove = text.substring(element.getStart(), element.getEnd());
		CodeAction removeAction = CodeActionFactory.remove("Remove '" + contentToRemove + "'",
				new Range(startPosition, endPosition), document.getTextDocument(), diagnostic);
		return removeAction;
```

### UnnecessaryLocalVariable
Local variable `autoCloseAction` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	private static CodeAction insertGreaterThanCharacterCodeAction(DOMDocument document, Diagnostic diagnostic,
			Position position) {
		CodeAction autoCloseAction = CodeActionFactory.insert("Close with '>'", position, ">",
				document.getTextDocument(), diagnostic);
		return autoCloseAction;
```

### UnnecessaryLocalVariable
Local variable `xsdWithXmlModelAction` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java
		SharedSettings sharedSettings = request.getSharedSettings();
		TextDocumentEdit xsdWithXMLModelEdit = createXmlModelEdit(fileName, null, document, sharedSettings);
		CodeAction xsdWithXmlModelAction = createGrammarFileAndBindIt(title, fileURI, fileTemplate, xsdWithXMLModelEdit,
				diagnostic);
		return xsdWithXmlModelAction;
```

### UnnecessaryLocalVariable
Local variable `noNamespaceSchemaLocation` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
					// The DOM document has no namespace, we consider that it's the same thing than
					// xsi:noNamespaceSchemaLocation
					String noNamespaceSchemaLocation = xsd;
					reader.setProperty(IExternalGrammarLocationProvider.NO_NAMESPACE_SCHEMA_LOCATION,
							noNamespaceSchemaLocation);
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
		CodeAction insertContentAction = new CodeAction(title);
		insertContentAction.setKind(CodeActionKind.QuickFix);
		insertContentAction.setDiagnostics(Arrays.asList(diagnostic));

		VersionedTextDocumentIdentifier versionedTextDocumentIdentifier = new VersionedTextDocumentIdentifier(
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
		CodeAction insertContentAction = new CodeAction(title);
		insertContentAction.setKind(CodeActionKind.QuickFix);
		insertContentAction.setDiagnostics(Arrays.asList(diagnostic));

		VersionedTextDocumentIdentifier versionedTextDocumentIdentifier = new VersionedTextDocumentIdentifier(
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
		CodeAction insertContentAction = new CodeAction(title);
		insertContentAction.setKind(CodeActionKind.QuickFix);
		insertContentAction.setDiagnostics(Arrays.asList(diagnostic));
		TextDocumentEdit textDocumentEdit = insertEdit(insertText, position, document);
		WorkspaceEdit workspaceEdit = new WorkspaceEdit(Collections.singletonList(Either.forLeft(textDocumentEdit)));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java

		// Renames all elements with oldNamespace
		List<DOMNode> children = Arrays.asList(rootElement);
		return renameElementsNamespace(document, edits, children, oldNamespace, newNamespace);
	}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		if (endElement != null && !tagName.equals(endElement.getTagName())) {
			Range range = XMLPositionUtility.selectEndTagName(endElement);
			return Arrays.asList(new TextEdit(range, tagName));
		}
		return null;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
	private static void createSingleCompletionItemForValue(String value, DOMDocument document,
			ICompletionRequest request, ICompletionResponse response) {
		createCompletionItemsForValues(Arrays.asList(value), document, request, response);
	}

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogCodeLensParticipant.java`
#### Snippet
```java

			Command command = new Command("Register Catalog", ClientCommands.UPDATE_CONFIGURATION,
					Arrays.asList(configurationItemEdit));
			lenses.add(new CodeLens(range, command, null));
		} else {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogCodeLensParticipant.java`
#### Snippet
```java
					documentURI, ConfigurationItemEditType.Delete, ConfigurationItemValueKind.File);
			Command command = new Command("Unregister Catalog", ClientCommands.UPDATE_CONFIGURATION,
					Arrays.asList(configurationItemEdit));
			lenses.add(new CodeLens(range, command, null));
		}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNodeFactory.java`
#### Snippet
```java

		}
		return Arrays.asList(new SearchNode(startNode, endNode, node, prefix, direction));
	}

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMElementDeclaration.java`
#### Snippet
```java

	public static final Collection<CMElementDeclaration> ANY_ELEMENT_DECLARATIONS = Collections
			.unmodifiableCollection(Arrays.asList());

	/**
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeLensParticipant.java`
#### Snippet
```java
		}
		Command command = new Command(title.toString(), canSupportOpenUri ? OPEN_URI : "",
				canSupportOpenUri ? Arrays.asList(grammarURI) : null);
		return new CodeLens(range, command, null);
	}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeLensParticipant.java`
#### Snippet
```java

	private static CodeLens createAssociateLens(String documentURI, String title, Range range) {
		Command command = new Command(title, OPEN_BINDING_WIZARD, Arrays.asList(documentURI));
		return new CodeLens(range, command, null);
	}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/DownloadDisabledResourceCodeAction.java`
#### Snippet
```java

			codeAction.setCommand(command);
			codeAction.setDiagnostics(Arrays.asList(diagnostic));
			codeActions.add(codeAction);
		} catch (Exception e) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java
				String documentURI = document.getDocumentURI();
				String title = "Bind to existing grammar/schema";
				List<Object> commandParams = Arrays.asList(documentURI);
				CodeAction bindWithExistingGrammar = CodeActionFactory.createCommand(title, OPEN_BINDING_WIZARD,
						commandParams, diagnostic);
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`Character.isWhitespace(c) == false` can be simplified to '!Character.isWhitespace(c)'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
		while (index < end) {
			c = value.charAt(index);
			if (Character.isWhitespace(c) == false) {
				return false;
			}
```

### PointlessBooleanExpression
`isInitialDeclaration == false` can be simplified to '!isInitialDeclaration'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMParser.java`
#### Snippet
```java
				case DTDAttlistAttributeName: {
					DTDAttlistDecl attribute = (DTDAttlistDecl) curr;
					if (isInitialDeclaration == false) {
						// All additional declarations are created as new DTDAttlistDecl's
						DTDAttlistDecl child = new DTDAttlistDecl(attribute.getStart(), attribute.getEnd());
```

### PointlessBooleanExpression
`isDeclCompleted == false` can be simplified to '!isDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isDeclCompleted == false) {
				String doctypeName = doctypeName();
				if (!doctypeName.equals("")) {
```

### PointlessBooleanExpression
`isDeclCompleted == true` can be simplified to 'isDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isDeclCompleted == true) {
				state = ScannerState.DTDUnrecognizedParameters;
				return internalScan();
```

### PointlessBooleanExpression
`isDeclCompleted == true` can be simplified to 'isDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isDeclCompleted == true) {
				state = ScannerState.DTDUnrecognizedParameters;
				return internalScan();
```

### PointlessBooleanExpression
`isInitialAttlistDeclCompleted == false` can be simplified to '!isInitialAttlistDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isInitialAttlistDeclCompleted == false
					&& !stream.advanceIfRegExp(Constants.ELEMENT_NAME_REGEX).equals("")) {
				state = ScannerState.DTDAfterAttlistElementName;
```

### PointlessBooleanExpression
`isDeclCompleted == true` can be simplified to 'isDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isDeclCompleted == true) {
				state = ScannerState.DTDUnrecognizedParameters;
				return internalScan();
```

### PointlessBooleanExpression
`isDeclCompleted == true` can be simplified to 'isDeclCompleted'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (isDeclCompleted == true) {
				state = ScannerState.DTDUnrecognizedParameters;
				return internalScan();
```

### PointlessBooleanExpression
`closeBracketAfterSlash == false` can be simplified to '!closeBracketAfterSlash'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java

					// Case: <a/| ...
					if (closeBracketAfterSlash == false) { // no '>' after slash
						if (element1.isStartTagClosed()) { // tag has closing '>', but slash is in incorrect area (not
															// directly before the '>')
```

### PointlessBooleanExpression
`node.isClosed() == false` can be simplified to '!node.isClosed()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java

	private boolean isBalanced(DOMNode node) {
		if (node.isClosed() == false) {
			return false;
		}
```

### PointlessBooleanExpression
`parent.isClosed() == false` can be simplified to '!parent.isClosed()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		DOMNode parent = node.getParentElement();
		while (parent != null && name.equals(parent.getNodeName())) {
			if (parent.isClosed() == false) {
				return false;
			}
```

### PointlessBooleanExpression
`document.hasSchemaInstancePrefix() == false` can be simplified to '!document.hasSchemaInstancePrefix()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
						sharedSettings);
			}
			if (document.hasSchemaInstancePrefix() == false) { // "xmlns:xsi" completion
				createCompletionItem("xmlns:xsi", isSnippetsSupported, generateValue, editRange, XSI_WEBSITE, null,
						XSI_DOC, response, sharedSettings);
```

### PointlessBooleanExpression
`document.hasProlog() == false` can be simplified to '!document.hasProlog()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
			Range editRange, DOMDocument document, SharedSettings sharedSettings) throws BadLocationException {

		if (document.hasProlog() == false) {
			return;
		}
```

### PointlessBooleanExpression
`document.hasProlog() == false` can be simplified to '!document.hasProlog()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
			Range editRange, DOMDocument document) throws BadLocationException {

		if (document.hasProlog() == false) {
			return;
		}
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`(low + high) / 2`: integer division in floating-point context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		}
		while (low < high) {
			int mid = (int) Math.floor((low + high) / 2);
			if (p.apply(array.get(mid))) {
				high = mid;
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPoolWrapper.java`
#### Snippet
```java
	}

	public boolean equals(Object obj) {
		return delegate.equals(obj);
	}
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
		// Copy the list of extensions to avoid ConcurrentModificationError
		List<IXMLExtension> extensionReferences = new ArrayList<>();
		extensions.forEach(extensionReferences::add);
		extensionReferences.forEach(this::unregisterExtension);
	}
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPoolWrapper.java`
#### Snippet
```java
	public void cacheGrammars(String grammarType, Grammar[] grammars) {
		for (Grammar grammar : grammars) {
			cachedGrammars.add(grammar);
		}
		delegate.cacheGrammars(grammarType, grammars);
```

