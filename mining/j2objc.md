# j2objc 
 
# Bad smells
I found 425 bad smells with 20 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 145 | false |
| DataFlowIssue | 54 | false |
| UnusedAssignment | 19 | false |
| ConstantValue | 15 | false |
| TrivialIf | 13 | false |
| CharsetObjectCanBeUsed | 13 | false |
| RedundantCast | 12 | false |
| StringConcatenationInsideStringBufferAppend | 11 | false |
| RegExpRedundantEscape | 9 | false |
| Deprecation | 9 | false |
| IgnoreResultOfCall | 8 | false |
| StringOperationCanBeSimplified | 7 | false |
| CopyConstructorMissesField | 7 | false |
| DuplicatedCode | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| EmptyStatementBody | 5 | false |
| UnnecessaryReturn | 5 | true |
| CachedNumberConstructorCall | 5 | false |
| CommentedOutCode | 4 | false |
| UNCHECKED_WARNING | 4 | false |
| IOStreamConstructor | 4 | false |
| AutoCloseableResource | 4 | false |
| RedundantFileCreation | 4 | false |
| UnnecessaryModifier | 3 | true |
| DuplicateBranchesInSwitch | 3 | false |
| JavadocLinkAsPlainText | 3 | false |
| FieldCanBeLocal | 3 | false |
| ManualArrayToCollectionCopy | 3 | false |
| UnnecessarySemicolon | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| ConditionCoveredByFurtherCondition | 3 | false |
| UseBulkOperation | 3 | false |
| DuplicateExpressions | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| SimplifiableConditionalExpression | 2 | false |
| UNUSED_IMPORT | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| JavadocReference | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| ExcessiveRangeCheck | 2 | false |
| LoopStatementsThatDontLoop | 1 | false |
| RegExpSimplifiable | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| RedundantStringFormatCall | 1 | false |
| StringEqualsCharSequence | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| RegExpRepeatedSpace | 1 | false |
| JavadocDeclaration | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=LoopStatementsThatDontLoop]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      } else if (arg.startsWith(XBOOTCLASSPATH)) {
        bootclasspath = arg.substring(XBOOTCLASSPATH.length());
      } else if (arg.equals("-Xno-jsni-delimiters")) {
        // TODO(tball): remove flag when all client builds stop using it.
      } else if (arg.equals("-Xno-jsni-warnings")) {
```

### EmptyStatementBody
`if` statement has empty body
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      } else if (arg.equals("--enable-preview")) {
        addPlatformModuleSystemOptions(arg);
      } else if (arg.startsWith(BATCH_PROCESSING_MAX_FLAG)) {
        // Ignore, batch processing isn't used with javac front-end.
      } else if (obsoleteFlags.contains(arg)) {
```

### EmptyStatementBody
`if` statement has empty body
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      } else if (arg.startsWith(BATCH_PROCESSING_MAX_FLAG)) {
        // Ignore, batch processing isn't used with javac front-end.
      } else if (obsoleteFlags.contains(arg)) {
        // also ignore
      } else if (arg.startsWith("-")) {
```

### EmptyStatementBody
`if` statement has empty body
in `translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java`
#### Snippet
```java
      @Override
      public boolean processLine(String line) throws IOException {
        if (line.startsWith("ProGuard, version")
            || line.startsWith("Reading ")
            || line.startsWith("    processed in")) {
```

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

## RuleId[id=CommentedOutCode]
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
Commented out code (4 lines)
in `protobuf/tests/MessagesTest.java`
#### Snippet
```java

  // TODO(kstanger): Correct field names is not supported in the wrappers.
  /*public void testGroupName() throws Exception {
    FieldDescriptor groupField = MessageData.getDescriptor().findFieldByNumber(4);
    assertEquals("groupf", groupField.getName());
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
Commented out code (12 lines)
in `protobuf/tests/EnumsTest.java`
#### Snippet
```java
  // TODO(kstanger): This fails with native ObjC because it doesn't sign-extend
  // when writing the negative enum value.
  /*public void testSerialization() throws Exception {
    EnumMsg msg = getFilledMessage();

```

## RuleId[id=RegExpRedundantEscape]
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

  private static final String TYPE_REGEX = "\\([\\w\\s\\*<>\\[\\]]+\\)";
  private static final String PARAM_REGEX = "\\s*:\\s*" + TYPE_REGEX + "\\s*\\w+";
  private static final String ADDITIONAL_PARAM_REGEX = "\\s+(\\w+)" + PARAM_REGEX;
  private static final Pattern OBJC_METHOD_DECL_PATTERN = Pattern.compile(
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[_]` can be simplified to '_'
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java

  private static final Pattern FAMILY_METHOD_REGEX =
      Pattern.compile("^[_]*(new|copy|alloc|init|mutableCopy).*");

  public static boolean needsObjcMethodFamilyNoneAttribute(String name) {
```

## RuleId[id=DuplicateExpressions]
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

## RuleId[id=StringBufferReplaceableByString]
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

### StringBufferReplaceableByString
`StringBuilder outerHeader` can be replaced with 'String'
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnumRewriter.java`
#### Snippet
```java
    }

    StringBuilder outerHeader = new StringBuilder();
    StringBuilder outerImpl = new StringBuilder();

```

## RuleId[id=Deprecation]
### Deprecation
'Float(double)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertEquals(TypicalData.EnumType.VALUE9, data.getMyEnumType());
    assertTrue(data.getMyBool());
    assertEquals(new Float(43.8), data.getMyFloat());
    assertEquals(new Double(44.5), data.getMyDouble());
    assertEquals("bar", data.getMyString());
```

### Deprecation
'Double(double)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    assertTrue(data.getMyBool());
    assertEquals(new Float(43.8), data.getMyFloat());
    assertEquals(new Double(44.5), data.getMyDouble());
    assertEquals("bar", data.getMyString());
    assertEquals(24, data.getMyUint());
```

### Deprecation
'Integer(int)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

    TypicalData.Builder dataBuilder = TypicalData.newBuilder();
    dataBuilder.setField(fields[1], new Integer(42));
    dataBuilder.setField(fields[2], ByteString.copyFromUtf8("foo"));
    dataBuilder.setField(fields[3], TypicalData.EnumType.VALUE9.getValueDescriptor());
```

### Deprecation
'Float(double)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[11], TypicalDataMessage.newBuilder().build());
    dataBuilder.setField(fields[12], Boolean.TRUE);
    dataBuilder.setField(fields[13], new Float(43.8));
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
```

### Deprecation
'Double(double)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[12], Boolean.TRUE);
    dataBuilder.setField(fields[13], new Float(43.8));
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
```

### Deprecation
'Integer(int)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
```

### Deprecation
'Long(long)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
```

### Deprecation
'Long(long)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
```

### Deprecation
'Integer(int)' is deprecated
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
    dataBuilder.addRepeatedField(fields[8], "bbb");
```

## RuleId[id=UnnecessaryReturn]
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
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
      String arg = args.next();
      if (arg.isEmpty()) {
        return;
      } else if (arg.startsWith("@")) {
        processArgsFile(arg.substring(1));
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
in `translator/src/main/java/com/google/devtools/j2objc/translate/LogSiteInjector.java`
#### Snippet
```java
        && isLoggingSubtype(cls, javaUtilLoggingLoggerClass)) {
      node.replaceWith(injectConvenienceMethod(methodName, node));
      return;
    }
  }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`kind != null ? kind.isInterface() : false` can be simplified to 'kind != null \&\& kind.isInterface()'
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
  public static boolean isInterface(TypeMirror t) {
    ElementKind kind = getDeclaredTypeKind(t);
    return kind != null ? kind.isInterface() : false;
  }

```

### SimplifiableConditionalExpression
`kind != null ? kind.isClass() : false` can be simplified to 'kind != null \&\& kind.isClass()'
in `translator/src/main/java/com/google/devtools/j2objc/util/TypeUtil.java`
#### Snippet
```java
  public static boolean isClass(TypeMirror t) {
    ElementKind kind = getDeclaredTypeKind(t);
    return kind != null ? kind.isClass() : false;
  }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
/**
 * An implementation of Tarjan's strongly connected components algorithm.
 * http://en.wikipedia.org/wiki/Tarjan's_strongly_connected_components_algorithm
 */
class Tarjans {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
   * Returns true if an implementation for a type element should be generated.
   * Normally this is true, but in Java 8 a few interfaces from JSR 250
   * (https://jcp.org/en/jsr/detail?id=250) were added, causing duplicate
   * symbol link errors when building an app that uses the other JSR 250
   * annotations. javax.annotation defined on the bootclasspath are therefore
```

### JavadocLinkAsPlainText
Link specified as plain text
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
   * other text displayed to the developer invoking j2objc, however.
   *
   * {@link https://github.com/google/j2objc/issues/698}
   */
  public static String format(String format, Object... args) {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java
  }

  private final String type = "kythe0";
  private final List<AnchorAnchorMetadata> meta = new ArrayList<>();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java
    private final int targetBegin;
    private final int targetEnd;
    private final String edge = "/kythe/edge/imputes";
    private final VName sourceVName;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `translator/src/main/java/com/google/devtools/j2objc/gen/KytheIndexingMetadata.java`
#### Snippet
```java

  static class AnchorAnchorMetadata {
    private final String type = "anchor_anchor";
    private final int sourceBegin;
    private final int sourceEnd;
```

## RuleId[id=IgnoreResultOfCall]
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
  public static File createTempDir(String dirname) throws IOException {
    File tmpDirectory = File.createTempFile(dirname, ".tmp");
    tmpDirectory.delete();
    if (!tmpDirectory.mkdir()) {
      throw new IOException("Could not create tmp directory: " + tmpDirectory.getPath());
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

## RuleId[id=RegExpDuplicateCharacterInClass]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=MismatchedCollectionQueryUpdate]
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

## RuleId[id=RedundantStringFormatCall]
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

## RuleId[id=UnusedAssignment]
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
The value `(ProtocolMessageEnum) value` assigned to `type` is never used
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    // Test casting to ProtocolMessageEnum.
    Object value = TypicalData.EnumType.VALUE2;
    type = (ProtocolMessageEnum) value;
  }

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
Variable `code` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeStatement.java`
#### Snippet
```java
public class NativeStatement extends Statement {

  private String code = null;

  public NativeStatement(NativeStatement other) {
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
Variable `name` initializer `null` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionDeclaration.java`
#### Snippet
```java
public class FunctionDeclaration extends BodyDeclaration {

  private String name = null;
  private boolean returnsRetained = false;
  private final ChildLink<Type> returnType = ChildLink.create(Type.class, this);
```

## RuleId[id=ConstantValue]
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    this.options = options;
    j2objcOptions = new com.google.devtools.j2objc.Options();
    List<String> list = new ArrayList<>(Arrays.asList(
        "-sourcepath", Strings.nullToEmpty(options.getSourcepath()),
        "-classpath", Strings.nullToEmpty(options.getClasspath()),
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
    this.options = options;
    j2objcOptions = new com.google.devtools.j2objc.Options();
    List<String> list = new ArrayList<>(Arrays.asList(
        "-sourcepath", Strings.nullToEmpty(options.getSourcepath()),
        "-classpath", Strings.nullToEmpty(options.getClasspath()),
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java

  public void print(PrintStream printStream) {
    ArrayList<TypeNode> typeNodes = new ArrayList<>(edges.keySet());
    Collections.sort(typeNodes, (a, b) -> a.getName().compareTo(b.getName()));
    for (TypeNode typeNode : typeNodes) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java
    Collections.sort(typeNodes, (a, b) -> a.getName().compareTo(b.getName()));
    for (TypeNode typeNode : typeNodes) {
      ArrayList<Edge> outgoingEdges = new ArrayList<>(edges.get(typeNode));
      Collections.sort(
          outgoingEdges, (a, b) -> a.getTarget().getName().compareTo(b.getTarget().getName()));
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `https`
in `translator/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java`
#### Snippet
```java
   * other text displayed to the developer invoking j2objc, however.
   *
   * {@link https://github.com/google/j2objc/issues/698}
   */
  public static String format(String format, Object... args) {
```

### JavadocReference
Symbol `com.google.devtools.j2objc.pipeline.FileProcessor` is inaccessible from here
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
 * <p/>
 * Some attributes, like the name and output path, might not be known before parsing.
 * These are set by a {@link com.google.devtools.j2objc.pipeline.FileProcessor}.
 *
 * @author Mike Thvedt
```

## RuleId[id=StringEqualsCharSequence]
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

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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
      clinit.addReferencedTypes(typeId);
    }
    context.currentTypeInfoScope.peek().addMember(clinit.build());
    TypeInfo ti = context.currentTypeInfoScope.pop().build();
    context.currentTypeNameScope.pop();
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
        .memberScope
        .peek()
        .addInvokedMethods(
            com.google.devtools.treeshaker.MethodInvocation.newBuilder()
                .setMethod(methodName)
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=JavaReflectionMemberAccess]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
    OcniBlock ocniBlock = extractNativeCode(node);
    if (ocniBlock != null) {
      switch (ocniBlock.type) {
        case SOURCE: return new NativeStatement(ocniBlock.code);
        default: ErrorUtil.warning(node, "Unexpected OCNI type: " + ocniBlock.type);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `translator/src/main/java/com/google/devtools/j2objc/util/HeaderMap.java`
#### Snippet
```java
      style = OutputStyleOption.PACKAGE;
    }
    switch (style) {
      case PACKAGE:
        return ElementUtil.getName(pkg).replace('.', File.separatorChar) + File.separatorChar;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/CycleFinder.java`
#### Snippet
```java
      String fileName = sourceFileNames.get(i);
      RegularInputFile file = new RegularInputFile(fileName);
      String source = j2objcOptions.fileUtil().readFile(file);
      if (!source.contains("J2ObjCIncompatible")) {
        continue;
      }
      if (strippedDir == null) {
        strippedDir = Files.createTempDir();
        parser.prependSourcepathEntry(strippedDir.getPath());
      }
      Parser.ParseResult parseResult = parser.parseWithoutBindings(file, source);
      String qualifiedName = parseResult.mainTypeName();
      parseResult.stripIncompatibleSource();
      String relativePath = qualifiedName.replace('.', File.separatorChar) + ".java";
      File strippedFile = new File(strippedDir, relativePath);
      Files.createParentDirs(strippedFile);
```

### DuplicatedCode
Duplicated code
in `translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java`
#### Snippet
```java
    if (visitor.visit(this)) {
      lambdaOuterArg.accept(visitor);
      lambdaCaptureArgs.accept(visitor);
      type.accept(visitor);
      typeArguments.accept(visitor);
      creationOuterArg.accept(visitor);
      creationCaptureArgs.accept(visitor);
    }
    visitor.endVisit(this);
```

### DuplicatedCode
Duplicated code
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
    sb.print(ElementUtil.getName(node.getVariableElement()));
    for (int i = 0; i < node.getExtraDimensions(); i++) {
      sb.print("[]");
    }
    if (node.getInitializer() != null) {
      sb.print("=");
      node.getInitializer().accept(this);
    }
    return false;
```

### DuplicatedCode
Duplicated code
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeDeclarationGenerator.java`
#### Snippet
```java
    VariableElement var = fragment.getVariableElement();
    Object value = var.getConstantValue();
    assert value != null;
    String declType = getDeclarationType(var);
    declType += (declType.endsWith("*") ? "" : " ");
    String name = nameTable.getVariableShortName(var);
```

### DuplicatedCode
Duplicated code
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
    Expression outerTarget = node.getExpression();
    if (outerTarget != null) {
      outerTarget.accept(this);
      addNilCheck(outerTarget);
    }
    for (Expression arg : node.getArguments()) {
      arg.accept(this);
    }
    // Don't need to visit AnonymousClassDeclaration child because it's removed by
    // AnonymousClassConverter.
    removeNonFinalFields();
    handleThrows();
    return false;
```

### DuplicatedCode
Duplicated code
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/ClassHierarchyAnalyzer.java`
#### Snippet
```java
            List<String> components =
                Splitter.onPattern(SIGNATURE_PREFIX).splitToList(method);
            // TODO(dpo): add better checking for name & signature components.
            if (components.isEmpty() || components.size() != 2) {
              continue;
            }
            String name = components.get(0);
            String sig = components.get(1);
            unusedBuilder.addMethod(type.getName(), name, sig);
```

## RuleId[id=ProtectedMemberInFinalClass]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
  public void addFile(String file, String encoding) throws IOException {
    BufferedReader in = new BufferedReader(
        new InputStreamReader(new FileInputStream(new File(file)), encoding));
    try {
      for (String line = in.readLine(); line != null; line = in.readLine()) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `translator/src/main/java/com/google/devtools/j2objc/file/RegularInputFile.java`
#### Snippet
```java
  @Override
  public InputStream getInputStream() throws IOException {
    return new FileInputStream(new File(absolutePath));
  }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    }
    // For macos, the files are not available in the bundle.
    return new FileInputStream(new File("testdata/" + name));
  }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
    File f = new File(filename);
    if (f.exists()) {
      return new FileInputStream(f);
    } else {
      InputStream stream = J2ObjC.class.getResourceAsStream(filename);
```

## RuleId[id=UnnecessaryToStringCall]
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
in `translator/src/main/java/com/google/devtools/j2objc/gen/JavadocGenerator.java`
#### Snippet
```java
          sb.append(NameTable.getDocCommentVariableName(((VariableElement) element)));
        } else {
          sb.append(fragment.toString());
        }
      } else {
```

## RuleId[id=RegExpRepeatedSpace]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java

    String methodName = nameTable.getMethodSelector(methodElement);
    if (methodName.equals("hash") && methodElement.getReturnType().getKind() == TypeKind.INT) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/CastResolver.java`
#### Snippet
```java
    }
    TypeMirror exprType = expr.getTypeMirror();
    if (
        // In general we do not need to cast primitive types.
        exprType.getKind().isPrimitive()
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
      InfixExpression infixExpr = (InfixExpression) node;
      InfixExpression.Operator op = infixExpr.getOperator();
      if (op == InfixExpression.Operator.CONDITIONAL_AND
          || op == InfixExpression.Operator.CONDITIONAL_OR) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
        return true;
      }
    } else if (node instanceof ConditionalExpression) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/util/PackageInfoLookup.java`
#### Snippet
```java
      Pattern p = Pattern.compile(importRegex);
      Matcher m = p.matcher(pkgInfo);
      if (m.find()) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java`
#### Snippet
```java
    }
    selector = getMethodNameFromAnnotation(method);
    if (selector != null) {
      return selector;
    }
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
    if (parent instanceof PostfixExpression) {
      PostfixExpression.Operator op = ((PostfixExpression) parent).getOperator();
      if (op == PostfixExpression.Operator.INCREMENT
          || op == PostfixExpression.Operator.DECREMENT) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/util/TranslationUtil.java`
#### Snippet
```java
    } else if (parent instanceof PrefixExpression) {
      PrefixExpression.Operator op = ((PrefixExpression) parent).getOperator();
      if (op == PrefixExpression.Operator.INCREMENT || op == PrefixExpression.Operator.DECREMENT
          || op == PrefixExpression.Operator.ADDRESS_OF) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
    // Don't functionize equals/hash, since they are often called by collections.
    String name = ElementUtil.getName(method);
    if ((name.equals("hashCode") && method.getParameters().isEmpty())
        || (name.equals("equals") && method.getParameters().size() == 1)) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/GwtConverter.java`
#### Snippet
```java
        Expression value = ((SingleMemberAnnotation) annotationNode).getValue();
        if (value instanceof StringLiteral) {
          if (compatibleAPIs.contains(((StringLiteral) value).getLiteralValue())) {
            // Pretend incompatible annotation isn't present, since what it's
            // flagging is J2ObjC-compatible.
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/NilCheckResolver.java`
#### Snippet
```java
        return true;
      }
      if (params.isEmpty() && returnType.getKind().isPrimitive()
          && name.equals(TypeUtil.getName(returnType) + "Value")) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/OcniExtractor.java`
#### Snippet
```java
      start = text.indexOf("/*-{");
      end = text.lastIndexOf("}-*/");
      if (start != -1 && end > start) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `translator/src/main/java/com/google/devtools/j2objc/translate/EnhancedForRewriter.java`
#### Snippet
```java
    }
    Object style = ElementUtil.getAnnotationValue(loopTranslation, "value");
    if (style instanceof VariableElement
        && ElementUtil.getName((VariableElement) style).equals(LoopStyle.JAVA_ITERATOR.name())) {
      return true;
```

## RuleId[id=NonStrictComparisonCanBeEquality]
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

## RuleId[id=CharsetObjectCanBeUsed]
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
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

  public void testByteStringSubstring() throws Exception {
    ByteString bs1 = ByteString.copyFrom("abcdefghijklmnop".getBytes("UTF-8"));
    ByteString bs2 = bs1.substring(1, 15);
    assertEquals("bcdefghijklmno", new String(bs2.toByteArray(), "UTF-8"));
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JarFile' used without 'try'-with-resources statement
in `translator/src/main/java/com/google/devtools/j2objc/file/JarredInputFile.java`
#### Snippet
```java
  @Override
  public InputStream getInputStream() throws IOException {
    final JarFile jarFile = new JarFile(jarPath);
    ZipEntry entry = jarFile.getEntry(internalPath);
    final InputStream entryStream = jarFile.getInputStream(entry);
```

### AutoCloseableResource
'Parser' used without 'try'-with-resources statement
in `translator/src/main/java/com/google/devtools/j2objc/util/Version.java`
#### Snippet
```java
    }

    String javacVersion = Parser.newParser(null).version();
    return String.format("%s (javac %s)", j2objcVersion, javacVersion);
  }
```

### AutoCloseableResource
'StandardJavaFileManager' used without 'try'-with-resources statement
in `translator/src/main/java/com/google/devtools/j2objc/javac/ClassFileConverter.java`
#### Snippet
```java
    List<File> classPath = new ArrayList<>();
    classPath.add(new File(rootPath));
    parserEnv.fileManager().setLocation(StandardLocation.CLASS_PATH, classPath);
  }

```

### AutoCloseableResource
'StandardJavaFileManager' used without 'try'-with-resources statement
in `translator/src/main/java/com/google/devtools/j2objc/javac/JavacParser.java`
#### Snippet
```java
        // The source output directory is created and set in createEnvironment().
        File sourceOutputDirectory =
            env.fileManager().getLocation(StandardLocation.SOURCE_OUTPUT).iterator().next();
        collectGeneratedInputs(sourceOutputDirectory, "", generatedInputs);
        return new JavacProcessingResult(generatedInputs, sourceOutputDirectory);
```

## RuleId[id=ExcessiveRangeCheck]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
   * not option-related (usually files).  If help is requested or an error is
   * detected, the appropriate status method is invoked and the app terminates.
   * @throws IOException
   */
  public List<String> load(String[] args) throws IOException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `decl` to `MethodDeclaration` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/TypeGenerator.java`
#### Snippet
```java
    public boolean apply(BodyDeclaration decl) {
      return decl.getKind() == TreeNode.Kind.METHOD_DECLARATION
          && !Modifier.isAbstract(((MethodDeclaration) decl).getModifiers());
    }
  };
```

### RedundantCast
Casting `type` to `DeclaredType` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java

    private void followDeclaredType(DeclaredType type, TypeNode node) {
      followEnclosingType((DeclaredType) type, node);
      followFields((DeclaredType) type, node);
      for (TypeMirror typeArg : type.getTypeArguments()) {
```

### RedundantCast
Casting `type` to `DeclaredType` is redundant
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java`
#### Snippet
```java
    private void followDeclaredType(DeclaredType type, TypeNode node) {
      followEnclosingType((DeclaredType) type, node);
      followFields((DeclaredType) type, node);
      for (TypeMirror typeArg : type.getTypeArguments()) {
        visitType(typeArg);
```

### RedundantCast
Casting `key` to `String` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/pipeline/FileProcessor.java`
#### Snippet
```java
    @Override
    public ProcessingContext put(String key, ProcessingContext value) {
      return super.put(canonicalizePath((String) key), value);
    }

```

### RedundantCast
Casting `initializer.getTypeMirror()` to `javax.lang.model.type.ArrayType` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayCreation.java`
#### Snippet
```java

  public ArrayCreation(ArrayInitializer initializer) {
    arrayType.set(new ArrayType((javax.lang.model.type.ArrayType) initializer.getTypeMirror()));
    this.initializer.set(initializer);
  }
```

### RedundantCast
Casting `node.getTypeMirror()` to `javax.lang.model.type.ArrayType` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java`
#### Snippet
```java
  @Override
  public boolean visit(ArrayInitializer node) {
    javax.lang.model.type.ArrayType type = (javax.lang.model.type.ArrayType) node.getTypeMirror();
    TypeMirror componentType = type.getComponentType();
    buffer.append(UnicodeUtils.format("(%s[]){ ", NameTable.getPrimitiveObjCType(componentType)));
```

### RedundantCast
Casting `value` to `Double` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/gen/LiteralGenerator.java`
#### Snippet
```java

  public static String generate(Double value) {
    double d = ((Double) value).doubleValue();
    if (Double.isNaN(d)) {
      return "NAN";
```

### RedundantCast
Casting `it.next()` to `MemberValuePair` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
    sb.print("(");
    for (Iterator<MemberValuePair> it = node.getValues().iterator(); it.hasNext(); ) {
      MemberValuePair p = (MemberValuePair) it.next();
      p.accept(this);
      if (it.hasNext()) {
```

### RedundantCast
Casting `it.next()` to `EnumConstantDeclaration` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
    for (Iterator<EnumConstantDeclaration> it = node.getEnumConstants().iterator();
        it.hasNext(); ) {
      EnumConstantDeclaration d = (EnumConstantDeclaration) it.next();
      d.accept(this);
      if (it.hasNext()) {
```

### RedundantCast
Casting `it.next()` to `Expression` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTPrinter.java`
#### Snippet
```java
      sb.print('(');
      for (Iterator<Expression> it = node.getArguments().iterator(); it.hasNext(); ) {
        Expression e = (Expression) it.next();
        e.accept(this);
        if (it.hasNext()) {
```

### RedundantCast
Casting `element` to `VariableElement` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/util/ElementUtil.java`
#### Snippet
```java
        || (isParameter(element)
            && parametersNonnullByDefault
            && !((VariableElement) element).asType().getKind().isPrimitive());
  }

```

### RedundantCast
Casting `t` to `DeclaredType` is redundant
in `translator/src/main/java/com/google/devtools/j2objc/translate/DefaultMethodShimGenerator.java`
#### Snippet
```java
      collector = newMethods;
      for (TypeMirror t : typeElem.getInterfaces()) {
        collectInheritedMethods((DeclaredType) t);
      }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `expressions` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayInitializer.java`
#### Snippet
```java
  private ArrayType typeMirror = null;

  private ChildList<Expression> expressions = ChildList.create(Expression.class, this);

  public ArrayInitializer() {}
```

### FieldMayBeFinal
Field `typeOrderStack` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/InnerClassExtractor.java`
#### Snippet
```java
  private final List<AbstractTypeDeclaration> unitTypes;
  // Helps keep types in the order they are visited.
  private ArrayList<Integer> typeOrderStack = Lists.newArrayList();

  public InnerClassExtractor(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
    private int index = -1;
    private int lowlink = -1;
    private TypeNode type;

    private Vertex(TypeNode type) {
```

### FieldMayBeFinal
Field `stronglyConnectedComponents` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
  private ArrayList<Vertex> stack = new ArrayList<>();
  private Map<TypeNode, Vertex> vertices = new HashMap<>();
  private List<List<TypeNode>> stronglyConnectedComponents = new ArrayList<>();

  private Tarjans(SetMultimap<TypeNode, Edge> edges, Set<TypeNode> seedTypes) {
```

### FieldMayBeFinal
Field `vertices` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
  // In case of performance issues, consider a data structure with faster .contains().
  private ArrayList<Vertex> stack = new ArrayList<>();
  private Map<TypeNode, Vertex> vertices = new HashMap<>();
  private List<List<TypeNode>> stronglyConnectedComponents = new ArrayList<>();

```

### FieldMayBeFinal
Field `stack` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Tarjans.java`
#### Snippet
```java
  private int vIndex = 0;
  // In case of performance issues, consider a data structure with faster .contains().
  private ArrayList<Vertex> stack = new ArrayList<>();
  private Map<TypeNode, Vertex> vertices = new HashMap<>();
  private List<List<TypeNode>> stronglyConnectedComponents = new ArrayList<>();
```

### FieldMayBeFinal
Field `fields` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
public class NameList {

  private Set<String> fields = Sets.newHashSet();
  private SetMultimap<String, String> fieldsWithTypes = HashMultimap.create();
  private Set<String> types = Sets.newHashSet();
```

### FieldMayBeFinal
Field `outers` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
  private Set<String> types = Sets.newHashSet();
  private Set<String> namespaces = Sets.newHashSet();
  private Set<String> outers = Sets.newHashSet();

  public boolean containsField(TypeNode origin, String fieldName) {
```

### FieldMayBeFinal
Field `types` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
  private Set<String> fields = Sets.newHashSet();
  private SetMultimap<String, String> fieldsWithTypes = HashMultimap.create();
  private Set<String> types = Sets.newHashSet();
  private Set<String> namespaces = Sets.newHashSet();
  private Set<String> outers = Sets.newHashSet();
```

### FieldMayBeFinal
Field `fieldsWithTypes` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java

  private Set<String> fields = Sets.newHashSet();
  private SetMultimap<String, String> fieldsWithTypes = HashMultimap.create();
  private Set<String> types = Sets.newHashSet();
  private Set<String> namespaces = Sets.newHashSet();
```

### FieldMayBeFinal
Field `namespaces` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/NameList.java`
#### Snippet
```java
  private SetMultimap<String, String> fieldsWithTypes = HashMultimap.create();
  private Set<String> types = Sets.newHashSet();
  private Set<String> namespaces = Sets.newHashSet();
  private Set<String> outers = Sets.newHashSet();

```

### FieldMayBeFinal
Field `orderedAccesses` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/UnsequencedExpressionRewriter.java`
#### Snippet
```java
  private ExecutableElement currentMethod = null;
  private int count = 1;
  private List<VariableAccess> orderedAccesses = Lists.newArrayList();
  private TreeNode currentTopNode = null;
  private boolean hasModification = false;
```

### FieldMayBeFinal
Field `usageMessage` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java

  private static final String XBOOTCLASSPATH = "-Xbootclasspath:";
  private static String usageMessage;
  private static String helpMessage;

```

### FieldMayBeFinal
Field `helpMessage` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/Options.java`
#### Snippet
```java
  private static final String XBOOTCLASSPATH = "-Xbootclasspath:";
  private static String usageMessage;
  private static String helpMessage;

  static {
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `cycle_finder/src/main/java/com/google/devtools/cyclefinder/ReferenceGraph.java`
#### Snippet
```java
public class ReferenceGraph {

  private SetMultimap<TypeNode, Edge> edges = HashMultimap.create();

  public Set<TypeNode> getNodes() {
```

### FieldMayBeFinal
Field `lambdaCounts` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/LambdaTypeElementAdder.java`
#### Snippet
```java
public class LambdaTypeElementAdder extends UnitTreeVisitor {

  private Map<TypeElement, Integer> lambdaCounts = new HashMap<>();

  public LambdaTypeElementAdder(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `statements` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SwitchStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Statement> statements = ChildList.create(Statement.class, this);

  public SwitchStatement() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SwitchStatement.java`
#### Snippet
```java
public class SwitchStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Statement> statements = ChildList.create(Statement.class, this);

```

### FieldMayBeFinal
Field `onExit` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/OuterReferenceResolver.java`
#### Snippet
```java
    // These callbacks are used for correct resolution of local classes where the captures are not
    // always known at the point of creation.
    private List<Runnable> onExit = new ArrayList<>();
    private final Queue<Runnable> onOuterParam;
    // The following fields are used only by CLASS scope kinds.
```

### FieldMayBeFinal
Field `resources` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TryStatement.java`
#### Snippet
```java
public class TryStatement extends Statement {

  private ChildList<TreeNode> resources = ChildList.create(TreeNode.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
  private ChildList<CatchClause> catchClauses = ChildList.create(CatchClause.class, this);
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TryStatement.java`
#### Snippet
```java

  private ChildList<TreeNode> resources = ChildList.create(TreeNode.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
  private ChildList<CatchClause> catchClauses = ChildList.create(CatchClause.class, this);
  private ChildLink<Block> finallyBlock = ChildLink.create(Block.class, this);
```

### FieldMayBeFinal
Field `finallyBlock` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TryStatement.java`
#### Snippet
```java
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
  private ChildList<CatchClause> catchClauses = ChildList.create(CatchClause.class, this);
  private ChildLink<Block> finallyBlock = ChildLink.create(Block.class, this);

  public TryStatement() {}
```

### FieldMayBeFinal
Field `catchClauses` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TryStatement.java`
#### Snippet
```java
  private ChildList<TreeNode> resources = ChildList.create(TreeNode.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
  private ChildList<CatchClause> catchClauses = ChildList.create(CatchClause.class, this);
  private ChildLink<Block> finallyBlock = ChildLink.create(Block.class, this);

```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
  private boolean hasDeclaration = true;
  private boolean isUnavailable = false;
  private ChildList<SingleVariableDeclaration> parameters =
      ChildList.create(SingleVariableDeclaration.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MethodDeclaration.java`
#### Snippet
```java
  private ChildList<SingleVariableDeclaration> parameters =
      ChildList.create(SingleVariableDeclaration.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);

  public MethodDeclaration() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ParenthesizedExpression.java`
#### Snippet
```java
public class ParenthesizedExpression extends Expression {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public ParenthesizedExpression() {}
```

### FieldMayBeFinal
Field `enumConstants` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnumDeclaration.java`
#### Snippet
```java
  private boolean stripSuperInterfaces = false;

  private ChildList<EnumConstantDeclaration> enumConstants =
      ChildList.create(EnumConstantDeclaration.class, this);

```

### FieldMayBeFinal
Field `label` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ContinueStatement.java`
#### Snippet
```java
public class ContinueStatement extends Statement {

  private ChildLink<SimpleName> label = ChildLink.create(SimpleName.class, this);

  public ContinueStatement() {}
```

### FieldMayBeFinal
Field `qualifier` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperFieldAccess.java`
#### Snippet
```java

  private VariableElement variableElement = null;
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  private TypeMirror typeMirror = null;

```

### FieldMayBeFinal
Field `processorPathEntries` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
public class Options {

  private List<String> processorPathEntries = new ArrayList<>();
  private OutputLanguageOption language = OutputLanguageOption.OBJECTIVE_C;
  private MemoryManagementOption memoryManagementOption = null;
```

### FieldMayBeFinal
Field `fileUtil` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java

  private Mappings mappings = new Mappings();
  private FileUtil fileUtil = new FileUtil();
  private PackageInfoLookup packageInfoLookup = new PackageInfoLookup(fileUtil);
  private PackagePrefixes packagePrefixes = new PackagePrefixes(packageInfoLookup);
```

### FieldMayBeFinal
Field `xhelpMessage` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private static String usageMessage;
  private static String helpMessage;
  private static String xhelpMessage;
  private static final String USAGE_MSG_KEY = "usage-message";
  private static final String HELP_MSG_KEY = "help-message";
```

### FieldMayBeFinal
Field `headerMap` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean warningsAsErrors = false;
  private boolean deprecatedDeclarations = false;
  private HeaderMap headerMap = new HeaderMap();
  private boolean stripGwtIncompatible = false;
  private boolean segmentedHeaders = true;
```

### FieldMayBeFinal
Field `mappings` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private boolean javacWarnings = true;

  private Mappings mappings = new Mappings();
  private FileUtil fileUtil = new FileUtil();
  private PackageInfoLookup packageInfoLookup = new PackageInfoLookup(fileUtil);
```

### FieldMayBeFinal
Field `helpMessage` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private static final String FILE_HEADER_KEY = "file-header";
  private static String usageMessage;
  private static String helpMessage;
  private static String xhelpMessage;
  private static final String USAGE_MSG_KEY = "usage-message";
```

### FieldMayBeFinal
Field `packagePrefixes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private FileUtil fileUtil = new FileUtil();
  private PackageInfoLookup packageInfoLookup = new PackageInfoLookup(fileUtil);
  private PackagePrefixes packagePrefixes = new PackagePrefixes(packageInfoLookup);
  private final ExternalAnnotations externalAnnotations = new ExternalAnnotations();
  private final List<String> entryClasses = new ArrayList<>();
```

### FieldMayBeFinal
Field `packageInfoLookup` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private Mappings mappings = new Mappings();
  private FileUtil fileUtil = new FileUtil();
  private PackageInfoLookup packageInfoLookup = new PackageInfoLookup(fileUtil);
  private PackagePrefixes packagePrefixes = new PackagePrefixes(packageInfoLookup);
  private final ExternalAnnotations externalAnnotations = new ExternalAnnotations();
```

### FieldMayBeFinal
Field `fileHeader` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private File proGuardUsageFile = null;

  private static String fileHeader;
  private static final String FILE_HEADER_KEY = "file-header";
  private static String usageMessage;
```

### FieldMayBeFinal
Field `usageMessage` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/Options.java`
#### Snippet
```java
  private static String fileHeader;
  private static final String FILE_HEADER_KEY = "file-header";
  private static String usageMessage;
  private static String helpMessage;
  private static String xhelpMessage;
```

### FieldMayBeFinal
Field `dead` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java`
#### Snippet
```java
  public static CodeReferenceMap parse(CharSource listing) throws IOException {
    LineProcessor<CodeReferenceMap> processor = new LineProcessor<CodeReferenceMap>() {
      CodeReferenceMap.Builder dead = CodeReferenceMap.builder();
      String lastClass;

```

### FieldMayBeFinal
Field `types` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/IntersectionType.java`
#### Snippet
```java
public class IntersectionType extends Type {

  private ChildList<Type> types = ChildList.create(Type.class, this);

  public IntersectionType(TypeMirror typeMirror) {
```

### FieldMayBeFinal
Field `publicNodesToVisit` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/PrivateDeclarationResolver.java`
#### Snippet
```java
  // public declaration. These types and all of their supertypes must be public.
  private Set<TypeElement> publicTypes = new HashSet<>();
  private List<AbstractTypeDeclaration> publicNodesToVisit = new ArrayList<>();

  public PrivateDeclarationResolver(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `publicTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/PrivateDeclarationResolver.java`
#### Snippet
```java
  // Collects types that must be public because they are exposed by another
  // public declaration. These types and all of their supertypes must be public.
  private Set<TypeElement> publicTypes = new HashSet<>();
  private List<AbstractTypeDeclaration> publicNodesToVisit = new ArrayList<>();

```

### FieldMayBeFinal
Field `typeMap` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/PrivateDeclarationResolver.java`
#### Snippet
```java
public class PrivateDeclarationResolver extends UnitTreeVisitor {

  private Map<TypeElement, AbstractTypeDeclaration> typeMap = new HashMap<>();
  // Collects types that must be public because they are exposed by another
  // public declaration. These types and all of their supertypes must be public.
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CatchClause.java`
#### Snippet
```java
public class CatchClause extends TreeNode {

  private ChildLink<SingleVariableDeclaration> exception =
      ChildLink.create(SingleVariableDeclaration.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CatchClause.java`
#### Snippet
```java
  private ChildLink<SingleVariableDeclaration> exception =
      ChildLink.create(SingleVariableDeclaration.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);

  public CatchClause() {}
```

### FieldMayBeFinal
Field `importTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeExpression.java`
#### Snippet
```java
  private String code = null;
  private TypeMirror typeMirror = null;
  private List<TypeMirror> importTypes = Lists.newArrayList();

  public NativeExpression(NativeExpression other) {
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ReturnStatement.java`
#### Snippet
```java
public class ReturnStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public ReturnStatement() {}
```

### FieldMayBeFinal
Field `label` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/BreakStatement.java`
#### Snippet
```java
public class BreakStatement extends Statement {

  private ChildLink<SimpleName> label = ChildLink.create(SimpleName.class, this);

  public BreakStatement(BreakStatement other) {
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/LabeledStatement.java`
#### Snippet
```java

  private ChildLink<SimpleName> label = ChildLink.create(SimpleName.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

  public LabeledStatement() {}
```

### FieldMayBeFinal
Field `label` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/LabeledStatement.java`
#### Snippet
```java
public class LabeledStatement extends Statement {

  private ChildLink<SimpleName> label = ChildLink.create(SimpleName.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ExpressionMethodReference.java`
#### Snippet
```java
public class ExpressionMethodReference extends MethodReference {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public ExpressionMethodReference() {}
```

### FieldMayBeFinal
Field `operand` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/PrefixExpression.java`
#### Snippet
```java
  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildLink<Expression> operand = ChildLink.create(Expression.class, this);

  public PrefixExpression() {}
```

### FieldMayBeFinal
Field `targetTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FunctionalExpression.java`
#### Snippet
```java
  private TypeMirror typeMirror = null;
  private TypeElement typeElement = null;
  private List<TypeMirror> targetTypes = new ArrayList<>();
  private ExecutablePair descriptor = ExecutablePair.NULL;
  protected ChildLink<Expression> lambdaOuterArg = ChildLink.create(Expression.class, this);
```

### FieldMayBeFinal
Field `qualifier` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperMethodReference.java`
#### Snippet
```java
public class SuperMethodReference extends MethodReference {

  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  // Resolved by OuterReferenceResolver.
  private ChildLink<Expression> receiver = ChildLink.create(Expression.class, this);
```

### FieldMayBeFinal
Field `receiver` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SuperMethodReference.java`
#### Snippet
```java
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  // Resolved by OuterReferenceResolver.
  private ChildLink<Expression> receiver = ChildLink.create(Expression.class, this);

  public SuperMethodReference() {}
```

### FieldMayBeFinal
Field `parameterTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/FunctionElement.java`
#### Snippet
```java
  private final TypeMirror returnType;
  private final TypeElement declaringClass;
  private List<TypeMirror> parameterTypes = new ArrayList<>();
  private boolean isVarargs = false;
  private boolean isMacro = false;
```

### FieldMayBeFinal
Field `usageMessage` may be 'final'
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java

  private static final String XBOOTCLASSPATH = "-Xbootclasspath:";
  private static String usageMessage;
  private static String helpMessage;

```

### FieldMayBeFinal
Field `helpMessage` may be 'final'
in `tree_shaker/src/main/java/com/google/devtools/treeshaker/Options.java`
#### Snippet
```java
  private static final String XBOOTCLASSPATH = "-Xbootclasspath:";
  private static String usageMessage;
  private static String helpMessage;

  static {
```

### FieldMayBeFinal
Field `sb` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/DebugElementDump.java`
#### Snippet
```java
public class DebugElementDump extends ElementScanner8<Void, Void> {

  private SourceBuilder sb = new SourceBuilder(false);

  public static String dump(TreeNode node) {
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/DoStatement.java`
#### Snippet
```java
public class DoStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/DoStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

  public DoStatement() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ThrowStatement.java`
#### Snippet
```java
public class ThrowStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public ThrowStatement() {}
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/LambdaExpression.java`
#### Snippet
```java
public class LambdaExpression extends FunctionalExpression {

  private ChildList<VariableDeclaration> parameters = ChildList.create(VariableDeclaration.class,
      this);
  protected ChildLink<TreeNode> body = ChildLink.create(TreeNode.class, this);
```

### FieldMayBeFinal
Field `declaredTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/HeaderImportCollector.java`
#### Snippet
```java
  private Set<Import> superTypes = new LinkedHashSet<>();
  // Declared types seen by this collector.
  private Set<Import> declaredTypes = new HashSet<>();

  public HeaderImportCollector(CompilationUnit unit, Filter filter) {
```

### FieldMayBeFinal
Field `forwardDecls` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/HeaderImportCollector.java`
#### Snippet
```java
  // Forward declarations. The order in which imports are collected affect
  // which imports become forward declarations.
  private Set<Import> forwardDecls = new LinkedHashSet<>();
  // Supertypes of the below declared types that haven't been seen by this collector.
  private Set<Import> superTypes = new LinkedHashSet<>();
```

### FieldMayBeFinal
Field `superTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/HeaderImportCollector.java`
#### Snippet
```java
  private Set<Import> forwardDecls = new LinkedHashSet<>();
  // Supertypes of the below declared types that haven't been seen by this collector.
  private Set<Import> superTypes = new LinkedHashSet<>();
  // Declared types seen by this collector.
  private Set<Import> declaredTypes = new HashSet<>();
```

### FieldMayBeFinal
Field `imports` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/ImplementationImportCollector.java`
#### Snippet
```java
public class ImplementationImportCollector extends UnitTreeVisitor {

  private Set<Import> imports = new LinkedHashSet<>();

  public ImplementationImportCollector(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AnnotationTypeMemberDeclaration.java`
#### Snippet
```java

  private ExecutableElement element = null;
  private ChildLink<Expression> defaultValue = ChildLink.create(Expression.class, this);

  public AnnotationTypeMemberDeclaration() {}
```

### FieldMayBeFinal
Field `componentType` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ArrayType.java`
#### Snippet
```java

  // TODO(kirbs): Add dimensions into pipeline processing for annotations support on dimensions.
  private ChildLink<Type> componentType = ChildLink.create(Type.class, this);

  public ArrayType() {}
```

### FieldMayBeFinal
Field `tempDirs` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
public class FileUtil {

  private Set<String> tempDirs = new HashSet<>();
  private List<String> sourcePathEntries = new ArrayList<>();
  private List<String> classPathEntries = new ArrayList<>();
```

### FieldMayBeFinal
Field `classPathEntries` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/util/FileUtil.java`
#### Snippet
```java
  private Set<String> tempDirs = new HashSet<>();
  private List<String> sourcePathEntries = new ArrayList<>();
  private List<String> classPathEntries = new ArrayList<>();
  private File outputDirectory = new File(".");
  private File headerOutputDirectory = null;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ParameterizedType.java`
#### Snippet
```java
public class ParameterizedType extends Type {

  private ChildLink<Type> type = ChildLink.create(Type.class, this);

  public ParameterizedType() {}
```

### FieldMayBeFinal
Field `operands` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/InfixExpression.java`
#### Snippet
```java
  private TypeMirror typeMirror = null;
  private Operator operator = null;
  private ChildList<Expression> operands = ChildList.create(Expression.class, this);

  public InfixExpression() {}
```

### FieldMayBeFinal
Field `name` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MemberValuePair.java`
#### Snippet
```java
public class MemberValuePair extends TreeNode {

  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);
  private ChildLink<Expression> value = ChildLink.create(Expression.class, this);

```

### FieldMayBeFinal
Field `value` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/MemberValuePair.java`
#### Snippet
```java

  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);
  private ChildLink<Expression> value = ChildLink.create(Expression.class, this);

  public MemberValuePair() {}
```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TypeLiteral.java`
#### Snippet
```java

  private final TypeMirror typeMirror;
  private ChildLink<Type> type = ChildLink.create(Type.class, this);

  public TypeLiteral(TypeMirror typeMirror) {
```

### FieldMayBeFinal
Field `statements` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Block.java`
#### Snippet
```java
public class Block extends Statement {

  private ChildList<Statement> statements = ChildList.create(Statement.class, this);
  private boolean hasAutoreleasePool = false;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SingleMemberAnnotation.java`
#### Snippet
```java
public class SingleMemberAnnotation extends Annotation {

  private ChildLink<Expression> value = ChildLink.create(Expression.class, this);

  public SingleMemberAnnotation() {}
```

### FieldMayBeFinal
Field `fragments` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TagElement.java`
#### Snippet
```java

  private TagKind tagKind;
  private ChildList<TreeNode> fragments = ChildList.create(TreeNode.class, this);

  public TagElement() {
```

### FieldMayBeFinal
Field `implementationImportTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/NativeDeclaration.java`
#### Snippet
```java
  private String headerCode = null;
  private String implementationCode = null;
  private List<TypeMirror> implementationImportTypes = new ArrayList<>();

  public NativeDeclaration(NativeDeclaration other) {
```

### FieldMayBeFinal
Field `parameter` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnhancedForStatement.java`
#### Snippet
```java
public class EnhancedForStatement extends Statement {

  private ChildLink<SingleVariableDeclaration> parameter =
      ChildLink.create(SingleVariableDeclaration.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnhancedForStatement.java`
#### Snippet
```java
      ChildLink.create(SingleVariableDeclaration.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

  public EnhancedForStatement() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/EnhancedForStatement.java`
#### Snippet
```java
  private ChildLink<SingleVariableDeclaration> parameter =
      ChildLink.create(SingleVariableDeclaration.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `types` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/UnionType.java`
#### Snippet
```java
public class UnionType extends Type {

  private ChildList<Type> types = ChildList.create(Type.class, this);

  public UnionType() {}
```

### FieldMayBeFinal
Field `name` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/QualifiedName.java`
#### Snippet
```java

  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);

  public QualifiedName() {}
```

### FieldMayBeFinal
Field `qualifier` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/QualifiedName.java`
#### Snippet
```java
public class QualifiedName extends Name {

  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);
  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);

```

### FieldMayBeFinal
Field `superCalls` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java

    private Boolean functionizable = null;
    private Set<ExecutableElement> superCalls = new HashSet<>();

    private boolean resolveFunctionizable(Map<ExecutableElement, MethodInfo> infoMap) {
```

### FieldMayBeFinal
Field `invocations` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
    private MethodInfo currentMethod = null;
    private Map<ExecutableElement, MethodInfo> infoMap = new HashMap<>();
    private Set<ExecutableElement> invocations = new HashSet<>();

    @Override
```

### FieldMayBeFinal
Field `infoMap` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/Functionizer.java`
#### Snippet
```java
    // Don't need a stack here because local types have already been extracted.
    private MethodInfo currentMethod = null;
    private Map<ExecutableElement, MethodInfo> infoMap = new HashMap<>();
    private Set<ExecutableElement> invocations = new HashSet<>();

```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java`
#### Snippet
```java
public class CreationReference extends MethodReference {

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildLink<Expression> creationOuterArg = ChildLink.create(Expression.class, this);
  private ChildList<Expression> creationCaptureArgs = ChildList.create(Expression.class, this);
```

### FieldMayBeFinal
Field `creationOuterArg` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java`
#### Snippet
```java

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildLink<Expression> creationOuterArg = ChildLink.create(Expression.class, this);
  private ChildList<Expression> creationCaptureArgs = ChildList.create(Expression.class, this);

```

### FieldMayBeFinal
Field `creationCaptureArgs` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java`
#### Snippet
```java
  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildLink<Expression> creationOuterArg = ChildLink.create(Expression.class, this);
  private ChildList<Expression> creationCaptureArgs = ChildList.create(Expression.class, this);

  public CreationReference() {}
```

### FieldMayBeFinal
Field `rightOperand` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/InstanceofExpression.java`
#### Snippet
```java
  private TypeMirror typeMirror;
  private ChildLink<Expression> leftOperand = ChildLink.create(Expression.class, this);
  private ChildLink<Type> rightOperand = ChildLink.create(Type.class, this);

  public InstanceofExpression() {}
```

### FieldMayBeFinal
Field `leftOperand` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/InstanceofExpression.java`
#### Snippet
```java

  private TypeMirror typeMirror;
  private ChildLink<Expression> leftOperand = ChildLink.create(Expression.class, this);
  private ChildLink<Type> rightOperand = ChildLink.create(Type.class, this);

```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/TypeMethodReference.java`
#### Snippet
```java
public class TypeMethodReference extends MethodReference {

  private ChildLink<Type> type = ChildLink.create(Type.class, this);

  public TypeMethodReference() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ExpressionStatement.java`
#### Snippet
```java
public class ExpressionStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public ExpressionStatement() {}
```

### FieldMayBeFinal
Field `wildcardKeys` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
  // There is one wildcard value for each key, enforced within this class.
  // Too bad there's no available equivalent to android.util.ArrayMap.
  private List<Pattern> wildcardKeys = Lists.newArrayList();
  private List<String> wildcardValues = Lists.newArrayList();

```

### FieldMayBeFinal
Field `wildcardValues` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/util/PackagePrefixes.java`
#### Snippet
```java
  // Too bad there's no available equivalent to android.util.ArrayMap.
  private List<Pattern> wildcardKeys = Lists.newArrayList();
  private List<String> wildcardValues = Lists.newArrayList();

  public PackagePrefixes(PackageInfoLookup packageLookup) {
```

### FieldMayBeFinal
Field `sb` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/DebugASTDump.java`
#### Snippet
```java
public class DebugASTDump extends TreeVisitor {

  private SourceBuilder sb = new SourceBuilder(false);

  /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CastExpression.java`
#### Snippet
```java
public class CastExpression extends Expression {

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/CastExpression.java`
#### Snippet
```java

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public CastExpression(CastExpression other) {
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SwitchCase.java`
#### Snippet
```java

  private boolean isDefault = false;
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);

  public SwitchCase() {}
```

### FieldMayBeFinal
Field `leftHandSide` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Assignment.java`
#### Snippet
```java

  private Operator operator;
  private ChildLink<Expression> leftHandSide = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> rightHandSide = ChildLink.create(Expression.class, this);

```

### FieldMayBeFinal
Field `rightHandSide` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Assignment.java`
#### Snippet
```java
  private Operator operator;
  private ChildLink<Expression> leftHandSide = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> rightHandSide = ChildLink.create(Expression.class, this);

  public Assignment() {}
```

### FieldMayBeFinal
Field `qualifier` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ThisExpression.java`
#### Snippet
```java

  private TypeMirror typeMirror = null;
  private ChildLink<Name> qualifier = ChildLink.create(Name.class, this);

  public ThisExpression() {}
```

### FieldMayBeFinal
Field `typeMap` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/SuperMethodInvocationRewriter.java`
#### Snippet
```java

  private Set<SuperMethodElementPair> superMethods = new LinkedHashSet<>();
  private Map<TypeElement, AbstractTypeDeclaration> typeMap = new HashMap<>();

  public SuperMethodInvocationRewriter(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `superMethods` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/SuperMethodInvocationRewriter.java`
#### Snippet
```java
public class SuperMethodInvocationRewriter extends UnitTreeVisitor {

  private Set<SuperMethodElementPair> superMethods = new LinkedHashSet<>();
  private Map<TypeElement, AbstractTypeDeclaration> typeMap = new HashMap<>();

```

### FieldMayBeFinal
Field `renamedTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/VariableRenamer.java`
#### Snippet
```java

  private List<Set<String>> fieldNameStack = new ArrayList<>();
  private Set<TypeElement> renamedTypes = new HashSet<>();

  public VariableRenamer(CompilationUnit unit) {
```

### FieldMayBeFinal
Field `fieldNameStack` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/VariableRenamer.java`
#### Snippet
```java
public class VariableRenamer extends UnitTreeVisitor {

  private List<Set<String>> fieldNameStack = new ArrayList<>();
  private Set<TypeElement> renamedTypes = new HashSet<>();

```

### FieldMayBeFinal
Field `elseStatement` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/IfStatement.java`
#### Snippet
```java
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> thenStatement = ChildLink.create(Statement.class, this);
  private ChildLink<Statement> elseStatement = ChildLink.create(Statement.class, this);

  public IfStatement() {}
```

### FieldMayBeFinal
Field `thenStatement` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/IfStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> thenStatement = ChildLink.create(Statement.class, this);
  private ChildLink<Statement> elseStatement = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/IfStatement.java`
#### Snippet
```java
public class IfStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> thenStatement = ChildLink.create(Statement.class, this);
  private ChildLink<Statement> elseStatement = ChildLink.create(Statement.class, this);
```

### FieldMayBeFinal
Field `modifiers` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedElement.java`
#### Snippet
```java
  private final ElementKind kind;
  private final boolean synthetic;
  private Set<Modifier> modifiers = new HashSet<>();
  private final Element enclosingElement;
  private final List<AnnotationMirror> annotationMirrors = new ArrayList<>();
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AssertStatement.java`
#### Snippet
```java
public class AssertStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> message = ChildLink.create(Expression.class, this);

```

### FieldMayBeFinal
Field `message` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/AssertStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> message = ChildLink.create(Expression.class, this);

  public AssertStatement() {
```

### FieldMayBeFinal
Field `updaters` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ForStatement.java`
#### Snippet
```java
  private ChildList<Expression> initializers = ChildList.create(Expression.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Expression> updaters = ChildList.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ForStatement.java`
#### Snippet
```java

  private ChildList<Expression> initializers = ChildList.create(Expression.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Expression> updaters = ChildList.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);
```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ForStatement.java`
#### Snippet
```java
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Expression> updaters = ChildList.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

  public ForStatement() {}
```

### FieldMayBeFinal
Field `initializers` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ForStatement.java`
#### Snippet
```java
public class ForStatement extends Statement {

  private ChildList<Expression> initializers = ChildList.create(Expression.class, this);
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildList<Expression> updaters = ChildList.create(Expression.class, this);
```

### FieldMayBeFinal
Field `operand` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/PostfixExpression.java`
#### Snippet
```java

  private Operator operator = null;
  private ChildLink<Expression> operand = ChildLink.create(Expression.class, this);

  public PostfixExpression() {}
```

### FieldMayBeFinal
Field `depths` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/ComplexExpressionExtractor.java`
#### Snippet
```java

  private static int maxDepth = DEFAULT_MAX_DEPTH;
  private Map<Expression, Integer> depths = Maps.newHashMap();
  private ExecutableElement currentMethod;
  private Statement currentStatement;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/PackageDeclaration.java`
#### Snippet
```java
  private ChildLink<Javadoc> javadoc = ChildLink.create(Javadoc.class, this);
  private ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private ChildLink<Name> name = ChildLink.create(Name.class, this);

  public PackageDeclaration(PackageDeclaration other) {
```

### FieldMayBeFinal
Field `javadoc` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/PackageDeclaration.java`
#### Snippet
```java

  private PackageElement packageElement = null;
  private ChildLink<Javadoc> javadoc = ChildLink.create(Javadoc.class, this);
  private ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private ChildLink<Name> name = ChildLink.create(Name.class, this);
```

### FieldMayBeFinal
Field `annotations` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/PackageDeclaration.java`
#### Snippet
```java
  private PackageElement packageElement = null;
  private ChildLink<Javadoc> javadoc = ChildLink.create(Javadoc.class, this);
  private ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private ChildLink<Name> name = ChildLink.create(Name.class, this);

```

### FieldMayBeFinal
Field `deadCodeMap` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/translate/DefaultMethodShimGenerator.java`
#### Snippet
```java
public class DefaultMethodShimGenerator extends UnitTreeVisitor {

  private CodeReferenceMap deadCodeMap;

  public DefaultMethodShimGenerator(CompilationUnit unit, CodeReferenceMap deadCodeMap) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FieldAccess.java`
#### Snippet
```java
  private VariableElement variableElement = null;
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);

  public FieldAccess() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/FieldAccess.java`
#### Snippet
```java

  private VariableElement variableElement = null;
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<SimpleName> name = ChildLink.create(SimpleName.class, this);

```

### FieldMayBeFinal
Field `interfaces` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/types/GeneratedTypeElement.java`
#### Snippet
```java

  private final TypeMirror superclass;
  private List<TypeMirror> interfaces = new ArrayList<>();
  private final NestingKind nestingKind;
  private final Name qualifiedName;
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/WhileStatement.java`
#### Snippet
```java
public class WhileStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/WhileStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Statement> body = ChildLink.create(Statement.class, this);

  public WhileStatement() {}
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SynchronizedStatement.java`
#### Snippet
```java
public class SynchronizedStatement extends Statement {

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);

```

### FieldMayBeFinal
Field `body` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/SynchronizedStatement.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Block> body = ChildLink.create(Block.class, this);

  public SynchronizedStatement() {}
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/Javadoc.java`
#### Snippet
```java
public class Javadoc extends Comment {

  private ChildList<TagElement> tags = ChildList.create(TagElement.class, this);

  public Javadoc() {}
```

### FieldMayBeFinal
Field `type` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationExpression.java`
#### Snippet
```java
public class VariableDeclarationExpression extends Expression {

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildList<VariableDeclarationFragment> fragments =
      ChildList.create(VariableDeclarationFragment.class, this);
```

### FieldMayBeFinal
Field `fragments` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationExpression.java`
#### Snippet
```java

  private ChildLink<Type> type = ChildLink.create(Type.class, this);
  private ChildList<VariableDeclarationFragment> fragments =
      ChildList.create(VariableDeclarationFragment.class, this);

```

### FieldMayBeFinal
Field `fragments` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/VariableDeclarationStatement.java`
#### Snippet
```java
  private int modifiers = 0;
  protected ChildList<Annotation> annotations = ChildList.create(Annotation.class, this);
  private ChildList<VariableDeclarationFragment> fragments =
      ChildList.create(VariableDeclarationFragment.class, this);

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ConditionalExpression.java`
#### Snippet
```java
  private TypeMirror typeMirror = null;

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> thenExpression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> elseExpression = ChildLink.create(Expression.class, this);
```

### FieldMayBeFinal
Field `elseExpression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ConditionalExpression.java`
#### Snippet
```java
  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> thenExpression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> elseExpression = ChildLink.create(Expression.class, this);
  
  public ConditionalExpression() {}
```

### FieldMayBeFinal
Field `thenExpression` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/ConditionalExpression.java`
#### Snippet
```java

  private ChildLink<Expression> expression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> thenExpression = ChildLink.create(Expression.class, this);
  private ChildLink<Expression> elseExpression = ChildLink.create(Expression.class, this);
  
```

### FieldMayBeFinal
Field `values` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/ast/NormalAnnotation.java`
#### Snippet
```java
public class NormalAnnotation extends Annotation {

  private ChildList<MemberValuePair> values = ChildList.create(MemberValuePair.class, this);

  public NormalAnnotation() {}
```

### FieldMayBeFinal
Field `nativeImplementationBlocks` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private TreeMap<String, String> javadocBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeHeaderBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeImplementationBlocks = new TreeMap<>();
  private ListMultimap<String, GeneratedType> generatedTypes =
      MultimapBuilder.treeKeys().arrayListValues().build();
```

### FieldMayBeFinal
Field `generatedTypes` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  private TreeMap<String, String> nativeHeaderBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeImplementationBlocks = new TreeMap<>();
  private ListMultimap<String, GeneratedType> generatedTypes =
      MultimapBuilder.treeKeys().arrayListValues().build();
  private final String sourceName;
```

### FieldMayBeFinal
Field `nativeHeaderBlocks` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  // using map implementations with ordered keys.
  private TreeMap<String, String> javadocBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeHeaderBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeImplementationBlocks = new TreeMap<>();
  private ListMultimap<String, GeneratedType> generatedTypes =
```

### FieldMayBeFinal
Field `javadocBlocks` may be 'final'
in `translator/src/main/java/com/google/devtools/j2objc/gen/GenerationUnit.java`
#### Snippet
```java
  // we map units of generated code keyed by the Java class they come from,
  // using map implementations with ordered keys.
  private TreeMap<String, String> javadocBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeHeaderBlocks = new TreeMap<>();
  private TreeMap<String, String> nativeImplementationBlocks = new TreeMap<>();
```

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java

    TypicalData.Builder dataBuilder = TypicalData.newBuilder();
    dataBuilder.setField(fields[1], new Integer(42));
    dataBuilder.setField(fields[2], ByteString.copyFromUtf8("foo"));
    dataBuilder.setField(fields[3], TypicalData.EnumType.VALUE9.getValueDescriptor());
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[14], new Double(44.5));
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[15], "bar");
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[16], new Integer(24));
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    dataBuilder.setField(fields[17], new Long(4422));
    dataBuilder.setField(fields[18], new Long(2244));
    dataBuilder.addRepeatedField(fields[4], new Integer(72));
    dataBuilder.addRepeatedField(fields[8], "aaa");
    dataBuilder.addRepeatedField(fields[8], "bbb");
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\ufdfd` can be replaced with '﷽'
in `protobuf/tests/StringsTest.java`
#### Snippet
```java
  public void testReallyLongNonAsciiString() throws Exception {
    char[] chars = new char[10000];
    Arrays.fill(chars, '\ufdfd');
    String str = new String(chars);
    StringMsg msg = StringMsg.newBuilder()
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=CopyConstructorMissesField]
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

## RuleId[id=RedundantFileCreation]
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
in `protobuf/tests/CompatibilityTest.java`
#### Snippet
```java
    }
    // For macos, the files are not available in the bundle.
    return new FileInputStream(new File("testdata/" + name));
  }

```

## RuleId[id=UseBulkOperation]
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

