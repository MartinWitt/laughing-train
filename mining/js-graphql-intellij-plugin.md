# js-graphql-intellij-plugin 
 
# Bad smells
I found 1032 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 387 | false |
| UnnecessaryUnicodeEscape | 120 | false |
| UNCHECKED_WARNING | 77 | false |
| DuplicateBranchesInSwitch | 48 | false |
| JavadocLinkAsPlainText | 42 | false |
| JavadocReference | 41 | false |
| Deprecation | 30 | false |
| DuplicatedCode | 28 | false |
| FieldMayBeFinal | 26 | false |
| SimplifyOptionalCallChains | 25 | false |
| TrivialIf | 19 | false |
| SimplifyStreamApiCallChains | 16 | false |
| RedundantMethodOverride | 15 | false |
| NullableProblems | 10 | false |
| DataFlowIssue | 10 | false |
| FieldCanBeLocal | 9 | false |
| LoopConditionNotUpdatedInsideLoop | 8 | false |
| UnstableApiUsage | 8 | false |
| MemberVisibilityCanBePrivate | 7 | false |
| RedundantSemicolon | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| NonExtendableApiUsage | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| UnusedSymbol | 5 | false |
| CommentedOutCode | 4 | false |
| CStyleArrayDeclaration | 4 | false |
| UnusedAssignment | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| SuspiciousMethodCalls | 4 | false |
| ConditionCoveredByFurtherCondition | 4 | false |
| RedundantCast | 4 | false |
| RedundantStringFormatCall | 3 | false |
| ConstantValue | 3 | false |
| UnnecessaryCallToStringValueOf | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| DanglingJavadoc | 3 | false |
| JavadocDeclaration | 3 | false |
| DuplicateCondition | 2 | false |
| KotlinUnusedImport | 2 | false |
| SlowAbstractSetRemoveAll | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| ReactiveStreamsPublisherImplementation | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| RedundantNullableReturnType | 2 | false |
| DialogTitleCapitalization | 2 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| TrivialStringConcatenation | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SlowListContainsAll | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| MismatchedStringCase | 1 | false |
| UnnecessarySemicolon | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ReactiveStreamsSubscriberImplementation | 1 | false |
| RegExpDuplicateAlternationBranch | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
| UnpredictableBigDecimalConstructorCall | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=LoopConditionNotUpdatedInsideLoop]
### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = directive(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = enumValueDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!enumValueDefinition(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = inputValueDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!inputValueDefinition(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = variableDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!variableDefinition(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = inputValueDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!inputValueDefinition(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = argument(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!argument(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = operationTypeDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!operationTypeDefinition(builder, level + 1)) break;
```

### LoopConditionNotUpdatedInsideLoop
Variable 'result' is not updated inside loop
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
    Marker marker = enter_section_(builder);
    result = selection(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!selection(builder, level + 1)) break;
```

## RuleId[id=CommentedOutCode]
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
  public void visitFragmentDefinition(@NotNull GraphQLFragmentDefinition o) {
    visitDefinition(o);
    // visitDirectivesAware(o);
    // visitNamedElement(o);
  }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_Z`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\14\100\1\300\u0100\100");

```

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
C-style array declaration of field `ZZ_CMAP_Y`
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\172\3\1\5\4\3");

```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `traverseLoop` on break statement
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                assertTrue(CONTINUE_OR_QUIT.contains(traversalControl), () -> "backRef can only return CONTINUE or QUIT");
                if (traversalControl == QUIT) {
                    break traverseLoop;
                }
            } else {
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

## RuleId[id=Deprecation]
### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/GraphQLSettings.java`
#### Snippet
```java

    public static GraphQLSettings getSettings(Project project) {
        return ServiceManager.getService(project, GraphQLSettings.class);
    }

```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/GraphQLPluginDisposable.java`
#### Snippet
```java
public final class GraphQLPluginDisposable implements Disposable {
    public static @NotNull Disposable getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLPluginDisposable.class);
    }

```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java

    public static GraphQLUIProjectService getService(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLUIProjectService.class);
    }

```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/search/GraphQLPsiSearchHelper.java`
#### Snippet
```java

    public static GraphQLPsiSearchHelper getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLPsiSearchHelper.class);
    }

```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/resolve/GraphQLReferenceService.java`
#### Snippet
```java

    public static GraphQLReferenceService getService(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLReferenceService.class);
    }

```

### Deprecation
'com.intellij.psi.PsiParserFacade.SERVICE' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/validation/fixes/GraphQLSuppressByCommentFix.java`
#### Snippet
```java
        PsiElement parent = container.getParent();
        PsiElement added = parent.addBefore(comment, container);
        parent.addAfter(PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText("\n"), added);
    }

```

### Deprecation
'extensions()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLInspectionSuppressor.java`
#### Snippet
```java
        }

        return GraphQLErrorFilter.EP_NAME.extensions()
            .anyMatch(filter -> filter.isInspectionSuppressed(element.getProject(), toolId, element));
    }
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextCaretListener.java`
#### Snippet
```java

    public static GraphQLQueryContextCaretListener getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLQueryContextCaretListener.class);
    }

```

### Deprecation
'extensions()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/validation/GraphQLSchemaAnnotator.java`
#### Snippet
```java
                                       @Nullable String message) {
        if (message == null) return;
        if (GraphQLErrorFilter.EP_NAME.extensions()
            .anyMatch(filter -> filter.isGraphQLErrorSuppressed(element.getProject(), error, element))) {
            return;
```

### Deprecation
'setListener(com.intellij.notification.@org.jetbrains.annotations.NotNull NotificationListener)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/highlighting/query/GraphQLQueryContextHighlightVisitor.java`
#### Snippet
```java
                            NotificationType.INFORMATION
                        );
                        notification.setListener((source, event) -> {
                            if (HIDE_LINK.equals(event.getDescription())) {
                                PropertiesComponent.getInstance(editor.getProject()).setValue(QUERY_SELECT_OPERATION_HINT_PREF_KEY, HIDE_LINK);
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/ide/introspection/GraphQLIntrospectionService.java`
#### Snippet
```java

    public static GraphQLIntrospectionService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLIntrospectionService.class);
    }

```

### Deprecation
'com.intellij.psi.PsiParserFacade.SERVICE' is deprecated
in `src/main/com/intellij/lang/jsgraphql/psi/GraphQLElementFactory.java`
#### Snippet
```java

    public static @NotNull PsiElement createWhiteSpace(@NotNull Project project, @NotNull String text) {
        return PsiParserFacade.SERVICE.getInstance(project).createWhiteSpaceFromText(text);
    }
}
```

### Deprecation
'dataFetcher(com.intellij.lang.jsgraphql.types.schema.DataFetcher)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
                        .name("input")
                        .type(nonNull(inputObjectType)))
                .dataFetcher(dataFetcher)
                .build();
    }
```

### Deprecation
'dataFetcher(com.intellij.lang.jsgraphql.types.schema.DataFetcher)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
                .description("Fetches an object given its ID")
                .type(nodeInterface)
                .dataFetcher(nodeDataFetcher)
                .argument(newArgument()
                        .name("id")
```

### Deprecation
'typeResolver(com.intellij.lang.jsgraphql.types.schema.TypeResolver)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/relay/Relay.java`
#### Snippet
```java
                .name(NODE)
                .description("An object with an ID")
                .typeResolver(typeResolver)
                .field(newFieldDefinition()
                        .name("id")
```

