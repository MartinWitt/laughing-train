# xtext-xtend 
 
# Bad smells
I found 1349 bad smells with 88 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 669 | false |
| ReturnNull | 163 | false |
| UnnecessaryLocalVariable | 64 | true |
| RedundantFieldInitialization | 54 | false |
| ConstantValue | 49 | false |
| BoundedWildcard | 47 | false |
| AssignmentToMethodParameter | 46 | false |
| UnstableApiUsage | 42 | false |
| PointlessArithmeticExpression | 28 | false |
| Convert2Lambda | 23 | false |
| StaticPseudoFunctionalStyleMethod | 22 | false |
| UNUSED_IMPORT | 20 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| StringBufferReplaceableByString | 13 | false |
| UnusedAssignment | 8 | false |
| MethodOverloadsParentMethod | 8 | false |
| EmptyMethod | 6 | false |
| UnstableTypeUsedInSignature | 6 | false |
| MissortedModifiers | 5 | false |
| DataFlowIssue | 5 | false |
| Anonymous2MethodRef | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| CommentedOutCode | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UnnecessaryCallToStringValueOf | 3 | false |
| UnnecessaryModifier | 2 | true |
| IgnoreResultOfCall | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| SystemOutErr | 2 | false |
| ThrowableNotThrown | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WhileCanBeForeach | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DuplicateThrows | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| Convert2MethodRef | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ReplaceNullCheck | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ImportNormalizer\[imports.size()\]'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeScopeWithWildcardImports.java`
#### Snippet
```java
	
	public TypeScopeWithWildcardImports(List<ImportNormalizer> imports, RecordingTypeScope typeScope, AbstractScope parent, boolean binaryName) {
		this.imports = new ImportNormalizer[][] { imports.toArray(new ImportNormalizer[imports.size()]) };
		this.typeScope = typeScope;
		this.parent = parent;
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
	 * @noextend This interface is not intended to be extended by clients.
	 */
	public static interface CompilationResult {
		
		Map<String,String> getGeneratedCode();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
	
	@Singleton
	static class Impl extends JvmModelAssociator implements IXtendJvmAssociations {

		@Override
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0` can be replaced with 'XTEND_TYPE_DECLARATION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_ENUM_FEATURE_COUNT = XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0` can be replaced with 'XTEND_ANNOTATION_TARGET_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_PARAMETER__NAME = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0` can be replaced with 'XTEND_TYPE_DECLARATION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_CLASS__EXTENDS = XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0` can be replaced with 'XTEND_TYPE_DECLARATION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_ANNOTATION_TYPE_FEATURE_COUNT = XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XSTRING_LITERAL_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XEXPRESSION_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XEXPRESSION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int ANONYMOUS_CLASS__ANNOTATIONS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0` can be replaced with 'XTEND_ANNOTATION_TARGET_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_MEMBER__ANNOTATION_INFO = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`TypesPackage.JVM_FORMAL_PARAMETER_FEATURE_COUNT + 0` can be replaced with 'TypesPackage.JVM_FORMAL_PARAMETER_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_FORMAL_PARAMETER__EXTENSION = TypesPackage.JVM_FORMAL_PARAMETER_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_EXECUTABLE_FEATURE_COUNT + 0` can be replaced with 'XTEND_EXECUTABLE_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_FUNCTION__NAME = XTEND_EXECUTABLE_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0` can be replaced with 'XTEND_TYPE_DECLARATION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_INTERFACE__EXTENDS = XTEND_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__SEPARATOR = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_MEMBER_FEATURE_COUNT + 0` can be replaced with 'XTEND_MEMBER_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_ENUM_LITERAL__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_EXECUTABLE_FEATURE_COUNT + 0` can be replaced with 'XTEND_EXECUTABLE_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR_FEATURE_COUNT = XTEND_EXECUTABLE_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_VARIABLE_DECLARATION__EXTENSION = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_MEMBER_FEATURE_COUNT + 0` can be replaced with 'XTEND_MEMBER_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_EXECUTABLE__EXCEPTIONS = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_MEMBER_FEATURE_COUNT + 0` can be replaced with 'XTEND_MEMBER_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_TYPE_DECLARATION__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XbasePackage.XEXPRESSION_FEATURE_COUNT + 0` can be replaced with 'XbasePackage.XEXPRESSION_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int RICH_STRING_IF__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`XTEND_MEMBER_FEATURE_COUNT + 0` can be replaced with 'XTEND_MEMBER_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int XTEND_FIELD__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int END_IF__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int PRINTED_EXPRESSION__EXPRESSION = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int FOR_LOOP_START__LOOP = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int ELSE_IF_CONDITION__RICH_STRING_ELSE_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int IF_CONDITION_START__RICH_STRING_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LITERAL_FEATURE_COUNT + 0` can be replaced with 'LITERAL_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int ELSE_START__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int LITERAL__LITERAL = LINE_PART_FEATURE_COUNT + 0;

	/**
```

### PointlessArithmeticExpression
`LINE_PART_FEATURE_COUNT + 0` can be replaced with 'LINE_PART_FEATURE_COUNT'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @ordered
	 */
	int FOR_LOOP_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerAntTask.java`
#### Snippet
```java
		}
		Iterator<?> pathIter = srcDirs.iterator();
		while (pathIter.hasNext()) {
			Object next = pathIter.next();
			if (!(next instanceof Resource && ((Resource) next).isDirectory())) {
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
		if (modelPackage == null)
		{
			modelPackage = XtendPackage.eINSTANCE;
		}
	}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
		if (modelPackage == null)
		{
			modelPackage = XtendPackage.eINSTANCE;
		}
	}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
		if (modelPackage == null)
		{
			modelPackage = ProcessedRichStringPackage.eINSTANCE;
		}
	}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
		if (modelPackage == null)
		{
			modelPackage = ProcessedRichStringPackage.eINSTANCE;
		}
	}
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (30 lines)
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendTypeComputer.java`
#### Snippet
```java
	}
	
//	protected void _computeTypes(XtendVariableDeclaration object, ITypeComputationState state) {
//		if (object.isExtension()) {
//			// basically the same as in the super implementation but we want to use
```

### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
	ContentAssistGrammarNaming contentAssistNaming;

	//	@Mandatory
	//	public void setJFlexMain(JFlexGeneratorFragmentTemplate main) {
	//		this.templatex = main;
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/contentassist/antlr/FlexerBasedContentAssistContextFactory.java`
#### Snippet
```java
		String prefix = "";
		Collection<FollowElement> followElements = parseFollowElements(completionOffset, strict);
//		String completeInput = viewer.getDocument().get(0, completionOffset);
//		Collection<FollowElement> followElements = parser.getFollowElements(completeInput, strict);
		doCreateContexts(lastCompleteNode, currentNode, prefix, previousModel, followElements);
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LocalResourceFilteringTypeScope.java`
#### Snippet
```java
	
	private Iterable<IEObjectDescription> filtered(Iterable<IEObjectDescription> unfiltered) {
		return Iterables.filter(unfiltered, input -> !isFiltered(input.getQualifiedName()));
	}

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						public List<? extends Problem> getAllProblems() {
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
							List<Problem> result = Lists.newArrayList(Iterables.transform(issues, new Function<EObjectDiagnosticImpl, Problem>() {

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
							List<Problem> result = Lists.newArrayList(Iterables.transform(issues, new Function<EObjectDiagnosticImpl, Problem>() {

								@Override
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java

		protected <T> T getFirstOrNull(Iterable<EObject> elements, Class<T> type) {
			Iterator<T> iterator = filter(elements, type).iterator();
			return iterator.hasNext() ? iterator.next() : null;
		}
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmOperation getDirectlyInferredOperation(XtendFunction xtendFunction) {
			final Iterable<JvmOperation> jvmElements = filter(getJvmElements(xtendFunction), JvmOperation.class);
			String expectedName = xtendFunction.getName();
			if (xtendFunction.isDispatch()) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
			XtendFunction function = (XtendFunction) sourceElement;
			if (function.isDispatch()) {
				Iterable<JvmOperation> operations = filter(associations.getJvmElements(sourceElement), JvmOperation.class);
				for(JvmOperation operation: operations) {
					if (Strings.equal(operation.getSimpleName(), function.getName())) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
	
	public boolean isDispatcherFunction(JvmOperation inferredOperation) {
		return Iterables.any(inferredOperation.eAdapters(), new Predicate<Object>() {
			@Override
			public boolean apply(Object input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	private void internalInstallJvmTypeProvider(ResourceSet resourceSet, File tmpClassDirectory, boolean skipIndexLookup) {
		Iterable<String> classPathEntries = concat(asList(tmpClassDirectory.toString()), getClassPathEntries(), getSourcePathDirectories());
		classPathEntries = filter(classPathEntries, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		});
		
		Iterable<File> classpath = transform(classPathEntries, TO_FILE);
		if (log.isDebugEnabled()) {
			log.debug("classpath used for Xtend compilation : " + classpath);
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
				parentClassLoader = ClassLoader.getSystemClassLoader().getParent();
			} else {
				Iterable<File> bootClassPathEntries = transform(getBootClassPathEntries(), TO_FILE);
				parentClassLoader = new AlternateJdkLoader(bootClassPathEntries);
			}
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 */
	protected ClassLoader createClassLoader(Iterable<File> jarsAndFolders, ClassLoader parentClassLoader) {
		return new URLClassLoader(toArray(transform(jarsAndFolders, TO_URL), URL.class), parentClassLoader);
	}

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		}
		final List<String> split = split(emptyIfNull(path), File.pathSeparator);
		return transform(split, new Function<String, String>() {
			@Override
			public String apply(String from) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		}
		List<String> sourceDirectories = newArrayList(sourcePathDirectories);
		commandLine.add(concat(" ", transform(sourceDirectories, new Function<String, String>() {
			@Override
			public String apply(String path) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		for (DispatchHelper.DispatchSignature signature : methods.keySet()) {
			List<JvmOperation> operations = methods.get(signature);
			Iterable<JvmOperation> localOperations = Iterables.filter(operations, new Predicate<JvmOperation>() {
				@Override
				public boolean apply(JvmOperation input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		boolean override = false;
		for (JvmOperation jvmOperation : localOperations) {
			Iterable<XtendFunction> xtendFunctions = Iterables.filter(associations.getSourceElements(jvmOperation),
					XtendFunction.class);
			for (XtendFunction func : xtendFunctions) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java

	protected void translateAnnotationsTo(List<XAnnotation> annotations, JvmAnnotationTarget target) {
		jvmTypesBuilder.addAnnotations(target, Iterables.filter(annotations, annotationTranslationFilter));
	}
	
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		if(numUnshownOperations >0)
			errorMsg.append("\nand " +  numUnshownOperations + " more.");
		List<String> uris = transform(operationsMissingImplementation, new Function<IResolvedOperation, String>() {
			@Override
			public String apply(IResolvedOperation from) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		}
		Multimap<DispatchHelper.DispatchSignature, XtendFunction> nonDispatchMethods = HashMultimap.create();
		for(XtendFunction method: filter(clazz.getMembers(), XtendFunction.class)) {
			if(!method.isDispatch()) {
				nonDispatchMethods.put(new DispatchHelper.DispatchSignature(method.getName(), method.getParameters().size()), method);
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		if (inferredType == null)
			return;
		Iterable<JvmConstructor> constructors = filter(inferredType.getMembers(), JvmConstructor.class);
		if(inferredType.getExtendedClass() != null) {
			JvmType superType = inferredType.getExtendedClass().getType();
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected String doGetReadableSignature(String simpleName, List<JvmFormalParameter> parameters) {
		return getReadableSignature(simpleName,
				Lists.transform(parameters, new Function<JvmFormalParameter, JvmTypeReference>() {
					@Override
					public JvmTypeReference apply(JvmFormalParameter from) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
							Collection<JvmOperation> ops = signatures.get(paramTypes);
							if (ops.size() > 1) {
								if (Iterables.any(ops, new Predicate<JvmOperation>() {
									@Override
									public boolean apply(JvmOperation input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected boolean isRelevantAnnotationTarget(final XtendAnnotationTarget annotationTarget) {
		return any(targetInfos.keySet(), new Predicate<Class<?>>() {
			@Override
			public boolean apply(Class<?> input) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`text.length() == 0` can be replaced with 'text.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
		public void acceptSemanticText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			setCurrentAppendable(origin);
			if (text.length() == 0)
				return;
			currentAppendable.newLine();
```

