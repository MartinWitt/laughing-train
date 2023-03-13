# lemminx 
 
# Bad smells
I found 1695 bad smells with 231 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 529 | false |
| BoundedWildcard | 177 | false |
| AssignmentToMethodParameter | 99 | false |
| UnnecessarySuperQualifier | 69 | false |
| DataFlowIssue | 65 | false |
| MissortedModifiers | 62 | false |
| UnusedAssignment | 58 | false |
| UnnecessaryModifier | 57 | true |
| ConstantValue | 55 | false |
| UnnecessaryFullyQualifiedName | 38 | false |
| UnnecessaryLocalVariable | 36 | true |
| CodeBlock2Expr | 32 | true |
| UtilityClassWithoutPrivateConstructor | 30 | true |
| SizeReplaceableByIsEmpty | 25 | true |
| StringOperationCanBeSimplified | 25 | false |
| UnnecessarySemicolon | 22 | false |
| RedundantFieldInitialization | 20 | false |
| StringEqualsEmptyString | 18 | false |
| CatchMayIgnoreException | 17 | false |
| DuplicateBranchesInSwitch | 15 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 15 | false |
| NonProtectedConstructorInAbstractClass | 15 | true |
| PointlessBooleanExpression | 14 | true |
| DynamicRegexReplaceableByCompiledPattern | 11 | false |
| StringBufferReplaceableByString | 10 | false |
| UnstableApiUsage | 10 | false |
| CommentedOutCode | 9 | false |
| RegExpRedundantEscape | 9 | false |
| UnnecessaryStringEscape | 8 | true |
| RegExpSimplifiable | 8 | false |
| ReplaceAssignmentWithOperatorAssignment | 8 | false |
| NonStaticFinalLogger | 7 | false |
| SimplifyStreamApiCallChains | 7 | false |
| RedundantMethodOverride | 6 | false |
| AssignmentToForLoopParameter | 6 | false |
| EmptyStatementBody | 5 | false |
| UNUSED_IMPORT | 5 | false |
| UnnecessaryReturn | 4 | true |
| UnnecessaryUnboxing | 4 | false |
| EqualsAndHashcode | 4 | false |
| Convert2MethodRef | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| MismatchedJavadocCode | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| StringEquality | 3 | false |
| NestedAssignment | 3 | false |
| EmptyMethod | 3 | false |
| InstanceofCatchParameter | 3 | false |
| RedundantLengthCheck | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| ObsoleteCollection | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| RegExpRedundantNestedCharacterClass | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| DuplicateThrows | 2 | false |
| ComparatorCombinators | 2 | false |
| RedundantCollectionOperation | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| SystemOutErr | 2 | false |
| Java8MapApi | 2 | false |
| UnnecessaryContinue | 2 | false |
| UseBulkOperation | 2 | false |
| StaticCallOnSubclass | 1 | false |
| Java8ListReplaceAll | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| IgnoreResultOfCall | 1 | false |
| InfiniteLoopStatement | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonFinalFieldOfException | 1 | false |
| FuseStreamOperations | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ArrayObjectsEquals | 1 | false |
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

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (code) { case cos_all_limited_2: { String nameValue = getString(arguments[1]); DOMNod...` statement on enum type 'org.eclipse.lemminx.extensions.xsd.participants.XSDErrorCode' misses case 'src_annotation'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
switch (code) {
		case cos_all_limited_2: {
			String nameValue = getString(arguments[1]);
			DOMNode parent = document.findNodeAt(offset);
			List<DOMNode> children = parent.getChildrenWithAttributeValue("name", nameValue);

			if (children.isEmpty()) {
				return XMLPositionUtility.selectStartTagName(offset, document);
			}

			offset = children.get(0).getStart() + 1;
			return XMLPositionUtility.selectAttributeValueAt("maxOccurs", offset, document);
		}
		case ct_props_correct_3: {
			String attrValue = getString(arguments[0]);
			if (attrValue.charAt(0) == ':') {
				attrValue = attrValue.substring(1);
			}
			return XMLPositionUtility.selectAttributeValueFromGivenValue(attrValue, offset, document);
		}
		case p_props_correct_2_1:
			return XMLPositionUtility.selectAttributeFromGivenNameAt("minOccurs", offset, document);
		case s4s_elt_invalid_content_1:
		case s4s_elt_must_match_1:
		case s4s_elt_must_match_2:
		case s4s_att_must_appear:
		case s4s_elt_invalid_content_2:
		case s4s_elt_invalid_content_3:
		case src_element_2_1:
		case src_element_3:
		case src_import_1_2:
			return XMLPositionUtility.selectStartTagName(offset, document);
		case s4s_att_not_allowed: {
			String attrName = getString(arguments[1]);
			return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
		}
		case s4s_att_invalid_value: {
			String attrName = getString(arguments[1]);
			return XMLPositionUtility.selectAttributeValueAt(attrName, offset, document);
		}
		case s4s_elt_character:
			return XMLPositionUtility.selectContent(offset, document);
		case sch_props_correct_2: {
			String argument = getString(arguments[0]);
			String attrName = argument.substring(argument.indexOf(",") + 1);
			return XMLPositionUtility.selectAttributeValueFromGivenValue(attrName, offset, document);
		}
		case src_ct_1:
			return XMLPositionUtility.selectAttributeValueAt("base", offset, document);
		case src_resolve_4_2: {
			String attrValue = getString(arguments[2]);
			return XMLPositionUtility.selectAttributeValueByGivenValueAt(attrValue, offset, document);
		}
		case src_resolve: {
			String attrValue = getString(arguments[0]);
			return XMLPositionUtility.selectAttributeValueByGivenValueAt(attrValue, offset, document);
		}
		case schema_reference_4: {
			return XMLPositionUtility.selectAttributeValueAt(XSDUtils.SCHEMA_LOCATION_ATTR, offset, true, document);
		}
		case EmptyTargetNamespace:
			return XMLPositionUtility.selectAttributeValueAt(XSDUtils.TARGET_NAMESPACE_ATTR, offset, document);
		case src_import_3_1: {
			// If the imported file of `schemaLocation` contains at least a doctype and
			// 'xs:schema' with at least one `xs:element`,
			// then the `xs:import` line will be highlighted, otherwise the `xs:schema` line
			// will be highlighted
			DOMNode elementHighlighted = document.findNodeAt(offset);
			if (elementHighlighted.getNodeName().equals(XSDUtils.XS_SCHEMA_TAG)) { // `xs:schema` line is highlighted
				return XMLPositionUtility.selectChildNodeAttributeValueFromGivenNameAt(XSDUtils.XS_IMPORT_TAG,
						XSDUtils.NAMESPACE_ATTR, offset, document);
			} else { // `xs:import` line is highlighted
				return XMLPositionUtility.selectAttributeValueAt(XSDUtils.NAMESPACE_ATTR, offset, document);
			}
		}
		case src_import_3_2:
			return XMLPositionUtility.selectChildNodeAttributeValueFromGivenNameAt(XSDUti
```

### EnumSwitchStatementWhichMissesCases
`switch (rngCode) { // XML Validation based on RNG, RNC errors case unknown_element: case o...` statement on enum type 'org.eclipse.lemminx.extensions.relaxng.xml.validator.RelaxNGErrorCode' misses cases: ...
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
switch (rngCode) {

			// XML Validation based on RNG, RNC errors
			case unknown_element:
			case out_of_context_element:
			case element_not_allowed_yet:
			case incomplete_element_required_elements_missing_expected:
			case unexpected_element_required_element_missing:
			case incomplete_element_required_element_missing:
			case required_attributes_missing_expected:
			case required_attributes_missing:
			case required_attribute_missing: {
				return XMLPositionUtility.selectStartTagName(offset, document);
			}
			case no_attributes_allowed:
			case invalid_attribute_name: {
				String attrName = (String) arguments[0];
				return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
			}
			case invalid_attribute_value: {
				String attrName = (String) arguments[0];
				return XMLPositionUtility.selectAttributeValueAt(attrName, offset, document);
			}
			case RelaxNGNotFound: {
				// Check if RelaxNG location is declared with xml-model/@href
				// ex : <xml-model href=""addressBook.rnc" [
				String hrefLocation = (String) arguments[1];
				DOMRange locationRange = XMLModelUtils.getHrefNode(document, hrefLocation);
				if (locationRange != null) {
					return XMLPositionUtility.createRange(locationRange);
				}
			}

			// RNG + RNC errors
			case missing_start_element: {
				DOMNode node = document.findNodeAt(offset);
				if (node != null) {
					if (node.isElement() && RelaxNGUtils.GRAMMAR_TAG.equals(((DOMElement) node).getLocalName())) {
						return XMLPositionUtility.selectStartTagName((DOMElement) node);
					}
				}
			}
			case reference_to_undefined: {
				String refName = (String) arguments[0];
				// Find the first ref which have the same attribute name than refName
				DOMAttr refAttrName = findRefByName(document, refName);
				if (refAttrName != null) {
					return XMLPositionUtility.selectAttributeValue(refAttrName);
				}
			}
			case duplicate_define: {
				String attrValue = (String) arguments[0];
				return XMLPositionUtility.selectAttributeValueFromGivenValue(attrValue, offset, document);
			}

			case duplicate_start: {

			}
			case unrecognized_datatype: {
				// <element name="email">
				// <data type="stringXXX" />
				// </element>
				DOMNode node = document.findNodeAt(offset);
				if (node != null && node.isElement()) {
					DOMElement data = (DOMElement) node;
					DOMAttr attr = data.getAttributeNode("type");
					if (attr != null) {
						return XMLPositionUtility.selectAttributeValue(attr);
					}
				}
			}

			// RNG errors

			case expected_pattern: {
				return XMLPositionUtility.selectStartTagName(offset, document);
			}
			case illegal_name_attribute: {
				return XMLPositionUtility.selectAttributeNameFromGivenNameAt(RelaxNGUtils.NAME_ATTR, offset, document);
			}
			case illegal_attribute_ignored: {
				String attrName = (String) arguments[0];
				return XMLPositionUtility.selectAttributeNameFromGivenNameAt(attrName, offset, document);
			}
			case invalid_ncname: {
				DOMNode node = document.findNodeAt(offset);
				if (node != null && node.isElement()
						&& RelaxNGUtils.NAME_ATTR.equals(((DOMElement) node).getLocalName())) {
					// <element><name>::::</name></element>
					DOMElement name = (DOMElement) node;
					boolean hasText = DOMUtils.containsTextOnly(name);
					return hasText ? XMLPositionUtility.selectText((DOMText) name.getFirstChild())
							: XMLPositionUtility.selectStartTagName((DOMElement) node);
				}
				// <element name="::::"></element>
				return XMLPositionUtility.selectAttributeValueAt(RelaxNGUtils.NAME_ATTR, offset, false, document);
			}
			case missing_children:
			case missing_name_attribute:
			case missing_name_class:
			case missing_type_attribute: {
				DOMNode node = document.findNodeAt(offset);
				if (node != null && nod
```

## RuleId[id=StringEquality]
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
String values are compared using `==`, not 'equals()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
	public final String getLineDelimiter(int line) throws BadLocationException {
		Node node = nodeByLine(line);
		return node.delimiter == NO_DELIM ? null : node.delimiter;
	}

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
	public boolean isResolveDocumentationSupported();

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
	private final String code;

	private XSDErrorCode() {
		this(null);
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
	private final String code;

	private RelaxNGErrorCode() {
		this(null);
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
		private final String label;

		private EntityOriginType(String label) {
			this.label = label;
		}
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
Modifier `static` is redundant for inner enums
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/EntitiesDocumentationUtils.java`
#### Snippet
```java
public class EntitiesDocumentationUtils {

	public static enum EntityOriginType {

		PREDEFINED("Predefined"), LOCAL("Local"), EXTERNAL("External");
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
	private final String code;

	private XIncludeErrorCode() {
		this(null);
	}
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
Modifier `public` is redundant for interface members
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelProvider.java`
#### Snippet
```java
public interface ContentModelProvider {

	public class Identifier {

		private final String publicId;
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	private final String code;

	private XMLSchemaErrorCode() {
		this(null);
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadingException.java`
#### Snippet
```java
		private final String rawMessage;

		private CacheResourceDownloadingError(String rawMessage) {
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

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `findNodeOrAttrAt()` declared in class 'org.eclipse.lemminx.dom.DOMNode' but referenced via subclass 'org.eclipse.lemminx.dom.DOMDocument'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java

	private DOMNode getNodeAtOffset(DOMDocument xmlDocument, int offset) {
		DOMNode node = DOMDocument.findNodeOrAttrAt(xmlDocument, offset);
		if (node.isAttribute()) {
			DOMAttr attr = (DOMAttr) node;
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
		while (this.position + ch.length <= this.len) {
			int i = 0;
			for (; i < ch.length && peekChar(i) == ch[i]; i++) {
			}
			if (i == ch.length) {
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
		}

		// Assert.isTrue(node.offset == offLen[0]);
		// Assert.isTrue(node.line == offLen[1]);

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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			// XSCMValidator#oneTransition has updated the states flag.
			// Collect the next valid elements according the XML Schema constraints
			Vector<?> result = validator.whatCanGoHere(states);
			if (result.isEmpty()) {
				return Collections.emptyList();
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
		}
		// Track the imported grammars
		Vector<?> importedGrammars = grammar.getImportedGrammars();
		if (importedGrammars != null) {
			for (Object importedGrammar : importedGrammars) {
```

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDDocumentation.java`
#### Snippet
```java
	private static void convertToPlainText(List<String> list) {
		HtmlToPlainText formatter = new HtmlToPlainText();
		for (int i = 0; i < list.size(); i++) {
			String curr = list.get(i);
			list.set(i, formatter.getPlainText(Jsoup.parse(curr)));
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`parameters.size() > 0` can be replaced with '!parameters.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java

	public void updateLastParameterEnd(int end) {
		if (parameters != null && parameters.size() > 0) {
			DTDDeclParameter last = parameters.get(parameters.size() - 1);
			last.end = end;
```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java

	private static String getPrefixedName(String prefix, String localName) {
		return prefix != null && prefix.length() > 0 ? prefix + ":" + localName : localName; //$NON-NLS-1$
	}

```

### SizeReplaceableByIsEmpty
`this.children.size() > 0` can be replaced with '!this.children.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public DOMNode getLastChild() {
		return this.children != null && this.children.size() > 0 ? this.children.get(this.children.size() - 1) : null;
	}

```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		result.append(", closed: ");
		result.append(closed);
		if (children != null && children.size() > 0) {
			result.append(", \n");
			for (int i = 0; i < indent + 1; i++) {
```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public DOMNode getFirstChild() {
		return this.children != null && children.size() > 0 ? this.children.get(0) : null;
	}

```

### SizeReplaceableByIsEmpty
`attributeNodes.size() != 0` can be replaced with '!attributeNodes.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public boolean hasAttributes() {
		return attributeNodes != null && attributeNodes.size() != 0;
	}

```

### SizeReplaceableByIsEmpty
`getTokenTextFromOffset(offset).length() == 0` can be replaced with 'getTokenTextFromOffset(offset).isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
					state = getWithinContentState();
				}
				if (getTokenTextFromOffset(offset).length() == 0) {
					return finishToken(offset, TokenType.PIEnd);
				}
```

### SizeReplaceableByIsEmpty
`changes.size() > 0` can be replaced with '!changes.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
			// see
			// https://github.com/Microsoft/vscode-languageserver-node/blob/master/server/src/main.ts
			TextDocumentContentChangeEvent last = changes.size() > 0 ? changes.get(changes.size() - 1) : null;
			if (last != null) {
				setText(last.getText());
```

### SizeReplaceableByIsEmpty
`childNodes.size() == 0` can be replaced with 'childNodes.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			DOMDocument document) {
		List<DOMNode> childNodes = document.findNodeAt(offset).getChildren();
		if (childNodes.size() == 0) {
			return null;
		}
```

### SizeReplaceableByIsEmpty
`fLines.size() == 0` can be replaced with 'fLines.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java
	private int findLine(int offset) {

		if (fLines.size() == 0) {
			return -1;
		}
```

### SizeReplaceableByIsEmpty
`completionParticipants.size() > 0` can be replaced with '!completionParticipants.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		Collection<ICompletionParticipant> completionParticipants = getCompletionParticipants();

		if (completionParticipants.size() > 0) {
			try {
				Range replaceRange = getReplaceRange(valueContentStart, valueContentEnd, completionRequest);
```

### SizeReplaceableByIsEmpty
`currentTag.length() > 0` can be replaced with '!currentTag.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					case StartTagClose:
						if (offset <= scanner.getTokenEnd()) {
							if (currentTag != null && currentTag.length() > 0) {
								collectInsideContent(completionRequest, completionResponse, cancelChecker);
								return completionResponse;
```

### SizeReplaceableByIsEmpty
`currentTag.length() > 0` can be replaced with '!currentTag.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					case StartTagSelfClose:
						if (offset <= scanner.getTokenEnd()) {
							if (currentTag != null && currentTag.length() > 0
									&& xmlDocument.getText().charAt(offset - 1) == '>') { // if the actual character
																							// typed
```

### SizeReplaceableByIsEmpty
`currentTag.length() > 0` can be replaced with '!currentTag.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					case EndTagClose:
						if (offset <= scanner.getTokenEnd()) {
							if (currentTag != null && currentTag.length() > 0) {
								collectInsideContent(completionRequest, completionResponse, cancelChecker);
								return completionResponse;
```

### SizeReplaceableByIsEmpty
`completionParticipants.size() > 0` can be replaced with '!completionParticipants.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java

		Collection<ICompletionParticipant> completionParticipants = getCompletionParticipants();
		if (completionParticipants.size() > 0) {
			try {
				Range replaceRange = getReplaceRange(valueStart, valueEnd, completionRequest);
```

### SizeReplaceableByIsEmpty
`content.length() > 0` can be replaced with '!content.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java

		String content = processingInstruction.getData();
		if (content.length() > 0) {
			xml.addContentPI(content);
		} else {
```

### SizeReplaceableByIsEmpty
`this.documentation.size() > 0` can be replaced with '!this.documentation.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDDocumentation.java`
#### Snippet
```java
	 */
	private boolean prependTitleCheck() {
		return this.documentation.size() > 0 && this.appinfo.size() > 0
				&& strategy == SchemaDocumentationType.all;
	}
```

### SizeReplaceableByIsEmpty
`this.appinfo.size() > 0` can be replaced with '!this.appinfo.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDDocumentation.java`
#### Snippet
```java
	 */
	private boolean prependTitleCheck() {
		return this.documentation.size() > 0 && this.appinfo.size() > 0
				&& strategy == SchemaDocumentationType.all;
	}
```

### SizeReplaceableByIsEmpty
`documentation.size() > 0` can be replaced with '!documentation.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDAnnotationModel.java`
#### Snippet
```java
				if (annotationModel != null) {
					List<String> documentation = annotationModel.getDocumentation();
					if (documentation.size() > 0) {
						result.addAll(documentation);
					} else {
```

### SizeReplaceableByIsEmpty
`invalidCatalogs.size() > 0` can be replaced with '!invalidCatalogs.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogPlugin.java`
#### Snippet
```java
		}).collect(Collectors.toSet());

		if (invalidCatalogs.size() > 0) {
			this.pathWarner.onInvalidFilePath(invalidCatalogs, PathFeature.CATALOGS);
		} else {
```

### SizeReplaceableByIsEmpty
`relatedInformation.size() > 0` can be replaced with '!relatedInformation.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
			List<DiagnosticRelatedInformation> relatedInformation) {
		Diagnostic d = new Diagnostic(adjustedRange, message, severity, source, code);
		if (hasRelatedInfo && relatedInformation != null && relatedInformation.size() > 0) {
			d.setRelatedInformation(relatedInformation);
		}
```

### SizeReplaceableByIsEmpty
`fullValue.length() == 0` can be replaced with 'fullValue.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
		int valuePathStartOffset = xmlDocument.offsetAt(request.getReplaceRange().getStart());
		int endPathOffset = request.getOffset(); // offset after the typed character
		int startPathOffset = (fullValue.length() == 0 ? 0 : StringUtils.getOffsetAfterWhitespace(fullValue, endPathOffset - valuePathStartOffset))
				+ valuePathStartOffset; // first character of URI
		Range filePathRange = XMLPositionUtility.createRange(startPathOffset, endPathOffset, xmlDocument);
```

### SizeReplaceableByIsEmpty
`valuePath.length() == 0` can be replaced with 'valuePath.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
			// ex: valuePath="/C:/fold"
			valuePath = FilesUtils.removeFileScheme(valuePath);
			if (valuePath.length() == 0 || valuePath.charAt(0) != '/') {
				// use of 'file://' and the path was not absolute
				return;
```

### SizeReplaceableByIsEmpty
`xmlCatalogFiles.size() > 0` can be replaced with '!xmlCatalogFiles.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
				}
			}
			if (xmlCatalogFiles.size() > 0) {
				LSPXMLCatalogResolver catalogResolver = new LSPXMLCatalogResolver(
						xmlCatalogFiles.toArray(new String[0]));
```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
		snippetIndex = generate(attributes, level, snippetIndex, xml, elementDeclaration.getLocalName());
		// Elements children
		if (children.size() > 0) {
			xml.closeStartElement();
			if ((level < maxLevel)) {
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
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "While performing Completions the provided offset was a BadLocation", e);
			return;
		}
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/PossibleRequiredElementsFunction.java`
#### Snippet
```java
	private final Set<String> requiredElementNames;

	public PossibleRequiredElementsFunction(Set<String> requiredElementNames) {
		this.requiredElementNames = requiredElementNames;
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/MyRequiredElementsFunction.java`
#### Snippet
```java
	private final Set<String> requiredElementNames;

	public MyRequiredElementsFunction(Set<String> requiredElementNames) {
		this.requiredElementNames = requiredElementNames;
	}
```

### BoundedWildcard
Can generalize to `? super DTDDeclParameter`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java
	 * @param collector the collector to collect parameters.
	 */
	public void collectParameters(DTDDeclParameter target, BiConsumer<DTDDeclParameter, DTDDeclParameter> collector) {
		DTDDeclParameter name = getNameParameter();
		if (name == null) {
```

### BoundedWildcard
Can generalize to `? super DTDDeclParameter`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java
	 * @param collector the collector to collect parameters.
	 */
	public void collectParameters(DTDDeclParameter target, BiConsumer<DTDDeclParameter, DTDDeclParameter> collector) {
		DTDDeclParameter name = getNameParameter();
		if (name == null) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java
	}

	public int advanceWhileChar(Predicate<Integer> condition) {
		int posNow = this.position;
		while (this.position < this.len && condition.test(peekChar())) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 *          full fills the given function.
	 */
	private static <T> int findFirst(List<T> array, Function<T, Boolean> p) {
		int low = 0, high = array.size();
		if (high == 0) {
```

### BoundedWildcard
Can generalize to `? super T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 *          full fills the given function.
	 */
	private static <T> int findFirst(List<T> array, Function<T, Boolean> p) {
		int low = 0, high = array.size();
		if (high == 0) {
```

### BoundedWildcard
Can generalize to `? extends MarkupContent`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkupContentFactory.java`
#### Snippet
```java
	 * @return the content.
	 */
	private static String createContent(List<MarkupContent> values, String markupKind) {
		StringBuilder content = new StringBuilder();
		for (MarkupContent value : values) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathAttributeMatcher.java`
#### Snippet
```java
	 * (org.w3c.dom.Node, java.util.Collection)
	 */
	public boolean match(Node testNode, Collection<String> wildcardValues) {
		if (testNode.getNodeType() == Node.ELEMENT_NODE) {
			// Node to test is element
```

### BoundedWildcard
Can generalize to `? super Character`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *         and -1 if no word.
	 */
	public static int findEndWord(String text, int offset, int max, Predicate<Character> isValidChar) {
		if (offset < 0 || offset >= text.length() || !isValidChar.test(text.charAt(offset))) {
			return -1;
```

### BoundedWildcard
Can generalize to `? super Character`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
	 *         to the given <code>min</code> and -1 if no word.
	 */
	public static int findStartWord(String text, int offset, int min, Predicate<Character> isValidChar) {
		if (offset < 0 || offset >= text.length() || !isValidChar.test(text.charAt(offset))) {
			return -1;
```

### BoundedWildcard
Can generalize to `? extends TextDocumentContentChangeEvent`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
	 * @param changes the text document changes.
	 */
	public void update(List<TextDocumentContentChangeEvent> changes) {
		if (changes.size() < 1) {
			// no changes, ignore it.
```

### BoundedWildcard
Can generalize to `? extends DOMNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	}

	private static DOMNode findUnclosedChildNode(String childTag, List<DOMNode> children) {
		for (DOMNode child : children) {
			if (child.isElement() && childTag != null && childTag.equals(((DOMElement) child).getTagName())
```

### BoundedWildcard
Can generalize to `? extends DOMNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	}

	private static DOMNode findUnclosedChildNode(List<DOMNode> children) {
		for (DOMNode child : children) {
			if (!child.isClosed()) {
```

### BoundedWildcard
Can generalize to `? super DOMDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java

		@Override
		public void collectDocumentToValidate(Predicate<DOMDocument> validateDocumentPredicate) {
			documents.all().stream().forEach(document -> {
				DOMDocument xmlDocument = document.getModel();
```

### BoundedWildcard
Can generalize to `? extends ModelTextDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	}

	private void triggerValidationFor(Collection<ModelTextDocument<DOMDocument>> documents) {
		if (!documents.isEmpty()) {
			xmlLanguageServer.schedule(() -> {
```

### BoundedWildcard
Can generalize to `? super ModelTextDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelValidatorDelayer.java`
#### Snippet
```java
	}

	public ModelValidatorDelayer(ScheduledExecutorService executorService, Consumer<ModelTextDocument<T>> validator,
			long validationDelayMs) {
		this.executorService = executorService;
```

### BoundedWildcard
Can generalize to `? super TextDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	}

	public ModelTextDocument(String text, String uri, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(text, uri);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	}

	public ModelTextDocument(String text, String uri, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(text, uri);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	}

	public ModelTextDocument(String text, String uri, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(text, uri);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? super TextDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	private T model;

	public ModelTextDocument(TextDocumentItem document, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(document);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	private T model;

	public ModelTextDocument(TextDocumentItem document, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(document);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? extends T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	private T model;

	public ModelTextDocument(TextDocumentItem document, BiFunction<TextDocument, CancelChecker, T> parse) {
		super(document);
		this.parse = parse;
```

### BoundedWildcard
Can generalize to `? extends Range`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java

	public static CodeAction replaceAt(String title, String replaceText, TextDocumentItem document,
			Diagnostic diagnostic, Collection<Range> ranges) {
		CodeAction insertContentAction = new CodeAction(title);
		insertContentAction.setKind(CodeActionKind.QuickFix);
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDefinition.java`
#### Snippet
```java
	 * @param locations the locations
	 */
	private static void findStartEndTagDefinition(IDefinitionRequest request, List<LocationLink> locations) {
		DOMNode node = request.getNode();
		if (node != null && node.isElement()) {
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	}

	private static <R> CompletableFuture<R> computeAsyncCompose(Function<CancelChecker, CompletableFuture<R>> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenComposeAsync(code);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	}

	private static <R> CompletableFuture<R> computeAsyncCompose(Function<CancelChecker, CompletableFuture<R>> code) {
		CompletableFuture<CancelChecker> start = new CompletableFuture<>();
		CompletableFuture<R> result = start.thenComposeAsync(code);
```

### BoundedWildcard
Can generalize to `? super T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsync(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, R> code) {
		return CompletableFutures.computeAsync(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsync(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, R> code) {
		return CompletableFutures.computeAsync(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? extends R`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsync(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, R> code) {
		return CompletableFutures.computeAsync(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? super T`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsyncCompose(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, CompletableFuture<R>> code) {
		return computeAsyncCompose(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? super CancelChecker`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsyncCompose(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, CompletableFuture<R>> code) {
		return computeAsyncCompose(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
	 */
	public <R> CompletableFuture<R> computeModelAsyncCompose(TextDocumentIdentifier documentIdentifier,
			BiFunction<T, CancelChecker, CompletableFuture<R>> code) {
		return computeAsyncCompose(cancelChecker -> {
			// Get or parse the model.
```

### BoundedWildcard
Can generalize to `? super ISnippetContext`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/Snippet.java`
#### Snippet
```java
	}

	public boolean match(BiPredicate<ISnippetContext<?>, Map<String, String>> contextFilter,
			Map<String, String> model) {
		if (!hasContext()) {
```

### BoundedWildcard
Can generalize to `? super Map`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/Snippet.java`
#### Snippet
```java
	}

	public boolean match(BiPredicate<ISnippetContext<?>, Map<String, String>> contextFilter,
			Map<String, String> model) {
		if (!hasContext()) {
```

### BoundedWildcard
Can generalize to `? extends Position`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
	 *         XML document
	 */
	public List<SelectionRange> getSelectionRanges(DOMDocument xmlDocument, List<Position> positions,
			CancelChecker cancelChecker) {
		List<SelectionRange> selectionRanges = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super DocumentHighlight`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHighlighting.java`
#### Snippet
```java
	}

	private static void fillHighlightsList(Range startTagRange, Range endTagRange, List<DocumentHighlight> result) {
		if (startTagRange != null) {
			result.add(new DocumentHighlight(startTagRange, DocumentHighlightKind.Read));
```

### BoundedWildcard
Can generalize to `? super SymbolInformation`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
	}

	private void findSymbolInformations(DOMNode node, String container, List<SymbolInformation> symbols,
			boolean ignoreNode, XMLSymbolFilter filter, boolean hasFilterForAttr, CancelChecker cancelChecker)
			throws BadLocationException {
```

### BoundedWildcard
Can generalize to `? super DOMNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
	}

	private void findDocumentSymbols(DOMNode node, DocumentSymbolsResult symbols, List<DOMNode> nodesToIgnore,
			XMLSymbolFilter filter, boolean hasFilterForAttr, CancelChecker cancelChecker) throws BadLocationException {
		if (!isNodeSymbol(node, filter)) {
```

### BoundedWildcard
Can generalize to `? extends Hover`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
	 * @return the aggregated LSP hover from the given hover list.
	 */
	private static Hover mergeHover(List<Hover> hovers, Range defaultRange) {
		if (hovers.isEmpty()) {
			// no hover
```

### BoundedWildcard
Can generalize to `? extends DOMNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	 */
	private static List<TextEdit> renameElementsNamespace(DOMDocument document, List<TextEdit> edits,
			List<DOMNode> elements, String oldNamespace, String newNamespace) {
		int oldNamespaceLength = oldNamespace.length();
		for (DOMNode node : elements) {
```

### BoundedWildcard
Can generalize to `? super PublishDiagnosticsParams`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java

	public CompletableFuture<Path> publishDiagnostics(DOMDocument xmlDocument,
			Consumer<PublishDiagnosticsParams> publishDiagnostics, Consumer<TextDocument> triggerValidation,
			XMLValidationRootSettings validationSettings, Map<String, Object> validationArgs,
			CancelChecker cancelChecker) {
```

### BoundedWildcard
Can generalize to `? super TextDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java

	public CompletableFuture<Path> publishDiagnostics(DOMDocument xmlDocument,
			Consumer<PublishDiagnosticsParams> publishDiagnostics, Consumer<TextDocument> triggerValidation,
			XMLValidationRootSettings validationSettings, Map<String, Object> validationArgs,
			CancelChecker cancelChecker) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/DocTypeSnippetContext.java`
#### Snippet
```java

	@Override
	public boolean isMatch(ICompletionRequest request, Map<String, String> model) {
		DOMDocument document = request.getXMLDocument();
		DOMElement documentElement = document.getDocumentElement();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/snippets/DocTypeSnippetContext.java`
#### Snippet
```java

	@Override
	public boolean isMatch(ICompletionRequest request, Map<String, String> model) {
		DOMDocument document = request.getXMLDocument();
		DOMElement documentElement = document.getDocumentElement();
```

### BoundedWildcard
Can generalize to `? extends FoldingRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
	}

	private static List<FoldingRange> limitRanges(List<FoldingRange> ranges, int rangeLimit) {
		Collections.sort(ranges, (r1, r2) -> {
			int diff = r1.getStartLine() - r2.getStartLine();
```

### BoundedWildcard
Can generalize to `? super FoldingRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
	}

	private static int addRange(FoldingRange range, List<FoldingRange> ranges) {
		ranges.add(range);
		return range.getStartLine();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
	}

	private static void setNestingLevel(int index, int level, Map<Integer, Integer> nestingLevels,
			Map<Integer, Integer> nestingLevelCounts) {
		nestingLevels.put(index, level);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
	}

	private static void setNestingLevel(int index, int level, Map<Integer, Integer> nestingLevels,
			Map<Integer, Integer> nestingLevelCounts) {
		nestingLevels.put(index, level);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java

	private static void setNestingLevel(int index, int level, Map<Integer, Integer> nestingLevels,
			Map<Integer, Integer> nestingLevelCounts) {
		nestingLevels.put(index, level);
		if (level < 30) {
```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
	}

	void createTextEditIfNeeded(int from, int to, String expectedContent, List<TextEdit> edits) {
		TextEdit edit = TextEditUtils.createTextEditIfNeeded(from, to, expectedContent, textDocument);
		if (edit != null) {
```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
	}

	private void trimFinalNewlines(boolean insertFinalNewline, List<TextEdit> edits) {
		String xml = textDocument.getText();
		int end = xml.length() - 1;
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDDefinitionParticipant.java`
#### Snippet
```java

	@Override
	protected void doFindDefinition(IDefinitionRequest request, List<LocationLink> locations,
			CancelChecker cancelChecker) {
		DOMNode node = request.getNode();
```

### BoundedWildcard
Can generalize to `? super Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDReferenceParticipant.java`
#### Snippet
```java
	@Override
	protected void findReferences(DOMNode node, Position position, int offset, ReferenceContext context,
			List<Location> locations, CancelChecker cancelChecker) {
		// DTD reference works only when references is done on an <!ELEMENT name
		if (!node.isDTDElementDecl()) {
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDDocumentLinkParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentLinks(DOMDocument document, List<DocumentLink> links) {
		// Document link for DTD
		DOMDocumentType docType = document.getDoctype();
```

### BoundedWildcard
Can generalize to `? super DocumentHighlight`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDHighlightingParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentHighlights(DOMNode node, Position position, int offset, List<DocumentHighlight> highlights,
			CancelChecker cancelChecker) {
		boolean findReferences = false;
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDCodeLensParticipant.java`
#### Snippet
```java

	@Override
	public void doCodeLens(ICodeLensRequest request, List<CodeLens> lenses, CancelChecker cancelChecker) {
		DOMDocument xmlDocument = request.getDocument();
		// DTD CodeLens is applicable only for DTD or XML which defines a DOCTYPE
```

### BoundedWildcard
Can generalize to `? super CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
	}

	void collectElementsDeclaration(String elementName, List<CMElementDeclaration> elements) {
		if (hierarchiesMap == null) {
			return;
```

### BoundedWildcard
Can generalize to `? super CMAttributeDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
	}

	void collectAttributesDeclaration(CMDTDElementDeclaration elementDecl, List<CMAttributeDeclaration> attributes) {
		int elementDeclIndex = grammar.getElementDeclIndex(elementDecl.name);
		int index = grammar.getFirstAttributeDeclIndex(elementDeclIndex);
```

### BoundedWildcard
Can generalize to `? super DTDDeclNode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
	}

	private static void addTargetNode(DTDDeclNode referencedNode, List<DTDDeclNode> referencedNodes) {
		if (referencedNode.isDTDElementDecl()) {
			// Add only <!ELEMENT which defines a name.
```

### BoundedWildcard
Can generalize to `? super DTDGrammar`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
	}

	private static void updateTracker(DTDGrammar grammar, Set<DTDGrammar> trackedGrammars,
			FilesChangedTracker tracker) {
		if (grammar == null || trackedGrammars.contains(grammar)) {
```

### BoundedWildcard
Can generalize to `? super DTDDeclParameter`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
	 */
	public static void searchDTDTargetElementDecl(DTDDeclParameter originNameNode, boolean matchName,
			Consumer<DTDDeclParameter> collector) {
		DOMDocumentType docType = originNameNode.getOwnerDocType();
		if (docType.hasChildNodes()) {
```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java

	@Override
	public void doRename(IRenameRequest request, List<TextEdit> edits, CancelChecker cancelChecker) {
		edits.addAll(getRenameTextEdits(request, cancelChecker));
	}
```

### BoundedWildcard
Can generalize to `? extends Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java

	private List<TextEdit> renameAttributeValueTextEdits(DOMDocument document, DOMAttr attribute, String newText,
			List<Location> locations) {
		DOMRange attrValue = attribute.getNodeAttrValue();
		List<TextEdit> textEdits = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDDefinitionParticipant.java`
#### Snippet
```java

	@Override
	protected void doFindDefinition(IDefinitionRequest request, List<LocationLink> locations,
			CancelChecker cancelChecker) {

```

### BoundedWildcard
Can generalize to `? super Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDReferenceParticipant.java`
#### Snippet
```java
	@Override
	protected void findReferences(DOMNode node, Position position, int offset, ReferenceContext context,
			List<Location> locations, CancelChecker cancelChecker) {
		DOMAttr attr = node.findAttrAt(offset);
		if (attr != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDAnnotationModel.java`
#### Snippet
```java
		}

		private static void addIfNonEmptyString(List<String> list, String str) {
			if (!StringUtils.isEmpty(str)) {
				list.add(str);
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDCodeLensParticipant.java`
#### Snippet
```java

	@Override
	public void doCodeLens(ICodeLensRequest request, List<CodeLens> lenses, CancelChecker cancelChecker) {
		DOMDocument xmlDocument = request.getDocument();
		// XSD types CodeLens is applicable only for XML Schema file
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions) {
		codeActions.put(s4s_elt_invalid_content_3.getCode(), new s4s_elt_invalid_content_3CodeAction());
		codeActions.put(src_import_1_2.getCode(), new src_import_1_2CodeAction());
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions) {
		codeActions.put(s4s_elt_invalid_content_3.getCode(), new s4s_elt_invalid_content_3CodeAction());
		codeActions.put(src_import_1_2.getCode(), new src_import_1_2CodeAction());
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDDocumentLinkParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentLinks(DOMDocument document, List<DocumentLink> links) {
		DOMElement root = document.getDocumentElement();
		if (!XSDUtils.isXSSchema(root)) {
```

### BoundedWildcard
Can generalize to `? super DocumentHighlight`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDHighlightingParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentHighlights(DOMNode node, Position position, int offset, List<DocumentHighlight> highlights,
			CancelChecker cancelChecker) {
		// XSD highlight applicable only for XSD file
```

### BoundedWildcard
Can generalize to `? super CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 * @param elements
	 */
	void collectElement(XSElementDeclaration elementDeclaration, Collection<CMElementDeclaration> elements) {
		XSObjectList list = getSubstitutionGroup(elementDeclaration);
		if (list != null) {
```

### BoundedWildcard
Can generalize to `? super ColorPresentation`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/participants/XMLDocumentColorParticipant.java`
#### Snippet
```java
	@Override
	public void doColorPresentations(DOMDocument xmlDocument, ColorPresentationParams params,
			List<ColorPresentation> presentations, CancelChecker cancelChecker) {
		Color color = params.getColor();
		Range replace = params.getRange();
```

### BoundedWildcard
Can generalize to `? extends XMLColorExpression`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/participants/XMLDocumentColorParticipant.java`
#### Snippet
```java
	 *         and false otherwise.
	 */
	private static boolean isColorNode(DOMNode node, List<XMLColorExpression> expressions) {
		if (node.isAttribute()) {
			DOMAttr attr = (DOMAttr) node;
```

### BoundedWildcard
Can generalize to `? super ColorInformation`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/participants/XMLDocumentColorParticipant.java`
#### Snippet
```java
	}

	private void doDocumentColor(DOMNode node, List<XMLColorExpression> expressions, List<ColorInformation> colors,
			CancelChecker cancelChecker) {
		if (node.isElement()) {
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogDocumentLinkParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentLinks(DOMDocument document, List<DocumentLink> links) {
		for (CatalogEntry catalogEntry : CatalogUtils.getCatalogEntries(document)) {
			DocumentLink docLink = createDocumentLinkFromCatalogEntry(document, catalogEntry);
```

### BoundedWildcard
Can generalize to `? super Diagnostic`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	private Exception currentError;

	public AbstractLSPErrorReporter(String source, DOMDocument xmlDocument, List<Diagnostic> diagnostics,
			boolean hasRelatedInfo) {
		this.source = source;
```

### BoundedWildcard
Can generalize to `? super Diagnostic`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogDiagnosticsParticipant.java`
#### Snippet
```java

	@Override
	public void doDiagnostics(DOMDocument xmlDocument, List<Diagnostic> diagnostics,
			XMLValidationSettings validationSettings, CancelChecker monitor) {
		if (!DOMUtils.isCatalog(xmlDocument)) {
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogCodeLensParticipant.java`
#### Snippet
```java
	}

	private void createRegisterCatalogLenses(ICodeLensRequest request, List<CodeLens> lenses) {
		DOMDocument document = request.getDocument();
		if (!DOMUtils.isCatalog(document)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java

	
	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(incomplete_element_required_element_missing.getCode(), new required_element_missingCodeAction());
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java

	
	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(incomplete_element_required_element_missing.getCode(), new required_element_missingCodeAction());
```

### BoundedWildcard
Can generalize to `? super CMAttributeDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java

	private void collectAttributesDeclaration(XSComplexTypeDefinition typeDefinition,
			Collection<CMAttributeDeclaration> attributes) {
		XSObjectList list = typeDefinition.getAttributeUses();
		if (list != null) {
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGCodeLensParticipant.java`
#### Snippet
```java

	@Override
	public void doCodeLens(ICodeLensRequest request, List<CodeLens> lenses, CancelChecker cancelChecker) {
		DOMDocument xmlDocument = request.getDocument();
		// RNG types CodeLens is applicable only for rng files
```

### BoundedWildcard
Can generalize to `? super Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGReferenceParticipant.java`
#### Snippet
```java
	@Override
	protected void findReferences(DOMNode node, Position position, int offset, ReferenceContext context,
			List<Location> locations, CancelChecker cancelChecker) {
		DOMAttr attr = node.findAttrAt(offset);
		if (attr != null) {
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGDefinitionParticipant.java`
#### Snippet
```java

	@Override
	protected void doFindDefinition(IDefinitionRequest request, List<LocationLink> locations,
			CancelChecker cancelChecker) {

```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java

	@Override
	public void doRename(IRenameRequest request, List<TextEdit> edits, CancelChecker cancelChecker) {
		edits.addAll(getRenameTextEdits(request, cancelChecker));
	}
```

### BoundedWildcard
Can generalize to `? extends Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java

	private List<TextEdit> renameAttributeValueTextEdits(DOMDocument document, DOMAttr attribute, String newText,
			List<Location> locations) {
		DOMRange attrValue = attribute.getNodeAttrValue();
		List<TextEdit> textEdits = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super DocumentHighlight`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGHighlightingParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentHighlights(DOMNode node, Position position, int offset, List<DocumentHighlight> highlights,
			CancelChecker cancelChecker) {
		// XSD highlight applicable only for rng file
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGDocumentLinkParticipant.java`
#### Snippet
```java
	}

	public void findDocumentLinks(DOMNode parent, DOMDocument document, List<DocumentLink> links) {
		for (DOMNode child : parent.getChildren()) {
			if (child.isElement()) {
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeDocumentLinkParticipant.java`
#### Snippet
```java
	}

	public void findDocumentLinks(DOMNode parent, DOMDocument document, List<DocumentLink> links) {
		for (DOMNode child : parent.getChildren()) {
			if (child.isElement()) {
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesDefinitionParticipant.java`
#### Snippet
```java

	private static void fillEntityLocation(DTDEntityDecl entity, String entityName, Range entityRange,
			List<LocationLink> locations) {
		if (entityName.equals(entity.getName())) {
			TargetRange name = entity.getNameParameter();
```

### BoundedWildcard
Can generalize to `? super SchemaGrammar`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	}

	private static void updateTracker(SchemaGrammar grammar, Set<SchemaGrammar> trackedGrammars,
			Set<String> trackedURIs, FilesChangedTracker tracker) {
		if (grammar == null || trackedGrammars.contains(grammar)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java

	private static void updateTracker(SchemaGrammar grammar, Set<SchemaGrammar> trackedGrammars,
			Set<String> trackedURIs, FilesChangedTracker tracker) {
		if (grammar == null || trackedGrammars.contains(grammar)) {
			return;
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	 * @param targetAttrs the list of referenced nodes.
	 */
	private static void addTargetNode(DOMNode node, List<DOMAttr> targetAttrs) {
		DOMAttr attr = null;
		switch (node.getNodeType()) {
```

### BoundedWildcard
Can generalize to `? extends DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	}

	private static void searchXSOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java

	private static void searchXSOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
			if (cancelChecker != null) {
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java

	private static void searchXSOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
			if (cancelChecker != null) {
```

### BoundedWildcard
Can generalize to `? extends SchemaGrammar`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	}

	public static FilesChangedTracker createFilesChangedTracker(Set<SchemaGrammar> grammars) {
		FilesChangedTracker tracker = new FilesChangedTracker();
		Set<SchemaGrammar> trackedGrammars = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java

	private static void searchXSTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		DOMDocument document = documentElement.getOwnerDocument();
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java

	private static void searchXSTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		DOMDocument document = documentElement.getOwnerDocument();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	private static void searchXSTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		DOMDocument document = documentElement.getOwnerDocument();
		String documentURI = document.getDocumentURI();
```

### BoundedWildcard
Can generalize to `? extends Cardinality`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2xsd/XML2XMLSchemaGenerator.java`
#### Snippet
```java
	}

	private static boolean allChildrenAreOptional(Collection<Cardinality> values) {
		return values.stream().allMatch(cardinality -> cardinality.getMin() == 0);
	}
```

### BoundedWildcard
Can generalize to `? extends AttributeDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
	}

	private void generateAttribute(XMLBuilder schema, Collection<AttributeDeclaration> attributes, String prefix,
			RelaxNGGeneratorSettings settings, CancelChecker cancelChecker) {
		// Generate list of rng:attribute
```

### BoundedWildcard
Can generalize to `? super DocumentHighlight`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesHighlightingParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentHighlights(DOMNode node, Position position, int offset, List<DocumentHighlight> highlights,
			CancelChecker cancelChecker) {
		// Create the from query for the node which needs to perform the search.
```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java

	@Override
	public void doRename(IRenameRequest request, List<TextEdit> edits, CancelChecker cancelChecker) {
		edits.addAll(getRenameTextEdits(request, cancelChecker));
	}
```

### BoundedWildcard
Can generalize to `? super Range`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesLinkedEditingRangesParticipant.java`
#### Snippet
```java

	@Override
	public void findLinkedEditingRanges(ILinkedEditingRangesRequest request, List<Range> ranges,
			CancelChecker cancelChecker) {
		if (request.getNode() == null || request.getNode().isOwnerDocument()) {
```

### BoundedWildcard
Can generalize to `? super Diagnostic`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesDiagnosticParticipant.java`
#### Snippet
```java

	@Override
	public void doDiagnostics(DOMDocument document, List<Diagnostic> diagnostics,
			XMLValidationSettings validationSettings, CancelChecker cancelChecker) {
		Collection<ReferenceLink> links = SearchEngine.getInstance().searchLinks(document,
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesDefinitionParticipant.java`
#### Snippet
```java

	@Override
	protected void doFindDefinition(IDefinitionRequest request, List<LocationLink> locations,
			CancelChecker cancelChecker) {
		// Create the from query for the node which needs to perform the search.
```

### BoundedWildcard
Can generalize to `? super Location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesReferenceParticipant.java`
#### Snippet
```java
	@Override
	protected void findReferences(DOMNode node, Position position, int offset, ReferenceContext context,
			List<Location> locations, CancelChecker cancelChecker) {
		SearchQuery query = SearchQueryFactory.createToQuery(node, offset, plugin.getReferencesSettings());
		if (query == null) {
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesCodeLensParticipant.java`
#### Snippet
```java

	@Override
	public void doCodeLens(ICodeLensRequest request, List<CodeLens> lenses, CancelChecker cancelChecker) {
		DOMDocument document = request.getDocument();
		Collection<ReferenceLink> links = SearchEngine.getInstance().searchLinks(document,
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchEngine.java`
#### Snippet
```java
	 */
	private void searchInNode(DOMNode node, SearchQuery query, IXMLReferenceCollector collector,
			Set<String> externalURIs, CancelChecker cancelChecker) {
		// Stop the search if required
		if (cancelChecker != null) {
```

### BoundedWildcard
Can generalize to `? super ReferencedGrammarInfo`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java

	private void fillReferencedGrammarInfo(DOMDocument document, String publicId, String systemId,
			Identifier identifier, Set<ReferencedGrammarInfo> referencedGrammarInfos) {
		ResolvedURIInfo resolvedURIInfo = resolverManager.resolveInfo(document.getDocumentURI(), publicId, systemId);
		if (resolvedURIInfo != null) {
```

### BoundedWildcard
Can generalize to `? super LocationLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelTypeDefinitionParticipant.java`
#### Snippet
```java

	@Override
	protected void doFindTypeDefinition(ITypeDefinitionRequest request, List<LocationLink> locations,
			CancelChecker cancelChecker) {
		ContentModelManager contentModelManager = request.getComponent(ContentModelManager.class);
```

### BoundedWildcard
Can generalize to `? super DocumentLink`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelDocumentLinkParticipant.java`
#### Snippet
```java

	@Override
	public void findDocumentLinks(DOMDocument document, List<DocumentLink> links) {
		// Document link for DTD
		DOMDocumentType docType = document.getDoctype();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ExternalResourceErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActionParticipants) {
		codeActionParticipants.put(DownloadResourceDisabled.getCode(), new DownloadDisabledResourceCodeAction());		
	}
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ExternalResourceErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActionParticipants) {
		codeActionParticipants.put(DownloadResourceDisabled.getCode(), new DownloadDisabledResourceCodeAction());		
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelFormatterParticipant.java`
#### Snippet
```java
	@Override
	public FormatElementCategory getFormatElementCategory(DOMElement element,
			XMLFormattingConstraints parentConstraints, Map<String, Collection<CMDocument>> formattingContext,
			SharedSettings sharedSettings) {
		boolean enabled = sharedSettings.getFormattingSettings().isGrammarAwareFormatting();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(ElementDeclUnterminated.getCode(), new ElementDeclUnterminatedCodeAction());
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(ElementDeclUnterminated.getCode(), new ElementDeclUnterminatedCodeAction());
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(ETagUnterminated.getCode(), new ETagUnterminatedCodeAction());
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(ETagUnterminated.getCode(), new ETagUnterminatedCodeAction());
```

### BoundedWildcard
Can generalize to `? super MarkupContent`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
	}

	private static void fillHoverContent(MarkupContent content, List<MarkupContent> contents) {
		if (content != null && !StringUtils.isEmpty(content.getValue())) {
			contents.add(content);
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/TargetNamespace_1CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeLensParticipant.java`
#### Snippet
```java
	}

	private void createReferencedGrammarLenses(ICodeLensRequest request, List<CodeLens> lenses) {
		DOMDocument document = request.getDocument();
		if (!document.hasGrammar()) {
```

### BoundedWildcard
Can generalize to `? super CodeLens`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeLensParticipant.java`
#### Snippet
```java
	}

	private static void createBindToGrammarSchemaLenses(ICodeLensRequest request, List<CodeLens> lenses) {
		if (!canSupportAssociation(request)) {
			return;
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_3CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/TargetNamespace_2CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
	 * @param targetAttrs the list of referenced nodes.
	 */
	private static void addTargetNode(DOMNode node, List<DOMAttr> targetAttrs) {
		DOMAttr attr = null;
		switch (node.getNodeType()) {
```

### BoundedWildcard
Can generalize to `? extends DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
	}

	private static void searchRNGOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

	private static void searchRNGOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
			if (cancelChecker != null) {
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

	private static void searchRNGOriginAttributes(NodeList nodes, List<DOMAttr> targetAttrs,
			String targetNamespacePrefix, BiConsumer<DOMAttr, DOMAttr> collector, CancelChecker cancelChecker) {
		for (int i = 0; i < nodes.getLength(); i++) {
			if (cancelChecker != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

	private static void searchRNGTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		if (visitedURIs != null) {
```

### BoundedWildcard
Can generalize to `? super DOMAttr`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

	private static void searchRNGTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		if (visitedURIs != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
	private static void searchRNGTargetAttributes(DOMAttr originAttr, BindingType bindingType, boolean matchAttr,
			BiConsumer<String, DOMAttr> collector, DOMElement documentElement, String targetNamespacePrefix,
			String originName, Set<String> visitedURIs, boolean searchInExternalSchema) {
		if (visitedURIs != null) {
			DOMDocument document = documentElement.getOwnerDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/SemicolonRequiredInReferenceCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(cvc_complex_type_2_4_a.getCode(), new cvc_complex_type_2_4_aCodeAction());
```

### BoundedWildcard
Can generalize to `? super ICodeActionParticipant`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	}

	public static void registerCodeActionParticipants(Map<String, ICodeActionParticipant> codeActions,
			SharedSettings sharedSettings) {
		codeActions.put(cvc_complex_type_2_4_a.getCode(), new cvc_complex_type_2_4_aCodeAction());
```

### BoundedWildcard
Can generalize to `? extends CMDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @throws BadLocationException
	 */
	private static void fillWithChildrenElementDeclaration(DOMElement element, Collection<CMDocument> cmDocuments,
			Collection<CMElementDeclaration> cmElements, String defaultPrefix, boolean forceUseOfPrefix,
			ICompletionRequest request, ICompletionResponse response) throws BadLocationException {
```

### BoundedWildcard
Can generalize to `? extends CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 */
	private static void fillWithChildrenElementDeclaration(DOMElement element, Collection<CMDocument> cmDocuments,
			Collection<CMElementDeclaration> cmElements, String defaultPrefix, boolean forceUseOfPrefix,
			ICompletionRequest request, ICompletionResponse response) throws BadLocationException {
		XMLGenerator generator = request.getXMLGenerator();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	 * @param response
	 */
	private static void addTagName(NodeList list, Set<String> tags, ICompletionRequest request,
			ICompletionResponse response) {
		for (int i = 0; i < list.getLength(); i++) {
```

### BoundedWildcard
Can generalize to `? extends CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	}

	private static void fillCompletionItem(Collection<CMElementDeclaration> elements, DOMElement element,
			String defaultPrefix, boolean forceUseOfPrefix, ICompletionRequest request, ICompletionResponse response,
			XMLGenerator generator, Set<String> tags, Set<CMElementDeclaration> processedElements) {
```

### BoundedWildcard
Can generalize to `? super CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	private static void fillCompletionItem(Collection<CMElementDeclaration> elements, DOMElement element,
			String defaultPrefix, boolean forceUseOfPrefix, ICompletionRequest request, ICompletionResponse response,
			XMLGenerator generator, Set<String> tags, Set<CMElementDeclaration> processedElements) {
		for (CMElementDeclaration child : elements) {
			if (!processedElements.contains(child)) {
```

### BoundedWildcard
Can generalize to `? extends CMDocument`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	}

	private boolean hasNamespace(String namespaceURI, Collection<CMDocument> cmRootDocuments) {
		if (cmRootDocuments.isEmpty()) {
			return false;
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCompletionParticipant.java`
#### Snippet
```java
	private static void addTagCompletionItem(CMElementDeclaration elementDeclaration, DOMElement parentElement,
			String defaultPrefix, boolean forceUseOfPrefix, ICompletionRequest request, ICompletionResponse response,
			XMLGenerator generator, Set<String> tags) {
		String prefix = forceUseOfPrefix ? defaultPrefix
				: (parentElement != null ? parentElement.getPrefix(elementDeclaration.getNamespace()) : null);
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_4_aCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/src_import_1_2CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/s4s_elt_invalid_content_3CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_elt_1_aCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		DOMDocument document = request.getDocument();
		Diagnostic diagnostic = request.getDiagnostic();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/ElementDeclUnterminatedCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/OpenQuoteExpectedCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? extends CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_4CodeAction.java`
#### Snippet
```java
	}

	private boolean codeAlreadyActionExists(List<CodeAction> codeActions, Diagnostic diagnostic) {
		for (CodeAction codeAction : codeActions) {
			for (Diagnostic codeActionDiagnostic : codeAction.getDiagnostics()) {
```

### BoundedWildcard
Can generalize to `? super TextEdit`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
	}

	private void addTextEdits(DOMElement root, String newText, List<TextEdit> replace) {
		replace.add(new TextEdit(XMLPositionUtility.selectStartTagName(root), newText));

```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_type_3_1_1CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/FixMissingSpaceCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/DownloadDisabledResourceCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? extends CMElementDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	 */
	private boolean isAlreadyGenerated(CMElementDeclaration elementDeclaration,
			Collection<CMElementDeclaration> children,
			HashMap<CMElementDeclaration, List<CMElementDeclaration>> generatedElements) {
		for (CMElementDeclaration child : children) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	private boolean isAlreadyGenerated(CMElementDeclaration elementDeclaration,
			Collection<CMElementDeclaration> children,
			HashMap<CMElementDeclaration, List<CMElementDeclaration>> generatedElements) {
		for (CMElementDeclaration child : children) {
			if (generatedElements.get(child) != null
```

### BoundedWildcard
Can generalize to `? extends CMAttributeDeclaration`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	}

	private int generate(Collection<CMAttributeDeclaration> attributes, int level, int snippetIndex, XMLBuilder xml,
			String tagName) {
		Map<String /* namespaceURI */, String /* prefix */> prefixes = null;
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EqRequiredInAttributeCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_enumeration_validCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_1CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_3_2_2CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_complex_type_2_4_bCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		DOMDocument document = request.getDocument();
		Diagnostic diagnostic = request.getDiagnostic();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/cvc_attribute_3CodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_element_missingCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		DOMDocument document = request.getDocument();
		Diagnostic diagnostic = request.getDiagnostic();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 */
	private void addEntityCodeAction(String entityName, Diagnostic diagnostic, DOMDocument document,
			SharedSettings settings, List<CodeAction> codeActions) throws BadLocationException {

		DOMDocumentType docType = document.getDoctype();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
	 */
	private void addDoctypeAndEntityCodeAction(String entityName, Diagnostic diagnostic, DOMDocument document,
			SharedSettings settings, List<CodeAction> codeActions) throws BadLocationException {
		Position insertPosition = getDoctypeInsertPosition(document);

```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_elements_missing_expectedCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		DOMDocument document = request.getDocument();
		Diagnostic diagnostic = request.getDiagnostic();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missinggrammar/AbstractFixMissingGrammarCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		String missingFilePath = getPathFromDiagnostic(diagnostic);
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 */
	private void doCodeActionsForEndTagUnclosed(DOMElement element, DOMDocument document, Diagnostic diagnostic,
			List<CodeAction> codeActions) throws BadLocationException {
		// ex: <foo> </foo
		Position endTagPosition = document
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 */
	private void doCodeActionsForStartTagUnclosed(DOMElement element, DOMDocument document, Range diagnosticRange,
			Diagnostic diagnostic, List<CodeAction> codeActions) throws BadLocationException {
		// Here start tag element is not closed with '>'.
		String text = document.getText();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
	 */
	private void doCodeActionsForStartTagClosed(DOMElement element, DOMDocument document, Range diagnosticRange,
			Diagnostic diagnostic, List<CodeAction> codeActions) throws BadLocationException {
		// Here start tag element is closed with '>'.
		String text = document.getText();
```

### BoundedWildcard
Can generalize to `? super CodeAction`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java

	@Override
	public void doCodeAction(ICodeActionRequest request, List<CodeAction> codeActions, CancelChecker cancelChecker) {
		Diagnostic diagnostic = request.getDiagnostic();
		DOMDocument document = request.getDocument();
```

### BoundedWildcard
Can generalize to `? super Diagnostic`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
	 * @param validationSettings the settings to use to know the severity of warn.
	 */
	private static void warnNoGrammar(DOMDocument document, List<Diagnostic> diagnostics,
			XMLValidationSettings validationSettings) {
		boolean hasGrammar = document.hasGrammar();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
	}

	public CacheResourcesManager(Cache<String, CacheResourceDownloadedException> cache) {
		resourcesLoading = new HashMap<>();
		protocolsForCache = new HashSet<>();
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _AVL = "A".codePointAt(0);
	public final static int _TVL = "T".codePointAt(0);
	public final static int _OVL = "O".codePointAt(0);
	public final static int _YVL = "Y".codePointAt(0);
	public final static int _PVL = "P".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _TVL = "T".codePointAt(0);
	public final static int _OVL = "O".codePointAt(0);
	public final static int _YVL = "Y".codePointAt(0);
	public final static int _PVL = "P".codePointAt(0);
	public final static int _EVL = "E".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _WSP = " ".codePointAt(0);
	public final static int _TAB = "\t".codePointAt(0);
	public final static int _OSB = "[".codePointAt(0);
	public final static int _CSB = "]".codePointAt(0);
	public final static int _ORB = "(".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _EQS = "=".codePointAt(0);
	public final static int _CMA = ",".codePointAt(0);
	public final static int _DQO = "\"".codePointAt(0);
	public final static int _SQO = "\"".codePointAt(0);
	public final static int _SIQ = "\'".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _LFD = "\f".codePointAt(0);
	public final static int _WSP = " ".codePointAt(0);
	public final static int _TAB = "\t".codePointAt(0);
	public final static int _OSB = "[".codePointAt(0);
	public final static int _CSB = "]".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CAR = "\r".codePointAt(0);
	public final static int _LFD = "\f".codePointAt(0);
	public final static int _WSP = " ".codePointAt(0);
	public final static int _TAB = "\t".codePointAt(0);
	public final static int _OSB = "[".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _QMA = "?".codePointAt(0);
	public final static int _XVL = "x".codePointAt(0);
	public final static int _mVL = "m".codePointAt(0);
	public final static int _lVL = "l".codePointAt(0);
	public final static int _PCT = "%".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _LVL = "L".codePointAt(0);
	public final static int _MVL = "M".codePointAt(0);
	public final static int _NVL = "N".codePointAt(0);
	public final static int _IVL = "I".codePointAt(0);
	public final static int _SVL = "S".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CMA = ",".codePointAt(0);
	public final static int _DQO = "\"".codePointAt(0);
	public final static int _SQO = "\"".codePointAt(0);
	public final static int _SIQ = "\'".codePointAt(0);
	public final static int _NWL = "\n".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CCB = "}".codePointAt(0);
	public final static int _CVL = "C".codePointAt(0);
	public final static int _DVL = "D".codePointAt(0);
	public final static int _AVL = "A".codePointAt(0);
	public final static int _TVL = "T".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _TAB = "\t".codePointAt(0);
	public final static int _OSB = "[".codePointAt(0);
	public final static int _CSB = "]".codePointAt(0);
	public final static int _ORB = "(".codePointAt(0);
	public final static int _CRB = ")".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _mVL = "m".codePointAt(0);
	public final static int _lVL = "l".codePointAt(0);
	public final static int _PCT = "%".codePointAt(0);
	public final static int _AST = "*".codePointAt(0);
	public final static int _PLS = "+".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _OCB = "{".codePointAt(0);
	public final static int _CCB = "}".codePointAt(0);
	public final static int _CVL = "C".codePointAt(0);
	public final static int _DVL = "D".codePointAt(0);
	public final static int _AVL = "A".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _SIQ = "\'".codePointAt(0);
	public final static int _NWL = "\n".codePointAt(0);
	public final static int _CAR = "\r".codePointAt(0);
	public final static int _LFD = "\f".codePointAt(0);
	public final static int _WSP = " ".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _NVL = "N".codePointAt(0);
	public final static int _IVL = "I".codePointAt(0);
	public final static int _SVL = "S".codePointAt(0);
	public final static int _QMA = "?".codePointAt(0);
	public final static int _XVL = "x".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _DQO = "\"".codePointAt(0);
	public final static int _SQO = "\"".codePointAt(0);
	public final static int _SIQ = "\'".codePointAt(0);
	public final static int _NWL = "\n".codePointAt(0);
	public final static int _CAR = "\r".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _NWL = "\n".codePointAt(0);
	public final static int _CAR = "\r".codePointAt(0);
	public final static int _LFD = "\f".codePointAt(0);
	public final static int _WSP = " ".codePointAt(0);
	public final static int _TAB = "\t".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _UDS = "_".codePointAt(0);
	public final static int _DDT = ":".codePointAt(0);
	public final static int _DOT = ".".codePointAt(0);
	public final static int _LAN = "<".codePointAt(0);
	public final static int _RAN = ">".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _EXL = "!".codePointAt(0);
	public final static int _MIN = "-".codePointAt(0);
	public final static int _UDS = "_".codePointAt(0);
	public final static int _DDT = ":".codePointAt(0);
	public final static int _DOT = ".".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _DVL = "D".codePointAt(0);
	public final static int _AVL = "A".codePointAt(0);
	public final static int _TVL = "T".codePointAt(0);
	public final static int _OVL = "O".codePointAt(0);
	public final static int _YVL = "Y".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _RAN = ">".codePointAt(0);
	public final static int _FSL = "/".codePointAt(0);
	public final static int _EQS = "=".codePointAt(0);
	public final static int _CMA = ",".codePointAt(0);
	public final static int _DQO = "\"".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _lVL = "l".codePointAt(0);
	public final static int _PCT = "%".codePointAt(0);
	public final static int _AST = "*".codePointAt(0);
	public final static int _PLS = "+".codePointAt(0);

```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _EVL = "E".codePointAt(0);
	public final static int _LVL = "L".codePointAt(0);
	public final static int _MVL = "M".codePointAt(0);
	public final static int _NVL = "N".codePointAt(0);
	public final static int _IVL = "I".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _FSL = "/".codePointAt(0);
	public final static int _EQS = "=".codePointAt(0);
	public final static int _CMA = ",".codePointAt(0);
	public final static int _DQO = "\"".codePointAt(0);
	public final static int _SQO = "\"".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _IVL = "I".codePointAt(0);
	public final static int _SVL = "S".codePointAt(0);
	public final static int _QMA = "?".codePointAt(0);
	public final static int _XVL = "x".codePointAt(0);
	public final static int _mVL = "m".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CRB = ")".codePointAt(0);
	public final static int _OCB = "{".codePointAt(0);
	public final static int _CCB = "}".codePointAt(0);
	public final static int _CVL = "C".codePointAt(0);
	public final static int _DVL = "D".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CSB = "]".codePointAt(0);
	public final static int _ORB = "(".codePointAt(0);
	public final static int _CRB = ")".codePointAt(0);
	public final static int _OCB = "{".codePointAt(0);
	public final static int _CCB = "}".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _ORB = "(".codePointAt(0);
	public final static int _CRB = ")".codePointAt(0);
	public final static int _OCB = "{".codePointAt(0);
	public final static int _CCB = "}".codePointAt(0);
	public final static int _CVL = "C".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java

	public final static int _EXL = "!".codePointAt(0);
	public final static int _MIN = "-".codePointAt(0);
	public final static int _UDS = "_".codePointAt(0);
	public final static int _DDT = ":".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _LAN = "<".codePointAt(0);
	public final static int _RAN = ">".codePointAt(0);
	public final static int _FSL = "/".codePointAt(0);
	public final static int _EQS = "=".codePointAt(0);
	public final static int _CMA = ",".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _XVL = "x".codePointAt(0);
	public final static int _mVL = "m".codePointAt(0);
	public final static int _lVL = "l".codePointAt(0);
	public final static int _PCT = "%".codePointAt(0);
	public final static int _AST = "*".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _OSB = "[".codePointAt(0);
	public final static int _CSB = "]".codePointAt(0);
	public final static int _ORB = "(".codePointAt(0);
	public final static int _CRB = ")".codePointAt(0);
	public final static int _OCB = "{".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _MIN = "-".codePointAt(0);
	public final static int _UDS = "_".codePointAt(0);
	public final static int _DDT = ":".codePointAt(0);
	public final static int _DOT = ".".codePointAt(0);
	public final static int _LAN = "<".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
public class Constants {

	public final static int _EXL = "!".codePointAt(0);
	public final static int _MIN = "-".codePointAt(0);
	public final static int _UDS = "_".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _DDT = ":".codePointAt(0);
	public final static int _DOT = ".".codePointAt(0);
	public final static int _LAN = "<".codePointAt(0);
	public final static int _RAN = ">".codePointAt(0);
	public final static int _FSL = "/".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _DOT = ".".codePointAt(0);
	public final static int _LAN = "<".codePointAt(0);
	public final static int _RAN = ">".codePointAt(0);
	public final static int _FSL = "/".codePointAt(0);
	public final static int _EQS = "=".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _PVL = "P".codePointAt(0);
	public final static int _EVL = "E".codePointAt(0);
	public final static int _LVL = "L".codePointAt(0);
	public final static int _MVL = "M".codePointAt(0);
	public final static int _NVL = "N".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _OVL = "O".codePointAt(0);
	public final static int _YVL = "Y".codePointAt(0);
	public final static int _PVL = "P".codePointAt(0);
	public final static int _EVL = "E".codePointAt(0);
	public final static int _LVL = "L".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _CVL = "C".codePointAt(0);
	public final static int _DVL = "D".codePointAt(0);
	public final static int _AVL = "A".codePointAt(0);
	public final static int _TVL = "T".codePointAt(0);
	public final static int _OVL = "O".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _SVL = "S".codePointAt(0);
	public final static int _QMA = "?".codePointAt(0);
	public final static int _XVL = "x".codePointAt(0);
	public final static int _mVL = "m".codePointAt(0);
	public final static int _lVL = "l".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _SQO = "\"".codePointAt(0);
	public final static int _SIQ = "\'".codePointAt(0);
	public final static int _NWL = "\n".codePointAt(0);
	public final static int _CAR = "\r".codePointAt(0);
	public final static int _LFD = "\f".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _PCT = "%".codePointAt(0);
	public final static int _AST = "*".codePointAt(0);
	public final static int _PLS = "+".codePointAt(0);

	public static final Pattern ENTITY_NAME_REGEX = Pattern.compile("");
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _MVL = "M".codePointAt(0);
	public final static int _NVL = "N".codePointAt(0);
	public final static int _IVL = "I".codePointAt(0);
	public final static int _SVL = "S".codePointAt(0);
	public final static int _QMA = "?".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
	public final static int _YVL = "Y".codePointAt(0);
	public final static int _PVL = "P".codePointAt(0);
	public final static int _EVL = "E".codePointAt(0);
	public final static int _LVL = "L".codePointAt(0);
	public final static int _MVL = "M".codePointAt(0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java

	/** The predefined delimiters of this tracker */
	public final static String[] DELIMITERS = { "\r", "\n", "\r\n" }; //$NON-NLS-3$ //$NON-NLS-1$ //$NON-NLS-2$
	/** A predefined delimiter information which is always reused as return value */
	private DelimiterInfo fDelimiterInfo = new DelimiterInfo();
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java

	/** The predefined delimiters of this tracker */
	public final static String[] DELIMITERS = { "\r", "\n", "\r\n" }; //$NON-NLS-3$ //$NON-NLS-1$ //$NON-NLS-2$
	/** A predefined delimiter information which is always reused as return value */
	private DelimiterInfo fDelimiterInfo = new DelimiterInfo();
```

### MissortedModifiers
Missorted modifiers `transient final`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/diagnostics/DiagnosticsResult.java`
#### Snippet
```java
	}

	private transient final Map<String, Object> validationArgs;

	private transient List<CompletableFuture<?>> futures;
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, XSDErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
public class ExternalXMLDTDValidator extends XMLDTDValidator {

	public final static String DOCTYPE = "http://apache.org/xml/properties/dtd/external-doctype"; //$NON-NLS-1$ ;

	private static final String DTD_NOT_FOUND_KEY = "DTDNotFound";
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(AbstractLSPErrorReporter.class.getName());

	protected final static Range NO_RANGE = new Range();
	private final DOMDocument xmlDocument;
	private final List<Diagnostic> diagnostics;
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, RelaxNGErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
public class ExternalRelaxNGValidator implements XMLComponent, XMLDocumentFilter {

	public final static String RELAXNG = "http://apache.org/xml/properties/relaxng/external-relaxng"; //$NON-NLS-1$ ;

	private XMLErrorReporter errorReporterForXML;
```

### MissortedModifiers
Missorted modifiers `static private`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySchemaReaderImpl.java`
#### Snippet
```java
	}

	static private class SimplifiedSchemaPropertyMap implements PropertyMap {
		private final PropertyMap base;
		private final Pattern start;
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, XIncludeErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesDiagnosticParticipant.java`
#### Snippet
```java
	private final static String UNDEFINED_REFERENCE_MESSSAGE = "Undefined reference ''{0}'': nothing that matches the expression ''{1}'' defines ''{2}''.";

	private final static String INVALID_PREFIX_MESSSAGE = "Invalid reference ''{0}'': references to declarations that match the expression ''{1}'' require the ''{2}'' prefix.";

	private final XMLReferencesPlugin plugin;
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesDiagnosticParticipant.java`
#### Snippet
```java
public class XMLReferencesDiagnosticParticipant implements IDiagnosticsParticipant {

	private final static String UNDEFINED_REFERENCE_MESSSAGE = "Undefined reference ''{0}'': nothing that matches the expression ''{1}'' defines ''{2}''.";

	private final static String INVALID_PREFIX_MESSSAGE = "Invalid reference ''{0}'': references to declarations that match the expression ''{1}'' require the ''{2}'' prefix.";
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, XMLReferencesErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
	public static class UnknownBindingTypeException extends Exception {

		private final static String MESSAGE = "Unknown binding type ''{0}''. Allowed values are " + //
				Stream.of(GrammarBindingType.values()) //
						.map(GrammarBindingType::getName) //
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ExternalResourceErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, ExternalResourceErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, DTDErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, XMLSyntaxErrorCode> codes;

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	}

	private final static Map<String, XMLSchemaErrorCode> codes;

	static {
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java

						if (range != null) {
							length = changeEvent.getRangeLength().intValue();
						} else {
							// range is optional and if not given, the whole file content is replaced
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	 */
	private XMLFormattingOptions getIndentationSettings(@NonNull String uri) {
		if (clientConfigurationSupport == null || !clientConfigurationSupport.booleanValue()) {
			// The client doesn't support 'configuration/workspace'.
			return null;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/ClientCapabilitiesWrapper.java`
#### Snippet
```java
	private boolean isDynamicRegistrationSupported(DynamicRegistrationCapabilities capability) {
		return capability != null && capability.getDynamicRegistration() != null
				&& capability.getDynamicRegistration().booleanValue();
	}

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/settings/XMLReferenceExpression.java`
#### Snippet
```java

	public boolean isMultiple() {
		return multiple != null && multiple.booleanValue();
	}
	public Boolean getMultiple() {
```

## RuleId[id=RedundantMethodOverride]
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
Method `getNodeName()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
	 */
	@Override
	public String getNodeName() {
		return getName();
	}
```

### RedundantMethodOverride
Method `setData()` is identical to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMProcessingInstruction.java`
#### Snippet
```java
	 */
	@Override
	public void setData(String data) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### RedundantMethodOverride
Method `getAttributeNode()` only delegates to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java

	@Override
	public DOMAttr getAttributeNode(String name) {
		return super.getAttributeNode(name);
	}
```

### RedundantMethodOverride
Method `isClosed()` only delegates to its super method
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	 */
	@Override
	public boolean isClosed() {
		return super.isClosed();
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
		if (entitiesNodes == null) {
			entitiesNodes = new XMLNamedNodeMap<>();
			List<DOMNode> children = super.getChildren();
			for (DOMNode child : children) {
				if (child.getNodeType() == DOMNode.ENTITY_NODE) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java

	public List<DOMNode> getRoots() {
		return super.getChildren();
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		@Override
		public T item(int index) {
			return super.get(index);
		}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		@Override
		public int getLength() {
			return super.size();
		}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		@Override
		public int getLength() {
			return super.size();
		}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		@Override
		public DOMNode item(int index) {
			return super.get(index);
		}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/LimitExceededWarner.java`
#### Snippet
```java
				Collections.singletonList(feature.getSettingId()));
		
		super.sendNotification(message, MessageType.Info ,command);
	}
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		Node testNode = node;
		IXPathNodeMatcher condition = null;
		for (int i = super.size() - 1; i >= 0; i--) {
			if (testNode == null) {
				return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
				return false;
			}
			condition = super.get(i);
			if (condition.isAny()) {
				if (i > 0) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
				if (i > 0) {
					boolean previousConditionFounded = false;
					IXPathNodeMatcher previousElementCondition = super.get(i - 1);
					if (previousElementCondition == null) {
						return true;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	private IXPathNodeMatcher createAndAddNodeMatcher(String prefix, String localName) {
		IXPathNodeMatcher matcher = createNodeMatcher(prefix, localName);
		super.add(matcher);
		return matcher;
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
	protected XPathElementMatcher createAnyElementMatcher() {
		XPathElementMatcher matcher = new XPathElementMatcher(null, XPathElementMatcher.ANY_ELEMENT_NAME, this);
		super.add(matcher);
		return matcher;
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
		ILineTracker lineTracker = getLineTracker();
		Line line = lineTracker.getLineInformation(lineNumber);
		String text = super.getText();
		return text.substring(line.offset, line.offset + line.length);
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
		}
		ILineTracker lineTracker = isIncremental() ? new TreeLineTracker(new ListLineTracker()) : new ListLineTracker();
		lineTracker.set(super.getText());
		return lineTracker;
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
			ILineTracker lineTracker = getLineTracker();
			Line line = lineTracker.getLineInformation(pos.getLine());
			String text = super.getText();
			String lineText = text.substring(line.offset, textOffset);
			int position = lineText.length();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java

	public TextDocument(String text, String uri) {
		super.setUri(uri);
		super.setText(text);
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
		this(document.getText(), document.getUri());
		super.setVersion(document.getVersion());
		super.setLanguageId(document.getLanguageId());
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/InvalidPathWarner.java`
#### Snippet
```java
					Collections.singletonList(feature.getSettingId()));

		super.sendNotification(message, MessageType.Error, command);
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/config/ConfigurationItemEdit.java`
#### Snippet
```java
	public ConfigurationItemEdit(String section, Object value, ConfigurationItemEditType editType,
			ConfigurationItemValueKind valueKind) {
		super.setSection(section);
		this.value = value;
		this.editType = editType;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
			return model;
		}
		int version = super.getVersion();
		long start = System.currentTimeMillis();
		try {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/CompletionResponse.java`
#### Snippet
```java
	@Override
	public void addCompletionItem(CompletionItem completionItem) {
		super.getItems().add(completionItem);
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/CompletionResponse.java`
#### Snippet
```java

	public CompletionResponse() {
		super.setIsIncomplete(false);
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/codelens/ReferenceCommand.java`
#### Snippet
```java
	public ReferenceCommand(String uri, Position position, boolean supportedByClient) {
		super(computeTitle(1), supportedByClient ? ClientCommands.SHOW_REFERENCES : "");
		super.setArguments(Arrays.asList(uri, position));
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/codelens/ReferenceCommand.java`
#### Snippet
```java
	public void increment() {
		nbReferences++;
		super.setTitle(computeTitle(nbReferences));
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		this.generator = generator;
		this.request = request;
		super.setLabel(tagName);
		super.setSortText(tagName);
		super.setFilterText(request.getFilterForStartTagName(tagName));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		this.request = request;
		super.setLabel(tagName);
		super.setSortText(tagName);
		super.setFilterText(request.getFilterForStartTagName(tagName));
		super.setKind(CompletionItemKind.Property);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		super.setLabel(tagName);
		super.setSortText(tagName);
		super.setFilterText(request.getFilterForStartTagName(tagName));
		super.setKind(CompletionItemKind.Property);
		// Update TextEdit
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AttributeCompletionItem.java`
#### Snippet
```java
	public AttributeCompletionItem(String attrName, boolean canSupportSnippets, Range fullRange, boolean generateValue,
			String defaultValue, Collection<String> enumerationValues, SharedSettings sharedSettings) {
		super.setLabel(attrName);
		super.setKind(CompletionItemKind.Unit);
		super.setFilterText(attrName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AttributeCompletionItem.java`
#### Snippet
```java
			String defaultValue, Collection<String> enumerationValues, SharedSettings sharedSettings) {
		super.setLabel(attrName);
		super.setKind(CompletionItemKind.Unit);
		super.setFilterText(attrName);
		StringBuilder attributeContent = new StringBuilder(attrName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AttributeCompletionItem.java`
#### Snippet
```java
		super.setLabel(attrName);
		super.setKind(CompletionItemKind.Unit);
		super.setFilterText(attrName);
		StringBuilder attributeContent = new StringBuilder(attrName);
		if (generateValue) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AttributeCompletionItem.java`
#### Snippet
```java
			attributeContent.append(attributeValue);
		}
		super.setTextEdit(Either.forLeft(new TextEdit(fullRange, attributeContent.toString())));
		super.setInsertTextFormat(canSupportSnippets ? InsertTextFormat.Snippet : InsertTextFormat.PlainText);
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AttributeCompletionItem.java`
#### Snippet
```java
		}
		super.setTextEdit(Either.forLeft(new TextEdit(fullRange, attributeContent.toString())));
		super.setInsertTextFormat(canSupportSnippets ? InsertTextFormat.Snippet : InsertTextFormat.PlainText);
	}
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		super.setSortText(tagName);
		super.setFilterText(request.getFilterForStartTagName(tagName));
		super.setKind(CompletionItemKind.Property);
		// Update TextEdit
		boolean generateFullElement = updateTextEdit();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	protected JsonObject addResolveData(ICompletionRequest request, String participantId) {
		JsonObject data = DataEntryField.createCompletionData(request, participantId);
		super.setData(data);
		return data;
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
			// generate full element (ex : <foo attr="" ></foo>)
			String xml = generateFullElementContent(!hasOrphanEndTag && request.isAutoCloseTags());
			super.setTextEdit(Either.forLeft(new TextEdit(request.getReplaceRange(), xml)));
			super.setInsertTextFormat(InsertTextFormat.Snippet);
			return true;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
			String xml = generateFullElementContent(!hasOrphanEndTag && request.isAutoCloseTags());
			super.setTextEdit(Either.forLeft(new TextEdit(request.getReplaceRange(), xml)));
			super.setInsertTextFormat(InsertTextFormat.Snippet);
			return true;
		} else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
			if (request.isCompletionSnippetsSupported()) {
				SnippetsBuilder.tabstops(0, insertText);
				super.setInsertTextFormat(InsertTextFormat.Snippet);
			}
			// <fo|o></bar> ==> foo
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
				insertText.append('>');
			}
			super.setTextEdit(Either
					.forLeft(new TextEdit(
							isTextNode ? request.getReplaceRange() : request.getReplaceRangeForTagName(),
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
		// }
		MarkupContent documentation = generateDocumentation();
		super.setDocumentation(documentation);
		return false;
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	 */
	private void initializeDefaultSettings() {
		super.setTabSize(DEFAULT_TAB_SIZE);
		super.setInsertSpaces(true);
		super.setTrimFinalNewlines(true);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
	private void initializeDefaultSettings() {
		super.setTabSize(DEFAULT_TAB_SIZE);
		super.setInsertSpaces(true);
		super.setTrimFinalNewlines(true);
		this.setSplitAttributes(false);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
		super.setTabSize(DEFAULT_TAB_SIZE);
		super.setInsertSpaces(true);
		super.setTrimFinalNewlines(true);
		this.setSplitAttributes(false);
		this.setJoinCDATALines(false);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
			initializeDefaultSettings();
		}
		super.setTabSize(tabSize);
		super.setInsertSpaces(insertSpaces);
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
		}
		super.setTabSize(tabSize);
		super.setInsertSpaces(insertSpaces);
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getNamespace() {
		return super.name.uri;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getPrefix() {
		return super.name.prefix;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public Collection<String> getEnumerationValues() {
		String[] values = super.simpleType.enumeration;
		if (values == null) {
			return Collections.emptyList();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public boolean isRequired() {
		return super.simpleType.defaultType == XMLSimpleType.DEFAULT_TYPE_REQUIRED;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getDefaultValue() {
		return super.simpleType.defaultValue;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getLocalName() {
		return super.name.localpart;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getLocalName() {
		return super.name.localpart;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public boolean isEmpty() {
		return super.type == XMLElementDecl.TYPE_EMPTY;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public boolean isMixedContent() {
		return super.type == XMLElementDecl.TYPE_MIXED;
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
						fErrorReporter.reportError(locator, XMLModelMessageFormatter.XML_MODEL_DOMAIN,
								DTD_NOT_FOUND_KEY, new Object[] { element, eid }, XMLErrorReporter.SEVERITY_ERROR, e);
						super.fValidation = false;
					}
				} else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
			Range range = getReferencedGrammarRange(grammarURI);
			String message = "";
			Diagnostic diagnostic = super.addDiagnostic(range, message, DiagnosticSeverity.Error, null, null);
			// Register the diagnostic as root diagnostic for the XSD, DTD grammar uri
			info = new ReferencedGrammarDiagnosticsInfo(grammarURI, resolverExtensionManager, diagnostic);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		this.hasRelatedInfo = hasRelatedInfo;
		XMLMessageFormatter xmft = new XMLMessageFormatter();
		super.putMessageFormatter(XMLMessageFormatter.XML_DOMAIN, xmft);
		super.putMessageFormatter(XMLMessageFormatter.XMLNS_DOMAIN, xmft);
		super.putMessageFormatter(XSMessageFormatter.SCHEMA_DOMAIN, new LSPMessageFormatter());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		XMLMessageFormatter xmft = new XMLMessageFormatter();
		super.putMessageFormatter(XMLMessageFormatter.XML_DOMAIN, xmft);
		super.putMessageFormatter(XMLMessageFormatter.XMLNS_DOMAIN, xmft);
		super.putMessageFormatter(XSMessageFormatter.SCHEMA_DOMAIN, new LSPMessageFormatter());
		super.putMessageFormatter(XMLModelMessageFormatter.XML_MODEL_DOMAIN, new XMLModelMessageFormatter());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		super.putMessageFormatter(XMLMessageFormatter.XML_DOMAIN, xmft);
		super.putMessageFormatter(XMLMessageFormatter.XMLNS_DOMAIN, xmft);
		super.putMessageFormatter(XSMessageFormatter.SCHEMA_DOMAIN, new LSPMessageFormatter());
		super.putMessageFormatter(XMLModelMessageFormatter.XML_MODEL_DOMAIN, new XMLModelMessageFormatter());
	}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		super.putMessageFormatter(XMLMessageFormatter.XMLNS_DOMAIN, xmft);
		super.putMessageFormatter(XSMessageFormatter.SCHEMA_DOMAIN, new LSPMessageFormatter());
		super.putMessageFormatter(XMLModelMessageFormatter.XML_MODEL_DOMAIN, new XMLModelMessageFormatter());
	}

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGSAXParser.java`
#### Snippet
```java
		try {
			// Add LSP error reporter to fill LSP diagnostics from Xerces errors
			super.setProperty("http://apache.org/xml/properties/internal/error-reporter", reporter);
		} catch (SAXNotRecognizedException | SAXNotSupportedException e) {
			// Should never occur.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
			if (input == null) {
				try {
					super.setByteStream(Files.newInputStream(file));
				} catch (IOException e) {
					throw new RuntimeException(e);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		// Disable DOCTYPE declaration if settings is set to true.
		boolean disallowDocTypeDecl = validationSettings != null ? validationSettings.isDisallowDocTypeDecl() : false;
		super.setFeature("http://apache.org/xml/features/disallow-doctype-decl", disallowDocTypeDecl);
		// Resolve external entities if settings is set to true.
		boolean resolveExternalEntities = validationSettings != null ? validationSettings.isResolveExternalEntities()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		boolean resolveExternalEntities = validationSettings != null ? validationSettings.isResolveExternalEntities()
				: false;
		super.setFeature("http://xml.org/sax/features/external-general-entities", resolveExternalEntities);
		super.setFeature("http://xml.org/sax/features/external-parameter-entities", resolveExternalEntities);
		// Enable xi:include validation if settings is set to true.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
				: false;
		super.setFeature("http://xml.org/sax/features/external-general-entities", resolveExternalEntities);
		super.setFeature("http://xml.org/sax/features/external-parameter-entities", resolveExternalEntities);
		// Enable xi:include validation if settings is set to true.
		boolean isXIncludeEnabled = validationSettings != null ? validationSettings.getXInclude().isEnabled() : false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		// Enable xi:include validation if settings is set to true.
		boolean isXIncludeEnabled = validationSettings != null ? validationSettings.getXInclude().isEnabled() : false;
		super.setFeature(XINCLUDE_FEATURE, isXIncludeEnabled);
		// Security manager
		SecurityManager securityManager = LSPSecurityManager.getSecurityManager();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java
		// Security manager
		SecurityManager securityManager = LSPSecurityManager.getSecurityManager();
		super.setProperty(SECURITY_MANAGER, securityManager);
		fErrorReporter = reporterForXML;

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLParserConfiguration.java`
#### Snippet
```java

	private void disableDTDValidation() {
		XMLDTDValidator validator = (XMLDTDValidator) super.getProperty(DTD_VALIDATOR);
		if (validator != null) {
			// Calling XMLDTDValidator#setFeature("http://xml.org/sax/features/validation",
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
			return referencedGrammars;
		}
		return referencedGrammars = contentModelManager.getReferencedGrammarInfos(super.getDOMDocument());
	}
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPSAXParser.java`
#### Snippet
```java
		try {
			// Add LSP error reporter to fill LSP diagnostics from Xerces errors
			super.setProperty("http://apache.org/xml/properties/internal/error-reporter", reporter);
		} catch (SAXNotRecognizedException | SAXNotSupportedException e) {
			// Should never occur.
```

## RuleId[id=UNUSED_IMPORT]
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
Unused import `import java.io.StringReader;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/DocumentTelemetryInfo.java`
#### Snippet
```java
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/DocumentTelemetryInfo.java`
#### Snippet
```java
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
		if (rootElement) {
			rootElement = false;
			fValidation = fDTDValidation = externalDoctype != null;
			if (fValidation) {
				QName fRootElement = getRootElement();
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
			return referencedGrammars;
		}
		return referencedGrammars = contentModelManager.getReferencedGrammarInfos(super.getDOMDocument());
	}
}
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
				{
					allowedRedirects--;
					url = new URL(actualURI = conn.getHeaderField("Location")); //$NON-NLS-1$
					String protocol = url.getProtocol();
					if (!protocolsForCache.contains(formatProtocol(protocol))) {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`line = line - 1` could be simplified to 'line -= 1'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			 */
			if (line > 0 && line == getNumberOfLines()) {
				line = line - 1;
				// Inline nodeByLine start
				int remaining = line;
```

### ReplaceAssignmentWithOperatorAssignment
`replace = replace + " "` could be simplified to 'replace += " "'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
			if (spaceBeforeEmptyCloseTag) {
				// <foo attr1=""/> --> <foo attr1=""[space] />
				replace = replace + " ";
				width++; // add width for [space]
			}
```

### ReplaceAssignmentWithOperatorAssignment
`lineWidth = lineWidth - (startOffset - lineOffset)` could be simplified to 'lineWidth -= (startOffset - lineOffset)'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
				try {
					int lineOffset = textDocument.lineOffsetAt(startOffset);
					lineWidth = lineWidth - (startOffset - lineOffset);
				} catch (BadLocationException e) {
					LOGGER.log(Level.SEVERE, e.getMessage(), e);
```

### ReplaceAssignmentWithOperatorAssignment
`nbChars = nbChars + tabSize` could be simplified to 'nbChars += tabSize'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
			}
			if (!insertSpaces && xml.charAt(i) == '\t') {
				nbChars = nbChars + tabSize;
			} else {
				nbChars++;
```

### ReplaceAssignmentWithOperatorAssignment
`availableLineWidth = availableLineWidth - attrValuelength` could be simplified to 'availableLineWidth -= attrValuelength'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/participants/XSIFormatterParticipant.java`
#### Snippet
```java
				} else {
					formatterDocument.replaceLeftSpacesWithOneSpace(indentSpaceOffset, attrValueStart + i + 1, edits);
					availableLineWidth = availableLineWidth - attrValuelength;
				}
				locationNum++;
```

### ReplaceAssignmentWithOperatorAssignment
`fromStart = fromStart + adjust` could be simplified to 'fromStart += adjust'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java
				return false;
			}
			fromStart = fromStart + adjust;
		}
		int toStart = searchNode.getStart();
```

### ReplaceAssignmentWithOperatorAssignment
`toStart = toStart + adjust` could be simplified to 'toStart += adjust'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java
				return false;
			}
			toStart = toStart + adjust;
		}

```

### ReplaceAssignmentWithOperatorAssignment
`replaceText = replaceText + ">"` could be simplified to 'replaceText += "\>"'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/CloseTagCodeAction.java`
#### Snippet
```java
		String replaceText = replaceTagName;
		if (!element.isEndTagClosed()) {
			replaceText = replaceText + ">";
		}
		return CodeActionFactory.replace("Replace '" + tagName + "' with '" + replaceTagName + "' closing tag",
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

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
		});
		return sortedElements;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerSocketLauncher.java`
#### Snippet
```java
			final Launcher<LanguageClient> launcher = Launcher.createIoLauncher(languageServer, LanguageClient.class,
					in, out, executorService, (MessageConsumer it) -> {
						return it;
					});
			languageServer.setClient(launcher.getRemoteProxy());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/MultiLineStream.java`
#### Snippet
```java

	private static final Predicate<Integer> WHITESPACE_PREDICATE = ch -> {
		return ch == _WSP || ch == _TAB || ch == _NWL || ch == _LFD || ch == _CAR;
	};

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
	public CompletableFuture<AutoCloseTagResponse> closeTag(TextDocumentPositionParams params) {
		return xmlTextDocumentService.computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().doAutoClose(xmlDocument, params.getPosition(),
					getSharedSettings().getCompletionSettings(), cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
	public CompletableFuture<Position> matchingTagPosition(TextDocumentPositionParams params) {
		return xmlTextDocumentService.computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().getMatchingTagPosition(xmlDocument, params.getPosition(), cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<WorkspaceEdit> rename(RenameParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().doRename(xmlDocument, params.getPosition(), params.getNewName(),
					cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<CodeAction> resolveCodeAction(CodeAction unresolved) {
		return computeDOMAsync(unresolved.getData(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().resolveCodeAction(unresolved, xmlDocument, sharedSettings, cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	private void triggerValidationFor(Collection<ModelTextDocument<DOMDocument>> documents) {
		if (!documents.isEmpty()) {
			xmlLanguageServer.schedule(() -> {
				documents.forEach(document -> {
					try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<CompletionItem> resolveCompletionItem(CompletionItem unresolved) {
		return computeDOMAsync(unresolved.getData(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().resolveCompletionItem(unresolved, xmlDocument, sharedSettings,
					cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<ColorInformation>> documentColor(DocumentColorParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().findDocumentColors(xmlDocument, cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<SelectionRange>> selectionRange(SelectionRangeParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().getSelectionRanges(xmlDocument, params.getPositions(), cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		}
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().getCodeLens(xmlDocument, sharedSettings.getCodeLensSettings(),
					cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<DocumentLink>> documentLink(DocumentLinkParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().findDocumentLinks(xmlDocument);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<LinkedEditingRanges> linkedEditingRange(LinkedEditingRangeParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().findLinkedEditingRanges(xmlDocument, params.getPosition(), cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<FoldingRange>> foldingRange(FoldingRangeRequestParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().getFoldingRanges(xmlDocument, sharedSettings.getFoldingSettings(),
					cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		DOMParser parser = DOMParser.getInstance();
		this.documents = new ModelTextDocuments<DOMDocument>((document, cancelChecker) -> {
			return parser.parse(document, getXMLLanguageService().getResolverExtensionManager(), true, cancelChecker);
		});
		this.sharedSettings = new SharedSettings();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(DocumentHighlightParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().findDocumentHighlights(xmlDocument, params.getPosition(), cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<ColorPresentation>> colorPresentation(ColorPresentationParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().getColorPresentations(xmlDocument, params, cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<Hover> hover(HoverParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().doHover(xmlDocument, params.getPosition(), sharedSettings, cancelChecker);
		});
	}
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
	public CompletableFuture<List<? extends Location>> references(ReferenceParams params) {
		return computeDOMAsync(params.getTextDocument(), (xmlDocument, cancelChecker) -> {
			return getXMLLanguageService().findReferences(xmlDocument, params.getPosition(), params.getContext(),
					cancelChecker);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetDeserializer.java`
#### Snippet
```java
			if (prefixElt.isJsonArray()) {
				JsonArray prefixArray = (JsonArray) prefixElt;
				prefixArray.forEach(elt -> {
					prefixes.add(elt.getAsString());
				});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetDeserializer.java`
#### Snippet
```java
			if (bodyElt.isJsonArray()) {
				JsonArray bodyArray = (JsonArray) bodyElt;
				bodyArray.forEach(elt -> {
					body.add(elt.getAsString());
				});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
		Map<String, String> model = new HashMap<>();
		return getSnippets().stream().filter(snippet -> {
			return snippet.match(contextFilter, model);
		}).map(snippet -> {
			CompletionItem item = new CompletionItem();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
			CompletableFuture<Void> allFutures = CompletableFuture
					.allOf(futures.toArray(new CompletableFuture[futures.size()]));
			allFutures.thenAccept(Void -> {
				triggerValidation.accept(document);
			}).exceptionally(downloadException -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDHighlightingParticipant.java`
#### Snippet
```java

			// highlight all references of na|me in ATTLIST and child of <!ELEMENT
			DTDUtils.searchDTDOriginElementDecls(elementDecl, (origin, target) -> {
				highlights
						.add(new DocumentHighlight(XMLPositionUtility.createRange(origin), DocumentHighlightKind.Read));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/DTDHighlightingParticipant.java`
#### Snippet
```java

			// highlight the target <!ELEMENT nam|e
			DTDUtils.searchDTDTargetElementDecl(parameter, true, targetName -> {
				highlights.add(
						new DocumentHighlight(XMLPositionUtility.createRange(targetName), DocumentHighlightKind.Write));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDHighlightingParticipant.java`
#### Snippet
```java
			boolean searchInExternalSchema = false;
			XSDUtils.searchXSTargetAttributes(originAttr, bindingType, true, searchInExternalSchema,
					(targetNamespacePrefix, targetAttr) -> {
						highlights.add(new DocumentHighlight(
								XMLPositionUtility.createRange(targetAttr.getNodeAttrValue().getStart(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogPlugin.java`
#### Snippet
```java
		String[] catalogs = cmSettings.getCatalogs();
		Set<String> invalidCatalogs = Arrays.stream(catalogs).filter(c -> {
			return Files.notExists(FilesUtils.getPath(c));
		}).collect(Collectors.toSet());

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGHighlightingParticipant.java`
#### Snippet
```java
			boolean searchInExternalSchema = false;
			RelaxNGUtils.searchRNGTargetAttributes(originAttr, bindingType, true, searchInExternalSchema,
					(targetNamespacePrefix, targetAttr) -> {
						highlights.add(new DocumentHighlight(
								XMLPositionUtility.createRange(targetAttr.getNodeAttrValue().getStart(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNodeFactory.java`
#### Snippet
```java

	private static final Predicate<Character> NAME_PREDICATE = ch -> {
		return !Character.isWhitespace(ch);
	};

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesHighlightingParticipant.java`
#### Snippet
```java
		// Highlight the referenced 'from' nodes
		SearchEngine.getInstance().search(query,
				(fromSearchNode, toSearchNode, expression) -> {
					highlights.add(new DocumentHighlight(
							XMLPositionUtility.createRange(fromSearchNode),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesLinkedEditingRangesParticipant.java`
#### Snippet
```java
		int previousSize = ranges.size();
		SearchEngine.getInstance().search(query,
				(fromSearchNode, toSearchNode, expression) -> {
					ranges.add(fromSearchNode.createRange(true));
				},
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `externalGrammarFromNamespaceURI` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private String schemaPrefix;
	private CancelChecker cancelChecker;
	private String externalGrammarFromNamespaceURI;

	public DOMDocument(TextDocument textDocument, URIResolverExtensionManager resolverExtensionManager) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `hasNamespaces` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java

	private final TextDocument textDocument;
	private boolean hasNamespaces;
	private Map<String, String> externalGrammarLocation;
	private String schemaInstancePrefix;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noNamespaceSchemaLocation` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java

	private SchemaLocation schemaLocation;
	private NoNamespaceSchemaLocation noNamespaceSchemaLocation;
	private List<XMLModel> xmlModels;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schemaInstancePrefix` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private boolean hasNamespaces;
	private Map<String, String> externalGrammarLocation;
	private String schemaInstancePrefix;
	private String schemaPrefix;
	private CancelChecker cancelChecker;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schemaPrefix` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private Map<String, String> externalGrammarLocation;
	private String schemaInstancePrefix;
	private String schemaPrefix;
	private CancelChecker cancelChecker;
	private String externalGrammarFromNamespaceURI;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schemaLocation` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
public class DOMDocument extends DOMNode implements Document {

	private SchemaLocation schemaLocation;
	private NoNamespaceSchemaLocation noNamespaceSchemaLocation;
	private List<XMLModel> xmlModels;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `referencedExternalGrammarInitialized` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private List<XMLModel> xmlModels;

	private boolean referencedExternalGrammarInitialized;
	private boolean referencedSchemaInitialized;
	private final URIResolverExtensionManager resolverExtensionManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `externalGrammarLocation` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private final TextDocument textDocument;
	private boolean hasNamespaces;
	private Map<String, String> externalGrammarLocation;
	private String schemaInstancePrefix;
	private String schemaPrefix;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `referencedSchemaInitialized` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java

	private boolean referencedExternalGrammarInitialized;
	private boolean referencedSchemaInitialized;
	private final URIResolverExtensionManager resolverExtensionManager;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xmlModels` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	private SchemaLocation schemaLocation;
	private NoNamespaceSchemaLocation noNamespaceSchemaLocation;
	private List<XMLModel> xmlModels;

	private boolean referencedExternalGrammarInitialized;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `languageClient` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
	private final XMLTextDocumentService xmlTextDocumentService;
	private final XMLWorkspaceService xmlWorkspaceService;
	private XMLLanguageClientAPI languageClient;
	private final ScheduledExecutorService delayer;
	private Integer parentProcessId;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lineTracker` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
	private static String DEFAULT_DELIMTER = System.lineSeparator();

	private ILineTracker lineTracker;

	private boolean incremental;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `model` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocument.java`
#### Snippet
```java
	private final BiFunction<TextDocument, CancelChecker, T> parse;

	private T model;

	public ModelTextDocument(TextDocumentItem document, BiFunction<TextDocument, CancelChecker, T> parse) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `commandService` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	private IXMLDocumentProvider documentProvider;
	private IXMLValidationService validationService;
	private IXMLCommandService commandService;

	private InitializeParams params;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `initialized` is accessed in both synchronized and unsynchronized contexts
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/XMLExtensionsRegistry.java`
#### Snippet
```java
	private ISaveContext initialSaveContext;

	private boolean initialized;

	private IXMLNotificationService notificationService;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	 */
	@Override
	public boolean isClosed() {
		return super.isClosed();
	}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelValidator.java`
#### Snippet
```java
public interface XMLModelValidator extends XMLComponent, XMLDocumentFilter{

	void setLocator(XMLLocator locator);

	void setXMLReader(XMLReader documentHandler);
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelValidator.java`
#### Snippet
```java
	void setLocator(XMLLocator locator);

	void setXMLReader(XMLReader documentHandler);

}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMProcessingInstruction.java`
#### Snippet
```java
	String target;
	boolean prolog = false;
	boolean processingInstruction = false;
	int startContent;
	int endContent;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMProcessingInstruction.java`
#### Snippet
```java
	boolean startTagClose;
	String target;
	boolean prolog = false;
	boolean processingInstruction = false;
	int startContent;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	public static final short DTD_DECL_NODE = 105;

	boolean closed = false;

	private XMLNamedNodeMap<DOMAttr> attributeNodes;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	public static final String FILE_SCHEME = "file://";
	public static final String LEMMINX_WORKDIR_KEY = "lemminx.workdir";
	private static String cachePathSetting = null;

	private static Pattern uriSchemePattern = Pattern.compile("^([a-zA-Z\\-]+:\\/\\/).*");
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
	String lastDoctypeKind;
	String url;
	boolean isInsideDTDContent = false; // Either internal dtd in xml file OR external dtd in dtd file
	boolean isDeclCompleted = false; // If any type of DTD declaration was supplied with all the required properties
	TokenType tempToken;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
	String url;
	boolean isInsideDTDContent = false; // Either internal dtd in xml file OR external dtd in dtd file
	boolean isDeclCompleted = false; // If any type of DTD declaration was supplied with all the required properties
	TokenType tempToken;
	boolean isDTDFile;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
	 * set to true description CDATA #IMPLIED >
	 */
	boolean isInitialAttlistDeclCompleted = false;
	private int nbBraceOpened;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathElementMatcher.java`
#### Snippet
```java

	public static final String ANY_ELEMENT_NAME = "*";
	private List<XPathAttributeMatcher> attributes = null;

	private final String prefix;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormattingConstraints.java`
#### Snippet
```java
	private int availableLineWidth = 0;
	private int indentLevel = 0;
	private int mixedContentIndentLevel = 0;

	/**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormattingConstraints.java`
#### Snippet
```java
	private FormatElementCategory formatElementCategory;

	private int availableLineWidth = 0;
	private int indentLevel = 0;
	private int mixedContentIndentLevel = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormattingConstraints.java`
#### Snippet
```java

	private int availableLineWidth = 0;
	private int indentLevel = 0;
	private int mixedContentIndentLevel = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLTelemetrySettings.java`
#### Snippet
```java
public class XMLTelemetrySettings {

	private boolean enabled = false;

	public XMLTelemetrySettings() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLCodeLensSettings.java`
#### Snippet
```java
public class XMLCodeLensSettings {

	private boolean enabled = false;

	private ExtendedCodeLensCapabilities codeLens;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	private Locale fLocale = null;
	private ResourceBundle fResourceBundle = null;
	private ResourceBundle newResourceBundle = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java

	// private objects to cache the locale and resource bundle
	private Locale fLocale = null;
	private ResourceBundle fResourceBundle = null;
	private ResourceBundle newResourceBundle = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
	// private objects to cache the locale and resource bundle
	private Locale fLocale = null;
	private ResourceBundle fResourceBundle = null;
	private ResourceBundle newResourceBundle = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java

	// private objects to cache the locale and resource bundle
	private Locale fLocale = null;
	private ResourceBundle fResourceBundle = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java
	// private objects to cache the locale and resource bundle
	private Locale fLocale = null;
	private ResourceBundle fResourceBundle = null;

	//
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/ContentModelSettings.java`
#### Snippet
```java
	private XMLDownloadExternalResourcesSettings downloadExternalResources;

	private String[] catalogs = null;

	private XMLFileAssociation[] fileAssociations;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/AggregateRelatedInfoFinder.java`
#### Snippet
```java
	};

	private static AggregateRelatedInfoFinder INSTANCE = null;

	private AggregateRelatedInfoFinder() {}
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclParameter.java`
#### Snippet
```java
 * DTDDeclParameter
 */
public class DTDDeclParameter implements DOMRange, TargetRange {

	private final DTDDeclNode ownerNode;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LSPClientLogHandler.java`
#### Snippet
```java
 * LSP client JUL {@link Handler}
 */
public class LSPClientLogHandler extends Handler {

	private LanguageClient languageClient;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLExcludedSymbolFile.java`
#### Snippet
```java
 * XMLExcludedSymbolFiles
 */
public class XMLExcludedSymbolFile extends PathPatternMatcher{

	public XMLExcludedSymbolFile(String pattern) {
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/PathPatternMatcher.java`
#### Snippet
```java
import java.util.Objects;

public class PathPatternMatcher {

	private transient PathMatcher pathMatcher;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-13-02-02-50.291.html`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLWorkspaceService.java`
#### Snippet
```java
					return handler.executeCommand(params, xmlLanguageServer.getSharedSettings(), cancelChecker);
				} catch (Exception e) {
					if (e instanceof ResponseErrorException) {
						throw (ResponseErrorException) e;
					} else if (e instanceof CancellationException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLWorkspaceService.java`
#### Snippet
```java
					if (e instanceof ResponseErrorException) {
						throw (ResponseErrorException) e;
					} else if (e instanceof CancellationException) {
						throw (CancellationException) e;
					}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityResolver.java`
#### Snippet
```java
			return entityResolver.resolveEntity(resourceIdentifier);
		} catch (CacheResourceException e) {
			if (e instanceof CacheResourceDownloadingException) {
				CompletableFuture<Path> future = ((CacheResourceDownloadingException) e).getFuture();
				if (future != null) {
```

## RuleId[id=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLReference.java`
#### Snippet
```java
	private final XMLExtensionsRegistry extensionsRegistry;

	private static Logger LOGGER = Logger.getLogger(XMLReference.class.getName());

	public XMLReference(XMLExtensionsRegistry extensionsRegistry) {
```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
	private static final String WORD_PATTERN = "[^\\s>]+";

	private static Logger LOGGER = Logger.getLogger(XMLLinkedEditing.class.getName());

	private final XMLExtensionsRegistry extensionsRegistry;
```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLDocumentLink.java`
#### Snippet
```java
	private final XMLExtensionsRegistry extensionsRegistry;

	private static Logger LOGGER = Logger.getLogger(XMLDocumentLink.class.getName());

	public XMLDocumentLink(XMLExtensionsRegistry extensionsRegistry) {
```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
 */
class XMLFoldings {
	private static Logger LOGGER = Logger.getLogger(XMLFoldings.class.getName());
	private final XMLExtensionsRegistry extensionsRegistry;

```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogDocumentLinkParticipant.java`
#### Snippet
```java
public class XMLCatalogDocumentLinkParticipant implements IDocumentLinkParticipant {

	private static Logger LOGGER = Logger.getLogger(XMLCatalogDocumentLinkParticipant.class.getName());

	@Override
```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeDocumentLinkParticipant.java`
#### Snippet
```java
public class XIncludeDocumentLinkParticipant implements IDocumentLinkParticipant {

	private static Logger LOGGER = Logger.getLogger(XIncludeDocumentLinkParticipant.class.getName());

	@Override
```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
public class XMLFileAssociationResolverExtension implements URIResolverExtension, IExternalGrammarLocationProvider {

	private static Logger LOGGER = Logger.getLogger(XMLFileAssociationResolverExtension.class.getName());

	private String rootUri;
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `errorCode` of exception class
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadedException.java`
#### Snippet
```java
	}

	private CacheResourceDownloadedError errorCode;

	public CacheResourceDownloadedException(String resourceURI, Path resourceCachePath,  String cause, Throwable e) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/ContentModelSettings.java`
#### Snippet
```java
	 */
	public String[] getCatalogs() {
		return catalogs == null ? new String[0] : catalogs;
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
			if (xmlCatalogFiles.size() > 0) {
				LSPXMLCatalogResolver catalogResolver = new LSPXMLCatalogResolver(
						xmlCatalogFiles.toArray(new String[0]));
				setCatalogResolver(catalogResolver);
			} else {
```

## RuleId[id=DuplicateThrows]
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
Variable `renameRequest` initializer `null` is redundant
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
		cancelChecker.checkCanceled();
		
		RenameRequest renameRequest = null;

		try {
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
Condition `node != null` is always `true`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
				node = node.getParentNode();
			}
			if (node != null && node.isElement() && ((DOMElement) node).getTagName() != null) {
				snippet = ((DOMElement) node).getTagName() + ">$0";
			}
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
Value `hasOrphanEndTag` is always 'false'
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
Value `targetNamespacePrefix` is always 'null'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java

		NodeList nodes = documentElement.getChildNodes();
		searchRNGOriginAttributes(nodes, targetAttrs, targetNamespacePrefix, collector, cancelChecker);
	}

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

### ConstantValue
Value `hasGrammar` is always 'false'
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
	 */
	public XMLSymbolExpressionFilter getFilterForInlineAttr(DOMAttr attrNode){
		if (expressions != null && expressions.length > 0) {
			for (XMLSymbolExpressionFilter expression : expressions) {
				if (expression.match(attrNode) && expression.isInlineAttribute()) {
```

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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java

	private static boolean onlyContainsNull(Object[] arr) {
		if (arr == null || arr.length == 0) {
			return true;
		}
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `XMLServerLauncher` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerLauncher.java`
#### Snippet
```java
import org.eclipse.lsp4j.services.LanguageServer;

public class XMLServerLauncher {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/Constants.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class Constants {

	public final static int _EXL = "!".codePointAt(0);
```

### UtilityClassWithoutPrivateConstructor
Class `LogHelper` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LogHelper.java`
#### Snippet
```java
 * LogHelper
 */
public class LogHelper {

	private static final String ROOT_LOGGER = "";
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/IOUtils.java`
#### Snippet
```java
 *
 */
public class IOUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `MarkupContentFactory` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkupContentFactory.java`
#### Snippet
```java
 *
 */
public class MarkupContentFactory {

	public static final String MARKDOWN_SEPARATOR = "___";
```

### UtilityClassWithoutPrivateConstructor
Class `CodeActionFactory` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/CodeActionFactory.java`
#### Snippet
```java
 *
 */
public class CodeActionFactory {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `DataEntryField` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
 *
 */
public class DataEntryField {

	private static final String DATA_URI_FIELD = "uri";
```

### UtilityClassWithoutPrivateConstructor
Class `TextEditUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/TextEditUtils.java`
#### Snippet
```java
 *
 */
public class TextEditUtils {

	private static final Logger LOGGER = Logger.getLogger(TextEditUtils.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `ArgumentsUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/commands/ArgumentsUtils.java`
#### Snippet
```java
 *
 */
public class ArgumentsUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `InitializationTelemetryInfo` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/InitializationTelemetryInfo.java`
#### Snippet
```java
 *
 */
public class InitializationTelemetryInfo {

	public static final String JVM_MEMORY_MAX = "jvm.memory.max";
```

### UtilityClassWithoutPrivateConstructor
Class `DocumentTelemetryInfo` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/telemetry/DocumentTelemetryInfo.java`
#### Snippet
```java
import org.eclipse.lemminx.utils.URIUtils;

public class DocumentTelemetryInfo {

	private static final String DOC_PROP_EXT = "file.extension";
```

### UtilityClassWithoutPrivateConstructor
Class `DTDValidator` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/participants/diagnostics/DTDValidator.java`
#### Snippet
```java
 *
 */
public class DTDValidator {

	private static final Logger LOGGER = Logger.getLogger(DTDValidator.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `DTDUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/utils/DTDUtils.java`
#### Snippet
```java
 *
 */
public class DTDUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `XSDValidator` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/XSDValidator.java`
#### Snippet
```java
 *
 */
public class XSDValidator {

	private static final Logger LOGGER = Logger.getLogger(XSDValidator.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `XSISchemaModel` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
 * https://www.w3.org/2001/XMLSchema-instance
 */
public class XSISchemaModel {

	private static String lineSeparator = System.lineSeparator();
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ReflectionUtils.java`
#### Snippet
```java
 *
 */
public class ReflectionUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `LSPSecurityManager` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPSecurityManager.java`
#### Snippet
```java
 *
 */
public class LSPSecurityManager {

	private static final Logger LOGGER = Logger.getLogger(LSPSecurityManager.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `ColorUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
 *      "https://github.com/microsoft/vscode-css-languageservice/blob/main/src/languageFacts/colors.ts">https://github.com/microsoft/vscode-css-languageservice/blob/main/src/languageFacts/colors.ts</a>
 */
public class ColorUtils {

	private static final int Digit0 = 48;
```

### UtilityClassWithoutPrivateConstructor
Class `PrologModel` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/prolog/PrologModel.java`
#### Snippet
```java
 * https://www.w3.org/2001/XMLSchema-instance
 */
public class PrologModel {
	public static final String VERSION_NAME = "version";
	public static final String ENCODING_NAME = "encoding";
```

### UtilityClassWithoutPrivateConstructor
Class `CatalogUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogUtils.java`
#### Snippet
```java
 * Utility functions for working with XML catalog documents
 */
public class CatalogUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `RNGValidator` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGValidator.java`
#### Snippet
```java
 *
 */
public class RNGValidator {

	private static final Logger LOGGER = Logger.getLogger(RNGValidator.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `XIncludeUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeUtils.java`
#### Snippet
```java
 *
 */
public class XIncludeUtils {

	public static final String XINCLUDE_ELT = "xi:include";
```

### UtilityClassWithoutPrivateConstructor
Class `XSDUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
 *
 */
public class XSDUtils {

	public static final String SCHEMA_LOCATION_ATTR = "schemaLocation";
```

### UtilityClassWithoutPrivateConstructor
Class `SearchNodeFactory` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNodeFactory.java`
#### Snippet
```java
 *
 */
public class SearchNodeFactory {

	private static final Predicate<Character> NAME_PREDICATE = ch -> {
```

### UtilityClassWithoutPrivateConstructor
Class `SearchQueryFactory` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
 *
 */
public class SearchQueryFactory {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `XMLChar` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/XMLChar.java`
#### Snippet
```java
 *
 */
public class XMLChar {

	/** Character flags. */
```

### UtilityClassWithoutPrivateConstructor
Class `XMLModelUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLModelUtils.java`
#### Snippet
```java
 * 
 */
public class XMLModelUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `RelaxNGUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
 *
 */
public class RelaxNGUtils {

	public static final String GRAMMAR_TAG = "grammar";
```

### UtilityClassWithoutPrivateConstructor
Class `MissingElementDataConstants` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/MissingElementDataConstants.java`
#### Snippet
```java
 *
 */
public class MissingElementDataConstants {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `XMLValidator` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
 *
 */
public class XMLValidator {

	private static final Logger LOGGER = Logger.getLogger(XMLValidator.class.getName());
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/ISymbolsProviderParticipant.java`
#### Snippet
```java

	public enum SymbolStrategy {
		UNADAPTABLE, INSERT, REPLACE;
	}

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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java

	public static enum DataType {
		UNKNOWN, DATE, DATE_TIME, DECIMAL, BOOLEAN, INTEGER;
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNode.java`
#### Snippet
```java

	public static enum Direction {
		FROM, TO;
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
Method invocation `isElement` may produce `NullPointerException`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		} else if (cBefore == '<' && c == '/') { // Case: <a> </|
			DOMNode node = xmlDocument.findNodeBefore(offset);
			while ((node != null && node.isClosed()) || (node.isElement() && ((DOMElement) node).isOrphanEndTag())) {
				node = node.getParentNode();
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
				elementEndOffset = element.getStartTagCloseOffset();
			}
			if (!isSameLine(getLastAttribute(element).getEnd(), elementEndOffset)) {
				this.xmlBuilder.linefeed();
				this.xmlBuilder.indent(this.indentLevel);
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/TextEditUtils.java`
#### Snippet
```java
		spans.add(text.substring(lastModifiedOffset));
		return spans.stream() //
				.collect(Collectors.joining());
	}

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

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `merge()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationRootSettings.java`
#### Snippet
```java
	}

	public XMLValidationRootSettings merge(XMLValidationRootSettings settings) {
		if (settings != null) {
			this.filters = settings.getFilters();
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
	public Collection<DOMDocument> getAllDocuments() {
		return xmlTextDocumentService.allDocuments().stream() //
				.map(m -> m.getModel()) //
				.filter(Objects::nonNull) //
				.collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	/** Public for test purposes */
	public static void resetDeployPath() {
		DEPLOYED_BASE_PATH = Suppliers.memoize(() -> getDeployedBasePath());
	}

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
					.findDefinition(xmlDocument, params.getPosition(), cancelChecker) //
					.stream() //
					.map(locationLink -> XMLPositionUtility.toLocation(locationLink)) //
					.collect(Collectors.toList());
			return Either.forLeft(locations);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
					.findTypeDefinition(xmlDocument, params.getPosition(), cancelChecker) //
					.stream() //
					.map(locationLink -> XMLPositionUtility.toLocation(locationLink)) //
					.collect(Collectors.toList());
			return Either.forLeft(locations);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java

		List<CMElementDeclaration> sortedElements = possibelRequiredElements.stream().collect(Collectors.toList());
		Collections.sort(sortedElements, (e1, e2) -> {
			return ((CMElementDeclaration) e1).getLocalName().compareTo(((CMElementDeclaration) e2).getLocalName());
		});
		return sortedElements;
	}
```

### ComparatorCombinators
Can be replaced with 'Comparator' chain
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java

	private static List<FoldingRange> limitRanges(List<FoldingRange> ranges, int rangeLimit) {
		Collections.sort(ranges, (r1, r2) -> {
			int diff = r1.getStartLine() - r2.getStartLine();
			if (diff == 0) {
				diff = r1.getEndLine() - r2.getEndLine();
			}
			return diff;
		});

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'future' in a Serializable class
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceDownloadingException.java`
#### Snippet
```java
	}

	private final CompletableFuture<Path> future;

	private final CacheResourceDownloadingError errorCode;
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

## RuleId[id=UnnecessaryToStringCall]
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

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/NoGrammarConstraintsCodeAction.java`
#### Snippet
```java

		String xmlModelInsertText = (documentElement == null && document.getLastChild() != null ? delimiter : "")
				+ xsdWithXmlModel.toString();
		Position xmlModelPosition = document.positionAt(beforeTagOffset);

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
					if (delimiter.equals(c)) {
						newLineCounter++;
						i++; // skip the second char of the delimiter
					}
				}
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
						return false;
					} else {
						i--;
					}

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMCDATAFormatter.java`
#### Snippet
```java
					int contentStart = i;
					while (i < cDATAEndContent && !Character.isWhitespace(text.charAt(i + 1))) {
						i++;
					}
					contentEnd = i;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMCommentFormatter.java`
#### Snippet
```java
				int contentStart = i;
				while (i + 1 < commentNode.getEnd() && !Character.isWhitespace(text.charAt(i + 1))) {
					i++;
				}
				int contentEnd = i + 1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMTextFormatter.java`
#### Snippet
```java
				int contentStart = i;
				while (i + 1 < textEnd && !Character.isWhitespace(text.charAt(i + 1))) {
					i++;
				}
				int contentEnd = i + 1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
				if (delimiter.equals(c)) {
					newLineCounter++;
					i--; // skip the second char of the delimiter
				}
			} else {
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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			if (isDeclCompleted == false) {
				String doctypeName = doctypeName();
				if (!doctypeName.equals("")) {
					state = ScannerState.DTDAfterDoctypeName;
					return finishToken(offset, TokenType.DTDDoctypeName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}
			url = stream.advanceIfRegExp(URL_VALUE_REGEX);
			if (!url.equals("")) {
				state = ScannerState.DTDAfterDoctypePublicId;
				return finishToken(offset, TokenType.DTDDoctypePublicId);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			state = ScannerState.DTDWithinDoctype;
			url = stream.advanceIfRegExp(URL_VALUE_REGEX);
			if (!url.equals("")) {
				return finishToken(offset, TokenType.DTDDoctypeSystemId);
			}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			state = ScannerState.DTDWithinDoctype;
			url = stream.advanceIfRegExp(URL_VALUE_REGEX); // scan the System Identifier URL
			if (!url.equals("")) {
				return finishToken(offset, TokenType.DTDDoctypeSystemId);
			}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(Constants.ELEMENT_NAME_REGEX).equals("")) {
				state = ScannerState.DTDElementAfterName;
				return finishToken(offset, TokenType.DTDElementDeclName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExpGroup1(DTD_ELEMENT_CATEGORY).equals("")) {
				isDeclCompleted = true;
				state = ScannerState.DTDWithinElement;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

			if (isInitialAttlistDeclCompleted == false
					&& !stream.advanceIfRegExp(Constants.ELEMENT_NAME_REGEX).equals("")) {
				state = ScannerState.DTDAfterAttlistElementName;
				return finishToken(offset, TokenType.DTDAttlistElementName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(Constants.ATTRIBUTE_NAME_REGEX).equals("")) {
				state = ScannerState.DTDAfterAttlistAttributeName;
				return finishToken(offset, TokenType.DTDAttlistAttributeName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExpGroup1(Constants.DTD_ATTLIST_ATTRIBUTE_TYPE).equals("")) {
				state = ScannerState.DTDAfterAttlistAttributeType;
				return finishToken(offset, TokenType.DTDAttlistAttributeType);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExpGroup1(Constants.DTD_ATTLIST_ATTRIBUTE_VALUE).equals("")) {
				isInitialAttlistDeclCompleted = true; // we completed the initial attribute declaration
				isDeclCompleted = true;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(Constants.ELEMENT_NAME_REGEX).equals("")) {
				state = ScannerState.DTDAfterEntityName;
				return finishToken(offset, TokenType.DTDEntityName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(Constants.DTD_ENTITY_VALUE).equals("")) {
				isDeclCompleted = true;
				state = ScannerState.DTDWithinEntity;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(URL_VALUE_REGEX).equals("")) {
				state = ScannerState.DTDAfterEntitySYSTEM;
				return finishToken(offset, TokenType.DTDEntityPublicId);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(URL_VALUE_REGEX).equals("")) {
				isDeclCompleted = true;
				state = ScannerState.DTDWithinEntity;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}

			if (!stream.advanceIfRegExp(ELEMENT_NAME_REGEX).equals("")) {
				state = ScannerState.DTDAfterNotationName;
				return finishToken(offset, TokenType.DTDNotationName);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			}
			url = stream.advanceIfRegExp(URL_VALUE_REGEX);
			if (!url.equals("")) {
				isDeclCompleted = true;
				state = ScannerState.DTDAfterNotationPublicId;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			state = ScannerState.DTDWithinNotation;
			url = stream.advanceIfRegExp(URL_VALUE_REGEX);
			if (!url.equals("")) {
				isDeclCompleted = true;
				state = ScannerState.DTDAfterNotationName;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java
			state = ScannerState.DTDAfterNotationName;
			url = stream.advanceIfRegExp(URL_VALUE_REGEX); // scan the System Identifier URL
			if (!url.equals("")) {
				isDeclCompleted = true;
				return finishToken(offset, TokenType.DTDNotationSystemId);
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerLauncher.java`
#### Snippet
```java
		}
		InputStream in = System.in;
		PrintStream out = System.out;
		System.setIn(new NoOpInputStream());
		System.setOut(new NoOpPrintStream());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/parser/XMLScanner.java`
#### Snippet
```java

	private void log(String message) {
		System.err.println(message);
	}

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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 */
	public static String encodePath(String path) {
		return path.replace(" ", "%20");
	}
	
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
			}
		}
		return pathString.replace("/", "\\");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
				pathString = System.getProperty("user.home") + (pathString.length() > 1 ? pathString.substring(1) : "");
			}
			pathString = pathString.replace("/", File.separator);
			pathString = pathString.replace("\\", File.separator);
			Path p = Paths.get(pathString);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
			}
			pathString = pathString.replace("/", File.separator);
			pathString = pathString.replace("\\", File.separator);
			Path p = Paths.get(pathString);
			pathString = p.normalize().toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	 */
	public static File toFile(String fileUri) {
		String convertedUri = fileUri.replace("file:///", "file:/"); //$NON-NLS-1$//$NON-NLS-2$
		convertedUri = convertedUri.replace("file://", "file:/"); //$NON-NLS-1$//$NON-NLS-2$
		return new File(URI.create(convertedUri));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	public static File toFile(String fileUri) {
		String convertedUri = fileUri.replace("file:///", "file:/"); //$NON-NLS-1$//$NON-NLS-2$
		convertedUri = convertedUri.replace("file://", "file:/"); //$NON-NLS-1$//$NON-NLS-2$
		return new File(URI.create(convertedUri));
	}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java

		}
		pathString = pathString.replace("/", "\\");
		return pathString;
	}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetDeserializer.java`
#### Snippet
```java
			if (label.contains("$")) {
				if (!StringUtils.isEmpty(snippet.getDescription())) {
					label = label.replace("$description", snippet.getDescription());
				}
				if (!snippet.getPrefixes().isEmpty()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetDeserializer.java`
#### Snippet
```java
				}
				if (!snippet.getPrefixes().isEmpty()) {
					label = label.replace("$prefix", snippet.getPrefixes().get(0));
				}
			}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
		if (!isWindows) {
			if ("\\".equals(slashInAttribute)) { // Backslash used in Unix
				valuePath = valuePath.replace("\\", "/");
			}
		}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/AssociateGrammarCommand.java`
#### Snippet
```java
			Path documentPath = FilesUtils.getPath(documentURI);
			Path relativePath = documentPath.getParent().relativize(grammarPath);
			return relativePath.toString().replaceAll("\\\\", "/");
		} catch (Exception e) {
			return fullPathGrammarURI;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.lsp4j.jsonrpc` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLServerLauncher.java`
#### Snippet
```java
	 *
	 * @param launcherFuture The future returned by
	 *                       {@link org.eclipse.lsp4j.jsonrpc.Launcher#startListening()}.
	 *                       (I'm not 100% sure how it meant to be used though, as
	 *                       it's undocumented...)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
 *
 */
public class DOMDocumentType extends DTDDeclNode implements org.w3c.dom.DocumentType {

	public static enum DocumentTypeKind {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMComment.java`
#### Snippet
```java
 *
 */
public class DOMComment extends DOMCharacterData implements org.w3c.dom.Comment {

	boolean commentSameLineEndTag;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMText.java`
#### Snippet
```java
 *
 */
public class DOMText extends DOMCharacterData implements org.w3c.dom.Text {

	public DOMText(int start, int end) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMProcessingInstruction.java`
#### Snippet
```java
 *
 */
public class DOMProcessingInstruction extends DOMCharacterData implements org.w3c.dom.ProcessingInstruction {

	boolean startTagClose;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
 *
 */
public class DOMAttr extends DOMNode implements org.w3c.dom.Attr {

	public static final String XMLNS_ATTR = "xmlns";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 */
	@Override
	public DOMNode renameNode(org.w3c.dom.Node n, String namespaceURI, String qualifiedName) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 */
	@Override
	public DOMNode importNode(org.w3c.dom.Node importedNode, boolean deep) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	 */
	@Override
	public DOMNode adoptNode(org.w3c.dom.Node source) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java

	@Override
	public void setIdAttributeNode(org.w3c.dom.Attr arg0, boolean arg1) throws DOMException {
	}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java

	@Override
	public DOMAttr setAttributeNodeNS(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java

	@Override
	public DOMAttr removeAttributeNode(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java

	@Override
	public DOMAttr setAttributeNode(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
 *
 */
public class DOMElement extends DOMNode implements org.w3c.dom.Element {

	String tag;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 */
	@Override
	public org.w3c.dom.Node cloneNode(boolean deep) {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public boolean isSameNode(org.w3c.dom.Node arg0) {
		return false;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node removeChild(org.w3c.dom.Node arg0) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node removeChild(org.w3c.dom.Node arg0) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public boolean isEqualNode(org.w3c.dom.Node arg0) {
		return false;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

		@Override
		public T setNamedItemNS(org.w3c.dom.Node arg0) throws DOMException {
			throw new UnsupportedOperationException();
		}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

		@Override
		public T setNamedItem(org.w3c.dom.Node arg0) throws DOMException {
			throw new UnsupportedOperationException();
		}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

	@Override
	public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 */
	@Override
	public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 */
	@Override
	public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.w3c.dom` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	 */
	@Override
	public short compareDocumentPosition(org.w3c.dom.Node other) throws DOMException {
		throw new UnsupportedOperationException();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/IOUtils.java`
#### Snippet
```java
	 */
	public static String convertStreamToString(InputStream is) {
		try (Scanner s = new java.util.Scanner(is)) {
			s.useDelimiter("\\A");
			return s.hasNext() ? s.next() : "";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.lemminx.client` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/ExtendedClientCapabilities.java`
#### Snippet
```java
	 * Returns true if the client supports the open settings command and false otherwise
	 *
	 * See {@link org.eclipse.lemminx.client.ClientCommands#OPEN_SETTINGS}
	 *
	 * @return true if the client supports the open settings command and false otherwise
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.lemminx.settings` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
#### Snippet
```java
 * All defaults should be set here to eventually be overridden if needed.
 */
public class XMLFormattingOptions extends org.eclipse.lemminx.settings.LSPFormattingOptions {

	public static final String DEFAULT_QUOTATION = "\"";
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
				try {
					eid = XMLEntityManager.expandSystemId(externalDoctype, locator.getExpandedSystemId(), false);
				} catch (java.io.IOException e) {
				}
				XMLDTDDescription grammarDesc = new XMLDTDDescription(null, externalDoctype,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java
				}

				msg = java.text.MessageFormat.format(msg, arguments);
			} catch (Exception e) {
				msg = fResourceBundle.getString("FormatFailed");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java
			if (arguments != null) {
				try {
					msg = java.text.MessageFormat.format(msg, arguments);
				} catch (Exception e) {
					msg = fResourceBundle.getString("FormatFailed");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPSAXParser.java`
#### Snippet
```java
		try {
			eid = XMLEntityManager.expandSystemId(systemId, locator.getExpandedSystemId(), false);
		} catch (java.io.IOException e) {
		}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.lemminx.customservice` is unnecessary and can be removed
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/customservice/ActionableNotification.java`
#### Snippet
```java
 * for the xml/actionableNotification notification.
 * 
 * See {@link org.eclipse.lemminx.customservice.XMLLanguageClientAPI}
 */
public class ActionableNotification {
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DOMCharacterData()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMCharacterData.java`
#### Snippet
```java
	private String delimiter;

	public DOMCharacterData(int start, int end) {
		super(start, end);
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AttrNameOrValue()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		private final int end;

		public AttrNameOrValue(int start, int end) {
			this.start = start;
			this.end = end;
```

### NonProtectedConstructorInAbstractClass
Constructor `DOMNode()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	}

	public DOMNode(int start, int end) {
		this.start = start;
		this.end = end;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractXPathNodeMatcher()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/AbstractXPathNodeMatcher.java`
#### Snippet
```java
	private XPathMatcher ownerMatcher;

	public AbstractXPathNodeMatcher(XPathMatcher ownerMatcher) {
		this.ownerMatcher = ownerMatcher;
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractXMLNotifier()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/AbstractXMLNotifier.java`
#### Snippet
```java
	protected final Map<IXMLSettingFeature /* feature name */, Set<String>> cache;

	public AbstractXMLNotifier(IXMLNotificationService notificationService) {
		this.notificationService = notificationService;
		this.cache = new HashMap<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPositionRequest()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/AbstractPositionRequest.java`
#### Snippet
```java
	private LineIndentInfo indentInfo;

	public AbstractPositionRequest(DOMDocument xmlDocument, Position position, XMLExtensionsRegistry extensionsRegistry)
			throws BadLocationException {
		this.xmlDocument = xmlDocument;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSaveContext()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/save/AbstractSaveContext.java`
#### Snippet
```java
	private final Object settings;

	public AbstractSaveContext(Object settings) {
		this(null, settings);
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSaveContext()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/save/AbstractSaveContext.java`
#### Snippet
```java
	}

	public AbstractSaveContext(String uri) {
		this(uri, null);
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDOMDocumentCommandHandler()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/commands/AbstractDOMDocumentCommandHandler.java`
#### Snippet
```java
	private final IXMLDocumentProvider documentProvider;

	public AbstractDOMDocumentCommandHandler(IXMLDocumentProvider documentProvider) {
		this.documentProvider = documentProvider;
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractElementCompletionItem()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
	private final transient ICompletionRequest request;

	public AbstractElementCompletionItem(String tagName, S sourceElement, G generator,
			ICompletionRequest request) {
		this.tagName = tagName;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractReferencedGrammarLSPErrorReporter()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
	private final boolean hasRelatedInformation;

	public AbstractReferencedGrammarLSPErrorReporter(String source, DOMDocument xmlDocument,
			List<Diagnostic> diagnostics, ContentModelManager contentModelManager, boolean hasRelatedInformation,
			Map<String, ReferencedGrammarDiagnosticsInfo> referencedGrammarDiagnosticsInfoCache) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLSPErrorReporter()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
	private Exception currentError;

	public AbstractLSPErrorReporter(String source, DOMDocument xmlDocument, List<Diagnostic> diagnostics,
			boolean hasRelatedInfo) {
		this.source = source;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFixMissingGrammarCodeAction()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missinggrammar/AbstractFixMissingGrammarCodeAction.java`
#### Snippet
```java
	private final Map<String, ICodeActionResolvesParticipant> resolveCodeActionParticipants;

	public AbstractFixMissingGrammarCodeAction() {
		// Register available resolvers.
		resolveCodeActionParticipants = new HashMap<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `CacheResourceException()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceException.java`
#### Snippet
```java
	}

	public CacheResourceException(String resourceURI, String message, Throwable cause) {
		super(message, cause);
		this.resourceURI = resourceURI;
```

### NonProtectedConstructorInAbstractClass
Constructor `CacheResourceException()` of an abstract class should not be declared 'public'
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourceException.java`
#### Snippet
```java
	private final String resourceURI;

	public CacheResourceException(String resourceURI, String message) {
		this(resourceURI, message, null);
	}
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/client/AbstractXMLNotifier.java`
#### Snippet
```java
	 */
	public void addToCache(IXMLSettingFeature key, String value) {
		if (this.cache.get(key) == null) {
			this.cache.put(key, new HashSet<String>());
		}
```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFoldings.java`
#### Snippet
```java
		if (level < 30) {
			nestingLevelCounts.put(level,
					(nestingLevelCounts.containsKey(level) ? nestingLevelCounts.get(level) : 0) + 1);
		}
	};
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `element`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		while (element != null && (namespace == null || namespace.equals(element.getNamespaceURI()))) {
			paths.add(0, element);
			element = element.getParentNode() instanceof DOMElement ? (DOMElement) element.getParentNode() : null;
		}
		CMElementDeclaration declaration = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		char c = text.charAt(start);
		while (Character.isWhitespace(c)) {
			start++;
			c = text.charAt(start);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			return null;
		}
		end--;
		c = text.charAt(end);
		while (Character.isWhitespace(c)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		c = text.charAt(end);
		while (Character.isWhitespace(c)) {
			end--;
			c = text.charAt(end);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			c = text.charAt(end);
		}
		end++;
		return XMLPositionUtility.createRange(start, end, this);
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		int index = name.indexOf(":"); //$NON-NLS-1$
		if (index != -1) {
			name = name.substring(index + 1);
		}
		return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `startOffset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			return null;
		}
		startOffset--;
		while (startOffset >= 0) {
			char current = text.charAt(startOffset);
```

### AssignmentToMethodParameter
Assignment to method parameter `startOffset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			char current = text.charAt(startOffset);
			if (Character.isWhitespace(current)) {
				startOffset--;
				continue;
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/ExceptionUtils.java`
#### Snippet
```java
		}
		while (t.getCause() != null) {
			t = t.getCause();
		}
		return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
	public static Path getPath(String uri) {
		// Remove file://
		uri = removeFileScheme(uri, Platform.isWindows);
		try {
			// replace "%20" with " ", "%3A" with ":", etc
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
		try {
			// replace "%20" with " ", "%3A" with ":", etc
			uri = URLDecoder.decode(uri, StandardCharsets.UTF_8.name());
		} catch (UnsupportedEncodingException e) {
			// Do nothing
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
				char colon = pathString.charAt(2);
				if (Character.isLetter(letter) && ':' == colon) {
					pathString = pathString.substring(1);
				}
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `left`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/LevenshteinDistance.java`
#### Snippet
```java
            // swap the two strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
		if (pathString != null && !pathString.isEmpty()) {
			if (pathString.indexOf("~") == 0) {
				pathString = System.getProperty("user.home") + (pathString.length() > 1 ? pathString.substring(1) : "");
			}
			pathString = pathString.replace("/", File.separator);
```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/LevenshteinDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
				pathString = System.getProperty("user.home") + (pathString.length() > 1 ? pathString.substring(1) : "");
			}
			pathString = pathString.replace("/", File.separator);
			pathString = pathString.replace("\\", File.separator);
			Path p = Paths.get(pathString);
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
			}
			pathString = pathString.replace("/", File.separator);
			pathString = pathString.replace("\\", File.separator);
			Path p = Paths.get(pathString);
			pathString = p.normalize().toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
			pathString = pathString.replace("\\", File.separator);
			Path p = Paths.get(pathString);
			pathString = p.normalize().toString();
			return pathString;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `fileURI`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
				index++;
			}
			fileURI = fileURI.substring(index + 1, fileURI.length());
		}
		return fileURI;
```

### AssignmentToMethodParameter
Assignment to method parameter `left`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/LevenshteinDistance.java`
#### Snippet
```java
            // swap the input strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/LevenshteinDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `content`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
	public XMLBuilder addContentCDATA(String content) {
		if (isJoinCDATALines()) {
			content = normalizeSpace(content);
		}
		append(content);
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
		if (!isWhitespaceContent) {
			if (isJoinContentLines()) {
				text = StringUtils.normalizeSpace(text);
			} else if (hasSiblings) {
				text = text.trim();
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
				text = StringUtils.normalizeSpace(text);
			} else if (hasSiblings) {
				text = text.trim();
			}
			if (isTrimTrailingWhitespace()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLBuilder.java`
#### Snippet
```java
			}
			if (isTrimTrailingWhitespace()) {
				text = trimTrailingSpacesEachLine(text);
			}
			append(text);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
				return false;
			}
			index++;
		}
		return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
				char colon = pathString.charAt(2);
				if (Character.isLetter(letter) && ':' == colon) {
					pathString = pathString.substring(1);
				}
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java

		}
		pathString = pathString.replace("/", "\\");
		return pathString;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `xpathExpression`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		String localName = null;
		if (xpathExpression.startsWith("/")) {
			xpathExpression = xpathExpression.substring(1, xpathExpression.length());
		}
		boolean endsWithAny = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `xpathExpression`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/xpath/matcher/XPathMatcher.java`
#### Snippet
```java
		if (xpathExpression.endsWith("//")) {
			endsWithAny = true;
			xpathExpression = xpathExpression.substring(0, xpathExpression.length() - 2);
		}
		IXPathNodeMatcher nodeMatcher = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	public static int getEntityReferenceStartOffset(String text, int offset) {
		// adjust offset to get the left character of the offset
		offset--;
		if (offset < 0) {
			// case where offset is on the first character
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java

	public static Range selectAttributeNameAt(int offset, DOMDocument document) {
		offset = adjustOffsetForAttribute(offset, document);
		DOMAttr attr = document.findAttrAt(offset);
		return createAttrNameRange(attr, document);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		char c = text.charAt(offset);
		if (c == '>') {
			offset--;
			c = text.charAt(offset);
			if (c == '/') {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			c = text.charAt(offset);
			if (c == '/') {
				offset--;
			}
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		while (offset >= 0) {
			if (Character.isWhitespace(c)) {
				offset--;
			} else {
				break;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		Node child = node.left;
		while (child != null) {
			node = child;
			child = node.left;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			case 1:
			case -1:
				node = parent;
				parent = node.parent;
				continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		Node successor = successor(node);
		while (successor != last) {
			length -= successor.length;
			Node toDelete = successor;
			successor = successor(successor);
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			updateLength(node, consumed - firstLineDelta);
			node.delimiter = info.delimiter;
			length -= firstLineDelta;

			// Inline addLines start
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			while (info != null) {
				int lineLen = info.delimiterIndex - consumed + info.delimiterLength;
				node = insertAfter(node, lineLen, info.delimiter);
				consumed += lineLen;
				info = nextDelimiterInfo(text, consumed);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			while (info != null) {
				int lineLen = info.delimiterIndex - consumed + info.delimiterLength;
				node = insertAfter(node, lineLen, info.delimiter);
				consumed += lineLen;
				info = nextDelimiterInfo(text, consumed);
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			 */
			if (line > 0 && line == getNumberOfLines()) {
				line = line - 1;
				// Inline nodeByLine start
				int remaining = line;
```

### AssignmentToMethodParameter
Assignment to method parameter `wasLeftChild`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			Node parent = node.parent;
			if (parent != null) {
				wasLeftChild = node == parent.left;
			}

```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
			}

			node = parent;
		}
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
				parent.line += deltaLines;
			}
			from = parent;
			parent = from.parent;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java

	private SelectionRange handleAttributeSelectionRange(SelectionRange selectionRange, DOMAttr attr, int offset) {
		selectionRange = handleGenericNodeSelectionRange(selectionRange, attr, offset);
		DOMElement ownerElement = attr.getOwnerElement();
		if (ownerElement != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
		DOMElement ownerElement = attr.getOwnerElement();
		if (ownerElement != null) {
			selectionRange = handleGenericNodeSelectionRange(selectionRange, ownerElement, offset);
		}
		return selectionRange;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
			selectionRange = handleNodeSelectionRange(selectionRange, node, offset);
			if (node.isAttribute() && ((DOMAttr) node).getOwnerElement() != null) {
				node = ((DOMAttr) node).getOwnerElement();
			}
			DOMNode prolog = node.getOwnerDocument().getProlog();
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
			if (prolog != null && node != node.getOwnerDocument() && node != prolog && prolog.getStart() <= offset
					&& offset <= prolog.getEnd()) {
				node = node.getOwnerDocument().getProlog();
			} else {
				node = node.getParentNode();
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
				node = node.getOwnerDocument().getProlog();
			} else {
				node = node.getParentNode();
			}
		} while (node != null);
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
				parentSelectionRange.setRange(range);
				selectionRange.setParent(parentSelectionRange);
				selectionRange = parentSelectionRange;
			}
		} else if (contentStart != DOMNode.NULL_VALUE && offset < contentStart) {
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
			parentSelectionRange.setRange(XMLPositionUtility.selectStartTagName(element));
			selectionRange.setParent(parentSelectionRange);
			selectionRange = parentSelectionRange;
		} else if (offset <= element.getEndTagCloseOffset()) {
			parentSelectionRange.setRange(XMLPositionUtility.selectEndTagName(element));
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
			parentSelectionRange.setRange(XMLPositionUtility.selectEndTagName(element));
			selectionRange.setParent(parentSelectionRange);
			selectionRange = parentSelectionRange;
		}
		return handleGenericNodeSelectionRange(selectionRange, element, offset);
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
			parentSelectionRange.setRange(range);
			selectionRange.setParent(parentSelectionRange);
			selectionRange = parentSelectionRange;
		}
		return selectionRange;
```

### AssignmentToMethodParameter
Assignment to method parameter `selectionRange`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
					parentSelectionRange.setRange(range);
					selectionRange.setParent(parentSelectionRange);
					selectionRange = parentSelectionRange;
				} catch (BadLocationException e) {
					LOGGER.log(Level.SEVERE, "Failed to select DOCTYPE subset", e);
```

### AssignmentToMethodParameter
Assignment to method parameter `replaceStart`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		int offset = context.getOffset();
		if (replaceStart > offset) {
			replaceStart = offset;
		}
		DOMDocument document = context.getXMLDocument();
```

### AssignmentToMethodParameter
Assignment to method parameter `valueStart`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					? text.substring(valueContentStart, offset)
					: "";
			valueStart = valueContentStart;
			valueEnd = valueContentEnd;
			addQuotes = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `valueEnd`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					: "";
			valueStart = valueContentStart;
			valueEnd = valueContentEnd;
			addQuotes = false;
		} else {
```

### AssignmentToMethodParameter
Assignment to method parameter `newLine`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/SnippetRegistry.java`
#### Snippet
```java
		}
		if (newLine == null) {
			newLine = new StringBuilder();
		}
		char next = line.charAt(dollarIndex + 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `first`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
		if (isRangeFormatting()) {
			// adjust range offsets so that they are relative to the full document
			first = getFullOffsetFromRangeOffset(first);
			second = getFullOffsetFromRangeOffset(second);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `second`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
			// adjust range offsets so that they are relative to the full document
			first = getFullOffsetFromRangeOffset(first);
			second = getFullOffsetFromRangeOffset(second);
		}
		return getLineNumber(first) == getLineNumber(second);
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
		for (int i = from; i < to; i++) {
			if (Character.isWhitespace(text.charAt(i)) && !Character.isWhitespace(text.charAt(i + 1))) {
				to -= contentOffset;
				contentOffset = 0;
			} else if (Character.isWhitespace(text.charAt(i))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
		for (int i = to; i > from; i--) {
			if (text.charAt(i) == '\t') {
				to -= tabSize;
			} else if (isLineSeparator(text.charAt(i))) {
				int prevIndent = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
						prevIndent++;
					} else {
						to += (prevIndent - tabSize);
						return to;
					}
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
				int j = 1;
				while (text.charAt(i + j) == ' ') {
					to++;
					j++;
				}
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
					j++;
				}
				to--;
			} else {
				to--;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
				to--;
			} else {
				to--;
			}
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `newLineCount`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
		while (newLineCount != 0) {
			spaces.append(lineDelimiter);
			newLineCount--;
		}

```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
		int indentLevel = 0;
		while (node != null) {
			node = node.getParentElement();
			if (node != null) {
				indentLevel++;
```

### AssignmentToMethodParameter
Assignment to method parameter `spaceEnd`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocument.java`
#### Snippet
```java
	void replaceSpacesWithOneSpace(int spaceStart, int spaceEnd, List<TextEdit> edits) {
		if (spaceStart >= 0) {
			spaceEnd = spaceEnd == -1 ? spaceStart + 1 : spaceEnd + 1;
			// Replace several spaces with one space
			// <foo>a[space][space][space]b</foo>
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
		while (element != null && (namespace == null || namespace.equals(element.getNamespaceURI()))) {
			paths.add(0, element);
			element = element.getParentNode() instanceof DOMElement ? (DOMElement) element.getParentNode() : null;
		}
		CMElementDeclaration declaration = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDReferenceParticipant.java`
#### Snippet
```java
		DOMAttr attr = node.findAttrAt(offset);
		if (attr != null) {
			node = attr;
		}
		XSDUtils.searchXSOriginAttributes(node,
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
		while (element != null && (namespace == null || namespace.equals(element.getNamespaceURI()))) {
			paths.add(0, element);
			element = element.getParentNode() instanceof DOMElement ? (DOMElement) element.getParentNode() : null;
		}
		CMElementDeclaration declaration = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `charCode`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
		}
		if (charCode < a) {
			charCode += (a - A);
		}
		if (charCode >= a && charCode <= f) {
```

### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java

		if (locale == null) {
			locale = Locale.getDefault();
		}
		if (locale != fLocale) {
```

### AssignmentToMethodParameter
Assignment to method parameter `arguments`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPMessageFormatter.java`
#### Snippet
```java

				if (usedNewResourceBundle) {
					arguments = reformatSchemaArguments(XMLSchemaErrorCode.get(key), arguments);
				}

```

### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/msg/XMLModelMessageFormatter.java`
#### Snippet
```java

		if (locale == null) {
			locale = Locale.getDefault();
		}
		if (locale != fLocale) {
```

### AssignmentToMethodParameter
Assignment to method parameter `exception`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
			Exception exception) throws XNIException {
		if (currentError != null) {
			exception = currentError;
			currentError = null;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
			if (exception instanceof XMLParseException) {
				XMLParseException ex = (XMLParseException) exception;
				location = new SimpleLocator(ex.getLiteralSystemId(), ex.getExpandedSystemId(), ex.getLineNumber(),
						ex.getCharacterOffset());
			} else {
```

### AssignmentToMethodParameter
Assignment to method parameter `baseURI`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogUtils.java`
#### Snippet
```java
		String groupSegment = group.getAttribute(XML_BASE_ATTRIBUTE);
		if (groupSegment != null) {
			baseURI = Paths.get(baseURI, groupSegment).toString();
		}
		for (DOMNode node : group.getChildren()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySAXSchemaReader.java`
#### Snippet
```java
			SAXSource source, SAXResolver resolver, ErrorHandler eh, PropertyMap properties) throws SAXException {
		if (source.getXMLReader() == null)
			source = new SAXSource(resolver.createXMLReader(), source.getInputSource());
		return new SAXParseable<Pattern, NameClass, Locator, VoidValue, CommentListImpl, AnnotationsImpl>(source,
				resolver, eh);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGReferenceParticipant.java`
#### Snippet
```java
		DOMAttr attr = node.findAttrAt(offset);
		if (attr != null) {
			node = attr;
		}
		RelaxNGUtils.searchRNGOriginAttributes(node,
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySchemaReaderImpl.java`
#### Snippet
```java
			throws SAXException, IncorrectSchemaException {
		if (properties.contains(RngProperty.FEASIBLE))
			start = FeasibleTransform.transform(spb, start);
		properties = new SimplifiedSchemaPropertyMap(AbstractSchema.filterProperties(properties, supportedPropertyIds),
				start);
```

### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/jing/toremove/MySchemaReaderImpl.java`
#### Snippet
```java
		if (properties.contains(RngProperty.FEASIBLE))
			start = FeasibleTransform.transform(spb, start);
		properties = new SimplifiedSchemaPropertyMap(AbstractSchema.filterProperties(properties, supportedPropertyIds),
				start);
		// UPDATED by LemMinx
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/AttributeDeclaration.java`
#### Snippet
```java
	 */
	private static DataType getDataType(String value) {
		value = value != null ? value.trim() : null;
		if (StringUtils.isEmpty(value)) {
			return DataType.UNKNOWN;
```

### AssignmentToMethodParameter
Assignment to method parameter `rootUri`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java

	public void setRootURI(String rootUri) {
		rootUri = URIUtils.sanitizingUri(rootUri);
		fileAssociationResolver.setRootUri(rootUri);
		catalogResolverExtension.setRootUri(rootUri);
```

### AssignmentToMethodParameter
Assignment to method parameter `namespaceURI`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			// "urn:reports/itops" namespace
			// --> we use urn:reports/itops as namespace to get the DOM Document
			namespaceURI = xmlDocument.getNamespaceURI();
		}
		Collection<CMDocument> documents = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `modelProvider`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			// xsi:noNamespaceSchemaLocation, doctype)
			// try to get it by using extension (ex: .xsd, .dtd)
			modelProvider = getModelProviderByURI(resolvedUri);
		}
		if (modelProvider == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `identifier`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			}
			if (identifier == null) {
				identifier = new Identifier(publicId, systemId, null, null);
			}
			referencedGrammarInfos.add(new ReferencedGrammarInfo(resolvedURIInfo, grammarCacheInfo, identifier));
```

### AssignmentToMethodParameter
Assignment to method parameter `systemId`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
				try {
					URI uri = new URI(new URI(baseURI), systemId);
					systemId = uri.toString();
				}
				// Ignore the exception. Fallback to the literal system identifier.
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
				parents.add(elementDeclaration);
				generatedElements.put(child, parents);
				snippetIndex = generate(child, prefix, true, false, level + 1, snippetIndex, xml, generatedElements,
						generateOnlyRequired);

```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
		// Attributes
		Collection<CMAttributeDeclaration> attributes = elementDeclaration.getAttributes();
		snippetIndex = generate(attributes, level, snippetIndex, xml, elementDeclaration.getLocalName());
		// Elements children
		if (children.size() > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			if ((level < maxLevel)) {
				for (CMElementDeclaration child : children) {
					level++;
					List<CMElementDeclaration> parents = generatedElements.get(child) == null ? new ArrayList<>()
							: generatedElements.get(child);
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
					parents.add(elementDeclaration);
					generatedElements.put(child, parents);
					snippetIndex = generate(child, prefix, true, false, level, snippetIndex, xml, generatedElements,
							generateOnlyRequired);
					level--;
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
					snippetIndex = generate(child, prefix, true, false, level, snippetIndex, xml, generatedElements,
							generateOnlyRequired);
					level--;
				}
				xml.linefeed();
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			} else {
				if (generateEndTag && canSupportSnippets) {
					snippetIndex++;
					xml.addContent(SnippetsBuilder.tabstops(snippetIndex));
				}
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
					// Generate LSP choice.
					// Ex : <skill>${1|Java,Node,XML|}$2</skill>$0"
					snippetIndex++;
					xml.addContent(SnippetsBuilder.choice(snippetIndex, values));
				} else {
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			}
			if (canSupportSnippets) {
				snippetIndex++;
				xml.addContent(SnippetsBuilder.tabstops(snippetIndex));
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `snippetIndex`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
		for (CMAttributeDeclaration attributeDeclaration : requiredAttributes) {
			if (canSupportSnippets) {
				snippetIndex++;
			}
			String defaultValue = attributeDeclaration.getDefaultValue();
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeDeclaration.java`
#### Snippet
```java
			return ((SimpleNameClass) nameClass).getName();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGAttributeDeclaration.java`
#### Snippet
```java
		String namespaceURI = getNamespace();
		if (namespaceURI == null) {
			return null;
		}
		if (computedPrefix) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java

	public String getContent() {
		return content != null ? content.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java
		// Check if offset is in the <!ELEMENT nam|e
		if (isInNameParameter(offset)) {
			return null;
		}
		// We are after the <!ELEMENT name, search the parameter
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java
		if (paramStart == -1 || paramEnd == -1) {
			// no word
			return null;
		}
		return new DTDDeclParameter(this, paramStart, paramEnd);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDElementDecl.java`
#### Snippet
```java

	public String getCategory() {
		return category != null ? category.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getTextDocumentation(String value, ISharedSettingsRequest request) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
			return element.getPrefix(namespaceURI);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java

	protected DTDDeclParameter getParameterAtIndex(int index) {
		return parameters != null && parameters.size() > index ? parameters.get(index) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java
			return getNameParameter();
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java
			node = node.getParentNode();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java
			return declType.getParameter();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDDeclNode.java`
#### Snippet
```java
	public String getName() {
		DTDDeclParameter name = getNameParameter();
		return name != null ? name.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGElementDeclaration.java`
#### Snippet
```java
			return ((SimpleNameClass) nameClass).getName();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		DOMElement choice = findFirstChildElementByTagName(element, CHOICE_ELT);
		if (choice == null) {
			return null;
		}
		int length = choice.getChildren().size();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
						return (DOMElement) next;
					}
					return null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		DOMNode node = findNodeAt(locator);
		if (node == null) {
			return null;
		}
		if (node.isElement()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			DOMElement documentation = getDocumentationElement((DOMElement) node, value);
			if (documentation == null) {
				return null;
			}
			return getTextContent(documentation);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			return getTextContent(documentation);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
	DOMNode findNodeAt(Locator locator) {
		if (locator == null) {
			return null;
		}
		String systemId = locator.getSystemId();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		String systemId = locator.getSystemId();
		if (!URIUtils.isFileResource(systemId)) {
			return null;
		}
		DOMDocument targetSchema = getDocument(systemId);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		DOMDocument targetSchema = getDocument(systemId);
		if (targetSchema == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		} catch (BadLocationException e) {
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		DOMNode node = findNodeAt(locator);
		if (node == null) {
			return null;
		}
		if (node.isElement()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		}
		if (originElement == null || originElement.getLocalName() == null) {
			return null;
		}
		// Try to retrieve RelaxNG element declaration from the given element.
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
				originElement.getNamespaceURI());
		if (elementDeclaration == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
			attributeDeclaration = (CMRelaxNGAttributeDeclaration) elementDeclaration.findCMAttribute(originAttribute);
			if (attributeDeclaration == null) {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
				: elementDeclaration.getPattern().getLocator();
		if (locator == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/com/thaiopensource/relaxng/pattern/CMRelaxNGDocument.java`
#### Snippet
```java
		String systemId = locator.getSystemId();
		if (!URIUtils.isFileResource(systemId)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDNotationDecl.java`
#### Snippet
```java

	public String getPublicId() {
		return publicId != null ? publicId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDNotationDecl.java`
#### Snippet
```java

	public String getSystemId() {
		return systemId != null ? systemId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDNotationDecl.java`
#### Snippet
```java

	public String getKind() {
		return kind != null ? kind.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDAttlistDecl.java`
#### Snippet
```java

	public String getAttributeType() {
		return attributeType != null ? attributeType.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDAttlistDecl.java`
#### Snippet
```java

	public String getAttributeValue() {
		return attributeValue != null ? attributeValue.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDAttlistDecl.java`
#### Snippet
```java
	 */
	public String getAttributeName() {
		return attributeName != null ? attributeName.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
	@Override
	public String getPublicId() {
		return publicId != null ? publicId.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
		String textContent = getTextContent();
		if (textContent == null) {
			return null;
		}
		return textContent.substring(start - getStart(), end - getStart());
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
			return internalSubset.getParameterWithoutFirstAndLastChar();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
	 */
	public String getKind() {
		return kind != null ? kind.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java

	public String getPublicIdWithoutQuotes() {
		return publicId != null ? publicId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java

	public String getSystemIdWithoutQuotes() {
		return systemId != null ? systemId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocumentType.java`
#### Snippet
```java
	@Override
	public String getSystemId() {
		return systemId != null ? systemId.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
			XMLModelDeclaration declaration = getModelDeclaration();
			if (declaration == null || declaration.getHref() == null) {
				return null;
			}
			int start = processingInstruction.getStartContent() + declaration.getHrefOffset() - 1;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
	public String getHref() {
		XMLModelDeclaration declaration = getModelDeclaration();
		return declaration != null ? declaration.getHref() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/XMLModel.java`
#### Snippet
```java
		String data = processingInstruction.getData();
		if (data == null) {
			return null;
		}
		if (declaration == null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	@Override
	public DOMDocument getOwnerDocument() {
		return ownerElement != null ? ownerElement.getOwnerDocument() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		String name = getName();
		if (name == null) {
			return null;
		}
		String prefix = null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
				return super.getContent();
			}
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		DOMNode parentNode = getOwnerElement();
		if (parentNode == null) {
			return null;
		}
		List<DOMAttr> children = parentNode.getAttributeNodes();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
		List<DOMAttr> children = parentNode.getAttributeNodes();
		int nextIndex = children.indexOf(this) + 1;
		return nextIndex < children.size() ? children.get(nextIndex) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	public String getNamespaceURI() {
		if (ownerElement == null || ownerElement.getNodeType() != Node.ELEMENT_NODE) {
			return null;
		}
		String prefix = getPrefix();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
				if (isDefaultXmlns()) {
					// xmlns="http://"
					return null;
				}
				// xmlns:xxx="http://"
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMAttr.java`
#### Snippet
```java
	 */
	public DOMElement getOwnerElement() {
		return ownerElement.isElement() ? (DOMElement) ownerElement : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
	 */
	public String getKind() {
		return kind != null ? kind.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
	@Override
	public String getSystemId() {
		return systemId != null ? systemId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
	 */
	public String getPercent() {
		return percent != null ? percent.getParameter() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
	@Override
	public String getPublicId() {
		return publicId != null ? publicId.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DTDEntityDecl.java`
#### Snippet
```java
	 */
	public String getValue() {
		return value != null ? value.getParameterWithoutFirstAndLastChar() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		DOMAttr attr = root.getAttributeNode(getPrefixedName(schemaInstancePrefix, "noNamespaceSchemaLocation"));
		if (attr == null || attr.getValue() == null) {
			return null;
		}
		return new NoNamespaceSchemaLocation(attr);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			return getTrimmedRange(range.getStart().getCharacter(), range.getEnd().getCharacter());
		}
		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			return getChild(0);
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
	public String getNamespaceURI() {
		DOMElement documentElement = getDocumentElement();
		return documentElement != null ? documentElement.getNamespaceURI() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		}
		if (start == end) {
			return null;
		}
		end--;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMDocument.java`
#### Snippet
```java
		// Check that the attribute and the attribute value of xsi:schemaLocation is not null
		if (attr == null || attr.getNodeAttrValue() == null) {
			return null;
		}
		return new SchemaLocation(attr);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		String name = getTagName();
		if (name == null) {
			return null;
		}
		int index = name.indexOf(":"); //$NON-NLS-1$
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public DOMAttr setAttributeNodeNS(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public DOMAttr removeAttributeNode(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public DOMAttr setAttributeNode(org.w3c.dom.Attr arg0) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public NodeList getElementsByTagName(String arg0) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public DOMAttr getAttributeNodeNS(String arg0, String arg1) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		String text = this.getOwnerDocument().getText();
		if (startOffset > text.length() || startOffset < 0) {
			return null;
		}
		startOffset--;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			}
			if (current != c) {
				return null;
			}
			return startOffset;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			return startOffset;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	public String getPrefix(String namespaceURI) {
		if (namespaceURI == null) {
			return null;
		}
		if (hasAttributes()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
				}
			} else {
				return hasEndTag() ? this : null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			}
		}
		return anyOrphan ? orphanEndElement : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
			parent = parent.getParentNode();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public NodeList getElementsByTagNameNS(String arg0, String arg1) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public String getAttributeNS(String arg0, String arg1) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
	@Override
	public TypeInfo getSchemaTypeInfo() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMElement.java`
#### Snippet
```java
		String name = getTagName();
		if (name == null) {
			return null;
		}
		String prefix = null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLLanguageServer.java`
#### Snippet
```java
	public DOMDocument getDocument(String uri) {
		ModelTextDocument<DOMDocument> document = xmlTextDocumentService.getDocument(uri);
		return document != null ? document.getModel() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/logs/LogHelper.java`
#### Snippet
```java
	public static LSPClientLogHandler getClientHandler(LanguageClient languageClient) {
		if (languageClient == null) {
			return null;
		}
		return new LSPClientLogHandler(languageClient);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
					documentURI, resolverExtensionManager);
		} catch (Exception e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/DOMUtils.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		DOMNode parentNode = getParentNode();
		if (parentNode == null) {
			return null;
		}
		List<DOMNode> children = parentNode.getChildren();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		List<DOMNode> children = parentNode.getChildren();
		int previousIndex = children.indexOf(this) - 1;
		return previousIndex >= 0 ? children.get(previousIndex) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public Object getUserData(String arg0) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			parent = parent.getParentNode();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		@Override
		public Node item(int index) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public org.w3c.dom.Node removeChild(org.w3c.dom.Node arg0) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	public DOMAttr getAttributeAtIndex(int index) {
		if (!hasAttributes()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java

		if (index > attributeNodes.getLength() - 1) {
			return null;
		}
		return attributeNodes.get(index);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String lookupNamespaceURI(String arg0) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
				}
			}
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg0, org.w3c.dom.Node arg1) throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String getLocalName() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public DOMNode getFirstChild() {
		return this.children != null && children.size() > 0 ? this.children.get(0) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		String name = sb.toString();
		if (!hasAttributes()) {
			return null;
		}
		for (DOMAttr attr : attributeNodes) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		DOMNode next = getNextSibling();
		if (next == null || !next.isElement()) {
			return null;
		}
		// emp| </employe>
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			return nextElement;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		String value = attr != null ? attr.getValue() : null;
		if (value == null) {
			return null;
		}
		if (value.isEmpty()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public Object setUserData(String arg0, Object arg1, UserDataHandler arg2) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String getNodeValue() throws DOMException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public DOMNode getLastChild() {
		return this.children != null && this.children.size() > 0 ? this.children.get(this.children.size() - 1) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String getPrefix() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String lookupPrefix(String arg0) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
	@Override
	public String getNamespaceURI() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
			node = node.getParentNode();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		DOMNode parentNode = getParentNode();
		if (parentNode == null) {
			return null;
		}
		List<DOMNode> children = parentNode.getChildren();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/dom/DOMNode.java`
#### Snippet
```java
		List<DOMNode> children = parentNode.getChildren();
		int nextIndex = children.indexOf(this) + 1;
		return nextIndex < children.size() ? children.get(nextIndex) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/JSONUtility.java`
#### Snippet
```java
	public static <T> T toModel(Object object, Class<T> clazz) {
		if (object == null) {
			return null;
		}
		if (clazz == null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/JSONUtility.java`
#### Snippet
```java
			return clazz.cast(object);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/FilesUtils.java`
#### Snippet
```java
			return pathString;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkupContentFactory.java`
#### Snippet
```java
			ISharedSettingsRequest support) {
		if (value == null) {
			return null;
		}
		MarkupContent content = new MarkupContent();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/MarkupContentFactory.java`
#### Snippet
```java
	public static Hover createHover(List<MarkupContent> values, Range defaultRange) {
		if (values.isEmpty()) {
			return null;
		}
		if (values.size() == 1) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/StringUtils.java`
#### Snippet
```java
			return obj.toString();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocument.java`
#### Snippet
```java
			return new Range(pos, pos);
		} catch (BadLocationException e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "While creating Range the Offset was a BadLocation", e);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(node.getStart(), node.getEnd(), document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(node.getStart(), node.getEnd(), document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		DOMNode parent = document.findNodeAt(offset);
		if (parent == null || !parent.isElement() || !((DOMElement) parent).hasTagName()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		int entityReferenceStart = getEntityReferenceStartOffset(text, offset);
		if (entityReferenceStart == -1) {
			return null;
		}
		// Search ';' (or character on the right of the offset
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		if (entityReferenceEnd == -1) {
			if (endsWithSemicolon) {
				return null;
			}
			entityReferenceEnd = offset;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		DOMRange attrValue = attr.getNodeAttrValue();
		if (attrValue == null) {
			return null;
		}
		if (withoutQuote) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		DOMNode node = document.findNodeAt(offset);
		if (node == null || !node.isElement()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java

		if (child == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return new Range(startPosition, endPosition);
		} catch (BadLocationException e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
					finalStartOffset += prefix.length() + 1; // skips prefix and ':'
				} else {
					return null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(finalStartOffset, endOffset, element.getOwnerDocument());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
				finalStartOffset += prefix.length() + 1; // skips prefix name and ':'
			} else {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java

				if (!element.hasEndTag() || element.isSelfClosed() || !element.hasStartTag()) {
					return null;
				}
				int tagNameLength = element.getTagName().length();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		} catch (BadLocationException e) {
			return null;
		}
		return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return null;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		DOMNode node = document.findNodeAt(offset);
		if (node == null || !node.isElement()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
				return new Range(startPosition, endPosition);
			} catch (BadLocationException e) {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(finalParam.getEnd(), finalParam.getEnd() + 1, document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		List<DOMNode> childNodes = document.findNodeAt(offset).getChildren();
		if (childNodes.size() == 0) {
			return null;
		}
		for (DOMNode domNode : childNodes) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(declNode.declType.getStart(), declNode.declType.getEnd(), document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
	public static Range selectAttributePrefixFromGivenNameAt(String attrName, int offset, DOMDocument document) {
		if (attrName == null) {
			return null;
		}
		DOMNode element = document.findNodeAt(offset);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createAttrValueRange(attr, attr.getOwnerDocument(), withoutQuote);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createAttrNameRange(attr, attr.getOwnerDocument());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
				LOGGER.log(Level.SEVERE,
						"While creating Range in XMLHighlighting the Scanner's Offset was a BadLocation", e);
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return createRange(finalParam.getEnd(), finalParam.getEnd() + 1, document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return selectStartTagName(element);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			return selectEndTagName(element);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			List<DTDDeclParameter> params = declNode.getParameters();
			if (params.isEmpty()) {
				return null;
			}
			if (params.size() == 1) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		}
		if (root == null) {
			return null;
		}
		DOMAttr attr = root.getAttributeNode(attrName);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		DOMAttr attr = root.getAttributeNode(attrName);
		if (attr == null) {
			return null;
		}
		return selectAttributeValue(attr);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
		}
		if (root == null) {
			return null;
		}
		return selectStartTagName(root);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/utils/XMLPositionUtility.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TextDocuments.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java

		if (lines == 0) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java

		if (line == lines) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ListLineTracker.java`
#### Snippet
```java
		}

		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
				});
			}
			return null;
		});
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/XMLTextDocumentService.java`
#### Snippet
```java
		if (clientConfigurationSupport == null || !clientConfigurationSupport.booleanValue()) {
			// The client doesn't support 'configuration/workspace'.
			return null;
		}
		ConfigurationItem insertSpaces = new ConfigurationItem();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/snippets/ISnippetRegistryLoader.java`
#### Snippet
```java
	 */
	default String getLanguageId() {
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		}

		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
		}
		// if (ASSERT) Assert.isTrue(node.delimiter == NO_DELIM);
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/TreeLineTracker.java`
#### Snippet
```java
	public final String getLineDelimiter(int line) throws BadLocationException {
		Node node = nodeByLine(line);
		return node.delimiter == NO_DELIM ? null : node.delimiter;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLPrepareRename.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "Failed creating prperare rename request", e);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLPrepareRename.java`
#### Snippet
```java
		DOMNode node = request.getNode();
		if (node == null) {
			return null;
		}
		int offset = request.getOffset();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLPrepareRename.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
			DOMNode node = request.getNode();
			if (node == null) {
				return null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
			// Ex : <foo.bar></foo.bar> fails without the word pattern which allows any
			// characters except spaces.
			return !ranges.isEmpty() ? new LinkedEditingRanges(ranges, WORD_PATTERN) : null;
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "In XMLLinkedEditing, position error", e);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLinkedEditing.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "In XMLLinkedEditing, position error", e);
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLFormatter.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Formatting failed due to BadLocation", e);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
			T model = getModel(documentIdentifier);
			if (model == null) {
				return null;
			}
			// Apply the function code by using the parsed model.
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
			return document.getModel();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
			T model = getModel(documentIdentifier);
			if (model == null) {
				return null;
			}
			cancelChecker.checkCanceled();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ModelTextDocuments.java`
#### Snippet
```java
			return document.getExistingModel();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/AbstractPositionRequest.java`
#### Snippet
```java
	public String getCurrentAttributeName() {
		DOMAttr attr = getCurrentAttribute();
		return attr != null ? attr.getName() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/AbstractPositionRequest.java`
#### Snippet
```java
	public DOMAttr getCurrentAttribute() {
		if (node == null) {
			return null;
		}
		switch (node.getNodeType()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/AbstractPositionRequest.java`
#### Snippet
```java
			return ((DOMAttr) node);
		default:
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/AbstractPositionRequest.java`
#### Snippet
```java
			return ((DOMElement) node).getTagName();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCodeActions.java`
#### Snippet
```java
		String participantId = request.getParticipantId();
		if (StringUtils.isEmpty(participantId)) {
			return null;
		}
		for (ICodeActionParticipant codeActionParticipant : extensionsRegistry.getCodeActionsParticipants()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCodeActions.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSelectionRanges.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "Unable to calculate selection range for position " + position, e);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLSymbolsProvider.java`
#### Snippet
```java
	private List<DOMNode> getFilteredNodeAttributes(DOMNode node, XMLSymbolFilter filter, boolean hasFilterForAttr){
		if(!hasFilterForAttr){
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
			JsonObject json = JSONUtility.toModel(data, JsonObject.class);
			if (json == null) {
				return null;
			}
			JsonElement element = json.get(fieldName);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
			}
			JsonElement element = json.get(fieldName);
			return element != null ? element.getAsInt() : null;
		} catch (Exception e) {
			return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
			return element != null ? element.getAsInt() : null;
		} catch (Exception e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
		JsonObject json = JSONUtility.toModel(data, JsonObject.class);
		if (json == null) {
			return null;
		}
		JsonElement element = json.get(fieldName);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
		}
		JsonElement element = json.get(fieldName);
		return element != null ? element.getAsString() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
		JsonObject json = JSONUtility.toModel(data, JsonObject.class);
		if (json == null) {
			return null;
		}
		JsonElement element = json.get(fieldName);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/data/DataEntryField.java`
#### Snippet
```java
		}
		JsonElement element = json.get(fieldName);
		return element != null ? element.getAsBoolean() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
			} catch (BadLocationException e) {
				LOGGER.log(Level.SEVERE, "While creating Range in XMLHover the Scanner's Offset was a BadLocation", e);
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "Failed creating HoverRequest", e);
			return null;
		}
		int offset = hoverRequest.getOffset();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
		DOMNode node = hoverRequest.getNode();
		if (node == null) {
			return null;
		}
		if (node.isElement() && ((DOMElement) node).hasTagName()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
					return getTagHover(hoverRequest, tagRange, false);
				}
				return null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
			return getTextHover(hoverRequest, textRange);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLHover.java`
#### Snippet
```java
		if (hovers.isEmpty()) {
			// no hover
			return null;
		}
		if (hovers.size() == 1) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
					return XMLPositionUtility.selectText((DOMText) firstChild);
				}
				return null;
			case Node.TEXT_NODE:
				// ex : <root> | </root>
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		}
		// should never occur
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			}
			if (!isWhitespace(ch)) {
				return null;
			}
			start--;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
										return document.positionAt(eatIndex);
									} catch (BadLocationException e) {
										return null;
									}
								}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
							}
						}
						return null;
					});
			for (CompletionItem completionItem : snippets) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			offset = xmlDocument.offsetAt(position);
			if (offset - 2 < 0) { // There is not enough content for autoClose
				return null;
			}
		} catch (BadLocationException e) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "doTagComplete failed", e);
			return null;
		}
		if (offset <= 0) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		}
		if (offset <= 0) {
			return null;
		}
		char c = xmlDocument.getText().charAt(offset - 1);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		String snippet = null;
		if (XMLPositionUtility.isInAttributeValue(xmlDocument, position)) {
			return null;
		}
		if (c == '>') { // Case: <a>|
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			DOMNode node = xmlDocument.findNodeBefore(offset);
			if (!(node instanceof DOMElement)) {
				return null;
			}
			DOMElement element = ((DOMElement) node);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
						DOMAttr lastAttr = attrList.get(attrList.size() - 1);
						if (slashOffset < lastAttr.getEnd()) { // slash in attribute value
							return null;
						}
					}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
						if (element1.isStartTagClosed()) { // tag has closing '>', but slash is in incorrect area (not
															// directly before the '>')
							return null;
						}
						snippet = ">$0";
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
								end = xmlDocument.positionAt(element1.getEnd());
							} catch (BadLocationException e) {
								return null;
							}
						}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
									end = xmlDocument.positionAt(element2.getEnd());
								} catch (BadLocationException e) {
									return null;
								}
							}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
											end = xmlDocument.positionAt(parentElement.getEnd());
										} catch (BadLocationException e) {
											return null;
										}
									}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
		}
		if (snippet == null) {
			return null;
		}
		return new AutoCloseTagResponse(snippet);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLCompletions.java`
#### Snippet
```java
			return offset;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
			return ranges;
		} catch (BadLocationException e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
	private DOMElement getAssociatedElement(DOMNode node) {
		if (!node.isElement() && !node.isAttribute()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLRename.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "Failed creating RenameRequest", e);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/TextEditUtils.java`
#### Snippet
```java
		if (isMatchExpectedContent(from, to, expectedContent, text)) {
			// The expected content exists, no need to create a TextEdit
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/TextEditUtils.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
				}
			}
			return null;
		} catch (BadLocationException e) {
			return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
			return null;
		} catch (BadLocationException e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/XMLLanguageService.java`
#### Snippet
```java
			});
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/HoverParticipantAdapter.java`
#### Snippet
```java
	@Override
	public Hover onTag(IHoverRequest request) throws Exception {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/HoverParticipantAdapter.java`
#### Snippet
```java
	@Override
	public Hover onAttributeValue(IHoverRequest request) throws Exception {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/HoverParticipantAdapter.java`
#### Snippet
```java
	@Override
	public Hover onAttributeName(IHoverRequest request) throws Exception {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/HoverParticipantAdapter.java`
#### Snippet
```java
	@Override
	public Hover onText(IHoverRequest request) throws Exception {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/codeaction/ICodeActionParticipant.java`
#### Snippet
```java
	 */
	default ICodeActionResolvesParticipant getResolveCodeActionParticipant(String participantId) {
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/format/IFormatterParticipant.java`
#### Snippet
```java
			XMLFormattingConstraints parentConstraints, Map<String, Collection<CMDocument>> formattingContext,
			SharedSettings sharedSettings) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/ICompletionParticipant.java`
#### Snippet
```java
	 */
	default ICompletionItemResolveParticipant getResolveCompletionItemParticipant(String participantId) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/commands/ArgumentsUtils.java`
#### Snippet
```java
	public static Object getArgAt(List<Object> arguments, int index) {
		if (arguments == null || index >= arguments.size()) {
			return null;
		}
		return arguments.get(index);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
	private DOMAttr getLastAttribute(DOMElement element) {
		if (!element.hasAttributes()) {
			return null;
		}
		List<DOMAttr> attributes = element.getAttributeNodes();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/XMLFormatterDocumentOld.java`
#### Snippet
```java
			// for DOMNode.findNodeAt() to find the correct element
		} else {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/DOMElementCompletionItem.java`
#### Snippet
```java
	@Override
	protected MarkupContent generateDocumentation() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/extensions/completion/AbstractElementCompletionItem.java`
#### Snippet
```java
			return Arrays.asList(new TextEdit(range, tagName));
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFoldingSettings.java`
#### Snippet
```java

	public Integer getRangeLimit() {
		return capabilities != null ? capabilities.getRangeLimit() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/AllXMLSettings.java`
#### Snippet
```java
	public static Object getAllXMLSettings(Object initializationOptionsSettings) {
		AllXMLSettings settings = JSONUtility.toModel(initializationOptionsSettings, AllXMLSettings.class);
		return settings != null ? settings.getXml() : null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/InitializationOptionsSettings.java`
#### Snippet
```java
		InitializationOptionsSettings root = JSONUtility.toModel(initializeParams.getInitializationOptions(),
				InitializationOptionsSettings.class);
		return root != null ? root.getSettings() : null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/FaultTolerantTypeAdapterFactory.java`
#### Snippet
```java
							e);
					in.skipValue();
					return null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLSymbolFilter.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/services/format/DOMElementFormatter.java`
#### Snippet
```java
	private static DOMAttr getLastAttribute(DOMElement element) {
		if (!element.hasAttributes()) {
			return null;
		}
		List<DOMAttr> attributes = element.getAttributeNodes();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/capabilities/InitializationOptionsExtendedClientCapabilities.java`
#### Snippet
```java
		InitializationOptionsExtendedClientCapabilities root = JSONUtility.toModel(
				initializeParams.getInitializationOptions(), InitializationOptionsExtendedClientCapabilities.class);
		return root != null ? root.getExtendedClientCapabilities() : null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/xmlmodel/XMLModelDTDValidatorFactory.java`
#### Snippet
```java
			return new XMLModelDTDValidator(modelDeclaration.getHref());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/settings/XMLFormattingOptions.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getAttributeValueDocumentation(String value, ISharedSettingsRequest request) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			String internalSubset = documentType != null ? documentType.getInternalSubset() : null;
			if (internalSubset == null) {
				return null;
			}
			CMDTDDocument document = newCMDocument(null, resolveExternalEntities);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			// Don't log error, because DOCTYPE subset is never valid when user type some
			// content in the DTD subset
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			return null;
		}
		return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDContentModelProvider.java`
#### Snippet
```java
			return null;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getTextDocumentation(String value, ISharedSettingsRequest request) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getNamespace() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDElementDeclaration.java`
#### Snippet
```java
	@Override
	public String getPrefix(String namespaceURI) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/XSDURIResolverExtension.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/XSDURIResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/xmlmodel/XMLModelSchemaValidatorFactory.java`
#### Snippet
```java
			return new XMLModelSchemaValidator(modelDeclaration.getHref());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
		public String getComment(String attrName) {
			DTDNodeInfo attr = attributes.get(attrName);
			return attr != null ? attr.getComment() : null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
	@Override
	public LocationLink findTypeLocation(DOMNode node) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
	private CMElementDeclaration findElementDeclaration(String tag, String namespace) {
		if (tag == null) {
			return null;
		}
		for (CMElementDeclaration cmElement : getElements()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/dtd/contentmodel/CMDTDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
	@Override
	public String getPrefix() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
		// Try get xs:annotation from the type of attribute declaration
		XSSimpleTypeDefinition typeDefinition = attributeDeclaration.getTypeDefinition();
		return typeDefinition != null ? typeDefinition.getAnnotations() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDAttributeDeclaration.java`
#### Snippet
```java
			}
		}
		return xsValue != null ? xsValue.getNormalizedValue().toString() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDContentModelProvider.java`
#### Snippet
```java
	@Override
	public CMDocument createInternalCMDocument(DOMDocument xmlDocument, boolean resolveExternalEntities) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDContentModelProvider.java`
#### Snippet
```java
			return new CMXSDDocument(model, loader);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java
		DOMDocument xmlDocument = request.getXMLDocument();
		if (!DOMUtils.isXSD(xmlDocument)) {
			return null;
		}
		DOMNode node = request.getNode();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java
		DOMNode node = request.getNode();
		if (node == null || !node.isAttribute()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java
		DOMElement ownerElement = attr.getOwnerElement();
		if (ownerElement == null) {
			return null;
		}
		if (XSDUtils.isXSComplexType(ownerElement) || XSDUtils.isXSSimpleType(ownerElement)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDRenameParticipant.java`
#### Snippet
```java
			return Either.forRight(new PrepareRenameResult(range, placeholder));
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDAnnotationModel.java`
#### Snippet
```java
			return handler.getModel();
		} catch (Exception e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDAnnotationModel.java`
#### Snippet
```java
			return m.group(1);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/XSDAnnotationModel.java`
#### Snippet
```java
			return (XSAnnotation) annotation;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDErrorCode.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/XSDDocumentLinkParticipant.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	static String getSchemaURI(SchemaGrammar schemaGrammar) {
		if (schemaGrammar == null) {
			return null;
		}
		return schemaGrammar.getDocumentLocations().item(0);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
										XSAnnotation annotation = (XSAnnotation) enumerationAnnotations.get(enumIndex);
										if (annotation == null) {
											return null;
										}
										return new XSObjectListImpl(new XSAnnotation[] { annotation }, 1);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
		}
		if (originElement == null || originElement.getLocalName() == null) {
			return null;
		}
		// Try to retrieve XSD element declaration from the given element.
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
				originElement.getNamespaceURI());
		if (elementDeclaration == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
		SchemaGrammar schemaGrammar = getOwnerSchemaGrammar(elementDeclaration.getElementDeclaration());
		if (schemaGrammar == null && xercesElement == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
					originNode.getOwnerDocument().getResolverExtensionManager());
			if (targetSchema == null) {
				return null;
			}
			if (originAttribute != null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
					"Error while retrieving mapped Xerces xs:element of '" + elementDeclaration.getName() + "'.", e);
		}
		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
		// loop for each xs:complexType of the SchemaGrammar
		if (enclosingType == null) {
			return null;
		}
		for (int i = 0; i < namespaces.getLength(); i++) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			return findXSElement(originElement, (Element) node);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
	 */
	private static SchemaGrammar getSchemaGrammar(XSNamespaceItem namespaceItem) {
		return (namespaceItem != null && namespaceItem instanceof SchemaGrammar) ? (SchemaGrammar) namespaceItem : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Error while retrieving list of xs:complexType of the grammar '"
					+ grammar.getSchemaNamespace() + "'.", e);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDDocument.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java
	public String resolve(String baseLocation, String publicId, String systemId) {
		if (!XSL_NAMESPACE_URI.equals(publicId)) {
			return null;
		}
		String version = getVersion(baseLocation);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java
			// Do nothing?
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsl/XSLURIResolverExtension.java`
#### Snippet
```java
	private String getVersion(String uri) {
		if (documentProvider == null) {
			return null;
		}
		DOMDocument document = documentProvider.getDocument(uri);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
		String name = attribute.getName();
		if (!name.startsWith(request.getXMLDocument().getSchemaInstancePrefix() + ":")) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
			}
		} else {
			return null;
		}
		if (doc == null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsi/XSISchemaModel.java`
#### Snippet
```java
				doc = TYPE_DOC;
			} else {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/participants/diagnostics/LSPErrorReporterForXSD.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getEncoding() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getLiteralSystemId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getExpandedSystemId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getPublicId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getBaseSystemId() {
			return null;
		}
	};
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/LSPXMLEntityManager.java`
#### Snippet
```java
		@Override
		public String getXMLVersion() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
		int startComma = text.indexOf('(');
		if (startComma == -1) {
			return null;
		}
		int endComma = text.indexOf(')');
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
		int endComma = text.indexOf(')');
		if (endComma == -1 || endComma < startComma) {
			return null;
		}
		String name = text.substring(0, startComma);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
		String name = text.substring(0, startComma);
		if (name.isEmpty()) {
			return null;
		}
		String[] colorValues = text.substring(startComma + 1, endComma).split(",");
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
		String[] colorValues = text.substring(startComma + 1, endComma).split(",");
		if (colorValues.length < 3 || colorValues.length > 4) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			return null;
		}
		return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
			return null;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
#### Snippet
```java
	private static Color colorFromHex(String text) {
		if (text.isEmpty() || text.charAt(0) != '#') {
			return null;
		}
		switch (text.length()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/colors/utils/ColorUtils.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/ExternalXMLDTDValidator.java`
#### Snippet
```java
			return ReflectionUtils.getFieldValue(this, "fRootElement");
		} catch (Exception e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractReferencedGrammarLSPErrorReporter.java`
#### Snippet
```java
			return NO_RANGE;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogDocumentLinkParticipant.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Creation of document link failed", e);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		List<DiagnosticRelatedInformation> relatedInformations = null;
		if (adjustedRange == null || NO_RANGE.equals(adjustedRange)) {
			return null;
		}
		if (hasRelatedInfo) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		String code = getCode(domain, key, arguments, exception);
		if (addDiagnostic(adjustedRange, message, diagnosticSeverity, code, relatedInformations) == null) {
			return null;
		}
		if (fatalError && !fContinueAfterFatalError) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
			return document.positionAt(offset);
		} catch (BadLocationException e) {
			return location != null ? new Position(location.getLineNumber() - 1, location.getColumnNumber() - 1) : null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java
		}
		if (diagnostics.contains(d)) {
			return null;
		}
		// Fill diagnostic
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/AbstractLSPErrorReporter.java`
#### Snippet
```java

		if (startOffset < 0 || endOffset < 0) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/URICatalogEntry.java`
#### Snippet
```java
		DOMAttr uriAttr = CatalogUtils.getCatalogEntryURI(getEntryElement());
		if (uriAttr == null) {
			return null;
		}
		String lastSegment = uriAttr.getValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/URICatalogEntry.java`
#### Snippet
```java
		String lastSegment = uriAttr.getValue();
		if (StringUtils.isBlank(lastSegment)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/URICatalogEntry.java`
#### Snippet
```java
		} catch (InvalidPathException e) {
			// See issue #977
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/URICatalogEntry.java`
#### Snippet
```java
		DOMAttr uriAttr = CatalogUtils.getCatalogEntryURI(getEntryElement());
		if (uriAttr == null) {
			return null;
		}
		return uriAttr.getNodeAttrValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogCatalogEntry.java`
#### Snippet
```java
		DOMAttr catalogAttr = CatalogUtils.getCatalogEntryCatalog(getEntryElement());
		if (catalogAttr == null) {
			return null;
		}
		String lastSegment = catalogAttr.getValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogCatalogEntry.java`
#### Snippet
```java
		String lastSegment = catalogAttr.getValue();
		if (StringUtils.isBlank(lastSegment)) {
			return null;
		}
		return Paths.get(getBaseURI(), lastSegment).toString();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogCatalogEntry.java`
#### Snippet
```java
		DOMAttr catalogAttr = CatalogUtils.getCatalogEntryCatalog(getEntryElement());
		if (catalogAttr == null) {
			return null;
		}
		return catalogAttr.getNodeAttrValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
	@Override
	public Object getPropertyDefault(String propertyId) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
	@Override
	public String[] getRecognizedProperties() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
	@Override
	public String[] getRecognizedFeatures() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
		String href = modelDeclaration.getHref();
		if (StringUtils.isEmpty(href)) {
			return null;
		}
		for (XMLModelValidatorFactory factory : MODEL_VALIDATOR_FACTORIES) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xerces/xmlmodel/XMLModelHandler.java`
#### Snippet
```java
	@Override
	public Boolean getFeatureDefault(String featureId) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogURIResolverExtension.java`
#### Snippet
```java
	public String resolve(String baseLocation, String publicId, String systemId) {
		if (!CATALOG_NAMESPACE_URI.equals(publicId)) {
			return null;
		}
		if (hasDTDorXMLSchema(baseLocation)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogURIResolverExtension.java`
#### Snippet
```java
		}
		if (hasDTDorXMLSchema(baseLocation)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogURIResolverExtension.java`
#### Snippet
```java
	public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier) throws XNIException, IOException {
		if (hasDTDorXMLSchema(resourceIdentifier.getBaseSystemId())) {
			return null;
		}
		String publicId = resourceIdentifier.getNamespace();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/XMLCatalogURIResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogUtils.java`
#### Snippet
```java

		if (StringUtils.isBlank(location)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/catalog/CatalogUtils.java`
#### Snippet
```java
			return new CatalogCatalogEntry(baseURI, element);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/contentmodel/CMRelaxNGContentModelProvider.java`
#### Snippet
```java
				return new CMRelaxNGDocument(key, start, resolverExtensionManager);
			}
			return null;
		} catch (Exception e) {
			// ignore the error.
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/contentmodel/CMRelaxNGContentModelProvider.java`
#### Snippet
```java
			// ignore the error.
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/contentmodel/CMRelaxNGContentModelProvider.java`
#### Snippet
```java
	@Override
	public CMDocument createInternalCMDocument(DOMDocument xmlDocument, boolean resolveExternalEntities) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorHandler.java`
#### Snippet
```java
			}
		}
		return arg != null ? arg.toString() : null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
			startOffset = xmlDocument.offsetAt(fullRange.getStart());
		} catch (BadLocationException e) {
			return null;
		}
		int lastSlashIndex = attributeValue.lastIndexOf(slash);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
				replaceStart = xmlDocument.positionAt(startOffset + lastSlashIndex);
			} catch (BadLocationException e) {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
				validAttributePath = validAttributePath.getParent();
			}
			return Files.exists(validAttributePath) ? validAttributePath : null;
		} catch (Exception e) {
			return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/general/completion/FilePathCompletionParticipant.java`
#### Snippet
```java
			return Files.exists(validAttributePath) ? validAttributePath : null;
		} catch (Exception e) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RelaxNGURIResolverExtension.java`
#### Snippet
```java
	public String resolve(String baseLocation, String publicId, String systemId) {
		if (!RELAXNG_NAMESPACE_URI.equals(publicId)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RelaxNGURIResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
#### Snippet
```java

		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/RelaxNGErrorCode.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getBaseSystemId() {
			return null;
		}
	};
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getPublicId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
	@Override
	public String[] getRecognizedFeatures() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getXMLVersion() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
	@Override
	public String[] getRecognizedProperties() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getEncoding() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getLiteralSystemId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
	@Override
	public Object getPropertyDefault(String propertyId) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
		@Override
		public String getExpandedSystemId() {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xml/validator/ExternalRelaxNGValidator.java`
#### Snippet
```java
	@Override
	public Boolean getFeatureDefault(String featureId) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			return CMXSDDocument.getEnumerationAnnotations(simpleDefinition, textContent);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
		XSTypeDefinition typeDefinition = elementDeclaration.getTypeDefinition();
		if (typeDefinition == null) {
			return null;
		}
		return getElementAnnotations(typeDefinition);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
			return ((XSSimpleTypeDecl) typeDefinition).getAnnotations();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/contentmodel/CMXSDElementDeclaration.java`
#### Snippet
```java
	public String getPrefix(String namespaceURI) {
		// TODO : implement this method
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
			return Either.forRight(new PrepareRenameResult(range, placeholder));
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMDocument xmlDocument = request.getXMLDocument();
		if (!DOMUtils.isRelaxNGXMLSyntax(xmlDocument)) {
			return null;
		}
		DOMNode node = request.getNode();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMNode node = request.getNode();
		if (node == null || !node.isAttribute()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
#### Snippet
```java
		DOMElement ownerElement = attr.getOwnerElement();
		if (ownerElement == null) {
			return null;
		}
		if (RelaxNGUtils.isDefine(ownerElement)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGRenameParticipant.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/xmlmodel/XMLModelRelaxNGValidatorFactory.java`
#### Snippet
```java
			return new XMLModelRelaxNGValidator(modelDeclaration.getHref());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeErrorCode.java`
#### Snippet
```java
				return XMLPositionUtility.selectStartTagName(offset, document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xmlmodel/contentmodel/CMXMLModelContentModelProvider.java`
#### Snippet
```java
	@Override
	public CMDocument createInternalCMDocument(DOMDocument xmlDocument, boolean resolveExternalEntities) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xmlmodel/contentmodel/CMXMLModelContentModelProvider.java`
#### Snippet
```java
	public CMDocument createCMDocument(String uri, boolean resolveExternalEntities) {
		ContentModelProvider modelProvider = modelManager.getModelProviderByURI(uri);
		return modelProvider != null ? modelProvider.createCMDocument(uri, resolveExternalEntities) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
		DOMDocumentType docType = document.getDoctype();
		if (docType == null) {
			return null;
		}
		// Loop for entities declared in the DOCTYPE of the document
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
		DOMNode node = request.getNode();
		if (!node.isText()) {
			return null;
		}
		// Hover is done in a text node, check if it's a entity reference
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
		EntityReferenceRange entityRange = XMLPositionUtility.selectEntityReference(offset, document);
		if (entityRange == null) {
			return null;
		}
		// The hovered text follows the entity reference syntax (ex : &amp;)
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/entities/participants/EntitiesHoverParticipant.java`
#### Snippet
```java
			return new Hover(entityContents, range);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/grammar/rng/RNGDocumentLinkParticipant.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xinclude/XIncludeDocumentLinkParticipant.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
			String prefix = originAttrValue.substring(0, index);
			if (!Objects.equal(prefix, targetNamespacePrefix)) {
				return null;
			}
			return originAttrValue.substring(index + 1, originAttrValue.length());
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	public static DOMAttr getSchemaLocation(DOMElement element) {
		if (!(isXSInclude(element) || isXSImport(element))) {
			return null;
		}
		return element.getAttributeNode(SCHEMA_LOCATION_ATTR);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (StringUtils.isBlank(location)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/xsd/utils/XSDUtils.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNodeFactory.java`
#### Snippet
```java
		int startNode = getStartNode(node);
		if (startNode == -1) {
			return null;
		}
		int endNode = getEndNode(node);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchNodeFactory.java`
#### Snippet
```java
		int endNode = getEndNode(node);
		if (endNode == -1) {
			return null;
		}
		if (multiple) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2xsd/XML2XMLSchemaGenerator.java`
#### Snippet
```java
			return "boolean";
		default:
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/generators/xml2relaxng/XML2RelaxNGGenerator.java`
#### Snippet
```java
				return "boolean";
			default:
				return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
		DOMNode adjustedNode = findAttrOrTextNode(node, offset);
		if (adjustedNode == null) {
			return null;
		}
		SearchQuery query = internalCreateQuery(adjustedNode, offset, settings, QueryDirection.FROM_2_TO);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
				: null;
		if (allReferences == null) {
			return null;
		}
		DOMDocument document = node.getOwnerDocument();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
		DOMNode adjustedNode = findAttrOrTextNode(node, offset);
		if (adjustedNode == null) {
			return null;
		}
		return internalCreateQuery(adjustedNode, offset, settings, direction);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.TO;
				}
				return null;
			case TO_2_FROM:
				if (expression.matchFrom(node)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.FROM;
				}
				return null;
			default:
				if (expression.matchFrom(node)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.TO;
				}
				return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
				direction);
		if (expressions == null) {
			return null;
		}
		return new SearchQuery(adjustedNode, offset, expressions, direction);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.TO;
				}
				return null;
			case FROM_2_TO:
				if (expression.matchFrom(node)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.FROM;
				}
				return null;
			default:
				if (expression.matchFrom(node)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQueryFactory.java`
#### Snippet
```java
					return Direction.TO;
				}
				return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
			// - it doesn't exists some expressions for the DOM document of the node.
			// - there are none expressions which matches the node.
			return null;
		}
		SearchNode searchNode = query.getSearchNode();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
		SearchNode searchNode = query.getSearchNode();
		if (searchNode == null) {
			return null;
		}
		DOMNode node = searchNode.getNode();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
		if (node == null || node.isOwnerDocument()) {
			// node is a DOM document in the case of <foo></foo>|
			return null;
		}
		if (!searchNode.isValid()) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/participants/XMLReferencesRenameParticipant.java`
#### Snippet
```java
		if (!searchNode.isValid()) {
			// The search node is not valid.
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/CMDocument.java`
#### Snippet
```java
	default CMAttributeDeclaration findCMAttribute(DOMAttr attr) {
		CMElementDeclaration elementDeclaration = findCMElement(attr.getOwnerElement());
		return elementDeclaration != null ? elementDeclaration.findCMAttribute(attr) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ReferencedGrammarInfo.java`
#### Snippet
```java
	public String getIdentifierURI() {
		if (identifier == null) {
			return null;
		}
		String publicId = identifier.getPublicId();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ReferencedGrammarInfo.java`
#### Snippet
```java
	 */
	public String getBindingKind() {
		return identifier != null ? identifier.getKind() : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ReferencedGrammarInfo.java`
#### Snippet
```java
	public String getResolvedBy() {
		String resolvedBy = resolvedURIInfo != null ? resolvedURIInfo.getResolverName() : null;
		return URIResolverExtension.DEFAULT.equals(resolvedBy) ? null : resolvedBy;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/XMLValidationAllFilesCommand.java`
#### Snippet
```java
			validationService.validate(document);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/commands/XMLValidationFileCommand.java`
#### Snippet
```java
		Map map = JSONUtility.toModel(validationArgs, Map.class);
		validationService.validate(document, map);
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQuery.java`
#### Snippet
```java
			default:
				if (offset != -1) {
					return null;
				}
				return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/references/search/SearchQuery.java`
#### Snippet
```java
					return null;
				}
				return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
			// xsi:noNamespaceSchemaLocation="Types.xsd">
			// ignore XML file association
			return null;
		}
		if (fileAssociations != null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLFileAssociationResolverExtension.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
	public String resolve(String baseLocation, String publicId, String systemId) {
		// Don't resolve the URI
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
			return cacheResourcesManager.getResource(url);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCacheResolverExtension.java`
#### Snippet
```java
			return new XMLFileInputSource(resourceIdentifier, file);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/settings/XMLValidationSettings.java`
#### Snippet
```java
		if ("ignore".equalsIgnoreCase(noGrammar)) {
			// Ignore "noGrammar", return null.
			return null;
		} else if ("info".equalsIgnoreCase(noGrammar)) {
			return DiagnosticSeverity.Information;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			if (document != null && document.isDirty()) {
				cmDocumentCache.remove(key);
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
		String resolvedUri = resolverManager.resolve(uri, publicId, systemId);
		if (resolvedUri == null) {
			return null;
		}
		// the XML Schema, DTD can be resolved
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
		}
		if (modelProvider == null) {
			return null;
		}
		// Try to get the document from the cache
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java
			} catch (CacheResourceDownloadingException e) {
				// the DTD/XML Schema is downloading
				return null;
			} catch (Exception e) {
				// other error like network which is not available
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/model/ContentModelManager.java`
#### Snippet
```java

	public LSPXMLGrammarPool getGrammarPool() {
		return cacheResolverExtension.isUseCache() ? grammarPool : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
			return catalogResolver.resolveEntity(resourceIdentifier);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
			return catalogResolver.getCatalogList();
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/XMLCatalogResolverExtension.java`
#### Snippet
```java
			return catalogResolver.resolveIdentifier(namespaceURI, publicId, systemId, baseURI);
		}
		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
			return source;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
			return source;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/uriresolver/LSPXMLCatalogResolver.java`
#### Snippet
```java
			return new DOMInputImpl(publicId, resolvedId, baseURI);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelCodeActionParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelFormatterParticipant.java`
#### Snippet
```java
		boolean enabled = sharedSettings.getFormattingSettings().isGrammarAwareFormatting();
		if (!enabled) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelFormatterParticipant.java`
#### Snippet
```java
				} catch (InterruptedException | ExecutionException | TimeoutException e1) {
					// If it takes longer than 2 seconds to download the schema, we should give up and proceed with formatting
					return null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelFormatterParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
		case EntityNotDeclared: {
			EntityReferenceRange range = XMLPositionUtility.selectEntityReference(offset - 1, document);
			return range != null ? range.getRange() : null;
		}
		case QuoteRequiredInPublicID:
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/DTDErrorCode.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLModelUtils.java`
#### Snippet
```java
	public static DOMRange getHrefNode(DOMDocument document, String hrefLocation) {
		if (hrefLocation == null) {
			return null;
		}
		// Check if location comes from a xml-model/@href
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLModelUtils.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLModelUtils.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
			}
			// Should never occurs
			return null;
		}
		case MarkupEntityMismatch: {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
			}
			// Should never occurs
			return null;
		}
		case SemicolonRequiredInReference: {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		case SemicolonRequiredInReference: {
			EntityReferenceRange range = XMLPositionUtility.selectEntityReference(offset + 1, document, false);
			return range != null ? range.getRange() : null;
		}
		case ContentIllegalInProlog: {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
		}

		return null;

	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSyntaxErrorCode.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/completion/AttributeNameCompletionResolver.java`
#### Snippet
```java
					request);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
			if (cmDocuments.isEmpty()) {
				// no bound grammar -> no documentation
				return null;
			}
			// Compute attribute name declaration documentation from bound grammars
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
		DOMElement element = text.getParentElement();
		if (element == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
			if (cmDocuments.isEmpty()) {
				// no bound grammar -> no documentation
				return null;
			}
			String textContent = text.getTextContent();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
			if (cmDocuments.isEmpty()) {
				// no bound grammar -> no documentation
				return null;
			}
			String attributeValue = attribute.getValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/ContentModelHoverParticipant.java`
#### Snippet
```java
			if (cmDocuments.isEmpty()) {
				// no bound grammar -> no documentation
				return null;
			}
			// Compute element declaration documentation from bound grammars
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/completion/AttributeValueCompletionResolver.java`
#### Snippet
```java
					request);
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/TargetNamespace_1CodeAction.java`
#### Snippet
```java
			return nsMatcher.group(1);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/TargetNamespace_2CodeAction.java`
#### Snippet
```java
			return nsMatcher.group(1);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
			String prefix = originAttrValue.substring(0, index);
			if (!Objects.equal(prefix, targetNamespacePrefix)) {
				return null;
			}
			return originAttrValue.substring(index + 1, originAttrValue.length());
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/relaxng/utils/RelaxNGUtils.java`
#### Snippet
```java
	public static DOMAttr getHref(DOMElement element) {
		if (!(isInclude(element) || isExternalRef(element))) {
			return null;
		}
		return element.getAttributeNode(HREF_ATTR);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
				SchemaLocation schemaLocation = document.getSchemaLocation();
				DOMRange locationRange = schemaLocation.getAttr().getNodeAttrValue();
				return locationRange != null ? XMLPositionUtility.createRange(locationRange) : null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
						}
					}
					return locationRange != null ? XMLPositionUtility.selectValueWithoutQuote(locationRange) : null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
			default:
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/XMLSchemaErrorCode.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (location == null) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/src_import_1_2CodeAction.java`
#### Snippet
```java

		if (!root.getTagName().contains("schema")) {
			return null;
		}
		String message;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/src_import_1_2CodeAction.java`
#### Snippet
```java

		if (node == null || !node.isElement()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
		int preMatch = message.indexOf(preText);
		if (preMatch < 0) {
			return null;
		}
		return message.substring(preMatch + preText.length(), message.length() - 2);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
		int preMatch = message.indexOf(preText);
		if (preMatch < 0) {
			return null;
		}
		int postMatch = message.indexOf(postText);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/RootElementTypeMustMatchDoctypedeclCodeAction.java`
#### Snippet
```java
		int postMatch = message.indexOf(postText);
		if (postMatch < 0) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/DownloadDisabledResourceCodeAction.java`
#### Snippet
```java
	public static String getUrlToForceToDownload(Map<String, Object> validationArgs) {
		if (validationArgs == null) {
			return null;
		}
		return (String) validationArgs.get(URL_KEY);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return MarkupContentFactory.createMarkupContent(documentation, MarkupKind.MARKDOWN, support);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	public static String generateDocumentation(String documentation, String schemaURI, boolean html) {
		if (StringUtils.isBlank(documentation)) {
			return null;
		}
		StringBuilder doc = new StringBuilder(documentation);
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
	private String findPrefixFromDOMNode(String namespace) {
		if (node == null) {
			return null;
		}
		DOMElement element = null;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return element.getPrefix(namespace);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return MarkupContentFactory.createMarkupContent(documentation, MarkupKind.MARKDOWN, support);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return MarkupContentFactory.createMarkupContent(documentation, MarkupKind.MARKDOWN, request);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/utils/XMLGenerator.java`
#### Snippet
```java
			return MarkupContentFactory.createMarkupContent(documentation, MarkupKind.MARKDOWN, support);
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_element_missingCodeActionResolver.java`
#### Snippet
```java

			if (node == null || !node.isElement()) {
				return null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missingelement/required_elements_missing_expectedCodeActionResolver.java`
#### Snippet
```java

			if (node == null || !node.isElement()) {
				return null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/nogrammarconstraints/AbstractGenerateGrammarAndAssociationResolveCodeActionParticipant.java`
#### Snippet
```java
		} catch (BadLocationException e) {
			LOGGER.log(Level.SEVERE, "In NoGrammarConstraintsCodeAction position error", e);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
		String removedAmpAndSemiColon = name.substring(1, name.length() - 1);
		if (!diagnostic.getMessage().contains("\"" + removedAmpAndSemiColon + "\"")) {
			return null;
		}
		return removedAmpAndSemiColon;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/EntityNotDeclaredCodeAction.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/codeactions/missinggrammar/AbstractFixMissingGrammarCodeAction.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtension.java`
#### Snippet
```java
	@Override
	default XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier) throws XNIException, IOException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
		// it's the first XML Schema which was registered as
		// xs:noNamespaceSchemaLocation which is used.
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
					if (entry.isDirty()) {
						removeGrammar(entry.desc);
						return null;
					}
					return entry.grammar;
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPXMLGrammarPool.java`
#### Snippet
```java
				return RelaxNGUtils.createFilesChangedTracker((RelaxNGGrammar) grammar);
			}
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/LSPErrorReporterForXML.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtensionManager.java`
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
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/URIResolverExtensionManager.java`
#### Snippet
```java
			return new ResolvedURIInfo(resolvedURI, defaultURIResolverExtension);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/extensions/contentmodel/participants/diagnostics/XMLValidator.java`
#### Snippet
```java
	private static String getResolvedLocation(String documentURI, String location) {
		if (StringUtils.isBlank(location)) {
			return null;
		}
		try {
```

### ReturnNull
Return of `null`
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

## RuleId[id=UnnecessaryLocalVariable]
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
			if (originElement.getLocalName().equals(elt.getAttribute("name"))) {
				DOMAttr targetAttr = (DOMAttr) elt.getAttributeNode("name");
				LocationLink location = XMLPositionUtility.createLocationLink(originElement,
						targetAttr.getNodeAttrValue());
				return location;
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

## RuleId[id=PointlessBooleanExpression]
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

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
					// We need to close the opened streams
					if (!isJava1x) {
						Closeables.closeQuietly(process.getInputStream());
						Closeables.closeQuietly(process.getErrorStream());
						try {
```

### UnstableApiUsage
'closeQuietly(java.io.InputStream)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
					// We need to close the opened streams
					if (!isJava1x) {
						Closeables.closeQuietly(process.getInputStream());
						Closeables.closeQuietly(process.getErrorStream());
						try {
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
					if (!isJava1x) {
						Closeables.closeQuietly(process.getInputStream());
						Closeables.closeQuietly(process.getErrorStream());
						try {
							Closeables.close(process.getOutputStream(), false);
```

### UnstableApiUsage
'closeQuietly(java.io.InputStream)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
					if (!isJava1x) {
						Closeables.closeQuietly(process.getInputStream());
						Closeables.closeQuietly(process.getErrorStream());
						try {
							Closeables.close(process.getOutputStream(), false);
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
						Closeables.closeQuietly(process.getErrorStream());
						try {
							Closeables.close(process.getOutputStream(), false);
						} catch (IOException e) {
						}
```

### UnstableApiUsage
'close(java.io.Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/commons/ParentProcessWatcher.java`
#### Snippet
```java
						Closeables.closeQuietly(process.getErrorStream());
						try {
							Closeables.close(process.getOutputStream(), false);
						} catch (IOException e) {
						}
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		if (Files.exists(cachePath)) {
			// Remove the cache directory
			MoreFiles.deleteDirectoryContents(cachePath, RecursiveDeleteOption.ALLOW_INSECURE);
		}
	}
```

### UnstableApiUsage
'deleteDirectoryContents(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		if (Files.exists(cachePath)) {
			// Remove the cache directory
			MoreFiles.deleteDirectoryContents(cachePath, RecursiveDeleteOption.ALLOW_INSECURE);
		}
	}
```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		if (Files.exists(cachePath)) {
			// Remove the cache directory
			MoreFiles.deleteDirectoryContents(cachePath, RecursiveDeleteOption.ALLOW_INSECURE);
		}
	}
```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `org.eclipse.lemminx/src/main/java/org/eclipse/lemminx/uriresolver/CacheResourcesManager.java`
#### Snippet
```java
		if (Files.exists(cachePath)) {
			// Remove the cache directory
			MoreFiles.deleteDirectoryContents(cachePath, RecursiveDeleteOption.ALLOW_INSECURE);
		}
	}
```