### Deprecation
'GraphQLBigDecimal' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
        } else if (scalarType.equals(Scalars.GraphQLID)) {
            return "id_" + fieldName;
        } else if (scalarType.equals(Scalars.GraphQLBigDecimal)) {
            return new BigDecimal(1.0);
        } else if (scalarType.equals(Scalars.GraphQLBigInteger)) {
```

### Deprecation
'GraphQLBigInteger' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
        } else if (scalarType.equals(Scalars.GraphQLBigDecimal)) {
            return new BigDecimal(1.0);
        } else if (scalarType.equals(Scalars.GraphQLBigInteger)) {
            return new BigInteger("1");
        } else if (scalarType.equals(Scalars.GraphQLByte)) {
```

### Deprecation
'GraphQLByte' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
        } else if (scalarType.equals(Scalars.GraphQLBigInteger)) {
            return new BigInteger("1");
        } else if (scalarType.equals(Scalars.GraphQLByte)) {
            return Byte.valueOf("1");
        } else if (scalarType.equals(Scalars.GraphQLShort)) {
```

### Deprecation
'GraphQLShort' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
        } else if (scalarType.equals(Scalars.GraphQLByte)) {
            return Byte.valueOf("1");
        } else if (scalarType.equals(Scalars.GraphQLShort)) {
            return Short.valueOf("1");
        } else {
```

### Deprecation
'GraphQLScalarType(java.lang.String, java.lang.String, com.intellij.lang.jsgraphql.types.schema.Coercing)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java

    public static GraphQLScalarType fakeScalar(String name) {
        return new GraphQLScalarType(name, name, new Coercing() {
            @Override
            public Object serialize(Object dataFetcherResult) {
```

### Deprecation
'getDirective(java.lang.String)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/execution/directives/DirectivesResolver.java`
#### Snippet
```java
        Map<String, GraphQLDirective> directiveMap = new LinkedHashMap<>();
        directives.forEach(directive -> {
            GraphQLDirective protoType = schema.getDirective(directive.getName());
            if (protoType != null) {
                GraphQLDirective newDirective = protoType.transform(builder -> buildArguments(builder, codeRegistry, protoType, directive, variables));
```

### Deprecation
'getFieldVisibility()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
        }
        if (parentType instanceof GraphQLFieldsContainer) {
            return schema.getFieldVisibility().getFieldDefinition((GraphQLFieldsContainer) parentType, field.getName());
        }
        return null;
```

### Deprecation
'getFieldVisibility()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/validation/TraversalContext.java`
#### Snippet
```java
        if (objectType instanceof GraphQLInputObjectType) {
            GraphQLInputObjectType inputObjectType = (GraphQLInputObjectType) objectType;
            GraphQLInputObjectField inputField = schema.getFieldVisibility().getFieldDefinition(inputObjectType, objectField.getName());
            if (inputField != null)
                inputType = inputField.getType();
```

### Deprecation
'getFieldVisibility()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            GraphqlFieldVisibility fieldVisibility = environment
                    .getGraphQLSchema()
                    .getFieldVisibility();
            return fieldVisibility.getFieldDefinitions((GraphQLInputObjectType) type);
        }
```

### Deprecation
'getFieldVisibility()' is deprecated
in `src/main/com/intellij/lang/jsgraphql/types/introspection/Introspection.java`
#### Snippet
```java
            List<GraphQLFieldDefinition> fieldDefinitions = environment
                    .getGraphQLSchema()
                    .getFieldVisibility()
                    .getFieldDefinitions(fieldsContainer);
            if (includeDeprecated) {
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/schema/library/GraphQLLibraryManager.java`
#### Snippet
```java

    public static GraphQLLibraryManager getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, GraphQLLibraryManager.class);
    }

```

### Deprecation
'makeRootsChange(java.lang.@org.jetbrains.annotations.NotNull Runnable, boolean, boolean)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/schema/library/GraphQLLibraryManager.java`
#### Snippet
```java
                        myKnownLibraryRoots.drop();
                        PsiManager.getInstance(myProject).dropPsiCaches();
                        ProjectRootManagerEx.getInstanceEx(myProject).makeRootsChange(EmptyRunnable.getInstance(), false, true);
                        DaemonCodeAnalyzer.getInstance(myProject).restart();
                        EditorNotifications.getInstance(myProject).updateAllNotifications();
```

### Deprecation
'nonBlocking(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/frameworks/relay/GraphQLRelayModernEnableStartupActivity.java`
#### Snippet
```java
    @Override
    public void runActivity(@NotNull Project project) {
        ReadAction.nonBlocking(() -> {
            final GraphQLSettings settings = GraphQLSettings.getSettings(project);
            if (isDisplayed.get() || settings.isRelaySupportEnabled()) {
```

### Deprecation
'getVirtualFilesByName(com.intellij.openapi.project.Project, java.lang.@org.jetbrains.annotations.NotNull String, boolean, com.intellij.psi.search.@org.jetbrains.annotations.NotNull GlobalSearchScope)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/frameworks/relay/GraphQLRelayModernEnableStartupActivity.java`
#### Snippet
```java
            try {
                final GlobalSearchScope scope = GlobalSearchScope.projectScope(project);
                for (VirtualFile virtualFile : FilenameIndex.getVirtualFilesByName(project, "package.json", true, scope)) {
                    ProgressManager.checkCanceled();
                    if (!virtualFile.isDirectory() && virtualFile.isInLocalFileSystem()) {
```

### Deprecation
'Notification(java.lang.@org.jetbrains.annotations.NotNull String, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.NotificationTitle String, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.NotificationContent String, com.intellij.notification.@org.jetbrains.annotations.NotNull NotificationType, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `src/main/com/intellij/lang/jsgraphql/frameworks/relay/GraphQLRelayModernEnableStartupActivity.java`
#### Snippet
```java
                            final String packageJson = IOUtils.toString(inputStream, virtualFile.getCharset());
                            if (packageJson.contains("\"react-relay\"") || packageJson.contains("\"relay-compiler\"")) {
                                final Notification enableRelayModern = new Notification(
                                    GraphQLNotificationUtil.GRAPHQL_NOTIFICATION_GROUP_ID,
                                    "Relay Modern project detected",
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
public class GraphQLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
public class GraphQLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gen/com/intellij/lang/jsgraphql/GraphQLParser.java`
#### Snippet
```java
public class GraphQLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/com/intellij/lang/jsgraphql/ide/editor/GraphQLFoldingBuilder.java`
#### Snippet
```java
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        List<FoldingDescriptor> list = new ArrayList<>();
        buildFolding(node, list);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/com/intellij/lang/jsgraphql/ide/editor/GraphQLBraceMatcher.java`
#### Snippet
```java
public class GraphQLBraceMatcher implements PairedBraceMatcher {
  @Override
  public BracePair[] getPairs() {
    return new BracePair[]{
        new BracePair(GraphQLElementTypes.PAREN_L, GraphQLElementTypes.PAREN_R, true),
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/com/intellij/lang/jsgraphql/ide/resolve/GraphQLCachingReference.java`
#### Snippet
```java
    @NotNull
    @Override
    public Object[] getVariants() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/com/intellij/lang/jsgraphql/ide/formatter/GraphQLLanguageCodeStyleSettingsProvider.java`
#### Snippet
```java

        @Override
        protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
            return new GraphQLCodeStylePanel(getCurrentSettings(), settings);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/com/intellij/lang/jsgraphql/ide/formatter/GraphQLLanguageCodeStyleSettingsProvider.java`
#### Snippet
```java

        @Override
        protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
            return new GraphQLCodeStylePanel(getCurrentSettings(), settings);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/com/intellij/lang/jsgraphql/ide/completion/AddColonSpaceInsertHandler.java`
#### Snippet
```java
  }

  public void handleInsert(InsertionContext context, LookupElement item) {
    Editor editor = context.getEditor();
    char completionChar = context.getCompletionChar();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java

    @Override
    public void execute(final Runnable command) {
        final RunNode newNode = new RunNode(assertNotNull(command, () -> "Runnable must not be null"));
        final RunNode prevLast = last.getAndSet(newNode);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/GraphQLError.java`
#### Snippet
```java
    /**
     * The graphql spec says that the (optional) path field of any error should be a list
     * of path entries - http://facebook.github.io/graphql/#sec-Errors
     *
     * @return the path in list format
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java

    /**
     * This represents the "Float" type as defined in the graphql specification : http://facebook.github.io/graphql/#sec-Float
     * <p>
     * Note: The Float type in GraphQL is equivalent to Double in Java. (double precision IEEE 754)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java

    /**
     * This represents the "String" type as defined in the graphql specification : http://facebook.github.io/graphql/#sec-String
     */
    public static final GraphQLScalarType GraphQLString = GraphQLScalarType.newScalar()
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java

    /**
     * This represents the "Int" type as defined in the graphql specification : http://facebook.github.io/graphql/#sec-Int
     * <p>
     * The Int scalar type represents a signed 32‐bit numeric non‐fractional value.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
 * Java platforms.
 * <p>
 * For more info see http://graphql.org/learn/schema/#scalar-types and more specifically http://facebook.github.io/graphql/#sec-Scalars
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java
 * Java platforms.
 * <p>
 * For more info see http://graphql.org/learn/schema/#scalar-types and more specifically http://facebook.github.io/graphql/#sec-Scalars
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java

    /**
     * This represents the "Boolean" type as defined in the graphql specification : http://facebook.github.io/graphql/#sec-Boolean
     */
    public static final GraphQLScalarType GraphQLBoolean = GraphQLScalarType.newScalar()
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Scalars.java`
#### Snippet
```java

    /**
     * This represents the "ID" type as defined in the graphql specification : http://facebook.github.io/graphql/#sec-ID
     * <p>
     * The ID scalar type represents a unique identifier, often used to re-fetch an object or as the key for a cache. The
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorException.java`
#### Snippet
```java
 * in a general sense direct or have specialisations made of it.
 * <p>
 * This is aimed amongst other reasons at Kotlin consumers due to https://github.com/graphql-java/graphql-java/issues/1690
 * as well as being a way to share common code.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/Directives.java`
#### Snippet
```java
     * The "deprecated" directive is special and is always available in a graphql schema
     * <p>
     * See https://graphql.github.io/graphql-spec/June2018/#sec--deprecated
     */
    public static final GraphQLDirective DeprecatedDirective = GraphQLDirective.newDirective()
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/util/EscapeUtil.java`
#### Snippet
```java

    /**
     * Encodes the value as a JSON string according to http://json.org/ rules
     *
     * @param stringValue the value to encode as a JSON string
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/Coercing.java`
#### Snippet
```java
 * parse an ISO date time object or throw an exception if it cant.
 *
 * See http://facebook.github.io/graphql/#sec-Scalars
 */
@PublicSpi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumValueDefinition.java`
#### Snippet
```java
 * A graphql enumeration type has a limited set of values and this defines one of those unique values
 * <p>
 * See http://graphql.org/learn/schema/#enumeration-types for more details
 *
 * @see com.intellij.lang.jsgraphql.types.schema.GraphQLEnumType
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
 * Fields can be thought of as "functions" that take arguments and return a value.
 * <p>
 * See http://graphql.org/learn/queries/#arguments for more details on the concept.
 * <p>
 * {@link com.intellij.lang.jsgraphql.types.schema.GraphQLArgument} is used in two contexts, one context is graphql queries where it represents the arguments that can be
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLList.java`
#### Snippet
```java
 * A modified type that indicates there is a list of the underlying wrapped type, eg a list of strings or a list of booleans.
 *
 * See http://graphql.org/learn/schema/#lists-and-non-null for more details on the concept
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLNonNull.java`
#### Snippet
```java
 * A modified type that indicates there the underlying wrapped type will not be null.
 * <p>
 * See http://graphql.org/learn/schema/#lists-and-non-null for more details on the concept
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLEnumType.java`
#### Snippet
```java
 * and communicate through the type system that a field will always be one of a finite set of values.
 * <p>
 * See http://graphql.org/learn/schema/#enumeration-types for more details
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLUnionType.java`
#### Snippet
```java
 * Note that members of a union type need to be concrete object types; you can't create a union type out of interfaces or other unions.
 * <p>
 * See http://graphql.org/learn/schema/#union-types for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLScalarType.java`
#### Snippet
```java
 * conform to ISO‐8601. When querying a field of type Time, you can then rely on the ability to parse the result with an ISO‐8601 parser and use a client‐specific primitive for time.
 * <p>
 * From the spec : http://facebook.github.io/graphql/#sec-Scalars
 * </blockquote>
 * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java
 * is to describe values that are fed into a graphql mutation.
 *
 * See http://graphql.org/learn/schema/#input-types for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLDirective.java`
#### Snippet
```java
 * A directive can be used to modify the behavior of a graphql field or type.
 * <p>
 * See http://graphql.org/learn/queries/#directives for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInterfaceType.java`
#### Snippet
```java
 * represents this interface type.
 * <p>
 * See http://graphql.org/learn/schema/#interfaces for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLFieldDefinition.java`
#### Snippet
```java
 * Fields can also be deprecated, which indicates the consumers that a field wont be supported in the future.
 * <p>
 * See http://graphql.org/learn/queries/#fields for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
 * what graphql queries represent what data.
 * <p>
 * See http://graphql.org/learn/schema/#type-language for more details
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/UnionTypesChecker.java`
#### Snippet
```java

/**
 * UnionType check, details in https://spec.graphql.org/June2018/#sec-Type-System.
 * <pre>
 *     <ur>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLObjectType.java`
#### Snippet
```java
 * by {@link com.intellij.lang.jsgraphql.types.schema.GraphQLScalarType}s.
 * <p>
 * See http://graphql.org/learn/schema/#object-types-and-fields for more details on the concept.
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectType.java`
#### Snippet
```java
 * can be fed into a graphql mutation.  You can define objects as input to graphql via this class
 * <p>
 * See http://graphql.org/learn/schema/#input-types for more details on the concept
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/visibility/NoIntrospectionGraphqlFieldVisibility.java`
#### Snippet
```java
/**
 * This field visibility will prevent Introspection queries from being performed.  Technically this puts your
 * system in contravention of the specification - http://facebook.github.io/graphql/#sec-Introspection but some
 * production systems want this lock down in place.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
 *     </ul>
 * <p>
 * details in https://spec.graphql.org/June2018/#sec-Type-System
 */
public class TypeAndFieldRule implements SchemaValidationRule {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldWasNullException.java`
#### Snippet
```java

/**
 * See (http://facebook.github.io/graphql/#sec-Errors-and-Non-Nullability), but if a non nullable field
 * actually resolves to a null value and the parent type is nullable then the parent must in fact become null
 * so we use exceptions to indicate this special case
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/NonNullableFieldValidator.java`
#### Snippet
```java
 * if this is not the case.
 *
 * See: http://facebook.github.io/graphql/#sec-Errors-and-Non-Nullability
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/InputMapDefinesTooManyFieldsException.java`
#### Snippet
```java

/**
 * https://facebook.github.io/graphql/#sec-Input-Objects
 *
 * - This unordered map should not contain any entries with names not defined by a field of this input object type, otherwise an error should be thrown.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStrategy.java`
#### Snippet
```java

    /**
     * See (http://facebook.github.io/graphql/#sec-Errors-and-Non-Nullability),
     * <p>
     * If a non nullable child field type actually resolves to a null value and the parent type is nullable
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/SubscriptionExecutionStrategy.java`
#### Snippet
```java
 * just like a normal graphql query.
 * <p>
 * See https://github.com/facebook/graphql/blob/master/spec/Section%206%20--%20Execution.md
 * See http://www.reactive-streams.org/
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/SubscriptionExecutionStrategy.java`
#### Snippet
```java
 * <p>
 * See https://github.com/facebook/graphql/blob/master/spec/Section%206%20--%20Execution.md
 * See http://www.reactive-streams.org/
 */
@PublicApi
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java
 *
 * Inspired by Public Domain CC0 code at
 * https://github.com/jroper/reactive-streams-servlet/tree/master/reactive-streams-servlet/src/main/java/org/reactivestreams/servlet
 *
 * @param <T> the things to publish
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/NonBlockingMutexExecutor.java`
#### Snippet
```java
 *
 * Inspired by Public Domain CC0 code at h
 * https://github.com/jroper/reactive-streams-servlet/tree/master/reactive-streams-servlet/src/main/java/org/reactivestreams/servlet
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/tracing/TracingSupport.java`
#### Snippet
```java

/**
 * This creates a map of tracing information as outlined in https://github.com/apollographql/apollo-tracing
 * <p>
 * This is a stateful object that should be instantiated and called via {@link java.lang.instrument.Instrumentation}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueOperationNames.java`
#### Snippet
```java
/**
 * A GraphQL document is only valid if all defined operations have unique names.
 * http://facebook.github.io/graphql/October2016/#sec-Operation-Name-Uniqueness
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java

/**
 * See http://facebook.github.io/graphql/June2018/#sec-Field-Selection-Merging
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueDirectiveNamesPerLocation.java`
#### Snippet
```java

/**
 * https://facebook.github.io/graphql/June2018/#sec-Directives-Are-Unique-Per-Location
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/com/intellij/lang/jsgraphql/types/cachecontrol/CacheControl.java`
#### Snippet
```java

/**
 * This class implements the graphql Cache Control specification as outlined in https://github.com/apollographql/apollo-cache-control
 * <p>
 * To best use this class you need to pass a CacheControl object to each {@link com.intellij.lang.jsgraphql.types.schema.DataFetcher} and have them decide on
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/GraphQLSettings.java`
#### Snippet
```java
public class GraphQLSettings implements PersistentStateComponent<GraphQLSettings.GraphQLSettingsState> {

    private final Project myProject;

    private final SimpleModificationTracker myModificationTracker = new SimpleModificationTracker();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/types/GraphQL.java`
#### Snippet
```java
    private final Instrumentation instrumentation;
    private final PreparsedDocumentProvider preparsedDocumentProvider;
    private final ValueUnboxer valueUnboxer;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaPrinter.java`
#### Snippet
```java


    private final @Nullable Project project;
    private final @Nullable CommonCodeStyleSettings.IndentOptions indentOptions;
    private final Options options;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
public class TypeAndFieldRule implements SchemaValidationRule {

    private Map<String, GraphQLNamedType> schemaTypeHolder;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java
    private static class TypeVisibilityVisitor extends GraphQLTypeVisitorStub {

        private final Set<String> protectedTypeNames;
        private final Set<GraphQLType> observedBeforeTransform;
        private final Set<GraphQLType> observedAfterTransform;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/com/intellij/lang/jsgraphql/types/nextgen/GraphQL.java`
#### Snippet
```java
    private final ExecutionIdProvider idProvider;
    private final Instrumentation instrumentation;
    private final PreparsedDocumentProvider preparsedDocumentProvider;

    public GraphQL(Builder builder) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `fileClosed()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java

    @Override
    public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
    }

```

### RedundantMethodOverride
Method `getRangeAffectingIndent()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/ide/formatter/GraphQLFormattingModelBuilder.java`
#### Snippet
```java
    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
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
Method `getRangeAffectingIndent()` is identical to its super method
in `src/main/com/intellij/lang/jsgraphql/javascript/formatter/GraphQLJavaScriptInjectedFormattingModelBuilder.java`
#### Snippet
```java
    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
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

## RuleId[id=NonExtendableApiUsage]
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
    private List<PsiLanguageInjectionHost.Shred> mergePlacesIntoOne(List<PsiLanguageInjectionHost.Shred> places) {

        final PsiLanguageInjectionHost.Shred mergedShred = new PsiLanguageInjectionHost.Shred() {

            private PsiLanguageInjectionHost.Shred getFirst() {
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
Function 'addExtensionDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun addExtensionDefinition(definition: SDLDefinition<*>) {
        LOG.assertTrue(GraphQLTypeDefinitionUtil.isExtension(definition))

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
Function 'addDefinition' could be private
in `src/main/com/intellij/lang/jsgraphql/schema/builder/GraphQLCompositeRegistry.kt`
#### Snippet
```java
    }

    fun addDefinition(definition: SDLDefinition<*>) {
        if (GraphQLTypeDefinitionUtil.isExtension(definition)) {
            addExtensionDefinition(definition)
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

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
                newZippers.add(newZipper);
            }
            curZippers.removeAll(deepestZippers);
            curZippers.addAll(newZippers);
        }
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/com/intellij/lang/jsgraphql/types/validation/RulesVisitor.java`
#### Snippet
```java

        if (rulesToSkipByUntilNode.containsKey(node)) {
            rulesToSkip.removeAll(rulesToSkipByUntilNode.get(node));
            rulesToSkipByUntilNode.remove(node);
        }
