# turbine 
 
# Bad smells
I found 449 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 133 | false |
| NullableProblems | 74 | false |
| IgnoreResultOfCall | 42 | false |
| UnstableApiUsage | 34 | false |
| OptionalUsedAsFieldOrParameterType | 30 | false |
| RedundantTypeArguments | 27 | false |
| ConstantValue | 16 | false |
| UnnecessaryLabelOnContinueStatement | 12 | false |
| DuplicatedCode | 12 | false |
| SwitchStatementWithTooFewBranches | 9 | false |
| TrivialIf | 7 | false |
| AutoCloseableResource | 6 | false |
| FinalMethodInFinalClass | 5 | false |
| JavadocLinkAsPlainText | 5 | false |
| UnnecessaryContinue | 5 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| JavadocReference | 4 | false |
| UnusedAssignment | 3 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| OctalLiteral | 2 | false |
| RedundantCast | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| OptionalIsPresent | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnnecessaryReturn | 1 | true |
| NonStrictComparisonCanBeEquality | 1 | true |
| RedundantMethodOverride | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java
    // we don't current write jdeps for failed compilations
    deps.setSuccess(true);
    if (targetLabel.isPresent()) {
      deps.setRuleLabel(targetLabel.get());
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `FieldInfo`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
  }

  /** Collects the {@link Attribute}s for a {@link FieldInfo}. */
  static List<Attribute> fieldAttributes(ClassFile.FieldInfo field) {
    List<Attribute> attributes = new ArrayList<>();
```

### JavadocReference
Cannot resolve symbol `MethodInfo`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
  }

  /** Collects the {@link Attribute}s for a {@link MethodInfo}. */
  static List<Attribute> methodAttributes(ClassFile.MethodInfo method) {
    List<Attribute> attributes = new ArrayList<>();
```

### JavadocReference
Symbol `resolve` is inaccessible from here
in `java/com/google/turbine/binder/lookup/ImportScope.java`
#### Snippet
```java
  /**
   * A function that performs non-canonical resolution, see {@link
   * com.google.turbine.binder.Resolve#resolve}.
   */
  @FunctionalInterface
```

### JavadocReference
Cannot resolve symbol `ElementType`
in `java/com/google/turbine/bytecode/ClassReader.java`
#### Snippet
```java

  /**
   * Extracts an {@link @Retention} or {@link ElementType} {@link ClassFile.AnnotationInfo}, or else
   * skips over the annotation.
   */
```

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    int pos = position;
    EnumSet<TurbineModifier> access = EnumSet.noneOf(TurbineModifier.class);
    while (true) {
      if (token == Token.IDENT && lexer.stringValue().equals("transitive")) {
        next();
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
        EMPTY,
        FORMAL_PARAMETER,
        THROWS;
      }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `params` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineMessager.java`
#### Snippet
```java
    }
    int idx = minfo.parameters().indexOf(factory.getParamInfo(sym));
    return minfo.decl().params().get(idx).position();
  }

```

### DataFlowIssue
Method invocation `typarams` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineMessager.java`
#### Snippet
```java
        }
        tyVars = minfo.tyParams();
        trees = minfo.decl().typarams();
        break;
      default:
```

### DataFlowIssue
Method invocation `defaultValue` may produce `NullPointerException`
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
     */
    public boolean hasDefaultValue() {
      return decl() != null ? decl().defaultValue().isPresent() : defaultValue() != null;
    }

```

### DataFlowIssue
Argument `info.superClassType()` might be null
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
    }
    ImmutableList<Sig.TyParamSig> typarams = tyParamSig(info.typeParameterTypes(), env);
    ClassTySig xtnd = classTySig((ClassTy) info.superClassType());
    ImmutableList.Builder<ClassTySig> impl = ImmutableList.builder();
    for (Type i : info.interfaceTypes()) {
```

### DataFlowIssue
Argument `ci.superClassType()` might be null
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
      return true;
    }
    if (ci.superClassType() != null && needsSig(ci.superClassType())) {
      return true;
    }
