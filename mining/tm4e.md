# tm4e 
 
# Bad smells
I found 367 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 67 | false |
| JavadocReference | 66 | false |
| JavadocDeclaration | 36 | false |
| DuplicatedCode | 28 | false |
| RegExpRedundantEscape | 19 | false |
| CommentedOutCode | 15 | false |
| ProtectedMemberInFinalClass | 12 | true |
| UNCHECKED_WARNING | 11 | false |
| ManualMinMaxCalculation | 11 | false |
| UnusedAssignment | 9 | false |
| MissingSerialAnnotation | 8 | false |
| JavadocLinkAsPlainText | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| FieldCanBeLocal | 7 | false |
| DataFlowIssue | 6 | false |
| UnnecessaryStringEscape | 6 | true |
| MismatchedJavadocCode | 6 | false |
| SimplifyStreamApiCallChains | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| UseBulkOperation | 3 | false |
| EmptyStatementBody | 2 | false |
| RefusedBequest | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| SimplifiableConditionalExpression | 2 | false |
| TrivialIf | 2 | false |
| FieldMayBeFinal | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UnnecessaryContinue | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| UnnecessarySemicolon | 1 | false |
| FinalStaticMethod | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| DanglingJavadoc | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| ConditionalExpressionWithIdenticalBranches | 1 | false |
| RedundantFileCreation | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| MathRoundingWithIntArgument | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.tm4e.core.internal.matcher.Matcher\[\]' to 'org.eclipse.tm4e.core.internal.matcher.Matcher\>\[\]'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/BalancedBracketSelectors.java`
#### Snippet
```java
			final List<String> balancedBracketScopes,
			final List<String> unbalancedBracketScopes) {
		this.balancedBracketScopes = balancedBracketScopes.stream()
				.flatMap(selector -> {
					if ("*".equals(selector)) {
						this.allowAny = true;
						return Stream.empty();
					}
					return Matcher.createMatchers(selector).stream().map(m -> m.matcher);
				})
				.toArray(Matcher[]::new);

		this.unbalancedBracketScopes = unbalancedBracketScopes.stream()
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.tm4e.core.internal.matcher.Matcher\[\]' to 'org.eclipse.tm4e.core.internal.matcher.Matcher\>\[\]'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/BalancedBracketSelectors.java`
#### Snippet
```java
				.toArray(Matcher[]::new);

		this.unbalancedBracketScopes = unbalancedBracketScopes.stream()
				.flatMap(selector -> Matcher.createMatchers(selector).stream().map(m -> m.matcher))
				.toArray(Matcher[]::new);
	}

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var expected = new Theme(colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Bold, _C, _NOT_SET), list(), map(
								"identifier", new ThemeTrieElement(new ThemeTrieElementRule(2, null, Bold, _D, _NOT_SET)) //
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Bold, _C, _NOT_SET), list(), map(
								"identifier", new ThemeTrieElement(new ThemeTrieElementRule(2, null, Bold, _D, _NOT_SET)) //
						)) //
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
				colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, NotSet, _C, _NOT_SET)) //
				)));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
				colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Bold, _C, _NOT_SET)) //
				)));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var expected = new Theme(colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Bold, _F, _NOT_SET), list(), map(
								"identifier", new ThemeTrieElement(new ThemeTrieElementRule(2, null, Bold, _G, _NOT_SET)) //
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Bold, _F, _NOT_SET), list(), map(
								"identifier", new ThemeTrieElement(new ThemeTrieElementRule(2, null, Bold, _G, _NOT_SET)) //
						)),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
								"identifier", new ThemeTrieElement(new ThemeTrieElementRule(2, null, Bold, _G, _NOT_SET)) //
						)),
						"constant", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Italic, _C, _NOT_SET), list(), map(
								"numeric",
								new ThemeTrieElement(new ThemeTrieElementRule(2, null, Italic, _D, _NOT_SET), list(), map(
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
						"constant", new ThemeTrieElement(new ThemeTrieElementRule(1, null, Italic, _C, _NOT_SET), list(), map(
								"numeric",
								new ThemeTrieElement(new ThemeTrieElementRule(2, null, Italic, _D, _NOT_SET), list(), map(
										"hex", new ThemeTrieElement(new ThemeTrieElementRule(3, null, Bold, _D, _NOT_SET)),
										"oct", new ThemeTrieElement(new ThemeTrieElementRule(3, null, Bold | Italic | Underline, _D,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var expected = new Theme(colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(
								new ThemeTrieElementRule(1, null, Bold, _C, _NOT_SET),
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `StyledText`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ITheme.java`
#### Snippet
```java

	/**
	 * Initialize foreground, background color of the given {@link StyledText} with theme.
	 *
	 * @param styledText the StyledText to initialize
```

### JavadocReference
Cannot resolve symbol `IContentType`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ContentTypeLabelProvider.java`
#### Snippet
```java

/**
 * Label provider for {@link IContentType}.
 */
public final class ContentTypeLabelProvider extends LabelProvider implements ITableLabelProvider {
```

### JavadocReference
Cannot resolve symbol `BackingStoreException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * Save the themes definitions.
	 *
	 * @throws BackingStoreException
	 */
	void save() throws BackingStoreException;
```

### JavadocReference
Cannot resolve symbol `IToken`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ITokenProvider.java`
#### Snippet
```java

/**
 * Provider to retrieve Eclipse {@link IToken} from the TextMate token type.
 *
 */
```

### JavadocReference
Cannot resolve symbol `IToken`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ITokenProvider.java`
#### Snippet
```java

	/**
	 * Returns the Eclipse {@link IToken} from the given type and {@link #DEFAULT_TOKEN} otherwise.
	 *
	 * @param type
```

### JavadocReference
Cannot resolve symbol `IToken`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ITokenProvider.java`
#### Snippet
```java
	 * @param type
	 *
	 * @return the Eclipse {@link IToken} from the given type and {@link #DEFAULT_TOKEN} otherwise.
	 */
	IToken getToken(String type);
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/TMModelManager.java`
#### Snippet
```java

/**
 * TextMate model manager which connect/disconnect a {@link TMDocumentModel} with an Eclipse {@link IDocument}.
 */
public final class TMModelManager implements ITMModelManager {
```

### JavadocReference
Cannot resolve symbol `DocumentEvent`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/TMDocumentModel.java`
#### Snippet
```java

/**
 * Goal of this class is to synchronize Eclipse {@link DocumentEvent} with the TextMate tokenization model.
 */
public final class TMDocumentModel extends TMModel implements ITMDocumentModel, IDocumentListener {
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java

/**
 * Utilities class for {@link IDocument}.
 */
final class DocumentHelper {
```

### JavadocReference
Cannot resolve symbol `IDocumentListener`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java

	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
```

### JavadocReference
Cannot resolve symbol `documentAboutToBeChanged(DocumentEvent)`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java

	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
```

### JavadocReference
Cannot resolve symbol `DocumentEvent`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java

	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
```

### JavadocReference
Cannot resolve symbol `IDocumentListener`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
	 */
```

### JavadocReference
Cannot resolve symbol `documentChanged(DocumentEvent)`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
	 */
```

### JavadocReference
Cannot resolve symbol `DocumentEvent`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
	 */
```

### JavadocReference
Cannot resolve symbol `BadLocationException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
	/**
	 * Must only be called in {@link IDocumentListener#documentAboutToBeChanged(DocumentEvent)} and not
	 * {@link IDocumentListener#documentChanged(DocumentEvent)} where it might result in a {@link BadLocationException}
	 * exception
	 */
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

	/**
	 * Find the content types from the given {@link IDocument} by using
	 * {@link IEditorInput} and null otherwise.
	 *
```

### JavadocReference
Cannot resolve symbol `IEditorInput`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	/**
	 * Find the content types from the given {@link IDocument} by using
	 * {@link IEditorInput} and null otherwise.
	 *
	 * @param document
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} by using
	 *         {@link IEditorInput} and null otherwise.
	 */
```

### JavadocReference
Cannot resolve symbol `IEditorInput`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * 
	 * @return the content types from the given {@link IDocument} by using
	 *         {@link IEditorInput} and null otherwise.
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `ITextFileBuffer`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

	/**
	 * Returns the content types from the given {@link ITextFileBuffer}.
	 *
	 * @param buffer
```

### JavadocReference
Cannot resolve symbol `ITextFileBuffer`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @param buffer
	 * 
	 * @return the content types from the given {@link ITextFileBuffer}.
	 * 
	 * @throws CoreException
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content types from the given {@link ITextFileBuffer}.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