```

## RuleId[id=RedundantStringFormatCall]
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

## RuleId[id=UnusedAssignment]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'ComboBox(ComboBoxModel)' as a member of raw type 'com.intellij.openapi.ui.ComboBox'
in `src/main/com/intellij/lang/jsgraphql/ui/GraphQLUIProjectService.java`
#### Snippet
```java

        final GraphQLEndpointsModel endpointsModel = new GraphQLEndpointsModel(endpoints, PropertiesComponent.getInstance(myProject));
        final ComboBox<?> endpointComboBox = new ComboBox(endpointsModel);
        endpointComboBox.setToolTipText("GraphQL endpoint");
        editor.putUserData(GRAPH_QL_ENDPOINTS_MODEL, endpointsModel);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java

    public <T> T getContext() {
        return (T) context;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
        public void compute() {
            currentContext.setPhase(TraverserContext.Phase.ENTER);
            TraversalControl traversalControl = visitor.enter(currentContext);
            assertNotNull(traversalControl, () -> "result of enter must not be null");
            assertTrue(QUIT != traversalControl, () -> "can't return QUIT for parallel traversing");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
            }
            assertTrue(traversalControl == CONTINUE);
            List<DefaultTraverserContext> children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
            }
            assertTrue(traversalControl == CONTINUE);
            List<DefaultTraverserContext> children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
```

### UNCHECKED_WARNING
Unchecked call to 'CountedCompleter(CountedCompleter)' as a member of raw type 'java.util.concurrent.CountedCompleter'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java

        private EnterAction(CountedCompleter parent, DefaultTraverserContext currentContext, TraverserVisitor<? super T> visitor) {
            super(parent);
            this.currentContext = currentContext;
            this.visitor = visitor;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'new NodeZipper\<\>(context.originalThisNode(), context.getBreadcrumbs(), adaper)' has raw type, so result of insertAfter is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertAfter(toInsertAfter);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'insertAfter(T)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertAfter(toInsertAfter);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'NodeZipper(T, List\>, NodeAdapter)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertAfter(toInsertAfter);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'context.getVar(NodeZipper.class)' has raw type, so result of insertAfter is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> insertNodeZipper = context.getVar(NodeZipper.class).insertAfter(toInsertAfter);
            Queue<NodeZipper<T>> zippers = context.getSharedContextData();
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'insertAfter(T)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> insertNodeZipper = context.getVar(NodeZipper.class).insertAfter(toInsertAfter);
            Queue<NodeZipper<T>> zippers = context.getSharedContextData();
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'new NodeZipper\<\>(context.originalThisNode(), context.getBreadcrumbs(), adaper)' has raw type, so result of insertBefore is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertBefore(toInsertBefore);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'insertBefore(T)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertBefore(toInsertBefore);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'NodeZipper(T, List\>, NodeAdapter)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> insertNodeZipper = new NodeZipper<>(context.originalThisNode(), context.getBreadcrumbs(), adaper).insertBefore(toInsertBefore);
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'context.getVar(NodeZipper.class)' has raw type, so result of insertBefore is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> insertNodeZipper = context.getVar(NodeZipper.class).insertBefore(toInsertBefore);
            Queue<NodeZipper<T>> zippers = context.getSharedContextData();
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'insertBefore(T)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> insertNodeZipper = context.getVar(NodeZipper.class).insertBefore(toInsertBefore);
            Queue<NodeZipper<T>> zippers = context.getSharedContextData();
            zippers.add(insertNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'new NodeZipper\<\>(context.thisNode(), context.getBreadcrumbs(), adaper)' has raw type, so result of deleteNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> deleteNodeZipper = new NodeZipper<>(context.thisNode(), context.getBreadcrumbs(), adaper).deleteNode();
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(deleteNodeZipper);
```

