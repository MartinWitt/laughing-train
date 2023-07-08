# closure-templates 
 
# Bad smells
I found 1798 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 423 | false |
| UnnecessaryUnicodeEscape | 249 | false |
| NullableProblems | 208 | false |
| DataFlowIssue | 177 | false |
| JavadocReference | 156 | false |
| OptionalUsedAsFieldOrParameterType | 69 | false |
| FieldMayBeFinal | 55 | false |
| UnstableApiUsage | 49 | false |
| SimplifyOptionalCallChains | 42 | false |
| DeprecatedIsStillUsed | 40 | false |
| OptionalGetWithoutIsPresent | 38 | false |
| JavadocLinkAsPlainText | 36 | false |
| FieldCanBeLocal | 22 | false |
| AutoCloseableResource | 19 | false |
| ConstantValue | 17 | false |
| OptionalIsPresent | 16 | false |
| DuplicatedCode | 16 | false |
| EmptyStatementBody | 15 | false |
| TrivialIf | 10 | false |
| SwitchStatementWithTooFewBranches | 9 | false |
| JavadocDeclaration | 9 | false |
| MismatchedCollectionQueryUpdate | 8 | false |
| DefaultAnnotationParam | 7 | false |
| StringConcatenationInLoops | 7 | false |
| RegExpRedundantEscape | 6 | false |
| DuplicateBranchesInSwitch | 6 | false |
| RegExpSimplifiable | 6 | false |
| UnusedAssignment | 6 | false |
| StaticInitializerReferencesSubClass | 5 | false |
| UnnecessaryReturn | 5 | true |
| RedundantCast | 5 | false |
| RefusedBequest | 4 | false |
| RedundantMethodOverride | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| SuspiciousMethodCalls | 4 | false |
| RegExpRepeatedSpace | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| RegExpUnnecessaryNonCapturingGroup | 4 | false |
| IgnoreResultOfCall | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| RegExpUnexpectedAnchor | 3 | false |
| UnnecessarySemicolon | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| RegExpSingleCharAlternation | 2 | false |
| UnnecessaryContinue | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WrapperTypeMayBePrimitive | 1 | false |
| StringEquality | 1 | false |
| UnnecessaryModifier | 1 | true |
| EmptyFinallyBlock | 1 | false |
| CommentedOutCode | 1 | false |
| ManualArrayCopy | 1 | false |
| TrivialStringConcatenation | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| ExcessiveLambdaUsage | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| DanglingJavadoc | 1 | false |
| CopyConstructorMissesField | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[builder.interfaces.size()\]'
in `java/src/com/google/template/soy/jbcsrc/internal/SoyClassWriter.java`
#### Snippet
```java
        null /* not generic */,
        builder.baseClass.internalName(),
        builder.interfaces.toArray(new String[builder.interfaces.size()]));
    if (builder.fileName != null) {
      super.visitSource(
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `java/src/com/google/template/soy/i18ndirectives/I18NDirectivesRuntime.java`
#### Snippet
```java
    }
    if (number instanceof Number) {
      Double val;
      if (number instanceof Double) {
        val = (Double) number;
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `java/src/com/google/template/soy/data/SanitizedContents.java`
#### Snippet
```java
    // Extra runtime check in case the compile-time check doesn't work.
    Preconditions.checkArgument(
        constant.intern() == constant,
        "The provided argument does not look like a compile-time constant.");
    return SanitizedContent.create(constant, kind, dir);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplate.java`
#### Snippet
```java

  @SuppressWarnings("Immutable")
  public static CompiledTemplate createFromTemplateValue(TemplateValue templateValue) {
    return (params, ij, appendable, context) ->
        context
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/data/SanitizedContents.java`
#### Snippet
```java
        // neutral + x -> x
        dir = content.getContentDirection();
      } else if (content.getContentDirection() == dir
          || content.getContentDirection() == Dir.NEUTRAL) {
        // x + x|neutral -> x, so leave dir unchanged.
```

### EmptyStatementBody
`for` statement has empty body
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java
    for (int bucket = 0, idx = 0; bucket < numBuckets; bucket++) {
      bucketBoundaries[bucket] = idx;
      for (;
          (idx < sortedMsgs.size()) && (bucketOf(sortedMsgs.get(idx).getId()) == bucket);
          idx++) {}
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/jssrc/dsl/Concatenation.java`
#### Snippet
```java
      if (part instanceof Concatenation) {
        partsBuilder.addAll(((Concatenation) part).parts());
      } else if (part.equals(TsxPrintNode.NIL)) {
        // Skip it.
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/jssrc/dsl/RangeComment.java`
#### Snippet
```java

  public static RangeComment create(String comment, boolean inline) {
    if (comment.length() >= 4 && comment.startsWith("/*") && comment.endsWith("*/")) {
      // pre-formatted.
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java

    for (SoyMsgPart child : parts) {
      if (child instanceof SoyMsgRawTextPart || child instanceof SoyMsgPluralRemainderPart) {
        // raw text doesn't have placeholders and remainders use the same placeholder as plural they
        // are a member of.
```

### EmptyStatementBody
`else` statement has empty body
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
      } else if (childIndex == veLogNode.numChildren() - 1) {
        suffix = MsgCompiler::exitLoggableElement;
      } else {
        // this must be some other html tag within the velog statement, it is just a normal
        // placeholder. No suffix/prefix/closeTagPlaceholderNameToMatch is necessary.
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
              OVERLOAD_RETURN_CONFLICT,
              first.getSourceLocation().toLineColumnString());
        } else if (type1.getParameters().size() != type2.getParameters().size()) {
          // good
        } else if (type1.isAssignableFromLoose(type2) || type2.isAssignableFromLoose(type1)) {
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/passes/ResolveDottedImportsPass.java`
#### Snippet
```java
        // e.g. {call templates.body}
        nestedType = typeRegistry.intern(TemplateImportType.create(moduleType, fieldName));
      } else if (moduleType.getConstantNames().contains(fieldName)) {
        // e.g. {templates.CONST}
        // Constant import. Continue with inlining but without setting the type. Types not known
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/passes/ResolveDottedImportsPass.java`
#### Snippet
```java
        // Constant import. Continue with inlining but without setting the type. Types not known
        // until ResolveExpressionTypesPass.
      } else if (moduleType.getExternNames().contains(fieldName)) {
        // e.g. {templates.pluginFunction(1)}
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/passes/CheckTemplateCallsPass.java`
#### Snippet
```java
          }
        }
      } else if (calleeType.getKind() == SoyType.Kind.UNKNOWN) {
        // We may end up with UNKNOWN here for external calls.
      } else {
```

### EmptyStatementBody
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     */
    private byte skipEntityForward() {
      while (charIndex < length && (lastChar = text.charAt(charIndex++)) != ';') {}
      return UCharacter.DIRECTIONALITY_WHITESPACE;
    }
```

### EmptyStatementBody
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex < length && (lastChar = text.charAt(charIndex++)) != quote) {}
        }
      }
```

### EmptyStatementBody
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex > 0 && (lastChar = text.charAt(--charIndex)) != quote) {}
        }
      }
```

### EmptyStatementBody
`while` statement has empty body
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java
        // Pop tags until we pop one that matches the current closing tag. This means we're
        // effectively automatically closing tags that aren't explicitly closed.
        while (!preserveWhitespaceStack.isEmpty()
            && !preserveWhitespaceStack.pop().tagName().equals(lowerCaseTag)) {}
      } else if (matchesTag(lowerCaseTag, WS_PRESERVING_TAGS)) {
```

### EmptyStatementBody
`if` statement has empty body
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
      int end = evalRangeArg(node, args.limit());
      int length = end - start;
      if ((length ^ step) < 0) {
        // sign mismatch, step will never cause start to reach end.
      } else {
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass BasicTemplateContentKind from superclass TemplateContentKind initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java
          "Invalid value for template attribute ''kind'', expected one of "
              + ImmutableSortedSet.naturalOrder()
                  .addAll(BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.keySet())
                  .add("html<...>")
                  .build()
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicTemplateContentKind from superclass TemplateContentKind initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java

  public static final TemplateContentKind DEFAULT =
      BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(
          SanitizedContentKind.HTML.asAttributeValue());

```

### StaticInitializerReferencesSubClass
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java
   */
  public static final SimpleJavaType BOOLEAN =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Boolean",
          /* primitiveType= */ "boolean",
```

### StaticInitializerReferencesSubClass
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java

  public static final SimpleJavaType FLOAT =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Double",
          /* primitiveType= */ "double",
```

### StaticInitializerReferencesSubClass
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java

  public static final SimpleJavaType INT =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Long",
          /* primitiveType= */ "long",
```

## RuleId[id=EmptyFinallyBlock]
### EmptyFinallyBlock
Empty `finally` block
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomInteropVisitor.java`
#### Snippet
```java
      visit(node);
      return jsFilesContents;
    } finally {
    }
  }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java

      // Generates code to check the type of the base expression and call the correct getter method:
      // if (base instanceof Foo) {
      //   ((Foo) base).getMyField();
      // } else if (base instanceof Bar) {
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorErrorReporter.java`
#### Snippet
```java
    args[1] = fnClass.getName();
    args[2] = includeTriggeredInTemplateMsg ? "\nTriggered by usage in template at:" : "";
    for (int i = 0; i < additionalArgs.length; i++) {
      args[3 + i] = additionalArgs[i];
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `java/src/com/google/template/soy/msgs/internal/ExtractMsgsVisitor.java`
#### Snippet
```java

  /** Regex pattern for extracting message attributes from the message description. */
  private static final Pattern MESSAGE_ATTRIBUTE_PATTERN = Pattern.compile("\\[[^\\[\\]]*\\]");

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\#` in RegExp
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
  // Note: Need to escape hash char in regex due to Pattern.COMMENTS.
  private static final Pattern ICU_SYNTAX_CHAR_NEEDING_ESCAPE_PATTERN =
      Pattern.compile(" ' (?= ['{}\\#] ) | ' $ | [{}] ", Pattern.COMMENTS);

  /** Map from ICU syntax char to its escape sequence. */
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\'");

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\ ` in RegExp
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\ ` in RegExp
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
              HtmlContext.CSS_URI,
              TransitionSetProcessor.of(
                  makeTransitionToState(Pattern.compile("[\\)\\s]"), HtmlContext.CSS),
                  URI_PART_TRANSITION,
                  URI_START_TRANSITION,
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/jssrc/SoyJsSrcOptions.java`
#### Snippet
```java

  @Override
  public SoyJsSrcOptions clone() {
    return new SoyJsSrcOptions(this);
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java

  @Override
  public SoyPySrcOptions clone() {
    return new SoyPySrcOptions(this);
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/shared/SoyGeneralOptions.java`
#### Snippet
```java

  @Override
  public SoyGeneralOptions clone() {
    return new SoyGeneralOptions(this);
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/incrementaldomsrc/SoyIncrementalDomSrcOptions.java`
#### Snippet
```java

  @Override
  public SoyIncrementalDomSrcOptions clone() {
    return new SoyIncrementalDomSrcOptions(this);
  }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        case PROTO_EXTENSION:
          // May not be erased if other errors are present.
          return UnknownType.getInstance();

        default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
          break;
        case DEBUG_SOY_TEMPLATE_INFO:
          node.setType(BoolType.getInstance());
          break;
        case VE_DATA:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
          break;
        case LEGACY_DYNAMIC_TAG:
          node.setType(StringType.getInstance());
          break;
        case PROTO_INIT:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
        return IntegerData.forValue(((ProtoEnumValueNode) expr).getValue());
      case GLOBAL_NODE:
        return null;
      default:
        return null;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
      case PROTO_ENUM:
        // TODO(lukes): this should also assert that the value is in range
        return CheckResult.fromBool(value instanceof IntegerData);
      case RECORD:
        return CheckResult.fromBool(value instanceof SoyRecord);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
            // the autoescaper the difference, for now treat as Javascript which is pretty close
            // 😬.
            elType = ElementType.SCRIPT;
            break;
          case UNKNOWN:
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`\\p{IsDigit}` can be simplified to '\\d'
in `java/src/com/google/template/soy/data/ordainers/JsIdentifierOrdainer.java`
#### Snippet
```java
  private static final Pattern VALID_JS_IDENTIFIER_PATTERN =
      Pattern.compile(
          "^[$_\\p{IsLetter}][$_\\p{IsLetter}\\p{IsDigit}]*$", Pattern.UNICODE_CHARACTER_CLASS);

  /**
```

### RegExpSimplifiable
`\\p{IsDigit}` can be simplified to '\\d'
in `java/src/com/google/template/soy/passes/BasicHtmlValidationPass.java`
#### Snippet
```java
  // https://developer.mozilla.org/en-US/docs/Glossary/Identifier
  private static final Pattern JS_IDENTIFIER_PATTERN =
      Pattern.compile("^[$_\\p{IsLetter}][$_\\p{IsLetter}\\p{IsDigit}]*$");

  private static boolean isIdShapedValue(HtmlAttributeValueNode node) {
```

### RegExpSimplifiable
`[\\ ]` can be simplified to '\\ '
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RegExpSimplifiable
`[/]` can be simplified to '/'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RegExpSimplifiable
`[/]` can be simplified to '/'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

### RegExpSimplifiable
`[\\ ]` can be simplified to '\\ '
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

## RuleId[id=Deprecation]
### Deprecation
'registerHandler(java.lang.Class, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
public final class SoyCmdLineParser extends CmdLineParser {
  static {
    CmdLineParser.registerHandler(Module.class, ModuleOptionHandler.class);
    // overwrite the built in boolean handler
    CmdLineParser.registerHandler(Boolean.class, BooleanOptionHandler.class);
```

### Deprecation
'registerHandler(java.lang.Class, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
    CmdLineParser.registerHandler(Module.class, ModuleOptionHandler.class);
    // overwrite the built in boolean handler
    CmdLineParser.registerHandler(Boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(SoyMsgPlugin.class, MsgPluginOptionHandler.class);
```

### Deprecation
'registerHandler(java.lang.Class, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
    // overwrite the built in boolean handler
    CmdLineParser.registerHandler(Boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(SoyMsgPlugin.class, MsgPluginOptionHandler.class);
    CmdLineParser.registerHandler(Path.class, PathOptionHandler.class);
```

### Deprecation
'registerHandler(java.lang.Class, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
    CmdLineParser.registerHandler(Boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(SoyMsgPlugin.class, MsgPluginOptionHandler.class);
    CmdLineParser.registerHandler(Path.class, PathOptionHandler.class);
  }
```

### Deprecation
'registerHandler(java.lang.Class, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
    CmdLineParser.registerHandler(boolean.class, BooleanOptionHandler.class);
    CmdLineParser.registerHandler(SoyMsgPlugin.class, MsgPluginOptionHandler.class);
    CmdLineParser.registerHandler(Path.class, PathOptionHandler.class);
  }

```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
  /**
   * Returns {@code true} if this is a map (either a {@link SoyMap} or a {@link
   * SoyLegacyObjectMap}).
   */
  public static boolean isMapOrLegacyObjectMap(SoyValue value) {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
   */
  public static boolean isMapOrLegacyObjectMap(SoyValue value) {
    return value instanceof SoyMap || value instanceof SoyLegacyObjectMap;
  }

```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
   *
   * <p>Instead of writing separate implementations for {@link SoyMap} and {@link
   * SoyLegacyObjectMap}, callers can pass this a {@link SoyMap} or {@link SoyLegacyObjectMap} and
   * use the return value to only write one implementation that uses {@link SoyMap}.
   */
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
   *
   * <p>Instead of writing separate implementations for {@link SoyMap} and {@link
   * SoyLegacyObjectMap}, callers can pass this a {@link SoyMap} or {@link SoyLegacyObjectMap} and
   * use the return value to only write one implementation that uses {@link SoyMap}.
   */
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
      // plugins (which check for "instanceof SoyLegacyObjectMap" then use SoyLegacyObjectMap's
      // methods).
      return legacyObjectMapToMap((SoyLegacyObjectMap) map);
    }
  }
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java

  /** Converts the parameter to a {@link SoyMap}. */
  public static SoyMap legacyObjectMapToMap(SoyLegacyObjectMap map) {
    Map<SoyValue, SoyValueProvider> newMap = new HashMap<>();
    for (SoyValue key : map.getItemKeys()) {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
 * Utility methods for dealing with Soy maps.
 *
 * <p>These are useful for dealing with maps during the migration from {@link SoyLegacyObjectMap} to
 * {@link SoyMap}.
 */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
          .ifPresent(b -> sfsBuilder.addSoyFunctions(b.getProvider().get()));

      Optional.ofNullable(injector.getExistingBinding(new Key<Set<SoyPrintDirective>>() {}))
          .ifPresent(b -> sfsBuilder.addSoyPrintDirectives(b.getProvider().get()));
      guiceTimer.stop();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
            t);
      }
      Optional.ofNullable(injector.getExistingBinding(new Key<Set<SoyFunction>>() {}))
          .ifPresent(b -> sfsBuilder.addSoyFunctions(b.getProvider().get()));

```

### Deprecation
'setUsageWidth(int)' is deprecated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
    } catch (CmdLineException cle) {
      StringWriter sw = new StringWriter();
      cmdLineParser.setUsageWidth(100);
      cmdLineParser.printUsage(sw, /* resource bundle = */ null);
      exitWithError(String.format("%s\n\n%s\n%s", cle.getMessage(), usagePrefix, sw));
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
 * already resolved) and each value is a SoyValue (can be unresolved).
 *
 * <p>This is a new interface (compared to {@link SoyLegacyObjectMap}) that was designed for
 * supporting proto map. There are two different Soy map types, one uses ES6 map in JS, and another
 * uses plain object. This interface tries to use the same APIs as regular Java maps.
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    }

    /** Adds many {@link SoyFunction}s to the functions used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyFunctions(Iterable<? extends SoyFunction> function) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    /** Adds many {@link SoyFunction}s to the functions used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyFunctions(Iterable<? extends SoyFunction> function) {
      soyFunctions.addAll(function);
      return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    }

    /** Adds one {@link SoyPrintDirective} to the print directives used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyPrintDirective(SoyPrintDirective function) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    /** Adds one {@link SoyPrintDirective} to the print directives used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyPrintDirective(SoyPrintDirective function) {
      soyPrintDirectives.add(function);
      return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  private final ImmutableList<SoyFunction> soyFunctions;
  private final ImmutableList<SoyPrintDirective> printDirectives;
  private final ImmutableList<SoySourceFunctionDescriptor> soySourceFunctions;
  private final ImmutableList<SoySourceFunction> soyMethods;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  private final Optional<CssRegistry> cssRegistry;

  private final ImmutableList<SoyFunction> soyFunctions;
  private final ImmutableList<SoyPrintDirective> printDirectives;
  private final ImmutableList<SoySourceFunctionDescriptor> soySourceFunctions;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      SoyScopedData apiCallScopeProvider,
      SoyTypeRegistry typeRegistry,
      ImmutableList<SoyFunction> soyFunctions,
      ImmutableList<SoyPrintDirective> printDirectives,
      ImmutableList<SoySourceFunctionDescriptor> soySourceFunctions,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      SoyTypeRegistry typeRegistry,
      ImmutableList<SoyFunction> soyFunctions,
      ImmutableList<SoyPrintDirective> printDirectives,
      ImmutableList<SoySourceFunctionDescriptor> soySourceFunctions,
      ImmutableList<SoySourceFunction> soyMethods,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
          data,
          typeRegistryBuilder.build(),
          ImmutableList.<SoyFunction>builder()
              .addAll(InternalPlugins.internalLegacyFunctions())
              .addAll(soyFunctions.build())
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
              .addAll(soyFunctions.build())
              .build(),
          ImmutableList.<SoyPrintDirective>builder()
              .addAll(InternalPlugins.internalDirectives(data))
              .addAll(soyPrintDirectives.build())
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  /** Helper method to compile SoyTofu from {@link ServerCompilationPrimitives} */
  private SoyTofu doCompileToTofu(
      ServerCompilationPrimitives primitives,
      Map<String, ? extends Supplier<Object>> pluginInstances) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

    private final ImmutableSet.Builder<SoyFunction> soyFunctions = ImmutableSet.builder();
    private final ImmutableSet.Builder<SoyPrintDirective> soyPrintDirectives =
        ImmutableSet.builder();
    private final ImmutableSet.Builder<SoySourceFunctionDescriptor> sourceFunctions =
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    }

    /** Adds one {@link SoyFunction} to the functions used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyFunction(SoyFunction function) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    /** Adds one {@link SoyFunction} to the functions used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyFunction(SoyFunction function) {
      soyFunctions.add(function);
      return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private Set<SourceFilePath> generatedPathsToCheck = ImmutableSet.of();

    private final ImmutableSet.Builder<SoyFunction> soyFunctions = ImmutableSet.builder();
    private final ImmutableSet.Builder<SoyPrintDirective> soyPrintDirectives =
        ImmutableSet.builder();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    }

    /** Adds many {@link SoyPrintDirective}s to the print directives used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyPrintDirectives(Iterable<? extends SoyPrintDirective> function) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    /** Adds many {@link SoyPrintDirective}s to the print directives used by this SoyFileSet. */
    @CanIgnoreReturnValue
    public Builder addSoyPrintDirectives(Iterable<? extends SoyPrintDirective> function) {
      soyPrintDirectives.addAll(function);
      return this;
```

### Deprecation
'com.google.template.soy.SoyModule' is deprecated
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   *
   * <p>Instances of this can be obtained by calling {@link #builder()} or by installing {@link
   * SoyModule} and injecting it.
   */
  public static final class Builder {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyList.java`
#### Snippet
```java
 */
@ParametersAreNonnullByDefault
public interface SoyList extends SoyLegacyObjectMap {

  /**
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyDict.java`
#### Snippet
```java
 */
@ParametersAreNonnullByDefault
public interface SoyDict extends SoyRecord, SoyLegacyObjectMap {

  /**
```

### Deprecation
Overrides deprecated method in 'com.google.template.soy.data.SoyEasyList'
in `java/src/com/google/template/soy/data/internal/EasyListImpl.java`
#### Snippet
```java

  @Override
  public void add(SoyValueProvider valueProvider) {
    Preconditions.checkState(isMutable, "Cannot modify immutable SoyEasyList.");
    getMutableList().add(checkNotNull(valueProvider));
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java
    public SoyValue getAsSoyValue() {
      // Null will happen for default empty deltemplates.
      return (getSanitizedContentKind() == ContentKind.TEXT || getSanitizedContentKind() == null)
          ? StringData.forValue(toString())
          : SanitizedContent.create(
```

### Deprecation
'com.google.template.soy.data.SoyMapData' is deprecated
in `java/src/com/google/template/soy/data/internal/RuntimeMapTypeTracker.java`
#### Snippet
```java
 *
 * <p>This class should only be used as a collaborator by {@link DictImpl} and {@link
 * com.google.template.soy.data.SoyMapData}.
 *
 * <p>TODO(b/69051863): this should go away when legacy_object_map does.
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
    }

    protected static <V> SoyLegacyObjectMap asLegacyObjectMap(
        Map<?, V> map, Function<? super V, ? extends SoyValueProvider> valueMapper) {
      ImmutableMap.Builder<String, SoyValueProvider> builder =
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
 * these methods.
 */
public final class SoyProtoValue extends SoyAbstractValue implements SoyLegacyObjectMap, SoyRecord {
  private static final Logger logger = Logger.getLogger(SoyProtoValue.class.getName());

```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public final class SoyLegacyObjectMapImpl extends SoyAbstractValue implements SoyLegacyObjectMap {
  private final ImmutableMap<String, SoyValueProvider> map;

```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java
 *
 * <p>This class implements all three interfaces ({@link
 * com.google.template.soy.data.SoyLegacyObjectMap}, {@link SoyMap}, and {@link
 * com.google.template.soy.data.SoyRecord} respectively). It would be easy to allow a DictImpl
 * instance to behave as one type (say, a legacy object map) and then another (say, a map) at
```

### Deprecation
'com.google.template.soy.data.SoyMapData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   * @return The SoyMapData at the specified key string, or null if no data is stored there.
   */
  public SoyMapData getMapData(String keyStr) {
    return (SoyMapData) get(keyStr);
  }
```

### Deprecation
'com.google.template.soy.data.SoyMapData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   */
  public SoyMapData getMapData(String keyStr) {
    return (SoyMapData) get(keyStr);
  }

```

### Deprecation
'com.google.template.soy.data.SoyListData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
        // first char is sufficient).
        nextCollectionData =
             Character.isDigit(keys.get(i + 1).charAt(0)) ? new SoyListData() : new SoyMapData();
        collectionData.putSingle(keys.get(i), nextCollectionData);
      }
```

### Deprecation
'com.google.template.soy.data.SoyMapData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
        // first char is sufficient).
        nextCollectionData =
             Character.isDigit(keys.get(i + 1).charAt(0)) ? new SoyListData() : new SoyMapData();
        collectionData.putSingle(keys.get(i), nextCollectionData);
      }
```

### Deprecation
'com.google.template.soy.data.SoyListData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   * @return The SoyListData at the specified key string, or null if no data is stored there.
   */
  public SoyListData getListData(String keyStr) {
    return (SoyListData) get(keyStr);
  }
```

### Deprecation
'com.google.template.soy.data.SoyListData' is deprecated
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   */
  public SoyListData getListData(String keyStr) {
    return (SoyListData) get(keyStr);
  }

```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/NamespacedTofu.java`
#### Snippet
```java

  @Override
  public SoyTofu forNamespace(@Nullable String namespace) {
    if (namespace == null) {
      return baseTofu;
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/NamespacedTofu.java`
#### Snippet
```java
   * @param namespace The namespace for this SoyTofu object.
   */
  public NamespacedTofu(SoyTofu baseTofu, String namespace) {
    Preconditions.checkNotNull(baseTofu);
    this.baseTofu = baseTofu;
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/NamespacedTofu.java`
#### Snippet
```java

  /** The underlying Tofu object. */
  private final SoyTofu baseTofu;

  /** The namespace of this SoyTofu object. */
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/NamespacedTofu.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public final class NamespacedTofu implements SoyTofu {

  /** The underlying Tofu object. */
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/Expression.java`
#### Snippet
```java
   * Returns true if this chunk can be represented as a single expression. This method should be
   * rarely used, but is needed when interoperating with parts of the codegen system that do not yet
   * understand CodeChunks (e.g. {@link com.google.template.soy.jssrc.restricted.SoyJsSrcFunction}).
   */
  final boolean isRepresentableAsSingleExpression() {
```

### Deprecation
'getName()' is deprecated
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
  @Override
  public ImmutableSortedSet<String> getUsedIjParamsForTemplate(SoyTemplateInfo templateInfo) {
    return getUsedIjParamsForTemplate(templateInfo.getName());
  }

```

### Deprecation
'getName()' is deprecated
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
  @Override
  public RendererImpl newRenderer(SoyTemplateInfo templateInfo) {
    return new RendererImpl(this, templateInfo.getName(), null);
  }

```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public final class BaseTofu implements SoyTofu {

  /** The scope object that manages the API call scope. */
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java

  @Override
  public SoyTofu forNamespace(@Nullable String namespace) {
    return (namespace == null) ? this : new NamespacedTofu(this, namespace);
  }
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
  public static Expression applyDirective(
      Expression expr,
      SoyJsSrcPrintDirective directive,
      List<Expression> args,
      SourceLocation location,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
      arg.collectRequires(requiresBuilder::add);
    }
    if (directive instanceof SoyLibraryAssistedJsSrcPrintDirective) {
      for (String name :
          ((SoyLibraryAssistedJsSrcPrintDirective) directive).getRequiredJsLibNames()) {
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
    if (directive instanceof SoyLibraryAssistedJsSrcPrintDirective) {
      for (String name :
          ((SoyLibraryAssistedJsSrcPrintDirective) directive).getRequiredJsLibNames()) {
        requiresBuilder.add(GoogRequire.create(name));
      }
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java

  public static Expression applySoyFunction(
      SoyJsSrcFunction soyJsSrcFunction,
      List<Expression> args,
      SourceLocation location,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java

    // Compute the function on the JsExpr inputs.
    if (soyJsSrcFunction instanceof SoyLibraryAssistedJsSrcFunction) {
      Collection<String> requires = ImmutableSet.of();
      try {
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
      Collection<String> requires = ImmutableSet.of();
      try {
        requires = ((SoyLibraryAssistedJsSrcFunction) soyJsSrcFunction).getRequiredJsLibNames();
      } catch (Throwable t) {
        report(location, soyJsSrcFunction, t, errorReporter);
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
        location,
        UNEXPECTED_PLUGIN_ERROR,
        obj instanceof SoyJsSrcFunction ? "function" : "directive",
        obj instanceof SoyJsSrcFunction
            ? ((SoyJsSrcFunction) obj).getName()
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
        UNEXPECTED_PLUGIN_ERROR,
        obj instanceof SoyJsSrcFunction ? "function" : "directive",
        obj instanceof SoyJsSrcFunction
            ? ((SoyJsSrcFunction) obj).getName()
            : ((SoyJsSrcPrintDirective) obj).getName(),
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
        obj instanceof SoyJsSrcFunction ? "function" : "directive",
        obj instanceof SoyJsSrcFunction
            ? ((SoyJsSrcFunction) obj).getName()
            : ((SoyJsSrcPrintDirective) obj).getName(),
        obj.getClass().getName(),
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
        obj instanceof SoyJsSrcFunction
            ? ((SoyJsSrcFunction) obj).getName()
            : ((SoyJsSrcPrintDirective) obj).getName(),
        obj.getClass().getName(),
        Throwables.getStackTraceAsString(t));
```

### Deprecation
'digit()' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/JsSrcNameGenerators.java`
#### Snippet
```java
  public static final CharMatcher DANGEROUS_CHARACTERS =
      CharMatcher.ascii()
          .or(CharMatcher.digit())
          .or(CharMatcher.anyOf("_$"))
          .negate()
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenJsExprsVisitor.java`
#### Snippet
```java

      // Get directive.
      SoyPrintDirective directive = directiveNode.getPrintDirective();
      if (!(directive instanceof SoyJsSrcPrintDirective)) {
        errorReporter.report(
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenJsExprsVisitor.java`
#### Snippet
```java
      // Get directive.
      SoyPrintDirective directive = directiveNode.getPrintDirective();
      if (!(directive instanceof SoyJsSrcPrintDirective)) {
        errorReporter.report(
            node.getSourceLocation(), UNKNOWN_SOY_JS_SRC_PRINT_DIRECTIVE, directiveNode.getName());
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenJsExprsVisitor.java`
#### Snippet
```java
          SoyJsPluginUtils.applyDirective(
              expr,
              (SoyJsSrcPrintDirective) directive,
              argChunks,
              node.getSourceLocation(),
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
    ImmutableSet.Builder<GoogRequire> requiresBuilder = ImmutableSet.builder();
    call.collectRequires(requiresBuilder::add);
    for (SoyPrintDirective directive : callNode.getEscapingDirectives()) {
      checkState(
          directive instanceof SoyJsSrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
    for (SoyPrintDirective directive : callNode.getEscapingDirectives()) {
      checkState(
          directive instanceof SoyJsSrcPrintDirective,
          "Contextual autoescaping produced a bogus directive: %s",
          directive.getName());
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
          directive.getName());
      callResult =
          ((SoyJsSrcPrintDirective) directive).applyForJsSrc(callResult, ImmutableList.of());
      if (directive instanceof SoyLibraryAssistedJsSrcPrintDirective) {
        for (String name :
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
      callResult =
          ((SoyJsSrcPrintDirective) directive).applyForJsSrc(callResult, ImmutableList.of());
      if (directive instanceof SoyLibraryAssistedJsSrcPrintDirective) {
        for (String name :
            ((SoyLibraryAssistedJsSrcPrintDirective) directive).getRequiredJsLibNames()) {
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
      if (directive instanceof SoyLibraryAssistedJsSrcPrintDirective) {
        for (String name :
            ((SoyLibraryAssistedJsSrcPrintDirective) directive).getRequiredJsLibNames()) {
          requiresBuilder.add(GoogRequire.create(name));
        }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
    }
    // handle escaping
    for (SoyPrintDirective printDirective : node.getEscapingDirectives()) {
      msg =
          SoyJsPluginUtils.applyDirective(
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
          SoyJsPluginUtils.applyDirective(
              msg,
              (SoyJsSrcPrintDirective) printDirective,
              /* args= */ ImmutableList.of(),
              node.getSourceLocation(),
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyCallExprVisitor.java`
#### Snippet
```java
   * @return A PyExpr containing the call expression with all directives applied.
   */
  private PyExpr escapeCall(String callExpr, ImmutableList<SoyPrintDirective> directives) {
    PyExpr escapedExpr = new PyExpr(callExpr, Integer.MAX_VALUE);
    if (directives.isEmpty()) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyCallExprVisitor.java`
#### Snippet
```java

    // Successively wrap each escapedExpr in various directives.
    for (SoyPrintDirective directive : directives) {
      Preconditions.checkState(
          directive instanceof SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyCallExprVisitor.java`
#### Snippet
```java
    for (SoyPrintDirective directive : directives) {
      Preconditions.checkState(
          directive instanceof SoyPySrcPrintDirective,
          "Autoescaping produced a bogus directive: %s",
          directive.getName());
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyCallExprVisitor.java`
#### Snippet
```java
          directive.getName());
      escapedExpr =
          ((SoyPySrcPrintDirective) directive).applyForPySrc(escapedExpr, ImmutableList.of());
    }
    return escapedExpr;
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
      return variableMappings.get(ref.name()).call(visitChildren(node));
    } else {
      if (!(soyFunction instanceof SoyJsSrcFunction)) {
        errorReporter.report(
            node.getSourceLocation(),
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java

      return SoyJsPluginUtils.applySoyFunction(
          (SoyJsSrcFunction) soyFunction,
          visitChildren(node),
          node.getSourceLocation(),
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java

  private static SoyJsSrcFunction getUnknownFunction(final String name, final int argSize) {
    return new SoyJsSrcFunction() {
      @Override
      public JsExpr computeForJsSrc(List<JsExpr> args) {
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcFunction' is deprecated
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
  }

  private static SoyJsSrcFunction getUnknownFunction(final String name, final int argSize) {
    return new SoyJsSrcFunction() {
      @Override
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java

    // Escaping directives apply to messages, especially in attribute context.
    for (SoyPrintDirective directive : node.getEscapingDirectives()) {
      Preconditions.checkState(
          directive instanceof SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java
    for (SoyPrintDirective directive : node.getEscapingDirectives()) {
      Preconditions.checkState(
          directive instanceof SoyPySrcPrintDirective,
          "Contextual autoescaping produced a bogus directive: %s",
          directive.getName());
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java
          "Contextual autoescaping produced a bogus directive: %s",
          directive.getName());
      msg = ((SoyPySrcPrintDirective) directive).applyForPySrc(msg, ImmutableList.of());
    }
    pyExprs.add(msg);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java

      // Get directive.
      SoyPrintDirective directive = directiveNode.getPrintDirective();
      if (!(directive instanceof SoyPySrcPrintDirective)) {
        errorReporter.report(
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java
      // Get directive.
      SoyPrintDirective directive = directiveNode.getPrintDirective();
      if (!(directive instanceof SoyPySrcPrintDirective)) {
        errorReporter.report(
            directiveNode.getSourceLocation(),
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java

      // Apply directive.
      pyExpr = ((SoyPySrcPrintDirective) directive).applyForPySrc(pyExpr, argsPyExprs);
    }

```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcFunction' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   *
   * @see BuiltinFunction
   * @see SoyPySrcFunction
   */
  @Override
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcFunction' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
          (SoyPythonSourceFunction) soyFunction,
          visitChildren(node));
    } else if (soyFunction instanceof SoyPySrcFunction) {
      List<PyExpr> args = visitChildren(node);
      return ((SoyPySrcFunction) soyFunction).computeForPySrc(args);
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcFunction' is deprecated
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    } else if (soyFunction instanceof SoyPySrcFunction) {
      List<PyExpr> args = visitChildren(node);
      return ((SoyPySrcFunction) soyFunction).computeForPySrc(args);
    } else if (soyFunction instanceof LoggingFunction) {
      // trivial logging function support
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/RenderContextExpression.java`
#### Snippet
```java
  }

  SoyExpression applyPrintDirective(SoyPrintDirective directive, SoyExpression value) {
    return applyPrintDirective(directive, value, ImmutableList.of());
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/RenderContextExpression.java`
#### Snippet
```java

  SoyExpression applyPrintDirective(
      SoyPrintDirective directive, SoyExpression value, List<SoyExpression> args) {
    if (directive instanceof SoyJbcSrcPrintDirective) {
      value = ((SoyJbcSrcPrintDirective) directive).applyForJbcSrc(this, value, args);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
   */
  static AppendableAndFlushBuffersDepth applyStreamingEscapingDirectives(
      List<SoyPrintDirective> directives,
      AppendableExpression appendable,
      JbcSrcPluginContext context) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
    checkArgument(!directives.isEmpty());
    List<StreamingDirectiveWithArgs> directivesToApply = new ArrayList<>();
    for (SoyPrintDirective directive : directives) {
      directivesToApply.add(
          StreamingDirectiveWithArgs.create((SoyJbcSrcPrintDirective.Streamable) directive));
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
import java.util.List;

/** Utilities for working with {@link SoyPrintDirective print directives}. */
final class PrintDirectives {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java

  static boolean areAllPrintDirectivesStreamable(
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (SoyPrintDirective directive : escapingDirectives) {
      if (!(directive instanceof SoyJbcSrcPrintDirective.Streamable)) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
  static boolean areAllPrintDirectivesStreamable(
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (SoyPrintDirective directive : escapingDirectives) {
      if (!(directive instanceof SoyJbcSrcPrintDirective.Streamable)) {
        return false;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
  /** Handles a translation consisting of a single raw text node. */
  private Statement handleBasicTranslation(
      MsgNode msg, List<SoyPrintDirective> escapingDirectives, Expression soyMsgParts) {
    // optimize for simple constant translations (very common)
    // this becomes: renderContext.getSoyMessge(<id>).getParts().get(0).getRawText()
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
    // Note: there is no point in trying to stream here, since we are starting with a constant
    // string.
    for (SoyPrintDirective directive : escapingDirectives) {
      text = parameterLookup.getRenderContext().applyPrintDirective(directive, text);
    }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
   */
  Statement compileMessage(
      MsgPartsAndIds partsAndId, MsgNode msg, ImmutableList<SoyPrintDirective> escapingDirectives) {
    Expression soyMsgDefaultParts = compileDefaultMessagePartsConstant(partsAndId);
    Expression soyMsgParts =
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
  private Statement handleTranslationWithPlaceholders(
      MsgNode msg,
      ImmutableList<SoyPrintDirective> escapingDirectives,
      Expression soyMsgParts,
      Expression locale,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
                      : msgRendererVar.accessor().invoke(MethodRef.SOY_VALUE_PROVIDER_RESOLVE))
                  .checkedCast(SOY_STRING_TYPE));
      for (SoyPrintDirective directive : escapingDirectives) {
        value = parameterLookup.getRenderContext().applyPrintDirective(directive, value);
      }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
        scopedData.enterable(),
        userFunctions, // We don't need internal functions because they only matter at compile time
        ImmutableList.<SoyPrintDirective>builder()
            // but internal directives are still required at render time.
            // in order to handle escaping logging function invocations.
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  SoySauceBuilder withDirectives(
      Iterable<? extends SoyPrintDirective> userDirectives) {
    this.userDirectives = InternalPlugins.filterDuplicateDirectives(userDirectives);
    return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
/** Constructs {@link SoySauce} implementations. */
public final class SoySauceBuilder {
  private ImmutableList<SoyFunction> userFunctions = ImmutableList.of();
  private ImmutableList<SoyPrintDirective> userDirectives = ImmutableList.of();
  private PluginInstances userPluginInstances = PluginInstances.empty();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
public final class SoySauceBuilder {
  private ImmutableList<SoyFunction> userFunctions = ImmutableList.of();
  private ImmutableList<SoyPrintDirective> userDirectives = ImmutableList.of();
  private PluginInstances userPluginInstances = PluginInstances.empty();
  private CompiledTemplates.Factory compiledTemplatesFactory = CompiledTemplates::new;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  SoySauceBuilder withFunctions(
      Iterable<? extends SoyFunction> userFunctions) {
    this.userFunctions = InternalPlugins.filterDuplicateFunctions(userFunctions);
    return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/LegacyFunctionAdapter.java`
#### Snippet
```java
public final class LegacyFunctionAdapter {

  private final SoyJavaFunction legacyFn;

  public LegacyFunctionAdapter(SoyJavaFunction legacyFn) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/LegacyFunctionAdapter.java`
#### Snippet
```java
  private final SoyJavaFunction legacyFn;

  public LegacyFunctionAdapter(SoyJavaFunction legacyFn) {
    this.legacyFn = legacyFn;
  }
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
    @Override
    public WriteContinuation renderText(AdvisingAppendable out) throws IOException {
      return startRender(out, ContentKind.TEXT);
    }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
  private final SoyScopedData.Enterable apiCallScope;
  private final PluginInstances pluginInstances;
  private final ImmutableMap<String, SoyJavaPrintDirective> printDirectives;

  public SoySauceImpl(
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java

    private void enforceContentKind(ContentKind expectedContentKind) {
      if (expectedContentKind == ContentKind.TEXT) {
        // Allow any template to be called as text.
        return;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
      CompiledTemplates templates,
      SoyScopedData.Enterable apiCallScope,
      ImmutableList<? extends SoyFunction> functions,
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      PluginInstances pluginInstances) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
      SoyScopedData.Enterable apiCallScope,
      ImmutableList<? extends SoyFunction> functions,
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      PluginInstances pluginInstances) {
    this.templates = checkNotNull(templates);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
    ImmutableMap.Builder<String, Supplier<Object>> pluginInstanceBuilder = ImmutableMap.builder();

    for (SoyFunction fn : functions) {
      if (fn instanceof SoyJavaFunction) {
        pluginInstanceBuilder.put(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java

    for (SoyFunction fn : functions) {
      if (fn instanceof SoyJavaFunction) {
        pluginInstanceBuilder.put(
            fn.getName(), Suppliers.ofInstance(new LegacyFunctionAdapter((SoyJavaFunction) fn)));
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
      if (fn instanceof SoyJavaFunction) {
        pluginInstanceBuilder.put(
            fn.getName(), Suppliers.ofInstance(new LegacyFunctionAdapter((SoyJavaFunction) fn)));
      }
    }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
    // SoySauce has no need for SoyPrintDirectives that are not SoyJavaPrintDirectives.
    // Filter them out.
    ImmutableMap.Builder<String, SoyJavaPrintDirective> soyJavaPrintDirectives =
        ImmutableMap.builder();
    for (SoyPrintDirective printDirective : printDirectives) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
    ImmutableMap.Builder<String, SoyJavaPrintDirective> soyJavaPrintDirectives =
        ImmutableMap.builder();
    for (SoyPrintDirective printDirective : printDirectives) {
      if (printDirective instanceof SoyJavaPrintDirective) {
        soyJavaPrintDirectives.put(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
        ImmutableMap.builder();
    for (SoyPrintDirective printDirective : printDirectives) {
      if (printDirective instanceof SoyJavaPrintDirective) {
        soyJavaPrintDirectives.put(
            printDirective.getName(), (SoyJavaPrintDirective) printDirective);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
      if (printDirective instanceof SoyJavaPrintDirective) {
        soyJavaPrintDirectives.put(
            printDirective.getName(), (SoyJavaPrintDirective) printDirective);
      }
    }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
    public Builder(
        CompiledTemplates templates,
        ImmutableMap<String, SoyJavaPrintDirective> soyJavaDirectivesMap,
        PluginInstances pluginInstances) {
      this.templates = templates;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
  }

  public SoyJavaPrintDirective getPrintDirective(String name) {
    SoyJavaPrintDirective printDirective = soyJavaDirectivesMap.get(name);
    if (printDirective == null) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java

  public SoyJavaPrintDirective getPrintDirective(String name) {
    SoyJavaPrintDirective printDirective = soyJavaDirectivesMap.get(name);
    if (printDirective == null) {
      throw new IllegalStateException(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
  private RenderContext(
      CompiledTemplates templates,
      ImmutableMap<String, SoyJavaPrintDirective> soyJavaDirectivesMap,
      PluginInstances pluginInstances,
      @Nullable Predicate<String> activeModSelector,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java

  public Function<String, String> getEscapingDirectiveAsFunction(String name) {
    final SoyJavaPrintDirective printDirective = soyJavaDirectivesMap.get(name);
    if (printDirective == null) {
      throw new IllegalStateException(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
  public static final class Builder {
    private final CompiledTemplates templates;
    private final ImmutableMap<String, SoyJavaPrintDirective> soyJavaDirectivesMap;
    private PluginInstances pluginInstances;
    private Predicate<String> activeModSelector;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
  private final SoyIdRenamingMap xidRenamingMap;
  private final PluginInstances pluginInstances;
  private final ImmutableMap<String, SoyJavaPrintDirective> soyJavaDirectivesMap;
  /** The bundle of translated messages */
  private final SoyMsgBundle msgBundle;
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        }
      } else {
        Expression map = baseExpr.box().checkedCast(SoyLegacyObjectMap.class);
        SoyExpression index = keyExpr.box();
        if (analysis.isResolved(node)) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    MsgNode msg = node.getMsg();
    MsgPartsAndIds idAndParts = MsgUtils.buildMsgPartsAndComputeMsgIdForDualFormat(msg);
    ImmutableList<SoyPrintDirective> escapingDirectives = node.getEscapingDirectives();
    Statement renderDefault = getMsgCompiler().compileMessage(idAndParts, msg, escapingDirectives);
    // fallback groups have 1 or 2 children.  if there are 2 then the second is a fallback and we
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  private Expression getEscapingDirectivesList(CallNode node) {
    ImmutableList<SoyPrintDirective> escapingDirectives = node.getEscapingDirectives();
    List<Expression> directiveExprs = new ArrayList<>(escapingDirectives.size());
    for (SoyPrintDirective directive : escapingDirectives) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    ImmutableList<SoyPrintDirective> escapingDirectives = node.getEscapingDirectives();
    List<Expression> directiveExprs = new ArrayList<>(escapingDirectives.size());
    for (SoyPrintDirective directive : escapingDirectives) {
      directiveExprs.add(parameterLookup.getRenderContext().getPrintDirective(directive.getName()));
    }
```

### Deprecation
'propagateIfInstanceOf(java.lang.Throwable, java.lang.Class)' is deprecated
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
      // Attach additional information in a suppressed exception to make debugging easier.
      t.addSuppressed(new RuntimeException("Failed to load generated class:\n" + classDef));
      Throwables.propagateIfInstanceOf(t, ClassNotFoundException.class);
      throw Throwables.propagate(t);
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
      t.addSuppressed(new RuntimeException("Failed to load generated class:\n" + classDef));
      Throwables.propagateIfInstanceOf(t, ClassNotFoundException.class);
      throw Throwables.propagate(t);
    }
  }
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyExpression.java`
#### Snippet
```java
      ContentKind kind =
          Converters.toContentKind(((SanitizedType) type.soyType()).getContentKind());
      checkState(kind != ContentKind.TEXT); // sanity check
      FieldRef.enumReference(kind).accessStaticUnchecked(adapter);
      MethodRef.ORDAIN_AS_SAFE.invokeUnchecked(adapter);
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
          JbcSrcRuntime.class,
          "getSoyLegacyObjectMapItem",
          SoyLegacyObjectMap.class,
          SoyValue.class);

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
              JbcSrcRuntime.class,
              "applyPrintDirective",
              SoyJavaPrintDirective.class,
              SoyValue.class,
              List.class)
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
          JbcSrcRuntime.class,
          "getSoyLegacyObjectMapItemProvider",
          SoyLegacyObjectMap.class,
          SoyValue.class);

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
      } else if (needsSpaceForAttribute && node.getStaticKey() == null) {
        // use a print directive to conditionally add a whitespace for dynamic attributes.
        SoyPrintDirective whitespaceDirective =
            new BasicEscapeDirective.WhitespaceHtmlAttributesDirective();
        if (node.getChild(0) instanceof PrintNode) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
          CallNode typed = (CallNode) node.getChild(0);
          typed.setEscapingDirectives(
              ImmutableList.<SoyPrintDirective>builder()
                  .addAll(typed.getEscapingDirectives())
                  .add(whitespaceDirective)
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    }

    EscapedCompiledTemplate(CompiledTemplate delegate, List<SoyJavaPrintDirective> directives) {
      this.delegate = checkNotNull(delegate);
      this.directives = ImmutableList.copyOf(directives);
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  public static SoyValue getSoyLegacyObjectMapItem(
      SoyLegacyObjectMap legacyObjectMap, SoyValue key) {
    Preconditions.checkNotNull(legacyObjectMap, "Attempted to access map item '%s' of null", key);
    return legacyObjectMap.getItem(key);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
   */
  public static CompiledTemplate applyEscapers(
      CompiledTemplate delegate, ImmutableList<SoyJavaPrintDirective> directives) {
    checkState(!directives.isEmpty());
    return new EscapedCompiledTemplate(delegate, directives);
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  }

  public static SoyLegacyObjectMap boxJavaMapAsSoyLegacyObjectMap(Map<String, ?> javaMap) {
    return new SoyLegacyObjectMapImpl(javaMapAsProviderMap(javaMap));
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
      if (result.isDone()) {
        SoyValue resultData = buffer.getAsSoyValue();
        for (SoyJavaPrintDirective directive : directives) {
          resultData = directive.applyForJava(resultData, ImmutableList.of());
        }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
   */
  public static SoyValue applyPrintDirective(
      SoyJavaPrintDirective directive, SoyValue value, List<SoyValue> args) {
    value = value == null ? NullData.INSTANCE : value;
    for (int i = 0; i < args.size(); i++) {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  public static SoyValueProvider getSoyLegacyObjectMapItemProvider(
      SoyLegacyObjectMap legacyObjectMap, SoyValue key) {
    if (legacyObjectMap == null) {
      throw new NullPointerException("Attempted to access map item '" + key + "' of null");
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // functions but not annotated.
    @SuppressWarnings("Immutable")
    private final ImmutableList<SoyJavaPrintDirective> directives;

    static class SaveRestoreState {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
  public static final Type SANITIZED_CONTENT_TYPE = Type.getType(SanitizedContent.class);
  public static final Type SOY_LIST_TYPE = Type.getType(SoyList.class);
  public static final Type SOY_LEGACY_OBJECT_MAP_TYPE = Type.getType(SoyLegacyObjectMap.class);
  public static final Type SOY_MAP_TYPE = Type.getType(SoyMap.class);
  public static final Type SOY_PROTO_VALUE_TYPE = Type.getType(SoyProtoValue.class);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
  }

  private static boolean isTrustedResourceUri(List<SoyPrintDirective> printDirectives) {
    for (SoyPrintDirective printDirectiveNode : Lists.reverse(printDirectives)) {
      if (printDirectiveNode.getName().equals("|filterTrustedResourceUri")) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java

  private static boolean isTrustedResourceUri(List<SoyPrintDirective> printDirectives) {
    for (SoyPrintDirective printDirectiveNode : Lists.reverse(printDirectives)) {
      if (printDirectiveNode.getName().equals("|filterTrustedResourceUri")) {
        return true;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
    for (PrintDirectiveNode printDirectiveNode : Lists.reverse(node.getChildren())) {
      if (!printDirectiveNode.isSynthetic()) {
        SoyPrintDirective printDirective = printDirectiveNode.getPrintDirective();
        return printDirective instanceof SanitizedContentOperator
            ? ((SanitizedContentOperator) printDirective).getContentKind()
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
      if (!printDirectiveNode.isSynthetic()) {
        SoyPrintDirective printDirective = printDirectiveNode.getPrintDirective();
        return printDirective instanceof SanitizedContentOperator
            ? ((SanitizedContentOperator) printDirective).getContentKind()
            : ContentKind.TEXT;
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
        SoyPrintDirective printDirective = printDirectiveNode.getPrintDirective();
        return printDirective instanceof SanitizedContentOperator
            ? ((SanitizedContentOperator) printDirective).getContentKind()
            : ContentKind.TEXT;
      }
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
        return printDirective instanceof SanitizedContentOperator
            ? ((SanitizedContentOperator) printDirective).getContentKind()
            : ContentKind.TEXT;
      }
    }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/AutoescaperPass.java`
#### Snippet
```java
  AutoescaperPass(
      ErrorReporter errorReporter,
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      boolean autoescaperEnabled,
      Supplier<FileSetMetadata> templateRegistryFull) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/AutoescaperPass.java`
#### Snippet
```java

  private final ErrorReporter errorReporter;
  private final ImmutableList<? extends SoyPrintDirective> printDirectives;
  private final boolean autoescaperEnabled;
  private final Supplier<FileSetMetadata> templateRegistryFull;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java

  private final ErrorReporter errorReporter;
  private final ImmutableList<? extends SoyPrintDirective> printDirectives;
  private final Supplier<FileSetMetadata> templateRegistryFull;
  private final boolean desugarIdomFeatures;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
  SoyElementCompositionPass(
      ErrorReporter errorReporter,
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      Supplier<FileSetMetadata> templateRegistryFull,
      boolean desugarIdomFeatures) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
   * will be returned if it cannot be found.
   */
  public SoyPrintDirective lookupPrintDirective(String name, int numArgs, SourceLocation location) {
    SoyPrintDirective soyPrintDirective = printDirectives.get(name);
    if (soyPrintDirective == null) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
   */
  public SoyPrintDirective lookupPrintDirective(String name, int numArgs, SourceLocation location) {
    SoyPrintDirective soyPrintDirective = printDirectives.get(name);
    if (soyPrintDirective == null) {
      reportMissing(location, "print directive", name, printDirectives.keySet());
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java

  private final Mode mode;
  private final ImmutableMap<String, SoyPrintDirective> printDirectives;
  private final ImmutableMap<String, Object> functions;
  private final ImmutableSetMultimap<String, SoySourceFunction> methodsByName;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java

  private static Set<Integer> getValidArgsSizes(Object soyFunction) {
    if (soyFunction instanceof SoyFunction) {
      return ((SoyFunction) soyFunction).getValidArgsSizes();
    } else {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
  private static Set<Integer> getValidArgsSizes(Object soyFunction) {
    if (soyFunction instanceof SoyFunction) {
      return ((SoyFunction) soyFunction).getValidArgsSizes();
    } else {
      SoyFunctionSignature signature =
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
  public PluginResolver(
      Mode mode,
      List<SoyPrintDirective> soyPrintDirectives,
      List<SoyFunction> soyFunctions,
      List<SoySourceFunctionDescriptor> sourceFunctions,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
      Mode mode,
      List<SoyPrintDirective> soyPrintDirectives,
      List<SoyFunction> soyFunctions,
      List<SoySourceFunctionDescriptor> sourceFunctions,
      List<SoySourceFunction> soyMethods,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
        }
      } else {
        SoyFunction legacyFunction = (SoyFunction) function;
        name = legacyFunction.getName();
      }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
        }
      } else {
        SoyFunction legacyFunction = (SoyFunction) function;
        name = legacyFunction.getName();
      }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
    this.functionToDesc = functionToDesc.buildOrThrow();

    Map<String, SoyPrintDirective> indexedDirectives =
        Maps.newLinkedHashMapWithExpectedSize(soyPrintDirectives.size());
    for (SoyPrintDirective directive : soyPrintDirectives) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
    Map<String, SoyPrintDirective> indexedDirectives =
        Maps.newLinkedHashMapWithExpectedSize(soyPrintDirectives.size());
    for (SoyPrintDirective directive : soyPrintDirectives) {
      SoyPrintDirective old = indexedDirectives.put(directive.getName(), directive);
      if (old != null) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
        Maps.newLinkedHashMapWithExpectedSize(soyPrintDirectives.size());
    for (SoyPrintDirective directive : soyPrintDirectives) {
      SoyPrintDirective old = indexedDirectives.put(directive.getName(), directive);
      if (old != null) {
        reporter.report(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
  }

  private static SoyPrintDirective createPlaceholderPrintDirective(final String name, int arity) {
    final ImmutableSet<Integer> validArgSizes = ImmutableSet.of(arity);
    return new SoyPrintDirective() {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
  private static SoyPrintDirective createPlaceholderPrintDirective(final String name, int arity) {
    final ImmutableSet<Integer> validArgSizes = ImmutableSet.of(arity);
    return new SoyPrintDirective() {
      @Override
      public String getName() {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    public Builder setSoyPrintDirectives(
        ImmutableList<? extends SoyPrintDirective> printDirectives) {
      this.soyPrintDirectives = checkNotNull(printDirectives);
      return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
    // TODO(lukes): combine with the print directive map
    private PluginResolver pluginResolver;
    private ImmutableList<? extends SoyPrintDirective> soyPrintDirectives;
    private ErrorReporter errorReporter;
    private SoyGeneralOptions options;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/internal/ShortCircuitables.java`
#### Snippet
```java
   * case where we skip escaping and but the escapers would actually modify the input.
   */
  public static <T extends SoyPrintDirective> ImmutableList<T> filterDirectivesForKind(
      ContentKind kind, ImmutableList<T> directives) {
    for (int i = 0; i < directives.size(); i++) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/internal/BuiltinFunction.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public enum BuiltinFunction implements SoyFunction {
  CHECK_NOT_NULL("checkNotNull"),
  /**
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyFunctions.java`
#### Snippet
```java
   * Returns whether `function` is a pure function.
   *
   * @throws ClassCastException if `function` is not a {@link SoyFunction} or {@link
   *     SoySourceFunction}.
   */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyFunctions.java`
#### Snippet
```java
   */
  public static boolean isPure(Object function) {
    if (function instanceof SoyFunction) {
      return ((SoyFunction) function).isPure();
    } else if (function instanceof SoySourceFunction) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyFunctions.java`
#### Snippet
```java
  public static boolean isPure(Object function) {
    if (function instanceof SoyFunction) {
      return ((SoyFunction) function).isPure();
    } else if (function instanceof SoySourceFunction) {
      return function.getClass().isAnnotationPresent(SoyPureFunction.class);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyFunctions.java`
#### Snippet
```java

/**
 * Utility methods related to Soy functions and their two class hierarchies, {@link SoyFunction} and
 * {@link SoySourceFunction}.
 */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
   * in multiple places. Ideally that would be an error, but it is common.
   */
  public static ImmutableList<SoyFunction> filterDuplicateFunctions(
      Iterable<? extends SoyFunction> functions) {
    return filterDuplicates(functions, SoyFunction::getName);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
   */
  public static ImmutableList<SoyFunction> filterDuplicateFunctions(
      Iterable<? extends SoyFunction> functions) {
    return filterDuplicates(functions, SoyFunction::getName);
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
  public static ImmutableList<SoyFunction> filterDuplicateFunctions(
      Iterable<? extends SoyFunction> functions) {
    return filterDuplicates(functions, SoyFunction::getName);
  }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
   * directives in multiple places. Ideally that would be an error, but it is common.
   */
  public static ImmutableList<SoyPrintDirective> filterDuplicateDirectives(
      Iterable<? extends SoyPrintDirective> directives) {
    return filterDuplicates(directives, SoyPrintDirective::getName);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
   */
  public static ImmutableList<SoyPrintDirective> filterDuplicateDirectives(
      Iterable<? extends SoyPrintDirective> directives) {
    return filterDuplicates(directives, SoyPrintDirective::getName);
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
  public static ImmutableList<SoyPrintDirective> filterDuplicateDirectives(
      Iterable<? extends SoyPrintDirective> directives) {
    return filterDuplicates(directives, SoyPrintDirective::getName);
  }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
  private InternalPlugins() {}

  public static ImmutableList<SoyFunction> internalLegacyFunctions() {
    return ImmutableList.copyOf(BuiltinFunction.values());
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java
  }

  public static ImmutableList<SoyPrintDirective> internalDirectives(
      final SoyScopedData soyScopedData) {
    Supplier<BidiGlobalDir> bidiProvider = soyScopedData::getBidiGlobalDir;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyDeprecated.java`
#### Snippet
```java

/**
 * Annotation for {@link SoyFunction} or {@link SoyPrintDirective} types that marks it as
 * deprecated.
 *
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/shared/restricted/SoyDeprecated.java`
#### Snippet
```java

/**
 * Annotation for {@link SoyFunction} or {@link SoyPrintDirective} types that marks it as
 * deprecated.
 *
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java
   * <p>Set by the contextual rewriter.
   */
  private ImmutableList<SoyPrintDirective> escapingDirectives = ImmutableList.of();

  /** True if this node is within a HTML context. */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java
   * <p>It is an error to call this before the contextual rewriter has been run.
   */
  public ImmutableList<SoyPrintDirective> getEscapingDirectives() {
    return escapingDirectives;
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java

  /** Sets the inferred escaping directives. */
  public void setEscapingDirectives(ImmutableList<SoyPrintDirective> escapingDirectives) {
    this.escapingDirectives = escapingDirectives;
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java
   * template's return value is the correct SanitizedContent object.
   */
  private ImmutableList<SoyPrintDirective> escapingDirectiveNames = ImmutableList.of();

  @Nullable private HtmlContext htmlContext;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java

  /** Sets the inferred escaping directives from the contextual engine. */
  public void setEscapingDirectives(ImmutableList<SoyPrintDirective> escapingDirectiveNames) {
    this.escapingDirectiveNames = escapingDirectiveNames;
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java
   * <p>It is an error to call this before the contextual rewriter has been run.
   */
  public ImmutableList<SoyPrintDirective> getEscapingDirectives() {
    return escapingDirectiveNames;
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/PrintDirectiveNode.java`
#### Snippet
```java

  /** Returns the print directive for this node. */
  public SoyPrintDirective getPrintDirective() {
    checkState(printDirective != null, "setPrintDirective hasn't been called yet");
    return printDirective;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/PrintDirectiveNode.java`
#### Snippet
```java

  private final Identifier name;
  private SoyPrintDirective printDirective;
  private SoySourceFunction printDirectiveFunction;

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/PrintDirectiveNode.java`
#### Snippet
```java

  public static PrintDirectiveNode createSyntheticNode(
      int id, Identifier name, SourceLocation location, SoyPrintDirective printDirective) {
    PrintDirectiveNode node = createSyntheticNode(id, name, location);
    node.setPrintDirective(printDirective);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/soytree/PrintDirectiveNode.java`
#### Snippet
```java

  /** Sets the print directive. */
  public void setPrintDirective(SoyPrintDirective printDirective) {
    checkState(this.printDirective == null, "setPrintDirective has already been called");
    checkArgument(name.identifier().equals(printDirective.getName()));
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java

  public static Stream<FunctionNode> allFunctionInvocations(
      Node rootSoyNode, SoyFunction functionToMatch) {
    return allNodesOfType(rootSoyNode, FunctionNode.class)
        .filter(
```

### Deprecation
'com.google.template.soy.shared.restricted.TypedSoyFunction' is deprecated
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
      if (knownFunction.getClass().isAnnotationPresent(SoyFunctionSignature.class)) {
        checkState(
            knownFunction instanceof TypedSoyFunction || knownFunction instanceof SoySourceFunction,
            "Classes annotated with @SoyFunctionSignature must either extend "
                + "TypedSoyFunction or implement SoySourceFunction.");
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
   * @param expectedOutput The expected result of applying directive to value with args.
   * @param value The test input.
   * @param directive The directive whose {@link SoyJavaPrintDirective#applyForJava} is under test.
   * @param args Arguments to the Soy directive.
   */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
   */
  protected void assertTofuOutput(
      SoyValue expectedOutput, Object value, SoyJavaPrintDirective directive, Object... args) {
    ImmutableList.Builder<SoyValue> argsData = ImmutableList.builder();
    for (Object arg : args) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
   * @param expectedOutput The expected result of applying directive to value with args.
   * @param value The test input.
   * @param directive The directive whose {@link SoyJavaPrintDirective#applyForJava} is under test.
   * @param args Arguments to the Soy directive.
   */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
      String expectedOutput,
      @Nullable Object value,
      SoyJavaPrintDirective directive,
      Object... args) {
    assertTofuOutput(StringData.forValue(expectedOutput), value, directive, args);
```

### Deprecation
'builder()' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java

    // Compile the template.
    SoyFileSet sfs = SoyFileSet.builder().add(Resources.getResource("simple.soy")).build();
    SoyTofu tofu = sfs.compileToTofu();

```

### Deprecation
'add(java.net.URL)' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java

    // Compile the template.
    SoyFileSet sfs = SoyFileSet.builder().add(Resources.getResource("simple.soy")).build();
    SoyTofu tofu = sfs.compileToTofu();

```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Compile the template.
    SoyFileSet sfs = SoyFileSet.builder().add(Resources.getResource("simple.soy")).build();
    SoyTofu tofu = sfs.compileToTofu();

    // Example 1.
```

### Deprecation
'compileToTofu()' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Compile the template.
    SoyFileSet sfs = SoyFileSet.builder().add(Resources.getResource("simple.soy")).build();
    SoyTofu tofu = sfs.compileToTofu();

    // Example 1.
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Example 1.
    writeExampleHeader();
    System.out.println(tofu.newRenderer("soy.examples.simple.helloWorld").render());

    // Create a namespaced tofu object to make calls more concise.
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java

    // Create a namespaced tofu object to make calls more concise.
    SoyTofu simpleTofu = tofu.forNamespace("soy.examples.simple");

    // Example 2.
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    writeExampleHeader();
    System.out.println(
        simpleTofu.newRenderer(".helloName").setData(ImmutableMap.of("name", "Ana")).render());

    // Example 3.
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
            .newRenderer(".helloNames")
            .setData(ImmutableMap.of("names", ImmutableList.of("Bob", "Cid", "Dee")))
            .render());
  }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java

  @CanIgnoreReturnValue
  public SoyFileSetParserBuilder addSoyFunctions(Iterable<? extends SoyFunction> newSoyFunctions) {
    this.soyFunctions.addAll(newSoyFunctions);
    return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
    this.scopedData = new SoySimpleScope();
    this.soyFunctions =
        ImmutableList.<SoyFunction>builder().addAll(InternalPlugins.internalLegacyFunctions());
    this.soyPrintDirectives =
        ImmutableList.<SoyPrintDirective>builder()
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
        ImmutableList.<SoyFunction>builder().addAll(InternalPlugins.internalLegacyFunctions());
    this.soyPrintDirectives =
        ImmutableList.<SoyPrintDirective>builder()
            .addAll(InternalPlugins.internalDirectives(scopedData));
    this.sourceFunctions =
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  }

  public SoyFileSetParserBuilder addPrintDirective(SoyPrintDirective printDirective) {
    return addPrintDirectives(ImmutableList.of(printDirective));
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  }

  public SoyFileSetParserBuilder addSoyFunction(SoyFunction function) {
    return addSoyFunctions(ImmutableList.of(function));
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
  private ImmutableList.Builder<SoySourceFunction> soyMethods;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  public SoyFileSetParserBuilder addPrintDirectives(
      Iterable<? extends SoyPrintDirective> newSoyPrintDirectives) {
    this.soyPrintDirectives.addAll(newSoyPrintDirectives);
    return this;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean runOptimizer = false;
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
package com.google.template.soy.examples;

import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
```

### Deprecation
'DEMO_AUTOESCAPE_TRUE' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
package com.google.template.soy.examples;

import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
```

### Deprecation
'DEMO_BIDI_SUPPORT' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
```

### Deprecation
'DEMO_CALL_WITHOUT_PARAM' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_AUTOESCAPE_TRUE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
```

### Deprecation
'DEMO_CALL_WITH_PARAM' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_BIDI_SUPPORT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
```

### Deprecation
'DEMO_CALL_WITH_PARAM_BLOCK' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITHOUT_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
```

### Deprecation
'DEMO_COMMENTS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
```

### Deprecation
'DEMO_DOUBLE_BRACES' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_CALL_WITH_PARAM_BLOCK;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
```

### Deprecation
'DEMO_EXPRESSIONS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_COMMENTS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
```

### Deprecation
'DEMO_FOR' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_DOUBLE_BRACES;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
```

### Deprecation
'DEMO_FOR_RANGE' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_EXPRESSIONS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
```

### Deprecation
'DEMO_IF' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
```

### Deprecation
'DEMO_LINE_JOINING' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_FOR_RANGE;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
```

### Deprecation
'DEMO_MSG' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_IF;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;
```

### Deprecation
'DEMO_PRINT' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_LINE_JOINING;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;

```

### Deprecation
'DEMO_RAW_TEXT_COMMANDS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_MSG;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;

```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;

import com.google.common.collect.ImmutableList;
```

### Deprecation
'DEMO_SWITCH' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_PRINT;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_RAW_TEXT_COMMANDS;
import static com.google.template.soy.examples.FeaturesSoyInfo.DEMO_SWITCH;

import com.google.common.collect.ImmutableList;
```

### Deprecation
'setUsageWidth(int)' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    CmdLineParser cmdLineParser = new CmdLineParser(this);
    cmdLineParser.setUsageWidth(100);
    try {
      cmdLineParser.parseArgument(args);
```

### Deprecation
'builder()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    }

    SoyFileSet.Builder sfsBuilder = SoyFileSet.builder();
    SoyFileSet sfs =
        sfsBuilder
```

### Deprecation
'com.google.template.soy.tofu.SoyTofu' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .add(Resources.getResource("features.soy"), "examples/features.soy")
            .build();
    SoyTofu tofu = sfs.compileToTofu().forNamespace("soy.examples.features");

    SoyMsgBundle msgBundle;
```

### Deprecation
'compileToTofu()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .add(Resources.getResource("features.soy"), "examples/features.soy")
            .build();
    SoyTofu tofu = sfs.compileToTofu().forNamespace("soy.examples.features");

    SoyMsgBundle msgBundle;
```

### Deprecation
'DEMO_COMMENTS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoComments");
    System.out.println(tofu.newRenderer(DEMO_COMMENTS).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoLineJoining");
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoComments");
    System.out.println(tofu.newRenderer(DEMO_COMMENTS).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoLineJoining");
```

### Deprecation
'DEMO_LINE_JOINING' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoLineJoining");
    System.out.println(tofu.newRenderer(DEMO_LINE_JOINING).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoRawTextCommands");
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoLineJoining");
    System.out.println(tofu.newRenderer(DEMO_LINE_JOINING).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoRawTextCommands");
```

### Deprecation
'DEMO_RAW_TEXT_COMMANDS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoRawTextCommands");
    System.out.println(
        tofu.newRenderer(DEMO_RAW_TEXT_COMMANDS).setMsgBundle(msgBundle).renderText());

    writeExampleHeader("demoPrint");
```

### Deprecation
'DEMO_PRINT' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoPrint");
    System.out.println(
        tofu.newRenderer(DEMO_PRINT)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoPrintSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoPrintSoyTemplateInfo.BOO, "Boo!", DemoPrintSoyTemplateInfo.TWO, 2))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoPrintSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoPrintSoyTemplateInfo.BOO, "Boo!", DemoPrintSoyTemplateInfo.TWO, 2))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoPrintSoyTemplateInfo.BOO, "Boo!", DemoPrintSoyTemplateInfo.TWO, 2))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoAutoescapeTrue");
```

### Deprecation
'DEMO_AUTOESCAPE_TRUE' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoAutoescapeTrue");
    System.out.println(
        tofu.newRenderer(DEMO_AUTOESCAPE_TRUE)
            .setData(
                ImmutableMap.of(DemoAutoescapeTrueSoyTemplateInfo.ITALIC_HTML, "<i>italic</i>"))
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoAutoescapeTrueSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
        tofu.newRenderer(DEMO_AUTOESCAPE_TRUE)
            .setData(
                ImmutableMap.of(DemoAutoescapeTrueSoyTemplateInfo.ITALIC_HTML, "<i>italic</i>"))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                ImmutableMap.of(DemoAutoescapeTrueSoyTemplateInfo.ITALIC_HTML, "<i>italic</i>"))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoMsg");
```

### Deprecation
'DEMO_MSG' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoMsg");
    System.out.println(
        tofu.newRenderer(DEMO_MSG)
            .setData(ImmutableMap.of(DemoMsgSoyTemplateInfo.NAME, "Ed"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoMsgSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    System.out.println(
        tofu.newRenderer(DEMO_MSG)
            .setData(ImmutableMap.of(DemoMsgSoyTemplateInfo.NAME, "Ed"))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of(DemoMsgSoyTemplateInfo.NAME, "Ed"))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoIf");
```

### Deprecation
'DEMO_IF' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoIf");
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 3.14159))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("pi", 3.14159))
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
```

### Deprecation
'DEMO_IF' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 2.71828))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("pi", 2.71828))
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
```

### Deprecation
'DEMO_IF' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 1.61803))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("pi", 1.61803))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoSwitch");
```

### Deprecation
'DEMO_SWITCH' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoSwitch");
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Fay"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("name", "Fay"))
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
```

### Deprecation
'DEMO_SWITCH' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Go"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("name", "Go"))
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
```

### Deprecation
'DEMO_SWITCH' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Hal"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("name", "Hal"))
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
```

### Deprecation
'DEMO_SWITCH' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Ivy"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of("name", "Ivy"))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoFor");
```

### Deprecation
'DEMO_FOR' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            ImmutableMap.of("name", "Mel", "numWaffles", 2));
    System.out.println(
        tofu.newRenderer(DEMO_FOR)
            .setData(ImmutableMap.of(DemoForSoyTemplateInfo.PERSONS, persons))
            .setMsgBundle(msgBundle)
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoForSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    System.out.println(
        tofu.newRenderer(DEMO_FOR)
            .setData(ImmutableMap.of(DemoForSoyTemplateInfo.PERSONS, persons))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of(DemoForSoyTemplateInfo.PERSONS, persons))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoFor_Range");
```

### Deprecation
'DEMO_FOR_RANGE' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoFor_Range");
    System.out.println(
        tofu.newRenderer(DEMO_FOR_RANGE)
            .setData(ImmutableMap.of(DemoForRangeSoyTemplateInfo.NUM_LINES, 3))
            .setMsgBundle(msgBundle)
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoForRangeSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    System.out.println(
        tofu.newRenderer(DEMO_FOR_RANGE)
            .setData(ImmutableMap.of(DemoForRangeSoyTemplateInfo.NUM_LINES, 3))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of(DemoForRangeSoyTemplateInfo.NUM_LINES, 3))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoCallWithoutParam");
```

### Deprecation
'DEMO_CALL_WITHOUT_PARAM' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoCallWithoutParam");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITHOUT_PARAM)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithoutParamSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoCallWithoutParamSoyTemplateInfo.NAME,
                    "Neo",
                    DemoCallWithoutParamSoyTemplateInfo.TRIP_INFO,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithoutParamSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoCallWithoutParamSoyTemplateInfo.NAME,
                    "Neo",
                    DemoCallWithoutParamSoyTemplateInfo.TRIP_INFO,
                    ImmutableMap.of("name", "Neo", "destination", "The Matrix")))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    ImmutableMap.of("name", "Neo", "destination", "The Matrix")))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoCallWithParam");
```

### Deprecation
'DEMO_CALL_WITH_PARAM' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoCallWithParam");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITH_PARAM)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithParamSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoCallWithParamSoyTemplateInfo.NAME,
                    "Oz",
                    DemoCallWithParamSoyTemplateInfo.COMPANION_NAME,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithParamSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoCallWithParamSoyTemplateInfo.NAME,
                    "Oz",
                    DemoCallWithParamSoyTemplateInfo.COMPANION_NAME,
                    "Pip",
                    DemoCallWithParamSoyTemplateInfo.DESTINATIONS,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithParamSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoCallWithParamSoyTemplateInfo.COMPANION_NAME,
                    "Pip",
                    DemoCallWithParamSoyTemplateInfo.DESTINATIONS,
                    ImmutableList.of(
                        "Gillikin Country", "Munchkin Country",
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                        "Quadling Country", "Winkie Country")))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoCallWithParamBlock");
```

### Deprecation
'DEMO_CALL_WITH_PARAM_BLOCK' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoCallWithParamBlock");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITH_PARAM_BLOCK)
            .setData(ImmutableMap.of(DemoCallWithParamBlockSoyTemplateInfo.NAME, "Quo"))
            .setMsgBundle(msgBundle)
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoCallWithParamBlockSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITH_PARAM_BLOCK)
            .setData(ImmutableMap.of(DemoCallWithParamBlockSoyTemplateInfo.NAME, "Quo"))
            .setMsgBundle(msgBundle)
            .render());
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(ImmutableMap.of(DemoCallWithParamBlockSoyTemplateInfo.NAME, "Quo"))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoExpressions");
```

### Deprecation
'DEMO_EXPRESSIONS' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            ImmutableMap.of("name", "Uma", "major", "Biology", "year", 1972));
    System.out.println(
        tofu.newRenderer(DEMO_EXPRESSIONS)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoExpressionsSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoExpressionsSoyTemplateInfo.STUDENTS,
                    students,
                    DemoExpressionsSoyTemplateInfo.CURRENT_YEAR,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoExpressionsSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoExpressionsSoyTemplateInfo.STUDENTS,
                    students,
                    DemoExpressionsSoyTemplateInfo.CURRENT_YEAR,
                    2008))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    2008))
            .setMsgBundle(msgBundle)
            .render());

    writeExampleHeader("demoDoubleBraces");
```

### Deprecation
'DEMO_DOUBLE_BRACES' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoDoubleBraces");
    System.out.println(
        tofu.newRenderer(DEMO_DOUBLE_BRACES)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoDoubleBracesSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoDoubleBracesSoyTemplateInfo.SET_NAME,
                    "prime numbers",
                    DemoDoubleBracesSoyTemplateInfo.SET_MEMBERS,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoDoubleBracesSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoDoubleBracesSoyTemplateInfo.SET_NAME,
                    "prime numbers",
                    DemoDoubleBracesSoyTemplateInfo.SET_MEMBERS,
                    ImmutableList.of(2, 3, 5, 7, 11, 13)))
            .setMsgBundle(msgBundle)
```

### Deprecation
'DEMO_BIDI_SUPPORT' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    writeExampleHeader("demoBidiSupport");
    System.out.println(
        tofu.newRenderer(DEMO_BIDI_SUPPORT)
            .setData(
                ImmutableMap.of(
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoBidiSupportSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setData(
                ImmutableMap.of(
                    DemoBidiSupportSoyTemplateInfo.TITLE,
                    "2008: A BiDi Odyssey",
                    DemoBidiSupportSoyTemplateInfo.AUTHOR,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoBidiSupportSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoBidiSupportSoyTemplateInfo.TITLE,
                    "2008: A BiDi Odyssey",
                    DemoBidiSupportSoyTemplateInfo.AUTHOR,
                    "John Doe, Esq.",
                    DemoBidiSupportSoyTemplateInfo.YEAR,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoBidiSupportSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoBidiSupportSoyTemplateInfo.AUTHOR,
                    "John Doe, Esq.",
                    DemoBidiSupportSoyTemplateInfo.YEAR,
                    1973,
                    DemoBidiSupportSoyTemplateInfo.KEYWORDS,
```

### Deprecation
'com.google.template.soy.examples.FeaturesSoyInfo.DemoBidiSupportSoyTemplateInfo' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    DemoBidiSupportSoyTemplateInfo.YEAR,
                    1973,
                    DemoBidiSupportSoyTemplateInfo.KEYWORDS,
                    ImmutableList.of("Bi(Di)", "2008 (\u05E9\u05E0\u05D4)", "2008 (year)")))
            .setMsgBundle(msgBundle)
```

### Deprecation
'render()' is deprecated
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    ImmutableList.of("Bi(Di)", "2008 (\u05E9\u05E0\u05D4)", "2008 (year)")))
            .setMsgBundle(msgBundle)
            .render());
  }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

    public static FunctionRef of(Object soyFunction) {
      if (soyFunction instanceof SoyFunction) {
        return of((SoyFunction) soyFunction);
      } else if (soyFunction instanceof SoySourceFunction) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
    public static FunctionRef of(Object soyFunction) {
      if (soyFunction instanceof SoyFunction) {
        return of((SoyFunction) soyFunction);
      } else if (soyFunction instanceof SoySourceFunction) {
        return of((SoySourceFunction) soyFunction);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  /**
   * Either a {@link SoyFunction} or a {@link SoySourceFunction}. TODO(b/19252021): use
   * SoySourceFunction everywhere.
   */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
    abstract Type type();

    abstract SoyFunction soyFunction();

    abstract SoySourceFunction soySourceFunction();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyFunction' is deprecated
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
    }

    public static FunctionRef of(SoyFunction soyFunction) {
      return AutoOneOf_FunctionNode_FunctionRef.soyFunction(soyFunction);
    }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java
      IdGenerator idGenerator,
      ErrorReporter errorReporter,
      ImmutableList<? extends SoyPrintDirective> printDirectives) {
    Inferences inferences = new Inferences();
    Context startContext = Context.HTML_PCDATA;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java

  private final ErrorReporter errorReporter;
  private final ImmutableList<? extends SoyPrintDirective> printDirectives;
  private final FileSetMetadata fileSetMetadata;

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java
  public ContextualAutoescaper(
      ErrorReporter errorReporter,
      ImmutableList<? extends SoyPrintDirective> soyDirectives,
      FileSetMetadata fileSetMetadata) {
    this.errorReporter = errorReporter;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
      Inferences inferences,
      IdGenerator idGen,
      ImmutableList<? extends SoyPrintDirective> printDirectives) {
    this.inferences = inferences;
    this.idGen = idGen;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
        printDirectives.stream()
            .filter(d -> EscapingMode.fromDirective(d.getName()) != null)
            .collect(toImmutableMap(SoyPrintDirective::getName, Function.identity()));
  }

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
  private final IdGenerator idGen;

  private final ImmutableMap<String, ? extends SoyPrintDirective> printDirectives;
  private final RewriterVisitor mutator = new RewriterVisitor();

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
      ImmutableList<EscapingMode> escapingModes = inferences.getEscapingModesForNode(printNode);
      for (EscapingMode escapingMode : escapingModes) {
        SoyPrintDirective directive = printDirectives.get(escapingMode.directiveName);
        if (directive == null) {
          throw new IllegalStateException(
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
        int newPrintDirectiveIndex = printNode.numChildren();
        while (newPrintDirectiveIndex > 0) {
          SoyPrintDirective printDirective =
              printNode.getChild(newPrintDirectiveIndex - 1).getPrintDirective();
          SanitizedContentKind contentKind =
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
              printNode.getChild(newPrintDirectiveIndex - 1).getPrintDirective();
          SanitizedContentKind contentKind =
              printDirective instanceof SanitizedContentOperator
                  ? Converters.toSanitizedContentKind(
                      ((SanitizedContentOperator) printDirective).getContentKind())
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
              printDirective instanceof SanitizedContentOperator
                  ? Converters.toSanitizedContentKind(
                      ((SanitizedContentOperator) printDirective).getContentKind())
                  : null;
          if (contentKind == null || contentKind != escapingMode.contentKind) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
    @Override
    protected void visitCallNode(CallNode node) {
      ImmutableList<SoyPrintDirective> directives = getDirectivesForNode(node);
      // Only handle CallBasicNode.  The compiler attempts to enforce consistency in the type of
      // deltemplates but there is currently no strong guarantee that they are compatible.  So be
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java

    /** Grabs the inferred escaping directives from the node in string form. */
    private ImmutableList<SoyPrintDirective> getDirectivesForNode(SoyNode node) {
      ImmutableList.Builder<SoyPrintDirective> escapingDirectiveNames =
          new ImmutableList.Builder<>();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
    /** Grabs the inferred escaping directives from the node in string form. */
    private ImmutableList<SoyPrintDirective> getDirectivesForNode(SoyNode node) {
      ImmutableList.Builder<SoyPrintDirective> escapingDirectiveNames =
          new ImmutableList.Builder<>();
      for (EscapingMode escapingMode : inferences.getEscapingModesForNode(node)) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/sharedpasses/opti/PreevalVisitor.java`
#### Snippet
```java
  @Override
  protected SoyValue computeFunctionHelper(
      SoyJavaFunction fn, List<SoyValue> args, FunctionNode fnNode) {
    checkArgument(fnNode.getSoyFunction() == fn);
    checkPure(fn);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/opti/PrerenderVisitor.java`
#### Snippet
```java

  private boolean isSoyPurePrintDirective(PrintDirectiveNode node) {
    SoyPrintDirective directive = node.getPrintDirective();
    return directive instanceof SoyJavaPrintDirective
        && directive.getClass().isAnnotationPresent(SoyPurePrintDirective.class);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/opti/PrerenderVisitor.java`
#### Snippet
```java
  private boolean isSoyPurePrintDirective(PrintDirectiveNode node) {
    SoyPrintDirective directive = node.getPrintDirective();
    return directive instanceof SoyJavaPrintDirective
        && directive.getClass().isAnnotationPresent(SoyPurePrintDirective.class);
  }
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderableThunk.java`
#### Snippet
```java
    doRender(appendable);
    content = appendable.toString();
    if (kind == ContentKind.TEXT) {
      resolved = StringData.forValue(content);
    } else {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
        return CheckResult.fromBool(value instanceof SoyMap);
      case LEGACY_OBJECT_MAP:
        return CheckResult.fromBool(value instanceof SoyLegacyObjectMap);
      case NULL:
        return CheckResult.fromBool(value == NullData.INSTANCE || value == UndefinedData.INSTANCE);
```

### Deprecation
'com.google.template.soy.shared.restricted.TypedSoyFunction' is deprecated
in `java/src/com/google/template/soy/basicfunctions/LengthFunction.java`
#### Snippet
```java
@SoyMethodSignature(name = "length", baseType = "list<any>", value = @Signature(returnType = "int"))
@SoyFieldSignature(name = "length", baseType = "list<any>", returnType = "int")
public final class LengthFunction extends TypedSoyFunction
    implements SoyJavaSourceFunction, SoyJavaScriptSourceFunction, SoyPythonSourceFunction {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
   */
  private SoyValue applyDirective(
      SoyPrintDirective directive, SoyValue value, List<SoyValue> args, SoyNode node) {

    // Get directive.
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

    // Get directive.
    if (!(directive instanceof SoyJavaPrintDirective)) {
      throw RenderException.createWithSource(
          "Failed to find Soy print directive with name '"
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

    try {
      return ((SoyJavaPrintDirective) directive).applyForJava(value, args);
    } catch (RuntimeException e) {
      throw RenderException.createWithSource(
```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
      ContentKind calleeKind = fromSanitizedContentKind(callee.getContentKind());
      SoyValue resultData =
          calleeKind != ContentKind.TEXT
              ? UnsafeSanitizedContentOrdainer.ordainAsSafe(calleeBuilder.toString(), calleeKind)
              : StringData.forValue(calleeBuilder.toString());
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
              ? UnsafeSanitizedContentOrdainer.ordainAsSafe(calleeBuilder.toString(), calleeKind)
              : StringData.forValue(calleeBuilder.toString());
      for (SoyPrintDirective directive : node.getEscapingDirectives()) {
        resultData = applyDirective(directive, resultData, ImmutableList.of(), node);
      }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
      // Escape the entire message with the required directives.
      SoyValue wholeMsg = StringData.forValue(popOutputBuf().toString());
      for (SoyPrintDirective directive : node.getEscapingDirectives()) {
        wholeMsg = applyDirective(directive, wholeMsg, ImmutableList.of(), node);
      }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
  @ForOverride
  protected SoyValue computeFunctionHelper(
      SoyJavaFunction fn, List<SoyValue> args, FunctionNode fnNode) {
    try {
      return fn.computeForJava(args);
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    checkArgument(!itemAccess.isNullSafe());
    // attempting item access on non-SoyMap
    if (!(base instanceof SoyLegacyObjectMap || base instanceof SoyMap)) {
      if (nullSafe) {
        if (!isNullOrUndefinedBase(base)) {
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    boolean shouldUseNewMap = MapType.ANY_MAP.isAssignableFromStrict(baseType);
    SoyValue value =
        shouldUseNewMap ? ((SoyMap) base).get(key) : ((SoyLegacyObjectMap) base).getItem(key);

    if (value != null
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
      }
      throw new AssertionError();
    } else if (soyFunction instanceof SoyJavaFunction) {
      List<SoyValue> args = this.visitChildren(node);
      SoyJavaFunction fn = (SoyJavaFunction) soyFunction;
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    } else if (soyFunction instanceof SoyJavaFunction) {
      List<SoyValue> args = this.visitChildren(node);
      SoyJavaFunction fn = (SoyJavaFunction) soyFunction;
      // Note: Arity has already been checked by CheckFunctionCallsVisitor.
      return computeFunctionHelper(fn, args, node);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaFunction' is deprecated
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    } else if (soyFunction instanceof SoyJavaFunction) {
      List<SoyValue> args = this.visitChildren(node);
      SoyJavaFunction fn = (SoyJavaFunction) soyFunction;
      // Note: Arity has already been checked by CheckFunctionCallsVisitor.
      return computeFunctionHelper(fn, args, node);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiDirectives.java`
#### Snippet
```java
  private BidiDirectives() {}

  public static ImmutableSet<SoyPrintDirective> directives(Supplier<BidiGlobalDir> bidiProvider) {
    return ImmutableSet.of(
        new BidiSpanWrapDirective(bidiProvider), new BidiUnicodeWrapDirective(bidiProvider));
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/coredirectives/CoreDirectives.java`
#### Snippet
```java
  private CoreDirectives() {}

  public static ImmutableSet<SoyPrintDirective> directives() {
    return ImmutableSet.of(new EscapeHtmlDirective());
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiUnicodeWrapDirective.java`
#### Snippet
```java
 */
final class BidiUnicodeWrapDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiUnicodeWrapDirective.java`
#### Snippet
```java
final class BidiUnicodeWrapDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiUnicodeWrapDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/coredirectives/EscapeHtmlDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
public class EscapeHtmlDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/coredirectives/EscapeHtmlDirective.java`
#### Snippet
```java
public class EscapeHtmlDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable,
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/coredirectives/EscapeHtmlDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable,
        ShortCircuitable {
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiSpanWrapDirective.java`
#### Snippet
```java
 */
final class BidiSpanWrapDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiSpanWrapDirective.java`
#### Snippet
```java
final class BidiSpanWrapDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiSpanWrapDirective.java`
#### Snippet
```java
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/bididirectives/BidiSpanWrapDirective.java`
#### Snippet
```java
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterTelUriDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class FilterTelUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterTelUriDirective.java`
#### Snippet
```java
final class FilterTelUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterTelUriDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicDirectives.java`
#### Snippet
```java
  private BasicDirectives() {}

  public static SoyPrintDirective ESCAPE_HTML_ATTRIBUTE =
      new BasicEscapeDirective.EscapeHtmlAttribute();

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicDirectives.java`
#### Snippet
```java
      new BasicEscapeDirective.EscapeHtmlAttribute();

  public static ImmutableSet<SoyPrintDirective> directives() {
    return ImmutableSet.of(

```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
   */
  public static List<SoyValue> keys(SoyValue sv) {
    SoyLegacyObjectMap map = (SoyLegacyObjectMap) sv;
    List<SoyValue> list = new ArrayList<>(map.getItemCnt());
    Iterables.addAll(list, map.getItemKeys());
```

### Deprecation
'com.google.template.soy.data.SoyLegacyObjectMap' is deprecated
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
   */
  public static List<SoyValue> keys(SoyValue sv) {
    SoyLegacyObjectMap map = (SoyLegacyObjectMap) sv;
    List<SoyValue> list = new ArrayList<>(map.getItemCnt());
    Iterables.addAll(list, map.getItemKeys());
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TextDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class TextDirective
    implements SoyJavaPrintDirective,
        SoyJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TextDirective.java`
#### Snippet
```java
final class TextDirective
    implements SoyJavaPrintDirective,
        SoyJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TextDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterLegacyUriBehaviorDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class FilterLegacyUriBehaviorDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterLegacyUriBehaviorDirective.java`
#### Snippet
```java
final class FilterLegacyUriBehaviorDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterLegacyUriBehaviorDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
 */
public abstract class BasicEscapeDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
public abstract class BasicEscapeDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterSipUriDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class FilterSipUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterSipUriDirective.java`
#### Snippet
```java
final class FilterSipUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterSipUriDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {

```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/basicdirectives/InsertWordBreaksDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class InsertWordBreaksDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/basicdirectives/ChangeNewlineToBrDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class ChangeNewlineToBrDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/ChangeNewlineToBrDirective.java`
#### Snippet
```java
final class ChangeNewlineToBrDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/ChangeNewlineToBrDirective.java`
#### Snippet
```java
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/ChangeNewlineToBrDirective.java`
#### Snippet
```java
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/InsertWordBreaksDirective.java`
#### Snippet
```java
final class InsertWordBreaksDirective
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/InsertWordBreaksDirective.java`
#### Snippet
```java
    implements SanitizedContentOperator,
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/InsertWordBreaksDirective.java`
#### Snippet
```java
        SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterImageDataUriDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class FilterImageDataUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterImageDataUriDirective.java`
#### Snippet
```java
final class FilterImageDataUriDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/FilterImageDataUriDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective {

```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/BidiUnicodeWrapDirective.java`
#### Snippet
```java

/** Implements the |bidiUnicodeWrap directive for incremental dom only. */
final class BidiUnicodeWrapDirective implements SoyLibraryAssistedJsSrcPrintDirective {

  /** Supplier for the current bidi global directionality. */
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/CleanHtmlDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class CleanHtmlDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/CleanHtmlDirective.java`
#### Snippet
```java
final class CleanHtmlDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/CleanHtmlDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/EscapeHtmlDirective.java`
#### Snippet
```java

/** Implements the |escapeHtml directive for incremental dom only. */
final class EscapeHtmlDirective implements SoyLibraryAssistedJsSrcPrintDirective {

  /**
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
          EscapingMode.ESCAPE_HTML_ATTRIBUTE_NOSPACE.directiveName);

  private static boolean canSkip(SoyPrintDirective printDirective) {
    return SKIPPABLE_ESCAPING_MODES.contains(printDirective.getName());
  }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
  }

  private static ImmutableList<SoyPrintDirective> filterEscapingDirectives(
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (int i = 0; i < escapingDirectives.size(); i++) {
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java

  private static ImmutableList<SoyPrintDirective> filterEscapingDirectives(
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (int i = 0; i < escapingDirectives.size(); i++) {
      SoyPrintDirective directive = escapingDirectives.get(i);
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (int i = 0; i < escapingDirectives.size(); i++) {
      SoyPrintDirective directive = escapingDirectives.get(i);
      if (canSkip(directive)) {
        ImmutableList.Builder<SoyPrintDirective> builder = ImmutableList.builder();
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
      SoyPrintDirective directive = escapingDirectives.get(i);
      if (canSkip(directive)) {
        ImmutableList.Builder<SoyPrintDirective> builder = ImmutableList.builder();
        builder.addAll(escapingDirectives.subList(0, i));
        for (; i < escapingDirectives.size(); i++) {
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
final class RemoveUnnecessaryEscapingDirectives {

  private final ImmutableMap<String, SoyLibraryAssistedJsSrcPrintDirective> directives;

  private static final String BIDI_UNICODE_WRAP = "|bidiUnicodeWrap";
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
            for (int i = printNode.numChildren() - 1; i >= 0; i--) {
              PrintDirectiveNode pdn = printNode.getChild(i);
              SoyPrintDirective directive = pdn.getPrintDirective();
              // If there are any directives to the left of a sanitized content operator,
              // keep them.
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
              // If there are any directives to the left of a sanitized content operator,
              // keep them.
              if (directive instanceof SanitizedContentOperator) {
                break;
              }
```

### Deprecation
'com.google.template.soy.shared.restricted.SoyJavaPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TruncateDirective.java`
#### Snippet
```java
@SoyPurePrintDirective
final class TruncateDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TruncateDirective.java`
#### Snippet
```java
final class TruncateDirective
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {
```

### Deprecation
'com.google.template.soy.pysrc.restricted.SoyPySrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/basicdirectives/TruncateDirective.java`
#### Snippet
```java
    implements SoyJavaPrintDirective,
        SoyLibraryAssistedJsSrcPrintDirective,
        SoyPySrcPrintDirective,
        SoyJbcSrcPrintDirective.Streamable {

```

### Deprecation
'TEXT' is deprecated
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
      // strictly necessary, as the autoescaper will have already made sure the output is properly
      // escaped, but it helps make the intent clear.
      delegate.setKindAndDirectionality(ContentKind.TEXT, dir);
    }

```

### Deprecation
'com.google.template.soy.jssrc.restricted.SoyLibraryAssistedJsSrcPrintDirective' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/FilterHtmlAttributesDirective.java`
#### Snippet
```java

/** Implements the |filterHtmlAttributes directive for incremental dom only. */
final class FilterHtmlAttributesDirective implements SoyLibraryAssistedJsSrcPrintDirective {

  /**
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
        if (node.numChildren() > 0
            && node.getChild(node.numChildren() - 1).getPrintDirective()
                instanceof SanitizedContentOperator
            && ((SanitizedContentOperator)
                        node.getChild(node.numChildren() - 1).getPrintDirective())
```

### Deprecation
'com.google.template.soy.data.SanitizedContentOperator' is deprecated
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
            && node.getChild(node.numChildren() - 1).getPrintDirective()
                instanceof SanitizedContentOperator
            && ((SanitizedContentOperator)
                        node.getChild(node.numChildren() - 1).getPrintDirective())
                    .getContentKind()
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
            : new File(path).getParent();
    if (dirPath == null || knownExistingDirs.contains(dirPath)) {
      return; // known to exist
    } else {
      new File(dirPath).mkdirs();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span methodNameSpan, ParamInfo paramInfo, TemplateInfo template) {
    if (!isEnabled()) {
      return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span classNameSpan, TemplateInfo template) {
    if (!isEnabled()) {
      return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span classNameSpan, SoyFileNode file) {
    if (!isEnabled()) {
      return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/xliffmsgplugin/XliffParser.java`
#### Snippet
```java
      if (!isInMsg) {
        // We don't care about characters if not currently inside a message.
        return;
      } else if (currRawTextPart == null) {
        // Common case: Save the characters to the currRawTextPart.
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
    if (quoteStyle == QuoteStyle.BACKTICK) {
      return value
          .replace("" + quoteStyle.getQuoteChar(), quoteStyle.getEscapeSeq())
          .replace("${", "\\${");
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/base/internal/SoyFileSupplier.java`
#### Snippet
```java
    return new CharSource() {
      @Override
      public Reader openStream() throws IOException {
        return open();
      }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `java/src/com/google/template/soy/base/SourceLocation.java`
#### Snippet
```java
public final class SourceLocation implements Comparable<SourceLocation> {
  /** A file path or URI useful for error messages. */
  @Nonnull private final SourceFilePath filePath;

  private final Point begin;
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
  ImmutableMap<String, SoyValueProvider> recordAsMap();

  void forEach(BiConsumer<String, ? super SoyValueProvider> action);

  int recordSize();
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return Whether this SoyRecord has a field of the given name.
   */
  boolean hasField(String name);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return A provider of the field value for the given field name, or null if no such field name.
   */
  SoyValueProvider getFieldProvider(String name);

  /** Returns a view of this object as a java map. */
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return The field value for the given field name, or null if no such field name.
   */
  SoyValue getField(String name);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyValue.java`
#### Snippet
```java
   * @throws IOException
   */
  void render(LoggingAdvisingAppendable appendable) throws IOException;

  /**
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java

  @Override
  public final SoyValue resolve() {
    // NOTE: If this is used across threads, the worst that will happen is two different providers
    // will be constructed, and an arbitrary one will win. Since setting a volatile reference is
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java
  // We thread a simple linked list through this field to eliminate the cost of allocating a
  // collection
  @Nullable private ValueAssertion valueAssertion;

  @Override
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    // Gives a reasonable default implementation, if subclasses can do better they can override.
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return A provider of the item value for the given item key, or null if no such item key.
   */
  SoyValueProvider getProvider(SoyValue key);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return Whether this SoyMap has an item with the given key.
   */
  boolean containsKey(SoyValue key);

  /**
```

### NullableProblems
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return An iterable over all item keys.
   */
  @Nonnull
  Iterable<? extends SoyValue> keys();

```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return The item value for the given item key, or null if no such item key.
   */
  SoyValue get(SoyValue key);

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private final SoyTypeRegistryBuilder typeRegistryBuilder = new SoyTypeRegistryBuilder();

    @Nullable private Appendable warningSink;

    private ValidatedConformanceConfig conformanceConfig = ValidatedConformanceConfig.EMPTY;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  /** Optional soy tree cache for faster recompile times. */
  @Nullable private final SoyAstCache cache;

  private final SoyGeneralOptions generalOptions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  private ErrorReporter errorReporter;

  @Nullable private final Appendable warningSink;

  SoyFileSet(
```

### NullableProblems
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyList.java`
#### Snippet
```java
   * @return A Java list of all resolved values.
   */
  @Nonnull
  List<? extends SoyValue> asResolvedJavaList();

```

### NullableProblems
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyList.java`
#### Snippet
```java
   * @return A Java list of all value providers.
   */
  @Nonnull
  List<? extends SoyValueProvider> asJavaList();

```

### NullableProblems
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * RenderResult}
   */
  @Nonnull
  RenderResult status();

```

### NullableProblems
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * @return The resolved value.
   */
  @Nonnull
  SoyValue resolve();

```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * @throws IOException If the appendable throws an IOException
   */
  RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException;
}
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

    @Override
    public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
        throws IOException {
      return delegate().renderAndResolve(appendable, isLast);
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

    @Override
    public RenderResult status() {
      return delegate().status();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

        @Override
        public RenderResult status() {
          return RenderResult.done();
        }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

    @Override
    public SoyValue resolve() {
      return delegate().resolve();
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValue get(SoyValue key) {
    return getSingle(getStringKey(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getFieldProvider(String name) {
    return getSingle(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    map.forEach(action);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public boolean containsKey(SoyValue key) {
    return getSingle(getStringKey(key)) != null;
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValue getField(String name) {
    return getSingle(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public boolean hasField(String name) {
    return getSingle(name) != null;
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValue getItem(SoyValue key) {
    return getSingle(getStringKey(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getItemProvider(SoyValue key) {
    return getSingle(getStringKey(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public boolean hasItem(SoyValue key) {
    return getSingle(getStringKey(key)) != null;
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getProvider(SoyValue key) {
    return getSingle(getStringKey(key));
  }
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return The item value for the given item key, or null if no such item key.
   */
  SoyValue getItem(SoyValue key);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return A provider of the item value for the given item key, or null if no such item key.
   */
  SoyValueProvider getItemProvider(SoyValue key);
}

```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return Whether this SoyMap has an item with the given key.
   */
  boolean hasItem(SoyValue key);

  /**
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/SoyFutureValueProvider.java`
#### Snippet
```java

  @Override
  public RenderResult status() {
    return future.isDone() ? RenderResult.done() : RenderResult.continueAfter(future);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/TemplateValue.java`
#### Snippet
```java

  @Override
  public final void render(LoggingAdvisingAppendable appendable) {
    throw new IllegalStateException(
        "Cannot print template types; this should have been caught during parsing.");
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java

  @Override
  public SoyValue getProvider(SoyValue key) {
    return get(key);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java

  @Override
  public boolean containsKey(SoyValue key) {
    if (rawKeys.containsKey(key)) {
      return true;
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java

  @Override
  public ImmutableSet<SoyValue> keys() {
    ImmutableSet.Builder<SoyValue> keys = ImmutableSet.builder();
    for (K key : rawMap.keySet()) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java

  @Override
  public SoyValue get(SoyValue key) {
    return wrappedValues.computeIfAbsent(
        key,
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueList.java`
#### Snippet
```java

  @Override
  public ImmutableList<SoyValue> asResolvedJavaList() {
    ImmutableList.Builder<SoyValue> list = ImmutableList.builder();
    for (int i = 0; i < length(); i++) {
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueList.java`
#### Snippet
```java

  @Override
  public ImmutableList<SoyValue> asJavaList() {
    return asResolvedJavaList();
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java

  /** The directionality of the content appended to this appendable. */
  @Nullable private Dir contentDir;

  /**
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/data/internal/Converters.java`
#### Snippet
```java
      new Converter<>() {
        @Override
        protected ContentKind doForward(SanitizedContentKind sanitizedContentKind) {
          if (sanitizedContentKind == SanitizedContentKind.HTML_ELEMENT) {
            return ContentKind.HTML;
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/Converters.java`
#### Snippet
```java
      new Converter<>() {
        @Override
        protected ContentKind doForward(SanitizedContentKind sanitizedContentKind) {
          if (sanitizedContentKind == SanitizedContentKind.HTML_ELEMENT) {
            return ContentKind.HTML;
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/data/internal/Converters.java`
#### Snippet
```java

        @Override
        protected SanitizedContentKind doBackward(ContentKind contentKind) {
          return SanitizedContentKind.valueOf(contentKind.name());
        }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java

  @Override
  public SoyValue getField(String name) {
    SoyValueProvider svp = map.get(name);
    if (svp == null) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getFieldProvider(String name) {
    return map.get(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java

  @Override
  public boolean hasField(String name) {
    return map.containsKey(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    map.forEach(action);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getFieldProvider(String name) {
    return localStore.get(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public void render(LoggingAdvisingAppendable appendable) {
    throw new UnsupportedOperationException();
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public SoyValue getField(String name) {
    SoyValueProvider valueProvider = getFieldProvider(name);
    return (valueProvider != null) ? valueProvider.resolve() : null;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    localStore.forEach(action);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public boolean hasField(String name) {
    return localStore.containsKey(name);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public SoyValue getItem(SoyValue key) {
    asMap();
    return null;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public SoyValueProvider getItemProvider(SoyValue key) {
    asMap();
    return null;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public boolean hasItem(SoyValue key) {
    asMap();
    return false;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    throw new UnsupportedOperationException();
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public SoyValue getField(String name) {
    asRecord();
    return null;
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java

                @Override
                public ProtoClass load(Descriptor descriptor) throws Exception {
                  Set<FieldDescriptor> extensions = new LinkedHashSet<>();
                  return new ProtoClass(
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java

                @Override
                public ProtoClass load(Descriptor descriptor) throws Exception {
                  Set<FieldDescriptor> extensions = new LinkedHashSet<>();
                  return new ProtoClass(
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java

  @Override
  public void render(LoggingAdvisingAppendable appendable) throws IOException {
    TextFormat.printer().print(proto, appendable);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public SoyValueProvider getFieldProvider(String name) {
    asRecord();
    return null;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Deprecated
  @Override
  public boolean hasField(String name) {
    asRecord();
    return false;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getItemProvider(SoyValue key) {
    return map.get(getStringKey(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java

  @Override
  public boolean hasItem(SoyValue key) {
    return map.containsKey(getStringKey(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java

  @Override
  public SoyValue getItem(SoyValue key) {
    SoyValueProvider provider = getItemProvider(key);
    return provider != null ? provider.resolve() : null;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `java/src/com/google/template/soy/msgs/SoyMsgBundleWithFullLocale.java`
#### Snippet
```java

  @Override
  public Iterator<SoyMsg> iterator() {
    return delegate.iterator();
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java

  @Override
  public boolean hasItem(SoyValue key) {
    int index = getIntegerIndex(key);
    return 0 <= index && index < length();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java

  @Override
  public SoyValueProvider getItemProvider(SoyValue key) {
    return get(getIntegerIndex(key));
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java

  @Override
  public SoyValue getItem(SoyValue key) {
    return get(getIntegerIndex(key));
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java

  @Override
  public Iterator<SoyValue> iterator() {
    return Collections.unmodifiableList(list).iterator();
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/internal/InsertMsgsVisitor.java`
#### Snippet
```java
              + "shouldGenerateGoogMsgDefs is true.");

  @Nullable private final SoyMsgBundle msgBundle;
  private final ErrorReporter errorReporter;

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java

  @Override
  public Iterator<SoyMsg> iterator() {
    return new Iterator<>() {
      int index = 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
    private final ImmutableSet.Builder<SourceLocationAndTemplate> sourceLocations =
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
    private final ImmutableSet.Builder<SourceLocationAndTemplate> sourceLocations =
        ImmutableSet.builder();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    private long id;
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `java/src/com/google/template/soy/error/SoyError.java`
#### Snippet
```java

  @Override
  public int compareTo(SoyError o) {
    return comparing(SoyError::location).thenComparing(SoyError::message).compare(this, o);
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    private final Set<CodeChunk> appendedChunks =
        Collections.newSetFromMap(new IdentityHashMap<>());
    @Nullable final Scope parent;
    final boolean emitClosingBrace;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalBuilder.java`
#### Snippet
```java
  private final ImmutableList.Builder<IfThenPair<Statement>> conditions = ImmutableList.builder();

  @Nullable private Statement trailingElse = null;

  ConditionalBuilder(Expression predicate, Statement consequent) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/SwitchBuilder.java`
#### Snippet
```java
  private final Expression switchOn;
  private final ImmutableList.Builder<Switch.CaseClause> clauses = ImmutableList.builder();
  @Nullable private Statement defaultCaseBody;

  SwitchBuilder(Expression switchOn) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
  private static class DotCall extends ChainAccess {
    final String getter;
    @Nullable final Expression arg;

    DotCall(String getter, @Nullable Expression arg, boolean nullSafe) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java

  /** The name of a manifest file to generate, or null. */
  @Nullable private final String namespaceManifestFile;

  public SoyPySrcOptions(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
    final ImmutableSortedSet.Builder<String> typeExpressions = ImmutableSortedSet.naturalOrder();
    final ImmutableSet.Builder<GoogRequire> extraRequires = ImmutableSet.builder();
    @Nullable TypePredicate predicate;

    @CanIgnoreReturnValue
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
     * which require a different formatting method to be called.
     */
    @Nullable final Expression placeholders;

    GoogMsgCodeGenInfo(Expression googMsgVar, Expression placeholders) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java

    private final Type type;
    @Nullable private final PyExpr defaultValue;

    private NotFoundBehavior(Type type) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/types/ast/TypeNode.java`
#### Snippet
```java
public abstract class TypeNode {

  @Nullable private SoyType resolvedType;

  TypeNode() {}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/JbcSrcJavaValue.java`
#### Snippet
```java

  private final Expression expr;
  @Nullable private final MethodSignature methodSignature;

  private JbcSrcJavaValue(Expression expr, MethodSignature methodSignature) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/api/RenderResult.java`
#### Snippet
```java
  private final Type type;

  @Nullable
  private final Future<?> future;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;

    CompilerVisitor(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    // depending on the mode at most one of exprCompiler and detachingExprCompiler will be null
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java

    // depending on the mode at most one of exprCompiler and detachingExprCompiler will be null
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProviderProvider.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    RenderResult result = status();
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProviderProvider.java`
#### Snippet
```java

  @Override
  public final RenderResult status() {
    if (resolvedValueProvider == null) {
      RenderResult subResult = doResolveDelegate();
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProviderProvider.java`
#### Snippet
```java

  @Override
  public final SoyValue resolve() {
    JbcSrcRuntime.awaitProvider(this);
    return resolvedValueProvider.resolve();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/runtime/TombstoneValue.java`
#### Snippet
```java

  @Override
  public void render(LoggingAdvisingAppendable appendable) {
    throw new UnsupportedOperationException();
  }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/BufferedSoyValueProvider.java`
#### Snippet
```java

  @Override
  public RenderResult status() {
    return RenderResult.done();
  }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/BufferedSoyValueProvider.java`
#### Snippet
```java

  @Override
  public SoyValue resolve() {
    if (resolvedValue == null) {
      resolvedValue = buffer.getAsSoyValue();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/runtime/BufferedSoyValueProvider.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    buffer.replayOn(appendable);
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProvider.java`
#### Snippet
```java

  @Override
  public final SoyValue resolve() {
    JbcSrcRuntime.awaitProvider(this);
    SoyValue local = resolvedValue;
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProvider.java`
#### Snippet
```java

  @Override
  public final RenderResult status() {
    if (resolvedValue != TombstoneValue.INSTANCE) {
      return RenderResult.done();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProvider.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    RenderResult result = status();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    if (isDone()) {
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java

  @Override
  public final RenderResult status() {
    if (isDone()) {
      return RenderResult.done();
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java

  @Override
  public final SoyValue resolve() {
    JbcSrcRuntime.awaitProvider(this);
    SoyValue local = getResolvedValue();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
      extends EnhancedAbstractExprNodeVisitor<SoyExpression> {
    // is null when we are generating code with no detaches.
    @Nullable final ExpressionDetacher detacher;
    private final SoyNode context;
    final TemplateAnalysis analysis;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
    @Nullable SetMultimap<String, String> endPlaceholderToStartPlaceholder;
    private final long msgId;
    private final boolean htmlEscape;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // correctly in the face of translators reordering things.
    // The constraints are simply that an end tag must come after a start tag
    @Nullable Set<String> startPlaceholders;
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

    @Override
    public RenderResult status() {
      return RenderResult.done();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // The constraints are simply that an end tag must come after a start tag
    @Nullable Set<String> startPlaceholders;
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
    @Nullable SetMultimap<String, String> endPlaceholderToStartPlaceholder;
```

### NullableProblems
Method annotated with @Nullable must not override @Nonnull method
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public SoyValue resolve() {
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
              new CacheLoader<>() {
                @Override
                public Optional<Class<?>> load(Type key) {
                  switch (key.getSort()) {
                    case Type.ARRAY:
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
              new CacheLoader<>() {
                @Override
                public Optional<Class<?>> load(Type key) {
                  switch (key.getSort()) {
                    case Type.ARRAY:
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java
  private final ErrorReporter errorReporter;

  @Nullable private HtmlMatcherGraph htmlMatcherGraph = null;

  public StrictHtmlValidationPass(ErrorReporter errorReporter) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherAccumulatorNode.java`
#### Snippet
```java
public final class HtmlMatcherAccumulatorNode extends HtmlMatcherGraphNode {

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherTagNode.java`
#### Snippet
```java
  private final HtmlTagNode htmlTagNode;

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  public HtmlMatcherTagNode(SoyNode htmlTagNode) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherBlockNode.java`
#### Snippet
```java
  private final String parentBlockType;

  @Nullable private HtmlMatcherGraphNode nextNode;

  public HtmlMatcherBlockNode(HtmlMatcherGraph graph, String parentBlockType) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  private final HtmlMatcherGraph graph;

  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java

  /** Used for error messages to detail what context an error is in. */
  @Nullable private final String parentBlockType;

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/shared/SoyIdRenamingMap.java`
#### Snippet
```java
   */
  @Nullable
  String get(String key);
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/DirectiveDigest.java`
#### Snippet
```java

  /** The prefix to use for non-ASCII characters not in the escape map. */
  @Nullable final String nonAsciiPrefix;

  /** Innocuous output for this context. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
  private static final class Group<T> {
    final String formattedName;
    @Nullable final T defaultValue;
    final ImmutableMap<String, T> modToValue;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/ForNode.java`
#### Snippet
```java
  private final SourceLocation openTagLocation;

  @Nullable private HtmlContext htmlContext;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/LetContentNode.java`
#### Snippet
```java

  private final SourceLocation openTagLocation;
  @Nullable private final CommandTagAttribute kindAttr;

  public LetContentNode(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlAttributeNode.java`
#### Snippet
```java

  /** Will be null if this attribute node doesn't have a value. */
  @Nullable private final SourceLocation.Point equalsSignLocation;

  public HtmlAttributeNode(
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
    // Methods that satisfy the Escaper interface.
    @Override
    public final String escape(String string) {
      // We pass null so that we don't unnecessarily allocate (and zero) or copy char arrays.
      StringBuilder sb = maybeEscapeOnto(string, null);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
  public abstract static class CrossLanguageStringXform extends Escaper {
    private final String directiveName;
    @Nullable private final Pattern valueFilter;
    private final ImmutableList<Escape> escapes;
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
     * @see #getNonAsciiPrefix
     */
    @Nullable private final String nonAsciiPrefix;

    /**
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java

      @Override
      protected T1 doBackward(T2 b) {
        T1 r = backwardMap.get(b);
        if (r == null) {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java

      @Override
      protected T1 doBackward(T2 b) {
        T1 r = backwardMap.get(b);
        if (r == null) {
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
    return new Converter<>() {
      @Override
      protected T2 doForward(T1 a) {
        T2 r = forwardMap.get(a);
        if (r == null) {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
    return new Converter<>() {
      @Override
      protected T2 doForward(T1 a) {
        T2 r = forwardMap.get(a);
        if (r == null) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/PrintNode.java`
#### Snippet
```java
  private final MessagePlaceholder placeholder;

  @Nullable private HtmlContext htmlContext;

  // TODO(user): Consider adding static factory methods for implicit vs explicit print.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
  private final StandaloneNode node;
  @Nullable private final String nameAsLowerCase;
  @Nullable private final RcDataTagName rcDataTagName;

  public TagName(RawTextNode node) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java

  private final StandaloneNode node;
  @Nullable private final String nameAsLowerCase;
  @Nullable private final RcDataTagName rcDataTagName;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/SoyFileNode.java`
#### Snippet
```java

  /** The name and location of the containing modname, or null if none. */
  @Nullable private final ModNameDeclaration modName;

  /** This Soy file's namespace, or null if syntax version V1. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/ForNonemptyNode.java`
#### Snippet
```java

  private final LocalVar var;
  @Nullable private final LocalVar indexVar;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlContext.java`
#### Snippet
```java

  @Nullable private final EscapingMode escapingMode;
  @Nullable private final String errorMessage;

  /** Whether a class contains information about HTML context */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlContext.java`
#### Snippet
```java
  TEXT(EscapingMode.TEXT);

  @Nullable private final EscapingMode escapingMode;
  @Nullable private final String errorMessage;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/SwitchNode.java`
#### Snippet
```java
  private final SourceLocation openTagLocation;

  @Nullable private HtmlContext htmlContext;

  public SwitchNode(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/IfNode.java`
#### Snippet
```java
        StatementNode {

  @Nullable private HtmlContext htmlContext;
  private final SourceLocation closeTagLocation;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java

  /** The HTML context that the call is in, such as in HTML or Attributes. */
  @Nullable private HtmlContext htmlContext;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java
   * used to help with dom alignment in Incremental DOM backend.
   */
  @Nullable private String callKey;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java
  private ImmutableList<SoyPrintDirective> escapingDirectiveNames = ImmutableList.of();

  @Nullable private HtmlContext htmlContext;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CallParamContentNode.java`
#### Snippet
```java

  private final SourceLocation openTagLocation;
  @Nullable private final CommandTagAttribute kindAttr;

  public CallParamContentNode(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java
  private final boolean isSelfEnding;

  @Nullable private final SamenessKey samenessKey;

  private final MessagePlaceholder placeholder;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/VeLogNode.java`
#### Snippet
```java
  private boolean needsSyntheticVelogNode = false;
  private final List<CommandTagAttribute> attributes;
  @Nullable private final ExprRootNode logonlyExpr;

  public VeLogNode(
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
                new CacheLoader<>() {
                  @Override
                  public ImmutableList<SoySourceFunctionMethod> load(String methodName) {
                    return plugins.lookupSoyFields(methodName).stream()
                        .map(
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
                new CacheLoader<>() {
                  @Override
                  public ImmutableList<SoySourceFunctionMethod> load(String methodName) {
                    return plugins.lookupSoyFields(methodName).stream()
                        .map(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
  private static final class TypeSubstitution {
    /** Parent substitution. */
    @Nullable final TypeSubstitution parent;

    /** The expression whose type we are overriding. */
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
                new CacheLoader<>() {
                  @Override
                  public ImmutableList<SoySourceFunctionMethod> load(String methodName) {
                    return plugins.lookupSoyMethods(methodName).stream()
                        .flatMap(
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
                new CacheLoader<>() {
                  @Override
                  public ImmutableList<SoySourceFunctionMethod> load(String methodName) {
                    return plugins.lookupSoyMethods(methodName).stream()
                        .flatMap(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The meaning string if set, otherwise null (usually null). */
  @Nullable private final String meaning;

  /** The description string for translators. Required. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The EscapingMode where this message is used. */
  @Nullable private EscapingMode escapingMode = null;

  /** The optional alternate id attribute to be used if a translation for the msg id is missing. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The substitution unit info (var name mappings, or null if not yet generated). */
  @Nullable private SubstUnitInfo substUnitInfo = null;

  /** The EscapingMode where this message is used. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The string representation of genderExprs, for debugging. */
  @Nullable private final String genderExprsString;

  /** The substitution unit info (var name mappings, or null if not yet generated). */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The list of expressions for gender values. Null after rewriting. */
  @Nullable private ImmutableList<ExprRootNode> genderExprs;

  /** The meaning string if set, otherwise null (usually null). */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/EscapingMode.java`
#### Snippet
```java

  /** The kind of content produced by the escaping directive associated with this escaping mode. */
  @Nullable public final SanitizedContentKind contentKind;

  /** Whether this directive is only for internal use by the contextual autoescaper. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
  @Nullable private final SourceOffsets offsets;

  @Nullable private HtmlContext htmlContext;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
  private final Provenance provenance;

  @Nullable private final SourceOffsets offsets;

  @Nullable private HtmlContext htmlContext;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java

  /** The params from template header. Null if no decls. */
  @Nullable protected ImmutableList<TemplateHeaderVarDefn> params;

  protected boolean strictHtmlDisabled;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
  private String desc;
  private final SourceLocation sourceLocation;
  @Nullable private final TypeNode typeNode;
  private final TypeNode originalTypeNode;
  private final ExprRootNode initialValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/defn/TemplateParam.java`
#### Snippet
```java
  private final boolean isExplicitlyOptional;

  @Nullable private final ExprRootNode defaultValue;

  public TemplateParam(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  // either value or valueExprList must be set, but not both.
  @Nullable private final String value;
  @Nullable private final ImmutableList<ExprRootNode> valueExprList;

  public CommandTagAttribute(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  private final SourceLocation sourceLocation;
  // either value or valueExprList must be set, but not both.
  @Nullable private final String value;
  @Nullable private final ImmutableList<ExprRootNode> valueExprList;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, SoyFileSupplier> soyFileSuppliers;
  private SoyTypeRegistry typeRegistry = SoyTypeRegistryBuilder.create();
  @Nullable private SoyAstCache astCache = null;
  private ErrorReporter errorReporter = ErrorReporter.exploding(); // See #parse for discussion.
  private boolean allowUnboundGlobals;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    private final ImmutableList<String> importSymbols;

    @Nullable private final ModNameDeclaration modNameDeclaration;
    private final Priority priority;
    @Nullable private final String namespace;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    @Nullable private final ModNameDeclaration modNameDeclaration;
    private final Priority priority;
    @Nullable private final String namespace;

    private final Set<String> usedAliases;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FieldAccessNode.java`
#### Snippet
```java

  /** May be set if this field access is implemented as a soy source method. */
  @Nullable private SoySourceFunctionMethod method;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
public final class ListComprehensionNode extends AbstractParentExprNode {
  private final ComprehensionVarDefn listIterVar;
  @Nullable private final ComprehensionVarDefn indexVar;
  private final boolean hasFilter;
  private int nodeId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java

  /** The data type of the value. */
  @Nullable protected SoyType type;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java
  private final String name;

  @Nullable private final SourceLocation nameLocation;

  /** The data type of the value. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  private final ImmutableList<Identifier> paramNames;

  @Nullable private final ImmutableList<SourceLocation.Point> commaLocations;

  // Mutable state stored in this AST node from various passes.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  private static final class FunctionState {
    @Nullable private FunctionRef function;
    @Nullable private ImmutableList<SoyType> allowedParamTypes;
    private boolean allowedToInvokeAsFunction = false;
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  private static final class FunctionState {
    @Nullable private FunctionRef function;
    @Nullable private ImmutableList<SoyType> allowedParamTypes;
    private boolean allowedToInvokeAsFunction = false;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/internal/i18n/BidiGlobalDir.java`
#### Snippet
```java
  private final String codeSnippet;
  /** An optional {@code goog.require} namespace associated with the snippet. */
  @Nullable private final String namespace;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/SoyAutoescapeException.java`
#### Snippet
```java

  /** The name of the template with the syntax error if any. */
  @Nullable private final String templateName;

  private SoyAutoescapeException(String message, Throwable cause, SoyNode node) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `java/src/com/google/template/soy/sharedpasses/render/RenderableThunk.java`
#### Snippet
```java

  @Override
  public RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException {
    if (content == null) {
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        String delim = matcher.group(1);
        HtmlContext state;
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition(Pattern.compile("(?i)^(javascript|data|blob|filesystem):")) {
        @Override
        boolean isApplicableTo(Context prior, Matcher matcher) {
          return prior.uriPart() == UriPart.START && prior.uriType() != UriType.TRUSTED_RESOURCE;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

    /** Matches a pattern. */
    @Nullable final Pattern pattern;

    /** For matching a literal string. */
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
                  new Transition() {
                    @Override
                    Context computeNextContext(Context prior, Matcher matcher) {
                      return prior.derive(HtmlHtmlAttributePosition.NOT_START);
                    }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

        @Override
        Context computeNextContext(Context prior, Matcher matcher) {
          // TODO(gboyer): Ban all but whitelisted schemes.
          return prior.derive(UriPart.DANGEROUS_SCHEME);
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(literal) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior.transitionToState(state);
      }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior;
      }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior.transitionToState(state);
      }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition() {
        @Override
        Context computeNextContext(Context prior, Matcher matcher) {
          return prior;
        }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
                      Pattern.compile("[,;] *(URL *=? *)?['\"]?", Pattern.CASE_INSENSITIVE)) {
                    @Override
                    Context computeNextContext(Context prior, Matcher matcher) {
                      return prior.toBuilder()
                          .withState(HtmlContext.URI)
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

        @Override
        Context computeNextContext(RawTextNode node, int offset, Context prior, Matcher matcher) {
          UriPart uriPart = prior.uriPart();
          if (uriPart == UriPart.START) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

    /** For matching a literal string. */
    @Nullable final String literal;

    Transition(Pattern pattern) {
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition(Pattern.compile("([:./&?=#])|\\z")) {
        @Override
        boolean isApplicableTo(Context prior, Matcher matcher) {
          return prior.uriType() != UriType.TRUSTED_RESOURCE;
        }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(RawTextNode node, int offset, Context prior, Matcher matcher) {
        throw SoyAutoescapeException.createWithNode(
            message, node.substring(Integer.MAX_VALUE, offset));
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuPluginContext.java`
#### Snippet
```java
/** Exposes plugin context for Tofu, based on a SoyMsgBundle. */
final class TofuPluginContext implements JavaPluginContext {
  @Nullable private final SoyMsgBundle msgBundle;

  public TofuPluginContext(@Nullable SoyMsgBundle msgBundle) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  }

  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java

  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;

  private TofuJavaValue(SoyValue soyValue, Object rawValue, SourceLocation sourceLocation) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
     * that is part of the attribute but not part of the value.
     */
    @Nullable public final String text;

    AttributeEndDelimiter(String text) {
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

      @Override
      public RenderResult status() {
        return RenderResult.done();
      }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
  private final Environment env;

  @Nullable private final SoyMsgBundle msgBundle;

  /** The current CSS renaming map. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
  private final String instanceKey;
  private final PluginInstances pluginInstances;
  @Nullable private final FunctionType externSig;

  TofuValueFactory(JavaPluginExecContext fn, PluginInstances pluginInstances) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/base/internal/Identifier.java`
#### Snippet
```java
 *
 * <p>Errorprone can't handle that type() is memorized. See
 * https://github.com/google/closure-templates/issues/183
 */
@AutoValue.CopyAnnotations
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/data/ordainers/JsIdentifierOrdainer.java`
#### Snippet
```java
 * Creation utilities for SanitizedContent objects for JS identifiers.
 *
 * <p>This is based on http://mathiasbynens.be/notes/javascript-identifiers
 */
public final class JsIdentifierOrdainer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
  /**
   * Regex pattern for ICU syntax chars needing escaping. Reference:
   * http://userguide.icu-project.org/formatparse/messages
   *
   * <p>Syntax chars are single quote, braces, and hash. Single quotes not followed by another
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jssrc/dsl/Precedence.java`
#### Snippet
```java
/**
 * JavaScript operator precedence as documented in:
 * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence#table
 */
public enum Precedence {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jssrc/dsl/CodeChunks.java`
#### Snippet
```java

  /**
   * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Grammar_and_types#Variables
   *
   * <p>This incorrectly allows keywords, but that's not a big problem because doing so would cause
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jssrc/internal/JsSrcUtils.java`
#### Snippet
```java
   * Set of words that JavaScript considers reserved words. These words cannot be used as
   * identifiers. This list is from the ECMA-262 v5, section 7.6.1:
   * http://www.ecma-international.org/publications/files/drafts/tc39-2009-050.pdf plus the keywords
   * for boolean values and {@code null}. (Also includes the identifiers "proto", "soy", and
   * "soydata", which are used internally by Soy.)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
   *
   * <pre>
   *   &lt;a href="http://www.google.com/search?hl=en
   *     {for $i in range(3)}
   *       &amp;param{$i}={$i}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
   *
   * <p>Note this is almost a classic Control Flow Graph
   * https://en.wikipedia.org/wiki/Control_flow_graph with the following exceptions
   *
   * <ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
   * node.
   *
   * <p>This essentially a 'basic block' https://en.wikipedia.org/wiki/Basic_block with the caveat
   * that we are tracking expressions instead of instructions.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/jbcsrc/shared/ClassLoaderFallbackCallFactory.java`
#### Snippet
```java
 * references. Instead we defer the linkage decision until runtime using {@code invokedynamic}.
 *
 * <p>See https://wiki.openjdk.java.net/display/HotSpot/Method+handles+and+invokedynamic for brutal
 * detail.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/passes/BasicHtmlValidationPass.java`
#### Snippet
```java
  /**
   * Report an error when we find a duplicate attribute.
   * https://html.spec.whatwg.org/multipage/syntax.html#attributes-2
   */
  private void checkForDuplicateAttributes(ParentSoyNode<StandaloneNode> parentNode) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * allow spaces in the phone number this is not part of the RFC but supported by browsers.
   *
   * <p>The RFC for the sms: https://tools.ietf.org/html/rfc5724
   *
   * <p>The RFC for URIs: https://tools.ietf.org/html/rfc3986
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * <p>The RFC for the sms: https://tools.ietf.org/html/rfc5724
   *
   * <p>The RFC for URIs: https://tools.ietf.org/html/rfc3986
   */
  public static final class FilterSmsUri extends CrossLanguageStringXform {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * Accepts only tel URIs but does not verify complete correctness.
   *
   * <p>The RFC for the tel: URI https://tools.ietf.org/html/rfc3966
   */
  public static final class FilterTelUri extends CrossLanguageStringXform {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * </ul>
   *
   * <p>See also https://www.w3.org/TR/CSP3/#grammardef-base64-value
   */
  public static final class FilterCspNonceValue extends CrossLanguageStringXform {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * Accepts only sip URIs but does not verify complete correctness.
   *
   * <p>The RFC for sip: https://tools.ietf.org/html/rfc3261
   *
   * <p>The RFC for URIs: https://tools.ietf.org/html/rfc3986
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
   * <p>The RFC for sip: https://tools.ietf.org/html/rfc3261
   *
   * <p>The RFC for URIs: https://tools.ietf.org/html/rfc3986
   */
  public static final class FilterSipUri extends CrossLanguageStringXform {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
   *
   * <p>This implements the content model described in
   * https://www.w3.org/TR/html5/syntax.html#optional-tags.
   *
   * <p><b>Note:</b>If {@code this} is a dynamic tag, then this test alsways returns {@code false}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
   * <p>The {@code <p>} tag gets special treatment, because it can be closed by any HTML close tag
   * except the ones in this list. See <a *
   * href="https://www.w3.org/TR/html5/syntax.html#optional-tags">https://www.w3.org/TR/html5/syntax.html#optional-tags</a>
   */
  private static final ImmutableSet<String> PTAG_CLOSE_EXCEPTIONS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  }

  /** From http://www.w3.org/TR/html-markup/syntax.html#syntax-elements */
  public static final ImmutableSet<String> HTML5_VOID_ELEMENTS =
      ImmutableSet.of(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soytree/HtmlContext.java`
#### Snippet
```java
   * In JavaScript inside a template literal string.
   *
   * <p>See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals
   */
  JS_TEMPLATE_LITERAL("Js template literals cannot contain dynamic values"),
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soytree/EscapingMode.java`
#### Snippet
```java
   *
   * <p>See
   * https://html.spec.whatwg.org/multipage/scripting.html#restrictions-for-contents-of-script-elements
   * which describes the character sequences which must be escaped inside of a s
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
  /**
   * Special cases for underscoresToCamelCase. In
   * https://github.com/protocolbuffers/protobuf/blob/master/src/google/protobuf/compiler/java/java_helpers.h
   * there is a list of forbidden words (names that should be avoided as field names). For a
   * forbidden word, java_helpers.cc adds a trailing "_" after converting underscores to camel case.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java

      /**
       * Word started with a URL prefix (http:// or https://); urlWordCount has been incremented.
       */
      public static final int URL = 9;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
   * "European" numbers, or an "Arabic" number with a leading plus sign, or more than one unsigned
   * "European" number, return Dir.LTR. This ensures that the text is displayed LTR even in an RTL
   * context, where things like "http://www.google.com/", "-5", "+١٢٣٤٢٣٤٦٧٨٩" (assuming it is
   * intended as an international phone number, not an explicitly signed positive number, which is a
   * very rare use case), "3 - 2 = 1", "(03) 123 4567", and, when preceded by an Arabic letter, even
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
     *
     * <p>This is based on the attribute parsing spec:
     * https://www.w3.org/TR/html5/syntax.html#attributes-0 also see
     * https://www.w3.org/TR/html51/syntax.html#attribute-name-state
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
     * <p>This is based on the attribute parsing spec:
     * https://www.w3.org/TR/html5/syntax.html#attributes-0 also see
     * https://www.w3.org/TR/html51/syntax.html#attribute-name-state
     */
    static final CharMatcher TAG_DELIMITER_MATCHER =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
    /**
     * Regex for allowed attribute names. Intentionally more restrictive than spec:
     * https://html.spec.whatwg.org/multipage/syntax.html#attribute-name-state Allows {@code
     * data-foo} and other dashed attribute names, but intentionally disallows "--" as an attribute
     * name so that a tag ending after a value-less attribute named "--" cannot be confused with an
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
  private static final class Visitor extends AbstractSoyNodeVisitor<Void> {
    /**
     * Spec: http://www.w3.org/TR/html5/syntax.html#tag-name-state -- however, unlike the spec,
     * which appears to allow arbitrary Unicode chars after the first char, we only parse ASCII
     * identifier tag names.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
   * List of link types (values of the <link rel=...> attribute) for which the link is a regular
   * URL, and not a trusted resource URL. Most of these values are described at
   * https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types or
   * http://microformats.org/wiki/existing-rel-values
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
   * URL, and not a trusted resource URL. Most of these values are described at
   * https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types or
   * http://microformats.org/wiki/existing-rel-values
   */
  private static final ImmutableSet<String> REGULAR_LINK_REL_VALUES =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
 * messages.
 *
 * <p>XLIFF specification: http://docs.oasis-open.org/xliff/xliff-core/xliff-core.html
 */
class XliffGenerator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/xliffmsgplugin/XliffParser.java`
#### Snippet
```java
 * Static function for parsing the content of a translated XLIFF file and creating a SoyMsgBundle.
 *
 * <p>XLIFF specification: http://docs.oasis-open.org/xliff/xliff-core/xliff-core.html
 */
class XliffParser {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
   * <p>Escapes data for embedding in a <script> tag with a non JS content type. (JS content is
   * handled elsewhere). See
   * https://html.spec.whatwg.org/multipage/scripting.html#restrictions-for-contents-of-script-elements
   * for the requirements.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
   * Implements the |filterCspNonceValue directive.
   *
   * <p>See https://www.w3.org/TR/CSP2/#nonce_value
   */
  @SoyPurePrintDirective
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
   * Removes static children from {@code node} and returns them in a map of key to value. For
   * attribute nodes that are known to be static, we can improve performance by adding them to the
   * statics array(http://google.github.io/incremental-dom/#statics-array).
   */
  private ImmutableMap<String, Expression> getStaticAttributes(HtmlOpenTagNode node) {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
    usage = "The locale string of the source language (default 'en')."
  )
  private String sourceLocaleString = "en";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
            + " value will be ignored by the message plugin)."
  )
  private String targetLocaleString = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToIncrementalDomSrcCompiler.java`
#### Snippet
```java
              + " will end up with two separate and possibly different sets of translations"
              + " for your messages.")
  private boolean googMsgsAreExternal = false;

  private final PerInputOutputFiles outputFiles =
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToIncrementalDomSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated GSS header file.")
  private boolean dependOnCssHeader = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
          "[Optional] The value to use for the Kythe corpus of GeneratedCodeInfo metadata. If empty"
              + " GeneratedCodeInfo will not be added to the output.")
  private String kytheCorpus = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " your Soy code uses bidi functions/directives."
  )
  private String bidiIsRtlFn = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " It is required for {msg} command."
  )
  private String translationClass = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " module must implement all functions of the environment module if provided."
  )
  private String environmentModulePath = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
      required = false,
      usage = "[Optional] Whether to validate the plugin's Java implementations.")
  private boolean validateJavaImpls = true;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " necessary if a message file is provided, because by default the bidi global"
              + " directionality is simply inferred from the message file.")
  private int bidiGlobalDir = 0;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " --bidiGlobalDir, or --useGoogIsRtlForBidiGlobalDir, usually the latter."
              + " Also see --googMsgsAreExternal.")
  private boolean shouldGenerateGoogMsgDefs = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " will end up with two separate and possibly different sets of translations"
              + " for your messages.")
  private boolean googMsgsAreExternal = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " Whether to determine the bidi global direction at template runtime by"
              + " evaluating (goog.i18n.bidi.IS_RTL). Do not combine with --bidiGlobalDir.")
  private boolean useGoogIsRtlForBidiGlobalDir = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated CSS header file.")
  private boolean dependOnCssHeader = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " into underscore, e.g. pt-BR becomes pt_br. The format string must end with"
              + " an extension matching the message file format (case-insensitive).")
  private String messageFilePathFormat = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "the performance in general. "
              + "This flag should only be set in integration test environment.")
  private boolean disableOptimizer = false;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      name = "--allow_unblessed_generated_files",
      usage = "Whether to allow generated source files without the blessed comment.")
  private boolean allowUnblessedGeneratedFiles = true;

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/soytree/TemplateElementNodeBuilder.java`
#### Snippet
```java
      SoyErrorKind.of("Soy element kind must be html or html<...>.");

  private List<CommandTagAttribute> attrs = ImmutableList.of();

  /** The "allowbrokenelementcollisions" attribute */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  // disable optimization by default
  private boolean runOptimizer = false;
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            + " messages from the Soy source will be used."
  )
  private String locale = "";

  /** Counter for the number of examples written so far. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
  private Map<SoyFileNode, String> soyFileToJavaClassNameMap;

  private final String kytheCorpus;
  /** Registry of all templates in the Soy tree. */
  private final FileSetMetadata fileSetMetadata;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomInteropVisitor.java`
#### Snippet
```java
/** Generates mod code to stub SoyJS with IDOM. */
public final class GenIncrementalDomInteropVisitor extends GenJsCodeVisitor {
  private List<String> jsFilesContents;
  private JsCodeBuilder codeBuilder;
  private GoogRequire idomGoogRequire;
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    if (isValid) {
      for (StandaloneNode child : openTag.getChildren()) {
        if (child instanceof SkipNode) {
          hasSkipNode = true;
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
    for (Path outputPath : outputPathToContents.keySet()) {
      if (outputPath.getParent() != null) {
        outputPath.getParent().toFile().mkdirs();
      }
      try {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
      return; // known to exist
    } else {
      new File(dirPath).mkdirs();
      knownExistingDirs.add(dirPath);
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
    } catch (IOException ex) {
      // Make sure an abortive write does not leave a file w
      output.file.delete();
    }
  }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `childrenStream()` is identical to its super method
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java

  @Override
  Stream<? extends CodeChunk> childrenStream() {
    return Stream.empty();
  }
```

### RedundantMethodOverride
Method `getInnocuousOutput()` is identical to its super method
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java

    @Override
    public String getInnocuousOutput() {
      return INNOCUOUS_OUTPUT;
    }
```

### RedundantMethodOverride
Method `toSourceString()` is identical to its super method
in `java/src/com/google/template/soy/soytree/KeyNode.java`
#### Snippet
```java

  @Override
  public String toSourceString() {
    return getTagString();
  }
```

### RedundantMethodOverride
Method `visitSoyFileSetNode()` is identical to its super method
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomInteropVisitor.java`
#### Snippet
```java

  @Override
  protected void visitSoyFileSetNode(SoyFileSetNode node) {
    for (SoyFileNode soyFile : node.getChildren()) {
      visit(soyFile);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyToJbcSrcCompiler.java`
#### Snippet
```java
  @Option(
    name = "--outputSrcJar",
    required = false,
    usage =
        "[Optional] The file name of the JAR containing sources to be written.  Each compiler"
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
  @Option(
      name = "--pluginRuntimeJars",
      required = false,
      usage =
          "[Optional] The list of jars that contain the plugin runtime"
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
  @Option(
      name = "--validateJavaImpls",
      required = false,
      usage = "[Optional] Whether to validate the plugin's Java implementations.")
  private boolean validateJavaImpls = true;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
  @Option(
      name = "--javaPackage",
      required = false,
      usage =
          "The Java package name used for generated Java classes associated with these"
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/basicfunctions/StringListSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          returnType = "list<string>"),
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/basicfunctions/NumberListSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          // The generic type may be overwritten to a narrower int or float type by
          // ResolveExpressionTypesPass.
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `java/src/com/google/template/soy/i18ndirectives/LocaleSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          returnType = "list<string>"),
      @Signature(
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
step \* i: integer multiplication implicitly cast to long
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
        int size = length / step + (length % step == 0 ? 0 : 1);
        for (int i = 0; i < size; ++i) {
          executeForeachBody(child, i, IntegerData.forValue(start + step * i));
        }
      }
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '_' inside character class
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
     */
    static final Pattern ATTRIBUTE_NAME =
        Pattern.compile("[a-z_$_@](?:[a-z0-9_:?$\\\\-]*[a-z0-9?$_])?", Pattern.CASE_INSENSITIVE);

    /**
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
    // If a matching sig exists w/o a matching return type, return an arbitrary method so we can
    // display a decent error message.
    if (!methodsForSig.isEmpty()) {
      return false;
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        return false;
      }
      if (fd.getJavaType() == JavaType.MESSAGE) {
        return true;
      }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  @Nullable
  public Message getGeneratedCodeInfo() {
    if (!isEnabled()) {
      return null;
    }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
      Expression value, String valueName, String paramKind, Generator codeGenerator) {
    Optional<Expression> typeAssertion = getTypeAssertion(value, codeGenerator);
    if (!typeAssertion.isPresent()) {
      return Optional.empty();
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
                      Optional<Expression> typeAssertion =
                          memberType.getTypeAssertion(value, codeGenerator);
                      if (!typeAssertion.isPresent()) {
                        return Optional.empty();
                      }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/ExternCompiler.java`
#### Snippet
```java
    Method memberMethod = buildMemberMethod(extern.getIdentifier().identifier(), extern.getType());

    if (!extern.getJavaImpl().isPresent()) {
      Statement.throwExpression(MethodRef.NO_EXTERN_JAVA_IMPL.invoke())
          .writeMethod(methodAccess(), memberMethod, writer);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
    return new AutoValue_TemplateVariableManager_SaveRestoreState(
        saveState,
        !restoreFromFrame.isPresent() && restoreDerivedVariables.isEmpty()
            ? Optional.empty()
            : Optional.of(
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java
          IfBlock curr = ifs.get(i);
          boolean isLastIfBlock = i == ifs.size() - 1;
          if (isLastIfBlock && !elseBlock.isPresent()) {
            next = end;
          } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
   */
  private void generateModifiableSelectMethod() {
    if (!template.modifiableSelectMethod().isPresent()) {
      return;
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
                  exprNode, BasicDetacher.INSTANCE);

      if (!expr.isPresent()) {
        return Optional.empty();
      }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
      Scope scope,
      final ImmutableList.Builder<Statement> initStatements) {
    if (!expression.isPresent()) {
      return constant(defaultValue);
    } else if (expression.get() instanceof IntegerNode
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    Optional<ListOfExpressionsAndInitializer> asPositionalParams(
        TemplateVariableManager.Scope scope, TemplateType calleeType) {
      if (!explicit().isPresent()) {
        return Optional.empty();
      }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
    for (String delTemplateImplName : delTemplateNames) {
      TemplateData data = getTemplateData(delTemplateImplName);
      if (!data.delTemplateName.isPresent()) {
        throw new IllegalArgumentException(
            "Expected " + delTemplateImplName + " to be a deltemplate");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
        }
      }
      checkState(!replacements.isPresent());
    }
  }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
    Optional<Class<?>> leftClass = objectTypeToClassCache.getUnchecked(left);
    Optional<Class<?>> rightClass = objectTypeToClassCache.getUnchecked(right);
    if (!leftClass.isPresent() || !rightClass.isPresent()) {
      // This means one of the types being compared is a generated object.  So we can't easily check
      // it.  Just delegate responsibility to the verifier.
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
    Optional<Class<?>> leftClass = objectTypeToClassCache.getUnchecked(left);
    Optional<Class<?>> rightClass = objectTypeToClassCache.getUnchecked(right);
    if (!leftClass.isPresent() || !rightClass.isPresent()) {
      // This means one of the types being compared is a generated object.  So we can't easily check
      // it.  Just delegate responsibility to the verifier.
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/VeLogValidationPass.java`
#### Snippet
```java
        VeType veType = (VeType) veExpr.getType();
        SoyType dataType = dataExpr.getType();
        if (!veType.getDataType().isPresent()) {
          reporter.report(dataExpr.getSourceLocation(), UNEXPECTED_DATA, veType, dataType);
        } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
    }
    HtmlAttributeValueNode attrValue = (HtmlAttributeValueNode) value;
    if (!condition.isPresent()) {
      CallParamContentNode contentNode =
          new CallParamContentNode(
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/ElementCheckCrossTemplatePass.java`
#### Snippet
```java
          Optional<SoyType> maybeType =
              ContextualAutoescaper.getRequiredTypeFromAttributeName(attr.getAttrName(), node);
          if (!maybeType.isPresent()) {
            return;
          }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java
  private void setGraphCursorNode(HtmlMatcherGraphNode node) {
    graphCursor = Optional.of(node);
    if (!rootNode.isPresent()) {
      rootNode = graphCursor;
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
            "condition");
    if (foreignContentTagDepth > 0) {
      if (!isInternallyBalancedForForeignContent.isPresent()) {
        pass.run(graph);
        isInternallyBalancedForForeignContent = Optional.of(errorReporter.getErrors().isEmpty());
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
      return isInternallyBalancedForForeignContent.get();
    }
    if (!isInternallyBalanced.isPresent()) {
      pass.run(graph);
      isInternallyBalanced = Optional.of(errorReporter.getErrors().isEmpty());
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
   */
  public void run(HtmlMatcherGraph htmlMatcherGraph) {
    if (!htmlMatcherGraph.getRootNode().isPresent()) {
      // Empty graph.
      return;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
    if (!maybeNode.isPresent()) {
      return () -> {
        checkUnusedTags(stack);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
        Optional<SoyType> returnType =
            soyTypeForProtoOrEnum(actualClass, expectedType, method, reporter);
        if (!returnType.isPresent()) {
          return; // error already reported
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
        Optional<SoyType> returnType =
            soyTypeForProtoOrEnum(actualClass, expectedType, method, reporter);
        if (!returnType.isPresent()) {
          return; // error already reported
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
    }
    Optional<String> fullName = nameFromDescriptor(actualType);
    if (!fullName.isPresent()) {
      reporter.incompatibleReturnType(actualType, expectedType, method);
      return Optional.empty();
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java

  public boolean isDefault() {
    return !userSuppliedName().isPresent() && !example().isPresent();
  }
}
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java

  public boolean isDefault() {
    return !userSuppliedName().isPresent() && !example().isPresent();
  }
}
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    Optional<SanitizedContentKind> contentKind = SanitizedContentKind.fromAttributeValue(value);
    if (!contentKind.isPresent()) {
      errorReporter.report(
          valueLocation,
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    Optional<TemplateContentKind> contentKind = TemplateContentKind.fromAttributeValue(value);
    if (!contentKind.isPresent()) {
      errorReporter.report(valueLocation, TemplateContentKind.INVALID_ATTRIBUTE_VALUE);
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
      // If we can't combine all those types into a single supported type then fail.

      if (!superType.isPresent()) {
        params.put(paramName, ParamInfo.of(param, ParamStatus.INDIRECT_INCOMPATIBLE_TYPES, true));
        continue;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
      // parse the children in.
      Optional<Context.MsgEscapingStrategy> maybeStrategy = context.getMsgEscapingStrategy(node);
      if (!maybeStrategy.isPresent()) {
        throw SoyAutoescapeException.createWithNode(
            "Messages are not supported in this context, because it would mean asking "
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
        Context elseContext = infer(neNode, afterBody);
        Optional<Context> combined = Context.union(elseContext, afterBody);
        if (!combined.isPresent()) {
          throw SoyAutoescapeException.createWithNode(
              "{"
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
        Context brOut = infer(branch, context);
        Optional<Context> combined = Context.union(out, brOut);
        if (!combined.isPresent()) {
          throw SoyAutoescapeException.createWithNode(
              (node instanceof IfNode
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
      if (!sawElseOrDefault) {
        Optional<Context> combined = Context.union(context, out);
        if (!combined.isPresent()) {
          throw SoyAutoescapeException.createWithNode(
              (node instanceof IfNode
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
      // if either runnable is absent, we can drop the other runnable, if both runnables are present
      // we preserve both
      if (!onPass.isPresent()) {
        return this;
      }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
        return this;
      }
      if (!other.onPass.isPresent()) {
        return other;
      }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    Optional<ExternNode> matching =
        externNodes.stream().filter(e -> e.getType().equals(soyFunction.signature())).findFirst();
    if (!matching.isPresent()) {
      throw RenderException.createF(
          "No extern named '%s' matching signature %s.",
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    }
    Optional<JavaImplNode> impl = matching.get().getJavaImpl();
    if (!impl.isPresent()) {
      throw RenderException.createF("No java implementation for extern '%s'.", soyFunction.name());
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
    } else {
      Optional<String> formatArg = args.get(1).asStringLiteral();
      if (!formatArg.isPresent()) {
        throw new IllegalArgumentException(
            "The second parameter to formatNum must be a string literal");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
            Metadata.getCallContentKind(fileSetMetadata, (CallNode) n);
        needsToBeCoerced =
            !kind.isPresent()
                || kind.get().isHtml()
                || kind.get() == SanitizedContentKind.ATTRIBUTES;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
    switch (node.getHtmlContext()) {
      case HTML_TAG:
        if (!kind.isPresent() || kind.get() != SanitizedContentKind.ATTRIBUTES) {
          call =
              SOY_IDOM_CALL_DYNAMIC_ATTRIBUTES.call(
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      case HTML_NORMAL_ATTR_VALUE:
        Expression textCall;
        if (!kind.isPresent()
            || kind.get() == SanitizedContentKind.ATTRIBUTES
            || kind.get().isHtml()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
        return Statements.of(statements);
      default:
        if (!kind.isPresent() || !kind.get().isHtml()) {
          if (node instanceof CallBasicNode && ((CallBasicNode) node).getVariantExpr() != null) {
            call =
```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplate.java`
#### Snippet
```java
            .getTemplate(templateValue.getTemplateName())
            .render(
                templateValue.getBoundParameters().orElseGet(() -> ParamStore.EMPTY_INSTANCE),
                ij,
                appendable,
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `conformanceConfigs` are queried, but never updated
in `java/src/com/google/template/soy/SoyConformanceChecker.java`
#### Snippet
```java
      usage = "Location of conformance config protos in text proto format.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> conformanceConfigs = new ArrayList<>();

  SoyConformanceChecker(PluginLoader loader, SoyInputCache cache) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `inputRoots` are queried, but never updated
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
              + "are transformed into output paths.  See --outputDirectory for more information.",
      handler = SoyCmdLineParser.PathListOptionHandler.class)
  private List<Path> inputRoots = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `locales` are queried, but never updated
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " combination of input Soy file and locale.",
      handler = SoyCmdLineParser.StringListOptionHandler.class)
  private List<String> locales = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `pluginModules` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " print directive plugins (comma-delimited list).",
      handler = SoyCmdLineParser.ModuleListOptionHandler.class)
  private List<Module> pluginModules = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `javaDeps` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " references.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> javaDeps = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `indirectDepHeaders` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "Used by the compiler for typechecking and call analysis.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> indirectDepHeaders = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `depHeaders` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " analysis/checking..",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> depHeaders = new ArrayList<>();

  @Option(
```

### MismatchedCollectionQueryUpdate
Contents of collection `fieldSpecificSuffixes` are queried, but never updated
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java

  public static String getJsFieldSpecificSuffix(FieldDescriptor fieldDesc) {
    Map<FieldDescriptor, String> fieldSpecificSuffixes = new HashMap<>();

    return fieldSpecificSuffixes.getOrDefault(fieldDesc, "");
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `java/src/com/google/template/soy/jssrc/dsl/ImportsBuilder.java`
#### Snippet
```java
        break;
      }
      dotPlusNestedSymbol = topLevelMsg.substring(dotIndex) + dotPlusNestedSymbol;
      topLevelMsg = topLevelMsg.substring(0, dotIndex);
    }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
      String unreservedChars = "-.";
      for (char c = '0'; c <= '9'; c++) {
        unreservedChars += c;
      }
      for (char c = 'A'; c <= 'Z'; c++) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
      }
      for (char c = 'A'; c <= 'Z'; c++) {
        unreservedChars += c;
      }
      unreservedChars += '_';
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
      unreservedChars += '_';
      for (char c = 'a'; c <= 'z'; c++) {
        unreservedChars += c;
      }
      unreservedChars += '~';
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `java/src/com/google/template/soy/testing/SharedTestUtils.java`
#### Snippet
```java
    String contents = "{" + soyExpr + "}\n";
    for (String loopVar : loopVarNames) {
      contents = "{for $" + loopVar + " in [null]}\n" + contents + "\n{/for}";
    }
    templateBody.append(contents);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java
          tokenString = ((Token) syntaxEl).getValue();
        } else {
          tokenString += " " + ((Token) syntaxEl).getValue();
        }
      }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java
    while (e.getCause() instanceof SoyAutoescapeException) {
      e = (SoyAutoescapeException) e.getCause();
      message += "\n- " + e.getMessage();
    }
    errorReporter.report(e.getSourceLocation(), AUTOESCAPE_ERROR, message);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `pyExprText` initializer `""` is redundant
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java
                generateMsgFunc(node.getMsg(), /* useAlternateId=*/ true).getText())
            : msg.getText();
    String pyExprText = "";

    // MsgFallbackGroupNode could only have one child or two children. See MsgFallbackGroupNode.
```

### UnusedAssignment
Variable `modifiers` initializer `0` is redundant
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
  public static FieldRef instanceFieldReference(Class<?> owner, String name) {
    Class<?> fieldType;
    int modifiers = 0;
    try {
      Field declaredField = owner.getDeclaredField(name);
```

### UnusedAssignment
The value `text.charAt(charIndex++)` assigned to `lastChar` is never used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex < length && (lastChar = text.charAt(charIndex++)) != quote) {}
        }
      }
```

### UnusedAssignment
The value `text.charAt(--charIndex)` assigned to `lastChar` is never used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex > 0 && (lastChar = text.charAt(--charIndex)) != quote) {}
        }
      }
```

### UnusedAssignment
The value `builder.addDefault(delTemplateName, variant, template)` assigned to `previous` is never used
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
    if (modName == null) {
      // default delegate
      previous = builder.addDefault(delTemplateName, variant, template);
    } else {
      previous = builder.add(delTemplateName, modName, variant, template);
```

### UnusedAssignment
Variable `cp` initializer `-1` is redundant
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
        }
      }
      int cp = -1;
      if (end == -1) {
        cp = -1;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `other != null` is always `true`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Override
  public boolean equals(Object other) {
    return other != null
        && this.getClass() == other.getClass()
        // Use identity for js compatibility
```

### ConstantValue
Condition `other != null` is always `true`
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java
    // Keep this in sync with UnsanitizedString#equals so that StringData and UnsanitizedString can
    // be used interchangeably.
    return other != null && getValue().equals(other.toString());
  }

```

### ConstantValue
Method reference result is always 'true'
in `java/src/com/google/template/soy/pysrc/restricted/PyFunctionExprBuilder.java`
#### Snippet
```java
        kwargMap.entrySet().stream()
            .map(entry -> entry.getKey() + "=" + entry.getValue().getText())
            .filter(Objects::nonNull)
            .collect(Collectors.joining(", "));

```

### ConstantValue
Condition `elem instanceof String` is always `true`
in `java/src/com/google/template/soy/pysrc/restricted/PyExprUtils.java`
#### Snippet
```java
      } else if (elem instanceof PyExpr) {
        values.add(((PyExpr) elem).getText());
      } else if (elem instanceof String) {
        values.add("'" + elem + "'");
      }
```

### ConstantValue
Value `isPositionalStyle` is always 'false'
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
    if (!isPositionalStyle) {
      bodyStatements.add(redeclareIjData());
      generateIdomStub(node, alias, bodyStatements, templateArguments(node, isPositionalStyle));
    } else {
      bodyStatements.add(
```

### ConstantValue
Condition `size == 2` is always `true` when reached
in `java/src/com/google/template/soy/jbcsrc/SimpleLocalVariableManager.java`
#### Snippet
```java
    while (start < 65536) {
      int nextClear = availableSlots.nextClearBit(start);
      if (size == 1 || (size == 2 && !availableSlots.get(nextClear + 1))) {
        availableSlots.set(nextClear, nextClear + size);
        return nextClear;
```

### ConstantValue
Condition `value == null` is always `false`
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
      }
      SoyValue value = variantProvider.resolve();
      variant = value == null ? "null" : value.coerceToString();
    }
    CompiledTemplate template = getDelTemplate(delCalleeName, variant);
```

### ConstantValue
Condition `resolved == null` is always `false`
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProvider.java`
#### Snippet
```java
    if (result.isDone()) {
      SoyValue resolved = resolve();
      if (resolved == null) {
        appendable.append("null");
      } else {
```

### ConstantValue
Condition `attributesNode != null` is always `true`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            });

    if (attributesNode != null && attributesNode.numChildren() > 0) {
      if (templateType.getAllowExtraAttributes()) {
        call.addChild(attributesNode);
```

### ConstantValue
Condition `closeTag != null` is always `true` when reached
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    }
    // openTag being null means that the template isn't kind HTML.
    boolean isValid = openTag != null && closeTag != null;
    boolean hasSkipNode = false;
    String delegateTemplate = null;
```

### ConstantValue
Condition `this.defaultValue == null` is always `true`
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
          return this.defaultValue;
        }
        checkState(this.defaultValue == null);
        this.defaultValue = checkNotNull(defaultValue);
        return null;
```

### ConstantValue
Condition `suffix.length() > 0` is always `true`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
    }
    String suffix = methodName.substring(3);
    if (suffix.length() > 0 && !Ascii.isUpperCase(suffix.charAt(0))) {
      return Optional.empty();
    }
```

### ConstantValue
Condition `index > endTextIndex` is always `true`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
          endReason = reasons[i];
          break;
        } else if (index > endTextIndex) {
          // to find the end location we need to scan from the previous index
          Point endPoint = getLocationOf(text, i - 1, endTextIndex);
```

### ConstantValue
Condition `params == null` is always `false`
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    super(nodeBuilder.getId(), nodeBuilder.sourceLocation, nodeBuilder.openTagLocation, cmdName);
    checkNotNull(params);
    this.headerParams = params == null ? ImmutableList.of() : params;
    this.soyFileHeaderInfo = soyFileHeaderInfo;
    this.templateName = nodeBuilder.getTemplateName();
```

### ConstantValue
Condition `escapingModes != null` is always `true`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Inferences.java`
#### Snippet
```java
            || (node instanceof MsgFallbackGroupNode),
        "Escaping directives may only be set for {print}, {msg}, or {call} nodes");
    if (escapingModes != null) {
      nodeToEscapingModes.put(node, ImmutableList.copyOf(escapingModes));
    }
```

### ConstantValue
Value `error` is always 'null'
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java

      if (!directTagChildren.isEmpty()) {
        error = format(error, "Expected directTagChildren to be empty, got: %s", directTagChildren);
      }
      if (attributeName != null) {
```

### ConstantValue
Condition `!(base instanceof SoyProtoValue)` is always `true` when reached
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java

    // attempting field access on non-SoyRecord
    if (!(base instanceof SoyRecord) && !(base instanceof SoyProtoValue)) {
      if (nullSafe) {
        if (!isNullOrUndefinedBase(base)) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/css/CssRegistry.java`
#### Snippet
```java

  public ImmutableList<String> allowedSymbolsToUse(String nsOrPath) {
    return classMap().get().get(nsOrPath);
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  public CssRegistry getCssRegistry() {
    return cssRegistry.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
          throwIfErrorsPresent();
          return new AutoValue_SoyFileSet_HeaderResult(
              parseResult.fileSet(), parseResult.registry(), cssRegistry.get());
        });
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

    return new SoySauceImpl(
        templates.get(), scopedData.enterable(), soyFunctions, printDirectives, pluginInstances);
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/data/TemplateValue.java`
#### Snippet
```java

  public Object getCompiledTemplate() {
    return compiledTemplate().get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
              hasVariant(callNode)));
      maybeAddVariantParam(callNode, exprTranslator, params);
      call = callee.positionalStyle().get().call(params);
    } else {
      List<Expression> params = new ArrayList<>();
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
    Preconditions.checkNotNull(msgPartsAndIds);

    this.msgId = useAlternateId ? this.msgNode.getAlternateId().getAsLong() : msgPartsAndIds.id;
    this.msgParts = msgPartsAndIds.parts;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/JbcSrcValueFactory.java`
#### Snippet
```java
        soyExpr =
            SoyExpression.forProto(
                SoyRuntimeType.getUnboxedType(soyTypeForProtoOrEnum(type)).get(), expr);
      } else if (type.isEnum() && ProtocolMessageEnum.class.isAssignableFrom(type)) {
        // We need to get the # out of the enum & cast to a long.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    checkNotNull(detacher);
    // This mode always works so we can unconditionally dereference this
    return createVisitor(exprCompiler, detacher).exec(node).get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java

    if (template.defaultModTemplateMethod().isPresent()) {
      generateTemplateMethod(template.templateMethod(), template.modifiableSelectMethod().get());
      generateTemplateMethod(template.defaultModTemplateMethod().get(), template.renderMethod());
    } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
      return;
    }
    Handle renderHandle = template.positionalRenderMethod().get().asHandle();
    Statement.returnExpression(
            new Expression(BytecodeUtils.COMPILED_TEMPLATE_TYPE) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    @Override
    public Expression getParamsRecord() {
      return paramsRecord.get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java

    HasserGenerator(SoyProtoType protoType, SoyExpression baseExpr, String fieldName) {
      super(SoyRuntimeType.getUnboxedType(protoType).get(), baseExpr);
      this.descriptor = protoType.getFieldDescriptor(fieldName);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
      if (nonNullableFieldType.getKind() == SoyType.Kind.PROTO) {
        SoyProtoType fieldProtoType = (SoyProtoType) nonNullableFieldType;
        SoyRuntimeType protoRuntimeType = SoyRuntimeType.getUnboxedType(fieldProtoType).get();
        return SoyExpression.forProto(protoRuntimeType, field);
      } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
            }.asNonNullable();
      }
      return SoyExpression.forProto(SoyRuntimeType.getUnboxedType(protoType).get(), builtProto);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        // The caller should check that all member types are protos, so this cast is safe.
        SoyProtoType protoType = (SoyProtoType) member;
        SoyRuntimeType unboxed = SoyRuntimeType.getUnboxedType(protoType).get();
        SoyExpression fieldAccess =
            memberGenerator.apply(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        SoyType fieldType,
        SingularFieldAccessMode mode) {
      super(SoyRuntimeType.getUnboxedType(protoType).get(), baseExpr);
      this.fieldType = fieldType;
      this.descriptor = protoType.getFieldDescriptor(fieldName);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        Type type =
            (bothUnboxed
                    ? SoyRuntimeType.getUnboxedType(trueBranch.soyType()).get()
                    : SoyRuntimeType.getBoxedType(trueBranch.soyType()))
                .runtimeType();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
   */
  private CompiledForeachRangeArgs calculateRangeArgs(ForNode forNode, Scope scope) {
    RangeArgs rangeArgs = RangeArgs.createFromNode(forNode).get();
    ForNonemptyNode nonEmptyNode = (ForNonemptyNode) forNode.getChild(0);
    ImmutableList.Builder<Statement> initStatements = ImmutableList.builder();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
            public Optional<DirectPositionalCallGenerator> asDirectPositionalCall() {
              if (metadata.hasPositionalSignature()) {
                var positionalRenderMethod = metadata.positionalRenderMethod().get();
                return Optional.of(
                    new DirectPositionalCallGenerator() {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyRuntimeType.java`
#### Snippet
```java
        // If we are a primitive type then there must be another primitive type that is the same
        // but non-nullable (or nullable).
        return getUnboxedType(newSoyType).get();
      }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyExpression.java`
#### Snippet
```java

  private static SoyRuntimeType getUnboxedType(SoyType soyType) {
    return SoyRuntimeType.getUnboxedType(soyType).get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/DesugarStateNodesPass.java`
#### Snippet
```java
        attributeSourceLocation = openTag.getKeyNode().getSourceLocation();
      } else {
        attributeSourceLocation = skipNode.get().getSourceLocation();
      }
      HtmlAttributeNode htmlAttributeNode =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            parameterMap.containsKey(paramName)
                ? SanitizedContentKind.fromAttributeValue(getKind(parameterMap.get(paramName)))
                    .get()
                : SanitizedContentKind.TEXT);
    call.getParent().addChild(call.getParent().getChildIndex(call), letContentNode);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
    HtmlTagNode tag = (HtmlTagNode) tagNode.getSoyNode().get();
    TagName openTagName = tag.getTagName();
    HtmlStack prev = stack;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
      return SoyTypes.makeNullable(
          computeTypeForProtoFieldName(
              baseType, getGetOrUndefinedFieldName(methodName).get(), soyTypeRegistry));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        SoyTypeRegistry soyTypeRegistry,
        ErrorReporter errorReporter) {
      String fieldName = getGetterFieldName(methodName).get();
      return computeTypeForProtoFieldName(baseType, fieldName, soyTypeRegistry);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
      return SoyTypes.removeNull(
          computeTypeForProtoFieldName(
              baseType, getGetReadonlyFieldName(methodName).get(), soyTypeRegistry));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
    switch (((BuiltinMethod) node.getSoyMethod())) {
      case HAS_PROTO_FIELD:
        return getHasserFieldName(methodName).get();
      case GET_PROTO_FIELD:
        return getGetterFieldName(methodName).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        return getHasserFieldName(methodName).get();
      case GET_PROTO_FIELD:
        return getGetterFieldName(methodName).get();
      case GET_PROTO_FIELD_OR_UNDEFINED:
        return getGetOrUndefinedFieldName(methodName).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        return getGetterFieldName(methodName).get();
      case GET_PROTO_FIELD_OR_UNDEFINED:
        return getGetOrUndefinedFieldName(methodName).get();
      case GET_READONLY_PROTO_FIELD:
        return getGetReadonlyFieldName(methodName).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        return getGetOrUndefinedFieldName(methodName).get();
      case GET_READONLY_PROTO_FIELD:
        return getGetReadonlyFieldName(methodName).get();
      case GET_EXTENSION:
      case GET_READONLY_EXTENSION:
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
    // character's source string instead.
    if (this.provenance.equals(Provenance.COMMAND_CHARACTER)) {
      return this.commandChar.get().sourceString();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
   */
  public CommandChar getCommandChar() {
    return commandChar.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

    public TemplateInfo findTemplate(TemplateNode node) {
      return templates().stream().filter(t -> t.template().equals(node)).findFirst().get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
            cssPath -> {
              if (cssPath.getNamespace() != null
                  && !filePathToNamespace.containsKey(cssPath.resolvedPath().get())) {
                filePathToNamespace.put(
                    String.format("\"%s\"", cssPath.resolvedPath().get()),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
                fileInfo.fileNode().getRequiredCssNamespaces().stream(),
                fileInfo.fileNode().getAllRequiredCssPaths().stream()
                    .map(p -> p.resolvedPath().get()),
                fileInfo.templates().stream()
                    .flatMap(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      params.addAll(positionalParameters.get().get());
      GenCallCodeUtils.maybeAddVariantParam(callNode, exprTranslator, params);
      return callee.positionalStyle().get().call(params);
    }
    params.add(paramObject.get());
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/base/internal/SetOnce.java`
#### Snippet
```java
  public SetOnce<T> copy() {
    SetOnce<T> copy = new SetOnce<>();
    if (value.isPresent()) {
      copy.set(value.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
      Expression value, String valueName, String paramKind, Generator codeGenerator) {
    Optional<Expression> typeAssertion = getTypeAssertion(value, codeGenerator);
    if (!typeAssertion.isPresent()) {
      return Optional.empty();
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  public String toString() {
    return "ve<"
        + (dataType.isPresent() ? dataType.get() : NullType.getInstance().toString())
        + ">";
  }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
            .filter(Objects::nonNull)
            .findFirst();
    if (mods.isPresent()) {
      header.addParameterizedAnnotation("mods", getGoogModuleNamespace(mods.get()));
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java
      protected void doGen(CodeBuilder adapter) {
        expr.gen(adapter);
        if (firstVarInstruction.isPresent()) {
          adapter.mark(firstVarInstruction.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
   */
  public void branchTo(CodeBuilder adapter, Label ifTrue) {
    if (startLabel.isPresent()) {
      adapter.mark(startLabel.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
                      Optional<Class<?>> elementType =
                          objectTypeToClassCache.getUnchecked(key.getElementType());
                      if (elementType.isPresent()) {
                        // The easiest way to generically get an array class.
                        return Optional.of(Array.newInstance(elementType.get(), 0).getClass());
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
    if (isSoyAttr) {
      ExprNode val = new VarRefNode("$" + paramName, unknown, attrs.get(paramName));
      if (condition.isPresent()) {
        return new CallParamValueNode(
            nodeIdGen.genId(),
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java
  public void addNode(HtmlMatcherGraphNode node) {
    checkNotNull(node);
    if (graphCursor.isPresent()) {
      graphCursor.get().linkActiveEdgeToNode(node);
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
                  new ProtoImportProcessor(registry, errorReporter, disableAllTypeChecking),
                  new TemplateImportProcessor(errorReporter, accumulatedState::registryFromDeps));
      if (cssRegistry.isPresent()) {
        importProcessors.add(new CssImportProcessor(cssRegistry.get(), errorReporter));
      }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/soytree/MsgSelectNode.java`
#### Snippet
```java
  public String getCommandText() {
    Optional<String> phname = placeholder.userSuppliedName();
    return phname.isPresent()
        ? selectExpr.toSourceString() + " phname=\"" + phname.get() + "\""
        : selectExpr.toSourceString();
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
    this.escapingMode = orig.escapingMode;
    this.alternateIdAttribute =
        orig.alternateIdAttribute.isPresent()
            ? Optional.of(orig.alternateIdAttribute.get().copy(copyState))
            : Optional.empty();
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
        return this;
      }
      if (!other.onPass.isPresent()) {
        return other;
      }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
                  // placeholder examples are not part of the xliff standard. It is an android
                  // convention so we add it in the hope that tools will support it anyway.
                  + (example.isPresent()
                      ? " example=\"" + attributeEscaper.escape(example.get()) + "\""
                      : "")
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomCodeVisitor.java`
#### Snippet
```java
            /* paramKind= */ "@state",
            templateTranslationContext.codeGenerator());
    if (typeAssertion.isPresent()) {
      setStateMethodStatements.add(typeAssertion.get().asStatement());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
    var staticAttributes = getStaticAttributes(node);
    Optional<Expression> maybeApplyStatics = getApplyStaticAttributes(staticAttributes);
    if (maybeApplyStatics.isPresent()) {
      statements.add(maybeApplyStatics.get().asStatement());
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      case UNION:
        {
          List<SoyType> members = new ArrayList<>(proto.getUnion().getMemberCount());
          for (SoyTypeP member : proto.getUnion().getMemberList()) {
            members.add(fromProto(member, typeRegistry, filePath, errorReporter));
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `soyFileKind`
in `java/src/com/google/template/soy/base/internal/SoyFileSupplier.java`
#### Snippet
```java
     *
     * @param content The Soy file content.
     * @param soyFileKind The kind of this input Soy file.
     * @param filePath The path to the Soy file, used for as a unique map/set key and for messages.
     */
```

### JavadocReference
Cannot resolve symbol `soyFileKind`
in `java/src/com/google/template/soy/base/internal/SoyFileSupplier.java`
#### Snippet
```java
     *
     * @param contentSource Source for the Soy file content.
     * @param soyFileKind The kind of this input Soy file.
     * @param filePath The path to the Soy file, used for as a unique map/set key and for messages.
     */
```

### JavadocReference
Cannot resolve symbol `soyFileKind`
in `java/src/com/google/template/soy/base/internal/SoyFileSupplier.java`
#### Snippet
```java
     *
     * @param inputFile The Soy file.
     * @param soyFileKind The kind of this input Soy file.
     */
    public static SoyFileSupplier create(File inputFile) {
```

### JavadocReference
Cannot resolve symbol `soyFileKind`
in `java/src/com/google/template/soy/base/internal/SoyFileSupplier.java`
#### Snippet
```java
     *
     * @param inputFileUrl The URL of the Soy file.
     * @param soyFileKind The kind of this input Soy file.
     * @param filePath The path to the Soy file, used for as a unique map/set key and for messages.
     */
```

### JavadocReference
Cannot resolve symbol `LoggableElement`
in `java/src/com/google/template/soy/data/LogStatement.java`
#### Snippet
```java
  /**
   * An optional proto that is logged by the {@code data="<...>"} expression. The type will be what
   * is specifed by the corresponding {@link LoggableElement#getProtoType()}.
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `getProtoType()`
in `java/src/com/google/template/soy/data/LogStatement.java`
#### Snippet
```java
  /**
   * An optional proto that is logged by the {@code data="<...>"} expression. The type will be what
   * is specifed by the corresponding {@link LoggableElement#getProtoType()}.
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `LoggableElement`
in `java/src/com/google/template/soy/data/LogStatement.java`
#### Snippet
```java
  LogStatement() {} // prevent subclasses outside the package

  /** The id of the element being logged, as specified by {@link LoggableElement#getId()}. */
  public abstract long id();

```

### JavadocReference
Cannot resolve symbol `getId()`
in `java/src/com/google/template/soy/data/LogStatement.java`
#### Snippet
```java
  LogStatement() {} // prevent subclasses outside the package

  /** The id of the element being logged, as specified by {@link LoggableElement#getId()}. */
  public abstract long id();

```

### JavadocReference
Cannot resolve symbol `setSanitizedContentDirectionality(Dir)`
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java
   * Returns the directionality of this appendable.
   *
   * @see #setSanitizedContentDirectionality(Dir)
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `setSanitizedContentKind(ContentKind)`
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java
   * Returns the content kind of this appendable.
   *
   * @see #setSanitizedContentKind(ContentKind)
   */
  @Nullable
```

### JavadocReference
Symbol `com.google.template.soy.parsepasses.contextautoesc.Context` is inaccessible from here
in `java/src/com/google/template/soy/data/internalutils/NodeContentKinds.java`
#### Snippet
```java
 * evaluate to, and in turn determines the HTML context to use when contextually autoescaping the
 * node's content (see {@link
 * com.google.template.soy.parsepasses.contextautoesc.Context#forContentKind(SanitizedContentKind)}).
 *
 * <p>TODO(lukes): delete this class, move the backend specific functionality into the backends
```

### JavadocReference
Cannot resolve symbol `forContentKind(SanitizedContentKind)`
in `java/src/com/google/template/soy/data/internalutils/NodeContentKinds.java`
#### Snippet
```java
 * evaluate to, and in turn determines the HTML context to use when contextually autoescaping the
 * node's content (see {@link
 * com.google.template.soy.parsepasses.contextautoesc.Context#forContentKind(SanitizedContentKind)}).
 *
 * <p>TODO(lukes): delete this class, move the backend specific functionality into the backends
```

### JavadocReference
Cannot resolve symbol `Future`
in `java/src/com/google/template/soy/tofu/SoyTofuException.java`
#### Snippet
```java
 *   <li>Plugin errors. Errors thrown from functions will be wrapped in SoyTofuException with the
 *       original exception maintained in the {@link Throwable#getCause() cause} field.
 *   <li>Future errors. Errors thrown when dereferencing {@link Future} instances passed as
 *       parameters. In this case, the failure cause will be {@link SoyFutureException}, with the
 *       failure cause attached to that.
```

### JavadocReference
Symbol `errorReporter` is inaccessible from here
in `java/src/com/google/template/soy/error/ExplodingErrorReporter.java`
#### Snippet
```java
 * <p>To write a test that does not have this exploding behavior (for example, a test that needs to
 * check the full list of errors encountered during compilation), pass a non-exploding ErrorReporter
 * instance to {@link com.google.template.soy.testing.SoyFileSetParserBuilder#errorReporter}.
 */
class ExplodingErrorReporter extends ErrorReporter {
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured css template as a {@link SanitizedContent} of type {@link
     * ContentKind.ATTRIBUTES}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.ATTRIBUTES}
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * ContentKind.ATTRIBUTES}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.ATTRIBUTES}
     *     (corresponding to kind="attributes" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured uri template as a {@link SanitizedContent} of type {@link
     * ContentKind.URI}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.URI}
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * ContentKind.URI}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.URI}
     *     (corresponding to kind="uri" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * Renders the configured html template to the given appendable.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.HTML}
     *     (corresponding to kind="html" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured css template as a {@link SanitizedContent} of type {@link
     * ContentKind.CSS}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.CSS}
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * ContentKind.CSS}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.CSS}
     *     (corresponding to kind="css" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured html template as a {@link SanitizedContent} of type {@link
     * ContentKind.HTML}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.HTML}
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * ContentKind.HTML}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.HTML}
     *     (corresponding to kind="html" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * Renders the configured css template to the given appendable.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.CSS}
     *     (corresponding to kind="css" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     *
     * @throws IllegalArgumentException If the content kind is not {@link
     *     ContentKind.TRUSTED_RESOURCE_URI} (corresponding to kind="trusted_resource_uri" in the
     *     template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * Renders the configured uri template to the given appendable.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.URI}
     *     (corresponding to kind="uri" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured javascript template as a {@link SanitizedContent} of type {@link
     * ContentKind.JS}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.JS}
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * ContentKind.JS}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.JS}
     *     (corresponding to kind="js" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
    /**
     * Renders the configured trusted resource uri template as a {@link SanitizedContent} of type
     * {@link ContentKind.TRUSTED_RESOURCE_URI}.
     *
     * @throws IllegalArgumentException If the content kind is not {@link
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     *
     * @throws IllegalArgumentException If the content kind is not {@link
     *     ContentKind.TRUSTED_RESOURCE_URI} (corresponding to kind="trusted_resource_uri" in the
     *     template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * Renders the configured attributes template to the given appendable.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.ATTRIBUTES}
     *     (corresponding to kind="attributes" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/tofu/SoyTofu.java`
#### Snippet
```java
     * Renders the configured javascript template to the given appendable.
     *
     * @throws IllegalArgumentException If the content kind is not {@link ContentKind.JS}
     *     (corresponding to kind="js" in the template).
     * @throws SoyTofuException if an error occurs during rendering.
```

### JavadocReference
Cannot resolve symbol `SoyJsSrcFunction`
in `java/src/com/google/template/soy/jssrc/dsl/Expression.java`
#### Snippet
```java
   *
   * <p>This method should rarely be used, but is needed when interoperating with parts of the
   * codegen system that do not yet understand CodeChunks (e.g. {@link SoyJsSrcFunction}).
   */
  public JsExpr singleExprOrName(FormatOptions formatOptions) {
```

### JavadocReference
Symbol `visitFunctionNode` is inaccessible from here
in `java/src/com/google/template/soy/jssrc/dsl/Expression.java`
#### Snippet
```java
   * <p>This method is designed for interoperability with parts of the JS codegen system that do not
   * understand code chunks. For example, when applying plugin functions, {@link
   * com.google.template.soy.jssrc.internal.TranslateExprNodeVisitor#visitFunctionNode} needs to
   * downgrade the plugin arguments from CodeChunk.WithValues to {@link JsExpr}s for the plugin API
   * to process. The result (a JsExpr) needs to be upgraded back to a CodeChunk.Expression that
```

### JavadocReference
Cannot resolve symbol `SoyJsSrcFunction`
in `java/src/com/google/template/soy/jssrc/dsl/Expressions.java`
#### Snippet
```java
   * <p>The JsExpr constructor is inherently error-prone. It allows callers to pass a precedence
   * unrelated to the topmost operator in the text string. While JsExprs created in the Soy codebase
   * can be audited, JsExprs are also returned by {@link SoyJsSrcFunction functions} and {@link
   * SoyJsSrcPrintDirective print directives} owned by others. This method should be used to wrap
   * the results of those plugins.
```

### JavadocReference
Cannot resolve symbol `SoyJsSrcPrintDirective`
in `java/src/com/google/template/soy/jssrc/dsl/Expressions.java`
#### Snippet
```java
   * unrelated to the topmost operator in the text string. While JsExprs created in the Soy codebase
   * can be audited, JsExprs are also returned by {@link SoyJsSrcFunction functions} and {@link
   * SoyJsSrcPrintDirective print directives} owned by others. This method should be used to wrap
   * the results of those plugins.
   */
```

### JavadocReference
Cannot resolve symbol `getCode(int, OutputContext)`
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  /**
   * Returns a FormattingContext representing the concatenation of this FormattingContext with
   * {@code other}. For use only by {@link CodeChunk#getCode(int, OutputContext)}.
   */
  FormattingContext concat(FormattingContext other) {
```

### JavadocReference
Cannot resolve symbol `OutputContext`
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  /**
   * Returns a FormattingContext representing the concatenation of this FormattingContext with
   * {@code other}. For use only by {@link CodeChunk#getCode(int, OutputContext)}.
   */
  FormattingContext concat(FormattingContext other) {
```

### JavadocReference
Cannot resolve symbol `getCode()`
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java

/**
 * Helper class to keep track of state during a single call to {@link CodeChunk#getCode()},
 * including the initial statements that have already been formatted and the current indentation
 * level.
```

### JavadocReference
Cannot resolve symbol `fromExpr(JsExpr)`
in `java/src/com/google/template/soy/jssrc/dsl/CodeChunk.java`
#### Snippet
```java
   * inside those methods can be migrated incrementally. Methods that do not yet use the CodeChunk
   * DSL can "unwrap" inputs using this method and "wrap" results using {@link
   * CodeChunk#fromExpr(JsExpr)}. This is safe as long as each CodeChunk generated for production
   * code is {@link Expression#isRepresentableAsSingleExpression}.
   *
```

### JavadocReference
Cannot resolve symbol `fromExpr(JsExpr)`
in `java/src/com/google/template/soy/jssrc/dsl/CodeChunk.java`
#### Snippet
```java
   * inside those methods can be migrated incrementally. Methods that do not yet use the CodeChunk
   * DSL can "unwrap" inputs using this method and "wrap" results using {@link
   * CodeChunk#fromExpr(JsExpr)}. This is safe as long as each CodeChunk generated for production
   * code is {@link Expression#isRepresentableAsSingleExpression}.
   *
```

### JavadocReference
Cannot resolve symbol `generator`
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
   * Applies the given print directive to {@code expr} and returns the result.
   *
   * @param generator The CodeChunk generator to use.
   * @param expr The expression to apply the print directive to.
   * @param directive The print directive to apply.
```

### JavadocReference
Cannot resolve symbol `BasicFunctionsModule`
in `java/src/com/google/template/soy/jssrc/internal/VeLogFunction.java`
#### Snippet
```java
 * Soy special function for internal usages.
 *
 * <p>This function is explicitly not registered with {@link BasicFunctionsModule}. It exists for
 * client-side VE logging, and should not be used by Soy users.
 */
```

### JavadocReference
Cannot resolve symbol `BasicFunctionsModule`
in `java/src/com/google/template/soy/jssrc/internal/VeLogJsSrcLoggingFunction.java`
#### Snippet
```java
 * Soy special function for internal usages.
 *
 * <p>This function is explicitly not registered with {@link BasicFunctionsModule}. It exists for
 * client-side VE logging, and should not be used by Soy users.
 */
```

### JavadocReference
Cannot resolve symbol `jsExprTranslator`
in `java/src/com/google/template/soy/jssrc/internal/GenJsExprsVisitor.java`
#### Snippet
```java

  /**
   * @param jsExprTranslator Instance of JsExprTranslator to use.
   * @param genCallCodeUtils Instance of GenCallCodeUtils to use.
   * @param isComputableAsJsExprsVisitor The IsComputableAsJsExprsVisitor used by this instance
```

### JavadocReference
Cannot resolve symbol `absent()`
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
  /**
   * Returns a Soy assertion expression that asserts that the given value has this type, or {@link
   * Optional#absent()} if no assertion is necessary.
   */
  public Optional<Expression> getSoyParamTypeAssertion(
```

### JavadocReference
Cannot resolve symbol `absent()`
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
    /**
     * Returns a code chunk that evaluates to {@code true} if the given chunk matches the predicate
     * and {@code false} otherwise. Returns {@link Optional#absent()} if there is no validation to
     * be done.
     */
```

### JavadocReference
Cannot resolve symbol `absent()`
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
  /**
   * Returns a code chunk that generates a 'test' for whether or not the given value has this type,
   * or {@link Optional#absent()} if no test is necessary.
   */
  Optional<Expression> getTypeAssertion(Expression value, Generator codeGenerator) {
```

### JavadocReference
Cannot resolve symbol `PyExprs`
in `java/src/com/google/template/soy/pysrc/internal/InternalPyExprUtils.java`
#### Snippet
```java
import com.google.template.soy.pysrc.restricted.PyExpr;

/** Simple utilities for constructing {@link PyExprs}. */
final class InternalPyExprUtils {

```

### JavadocReference
Cannot resolve symbol `genBasePhName`
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   *
   * @return A Map populated with all the variables used with in this message node, using {@link
   *     MsgPlaceholderInitialNode#genBasePhName}.
   */
  private Map<PyExpr, PyExpr> collectVarNameListAndToPyExprMap() {
```

### JavadocReference
Cannot resolve symbol `coerceKeyToString`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   * @param key an expression to be used as a key
   * @param notFoundBehavior What should happen if the key is not in the structure.
   * @param coerceKeyToString Whether or not the key should be coerced to a string.
   */
  private static String genCodeForKeyAccess(
```

### JavadocReference
Cannot resolve symbol `SharedModule`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   *
   * <p>The source of available functions is a look-up map provided by Guice in {@link
   * SharedModule#provideSoyFunctionsMap}.
   *
   * @see BuiltinFunction
```

### JavadocReference
Cannot resolve symbol `provideSoyFunctionsMap`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   *
   * <p>The source of available functions is a look-up map provided by Guice in {@link
   * SharedModule#provideSoyFunctionsMap}.
   *
   * @see BuiltinFunction
```

### JavadocReference
Cannot resolve symbol `Optional`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   * expected to check the error reporter before using the gencode; if they don't, this should
   * apprise them. TODO(user): consider changing the visitor to return {@code Optional<PyExpr>} and
   * returning {@link Optional#absent()} on error.
   */
  private static final PyExpr ERROR =
```

### JavadocReference
Cannot resolve symbol `absent()`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
   * expected to check the error reporter before using the gencode; if they don't, this should
   * apprise them. TODO(user): consider changing the visitor to return {@code Optional<PyExpr>} and
   * returning {@link Optional#absent()} on error.
   */
  private static final PyExpr ERROR =
```

### JavadocReference
Symbol `start` is inaccessible from here
in `java/src/com/google/template/soy/jbcsrc/SimpleLocalVariableManager.java`
#### Snippet
```java
   *
   * <p>Like other methods in the class, it is the responsibility of the caller to ensure that
   * {@link LocalVariable#start} is visited prior to the first use of this variable.
   */
  LocalVariable unsafeBorrowSlot(String name, Type type) {
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.jbcsrc.api.RenderResult.RenderResult`
in `java/src/com/google/template/soy/jbcsrc/ExpressionDetacher.java`
#### Snippet
```java
  /**
   * An {@link ExpressionDetacher} that simply returns the {@link
   * com.google.template.soy.jbcsrc.api.RenderResult.RenderResult} returned from {@link
   * SoyValueProvider#status()} if it isn't done.
   *
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.jbcsrc.api.AdvisingAppendableAdvisingAppendable`
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
   * Returns {@code true} if this expression requires detach logic to be generated based on runtime
   * calls to {@link
   * com.google.template.soy.jbcsrc.api.AdvisingAppendableAdvisingAppendable#softLimitReached()}.
   */
  boolean supportsSoftLimiting() {
```

### JavadocReference
Cannot resolve symbol `softLimitReached()`
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
   * Returns {@code true} if this expression requires detach logic to be generated based on runtime
   * calls to {@link
   * com.google.template.soy.jbcsrc.api.AdvisingAppendableAdvisingAppendable#softLimitReached()}.
   */
  boolean supportsSoftLimiting() {
```

### JavadocReference
Cannot resolve symbol `setSanitizedContentKind`
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
  }

  /** Invokes {@link LoggingAdvisingAppendable#setSanitizedContentKind} on the appendable. */
  AppendableExpression setSanitizedContentKindAndDirectionality(SanitizedContentKind kind) {
    return withNewDelegate(
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.jbcsrc.api.AdvisingAppendable.AdvisingAppendable`
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
/**
 * An expression for an {@link
 * com.google.template.soy.jbcsrc.api.AdvisingAppendable.AdvisingAppendable}.
 */
final class AppendableExpression extends Expression {
```

### JavadocReference
Cannot resolve symbol `SoyValueProvider`
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
    }
    /**
     * Compiles the expression to a {@link SoyValueProvider} valued expression.
     *
     * <p>If the node requires detach logic, it should use the given label as the reattach point.
```

### JavadocReference
Cannot resolve symbol `AdvisingAppendable`
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java

  /**
   * Returns a Statement that will conditionally detach if the given {@link AdvisingAppendable} has
   * been {@link AdvisingAppendable#softLimitReached() output limited}.
   *
```

### JavadocReference
Cannot resolve symbol `AdvisingAppendable`
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
  /**
   * Returns a Statement that will conditionally detach if the given {@link AdvisingAppendable} has
   * been {@link AdvisingAppendable#softLimitReached() output limited}.
   *
   * <p>This is only valid to call at the begining of templates. It does not allocate a save/restore
```

### JavadocReference
Cannot resolve symbol `softLimitReached()`
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
  /**
   * Returns a Statement that will conditionally detach if the given {@link AdvisingAppendable} has
   * been {@link AdvisingAppendable#softLimitReached() output limited}.
   *
   * <p>This is only valid to call at the begining of templates. It does not allocate a save/restore
```

### JavadocReference
Cannot resolve symbol `Expresion`
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>A {@link Expresion} that can be used to save the field.
   *   <li>A {@link Expresion} that can be used to restore the field.
   *   <li>A {@link LocalVariable} that can be used to read the value.
```

### JavadocReference
Cannot resolve symbol `Expresion`
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
   * <ul>
   *   <li>A {@link Expresion} that can be used to save the field.
   *   <li>A {@link Expresion} that can be used to restore the field.
   *   <li>A {@link LocalVariable} that can be used to read the value.
   * </ul>
```

### JavadocReference
Symbol `start` is inaccessible from here
in `java/src/com/google/template/soy/jbcsrc/LocalVariableManager.java`
#### Snippet
```java
     * Adds a variable into the local scope with a generated name.
     *
     * <p>It is the responsibility of the caller to ensure that {@link LocalVariable#start} is
     * visited prior to the first use of this variable.
     */
```

### JavadocReference
Symbol `start` is inaccessible from here
in `java/src/com/google/template/soy/jbcsrc/LocalVariableManager.java`
#### Snippet
```java
     * Adds a variable into the local scope with the given name.
     *
     * <p>It is the responsibility of the caller to ensure that {@link LocalVariable#start} is
     * visited prior to the first use of this variable.
     *
```

### JavadocReference
Cannot resolve symbol `getNamedLocal`
in `java/src/com/google/template/soy/jbcsrc/LocalVariableManager.java`
#### Snippet
```java
     * visited prior to the first use of this variable.
     *
     * <p>These variablles can be looked up with {@link LocalVariableManager#getNamedLocal}.
     */
    LocalVariable createNamedLocal(String name, Type type);
```

### JavadocReference
Cannot resolve symbol `render(SoyRecord,SoyRecord,AdvisingAppendable, RenderContext)`
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
  /**
   * The {@link Method} signature of the {@link
   * CompiledTemplate#render(SoyRecord,SoyRecord,AdvisingAppendable, RenderContext)} method.
   */
  static Method createRenderMethod(String methodName) {
```

### JavadocReference
Cannot resolve symbol `AdvisingAppendable`
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
  /**
   * The {@link Method} signature of the {@link
   * CompiledTemplate#render(SoyRecord,SoyRecord,AdvisingAppendable, RenderContext)} method.
   */
  static Method createRenderMethod(String methodName) {
```

### JavadocReference
Cannot resolve symbol `StubbingSoySauce`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
  }

  /** Non-public; for use by {@link StubbingSoySauce}. */
  @CanIgnoreReturnValue
  SoySauceBuilder withCustomCompiledTemplatesFactory(
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to a {@link SanitizedContent}.
     *
     * <p>Verifies that the content type is {@link ContentKind.ATTRIBUTES} (corresponding to
     * kind="attributes" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.TRUSTED_RESOURCE_URI} (corresponding
     * to kind="trusted_resource_uri" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.TRUSTED_RESOURCE_URI} (corresponding
     * to kind="trusted_resource_uri" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured uri template to a {@link SanitizedContent}.
     *
     * <p>Verifies that the content type is {@link ContentKind.URI} (corresponding to kind="uri" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
    /**
     * Renders the configured template to a {@link SanitizedContent} of kind {@link
     * ContentKind.CSS}.
     *
     * <p>Verifies that the content type is css (corresponding to kind="css" in the template).
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured js template to a {@link SanitizedContent}.
     *
     * <p>Verifies that the content type is {@link ContentKind.JS} (corresponding to kind="js" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured uri template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.URI} (corresponding to kind="uri" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured js template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.JS} (corresponding to kind="js" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.JS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured js template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.JS} (corresponding to kind="js" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.TRUSTED_RESOURCE_URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to a {@link SanitizedContent}.
     *
     * <p>Verifies that the content type is {@link ContentKind.TRUSTED_RESOURCE_URI} (corresponding
     * to kind="trusted_resource_uri" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.CSS} (corresponding to kind="css" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `render(AdvisingAppendable)`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
   * A render continuation that has a final result.
   *
   * <p>See {@link SoySauce.Renderer#render(AdvisingAppendable)}, and {@link WriteContinuation} for
   * similar APIs designed for rendering to output streams.
   *
```

### JavadocReference
Cannot resolve symbol `ContentKind.CSS`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.CSS} (corresponding to kind="css" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `render(AdvisingAppendable)`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Continues rendering if the prior render operation didn't complete.
     *
     * <p>This method has the same contract as {@link Renderer#render(AdvisingAppendable)} for the
     * return value.
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.URI`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured js template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.URI} (corresponding to kind="js" in
     * the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured html template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.HTML} (corresponding to kind="html"
     * in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
    /**
     * Renders the configured html template to the given appendable, returning a continuation (more
     * details below). Verifies that the content type is {@link ContentKind.HTML} (corresponding to
     * kind="html" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.ATTRIBUTES} (corresponding to
     * kind="attributes" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `ContentKind.HTML`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
    /**
     * Renders the configured html template to a {@link SanitizedContent}. Verifies that the content
     * type is {@link ContentKind.HTML} (corresponding to kind="html" in the template).
     *
     * <p>For all of the #renderFoo() methods in this API (e.g. {@link #renderCss()}, {@link
```

### JavadocReference
Cannot resolve symbol `renderFoo(AdvisingAppendable)`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * <p>For all of the #renderFoo() methods in this API (e.g. {@link #renderCss()}, {@link
     * #renderUri()}, etc.), the rendering semantics are the same as for {@link
     * #renderFoo(AdvisingAppendable)} with the following 2 caveats.
     *
     * <ul>
```

### JavadocReference
Cannot resolve symbol `ContentKind.ATTRIBUTES`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Renders the configured template to the given appendable, returning a continuation.
     *
     * <p>Verifies that the content type is {@link ContentKind.ATTRIBUTES} (corresponding to
     * kind="attributes" in the template).
     *
```

### JavadocReference
Cannot resolve symbol `render(AdvisingAppendable)`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * Continues rendering if the prior render operation didn't complete.
     *
     * <p>This method has the same contract as {@link Renderer#render(AdvisingAppendable)} for the
     * return value.
     *
```

### JavadocReference
Symbol `getCommonSuperClass` is inaccessible from here
in `java/src/com/google/template/soy/jbcsrc/internal/SoyClassWriter.java`
#### Snippet
```java
/**
 * A subclass of {@link ClassWriter} that allows us to specialize {@link
 * ClassWriter#getCommonSuperClass} for compiler generated types as well as set common defaults for
 * all classwriters used by {@code jbcsrc}.
 */
```

### JavadocReference
Cannot resolve symbol `ClassData`
in `java/src/com/google/template/soy/jbcsrc/restricted/CodeBuilder.java`
#### Snippet
```java
 * GeneratorAdapter#push(int)}), however it is a subtype of {@link LocalVariablesSorter} which
 * automatically renumbers local variables. This is actually fine (i think), but the problem is that
 * it makes our debugging information (like {@link ClassData#toString()} or {@link
 * Expression#trace()}) very misleading since none of the local variable indices in the debug
 * information match the indexes in the generated code, so the debug data just looks wrong.
```

### JavadocReference
Cannot resolve symbol `toString()`
in `java/src/com/google/template/soy/jbcsrc/restricted/CodeBuilder.java`
#### Snippet
```java
 * GeneratorAdapter#push(int)}), however it is a subtype of {@link LocalVariablesSorter} which
 * automatically renumbers local variables. This is actually fine (i think), but the problem is that
 * it makes our debugging information (like {@link ClassData#toString()} or {@link
 * Expression#trace()}) very misleading since none of the local variable indices in the debug
 * information match the indexes in the generated code, so the debug data just looks wrong.
```

### JavadocReference
Cannot resolve symbol `BidiGlobalDir`
in `java/src/com/google/template/soy/jbcsrc/restricted/JbcSrcPluginContext.java`
#### Snippet
```java
 */
public interface JbcSrcPluginContext {
  /** Returns an expression that evaluates to the current {@link BidiGlobalDir} */
  Expression getBidiGlobalDir();

```

### JavadocReference
Cannot resolve symbol `newLocal(Type)`
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java
 *
 * <p>Note: This class does not attempt to make use of the convenience methods on generator adapter
 * such as {@link CodeBuilder#newLocal(Type)} or {@link CodeBuilder#loadArg(int)} that make it
 * easier to work with local variables (and calculating local variable indexes). Instead we push
 * this responsibility onto our caller. This is because CodeBuilder doesn't make it possible to
```

### JavadocReference
Cannot resolve symbol `loadArg(int)`
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java
 *
 * <p>Note: This class does not attempt to make use of the convenience methods on generator adapter
 * such as {@link CodeBuilder#newLocal(Type)} or {@link CodeBuilder#loadArg(int)} that make it
 * easier to work with local variables (and calculating local variable indexes). Instead we push
 * this responsibility onto our caller. This is because CodeBuilder doesn't make it possible to
```

### JavadocReference
Cannot resolve symbol `unboxAs`
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
   * stack must not be null.
   *
   * <p>Always prefer using {@link SoyExpression#unboxAs} over this method, whenever possible.
   *
   * <p>Guarantees: * Bytecode output will not change stack height * Output will only change the top
```

### JavadocReference
Cannot resolve symbol `exec`
in `java/src/com/google/template/soy/passes/IndirectParamsCalculator.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 *
 * <p>{@link #exec} should be called on a {@code TemplateNode}.
 */
public final class IndirectParamsCalculator {
```

### JavadocReference
Cannot resolve symbol `IfElseNode`
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
 * Represents an {@link IfCondNode} or a {@link SwitchCaseNode}.
 *
 * <p>Note that there is no explicit representation for {@link IfElseNode} or {@link
 * SwitchDefaultNode}. When an {@code {else}} command is encountered, it is represented by a link
 * along the false edge of a {@link HtmlMatcherConditionNode}
```

### JavadocReference
Cannot resolve symbol `SwitchDefaultNode`
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
 *
 * <p>Note that there is no explicit representation for {@link IfElseNode} or {@link
 * SwitchDefaultNode}. When an {@code {else}} command is encountered, it is represented by a link
 * along the false edge of a {@link HtmlMatcherConditionNode}
 *
```

### JavadocReference
Cannot resolve symbol `coereceToString`
in `java/src/com/google/template/soy/plugin/java/restricted/JavaValue.java`
#### Snippet
```java
   * because boolean is incompatible with a soy string. (Note that this is different than {@link
   * #coerceToSoyString}, which effectively calls {@link
   * com.google.template.soy.data.SoyValue#coereceToString} and will work with any parameter type
   * and coerce it to a soy string.
   */
```

### JavadocReference
Cannot resolve symbol `coereceToBoolean`
in `java/src/com/google/template/soy/plugin/java/restricted/JavaValue.java`
#### Snippet
```java
   * because string is incompatible with boolean. (Note that this is different than {@link
   * #coerceToSoyBoolean}, which effectively calls {@link
   * com.google.template.soy.data.SoyValue#coereceToBoolean} and will work with any parameter type
   * and coerce it to a boolean.
   */
```

### JavadocReference
Symbol `com.google.template.soy.sharedpasses.render.TofuValueFactory` is inaccessible from here
in `java/src/com/google/template/soy/plugin/internal/JavaPluginExecContext.java`
#### Snippet
```java
 * MethodCallNode}.
 *
 * @see com.google.template.soy.sharedpasses.render.TofuValueFactory
 * @see com.google.template.soy.jbcsrc.JbcSrcValueFactory
 */
```

### JavadocReference
Symbol `com.google.template.soy.jbcsrc.JbcSrcValueFactory` is inaccessible from here
in `java/src/com/google/template/soy/plugin/internal/JavaPluginExecContext.java`
#### Snippet
```java
 *
 * @see com.google.template.soy.sharedpasses.render.TofuValueFactory
 * @see com.google.template.soy.jbcsrc.JbcSrcValueFactory
 */
public final class JavaPluginExecContext {
```

### JavadocReference
Symbol `com.google.template.soy.passes.ResolveExpressionTypesPass` is inaccessible from here
in `java/src/com/google/template/soy/shared/internal/ResolvedSignature.java`
#### Snippet
```java
 *
 * <p>Generic types are not supported in general. Some built-in functions have special logic in
 * {@link com.google.template.soy.passes.ResolveExpressionTypesPass} for additional checks.
 */
@AutoValue
```

### JavadocReference
Cannot resolve symbol `exec`
in `java/src/com/google/template/soy/shared/internal/FindCalleesNotInFile.java`
#### Snippet
```java
 * applicable here because we cannot tell at compile time which delegate will be called (if any).
 *
 * <p>{@link #exec} should be called on a {@code SoyFileNode}. The returned set will be the full
 * names of all templates called by the templates in this file that that not in this file. In other
 * words, if T is the set of templates in this file and U is the set of templates not in this file,
```

### JavadocReference
Symbol `com.google.template.soy.basicfunctions.ParseFloatFunction` is inaccessible from here
in `java/src/com/google/template/soy/shared/restricted/SoyFunctionSignature.java`
#### Snippet
```java
 * annotation to get additional type check for the arguments and return types.
 *
 * <p>See {@link com.google.template.soy.basicfunctions.ParseFloatFunction} and other functions in
 * that package for example usages.
 */
```

### JavadocReference
Cannot resolve symbol `SoyJavaScriptSourceFunction`
in `java/src/com/google/template/soy/logging/LoggingFunction.java`
#### Snippet
```java
 * A LoggingFunction is a SoySourceFunction that is meant to interact with the logging subsystem.
 *
 * <p>Unlike a {@link SoyJavaScriptSourceFunction} or a {@link SoyJavaSourceFunction} the author of
 * a LoggingFunction does not implement the function logic here, but instead it will be implemented
 * by a user supplied logging plugin at render time.
```

### JavadocReference
Cannot resolve symbol `SoyJavaSourceFunction`
in `java/src/com/google/template/soy/logging/LoggingFunction.java`
#### Snippet
```java
 * A LoggingFunction is a SoySourceFunction that is meant to interact with the logging subsystem.
 *
 * <p>Unlike a {@link SoyJavaScriptSourceFunction} or a {@link SoyJavaSourceFunction} the author of
 * a LoggingFunction does not implement the function logic here, but instead it will be implemented
 * by a user supplied logging plugin at render time.
```

### JavadocReference
Cannot resolve symbol `ExternP`
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
  }

  /** Java object version of {@link ExternP}. */
  interface Extern {
    String getName();
```

### JavadocReference
Cannot resolve symbol `ConstantP`
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
public interface FileMetadata extends PartialFileMetadata {

  /** Java object version of {@link ConstantP}. */
  interface Constant {
    String getName();
```

### JavadocReference
Cannot resolve symbol `StrictHtmlValidationPass`
in `java/src/com/google/template/soy/soytree/HtmlTagNode.java`
#### Snippet
```java
   * Indicates whether this tag was created organically from the template source, or if it is a a
   * synthetic tag node, created by injecting it into the AST during a validation phase, such as
   * {@link StrictHtmlValidationPass}
   *
   * <p>Some backends do not render synthetic tags, others (like iDOM) do special processing on
```

### JavadocReference
Symbol `com.google.template.soy.passes.htmlmatcher.HtmlMatcherGraphTest` is inaccessible from here
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
   *
   * <p>Tests can use this to build a parse tree using up to a certain pass. See, for example {@link
   * com.google.template.soy.passes.htmlmatcher.HtmlMatcherGraphTest}.
   */
  @CanIgnoreReturnValue
```

### JavadocReference
Cannot resolve symbol `hasType`
in `java/src/com/google/template/soy/exprtree/VarDefn.java`
#### Snippet
```java
  /**
   * Returns the data type of this variable. This throws an error if the var def does not have a
   * type yet. {@link hasType} should be called first.
   */
  SoyType type();
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.SoyNode`
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
   *
   * <p>NOTE: This does not use {@link com.google.template.soy.soytree.defn.LocalVar} because its
   * delcaring node is an expr node and not a {@link com.google.template.soy.SoyNode}.
   */
  public static final class ComprehensionVarDefn
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.ExampleHeader`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Template for printing the header to add before each example.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.ExampleHeader} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoPrint`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'print'.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoPrint} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoDoubleBraces`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo double braces.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoDoubleBraces} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoExpressions`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo expressions.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoExpressions} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoRawTextCommands`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo raw text commands.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoRawTextCommands} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoAutoescapeTrue`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo autoescape true.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoAutoescapeTrue} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoIf`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'if'.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoIf} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoLineJoining`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo line joining.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoLineJoining} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoCallWithParamBlock`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'call' with a 'param' block.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoCallWithParamBlock} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoFor`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'for'.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoFor} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoComments`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo comments.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoComments} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoCallWithoutParam`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'call' without 'param's.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoCallWithoutParam} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoCallOtherFile`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo a 'call' out to a template defined in another file.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoCallOtherFile} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoForRange`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'for' using range.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoForRange} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
 * Soy parse info for features.soy.
 *
 * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates} instead. See go/soy-java-type-safe.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoCallWithParam`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'call' with 'param's.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoCallWithParam} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoMsg`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'msg'.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoMsg} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.BidiGlobalDir`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * exposes the results of Soy's bidiGlobalDir() to scripts.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.BidiGlobalDir} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoBidiSupport`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo BiDi support.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoBidiSupport} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoSwitch`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo 'switch'.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoSwitch} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.examples.FeaturesTemplates.DemoParamWithKindAttribute`
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   * Demo {param} blocks with 'kind' attribute.
   * 
   * @deprecated Use {@link com.google.template.soy.examples.FeaturesTemplates.DemoParamWithKindAttribute} instead. See go/soy-java-type-safe.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `Token`
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
import com.google.template.soy.base.SourceLocation;

/** Helpers for dealing with {@link Token tokens} */
final class Tokens {

```

### JavadocReference
Cannot resolve symbol `ConformanceConfig`
in `java/src/com/google/template/soy/conformance/SoyConformance.java`
#### Snippet
```java
   * Returns a new SoyConformance object that enforces the rules in the given configs
   *
   * <p>The config files are expected to be text protos of type {@link ConformanceConfig}.
   */
  public static SoyConformance create(ValidatedConformanceConfig conformanceConfig) {
```

### JavadocReference
Cannot resolve symbol `ConformanceConfig`
in `java/src/com/google/template/soy/conformance/ValidatedConformanceConfig.java`
#### Snippet
```java
import java.lang.reflect.Constructor;

/** A validated wrapper for {@link ConformanceConfig}. */
public final class ValidatedConformanceConfig {
  /** An empty configuration. */
```

### JavadocReference
Cannot resolve symbol `com.google.template.soy.javagencode.GenInvocationBuildersVisitor`
in `java/src/com/google/template/soy/javagencode/javatypes/RecordJavaType.java`
#### Snippet
```java
/**
 * Represents a Soy RECORD type. Is handled with special logic in {@link
 * com.google.template.soy.javagencode.GenInvocationBuildersVisitor}.
 */
public class RecordJavaType extends JavaType {
```

### JavadocReference
Cannot resolve symbol `PrimitiveJavaNumberType.DOUBLE`
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java
 * support. Callers must use these constants and cannot instantiate new instances of this class.
 *
 * <p>NOTE: For doubles and longs, see {@link PrimitiveJavaNumberType.DOUBLE} and {@link
 * PrimitiveJavaNumberType.LONG}. These are not simple types because they need special logic for
 * coercing {@code Number} types to{@code Long} or {@code Double} at runtime.
```

### JavadocReference
Cannot resolve symbol `PrimitiveJavaNumberType.LONG`
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java
 *
 * <p>NOTE: For doubles and longs, see {@link PrimitiveJavaNumberType.DOUBLE} and {@link
 * PrimitiveJavaNumberType.LONG}. These are not simple types because they need special logic for
 * coercing {@code Number} types to{@code Long} or {@code Double} at runtime.
 */
```

### JavadocReference
Cannot resolve symbol `templateName`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Inferences.java`
#### Snippet
```java
   * Finds the named templates.
   *
   * @param templateName A qualified template name.
   */
  ImmutableList<TemplateType> lookupTemplates(CallNode call) {
```

### JavadocReference
Cannot resolve symbol `foldIntoParent()`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Inferences.java`
#### Snippet
```java
 * <p>To make it easier to do speculative inference, this class cascades : each instance has a
 * parent, and it delegates to that when it does not have info itself. And there is a {@link
 * Inferences#foldIntoParent()} method that propagates all decisions into the parent when a set of
 * inference decisions are considered final.
 *
```

### JavadocReference
Cannot resolve symbol `JavaTypes`
in `java/src/com/google/template/soy/javagencode/javatypes/JavaTypeUtils.java`
#### Snippet
```java

  /**
   * Converts a soy {@link UnionType} to a list of {@link JavaTypes} corresponding to the union
   * members.
   *
```

### JavadocReference
Cannot resolve symbol `com.google.apps.framework.template.StructuredPageResponse`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
   * Framework utility classes.
   *
   * @see com.google.apps.framework.template.StructuredPageResponse
   */
  private void appendFutureWrapperMethod(String paramsClass) {
```

### JavadocReference
Cannot resolve symbol `JS`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
 * Propagates {@link Context}s across raw text chunks using a state-machine parser for HTML/CSS/JS.
 *
 * <p>Given some raw JS text {@code var x = "foo";} and the {@link Context#JS JS} starting context,
 * this class will decompose the rawText into a number of tokens and compute follow on contexts for
 * each.
```

### JavadocReference
Cannot resolve symbol `JsUtil`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
   * regular lexical grammar which is what we use in the autoescaper.
   *
   * @see JsUtil#isRegexPreceder
   */
  public enum JsFollowingSlash {
```

### JavadocReference
Cannot resolve symbol `isRegexPreceder`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
   * regular lexical grammar which is what we use in the autoescaper.
   *
   * @see JsUtil#isRegexPreceder
   */
  public enum JsFollowingSlash {
```

### JavadocReference
Cannot resolve symbol `SanitizedContent`
in `java/src/com/google/template/soy/basicfunctions/StrContainsFunction.java`
#### Snippet
```java
 *
 * <p><code>strContains(expr1, expr2)</code> requires <code>expr1</code> and <code>expr2</code> to
 * be of type string or {@link SanitizedContent}. It evaluates to <code>true</code> iff <code>expr1
 * </code> contains <code>expr2</code>. <code>strContains</code> is case sensitive.
 */
```

### JavadocReference
Cannot resolve symbol `dependOnCssHeader`
in `java/src/com/google/template/soy/incrementaldomsrc/SoyIncrementalDomSrcOptions.java`
#### Snippet
```java
   * Sets whether we should add a requirecss annotation for the generated GSS header file.
   *
   * @param dependOnCssHeader The value to set.
   */
  public void setGoogMsgsAreExternal(boolean googMsgsAreExternal) {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
    AND,
    OR;
  };

  private static final class ComposedBrancher implements Brancher {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
  private enum CompositionMode {
    AND,
    OR;
  };

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/SoyUtils.java`
#### Snippet
```java
      String valueSrcStr =
          InternalValueUtils.convertPrimitiveDataToExpr(entry.getValue(), SourceLocation.UNKNOWN)
              .toSourceString();
      output
          .append("{export const ")
```

### DataFlowIssue
Argument `BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(attrValue)` might be null
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java
    }
    if (BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.containsKey(attrValue)) {
      return Optional.of(BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(attrValue));
    }
    return Optional.empty();
```

### DataFlowIssue
Argument `obj` might be null
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

  private SoyValueProvider convertNonPrimitive(@Nullable Object obj) {
    SoyValueProvider converted = expensiveConverterMap.convert(obj);
    if (converted != null) {
      return converted;
```

### DataFlowIssue
Method invocation `assignField` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    public Builder setField(String field, SoyValue value) {
      clazz.fields.get(field).assignField(builder(), value);
      return this;
    }
```

### DataFlowIssue
Casting `value0` to `PrimitiveData` may produce `ClassCastException`
in `java/src/com/google/template/soy/data/internalutils/InternalValueUtils.java`
#### Snippet
```java
          isValidValue = false;
        }
        value = (PrimitiveData) value0;
      } catch (SoyDataException sde) {
        isValidValue = false;
```

### DataFlowIssue
Method invocation `getLanguage` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/SoyMsgBundleWithFullLocale.java`
#### Snippet
```java
    // avoid wrapping the original bundle when its language code isn't preserved.
    ULocale ulocale = new ULocale(locale.toLanguageTag());
    return ulocale.getLanguage().equals(bundle.getLocale().getLanguage())
        ? new SoyMsgBundleWithFullLocale(bundle, ulocale, ulocale.toLanguageTag())
        : bundle;
```

### DataFlowIssue
Method invocation `integerValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public int getInteger(int index) {
    return get(index).integerValue();
  }

```

### DataFlowIssue
Method invocation `booleanValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public boolean getBoolean(int index) {
    return get(index).booleanValue();
  }

```

### DataFlowIssue
Method invocation `floatValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public double getFloat(int index) {
    return get(index).floatValue();
  }

```

### DataFlowIssue
Method invocation `stringValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public String getString(int index) {
    return get(index).stringValue();
  }

```

### DataFlowIssue
Method invocation `longValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public long getLong(int index) {
    return get(index).longValue();
  }

```

### DataFlowIssue
Argument `msg.getDesc()` might be null
in `java/src/com/google/template/soy/msgs/internal/ExtractMsgsVisitor.java`
#### Snippet
```java
  private static String extractAttributes(SoyMsg msg) {
    StringBuilder attributes = new StringBuilder();
    Matcher matcher = MESSAGE_ATTRIBUTE_PATTERN.matcher(msg.getDesc());
    while (matcher.find()) {
      attributes.append(matcher.group());
```

### DataFlowIssue
Argument `repl` might be null
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
    do {
      String repl = ICU_SYNTAX_CHAR_ESCAPE_MAP.get(matcher.group());
      matcher.appendReplacement(escapedTextSb, repl);
    } while (matcher.find());
    matcher.appendTail(escapedTextSb);
```

### DataFlowIssue
Argument `pluralCase.spec()` might be null
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java

    for (Case<SoyMsgPluralCaseSpec> pluralCase : origPluralPart.getCases()) {
      currRawTextSb.append(getPluralCaseOpenString(pluralCase.spec()));
      convertMsgPartsHelper(
          newMsgPartsBuilder, currRawTextSb, pluralCase.parts(), /* isInPlrselPart= */ true);
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPluralPart.java`
#### Snippet
```java

      SoyMsgPluralCaseSpec pluralCaseSpec = case0.spec();
      SoyMsgPluralCaseSpec.Type caseType = pluralCaseSpec.getType();
      if (caseType == SoyMsgPluralCaseSpec.Type.EXPLICIT) {
        if (pluralCaseSpec.getExplicitValue() == pluralValue) {
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPluralPart.java`
#### Snippet
```java
      for (Case<SoyMsgPluralCaseSpec> case0 : getCases()) {

        if (case0.spec().getType() == correctCaseType) {
          caseParts = case0.parts();
          break;
```

### DataFlowIssue
Method invocation `isRepresentableAsSingleExpression` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/JsArrowFunction.java`
#### Snippet
```java
    if (body() instanceof Return) {
      Expression exprBody = ((Return) body()).value();
      if (exprBody.isRepresentableAsSingleExpression()) {
        if (exprBody.initialExpressionIsObjectLiteral()) {
          exprBody = Group.create(exprBody);
```

### DataFlowIssue
Argument `this.lexicalStateStack.peek()` might be null
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
          }
        };
    context.lexicalStateStack.push(this.lexicalStateStack.peek());
    return context;
  }
```

### DataFlowIssue
Method invocation `isRepresentableAsSingleExpression` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/TsFunction.java`
#### Snippet
```java
    }
    Expression exprBody = ((Return) bodyStmts().get(0)).value();
    if (!exprBody.isRepresentableAsSingleExpression()) {
      return null;
    }
```

### DataFlowIssue
Method invocation `setElse` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalExpressionBuilder.java`
#### Snippet
```java
    }
    if (trailingElse != null) {
      builder.setElse(var.assign(trailingElse).asStatement());
    }
    return var.withInitialStatements(ImmutableList.of(decl, builder.build()));
```

### DataFlowIssue
Method invocation `build` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalExpressionBuilder.java`
#### Snippet
```java
      builder.setElse(var.assign(trailingElse).asStatement());
    }
    return var.withInitialStatements(ImmutableList.of(decl, builder.build()));
  }

```

### DataFlowIssue
Method invocation `unpackResult` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      // means that we can do the less expensive SINGULAR access type.
      AccessType accessType = tail ? protoCall.accessType() : AccessType.SINGULAR;
      return accessType.unpackResult(base, protoCall.unpackFunction());
    }

```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      } else if ((desc.getType() == FieldDescriptor.Type.BYTES)
          || (desc.isMapField()
              && ProtoUtils.getMapValueFieldDescriptor(desc).getType()
                  == FieldDescriptor.Type.BYTES)) {
        return protoByteStringToBase64ConverterFunction();
```

### DataFlowIssue
Casting `callNode` to `CallBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
                  templateAliases.get(
                          ((TemplateLiteralNode)
                                  ((CallBasicNode) callNode).getCalleeExpr().getRoot())
                              .getResolvedName())
                      + "$"));
```

### DataFlowIssue
Method invocation `setElse` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
                : Statements.of(visitChildren((IfElseNode) child));
        // Add else-block to conditional.
        conditional.setElse(trailingElse);
      } else {
        throw new AssertionError();
```

### DataFlowIssue
Method invocation `build` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
    }

    return conditional.build();
  }

```

### DataFlowIssue
Method invocation `getSourceLocation` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
      HtmlOpenTagNode tag = node.getOpenTagNode();
      SourceLocation insertionLocation =
          tag.getSourceLocation()
              .getEndPoint()
              .asLocation(tag.getSourceLocation().getFilePath());
```

### DataFlowIssue
Argument `result` might be null
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
                      }
                    }
                    return Optional.of(result);
                  })
              .build();
```

### DataFlowIssue
Switch label `TEXT` is unreachable
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
        break;
      case ATTRIBUTES:
      case TEXT:
        // nothing extra
        break;
```

### DataFlowIssue
Unboxing of `PYTHON_PRECEDENCES.get(op)` may produce `NullPointerException`
in `java/src/com/google/template/soy/pysrc/restricted/PyExprUtils.java`
#### Snippet
```java
   */
  public static int pyPrecedenceForOperator(Operator op) {
    return PYTHON_PRECEDENCES.get(op);
  }

```

### DataFlowIssue
Argument `ProtoUtils.getMapValueFieldDescriptor(fieldDesc)` might be null
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
          Expression value =
              protoInitFieldValue(
                  ProtoUtils.getMapValueFieldDescriptor(fieldDesc),
                  visit(mapLiteral.getChild(j + 1)),
                  false);
```

### DataFlowIssue
Argument `ProtoUtils.getMapValueMessageType(fieldDesc)` might be null
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
            Expression sanitizedContentPackFn =
                sanitizedContentToProtoConverterFunction(
                    ProtoUtils.getMapValueMessageType(fieldDesc));
            fieldValue = SOY_NEWMAPS_TRANSFORM_VALUES.call(fieldValue, sanitizedContentPackFn);
          } else if (ProtoUtils.getMapValueFieldDescriptor(fieldDesc).getType()
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
                    ProtoUtils.getMapValueMessageType(fieldDesc));
            fieldValue = SOY_NEWMAPS_TRANSFORM_VALUES.call(fieldValue, sanitizedContentPackFn);
          } else if (ProtoUtils.getMapValueFieldDescriptor(fieldDesc).getType()
              == FieldDescriptor.Type.BYTES) {
            fieldValue =
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
      if (thisParam.getKind() == ParameterKind.ATTRIBUTE) {
        if (!(srcParams.containsKey(thisParam.getName())
            && srcParams.get(thisParam.getName()).getKind() == ParameterKind.ATTRIBUTE)) {
          return false;
        }
```

### DataFlowIssue
Argument `((TemplateParam) node.getDefnDecl()).defaultValue()` might be null
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
          // once at the beginning of the template. But the Python backend is minimally
          // supported so this is fine.
          PyExpr defaultValue = visit(((TemplateParam) node.getDefnDecl()).defaultValue());
          notFoundBehavior = NotFoundBehavior.defaultValue(defaultValue);
        }
```

### DataFlowIssue
Method invocation `lastIndexOf` may produce `NullPointerException`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    } else {
      String resolvedName = node.getResolvedName();
      int secondToLastDotIndex = resolvedName.lastIndexOf('.', resolvedName.lastIndexOf('.') - 1);
      name = resolvedName.substring(secondToLastDotIndex + 1);
    }
```

### DataFlowIssue
Method invocation `isAssignableFromLoose` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/TemplateBindingUtil.java`
#### Snippet
```java
        continue;
      }
      if (!base.getParameterMap().get(member.name()).isAssignableFromLoose(member.checkedType())) {
        errorReporter.report(
            PARAMETER_TYPE_MISMATCH,
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/FunctionType.java`
#### Snippet
```java
      // argument of this type. This is because the parameter types are constraints; assignability
      // of a template type is only possible when the constraints of the from-type are narrower.
      if (!srcParam.getType().isAssignableFromInternal(thisParam.getType(), unknownPolicy)) {
        return false;
      }
```

### DataFlowIssue
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java

  protected static TemplateType getModifiedTemplateType(TemplateBasicNode node) {
    return (TemplateType) node.getModifiesExpr().getRoot().getType();
  }

```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
                      alias,
                      // Strip the optional suffix character "="
                      /* objectParamName= */ objectParamType.substring(
                          0, objectParamType.length() - 1),
                      /* addStubMapLogic= */ true));
```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
                      ? null
                      // Strip the optional suffix character "="
                      : objectParamType.substring(0, objectParamType.length() - 1),
                  /* addStubMapLogic= */ false));
      if (jsSrcOptions.shouldGenerateGoogModules()) {
```

### DataFlowIssue
Casting `node` to `TemplateBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
        declarations.add(Statements.assign(dottedIdNoRequire(defaultImplName), impl, jsDoc));
      }
      TemplateBasicNode templateBasicNode = (TemplateBasicNode) node;
      declarations.add(
          makeRegisterDefaultFnCall(templateBasicNode, dottedIdNoRequire(defaultImplName)));
```

### DataFlowIssue
Casting `node` to `TemplateBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
      declarations.add(
          makeRegisterModFn(
              (TemplateBasicNode) node,
              dottedIdNoRequire(alias + (generatePositionalParamsSignature ? "$" : ""))));
    }
```

### DataFlowIssue
Method invocation `asCharSource` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
        writer.writeEntry(
            Names.javaFileName(namespace, fileName),
            files.get(file.getFilePath()).asCharSource().asByteSource(UTF_8));
      }
    }
```

### DataFlowIssue
Method invocation `compile` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java

    private Expression compileToSoyValueProviderWithDetaching(ExprNode expr) {
      return detachingExprCompiler.compile(expr).boxAsSoyValueProvider();
    }

```

### DataFlowIssue
Method invocation `waitForSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
            left =
                ExpressionCompiler.requiresDetach(analysis, node.getLeftChild())
                    ? detacher.waitForSoyValueProvider(leftSvp)
                    : leftSvp;
          } else {
```

### DataFlowIssue
Method invocation `addBranch` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
        } else {
          SwitchDefaultNode ien = (SwitchDefaultNode) child;
          Block defaultBlockStart = conditions.addBranch();
          Block defaultBlockEnd = exec(defaultBlockStart, ien);
          branchEnds.add(defaultBlockEnd);
```

### DataFlowIssue
Method invocation `addBranch` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
        } else {
          IfElseNode ien = (IfElseNode) child;
          Block branch = conditionFork.addBranch();
          branch = exec(branch, ien);
          branchEnds.add(branch);
```

### DataFlowIssue
Method invocation `invokeUnchecked` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          cb.checkCast(BytecodeUtils.SANITIZED_CONTENT_TYPE);
        }
        toProto.invokeUnchecked(cb);
        currentType = toProto.returnType();
      }
```

### DataFlowIssue
@Nullable method 'classToUnboxTo' always returns a non-null value
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    }

    @Nullable
    private static Class<?> classToUnboxTo(FieldDescriptor field) {
      switch (field.getJavaType()) {
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        Descriptor messageType = descriptor.getMessageType();
        MethodRef fromProtoMethod = SAFE_PROTO_TO_SANITIZED_CONTENT.get(messageType.getFullName());
        return SoyExpression.forSoyValue(fieldType, fromProtoMethod.invoke(field));
      }
    }
```

### DataFlowIssue
Method invocation `replayOn` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java
            "calling renderAndResolve after setting isLast = true is not supported");
      }
      buffer.replayOn(appendable);
      return RenderResult.done();
    }
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
      for (Case<SoyMsgPluralCaseSpec> item : pluralPart.getCases()) {
        builder.add(Tag.BEGIN_CASE.ordinal());
        if (item.spec().getType() == SoyMsgPluralCaseSpec.Type.EXPLICIT) {
          builder.add(item.spec().getExplicitValue());
        } else {
```

### DataFlowIssue
Argument `node.getResolvedName()` might be null
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
            node.getType(),
            MethodRef.CREATE_TEMPLATE_VALUE.invoke(
                constant(node.getResolvedName()), templateValue));
      }
      Expression renderContext = parameters.getRenderContext();
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
      } else if (!analysis.isResolved(varRef)) {
        // otherwise it must be a SoyValueProvider, resolve and cast
        expression = detacher.resolveSoyValueProvider(expression);
        return SoyExpression.forSoyValue(
            varRef.getType(),
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
            MethodRef.RUNTIME_GET_FIELD_PROVIDER.invoke(
                baseExprAsRecord, constant(node.getFieldName()));
        fieldAccess = detacher.resolveSoyValueProvider(fieldProvider);
      }
      return SoyExpression.forSoyValue(
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_LIST_ITEM_PROVIDER.invoke(list, index));
        }
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_MAP_ITEM_PROVIDER.invoke(map, index));
        }
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_LEGACY_OBJECT_MAP_ITEM_PROVIDER.invoke(map, index));
        }
```

### DataFlowIssue
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
    private Expression resolveVarRefNode(VarRefNode varRef, Expression unresolvedExpression) {
      if (!analysis.isResolved(varRef)) {
        return detacher.resolveSoyValueProvider(unresolvedExpression);
      } else {
        return unresolvedExpression.invoke(MethodRef.SOY_VALUE_PROVIDER_RESOLVE);
```

### DataFlowIssue
Method invocation `getSoyFileKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckIndirectDepsPass.java`
#### Snippet
```java
              SoyFileKind calleeKind =
                  i.getImportType() == ImportType.TEMPLATE
                      ? templateRegistryFull.get().getFile(importPath).getSoyFileKind()
                      : registry.getProtoRegistry().getDepKind(importPath);

```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
                endPlaceholder));
      }
      if (startPlaceholders.contains(endPlaceholder)) {
        String beforePlaceholder = null;
        // scan to find the placeholder that is supposed to come after this one.
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
          String placeholderName = ((SoyMsgPlaceholderPart) msgPart).getPlaceholderName();
          if (endPlaceholderToStartPlaceholder != null) {
            if (startPlaceholders.contains(placeholderName)) {
              startPlaceholderRenderCount.add(placeholderName);
            } else {
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
          if (endPlaceholderToStartPlaceholder != null) {
            if (startPlaceholders.contains(placeholderName)) {
              startPlaceholderRenderCount.add(placeholderName);
            } else {
              // check if it is an end tag
```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
                boolean matched = false;
                for (String startPlaceholder : startPlaceholders) {
                  if (startPlaceholderRenderCount.remove(startPlaceholder)) {
                    matched = true;
                    break;
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        ImmutableList<SoyMsgPart> parts = this.msgParts;
        RenderResult caseSelectionResult = RenderResult.done();
        while (!parts.isEmpty()) {
          SoyMsgPart first = parts.get(0);
          if (first instanceof SoyMsgSelectPart) {
```

### DataFlowIssue
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckModifiableTemplatesPass.java`
#### Snippet
```java
    }
    TemplateType modifiedTemplateType =
        (TemplateType) templateBasicNode.getModifiesExpr().getRoot().getType();
    SoyType variantType = templateBasicNode.getVariantExpr().getRoot().getType();
    if (!modifiedTemplateType.getUseVariantType().isAssignableFromStrict(variantType)) {
```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckModifiableTemplatesPass.java`
#### Snippet
```java
        (TemplateLiteralNode) templateBasicNode.getModifiesExpr().getRoot();
    String namespace =
        literal.getResolvedName().substring(0, literal.getResolvedName().lastIndexOf("."));
    if (!namespace.equals(file.getNamespace())) {
      modifiedNamespaces.add(namespace);
```

### DataFlowIssue
Method invocation `getTemplateType` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
                  .get()
                  .getBasicTemplateOrElement(leaf.getValue())
                  .getTemplateType()
                  .getReservedAttributes();
        }
```

### DataFlowIssue
Method invocation `setReservedAttributes` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
        }
        TemplateNode caller = allAstElements.get(leaf.getKey());
        caller.setReservedAttributes(
            ImmutableSet.<String>builder()
                .addAll(caller.getReservedAttributes())
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
              AttrParam attr = attrs.get(attrName);
              unseenParams.remove(attr);
              VarRefNode attrExpr = new VarRefNode("$" + attr.name(), unknown, attr);

              final StandaloneNode replacementNode;
```

### DataFlowIssue
Argument `definiteBlockAttrs` might be null
in `java/src/com/google/template/soy/passes/BasicHtmlValidationPass.java`
#### Snippet
```java
          }
        }
        foundSoFar.addAll(definiteBlockAttrs);
      } else {
        for (BlockNode block : parent.getChildren()) {
```

### DataFlowIssue
Method invocation `getMessageTypes` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ProtoImportProcessor.java`
#### Snippet
```java

    ImmutableMap<String, Descriptor> messages =
        fd.getMessageTypes().stream().collect(toImmutableMap(Descriptor::getName, f -> f));
    ImmutableMap<String, EnumDescriptor> enums =
        fd.getEnumTypes().stream().collect(toImmutableMap(EnumDescriptor::getName, f -> f));
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
    void define(VarDefn defn, Node definingNode) {
      if (check(defn, definingNode)) {
        currentScope.peek().put(defn.refName(), defn);
      }
    }
```

### DataFlowIssue
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
              englishName(defn),
              refName,
              preexisting.nameLocation().toLineColumnString());
        }
        return false;
```

### DataFlowIssue
Method invocation `getAndIncrement` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/IncrementalDomKeysPass.java`
#### Snippet
```java
      }
      AtomicInteger keyCounter = keyCounterStack.peek();
      return template.getTemplateName() + "-" + keyCounter.getAndIncrement();
    }
  }
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java

    String attrName = attr.getStaticKey();
    boolean isSoyAttr = attrName.startsWith("@");
    if (isSoyAttr) {
      attrName = attrName.substring(1);
```

### DataFlowIssue
Argument `paramName` might be null
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            startNode.getSourceLocation(),
            unknown,
            Identifier.create(paramName, unknown),
            new CommandTagAttribute(
                Identifier.create("kind", unknown),
```

### DataFlowIssue
Method invocation `getTag` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
                templatesInLibrary,
                visited);
        tagName = metadata.getTag();
      } else {
        // TODO(tomnguyen) It should be possible to use type information to get more data.
```

### DataFlowIssue
Method invocation `getFinalCallee` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
          getTemplateMetadataForStaticCall(
              template, delegateTemplate, openTag.getSourceLocation(), templatesInLibrary, visited);
      if (htmlMetadata.getFinalCallee().isEmpty()) {
        finalCallee = delegateTemplate;
      } else {
```

### DataFlowIssue
Method invocation `getIsSoyElement` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    if (templateMetadata != null) {
      calleeMetadata = templateMetadata.getHtmlElement();
      isCalleeSoyElement = templateMetadata.getSoyElement().getIsSoyElement();
    } else if (templatesInLibrary.containsKey(callee)) {
      TemplateNode calledTemplate = templatesInLibrary.get(callee);
```

### DataFlowIssue
Method invocation `getFinalCallee` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    }
    String finalCallee;
    if (calleeMetadata.getFinalCallee().isEmpty()) {
      finalCallee = callee;
    } else {
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
            SourceLocation.UNKNOWN,
            FUNCTION_PRINT_DIRECTIVE_COLLISION,
            functions.get(functionName).getClass().getName(),
            functionName,
            directive.getClass().getName());
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java
      if (htmlMatcherGraph.getNodeAtCursor().isPresent()) {
        HtmlMatcherGraphNode activeNode = htmlMatcherGraph.getNodeAtCursor().get();
        activeEdgeStack.peek().add(ActiveEdge.create(activeNode, activeNode.getActiveEdgeKind()));
      }
      ifConditionNode.setActiveEdgeKind(EdgeKind.FALSE_EDGE);
```

### DataFlowIssue
Argument `htmlMatcherGraph` might be null
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java

            /* parentBlockType= */ null)
        .run(htmlMatcherGraph);
    if (node.isStrictHtml()) {
      reporter.copyTo(this.errorReporter);
```

### DataFlowIssue
Argument `graph` might be null
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
    if (foreignContentTagDepth > 0) {
      if (!isInternallyBalancedForForeignContent.isPresent()) {
        pass.run(graph);
        isInternallyBalancedForForeignContent = Optional.of(errorReporter.getErrors().isEmpty());
      }
```

### DataFlowIssue
Argument `graph` might be null
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
    }
    if (!isInternallyBalanced.isPresent()) {
      pass.run(graph);
      isInternallyBalanced = Optional.of(errorReporter.getErrors().isEmpty());
    }
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/TemplateImportProcessor.java`
#### Snippet
```java
    return typeRegistry.intern(
        TemplateModuleImportType.create(
            templatesPerFile.getNamespace(),
            path,
            ImmutableSet.copyOf(templatesPerFile.getConstantNames()),
```

### DataFlowIssue
Method invocation `hasTemplate` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/TemplateImportProcessor.java`
#### Snippet
```java
    for (ImportedVar symbol : node.getIdentifiers()) {
      String name = symbol.getSymbol();
      boolean isTemplate = fileMetadata.hasTemplate(name);

      // Report an error if the symbol name is invalid.
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckTemplateCallsPass.java`
#### Snippet
```java
          ExprNode dataExpr = call.getDataExpr();
          // TODO(b/168852179): enforce that the correct set of properties are present
          if (!SoyTypes.isKindOrUnionOfKind(dataExpr.getType(), SoyType.Kind.RECORD)
              && dataExpr.getType().getKind() != SoyType.Kind.UNKNOWN
              && dataExpr.getType().getKind() != SoyType.Kind.ANY) {
```

### DataFlowIssue
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
          node.getSourceLocation(),
          DELCALL_TO_BASIC_TEMPLATE,
          collision.nameLocation().toLineColumnString());
    }
  }
```

### DataFlowIssue
Method invocation `isRequired` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
              // with the same name differ in either the type or isRequired.
              Parameter param2 = nameToParamMap.get(paramName);
              return !param.equals(param2) && (param.isRequired() || param2.isRequired());
            })
        .collect(Collectors.toSet());
```

### DataFlowIssue
Variable is already assigned to this value
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
          break;
        }
        prev = stack;
        while (!prev.isEmpty()) {
          HtmlOpenTagNode nextOpenTag = prev.tagNode;
```

### DataFlowIssue
Variable is already assigned to this value
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
        break;
      case CLAZZ:
        actualSoyType = null;
        break;
    }
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `java/src/com/google/template/soy/shared/SoyCssRenamingMap.java`
#### Snippet
```java
  SoyCssRenamingMap IDENTITY =
      new SoyCssRenamingMap() {
        @Nullable
        @Override
        public String get(String key) {
```

### DataFlowIssue
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java

      checkMapFromListConstructorCondition(
          ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.KEY_STRING)
              && ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.VALUE_STRING),
          recordEntry,
```

### DataFlowIssue
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
      checkMapFromListConstructorCondition(
          ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.KEY_STRING)
              && ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.VALUE_STRING),
          recordEntry,
          OptionalInt.of(i));
```

### DataFlowIssue
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
          OptionalInt.of(i));

      SoyValue key = ((SoyRecord) recordEntry).getField(MapLiteralFromListNode.KEY_STRING);
      SoyValueProvider valueProvider =
          ((SoyRecord) recordEntry).getFieldProvider(MapLiteralFromListNode.VALUE_STRING);
```

### DataFlowIssue
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
      SoyValue key = ((SoyRecord) recordEntry).getField(MapLiteralFromListNode.KEY_STRING);
      SoyValueProvider valueProvider =
          ((SoyRecord) recordEntry).getFieldProvider(MapLiteralFromListNode.VALUE_STRING);
      checkMapFromListConstructorCondition(
          key != null && SoyMap.isAllowedKeyType(key), recordEntry, OptionalInt.of(i));
```

### DataFlowIssue
Method invocation `refName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/ForNode.java`
#### Snippet
```java
            "%s, %s in %s",
            ((ForNonemptyNode) getChild(0)).getVarRefName(),
            ((ForNonemptyNode) getChild(0)).getIndexVar().refName(),
            expr.toSourceString());
  }
```

### DataFlowIssue
Dereference of `templateKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
    String templateName;
    String variant = templateProto.getDelTemplateVariant();
    switch (templateKind) {
      case ELEMENT:
      case BASIC:
```

### DataFlowIssue
Method invocation `hashCode` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
  public int hashCode() {
    return isStatic()
        ? nameAsLowerCase.hashCode()
        : PrintNode.PrintEquivalence.get().hash((PrintNode) node);
  }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
      }
      if (isStatic()) {
        return nameAsLowerCase.equals(tag.nameAsLowerCase);
      }
      return PrintNode.PrintEquivalence.get().equivalent((PrintNode) node, (PrintNode) tag.node);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterCssValue(String value) {
    if (EscapingConventions.FilterCssValue.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a data URI corresponding to an image. */
  public static SanitizedContent filterImageDataUri(String value) {
    if (EscapingConventions.FilterImageDataUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a tel URI. */
  public static SanitizedContent filterTelUri(String value) {
    if (EscapingConventions.FilterTelUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sip URI. */
  public static SanitizedContent filterSipUri(String value) {
    if (EscapingConventions.FilterSipUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
    if (EscapingConventions.FilterLegacyUriBehavior.INSTANCE
        .getValueFilter()
        .matcher(value)
        .find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sms URI. */
  public static SanitizedContent filterSmsUri(String value) {
    if (EscapingConventions.FilterSmsUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterHtmlAttributes(String value) {
    if (EscapingConventions.FilterHtmlAttributes.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java

  public static String filterCspNonceValue(String value) {
    if (EscapingConventions.FilterCspNonceValue.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Checks that the input is part of the name of an innocuous element. */
  public static String filterHtmlElementName(String value) {
    if (EscapingConventions.FilterHtmlElementName.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
    if (EscapingConventions.FilterNormalizeMediaUri.INSTANCE
        .getValueFilter()
        .matcher(value)
        .find()) {
      return EscapingConventions.FilterNormalizeMediaUri.INSTANCE.escape(value);
```

### DataFlowIssue
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterNormalizeUri(String value) {
    if (EscapingConventions.FilterNormalizeUri.INSTANCE.getValueFilter().matcher(value).find()) {
      return EscapingConventions.FilterNormalizeUri.INSTANCE.escape(value);
    }
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/ForNonemptyNode.java`
#### Snippet
```java
  @Nullable
  public String getIndexVarName() {
    return indexVar.name();
  }

```

### DataFlowIssue
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
   */
  private String resolveVariantExpression() {
    variantString = TemplateNode.variantExprToString(getVariantExpr().getRoot());
    return variantString;
  }
```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
        return templateLiteralNode
            .getResolvedName()
            .substring(0, templateLiteralNode.getResolvedName().lastIndexOf("."));
      }
    }
```

### DataFlowIssue
Argument `basePlaceholderName` might be null
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java
    // TODO(lukes): track down some documentation for these rules and add placeholder validation
    // in more places.
    basePlaceholderName = INVALID_PLACEHOLDER_CHARS.replaceFrom(basePlaceholderName, '_');
    return Ascii.toUpperCase(basePlaceholderName);
  }
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/PartialFileSetMetadata.java`
#### Snippet
```java
   */
  default String getNamespaceForPath(SourceFilePath path) {
    return getPartialFile(path).getNamespace();
  }
}
```

### DataFlowIssue
Method invocation `getFieldNames` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
      // TODO(user): Consider writing a soyProtoTypeImpl.getRequiredFields()
      Set<String> givenParams = new HashSet<>();
      ImmutableSet<String> fields = protoType.getFieldNames();

      boolean hasAliasedParams = false;
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java

        // Same for List<?>, for repeated fields
        if (fieldType.getKind() == Kind.LIST && argType.getKind() == Kind.LIST) {
          SoyType argElementType = ((ListType) argType).getElementType();
          if (argElementType == null || argElementType.equals(UnknownType.getInstance())) {
```

### DataFlowIssue
Casting `argType` to `ListType` may produce `ClassCastException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        // Same for List<?>, for repeated fields
        if (fieldType.getKind() == Kind.LIST && argType.getKind() == Kind.LIST) {
          SoyType argElementType = ((ListType) argType).getElementType();
          if (argElementType == null || argElementType.equals(UnknownType.getInstance())) {
            continue;
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
   */
  public String getPluralVarName(MsgPluralNode pluralNode) {
    return getSubstUnitInfo().nodeToVarNameMap.get(pluralNode).name();
  }

```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
   */
  public String getSelectVarName(MsgSelectNode selectNode) {
    return getSubstUnitInfo().nodeToVarNameMap.get(selectNode).name();
  }

```

### DataFlowIssue
Argument `SoyFileHeaderInfo.EMPTY.getNamespace()` might be null
in `java/src/com/google/template/soy/soytree/NamespaceDeclaration.java`
#### Snippet
```java
  public static final NamespaceDeclaration EMPTY =
      new NamespaceDeclaration(
          Identifier.create(SoyFileHeaderInfo.EMPTY.getNamespace(), UNKNOWN),
          ImmutableList.of(),
          null,
```

### DataFlowIssue
Argument `specialCharTag` might be null
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
      while (matcher.find()) {
        String specialCharTag = SPECIAL_CHAR_TO_TAG.get(matcher.group());
        matcher.appendReplacement(sb, Matcher.quoteReplacement(specialCharTag));
      }
      matcher.appendTail(sb);
```

### DataFlowIssue
Dereference of `node.offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // joining the arrays
        // we don't preserve offsets from empty nodes.
        numOffsets += node.isEmpty() ? 0 : node.offsets.indexes.length - 1;
      } else {
        numOffsets = -1;
```

### DataFlowIssue
Dereference of `offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // offset's string.
        SourceOffsets offsets = node.offsets;
        int amountToCopy = offsets.indexes.length;
        if (i < nodes.size() - 1) {
          amountToCopy--;
```

### DataFlowIssue
Dereference of `nodes.get(i - 1).offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // If the new begin reason is NONE, then use the old end reason.
        if (offsets.reasons[0] == Reason.NONE && i > 0) {
          Reason[] prevReasons = nodes.get(i - 1).offsets.reasons;
          reasons[offsetsIndex] = prevReasons[prevReasons.length - 1];
        }
```

### DataFlowIssue
Method invocation `getSourceLocation` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
        }
        errorReporter.report(
            collidingExprRoot.getSourceLocation(),
            COLLIDING_EXPRESSIONS,
            exprRoot.toSourceString(),
```

### DataFlowIssue
Casting `template` to `TemplateDelegateNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
    }
    if (template.getKind() == Kind.TEMPLATE_DELEGATE_NODE) {
      TemplateDelegateNode deltemplate = (TemplateDelegateNode) template;
      builder.setDelTemplateName(deltemplate.getDelTemplateName());
      builder.setDelTemplateVariant(deltemplate.getDelTemplateVariant());
```

### DataFlowIssue
Argument `value` might be null
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
      SoyJavaPrintDirective directive,
      Object... args) {
    assertTofuOutput(StringData.forValue(expectedOutput), value, directive, args);
  }

```

### DataFlowIssue
Method invocation `isSingleLine` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/defn/ImportedVar.java`
#### Snippet
```java
  public SourceLocation symbolLocation() {
    SourceLocation full = nameLocation();
    if (isAliased() && full.isSingleLine()) {
      return full.substring(0, symbol.length());
    } else {
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  void checkAsExpr(ErrorReporter reporter) {
    checkState(value == null);
    if (valueExprList.size() != 1) {
      SourceLocation loc =
          valueExprList.isEmpty() ? getSourceLocation() : valueExprList.get(1).getSourceLocation();
```

### DataFlowIssue
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkState(valueExprList == null);

    return ImmutableList.copyOf(SPLITTER.split(value));
  }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkAsExpr(reporter);
    // Return the first expr to avoid an NPE in CallNode ctor.
    return valueExprList.get(0);
  }

```

### DataFlowIssue
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    try {
      return OptionalInt.of(Integer.parseInt(value));
    } catch (NumberFormatException e) {
      errorReporter.report(valueLocation, INVALID_ATTRIBUTE, key.identifier(), "a number");
```

### DataFlowIssue
Argument `valueExprList` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    String valueStr =
        quoteStyle.getQuoteChar()
            + ((value != null) ? value : SoyTreeUtils.toSourceString(valueExprList))
            + quoteStyle.getQuoteChar();
    return key.identifier() + "=" + valueStr;
```

### DataFlowIssue
Argument `valueExprList` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
            ? BaseUtils.escapeToWrappedSoyString(value, false, quoteStyle)
            : quoteStyle.getQuoteChar()
                + SoyTreeUtils.toSourceString(valueExprList)
                + quoteStyle.getQuoteChar();
    return key.identifier() + "=" + valueStr;
```

### DataFlowIssue
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    try {
      return OptionalLong.of(Long.parseLong(value));
    } catch (NumberFormatException e) {
      errorReporter.report(valueLocation, INVALID_ATTRIBUTE, key.identifier(), "a number");
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
          key,
          quoteStyle,
          valueExprList.stream()
              .map(expr -> expr.getRoot().copy(copyState))
              .collect(toImmutableList()),
```

### DataFlowIssue
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkState(valueExprList == null);

    Iterable<String> namespaces = SPLITTER.split(value);
    boolean hasError = false;
    for (String namespace : namespaces) {
```

### DataFlowIssue
Argument `soyFileHeaderInfo.namespace` might be null
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
  public StackTraceElement createStackTraceElement(SourceLocation srcLocation) {
    return new StackTraceElement(
        /* declaringClass= */ soyFileHeaderInfo.namespace,
        // The partial template name begins with a '.' that causes the stack trace element to
        // print "namespace..templateName" otherwise.
```

### DataFlowIssue
Method invocation `isEquivalent` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
      // VarRefs are considered equivalent if they have identical and non-null VarDefns.
      if (node.getDefnDecl() != null || typedOther.getDefnDecl() != null) {
        return node.getDefnDecl().isEquivalent(typedOther.getDefnDecl());
      }
      // When getDefnDecl() are null, we should not directly return true. Instead, we should compare
```

### DataFlowIssue
Method invocation `hashCode` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
        @Override
        protected Integer visitTemplateLiteralNode(TemplateLiteralNode node) {
          return node.getResolvedName().hashCode();
        }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
    protected Boolean visitTemplateLiteralNode(TemplateLiteralNode node) {
      TemplateLiteralNode otherNode = (TemplateLiteralNode) other;
      return node.getResolvedName().equals(otherNode.getResolvedName());
    }

```

### DataFlowIssue
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
            indexVar.refName(),
            getListExpr().toSourceString(),
            getFilterExpr().toSourceString());
      }
      return String.format(
```

### DataFlowIssue
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
          listIterVar.refName(),
          getListExpr().toSourceString(),
          getFilterExpr().toSourceString());
    }
    return String.format(
```

### DataFlowIssue
Casting `node` to `GroupNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/exprtree/NullSafeAccessNode.java`
#### Snippet
```java
    return (node.getKind() == Kind.STRING_NODE
            && ((StringNode) node).getValue().equals(BASE_PLACEHOLDER_VALUE))
        || (node.getKind() == Kind.GROUP_NODE && ((GroupNode) node).isNullSafeAccessPlaceHolder());
  }

```

### DataFlowIssue
Method invocation `getPrecedence` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java

    Operator operator = OPERATOR_TABLE.get(op, children.length);
    if (operator.getPrecedence() != prec) {
      throw new IllegalArgumentException("invalid precedence " + prec + " for operator " + op);
    }
```

### DataFlowIssue
Dereference of `jsType` may produce `NullPointerException`
in `java/src/com/google/template/soy/internal/proto/FieldVisitor.java`
#### Snippet
```java
    if (ProtoUtils.hasJsType(fieldDescriptor)) {
      JSType jsType = ProtoUtils.getJsType(fieldDescriptor);
      switch (jsType) {
        case JS_NORMAL:
        case JS_NUMBER:
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
  public static Descriptor getMapValueMessageType(FieldDescriptor mapField) {
    FieldDescriptor valueDesc = getMapValueFieldDescriptor(mapField);
    if (valueDesc.getType() == FieldDescriptor.Type.MESSAGE) {
      return valueDesc.getMessageType();
    } else {
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
                  c ->
                      ConstantImpl.of(
                          c.getName(),
                          TemplateMetadataSerializer.fromProto(
                              c.getType(),
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java

  private static boolean sameFile(TemplateMetadata t1, TemplateMetadata t2) {
    return t1.getSourceLocation().getFileName().equals(t2.getSourceLocation().getFileName());
  }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
                  e ->
                      ExternImpl.of(
                          e.getName(),
                          (FunctionType)
                              TemplateMetadataSerializer.fromProto(
```

### DataFlowIssue
Argument `printDirectives.get(escapingMode.directiveName)` might be null
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
          new ImmutableList.Builder<>();
      for (EscapingMode escapingMode : inferences.getEscapingModesForNode(node)) {
        escapingDirectiveNames.add(printDirectives.get(escapingMode.directiveName));
      }
      return escapingDirectiveNames.build();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
              (templateLiteral) ->
                  !templateLiteral.isStaticCall()
                      && templateLiteral.getResolvedName().equals(template.getTemplateName()))) {
        // If a template is passed around into other templates, we cannot be sure of the trusted
        // content kind.
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `java/src/com/google/template/soy/parsepasses/contextautoesc/SoyAutoescapeException.java`
#### Snippet
```java
   */
  static SoyAutoescapeException createWithNode(String message, SoyNode node) {
    return new SoyAutoescapeException(message, /*cause=*/ null, node);
  }

```

### DataFlowIssue
Method invocation `asInlineCast` may produce `NullPointerException`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
          paramNames.get(i),
          "\", ",
          type.getJavaTypeMap().get(paramNames.get(i)).asInlineCast(javaParamNames.get(i)));
    }
    ilb.appendLineEnd("));");
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
        case DELTEMPLATE:
          resultSb.append(template.getDelTemplateName());
          if (!template.getDelTemplateVariant().isEmpty()) {
            resultSb.append(':');
            resultSb.append(template.getDelTemplateVariant());
```

### DataFlowIssue
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/Environment.java`
#### Snippet
```java
              "No value for %s at %s. All: %s",
              var.name(),
              var.nameLocation().toLineColumnString(),
              localVariables.keySet())
          .resolve();
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
              + soyValue
              + "] of type: "
              + soyValue.getClass()
              + " is incompatible with soy type: "
              + type);
```

### DataFlowIssue
Method invocation `coerceToString` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  public JavaValue coerceToSoyString() {
    return TofuJavaValue.forSoyValue(
        StringData.forValue(soyValue.coerceToString()), sourceLocation);
  }

```

### DataFlowIssue
Method invocation `coerceToBoolean` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  public JavaValue coerceToSoyBoolean() {
    return TofuJavaValue.forSoyValue(
        BooleanData.forValue(soyValue.coerceToBoolean()), sourceLocation);
  }

```

### DataFlowIssue
Argument `state().getErrorMessage()` might be null
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    // Short circuit on the error case first.
    if (escapingMode == null) {
      throw SoyAutoescapeException.createWithNode(state().getErrorMessage(), node);
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    boolean isEndTag = state() == HtmlContext.HTML_BEFORE_CLOSE_TAG_NAME;
    int newTemplateNestDepth = templateNestDepth();
    if (node.getTagName().isStatic() && node.getTagName().getTagString().equals("template")) {
      newTemplateNestDepth += isEndTag ? -1 : 1;
      if (newTemplateNestDepth < 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
        if (node.getDirectAttributeNamed("rel") == null
            && node.getDirectAttributeNamed("itemprop") != null) {
          elType = ElementType.NORMAL;
        } else {
          String rel = getStaticAttributeValue(node, "rel");
```

### DataFlowIssue
Method invocation `getExpr` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
                      ConstNode constNode =
                          constants.get(SourceFilePath.create(node.getPath()), var.getSymbol());
                      return eval(constNode.getExpr(), constNode);
                    }));
          }
```

### DataFlowIssue
Casting `listValue` to `SoyList` may produce `ClassCastException`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
          listValue instanceof SoyList, listValue, OptionalInt.empty());

      List<? extends SoyValueProvider> list = ((SoyList) listValue).asJavaList();
      return constructMapFromList(list);
    } catch (IllegalArgumentException e) {
```

### DataFlowIssue
Casting `base` to `SoyLegacyObjectMap` may produce `ClassCastException`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    boolean shouldUseNewMap = MapType.ANY_MAP.isAssignableFromStrict(baseType);
    SoyValue value =
        shouldUseNewMap ? ((SoyMap) base).get(key) : ((SoyLegacyObjectMap) base).getItem(key);

    if (value != null
```

### DataFlowIssue
Argument `((TemplateParam) node.getDefnDecl()).defaultValue()` might be null
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
          && (UndefinedData.INSTANCE == value)) {
        // Use the default value if it has one and the parameter is undefined.
        value = visit(((TemplateParam) node.getDefnDecl()).defaultValue());
      }
      return value;
```

### DataFlowIssue
Unboxing of `isNonConst.get(headerVar)` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomCodeVisitor.java`
#### Snippet
```java
    String prefix = STATE_PREFIX;
    for (TemplateStateVar headerVar : headerVars) {
      if (isNonConst.get(headerVar)) {
        stateReassignmentBuilder.add(
            Statements.assign(
```

### DataFlowIssue
Method invocation `isHtml` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      // We could be in some other content kind (like JS in a <script> tag) or still in HTML. Either
      // way, a closing HTML tag means we're back in HTML, so pop if needed for HTML.
      if (!contentKind.peek().isHtml()) {
        contentKind.pop();
        checkState(contentKind.peek().isHtml(), "unexpected contentKind: %s", contentKind);
```

### DataFlowIssue
Method invocation `isHtml` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      if (!contentKind.peek().isHtml()) {
        contentKind.pop();
        checkState(contentKind.peek().isHtml(), "unexpected contentKind: %s", contentKind);
      }
    }
```

### DataFlowIssue
Argument `contentKind.peek()` might be null
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
  @Override
  protected Statement visitIfNode(IfNode node) {
    if (!isTextContent(contentKind.peek())) {
      if (node.getHtmlContext() == HtmlContext.HTML_PCDATA) {
        return wrapInTemplateCloning(super.generateNonExpressionIfNode(node), node);
```

### DataFlowIssue
Variable is already assigned to this value
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
      int cp = -1;
      if (end == -1) {
        cp = -1;
      } else {
        if (s.charAt(amp + 1) == '#') { // Decode a numeric entity
```

### DataFlowIssue
Variable is already assigned to this value
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
            }
          } catch (NumberFormatException ex) {
            cp = -1; // Malformed numeric entity
          }
        } else {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'SoyEasyList' is still used
in `java/src/com/google/template/soy/data/SoyEasyList.java`
#### Snippet
```java
@Deprecated
@ParametersAreNonnullByDefault
public interface SoyEasyList extends SoyList, SoyLegacyObjectMap {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'compileToTofu' is still used
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   */
  @Deprecated
  public SoyTofu compileToTofu() {
    return compileToTofu(ImmutableMap.of());
  }
```

### DeprecatedIsStillUsed
Deprecated member 'extractMsgs' is still used
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   */
  @Deprecated
  public SoyMsgBundle extractMsgs() {
    return entryPoint(this::doExtractMsgs);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'SoyMapData' is still used
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java
 */
@Deprecated
public class SoyMapData extends CollectionData implements SoyDict, SoyMap {

  /** Underlying map. */
```

### DeprecatedIsStillUsed
Deprecated member 'EasyListImpl' is still used
in `java/src/com/google/template/soy/data/internal/EasyListImpl.java`
#### Snippet
```java
@ParametersAreNonnullByDefault
@Deprecated
public final class EasyListImpl extends ListBackedList implements SoyEasyList {

  /** Whether this instance is still mutable (immutability cannot be undone, of course). */
```

### DeprecatedIsStillUsed
Deprecated member 'SoyListData' is still used
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
 */
@Deprecated
public final class SoyListData extends CollectionData implements Iterable<SoyValue>, SoyList {
  /** The underlying list. */
  private final List<SoyValue> list;
```

### DeprecatedIsStillUsed
Deprecated member 'createFromExistingData' is still used
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   */
  @Deprecated
  protected static SoyValue createFromExistingData(Object obj) {
    if (obj instanceof SoyValue) {
      return (SoyValue) obj;
```

### DeprecatedIsStillUsed
Deprecated member 'SoyLibraryAssistedJsSrcFunction' is still used
in `java/src/com/google/template/soy/jssrc/restricted/SoyLibraryAssistedJsSrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyLibraryAssistedJsSrcFunction extends SoyJsSrcFunction {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'maybeWrapAsSanitizedContent' is still used
in `java/src/com/google/template/soy/jssrc/restricted/JsExprUtils.java`
#### Snippet
```java
   */
  @Deprecated
  public static JsExpr maybeWrapAsSanitizedContent(ContentKind contentKind, JsExpr jsExpr) {
    if (contentKind == ContentKind.TEXT) {
      return jsExpr;
```

### DeprecatedIsStillUsed
Deprecated member 'SoyJsSrcFunction' is still used
in `java/src/com/google/template/soy/jssrc/restricted/SoyJsSrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyJsSrcFunction extends SoyFunction {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'SoyPySrcFunction' is still used
in `java/src/com/google/template/soy/pysrc/restricted/SoyPySrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyPySrcFunction extends SoyFunction {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'renderTemplate' is still used
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
   */
  @Deprecated
  Renderer renderTemplate(String template);

  default Renderer renderTemplate(TemplateName template) {
```

### DeprecatedIsStillUsed
Deprecated member 'TypedSoyFunction' is still used
in `java/src/com/google/template/soy/shared/restricted/TypedSoyFunction.java`
#### Snippet
```java
 */
@Deprecated
public abstract class TypedSoyFunction implements SoyFunction {

  @Override
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_AUTOESCAPE_TRUE' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoAutoescapeTrueSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoAutoescapeTrueSoyTemplateInfo DEMO_AUTOESCAPE_TRUE =
      DemoAutoescapeTrueSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_FOR_RANGE' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoForRangeSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoForRangeSoyTemplateInfo DEMO_FOR_RANGE =
      DemoForRangeSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoDoubleBracesSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoDoubleBracesSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_DOUBLE_BRACES' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoDoubleBracesSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoDoubleBracesSoyTemplateInfo DEMO_DOUBLE_BRACES =
      DemoDoubleBracesSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_SWITCH' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoSwitchSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoSwitchSoyTemplateInfo DEMO_SWITCH =
      DemoSwitchSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoCallWithoutParamSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithoutParamSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_CALL_WITH_PARAM' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithParamSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithParamSoyTemplateInfo DEMO_CALL_WITH_PARAM =
      DemoCallWithParamSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoForRangeSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoForRangeSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DemoCallWithParamSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithParamSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_COMMENTS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCommentsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCommentsSoyTemplateInfo DEMO_COMMENTS =
      DemoCommentsSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoPrintSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoPrintSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DemoExpressionsSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoExpressionsSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_PRINT' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoPrintSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoPrintSoyTemplateInfo DEMO_PRINT =
      DemoPrintSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoAutoescapeTrueSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoAutoescapeTrueSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_MSG' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoMsgSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoMsgSoyTemplateInfo DEMO_MSG =
      DemoMsgSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoCallWithParamBlockSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithParamBlockSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DemoForSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoForSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_EXPRESSIONS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoExpressionsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoExpressionsSoyTemplateInfo DEMO_EXPRESSIONS =
      DemoExpressionsSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_FOR' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoForSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoForSoyTemplateInfo DEMO_FOR =
      DemoForSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_LINE_JOINING' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoLineJoiningSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoLineJoiningSoyTemplateInfo DEMO_LINE_JOINING =
      DemoLineJoiningSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_CALL_WITH_PARAM_BLOCK' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithParamBlockSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithParamBlockSoyTemplateInfo DEMO_CALL_WITH_PARAM_BLOCK =
      DemoCallWithParamBlockSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_BIDI_SUPPORT' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoBidiSupportSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoBidiSupportSoyTemplateInfo DEMO_BIDI_SUPPORT =
      DemoBidiSupportSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoMsgSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoMsgSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_CALL_WITHOUT_PARAM' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithoutParamSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithoutParamSoyTemplateInfo DEMO_CALL_WITHOUT_PARAM =
      DemoCallWithoutParamSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_RAW_TEXT_COMMANDS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoRawTextCommandsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoRawTextCommandsSoyTemplateInfo DEMO_RAW_TEXT_COMMANDS =
      DemoRawTextCommandsSoyTemplateInfo.getInstance();

```

### DeprecatedIsStillUsed
Deprecated member 'DemoBidiSupportSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoBidiSupportSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### DeprecatedIsStillUsed
Deprecated member 'DEMO_IF' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoIfSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoIfSoyTemplateInfo DEMO_IF =
      DemoIfSoyTemplateInfo.getInstance();

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
                  : "{" + Joiner.on(", ").withKeyValueSeparator(": ").join(parameters) + ",}";
          String returnType = forReturnType.typeExpr();
          switch (kind) {
            case IDOMSRC:
              builder.addRequire(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/types/TemplateBindingUtil.java`
#### Snippet
```java
    Set<SoyType> types = new HashSet<>();
    for (SoyType baseType : SoyTypes.expandUnions(base)) {
      switch (baseType.getKind()) {
        case TEMPLATE:
          types.add(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/soytree/VeLogNode.java`
#### Snippet
```java
    this.attributes = attributes;
    for (CommandTagAttribute attr : attributes) {
      switch (attr.getName().identifier()) {
        case "logonly":
          logonlyExpr = attr.valueAsExpr(errorReporter);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/soytree/TemplateDelegateNodeBuilder.java`
#### Snippet
```java
        continue;
      }
      switch (name.identifier()) {
        case "variant":
          // need to get variant parsing out of this.  maybe we can expose some sort of limited
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/exprtree/CallableExprBuilder.java`
#### Snippet
```java
    setParamValues(from.getParams());
    setCommaLocations(from.getCommaLocations().orElse(null));
    switch (from.getParamsStyle()) {
      case NAMED:
        setParamNames(from.getParamNames());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
  /** Derives the outer class name based on the protobuf (.proto) file name. */
  static String getFileClassName(FileDescriptorProto file, ProtoFlavor flavor) {
    switch (flavor) {
      case PROTO2:
        return getFileImmutableClassName(file);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
  private static boolean multipleJavaFiles(FileDescriptorProto fd, ProtoFlavor flavor) {
    FileOptions options = fd.getOptions();
    switch (flavor) {
      case PROTO2:
        return options.getJavaMultipleFiles();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
   */
  public boolean isValidStartContextForContentKindLoose(SanitizedContentKind contentKind) {
    switch (contentKind) {
      case URI:
        // Allow contextual templates directly call URI templates, even if we technically need to
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
      return false;
    }
    switch (contentKind) {
      case ATTRIBUTES:
        // Allow HTML attribute names, regardless of the kind of attribute (e.g. plain text)
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/bidifunctions/BidiFunctionsRuntime.java`
#### Snippet
```java
    Dir valueDir = null;
    boolean isHtmlForValueDirEstimation = false;
    if (value instanceof SanitizedContent) {
      SanitizedContent sanitizedContent = (SanitizedContent) value;
      valueDir = sanitizedContent.getContentDirection();
      if (valueDir == null) {
        isHtmlForValueDirEstimation = sanitizedContent.getContentKind() == ContentKind.HTML;
      }
    }

    if (valueDir == null) {
      isHtmlForValueDirEstimation = isHtmlForValueDirEstimation || isHtml;
      valueDir = BidiUtils.estimateDirection(value.coerceToString(), isHtmlForValueDirEstimation);
    }
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java
    appendable.append('{');

    boolean isFirst = true;
    for (Map.Entry<String, SoyValueProvider> entry : map.entrySet()) {
      if (isFirst) {
        isFirst = false;
      } else {
        appendable.append(", ");
      }
      appendable.append(entry.getKey()).append(": ");
      entry.getValue().resolve().render(appendable);
    }
    appendable.append('}');
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
    ilb.appendLine();
    ilb.appendLine("private static final ", javaClassName, " __INSTANCE__ =");
    ilb.increaseIndent(2);
    ilb.appendLine("new ", javaClassName, "();");
    ilb.decreaseIndent(2);
    ilb.appendLine();
    ilb.appendLine("public static ", javaClassName, " getInstance() {");
    ilb.increaseIndent();
    ilb.appendLine("return __INSTANCE__;");
    ilb.decreaseIndent();
    ilb.appendLine("}");
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
    ilb.appendLine("private static final ", templateInfoClassName, " __INSTANCE__ =");
    ilb.increaseIndent(2);
    ilb.appendLine("new ", templateInfoClassName, "();");
    ilb.decreaseIndent(2);
    ilb.appendLine();
    ilb.appendLine("public static ", templateInfoClassName, " getInstance() {");
    ilb.increaseIndent();
    ilb.appendLine("return __INSTANCE__;");
    ilb.decreaseIndent();
    ilb.appendLine("}");
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
        adapter.dup(); // Stack: RR, RR
        MethodRef.RENDER_RESULT_IS_DONE.invokeUnchecked(adapter); // Stack: RR, Z
        // if isDone goto Done
        Label end = new Label();
        adapter.ifZCmp(Opcodes.IFNE, end); // Stack: RR
        saveState.gen(adapter);
        adapter.returnValue();
        adapter.mark(end);
        adapter.pop(); // Stack:
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
      final Label start = new Label();
      final Label end = new Label();
      TemplateVariableManager variableSet =
          new TemplateVariableManager(
              type.type(),
              DO_RESOLVE,
              /*parameterNames=*/ ImmutableList.of(),
              start,
              end,
              /* isStatic=*/ false);
      final Expression thisVar = variableSet.getVariable("this");
      LazyClosureParameterLookup lookup =
          new LazyClosureParameterLookup(this, parent.parameterLookup, variableSet, thisVar);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
      final Statement returnDone = Statement.returnExpression(RENDER_RESULT_DONE.invoke());
      Statement doResolveImpl =
          new Statement() {
            @Override
            protected void doGen(CodeBuilder adapter) {
              adapter.mark(start);
              storeExpr.gen(adapter);
              returnDone.gen(adapter);
              adapter.mark(end);

              variableSet.generateTableEntries(adapter);
            }
          };
      Expression constructExpr = generateConstructor(lookup.getCapturedFields());

      doResolveImpl.writeMethod(Opcodes.ACC_PROTECTED, DO_RESOLVE, writer);
      fields.defineFields(writer);
      fields.defineStaticInitializer(writer);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
      ParentCapture capturedField = localFields.get(local);
      if (capturedField == null) {
        Expression expression = parentParameterLookup.getLocal(local);
        FieldRef field =
            params.fields.addGeneratedFinalField(local.name(), expression.resultType());
        capturedField = ParentCapture.create(field, expression);
        localFields.put(local, capturedField);
      }
      return capturedField.field().accessor(thisVar);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
        TemplateVariableManager.Variable appendableVar =
            scope.createSynthetic(
                SyntheticVarName.appendable(),
                wrappedAppendable.appendable(),
                TemplateVariableManager.SaveStrategy.STORE);
        initAppendable = appendableVar.initializer();
        appendable = AppendableExpression.forExpression(appendableVar.accessor());
        if (wrappedAppendable.flushBuffersDepth() >= 0) {
          clearAppendable = appendable.flushBuffers(wrappedAppendable.flushBuffersDepth());
        }
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          baseArg.gen(cb);

          Label argIsNull = null;
          Label end = null;
          if (isNullable) {
            argIsNull = new Label();
            end = new Label();
            // perform null check
            cb.dup();
            cb.ifNull(argIsNull);
          }

          // arg is not null; unbox, coerce, set<Field>().

          unboxAndCoerce(cb, baseArg.soyRuntimeType(), field);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
      ParamStore dest = new ParamStore(source.size());
      for (Map.Entry<String, ?> entry : source.entrySet()) {
        String key = entry.getKey();
        SoyValueProvider value;
        try {
          value = SoyValueConverter.INSTANCE.convert(entry.getValue());
        } catch (Exception e) {
          throw new IllegalArgumentException(
              "Unable to convert param " + key + " to a SoyValue", e);
        }
        dest.setField(key, value);
      }
      return dest;
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
    if (leftRuntimeType.isKnownInt()
        && rightRuntimeType.isKnownInt()
        && left.isNonNullable()
        && right.isNonNullable()) {
      return Branch.ifEqual(left.unboxAsLong(), right.unboxAsLong()).asBoolean();
    }
    if (leftRuntimeType.isKnownNumber()
        && rightRuntimeType.isKnownNumber()
        && left.isNonNullable()
        && right.isNonNullable()
        && (leftRuntimeType.isKnownFloat() || rightRuntimeType.isKnownFloat())) {
      return Branch.ifEqual(left.coerceToDouble(), right.coerceToDouble()).asBoolean();
    }
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
    TemplateData templateData = getTemplateData(templateName);
    Set<TemplateData> orderedTemplateCalls = Sets.newLinkedHashSet();
    Set<TemplateData> visited = Sets.newLinkedHashSet();
    collectTransitiveCallees(
        templateData, orderedTemplateCalls, visited, enabledMods, collectCssFromDelvariants);
    LinkedHashSet<String> requiredNamespaces = Sets.newLinkedHashSet();
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
    Preconditions.checkArgument(node.numChildren() == 2);
    ExprNode lhOperand = node.getChild(0);
    ExprNode rhOperand = node.getChild(1);
    // Explicit coercion is necessary for 2 reasons:
    // 1. Some soy values don't have proper js truthy semantics (SanitizedContent types) so we need
    //    an explicit coercion where we expect a boolean value.
    // 2. The soy 'and' operator is a boolean operator whereas the JS && operator has more complex
    //    semantics, so explicit coercions are necessary to ensure we get a boolean value.
    Expression lhChunk = maybeCoerceToBoolean(lhOperand.getType(), visit(lhOperand), true);
    Expression rhChunk = maybeCoerceToBoolean(rhOperand.getType(), visit(rhOperand), true);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      a -= b;
      a -= c;
      a ^= (c >>> 13);
      b -= c;
      b -= a;
      b ^= (a << 8);
      c -= a;
      c -= b;
      c ^= (b >>> 13);
      a -= b;
      a -= c;
      a ^= (c >>> 12);
      b -= c;
      b -= a;
      b ^= (a << 16);
      c -= a;
      c -= b;
      c ^= (b >>> 5);
      a -= b;
      a -= c;
      a ^= (c >>> 3);
      b -= c;
      b -= a;
      b ^= (a << 10);
      c -= a;
      c -= b;
      c ^= (b >>> 15);
```

### DuplicatedCode
Duplicated code
in `java/src/com/google/template/soy/soytree/CallBasicNode.java`
#### Snippet
```java
    if (isPassingAllData()) {
      commandText.append(" data=\"all\"");
    } else if (getDataExpr() != null) {
      commandText.append(" data=\"").append(getDataExpr().toSourceString()).append('"');
    }
    getPlaceholder()
        .userSuppliedName()
        .ifPresent(phname -> commandText.append(" phname=\"").append(phname).append('"'));
    getPlaceholder()
        .example()
        .ifPresent(phex -> commandText.append(" phex=\"").append(phex).append('"'));
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java
  private final FileSetMetadata fileSetMetadata;

  @VisibleForTesting protected PyCodeBuilder pyCodeBuilder;

  private final IsComputableAsPyExprVisitor isComputableAsPyExprVisitor;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java

  /** @see LocalVariableStack */
  @VisibleForTesting protected LocalVariableStack localVarExprs;

  private static final SoyErrorKind DELEGATE_TEMPLATES_UNSUPPORTED =
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java
  @VisibleForTesting final GenPyExprsVisitorFactory genPyExprsVisitorFactory;

  @VisibleForTesting protected GenPyExprsVisitor genPyExprsVisitor;

  private final GenPyCallExprVisitor genPyCallExprVisitor;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomInteropVisitor.java`
#### Snippet
```java
  private final Expression shouldStub = GOOG_SOY_ALIAS.dotAccess("shouldStub");

  protected GenIncrementalDomInteropVisitor(
      SoyJsSrcOptions jsSrcOptions,
      JavaScriptValueFactoryImpl javaScriptValueFactory,
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
    // No standard var refs to @attribute params are allowed.
    SoyTreeUtils.allNodesOfType(templateNode, VarRefNode.class)
        .filter(ref -> attrs.contains(ref.getDefnDecl()))
        .forEach(
            attrRef ->
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
  @Nullable
  public SoySourceFunctionDescriptor getDescriptor(Object function) {
    return functionToDesc.get(function);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `java/src/com/google/template/soy/basetree/MixinParentNode.java`
#### Snippet
```java
   */
  public int getChildIndex(Node child) {
    return children.indexOf(child);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'IdentityHashMap.get()'
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyVisitor.java`
#### Snippet
```java
        if (!varDefnReplacements.isEmpty()) {
          for (RefAndHolder refAndHolder : allRefs) {
            LocalVar newDefn = varDefnReplacements.get(refAndHolder.ref.getDefnDecl());
            if (newDefn != null) {
              refAndHolder.ref.setDefn(newDefn);
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
public class GenJsCodeVisitor extends AbstractSoyNodeVisitor<List<String>> {

  /** Regex pattern to look for dots in a template name. */

  /** The options for generating JS source code. */
```

## RuleId[id=RegExpUnexpectedAnchor]
### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
  // Note: Need to escape hash char in regex due to Pattern.COMMENTS.
  private static final Pattern ICU_SYNTAX_CHAR_NEEDING_ESCAPE_PATTERN =
      Pattern.compile(" ' (?= ['{}\\#] ) | ' $ | [{}] ", Pattern.COMMENTS);

  /** Map from ICU syntax char to its escape sequence. */
```

### RegExpUnexpectedAnchor
Anchor `^` in unexpected position
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

### RegExpUnexpectedAnchor
Anchor `^` in unexpected position
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

## RuleId[id=RegExpRepeatedSpace]
### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `fieldName` declared in one 'switch' branch and used in another
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
              nullSafe);
        case HAS_PROTO_FIELD:
          String fieldName = BuiltinMethod.getProtoFieldNameFromMethodCall(methodCallNode);
          FieldAccess fieldAccess =
              genCodeForMaybeUnion(
```

### SwitchStatementWithConfusingDeclaration
Local variable `fieldAccess` declared in one 'switch' branch and used in another
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
        case HAS_PROTO_FIELD:
          String fieldName = BuiltinMethod.getProtoFieldNameFromMethodCall(methodCallNode);
          FieldAccess fieldAccess =
              genCodeForMaybeUnion(
                  baseType,
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    if (hasJsType(descriptor)) {
      JSType jsType = getJsType(descriptor);
      if (jsType == JSType.JS_STRING) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
              // that statically because it isn't part of the signature.  We could potentially
              // break encapsulation for private templates.
              if (node instanceof CallNode) {
                return true;
              }
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
    protected void doGen(CodeBuilder adapter) {
      if (branch.brancher == NEVER) {
        if (branch.isNegated) {
          adapter.pushBoolean(true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/passes/ImportsPass.java`
#### Snippet
```java

    // Name collides with another import symbol.
    if (!file.getImportsContext().addImportedSymbol(importSymbolName)) {
      // Don't report here. A better error message is generated later in ResolveNamesPass.
      foundErrors = true;
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
      // Use the value that is explicitly set in template.
      return false;
    } else if (!contentKind.getSanitizedContentKind().isHtml()) {
      // Non-HTML templates couldn't be strictHtml.
      return false;
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
      return false;
    }
    if (fieldDescriptor.getOptions().hasJstype()) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
      Descriptors.FieldDescriptor conflictField =
          message.findFieldByName(field.getName() + "_count");
      if (conflictField != null && !conflictField.isRepeated()) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
          message.findFieldByName(
              field.getName().substring(0, field.getName().length() - "_count".length()));
      if (conflictField != null && conflictField.isRepeated()) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/conformance/BanXidForCssObfuscation.java`
#### Snippet
```java
        return true;
      }
      if (node instanceof HtmlAttributeNode
          && ((HtmlAttributeNode) node).definitelyMatchesAttributeName("class")) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    } else if (delimType() == AttributeEndDelimiter.SPACE_OR_TAG_END) {
      // Need ESCAPE_HTML_ATTRIBUTE_NOSPACE instead.
      if (mode == EscapingMode.ESCAPE_HTML
          || mode == EscapingMode.ESCAPE_HTML_ATTRIBUTE
          || mode == EscapingMode.ESCAPE_HTML_RCDATA) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'srcJarTarget'
in `java/src/com/google/template/soy/SoyToJbcSrcCompiler.java`
#### Snippet
```java
   *     be useful for enabling IDE debugging scenarios.
   */
  public static void compile(SoyFileSet sfs, ByteSink jarTarget, Optional<ByteSink> srcJarTarget) {
    // compileToJar disallows external calls so we don't need to enforce the external call
    // requirement here.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    private final Optional<FileSetMetadata> registry;

    private final Optional<CssRegistry> cssRegistry;

    static ParseResult create(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    static ParseResult create(
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      return new ParseResult(soyTree, registry, cssRegistry);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      return new ParseResult(soyTree, registry, cssRegistry);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java

    /** The TemplateRegistry, which is guaranteed to be present if the error reporter is empty. */
    private final Optional<FileSetMetadata> registry;

    private final Optional<CssRegistry> cssRegistry;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    ParseResult(
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
      this.registry = registry;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    public abstract Builder setTypeRegistry(SoyTypeRegistry typeRegistry);

    public abstract Builder setCssRegistry(Optional<CssRegistry> cssRegistry);

    public abstract SoyFileSetParser build();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fileJoiner'
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java

  private final String extension;
  private final Optional<Joiner> fileJoiner;

  PerInputOutputFiles(String extension, @Nullable Joiner fileJoiner) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'value'
in `java/src/com/google/template/soy/base/internal/SetOnce.java`
#### Snippet
```java
public final class SetOnce<T> {

  private Optional<T> value = Optional.empty();

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'srcJarTarget'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   * @throws SoyCompilationException If compilation fails.
   */
  void compileToJar(ByteSink jarTarget, Optional<ByteSink> srcJarTarget) {
    entryPointVoid(
        () -> {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private ImmutableList<File> pluginRuntimeJars = ImmutableList.of();

    private Optional<CssRegistry> cssRegistry = Optional.empty();

    private boolean skipPluginValidation = false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      boolean optimize,
      Set<SourceFilePath> generatedPathsToCheck,
      Optional<CssRegistry> cssRegistry,
      MethodChecker javaMethodChecker) {
    this.scopedData = apiCallScopeProvider;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  private final ValidatedConformanceConfig conformanceConfig;
  private final ImmutableList<File> pluginRuntimeJars;
  private final Optional<CssRegistry> cssRegistry;

  private final ImmutableList<SoyFunction> soyFunctions;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'placeholderExample'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPlaceholderPart.java`
#### Snippet
```java

  /** @param placeholderExample An optional example. */
  public SoyMsgPlaceholderPart(String placeholderName, Optional<String> placeholderExample) {
    this(MessagePlaceholder.Summary.create(checkNotNull(placeholderName), placeholderExample));
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'alternateId'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
  public static final class Builder {
    private long id;
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'snippet'
in `java/src/com/google/template/soy/error/SoyError.java`
#### Snippet
```java
      SoyErrorKind kind,
      String message,
      Optional<String> snippet,
      boolean isWarning) {
    return new AutoValue_SoyError(location, kind, message, snippet, isWarning);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, Path> inputToOutputFilePaths;

  private final Optional<Path> outputDirectoryFlag;

  /** The name of a manifest file to generate, or null. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java
      ImmutableMap<String, String> namespaceManifest,
      ImmutableMap<SourceFilePath, Path> inputToOutputFilePaths,
      Optional<Path> outputDirectoryFlag,
      String namespaceManifestFile) {
    this.runtimePath = runtimePath;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
      Map<SourceFilePath, String> soyNamespaces,
      Map<SourceFilePath, Path> inputToOutputPaths,
      Optional<Path> outputDirectoryFlag,
      ErrorReporter errorReporter) {
    Map<String, String> manifest = new HashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataType'
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  // This isn't a soyType to avoid triggering issues with strict deps and protos.  Not sure if that
  // makes sense though given imports.
  private final Optional<String> dataType;

  private VeType(Optional<String> dataType) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataType'
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  private final Optional<String> dataType;

  private VeType(Optional<String> dataType) {
    this.dataType = dataType;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'matchingEndTag'
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java

    static PlaceholderAndEndTag create(
        PlaceholderCompiler.Placeholder placeholder, Optional<String> matchingEndTag) {
      return new AutoValue_MsgCompiler_PlaceholderAndEndTag(
          placeholder.soyValueProvider(),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'restore'
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
  @AutoValue
  abstract static class ReattachState {
    static ReattachState create(Label reattachPoint, Optional<Statement> restore) {
      return new AutoValue_DetachState_ReattachState(reattachPoint, restore);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'elseBlock'
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java
   * if-elseif-else chain.
   */
  static Statement ifElseChain(final List<IfBlock> ifs, final Optional<Statement> elseBlock) {
    checkArgument(!ifs.isEmpty());
    return new Statement() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setRenderMethod(MethodRef value);

    abstract Builder setPositionalRenderMethod(Optional<MethodRef> value);

    abstract Builder setModifiableSelectMethod(Optional<MethodRef> value);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setTemplateMethod(MethodRef value);

    abstract Builder setDefaultModTemplateMethod(Optional<MethodRef> value);

    abstract Builder setTemplateType(TemplateType value);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setPositionalRenderMethod(Optional<MethodRef> value);

    abstract Builder setModifiableSelectMethod(Optional<MethodRef> value);

    abstract Builder setTemplateMethod(MethodRef value);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'paramsRecord'
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
  private static final class TemplateVariables implements TemplateParameterLookup {
    private final TemplateVariableManager variableSet;
    private final Optional<? extends Expression> paramsRecord;
    private final Expression ijRecord;
    private final RenderContextExpression renderContext;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramsRecord'
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    TemplateVariables(
        TemplateVariableManager variableSet,
        Optional<? extends Expression> paramsRecord,
        Expression ijRecord,
        RenderContextExpression renderContext) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'expression'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
  private Expression computeRangeValue(
      SyntheticVarName varName,
      Optional<ExprNode> expression,
      int defaultValue,
      Scope scope,
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for parameter 'explicit'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    static RecordOrPositional create(
        Supplier<Expression> record,
        Optional<ImmutableMap<CallParamNode, Supplier<Expression>>> explicit) {
      return new AutoValue_SoyNodeCompiler_RecordOrPositional(record, explicit);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'modName'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
    // If this is a deltemplate then delTemplateName will be present
    final Optional<String> delTemplateName;
    final Optional<String> modName;
    final String variant;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'positionalParameters'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
    // many of these fields should probably be only lazily calculated
    final ContentKind kind;
    final Optional<ImmutableList<String>> positionalParameters;
    final ImmutableSet<String> callees;
    final ImmutableSet<String> delCallees;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'delTemplateName'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java

    // If this is a deltemplate then delTemplateName will be present
    final Optional<String> delTemplateName;
    final Optional<String> modName;
    final String variant;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstVarInstruction'
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java

  /** Writes the value at the top of the stack to the local variable. */
  private Statement store(final Expression expr, final Optional<Label> firstVarInstruction) {
    expr.checkAssignableTo(resultType());
    return new Statement() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startLabel'
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
  private final Brancher brancher;
  private final Supplier<String> debugPrinter;
  private final Optional<Label> startLabel;

  private Branch(Expression.Features features, Brancher brancher, Supplier<String> debugPrinter) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'startLlabel'
in `java/src/com/google/template/soy/jbcsrc/restricted/Branch.java`
#### Snippet
```java
      Brancher brancher,
      Supplier<String> debugPrinter,
      Optional<Label> startLlabel) {
    this.isNegated = isNegated;
    this.features = features;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'replacements'
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java

    /** Tracks all the nodes that should replace the current node. */
    private Optional<ImmutableList<StandaloneNode>> replacements = Optional.empty();

    RewritingVisitor(IdGenerator idGenerator) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'first'
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
  }

  private boolean jsImplsEqual(Optional<JsImplNode> first, Optional<JsImplNode> second) {
    boolean moduleEquals = first.map(JsImplNode::module).equals(second.map(JsImplNode::module));
    boolean functionEquals =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'second'
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
  }

  private boolean jsImplsEqual(Optional<JsImplNode> first, Optional<JsImplNode> second) {
    boolean moduleEquals = first.map(JsImplNode::module).equals(second.map(JsImplNode::module));
    boolean functionEquals =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'condition'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      CallParamContentNode attributesNode,
      CallBasicNode call,
      Optional<ExprNode> condition) {
    SourceLocation unknown = attr.getSourceLocation().clearRange();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'conditional'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
  private static void maybePrintAttribute(
      CallParamContentNode attributesNode,
      Optional<ExprNode> conditional,
      IdGenerator nodeIdGen,
      HtmlAttributeNode attrNode) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'conditional'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      Map<String, AttrParam> attrs,
      @Nullable CallParamContentNode attributesNode,
      Optional<ExprNode> conditional) {
    if (c.getKind() == SoyNode.Kind.HTML_ATTRIBUTE_NODE) {
      HtmlAttributeNode attrNode = (HtmlAttributeNode) c;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'graphCursor'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java

  /** Pointer to where all new nodes are added in the graph. */
  private Optional<HtmlMatcherGraphNode> graphCursor = Optional.empty();

  private final ArrayDeque<Optional<HtmlMatcherGraphNode>> cursorStack = new ArrayDeque<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rootNode'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java
public final class HtmlMatcherGraph {

  private Optional<HtmlMatcherGraphNode> rootNode = Optional.empty();

  /** Pointer to where all new nodes are added in the graph. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'isInternallyBalancedForForeignContent'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
  private Optional<Boolean> isInternallyBalanced = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'isInternallyBalanced'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
  private Optional<Boolean> isInternallyBalanced = Optional.empty();

  public HtmlMatcherConditionNode(SoyNode soyNode, ExprNode expression, HtmlMatcherGraph graph) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    public Builder setCssRegistry(Optional<CssRegistry> registry) {
      this.cssRegistry = registry;
      return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
    private ErrorReporter errorReporter;
    private SoyGeneralOptions options;
    private Optional<CssRegistry> cssRegistry = Optional.empty();
    private boolean allowUnknownGlobals;
    private boolean allowUnknownJsGlobals;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeNode'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java

  private QueuedTask visit(
      Optional<HtmlMatcherGraphNode> maybeNode,
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'INVALID_NODE'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
  private static final String EXPECTED_TAG_NAME = "Expected an html tag name.";

  private static final Optional<HtmlTagNode> INVALID_NODE = Optional.empty();

  private final ErrorReporter errorReporter;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'index'
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java

  public static void checkMapFromListConstructorCondition(
      boolean condition, SoyValue list, OptionalInt index) {
    if (!condition) {
      String exceptionString =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'protoName'
in `java/src/com/google/template/soy/logging/LoggingConfigValidator.java`
#### Snippet
```java
        String name,
        long id,
        Optional<String> protoName,
        Optional<Object> metadata,
        SourceLocation sourceLocation) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metadata'
in `java/src/com/google/template/soy/logging/LoggingConfigValidator.java`
#### Snippet
```java
        long id,
        Optional<String> protoName,
        Optional<Object> metadata,
        SourceLocation sourceLocation) {
      return new AutoValue_LoggingConfigValidator_VisualElement(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
    }

    public static Summary create(String name, Optional<String> example) {
      return new AutoValue_MessagePlaceholder_Summary(name, example);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
      String userSuppliedName,
      SourceLocation userSuppliedNameLocation,
      Optional<String> example) {
    return new AutoValue_MessagePlaceholder(
        Summary.create(name, example),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
  }

  public static MessagePlaceholder create(String name, Optional<String> example) {
    return new AutoValue_MessagePlaceholder(
        Summary.create(name, example),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'requiredCssPath'
in `java/src/com/google/template/soy/soytree/ImportNode.java`
#### Snippet
```java
  private SoyType moduleType;

  private Optional<SoyFileNode.CssPath> requiredCssPath;

  /** Only Proto and CSS are supported right now. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'alternateIdAttribute'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The optional alternate id attribute to be used if a translation for the msg id is missing. */
  private final Optional<CommandTagAttribute> alternateIdAttribute;

  /** The optional alternate id value, to be used if a translation for the msg id is missing. */
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'alternateId'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The optional alternate id value, to be used if a translation for the msg id is missing. */
  private final OptionalLong alternateId;

  public MsgNode(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'commandChar'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
      int id,
      String rawText,
      Optional<CommandChar> commandChar,
      SourceLocation sourceLocation,
      @Nullable SourceOffsets offsets,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'commandChar'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java

  // For COMMAND_CHARACTER nodes only. The character this node represents (e.g. "{sp}" or "{nbsp}").
  private final Optional<CommandChar> commandChar;

  /** Whether this raw text was created from the {literal} command. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean desugarHtmlNodes = true;
  private boolean desugarIdomFeatures = true;
  private Optional<CssRegistry> cssRegistry = Optional.empty();
  // TODO(lukes): disabled for compatibility with unit tests.  Fix tests relying on the
  // escaper not running and enable by default.  This configuration bit only really exists
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'commaLocations'
in `java/src/com/google/template/soy/exprtree/ListLiteralNode.java`
#### Snippet
```java
public final class ListLiteralNode extends AbstractParentExprNode {

  private final Optional<ImmutableList<SourceLocation.Point>> commaLocations;

  /** @param items The expressions for the items in this list. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'onPass'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java

    final boolean result;
    final Optional<Runnable> onPass;

    CheckResult(boolean result, Optional<Runnable> onPass) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'onPass'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
    final Optional<Runnable> onPass;

    CheckResult(boolean result, Optional<Runnable> onPass) {
      this.result = result;
      this.onPass = checkNotNull(onPass);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'boundParams'
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

  private void visitCallNodeHelper(
      CallNode node, TemplateNode callee, Optional<SoyRecord> boundParams) {

    // ------ Build the call data. ------
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for parameter 'positionalParameters'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      CallNode callNode,
      TranslateExprNodeVisitor exprTranslator,
      Optional<Supplier<List<Expression>>> positionalParameters,
      Supplier<Expression> paramObject,
      boolean isIdomCall) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  FormattingContext enterCaseBody() {
    maybeIndent('\0');
    increaseIndent();
    endLine();
    curScope = new Scope(curScope, /* emitClosingBrace= */ false);
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    maybeIndent('\0');
    increaseIndent();
    endLine();
    curScope = new Scope(curScope, /* emitClosingBrace= */ false);
    return this;
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java

  void appendBlankLine() {
    endLine();
    append("\n");
    endLine();
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  void appendBlankLine() {
    endLine();
    append("\n");
    endLine();
  }
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    endLine();
    append("\n");
    endLine();
  }

```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
            BaseUtils.escapeToSoyString(s, formatOptions.htmlEscapeStrings(), QuoteStyle.BACKTICK);
        if (content.contains("\n")) {
          return noBreak().append(content);
        } else {
          return append(content);
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    maybeIndent('{');
    buf.append('{');
    increaseIndent();
    endLine();
    curScope = new Scope(curScope, /* emitClosingBrace= */ true);
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    buf.append('{');
    increaseIndent();
    endLine();
    curScope = new Scope(curScope, /* emitClosingBrace= */ true);
    return this;
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  FormattingContext appendAll(CodeChunk chunk) {
    appendInitialStatements(chunk);
    if (chunk instanceof Expression) {
      appendOutputExpression((Expression) chunk);
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    appendInitialStatements(chunk);
    if (chunk instanceof Expression) {
      appendOutputExpression((Expression) chunk);
      if (getCurrentLexicalState() == LexicalState.JS) {
        append(";");
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
      appendOutputExpression((Expression) chunk);
      if (getCurrentLexicalState() == LexicalState.JS) {
        append(";");
        endLine();
      }
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
      if (getCurrentLexicalState() == LexicalState.JS) {
        append(";");
        endLine();
      }
    } else if (chunk instanceof SpecialToken) {
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java

    if (endLine && !defer) {
      endLine();
    }
  }
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  public boolean commaAfterFirst(boolean first) {
    if (!first) {
      noBreak().append(", ");
    }
    return false;
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    boolean emitClosingBrace = curScope.emitClosingBrace;
    curScope = Preconditions.checkNotNull(curScope.parent);
    decreaseIndentLenient();
    endLine();
    if (emitClosingBrace) {
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    curScope = Preconditions.checkNotNull(curScope.parent);
    decreaseIndentLenient();
    endLine();
    if (emitClosingBrace) {
      append('}');
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    endLine();
    if (emitClosingBrace) {
      append('}');
    }
  }
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/Operation.java`
#### Snippet
```java
  @Override
  public final JsExpr singleExprOrName(FormatOptions formatOptions) {
    FormattingContext ctx = new FormattingContext(formatOptions);
    ctx.appendOutputExpression(this);
    return new JsExpr(ctx.toString(), precedence().toInt());
```

### AutoCloseableResource
'FormattingContext' used without 'try'-with-resources statement
in `java/src/com/google/template/soy/jssrc/dsl/CodeChunk.java`
#### Snippet
```java
   */
  public final String getCode(FormatOptions formatOptions) {
    FormattingContext initialStatements = new FormattingContext(formatOptions);
    initialStatements.appendInitialStatements(this);

```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
public class GenJsCodeVisitorAssistantForMsgs extends AbstractReturningSoyNodeVisitor<Statement> {

  private static final Pattern LINE_BOUNDARY_PATTERN = Pattern.compile("\\s*?(\\n|\\r)\\s*");
  /** Regex pattern for an underscore-number suffix. */
  private static final Pattern UNDERSCORE_NUMBER_SUFFIX = Pattern.compile("_[0-9]+$");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  // Note that the first set of whitespace is reluctant.
  private static final Pattern LINE_BOUNDARY_PATTERN = Pattern.compile("\\s*?(\\n|\\r)\\s*");

  /** We don't use different content types. It may be a historical artifact in the TC. */
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `tag` to `HtmlOpenTagNode` is redundant
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
                        createSuffix(
                            tag instanceof HtmlOpenTagNode
                                    && ((HtmlOpenTagNode) tag).isSelfClosing()
                                ? (needsSpaceSelfClosingTag ? " />" : "/>")
                                : ">",
```

### RedundantCast
Casting `node` to `ParentSoyNode` is redundant
in `java/src/com/google/template/soy/passes/IncrementalDomKeysPass.java`
#### Snippet
```java
      var oldMustEmitKeyNodes = mustEmitKeyNodes;
      mustEmitKeyNodes = true;
      visitChildren((ParentSoyNode) node);
      mustEmitKeyNodes = oldMustEmitKeyNodes;
    }
```

### RedundantCast
Casting `node` to `ParentSoyNode` is redundant
in `java/src/com/google/template/soy/passes/IncrementalDomKeysPass.java`
#### Snippet
```java
      // rendered.
      mustEmitKeyNodes = true;
      visitChildren((ParentSoyNode) node);
    }

```

### RedundantCast
Casting `tagNode` to `HtmlOpenTagNode` is redundant
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java
      lcTagName = "/" + lcTagName;
    } else if (tagNode instanceof HtmlOpenTagNode) {
      isSelfEnding = ((HtmlOpenTagNode) tagNode).isSelfClosing();
    }

```

### RedundantCast
Casting `tag` to `HtmlOpenTagNode` is redundant
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
      Context oldContext = context;
      boolean isSelfClosing =
          tag instanceof HtmlOpenTagNode && ((HtmlOpenTagNode) tag).isSelfClosing();
      context =
          context.transitionToState(
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `java/src/com/google/template/soy/data/SoyTemplateParam.java`
#### Snippet
```java
   * must be set for {@link SoyTemplate.Builder#build} to succeed.
   *
   * <p>If a parameter is indirect then {@link #isRequired} may return `true`. But missing indirect
   * parameters never cause {@link SoyTemplate.Builder#build} to fail.
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `java/src/com/google/template/soy/data/SoyValue.java`
#### Snippet
```java
   *
   * @param appendable The appendable to render to.
   * @throws IOException
   */
  void render(Appendable appendable) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `java/src/com/google/template/soy/data/SoyValue.java`
#### Snippet
```java
   *
   * @param appendable The appendable to render to.
   * @throws IOException
   */
  void render(LoggingAdvisingAppendable appendable) throws IOException;
```

### JavadocDeclaration
`@param kytheCorpus` tag description is missing
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   *
   * @param javaPackage The Java package for the generated classes.
   * @param kytheCorpus
   * @param javaClassNameSource Source of the generated class names. Must be one of "filename",
   *     "namespace", or "generic".
```

### JavadocDeclaration
`@param experimentalFeatures` tag description is missing
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
     * Sets experimental features. These features are unreleased and are not generally available.
     *
     * @param experimentalFeatures
     * @return This builder.
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
  }

  /** Returns an expression with the result of {@link AppendableExpression#softLimitReached}. */
  Expression softLimitReached() {
    checkArgument(supportsSoftLimiting);
```

### JavadocDeclaration
`@throws` tag description is missing
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
     * The final value of the rendering operation.
     *
     * @throws IllegalStateException
     */
    T get();
```

### JavadocDeclaration
Duplicate @param tag for parameter 'externName'
in `java/src/com/google/template/soy/jbcsrc/shared/ClassLoaderFallbackCallFactory.java`
#### Snippet
```java
   *     of the extern function
   * @param externName the name of the class that defines the extern
   * @param externName the name of the extern
   */
  public static CallSite bootstrapExternCall(
```

### JavadocDeclaration
Javadoc pointing to itself
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyRuntimeType.java`
#### Snippet
```java
   * <em>not</em> a string, just that it is not <em>known</em> to be a string at compile time. For
   * example, {@code $b ? 'hello' : 2} is a valid soy expression that will be typed as 'any' at
   * compile time. So {@link #isKnownString()} on that soy expression will return false even though
   * it may in fact be a string.
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `sourceLocaleString` may be 'final'
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
    usage = "The locale string of the source language (default 'en')."
  )
  private String sourceLocaleString = "en";

  @Option(
```

### FieldMayBeFinal
Field `messagePlugin` may be 'final'
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
            + "com.google.template.soy.xliffmsgplugin.XliffMsgPlugin."
  )
  private SoyMsgPlugin messagePlugin = new XliffMsgPlugin();

  /**
```

### FieldMayBeFinal
Field `targetLocaleString` may be 'final'
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
            + " value will be ignored by the message plugin)."
  )
  private String targetLocaleString = "";

  @Option(
```

### FieldMayBeFinal
Field `conformanceConfigs` may be 'final'
in `java/src/com/google/template/soy/SoyConformanceChecker.java`
#### Snippet
```java
      usage = "Location of conformance config protos in text proto format.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> conformanceConfigs = new ArrayList<>();

  SoyConformanceChecker(PluginLoader loader, SoyInputCache cache) {
```

### FieldMayBeFinal
Field `googMsgsAreExternal` may be 'final'
in `java/src/com/google/template/soy/SoyToIncrementalDomSrcCompiler.java`
#### Snippet
```java
              + " will end up with two separate and possibly different sets of translations"
              + " for your messages.")
  private boolean googMsgsAreExternal = false;

  private final PerInputOutputFiles outputFiles =
```

### FieldMayBeFinal
Field `dependOnCssHeader` may be 'final'
in `java/src/com/google/template/soy/SoyToIncrementalDomSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated GSS header file.")
  private boolean dependOnCssHeader = false;

  @Option(
```

### FieldMayBeFinal
Field `templateCallMetadataOutput` may be 'final'
in `java/src/com/google/template/soy/SoyHeaderCompiler.java`
#### Snippet
```java
          "Where to write metadata about the template calls.  This will be a file containing"
              + " a gzipped TemplateCallMetadata proto")
  private File templateCallMetadataOutput = null;

  SoyHeaderCompiler(PluginLoader loader, SoyInputCache cache) {
```

### FieldMayBeFinal
Field `cssMetadataOutput` may be 'final'
in `java/src/com/google/template/soy/SoyHeaderCompiler.java`
#### Snippet
```java
          "Where to write metadata about CSS.  This will be a file containing a gzipped"
              + " CssMetadata proto")
  private File cssMetadataOutput = null;

  @Option(
```

### FieldMayBeFinal
Field `generateBuilders` may be 'final'
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
              + " (FooTemplates.java). If false, generates the old FooSoyInfo.java files"
              + " instead.")
  private boolean generateBuilders = false;

  @Option(
```

### FieldMayBeFinal
Field `javaClassNameSource` may be 'final'
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
              + " CccDddSoyInfo (note it only uses the last part of the namespace). Option"
              + " \"generic\" generates class names such as File1SoyInfo, File2SoyInfo.")
  private String javaClassNameSource = "";

  SoyParseInfoGenerator(PluginLoader loader, SoyInputCache cache) {
```

### FieldMayBeFinal
Field `kytheCorpus` may be 'final'
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
          "[Optional] The value to use for the Kythe corpus of GeneratedCodeInfo metadata. If empty"
              + " GeneratedCodeInfo will not be added to the output.")
  private String kytheCorpus = "";

  @Option(
```

### FieldMayBeFinal
Field `outputDirectory` may be 'final'
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
              + " at this location, they will be overwritten. Either --outputDirectory or"
              + " --outputJar must be set.")
  private String outputDirectory = "";

  @Option(
```

### FieldMayBeFinal
Field `bidiIsRtlFn` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " your Soy code uses bidi functions/directives."
  )
  private String bidiIsRtlFn = "";

  @Option(
```

### FieldMayBeFinal
Field `runtimePath` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
          "[Required] The module path used to find the python runtime libraries. This"
              + " should be in dot notation format.")
  private String runtimePath = "";

  @Option(
```

### FieldMayBeFinal
Field `namespaceManifestPaths` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
              + " drastically improving runtime performance.",
      handler = SoyCmdLineParser.StringListOptionHandler.class)
  private List<String> namespaceManifestPaths = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `translationClass` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " It is required for {msg} command."
  )
  private String translationClass = "";

  @Option(
```

### FieldMayBeFinal
Field `environmentModulePath` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " module must implement all functions of the environment module if provided."
  )
  private String environmentModulePath = "";

  @Option(
```

### FieldMayBeFinal
Field `outputNamespaceManifest` may be 'final'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " to write. Default is to not write this file."
  )
  private String outputNamespaceManifest = null;

  private final PerInputOutputFiles outputFiles = new PerInputOutputFiles("py");
```

### FieldMayBeFinal
Field `validateJavaImpls` may be 'final'
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
      required = false,
      usage = "[Optional] Whether to validate the plugin's Java implementations.")
  private boolean validateJavaImpls = true;

  @Option(
```

### FieldMayBeFinal
Field `inputRoots` may be 'final'
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
              + "are transformed into output paths.  See --outputDirectory for more information.",
      handler = SoyCmdLineParser.PathListOptionHandler.class)
  private List<Path> inputRoots = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `outputExtension` may be 'final'
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java

  @Option(name = "--outputExtension", usage = "File extension for output files.")
  private String outputExtension = null;

  private final String extension;
```

### FieldMayBeFinal
Field `bidiGlobalDir` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " necessary if a message file is provided, because by default the bidi global"
              + " directionality is simply inferred from the message file.")
  private int bidiGlobalDir = 0;

  @Option(
```

### FieldMayBeFinal
Field `shouldGenerateGoogMsgDefs` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " --bidiGlobalDir, or --useGoogIsRtlForBidiGlobalDir, usually the latter."
              + " Also see --googMsgsAreExternal.")
  private boolean shouldGenerateGoogMsgDefs = false;

  @Option(
```

### FieldMayBeFinal
Field `googMsgsAreExternal` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " will end up with two separate and possibly different sets of translations"
              + " for your messages.")
  private boolean googMsgsAreExternal = false;

  @Option(
```

### FieldMayBeFinal
Field `messagePlugin` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
          "Specifies the full class name of a SoyMsgPlugin. If not specified, the default is"
              + " com.google.template.soy.xliffmsgplugin.XliffMsgPlugin. ")
  private SoyMsgPlugin messagePlugin = new XliffMsgPlugin();

  private final PerInputOutputFiles outputFiles =
```

### FieldMayBeFinal
Field `useGoogIsRtlForBidiGlobalDir` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " Whether to determine the bidi global direction at template runtime by"
              + " evaluating (goog.i18n.bidi.IS_RTL). Do not combine with --bidiGlobalDir.")
  private boolean useGoogIsRtlForBidiGlobalDir = false;

  @Option(
```

### FieldMayBeFinal
Field `dependOnCssHeader` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated CSS header file.")
  private boolean dependOnCssHeader = false;

  @Option(
```

### FieldMayBeFinal
Field `messageFilePathFormat` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " into underscore, e.g. pt-BR becomes pt_br. The format string must end with"
              + " an extension matching the message file format (case-insensitive).")
  private String messageFilePathFormat = "";

  @Option(
```

### FieldMayBeFinal
Field `locales` may be 'final'
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " combination of input Soy file and locale.",
      handler = SoyCmdLineParser.StringListOptionHandler.class)
  private List<String> locales = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `protoDescDirectDeps` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " files in this compilation unit must be listed here.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> protoDescDirectDeps = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `pluginModules` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " print directive plugins (comma-delimited list).",
      handler = SoyCmdLineParser.ModuleListOptionHandler.class)
  private List<Module> pluginModules = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `skipCssReferenceCheck` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      name = "--skip_css_reference_check",
      usage = "Whether to skip the go/css-conformance#css-reference-checks.")
  private boolean skipCssReferenceCheck = false;

  @Option(
```

### FieldMayBeFinal
Field `disableOptimizer` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "the performance in general. "
              + "This flag should only be set in integration test environment.")
  private boolean disableOptimizer = false;

  @Option(
```

### FieldMayBeFinal
Field `javaDeps` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " references.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> javaDeps = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `indirectDepHeaders` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "Used by the compiler for typechecking and call analysis.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> indirectDepHeaders = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `arguments` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java

  /** The remaining arguments after parsing command-line flags. */
  @Argument private List<String> arguments = new ArrayList<>();

  protected final SoyCompilerFileReader soyCompilerFileReader;
```

### FieldMayBeFinal
Field `allowUnblessedGeneratedFiles` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      name = "--allow_unblessed_generated_files",
      usage = "Whether to allow generated source files without the blessed comment.")
  private boolean allowUnblessedGeneratedFiles = true;

  @Option(
```

### FieldMayBeFinal
Field `generatedFiles` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      usage = "A map of generated files that map back to their short name",
      handler = SoyCmdLineParser.StringStringMapHandler.class)
  private Map<String, String> generatedFiles = new HashMap<>();

  @Option(
```

### FieldMayBeFinal
Field `protoDescIndirectDeps` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " transitive dependencies of the files passed to --directProtoDeps.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> protoDescIndirectDeps = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `sourceFunctions` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " in the form //target1=pkg.Class1,pkg.Class2,...;//target2=...",
      handler = SoyCmdLineParser.SourceFunctionListOptionHandler.class)
  private ListMultimap<String, SoySourceFunction> sourceFunctions = ArrayListMultimap.create();

  @Option(
```

### FieldMayBeFinal
Field `cssMetadata` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " calls.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> cssMetadata = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `depHeaders` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " analysis/checking..",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> depHeaders = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `experimentalFeatures` may be 'final'
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "experiments on. Please proceed with caution at your own risk.",
      handler = SoyCmdLineParser.StringListOptionHandler.class)
  private List<String> experimentalFeatures = new ArrayList<>();

  @Option(
```

### FieldMayBeFinal
Field `isMutable` may be 'final'
in `java/src/com/google/template/soy/data/internal/EasyListImpl.java`
#### Snippet
```java

  /** Whether this instance is still mutable (immutability cannot be undone, of course). */
  private boolean isMutable;

  /** Important: Do not use outside of Soy code (treat as superpackage-private). */
```

### FieldMayBeFinal
Field `expectedContentKind` may be 'final'
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
    private SoyCssRenamingMap cssRenamingMap;
    private Predicate<String> activeModNames;
    private SanitizedContent.ContentKind expectedContentKind;
    private boolean debugSoyTemplateInfo;
    private Map<String, ? extends Supplier<Object>> perRenderPluginInstances;
```

### FieldMayBeFinal
Field `interfaces` may be 'final'
in `java/src/com/google/template/soy/jbcsrc/internal/SoyClassWriter.java`
#### Snippet
```java
    private int access = Opcodes.ACC_FINAL | Opcodes.ACC_SUPER;
    private TypeInfo baseClass = OBJECT;
    private List<String> interfaces = new ArrayList<>();
    private String fileName; // optional

```

### FieldMayBeFinal
Field `errorReporter` may be 'final'
in `java/src/com/google/template/soy/passes/TemplateCallMetadataPass.java`
#### Snippet
```java
final class TemplateCallMetadataPass implements CompilerFileSetPass {

  private ErrorReporter errorReporter;

  TemplateCallMetadataPass(ErrorReporter errorReporter) {
```

### FieldMayBeFinal
Field `inputs` may be 'final'
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java

  /** JavaScript source files that use the generated helper functions. */
  private List<FileRef> inputs = Lists.newArrayList();

  /** A file which receives the JavaScript source from the inputs and the generated helpers. */
```

### FieldMayBeFinal
Field `soyPrintDirectives` may be 'final'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
  private ImmutableList.Builder<SoySourceFunction> soyMethods;
```

### FieldMayBeFinal
Field `astCache` may be 'final'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, SoyFileSupplier> soyFileSuppliers;
  private SoyTypeRegistry typeRegistry = SoyTypeRegistryBuilder.create();
  @Nullable private SoyAstCache astCache = null;
  private ErrorReporter errorReporter = ErrorReporter.exploding(); // See #parse for discussion.
  private boolean allowUnboundGlobals;
```

### FieldMayBeFinal
Field `soyFunctions` may be 'final'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean runOptimizer = false;
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
```

### FieldMayBeFinal
Field `sourceFunctions` may be 'final'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private ImmutableList.Builder<SoyFunction> soyFunctions;
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
  private ImmutableList.Builder<SoySourceFunction> soyMethods;
  private ImmutableList<CompilationUnitAndKind> compilationUnits;
```

### FieldMayBeFinal
Field `soyMethods` may be 'final'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private ImmutableList.Builder<SoyPrintDirective> soyPrintDirectives;
  private ImmutableList.Builder<SoySourceFunctionDescriptor> sourceFunctions;
  private ImmutableList.Builder<SoySourceFunction> soyMethods;
  private ImmutableList<CompilationUnitAndKind> compilationUnits;
  private SoyGeneralOptions options = new SoyGeneralOptions();
```

### FieldMayBeFinal
Field `locale` may be 'final'
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            + " messages from the Soy source will be used."
  )
  private String locale = "";

  /** Counter for the number of examples written so far. */
```

### FieldMayBeFinal
Field `paramFields` may be 'final'
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
  private SoyFileNodeTransformer.FileInfo builderReport;

  private Set<String> paramFields = new HashSet<>();

  /**
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/src/com/google/template/soy/passes/MsgWithIdFunctionPass.java`
#### Snippet
```java
      for (SoyNode child : letNode.getChildren()) {
        if (child instanceof RawTextNode && ((RawTextNode) child).getRawText().isEmpty()) {
          continue;
        } else if (child instanceof MsgFallbackGroupNode) {
          if (fallbackGroupNode == null) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
    for (int i = 0; i < attrValue.numChildren(); i++) {
      if (attrValue.getChild(i) instanceof RawTextNode) {
        continue;
      } else if (attrValue.getChild(i) instanceof PrintNode) {
        PrintNode n = (PrintNode) attrValue.getChild(i);
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\t", "\\t")
            .replace("\u0000", "\\u0000")
            .replace("\u0020", "\\u0020")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1234` can be replaced with 'ሴ'
in `java/src/com/google/template/soy/jssrc/restricted/JsExprUtils.java`
#### Snippet
```java
      if (c == '\\') {
        // We do not bother skipping through the whole escape if it takes up more than one character
        // beyond the backslash, e.g. \u1234 or \123 or \x12, since none of such escapes' characters
        // can be an apostrophe, which is all we really care about. Nor do we check that the escape
        // doesn't include the final apostrophe, since that would mean the JS expression is invalid.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u07FF` can be replaced with '߿'
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
      if (c >= '\001' && c <= '\177') {
        charBytes = 1;
      } else if (c > '\u07FF') {
        charBytes = 3;
      } else {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0009` can be replaced with a tab character
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // Escape all ASCII control characters.
          .escapeAll("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007")
          .escapeAll("\u0008\u0009\n\u000B\u000C\r\u000E\u000F")
          .escapeAll("\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017")
          .escapeAll("\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F")
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFF1A` can be replaced with '：'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // as the ASCII version so that URLs copied and pasted from written Chinese work.
          // Each Latin printable character has a full-width equivalent in the U+FF00 code plane,
          // e.g. the full-width colon is \uFF1A.
          // http://www.cisco.com/en/US/products/products_security_response09186a008083f82e.html
          // says that it is possible to route malicious URLs through intervening layers to the
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0009` can be replaced with a tab character
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // We supplement that set with the quotes and equal sign which have special
          // meanings in attributes, and with the XML normalized spaces.
          .escapeAll("\u0000\u0009\n\u000B\u000C\r '-/=\u0060\u0085\u00a0\u2028\u2029")
          .build();
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0060` can be replaced with '\`'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // We supplement that set with the quotes and equal sign which have special
          // meanings in attributes, and with the XML normalized spaces.
          .escapeAll("\u0000\u0009\n\u000B\u000C\r '-/=\u0060\u0085\u00a0\u2028\u2029")
          .build();
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05E9` can be replaced with 'ש'
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    1973,
                    DemoBidiSupportSoyTemplateInfo.KEYWORDS,
                    ImmutableList.of("Bi(Di)", "2008 (\u05E9\u05E0\u05D4)", "2008 (year)")))
            .setMsgBundle(msgBundle)
            .render());
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05E0` can be replaced with 'נ'
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    1973,
                    DemoBidiSupportSoyTemplateInfo.KEYWORDS,
                    ImmutableList.of("Bi(Di)", "2008 (\u05E9\u05E0\u05D4)", "2008 (year)")))
            .setMsgBundle(msgBundle)
            .render());
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05D4` can be replaced with 'ה'
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
                    1973,
                    DemoBidiSupportSoyTemplateInfo.KEYWORDS,
                    ImmutableList.of("Bi(Di)", "2008 (\u05E9\u05E0\u05D4)", "2008 (year)")))
            .setMsgBundle(msgBundle)
            .render());
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A1` can be replaced with '¡'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&gt;", (int) '>')
          .put("&nbsp;", (int) '\u00A0')
          .put("&iexcl;", (int) '\u00A1')
          .put("&cent;", (int) '\u00A2')
          .put("&pound;", (int) '\u00A3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A2` can be replaced with '¢'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&nbsp;", (int) '\u00A0')
          .put("&iexcl;", (int) '\u00A1')
          .put("&cent;", (int) '\u00A2')
          .put("&pound;", (int) '\u00A3')
          .put("&curren;", (int) '\u00A4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A3` can be replaced with '£'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&iexcl;", (int) '\u00A1')
          .put("&cent;", (int) '\u00A2')
          .put("&pound;", (int) '\u00A3')
          .put("&curren;", (int) '\u00A4')
          .put("&yen;", (int) '\u00A5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A4` can be replaced with '¤'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&cent;", (int) '\u00A2')
          .put("&pound;", (int) '\u00A3')
          .put("&curren;", (int) '\u00A4')
          .put("&yen;", (int) '\u00A5')
          .put("&brvbar;", (int) '\u00A6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A5` can be replaced with '¥'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&pound;", (int) '\u00A3')
          .put("&curren;", (int) '\u00A4')
          .put("&yen;", (int) '\u00A5')
          .put("&brvbar;", (int) '\u00A6')
          .put("&sect;", (int) '\u00A7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A6` can be replaced with '¦'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&curren;", (int) '\u00A4')
          .put("&yen;", (int) '\u00A5')
          .put("&brvbar;", (int) '\u00A6')
          .put("&sect;", (int) '\u00A7')
          .put("&uml;", (int) '\u00A8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A7` can be replaced with '§'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&yen;", (int) '\u00A5')
          .put("&brvbar;", (int) '\u00A6')
          .put("&sect;", (int) '\u00A7')
          .put("&uml;", (int) '\u00A8')
          .put("&copy;", (int) '\u00A9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A8` can be replaced with '¨'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&brvbar;", (int) '\u00A6')
          .put("&sect;", (int) '\u00A7')
          .put("&uml;", (int) '\u00A8')
          .put("&copy;", (int) '\u00A9')
          .put("&ordf;", (int) '\u00AA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A9` can be replaced with '©'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sect;", (int) '\u00A7')
          .put("&uml;", (int) '\u00A8')
          .put("&copy;", (int) '\u00A9')
          .put("&ordf;", (int) '\u00AA')
          .put("&laquo;", (int) '\u00AB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AA` can be replaced with 'ª'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&uml;", (int) '\u00A8')
          .put("&copy;", (int) '\u00A9')
          .put("&ordf;", (int) '\u00AA')
          .put("&laquo;", (int) '\u00AB')
          .put("&not;", (int) '\u00AC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AB` can be replaced with '\<\<'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&copy;", (int) '\u00A9')
          .put("&ordf;", (int) '\u00AA')
          .put("&laquo;", (int) '\u00AB')
          .put("&not;", (int) '\u00AC')
          .put("&shy;", (int) '\u00AD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AC` can be replaced with '¬'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ordf;", (int) '\u00AA')
          .put("&laquo;", (int) '\u00AB')
          .put("&not;", (int) '\u00AC')
          .put("&shy;", (int) '\u00AD')
          .put("&reg;", (int) '\u00AE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AE` can be replaced with '®'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&not;", (int) '\u00AC')
          .put("&shy;", (int) '\u00AD')
          .put("&reg;", (int) '\u00AE')
          .put("&macr;", (int) '\u00AF')
          .put("&deg;", (int) '\u00B0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AF` can be replaced with '¯'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&shy;", (int) '\u00AD')
          .put("&reg;", (int) '\u00AE')
          .put("&macr;", (int) '\u00AF')
          .put("&deg;", (int) '\u00B0')
          .put("&plusmn;", (int) '\u00B1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B0` can be replaced with '°'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&reg;", (int) '\u00AE')
          .put("&macr;", (int) '\u00AF')
          .put("&deg;", (int) '\u00B0')
          .put("&plusmn;", (int) '\u00B1')
          .put("&sup2;", (int) '\u00B2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B1` can be replaced with '±'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&macr;", (int) '\u00AF')
          .put("&deg;", (int) '\u00B0')
          .put("&plusmn;", (int) '\u00B1')
          .put("&sup2;", (int) '\u00B2')
          .put("&sup3;", (int) '\u00B3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B2` can be replaced with '²'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&deg;", (int) '\u00B0')
          .put("&plusmn;", (int) '\u00B1')
          .put("&sup2;", (int) '\u00B2')
          .put("&sup3;", (int) '\u00B3')
          .put("&acute;", (int) '\u00B4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B3` can be replaced with '³'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&plusmn;", (int) '\u00B1')
          .put("&sup2;", (int) '\u00B2')
          .put("&sup3;", (int) '\u00B3')
          .put("&acute;", (int) '\u00B4')
          .put("&micro;", (int) '\u00B5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B4` can be replaced with '´'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sup2;", (int) '\u00B2')
          .put("&sup3;", (int) '\u00B3')
          .put("&acute;", (int) '\u00B4')
          .put("&micro;", (int) '\u00B5')
          .put("&para;", (int) '\u00B6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B5` can be replaced with 'µ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sup3;", (int) '\u00B3')
          .put("&acute;", (int) '\u00B4')
          .put("&micro;", (int) '\u00B5')
          .put("&para;", (int) '\u00B6')
          .put("&middot;", (int) '\u00B7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B6` can be replaced with '¶'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&acute;", (int) '\u00B4')
          .put("&micro;", (int) '\u00B5')
          .put("&para;", (int) '\u00B6')
          .put("&middot;", (int) '\u00B7')
          .put("&cedil;", (int) '\u00B8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B7` can be replaced with '·'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&micro;", (int) '\u00B5')
          .put("&para;", (int) '\u00B6')
          .put("&middot;", (int) '\u00B7')
          .put("&cedil;", (int) '\u00B8')
          .put("&sup1;", (int) '\u00B9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B8` can be replaced with '¸'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&para;", (int) '\u00B6')
          .put("&middot;", (int) '\u00B7')
          .put("&cedil;", (int) '\u00B8')
          .put("&sup1;", (int) '\u00B9')
          .put("&ordm;", (int) '\u00BA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B9` can be replaced with '¹'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&middot;", (int) '\u00B7')
          .put("&cedil;", (int) '\u00B8')
          .put("&sup1;", (int) '\u00B9')
          .put("&ordm;", (int) '\u00BA')
          .put("&raquo;", (int) '\u00BB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BA` can be replaced with 'º'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&cedil;", (int) '\u00B8')
          .put("&sup1;", (int) '\u00B9')
          .put("&ordm;", (int) '\u00BA')
          .put("&raquo;", (int) '\u00BB')
          .put("&frac14;", (int) '\u00BC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BB` can be replaced with '\>\>'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sup1;", (int) '\u00B9')
          .put("&ordm;", (int) '\u00BA')
          .put("&raquo;", (int) '\u00BB')
          .put("&frac14;", (int) '\u00BC')
          .put("&frac12;", (int) '\u00BD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BC` can be replaced with '¼'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ordm;", (int) '\u00BA')
          .put("&raquo;", (int) '\u00BB')
          .put("&frac14;", (int) '\u00BC')
          .put("&frac12;", (int) '\u00BD')
          .put("&frac34;", (int) '\u00BE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BD` can be replaced with '½'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&raquo;", (int) '\u00BB')
          .put("&frac14;", (int) '\u00BC')
          .put("&frac12;", (int) '\u00BD')
          .put("&frac34;", (int) '\u00BE')
          .put("&iquest;", (int) '\u00BF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BE` can be replaced with '¾'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&frac14;", (int) '\u00BC')
          .put("&frac12;", (int) '\u00BD')
          .put("&frac34;", (int) '\u00BE')
          .put("&iquest;", (int) '\u00BF')
          .put("&Agrave;", (int) '\u00C0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BF` can be replaced with '¿'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&frac12;", (int) '\u00BD')
          .put("&frac34;", (int) '\u00BE')
          .put("&iquest;", (int) '\u00BF')
          .put("&Agrave;", (int) '\u00C0')
          .put("&Aacute;", (int) '\u00C1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C0` can be replaced with 'À'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&frac34;", (int) '\u00BE')
          .put("&iquest;", (int) '\u00BF')
          .put("&Agrave;", (int) '\u00C0')
          .put("&Aacute;", (int) '\u00C1')
          .put("&Acirc;", (int) '\u00C2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C1` can be replaced with 'Á'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&iquest;", (int) '\u00BF')
          .put("&Agrave;", (int) '\u00C0')
          .put("&Aacute;", (int) '\u00C1')
          .put("&Acirc;", (int) '\u00C2')
          .put("&Atilde;", (int) '\u00C3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C2` can be replaced with 'Â'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Agrave;", (int) '\u00C0')
          .put("&Aacute;", (int) '\u00C1')
          .put("&Acirc;", (int) '\u00C2')
          .put("&Atilde;", (int) '\u00C3')
          .put("&Auml;", (int) '\u00C4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C3` can be replaced with 'Ã'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Aacute;", (int) '\u00C1')
          .put("&Acirc;", (int) '\u00C2')
          .put("&Atilde;", (int) '\u00C3')
          .put("&Auml;", (int) '\u00C4')
          .put("&Aring;", (int) '\u00C5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C4` can be replaced with 'Ä'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Acirc;", (int) '\u00C2')
          .put("&Atilde;", (int) '\u00C3')
          .put("&Auml;", (int) '\u00C4')
          .put("&Aring;", (int) '\u00C5')
          .put("&AElig;", (int) '\u00C6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C5` can be replaced with 'Å'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Atilde;", (int) '\u00C3')
          .put("&Auml;", (int) '\u00C4')
          .put("&Aring;", (int) '\u00C5')
          .put("&AElig;", (int) '\u00C6')
          .put("&Ccedil;", (int) '\u00C7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C6` can be replaced with 'Æ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Auml;", (int) '\u00C4')
          .put("&Aring;", (int) '\u00C5')
          .put("&AElig;", (int) '\u00C6')
          .put("&Ccedil;", (int) '\u00C7')
          .put("&Egrave;", (int) '\u00C8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C7` can be replaced with 'Ç'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Aring;", (int) '\u00C5')
          .put("&AElig;", (int) '\u00C6')
          .put("&Ccedil;", (int) '\u00C7')
          .put("&Egrave;", (int) '\u00C8')
          .put("&Eacute;", (int) '\u00C9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C8` can be replaced with 'È'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&AElig;", (int) '\u00C6')
          .put("&Ccedil;", (int) '\u00C7')
          .put("&Egrave;", (int) '\u00C8')
          .put("&Eacute;", (int) '\u00C9')
          .put("&Ecirc;", (int) '\u00CA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C9` can be replaced with 'É'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ccedil;", (int) '\u00C7')
          .put("&Egrave;", (int) '\u00C8')
          .put("&Eacute;", (int) '\u00C9')
          .put("&Ecirc;", (int) '\u00CA')
          .put("&Euml;", (int) '\u00CB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CA` can be replaced with 'Ê'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Egrave;", (int) '\u00C8')
          .put("&Eacute;", (int) '\u00C9')
          .put("&Ecirc;", (int) '\u00CA')
          .put("&Euml;", (int) '\u00CB')
          .put("&Igrave;", (int) '\u00CC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CB` can be replaced with 'Ë'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Eacute;", (int) '\u00C9')
          .put("&Ecirc;", (int) '\u00CA')
          .put("&Euml;", (int) '\u00CB')
          .put("&Igrave;", (int) '\u00CC')
          .put("&Iacute;", (int) '\u00CD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CC` can be replaced with 'Ì'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ecirc;", (int) '\u00CA')
          .put("&Euml;", (int) '\u00CB')
          .put("&Igrave;", (int) '\u00CC')
          .put("&Iacute;", (int) '\u00CD')
          .put("&Icirc;", (int) '\u00CE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CD` can be replaced with 'Í'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Euml;", (int) '\u00CB')
          .put("&Igrave;", (int) '\u00CC')
          .put("&Iacute;", (int) '\u00CD')
          .put("&Icirc;", (int) '\u00CE')
          .put("&Iuml;", (int) '\u00CF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CE` can be replaced with 'Î'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Igrave;", (int) '\u00CC')
          .put("&Iacute;", (int) '\u00CD')
          .put("&Icirc;", (int) '\u00CE')
          .put("&Iuml;", (int) '\u00CF')
          .put("&ETH;", (int) '\u00D0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CF` can be replaced with 'Ï'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Iacute;", (int) '\u00CD')
          .put("&Icirc;", (int) '\u00CE')
          .put("&Iuml;", (int) '\u00CF')
          .put("&ETH;", (int) '\u00D0')
          .put("&Ntilde;", (int) '\u00D1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D0` can be replaced with 'Ð'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Icirc;", (int) '\u00CE')
          .put("&Iuml;", (int) '\u00CF')
          .put("&ETH;", (int) '\u00D0')
          .put("&Ntilde;", (int) '\u00D1')
          .put("&Ograve;", (int) '\u00D2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D1` can be replaced with 'Ñ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Iuml;", (int) '\u00CF')
          .put("&ETH;", (int) '\u00D0')
          .put("&Ntilde;", (int) '\u00D1')
          .put("&Ograve;", (int) '\u00D2')
          .put("&Oacute;", (int) '\u00D3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D2` can be replaced with 'Ò'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ETH;", (int) '\u00D0')
          .put("&Ntilde;", (int) '\u00D1')
          .put("&Ograve;", (int) '\u00D2')
          .put("&Oacute;", (int) '\u00D3')
          .put("&Ocirc;", (int) '\u00D4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D3` can be replaced with 'Ó'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ntilde;", (int) '\u00D1')
          .put("&Ograve;", (int) '\u00D2')
          .put("&Oacute;", (int) '\u00D3')
          .put("&Ocirc;", (int) '\u00D4')
          .put("&Otilde;", (int) '\u00D5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D4` can be replaced with 'Ô'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ograve;", (int) '\u00D2')
          .put("&Oacute;", (int) '\u00D3')
          .put("&Ocirc;", (int) '\u00D4')
          .put("&Otilde;", (int) '\u00D5')
          .put("&Ouml;", (int) '\u00D6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D5` can be replaced with 'Õ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Oacute;", (int) '\u00D3')
          .put("&Ocirc;", (int) '\u00D4')
          .put("&Otilde;", (int) '\u00D5')
          .put("&Ouml;", (int) '\u00D6')
          .put("&times;", (int) '\u00D7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D6` can be replaced with 'Ö'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ocirc;", (int) '\u00D4')
          .put("&Otilde;", (int) '\u00D5')
          .put("&Ouml;", (int) '\u00D6')
          .put("&times;", (int) '\u00D7')
          .put("&Oslash;", (int) '\u00D8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D7` can be replaced with '×'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Otilde;", (int) '\u00D5')
          .put("&Ouml;", (int) '\u00D6')
          .put("&times;", (int) '\u00D7')
          .put("&Oslash;", (int) '\u00D8')
          .put("&Ugrave;", (int) '\u00D9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D8` can be replaced with 'Ø'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ouml;", (int) '\u00D6')
          .put("&times;", (int) '\u00D7')
          .put("&Oslash;", (int) '\u00D8')
          .put("&Ugrave;", (int) '\u00D9')
          .put("&Uacute;", (int) '\u00DA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D9` can be replaced with 'Ù'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&times;", (int) '\u00D7')
          .put("&Oslash;", (int) '\u00D8')
          .put("&Ugrave;", (int) '\u00D9')
          .put("&Uacute;", (int) '\u00DA')
          .put("&Ucirc;", (int) '\u00DB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DA` can be replaced with 'Ú'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Oslash;", (int) '\u00D8')
          .put("&Ugrave;", (int) '\u00D9')
          .put("&Uacute;", (int) '\u00DA')
          .put("&Ucirc;", (int) '\u00DB')
          .put("&Uuml;", (int) '\u00DC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DB` can be replaced with 'Û'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ugrave;", (int) '\u00D9')
          .put("&Uacute;", (int) '\u00DA')
          .put("&Ucirc;", (int) '\u00DB')
          .put("&Uuml;", (int) '\u00DC')
          .put("&Yacute;", (int) '\u00DD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DC` can be replaced with 'Ü'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Uacute;", (int) '\u00DA')
          .put("&Ucirc;", (int) '\u00DB')
          .put("&Uuml;", (int) '\u00DC')
          .put("&Yacute;", (int) '\u00DD')
          .put("&THORN;", (int) '\u00DE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DD` can be replaced with 'Ý'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Ucirc;", (int) '\u00DB')
          .put("&Uuml;", (int) '\u00DC')
          .put("&Yacute;", (int) '\u00DD')
          .put("&THORN;", (int) '\u00DE')
          .put("&szlig;", (int) '\u00DF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DE` can be replaced with 'Þ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Uuml;", (int) '\u00DC')
          .put("&Yacute;", (int) '\u00DD')
          .put("&THORN;", (int) '\u00DE')
          .put("&szlig;", (int) '\u00DF')
          .put("&agrave;", (int) '\u00E0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DF` can be replaced with 'ß'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Yacute;", (int) '\u00DD')
          .put("&THORN;", (int) '\u00DE')
          .put("&szlig;", (int) '\u00DF')
          .put("&agrave;", (int) '\u00E0')
          .put("&aacute;", (int) '\u00E1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E0` can be replaced with 'à'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&THORN;", (int) '\u00DE')
          .put("&szlig;", (int) '\u00DF')
          .put("&agrave;", (int) '\u00E0')
          .put("&aacute;", (int) '\u00E1')
          .put("&acirc;", (int) '\u00E2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E1` can be replaced with 'á'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&szlig;", (int) '\u00DF')
          .put("&agrave;", (int) '\u00E0')
          .put("&aacute;", (int) '\u00E1')
          .put("&acirc;", (int) '\u00E2')
          .put("&atilde;", (int) '\u00E3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E2` can be replaced with 'â'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&agrave;", (int) '\u00E0')
          .put("&aacute;", (int) '\u00E1')
          .put("&acirc;", (int) '\u00E2')
          .put("&atilde;", (int) '\u00E3')
          .put("&auml;", (int) '\u00E4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E3` can be replaced with 'ã'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&aacute;", (int) '\u00E1')
          .put("&acirc;", (int) '\u00E2')
          .put("&atilde;", (int) '\u00E3')
          .put("&auml;", (int) '\u00E4')
          .put("&aring;", (int) '\u00E5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E4` can be replaced with 'ä'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&acirc;", (int) '\u00E2')
          .put("&atilde;", (int) '\u00E3')
          .put("&auml;", (int) '\u00E4')
          .put("&aring;", (int) '\u00E5')
          .put("&aelig;", (int) '\u00E6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E5` can be replaced with 'å'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&atilde;", (int) '\u00E3')
          .put("&auml;", (int) '\u00E4')
          .put("&aring;", (int) '\u00E5')
          .put("&aelig;", (int) '\u00E6')
          .put("&ccedil;", (int) '\u00E7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E6` can be replaced with 'æ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&auml;", (int) '\u00E4')
          .put("&aring;", (int) '\u00E5')
          .put("&aelig;", (int) '\u00E6')
          .put("&ccedil;", (int) '\u00E7')
          .put("&egrave;", (int) '\u00E8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E7` can be replaced with 'ç'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&aring;", (int) '\u00E5')
          .put("&aelig;", (int) '\u00E6')
          .put("&ccedil;", (int) '\u00E7')
          .put("&egrave;", (int) '\u00E8')
          .put("&eacute;", (int) '\u00E9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E8` can be replaced with 'è'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&aelig;", (int) '\u00E6')
          .put("&ccedil;", (int) '\u00E7')
          .put("&egrave;", (int) '\u00E8')
          .put("&eacute;", (int) '\u00E9')
          .put("&ecirc;", (int) '\u00EA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E9` can be replaced with 'é'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ccedil;", (int) '\u00E7')
          .put("&egrave;", (int) '\u00E8')
          .put("&eacute;", (int) '\u00E9')
          .put("&ecirc;", (int) '\u00EA')
          .put("&euml;", (int) '\u00EB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EA` can be replaced with 'ê'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&egrave;", (int) '\u00E8')
          .put("&eacute;", (int) '\u00E9')
          .put("&ecirc;", (int) '\u00EA')
          .put("&euml;", (int) '\u00EB')
          .put("&igrave;", (int) '\u00EC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EB` can be replaced with 'ë'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&eacute;", (int) '\u00E9')
          .put("&ecirc;", (int) '\u00EA')
          .put("&euml;", (int) '\u00EB')
          .put("&igrave;", (int) '\u00EC')
          .put("&iacute;", (int) '\u00ED')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EC` can be replaced with 'ì'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ecirc;", (int) '\u00EA')
          .put("&euml;", (int) '\u00EB')
          .put("&igrave;", (int) '\u00EC')
          .put("&iacute;", (int) '\u00ED')
          .put("&icirc;", (int) '\u00EE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00ED` can be replaced with 'í'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&euml;", (int) '\u00EB')
          .put("&igrave;", (int) '\u00EC')
          .put("&iacute;", (int) '\u00ED')
          .put("&icirc;", (int) '\u00EE')
          .put("&iuml;", (int) '\u00EF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EE` can be replaced with 'î'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&igrave;", (int) '\u00EC')
          .put("&iacute;", (int) '\u00ED')
          .put("&icirc;", (int) '\u00EE')
          .put("&iuml;", (int) '\u00EF')
          .put("&eth;", (int) '\u00F0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EF` can be replaced with 'ï'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&iacute;", (int) '\u00ED')
          .put("&icirc;", (int) '\u00EE')
          .put("&iuml;", (int) '\u00EF')
          .put("&eth;", (int) '\u00F0')
          .put("&ntilde;", (int) '\u00F1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F0` can be replaced with 'ð'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&icirc;", (int) '\u00EE')
          .put("&iuml;", (int) '\u00EF')
          .put("&eth;", (int) '\u00F0')
          .put("&ntilde;", (int) '\u00F1')
          .put("&ograve;", (int) '\u00F2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F1` can be replaced with 'ñ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&iuml;", (int) '\u00EF')
          .put("&eth;", (int) '\u00F0')
          .put("&ntilde;", (int) '\u00F1')
          .put("&ograve;", (int) '\u00F2')
          .put("&oacute;", (int) '\u00F3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F2` can be replaced with 'ò'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&eth;", (int) '\u00F0')
          .put("&ntilde;", (int) '\u00F1')
          .put("&ograve;", (int) '\u00F2')
          .put("&oacute;", (int) '\u00F3')
          .put("&ocirc;", (int) '\u00F4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F3` can be replaced with 'ó'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ntilde;", (int) '\u00F1')
          .put("&ograve;", (int) '\u00F2')
          .put("&oacute;", (int) '\u00F3')
          .put("&ocirc;", (int) '\u00F4')
          .put("&otilde;", (int) '\u00F5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F4` can be replaced with 'ô'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ograve;", (int) '\u00F2')
          .put("&oacute;", (int) '\u00F3')
          .put("&ocirc;", (int) '\u00F4')
          .put("&otilde;", (int) '\u00F5')
          .put("&ouml;", (int) '\u00F6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F5` can be replaced with 'õ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&oacute;", (int) '\u00F3')
          .put("&ocirc;", (int) '\u00F4')
          .put("&otilde;", (int) '\u00F5')
          .put("&ouml;", (int) '\u00F6')
          .put("&divide;", (int) '\u00F7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F6` can be replaced with 'ö'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ocirc;", (int) '\u00F4')
          .put("&otilde;", (int) '\u00F5')
          .put("&ouml;", (int) '\u00F6')
          .put("&divide;", (int) '\u00F7')
          .put("&oslash;", (int) '\u00F8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F7` can be replaced with '÷'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&otilde;", (int) '\u00F5')
          .put("&ouml;", (int) '\u00F6')
          .put("&divide;", (int) '\u00F7')
          .put("&oslash;", (int) '\u00F8')
          .put("&ugrave;", (int) '\u00F9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F8` can be replaced with 'ø'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ouml;", (int) '\u00F6')
          .put("&divide;", (int) '\u00F7')
          .put("&oslash;", (int) '\u00F8')
          .put("&ugrave;", (int) '\u00F9')
          .put("&uacute;", (int) '\u00FA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F9` can be replaced with 'ù'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&divide;", (int) '\u00F7')
          .put("&oslash;", (int) '\u00F8')
          .put("&ugrave;", (int) '\u00F9')
          .put("&uacute;", (int) '\u00FA')
          .put("&ucirc;", (int) '\u00FB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FA` can be replaced with 'ú'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&oslash;", (int) '\u00F8')
          .put("&ugrave;", (int) '\u00F9')
          .put("&uacute;", (int) '\u00FA')
          .put("&ucirc;", (int) '\u00FB')
          .put("&uuml;", (int) '\u00FC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FB` can be replaced with 'û'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ugrave;", (int) '\u00F9')
          .put("&uacute;", (int) '\u00FA')
          .put("&ucirc;", (int) '\u00FB')
          .put("&uuml;", (int) '\u00FC')
          .put("&yacute;", (int) '\u00FD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FC` can be replaced with 'ü'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&uacute;", (int) '\u00FA')
          .put("&ucirc;", (int) '\u00FB')
          .put("&uuml;", (int) '\u00FC')
          .put("&yacute;", (int) '\u00FD')
          .put("&thorn;", (int) '\u00FE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FD` can be replaced with 'ý'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ucirc;", (int) '\u00FB')
          .put("&uuml;", (int) '\u00FC')
          .put("&yacute;", (int) '\u00FD')
          .put("&thorn;", (int) '\u00FE')
          .put("&yuml;", (int) '\u00FF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FE` can be replaced with 'þ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&uuml;", (int) '\u00FC')
          .put("&yacute;", (int) '\u00FD')
          .put("&thorn;", (int) '\u00FE')
          .put("&yuml;", (int) '\u00FF')
          .put("&OElig;", (int) '\u0152')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FF` can be replaced with 'ÿ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&yacute;", (int) '\u00FD')
          .put("&thorn;", (int) '\u00FE')
          .put("&yuml;", (int) '\u00FF')
          .put("&OElig;", (int) '\u0152')
          .put("&oelig;", (int) '\u0153')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0152` can be replaced with 'Œ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&thorn;", (int) '\u00FE')
          .put("&yuml;", (int) '\u00FF')
          .put("&OElig;", (int) '\u0152')
          .put("&oelig;", (int) '\u0153')
          .put("&Scaron;", (int) '\u0160')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0153` can be replaced with 'œ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&yuml;", (int) '\u00FF')
          .put("&OElig;", (int) '\u0152')
          .put("&oelig;", (int) '\u0153')
          .put("&Scaron;", (int) '\u0160')
          .put("&scaron;", (int) '\u0161')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0160` can be replaced with 'Š'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&OElig;", (int) '\u0152')
          .put("&oelig;", (int) '\u0153')
          .put("&Scaron;", (int) '\u0160')
          .put("&scaron;", (int) '\u0161')
          .put("&Yuml;", (int) '\u0178')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0161` can be replaced with 'š'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&oelig;", (int) '\u0153')
          .put("&Scaron;", (int) '\u0160')
          .put("&scaron;", (int) '\u0161')
          .put("&Yuml;", (int) '\u0178')
          .put("&fnof;", (int) '\u0192')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0178` can be replaced with 'Ÿ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Scaron;", (int) '\u0160')
          .put("&scaron;", (int) '\u0161')
          .put("&Yuml;", (int) '\u0178')
          .put("&fnof;", (int) '\u0192')
          .put("&circ;", (int) '\u02C6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0192` can be replaced with 'ƒ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&scaron;", (int) '\u0161')
          .put("&Yuml;", (int) '\u0178')
          .put("&fnof;", (int) '\u0192')
          .put("&circ;", (int) '\u02C6')
          .put("&tilde;", (int) '\u02DC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02C6` can be replaced with 'ˆ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Yuml;", (int) '\u0178')
          .put("&fnof;", (int) '\u0192')
          .put("&circ;", (int) '\u02C6')
          .put("&tilde;", (int) '\u02DC')
          .put("&Alpha;", (int) '\u0391')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DC` can be replaced with '˜'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&fnof;", (int) '\u0192')
          .put("&circ;", (int) '\u02C6')
          .put("&tilde;", (int) '\u02DC')
          .put("&Alpha;", (int) '\u0391')
          .put("&Beta;", (int) '\u0392')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0391` can be replaced with 'Α'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&circ;", (int) '\u02C6')
          .put("&tilde;", (int) '\u02DC')
          .put("&Alpha;", (int) '\u0391')
          .put("&Beta;", (int) '\u0392')
          .put("&Gamma;", (int) '\u0393')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0392` can be replaced with 'Β'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&tilde;", (int) '\u02DC')
          .put("&Alpha;", (int) '\u0391')
          .put("&Beta;", (int) '\u0392')
          .put("&Gamma;", (int) '\u0393')
          .put("&Delta;", (int) '\u0394')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0393` can be replaced with 'Γ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Alpha;", (int) '\u0391')
          .put("&Beta;", (int) '\u0392')
          .put("&Gamma;", (int) '\u0393')
          .put("&Delta;", (int) '\u0394')
          .put("&Epsilon;", (int) '\u0395')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0394` can be replaced with 'Δ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Beta;", (int) '\u0392')
          .put("&Gamma;", (int) '\u0393')
          .put("&Delta;", (int) '\u0394')
          .put("&Epsilon;", (int) '\u0395')
          .put("&Zeta;", (int) '\u0396')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0395` can be replaced with 'Ε'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Gamma;", (int) '\u0393')
          .put("&Delta;", (int) '\u0394')
          .put("&Epsilon;", (int) '\u0395')
          .put("&Zeta;", (int) '\u0396')
          .put("&Eta;", (int) '\u0397')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0396` can be replaced with 'Ζ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Delta;", (int) '\u0394')
          .put("&Epsilon;", (int) '\u0395')
          .put("&Zeta;", (int) '\u0396')
          .put("&Eta;", (int) '\u0397')
          .put("&Theta;", (int) '\u0398')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0397` can be replaced with 'Η'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Epsilon;", (int) '\u0395')
          .put("&Zeta;", (int) '\u0396')
          .put("&Eta;", (int) '\u0397')
          .put("&Theta;", (int) '\u0398')
          .put("&Iota;", (int) '\u0399')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0398` can be replaced with 'Θ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Zeta;", (int) '\u0396')
          .put("&Eta;", (int) '\u0397')
          .put("&Theta;", (int) '\u0398')
          .put("&Iota;", (int) '\u0399')
          .put("&Kappa;", (int) '\u039A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0399` can be replaced with 'Ι'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Eta;", (int) '\u0397')
          .put("&Theta;", (int) '\u0398')
          .put("&Iota;", (int) '\u0399')
          .put("&Kappa;", (int) '\u039A')
          .put("&Lambda;", (int) '\u039B')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039A` can be replaced with 'Κ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Theta;", (int) '\u0398')
          .put("&Iota;", (int) '\u0399')
          .put("&Kappa;", (int) '\u039A')
          .put("&Lambda;", (int) '\u039B')
          .put("&Mu;", (int) '\u039C')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039B` can be replaced with 'Λ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Iota;", (int) '\u0399')
          .put("&Kappa;", (int) '\u039A')
          .put("&Lambda;", (int) '\u039B')
          .put("&Mu;", (int) '\u039C')
          .put("&Nu;", (int) '\u039D')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039C` can be replaced with 'Μ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Kappa;", (int) '\u039A')
          .put("&Lambda;", (int) '\u039B')
          .put("&Mu;", (int) '\u039C')
          .put("&Nu;", (int) '\u039D')
          .put("&Xi;", (int) '\u039E')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039D` can be replaced with 'Ν'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Lambda;", (int) '\u039B')
          .put("&Mu;", (int) '\u039C')
          .put("&Nu;", (int) '\u039D')
          .put("&Xi;", (int) '\u039E')
          .put("&Omicron;", (int) '\u039F')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039E` can be replaced with 'Ξ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Mu;", (int) '\u039C')
          .put("&Nu;", (int) '\u039D')
          .put("&Xi;", (int) '\u039E')
          .put("&Omicron;", (int) '\u039F')
          .put("&Pi;", (int) '\u03A0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039F` can be replaced with 'Ο'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Nu;", (int) '\u039D')
          .put("&Xi;", (int) '\u039E')
          .put("&Omicron;", (int) '\u039F')
          .put("&Pi;", (int) '\u03A0')
          .put("&Rho;", (int) '\u03A1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A0` can be replaced with 'Π'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Xi;", (int) '\u039E')
          .put("&Omicron;", (int) '\u039F')
          .put("&Pi;", (int) '\u03A0')
          .put("&Rho;", (int) '\u03A1')
          .put("&Sigma;", (int) '\u03A3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A1` can be replaced with 'Ρ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Omicron;", (int) '\u039F')
          .put("&Pi;", (int) '\u03A0')
          .put("&Rho;", (int) '\u03A1')
          .put("&Sigma;", (int) '\u03A3')
          .put("&Tau;", (int) '\u03A4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A3` can be replaced with 'Σ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Pi;", (int) '\u03A0')
          .put("&Rho;", (int) '\u03A1')
          .put("&Sigma;", (int) '\u03A3')
          .put("&Tau;", (int) '\u03A4')
          .put("&Upsilon;", (int) '\u03A5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A4` can be replaced with 'Τ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Rho;", (int) '\u03A1')
          .put("&Sigma;", (int) '\u03A3')
          .put("&Tau;", (int) '\u03A4')
          .put("&Upsilon;", (int) '\u03A5')
          .put("&Phi;", (int) '\u03A6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A5` can be replaced with 'Υ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Sigma;", (int) '\u03A3')
          .put("&Tau;", (int) '\u03A4')
          .put("&Upsilon;", (int) '\u03A5')
          .put("&Phi;", (int) '\u03A6')
          .put("&Chi;", (int) '\u03A7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A6` can be replaced with 'Φ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Tau;", (int) '\u03A4')
          .put("&Upsilon;", (int) '\u03A5')
          .put("&Phi;", (int) '\u03A6')
          .put("&Chi;", (int) '\u03A7')
          .put("&Psi;", (int) '\u03A8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A7` can be replaced with 'Χ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Upsilon;", (int) '\u03A5')
          .put("&Phi;", (int) '\u03A6')
          .put("&Chi;", (int) '\u03A7')
          .put("&Psi;", (int) '\u03A8')
          .put("&Omega;", (int) '\u03A9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A8` can be replaced with 'Ψ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Phi;", (int) '\u03A6')
          .put("&Chi;", (int) '\u03A7')
          .put("&Psi;", (int) '\u03A8')
          .put("&Omega;", (int) '\u03A9')
          .put("&alpha;", (int) '\u03B1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A9` can be replaced with 'Ω'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Chi;", (int) '\u03A7')
          .put("&Psi;", (int) '\u03A8')
          .put("&Omega;", (int) '\u03A9')
          .put("&alpha;", (int) '\u03B1')
          .put("&beta;", (int) '\u03B2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B1` can be replaced with 'α'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Psi;", (int) '\u03A8')
          .put("&Omega;", (int) '\u03A9')
          .put("&alpha;", (int) '\u03B1')
          .put("&beta;", (int) '\u03B2')
          .put("&gamma;", (int) '\u03B3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B2` can be replaced with 'β'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Omega;", (int) '\u03A9')
          .put("&alpha;", (int) '\u03B1')
          .put("&beta;", (int) '\u03B2')
          .put("&gamma;", (int) '\u03B3')
          .put("&delta;", (int) '\u03B4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B3` can be replaced with 'γ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&alpha;", (int) '\u03B1')
          .put("&beta;", (int) '\u03B2')
          .put("&gamma;", (int) '\u03B3')
          .put("&delta;", (int) '\u03B4')
          .put("&epsilon;", (int) '\u03B5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B4` can be replaced with 'δ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&beta;", (int) '\u03B2')
          .put("&gamma;", (int) '\u03B3')
          .put("&delta;", (int) '\u03B4')
          .put("&epsilon;", (int) '\u03B5')
          .put("&zeta;", (int) '\u03B6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B5` can be replaced with 'ε'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&gamma;", (int) '\u03B3')
          .put("&delta;", (int) '\u03B4')
          .put("&epsilon;", (int) '\u03B5')
          .put("&zeta;", (int) '\u03B6')
          .put("&eta;", (int) '\u03B7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B6` can be replaced with 'ζ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&delta;", (int) '\u03B4')
          .put("&epsilon;", (int) '\u03B5')
          .put("&zeta;", (int) '\u03B6')
          .put("&eta;", (int) '\u03B7')
          .put("&theta;", (int) '\u03B8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B7` can be replaced with 'η'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&epsilon;", (int) '\u03B5')
          .put("&zeta;", (int) '\u03B6')
          .put("&eta;", (int) '\u03B7')
          .put("&theta;", (int) '\u03B8')
          .put("&iota;", (int) '\u03B9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B8` can be replaced with 'θ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&zeta;", (int) '\u03B6')
          .put("&eta;", (int) '\u03B7')
          .put("&theta;", (int) '\u03B8')
          .put("&iota;", (int) '\u03B9')
          .put("&kappa;", (int) '\u03BA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B9` can be replaced with 'ι'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&eta;", (int) '\u03B7')
          .put("&theta;", (int) '\u03B8')
          .put("&iota;", (int) '\u03B9')
          .put("&kappa;", (int) '\u03BA')
          .put("&lambda;", (int) '\u03BB')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BA` can be replaced with 'κ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&theta;", (int) '\u03B8')
          .put("&iota;", (int) '\u03B9')
          .put("&kappa;", (int) '\u03BA')
          .put("&lambda;", (int) '\u03BB')
          .put("&mu;", (int) '\u03BC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BB` can be replaced with 'λ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&iota;", (int) '\u03B9')
          .put("&kappa;", (int) '\u03BA')
          .put("&lambda;", (int) '\u03BB')
          .put("&mu;", (int) '\u03BC')
          .put("&nu;", (int) '\u03BD')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BC` can be replaced with 'μ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&kappa;", (int) '\u03BA')
          .put("&lambda;", (int) '\u03BB')
          .put("&mu;", (int) '\u03BC')
          .put("&nu;", (int) '\u03BD')
          .put("&xi;", (int) '\u03BE')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BD` can be replaced with 'ν'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lambda;", (int) '\u03BB')
          .put("&mu;", (int) '\u03BC')
          .put("&nu;", (int) '\u03BD')
          .put("&xi;", (int) '\u03BE')
          .put("&omicron;", (int) '\u03BF')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BE` can be replaced with 'ξ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&mu;", (int) '\u03BC')
          .put("&nu;", (int) '\u03BD')
          .put("&xi;", (int) '\u03BE')
          .put("&omicron;", (int) '\u03BF')
          .put("&pi;", (int) '\u03C0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BF` can be replaced with 'ο'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&nu;", (int) '\u03BD')
          .put("&xi;", (int) '\u03BE')
          .put("&omicron;", (int) '\u03BF')
          .put("&pi;", (int) '\u03C0')
          .put("&rho;", (int) '\u03C1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C0` can be replaced with 'π'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&xi;", (int) '\u03BE')
          .put("&omicron;", (int) '\u03BF')
          .put("&pi;", (int) '\u03C0')
          .put("&rho;", (int) '\u03C1')
          .put("&sigmaf;", (int) '\u03C2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C1` can be replaced with 'ρ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&omicron;", (int) '\u03BF')
          .put("&pi;", (int) '\u03C0')
          .put("&rho;", (int) '\u03C1')
          .put("&sigmaf;", (int) '\u03C2')
          .put("&sigma;", (int) '\u03C3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C2` can be replaced with 'ς'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&pi;", (int) '\u03C0')
          .put("&rho;", (int) '\u03C1')
          .put("&sigmaf;", (int) '\u03C2')
          .put("&sigma;", (int) '\u03C3')
          .put("&tau;", (int) '\u03C4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C3` can be replaced with 'σ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rho;", (int) '\u03C1')
          .put("&sigmaf;", (int) '\u03C2')
          .put("&sigma;", (int) '\u03C3')
          .put("&tau;", (int) '\u03C4')
          .put("&upsilon;", (int) '\u03C5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C4` can be replaced with 'τ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sigmaf;", (int) '\u03C2')
          .put("&sigma;", (int) '\u03C3')
          .put("&tau;", (int) '\u03C4')
          .put("&upsilon;", (int) '\u03C5')
          .put("&phi;", (int) '\u03C6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C5` can be replaced with 'υ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sigma;", (int) '\u03C3')
          .put("&tau;", (int) '\u03C4')
          .put("&upsilon;", (int) '\u03C5')
          .put("&phi;", (int) '\u03C6')
          .put("&chi;", (int) '\u03C7')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C6` can be replaced with 'φ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&tau;", (int) '\u03C4')
          .put("&upsilon;", (int) '\u03C5')
          .put("&phi;", (int) '\u03C6')
          .put("&chi;", (int) '\u03C7')
          .put("&psi;", (int) '\u03C8')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C7` can be replaced with 'χ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&upsilon;", (int) '\u03C5')
          .put("&phi;", (int) '\u03C6')
          .put("&chi;", (int) '\u03C7')
          .put("&psi;", (int) '\u03C8')
          .put("&omega;", (int) '\u03C9')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C8` can be replaced with 'ψ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&phi;", (int) '\u03C6')
          .put("&chi;", (int) '\u03C7')
          .put("&psi;", (int) '\u03C8')
          .put("&omega;", (int) '\u03C9')
          .put("&thetasym;", (int) '\u03D1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C9` can be replaced with 'ω'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&chi;", (int) '\u03C7')
          .put("&psi;", (int) '\u03C8')
          .put("&omega;", (int) '\u03C9')
          .put("&thetasym;", (int) '\u03D1')
          .put("&upsih;", (int) '\u03D2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D1` can be replaced with 'ϑ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&psi;", (int) '\u03C8')
          .put("&omega;", (int) '\u03C9')
          .put("&thetasym;", (int) '\u03D1')
          .put("&upsih;", (int) '\u03D2')
          .put("&piv;", (int) '\u03D6')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D2` can be replaced with 'ϒ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&omega;", (int) '\u03C9')
          .put("&thetasym;", (int) '\u03D1')
          .put("&upsih;", (int) '\u03D2')
          .put("&piv;", (int) '\u03D6')
          .put("&ensp;", (int) '\u2002')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D6` can be replaced with 'ϖ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&thetasym;", (int) '\u03D1')
          .put("&upsih;", (int) '\u03D2')
          .put("&piv;", (int) '\u03D6')
          .put("&ensp;", (int) '\u2002')
          .put("&emsp;", (int) '\u2003')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2013` can be replaced with '--'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lrm;", (int) '\u200E')
          .put("&rlm;", (int) '\u200F')
          .put("&ndash;", (int) '\u2013')
          .put("&mdash;", (int) '\u2014')
          .put("&lsquo;", (int) '\u2018')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2014` can be replaced with '---'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rlm;", (int) '\u200F')
          .put("&ndash;", (int) '\u2013')
          .put("&mdash;", (int) '\u2014')
          .put("&lsquo;", (int) '\u2018')
          .put("&rsquo;", (int) '\u2019')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2018` can be replaced with '''
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ndash;", (int) '\u2013')
          .put("&mdash;", (int) '\u2014')
          .put("&lsquo;", (int) '\u2018')
          .put("&rsquo;", (int) '\u2019')
          .put("&sbquo;", (int) '\u201A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2019` can be replaced with '''
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&mdash;", (int) '\u2014')
          .put("&lsquo;", (int) '\u2018')
          .put("&rsquo;", (int) '\u2019')
          .put("&sbquo;", (int) '\u201A')
          .put("&ldquo;", (int) '\u201C')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201A` can be replaced with '‚'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lsquo;", (int) '\u2018')
          .put("&rsquo;", (int) '\u2019')
          .put("&sbquo;", (int) '\u201A')
          .put("&ldquo;", (int) '\u201C')
          .put("&rdquo;", (int) '\u201D')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201C` can be replaced with '"'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rsquo;", (int) '\u2019')
          .put("&sbquo;", (int) '\u201A')
          .put("&ldquo;", (int) '\u201C')
          .put("&rdquo;", (int) '\u201D')
          .put("&bdquo;", (int) '\u201E')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201D` can be replaced with '"'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sbquo;", (int) '\u201A')
          .put("&ldquo;", (int) '\u201C')
          .put("&rdquo;", (int) '\u201D')
          .put("&bdquo;", (int) '\u201E')
          .put("&dagger;", (int) '\u2020')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201E` can be replaced with '„'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ldquo;", (int) '\u201C')
          .put("&rdquo;", (int) '\u201D')
          .put("&bdquo;", (int) '\u201E')
          .put("&dagger;", (int) '\u2020')
          .put("&Dagger;", (int) '\u2021')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2020` can be replaced with '†'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rdquo;", (int) '\u201D')
          .put("&bdquo;", (int) '\u201E')
          .put("&dagger;", (int) '\u2020')
          .put("&Dagger;", (int) '\u2021')
          .put("&bull;", (int) '\u2022')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2021` can be replaced with '‡'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&bdquo;", (int) '\u201E')
          .put("&dagger;", (int) '\u2020')
          .put("&Dagger;", (int) '\u2021')
          .put("&bull;", (int) '\u2022')
          .put("&hellip;", (int) '\u2026')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2022` can be replaced with '•'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&dagger;", (int) '\u2020')
          .put("&Dagger;", (int) '\u2021')
          .put("&bull;", (int) '\u2022')
          .put("&hellip;", (int) '\u2026')
          .put("&permil;", (int) '\u2030')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2026` can be replaced with '...'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Dagger;", (int) '\u2021')
          .put("&bull;", (int) '\u2022')
          .put("&hellip;", (int) '\u2026')
          .put("&permil;", (int) '\u2030')
          .put("&prime;", (int) '\u2032')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2030` can be replaced with '‰'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&bull;", (int) '\u2022')
          .put("&hellip;", (int) '\u2026')
          .put("&permil;", (int) '\u2030')
          .put("&prime;", (int) '\u2032')
          .put("&Prime;", (int) '\u2033')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2032` can be replaced with '′'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&hellip;", (int) '\u2026')
          .put("&permil;", (int) '\u2030')
          .put("&prime;", (int) '\u2032')
          .put("&Prime;", (int) '\u2033')
          .put("&lsaquo;", (int) '\u2039')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2033` can be replaced with '″'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&permil;", (int) '\u2030')
          .put("&prime;", (int) '\u2032')
          .put("&Prime;", (int) '\u2033')
          .put("&lsaquo;", (int) '\u2039')
          .put("&rsaquo;", (int) '\u203A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2039` can be replaced with '‹'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&prime;", (int) '\u2032')
          .put("&Prime;", (int) '\u2033')
          .put("&lsaquo;", (int) '\u2039')
          .put("&rsaquo;", (int) '\u203A')
          .put("&oline;", (int) '\u203E')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203A` can be replaced with '›'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&Prime;", (int) '\u2033')
          .put("&lsaquo;", (int) '\u2039')
          .put("&rsaquo;", (int) '\u203A')
          .put("&oline;", (int) '\u203E')
          .put("&frasl;", (int) '\u2044')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203E` can be replaced with '‾'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lsaquo;", (int) '\u2039')
          .put("&rsaquo;", (int) '\u203A')
          .put("&oline;", (int) '\u203E')
          .put("&frasl;", (int) '\u2044')
          .put("&euro;", (int) '\u20AC')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2044` can be replaced with '⁄'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rsaquo;", (int) '\u203A')
          .put("&oline;", (int) '\u203E')
          .put("&frasl;", (int) '\u2044')
          .put("&euro;", (int) '\u20AC')
          .put("&image;", (int) '\u2111')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u20AC` can be replaced with '€'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&oline;", (int) '\u203E')
          .put("&frasl;", (int) '\u2044')
          .put("&euro;", (int) '\u20AC')
          .put("&image;", (int) '\u2111')
          .put("&weierp;", (int) '\u2118')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2111` can be replaced with 'ℑ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&frasl;", (int) '\u2044')
          .put("&euro;", (int) '\u20AC')
          .put("&image;", (int) '\u2111')
          .put("&weierp;", (int) '\u2118')
          .put("&real;", (int) '\u211C')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2118` can be replaced with '℘'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&euro;", (int) '\u20AC')
          .put("&image;", (int) '\u2111')
          .put("&weierp;", (int) '\u2118')
          .put("&real;", (int) '\u211C')
          .put("&trade;", (int) '\u2122')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u211C` can be replaced with 'ℜ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&image;", (int) '\u2111')
          .put("&weierp;", (int) '\u2118')
          .put("&real;", (int) '\u211C')
          .put("&trade;", (int) '\u2122')
          .put("&alefsym;", (int) '\u2135')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2122` can be replaced with '™'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&weierp;", (int) '\u2118')
          .put("&real;", (int) '\u211C')
          .put("&trade;", (int) '\u2122')
          .put("&alefsym;", (int) '\u2135')
          .put("&larr;", (int) '\u2190')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2135` can be replaced with 'ℵ'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&real;", (int) '\u211C')
          .put("&trade;", (int) '\u2122')
          .put("&alefsym;", (int) '\u2135')
          .put("&larr;", (int) '\u2190')
          .put("&uarr;", (int) '\u2191')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2190` can be replaced with '←'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&trade;", (int) '\u2122')
          .put("&alefsym;", (int) '\u2135')
          .put("&larr;", (int) '\u2190')
          .put("&uarr;", (int) '\u2191')
          .put("&rarr;", (int) '\u2192')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2191` can be replaced with '↑'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&alefsym;", (int) '\u2135')
          .put("&larr;", (int) '\u2190')
          .put("&uarr;", (int) '\u2191')
          .put("&rarr;", (int) '\u2192')
          .put("&darr;", (int) '\u2193')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2192` can be replaced with '→'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&larr;", (int) '\u2190')
          .put("&uarr;", (int) '\u2191')
          .put("&rarr;", (int) '\u2192')
          .put("&darr;", (int) '\u2193')
          .put("&harr;", (int) '\u2194')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2193` can be replaced with '↓'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&uarr;", (int) '\u2191')
          .put("&rarr;", (int) '\u2192')
          .put("&darr;", (int) '\u2193')
          .put("&harr;", (int) '\u2194')
          .put("&crarr;", (int) '\u21B5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2194` can be replaced with '↔'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rarr;", (int) '\u2192')
          .put("&darr;", (int) '\u2193')
          .put("&harr;", (int) '\u2194')
          .put("&crarr;", (int) '\u21B5')
          .put("&lArr;", (int) '\u21D0')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21B5` can be replaced with '↵'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&darr;", (int) '\u2193')
          .put("&harr;", (int) '\u2194')
          .put("&crarr;", (int) '\u21B5')
          .put("&lArr;", (int) '\u21D0')
          .put("&uArr;", (int) '\u21D1')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D0` can be replaced with '⇐'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&harr;", (int) '\u2194')
          .put("&crarr;", (int) '\u21B5')
          .put("&lArr;", (int) '\u21D0')
          .put("&uArr;", (int) '\u21D1')
          .put("&rArr;", (int) '\u21D2')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D1` can be replaced with '⇑'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&crarr;", (int) '\u21B5')
          .put("&lArr;", (int) '\u21D0')
          .put("&uArr;", (int) '\u21D1')
          .put("&rArr;", (int) '\u21D2')
          .put("&dArr;", (int) '\u21D3')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D2` can be replaced with '⇒'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lArr;", (int) '\u21D0')
          .put("&uArr;", (int) '\u21D1')
          .put("&rArr;", (int) '\u21D2')
          .put("&dArr;", (int) '\u21D3')
          .put("&hArr;", (int) '\u21D4')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D3` can be replaced with '⇓'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&uArr;", (int) '\u21D1')
          .put("&rArr;", (int) '\u21D2')
          .put("&dArr;", (int) '\u21D3')
          .put("&hArr;", (int) '\u21D4')
          .put("&forall;", (int) '\u2200')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D4` can be replaced with '⇔'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rArr;", (int) '\u21D2')
          .put("&dArr;", (int) '\u21D3')
          .put("&hArr;", (int) '\u21D4')
          .put("&forall;", (int) '\u2200')
          .put("&part;", (int) '\u2202')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2200` can be replaced with '∀'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&dArr;", (int) '\u21D3')
          .put("&hArr;", (int) '\u21D4')
          .put("&forall;", (int) '\u2200')
          .put("&part;", (int) '\u2202')
          .put("&exist;", (int) '\u2203')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2202` can be replaced with '∂'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&hArr;", (int) '\u21D4')
          .put("&forall;", (int) '\u2200')
          .put("&part;", (int) '\u2202')
          .put("&exist;", (int) '\u2203')
          .put("&empty;", (int) '\u2205')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2203` can be replaced with '∃'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&forall;", (int) '\u2200')
          .put("&part;", (int) '\u2202')
          .put("&exist;", (int) '\u2203')
          .put("&empty;", (int) '\u2205')
          .put("&nabla;", (int) '\u2207')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2205` can be replaced with '∅'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&part;", (int) '\u2202')
          .put("&exist;", (int) '\u2203')
          .put("&empty;", (int) '\u2205')
          .put("&nabla;", (int) '\u2207')
          .put("&isin;", (int) '\u2208')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2207` can be replaced with '∇'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&exist;", (int) '\u2203')
          .put("&empty;", (int) '\u2205')
          .put("&nabla;", (int) '\u2207')
          .put("&isin;", (int) '\u2208')
          .put("&notin;", (int) '\u2209')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2208` can be replaced with '∈'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&empty;", (int) '\u2205')
          .put("&nabla;", (int) '\u2207')
          .put("&isin;", (int) '\u2208')
          .put("&notin;", (int) '\u2209')
          .put("&ni;", (int) '\u220B')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2209` can be replaced with '∉'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&nabla;", (int) '\u2207')
          .put("&isin;", (int) '\u2208')
          .put("&notin;", (int) '\u2209')
          .put("&ni;", (int) '\u220B')
          .put("&prod;", (int) '\u220F')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u220B` can be replaced with '∋'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&isin;", (int) '\u2208')
          .put("&notin;", (int) '\u2209')
          .put("&ni;", (int) '\u220B')
          .put("&prod;", (int) '\u220F')
          .put("&sum;", (int) '\u2211')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u220F` can be replaced with '∏'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&notin;", (int) '\u2209')
          .put("&ni;", (int) '\u220B')
          .put("&prod;", (int) '\u220F')
          .put("&sum;", (int) '\u2211')
          .put("&minus;", (int) '\u2212')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2211` can be replaced with '∑'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ni;", (int) '\u220B')
          .put("&prod;", (int) '\u220F')
          .put("&sum;", (int) '\u2211')
          .put("&minus;", (int) '\u2212')
          .put("&lowast;", (int) '\u2217')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2212` can be replaced with '−'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&prod;", (int) '\u220F')
          .put("&sum;", (int) '\u2211')
          .put("&minus;", (int) '\u2212')
          .put("&lowast;", (int) '\u2217')
          .put("&radic;", (int) '\u221A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2217` can be replaced with '∗'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sum;", (int) '\u2211')
          .put("&minus;", (int) '\u2212')
          .put("&lowast;", (int) '\u2217')
          .put("&radic;", (int) '\u221A')
          .put("&prop;", (int) '\u221D')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221A` can be replaced with '√'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&minus;", (int) '\u2212')
          .put("&lowast;", (int) '\u2217')
          .put("&radic;", (int) '\u221A')
          .put("&prop;", (int) '\u221D')
          .put("&infin;", (int) '\u221E')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221D` can be replaced with '∝'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lowast;", (int) '\u2217')
          .put("&radic;", (int) '\u221A')
          .put("&prop;", (int) '\u221D')
          .put("&infin;", (int) '\u221E')
          .put("&ang;", (int) '\u2220')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221E` can be replaced with '∞'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&radic;", (int) '\u221A')
          .put("&prop;", (int) '\u221D')
          .put("&infin;", (int) '\u221E')
          .put("&ang;", (int) '\u2220')
          .put("&and;", (int) '\u2227')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2220` can be replaced with '∠'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&prop;", (int) '\u221D')
          .put("&infin;", (int) '\u221E')
          .put("&ang;", (int) '\u2220')
          .put("&and;", (int) '\u2227')
          .put("&or;", (int) '\u2228')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2227` can be replaced with '∧'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&infin;", (int) '\u221E')
          .put("&ang;", (int) '\u2220')
          .put("&and;", (int) '\u2227')
          .put("&or;", (int) '\u2228')
          .put("&cap;", (int) '\u2229')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2228` can be replaced with '∨'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ang;", (int) '\u2220')
          .put("&and;", (int) '\u2227')
          .put("&or;", (int) '\u2228')
          .put("&cap;", (int) '\u2229')
          .put("&cup;", (int) '\u222A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2229` can be replaced with '∩'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&and;", (int) '\u2227')
          .put("&or;", (int) '\u2228')
          .put("&cap;", (int) '\u2229')
          .put("&cup;", (int) '\u222A')
          .put("&int;", (int) '\u222B')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u222A` can be replaced with '∪'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&or;", (int) '\u2228')
          .put("&cap;", (int) '\u2229')
          .put("&cup;", (int) '\u222A')
          .put("&int;", (int) '\u222B')
          .put("&there4;", (int) '\u2234')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u222B` can be replaced with '∫'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&cap;", (int) '\u2229')
          .put("&cup;", (int) '\u222A')
          .put("&int;", (int) '\u222B')
          .put("&there4;", (int) '\u2234')
          .put("&sim;", (int) '\u223C')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2234` can be replaced with '∴'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&cup;", (int) '\u222A')
          .put("&int;", (int) '\u222B')
          .put("&there4;", (int) '\u2234')
          .put("&sim;", (int) '\u223C')
          .put("&cong;", (int) '\u2245')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u223C` can be replaced with '∼'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&int;", (int) '\u222B')
          .put("&there4;", (int) '\u2234')
          .put("&sim;", (int) '\u223C')
          .put("&cong;", (int) '\u2245')
          .put("&asymp;", (int) '\u2248')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2245` can be replaced with '≅'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&there4;", (int) '\u2234')
          .put("&sim;", (int) '\u223C')
          .put("&cong;", (int) '\u2245')
          .put("&asymp;", (int) '\u2248')
          .put("&ne;", (int) '\u2260')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2248` can be replaced with '≈'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sim;", (int) '\u223C')
          .put("&cong;", (int) '\u2245')
          .put("&asymp;", (int) '\u2248')
          .put("&ne;", (int) '\u2260')
          .put("&equiv;", (int) '\u2261')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2260` can be replaced with '≠'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&cong;", (int) '\u2245')
          .put("&asymp;", (int) '\u2248')
          .put("&ne;", (int) '\u2260')
          .put("&equiv;", (int) '\u2261')
          .put("&le;", (int) '\u2264')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2261` can be replaced with '≡'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&asymp;", (int) '\u2248')
          .put("&ne;", (int) '\u2260')
          .put("&equiv;", (int) '\u2261')
          .put("&le;", (int) '\u2264')
          .put("&ge;", (int) '\u2265')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2264` can be replaced with '≤'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ne;", (int) '\u2260')
          .put("&equiv;", (int) '\u2261')
          .put("&le;", (int) '\u2264')
          .put("&ge;", (int) '\u2265')
          .put("&sub;", (int) '\u2282')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2265` can be replaced with '≥'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&equiv;", (int) '\u2261')
          .put("&le;", (int) '\u2264')
          .put("&ge;", (int) '\u2265')
          .put("&sub;", (int) '\u2282')
          .put("&sup;", (int) '\u2283')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2282` can be replaced with '⊂'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&le;", (int) '\u2264')
          .put("&ge;", (int) '\u2265')
          .put("&sub;", (int) '\u2282')
          .put("&sup;", (int) '\u2283')
          .put("&nsub;", (int) '\u2284')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2283` can be replaced with '⊃'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&ge;", (int) '\u2265')
          .put("&sub;", (int) '\u2282')
          .put("&sup;", (int) '\u2283')
          .put("&nsub;", (int) '\u2284')
          .put("&sube;", (int) '\u2286')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2284` can be replaced with '⊄'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sub;", (int) '\u2282')
          .put("&sup;", (int) '\u2283')
          .put("&nsub;", (int) '\u2284')
          .put("&sube;", (int) '\u2286')
          .put("&supe;", (int) '\u2287')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2286` can be replaced with '⊆'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sup;", (int) '\u2283')
          .put("&nsub;", (int) '\u2284')
          .put("&sube;", (int) '\u2286')
          .put("&supe;", (int) '\u2287')
          .put("&oplus;", (int) '\u2295')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2287` can be replaced with '⊇'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&nsub;", (int) '\u2284')
          .put("&sube;", (int) '\u2286')
          .put("&supe;", (int) '\u2287')
          .put("&oplus;", (int) '\u2295')
          .put("&otimes;", (int) '\u2297')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2295` can be replaced with '⊕'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sube;", (int) '\u2286')
          .put("&supe;", (int) '\u2287')
          .put("&oplus;", (int) '\u2295')
          .put("&otimes;", (int) '\u2297')
          .put("&perp;", (int) '\u22A5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2297` can be replaced with '⊗'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&supe;", (int) '\u2287')
          .put("&oplus;", (int) '\u2295')
          .put("&otimes;", (int) '\u2297')
          .put("&perp;", (int) '\u22A5')
          .put("&sdot;", (int) '\u22C5')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u22A5` can be replaced with '⊥'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&oplus;", (int) '\u2295')
          .put("&otimes;", (int) '\u2297')
          .put("&perp;", (int) '\u22A5')
          .put("&sdot;", (int) '\u22C5')
          .put("&lceil;", (int) '\u2308')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u22C5` can be replaced with '⋅'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&otimes;", (int) '\u2297')
          .put("&perp;", (int) '\u22A5')
          .put("&sdot;", (int) '\u22C5')
          .put("&lceil;", (int) '\u2308')
          .put("&rceil;", (int) '\u2309')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2308` can be replaced with '⌈'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&perp;", (int) '\u22A5')
          .put("&sdot;", (int) '\u22C5')
          .put("&lceil;", (int) '\u2308')
          .put("&rceil;", (int) '\u2309')
          .put("&lfloor;", (int) '\u230A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2309` can be replaced with '⌉'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&sdot;", (int) '\u22C5')
          .put("&lceil;", (int) '\u2308')
          .put("&rceil;", (int) '\u2309')
          .put("&lfloor;", (int) '\u230A')
          .put("&rfloor;", (int) '\u230B')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u230A` can be replaced with '⌊'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lceil;", (int) '\u2308')
          .put("&rceil;", (int) '\u2309')
          .put("&lfloor;", (int) '\u230A')
          .put("&rfloor;", (int) '\u230B')
          .put("&lang;", (int) '\u2329')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u230B` can be replaced with '⌋'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rceil;", (int) '\u2309')
          .put("&lfloor;", (int) '\u230A')
          .put("&rfloor;", (int) '\u230B')
          .put("&lang;", (int) '\u2329')
          .put("&rang;", (int) '\u232A')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2329` can be replaced with '〈'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lfloor;", (int) '\u230A')
          .put("&rfloor;", (int) '\u230B')
          .put("&lang;", (int) '\u2329')
          .put("&rang;", (int) '\u232A')
          .put("&loz;", (int) '\u25CA')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u232A` can be replaced with '〉'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rfloor;", (int) '\u230B')
          .put("&lang;", (int) '\u2329')
          .put("&rang;", (int) '\u232A')
          .put("&loz;", (int) '\u25CA')
          .put("&spades;", (int) '\u2660')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u25CA` can be replaced with '◊'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&lang;", (int) '\u2329')
          .put("&rang;", (int) '\u232A')
          .put("&loz;", (int) '\u25CA')
          .put("&spades;", (int) '\u2660')
          .put("&clubs;", (int) '\u2663')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2660` can be replaced with '♠'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&rang;", (int) '\u232A')
          .put("&loz;", (int) '\u25CA')
          .put("&spades;", (int) '\u2660')
          .put("&clubs;", (int) '\u2663')
          .put("&hearts;", (int) '\u2665')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2663` can be replaced with '♣'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&loz;", (int) '\u25CA')
          .put("&spades;", (int) '\u2660')
          .put("&clubs;", (int) '\u2663')
          .put("&hearts;", (int) '\u2665')
          .put("&diams;", (int) '\u2666')
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2665` can be replaced with '♥'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&spades;", (int) '\u2660')
          .put("&clubs;", (int) '\u2663')
          .put("&hearts;", (int) '\u2665')
          .put("&diams;", (int) '\u2666')
          .build();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2666` can be replaced with '♦'
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          .put("&clubs;", (int) '\u2663')
          .put("&hearts;", (int) '\u2665')
          .put("&diams;", (int) '\u2666')
          .build();
}
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `foreachBody` is redundant
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
    Expression limit =
        VariableDeclaration.builder(varPrefix + "ListLen").setRhs(limitInitializer).build().ref();
    Statement foreachBody = handleForeachLoop(nonEmptyNode, limit, getDataItemFunction);

    return foreachBody;
```

### UnnecessaryLocalVariable
Local variable `description` is redundant
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
  @Override
  public String toString() {
    String description =
        getClass().getSimpleName() + "{name = " + name() + ", desc = " + desc + "}";
    return description;
```

### UnnecessaryLocalVariable
Local variable `instance` is redundant
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java

  private static ExtensionRegistry createRegistry() {
    ExtensionRegistry instance = ExtensionRegistry.newInstance();
    // Add extensions needed for parsing descriptors here.
    return instance;
```

### UnnecessaryLocalVariable
Local variable `name` is redundant
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java

  private static String classNameWithoutPackage(Descriptor descriptor, ProtoFlavor flavor) {
    String name = stripPackageName(descriptor.getFullName(), descriptor.getFile());
    return name;
  }
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'namespace'
in `java/src/com/google/template/soy/soytree/SoyFileNode.java`
#### Snippet
```java
    }

    private CssPath(CssPath origin) {
      this.sourcePath = origin.sourcePath;
      this.resolvedPath = origin.resolvedPath;
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[a-z0-9_$:-]*)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                  + "(?:action|archive|background|cite|classid|codebase|content|data|dsync|href"
                  + "|http-equiv|longdesc|style|usemap)\\s*$)"
                  + "(?:"
                  // Must match letters
                  + "[a-z0-9_$:-]*"
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[_a-z0-9-]+)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                + "(?:(?:"
                + // A latin class name or ID, CSS identifier, hex color or unicode range.
                "[.#]?-?(?:[_a-z0-9-]+)(?:-[_a-z0-9-]+)*-?|"
                + // A CSS function call. This allows the same characters as
                // except for / and *, because those can make comments which we want to exclude, but
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:missingValue)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                // except for / and *, because those can make comments which we want to exclude, but
                // don't have an easy way of doing that in this regex.
                "(?:"
                + Joiner.on('|').join(ALLOWED_CSS_FUNCTIONS)
                + ")\\((?:"
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:missingValue)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                + ")\\((?:"
                + ALLOWED_IN_FUNCTIONS
                + "|(?:"
                // Allow function call in a function call (1 layer)
                // e.g. linear-gradient(... rgb(...) ...)
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
    return operation(
        node.getOperator(),
        Arrays.asList(maybeCoerceToBoolean(operand.getType(), visit(operand), false)));
  }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java

  @Override
  public boolean equals(Object other) {
    // Keep this in sync with UnsanitizedString#equals so that StringData and UnsanitizedString can
    // be used interchangeably.
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
          writer.writeEntry(
              resourcePath + genFile.fileName(),
              contentsWithKytheComment(genFile, false).asByteSource(UTF_8));
        }
      }
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        } else {
          checkState(
```

### UnstableApiUsage
'asCharSink(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        } else {
          checkState(
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        }

```

### UnstableApiUsage
'asCharSink(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        }

```

### UnstableApiUsage
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/base/internal/IndentedLinesBuilder.java`
#### Snippet
```java
  private void appendInternal(String s) {
    sb.append(s);
    byteLength += Utf8.encodedLength(s);
  }

```

### UnstableApiUsage
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/base/internal/IndentedLinesBuilder.java`
#### Snippet
```java
  private void appendInternal(String s) {
    sb.append(s);
    byteLength += Utf8.encodedLength(s);
  }

```

### UnstableApiUsage
'asMap(com.google.common.collect.SetMultimap)' is marked unstable with @Beta
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
    }
    for (Map.Entry<String, Set<CachedDescriptorSet>> entry :
        Multimaps.asMap(protoFileToDescriptor).entrySet()) {
      if (entry.getValue().size() > 1) {
        err.println(
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return StringData.forValue(UnsignedLongs.toString((Long) field));
        }

```

### UnstableApiUsage
'toString(long)' is declared in unstable class 'com.google.common.primitives.UnsignedLongs' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return StringData.forValue(UnsignedLongs.toString((Long) field));
        }

```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedInts.saturatedCast(field.longValue());
        }
      };
```

### UnstableApiUsage
'saturatedCast(long)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedInts.saturatedCast(field.longValue());
        }
      };
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedLongs.parseUnsignedLong(field.stringValue());
        }
      };
```

### UnstableApiUsage
'parseUnsignedLong(java.lang.String)' is declared in unstable class 'com.google.common.primitives.UnsignedLongs' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedLongs.parseUnsignedLong(field.stringValue());
        }
      };
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return IntegerData.forValue(UnsignedInts.toLong(((Number) field).intValue()));
        }

```

### UnstableApiUsage
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return IntegerData.forValue(UnsignedInts.toLong(((Number) field).intValue()));
        }

```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
      prepareDataForBuild();
      ImmutableMap.Builder<String, SoyValueProvider> finalDataBuilder =
          ImmutableMap.builderWithExpectedSize(data.size());
      // Use forEach instead of looping over the entry set to avoid allocating entrySet+entry
      // objects
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
        Map<?, V> map, Function<? super V, ? extends SoyValueProvider> valueMapper) {
      ImmutableMap.Builder<String, SoyValueProvider> builder =
          ImmutableMap.builderWithExpectedSize(map.size());
      for (Map.Entry<?, V> entry : map.entrySet()) {
        // coerce key to a string, legacy object maps always coerce keys to strings.
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
      checkArgument((more.length % 2) == 0);
      ImmutableMap.Builder<String, SoyValueProvider> map =
          ImmutableMap.<String, SoyValueProvider>builderWithExpectedSize(1 + more.length / 2)
              .put(firstKey, firstValue);
      for (int i = 0; i < more.length; i += 2) {
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
        Function<? super V, ? extends SoyValueProvider> valueMapper) {
      ImmutableMap.Builder<SoyValue, SoyValueProvider> builder =
          ImmutableMap.builderWithExpectedSize(map.size());
      map.forEach((k, v) -> builder.put(keyMapper.apply(k), valueMapper.apply(v)));
      return SoyMapImpl.forProviderMap(builder.build());
```

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jssrc/dsl/Whitespace.java`
#### Snippet
```java
  @Override
  void doFormatToken(FormattingContext ctx) {
    Splitter.on('\n').splitToStream(content()).skip(2).forEach(line -> ctx.appendBlankLine());
  }
}
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
    node.getExterns().stream()
        .map(ExternNode::getJsImpl)
        .flatMap(Streams::stream)
        .forEach(this::visit);

```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/types/SoyTypes.java`
#### Snippet
```java

  public static boolean hasProtoDep(SoyType type) {
    return Streams.stream(SoyTypes.getTypeTraverser(type, null))
        .anyMatch(t -> t.getKind() == Kind.PROTO || t.getKind() == Kind.PROTO_ENUM);
  }
```

### UnstableApiUsage
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
        writer.writeEntry(
            Names.javaFileName(namespace, fileName),
            files.get(file.getFilePath()).asCharSource().asByteSource(UTF_8));
      }
    }
```

### UnstableApiUsage
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/api/PluginRuntimeInstanceInfo.java`
#### Snippet
```java
      builder.append(plugin.toMetaInfEntry());
    }
    return CharSource.wrap(builder.toString()).asByteSource(UTF_8);
  }

```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          protected void doGen(CodeBuilder cb) {
            if (isUnsigned(field)) {
              cb.pushInt(UnsignedInts.saturatedCast(value));
            } else {
              cb.pushInt((int) value);
```

### UnstableApiUsage
'saturatedCast(long)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          protected void doGen(CodeBuilder cb) {
            if (isUnsigned(field)) {
              cb.pushInt(UnsignedInts.saturatedCast(value));
            } else {
              cb.pushInt((int) value);
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        // similar to the above, we can avoid a L2I instruction or a method call
        long value = ((IntegerNode) arg).getValue();
        int intValue = isUnsigned(field) ? UnsignedInts.saturatedCast(value) : (int) value;
        Expression boxedInt = BytecodeUtils.boxJavaPrimitive(Type.INT_TYPE, constant(intValue));
        return new Statement() {
```

### UnstableApiUsage
'saturatedCast(long)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        // similar to the above, we can avoid a L2I instruction or a method call
        long value = ((IntegerNode) arg).getValue();
        int intValue = isUnsigned(field) ? UnsignedInts.saturatedCast(value) : (int) value;
        Expression boxedInt = BytecodeUtils.boxJavaPrimitive(Type.INT_TYPE, constant(intValue));
        return new Statement() {
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedLongs.class, "parseUnsignedLong", String.class).asCheap();
  public static final MethodRef UNSIGNED_LONGS_TO_STRING =
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_INTS_SATURATED_CAST =
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(Long.class, "parseLong", String.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_LONGS_PARSE_UNSIGNED_LONG =
      create(UnsignedLongs.class, "parseUnsignedLong", String.class).asCheap();
  public static final MethodRef UNSIGNED_LONGS_TO_STRING =
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
  public static final MethodRef UNSIGNED_INTS_TO_LONG =
      create(UnsignedInts.class, "toLong", int.class).asCheap();

  public static final MethodRef LONG_TO_STRING =
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_INTS_SATURATED_CAST =
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
  public static final MethodRef UNSIGNED_INTS_TO_LONG =
      create(UnsignedInts.class, "toLong", int.class).asCheap();
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/passes/MoreCallValidationsPass.java`
#### Snippet
```java
                    .forEach(
                        templateNode ->
                            stream(SoyTypes.getTypeTraverser(templateNode.getType(), null))
                                .filter(t -> t.getKind() == SoyType.Kind.TEMPLATE)
                                .map(TemplateType.class::cast)
```

### UnstableApiUsage
'newCustomTable(java.util.Map\>, com.google.common.base.Supplier\>)' is marked unstable with @Beta
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
  public static final class Builder<T> {
    private final Table<String, String, Group.Builder<T>> nameAndVariantToGroup =
        Tables.newCustomTable(new LinkedHashMap<>(), LinkedHashMap::new);

    /** Adds the default template (not associated with any mod or variant). */
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Recursively search for protocol buffer types within the given type. */
  private static Stream<String> findProtoTypes(SoyType root, SoyTypeRegistry typeRegistry) {
    return stream(typeIterator(root, typeRegistry))
        .map(
            type -> {
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      ErrorReporter errorReporter) {
    ImmutableList.Builder<Parameter> builder =
        ImmutableList.builderWithExpectedSize(parameterList.size());
    for (ParameterP parameter : parameterList) {
      builder.add(
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      List<DataAllCallSituationP> callSituationList, SoyFileP fileProto) {
    ImmutableList.Builder<DataAllCallSituation> builder =
        ImmutableList.builderWithExpectedSize(callSituationList.size());
    for (DataAllCallSituationP call : callSituationList) {
      String templateName = call.getTemplateName();
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      ImmutableList<DataAllCallSituation> callSituationList, SoyFileNode fileNode) {
    ImmutableList.Builder<DataAllCallSituationP> builder =
        ImmutableList.builderWithExpectedSize(callSituationList.size());
    for (DataAllCallSituation call : callSituationList) {
      builder.add(
```

### UnstableApiUsage
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/AstEdits.java`
#### Snippet
```java
    }
    for (Map.Entry<ParentSoyNode<StandaloneNode>, List<StandaloneNode>> entry :
        asMap(newChildren).entrySet()) {
      entry.getKey().addChildren(entry.getValue());
    }
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
  private static ImmutableList<Parameter> directParametersFromTemplate(TemplateNode node) {
    return node.getParams().stream()
        .sorted(comparing(TemplateParam::isRequired, trueFirst()))
        .filter(p -> !p.isImplicit())
        .map(TemplateMetadata::parameterFromTemplateParam)
```

### UnstableApiUsage
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    // Count backwards from end. ilb may insert whitespace before line.
    int endingLength = ilb.getByteLength();
    int partStart = endingLength - Utf8.encodedLength(line) - /* newline */ (fullLine ? 1 : 0);

    List<Span> spans = new ArrayList<>(parts.length);
```

### UnstableApiUsage
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    // Count backwards from end. ilb may insert whitespace before line.
    int endingLength = ilb.getByteLength();
    int partStart = endingLength - Utf8.encodedLength(line) - /* newline */ (fullLine ? 1 : 0);

    List<Span> spans = new ArrayList<>(parts.length);
```

### UnstableApiUsage
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    List<Span> spans = new ArrayList<>(parts.length);
    for (String part : parts) {
      int partEnd = partStart + Utf8.encodedLength(part) - 1;
      spans.add(new Span(partStart, partEnd));
      partStart = partEnd + 1;
```

### UnstableApiUsage
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    List<Span> spans = new ArrayList<>(parts.length);
    for (String part : parts) {
      int partEnd = partStart + Utf8.encodedLength(part) - 1;
      spans.add(new Span(partStart, partEnd));
      partStart = partEnd + 1;
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/javatypes/JavaTypeUtils.java`
#### Snippet
```java

    // No records of records.
    if (Streams.stream(SoyTypes.getTypeTraverser(recordType, null))
        .anyMatch(t -> t.getKind() == Kind.RECORD && t != recordType)) {
      return ImmutableList.of();
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
    // if step does not evenly divide length add +1 to account for the fact that we always add start
    int size = length / step + (length % step == 0 ? 0 : 1);
    ImmutableList.Builder<IntegerData> list = ImmutableList.builderWithExpectedSize(size);
    if (step > 0) {
      for (int i = start; i < end; i += step) {
```

### UnstableApiUsage
'tryParse(java.lang.String, int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
      return null;
    }
    Long l = Longs.tryParse(str, radix);
    return (l == null) ? null : IntegerData.forValue(l);
  }
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java

  public static FloatData parseFloat(String str) {
    Double d = Doubles.tryParse(str);
    return (d == null || d.isNaN()) ? null : FloatData.forValue(d);
  }
```

