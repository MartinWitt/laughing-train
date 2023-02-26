# j2objc 
 
# Bad smells
I found 877 bad smells with 70 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 148 | false |
| ReturnNull | 142 | false |
| AssignmentToMethodParameter | 61 | false |
| DataFlowIssue | 54 | false |
| BoundedWildcard | 49 | false |
| EmptyMethod | 36 | false |
| SystemOutErr | 32 | false |
| UnnecessaryBoxing | 28 | false |
| SizeReplaceableByIsEmpty | 21 | true |
| UnnecessaryUnboxing | 21 | false |
| NonProtectedConstructorInAbstractClass | 20 | true |
| UnusedAssignment | 19 | false |
| UnnecessaryFullyQualifiedName | 17 | false |
| ConstantValue | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 15 | false |
| ZeroLengthArrayInitialization | 13 | false |
| CharsetObjectCanBeUsed | 13 | false |
| NestedAssignment | 12 | false |
| StringConcatenationInsideStringBufferAppend | 11 | false |
| RegExpRedundantEscape | 9 | false |
| IgnoreResultOfCall | 8 | false |
| Convert2Lambda | 8 | false |
| AssignmentToStaticFieldFromInstanceMethod | 7 | false |
| StringOperationCanBeSimplified | 7 | false |
| AssignmentToForLoopParameter | 7 | false |
| CopyConstructorMissesField | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| UnnecessaryLocalVariable | 6 | true |
| UnnecessaryReturn | 5 | true |
| RedundantSuppression | 5 | false |
| CommentedOutCode | 4 | false |
| RedundantFileCreation | 4 | false |
| UnnecessaryModifier | 3 | true |
| WhileCanBeForeach | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| CodeBlock2Expr | 3 | true |
| MethodOverridesStaticMethod | 3 | false |
| FieldMayBeStatic | 3 | false |
| ManualArrayToCollectionCopy | 3 | false |
| UnnecessarySemicolon | 3 | false |
| ComparatorCombinators | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| ConditionCoveredByFurtherCondition | 3 | false |
| UseBulkOperation | 3 | false |
| DuplicateExpressions | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| UNUSED_IMPORT | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| Convert2MethodRef | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| ExcessiveRangeCheck | 2 | false |
| LoopStatementsThatDontLoop | 1 | false |
| EmptyStatementBody | 1 | false |
| RegExpSimplifiable | 1 | false |
| RedundantMethodOverride | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| RedundantStringFormatCall | 1 | false |
| IOResource | 1 | false |
| StringEqualsCharSequence | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| RegExpRepeatedSpace | 1 | false |
| Java8MapApi | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
   * the specified output directory in an optional sub-directory.
   */
  public static enum OutputStyleOption {
    /** Use the class's package, like javac.*/
    PACKAGE,
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
    private final String delimiter;

    private OcniType(String delim) {
      delimiter = delim;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `translator/src/main/java/com/google/devtools/j2objc/types/HeaderImportCollector.java`
#### Snippet
```java
    private final boolean includePrivate;

    private Filter(boolean includePublic, boolean includePrivate) {
      this.includePublic = includePublic;
      this.includePrivate = includePrivate;
```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        return new AbstractIterator<VariableDeclarationFragment>() {
          @Override protected VariableDeclarationFragment computeNext() {
            while (fieldIter.hasNext()) {
              return fieldIter.next().getFragment();
            }
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
        || kind == Kind.INTERFACE) {
      // Skip the class/enum/interface token.
      while (src.charAt(start++) != ' ') {}
    } else if (kind != Kind.METHOD && kind != Kind.VARIABLE) {
      return getPosition(node);
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `translator/src/main/java/com/google/devtools/j2objc/translate/DeadCodeEliminator.java`
#### Snippet
```java
    ElementUtil elementUtil = unit.getEnv().elementUtil();
    Iterator<AbstractTypeDeclaration> iter = unit.getTypes().iterator();
    while (iter.hasNext()) {
      AbstractTypeDeclaration type = iter.next();
      TypeElement typeElement = type.getTypeElement();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
    Iterator<? extends TypeMirror> paramTypeIter = paramTypes.iterator();
    // Implicit assert that size(paramTypes) >= size(args). Don't cast vararg arguments.
    while (paramTypeIter.hasNext()) {
      maybeAddCast(argIter.next(), paramTypeIter.next(), false);
    }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
  protected void printAnnotations(List<Annotation> annotations) {
    Iterator<Annotation> iterator = annotations.iterator();
    while (iterator.hasNext()) {
      iterator.next().accept(this);
      sb.print(' ');
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `protobuf/tests/Proto3OptionalTest.java`
#### Snippet
```java

    // TODO(tball): b/197406391 optional enum setter method not found in generated proto.
    // TestProto3Optional.Builder builder3 =
    //     TestProto3Optional.newBuilder().setOptionalNestedEnumValue(5);
    // assertThat(builder3.hasOptionalNestedEnum()).isTrue();
```

### CommentedOutCode
Commented out code (12 lines)
in `protobuf/tests/EnumsTest.java`
#### Snippet
```java
  // TODO(kstanger): This fails with native ObjC because it doesn't sign-extend
  // when writing the negative enum value.
  /*public void testSerialization() throws Exception {
    EnumMsg msg = getFilledMessage();

```

### CommentedOutCode
Commented out code (3 lines)
in `protobuf/tests/EnumsTest.java`
#### Snippet
```java
    assertEquals(0, msg.getEnumPCount());
    // TODO(kstanger): Native ObjC behavior differs from Java behavior here.
    //assertFalse(msg.hasExtension(EnumFields.enumFe));
    //assertEquals(0, msg.getExtensionCount(EnumFields.enumRe));
    //assertEquals(0, msg.getExtensionCount(EnumFields.enumPe));
```

### CommentedOutCode
Commented out code (4 lines)
in `protobuf/tests/MessagesTest.java`
#### Snippet
```java

  // TODO(kstanger): Correct field names is not supported in the wrappers.
  /*public void testGroupName() throws Exception {
    FieldDescriptor groupField = MessageData.getDescriptor().findFieldByNumber(4);
    assertEquals("groupf", groupField.getName());
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
          builder.addMsg(NoFields.newBuilder().build());
        }
        protoReference = builder.build();
      }
    });
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
    testMemUsage(new Runnable() {
      public void run() {
        protoReference = SingleMessage.newBuilder().setMsg(NoFields.newBuilder().build()).build();
      }
    });
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
      public void run() {
        try {
          protoReference = newBuilder(protoClass);
        } catch (Exception e) {
          throw new RuntimeException(e);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
          builder.addInt(123);
        }
        protoReference = builder.build();
      }
    });
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
          ints.add(i);
        }
        protoReference = MessageWithExtensions.newBuilder()
            .setExtension(SizeTest.repeatedIntExt, ints)
            .build();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `protoReference` from instance context
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
    testMemUsage(new Runnable() {
      public void run() {
        protoReference = MessageWithExtensions.newBuilder()
            .setExtension(SizeTest.intExt, 321)
            .build();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `captureCount` from instance context
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameUtil.java`
#### Snippet
```java
      String name = captureNames.get(typeParam);
      if (name == null) {
        name = "!CAP" + captureCount++ + '!';
        captureNames.put(typeParam, name);
      }
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java

  private static final Pattern OCNI_PATTERN =
      Pattern.compile("/\\*-(\\w*)\\[(.*)\\]-\\*/", Pattern.DOTALL);

  /**
```

### RegExpRedundantEscape
Redundant character escape `\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
  private static final String TYPE_REGEX = "\\([\\w\\s\\*<>\\[\\]]+\\)";
  private static final String PARAM_REGEX = "\\s*:\\s*" + TYPE_REGEX + "\\s*\\w+";
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
      "^\\+|-\\s*" + TYPE_REGEX + "\\s*(\\w+)(" + PARAM_REGEX + "((?:" + ADDITIONAL_PARAM_REGEX
```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
  }

  private static final String TYPE_REGEX = "\\([\\w\\s\\*<>\\[\\]]+\\)";
  private static final String PARAM_REGEX = "\\s*:\\s*" + TYPE_REGEX + "\\s*\\w+";
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
```

### RegExpRedundantEscape
Redundant character escape `\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java

  private static final String TYPE_REGEX = "\\([\\w\\s\\*<>\\[\\]]+\\)";
  private static final String PARAM_REGEX = "\\s*:\\s*" + TYPE_REGEX + "\\s*\\w+";
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
```

### RegExpRedundantEscape
Redundant character escape `\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
      "^\\+|-\\s*" + TYPE_REGEX + "\\s*(\\w+)(" + PARAM_REGEX + "((?:" + ADDITIONAL_PARAM_REGEX
      + ")*))?\\s*\\{");
  private static final Pattern ADDITIONAL_PARAM_PATTERN = Pattern.compile(ADDITIONAL_PARAM_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
      "^\\+|-\\s*" + TYPE_REGEX + "\\s*(\\w+)(" + PARAM_REGEX + "((?:" + ADDITIONAL_PARAM_REGEX
      + ")*))?\\s*\\{");
  private static final Pattern ADDITIONAL_PARAM_PATTERN = Pattern.compile(ADDITIONAL_PARAM_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\*` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
      "^\\+|-\\s*" + TYPE_REGEX + "\\s*(\\w+)(" + PARAM_REGEX + "((?:" + ADDITIONAL_PARAM_REGEX
      + ")*))?\\s*\\{");
  private static final Pattern ADDITIONAL_PARAM_PATTERN = Pattern.compile(ADDITIONAL_PARAM_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java

  private static String moduleName(String moduleSource) {
    Pattern p = Pattern.compile("module\\s+([a-zA_Z_][\\.\\w]*)");
    Matcher matcher = p.matcher(moduleSource);
    if (matcher.find()) {
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java
  private static final String REFLECTION_SUPPORT_REGEX =
      "@(?:com\\.google\\.j2objc\\.annotations\\.)?ReflectionSupport\\s*"
      + "\\([^\\)]*(FULL|NATIVE_ONLY)\\s*\\)";
  // Avoid allocating a new PackageData instance for packages with no attributes.
  private static final PackageData EMPTY_DATA = new PackageData(new PackageDataBuilder());
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
        return convertInstanceOf((InstanceOfTree) javacNode, parent);
      case INTERFACE:
        return convertClassDeclaration((ClassTree) javacNode, parent);
      case IF:
        return convertIf((IfTree) javacNode, parent);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
      case LAMBDA_EXPRESSION:
        // Lambda expressions are generated as function calls that return "id".
        return TypeUtil.ID_TYPE;
      case METHOD_INVOCATION: {
        MethodInvocation invocation = (MethodInvocation) expr;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `translator/src/main/java/com/google/devtools/j2objc/gen/SignatureGenerator.java`
#### Snippet
```java
      switch (c) {
        case '.': sb.append('_');  break;
        case '/': sb.append('_');  break;
        case '_': sb.append("_1"); break;
        case ';': sb.append("_2"); break;
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[_]` can be simplified to '_'
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java

  private static final Pattern FAMILY_METHOD_REGEX =
      Pattern.compile("^[_]*(new|copy|alloc|init|mutableCopy).*");

  public static boolean needsObjcMethodFamilyNoneAttribute(String name) {
```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `text.substring(preEnd + "``".length())`
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      sb.append(text.substring(preStart + "<pre>".length(), preEnd));
      sb.append("\n@endcode");
      sb.append(text.substring(preEnd + "</pre>".length()));
    } else if (preStart > -1) {
      // The text has <pre> but not the </pre> should be in a following Javadoc tag.
```

### DuplicateExpressions
Multiple occurrences of `text.substring(preEnd + "``".length())`
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      // The text just has a </pre>.
      sb.append("\n@endcode");
      sb.append(text.substring(preEnd + "</pre>".length()));
      spanningPreTag = false;
    }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`method.getParameters().size() == 0` can be replaced with 'method.getParameters().isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/VariableRenamer.java`
#### Snippet
```java
      Set<String> staticMethodNames = new HashSet<>();
      for (ExecutableElement method : ElementUtil.getExecutables(type)) {
        if (method.getParameters().size() == 0) {
          staticMethodNames.add(nameTable.getFunctionName(method));
        }
```

### SizeReplaceableByIsEmpty
`fieldNameStack.size() > 0` can be replaced with '!fieldNameStack.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/VariableRenamer.java`
#### Snippet
```java
      // Local variable or parameter. Rename if it shares a name with a field.
      String varName = ElementUtil.getName(var);
      assert fieldNameStack.size() > 0;
      Set<String> fieldNames = fieldNameStack.get(fieldNameStack.size() - 1);
      if (fieldNames.contains(varName)) {
```

### SizeReplaceableByIsEmpty
`element.getParameters().size() > 0` can be replaced with '!element.getParameters().isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java
    String name = element.getSimpleName().toString();
    String descriptor = getMethodDescriptor(element);
    if (element.getParameters().size() > 0) {
      Iterator<ParameterDeclaration> paramsIterator = methodDecl.isConstructor()
          ? classFile.getConstructor(descriptor).getParameters().iterator()
```

### SizeReplaceableByIsEmpty
`methodMetadata.size() > 0` can be replaced with '!methodMetadata.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
        }
      }
      if (methodMetadata.size() > 0) {
        StringBuilder sb = new StringBuilder("static J2ObjcMethodInfo methods[] = {\n");
        for (String metadata : methodMetadata) {
```

### SizeReplaceableByIsEmpty
`fieldMetadata.size() > 0` can be replaced with '!fieldMetadata.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
        }
      }
      if (fieldMetadata.size() > 0) {
        StringBuilder sb = new StringBuilder("static const J2ObjcFieldInfo fields[] = {\n");
        for (String metadata : fieldMetadata) {
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavadocConverter.java`
#### Snippet
```java
    int linePos = pos(node);
    for (String line : lines) {
      if (line.length() > 0) {
        linePos = source.indexOf(line, linePos);
        int endPos = linePos + line.length();
```

### SizeReplaceableByIsEmpty
`typeElement.getInterfaces().size() > 0` can be replaced with '!typeElement.getInterfaces().isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/DeadCodeEliminator.java`
#### Snippet
```java
        } else {
          // Keep class, remove dead interfaces.
          if (typeElement.getInterfaces().size() > 0) {
            GeneratedTypeElement replacement = GeneratedTypeElement.mutableCopy(typeElement);
            for (TypeElement intrface : ElementUtil.getInterfaces(typeElement)) {
```

### SizeReplaceableByIsEmpty
`exec.getParameters().size() == 0` can be replaced with 'exec.getParameters().isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
    SuperConstructorInvocation superCall = null;
    for (ExecutableElement exec : ElementUtil.getConstructors(superClass)) {
      if (exec.getParameters().size() == 0) {
        ExecutableType execType = typeUtil
            .asMemberOf((DeclaredType) superClass.asType(), exec);
```

### SizeReplaceableByIsEmpty
`word.length() > 0` can be replaced with '!word.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
    int offset = 0;

    if (word.length() > 0 && Character.isDigit(word.codePointAt(0))) {
      // Identifiers must not start with a digit
      objcWord.append("_");
```

### SizeReplaceableByIsEmpty
`type.length() == 0` can be replaced with 'type.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java`
#### Snippet
```java
      return "[" + buildTypeSignature(type.substring(0, type.length() - 2));
    }
    if (type.length() == 0) {
      return "";
    }
```

### SizeReplaceableByIsEmpty
`cycle.size() == 0` can be replaced with 'cycle.isEmpty()'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java
    List<Edge> cycle = new ArrayList<>();
    TypeNode curNode = root;
    while (!curNode.equals(root) || cycle.size() == 0) {
      Edge nextEdge = backlinks.get(curNode);
      cycle.add(nextEdge);
```

### SizeReplaceableByIsEmpty
`operands.size() == 0` can be replaced with 'operands.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
    }

    if (operands.size() == 0) {
      if (operator == CONDITIONAL_OR) {
        // All constants must have been false, because a true value would have
```

### SizeReplaceableByIsEmpty
`method.getParameters().size() > 0` can be replaced with '!method.getParameters().isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnumRewriter.java`
#### Snippet
```java
    for (EnumConstantDeclaration constant : node.getEnumConstants()) {
      ExecutableElement method = constant.getExecutableElement();
      if (method.getParameters().size() > 0 || method.isVarArgs()) {
        return false;
      }
```

### SizeReplaceableByIsEmpty
`blockStmts.size() > 0` can be replaced with '!blockStmts.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/SwitchRewriter.java`
#### Snippet
```java
      }
    }
    if (blockStmts.size() > 0) {
      // There is at least one variable declaration, so copy this switch
      // statement into the new block and replace it in the parent list.
```

### SizeReplaceableByIsEmpty
`pkg.length() > 0` can be replaced with '!pkg.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/util/ClassFile.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    String pkg = typeRef.getPackageName().replace('.', '/');
    if (pkg.length() > 0) {
      sb.append(pkg);
      sb.append('/');
```

### SizeReplaceableByIsEmpty
`code.length() == 0` can be replaced with 'code.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSegmentedHeaderGenerator.java`
#### Snippet
```java
    String typeName = type.getTypeName();
    String code = type.getPublicDeclarationCode();
    if (code.length() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`literal.length() == 0` can be replaced with 'literal.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java

  private void addStringLiteralArgument(List<Expression> args, String literal) {
    if (literal.length() == 0) {
      return;  // Skip it.
    } else if (literal.length() == 1) {
```

### SizeReplaceableByIsEmpty
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
   */
  public static String capitalize(String s) {
    return s.length() > 0 ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : s;
  }

```

### SizeReplaceableByIsEmpty
`fields.size() > 0` can be replaced with '!fields.isEmpty()'
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
  public void testGetFieldsCompiles() throws Exception {
    Collection<FieldDescriptor> fields = TypicalData.Builder.getDescriptor().getFields();
    assertTrue(fields.size() > 0);
    fields = TypicalData.newBuilder().build().getDescriptorForType().getFields();
    assertTrue(fields.size() > 0);
```

### SizeReplaceableByIsEmpty
`fields.size() > 0` can be replaced with '!fields.isEmpty()'
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertTrue(fields.size() > 0);
    fields = TypicalData.newBuilder().build().getDescriptorForType().getFields();
    assertTrue(fields.size() > 0);
  }

```

### SizeReplaceableByIsEmpty
`exceptions.size() > 0` can be replaced with '!exceptions.isEmpty()'
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
    sb.print(")");
    List<? extends TypeMirror> exceptions = meth.getThrownTypes();
    if (exceptions.size() > 0) {
      sb.print(" throws ");
      for (int i = 0; i < exceptions.size(); ) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder outerHeader` can be replaced with 'String'
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnumRewriter.java`
#### Snippet
```java
    }

    StringBuilder outerHeader = new StringBuilder();
    StringBuilder outerImpl = new StringBuilder();

```

### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java

  public String toJson() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(String.format("{\"type\":\"%s\",\"meta\":[", type));
    stringBuilder.append(
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `annotationFound |= copyAnnotations(clause, path, newNode, newElement)`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
            copyAnnotations(node.getExtendsClause(), path, newNode, newElement);
        for (Tree clause : node.getImplementsClause()) {
          annotationFound |= copyAnnotations(clause, path, newNode, newElement);
        }
        if (annotationFound) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasModification |= isModification`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
  private void addVariableAccess(VariableElement var, Expression node, boolean isModification) {
    if (var != null && !ElementUtil.isInstanceVar(var)) {
      hasModification |= isModification;
      orderedAccesses.add(new VariableAccess(var, node, isModification));
    }
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `translator/src/main/java/com/google/devtools/j2objc/translate/LogSiteInjector.java`
#### Snippet
```java
        && isLoggingSubtype(cls, javaUtilLoggingLoggerClass)) {
      node.replaceWith(injectConvenienceMethod(methodName, node));
      return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `translator/src/main/java/com/google/devtools/j2objc/docs/ASTClassInfoPrinter.java`
#### Snippet
```java
  private static void walkSuperclassHierarchy(Class<?> node) {
    if (node.getSuperclass() == null || tree.containsKey(node.getSimpleName())) {
      return;
    } else {
      walkSuperclassHierarchy(node.getSuperclass());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
    private void visitType(TypeMirror type) {
      if (type == null) {
        return;
      } else if (TypeUtil.isIntersection(type)) {
        for (TypeMirror bound : ((IntersectionType) type).getBounds()) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
  private void addStringLiteralArgument(List<Expression> args, String literal) {
    if (literal.length() == 0) {
      return;  // Skip it.
    } else if (literal.length() == 1) {
      args.add(new CharacterLiteral(literal.charAt(0), typeUtil));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      String arg = args.next();
      if (arg.isEmpty()) {
        return;
      } else if (arg.startsWith("@")) {
        processArgsFile(arg.substring(1));
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildList.java`
#### Snippet
```java
  }

  void replaceAll(List<T> other) {
    clear();
    addAll(other);
```

### BoundedWildcard
Can generalize to `? extends T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildList.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public void copyFrom(List<T> other) {
    for (T elem : other) {
      add((T) elem.copy());
```

### BoundedWildcard
Can generalize to `? extends T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildList.java`
#### Snippet
```java
    }

    public ArrayListImpl(ArrayListImpl<T> list) {
      super(list);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/util/Mappings.java`
#### Snippet
```java
   * if that mapping was previously specified.
   */
  private static void addMapping(Map<String, String> map, String key, String value, String kind) {
    String oldValue = map.put(key,  value);
    if (oldValue != null && !oldValue.equals(value)) {
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java
  private void addMemberProperties(
      AnnotationTypeDeclaration node, List<AnnotationTypeMemberDeclaration> members,
      Map<ExecutableElement, VariableElement> fieldElements) {
    if (members.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java

  private void addConstructor(
      AnnotationTypeDeclaration node, Map<ExecutableElement, VariableElement> fieldElements) {
    TypeElement type = node.getTypeElement();
    String typeName = nameTable.getFullName(type);
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java
  private MethodDeclaration createDescriptionMethod(TypeElement type,
      List<AnnotationTypeMemberDeclaration> members,
      Map<ExecutableElement, VariableElement> fieldElements) {
    ExecutableElement descriptionElement = GeneratedExecutableElement.newMethodWithSelector(
        "description", typeUtil.getJavaString().asType(), type);
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java

  // Creates the container annotation which value is an array with the repeated annotations.
  private Expression createContainerAnnotation(List<Annotation> annotations) {
    DeclaredType annotationType = annotations.get(0).getAnnotationMirror().getAnnotationType();
    ArrayType arrayType = typeUtil.getArrayType(annotationType);
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
  }

  private Expression createAnnotations(List<Annotation> annotations) {
    // Group repeated annotations.
    LinkedHashMap<DeclaredType, List<Annotation>> groupedAnnotations = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  }

  private void addSafeVars(Set<VariableElement> vars) {
    if (scope != null && vars != null) {
      for (VariableElement var : vars) {
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
    }

    private void mergeInto(Scope targetScope, Set<VariableElement> extraVars) {
      Map<VariableElement, Boolean> vars = new HashMap<>();
      for (VariableElement var : extraVars) {
```

### BoundedWildcard
Can generalize to `? super Import`
in `translator/src/main/java/com/google/devtools/j2objc/types/Import.java`
#### Snippet
```java

  public static void addImports(
      TypeMirror type, Collection<Import> imports, TranslationEnvironment env) {
    if (type instanceof PointerType) {
      addImports(((PointerType) type).getPointeeType(), imports, env);
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
   * Finds the signatures of methods defined in the native code.
   */
  private static void findMethodSignatures(String code, Set<String> signatures) {
    if (code == null) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
  }

  private void convertArguments(ExecutableElement method, List<Expression> args) {
    List<? extends VariableElement> params = method.getParameters();
    for (int i = 0; i < args.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super ProcessingContext`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java

  private void collectGeneratedInputs(
      File dir, String currentRelativePath, List<ProcessingContext> inputs) {
    assert dir.exists() && dir.isDirectory();
    for (File f : dir.listFiles()) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java

  // Creates a javac environment from a collection of files and/or file objects.
  private JavacEnvironment createEnvironment(List<File> files, List<JavaFileObject> fileObjects,
      boolean processAnnotations) throws IOException {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
```

### BoundedWildcard
Can generalize to `? extends JavaFileObject`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
  }

  private void processDiagnostics(DiagnosticCollector<JavaFileObject> diagnostics) {
    for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
      ErrorUtil.parserDiagnostic(diagnostic);
```

### BoundedWildcard
Can generalize to `? extends ExecutablePair`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DefaultMethodShimGenerator.java`
#### Snippet
```java
    }

    private ExecutablePair resolveImplementation(Iterable<ExecutablePair> allMethods) {
      ExecutablePair impl = null;
      for (ExecutablePair method : allMethods) {
```

### BoundedWildcard
Can generalize to `? super Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DefaultMethodShimGenerator.java`
#### Snippet
```java

    private void addShimWithInvocation(
        String selector, ExecutablePair method, Expression invocation, List<Expression> args) {
      GeneratedExecutableElement element = GeneratedExecutableElement.newMethodWithSelector(
              selector, method.type().getReturnType(), typeElem)
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
  }

  private boolean shouldAddCycle(List<Edge> cycle) {
    if (restrictToList == null) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ComplexExpressionExtractor.java`
#### Snippet
```java
  }

  private void handleNode(Expression node, Collection<Expression> children) {
    if (node.getParent() instanceof Statement) {
      return;
```

### BoundedWildcard
Can generalize to `? extends ProcessingContext`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/InputFilePreprocessor.java`
#### Snippet
```java
  }

  public void processInputs(Iterable<ProcessingContext> inputs) {
    for (ProcessingContext input : inputs) {
      if (input.getFile().getUnitName().endsWith(".java")) {
```

### BoundedWildcard
Can generalize to `? extends TreeNode`
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
  }

  private String printTagFragments(List<TreeNode> fragments) {
    if (fragments.isEmpty()) {
      return "";
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/gen/PropertyGenerator.java`
#### Snippet
```java
  }

  private void processOtherAttributes(Set<String> attributes) {
    // Remove default attributes.
    attributes.remove("readwrite");
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/gen/PropertyGenerator.java`
#### Snippet
```java
  }

  private void processAccessorAttributes(Set<String> attributes) {
    // Add default getter/setter here, as each fragment needs its own attributes
    // to support its unique accessors.
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/gen/PropertyGenerator.java`
#### Snippet
```java
  }

  private void processClassAttribute(Set<String> attributes) {
    if (ElementUtil.isStatic(varElement)) {
      attributes.add("class");
```

### BoundedWildcard
Can generalize to `? super String`
in `translator/src/main/java/com/google/devtools/j2objc/gen/PropertyGenerator.java`
#### Snippet
```java
  }

  private void processNullabilityAttributes(Set<String> attributes) {
    if (options.nullability() && !varElement.asType().getKind().isPrimitive()) {
      if (ElementUtil.hasNullableAnnotation(varElement)) {
```

### BoundedWildcard
Can generalize to `? extends ProcessingContext`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/FileProcessor.java`
#### Snippet
```java
  }

  public void processInputs(Iterable<ProcessingContext> inputs) {
    for (ProcessingContext input : inputs) {
      processInput(input);
```

### BoundedWildcard
Can generalize to `? extends ProcessingContext`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java

  @Override
  protected void processOutputs(Iterable<ProcessingContext> outputs) {
    for (ProcessingContext output : outputs) {
      generateObjectiveCSource(output.getGenerationUnit());
```

### BoundedWildcard
Can generalize to `? extends Import`
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java`
#### Snippet
```java
  }

  protected void printForwardDeclarations(Set<Import> forwardDecls) {
    Set<String> forwardStmts = new TreeSet<>();
    for (Import imp : forwardDecls) {
```

### BoundedWildcard
Can generalize to `? super GeneratedType`
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java`
#### Snippet
```java

  private static void collectType(
      GeneratedType generatedType, LinkedHashSet<GeneratedType> orderedTypes,
      Map<String, GeneratedType> typeMap, LinkedHashSet<String> typeHierarchy) {
    typeHierarchy.add(generatedType.getTypeName());
```

### BoundedWildcard
Can generalize to `? extends GeneratedType`
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java`
#### Snippet
```java
  private static void collectType(
      GeneratedType generatedType, LinkedHashSet<GeneratedType> orderedTypes,
      Map<String, GeneratedType> typeMap, LinkedHashSet<String> typeHierarchy) {
    typeHierarchy.add(generatedType.getTypeName());
    for (String superType : generatedType.getSuperTypes()) {
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeDeclarationGenerator.java`
#### Snippet
```java
  }

  private boolean hasDeprecated(List<Annotation> annotations) {
    for (Annotation annotation : annotations) {
      Name annotationTypeName = annotation.getTypeName();
```

### BoundedWildcard
Can generalize to `? super Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
  }

  private void addCaptureArgs(TypeElement type, List<Expression> args) {
    for (VariableElement var : captureInfo.getCapturedVars(type)) {
      Expression path = getPathForLocalVar(var);
```

### BoundedWildcard
Can generalize to `? extends VariableElement`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaRewriter.java`
#### Snippet
```java
    }

    private void forwardRemainingArgs(Iterator<VariableElement> params, List<Expression> args) {
      while (params.hasNext()) {
        args.add(new SimpleName(params.next()));
```

### BoundedWildcard
Can generalize to `? super Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaRewriter.java`
#### Snippet
```java
    }

    private void forwardRemainingArgs(Iterator<VariableElement> params, List<Expression> args) {
      while (params.hasNext()) {
        args.add(new SimpleName(params.next()));
```

### BoundedWildcard
Can generalize to `? extends BodyDeclaration`
in `translator/src/main/java/com/google/devtools/j2objc/ast/SignatureASTPrinter.java`
#### Snippet
```java

  @Override
  protected void sort(List<BodyDeclaration> lst) {
    lst.sort(Comparator.comparing(BodyDeclaration::toString));
  }
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java`
#### Snippet
```java
  }

  private void printMethodInvocationNameAndArgs(String selector, List<Expression> args) {
    String[] selParts = selector.split(":");
    if (args.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
  }

  private CStringLiteral getStrcatTypesCString(List<Expression> operands) {
    StringBuilder typeArg = new StringBuilder();
    for (Expression expr : operands) {
```

### BoundedWildcard
Can generalize to `? super Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
  }

  private void addStringLiteralArgument(List<Expression> args, String literal) {
    if (literal.length() == 0) {
      return;  // Skip it.
```

### BoundedWildcard
Can generalize to `? extends TypeNode`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
  private List<List<TypeNode>> stronglyConnectedComponents = new ArrayList<>();

  private Tarjans(SetMultimap<TypeNode, Edge> edges, Set<TypeNode> seedTypes) {
    this.edges = edges;
    this.seedTypes = seedTypes;
```

### BoundedWildcard
Can generalize to `? extends TypeMirror`
in `translator/src/main/java/com/google/devtools/j2objc/types/ImplementationImportCollector.java`
#### Snippet
```java
  }

  private void addImports(Iterable<TypeMirror> types) {
    for (TypeMirror type : types) {
      addImports(type);
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
  }

  public static Annotation getAnnotation(Class<?> annotationClass, List<Annotation> annotations) {
    for (Annotation annotation : annotations) {
      TypeMirror annotationType = annotation.getAnnotationMirror().getAnnotationType();
```

### BoundedWildcard
Can generalize to `? super T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
   * double-parented in the process.
   */
  public static <T> void moveList(List<T> fromList, List<T> toList) {
    for (Iterator<T> iter = fromList.iterator(); iter.hasNext(); ) {
      T elem = iter.next();
```

### BoundedWildcard
Can generalize to `? extends T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T extends TreeNode> void copyList(List<T> fromList, List<T> toList) {
    for (T elem : fromList) {
      toList.add((T) elem.copy());
```

### BoundedWildcard
Can generalize to `? super T`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T extends TreeNode> void copyList(List<T> fromList, List<T> toList) {
    for (T elem : fromList) {
      toList.add((T) elem.copy());
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ArrayRewriter.java`
#### Snippet
```java

  private MethodInvocation newMultiDimensionArrayInvocation(
      ArrayType arrayType, List<Expression> dimensions, boolean retainedResult) {
    assert dimensions.size() > 1;
    TypeMirror componentType = arrayType;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ArrayRewriter.java`
#### Snippet
```java

  private MethodInvocation newInitializedArrayInvocation(
      ArrayType arrayType, List<Expression> elements, boolean retainedResult) {
    TypeMirror componentType = arrayType.getComponentType();
    TypeElement iosArrayElement = typeUtil.getIosArray(componentType);
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
  }

  public Expression createObjectArray(List<Expression> expressions, ArrayType arrayType) {
    if (expressions.isEmpty()) {
      return new ArrayCreation(arrayType, typeUtil, 0);
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTDump.java`
#### Snippet
```java
    File outputFile = new File(
        unit.getEnv().options().fileUtil().getOutputDirectory(), relativeOutputPath);
    outputFile.getParentFile().mkdirs();

    try (FileOutputStream fout = new FileOutputStream(outputFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
    try {
      if (!outputMappingFile.exists()) {
        outputMappingFile.getParentFile().mkdirs();
        outputMappingFile.createNewFile();
      }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
      if (!outputMappingFile.exists()) {
        outputMappingFile.getParentFile().mkdirs();
        outputMappingFile.createNewFile();
      }
      PrintWriter writer = new PrintWriter(outputMappingFile, "UTF-8");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
  public static File createTempDir(String dirname) throws IOException {
    File tmpDirectory = File.createTempFile(dirname, ".tmp");
    tmpDirectory.delete();
    if (!tmpDirectory.mkdir()) {
      throw new IOException("Could not create tmp directory: " + tmpDirectory.getPath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
    if (headerOutputDirectory != null) {
      if (!headerOutputDirectory.exists()) {
        headerOutputDirectory.mkdirs();
      }
      return headerOutputDirectory;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
          deleteTempDir(f);
        } else {
          f.delete();
        }
      }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
        }
      }
      dir.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
  public File getOutputDirectory() {
    if (!outputDirectory.exists()) {
      outputDirectory.mkdirs();
    }
    return outputDirectory;
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
            List<Expression> operands = infixExpr.getOperands();
            Boolean lastOperand = getKnownValue(operands.get(operands.size() - 1));
            if (lastOperand != null && lastOperand.booleanValue() == (op == CONDITIONAL_OR)) {
              return lastOperand;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
        case BOOLEAN:
          // Convert boolean values of 1/0 as true/false.
          value = ((Integer) value).intValue() == 1;
          break;
        case CHAR:
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String generate(Long value) {
    if (value.longValue() == Long.MIN_VALUE) {
      return "((jlong) 0x8000000000000000LL)";
    } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
  public static String generate(Object value) {
    if (value instanceof Boolean) {
      return ((Boolean) value).booleanValue() ? "true" : "false";
    } else if (value instanceof Character) {
      return UnicodeUtils.escapeCharLiteral(((Character) value).charValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      return ((Boolean) value).booleanValue() ? "true" : "false";
    } else if (value instanceof Character) {
      return UnicodeUtils.escapeCharLiteral(((Character) value).charValue());
    } else if (value instanceof Number) {
      return generate((Number) value);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String generate(Double value) {
    double d = ((Double) value).doubleValue();
    if (Double.isNaN(d)) {
      return "NAN";
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String generate(Float value) {
    float f = value.floatValue();
    if (Float.isNaN(f)) {
      return "NAN";
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String generate(Integer value) {
    if (value.intValue() == Integer.MIN_VALUE) {
      return "((jint) 0x80000000)";
    } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(3, list.size());
    builder.setRepeatedInt32(1, 4);
    assertEquals(4, list.get(1).intValue());
    builder.clearRepeatedInt32();
    assertEquals(3, list.size());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(2, builder.getExtensionCount(Typical.myRepeatedPrimitiveExtension));
    assertEquals(
        111, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 0)).intValue());
    assertEquals(
        222, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
        111, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 0)).intValue());
    assertEquals(
        222, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());

    builder.setExtension(Typical.myRepeatedPrimitiveExtension, 0, 333);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(2, builder.getExtensionCount(Typical.myRepeatedPrimitiveExtension));
    assertEquals(
        333, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 0)).intValue());
    assertEquals(
        222, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
        333, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 0)).intValue());
    assertEquals(
        222, ((Integer) builder.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals("bar", data.getMyString());
    if (withExtensions) {
      assertEquals(45, ((Integer) data.getExtension(Typical.myPrimitiveExtension)).intValue());
    }
  }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    result = data.getField(fields[13]);
    assertTrue(result instanceof Float);
    assertEquals(43.8, ((Float) result).floatValue(), 0.0001);
    result = data.getField(fields[14]);
    assertTrue(result instanceof Double);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    result = data.getField(fields[14]);
    assertTrue(result instanceof Double);
    assertEquals(44.5, ((Double) result).doubleValue(), 0.0001);
    result = data.getField(fields[15]);
    assertTrue(result instanceof String);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(2, data.getRepeatedFieldCount(fields[7]));
    result = data.getRepeatedField(fields[7], 1);
    assertEquals(3.4, ((Double) result).doubleValue(), 0.0001);
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

  private void checkGetExtensions(TypicalDataOrBuilder data) {
    assertEquals(123, ((Integer) data.getExtension(Typical.myPrimitiveExtension)).intValue());
    Object msg = data.getExtension(Typical.myExtension);
    assertTrue(msg instanceof TypicalDataMessage);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(3, data.getExtensionCount(Typical.myRepeatedPrimitiveExtension));
    assertEquals(2,
        ((Integer) data.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());
    assertEquals(3,
        ((Integer) data.getExtension(Typical.myRepeatedPrimitiveExtension, 2)).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
        ((Integer) data.getExtension(Typical.myRepeatedPrimitiveExtension, 1)).intValue());
    assertEquals(3,
        ((Integer) data.getExtension(Typical.myRepeatedPrimitiveExtension, 2)).intValue());
    assertEquals(2, data.getExtensionCount(Typical.myRepeatedExtension));
    result = data.getExtension(Typical.myRepeatedExtension, 1);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    result = data.getExtension(Typical.myBoolExtension);
    assertEquals(Boolean.TRUE, result);
    assertEquals(456, ((Integer) data.getExtension(MsgWithNestedExtensions.intExt)).intValue());
  }

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `validateInner()` only delegates to its super method
in `translator/src/main/java/com/google/devtools/j2objc/ast/Type.java`
#### Snippet
```java

  @Override
  public void validateInner() {
    super.validateInner();
  }
```

## RuleId[ruleID=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '_' inside character class
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java

  private static String moduleName(String moduleSource) {
    Pattern p = Pattern.compile("module\\s+([a-zA_Z_][\\.\\w]*)");
    Matcher matcher = p.matcher(moduleSource);
    if (matcher.find()) {
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.ByteArrayOutputStream;`
in `protobuf/tests/EnumsTest.java`
#### Snippet
```java

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Method;`
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
import com.google.j2objc.annotations.AutoreleasePool;
import com.google.protobuf.AbstractMessage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`i = i / 26` could be simplified to 'i /= 26'
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaRewriter.java`
#### Snippet
```java
    while (true) {
      sb.append((char) ('a' + (i % 26)));
      i = i / 26;
      if (i == 0) {
        break;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
    try (BufferedReader br = new BufferedReader(r)) {
      String line;
      while ((line = br.readLine()) != null) {
        Properties props = new Properties();
        props.load(new StringReader(line));
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
    int startPos = 0;
    int endPos = 0;
    while ((startPos = source.indexOf(delim, endPos)) > -1) {
      endPos = source.indexOf(endDelim, startPos);
      if (endPos > startPos) {
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      int i = index - 1;
      char c;
      while (i >= 0 && (c = source.charAt(i)) != '\n') {
        if (c != '*' && !Character.isWhitespace(c)) {
          // Pre tag embedded in other text, so no indent.
```

### NestedAssignment
Result of assignment expression used
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/ClassHierarchyAnalyzer.java`
#### Snippet
```java

  private static void markOverriddenMemberLive(Type type, String memberName) {
    while ((type = type.getSuperClass()) != null) {
      Member member = type.getMemberByName(memberName);
      if (member != null && member.isPolymorphic()) {
```

### NestedAssignment
Result of assignment expression used
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/RapidTypeAnalyser.java`
#### Snippet
```java

  private static void markOverriddenMembersPotentiallyLive(Type type, String memberSignature) {
    while ((type = type.getSuperClass()) != null) {
      Member member = type.getMemberBySignature(memberSignature);
      if (member != null && member.isPolymorphic()) {
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    }
    Scope lastScope = scope;
    while (!(scope = scope.outer).declaredVars.contains(var)) {
      // Except for the top scope, only include CLASS scopes when generating the path.
      if (scope == lastScope.outerClass) {
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/util/CaptureInfo.java`
#### Snippet
```java
  private String getCaptureFieldName(VariableElement var, TypeElement type) {
    int suffix = 0;
    while ((type = ElementUtil.getSuperclass(type)) != null && ElementUtil.isLocal(type)) {
      suffix++;
    }
```

### NestedAssignment
Result of assignment expression used
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java

  private void visit(Vertex v) {
    v.index = v.lowlink = vIndex++;
    stack.add(v);

```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
      byte[] buf = new byte[1024];
      int n;
      while ((n = inputStream.read(buf)) > 0) {
        outputStream.write(buf, 0, n);
      }
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      ImmutableSet.Builder<String> builder = ImmutableSet.builder();
      String line;
      while ((line = lines.readLine()) != null) {
        if (line.startsWith("#")) {
          continue;
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/translate/ArrayRewriter.java`
#### Snippet
```java
    if (assignable) {
      funcName += "Ref";
      returnType = declaredReturnType = new PointerType(componentType);
    }
    FunctionElement element = new FunctionElement(funcName, declaredReturnType, iosArrayElement)
```

### NestedAssignment
Result of assignment expression used
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
    public boolean visit(MethodDeclaration node) {
      if (isFunctionizingCandidate(node)) {
        infoMap.put(node.getExecutableElement(), currentMethod = new MethodInfo());
      }
      return true;
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    });
    if (ElementUtil.isLocal(creationElement)) {
      onExitScope(creationElement, () -> {
        addCaptureArgs(creationElement, node.getCreationCaptureArgs());
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    TypeElement typeElement = (TypeElement) node.getExecutableElement().getEnclosingElement();
    if (node.getExpression() == null) {
      whenNeedsOuterParam(typeElement, () -> {
        node.setExpression(getOuterPathInherited(ElementUtil.getDeclaringClass(typeElement)));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    }
    if (ElementUtil.isLocal(typeElement)) {
      onExitScope(typeElement, () -> {
        addCaptureArgs(typeElement, node.getCaptureArgs());
      });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `outputs` are updated, but never queried
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java

  private final CodeReferenceMap deadCodeMap;
  private final List<GenerationUnit> outputs = new ArrayList<>();
  private int processedCount = 0;

```

### MismatchedCollectionQueryUpdate
Contents of collection `currentTypeNameScope` are updated, but never queried
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java

    // Scope containing data for the current type being processed.
    private final Deque<String> currentTypeNameScope = new ArrayDeque<>();
    private final Deque<TypeInfo.Builder> currentTypeInfoScope = new ArrayDeque<>();

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(AnnotationTypeMemberDeclaration node) {}

  public boolean visit(ArrayAccess node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(ArrayType node) {}

  public boolean visit(AssertStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(BlockComment node) {}

  public boolean visit(BooleanLiteral node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(BooleanLiteral node) {}

  public boolean visit(BreakStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(CStringLiteral node) {}

  public boolean visit(CastExpression node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(CatchClause node) {}

  public boolean visit(CharacterLiteral node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(CharacterLiteral node) {}

  public boolean visit(ClassInstanceCreation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(CommaExpression node) {}

  public boolean visit(CompilationUnit node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(EmptyStatement node) {}

  public boolean visit(EnhancedForStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(ExpressionStatement node) {}

  public boolean visit(FieldAccess node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(FunctionDeclaration node) {}

  public boolean visit(FunctionInvocation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(IntersectionType node) {}

  public boolean visit(Javadoc node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(Javadoc node) {}

  public boolean visit(LabeledStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(LineComment node) {}

  public boolean visit(MarkerAnnotation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(MemberValuePair node) {}

  public boolean visit(MethodDeclaration node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(NativeDeclaration node) {}

  public boolean visit(NativeExpression node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(NativeExpression node) {}

  public boolean visit(NativeStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(NativeStatement node) {}

  public boolean visit(NormalAnnotation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(NullLiteral node) {}

  public boolean visit(NumberLiteral node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(NumberLiteral node) {}

  public boolean visit(PackageDeclaration node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(ParameterizedType node) {}

  public boolean visit(ParenthesizedExpression node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(PrimitiveType node) {}

  public boolean visit(PropertyAnnotation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(QualifiedType node) {}

  public boolean visit(ReturnStatement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(SimpleType node) {}

  public boolean visit(SingleMemberAnnotation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(StringLiteral node) {}

  public boolean visit(SuperConstructorInvocation node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(SuperFieldAccess node) {}

  public boolean visit(SwitchCase node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(TagElement node) {}

  public boolean visit(TextElement node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(TextElement node) {}

  public boolean visit(ThisExpression node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(TryStatement node) {}

  public boolean visit(TypeDeclaration node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(TypeDeclarationStatement node) {}

  public boolean visit(TypeLiteral node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(TypeLiteral node) {}

  public boolean visit(TypeMethodReference node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(UnionType node) {}

  public boolean visit(VariableDeclarationExpression node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(VariableDeclarationExpression node) {}

  public boolean visit(VariableDeclarationFragment node) {
```

### EmptyMethod
The method is empty
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeVisitor.java`
#### Snippet
```java
  }

  public void endVisit(VariableDeclarationStatement node) {}

  public boolean visit(WhileStatement node) {
```

### EmptyMethod
Method only calls its super
in `translator/src/main/java/com/google/devtools/j2objc/ast/Type.java`
#### Snippet
```java

  @Override
  public void validateInner() {
    super.validateInner();
  }
```

### EmptyMethod
All implementations of this method are empty
in `translator/src/main/java/com/google/devtools/j2objc/util/Parser.java`
#### Snippet
```java
   * Set whether to include doc comment AST nodes.
   */
  public abstract void setEnableDocComments(boolean enable);

  /**
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  // Whether this declaration should be placed inside or outside the @interface
  // or @implementation block.
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  // or @implementation block.
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
  private List<TypeMirror> implementationImportTypes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
  private List<TypeMirror> implementationImportTypes = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/CompilationUnit.java`
#### Snippet
```java
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
  private final ChildLink<PackageDeclaration> packageDeclaration =
      ChildLink.create(PackageDeclaration.class, this);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/CompilationUnit.java`
#### Snippet
```java
  private final int[] newlines;
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
  private final ChildLink<PackageDeclaration> packageDeclaration =
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/CompilationUnit.java`
#### Snippet
```java
  private final String source;
  private final int[] newlines;
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildLink.java`
#### Snippet
```java
  private final Class<T> childType;
  private final TreeNode parent;
  private T child = null;

  public ChildLink(Class<T> childType, TreeNode parent) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ConstructorInvocation.java`
#### Snippet
```java

  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildList.java`
#### Snippet
```java
   */
  private static class ArrayListImpl<T> extends ArrayList<T> {
    private int count = 0;

    public ArrayListImpl() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/TimeTracker.java`
#### Snippet
```java

    long[] lastTicks = new long[16];
    int currentLevel = 0;
    List<String> entries = Lists.newArrayList();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
  private boolean includeGeneratedSources = false;

  private List<String> inputMappingFiles = null;
  private File outputMappingFile = null;
  private final Map<String, String> map = Maps.newHashMap();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
  // Variant of SOURCE style. Annotation generated sources are included in the same output as the
  // source they are generated from.
  private boolean includeGeneratedSources = false;

  private List<String> inputMappingFiles = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java

  private List<String> inputMappingFiles = null;
  private File outputMappingFile = null;
  private final Map<String, String> map = Maps.newHashMap();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
  // Variant of SOURCE style. Sources from .jar files are combined into a single output header and
  // source file.
  private boolean combineJars = false;
  // Variant of SOURCE style. Annotation generated sources are included in the same output as the
  // source they are generated from.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
    // Use a LinkedHashMap so that we can de-dupe values that are added to the pointer table.
    private final LinkedHashMap<String, Integer> pointers = new LinkedHashMap<>();
    private int annotationFuncCount = 0;

    private MetadataGenerator(AbstractTypeDeclaration typeNode, List<Statement> stmts) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/TypeDeclaration.java`
#### Snippet
```java

  // DeadCodeEliminator will set this field if this class is marked as unused
  private boolean stripSupertypes = false;

  private final ChildLink<Expression> superOuter = ChildLink.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/TypeDeclaration.java`
#### Snippet
```java
public class TypeDeclaration extends AbstractTypeDeclaration {

  private boolean isInterface = false;

  // DeadCodeEliminator will set this field if this class is marked as unused
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SwitchCase.java`
#### Snippet
```java
public class SwitchCase extends Statement {

  private boolean isDefault = false;
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  // Identifies the node from which safeVarsTrue and safeVarsFalse have been
  // assigned.
  private Expression conditionalSafeVarsNode = null;

  private static final Set<VariableElement> EMPTY_VARS = Collections.emptySet();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  // These sets are used to pass down to parent nodes the set of variables that
  // are safe given that the expression is true or false.
  private Set<VariableElement> safeVarsTrue = null;
  private Set<VariableElement> safeVarsFalse = null;
  // Identifies the node from which safeVarsTrue and safeVarsFalse have been
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
    // Saves unsafe vars to be applied the next time this scope becomes the top
    // of the stack.
    private Map<VariableElement, Boolean> mergedVars = null;

    private Scope(Scope next, Kind kind, String label) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
    // Indicates that control flow does not continue through the end of this
    // scope because of a return, throw, break or continue.
    private boolean terminates = false;
    private final Map<VariableElement, Boolean> vars = new HashMap<>();
    // Saves unsafe vars to be applied the next time this scope becomes the top
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  // are safe given that the expression is true or false.
  private Set<VariableElement> safeVarsTrue = null;
  private Set<VariableElement> safeVarsFalse = null;
  // Identifies the node from which safeVarsTrue and safeVarsFalse have been
  // assigned.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  // Scope is added to the stack when entering conditionally executed code such
  // as if-statements, loops, conditional operators (&&, ||).
  private Scope scope = null;

  // These sets are used to pass down to parent nodes the set of variables that
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/BodyDeclaration.java`
#### Snippet
```java
  private int modifiers = 0;
  // True if this node can be declared in the implementation and not the header.
  private boolean hasPrivateDeclaration = false;
  protected ChildLink<Javadoc> javadoc = ChildLink.create(Javadoc.class, this);
  protected ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/BodyDeclaration.java`
#### Snippet
```java
public abstract class BodyDeclaration extends TreeNode {

  private int modifiers = 0;
  // True if this node can be declared in the implementation and not the header.
  private boolean hasPrivateDeclaration = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ClassInstanceCreation.java`
#### Snippet
```java
  // Indicates that this expression leaves the created object with a retain
  // count of 1. (i.e. does not call autorelease)
  private boolean hasRetainedResult = false;
  private final ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private final ChildList<Expression> captureArgs = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ClassInstanceCreation.java`
#### Snippet
```java

  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
  // Indicates that this expression leaves the created object with a retain
  // count of 1. (i.e. does not call autorelease)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/InitializationNormalizer.java`
#### Snippet
```java
    private final List<Statement> initStatements;
    private final List<Statement> classInitStatements;
    private int constInitIdx = 0;

    private TypeNormalizer(AbstractTypeDeclaration node) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionDeclaration.java`
#### Snippet
```java
      ChildList.create(SingleVariableDeclaration.class, this);
  private final ChildLink<Block> body = ChildLink.create(Block.class, this);
  private String jniSignature = null;

  public FunctionDeclaration(FunctionDeclaration other) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionDeclaration.java`
#### Snippet
```java

  private String name = null;
  private boolean returnsRetained = false;
  private final ChildLink<Type> returnType = ChildLink.create(Type.class, this);
  private final ChildList<SingleVariableDeclaration> parameters =
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionDeclaration.java`
#### Snippet
```java
public class FunctionDeclaration extends BodyDeclaration {

  private String name = null;
  private boolean returnsRetained = false;
  private final ChildLink<Type> returnType = ChildLink.create(Type.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/PostfixExpression.java`
#### Snippet
```java
  }

  private Operator operator = null;
  private ChildLink<Expression> operand = ChildLink.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NumberLiteral.java`
#### Snippet
```java
public class NumberLiteral extends Expression {

  private String token = null;
  private final TypeMirror typeMirror;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedVariableElement.java`
#### Snippet
```java

  private final TypeMirror type;
  private boolean nonnull = false;
  private boolean isWeak = false;
  private String typeQualifiers;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedVariableElement.java`
#### Snippet
```java
  private final TypeMirror type;
  private boolean nonnull = false;
  private boolean isWeak = false;
  private String typeQualifiers;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperConstructorInvocation.java`
#### Snippet
```java

  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
  private final ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeStatement.java`
#### Snippet
```java
public class NativeStatement extends Statement {

  private String code = null;

  public NativeStatement(NativeStatement other) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SingleVariableDeclaration.java`
#### Snippet
```java
public class SingleVariableDeclaration extends VariableDeclaration {

  private boolean isVarargs = false;
  private final ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private final ChildLink<Type> type = ChildLink.create(Type.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ConditionalExpression.java`
#### Snippet
```java
public class ConditionalExpression extends Expression {

  private TypeMirror typeMirror = null;

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationStatement.java`
#### Snippet
```java
public class VariableDeclarationStatement extends Statement {

  private int modifiers = 0;
  protected ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private ChildList<VariableDeclarationFragment> fragments =
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
  private List<String> sourceFiles = Lists.newArrayList();
  private String fileEncoding = System.getProperty("file.encoding", "UTF-8");
  private boolean printReferenceGraph = false;
  private SourceVersion sourceVersion = null;
  private final ExternalAnnotations externalAnnotations = new ExternalAnnotations();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
  private String fileEncoding = System.getProperty("file.encoding", "UTF-8");
  private boolean printReferenceGraph = false;
  private SourceVersion sourceVersion = null;
  private final ExternalAnnotations externalAnnotations = new ExternalAnnotations();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
  // The default source version number if not passed with -source is determined from the system
  // properties of the running java version after parsing the argument list.
  private SourceVersion sourceVersion = null;

  public List<String> getSourceFiles() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
  private List<String> sourceFiles = Lists.newArrayList();
  private String fileEncoding = System.getProperty("file.encoding", "UTF-8");
  private boolean treatWarningsAsErrors = false;
  private boolean useClassHierarchyAnalyzer = false;
  private File treeShakerRoots;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
  private String fileEncoding = System.getProperty("file.encoding", "UTF-8");
  private boolean treatWarningsAsErrors = false;
  private boolean useClassHierarchyAnalyzer = false;
  private File treeShakerRoots;
  private File outputFile = new File("tree-shaker-report.txt");
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
  private final List<List<Edge>> cycles = new ArrayList<>();

  private ReferenceGraph referenceGraph = null;

  static {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java

  // True when a <pre> tag is in a Javadoc comment, but not the closing </pre>.
  boolean spanningPreTag = false;

  // True with a <style> tag is in a Javadoc comment, but not the closing </style>.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java

  // True with a <style> tag is in a Javadoc comment, but not the closing </style>.
  boolean spanningStyleTag = false;

  // All escapes are defined at "http://dev.w3.org/html5/html-author/charref".
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FieldAccess.java`
#### Snippet
```java
public class FieldAccess extends Expression {

  private VariableElement variableElement = null;
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnumConstantDeclaration.java`
#### Snippet
```java
  private VariableElement variableElement = null;
  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);
  private final ChildLink<TypeDeclaration> anonymousClassDeclaration =
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnumConstantDeclaration.java`
#### Snippet
```java
public class EnumConstantDeclaration extends BodyDeclaration {

  private VariableElement variableElement = null;
  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperMethodInvocation.java`
#### Snippet
```java

  private ExecutablePair method = ExecutablePair.NULL;
  private TypeMirror varargsType = null;
  private final ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  // Resolved by OuterReferenceResolver.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
  private final CodeReferenceMap deadCodeMap;
  private final List<GenerationUnit> outputs = new ArrayList<>();
  private int processedCount = 0;

  public TranslationProcessor(Parser parser, CodeReferenceMap deadCodeMap) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/SourceBuilder.java`
#### Snippet
```java
  private final StringBuilder buffer = new StringBuilder();
  private String currentFile;
  private int indention = 0;
  private int currentLine = -1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
  private int count = 1;
  private List<VariableAccess> orderedAccesses = Lists.newArrayList();
  private TreeNode currentTopNode = null;
  private boolean hasModification = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
  private List<VariableAccess> orderedAccesses = Lists.newArrayList();
  private TreeNode currentTopNode = null;
  private boolean hasModification = false;

  public UnsequencedExpressionRewriter(CompilationUnit unit) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
public class UnsequencedExpressionRewriter extends UnitTreeVisitor {

  private ExecutableElement currentMethod = null;
  private int count = 1;
  private List<VariableAccess> orderedAccesses = Lists.newArrayList();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private String outputPath;
  private int numUnits = 0;
  private int receivedUnits = 0;
  // It is useful for the generated code to be consistent. Therefore, the
  // ordering of generated code within this unit should be consistent. For this
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
  private boolean hasWeakFields = false;
  private final Options options;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private State state = State.ACTIVE;
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
  private boolean hasWeakFields = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java

  private String outputPath;
  private int numUnits = 0;
  private int receivedUnits = 0;
  // It is useful for the generated code to be consistent. Therefore, the
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
  private boolean hasWeakFields = false;
  private final Options options;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private final String sourceName;
  private State state = State.ACTIVE;
  private boolean hasIncompleteProtocol = false;
  private boolean hasIncompleteImplementation = false;
  private boolean hasNullabilityAnnotations = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/AnnotationTypeMemberDeclaration.java`
#### Snippet
```java
public final class AnnotationTypeMemberDeclaration extends BodyDeclaration {

  private ExecutableElement element = null;
  private ChildLink<Expression> defaultValue = ChildLink.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayInitializer.java`
#### Snippet
```java
public class ArrayInitializer extends Expression {

  private ArrayType typeMirror = null;

  private ChildList<Expression> expressions = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java
  private final TypeElement declaringClass;
  private List<TypeMirror> parameterTypes = new ArrayList<>();
  private boolean isVarargs = false;
  private boolean isMacro = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java
  private List<TypeMirror> parameterTypes = new ArrayList<>();
  private boolean isVarargs = false;
  private boolean isMacro = false;

  public FunctionElement(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/PackageDeclaration.java`
#### Snippet
```java
public class PackageDeclaration extends TreeNode {

  private PackageElement packageElement = null;
  private ChildLink<Javadoc> javadoc = ChildLink.create(Javadoc.class, this);
  private ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeExpression.java`
#### Snippet
```java

  private String code = null;
  private TypeMirror typeMirror = null;
  private List<TypeMirror> importTypes = Lists.newArrayList();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeExpression.java`
#### Snippet
```java
public class NativeExpression extends Expression {

  private String code = null;
  private TypeMirror typeMirror = null;
  private List<TypeMirror> importTypes = Lists.newArrayList();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    private final Queue<Runnable> onOuterParam;
    // The following fields are used only by CLASS scope kinds.
    private int constructorCount = 0;
    private int constructorsNotNeedingSuperOuterScope = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java

  private final CaptureInfo captureInfo;
  private Scope topScope = null;

  public OuterReferenceResolver(CompilationUnit unit) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    // The following fields are used only by CLASS scope kinds.
    private int constructorCount = 0;
    private int constructorsNotNeedingSuperOuterScope = 0;

    private Scope(Scope outer, TypeElement type) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclaration.java`
#### Snippet
```java

  private VariableElement variableElement;
  private int extraDimensions = 0;
  protected ChildLink<Expression> initializer = ChildLink.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java

  private ExecutableElement executableElement = null;
  private Name name = null;
  private boolean isConstructor = false;
  private boolean hasDeclaration = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
public class MethodDeclaration extends BodyDeclaration {

  private ExecutableElement executableElement = null;
  private Name name = null;
  private boolean isConstructor = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
  private boolean isConstructor = false;
  private boolean hasDeclaration = true;
  private boolean isUnavailable = false;
  private ChildList<SingleVariableDeclaration> parameters =
      ChildList.create(SingleVariableDeclaration.class, this);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
  private ExecutableElement executableElement = null;
  private Name name = null;
  private boolean isConstructor = false;
  private boolean hasDeclaration = true;
  private boolean isUnavailable = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnumDeclaration.java`
#### Snippet
```java

  // DeadCodeEliminator will set this field if this enum is marked as unused
  private boolean stripSuperInterfaces = false;

  private ChildList<EnumConstantDeclaration> enumConstants =
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperFieldAccess.java`
#### Snippet
```java
public class SuperFieldAccess extends Expression {

  private VariableElement variableElement = null;
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  private TypeMirror typeMirror = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperFieldAccess.java`
#### Snippet
```java
  private VariableElement variableElement = null;
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  private TypeMirror typeMirror = null;

  public SuperFieldAccess() {}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/GenerationBatch.java`
#### Snippet
```java
  private final List<ProcessingContext> inputs = Lists.newArrayList();

  private GenerationUnit globalCombinedUnit = null;

  public GenerationBatch(Options options){
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ThisExpression.java`
#### Snippet
```java
public class ThisExpression extends Expression {

  private TypeMirror typeMirror = null;
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/PrefixExpression.java`
#### Snippet
```java
  }

  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildLink<Expression> operand = ChildLink.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/PrefixExpression.java`
#### Snippet
```java

  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildLink<Expression> operand = ChildLink.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
  private Set<VariableElement> retainedLocalCandidates = new HashSet<>();
  private boolean maybeRetainMethodReturn = false;
  private boolean methodIsConstructorOrDestructor = false;

  public OperatorRewriter(CompilationUnit unit) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
  private final LinkedList<Set<VariableElement>> retainedLocalCandidateStack = new LinkedList<>();
  private Set<VariableElement> retainedLocalCandidates = new HashSet<>();
  private boolean maybeRetainMethodReturn = false;
  private boolean methodIsConstructorOrDestructor = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java

  // Counter to create unique local variables for the RetainedWith target.
  private int rwCount = 0;

  // Gets the target object for a call to the RetainedWith wrapper.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodInvocation.java`
#### Snippet
```java
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
  private TypeMirror varargsType = null;
  private final ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodInvocation.java`
#### Snippet
```java
  private ExecutablePair method = ExecutablePair.NULL;
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
  private TypeMirror varargsType = null;
  private final ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
  private final SetMultimap<TypeNode, Edge> edges;
  private final Set<TypeNode> seedTypes;
  private int vIndex = 0;
  // In case of performance issues, consider a data structure with faster .contains().
  private ArrayList<Vertex> stack = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
  private FunctionElement functionElement = null;
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
  private boolean hasRetainedResult = false;
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
  private boolean hasRetainedResult = false;
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
public class FunctionInvocation extends Expression {

  private FunctionElement functionElement = null;
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
  private List<String> classPathEntries = new ArrayList<>();
  private File outputDirectory = new File(".");
  private File headerOutputDirectory = null;
  private String fileEncoding = System.getProperty("file.encoding", "UTF-8");
  private Charset charset = Charset.forName(fileEncoding);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java
    private boolean isEmpty = true;
    private String objectiveCName = null;
    private boolean parametersAreNonnullByDefault = false;
    private ReflectionSupport.Level reflectionSupportLevel;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java

    private boolean isEmpty = true;
    private String objectiveCName = null;
    private boolean parametersAreNonnullByDefault = false;
    private ReflectionSupport.Level reflectionSupportLevel;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayCreation.java`
#### Snippet
```java
  // Indicates that this expression leaves the created object with a retain
  // count of 1. (i.e. does not call autorelease)
  private boolean hasRetainedResult = false;
  private final ChildLink<ArrayType> arrayType =
      ChildLink.create(ArrayType.class, this);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/GeneratedSourceMappings.java`
#### Snippet
```java

  private final Set<Mapping> mappings = new HashSet<>();
  private int targetOffset = 0;

  public void addMethodMapping(MethodDeclaration methodDeclaration, int targetBegin, int length) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java

    private final Statement lonelyStatement;
    private List<Statement> delegate = null;

    public LonelyStatementList(Statement stmt) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean deprecatedDeclarations = false;
  private HeaderMap headerMap = new HeaderMap();
  private boolean stripGwtIncompatible = false;
  private boolean segmentedHeaders = true;
  private boolean jsniWarnings = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean translateClassfiles = false;
  private String annotationsJar = null;
  private CombinedOutput globalCombinedOutput = null;
  private String bootclasspath = null;
  private boolean emitKytheMappings = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean emitSourceHeaders = true;
  private boolean injectLogSites = false;
  private boolean allVersions = false;
  private boolean asObjCGenericDecl = false;
  private boolean ignoreJarWarnings = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private String annotationsJar = null;
  private CombinedOutput globalCombinedOutput = null;
  private String bootclasspath = null;
  private boolean emitKytheMappings = false;
  private boolean emitSourceHeaders = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean injectLogSites = false;
  private boolean allVersions = false;
  private boolean asObjCGenericDecl = false;
  private boolean ignoreJarWarnings = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean reportJavadocWarnings = false;
  private boolean translateBootclasspath = false;
  private boolean translateClassfiles = false;
  private String annotationsJar = null;
  private CombinedOutput globalCombinedOutput = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private final List<String> entryClasses = new ArrayList<>();

  private SourceVersion sourceVersion = null;

  private File proGuardUsageFile = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean strictFieldLoad = false;
  private boolean retainAutoreleaseReturns = false;
  private boolean arcAutoreleaseReturns = false;
  private EmitLineDirectivesOption emitLineDirectives = EmitLineDirectivesOption.NONE;
  private boolean warningsAsErrors = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

    private final List<String> sourceFiles = new ArrayList<>();
    private boolean printArgs = false;

    private void processArgs(String[] args) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean defaultNonnull = false;
  private TimingLevel timingLevel = TimingLevel.NONE;
  private boolean dumpAST = false;
  private String lintArgument = null;
  private boolean reportJavadocWarnings = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private String processors = null;
  private boolean disallowInheritedConstructors = true;
  private boolean nullability = false;
  private boolean defaultNonnull = false;
  private TimingLevel timingLevel = TimingLevel.NONE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private List<String> processorPathEntries = new ArrayList<>();
  private OutputLanguageOption language = OutputLanguageOption.OBJECTIVE_C;
  private MemoryManagementOption memoryManagementOption = null;
  private boolean strictFieldAssign = false;
  private boolean strictFieldLoad = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private EmitLineDirectivesOption emitLineDirectives = EmitLineDirectivesOption.NONE;
  private boolean warningsAsErrors = false;
  private boolean deprecatedDeclarations = false;
  private HeaderMap headerMap = new HeaderMap();
  private boolean stripGwtIncompatible = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean translateBootclasspath = false;
  private boolean translateClassfiles = false;
  private String annotationsJar = null;
  private CombinedOutput globalCombinedOutput = null;
  private String bootclasspath = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean arcAutoreleaseReturns = false;
  private EmitLineDirectivesOption emitLineDirectives = EmitLineDirectivesOption.NONE;
  private boolean warningsAsErrors = false;
  private boolean deprecatedDeclarations = false;
  private HeaderMap headerMap = new HeaderMap();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private OutputLanguageOption language = OutputLanguageOption.OBJECTIVE_C;
  private MemoryManagementOption memoryManagementOption = null;
  private boolean strictFieldAssign = false;
  private boolean strictFieldLoad = false;
  private boolean retainAutoreleaseReturns = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private String lintArgument = null;
  private boolean reportJavadocWarnings = false;
  private boolean translateBootclasspath = false;
  private boolean translateClassfiles = false;
  private String annotationsJar = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean dumpAST = false;
  private String lintArgument = null;
  private boolean reportJavadocWarnings = false;
  private boolean translateBootclasspath = false;
  private boolean translateClassfiles = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  private static final Logger logger = Logger.getLogger("com.google.devtools.j2objc");
  private boolean logLevelSet = false;

  static {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean emitWrapperMethods = true;
  private boolean extractUnsequencedModifications = true;
  private boolean docCommentsEnabled = false;
  private boolean staticAccessorMethods = false;
  private boolean classProperties = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean segmentedHeaders = true;
  private boolean jsniWarnings = true;
  private boolean buildClosure = false;
  private EnumSet<MetadataSupport> includedMetadata =
      EnumSet.of(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean extractUnsequencedModifications = true;
  private boolean docCommentsEnabled = false;
  private boolean staticAccessorMethods = false;
  private boolean classProperties = false;
  private String processors = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean docCommentsEnabled = false;
  private boolean staticAccessorMethods = false;
  private boolean classProperties = false;
  private String processors = null;
  private boolean disallowInheritedConstructors = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean emitKytheMappings = false;
  private boolean emitSourceHeaders = true;
  private boolean injectLogSites = false;
  private boolean allVersions = false;
  private boolean asObjCGenericDecl = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean disallowInheritedConstructors = true;
  private boolean nullability = false;
  private boolean defaultNonnull = false;
  private TimingLevel timingLevel = TimingLevel.NONE;
  private boolean dumpAST = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean staticAccessorMethods = false;
  private boolean classProperties = false;
  private String processors = null;
  private boolean disallowInheritedConstructors = true;
  private boolean nullability = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private SourceVersion sourceVersion = null;

  private File proGuardUsageFile = null;

  private static String fileHeader;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean allVersions = false;
  private boolean asObjCGenericDecl = false;
  private boolean ignoreJarWarnings = false;

  private Mappings mappings = new Mappings();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private TimingLevel timingLevel = TimingLevel.NONE;
  private boolean dumpAST = false;
  private String lintArgument = null;
  private boolean reportJavadocWarnings = false;
  private boolean translateBootclasspath = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean strictFieldAssign = false;
  private boolean strictFieldLoad = false;
  private boolean retainAutoreleaseReturns = false;
  private boolean arcAutoreleaseReturns = false;
  private EmitLineDirectivesOption emitLineDirectives = EmitLineDirectivesOption.NONE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private CombinedOutput globalCombinedOutput = null;
  private String bootclasspath = null;
  private boolean emitKytheMappings = false;
  private boolean emitSourceHeaders = true;
  private boolean injectLogSites = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private MemoryManagementOption memoryManagementOption = null;
  private boolean strictFieldAssign = false;
  private boolean strictFieldLoad = false;
  private boolean retainAutoreleaseReturns = false;
  private boolean arcAutoreleaseReturns = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/InfixExpression.java`
#### Snippet
```java
  // now.
  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildList<Expression> operands = ChildList.create(Expression.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/InfixExpression.java`
#### Snippet
```java
  // In theory the type can be resolved from the operator and operands but we'll keep it simple for
  // now.
  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildList<Expression> operands = ChildList.create(Expression.class, this);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/Annotation.java`
#### Snippet
```java
public abstract class Annotation extends Expression {

  private AnnotationMirror annotationMirror = null;
  protected ChildLink<Name> typeName = ChildLink.create(Name.class, this);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/AbstractTypeDeclaration.java`
#### Snippet
```java
public abstract class AbstractTypeDeclaration extends BodyDeclaration {

  private TypeElement typeElement = null;
  protected final ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);
  protected final ChildList<BodyDeclaration> bodyDeclarations =
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/Block.java`
#### Snippet
```java

  private ChildList<Statement> statements = ChildList.create(Statement.class, this);
  private boolean hasAutoreleasePool = false;

  public Block(Block other) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/ErrorUtil.java`
#### Snippet
```java
public class ErrorUtil implements DiagnosticListener<JavaFileObject> {

  private static int errorCount = 0;
  private static int warningCount = 0;
  private static PrintStream errorStream = System.err;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/ErrorUtil.java`
#### Snippet
```java
  // the DEVELOPER_DIR environment variable set by Xcode.
  private static final boolean CLANG_STYLE_ERROR_MSG = (null != System.getenv("DEVELOPER_DIR"));
  private static Pattern pathAndLinePattern = null;

  public static void reset() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/ErrorUtil.java`
#### Snippet
```java

  private static int errorCount = 0;
  private static int warningCount = 0;
  private static PrintStream errorStream = System.err;
  private static List<String> errorMessages = Lists.newArrayList();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionalExpression.java`
#### Snippet
```java

  private TypeMirror typeMirror = null;
  private TypeElement typeElement = null;
  private List<TypeMirror> targetTypes = new ArrayList<>();
  private ExecutablePair descriptor = ExecutablePair.NULL;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionalExpression.java`
#### Snippet
```java
public abstract class FunctionalExpression extends Expression {

  private TypeMirror typeMirror = null;
  private TypeElement typeElement = null;
  private List<TypeMirror> targetTypes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeNode.java`
#### Snippet
```java
  private ChildLink<? extends TreeNode> owner = null;
  private int startPosition = -1;
  private int length = 0;
  private int lineNumber = -1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeNode.java`
#### Snippet
```java
public abstract class TreeNode {

  private ChildLink<? extends TreeNode> owner = null;
  private int startPosition = -1;
  private int length = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java

    // Don't need a stack here because local types have already been extracted.
    private MethodInfo currentMethod = null;
    private Map<ExecutableElement, MethodInfo> infoMap = new HashMap<>();
    private Set<ExecutableElement> invocations = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
  static class MethodInfo {

    private Boolean functionizable = null;
    private Set<ExecutableElement> superCalls = new HashSet<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
public class DebugASTPrinter extends TreeVisitor {
  protected SourceBuilder sb = new SourceBuilder(false);
  private boolean inIfStatement = false;

  public static String toString(TreeNode node) {
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
    if (logger.isLoggable(Level.INFO)) {
      int nFiles = processedCount;
      System.out.println(String.format(
          "Translated %d %s: %d errors, %d warnings",
          nFiles, nFiles == 1 ? "file" : "files", ErrorUtil.errorCount(),
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/src/main/java/com/google/devtools/j2objc/ast/CompilationUnit.java`
#### Snippet
```java
  private static int[] findNewlines(String source) {
    if (source.isEmpty()) {
      return new int[0];
    }
    List<Integer> newlinesList = Lists.newArrayList();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/src/main/java/com/google/devtools/j2objc/translate/LogSiteInjector.java`
#### Snippet
```java

      ExecutableElement injectedMethod =
          ElementUtil.findMethod(cls, LOGP_METHOD, argTypes.toArray(new String[0]));
      if (injectedMethod != null) {
        MethodInvocation injectedInvocation =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
    }
    ExecutableElement constructor =
        ElementUtil.findConstructor(typeElement, paramTypes.toArray(new String[0]));
    return newNode
        .setExecutablePair(new ExecutablePair(constructor))
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/src/main/java/com/google/devtools/j2objc/util/PathClassLoader.java`
#### Snippet
```java

  public PathClassLoader() {
    super(new URL[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    ));
    list.addAll(options.getPlatformModuleSystemOptions());
    j2objcOptions.load(list.toArray(new String[0]));
    restrictToList = getRestrictToFiles();
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
    assertThat(byteString.isEmpty()).isTrue();
    assertWithMessage("ByteString.empty() must return empty byte array")
        .that(isArray(byteString.toByteArray(), new byte[] {}))
        .isTrue();
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/TrailingZerosTest.java`
#### Snippet
```java

  public void testReadsMessageFromEmptyBuffer() throws Exception {
    byte[] serializedData = new byte[0];
    TypicalData.parseFrom(serializedData);
    // success
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
      }
    }
    return new URLClassLoader(bootURLs.toArray(new URL[0]));
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

  public void testParseDelimitedFromEmptyStream() throws Exception {
    TypicalData output = TypicalData.parseDelimitedFrom(new ByteArrayInputStream(new byte[0]));
    assertNull(output);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    messageLite.writeTo(new ByteArrayOutputStream());
    messageLite.writeDelimitedTo(new ByteArrayOutputStream());
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]), registry);
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    messageLite.writeDelimitedTo(new ByteArrayOutputStream());
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]), registry);
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]), registry);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]), registry);
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]), registry);
    assertEquals(0, messageLite.getSerializedSize());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    builderLite.mergeFrom(new ByteArrayInputStream(new byte[0]), registry);
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]));
    builderLite.mergeDelimitedFrom(new ByteArrayInputStream(new byte[0]), registry);
    assertEquals(0, messageLite.getSerializedSize());
  }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `isOuter` initializer `false` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  // Whether this declaration should be placed inside or outside the @interface
  // or @implementation block.
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
```

### UnusedAssignment
Variable `headerCode` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  // or @implementation block.
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
  private List<TypeMirror> implementationImportTypes = new ArrayList<>();
```

### UnusedAssignment
Variable `implementationCode` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  private boolean isOuter = false;
  private String headerCode = null;
  private String implementationCode = null;
  private List<TypeMirror> implementationImportTypes = new ArrayList<>();

```

### UnusedAssignment
Variable `breakScope` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
  @Override
  public void endVisit(BreakStatement node) {
    Scope breakScope = null;
    if (node.getLabel() != null) {
      breakScope = findScope(Scope.Kind.LABELED, node.getLabel().getIdentifier());
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionDeclaration.java`
#### Snippet
```java
public class FunctionDeclaration extends BodyDeclaration {

  private String name = null;
  private boolean returnsRetained = false;
  private final ChildLink<Type> returnType = ChildLink.create(Type.class, this);
```

### UnusedAssignment
Variable `pkgName` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
    String path = fobj.getName();
    if (path.endsWith("module-info.java")) {
      String pkgName = null;
      try {
        pkgName = moduleName(fobj.getCharContent(true).toString());
```

### UnusedAssignment
Variable `code` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeStatement.java`
#### Snippet
```java
public class NativeStatement extends Statement {

  private String code = null;

  public NativeStatement(NativeStatement other) {
```

### UnusedAssignment
Variable `startPos` initializer `0` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
    // the first and last closing pattern, resulting in a single comment node.
    String source = unit.getSource();
    int startPos = 0;
    int endPos = 0;
    while ((startPos = source.indexOf(delim, endPos)) > -1) {
```

### UnusedAssignment
Variable `newNode` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
            ? env.elementUtilities().getPackageElement(pkgName.toString())
            : env.defaultPackage();
    PackageDeclaration newNode = null;
    if (pkg == null) {
      // Synthetic package, create from name.
```

### UnusedAssignment
Variable `cp` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/docs/ASTClassInfoPrinter.java`
#### Snippet
```java
    tree = TreeMultimap.create();
    astLookup = Sets.newHashSet();
    ClassPath cp = null;
    try {
      cp = ClassPath.from(ClassLoader.getSystemClassLoader());
```

### UnusedAssignment
Variable `resourceVar` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java`
#### Snippet
```java

    TreeNode resource = resources.remove(0);
    VariableElement resourceVar = null;
    VariableDeclarationFragment resourceFrag = null;
    if (resource.getKind() == Kind.VARIABLE_DECLARATION_EXPRESSION) {
```

### UnusedAssignment
Variable `currentLine` initializer `-1` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/SourceBuilder.java`
#### Snippet
```java
  private String currentFile;
  private int indention = 0;
  private int currentLine = -1;

  /**
```

### UnusedAssignment
Variable `typeMirror` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeExpression.java`
#### Snippet
```java

  private String code = null;
  private TypeMirror typeMirror = null;
  private List<TypeMirror> importTypes = Lists.newArrayList();

```

### UnusedAssignment
Variable `code` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeExpression.java`
#### Snippet
```java
public class NativeExpression extends Expression {

  private String code = null;
  private TypeMirror typeMirror = null;
  private List<TypeMirror> importTypes = Lists.newArrayList();
```

### UnusedAssignment
Variable `typeMirror` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
  private FunctionElement functionElement = null;
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
  private boolean hasRetainedResult = false;
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);
```

### UnusedAssignment
Variable `functionElement` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
public class FunctionInvocation extends Expression {

  private FunctionElement functionElement = null;
  // The context-specific known type of this expression.
  private TypeMirror typeMirror = null;
```

### UnusedAssignment
Variable `level` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
    }
    PackageElement packageElement = ElementUtil.getPackage(type);
    ReflectionSupport.Level level = null;
    while (type != null) {
      level = getReflectionSupportLevel(ElementUtil.getAnnotation(type, ReflectionSupport.class));
```

### UnusedAssignment
Variable `astInterfaces` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
  public static List<TypeElement> getInterfaceTypes(AbstractTypeDeclaration node) {
    // Use the AST as the source of truth where possible.
    List<? extends TypeMirror> astInterfaces = null;
    if (node instanceof TypeDeclaration) {
      astInterfaces = ((TypeDeclaration) node).getSuperInterfaceTypeMirrors();
```

### UnusedAssignment
The value `(ProtocolMessageEnum) value` assigned to `type` is never used
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    // Test casting to ProtocolMessageEnum.
    Object value = TypicalData.EnumType.VALUE2;
    type = (ProtocolMessageEnum) value;
  }

```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `metadata != null` is always `true`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
        VariableDeclarationFragment f = decl.getFragment();
        String metadata = generateFieldMetadata(f.getVariableElement(), annotationsFunc);
        if (metadata != null) {
          fieldMetadata.add(metadata);
        }
```

### ConstantValue
Value `type` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
        ErrorUtil.error("ExternalAnnotationInjector: unsupported field type " + type);
      }
    } else if (type instanceof EnumAFT) {
      String enumTypeString = annotation.def.name + "." + ((EnumAFT) type).typeName;
      TypeMirror enumType = typeUtil.resolveJavaType(enumTypeString).asType();
```

### ConstantValue
Value `type` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
                  value, enumType, /* enclosingElement = */ null));
    } else {
      ErrorUtil.error("ExternalAnnotationInjector: unsupported field type " + type);
    }
    return field;
```

### ConstantValue
Value `child` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
      if (child instanceof com.strobel.decompiler.languages.java.ast.Expression) {
        offset = ((com.strobel.decompiler.languages.java.ast.Expression) child).getOffset();
      } else if (child instanceof com.strobel.decompiler.languages.java.ast.Statement) {
        offset = ((com.strobel.decompiler.languages.java.ast.Statement) child).getOffset();
      }
```

### ConstantValue
Value `target` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
      return target.acceptVisitor(this, null);
    }
    if (target instanceof ThisReferenceExpression) {
      ThisExpression cons = (ThisExpression) target.acceptVisitor(this, null);
      TypeElement type = (TypeElement) ((DeclaredType) cons.getTypeMirror()).asElement();
```

### ConstantValue
Value `target` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
      return newNode;
    }
    if (target instanceof MemberReferenceExpression) {
      TypeMirror type = resolve(methodDef.getDeclaringType());
      List<Expression> args = node.getArguments().stream()
```

### ConstantValue
Condition `c >= 0x7F` is always `true` when reached
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
      // Printable ASCII character.
      return null;
    } else if (c < 0x20 || (c >= 0x7F && c < 0xA0)) {
      // Invalid C++ Unicode number, convert to UTF-8 sequence.
      if (idx + 1 < s.length() && isHexChar(s.charAt(idx + 1))) {
```

### ConstantValue
Value `result` is always 'true'
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
    boolean result = true;
    if (type == null) {
      return result;
    }
    if (type.getKind() == TypeKind.DECLARED) {
```

### ConstantValue
Condition `result` is always `true` when reached
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      }
    }
    if (classType != null && result) {
      result = visitTypeHierarchyObjcOrder(classType, visitor);
    }
```

### ConstantValue
Value `result` is always 'true'
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
    boolean result = true;
    if (type == null) {
      return result;
    }
    if (type.getKind() == TypeKind.DECLARED) {
```

### ConstantValue
Condition `end > -1` is always `true` when reached
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      return text.substring(0, start);
    }
    if (start == -1 && end > -1) {
      spanningStyleTag = false;
      return text.substring(end + 8); // "</style>".length
```

### ConstantValue
Value `path` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    if (scope.declaredVars.contains(var)) {
      // Var is declared in current scope, return empty path.
      return path;
    }
    if (var.getConstantValue() != null) {
```

### ConstantValue
Value `asObjCGenericDecl` is always 'true'
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      String arrayClass =
          TypeUtil.isPrimitiveOrVoid(componentType) ? "IOSArray<" : "IOSObjectArray<";
      String innerType = getObjcTypeInner(componentType, qualifiers, asObjCGenericDecl, true);
      objcType = arrayClass + innerType;
      objcType += componentType instanceof ArrayType ? " *>" : ">";
```

### ConstantValue
Value `asObjCGenericDecl` is always 'true'
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
                      .map(
                          input ->
                              getObjcTypeInner(input, finalQualifiers, asObjCGenericDecl, false))
                      .collect(joining(", ")));
    } else {
```

### ConstantValue
Value `expr` is always 'null'
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java
            String value = ((MemberReferenceExpression) expr).getMemberName();
            builder.setObjectiveCName(value);
          } else if (expr instanceof PrimitiveExpression) {
            Object value = ((PrimitiveExpression) expr).getValue();
            builder.setObjectiveCName((String) value);
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `generate()` tries to override a static method of a superclass
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypePrivateDeclarationGenerator.java`
#### Snippet
```java
  }

  public static void generate(SourceBuilder builder, AbstractTypeDeclaration node) {
    new TypePrivateDeclarationGenerator(builder, node).generate();
  }
```

### MethodOverridesStaticMethod
Method `generate()` tries to override a static method of a superclass
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSegmentedHeaderGenerator.java`
#### Snippet
```java
  }

  public static void generate(GenerationUnit unit) {
    new ObjectiveCSegmentedHeaderGenerator(unit).generate();
  }
```

### MethodOverridesStaticMethod
Method `toString()` tries to override a static method of a superclass
in `translator/src/main/java/com/google/devtools/j2objc/ast/SignatureASTPrinter.java`
#### Snippet
```java
public class SignatureASTPrinter extends DebugASTPrinter {

  public static String toString(TreeNode node) {
    SignatureASTPrinter printer = new SignatureASTPrinter();
    node.accept(printer);
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java
    StringBuilder fields = new StringBuilder();
    if (!members.isEmpty()) {
      description.append("@\"@" + elementUtil.getBinaryName(type) + "(");
      Iterator<AnnotationTypeMemberDeclaration> iter = members.iterator();
      while (iter.hasNext()) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java
        String fieldName = nameTable.getVariableShortName(fieldElements.get(memberElement));

        description.append(
            propName + "=%" + TypeUtil.getObjcFormatSpecifier(memberElement.getReturnType()));
        fields.append(fieldName);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/translate/AnnotationRewriter.java`
#### Snippet
```java
        }
      }
      description.append(")\", " + fields);
      descriptionBody.addStatement(
          new NativeStatement("return [NSString stringWithFormat:" + description + "];"));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/util/CodeReferenceMap.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder();

    builder.append(referencedClasses.asList().toString() + "\n");
    builder.append(referencedFields.toString() + "\n");
    builder.append(referencedMethods.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/util/CodeReferenceMap.java`
#### Snippet
```java

    builder.append(referencedClasses.asList().toString() + "\n");
    builder.append(referencedFields.toString() + "\n");
    builder.append(referencedMethods.toString());

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnumRewriter.java`
#### Snippet
```java
      StringBuilder sb = new StringBuilder("id names[] = {\n  ");
      for (EnumConstantDeclaration constant : constants) {
        sb.append("@\"" + ElementUtil.getName(constant.getVariableElement()) + "\", ");
      }
      sb.append("\n};");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeGenerator.java`
#### Snippet
```java
        String paramType = nameTable.getObjCType(var.asType());
        paramType += (paramType.endsWith("*") ? "" : " ");
        sb.append(paramType + nameTable.getVariableShortName(var));
        if (iter.hasNext()) {
          sb.append(", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeImplementationGenerator.java`
#### Snippet
```java
    }
    StringBuilder sb = new StringBuilder();
    sb.append("{\nif (self == [" + typeName + " class]) {\n");
    for (Statement statement : initStatements) {
      sb.append(generateStatement(statement));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeImplementationGenerator.java`
#### Snippet
```java
      sb.append(generateStatement(statement));
    }
    sb.append("J2OBJC_SET_INITIALIZED(" + typeName + ")\n");
    sb.append("}\n}");
    print("\n+ (void)initialize " + reindent(sb.toString()) + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeImplementationGenerator.java`
#### Snippet
```java
      VariableElement var = iter.next().getVariableElement();
      String paramType = nameTable.getJniType(var.asType());
      sb.append(paramType + ' ' + nameTable.getVariableBaseName(var));
      if (iter.hasNext()) {
        sb.append(", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(returnType.toString() + " " + name + "(");
    for (int i = 0; i < parameterTypes.size(); i++) {
      if (i > 0) {
```

## RuleId[ruleID=IOResource]
### IOResource
'JarFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `translator/src/main/java/com/google/devtools/j2objc/file/JarredInputFile.java`
#### Snippet
```java
  @Override
  public InputStream getInputStream() throws IOException {
    final JarFile jarFile = new JarFile(jarPath);
    ZipEntry entry = jarFile.getEntry(internalPath);
    final InputStream entryStream = jarFile.getInputStream(entry);
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `type` may be 'static'
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java
  }

  private final String type = "kythe0";
  private final List<AnchorAnchorMetadata> meta = new ArrayList<>();

```

### FieldMayBeStatic
Field `type` may be 'static'
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java

  static class AnchorAnchorMetadata {
    private final String type = "anchor_anchor";
    private final int sourceBegin;
    private final int sourceEnd;
```

### FieldMayBeStatic
Field `edge` may be 'static'
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java
    private final int targetBegin;
    private final int targetEnd;
    private final String edge = "/kythe/edge/imputes";
    private final VName sourceVName;

```

## RuleId[ruleID=StringEqualsCharSequence]
### StringEqualsCharSequence
`String.equals()` called with 'CharSequence' argument
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
    @Override
    public boolean contentEquals(CharSequence cs) {
      return str.equals(cs);
    }

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MemoryBenchmarks` has only 'static' members, and lacks a 'private' constructor
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
 * @author Keith Stanger
 */
class MemoryBenchmarks {

  // Used to maintain a strong reference to a protocol buffer and avoid
```

### UtilityClassWithoutPrivateConstructor
Class `ASTClassInfoPrinter` has only 'static' members, and lacks a 'private' constructor
in `translator/src/main/java/com/google/devtools/j2objc/docs/ASTClassInfoPrinter.java`
#### Snippet
```java
 * @author Seth Kirby
 */
public class ASTClassInfoPrinter {
  private static Set<String> astLookup;
  private static SortedSetMultimap<String, String> tree;
```

### UtilityClassWithoutPrivateConstructor
Class `J2ObjC` has only 'static' members, and lacks a 'private' constructor
in `translator/src/main/java/com/google/devtools/j2objc/J2ObjC.java`
#### Snippet
```java
 * @author Tom Ball
 */
public class J2ObjC {

  static {
```

### UtilityClassWithoutPrivateConstructor
Class `LiteralGenerator` has only 'static' members, and lacks a 'private' constructor
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
 * Utility methods for generating correct Objective-C literals.
 */
public class LiteralGenerator {

  private static final String EXPONENTIAL_FLOATING_POINT_REGEX =
```

### UtilityClassWithoutPrivateConstructor
Class `PerformanceBenchmarks` has only 'static' members, and lacks a 'private' constructor
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
 * @author Keith Stanger
 */
class PerformanceBenchmarks {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `TreeUtil` has only 'static' members, and lacks a 'private' constructor
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
 * Collection of utility methods for examining tree nodes.
 */
public class TreeUtil {

  public static <T extends TreeNode> T remove(T node) {
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java

  public GeneratedElement addModifiers(Modifier... newModifiers) {
    for (Modifier m : newModifiers) {
      modifiers.add(m);
    }
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java

  public FunctionElement addParameters(TypeMirror... paramTypes) {
    for (TypeMirror paramType : paramTypes) {
      parameterTypes.add(paramType);
    }
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `translator/src/main/java/com/google/devtools/j2objc/ast/InfixExpression.java`
#### Snippet
```java
    this.typeMirror = typeMirror;
    this.operator = operator;
    for (Expression operand : operands) {
      this.operands.add(operand);
    }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `translator/src/main/java/com/google/devtools/j2objc/translate/SerializationStripper.java`
#### Snippet
```java
    PRIVATE,
    ANY
  };

  private static class SerializationMethod {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
      return str;
    }
  };
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java`
#### Snippet
```java
      // The new innerTry statement will be a "Basic try-with-resources" and will be rewritten by
      // the code below when it is visited.
      TryStatement innerTry = new TryStatement().setBody(TreeUtil.remove(node.getBody()));;
      TreeUtil.moveList(resources, innerTry.getResources());
      node.setBody(new Block().addStatement(innerTry));
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `iterableType` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnhancedForRewriter.java`
#### Snippet
```java
    VariableElement loopVariable = node.getParameter().getVariableElement();
    DeclaredType iterableType = typeUtil.findSupertype(expressionType, "java.lang.Iterable");
    ExecutablePair iteratorMethod = typeUtil.findMethod(iterableType, "iterator");
    DeclaredType iteratorType = (DeclaredType) iteratorMethod.type().getReturnType();
    ExecutablePair hasNextMethod = typeUtil.findMethod(iteratorType, "hasNext");
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnhancedForRewriter.java`
#### Snippet
```java
    DeclaredType iterableType = typeUtil.findSupertype(expressionType, "java.lang.Iterable");
    ExecutablePair iteratorMethod = typeUtil.findMethod(iterableType, "iterator");
    DeclaredType iteratorType = (DeclaredType) iteratorMethod.type().getReturnType();
    ExecutablePair hasNextMethod = typeUtil.findMethod(iteratorType, "hasNext");
    ExecutablePair nextMethod = typeUtil.findMethod(iteratorType, "next");
```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnhancedForRewriter.java`
#### Snippet
```java
      EnhancedForStatement node, TypeMirror expressionType, VariableElement loopVariable) {
    DeclaredType iterableType = typeUtil.findSupertype(expressionType, "java.lang.Iterable");
    List<? extends TypeMirror> typeArgs = iterableType.getTypeArguments();
    assert typeArgs.size() == 1 && typeUtil.isBoxedType(typeArgs.get(0));
    VariableElement boxVariable = GeneratedVariableElement.newLocalVar(
```

### DataFlowIssue
Method invocation `getFullName` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java
    this.file = file;
    this.classFile = ClassFile.create(file);
    this.typeName = classFile.getFullName();
  }

```

### DataFlowIssue
Method invocation `asElement` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
    DeclaredType containerType = (DeclaredType) ElementUtil.getAnnotationValue(
        ElementUtil.getAnnotation(annotationType.asElement(), Repeatable.class), "value");
    TypeElement containerElement = (TypeElement) containerType.asElement();
    FunctionElement element = new FunctionElement(
        "create_" + nameTable.getFullName(containerElement), containerType, containerElement);
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java
      pkgElement = parserEnv.defaultPackage();
    }
    String mainTypeName = typeElement.getSimpleName().toString();
    CompilationUnit compUnit = new CompilationUnit(translationEnv, mainTypeName);
    compUnit.setPackage((PackageDeclaration) convert(pkgElement, compUnit));
```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
  @Override
  public boolean visit(MethodDeclaration node) {
    if (!annotatedElementStack.peekLast().isPresent()) {
      return true;
    }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
      return true;
    }
    AClass annotatedParent = (AClass) annotatedElementStack.peekLast().get();
    ExecutableElement executable = node.getExecutableElement();
    String prefix = elementUtil.getBinaryName(ElementUtil.getDeclaringClass(executable)) + ".";
```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
  @Override
  public boolean visit(FieldDeclaration node) {
    if (!annotatedElementStack.peekLast().isPresent()) {
      return false;
    }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
      return false;
    }
    AClass annotatedParent = (AClass) annotatedElementStack.peekLast().get();
    VariableElement element = node.getFragment().getVariableElement();
    AField annotatedField = annotatedParent.fields.get(ElementUtil.getName(element));
```

### DataFlowIssue
Dereference of `breakScope` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
      breakScope = findScope(Scope.Kind.LOOP_OR_SWITCH, null);
    }
    scope.mergeInto(breakScope.next);
    scope.terminates = true;
  }
```

### DataFlowIssue
Dereference of `(List``) getAnnotationValue(annotation, "value")` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
    if (annotation != null) {
      for (AnnotationValue elem
           : (List<? extends AnnotationValue>) getAnnotationValue(annotation, "value")) {
        if (warning.equals(elem.getValue())) {
          return true;
```

### DataFlowIssue
Casting `decl` to `FieldDeclaration` may produce `ClassCastException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DeadCodeEliminator.java`
#### Snippet
```java

      if (decl.getKind() == Kind.FIELD_DECLARATION) {
        FieldDeclaration field = (FieldDeclaration) decl;
        VariableDeclarationFragment fragment = field.getFragment();
        // Don't delete any constants because we can't detect their use.
```

### DataFlowIssue
Method invocation `asType` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
      if (exec.getParameters().size() == 0) {
        ExecutableType execType = typeUtil
            .asMemberOf((DeclaredType) superClass.asType(), exec);
        superCall = new SuperConstructorInvocation()
            .setExecutablePair(new ExecutablePair(exec, execType));
```

### DataFlowIssue
Argument `TypeUtil.asTypeElement(boxedType)` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
  private void box(Expression expr, TypeMirror boxedType) {
    if (typeUtil.isBoxedType(boxedType)) {
      boxWithClass(expr, TypeUtil.asTypeElement(boxedType));
    } else {
      box(expr);
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
    if (expr != null) {
      TypeMirror returnType = TreeUtil.getOwningReturnType(node);
      boolean returnsPrimitive = returnType.getKind().isPrimitive();
      boolean exprIsPrimitive = expr.getTypeMirror().getKind().isPrimitive();
      if (returnsPrimitive && !exprIsPrimitive) {
```

### DataFlowIssue
Argument `getBytes(groupCase)` might be null
in `protobuf/tests/OneofTest.java`
#### Snippet
```java
  public void testMergeFromInputStream(OneofGroupCase groupCase) throws Exception {
    ExtensionRegistry registry = ExtensionRegistry.newInstance();
    ByteArrayInputStream in = new ByteArrayInputStream(getBytes(groupCase));
    OneofMsg.Builder builder = OneofMsg.newBuilder().mergeFrom(in, registry);
    checkFields(builder, groupCase);
```

### DataFlowIssue
Dereference of `expectedBytes` may produce `NullPointerException`
in `protobuf/tests/OneofTest.java`
#### Snippet
```java
    byte[] expectedBytes = getBytes(groupCase);

    assertEquals(expectedBytes.length, msg.getSerializedSize());
    byte[] bytes1 = msg.toByteArray();
    checkBytes(expectedBytes, bytes1);
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
      File dir, String currentRelativePath, List<ProcessingContext> inputs) {
    assert dir.exists() && dir.isDirectory();
    for (File f : dir.listFiles()) {
      String relativeName = currentRelativePath + File.separatorChar + f.getName();
      if (f.isDirectory()) {
```

### DataFlowIssue
Method invocation `getSourceFilePath` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
              .convertCompilationUnit(options, env, ast);
          processDiagnostics(env.diagnostics());
          handler.handleParsedUnit(unit.getSourceFilePath(), unit);
        }
      }
```

### DataFlowIssue
Method invocation `isClass` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
    }
    TypeMirror first = supertypes.get(0);
    if (getDeclaredTypeKind(first).isClass()) {
      return (DeclaredType) first;
    }
```

### DataFlowIssue
Argument `asTypeElement(t)` might be null
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
        return getName(((ArrayType) t).getComponentType()) + "[]";
      case DECLARED:
        return ElementUtil.getName(asTypeElement(t));
      case TYPEVAR:
        return ElementUtil.getName(((TypeVariable) t).asElement());
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
        return "[" + getQualifiedName(((ArrayType) t).getComponentType());
      case DECLARED:
        return asTypeElement(t).getQualifiedName().toString();
      case BOOLEAN:
      case BYTE:
```

### DataFlowIssue
Argument `node.getTypeMirror()` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/ComplexExpressionExtractor.java`
#### Snippet
```java
  @Override
  public void endVisit(Assignment node) {
    if (TypeUtil.isBoolean(node.getTypeMirror())) {
      if (node.getRightHandSide() instanceof InfixExpression) {
        // Avoid clang precedence warning by putting parentheses around expression.
```

### DataFlowIssue
Argument `closeableType` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java`
#### Snippet
```java
    DeclaredType closeableType =
        typeUtil.findSupertype(resourceVar.asType(), "java.lang.AutoCloseable");
    ExecutablePair closeMethod = typeUtil.findMethod(closeableType, "close");
    ExecutablePair addSuppressedMethod =
        typeUtil.findMethod(throwableType, "addSuppressed", "java.lang.Throwable");
```

### DataFlowIssue
Argument `enumType` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/SwitchRewriter.java`
#### Snippet
```java
    }
    DeclaredType enumType = typeUtil.getSuperclass(type);
    ExecutablePair ordinalMethod = typeUtil.findMethod(enumType, "ordinal");
    MethodInvocation invocation = new MethodInvocation(ordinalMethod, TreeUtil.remove(expr));
    node.setExpression(invocation);
```

### DataFlowIssue
Method invocation `addMember` may produce `NullPointerException`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java
      clinit.addReferencedTypes(typeId);
    }
    context.currentTypeInfoScope.peek().addMember(clinit.build());
    TypeInfo ti = context.currentTypeInfoScope.pop().build();
    context.currentTypeNameScope.pop();
```

### DataFlowIssue
Method invocation `getExported` may produce `NullPointerException`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java
    boolean isExported =
        context.exportedMethods.contains(getQualifiedMethodName(declTypeName, methodName))
        || context.currentTypeInfoScope.peek().getExported();
    Integer originalTypeId = getTypeId(originalClassName);
    startMethodScope(
```

### DataFlowIssue
Method invocation `addMember` may produce `NullPointerException`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java
      member.addReferencedTypes(typeId);
    }
    context.currentTypeInfoScope.peek().addMember(member.build());
  }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java
  private void addReferencedTypeName(String typeName) {
    int typeId = getTypeId(typeName);
    context.referencedTypesScope.peek().add(typeId);
  }

```

### DataFlowIssue
Method invocation `addInvokedMethods` may produce `NullPointerException`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/UsedCodeMarker.java`
#### Snippet
```java
    int declTypeId = getTypeId(declTypeName);
    context.memberScope.peek()
            .addInvokedMethods(com.google.devtools.treeshaker.MethodInvocation.newBuilder()
                .setMethod(methodName)
                .setEnclosingType(declTypeId)
```

### DataFlowIssue
Argument `TypeUtil.asTypeElement(type)` might be null
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameUtil.java`
#### Snippet
```java
        break;
      case DECLARED: {
        sb.append(ElementUtil.getName(TypeUtil.asTypeElement(type)));
        List<? extends TypeMirror> typeArguments = ((DeclaredType) type).getTypeArguments();
        if (!typeArguments.isEmpty()) {
```

### DataFlowIssue
Argument `creationElement` might be null
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
      node.setCreationOuterArg(getOuterPathInherited(enclosingTypeElement));
    });
    if (ElementUtil.isLocal(creationElement)) {
      onExitScope(creationElement, () -> {
        addCaptureArgs(creationElement, node.getCreationCaptureArgs());
```

### DataFlowIssue
Method invocation `isClass` may produce `NullPointerException`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
          subtypes.put(supertypeNode, node);
          if (TypeUtil.isDeclaredType(supertype)
              && TypeUtil.getDeclaredTypeKind(supertype).isClass()) {
            superclasses.put(node, supertypeNode);
          }
```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
  private static boolean isRawType(TypeMirror type) {
    return TypeUtil.isDeclaredType(type)
        && !TypeUtil.asTypeElement(type).getTypeParameters().isEmpty()
        && ((DeclaredType) type).getTypeArguments().isEmpty();
  }
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
    TypeMirror type = node.getTypeMirror();
    TypeMirror idType = TypeUtil.ID_TYPE;
    TypeMirror declaredType = type.getKind().isPrimitive() ? type : idType;
    Expression lhs = node.getLeftHandSide();
    FunctionElement element = new FunctionElement(funcName, declaredType, null);
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
    // TODO(cpovirk): try Directories.deleteRecursively if a c.g.c.unix dep is OK
    if (dir != null && dir.exists()) {
      for (File f : dir.listFiles()) {
        if (f.isDirectory()) {
          deleteTempDir(f);
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java
    PackageDataBuilder builder = new PackageDataBuilder();
    ClassFile classFile = ClassFile.create(file);
    TypeDeclaration typeDecl = classFile.getType();
    for (Annotation annotation : typeDecl.getAnnotations()) {
      String signature = annotation.getType().toTypeReference().getErasedSignature();
```

### DataFlowIssue
Casting `rawField` to `List` may produce `ClassCastException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    Object rawField = allFields.get(descriptor.findFieldByNumber(2));
    assertTrue(rawField instanceof List);
    Object rawEntry = ((List<?>) rawField).get(0);
    assertTrue(rawEntry instanceof MapEntry);
    MapEntry<?, ?> entry = (MapEntry<?, ?>) rawEntry;
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    MapEntry<?, ?> entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("triangle", entry.getKey());
    assertEquals(Integer.valueOf(3), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
```

### DataFlowIssue
Casting `rawField` to `List` may produce `ClassCastException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertEquals("triangle", entry.getKey());
    assertEquals(Integer.valueOf(3), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("square", entry.getKey());
    assertEquals(Integer.valueOf(4), entry.getValue());

```

### DataFlowIssue
Casting `rawField` to `List` may produce `ClassCastException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    rawField = allFields.get(descriptor.findFieldByNumber(7));
    assertTrue(rawField instanceof List);
    rawEntry = ((List<?>) rawField).get(0);
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals(Boolean.TRUE, entry.getKey());
    assertEquals(Integer.valueOf(0), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
```

### DataFlowIssue
Casting `rawField` to `List` may produce `ClassCastException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertEquals(Boolean.TRUE, entry.getKey());
    assertEquals(Integer.valueOf(0), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals(Boolean.FALSE, entry.getKey());
    assertEquals(Integer.valueOf(2), entry.getValue());
  }
```

### DataFlowIssue
Casting `rawValue` to `List` may produce `ClassCastException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    Object rawValue = msg.getField(stringStringField);
    assertTrue(rawValue instanceof List);
    List<?> list = (List<?>) rawValue;
    assertEquals(2, list.size());
    Object rawEntry = list.get(0);
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawValue instanceof List);
    List<?> list = (List<?>) rawValue;
    assertEquals(2, list.size());
    Object rawEntry = list.get(0);
    assertTrue(rawEntry instanceof MapEntry);
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    MapEntry<?, ?> entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("duck", entry.getKey());
    assertEquals("quack", entry.getValue());

```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("cat", entry.getKey());
    assertEquals("meow", entry.getValue());

```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(rawEntry instanceof MapEntry);
    MapEntry<?, ?> entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("cat", entry.getKey());
    assertEquals("meow", entry.getValue());
  }
```

### DataFlowIssue
Casting `result` to `Float` may produce `ClassCastException`
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    result = data.getField(fields[13]);
    assertTrue(result instanceof Float);
    assertEquals(43.8, ((Float) result).floatValue(), 0.0001);
    result = data.getField(fields[14]);
    assertTrue(result instanceof Double);
```

### DataFlowIssue
Casting `result` to `Double` may produce `ClassCastException`
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    result = data.getField(fields[14]);
    assertTrue(result instanceof Double);
    assertEquals(44.5, ((Double) result).doubleValue(), 0.0001);
    result = data.getField(fields[15]);
    assertTrue(result instanceof String);
```

### DataFlowIssue
Casting `result` to `List` may produce `ClassCastException`
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    Object result = data.getExtension(Typical.myRepeatedPrimitiveExtension);
    assertTrue(result instanceof List);
    assertTrue(((List) result).get(0) instanceof Integer);
    assertEquals(3, data.getExtensionCount(Typical.myRepeatedPrimitiveExtension));
    assertEquals(2,
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java`
#### Snippet
```java
        if (typeHierarchy.contains(superType)) {
          ErrorUtil.error("Duplicate type name found in "
              + typeHierarchy.stream().collect(Collectors.joining("->")) + "->" + superType);
          return;
        }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
      }
      if (lastIndex < i) {
        sb.append(s.substring(lastIndex, i));
      }
      lastIndex = i + 1;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
    }
    if (sb != null) {
      sb.append(s.substring(lastIndex, len));
      return sb.toString();
    } else {
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
    if (preStart > -1 && preEnd > -1) {
      // Both <pre> and </pre> are in the same text segment.
      sb.append(text.substring(0, preStart));
      if (preStart > 0) {
        sb.append('\n');
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      }
      sb.append("@code\n");
      sb.append(text.substring(preStart + "<pre>".length(), preEnd));
      sb.append("\n@endcode");
      sb.append(text.substring(preEnd + "</pre>".length()));
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
    } else if (preStart > -1) {
      // The text has <pre> but not the </pre> should be in a following Javadoc tag.
      sb.append(text.substring(0, preStart));
      if (preStart > 0) {
        sb.append('\n');
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
          // Extract first sentence from description.
          BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
          iterator.setText(description.toString());
          int start = iterator.first();
          int end = iterator.next();
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacJ2ObjCIncompatibleStripper.java`
#### Snippet
```java
        }
      }
      sb.append(source.substring(currentIdx, startPos));
      // Preserve newlines from the stripped node so that we can add line
      // directives consistent with the original source file.
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/ClassHierarchyAnalyzer.java`
#### Snippet
```java
        .flatMap(t -> t.getMembers().stream())
        .filter(Member::isExported)
        .forEach(m -> onMemberReference(m));

    CodeReferenceMap.Builder unusedBuilder = CodeReferenceMap.builder();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/RapidTypeAnalyser.java`
#### Snippet
```java
        .flatMap(t -> t.getMembers().stream())
        .filter(Member::isExported)
        .forEach(m -> onMemberReference(m));

    CodeReferenceMap.Builder unusedBuilder = CodeReferenceMap.builder();
```

## RuleId[ruleID=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public static List<ExecutableElement> getSortedAnnotationMembers(TypeElement annotation) {
    List<ExecutableElement> members = Lists.newArrayList(getMethods(annotation));
    Collections.sort(members, (m1, m2) -> getName(m1).compareTo(getName(m2)));
    return members;
  }
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java
  public void print(PrintStream printStream) {
    ArrayList<TypeNode> typeNodes = new ArrayList<>(edges.keySet());
    Collections.sort(typeNodes, (a, b) -> a.getName().compareTo(b.getName()));
    for (TypeNode typeNode : typeNodes) {
      ArrayList<Edge> outgoingEdges = new ArrayList<>(edges.get(typeNode));
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java
      ArrayList<Edge> outgoingEdges = new ArrayList<>(edges.get(typeNode));
      Collections.sort(
          outgoingEdges, (a, b) -> a.getTarget().getName().compareTo(b.getTarget().getName()));
      printStream.println("class: " + typeNode);
      for (Edge e : outgoingEdges) {
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve field 'targets'
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
      com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type> result =
          (com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type>)
              JCFunctionalExpression.class.getField("targets").get(node);
      return result;
    } catch (ReflectiveOperationException e) {
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        final Iterator<FieldDeclaration> fieldIter = fieldDecls.iterator();
        return new AbstractIterator<VariableDeclarationFragment>() {
          @Override protected VariableDeclarationFragment computeNext() {
            while (fieldIter.hasNext()) {
              return fieldIter.next().getFragment();
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
          sb.append(NameTable.getDocCommentVariableName(((VariableElement) element)));
        } else {
          sb.append(fragment.toString());
        }
      } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      return "((jlong) 0x8000000000000000LL)";
    } else {
      return value.toString() + "LL";
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      return "__FLT_MIN__";
    } else {
      return value.toString() + "f";
    }
  }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
      } else if (lastSideEffect < i) {
        // Else remove unnecessary constant value.
        operands.remove(i--);
      }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/SwitchRewriter.java`
#### Snippet
```java
      if (stmt instanceof VariableDeclarationStatement) {
        VariableDeclarationStatement declStmt = (VariableDeclarationStatement) stmt;
        statements.remove(i--);
        List<VariableDeclarationFragment> fragments = declStmt.getFragments();
        for (VariableDeclarationFragment decl : fragments) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/SwitchRewriter.java`
#### Snippet
```java
            Assignment assignment = new Assignment(
                new SimpleName(decl.getVariableElement()), TreeUtil.remove(initializer));
            statements.add(++i, new ExpressionStatement(assignment));
          }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
        }
        extractOrderedAccesses(stmtList, currentTopNode, toExtract);
        i = 0;
      }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
        expressions.subList(0, i).clear();
        extractOrderedAccesses(stmtList, currentTopNode, unsequencedAccesses);
        i = 0;
        if (extractModifiedExpression) {
          stmtList.add(new ExpressionStatement(expressions.get(0).copy()));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
          stmtList.add(new ExpressionStatement(expressions.get(0).copy()));
          expressions.remove(0);
          i = -1;
        }
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
              "Unexpected conditional node type: " + topConditional.getClass().toString());
        }
        i = j - 1;
      } else {
        VariableElement newVar = GeneratedVariableElement.newLocalVar(
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
  private final ElementKind kind;
  private final boolean synthetic;
  private Set<Modifier> modifiers = new HashSet<>();
  private final Element enclosingElement;
  private final List<AnnotationMirror> annotationMirrors = new ArrayList<>();
```

## RuleId[ruleID=RegExpRepeatedSpace]
### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java`
#### Snippet
```java

  private static final Pattern proGuardMethodPattern = Pattern.compile(
      "    " + // leading indent
      "(\\d+:\\d+:)?" + // method line numbers (optional)
      "((public|private|protected|static|synchronized|varargs|bridge|" +
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `protobuf/tests/MapsTest.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public void testMapFieldDescriptor() throws Exception {
    Descriptor descriptor = MapMsg.Builder.getDescriptor();
    FieldDescriptor stringStringField = descriptor.findFieldByNumber(1);
```

### RedundantSuppression
Redundant suppression
in `protobuf/tests/MapsTest.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public void testMixingMapAndListApi() throws Exception {
    Descriptor descriptor = MapMsg.Builder.getDescriptor();
    FieldDescriptor field = descriptor.findFieldByNumber(1);
```

### RedundantSuppression
Redundant suppression
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java

  @SuppressWarnings("fallthrough")
  private TreeNode convert(Element element, TreeNode parent) {
    TreeNode node;
    switch (element.getKind()) {
```

### RedundantSuppression
Redundant suppression
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
   */
  @SuppressWarnings("fallthrough")
  static String packageName(String source) {
    try (StringReader r = new StringReader(source)) {
      StreamTokenizer tokenizer = new StreamTokenizer(r);
```

### RedundantSuppression
Redundant suppression
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java

  @SuppressWarnings("fallthrough")
  private TreeNode convertInner(Tree javacNode, TreePath parent) {
    switch (javacNode.getKind()) {
      case ANNOTATION:
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `translator/src/main/java/com/google/devtools/j2objc/translate/LogSiteInjector.java`
#### Snippet
```java

  private Expression lineNumberLiteral(TreeNode node) {
    return TreeUtil.newLiteral(Integer.valueOf(node.getLineNumber()), typeUtil);
  }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    List<FieldDescriptor> fields = getRepeatedFieldDescriptors();
    List<Object> values = new ArrayList<Object>();
    values.add(Integer.valueOf(1));
    values.add(Long.valueOf(2));
    values.add(Integer.valueOf(3));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    List<Object> values = new ArrayList<Object>();
    values.add(Integer.valueOf(1));
    values.add(Long.valueOf(2));
    values.add(Integer.valueOf(3));
    values.add(Long.valueOf(4));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Integer.valueOf(1));
    values.add(Long.valueOf(2));
    values.add(Integer.valueOf(3));
    values.add(Long.valueOf(4));
    values.add(Boolean.TRUE);
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Long.valueOf(2));
    values.add(Integer.valueOf(3));
    values.add(Long.valueOf(4));
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(5.6f));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Long.valueOf(4));
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(5.6f));
    values.add(Double.valueOf(7.8));
    values.add("foo");
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(5.6f));
    values.add(Double.valueOf(7.8));
    values.add("foo");
    values.add(ByteString.copyFrom("bar".getBytes()));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    List<FieldDescriptor> fields = getPrimitiveFieldDescriptors();
    List<Object> values = new ArrayList<Object>();
    values.add(Integer.valueOf(1));
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(2.3f));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Integer.valueOf(1));
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(2.3f));
    values.add(Double.valueOf(4.5));
    values.add(Integer.valueOf(6));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Boolean.TRUE);
    values.add(Float.valueOf(2.3f));
    values.add(Double.valueOf(4.5));
    values.add(Integer.valueOf(6));
    values.add(Long.valueOf(7));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Float.valueOf(2.3f));
    values.add(Double.valueOf(4.5));
    values.add(Integer.valueOf(6));
    values.add(Long.valueOf(7));
    values.add(Long.valueOf(8));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Double.valueOf(4.5));
    values.add(Integer.valueOf(6));
    values.add(Long.valueOf(7));
    values.add(Long.valueOf(8));
    for (int i = 0; i < 5000; i++) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/PerformanceBenchmarks.java`
#### Snippet
```java
    values.add(Integer.valueOf(6));
    values.add(Long.valueOf(7));
    values.add(Long.valueOf(8));
    for (int i = 0; i < 5000; i++) {
      TypicalData.Builder builder = TypicalData.newBuilder();
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    MapEntry<?, ?> entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("triangle", entry.getKey());
    assertEquals(Integer.valueOf(3), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
    assertTrue(rawEntry instanceof MapEntry);
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals("square", entry.getKey());
    assertEquals(Integer.valueOf(4), entry.getValue());

    rawField = allFields.get(descriptor.findFieldByNumber(7));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals(Boolean.TRUE, entry.getKey());
    assertEquals(Integer.valueOf(0), entry.getValue());
    rawEntry = ((List<?>) rawField).get(1);
    assertTrue(rawEntry instanceof MapEntry);
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    entry = (MapEntry<?, ?>) rawEntry;
    assertEquals(Boolean.FALSE, entry.getKey());
    assertEquals(Integer.valueOf(2), entry.getValue());
  }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(entry.getValue() instanceof Integer);
    assertEquals(Boolean.TRUE, entry.getKey());
    assertEquals(Integer.valueOf(0), entry.getValue());
    entry = (MapEntry<?, ?>) msg.getRepeatedField(boolEnumField, 1);
    assertTrue(entry.getKey() instanceof Boolean);
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/MapsTest.java`
#### Snippet
```java
    assertTrue(entry.getValue() instanceof Integer);
    assertEquals(Boolean.FALSE, entry.getKey());
    assertEquals(Integer.valueOf(2), entry.getValue());

    MapMsg.Builder builder = msg.toBuilder();
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(TypicalData.EnumType.VALUE9, data.getMyEnumType());
    assertTrue(data.getMyBool());
    assertEquals(new Float(43.8), data.getMyFloat());
    assertEquals(new Double(44.5), data.getMyDouble());
    assertEquals("bar", data.getMyString());
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertTrue(data.getMyBool());
    assertEquals(new Float(43.8), data.getMyFloat());
    assertEquals(new Double(44.5), data.getMyDouble());
    assertEquals("bar", data.getMyString());
    assertEquals(24, data.getMyUint());
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

    TypicalData.Builder dataBuilder = TypicalData.newBuilder();
    dataBuilder.setField(fields[1], new Integer(42));
    dataBuilder.setField(fields[2], ByteString.copyFromUtf8("foo"));
    dataBuilder.setField(fields[3], TypicalData.EnumType.VALUE9.getValueDescriptor());
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[11], TypicalDataMessage.newBuilder().build());
    dataBuilder.setField(fields[12], Boolean.TRUE);
    dataBuilder.setField(fields[13], new Float(43.8));
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[12], Boolean.TRUE);
    dataBuilder.setField(fields[13], new Float(43.8));
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
```

### UnnecessaryBoxing
Unnecessary boxing
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
    dataBuilder.addRepeatedField(fields[8], "bbb");
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeDeclarationGenerator.java`
#### Snippet
```java
          capName, valueMethod, primitiveTypeName, typeName);
    }
    if ("I".indexOf(binaryName) >= 0) {
      printf("BOXED_SHIFT_ASSIGN_32(%s, %s, %s, %s)\n",
          capName, valueMethod, primitiveTypeName, typeName);
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeDeclarationGenerator.java`
#### Snippet
```java
          capName, valueMethod, primitiveTypeName, typeName);
    }
    if ("J".indexOf(binaryName) >= 0) {
      printf("BOXED_SHIFT_ASSIGN_64(%s, %s, %s, %s)\n",
          capName, valueMethod, primitiveTypeName, typeName);
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/docs/ASTClassInfoPrinter.java`
#### Snippet
```java
  private static void printClassHierarchy(String node, String indent) {
    if (astLookup.contains(node)) {
      System.out.println(indent + "- " + node);
    } else {
      System.out.println(indent + "- **" + node + "**");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/docs/ASTClassInfoPrinter.java`
#### Snippet
```java
      System.out.println(indent + "- " + node);
    } else {
      System.out.println(indent + "- **" + node + "**");
    }
    for (String childNode : tree.get(node)) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java

  public static void help(boolean errorExit) {
    System.err.println(helpMessage);
    // javac exits with 2, but any non-zero value works.
    System.exit(errorExit ? 2 : 0);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java

  public static void usage(String invalidUseMsg) {
    System.err.println("cycle_finder: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
  public static void usage(String invalidUseMsg) {
    System.err.println("cycle_finder: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java

  public static void version() {
    System.err.println("cycle_finder " + Version.jarVersion(Options.class));
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
      properties.load(propertiesUrl.openStream());
    } catch (IOException e) {
      System.err.println("unable to access tool properties: " + e);
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

  public static void help(boolean errorExit) {
    System.err.println(helpMessage);
    // javac exits with 2, but any non-zero value works.
    System.exit(errorExit ? 2 : 0);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

  public static void version() {
    System.err.println("tree_shaker " + Version.jarVersion(Options.class));
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

  public static void usage(String invalidUseMsg) {
    System.err.println("tree_shaker: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
  public static void usage(String invalidUseMsg) {
    System.err.println("tree_shaker: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
      properties.load(propertiesUrl.openStream());
    } catch (IOException e) {
      System.err.println("unable to access tool properties: " + e);
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

    if (printArgs) {
      System.err.print("tree_shaker ");
      System.err.println(String.join(" ", args));
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
    if (printArgs) {
      System.err.print("tree_shaker ");
      System.err.println(String.join(" ", args));
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    exitOnErrors();
    if (options.printReferenceGraph()) {
      finder.getReferenceGraph().print(System.out);
    } else {
      List<List<Edge>> cycles = finder.findCycles();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    } else {
      List<List<Edge>> cycles = finder.findCycles();
      printCycles(cycles, System.out);
      System.exit(ErrorUtil.errorCount() + cycles.size());
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    int nErrors = ErrorUtil.errorCount();
    if (nErrors > 0) {
      System.err.println("Failed with " + nErrors + " errors:");
      for (String error : ErrorUtil.getErrorMessages()) {
        System.err.println("error: " + error);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
      System.err.println("Failed with " + nErrors + " errors:");
      for (String error : ErrorUtil.getErrorMessages()) {
        System.err.println("error: " + error);
      }
      System.exit(nErrors);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
    if (logger.isLoggable(Level.INFO)) {
      int nFiles = processedCount;
      System.out.println(String.format(
          "Translated %d %s: %d errors, %d warnings",
          nFiles, nFiles == 1 ? "file" : "files", ErrorUtil.errorCount(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
    ticker.pop();
    ticker.tick("Source generation");
    ticker.printResults(System.out);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
    String unitName = input.getOriginalSourcePath();
    if (logger.isLoggable(Level.INFO)) {
      System.out.println("translating " + unitName);
    }
    TimeTracker ticker = TimeTracker.getTicker(unitName, options.timingLevel());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/TranslationProcessor.java`
#### Snippet
```java
      applyMutations(unit, deadCodeMap, options.externalAnnotations(), ticker);
      ticker.tick("Tree mutations");
      ticker.printResults(System.out);

      GenerationUnit genUnit = input.getGenerationUnit();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/J2ObjC.java`
#### Snippet
```java
    TimingLevel timingLevel = options.timingLevel();
    if (timingLevel == TimingLevel.TOTAL || timingLevel == TimingLevel.ALL) {
      System.out.printf("j2objc execution time: %d ms\n", System.currentTimeMillis() - startTime);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      }
      if (printArgs) {
        System.err.print("j2objc ");
        System.err.println(String.join(" ", args));
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      if (printArgs) {
        System.err.print("j2objc ");
        System.err.println(String.join(" ", args));
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  public static void help(boolean errorExit) {
    System.err.println(helpMessage);
    // javac exits with 2, but any non-zero value works.
    System.exit(errorExit ? 2 : 0);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  public static void version() {
    System.err.println("j2objc " + Version.jarVersion(Options.class));
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      properties.load(propertiesUrl.openStream());
    } catch (IOException e) {
      System.err.println("unable to access tool properties: " + e);
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  public static void xhelp() {
    System.err.println(xhelpMessage);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  public static void usage(String invalidUseMsg) {
    System.err.println("j2objc: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  public static void usage(String invalidUseMsg) {
    System.err.println("j2objc: " + invalidUseMsg);
    System.err.println(usageMessage);
    System.exit(1);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `translator/src/main/java/com/google/devtools/j2objc/util/ErrorUtil.java`
#### Snippet
```java
  private static int errorCount = 0;
  private static int warningCount = 0;
  private static PrintStream errorStream = System.err;
  private static List<String> errorMessages = Lists.newArrayList();
  private static List<String> warningMessages = Lists.newArrayList();
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTDump.java`
#### Snippet
```java

    try (FileOutputStream fout = new FileOutputStream(outputFile);
        OutputStreamWriter out = new OutputStreamWriter(fout, "UTF-8")) {
      out.write(dump(unit));
    } catch (IOException e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
    String charString = Character.toString(value);
    try {
      for (byte b : charString.getBytes("UTF-8")) {
        int unsignedByte = b & 0xFF;
        buffer.append("\\x");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java

  public void testFastEnumeration() throws Exception {
    byte[] buf1 = "foo".getBytes("UTF-8");
    byte[] buf2 = "你好".getBytes("UTF-8");
    ByteString s1 = ByteString.copyFrom(buf1);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
  public void testFastEnumeration() throws Exception {
    byte[] buf1 = "foo".getBytes("UTF-8");
    byte[] buf2 = "你好".getBytes("UTF-8");
    ByteString s1 = ByteString.copyFrom(buf1);
    ByteString s2 = ByteString.copyFrom(buf2);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java

  public void testIterator() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("你好".getBytes("UTF-8"));
    Iterator<Byte> i1 = s1.iterator();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
  public void testIterator() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("你好".getBytes("UTF-8"));
    Iterator<Byte> i1 = s1.iterator();
    Iterator<Byte> i2 = s2.iterator();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java

  public void testToString() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("你好".getBytes("UTF-8"));
    assertEquals("foo", s1.toString("UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
  public void testToString() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("你好".getBytes("UTF-8"));
    assertEquals("foo", s1.toString("UTF-8"));
    assertEquals("你好", s2.toString("UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java

  public void testByteStringIsEqualAndHashCode() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s3 = ByteString.copyFrom("bar".getBytes("UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
  public void testByteStringIsEqualAndHashCode() throws Exception {
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s3 = ByteString.copyFrom("bar".getBytes("UTF-8"));
    assertTrue(s1.equals(s2));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/ByteStringTest.java`
#### Snippet
```java
    ByteString s1 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s2 = ByteString.copyFrom("foo".getBytes("UTF-8"));
    ByteString s3 = ByteString.copyFrom("bar".getBytes("UTF-8"));
    assertTrue(s1.equals(s2));
    assertTrue(s2.equals(s1));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
  private static ImmutableSet<String> loadReservedNames(Supplier<InputStream> inputStream) {
    try (InputStream stream = inputStream.get();
        BufferedReader lines = new BufferedReader(new InputStreamReader(stream, "UTF-8"))) {
      ImmutableSet.Builder<String> builder = ImmutableSet.builder();
      String line;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

  public void testByteStringSubstring() throws Exception {
    ByteString bs1 = ByteString.copyFrom("abcdefghijklmnop".getBytes("UTF-8"));
    ByteString bs2 = bs1.substring(1, 15);
    assertEquals("bcdefghijklmno", new String(bs2.toByteArray(), "UTF-8"));
```

## RuleId[ruleID=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'components.size() != 2'
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/ClassHierarchyAnalyzer.java`
#### Snippet
```java
                Splitter.onPattern(SIGNATURE_PREFIX).splitToList(method);
            // TODO(dpo): add better checking for name & signature components.
            if (components.isEmpty() || components.size() != 2) {
              continue;
            }
```

### ExcessiveRangeCheck
Can be replaced with 'components.size() != 2'
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/RapidTypeAnalyser.java`
#### Snippet
```java
                Splitter.onPattern(SIGNATURE_PREFIX).splitToList(method);
            // TODO(dpo): add better checking for name & signature components.
            if (components.isEmpty() || components.size() != 2) {
              continue;
            }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'name.isEmpty()' covered by subsequent condition '!name.contains(...)'
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public PackageElement getParentPackage(PackageElement element) {
    String name = element.getQualifiedName().toString();
    if (name.isEmpty() || !name.contains(".")) {
      return null;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'constantValue != null' covered by subsequent condition 'constantValue instanceof String'
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public static boolean isStringConstant(VariableElement element) {
    Object constantValue = element.getConstantValue();
    return constantValue != null && constantValue instanceof String
        && UnicodeUtils.hasValidCppCharacters((String) constantValue);
  }
```

### ConditionCoveredByFurtherCondition
Condition 'preStart \>= 0' covered by subsequent conditions
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
      return text;
    }
    if (preStart >= 0 && preEnd >= 0 && preEnd < preStart) {
      // Bad code formatting, don't try to escape.
      return text;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
    Set<String> attributes = new HashSet<>();
    if (attributesStr != null) {
      attributes.addAll(Arrays.asList(attributesStr.split(",\\s*")));
      attributes.remove(""); // Clear any empty strings.
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
      // Include root package in regex. For example, foo.bar.* needs to match
      // foo.bar, foo.bar.mumble, etc.
      String root = s.substring(0, s.length() - 2).replace(".",  "\\.");
      return UnicodeUtils.format("^(%s|%s\\..*)$", root, root);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
      return UnicodeUtils.format("^(%s|%s\\..*)$", root, root);
    }
    return UnicodeUtils.format("^%s$", s.replace(".", "\\.").replace("\\*", ".*"));
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
      return UnicodeUtils.format("^(%s|%s\\..*)$", root, root);
    }
    return UnicodeUtils.format("^%s$", s.replace(".", "\\.").replace("\\*", ".*"));
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
    String fileArgs = Files.asCharSource(f, Charset.forName(options.fileEncoding())).read();
    // Simple split on any whitespace, quoted values aren't supported.
    processArgs(fileArgs.split("\\s+"), options);
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java

  private String escapeDocText(String text) {
    return skipStyleTag(escapeCodeText(text.replace("@", "@@").replace("/*", "/\\*")));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java

  private String escapeDocText(String text) {
    return skipStyleTag(escapeCodeText(text.replace("@", "@@").replace("/*", "/\\*")));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String fixNumberToken(String token, TypeKind kind) {
    token = token.replace("_", "");  // Remove any embedded underscores.
    assert kind.isPrimitive();
    switch (kind) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    // Convert floating point literals to C format.  No checking is
    // necessary, since the format was verified by the parser.
    if (token.matches(FLOATING_POINT_SUFFIX_REGEX)) {
      token = token.substring(0, token.length() - 1);  // strip suffix
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      token = token.substring(0, token.length() - 1);  // strip suffix
    }
    if (token.matches(HEX_LITERAL_REGEX)) {
      token = Double.toString(Double.parseDouble(token));
    } else if (!token.matches(EXPONENTIAL_FLOATING_POINT_REGEX)) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    if (token.matches(HEX_LITERAL_REGEX)) {
      token = Double.toString(Double.parseDouble(token));
    } else if (!token.matches(EXPONENTIAL_FLOATING_POINT_REGEX)) {
      if (token.indexOf('.') == -1) {
        token += ".0";  // C requires a fractional part, except in exponential form.
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      // Split string between the two '?' chars in the trigraph, so compiler
      // will concatenate the string without interpreting the trigraph.
      String[] substrings = s.split("\\?\\?");
      StringBuilder buffer = new StringBuilder(substrings[0]);
      for (int i = 1; i < substrings.length; i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
    }
    if (name != null) {
      return name.replaceAll(":", "_");
    } else {
      return addParamNames(method, getMethodName(method), '_');
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      String fileArgs = Files.asCharSource(f, fileUtil.getCharset()).read();
      // Simple split on any whitespace, quoted values aren't supported.
      processArgs(fileArgs.split("\\s+"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
    List<URL> bootURLs = new ArrayList<>();
    for (String path : options.getBootClasspath()) {
      if (path.matches("^.*jre_emul.*jar$")) {
        try {
          bootURLs.add(new File(path).toURI().toURL());
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.lang.model.element` is unnecessary, and can be replaced with an import
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
        = GeneratedVariableElement.newLocalVar(varName, type.getTypeMirror(), executableElement);
    if (node.getVariableModifiers().contains(Flags.Flag.FINAL)) {
      elem.addModifiers(javax.lang.model.element.Modifier.FINAL);
    }
    localVariableTable.put(varName, elem);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
    boolean isFinal = node.getModifiers().contains(Flags.Flag.FINAL);
    if (isFinal) {
      varDecl.setModifiers(java.lang.reflect.Modifier.FINAL);
    }
    AstType astType = node.getType();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.lang.model.element` is unnecessary, and can be replaced with an import
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
          = GeneratedVariableElement.newLocalVar(varName, type.getTypeMirror(), executableElement);
      if (isFinal) {
        elem.addModifiers(javax.lang.model.element.Modifier.FINAL);
      }
      localVariableTable.put(varName, elem);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.ast` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
      if (ErrorUtil.errorCount() == 0) {
        for (CompilationUnitTree ast : units) {
          com.google.devtools.j2objc.ast.CompilationUnit unit = TreeConverter
              .convertCompilationUnit(options, env, ast);
          processDiagnostics(env.diagnostics());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.tools.javac.parser` is unnecessary, and can be replaced with an import
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
      return null;
    }
    com.sun.tools.javac.parser.Tokens.Comment javacComment = docComments.getComment((JCTree) node);
    Comment comment;
    switch (javacComment.getStyle()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.tools.javac.api` is unnecessary, and can be replaced with an import
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
    }
    Types types =
        Types.instance(((com.sun.tools.javac.api.BasicJavacTask) env.task()).getContext());
    return newNode
        .setTypeMirror(targets.iterator().next())
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.ast` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/FileProcessor.java`
#### Snippet
```java

  protected abstract void processConvertedTree(
      ProcessingContext input, com.google.devtools.j2objc.ast.CompilationUnit unit);

  protected abstract void processOutputs(Iterable<ProcessingContext> inputs);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.ast` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/FileProcessor.java`
#### Snippet
```java

  private void processCompiledSource(ProcessingContext input,
      com.google.devtools.j2objc.ast.CompilationUnit unit) {
    InputFile file = input.getFile();
    if (closureQueue != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.gen` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSegmentedHeaderGenerator.java`
#### Snippet
```java

  /**
   * Given a {@link com.google.devtools.j2objc.gen.GeneratedType}
   * and its collected {@link com.google.devtools.j2objc.types.Import}s,
   * print its 'local includes'; viz.,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.types` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSegmentedHeaderGenerator.java`
#### Snippet
```java
  /**
   * Given a {@link com.google.devtools.j2objc.gen.GeneratedType}
   * and its collected {@link com.google.devtools.j2objc.types.Import}s,
   * print its 'local includes'; viz.,
   * {@code INCLUDE} directives for all supertypes that are defined in the
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.file` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java

  /**
   * Find a {@link com.google.devtools.j2objc.file.InputFile} on the source path,
   * either in a directory or a jar, using a fully-qualified type name.
   * Returns a file guaranteed to exist, or null.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.file` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java

  /**
   * Find a {@link com.google.devtools.j2objc.file.InputFile} on the class path,
   * either in a directory or a jar, using a fully-qualified type name.
   * Returns a file guaranteed to exist, or null.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.file` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java

/**
 * Utilities for reading {@link com.google.devtools.j2objc.file.InputFile}s.
 *
 * @author Tom Ball, Keith Stanger, Mike Thvedt, Tim Gao
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.devtools.j2objc.gen` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/gen/GeneratedSourceMappings.java`
#### Snippet
```java
 *
 * <p>These mappings may be converted to {@link
 * com.google.devtools.j2objc.gen.KytheIndexingMetadata} objects to support cross-language links in
 * <a href="http://kythe.io">Kythe.</a>
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/javac/MemoryFileObject.java`
#### Snippet
```java
  @Override
  public Writer openWriter() throws IOException {
    throw new java.lang.UnsupportedOperationException();
  }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/javac/MemoryFileObject.java`
#### Snippet
```java
  @Override
  public InputStream openInputStream() throws IOException {
    throw new java.lang.UnsupportedOperationException();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `translator/src/main/java/com/google/devtools/j2objc/javac/MemoryFileObject.java`
#### Snippet
```java
  @Override
  public OutputStream openOutputStream() throws IOException {
    throw new java.lang.UnsupportedOperationException();
  }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Name()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Name.java`
#### Snippet
```java
  private Element element;

  public Name() {}

  public Name(Name other) {
```

### NonProtectedConstructorInAbstractClass
Constructor `Name()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Name.java`
#### Snippet
```java
  }

  public Name(Element element) {
    this.element = element;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Name()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Name.java`
#### Snippet
```java
  public Name() {}

  public Name(Name other) {
    super(other);
    element = other.getElement();
```

### NonProtectedConstructorInAbstractClass
Constructor `Parser()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/util/Parser.java`
#### Snippet
```java
  protected static final Splitter PATH_SPLITTER = Splitter.on(":").omitEmptyStrings();

  public Parser(Options options){
    this.options = options;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BodyDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/BodyDeclaration.java`
#### Snippet
```java
  }

  public BodyDeclaration(Element element) {
    modifiers = ElementUtil.fromModifierSet(element.getModifiers());
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BodyDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/BodyDeclaration.java`
#### Snippet
```java
  BodyDeclaration() {}

  public BodyDeclaration(BodyDeclaration other) {
    super(other);
    modifiers = other.getModifiers();
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotatableType()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AnnotatableType.java`
#### Snippet
```java
  protected ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);

  public AnnotatableType(AnnotatableType other) {
    super(other);
    annotations.copyFrom(other.annotations());
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotatableType()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AnnotatableType.java`
#### Snippet
```java
  }

  public AnnotatableType(TypeMirror typeMirror) {
    super(typeMirror);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `FileProcessor()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/FileProcessor.java`
#### Snippet
```java
  private final Set<ProcessingContext> outputs = new HashSet<>();

  public FileProcessor(Parser parser) {
    this.parser = Preconditions.checkNotNull(parser);
    this.options = parser.options();
```

### NonProtectedConstructorInAbstractClass
Constructor `MethodReference()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodReference.java`
#### Snippet
```java
  public MethodReference() {}

  public MethodReference(MethodReference other) {
    super(other);
    method = other.getExecutableElement();
```

### NonProtectedConstructorInAbstractClass
Constructor `MethodReference()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodReference.java`
#### Snippet
```java
  protected final ChildList<Type> typeArguments = ChildList.create(Type.class, this);

  public MethodReference() {}

  public MethodReference(MethodReference other) {
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclaration.java`
#### Snippet
```java
  }

  public VariableDeclaration(VariableElement variableElement, Expression initializer) {
    super();
    this.variableElement = variableElement;
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclaration.java`
#### Snippet
```java
  public VariableDeclaration() {}

  public VariableDeclaration(VariableDeclaration other) {
    super(other);
    variableElement = other.getVariableElement();
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclaration.java`
#### Snippet
```java
  protected ChildLink<Expression> initializer = ChildLink.create(Expression.class, this);

  public VariableDeclaration() {}

  public VariableDeclaration(VariableDeclaration other) {
```

### NonProtectedConstructorInAbstractClass
Constructor `Type()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Type.java`
#### Snippet
```java
  }

  public Type(TypeMirror typeMirror) {
    super();
    this.typeMirror = typeMirror;
```

### NonProtectedConstructorInAbstractClass
Constructor `Type()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Type.java`
#### Snippet
```java
  Type() {}

  public Type(Type other) {
    super(other);
    typeMirror = other.getTypeMirror();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTypeDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AbstractTypeDeclaration.java`
#### Snippet
```java
  AbstractTypeDeclaration() {}

  public AbstractTypeDeclaration(AbstractTypeDeclaration other) {
    super(other);
    typeElement = other.getTypeElement();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTypeDeclaration()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AbstractTypeDeclaration.java`
#### Snippet
```java
  }

  public AbstractTypeDeclaration(TypeElement typeElement) {
    super(typeElement);
    this.typeElement = typeElement;
```

### NonProtectedConstructorInAbstractClass
Constructor `FunctionalExpression()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionalExpression.java`
#### Snippet
```java
  protected ChildList<Expression> lambdaCaptureArgs = ChildList.create(Expression.class, this);

  public FunctionalExpression() {
  }

```

### NonProtectedConstructorInAbstractClass
Constructor `FunctionalExpression()` of an abstract class should not be declared 'public'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionalExpression.java`
#### Snippet
```java
  }

  public FunctionalExpression(FunctionalExpression other) {
    super(other);
    typeMirror = other.getTypeMirror();
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
      }
      Integer idx = pointers.get(ptr);
      if (idx == null) {
        idx = pointers.size();
        pointers.put(ptr, idx);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
  private static void memUsageRepeatedMessages(final int numMessages) {
    System.out.println("*** memUsageRepeatedMessages - " + numMessages + " ***");
    testMemUsage(new Runnable() {
      public void run() {
        SingleRepeatedMessage.Builder builder = SingleRepeatedMessage.newBuilder();
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
  private static void memUsageIntExtension() {
    System.out.println("*** memUsageIntExtension ***");
    testMemUsage(new Runnable() {
      public void run() {
        protoReference = MessageWithExtensions.newBuilder()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
  private static void memUsageRepeatedInts(final int numInts) {
    System.out.println("*** memUsageRepeatedInts - " + numInts + " ***");
    testMemUsage(new Runnable() {
      public void run() {
        SingleRepeatedInt.Builder builder = SingleRepeatedInt.newBuilder();
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
  private static void memUsageRepeatedIntExtension(final int numInts) {
    System.out.println("*** memUsageRepeatedIntExtension - " + numInts + " ***");
    testMemUsage(new Runnable() {
      public void run() {
        List<Integer> ints = new ArrayList<Integer>(numInts);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protobuf/tests/MemoryBenchmarks.java`
#### Snippet
```java
  private static void memUsageSingleInnerMessage() {
    System.out.println("*** memUsageSingleInnerMessage ***");
    testMemUsage(new Runnable() {
      public void run() {
        protoReference = SingleMessage.newBuilder().setMsg(NoFields.newBuilder().build()).build();
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
          "strong");
  private static final Ordering<String> ATTRIBUTE_ORDERING = Ordering.explicit(PROPERTY_ATTRIBUTES);
  private static final Comparator<String> ATTRIBUTES_COMPARATOR = new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeDeclarationGenerator.java`
#### Snippet
```java
  @VisibleForTesting
  static final Comparator<MethodDeclaration> METHOD_DECL_ORDER =
      new Comparator<MethodDeclaration>() {
    @Override
    public int compare(MethodDeclaration m1, MethodDeclaration m2) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
  private Runnable captureCurrentScope(Runnable runnable) {
    Scope capturedScope = peekScope();
    return new Runnable() {
      @Override
      public void run() {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
      return null;
    }
    type = typeUtil.erasure(type);
    if (TypeUtil.isDeclaredType(type)) {
      return getTypeName(TypeUtil.asTypeElement(type));
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public static TypeElement getDeclaringClass(Element element) {
    do {
      element = element.getEnclosingElement();
    } while (element != null && !isTypeElement(element));
    return (TypeElement) element;
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public static PackageElement getPackage(Element e) {
    while (e != null && !isPackage(e)) {
      e = e.getEnclosingElement();
    }
    return (PackageElement) e;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
        return TypeUtil.asTypeElement(type);
      }
      type = typeUtil.getSuperclass(type);
    }
    return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `funcName`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
    }
    TypeMirror pointerType = new PointerType(type);
    funcName = "JreBoxed" + funcName + translationUtil.getOperatorFunctionModifier(operand)
        + NameTable.capitalize(primitiveType.toString());
    FunctionElement element = new FunctionElement(funcName, type, TypeUtil.asTypeElement(type))
```

### AssignmentToMethodParameter
Assignment to method parameter `primitiveType`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
    }
    if (primitiveType == null && boxedClass != null) {
      primitiveType = typeUtil.unboxedType(boxedClass.asType());
    }
    if (primitiveType == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileObjects`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
    List<String> javacOptions = getJavacOptions(processAnnotations);
    if (fileObjects == null) {
      fileObjects = new ArrayList<>();
    }
    for (JavaFileObject jfo : fileManager.getJavaFileObjectsFromFiles(files)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
    TypeKind t = type.getKind();
    if (t == TypeKind.DECLARED) {
      type = javacTypes.unboxedType(type);
      t = type.getKind();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java

  public String getSignatureName(TypeMirror t) {
    t = erasure(t);
    switch (t.getKind()) {
      case ARRAY:
```

### AssignmentToMethodParameter
Assignment to method parameter `varargsType`
in `translator/src/main/java/com/google/devtools/j2objc/translate/VarargsRewriter.java`
#### Snippet
```java
      return;
    }
    varargsType = typeUtil.erasure(varargsType);
    int numRegularParams = method.getParameters().size() - 1;
    List<Expression> varargs = args.subList(numRegularParams, args.size());
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
    @Override
    public int compare(String a, String b) {
      if (a.startsWith("getter")) { a = "getter"; }
      if (a.startsWith("setter")) { a = "setter"; }
      if (b.startsWith("getter")) { b = "getter"; }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
    public int compare(String a, String b) {
      if (a.startsWith("getter")) { a = "getter"; }
      if (a.startsWith("setter")) { a = "setter"; }
      if (b.startsWith("getter")) { b = "getter"; }
      if (b.startsWith("setter")) { b = "setter"; }
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
      if (a.startsWith("getter")) { a = "getter"; }
      if (a.startsWith("setter")) { a = "setter"; }
      if (b.startsWith("getter")) { b = "getter"; }
      if (b.startsWith("setter")) { b = "setter"; }
      return ATTRIBUTE_ORDERING.compare(a, b);
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
      if (a.startsWith("setter")) { a = "setter"; }
      if (b.startsWith("getter")) { b = "getter"; }
      if (b.startsWith("setter")) { b = "setter"; }
      return ATTRIBUTE_ORDERING.compare(a, b);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCHeaderGenerator.java`
#### Snippet
```java
  protected static String getVarPrefix(String header) {
    if (header.endsWith(".h")) {
      header = header.substring(0, header.length() - 2);
    }
    return UnicodeUtils.asValidObjcIdentifier(NameTable.camelCasePath(header));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
    result.append('(');
    // consume '('
    offset++;
    boolean first = true;
    while (type.charAt(offset) != ')') {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
        result.append(',');
      }
      offset = getType(type, offset, result);
    }
    // consume ')'
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
    }
    // consume ')'
    offset++;
    result.append(')');
    return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
        return offset + 1;
      case '[':
        offset = getType(type, offset + 1, result);
        result.append("[]");
        return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
      default:
        StringBuilder argTypes = new StringBuilder();
        offset = getArgTypes(type, offset, argTypes);
        offset = getType(type, offset, result);
        result.append(argTypes);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
        StringBuilder argTypes = new StringBuilder();
        offset = getArgTypes(type, offset, argTypes);
        offset = getType(type, offset, result);
        result.append(argTypes);
        return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `translator/src/main/java/com/google/devtools/j2objc/gen/SourceBuilder.java`
#### Snippet
```java
  public char[] pad(int n) {
    if (n < 0) {
      n = 0;
    }
    char[] result = new char[n];
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/ClassHierarchyAnalyzer.java`
#### Snippet
```java

  private static void markOverriddenMemberLive(Type type, String memberName) {
    while ((type = type.getSuperClass()) != null) {
      Member member = type.getMemberByName(memberName);
      if (member != null && member.isPolymorphic()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
    TreeNode topConditional = null;
    while (node != limit) {
      node = node.getParent();
      if (isConditional(node)) {
        topConditional = node;
```

### AssignmentToMethodParameter
Assignment to method parameter `stmtList`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
        stmtList.add(newIf);
        Block thenBlock = new Block();
        stmtList = thenBlock.getStatements();
        newIf.setThenStatement(thenBlock);
        lastIfExtractIdx = branches.indexOf(branch);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
        return true;
      }
      node = parent;
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
    while (node != currentTopNode) {
      ancestors.add(node);
      node = node.getParent();
    }
    return ancestors;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/RapidTypeAnalyser.java`
#### Snippet
```java

  private static void markOverriddenMembersPotentiallyLive(Type type, String memberSignature) {
    while ((type = type.getSuperClass()) != null) {
      Member member = type.getMemberBySignature(memberSignature);
      if (member != null && member.isPolymorphic()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `qualifier`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
      // implements the default method. Since the default method is an instance
      // method it captures self.
      qualifier = null;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
  private static Scope firstClassScope(Scope scope) {
    while (scope != null && scope.kind != ScopeKind.CLASS) {
      scope = scope.outer;
    }
    return scope;
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String fixNumberToken(String token, TypeKind kind) {
    token = token.replace("_", "");  // Remove any embedded underscores.
    assert kind.isPrimitive();
    switch (kind) {
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    if (token.equals("0x80000000") || token.equals("-2147483648")) {
      // Convert min int literal to an expression
      token = "-0x7fffffff - 1";
    } else if (token.startsWith("0x")) {
      token = "(jint) " + token;  // Ensure constant is treated as signed.
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      token = "-0x7fffffff - 1";
    } else if (token.startsWith("0x")) {
      token = "(jint) " + token;  // Ensure constant is treated as signed.
    }
    return token;
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    if (token.equals("0x8000000000000000L") || token.equals("-9223372036854775808L")) {
      // Convert min long literal to an expression
      token = "-0x7fffffffffffffffLL - 1";
    } else {
      // Convert Java long literals to jlong for Obj-C
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
      // Convert Java long literals to jlong for Obj-C
      if (token.startsWith("0x")) {
        token = "(jlong) " + token;  // Ensure constant is treated as signed.
      }
      int pos = token.length() - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

      if (numLs == 1) {
        token += 'L';
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    // necessary, since the format was verified by the parser.
    if (token.matches(FLOATING_POINT_SUFFIX_REGEX)) {
      token = token.substring(0, token.length() - 1);  // strip suffix
    }
    if (token.matches(HEX_LITERAL_REGEX)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    }
    if (token.matches(HEX_LITERAL_REGEX)) {
      token = Double.toString(Double.parseDouble(token));
    } else if (!token.matches(EXPONENTIAL_FLOATING_POINT_REGEX)) {
      if (token.indexOf('.') == -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java
    } else if (!token.matches(EXPONENTIAL_FLOATING_POINT_REGEX)) {
      if (token.indexOf('.') == -1) {
        token += ".0";  // C requires a fractional part, except in exponential form.
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaRewriter.java`
#### Snippet
```java
    while (true) {
      sb.append((char) ('a' + (i % 26)));
      i = i / 26;
      if (i == 0) {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaRewriter.java`
#### Snippet
```java
        break;
      }
      i--;
    }
    return sb.reverse().toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java

    private TypeNode getOrCreateNode(TypeMirror type) {
      type = getElementType(type);
      String signature = nameUtil.getSignature(type);
      TypeNode node = allTypes.get(signature);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
  private static TypeMirror getElementType(TypeMirror t) {
    while (TypeUtil.isArray(t)) {
      t = ((ArrayType) t).getComponentType();
    }
    return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java

  private FunctionInvocation createCastCheck(TypeMirror type, Expression expr) {
    type = typeUtil.erasure(type);
    TypeMirror idType = TypeUtil.ID_TYPE;
    if (TypeUtil.isInterface(type) || isObjectArray(type)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/util/CaptureInfo.java`
#### Snippet
```java
  private String getCaptureFieldName(VariableElement var, TypeElement type) {
    int suffix = 0;
    while ((type = ElementUtil.getSuperclass(type)) != null && ElementUtil.isLocal(type)) {
      suffix++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
    int arrayDimensions = 0;
    while (TypeUtil.isArray(type)) {
      type = ((ArrayType) type).getComponentType();
      arrayDimensions++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      TypeMirror type, String qualifiers, boolean asObjCGenericDecl, boolean isArrayComponent) {
    String objcType;
    type = TypeUtil.unannotatedType(type);
    if (type instanceof NativeType) {
      objcType = ((NativeType) type).getName();
```

### AssignmentToMethodParameter
Assignment to method parameter `qualifiers`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
        if (idx != -1) {
          pointeeQualifiers = qualifiers.substring(0, idx);
          qualifiers = qualifiers.substring(idx + 1);
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `qualifiers`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
    }
    if (qualifiers != null) {
      qualifiers = qualifiers.trim();
      if (!qualifiers.isEmpty()) {
        objcType += " " + qualifiers;
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
   */
  public String getFullName(TypeElement element) {
    element = typeUtil.getObjcClass(element);
    String fullName = fullNameCache.get(element);
    if (fullName == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
  private static String maybeRenameVar(VariableElement var, String name) {
    if (isReservedName(name)) {
      name += '_';
    } else if (ElementUtil.isParameter(var) && badParameterNames.contains(name)) {
      name += "Arg";
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      name += '_';
    } else if (ElementUtil.isParameter(var) && badParameterNames.contains(name)) {
      name += "Arg";
    }
    return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `method`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
    }
    if (ElementUtil.isInstanceMethod(method)) {
      method = elementUtil.getOriginalMethod(method);
    }
    selector = getRenamedMethodName(method);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
   */
  public static VariableElement getVariableElement(Expression node) {
    node = trimParentheses(node);
    switch (node.getKind()) {
      case FIELD_ACCESS:
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        }
      }
      node = node.getParent();
    }
    return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
  public static Expression trimParentheses(Expression node) {
    while (node instanceof ParenthesizedExpression) {
      node = ((ParenthesizedExpression) node).getExpression();
    }
    return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        return type.cast(node);
      }
      node = node.getParent();
    }
    return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/gen/SignatureGenerator.java`
#### Snippet
```java
    }
    while (TypeUtil.isArray(type)) {
      type = ((ArrayType) type).getComponentType();
    }
    switch (type.getKind()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java

    while (parent instanceof ParenthesizedExpression) {
      node = (Expression) parent;
      parent = node.getParent();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
        return level == ReflectionSupport.Level.FULL;
      }
      type = ElementUtil.getDeclaringClass(type);
    }
    // Check package level annotations
```

### AssignmentToMethodParameter
Assignment to method parameter `receiver`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
    if (!ElementUtil.isStatic(element)) {
      if (receiver == null) {
        receiver = new ThisExpression(TreeUtil.getEnclosingTypeElement(node).asType());
      }
      funcArgs.add(0, TreeUtil.remove(receiver));
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayAccess.java`
#### Snippet
```java
    Expression arrayNode = array.get();
    TypeMirror arrayType = arrayNode != null ? arrayNode.getTypeMirror() : null;
    return arrayType != null ? ((ArrayType) arrayType).getComponentType() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LogSiteInjector.java`
#### Snippet
```java
  private Expression sourceFileLiteral() {
    if (unit.getSourceFilePath() == null) {
      return null;
    }
    File sourceFile = new File(unit.getSourceFilePath());
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DestructorGenerator.java`
#### Snippet
```java
    if (size > 1) {
      ErrorUtil.error("There can be at most one @OnDealloc method.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DestructorGenerator.java`
#### Snippet
```java
    }

    return size == 0 ? null : onDeallocMethodDeclarations.get(0);
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DestructorGenerator.java`
#### Snippet
```java
    if (ElementUtil.isStatic(var) || varType.getKind().isPrimitive()
        || ElementUtil.isWeakReference(var)) {
      return null;
    }
    boolean isVolatile = ElementUtil.isVolatile(var);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/DestructorGenerator.java`
#### Snippet
```java
    }
    if (funcName == null) {
      return null;
    }
    TypeMirror voidType = typeUtil.getVoid();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
      Element enclosing = type.getEnclosingElement();
      return ElementUtil.isExecutableElement(enclosing)
          ? nameTable.getMethodSelector((ExecutableElement) enclosing) : null;
    }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
          TreeUtil.getRuntimeAnnotationsList(decl.getAnnotations());
      if (runtimeAnnotations.isEmpty()) {
        return null;
      }
      return addAnnotationsFunction(createAnnotations(runtimeAnnotations));
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java

  private String getTypeName(TypeElement type) {
    return type == null ? null : "L" + nameTable.getFullName(type) + ";";
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
  private String getTypeName(TypeMirror type) {
    if (type == null) {
      return null;
    }
    type = typeUtil.erasure(type);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java
    } catch (IOException e) {
      ErrorUtil.error(e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
      }
      if (!hasAnnotations) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java`
#### Snippet
```java
  private String getTypeList(Iterable<? extends TypeMirror> types) {
    if (Iterables.isEmpty(types)) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ExternalAnnotationInjector.java`
#### Snippet
```java
    if (element == null) {
      reportNoSuchClass(annotation);
      return null;
    }
    DeclaredType type = (DeclaredType) element.asType();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/CastExpression.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Type typeNode = type.get();
    return typeNode != null ? typeNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TypeDeclaration.java`
#### Snippet
```java

  public TypeMirror getSuperclassTypeMirror() {
    return stripSupertypes ? null : getTypeElement().getSuperclass();
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
      curScope = curScope.next;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
      return ((LabeledStatement) parent).getLabel().getIdentifier();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavadocConverter.java`
#### Snippet
```java
    DocCommentTree docComment = docTrees.getDocCommentTree(path);
    if (docComment == null) {
      return null; // Declaration does not have a javadoc comment.
    }
    JavadocConverter converter =
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
      } catch (IllegalArgumentException e) {
        ErrorUtil.warning(node, "Unknown OCNI type: " + typeStr);
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
      ErrorUtil.warning(node, "JSNI comment found");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      ExecutableElement topMethod, TypeElement declaringClass, TypeElement currentType) {
    if (currentType == null) {
      return null;
    }
    TypeElement superclass =
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
        "set" + NameTable.capitalize(propertyName),
        TypeUtil.getQualifiedName(type));
    return setter != null && isStatic == isStatic(setter) ? setter : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
    String name = element.getQualifiedName().toString();
    if (name.isEmpty() || !name.contains(".")) {
      return null;
    }
    name = name.substring(0, name.lastIndexOf('.'));
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      return ((GeneratedExecutableElement) e).getSelector();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java

  public static String getHeader(TypeElement e) {
    return e instanceof GeneratedTypeElement ? ((GeneratedTypeElement) e).getHeader() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
  public static String getTypeQualifiers(VariableElement element) {
    return element instanceof GeneratedVariableElement
        ? ((GeneratedVariableElement) element).getTypeQualifiers() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
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
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
      getter = ElementUtil.findMethod(declaringClass, prefix + NameTable.capitalize(propertyName));
    }
    return getter != null && isStatic == isStatic(getter) ? getter : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
    // Procyon only adds comment nodes to report decompilation errors.
    ErrorUtil.error(node.getContent());
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ClassInstanceCreation.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Type typeNode = type.get();
    return typeNode != null ? typeNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PostfixExpression.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Expression operandNode = operand.get();
    return operand != null ? operandNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Autoboxer.java`
#### Snippet
```java
      type = typeUtil.getSuperclass(type);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationExpression.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Type typeNode = type.get();
    return typeNode != null ? typeNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `protobuf/tests/OneofTest.java`
#### Snippet
```java
      case ONEOF_INT: return ONEOF_INT_BYTES;
      case ONEOF_MESSAGE: return ONEOF_MESSAGE_BYTES;
      default: return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
    if (c >= 0x20 && c <= 0x7E) {
      // Printable ASCII character.
      return null;
    } else if (c < 0x20 || (c >= 0x7F && c < 0xA0)) {
      // Invalid C++ Unicode number, convert to UTF-8 sequence.
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/NumberMethodRewriter.java`
#### Snippet
```java
    TypeMirror supertype = ((TypeElement) type.asElement()).getSuperclass();
    if (typeUtil.isSameType(supertype, typeUtil.getJavaObject().asType())) {
      return null;
    }
    return findNumberMethod((DeclaredType) supertype, name, paramTypes);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedVariableElement.java`
#### Snippet
```java
  @Override
  public Object getConstantValue() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
  private Statement getSideEffects(Expression expr) {
    Expression sideEffectsExpr = extractSideEffects(expr);
    return sideEffectsExpr == null ? null : new ExpressionStatement(sideEffectsExpr);
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
            }
          }
          return null;
        }
      case PARENTHESIZED_EXPRESSION:
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
        return getKnownValue(((ParenthesizedExpression) expr).getExpression());
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
  private Expression extractSideEffects(Expression expr) {
    if (expr.getConstantValue() instanceof Boolean) {
      return null;
    }
    switch (expr.getKind()) {
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
            return ParenthesizedExpression.parenthesize(sideEffects);
          }
          return null;
        }
      default:
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
        }
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/ConstantBranchPruner.java`
#### Snippet
```java
   */
  private Boolean getReplaceableValue(Expression expr) {
    return TranslationUtil.hasSideEffect(expr) ? null : getKnownValue(expr);
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
      ErrorUtil.fatalError(e, path);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
          switch (tokenizer.ttype) {
            case ';':
              return sb.length() > 0 ? sb.toString() : null;
            case '.':
            case '_':
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
        }
      }
      return null; // Package statement not found.
    } catch (IOException e) {
      throw new AssertionError("Exception reading string: " + e);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
    } catch (IOException e) {
      ErrorUtil.error(e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
      if (!it.hasNext()) {
        processDiagnostics(parserEnv.diagnostics());
        return null;
      }
      CompilationUnitTree unit = it.next();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
      ErrorUtil.fatalError(e, path);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
    DocCommentTable docComments = ((JCCompilationUnit) unit).docComments;
    if (!docCommentsEnabled || docComments == null || !docComments.hasComment((JCTree) node)) {
      return null;
    }
    com.sun.tools.javac.parser.Tokens.Comment javacComment = docComments.getComment((JCTree) node);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
        return expression.getRightOperand();
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/Assignment.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Expression leftHandSideNode = leftHandSide.get();
    return leftHandSideNode != null ? leftHandSideNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
    } catch (Throwable e) {
      ErrorUtil.fatalError(e, sourceFilePath);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
  private TreeNode getAssociatedJavaDoc(Tree node, TreePath path) {
    Comment comment = convertAssociatedComment(node, path);
    return comment != null && comment.isDocComment() ? comment : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
        return ((MemberSelectTree) node).getIdentifier().toString();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java`
#### Snippet
```java
  private TreeNode convert(Tree node, TreePath parent) {
    if (node == null) {
      return null;
    }
    TreeNode newNode = convertInner(node, parent).setPosition(getPosition(node));
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedTypeElement.java`
#### Snippet
```java
    public TypeMirror getEnclosingType() {
      TypeElement declaringClass = ElementUtil.getDeclaringClass(GeneratedTypeElement.this);
      return declaringClass == null ? null : declaringClass.asType();
    }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
  @Override
  public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      case "Z": return getBoolean();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
    List<? extends TypeMirror> supertypes = directSupertypes(t);
    if (supertypes.isEmpty()) {
      return null;
    }
    TypeMirror first = supertypes.get(0);
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      return (DeclaredType) first;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java

  public static TypeParameterElement asTypeParameterElement(TypeMirror t) {
    return isTypeVariable(t) ? (TypeParameterElement) ((TypeVariable) t).asElement() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java

  public static ElementKind getDeclaredTypeKind(TypeMirror t) {
    return isDeclaredType(t) ? ((DeclaredType) t).asElement().getKind() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      return new ExecutablePair(methodElem, asMemberOf(type, methodElem));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      return asTypeElement(((IntersectionType) t).getBounds().iterator().next());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
  public PrimitiveType unboxedType(TypeMirror t) {
    if (isGeneratedType(t)) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      return javacTypes.unboxedType(t);
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
      return getObjcClass(asTypeElement(lub));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/QualifiedName.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    SimpleName nameNode = name.get();
    return nameNode != null ? nameNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    List<String> restrictToFiles = options.getRestrictToFiles();
    if (restrictToFiles.isEmpty()) {
      return null;
    }
    return NameList.createFromFiles(restrictToFiles, options.fileEncoding());
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java`
#### Snippet
```java
  private TypeKind getPrimitiveKind(TypeMirror t) {
    if (t == null) {
      return null;
    }
    if (t.getKind().isPrimitive()) {
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java`
#### Snippet
```java
    }
    PrimitiveType p = typeUtil.unboxedType(t);
    return p != null ? p.getKind() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/types/AbstractTypeMirror.java`
#### Snippet
```java
  @Override
  public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/FieldAccess.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    SimpleName nameNode = name.get();
    return nameNode != null ? nameNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/BuildClosureQueue.java`
#### Snippet
```java
        logger.finest("no source for " + name + ", class found");
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/BuildClosureQueue.java`
#### Snippet
```java
        name.replace('.', File.separatorChar) + ".h");
    if (headerSource.exists() && inputFile.lastModified() < headerSource.lastModified()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/BuildClosureQueue.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ClassFile.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ClassFile.java`
#### Snippet
```java
      path = file.getUnitName();
      if (!path.endsWith(".class")) {
        return null;
      }
      // Remove .class suffix, as JarTypeLoader adds it.
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ClassFile.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/ClassFile.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
    String prefix = key + '=';
    String attribute = getAttribute(prefix);
    return attribute != null ? attribute.substring(prefix.length()) : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/PropertyAnnotation.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/PackageInfoRewriter.java`
#### Snippet
```java
      return (String) ElementUtil.getAnnotationValue(objcName.getAnnotationMirror(), "value");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
    List<String> sourceFiles = getSourceFiles();
    if (ErrorUtil.errorCount() > 0) {
      return null;
    }
    File strippedDir = stripIncompatible(sourceFiles, parser);
```

### ReturnNull
Return of `null`
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/TreeShaker.java`
#### Snippet
```java
    FileUtil.deleteTempDir(strippedDir);
    if (ErrorUtil.errorCount() > 0) {
      return null;
    }
    TypeGraphBuilder tgb = new TypeGraphBuilder(context.getLibraryInfo());
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
      scope = scope.outer;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
      }
      if (!TypeUtil.isReferenceType(type) || isRawType(type)) {
        return null;
      }
      if (TYPE_DEPTH_COUNTER.visit(type) > 5) {
```

### ReturnNull
Return of `null`
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
      if (TYPE_DEPTH_COUNTER.visit(type) > 5) {
        // Avoid infinite recursion caused by type argument cycles.
        return null;
      }
      return createNode(type, signature, NameUtil.getName(type));
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
      return TreeUtil.getVariableElement(ie.getLeftOperand());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
      }
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
      return invocation;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
    return name != null
        ? name
        : (executableElement != null ? Name.newName(null, executableElement) : null);
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/CaptureInfo.java`
#### Snippet
```java
  public VariableElement getOuterField(TypeElement type) {
    Capture outerCapture = outerCaptures.get(type);
    return outerCapture != null ? outerCapture.field : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/CaptureInfo.java`
#### Snippet
```java
  public VariableElement getReceiverField(TypeElement type) {
    Capture capture = receiverCaptures.get(type);
    return capture != null ? capture.field : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/GenerationBatch.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
      if (TypeUtil.isEnum(lhs) || TypeUtil.isEnum(rhs)) {
        // Enums can be directly compared.
        return null;
      }
      if (typeUtil.isString(lhs) && typeUtil.isString(rhs)) {
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
          case INT: return "JreIntDiv";
          case LONG: return "JreLongDiv";
          default: return null;

        }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
          case FLOAT: return "fmodf";
          case DOUBLE: return "fmod";
          default: return null;
        }
      case LEFT_SHIFT:
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
        return "JreURShift" + intSizePostfix(nodeType);
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
      Assignment node, VariableElement var, boolean isRetainedWith) {
    if (!ElementUtil.isField(var)) {
      return null;
    }
    TypeMirror type = var.asType();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
          return literalValue;
        } else {
          return null;
        }
      case BOOLEAN_LITERAL:
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/OperatorRewriter.java`
#### Snippet
```java
        return ((NumberLiteral) expr).getValue().toString();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LabelRewriter.java`
#### Snippet
```java
      return ((WhileStatement) s).getBody();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ParenthesizedExpression.java`
#### Snippet
```java
  public TypeMirror getTypeMirror() {
    Expression expressionNode = expression.get();
    return expressionNode != null ? expressionNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      return value;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
      return selector;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaTypeElementAdder.java`
#### Snippet
```java
      return ((VariableDeclaration) parent).getVariableElement();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayCreation.java`
#### Snippet
```java
  public javax.lang.model.type.ArrayType getTypeMirror() {
    ArrayType arrayTypeNode = arrayType.get();
    return arrayTypeNode != null ? arrayTypeNode.getTypeMirror() : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
      return ((VariableDeclaration) node).getVariableElement();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
  public static <T extends TreeNode> T remove(T node) {
    if (node == null) {
      return null;
    }
    node.remove();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        return ((SuperMethodInvocation) node).getExecutableElement();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
        return getVariableElement((Name) node);
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
  public static VariableElement getVariableElement(Name node) {
    Element element = node.getElement();
    return element != null && ElementUtil.isVariable(element) ? (VariableElement) element : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
      node = node.getParent();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
      node = node.getParent();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeUtil.java`
#### Snippet
```java
      return ((FunctionDeclaration) enclosingNode).getReturnType().getTypeMirror();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/gen/SignatureGenerator.java`
#### Snippet
```java
  public String createMethodTypeSignature(ExecutableElement method) {
    if (!hasGenericSignature(method)) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/gen/SignatureGenerator.java`
#### Snippet
```java
  public String createClassSignature(TypeElement type) {
    if (!hasGenericSignature(type)) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/gen/SignatureGenerator.java`
#### Snippet
```java
  public String createFieldTypeSignature(VariableElement variable) {
    if (!hasGenericSignature(variable.asType())) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/MemoryFileObject.java`
#### Snippet
```java
  @Override
  public Modifier getAccessLevel() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/javac/MemoryFileObject.java`
#### Snippet
```java
  @Override
  public NestingKind getNestingKind() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeNode.java`
#### Snippet
```java

  public TreeNode getParent() {
    return owner == null ? null : owner.getParent();
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
    if (node instanceof TypeDeclaration) {
      TypeMirror superclassTypeMirror = ((TypeDeclaration) node).getSuperclassTypeMirror();
      return superclassTypeMirror == null ? null : TypeUtil.asTypeElement(superclassTypeMirror);
    } else {
      return ElementUtil.getSuperclass(node.getTypeElement());
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
      AnnotationMirror reflectionSupport) {
    if (reflectionSupport == null) {
      return null;
    }
    VariableElement level = (VariableElement)
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
        ElementUtil.getAnnotationValue(reflectionSupport, "value");
    return level != null
        ? ReflectionSupport.Level.valueOf(level.getSimpleName().toString()) : null;
  }

```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
          return TreeUtil.remove(node);
        }
        return null;
      }
      default:
```

### ReturnNull
Return of `null`
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
      }
      default:
        return null;
    }
  }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `newNode` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
          .collect(Collectors.toList());
      ExecutableElement sym = findConstructor(type, methodDef);
      ConstructorInvocation newNode = new ConstructorInvocation()
          .setExecutablePair(new ExecutablePair(sym))
          .setArguments(args);
```

### UnnecessaryLocalVariable
Local variable `newNode` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/javac/MethodTranslator.java`
#### Snippet
```java
      ExecutableElement sym = findMethod(methodDef.getName(), type, methodDef);
      Expression expr = (Expression) target.getFirstChild().acceptVisitor(this, null);
      MethodInvocation newNode = new MethodInvocation()
          .setExecutablePair(new ExecutablePair(sym))
          .setTypeMirror(sym.getReturnType())
```

### UnnecessaryLocalVariable
Local variable `option` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
        options.addExternalAnnotationFile(args[nArg]);
      } else if (PLATFORM_MODULE_SYSTEM_OPTIONS.contains(arg)) {
        String option = arg;
        if (++nArg == args.length) {
          usage(option + " requires an argument");
```

### UnnecessaryLocalVariable
Local variable `dataAsMsg` is redundant
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
  public void testMergeFromOtherMessage() throws Exception {
    TypicalData data = TypicalData.newBuilder().setMyInt(123).build();
    Message dataAsMsg = data;
    TypicalData.Builder builder1 = TypicalData.newBuilder().mergeFrom(dataAsMsg);
    TypicalData.Builder builder2 = TypicalData.newBuilder().mergeFrom(data);
```

### UnnecessaryLocalVariable
Local variable `data` is redundant
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
  public void testMessageLiteInterface() throws Exception {
    ExtensionRegistryLite registry = ExtensionRegistryLite.newInstance();
    TypicalData data = TypicalData.newBuilder().build();
    MessageLite messageLite = data;
    MessageLite.Builder builderLite = messageLite.newBuilderForType();
```

### UnnecessaryLocalVariable
Local variable `messageLite` is redundant
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    ExtensionRegistryLite registry = ExtensionRegistryLite.newInstance();
    TypicalData data = TypicalData.newBuilder().build();
    MessageLite messageLite = data;
    MessageLite.Builder builderLite = messageLite.newBuilderForType();
    messageLite.writeTo(new ByteArrayOutputStream());
```

## RuleId[ruleID=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'hasIncompleteProtocol', 'hasIncompleteImplementation' and 'hasNullabilityAnnotations'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CompilationUnit.java`
#### Snippet
```java
  }

  public CompilationUnit(CompilationUnit other) {
    super(other);
    this.env = other.env;
```

### CopyConstructorMissesField
Copy constructor does not copy field 'count'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ChildList.java`
#### Snippet
```java
    }

    public ArrayListImpl(ArrayListImpl<T> list) {
      super(list);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'modifiers'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationStatement.java`
#### Snippet
```java
  public VariableDeclarationStatement() {}

  public VariableDeclarationStatement(VariableDeclarationStatement other) {
    super(other);
    annotations.copyFrom(other.getAnnotations());
```

### CopyConstructorMissesField
Copy constructor does not copy field 'hasRetainedResult'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionInvocation.java`
#### Snippet
```java
  private final ChildList<Expression> arguments = ChildList.create(Expression.class, this);

  public FunctionInvocation(FunctionInvocation other) {
    super(other);
    functionElement = other.getFunctionElement();
```

### CopyConstructorMissesField
Copy constructor does not copy field 'hasRetainedResult'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayCreation.java`
#### Snippet
```java
  public ArrayCreation() {}

  public ArrayCreation(ArrayCreation other) {
    super(other);
    arrayType.copyFrom(other.getType());
```

### CopyConstructorMissesField
Copy constructor does not copy field 'isDeadClass'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AbstractTypeDeclaration.java`
#### Snippet
```java
  AbstractTypeDeclaration() {}

  public AbstractTypeDeclaration(AbstractTypeDeclaration other) {
    super(other);
    typeElement = other.getTypeElement();
```

### CopyConstructorMissesField
Copy constructor does not copy field 'owner'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TreeNode.java`
#### Snippet
```java
  }

  protected TreeNode(TreeNode other) {
    startPosition = other.getStartPosition();
    length = other.getLength();
```

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

  private void addManifest(String manifestFile) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(new File(manifestFile)));
    try {
      for (String line = in.readLine(); line != null; line = in.readLine()) {
```

### RedundantFileCreation
`new File` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/file/RegularInputFile.java`
#### Snippet
```java
  @Override
  public InputStream getInputStream() throws IOException {
    return new FileInputStream(new File(absolutePath));
  }

```

### RedundantFileCreation
`new File` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
  public void addFile(String file, String encoding) throws IOException {
    BufferedReader in = new BufferedReader(
        new InputStreamReader(new FileInputStream(new File(file)), encoding));
    try {
      for (String line = in.readLine(); line != null; line = in.readLine()) {
```

### RedundantFileCreation
`new File` is redundant
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    }
    // For macos, the files are not available in the bundle.
    return new FileInputStream(new File("testdata/" + name));
  }

```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
  public GeneratedElement addModifiers(Modifier... newModifiers) {
    for (Modifier m : newModifiers) {
      modifiers.add(m);
    }
    return this;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java
  public FunctionElement addParameters(TypeMirror... paramTypes) {
    for (TypeMirror paramType : paramTypes) {
      parameterTypes.add(paramType);
    }
    return this;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `translator/src/main/java/com/google/devtools/j2objc/ast/InfixExpression.java`
#### Snippet
```java
    this.operator = operator;
    for (Expression operand : operands) {
      this.operands.add(operand);
    }
  }
```