### SizeReplaceableByIsEmpty
`packageName.length() > 0` can be replaced with '!packageName.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
		String packageName = rootContainer.getPackage();
		final ImportNormalizer[][] implicitImports;
		if (packageName != null && packageName.length() > 0) {
			QualifiedName packageQualifiedName = qualifiedNameConverter.toQualifiedName(packageName);
			implicitImports = new ImportNormalizer[][] {
```

### SizeReplaceableByIsEmpty
`result.length() == 0` can be replaced with 'result.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
		@Override
		protected boolean validate(char c, StringBuilder result) {
			if (result.length() == 0) {
				if (!isValidIdentifierStart(c)) {
					badChar = true;
```

### SizeReplaceableByIsEmpty
`result.length() != 0` can be replaced with '!result.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
		}
		if (converter.badChar) {
			if (result.length() != 0)
				throw new ValueConverterWithValueException("Illegal character in identifier '" + result + "' (" + identifier + ")", node, result, null);
			else
```

### SizeReplaceableByIsEmpty
`leadingWS.length() == 0` can be replaced with 'leadingWS.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
			// line is not empty
			if (leadingWS.length() != line.length()) {
				if (leadingWS.length() == 0)
					return "";
				result = getBetterString(result, leadingWS.toString());
```

### SizeReplaceableByIsEmpty
`leadingWS.length() == 0` can be replaced with 'leadingWS.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
				List<XExpression> siblings = completeString.getExpressions();
				if (siblings.get(siblings.size() - 1) != lastLiteral) {
					if (leadingWS.length() == 0) { // empty line
						emptyLineSeen = true;
					} else {
```

### SizeReplaceableByIsEmpty
`candidate.length() == 0` can be replaced with 'candidate.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
		if (candidate == null)
			return current;
		if (candidate.length() == 0)
			return candidate;
		if (current == null || current.length() > candidate.length())
```

### SizeReplaceableByIsEmpty
`nextLeading.length() > 0` can be replaced with '!nextLeading.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
									TextLine nextLiteralLine = new TextLine(nextLiteralInSameLine.getLiteral().getValue(), nextLiteralInSameLine.getOffset(), nextLiteralInSameLine.getLength(), 0);
									CharSequence nextLeading = nextLiteralLine.getLeadingWhiteSpace();
									if (nextLeading.length() > 0) {
										ws = ws.toString() + nextLeading;
									}
```

### SizeReplaceableByIsEmpty
`indentation.length() != 0` can be replaced with '!indentation.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/ValidatingRichStringAcceptor.java`
#### Snippet
```java
		if (unfulfilledIndentationExpectation != null) {
			if (currentOffset + indentation.length() != lastOffsetOfLiteral) {
				if (indentation.length() != 0) {
					if (wasCurrentOffset == -1) {
						this.acceptor.acceptWarning("Inconsistent indentation", root, currentOffset, indentation.length(), 
```

### SizeReplaceableByIsEmpty
`typeRefString.length() > 0` can be replaced with '!typeRefString.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			for(ReplaceRegion region : javaDocTypeReferenceProvider.computeTypeRefRegions(node)){
				String typeRefString = region.getText();
				if(typeRefString != null && typeRefString.length() > 0){
					IScope scope = scopeProvider.getScope(member, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
					IEObjectDescription candidate = scope.getSingleElement(qualifiedNameConverter.toQualifiedName(typeRefString));
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	public void checkNoTypeNameShadowing(XtendTypeDeclaration type) {
		String name = type.getName();
		if (name != null && name.length() > 0) {
			XtendTypeDeclaration outer = EcoreUtil2.getContainerOfType(type.eContainer(), XtendTypeDeclaration.class);
			while(outer != null) {
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			} else if (member instanceof XtendTypeDeclaration) {
				String name = ((XtendTypeDeclaration) member).getName();
				if (name != null && name.length() > 0) {
					name2type.put(name, (XtendTypeDeclaration) member);
				}
```

### SizeReplaceableByIsEmpty
`text.length() > 0` can be replaced with '!text.isEmpty()'
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
		public void acceptTemplateText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			resetCurrentOffset(origin);
			if (text.length() > 0) {
				int length = text.length();
				while (!pendingRegions.isEmpty()) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("DispatchSignature [simpleName=");
			builder.append(simpleName);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFormalParameterImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (extension: ");
		result.append(extension);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendEnumLiteralImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (package: ");
		result.append(package_);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendTypeDeclarationImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendVariableDeclarationImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (extension: ");
		result.append(extension);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LiteralImpl.java`
#### Snippet
```java
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (offset: ");
		result.append(offset);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractXtendValidator` has no concrete subclass
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/validation/AbstractXtendValidator.java`
#### Snippet
```java
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsValidator;

public abstract class AbstractXtendValidator extends XbaseWithAnnotationsValidator {
	
	@Override
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/PrimitiveAwareScope.java`
#### Snippet
```java
	
	@Override
	protected void doGetElements(JvmType type, List<IEObjectDescription> result) {
		if (type instanceof JvmVoid) {
			result.add(EObjectDescription.create("void", type));
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeScopeWithWildcardImports.java`
#### Snippet
```java
	
	@Override
	protected void doGetElements(JvmType type, List<IEObjectDescription> result) {
		if (!(type instanceof JvmDeclaredType)) {
			return;
```

### BoundedWildcard
Can generalize to `? super QualifiedName`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/RecordingTypeScope.java`
#### Snippet
```java
	private final Set<QualifiedName> importedNames;

	public RecordingTypeScope(AbstractTypeScope typeScope, Set<QualifiedName> importedNames, IQualifiedNameConverter qnc) {
		super(null, qnc, null);
		this.typeScope = typeScope;
```

### BoundedWildcard
Can generalize to `? extends List`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeParameterScope.java`
#### Snippet
```java
	private final List<List<JvmTypeParameter>> typeParameters;

	public TypeParameterScope(List<List<JvmTypeParameter>> typeParameters, AbstractScope parent) {
		this.typeParameters = typeParameters;
		this.parent = parent;
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeParameterScope.java`
#### Snippet
```java
	
	@Override
	protected void doGetElements(JvmType type, List<IEObjectDescription> result) {
		if (type instanceof JvmTypeParameter) {
			JvmTypeParameter casted = (JvmTypeParameter) type;
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
	
	@Override
	protected void doGetDescriptions(JvmType type, JvmType knownType, int index, List<IEObjectDescription> result) {
		if (type == knownType) {
			result.add(EObjectDescription.create(QualifiedName.create(type.getSimpleName()), type));
```

### BoundedWildcard
Can generalize to `? extends QualifiedName`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LegacyKnownTypesScope.java`
#### Snippet
```java
	private final List<QualifiedName> importNames;

	public LegacyKnownTypesScope(List<JvmType> types, List<QualifiedName> importNames, AbstractScope parent) {
		super(types, parent);
		this.importNames = importNames;
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LegacyKnownTypesScope.java`
#### Snippet
```java
	
	@Override
	protected void doGetDescriptions(JvmType type, JvmType knownType, int index, List<IEObjectDescription> result) {
		super.doGetDescriptions(type, knownType, index, result);
		QualifiedName importName = importNames.get(index);
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/NestedTypesScope.java`
#### Snippet
```java

	@Override
	protected void doGetDescriptions(JvmType type, JvmType declarator, int index, List<IEObjectDescription> result) {
		String typeName = type.getQualifiedName('.');
		String declaratorName = declarator.getQualifiedName('.');
```

### BoundedWildcard
Can generalize to `? super CompilationResult`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
	}

	public void compile(CharSequence source, final IAcceptor<CompilationResult> acceptor) {
		try {
			compilationTestHelper.configureFreshWorkspace();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/SyntheticNameClashResolver.java`
#### Snippet
```java
	 */
	protected boolean collides(JvmIdentifiableElement element, String currentName,
			Multimap<String, JvmIdentifiableElement> scope) {
		if (scope.containsKey(currentName)) {
			if (element instanceof JvmOperation) {
```

### BoundedWildcard
Can generalize to `? extends JvmIdentifiableElement`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/SyntheticNameClashResolver.java`
#### Snippet
```java
	 */
	protected boolean collides(JvmIdentifiableElement element, String currentName,
			Multimap<String, JvmIdentifiableElement> scope) {
		if (scope.containsKey(currentName)) {
			if (element instanceof JvmOperation) {
```

### BoundedWildcard
Can generalize to `? extends JvmOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
	}

	protected void sort(List<JvmOperation> operations) {
		Collections.sort(operations, new Comparator<JvmOperation>() {
			@Override
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/resource/XtendResourceDescriptionStrategy.java`
#### Snippet
```java
	}

	protected void addFlags(int flags, ImmutableMap.Builder<String, String> userData) {
		if(flags != 0)
			userData.put(DescriptionFlags.KEY, Integer.toString(flags));
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/resource/XtendResourceDescriptionStrategy.java`
#### Snippet
```java
	}

	protected void addFlags(int flags, ImmutableMap.Builder<String, String> userData) {
		if(flags != 0)
			userData.put(DescriptionFlags.KEY, Integer.toString(flags));
```

### BoundedWildcard
Can generalize to `? super IEObjectDescription`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
	}

	private void doGetAllDescriptions(JvmDeclaredType type, List<IEObjectDescription> descriptions) {
		descriptions.add(EObjectDescription.create(getQualifiedNameConverter().toQualifiedName(type.getIdentifier()), type));
		EList<JvmMember> members = null;
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
	}
	
	protected void addIfAbsent(String value, Set<String> set) {
		if (!set.contains(value))
			set.add(value);
```

### BoundedWildcard
Can generalize to `? super TextLine`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/TextLines.java`
#### Snippet
```java
	 * adapted from org.eclipse.jface.text.DefaultLineTracker.nextDelimiterInfo(String, int)
	 */
	public static void appendLines(String text, List<TextLine> result) {
		if (text == null)
			return;
```

### BoundedWildcard
Can generalize to `? super EObject`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/TypeDeclarationAwareBatchTypeResolver.java`
#### Snippet
```java
	 * {@code isHandled} in the concrete {@link org.eclipse.xtext.xbase.typesystem.internal.AbstractRootedReentrantTypeResolver}.
	 */
	private void addXtendTypes(XtendTypeDeclaration declaration, List<EObject> result) {
		for(XtendMember member: declaration.getMembers()) {
			TreeIterator<EObject> iterator = EcoreUtil2.getAllNonDerivedContents(member, true);
```

### BoundedWildcard
Can generalize to `? extends File`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	}

	private File determineCommonRoot(File outputFile, List<File> sourceFileList) {
		if (baseURI != null && baseURI.isFile()) {
			return new File(baseURI.toFileString());
```

### BoundedWildcard
Can generalize to `? extends Issue`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	}

	protected void reportIssues(Iterable<Issue> issues) {
		for (Issue issue : issues) {
			StringBuilder issueBuilder = createIssueMessage(issue);
```

### BoundedWildcard
Can generalize to `? extends File`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 * @since 2.8
	 */
	protected ClassLoader createClassLoader(Iterable<File> jarsAndFolders, ClassLoader parentClassLoader) {
		return new URLClassLoader(toArray(transform(jarsAndFolders, TO_URL), URL.class), parentClassLoader);
	}
```

### BoundedWildcard
Can generalize to `? extends JvmTypeParameter`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
	}
	
	protected void copyTypeParameters(List<JvmTypeParameter> typeParameters, JvmTypeParameterDeclarator target) {
		for (JvmTypeParameter typeParameter : typeParameters) {
			if (!Strings.isEmpty(typeParameter.getName())) {
```

### BoundedWildcard
Can generalize to `? super Runnable`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
	
	protected JvmDeclaredType doInferTypeSceleton(final XtendTypeDeclaration declaration, final IJvmDeclaredTypeAcceptor acceptor,
			boolean preIndexingPhase, XtendFile xtendFile, List<Runnable> doLater) {
		if (Strings.isEmpty(declaration.getName()))
			return null;
```

### BoundedWildcard
Can generalize to `? extends XAnnotation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
	}

	protected void translateAnnotationsTo(List<XAnnotation> annotations, JvmAnnotationTarget target) {
		jvmTypesBuilder.addAnnotations(target, Iterables.filter(annotations, annotationTranslationFilter));
	}
```

### BoundedWildcard
Can generalize to `? extends XAnnotation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
	}

	protected void computeXtendAnnotationTypes(ResolvedTypes resolvedTypes, IFeatureScopeSession featureScopeSession, List<XAnnotation> annotations) {
		for (XAnnotation annotation : annotations) {
			computeDanglingExpressionType(resolvedTypes, featureScopeSession, null, annotation);
```

### BoundedWildcard
Can generalize to `? extends JvmOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
	}

	protected void resolveDispatchCaseTypes(JvmOperation dispatcher, List<JvmOperation> dispatchCases, LightweightTypeReference type,
			IFeatureScopeSession featureScopeSession) {
		if (InferredTypeIndicator.isInferred(dispatcher.getReturnType())) {
```

### BoundedWildcard
Can generalize to `? extends IResolvedOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	
	protected void createExceptionMismatchError(IResolvedOperation operation, EObject sourceElement,
			List<IResolvedOperation> exceptionMismatch) {
		List<LightweightTypeReference> exceptions = operation.getIllegallyDeclaredExceptions();
		StringBuilder message = new StringBuilder(100);
```

### BoundedWildcard
Can generalize to `? super EObject`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected void doCheckFunctionOverrides(IResolvedOperation operation, Set<EObject> flaggedOperations) {
		EObject sourceElement = findPrimarySourceElement(operation);
		if (sourceElement != null) {
```

### BoundedWildcard
Can generalize to `? extends JvmTypeReference`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected String getReadableSignature(String elementName, List<JvmTypeReference> parameterTypes) {
		StringBuilder result = new StringBuilder(elementName);
		result.append('(');
```

### BoundedWildcard
Can generalize to `? super XReturnExpression`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected void collectReturnExpressions(EObject expr, List<XReturnExpression> found) {
		if (expr instanceof XReturnExpression) {
			found.add((XReturnExpression) expr);
```

### BoundedWildcard
Can generalize to `? extends JvmOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected void checkDispatchNonDispatchConflict(XtendClass clazz,
			Multimap<DispatchHelper.DispatchSignature, JvmOperation> dispatchMethods) {
		if(isIgnored(DISPATCH_PLAIN_FUNCTION_NAME_CLASH)) {
			return;
```

### BoundedWildcard
Can generalize to `? extends JvmFormalParameter`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected String doGetReadableSignature(String simpleName, List<JvmFormalParameter> parameters) {
		return getReadableSignature(simpleName,
				Lists.transform(parameters, new Function<JvmFormalParameter, JvmTypeReference>() {
```

### BoundedWildcard
Can generalize to `? extends IResolvedOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected void doCheckFunctionOverrides(EObject sourceElement, IResolvedOperation resolved,
			List<IResolvedOperation> allInherited) {
		boolean overrideProblems = false;
		List<IResolvedOperation> exceptionMismatch = null;
```

### BoundedWildcard
Can generalize to `? extends Executable`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected <Executable extends IResolvedExecutable> void doCheckDuplicateExecutables(JvmGenericType inferredType,
			List<Executable> declaredOperations, Function<String, List<Executable>> bySignature, Set<EObject> flaggedOperations) {
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected <Executable extends IResolvedExecutable> void doCheckDuplicateExecutables(JvmGenericType inferredType,
			List<Executable> declaredOperations, Function<String, List<Executable>> bySignature, Set<EObject> flaggedOperations) {
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected <Executable extends IResolvedExecutable> void doCheckDuplicateExecutables(JvmGenericType inferredType,
			List<Executable> declaredOperations, Function<String, List<Executable>> bySignature, Set<EObject> flaggedOperations) {
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
```

### BoundedWildcard
Can generalize to `? super EObject`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected <Executable extends IResolvedExecutable> void doCheckDuplicateExecutables(JvmGenericType inferredType,
			List<Executable> declaredOperations, Function<String, List<Executable>> bySignature, Set<EObject> flaggedOperations) {
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
```

### BoundedWildcard
Can generalize to `? extends JvmTypeReference`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}
	
	private void checkExceptions(EObject context, List<JvmTypeReference> exceptions, EReference reference) {
		Set<String> declaredExceptionNames = Sets.newHashSet();
		JvmTypeReference throwableType = getServices().getTypeReferences().getTypeForName(Throwable.class, context);
```

### BoundedWildcard
Can generalize to `? extends IResolvedOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}
	
	protected void reportMissingImplementations(XtendTypeDeclaration xtendClass, JvmGenericType inferredType, List<IResolvedOperation> operationsMissingImplementation) {
		StringBuilder errorMsg = new StringBuilder();
		String name = xtendClass.getName();
```

### BoundedWildcard
Can generalize to `? super EObject`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	
	protected void doCheckOverriddenMethods(XtendTypeDeclaration xtendType, JvmGenericType inferredType, ResolvedFeatures resolvedFeatures,
			Set<EObject> flaggedOperations) {
		List<IResolvedOperation> operationsMissingImplementation = null;
		boolean doCheckAbstract = !inferredType.isAbstract();
```

### BoundedWildcard
Can generalize to `? super JvmDeclaredType`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	
	private boolean contributesToConflict(JvmDeclaredType type, Set<JvmDeclaredType> involvedInterfaces,
			RecursionGuard<JvmDeclaredType> guard) {
		if (!guard.tryNext(type)) {
			return false;
```

### BoundedWildcard
Can generalize to `? super JvmGenericType`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected boolean hasCycleInHierarchy(JvmGenericType type, Set<JvmGenericType> processedSuperTypes) {
		JvmDeclaredType container = type;
		do {
```

### BoundedWildcard
Can generalize to `? extends JvmOperation`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected void addDispatchError(JvmGenericType type, Iterable<JvmOperation> operations, String message, String modifier, String ISSUE_ID) {
		for (JvmOperation jvmOperation : operations)
			if (jvmOperation.getDeclaringType() == type)
```

### BoundedWildcard
Can generalize to `? super Keyword`
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
	}
	
	protected void collectKeywordsFromRule(IGrammarAccess grammarAccess, String ruleName, ImmutableSet.Builder<Keyword> builder) {
		AbstractRule rule = GrammarUtil.findRuleForName(grammarAccess.getGrammar(), ruleName);
		if (!(rule instanceof TerminalRule)) { // if someone decides to override ValidID with a terminal rule
```

### BoundedWildcard
Can generalize to `? super AbstractElement`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/XtendParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XtendGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives_2(), "rule__Type__Alternatives_2");
			builder.put(grammarAccess.getJvmSuperTypeReferenceAccess().getAlternatives(), "rule__JvmSuperTypeReference__Alternatives");
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/XtendParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XtendGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives_2(), "rule__Type__Alternatives_2");
			builder.put(grammarAccess.getJvmSuperTypeReferenceAccess().getAlternatives(), "rule__JvmSuperTypeReference__Alternatives");
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendInjectorSingleton.java`
#### Snippet
```java
 */
public class XtendInjectorSingleton {
	public final static Injector INJECTOR = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration();
}

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/DefaultIndentationHandler.java`
#### Snippet
```java
public class DefaultIndentationHandler implements IRichStringIndentationHandler {

	protected static abstract class IndentationData {
		protected CharSequence value;
		
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
public class XtendBatchCompiler {

	private final static class SeverityFilter implements Predicate<Issue> {
		private static final SeverityFilter WARNING = new SeverityFilter(Severity.WARNING);
		private static final SeverityFilter ERROR = new SeverityFilter(Severity.ERROR);
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
	public static final String CREATE_CHACHE_VARIABLE_PREFIX = "_createCache_";
	
	private final static Logger logger = Logger.getLogger(XtendJvmModelInferrer.class);

	@Inject
```

### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexLoader.java`
#### Snippet
```java
public class JFlexLoader implements IWorkflowComponent, JFlexMain {

	private final static Logger log = Logger.getLogger(JFlexLoader.class);
	
	private static final String DOWNLOAD_URL = "http://jflex.de/jflex-1.4.3.zip";
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Exceptions.sneakyThrow()` is ignored
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
			compilationTestHelper.assertCompilesTo(source, expected);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}
```

### IgnoreResultOfCall
Result of `Exceptions.sneakyThrow()` is ignored
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
			});
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
					nextPart = currentLine.getParts().get(0);
				}
				while(nextPart != null) {
					doSwitch(nextPart);
				}
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `IntUnderscoreValueConverter` is the same as one of its superclass' names
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/IntUnderscoreValueConverter.java`
#### Snippet
```java
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class IntUnderscoreValueConverter extends XbaseValueConverterService.IntUnderscoreValueConverter {

	@Inject
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		if (inferredType == null)
			return;
		super.checkFinalFieldInitialization(inferredType);
	}
	
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		if (inferredType == null)
			return;
		super.checkFinalFieldInitialization(inferredType);
	}
	
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static com.google.common.collect.Iterables.filter;`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

import static com.google.common.collect.Iterables.*;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Lists.transform;
```

### UNUSED_IMPORT
Unused import `import org.antlr.runtime.CommonToken;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendFlexer.java`
#### Snippet
```java

import org.antlr.runtime.Token;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenSource;

```

### UNUSED_IMPORT
Unused import `import org.antlr.runtime.TokenSource;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendFlexer.java`
#### Snippet
```java
import org.antlr.runtime.Token;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenSource;

@SuppressWarnings({"all"})
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.*;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
package org.eclipse.xtend.core.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.*;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.impl.*;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.util.EcoreUtil;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/parser/antlr/internal/InternalXtendParser.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2010, 2023 itemis AG (http://www.itemis.eu) and others.
```

### UNUSED_IMPORT
Unused import `import org.antlr.runtime.CommonToken;`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/internal/InternalXtendFlexer.java`
#### Snippet
```java

import org.antlr.runtime.Token;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenSource;

```

### UNUSED_IMPORT
Unused import `import org.antlr.runtime.TokenSource;`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/internal/InternalXtendFlexer.java`
#### Snippet
```java
import org.antlr.runtime.Token;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenSource;

@SuppressWarnings({"all"})
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtend.ide.common/src-gen/org/eclipse/xtend/ide/common/contentassist/antlr/internal/InternalXtendLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`start = start - 1` could be simplified to 'start -= 1'
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
						}
						if (recentNode != null && recentNode.getTotalEndOffset() == start) {
							start = start - 1;
							length = length + 1;
						}
```

### ReplaceAssignmentWithOperatorAssignment
`length = length + 1` could be simplified to 'length += 1'
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
						if (recentNode != null && recentNode.getTotalEndOffset() == start) {
							start = start - 1;
							length = length + 1;
						}
						acceptor.addPosition(start, length, HighlightingStyles.COMMENT_ID);
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/FunctionIDValueConverter.java`
#### Snippet
```java
		if (delegate != null)
			return delegate;
		return delegate = service.getConverter(grammarAccess.getValidIDRule().getName());
	}

```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `types` are updated, but never queried
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		if (!(object instanceof XtendFile))
			return;
		final Set<JvmDeclaredType> types = new LinkedHashSet<JvmDeclaredType>();
		final IJvmDeclaredTypeAcceptor wrapper = new IJvmDeclaredTypeAcceptor() {

```

### MismatchedCollectionQueryUpdate
Contents of collection `processed` are queried, but never updated
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected <Executable extends IResolvedExecutable> void doCheckDuplicateExecutables(JvmGenericType inferredType,
			List<Executable> declaredOperations, Function<String, List<Executable>> bySignature, Set<EObject> flaggedOperations) {
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
			if (!processed.contains(declaredExecutable)) {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java

public interface IResourceChangeRegistry {
	void registerExists(String path, URI uri);
	void registerGetCharset(String string, URI uri);
	void registerGetChildren(String string, URI uri);
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java
public interface IResourceChangeRegistry {
	void registerExists(String path, URI uri);
	void registerGetCharset(String string, URI uri);
	void registerGetChildren(String string, URI uri);
	void registerGetContents(String string, URI uri);
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java
	void registerExists(String path, URI uri);
	void registerGetCharset(String string, URI uri);
	void registerGetChildren(String string, URI uri);
	void registerGetContents(String string, URI uri);
	void registerCreateOrModify(String string, URI uri);
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java
	void registerGetCharset(String string, URI uri);
	void registerGetChildren(String string, URI uri);
	void registerGetContents(String string, URI uri);
	void registerCreateOrModify(String string, URI uri);
	void discardCreateOrModifyInformation(URI uri);
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java
	void registerGetChildren(String string, URI uri);
	void registerGetContents(String string, URI uri);
	void registerCreateOrModify(String string, URI uri);
	void discardCreateOrModifyInformation(URI uri);
}
```

### EmptyMethod
All implementations of this method are empty
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/macro/declaration/IResourceChangeRegistry.java`
#### Snippet
```java
	void registerGetContents(String string, URI uri);
	void registerCreateOrModify(String string, URI uri);
	void discardCreateOrModifyInformation(URI uri);
}

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
	protected static class Implementation extends JavaStringConverter {
		boolean error = false;
		boolean badChar = false;
		
		protected Implementation() {}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java

	protected static class Implementation extends JavaStringConverter {
		boolean error = false;
		boolean badChar = false;
		
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/serializer/XtendSyntacticSequencer.java`
#### Snippet
```java
public class XtendSyntacticSequencer extends AbstractXtendSyntacticSequencer {
	
	boolean semicolonBeforeNextExpressionRequired = false;
	
	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
		private ProcessedRichStringFactory factory = ProcessedRichStringFactory.eINSTANCE;
		
		private ProcessedRichString result = null;

		private Line currentLine = null; 
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
		private ProcessedRichString result = null;

		private Line currentLine = null; 
		
		public ProcessedRichString processRichString(RichString richString) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
		private RichStringLiteral announced;
		
		private int skipCount = 0;

		public Implementation(IRichStringPartAcceptor acceptor, IRichStringIndentationHandler indentationHandler) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/ValidatingRichStringAcceptor.java`
#### Snippet
```java
	private int wasCurrentOffset = -1;
	private RichStringLiteral recent = null;
	private RichStringLiteral root = null;
	private LinkedList<String> indentationStack;
	private String unfulfilledIndentationExpectation = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/ValidatingRichStringAcceptor.java`
#### Snippet
```java
	private int currentOffset = -1;
	private int wasCurrentOffset = -1;
	private RichStringLiteral recent = null;
	private RichStringLiteral root = null;
	private LinkedList<String> indentationStack;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/ValidatingRichStringAcceptor.java`
#### Snippet
```java
	private RichStringLiteral root = null;
	private LinkedList<String> indentationStack;
	private String unfulfilledIndentationExpectation = null;
	private int lastOffsetOfLiteral = -1;
	
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 * @since 2.8
	 */
	protected boolean writeStorageFiles = false;
	private GeneratorConfig generatorConfig = new GeneratorConfig();
	protected ClassLoader currentClassLoader = getClass().getClassLoader();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	protected String outputPath;
	protected String fileEncoding;
	protected boolean verbose = false;
	protected String tempDirectory = System.getProperty("java.io.tmpdir");
	protected boolean deleteTempDirectory = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass ifConditionStartEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass endIfEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass linePartEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass processedRichStringEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private boolean isCreated = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass printedExpressionEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass elseStartEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private static boolean isInited = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass forLoopEndEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass lineBreakEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass elseIfConditionEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass forLoopStartEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendEnumEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendInterfaceEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendFileEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private static boolean isInited = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendParameterEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendExecutableEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendConstructorEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendEnumLiteralEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendTypeDeclarationEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendClassEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass richStringIfEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private boolean isCreated = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendAnnotationTargetEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass richStringLiteralEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendFieldEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendFunctionEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendAnnotationTypeEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendFormalParameterEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass richStringElseIfEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
	private String additionalRulePath;

	private boolean ui = false;

	@Mandatory
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass createExtensionInfoEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass richStringEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass richStringForLoopEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendVariableDeclarationEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	private EClass xtendMemberEClass = null;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java

		private int currentOffset = -1;
		private RichStringLiteral recent = null;
		private final IHighlightedPositionAcceptor acceptor;
		private Queue<ITextRegion> pendingRegions = Lists.newLinkedList();
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gradle/java-compiler-settings.gradle`
#### Snippet
```java
 */

sourceCompatibility = '11'

tasks.withType(JavaCompile) {
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/ModifierValidator.java`
#### Snippet
```java
		this.allowedModifiers = newHashSet(allowedModifiers);
		this.validator = validator;
		StringBuffer buffer = new StringBuffer(allowedModifiers.get(0));
		for(int i=1; i<allowedModifiers.size()-1; ++i) 
			buffer.append(", ").append(allowedModifiers.get(i));
```

## RuleId[ruleID=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexLoader.java`
#### Snippet
```java
	}

	protected void copyIntoFileAndCloseStream(InputStream content, final File file) throws FileNotFoundException, IOException {
		BufferedInputStream inputStream = new BufferedInputStream(content);
		try {
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtext.generator.IShouldGenerate'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java
	}

	public Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always.class;
	}
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java
	}

	public Class<? extends MutableFileSystemSupport> bindMutableFileSystemSupport() {
		return JavaIOFileSystemSupport.class;
	}
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.declaration.CompilationUnit'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		Map<String, CharSequence> getAllGeneratedResources();
		
		CompilationUnit getCompilationUnit();
		
		TransformationContext getTransformationContext();
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.TransformationContext'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		CompilationUnit getCompilationUnit();
		
		TransformationContext getTransformationContext();
		
		/**
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.services.Problem'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		 * @since 2.8
		 */
		List<? extends Problem> getAllProblems();
	}
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.eclipse.xtend.lib.macro.services.Problem'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		 * @since 2.8
		 */
		List<? extends Problem> getProblems(Element element);
		
		/**
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `variableName` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
			ITreeAppendable debugAppendable = appendable.trace(forLoop, true);
			internalToJavaStatement(expression, debugAppendable, true);
			String variableName = null;
			if (forLoop.getBefore() != null || forLoop.getSeparator() != null || forLoop.getAfter() != null) {
				variableName = debugAppendable.declareSyntheticVariable(forLoop, "_hasElements");
```

### UnusedAssignment
Variable `members` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
	private void doGetAllDescriptions(JvmDeclaredType type, List<IEObjectDescription> descriptions) {
		descriptions.add(EObjectDescription.create(getQualifiedNameConverter().toQualifiedName(type.getIdentifier()), type));
		EList<JvmMember> members = null;
		if (type instanceof JvmDeclaredTypeImplCustom) {
			members = ((JvmDeclaredTypeImplCustom)type).basicGetMembers();
```

### UnusedAssignment
Variable `next` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
				} else {
					StringBuilder run = new StringBuilder(Strings.emptyIfNull(literal.getValue()));
					RichStringLiteral next = null;
					do {
						next = (RichStringLiteral) elements.get(nextIndex);
```

### UnusedAssignment
Variable `returnType` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		CreateExtensionInfo createExtensionInfo = source.getCreateExtensionInfo();
		
		JvmTypeReference returnType = null;
		if (source.getReturnType() != null) {
			returnType = jvmTypesBuilder.cloneWithProxies(source.getReturnType());
```

### UnusedAssignment
Variable `contexts` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			inferTypeSceleton(declaration, wrapper, preIndexingPhase, xtendFile, doLater, null);
		}
		ActiveAnnotationContexts contexts = null;
		BatchLinkableResource resource = (BatchLinkableResource)xtendFile.eResource();
		try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			LightweightTypeReference thrownVoidOrNull,
			ResolvedTypes resolvedTypes) {
		LightweightTypeReference result = null;
		if (declaredType != null) {
			result = declaredType;
```

### UnusedAssignment
Variable `inheritedDispatcher` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
				TypeConformanceComputer conformanceComputer = typeResolver.getServices().getTypeConformanceComputer();
				List<LightweightTypeReference> parameterTypes = Lists.newArrayListWithCapacity(cases.size());
				JvmOperation inheritedDispatcher = null;
				LightweightTypeReference inheritedParameterType = null;
				for (JvmOperation caseOperation : cases) {
```

### UnusedAssignment
Variable `dispatchCaseResult` initializer `null` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
								declaredDispatcherType);
						addExtensionProviders(state, dispatchCase.getParameters());
						ITypeComputationResult dispatchCaseResult = null;
						try {
							markComputing(dispatchCase.getReturnType());
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`value.indexOf("'''") >= 0` can be replaced with 'value.contains("'''")'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
			throw new ValueConverterException("Rich string may not contain \"\u00AB\".", null, null);
		}
		if (value.indexOf("'''") >= 0) {
			throw new ValueConverterException("Rich string may not contain \"'''\".", null, null);
		}
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `simpleName == null` is always `false`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
			if (arity != other.arity)
				return false;
			if (simpleName == null) {
				if (other.simpleName != null)
					return false;
```

### ConstantValue
Condition `simpleName == null` is always `false` when reached
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
			int result = 1;
			result = prime * result + arity;
			result = prime * result + ((simpleName == null) ? 0 : simpleName.hashCode());
			return result;
		}
```

### ConstantValue
Condition `importedNames == null` is always `false` when reached
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
					JvmDeclaredType importedType = importDeclaration.getImportedType();
					if (importedType != null && !importedType.eIsProxy()) {
						if (concreteImports == null || importedNames == null /* to make JDT happy */) {
							concreteImports = Lists.newArrayListWithCapacity(10);
							importedNames = Lists.newArrayListWithCapacity(10);
```

### ConstantValue
Value `onlyLiterals` is always 'true'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
					if (literal instanceof LineBreak) {
						if (firstOrLast)
							return onlyLiterals;
						return !onlyLiterals;
					}
```

### ConstantValue
Value `onlyLiterals` is always 'true'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
			}
			if (firstOrLast)
				return onlyLiterals;
			return !onlyLiterals;
		}
```

### ConstantValue
Condition `sourceFileList == null` is always `false`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		List<File> sourceFileList = getSourcePathFileList();
		File outputFile = getOutputPathFile();
		if (sourceFileList == null || outputFile == null) {
			return false;
		}
```

### ConstantValue
Condition `sourceFileList == null || outputFile == null` is always `false`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		List<File> sourceFileList = getSourcePathFileList();
		File outputFile = getOutputPathFile();
		if (sourceFileList == null || outputFile == null) {
			return false;
		}
```

### ConstantValue
Condition `outputFile == null` is always `false` when reached
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		List<File> sourceFileList = getSourcePathFileList();
		File outputFile = getOutputPathFile();
		if (sourceFileList == null || outputFile == null) {
			return false;
		}
```

### ConstantValue
Value `skipIndexLookup` is always 'true'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	protected void installJvmTypeProvider(ResourceSet resourceSet, File tmpClassDirectory, boolean skipIndexLookup) {
		if (skipIndexLookup) {
			internalInstallJvmTypeProvider(resourceSet, tmpClassDirectory, skipIndexLookup);
		} else {
			// delegate to the deprecated signature in case it was overridden by clients
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendEnumLiteralImpl.java`
#### Snippet
```java
		{
			case XtendPackage.XTEND_ENUM_LITERAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (importSection != null)
				msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FILE__IMPORT_SECTION, null, msgs);
			if (newImportSection != null)
				msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FILE__IMPORT_SECTION, null, msgs);
```

### ConstantValue
Condition `PACKAGE_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
				return xtendTypes != null && !xtendTypes.isEmpty();
			case XtendPackage.XTEND_FILE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
		}
		return super.eIsSet(featureID);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__AFTER, null, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__AFTER, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (separator != null)
				msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__SEPARATOR, null, msgs);
			if (newSeparator != null)
				msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__SEPARATOR, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__BEFORE, null, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_FOR_LOOP__BEFORE, null, msgs);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendTypeDeclarationImpl.java`
#### Snippet
```java
		{
			case XtendPackage.XTEND_TYPE_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtendPackage.XTEND_TYPE_DECLARATION__MEMBERS:
				return members != null && !members.isEmpty();
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaringType != null)
				msgs = ((InternalEObject)newDeclaringType).eInverseAdd(this, XtendPackage.XTEND_TYPE_DECLARATION__MEMBERS, XtendTypeDeclaration.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_MEMBER__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_MEMBER__ANNOTATION_INFO, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendClassImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_CLASS__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_CLASS__EXTENDS, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_ELSE_IF__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_ELSE_IF__IF, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_ELSE_IF__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_ELSE_IF__THEN, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__THEN, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__IF, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.RICH_STRING_IF__ELSE, null, msgs);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `false`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
				return createExpression != null;
			case XtendPackage.CREATE_EXTENSION_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (createExpression != null)
				msgs = ((InternalEObject)createExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, null, msgs);
			if (newCreateExpression != null)
				msgs = ((InternalEObject)newCreateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, null, msgs);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
		{
			case XtendPackage.XTEND_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtendPackage.XTEND_FUNCTION__RETURN_TYPE:
				return returnType != null;
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (createExtensionInfo != null)
				msgs = ((InternalEObject)createExtensionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FUNCTION__CREATE_EXTENSION_INFO, null, msgs);
			if (newCreateExtensionInfo != null)
				msgs = ((InternalEObject)newCreateExtensionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FUNCTION__CREATE_EXTENSION_INFO, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FUNCTION__RETURN_TYPE, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_EXECUTABLE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_EXECUTABLE__EXPRESSION, null, msgs);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
		{
			case XtendPackage.XTEND_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtendPackage.XTEND_FIELD__TYPE:
				return type != null;
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FIELD__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FIELD__TYPE, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FIELD__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_FIELD__INITIAL_VALUE, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (parameterType != null)
				msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_PARAMETER__PARAMETER_TYPE, null, msgs);
			if (newParameterType != null)
				msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.XTEND_PARAMETER__PARAMETER_TYPE, null, msgs);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
		{
			case XtendPackage.XTEND_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtendPackage.XTEND_PARAMETER__PARAMETER_TYPE:
				return parameterType != null;
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
				return getDeclaringType() != null;
			case XtendPackage.ANONYMOUS_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtendPackage.ANONYMOUS_CLASS__MEMBERS:
				return members != null && !members.isEmpty();
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (constructorCall != null)
				msgs = ((InternalEObject)constructorCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.ANONYMOUS_CLASS__CONSTRUCTOR_CALL, null, msgs);
			if (newConstructorCall != null)
				msgs = ((InternalEObject)newConstructorCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.ANONYMOUS_CLASS__CONSTRUCTOR_CALL, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaringType != null)
				msgs = ((InternalEObject)newDeclaringType).eInverseAdd(this, XtendPackage.XTEND_TYPE_DECLARATION__MEMBERS, XtendTypeDeclaration.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtendPackage.ANONYMOUS_CLASS__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtendPackage.ANONYMOUS_CLASS__ANNOTATION_INFO, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, ProcessedRichStringPackage.LINE__PARTS, Line.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseStartImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (ifConditionStart != null)
				msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
			if (newIfConditionStart != null)
				msgs = ((InternalEObject)newIfConditionStart).eInverseAdd(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopEndImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, ProcessedRichStringPackage.FOR_LOOP_START__END, ForLoopStart.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, ProcessedRichStringPackage.FOR_LOOP_START__END, ForLoopStart.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopStartImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, ProcessedRichStringPackage.FOR_LOOP_END__START, ForLoopEnd.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, ProcessedRichStringPackage.FOR_LOOP_END__START, ForLoopEnd.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRichString != null)
				msgs = ((InternalEObject)newRichString).eInverseAdd(this, ProcessedRichStringPackage.PROCESSED_RICH_STRING__LINES, ProcessedRichString.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseIfConditionImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (ifConditionStart != null)
				msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS, IfConditionStart.class, msgs);
			if (newIfConditionStart != null)
				msgs = ((InternalEObject)newIfConditionStart).eInverseAdd(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS, IfConditionStart.class, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
			NotificationChain msgs = null;
			if (elseStart != null)
				msgs = ((InternalEObject)elseStart).eInverseRemove(this, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
			if (newElseStart != null)
				msgs = ((InternalEObject)newElseStart).eInverseAdd(this, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
```

### ConstantValue
Condition `!processed.contains(declaredExecutable)` is always `true`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
			if (!processed.contains(declaredExecutable)) {
				List<Executable> sameErasure = bySignature.apply(declaredExecutable.getResolvedErasureSignature());
				if (sameErasure.size() > 1) {
```

### ConstantValue
Result of `processed.contains(declaredExecutable)` is always 'false'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		Set<Executable> processed = Sets.newHashSet();
		for(Executable declaredExecutable: declaredOperations) {
			if (!processed.contains(declaredExecutable)) {
				List<Executable> sameErasure = bySignature.apply(declaredExecutable.getResolvedErasureSignature());
				if (sameErasure.size() > 1) {
```

### ConstantValue
Value `grammar` is always 'null'
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/services/XtendGrammarAccess.java`
#### Snippet
```java
			}
		}
		return grammar;
	}
	
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		int numUnshownOperations = operationsMissingImplementation.size() - 3;
		if(numUnshownOperations >0)
			errorMsg.append("\nand " +  numUnshownOperations + " more.");
		List<String> uris = transform(operationsMissingImplementation, new Function<IResolvedOperation, String>() {
			@Override
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `XtendInjectorSingleton` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendInjectorSingleton.java`
#### Snippet
```java
 * @author Sven Efftinge - Initial contribution and API
 */
public class XtendInjectorSingleton {
	public final static Injector INJECTOR = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration();
}
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/Main.java`
#### Snippet
```java
 * @author Michael Clay - Initial contribution and API
 */
public class Main {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `TextLines` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/TextLines.java`
#### Snippet
```java
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class TextLines {

	public static List<TextLine> splitString(String text) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getSeverity` may produce `NullPointerException`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		@Override
		public boolean apply(Issue issue) {
			return this.severity == issue.getSeverity();
		}
	}
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		public URL apply(File from) {
			try {
				return from.toURI().toURL();
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
```

### DataFlowIssue
Argument `getClass().getResourceAsStream(path)` might be null
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
		if (path != null) {
			try {
				InputStreamReader reader = new InputStreamReader(getClass().getResourceAsStream(path), "ISO-8859-1");
				try {
					String patterns = CharStreams.toString(reader);
```

### DataFlowIssue
Method `initializePackageContents` is too complex to analyze by data flow algorithm
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
```

### DataFlowIssue
Casting `declarator` to `XtendClass` may produce `ClassCastException`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
					error("The abstract method " + function.getName() + " in type " + localClassAwareTypeNames.getReadableName(declarator) + " can only be defined by an abstract class.", 
							XTEND_FUNCTION__NAME, -1, MISSING_ABSTRACT_IN_ANONYMOUS);
				} else if (!((XtendClass) declarator).isAbstract() && !function.isNative()) {
					error("The abstract method " + function.getName() + " in type " + localClassAwareTypeNames.getReadableName(declarator) + " can only be defined by an abstract class.", 
							XTEND_FUNCTION__NAME, -1, MISSING_ABSTRACT);
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
				}
			}
			throw stringLiteralIsNotClosed(node, withoutLeadingTerminal.substring(0, withoutLeadingTerminal.length()));
		} catch (StringIndexOutOfBoundsException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `_toJavaStatement()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
	}
	
	protected void _toJavaStatement(final AnonymousClass anonymousClass, ITreeAppendable b, final boolean isReferenced) {
		_toJavaStatement(anonymousClass.getConstructorCall(), b, isReferenced);
	}
```

### MethodOverloadsParentMethod
Method `_toJavaExpression()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
	}
	
	public void _toJavaExpression(RichString richString, ITreeAppendable b) {
		b.append(getVarName(richString, b));
		if(getLightweightType(richString).isType(String.class))
```

### MethodOverloadsParentMethod
Method `_toJavaStatement()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
	}
	
	public void _toJavaStatement(RichString richString, ITreeAppendable b, boolean isReferenced) {
		LightweightTypeReference actualType = getLightweightType(richString);
		b = b.trace(richString);
```

### MethodOverloadsParentMethod
Method `_toJavaExpression()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
	}
	
	protected void _toJavaExpression(AnonymousClass anonymousClass, ITreeAppendable b) {
		String varName = getReferenceName(anonymousClass, b);
		if (varName != null) {
```

### MethodOverloadsParentMethod
Method `_computeTypes()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendTypeComputer.java`
#### Snippet
```java
	}
	
	protected void _computeTypes(RichString object, ITypeComputationState state) {
		List<XExpression> expressions = object.getExpressions();
		if (!expressions.isEmpty()) {
```

### MethodOverloadsParentMethod
Method `_computeTypes()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendTypeComputer.java`
#### Snippet
```java
	}
	
	protected void _computeTypes(RichStringForLoop object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getRawTypeForName(CharSequence.class, state);
		ITypeComputationState eachState = state.withExpectation(charSequence);
```

### MethodOverloadsParentMethod
Method `_computeTypes()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendTypeComputer.java`
#### Snippet
```java
	}
	
	protected void _computeTypes(RichStringLiteral object, ITypeComputationState state) {
		LightweightTypeReference type = getRawTypeForName(CharSequence.class, state);
		state.acceptActualType(type);
```

### MethodOverloadsParentMethod
Method `isInterface()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	}

	protected boolean isInterface(JvmDeclaredType type) {
		return type instanceof JvmGenericType && ((JvmGenericType) type).isInterface();
	}
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getComplianceLevel' is still used
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	
	@Deprecated // use getJavaSourceVersion()
	protected String getComplianceLevel() {
		return getJavaSourceVersion();
	}
```

### DeprecatedIsStillUsed
Deprecated member 'bootClassPath' is still used
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 */
	@Deprecated(since = "2.30", forRemoval = true)
	protected String bootClassPath;
	protected boolean useCurrentClassLoaderAsParent;
	protected String outputPath;
```

### DeprecatedIsStillUsed
Deprecated member 'getBootClassPathEntries' is still used
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 */
	@Deprecated(since = "2.30", forRemoval = true)
	protected List<String> getBootClassPathEntries() {
		return getDirectories(bootClassPath);
	}
```

### DeprecatedIsStillUsed
Deprecated member 'installJvmTypeProvider' is still used
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	 */
	@Deprecated
	protected void installJvmTypeProvider(ResourceSet resourceSet, File tmpClassDirectory) {
		internalInstallJvmTypeProvider(resourceSet, tmpClassDirectory, false);
	}
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/Main.java`
#### Snippet
```java
		PrintStream out = System.out;
		String allVersionQualifiers = Arrays.stream(JavaVersion.values())
				.map(v -> v.getQualifier())
				.collect(Collectors.joining(", "));
		out.println("Usage: Main <options> <source directories>");
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerAntTask.java`
#### Snippet
```java
				ex.getCause().printStackTrace();
			}
			String message = "Compilation failed: " + String.valueOf(ex.getMessage());
			if (ex.getCause() != null) {
				message += " cause: " + String.valueOf(ex.getCause().getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerAntTask.java`
#### Snippet
```java
			String message = "Compilation failed: " + String.valueOf(ex.getMessage());
			if (ex.getCause() != null) {
				message += " cause: " + String.valueOf(ex.getCause().getMessage());
			}
			throw new BuildException(message, ex);
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			transform((XtendEnumLiteral) sourceMember, (JvmEnumerationType) container);
		} else {
			throw new IllegalArgumentException("Cannot transform " + String.valueOf(sourceMember) + " to a JvmMember");
		}
	}
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
	
	protected void addIfAbsent(String value, Set<String> set) {
		if (!set.contains(value))
			set.add(value);
	}
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/IssueCodes.java`
#### Snippet
```java
	}

	protected static final String ISSUE_CODE_PREFIX = "org.eclipse.xtend.core.validation.IssueCodes.";
	public static final String JAVA_DOC_LINKING_DIAGNOSTIC = ISSUE_CODE_PREFIX + "java_doc_linking";
	public static final String ANNOTATION_WRONG_TARGET = ISSUE_CODE_PREFIX + "wrong_annotation_target";
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
		{
			if (EcoreUtil.isAncestor(this, newDeclaringType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
		{
			if (EcoreUtil.isAncestor(this, newDeclaringType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
		{
			if (EcoreUtil.isAncestor(this, newLine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
		{
			if (EcoreUtil.isAncestor(this, newRichString))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
		if (path != null) {
			try {
				InputStreamReader reader = new InputStreamReader(getClass().getResourceAsStream(path), "ISO-8859-1");
				try {
					String patterns = CharStreams.toString(reader);
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/Main.java`
#### Snippet
```java

	private static void printUsage() {
		PrintStream out = System.out;
		String allVersionQualifiers = Arrays.stream(JavaVersion.values())
				.map(v -> v.getQualifier())
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexLoader.java`
#### Snippet
```java
			boolean ok = false;
			while (!ok) {
				System.err.print("Download JFlex 1.4.3? (type 'y' or 'n' and hit enter)");
				int read = System.in.read();
				if (read == 'n') {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore.xmi.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
		// register default ePackages
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore")) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
			put("ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xmi")) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
			put("xmi", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore.xmi.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
			put("ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xmi")) Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
			put("xmi", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xtextbin")) Resource.Factory.Registry.INSTANCE.
			getExtensionToFactoryMap().put("xtextbin", new org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.resource.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
			put("xmi", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xtextbin")) Resource.Factory.Registry.INSTANCE.
			getExtensionToFactoryMap().put("xtextbin", new org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(org.eclipse.xtext.XtextPackage.eNS_URI)) EPackage.Registry.INSTANCE.put(
			org.eclipse.xtext.XtextPackage.eNS_URI, org.eclipse.xtext.XtextPackage.eINSTANCE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xtextbin")) Resource.Factory.Registry.INSTANCE.
			getExtensionToFactoryMap().put("xtextbin", new org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(org.eclipse.xtext.XtextPackage.eNS_URI)) EPackage.Registry.INSTANCE.put(
			org.eclipse.xtext.XtextPackage.eNS_URI, org.eclipse.xtext.XtextPackage.eINSTANCE);
		// // register used EPackages
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
			getExtensionToFactoryMap().put("xtextbin", new org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(org.eclipse.xtext.XtextPackage.eNS_URI)) EPackage.Registry.INSTANCE.put(
			org.eclipse.xtext.XtextPackage.eNS_URI, org.eclipse.xtext.XtextPackage.eINSTANCE);
		// // register used EPackages
		EPackage.Registry.INSTANCE.put(XtendPackage.eINSTANCE.getNsURI(), XtendPackage.eINSTANCE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendStandaloneSetup.java`
#### Snippet
```java
			getExtensionToFactoryMap().put("xtextbin", new org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(org.eclipse.xtext.XtextPackage.eNS_URI)) EPackage.Registry.INSTANCE.put(
			org.eclipse.xtext.XtextPackage.eNS_URI, org.eclipse.xtext.XtextPackage.eINSTANCE);
		// // register used EPackages
		EPackage.Registry.INSTANCE.put(XtendPackage.eINSTANCE.getNsURI(), XtendPackage.eINSTANCE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.lib.macro.services` is unnecessary and can be removed
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								}

								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFormalParameter.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFormalParameter#isExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichString.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichString()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFormalParameter.java`
#### Snippet
```java
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(boolean)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFormalParameter_Extension()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFormalParameter.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFormalParameter#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFormalParameter.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFormalParameter()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendEnumLiteral.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendEnumLiteral#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendEnumLiteral.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendEnumLiteral#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendEnumLiteral.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendEnumLiteral()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendEnumLiteral.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendEnumLiteral_Name()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendVariableDeclaration.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendVariableDeclaration#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendVariableDeclaration.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendVariableDeclaration()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendVariableDeclaration.java`
#### Snippet
```java
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(boolean)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendVariableDeclaration_Extension()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendVariableDeclaration.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendVariableDeclaration#isExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	 * @return the value of the '<em>Declaring Type</em>' container reference.
	 * @see #setDeclaringType(XtendTypeDeclaration)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendMember_DeclaringType()
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers
	 * @model opposite="members" transient="false"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	 * @see #setDeclaringType(XtendTypeDeclaration)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendMember_DeclaringType()
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendMember()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	 * @return the value of the '<em>Annotation Info</em>' containment reference.
	 * @see #setAnnotationInfo(XtendAnnotationTarget)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendMember_AnnotationInfo()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendMember.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendMember_Modifiers()
	 * @model unique="false"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.XtendMember}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.XtendMember}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendTypeDeclaration_Members()
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType
	 * @model opposite="declaringType" containment="true"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendConstructor.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendConstructor()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendTypeDeclaration_Members()
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType
	 * @model opposite="declaringType" containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendTypeDeclaration_Name()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendTypeDeclaration.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendTypeDeclaration()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendAnnotationType.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendAnnotationType()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isExtension <em>Extension</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isExtension <em>Extension</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendParameter#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendParameter()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(boolean)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendParameter_Extension()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendParameter_Name()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
	 * @return the value of the '<em>Var Arg</em>' attribute.
	 * @see #setVarArg(boolean)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendParameter_VarArg()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendParameter#isExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(JvmTypeReference)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendParameter_ParameterType()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendParameter.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName <em>Name</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getCreateExtensionInfo()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getCreateExtensionInfo_Name()
	 * @model default="it"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java
	 * @return the value of the '<em>Create Expression</em>' containment reference.
	 * @see #setCreateExpression(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getCreateExtensionInfo_CreateExpression()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/CreateExtensionInfo.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringForLoop()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
	 * @return the value of the '<em>Separator</em>' containment reference.
	 * @see #setSeparator(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringForLoop_Separator()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
	 * @return the value of the '<em>After</em>' containment reference.
	 * @see #setAfter(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringForLoop_After()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringForLoop.java`
#### Snippet
```java
	 * @return the value of the '<em>Before</em>' containment reference.
	 * @see #setBefore(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringForLoop_Before()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendAnnotationTarget.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendAnnotationTarget.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendAnnotationTarget()
 * @model abstract="true"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase.annotations.xAnnotations` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendAnnotationTarget.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendAnnotationTarget.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendAnnotationTarget_Annotations()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFunction()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(JvmTypeReference)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFunction_ReturnType()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFunction_Name()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java
	 * @return the value of the '<em>Create Extension Info</em>' containment reference.
	 * @see #setCreateExtensionInfo(CreateExtensionInfo)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFunction_CreateExtensionInfo()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFunction.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters <em>Type Parameters</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendClass()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendClass_TypeParameters()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(JvmTypeReference)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendClass_Extends()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendClass.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendClass_Implements()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getThen <em>Then</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getThen <em>Then</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringElseIf()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringElseIf_Then()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringElseIf.java`
#### Snippet
```java
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringElseIf_If()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendInterface_Extends()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendInterface_TypeParameters()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendInterface#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendInterface#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendInterface#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendInterface#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendInterface.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendInterface()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFactory.java`
#### Snippet
```java
	 * @generated
	 */
	XtendFactory eINSTANCE = org.eclipse.xtend.core.xtend.impl.XtendFactoryImpl.init();

	/**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFactory.java`
#### Snippet
```java
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.xtend.XtendPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendField_InitialValue()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(JvmTypeReference)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendField_Type()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendField_Name()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringIf()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Else Ifs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.RichStringElseIf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Ifs</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringIf_ElseIfs()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringIf_Else()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringIf_Then()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringIf.java`
#### Snippet
```java
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringIf_If()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/AnonymousClass.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.AnonymousClass#getConstructorCall <em>Constructor Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/AnonymousClass.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.AnonymousClass#getConstructorCall <em>Constructor Call</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/AnonymousClass.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getAnonymousClass()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/AnonymousClass.java`
#### Snippet
```java
	 * @return the value of the '<em>Constructor Call</em>' containment reference.
	 * @see #setConstructorCall(XConstructorCall)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getAnonymousClass_ConstructorCall()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendField.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendField()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/RichStringLiteral.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getRichStringLiteral()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.XtendParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendExecutable_Parameters()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendExecutable_TypeParameters()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getParameters <em>Parameters</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getParameters <em>Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendExecutable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendExecutable()
 * @model abstract="true"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(XExpression)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendExecutable_Expression()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendExecutable.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendExecutable_Exceptions()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendEnum.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendEnum()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
	 * @return the value of the '<em>Import Section</em>' containment reference.
	 * @see #setImportSection(XImportSection)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFile_ImportSection()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFile_Package()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Xtend Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtend Types</em>' containment reference list.
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFile_XtendTypes()
	 * @model containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.xtend.XtendPackage#getXtendFile()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendFile.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendFile#getImportSection <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFormalParameterImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFormalParameterImpl#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendAnnotationTargetImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendAnnotationTargetImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendEnumLiteralImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendEnumLiteralImpl#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getPackage <em>Package</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getPackage <em>Package</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getXtendTypes <em>Xtend Types</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getAfter <em>After</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getAfter <em>After</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl#getAfter <em>After</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendTypeDeclarationImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendTypeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendTypeDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendTypeDeclarationImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendTypeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendTypeDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getDeclaringType <em>Declaring Type</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendVariableDeclarationImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendVariableDeclarationImpl#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendClassImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendClassImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl#getThen <em>Then</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl#getThen <em>Then</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendVariableDeclaration#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendVariableDeclaration#isExtension()
	 * @see #getXtendVariableDeclaration()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator()
	 * @see #getRichStringForLoop()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.xtend.XtendFactory
 * @model kind="package"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore()
	 * @see #getRichStringForLoop()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getThen()
	 * @see #getRichStringIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getIf()
	 * @see #getRichStringIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs()
	 * @see #getRichStringIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFile#getXtendTypes <em>Xtend Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xtend Types</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getXtendTypes()
	 * @see #getXtendFile()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFormalParameter
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String For Loop</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getInitialValue()
	 * @see #getXtendField()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName()
	 * @see #getCreateExtensionInfo()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo()
	 * @see #getXtendMember()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo <em>Create Extension Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Extension Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getName()
	 * @see #getXtendFunction()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFormalParameter#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFormalParameter#isExtension()
	 * @see #getXtendFormalParameter()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#isVarArg()
	 * @see #getXtendParameter()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendEnumLiteral
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class</em>'.
	 * @see org.eclipse.xtend.core.xtend.AnonymousClass
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf#getIf()
	 * @see #getRichStringElseIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getPackage()
	 * @see #getXtendFile()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichString
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getType()
	 * @see #getXtendField()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getName()
	 * @see #getXtendTypeDeclaration()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#getName()
	 * @see #getXtendParameter()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getName()
	 * @see #getXtendField()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable#getExceptions()
	 * @see #getXtendExecutable()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationType
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xtend.core.xtend.XtendMember#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getModifiers()
	 * @see #getXtendMember()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringLiteral
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration#getMembers()
	 * @see #getXtendTypeDeclaration()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getElse()
	 * @see #getRichStringIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendEnum
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.AnonymousClass#getConstructorCall <em>Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor Call</em>'.
	 * @see org.eclipse.xtend.core.xtend.AnonymousClass#getConstructorCall()
	 * @see #getAnonymousClass()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getImplements()
	 * @see #getXtendClass()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationTarget#getAnnotations()
	 * @see #getXtendAnnotationTarget()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendInterface#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendInterface#getExtends()
	 * @see #getXtendInterface()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Target</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationTarget
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendEnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendEnumLiteral#getName()
	 * @see #getXtendEnumLiteral()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable#getTypeParameters()
	 * @see #getXtendExecutable()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendExecutable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable#getParameters()
	 * @see #getXtendExecutable()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendVariableDeclaration
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getExtends()
	 * @see #getXtendClass()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFile#getImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Section</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getImportSection()
	 * @see #getXtendFile()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Expression</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression()
	 * @see #getCreateExtensionInfo()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * @generated
	 */
	XtendPackage eINSTANCE = org.eclipse.xtend.core.xtend.impl.XtendPackageImpl.init();

	/**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendInterface
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Declaring Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getDeclaringType()
	 * @see #getXtendMember()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendExecutable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable#getExpression()
	 * @see #getXtendExecutable()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Else If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElseIfs <em>Else Ifs</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElse <em>Else</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElse <em>Else</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#getParameterType()
	 * @see #getXtendParameter()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl#getName <em>Name</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendInterface#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendInterface#getTypeParameters()
	 * @see #getXtendInterface()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf#getThen()
	 * @see #getRichStringElseIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter()
	 * @see #getRichStringForLoop()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendParameter#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#isExtension()
	 * @see #getXtendParameter()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters()
	 * @see #getXtendClass()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Extension Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo()
	 * @see #getXtendFunction()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/XtendPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getReturnType()
	 * @see #getXtendFunction()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExpression <em>Expression</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getParameters <em>Parameters</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendExecutableImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getInitialValue <em>Initial Value</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendInterfaceImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendInterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendInterfaceImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendInterfaceImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendInterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendInterfaceImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.LinePart#getLine <em>Line</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.LinePart#getLine <em>Line</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLinePart()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.Line#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java
	 * @return the value of the '<em>Line</em>' container reference.
	 * @see #setLine(Line)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLinePart_Line()
	 * @see org.eclipse.xtend.core.richstring.Line#getParts
	 * @model opposite="parts" transient="false"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LinePart.java`
#### Snippet
```java
	 * @see #setLine(Line)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLinePart_Line()
	 * @see org.eclipse.xtend.core.richstring.Line#getParts
	 * @model opposite="parts" transient="false"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ForLoopStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ForLoopStart#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ForLoopStart#getEnd <em>End</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ForLoopStart#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ForLoopStart#getEnd <em>End</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopStart()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ForLoopEnd)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopStart_End()
	 * @see org.eclipse.xtend.core.richstring.ForLoopEnd#getStart
	 * @model opposite="start"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
	 * @see #setEnd(ForLoopEnd)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopStart_End()
	 * @see org.eclipse.xtend.core.richstring.ForLoopEnd#getStart
	 * @model opposite="start"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ForLoopStart#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopStart.java`
#### Snippet
```java
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(RichStringForLoop)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopStart_Loop()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isVarArg <em>Var Arg</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isExtension <em>Extension</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isExtension <em>Extension</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl#isExtension <em>Extension</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringFactory.java`
#### Snippet
```java
	 * @generated
	 */
	ProcessedRichStringFactory eINSTANCE = org.eclipse.xtend.core.richstring.impl.ProcessedRichStringFactoryImpl.init();

	/**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringFactory.java`
#### Snippet
```java
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>If Condition Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java
	 * @return the value of the '<em>If Condition Start</em>' reference.
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseStart_IfConditionStart()
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart
	 * @model opposite="elseStart"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseStart_IfConditionStart()
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart
	 * @model opposite="elseStart"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseStart()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ForLoopStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopEnd_Start()
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart#getEnd
	 * @model opposite="end"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java
	 * @see #setStart(ForLoopStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopEnd_Start()
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart#getEnd
	 * @model opposite="end"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ForLoopEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ForLoopEnd#getStart <em>Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ForLoopEnd.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getForLoopEnd()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/EndIf.java`
#### Snippet
```java
	 * @return the value of the '<em>If Condition Start</em>' reference.
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getEndIf_IfConditionStart()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/EndIf.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.EndIf#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/EndIf.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getEndIf()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/EndIf.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.EndIf#getIfConditionStart <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Else Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * @return the value of the '<em>Else Start</em>' reference.
	 * @see #setElseStart(ElseStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_ElseStart()
	 * @see org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart
	 * @model opposite="ifConditionStart"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * @see #setElseStart(ElseStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_ElseStart()
	 * @see org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart
	 * @model opposite="ifConditionStart"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf <em>Rich String If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Else If Conditions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.ElseIfCondition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * Returns the value of the '<em><b>Else If Conditions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.ElseIfCondition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else If Conditions</em>' reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_ElseIfConditions()
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart
	 * @model opposite="ifConditionStart"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * @return the value of the '<em>Else If Conditions</em>' reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_ElseIfConditions()
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart
	 * @model opposite="ifConditionStart"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf <em>End If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf <em>End If</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf <em>End If</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf <em>End If</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * @return the value of the '<em>End If</em>' reference.
	 * @see #setEndIf(EndIf)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_EndIf()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/IfConditionStart.java`
#### Snippet
```java
	 * @return the value of the '<em>Rich String If</em>' reference.
	 * @see #setRichStringIf(RichStringIf)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getIfConditionStart_RichStringIf()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.Line}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.Line}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getProcessedRichString_Lines()
	 * @see org.eclipse.xtend.core.richstring.Line#getRichString
	 * @model opposite="richString" containment="true"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getProcessedRichString_Lines()
	 * @see org.eclipse.xtend.core.richstring.Line#getRichString
	 * @model opposite="richString" containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getLines <em>Lines</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getLines <em>Lines</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getProcessedRichString()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getRichString <em>Rich String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichString.java`
#### Snippet
```java
	 * @return the value of the '<em>Rich String</em>' reference.
	 * @see #setRichString(RichString)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getProcessedRichString_RichString()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.LinePart}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.richstring.LinePart}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLine_Parts()
	 * @see org.eclipse.xtend.core.richstring.LinePart#getLine
	 * @model opposite="line" containment="true"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLine_Parts()
	 * @see org.eclipse.xtend.core.richstring.LinePart#getLine
	 * @model opposite="line" containment="true"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>Rich String</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	 * @return the value of the '<em>Rich String</em>' container reference.
	 * @see #setRichString(ProcessedRichString)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLine_RichString()
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString#getLines
	 * @model opposite="lines" transient="false"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
	 * @see #setRichString(ProcessedRichString)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLine_RichString()
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString#getLines
	 * @model opposite="lines" transient="false"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.Line#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.Line#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Line.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLine()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/LineBreak.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLineBreak()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
	 * @return the value of the '<em>Rich String Else If</em>' reference.
	 * @see #setRichStringElseIf(RichStringElseIf)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseIfCondition_RichStringElseIf()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseIfCondition()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
	/**
	 * Returns the value of the '<em><b>If Condition Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
	 * @return the value of the '<em>If Condition Start</em>' reference.
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseIfCondition_IfConditionStart()
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions
	 * @model opposite="elseIfConditions"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ElseIfCondition.java`
#### Snippet
```java
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getElseIfCondition_IfConditionStart()
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions
	 * @model opposite="elseIfConditions"
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.Literal#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(RichStringLiteral)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLiteral_Literal()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.Literal#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.Literal#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLiteral_Offset()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLength <em>Length</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLength <em>Length</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.Literal#getLength <em>Length</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLiteral()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/Literal.java`
#### Snippet
```java
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getLiteral_Length()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/PrintedExpression.java`
#### Snippet
```java
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(XExpression)
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getPrintedExpression_Expression()
	 * @model
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/PrintedExpression.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.PrintedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/PrintedExpression.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#getPrintedExpression()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/PrintedExpression.java`
#### Snippet
```java

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.richstring.PrintedExpression#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendEnumLiteral
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendField
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XVariableDeclaration <em>XVariable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XVariableDeclaration
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmAnnotationTarget <em>Jvm Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.common.types.JvmAnnotationTarget
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendMember
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendEnum
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.RichString
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendClass
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendInterface
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.xtend.XtendPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendTypeDeclaration
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationTarget
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendExecutable
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendVariableDeclaration
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendFormalParameter
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.RichStringLiteral
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.AnonymousClass
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XStringLiteral <em>XString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XStringLiteral
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XForLoopExpression <em>XFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XForLoopExpression
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo <em>Create Extension Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBlockExpression <em>XBlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XBlockExpression
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmFormalParameter <em>Jvm Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.common.types.JvmFormalParameter
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationType
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmIdentifiableElement <em>Jvm Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.common.types.JvmIdentifiableElement
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.xbase` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XExpression
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.xtend.XtendFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.xtend.XtendFile
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.xtend.XtendPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XString Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XVariable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Extension Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getModifiers <em>Modifiers</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getDeclaringType <em>Declaring Type</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getName <em>Name</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getConstructorCall <em>Constructor Call</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getConstructorCall <em>Constructor Call</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.xtend.impl.AnonymousClassImpl#getConstructorCall <em>Constructor Call</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LinePartImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseStartImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseStartImpl#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/EndIfImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.EndIfImpl#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopEndImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ForLoopEndImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/PrintedExpressionImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.PrintedExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * @generated
	 */
	ProcessedRichStringPackage eINSTANCE = org.eclipse.xtend.core.richstring.impl.ProcessedRichStringPackageImpl.init();

	/**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.IfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition#getIfConditionStart()
	 * @see #getElseIfCondition()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.ForLoopEnd#getStart()
	 * @see #getForLoopEnd()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.ElseStart#getIfConditionStart()
	 * @see #getElseStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.EndIf#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.EndIf#getIfConditionStart()
	 * @see #getEndIf()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.EndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End If</em>'.
	 * @see org.eclipse.xtend.core.richstring.EndIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ForLoopStart#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart#getLoop()
	 * @see #getForLoopStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xtend.core.richstring.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rich String</em>'.
	 * @see org.eclipse.xtend.core.richstring.Line#getRichString()
	 * @see #getLine()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.ProcessedRichString <em>Processed Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Rich String</em>'.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String If</em>'.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getRichStringIf()
	 * @see #getIfConditionStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.ForLoopEnd <em>For Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop End</em>'.
	 * @see org.eclipse.xtend.core.richstring.ForLoopEnd
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.richstring.Literal#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.xtend.core.richstring.Literal#getLength()
	 * @see #getLiteral()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.xtend.core.richstring.Literal
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseStart()
	 * @see #getIfConditionStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString#getLines()
	 * @see #getProcessedRichString()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.richstring.Literal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.xtend.core.richstring.Literal#getOffset()
	 * @see #getLiteral()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.ForLoopStart <em>For Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.richstring.Line#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.xtend.core.richstring.Line#getParts()
	 * @see #getLine()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else If Conditions</em>'.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getElseIfConditions()
	 * @see #getIfConditionStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringFactory
 * @model kind="package"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End If</em>'.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart#getEndIf()
	 * @see #getIfConditionStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see org.eclipse.xtend.core.richstring.LineBreak
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String Else If</em>'.
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition#getRichStringElseIf()
	 * @see #getElseIfCondition()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.eclipse.xtend.core.richstring.Line
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.ElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Start</em>'.
	 * @see org.eclipse.xtend.core.richstring.ElseStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.ElseIfCondition <em>Else If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Condition</em>'.
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.PrintedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.eclipse.xtend.core.richstring.PrintedExpression#getExpression()
	 * @see #getPrintedExpression()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart#getEnd()
	 * @see #getForLoopStart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.LinePart <em>Line Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Part</em>'.
	 * @see org.eclipse.xtend.core.richstring.LinePart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xtend.core.richstring.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Line</em>'.
	 * @see org.eclipse.xtend.core.richstring.LinePart#getLine()
	 * @see #getLinePart()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.ProcessedRichString#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String</em>'.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString#getRichString()
	 * @see #getProcessedRichString()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.richstring.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.eclipse.xtend.core.richstring.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.richstring.PrintedExpression <em>Printed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/ProcessedRichStringPackage.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printed Expression</em>'.
	 * @see org.eclipse.xtend.core.richstring.PrintedExpression
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopStartImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ForLoopStartImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ForLoopStartImpl#getEnd <em>End</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopStartImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ForLoopStartImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ForLoopStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ProcessedRichStringImpl#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ProcessedRichStringImpl#getLines <em>Lines</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ProcessedRichStringImpl#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ProcessedRichStringImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LineImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LineImpl#getRichString <em>Rich String</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LineImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LineImpl#getRichString <em>Rich String</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LiteralImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLength <em>Length</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LiteralImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLength <em>Length</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LiteralImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.LiteralImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseIfConditionImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseIfConditionImpl#getRichStringElseIf <em>Rich String Else If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseIfConditionImpl#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseIfConditionImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseIfConditionImpl#getRichStringElseIf <em>Rich String Else If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.ElseIfConditionImpl#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.ForLoopStart <em>For Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.ForLoopStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.EndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.EndIf
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.LineBreak
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.PrintedExpression <em>Printed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.PrintedExpression
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.IfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.IfConditionStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.Line
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.ElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.ElseStart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.ProcessedRichString <em>Processed Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichString
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.LinePart <em>Line Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.LinePart
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.Literal
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.ElseIfCondition <em>Else If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.ElseIfCondition
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtend.core.richstring.ForLoopEnd <em>For Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtend.core.richstring.ForLoopEnd
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getEndIf <em>End If</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getEndIf <em>End If</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring.impl` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.eclipse.xtend.core.richstring.impl.IfConditionStartImpl#getEndIf <em>End If</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Condition Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printed Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processed Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#eNS_URI
	 * @see #init()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.richstring` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringPackageImpl.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtend.core.richstring.ProcessedRichStringPackage#eNS_URI
	 * @see #init()
	 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#eNS_URI
	 * @see #init()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtend.core.xtend` is unnecessary and can be removed
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendPackageImpl.java`
#### Snippet
```java
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtend.core.xtend.XtendPackage#eNS_URI
	 * @see #init()
	 * @generated
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerAntTask.java`
#### Snippet
```java
		} catch (Exception ex) {
			if (ex.getCause() != null) {
				ex.getCause().printStackTrace();
			}
			String message = "Compilation failed: " + String.valueOf(ex.getMessage());
```

## RuleId[ruleID=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
				result.getExceptions().add(jvmTypesBuilder.cloneWithProxies(declaredException));
		}
		if (commonVisibility == null)
			result.setVisibility(JvmVisibility.PUBLIC);
		else
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new IAcceptor() can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/imports/XtendImportsConfiguration.java`
#### Snippet
```java
					JvmDeclaredType declaredType = (JvmDeclaredType) inferredElement;
					locallyDefinedTypes.add(declaredType);
					addInnerTypes(declaredType, new IAcceptor<JvmDeclaredType>() {
						@Override
						public void accept(JvmDeclaredType t) {
```

### Anonymous2MethodRef
Anonymous new Comparator() can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java

	protected void sort(List<JvmOperation> operations) {
		Collections.sort(operations, new Comparator<JvmOperation>() {
			@Override
			public int compare(JvmOperation o1, JvmOperation o2) {
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	}
	
	private static final Function<String, File> TO_FILE = new Function<String, File>() {
		@Override
		public File apply(String from) {
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected void doCheckDuplicateExecutables(JvmGenericType inferredType,	final ResolvedFeatures resolvedFeatures, Set<EObject> flaggedOperations) {
		List<IResolvedOperation> declaredOperations = resolvedFeatures.getDeclaredOperations();
		doCheckDuplicateExecutables(inferredType, declaredOperations, new Function<String, List<IResolvedOperation>>() {
			@Override
			public List<IResolvedOperation> apply(String erasedSignature) {
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected String doGetReadableSignature(String simpleName, List<JvmFormalParameter> parameters) {
		return getReadableSignature(simpleName,
				Lists.transform(parameters, new Function<JvmFormalParameter, JvmTypeReference>() {
					@Override
					public JvmTypeReference apply(JvmFormalParameter from) {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java

	protected void sort(List<JvmOperation> operations) {
		Collections.sort(operations, new Comparator<JvmOperation>() {
			@Override
			public int compare(JvmOperation o1, JvmOperation o2) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
	
	public boolean isDispatcherFunction(JvmOperation inferredOperation) {
		return Iterables.any(inferredOperation.eAdapters(), new Predicate<Object>() {
			@Override
			public boolean apply(Object input) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	}
	
	private static final Function<String, File> TO_FILE = new Function<String, File>() {
		@Override
		public File apply(String from) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	private void internalInstallJvmTypeProvider(ResourceSet resourceSet, File tmpClassDirectory, boolean skipIndexLookup) {
		Iterable<String> classPathEntries = concat(asList(tmpClassDirectory.toString()), getClassPathEntries(), getSourcePathDirectories());
		classPathEntries = filter(classPathEntries, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	private static Logger log = Logger.getLogger(XtendBatchCompiler.class.getName());

	protected static final FileFilter ACCEPT_ALL_FILTER = new FileFilter() {
		@Override
		public boolean accept(File pathname) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		PathTraverser pathTraverser = new PathTraverser();
		List<String> sourcePathDirectories = getSourcePathDirectories();
		Multimap<String, URI> pathes = pathTraverser.resolvePathes(sourcePathDirectories, new Predicate<URI>() {
			@Override
			public boolean apply(URI input) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	};
	
	private static final Function<File, URL> TO_URL= new Function<File, URL>() {
		@Override
		public URL apply(File from) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		}
		final List<String> split = split(emptyIfNull(path), File.pathSeparator);
		return transform(split, new Function<String, String>() {
			@Override
			public String apply(String from) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		}
		List<String> sourceDirectories = newArrayList(sourcePathDirectories);
		commandLine.add(concat(" ", transform(sourceDirectories, new Function<String, String>() {
			@Override
			public String apply(String path) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		for (DispatchHelper.DispatchSignature signature : methods.keySet()) {
			List<JvmOperation> operations = methods.get(signature);
			Iterable<JvmOperation> localOperations = Iterables.filter(operations, new Predicate<JvmOperation>() {
				@Override
				public boolean apply(JvmOperation input) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			final JvmAnnotationType annotation = typesFactory.createJvmAnnotationType();
			if (!preIndexingPhase) {
				doLater.add(new Runnable() {
					@Override
					public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			copyTypeParameters(xtendClass.getTypeParameters(), javaType);
			if (!preIndexingPhase) {
				doLater.add(new Runnable() {
					@Override
					public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			copyTypeParameters(xtendInterface.getTypeParameters(), javaType);
			if (!preIndexingPhase) {
				doLater.add(new Runnable() {
					@Override
					public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			final JvmEnumerationType javaType = typesFactory.createJvmEnumerationType();
			if (!preIndexingPhase) {
				doLater.add(new Runnable() {
					@Override
					public void run() {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
	}
	
	private Predicate<XAnnotation> annotationTranslationFilter = new Predicate<XAnnotation>() {
		@Override
		public boolean apply(/* @Nullable */ XAnnotation annotation) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		if (!preIndexingPhase) {
			final ActiveAnnotationContexts finalContexts = contexts;
			Runnable lateInit = new Runnable() {

				@Override
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected void doCheckDuplicateExecutables(JvmGenericType inferredType,	final ResolvedFeatures resolvedFeatures, Set<EObject> flaggedOperations) {
		List<IResolvedOperation> declaredOperations = resolvedFeatures.getDeclaredOperations();
		doCheckDuplicateExecutables(inferredType, declaredOperations, new Function<String, List<IResolvedOperation>>() {
			@Override
			public List<IResolvedOperation> apply(String erasedSignature) {
```

### Convert2Lambda
Anonymous new Function\>() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		}, flaggedOperations);
		final List<IResolvedConstructor> declaredConstructors = resolvedFeatures.getDeclaredConstructors();
		doCheckDuplicateExecutables(inferredType, declaredConstructors, new Function<String, List<IResolvedConstructor>>() {
			@Override
			public List<IResolvedConstructor> apply(String erasedSignature) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		
		ImmutableListMultimap<String, XAnnotation> groupByIdentifier = Multimaps.index(annotationTarget.getAnnotations(),
				new Function<XAnnotation, String>() {
					@Override
					public String apply(XAnnotation input) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
		if(numUnshownOperations >0)
			errorMsg.append("\nand " +  numUnshownOperations + " more.");
		List<String> uris = transform(operationsMissingImplementation, new Function<IResolvedOperation, String>() {
			@Override
			public String apply(IResolvedOperation from) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	protected String doGetReadableSignature(String simpleName, List<JvmFormalParameter> parameters) {
		return getReadableSignature(simpleName,
				Lists.transform(parameters, new Function<JvmFormalParameter, JvmTypeReference>() {
					@Override
					public JvmTypeReference apply(JvmFormalParameter from) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
							Collection<JvmOperation> ops = signatures.get(paramTypes);
							if (ops.size() > 1) {
								if (Iterables.any(ops, new Predicate<JvmOperation>() {
									@Override
									public boolean apply(JvmOperation input) {
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected boolean isRelevantAnnotationTarget(final XtendAnnotationTarget annotationTarget) {
		return any(targetInfos.keySet(), new Predicate<Class<?>>() {
			@Override
			public boolean apply(Class<?> input) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `result`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/AbstractKnownTypesScope.java`
#### Snippet
```java
			// TODO handle ambiguous types
			for(JvmMember member: declaredType.findAllNestedTypesByName(simpleName)) {
				result = (JvmType) member;
				break;
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `object`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
					}
				}
				object = container;
			} while (considerContainer);
			return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java
	public void _toJavaStatement(RichString richString, ITreeAppendable b, boolean isReferenced) {
		LightweightTypeReference actualType = getLightweightType(richString);
		b = b.trace(richString);
		if (actualType.isType(StringConcatenationClient.class)) {
			String resultVariableName = b.declareSyntheticVariable(richString, "_client");
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java

	protected int getMaxDistanceToObject(JvmTypeReference type) {
		type = primitives.asWrapperTypeIfPrimitive(type);
		if (typeRefs.is(type, Object.class))
			return 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
		try {
			if (string.charAt(0) == '^') {
				string = string.substring(1);
			}
			String result = convertFromJavaIdentifier(string, node);
```

### AssignmentToMethodParameter
Assignment to method parameter `current`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
			return candidate;
		if (current == null || current.length() > candidate.length())
			current = candidate;
		return current;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFileImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_FILE__IMPORT_SECTION, oldImportSection, newImportSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_FOR_LOOP__AFTER, oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_FOR_LOOP__SEPARATOR, oldSeparator, newSeparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringForLoopImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_FOR_LOOP__BEFORE, oldBefore, newBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
			case XtendPackage.XTEND_MEMBER__DECLARING_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaringType((XtendTypeDeclaration)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_MEMBER__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
	public NotificationChain basicSetDeclaringType(XtendTypeDeclaration newDeclaringType, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDeclaringType, XtendPackage.XTEND_MEMBER__DECLARING_TYPE, msgs);
		return msgs;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendClassImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_CLASS__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_ELSE_IF__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringElseIfImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_ELSE_IF__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_IF__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_IF__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/RichStringIfImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.RICH_STRING_IF__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/CreateExtensionInfoImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, oldCreateExpression, newCreateExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_FUNCTION__CREATE_EXTENSION_INFO, oldCreateExtensionInfo, newCreateExtensionInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFunctionImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendExecutableImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_EXECUTABLE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_FIELD__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFieldImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendParameterImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.XTEND_PARAMETER__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.ANONYMOUS_CLASS__CONSTRUCTOR_CALL, oldConstructorCall, newConstructorCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
	public NotificationChain basicSetDeclaringType(XtendTypeDeclaration newDeclaringType, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDeclaringType, XtendPackage.ANONYMOUS_CLASS__DECLARING_TYPE, msgs);
		return msgs;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtendPackage.ANONYMOUS_CLASS__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
			case XtendPackage.ANONYMOUS_CLASS__DECLARING_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaringType((XtendTypeDeclaration)otherEnd, msgs);
			case XtendPackage.ANONYMOUS_CLASS__MEMBERS:
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.LINE_PART__LINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLine((Line)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newLine, ProcessedRichStringPackage.LINE_PART__LINE, msgs);
		return msgs;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseStartImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START:
				if (ifConditionStart != null)
					msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, IfConditionStart.class, msgs);
				return basicSetIfConditionStart((IfConditionStart)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseStartImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, oldIfConditionStart, newIfConditionStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopEndImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.FOR_LOOP_END__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, ProcessedRichStringPackage.FOR_LOOP_START__END, ForLoopStart.class, msgs);
				return basicSetStart((ForLoopStart)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopEndImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.FOR_LOOP_END__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopStartImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.FOR_LOOP_START__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ForLoopStartImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.FOR_LOOP_START__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, ProcessedRichStringPackage.FOR_LOOP_END__START, ForLoopEnd.class, msgs);
				return basicSetEnd((ForLoopEnd)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `computedTypes`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
					wrapped.add(computedTypes.get(i).getWrapperTypeIfPrimitive());
				}
				computedTypes = wrapped;
			}
			if (computedTypes.isEmpty() && implicitVoidOrNull != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resolvedTypes`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			JvmOperation operation, Map<JvmIdentifiableElement, ResolvedTypes> resolvedTypesByContext) {
		super._doPrepare(resolvedTypes, featureScopeSession, operation, resolvedTypesByContext);
		resolvedTypes = resolvedTypesByContext.get(operation);
		if (dispatchHelper.isDispatcherFunction(operation)) {
			List<JvmFormalParameter> parameters = operation.getParameters();
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.LINE__RICH_STRING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRichString((ProcessedRichString)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
	public NotificationChain basicSetRichString(ProcessedRichString newRichString, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newRichString, ProcessedRichStringPackage.LINE__RICH_STRING, msgs);
		return msgs;
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseIfConditionImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.ELSE_IF_CONDITION__IF_CONDITION_START:
				if (ifConditionStart != null)
					msgs = ((InternalEObject)ifConditionStart).eInverseRemove(this, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS, IfConditionStart.class, msgs);
				return basicSetIfConditionStart((IfConditionStart)otherEnd, msgs);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ElseIfConditionImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.ELSE_IF_CONDITION__IF_CONDITION_START, oldIfConditionStart, newIfConditionStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START, oldElseStart, newElseStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/IfConditionStartImpl.java`
#### Snippet
```java
			case ProcessedRichStringPackage.IF_CONDITION_START__ELSE_START:
				if (elseStart != null)
					msgs = ((InternalEObject)elseStart).eInverseRemove(this, ProcessedRichStringPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
				return basicSetElseStart((ElseStart)otherEnd, msgs);
			case ProcessedRichStringPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/xtend/impl/XtendMemberImplCustom.java`
#### Snippet
```java
				return JvmVisibility.PRIVATE;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/naming/XtendQualifiedNameProvider.java`
#### Snippet
```java
	protected QualifiedName concatNames(EObject obj, String name) {
		if (name == null)
			return null;
		QualifiedName parentName = getFullyQualifiedName(obj.eContainer());
		if (parentName == null)
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/naming/XtendQualifiedNameProvider.java`
#### Snippet
```java
		QualifiedName parentName = getFullyQualifiedName(obj.eContainer());
		if (parentName == null)
			return null;
		return parentName.append(name);
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/naming/XtendQualifiedNameProvider.java`
#### Snippet
```java
			if(typeDecl.eContainer() instanceof XtendFile) {
				if (typeName == null)
					return null;
				XtendFile file = (XtendFile) typeDecl.eContainer();
				String packageName = file.getPackage();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/naming/XtendQualifiedNameProvider.java`
#### Snippet
```java
			return concatNames(obj, ((XtendEnumLiteral) obj).getName());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/AbstractScope.java`
#### Snippet
```java
			return result;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/AbstractKnownTypesScope.java`
#### Snippet
```java
	protected JvmType getUnambiguousResult(JvmType current, int currentIndex, JvmType next, int nextIndex, QualifiedName name) {
		if (current != null && current != next) {
			return null;
		}
		return next;
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/AbstractKnownTypesScope.java`
#### Snippet
```java
			}
			if (declaredType == result) {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/imports/XtendImportsConfiguration.java`
#### Snippet
```java
		XtendFile xtendFile = getXtendFile(xtextResource);
		if (xtendFile == null) {
			return null;
		}
		return xtendFile.getPackage();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/imports/XtendImportsConfiguration.java`
#### Snippet
```java
			return xtendFile.getImportSection();
		else
			return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/imports/XtendImportsConfiguration.java`
#### Snippet
```java
	protected XtendFile getXtendFile(XtextResource resource) {
		if(resource == null || resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof XtendFile))
			return null;
		else 
			return (XtendFile) resource.getContents().get(0);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/imports/XtendImportsConfiguration.java`
#### Snippet
```java
	protected String getCommonPackageName(XtextResource resource) {
		XtendFile xtendFile = getXtendFile(resource);
		return xtendFile == null ? null : xtendFile.getPackage();
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LocalResourceFilteringTypeScope.java`
#### Snippet
```java
	public IEObjectDescription getSingleElement(QualifiedName name, boolean binary) {
		if (isFiltered(name)) {
			return null;
		}
		return delegate.getSingleElement(name, binary);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeScopeWithWildcardImports.java`
#### Snippet
```java
							result = candidate;
						} else {
							return null;
						}
					}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/TypeParameterScope.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LegacyKnownTypesScope.java`
#### Snippet
```java
			if (isLegacyMatch(currentIndex, relativeName)) {
				if (isLegacyMatch(nextIndex, relativeName)) {
					return null;
				} else {
					JvmType realNextType = findNestedType(next, nextIndex, relativeName);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
				JvmType resolved = getUnambiguousResult(result, index, type, i, name);
				if (resolved == null) {
					return null;
				}
				if (resolved != result) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
		String qn = type.getQualifiedName();
		if (Strings.isEmpty(qn)) {
			return null;
		}
		QualifiedName typeName = QualifiedName.create(Strings.split(qn, '.'));
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/LegacyKnownTypesScope.java`
#### Snippet
```java
				}
			}
			return null;
		}
		return next;
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/CachingTypeScope.java`
#### Snippet
```java
		if (cached == null) {
			if (cache.containsKey(name)) {
				return null;
			}
			cached = parent.getSingleElement(name);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/NestedTypesScope.java`
#### Snippet
```java
		JvmDeclaredType superType = typeScopeProvider.getSuperTypeOfLocalTypeNonResolving(localType);
		if (superType == null) {
			return null;
		}
		return doGetSingleElement(superType, name, firstSegment, dollarIndex);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/NestedTypesScope.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/NestedTypesScope.java`
#### Snippet
```java
			}
		}
		return null;
	}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/AnonymousClassUtil.java`
#### Snippet
```java
			return (JvmDeclaredType) EcoreUtil.resolve(type, anonymousClass);
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/AnonymousClassUtil.java`
#### Snippet
```java
				return (JvmGenericType) superType;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/AnonymousClassUtil.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
			if (primarySourceElement instanceof XtendField)
				return (XtendField) primarySourceElement;
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
			if (primarySourceElement instanceof AnonymousClass) 
				return (AnonymousClass) primarySourceElement;
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		protected <T> T getFirstOrNull(Iterable<EObject> elements, Class<T> type) {
			Iterator<T> iterator = filter(elements, type).iterator();
			return iterator.hasNext() ? iterator.next() : null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
			if (primarySourceElement instanceof XtendInterface) 
				return (XtendInterface) primarySourceElement;
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		protected JvmIdentifiableElement getLogicalContainer(EObject object, boolean considerContainer) {
			if (object == null) {
				return null;
			}
			final Map<EObject, JvmIdentifiableElement> mapping = getLogicalContainerMapping(object.eResource());
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
				EObject container = object.eContainer();
				if (container == null) {
					return null;
				}
				if (object instanceof XtendMember) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
						XtendMember member = (XtendMember) container;
						if (member.getAnnotationInfo() != object) {
							return null;
						}
					} else if (!(object instanceof AnonymousClass)) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
						}
					} else if (!(object instanceof AnonymousClass)) {
						return null;
					}
				}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
				object = container;
			} while (considerContainer);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		public XtendConstructor getXtendConstructor(JvmConstructor jvmConstructor) {
			EObject primarySourceElement = getPrimarySourceElement(jvmConstructor);
			return primarySourceElement instanceof XtendConstructor ? (XtendConstructor) primarySourceElement : null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
			if (primarySourceElement instanceof XtendClass) 
				return (XtendClass) primarySourceElement;
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
			if (iterator.hasNext())
				return iterator.next();
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
				}
			}
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
			return result;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			if (string.charAt(0) == '^') {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
		// no line breaks or immediately closed string literal => no initial indentation
		if (lines.size() <= 1) {
			return null;
		}
		TextLine firstLine = lines.get(0);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/InitialTemplateIndentationComputer.java`
#### Snippet
```java
		// first line has content == no initial indentation
		if (!firstLine.containsOnlyWhitespace()) { 
			return null;
		}
		String result = null;
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			String leadingTerminal = getLeadingTerminal();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			boolean preIndexingPhase, XtendFile xtendFile, List<Runnable> doLater) {
		if (Strings.isEmpty(declaration.getName()))
			return null;
		
		if (declaration instanceof XtendAnnotationType) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			return javaType;
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		final Iterator<JvmOperation> iterator = localOperations.iterator();
		if (!iterator.hasNext())
			return null;
		JvmOperation first = iterator.next();
		JvmOperation result = typesFactory.createJvmOperation();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendMemberImpl.java`
#### Snippet
```java
	public XtendTypeDeclaration getDeclaringType()
	{
		if (eContainerFeatureID() != XtendPackage.XTEND_MEMBER__DECLARING_TYPE) return null;
		return (XtendTypeDeclaration)eInternalContainer();
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendEnumLiteralAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendFieldAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXVariableDeclarationAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createJvmAnnotationTargetAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendMemberAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendFunctionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendEnumAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createRichStringAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createRichStringIfAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendClassAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendInterfaceAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendTypeDeclarationAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendAnnotationTargetAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendExecutableAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendVariableDeclarationAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendFormalParameterAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createRichStringLiteralAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createAnonymousClassAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXStringLiteralAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXForLoopExpressionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createRichStringElseIfAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createCreateExtensionInfoAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXBlockExpressionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createRichStringForLoopAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendConstructorAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createEObjectAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createJvmFormalParameterAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendAnnotationTypeAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendParameterAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createJvmIdentifiableElementAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXExpressionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendAdapterFactory.java`
#### Snippet
```java
	public Adapter createXtendFileAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendAnnotationTarget(XtendAnnotationTarget object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXForLoopExpression(XForLoopExpression object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendEnum(XtendEnum object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXExpression(XExpression object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendFunction(XtendFunction object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseJvmIdentifiableElement(JvmIdentifiableElement object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendConstructor(XtendConstructor object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseRichString(RichString object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendAnnotationType(XtendAnnotationType object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendTypeDeclaration(XtendTypeDeclaration object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendInterface(XtendInterface object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXStringLiteral(XStringLiteral object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendFile(XtendFile object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXVariableDeclaration(XVariableDeclaration object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseRichStringIf(RichStringIf object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T defaultCase(EObject object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendFormalParameter(XtendFormalParameter object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseJvmFormalParameter(JvmFormalParameter object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendField(XtendField object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseRichStringElseIf(RichStringElseIf object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendMember(XtendMember object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendClass(XtendClass object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXBlockExpression(XBlockExpression object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseCreateExtensionInfo(CreateExtensionInfo object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendParameter(XtendParameter object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendExecutable(XtendExecutable object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseRichStringLiteral(RichStringLiteral object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseRichStringForLoop(RichStringForLoop object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseJvmAnnotationTarget(JvmAnnotationTarget object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendEnumLiteral(XtendEnumLiteral object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseXtendVariableDeclaration(XtendVariableDeclaration object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/util/XtendSwitch.java`
#### Snippet
```java
	public T caseAnonymousClass(AnonymousClass object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/AnonymousClassImpl.java`
#### Snippet
```java
	public XtendTypeDeclaration getDeclaringType()
	{
		if (eContainerFeatureID() != XtendPackage.ANONYMOUS_CLASS__DECLARING_TYPE) return null;
		return (XtendTypeDeclaration)eInternalContainer();
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LinePartImpl.java`
#### Snippet
```java
	public Line getLine()
	{
		if (eContainerFeatureID() != ProcessedRichStringPackage.LINE_PART__LINE) return null;
		return (Line)eInternalContainer();
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			ResolvedTypes resolvedTypes, IFeatureScopeSession session) {
		if (operation.getVisibility() == JvmVisibility.PRIVATE)
			return null;
		if (InferredTypeIndicator.isInferred(operation.getReturnType())) {
			LightweightTypeReference declaringType = resolvedTypes.getActualType(operation.getDeclaringType());
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			List<IResolvedOperation> overriddenMethods = resolvedOperation.getOverriddenAndImplementedMethods();
			if (overriddenMethods.isEmpty())
				return null;
			IResolvedOperation overriddenMethod = overriddenMethods.get(0);
			JvmOperation declaration = overriddenMethod.getDeclaration();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=439535
			if (inferredFrom != null && (inferredFrom == getInferredFrom(operation.getReturnType()) || isHandled(inferredFrom))) {
				return null;
			}
			LightweightTypeReference result = overriddenMethod.getResolvedReturnType();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			return result;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			candidate = candidate.eContainer();
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
				TypeConformanceComputer conformanceComputer = typeResolver.getServices().getTypeConformanceComputer();
				if (types.isEmpty())
					return null;
				LightweightTypeReference result = conformanceComputer.getCommonSuperType(types, resolvedTypes.getReferenceOwner());
				if (result == null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
				}
				if (actualType == null)
					return null;
				// actualType may not be java compliant but still carry more information than the
				// java compliant reference
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
					variable.getSimpleName());
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/LineImpl.java`
#### Snippet
```java
	public ProcessedRichString getRichString()
	{
		if (eContainerFeatureID() != ProcessedRichStringPackage.LINE__RICH_STRING) return null;
		return (ProcessedRichString)eInternalContainer();
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createPrintedExpressionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createIfConditionStartAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createLineAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createForLoopStartAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createElseStartAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createProcessedRichStringAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createLinePartAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createEObjectAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createEndIfAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createLiteralAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createElseIfConditionAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createForLoopEndAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringAdapterFactory.java`
#### Snippet
```java
	public Adapter createLineBreakAdapter()
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseEndIf(EndIf object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseIfConditionStart(IfConditionStart object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T casePrintedExpression(PrintedExpression object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseLiteral(Literal object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseElseIfCondition(ElseIfCondition object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseForLoopStart(ForLoopStart object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseLine(Line object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T defaultCase(EObject object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseLinePart(LinePart object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseForLoopEnd(ForLoopEnd object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseLineBreak(LineBreak object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseElseStart(ElseStart object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/util/ProcessedRichStringSwitch.java`
#### Snippet
```java
	public T caseProcessedRichString(ProcessedRichString object)
	{
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java

	protected String canonicalName(JvmIdentifiableElement element) {
		return (element != null) ? notNull(element.getIdentifier()) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			return XTEND_FUNCTION__RETURN_TYPE;
		else
			return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			return XTEND_FUNCTION__NAME;
		else if(member instanceof XtendConstructor)
			return null;
		else if(member instanceof XtendField)
			return XTEND_FIELD__NAME;
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			return XTEND_FIELD__NAME;
		else
			return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			return batchTypeResolver.resolveTypes(operation).getActualType(operation);
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			return XTEND_EXECUTABLE__EXCEPTIONS;
		else
			return null;
	}
	
```

### ReturnNull
Return of `null`
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/contentassist/antlr/FlexerBasedContentAssistParser.java`
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
in `org.eclipse.xtend.core/src-gen/org/eclipse/xtend/core/services/XtendGrammarAccess.java`
#### Snippet
```java
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `parseResult` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/parser/CustomXtendParser.java`
#### Snippet
```java
	@Override
	public IParseResult parse(ParserRule rule, Reader reader) {
		IParseResult parseResult = parse(rule.getName(), new ReaderCharStream(reader));
		return parseResult;
	}
```

### UnnecessaryLocalVariable
Local variable `parseResult` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/parser/CustomXtendParser.java`
#### Snippet
```java
		NodeModelBuilder builder = createNodeModelBuilder();
		builder.setForcedFirstGrammarElement(ruleCall);
		IParseResult parseResult = doParse(ruleCall.getRule().getName(), new ReaderCharStream(reader), builder, initialLookAhead);
		return parseResult;
	}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/KnownTypesScope.java`
#### Snippet
```java
		}
		if (name.startsWith(typeName)) {
			JvmType result = findNestedType(type, index, name.skipFirst(typeName.getSegmentCount()-1));
			return result;
		}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/UnicodeAwarePostProcessor.java`
#### Snippet
```java
				});
			} else {
				String result = replaceLineSeparatorsAndEscapeChars(content, lineSeparator, encoder);
				return result;
			}
```

### UnnecessaryLocalVariable
Local variable `strategy` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendCompileStrategies.java`
#### Snippet
```java

	public Procedures.Procedure1<ITreeAppendable> forCacheVariable(XtendFunction function) {
		CacheVariableCompileStrategy strategy = cacheVarProvider.get();
		return strategy;
	}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
							List<Problem> result = Lists.newArrayList(Iterables.transform(issues, new Function<EObjectDiagnosticImpl, Problem>() {

								@Override
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								@Override
								public Problem apply(EObjectDiagnosticImpl diag) {
									ProblemImpl result = new ProblemImpl(diag.getCode(), diag.getMessage(), translateSeverity(diag.getSeverity()));
									return result;
								}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmAnnotationType getInferredAnnotationType(XtendAnnotationType xtendAnnotation) {
			final JvmAnnotationType firstOrNull = getFirstOrNull(getJvmElements(xtendAnnotation), JvmAnnotationType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmDeclaredType getInferredType(XtendTypeDeclaration xtendType) {
			final JvmDeclaredType firstOrNull = getFirstOrNull(getJvmElements(xtendType), JvmDeclaredType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmEnumerationType getInferredEnumerationType(XtendEnum xtendEnum) {
			final JvmEnumerationType firstOrNull = getFirstOrNull(getJvmElements(xtendEnum), JvmEnumerationType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmGenericType getInferredType(AnonymousClass anonymousClass) {
			final JvmGenericType firstOrNull = getFirstOrNull(getJvmElements(anonymousClass), JvmGenericType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmConstructor getInferredConstructor(XtendClass xtendClass) {
			final JvmConstructor firstOrNull = getFirstOrNull(getJvmElements(xtendClass), JvmConstructor.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmGenericType getInferredType(XtendInterface xtendInterface) {
			final JvmGenericType firstOrNull = getFirstOrNull(getJvmElements(xtendInterface), JvmGenericType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmConstructor getInferredConstructor(XtendConstructor xtendConstructor) {
			final JvmConstructor firstOrNull = getFirstOrNull(getJvmElements(xtendConstructor), JvmConstructor.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `firstOrNull` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/IXtendJvmAssociations.java`
#### Snippet
```java
		@Override
		public JvmGenericType getInferredType(XtendClass xtendClass) {
			final JvmGenericType firstOrNull = getFirstOrNull(getJvmElements(xtendClass), JvmGenericType.class);
			return firstOrNull;
		}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/DispatchHelper.java`
#### Snippet
```java
		} else {
			DispatchSignature signature = new DispatchSignature(dispatchCase.getSimpleName().substring(1), dispatchCase.getParameters().size());
			JvmOperation result = getDispatcherOperation(dispatchCase.getDeclaringType(), signature);
			return result;
		}
```

### UnnecessaryLocalVariable
Local variable `scope` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
				//TODO this scope doesn't support binary syntax for inner types. It should be a KnownTypes scope which doesn't allow simple names
				// Unfortunately I cannot use a RecordingTypeScope as a parent as it is not compatible...
				IScope scope = SelectableBasedScope.createScope(recordingTypeScope, getAllDescriptions(resource), reference.getEReferenceType(), false);
				return scope;
			}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
			// this is not called from the type resolution where we want to allow constructors to link to interfaces
			// in order to improve the error message, therefore we use a strict wrapper here
			IScope result = new ConstructorTypeScopeWrapper(context, IVisibilityHelper.ALL, typeScope, true /* strict scope */);
			return result;
		} else {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
	protected XtendFile getXtendFile(final EObject context) {
		Resource resource = context.eResource();
		XtendFile result = (XtendFile) resource.getContents().get(0);
		return result;
	}
```

### UnnecessaryLocalVariable
Local variable `caching` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/scoping/XtendImportedNamespaceScopeProvider.java`
#### Snippet
```java
					AbstractScope localTypes = getResourceTypeScope(xtendFile.eResource(), xtendFile.getPackage(), importScope);
					AbstractScope primitiveAware = new PrimitiveAwareScope(localTypes, typeScope);
					AbstractScope caching = new CachingTypeScope(primitiveAware);
					return caching;
				}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/JavaIDValueConverter.java`
#### Snippet
```java
				string = string.substring(1);
			}
			String result = convertFromJavaIdentifier(string, node);
			return result;
		} catch (IllegalArgumentException e) {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/TextLine.java`
#### Snippet
```java
		if (length == 0)
			return false;
		boolean result = Character.isWhitespace(charAt(0));
		return result;
	}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/conversion/AbstractRichTextValueConverter.java`
#### Snippet
```java
			String trailingTerminal = getTrailingTerminal();
			if (withoutLeadingTerminal.endsWith(trailingTerminal)) {
				String result = withoutLeadingTerminal.substring(0, withoutLeadingTerminal.length() - trailingTerminal.length());
				return result;	
			}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/richstring/RichStringProcessor.java`
#### Snippet
```java
			InitialTemplateIndentationComputer computer = new InitialTemplateIndentationComputer(
					indentationHandler.getTotalIndentation());
			String result = computer.doSwitch(object);
			return result;
		}
```

### UnnecessaryLocalVariable
Local variable `xtendFile` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
			EObject model = parseResult.getRootASTElement();
			if (model instanceof XtendFile) {
				XtendFile xtendFile = (XtendFile) model;
				return xtendFile;
			}
```

### UnnecessaryLocalVariable
Local variable `matches` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
			@Override
			public boolean apply(URI input) {
				boolean matches = nameBasedFilter.matches(input);
				return matches;
			}
```

### UnnecessaryLocalVariable
Local variable `anonymousClass` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public AnonymousClass createAnonymousClass()
	{
		AnonymousClassImplCustom anonymousClass = new AnonymousClassImplCustom();
		return anonymousClass;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendAnnotationType` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendAnnotationType createXtendAnnotationType()
	{
		XtendAnnotationTypeImplCustom xtendAnnotationType = new XtendAnnotationTypeImplCustom();
		return xtendAnnotationType;
	}
```

### UnnecessaryLocalVariable
Local variable `richStringIf` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public RichStringIf createRichStringIf()
	{
		RichStringIfImpl richStringIf = new RichStringIfImpl();
		return richStringIf;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendFile` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendFile createXtendFile()
	{
		XtendFileImpl xtendFile = new XtendFileImpl();
		return xtendFile;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendField` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendField createXtendField()
	{
		XtendFieldImplCustom xtendField = new XtendFieldImplCustom();
		return xtendField;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendEnumLiteral` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendEnumLiteral createXtendEnumLiteral()
	{
		XtendEnumLiteralImplCustom xtendEnumLiteral = new XtendEnumLiteralImplCustom();
		return xtendEnumLiteral;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendConstructor` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendConstructor createXtendConstructor()
	{
		XtendConstructorImpl xtendConstructor = new XtendConstructorImpl();
		return xtendConstructor;
	}
```

### UnnecessaryLocalVariable
Local variable `richStringElseIf` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public RichStringElseIf createRichStringElseIf()
	{
		RichStringElseIfImpl richStringElseIf = new RichStringElseIfImpl();
		return richStringElseIf;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendEnum` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendEnum createXtendEnum()
	{
		XtendEnumImplCustom xtendEnum = new XtendEnumImplCustom();
		return xtendEnum;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendClass` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendClass createXtendClass()
	{
		XtendClassImplCustom xtendClass = new XtendClassImplCustom();
		return xtendClass;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendParameter` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendParameter createXtendParameter()
	{
		XtendParameterImpl xtendParameter = new XtendParameterImpl();
		return xtendParameter;
	}
```

### UnnecessaryLocalVariable
Local variable `richString` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public RichString createRichString()
	{
		RichStringImpl richString = new RichStringImpl();
		return richString;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendFunction` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendFunction createXtendFunction()
	{
		XtendFunctionImplCustom xtendFunction = new XtendFunctionImplCustom();
		return xtendFunction;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendMember` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendMember createXtendMember()
	{
		XtendMemberImplCustom xtendMember = new XtendMemberImplCustom();
		return xtendMember;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendFormalParameter` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendFormalParameter createXtendFormalParameter()
	{
		XtendFormalParameterImpl xtendFormalParameter = new XtendFormalParameterImpl();
		return xtendFormalParameter;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendVariableDeclaration` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendVariableDeclaration createXtendVariableDeclaration()
	{
		XtendVariableDeclarationImpl xtendVariableDeclaration = new XtendVariableDeclarationImpl();
		return xtendVariableDeclaration;
	}
```

### UnnecessaryLocalVariable
Local variable `createExtensionInfo` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public CreateExtensionInfo createCreateExtensionInfo()
	{
		CreateExtensionInfoImpl createExtensionInfo = new CreateExtensionInfoImpl();
		return createExtensionInfo;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendInterface` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendInterface createXtendInterface()
	{
		XtendInterfaceImplCustom xtendInterface = new XtendInterfaceImplCustom();
		return xtendInterface;
	}
```

### UnnecessaryLocalVariable
Local variable `richStringLiteral` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public RichStringLiteral createRichStringLiteral()
	{
		RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
		return richStringLiteral;
	}
```

### UnnecessaryLocalVariable
Local variable `richStringForLoop` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public RichStringForLoop createRichStringForLoop()
	{
		RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
		return richStringForLoop;
	}
```

### UnnecessaryLocalVariable
Local variable `xtendTypeDeclaration` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/xtend/impl/XtendFactoryImpl.java`
#### Snippet
```java
	public XtendTypeDeclaration createXtendTypeDeclaration()
	{
		XtendTypeDeclarationImplCustom xtendTypeDeclaration = new XtendTypeDeclarationImplCustom();
		return xtendTypeDeclaration;
	}
```

### UnnecessaryLocalVariable
Local variable `forLoopEnd` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public ForLoopEnd createForLoopEnd()
	{
		ForLoopEndImpl forLoopEnd = new ForLoopEndImpl();
		return forLoopEnd;
	}
```

### UnnecessaryLocalVariable
Local variable `processedRichString` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public ProcessedRichString createProcessedRichString()
	{
		ProcessedRichStringImpl processedRichString = new ProcessedRichStringImpl();
		return processedRichString;
	}
```

### UnnecessaryLocalVariable
Local variable `linePart` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public LinePart createLinePart()
	{
		LinePartImpl linePart = new LinePartImpl();
		return linePart;
	}
```

### UnnecessaryLocalVariable
Local variable `elseStart` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public ElseStart createElseStart()
	{
		ElseStartImpl elseStart = new ElseStartImpl();
		return elseStart;
	}
```

### UnnecessaryLocalVariable
Local variable `endIf` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public EndIf createEndIf()
	{
		EndIfImpl endIf = new EndIfImpl();
		return endIf;
	}
```

### UnnecessaryLocalVariable
Local variable `literal` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public Literal createLiteral()
	{
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}
```

### UnnecessaryLocalVariable
Local variable `printedExpression` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public PrintedExpression createPrintedExpression()
	{
		PrintedExpressionImpl printedExpression = new PrintedExpressionImpl();
		return printedExpression;
	}
```

### UnnecessaryLocalVariable
Local variable `line` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public Line createLine()
	{
		LineImpl line = new LineImpl();
		return line;
	}
```

### UnnecessaryLocalVariable
Local variable `forLoopStart` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public ForLoopStart createForLoopStart()
	{
		ForLoopStartImpl forLoopStart = new ForLoopStartImpl();
		return forLoopStart;
	}
```

### UnnecessaryLocalVariable
Local variable `lineBreak` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public LineBreak createLineBreak()
	{
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}
```

### UnnecessaryLocalVariable
Local variable `elseIfCondition` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public ElseIfCondition createElseIfCondition()
	{
		ElseIfConditionImpl elseIfCondition = new ElseIfConditionImpl();
		return elseIfCondition;
	}
```

### UnnecessaryLocalVariable
Local variable `ifConditionStart` is redundant
in `org.eclipse.xtend.core/emf-gen/org/eclipse/xtend/core/richstring/impl/ProcessedRichStringFactoryImpl.java`
#### Snippet
```java
	public IfConditionStart createIfConditionStart()
	{
		IfConditionStartImpl ifConditionStart = new IfConditionStartImpl();
		return ifConditionStart;
	}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
				return null;
			}
			LightweightTypeReference result = overriddenMethod.getResolvedReturnType();
			return result;
		}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/typesystem/XtendReentrantTypeResolver.java`
#### Snippet
```java
			}
		}
		boolean result = EcoreUtil.isAncestor(root, instance);
		return result;
	}
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
	private String readFileIntoString(String filename, Charset encoding) {
		try {
			String result = Files.asCharSource(new File(filename), encoding).read();
			return result;
		} catch (IOException e) {
```

### UnnecessaryLocalVariable
Local variable `patterns` is redundant
in `org.eclipse.xtend.core/generator/org/eclipse/xtend/core/parser/JFlexGeneratorFragment2.java`
#### Snippet
```java
				InputStreamReader reader = new InputStreamReader(getClass().getResourceAsStream(path), "ISO-8859-1");
				try {
					String patterns = CharStreams.toString(reader);
					return patterns;
				} finally {
```

### UnnecessaryLocalVariable
Local variable `location` is redundant
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			if(actualType !=null && !actualType.isUnknown() && !actualType.isPrimitiveVoid()) {
				String message = String.format("JUnit method %s() must be void but is %s.", function.getName(), actualType.getHumanReadableName());
				EAttribute location = XTEND_FUNCTION__NAME;
				error(message, function, location, INVALID_RETURN_TYPE_IN_CASE_OF_JUNIT_ANNOTATION);
			}
```

## RuleId[ruleID=ThrowableNotThrown]
### ThrowableNotThrown
Result of `sneakyThrow()` not thrown
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
			compilationTestHelper.assertCompilesTo(source, expected);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}
```

### ThrowableNotThrown
Result of `sneakyThrow()` not thrown
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
			});
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'org.eclipse.xtext.generator.IShouldGenerate' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java
	}

	public Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always.class;
	}
```

### UnstableApiUsage
'org.eclipse.xtext.generator.IShouldGenerate' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java

	public Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always.class;
	}

```

### UnstableApiUsage
'org.eclipse.xtext.generator.IShouldGenerate.Always' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java

	public Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always.class;
	}

```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/XtendRuntimeModule.java`
#### Snippet
```java
	}

	public Class<? extends MutableFileSystemSupport> bindMutableFileSystemSupport() {
		return JavaIOFileSystemSupport.class;
	}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						
						@Override
						public List<? extends Problem> getAllProblems() {
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
							List<Problem> result = Lists.newArrayList(Iterables.transform(issues, new Function<EObjectDiagnosticImpl, Problem>() {

								@Override
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java

								@Override
								public Problem apply(EObjectDiagnosticImpl diag) {
									ProblemImpl result = new ProblemImpl(diag.getCode(), diag.getMessage(), translateSeverity(diag.getSeverity()));
									return result;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								}

								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem.Severity' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								}

								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem.Severity' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
```

### UnstableApiUsage
'ERROR' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
								private org.eclipse.xtend.lib.macro.services.Problem.Severity translateSeverity(Severity severity) {
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem.Severity' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
```

### UnstableApiUsage
'WARNING' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
									switch (severity) {
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem.Severity' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
```

### UnstableApiUsage
'INFO' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case ERROR : return Problem.Severity.ERROR;
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
									}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem.Severity' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
									}
```

### UnstableApiUsage
'IGNORE' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.Problem' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
										case WARNING : return Problem.Severity.WARNING;
										case INFO : return Problem.Severity.INFO;
										case IGNORE : return Problem.Severity.IGNORE;
										default: throw new IllegalArgumentException(String.valueOf(severity));
									}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						
						@Override
						public List<? extends Problem> getProblems(Element element) {
							return getTransformationContext().getProblems(element);
						}
```

### UnstableApiUsage
'getProblems(org.eclipse.xtend.lib.macro.declaration.Element)' is declared in unstable interface 'org.eclipse.xtend.lib.macro.services.ProblemSupport' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						@Override
						public List<? extends Problem> getProblems(Element element) {
							return getTransformationContext().getProblems(element);
						}
						
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
							Resource resource = compilationUnitImpl.getXtendFile().eResource();
							Iterable<EObjectDiagnosticImpl> issues = Iterables.filter(Iterables.concat(resource.getErrors(), resource.getWarnings()), EObjectDiagnosticImpl.class); 
							List<Problem> result = Lists.newArrayList(Iterables.transform(issues, new Function<EObjectDiagnosticImpl, Problem>() {

								@Override
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.declaration.CompilationUnit' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		Map<String, CharSequence> getAllGeneratedResources();
		
		CompilationUnit getCompilationUnit();
		
		TransformationContext getTransformationContext();
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.TransformationContext' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						}
						@Override
						public TransformationContext getTransformationContext() {
							TransformationContextImpl transformationContextImpl = new TransformationContextImpl();
							transformationContextImpl.setUnit(compilationUnitImpl);
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.TransformationContext' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		CompilationUnit getCompilationUnit();
		
		TransformationContext getTransformationContext();
		
		/**
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.declaration.CompilationUnit' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
						
						@Override
						public CompilationUnit getCompilationUnit() {
							return compilationUnitImpl;
						}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		 * @since 2.8
		 */
		List<? extends Problem> getAllProblems();
	}
}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.services.Problem' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendCompilerTester.java`
#### Snippet
```java
		 * @since 2.8
		 */
		List<? extends Problem> getProblems(Element element);
		
		/**
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/XtendCompiler.java`
#### Snippet
```java

	protected void appendExtensionAnnotation(EObject context, ITreeAppendable appendable, boolean newLine) {
		JvmType extension = findKnownTopLevelType(Extension.class, context);
		if (extension != null) {
			appendable.append("@");
```

### UnstableApiUsage
'doGenerateStubs(org.eclipse.xtext.generator.IFileSystemAccess, org.eclipse.xtext.resource.IResourceDescription)' is declared in unstable interface 'org.eclipse.xtext.common.types.descriptions.IStubGenerator' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
		for (Resource resource : resources) {
			IResourceDescription description = resourceDescriptionManager.getResourceDescription(resource);
			stubGenerator.doGenerateStubs(fileSystemAccess, description);
		}
		return outputDirectory;
```

### UnstableApiUsage
'org.eclipse.xtext.common.types.descriptions.IStubGenerator' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/compiler/batch/XtendBatchCompiler.java`
#### Snippet
```java
	private CompilerPhases compilerPhases;
	@Inject
	private IStubGenerator stubGenerator;
	@Inject 
	private IOutputConfigurationProvider outputConfigurationProvider;
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		associator.associate(parameter, jvmParam);
		translateAnnotationsTo(parameter.getAnnotations(), jvmParam);
		if (parameter.isExtension() && typeReferences.findDeclaredType(Extension.class, parameter) != null) {
			jvmParam.getAnnotations().add(_annotationTypesBuilder.annotationRef(Extension.class));
		}
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
		translateAnnotationsTo(parameter.getAnnotations(), jvmParam);
		if (parameter.isExtension() && typeReferences.findDeclaredType(Extension.class, parameter) != null) {
			jvmParam.getAnnotations().add(_annotationTypesBuilder.annotationRef(Extension.class));
		}
		executable.getParameters().add(jvmParam);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
					field.getAnnotations().add(annotationReference);
			}
			if (source.isExtension() && typeReferences.findDeclaredType(Extension.class, source) != null) {
				field.getAnnotations().add(_annotationTypesBuilder.annotationRef(Extension.class));
			}
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/jvmmodel/XtendJvmModelInferrer.java`
#### Snippet
```java
			}
			if (source.isExtension() && typeReferences.findDeclaredType(Extension.class, source) != null) {
				field.getAnnotations().add(_annotationTypesBuilder.annotationRef(Extension.class));
			}
			jvmTypesBuilder.copyDocumentationTo(source, field);
```

### UnstableApiUsage
'isRepeatable(org.eclipse.xtext.common.types.JvmAnnotationType)' is declared in unstable class 'org.eclipse.xtext.common.types.util.AnnotationLookup' marked with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
				JvmType type = sameType.get(0).getAnnotationType();
				if (type instanceof JvmAnnotationType && !type.eIsProxy()
						&& !annotationLookup.isRepeatable((JvmAnnotationType) type)) {
					for (XAnnotation xAnnotation : sameType) {
						error("Multiple annotations of non-repeatable type @"
```

### UnstableApiUsage
'org.eclipse.xtext.common.types.util.AnnotationLookup' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
	
	@Inject
	private AnnotationLookup annotationLookup;
	
	@Inject
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation/XtendValidator.java`
#### Snippet
```java
			error("Couldn't find a JDK 1.5 or higher on the project's classpath.", xtendFile, XTEND_FILE__PACKAGE,
					IssueCodes.JDK_NOT_ON_CLASSPATH);
		} else if (typeReferences.findDeclaredType(ToStringBuilder.class, xtendFile) == null) {
			error("Couldn't find the mandatory library 'org.eclipse.xtext.xbase.lib' 2.8.0 or higher on the project's classpath.",
					xtendFile, XTEND_FILE__PACKAGE, IssueCodes.XBASE_LIB_NOT_ON_CLASSPATH);
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.Active' is marked unstable with @Beta
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
		for(XAnnotation annotation: xtendType.getAnnotations()) {
			JvmType annotationType = annotation.getAnnotationType();
			if (annotationType != null && !annotationType.eIsProxy() && Active.class.getName().equals(annotationType.getIdentifier())) {
				highlightFeature(acceptor, annotation, XtendPackage.Literals.XTEND_TYPE_DECLARATION__NAME, ACTIVE_ANNOTATION);
				break;
```

### UnstableApiUsage
'org.eclipse.xtend.lib.macro.Active' is marked unstable with @Beta
in `org.eclipse.xtend.ide.common/src/org/eclipse/xtend/ide/common/highlighting/XtendHighlightingCalculator.java`
#### Snippet
```java
			for(JvmAnnotationReference annotationReference: ((JvmAnnotationTarget) annotationType).getAnnotations()) {
				JvmAnnotationType otherAnnotation = annotationReference.getAnnotation();
				if (otherAnnotation != null && !otherAnnotation.eIsProxy() && Active.class.getName().equals(otherAnnotation.getIdentifier())) {
					highlightAnnotation(annotation, acceptor, ACTIVE_ANNOTATION);
					return;
```