	/**
	 * Find the content types from the given {@link IDocument} by using
	 * {@link ITextFileBufferManager} and null otherwise.
	 *
```

### JavadocReference
Cannot resolve symbol `ITextFileBufferManager`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	/**
	 * Find the content types from the given {@link IDocument} by using
	 * {@link ITextFileBufferManager} and null otherwise.
	 *
	 * @param document
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} by using
	 *         {@link ITextFileBufferManager} and null otherwise.
	 * 
```

### JavadocReference
Cannot resolve symbol `ITextFileBufferManager`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * 
	 * @return the content types from the given {@link IDocument} by using
	 *         {@link ITextFileBufferManager} and null otherwise.
	 * 
	 * @throws CoreException
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 *         {@link ITextFileBufferManager} and null otherwise.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content of the given buffer.
	 * 
	 * @throws CoreException
	 */
	private static InputStream getContents(final ITextFileBuffer buffer) throws CoreException {
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

	/**
	 * Find the content types from the given {@link IDocument} and null otherwise.
	 *
	 * @param document
```

### JavadocReference
Cannot resolve symbol `IDocument`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} and null otherwise.
	 * 
	 * @throws CoreException
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content types from the given {@link IDocument} and null otherwise.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `IEditorInput`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

	/**
	 * Returns the {@link IEditorInput} from the given document and null otherwise.
	 *
	 * @param document
```

### JavadocReference
Cannot resolve symbol `IEditorInput`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @param document
	 * 
	 * @return the {@link IEditorInput} from the given document and null otherwise.
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `IContentType`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java

/**
 * {@link IContentType} utilities.
 *
 */
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java

	/**
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `DOWN`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `UP`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
 *
 * <ol>
 * <li>a TextMate grammar {@link IGrammar} used to initialize the {@link ITMDocumentModel}</li>
 * <li>a token provider {@link ITokenProvider} that maps {@link TMToken}s to JFace's {@link IToken}s</li>
 * </ol>
```

### JavadocReference
Cannot resolve symbol `TMToken`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
 * <ol>
 * <li>a TextMate grammar {@link IGrammar} used to initialize the {@link ITMDocumentModel}</li>
 * <li>a token provider {@link ITokenProvider} that maps {@link TMToken}s to JFace's {@link IToken}s</li>
 * </ol>
 */
```

### JavadocReference
Cannot resolve symbol `IToken`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
 * <ol>
 * <li>a TextMate grammar {@link IGrammar} used to initialize the {@link ITMDocumentModel}</li>
 * <li>a token provider {@link ITokenProvider} that maps {@link TMToken}s to JFace's {@link IToken}s</li>
 * </ol>
 */
```

### JavadocReference
Cannot resolve symbol `getLines()`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMModel.java`
#### Snippet
```java
	 * The {@link TokenizerThread} continuously runs tokenizing in background on the lines found in {@link TMModel#lines}.
	 *
	 * The {@link TMModel#lines} are expected to be accessed through {@link TMModel#getLines()} and manipulated by the UI
	 * part to inform of needs to (re)tokenize area, then the {@link TokenizerThread} processes them and emits events through the model.
	 *
```

### JavadocReference
Cannot resolve symbol `addModelTokensChangedListener(ModelTokensChangedListenerEvent.Listener)`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMModel.java`
#### Snippet
```java
	 *
	 * UI elements are supposed to subscribe and react to the events with
	 * {@link TMModel#addModelTokensChangedListener(ModelTokensChangedListenerEvent.Listener)}.
	 */
	private final class TokenizerThread extends Thread {
```

### JavadocReference
Cannot resolve symbol `ModelTokensChangedListenerEvent.Listener`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMModel.java`
#### Snippet
```java
	 *
	 * UI elements are supposed to subscribe and react to the events with
	 * {@link TMModel#addModelTokensChangedListener(ModelTokensChangedListenerEvent.Listener)}.
	 */
	private final class TokenizerThread extends Thread {
```

### JavadocReference
Cannot resolve symbol `Parser`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/css/sac/ISACParserFactory.java`
#### Snippet
```java

/**
 * SAC parser factory interface to get instance of SAC {@link Parser}.
 */
public interface ISACParserFactory {
```

### JavadocReference
Cannot resolve symbol `Nullable`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/NullSafetyHelper.java`
#### Snippet
```java

	/**
	 * Casts non-null value marked as {@link Nullable} to {@link NonNull}.
	 * <p>
	 * Only use if you are sure the value is non-null but annotation-based null analysis was not able to determine it.
```

### JavadocReference
Cannot resolve symbol `NonNull`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/NullSafetyHelper.java`
#### Snippet
```java

	/**
	 * Casts non-null value marked as {@link Nullable} to {@link NonNull}.
	 * <p>
	 * Only use if you are sure the value is non-null but annotation-based null analysis was not able to determine it.
```

### JavadocReference
Cannot resolve symbol `Nullable`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/NullSafetyHelper.java`
#### Snippet
```java

	/**
	 * Casts a non-null value as {@link Nullable}.
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `com.google.common.base.Splitter`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/StringUtils.java`
#### Snippet
```java
	 * Very fast String splitting.
	 *
	 * 7.5 times faster than {@link String#split(String)} and 2.5 times faster than {@link com.google.common.base.Splitter}.
	 */
	public static String[] splitToArray(final String line, final char separator) {
```

### JavadocReference
Cannot resolve symbol `WarnCallback`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/oniguruma/OnigRegExp.java`
#### Snippet
```java

	/**
	 * {@link WarnCallback} which is used if log level is at least Level.WARNING.
	 */
	private static final WarnCallback LOGGER_WARN_CALLBACK = message -> LOGGER.log(Level.WARNING, message);
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * @param contentTypes the content types to lookup for grammar association.
	 *
	 * @return the first {@link IGrammar} that applies to given content-types, or
	 *         <code>null</code> if no content-type has a grammar associated. Grammars associated
	 *         with parent content-types will be returned if applicable.
```

### JavadocReference
Cannot resolve symbol `BackingStoreException`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * Save the grammar definitions.
	 *
	 * @throws BackingStoreException
	 */
	void save() throws BackingStoreException;
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java

	/**
	 * Returns the {@link IGrammar} for the given scope name and null otherwise.
	 *
	 * @return the {@link IGrammar} for the given scope name and null otherwise.
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * Returns the {@link IGrammar} for the given scope name and null otherwise.
	 *
	 * @return the {@link IGrammar} for the given scope name and null otherwise.
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java

	/**
	 * Returns the {@link IGrammar} for the given file type and null otherwise.
	 *
	 * @return the {@link IGrammar} for the file type name and null otherwise.
```

### JavadocReference
Cannot resolve symbol `IGrammar`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * Returns the {@link IGrammar} for the given file type and null otherwise.
	 *
	 * @return the {@link IGrammar} for the file type name and null otherwise.
	 */
	@Nullable
```

### JavadocReference
Cannot resolve symbol `IAutoEditStrategy`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java

/**
 * {@link IAutoEditStrategy} which uses VSCode language-configuration.json.
 */
public class LanguageConfigurationAutoEditStrategy implements IAutoEditStrategy {
```

### JavadocReference
Cannot resolve symbol `PatternSyntaxException`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/OnEnterRule.java`
#### Snippet
```java
	 * Only for unit tests
	 *
	 * @throws PatternSyntaxException if beforeText or afterText contain invalid regex pattern
	 */
	OnEnterRule(final String beforeText, @Nullable final String afterText, final EnterAction action) {
```

### JavadocReference
Cannot resolve symbol `BadLocationException`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
	 *         tab
	 *
	 * @exception BadLocationException if position is an invalid range in the given document
	 */
	private static int findEndOfWhiteSpace(final IDocument document, int offset, final int end)
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java

	/**
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `DOWN`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

### JavadocReference
Cannot resolve symbol `UP`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
	 * Returns the {@linkplain SWT} style constant for the sort direction.
	 *
	 * @return {@link SWT#DOWN} for asc sorting, {@link SWT#UP} otherwise
	 */
	public int getDirection() {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Switch label `PreferenceConstants.E4_THEME_ID` is unreachable
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java

			switch (event.getKey()) {
				case PreferenceConstants.E4_THEME_ID:
					preferenceThemeChange((String) event.getNewValue(), TMUIPlugin.getThemeManager());
					break;
```

### DataFlowIssue
Switch label `PreferenceConstants.THEME_ASSOCIATIONS` is unreachable
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
					preferenceThemeChange((String) event.getNewValue(), TMUIPlugin.getThemeManager());
					break;
				case PreferenceConstants.THEME_ASSOCIATIONS:
					preferenceThemeChange(PreferenceUtils.getE4PreferenceCSSThemeId(), TMUIPlugin.getThemeManager());
					break;
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
				if (newDocGrammar == null) {
					TMPresentationReconciler.this.colorizer = null;
					TMPresentationReconciler.this.grammar = null;
					if (PreferenceUtils.isDebugThrowError())
						throw new TMException("Cannot find TextMate grammar for the given document!");
```

### DataFlowIssue
Argument `clazz.getResourceAsStream(resourceName)` might be null
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/registry/IGrammarSource.java`
#### Snippet
```java
			public Reader getReader() throws IOException {
				return new BufferedReader(new InputStreamReader(
						clazz.getResourceAsStream(resourceName),
						charset == null ? StandardCharsets.UTF_8 : charset));
			}
```

### DataFlowIssue
Argument `clazz.getResourceAsStream(resourceName)` might be null
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/registry/IThemeSource.java`
#### Snippet
```java
			public Reader getReader() throws IOException {
				return new BufferedReader(new InputStreamReader(
						clazz.getResourceAsStream(resourceName),
						charset == null ? StandardCharsets.UTF_8 : charset));
			}
```

### DataFlowIssue
Method invocation `getOffset` will produce `NullPointerException`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
		final var regions = textSelection instanceof final IMultiTextSelection multiSelection
				? multiSelection.getRegions()
				: new IRegion[] { new Region(textSelection.getOffset(), textSelection.getLength()) };
		final var lines = new HashSet<Integer>();
		for (final var region : regions) {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/MarkerConfig.java`
#### Snippet
```java
	public enum Type {
		PROBLEM,
		TASK;
	}

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeTrieElementRule.java`
#### Snippet
```java

	public void acceptOverwrite(final int scopeDepth, final int fontStyle, final int foreground, final int background) {
		if (this.scopeDepth > scopeDepth) {
			// TODO!!!
			// console.log('how did this happen?');
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/rule/RuleFactory.java`
#### Snippet
```java
				} catch (final IndexOutOfBoundsException ex) {
					rule = null;
					if (patternInclude != null) {
						// TODO currently happens if an include rule references another not yet parsed rule
					} else {
```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/TMException.java`
#### Snippet
```java
public class TMException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TMException(final String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/raw/RawTheme.java`
#### Snippet
```java
		implements IRawTheme, IRawThemeSetting, IThemeSetting, PropertySettable<Object> {

	private static final long serialVersionUID = 1L;

	@Nullable
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawCaptures.java`
#### Snippet
```java
public final class RawCaptures extends HashMap<String, IRawRule> implements IRawCaptures, PropertySettable<IRawRule> {

	private static final long serialVersionUID = 1L;

	@Override
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawRepository.java`
#### Snippet
```java
public final class RawRepository extends HashMap<String, IRawRule> implements IRawRepository, PropertySettable<IRawRule> {

	private static final long serialVersionUID = 1L;

	public static final String DOLLAR_BASE = "$base";
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawRule.java`
#### Snippet
```java
	public static final String WHILE_CAPTURES = "whileCaptures";

	private static final long serialVersionUID = 1L;

	@Nullable
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawGrammar.java`
#### Snippet
```java
	public IRawRule toRawRule() {
		return new RawRule() {
			private static final long serialVersionUID = 1L;

			@Override
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawGrammar.java`
#### Snippet
```java
	private static final String SCOPE_NAME = "scopeName";

	private static final long serialVersionUID = 1L;

	@Nullable
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/Tokens.java`
#### Snippet
```java
public class Tokens extends ArrayList<Token> {

	private static final long serialVersionUID = 1L;

	@Nullable
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/MarkerUtils.java`
#### Snippet
```java
			}
			tagSelectorPattern = Pattern
					.compile("\\b(" + markerConfigByTag.keySet().stream().collect(Collectors.joining("|")) + ")\\b");
		}
	}
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
				document);
		lines = lines.stream().filter(l -> l >= selectionStartLine && l <= selectionEndLine && !TextUtils.isBlankLine(document, l))
				.map(l -> {
					lineRange[0] = lineRange[0] == -1 || lineRange[0] > l ? l : lineRange[0];
					lineRange[1] = lineRange[1] < l ? l : lineRange[1];
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
								lines = lines.stream().filter(l -> l >= selectionStartLine && l <= selectionEndLine
										&& !TextUtils.isBlankLine(document, l))
										.map(l -> {
											lineRange[0] = lineRange[0] == -1 || lineRange[0] > l ? l : lineRange[0];
											lineRange[1] = lineRange[1] < l ? l : lineRange[1];
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
			final String close) {
		final ITypedRegion[] brokenBlockComment = { null, null };
		blockCommentParts.stream().forEach(bc -> {
			if (open.equals(bc.getType())) {
				brokenBlockComment[0] = bc;	// Save as "broken" block comment open part, so the last open part will be the result
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
					"name": "CSS at-rule keyword control",
					"scope": "
						meta.at-rule.return.scss,\n
						meta.at-rule.return.scss punctuation.definition,\n
						meta.at-rule.else.scss,\n
```

### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
					"scope": "
						meta.at-rule.return.scss,\n
						meta.at-rule.return.scss punctuation.definition,\n
						meta.at-rule.else.scss,\n
						meta.at-rule.else.scss punctuation.definition,\n
```

### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
						meta.at-rule.return.scss,\n
						meta.at-rule.return.scss punctuation.definition,\n
						meta.at-rule.else.scss,\n
						meta.at-rule.else.scss punctuation.definition,\n
						meta.at-rule.if.scss,\n
```

### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
						meta.at-rule.return.scss punctuation.definition,\n
						meta.at-rule.else.scss,\n
						meta.at-rule.else.scss punctuation.definition,\n
						meta.at-rule.if.scss,\n
						meta.at-rule.if.scss punctuation.definition\n
```

### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
						meta.at-rule.else.scss,\n
						meta.at-rule.else.scss punctuation.definition,\n
						meta.at-rule.if.scss,\n
						meta.at-rule.if.scss punctuation.definition\n
					",
```

### UnnecessaryStringEscape
`\n` is unnecessarily escaped
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
						meta.at-rule.else.scss punctuation.definition,\n
						meta.at-rule.if.scss,\n
						meta.at-rule.if.scss punctuation.definition\n
					",
					"settings": {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/rule/RegExpSource.java`
#### Snippet
```java
						final char nextCh = regExpSource.charAt(pos + 1);
						if (nextCh == 'z') {
							output.append(regExpSource.substring(lastPushedPos, pos));
							output.append("$(?!\\n)(?<!\\n)");
							lastPushedPos = pos + 2;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/rule/RegExpSource.java`
#### Snippet
```java
				source = regExpSource;
			} else {
				output.append(regExpSource.substring(lastPushedPos, len));
				source = output.toString();
			}
```

### StringOperationCanBeSimplified
Unnecessary zero argument
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/StringUtils.java`
#### Snippet
```java
		final var result = new ArrayList<String>(8);
		int start = 0;
		int end = line.indexOf(separator, 0);
		while (end >= 0) {
			result.add(line.substring(start, end));
```

### StringOperationCanBeSimplified
Unnecessary zero argument
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/StringUtils.java`
#### Snippet
```java
		int count = 0;
		int start = 0;
		int end = line.indexOf(separator, 0);
		while (end >= 0) {
			if (count == tmp.length) { // check if array needs resize
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (15 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/ThemeAssociationRegistry.java`
#### Snippet
```java
	}

	// IThemeAssociation getThemeAssociationFor(String scopeName, String
	// eclipseThemeId) {
	// IThemeAssociation association = null;
```

### CommentedOutCode
Commented out code (5 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java
				return associations.get(0);
			}
			/*for (IThemeAssociation association : associations) {
				if (association.isDefault()) {
					return association;
```

### CommentedOutCode
Commented out code (9 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java
		// when association is marked as default or scope name is defined,
		// update the default association or association for a given E4 Theme.
		/*if (association.isDefault()) {
			if (eclipseThemeId == null) {
				defaultAssociation = association;
```

### CommentedOutCode
Commented out code (5 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java
	void unregister(final IThemeAssociation association) {
		//String eclipseThemeId = association.getEclipseThemeId();
		/*if (association.isDefault()) {
			if (eclipseThemeId == null) {
				defaultAssociation = null;
```

### CommentedOutCode
Commented out code (9 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java
			}
		}*/
//		Collection<IThemeAssociation> associations = eclipseThemeIds.get(eclipseThemeId);
//		if (associations != null) {
//			for (IThemeAssociation a : associations) {
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java

	IThemeAssociation[] getThemeAssociations(final boolean isDefault) {
		/*if (isDefault) {
			return getThemeAssociations().stream().filter(theme -> theme.isDefault()).toArray(IThemeAssociation[]::new);
		}*/
```

### CommentedOutCode
Commented out code (18 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/BaseThemeAssociationRegistry.java`
#### Snippet
```java

	boolean hasThemeAssociationsForTheme(final String themeId, final String eclipseThemeId) {
//		Collection<IThemeAssociation> associations = eclipseThemeIds.get(eclipseThemeId);
//		if (associations != null) {
//			for (IThemeAssociation themeAssociation : associations) {
```

### CommentedOutCode
Commented out code (11 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/text/TMPresentationReconcilerTestGenerator.java`
#### Snippet
```java
	private final StringBuilder code = new StringBuilder();

	/*private List<Command> commands = new ArrayList<>();
	
	private static final class Command {
```

### CommentedOutCode
Commented out code (6 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/text/TMPresentationReconcilerTestGenerator.java`
#### Snippet
```java
	@Override
	public void onColorized(final TextPresentation presentation, @Nullable final Throwable e) {
		// Command command = commands.get(commands.size() - 1);
		// if (e != null) {
		// command.error = e;
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/text/TMPresentationReconcilerTestGenerator.java`
#### Snippet
```java
	public void onUninstalled() {

		// for (Command command : commands) {
		// write(toString(command.ranges));
		// }
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/ThemePreferencePage.java`
#### Snippet
```java
		final var data = new GridData(GridData.FILL_HORIZONTAL);
		// TODO replace SWTUtil
		// data.widthHint= SWTUtil.getButtonWidthHint(button);
		// data.heightHint= SWTUtil.getButtonHeightHint(button);

```

### CommentedOutCode
Commented out code (5 lines)
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/css/CSSAttributeCondition.java`
#### Snippet
```java
	public int nbMatch(final String... names) {
		// TODO
		// String val = getValue();
		// if (val == null) {
		// return !e.getAttribute(getLocalName()).equals("");
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokenizer.java`
#### Snippet
```java

			if (rule instanceof final BeginEndRule pushedRule) {
				/*if(LOGGER.isLoggable(DEBUG)) {
					LOGGER.log(DEBUG, " pushing " + pushedRule.debugName + " - " + pushedRule.debugBeginRegExp);
				}*/
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokenizer.java`
#### Snippet
```java
				}
			} else if (rule instanceof final BeginWhileRule pushedRule) {
				// if (DebugFlags.InDebugMode) {
				// console.log(" pushing " + pushedRule.debugName);
				// }
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/BlockRules.java`
#### Snippet
```java
				+ source.replaceFirst("\\\\1", "\\\\3")
				+ "|";
		// pattern = pattern.replaceAll("\\\"", "\\\\\"");
		// pattern = pattern.replaceAll("[$]", "\\\\\\$");
		gfm.paragraph.replace("\\(\\?\\!", pattern);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/RegexSource.java`
#### Snippet
```java
public final class RegexSource {

	private static final Pattern CAPTURING_REGEX_SOURCE = Pattern.compile("\\$(\\d+)|\\$\\{(\\d+):\\/(downcase|upcase)}");

	/**
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\,` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

		final java.util.regex.Matcher regex;
```

### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\^` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

### RegExpRedundantEscape
Redundant character escape `\\#` in RegExp
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/RegExpUtils.java`
#### Snippet
```java
	 */
	public static String escapeRegExpCharacters(final String value) {
		return value.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"); //$NON-NLS-1$ //$NON-NLS-2$
	}

```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/rule/RegExpSource.java`
#### Snippet
```java

	@Override
	protected RegExpSource clone() {
		return new RegExpSource(source, this.ruleId);
	}
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeTrieElementRule.java`
#### Snippet
```java

	@Override
	public ThemeTrieElementRule clone() {
		return new ThemeTrieElementRule(this.scopeDepth, this.parentScopes, this.fontStyle, this.foreground, this.background);
	}
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
							break;
						}
						case Indent: {
							// Indent once
							final String increasedIndent = normalizeIndentation(enterAction.indentation + enterAction.appendText, editor);
							final String typeText = delim + increasedIndent;

							command.text = typeText;
							command.shiftsCaret = false;
							command.caretOffset = command.offset + (delim + increasedIndent).length();
							break;
						}
						case IndentOutdent: {
							// Ultra special
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/EnterAction.java`
#### Snippet
```java
			switch (value) {
				case "none":
					return IndentAction.None;
				case "indent":
					return IndentAction.Indent;
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' expression has too few case labels (1), and should probably be replaced with an 'if' statement or conditional operator
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ContentTypeLabelProvider.java`
#### Snippet
```java
	@Override
	public String getColumnText(@Nullable final Object element, final int columnIndex) {
		return switch (columnIndex) {
			case 0 -> {
				IContentType contentType = null;
```

### SwitchStatementWithTooFewBranches
'switch' expression has too few case labels (1), and should probably be replaced with an 'if' statement or conditional operator
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ThemeAssociationLabelProvider.java`
#### Snippet
```java

		final IThemeAssociation association = (IThemeAssociation) element;
		return switch (columnIndex) {
			case 0 -> {
				final ITheme theme = getTheme(association);
```

### SwitchStatementWithTooFewBranches
'switch' expression has only 'default' case
in `org.eclipse.tm4e.samples/src/main/java/org/eclipse/tm4e/samples/angular2/Angular2ViewerConfiguration.java`
#### Snippet
```java
			@Override
			public IGrammarSource getGrammarSource(final String scopeName) {
				final var resourceName = switch (scopeName) {
					// case "source.ng.css" -> "source.ng.css.json";
					// case "source.ng.ts" -> "source.ng.ts.json";
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var colorMap = new ColorMap();
		final int _A = colorMap.getId("#000000");
		final int _B = colorMap.getId("#ffffff");
		final var expected = new Theme(
				colorMap,
				StyleAttributes.of(None, _A, _B),
				NOTSET_THEME_TRIE_ELEMENT);
		assertThemeEqual(actual, expected);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var actual = createTheme(new ParsedThemeRule("", null, -1, NotSet, null, null));
		final var colorMap = new ColorMap();
		final int _A = colorMap.getId("#000000");
		final int _B = colorMap.getId("#ffffff");
		final var expected = new Theme(
				colorMap,
				StyleAttributes.of(None, _A, _B),
				NOTSET_THEME_TRIE_ELEMENT);
		assertThemeEqual(actual, expected);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeResolvingTest.java`
#### Snippet
```java
		final var colorMap = new ColorMap();
		final int _A = colorMap.getId("#F8F8F2");
		final int _B = colorMap.getId("#272822");
		final int _C = colorMap.getId("#ff0000");
		final var expected = new Theme(
				colorMap,
				StyleAttributes.of(None, _A, _B),
				new ThemeTrieElement(NOTSET_THEME_TRIE_ELEMENT_RULE, list(), map(
						"var", new ThemeTrieElement(new ThemeTrieElementRule(1, null, NotSet, _C, _NOT_SET)) //
				)));
		assertThemeEqual(actual, expected);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokenizer.java`
#### Snippet
```java
				handleCaptures(
						grammar,
						lineText,
						isFirstLine,
						stack,
						lineTokens,
						pushedRule.beginCaptures,
						captureIndices);
				lineTokens.produce(stack, captureIndices[0].end);
				anchorPosition = captureIndices[0].end;

				final var contentName = pushedRule.getContentName(lineText.content, captureIndices);
				final var contentNameScopesList = nameScopesList.pushAttributed(contentName, grammar);
				stack = stack.withContentNameScopesList(contentNameScopesList);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/raw/RawGrammarReader.java`
#### Snippet
```java
		try (var reader = source.getReader()) {
			switch (source.getContentType()) {
				case JSON:
					return JSON_PARSER.parse(reader);
				case YAML:
					return YAML_PARSER.parse(reader);
				case XML:
				default:
					return XML_PARSER.parse(reader);
			}
		}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeTrieElement.java`
#### Snippet
```java
		final int dotIndex = scope.indexOf('.');
		final String head;
		final String tail;
		if (dotIndex == -1) {
			head = scope;
			tail = "";
		} else {
			head = scope.substring(0, dotIndex);
			tail = scope.substring(dotIndex + 1);
		}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/registry/IGrammarSource.java`
#### Snippet
```java
		final var filePath = file.toString();
		final var contentType1 = contentType == null ? guessFileFormat(filePath) : contentType;
		return new IGrammarSource() {
			@Override
			public Reader getReader() throws IOException {
				return Files.newBufferedReader(file, charset == null ? StandardCharsets.UTF_8 : charset);
			}

			@Override
			public String getFilePath() {
				return filePath;
			}

			@Override
			public ContentType getContentType() {
				return contentType1;
			}
		};
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/registry/IGrammarSource.java`
#### Snippet
```java
		final var contentType1 = contentType == null ? guessFileFormat(resourceName) : contentType;
		return new IGrammarSource() {
			@Override
			public Reader getReader() throws IOException {
				return new BufferedReader(new InputStreamReader(
						clazz.getResourceAsStream(resourceName),
						charset == null ? StandardCharsets.UTF_8 : charset));
			}

			@Override
			public String getFilePath() {
				return resourceName;
			}

			@Override
			public ContentType getContentType() {
				return contentType1;
			}
		};
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
		file.create(new ByteArrayInputStream("a\n\nb\n\nc".getBytes()), true, null);
		final var editor = (ITextEditor) IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file,
				"org.eclipse.ui.genericeditor.GenericEditor");
		final var doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		final var service = PlatformUI.getWorkbench().getService(IHandlerService.class);
		String text = doc.get();
		editor.getSelectionProvider().setSelection(new TextSelection(0, text.length()));
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
		file.create(new ByteArrayInputStream(text.getBytes()), true, null);
		final var editor = (ITextEditor) IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file,
				"org.eclipse.ui.genericeditor.GenericEditor");
		final var doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		final var service = PlatformUI.getWorkbench().getService(IHandlerService.class);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
		final String text = "/* a */";
		final var now = System.currentTimeMillis();
		final var proj = ResourcesPlugin.getWorkspace().getRoot().getProject(getClass().getName() + now);
		proj.create(null);
		proj.open(null);
		final var file = proj.getFile("whatever.noLineComment");
		file.create(new ByteArrayInputStream(text.getBytes()), true, null);
		final var editor = (ITextEditor) IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file,
				"org.eclipse.ui.genericeditor.GenericEditor");
		final var doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		final var service = PlatformUI.getWorkbench().getService(IHandlerService.class);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
		final var now = System.currentTimeMillis();
		final var proj = ResourcesPlugin.getWorkspace().getRoot().getProject(getClass().getName() + now);
		proj.create(null);
		proj.open(null);
		final var file = proj.getFile("whatever.noLineComment");
		file.create(new ByteArrayInputStream(text.getBytes()), true, null);
		final var editor = (ITextEditor) IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file,
				"org.eclipse.ui.genericeditor.GenericEditor");
		final var doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		final var service = PlatformUI.getWorkbench().getService(IHandlerService.class);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
		final String text = "/* a */ b /* c */";
		final var now = System.currentTimeMillis();
		final var proj = ResourcesPlugin.getWorkspace().getRoot().getProject(getClass().getName() + now);
		proj.create(null);
		proj.open(null);
		final var file = proj.getFile("whatever.noLineComment");
		file.create(new ByteArrayInputStream(text.getBytes()), true, null);
		final var editor = (ITextEditor) IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file,
				"org.eclipse.ui.genericeditor.GenericEditor");
		final var doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		final var service = PlatformUI.getWorkbench().getService(IHandlerService.class);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
							final String increasedIndent = normalizeIndentation(enterAction.indentation + enterAction.appendText, editor);
							final String typeText = delim + increasedIndent;

							command.text = typeText;
							command.shiftsCaret = false;
							command.caretOffset = command.offset + (delim + increasedIndent).length();
							break;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
								lines = lines.stream().filter(l -> l >= selectionStartLine && l <= selectionEndLine
										&& !TextUtils.isBlankLine(document, l))
										.map(l -> {
											lineRange[0] = lineRange[0] == -1 || lineRange[0] > l ? l : lineRange[0];
											lineRange[1] = lineRange[1] < l ? l : lineRange[1];
											return l;
										}).collect(Collectors.toSet());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
									int deletedChars = 0;
									for (ITypedRegion existingBlock : existingBlocks) {
										existingBlock = new TypedRegion(existingBlock.getOffset() - deletedChars,
												existingBlock.getLength(), existingBlock.getType());
										document.replace(existingBlock.getOffset(), existingBlock.getLength(), "");
										deletedChars += existingBlock.getLength();

										final int selectionStart = textSelection.getOffset() + shiftOffset;
										final int selectionLength = textSelection.getLength() + shiftLength;
										final int selectionEnd = selectionStart + selectionLength;
										if (isBeforeSelection(existingBlock, selectionStart)) {
											shiftOffset -= existingBlock.getLength();
										} else if (isInsideSelection(existingBlock, selectionStart, selectionEnd)) {
											shiftLength -= existingBlock.getLength();
										}
									}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/LanguageConfigurationPreferencePage.java`
#### Snippet
```java
		final var parent = new Composite(ancestor, SWT.NONE);
		final var layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);

		final var innerParent = new Composite(parent, SWT.NONE);
		final var innerLayout = new GridLayout();
		innerLayout.numColumns = 2;
		innerLayout.marginHeight = 0;
		innerLayout.marginWidth = 0;
		innerParent.setLayout(innerLayout);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/LanguageConfigurationPreferencePage.java`
#### Snippet
```java
		final var tableComposite = new Composite(parent, SWT.NONE);
		final var data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 360;
		data.heightHint = convertHeightInCharsToPixels(10);
		tableComposite.setLayoutData(data);

		final var columnLayout = new TableColumnLayout();
		tableComposite.setLayout(columnLayout);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/LanguageConfigurationPreferencePage.java`
#### Snippet
```java
		BidiUtils.applyTextDirection(definitionViewer.getControl(), BidiUtils.BTD_DEFAULT);

		final var buttons = new Composite(parent, SWT.NONE);
		buttons.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		final var layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		buttons.setLayout(layout);

		final var definitionNewButton = new Button(buttons, SWT.PUSH);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
		if (viewer instanceof final TableViewer tableViewer) {
			final IBaseLabelProvider baseLabel = tableViewer.getLabelProvider();
			final String left = ((ITableLabelProvider) baseLabel).getColumnText(e1, fSortColumn);
			final String right = ((ITableLabelProvider) baseLabel).getColumnText(e2, fSortColumn);
			final int sortResult = getComparator()
					.compare(left != null ? left : "", right != null ? right : ""); //$NON-NLS-1$ //$NON-NLS-2$
			return sortResult * fSortOrder;
		}
		return super.compare(viewer, e1, e2);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		assert parent != null;
		initializeDialogUnits(parent);
		final var topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());

		createBody(topLevel);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		fileText.addListener(SWT.Modify, this);

		final var buttons = new Composite(parent, SWT.NONE);
		buttons.setLayout(new GridLayout(2, false));
		final var gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.RIGHT;
		buttons.setLayoutData(gd);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		browseFileSystemButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@Nullable final SelectionEvent e) {
				final var dialog = new FileDialog(parent.getShell());
				dialog.setFilterExtensions(TEXTMATE_EXTENSIONS);
				dialog.setFilterPath(fileText.getText());
				final String result = dialog.open();
				if (result != null && !result.isEmpty()) {
					fileText.setText(result);
				}
			}
		});

		final var browseWorkspaceButton = new Button(buttons, SWT.NONE);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/TMDocumentModelTest.java`
#### Snippet
```java
		final var initialLines = List.of(
				"//comment1",
				"//comment2",
				"//comment3");

		final var event = awaitModelChangedEvent(model, initialLines,
				() -> doc.replace(doc.getLineOffset(1) + 4, 0, LF));

		final var expectedLines = new ArrayList<>(initialLines);
		expectedLines.set(1, "//co");
		expectedLines.add(2, "mment2");
		assertDocHasLines(expectedLines);

		assertRange(event, 2, 3);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/TMPresentationReconcilerTypeScriptTest.java`
#### Snippet
```java
final List<ICommand> commands = editor.execute();
		assertEquals(2, commands.size());

		// document.set("let a = '';\nlet b = 10;\nlet c = true;");
		final ICommand command0 = commands.get(0);
		assertEquals("["
				+ "StyleRange {0, 3, fontStyle=bold, foreground=Color {7, 54, 66, 255}}, "
				+ "StyleRange {3, 1, fontStyle=normal}, "
				+ "StyleRange {4, 1, fontStyle=normal, foreground=Color {38, 139, 210, 255}}, "
				+ "StyleRange {5, 1, fontStyle=normal}, "
				+ "StyleRange {6, 1, fontStyle=normal, foreground=Color {133, 153, 0, 255}}, "
				+ "StyleRange {7, 1, fontStyle=normal}, "
				+ "StyleRange {8, 2, fontStyle=normal, foreground=Color {42, 161, 152, 255}}, "
				+ "StyleRange {10, 2, fontStyle=normal}, "
				+ "StyleRange {12, 3, fontStyle=bold, foreground=Color {7, 54, 66, 255}}, "
				+ "StyleRange {15, 1, fontStyle=normal}, "
				+ "StyleRange {16, 1, fontStyle=normal, foreground=Color {38, 139, 210, 255}}, "
				+ "StyleRange {17, 1, fontStyle=normal}, "
				+ "StyleRange {18, 1, fontStyle=normal, foreground=Color {133, 153, 0, 255}}, "
				+ "StyleRange {19, 1, fontStyle=normal}, "
				+ "StyleRange {20, 2, fontStyle=normal, foreground=Color {211, 54, 130, 255}}, "
				+ "StyleRange {22, 2, fontStyle=normal}, "
				+ "StyleRange {24, 3, fontStyle=bold, foreground=Color {7, 54, 66, 255}}, "
				+ "StyleRange {27, 1, fontStyle=normal}, "
				+ "StyleRange {28, 1, fontStyle=normal, foreground=Color {38, 139, 210, 255}}, "
				+ "StyleRange {29, 1, fontStyle=normal}, "
				+ "StyleRange {30, 1, fontStyle=normal, foreground=Color {133, 153, 0, 255}}, "
				+ "StyleRange {31, 1, fontStyle=normal}, "
				+ "StyleRange {32, 4, fontStyle=normal, foreground=Color {181, 137, 0, 255}}, "
				+ "StyleRange {36, 1, fontStyle=normal}"
				+ "]",
				command0.getStyleRanges());

		// viewer.invalidateTextPresentation(0, 3);
		final ICommand command1 = commands.get(1);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/support/command/Command.java`
#### Snippet
```java
		final var newText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			final char c = text.charAt(i);
			switch (c) {
				case '\n':
					newText.append("\\n");
					break;
				case '\r':
					newText.append("\\r");
					break;
				case '"':
					newText.append("\\\"");
					break;
				default:
					newText.append(c);
			}
		}
		return newText.toString();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/themes/TMEditorColorTest.java`
#### Snippet
```java
		final var f = TestUtils.createTempFile(".ts");

		editor = IDE.openEditor(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
				f.toURI(),
				genericEditorDescr.getId(),
				true);

		final StyledText styledText = (StyledText) editor.getAdapter(Control.class);

		final String themeId = manager.getDefaultTheme().getId();
		final ITheme theme = manager.getThemeById(themeId);
		assertEquals(SolarizedLight, themeId, "Default light theme isn't set");
```

### DuplicatedCode
Duplicated code
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final GC gc = new GC(getShell());
		gc.setFont(JFaceResources.getDialogFont());

		final var viewerComparator = new ColumnViewerComparator();

		grammarViewer = new TableViewer(table);

		final var column1 = new TableColumn(table, SWT.NONE);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * Returns the list of TextMate themes.
	 *
	 * @return the list of TextMate themes.
	 */
	ITheme[] getThemes();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * Returns list of all theme associations.
	 *
	 * @return list of all theme associations.
	 */
	IThemeAssociation[] getAllThemeAssociations();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * Returns the list of TextMate themes for the given eclipse theme id.
	 *
	 * @return the list of TextMate themes for the given eclipse theme id.
	 */
	ITheme[] getThemes(boolean dark);
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/snippets/ISnippetManager.java`
#### Snippet
```java
	 * @param scopeName
	 *
	 * @return list of snippet for a given scope name and empty otherwise.
	 */
	ISnippet[] getSnippets(String scopeName);
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * Returns the list of registered TextMate grammar definitions.
	 *
	 * @return the list of registered TextMate grammar definitions.
	 */
	IGrammarDefinition[] getDefinitions();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/ILanguageConfigurationRegistryManager.java`
#### Snippet
```java
	 * Returns the list of registered language configuration definitions.
	 *
	 * @return the list of registered language configuration definitions.
	 */
	ILanguageConfigurationDefinition[] getDefinitions();
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/menus/ThemeContribution.java`
#### Snippet
```java

	@Override
	protected IContributionItem[] getContributionItems() {
		final var items = new ArrayList<IContributionItem>();
		if (handlerService != null) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/wizards/CreateThemeAssociationWizardPage.java`
#### Snippet
```java
	private Button whenDarkButton = lazyNonNull();

	protected CreateThemeAssociationWizardPage(@Nullable final IGrammarDefinition initialDefinition,
			@Nullable final IThemeAssociation initialAssociation) {
		super(PAGE_NAME);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/wizards/SelectGrammarWizardPage.java`
#### Snippet
```java
	// private ContentTypesBindingWidget contentTypesWidget;

	protected SelectGrammarWizardPage() {
		super(PAGE_NAME);
		super.setTitle(TMUIMessages.SelectGrammarWizardPage_title);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TextMatePreferencePage.java`
#### Snippet
```java

	@Override
	protected Control createContents(@Nullable final Composite parent) {
		final var composite = new Composite(parent, SWT.NONE);
		final var layout = new GridLayout(1, false);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/ThemePreferencePage.java`
#### Snippet
```java

	@Override
	protected Control createContents(@Nullable final Composite ancestor) {
		final var parent = new SashForm(ancestor, SWT.VERTICAL | SWT.SMOOTH);
		parent.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TaskTagsPreferencePage.java`
#### Snippet
```java

	@Override
	protected void performDefaults() {
		markerConfigs.clear();
		markerConfigs.addAll(MarkerConfig.getDefaults());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TaskTagsPreferencePage.java`
#### Snippet
```java

	@Override
	protected Control createContents(final @Nullable Composite ancestor) {
		final var parent = new Composite(ancestor, SWT.NONE);
		final var layout = new GridLayout();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TaskTagsPreferencePage.java`
#### Snippet
```java

		@Override
		protected Control createDialogArea(final @Nullable Composite parent) {
			final var area = (Composite) super.createDialogArea(parent);
			final var container = new Composite(area, SWT.NONE);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TaskTagsPreferencePage.java`
#### Snippet
```java

		@Override
		protected void okPressed() {
			markerConfig = switch (Type.valueOf(cmbType.getText())) {
				case PROBLEM -> new ProblemMarkerConfig(txtTag.getText(), ProblemSeverity.valueOf(cmbLevel.getText()));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java

	@Override
	protected Control createContents(@Nullable final Composite ancestor) {
		final var parent = new Composite(ancestor, SWT.NONE);
		final var layout = new GridLayout();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/support/TestUtils.java`
#### Snippet
```java
		return new DisplayHelper() {
			@Override
			protected boolean condition() {
				return condition.getAsBoolean();
			}
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/LanguageConfigurationPreferencePage.java`
#### Snippet
```java

	@Override
	protected Control createContents(@Nullable final Composite ancestor) {
		final var parent = new Composite(ancestor, SWT.NONE);
		final var layout = new GridLayout();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/RegExp.java`
#### Snippet
```java
	}

	public static final RegExp noop() {
		return new RegExp(null);
	}
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMTokenizationSupport.java`
#### Snippet
```java

		// Create the result early and fill in the tokens later
		final var tmTokens = new ArrayList<TMToken>(tokens.length < 10 ? tokens.length : 10);
		String lastTokenType = null;
		for (final var token : tokens) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokens.java`
#### Snippet
```java
				final List<String> scopes = scopesList != null ? scopesList.getScopeNames() : Collections.emptyList();
				LOGGER.log(TRACE, "  token: |" + this._lineText
						.substring(this._lastTokenEndIndex >= 0 ? this._lastTokenEndIndex : 0, endIndex)
						.replace("\n", "\\n")
						+ '|');
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokens.java`
#### Snippet
```java
		if (LOGGER.isLoggable(TRACE)) {
			LOGGER.log(TRACE, "  token: |" + this._lineText
					.substring(this._lastTokenEndIndex >= 0 ? this._lastTokenEndIndex : 0, endIndex)
					.replace("\n", "\\n")
					+ '|');
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/oniguruma/OnigCaptureIndex.java`
#### Snippet
```java

	OnigCaptureIndex(final int start, final int end) {
		this.start = start >= 0 ? start : 0;
		this.end = end >= 0 ? end : 0;
	}
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/oniguruma/OnigCaptureIndex.java`
#### Snippet
```java
	OnigCaptureIndex(final int start, final int end) {
		this.start = start >= 0 ? start : 0;
		this.end = end >= 0 ? end : 0;
	}

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/oniguruma/OnigResult.java`
#### Snippet
```java
	int lengthAt(final int index) {
		final int bytes = region.getEnd(index) - region.getBeg(index);
		if (bytes > 0) {
			return bytes;
		}
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/oniguruma/OnigResult.java`
#### Snippet
```java
	int locationAt(final int index) {
		final int bytes = region.getBeg(index);
		if (bytes > 0) {
			return bytes;
		}
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
	public static int startIndexOfOffsetTouchingString(final String text, final int offset, final String string) {
		int start = offset - string.length();
		start = start < 0 ? 0 : start;
		int end = offset + string.length();
		end = end >= text.length() ? text.length() : end;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
		start = start < 0 ? 0 : start;
		int end = offset + string.length();
		end = end >= text.length() ? text.length() : end;
		try {
			final int indexInSubtext = text.substring(start, end).indexOf(string);
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
		}

		textSelectionStart = textSelectionStart > newCommentStart ? newCommentStart : textSelectionStart;
		textSelectionEnd = textSelectionEnd < newCommentEnd ? newCommentEnd : textSelectionEnd;
		return new TextSelection(document, textSelectionStart, textSelectionEnd - textSelectionStart);
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java

		textSelectionStart = textSelectionStart > newCommentStart ? newCommentStart : textSelectionStart;
		textSelectionEnd = textSelectionEnd < newCommentEnd ? newCommentEnd : textSelectionEnd;
		return new TextSelection(document, textSelectionStart, textSelectionEnd - textSelectionStart);
	}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/text/TMPresentationReconcilerTestGenerator.java`
#### Snippet
```java
		write("}");

		System.err.println(code.toString());
		document.removeDocumentListener(this);
		viewer.removeTextListener(this);
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`themeColor != null ? themeColor : null` can be simplified to 'themeColor'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ColorManager.java`
#### Snippet
```java
		}

		return themeColor != null ? themeColor : null;
	}

```

### SimplifiableConditionalExpression
`obj instanceof final RawToken other //
? Objects.equals(this.value, other.value) && Objects.equals(this.scopes, other.scopes)
: false` can be simplified to 'obj instanceof final RawToken other \&\& Objects.equals(this.value, other.value) \&\& Objects.equals(this.scopes, other.scopes)'
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/grammar/internal/RawToken.java`
#### Snippet
```java
	@Override
	public boolean equals(final Object obj) {
		return obj instanceof final RawToken other //
				? Objects.equals(this.value, other.value) && Objects.equals(this.scopes, other.scopes)
				: false;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/StateStack.java`
#### Snippet
```java
			@Nullable String endRule,
			List<AttributedScopeStack.Frame> nameScopesList,
			/** on top of nameScopesList */
			List<AttributedScopeStack.Frame> contentNameScopesList) {
	}
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMTokenizationSupport.java`
#### Snippet
```java

	/**
	 * https://github.com/microsoft/vscode/blob/70d250824ef66ef09f04c4084b804d5f353fb704/src/vs/editor/node/textMate/TMSyntax.ts#L251
	 */
	private String decodeTextMateToken(final DecodeMap decodeMap, final List<String> scopes) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMTokenizationSupport.java`
#### Snippet
```java

	/**
	 * https://github.com/microsoft/vscode/blob/70d250824ef66ef09f04c4084b804d5f353fb704/src/vs/editor/node/textMate/TMSyntax.ts#L129
	 */
	@NonNullByDefault({})
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java

	/**
	 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L89
	 */
	private boolean isIdentifier(final String token) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherBuilder.java`
#### Snippet
```java

		/**
		 * https://github.com/microsoft/vscode-textmate/blob/main/src/matcher.ts#L94
		 */
		static final Pattern TOKEN_PATTERN = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/FoldingRules.java`
#### Snippet
```java
	 * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
	 * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
	 * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
	 */
	public final boolean offSide;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java

	/**
	 * See JSON format at https://code.visualstudio.com/api/language-extensions/language-configuration-guide
	 *
	 * @return an instance of {@link LanguageConfiguration} loaded from the VSCode language-configuration.json file
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationRegistryManager.java`
#### Snippet
```java

	/**
	 * see https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
	 */
	private static final class InstanceHolder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java

	/**
	 * Test case for https://github.com/eclipse/wildwebdeveloper/issues/909
	 *
	 * @throws Exception
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/InlineLexer.java`
#### Snippet
```java
public class InlineLexer {

	private final Options options;
	private final InlineRules rules;
	private final IRenderer renderer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/Lexer.java`
#### Snippet
```java
	private final BlockRules rules;
	private final Tokens tokens;
	private final Options options;

	public Lexer(@Nullable final Options options) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/LanguageConfigurationInfoWidget.java`
#### Snippet
```java
	private CharacterPairsTableWidget surroundingPairsTable;

	private TabItem foldingTab;
	private Text offsideText;
	private Text markersStartText;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/LanguageConfigurationInfoWidget.java`
#### Snippet
```java
	private Text markersEndText;

	private TabItem wordPatternTab;
	private Text wordPatternText;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/LanguageConfigurationInfoWidget.java`
#### Snippet
```java
	private AutoClosingPairConditionalTableWidget autoClosingPairsTable;

	private TabItem autoCloseBeforeTab;
	private Text autoCloseBeforeText;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/LanguageConfigurationInfoWidget.java`
#### Snippet
```java
	private Text blockCommentEndText;

	private TabItem bracketsTab;
	private CharacterPairsTableWidget bracketsTable;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/LanguageConfigurationInfoWidget.java`
#### Snippet
```java
public class LanguageConfigurationInfoWidget extends Composite {

	private TabItem commentsTab;
	private Text lineCommentText;
	private Text blockCommentStartText;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/ThemeAssociationRegistry.java`
#### Snippet
```java
			userAssociation = dark ? registry.dark : registry.light;
		}
		if (userAssociation != null) {
			return userAssociation;
		}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/StringUtils.java`
#### Snippet
```java
		}

		if (RGBA.matcher(hex).matches()) {
			// #rgba
			return true;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `castNonNullUnsafe(...)` to `T` is redundant
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/NullSafetyHelper.java`
#### Snippet
```java
	@SuppressWarnings("unchecked")
	public static <T> T lazyNonNull() {
		return (T) castNonNullUnsafe(null);
	}

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	/**
	 *
	 * @param scopeName
	 * @param background
	 *
```

### JavadocDeclaration
`@param background` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 *
	 * @param scopeName
	 * @param background
	 *
	 * @return the theme that will fit best for the defined background color
```

### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * <code>scopeName</code>.
	 *
	 * @param scopeName
	 *
	 * @return the theme associations for the given TextMate grammar
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * Save the themes definitions.
	 *
	 * @throws BackingStoreException
	 */
	void save() throws BackingStoreException;
```

### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/IThemeManager.java`
#### Snippet
```java
	 * <code>scopeName</code> and default E4 Theme.
	 *
	 * @param scopeName
	 *
	 * @return the TextMate theme {@link ITheme} for the given TextMate grammar
```

### JavadocDeclaration
`@param themeChangeListener` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/ThemeManager.java`
#### Snippet
```java
	 * TextMate theme association with grammar.
	 *
	 * @param themeChangeListener
	 */
	public void addPreferenceChangeListener(final IPreferenceChangeListener themeChangeListener) {
```

### JavadocDeclaration
`@param themeChangeListener` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/ThemeManager.java`
#### Snippet
```java
	 * TextMate theme association with grammar.
	 *
	 * @param themeChangeListener
	 */
	public void removePreferenceChangeListener(final IPreferenceChangeListener themeChangeListener) {
```

### JavadocDeclaration
`@param id` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/Theme.java`
#### Snippet
```java
	 * Constructor for extension point.
	 *
	 * @param id
	 */
	public Theme(final String id, final String path, final String name, final boolean dark, final boolean isDefault) {
```

### JavadocDeclaration
`@param type` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/ITokenProvider.java`
#### Snippet
```java
	 * Returns the Eclipse {@link IToken} from the given type and {@link #DEFAULT_TOKEN} otherwise.
	 *
	 * @param type
	 *
	 * @return the Eclipse {@link IToken} from the given type and {@link #DEFAULT_TOKEN} otherwise.
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * {@link IEditorInput} and null otherwise.
	 *
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} by using
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * Returns the content types from the given {@link ITextFileBuffer}.
	 *
	 * @param buffer
	 * 
	 * @return the content types from the given {@link ITextFileBuffer}.
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content types from the given {@link ITextFileBuffer}.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * {@link ITextFileBufferManager} and null otherwise.
	 *
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} by using
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 *         {@link ITextFileBufferManager} and null otherwise.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocDeclaration
`@param contentTypeId` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * Find the content type with the given contentTypeId
	 *
	 * @param contentTypeId
	 * 
	 * @return matching content type or null
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * Returns the content of the given buffer.
	 *
	 * @param buffer
	 * 
	 * @return the content of the given buffer.
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content of the given buffer.
	 * 
	 * @throws CoreException
	 */
	private static InputStream getContents(final ITextFileBuffer buffer) throws CoreException {
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * Find the content types from the given {@link IDocument} and null otherwise.
	 *
	 * @param document
	 * 
	 * @return the content types from the given {@link IDocument} and null otherwise.
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * @return the content types from the given {@link IDocument} and null otherwise.
	 * 
	 * @throws CoreException
	 */
	@Nullable
```

### JavadocDeclaration
`@param document` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
	 * Returns the {@link IEditorInput} from the given document and null otherwise.
	 *
	 * @param document
	 * 
	 * @return the {@link IEditorInput} from the given document and null otherwise.
```

### JavadocDeclaration
`@param grammarRegistryManager` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/wizards/TextMateGrammarImportWizard.java`
#### Snippet
```java
	 * Set grammar registry to use to add the created grammar definitions.
	 *
	 * @param grammarRegistryManager
	 */
	public void setGrammarRegistryManager(final IGrammarRegistryManager grammarRegistryManager) {
```

### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/snippets/Snippet.java`
#### Snippet
```java
	 * Constructor for extension point.
	 *
	 * @param scopeName
	 */
	Snippet(final String scopeName, final String path, final String name) {
```

### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/snippets/ISnippetManager.java`
#### Snippet
```java
	 * Returns list of snippet for a given scope name and empty otherwise.
	 *
	 * @param scopeName
	 *
	 * @return list of snippet for a given scope name and empty otherwise.
```

### JavadocDeclaration
`@param parent` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/ThemePreferencePage.java`
#### Snippet
```java
	 * Create the theme list content.
	 *
	 * @param parent
	 */
	private void createThemesTableContent(final Composite parent) {
```

### JavadocDeclaration
Wrong tag `returns`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/ThemePreferencePage.java`
#### Snippet
```java

	/**
	 * @returns the grid data for the button.
	 */
	private static GridData getButtonGridData(final Button button) {
```

### JavadocDeclaration
`@param folder` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java
	 * Create "Injection" tab
	 *
	 * @param folder
	 */
	private void createInjectionTab(final TabFolder folder) {
```

### JavadocDeclaration
`@param grammarRegistryManager` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java
	 * Set the grammar registry manager.
	 *
	 * @param grammarRegistryManager
	 */
	void setGrammarRegistryManager(final IGrammarRegistryManager grammarRegistryManager) {
```

### JavadocDeclaration
`@param themeManager` tag description is missing
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java
	 * Set the theme manager.
	 *
	 * @param themeManager
	 */
	void setThemeManager(final IThemeManager themeManager) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMModel.java`
#### Snippet
```java
		 * revalidates tokens of lines starting at {@link #firstLineToRevalidate} until all lines are processed or new {@link Edit} arrive.
		 *
		 * @throws InterruptedException
		 */
		private void revalidateTokens() throws InterruptedException {
```

### JavadocDeclaration
`@param name` tag description is missing
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/css/sac/ISACParserFactory.java`
#### Snippet
```java
	 * Return instance of SAC Parser registered into the factory with name <code>name</code>.
	 *
	 * @param name
	 *
	 * @see SACConstants
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/utils/MoreCollections.java`
#### Snippet
```java
	 * @param index the element to get. negative index counts from end of list, e.g. -1 = last element.
	 *
	 * @throws IndexOutOfBoundsException
	 */
	public static <T> T getElementAt(final List<T> list, final int index) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/ITMResource.java`
#### Snippet
```java
	 * @return the stream of the TextMate resource.
	 * 
	 * @throws IOException
	 */
	InputStream getInputStream() throws IOException;
```

### JavadocDeclaration
`@param scopeName` tag description is missing
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/GrammarDefinition.java`
#### Snippet
```java
	 * Constructor for extension point.
	 *
	 * @param scopeName
	 */
	public GrammarDefinition(final String scopeName, final String path) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/IGrammarRegistryManager.java`
#### Snippet
```java
	 * Save the grammar definitions.
	 *
	 * @throws BackingStoreException
	 */
	void save() throws BackingStoreException;
```

### JavadocDeclaration
`@param path` tag description is missing
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/TMResource.java`
#### Snippet
```java
	 * Constructor for extension point.
	 *
	 * @param path
	 */
	public TMResource(final String path) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `org.eclipse.tm4e.languageconfiguration.tests/src/main/java/org/eclipse/tm4e/languageconfiguration/tests/TestComment.java`
#### Snippet
```java
	 * Test case for https://github.com/eclipse/wildwebdeveloper/issues/909
	 *
	 * @throws Exception
	 */
	@Test
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `_isFrozen` may be 'final'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/ColorMap.java`
#### Snippet
```java
public final class ColorMap {

	private boolean _isFrozen;
	private int _lastColorId = -1; // -1 and not 0 as in upstream project on purpose
	private final List<String> _id2color = new ArrayList<>();
```

### FieldMayBeFinal
Field `parsers` may be 'final'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/theme/css/sac/SACParserFactory.java`
#### Snippet
```java
public final class SACParserFactory extends AbstractSACParserFactory {

	private static Map<String, @Nullable String> parsers = new HashMap<>();

	static {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `lines` are queried, but never updated
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/grammar/internal/RawTestImpl.java`
#### Snippet
```java
	private String grammarScopeName;
	private List<String> grammarInjections;
	private List<RawTestLine> lines;
	private transient File testLocation;

```

### MismatchedCollectionQueryUpdate
Contents of collection `removed` are queried, but never updated
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/WorkingCopyLanguageConfigurationRegistryManager.java`
#### Snippet
```java

	@Nullable
	private List<ILanguageConfigurationDefinition> removed;

	public WorkingCopyLanguageConfigurationRegistryManager(final ILanguageConfigurationRegistryManager manager) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2424` can be replaced with '␤'
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/Lexer.java`
#### Snippet
```java

	private Tokens lex(String src) {
		src = src.replaceAll("\r\n|\r", "\n").replaceAll("\t", "    ").replaceAll("\u00a0", " ").replaceAll("\u2424",
				"\n");
		return this.token(src, true);
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/InlineLexer.java`
#### Snippet
```java
				src = src.substring(cap.group(0).length());
				this.renderer.text(htmlEscape(this.smartypants(cap.group(0))));
				continue;
			}
		}
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/Lexer.java`
#### Snippet
```java
				final String text = cap.group(1).charAt(cap.group(1).length() - 1) == '\n' ? cap.group(1) : cap.group(1);
				this.tokens.add(new Token(TokenType.paragraph, text));
				continue;
			}
		}
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(_languageId << EncodedTokenDataConsts.LANGUAGEID_OFFSET | _tokenType << EncodedTokenDataConsts....` can be replaced with '(_languageId \<\< EncodedTokenDataConsts.LANGUAGEID_OFFSET \| _tokenType \<\< EncodedTokenDataConsts.TOKEN_TYPE_OFFSET \| _containsBalancedBracketsBit \<\< EncodedTokenDataConsts.BALANCED_BRACKETS_OFFSET \| _fontStyle \<\< EncodedTokenDataConsts.FONT_STYLE_OFFSET \| _foreground \<\< EncodedTokenDataConsts.FOREGROUND_OFFSET \| _background \<\< EncodedTokenDataConsts.BACKGROUND_OFFSET)'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/tokenattrs/EncodedTokenAttributes.java`
#### Snippet
```java
		final var _background = background == 0 ? getBackground(metadata) : background;

		return (_languageId << EncodedTokenDataConsts.LANGUAGEID_OFFSET
				| _tokenType << EncodedTokenDataConsts.TOKEN_TYPE_OFFSET
				| _containsBalancedBracketsBit << EncodedTokenDataConsts.BALANCED_BRACKETS_OFFSET
				| _fontStyle << EncodedTokenDataConsts.FONT_STYLE_OFFSET
				| _foreground << EncodedTokenDataConsts.FOREGROUND_OFFSET
				| _background << EncodedTokenDataConsts.BACKGROUND_OFFSET) >>> 0;
	}

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `data` is redundant
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/ThemePreferencePage.java`
#### Snippet
```java
	 */
	private static GridData getButtonGridData(final Button button) {
		final var data = new GridData(GridData.FILL_HORIZONTAL);
		// TODO replace SWTUtil
		// data.widthHint= SWTUtil.getButtonWidthHint(button);
```

### UnnecessaryLocalVariable
Local variable `len` is redundant
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/rule/RegExpSource.java`
#### Snippet
```java
		final var A1_G1_result = new StringBuilder(sourceLen);

		for (int pos = 0, len = sourceLen; pos < len; pos++) {
			final char ch = source.charAt(pos);
			A0_G0_result.append(ch);
```

### UnnecessaryLocalVariable
Local variable `normal` is redundant
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/InlineRules.java`
#### Snippet
```java

	private static InlineRules normal() {
		final InlineRules normal = inline();
		return normal;
	}
```

### UnnecessaryLocalVariable
Local variable `tables` is redundant
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/BlockRules.java`
#### Snippet
```java

	private static BlockRules tables() {
		final BlockRules tables = gfm();
		return tables;
	}
```

### UnnecessaryLocalVariable
Local variable `typeText` is redundant
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
							// Nothing special
							final String increasedIndent = normalizeIndentation(enterAction.indentation + enterAction.appendText, editor);
							final String typeText = delim + increasedIndent;

							command.text = typeText;
```

### UnnecessaryLocalVariable
Local variable `typeText` is redundant
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
							// Indent once
							final String increasedIndent = normalizeIndentation(enterAction.indentation + enterAction.appendText, editor);
							final String typeText = delim + increasedIndent;

							command.text = typeText;
```

### UnnecessaryLocalVariable
Local variable `typeText` is redundant
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
							final String normalIndent = normalizeIndentation(enterAction.indentation, editor);
							final String increasedIndent = normalizeIndentation(enterAction.indentation + enterAction.appendText, editor);
							final String typeText = delim + increasedIndent + delim + normalIndent;

							command.text = typeText;
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
		try {
			// find start of line
			final int p = offset;
			final IRegion info = d.getLineInformationOfOffset(p);
			final int start = info.getOffset();
```

## RuleId[id=ConditionalExpressionWithIdenticalBranches]
### ConditionalExpressionWithIdenticalBranches
Conditional expression `cap.group(1).charAt(cap.group(1).length() - 1) == '\n' ? cap.group(1) : cap.group(1)` with identical branches
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/Lexer.java`
#### Snippet
```java
			if (top && (cap = this.rules.paragraph.exec(src)) != null) {
				src = src.substring(cap.group(0).length());
				final String text = cap.group(1).charAt(cap.group(1).length() - 1) == '\n' ? cap.group(1) : cap.group(1);
				this.tokens.add(new Token(TokenType.paragraph, text));
				continue;
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/TMResource.java`
#### Snippet
```java
		return pluginId != null
				? new URL(PLATFORM_PLUGIN + pluginId + "/" + path).openStream()
				: new FileInputStream(new File(path));
	}

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ContentTypeHelper.java`
#### Snippet
```java
							.findContentTypesFor(input, fileName);
					if (contentTypesForInput != null) {
						contentTypes.addAll(Arrays.asList(contentTypesForInput));
						return new ContentTypeInfo(fileName, contentTypes.toArray(IContentType[]::new));
					}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/support/StyleRangesCollector.java`
#### Snippet
```java

	static String toString(final StyleRange[] ranges) {
		return Arrays.asList(ranges).toString();
	}

```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `contentType`, unclear if a varargs or non-varargs call is desired
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
					SelectLanguageConfigurationWizardPage_contentTypeError_invalid);
		}
		if (registryManager.getLanguageConfigurationFor(contentType) != null) {
			return new Status(IStatus.WARNING, LanguageConfigurationPlugin.PLUGIN_ID,
					SelectLanguageConfigurationWizardPage_contentTypeWarning_duplicate);
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`spacesCnt / tabSize`: integer division in floating-point context
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
		final var result = new StringBuilder();
		if (!insertSpaces) {
			final long tabsCnt = Math.round(Math.floor(spacesCnt / tabSize));
			spacesCnt = spacesCnt % tabSize;
			for (int i = 0; i < tabsCnt; i++) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `contentType` initializer `null` is redundant
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ContentTypeLabelProvider.java`
#### Snippet
```java
		return switch (columnIndex) {
			case 0 -> {
				IContentType contentType = null;
				if (element instanceof final IContentType contentTypeElement) {
					contentType = contentTypeElement;
```

### UnusedAssignment
Variable `tokens` initializer `null` is redundant
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/Colorizer.java`
#### Snippet
```java
			TextAttribute lastAttribute = getTokenTextAttribute(lastToken);

			List<TMToken> tokens = null;
			for (int lineIndex = fromLineIndex; lineIndex <= toLineIndex; lineIndex++) {
				tokens = tmModel.getLineTokens(lineIndex);
```

### UnusedAssignment
The value `token` assigned to `lastToken` is never used
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/Colorizer.java`
#### Snippet
```java
						}
						firstToken = false;
						lastToken = token;
						lastAttribute = attribute;
						lastStart = tokenStartIndex + startLineOffset;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/PreferenceHelper.java`
#### Snippet
```java
		final var prefs = InstanceScope.INSTANCE.getNode(TMUIPlugin.PLUGIN_ID);
		final var json = prefs.get(PreferenceConstants.TASK_TAGS, null);
		Set<MarkerConfig> result = null;
		try {
			result = loadMarkerConfigs(json);
```

### UnusedAssignment
Variable `selectedAssociation` initializer `null` is redundant
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/GrammarPreferencePage.java`
#### Snippet
```java
			@Nullable
			private IThemeAssociation fillThemeTab(final IGrammarDefinition definition) {
				IThemeAssociation selectedAssociation = null;
				final IStructuredSelection oldSelection = themeAssociationsWidget.getSelection();
				// Load the theme associations for the given grammar
```

### UnusedAssignment
Variable `currLineIndex` initializer `-1` is redundant
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/model/TMModel.java`
#### Snippet
```java

			final int linesCount = lines.size();
			int currLineIndex = -1;

			// iterate over all lines from startLineIndex to end of file to check if (re)tokenization is required
```

### UnusedAssignment
Variable `cap` initializer `null` is redundant
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/InlineLexer.java`
#### Snippet
```java

	public void output(String src) {
		Matcher cap = null;
		while (!Strings.isNullOrEmpty(src)) {

```

### UnusedAssignment
Variable `afterEnterText` initializer `null` is redundant
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationRegistryManager.java`
#### Snippet
```java
			// String scopeLineText = DocumentHelper.getLineTextOfOffset(document, offset, false);
			final String beforeEnterText = document.get(lineInfo.getOffset(), offset - lineInfo.getOffset());
			String afterEnterText = null;

			// selection support
```

### UnusedAssignment
The value `lines.stream().filter(l -> l >= selectionStartLine && l <= selectionEndLine && !TextUtils.isBlankLine(document, l))
.map(l -> {
lineRange[0] = lineRange[0] == -1 || lineRange[0] > l ? l : lineRange[0];
lineRange[1] = lineRange[1] < l ? l : lineRange[1];
return l;
}).collect(Collectors.toSet())` assigned to `lines` is never used
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
		Set<Integer> lines = computeLines(new TextSelection(textSelectionStart, textSelectionEnd - textSelectionStart),
				document);
		lines = lines.stream().filter(l -> l >= selectionStartLine && l <= selectionEndLine && !TextUtils.isBlankLine(document, l))
				.map(l -> {
					lineRange[0] = lineRange[0] == -1 || lineRange[0] > l ? l : lineRange[0];
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/AbstractLanguageConfigurationRegistryManager.java`
#### Snippet
```java
	public ILanguageConfigurationDefinition[] getDefinitions() {
		final var definitions = new HashSet<ILanguageConfigurationDefinition>();
		userDefinitions.values().forEach(definitions::add);
		pluginDefinitions.values().forEach(definitions::add);
		return definitions.toArray(ILanguageConfigurationDefinition[]::new);
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/AbstractLanguageConfigurationRegistryManager.java`
#### Snippet
```java
		final var definitions = new HashSet<ILanguageConfigurationDefinition>();
		userDefinitions.values().forEach(definitions::add);
		pluginDefinitions.values().forEach(definitions::add);
		return definitions.toArray(ILanguageConfigurationDefinition[]::new);
	}
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationRegistryManager.java`
#### Snippet
```java
		// "${workspace_loc}/metadata/.plugins/org.eclipse.core.runtime/.settings/org.eclipse.tm4e.languageconfiguration.prefs"
		final var definitions = new ArrayList<ILanguageConfigurationDefinition>();
		userDefinitions.values().forEach(definitions::add);
		pluginDefinitions.values().forEach(def -> {
			if (!(def.isBracketAutoClosingEnabled() && def.isMatchingPairsEnabled() && def.isOnEnterEnabled())) {
```

## RuleId[id=MathRoundingWithIntArgument]
### MathRoundingWithIntArgument
`floor()` with argument of type 'int'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/utils/TextUtils.java`
#### Snippet
```java
		final var result = new StringBuilder();
		if (!insertSpaces) {
			final long tabsCnt = Math.round(Math.floor(spacesCnt / tabSize));
			spacesCnt = spacesCnt % tabSize;
			for (int i = 0; i < tabsCnt; i++) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `element instanceof final String contentTypeId` is always `false`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ContentTypeLabelProvider.java`
#### Snippet
```java
				if (element instanceof final IContentType contentTypeElement) {
					contentType = contentTypeElement;
				} else if (element instanceof final String contentTypeId) {
					contentType = Platform.getContentTypeManager().getContentType(contentTypeId);
					if (contentType == null) {
```

### ConstantValue
Value `config` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/themes/ThemeManager.java`
#### Snippet
```java
		final var config = Platform.getExtensionRegistry().getConfigurationElementsFor(TMUIPlugin.PLUGIN_ID,
				EXTENSION_THEMES);
		for (final var configElement : config) {
			final String name = configElement.getName();
			switch (name) {
```

### ConstantValue
Condition `model != null` is always `false`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/TMModelManager.java`
#### Snippet
```java
	public void disconnect(final IDocument document) {
		final var model = castNullable(models.remove(document));
		if (model != null) {
			model.dispose();
		}
```

### ConstantValue
Condition `display != null` is always `false`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/UI.java`
#### Snippet
```java

		final var display = Display.getCurrent();
		if (display != null)
			return display;

```

### ConstantValue
Value `offsetAfterAddedText` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
		final var doc = event.getDocument();
		final var offsetAfterAddedText = event.getOffset() + event.getText().length();
		final var isAppendToDocumentEnd = offsetAfterAddedText == doc.getLength();
		if (isAppendToDocumentEnd) {
			return doc.getNumberOfLines() - 1;
```

### ConstantValue
Value `offsetAfterAddedText` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/model/DocumentHelper.java`
#### Snippet
```java
			return doc.getNumberOfLines() - 1;
		}
		return doc.getLineOfOffset(offsetAfterAddedText);
	}

```

### ConstantValue
Condition `style == null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/themes/css/CSSTokenProvider.java`
#### Snippet
```java
	private Color getColor(final boolean isForeground, final String... styles) {
		final var style = parser.getBestStyle(styles);
		if (style == null)
			return null;

```

### ConstantValue
Value `docLen` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/DocumentInputStream.java`
#### Snippet
```java

		final var docLen = doc.getLength();
		if (pos >= docLen)
			return -1;

```

### ConstantValue
Value `docLen` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/DocumentInputStream.java`
#### Snippet
```java
			bytesRead = 1;
			while (bytesRead < len) {
				if (pos >= docLen) {
					break;
				}
```

### ConstantValue
Condition `buffer == null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/ResourceUtils.java`
#### Snippet
```java

		final var buffer = ITextFileBufferManager.DEFAULT.getTextFileBuffer(doc);
		if (buffer == null)
			return null;
		final var loc = buffer.getLocation();
```

### ConstantValue
Value `viewer` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
		}

		return super.compare(viewer, e1, e2);
	}

```

### ConstantValue
Value `nextToken` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/Colorizer.java`
#### Snippet
```java
							final IToken token = theme == null ? ITokenProvider.DEFAULT_TOKEN : theme.getToken(currentToken.type);
							lastAttribute = getTokenTextAttribute(token);
							length += getTokenLength(tokenStartIndex, nextToken, lineIndex, doc);
							firstToken = false;
							// ignore it
```

### ConstantValue
Condition `presentationReconcilerField != null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
		try {
			final Field presentationReconcilerField = SourceViewer.class.getDeclaredField("fPresentationReconciler");
			if (presentationReconcilerField != null) {
				presentationReconcilerField.trySetAccessible();
				return presentationReconcilerField.get(textViewer) instanceof final TMPresentationReconciler tmPresentationReconciler
```

### ConstantValue
Condition `text == null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/text/TMPresentationReconciler.java`
#### Snippet
```java
		IRegion getRegionOfTextEvent(final TextEvent event) {
			final var text = event.getText();
			final int length = text == null ? 0 : text.length();
			final var viewer = castNonNull(TMPresentationReconciler.this.viewer);
			return viewer instanceof final ITextViewerExtension5 viewerExt5
```

### ConstantValue
Value `marker` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/MarkerUtils.java`
#### Snippet
```java
		final var markersByLineNumber = new HashMap<Integer, List<IMarker>>();
		for (final var marker : res.findMarkers(TEXTMARKER_TYPE, true, 0)) {
			final var lineNumberObj = getLineNumber(marker);
			if (lineNumberObj == null) {
				marker.delete(); // this marker is missing line information, should never happen
```

### ConstantValue
Value `numberOfLines` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/MarkerUtils.java`
#### Snippet
```java
				continue; // this marker needs no update
			}
			if (lineNumber > numberOfLines) {
				marker.delete(); // this marker is for a non-existing line
				continue;
```

### ConstantValue
Value `numberOfLines` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/utils/MarkerUtils.java`
#### Snippet
```java

		// iterate over all lines
		for (int lineNumber = startLineNumber; lineNumber <= numberOfLines; lineNumber++) {
			final var lineNumberObj = Integer.valueOf(lineNumber);
			final var lineIndex = lineNumber - 1;
```

### ConstantValue
Condition `content == null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/snippets/Snippet.java`
#### Snippet
```java
	public String getContent() {
		final var content = getResourceContent();
		return content == null ? "" : content;
	}

```

### ConstantValue
Value `json` is always 'null'
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/PreferenceHelper.java`
#### Snippet
```java
		Set<MarkerConfig> result = null;
		try {
			result = loadMarkerConfigs(json);
		} catch (JsonSyntaxException ex) {
			TMUIPlugin.logError(ex);
```

### ConstantValue
Condition `btn == null` is always `true`
in `org.eclipse.tm4e.ui/src/main/java/org/eclipse/tm4e/ui/internal/preferences/TaskTagsPreferencePage.java`
#### Snippet
```java
		void validateInput(@SuppressWarnings("unused") final @Nullable Event e) {
			var btn = getButton(IDialogConstants.OK_ID);
			if (btn == null)
				return;
			btn.setEnabled(!txtTag.getText().isBlank() && cmbType.getSelectionIndex() > -1 && cmbLevel.getSelectionIndex() > -1);
```

### ConstantValue
Condition `a == null && b == null` is always `false`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/AttributedScopeStack.java`
#### Snippet
```java
			}

			if (a == null && b == null) {
				// End of list reached for both
				return true;
```

### ConstantValue
Condition `b == null` is always `false` when reached
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/AttributedScopeStack.java`
#### Snippet
```java
			}

			if (a == null && b == null) {
				// End of list reached for both
				return true;
```

### ConstantValue
Condition `a == null && b == null` is always `false`
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/StateStack.java`
#### Snippet
```java
			}

			if (a == null && b == null) {
				// End of list reached for both
				return true;
```

### ConstantValue
Condition `b == null` is always `false` when reached
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/StateStack.java`
#### Snippet
```java
			}

			if (a == null && b == null) {
				// End of list reached for both
				return true;
```

### ConstantValue
Value `containsBalancedBrackets` is always 'true'
in `org.eclipse.tm4e.core/src/main/java/org/eclipse/tm4e/core/internal/grammar/LineTokens.java`
#### Snippet
```java
						0,
						OptionalStandardTokenType.NotSet,
						containsBalancedBrackets,
						FontStyle.NotSet,
						0,
```

### ConstantValue
Value `endState` is always 'null'
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/TMHTMLRenderer.java`
#### Snippet
```java
		}

		return endState;
	}

```

### ConstantValue
Condition `pattern != null` is always `true`
in `org.eclipse.tm4e.markdown/src/main/java/org/eclipse/tm4e/markdown/marked/RegExp.java`
#### Snippet
```java
		}

		assert pattern != null;
		final Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
```

### ConstantValue
Condition `json != null` is always `false`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/internal/GrammarRegistryManager.java`
#### Snippet
```java
		final var prefs = InstanceScope.INSTANCE.getNode(TMEclipseRegistryPlugin.PLUGIN_ID);
		final var json = prefs.get(PreferenceConstants.GRAMMARS, null);
		if (json != null) {
			final IGrammarDefinition[] definitions = PreferenceHelper.loadGrammars(json);
			for (final IGrammarDefinition definition : definitions) {
```

### ConstantValue
Condition `grammar != null` is always `false`
in `org.eclipse.tm4e.registry/src/main/java/org/eclipse/tm4e/registry/internal/AbstractGrammarRegistryManager.java`
#### Snippet
```java
		}
		final var grammar = registry.grammarForScopeName(scopeName);
		if (grammar != null) {
			return grammar;
		}
```

### ConstantValue
Value `genericEditorDescr` is always 'null'
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/support/TestUtils.java`
#### Snippet
```java
		final var genericEditorDescr = PlatformUI.getWorkbench().getEditorRegistry()
				.findEditor("org.eclipse.ui.genericeditor.GenericEditor");
		assertNotNull(genericEditorDescr);
		return genericEditorDescr;
	}
```

### ConstantValue
Value `genericEditorDescr` is always 'null'
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/support/TestUtils.java`
#### Snippet
```java
				.findEditor("org.eclipse.ui.genericeditor.GenericEditor");
		assertNotNull(genericEditorDescr);
		return genericEditorDescr;
	}

```

### ConstantValue
Value `listType` is always 'null'
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/matcher/MatcherTest.java`
#### Snippet
```java
		final var listType = new TypeToken<List<MatcherTestImpl>>() {
		}.getType();
		final List<MatcherTestImpl> tests = new GsonBuilder().create().fromJson(jsonTests, listType);
		final var dynamicTests = new ArrayList<DynamicTest>();
		for (int i = 0; i < tests.size(); i++) {
```

### ConstantValue
Value `actualTokens` is always 'null'
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/grammar/internal/RawTestImpl.java`
#### Snippet
```java
		}

		deepEqual(actualTokens, testCase.tokens, "Tokenizing line '" + line + "'");

		return actual.getRuleStack();
```

### ConstantValue
Value `grammarSource` is always 'null'
in `org.eclipse.tm4e.ui.tests/src/main/java/org/eclipse/tm4e/ui/tests/TMDocumentModelTest.java`
#### Snippet
```java
				? IGrammarSource.fromResource(TMDocumentModelTest.class, grammarPath)
				: IGrammarSource.fromFile(Path.of("." + grammarPath));
		grammar = new Registry().addGrammar(grammarSource);
	}

```

### ConstantValue
Condition `result == null` is always `true`
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeMatchingTest.java`
#### Snippet
```java
		final var map = theme.getColorMap();
		final var result = theme.match(ScopeStack.from(path));
		if (result == null) {
			return null;
		}
```

### ConstantValue
Value `path` is always 'null'
in `org.eclipse.tm4e.core.tests/src/main/java/org/eclipse/tm4e/core/internal/theme/ThemeMatchingTest.java`
#### Snippet
```java
				"meta.structure.dictionary.value.json",
				"string.quoted.double.json");
		final var result = theme.match(path);
		assertEquals(theme.getColorMap().get(result.foregroundId), "#FF410D");
	}
```

### ConstantValue
Condition `editor == null` is always `true`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/HasLanguageConfigurationPropertyTester.java`
#### Snippet
```java

		final var editor = castNullable(Adapters.adapt(receiver, ITextEditor.class));
		if (editor == null) {
			return false;
		}
```

### ConstantValue
Value `ch` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
		try {
			final var ch = document.getChar(offset);
			if (!Character.isWhitespace(ch)) {
				final var registry = LanguageConfigurationRegistryManager.getInstance();
				if (registry.getAutoCloseBefore(contentType).indexOf(ch) < 0)
```

### ConstantValue
Value `ch` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
			if (!Character.isWhitespace(ch)) {
				final var registry = LanguageConfigurationRegistryManager.getInstance();
				if (registry.getAutoCloseBefore(contentType).indexOf(ch) < 0)
					return false;
			}
```

### ConstantValue
Value `lineIndex` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
			try {
				final var lineIndex = document.getLineOfOffset(offset);
				final var tokens = docModel.getLineTokens(lineIndex);
				if (tokens != null) {
					final var lineCharOffset = offset - document.getLineOffset(lineIndex) - 1;
```

### ConstantValue
Condition `tokens != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/LanguageConfigurationAutoEditStrategy.java`
#### Snippet
```java
				final var lineIndex = document.getLineOfOffset(offset);
				final var tokens = docModel.getLineTokens(lineIndex);
				if (tokens != null) {
					final var lineCharOffset = offset - document.getLineOffset(lineIndex) - 1;
					TMToken tokenAtOffset = null;
```

### ConstantValue
Condition `actionElem != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java

					final var actionElem = jsonObj.get("action"); //$NON-NLS-1$
					if (actionElem != null && actionElem.isJsonObject()) {
						final var actionJsonObj = actionElem.getAsJsonObject();
						final var indentActionString = getAsString(actionJsonObj.get("indent")); //$NON-NLS-1$
```

### ConstantValue
Condition `blockCommentElem != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java
					final var blockCommentElem = jsonObj.get("blockComment"); //$NON-NLS-1$
					CharacterPair blockComment = null;
					if (blockCommentElem != null && blockCommentElem.isJsonArray()) {
						final var blockCommentArray = blockCommentElem.getAsJsonArray();
						if (blockCommentArray.size() == 2) {
```

### ConstantValue
Condition `blockComment == null` is always `true` when reached
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java
					}

					return lineComment == null && blockComment == null
							? null
							: new CommentRule(lineComment, blockComment);
```

### ConstantValue
Value `blockComment` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java
					return lineComment == null && blockComment == null
							? null
							: new CommentRule(lineComment, blockComment);
				})

```

### ConstantValue
Condition `notInElem != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java
						close = getAsString(autoClosePair.get("close")); //$NON-NLS-1$
						final var notInElem = autoClosePair.get("notIn"); //$NON-NLS-1$
						if (notInElem != null && notInElem.isJsonArray()) {
							notInElem.getAsJsonArray().forEach(element -> {
								final var string = getAsString(element);
```

### ConstantValue
Condition `markersElem != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/model/LanguageConfiguration.java`
#### Snippet
```java
					final var jsonObj = json.getAsJsonObject();
					final var markersElem = jsonObj.get("markers"); //$NON-NLS-1$
					if (markersElem != null && markersElem.isJsonObject()) {
						final var markersObj = markersElem.getAsJsonObject();
						final var startMarker = getAsPattern(markersObj.get("start")); //$NON-NLS-1$
```

### ConstantValue
Value `viewer` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/widgets/ColumnViewerComparator.java`
#### Snippet
```java
			return sortResult * fSortOrder;
		}
		return super.compare(viewer, e1, e2);
	}
}
```

### ConstantValue
Value `in` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationDefinition.java`
#### Snippet
```java
	public LanguageConfiguration getLanguageConfiguration() {
		try (var in = getInputStream()) {
			return LanguageConfiguration.load(new InputStreamReader(in, Charset.defaultCharset()));
		} catch (final IOException ex) {
			LanguageConfigurationPlugin.logError(ex);
```

### ConstantValue
Value `contentTypeId` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationDefinition.java`
#### Snippet
```java
		super(ce);
		final var contentTypeId = ce.getAttribute(XMLConstants.CONTENT_TYPE_ID_ATTR);
		final var contentType = ContentTypeHelper.getContentTypeById(contentTypeId);
		if (contentType == null)
			throw new CoreException(
```

### ConstantValue
Condition `contentType == null` is always `true`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationDefinition.java`
#### Snippet
```java
		final var contentTypeId = ce.getAttribute(XMLConstants.CONTENT_TYPE_ID_ATTR);
		final var contentType = ContentTypeHelper.getContentTypeById(contentTypeId);
		if (contentType == null)
			throw new CoreException(
					new Status(IStatus.ERROR, LanguageConfiguration.class,
```

### ConstantValue
Value `contentTypeId` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationDefinition.java`
#### Snippet
```java
			throw new CoreException(
					new Status(IStatus.ERROR, LanguageConfiguration.class,
							"Cannot load language configuration with unknown content type ID " + contentTypeId));
		this.contentType = contentType;
	}
```

### ConstantValue
Value `contentTypeId` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/PreferenceHelper.java`
#### Snippet
```java
						final JsonElement pluginId = object.get("pluginId");
						final var contentTypeId = object.get("contentTypeId").getAsString();
						final var contentType = ContentTypeHelper.getContentTypeById(contentTypeId);
						if (contentType == null) {
							LanguageConfigurationPlugin.logError(
```

### ConstantValue
Condition `contentType == null` is always `true`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/PreferenceHelper.java`
#### Snippet
```java
						final var contentTypeId = object.get("contentTypeId").getAsString();
						final var contentType = ContentTypeHelper.getContentTypeById(contentTypeId);
						if (contentType == null) {
							LanguageConfigurationPlugin.logError(
									"Cannot load language configuration with unknown content type ID " + contentTypeId,
```

### ConstantValue
Value `contentTypeId` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/PreferenceHelper.java`
#### Snippet
```java
						if (contentType == null) {
							LanguageConfigurationPlugin.logError(
									"Cannot load language configuration with unknown content type ID " + contentTypeId,
									null);
							return null;
```

### ConstantValue
Value `message` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		switch (status.getSeverity()) {
			case IStatus.OK:
				page.setMessage(message, IMessageProvider.NONE);
				page.setErrorMessage(null);
				break;
```

### ConstantValue
Value `message` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
				break;
			case IStatus.WARNING:
				page.setMessage(message, IMessageProvider.WARNING);
				page.setErrorMessage(null);
				break;
```

### ConstantValue
Value `message` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
				break;
			case IStatus.INFO:
				page.setMessage(message, IMessageProvider.INFORMATION);
				page.setErrorMessage(null);
				break;
```

### ConstantValue
Condition `message != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
			default:
				page.setMessage(null);
				page.setErrorMessage(message != null && message.isEmpty() ? null : message);
				break;
		}
```

### ConstantValue
Value `message` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
			default:
				page.setMessage(null);
				page.setErrorMessage(message != null && message.isEmpty() ? null : message);
				break;
		}
```

### ConstantValue
Value `contentType` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
			final var baseType = (IContentType) parentElement;
			for (final var contentType : manager.getAllContentTypes()) {
				if (Objects.equals(baseType, contentType)) {
					elements.add(contentType);
				}
```

### ConstantValue
Value `contentType` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
			for (final var contentType : manager.getAllContentTypes()) {
				if (Objects.equals(baseType, contentType)) {
					elements.add(contentType);
				}
			}
```

### ConstantValue
Condition `contentType != null` is always `false`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		assert contentTypeText != null;
		final var contentType = ContentTypeHelper.getContentTypeById(contentTypeText.getText());
		assert contentType != null;
		return new LanguageConfigurationDefinition(contentType, path.toString());
	}
```

### ConstantValue
Condition `contentType == null` is always `true`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/wizards/SelectLanguageConfigurationWizardPage.java`
#### Snippet
```java
		}
		final var contentType = ContentTypeHelper.getContentTypeById(contentTypeText.getText());
		if (contentType == null) {
			return new Status(IStatus.ERROR, LanguageConfigurationPlugin.PLUGIN_ID,
					SelectLanguageConfigurationWizardPage_contentTypeError_invalid);
```

### ConstantValue
Value `config` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/registry/LanguageConfigurationRegistryManager.java`
#### Snippet
```java
		final var config = Platform.getExtensionRegistry().getConfigurationElementsFor(
				LanguageConfigurationPlugin.PLUGIN_ID, EXTENSION_LANGUAGE_CONFIGURATIONS);
		for (final var configElem : config) {
			final String name = configElem.getName();
			if (LANGUAGE_CONFIGURATION_ELT.equals(name)) {
```

### ConstantValue
Value `part` is always 'null'
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/ToggleLineCommentHandler.java`
#### Snippet
```java
		}
		final var part = HandlerUtil.getActiveEditor(event);
		final var editor = adapt(part, ITextEditor.class);
		if (editor == null) {
			return null;
```

### ConstantValue
Condition `definitionRemoveButton != null` is always `true`
in `org.eclipse.tm4e.languageconfiguration/src/main/java/org/eclipse/tm4e/languageconfiguration/internal/preferences/LanguageConfigurationPreferencePage.java`
#### Snippet
```java
				final var definition = (ILanguageConfigurationDefinition) selection.getFirstElement();
				// Update button
				assert definitionRemoveButton != null;
				definitionRemoveButton.setEnabled(definition.getPluginId() == null);
				selectDefinition(definition);
```

