# js-graphql-intellij-plugin 
 
# Bad smells
I found 1984 bad smells with 139 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 550 | false |
| UNUSED_IMPORT | 387 | false |
| UnnecessaryFullyQualifiedName | 192 | false |
| ReturnNull | 130 | false |
| PatternVariableCanBeUsed | 62 | false |
| RedundantImplements | 50 | false |
| DuplicateBranchesInSwitch | 48 | false |
| UtilityClassWithoutPrivateConstructor | 44 | true |
| ExceptionNameDoesntEndWithException | 43 | false |
| AssignmentToMethodParameter | 41 | false |
| SizeReplaceableByIsEmpty | 35 | true |
| ClassCanBeRecord | 30 | false |
| NonProtectedConstructorInAbstractClass | 29 | true |
| SimplifyOptionalCallChains | 25 | false |
| RedundantFieldInitialization | 18 | false |
| RedundantMethodOverride | 16 | false |
| CodeBlock2Expr | 16 | true |
| SimplifyStreamApiCallChains | 16 | false |
| MissortedModifiers | 15 | false |
| KeySetIterationMayUseEntrySet | 14 | false |
| EnhancedSwitchMigration | 14 | false |
| ObsoleteCollection | 13 | false |
| DataFlowIssue | 10 | false |
| RedundantSuppression | 10 | false |
| StaticCallOnSubclass | 9 | false |
| NestedAssignment | 8 | false |
| UnstableApiUsage | 8 | false |
| MemberVisibilityCanBePrivate | 7 | false |
| NonSerializableFieldInSerializableClass | 6 | false |
| RedundantSemicolon | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| NonExtendableApiUsage | 5 | false |
| EmptyMethod | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| AssignmentToLambdaParameter | 5 | false |
| UnusedSymbol | 5 | false |
| CommentedOutCode | 4 | false |
| CStyleArrayDeclaration | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| PrivatePropertyName | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| UnusedAssignment | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| ConditionCoveredByFurtherCondition | 4 | false |
| SamePackageImport | 4 | false |
| TextBlockMigration | 3 | false |
| RedundantStringFormatCall | 3 | false |
| SynchronizeOnThis | 3 | false |
| ConstantValue | 3 | false |
| UnnecessaryCallToStringValueOf | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| DuplicateCondition | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| KotlinUnusedImport | 2 | false |
| NonFinalFieldOfException | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| Convert2MethodRef | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| RedundantNullableReturnType | 2 | false |
| DialogTitleCapitalization | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| TrivialStringConcatenation | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SlowListContainsAll | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| InstanceofCatchParameter | 1 | false |
| DoubleBraceInitialization | 1 | false |
| MismatchedStringCase | 1 | false |
| IOResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| MismatchedJavadocCode | 1 | false |
| RegExpDuplicateAlternationBranch | 1 | false |
| SystemOutErr | 1 | false |
| ReplaceNullCheck | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UseBulkOperation | 1 | false |
| UsePropertyAccessSyntax | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (errorType) { case InvalidCustomizedNameError: return GraphQLIlle...` statement on enum type 'com.intellij.lang.jsgraphql.types.schema.validation.SchemaValidationErrorType' misses cases: 'UnbrokenInputCycle', ...
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/SchemaValidationError.java`
#### Snippet
```java
    @Override
    public @Nullable Class<? extends GraphQLInspection> getInspectionClass() {
        switch (errorType) {
            case InvalidCustomizedNameError:
                return GraphQLIllegalNameInspection.class;
            case EnumLackOfValueError:
            case InputObjectTypeLackOfFieldError:
            case ImplementingTypeLackOfFieldError:
                return GraphQLEmptyTypeInspection.class;
            case ObjectDoesNotImplementItsInterfaces:
                return GraphQLInterfaceImplementationInspection.class;
        }

        return super.getInspectionClass();
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getInstance()` declared in class 'com.intellij.psi.codeStyle.CodeStyleManager' but referenced via subclass 'com.intellij.psi.impl.source.codeStyle.CodeStyleManagerImpl'
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
                final PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(myProject);
                final PsiFile jsonPsiFile = psiFileFactory.createFileFromText("", JsonFileType.INSTANCE, documentJson);
                CodeStyleManagerImpl.getInstance(myProject).reformat(jsonPsiFile);
                final Document document = jsonPsiFile.getViewProvider().getDocument();
                if (document != null) {
```

### StaticCallOnSubclass
Static method `getInstance()` declared in class 'com.intellij.openapi.fileEditor.impl.text.TextEditorProvider' but referenced via subclass 'com.intellij.openapi.fileEditor.impl.text.PsiAwareTextEditorProvider'
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
        // variables editor
        final LightVirtualFile virtualFile = new LightVirtualFile(GRAPH_QL_VARIABLES_JSON, JsonFileType.INSTANCE, "");
        final FileEditor variablesFileEditor = PsiAwareTextEditorProvider.getInstance().createEditor(myProject, virtualFile);
        Disposer.register(fileEditor, variablesFileEditor);

```

### StaticCallOnSubclass
Static method `insertStringAtCaret()` declared in class 'com.intellij.openapi.editor.EditorModificationUtilEx' but referenced via subclass 'com.intellij.openapi.editor.EditorModificationUtil'
in `src/main/com/intellij/lang/jsgraphql/ide/completion/AddColonSpaceInsertHandler.java`
#### Snippet
```java
    if (project != null) {
      if (!isCharAtColon(editor)) {
        EditorModificationUtil.insertStringAtCaret(editor, ": ");
        PsiDocumentManager.getInstance(project).commitDocument(editor.getDocument());
      } else {
```

### StaticCallOnSubclass
Static method `getInstance()` declared in class 'com.intellij.psi.codeStyle.CodeStyleManager' but referenced via subclass 'com.intellij.psi.impl.source.codeStyle.CodeStyleManagerImpl'
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLMissingTypeFix.java`
#### Snippet
```java
        }
        final PsiFile codeFile = PsiFileFactory.getInstance(project).createFileFromText("", GraphQLLanguage.INSTANCE, code);
        CodeStyleManagerImpl.getInstance(project).reformat(codeFile);
        assert codeFile.getViewProvider().getDocument() != null;
        CodeStyleManagerImpl.getInstance(project).reformat(codeFile);
```

### StaticCallOnSubclass
Static method `getInstance()` declared in class 'com.intellij.psi.codeStyle.CodeStyleManager' but referenced via subclass 'com.intellij.psi.impl.source.codeStyle.CodeStyleManagerImpl'
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLMissingTypeFix.java`
#### Snippet
```java
        CodeStyleManagerImpl.getInstance(project).reformat(codeFile);
        assert codeFile.getViewProvider().getDocument() != null;
        CodeStyleManagerImpl.getInstance(project).reformat(codeFile);
        final Document document = codeFile.getViewProvider().getDocument();
        if (document != null) {
```

### StaticCallOnSubclass
Static method `insertStringAtCaret()` declared in class 'com.intellij.openapi.editor.EditorModificationUtilEx' but referenced via subclass 'com.intellij.openapi.editor.EditorModificationUtil'
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLMissingTypeFix.java`
#### Snippet
```java
        final String lineBefore = definition.getNextSibling() instanceof PsiWhiteSpace ? "" : "\n";

        EditorModificationUtil.insertStringAtCaret(editor, lineBefore + "\n" + code + "\n", false, caretDelta);
    }

```

### StaticCallOnSubclass
Static method `or()` declared in class 'com.intellij.patterns.StandardPatterns' but referenced via subclass 'com.intellij.patterns.PlatformPatterns'
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java
            }
        };
        final ElementPattern<PsiElement> extendKeywords = PlatformPatterns.or(
            psiElement(GraphQLElementTypes.TYPE_KEYWORD),
            psiElement(GraphQLElementTypes.INTERFACE_KEYWORD),
```

### StaticCallOnSubclass
Static method `or()` declared in class 'com.intellij.patterns.StandardPatterns' but referenced via subclass 'com.intellij.patterns.PlatformPatterns'
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java
        psiElement(GraphQLElementTypes.NAME).afterLeafSkipping(
            // skip
            PlatformPatterns.or(psiComment(), psiElement(TokenType.WHITE_SPACE), psiElement(GraphQLElementTypes.BRACKET_L)),
            // until argument type colon occurs
            psiElement(GraphQLElementTypes.COLON)
```

### StaticCallOnSubclass
Static method `or()` declared in class 'com.intellij.patterns.StandardPatterns' but referenced via subclass 'com.intellij.patterns.PlatformPatterns'
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java
            }
        };
        final ElementPattern<PsiElement> insideTypeDefElement = PlatformPatterns.or(
            psiElement().inside(GraphQLObjectTypeDefinition.class),
            psiElement().inside(GraphQLObjectTypeExtensionDefinition.class),
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
  public void visitInputValueDefinition(@NotNull GraphQLInputValueDefinition o) {
    visitDirectivesAware(o);
    // visitNamedElement(o);
    // visitDescriptionAware(o);
  }
```

### CommentedOutCode
Commented out code (2 lines)
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
  public void visitFieldDefinition(@NotNull GraphQLFieldDefinition o) {
    visitDirectivesAware(o);
    // visitNamedElement(o);
    // visitDescriptionAware(o);
  }
```

### CommentedOutCode
Commented out code (2 lines)
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
  public void visitSchemaDefinition(@NotNull GraphQLSchemaDefinition o) {
    visitTypeSystemDefinition(o);
    // visitDirectivesAware(o);
    // visitDescriptionAware(o);
  }
```

### CommentedOutCode
Commented out code (2 lines)
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
  public void visitFragmentDefinition(@NotNull GraphQLFragmentDefinition o) {
    visitDefinition(o);
    // visitDirectivesAware(o);
    // visitNamedElement(o);
  }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `ZZ_LEXSTATE`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };
```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_Y`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\172\3\1\5\4\3");

```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_A`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_A table has 384 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\3\2\5\1\3\22\0\1\2\1\20\1\12\1\4\1\10\1\0\1\33\1\0\1\21\1\22\1"+
    "\0\1\17\1\1\1\14\1\15\1\0\1\7\11\13\1\23\2\0\1\24\2\0\1\25\4\6\1\16\25\6\1"+
```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_Z`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\14\100\1\300\u0100\100");

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    }

    protected final Stack<State> myStateStack = new Stack<State>();
    protected int myLeftBraceCount;

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    }

    protected final Stack<State> myStateStack = new Stack<State>();
    protected int myLeftBraceCount;

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
     * @return a stack of the type wrapping which will be at least 1 later deep
     */
    public static Stack<GraphQLType> unwrapType(GraphQLType type) {
        type = assertNotNull(type);
        Stack<GraphQLType> decoration = new Stack<>();
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
    public static Stack<GraphQLType> unwrapType(GraphQLType type) {
        type = assertNotNull(type);
        Stack<GraphQLType> decoration = new Stack<>();
        while (true) {
            decoration.push(type);
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
    public static Stack<GraphQLType> unwrapType(GraphQLType type) {
        type = assertNotNull(type);
        Stack<GraphQLType> decoration = new Stack<>();
        while (true) {
            decoration.push(type);
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
        Type out = TypeName.newTypeName(newName).build();

        Stack<Class<?>> wrappingStack = new Stack<>();
        wrappingStack.addAll(this.decoration);
        while (!wrappingStack.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
        Type out = TypeName.newTypeName(newName).build();

        Stack<Class<?>> wrappingStack = new Stack<>();
        wrappingStack.addAll(this.decoration);
        while (!wrappingStack.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java

        GraphQLType out = objectType;
        Stack<Class<?>> wrappingStack = new Stack<>();
        wrappingStack.addAll(this.decoration);
        while (!wrappingStack.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java

        GraphQLType out = objectType;
        Stack<Class<?>> wrappingStack = new Stack<>();
        wrappingStack.addAll(this.decoration);
        while (!wrappingStack.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
    private final @NotNull Type rawType;
    private final @NotNull TypeName typeName;
    private final @NotNull Stack<Class<?>> decoration = new Stack<>();

    private TypeInfo(@NotNull Type type) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
    private final @NotNull Type rawType;
    private final @NotNull TypeName typeName;
    private final @NotNull Stack<Class<?>> decoration = new Stack<>();

    private TypeInfo(@NotNull Type type) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLSchemaUtil.java`
#### Snippet
```java

        final StringBuilder sb = new StringBuilder();
        final Stack<String> stack = new Stack<>();

        GraphQLType type = rawType;
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLSchemaUtil.java`
#### Snippet
```java

        final StringBuilder sb = new StringBuilder();
        final Stack<String> stack = new Stack<>();

        GraphQLType type = rawType;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `childrenMap.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java

            Map<String, ? extends List<T>> childrenMap = getChildren.apply(traverserContext.thisNode());
            childrenMap.keySet().forEach(key -> {
                List<T> children = childrenMap.get(key);
                for (int i = children.size() - 1; i >= 0; i--) {
```

### KeySetIterationMayUseEntrySet
Iteration over `childrenMap.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserState.java`
#### Snippet
```java
            if (!traverserContext.isDeleted()) {
                Map<String, ? extends List<U>> childrenMap = getChildren.apply(traverserContext.thisNode());
                childrenMap.keySet().forEach(key -> {
                    List<U> children = childrenMap.get(key);
                    for (int i = children.size() - 1; i >= 0; i--) {
```

### KeySetIterationMayUseEntrySet
Iteration over `childrenMap.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserState.java`
#### Snippet
```java
            if (!traverserContext.isDeleted()) {
                Map<String, ? extends List<U>> childrenMap = getChildren.apply(traverserContext.thisNode());
                childrenMap.keySet().forEach(key -> {
                    List<U> children = childrenMap.get(key);
                    for (int i = 0; i < children.size(); i++) {
```

### KeySetIterationMayUseEntrySet
Iteration over `childrenMap.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java

            Map<String, ? extends List<T>> childrenMap = this.nodeAdapter.getNamedChildren(traverserContext.thisNode());
            childrenMap.keySet().forEach(key -> {
                List<T> children = childrenMap.get(key);
                for (int i = children.size() - 1; i >= 0; i--) {
```

### KeySetIterationMayUseEntrySet
Iteration over `sameParent` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java

        List<ZipperWithOneParent> zipperWithOneParents = new ArrayList<>();
        for (NodeZipper<GraphQLSchemaElement> zipper : sameParent) {
            List<Breadcrumb<GraphQLSchemaElement>> breadcrumbs = sameParentsZipper.get(zipper);
            zipperWithOneParents.add(new ZipperWithOneParent(zipper, breadcrumbs.get(0)));
```

### KeySetIterationMayUseEntrySet
Iteration over `oldDirectivesMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        Map<String, Directive> newDirectivesMap = sortedMap(newDirectives, Directive::getName);

        for (String directiveName : oldDirectivesMap.keySet()) {
            Directive oldDirective = oldDirectivesMap.get(directiveName);
            Optional<Directive> newDirective = Optional.ofNullable(newDirectivesMap.get(directiveName));
```

### KeySetIterationMayUseEntrySet
Iteration over `oldArgumentsByName.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            }

            for (String argName : oldArgumentsByName.keySet()) {
                Argument oldArgument = oldArgumentsByName.get(argName);
                Optional<Argument> newArgument = Optional.ofNullable(newArgumentsByName.get(argName));
```

### KeySetIterationMayUseEntrySet
Iteration over `oldDefinitionMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            EnumValueDefinition::getName);

        for (String enumName : oldDefinitionMap.keySet()) {
            EnumValueDefinition oldEnum = oldDefinitionMap.get(enumName);
            Optional<EnumValueDefinition> newEnum = Optional.ofNullable(newDefinitionMap.get(enumName));
```

### KeySetIterationMayUseEntrySet
Iteration over `newDefinitionMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            }
        }
        for (String enumName : newDefinitionMap.keySet()) {
            EnumValueDefinition oldEnum = oldDefinitionMap.get(enumName);

```

### KeySetIterationMayUseEntrySet
Iteration over `oldDefinitionMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        Map<String, InputValueDefinition> newDefinitionMap = sortedMap(newIVD, InputValueDefinition::getName);

        for (String inputFieldName : oldDefinitionMap.keySet()) {
            InputValueDefinition oldField = oldDefinitionMap.get(inputFieldName);
            Optional<InputValueDefinition> newField = Optional.ofNullable(newDefinitionMap.get(inputFieldName));
```

### KeySetIterationMayUseEntrySet
Iteration over `newDefinitionMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java

        // check new fields are not mandatory
        for (String inputFieldName : newDefinitionMap.keySet()) {
            InputValueDefinition newField = newDefinitionMap.get(inputFieldName);
            Optional<InputValueDefinition> oldField = Optional.ofNullable(oldDefinitionMap.get(inputFieldName));
```

### KeySetIterationMayUseEntrySet
Iteration over `futures.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
        try {
            Map<String, Object> results = new LinkedHashMap<>();
            for (String fieldName : futures.keySet()) {
                ExecutionResult executionResult;
                try {
```

### KeySetIterationMayUseEntrySet
Iteration over `rules.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/fieldvalidation/SimpleFieldValidation.java`
#### Snippet
```java
    public List<GraphQLError> validateFields(FieldValidationEnvironment validationEnvironment) {
        List<GraphQLError> errors = new ArrayList<>();
        for (ResultPath fieldPath : rules.keySet()) {
            List<FieldAndArguments> fieldAndArguments = validationEnvironment.getFieldsByPath().get(fieldPath);
            if (fieldAndArguments != null) {
```

### KeySetIterationMayUseEntrySet
Iteration over `fieldMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    private List<Conflict> findConflicts(Map<String, List<FieldAndType>> fieldMap) {
        List<Conflict> result = new ArrayList<>();
        for (String name : fieldMap.keySet()) {
            List<FieldAndType> fieldAndTypes = fieldMap.get(name);
            for (int i = 0; i < fieldAndTypes.size(); i++) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 51: break;
          case 3: 
            { return EOL_COMMENT;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 52: break;
          case 4: 
            { return NAME;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 53: break;
          case 5: 
            { return NUMBER;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 54: break;
          case 6: 
            { pushState(VARIABLE_OR_TEMPLATE); return DOLLAR;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 55: break;
          case 7: 
            { pushState(QUOTED_STRING); return OPEN_QUOTE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 56: break;
          case 8: 
            { return BANG;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 57: break;
          case 9: 
            { return PAREN_L;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 58: break;
          case 10: 
            { return PAREN_R;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 59: break;
          case 11: 
            { return COLON;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 60: break;
          case 12: 
            { return EQUALS;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 61: break;
          case 13: 
            { return AT;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 62: break;
          case 14: 
            { return BRACKET_L;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 63: break;
          case 15: 
            { return BRACKET_R;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 64: break;
          case 16: 
            { return BRACE_L;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 65: break;
          case 17: 
            { return PIPE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 66: break;
          case 18: 
            { return BRACE_R;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 67: break;
          case 19: 
            { return AMP;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 68: break;
          case 20: 
            { return REGULAR_STRING_PART;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 69: break;
          case 21: 
            { popState(); return BAD_CHARACTER;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 70: break;
          case 22: 
            { popState(); return CLOSING_QUOTE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 71: break;
          case 23: 
            { popState(); return NAME;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 72: break;
          case 24: 
            { pushState(TEMPLATE); return BRACE_L;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 73: break;
          case 25: 
            { return TEMPLATE_CHAR;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 74: break;
          case 26: 
            { myLeftBraceCount++; return TEMPLATE_CHAR;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 75: break;
          case 27: 
            { if (myLeftBraceCount == 0) { popState(); popState(); return BRACE_R; } myLeftBraceCount--; return TEMPLATE_CHAR;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 76: break;
          case 28: 
            { return VARIABLE_NAME;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 77: break;
          case 29: 
            { return ON_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 78: break;
          case 30: 
            // lookahead expression with fixed lookahead length
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 79: break;
          case 31: 
            { return FLOAT;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 80: break;
          case 32: 
            { pushState(BLOCK_STRING);  return OPEN_TRIPLE_QUOTE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 81: break;
          case 33: 
            { return SPREAD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 82: break;
          case 34: 
            { popState(); return CLOSING_TRIPLE_QUOTE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 83: break;
          case 35: 
            { return ENUM_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 84: break;
          case 36: 
            { return TYPE_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 85: break;
          case 37: 
            { return QUERY_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 86: break;
          case 38: 
            { return UNION_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 87: break;
          case 39: 
            { return INPUT_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 88: break;
          case 40: 
            { return EXTEND_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 89: break;
          case 41: 
            { return SCALAR_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 90: break;
          case 42: 
            { return SCHEMA_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 91: break;
          case 43: 
            { return MUTATION_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 92: break;
          case 44: 
            { return FRAGMENT_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 93: break;
          case 45: 
            { return INTERFACE_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 94: break;
          case 46: 
            { return DIRECTIVE_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 95: break;
          case 47: 
            { return REPEATABLE_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 96: break;
          case 48: 
            { return IMPLEMENTS_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 97: break;
          case 49: 
            { return SUBSCRIPTION_KEYWORD;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
            assertTrue(traversalControl == CONTINUE);
            List<DefaultTraverserContext> children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
                return;
```

### SizeReplaceableByIsEmpty
`breadcrumbs.size() == 0` can be replaced with 'breadcrumbs.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
     */
    public T toRoot() {
        if (breadcrumbs.size() == 0 && modificationType != ModificationType.DELETE) {
            return this.curNode;
        }
```

### SizeReplaceableByIsEmpty
`breadcrumbs.size() == 0` can be replaced with 'breadcrumbs.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
            return this.curNode;
        }
        if (breadcrumbs.size() == 0 && modificationType == ModificationType.DELETE) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`zippers.size() == 0` can be replaced with 'zippers.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
     */
    public T toRootNode() {
        if (zippers.size() == 0) {
            return commonRoot;
        }
```

### SizeReplaceableByIsEmpty
`edges.size() == 0` can be replaced with 'edges.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/relay/SimpleListConnection.java`
#### Snippet
```java
        List<Edge<T>> edges = buildEdges();

        if (edges.size() == 0) {
            return emptyConnection();
        }
```

### SizeReplaceableByIsEmpty
`edges.size() == 0` can be replaced with 'edges.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/relay/SimpleListConnection.java`
#### Snippet
```java

        edges = edges.subList(begin, end);
        if (edges.size() == 0) {
            return emptyConnection();
        }
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java

            this.children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
                return;
```

### SizeReplaceableByIsEmpty
`childZippers.size() > 0` can be replaced with '!childZippers.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                childZippers.addAll((Collection<? extends NodeZipper<T>>) childContext.getVar(List.class));
            }
            if (childZippers.size() > 0) {
                NodeZipper<T> newNode = moveUp((T) currentContext.thisNode(), childZippers);
                myZippers.add(newNode);
```

### SizeReplaceableByIsEmpty
`result.size() > 0` can be replaced with '!result.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### SizeReplaceableByIsEmpty
`zippers.size() == 0` can be replaced with 'zippers.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                                  Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> breadcrumbsByZipper,
                                  Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> nodeToZipper) {
        if (zippers.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`zipperWithSameParent.size() == 0` can be replaced with 'zipperWithSameParent.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
            Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> zipperWithSameParent = zipperWithSameParent(element, curZippers, breadcrumbsByZipper);
            // this means we have a node which doesn't need to be changed
            if (zipperWithSameParent.size() == 0) {
                continue;
            }
```

### SizeReplaceableByIsEmpty
`memberTypes.size() == 0` can be replaced with 'memberTypes.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java

        List<Type> memberTypes = unionTypeDefinition.getMemberTypes();
        if (memberTypes == null || memberTypes.size() == 0) {
            errors.add(new EmptyUnionTypeError(unionTypeDefinition));
            return;
```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaParser.java`
#### Snippet
```java
        }

        if (errors.size() > 0) {
            typeRegistry.addError(new SchemaProblem(errors));
        }
```

### SizeReplaceableByIsEmpty
`lines.size() == 0` can be replaced with 'lines.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
            }
        }
        if (lines.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`inputObjectFields.size() > 0` can be replaced with '!inputObjectFields.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                out.format("input %s%s", type.getName(), directivesString(GraphQLInputObjectType.class, type.getDirectives()));
                List<GraphQLInputObjectField> inputObjectFields = visibility.getFieldDefinitions(type);
                if (inputObjectFields.size() > 0) {
                    out.format(" {\n");
                    inputObjectFields
```

### SizeReplaceableByIsEmpty
`fieldDefinitions.size() == 0` can be replaced with 'fieldDefinitions.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                                       Comparator<? super GraphQLSchemaElement> comparator,
                                       List<GraphQLFieldDefinition> fieldDefinitions) {
        if (fieldDefinitions.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`values.size() > 0` can be replaced with '!values.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                    .sorted(comparator)
                    .collect(toList());
                if (values.size() > 0) {
                    out.format(" {\n");
                    for (GraphQLEnumValueDefinition enumValueDefinition : values) {
```

### SizeReplaceableByIsEmpty
`enumValueDefinitions.size() == 0` can be replaced with 'enumValueDefinitions.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java

        List<GraphQLEnumValueDefinition> enumValueDefinitions = type.getValues();
        if (enumValueDefinitions == null || enumValueDefinitions.size() == 0) {
            SchemaValidationError validationError = new SchemaValidationError(
                SchemaValidationErrorType.EnumLackOfValueError,
```

### SizeReplaceableByIsEmpty
`fieldDefinitions.size() == 0` can be replaced with 'fieldDefinitions.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java

        List<GraphQLFieldDefinition> fieldDefinitions = type.getFieldDefinitions();
        if (fieldDefinitions == null || fieldDefinitions.size() == 0) {
            SchemaValidationError validationError = new SchemaValidationError(
                SchemaValidationErrorType.ImplementingTypeLackOfFieldError,
```

### SizeReplaceableByIsEmpty
`inputObjectFields.size() == 0` can be replaced with 'inputObjectFields.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java

        List<GraphQLInputObjectField> inputObjectFields = type.getFields();
        if (inputObjectFields == null || inputObjectFields.size() == 0) {
            SchemaValidationError validationError = new SchemaValidationError(
                SchemaValidationErrorType.InputObjectTypeLackOfFieldError,
```

### SizeReplaceableByIsEmpty
`fieldDefinitionArguments.size() != 0` can be replaced with '!fieldDefinitionArguments.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java

        List<GraphQLArgument> fieldDefinitionArguments = fieldDefinition.getArguments();
        if (fieldDefinitionArguments != null || fieldDefinitionArguments.size() != 0) {
            for (GraphQLArgument fieldDefinitionArgument : fieldDefinitionArguments) {
                validateFieldDefinitionArgument(typeName, fieldDefinition.getName(), fieldDefinitionArgument, errorCollector);
```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/analysis/MaxQueryDepthInstrumentation.java`
#### Snippet
```java
    public InstrumentationContext<List<ValidationError>> beginValidation(InstrumentationValidationParameters parameters) {
        return whenCompleted((errors, throwable) -> {
            if ((errors != null && errors.size() > 0) || throwable != null) {
                return;
            }
```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/analysis/MaxQueryComplexityInstrumentation.java`
#### Snippet
```java
    public InstrumentationContext<List<ValidationError>> beginValidation(InstrumentationValidationParameters parameters) {
        return whenCompleted((errors, throwable) -> {
            if ((errors != null && errors.size() > 0) || throwable != null) {
                return;
            }
```

### SizeReplaceableByIsEmpty
`name.length() != 0` can be replaced with '!name.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java

    private static String capitalize(String name) {
        if (name != null && name.length() != 0) {
            char[] chars = name.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
```

### SizeReplaceableByIsEmpty
`s.trim().length() == 0` can be replaced with 's.trim().isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java

    private boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`result.size() > 0` can be replaced with '!result.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### SizeReplaceableByIsEmpty
`unresolvedNodes.size() > 0` can be replaced with '!unresolvedNodes.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java

    private CompletableFuture<List<NodeZipper<ExecutionResultNode>>> fetchAndAnalyze(ExecutionContext executionContext, List<NodeZipper<ExecutionResultNode>> unresolvedNodes) {
        assertTrue(unresolvedNodes.size() > 0, () -> "unresolvedNodes can't be empty");

        List<FieldSubSelection> fieldSubSelections = map(unresolvedNodes,
```

### SizeReplaceableByIsEmpty
`nextUnresolvedNodes.getZippers().size() == 0` can be replaced with 'nextUnresolvedNodes.getZippers().isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java
    private CompletableFuture<NodeMultiZipper<ExecutionResultNode>> nextStep(ExecutionContext executionContext, NodeMultiZipper<ExecutionResultNode> multizipper) {
        NodeMultiZipper<ExecutionResultNode> nextUnresolvedNodes = ResultNodesUtil.getUnresolvedNodes(multizipper.toRootNode());
        if (nextUnresolvedNodes.getZippers().size() == 0) {
            return completedFuture(nextUnresolvedNodes);
        }
```

### SizeReplaceableByIsEmpty
`queryText.trim().length() == 0` can be replaced with 'queryText.trim().isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
                return persistedQueryCache.getPersistedQueryDocument(persistedQueryId, executionInput, (queryText) -> {
                    // we have a miss and they gave us nothing - bah!
                    if (queryText == null || queryText.trim().length() == 0) {
                        throw new PersistedQueryNotFound(persistedQueryId);
                    }
```

### SizeReplaceableByIsEmpty
`prevResults.size() > 0` can be replaced with '!prevResults.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        CompletableFuture<List<ExecutionResult>> resultsFuture = Async.eachSequentially(instrumentations, (instrumentation, index, prevResults) -> {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            ExecutionResult lastResult = prevResults.size() > 0 ? prevResults.get(prevResults.size() - 1) : executionResult;
            return instrumentation.instrumentExecutionResult(lastResult, parameters.withNewState(state));
        });
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java
        NormalizedField cur = this;
        while (cur != null) {
            if (result.length() > 0) {
                result.insert(0, "/");
            }
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java

    private <T> T lastElement(List<T> list) {
        if (list.size() == 0) return null;
        return list.get(list.size() - 1);
    }
```

### SizeReplaceableByIsEmpty
`rulesVisitingFragmentSpreads.size() > 0` can be replaced with '!rulesVisitingFragmentSpreads.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
        }
        List<AbstractRule> rulesVisitingFragmentSpreads = getRulesVisitingFragmentSpreads(rules);
        if (rulesVisitingFragmentSpreads.size() > 0) {
            FragmentDefinition fragment = validationContext.getFragment(fragmentSpread.getName());
            if (fragment != null && !ancestors.contains(fragment)) {
```

### SizeReplaceableByIsEmpty
`subConflicts.size() > 0` can be replaced with '!subConflicts.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
            collectFields(subFieldMap, selectionSet2, typeB, visitedFragmentSpreads);
            List<Conflict> subConflicts = findConflicts(subFieldMap);
            if (subConflicts.size() > 0) {
                String reason = format("%s: %s", responseName, joinReasons(subConflicts));
                List<Field> fields = new ArrayList<>();
```

### SizeReplaceableByIsEmpty
`currentOnes.size() == 0` can be replaced with 'currentOnes.isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java

        List<GraphQLObjectType> resolvedTypeCondition = resolvePossibleObjects(typeCondition, graphQLSchema);
        if (currentOnes.size() == 0) {
            return new LinkedHashSet<>(resolvedTypeCondition);
        }
```

## RuleId[id=TextBlockMigration]
### TextBlockMigration
Concatenation can be replaced with text block
in `src/main/com/intellij/lang/jsgraphql/ide/formatter/GraphQLLanguageCodeStyleSettingsProvider.java`
#### Snippet
```java
public class GraphQLLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {

    private static final String SAMPLE = "query Hero($episode: Episode!, $withFriends: Boolean!) {\n" +
        "    hero(episode: $episode) {\n" +
        "        name\n" +
```

### TextBlockMigration
Concatenation can be replaced with text block
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/GraphQLColorSettingsPage.java`
#### Snippet
```java
    @Override
    public String getDemoText() {
        return "# Comment\n" +
            "\n" +
            "query <operationDefinition>Hero</operationDefinition>(<variableDefinition>$episode</variableDefinition>: <typeName>Episode</typeName>!, <variableDefinition>$withFriends</variableDefinition>: <typeName>Boolean</typeName>!) {\n" +
```

### TextBlockMigration
Concatenation can be replaced with text block
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeCollectingVisitor.java`
#### Snippet
```java
                if (existingType != type) {
                    LOG.error(new AssertException(
                        format("All types within a GraphQL schema must have unique names. No two provided types may have the same name.\n" +
                                "No provided type may have a name which conflicts with any built in types (including Scalar and Introspection types).\n" +
                                "You have redefined the type '%s' from being a '%s' to a '%s'",
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
        if (bytes < 1000) return bytes + " bytes";
        int exp = (int) (Math.log(bytes) / Math.log(1000));
        String pre = ("kMGTPE").charAt(exp - 1) + "";
        return String.format("%.1f %sb", bytes / Math.pow(1000, exp), pre);
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `GraphQLOperationDefinitionImpl` has no concrete subclass
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public abstract class GraphQLOperationDefinitionImpl extends GraphQLNamedElementImpl implements GraphQLOperationDefinition {

  public GraphQLOperationDefinitionImpl(@NotNull ASTNode node) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super FoldingDescriptor`
in `src/main/com/intellij/lang/jsgraphql/ide/editor/GraphQLFoldingBuilder.java`
#### Snippet
```java
    }

    private static void buildFolding(ASTNode node, List<FoldingDescriptor> list) {
        boolean isBlock = GraphQLBlock.INDENT_PARENTS.contains(node.getElementType());
        if (GraphQLElementTypes.BLOCK_STRING.equals(node.getElementType())) {
```

### BoundedWildcard
Can generalize to `? super GraphQLReferenceMixin`
in `src/main/com/intellij/lang/jsgraphql/ide/resolve/GraphQLCachingReference.java`
#### Snippet
```java
    private final Function<GraphQLReferenceMixin, PsiElement> innerResolver;

    public GraphQLCachingReference(@NotNull GraphQLReferenceMixin element, Function<GraphQLReferenceMixin, PsiElement> innerResolver) {
        super(element);
        this.innerResolver = innerResolver;
```

### BoundedWildcard
Can generalize to `? extends PsiElement`
in `src/main/com/intellij/lang/jsgraphql/ide/resolve/GraphQLCachingReference.java`
#### Snippet
```java
    private final Function<GraphQLReferenceMixin, PsiElement> innerResolver;

    public GraphQLCachingReference(@NotNull GraphQLReferenceMixin element, Function<GraphQLReferenceMixin, PsiElement> innerResolver) {
        super(element);
        this.innerResolver = innerResolver;
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java

    private void showSchemaErrors(@NotNull AnnotationHolder annotationHolder,
                                  @NotNull List<GraphQLError> schemaErrors,
                                  @NotNull GraphQLFile file) {
        for (GraphQLError error : schemaErrors) {
```

### BoundedWildcard
Can generalize to `? super AnnotationBuilder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/inspections/GraphQLInspection.java`
#### Snippet
```java
                                        @NotNull String message,
                                        @Nullable Class<? extends GraphQLInspection> inspectionClass,
                                        @Nullable Function<AnnotationBuilder, AnnotationBuilder> annotationBuilderProcessor) {
        AnnotationBuilder annotationBuilder = createAnnotationBuilder(annotationHolder, element, message, inspectionClass);
        if (annotationBuilder == null) {
```

### BoundedWildcard
Can generalize to `? extends AnnotationBuilder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/inspections/GraphQLInspection.java`
#### Snippet
```java
                                        @NotNull String message,
                                        @Nullable Class<? extends GraphQLInspection> inspectionClass,
                                        @Nullable Function<AnnotationBuilder, AnnotationBuilder> annotationBuilderProcessor) {
        AnnotationBuilder annotationBuilder = createAnnotationBuilder(annotationHolder, element, message, inspectionClass);
        if (annotationBuilder == null) {
```

### BoundedWildcard
Can generalize to `? extends com.intellij.lang.jsgraphql.types.schema.GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java

            private void addArgumentResults(@NotNull CompletionResultSet result,
                                            @NotNull List<com.intellij.lang.jsgraphql.types.schema.GraphQLArgument> arguments,
                                            @NotNull Set<String> existingArgumentNames) {
                for (com.intellij.lang.jsgraphql.types.schema.GraphQLArgument graphQLArgument : arguments) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
     * @param findMore            optional function to stop once a specific fragment has been found
     */
    private static void findFragmentsInsideOperation(PsiElement operationOrFragment, Map<String, GraphQLFragmentDefinition> foundFragments,
                                                     Function<GraphQLFragmentDefinition, Boolean> findMore) {

```

### BoundedWildcard
Can generalize to `? super GraphQLFragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
     * @param findMore            optional function to stop once a specific fragment has been found
     */
    private static void findFragmentsInsideOperation(PsiElement operationOrFragment, Map<String, GraphQLFragmentDefinition> foundFragments,
                                                     Function<GraphQLFragmentDefinition, Boolean> findMore) {

```

### BoundedWildcard
Can generalize to `? super GraphQLFragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
     */
    private static void findFragmentsInsideOperation(PsiElement operationOrFragment, Map<String, GraphQLFragmentDefinition> foundFragments,
                                                     Function<GraphQLFragmentDefinition, Boolean> findMore) {

        operationOrFragment.accept(new PsiRecursiveElementVisitor() {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionResultToSchema.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @NotNull
    private List<InputValueDefinition> createInputValueDefinitions(@Nullable List<Map<String, Object>> args) {
        if (args == null) return ContainerUtil.emptyList();

```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionResultToSchema.java`
#### Snippet
```java

    @NotNull
    private List<FieldDefinition> createFields(@Nullable List<Map<String, Object>> fields) {
        if (fields == null) return ContainerUtil.emptyList();

```

### BoundedWildcard
Can generalize to `? super StructureViewTreeElement`
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewTreeElement.java`
#### Snippet
```java
    }

    private void addSelectionSetChildren(List<StructureViewTreeElement> children) {
        GraphQLSelectionSet selectionSet;
        if (childrenBase instanceof GraphQLSelectionSet) {
```

### BoundedWildcard
Can generalize to `? super StructureViewTreeElement`
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewTreeElement.java`
#### Snippet
```java
    }

    private void addFileChildren(List<StructureViewTreeElement> children) {

        for (PsiElement child : childrenBase.getChildren()) {
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/ParseAndValidateResult.java`
#### Snippet
```java
    }

    public ParseAndValidateResult transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder()
                .document(document).variables(variables).syntaxException(syntaxException).validationErrors(validationErrors);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/ExecutionInput.java`
#### Snippet
```java
     * @return a new ExecutionInput object based on calling build on that builder
     */
    public ExecutionInput transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder()
                .query(this.query)
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
     * @return a new GraphQL object based on calling build on that builder
     */
    public GraphQL transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this.graphQLSchema);
        builder
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/InterThreadMemoizedSupplier.java`
#### Snippet
```java
    private T value;

    public InterThreadMemoizedSupplier(Supplier<T> delegate) {
        this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/ExecutionResultImpl.java`
#### Snippet
```java
        }

        public Builder addErrors(List<GraphQLError> errors) {
            this.errors.addAll(errors);
            return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/ExecutionResultImpl.java`
#### Snippet
```java
    }

    private Object errorsToSpec(List<GraphQLError> errors) {
        return map(errors, GraphQLError::toSpecification);
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/ExecutionResultImpl.java`
#### Snippet
```java
    }

    public ExecutionResultImpl transform(Consumer<Builder> builderConsumer) {
        Builder builder = newExecutionResult().from(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
    }

    public static List<GraphQLDirective> enforceAddAll(List<GraphQLDirective> targetList, List<GraphQLDirective> newDirectives) {
        assertNotNull(targetList, () -> "directive list can't be null");
        assertNotNull(newDirectives, () -> "directive list can't be null");
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
    }

    public static GraphQLDirective nonRepeatedDirectiveByNameWithAssert(Map<String, List<GraphQLDirective>> directives,
                                                                        String directiveName) {
        List<GraphQLDirective> directiveList = directives.get(directiveName);
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java


    public static boolean isAllNonRepeatable(List<GraphQLDirective> directives) {
        if (directives == null || directives.isEmpty()) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends DirectiveDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
    }

    public static List<Directive> nonRepeatableDirectivesOnly(Map<String, DirectiveDefinition> directiveDefinitionMap,
                                                              List<Directive> directives) {
        return directives.stream().filter(directive -> {
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java

    public static List<Directive> nonRepeatableDirectivesOnly(Map<String, DirectiveDefinition> directiveDefinitionMap,
                                                              List<Directive> directives) {
        return directives.stream().filter(directive -> {
            String directiveName = directive.getName();
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java


    public static Map<String, GraphQLDirective> nonRepeatableDirectivesByName(List<GraphQLDirective> directives) {
        // filter the repeatable directives
        List<GraphQLDirective> singletonDirectives = directives.stream()
```

### BoundedWildcard
Can generalize to `? super Class`
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
                                   TraverserContext<T> parent,
                                   Set<T> visited,
                                   Map<Class<?>, Object> vars,
                                   Object sharedContextData,
                                   NodeLocation location,
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
    }

    public NodeZipper<T> modifyNode(Function<T, T> transform) {
        return new NodeZipper<T>(transform.apply(curNode), breadcrumbs, nodeAdapter, this.modificationType);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
    }

    public NodeZipper<T> modifyNode(Function<T, T> transform) {
        return new NodeZipper<T>(transform.apply(curNode), breadcrumbs, nodeAdapter, this.modificationType);
    }
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
    }

    private NodeZipper<T> moveUp(T parent, List<NodeZipper<T>> sameParent) {
        assertNotEmpty(sameParent, () -> "expected at least one zipper");

```

### BoundedWildcard
Can generalize to `? extends Map`>
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserState.java`
#### Snippet
```java

        @Override
        public void pushAll(TraverserContext<U> traverserContext, Function<? super U, Map<String, ? extends List<U>>> getChildren) {
            super.state.push(traverserContext);

```

### BoundedWildcard
Can generalize to `? extends Map`>
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserState.java`
#### Snippet
```java

        @Override
        public void pushAll(TraverserContext<U> traverserContext, Function<? super U, Map<String, ? extends List<U>>> getChildren) {
            Map<String, List<TraverserContext<U>>> childrenContextMap = new LinkedHashMap<>();
            if (!traverserContext.isDeleted()) {
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparatorEnvironment.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder.
     */
    public GraphqlTypeComparatorEnvironment transform(Consumer<Builder> builderConsumer) {
        Builder builder = newEnvironment(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
     * @return a new field based on calling build on that builder
     */
    public GraphQLArgument transform(Consumer<Builder> builderConsumer) {
        Builder builder = newArgument(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
    }

    private static <T> List<T> addElementToList(List<T> list, T element) {
        ArrayList<T> result = new ArrayList<>(list);
        result.add(element);
```

### BoundedWildcard
Can generalize to `? extends NormalizedField`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
    private Set<String> flattenedFieldsForGlobSearching;

    private DataFetchingFieldSelectionSetImpl(Supplier<NormalizedField> normalizedFieldSupplier) {
        this.normalizedFieldSupplier = normalizedFieldSupplier;
        this.computedValues = false;
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        }

        private NodeZipper<T> moveUp(T parent, List<NodeZipper<T>> sameParent) {
            assertNotEmpty(sameParent, () -> "expected at least one zipper");

```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
    }

    public SchemaElementChildrenContainer transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
    private final Map<String, List<GraphQLSchemaElement>> children = new LinkedHashMap<>();

    private SchemaElementChildrenContainer(Map<String, List<GraphQLSchemaElement>> children) {
        this.children.putAll(assertNotNull(children));
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumValueDefinition.java`
#### Snippet
```java
     * @return a new field based on calling build on that builder
     */
    public GraphQLEnumValueDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = newEnumValueDefinition(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchemaElementAdapter.java`
#### Snippet
```java

    @Override
    public GraphQLSchemaElement withNewChildren(GraphQLSchemaElement node, Map<String, List<GraphQLSchemaElement>> newChildren) {
        SchemaElementChildrenContainer childrenContainer = SchemaElementChildrenContainer.newSchemaElementChildrenContainer(newChildren).build();
        return node.withNewChildren(childrenContainer);
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeCollectingVisitor.java`
#### Snippet
```java
        Enforcing this helps avoid problems later down the track fo example https://github.com/graphql-java/graphql-java/issues/373
    */
    private void assertTypeUniqueness(GraphQLNamedType type, Map<String, GraphQLNamedType> result) {
        GraphQLType existingType = result.get(type.getName());
        // do we have an existing definition
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLInputObjectField transform(Consumer<Builder> builderConsumer) {
        Builder builder = newInputObjectField(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeVisitor.java`
#### Snippet
```java
     * @return this will always sent back TraversalControl.CONTINUE
     */
    default TraversalControl insertBeforeNode(GraphQLSchemaElement toInsertBefore, TraverserContext<GraphQLSchemaElement> context) {
        return TreeTransformerUtil.insertBefore(context, toInsertBefore);
    }
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeVisitor.java`
#### Snippet
```java
     * @return this will always sent back TraversalControl.CONTINUE
     */
    default TraversalControl insertAfterNode(GraphQLSchemaElement toInsertAfter, TraverserContext<GraphQLSchemaElement> context) {
        return TreeTransformerUtil.insertAfter(context, toInsertAfter);
    }
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeVisitor.java`
#### Snippet
```java
     * @return this will always sent back TraversalControl.CONTINUE
     */
    default TraversalControl changedNode(GraphQLSchemaElement newChangedNode, TraverserContext<GraphQLSchemaElement> context) {
        return TreeTransformerUtil.changeNode(context, newChangedNode);
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirective.java`
#### Snippet
```java
     * @return a new field based on calling build on that builder
     */
    public GraphQLDirective transform(Consumer<Builder> builderConsumer) {
        Builder builder = newDirective(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirective.java`
#### Snippet
```java
        }

        public Builder replaceArguments(List<GraphQLArgument> arguments) {
            assertNotNull(arguments, () -> "arguments must not be null");
            this.arguments.clear();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java
     * @return a new allocated list of sorted things
     */
    public static <T extends GraphQLSchemaElement> List<T> sortTypes(Comparator<? super GraphQLSchemaElement> comparator, Collection<T> types) {
        List<T> sorted = new ArrayList<>(types);
        sorted.sort(comparator);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <K, V, U> List<U> mapEntries(Map<K, V> map, BiFunction<K, V, U> function) {
        return map.entrySet().stream().map(entry -> function.apply(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <K, V, U> List<U> mapEntries(Map<K, V> map, BiFunction<K, V, U> function) {
        return map.entrySet().stream().map(entry -> function.apply(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <K, V, U> List<U> mapEntries(Map<K, V> map, BiFunction<K, V, U> function) {
        return map.entrySet().stream().map(entry -> function.apply(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <K, V, U> List<U> mapEntries(Map<K, V> map, BiFunction<K, V, U> function) {
        return map.entrySet().stream().map(entry -> function.apply(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <K, V, U> List<U> mapEntries(Map<K, V> map, BiFunction<K, V, U> function) {
        return map.entrySet().stream().map(entry -> function.apply(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
     * @return a <strong>new</strong> list composed of the two concatenated lists elements
     */
    public static <T> List<T> concat(List<T> l1, List<T> l2) {
        ArrayList<T> l = new ArrayList<>(l1);
        l.addAll(l2);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
     * @return a <strong>new</strong> list composed of the two concatenated lists elements
     */
    public static <T> List<T> concat(List<T> l1, List<T> l2) {
        ArrayList<T> l = new ArrayList<>(l1);
        l.addAll(l2);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T, NewKey> Map<NewKey, T> groupingByUniqueKey(Collection<T> list, Function<T, NewKey> keyFunction) {
        return list.stream().collect(Collectors.toMap(
            keyFunction,
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T, NewKey> Map<NewKey, T> groupingByUniqueKey(Collection<T> list, Function<T, NewKey> keyFunction) {
        return list.stream().collect(Collectors.toMap(
            keyFunction,
```

### BoundedWildcard
Can generalize to `? extends NewKey`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T, NewKey> Map<NewKey, T> groupingByUniqueKey(Collection<T> list, Function<T, NewKey> keyFunction) {
        return list.stream().collect(Collectors.toMap(
            keyFunction,
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> List<T> filterList(Collection<T> list, Predicate<T> filter) {
        return list
                .stream()
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> List<T> filterList(Collection<T> list, Predicate<T> filter) {
        return list
                .stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    //
    // quickly turn a map of values into its list equivalent
    public static <T> List<T> valuesToList(Map<?, T> map) {
        return new ArrayList<>(map.values());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> int findIndex(List<T> list, Predicate<T> filter) {
        for (int i = 0; i < list.size(); i++) {
            if (filter.test(list.get(i))) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> int findIndex(List<T> list, Predicate<T> filter) {
        for (int i = 0; i < list.size(); i++) {
            if (filter.test(list.get(i))) {
```

### BoundedWildcard
Can generalize to `? extends List`>
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<List<T>> flatList(CompletableFuture<List<List<T>>> cf) {
        return cf.thenApply(FpKit::flatList);
    }
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> List<T> flatList(List<List<T>> listLists) {
        return listLists.stream()
            .flatMap(List::stream)
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java

    // normal groupingBy but with LinkedHashMap
    public static <T, NewKey> Map<NewKey, ImmutableList<T>> groupingBy(Collection<T> list, Function<T, NewKey> function) {
        return list.stream().collect(Collectors.groupingBy(function, LinkedHashMap::new, mapping(Function.identity(), ImmutableList.toImmutableList())));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java

    // normal groupingBy but with LinkedHashMap
    public static <T, NewKey> Map<NewKey, ImmutableList<T>> groupingBy(Collection<T> list, Function<T, NewKey> function) {
        return list.stream().collect(Collectors.groupingBy(function, LinkedHashMap::new, mapping(Function.identity(), ImmutableList.toImmutableList())));
    }
```

### BoundedWildcard
Can generalize to `? extends NewKey`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java

    // normal groupingBy but with LinkedHashMap
    public static <T, NewKey> Map<NewKey, ImmutableList<T>> groupingBy(Collection<T> list, Function<T, NewKey> function) {
        return list.stream().collect(Collectors.groupingBy(function, LinkedHashMap::new, mapping(Function.identity(), ImmutableList.toImmutableList())));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    }

    public static <T> Optional<T> findOne(Collection<T> list, Predicate<T> filter) {
        return list
            .stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    //
    // From a list of named things, get a map of them by name, merging them according to the merge function
    public static <T> Map<String, T> getByName(List<T> namedObjects, Function<T, String> nameFn, BinaryOperator<T> mergeFunc) {
        return namedObjects.stream().collect(Collectors.toMap(
            nameFn,
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java
    //
    // From a list of named things, get a map of them by name, merging them according to the merge function
    public static <T> Map<String, T> getByName(List<T> namedObjects, Function<T, String> nameFn, BinaryOperator<T> mergeFunc) {
        return namedObjects.stream().collect(Collectors.toMap(
            nameFn,
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLScalarType.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLScalarType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newScalar(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends FragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironmentImpl.java`
#### Snippet
```java
        }

        public Builder fragmentsByName(Map<String, FragmentDefinition> fragmentsByName) {
            this.fragmentsByName = ImmutableMap.copyOf(fragmentsByName);
            return this;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeBuilder.java`
#### Snippet
```java
    }

    <T extends GraphQLSchemaElement> List<T> sort(List<T> types, Class<? extends GraphQLSchemaElement> parentType, Class<? extends GraphQLSchemaElement> elementType) {
        Comparator<? super GraphQLSchemaElement> comparator = getComparatorImpl(comparatorRegistry, parentType, elementType);
        return ImmutableList.copyOf(GraphqlTypeComparators.sortTypes(comparator, types));
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
     * @return a new GraphQLCodeRegistry object based on calling build on that builder
     */
    public GraphQLCodeRegistry transform(Consumer<Builder> builderConsumer) {
        Builder builder = newCodeRegistry(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends TypeResolver`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static TypeResolver getTypeResolverForUnion(GraphQLUnionType parentType, Map<String, TypeResolver> typeResolverMap) {
        assertNotNull(parentType);
        TypeResolver typeResolver = typeResolverMap.get(parentType.getName());
```

### BoundedWildcard
Can generalize to `? extends DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
         * @return this builder
         */
        public Builder dataFetchers(String parentTypeName, Map<String, DataFetcher<?>> fieldDataFetchers) {
            assertNotNull(fieldDataFetchers);
            fieldDataFetchers.forEach((fieldName, dataFetcher) -> dataFetcher(coordinates(parentTypeName, fieldName), dataFetcher));
```

### BoundedWildcard
Can generalize to `? extends DataFetcherFactory`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static boolean hasDataFetcherImpl(FieldCoordinates coords, Map<FieldCoordinates, DataFetcherFactory<?>> dataFetcherMap, Map<String, DataFetcherFactory<?>> systemDataFetcherMap) {
        assertNotNull(coords);

```

### BoundedWildcard
Can generalize to `? extends DataFetcherFactory`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static boolean hasDataFetcherImpl(FieldCoordinates coords, Map<FieldCoordinates, DataFetcherFactory<?>> dataFetcherMap, Map<String, DataFetcherFactory<?>> systemDataFetcherMap) {
        assertNotNull(coords);

```

### BoundedWildcard
Can generalize to `? extends DataFetcherFactory`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static DataFetcher<?> getDataFetcherImpl(FieldCoordinates coordinates, GraphQLFieldDefinition fieldDefinition, Map<FieldCoordinates, DataFetcherFactory<?>> dataFetcherMap, Map<String, DataFetcherFactory<?>> systemDataFetcherMap, DataFetcherFactory<?> defaultDataFetcherFactory) {
        assertNotNull(coordinates);
        assertNotNull(fieldDefinition);
```

### BoundedWildcard
Can generalize to `? extends DataFetcherFactory`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static DataFetcher<?> getDataFetcherImpl(FieldCoordinates coordinates, GraphQLFieldDefinition fieldDefinition, Map<FieldCoordinates, DataFetcherFactory<?>> dataFetcherMap, Map<String, DataFetcherFactory<?>> systemDataFetcherMap, DataFetcherFactory<?> defaultDataFetcherFactory) {
        assertNotNull(coordinates);
        assertNotNull(fieldDefinition);
```

### BoundedWildcard
Can generalize to `? extends TypeResolver`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
    }

    private static TypeResolver getTypeResolverForInterface(GraphQLInterfaceType parentType, Map<String, TypeResolver> typeResolverMap) {
        assertNotNull(parentType);
        TypeResolver typeResolver = typeResolverMap.get(parentType.getName());
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLUnionType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newUnionType(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedOutputType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
    }

    void replaceTypes(List<GraphQLNamedOutputType> types) {
        this.replacedTypes = ImmutableList.copyOf(types);
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
        }

        public Builder replaceArguments(List<GraphQLArgument> arguments) {
            assertNotNull(arguments, () -> "arguments can't be null");
            this.arguments.clear();
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
         * @return this
         */
        public Builder arguments(List<GraphQLArgument> arguments) {
            assertNotNull(arguments, () -> "arguments can't be null");
            for (GraphQLArgument argument : arguments) {
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
     * @return a new field based on calling build on that builder
     */
    public GraphQLFieldDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = newFieldDefinition(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLEnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
        }

        public Builder replaceValues(List<GraphQLEnumValueDefinition> valueDefinitions) {
            this.values.clear();
            valueDefinitions.forEach(this::value);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
     * @return a new field based on calling build on that builder
     */
    public GraphQLEnumType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newEnum(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLEnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
    }

    private ImmutableMap<String, GraphQLEnumValueDefinition> buildMap(List<GraphQLEnumValueDefinition> values) {
        return ImmutableMap.copyOf(FpKit.getByName(values, GraphQLEnumValueDefinition::getName,
                (fld1, fld2) -> assertShouldNeverHappen("Duplicated definition for field '%s' in type '%s'", fld1.getName(), this.name)));
```

### BoundedWildcard
Can generalize to `? extends GraphQLEnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
        }

        public Builder values(List<GraphQLEnumValueDefinition> valueDefinitions) {
            valueDefinitions.forEach(this::value);
            return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaUtil.java`
#### Snippet
```java


    ImmutableMap<String, GraphQLNamedType> allTypes(final GraphQLSchema schema, final Set<GraphQLType> additionalTypes, boolean afterTransform) {
        List<GraphQLSchemaElement> roots = new ArrayList<>();
        if (schema.isQueryDefined()) {
```

### BoundedWildcard
Can generalize to `? super DataFetchingEnvironment`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java
     * @return a new data fetcher that wraps the provided data fetcher
     */
    public static DataFetcher wrapDataFetcher(DataFetcher delegateDataFetcher, BiFunction<DataFetchingEnvironment, Object, Object> mapFunction) {
        return environment -> {
            Object value = delegateDataFetcher.get(environment);
```

### BoundedWildcard
Can generalize to `? extends Comparator`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DefaultGraphqlTypeComparatorRegistry.java`
#### Snippet
```java
    }

    private DefaultGraphqlTypeComparatorRegistry(Map<GraphqlTypeComparatorEnvironment, Comparator<?>> registry) {
        this.registry = registry;
    }
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringSchemaGeneratorPostProcessing.java`
#### Snippet
```java
        }

        private TraversalControl changOrContinue(GraphQLSchemaElement node, GraphQLSchemaElement newNode, TraverserContext<GraphQLSchemaElement> context) {
            if (node != newNode) {
                TreeTransformerUtil.changeNode(context, newNode);
```

### BoundedWildcard
Can generalize to `? extends NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringSchemaGeneratorPostProcessing.java`
#### Snippet
```java
        }

        private <T extends GraphQLNamedType> boolean notSuitable(T node, Function<T, NamedNode<?>> suitableFunc) {
            if (isIntrospectionType(node)) {
                return true;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
     * @return a new GraphQLSchema object based on calling build on that builder
     */
    public GraphQLSchema transform(Consumer<Builder> builderConsumer) {
        Builder builder = newSchema(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        }

        public Builder additionalDirectives(Set<GraphQLDirective> additionalDirectives) {
            this.additionalDirectives.addAll(additionalDirectives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        }

        public Builder additionalTypes(Set<GraphQLType> additionalTypes) {
            this.additionalTypes.addAll(additionalTypes);
            return this;
```

### BoundedWildcard
Can generalize to `? super RuntimeWiring.Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
    }

    public static RuntimeWiring newEchoingWiring(Consumer<RuntimeWiring.Builder> builderConsumer) {
        RuntimeWiring.Builder builder = RuntimeWiring.newRuntimeWiring();
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void replaceTypeReferences(DummyRoot dummyRoot, GraphQLCodeRegistry.Builder codeRegistry, Map<String, GraphQLNamedType> changedTypes) {
        GraphQLTypeVisitor typeRefVisitor = new GraphQLTypeVisitorStub() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends List`>
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    private NodeZipper<GraphQLSchemaElement> moveUp(
            GraphQLSchemaElement parent,
            Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> sameParentsZipper) {
        Set<NodeZipper<GraphQLSchemaElement>> sameParent = sameParentsZipper.keySet();
        assertNotEmpty(sameParent, () -> "expected at least one zipper");
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java

    private void visit(GraphQLSchemaElement n,
                       Set<GraphQLSchemaElement> tempMarked,
                       Set<GraphQLSchemaElement> permMarked,
                       Set<GraphQLSchemaElement> notPermMarked,
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    private void visit(GraphQLSchemaElement n,
                       Set<GraphQLSchemaElement> tempMarked,
                       Set<GraphQLSchemaElement> permMarked,
                       Set<GraphQLSchemaElement> notPermMarked,
                       List<GraphQLSchemaElement> result,
```

### BoundedWildcard
Can generalize to `? super GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                       Set<GraphQLSchemaElement> permMarked,
                       Set<GraphQLSchemaElement> notPermMarked,
                       List<GraphQLSchemaElement> result,
                       Map<GraphQLSchemaElement, List<GraphQLSchemaElement>> reverseDependencies) {
        /**
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                       Set<GraphQLSchemaElement> notPermMarked,
                       List<GraphQLSchemaElement> result,
                       Map<GraphQLSchemaElement, List<GraphQLSchemaElement>> reverseDependencies) {
        /**
         * Taken from: https://en.wikipedia.org/wiki/Topological_sorting#Depth-first_search
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void traverseAndTransform(DummyRoot dummyRoot, Map<String, GraphQLNamedType> changedTypes, Map<String, GraphQLTypeReference> typeReferences, GraphQLTypeVisitor visitor, GraphQLCodeRegistry.Builder codeRegistry) {
        List<NodeZipper<GraphQLSchemaElement>> zippers = new LinkedList<>();
        Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> zipperByNodeAfterTraversing = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? super GraphQLNamedType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void traverseAndTransform(DummyRoot dummyRoot, Map<String, GraphQLNamedType> changedTypes, Map<String, GraphQLTypeReference> typeReferences, GraphQLTypeVisitor visitor, GraphQLCodeRegistry.Builder codeRegistry) {
        List<NodeZipper<GraphQLSchemaElement>> zippers = new LinkedList<>();
        Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> zipperByNodeAfterTraversing = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void traverseAndTransform(DummyRoot dummyRoot, Map<String, GraphQLNamedType> changedTypes, Map<String, GraphQLTypeReference> typeReferences, GraphQLTypeVisitor visitor, GraphQLCodeRegistry.Builder codeRegistry) {
        List<NodeZipper<GraphQLSchemaElement>> zippers = new LinkedList<>();
        Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> zipperByNodeAfterTraversing = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? super GraphQLTypeReference`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void traverseAndTransform(DummyRoot dummyRoot, Map<String, GraphQLNamedType> changedTypes, Map<String, GraphQLTypeReference> typeReferences, GraphQLTypeVisitor visitor, GraphQLCodeRegistry.Builder codeRegistry) {
        List<NodeZipper<GraphQLSchemaElement>> zippers = new LinkedList<>();
        Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> zipperByNodeAfterTraversing = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private void zipUpToDummyRoot(List<NodeZipper<GraphQLSchemaElement>> zippers,
                                  List<GraphQLSchemaElement> topSort,
                                  Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> breadcrumbsByZipper,
```

### BoundedWildcard
Can generalize to `? extends GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java

    private void zipUpToDummyRoot(List<NodeZipper<GraphQLSchemaElement>> zippers,
                                  List<GraphQLSchemaElement> topSort,
                                  Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> breadcrumbsByZipper,
                                  Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> nodeToZipper) {
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                                  List<GraphQLSchemaElement> topSort,
                                  Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> breadcrumbsByZipper,
                                  Map<GraphQLSchemaElement, NodeZipper<GraphQLSchemaElement>> nodeToZipper) {
        if (zippers.size() == 0) {
            return;
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java

    private Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> zipperWithSameParent(GraphQLSchemaElement parent,
                                                                                                               Set<NodeZipper<GraphQLSchemaElement>> zippers,
                                                                                                               Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> curBreadcrumbsByZipper) {
        Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> result = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends List`>>
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    private Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> zipperWithSameParent(GraphQLSchemaElement parent,
                                                                                                               Set<NodeZipper<GraphQLSchemaElement>> zippers,
                                                                                                               Map<NodeZipper<GraphQLSchemaElement>, List<List<Breadcrumb<GraphQLSchemaElement>>>> curBreadcrumbsByZipper) {
        Map<NodeZipper<GraphQLSchemaElement>, List<Breadcrumb<GraphQLSchemaElement>>> result = new LinkedHashMap<>();
        outer:
```

### BoundedWildcard
Can generalize to `? extends GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
    }

    private List<GraphQLSchemaElement> topologicalSort(Set<GraphQLSchemaElement> allNodes, Map<GraphQLSchemaElement, List<GraphQLSchemaElement>> reverseDependencies) {
        List<GraphQLSchemaElement> result = new ArrayList<>();
        Set<GraphQLSchemaElement> notPermMarked = new LinkedHashSet<>(allNodes);
```

### BoundedWildcard
Can generalize to `? extends DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeRuntimeWiring.java`
#### Snippet
```java
         * @return the current type wiring
         */
        public Builder dataFetchers(Map<String, DataFetcher> dataFetchersMap) {
            assertNotNull(dataFetchersMap, () -> "you must provide a data fetchers map");
            fieldDataFetchers.putAll(dataFetchersMap);
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java
    }

    private void assertTypeName(UnionTypeDefinition unionTypeDefinition, List<GraphQLError> errors) {
        if (unionTypeDefinition.getName().length() >= 2 && unionTypeDefinition.getName().startsWith("__")) {
            errors.add((new IllegalNameError(unionTypeDefinition)));
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/FetchSchemaDirectiveWiring.java`
#### Snippet
```java

    @Override
    public GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> environment) {
        GraphQLFieldDefinition field = environment.getElement();
        String fetchName = atFetchFromSupport(field.getName(), field.getDirectives());
```

### BoundedWildcard
Can generalize to `? extends GraphQLInterfaceType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
        }

        public Builder replaceInterfaces(List<GraphQLInterfaceType> interfaces) {
            assertNotNull(interfaces, () -> "interfaces can't be null");
            this.interfaces.clear();
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedOutputType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
    }

    void replaceInterfaces(List<GraphQLNamedOutputType> interfaces) {
        this.replacedInterfaces = ImmutableList.copyOf(sortTypes(interfaceComparator, interfaces));
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
    }

    private void buildDefinitionMap(List<GraphQLFieldDefinition> fieldDefinitions) {
        for (GraphQLFieldDefinition fieldDefinition : fieldDefinitions) {
            String name = fieldDefinition.getName();
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
        }

        public Builder replaceFields(List<GraphQLFieldDefinition> fieldDefinitions) {
            assertNotNull(fieldDefinitions, () -> "fieldDefinitions can't be null");
            this.fields.clear();
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLInterfaceType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newInterface(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
        }

        public Builder fields(List<GraphQLFieldDefinition> fieldDefinitions) {
            assertNotNull(fieldDefinitions, () -> "fieldDefinitions can't be null");
            fieldDefinitions.forEach(this::field);
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputObjectType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLInputObjectType onInputObjectType(SchemaDirectiveWiringEnvironment<GraphQLInputObjectType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLEnumType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLEnumType onEnum(SchemaDirectiveWiringEnvironment<GraphQLEnumType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLEnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLEnumValueDefinition onEnumValue(SchemaDirectiveWiringEnvironment<GraphQLEnumValueDefinition> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLInterfaceType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLInterfaceType onInterface(SchemaDirectiveWiringEnvironment<GraphQLInterfaceType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLUnionType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLUnionType onUnion(SchemaDirectiveWiringEnvironment<GraphQLUnionType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputObjectField`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLInputObjectField onInputObjectField(SchemaDirectiveWiringEnvironment<GraphQLInputObjectField> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLScalarType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLScalarType onScalar(SchemaDirectiveWiringEnvironment<GraphQLScalarType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLArgument onArgument(SchemaDirectiveWiringEnvironment<GraphQLArgument> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLObjectType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
     * @return a non null element based on the original one
     */
    default GraphQLObjectType onObject(SchemaDirectiveWiringEnvironment<GraphQLObjectType> environment) {
        return environment.getElement();
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputObjectField`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectType.java`
#### Snippet
```java
        }

        public Builder fields(List<GraphQLInputObjectField> fields) {
            fields.forEach(this::field);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectType.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLInputObjectType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newInputObject(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputObjectField`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectType.java`
#### Snippet
```java
        }

        public Builder replaceFields(List<GraphQLInputObjectField> fields) {
            this.fields.clear();
            fields.forEach(this::field);
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputObjectField`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectType.java`
#### Snippet
```java
    }

    private ImmutableMap<String, GraphQLInputObjectField> buildDefinitionMap(List<GraphQLInputObjectField> fieldDefinitions) {
        return ImmutableMap.copyOf(FpKit.getByName(fieldDefinitions, GraphQLInputObjectField::getName,
                (fld1, fld2) -> assertShouldNeverHappen("Duplicated definition for field '%s' in type '%s'", fld1.getName(), this.name)));
```

### BoundedWildcard
Can generalize to `? extends InterfaceTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            TypeDefinitionRegistry typeRegistry,
            ImplementingTypeDefinition type,
            Map<InterfaceTypeDefinition, ImplementingTypeDefinition> implementedInterfaces
    ) {
        Set<FieldDefinition> fieldDefinitions = getLogicallyDeclaredFields(type, typeRegistry);
```

### BoundedWildcard
Can generalize to `? extends ImplementingTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            TypeDefinitionRegistry typeRegistry,
            ImplementingTypeDefinition type,
            Map<InterfaceTypeDefinition, ImplementingTypeDefinition> implementedInterfaces
    ) {
        Set<FieldDefinition> fieldDefinitions = getLogicallyDeclaredFields(type, typeRegistry);
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
    }

    private Set<InterfaceTypeDefinition> toInterfaceTypeDefinitions(TypeDefinitionRegistry typeRegistry, Collection<Type> implementsTypes) {
        return TypeDefinitionRegistry.fromSourceNodes(
            implementsTypes.stream()
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java

    private void checkAncestorImplementation(
            List<GraphQLError> errors,
            TypeDefinitionRegistry typeRegistry,
            ImplementingTypeDefinition type,
```

### BoundedWildcard
Can generalize to `? extends InterfaceTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            TypeDefinitionRegistry typeRegistry,
            ImplementingTypeDefinition type,
            Map<InterfaceTypeDefinition, ImplementingTypeDefinition> implementedInterfaces) {

        if (implementedInterfaces.containsKey(type)) {
```

### BoundedWildcard
Can generalize to `? extends ImplementingTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            TypeDefinitionRegistry typeRegistry,
            ImplementingTypeDefinition type,
            Map<InterfaceTypeDefinition, ImplementingTypeDefinition> implementedInterfaces) {

        if (implementedInterfaces.containsKey(type)) {
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            FieldDefinition objectFieldDef,
            FieldDefinition interfaceFieldDef,
            List<GraphQLError> errors
    ) {
        List<InputValueDefinition> objectArgs = objectFieldDef.getInputValueDefinitions();
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java

    private Map<InterfaceTypeDefinition, ImplementingTypeDefinition> checkInterfacesNotImplementedMoreThanOnce(
            List<GraphQLError> errors,
            ImplementingTypeDefinition type,
            TypeDefinitionRegistry typeRegistry
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorDirectiveHelper.java`
#### Snippet
```java
    }

    private <T> boolean isNotTheSameObjects(List<T> starting, List<T> ending) {
        if (starting == ending) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorDirectiveHelper.java`
#### Snippet
```java
    }

    private <T> boolean isNotTheSameObjects(List<T> starting, List<T> ending) {
        if (starting == ending) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends GraphQLScalarType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ScalarInfo.java`
#### Snippet
```java
    }

    private static boolean inList(List<GraphQLScalarType> scalarList, String scalarTypeName) {
        return scalarList.stream().anyMatch(sc -> sc.getName().equals(scalarTypeName));
    }
```

### BoundedWildcard
Can generalize to `? extends DirectiveDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
    }

    private void commonCheck(Collection<DirectiveDefinition> directiveDefinitions, List<GraphQLError> errors) {
        directiveDefinitions.forEach(directiveDefinition -> {
            assertTypeName(directiveDefinition, errors);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
    }

    private void checkDirectives(DirectiveLocation expectedLocation, List<GraphQLError> errors, TypeDefinitionRegistry typeRegistry, Node<?> element, String elementName, List<Directive> directives) {
        directives.forEach(directive -> {
            Optional<DirectiveDefinition> directiveDefinition = typeRegistry.getDirectiveDefinition(directive.getName());
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
    }

    private void assertTypeName(NamedNode node, List<GraphQLError> errors) {
        if (node.getName().length() >= 2 && node.getName().startsWith("__")) {
            errors.add((new IllegalNameError(node)));
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
    }

    private void checkFieldsDirectives(List<GraphQLError> errors, TypeDefinitionRegistry typeRegistry, List<FieldDefinition> fieldDefinitions) {
        fieldDefinitions.forEach(definition -> {
            checkDirectives(FIELD_DEFINITION, errors, typeRegistry, definition, definition.getName(), definition.getDirectives());
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
    }

    public void assertExistAndIsInputType(InputValueDefinition definition, List<GraphQLError> errors) {
        TypeName namedType = TypeUtil.unwrapAll(definition.getType());

```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
    }

    private void addValidationError(List<GraphQLError> errors, String message, Object... args) {
        errors.add(new DirectiveIllegalArgumentTypeError(element, elementName, directive.getName(), argument.getName(), String.format(message, args)));
    }
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
    }

    static void defineOperationDefs(List<GraphQLError> errors, Collection<OperationTypeDefinition> newOperationDefs, Map<String, OperationTypeDefinition> existingOperationDefs) {
        for (OperationTypeDefinition operationTypeDefinition : newOperationDefs) {
            OperationTypeDefinition oldEntry = existingOperationDefs.get(operationTypeDefinition.getName());
```

### BoundedWildcard
Can generalize to `? extends OperationTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
    }

    static void defineOperationDefs(List<GraphQLError> errors, Collection<OperationTypeDefinition> newOperationDefs, Map<String, OperationTypeDefinition> existingOperationDefs) {
        for (OperationTypeDefinition operationTypeDefinition : newOperationDefs) {
            OperationTypeDefinition oldEntry = existingOperationDefs.get(operationTypeDefinition.getName());
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
    }

    static void defineOperationDefs(List<GraphQLError> errors, Collection<OperationTypeDefinition> newOperationDefs, Map<String, OperationTypeDefinition> existingOperationDefs) {
        for (OperationTypeDefinition operationTypeDefinition : newOperationDefs) {
            OperationTypeDefinition oldEntry = existingOperationDefs.get(operationTypeDefinition.getName());
```

### BoundedWildcard
Can generalize to `? extends SchemaExtensionDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
                                           List<GraphQLError> errors,
                                           SchemaDefinition schema,
                                           List<SchemaExtensionDefinition> schemaExtensionDefinitions) {
        if (schema != null) {
            defineOperationDefs(errors, schema.getOperationTypeDefinitions(), operationDefs);
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
    }

    private static Consumer<OperationTypeDefinition> checkOperationTypesExist(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors) {
        return op -> {
            TypeName unwrapped = TypeInfo.typeInfo(op.getTypeName()).getTypeName();
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
    }

    private static Consumer<OperationTypeDefinition> checkOperationTypesAreObjects(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors) {
        return op -> {
            // make sure it is defined as a ObjectTypeDef
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends TypeDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends TypeDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends TypeDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? extends SDLDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
     * @param definitions the definitions to add
     */
    public void addAll(Collection<SDLDefinition> definitions) {
        for (SDLDefinition definition : definitions) {
            add(definition);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T> void defineExt(Map<String, List<T>> typeExtensions, T newEntry, Function<T, String> namerFunc) {
        List<T> currentList = typeExtensions.computeIfAbsent(namerFunc.apply(newEntry), k -> new ArrayList<>());
        currentList.add(newEntry);
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T> void defineExt(Map<String, List<T>> typeExtensions, T newEntry, Function<T, String> namerFunc) {
        List<T> currentList = typeExtensions.computeIfAbsent(namerFunc.apply(newEntry), k -> new ArrayList<>());
        currentList.add(newEntry);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
     * @return a list of types of the target class
     */
    public <T extends TypeDefinition> List<T> getTypes(Class<T> targetClass) {
        ProgressManager.checkCanceled();
        return types.values().stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    private final List<GraphQLException> myErrors = new ArrayList<>();

    public static <T extends Node> Stream<T> fromSourceNodes(@NotNull Stream<T> definitions, @NotNull Class<T> targetClass) {
        //noinspection unchecked
        return definitions
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    private final List<GraphQLException> myErrors = new ArrayList<>();

    public static <T extends Node> Stream<T> fromSourceNodes(@NotNull Stream<T> definitions, @NotNull Class<T> targetClass) {
        //noinspection unchecked
        return definitions
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends DirectiveDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends DirectiveDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
    }

    private <T extends DirectiveDefinition> void define(Map<String, T> source, Map<String, T> target, T newEntry) {
        String name = newEntry.getName();

```

### BoundedWildcard
Can generalize to `? extends DifferenceReporter`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/ChainedReporter.java`
#### Snippet
```java
    }

    public ChainedReporter(List<DifferenceReporter> reporters) {
        this.reporters = reporters;
    }
```

### BoundedWildcard
Can generalize to `? extends SchemaValidationRule`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/SchemaValidator.java`
#### Snippet
```java

    private void traverse(GraphQLOutputType root,
                          List<SchemaValidationRule> rules,
                          SchemaValidationErrorCollector validationErrorCollector) {
        if (processed.contains(root)) {
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
     * @return a new object based on calling build on that builder
     */
    public GraphQLObjectType transform(Consumer<Builder> builderConsumer) {
        Builder builder = newObject(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
        }

        public Builder replaceFields(List<GraphQLFieldDefinition> fieldDefinitions) {
            assertNotNull(fieldDefinitions, () -> "fieldDefinitions can't be null");
            this.fields.clear();
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
    }

    private ImmutableMap<String, GraphQLFieldDefinition> buildDefinitionMap(List<GraphQLFieldDefinition> fieldDefinitions) {
        return ImmutableMap.copyOf(FpKit.getByName(fieldDefinitions, GraphQLFieldDefinition::getName,
                (fld1, fld2) -> assertShouldNeverHappen("Duplicated definition for field '%s' in type '%s'", fld1.getName(), this.name)));
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedOutputType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
    }

    void replaceInterfaces(List<GraphQLNamedOutputType> interfaces) {
        this.replacedInterfaces = ImmutableList.copyOf(sortTypes(interfaceComparator, interfaces));
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
        }

        public Builder fields(List<GraphQLFieldDefinition> fieldDefinitions) {
            assertNotNull(fieldDefinitions, () -> "fieldDefinitions can't be null");
            fieldDefinitions.forEach(this::field);
```

### BoundedWildcard
Can generalize to `? extends ScalarTypeExtensionDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
    }

    @Nullable String getSpecifiedByUrl(ScalarTypeDefinition scalarTypeDefinition, List<ScalarTypeExtensionDefinition> extensions) {
        List<Directive> allDirectives = new ArrayList<>(scalarTypeDefinition.getDirectives());
        extensions.forEach(extension -> allDirectives.addAll(extension.getDirectives()));
```

### BoundedWildcard
Can generalize to `? super Type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
    private @NotNull Optional<GraphQLArgument> buildDirectiveArgumentFromDefinition(BuildContext buildCtx,
                                                                 InputValueDefinition arg,
                                                                 Function<Type, Optional<GraphQLInputType>> inputTypeFactory) {
        GraphQLArgument.Builder builder = GraphQLArgument.newArgument()
                .name(arg.getName())
```

### BoundedWildcard
Can generalize to `? extends OperationTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
    }

    private @NotNull Optional<OperationTypeDefinition> getOperationNamed(String name, Map<String, OperationTypeDefinition> operationTypeDefs) {
        return Optional.ofNullable(operationTypeDefs.get(name));
    }
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

    GraphQLDirective @NotNull [] buildDirectives(BuildContext buildCtx,
                                       List<Directive> directives,
                                       List<Directive> extensionDirectives,
                                       DirectiveLocation directiveLocation,
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
    GraphQLDirective @NotNull [] buildDirectives(BuildContext buildCtx,
                                       List<Directive> directives,
                                       List<Directive> extensionDirectives,
                                       DirectiveLocation directiveLocation,
                                       Set<GraphQLDirective> runtimeDirectives,
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                                                     Set<GraphQLDirective> runtimeDirectives,
                                                     GraphqlTypeComparatorRegistry comparatorRegistry,
                                                     Set<String> previousNames) {
        GraphQLDirective gqlDirective = buildDirective(buildCtx, directive, runtimeDirectives, directiveLocation, comparatorRegistry);
        if (previousNames.contains(directive.getName()) && gqlDirective.isNonRepeatable()) {
```

### BoundedWildcard
Can generalize to `? extends InterfaceTypeExtensionDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                                              InterfaceTypeDefinition typeDefinition,
                                              GraphQLInterfaceType.Builder builder,
                                              List<InterfaceTypeExtensionDefinition> extensions) {
        Map<String, GraphQLOutputType> interfaces = new LinkedHashMap<>();
        typeDefinition.getImplements().forEach(type -> {
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

        @SuppressWarnings("unused")
        public void addDirectives(Set<GraphQLDirective> directives) {
            this.directives.addAll(directives);
        }
```

### BoundedWildcard
Can generalize to `? extends ObjectTypeExtensionDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                                           ObjectTypeDefinition typeDefinition,
                                           GraphQLObjectType.Builder builder,
                                           List<ObjectTypeExtensionDefinition> extensions) {
        Map<String, GraphQLOutputType> interfaces = new LinkedHashMap<>();
        typeDefinition.getImplements().forEach(type -> {
```

### BoundedWildcard
Can generalize to `? extends SchemaValidationError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/InvalidSchemaException.java`
#### Snippet
```java
    }

    private static String buildErrorMsg(Collection<SchemaValidationError> errors) {
        StringBuilder message = new StringBuilder("invalid schema:");
        for (SchemaValidationError error : errors) {
```

### BoundedWildcard
Can generalize to `? extends GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    }

    private void printType(PrintWriter out, List<GraphQLType> typesAsList, Class<?>
        typeClazz, GraphqlFieldVisibility visibility) {
        typesAsList.stream()
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    }

    private String directiveDefinitions(List<GraphQLDirective> directives) {
        StringBuilder sb = new StringBuilder();
        directives.stream().filter(options.getIncludeSchemaElement()).forEach(directive -> {
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    }

    String argsString(Class<? extends GraphQLSchemaElement> parent, List<GraphQLArgument> arguments) {
        boolean hasDescriptions = arguments.stream().anyMatch(this::hasDescription);
        String indent = hasDescriptions ? calcIndent(1) : "";
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    }

    private boolean hasDeprecatedDirective(List<GraphQLDirective> directives) {
        return directives.stream()
            .filter(this::isDeprecatedDirective)
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    }

    String directivesString(Class<? extends GraphQLSchemaElement> parent, List<GraphQLDirective> directives) {
        directives = directives.stream()
            // @deprecated is special - we always print it if something is deprecated
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    private void printFieldDefinitions(PrintWriter out,
                                       Comparator<? super GraphQLSchemaElement> comparator,
                                       List<GraphQLFieldDefinition> fieldDefinitions) {
        if (fieldDefinitions.size() == 0) {
            return;
```

### BoundedWildcard
Can generalize to `? extends GraphQLNamedType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java


    private void checkTypes(List<GraphQLNamedType> customizedType, SchemaValidationErrorCollector errorCollector) {
        if (customizedType == null || customizedType.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/nextgen/GraphQL.java`
#### Snippet
```java
     * @return a new GraphQL object based on calling build on that builder
     */
    public GraphQL transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/NoUnbrokenInputCycles.java`
#### Snippet
```java
    }

    private void check(GraphQLInputObjectType type, Set<GraphQLType> seen, List<String> path, SchemaValidationErrorCollector validationErrorCollector) {
        if (seen.contains(type)) {
            validationErrorCollector.addError(
```

### BoundedWildcard
Can generalize to `? extends GraphQLSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java

        private TraversalControl visitField(GraphQLNamedSchemaElement element,
                                            TraverserContext<GraphQLSchemaElement> context) {

            VisibleFieldPredicateEnvironment environment = new VisibleFieldPredicateEnvironmentImpl(
```

### BoundedWildcard
Can generalize to `? super GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java


        private TypeObservingVisitor(Set<GraphQLType> observedTypes, GraphQLSchema graphQLSchema) {
            this.observedTypes = observedTypes;
            this.graphQLSchema = graphQLSchema;
```

### BoundedWildcard
Can generalize to `? super GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java

        private FieldRemovalVisitor(VisibleFieldPredicate visibilityPredicate,
                                    Set<GraphQLType> removedTypes) {
            this.visibilityPredicate = visibilityPredicate;
            this.removedTypes = removedTypes;
```

### BoundedWildcard
Can generalize to `? super QueryDepthInfo`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/MaxQueryDepthInstrumentation.java`
#### Snippet
```java
     * @param maxQueryDepthExceededFunction the function to perform when the max depth is exceeded
     */
    public MaxQueryDepthInstrumentation(int maxDepth, Function<QueryDepthInfo, Boolean> maxQueryDepthExceededFunction) {
        this.maxDepth = maxDepth;
        this.maxQueryDepthExceededFunction = maxQueryDepthExceededFunction;
```

### BoundedWildcard
Can generalize to `? super QueryComplexityInfo`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/MaxQueryComplexityInstrumentation.java`
#### Snippet
```java
     */
    public MaxQueryComplexityInstrumentation(int maxComplexity, FieldComplexityCalculator fieldComplexityCalculator,
                                             Function<QueryComplexityInfo, Boolean> maxQueryComplexityExceededFunction) {
        this.maxComplexity = maxComplexity;
        this.fieldComplexityCalculator = assertNotNull(fieldComplexityCalculator, () -> "calculator can't be null");
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTransformer.java`
#### Snippet
```java

            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForFieldRedefinition(List<GraphQLError> errors, TypeDefinition typeDefinition, List<FieldDefinition> fieldDefinitions, List<FieldDefinition> referenceFieldDefinitions) {

        Map<String, FieldDefinition> referenceMap = FpKit.getByName(referenceFieldDefinitions, FieldDefinition::getName, mergeFirst());
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForFieldRedefinition(List<GraphQLError> errors, TypeDefinition typeDefinition, List<FieldDefinition> fieldDefinitions, List<FieldDefinition> referenceFieldDefinitions) {

        Map<String, FieldDefinition> referenceMap = FpKit.getByName(referenceFieldDefinitions, FieldDefinition::getName, mergeFirst());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private <T> void forEachBut(T butThisOne, List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            if (t == butThisOne) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private <T> void forEachBut(T butThisOne, List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            if (t == butThisOne) {
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForEnumValueRedefinition(List<GraphQLError> errors, TypeDefinition typeDefinition, List<EnumValueDefinition> enumValueDefinitions, List<EnumValueDefinition> referenceEnumValueDefinitions) {

        Map<String, EnumValueDefinition> referenceMap = FpKit.getByName(referenceEnumValueDefinitions, EnumValueDefinition::getName, mergeFirst());
```

### BoundedWildcard
Can generalize to `? extends EnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForEnumValueRedefinition(List<GraphQLError> errors, TypeDefinition typeDefinition, List<EnumValueDefinition> enumValueDefinitions, List<EnumValueDefinition> referenceEnumValueDefinitions) {

        Map<String, EnumValueDefinition> referenceMap = FpKit.getByName(referenceEnumValueDefinitions, EnumValueDefinition::getName, mergeFirst());
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void checkTypeExtensionDirectiveRedefinition(List<GraphQLError> errors, TypeDefinitionRegistry typeRegistry, String name, List<? extends TypeDefinition> extensions, Class<? extends TypeDefinition> targetClass, Map<String, DirectiveDefinition> directiveDefinitionMap) {
        Optional<? extends TypeDefinition> typeDefinition = typeRegistry.getType(TypeName.newTypeName().name(name).build(), targetClass);
        if (typeDefinition.isPresent() && typeDefinition.get().getClass().equals(targetClass)) {
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForInputValueRedefinition(List<GraphQLError> errors, InputObjectTypeExtensionDefinition typeDefinition, List<InputValueDefinition> inputValueDefinitions, List<InputValueDefinition> referenceInputValues) {
        Map<String, InputValueDefinition> referenceMap = FpKit.getByName(referenceInputValues, InputValueDefinition::getName, mergeFirst());

```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
    }

    private void checkForInputValueRedefinition(List<GraphQLError> errors, InputObjectTypeExtensionDefinition typeDefinition, List<InputValueDefinition> inputValueDefinitions, List<InputValueDefinition> referenceInputValues) {
        Map<String, InputValueDefinition> referenceMap = FpKit.getByName(referenceInputValues, InputValueDefinition::getName, mergeFirst());

```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java


    private void checkTypeExtensionHasCorrespondingType(List<GraphQLError> errors, TypeDefinitionRegistry typeRegistry, String name, List<? extends TypeDefinition> extTypeList, Class<? extends TypeDefinition> targetClass) {
        TypeDefinition extensionDefinition = extTypeList.get(0);
        Optional<? extends TypeDefinition> typeDefinition = typeRegistry.getType(TypeName.newTypeName().name(name).build(), targetClass);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <K, V> ImmutableMap<K, V> mergeMaps(Map<K, V> m1, Map<K, V> m2) {
        return ImmutableMap.<K, V>builder().putAll(m1).putAll(m2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <K, V> ImmutableMap<K, V> mergeMaps(Map<K, V> m1, Map<K, V> m2) {
        return ImmutableMap.<K, V>builder().putAll(m1).putAll(m2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <K, V> ImmutableMap<K, V> mergeMaps(Map<K, V> m1, Map<K, V> m2) {
        return ImmutableMap.<K, V>builder().putAll(m1).putAll(m2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <K, V> ImmutableMap<K, V> mergeMaps(Map<K, V> m1, Map<K, V> m2) {
        return ImmutableMap.<K, V>builder().putAll(m1).putAll(m2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <T> ImmutableList<T> concatLists(List<T> l1, List<T> l2) {
        return ImmutableList.<T>builder().addAll(l1).addAll(l2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <T> ImmutableList<T> concatLists(List<T> l1, List<T> l2) {
        return ImmutableList.<T>builder().addAll(l1).addAll(l2).build();
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java


    public static <K, V> ImmutableMap<K, V> addToMap(Map<K, V> existing, K newKey, V newVal) {
        return ImmutableMap.<K, V>builder().putAll(existing).put(newKey, newVal).build();
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java


    public static <K, V> ImmutableMap<K, V> addToMap(Map<K, V> existing, K newKey, V newVal) {
        return ImmutableMap.<K, V>builder().putAll(existing).put(newKey, newVal).build();
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
    }

    public static <T> ImmutableList<T> nonNullCopyOf(Collection<T> collection) {
        return collection == null ? emptyList() : ImmutableList.copyOf(collection);
    }
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private void checkObjTypeFields(List<GraphQLError> errors, ObjectTypeDefinition typeDefinition, List<FieldDefinition> fieldDefinitions, Map<String, DirectiveDefinition> directiveDefinitionMap) {
        // field unique ness
        checkNamedUniqueness(errors, fieldDefinitions, FieldDefinition::getName,
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private Consumer<Type> checkTypeExists(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors, String typeOfType, Node element, String elementName) {
        return ivType -> {
            TypeName unwrapped = TypeInfo.typeInfo(ivType).getTypeName();
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java


    private Consumer<Type> checkTypeExists(String typeOfType, TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors, TypeDefinition typeDefinition) {
        return t -> {
            TypeName unwrapped = TypeInfo.typeInfo(t).getTypeName();
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private void checkInterfaceFields(List<GraphQLError> errors, InterfaceTypeDefinition interfaceType, List<FieldDefinition> fieldDefinitions, Map<String, DirectiveDefinition> directiveDefinitionMap) {
        // field unique ness
        checkNamedUniqueness(errors, fieldDefinitions, FieldDefinition::getName,
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private void checkFieldTypesPresent(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors, TypeDefinition typeDefinition, List<FieldDefinition> fields) {
        List<Type> fieldTypes = fields.stream().map(FieldDefinition::getType).collect(toList());
        fieldTypes.forEach(checkTypeExists("field", typeRegistry, errors, typeDefinition));
```

### BoundedWildcard
Can generalize to `? extends EnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private void checkEnumValues(List<GraphQLError> errors, EnumTypeDefinition enumType, List<EnumValueDefinition> enumValueDefinitions, Map<String, DirectiveDefinition> directiveDefinitionMap) {

        // enum unique ness
```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private void checkInputValues(List<GraphQLError> errors, InputObjectTypeDefinition inputType, List<InputValueDefinition> inputValueDefinitions, Introspection.DirectiveLocation directiveLocation, Map<String, DirectiveDefinition> directiveDefinitionMap) {

        // field unique ness
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    }

    private Consumer<? super Type> checkInterfaceTypeExists(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors, TypeDefinition typeDefinition) {
        return t -> {
            TypeInfo typeInfo = TypeInfo.typeInfo(t);
```

### BoundedWildcard
Can generalize to `? super GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
     * @param errorFunction     the function producing an error
     */
    static <T, E extends GraphQLError> void checkNamedUniqueness(List<GraphQLError> errors, List<T> listOfNamedThings, Function<T, String> namer, BiFunction<String, T, E> errorFunction) {
        Set<String> names = new LinkedHashSet<>();
        listOfNamedThings.forEach(thing -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
     * @param errorFunction     the function producing an error
     */
    static <T, E extends GraphQLError> void checkNamedUniqueness(List<GraphQLError> errors, List<T> listOfNamedThings, Function<T, String> namer, BiFunction<String, T, E> errorFunction) {
        Set<String> names = new LinkedHashSet<>();
        listOfNamedThings.forEach(thing -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
     * @param errorFunction     the function producing an error
     */
    static <T, E extends GraphQLError> void checkNamedUniqueness(List<GraphQLError> errors, List<T> listOfNamedThings, Function<T, String> namer, BiFunction<String, T, E> errorFunction) {
        Set<String> names = new LinkedHashSet<>();
        listOfNamedThings.forEach(thing -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
     * @param errorFunction     the function producing an error
     */
    static <T, E extends GraphQLError> void checkNamedUniqueness(List<GraphQLError> errors, List<T> listOfNamedThings, Function<T, String> namer, BiFunction<String, T, E> errorFunction) {
        Set<String> names = new LinkedHashSet<>();
        listOfNamedThings.forEach(thing -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
     * @param errorFunction     the function producing an error
     */
    static <T, E extends GraphQLError> void checkNamedUniqueness(List<GraphQLError> errors, List<T> listOfNamedThings, Function<T, String> namer, BiFunction<String, T, E> errorFunction) {
        Set<String> names = new LinkedHashSet<>();
        listOfNamedThings.forEach(thing -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTraverser.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public <T> T reducePreOrder(QueryReducer<T> queryReducer, T initialValue) {
        // compiler hack to make acc final and mutable :-)
        final Object[] acc = {initialValue};
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTraverser.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public <T> T reducePostOrder(QueryReducer<T> queryReducer, T initialValue) {
        // compiler hack to make acc final and mutable :-)
        final Object[] acc = {initialValue};
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeDefinition.java`
#### Snippet
```java
    }

    public ScalarTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public EnumTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends EnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder enumValueDefinitions(List<EnumValueDefinition> enumValueDefinitions) {
            this.enumValueDefinitions = ImmutableList.copyOf(enumValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstNodeAdapter.java`
#### Snippet
```java

    @Override
    public Node withNewChildren(Node node, Map<String, List<Node>> newChildren) {
        NodeChildrenContainer nodeChildrenContainer = NodeChildrenContainer.newNodeChildrenContainer(newChildren).build();
        return node.withNewChildren(nodeChildrenContainer);
```

### BoundedWildcard
Can generalize to `? extends FragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/NodeVisitorWithTypeTracking.java`
#### Snippet
```java


    public NodeVisitorWithTypeTracking(QueryVisitor preOrderCallback, QueryVisitor postOrderCallback, Map<String, Object> variables, GraphQLSchema schema, Map<String, FragmentDefinition> fragmentsByName) {
        this.preOrderCallback = preOrderCallback;
        this.postOrderCallback = postOrderCallback;
```

### BoundedWildcard
Can generalize to `? extends SchemaDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    private void checkOperation(DiffCtx ctx,
                                String opName,
                                Optional<SchemaDefinition> oldSchemaDef,
                                Optional<SchemaDefinition> newSchemaDef) {
        // if schema declaration is missing then it is assumed to contain Query / Mutation / Subscription
```

### BoundedWildcard
Can generalize to `? extends SchemaDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                String opName,
                                Optional<SchemaDefinition> oldSchemaDef,
                                Optional<SchemaDefinition> newSchemaDef) {
        // if schema declaration is missing then it is assumed to contain Query / Mutation / Subscription
        Optional<OperationTypeDefinition> oldOpTypeDef;
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        TypeDefinition oldDef,
        Map<String, FieldDefinition> oldFields,
        Map<String, FieldDefinition> newFields) {

        for (Map.Entry<String, FieldDefinition> entry : oldFields.entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        DiffCtx ctx,
        TypeDefinition newDef,
        Map<String, FieldDefinition> oldFields,
        Map<String, FieldDefinition> newFields) {

```

### BoundedWildcard
Can generalize to `? super Type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    // looks for a type called `Query|Mutation|Subscription` and if it exist then assumes it as an operation def

    private Optional<OperationTypeDefinition> synthOperationTypeDefinition(Function<Type, Optional<ObjectTypeDefinition>> typeReteriver,
                                                                           String opName) {
        TypeName type = TypeName.newTypeName().name(capitalize(opName)).build();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    }

    private <T> Map<String, T> sortedMap(List<T> listOfNamedThings, Function<T, String> nameFunc) {
        Map<String, T> map = listOfNamedThings.stream().collect(
            Collectors.toMap(nameFunc, Function.identity(), (x, y) -> y));
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    }

    private <T> Map<String, T> sortedMap(List<T> listOfNamedThings, Function<T, String> nameFunc) {
        Map<String, T> map = listOfNamedThings.stream().collect(
            Collectors.toMap(nameFunc, Function.identity(), (x, y) -> y));
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder memberTypes(List<Type> memberTypes) {
            this.memberTypes = ImmutableList.copyOf(memberTypes);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public UnionTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValue.java`
#### Snippet
```java
    }

    public EnumValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java
        }

        public Builder fieldDefinitions(List<FieldDefinition> fieldDefinitions) {
            this.fieldDefinitions = ImmutableList.copyOf(fieldDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java
        }

        public Builder implementz(List<Type> implementz) {
            this.implementz = ImmutableList.copyOf(implementz);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java
    }

    public ObjectTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InlineFragment.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InlineFragment.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InlineFragment.java`
#### Snippet
```java
    }

    public InlineFragment transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectField.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectField.java`
#### Snippet
```java
    }

    public ObjectField transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java
    }

    public InputObjectTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java
        }

        public Builder inputValueDefinitions(List<InputValueDefinition> inputValueDefinitions) {
            this.inputValueDefinitions = ImmutableList.copyOf(inputValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/IntValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/IntValue.java`
#### Snippet
```java
    }

    public IntValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends VariableDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationDefinition.java`
#### Snippet
```java
        }

        public Builder variableDefinitions(List<VariableDefinition> variableDefinitions) {
            this.variableDefinitions = ImmutableList.copyOf(variableDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationDefinition.java`
#### Snippet
```java
    }

    public OperationDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder fieldDefinitions(List<FieldDefinition> fieldDefinitions) {
            this.fieldDefinitions = ImmutableList.copyOf(fieldDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder implementz(List<Type> implementz) {
            this.implementz = ImmutableList.copyOf(implementz);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public ObjectTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/Argument.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/Argument.java`
#### Snippet
```java
    }

    public Argument transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends OperationTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder operationTypeDefinitions(List<OperationTypeDefinition> operationTypeDefinitions) {
            this.operationTypeDefinitions = ImmutableList.copyOf(operationTypeDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java
    }

    public SchemaExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/FieldDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/FieldDefinition.java`
#### Snippet
```java
        }

        public Builder inputValueDefinitions(List<InputValueDefinition> inputValueDefinitions) {
            this.inputValueDefinitions = ImmutableList.copyOf(inputValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/FieldDefinition.java`
#### Snippet
```java
    }

    public FieldDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/FieldDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/TypeName.java`
#### Snippet
```java
    }

    public TypeName transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/TypeName.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstTransformer.java`
#### Snippet
```java
        TraverserVisitor<Node> traverserVisitor = new TraverserVisitor<Node>() {
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstTransformer.java`
#### Snippet
```java
        TraverserVisitor<Node> traverserVisitor = new TraverserVisitorStub<Node>() {
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/VariableReference.java`
#### Snippet
```java
    }

    public VariableReference transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/VariableReference.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/Document.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/Document.java`
#### Snippet
```java
    }

    public Document transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Definition`
in `src/main/com/intellij/lang/jsgraphql/types/language/Document.java`
#### Snippet
```java
        }

        public Builder definitions(List<Definition> definitions) {
            this.definitions = ImmutableList.copyOf(definitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/language/Document.java`
#### Snippet
```java
     * @return a list of definitions of that class or empty list
     */
    public <T extends Definition> List<T> getDefinitionsOfType(Class<T> definitionClass) {
        return definitions.stream()
            .filter(d -> definitionClass.isAssignableFrom(d.getClass()))
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentSpread.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentSpread.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentSpread.java`
#### Snippet
```java


    public FragmentSpread transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
        }

        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
    }

    public SchemaDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends OperationTypeDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
        }

        public Builder operationTypeDefinitions(List<OperationTypeDefinition> operationTypeDefinitions) {
            this.operationTypeDefinitions = ImmutableList.copyOf(operationTypeDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitVariableDefinition(VariableDefinition node, TraverserContext<Node> context) {
                String varName = remapVariable(node.getName(), variableRemapping, variableCount);
                return changeNode(context, node.transform(builder -> builder.name(varName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitArrayValue(ArrayValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.values(Collections.emptyList())));
            }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitVariableReference(VariableReference node, TraverserContext<Node> context) {
                String varName = remapVariable(node.getName(), variableRemapping, variableCount);
                return changeNode(context, node.transform(builder -> builder.name(varName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
        NodeVisitorStub visitor = new NodeVisitorStub() {
            @Override
            public TraversalControl visitIntValue(IntValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.value(BigInteger.ZERO)));
            }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
        NodeVisitorStub visitor = new NodeVisitorStub() {
            @Override
            public TraversalControl visitField(Field node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.alias(null)));
            }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
    }

    private String remapVariable(String varName, Map<String, String> variableRemapping, AtomicInteger variableCount) {
        String mappedName = variableRemapping.get(varName);
        if (mappedName == null) {
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitObjectValue(ObjectValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.objectFields(Collections.emptyList())));
            }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitBooleanValue(BooleanValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.value(false)));
            }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
        NodeVisitorStub visitor = new NodeVisitorStub() {
            @Override
            public TraversalControl visitDocument(Document node, TraverserContext<Node> context) {
                List<Definition> wantedDefinitions = node.getDefinitions().stream()
                        .filter(d -> {
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitStringValue(StringValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.value("")));
            }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java

            @Override
            public TraversalControl visitFloatValue(FloatValue node, TraverserContext<Node> context) {
                return changeNode(context, node.transform(builder -> builder.value(BigDecimal.ZERO)));
            }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/NonNullType.java`
#### Snippet
```java
    }

    public NonNullType transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/NonNullType.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/NullValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/NullValue.java`
#### Snippet
```java


    public NullValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ArrayValue.java`
#### Snippet
```java
    }

    public ArrayValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/com/intellij/lang/jsgraphql/types/language/ArrayValue.java`
#### Snippet
```java
        }

        public Builder values(List<Value> values) {
            this.values = ImmutableList.copyOf(values);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ArrayValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
    }

    private String directives(List<Directive> directives) {
        return join(nvl(directives), " ");
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
    }

    public NodeChildrenContainer transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
    private final Map<String, List<Node>> children = new LinkedHashMap<>();

    private NodeChildrenContainer(Map<String, List<Node>> children) {
        this.children.putAll(assertNotNull(children));
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/BooleanValue.java`
#### Snippet
```java
    }

    public BooleanValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/BooleanValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ListType.java`
#### Snippet
```java
    }

    public ListType transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ListType.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/language/SelectionSet.java`
#### Snippet
```java
     * @return a list of selections of that class or empty list
     */
    public <T extends Selection> List<T> getSelectionsOfType(Class<T> selectionClass) {
        return selections.stream()
            .filter(d -> selectionClass.isAssignableFrom(d.getClass()))
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/SelectionSet.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/SelectionSet.java`
#### Snippet
```java
    }

    public SelectionSet transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java
        }

        public Builder memberTypes(List<Type> memberTypes) {
            this.memberTypes = ImmutableList.copyOf(memberTypes);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java
    }

    public UnionTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public ScalarTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java

            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java

            @Override
            public TraversalControl leave(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java

            @Override
            public TraversalControl leave(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java

            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeExtensionDefinition.java`
#### Snippet
```java


        public Builder inputValueDefinitions(List<InputValueDefinition> inputValueDefinitions) {
            this.inputValueDefinitions = ImmutableList.copyOf(inputValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public InputObjectTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends InputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveDefinition.java`
#### Snippet
```java
        }

        public Builder inputValueDefinitions(List<InputValueDefinition> inputValueDefinitions) {
            this.inputValueDefinitions = ImmutableList.copyOf(inputValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveDefinition.java`
#### Snippet
```java
    }

    public DirectiveDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends DirectiveLocation`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveDefinition.java`
#### Snippet
```java


        public Builder directiveLocations(List<DirectiveLocation> directiveLocations) {
            this.directiveLocations = ImmutableList.copyOf(directiveLocations);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java
        }

        public Builder implementz(List<Type> implementz) {
            this.implementz = ImmutableList.copyOf(implementz);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java


        public Builder definitions(List<FieldDefinition> definitions) {
            this.definitions = ImmutableList.copyOf(definitions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java
    }

    public InterfaceTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends EnumValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java
        }

        public Builder enumValueDefinitions(List<EnumValueDefinition> enumValueDefinitions) {
            this.enumValueDefinitions = ImmutableList.copyOf(enumValueDefinitions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java
    }

    public EnumTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/StringValue.java`
#### Snippet
```java
    }

    public StringValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/StringValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationTypeDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationTypeDefinition.java`
#### Snippet
```java
    }

    public OperationTypeDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder implementz(List<Type> implementz) {
            this.implementz = ImmutableList.copyOf(implementz);
            return this;
```

### BoundedWildcard
Can generalize to `? extends FieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder definitions(List<FieldDefinition> definitions) {
            this.definitions = ImmutableList.copyOf(definitions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java
    }

    public InterfaceTypeExtensionDefinition transformExtension(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/FloatValue.java`
#### Snippet
```java
    }

    public FloatValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/FloatValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitFragmentSpread(FragmentSpread node, TraverserContext<Node> context) {
                FragmentSpread changedNode = node.transform(builder -> {
                    List<Directive> directives = sort(node.getDirectives(), comparing(Directive::getName));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitOperationDefinition(OperationDefinition node, TraverserContext<Node> context) {
                OperationDefinition changedNode = node.transform(builder -> {
                    builder.variableDefinitions(sort(node.getVariableDefinitions(), comparing(VariableDefinition::getName)));
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java
    }

    private <T> List<T> sort(List<T> items, Comparator<T> comparing) {
        items = new ArrayList<>(items);
        items.sort(comparing);
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitUnionTypeDefinition(UnionTypeDefinition node, TraverserContext<Node> context) {
                UnionTypeDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitInputObjectTypeDefinition(InputObjectTypeDefinition node, TraverserContext<Node> context) {
                InputObjectTypeDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitScalarTypeDefinition(ScalarTypeDefinition node, TraverserContext<Node> context) {
                ScalarTypeDefinition changedNode = node.transform(builder -> {
                    List<Directive> directives = sort(node.getDirectives(), comparing(Directive::getName));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitObjectValue(ObjectValue node, TraverserContext<Node> context) {
                ObjectValue changedNode = node.transform(builder -> {
                    List<ObjectField> objectFields = sort(node.getObjectFields(), comparing(ObjectField::getName));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitFragmentDefinition(FragmentDefinition node, TraverserContext<Node> context) {
                FragmentDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitDirective(Directive node, TraverserContext<Node> context) {
                Directive changedNode = node.transform(builder -> {
                    List<Argument> arguments = sort(node.getArguments(), comparing(Argument::getName));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitField(Field node, TraverserContext<Node> context) {
                Field changedNode = node.transform(builder -> {
                    builder.arguments(sort(node.getArguments(), comparing(Argument::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitInterfaceTypeDefinition(InterfaceTypeDefinition node, TraverserContext<Node> context) {
                InterfaceTypeDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitObjectTypeDefinition(ObjectTypeDefinition node, TraverserContext<Node> context) {
                ObjectTypeDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitSchemaDefinition(SchemaDefinition node, TraverserContext<Node> context) {
                SchemaDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitDocument(Document node, TraverserContext<Node> context) {
                Document changedNode = node.transform(builder -> {
                    List<Definition> definitions = sort(node.getDefinitions(), comparingDefinitions());
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitFieldDefinition(FieldDefinition node, TraverserContext<Node> context) {
                FieldDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitInputValueDefinition(InputValueDefinition node, TraverserContext<Node> context) {
                InputValueDefinition changedNode = node.transform(builder -> {
                    List<Directive> directives = sort(node.getDirectives(), comparing(Directive::getName));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitDirectiveDefinition(DirectiveDefinition node, TraverserContext<Node> context) {
                DirectiveDefinition changedNode = node.transform(builder -> {
                    builder.inputValueDefinitions(sort(node.getInputValueDefinitions(), comparing(InputValueDefinition::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitEnumTypeDefinition(EnumTypeDefinition node, TraverserContext<Node> context) {
                EnumTypeDefinition changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

            @Override
            public TraversalControl visitInlineFragment(InlineFragment node, TraverserContext<Node> context) {
                InlineFragment changedNode = node.transform(builder -> {
                    builder.directives(sort(node.getDirectives(), comparing(Directive::getName)));
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/Field.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/language/Field.java`
#### Snippet
```java
        }

        public Builder arguments(List<Argument> arguments) {
            this.arguments = ImmutableList.copyOf(arguments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/Field.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/Field.java`
#### Snippet
```java
    }

    public Field transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentDefinition.java`
#### Snippet
```java
    }

    public FragmentDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveLocation.java`
#### Snippet
```java
    }

    public DirectiveLocation transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveLocation.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStepInfo.java`
#### Snippet
```java
    }

    public ExecutionStepInfo transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super ExecutionContextBuilder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionContext.java`
#### Snippet
```java
     * @return a new ExecutionContext object based on calling build on that builder
     */
    public ExecutionContext transform(Consumer<ExecutionContextBuilder> builderConsumer) {
        ExecutionContextBuilder builder = ExecutionContextBuilder.newExecutionContextBuilder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherResult.java`
#### Snippet
```java
        }

        public Builder<T> errors(List<GraphQLError> errors) {
            this.errors.addAll(errors);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherResult.java`
#### Snippet
```java
     * @return a new instance produced by calling {@code build} on that builder
     */
    public DataFetcherResult<T> transform(Consumer<Builder<T>> builderConsumer) {
        Builder<T> builder = new Builder<>(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherResult.java`
#### Snippet
```java
        private final List<GraphQLError> errors = new ArrayList<>();

        public Builder(DataFetcherResult<T> existing) {
            data = existing.getData();
            localContext = existing.getLocalContext();
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/VariableDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/VariableDefinition.java`
#### Snippet
```java
    }

    public VariableDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/VariableDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends FragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionContextBuilder.java`
#### Snippet
```java
    }

    public ExecutionContextBuilder fragmentsByName(Map<String, FragmentDefinition> fragmentsByName) {
        this.fragmentsByName = ImmutableMap.copyOf(fragmentsByName);
        return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputValueDefinition.java`
#### Snippet
```java
    }

    public InputValueDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputValueDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputValueDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValueDefinition.java`
#### Snippet
```java

        @Override
        public Builder directives(List<Directive> directives) {
            this.directives = ImmutableList.copyOf(directives);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValueDefinition.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValueDefinition.java`
#### Snippet
```java
    }

    public EnumValueDefinition transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/FetchedValue.java`
#### Snippet
```java
    }

    public FetchedValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = newFetchedValue(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/FetchedValue.java`
#### Snippet
```java
        }

        public Builder errors(List<GraphQLError> errors) {
            this.errors = ImmutableList.copyOf(errors);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/Directive.java`
#### Snippet
```java
    }

    public Directive transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/Directive.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/language/Directive.java`
#### Snippet
```java
        }

        public Builder arguments(List<Argument> arguments) {
            this.arguments = ImmutableList.copyOf(arguments);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Comment`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectValue.java`
#### Snippet
```java
        }

        public Builder comments(List<Comment> comments) {
            this.comments = ImmutableList.copyOf(comments);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectValue.java`
#### Snippet
```java
    }

    public ObjectValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends ObjectField`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectValue.java`
#### Snippet
```java
        }

        public Builder objectFields(List<ObjectField> objectFields) {
            this.objectFields = ImmutableList.copyOf(objectFields);
            return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherExceptionHandlerResult.java`
#### Snippet
```java
        private final List<GraphQLError> errors = new ArrayList<>();

        public Builder errors(List<GraphQLError> errors) {
            this.errors.addAll(assertNotNull(errors));
            return this;
```

### BoundedWildcard
Can generalize to `? extends Field`
in `src/main/com/intellij/lang/jsgraphql/types/execution/MergedField.java`
#### Snippet
```java
        }

        public Builder fields(List<Field> fields) {
            this.fields.addAll(fields);
            return this;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/MergedField.java`
#### Snippet
```java
    }

    public MergedField transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategyParameters.java`
#### Snippet
```java
    }

    public ExecutionStrategyParameters transform(Consumer<Builder> builderConsumer) {
        Builder builder = newParameters(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends ExecutionStepInfo`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java
    }

    protected Supplier<NormalizedField> getNormalizedField(ExecutionContext executionContext, ExecutionStrategyParameters parameters, Supplier<ExecutionStepInfo> executionStepInfo) {
        Supplier<NormalizedQueryTree> normalizedQuery = executionContext.getNormalizedQueryTree();
        return () -> normalizedQuery.get().getNormalizedField(parameters.getField(), executionStepInfo.get().getObjectType(), executionStepInfo.get().getPath());
```

### BoundedWildcard
Can generalize to `? extends Field`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java

    @Internal
    public static String mkNameForPath(List<Field> currentField) {
        Field field = currentField.get(0);
        return field.getResultKey();
```

### BoundedWildcard
Can generalize to `? super ExecutionResult`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java
    }

    protected ExecutionResult handleNonNullException(ExecutionContext executionContext, CompletableFuture<ExecutionResult> result, Throwable e) {
        ExecutionResult executionResult = null;
        List<GraphQLError> errors = ImmutableList.copyOf(executionContext.getErrors());
```

### BoundedWildcard
Can generalize to `? extends ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ResultNodesCreator.java`
#### Snippet
```java
    }

    private Optional<NonNullableFieldWasNullException> getFirstNonNullableException(Collection<ExecutionResultNode> collection) {
        return collection.stream()
                .filter(executionResultNode -> executionResultNode.getNonNullableFieldWasNullException() != null)
```

### BoundedWildcard
Can generalize to `? extends FetchedValueAnalysis`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ExecutionStrategyUtil.java`
#### Snippet
```java
    }

    public List<ExecutionResultNode> fetchedValueAnalysisToNodes(List<FetchedValueAnalysis> fetchedValueAnalysisList) {
        return map(fetchedValueAnalysisList, fetchedValueAnalysis -> resultNodesCreator.createResultNode(fetchedValueAnalysis));
    }
```

### BoundedWildcard
Can generalize to `? extends ExecutionStepInfo`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ValueFetcher.java`
#### Snippet
```java


    public CompletableFuture<List<FetchedValue>> fetchBatchedValues(ExecutionContext executionContext, List<Object> sources, MergedField field, List<ExecutionStepInfo> executionInfos) {
        ExecutionStepInfo executionStepInfo = executionInfos.get(0);
        // TODO - add support for field context to batching code
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodeAdapter.java`
#### Snippet
```java

    @Override
    public ExecutionResultNode withNewChildren(ExecutionResultNode parentNode, Map<String, List<ExecutionResultNode>> newChildren) {
        assertTrue(newChildren.size() == 1);
        List<ExecutionResultNode> childrenList = newChildren.get(null);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> flatMap(List<T> inputs, Function<T, CompletableFuture<U>> mapper) {
        List<CompletableFuture<U>> collect = ImmutableKit.map(inputs, mapper);
        return Async.each(collect);
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> flatMap(List<T> inputs, Function<T, CompletableFuture<U>> mapper) {
        List<CompletableFuture<U>> collect = ImmutableKit.map(inputs, mapper);
        return Async.each(collect);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> flatMap(List<T> inputs, Function<T, CompletableFuture<U>> mapper) {
        List<CompletableFuture<U>> collect = ImmutableKit.map(inputs, mapper);
        return Async.each(collect);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> mapCompose(List<CompletableFuture<T>> values, Function<T, CompletableFuture<U>> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenCompose(mapper));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> mapCompose(List<CompletableFuture<T>> values, Function<T, CompletableFuture<U>> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenCompose(mapper));
    }
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> mapCompose(List<CompletableFuture<T>> values, Function<T, CompletableFuture<U>> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenCompose(mapper));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    private static <T, U> void eachSequentiallyImpl(Iterator<T> iterator, CFFactory<T, U> cfFactory, int index, List<U> tmpResult, CompletableFuture<List<U>> overallResult) {
        if (!iterator.hasNext()) {
            overallResult.complete(tmpResult);
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    private static <T, U> void eachSequentiallyImpl(Iterator<T> iterator, CFFactory<T, U> cfFactory, int index, List<U> tmpResult, CompletableFuture<List<U>> overallResult) {
        if (!iterator.hasNext()) {
            overallResult.complete(tmpResult);
```

### BoundedWildcard
Can generalize to `? super List`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    private static <T, U> void eachSequentiallyImpl(Iterator<T> iterator, CFFactory<T, U> cfFactory, int index, List<U> tmpResult, CompletableFuture<List<U>> overallResult) {
        if (!iterator.hasNext()) {
            overallResult.complete(tmpResult);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> map(List<CompletableFuture<T>> values, Function<T, U> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenApply(mapper));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> map(List<CompletableFuture<T>> values, Function<T, U> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenApply(mapper));
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> List<CompletableFuture<U>> map(List<CompletableFuture<T>> values, Function<T, U> mapper) {
        return ImmutableKit.map(values, cf -> cf.thenApply(mapper));
    }
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/FetchedValueAnalysis.java`
#### Snippet
```java
    }

    public FetchedValueAnalysis transfrom(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<T> tryCatch(Supplier<CompletableFuture<T>> supplier) {
        try {
            return supplier.get();
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/FetchedValueAnalysis.java`
#### Snippet
```java
        }

        public Builder errors(List<GraphQLError> errors) {
            this.errors.addAll(errors);
            return this;
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> map(CompletableFuture<List<T>> values, Function<T, U> mapper) {
        return values.thenApply(list -> ImmutableKit.map(list, mapper));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> map(CompletableFuture<List<T>> values, Function<T, U> mapper) {
        return values.thenApply(list -> ImmutableKit.map(list, mapper));
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <U, T> CompletableFuture<List<U>> map(CompletableFuture<List<T>> values, Function<T, U> mapper) {
        return values.thenApply(list -> ImmutableKit.map(list, mapper));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <T, U> CompletableFuture<List<U>> each(Collection<T> list, BiFunction<T, Integer, CompletableFuture<U>> cfFactory) {
        List<CompletableFuture<U>> futures = new ArrayList<>(list.size());
        int index = 0;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <T, U> CompletableFuture<List<U>> each(Collection<T> list, BiFunction<T, Integer, CompletableFuture<U>> cfFactory) {
        List<CompletableFuture<U>> futures = new ArrayList<>(list.size());
        int index = 0;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <T, U> CompletableFuture<List<U>> each(Collection<T> list, BiFunction<T, Integer, CompletableFuture<U>> cfFactory) {
        List<CompletableFuture<U>> futures = new ArrayList<>(list.size());
        int index = 0;
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
    }

    public static <T, U> CompletableFuture<List<U>> each(Collection<T> list, BiFunction<T, Integer, CompletableFuture<U>> cfFactory) {
        List<CompletableFuture<U>> futures = new ArrayList<>(list.size());
        int index = 0;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResolvedValue.java`
#### Snippet
```java


    public ResolvedValue transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResolvedValue.java`
#### Snippet
```java
        }

        public Builder errors(List<GraphQLError> errors) {
            this.errors = new ArrayList<>(errors);
            return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/LeafExecutionResultNode.java`
#### Snippet
```java

    @Override
    public ExecutionResultNode withNewErrors(List<GraphQLError> errors) {
        return new LeafExecutionResultNode(getExecutionStepInfo(), getResolvedValue(), getNonNullableFieldWasNullException(), new ArrayList<>(errors));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/execution/FieldCollector.java`
#### Snippet
```java
    }

    private void collectField(FieldCollectorParameters parameters, Map<String, MergedField> fields, Field field) {
        if (!conditionalNodes.shouldInclude(parameters.getVariables(), field.getDirectives())) {
            return;
```

### BoundedWildcard
Can generalize to `? extends FetchedValue`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java


    private List<FetchedValueAnalysis> analyseValues(ExecutionContext executionContext, List<FetchedValue> fetchedValues, List<ExecutionStepInfo> executionInfos) {
        List<FetchedValueAnalysis> result = new ArrayList<>();
        for (int i = 0; i < fetchedValues.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionStepInfo`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java


    private List<FetchedValueAnalysis> analyseValues(ExecutionContext executionContext, List<FetchedValue> fetchedValues, List<ExecutionStepInfo> executionInfos) {
        List<FetchedValueAnalysis> result = new ArrayList<>();
        for (int i = 0; i < fetchedValues.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends NodeZipper`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java
    }

    private CompletableFuture<List<NodeZipper<ExecutionResultNode>>> mapBatchedResultsBack(List<NodeZipper<ExecutionResultNode>> unresolvedNodes, List<CompletableFuture<List<FetchedValueAnalysis>>> fetchedValues) {
        return Async.each(fetchedValues).thenApply(fetchedValuesMatrix -> {
            List<NodeZipper<ExecutionResultNode>> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends FieldSubSelection`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java
    }

    private List<ExecutionStepInfo> newExecutionInfos(ExecutionContext executionContext, List<FieldSubSelection> fieldSubSelections, MergedField mergedField) {
        return map(fieldSubSelections,
                subSelection -> executionInfoFactory.newExecutionStepInfoForSubField(executionContext, mergedField, subSelection.getExecutionStepInfo()));
```

### BoundedWildcard
Can generalize to `? extends NodeMultiZipper`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java

    // all multizipper have the same root
    private CompletableFuture<NodeMultiZipper<ExecutionResultNode>> resolveNodes(ExecutionContext executionContext, List<NodeMultiZipper<ExecutionResultNode>> unresolvedNodes) {
        assertNotEmpty(unresolvedNodes, () -> "unresolvedNodes can't be empty");
        ExecutionResultNode commonRoot = unresolvedNodes.get(0).getCommonRoot();
```

### BoundedWildcard
Can generalize to `? extends ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java


    private CompletableFuture<NodeMultiZipper<ExecutionResultNode>> nextStep(ExecutionContext executionContext, NodeMultiZipper<ExecutionResultNode> multizipper) {
        NodeMultiZipper<ExecutionResultNode> nextUnresolvedNodes = ResultNodesUtil.getUnresolvedNodes(multizipper.toRootNode());
        if (nextUnresolvedNodes.getZippers().size() == 0) {
```

### BoundedWildcard
Can generalize to `? extends U`
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/CompletionStageMappingPublisher.java`
#### Snippet
```java
     * @param mapper            a mapper function that turns upstream data into a promise of mapped D downstream data
     */
    public CompletionStageMappingPublisher(Publisher<U> upstreamPublisher, Function<U, CompletionStage<D>> mapper) {
        this.upstreamPublisher = upstreamPublisher;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super U`
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/CompletionStageMappingPublisher.java`
#### Snippet
```java
     * @param mapper            a mapper function that turns upstream data into a promise of mapped D downstream data
     */
    public CompletionStageMappingPublisher(Publisher<U> upstreamPublisher, Function<U, CompletionStage<D>> mapper) {
        this.upstreamPublisher = upstreamPublisher;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends CompletionStage`
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/CompletionStageMappingPublisher.java`
#### Snippet
```java
     * @param mapper            a mapper function that turns upstream data into a promise of mapped D downstream data
     */
    public CompletionStageMappingPublisher(Publisher<U> upstreamPublisher, Function<U, CompletionStage<D>> mapper) {
        this.upstreamPublisher = upstreamPublisher;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/RootExecutionResultNode.java`
#### Snippet
```java

    @Override
    public ExecutionResultNode withNewErrors(List<GraphQLError> errors) {
        return new RootExecutionResultNode(getChildren(), new ArrayList<>(errors));
    }
```

### BoundedWildcard
Can generalize to `? super ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodeTraverser.java`
#### Snippet
```java
    }

    public void traverse(TraverserVisitor<ExecutionResultNode> visitor, Collection<? extends ExecutionResultNode> roots) {
        traverser.traverse(roots, visitor);
    }
```

### BoundedWildcard
Can generalize to `? super ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodeTraverser.java`
#### Snippet
```java
    }

    public void traverse(TraverserVisitor<ExecutionResultNode> visitor, ExecutionResultNode root) {
        traverser.traverse(root, visitor);
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ListExecutionResultNode.java`
#### Snippet
```java

    @Override
    public ExecutionResultNode withNewErrors(List<GraphQLError> errors) {
        return new ListExecutionResultNode(getExecutionStepInfo(), getResolvedValue(), getChildren(), new ArrayList<>(errors));
    }
```

### BoundedWildcard
Can generalize to `? super ExecutionInput`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/NoOpPreparsedDocumentProvider.java`
#### Snippet
```java

    @Override
    public PreparsedDocumentEntry getDocument(ExecutionInput executionInput, Function<ExecutionInput, PreparsedDocumentEntry> parseAndValidateFunction) {
        return parseAndValidateFunction.apply(executionInput);
    }
```

### BoundedWildcard
Can generalize to `? extends PreparsedDocumentEntry`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/NoOpPreparsedDocumentProvider.java`
#### Snippet
```java

    @Override
    public PreparsedDocumentEntry getDocument(ExecutionInput executionInput, Function<ExecutionInput, PreparsedDocumentEntry> parseAndValidateFunction) {
        return parseAndValidateFunction.apply(executionInput);
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ObjectExecutionResultNode.java`
#### Snippet
```java

    @Override
    public ExecutionResultNode withNewErrors(List<GraphQLError> errors) {
        return new ObjectExecutionResultNode(getExecutionStepInfo(), getResolvedValue(), getChildren(), new ArrayList<>(errors));
    }
```

### BoundedWildcard
Can generalize to `? super ExecutionInput`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java

    @Override
    public PreparsedDocumentEntry getDocument(ExecutionInput executionInput, Function<ExecutionInput, PreparsedDocumentEntry> parseAndValidateFunction) {
        Optional<Object> queryIdOption = getPersistedQueryId(executionInput);
        assertNotNull(queryIdOption, () -> String.format("The class %s MUST return a non null optional query id", this.getClass().getName()));
```

### BoundedWildcard
Can generalize to `? extends PreparsedDocumentEntry`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java

    @Override
    public PreparsedDocumentEntry getDocument(ExecutionInput executionInput, Function<ExecutionInput, PreparsedDocumentEntry> parseAndValidateFunction) {
        Optional<Object> queryIdOption = getPersistedQueryId(executionInput);
        assertNotNull(queryIdOption, () -> String.format("The class %s MUST return a non null optional query id", this.getClass().getName()));
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/SimpleInstrumentationContext.java`
#### Snippet
```java
    }

    private SimpleInstrumentationContext(Consumer<CompletableFuture<T>> codeToRunOnDispatch, BiConsumer<T, Throwable> codeToRunOnComplete) {
        this.codeToRunOnComplete = codeToRunOnComplete;
        this.codeToRunOnDispatch = codeToRunOnDispatch;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/SimpleInstrumentationContext.java`
#### Snippet
```java
    }

    private SimpleInstrumentationContext(Consumer<CompletableFuture<T>> codeToRunOnDispatch, BiConsumer<T, Throwable> codeToRunOnComplete) {
        this.codeToRunOnComplete = codeToRunOnComplete;
        this.codeToRunOnDispatch = codeToRunOnDispatch;
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/DocumentAndVariables.java`
#### Snippet
```java
    }

    public DocumentAndVariables transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder().document(this.document).variables(this.variables);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/SimpleInstrumentationContext.java`
#### Snippet
```java
    }

    private SimpleInstrumentationContext(Consumer<CompletableFuture<T>> codeToRunOnDispatch, BiConsumer<T, Throwable> codeToRunOnComplete) {
        this.codeToRunOnComplete = codeToRunOnComplete;
        this.codeToRunOnDispatch = codeToRunOnDispatch;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/tracing/TracingSupport.java`
#### Snippet
```java
    }

    private TracingContext traceToMap(Map<String, Object> map) {
        long start = System.nanoTime();
        return () -> {
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/execution/directives/DirectivesResolver.java`
#### Snippet
```java
    }

    public Map<String, GraphQLDirective> resolveDirectives(List<Directive> directives, GraphQLSchema schema, Map<String, Object> variables) {
        GraphQLCodeRegistry codeRegistry = schema.getCodeRegistry();
        Map<String, GraphQLDirective> directiveMap = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends FieldValueInfo`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/FieldLevelTrackingApproach.java`
#### Snippet
```java
    // thread safety : called with synchronised(callStack)
    //
    private boolean handleOnFieldValuesInfo(List<FieldValueInfo> fieldValueInfoList, CallStack callStack, int curLevel) {
        callStack.increaseHappenedOnFieldValueCalls(curLevel);
        int expectedStrategyCalls = 0;
```

### BoundedWildcard
Can generalize to `? extends DataLoaderRegistry`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/FieldLevelTrackingApproach.java`
#### Snippet
```java
    }

    public FieldLevelTrackingApproach(Supplier<DataLoaderRegistry> dataLoaderRegistrySupplier) {
        this.dataLoaderRegistrySupplier = dataLoaderRegistrySupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends FragmentDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQueryParams.java`
#### Snippet
```java
        }

        public Builder fragments(Map<String, FragmentDefinition> fragmentsByName) {
            this.fragmentsByName.putAll(fragmentsByName);
            return this;
```

### BoundedWildcard
Can generalize to `? extends ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
    }

    public static List<NodeZipper<ExecutionResultNode>> getUnresolvedNodes(Collection<ExecutionResultNode> roots) {
        List<NodeZipper<ExecutionResultNode>> result = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends NamedResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
    }

    public static NonNullableFieldWasNullException newNullableException(ExecutionStepInfo executionStepInfo, List<NamedResultNode> children) {
        return newNullableException(executionStepInfo, map(children, NamedResultNode::getNode));
    }
```

### BoundedWildcard
Can generalize to `? extends NamedResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
    }

    public static Map<String, ExecutionResultNode> namedNodesToMap(List<NamedResultNode> namedResultNodes) {
        Map<String, ExecutionResultNode> result = new LinkedHashMap<>();
        for (NamedResultNode namedResultNode : namedResultNodes) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionResultNode`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java


    public static Optional<NonNullableFieldWasNullException> getFirstNonNullableException(Collection<ExecutionResultNode> collection) {
        return collection.stream()
                .filter(executionResultNode -> executionResultNode.getNonNullableFieldWasNullException() != null)
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
    }

    private Map<String, Object> getArgumentValuesImpl(GraphQLCodeRegistry codeRegistry, List<GraphQLArgument> argumentTypes, List<Argument> arguments, Map<String, Object> variables) {
        if (argumentTypes.isEmpty()) {
            return Collections.emptyMap();
```

### BoundedWildcard
Can generalize to `? extends VariableDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
     * @return coerced variable values as a map
     */
    public Map<String, Object> coerceVariableValues(GraphQLSchema schema, List<VariableDefinition> variableDefinitions, Map<String, Object> variableValues) {
        GraphqlFieldVisibility fieldVisibility = schema.getCodeRegistry().getFieldVisibility();
        Map<String, Object> coercedValues = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java


    private Map<String, Argument> argumentMap(List<Argument> arguments) {
        Map<String, Argument> result = new LinkedHashMap<>(arguments.size());
        for (Argument argument : arguments) {
```

### BoundedWildcard
Can generalize to `? extends NormalizedField`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java


        public Builder children(List<NormalizedField> children) {
            this.children.clear();
            this.children.addAll(children);
```

### BoundedWildcard
Can generalize to `? super NormalizedField`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java

    private void traverseImpl(NormalizedField root,
                              Consumer<NormalizedField> consumer,
                              int curRelativeLevel,
                              int abortAfter) {
```

### BoundedWildcard
Can generalize to `? super Builder`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java


    public NormalizedField transform(Consumer<Builder> builderConsumer) {
        Builder builder = new Builder(this);
        builderConsumer.accept(builder);
```

### BoundedWildcard
Can generalize to `? extends GraphQLArgument`
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
    }

    private GraphQLArgument find(List<GraphQLArgument> arguments, String name) {
        for (GraphQLArgument argument : arguments) {
            if (argument.getName().equals(name)) return argument;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/NoUnusedFragments.java`
#### Snippet
```java
    }

    private void collectUsedFragmentsInDefinition(List<String> result, String fragmentName) {
        if (result.contains(fragmentName)) return;
        result.add(fragmentName);
```

### BoundedWildcard
Can generalize to `? extends Directive`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueDirectiveNamesPerLocation.java`
#### Snippet
```java
    }

    private void checkDirectivesUniqueness(Node<?> directivesContainer, List<Directive> directives) {
        Set<String> directiveNames = new LinkedHashSet<>();
        for (Directive directive : directives) {
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/ProvidedNonNullArguments.java`
#### Snippet
```java
    }

    private Map<String, Argument> argumentMap(List<Argument> arguments) {
        Map<String, Argument> result = new LinkedHashMap<>();
        for (Argument argument : arguments) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/KnownDirectives.java`
#### Snippet
```java

    @Override
    public void checkDirective(Directive directive, List<Node> ancestors) {
        GraphQLDirective graphQLDirective = getValidationContext().getSchema().getFirstDirective(directive.getName());
        if (graphQLDirective == null) {
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private List<AbstractRule> getRulesVisitingFragmentSpreads(List<AbstractRule> rules) {
        List<AbstractRule> result = new ArrayList<>();
        for (AbstractRule rule : rules) {
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkVariable(VariableReference variableReference, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkVariable(variableReference);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java


    private void checkVariableDefinition(VariableDefinition variableDefinition, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkVariableDefinition(variableDefinition);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkInlineFragment(InlineFragment inlineFragment, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkInlineFragment(inlineFragment);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkTypeName(TypeName node, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkTypeName(node);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java


    private void checkArgument(Argument node, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkArgument(node);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkDocument(Document node, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkDocument(node);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkSelectionSet(SelectionSet selectionSet, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkSelectionSet(selectionSet);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkOperationDefinition(OperationDefinition operationDefinition, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkOperationDefinition(operationDefinition);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java


    private void checkFragmentDefinition(FragmentDefinition fragmentDefinition, List<AbstractRule> rules) {
        if (!subVisitor) {
            rulesToSkipByUntilNode.put(fragmentDefinition, new ArrayList<>(rulesVisitingFragmentSpreads));
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkDirective(Directive directive, List<Node> ancestors, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkDirective(directive, ancestors);
```

### BoundedWildcard
Can generalize to `? extends AbstractRule`
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java
    }

    private void checkField(Field field, List<AbstractRule> rules) {
        for (AbstractRule rule : rules) {
            rule.checkField(field);
```

### BoundedWildcard
Can generalize to `? super NormalizedField`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedQueryTreeFactory.java`
#### Snippet
```java
                                                   FieldCollectorNormalizedQueryParams fieldCollectorNormalizedQueryParams,
                                                   Map<Field, List<NormalizedField>> fieldToMergedField,
                                                   Map<NormalizedField, MergedField> normalizedFieldToMergedField,
                                                   Map<FieldCoordinates, List<NormalizedField>> coordinatesToNormalizedFields,
                                                   int curLevel) {
```

### BoundedWildcard
Can generalize to `? super MergedField`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedQueryTreeFactory.java`
#### Snippet
```java
                                                   FieldCollectorNormalizedQueryParams fieldCollectorNormalizedQueryParams,
                                                   Map<Field, List<NormalizedField>> fieldToMergedField,
                                                   Map<NormalizedField, MergedField> normalizedFieldToMergedField,
                                                   Map<FieldCoordinates, List<NormalizedField>> coordinatesToNormalizedFields,
                                                   int curLevel) {
```

### BoundedWildcard
Can generalize to `? super FieldCoordinates`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedQueryTreeFactory.java`
#### Snippet
```java
                                                   Map<Field, List<NormalizedField>> fieldToMergedField,
                                                   Map<NormalizedField, MergedField> normalizedFieldToMergedField,
                                                   Map<FieldCoordinates, List<NormalizedField>> coordinatesToNormalizedFields,
                                                   int curLevel) {
        CollectFieldResult fieldsWithoutChildren = fieldCollector.collectFields(fieldCollectorNormalizedQueryParams, field, mergedField, curLevel + 1);
```

### BoundedWildcard
Can generalize to `? super Field`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedQueryTreeFactory.java`
#### Snippet
```java
    }

    private void updateByAstFieldMap(NormalizedField normalizedField, MergedField mergedField, Map<Field, List<NormalizedField>> fieldToNormalizedField) {
        for (Field astField : mergedField.getFields()) {
            fieldToNormalizedField.computeIfAbsent(astField, ignored -> new ArrayList<>()).add(normalizedField);
```

### BoundedWildcard
Can generalize to `? extends Type`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java

    @SuppressWarnings("rawtypes")
    public static Map<String, Type> mapTypeNodesByKey(@NotNull List<Type> nodes) {
        //noinspection unchecked
        return mapNodesByKey(nodes, AstPrinter::printAst);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<?>> List<T> toList(@NotNull Map<String, T> target) {
        return new ArrayList<>(target.values());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<?>> void mergeNodes(@NotNull Map<String, T> target, @NotNull Map<String, T> source) {
        source.forEach((key, value) -> target.merge(key, value, (oldValue, newValue) -> oldValue));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<?>> void mergeNodes(@NotNull Map<String, T> target, @NotNull Map<String, T> source) {
        source.forEach((key, value) -> target.merge(key, value, (oldValue, newValue) -> oldValue));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<?>> void mergeNodes(@NotNull Map<String, T> target, @NotNull Map<String, T> source) {
        source.forEach((key, value) -> target.merge(key, value, (oldValue, newValue) -> oldValue));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<T>> Map<String, T> mapNodesByKey(@NotNull List<T> nodes, @NotNull Function<T, String> keyMapper) {
        return nodes.stream().collect(Collectors.toMap(keyMapper, value -> value, (oldValue, newValue) -> oldValue));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLTypeDefinitionUtil.java`
#### Snippet
```java
    }

    public static <T extends Node<T>> Map<String, T> mapNodesByKey(@NotNull List<T> nodes, @NotNull Function<T, String> keyMapper) {
        return nodes.stream().collect(Collectors.toMap(keyMapper, value -> value, (oldValue, newValue) -> oldValue));
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLDirective`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java

    @NotNull
    private List<Directive> createDirectives(@NotNull List<GraphQLDirective> directives) {
        return mapNotNull(directives, this::createDirective);
    }
```

### BoundedWildcard
Can generalize to `? extends GraphQLInputValueDefinition`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java

    @NotNull
    private List<InputValueDefinition> createInputValueDefinitions(@NotNull List<GraphQLInputValueDefinition> defs) {
        return mapNotNull(defs, this::createInputValueDefinition);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private void collectFieldsForField(Map<String, List<FieldAndType>> fieldMap, GraphQLType parentType, Field field) {
        String responseName = field.getResultKey();
        if (!fieldMap.containsKey(responseName)) {
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private Argument findArgumentByName(String name, List<Argument> arguments) {
        for (Argument argument : arguments) {
            if (argument.getName().equals(name)) {
```

### BoundedWildcard
Can generalize to `? extends Argument`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private boolean sameArguments(List<Argument> arguments1, List<Argument> arguments2) {
        if (arguments1.size() != arguments2.size()) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private List<Field> collectFields(List<Conflict> conflicts) {
        List<Field> result = new ArrayList<>();
        for (Conflict conflict : conflicts) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private List<Conflict> findConflicts(Map<String, List<FieldAndType>> fieldMap) {
        List<Conflict> result = new ArrayList<>();
        for (String name : fieldMap.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private String joinReasons(List<Conflict> conflicts) {
        StringBuilder result = new StringBuilder();
        result.append("(");
```

### BoundedWildcard
Can generalize to `? extends PsiLanguageInjectionHost.Shred`
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
    }

    private List<PsiLanguageInjectionHost.Shred> mergePlacesIntoOne(List<PsiLanguageInjectionHost.Shred> places) {

        final PsiLanguageInjectionHost.Shred mergedShred = new PsiLanguageInjectionHost.Shred() {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java

    private void collectField(FieldCollectorNormalizedQueryParams parameters,
                              Map<String, Map<GraphQLObjectType, NormalizedField>> result,
                              Map<NormalizedField, MergedField> mergedFieldByNormalizedField,
                              Field field,
```

### BoundedWildcard
Can generalize to `? super NormalizedField`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
    private void collectField(FieldCollectorNormalizedQueryParams parameters,
                              Map<String, Map<GraphQLObjectType, NormalizedField>> result,
                              Map<NormalizedField, MergedField> mergedFieldByNormalizedField,
                              Field field,
                              Set<GraphQLObjectType> objectTypes,
```

### BoundedWildcard
Can generalize to `? extends GraphQLObjectType`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
                              Map<NormalizedField, MergedField> mergedFieldByNormalizedField,
                              Field field,
                              Set<GraphQLObjectType> objectTypes,
                              int level,
                              NormalizedField parent) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
    }

    private List<NormalizedField> subFieldsToList(Map<String, Map<GraphQLObjectType, NormalizedField>> subFields) {
        List<NormalizedField> children = new ArrayList<>();
        subFields.values().forEach(setMergedFieldWTCMap -> {
```

### BoundedWildcard
Can generalize to `? extends GraphQLObjectType`
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
    }

    private Set<GraphQLObjectType> narrowDownPossibleObjects(Set<GraphQLObjectType> currentOnes,
                                                             GraphQLCompositeType typeCondition,
                                                             GraphQLSchema graphQLSchema) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
    public final static Key<GraphQLEndpointsModel> GRAPH_QL_ENDPOINTS_MODEL = Key.create("graphql.endpoints.model");

    public final static Key<Boolean> GRAPH_QL_EDITOR_QUERYING = Key.create("graphql.editor.querying");

    private static final int UPDATE_MS = 500;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
    public static final Key<JPanel> GRAPH_QL_QUERY_COMPONENT = Key.create(GRAPH_QL_VARIABLES_JSON + ".query.component");

    public final static Key<GraphQLEndpointsModel> GRAPH_QL_ENDPOINTS_MODEL = Key.create("graphql.endpoints.model");

    public final static Key<Boolean> GRAPH_QL_EDITOR_QUERYING = Key.create("graphql.editor.querying");
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/ide/resolve/GraphQLReferenceService.java`
#### Snippet
```java
     * Sentinel reference for use in concurrent maps which don't allow nulls
     */
    private final static PsiReference NULL_REFERENCE = new PsiReferenceBase<PsiElement>(
        new LeafPsiElement(GraphQLElementTypes.TYPE, "type"), true
    ) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/ide/completion/AddColonSpaceInsertHandler.java`
#### Snippet
```java
public class AddColonSpaceInsertHandler implements InsertHandler<LookupElement> {

  public final static InsertHandler<LookupElement> INSTANCE_WITH_AUTO_POPUP = new AddColonSpaceInsertHandler(true);

  private final String myIgnoreOnChars;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/ide/documentation/GraphQLDocumentationProvider.java`
#### Snippet
```java
public class GraphQLDocumentationProvider extends DocumentationProviderEx {

    private final static String GRAPHQL_DOC_PREFIX = GraphQLConstants.GraphQL;

    @Nullable
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/util/IntraThreadMemoizedSupplier.java`
#### Snippet
```java
@Internal
class IntraThreadMemoizedSupplier<T> implements Supplier<T> {
    private final static Object SENTINEL = new Object() {
    };

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
@Internal
public class StringValueParsing {
    private final static String ESCAPED_TRIPLE_QUOTES = "\\\\\"\"\""; // ahh Java + Regex
    private final static String THREE_QUOTES = "\"\"\"";

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
public class StringValueParsing {
    private final static String ESCAPED_TRIPLE_QUOTES = "\\\\\"\"\""; // ahh Java + Regex
    private final static String THREE_QUOTES = "\"\"\"";

    public static @NotNull String parseTripleQuotedString(@NotNull String strText) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
    private final static String SEP = "/";

    private final static DataFetchingFieldSelectionSet NOOP = new DataFetchingFieldSelectionSet() {

        @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
public class DataFetchingFieldSelectionSetImpl implements DataFetchingFieldSelectionSet {

    private final static String SEP = "/";

    private final static DataFetchingFieldSelectionSet NOOP = new DataFetchingFieldSelectionSet() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    }

    private final static Set<String> SYSTEM_SCALARS = new LinkedHashSet<>();

    static {
```

### MissortedModifiers
Missorted modifiers `@Nullable final`
in `src/main/com/intellij/lang/jsgraphql/types/language/Description.java`
#### Snippet
```java
    public final SourceLocation sourceLocation;
    public final boolean multiLine;
    private @Nullable final PsiElement element;

    public Description(String content, SourceLocation sourceLocation, boolean multiLine) {
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
     * @return an optional id of the persisted query
     */
    abstract protected Optional<Object> getPersistedQueryId(ExecutionInput executionInput);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/schema/library/GraphQLLibraryManager.java`
#### Snippet
```java

public final class GraphQLLibraryManager {
    private final static Logger LOG = Logger.getInstance(GraphQLLibraryManager.class);
    private static final String DEFINITIONS_RESOURCE_DIR = "definitions";
    private static final GraphQLLibrary EMPTY_LIBRARY =
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/com/intellij/lang/jsgraphql/javascript/injection/GraphQLJavaScriptLanguageInjectionUtil.java`
#### Snippet
```java
    private static final ElementPattern<JSExpression> GRAPHQL_CALL_ARG_PATTERN = JSPatterns.jsArgument(GRAPHQL_TEMPLATE_TAG, 0);

    public final static Set<String> SUPPORTED_TAG_NAMES = Sets.newHashSet(
        RELAY_QL_TEMPLATE_TAG,
        GRAPHQL_TEMPLATE_TAG,
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `isNullOrEmpty(descriptionText)`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java

        String descriptionText = getDescription(graphQLType);
        if (isNullOrEmpty(descriptionText)) {
            return;
        }
```

### DuplicateCondition
Duplicate condition `isNullOrEmpty(descriptionText)`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
        }

        if (!isNullOrEmpty(descriptionText)) {
            List<String> lines = Arrays.asList(descriptionText.split("\n"));
            if (options.isDescriptionsAsHashComments()) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitGraphQLFieldDefinition()` only delegates to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeCollectingVisitor.java`
#### Snippet
```java

    @Override
    public TraversalControl visitGraphQLFieldDefinition(GraphQLFieldDefinition node, TraverserContext<GraphQLSchemaElement> context) {

        return super.visitGraphQLFieldDefinition(node, context);
```

### RedundantMethodOverride
Method `getDefaultDataFetcher()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public DataFetcher getDefaultDataFetcher(FieldWiringEnvironment environment) {
        return null;
    }
```

### RedundantMethodOverride
Method `getScalar()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public GraphQLScalarType getScalar(ScalarWiringEnvironment environment) {
        return assertShouldNeverHappen();
    }
```

### RedundantMethodOverride
Method `getDataFetcher()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public DataFetcher getDataFetcher(FieldWiringEnvironment environment) {
        return assertShouldNeverHappen();
    }
```

### RedundantMethodOverride
Method `providesDataFetcher()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public boolean providesDataFetcher(FieldWiringEnvironment environment) {
        return false;
    }
```

### RedundantMethodOverride
Method `providesScalar()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public boolean providesScalar(ScalarWiringEnvironment environment) {
        return false;
    }
```

### RedundantMethodOverride
Method `providesTypeResolver()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public boolean providesTypeResolver(UnionWiringEnvironment environment) {
        return false;
    }
```

### RedundantMethodOverride
Method `providesTypeResolver()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public boolean providesTypeResolver(InterfaceWiringEnvironment environment) {
        return false;
    }
```

### RedundantMethodOverride
Method `getTypeResolver()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public TypeResolver getTypeResolver(UnionWiringEnvironment environment) {
        return assertShouldNeverHappen();
    }
```

### RedundantMethodOverride
Method `getTypeResolver()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java

    @Override
    public TypeResolver getTypeResolver(InterfaceWiringEnvironment environment) {
        return assertShouldNeverHappen();
    }
```

### RedundantMethodOverride
Method `getFieldDefinitions()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/DefaultGraphqlFieldVisibility.java`
#### Snippet
```java

    @Override
    public List<GraphQLInputObjectField> getFieldDefinitions(GraphQLInputFieldsContainer fieldsContainer) {
        return fieldsContainer.getFieldDefinitions();
    }
```

### RedundantMethodOverride
Method `getFieldDefinition()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/DefaultGraphqlFieldVisibility.java`
#### Snippet
```java

    @Override
    public GraphQLInputObjectField getFieldDefinition(GraphQLInputFieldsContainer fieldsContainer, String fieldName) {
        return fieldsContainer.getFieldDefinition(fieldName);
    }
```

### RedundantMethodOverride
Method `visitGraphQLInterfaceType()` only delegates to its super method
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java

        @Override
        public TraversalControl visitGraphQLInterfaceType(GraphQLInterfaceType node,
                                                          TraverserContext<GraphQLSchemaElement> context) {
            return super.visitGraphQLInterfaceType(node, context);
```

### RedundantMethodOverride
Method `getDescription()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
    }

    public Description getDescription() {
        return description;
    }
```

### RedundantMethodOverride
Method `checkFragmentDefinition()` only delegates to its super method
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/NoUndefinedVariables.java`
#### Snippet
```java

    @Override
    public void checkFragmentDefinition(FragmentDefinition fragmentDefinition) {
        super.checkFragmentDefinition(fragmentDefinition);
    }
```

### RedundantMethodOverride
Method `checkDocument()` only delegates to its super method
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueDirectiveNamesPerLocation.java`
#### Snippet
```java

    @Override
    public void checkDocument(Document document) {
        super.checkDocument(document);
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlIDCoercing.java`
#### Snippet
```java
            return String.valueOf(input);
        }
        if (input instanceof BigInteger) {
            return String.valueOf(input);
        }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java
            Optional<TypeDefinition> memberTypeDefinition = typeRegistry.getType(memberTypeName);

            if (!memberTypeDefinition.isPresent() || !(memberTypeDefinition.get() instanceof ObjectTypeDefinition)) {
                errors.add(new UnionMemberNotAnObjectTypeError(unionTypeDefinition, ((TypeName) memberType)));
                continue;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
        directives.forEach(directive -> {
            Optional<DirectiveDefinition> directiveDefinition = typeRegistry.getDirectiveDefinition(directive.getName());
            if (!directiveDefinition.isPresent()) {
                errors.add(new DirectiveUndeclaredError(element, elementName, directive.getName()));
            } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
        // ensure we have a "query" one
        Optional<OperationTypeDefinition> query = operationTypeDefinitions.stream().filter(op -> "query".equals(op.getName())).findFirst();
        if (!query.isPresent()) {
            // its ok if they have a type named Query
            Optional<TypeDefinition> queryType = typeRegistry.getType("Query");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
            // its ok if they have a type named Query
            Optional<TypeDefinition> queryType = typeRegistry.getType("Query");
            if (!queryType.isPresent()) {
                errors.add(new QueryOperationMissingError());
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

        Optional<OperationTypeDefinition> queryOperation = getOperationNamed("query", operationTypeDefs);
        if (!queryOperation.isPresent()) {
            Optional<TypeDefinition> queryTypeDef = typeRegistry.getType("Query");
            if (queryTypeDef.isPresent()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

        Optional<OperationTypeDefinition> mutationOperation = getOperationNamed("mutation", operationTypeDefs);
        if (!mutationOperation.isPresent()) {
            Optional<TypeDefinition> mutationTypeDef = typeRegistry.getType("Mutation");
            if (mutationTypeDef.isPresent()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

        Optional<OperationTypeDefinition> subscriptionOperation = getOperationNamed("subscription", operationTypeDefs);
        if (!subscriptionOperation.isPresent()) {
            Optional<TypeDefinition> subscriptionTypeDef = typeRegistry.getType("Subscription");
            if (subscriptionTypeDef.isPresent()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
                                memberType -> {
                                    Optional<ObjectTypeDefinition> unionTypeDefinition = typeRegistry.getType(memberType, ObjectTypeDefinition.class);
                                    if (!unionTypeDefinition.isPresent()) {
                                        errors.add(new MissingTypeError("union member", extension, memberType));
                                    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
        TypeDefinition extensionDefinition = extTypeList.get(0);
        Optional<? extends TypeDefinition> typeDefinition = typeRegistry.getType(TypeName.newTypeName().name(name).build(), targetClass);
        if (!typeDefinition.isPresent()) {
            errors.add(new TypeExtensionMissingBaseTypeError(extensionDefinition));
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
            TypeName unwrapped = typeInfo.getTypeName();
            Optional<TypeDefinition> type = typeRegistry.getType(unwrapped);
            if (!type.isPresent()) {
                errors.add(new MissingInterfaceTypeError("interface", typeDefinition, unwrapped));
            } else if (!(type.get() instanceof InterfaceTypeDefinition)) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java

        // must be new
        if (!oldOpTypeDef.isPresent()) {
            return;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            .build());

        if (oldOpTypeDef.isPresent() && !newOpTypeDef.isPresent()) {
            ctx.report(DiffEvent.apiBreakage()
                .category(DiffCategory.MISSING)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        // if we have no old op, then it must have been added (which is ok)
        Optional<TypeDefinition> oldTD = ctx.getOldTypeDef(oldType, TypeDefinition.class);
        if (!oldTD.isPresent()) {
            return;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Optional<InputValueDefinition> oldArg = Optional.ofNullable(oldArgsMap.get(newArg.getName()));

            if (!oldArg.isPresent()) {
                // new args MUST not be mandatory
                if (typeInfo(newArg.getType()).isNonNull()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Directive oldDirective = oldDirectivesMap.get(directiveName);
            Optional<Directive> newDirective = Optional.ofNullable(newDirectivesMap.get(directiveName));
            if (!newDirective.isPresent()) {
                ctx.report(DiffEvent.apiBreakage()
                    .category(DiffCategory.MISSING)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
                Optional<Argument> newArgument = Optional.ofNullable(newArgumentsByName.get(argName));

                if (!newArgument.isPresent()) {
                    ctx.report(DiffEvent.apiBreakage()
                        .category(DiffCategory.MISSING)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Optional<EnumValueDefinition> newEnum = Optional.ofNullable(newDefinitionMap.get(enumName));

            if (!newEnum.isPresent()) {
                DiffCategory category;
                String message;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
        Optional<TypeDefinition> newTD = ctx.getNewTypeDef(newType, TypeDefinition.class);

        if (!oldTD.isPresent()) {
            ctx.report(DiffEvent.apiInfo()
                .typeName(typeName)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            .build());

        if (!newTD.isPresent()) {
            ctx.report(DiffEvent.apiBreakage()
                .category(DiffCategory.MISSING)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Optional<InterfaceTypeDefinition> oldInterface = ctx.getOldTypeDef(entry.getValue(),
                InterfaceTypeDefinition.class);
            if (!oldInterface.isPresent()) {
                continue;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Optional<InterfaceTypeDefinition> newInterface = ctx.getNewTypeDef(newImplementsMap.get(entry.getKey()),
                InterfaceTypeDefinition.class);
            if (!newInterface.isPresent()) {
                ctx.report(DiffEvent.apiBreakage()
                    .category(DiffCategory.MISSING)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java


            if (!newField.isPresent()) {
                DiffCategory category;
                String message;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            Optional<InputValueDefinition> oldField = Optional.ofNullable(oldDefinitionMap.get(inputFieldName));

            if (!oldField.isPresent()) {
                // new fields MUST not be mandatory
                if (typeInfo(newField.getType()).isNonNull()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/ValidationUtil.java`
#### Snippet
```java
            Optional<GraphQLError> invalid = parseLiteral(value, ((GraphQLScalarType) type).getCoercing());
            invalid.ifPresent(graphQLError -> handleScalarError(value, (GraphQLScalarType) type, graphQLError));
            return !invalid.isPresent();
        }
        if (type instanceof GraphQLEnumType) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/ValidationUtil.java`
#### Snippet
```java
            Optional<GraphQLError> invalid = parseLiteralEnum(value, (GraphQLEnumType) type);
            invalid.ifPresent(graphQLError -> handleEnumError(value, (GraphQLEnumType) type, graphQLError));
            return !invalid.isPresent();
        }

```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypesImplementInterfaces.java`
#### Snippet
```java
        List<String> objectArgsNames = map(objectArgs, GraphQLArgument::getName);

        if (!objectArgsNames.containsAll(interfaceArgsByName.keySet())) {
            final String missingArgsNames = interfaceArgsByName.keySet().stream()
                    .filter(name -> !objectArgsNames.contains(name))
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLAlias.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLAlias.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLAlias extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLArgument.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLArgument.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLArgument extends GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLArguments.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLArguments extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLArgumentsDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLArgumentsDefinition extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLArrayValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLArrayValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBlockString.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBlockString.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBlockString.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLBlockString extends GraphQLStringLiteral {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBooleanValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBooleanValue.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLBooleanValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLBooleanValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDefaultValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDefaultValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDefaultValue extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDefinition.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDefinition extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDescription.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDescription.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDescription extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirective.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirective.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDirective extends GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirectiveDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirectiveLocation.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirectiveLocation.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirectiveLocation.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDirectiveLocation extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLDirectiveLocations.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLDirectiveLocations extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLEnumTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLEnumTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLEnumValue extends GraphQLValue, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumValueDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLEnumValueDefinition extends GraphQLDirectivesAware, GraphQLDescriptionAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumValueDefinitions.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLEnumValueDefinitions extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLField.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLField extends GraphQLDirectivesAware, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFieldDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFieldDefinition extends GraphQLDirectivesAware, GraphQLNamedElement, GraphQLDescriptionAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFieldsDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFieldsDefinition extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFloatValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFloatValue.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFloatValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFloatValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFragmentDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFragmentDefinition extends GraphQLDefinition, GraphQLDirectivesAware, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFragmentSelection.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFragmentSelection.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFragmentSelection extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLFragmentSpread.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLFragmentSpread extends GraphQLDirectivesAware, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIdentifier.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIdentifier.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIdentifier.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLIdentifier extends GraphQLReferenceElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLImplementsInterfaces.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLImplementsInterfaces extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInlineFragment.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInlineFragment extends GraphQLDirectivesAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputObjectTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInputObjectTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputObjectTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInputObjectTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputObjectValueDefinitions.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInputObjectValueDefinitions extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputValueDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInputValueDefinition extends GraphQLDirectivesAware, GraphQLNamedElement, GraphQLDescriptionAware {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIntValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIntValue.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLIntValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLIntValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInterfaceTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInterfaceTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLListType.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLListType.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLListType extends GraphQLType {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLNonNullType.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLNonNullType.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLNonNullType extends GraphQLType {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLNullValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLNullValue.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLNullValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLNullValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectField.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectField.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLObjectField extends GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLObjectTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLObjectTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLObjectValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationDefinition.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLOperationDefinition extends GraphQLDefinition, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationType.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationType.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationType.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLOperationType extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationTypeDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLOperationTypeDefinition extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLOperationTypeDefinitions.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLOperationTypeDefinitions extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLQuotedString.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLQuotedString.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLQuotedString.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLQuotedString extends GraphQLStringLiteral {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLScalarTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLScalarTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLScalarTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLScalarTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSchemaDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLSchemaDefinition extends GraphQLTypeSystemDefinition, GraphQLDirectivesAware, GraphQLDescriptionAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSchemaExtension.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLSchemaExtension extends GraphQLTypeSystemDefinition, GraphQLDirectivesAware {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSelection.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSelection.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLSelection extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSelectionSet.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLSelectionSet extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSelectionSetOperationDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLSelectionSetOperationDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLSelectionSetOperationDefinition extends GraphQLOperationDefinition {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLStringLiteral.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLStringLiteral.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLStringLiteral.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLStringLiteral extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLStringValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLStringValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLStringValue extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateDefinition.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTemplateDefinition extends GraphQLDefinition {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateSelection.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateSelection.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateSelection.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTemplateSelection extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateVariable.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateVariable.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTemplateVariable.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTemplateVariable extends GraphQLValue {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLType.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLType.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLType.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLType extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeCondition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeCondition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeCondition extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeDefinition.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeDefinition extends GraphQLTypeSystemDefinition, GraphQLDescriptionAware {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeExtension.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeExtension.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeExtension.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeExtension extends GraphQLTypeSystemDefinition {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeName.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeName.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeName extends GraphQLType, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeNameDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeNameDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeNameDefinition extends GraphQLType, GraphQLNamedElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeSystemDefinition.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeSystemDefinition.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypeSystemDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypeSystemDefinition extends GraphQLDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLTypedOperationDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLTypedOperationDefinition extends GraphQLOperationDefinition, GraphQLDirectivesAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionMembers.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLUnionMembers extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionMembership.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionMembership.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLUnionMembership extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionTypeDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLUnionTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionTypeExtensionDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLUnionTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLValue.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLValue.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLValue.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLValue extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVariable.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.*;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVariable.java`
#### Snippet
```java

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVariable.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVariableDefinition.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLVariableDefinition extends GraphQLDirectivesAware {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVariableDefinitions.java`
#### Snippet
```java
import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLVariableDefinitions extends GraphQLElement {
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiNamedElement;`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiNamedElement;

public class GraphQLVisitorBase extends PsiElementVisitor {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLAliasImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLAliasImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLAliasImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLAliasImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentsDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentsDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArrayValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArrayValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBlockStringImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBlockStringImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBlockStringImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBlockStringImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBooleanValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBooleanValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBooleanValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLBooleanValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefaultValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefaultValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefaultValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefaultValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDescriptionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDescriptionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDescriptionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDescriptionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueDefinitionsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueDefinitionsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLEnumValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldsDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldsDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFloatValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFloatValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFloatValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFloatValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSelectionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSelectionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSpreadImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentSpreadImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIdentifierImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIdentifierImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIdentifierImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIdentifierImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLImplementsInterfacesImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLImplementsInterfacesImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInlineFragmentImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInlineFragmentImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectValueDefinitionsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputObjectValueDefinitionsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputValueDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputValueDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIntValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIntValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIntValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLIntValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInterfaceTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInterfaceTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInterfaceTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInterfaceTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLListTypeImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLListTypeImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLListTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLListTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNonNullTypeImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNonNullTypeImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNonNullTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNonNullTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNullValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNullValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNullValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLNullValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeDefinitionsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLQuotedStringImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLQuotedStringImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLQuotedStringImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLQuotedStringImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLScalarTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLScalarTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLScalarTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLScalarTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSchemaDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSchemaDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSchemaExtensionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSchemaExtensionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetOperationDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetOperationDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateSelectionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateSelectionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateSelectionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateVariableImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateVariableImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateVariableImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTemplateVariableImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeConditionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeConditionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeConditionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeConditionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeExtensionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeExtensionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeExtensionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeExtensionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeSystemDefinitionImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeSystemDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeSystemDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeSystemDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypedOperationDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypedOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembersImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembersImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembershipImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembershipImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembershipImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionMembershipImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionTypeDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionTypeDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLUnionTypeExtensionDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLValueImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLValueImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLValueImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableDefinitionImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableDefinitionImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableDefinitionsImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableDefinitionsImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableImpl.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.util.PsiTreeUtil;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;
```

### UNUSED_IMPORT
Unused import `import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableImpl.java`
#### Snippet
```java
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.jsgraphql.psi.GraphQLElementTypes.*;
import com.intellij.lang.jsgraphql.psi.*;

```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/GraphQLSyntaxHighlighter.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import java.util.HashSet;`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/GraphQLSyntaxHighlighter.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/GraphQLSyntaxHighlighter.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
```

### UNUSED_IMPORT
Unused import `import com.intellij.openapi.roots.ProjectFileIndex;`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/inspections/GraphQLInspection.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.schema.library.GraphQLLibraryManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.profile.codeInspection.InspectionProjectProfileManager;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLDescriptionAware.java`
#### Snippet
```java

import com.intellij.lang.jsgraphql.psi.GraphQLDescription;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLDirectivesAware.java`
#### Snippet
```java

import com.intellij.lang.jsgraphql.psi.GraphQLDirective;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.PsiElement;`
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLTypeScopeProvider.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import com.intellij.psi.PsiElement;
import com.intellij.lang.jsgraphql.types.schema.GraphQLType;

```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.injection.InjectedLanguageManager;`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java

import com.intellij.lang.ASTNode;
import com.intellij.lang.injection.InjectedLanguageManager;
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLCachingReference;
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLReferenceService;
```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.jsgraphql.ide.resolve.GraphQLScopeProvider;`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLCachingReference;
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLReferenceService;
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLScopeProvider;
import com.intellij.lang.jsgraphql.psi.GraphQLFieldDefinition;
import com.intellij.lang.jsgraphql.psi.GraphQLFile;
```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.jsgraphql.psi.GraphQLFile;`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.ide.resolve.GraphQLScopeProvider;
import com.intellij.lang.jsgraphql.psi.GraphQLFieldDefinition;
import com.intellij.lang.jsgraphql.psi.GraphQLFile;
import com.intellij.lang.jsgraphql.psi.GraphQLIdentifier;
import com.intellij.lang.jsgraphql.psi.GraphQLReferenceElement;
```

### UNUSED_IMPORT
Unused import `import com.intellij.psi.search.SearchScope;`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.util.CachedValue;
import com.intellij.psi.util.CachedValueProvider;
```

### UNUSED_IMPORT
Unused import `import com.intellij.util.ObjectUtils;`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.util.PsiModificationTracker;
import com.intellij.util.ObjectUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeDefinition.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.NotNull;`
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractDescribedNode.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.types.PublicApi;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.NotNull;`
in `src/main/com/intellij/lang/jsgraphql/types/language/Argument.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.types.util.TraverserContext;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.jsgraphql.types.Assert;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.types.schema.idl;

import com.intellij.lang.jsgraphql.types.Assert;
import com.intellij.lang.jsgraphql.types.GraphQLError;
import com.intellij.lang.jsgraphql.types.Internal;
```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.jsgraphql.types.Directives;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.types.schema.idl;

import com.intellij.lang.jsgraphql.types.Directives;
import com.intellij.lang.jsgraphql.types.GraphQLError;
import com.intellij.lang.jsgraphql.types.Internal;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Predicate;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

```

### UNUSED_IMPORT
Unused import `import static java.lang.String.format;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java
import java.util.stream.Stream;

import static java.lang.String.format;

/**
```

### UNUSED_IMPORT
Unused import `import com.intellij.lang.jsgraphql.types.VisibleForTesting;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/InvalidSchemaException.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.types.GraphQLException;
import com.intellij.lang.jsgraphql.types.Internal;
import com.intellij.lang.jsgraphql.types.VisibleForTesting;

import java.util.Collection;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`positionToOffset = positionToOffset - context.getTextOffset()` could be simplified to 'positionToOffset -= context.getTextOffset()'
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
            if (context != null) {
                // injected file, so adjust the position
                positionToOffset = positionToOffset - context.getTextOffset();
            }
            return containingFile.findElementAt(positionToOffset);
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/main/com/intellij/lang/jsgraphql/types/GraphQLContext.java`
#### Snippet
```java

        private Builder putImpl(Object... kvs) {
            for (int i = 0; i < kvs.length; i = i + 2) {
                Object k = kvs[i];
                Object v = kvs[i + 1];
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
```

### NestedAssignment
Result of assignment expression used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
```

### NestedAssignment
Result of assignment expression used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];
```

### NestedAssignment
Result of assignment expression used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];
```

### NestedAssignment
Result of assignment expression used
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
            final RunNode current = next;
            run(current);
            if ((next = current.get()) == null) { // try advance, if we get null test
                if (last.compareAndSet(current, null)) {
                    return; // end-of-queue: we're done.
```

### NestedAssignment
Result of assignment expression used
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
                } else {
                    //noinspection StatementWithEmptyBody
                    while ((next = current.get()) == null) {
                        // Thread.onSpinWait(); in Java 9
                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeDefinition.java`
#### Snippet
```java
        }

        return myMergedDefinition = mergeDefinitions();
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
            String childText;
            if ((injectionHost.getTextLength() == textRange.getEndOffset() && textRange.getStartOffset() == 0) ||
                (canProcessFragment((childText = injectionHost.getText()).substring(0, textRange.getStartOffset()), injectionHost) &&
                    canProcessFragment(childText.substring(textRange.getEndOffset()), injectionHost))) {
                injectedFile[0] = injectedPsi;
```

## RuleId[id=NonExtendableApiUsage]
### NonExtendableApiUsage
Interface 'com.intellij.psi.PsiLanguageInjectionHost.Shred' must not be implemented
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
    private List<PsiLanguageInjectionHost.Shred> mergePlacesIntoOne(List<PsiLanguageInjectionHost.Shred> places) {

        final PsiLanguageInjectionHost.Shred mergedShred = new PsiLanguageInjectionHost.Shred() {

            private PsiLanguageInjectionHost.Shred getFirst() {
```

### NonExtendableApiUsage
Interface 'com.intellij.psi.PsiLanguageInjectionHost.Shred' must not be implemented
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
        final PsiLanguageInjectionHost.Shred mergedShred = new PsiLanguageInjectionHost.Shred() {

            private PsiLanguageInjectionHost.Shred getFirst() {
                return places.get(0);
            }
```

### NonExtendableApiUsage
Interface 'com.intellij.psi.PsiLanguageInjectionHost.Shred' must not be implemented
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
            @Override
            public void dispose() {
                places.forEach(PsiLanguageInjectionHost.Shred::dispose);
            }

```

### NonExtendableApiUsage
Interface 'com.intellij.psi.PsiLanguageInjectionHost.Shred' must not be implemented
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
            @Override
            public boolean isValid() {
                for (PsiLanguageInjectionHost.Shred place : places) {
                    if (!place.isValid()) {
                        return false;
```

### NonExtendableApiUsage
Interface 'com.intellij.psi.PsiLanguageInjectionHost.Shred' must not be implemented
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedLanguageBlockBuilder.java`
#### Snippet
```java
            }

            private PsiLanguageInjectionHost.Shred getLast() {
                return places.get(places.size() - 1);
            }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java

    private void introspectEndpoints() {
        DumbService.getInstance(myProject).smartInvokeLater(() -> {
            ApplicationManager.getApplication().executeOnPooledThread(() -> {
                Set<String> visitedUrls = new HashSet<>();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
                .collect(toMap(FieldDefinition::getName, Function.identity(), mergeFirstValue()));

        implementedInterfaces.forEach((implementedInterface, implementingType) -> {
            implementedInterface.getFieldDefinitions().forEach(interfaceFieldDef -> {
                FieldDefinition typeFieldDef = typeFields.get(interfaceFieldDef.getName());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
        implementedInterfaces.entrySet().stream()
                .filter(entry -> !interfacesImplementedOnce.containsKey(entry.getKey()))
                .forEach(entry -> {
                    entry.getValue().forEach(offendingType -> {
                        errors.add(new InterfaceImplementedMoreThanOnceError(TYPE_OF_MAP.get(offendingType.getClass()), offendingType, entry.getKey()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
                .filter(entry -> !interfacesImplementedOnce.containsKey(entry.getKey()))
                .forEach(entry -> {
                    entry.getValue().forEach(offendingType -> {
                        errors.add(new InterfaceImplementedMoreThanOnceError(TYPE_OF_MAP.get(offendingType.getClass()), offendingType, entry.getKey()));
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(builder::field));

        extensions.forEach(extension -> extension.getFieldDefinitions().forEach(fieldDef -> {
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(fieldDefinition -> {
                if (!builder.hasField(fieldDefinition.getName())) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        );

        typeDefinition.getFieldDefinitions().forEach(fieldDef -> {
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(builder::field);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        });

        extensions.forEach(extension -> extension.getFieldDefinitions().forEach(fieldDef -> {
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(fieldDefinition -> {
                if (!builder.hasField(fieldDefinition.getName())) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
                    (directiveName, directive) -> new NonUniqueDirectiveError(typeDefinition, fieldDefinition, directiveName));
        }
        fieldDefinitions.forEach(fld -> fld.getDirectives().forEach(directive -> {

            checkNamedUniqueness(errors, directive.getArguments(), Argument::getName,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
                        .collect(ImmutableList.toImmutableList());

                Document changedNode = node.transform(builder -> {
                    builder.definitions(wantedDefinitions);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java

    private NodePrinter<SelectionSet> selectionSet() {
        return (out, node) -> {
            out.append(block(node.getSelections()));
        };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java

    public void traverseSubTree(Consumer<NormalizedField> consumer) {
        this.getChildren().forEach(child -> {
            traverseImpl(child, consumer, 1, Integer.MAX_VALUE);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java
        Assert.assertTrue(includingRelativeLevel >= 1, () -> "relative level must be >= 1");

        this.getChildren().forEach(child -> {
            traverseImpl(child, result::add, 1, includingRelativeLevel);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedField.java`
#### Snippet
```java
        }
        consumer.accept(root);
        root.getChildren().forEach(child -> {
            traverseImpl(child, consumer, curRelativeLevel + 1, abortAfter);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
    static {
        register(__Schema, "description", environment -> {
            return environment.getGraphQLSchema().getDescription();
        });
        register(__Schema, "types", environment -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
        // make sure all TypeReferences are resolved.
        // note: it is important to put this on the bottom of static code block.
        ProgressManager.getInstance().executeNonCancelableSection(() -> {
            GraphQLSchema.newSchema().query(IntrospectionQuery).build();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
    private List<NormalizedField> subFieldsToList(Map<String, Map<GraphQLObjectType, NormalizedField>> subFields) {
        List<NormalizedField> children = new ArrayList<>();
        subFields.values().forEach(setMergedFieldWTCMap -> {
            children.addAll(setMergedFieldWTCMap.values());
        });
```

## RuleId[id=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Property 'GRAPHQL_TOOL_WINDOW' could be private
in `src/main/com/intellij/lang/jsgraphql/ide/project/toolwindow/GraphQLToolWindow.kt`
#### Snippet
```java

    companion object {
        const val GRAPHQL_TOOL_WINDOW = GraphQLConstants.GraphQL
        const val CONTENT_QUERY_RESULT_CONTENT = "Query Result"
        const val CONTENT_SCHEMAS_AND_PROJECT_STRUCTURE_CONTENT = "Schemas and Project Structure"
```

### MemberVisibilityCanBePrivate
Function 'getContributedFileTypes' could be private
in `src/main/com/intellij/lang/jsgraphql/ide/search/GraphQLFileTypesProvider.kt`
#### Snippet
```java
    }

    fun getContributedFileTypes(): Collection<FileType> {
        return myContributedFileTypes.value
    }
```

### MemberVisibilityCanBePrivate
Function 'getSourcePath' could be private
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/remote/GraphQLRemoteSchemasRegistry.kt`
#### Snippet
```java
    }

    fun getSourcePath(file: VirtualFile?): String? {
        return file?.let { associations[it.path] }
    }
```

### MemberVisibilityCanBePrivate
Function 'addTypeDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun addTypeDefinition(definition: SDLDefinition<*>) {
        LOG.assertTrue(!GraphQLTypeDefinitionUtil.isExtension(definition))

```

### MemberVisibilityCanBePrivate
Function 'getCompositeDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun getCompositeDefinition(definition: SDLDefinition<*>): GraphQLCompositeDefinition<*>? {
        if (definition is SchemaDefinition) {
            return schemaCompositeDefinition
```

### MemberVisibilityCanBePrivate
Function 'addDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun addDefinition(definition: SDLDefinition<*>) {
        if (GraphQLTypeDefinitionUtil.isExtension(definition)) {
            addExtensionDefinition(definition)
```

### MemberVisibilityCanBePrivate
Function 'addExtensionDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun addExtensionDefinition(definition: SDLDefinition<*>) {
        LOG.assertTrue(GraphQLTypeDefinitionUtil.isExtension(definition))

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `TYPE_OF_MAP` are updated, but never queried
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java
@Internal
class UnionTypesChecker {
    private static final Map<Class<? extends UnionTypeDefinition>, String> TYPE_OF_MAP = new HashMap<>();

    static {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `value` is accessed in both synchronized and unsynchronized contexts
in `src/main/com/intellij/lang/jsgraphql/types/util/InterThreadMemoizedSupplier.java`
#### Snippet
```java
    private final Supplier<T> delegate;
    private volatile boolean initialized;
    private T value;

    public InterThreadMemoizedSupplier(Supplier<T> delegate) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `immediateFields` is accessed in both synchronized and unsynchronized contexts
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java

    private volatile boolean computedValues;
    private List<SelectedField> immediateFields;
    private Map<String, List<SelectedField>> normalisedSelectionSetFields;
    private Set<String> flattenedFieldsForGlobSearching;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `flattenedFieldsForGlobSearching` is accessed in both synchronized and unsynchronized contexts
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
    private List<SelectedField> immediateFields;
    private Map<String, List<SelectedField>> normalisedSelectionSetFields;
    private Set<String> flattenedFieldsForGlobSearching;

    private DataFetchingFieldSelectionSetImpl(Supplier<NormalizedField> normalizedFieldSupplier) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `normalisedSelectionSetFields` is accessed in both synchronized and unsynchronized contexts
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
    private volatile boolean computedValues;
    private List<SelectedField> immediateFields;
    private Map<String, List<SelectedField>> normalisedSelectionSetFields;
    private Set<String> flattenedFieldsForGlobSearching;

```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLRecursiveVisitor.java`
#### Snippet
```java
    };

    protected void elementFinished(@NotNull PsiElement element) {
    }

```

### EmptyMethod
All implementations of this method are empty
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitor.java`
#### Snippet
```java
    }

    void visitInlineFragment(QueryVisitorInlineFragmentEnvironment queryVisitorInlineFragmentEnvironment);

    void visitFragmentSpread(QueryVisitorFragmentSpreadEnvironment queryVisitorFragmentSpreadEnvironment);
```

### EmptyMethod
All implementations of this method are empty
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitor.java`
#### Snippet
```java
    void visitInlineFragment(QueryVisitorInlineFragmentEnvironment queryVisitorInlineFragmentEnvironment);

    void visitFragmentSpread(QueryVisitorFragmentSpreadEnvironment queryVisitorFragmentSpreadEnvironment);

    default void visitFragmentDefinition(QueryVisitorFragmentDefinitionEnvironment queryVisitorFragmentDefinitionEnvironment) {
```

### EmptyMethod
All implementations of this method are empty
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java
         * producing data
         */
        void onSubscription();
    }
}
```

### EmptyMethod
The method is empty
in `src/main/com/intellij/lang/jsgraphql/types/validation/AbstractRule.java`
#### Snippet
```java
    }

    public void checkSelectionSet(SelectionSet selectionSet) {

    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/GraphQLSettings.java`
#### Snippet
```java
        public boolean enableRelayModernFrameworkSupport;
        public boolean enableFederationSupport = false;
        public boolean enableApolloKotlinSupport = false;
    }
}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/GraphQLSettings.java`
#### Snippet
```java

        public boolean enableRelayModernFrameworkSupport;
        public boolean enableFederationSupport = false;
        public boolean enableApolloKotlinSupport = false;
    }
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/GraphQLSettings.java`
#### Snippet
```java
        public String introspectionQuery = "";
        public boolean enableIntrospectionDefaultValues = true;
        public boolean enableIntrospectionRepeatableDirectives = false;
        public boolean openEditorWithIntrospectionResult = true;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/com/intellij/lang/jsgraphql/ide/formatter/GraphQLBlock.java`
#### Snippet
```java
public class GraphQLBlock extends AbstractBlock {

    private List<Block> blocks = null;

    public static Set<IElementType> INDENT_PARENTS = Sets.newHashSet(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
        operationOrFragment.accept(new PsiRecursiveElementVisitor() {

            private boolean done = false;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
    public static final String GRAPHQL_TRUST_ALL_HOSTS = "graphql.trust.all.hosts";

    private volatile GraphQLIntrospectionTask latestIntrospection = null;
    private final AtomicBoolean myIntrospected = new AtomicBoolean();
    private final Project myProject;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
        private Instrumentation instrumentation = null; // deliberate default here
        private PreparsedDocumentProvider preparsedDocumentProvider = NoOpPreparsedDocumentProvider.INSTANCE;
        private boolean doNotAddDefaultInstrumentations = false;
        private ValueUnboxer valueUnboxer = ValueUnboxer.DEFAULT;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
        private DataFetcherExceptionHandler defaultExceptionHandler = new SimpleDataFetcherExceptionHandler();
        private ExecutionIdProvider idProvider = DEFAULT_EXECUTION_ID_PROVIDER;
        private Instrumentation instrumentation = null; // deliberate default here
        private PreparsedDocumentProvider preparsedDocumentProvider = NoOpPreparsedDocumentProvider.INSTANCE;
        private boolean doNotAddDefaultInstrumentations = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java
    private List<SourceLocation> locations = new ArrayList<>();
    private ErrorClassification errorType = ErrorType.DataFetchingException;
    private Map<String, Object> extensions = null;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirective.java`
#### Snippet
```java
        private final Map<String, GraphQLArgument> arguments = new LinkedHashMap<>();
        private DirectiveDefinition definition;
        private boolean repeatable = false;

        public Builder() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java

    int breakageCount = 0;
    int dangerCount = 0;
    final PrintStream out;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java
public class PrintStreamReporter implements DifferenceReporter {

    int breakageCount = 0;
    int dangerCount = 0;
    final PrintStream out;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveDefinition.java`
#### Snippet
```java
        private ImmutableList<Comment> comments = emptyList();
        private String name;
        private boolean repeatable = false;
        private Description description;
        private ImmutableList<InputValueDefinition> inputValueDefinitions = emptyList();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java
    private boolean running = true;
    private boolean noMoreData = false;
    private long demand = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java
    private Throwable pendingThrowable = null;
    private boolean running = true;
    private boolean noMoreData = false;
    private long demand = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java

    private Subscriber<? super T> subscriber;
    private Throwable pendingThrowable = null;
    private boolean running = true;
    private boolean noMoreData = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/LoneAnonymousOperation.java`
#### Snippet
```java

    boolean hasAnonymousOp = false;
    int count = 0;

    public LoneAnonymousOperation(ValidationContext validationContext, ValidationErrorCollector validationErrorCollector) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/LoneAnonymousOperation.java`
#### Snippet
```java
public class LoneAnonymousOperation extends AbstractRule {

    boolean hasAnonymousOp = false;
    int count = 0;

```

## RuleId[id=KotlinUnusedImport]
### KotlinUnusedImport
Unused import directive
in `src/main/com/intellij/lang/jsgraphql/ide/notifications/GraphQLNotificationUtil.kt`
#### Snippet
```java
import com.intellij.openapi.util.text.StringUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.util.ObjectUtils
import javax.net.ssl.SSLException
```

### KotlinUnusedImport
Unused import directive
in `src/main/com/intellij/lang/jsgraphql/ide/notifications/GraphQLNotificationUtil.kt`
#### Snippet
```java
import com.intellij.util.ObjectUtils
import javax.net.ssl.SSLException
import javax.swing.event.HyperlinkEvent

const val GRAPHQL_NOTIFICATION_GROUP_ID = GraphQLConstants.GraphQL
```

## RuleId[id=PrivatePropertyName]
### PrivatePropertyName
Private property name `RELOAD_TIMESTAMP_KEY` should not contain underscores in the middle or the end
in `src/main/com/intellij/lang/jsgraphql/ide/config/GraphQLConfigStatusEditorNotificationProvider.kt`
#### Snippet
```java
import javax.swing.JComponent

private val RELOAD_TIMESTAMP_KEY = Key.create<Long?>("graphql.editor.notification.reload.timestamp")

class GraphQLConfigStatusEditorNotificationProvider : EditorNotificationProvider {
```

### PrivatePropertyName
Private property name `HIDE_ERROR_KEY` should not contain underscores in the middle or the end
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/source/GraphQLGeneratedSourcesEditorNotificationProvider.kt`
#### Snippet
```java
import javax.swing.JComponent

private val HIDE_ERROR_KEY = Key.create<Boolean?>("graphql.show.sdl.generation.error")

class GraphQLGeneratedSourcesEditorNotificationProvider : EditorNotificationProvider {
```

### PrivatePropertyName
Private property name `EXTENSIONS` doesn't match regex '_?\[a-z\]\[A-Za-z\\d\]\*'
in `src/main/com/intellij/lang/jsgraphql/javascript/config/GraphQLJavaScriptConfigLoader.kt`
#### Snippet
```java
private val LOG = logger<GraphQLJavaScriptConfigLoader>()

private val EXTENSIONS = setOf("js", "ts", "cjs")

class GraphQLJavaScriptConfigLoader : GraphQLConfigCustomLoader {
```

### PrivatePropertyName
Private property name `LOG` doesn't match regex '_?\[a-z\]\[A-Za-z\\d\]\*'
in `src/main/com/intellij/lang/jsgraphql/javascript/config/GraphQLJavaScriptConfigLoader.kt`
#### Snippet
```java
private const val TIMEOUT = 15000

private val LOG = logger<GraphQLJavaScriptConfigLoader>()

private val EXTENSIONS = setOf("js", "ts", "cjs")
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInterfaceTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLUnionTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLEnumTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputObjectTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLInputObjectTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLEnumTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLEnumTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLObjectTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLObjectTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLObjectTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInputObjectTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLInputObjectTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLUnionTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLUnionTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLScalarTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLScalarTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeExtension`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLInterfaceTypeExtensionDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeExtensionDefinition extends GraphQLTypeExtension, GraphQLDirectivesAware, GraphQLNamedTypeExtension {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLScalarTypeDefinition.java`
#### Snippet
```java
import com.intellij.psi.PsiElement;

public interface GraphQLScalarTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLNamedTypeDefinition {

  @Nullable
```

### RedundantImplements
Redundant interface declaration `GraphQLObjectValue`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectValueImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLObjectValueImpl extends GraphQLObjectValueMixin implements GraphQLObjectValue {

  public GraphQLObjectValueImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLField`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLFieldImpl extends GraphQLFieldMixin implements GraphQLField {

  public GraphQLFieldImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLObjectField`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLObjectFieldImpl extends GraphQLObjectFieldMixin implements GraphQLObjectField {

  public GraphQLObjectFieldImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLDirectiveLocation`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLDirectiveLocationImpl extends GraphQLDirectiveLocationMixin implements GraphQLDirectiveLocation {

  public GraphQLDirectiveLocationImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLInlineFragment`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInlineFragmentImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLInlineFragmentImpl extends GraphQLInlineFragmentMixin implements GraphQLInlineFragment {

  public GraphQLInlineFragmentImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLFragmentDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentDefinitionImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLFragmentDefinitionImpl extends GraphQLFragmentDefinitionMixin implements GraphQLFragmentDefinition {

  public GraphQLFragmentDefinitionImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLInputValueDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputValueDefinitionImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLInputValueDefinitionImpl extends GraphQLInputValueDefinitionMixin implements GraphQLInputValueDefinition {

  public GraphQLInputValueDefinitionImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLTypedOperationDefinition`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypedOperationDefinitionImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLTypedOperationDefinitionImpl extends GraphQLTypedOperationDefinitionMixin implements GraphQLTypedOperationDefinition {

  public GraphQLTypedOperationDefinitionImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLStringLiteral`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public abstract class GraphQLStringLiteralImpl extends GraphQLStringLiteralMixin implements GraphQLStringLiteral {

  public GraphQLStringLiteralImpl(ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLArgument`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLArgumentImpl extends GraphQLArgumentMixin implements GraphQLArgument {

  public GraphQLArgumentImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLTypeName`
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameImpl.java`
#### Snippet
```java
import com.intellij.lang.jsgraphql.psi.*;

public class GraphQLTypeNameImpl extends GraphQLTypeNameMixin implements GraphQLTypeName {

  public GraphQLTypeNameImpl(@NotNull ASTNode node) {
```

### RedundantImplements
Redundant interface declaration `GraphQLElement`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableMixin.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class GraphQLVariableMixin extends GraphQLElementImpl implements GraphQLElement, PsiNamedElement {
    public GraphQLVariableMixin(@NotNull ASTNode node) {
        super(node);
```

### RedundantImplements
Redundant interface declaration `DataFetcher`>
in `src/main/com/intellij/lang/jsgraphql/types/relay/SimpleListConnection.java`
#### Snippet
```java

@PublicApi
public class SimpleListConnection<T> implements DataFetcher<Connection<T>>, TrivialDataFetcher<Connection<T>> {

    static final String DUMMY_CURSOR_PREFIX = "simple-cursor";
```

### RedundantImplements
Redundant interface declaration `GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLList.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLList implements GraphQLType, GraphQLInputType, GraphQLOutputType, GraphQLModifiedType, GraphQLNullableType {


```

### RedundantImplements
Redundant interface declaration `GraphQLNamedSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLArgument implements GraphQLNamedSchemaElement, GraphQLInputValueDefinition {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyDataFetcher.java`
#### Snippet
```java
 */
@PublicApi
public class PropertyDataFetcher<T> implements DataFetcher<T>, TrivialDataFetcher<T> {

    private final String propertyName;
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumValueDefinition.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLEnumValueDefinition implements GraphQLNamedSchemaElement, GraphQLDirectiveContainer {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/schema/StaticDataFetcher.java`
#### Snippet
```java
 */
@PublicApi
public class StaticDataFetcher implements DataFetcher, TrivialDataFetcher {


```

### RedundantImplements
Redundant interface declaration `GraphQLType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLNonNull.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLNonNull implements GraphQLType, GraphQLInputType, GraphQLOutputType, GraphQLModifiedType {

    /**
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLInputObjectField implements GraphQLNamedSchemaElement, GraphQLInputValueDefinition {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedOutputType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLUnionType implements GraphQLNamedOutputType, GraphQLCompositeType, GraphQLUnmodifiedType, GraphQLNullableType, GraphQLDirectiveContainer {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedSchemaElement`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLFieldDefinition implements GraphQLNamedSchemaElement, GraphQLDirectiveContainer {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLInterfaceType implements GraphQLNamedType, GraphQLCompositeType, GraphQLUnmodifiedType, GraphQLNullableType, GraphQLDirectiveContainer, GraphQLImplementingType {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `GraphQLCompositeType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLInterfaceType implements GraphQLNamedType, GraphQLCompositeType, GraphQLUnmodifiedType, GraphQLNullableType, GraphQLDirectiveContainer, GraphQLImplementingType {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `GraphQLNamedOutputType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLObjectType implements GraphQLNamedOutputType, GraphQLCompositeType, GraphQLUnmodifiedType, GraphQLNullableType, GraphQLDirectiveContainer, GraphQLImplementingType {


```

### RedundantImplements
Redundant interface declaration `GraphQLCompositeType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLObjectType implements GraphQLNamedOutputType, GraphQLCompositeType, GraphQLUnmodifiedType, GraphQLNullableType, GraphQLDirectiveContainer, GraphQLImplementingType {


```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class ScalarTypeDefinition extends AbstractDescribedNode<ScalarTypeDefinition> implements TypeDefinition<ScalarTypeDefinition>, DirectivesContainer<ScalarTypeDefinition>, NamedNode<ScalarTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/ScalarTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class ScalarTypeDefinition extends AbstractDescribedNode<ScalarTypeDefinition> implements TypeDefinition<ScalarTypeDefinition>, DirectivesContainer<ScalarTypeDefinition>, NamedNode<ScalarTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class ObjectTypeDefinition extends AbstractDescribedNode<ObjectTypeDefinition> implements ImplementingTypeDefinition<ObjectTypeDefinition>, DirectivesContainer<ObjectTypeDefinition>, NamedNode<ObjectTypeDefinition> {
    private final String name;
    private final ImmutableList<Type> implementz;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class ObjectTypeDefinition extends AbstractDescribedNode<ObjectTypeDefinition> implements ImplementingTypeDefinition<ObjectTypeDefinition>, DirectivesContainer<ObjectTypeDefinition>, NamedNode<ObjectTypeDefinition> {
    private final String name;
    private final ImmutableList<Type> implementz;
```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class InputObjectTypeDefinition extends AbstractDescribedNode<InputObjectTypeDefinition> implements TypeDefinition<InputObjectTypeDefinition>, DirectivesContainer<InputObjectTypeDefinition>, NamedNode<InputObjectTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class InputObjectTypeDefinition extends AbstractDescribedNode<InputObjectTypeDefinition> implements TypeDefinition<InputObjectTypeDefinition>, DirectivesContainer<InputObjectTypeDefinition>, NamedNode<InputObjectTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class UnionTypeDefinition extends AbstractDescribedNode<UnionTypeDefinition> implements TypeDefinition<UnionTypeDefinition>, DirectivesContainer<UnionTypeDefinition>, NamedNode<UnionTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class UnionTypeDefinition extends AbstractDescribedNode<UnionTypeDefinition> implements TypeDefinition<UnionTypeDefinition>, DirectivesContainer<UnionTypeDefinition>, NamedNode<UnionTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class InterfaceTypeDefinition extends AbstractDescribedNode<InterfaceTypeDefinition> implements ImplementingTypeDefinition<InterfaceTypeDefinition>, DirectivesContainer<InterfaceTypeDefinition>, NamedNode<InterfaceTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class InterfaceTypeDefinition extends AbstractDescribedNode<InterfaceTypeDefinition> implements ImplementingTypeDefinition<InterfaceTypeDefinition>, DirectivesContainer<InterfaceTypeDefinition>, NamedNode<InterfaceTypeDefinition> {

    private final String name;
```

### RedundantImplements
Redundant interface declaration `DirectivesContainer`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class EnumTypeDefinition extends AbstractDescribedNode<EnumTypeDefinition> implements TypeDefinition<EnumTypeDefinition>, DirectivesContainer<EnumTypeDefinition>, NamedNode<EnumTypeDefinition> {
    private final String name;
    private final ImmutableList<EnumValueDefinition> enumValueDefinitions;
```

### RedundantImplements
Redundant interface declaration `NamedNode`
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java

@PublicApi
public class EnumTypeDefinition extends AbstractDescribedNode<EnumTypeDefinition> implements TypeDefinition<EnumTypeDefinition>, DirectivesContainer<EnumTypeDefinition>, NamedNode<EnumTypeDefinition> {
    private final String name;
    private final ImmutableList<EnumValueDefinition> enumValueDefinitions;
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `TypeExtensionDirectiveRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/TypeExtensionDirectiveRedefinitionError.java`
#### Snippet
```java

@Internal
public class TypeExtensionDirectiveRedefinitionError extends BaseError {

    public TypeExtensionDirectiveRedefinitionError(TypeDefinition typeExtensionDefinition, Directive directive) {
```

### ExceptionNameDoesntEndWithException
Exception class name `TypeExtensionFieldRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/TypeExtensionFieldRedefinitionError.java`
#### Snippet
```java

@Internal
public class TypeExtensionFieldRedefinitionError extends BaseError {

    public TypeExtensionFieldRedefinitionError(TypeDefinition typeDefinition, FieldDefinition fieldDefinition, FieldDefinition redefinedField) {
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceImplementedMoreThanOnceError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceImplementedMoreThanOnceError.java`
#### Snippet
```java

@Internal
public class InterfaceImplementedMoreThanOnceError extends BaseError {
    public InterfaceImplementedMoreThanOnceError(String typeOfType,
                                                 ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `UnionMemberNotAnObjectTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/UnionMemberNotAnObjectTypeError.java`
#### Snippet
```java
import static java.lang.String.format;

public class UnionMemberNotAnObjectTypeError extends BaseError {
    public UnionMemberNotAnObjectTypeError(@NotNull UnionTypeDefinition definition, @NotNull TypeName memberType) {
        super(definition, format(
```

### ExceptionNameDoesntEndWithException
Exception class name `NotAnInputTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NotAnInputTypeError.java`
#### Snippet
```java

@Internal
public class NotAnInputTypeError extends BaseError {

    public NotAnInputTypeError(@NotNull Type rawType, @NotNull TypeDefinition typeDefinition) {
```

### ExceptionNameDoesntEndWithException
Exception class name `NonSDLDefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NonSDLDefinitionError.java`
#### Snippet
```java

@Internal
public class NonSDLDefinitionError extends BaseError {

    public NonSDLDefinitionError(Definition definition) {
```

### ExceptionNameDoesntEndWithException
Exception class name `NotAnOutputTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NotAnOutputTypeError.java`
#### Snippet
```java

@Internal
public class NotAnOutputTypeError extends BaseError {

    public NotAnOutputTypeError(@NotNull Type rawType, @NotNull TypeDefinition typeDefinition) {
```

### ExceptionNameDoesntEndWithException
Exception class name `QueryOperationMissingError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/QueryOperationMissingError.java`
#### Snippet
```java

@Internal
public class QueryOperationMissingError extends BaseError {

    public QueryOperationMissingError() {
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingTransitiveInterfaceError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingTransitiveInterfaceError.java`
#### Snippet
```java

@Internal
public class MissingTransitiveInterfaceError extends BaseError {
    public MissingTransitiveInterfaceError(String typeOfType,
                                           ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `NonUniqueArgumentError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NonUniqueArgumentError.java`
#### Snippet
```java

@Internal
public class NonUniqueArgumentError extends BaseError {

    public NonUniqueArgumentError(TypeDefinition typeDefinition, FieldDefinition fieldDefinition, String argumentName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `TypeRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/TypeRedefinitionError.java`
#### Snippet
```java

@Internal
public class TypeRedefinitionError extends BaseError {

    public TypeRedefinitionError(TypeDefinition newEntry, TypeDefinition oldEntry) {
```

### ExceptionNameDoesntEndWithException
Exception class name `TypeExtensionEnumValueRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/TypeExtensionEnumValueRedefinitionError.java`
#### Snippet
```java

@Internal
public class TypeExtensionEnumValueRedefinitionError extends BaseError {

    public TypeExtensionEnumValueRedefinitionError(TypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `IllegalNameError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/IllegalNameError.java`
#### Snippet
```java

@Internal
public class IllegalNameError extends BaseError {
    public IllegalNameError(@NotNull NamedNode namedNode) {
        super(namedNode, String.format("'%s' must not begin with '__', which is reserved by GraphQL introspection.", namedNode.getName()));
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveUndeclaredError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveUndeclaredError.java`
#### Snippet
```java

@Internal
public class DirectiveUndeclaredError extends BaseError {

    public DirectiveUndeclaredError(Node element, String elementName, String directiveName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `NonUniqueDirectiveError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NonUniqueDirectiveError.java`
#### Snippet
```java

@Internal
public class NonUniqueDirectiveError extends BaseError {

    public NonUniqueDirectiveError(TypeDefinition typeDefinition, FieldDefinition fieldDefinition, String directiveName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingTypeError.java`
#### Snippet
```java

@Internal
public class MissingTypeError extends BaseError {

    public MissingTypeError(String typeOfType, TypeDefinition typeDefinition, TypeName typeName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveIllegalLocationError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveIllegalLocationError.java`
#### Snippet
```java

@Internal
public class DirectiveIllegalLocationError extends BaseError {

    public DirectiveIllegalLocationError(Node element, String elementName, String directiveName, String locationName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `TypeExtensionMissingBaseTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/TypeExtensionMissingBaseTypeError.java`
#### Snippet
```java

@Internal
public class TypeExtensionMissingBaseTypeError extends BaseError {

    public TypeExtensionMissingBaseTypeError(TypeDefinition typeExtensionDefinition) {
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveMissingNonNullArgumentError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveMissingNonNullArgumentError.java`
#### Snippet
```java

@Internal
public class DirectiveMissingNonNullArgumentError extends BaseError {

    public DirectiveMissingNonNullArgumentError(Node element, String elementName, String directiveName, String argumentName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceWithCircularImplementationHierarchyError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceWithCircularImplementationHierarchyError.java`
#### Snippet
```java

@Internal
public class InterfaceWithCircularImplementationHierarchyError extends BaseError {
    public InterfaceWithCircularImplementationHierarchyError(String typeOfType,
                                                             ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingInterfaceFieldError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingInterfaceFieldError.java`
#### Snippet
```java

@Internal
public class MissingInterfaceFieldError extends BaseError {
    public MissingInterfaceFieldError(String typeOfType,
                                      ImplementingTypeDefinition objectType,
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveRedefinitionError.java`
#### Snippet
```java

@Internal
public class DirectiveRedefinitionError extends BaseError {

    public DirectiveRedefinitionError(DirectiveDefinition newEntry, DirectiveDefinition oldEntry) {
```

### ExceptionNameDoesntEndWithException
Exception class name `SchemaRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/SchemaRedefinitionError.java`
#### Snippet
```java

@Internal
public class SchemaRedefinitionError extends BaseError {

    public SchemaRedefinitionError(SchemaDefinition oldEntry, SchemaDefinition newEntry) {
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceFieldArgumentNotOptionalError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceFieldArgumentNotOptionalError.java`
#### Snippet
```java

@Internal
public class InterfaceFieldArgumentNotOptionalError extends BaseError {
    public InterfaceFieldArgumentNotOptionalError(String typeOfType,
                                                  ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveNonRepeatableError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveNonRepeatableError.java`
#### Snippet
```java
import static java.lang.String.format;

public class DirectiveNonRepeatableError extends BaseError {
    public DirectiveNonRepeatableError(@NotNull Directive directive) {
        super(directive,
```

### ExceptionNameDoesntEndWithException
Exception class name `OperationRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/OperationRedefinitionError.java`
#### Snippet
```java

@Internal
public class OperationRedefinitionError extends BaseError {

    public OperationRedefinitionError(OperationTypeDefinition oldEntry, OperationTypeDefinition newEntry) {
```

### ExceptionNameDoesntEndWithException
Exception class name `SchemaProblem` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/SchemaProblem.java`
#### Snippet
```java
 */
@Internal
public class SchemaProblem extends GraphQLException {

    private final List<GraphQLError> errors;
```

### ExceptionNameDoesntEndWithException
Exception class name `EmptyUnionTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/EmptyUnionTypeError.java`
#### Snippet
```java
import static java.lang.String.format;

public class EmptyUnionTypeError extends BaseError {
    public EmptyUnionTypeError(UnionTypeDefinition definition) {
        super(definition, format("Union type '%s' must include one or more member types.", definition.getName()));
```

### ExceptionNameDoesntEndWithException
Exception class name `BaseError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/BaseError.java`
#### Snippet
```java
@SuppressWarnings("rawtypes")
@Internal
public class BaseError extends GraphQLException implements GraphQLError {
    protected static final SourceLocation EMPTY = new SourceLocation(-1, -1);

```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveIllegalReferenceError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveIllegalReferenceError.java`
#### Snippet
```java

@Internal
public class DirectiveIllegalReferenceError extends BaseError {
    public DirectiveIllegalReferenceError(DirectiveDefinition directive, NamedNode location) {
        super(directive,
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceImplementingItselfError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceImplementingItselfError.java`
#### Snippet
```java

@Internal
public class InterfaceImplementingItselfError extends BaseError {
    public InterfaceImplementingItselfError(String typeOfType, ImplementingTypeDefinition typeDefinition) {
        super(typeDefinition, format("The %s type '%s' cannot implement itself",
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveUnknownArgumentError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveUnknownArgumentError.java`
#### Snippet
```java

@Internal
public class DirectiveUnknownArgumentError extends BaseError {

    public DirectiveUnknownArgumentError(Node element, String elementName, String directiveName, String argumentName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingInterfaceFieldArgumentsError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingInterfaceFieldArgumentsError.java`
#### Snippet
```java

@Internal
public class MissingInterfaceFieldArgumentsError extends BaseError {
    public MissingInterfaceFieldArgumentsError(String typeOfType,
                                               ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `OperationTypesMustBeObjects` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/OperationTypesMustBeObjects.java`
#### Snippet
```java

@Internal
public class OperationTypesMustBeObjects extends BaseError {

    public OperationTypesMustBeObjects(OperationTypeDefinition op) {
```

### ExceptionNameDoesntEndWithException
Exception class name `DirectiveIllegalArgumentTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/DirectiveIllegalArgumentTypeError.java`
#### Snippet
```java

@Internal
public class DirectiveIllegalArgumentTypeError extends BaseError {

    public static final String DUPLICATED_KEYS_MESSAGE = "Argument value object keys [%s] appear more than once.";
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingInterfaceTypeError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingInterfaceTypeError.java`
#### Snippet
```java

@Internal
public class MissingInterfaceTypeError extends BaseError {

    public MissingInterfaceTypeError(String typeOfType, TypeDefinition typeDefinition, TypeName typeName) {
```

### ExceptionNameDoesntEndWithException
Exception class name `NonUniqueNameError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/NonUniqueNameError.java`
#### Snippet
```java

@Internal
public class NonUniqueNameError extends BaseError {

    public NonUniqueNameError(TypeDefinition typeDefinition, FieldDefinition fieldDefinition) {
```

### ExceptionNameDoesntEndWithException
Exception class name `MissingInterfaceFieldArgumentError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/MissingInterfaceFieldArgumentError.java`
#### Snippet
```java

@Internal
public class MissingInterfaceFieldArgumentError extends BaseError {
    public MissingInterfaceFieldArgumentError(String typeOfType,
                                              ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceFieldRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceFieldRedefinitionError.java`
#### Snippet
```java

@Internal
public class InterfaceFieldRedefinitionError extends BaseError {
    public InterfaceFieldRedefinitionError(String typeOfType,
                                           ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `InterfaceFieldArgumentRedefinitionError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/InterfaceFieldArgumentRedefinitionError.java`
#### Snippet
```java

@Internal
public class InterfaceFieldArgumentRedefinitionError extends BaseError {
    public InterfaceFieldArgumentRedefinitionError(String typeOfType,
                                                   ImplementingTypeDefinition typeDefinition,
```

### ExceptionNameDoesntEndWithException
Exception class name `UnionMemberNotUniqueError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/errors/UnionMemberNotUniqueError.java`
#### Snippet
```java
import static java.lang.String.format;

public class UnionMemberNotUniqueError extends BaseError {
    public UnionMemberNotUniqueError(@NotNull UnionTypeDefinition definition, @NotNull TypeName memberType) {
        super(definition,
```

### ExceptionNameDoesntEndWithException
Exception class name `SchemaValidationError` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/SchemaValidationError.java`
#### Snippet
```java

@Internal
public class SchemaValidationError extends BaseError {

    private final SchemaValidationErrorType errorType;
```

### ExceptionNameDoesntEndWithException
Exception class name `PersistedQueryNotFound` does not end with 'Exception'
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryNotFound.java`
#### Snippet
```java
 */
@PublicApi
public class PersistedQueryNotFound extends RuntimeException implements ErrorClassification {
    private final Object persistedQueryId;

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/com/intellij/lang/jsgraphql/types/schema/AsyncDataFetcher.java`
#### Snippet
```java
                return wrappedDataFetcher.get(environment);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                } else {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `sourceLocations` of exception class
in `src/main/com/intellij/lang/jsgraphql/types/execution/MissingRootTypeException.java`
#### Snippet
```java
@PublicApi
public class MissingRootTypeException extends GraphQLException implements GraphQLError {
    private List<SourceLocation> sourceLocations;

    public MissingRootTypeException(String message, SourceLocation sourceLocation) {
```

### NonFinalFieldOfException
Non-final field `sourceLocations` of exception class
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableValueCoercedAsNullException.java`
#### Snippet
```java
@PublicApi
public class NonNullableValueCoercedAsNullException extends GraphQLException implements GraphQLError {
    private List<SourceLocation> sourceLocations;

    public NonNullableValueCoercedAsNullException(VariableDefinition variableDefinition, GraphQLType graphQLType) {
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java
    public void onEnd() {
        out.println("\n");
        out.println(format("%d errors", breakageCount));
        out.println(format("%d warnings", dangerCount));
        out.println("\n");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java
        out.println("\n");
        out.println(format("%d errors", breakageCount));
        out.println(format("%d warnings", dangerCount));
        out.println("\n");
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java
            objectName = objectName + "." + event.getFieldName();
        }
        out.println(format(
                "%s%s - '%s' : '%s' : %s",
                indent, level, event.getTypeKind(), objectName, event.getReasonMsg()));
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/com/intellij/lang/jsgraphql/types/util/InterThreadMemoizedSupplier.java`
#### Snippet
```java
    public T get() {
        if (!initialized) {
            synchronized (this) {
                if (initialized) {
                    return value;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
        // if only to have only 1 lock in action at a time
        NormalizedField currentNormalisedField = normalizedFieldSupplier.get();
        synchronized (this) {
            if (computedValues) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/com/intellij/lang/jsgraphql/types/execution/directives/QueryDirectivesImpl.java`
#### Snippet
```java

    private void computeValuesLazily() {
        synchronized (this) {
            if (fieldDirectivesByField != null) {
                return;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionSSLBuilder.java`
#### Snippet
```java
        try (InputStream inputStream = Files.newInputStream(certPath)) {
            Collection<? extends Certificate> certCollection = certificateFactory.generateCertificates(inputStream);
            certChain = certCollection.toArray(new Certificate[0]);
        } catch (CertificateException | IOException e) {
            throw new RuntimeException(e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java

    private static GraphQLDirective[] schemaDirectivesArray(GraphQLSchema existingSchema) {
        return existingSchema.schemaDirectives.getDirectives().toArray(new GraphQLDirective[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
            output.add(gqlDirective);
        }
        return output.toArray(new GraphQLDirective[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java

        @SuppressWarnings("unchecked")
        CompletableFuture<U>[] arrayOfFutures = futures.toArray(new CompletableFuture[0]);
        CompletableFuture
                .allOf(arrayOfFutures)
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `src/main/com/intellij/lang/jsgraphql/types/TypeMismatchError.java`
#### Snippet
```java
    static class GraphQLTypeToTypeKindMapping {

        private static final Map<Class<? extends GraphQLType>, Introspection.TypeKind> registry = new LinkedHashMap<Class<? extends GraphQLType>, Introspection.TypeKind>() {{
            put(GraphQLEnumType.class, Introspection.TypeKind.ENUM);
            put(GraphQLList.class, Introspection.TypeKind.LIST);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result)` assigned to `offset` is never used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result)` assigned to `offset` is never used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    int [] result = new int[5900];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result)` assigned to `offset` is never used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result)` assigned to `offset` is never used
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            return false;
        }
        TypeDefinition targetObjectTypeDef = getType(possibleType).get();
        TypeDefinition abstractTypeDef = getType(abstractType).get();
        if (abstractTypeDef instanceof UnionTypeDefinition) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
        }
        TypeDefinition targetObjectTypeDef = getType(possibleType).get();
        TypeDefinition abstractTypeDef = getType(abstractType).get();
        if (abstractTypeDef instanceof UnionTypeDefinition) {
            List<Type> memberTypes = ((UnionTypeDefinition) abstractTypeDef).getMemberTypes();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `modificationType == ModificationType.DELETE` is always `true` when reached
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
            return this.curNode;
        }
        if (breadcrumbs.size() == 0 && modificationType == ModificationType.DELETE) {
            return null;
        }
```

### ConstantValue
Value `todoLocalContext` is always 'null'
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ValueFetcher.java`
#### Snippet
```java
        Object todoLocalContext = null;
        if (isDataFetcherBatched(executionContext, executionStepInfo)) {
            return fetchValue(executionContext, sources, todoLocalContext, field, executionStepInfo)
                    .thenApply(fetchedValue -> extractBatchedValues(fetchedValue, sources.size()));
        } else {
```

### ConstantValue
Value `todoLocalContext` is always 'null'
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ValueFetcher.java`
#### Snippet
```java
            List<CompletableFuture<FetchedValue>> fetchedValues = new ArrayList<>();
            for (int i = 0; i < sources.size(); i++) {
                fetchedValues.add(fetchValue(executionContext, sources.get(i), todoLocalContext, field, executionInfos.get(i)));
            }
            return Async.each(fetchedValues);
```

## RuleId[id=MismatchedStringCase]
### MismatchedStringCase
Method 'equals()' always returns false: the argument contains an uppercase symbol while the qualifier is lowercase-only
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
            // Anonymous queries with no directives or variable definitions can use
            // the query short form.
            if (isEmpty(name) && isEmpty(directives) && isEmpty(varDefinitions) && op.equals("QUERY")) {
                out.append(selectionSet);
            } else {
```

## RuleId[id=IOResource]
### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
    public static void printAst(Writer writer, Node node) {
        String ast = printAst(node);
        PrintWriter printer = new PrintWriter(writer);
        printer.write(ast);
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Factory` has only 'static' members, and lacks a 'private' constructor
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLElementTypes.java`
#### Snippet
```java
  IElementType VARIABLE_NAME = new GraphQLTokenType("VARIABLE_NAME");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/GraphQLConstants.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql;

public final class GraphQLConstants {

    public static final String GraphQL = "GraphQL";
```

### UtilityClassWithoutPrivateConstructor
Class `Schema` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/GraphQLConstants.java`
#### Snippet
```java
    public static final String GraphQL = "GraphQL";

    public static class Schema {
        public static final String __TYPE = "__type";
        public static final String __SCHEMA = "__schema";
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLDocumentationMarkdownRenderer` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/ide/documentation/GraphQLDocumentationMarkdownRenderer.java`
#### Snippet
```java
 * Renders GraphQL documentation based on the CommonMark spec as either plain text or HTML.
 */
public class GraphQLDocumentationMarkdownRenderer {

    private static final Parser PARSER = Parser.builder().build();
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLElementFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLElementFactory.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public final class GraphQLElementFactory {
    public static @NotNull GraphQLFile createFile(@NotNull Project project, @NotNull String text) {
        return createFile(project, "dummy", text);
```

### UtilityClassWithoutPrivateConstructor
Class `Scalars` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
 */
@PublicApi
public class Scalars {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Files` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIcons.java`
#### Snippet
```java
    }

    public static class Files {
        public static final Icon GraphQL = FILE;
        public static final Icon GraphQLConfig = GraphQLIcons.load("/icons/graphqlConfig.svg");
```

### UtilityClassWithoutPrivateConstructor
Class `Logos` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIcons.java`
#### Snippet
```java
    public static final Icon FILE = GraphQLIcons.load("/icons/graphql.svg");

    public static class Logos {
        public static final Icon GraphQL = FILE;
        public static final Icon Relay = GraphQLIcons.load("/icons/relay.svg");
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLIcons` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIcons.java`
#### Snippet
```java
import javax.swing.*;

public class GraphQLIcons {

    public static final Icon FILE = GraphQLIcons.load("/icons/graphql.svg");
```

### UtilityClassWithoutPrivateConstructor
Class `Schema` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIcons.java`
#### Snippet
```java
    }

    public static class Schema {
        public static final Icon Field = GraphQLIcons.load("/icons/field.svg");
        public static final Icon Scalar = GraphQLIcons.load("/icons/scalar.svg");
```

### UtilityClassWithoutPrivateConstructor
Class `UI` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIcons.java`
#### Snippet
```java
    }

    public static class UI {
        public static final Icon GraphQLToolWindow = GraphQLIcons.load("/icons/graphqlToolWindow.svg");
        public static final Icon GraphQLVariables = GraphQLIcons.load("/icons/variable.svg");
```

### UtilityClassWithoutPrivateConstructor
Class `GraphqlErrorHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorHelper.java`
#### Snippet
```java
@SuppressWarnings("SimplifiableIfStatement")
@Internal
public class GraphqlErrorHelper {

    public static Map<String, Object> toSpecification(GraphQLError error) {
```

### UtilityClassWithoutPrivateConstructor
Class `Assert` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/Assert.java`
#### Snippet
```java
@SuppressWarnings("TypeParameterUnusedInFormals")
@Internal
public class Assert {

    public static <T> T assertNotNull(T object, Supplier<String> msg) {
```

### UtilityClassWithoutPrivateConstructor
Class `Directives` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/Directives.java`
#### Snippet
```java
 */
@PublicApi
public class Directives {

    private static final String SPECIFIED_BY = "specifiedBy";
```

### UtilityClassWithoutPrivateConstructor
Class `DirectivesUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java

@Internal
public class DirectivesUtil {


```

### UtilityClassWithoutPrivateConstructor
Class `TreeTransformerUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java

@PublicApi
public class TreeTransformerUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CoercingUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/scalar/CoercingUtil.java`
#### Snippet
```java

@Internal
class CoercingUtil {
    static boolean isNumberIsh(Object input) {
        return input instanceof Number || input instanceof String;
```

### UtilityClassWithoutPrivateConstructor
Class `StringValueParsing` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
 */
@Internal
public class StringValueParsing {
    private final static String ESCAPED_TRIPLE_QUOTES = "\\\\\"\"\""; // ahh Java + Regex
    private final static String THREE_QUOTES = "\"\"\"";
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLTypeUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLTypeUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GraphqlTypeComparators` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java

@Internal
public class GraphqlTypeComparators {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FpKit` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/util/FpKit.java`
#### Snippet
```java

@Internal
public class FpKit {

    //
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyDataFetcherHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyDataFetcherHelper.java`
#### Snippet
```java
 */
@Internal
public class PropertyDataFetcherHelper {

    private static final PropertyFetchingImpl impl = new PropertyFetchingImpl(DataFetchingEnvironment.class);
```

### UtilityClassWithoutPrivateConstructor
Class `DataFetcherFactories` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java
 */
@PublicApi
public class DataFetcherFactories {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DirectiveInfo` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/DirectiveInfo.java`
#### Snippet
```java
 */
@PublicApi
public class DirectiveInfo {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Options` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGenerator.java`
#### Snippet
```java
     * These options control how the schema generation works
     */
    public static class Options {

        Options() {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeUtil.java`
#### Snippet
```java
 * This class consists of {@code static} utility methods for operating on {@link com.intellij.lang.jsgraphql.types.language.Type}.
 */
public class TypeUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `UnExecutableSchemaGenerator` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnExecutableSchemaGenerator.java`
#### Snippet
```java

@Internal
public class UnExecutableSchemaGenerator {

    /*
```

### UtilityClassWithoutPrivateConstructor
Class `ScalarInfo` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ScalarInfo.java`
#### Snippet
```java
 */
@PublicApi
public class ScalarInfo {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaExtensionsChecker` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaExtensionsChecker.java`
#### Snippet
```java

@Internal
public class SchemaExtensionsChecker {

    static Map<String, OperationTypeDefinition> gatherOperationDefs(TypeDefinitionRegistry typeRegistry) {
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableKit` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java

@Internal
public final class ImmutableKit {

    public static <T> ImmutableList<T> emptyList() {
```

### UtilityClassWithoutPrivateConstructor
Class `AstValueHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/language/AstValueHelper.java`
#### Snippet
```java

@Internal
public class AstValueHelper {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `NodeUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
 */
@Internal
public class NodeUtil {

    public static boolean isEqualTo(String thisStr, String thatStr) {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeFromAST` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/execution/TypeFromAST.java`
#### Snippet
```java

@Internal
public class TypeFromAST {


```

### UtilityClassWithoutPrivateConstructor
Class `Common` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/Common.java`
#### Snippet
```java

@Internal
public class Common {

    public static GraphQLObjectType getOperationRootType(GraphQLSchema graphQLSchema, OperationDefinition operationDefinition) {
```

### UtilityClassWithoutPrivateConstructor
Class `Async` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/execution/Async.java`
#### Snippet
```java
@Internal
@SuppressWarnings("FutureReturnValueIgnored")
public class Async {

    @FunctionalInterface
```

### UtilityClassWithoutPrivateConstructor
Class `FieldValidationSupport` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/fieldvalidation/FieldValidationSupport.java`
#### Snippet
```java

@Internal
class FieldValidationSupport {

    static List<GraphQLError> validateFieldsAndArguments(FieldValidation fieldValidation, ExecutionContext executionContext) {
```

### UtilityClassWithoutPrivateConstructor
Class `ResultNodesUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java

@Internal
public class ResultNodesUtil {

    public static ExecutionResult toExecutionResult(RootExecutionResultNode root) {
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLKnownTypes` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLKnownTypes.java`
#### Snippet
```java
import java.util.Set;

public class GraphQLKnownTypes {
    public static final String INTROSPECTION_QUERY_INTROSPECTION_META = "__QueryIntrospectionMeta";
    public static final String INTROSPECTION_TYPE_NAME_META = "__TypeNameMeta";
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLSchemaUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLSchemaUtil.java`
#### Snippet
```java
import static com.intellij.lang.jsgraphql.types.schema.GraphQLTypeUtil.*;

public class GraphQLSchemaUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Introspection` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java

@PublicApi
public class Introspection {
    private static final Map<FieldCoordinates, IntrospectionDataFetcher> introspectionDataFetchers = new LinkedHashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLRelayKnownTypes` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/frameworks/relay/GraphQLRelayKnownTypes.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.frameworks.relay;

public final class GraphQLRelayKnownTypes {
    public static final String ARGUMENT_DEFINITIONS_DIRECTIVE = "argumentDefinitions";
    public static final String ARGUMENTS_DIRECTIVE = "arguments";
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLApolloKnownTypes` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/frameworks/apollo/GraphQLApolloKnownTypes.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.frameworks.apollo;

public final class GraphQLApolloKnownTypes {
    public static final String CLIENT_DIRECTIVE = "client";
}
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLFederationKnownTypes` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/frameworks/federation/GraphQLFederationKnownTypes.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.frameworks.federation;

public class GraphQLFederationKnownTypes {
    public static final String ENTITY = "_Entity";
}
```

### UtilityClassWithoutPrivateConstructor
Class `GraphQLJavaScriptLanguageInjectionUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/com/intellij/lang/jsgraphql/javascript/injection/GraphQLJavaScriptLanguageInjectionUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class GraphQLJavaScriptLanguageInjectionUtil {
    private static final String GRAPHQL_EOL_COMMENT = "#graphql";
    // Min length for injection - `#graphql`
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
    }

    ;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `myProject` might be null
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
            } catch (IOException | GeneralSecurityException e) {
                LOG.warn(e);
                GraphQLNotificationUtil.showGraphQLRequestErrorNotification(myProject, url, e, NotificationType.WARNING, retry);
                return;
            }
```

### DataFlowIssue
Argument `myProject` might be null
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
                introspection = parseIntrospectionJson(responseJson);
                if (getErrorCount(introspection) > 0) {
                    GraphQLUIProjectService.getService(myProject).showQueryResult(responseJson);
                }
            } catch (JsonSyntaxException exception) {
```

### DataFlowIssue
Method invocation `getSelectionList` may produce `NullPointerException`
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewTreeElement.java`
#### Snippet
```java
            return;
        }
        for (GraphQLSelection selection : selectionSet.getSelectionList()) {
            final GraphQLField field = selection.getField();
            if (field != null) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
     */
    public static Stack<GraphQLType> unwrapType(GraphQLType type) {
        type = assertNotNull(type);
        Stack<GraphQLType> decoration = new Stack<>();
        while (true) {
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        if (abstractType instanceof GraphQLInterfaceType) {
            ImmutableList<String> objectNames = this.interfaceNameToObjectTypeNames.getOrDefault(abstractType.getName(), emptyList());
            return objectNames.contains(concreteType.getName());
        } else if (abstractType instanceof GraphQLUnionType) {
            return ((GraphQLUnionType) abstractType).isPossibleType(concreteType);
```

### DataFlowIssue
Method invocation `getSchemaDirectives` may produce `NullPointerException`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
            subscription = schema == null ? null : schema.isSupportingSubscriptions() ? schema.getSubscriptionType() : null;
            additionalTypes = schema == null ? null : schema.getAdditionalTypes();
            schemaDirectives = new LinkedHashSet<>(schema.getSchemaDirectives());
            directives = new LinkedHashSet<>(schema.getDirectives());
        }
```

### DataFlowIssue
Method invocation `size` will produce `NullPointerException`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java

        List<GraphQLArgument> fieldDefinitionArguments = fieldDefinition.getArguments();
        if (fieldDefinitionArguments != null || fieldDefinitionArguments.size() != 0) {
            for (GraphQLArgument fieldDefinitionArgument : fieldDefinitionArguments) {
                validateFieldDefinitionArgument(typeName, fieldDefinition.getName(), fieldDefinitionArgument, errorCollector);
```

### DataFlowIssue
Argument `conditionType` might be null
in `src/main/com/intellij/lang/jsgraphql/types/execution/FieldCollector.java`
#### Snippet
```java
        GraphQLType conditionType;
        conditionType = getTypeFromAST(parameters.getGraphQLSchema(), inlineFragment.getTypeCondition());
        return checkTypeCondition(parameters, conditionType);
    }

```

### DataFlowIssue
Argument `conditionType` might be null
in `src/main/com/intellij/lang/jsgraphql/types/execution/FieldCollector.java`
#### Snippet
```java
        GraphQLType conditionType;
        conditionType = getTypeFromAST(parameters.getGraphQLSchema(), fragmentDefinition.getTypeCondition());
        return checkTypeCondition(parameters, conditionType);
    }

```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
            boolean wasValueProvided = false;
            if (argumentMap.containsKey(argName)) {
                if (argument.getValue() instanceof VariableReference) {
                    wasValueProvided = variables.containsKey(((VariableReference) argument.getValue()).getName());
                } else {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
                        .map(caret -> new TextRange(caret.getSelectionStart(), caret.getSelectionEnd()))
                        .sorted(Comparator.comparingInt(TextRange::getStartOffset))
                        .collect(Collectors.toList());

                    for (int i = 0; i < editorLength; i++) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeDirectivesChecker.java`
#### Snippet
```java
                .stream().map(com.intellij.lang.jsgraphql.types.language.DirectiveLocation::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return names.contains(expectedLocation.name().toUpperCase());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        List<EnumTypeExtensionDefinition> enumExtensions = typeRegistry.enumTypeExtensions().getOrDefault(allowedTypeDefinition.getName(), emptyList());
        Stream<EnumValueDefinition> enumExtStream = enumExtensions.stream().flatMap(enumExt -> enumExt.getEnumValueDefinitions().stream());
        List<EnumValueDefinition> enumValueDefinitions = Stream.concat(allowedTypeDefinition.getEnumValueDefinitions().stream(), enumExtStream).collect(toList());

        boolean noneMatchAllowedEnumValue = enumValueDefinitions.stream()
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        List<InputObjectTypeExtensionDefinition> inputObjExt = typeRegistry.inputObjectTypeExtensions().getOrDefault(allowedTypeDefinition.getName(), emptyList());
        Stream<InputValueDefinition> inputObjExtValues = inputObjExt.stream().flatMap(inputObj -> inputObj.getInputValueDefinitions().stream());
        List<InputValueDefinition> inputValueDefinitions = Stream.concat(allowedTypeDefinition.getInputValueDefinitions().stream(), inputObjExtValues).collect(toList());

        // check for duplicated fields
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        List<ObjectField> unknownFields = fields.stream()
                .filter(field -> !nameToInputValueDefMap.containsKey(field.getName()))
                .collect(toList());

        if (!unknownFields.isEmpty()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/DiffEvent.java`
#### Snippet
```java

        public Builder components(Object... args) {
            components.addAll(Arrays.stream(args).map(String::valueOf).collect(toList()));
            return this;
        }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                    .stream()
                    .sorted(comparator)
                    .collect(toList());
                for (int i = 0; i < types.size(); i++) {
                    GraphQLNamedOutputType objectType = types.get(i);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                    .stream()
                    .sorted(comparator)
                    .collect(toList());
                if (values.size() > 0) {
                    out.format(" {\n");
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
            List<Type> inputValueTypes = arguments.stream()
                    .map(InputValueDefinition::getType)
                    .collect(toList());

            inputValueTypes.forEach(
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java

    private void checkFieldTypesPresent(TypeDefinitionRegistry typeRegistry, List<GraphQLError> errors, TypeDefinition typeDefinition, List<FieldDefinition> fields) {
        List<Type> fieldTypes = fields.stream().map(FieldDefinition::getType).collect(toList());
        fieldTypes.forEach(checkTypeExists("field", typeRegistry, errors, typeDefinition));

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
                        .collect(toList()))
                .flatMap(Collection::stream)
                .collect(toList());

        fieldInputValues.forEach(checkTypeExists("field input", typeRegistry, errors, typeDefinition));
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
    private void checkForMissingTypes(List<GraphQLError> errors, TypeDefinitionRegistry typeRegistry) {
        // type extensions
        List<ObjectTypeExtensionDefinition> typeExtensions = typeRegistry.objectTypeExtensions().values().stream().flatMap(Collection::stream).collect(toList());
        typeExtensions.forEach(typeExtension -> {

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeChecker.java`
#### Snippet
```java
            List<Type> inputValueTypes = inputValueDefinitions.stream()
                    .map(InputValueDefinition::getType)
                    .collect(toList());

            inputValueTypes.forEach(checkTypeExists("input value", typeRegistry, errors, inputType));
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ResultNodesCreator.java`
#### Snippet
```java
        return collection.stream()
                .filter(executionResultNode -> executionResultNode.getNonNullableFieldWasNullException() != null)
                .map(ExecutionResultNode::getNonNullableFieldWasNullException)
                .findFirst();
    }
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ExecutionResultNode.java`
#### Snippet
```java
        return children.stream()
                .filter(executionResultNode -> executionResultNode.getNonNullableFieldWasNullException() != null)
                .map(ExecutionResultNode::getNonNullableFieldWasNullException)
                .findFirst();
    }
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
        return collection.stream()
                .filter(executionResultNode -> executionResultNode.getNonNullableFieldWasNullException() != null)
                .map(ExecutionResultNode::getNonNullableFieldWasNullException)
                .findFirst();
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'GraphQLShort' is still used
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
     */
    @Deprecated
    public static final GraphQLScalarType GraphQLShort = GraphQLScalarType.newScalar()
            .name("Short").description("Built-in Short as Int").coercing(new GraphqlShortCoercing()).build();

```

### DeprecatedIsStillUsed
Deprecated member 'GraphQLBigInteger' is still used
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
     */
    @Deprecated
    public static final GraphQLScalarType GraphQLBigInteger = GraphQLScalarType.newScalar()
            .name("BigInteger").description("Built-in java.math.BigInteger").coercing(new GraphqlBigIntegerCoercing()).build();

```

### DeprecatedIsStillUsed
Deprecated member 'GraphQLBigDecimal' is still used
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
     */
    @Deprecated
    public static final GraphQLScalarType GraphQLBigDecimal = GraphQLScalarType.newScalar()
            .name("BigDecimal").description("Built-in java.math.BigDecimal").coercing(new GraphqlBigDecimalCoercing()).build();

```

### DeprecatedIsStillUsed
Deprecated member 'GraphQLByte' is still used
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
     */
    @Deprecated
    public static final GraphQLScalarType GraphQLByte = GraphQLScalarType.newScalar()
            .name("Byte").description("Built-in Byte as Int").coercing(new GraphqlByteCoercing()).build();

```

### DeprecatedIsStillUsed
Deprecated member 'BlockedFields' is still used
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/BlockedFields.java`
#### Snippet
```java
    @Internal
    @Deprecated
    public BlockedFields(List<Pattern> patterns) {
        this.patterns = patterns;
    }
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `visitElement()` overloads a compatible method of a superclass, when overriding might have been intended
in `gen/com/intellij/lang/jsgraphql/psi/GraphQLVisitorBase.java`
#### Snippet
```java
  }

  public void visitElement(@NotNull GraphQLElement o) {
    super.visitElement(o);
  }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/BatchedExecutionStrategy.java`
#### Snippet
```java
            return nextStep(executionContext, unresolvedNodes);
        })
                .thenApply(multiZipper -> multiZipper.toRootNode())
                .thenApply(RootExecutionResultNode.class::cast);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
        codeRegistry.systemDataFetcher(systemCoordinates(TypeMetaFieldDef.getName()), TypeMetaFieldDefDataFetcher);

        introspectionDataFetchers.forEach((coordinates, idf) -> codeRegistry.dataFetcher(coordinates, idf));
    }

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/com/intellij/lang/jsgraphql/types/relay/SimpleListConnection.java`
#### Snippet
```java

    private String createCursor(int offset) {
        byte[] bytes = (prefix + Integer.toString(offset)).getBytes(StandardCharsets.UTF_8);
        return getEncoder().encodeToString(bytes);
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlElementParentTree.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.valueOf(element) +
                " - parent : " +
                parent;
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeParentTree.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.valueOf(node) +
                " - parent : " +
                parent;
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'reportingEvent' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/diagnostic/GraphQLSentryErrorReporter.java`
#### Snippet
```java
                continue;
            }
            IdeaReportingEvent reportingEvent = (IdeaReportingEvent) event;
            SentryEvent sentryEvent = new SentryEvent(reportingEvent.getData().getThrowable());

```

### PatternVariableCanBeUsed
Variable 'validationError' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
            }

            final ValidationError validationError = (ValidationError) error;
            final ValidationErrorType validationErrorType = validationError.getValidationErrorType();
            if (validationErrorType == null) {
```

### PatternVariableCanBeUsed
Variable 'file' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
        if (!(psiElement instanceof GraphQLFile)) return;

        final GraphQLFile file = (GraphQLFile) psiElement;
        final Project project = psiElement.getProject();

```

### PatternVariableCanBeUsed
Variable 'definition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
                boolean showAsUsed = false;
                if (psiElement instanceof GraphQLFragmentDefinition) {
                    GraphQLFragmentDefinition definition = (GraphQLFragmentDefinition) psiElement;
                    if (definition.getOriginalElement() instanceof GraphQLFragmentDefinition) {
                        // use the original PSI to compare since a separate editor tab has its own version of the PSI
```

### PatternVariableCanBeUsed
Variable 'jsonProperty' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionJsonToSDLLineMarkerProvider.java`
#### Snippet
```java

        // top level property or inside data property
        final JsonProperty jsonProperty = (JsonProperty) element;
        final String propertyName = jsonProperty.getName();
        if (!"__schema".equals(propertyName) || !(jsonProperty.getValue() instanceof JsonObject)) {
```

### PatternVariableCanBeUsed
Variable 'description' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionResultToSchema.java`
#### Snippet
```java
        final Object rawDescription = descriptionAware.get("description");
        if (rawDescription instanceof String) {
            String description = (String) rawDescription;
            if (!description.trim().isEmpty()) {
                final boolean multiLine = description.contains("\n");
```

### PatternVariableCanBeUsed
Variable 'treeElement' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewModel.java`
#### Snippet
```java
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        if (element instanceof GraphQLStructureViewTreeElement) {
            GraphQLStructureViewTreeElement treeElement = (GraphQLStructureViewTreeElement) element;
            if (treeElement.childrenBase instanceof LeafPsiElement) {
                return true;
```

### PatternVariableCanBeUsed
Variable 'cacheKey' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyFetchingImpl.java`
#### Snippet
```java
            if (this == o) return true;
            if (!(o instanceof CacheKey)) return false;
            CacheKey cacheKey = (CacheKey) o;
            return Objects.equals(classLoader, cacheKey.classLoader) && Objects.equals(className, cacheKey.className) && Objects.equals(propertyName, cacheKey.propertyName);
        }
```

### PatternVariableCanBeUsed
Variable 'enumValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
            );
        }
        EnumValue enumValue = (EnumValue) input;
        GraphQLEnumValueDefinition enumValueDefinition = valueDefinitionMap.get(enumValue.getName());
        if (enumValueDefinition == null) {
```

### PatternVariableCanBeUsed
Variable 'objectType' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaUtil.java`
#### Snippet
```java
                continue;
            }
            GraphQLObjectType objectType = (GraphQLObjectType) type;
            if ((objectType).getInterfaces().contains(interfaceType)) {
                result.add(objectType);
```

### PatternVariableCanBeUsed
Variable 'typeRef' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                }
                if (currentSchemaElement instanceof GraphQLTypeReference) {
                    GraphQLTypeReference typeRef = (GraphQLTypeReference) currentSchemaElement;
                    typeReferences.put(typeRef.getName(), typeRef);
                }
```

### PatternVariableCanBeUsed
Variable 'originalNamedType' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                    nodeZipper = zippers.get(zippers.size() - 1);
                    if (context.originalThisNode() instanceof GraphQLNamedType && context.isChanged()) {
                        GraphQLNamedType originalNamedType = (GraphQLNamedType) context.originalThisNode();
                        GraphQLNamedType changedNamedType = (GraphQLNamedType) context.thisNode();
                        if (!originalNamedType.getName().equals(changedNamedType.getName())) {
```

### PatternVariableCanBeUsed
Variable 'enumValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        }

        EnumValue enumValue = ((EnumValue) instanceValue);

        List<EnumTypeExtensionDefinition> enumExtensions = typeRegistry.enumTypeExtensions().getOrDefault(allowedTypeDefinition.getName(), emptyList());
```

### PatternVariableCanBeUsed
Variable 'arrayValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        }

        ArrayValue arrayValue = ((ArrayValue) instanceValue);
        boolean isUnwrappedList = unwrappedAllowedType instanceof ListType;

```

### PatternVariableCanBeUsed
Variable 'objectValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ArgValueOfAllowedTypeChecker.java`
#### Snippet
```java
        }

        ObjectValue objectValue = ((ObjectValue) instanceValue);
        // duck typing validation, if it looks like the definition
        // then it must be the same type as the definition
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
        // extensions
        if (definition instanceof ObjectTypeExtensionDefinition) {
            ObjectTypeExtensionDefinition newEntry = (ObjectTypeExtensionDefinition) definition;
            defineExt(objectTypeExtensions, newEntry, ObjectTypeExtensionDefinition::getName);
        } else if (definition instanceof InterfaceTypeExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            defineExt(objectTypeExtensions, newEntry, ObjectTypeExtensionDefinition::getName);
        } else if (definition instanceof InterfaceTypeExtensionDefinition) {
            InterfaceTypeExtensionDefinition newEntry = (InterfaceTypeExtensionDefinition) definition;
            defineExt(interfaceTypeExtensions, newEntry, InterfaceTypeExtensionDefinition::getName);
        } else if (definition instanceof UnionTypeExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            defineExt(interfaceTypeExtensions, newEntry, InterfaceTypeExtensionDefinition::getName);
        } else if (definition instanceof UnionTypeExtensionDefinition) {
            UnionTypeExtensionDefinition newEntry = (UnionTypeExtensionDefinition) definition;
            defineExt(unionTypeExtensions, newEntry, UnionTypeExtensionDefinition::getName);
        } else if (definition instanceof EnumTypeExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            defineExt(unionTypeExtensions, newEntry, UnionTypeExtensionDefinition::getName);
        } else if (definition instanceof EnumTypeExtensionDefinition) {
            EnumTypeExtensionDefinition newEntry = (EnumTypeExtensionDefinition) definition;
            defineExt(enumTypeExtensions, newEntry, EnumTypeExtensionDefinition::getName);
        } else if (definition instanceof ScalarTypeExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            defineExt(enumTypeExtensions, newEntry, EnumTypeExtensionDefinition::getName);
        } else if (definition instanceof ScalarTypeExtensionDefinition) {
            ScalarTypeExtensionDefinition newEntry = (ScalarTypeExtensionDefinition) definition;
            defineExt(scalarTypeExtensions, newEntry, ScalarTypeExtensionDefinition::getName);
        } else if (definition instanceof InputObjectTypeExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            defineExt(scalarTypeExtensions, newEntry, ScalarTypeExtensionDefinition::getName);
        } else if (definition instanceof InputObjectTypeExtensionDefinition) {
            InputObjectTypeExtensionDefinition newEntry = (InputObjectTypeExtensionDefinition) definition;
            defineExt(inputObjectTypeExtensions, newEntry, InputObjectTypeExtensionDefinition::getName);
        } else if (definition instanceof SchemaExtensionDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            schemaExtensionDefinitions.add((SchemaExtensionDefinition) definition);
        } else if (definition instanceof ScalarTypeDefinition) {
            ScalarTypeDefinition newEntry = (ScalarTypeDefinition) definition;
            define(scalarTypes, scalarTypes, newEntry);
        } else if (definition instanceof TypeDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            define(scalarTypes, scalarTypes, newEntry);
        } else if (definition instanceof TypeDefinition) {
            TypeDefinition newEntry = (TypeDefinition) definition;
            define(types, types, newEntry);
        } else if (definition instanceof DirectiveDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newEntry' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            define(types, types, newEntry);
        } else if (definition instanceof DirectiveDefinition) {
            DirectiveDefinition newEntry = (DirectiveDefinition) definition;
            define(directiveDefinitions, directiveDefinitions, newEntry);
        } else if (definition instanceof SchemaDefinition) {
```

### PatternVariableCanBeUsed
Variable 'newSchema' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
            define(directiveDefinitions, directiveDefinitions, newEntry);
        } else if (definition instanceof SchemaDefinition) {
            SchemaDefinition newSchema = (SchemaDefinition) definition;
            if (schema != null) {
                myErrors.add(new SchemaRedefinitionError(this.schema, newSchema));
```

### PatternVariableCanBeUsed
Variable 'that' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/SchemaValidationError.java`
#### Snippet
```java
            return false;
        }
        SchemaValidationError that = (SchemaValidationError) other;
        return this.errorType.equals(that.errorType) && this.description.equals(that.description);
    }
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    private String getDescription(Object descriptionHolder) {
        if (descriptionHolder instanceof GraphQLObjectType) {
            GraphQLObjectType type = (GraphQLObjectType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(ObjectTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(ObjectTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLEnumType) {
            GraphQLEnumType type = (GraphQLEnumType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(EnumTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(EnumTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLFieldDefinition) {
            GraphQLFieldDefinition type = (GraphQLFieldDefinition) descriptionHolder;
            return description(type.getDescription(), ofNullable(type.getDefinition()).map(FieldDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLEnumValueDefinition) {
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
            return description(type.getDescription(), ofNullable(type.getDefinition()).map(FieldDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLEnumValueDefinition) {
            GraphQLEnumValueDefinition type = (GraphQLEnumValueDefinition) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(EnumValueDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(EnumValueDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLUnionType) {
            GraphQLUnionType type = (GraphQLUnionType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(UnionTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(UnionTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLInputObjectType) {
            GraphQLInputObjectType type = (GraphQLInputObjectType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(InputObjectTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(InputObjectTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLInputObjectField) {
            GraphQLInputObjectField type = (GraphQLInputObjectField) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(InputValueDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(InputValueDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLInterfaceType) {
            GraphQLInterfaceType type = (GraphQLInterfaceType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(InterfaceTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(InterfaceTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLScalarType) {
            GraphQLScalarType type = (GraphQLScalarType) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(ScalarTypeDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(ScalarTypeDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLArgument) {
            GraphQLArgument type = (GraphQLArgument) descriptionHolder;
            return description(type.getDescription(),
                ofNullable(type.getDefinition()).map(InputValueDefinition::getDescription).orElse(null));
```

### PatternVariableCanBeUsed
Variable 'type' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
                ofNullable(type.getDefinition()).map(InputValueDefinition::getDescription).orElse(null));
        } else if (descriptionHolder instanceof GraphQLDirective) {
            GraphQLDirective type = (GraphQLDirective) descriptionHolder;
            return description(type.getDescription(), null);
        } else {
```

### PatternVariableCanBeUsed
Variable 'namedType' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java

            if (node instanceof GraphQLNamedType) {
                GraphQLNamedType namedType = (GraphQLNamedType) node;
                // we encountered a node referencing one of the marked types, so it should not be removed.
                if (markedForRemovalTypes.contains(node)) {
```

### PatternVariableCanBeUsed
Variable 'fragmentSpread' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTraverser.java`
#### Snippet
```java
            return node.getChildren();
        }
        FragmentSpread fragmentSpread = (FragmentSpread) node;
        return singletonList(fragmentsByName.get(fragmentSpread.getName()));
    }
```

### PatternVariableCanBeUsed
Variable 'inputObjectType' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/analysis/NodeVisitorWithTypeTracking.java`
#### Snippet
```java
        // technically a scalar type can have an AST object field - eg field( arg : Json) -> field(arg : { ast : "here" })
        if (unmodifiedType instanceof GraphQLInputObjectType) {
            GraphQLInputObjectType inputObjectType = (GraphQLInputObjectType) unmodifiedType;
            GraphQLInputObjectField inputObjectTypeField = inputObjectType.getField(node.getName());

```

### PatternVariableCanBeUsed
Variable 'operationDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSignature.java`
#### Snippet
```java
                        .filter(d -> {
                            if (d instanceof OperationDefinition) {
                                OperationDefinition operationDefinition = (OperationDefinition) d;
                                return isThisOperation(operationDefinition, operationName);
                            }
```

### PatternVariableCanBeUsed
Variable 'describedNode' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
        for (Node node : nodes) {
            if (node instanceof AbstractDescribedNode) {
                AbstractDescribedNode<?> describedNode = (AbstractDescribedNode<?>) node;
                if (describedNode.getDescription() != null) {
                    return true;
```

### PatternVariableCanBeUsed
Variable 'inner' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
    private String type(Type type) {
        if (type instanceof NonNullType) {
            NonNullType inner = (NonNullType) type;
            return wrap("", type(inner.getType()), "!");
        } else if (type instanceof ListType) {
```

### PatternVariableCanBeUsed
Variable 'inner' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
            return wrap("", type(inner.getType()), "!");
        } else if (type instanceof ListType) {
            ListType inner = (ListType) type;
            return wrap("[", type(inner.getType()), "]");
        } else {
```

### PatternVariableCanBeUsed
Variable 'fragmentDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
        for (Definition definition : document.getDefinitions()) {
            if (definition instanceof FragmentDefinition) {
                FragmentDefinition fragmentDefinition = (FragmentDefinition) definition;
                fragmentsByName.put(fragmentDefinition.getName(), fragmentDefinition);
            }
```

### PatternVariableCanBeUsed
Variable 'operationDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
        for (Definition definition : document.getDefinitions()) {
            if (definition instanceof OperationDefinition) {
                OperationDefinition operationDefinition = (OperationDefinition) definition;
                operationsByName.put(operationDefinition.getName(), operationDefinition);
            }
```

### PatternVariableCanBeUsed
Variable 'fragmentDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
            }
            if (definition instanceof FragmentDefinition) {
                FragmentDefinition fragmentDefinition = (FragmentDefinition) definition;
                fragmentsByName.put(fragmentDefinition.getName(), fragmentDefinition);
            }
```

### PatternVariableCanBeUsed
Variable 'optional' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
    public static Object unboxValue(Object result) {
        if (result instanceof Optional) {
            Optional optional = (Optional) result;
            return optional.orElse(null);
        } else if (result instanceof OptionalInt) {
```

### PatternVariableCanBeUsed
Variable 'optional' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
            return optional.orElse(null);
        } else if (result instanceof OptionalInt) {
            OptionalInt optional = (OptionalInt) result;
            if (optional.isPresent()) {
                return optional.getAsInt();
```

### PatternVariableCanBeUsed
Variable 'optional' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
            }
        } else if (result instanceof OptionalDouble) {
            OptionalDouble optional = (OptionalDouble) result;
            if (optional.isPresent()) {
                return optional.getAsDouble();
```

### PatternVariableCanBeUsed
Variable 'optional' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
            }
        } else if (result instanceof OptionalLong) {
            OptionalLong optional = (OptionalLong) result;
            if (optional.isPresent()) {
                return optional.getAsLong();
```

### PatternVariableCanBeUsed
Variable 'abortException' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java
            }
        } else if (underlyingException instanceof AbortExecutionException) {
            AbortExecutionException abortException = (AbortExecutionException) underlyingException;
            executionResult = abortException.toExecutionResult();
            result.complete(executionResult);
```

### PatternVariableCanBeUsed
Variable 'fragmentDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/validation/ValidationContext.java`
#### Snippet
```java
        for (Definition definition : document.getDefinitions()) {
            if (!(definition instanceof FragmentDefinition)) continue;
            FragmentDefinition fragmentDefinition = (FragmentDefinition) definition;
            fragmentDefinitionMap.put(fragmentDefinition.getName(), fragmentDefinition);
        }
```

### PatternVariableCanBeUsed
Variable 'arrayValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
    private Object coerceValueAstForList(GraphqlFieldVisibility fieldVisibility, GraphQLList graphQLList, Value value, Map<String, Object> variables) {
        if (value instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) value;
            List<Object> result = new ArrayList<>();
            for (Value singleValue : arrayValue.getValues()) {
```

### PatternVariableCanBeUsed
Variable 'objectValue' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/validation/ValidationUtil.java`
#### Snippet
```java
        }
        GraphqlFieldVisibility fieldVisibility = schema.getCodeRegistry().getFieldVisibility();
        ObjectValue objectValue = (ObjectValue) value;
        Map<String, ObjectField> objectFieldMap = fieldMap(objectValue);

```

### PatternVariableCanBeUsed
Variable 'inputObjectType' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
        GraphQLInputType inputType = null;
        if (objectType instanceof GraphQLInputObjectType) {
            GraphQLInputObjectType inputObjectType = (GraphQLInputObjectType) objectType;
            GraphQLInputObjectField inputField = schema.getFieldVisibility().getFieldDefinition(inputObjectType, objectField.getName());
            if (inputField != null)
```

### PatternVariableCanBeUsed
Variable 'fragmentDefinition' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/NoFragmentCycles.java`
#### Snippet
```java
        for (Definition definition : definitions) {
            if (definition instanceof FragmentDefinition) {
                FragmentDefinition fragmentDefinition = (FragmentDefinition) definition;
                fragmentSpreads.put(fragmentDefinition.getName(), gatherSpreads(fragmentDefinition));
            }
```

### PatternVariableCanBeUsed
Variable 'fieldsContainer' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
        Boolean includeDeprecated = environment.getArgument("includeDeprecated");
        if (type instanceof GraphQLFieldsContainer) {
            GraphQLFieldsContainer fieldsContainer = (GraphQLFieldsContainer) type;
            List<GraphQLFieldDefinition> fieldDefinitions = environment
                    .getGraphQLSchema()
```

### PatternVariableCanBeUsed
Variable 'selectionSetOperation' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (definition instanceof GraphQLSelectionSetOperationDefinition) {
            operationDefinition.operation(OperationDefinition.Operation.QUERY);
            GraphQLSelectionSetOperationDefinition selectionSetOperation = (GraphQLSelectionSetOperationDefinition) definition;
            operationDefinition.selectionSet(createSelectionSet(selectionSetOperation.getSelectionSet()));
        } else if (definition instanceof GraphQLTypedOperationDefinition) {
```

### PatternVariableCanBeUsed
Variable 'typedOperation' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
            operationDefinition.selectionSet(createSelectionSet(selectionSetOperation.getSelectionSet()));
        } else if (definition instanceof GraphQLTypedOperationDefinition) {
            GraphQLTypedOperationDefinition typedOperation = (GraphQLTypedOperationDefinition) definition;
            operationDefinition.operation(parseOperation(typedOperation));
            operationDefinition.name(typedOperation.getName());
```

### PatternVariableCanBeUsed
Variable 'fieldsContainer' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
        GraphQLUnmodifiedType unwrappedParent = unwrapAll(parentType);
        if (unwrappedParent instanceof GraphQLFieldsContainer) {
            GraphQLFieldsContainer fieldsContainer = (GraphQLFieldsContainer) unwrappedParent;
            GraphQLFieldDefinition fieldDefinition = getVisibleFieldDefinition(fieldsContainer, field);
            fieldType = fieldDefinition != null ? fieldDefinition.getType() : null;
```

### PatternVariableCanBeUsed
Variable 'psi' can be replaced with pattern variable
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptBlockWrapper.java`
#### Snippet
```java
        if (myNode.getPsi() instanceof JSStringTemplateExpression && GraphQLJavaScriptLanguageInjectionUtil.isGraphQLLanguageInjectionTarget(myNode.getPsi())) {

            JSStringTemplateExpression psi = (JSStringTemplateExpression) myNode.getPsi();
            InjectedLanguageManager.getInstance(psi.getProject()).enumerate(psi, (injectedPsi, places) -> {
                // NO-OP here, but we need to enumerate for injection blocks to work in AbstractBlock#buildInjectedBlocks
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'itemPresentation' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/ide/documentation/GraphQLDocumentationPsiElement.java`
#### Snippet
```java
    private final PsiElement context;
    private String type;
    private JSGraphQLDocItemPresentation itemPresentation;

    public GraphQLDocumentationPsiElement(PsiElement context, String link) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'currentContext' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java

    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'currentContext' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java

    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;
        private List<DefaultTraverserContext> children;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'path' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldWasNullException.java`
#### Snippet
```java

    private final ExecutionStepInfo executionStepInfo;
    private final ResultPath path;


```

### NonSerializableFieldInSerializableClass
Non-serializable field 'executionStepInfo' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldWasNullException.java`
#### Snippet
```java
public class NonNullableFieldWasNullException extends RuntimeException {

    private final ExecutionStepInfo executionStepInfo;
    private final ResultPath path;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'persistedQueryId' in a Serializable class
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryNotFound.java`
#### Snippet
```java
@PublicApi
public class PersistedQueryNotFound extends RuntimeException implements ErrorClassification {
    private final Object persistedQueryId;

    public PersistedQueryNotFound(Object persistedQueryId) {
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
     * element itself
     *
     * @return a list of directives
     */
    public Map<String, GraphQLDirective> getSchemaDirectiveByName() {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java
        }

        protected Builder(SchemaDefinition existing) {
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaExtensionDefinition.java`
#### Snippet
```java
        private @Nullable List<? extends Node> sourceNodes;

        protected Builder() {
        }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
        }

        protected Builder(SchemaDefinition existing) {
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java


        protected Builder() {
        }

```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLMissingTypeFix.java`
#### Snippet
```java
        String code = typeKind.name().toLowerCase() + " " + typeName;
        String caret = "__caret__";
        switch (typeKind) {
            case ENUM:
            case TYPE:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java
    private boolean isValidDirectiveLocation(@NotNull GraphQLDirectivesAware directivesAware,
                                             @NotNull Introspection.DirectiveLocation directiveLocation) {
        switch (directiveLocation) {
            // Executable locations
            case QUERY:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionResultToSchema.java`
#### Snippet
```java

        String kind = (String) type.get("kind");
        switch (kind) {
            case "INTERFACE":
            case "OBJECT":
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionResultToSchema.java`
#### Snippet
```java
            () -> String.format("null object kind: %s", type));

        switch (kind) {
            case "INTERFACE":
                return createInterface(type);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/icons/GraphQLIconProvider.java`
#### Snippet
```java
    private Icon getOperationIcon(GraphQLTypedOperationDefinition typedOperationDefinition) {
        final GraphQLOperationType operationType = typedOperationDefinition.getOperationType();
        switch (operationType.getText()) {
            case "query":
                return GraphQLIcons.Schema.Query;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/util/EscapeUtil.java`
#### Snippet
```java
        for (int i = 0; i < len; i++) {
            char ch = stringValue.charAt(i);
            switch (ch) {
                case '"':
                    sb.append("\\\"");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
        String name = locationInParent.getName();
        List<T> childList = new ArrayList<>(childrenForParent.get(name));
        switch (modificationType) {
            case REPLACE:
                childList.set(ix, curNode);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
            String name = location.getName();
            List<T> childList = new ArrayList<>(childrenMap.get(name));
            switch (zipper.getModificationType()) {
                case REPLACE:
                    childList.set(ix, zipper.getCurNode());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
            char escaped = string.charAt(i + 1);
            i += 1;
            switch (escaped) {
                case '"':
                    writer.write('"');
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                String name = location.getName();
                List<T> childList = new ArrayList<>(childrenMap.get(name));
                switch (zipper.getModificationType()) {
                    case REPLACE:
                        childList.set(ix, zipper.getCurNode());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
            String name = location.getName();
            List<GraphQLSchemaElement> childList = new ArrayList<>(childrenMap.get(name));
            switch (zipper.getModificationType()) {
                case REPLACE:
                    childList.set(ix, zipper.getCurNode());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/SchemaValidationError.java`
#### Snippet
```java
    @Override
    public @Nullable Class<? extends GraphQLInspection> getInspectionClass() {
        switch (errorType) {
            case InvalidCustomizedNameError:
                return GraphQLIllegalNameInspection.class;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTraverser.java`
#### Snippet
```java

    private GraphQLObjectType getRootTypeFromOperation(OperationDefinition operationDefinition) {
        switch (operationDefinition.getOperation()) {
            case MUTATION:
                return assertNotNull(schema.getMutationType());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
    @NotNull
    private OperationDefinition.Operation parseOperation(@NotNull GraphQLTypedOperationDefinition operation) {
        switch (operation.getOperationType().getText()) {
            case "query":
                return OperationDefinition.Operation.QUERY;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
            return enumValueDefinition.getValue();
        }
        throw new CoercingParseValueException("Invalid input for Enum '" + name + "'. No value found for name '" + value.toString() + "'");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
        printComments(new PrintWriter(sw), directive, "");

        sb.append(sw.toString());

        sb.append("directive @").append(directive.getName());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/com/intellij/lang/jsgraphql/types/execution/ResultPath.java`
#### Snippet
```java
        }

        return parent.toString() + segmentToString();
    }

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
            }
            char escaped = string.charAt(i + 1);
            i += 1;
            switch (escaped) {
                case '"':
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
                    try {
                        int codepoint = Integer.parseInt(hexStr, 16);
                        i += 4;
                        writer.write(codepoint);
                    } catch (NumberFormatException e) {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TypeRefResolvingVisitor` may be 'static'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeResolvingVisitor.java`
#### Snippet
```java
    }

    private class TypeRefResolvingVisitor extends GraphQLTypeVisitorStub {
        protected final GraphQLType resolvedType;

```

### InnerClassMayBeStatic
Inner class `Hint` may be 'static'
in `src/main/com/intellij/lang/jsgraphql/types/cachecontrol/CacheControl.java`
#### Snippet
```java
    }

    private class Hint {
        private final List<Object> path;
        private final Integer maxAge;
```

## RuleId[id=RegExpDuplicateAlternationBranch]
### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
    private static String sanitizeIntrospectionJson(@NotNull String introspectionJson) {
        // Strip out emojis (e.g. the one in the GitHub schema) since they're outside the allowed range
        return introspectionJson.replaceAll("[\ud83c\udf00-\ud83d\ude4f]|[\ud83d\ude80-\ud83d\udeff]", "");
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GraphQLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableMapWithNullValues.java`
#### Snippet
```java
@SuppressWarnings({"NullableProblems", "unchecked", "rawtypes"})
@Internal
public final class ImmutableMapWithNullValues<K, V> implements Map<K, V> {

    private final Map<K, V> delegate;
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java

        if (result instanceof DataFetcherResult) {
            //noinspection unchecked
            DataFetcherResult<?> dataFetcherResult = (DataFetcherResult) result;
            dataFetcherResult.getErrors().forEach(executionContext::addError);
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
                    return; // end-of-queue: we're done.
                } else {
                    //noinspection StatementWithEmptyBody
                    while ((next = current.get()) == null) {
                        // Thread.onSpinWait(); in Java 9
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java

    @SuppressWarnings("deprecation") // because graphql spec still has the deprecated fields
    public static final GraphQLObjectType __Directive = newObject()
            .name("__Directive")
            .field(newFieldDefinition()
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
@SuppressWarnings("UnnecessaryLocalVariable")
@PublicApi
public class AstPrinter {
    private final Map<Class<? extends Node>, NodePrinter<? extends Node>> printers = new LinkedHashMap<>();

```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private <T extends Node> NodePrinter<T> _findPrinter(Node node) {
        return _findPrinter(node, null);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java

    @SuppressWarnings("ConstantConditions")
    private Optional<SchemaDefinition> getSchemaDef(Document document) {
        return document.getDefinitions().stream()
            .filter(d -> d instanceof SchemaDefinition)
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/KnownDirectives.java`
#### Snippet
```java

    @SuppressWarnings("deprecation") // the suppression stands because its deprecated but still in graphql spec
    private boolean hasInvalidLocation(GraphQLDirective directive, Node ancestor) {
        EnumSet<DirectiveLocation> validLocations = directive.validLocations();
        if (ancestor instanceof OperationDefinition) {
```

### RedundantSuppression
Redundant suppression
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java

    @SuppressWarnings("ConstantConditions")
    private Conflict findConflict(String responseName, FieldAndType fieldAndTypeA, FieldAndType fieldAndTypeB) {

        Field fieldA = fieldAndTypeA.field;
```

## RuleId[id=RedundantSemicolon]
### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemasPanel.kt`
#### Snippet
```java

        val actionsManager = CommonActionsManager.getInstance()
        val treeExpander = DefaultTreeExpander(tree);
        group.addSeparator()
        group.add(actionsManager.createExpandAllAction(treeExpander, tree));
```

### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemasPanel.kt`
#### Snippet
```java
        val treeExpander = DefaultTreeExpander(tree);
        group.addSeparator()
        group.add(actionsManager.createExpandAllAction(treeExpander, tree));
        group.add(actionsManager.createCollapseAllAction(treeExpander, tree));

```

### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemasPanel.kt`
#### Snippet
```java
        group.addSeparator()
        group.add(actionsManager.createExpandAllAction(treeExpander, tree));
        group.add(actionsManager.createCollapseAllAction(treeExpander, tree));

        val toolbar =
```

### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemaEndpointsListNode.kt`
#### Snippet
```java

        private fun showPopup(component: Component?, x: Int, y: Int) {
            val group = DefaultActionGroup();
            group.add(object : AnAction(
                GraphQLBundle.messagePointer("graphql.tool.window.action.introspect.endpoint"),
```

### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemaEndpointsListNode.kt`
#### Snippet
```java

            val popupMenu =
                ActionManager.getInstance().createActionPopupMenu(GraphQLToolWindow.GRAPHQL_TOOL_WINDOW_POPUP, group);
            popupMenu.component.show(component, x, y);
        }
```

### RedundantSemicolon
Redundant semicolon
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemaEndpointsListNode.kt`
#### Snippet
```java
            val popupMenu =
                ActionManager.getInstance().createActionPopupMenu(GraphQLToolWindow.GRAPHQL_TOOL_WINDOW_POPUP, group);
            popupMenu.component.show(component, x, y);
        }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldSchemaDef'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    private void checkOperation(DiffCtx ctx,
                                String opName,
                                Optional<SchemaDefinition> oldSchemaDef,
                                Optional<SchemaDefinition> newSchemaDef) {
        // if schema declaration is missing then it is assumed to contain Query / Mutation / Subscription
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'newSchemaDef'
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                String opName,
                                Optional<SchemaDefinition> oldSchemaDef,
                                Optional<SchemaDefinition> newSchemaDef) {
        // if schema declaration is missing then it is assumed to contain Query / Mutation / Subscription
        Optional<OperationTypeDefinition> oldOpTypeDef;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/reporting/PrintStreamReporter.java`
#### Snippet
```java

    public PrintStreamReporter() {
        this(System.out);
    }

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'enumValueDefinitionName.length() \>= 2' covered by subsequent condition 'enumValueDefinitionName.startsWith(...)'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
                                               Node definition,
                                               SchemaValidationErrorCollector errorCollector) {
        if (enumValueDefinitionName.length() >= 2 && enumValueDefinitionName.startsWith("__")) {
            SchemaValidationError schemaValidationError = new SchemaValidationError(
                SchemaValidationErrorType.InvalidCustomizedNameError,
```

### ConditionCoveredByFurtherCondition
Condition 'argumentName.length() \>= 2' covered by subsequent condition 'argumentName.startsWith(...)'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
                                    Node argument,
                                    SchemaValidationErrorCollector errorCollector) {
        if (argumentName.length() >= 2 && argumentName.startsWith("__")) {
            SchemaValidationError schemaValidationError = new SchemaValidationError(
                SchemaValidationErrorType.InvalidCustomizedNameError,
```

### ConditionCoveredByFurtherCondition
Condition 'typeName.length() \>= 2' covered by subsequent condition 'typeName.startsWith(...)'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
                                Node definition,
                                SchemaValidationErrorCollector validationErrorCollector) {
        if (typeName.length() >= 2 && typeName.startsWith("__")) {
            SchemaValidationError schemaValidationError = new SchemaValidationError(
                SchemaValidationErrorType.InvalidCustomizedNameError,
```

### ConditionCoveredByFurtherCondition
Condition 'fieldName.length() \>= 2' covered by subsequent condition 'fieldName.startsWith(...)'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
                                 Node inputObjectField,
                                 SchemaValidationErrorCollector errorCollector) {
        if (fieldName.length() >= 2 && fieldName.startsWith("__")) {
            SchemaValidationError schemaValidationError = new SchemaValidationError(
                SchemaValidationErrorType.InvalidCustomizedNameError,
```

## RuleId[id=RedundantNullableReturnType]
### RedundantNullableReturnType
'createCenterPanel' always returns non-null type
in `src/main/com/intellij/lang/jsgraphql/ide/actions/GraphQLOpenConfigAction.kt`
#### Snippet
```java
        }

        override fun createCenterPanel(): JComponent? {
            val panel = NonOpaquePanel()
            panel.add(comboBox, BorderLayout.NORTH)
```

### RedundantNullableReturnType
'getPreferredFocusedComponent' always returns non-null type
in `src/main/com/intellij/lang/jsgraphql/ide/actions/GraphQLOpenConfigAction.kt`
#### Snippet
```java
        }

        override fun getPreferredFocusedComponent(): JComponent? {
            return comboBox
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
    private static String sanitizeIntrospectionJson(@NotNull String introspectionJson) {
        // Strip out emojis (e.g. the one in the GitHub schema) since they're outside the allowed range
        return introspectionJson.replaceAll("[\ud83c\udf00-\ud83d\ude4f]|[\ud83d\ude80-\ud83d\udeff]", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
        int end = strText.length() - 3;
        String s = strText.substring(3, end);
        s = s.replaceAll(ESCAPED_TRIPLE_QUOTES, THREE_QUOTES);
        return removeIndentation(s);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/types/parser/StringValueParsing.java`
#### Snippet
```java
     */
    public static String removeIndentation(String rawValue) {
        String[] lines = rawValue.split("\\n");
        Integer commonIndent = null;
        for (int i = 0; i < lines.length; i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/types/language/AstValueHelper.java`
#### Snippet
```java

    private static Value<?> handleNumber(String stringValue) {
        if (stringValue.matches("^[0-9]+$")) {
            return IntValue.newIntValue().value(new BigInteger(stringValue)).build();
        } else {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/types/language/AstValueHelper.java`
#### Snippet
```java

            // ID types can use Int literals.
            if (type == Scalars.GraphQLID && stringValue.matches("^[0-9]+$")) {
                return IntValue.newIntValue().value(new BigInteger(stringValue)).build();
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
            return "";
        }
        maybeString = maybeString.replaceAll("\\n", "\n  ");
        return maybeString;
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
   * @param   in  the java.io.Reader to read input from.
   */
  public GraphQLLexer(java.io.Reader in) {
    this.zzReader = in;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  public GraphQLLexer() {
    this((java.io.Reader)null);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLValidationAnnotator.java`
#### Snippet
```java
        final PsiElement parent = element.getParent();
        final GraphQLTypeScopeProvider typeScopeProvider = PsiTreeUtil.getParentOfType(parent, GraphQLTypeScopeProvider.class);
        com.intellij.lang.jsgraphql.types.schema.GraphQLType typeScope = null;
        if (typeScopeProvider != null) {
            typeScope = typeScopeProvider.getTypeScope();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLValidationAnnotator.java`
#### Snippet
```java
    }

    private List<String> getFieldNameSuggestions(String fieldName, com.intellij.lang.jsgraphql.types.schema.GraphQLType typeScope) {
        List<String> fieldNames = null;
        if (typeScope instanceof GraphQLFieldsContainer) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldMixin.java`
#### Snippet
```java
                    parentType = GraphQLSchemaUtil.getUnmodifiedType(parentType); // unwrap list, non-null since we want a specific field
                    if (parentType instanceof GraphQLFieldsContainer) {
                        final com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition fieldDefinition = ((GraphQLFieldsContainer) parentType).getFieldDefinition(fieldName);
                        if (fieldDefinition != null) {
                            return fieldDefinition.getType();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorException.java`
#### Snippet
```java

/**
 * A base class for graphql runtime exceptions that also implement {@link com.intellij.lang.jsgraphql.types.GraphQLError} and can be used
 * in a general sense direct or have specialisations made of it.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/ExecutionInput.java`
#### Snippet
```java

        /**
         * You should create new {@link org.dataloader.DataLoaderRegistry}s and new {@link org.dataloader.DataLoader}s for each execution.  Do not
         * re-use
         * instances as this will create unexpected results.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java

        /**
         * This allows you to set a default {@link com.intellij.lang.jsgraphql.types.execution.DataFetcherExceptionHandler} that will be used to handle exceptions that happen
         * in {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} invocations.
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.instrumentation.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
        /**
         * For performance reasons you can opt into situation where the default instrumentations (such
         * as {@link com.intellij.lang.jsgraphql.types.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation} will not be
         * automatically added into the graphql instance.
         * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
/**
 * This class is where all graphql-java query execution begins.  It combines the objects that are needed
 * to make a successful graphql query, with the most important being the {@link com.intellij.lang.jsgraphql.types.schema.GraphQLSchema schema}
 * and the {@link com.intellij.lang.jsgraphql.types.execution.ExecutionStrategy execution strategy}
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
 * This class is where all graphql-java query execution begins.  It combines the objects that are needed
 * to make a successful graphql query, with the most important being the {@link com.intellij.lang.jsgraphql.types.schema.GraphQLSchema schema}
 * and the {@link com.intellij.lang.jsgraphql.types.execution.ExecutionStrategy execution strategy}
 * <p>
 * Building this object is very cheap and can be done on each execution if necessary.  Building the schema is often not
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
 * </li>
 *
 * <li>{@link com.intellij.lang.jsgraphql.types.execution.UnresolvedTypeException} - is thrown if a {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver} fails to provide a concrete
 * object type given a interface or union type.
 * </li>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
 *
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.validation.InvalidSchemaException} - is thrown if the schema is not valid when built via
 * {@link com.intellij.lang.jsgraphql.types.schema.GraphQLSchema.Builder#build()}
 * </li>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
 * </li>
 *
 * <li>{@link com.intellij.lang.jsgraphql.types.GraphQLException} - is thrown as a general purpose runtime exception, for example if the code cant
 * access a named field when examining a POJO.
 * </li>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.util` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserContext.java`
#### Snippet
```java

    /**
     * Obtains all visited nodes and values received by the {@link TraverserVisitor#enter(com.intellij.lang.jsgraphql.types.util.TraverserContext) }
     * method
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/Connection.java`
#### Snippet
```java

    /**
     * @return {@link com.intellij.lang.jsgraphql.types.relay.PageInfo} pagination data about about that list of edges
     */
    PageInfo getPageInfo();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/Connection.java`
#### Snippet
```java

    /**
     * @return a list of {@link com.intellij.lang.jsgraphql.types.relay.Edge}s that are really a node of data and its cursor
     */
    List<Edge<T>> getEdges();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/Connection.java`
#### Snippet
```java

/**
 * This represents a connection in Relay, which is a list of {@link com.intellij.lang.jsgraphql.types.relay.Edge edge}s
 * as well as a {@link com.intellij.lang.jsgraphql.types.relay.PageInfo pageInfo} that describes the pagination of that list.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/Connection.java`
#### Snippet
```java
/**
 * This represents a connection in Relay, which is a list of {@link com.intellij.lang.jsgraphql.types.relay.Edge edge}s
 * as well as a {@link com.intellij.lang.jsgraphql.types.relay.PageInfo pageInfo} that describes the pagination of that list.
 *
 * See <a href="https://facebook.github.io/relay/graphql/connections.htm">https://facebook.github.io/relay/graphql/connections.htm</a>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/DefaultConnection.java`
#### Snippet
```java

/**
 * A default implementation of {@link com.intellij.lang.jsgraphql.types.relay.Connection}
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/PageInfo.java`
#### Snippet
```java

/**
 * Represents pagination information in Relay about {@link com.intellij.lang.jsgraphql.types.relay.Edge edges} when used
 * inside a {@link com.intellij.lang.jsgraphql.types.relay.Connection connection}
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.relay` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/relay/PageInfo.java`
#### Snippet
```java
/**
 * Represents pagination information in Relay about {@link com.intellij.lang.jsgraphql.types.relay.Edge edges} when used
 * inside a {@link com.intellij.lang.jsgraphql.types.relay.Connection connection}
 *
 * See <a href="https://facebook.github.io/relay/graphql/connections.htm#sec-undefined.PageInfo">https://facebook.github.io/relay/graphql/connections.htm#sec-undefined.PageInfo</a>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * <p>
     * Note : You should not allow {@link RuntimeException}s to come out of your parseValue method, but rather
     * catch them and fire them as {@link com.intellij.lang.jsgraphql.types.schema.CoercingParseValueException} instead as per the method contract.
     *
     * @param input is never null
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * @return a parsed value which is never null
     *
     * @throws com.intellij.lang.jsgraphql.types.schema.CoercingParseValueException if value input can't be parsed
     */
    I parseValue(Object input) throws CoercingParseValueException;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * Called to convert a Java object result of a DataFetcher to a valid runtime value for the scalar type.
     * <p>
     * Note : Throw {@link com.intellij.lang.jsgraphql.types.schema.CoercingSerializeException} if there is fundamental
     * problem during serialisation, don't return null to indicate failure.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/FieldCoordinates.java`
#### Snippet
```java
/**
 * A field in graphql is uniquely located within a parent type and hence code elements
 * like {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} need to be specified using those coordinates.
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * <p>
     * Note : You should not allow {@link RuntimeException}s to come out of your serialize method, but rather
     * catch them and fire them as {@link com.intellij.lang.jsgraphql.types.schema.CoercingSerializeException} instead as per the method contract.
     *
     * @param dataFetcherResult is never null
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * @return a serialized value which may be null.
     *
     * @throws com.intellij.lang.jsgraphql.types.schema.CoercingSerializeException if value input can't be serialized
     */
    O serialize(Object dataFetcherResult) throws CoercingSerializeException;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * <p>
     * Note : You should not allow {@link RuntimeException}s to come out of your parseLiteral method, but rather
     * catch them and fire them as {@link com.intellij.lang.jsgraphql.types.schema.CoercingParseLiteralException} instead as per the method contract.
     * <p>
     * Many scalar types don't need to implement this method because they don't take AST {@link com.intellij.lang.jsgraphql.types.language.VariableReference}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * @return a parsed value which is never null
     *
     * @throws com.intellij.lang.jsgraphql.types.schema.CoercingParseLiteralException if input literal can't be parsed
     */
    @SuppressWarnings("unused")
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * <p>
     * Note : You should not allow {@link RuntimeException}s to come out of your parseLiteral method, but rather
     * catch them and fire them as {@link com.intellij.lang.jsgraphql.types.schema.CoercingParseLiteralException} instead as per the method contract.
     *
     * @param input is never null
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
     * @return a parsed value which is never null
     *
     * @throws com.intellij.lang.jsgraphql.types.schema.CoercingParseLiteralException if input literal can't be parsed
     */
    I parseLiteral(Object input) throws CoercingParseLiteralException;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java

/**
 * The Coercing interface is used by {@link com.intellij.lang.jsgraphql.types.schema.GraphQLScalarType}s to parse and serialise object values.
 * <p>
 * There are two major responsibilities, result coercion and input coercion.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLModifiedType.java`
#### Snippet
```java
 * A modified type wraps another graphql type and modifies it behavior
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLNonNull
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLList
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLModifiedType.java`
#### Snippet
```java
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLNonNull
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLList
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java

/**
 * This defines an argument that can be supplied to a graphql field (via {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}.
 * <p>
 * Fields can be thought of as "functions" that take arguments and return a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
 * See http://graphql.org/learn/queries/#arguments for more details on the concept.
 * <p>
 * {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} is used in two contexts, one context is graphql queries where it represents the arguments that can be
 * set on a field and the other is in Schema Definition Language (SDL) where it can be used to represent the argument value instances
 * that have been supplied on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLDirective}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
 * {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} is used in two contexts, one context is graphql queries where it represents the arguments that can be
 * set on a field and the other is in Schema Definition Language (SDL) where it can be used to represent the argument value instances
 * that have been supplied on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLDirective}.
 * <p>
 * The difference is the 'value' and 'defaultValue' properties.  In a query argument, the 'value' is never in the GraphQLArgument
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java

    /**
     * An argument has a default value when it represents the logical argument structure that a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * can have and it can also have a default value when used in a schema definition language (SDL) where the
     * default value comes via the directive definition.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java

    private static final java.util.Base64.Encoder encoder = java.util.Base64.getUrlEncoder().withoutPadding();
    private static final java.util.Base64.Decoder decoder = java.util.Base64.getUrlDecoder();

    public String toGlobalId(String type, String id) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java

    private static final java.util.Base64.Encoder encoder = java.util.Base64.getUrlEncoder().withoutPadding();
    private static final java.util.Base64.Decoder decoder = java.util.Base64.getUrlDecoder();

    public String toGlobalId(String type, String id) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
    }

    private static final java.util.Base64.Encoder encoder = java.util.Base64.getUrlEncoder().withoutPadding();
    private static final java.util.Base64.Decoder decoder = java.util.Base64.getUrlDecoder();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
    }

    private static final java.util.Base64.Encoder encoder = java.util.Base64.getUrlEncoder().withoutPadding();
    private static final java.util.Base64.Decoder decoder = java.util.Base64.getUrlDecoder();

```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcher.java`
#### Snippet
```java

    /**
     * This is called by the graphql engine to fetch the value.  The {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingEnvironment} is a composite
     * context object that tells you all you need to know about how to fetch a data value in graphql type terms.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyDataFetcher.java`
#### Snippet
```java
 * if you need highly customised behaviour.
 *
 * @see com.intellij.lang.jsgraphql.types.schema.DataFetcher
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumValueDefinition.java`
#### Snippet
```java
 * See http://graphql.org/learn/schema/#enumeration-types for more details
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLEnumType
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactory.java`
#### Snippet
```java

/**
 * A DataFetcherFactory allows a level of indirection in providing {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}s for graphql fields.
 *
 * For example if you are using an IoC container such as Spring or Guice, you can use this indirection to give you
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactory.java`
#### Snippet
```java

    /**
     * Returns a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
     *
     * @param environment the environment that needs the data fetcher
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputFieldsContainer.java`
#### Snippet
```java
 * Types that can contain input fields are marked with this interface
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputType
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/StaticDataFetcher.java`
#### Snippet
```java

/**
 * A {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} that always returns the same value
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactoryEnvironment.java`
#### Snippet
```java

/**
 * This is passed to a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} when it is invoked to
 * get a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactoryEnvironment.java`
#### Snippet
```java
/**
 * This is passed to a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} when it is invoked to
 * get a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactoryEnvironment.java`
#### Snippet
```java

    /**
     * @return the field that needs a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
     */
    public GraphQLFieldDefinition getFieldDefinition() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java

/**
 * Input objects defined via {@link com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectType} contains these input fields.
 *
 * There are similar to {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition} however they can ONLY be used on input objects, that
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java
 * Input objects defined via {@link com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectType} contains these input fields.
 *
 * There are similar to {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition} however they can ONLY be used on input objects, that
 * is to describe values that are fed into a graphql mutation.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.util` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeVisitor.java`
#### Snippet
```java

    /**
     * Called when a node is visited more than once within a context.  {@link com.intellij.lang.jsgraphql.types.util.TraverserContext#thisNode()} contains
     * the node
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputType.java`
#### Snippet
```java
/**
 * Input types represent those set of types that are allowed to be accepted as graphql mutation input, as opposed
 * to {@link com.intellij.lang.jsgraphql.types.schema.GraphQLOutputType}s which can only be used as graphql response output.
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirectiveContainer.java`
#### Snippet
```java

    /**
     * This will return a Map of the non repeatable directives that are associated with a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLNamedSchemaElement}.  Any repeatable directives
     * will be filtered out of this map.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirectiveContainer.java`
#### Snippet
```java

    /**
     * This will return a list of all the directives that have been put on {@link com.intellij.lang.jsgraphql.types.schema.GraphQLNamedSchemaElement} as a flat list, which may contain repeatable
     * and non repeatable directives.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirectiveContainer.java`
#### Snippet
```java

    /**
     * This will return a Map of the all directives that are associated with a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLNamedSchemaElement}, including both
     * repeatable and non repeatable directives.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirectiveContainer.java`
#### Snippet
```java

/**
 * Represents a graphql runtime type that can have {@link com.intellij.lang.jsgraphql.types.schema.GraphQLDirective}'s.
 * <p>
 * Directives can be repeatable and (by default) non repeatable.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/TypeResolver.java`
#### Snippet
```java

/**
 * This is called during type resolution to work out what concrete {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} should be used
 * dynamically during runtime for {@link GraphQLInterfaceType}s and {@link GraphQLUnionType}s
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java

/**
 * A utility class that helps work with {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType}s
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLOutputType.java`
#### Snippet
```java
/**
 * Output types represent those set of types that are allowed to be sent back as a graphql response, as opposed
 * to {@link com.intellij.lang.jsgraphql.types.schema.GraphQLInputType}s which can only be used as graphql mutation input.
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSet.java`
#### Snippet
```java

    /**
     * The result key of a selected field represents what the graphql return value will be.  The same {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * may lead to a field being asked for multiple times (with differing arguments) if field aliases are used.  This method
     * helps you get all possible field invocations grouped by their result key.  The arguments are guaranteed to be the same if
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSet.java`
#### Snippet
```java

    /**
     * The result key of a selected field represents what the graphql return value will be.  The same {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * may lead to a field being asked for multiple times (with differing arguments) if field aliases are used.  This method
     * helps you get all possible field invocations grouped by their result key.  The arguments are guaranteed to be the same if
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSet.java`
#### Snippet
```java
 * </pre>
 * <p>
 * In the example above the `selectionSet.getFields("name")` actually returns three {@link com.intellij.lang.jsgraphql.types.schema.SelectedField}s,
 * one for `Dog.name`, one for `Cat.name` and one for `Dog.name` with an alias of `aliasedName`.  The arguments can
 * differ on {@link com.intellij.lang.jsgraphql.types.schema.SelectedField}s that have different {@link SelectedField#getResultKey()}s, hence the multiple
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSet.java`
#### Snippet
```java
 * In the example above the `selectionSet.getFields("name")` actually returns three {@link com.intellij.lang.jsgraphql.types.schema.SelectedField}s,
 * one for `Dog.name`, one for `Cat.name` and one for `Dog.name` with an alias of `aliasedName`.  The arguments can
 * differ on {@link com.intellij.lang.jsgraphql.types.schema.SelectedField}s that have different {@link SelectedField#getResultKey()}s, hence the multiple
 * selected fields returned.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/SelectedField.java`
#### Snippet
```java

/**
 * A {@link com.intellij.lang.jsgraphql.types.schema.SelectedField} represents a field that occurred in a query selection set during
 * execution and they are returned from using the {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingFieldSelectionSet}
 * interface returned via {@link DataFetchingEnvironment#getSelectionSet()}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/SelectedField.java`
#### Snippet
```java
/**
 * A {@link com.intellij.lang.jsgraphql.types.schema.SelectedField} represents a field that occurred in a query selection set during
 * execution and they are returned from using the {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingFieldSelectionSet}
 * interface returned via {@link DataFetchingEnvironment#getSelectionSet()}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java

    /**
     * Returns a comparator that compares {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects by ascending name
     *
     * @return a comparator that compares {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects by ascending name
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java
     * Returns a comparator that compares {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects by ascending name
     *
     * @return a comparator that compares {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects by ascending name
     */
    public static Comparator<? super GraphQLSchemaElement> byNameAsc() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java

    /**
     * This sorts the list of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects (by name) and allocates a new sorted
     * list back.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java

    /**
     * Returns a comparator that laves {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects as they are
     *
     * @return a comparator that laves {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects as they are
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparators.java`
#### Snippet
```java
     * Returns a comparator that laves {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects as they are
     *
     * @return a comparator that laves {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType} objects as they are
     */
    public static Comparator<? super GraphQLSchemaElement> asIsOrder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputValueDefinition.java`
#### Snippet
```java
 *
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputType
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectField
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLArgument
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputValueDefinition.java`
#### Snippet
```java
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputType
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectField
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLArgument
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputValueDefinition.java`
#### Snippet
```java
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputType
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectField
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLArgument
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironmentImpl.java`
#### Snippet
```java

    /**
     * @return a new {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingEnvironmentImpl.Builder}
     */
    public static Builder newDataFetchingEnvironment() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DelegatingDataFetchingEnvironment.java`
#### Snippet
```java

/**
 * DelegatingDataFetchingEnvironment implements {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingEnvironment} by delegating
 * to an underlying instance.  You can use this class to wrap the environment and perhaps change
 * values and behavior more easily.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DelegatingDataFetchingEnvironment.java`
#### Snippet
```java

    /**
     * Called to wrap an existing {@link com.intellij.lang.jsgraphql.types.schema.DataFetchingEnvironment}.
     *
     * @param delegateEnvironment the environment to wrap and delegate all method called to
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldsContainer.java`
#### Snippet
```java
 * Types that can contain output fields are marked with this interface
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInterfaceType
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldsContainer.java`
#### Snippet
```java
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLInterfaceType
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java

    /**
     * This allows you to retrieve a named dataloader from the underlying {@link org.dataloader.DataLoaderRegistry}
     *
     * @param dataLoaderName the name of the data loader to fetch
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java
     * @param <V>            the value type
     * @return the named data loader or null
     * @see org.dataloader.DataLoaderRegistry#getDataLoader(String)
     */
    <K, V> DataLoader<K, V> getDataLoader(String dataLoaderName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java

    /**
     * @return the {@link org.dataloader.DataLoaderRegistry} in play
     */
    DataLoaderRegistry getDataLoaderRegistry();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.directives` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java
     * This gives you access to the directives related to this field
     *
     * @return the {@link com.intellij.lang.jsgraphql.types.execution.directives.QueryDirectives} for the currently executing field
     * @see com.intellij.lang.jsgraphql.types.execution.directives.QueryDirectives for more information
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.directives` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java
     *
     * @return the {@link com.intellij.lang.jsgraphql.types.execution.directives.QueryDirectives} for the currently executing field
     * @see com.intellij.lang.jsgraphql.types.execution.directives.QueryDirectives for more information
     */
    QueryDirectives getQueryDirectives();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java

    /**
     * This helps you transform the current {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} object into another one by starting a builder with all
     * the current values and allows you to transform it how you want.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.visibility` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java

    /**
     * @return the {@link com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility}
     */
    public GraphqlFieldVisibility getFieldVisibility() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java

/**
 * The {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} holds that execution code that is associated with graphql types, namely
 * the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}s associated with fields, the {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}s associated with
 * abstract types and the {@link com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
/**
 * The {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} holds that execution code that is associated with graphql types, namely
 * the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}s associated with fields, the {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}s associated with
 * abstract types and the {@link com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility}
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
/**
 * The {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} holds that execution code that is associated with graphql types, namely
 * the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}s associated with fields, the {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}s associated with
 * abstract types and the {@link com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility}
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.visibility` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
 * The {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} holds that execution code that is associated with graphql types, namely
 * the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}s associated with fields, the {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}s associated with
 * abstract types and the {@link com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility}
 * <p>
 * For legacy reasons these code functions can still exist on the original type objects but this will be removed in a future version.  Once
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
         *
         * @param unionType the union type
         * @return a non null {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}
         */
        public TypeResolver getTypeResolver(GraphQLUnionType unionType) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java

    /**
     * @return a new builder of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} objects
     */
    public static Builder newCodeRegistry() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
     *
     * @param interfaceType the interface type
     * @return a non null {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}
     */
    public TypeResolver getTypeResolver(GraphQLInterfaceType interfaceType) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
     *
     * @param unionType the union type
     * @return a non null {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}
     */

```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
        /**
         * This is the default data fetcher factory that will be used for fields that do not have specific data fetchers attached.  By default
         * {@link com.intellij.lang.jsgraphql.types.schema.PropertyDataFetcher} is used but you can have your own default via this method.
         *
         * @param defaultDataFetcherFactory the default data fetcher factory used
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
         *
         * @param interfaceType the interface type
         * @return a non null {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver}
         */
        public TypeResolver getTypeResolver(GraphQLInterfaceType interfaceType) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java

    /**
     * Returns a new builder of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} objects based on the existing one
     *
     * @param existingCodeRegistry the existing code registry to use
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLCodeRegistry.java`
#### Snippet
```java
     *
     * @param existingCodeRegistry the existing code registry to use
     * @return a new builder of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} objects
     */
    public static Builder newCodeRegistry(GraphQLCodeRegistry existingCodeRegistry) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
 * A union type is a polymorphic type that dynamically represents one of more concrete object types.
 * <p>
 * At runtime a {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver} is used to take an union object value and decide what {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType}
 * represents this union of types.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
 * A union type is a polymorphic type that dynamically represents one of more concrete object types.
 * <p>
 * At runtime a {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver} is used to take an union object value and decide what {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType}
 * represents this union of types.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
         * @return this builder
         *
         * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} instead
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
/**
 * Fields are the ways you get data values in graphql and a field definition represents a field, its type, the arguments it takes
 * and the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} used to get data values for that field.
 * <p>
 * Fields can be thought of as functions in graphql, they have a name, take defined arguments and return a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java

        /**
         * Sets the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} to use with this field.
         *
         * @param dataFetcher the data fetcher to use
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
         * @return this builder
         *
         * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} instead
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java

        /**
         * Sets the {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} to use with this field.
         *
         * @param dataFetcherFactory the data fetcher factory
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
         * @return this builder
         *
         * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} instead
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaUtil.java`
#### Snippet
```java
     * @return List of object types implementing provided interface
     *
     * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLSchema#getImplementations(GraphQLInterfaceType)} instead
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java

/**
 * A helper for {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory}
 */
@PublicApi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java
     * values that might be {@link  CompletionStage} returned values as well as plain old objects.
     *
     * @param delegateDataFetcher the original data fetcher that is present on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition} say
     * @param mapFunction         the bi function to apply to the original value
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java

    /**
     * Creates a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} that always returns the provided {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
     *
     * @param dataFetcher the data fetcher to always return
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetcherFactories.java`
#### Snippet
```java

    /**
     * Creates a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} that always returns the provided {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
     *
     * @param dataFetcher the data fetcher to always return
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
         * @return this builder
         *
         * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry.Builder#fieldVisibility(com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility)} instead
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.visibility` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
         * @return this builder
         *
         * @deprecated use {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry.Builder#fieldVisibility(com.intellij.lang.jsgraphql.types.schema.visibility.GraphqlFieldVisibility)} instead
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java

    /**
     * This will return the list of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} types that implement the given
     * interface type.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java

    /**
     * Called to return a named {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} from the schema
     *
     * @param typeName the name of the type
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
     * @return a graphql object type or null if there is one
     *
     * @throws com.intellij.lang.jsgraphql.types.GraphQLException if the type is NOT a object type
     */
    public GraphQLObjectType getObjectType(String typeName) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
    /**
     * This returns the named directive that have been explicitly put on the
     * schema object.  Note that {@link com.intellij.lang.jsgraphql.types.schema.GraphQLDirectiveContainer#getDirective(String)} will return
     * directives for all schema elements, whereas this is just for the schema
     * element itself
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
 * implement that interface.
 * <p>
 * At runtime a {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver} is used to take an interface object value and decide what {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType}
 * represents this interface type.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
 * implement that interface.
 * <p>
 * At runtime a {@link com.intellij.lang.jsgraphql.types.schema.TypeResolver} is used to take an interface object value and decide what {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType}
 * represents this interface type.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java

        /**
         * You can specify your own sort order of graphql types via {@link com.intellij.lang.jsgraphql.types.schema.GraphqlTypeComparatorRegistry}
         * which will tell you what type of objects you are to sort when
         * it asks for a comparator.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java

        /**
         * This allows you to seed in your own {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} instance
         *
         * @param codeRegistry the code registry to use
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java

        /**
         * This allows you to seed in your own {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry} instance
         *
         * @param codeRegistry the code registry to use
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
         * <p>
         * To be called back for every directive the use {@link #directiveWiring(SchemaDirectiveWiring)} or
         * use {@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)}
         * instead.
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
         *
         * @see #directiveWiring(SchemaDirectiveWiring)
         * @see com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring
         * @see com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
 * <p>
 * It can enhance the graphql runtime element and add new behaviour for example by changing
 * the fields {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher}
 * <p>
 * The SchemaDirectiveWiring objects are called in a specific order based on registration:
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
 * The SchemaDirectiveWiring objects are called in a specific order based on registration:
 * <ol>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directive(String, SchemaDirectiveWiring)} which work against a specific named directive are called first</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directiveWiring(SchemaDirectiveWiring)} which work against all directives are called next</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)} which work against all directives are called last</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
 * <ol>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directive(String, SchemaDirectiveWiring)} which work against a specific named directive are called first</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directiveWiring(SchemaDirectiveWiring)} which work against all directives are called next</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)} which work against all directives are called last</li>
 * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiring.java`
#### Snippet
```java
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directive(String, SchemaDirectiveWiring)} which work against a specific named directive are called first</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directiveWiring(SchemaDirectiveWiring)} which work against all directives are called next</li>
 * <li>{@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)} which work against all directives are called last</li>
 * </ol>
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
         * @see #directiveWiring(SchemaDirectiveWiring)
         * @see com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring
         * @see com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)
         */
        public Builder directive(String directiveName, SchemaDirectiveWiring schemaDirectiveWiring) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
         *
         * @see #directive(String, SchemaDirectiveWiring)
         * @see com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring
         * @see com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
         * @see #directive(String, SchemaDirectiveWiring)
         * @see com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring
         * @see com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)
         */
        public Builder directiveWiring(SchemaDirectiveWiring schemaDirectiveWiring) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeUtil.java`
#### Snippet
```java

/**
 * This class consists of {@code static} utility methods for operating on {@link com.intellij.lang.jsgraphql.types.language.Type}.
 */
public class TypeUtil {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java

    /**
     * Returns a {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring} given the environment
     *
     * @param environment the calling environment
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java
     * @param environment the calling environment
     *
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring}
     */
    default SchemaDirectiveWiring getSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment environment) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java

    /**
     * Returns a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} given the type definition
     *
     * @param environment the wiring environment
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java
     * @param <T>         the type of the data fetcher
     *
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory}
     */
    default <T> DataFetcherFactory<T> getDataFetcherFactory(FieldWiringEnvironment environment) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java

    /**
     * This is called to ask if this factory can provide a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcherFactory} for the definition
     *
     * @param environment the wiring environment
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
/**
 * A support class to help break up the large SchemaTypeChecker class. This handles
 * the checking of {@link com.intellij.lang.jsgraphql.types.language.ImplementingTypeDefinition}s.
 */
@Internal
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorDirectiveHelper.java`
#### Snippet
```java

/**
 * This contains the helper code that allows {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring} implementations
 * to be invoked during schema generation.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java

    /**
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldsContainer} when the element is contained with a fields container
     */
    GraphQLFieldsContainer getFieldsContainer();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
     * This is useful as a shortcut to get the current fields existing data fetcher
     *
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} when the element is as field or is contained within one
     *
     * @throws com.intellij.lang.jsgraphql.types.AssertException if there is not field in context at the time of the directive wiring callback
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java

    /**
     * This returns the directive that the {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring} was registered
     * against during calls to {@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directive(String, SchemaDirectiveWiring)}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
    /**
     * This returns the directive that the {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring} was registered
     * against during calls to {@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directive(String, SchemaDirectiveWiring)}
     * <p>
     * If this method of registration is not used (say because
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
     * <p>
     * If this method of registration is not used (say because
     * {@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)} or
     * {@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directiveWiring(SchemaDirectiveWiring)} was used)
     * then this will return null.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
     * If this method of registration is not used (say because
     * {@link com.intellij.lang.jsgraphql.types.schema.idl.WiringFactory#providesSchemaDirectiveWiring(SchemaDirectiveWiringEnvironment)} or
     * {@link com.intellij.lang.jsgraphql.types.schema.idl.RuntimeWiring.Builder#directiveWiring(SchemaDirectiveWiring)} was used)
     * then this will return null.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.idl` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java

/**
 * {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaDirectiveWiring} is passed this object as parameters
 * when it builds out behaviour
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java

    /**
     * This is a shortcut method to set a new data fetcher in the underlying {@link com.intellij.lang.jsgraphql.types.schema.GraphQLCodeRegistry}
     * against the current field.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java

    /**
     * The type hierarchy depends on the element in question.  For example {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} elements
     * have no parent, however a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * which in turn might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} say
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
    /**
     * The type hierarchy depends on the element in question.  For example {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} elements
     * have no parent, however a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * which in turn might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} say
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
    /**
     * The type hierarchy depends on the element in question.  For example {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} elements
     * have no parent, however a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * which in turn might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} say
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaDirectiveWiringEnvironment.java`
#### Snippet
```java
     * The type hierarchy depends on the element in question.  For example {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} elements
     * have no parent, however a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}
     * which in turn might be on a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType} say
     *
     * @return hierarchical graphql type information
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
 * <p>
 * Those fields can themselves by object types and so on until you reach the leaf nodes of the type tree represented
 * by {@link com.intellij.lang.jsgraphql.types.schema.GraphQLScalarType}s.
 * <p>
 * See http://graphql.org/learn/schema/#object-types-and-fields for more details on the concept.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java

        /**
         * This flag controls whether schema printer will use the {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType}'s original Ast {@link com.intellij.lang.jsgraphql.types.language.TypeDefinition}s when printing the type.  This
         * allows access to any `extend type` declarations that might have been originally made.
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java

        /**
         * This flag controls whether schema printer will use the {@link com.intellij.lang.jsgraphql.types.schema.GraphQLType}'s original Ast {@link com.intellij.lang.jsgraphql.types.language.TypeDefinition}s when printing the type.  This
         * allows access to any `extend type` declarations that might have been originally made.
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
     * If you want to turn a Introspection query result into a Document (and then into a printed
     * schema) then use {@link GraphQLIntrospectionResultToSchema#createSchemaDefinition(Map)}
     * first to get the {@link com.intellij.lang.jsgraphql.types.language.Document} and then print that.
     *
     * @param schemaIDL the parsed schema IDL
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/GraphqlFieldVisibility.java`
#### Snippet
```java
     * @param fieldName       the name of the desired field
     *
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition} or null if its not visible
     */
    GraphQLFieldDefinition getFieldDefinition(GraphQLFieldsContainer fieldsContainer, String fieldName);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/GraphqlFieldVisibility.java`
#### Snippet
```java
     * @param fieldsContainer the type in play
     *
     * @return a non null list of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLFieldDefinition}s
     */
    List<GraphQLFieldDefinition> getFieldDefinitions(GraphQLFieldsContainer fieldsContainer);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/GraphqlFieldVisibility.java`
#### Snippet
```java
     * @param fieldName       the name of the desired field
     *
     * @return a {@link com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectField} or null if its not visible
     */
    default GraphQLInputObjectField getFieldDefinition(GraphQLInputFieldsContainer fieldsContainer, String fieldName) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/GraphqlFieldVisibility.java`
#### Snippet
```java
     * @param fieldsContainer the type in play
     *
     * @return a non null list of {@link com.intellij.lang.jsgraphql.types.schema.GraphQLInputObjectField}s
     */
    default List<GraphQLInputObjectField> getFieldDefinitions(GraphQLInputFieldsContainer fieldsContainer) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema.diff.reporting` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
 * The SchemaDiff is called with a {@link DiffSet} and will report the
 * differences in the graphql schema APIs by raising events to a
 * {@link com.intellij.lang.jsgraphql.types.schema.diff.reporting.DifferenceReporter}
 */
@SuppressWarnings("ConstantConditions")
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeParentTree.java`
#### Snippet
```java

    /**
     * @return a path of names for nodes thar are {@link com.intellij.lang.jsgraphql.types.language.NamedNode}s
     */
    public List<String> getPath() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectivesContainer.java`
#### Snippet
```java
 * There are access methods here that get the two different types.
 *
 * @see com.intellij.lang.jsgraphql.types.language.DirectiveDefinition
 * @see DirectiveDefinition#isRepeatable()
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectivesContainer.java`
#### Snippet
```java

    /**
     * This will return a Map of the all directives that are associated with a {@link com.intellij.lang.jsgraphql.types.language.Node}, including both repeatable and non repeatable directives.
     *
     * @return a map of all directives by directive name
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectivesContainer.java`
#### Snippet
```java

    /**
     * This will return a list of all the directives that have been put on {@link com.intellij.lang.jsgraphql.types.language.Node} as a flat list, which may contain repeatable
     * and non repeatable directives.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java
     *
     * @param nodeToBeSorted the node to be sorted
     * @param <T>            of type {@link com.intellij.lang.jsgraphql.types.language.Node}
     *
     * @return a new sorted node (because {@link com.intellij.lang.jsgraphql.types.language.Node}s are immutable)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java
     * @param <T>            of type {@link com.intellij.lang.jsgraphql.types.language.Node}
     *
     * @return a new sorted node (because {@link com.intellij.lang.jsgraphql.types.language.Node}s are immutable)
     */
    public <T extends Node> T sort(T nodeToBeSorted) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherExceptionHandler.java`
#### Snippet
```java

/**
 * This is called when an exception is thrown during {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher#get(DataFetchingEnvironment)} execution
 */
@PublicSpi
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.schema` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStepInfo.java`
#### Snippet
```java
     * This allows you to morph a type into a more specialized form yet return the same
     * parent and non-null ness, for example taking a {@link GraphQLInterfaceType}
     * and turning it into a specific {@link com.intellij.lang.jsgraphql.types.schema.GraphQLObjectType}
     * after type resolution has occurred
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionContextBuilder.java`
#### Snippet
```java

    /**
     * @return a new builder of {@link com.intellij.lang.jsgraphql.types.execution.ExecutionContext}s
     */
    public static ExecutionContextBuilder newExecutionContextBuilder() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionContextBuilder.java`
#### Snippet
```java
     * @param other the previous execution to clone
     *
     * @return a new builder of {@link com.intellij.lang.jsgraphql.types.execution.ExecutionContext}s
     */
    public static ExecutionContextBuilder newExecutionContextBuilder(ExecutionContext other) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
 * <p>Deprecation Notice : This execution strategy does not support all of the graphql-java capabilities
 * such as data loader.  Since its so easy to create a data fetcher that uses
 * {@link CompletableFuture#supplyAsync(java.util.function.Supplier, java.util.concurrent.Executor)}
 * to make field fetching happen off thread we recommend that you use that instead of this class.  This class
 * will be removed in a future version.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
 * MUST have the following 2 characteristics:
 * <ul>
 * <li>1. The underlying {@link java.util.concurrent.ThreadPoolExecutor} MUST have a reasonable {@code maximumPoolSize}
 * <li>2. The underlying {@link java.util.concurrent.ThreadPoolExecutor} SHALL NOT use its task queue.
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
 * <ul>
 * <li>1. The underlying {@link java.util.concurrent.ThreadPoolExecutor} MUST have a reasonable {@code maximumPoolSize}
 * <li>2. The underlying {@link java.util.concurrent.ThreadPoolExecutor} SHALL NOT use its task queue.
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
 * See {@code graphql.execution.ExecutorServiceExecutionStrategyTest} for example usage.
 *
 * @deprecated Use {@link graphql.execution.AsyncExecutionStrategy} and {@link CompletableFuture#supplyAsync(java.util.function.Supplier, java.util.concurrent.Executor)}
 * in your data fetchers instead.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldWasNullError.java`
#### Snippet
```java
 * This is the base error that indicates that a non null field value was in fact null.
 *
 * @see com.intellij.lang.jsgraphql.types.execution.NonNullableFieldWasNullException for details
 */
@Internal
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java
    /**
     * Called to fetch a value for a field and its extra runtime info and resolve it further in terms of the graphql query.  This will call
     * #fetchField followed by #completeField and the completed {@link com.intellij.lang.jsgraphql.types.execution.FieldValueInfo} is returned.
     * <p>
     * An execution strategy can iterate the fields to be executed and call this method for each one
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.language` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/directives/QueryDirectives.java`
#### Snippet
```java

    /**
     * This will return a map of the {@link com.intellij.lang.jsgraphql.types.language.Field}s inside a {@link com.intellij.lang.jsgraphql.types.execution.MergedField}
     * and the immediate directives that are on each specific field
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.instrumentation` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/SimpleInstrumentation.java`
#### Snippet
```java

/**
 * An implementation of {@link com.intellij.lang.jsgraphql.types.execution.instrumentation.Instrumentation} that does nothing.  It can be used
 * as a base for derived classes where you only implement the methods you want to
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.instrumentation` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/SimpleInstrumentation.java`
#### Snippet
```java

    /**
     * A singleton instance of a {@link com.intellij.lang.jsgraphql.types.execution.instrumentation.Instrumentation} that does nothing
     */
    public static final SimpleInstrumentation INSTANCE = new SimpleInstrumentation();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.instrumentation.nextgen` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/nextgen/InstrumentationCreateStateParameters.java`
#### Snippet
```java

/**
 * Parameters sent to {@link com.intellij.lang.jsgraphql.types.execution.instrumentation.nextgen.Instrumentation} methods
 */
@Internal
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.lang.jsgraphql.types.execution.instrumentation.nextgen` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/nextgen/InstrumentationExecutionParameters.java`
#### Snippet
```java

/**
 * Parameters sent to {@link com.intellij.lang.jsgraphql.types.execution.instrumentation.nextgen.Instrumentation} methods
 */
@Internal
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
/**
 * This graphql {@link graphql.execution.instrumentation.Instrumentation} will dispatch
 * all the contained {@link org.dataloader.DataLoader}s when each level of the graphql
 * query is executed.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
 * query is executed.
 * <p>
 * This allows you to use {@link org.dataloader.DataLoader}s in your {@link graphql.schema.DataFetcher}s
 * to optimal loading of data.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
 * instrumentation list if one is not present.
 *
 * @see org.dataloader.DataLoader
 * @see org.dataloader.DataLoaderRegistry
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dataloader` is unnecessary and can be removed
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
 *
 * @see org.dataloader.DataLoader
 * @see org.dataloader.DataLoaderRegistry
 */
@PublicApi
```

## RuleId[id=DialogTitleCapitalization]
### DialogTitleCapitalization
String 'Apollo Kotlin' is not properly capitalized. It should have sentence capitalization
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLSettingsConfigurable.kt`
#### Snippet
```java
                }
                row {
                    checkBox(message("graphql.library.apollokotlin"))
                        .bindSelected(settings::isApolloKotlinSupportEnabled, settings::setApolloKotlinSupportEnabled)
                        .updateLibraries()
```

### DialogTitleCapitalization
String '[Enable Relay Modern](enable) GraphQL tooling' is not properly capitalized. It should have sentence capitalization
in `src/main/com/intellij/lang/jsgraphql/frameworks/relay/GraphQLRelayModernEnableStartupActivity.java`
#### Snippet
```java
                                    GraphQLNotificationUtil.GRAPHQL_NOTIFICATION_GROUP_ID,
                                    "Relay Modern project detected",
                                    "<a href=\"enable\">Enable Relay Modern</a> GraphQL tooling",
                                    NotificationType.INFORMATION,
                                    (notification, event) -> {
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `src/main/com/intellij/lang/jsgraphql/types/validation/LanguageTraversal.java`
#### Snippet
```java

    public LanguageTraversal(List<Node> basePath) {
        if (basePath != null) {
            path = basePath;
        } else {
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.intellij.lang.jsgraphql.psi.GraphQLDirective;`
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLDirectivesAware.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import com.intellij.lang.jsgraphql.psi.GraphQLDirective;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
```

### SamePackageImport
Unnecessary import from the same package `import com.intellij.lang.jsgraphql.psi.GraphQLDescription;`
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLDescriptionAware.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.psi;

import com.intellij.lang.jsgraphql.psi.GraphQLDescription;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
```

### SamePackageImport
Unnecessary import from the same package `import com.intellij.lang.jsgraphql.types.GraphQLError;`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorException.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.types;

import com.intellij.lang.jsgraphql.types.GraphQLError;
import com.intellij.lang.jsgraphql.types.language.SourceLocation;

```

### SamePackageImport
Unnecessary import from the same package `import com.intellij.lang.jsgraphql.types.GraphQLError;`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java
package com.intellij.lang.jsgraphql.types;

import com.intellij.lang.jsgraphql.types.GraphQLError;
import com.intellij.lang.jsgraphql.types.execution.DataFetcherResult;
import com.intellij.lang.jsgraphql.types.execution.ResultPath;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `GraphQLValueImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLValueImpl.java`
#### Snippet
```java
public abstract class GraphQLValueImpl extends GraphQLElementImpl implements GraphQLValue {

  public GraphQLValueImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLOperationDefinitionImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLOperationDefinitionImpl.java`
#### Snippet
```java
public abstract class GraphQLOperationDefinitionImpl extends GraphQLNamedElementImpl implements GraphQLOperationDefinition {

  public GraphQLOperationDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypeExtensionImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeExtensionImpl.java`
#### Snippet
```java
public abstract class GraphQLTypeExtensionImpl extends GraphQLTypeSystemDefinitionImpl implements GraphQLTypeExtension {

  public GraphQLTypeExtensionImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypeImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeImpl.java`
#### Snippet
```java
public abstract class GraphQLTypeImpl extends GraphQLElementImpl implements GraphQLType {

  public GraphQLTypeImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypeDefinitionImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeDefinitionImpl.java`
#### Snippet
```java
public abstract class GraphQLTypeDefinitionImpl extends GraphQLTypeSystemDefinitionImpl implements GraphQLTypeDefinition {

  public GraphQLTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypeSystemDefinitionImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeSystemDefinitionImpl.java`
#### Snippet
```java
public abstract class GraphQLTypeSystemDefinitionImpl extends GraphQLDefinitionImpl implements GraphQLTypeSystemDefinition {

  public GraphQLTypeSystemDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLStringLiteralImpl()` of an abstract class should not be declared 'public'
in `gen/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralImpl.java`
#### Snippet
```java
public abstract class GraphQLStringLiteralImpl extends GraphQLStringLiteralMixin implements GraphQLStringLiteral {

  public GraphQLStringLiteralImpl(ASTNode node) {
    super(node);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLVariableMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLVariableMixin.java`
#### Snippet
```java

public abstract class GraphQLVariableMixin extends GraphQLElementImpl implements GraphQLElement, PsiNamedElement {
    public GraphQLVariableMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLInlineFragmentMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLInlineFragmentMixin.java`
#### Snippet
```java

public abstract class GraphQLInlineFragmentMixin extends GraphQLElementImpl implements GraphQLInlineFragment, GraphQLTypeScopeProvider {
    public GraphQLInlineFragmentMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLFragmentDefinitionMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentDefinitionMixin.java`
#### Snippet
```java

public abstract class GraphQLFragmentDefinitionMixin extends GraphQLNamedElementImpl implements GraphQLFragmentDefinition, GraphQLTypeScopeProvider {
    public GraphQLFragmentDefinitionMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypedOperationDefinitionMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypedOperationDefinitionMixin.java`
#### Snippet
```java

public abstract class GraphQLTypedOperationDefinitionMixin extends GraphQLNamedElementImpl implements GraphQLTypedOperationDefinition, GraphQLTypeScopeProvider {
    public GraphQLTypedOperationDefinitionMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLNamedElementImpl()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLNamedElementImpl.java`
#### Snippet
```java

public abstract class GraphQLNamedElementImpl extends GraphQLElementImpl implements GraphQLNamedElement {
    public GraphQLNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLObjectFieldMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldMixin.java`
#### Snippet
```java

public abstract class GraphQLObjectFieldMixin extends GraphQLNamedElementImpl implements GraphQLObjectField, GraphQLTypeScopeProvider {
    public GraphQLObjectFieldMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLFieldMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldMixin.java`
#### Snippet
```java

public abstract class GraphQLFieldMixin extends GraphQLNamedElementImpl implements GraphQLField, GraphQLTypeScopeProvider {
    public GraphQLFieldMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLStringLiteralMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLStringLiteralMixin.java`
#### Snippet
```java
public abstract class GraphQLStringLiteralMixin extends GraphQLElementImpl implements GraphQLStringLiteral {

    public GraphQLStringLiteralMixin(ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLElementImpl()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLElementImpl.java`
#### Snippet
```java

public abstract class GraphQLElementImpl extends ASTWrapperPsiElement implements GraphQLElement {
    public GraphQLElementImpl(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLReferenceMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLReferenceMixin.java`
#### Snippet
```java
    private static final Key<CachedValue<PsiReference>> REFERENCE_KEY = Key.create("graphql.reference");

    public GraphQLReferenceMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLArgumentMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentMixin.java`
#### Snippet
```java

public abstract class GraphQLArgumentMixin extends GraphQLNamedElementImpl implements GraphQLArgument, GraphQLTypeScopeProvider {
    public GraphQLArgumentMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLDirectiveLocationMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLDirectiveLocationMixin.java`
#### Snippet
```java
public abstract class GraphQLDirectiveLocationMixin extends GraphQLElementImpl implements GraphQLDirectiveLocation {

    public GraphQLDirectiveLocationMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLSelectionSetOperationDefinitionMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLSelectionSetOperationDefinitionMixin.java`
#### Snippet
```java
public abstract class GraphQLSelectionSetOperationDefinitionMixin extends GraphQLNamedElementImpl implements GraphQLTypeScopeProvider {

    public GraphQLSelectionSetOperationDefinitionMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLTypeNameMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypeNameMixin.java`
#### Snippet
```java

public abstract class GraphQLTypeNameMixin extends GraphQLNamedElementImpl implements GraphQLTypeName {
    public GraphQLTypeNameMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLInputValueDefinitionMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputValueDefinitionMixin.java`
#### Snippet
```java
public abstract class GraphQLInputValueDefinitionMixin extends GraphQLNamedElementImpl implements GraphQLInputValueDefinition, GraphQLTypeScopeProvider {

    public GraphQLInputValueDefinitionMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQLObjectValueMixin()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectValueMixin.java`
#### Snippet
```java

public abstract class GraphQLObjectValueMixin extends GraphQLValueImpl implements GraphQLObjectValue, GraphQLTypeScopeProvider {
    public GraphQLObjectValueMixin(@NotNull ASTNode node) {
        super(node);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNode()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractNode.java`
#### Snippet
```java
    }

    public AbstractNode(SourceLocation sourceLocation,
                        List<Comment> comments,
                        IgnoredChars ignoredChars,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNode()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractNode.java`
#### Snippet
```java
    private final @NotNull List<Node> mySourceNodes;

    public AbstractNode(SourceLocation sourceLocation, List<Comment> comments, IgnoredChars ignoredChars) {
        this(sourceLocation, comments, ignoredChars, Collections.emptyMap(), null, Collections.emptyList());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDescribedNode()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractDescribedNode.java`
#### Snippet
```java
    protected Description description;

    public AbstractDescribedNode(SourceLocation sourceLocation,
                                 List<Comment> comments,
                                 IgnoredChars ignoredChars,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAsyncExecutionStrategy()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/execution/AbstractAsyncExecutionStrategy.java`
#### Snippet
```java
    }

    public AbstractAsyncExecutionStrategy(DataFetcherExceptionHandler dataFetcherExceptionHandler) {
        super(dataFetcherExceptionHandler);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAsyncExecutionStrategy()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/execution/AbstractAsyncExecutionStrategy.java`
#### Snippet
```java
public abstract class AbstractAsyncExecutionStrategy extends ExecutionStrategy {

    public AbstractAsyncExecutionStrategy() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `PersistedQuerySupport()` of an abstract class should not be declared 'public'
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
    private final PersistedQueryCache persistedQueryCache;

    public PersistedQuerySupport(PersistedQueryCache persistedQueryCache) {
        this.persistedQueryCache = assertNotNull(persistedQueryCache);
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
  public void parseLight(IElementType type, PsiBuilder builder) {
    boolean result;
    builder = adapt_builder_(type, builder, this, EXTENDS_SETS_);
    Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
    result = parse_root_(type, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `editor`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLMissingTypeFix.java`
#### Snippet
```java
                       @NotNull PsiElement endElement) {
        if (editor == null) {
            editor = PsiEditorUtil.getInstance().findEditorByPsiElement(startElement);
            if (editor == null) {
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
            PsiElement next = PsiTreeUtil.skipWhitespacesForward(element);
            if (next != null) {
                element = next;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
            GraphQLTypeCondition typeCondition = ((GraphQLInlineFragment) element).getTypeCondition();
            if (typeCondition != null) {
                element = typeCondition;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
        }

        element = GraphQLPsiUtil.skipDescription(element);
        LeafElement leaf = TreeUtil.findFirstLeaf(element.getNode());
        if (leaf != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
        LeafElement leaf = TreeUtil.findFirstLeaf(element.getNode());
        if (leaf != null) {
            element = leaf.getPsi();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `introspection`
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
    @NotNull
    public String printIntrospectionAsGraphQL(@NotNull Map<String, Object> introspection) {
        introspection = getIntrospectionSchemaData(introspection);

        if (!GraphQLSettings.getSettings(myProject).isEnableIntrospectionDefaultValues()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `introspection`
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
            throw new IllegalArgumentException(GraphQLBundle.message("graphql.introspection.missing.data"));
        }
        introspection = (Map<String, Object>) introspection.get("data");
        if (!introspection.containsKey("__schema")) {
            throw new IllegalArgumentException(GraphQLBundle.message("graphql.introspection.missing.schema"));
```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java
        }

        endpoint = GraphQLIntrospectionUtil.promptForEnvVariables(myProject, endpoint);
        if (endpoint == null) return;

```

### AssignmentToMethodParameter
Assignment to method parameter `sameParent`
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
        Map<String, Integer> indexCorrection = new HashMap<>();

        sameParent = new ArrayList<>(sameParent);
        sameParent.sort((zipper1, zipper2) -> {
            int index1 = zipper1.getBreadcrumbs().get(0).getLocation().getIndex();
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldGlobPattern`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
    private String removeLeadingSlash(String fieldGlobPattern) {
        if (fieldGlobPattern.startsWith(SEP)) {
            fieldGlobPattern = fieldGlobPattern.substring(1);
        }
        return fieldGlobPattern;
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldGlobPattern`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
        }
        computeValuesLazily();
        fieldGlobPattern = removeLeadingSlash(fieldGlobPattern);
        PathMatcher globMatcher = globMatcher(fieldGlobPattern);
        for (String flattenedField : flattenedFieldsForGlobSearching) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
     */
    public static Stack<GraphQLType> unwrapType(GraphQLType type) {
        type = assertNotNull(type);
        Stack<GraphQLType> decoration = new Stack<>();
        while (true) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
                break;
            }
            type = unwrapOne(type);
        }
        return decoration;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
    public static GraphQLType unwrapNonNull(GraphQLType type) {
        while (isNonNull(type)) {
            type = unwrapOne(type);
        }
        return type;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeUtil.java`
#### Snippet
```java
                return (GraphQLUnmodifiedType) type;
            }
            type = unwrapOne(type);
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `typeRef`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                GraphQLNamedType graphQLNamedType = changedTypes.get(typeRef.getName());
                if (graphQLNamedType != null) {
                    typeRef = GraphQLTypeReference.typeRef(graphQLNamedType.getName());
                    return changedNode(typeRef, context);
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
            if (type instanceof NonNullType) {
                decoration.push(NonNullType.class);
                type = ((NonNullType) type).getType();
            }
            if (type instanceof ListType) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeInfo.java`
#### Snippet
```java
            if (type instanceof ListType) {
                decoration.push(ListType.class);
                type = ((ListType) type).getType();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `requiredType`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

        if (GraphQLTypeUtil.isNonNull(requiredType)) {
            requiredType = unwrapOne(requiredType);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `directives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java

    String buildDeprecationReason(List<Directive> directives) {
        directives = Optional.ofNullable(directives).orElse(emptyList());
        Optional<Directive> directive = directives.stream().filter(d -> "deprecated".equals(d.getName())).findFirst();
        if (directive.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `directives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                                       Set<GraphQLDirective> runtimeDirectives,
                                       GraphqlTypeComparatorRegistry comparatorRegistry) {
        directives = Optional.ofNullable(directives).orElse(emptyList());
        extensionDirectives = Optional.ofNullable(extensionDirectives).orElse(emptyList());
        Set<String> previousNames = new LinkedHashSet<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `extensionDirectives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                                       GraphqlTypeComparatorRegistry comparatorRegistry) {
        directives = Optional.ofNullable(directives).orElse(emptyList());
        extensionDirectives = Optional.ofNullable(extensionDirectives).orElse(emptyList());
        Set<String> previousNames = new LinkedHashSet<>();

```

### AssignmentToMethodParameter
Assignment to method parameter `arguments`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
        Comparator<? super GraphQLSchemaElement> comparator = options.comparatorRegistry.getComparator(environment);

        arguments = arguments
            .stream()
            .sorted(comparator)
```

### AssignmentToMethodParameter
Assignment to method parameter `directives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java

    String directivesString(Class<? extends GraphQLSchemaElement> parent, List<GraphQLDirective> directives) {
        directives = directives.stream()
            // @deprecated is special - we always print it if something is deprecated
            .filter(directive -> options.getIncludeDirective().test(directive) || isDeprecatedDirective(directive))
```

### AssignmentToMethodParameter
Assignment to method parameter `directives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
        Comparator<? super GraphQLSchemaElement> comparator = options.comparatorRegistry.getComparator(environment);

        directives = directives
            .stream()
            .sorted(comparator)
```

### AssignmentToMethodParameter
Assignment to method parameter `directives`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java
    private List<GraphQLDirective> addDeprecatedDirectiveIfNeeded(List<GraphQLDirective> directives) {
        if (!hasDeprecatedDirective(directives)) {
            directives = new ArrayList<>(directives);
            directives.add(DeprecatedDirective4Printing);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/NoUnbrokenInputCycles.java`
#### Snippet
```java
                GraphQLType unwrapped = unwrapNonNull((GraphQLNonNull) field.getType());
                if (unwrapped instanceof GraphQLInputObjectType) {
                    path = new ArrayList<>(path);
                    path.add(field.getName() + "!");
                    check((GraphQLInputObjectType) unwrapped, new LinkedHashSet<>(seen), path, validationErrorCollector);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/com/intellij/lang/jsgraphql/types/analysis/MaxQueryDepthInstrumentation.java`
#### Snippet
```java
        int length = 1;
        while (path != null) {
            path = path.getParentEnvironment();
            length++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `maybeString`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstPrinter.java`
#### Snippet
```java
            return "";
        }
        maybeString = maybeString.replaceAll("\\n", "\n  ");
        return maybeString;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `items`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java

    private <T> List<T> sort(List<T> items, Comparator<T> comparing) {
        items = new ArrayList<>(items);
        items.sort(comparing);
        return items;
```

### AssignmentToMethodParameter
Assignment to method parameter `pathString`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ResultPath.java`
#### Snippet
```java
     */
    public static ResultPath parse(String pathString) {
        pathString = pathString == null ? "" : pathString;
        String finalPathString = pathString.trim();
        StringTokenizer st = new StringTokenizer(finalPathString, "/[]", true);
```

### AssignmentToMethodParameter
Assignment to method parameter `next`
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
            final RunNode current = next;
            run(current);
            if ((next = current.get()) == null) { // try advance, if we get null test
                if (last.compareAndSet(current, null)) {
                    return; // end-of-queue: we're done.
```

### AssignmentToMethodParameter
Assignment to method parameter `next`
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
                } else {
                    //noinspection StatementWithEmptyBody
                    while ((next = current.get()) == null) {
                        // Thread.onSpinWait(); in Java 9
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        for (Instrumentation instrumentation : instrumentations) {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            schema = instrumentation.instrumentSchema(schema, parameters.withNewState(state));
        }
        return schema;
```

### AssignmentToMethodParameter
Assignment to method parameter `dataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        for (Instrumentation instrumentation : instrumentations) {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            dataFetcher = instrumentation.instrumentDataFetcher(dataFetcher, parameters.withNewState(state));
        }
        return dataFetcher;
```

### AssignmentToMethodParameter
Assignment to method parameter `executionContext`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        for (Instrumentation instrumentation : instrumentations) {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            executionContext = instrumentation.instrumentExecutionContext(executionContext, parameters.withNewState(state));
        }
        return executionContext;
```

### AssignmentToMethodParameter
Assignment to method parameter `executionInput`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        for (Instrumentation instrumentation : instrumentations) {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            executionInput = instrumentation.instrumentExecutionInput(executionInput, parameters.withNewState(state));
        }
        return executionInput;
```

### AssignmentToMethodParameter
Assignment to method parameter `documentAndVariables`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
        for (Instrumentation instrumentation : instrumentations) {
            InstrumentationState state = getState(instrumentation, parameters.getInstrumentationState());
            documentAndVariables = instrumentation.instrumentDocumentAndVariables(documentAndVariables, parameters.withNewState(state));
        }
        return documentAndVariables;
```

### AssignmentToMethodParameter
Assignment to method parameter `requiredTypeScope`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLSchemaUtil.java`
#### Snippet
```java

        // unwrap non-nullable and list types
        requiredTypeScope = getUnmodifiedType(requiredTypeScope);

        final GraphQLTypeCondition typeCondition = fragmentCandidate.getTypeCondition();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLSchemaUtil.java`
#### Snippet
```java
                return unwrapOne(type);
            }
            type = unwrapOne(type);
        }
        return type;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java
        } catch (JsonSyntaxException ignored) {
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLValidationAnnotator.java`
#### Snippet
```java
            return "\"" + StringUtils.join(suggestions, "\", or \"") + "\"";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/ide/documentation/GraphQLDocumentationMarkdownRenderer.java`
#### Snippet
```java
     */
    public static String getDescriptionAsHTML(String description) {
        return description != null ? HTML_RENDERER.render(PARSER.parse(description.trim())) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLInlineFragmentMixin.java`
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
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLFragmentDefinitionMixin.java`
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
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLTypedOperationDefinitionMixin.java`
#### Snippet
```java
            return schema.getSubscriptionType();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectFieldMixin.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLFieldMixin.java`
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
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentMixin.java`
#### Snippet
```java
                    }
                }
                return null;
            }
            final GraphQLField field = PsiTreeUtil.getParentOfType(this, GraphQLField.class);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLArgumentMixin.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/GraphQLError.java`
#### Snippet
```java
     */
    default List<Object> getPath() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/GraphQLError.java`
#### Snippet
```java
     */
    default Map<String, Object> getExtensions() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLInputValueDefinitionMixin.java`
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
in `src/main/com/intellij/lang/jsgraphql/psi/impl/GraphQLObjectValueMixin.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/ParseAndValidateResult.java`
#### Snippet
```java
            return DocumentAndVariables.newDocumentAndVariables().document(document).variables(variables).build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/UnresolvedTypeError.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/TypeMismatchError.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
            List<GraphQLDirective> directiveList = allDirectivesByName.get(directiveName);
            if (directiveList == null || directiveList.isEmpty()) {
                return null;
            }
            Assert.assertTrue(isAllNonRepeatable(directiveList), () -> String.format("'%s' is a repeatable directive and you have used a non repeatable access method", directiveName));
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
        List<GraphQLDirective> directives = allDirectivesByName.getOrDefault(name, emptyList());
        if (directives.isEmpty()) {
            return null;
        }
        return directives.get(0);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
        List<GraphQLDirective> directiveList = directives.get(directiveName);
        if (directiveList == null || directiveList.isEmpty()) {
            return null;
        }
        Assert.assertTrue(isAllNonRepeatable(directiveList), () -> String.format("'%s' is a repeatable directive and you have used a non repeatable access method", directiveName));
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
            curContext = curContext.getParentContext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
    public T getParentNode() {
        if (parent == null) {
            return null;
        }
        return parent.thisNode();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/relay/InvalidCursorException.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/relay/InvalidPageSizeException.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeZipper.java`
#### Snippet
```java
        }
        if (breadcrumbs.size() == 0 && modificationType == ModificationType.DELETE) {
            return null;
        }
        T curNode = this.curNode;
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlFloatCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            return value.doubleValue();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlFloatCoercing.java`
#### Snippet
```java
            return value.doubleValue();
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/relay/SimpleListConnection.java`
#### Snippet
```java
        int index = data.indexOf(object);
        if (index == -1) {
            return null;
        }
        String cursor = createCursor(index);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBigIntegerCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBigIntegerCoercing.java`
#### Snippet
```java
                return value.toBigIntegerExact();
            } catch (ArithmeticException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBigIntegerCoercing.java`
#### Snippet
```java
            }
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBooleanCoercing.java`
#### Snippet
```java
            return value.compareTo(BigDecimal.ZERO) != 0;
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlCharCoercing.java`
#### Snippet
```java
            return (Character) input;
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlIntCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlIntCoercing.java`
#### Snippet
```java
                return value.intValueExact();
            } catch (ArithmeticException e) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlIntCoercing.java`
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
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlByteCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlByteCoercing.java`
#### Snippet
```java
                return value.byteValueExact();
            } catch (ArithmeticException e) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlByteCoercing.java`
#### Snippet
```java
            }
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBigDecimalCoercing.java`
#### Snippet
```java
                return new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlBigDecimalCoercing.java`
#### Snippet
```java
            }
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlShortCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlShortCoercing.java`
#### Snippet
```java
                return value.shortValueExact();
            } catch (ArithmeticException e) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlShortCoercing.java`
#### Snippet
```java
            }
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlLongCoercing.java`
#### Snippet
```java
                value = new BigDecimal(input.toString());
            } catch (NumberFormatException e) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlLongCoercing.java`
#### Snippet
```java
                return value.longValueExact();
            } catch (ArithmeticException e) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/scalar/GraphqlLongCoercing.java`
#### Snippet
```java
            }
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
     */
    public Object getDefaultValue() {
        return defaultValue == DEFAULT_VALUE_SENTINEL ? null : defaultValue;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingFieldSelectionSetImpl.java`
#### Snippet
```java
            String parentSimpleQualifiedName = beforeLastSlash(qualifiedName);
            String parentFullyQualifiedName = beforeLastSlash(fullyQualifiedName);
            return normalizedField.getParent() == null ? null :
                    new SelectedFieldImpl(parentSimpleQualifiedName, parentFullyQualifiedName, normalizedField.getParent());
        }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyDataFetcher.java`
#### Snippet
```java
        Object source = environment.getSource();
        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyFetchingImpl.java`
#### Snippet
```java
        //
        if (isNegativelyCached(cacheKey)) {
            return null;
        }
        //
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyFetchingImpl.java`
#### Snippet
```java
                    // we have nothing to ask for and we have exhausted our lookup strategies
                    putInNegativeCache(cacheKey);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeReference.java`
#### Snippet
```java
    @Override
    public String getDescription() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeReference.java`
#### Snippet
```java
    @Override
    public Node getDefinition() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/TypeResolverProxy.java`
#### Snippet
```java
    @Override
    public GraphQLObjectType getType(TypeResolutionEnvironment env) {
        return typeResolver != null ? typeResolver.getType(env) : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
    DataFetcher<?> getDataFetcher() {
        if (dataFetcherFactory == null) {
            return null;
        }
        return dataFetcherFactory.get(newDataFetchingFactoryEnvironment()
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/CombinedWiringFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
            return Short.valueOf("1");
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/NoopWiringFactory.java`
#### Snippet
```java
    @Override
    public DataFetcher getDefaultDataFetcher(FieldWiringEnvironment environment) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/WiringFactory.java`
#### Snippet
```java
     */
    default DataFetcher getDefaultDataFetcher(FieldWiringEnvironment environment) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        Optional<Directive> directive = directives.stream().filter(d -> "deprecated".equals(d.getName())).findFirst();
        if (directive.isEmpty()) {
            return null;
        }
        Map<String, String> args = directive.get().getArguments().stream()
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        }
        if (lines.size() == 0) {
            return null;
        }
        return String.join("\n", lines);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                try {
                    String name = dl.getName();
                    if (name == null) return null;
                    return DirectiveLocation.valueOf(name.toUpperCase());
                } catch (IllegalArgumentException e) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
                    return DirectiveLocation.valueOf(name.toUpperCase());
                } catch (IllegalArgumentException e) {
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstValueHelper.java`
#### Snippet
```java
    public static Value<?> astFromValue(Object value, GraphQLType type) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstValueHelper.java`
#### Snippet
```java
        final Object serialized = serialize(type, value);
        if (isNullish(serialized)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractNode.java`
#### Snippet
```java
    protected <V extends Node> V deepCopy(V nullableObj) {
        if (nullableObj == null) {
            return null;
        }
        return (V) nullableObj.deepCopy();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/AbstractNode.java`
#### Snippet
```java
    protected <V extends Node> List<V> deepCopy(List<? extends Node> list) {
        if (list == null) {
            return null;
        }
        return map(list, n -> (V) n.deepCopy());
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    static String getTypeName(Type type) {
        if (type == null) {
            return null;
        }
        return typeInfo(type).getName();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
            newTypeInfo = newTypeInfo.unwrapOne();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/language/AstSorter.java`
#### Snippet
```java
    private SelectionSet sortSelectionSet(SelectionSet selectionSet) {
        if (selectionSet == null) {
            return null;
        }
        List<Selection> selections = sort(selectionSet.getSelections(), comparingSelections());
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/AsyncExecutionStrategy.java`
#### Snippet
```java
            // the execution does not hang.
            overallResult.completeExceptionally(ex);
            return null;
        });

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
                return optional.getAsInt();
            } else {
                return null;
            }
        } else if (result instanceof OptionalDouble) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
                return optional.getAsDouble();
            } else {
                return null;
            }
        } else if (result instanceof OptionalLong) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
                return optional.getAsLong();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/UnknownOperationException.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldWasNullError.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/TypeFromAST.java`
#### Snippet
```java
        if (type instanceof ListType) {
            innerType = getTypeFromAST(schema, ((ListType) type).getType());
            return innerType != null ? list(innerType) : null;
        } else if (type instanceof NonNullType) {
            innerType = getTypeFromAST(schema, ((NonNullType) type).getType());
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/TypeFromAST.java`
#### Snippet
```java
        } else if (type instanceof NonNullType) {
            innerType = getTypeFromAST(schema, ((NonNullType) type).getType());
            return innerType != null ? nonNull(innerType) : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ResultPath.java`
#### Snippet
```java
    public ResultPath dropSegment() {
        if (this == rootPath()) {
            return null;
        }
        return this.parent;
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/InputMapDefinesTooManyFieldsException.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/AbortExecutionException.java`
#### Snippet
```java
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java

        handleTypeMismatchProblem(context, parameters, result);
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java
                    if (exception != null) {
                        handleFetchingException(executionContext, environment, exception);
                        return null;
                    } else {
                        return result;
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java


        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/Instrumentation.java`
#### Snippet
```java
     */
    default InstrumentationState createState() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/fieldvalidation/FieldValidationSupport.java`
#### Snippet
```java

        private FieldAndArguments mkParentArgs(QueryVisitorFieldEnvironment traversalEnv) {
            return traversalEnv.getParentEnvironment() != null ? new FieldAndArgumentsImpl(traversalEnv.getParentEnvironment()) : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
        // can only happen for the root node
        if (executionStepInfo == null) {
            return null;
        }
        Assert.assertNotNull(children);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
        }
        if (inputValue instanceof NullValue) {
            return null;
        }
        if (type instanceof GraphQLScalarType) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
            return coerceValueAstForList(fieldVisibility, (GraphQLList) type, inputValue, variables);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java

            if (value == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
            if (argument.getName().equals(name)) return argument;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
    public List<String> getQueryPath() {
        if (nameStack.isEmpty()) {
            return null;
        }
        return new ArrayList<>(nameStack);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
            return schema.getFieldVisibility().getFieldDefinition((GraphQLFieldsContainer) parentType, field.getName());
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java

    private <T> T lastElement(List<T> list) {
        if (list.size() == 0) return null;
        return list.get(list.size() - 1);
    }
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return ((GraphQLUnionType) type).getTypes();
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return ((GraphQLNamedSchemaElement) type).getDescription();
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return ((GraphQLInterfaceType) type).getInterfaces();
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            if (environment.getSource() instanceof GraphQLArgument) {
                GraphQLArgument inputField = environment.getSource();
                return inputField.getDefaultValue() != null ? print(inputField.getDefaultValue(), inputField.getType()) : null;
            } else if (environment.getSource() instanceof GraphQLInputObjectField) {
                GraphQLInputObjectField inputField = environment.getSource();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            } else if (environment.getSource() instanceof GraphQLInputObjectField) {
                GraphQLInputObjectField inputField = environment.getSource();
                return inputField.getDefaultValue() != null ? print(inputField.getDefaultValue(), inputField.getType()) : null;
            }
            return null;
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
                return inputField.getDefaultValue() != null ? print(inputField.getDefaultValue(), inputField.getType()) : null;
            }
            return null;
        });
        register(__InputValue, "name", nameDataFetcher);
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return filtered;
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return ((GraphQLNamedSchemaElement) type).getName();
        }
        return null;
    };
    private static final IntrospectionDataFetcher descriptionDataFetcher = environment -> {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return ((GraphQLScalarType) type).getSpecifiedByUrl();
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return GraphQLTypeUtil.unwrapOne((GraphQLModifiedType) type);
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return fieldVisibility.getFieldDefinitions((GraphQLInputObjectType) type);
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            return filtered;
        }
        return null;
    };

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java

    private static <T extends Node> T checkNode(@Nullable T node) {
        if (node == null) return null;
        if (node instanceof NamedNode) {
            String name = ((NamedNode<?>) node).getName();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof NamedNode) {
            String name = ((NamedNode<?>) node).getName();
            if (StringUtil.isEmpty(name)) return null;
        }
        if (node instanceof ListType) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof ListType) {
            Type type = ((ListType) node).getType();
            if (type == null) return null;
        }
        if (node instanceof NonNullType) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof NonNullType) {
            Type type = ((NonNullType) node).getType();
            if (type == null) return null;
        }
        if (node instanceof OperationTypeDefinition) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof OperationTypeDefinition) {
            TypeName typeName = ((OperationTypeDefinition) node).getTypeName();
            if (typeName == null) return null;
        }
        if (node instanceof VariableDefinition) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof VariableDefinition) {
            Type type = ((VariableDefinition) node).getType();
            if (type == null) return null;
        }
        if (node instanceof FragmentDefinition) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof FragmentDefinition) {
            TypeName typeCondition = ((FragmentDefinition) node).getTypeCondition();
            if (typeCondition == null) return null;
        }
        if (node instanceof FieldDefinition) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof FieldDefinition) {
            Type type = ((FieldDefinition) node).getType();
            if (type == null) return null;
        }
        if (node instanceof InputValueDefinition) {
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        if (node instanceof InputValueDefinition) {
            Type type = ((InputValueDefinition) node).getType();
            if (type == null) return null;
        }
        return node;
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
            GraphQLTemplateSelection templateSelection = selection.getTemplateSelection();
            // ignore templates
            if (templateSelection != null) return null;

            GraphQLField field = selection.getField();
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java

        if (isAlreadyChecked(fieldA, fieldB)) {
            return null;
        }
        alreadyChecked.add(new FieldPair(fieldA, fieldB));
```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
                fieldAndTypeA.parentType instanceof GraphQLObjectType &&
                fieldAndTypeB.parentType instanceof GraphQLObjectType) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
            typeB = unwrapOne(typeB);
        }
        return null;
    }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `builder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLValidationAnnotator.java`
#### Snippet
```java
        String finalMessage = message;
        createAnnotation(annotationHolder, element, message, GraphQLUnresolvedReferenceInspection.class, builder -> {
            builder = builder.highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);

            if (!fixes.isEmpty()) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `builder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLValidationAnnotator.java`
#### Snippet
```java
                );
                for (LocalQuickFix fix : fixes) {
                    builder = builder.newLocalQuickFix(fix, problemDescriptor).registerFix();
                }
            }
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `builder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java

        GraphQLInspection.createAnnotation(annotationHolder, element, message, error.getInspectionClass(), builder -> {
            builder = builder.range(getAnnotationAnchor(element));

            List<Node> references = ContainerUtil.filter(error.getReferences(), ref -> {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `builder`
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java

            if (!references.isEmpty()) {
                builder = builder.tooltip(createTooltip(error, message, references.size() > 1));
            }
            return builder;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `fieldDefinition`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorDirectiveHelper.java`
#### Snippet
```java
            if (isNotTheSameObjects(startingArgs, newArgs)) {
                // they may have changed the arguments to the fieldDefinition so reflect that
                fieldDefinition = fieldDefinition.transform(builder -> builder.clearArguments().arguments(newArgs));
            }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `zzTransL` is redundant
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;
```

### UnnecessaryLocalVariable
Local variable `zzRowMapL` is redundant
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

```

### UnnecessaryLocalVariable
Local variable `traverserResult` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
        }

        TraverserResult traverserResult = new TraverserResult(currentAccValue);
        return traverserResult;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        DefaultTraverserContext context = newContext(root, rootContext, null);
        EnterAction enterAction = new EnterAction(null, context, visitor);
        T result = (T) forkJoinPool.invoke(enterAction);
        return result;
    }
```

### UnnecessaryLocalVariable
Local variable `fetchedValueAnalysis` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ExecutionStrategyUtil.java`
#### Snippet
```java

    private FetchedValueAnalysis analyseValue(ExecutionContext executionContext, FetchedValue fetchedValue, ExecutionStepInfo executionInfo) {
        FetchedValueAnalysis fetchedValueAnalysis = fetchedValueAnalyzer.analyzeFetchedValue(executionContext, fetchedValue, executionInfo);
        return fetchedValueAnalysis;
    }
```

### UnnecessaryLocalVariable
Local variable `fieldSubSelection` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/ExecutionHelper.java`
#### Snippet
```java
        ExecutionStepInfo executionInfo = newExecutionStepInfo().type(operationRootType).path(ResultPath.rootPath()).build();

        FieldSubSelection fieldSubSelection = FieldSubSelection.newFieldSubSelection()
                .source(executionContext.getRoot())
                .localContext(executionContext.getLocalContext())
```

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  /* user code: */

    private static final class State {
        final int lBraceCount;
        final int state;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionTask.java`
#### Snippet
```java
 * Represents an executable introspection query against a GraphQL endpoint
 */
public class GraphQLIntrospectionTask {

    private final GraphQLConfigEndpoint endpoint;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java
    }

    private static class GraphqlErrorImpl implements GraphQLError {
        private final String message;
        private final List<SourceLocation> locations;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/util/ReplaceNode.java`
#### Snippet
```java
 */
@Internal
public class ReplaceNode {

    private final Object newNode;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeLocation.java`
#### Snippet
```java
 */
@PublicApi
public class NodeLocation {

    private final String name;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/util/Breadcrumb.java`
#### Snippet
```java
 */
@PublicApi
public class Breadcrumb<T> {

    private final T node;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserResult.java`
#### Snippet
```java

@Internal
public class TraverserResult {

    private final Object accumulatedResult;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/relay/DefaultPageInfo.java`
#### Snippet
```java

@PublicApi
public class DefaultPageInfo implements PageInfo {

    private final ConnectionCursor startCursor;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/relay/DefaultConnectionCursor.java`
#### Snippet
```java

@PublicApi
public class DefaultConnectionCursor implements ConnectionCursor {

    private final String value;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/relay/DefaultEdge.java`
#### Snippet
```java

@PublicApi
public class DefaultEdge<T> implements Edge<T> {

    private final T node;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
    }

    public static class ResolvedGlobalId {

        public ResolvedGlobalId(String type, String id) {
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/schema/PropertyFetchingImpl.java`
#### Snippet
```java
    }

    private static final class CacheKey {
        private final ClassLoader classLoader;
        private final String className;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLTypeReference.java`
#### Snippet
```java
 */
@PublicApi
public class GraphQLTypeReference implements GraphQLNamedOutputType, GraphQLNamedInputType {

    /**
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/VisibleFieldPredicateEnvironment.java`
#### Snippet
```java
    GraphQLSchemaElement getParentElement();

    class VisibleFieldPredicateEnvironmentImpl implements VisibleFieldPredicateEnvironment {

        private final GraphQLNamedSchemaElement schemaElement;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTraversalContext.java`
#### Snippet
```java
 */
@Internal
class QueryTraversalContext {

    // never used for scalars/enums, always a possibly wrapped composite type
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitorFragmentSpreadEnvironmentImpl.java`
#### Snippet
```java

@Internal
public class QueryVisitorFragmentSpreadEnvironmentImpl implements QueryVisitorFragmentSpreadEnvironment {

    private final FragmentSpread fragmentSpread;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/FieldComplexityEnvironment.java`
#### Snippet
```java

@PublicApi
public class FieldComplexityEnvironment {
    private final Field field;
    private final GraphQLFieldDefinition fieldDefinition;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitorFieldArgumentValueEnvironmentImpl.java`
#### Snippet
```java

@Internal
public class QueryVisitorFieldArgumentValueEnvironmentImpl implements QueryVisitorFieldArgumentValueEnvironment {

    private final GraphQLFieldDefinition fieldDefinition;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitorFragmentDefinitionEnvironmentImpl.java`
#### Snippet
```java

@Internal
public class QueryVisitorFragmentDefinitionEnvironmentImpl implements QueryVisitorFragmentDefinitionEnvironment {

    private final FragmentDefinition fragmentDefinition;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitorFieldArgumentEnvironmentImpl.java`
#### Snippet
```java

@Internal
public class QueryVisitorFieldArgumentEnvironmentImpl implements QueryVisitorFieldArgumentEnvironment {

    private final GraphQLFieldDefinition fieldDefinition;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryVisitorInlineFragmentEnvironmentImpl.java`
#### Snippet
```java

@Internal
public class QueryVisitorInlineFragmentEnvironmentImpl implements QueryVisitorInlineFragmentEnvironment {
    private final InlineFragment inlineFragment;
    private final TraverserContext<Node> traverserContext;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/language/SourceLocation.java`
#### Snippet
```java
    }

    private static final class Location {
        private final int line;
        private final int column;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/language/IgnoredChar.java`
#### Snippet
```java

@PublicApi
public class IgnoredChar implements Serializable {

    public enum IgnoredCharKind {
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/NamedResultNode.java`
#### Snippet
```java

@Internal
public class NamedResultNode {
    private final String name;
    private final ExecutionResultNode node;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/nextgen/InstrumentationCreateStateParameters.java`
#### Snippet
```java
 */
@Internal
public class InstrumentationCreateStateParameters {
    private final GraphQLSchema schema;
    private final ExecutionInput executionInput;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/parameters/InstrumentationCreateStateParameters.java`
#### Snippet
```java
 */
@PublicApi
public class InstrumentationCreateStateParameters {
    private final GraphQLSchema schema;
    private final ExecutionInput executionInput;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/normalized/NormalizedQueryTree.java`
#### Snippet
```java

@Internal
public class NormalizedQueryTree {

    private final List<NormalizedField> topLevelFields;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java


    private static class FieldAndType {
        final Field field;
        final GraphQLType graphQLType;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
    }

    private static class FieldPair {
        final Field field1;
        final Field field2;
```

### ClassCanBeRecord
Class can be a record
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
    private final ValuesResolver valuesResolver = new ValuesResolver();

    public static class CollectFieldResult {
        private final List<NormalizedField> children;
        private final Map<NormalizedField, MergedField> mergedFieldByNormalized;
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableMapWithNullValues.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return delegate.equals(o);
    }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/RuntimeWiring.java`
#### Snippet
```java
            String typeName = typeRuntimeWiring.getTypeName();
            Map<String, DataFetcher> typeDataFetchers = dataFetchers.computeIfAbsent(typeName, k -> new LinkedHashMap<>());
            typeRuntimeWiring.getFieldDataFetchers().forEach(typeDataFetchers::put);

            defaultDataFetchers.put(typeName, typeRuntimeWiring.getDefaultDataFetcher());
```

## RuleId[id=UnusedSymbol]
### UnusedSymbol
Class "GraphQLConfigPointer" is never used
in `src/main/com/intellij/lang/jsgraphql/ide/config/model/GraphQLConfigPointer.kt`
#### Snippet
```java


data class GraphQLConfigPointer(val dir: VirtualFile?, val file: VirtualFile?, val projectName: String?) {
    fun resolve(project: Project): GraphQLProjectConfig? {
        val provider = GraphQLConfigProvider.getInstance(project)
```

### UnusedSymbol
Function "containsVariables" is never used
in `src/main/com/intellij/lang/jsgraphql/ide/config/env/GraphQLConfigEnvironmentParser.kt`
#### Snippet
```java
    private val regex = Regex("\\$\\{([^}]*)}")

    fun containsVariables(raw: String?, isLegacy: Boolean): Boolean {
        return raw?.let { parse(it, isLegacy) }?.variables?.isNotEmpty() ?: false
    }
```

### UnusedSymbol
Property "isValidUrl" is never used
in `src/main/com/intellij/lang/jsgraphql/ide/config/model/GraphQLConfigEndpoint.kt`
#### Snippet
```java
    val introspect: Boolean? = rawData.introspect

    val isValidUrl: Boolean = url?.let { URLUtil.canContainUrl(url) } ?: false

    val schemaPointer: GraphQLSchemaPointer? = rawSchemaPointer?.let { GraphQLSchemaPointer(project, dir, it, isLegacy, environment) }
```

### UnusedSymbol
Function "getSourcePath" is never used
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/remote/GraphQLRemoteSchemasRegistry.kt`
#### Snippet
```java
    }

    fun getSourcePath(filePath: String): String? {
        return associations[FileUtil.toSystemIndependentName(filePath)]
    }
```

### UnusedSymbol
Property "LOG" is never used
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLRegistryProvider.kt`
#### Snippet
```java

    companion object {
        private val LOG = logger<GraphQLRegistryProvider>()

        @JvmStatic
```

## RuleId[id=UsePropertyAccessSyntax]
### UsePropertyAccessSyntax
Use of setter method instead of property access syntax
in `src/main/com/intellij/lang/jsgraphql/ide/project/schemastatus/GraphQLSchemasPanel.kt`
#### Snippet
```java
            }
        }
        tree.emptyText.setText(GraphQLBundle.message("graphql.tool.window.discovery.not.completed"))
        tree.selectionModel.selectionMode = TreeSelectionModel.SINGLE_TREE_SELECTION
        tree.isRootVisible = false
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'horizontalAlign(com.intellij.ui.dsl.gridLayout.HorizontalAlign)' is scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLSettingsConfigurable.kt`
#### Snippet
```java
                    expandableTextField()
                        .bindText(settings::getIntrospectionQuery, settings::setIntrospectionQuery)
                        .horizontalAlign(HorizontalAlign.FILL)
                        .applyToComponent {
                            emptyText.text = message("graphql.settings.introspection.query.empty.text")
```

### UnstableApiUsage
'com.intellij.psi.PsiParserFacade.SERVICE' is scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLSuppressByCommentFix.java`
#### Snippet
```java
        PsiElement parent = container.getParent();
        PsiElement added = parent.addBefore(comment, container);
        parent.addAfter(PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText("\n"), added);
    }

```

### UnstableApiUsage
'getInstance(com.intellij.openapi.project.Project)' is declared in class 'com.intellij.psi.PsiParserFacade.SERVICE' scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLSuppressByCommentFix.java`
#### Snippet
```java
        PsiElement parent = container.getParent();
        PsiElement added = parent.addBefore(comment, container);
        parent.addAfter(PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText("\n"), added);
    }

```

### UnstableApiUsage
'com.intellij.psi.PsiParserFacade.SERVICE' is scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLElementFactory.java`
#### Snippet
```java

    public static @NotNull PsiElement createWhiteSpace(@NotNull Project project, @NotNull String text) {
        return PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText(text);
    }
}
```

### UnstableApiUsage
'getInstance(com.intellij.openapi.project.Project)' is declared in class 'com.intellij.psi.PsiParserFacade.SERVICE' scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLElementFactory.java`
#### Snippet
```java

    public static @NotNull PsiElement createWhiteSpace(@NotNull Project project, @NotNull String text) {
        return PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText(text);
    }
}
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `src/main/com/intellij/lang/jsgraphql/types/collect/ImmutableKit.java`
#### Snippet
```java
        assertNotNull(newValue);
        int expectedSize = existing.size() + 1 + extraValues.length;
        ImmutableList.Builder<T> newList = ImmutableList.builderWithExpectedSize(expectedSize);
        newList.addAll(existing);
        newList.add(newValue);
```

### UnstableApiUsage
'NodeTargetRun(com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter, com.intellij.openapi.project.Project, com.intellij.javascript.debugger.CommandLineDebugConfigurator, com.intellij.javascript.nodejs.execution.NodeTargetRun.Options, com.intellij.javascript.nodejs.interpreter.NodeTargetRunSetup)' is scheduled for removal because its signature references class 'com.intellij.javascript.nodejs.execution.NodeTargetRun.Options' scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/javascript/config/GraphQLJavaScriptConfigLoader.kt`
#### Snippet
```java

    private fun createTargetRun(interpreter: NodeJsInterpreter, project: Project, workingDir: String): NodeTargetRun {
        val targetRun = NodeTargetRun(interpreter, project, null, NodeTargetRun.createOptions(ThreeState.NO, emptyList()))
        targetRun.commandLineBuilder.setWorkingDirectory(targetRun.path(workingDir))
        targetRun.commandLineBuilder.addEnvironmentVariable("NODE_ENV", "development")
```

### UnstableApiUsage
'createOptions(com.intellij.util.ThreeState, java.util.List, com.intellij.util.io.BaseOutputReader.Options)' is scheduled for removal in a future version
in `src/main/com/intellij/lang/jsgraphql/javascript/config/GraphQLJavaScriptConfigLoader.kt`
#### Snippet
```java

    private fun createTargetRun(interpreter: NodeJsInterpreter, project: Project, workingDir: String): NodeTargetRun {
        val targetRun = NodeTargetRun(interpreter, project, null, NodeTargetRun.createOptions(ThreeState.NO, emptyList()))
        targetRun.commandLineBuilder.setWorkingDirectory(targetRun.path(workingDir))
        targetRun.commandLineBuilder.addEnvironmentVariable("NODE_ENV", "development")
```