### UNCHECKED_WARNING
Unchecked call to 'NodeZipper(T, List\>, NodeAdapter)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
        if (context.isParallel()) {
            NodeAdapter adaper = context.getVar(NodeAdapter.class);
            NodeZipper<T> deleteNodeZipper = new NodeZipper<>(context.thisNode(), context.getBreadcrumbs(), adaper).deleteNode();
            List<NodeZipper<T>> zippers = context.getVar(List.class);
            zippers.add(deleteNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'context.getVar(NodeZipper.class)' has raw type, so result of deleteNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> deleteNodeZipper = context.getVar(NodeZipper.class).deleteNode();
            Queue<NodeZipper<T>> zippers = context.getSharedContextData();
            zippers.add(deleteNodeZipper);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
                context.changeNode(changedNode);
            } else {
                NodeZipper<T> nodeZipper = new NodeZipper<>(changedNode, context.getBreadcrumbs(), adaper);
                zippers.add(nodeZipper);
                context.changeNode(changedNode);
```

### UNCHECKED_WARNING
Unchecked call to 'NodeZipper(T, List\>, NodeAdapter)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
                context.changeNode(changedNode);
            } else {
                NodeZipper<T> nodeZipper = new NodeZipper<>(changedNode, context.getBreadcrumbs(), adaper);
                zippers.add(nodeZipper);
                context.changeNode(changedNode);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'. Reason: 'context.getVar(NodeZipper.class)' has raw type, so result of withNewNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> zipperWithChangedNode = context.getVar(NodeZipper.class).withNewNode(changedNode);
            List<NodeZipper<T>> zippers = context.getSharedContextData();
            if (changed) {
```

### UNCHECKED_WARNING
Unchecked call to 'withNewNode(T)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeTransformerUtil.java`
#### Snippet
```java
            return TraversalControl.CONTINUE;
        } else {
            NodeZipper<T> zipperWithChangedNode = context.getVar(NodeZipper.class).withNewNode(changedNode);
            List<NodeZipper<T>> zippers = context.getSharedContextData();
            if (changed) {
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.lang.Object', required 'U'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java

    @Override
    public Object getSharedContextData() {
        return sharedContextData;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'S'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
    @Override
    public <S> S getVar(Class<? super S> key) {
        return (S) key.cast(vars.get(key));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'U'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
    public <U> U getNewAccumulate() {
        if (hasNewAccValue) {
            return (U) newAccValue;
        } else {
            return (U) curAccValue;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'U'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
            return (U) newAccValue;
        } else {
            return (U) curAccValue;
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'U'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
    @Override
    public <U> U getCurrentAccumulate() {
        return (U) curAccValue;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'com.intellij.lang.jsgraphql.types.util.TraverserState.EndList'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java

            if (top instanceof TraverserState.EndList) {
                Map<String, List<TraverserContext<T>>> childrenContextMap = ((TraverserState.EndList<T>) top).childrenContextMap;
                // end-of-list marker, we are done recursing children,
                // mark the current node as fully visited
```

### UNCHECKED_WARNING
Unchecked call to 'setChildrenContexts(Map\>\>)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                currentContext = (DefaultTraverserContext) traverserState.pop();
                currentContext.setCurAccValue(currentAccValue);
                currentContext.setChildrenContexts(childrenContextMap);
                currentContext.setPhase(TraverserContext.Phase.LEAVE);
                TraversalControl traversalControl = visitor.leave(currentContext);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                currentContext.setChildrenContexts(childrenContextMap);
                currentContext.setPhase(TraverserContext.Phase.LEAVE);
                TraversalControl traversalControl = visitor.leave(currentContext);
                currentAccValue = currentContext.getNewAccumulate();
                assertNotNull(traversalControl, () -> "result of leave must not be null");
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                currentContext.setCurAccValue(currentAccValue);
                currentContext.setPhase(TraverserContext.Phase.BACKREF);
                TraversalControl traversalControl = visitor.backRef(currentContext);
                currentAccValue = currentContext.getNewAccumulate();
                assertNotNull(traversalControl, () -> "result of backRef must not be null");
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                Object nodeBeforeEnter = currentContext.thisNode();
                currentContext.setPhase(TraverserContext.Phase.ENTER);
                TraversalControl traversalControl = visitor.enter(currentContext);
                currentAccValue = currentContext.getNewAccumulate();
                assertNotNull(traversalControl, () -> "result of enter must not be null");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                currentAccValue = currentContext.getNewAccumulate();
                assertNotNull(traversalControl, () -> "result of enter must not be null");
                this.traverserState.addVisited((T) nodeBeforeEnter);
                switch (traversalControl) {
                    case QUIT:
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/Traverser.java`
#### Snippet
```java
                        continue;
                    case CONTINUE:
                        traverserState.pushAll(currentContext, getChildren);
                        continue;
                    default:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        DefaultTraverserContext context = newContext(root, rootContext, null);
        EnterAction enterAction = new EnterAction(null, context, visitor);
        T result = (T) forkJoinPool.invoke(enterAction);
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.TreeParallelTransformer.EnterAction' to 'java.util.concurrent.ForkJoinTask'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        DefaultTraverserContext context = newContext(root, rootContext, null);
        EnterAction enterAction = new EnterAction(null, context, visitor);
        T result = (T) forkJoinPool.invoke(enterAction);
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection\>'. Reason: 'childContext' has raw type, so result of getVar is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            List<NodeZipper<T>> childZippers = new LinkedList<>();
            for (DefaultTraverserContext childContext : this.children) {
                childZippers.addAll((Collection<? extends NodeZipper<T>>) childContext.getVar(List.class));
            }
            if (childZippers.size() > 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'getVar(Class)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            List<NodeZipper<T>> childZippers = new LinkedList<>();
            for (DefaultTraverserContext childContext : this.children) {
                childZippers.addAll((Collection<? extends NodeZipper<T>>) childContext.getVar(List.class));
            }
            if (childZippers.size() > 0) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'currentContext' has raw type, so result of thisNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            }
            if (childZippers.size() > 0) {
                NodeZipper<T> newNode = moveUp((T) currentContext.thisNode(), childZippers);
                myZippers.add(newNode);
                this.result = (T) newNode.getCurNode();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.NodeZipper' to 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                this.result = (T) newNode.getCurNode();
            } else if (currentContext.isChanged()) {
                NodeZipper<T> newNode = new NodeZipper(currentContext.thisNode(), currentContext.getBreadcrumbs(), nodeAdapter);
                myZippers.add(newNode);
                this.result = (T) currentContext.thisNode();
```

### UNCHECKED_WARNING
Unchecked call to 'NodeZipper(T, List\>, NodeAdapter)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.NodeZipper'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                this.result = (T) newNode.getCurNode();
            } else if (currentContext.isChanged()) {
                NodeZipper<T> newNode = new NodeZipper(currentContext.thisNode(), currentContext.getBreadcrumbs(), nodeAdapter);
                myZippers.add(newNode);
                this.result = (T) currentContext.thisNode();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'currentContext' has raw type, so result of thisNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                NodeZipper<T> newNode = new NodeZipper(currentContext.thisNode(), currentContext.getBreadcrumbs(), nodeAdapter);
                myZippers.add(newNode);
                this.result = (T) currentContext.thisNode();
            } else {
                this.result = (T) currentContext.thisNode();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'currentContext' has raw type, so result of thisNode is erased
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                this.result = (T) currentContext.thisNode();
            } else {
                this.result = (T) currentContext.thisNode();
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'setVar(Class, S)' as a member of raw type 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        public void compute() {
            currentContext.setPhase(TraverserContext.Phase.ENTER);
            currentContext.setVar(List.class, myZippers);
            TraversalControl traversalControl = visitor.enter(currentContext);
            assertNotNull(traversalControl, () -> "result of enter must not be null");
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            currentContext.setPhase(TraverserContext.Phase.ENTER);
            currentContext.setVar(List.class, myZippers);
            TraversalControl traversalControl = visitor.enter(currentContext);
            assertNotNull(traversalControl, () -> "result of enter must not be null");
            assertTrue(QUIT != traversalControl, () -> "can't return QUIT for parallel traversing");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            assertTrue(traversalControl == CONTINUE);

            this.children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.DefaultTraverserContext' to 'com.intellij.lang.jsgraphql.types.util.TraverserContext'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            assertTrue(traversalControl == CONTINUE);

            this.children = pushAll(currentContext);
            if (children.size() == 0) {
                tryComplete();
```

### UNCHECKED_WARNING
Unchecked call to 'CountedCompleter(CountedCompleter)' as a member of raw type 'java.util.concurrent.CountedCompleter'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java

        private EnterAction(CountedCompleter parent, DefaultTraverserContext currentContext, TraverserVisitor<? super T> visitor) {
            super(parent);
            this.currentContext = currentContext;
            this.visitor = visitor;
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'com.intellij.lang.jsgraphql.types.schema.GraphQLInputType', required 'T'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLArgument.java`
#### Snippet
```java
    }

    public GraphQLInputType getType() {
        return replacedType != null ? replacedType : originalType;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java

    public <T extends GraphQLSchemaElement> List<T> getChildren(String key) {
        return (List<T>) children.getOrDefault(key, emptyList());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>\>' to 'java.util.Map\>'
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaElementChildrenContainer.java`
#### Snippet
```java
        public Builder children(Map<String, ? extends Collection<? extends GraphQLSchemaElement>> children) {
            this.children.clear();
            this.children.putAll((Map<? extends String, ? extends List<GraphQLSchemaElement>>) children);
            return this;
        }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'com.intellij.lang.jsgraphql.types.schema.GraphQLInputType', required 'T'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLInputObjectField.java`
#### Snippet
```java
    }

    public GraphQLInputType getType() {
        return replacedType != null ? replacedType : originalType;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'implementingType' has raw type, so result of getFieldDefinitions is erased
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
        return Stream.concat(Stream.of(type), extensions)
                .flatMap(implementingType -> {
                    List<FieldDefinition> fieldDefinitions = implementingType.getFieldDefinitions();
                    return fieldDefinitions.stream();
                })
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'implementingType' has raw type, so result of getImplements is erased
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
        return Stream.concat(Stream.of(type), extensions)
                .collect(HashMap::new, (map, implementingType) -> {
                    List<Type> implementedInterfaces = implementingType.getImplements();

                    toInterfaceTypeDefinitions(typeRegistry, implementedInterfaces).forEach(implemented -> {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'typeDefinition' has raw type, so result of getImplements is erased
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/TypeDefinitionRegistry.java`
#### Snippet
```java
        List<ImplementingTypeDefinition> typeDefinitions = getTypes(ImplementingTypeDefinition.class);
        return typeDefinitions.stream().filter(typeDefinition -> {
            List<Type> implementsList = typeDefinition.getImplements();
            for (Type iFace : implementsList) {
                Optional<InterfaceTypeDefinition> interfaceTypeDef = getType(iFace, InterfaceTypeDefinition.class);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'oldDef' has raw type, so result of getDirectives is erased
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java

    private void checkDirectives(DiffCtx ctx, TypeDefinition oldDef, TypeDefinition newDef) {
        List<Directive> oldDirectives = oldDef.getDirectives();
        List<Directive> newDirectives = newDef.getDirectives();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'newDef' has raw type, so result of getDirectives is erased
in `src/main/com/intellij/lang/jsgraphql/types/schema/diff/SchemaDiff.java`
#### Snippet
```java
    private void checkDirectives(DiffCtx ctx, TypeDefinition oldDef, TypeDefinition newDef) {
        List<Directive> oldDirectives = oldDef.getDirectives();
        List<Directive> newDirectives = newDef.getDirectives();

        checkDirectives(ctx, oldDef, oldDirectives, newDirectives);
```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTransformer.java`
#### Snippet
```java
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'node1' has raw type, so result of getChildren is erased
in `src/main/com/intellij/lang/jsgraphql/types/language/AstComparator.java`
#### Snippet
```java
        if (null == node1) return null == node2;
        if (!node1.isEqualTo(node2)) return false;
        List<Node> childs1 = node1.getChildren();
        List<Node> childs2 = node2.getChildren();
        if (childs1.size() != childs2.size()) return false;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'node2' has raw type, so result of getChildren is erased
in `src/main/com/intellij/lang/jsgraphql/types/language/AstComparator.java`
#### Snippet
```java
        if (!node1.isEqualTo(node2)) return false;
        List<Node> childs1 = node1.getChildren();
        List<Node> childs2 = node2.getChildren();
        if (childs1.size() != childs2.size()) return false;
        for (int i = 0; i < childs1.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/AstTransformer.java`
#### Snippet
```java
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/AstTransformer.java`
#### Snippet
```java
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
            throw new IllegalStateException("children " + key + " is not a single value");
        }
        return result.size() > 0 ? (T) result.get(0) : null;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java

    public <T extends Node> List<T> getChildren(String key) {
        return (List<T>) children.getOrDefault(key, emptyList());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>\>' to 'java.util.Map\>'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeChildrenContainer.java`
#### Snippet
```java
        public Builder children(Map<String, ? extends List<? extends Node>> children) {
            this.children.clear();
            this.children.putAll((Map<? extends String, ? extends List<Node>>) children);
            return this;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
    public static <T> T oneVisitWithResult(Node node, NodeVisitor nodeVisitor) {
        DefaultTraverserContext<Node> context = DefaultTraverserContext.simple(node);
        node.accept(context, nodeVisitor);
        return (T) context.getNewAccumulate();
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
        DefaultTraverserContext<Node> context = DefaultTraverserContext.simple(node);
        node.accept(context, nodeVisitor);
        return (T) context.getNewAccumulate();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.lang.jsgraphql.types.util.TraverserVisitor' to 'com.intellij.lang.jsgraphql.types.util.TraverserVisitor'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
        Traverser<Node> nodeTraverser = Traverser.depthFirst(this.getChildren);
        nodeTraverser.rootVars(rootVars);
        return nodeTraverser.traverse(roots, traverserVisitor).getAccumulatedResult();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
            @Override
            public TraversalControl leave(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
            @Override
            public TraversalControl leave(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }
        };
```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked call to 'accept(TraverserContext, NodeVisitor)' as a member of raw type 'com.intellij.lang.jsgraphql.types.language.Node'
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

```

### UNCHECKED_WARNING
Unchecked call to 'parseLiteral(Object, Map)' as a member of raw type 'com.intellij.lang.jsgraphql.types.schema.Coercing'
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
    private Object parseLiteral(Value inputValue, Coercing coercing, Map<String, Object> variables) {
        // the CoercingParseLiteralException exception that could happen here has been validated earlier via ValidationUtil
        return coercing.parseLiteral(inputValue, variables);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'orElse(T)' as a member of raw type 'java.util.Optional'
in `src/main/com/intellij/lang/jsgraphql/types/execution/DefaultValueUnboxer.java`
#### Snippet
```java
        if (result instanceof Optional) {
            Optional optional = (Optional) result;
            return optional.orElse(null);
        } else if (result instanceof OptionalInt) {
            OptionalInt optional = (OptionalInt) result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `src/main/com/intellij/lang/jsgraphql/types/normalized/FieldCollectorNormalizedQuery.java`
#### Snippet
```java
        } else if (type instanceof GraphQLUnionType) {
            List types = ((GraphQLUnionType) type).getTypes();
            return new ArrayList<GraphQLObjectType>(types);
        } else {
            return Assert.assertShouldNeverHappen();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ParseAndValidate`
in `src/main/com/intellij/lang/jsgraphql/types/ParseAndValidateResult.java`
#### Snippet
```java

/**
 * A result object used in {@link ParseAndValidate} helper that indicates the outcomes of a parse
 * and validate operation.
 */
```

### JavadocReference
Cannot resolve symbol `graphql.schema.TypeResolver`
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java

/**
 * This is passed to a {@link graphql.schema.TypeResolver} to help with object type resolution.
 *
 * See {@link graphql.schema.TypeResolver#getType} for how this is used
```

### JavadocReference
Cannot resolve symbol `graphql.schema.TypeResolver`
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java
 * This is passed to a {@link graphql.schema.TypeResolver} to help with object type resolution.
 *
 * See {@link graphql.schema.TypeResolver#getType} for how this is used
 */
@SuppressWarnings("TypeParameterUnusedInFormals")
```

### JavadocReference
Cannot resolve symbol `getType`
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java
 * This is passed to a {@link graphql.schema.TypeResolver} to help with object type resolution.
 *
 * See {@link graphql.schema.TypeResolver#getType} for how this is used
 */
@SuppressWarnings("TypeParameterUnusedInFormals")
```

### JavadocReference
Cannot resolve symbol `graphql.schema.GraphQLUnionType`
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java

    /**
     * @return the type of the graphql field, which still be either a {@link graphql.schema.GraphQLUnionType} or a
     * {@link graphql.schema.GraphQLInterfaceType}
     */
```

### JavadocReference
Cannot resolve symbol `graphql.schema.GraphQLInterfaceType`
in `src/main/com/intellij/lang/jsgraphql/types/TypeResolutionEnvironment.java`
#### Snippet
```java
    /**
     * @return the type of the graphql field, which still be either a {@link graphql.schema.GraphQLUnionType} or a
     * {@link graphql.schema.GraphQLInterfaceType}
     */
    public GraphQLType getFieldType() {
```

### JavadocReference
Cannot resolve symbol `graphql.GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java

/**
 * This helps you build {@link graphql.GraphQLError}s and also has a quick way to make a  {@link graphql.execution.DataFetcherResult}s
 * from that error.
 */
```

### JavadocReference
Cannot resolve symbol `graphql.execution.DataFetcherResult`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java

/**
 * This helps you build {@link graphql.GraphQLError}s and also has a quick way to make a  {@link graphql.execution.DataFetcherResult}s
 * from that error.
 */
```

### JavadocReference
Cannot resolve symbol `graphql.GraphQLError`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java

    /**
     * @return a builder of {@link graphql.GraphQLError}s
     */
    public static GraphqlErrorBuilder newError() {
```

### JavadocReference
Cannot resolve symbol `graphql.execution.DataFetcherResult`
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java

    /**
     * A helper method that allows you to return this error as a {@link graphql.execution.DataFetcherResult}
     *
     * @return a new data fetcher result that contains the built error
```

### JavadocReference
Cannot resolve symbol `graphql.schema.DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/GraphQLContext.java`
#### Snippet
```java
/**
 * This context object can be used to contain key values that can be useful as "context" when executing
 * {@link graphql.schema.DataFetcher}s
 *
 * <pre>
```

### JavadocReference
Cannot resolve symbol `graphql.AssertException`
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserContext.java`
#### Snippet
```java
     * @return current node traverser is visiting.
     *
     * @throws graphql.AssertException if the current node is deleted
     */
    T thisNode();
```

### JavadocReference
Cannot resolve symbol `execute(com.intellij.lang.jsgraphql.types.ExecutionInput)`
in `src/main/com/intellij/lang/jsgraphql/types/schema/DataFetchingEnvironment.java`
#### Snippet
```java

    /**
     * Returns a context argument that is set up when the {@link com.intellij.lang.jsgraphql.types.GraphQL#execute(com.intellij.lang.jsgraphql.types.ExecutionInput)} )} method
     * is invoked.
     * <p>
```

### JavadocReference
Cannot resolve symbol `graphql.schema.DataFetchingEnvironment`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ValuesResolver.java`
#### Snippet
```java
    /**
     * This method coerces the "raw" variables values provided to the engine. The coerced values will be used to
     * provide arguments to {@link graphql.schema.DataFetchingEnvironment}
     * The coercing is ultimately done via {@link Coercing}.
     *
```

### JavadocReference
Cannot resolve symbol `graphql.execution.AsyncExecutionStrategy`
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutorServiceExecutionStrategy.java`
#### Snippet
```java
 * See {@code graphql.execution.ExecutorServiceExecutionStrategyTest} for example usage.
 *
 * @deprecated Use {@link graphql.execution.AsyncExecutionStrategy} and {@link CompletableFuture#supplyAsync(java.util.function.Supplier, java.util.concurrent.Executor)}
 * in your data fetchers instead.
 */
```

### JavadocReference
Cannot resolve symbol `graphql.schema.TypeResolver`
in `src/main/com/intellij/lang/jsgraphql/types/execution/UnresolvedTypeException.java`
#### Snippet
```java

/**
 * This is thrown if a {@link graphql.schema.TypeResolver} fails to give back a concrete type
 * or provides a type that doesn't implement the given interface or union.
 */
```

### JavadocReference
Cannot resolve symbol `graphql.execution.DataFetcherExceptionHandler`
in `src/main/com/intellij/lang/jsgraphql/types/execution/DataFetcherExceptionHandlerResult.java`
#### Snippet
```java

/**
 * The result object for {@link graphql.execution.DataFetcherExceptionHandler}s
 */
@PublicApi
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.PreparsedDocumentEntry`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * This is called to get a persisted query from cache.
     * <p>
     * If its present in cache then  it must return a PreparsedDocumentEntry where {@link graphql.execution.preparsed.PreparsedDocumentEntry#getDocument()}
     * is already parsed and validated.  This will be passed onto the graphql engine as is.
     * <p>
```

### JavadocReference
Cannot resolve symbol `getDocument()`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * This is called to get a persisted query from cache.
     * <p>
     * If its present in cache then  it must return a PreparsedDocumentEntry where {@link graphql.execution.preparsed.PreparsedDocumentEntry#getDocument()}
     * is already parsed and validated.  This will be passed onto the graphql engine as is.
     * <p>
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.persisted.PersistedQueryNotFound`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * This will be compiled and validated by the graphql engine and the a PreparsedDocumentEntry will be passed back ready for you to cache it.
     * <p>
     * If its not a valid query id then throw a {@link graphql.execution.preparsed.persisted.PersistedQueryNotFound} to indicate this.
     *
     * @param persistedQueryId the persisted query id
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.PreparsedDocumentEntry`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * @param executionInput   the original execution input
     * @param onCacheMiss      the call back should it be a valid query id but its not currently not in the cache
     * @return a parsed and validated PreparsedDocumentEntry where {@link graphql.execution.preparsed.PreparsedDocumentEntry#getDocument()} is set
     * @throws graphql.execution.preparsed.persisted.PersistedQueryNotFound if the query id is not know at all and you have no query text
     */
```

### JavadocReference
Cannot resolve symbol `getDocument()`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * @param executionInput   the original execution input
     * @param onCacheMiss      the call back should it be a valid query id but its not currently not in the cache
     * @return a parsed and validated PreparsedDocumentEntry where {@link graphql.execution.preparsed.PreparsedDocumentEntry#getDocument()} is set
     * @throws graphql.execution.preparsed.persisted.PersistedQueryNotFound if the query id is not know at all and you have no query text
     */
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.persisted.PersistedQueryNotFound`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCache.java`
#### Snippet
```java
     * @param onCacheMiss      the call back should it be a valid query id but its not currently not in the cache
     * @return a parsed and validated PreparsedDocumentEntry where {@link graphql.execution.preparsed.PreparsedDocumentEntry#getDocument()} is set
     * @throws graphql.execution.preparsed.persisted.PersistedQueryNotFound if the query id is not know at all and you have no query text
     */
    PreparsedDocumentEntry getPersistedQueryDocument(Object persistedQueryId, ExecutionInput executionInput, PersistedQueryCacheMiss onCacheMiss) throws PersistedQueryNotFound;
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.persisted.PersistedQueryCache`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQueryCacheMiss.java`
#### Snippet
```java
/**
 * The call back when a valid persisted query is not in cache and it needs to be compiled and validated
 * by the graphql engine.  If you get a cache miss in your {@link graphql.execution.preparsed.persisted.PersistedQueryCache} implementation
 * then you are required to call back on the provided instance of this interface
 */
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.PreparsedDocumentProvider`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
 * a {@link PersistedQueryCache} implementation.
 *
 * @see graphql.execution.preparsed.PreparsedDocumentProvider
 * @see graphql.GraphQL.Builder#preparsedDocumentProvider(graphql.execution.preparsed.PreparsedDocumentProvider)
 */
```

### JavadocReference
Cannot resolve symbol `graphql.GraphQL.Builder`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
 *
 * @see graphql.execution.preparsed.PreparsedDocumentProvider
 * @see graphql.GraphQL.Builder#preparsedDocumentProvider(graphql.execution.preparsed.PreparsedDocumentProvider)
 */
@PublicSpi
```

### JavadocReference
Cannot resolve symbol `preparsedDocumentProvider(graphql.execution.preparsed.PreparsedDocumentProvider)`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
 *
 * @see graphql.execution.preparsed.PreparsedDocumentProvider
 * @see graphql.GraphQL.Builder#preparsedDocumentProvider(graphql.execution.preparsed.PreparsedDocumentProvider)
 */
@PublicSpi
```

### JavadocReference
Cannot resolve symbol `graphql.execution.preparsed.PreparsedDocumentProvider`
in `src/main/com/intellij/lang/jsgraphql/types/execution/preparsed/persisted/PersistedQuerySupport.java`
#### Snippet
```java
 *
 * @see graphql.execution.preparsed.PreparsedDocumentProvider
 * @see graphql.GraphQL.Builder#preparsedDocumentProvider(graphql.execution.preparsed.PreparsedDocumentProvider)
 */
@PublicSpi
```

### JavadocReference
Cannot resolve symbol `graphql.schema.GraphQLSchema`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/Instrumentation.java`
#### Snippet
```java

    /**
     * This is called to instrument a {@link graphql.schema.GraphQLSchema} before it is used to parse, validate
     * and execute a query, allowing you to adjust what types are used.
     *
```

### JavadocReference
Cannot resolve symbol `graphql.language.Document`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/Instrumentation.java`
#### Snippet
```java

    /**
     * This is called to instrument a {@link graphql.language.Document} and variables before it is used allowing you to adjust the query AST if you so desire
     *
     * @param documentAndVariables the document and variables to be used
```

### JavadocReference
Cannot resolve symbol `graphql.execution.ExecutionStrategy`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/Instrumentation.java`
#### Snippet
```java

    /**
     * This is called each time an {@link graphql.execution.ExecutionStrategy} is invoked, which may be multiple times
     * per query as the engine recursively descends down over the query.
     *
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.InstrumentationContext`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/Instrumentation.java`
#### Snippet
```java
 * code when you are writing it.
 *
 * Each step gives back an {@link graphql.execution.instrumentation.InstrumentationContext} object.  This has two callbacks on it,
 * one for the step is `dispatched` and one for when the step has `completed`.  This is done because many of the "steps" are asynchronous
 * operations such as fetching data and resolving it into objects.
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.nextgen.Instrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/nextgen/InstrumentationValidationParameters.java`
#### Snippet
```java

/**
 * Parameters sent to {@link graphql.execution.instrumentation.nextgen.Instrumentation} methods
 */
@Internal
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentationOptions.java`
#### Snippet
```java

/**
 * The options that control the operation of {@link graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation}
 */
@PublicApi
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.Instrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/parameters/InstrumentationFieldCompleteParameters.java`
#### Snippet
```java

/**
 * Parameters sent to {@link graphql.execution.instrumentation.Instrumentation} methods
 */
@PublicApi
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.Instrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java

/**
 * This graphql {@link graphql.execution.instrumentation.Instrumentation} will dispatch
 * all the contained {@link org.dataloader.DataLoader}s when each level of the graphql
 * query is executed.
```

### JavadocReference
Cannot resolve symbol `graphql.schema.DataFetcher`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
 * query is executed.
 * <p>
 * This allows you to use {@link org.dataloader.DataLoader}s in your {@link graphql.schema.DataFetcher}s
 * to optimal loading of data.
 * <p>
```

### JavadocReference
Cannot resolve symbol `graphql.GraphQL`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
 * to optimal loading of data.
 * <p>
 * A DataLoaderDispatcherInstrumentation will be automatically added to the {@link graphql.GraphQL}
 * instrumentation list if one is not present.
 *
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.Instrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java

/**
 * This allows you to chain together a number of {@link graphql.execution.instrumentation.Instrumentation} implementations
 * and run them in sequence.  The list order of instrumentation objects is always guaranteed to be followed and
 * the {@link graphql.execution.instrumentation.InstrumentationState} objects they create will be passed back to the originating
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.InstrumentationState`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
 * This allows you to chain together a number of {@link graphql.execution.instrumentation.Instrumentation} implementations
 * and run them in sequence.  The list order of instrumentation objects is always guaranteed to be followed and
 * the {@link graphql.execution.instrumentation.InstrumentationState} objects they create will be passed back to the originating
 * implementation.
 *
```

### JavadocReference
Cannot resolve symbol `graphql.execution.instrumentation.Instrumentation`
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/ChainedInstrumentation.java`
#### Snippet
```java
 * implementation.
 *
 * @see graphql.execution.instrumentation.Instrumentation
 */
@PublicApi
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
Argument `conditionType` might be null
in `src/main/com/intellij/lang/jsgraphql/types/execution/FieldCollector.java`
#### Snippet
```java
        GraphQLType conditionType;
        conditionType = getTypeFromAST(parameters.getGraphQLSchema(), inlineFragment.getTypeCondition());
        return checkTypeCondition(parameters, conditionType);
    }

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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/ide/completion/GraphQLCompletionContributor.java`
#### Snippet
```java
                final PsiElement completionElement = parameters.getPosition();
                final GraphQLTypeScopeProvider typeScopeProvider = PsiTreeUtil.getParentOfType(completionElement,
                    GraphQLTypeScopeProvider.class);
                if (typeScopeProvider == null) {
                    return;
                }
                final GraphQLType typeScope = typeScopeProvider.getTypeScope();
                if (typeScope == null) {
                    return;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/ide/config/model/GraphQLConfigEndpoint.kt`
#### Snippet
```java
        if (project != other.project) return false
        if (rawData != other.rawData) return false
        if (dir != other.dir) return false
        if (isLegacy != other.isLegacy) return false
        if (environment != other.environment) return false
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLPsiToLanguage.java`
#### Snippet
```java
        GraphQLTypeName typeName = extensionDefinition.getTypeName();
        if (typeName != null) {
            def.name(typeName.getName());
        }
        addCommonData(def, extensionDefinition);
        def.directives(createDirectives(extensionDefinition.getDirectives()));
        GraphQLImplementsInterfaces implementsInterfacesContext = extensionDefinition.getImplementsInterfaces();
        def.implementz(getImplements(implementsInterfacesContext));
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/DirectivesUtil.java`
#### Snippet
```java
        List<GraphQLDirective> directiveList = directives.get(directiveName);
        if (directiveList == null || directiveList.isEmpty()) {
            return null;
        }
        Assert.assertTrue(isAllNonRepeatable(directiveList), () -> String.format("'%s' is a repeatable directive and you have used a non repeatable access method", directiveName));
        return directiveList.get(0);
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/analysis/QueryTransformer.java`
#### Snippet
```java
        TraverserVisitor<Node> nodeTraverserVisitor = new TraverserVisitor<Node>() {

            @Override
            public TraversalControl enter(TraverserContext<Node> context) {
                return context.thisNode().accept(context, nodeVisitor);
            }

            @Override
            public TraversalControl leave(TraverserContext<Node> context) {
                //Transformations are applied preOrder only
                return TraversalControl.CONTINUE;
            }
        };
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/execution/Execution.java`
#### Snippet
```java
        OperationDefinition.Operation operation = operationDefinition.getOperation();
        if (operation == MUTATION) {
            GraphQLObjectType mutationType = graphQLSchema.getMutationType();
            if (mutationType == null) {
                throw new MissingRootTypeException("Schema is not configured for mutations.", operationDefinition.getSourceLocation());
            }
            return mutationType;
        } else if (operation == QUERY) {
            GraphQLObjectType queryType = graphQLSchema.getQueryType();
            if (queryType == null) {
                throw new MissingRootTypeException("Schema does not define the required query root type.", operationDefinition.getSourceLocation());
            }
            return queryType;
        } else if (operation == SUBSCRIPTION) {
            GraphQLObjectType subscriptionType = graphQLSchema.getSubscriptionType();
            if (subscriptionType == null) {
                throw new MissingRootTypeException("Schema is not configured for subscriptions.", operationDefinition.getSourceLocation());
            }
            return subscriptionType;
        } else {
            return assertShouldNeverHappen("Unhandled case.  An extra operation enum has been added without code support");
        }
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/execution/ResolveType.java`
#### Snippet
```java
        TypeResolver typeResolver = params.getSchema().getCodeRegistry().getTypeResolver(abstractType);
        GraphQLObjectType result = typeResolver.getType(env);
        if (result == null) {
            throw new UnresolvedTypeException(abstractType);
        }

        if (!params.getSchema().isPossibleType(abstractType, result)) {
            throw new UnresolvedTypeException(abstractType, result);
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/DirectiveLocation.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumTypeDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.description = existing.getDescription();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.enumValueDefinitions = ImmutableList.copyOf(existing.getEnumValueDefinitions());
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/EnumValueDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.description = existing.getDescription();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/FloatValue.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.value = existing.getValue();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/FragmentDefinition.java`
#### Snippet
```java
            this.typeCondition = existing.getTypeCondition();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.selectionSet = existing.getSelectionSet();
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/OperationDefinition.java`
#### Snippet
```java
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.selectionSet = existing.getSelectionSet();
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/InputObjectTypeDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.description = existing.getDescription();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.inputValueDefinitions = ImmutableList.copyOf(existing.getInputValueDefinitions());
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/InterfaceTypeExtensionDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.description = existing.getDescription();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.implementz = ImmutableList.copyOf(existing.getImplements());
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/ListType.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.type = existing.getType();
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.operationTypeDefinitions = ImmutableList.copyOf(existing.getOperationTypeDefinitions());
            this.ignoredChars = existing.getIgnoredChars();
            this.additionalData = new LinkedHashMap<>(existing.getAdditionalData());
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/language/UnionTypeDefinition.java`
#### Snippet
```java
            this.sourceLocation = existing.getSourceLocation();
            this.comments = ImmutableList.copyOf(existing.getComments());
            this.name = existing.getName();
            this.description = existing.getDescription();
            this.directives = ImmutableList.copyOf(existing.getDirectives());
            this.memberTypes = ImmutableList.copyOf(existing.getMemberTypes());
            this.ignoredChars = existing.getIgnoredChars();
            this.element = existing.getElement();
            this.sourceNodes = existing.getSourceNodes();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
            if (index1 != index2) {
                return Integer.compare(index1, index2);
            }
            NodeZipper.ModificationType modificationType1 = zipper1.getModificationType();
            NodeZipper.ModificationType modificationType2 = zipper2.getModificationType();

            // same index can never be deleted and changed at the same time

            if (modificationType1 == modificationType2) {
                return 0;
            }

            // always first replacing the node
            if (modificationType1 == REPLACE) {
                return -1;
            }
            // and then INSERT_BEFORE before INSERT_AFTER
            return modificationType1 == NodeZipper.ModificationType.INSERT_BEFORE ? -1 : 1;
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
            switch (zipper.getModificationType()) {
                case REPLACE:
                    childList.set(ix, zipper.getCurNode());
                    break;
                case DELETE:
                    childList.remove(ix);
                    indexCorrection.put(name, ixDiff - 1);
                    break;
                case INSERT_BEFORE:
                    childList.add(ix, zipper.getCurNode());
                    indexCorrection.put(name, ixDiff + 1);
                    break;
                case INSERT_AFTER:
                    childList.add(ix + 1, zipper.getCurNode());
                    indexCorrection.put(name, ixDiff + 1);
                    break;
            }
            childrenMap.put(name, childList);
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        fieldBuilder.definition(fieldDef);
        fieldBuilder.name(fieldDef.getName());
        fieldBuilder.description(buildDescription(fieldDef, fieldDef.getDescription()));
        fieldBuilder.deprecate(buildDeprecationReason(fieldDef.getDirectives()));
        fieldBuilder.comparatorRegistry(buildCtx.getComparatorRegistry());

        // currently the spec doesnt allow deprecations on InputValueDefinitions but it should!
        //fieldBuilder.deprecate(buildDeprecationReason(fieldDef.getDirectives()));
        GraphQLInputType inputType = buildInputType(buildCtx, fieldDef.getType()).orElse(null);
        if (inputType == null) return Optional.empty();

        fieldBuilder.type(inputType);
        Value defaultValue = fieldDef.getDefaultValue();
        if (defaultValue != null) {
            fieldBuilder.defaultValue(buildValue(buildCtx, defaultValue, inputType));
        }

        fieldBuilder.withDirectives(
                buildDirectives(buildCtx,
                        fieldDef.getDirectives(),
                        emptyList(),
                        INPUT_FIELD_DEFINITION,
                        buildCtx.getDirectives(),
                        buildCtx.getComparatorRegistry())
        );

        return Optional.of(fieldBuilder.build());
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        Map<String, GraphQLOutputType> interfaces = new LinkedHashMap<>();
        typeDefinition.getImplements().forEach(type -> {
            Optional<GraphQLNamedOutputType> newInterfaceType = buildOutputType(buildCtx, type);
            newInterfaceType.ifPresent(outputType -> interfaces.put(outputType.getName(), outputType));
        });

        extensions.forEach(extension -> extension.getImplements().forEach(type -> {
            Optional<GraphQLNamedOutputType> newInterfaceType = buildOutputType(buildCtx, type);
            newInterfaceType.ifPresent(interfaceType -> {
                if (!interfaces.containsKey(interfaceType.getName())) {
                    interfaces.put(interfaceType.getName(), interfaceType);
                }
            });
        }));

        interfaces.values().forEach(interfaze -> {
            if (interfaze instanceof GraphQLInterfaceType) {
                builder.withInterface((GraphQLInterfaceType) interfaze);
                return;
            }
            if (interfaze instanceof GraphQLTypeReference) {
                builder.withInterface((GraphQLTypeReference) interfaze);
            }
        });
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGeneratorHelper.java`
#### Snippet
```java
        builder.extensionDefinitions(extensions);
        builder.withDirectives(
                buildDirectives(buildCtx,
                        typeDefinition.getDirectives(),
                        directivesOf(extensions),
                        OBJECT,
                        buildCtx.getDirectives(),
                        buildCtx.getComparatorRegistry())
        );

        typeDefinition.getFieldDefinitions().forEach(fieldDef ->
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(builder::field));

        extensions.forEach(extension -> extension.getFieldDefinitions().forEach(fieldDef -> {
            buildField(buildCtx, typeDefinition, fieldDef).ifPresent(fieldDefinition -> {
                if (!builder.hasField(fieldDefinition.getName())) {
                    builder.field(fieldDefinition);
                }
            });
        }));
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaTypeExtensionsChecker.java`
#### Snippet
```java
List<FieldDefinition> fieldDefinitions = extension.getFieldDefinitions();
                                // field unique ness
                                checkNamedUniqueness(errors, extension.getFieldDefinitions(), FieldDefinition::getName,
                                        (namedField, fieldDef) -> new NonUniqueNameError(extension, fieldDef));

                                // field arg unique ness
                                extension.getFieldDefinitions().forEach(fld -> checkNamedUniqueness(errors, fld.getInputValueDefinitions(), InputValueDefinition::getName,
                                        (namedField, inputValueDefinition) -> new NonUniqueArgumentError(extension, fld, namedField)));

                                // directive checks
                                extension.getFieldDefinitions().forEach(fld -> checkNamedUniqueness(errors, nonRepeatableDirectivesOnly(directiveDefinitionMap, fld.getDirectives()), Directive::getName,
                                        (directiveName, directive) -> new NonUniqueDirectiveError(extension, fld, directiveName)));

                                fieldDefinitions.forEach(fld -> fld.getDirectives().forEach(directive ->
                                        checkNamedUniqueness(errors, directive.getArguments(), Argument::getName,
                                                (argumentName, argument) -> new NonUniqueArgumentError(extension, fld, argumentName))));

                                //
                                // fields must be unique within a type extension
                                forEachBut(extension, extensions,
                                        otherTypeExt -> checkForFieldRedefinition(errors, otherTypeExt, otherTypeExt.getFieldDefinitions(), fieldDefinitions));
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/util/NodeMultiZipper.java`
#### Snippet
```java
sameParent.sort((zipper1, zipper2) -> {
            int index1 = zipper1.getBreadcrumbs().get(0).getLocation().getIndex();
            int index2 = zipper2.getBreadcrumbs().get(0).getLocation().getIndex();
            if (index1 != index2) {
                return Integer.compare(index1, index2);
            }
            NodeZipper.ModificationType modificationType1 = zipper1.getModificationType();
            NodeZipper.ModificationType modificationType2 = zipper2.getModificationType();

            // same index can never be deleted and changed at the same time

            if (modificationType1 == modificationType2) {
                return 0;
            }

            // always first replacing the node
            if (modificationType1 == REPLACE) {
                return -1;
            }
            // and then INSERT_BEFORE before INSERT_AFTER
            return modificationType1 == NodeZipper.ModificationType.INSERT_BEFORE ? -1 : 1;

        });

        for (NodeZipper<T> zipper : sameParent) {
            NodeLocation location = zipper.getBreadcrumbs().get(0).getLocation();
            Integer ixDiff = indexCorrection.getOrDefault(location.getName(), 0);
            int ix = location.getIndex() + ixDiff;
            String name = location.getName();
            List<T> childList = new ArrayList<>(childrenMap.get(name));
            switch (zipper.getModificationType()) {
                case REPLACE:
                    childList.set(ix, zipper.getCurNode());
                    break;
                case DELETE:
                    childList.remove(ix);
                    indexCorrection.put(name, ixDiff - 1);
                    break;
                case INSERT_BEFORE:
                    childList.add(ix, zipper.getCurNode());
                    indexCorrection.put(name, ixDiff + 1);
                    break;
                case INSERT_AFTER:
                    childList.add(ix + 1, zipper.getCurNode());
                    indexCorrection.put(name, ixDiff + 1);
                    break;
            }
            childrenMap.put(name, childList);
        }

        T newNode = nodeAdapter.withNewChildren(parent, childrenMap);
        List<Breadcrumb<T>> newBreadcrumbs = sameParent.get(0).getBreadcrumbs().subList(1, sameParent.get(0).getBreadcrumbs().size());
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            if (children.size() == 0) {
                tryComplete();
                return;
            }
            setPendingCount(children.size() - 1);
            for (int i = 1; i < children.size(); i++) {
                new EnterAction(this, children.get(i), visitor).fork();
            }
            new EnterAction(this, children.get(0), visitor).compute();
```

### DuplicatedCode
Duplicated code
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
            childrenMap.keySet().forEach(key -> {
                List<T> children = childrenMap.get(key);
                for (int i = children.size() - 1; i >= 0; i--) {
                    T child = assertNotNull(children.get(i), () -> String.format("null child for key %s", key));
                    NodeLocation nodeLocation = new NodeLocation(key, i);
                    DefaultTraverserContext<T> context = newContext(child, traverserContext, nodeLocation);
                    contexts.push(context);
                    childrenContextMap.computeIfAbsent(key, notUsed -> new ArrayList<>());
                    childrenContextMap.get(key).add(0, context);
                }
            });
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

## RuleId[id=ReactiveStreamsSubscriberImplementation]
### ReactiveStreamsSubscriberImplementation
Class implements Subscriber
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/CompletionStageMappingPublisher.java`
#### Snippet
```java
    @Override
    public void subscribe(Subscriber<? super D> downstreamSubscriber) {
        upstreamPublisher.subscribe(new Subscriber<U>() {
            Subscription delegatingSubscription;
            final Queue<CompletionStage<?>> inFlightDataQ = new ArrayDeque<>();
```

## RuleId[id=ReactiveStreamsPublisherImplementation]
### ReactiveStreamsPublisherImplementation
Class implements Publisher
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/SingleSubscriberPublisher.java`
#### Snippet
```java
 */
@Internal
public class SingleSubscriberPublisher<T> implements Publisher<T> {
    private final Deque<T> dataQ = new ConcurrentLinkedDeque<>();
    private final NonBlockingMutexExecutor mutex = new NonBlockingMutexExecutor();
```

### ReactiveStreamsPublisherImplementation
Class implements Publisher
in `src/main/com/intellij/lang/jsgraphql/types/execution/reactive/CompletionStageMappingPublisher.java`
#### Snippet
```java
 */
@Internal
public class CompletionStageMappingPublisher<D, U> implements Publisher<D> {
    private final Publisher<U> upstreamPublisher;
    private final Function<U, CompletionStage<D>> mapper;
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/ImplementingTypesChecker.java`
#### Snippet
```java
            Map<InterfaceTypeDefinition, ImplementingTypeDefinition> implementedInterfaces) {

        if (implementedInterfaces.containsKey(type)) {
            errors.add(new InterfaceImplementingItselfError(TYPE_OF_MAP.get(type.getClass()), type));
            return;
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypesImplementInterfaces.java`
#### Snippet
```java

    boolean objectIsMemberOfUnion(GraphQLUnionType unionType, GraphQLOutputType objectType) {
        return unionType.getTypes().contains(objectType);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java
        public TraversalControl visitGraphQLType(GraphQLSchemaElement node,
                                                 TraverserContext<GraphQLSchemaElement> context) {
            if (observedBeforeTransform.contains(node) &&
                    !observedAfterTransform.contains(node) &&
                    (node instanceof GraphQLObjectType ||
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java
                                                 TraverserContext<GraphQLSchemaElement> context) {
            if (observedBeforeTransform.contains(node) &&
                    !observedAfterTransform.contains(node) &&
                    (node instanceof GraphQLObjectType ||
                            node instanceof GraphQLEnumType ||
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
        Set<GraphQLSchemaElement> tempMarked = new LinkedHashSet<>();
        Set<GraphQLSchemaElement> permMarked = new LinkedHashSet<>();
        /**
         * Taken from: https://en.wikipedia.org/wiki/Topological_sorting#Depth-first_search
         * while exists nodes without a permanent mark do
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/com/intellij/lang/jsgraphql/types/schema/SchemaTransformer.java`
#### Snippet
```java
                       List<GraphQLSchemaElement> result,
                       Map<GraphQLSchemaElement, List<GraphQLSchemaElement>> reverseDependencies) {
        /**
         * Taken from: https://en.wikipedia.org/wiki/Topological_sorting#Depth-first_search
         * if n has a permanent mark then
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/com/intellij/lang/jsgraphql/types/execution/ExecutionStepInfo.java`
#### Snippet
```java
public class ExecutionStepInfo {

    /**
     * An ExecutionStepInfo represent either a field or a list element inside a list of objects/interfaces/unions.
     *
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewModel.java`
#### Snippet
```java
                    // field with no sub selections, but we have to check if there's attributes
                    final PsiElement nextVisible = PsiTreeUtil.nextVisibleLeaf(treeElement.childrenBase);
                    if (nextVisible != null && nextVisible.getNode().getElementType() == GraphQLElementTypes.PAREN_L) {
                        return false;
                    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/ide/structureView/GraphQLStructureViewModel.java`
#### Snippet
```java
                    return true;
                }
                if (children.length == 1 && children[0] instanceof LeafPsiElement) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/MockedWiringFactory.java`
#### Snippet
```java
    @Override
    public boolean providesScalar(ScalarWiringEnvironment environment) {
        if (ScalarInfo.isGraphqlSpecifiedScalar(environment.getScalarTypeDefinition().getName())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypesImplementInterfaces.java`
#### Snippet
```java

                    boolean same = true;
                    if (!interfaceArgStr.equals(objectArgStr)) {
                        same = false;
                    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/schema/validation/TypeAndFieldRule.java`
#### Snippet
```java
                return false;
            }
            if (namedType instanceof GraphQLScalarType && isGraphqlSpecifiedScalar((GraphQLScalarType) namedType)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/Document.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/ArrayValue.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/NonNullType.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/SchemaDefinition.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/NullValue.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/SelectionSet.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/ListType.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
    public static boolean isEqualTo(String thisStr, String thatStr) {
        if (null == thisStr) {
            if (null != thatStr) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeUtil.java`
#### Snippet
```java
                return false;
            }
        } else if (!thisStr.equals(thatStr)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/language/ObjectValue.java`
#### Snippet
```java
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/DataLoaderDispatcherInstrumentation.java`
#### Snippet
```java
        if (executionContext.getOperationDefinition().getOperation() == OperationDefinition.Operation.QUERY) {
            ExecutionStrategy queryStrategy = executionContext.getQueryStrategy();
            if (queryStrategy instanceof AsyncExecutionStrategy) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/execution/instrumentation/dataloader/FieldLevelTrackingApproach.java`
#### Snippet
```java
            return callStack.allFetchesHappened(1);
        }
        if (levelReady(callStack, level - 1) && callStack.allOnFieldCallsHappened(level - 1)
                && callStack.allStrategyCallsHappened(level) && callStack.allFetchesHappened(level)) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/OverlappingFieldsCanBeMerged.java`
#### Snippet
```java
        }
        if (isEnum(typeA) || isEnum(typeB)) {
            if (!sameType(typeA, typeB)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/com/intellij/lang/jsgraphql/javascript/injection/GraphQLJavaScriptLanguageInjectionUtil.java`
#### Snippet
```java

        // # graphql
        if (isInjectedUsingCommentInside(template.getText())) {
            return true;
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
'getPreferredFocusedComponent' always returns non-null type
in `src/main/com/intellij/lang/jsgraphql/ide/actions/GraphQLOpenConfigAction.kt`
#### Snippet
```java
        }

        override fun getPreferredFocusedComponent(): JComponent? {
            return comboBox
        }
```

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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserContext.java`
#### Snippet
```java
     * Returns parent context.
     * Effectively organizes Context objects in a linked list so
     * by following {@link #getParentContext() } links one could obtain
     * the current path as well as the variables {@link #getVar(Class) }
     * stored in every parent context.
```

### JavadocDeclaration
`@param typeRegistry` tag description is missing
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGenerator.java`
#### Snippet
```java
     *
     * @param options      the controlling options
     * @param typeRegistry
     * @param wiring       this can be built using {@link RuntimeWiring#newRuntimeWiring()}
     * @return an executable schema
```

### JavadocDeclaration
`@param typeRegistry` tag description is missing
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGenerator.java`
#### Snippet
```java
     * This will take a {@link TypeDefinitionRegistry} and a {@link RuntimeWiring} and put them together to create a executable schema
     *
     * @param typeRegistry
     * @param wiring       this can be built using {@link RuntimeWiring#newRuntimeWiring()}
     * @return an executable schema
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `Reader` is redundant
in `src/main/com/intellij/lang/jsgraphql/GraphQLLexerAdapter.java`
#### Snippet
```java
public class GraphQLLexerAdapter extends FlexAdapter {
  public GraphQLLexerAdapter() {
    super(new GraphQLLexer((Reader) null));
  }
}
```

### RedundantCast
Casting `null` to `java.io.Reader` is redundant
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  public GraphQLLexer() {
    this((java.io.Reader)null);
  }

```

### RedundantCast
Casting `newNode.getCurNode()` to `T` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
                NodeZipper<T> newNode = moveUp((T) currentContext.thisNode(), childZippers);
                myZippers.add(newNode);
                this.result = (T) newNode.getCurNode();
            } else if (currentContext.isChanged()) {
                NodeZipper<T> newNode = new NodeZipper(currentContext.thisNode(), currentContext.getBreadcrumbs(), nodeAdapter);
```

### RedundantCast
Casting `context.getNewAccumulate()` to `T` is redundant
in `src/main/com/intellij/lang/jsgraphql/types/language/NodeTraverser.java`
#### Snippet
```java
        DefaultTraverserContext<Node> context = DefaultTraverserContext.simple(node);
        node.accept(context, nodeVisitor);
        return (T) context.getNewAccumulate();
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `zzReader` may be 'final'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/ide/documentation/GraphQLDocumentationPsiElement.java`
#### Snippet
```java

    private final PsiElement context;
    private String type;
    private JSGraphQLDocItemPresentation itemPresentation;

```

### FieldMayBeFinal
Field `locations` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/GraphqlErrorBuilder.java`
#### Snippet
```java
    private String message;
    private List<Object> path;
    private List<SourceLocation> locations = new ArrayList<>();
    private ErrorClassification errorType = ErrorType.DataFetchingException;
    private Map<String, Object> extensions = null;
```

### FieldMayBeFinal
Field `visitor` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;

        private EnterAction(CountedCompleter parent, DefaultTraverserContext currentContext, TraverserVisitor<? super T> visitor) {
```

### FieldMayBeFinal
Field `sharedContextData` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java
    private final ForkJoinPool forkJoinPool;

    private Object sharedContextData;


```

### FieldMayBeFinal
Field `currentContext` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTraverser.java`
#### Snippet
```java

    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;

```

### FieldMayBeFinal
Field `parallel` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/DefaultTraverserContext.java`
#### Snippet
```java
    private final NodeLocation location;
    private final boolean isRootContext;
    private boolean parallel;
    private Map<String, List<TraverserContext<T>>> children;
    private Phase phase;
```

### FieldMayBeFinal
Field `sharedContextData` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TraverserState.java`
#### Snippet
```java
public abstract class TraverserState<T> {

    private Object sharedContextData;

    private final Deque<Object> state;
```

### FieldMayBeFinal
Field `currentContext` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java

    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;
        private List<DefaultTraverserContext> children;
```

### FieldMayBeFinal
Field `visitor` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
    private class EnterAction extends CountedCompleter {
        private DefaultTraverserContext currentContext;
        private TraverserVisitor<? super T> visitor;
        private List<DefaultTraverserContext> children;
        private List<NodeZipper<T>> myZippers = new LinkedList<>();
```

### FieldMayBeFinal
Field `sharedContextData` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java


    private Object sharedContextData;


```

### FieldMayBeFinal
Field `myZippers` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/util/TreeParallelTransformer.java`
#### Snippet
```java
        private TraverserVisitor<? super T> visitor;
        private List<DefaultTraverserContext> children;
        private List<NodeZipper<T>> myZippers = new LinkedList<>();
        private T result;

```

### FieldMayBeFinal
Field `elementType` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparatorEnvironment.java`
#### Snippet
```java
    private Class<? extends GraphQLSchemaElement> parentType;

    private Class<? extends GraphQLSchemaElement> elementType;

    private GraphqlTypeComparatorEnvironment(Class<? extends GraphQLSchemaElement> parentType, Class<? extends GraphQLSchemaElement> elementType) {
```

### FieldMayBeFinal
Field `parentType` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphqlTypeComparatorEnvironment.java`
#### Snippet
```java
public class GraphqlTypeComparatorEnvironment {

    private Class<? extends GraphQLSchemaElement> parentType;

    private Class<? extends GraphQLSchemaElement> elementType;
```

### FieldMayBeFinal
Field `additionalDirectives` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        private String description;

        private Set<GraphQLDirective> additionalDirectives = new LinkedHashSet<>();
        private List<GraphQLDirective> schemaDirectives = new ArrayList<>();

```

### FieldMayBeFinal
Field `schemaDirectives` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java

        private Set<GraphQLDirective> additionalDirectives = new LinkedHashSet<>();
        private List<GraphQLDirective> schemaDirectives = new ArrayList<>();

        private SchemaUtil schemaUtil = new SchemaUtil();
```

### FieldMayBeFinal
Field `schemaUtil` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        private List<GraphQLDirective> schemaDirectives = new ArrayList<>();

        private SchemaUtil schemaUtil = new SchemaUtil();

        public Builder query(GraphQLObjectType.Builder builder) {
```

### FieldMayBeFinal
Field `additionalTypes` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/GraphQLSchema.java`
#### Snippet
```java
        private GraphQLObjectType subscriptionType;
        private GraphQLCodeRegistry codeRegistry = GraphQLCodeRegistry.newCodeRegistry().build();
        private Set<GraphQLType> additionalTypes = new LinkedHashSet<>();
        private SchemaDefinition definition;
        private List<SchemaExtensionDefinition> extensionDefinitions;
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/DefaultGraphqlTypeComparatorRegistry.java`
#### Snippet
```java
    public static class Builder {

        private Map<GraphqlTypeComparatorEnvironment, Comparator<?>> registry = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `graphQLSchema` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/schema/transform/FieldVisibilitySchemaTransformation.java`
#### Snippet
```java

        private final Set<GraphQLType> observedTypes;
        private GraphQLSchema graphQLSchema;


```

### FieldMayBeFinal
Field `sourceLocations` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/execution/MissingRootTypeException.java`
#### Snippet
```java
@PublicApi
public class MissingRootTypeException extends GraphQLException implements GraphQLError {
    private List<SourceLocation> sourceLocations;

    public MissingRootTypeException(String message, SourceLocation sourceLocation) {
```

### FieldMayBeFinal
Field `valueUnboxer` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/execution/Execution.java`
#### Snippet
```java
    private final ExecutionStrategy subscriptionStrategy;
    private final Instrumentation instrumentation;
    private ValueUnboxer valueUnboxer;

    public Execution(ExecutionStrategy queryStrategy, ExecutionStrategy mutationStrategy, ExecutionStrategy subscriptionStrategy, Instrumentation instrumentation, ValueUnboxer valueUnboxer) {
```

### FieldMayBeFinal
Field `validationUtil` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/validation/AbstractRule.java`
#### Snippet
```java
    private boolean visitFragmentSpreads;

    private ValidationUtil validationUtil = new ValidationUtil();

    public AbstractRule(ValidationContext validationContext, ValidationErrorCollector validationErrorCollector) {
```

### FieldMayBeFinal
Field `fragmentNames` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueFragmentNames.java`
#### Snippet
```java


    private Set<String> fragmentNames = new LinkedHashSet<>();


```

### FieldMayBeFinal
Field `operationNames` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/types/validation/rules/UniqueOperationNames.java`
#### Snippet
```java
public class UniqueOperationNames extends AbstractRule {

    private Set<String> operationNames = new LinkedHashSet<>();

    public UniqueOperationNames(ValidationContext validationContext, ValidationErrorCollector validationErrorCollector) {
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `src/main/com/intellij/lang/jsgraphql/schema/GraphQLUnexpectedSchemaError.java`
#### Snippet
```java
public class GraphQLUnexpectedSchemaError implements GraphQLError {

    private Exception exception;

    public GraphQLUnexpectedSchemaError(Exception exception) {
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `Options`
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/SchemaGenerator.java`
#### Snippet
```java

        public static Options defaultOptions() {
            return new Options();
        }
    }
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0100` can be replaced with 'Ā'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\14\100\1\300\u0100\100");

  /* The ZZ_CMAP_Y table has 256 entries */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u012c` can be replaced with 'Ĭ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u015e` can be replaced with 'Ş'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u01c2` can be replaced with 'ǂ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u01f4` can be replaced with 'Ǵ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0226` can be replaced with 'Ȧ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0258` can be replaced with 'ɘ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u028a` can be replaced with 'ʊ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02bc` can be replaced with 'ʼ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02ee` can be replaced with 'ˮ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0320` can be replaced with '̠'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0352` can be replaced with '͒'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0384` can be replaced with '΄'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03b6` can be replaced with 'ζ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03e8` can be replaced with 'Ϩ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u041a` can be replaced with 'К'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u044c` can be replaced with 'ь'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u047e` can be replaced with 'Ѿ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u04b0` can be replaced with 'Ұ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u04e2` can be replaced with 'Ӣ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0514` can be replaced with 'Ԕ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0546` can be replaced with 'Ն'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0578` can be replaced with 'ո'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05aa` can be replaced with '֪'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05dc` can be replaced with 'ל'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u060e` can be replaced with '؎'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\372\0\372\0\372\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0640` can be replaced with 'ـ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0672` can be replaced with 'ٲ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u06a4` can be replaced with 'ڤ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u06d6` can be replaced with 'ۖ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0708` can be replaced with '܈'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u073a` can be replaced with 'ܺ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514"+
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u076c` can be replaced with 'ݬ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u079e` can be replaced with 'ޞ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u07d0` can be replaced with 'ߐ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0802` can be replaced with 'ࠂ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0834` can be replaced with '࠴'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0866` can be replaced with 'ࡦ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0546\0\372\0\u0578\0\u05aa\0\u05dc\0\u060e\0\372"+
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u08fc` can be replaced with 'ࣼ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u092e` can be replaced with 'म'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0960` can be replaced with 'ॠ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09c4` can be replaced with 'ৄ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0546` can be replaced with 'Ն'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0640\0\372\0\372\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09f6` can be replaced with '৶'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0a28` can be replaced with 'ਨ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0a5a` can be replaced with 'ਗ਼'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0a8c` can be replaced with 'ઌ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0a8c` can be replaced with 'ઌ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0abe` can be replaced with 'ા'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0af0` can be replaced with '૰'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0b22` can be replaced with 'ଢ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0b86` can be replaced with 'ஆ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0bb8` can be replaced with 'ஸ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0bea` can be replaced with '௪'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0c1c` can be replaced with 'జ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u08fc\0\u0190\0\u092e\0\u0960\0\u0992\0\u09c4\0\u0546\0\372"+
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0c80` can be replaced with 'ಀ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0cb2` can be replaced with 'ಲ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0d16` can be replaced with 'ഖ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0d48` can be replaced with 'ൈ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0d7a` can be replaced with 'ൺ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0dac` can be replaced with 'ඬ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u09f6\0\372\0\u0a28\0\u0a5a\0\u0a8c\0\u0a8c\0\372\0\372"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0dde` can be replaced with 'ෞ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0e10` can be replaced with 'ฐ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0e42` can be replaced with 'โ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0ed8` can be replaced with '໘'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0f0a` can be replaced with '༊'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0f3c` can be replaced with '༼'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0fa0` can be replaced with 'ྠ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0fd2` can be replaced with '࿒'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1004` can be replaced with 'င'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1036` can be replaced with 'ံ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1068` can be replaced with 'ၨ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u109a` can be replaced with 'ႚ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u10fe` can be replaced with 'ჾ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1130` can be replaced with 'ᄰ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\372\0\u0dde\0\u0e10\0\u0190\0\u0e42\0\u0e74\0\u0ea6\0\u0190"+
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1162` can be replaced with 'ᅢ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1194` can be replaced with 'ᆔ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u11c6` can be replaced with 'ᇆ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u11f8` can be replaced with 'ᇸ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u122a` can be replaced with 'ሪ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u125c` can be replaced with 'ቜ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036"+
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u12c0` can be replaced with 'ዀ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u12f2` can be replaced with 'ዲ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1324` can be replaced with 'ጤ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1356` can be replaced with 'ፖ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1388` can be replaced with 'ᎈ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u13ba` can be replaced with 'Ꮊ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u0190\0\u0190\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u0190"+
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u13ec` can be replaced with 'Ꮼ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u141e` can be replaced with 'ᐞ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1450` can be replaced with 'ᑐ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1482` can be replaced with 'ᒂ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u14b4` can be replaced with 'ᒴ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u14e6` can be replaced with 'ᓦ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1518` can be replaced with 'ᔘ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0190\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u154a` can be replaced with 'ᕊ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u157c` can be replaced with 'ᕼ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u15ae` can be replaced with 'ᖮ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u15e0` can be replaced with 'ᗠ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1612` can be replaced with 'ᘒ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1644` can be replaced with 'ᙄ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u12c0\0\u12f2\0\u1324\0\u0190\0\u0190\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1676` can be replaced with 'ᙶ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u16a8` can be replaced with 'ᚨ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u16da` can be replaced with 'ᛚ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0190` can be replaced with 'Ɛ'
in `gen/com/intellij/lang/jsgraphql/GraphQLLexer.java`
#### Snippet
```java
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u0190"+
    "\0\u154a\0\u157c\0\u15ae\0\u0190\0\u15e0\0\u1612\0\u1644\0\u0190"+
    "\0\u1676\0\u0190\0\u0190\0\u0190\0\u16a8\0\u16da\0\u0190";

  private static int [] zzUnpackRowMap() {
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

## RuleId[id=UnpredictableBigDecimalConstructorCall]
### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `src/main/com/intellij/lang/jsgraphql/types/schema/idl/EchoingWiringFactory.java`
#### Snippet
```java
            return "id_" + fieldName;
        } else if (scalarType.equals(Scalars.GraphQLBigDecimal)) {
            return new BigDecimal(1.0);
        } else if (scalarType.equals(Scalars.GraphQLBigInteger)) {
            return new BigInteger("1");
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/com/intellij/lang/jsgraphql/types/execution/nextgen/result/ResultNodesUtil.java`
#### Snippet
```java

    private static ExecutionResultData data(Object data, NonNullableFieldWasNullException exception) {
        return new ExecutionResultData(data, Arrays.asList(new NonNullableFieldWasNullError(exception)));
    }

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
Class "GraphQLConfigPointer" is never used
in `src/main/com/intellij/lang/jsgraphql/ide/config/model/GraphQLConfigPointer.kt`
#### Snippet
```java


data class GraphQLConfigPointer(val dir: VirtualFile?, val file: VirtualFile?, val projectName: String?) {
    fun resolve(project: Project): GraphQLProjectConfig? {
        val provider = GraphQLConfigProvider.getInstance(project)
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