```

### DataFlowIssue
Argument `info.superClassType()` might be null
in `java/com/google/turbine/processing/ClassHierarchy.java`
#### Snippet
```java
    }
    if (info.superClassType() != null) {
      node.add(info.superClassType());
    }
    for (Type type : info.interfaceTypes()) {
```

### DataFlowIssue
Expression `env.get(sym)` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `java/com/google/turbine/binder/env/CompoundEnv.java`
#### Snippet
```java
  @Override
  public @Nullable V get(S sym) {
    V result = env.get(sym);
    if (result != null) {
      return result;
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      return true;
    }
    if (!isVisible(from, packageSymbol(sym), TurbineVisibility.fromAccess(f.info().access()))) {
      // skip invisible fields in supers
      return false;
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      return false;
    }
    if (!isVisible(from, packageSymbol(m.sym()), TurbineVisibility.fromAccess(m.info().access()))) {
      // skip invisible methods in supers
      return false;
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    Set<TurbineExecutableElement> overrides = new HashSet<>();
    Set<TurbineExecutableElement> overridden = new HashSet<>();
    String name = m.info().name();
    for (TurbineExecutableElement other : methods.get(name)) {
      if (overrides(m, other, (TypeElement) m.getEnclosingElement())) {
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
            TurbineExecutableElement m = (TurbineExecutableElement) el;
            if (shouldAdd(s, from, methods, m)) {
              methods.put(m.info().name(), m);
              results.add(el);
            }
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
        packageSymbol(asSymbol(overrider)),
        packageSymbol(asSymbol(overridden)),
        TurbineVisibility.fromAccess(((TurbineExecutableElement) overridden).info().access()));
  }

```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    switch (hidden.sym().symKind()) {
      case CLASS:
        access = ((TurbineTypeElement) hidden).info().access();
        break;
      case FIELD:
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
        break;
      case FIELD:
        access = ((TurbineFieldElement) hidden).info().access();
        break;
      case METHOD:
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
        break;
      case METHOD:
        access = ((TurbineExecutableElement) hidden).info().access();
        break;
      default:
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    }
    if (hider.sym().symKind().equals(Symbol.Kind.METHOD)) {
      int access = ((TurbineExecutableElement) hider).info().access();
      if ((access & TurbineFlag.ACC_STATIC) != TurbineFlag.ACC_STATIC) {
        return false;
```

### DataFlowIssue
Argument `tyParamSig.classBound()` might be null
in `java/com/google/turbine/bytecode/sig/SigWriter.java`
#### Snippet
```java
    sb.append(':');
    if (tyParamSig.classBound() != null) {
      writeTySig(tyParamSig.classBound());
    }
    for (Sig.TySig f : tyParamSig.interfaceBounds()) {
```

### DataFlowIssue
Expression `staticOnDemandImport(cpi, i, importResolver)` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/WildImportIndex.java`
#### Snippet
```java
                  public @Nullable ImportScope get() {
                    if (i.stat()) {
                      return staticOnDemandImport(cpi, i, importResolver);
                    } else {
                      return onDemandImport(cpi, i, importResolver);
```

### DataFlowIssue
Expression `onDemandImport(cpi, i, importResolver)` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/WildImportIndex.java`
#### Snippet
```java
                      return staticOnDemandImport(cpi, i, importResolver);
                    } else {
                      return onDemandImport(cpi, i, importResolver);
                    }
                  }
```

### DataFlowIssue
Method invocation `lineMap` may produce `NullPointerException`
in `java/com/google/turbine/diag/TurbineDiagnostic.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // position != -1 implies source is non-null
  public int line() {
    return position != -1 ? source.lineMap().lineNumber(position) : -1;
  }

```

### DataFlowIssue
Method invocation `lineMap` may produce `NullPointerException`
in `java/com/google/turbine/diag/TurbineDiagnostic.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // position != -1 implies source is non-null
  public int column() {
    return position != -1 ? source.lineMap().column(position) + 1 : -1;
  }

```

### DataFlowIssue
Argument `method.defaultValue()` might be null
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
                    continue;
                  }
                  result.put(element, annotationValue(factory, method.defaultValue()));
                }
                return ImmutableMap.copyOf(result);
```

### DataFlowIssue
Argument `JAVA_SPECIFICATION_VERSION.value()` might be null
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java

    if (release.isPresent()) {
      if (release.getAsInt() == Integer.parseInt(JAVA_SPECIFICATION_VERSION.value())) {
        // if --release matches the host JDK, use its jimage instead of ct.sym
        return JimageClassBinder.bindDefault();
```

### DataFlowIssue
@Nullable method 'equal' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value equal(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case STRING:
```

### DataFlowIssue
@Nullable method 'divide' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value divide(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'mod' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value mod(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'add' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value add(int position, Value a, Value b) {
    if (a.constantTypeKind() == TurbineConstantTypeKind.STRING
        || b.constantTypeKind() == TurbineConstantTypeKind.STRING) {
```

### DataFlowIssue
@Nullable method 'shiftLeft' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private static final int LONG_SHIFT_MASK = 0b111111;

  private @Nullable Value shiftLeft(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
```

### DataFlowIssue
@Nullable method 'mult' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value mult(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'lessThan' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value lessThan(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'shiftRight' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value shiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
```

### DataFlowIssue
@Nullable method 'unaryPlus' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value unaryPlus(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
```

### DataFlowIssue
@Nullable method 'lessThanEqual' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value lessThanEqual(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'bitwiseXor' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value bitwiseXor(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case BOOLEAN:
```

### DataFlowIssue
@Nullable method 'greaterThanEqual' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value greaterThanEqual(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'subtract' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value subtract(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
@Nullable method 'unaryMinus' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value unaryMinus(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
```

### DataFlowIssue
@Nullable method 'unsignedShiftRight' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value unsignedShiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
```

### DataFlowIssue
@Nullable method 'unaryNegate' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value unaryNegate(int position, Value expr) {
    switch (expr.constantTypeKind()) {
      case BOOLEAN:
```

### DataFlowIssue
@Nullable method 'notEqual' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value notEqual(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case STRING:
```

### DataFlowIssue
@Nullable method 'bitwiseComp' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value bitwiseComp(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
```

### DataFlowIssue
@Nullable method 'greaterThan' always returns a non-null value
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  private @Nullable Value greaterThan(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
```

### DataFlowIssue
Argument `module.version()` might be null
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
    tmp.writeShort(pool.moduleInfo(module.name()));
    tmp.writeShort(module.flags());
    tmp.writeShort(module.version() != null ? pool.utf8(module.version()) : 0);

    tmp.writeShort(module.requires().size());
```

### DataFlowIssue
Argument `require.version()` might be null
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
      tmp.writeShort(pool.moduleInfo(require.moduleName()));
      tmp.writeShort(require.flags());
      tmp.writeShort(require.version() != null ? pool.utf8(require.version()) : 0);
    }

```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java
                    LookupResult result = tli.scope().lookup(new LookupKey(i.type()));
                    if (result == null) {
                      return null;
                    }
                    ClassSymbol sym = (ClassSymbol) result.sym();
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java
                    for (int i = 0; i < result.remaining().size() - 1; i++) {
                      if (sym == null) {
                        return null;
                      }
                      sym = resolve.resolveOne(sym, result.remaining().get(i));
```

### DataFlowIssue
Expression `sym` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java
                      sym = resolve.resolveOne(sym, result.remaining().get(i));
                    }
                    return sym;
                  }
                }));
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java
                    LookupResult result = tli.scope().lookup(new LookupKey(i.type()));
                    if (result == null) {
                      return null;
                    }
                    ClassSymbol sym = (ClassSymbol) result.sym();
```

### DataFlowIssue
Expression `staticNamedImport(log, cpi, i)` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/ImportIndex.java`
#### Snippet
```java
                @Override
                public @Nullable ImportScope get() {
                  return staticNamedImport(log, cpi, i);
                }
              }));
```

### DataFlowIssue
Expression `namedImport(log, cpi, i, resolve)` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/lookup/ImportIndex.java`
#### Snippet
```java
                @Override
                public @Nullable ImportScope get() {
                  return namedImport(log, cpi, i, resolve);
                }
              }));
```

### DataFlowIssue
Method invocation `repeatable` may produce `NullPointerException`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
          continue;
        }
        ClassSymbol container = info.annotationMetadata().repeatable();
        if (container == null) {
          if (isKotlinRepeatable(info)) {
```

### DataFlowIssue
Argument `base.receiver()` might be null
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
        declarationAnnotations.build(),
        base.receiver() != null
            ? bindParam(env, base.receiver(), TurbineElementType.PARAMETER)
            : null);
  }
```

### DataFlowIssue
Argument `field.signature()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    List<Attribute> attributes = new ArrayList<>();
    if (field.signature() != null) {
      attributes.add(new Signature(field.signature()));
    }
    if (field.value() != null) {
```

### DataFlowIssue
Argument `field.value()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (field.value() != null) {
      attributes.add(new ConstantValue(field.value()));
    }
    addAllAnnotations(attributes, field.annotations());
```

### DataFlowIssue
Argument `method.signature()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    addAllTypeAnnotations(attributes, method.typeAnnotations());
    if (method.signature() != null) {
      attributes.add(new Signature(method.signature()));
    }
    addParameterAnnotations(attributes, method.parameterAnnotations());
```

### DataFlowIssue
Argument `method.defaultValue()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (method.defaultValue() != null) {
      attributes.add(new AnnotationDefault(method.defaultValue()));
    }
    if (!method.parameters().isEmpty()) {
```

### DataFlowIssue
Argument `component.signature()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
      List<Attribute> attributes = new ArrayList<>();
      if (component.signature() != null) {
        attributes.add(new Attribute.Signature(component.signature()));
      }
      addAllAnnotations(attributes, component.annotations());
```

### DataFlowIssue
Argument `classfile.signature()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    addAllTypeAnnotations(attributes, classfile.typeAnnotations());
    if (classfile.signature() != null) {
      attributes.add(new Signature(classfile.signature()));
    }
    if (classfile.module() != null) {
```

### DataFlowIssue
Argument `classfile.module()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (classfile.module() != null) {
      attributes.add(new Attribute.Module(classfile.module()));
    }
    if (classfile.nestHost() != null) {
```

### DataFlowIssue
Argument `classfile.nestHost()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (classfile.nestHost() != null) {
      attributes.add(new Attribute.NestHost(classfile.nestHost()));
    }
    if (!classfile.nestMembers().isEmpty()) {
```

### DataFlowIssue
Argument `classfile.record()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (classfile.record() != null) {
      attributes.add(recordAttribute(classfile.record()));
    }
    if (!classfile.permits().isEmpty()) {
```

### DataFlowIssue
Argument `classfile.transitiveJar()` might be null
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
    }
    if (classfile.transitiveJar() != null) {
      attributes.add(new Attribute.TurbineTransitiveJar(classfile.transitiveJar()));
    }
    return attributes;
```

### DataFlowIssue
Argument `info.superClassType()` might be null
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
      }
      TypeBoundClass info = getInfo(curr.sym());
      curr = canon(info.owner(), (ClassTy) info.superClassType());
    }
    simples.add(ty);
```

### DataFlowIssue
Argument `classfile.superName()` might be null
in `java/com/google/turbine/bytecode/ClassWriter.java`
#### Snippet
```java
    output.writeShort(classfile.access());
    output.writeShort(pool.classInfo(classfile.name()));
    output.writeShort(classfile.superName() != null ? pool.classInfo(classfile.superName()) : 0);
    output.writeShort(classfile.interfaces().size());
    for (String i : classfile.interfaces()) {
```

### DataFlowIssue
Argument `sig.classBound()` might be null
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
    ImmutableList.Builder<Type> bounds = ImmutableList.builder();
    if (sig.classBound() != null) {
      bounds.add(BytecodeBinder.bindTy(sig.classBound(), scope));
    }
    for (Sig.TySig t : sig.interfaceBounds()) {
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
            public @Nullable ClassTy get() {
              if (superclass() == null) {
                return null;
              }
              if (sig.get() == null || sig.get().superClass() == null) {
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
            public @Nullable AnnotationMetadata get() {
              if ((access() & TurbineFlag.ACC_ANNOTATION) != TurbineFlag.ACC_ANNOTATION) {
                return null;
              }
              RetentionPolicy retention = null;
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
              String signature = classFile.get().signature();
              if (signature == null) {
                return null;
              }
              return new SigParser(signature).parseClassSig();
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
                }
              }
              return null;
            }
          });
```

### DataFlowIssue
`null` is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
              String superclass = classFile.get().superName();
              if (superclass == null) {
                return null;
              }
              return new ClassSymbol(superclass);
```

### DataFlowIssue
Argument `m.defaultValue()` might be null
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java

    Const defaultValue =
        m.defaultValue() != null ? BytecodeBinder.bindValue(m.defaultValue()) : null;

    ImmutableList<AnnoInfo> annotations = BytecodeBinder.bindAnnotations(m.annotations());
```

### DataFlowIssue
Expression `cache.get(sym)` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `java/com/google/turbine/binder/env/LazyEnv.java`
#### Snippet
```java
  @Override
  public @Nullable V get(S sym) {
    V v = cache.get(sym);
    if (v != null) {
      return v;
```

### DataFlowIssue
Expression `completer.complete(rec, sym)` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `java/com/google/turbine/binder/env/LazyEnv.java`
#### Snippet
```java
        throw new LazyBindingError(Joiner.on(" -> ").join(seen) + " -> " + sym);
      }
      v = completer.complete(rec, sym);
      seen.remove(sym);
      cache.put(sym, v);
```

### DataFlowIssue
Method invocation `init` may produce `NullPointerException`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      return false;
    }
    final Optional<Tree.Expression> init = field.decl().init();
    if (!init.isPresent()) {
      return false;
```

### DataFlowIssue
Argument `base.owner()` might be null
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
            .append(new SingletonScope(base.decl().name().value(), owner));
    if (base.owner() != null) {
      enclosingScope = enclosingScope.append(new ClassMemberScope(base.owner(), env));
    }

```

### DataFlowIssue
Argument `bound.superclass()` might be null
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
    }
    if (bound.superclass() != null) {
      result = resolve(env, origin, bound.superclass(), simpleName, seen);
      if (result != null && visible(origin, result, env.getNonNull(result))) {
        return result;
```

### DataFlowIssue
Argument `info.superclass()` might be null
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
    }
    if (info.superclass() != null) {
      FieldInfo field = resolveField(env, origin, info.superclass(), name, seen);
      if (field != null && visible(origin, field)) {
        return field;
```

### DataFlowIssue
Argument `m.defaultValue()` might be null
in `java/com/google/turbine/processing/TurbineAnnotationProxy.java`
#### Snippet
```java
    for (TypeBoundClass.MethodInfo m : factory.getSymbol(anno.sym()).methods()) {
      if (m.name().contentEquals(method.getName())) {
        return constValue(method.getReturnType(), factory, loader, m.defaultValue());
      }
    }
```

### DataFlowIssue
Expression `get(sym)` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `java/com/google/turbine/binder/env/Env.java`
#### Snippet
```java

  default V getNonNull(S sym) {
    V result = get(sym);
    if (result == null) {
      throw new NullPointerException(sym.toString());
```

### DataFlowIssue
Method invocation `position` may produce `NullPointerException`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
    ImmutableList.Builder<MethodInfo> result = ImmutableList.builder();
    for (MethodInfo base : methods) {
      int pos = base.decl() != null ? base.decl().position() : position;
      ImmutableMap<TyVarSymbol, TyVarInfo> tps =
          typeParameters(source, pos, env, sym, base.tyParams());
```

### DataFlowIssue
Argument `base.receiver()` might be null
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
              base.decl(),
              base.annotations(),
              base.receiver() != null ? param(source, pos, env, sym, base.receiver()) : null));
    }
    return result.build();
```

### DataFlowIssue
Method invocation `init` may produce `NullPointerException`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java

  private @Nullable Value fieldValue(TypeBoundClass.FieldInfo base) {
    if (base.decl() == null || !base.decl().init().isPresent()) {
      return null;
    }
```

### DataFlowIssue
Method invocation `init` may produce `NullPointerException`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
      value =
          constEvaluator.coerce(
              base.decl().init().get().position(), value, ((Type.PrimTy) type).primkind());
    }
    return value;
```

### DataFlowIssue
Method invocation `defaultValue` may produce `NullPointerException`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
  private MethodInfo bindMethod(MethodInfo base) {
    Const value = null;
    if (base.decl() != null && base.decl().defaultValue().isPresent()) {
      value =
          constEvaluator.evalAnnotationValue(base.decl().defaultValue().get(), base.returnType());
```

### DataFlowIssue
Method invocation `defaultValue` may produce `NullPointerException`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
    if (base.decl() != null && base.decl().defaultValue().isPresent()) {
      value =
          constEvaluator.evalAnnotationValue(base.decl().defaultValue().get(), base.returnType());
    }

```

### DataFlowIssue
Argument `base.receiver()` might be null
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
        base.decl(),
        constEvaluator.evaluateAnnotations(base.annotations()),
        base.receiver() != null ? bindParameter(base.receiver()) : null);
  }

```

### DataFlowIssue
Argument `base.superClassType()` might be null
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
        bindTypes(base.interfaceTypes()),
        base.permits(),
        base.superClassType() != null ? bindType(base.superClassType()) : null,
        bindTypeParameters(base.typeParameterTypes()),
        base.access(),
```

### DataFlowIssue
Argument `info.superClassType()` might be null
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
    ImmutableList.Builder<Type> builder = ImmutableList.builder();
    if (info.superClassType() != null) {
      builder.add(raw ? erasure(info.superClassType()) : subst(info.superClassType(), mapping));
    } else {
      builder.add(ClassTy.OBJECT);
```

### DataFlowIssue
Variable is already assigned to this value
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
                        continue OUTER;
                      }
                      sawStar = false;
                      eat();
                      break;
```

### DataFlowIssue
Switch label `'\r'` is unreachable
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
    }
    switch (ch) {
      case '\r':
        eat();
        if (ch == '\n') {
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
              @Override
              public TypeMirror get() {
                return factory.asTypeMirror(info().type());
              }
            });
```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    protected ImmutableList<AnnoInfo> annos() {
      return info().annotations();
    }
  }
```

### DataFlowIssue
Method invocation `tyParams` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      MethodInfo info = info();
      StringBuilder sb = new StringBuilder();
      if (!info.tyParams().isEmpty()) {
        sb.append('<');
        Joiner.on(',').appendTo(sb, info.tyParams().keySet());
```

### DataFlowIssue
Method invocation `asType` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror asType() {
      return factory.asTypeMirror(info().asType());
    }

```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror asType() {
      return factory.asTypeMirror(Type.TyVar.create(sym, info().annotations()));
    }

```

### DataFlowIssue
Method invocation `exceptions` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public List<? extends TypeMirror> getThrownTypes() {
      return factory.asTypeMirrors(info().exceptions());
    }

```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Set<Modifier> getModifiers() {
      return asModifierSet(ModifierOwner.FIELD, info().access());
    }

```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Object getConstantValue() {
      if (info().value() == null) {
        return null;
      }
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
        return null;
      }
      return info().value().getValue();
    }

```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
        return null;
      }
      return info().value().getValue();
    }

```

### DataFlowIssue
Method invocation `returnType` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror getReturnType() {
      return factory.asTypeMirror(info().returnType());
    }

```

### DataFlowIssue
Method invocation `sym` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Element getEnclosingElement() {
      return factory.typeElement(info().sym().owner());
    }

```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Set<Modifier> getModifiers() {
      return asModifierSet(ModifierOwner.METHOD, info().access());
    }

```

### DataFlowIssue
Method invocation `receiver` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror getReceiverType() {
      return info().receiver() != null
          ? factory.asTypeMirror(info().receiver().type())
          : factory.noType();
```

### DataFlowIssue
Method invocation `receiver` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public TypeMirror getReceiverType() {
      return info().receiver() != null
          ? factory.asTypeMirror(info().receiver().type())
          : factory.noType();
    }
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public TypeMirror getReceiverType() {
      return info().receiver() != null
          ? factory.asTypeMirror(info().receiver().type())
          : factory.noType();
    }
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public boolean isVarArgs() {
      return (info().access() & TurbineFlag.ACC_VARARGS) == TurbineFlag.ACC_VARARGS;
    }

```

### DataFlowIssue
Method invocation `owner` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                return getNestingKind().equals(NestingKind.TOP_LEVEL)
                    ? factory.packageElement(sym.owner())
                    : factory.typeElement(info().owner());
              }
            });
```

### DataFlowIssue
Method invocation `defaultValue` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public AnnotationValue getDefaultValue() {
      return info().defaultValue() != null
          ? TurbineAnnotationMirror.annotationValue(factory, info().defaultValue())
          : null;
```

### DataFlowIssue
Argument `info().defaultValue()` might be null
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public AnnotationValue getDefaultValue() {
      return info().defaultValue() != null
          ? TurbineAnnotationMirror.annotationValue(factory, info().defaultValue())
          : null;
    }
```

### DataFlowIssue
Method invocation `defaultValue` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public AnnotationValue getDefaultValue() {
      return info().defaultValue() != null
          ? TurbineAnnotationMirror.annotationValue(factory, info().defaultValue())
          : null;
    }
```

### DataFlowIssue
Method invocation `parameters` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
              public ImmutableList<VariableElement> get() {
                ImmutableList.Builder<VariableElement> result = ImmutableList.builder();
                for (ParamInfo param : info().parameters()) {
                  if (param.synthetic()) {
                    // ExecutableElement#getParameters doesn't expect synthetic or mandated
```

### DataFlowIssue
Method invocation `upperBound` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public List<? extends TypeMirror> getBounds() {
      ImmutableList<Type> bounds = info().upperBound().bounds();
      return factory.asTypeMirrors(bounds.isEmpty() ? ImmutableList.of(ClassTy.OBJECT) : bounds);
    }
```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    protected ImmutableList<AnnoInfo> annos() {
      return info().annotations();
    }
  }
```

### DataFlowIssue
Method invocation `binaryName` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                Deque<String> flat = new ArrayDeque<>();
                while (info.owner() != null) {
                  flat.addFirst(sym.binaryName().substring(info.owner().binaryName().length() + 1));
                  sym = info.owner();
                  info = factory.getSymbol(sym);
```

### DataFlowIssue
Method invocation `binaryName` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                Deque<String> flat = new ArrayDeque<>();
                while (info.owner() != null) {
                  flat.addFirst(sym.binaryName().substring(info.owner().binaryName().length() + 1));
                  sym = info.owner();
                  info = factory.getSymbol(sym);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                  info = factory.getSymbol(sym);
                }
                flat.addFirst(sym.toString());
                return new TurbineName(Joiner.on('.').join(flat));
              }
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public ElementKind getKind() {
      return ((info().access() & TurbineFlag.ACC_ENUM) == TurbineFlag.ACC_ENUM)
          ? ElementKind.ENUM_CONSTANT
          : ElementKind.FIELD;
```

### DataFlowIssue
Method invocation `tyParams` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public List<? extends TypeParameterElement> getTypeParameters() {
      ImmutableList.Builder<TurbineTypeParameterElement> result = ImmutableList.builder();
      for (Map.Entry<TyVarSymbol, TyVarInfo> p : info().tyParams().entrySet()) {
        result.add(factory.typeParameterElement(p.getKey()));
      }
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Set<Modifier> getModifiers() {
      return asModifierSet(ModifierOwner.PARAMETER, info().access());
    }

```

### DataFlowIssue
Method invocation `sym` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Name getSimpleName() {
      return new TurbineName(info().sym().name());
    }

```

### DataFlowIssue
Method invocation `binaryName` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                }
                return new TurbineName(
                    sym.binaryName().substring(info.owner().binaryName().length() + 1));
              }
            });
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Set<Modifier> getModifiers() {
      return asModifierSet(ModifierOwner.PARAMETER, info().access());
    }

```

### DataFlowIssue
Method invocation `decl` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      VarDecl decl = info().decl();
      return decl != null ? decl.javadoc() : null;
    }
```

### DataFlowIssue
Method invocation `decl` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      MethDecl decl = info().decl();
      return decl != null ? decl.javadoc() : null;
    }
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror asType() {
      return factory.asTypeMirror(info().type());
    }

```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    protected ImmutableList<AnnoInfo> annos() {
      return info().annotations();
    }
  }
```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    protected ImmutableList<AnnoInfo> annos() {
      return info().annotations();
    }
  }
```

### DataFlowIssue
Method invocation `access` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public boolean isDefault() {
      return (info().access() & TurbineFlag.ACC_DEFAULT) == TurbineFlag.ACC_DEFAULT;
    }

```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
              @Override
              public TypeMirror get() {
                return factory.asTypeMirror(info().type());
              }
            });
```

### DataFlowIssue
Method invocation `annotations` may produce `NullPointerException`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    protected ImmutableList<AnnoInfo> annos() {
      return info().annotations();
    }
  }
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      lowerTypeAnnotations(
          result,
          m.receiver().type(),
          TargetType.METHOD_RECEIVER_PARAMETER,
          TypeAnnotationInfo.EMPTY_TARGET);
```

### DataFlowIssue
Argument `m.defaultValue()` might be null
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
    }

    ElementValue defaultValue = m.defaultValue() != null ? annotationValue(m.defaultValue()) : null;

    ImmutableList<AnnotationInfo> annotations = lowerAnnotations(m.annotations());
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `java/com/google/turbine/binder/FileManagerClassBinder.java`
#### Snippet
```java
      if (idx != -1) {
        dir = resource.substring(0, idx + 1);
        name = resource.substring(idx + 1, resource.length());
      } else {
        dir = "";
```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                    new WildTy(
                        position, typeAnnos, Optional.<Type>empty(), Optional.<Type>empty()));
                continue OUTER;
              case GT:
              case GTGT:
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
            case '6':
            case '7':
              continue OUTER;
            default:
              throw inputError();
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
        case '7':
          eat();
          continue OUTER;
        default:
          return;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
              case '8':
              case '9':
                continue OUTER;
              default:
                throw inputError();
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
        case '\f':
          eat();
          continue OUTER;

        case '/':
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
                  if (ch == '/') {
                    eat();
                    continue OUTER;
                  }
                  isJavadoc = true;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `STRING` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
                  eat();
                  sb.append(escape());
                  continue STRING;
                case '"':
                  saveValue(sb.toString());
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `STRING` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
                  sb.appendCodePoint(ch);
                  eat();
                  continue STRING;
              }
            }
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
          } while (ch == '_');
          if ('0' <= ch && ch <= '9') {
            continue OUTER;
          } else {
            throw inputError();
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
        case '9':
          eat();
          continue OUTER;
        default:
          return;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
            case '0':
            case '1':
              continue OUTER;
            default:
              throw inputError();
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
        case '1':
          eat();
          continue OUTER;
        default:
          return;
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `OUTER` on break statement
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      if (token == Token.RBRACE) {
        eat();
        break OUTER;
      }
      Expression item = expression(null);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String toString() {
      return String.valueOf(sym.name());
    }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String toString() {
      return String.valueOf(sym.name());
    }

```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

    @Override
    public final int hashCode() {
      return System.identityHashCode(this);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

        @Override
        public final String toString() {
          return "void";
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

    @Override
    public final boolean equals(@Nullable Object other) {
      // The name associated with an error type is context for use in diagnostics or by annotations
      // processors. Two error types with the same name don't necessarily represent the same type.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

        @Override
        public final String toString() {
          return "none";
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

    @Override
    public final String toString() {
      return name();
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `java/com/google/turbine/options/TurbineOptionsParser.java`
#### Snippet
```java
        case "--native_header_output":
          // accepted (and ignored) for compatibility with JavaBuilder command lines
          readOne(next, argumentDeque);
          break;
        case "--compress_jar":
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
        return new Const.BooleanValue(asInt(position, a).value() < asInt(position, b).value());
      case LONG:
        return new Const.BooleanValue(asLong(position, a).value() < asLong(position, b).value());
      case FLOAT:
        return new Const.BooleanValue(asFloat(position, a).value() < asFloat(position, b).value());
      case DOUBLE:
        return new Const.BooleanValue(
            asDouble(position, a).value() < asDouble(position, b).value());
      default:
        throw error(position, ErrorKind.OPERAND_TYPE, type);
    }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
        return new Const.BooleanValue(asInt(position, a).value() <= asInt(position, b).value());
      case LONG:
        return new Const.BooleanValue(asLong(position, a).value() <= asLong(position, b).value());
      case FLOAT:
        return new Const.BooleanValue(asFloat(position, a).value() <= asFloat(position, b).value());
      case DOUBLE:
        return new Const.BooleanValue(
            asDouble(position, a).value() <= asDouble(position, b).value());
      default:
        throw error(position, ErrorKind.OPERAND_TYPE, type);
    }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/bytecode/ClassReader.java`
#### Snippet
```java
      String exportsModule = constantPool.packageInfo(reader.u2());
      int exportsFlags = reader.u2();
      int numExportsTo = reader.u2();
      ImmutableList.Builder<String> exportsToModules = ImmutableList.builder();
      for (int n = 0; n < numExportsTo; n++) {
        String exportsToModule = constantPool.moduleInfo(reader.u2());
        exportsToModules.add(exportsToModule);
      }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/bytecode/ConstantPoolReader.java`
#### Snippet
```java
    ByteArrayDataInput reader = byteReader.seek(constantPool[index - 1]);
    byte tag = reader.readByte();
    if (tag != CONSTANT_CLASS) {
      throw new AssertionError(String.format("bad tag: %x", tag));
    }
    int nameIndex = reader.readUnsignedShort();
    return utf8(nameIndex);
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
          int radix = 10;
          if (text.startsWith("0x") || text.startsWith("0X")) {
            text = text.substring(2);
            radix = 0x10;
          } else if (isOctal(text)) {
            radix = 010;
          } else if (text.startsWith("0b") || text.startsWith("0B")) {
            text = text.substring(2);
            radix = 0b10;
          }
          if (negate) {
            text = "-" + text;
          }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
            int pos = position;
            next();
            if (token == INTERFACE) {
              decls.add(annotationDeclaration(access, annos.build()));
              access = EnumSet.noneOf(TurbineModifier.class);
              annos = ImmutableList.builder();
            } else {
              annos.add(annotation(pos));
            }
            break;
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    ImmutableList.Builder<ClassTy> permits = ImmutableList.builder();
    if (token == Token.IDENT) {
      if (ident().value().equals("permits")) {
        eat(Token.IDENT);
        do {
          permits.add(classty());
        } while (maybe(Token.COMMA));
      }
    }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    int depth = 1;
    while (depth > 0) {
      switch (token) {
        case RPAREN:
          depth--;
          break;
        case LPAREN:
          depth++;
          break;
        case EOF:
          throw error(ErrorKind.UNEXPECTED_EOF);
        default:
          break;
      }
      next();
    }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/parse/VariableInitializerParser.java`
#### Snippet
```java
    int depth = 1;
    while (depth > 0) {
      switch (token) {
        case LPAREN:
          save();
          next();
          depth++;
          break;
        case RPAREN:
          save();
          next();
          depth--;
          break;
        case EOF:
          throw error(ErrorKind.UNEXPECTED_EOF);
        default:
          save();
          next();
          break;
      }
    }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
        switch (b.primkind()) {
          case CHAR:
          case INT:
          case LONG:
          case FLOAT:
          case DOUBLE:
            return true;
          default:
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
      append('<');
      boolean first = true;
      for (Tree.TyParam t : methDecl.typarams()) {
        if (!first) {
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
      append('>');
```

### DuplicatedCode
Duplicated code
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    append(modExports.packageName().replace('/', '.'));
    if (!modExports.moduleNames().isEmpty()) {
      append(" to").append('\n');
      indent += 2;
      boolean first = true;
      for (String moduleName : modExports.moduleNames()) {
        if (!first) {
          append(',').append('\n');
        }
        append(moduleName);
        first = false;
      }
      indent -= 2;
    }
    append(";");
    append('\n');
    return null;
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/diag/TurbineDiagnostic.java`
#### Snippet
```java
      SourceFile source,
      int position) {
    switch (kind) {
      case SYMBOL_NOT_FOUND:
        {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private Value bitwiseAnd(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case BOOLEAN:
        return new Const.BooleanValue(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value bitwiseXor(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case BOOLEAN:
        return new Const.BooleanValue(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value unaryNegate(int position, Value expr) {
    switch (expr.constantTypeKind()) {
      case BOOLEAN:
        return new Const.BooleanValue(!asBoolean(position, expr).value());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private Value bitwiseOr(int position, Value a, Value b) {
    switch (a.constantTypeKind()) {
      case BOOLEAN:
        return new Const.BooleanValue(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    } catch (TurbineError error) {
      for (TurbineDiagnostic diagnostic : error.diagnostics()) {
        switch (diagnostic.kind()) {
          case CANNOT_RESOLVE:
            // assume this wasn't a constant
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
      return null;
    }
    switch (val.kind()) {
      case CLASS:
        String className = ((ConstTurbineClassValue) val).className();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private Type bindTyArg(CompoundScope scope, Tree.Type ty) {
    switch (ty.kind()) {
      case WILD_TY:
        return bindWildTy(scope, (Tree.WildTy) ty);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    append(" {").append('\n');
    indent++;
    switch (tyDecl.tykind()) {
      case ENUM:
        {
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `010`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
            radix = 0x10;
          } else if (isOctal(text)) {
            radix = 010;
          } else if (text.startsWith("0b") || text.startsWith("0B")) {
            text = text.substring(2);
```

### OctalLiteral
Octal integer `010`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
            radix = 0x10;
          } else if (isOctal(text)) {
            radix = 010;
          } else if (text.startsWith("0b") || text.startsWith("0B")) {
            text = text.substring(2);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
              public ImmutableMap<ExecutableElement, AnnotationValue> get() {
                Map<ExecutableElement, AnnotationValue> result = new LinkedHashMap<>();
                result.putAll(getElementValues());
                for (MethodInfo method : elements.get().values()) {
                  if (method.defaultValue() == null) {
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `java/com/google/turbine/binder/lookup/SimpleTopLevelIndex.java`
#### Snippet
```java
        return;
      }
      return;
    }
  }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
    if (token == Token.RBRACE) {
      eat();
      return new Tree.ArrayInit(pos, ImmutableList.<Tree.Expression>of());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                Type upper = referenceType(maybeAnnos());
                acc.add(
                    new WildTy(position, typeAnnos, Optional.of(upper), Optional.<Type>empty()));
                break;
              case SUPER:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                Type lower = referenceType(maybeAnnos());
                acc.add(
                    new WildTy(position, typeAnnos, Optional.<Type>empty(), Optional.of(lower)));
                break;
              case COMMA:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                acc.add(
                    new WildTy(
                        position, typeAnnos, Optional.<Type>empty(), Optional.<Type>empty()));
                continue OUTER;
              case GT:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                acc.add(
                    new WildTy(
                        position, typeAnnos, Optional.<Type>empty(), Optional.<Type>empty()));
                continue OUTER;
              case GT:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                acc.add(
                    new WildTy(
                        position, typeAnnos, Optional.<Type>empty(), Optional.<Type>empty()));
                break OUTER;
              default:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                acc.add(
                    new WildTy(
                        position, typeAnnos, Optional.<Type>empty(), Optional.<Type>empty()));
                break OUTER;
              default:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        name,
        typarams,
        Optional.<ClassTy>empty(),
        interfaces.build(),
        permits.build(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        annos,
        name,
        ImmutableList.<TyParam>of(),
        Optional.<ClassTy>empty(),
        interfaces.build(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        name,
        ImmutableList.<TyParam>of(),
        Optional.<ClassTy>empty(),
        interfaces.build(),
        ImmutableList.of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    ty = extraDims(ty);
    return new VarDecl(
        position, access, annos.build(), ty, name, Optional.<Expression>empty(), null);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
          String javadoc = lexer.javadoc();
          access.add(TurbineModifier.COMPACT_CTOR);
          return ImmutableList.<Tree>of(
              new MethDecl(
                  pos,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
              new ClassTy(
                  position,
                  Optional.<ClassTy>empty(),
                  ident,
                  ImmutableList.<Type>of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                  Optional.<ClassTy>empty(),
                  ident,
                  ImmutableList.<Type>of(),
                  ImmutableList.of());
          pos = position;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
              new ClassTy(
                  position,
                  Optional.<ClassTy>empty(),
                  ident,
                  ImmutableList.<Type>of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                  Optional.<ClassTy>empty(),
                  ident,
                  ImmutableList.<Type>of(),
                  ImmutableList.of());
          result = maybeDims(maybeAnnos(), result);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        {
          result =
              new ClassTy(position, Optional.<ClassTy>empty(), ident, tyargs(), ImmutableList.of());
          result = maybeDims(maybeAnnos(), result);
          break;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
            new ClassTy(
                position,
                Optional.<ClassTy>empty(),
                ident,
                ImmutableList.<Type>of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                Optional.<ClassTy>empty(),
                ident,
                ImmutableList.<Type>of(),
                ImmutableList.of());
        break;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        name,
        typarams,
        Optional.<ClassTy>empty(),
        interfaces.build(),
        /* permits= */ ImmutableList.of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        annos,
        typaram,
        Optional.<Tree>ofNullable(result),
        name,
        formals.build(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                    new ClassTy(
                        position,
                        Optional.<ClassTy>empty(),
                        enumName,
                        ImmutableList.<Type>of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                        Optional.<ClassTy>empty(),
                        enumName,
                        ImmutableList.<Type>of(),
                        ImmutableList.of()),
                    name,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                        ImmutableList.of()),
                    name,
                    Optional.<Expression>empty(),
                    javadoc));
            annos = ImmutableList.builder();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        annos,
        name,
        ImmutableList.<TyParam>of(),
        Optional.<ClassTy>empty(),
        ImmutableList.<ClassTy>of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        name,
        ImmutableList.<TyParam>of(),
        Optional.<ClassTy>empty(),
        ImmutableList.<ClassTy>of(),
        ImmutableList.of(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        ImmutableList.<TyParam>of(),
        Optional.<ClassTy>empty(),
        ImmutableList.<ClassTy>of(),
        ImmutableList.of(),
        members,
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/SourceBoundClass.java`
#### Snippet
```java
public class SourceBoundClass implements BoundClass {
  private final ClassSymbol sym;
  private final @Nullable ClassSymbol owner;
  private final ImmutableMap<String, ClassSymbol> children;
  private final int access;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/ModuleInfo.java`
#### Snippet
```java

  private final String name;
  private final @Nullable String version;
  private final int flags;
  private final ImmutableList<AnnoInfo> annos;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/ModuleInfo.java`
#### Snippet
```java
    private final String moduleName;
    private final int flags;
    private final @Nullable String version;

    public RequireInfo(String moduleName, int flags, @Nullable String version) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
  class TyVarInfo {
    private final IntersectionTy upperBound;
    private final @Nullable Type lowerBound;
    private final ImmutableList<AnnoInfo> annotations;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
    private final ImmutableList<Type> exceptions;
    private final int access;
    private final @Nullable Const defaultValue;
    private final @Nullable MethDecl decl;
    private final ImmutableList<AnnoInfo> annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
    private final int access;
    private final @Nullable Const defaultValue;
    private final @Nullable MethDecl decl;
    private final ImmutableList<AnnoInfo> annotations;
    private final @Nullable ParamInfo receiver;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
    private final @Nullable MethDecl decl;
    private final ImmutableList<AnnoInfo> annotations;
    private final @Nullable ParamInfo receiver;

    public MethodInfo(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java

    private final Tree.@Nullable VarDecl decl;
    private final Const.@Nullable Value value;

    public FieldInfo(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
    private final ImmutableList<AnnoInfo> annotations;

    private final Tree.@Nullable VarDecl decl;
    private final Const.@Nullable Value value;

```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java

  private ImmutableList<Sig.TyParamSig> tyParamSig(
      Map<TyVarSymbol, TyVarInfo> px, Env<ClassSymbol, TypeBoundClass> env) {
    ImmutableList.Builder<Sig.TyParamSig> result = ImmutableList.builder();
    for (Map.Entry<TyVarSymbol, TyVarInfo> entry : px.entrySet()) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java

  private Sig.TyParamSig tyParamSig(
      TyVarSymbol sym, TyVarInfo info, Env<ClassSymbol, TypeBoundClass> env) {

    String identifier = sym.name();
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
   */
  public @Nullable String methodSignature(
      Env<ClassSymbol, TypeBoundClass> env, TypeBoundClass.MethodInfo method, ClassSymbol sym) {
    if (!needsMethodSig(sym, env, method)) {
      return null;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
   */
  public @Nullable String classSignature(
      SourceTypeBoundClass info, Env<ClassSymbol, TypeBoundClass> env) {
    if (!classNeedsSig(info)) {
      return null;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java

  private boolean needsMethodSig(
      ClassSymbol sym, Env<ClassSymbol, TypeBoundClass> env, TypeBoundClass.MethodInfo m) {
    if ((env.getNonNull(sym).access() & TurbineFlag.ACC_ENUM) == TurbineFlag.ACC_ENUM
        && m.name().equals("<init>")) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ClassHierarchy.java`
#### Snippet
```java
  }

  public void round(CompoundEnv<ClassSymbol, TypeBoundClass> env) {
    cache.clear();
    this.env = env;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ClassHierarchy.java`
#### Snippet
```java
  private Env<ClassSymbol, ? extends TypeBoundClass> env;

  ClassHierarchy(Env<ClassSymbol, ? extends TypeBoundClass> env) {
    this.env = env;
  }
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ClassHierarchy.java`
#### Snippet
```java

  private final Map<ClassSymbol, HierarchyNode> cache = new HashMap<>();
  private Env<ClassSymbol, ? extends TypeBoundClass> env;

  ClassHierarchy(Env<ClassSymbol, ? extends TypeBoundClass> env) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/env/CompoundEnv.java`
#### Snippet
```java
public class CompoundEnv<S extends Symbol, V> implements Env<S, V> {

  private final @Nullable Env<S, ? extends V> base;
  private final Env<S, ? extends V> env;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/sig/Sig.java`
#### Snippet
```java

    private final String name;
    private final @Nullable TySig classBound;
    private final ImmutableList<TySig> interfaceBounds;

```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java

  public ModelFactory(
      Env<ClassSymbol, ? extends TypeBoundClass> env,
      ClassLoader processorLoader,
      TopLevelIndex tli) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
  private final AtomicInteger round = new AtomicInteger(0);

  public void round(CompoundEnv<ClassSymbol, TypeBoundClass> env, TopLevelIndex tli) {
    this.env = env;
    this.tli = tli;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
public class ModelFactory {

  public Env<ClassSymbol, ? extends TypeBoundClass> env;

  private final AtomicInteger round = new AtomicInteger(0);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final Ident name;
    private final Optional<Expression> init;
    private final @Nullable String javadoc;

    public VarDecl(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final ImmutableList<VarDecl> components;
    private final TurbineTyKind tykind;
    private final @Nullable String javadoc;

    public TyDecl(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/diag/TurbineDiagnostic.java`
#### Snippet
```java
  private final ErrorKind kind;
  private final ImmutableList<Object> args;
  private final @Nullable SourceFile source;
  private final int position;

```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/deps/Transitive.java`
#### Snippet
```java

  private static Set<ClassSymbol> superClosure(BindingResult bound) {
    Env<ClassSymbol, TypeBoundClass> env =
        CompoundEnv.<ClassSymbol, TypeBoundClass>of(new SimpleEnv<>(bound.units()))
            .append(bound.classPathEnv());
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/deps/Transitive.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/lookup/CompoundScope.java`
#### Snippet
```java

  private final Scope scope;
  private final @Nullable Scope base;

  private CompoundScope(Scope scope, @Nullable Scope base) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java

  private static Set<ClassSymbol> superTypeClosure(BindingResult bound, Lowered lowered) {
    Env<ClassSymbol, TypeBoundClass> env =
        CompoundEnv.<ClassSymbol, TypeBoundClass>of(new SimpleEnv<>(bound.units()))
            .append(bound.classPathEnv());
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, TypeBoundClass info) {
    if (info.superclass() != null) {
      addSuperTypes(closure, env, info.superclass());
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
```

### NullableProblems
Overridden method parameters are not annotated
in `java/com/google/turbine/binder/ClassPath.java`
#### Snippet
```java

  @Nullable
  Supplier<byte[]> resource(String path);
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  /** The symbol of the enclosing class, for lexical field lookups. */
  private final @Nullable ClassSymbol owner;

  /** Member imports of the enclosing compilation unit. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  /** The symbol of the originating class, for visibility checks. */
  private final @Nullable ClassSymbol origin;

  /** The symbol of the enclosing class, for lexical field lookups. */
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
  private final SourceFile source;
  private final int position;
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Canonicalize(SourceFile source, int position, Env<ClassSymbol, TypeBoundClass> env) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
      SourceFile source,
      int position,
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol sym,
      Type type) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Canonicalize(SourceFile source, int position, Env<ClassSymbol, TypeBoundClass> env) {
    this.source = source;
    this.position = position;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
      SourceFile source,
      int position,
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol owner,
      ClassTy classTy) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/lookup/SimpleTopLevelIndex.java`
#### Snippet
```java
    }

    private final @Nullable ClassSymbol sym;

    // TODO(cushon): the set of children is typically going to be small, consider optimizing this
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
  private final Env<ClassSymbol, BytecodeBoundClass> env;
  private final Supplier<ClassFile> classFile;
  private final @Nullable String jarFile;

  public BytecodeBoundClass(
```

### NullableProblems
Overridden methods are not annotated
in `java/com/google/turbine/binder/env/LazyEnv.java`
#### Snippet
```java
  public interface Completer<S extends Symbol, T, V extends T> {
    /** Provides the value for the given symbol in the current environment. */
    @Nullable
    V complete(Env<S, T> env, S k);
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassReader.java`
#### Snippet
```java
  }

  private final @Nullable String path;
  private final ByteReader reader;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java

    private final String name;
    private final @Nullable String version;
    private final int flags;
    private final ImmutableList<RequireInfo> requires;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
      private final String moduleName;
      private final int flags;
      private final @Nullable String version;

      public RequireInfo(String moduleName, int flags, @Nullable String version) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
    private final String descriptor;
    private final @Nullable String signature;
    private final @Nullable Value value;
    private final List<AnnotationInfo> annotations;
    private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
  private final @Nullable ModuleInfo module;
  private final @Nullable String nestHost;
  private final ImmutableList<String> nestMembers;
  private final @Nullable RecordInfo record;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
    private final String name;
    private final String descriptor;
    private final @Nullable String signature;
    private final @Nullable Value value;
    private final List<AnnotationInfo> annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java

      private final @Nullable TypePath parent;
      private final TypePath.@Nullable Kind kind;
      private final int index;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final @Nullable String nestHost;
  private final ImmutableList<String> nestMembers;
  private final @Nullable RecordInfo record;
  private final @Nullable String transitiveJar;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final String name;
  private final @Nullable String signature;
  private final @Nullable String superClass;
  private final List<String> interfaces;
  private final List<String> permits;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
    private final @Nullable String signature;
    private final List<String> exceptions;
    private final AnnotationInfo.@Nullable ElementValue defaultValue;
    private final List<AnnotationInfo> annotations;
    private final ImmutableList<ImmutableList<AnnotationInfo>> parameterAnnotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final ImmutableList<String> nestMembers;
  private final @Nullable RecordInfo record;
  private final @Nullable String transitiveJar;

  public ClassFile(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
    private final String name;
    private final String descriptor;
    private final @Nullable String signature;
    private final List<String> exceptions;
    private final AnnotationInfo.@Nullable ElementValue defaultValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final List<InnerClass> innerClasses;
  private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
  private final @Nullable ModuleInfo module;
  private final @Nullable String nestHost;
  private final ImmutableList<String> nestMembers;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
      }

      private final @Nullable TypePath parent;
      private final TypePath.@Nullable Kind kind;
      private final int index;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
  private final int majorVersion;
  private final String name;
  private final @Nullable String signature;
  private final @Nullable String superClass;
  private final List<String> interfaces;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/bytecode/ClassFile.java`
#### Snippet
```java
      private final String name;
      private final String descriptor;
      private final @Nullable String signature;
      private final ImmutableList<AnnotationInfo> annotations;
      private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/SourceHeaderBoundClass.java`
#### Snippet
```java

  private final PackageSourceBoundClass base;
  private final @Nullable ClassSymbol superclass;
  private final ImmutableList<ClassSymbol> interfaces;
  private final ImmutableMap<String, TyVarSymbol> typeParameters;
```

### NullableProblems
Overridden methods are not annotated
in `java/com/google/turbine/binder/env/Env.java`
#### Snippet
```java
public interface Env<S extends Symbol, V> {
  /** Returns the information associated with the given symbol in this environment. */
  @Nullable
  V get(S sym);

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/AnnotationMetadata.java`
#### Snippet
```java
  private final RetentionPolicy retention;
  private final ImmutableSet<TurbineElementType> target;
  private final @Nullable ClassSymbol repeatable;

  public AnnotationMetadata(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/SourceTypeBoundClass.java`
#### Snippet
```java
  private final CompoundScope scope;
  private final MemberImportIndex memberImports;
  private final @Nullable AnnotationMetadata annotationMetadata;
  private final ImmutableList<AnnoInfo> annotations;
  private final Tree.TyDecl decl;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/SourceTypeBoundClass.java`
#### Snippet
```java

  private final ImmutableMap<TyVarSymbol, TyVarInfo> typeParameterTypes;
  private final @Nullable Type superClassType;
  private final ImmutableList<Type> interfaceTypes;
  private final ImmutableList<ClassSymbol> permits;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/bound/SourceTypeBoundClass.java`
#### Snippet
```java

  private final TurbineTyKind kind;
  private final @Nullable ClassSymbol owner;
  private final ImmutableMap<String, ClassSymbol> children;

```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private void addEnclosing(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> all,
      ClassSymbol sym) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  public static byte[] lower(
      SourceTypeBoundClass info,
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol sym,
      Set<ClassSymbol> symbols,
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      ImmutableMap<ClassSymbol, SourceTypeBoundClass> units,
      ImmutableList<SourceModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> classpath) {
    CompoundEnv<ClassSymbol, TypeBoundClass> env =
        CompoundEnv.<ClassSymbol, TypeBoundClass>of(classpath).append(new SimpleEnv<>(units));
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      ImmutableList<SourceModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> classpath) {
    CompoundEnv<ClassSymbol, TypeBoundClass> env =
        CompoundEnv.<ClassSymbol, TypeBoundClass>of(classpath).append(new SimpleEnv<>(units));
    ImmutableMap.Builder<String, byte[]> result = ImmutableMap.builder();
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java

  private final LowerSignature sig = new LowerSignature();
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Lower(Env<ClassSymbol, TypeBoundClass> env) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private static void addNestMembers(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> nestMembers,
      ClassSymbol sym) {
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
   */
  private ClassFile.InnerClass innerClass(
      Env<ClassSymbol, TypeBoundClass> env, ClassSymbol innerSym) {
    TypeBoundClass inner = env.getNonNull(innerSym);
    // this inner class is known to have an owner
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Lower(Env<ClassSymbol, TypeBoundClass> env) {
    this.env = env;
  }
```

### NullableProblems
Non-null type argument is expected
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private static byte[] lower(
      SourceModuleInfo module,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> symbols,
      int majorVersion) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `java/com/google/turbine/bytecode/sig/Sig.java`
#### Snippet
```java
   * <p>Wildcard are represented as first class types, instead only allowing them as top-level type
   * arguments. This diverges from the buggy grammar in JVMS 4.7.9.1, see:
   * http://mail.openjdk.java.net/pipermail/compiler-dev/2016-October/010450.html
   */
  public abstract static class WildTySig extends TySig {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/com/google/common/escape/SourceCodeEscapers.java`
#### Snippet
```java
 *
 * <p>This is a subset of source code escapers that are in the process of being open-sourced as part
 * of guava, see: https://github.com/google/guava/issues/1620
 */
// TODO(cushon): migrate to the guava version once it is open-sourced, and delete this
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
 * A parser for the subset of Java required for header compilation.
 *
 * <p>See JLS 19: https://docs.oracle.com/javase/specs/jls/se8/html/jls-19.html
 */
public class Parser {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/com/google/turbine/model/TurbineFlag.java`
#### Snippet
```java
 *
 * <p>See tables 4.1-A, 4.5-A, 4.6-A, and 4.7.6-A in JVMS 4:
 * https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html
 */
public final class TurbineFlag {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
  /**
   * Remove some type annotation metadata for bug-compatibility with javac, which does this
   * inconsistently (see https://bugs.openjdk.java.net/browse/JDK-8042981).
   */
  private static Type deannotate(Type ty) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    printAnnos(varDecl.annos());
    printModifiers(varDecl.mods());
    varDecl.ty().accept(this, null);
    append(' ').append(varDecl.name().value());
    if (varDecl.init().isPresent()) {
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (varDecl.init().isPresent()) {
      append(" = ");
      varDecl.init().get().accept(this, null);
    }
  }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  @Override
  public @Nullable Void visitParen(Tree.Paren paren, @Nullable Void input) {
    paren.expr().accept(this, null);
    return null;
  }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
      case POST_INCR:
      case POST_DECR:
        unary.expr().accept(this, null);
        append(unary.op().toString());
        break;
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
      case BITWISE_COMP:
        append(unary.op().toString());
        unary.expr().accept(this, null);
        break;
      default:
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  @Override
  public @Nullable Void visitArrTy(Tree.ArrTy arrTy, @Nullable Void input) {
    arrTy.elem().accept(this, null);
    if (!arrTy.annos().isEmpty()) {
      append(' ');
```

### IgnoreResultOfCall
Result of `Anno.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitTyDecl(Tree.TyDecl tyDecl, @Nullable Void input) {
    for (Tree.Anno anno : tyDecl.annos()) {
      anno.accept(this, null);
      printLine();
    }
```

### IgnoreResultOfCall
Result of `TyParam.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `ClassTy.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (tyDecl.xtnds().isPresent()) {
      append(" extends ");
      tyDecl.xtnds().get().accept(this, null);
    }
    if (!tyDecl.impls().isEmpty()) {
```

### IgnoreResultOfCall
Result of `ClassTy.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `ClassTy.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
              printLine();
            }
            t.accept(this, null);
            first = false;
          }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
              printLine();
            }
            t.accept(this, null);
            first = false;
          }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
        append(", ");
      }
      e.accept(this, null);
      first = false;
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
        append(" ").append(binary.op().toString()).append(" ");
      }
      child.accept(this, null);
      first = false;
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        e.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  static String pretty(Tree tree) {
    Pretty pretty = new Pretty();
    tree.accept(pretty, null);
    return pretty.sb.toString();
  }
```

### IgnoreResultOfCall
Result of `ClassTy.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitClassTy(Tree.ClassTy classTy, @Nullable Void input) {
    if (classTy.base().isPresent()) {
      classTy.base().get().accept(this, null);
      append('.');
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `Anno.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitModDecl(ModDecl modDecl, @Nullable Void input) {
    for (Tree.Anno anno : modDecl.annos()) {
      anno.accept(this, null);
      printLine();
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    append('\n');
    for (ModDirective directive : modDecl.directives()) {
      directive.accept(this, null);
    }
    indent--;
```

### IgnoreResultOfCall
Result of `Anno.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitPkgDecl(Tree.PkgDecl pkgDecl, @Nullable Void input) {
    for (Tree.Anno anno : pkgDecl.annos()) {
      anno.accept(this, null);
      printLine();
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (wildTy.lower().isPresent()) {
      append(" super ");
      wildTy.lower().get().accept(this, null);
    }
    if (wildTy.upper().isPresent()) {
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (wildTy.upper().isPresent()) {
      append(" extends ");
      wildTy.upper().get().accept(this, null);
    }
    return null;
```

### IgnoreResultOfCall
Result of `Anno.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitMethDecl(Tree.MethDecl methDecl, @Nullable Void input) {
    for (Tree.Anno anno : methDecl.annos()) {
      anno.accept(this, null);
      printLine();
    }
```

### IgnoreResultOfCall
Result of `TyParam.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        t.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    }
    if (methDecl.ret().isPresent()) {
      methDecl.ret().get().accept(this, null);
      append(' ');
    }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(", ");
        }
        e.accept(this, null);
        first = false;
      }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (methDecl.defaultValue().isPresent()) {
      append(" default ");
      methDecl.defaultValue().get().accept(this, null);
      append(";");
    } else if (methDecl.mods().contains(TurbineModifier.ABSTRACT)
```

### IgnoreResultOfCall
Result of `Anno.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  private void printAnnos(ImmutableList<Anno> annos) {
    for (Tree.Anno anno : annos) {
      anno.accept(this, null);
      append(' ');
    }
```

### IgnoreResultOfCall
Result of `PkgDecl.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitCompUnit(Tree.CompUnit compUnit, @Nullable Void input) {
    if (compUnit.pkg().isPresent()) {
      compUnit.pkg().get().accept(this, null);
      printLine();
    }
```

### IgnoreResultOfCall
Result of `ImportDecl.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    }
    for (Tree.ImportDecl i : compUnit.imports()) {
      i.accept(this, null);
    }
    if (compUnit.mod().isPresent()) {
```

### IgnoreResultOfCall
Result of `ModDecl.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    if (compUnit.mod().isPresent()) {
      printLine();
      compUnit.mod().get().accept(this, null);
    }
    for (Tree.TyDecl decl : compUnit.decls()) {
```

### IgnoreResultOfCall
Result of `TyDecl.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    for (Tree.TyDecl decl : compUnit.decls()) {
      printLine();
      decl.accept(this, null);
    }
    return null;
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitConditional(Tree.Conditional conditional, @Nullable Void input) {
    append("(");
    conditional.cond().accept(this, null);
    append(" ? ");
    conditional.iftrue().accept(this, null);
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    conditional.cond().accept(this, null);
    append(" ? ");
    conditional.iftrue().accept(this, null);
    append(" : ");
    conditional.iffalse().accept(this, null);
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    conditional.iftrue().accept(this, null);
    append(" : ");
    conditional.iffalse().accept(this, null);
    append(")");
    return null;
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitTypeCast(Tree.TypeCast typeCast, @Nullable Void input) {
    append('(');
    typeCast.ty().accept(this, null);
    append(") ");
    typeCast.expr().accept(this, null);
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
    typeCast.ty().accept(this, null);
    append(") ");
    typeCast.expr().accept(this, null);
    return null;
  }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  @Override
  public @Nullable Void visitClassLiteral(ClassLiteral classLiteral, @Nullable Void input) {
    classLiteral.type().accept(this, input);
    append(".class");
    return null;
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  public @Nullable Void visitAssign(Tree.Assign assign, @Nullable Void input) {
    append(assign.name().value()).append(" = ");
    assign.expr().accept(this, null);
    return null;
  }
```

### IgnoreResultOfCall
Result of `Tree.accept()` is ignored
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
          append(" & ");
        }
        bound.accept(this, null);
        first = false;
      }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
      }
      // don't rely on canonical form for simple class names
      if (hasTargs(this.classes(), i) || hasTargs(that.classes(), j)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      return true;
    }
    if (!isVisible(from, packageSymbol(sym), TurbineVisibility.fromAccess(f.info().access()))) {
      // skip invisible fields in supers
      return false;
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      return false;
    }
    if (!types.isSubtype(containingHider.asType(), containingHidden.asType())) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/options/LanguageVersion.java`
#### Snippet
```java
      return false;
    }
    if (hasPrefix && version > 10) {
      // javac supports legacy `1.*` version numbers for source versions up to Java 10
      return false;
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
      throw new AssertionError(w2.boundKind());
    }
    if (isSameType(t1, t2)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
      return false;
    }
    if (!isSameTypes(a.parameters(), substAll(b.parameters(), mapping))) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
    // corresponding to enclosing instances. Don't require the enclosing instances' representations
    // to be identical unless one of them has type arguments.
    if (hasTyArgs(ax) || hasTyArgs(bx)) {
      return false;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'base'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  /** A class, enum, interface, or annotation {@link Type}. */
  public static class ClassTy extends Type {
    private final Optional<ClassTy> base;
    private final Ident name;
    private final ImmutableList<Type> tyargs;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'defaultValue'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final ImmutableList<VarDecl> params;
    private final ImmutableList<ClassTy> exntys;
    private final Optional<Tree> defaultValue;
    private final String javadoc;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'pkg'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  /** A JLS 7.3 compilation unit. */
  public static class CompUnit extends Tree {
    private final Optional<PkgDecl> pkg;
    private final Optional<ModDecl> mod;
    private final ImmutableList<ImportDecl> imports;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ret'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
        ImmutableList<Anno> annos,
        ImmutableList<TyParam> typarams,
        Optional<Tree> ret,
        Ident name,
        ImmutableList<VarDecl> params,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultValue'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
        ImmutableList<VarDecl> params,
        ImmutableList<ClassTy> exntys,
        Optional<Tree> defaultValue,
        String javadoc) {
      super(position);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'base'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    public ClassTy(
        int position,
        Optional<ClassTy> base,
        Ident name,
        ImmutableList<Type> tyargs,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'xtnds'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final Ident name;
    private final ImmutableList<TyParam> typarams;
    private final Optional<ClassTy> xtnds;
    private final ImmutableList<ClassTy> impls;
    private final ImmutableList<ClassTy> permits;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'init'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
        Tree ty,
        Ident name,
        Optional<Expression> init,
        @Nullable String javadoc) {
      super(position);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'init'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final Tree ty;
    private final Ident name;
    private final Optional<Expression> init;
    private final @Nullable String javadoc;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'upper'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java

    public WildTy(
        int position, ImmutableList<Anno> annos, Optional<Type> upper, Optional<Type> lower) {
      super(position, annos);
      this.upper = upper;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'lower'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java

    public WildTy(
        int position, ImmutableList<Anno> annos, Optional<Type> upper, Optional<Type> lower) {
      super(position, annos);
      this.upper = upper;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pkg'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    public CompUnit(
        int position,
        Optional<PkgDecl> pkg,
        Optional<ModDecl> mod,
        ImmutableList<ImportDecl> imports,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'mod'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
        int position,
        Optional<PkgDecl> pkg,
        Optional<ModDecl> mod,
        ImmutableList<ImportDecl> imports,
        ImmutableList<TyDecl> decls,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lower'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  public static class WildTy extends Type {
    private final Optional<Type> upper;
    private final Optional<Type> lower;

    public WildTy(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ret'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final ImmutableList<Anno> annos;
    private final ImmutableList<TyParam> typarams;
    private final Optional<Tree> ret;
    private final Ident name;
    private final ImmutableList<VarDecl> params;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'mod'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  public static class CompUnit extends Tree {
    private final Optional<PkgDecl> pkg;
    private final Optional<ModDecl> mod;
    private final ImmutableList<ImportDecl> imports;
    private final ImmutableList<TyDecl> decls;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'upper'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  /** A wildcard type, possibly with an upper or lower bound. */
  public static class WildTy extends Type {
    private final Optional<Type> upper;
    private final Optional<Type> lower;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xtnds'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
        Ident name,
        ImmutableList<TyParam> typarams,
        Optional<ClassTy> xtnds,
        ImmutableList<ClassTy> impls,
        ImmutableList<ClassTy> permits,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'targetLabel'
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java
  /** Creates a jdeps proto for the current compilation. */
  public static DepsProto.Dependencies collectDeps(
      Optional<String> targetLabel, ClassPath bootclasspath, BindingResult bound, Lowered lowered) {
    DepsProto.Dependencies.Builder deps = DepsProto.Dependencies.newBuilder();
    Set<ClassSymbol> closure = superTypeClosure(bound, lowered);
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'release'
in `java/com/google/turbine/options/LanguageVersion.java`
#### Snippet
```java
  }

  private static LanguageVersion create(int source, int target, OptionalInt release) {
    return new AutoValue_LanguageVersion(source, target, release);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'module'
in `java/com/google/turbine/binder/CompUnitPreprocessor.java`
#### Snippet
```java
        ImmutableList<ImportDecl> imports,
        ImmutableList<SourceBoundClass> types,
        Optional<ModDecl> module,
        SourceFile source,
        String packageName) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'module'
in `java/com/google/turbine/binder/CompUnitPreprocessor.java`
#### Snippet
```java
    private final ImmutableList<Tree.ImportDecl> imports;
    private final ImmutableList<SourceBoundClass> types;
    private final Optional<ModDecl> module;
    private final SourceFile source;
    private final String packageName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'moduleVersion'
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
  private final CompoundEnv<ClassSymbol, TypeBoundClass> env;
  private final Env<ModuleSymbol, ModuleInfo> moduleEnv;
  private final Optional<String> moduleVersion;
  private final CompoundScope scope;
  private final TurbineLogWithSource log;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Env<ModuleSymbol, ModuleInfo> moduleEnv,
      Optional<String> moduleVersion,
      TurbineLogWithSource log) {
    this.module = module;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Env<ModuleSymbol, ModuleInfo> moduleEnv,
      Optional<String> moduleVersion,
      TurbineLogWithSource log) {
    return new ModuleBinder(module, env, moduleEnv, moduleVersion, log).bind();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
      ClassPath bootclasspath,
      BindingResult result,
      Optional<String> moduleVersion) {

    Set<String> seen = new HashSet<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      CompoundEnv<ModuleSymbol, ModuleInfo> moduleEnv,
      Optional<String> moduleVersion,
      TurbineLog log) {
    // Allow resolution of modules in the current compilation. Currently this is only needed for
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      ProcessorInfo processorInfo,
      ClassPath bootclasspath,
      Optional<String> moduleVersion) {
    TurbineLog log = new TurbineLog();
    BindingResult br;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      ClassPath classpath,
      ClassPath bootclasspath,
      Optional<String> moduleVersion) {
    ImmutableList<PreprocessedCompUnit> preProcessedUnits = CompUnitPreprocessor.preprocess(units);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleVersion'
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      ClassPath classpath,
      ClassPath bootclasspath,
      Optional<String> moduleVersion) {
    return bind(units, classpath, Processing.ProcessorInfo.empty(), bootclasspath, moduleVersion);
  }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      return false;
    }
    if (text.length() <= 1) {
      return false;
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `remove()` is identical to its super method
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove");
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `java/com/google/turbine/processing/TurbineFiler.java`
#### Snippet
```java
    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
      return new String(openInputStream().readAllBytes(), UTF_8);
    }
  }
```

### AutoCloseableResource
'ZipIterable' used without 'try'-with-resources statement
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      throws IOException {
    // TODO(cushon): don't leak file descriptors
    for (Zip.Entry ze : new Zip.ZipIterable(path)) {
      String name = ze.name();
      if (!name.endsWith(".class")) {
```

### AutoCloseableResource
'ZipIterable' used without 'try'-with-resources statement
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
    }
    for (String sourceJar : options.sourceJars()) {
      for (Zip.Entry ze : new Zip.ZipIterable(Paths.get(sourceJar))) {
        if (ze.name().endsWith(".java")) {
          String name = ze.name();
```

### AutoCloseableResource
'ZipIterable' used without 'try'-with-resources statement
in `java/com/google/turbine/binder/CtSymClassBinder.java`
#### Snippet
```java
    // files with a .sig extension.
    String releaseString = formatReleaseVersion(version);
    for (Zip.Entry ze : new Zip.ZipIterable(ctSym)) {
      String name = ze.name();
      if (!name.endsWith(".sig")) {
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `java/com/google/turbine/binder/FileManagerClassBinder.java`
#### Snippet
```java
        public byte[] get() {
          try {
            return fileObject.openInputStream().readAllBytes();
          } catch (IOException e) {
            throw new UncheckedIOException(e);
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `java/com/google/turbine/binder/FileManagerClassBinder.java`
#### Snippet
```java
                  public byte[] get() {
                    try {
                      return jfo.openInputStream().readAllBytes();
                    } catch (IOException e) {
                      throw new UncheckedIOException(e);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `ty` to `Type.WildUpperBoundedTy` is redundant
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
        return new Sig.WildTyArgSig();
      case UPPER:
        return new UpperBoundTySig(signature(((Type.WildUpperBoundedTy) ty).bound()));
      case LOWER:
        return new LowerBoundTySig(signature(((Type.WildLowerBoundedTy) ty).bound()));
```

### RedundantCast
Casting `ty` to `Type.WildLowerBoundedTy` is redundant
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
        return new UpperBoundTySig(signature(((Type.WildUpperBoundedTy) ty).bound()));
      case LOWER:
        return new LowerBoundTySig(signature(((Type.WildLowerBoundedTy) ty).bound()));
    }
    throw new AssertionError(ty.boundKind());
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      if (overrides(other, m, (TypeElement) other.getEnclosingElement())) {
        overridden.add(other);
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      if (existing != null) {
        log.error(arg.position(), ErrorKind.INVALID_ANNOTATION_ARGUMENT);
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
          sb.appendCodePoint(ch);
          eat();
          continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
                  sb.appendCodePoint(ch);
                  eat();
                  continue STRING;
              }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java
          sb.appendCodePoint(ch);
          eat();
          continue;
      }
    }
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FF` can be replaced with 'ÿ'
in `java/com/google/common/escape/SourceCodeEscapers.java`
#### Snippet
```java
  // https://docs.oracle.com/javase/specs/jls/se14/html/jls-3.html#jls-3.10.6
  //  "Octal escapes are provided for compatibility with C, but can express
  //   only Unicode values \u0000 through \u00FF, so Unicode escapes are
  //   usually preferred."
  private static class JavaCharEscaper extends ArrayBasedCharEscaper {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tyVarSymbol` is redundant
in `java/com/google/turbine/processing/TurbineMessager.java`
#### Snippet
```java

  private int tyParamPosition(TyVarSymbol sym) {
    TyVarSymbol tyVarSymbol = sym;
    Symbol owner = tyVarSymbol.owner();
    ImmutableMap<TyVarSymbol, TyVarInfo> tyVars;
```

### UnnecessaryLocalVariable
Local variable `classTy` is redundant
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java

  private ClassTy bindClassType(ClassTy type) {
    ClassTy classTy = type;
    ImmutableList.Builder<SimpleClassTy> classes = ImmutableList.builder();
    for (SimpleClassTy c : classTy.classes()) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
    public static ClassTy asNonParametricClassTy(ClassSymbol i) {
      return ClassTy.create(
          Arrays.asList(SimpleClassTy.create(i, ImmutableList.of(), ImmutableList.of())));
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `ImmutableList.builder()` assigned to `annos` is never used
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        case SEMI:
          next();
          annos = ImmutableList.builder();
          break OUTER;
        case RBRACE:
```

### UnusedAssignment
The value `ImmutableList.builder()` assigned to `annos` is never used
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
          break OUTER;
        case RBRACE:
          annos = ImmutableList.builder();
          break OUTER;
        case AT:
```

### UnusedAssignment
The value changed at `line++` is never used
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    // no trailing newline
    if (last < source.length()) {
      builder.put(Range.closedOpen(last, source.length()), line++);
    }
    return new LineMap(source, builder.build());
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
    try (OutputStream os =
        new BufferedOutputStream(
            Files.newOutputStream(Paths.get(options.outputManifest().get())))) {
      manifest.build().writeTo(os);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
      Map<String, byte[]> transitive)
      throws IOException {
    Path path = Paths.get(options.output().get());
    try (OutputStream os = Files.newOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(os, BUFFER_SIZE);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
  public static void writeJdepsForFallback(TurbineOptions options) throws IOException {
    try (OutputStream os =
        new BufferedOutputStream(Files.newOutputStream(Paths.get(options.outputDeps().get())))) {
      DepsProto.Dependencies.newBuilder()
          .setRuleLabel(options.targetLabel().get())
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
        new BufferedOutputStream(Files.newOutputStream(Paths.get(options.outputDeps().get())))) {
      DepsProto.Dependencies.newBuilder()
          .setRuleLabel(options.targetLabel().get())
          .setRequiresReducedClasspathFallback(true)
          .build()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
                      .evalFieldInitializer(
                          // we're processing fields bound from sources in the compilation
                          requireNonNull(field.decl()).init().get(), field.type());
                } catch (LazyEnv.LazyBindingError e) {
                  // fields initializers are allowed to reference the field being initialized,
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `lowerBound` is always 'null'
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
        throw new IllegalArgumentException("TODO(cushon): support lower bounds");
      }
      this.lowerBound = lowerBound;
      this.annotations = annotations;
    }
```

### ConstantValue
Condition `m.returnType() != null` is always `true`
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
      return true;
    }
    if (m.returnType() != null && needsSig(m.returnType())) {
      return true;
    }
```

### ConstantValue
Condition `a == null` is always `false`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
        {
          Value a = (Value) ((Tree.Literal) t).value();
          if (a == null) {
            return null;
          }
```

### ConstantValue
Condition `field == null` is always `false`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  Const evalConstVar(ConstVarName t) {
    FieldInfo field = resolveField(t);
    if (field == null) {
      return null;
    }
```

### ConstantValue
Condition `ty == null` is always `false`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  @Nullable
  Const evalAnnotationValue(Tree tree, Type ty) {
    if (ty == null) {
      throw error(tree.position(), ErrorKind.EXPRESSION_ERROR);
    }
```

### ConstantValue
Condition `sym == null` is always `false`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      }
    }
    if (sym == null) {
      return null;
    }
```

### ConstantValue
Condition `annoClass != null` is always `true`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    Map<String, MethodInfo> template = new LinkedHashMap<>();
    if (annoClass != null) {
      for (MethodInfo method : annoClass.methods()) {
        template.put(method.name(), method);
```

### ConstantValue
Condition `u.source() != null` is always `true`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
    Set<String> seen = new HashSet<>();
    for (CompUnit u : initialSources) {
      if (u.source() != null) {
        seen.add(u.source().path());
      }
```

### ConstantValue
Value `errorRaised` is always 'false'
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
          if (roundEnv == null) {
            roundEnv =
                new TurbineRoundEnvironment(factory, syms, false, errorRaised, allAnnotations);
          }
          try (Timers.Timer unused = timers.start(processor)) {
```

### ConstantValue
Condition `parameter.name() != null` is always `true`
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
    output.writeByte(attribute.parameters().size());
    for (ParameterInfo parameter : attribute.parameters()) {
      output.writeShort(parameter.name() != null ? pool.utf8(parameter.name()) : 0);
      output.writeShort(parameter.access());
    }
```

### ConstantValue
Condition `i == null` is always `false`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
            next();
            ImportDecl i = importDeclaration();
            if (i == null) {
              continue;
            }
```

### ConstantValue
Condition `moduleName != null` is always `true`
in `java/com/google/turbine/binder/JimageClassBinder.java`
#### Snippet
```java
        };
    for (String moduleName : moduleNames) {
      if (moduleName != null) {
        // TODO(cushon): is this requireNonNull safe?
        Path modulePath = requireNonNull(modulePath(moduleName), moduleName);
```

### ConstantValue
Condition `sig.get().superClass() == null` is always `false` when reached
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
                return null;
              }
              if (sig.get() == null || sig.get().superClass() == null) {
                return ClassTy.asNonParametricClassTy(superclass());
              }
```

### ConstantValue
Condition `inner.innerName() == null` is always `false`
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
              ImmutableMap.Builder<String, ClassSymbol> result = ImmutableMap.builder();
              for (ClassFile.InnerClass inner : classFile.get().innerClasses()) {
                if (inner.innerName() == null) {
                  // anonymous class
                  continue;
```

### ConstantValue
Condition `sig.get().interfaces() == null` is always `false` when reached
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
              }
              ImmutableList.Builder<Type> result = ImmutableList.builder();
              if (sig.get() == null || sig.get().interfaces() == null) {
                for (ClassSymbol sym : interfaces()) {
                  result.add(ClassTy.asNonParametricClassTy(sym));
```

### ConstantValue
Condition `result.sym() == null` is always `false` when reached
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
    // resolve the prefix to a symbol
    LookupResult result = scope.lookup(new LookupKey(names));
    if (result == null || result.sym() == null) {
      log.error(names.get(0).position(), ErrorKind.CANNOT_RESOLVE, Joiner.on('.').join(names));
      return Type.ErrorTy.create(names);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `java/com/google/turbine/options/LanguageVersion.java`
#### Snippet
```java
  private static int parseVersion(String value) {
    boolean hasPrefix = value.startsWith("1.");
    Integer version = Ints.tryParse(hasPrefix ? value.substring("1.".length()) : value);
    if (version == null || !isValidVersion(version, hasPrefix)) {
      throw new IllegalArgumentException("invalid -source version: " + value);
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `java/com/google/turbine/options/LanguageVersion.java`
#### Snippet
```java
          }
          String value = it.next();
          Integer n = Ints.tryParse(value);
          if (n == null) {
            throw new IllegalArgumentException("invalid --release version: " + value);
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
    for (String source : options.sources()) {
      Path path = Paths.get(source);
      units.add(Parser.parse(new SourceFile(source, MoreFiles.asCharSource(path, UTF_8).read())));
    }
    for (String sourceJar : options.sourceJars()) {
```

### UnstableApiUsage
'asCharSource(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
    for (String source : options.sources()) {
      Path path = Paths.get(source);
      units.add(Parser.parse(new SourceFile(source, MoreFiles.asCharSource(path, UTF_8).read())));
    }
    for (String sourceJar : options.sourceJars()) {
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
  private void writeTypeAnnotation(ByteArrayDataOutput output, TypeAnnotations attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    tmp.writeShort(attribute.annotations().size());
    for (TypeAnnotationInfo annotation : attribute.annotations()) {
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
      ByteArrayDataOutput output, Attribute.ParameterAnnotations attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    tmp.writeByte(attribute.annotations().size());
    for (List<AnnotationInfo> parameterAnnotations : attribute.annotations()) {
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
  private void writeRecord(ByteArrayDataOutput output, Attribute.Record attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    tmp.writeShort(attribute.components().size());
    for (Attribute.Record.Component c : attribute.components()) {
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
    ModuleInfo module = attribute.module();

    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();

    tmp.writeShort(pool.moduleInfo(module.name()));
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
      ByteArrayDataOutput output, Attribute.AnnotationDefault attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    new AnnotationWriter(pool, tmp).writeElementValue(attribute.value());
    byte[] data = tmp.toByteArray();
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/AttributeWriter.java`
#### Snippet
```java
  public void writeAnnotation(ByteArrayDataOutput output, Annotations attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    tmp.writeShort(attribute.annotations().size());
    for (AnnotationInfo annotation : attribute.annotations()) {
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/ClassWriter.java`
#### Snippet
```java
  private static byte[] finishClass(
      ConstantPool pool, ByteArrayDataOutput body, ClassFile classfile) {
    ByteArrayDataOutput result = ByteStreams.newDataOutput();
    result.writeInt(MAGIC);
    result.writeShort(MINOR_VERSION);
```

### UnstableApiUsage
'newDataOutput()' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/ClassWriter.java`
#### Snippet
```java
  public static byte[] writeClass(ClassFile classfile) {
    ConstantPool pool = new ConstantPool();
    ByteArrayDataOutput output = ByteStreams.newDataOutput();
    output.writeShort(classfile.access());
    output.writeShort(pool.classInfo(classfile.name()));
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
      checkSignature(path, eocd, index, 5, 6, "ENDSIG");
      int totalEntries = eocd.getChar(index + ENDTOT);
      long cdsize = UnsignedInts.toLong(eocd.getInt(index + ENDSIZ));
      int actualCommentSize = eocd.getChar(index + ENDCOM);
      if (commentSize != actualCommentSize) {
```

### UnstableApiUsage
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
      checkSignature(path, eocd, index, 5, 6, "ENDSIG");
      int totalEntries = eocd.getChar(index + ENDTOT);
      long cdsize = UnsignedInts.toLong(eocd.getInt(index + ENDSIZ));
      int actualCommentSize = eocd.getChar(index + ENDCOM);
      if (commentSize != actualCommentSize) {
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
      // Read the offset and variable lengths from the central directory and then try to map in the
      // data section in one shot.
      long offset = UnsignedInts.toLong(cd.getInt(cdindex + CENOFF));
      int nameLength = cd.getChar(cdindex + CENNAM);
      int extLength = cd.getChar(cdindex + CENEXT);
```

### UnstableApiUsage
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
      // Read the offset and variable lengths from the central directory and then try to map in the
      // data section in one shot.
      long offset = UnsignedInts.toLong(cd.getInt(cdindex + CENOFF));
      int nameLength = cd.getChar(cdindex + CENNAM);
      int extLength = cd.getChar(cdindex + CENEXT);
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
              nameLength,
              extLength,
              UnsignedInts.toLong(cd.getInt(cdindex + CENSIZ)),
              /*deflate=*/ true);
        case 0x0:
```

### UnstableApiUsage
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
              nameLength,
              extLength,
              UnsignedInts.toLong(cd.getInt(cdindex + CENSIZ)),
              /*deflate=*/ true);
        case 0x0:
```

### UnstableApiUsage
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
              nameLength,
              extLength,
              UnsignedInts.toLong(cd.getInt(cdindex + CENLEN)),
              /*deflate=*/ false);
        default:
```

### UnstableApiUsage
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
              nameLength,
              extLength,
              UnsignedInts.toLong(cd.getInt(cdindex + CENLEN)),
              /*deflate=*/ false);
        default:
```

### UnstableApiUsage
'newDataInput(byte\[\], int)' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/ByteReader.java`
#### Snippet
```java

  public ByteArrayDataInput seek(int i) {
    return ByteStreams.newDataInput(bytes, i);
  }

```

### UnstableApiUsage
'newDataInput(java.io.ByteArrayInputStream)' is marked unstable with @Beta
in `java/com/google/turbine/bytecode/ByteReader.java`
#### Snippet
```java
    this.bytes = bytes;
    this.indexed = new IndexedByteArrayInputStream(bytes, pos, bytes.length);
    this.input = ByteStreams.newDataInput(indexed);
  }

```

### UnstableApiUsage
'getEntry(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    checkArgument(0 <= position && position < source.length(), "%s", position);
    // requireNonNull is safe because `lines` covers the whole file length.
    Range<Integer> range = requireNonNull(lines.getEntry(position)).getKey();
    return source.substring(range.lowerEndpoint(), range.upperEndpoint());
  }
```

### UnstableApiUsage
'getEntry(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    checkArgument(0 <= position && position < source.length(), "%s", position);
    // requireNonNull is safe because `lines` covers the whole file length.
    return position - requireNonNull(lines.getEntry(position)).getKey().lowerEndpoint();
  }

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    int last = 0;
    int line = 1;
    ImmutableRangeMap.Builder<Integer, Integer> builder = ImmutableRangeMap.builder();
    for (int idx = 0; idx < source.length(); idx++) {
      char ch = source.charAt(idx);
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    int last = 0;
    int line = 1;
    ImmutableRangeMap.Builder<Integer, Integer> builder = ImmutableRangeMap.builder();
    for (int idx = 0; idx < source.length(); idx++) {
      char ch = source.charAt(idx);
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    int last = 0;
    int line = 1;
    ImmutableRangeMap.Builder<Integer, Integer> builder = ImmutableRangeMap.builder();
    for (int idx = 0; idx < source.length(); idx++) {
      char ch = source.charAt(idx);
```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    int last = 0;
    int line = 1;
    ImmutableRangeMap.Builder<Integer, Integer> builder = ImmutableRangeMap.builder();
    for (int idx = 0; idx < source.length(); idx++) {
      char ch = source.charAt(idx);
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
          // falls through
        case '\n':
          builder.put(Range.closedOpen(last, idx + 1), line++);
          last = idx + 1;
          break;
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    // no trailing newline
    if (last < source.length()) {
      builder.put(Range.closedOpen(last, source.length()), line++);
    }
    return new LineMap(source, builder.build());
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
      builder.put(Range.closedOpen(last, source.length()), line++);
    }
    return new LineMap(source, builder.build());
  }

```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
    checkArgument(0 <= position && position < source.length(), "%s", position);
    // requireNonNull is safe because `lines` covers the whole file length.
    return requireNonNull(lines.get(position));
  }

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
  private final ImmutableRangeMap<Integer, Integer> lines;

  private LineMap(String source, ImmutableRangeMap<Integer, Integer> lines) {
    this.source = source;
    this.lines = lines;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java

  private final String source;
  private final ImmutableRangeMap<Integer, Integer> lines;

  private LineMap(String source, ImmutableRangeMap<Integer, Integer> lines) {
```

