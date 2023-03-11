# turbine 
 
# Bad smells
I found 765 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 175 | false |
| DataFlowIssue | 138 | false |
| AssignmentToMethodParameter | 88 | false |
| NullableProblems | 74 | false |
| IgnoreResultOfCall | 42 | false |
| ReturnNull | 35 | false |
| UnstableApiUsage | 34 | false |
| UnnecessaryFullyQualifiedName | 31 | false |
| OptionalUsedAsFieldOrParameterType | 30 | false |
| Convert2Lambda | 19 | false |
| AbstractClassNeverImplemented | 18 | false |
| ConstantValue | 16 | false |
| RedundantFieldInitialization | 8 | false |
| IOResource | 5 | false |
| UnnecessaryContinue | 5 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| NonShortCircuitBoolean | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| Anonymous2MethodRef | 3 | false |
| UnusedAssignment | 3 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| OctalLiteral | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| NestedAssignment | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| OptionalIsPresent | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| Convert2MethodRef | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| UnnecessaryReturn | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| RedundantSuppression | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| SystemOutErr | 1 | false |
| RedundantMethodOverride | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| Java8MapApi | 1 | false |
| EmptyMethod | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=IOResource]
### IOResource
'InflaterInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java
        if (deflate) {
          bytes =
              new InflaterInputStream(
                      new ByteArrayInputStream(bytes), new Inflater(/*nowrap=*/ true))
                  .readAllBytes();
```

### IOResource
'ZipIterable' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `java/com/google/turbine/binder/CtSymClassBinder.java`
#### Snippet
```java
    // files with a .sig extension.
    String releaseString = formatReleaseVersion(version);
    for (Zip.Entry ze : new Zip.ZipIterable(ctSym)) {
      String name = ze.name();
      if (!name.endsWith(".sig")) {
```

### IOResource
'ZipIterable' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      throws IOException {
    // TODO(cushon): don't leak file descriptors
    for (Zip.Entry ze : new Zip.ZipIterable(path)) {
      String name = ze.name();
      if (!name.endsWith(".class")) {
```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
  @Override
  public void printElements(Writer w, Element... elements) {
    PrintWriter pw = new PrintWriter(w, true);
    for (Element element : elements) {
      pw.println(element.toString());
```

### IOResource
'ZipIterable' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
    }
    for (String sourceJar : options.sourceJars()) {
      for (Zip.Entry ze : new Zip.ZipIterable(Paths.get(sourceJar))) {
        if (ze.name().endsWith(".java")) {
          String name = ze.name();
```

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
    public Set<Modifier> getModifiers() {
      return asModifierSet(ModifierOwner.METHOD, info().access());
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
    public TypeMirror asType() {
      return factory.asTypeMirror(Type.TyVar.create(sym, info().annotations()));
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
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public TypeMirror asType() {
      return factory.asTypeMirror(info().type());
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
              String superclass = classFile.get().superName();
              if (superclass == null) {
                return null;
              }
              return new ClassSymbol(superclass);
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
            public @Nullable ClassTy get() {
              if (superclass() == null) {
                return null;
              }
              if (sig.get() == null || sig.get().superClass() == null) {
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
Argument `env.getNonNull(sym).annotationMetadata()` might be null
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private @Nullable Boolean isVisible(ClassSymbol sym) {
    RetentionPolicy retention =
        requireNonNull(env.getNonNull(sym).annotationMetadata()).retention();
    switch (retention) {
      case CLASS:
```

### DataFlowIssue
Argument `inner.owner()` might be null
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
    TypeBoundClass inner = env.getNonNull(innerSym);
    // this inner class is known to have an owner
    ClassSymbol owner = requireNonNull(inner.owner());

    String innerName = innerSym.binaryName().substring(owner.binaryName().length() + 1);
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
    }
    if (hider.sym().symKind().equals(Symbol.Kind.METHOD)) {
      int access = ((TurbineExecutableElement) hider).info().access();
      if ((access & TurbineFlag.ACC_STATIC) != TurbineFlag.ACC_STATIC) {
        return false;
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
Argument `modulePath(moduleName)` might be null
in `java/com/google/turbine/binder/JimageClassBinder.java`
#### Snippet
```java
      if (moduleName != null) {
        // TODO(cushon): is this requireNonNull safe?
        Path modulePath = requireNonNull(modulePath(moduleName), moduleName);
        Path modulePackagePath = modulePath.resolve(packageName);
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(modulePackagePath)) {
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
Expression `classpath.resource(input)` might evaluate to null but is returned by the method declared as @NullMarked
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
                // Currently generated classes are not available on the classpath when compiling
                // the compilation sources (including generated sources).
                return classpath.resource(input);
              }
            },
```

### DataFlowIssue
Argument `getInfo(ty.sym()).owner()` might be null
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
    ImmutableList.Builder<ClassTy.SimpleClassTy> simples = ImmutableList.builder();
    // this inner class is known to have an owner
    ClassSymbol owner = requireNonNull(getInfo(ty.sym()).owner());
    if (owner.equals(base.sym())) {
      // if the canonical prefix is the owner the next symbol in the qualified name,
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `java/com/google/turbine/diag/TurbineError.java`
#### Snippet
```java
  @Override
  public String getMessage() {
    return diagnostics.stream().map(d -> d.diagnostic()).collect(joining(System.lineSeparator()));
  }

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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `units.keySet()` may be replaced with 'entrySet()' iteration
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
    // Output Java 8 bytecode at minimum, for type annotations
    int majorVersion = max(languageVersion.majorVersion(), 52);
    for (ClassSymbol sym : units.keySet()) {
      result.put(sym.binaryName(), lower(units.get(sym), env, sym, symbols, majorVersion));
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

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `JimageClassBinder` on 'this' is unnecessary in this context
in `java/com/google/turbine/binder/JimageClassBinder.java`
#### Snippet
```java
            ClassSymbol sym = new ClassSymbol(binaryName);
            packageClassesBySimpleName.put(packageName, sym.simpleName(), sym);
            JimageClassBinder.this.env.put(
                sym, new BytecodeBoundClass(sym, toByteArrayOrDie(path), env, path.toString()));
          }
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `requiresJavaBase |= require.moduleName().equals(ModuleSymbol.JAVA_BASE.name())`
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
          {
            ModRequires require = (ModRequires) directive;
            requiresJavaBase |= require.moduleName().equals(ModuleSymbol.JAVA_BASE.name());
            requires.add(bindRequires(require));
            break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `asBoolean(position, a).value() & asBoolean(position, b).value()`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      case BOOLEAN:
        return new Const.BooleanValue(
            asBoolean(position, a).value() & asBoolean(position, b).value());
      default:
        break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `asBoolean(position, a).value() | asBoolean(position, b).value()`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      case BOOLEAN:
        return new Const.BooleanValue(
            asBoolean(position, a).value() | asBoolean(position, b).value());
      default:
        break;
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `idx`
in `java/com/google/turbine/diag/LineMap.java`
#### Snippet
```java
          // ...and CRLF
          if (idx + 1 < source.length() && source.charAt(idx + 1) == '\n') {
            idx++;
          }
          // falls through
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TurbineOptions` has no concrete subclass
in `java/com/google/turbine/options/TurbineOptions.java`
#### Snippet
```java
/** Header compilation options. */
@AutoValue
public abstract class TurbineOptions {

  /**
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `java/com/google/turbine/options/TurbineOptions.java`
#### Snippet
```java
  /** A {@link Builder} for {@link TurbineOptions}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setOutput(String output);

```

### AbstractClassNeverImplemented
Abstract class `TyVar` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** A type variable. */
  @AutoValue
  abstract class TyVar implements Type {

    public static TyVar create(TyVarSymbol sym, ImmutableList<AnnoInfo> annos) {
```

### AbstractClassNeverImplemented
Abstract class `IntersectionTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** An intersection type. */
  @AutoValue
  abstract class IntersectionTy implements Type {

    public abstract ImmutableList<Type> bounds();
```

### AbstractClassNeverImplemented
Abstract class `WildUnboundedTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** An unbounded wildcard type. */
  @AutoValue
  abstract class WildUnboundedTy extends WildTy {

    public static WildUnboundedTy create(ImmutableList<AnnoInfo> annotations) {
```

### AbstractClassNeverImplemented
Abstract class `PrimTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** A primitive type. */
  @AutoValue
  abstract class PrimTy implements Type {

    public static PrimTy create(TurbineConstantTypeKind tykind, ImmutableList<AnnoInfo> annos) {
```

### AbstractClassNeverImplemented
Abstract class `MethodTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** A method type. */
  @AutoValue
  abstract class MethodTy implements Type {

    public abstract ImmutableSet<TyVarSymbol> tyParams();
```

### AbstractClassNeverImplemented
Abstract class `WildTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

  /** A wildcard type, valid only inside (possibly nested) type arguments. */
  abstract class WildTy implements Type {

    public enum BoundKind {
```

### AbstractClassNeverImplemented
Abstract class `WildLowerBoundedTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** An lower-bounded wildcard type. */
  @AutoValue
  abstract class WildLowerBoundedTy extends WildTy {

    public static WildLowerBoundedTy create(Type bound, ImmutableList<AnnoInfo> annotations) {
```

### AbstractClassNeverImplemented
Abstract class `ClassTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
   */
  @AutoValue
  abstract class ClassTy implements Type {

    /**
```

### AbstractClassNeverImplemented
Abstract class `SimpleClassTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
    /** One element of a qualified {@link ClassTy}. */
    @AutoValue
    public abstract static class SimpleClassTy {

      public static SimpleClassTy create(
```

### AbstractClassNeverImplemented
Abstract class `WildUpperBoundedTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** An upper-bounded wildcard type. */
  @AutoValue
  abstract class WildUpperBoundedTy extends WildTy {

    public static WildUpperBoundedTy create(Type bound, ImmutableList<AnnoInfo> annotations) {
```

### AbstractClassNeverImplemented
Abstract class `ArrayTy` has no concrete subclass
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
  /** An array type. */
  @AutoValue
  abstract class ArrayTy implements Type {

    public static ArrayTy create(Type elem, ImmutableList<AnnoInfo> annos) {
```

### AbstractClassNeverImplemented
Abstract class `Result` has no concrete subclass
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
  /** The result of a turbine invocation. */
  @AutoValue
  public abstract static class Result {
    /** Returns {@code true} if transitive classpath fallback occurred. */
    public abstract boolean transitiveClasspathFallback();
```

### AbstractClassNeverImplemented
Abstract class `LanguageVersion` has no concrete subclass
in `java/com/google/turbine/options/LanguageVersion.java`
#### Snippet
```java
 */
@AutoValue
public abstract class LanguageVersion {

  /** The source version. */
```

### AbstractClassNeverImplemented
Abstract class `SupportedAnnotationTypes` has no concrete subclass
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java

  @AutoValue
  abstract static class SupportedAnnotationTypes {

    abstract boolean everything();
```

### AbstractClassNeverImplemented
Abstract class `ProcessorInfo` has no concrete subclass
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
  /** Information about any annotation processing performed by this compilation. */
  @AutoValue
  public abstract static class ProcessorInfo {

    abstract ImmutableList<Processor> processors();
```

### AbstractClassNeverImplemented
Abstract class `Statistics` has no concrete subclass
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  /** Statistics about annotation processing. */
  @AutoValue
  public abstract static class Statistics {

    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SavedToken`
in `java/com/google/turbine/parse/IteratorLexer.java`
#### Snippet
```java
  private SavedToken curr;

  public IteratorLexer(SourceFile source, Iterator<SavedToken> it) {
    this.source = source;
    this.it = it;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/types/Deannotate.java`
#### Snippet
```java
  }

  private static ImmutableList<Type> deannotate(ImmutableList<Type> types) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/lookup/SimpleTopLevelIndex.java`
#### Snippet
```java

  /** Creates an index over the given symbols. */
  public static TopLevelIndex of(Iterable<ClassSymbol> syms) {
    Builder builder = builder();
    for (ClassSymbol sym : syms) {
```

### BoundedWildcard
Can generalize to `? extends Tree.Ident`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
  }

  private static ClassTy asClassTy(int pos, ImmutableList<Tree.Ident> names) {
    ClassTy cty = null;
    for (Tree.Ident bit : names) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `java/com/google/turbine/binder/lookup/MemberImportIndex.java`
#### Snippet
```java
    private final Iterator<Supplier<ClassSymbol>> it;

    public WildcardSymbols(Iterator<Supplier<ClassSymbol>> it) {
      this.it = it;
    }
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `java/com/google/turbine/binder/lookup/WildImportIndex.java`
#### Snippet
```java
  private final ImmutableList<Supplier<ImportScope>> packages;

  public WildImportIndex(ImmutableList<Supplier<ImportScope>> packages) {
    this.packages = packages;
  }
```

### BoundedWildcard
Can generalize to `? extends ImportDecl`
in `java/com/google/turbine/binder/lookup/WildImportIndex.java`
#### Snippet
```java
      CanonicalSymbolResolver importResolver,
      final TopLevelIndex cpi,
      ImmutableList<ImportDecl> imports) {
    ImmutableList.Builder<Supplier<@Nullable ImportScope>> packageScopes = ImmutableList.builder();
    for (final ImportDecl i : imports) {
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/processing/TurbineRoundEnvironment.java`
#### Snippet
```java
  public TurbineRoundEnvironment(
      ModelFactory factory,
      ImmutableSet<ClassSymbol> syms,
      boolean processingOver,
      boolean errorRaised,
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/processing/TurbineRoundEnvironment.java`
#### Snippet
```java
      boolean processingOver,
      boolean errorRaised,
      ImmutableSetMultimap<ClassSymbol, Symbol> allAnnotations) {
    this.factory = factory;
    this.syms = syms;
```

### BoundedWildcard
Can generalize to `? extends Symbol`
in `java/com/google/turbine/processing/TurbineRoundEnvironment.java`
#### Snippet
```java
      boolean processingOver,
      boolean errorRaised,
      ImmutableSetMultimap<ClassSymbol, Symbol> allAnnotations) {
    this.factory = factory;
    this.syms = syms;
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `java/com/google/turbine/binder/lookup/ImportIndex.java`
#### Snippet
```java
  private final Map<String, Supplier<ImportScope>> thunks;

  public ImportIndex(TurbineLogWithSource log, ImmutableMap<String, Supplier<ImportScope>> thunks) {
    this.thunks = thunks;
  }
```

### BoundedWildcard
Can generalize to `? extends ImportDecl`
in `java/com/google/turbine/binder/lookup/ImportIndex.java`
#### Snippet
```java
      CanonicalSymbolResolver resolve,
      final TopLevelIndex cpi,
      ImmutableList<ImportDecl> imports) {
    Map<String, Supplier<@Nullable ImportScope>> thunks = new HashMap<>();
    for (final Tree.ImportDecl i : imports) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/processing/ClassHierarchy.java`
#### Snippet
```java
  private Env<ClassSymbol, ? extends TypeBoundClass> env;

  ClassHierarchy(Env<ClassSymbol, ? extends TypeBoundClass> env) {
    this.env = env;
  }
```

### BoundedWildcard
Can generalize to `? super SourceBoundClass`
in `java/com/google/turbine/binder/CompUnitPreprocessor.java`
#### Snippet
```java
  private static ImmutableMap<String, ClassSymbol> preprocessChildren(
      SourceFile source,
      ImmutableList.Builder<SourceBoundClass> types,
      ClassSymbol owner,
      ImmutableList<Tree> members,
```

### BoundedWildcard
Can generalize to `? extends Tree`
in `java/com/google/turbine/binder/CompUnitPreprocessor.java`
#### Snippet
```java
      ImmutableList.Builder<SourceBoundClass> types,
      ClassSymbol owner,
      ImmutableList<Tree> members,
      int enclosing) {
    ImmutableMap.Builder<String, ClassSymbol> result = ImmutableMap.builder();
```

### BoundedWildcard
Can generalize to `? extends CompUnit`
in `java/com/google/turbine/binder/CompUnitPreprocessor.java`
#### Snippet
```java
  }

  public static ImmutableList<PreprocessedCompUnit> preprocess(List<CompUnit> units) {
    ImmutableList.Builder<PreprocessedCompUnit> result = ImmutableList.builder();
    for (CompUnit unit : units) {
```

### BoundedWildcard
Can generalize to `? extends Anno`
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  }

  private void printAnnos(ImmutableList<Anno> annos) {
    for (Tree.Anno anno : annos) {
      anno.accept(this, null);
```

### BoundedWildcard
Can generalize to `? extends Completer`
in `java/com/google/turbine/binder/env/LazyEnv.java`
#### Snippet
```java
  private final Env<S, T> rec;

  public LazyEnv(ImmutableMap<S, Completer<S, T, V>> completers, Env<S, ? extends T> base) {
    this.completers = completers;
    this.rec = CompoundEnv.<S, T>of(base).append(this);
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java

  static @Nullable AnnotationMetadata bindAnnotationMetadata(
      TurbineTyKind kind, Iterable<AnnoInfo> annotations) {
    if (kind != TurbineTyKind.ANNOTATION) {
      return null;
```

### BoundedWildcard
Can generalize to `? super TurbineElementType`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java

  private static void bindTargetElement(
      ImmutableSet.Builder<TurbineElementType> target, EnumConstantValue enumVal) {
    if (enumVal.sym().owner().binaryName().equals("java/lang/annotation/ElementType")) {
      target.add(TurbineElementType.valueOf(enumVal.sym().name()));
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java

  private ImmutableList<RecordComponentInfo> bindRecordComponents(
      ImmutableList<RecordComponentInfo> components) {
    ImmutableList.Builder<RecordComponentInfo> result = ImmutableList.builder();
    for (RecordComponentInfo base : components) {
```

### BoundedWildcard
Can generalize to `? extends MethodInfo`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
  }

  private ImmutableList<MethodInfo> bindMethods(ImmutableList<MethodInfo> methods) {
    ImmutableList.Builder<MethodInfo> result = ImmutableList.builder();
    for (MethodInfo f : methods) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
  }

  private ImmutableList<Type> bindTypes(ImmutableList<Type> types) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type t : types) {
```

### BoundedWildcard
Can generalize to `? extends FieldInfo`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
  }

  private ImmutableList<TypeBoundClass.FieldInfo> fields(ImmutableList<FieldInfo> fields) {
    ImmutableList.Builder<TypeBoundClass.FieldInfo> result = ImmutableList.builder();
    for (TypeBoundClass.FieldInfo base : fields) {
```

### BoundedWildcard
Can generalize to `? extends ParamInfo`
in `java/com/google/turbine/binder/ConstBinder.java`
#### Snippet
```java
  }

  private ImmutableList<ParamInfo> bindParameters(ImmutableList<ParamInfo> formals) {
    ImmutableList.Builder<ParamInfo> result = ImmutableList.builder();
    for (ParamInfo base : formals) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    }

    private void addAnnotationFromSuper(Map<ClassSymbol, AnnotationMirror> result, AnnoInfo anno) {
      if (!isAnnotationInherited(anno.sym())) {
        return;
```

### BoundedWildcard
Can generalize to `? super AnnotationMirror`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    }

    private void addAnnotationFromSuper(Map<ClassSymbol, AnnotationMirror> result, AnnoInfo anno) {
      if (!isAnnotationInherited(anno.sym())) {
        return;
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
  }

  static AnnoInfo getAnnotation(Iterable<AnnoInfo> annos, ClassSymbol sym) {
    for (AnnoInfo anno : annos) {
      if (Objects.equals(anno.sym(), sym)) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
   */
  private static Function<String, TyVarSymbol> makeScope(
      final Env<ClassSymbol, BytecodeBoundClass> env,
      final ClassSymbol sym,
      final Map<String, TyVarSymbol> typeVariables) {
```

### BoundedWildcard
Can generalize to `? extends BytecodeBoundClass`
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
   */
  private static Function<String, TyVarSymbol> makeScope(
      final Env<ClassSymbol, BytecodeBoundClass> env,
      final ClassSymbol sym,
      final Map<String, TyVarSymbol> typeVariables) {
```

### BoundedWildcard
Can generalize to `? extends TyVarSymbol`
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
      final Env<ClassSymbol, BytecodeBoundClass> env,
      final ClassSymbol sym,
      final Map<String, TyVarSymbol> typeVariables) {
    return new Function<String, TyVarSymbol>() {
      @Override
```

### BoundedWildcard
Can generalize to `? super TurbineElementType`
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java

  private static void bindTargetElement(
      ImmutableSet.Builder<TurbineElementType> target, EnumConstValue enumVal) {
    if (enumVal.typeName().equals("Ljava/lang/annotation/ElementType;")) {
      target.add(TurbineElementType.valueOf(enumVal.constName()));
```

### BoundedWildcard
Can generalize to `? super ModuleSymbol`
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
      PackageSourceBoundModule module,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Env<ModuleSymbol, ModuleInfo> moduleEnv,
      Optional<String> moduleVersion,
      TurbineLogWithSource log) {
```

### BoundedWildcard
Can generalize to `? extends ModuleInfo`
in `java/com/google/turbine/binder/ModuleBinder.java`
#### Snippet
```java
      PackageSourceBoundModule module,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Env<ModuleSymbol, ModuleInfo> moduleEnv,
      Optional<String> moduleVersion,
      TurbineLogWithSource log) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java

  private boolean needsMethodSig(
      ClassSymbol sym, Env<ClassSymbol, TypeBoundClass> env, TypeBoundClass.MethodInfo m) {
    if ((env.getNonNull(sym).access() & TurbineFlag.ACC_ENUM) == TurbineFlag.ACC_ENUM
        && m.name().equals("<init>")) {
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java

  private boolean needsMethodSig(
      ClassSymbol sym, Env<ClassSymbol, TypeBoundClass> env, TypeBoundClass.MethodInfo m) {
    if ((env.getNonNull(sym).access() & TurbineFlag.ACC_ENUM) == TurbineFlag.ACC_ENUM
        && m.name().equals("<init>")) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/LowerSignature.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java

  private static @Nullable FieldInfo resolveField(
      Env<ClassSymbol, TypeBoundClass> env,
      @Nullable ClassSymbol origin,
      ClassSymbol sym,
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java

  private static @Nullable FieldInfo resolveField(
      Env<ClassSymbol, TypeBoundClass> env,
      @Nullable ClassSymbol origin,
      ClassSymbol sym,
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
      ClassSymbol sym,
      Tree.Ident name,
      Set<ClassSymbol> seen) {
    if (!seen.add(sym)) {
      // Optimize multiple-interface-inheritance, and don't get stuck in cycles.
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
    private final CompoundEnv<ClassSymbol, BoundClass> env;

    public CanonicalResolver(String packagename, CompoundEnv<ClassSymbol, BoundClass> env) {
      this.packagename = packagename;
      this.env = env;
```

### BoundedWildcard
Can generalize to `? extends BoundClass`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
    private final CompoundEnv<ClassSymbol, BoundClass> env;

    public CanonicalResolver(String packagename, CompoundEnv<ClassSymbol, BoundClass> env) {
      this.packagename = packagename;
      this.env = env;
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java

  private static @Nullable ClassSymbol resolve(
      Env<ClassSymbol, ? extends HeaderBoundClass> env,
      @Nullable ClassSymbol origin,
      ClassSymbol sym,
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Resolve.java`
#### Snippet
```java
      ClassSymbol sym,
      Tree.Ident simpleName,
      Set<ClassSymbol> seen) {
    ClassSymbol result;
    if (!seen.add(sym)) {
```

### BoundedWildcard
Can generalize to `? extends ClassTy`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  private Type bindClassTyRest(
      CompoundScope scope,
      ArrayList<ClassTy> flat,
      ImmutableList<Tree.Ident> bits,
      LookupResult result,
```

### BoundedWildcard
Can generalize to `? extends Tree`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  private List<MethodInfo> bindMethods(
      CompoundScope scope,
      ImmutableList<Tree> members,
      ImmutableList<RecordComponentInfo> components) {
    List<MethodInfo> methods = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Tree`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  }

  private ImmutableList<FieldInfo> bindFields(CompoundScope scope, ImmutableList<Tree> members) {
    Set<FieldSymbol> seen = new HashSet<>();
    ImmutableList.Builder<FieldInfo> fields = ImmutableList.builder();
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private boolean isPrimaryConstructor(
      MethodInfo m, ImmutableList<RecordComponentInfo> components) {
    if (m.parameters().size() != components.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Tree.Anno`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private ImmutableList<AnnoInfo> bindAnnotations(
      CompoundScope scope, ImmutableList<Tree.Anno> trees) {
    ImmutableList.Builder<AnnoInfo> result = ImmutableList.builder();
    for (Tree.Anno tree : trees) {
```

### BoundedWildcard
Can generalize to `? extends Tree.VarDecl`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private ImmutableList<RecordComponentInfo> bindComponents(
      CompoundScope scope, ImmutableList<Tree.VarDecl> components) {
    ImmutableList.Builder<RecordComponentInfo> result = ImmutableList.builder();
    for (Tree.VarDecl p : components) {
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private MethodInfo bindMethod(
      int idx, CompoundScope scope, MethDecl t, ImmutableList<RecordComponentInfo> components) {

    MethodSymbol sym = new MethodSymbol(idx, owner, t.name().value());
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

  private MethodInfo defaultRecordConstructor(
      SyntheticMethods syntheticMethods, ImmutableList<RecordComponentInfo> components) {
    MethodSymbol symbol = syntheticMethods.create(owner, "<init>");
    ImmutableList.Builder<ParamInfo> params = ImmutableList.builder();
```

### BoundedWildcard
Can generalize to `? extends MethodInfo`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
      SyntheticMethods syntheticMethods,
      ImmutableList<RecordComponentInfo> components,
      List<MethodInfo> boundMethods) {
    List<MethodInfo> boundConstructors = new ArrayList<>();
    List<MethodInfo> boundNonConstructors = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends HeaderBoundClass`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
    private final Env<ClassSymbol, HeaderBoundClass> env;

    public ClassMemberScope(ClassSymbol sym, Env<ClassSymbol, HeaderBoundClass> env) {
      this.sym = sym;
      this.env = env;
```

### BoundedWildcard
Can generalize to `? extends Tree.Type`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  }

  private ImmutableList<Type> bindTyArgs(CompoundScope scope, ImmutableList<Tree.Type> targs) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Tree.Type ty : targs) {
```

### BoundedWildcard
Can generalize to `? extends Tree.TyParam`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  /** Bind type parameter types. */
  private ImmutableMap<TyVarSymbol, TyVarInfo> bindTyParams(
      ImmutableList<Tree.TyParam> trees, CompoundScope scope, Map<String, TyVarSymbol> symbols) {
    LinkedHashMap<TyVarSymbol, TyVarInfo> result = new LinkedHashMap<>();
    for (Tree.TyParam tree : trees) {
```

### BoundedWildcard
Can generalize to `? extends TyVarSymbol`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
  /** Bind type parameter types. */
  private ImmutableMap<TyVarSymbol, TyVarInfo> bindTyParams(
      ImmutableList<Tree.TyParam> trees, CompoundScope scope, Map<String, TyVarSymbol> symbols) {
    LinkedHashMap<TyVarSymbol, TyVarInfo> result = new LinkedHashMap<>();
    for (Tree.TyParam tree : trees) {
```

### BoundedWildcard
Can generalize to `? extends SimpleClassTy`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java

  /** Returns true if any {@link SimpleClassTy} in the given iterator has type arguments. */
  private static boolean hasTyArgs(Iterator<SimpleClassTy> it) {
    while (it.hasNext()) {
      if (!it.next().targs().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
  }

  private static boolean implicitObjectBound(ModelFactory factory, ImmutableList<Type> bounds) {
    if (bounds.isEmpty()) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
  }

  private static ImmutableList<Type> deannotate(ImmutableList<Type> types) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
  private static void bindJar(
      Path path,
      Map<ClassSymbol, BytecodeBoundClass> env,
      Map<ModuleSymbol, ModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> benv,
```

### BoundedWildcard
Can generalize to `? super BytecodeBoundClass`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
  private static void bindJar(
      Path path,
      Map<ClassSymbol, BytecodeBoundClass> env,
      Map<ModuleSymbol, ModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> benv,
```

### BoundedWildcard
Can generalize to `? super ModuleSymbol`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      Path path,
      Map<ClassSymbol, BytecodeBoundClass> env,
      Map<ModuleSymbol, ModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> benv,
      Map<ClassSymbol, BytecodeBoundClass> transitive,
```

### BoundedWildcard
Can generalize to `? super ModuleInfo`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      Path path,
      Map<ClassSymbol, BytecodeBoundClass> env,
      Map<ModuleSymbol, ModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> benv,
      Map<ClassSymbol, BytecodeBoundClass> transitive,
```

### BoundedWildcard
Can generalize to `? super BytecodeBoundClass`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      Map<ModuleSymbol, ModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> benv,
      Map<ClassSymbol, BytecodeBoundClass> transitive,
      Map<String, Supplier<byte[]>> resources)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      Env<ClassSymbol, BytecodeBoundClass> benv,
      Map<ClassSymbol, BytecodeBoundClass> transitive,
      Map<String, Supplier<byte[]>> resources)
      throws IOException {
    // TODO(cushon): don't leak file descriptors
```

### BoundedWildcard
Can generalize to `? super Supplier`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
      Env<ClassSymbol, BytecodeBoundClass> benv,
      Map<ClassSymbol, BytecodeBoundClass> transitive,
      Map<String, Supplier<byte[]>> resources)
      throws IOException {
    // TODO(cushon): don't leak file descriptors
```

### BoundedWildcard
Can generalize to `? extends Path`
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java

  /** Creates an environment containing symbols in the given classpath. */
  public static ClassPath bindClasspath(Collection<Path> paths) throws IOException {
    // TODO(cushon): this is going to require an env eventually,
    // e.g. to look up type parameters in enclosing declarations
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
      ClassSymbol sym,
      int pos,
      ImmutableList<RecordComponentInfo> components) {
    ImmutableList.Builder<RecordComponentInfo> result = ImmutableList.builder();
    for (RecordComponentInfo component : components) {
```

### BoundedWildcard
Can generalize to `? extends MethodInfo`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol sym,
      ImmutableList<MethodInfo> methods) {
    ImmutableList.Builder<MethodInfo> result = ImmutableList.builder();
    for (MethodInfo base : methods) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol sym,
      ImmutableList<Type> types) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? extends FieldInfo`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
      Env<ClassSymbol, TypeBoundClass> env,
      ClassSymbol sym,
      ImmutableList<FieldInfo> fields) {
    ImmutableList.Builder<FieldInfo> result = ImmutableList.builder();
    for (FieldInfo base : fields) {
```

### BoundedWildcard
Can generalize to `? extends ParamInfo`
in `java/com/google/turbine/binder/CanonicalTypeBinder.java`
#### Snippet
```java
      ClassSymbol sym,
      int pos,
      ImmutableList<ParamInfo> parameters) {
    ImmutableList.Builder<ParamInfo> result = ImmutableList.builder();
    for (ParamInfo parameter : parameters) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
   */
  public static ImmutableList<AnnoInfo> groupRepeated(
      Env<ClassSymbol, TypeBoundClass> env, ImmutableList<AnnoInfo> annotations) {
    Multimap<ClassSymbol, AnnoInfo> repeated =
        MultimapBuilder.linkedHashKeys().arrayListValues().build();
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
   */
  public static ImmutableList<AnnoInfo> groupRepeated(
      Env<ClassSymbol, TypeBoundClass> env, ImmutableList<AnnoInfo> annotations) {
    Multimap<ClassSymbol, AnnoInfo> repeated =
        MultimapBuilder.linkedHashKeys().arrayListValues().build();
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
   */
  public static ImmutableList<AnnoInfo> groupRepeated(
      Env<ClassSymbol, TypeBoundClass> env, ImmutableList<AnnoInfo> annotations) {
    Multimap<ClassSymbol, AnnoInfo> repeated =
        MultimapBuilder.linkedHashKeys().arrayListValues().build();
```

### BoundedWildcard
Can generalize to `? extends FieldInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableList<FieldInfo> bindFields(
      Env<ClassSymbol, TypeBoundClass> env, ImmutableList<FieldInfo> fields) {
    ImmutableList.Builder<FieldInfo> result = ImmutableList.builder();
    for (FieldInfo field : fields) {
```

### BoundedWildcard
Can generalize to `? extends ParamInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
  private static ImmutableList<ParamInfo> bindParameters(
      Env<ClassSymbol, TypeBoundClass> env,
      ImmutableList<ParamInfo> params,
      TurbineElementType declarationTarget) {
    ImmutableList.Builder<ParamInfo> result = ImmutableList.builder();
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableList<AnnoInfo> appendAnnotations(
      ImmutableList<AnnoInfo> annos, ImmutableList<AnnoInfo> extra) {
    return ImmutableList.<AnnoInfo>builder().addAll(annos).addAll(extra).build();
  }
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableList<AnnoInfo> appendAnnotations(
      ImmutableList<AnnoInfo> annos, ImmutableList<AnnoInfo> extra) {
    return ImmutableList.<AnnoInfo>builder().addAll(annos).addAll(extra).build();
  }
```

### BoundedWildcard
Can generalize to `? extends MethodInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableList<MethodInfo> bindMethods(
      Env<ClassSymbol, TypeBoundClass> env, ImmutableList<MethodInfo> fields) {
    ImmutableList.Builder<MethodInfo> result = ImmutableList.builder();
    for (MethodInfo field : fields) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableSet<TurbineElementType> getTarget(
      Env<ClassSymbol, TypeBoundClass> env, AnnoInfo anno) {
    ClassSymbol sym = anno.sym();
    if (sym == null) {
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java

  private static ImmutableSet<TurbineElementType> getTarget(
      Env<ClassSymbol, TypeBoundClass> env, AnnoInfo anno) {
    ClassSymbol sym = anno.sym();
    if (sym == null) {
```

### BoundedWildcard
Can generalize to `? extends RecordComponentInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
  private static ImmutableList<RecordComponentInfo> bindComponents(
      Env<ClassSymbol, TypeBoundClass> env,
      ImmutableList<RecordComponentInfo> components,
      TurbineElementType declarationTarget) {
    ImmutableList.Builder<RecordComponentInfo> result = ImmutableList.builder();
```

### BoundedWildcard
Can generalize to `? super AnnoInfo`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
      Type type,
      ImmutableList<AnnoInfo> annotations,
      ImmutableList.Builder<AnnoInfo> declarationAnnotations) {
    // desugar @Repeatable annotations before disambiguating: annotation containers may target
    // a subset of the types targeted by their element annotation
```

### BoundedWildcard
Can generalize to `? super ClassFile.AnnotationInfo`
in `java/com/google/turbine/bytecode/ClassReader.java`
#### Snippet
```java
   */
  private void readAnnotations(
      ImmutableList.Builder<ClassFile.AnnotationInfo> annotations,
      ConstantPoolReader constantPool) {
    int unusedLength = reader.u4();
```

### BoundedWildcard
Can generalize to `? super ParameterInfo`
in `java/com/google/turbine/bytecode/ClassReader.java`
#### Snippet
```java
  /** Processes a JVMS 4.7.24 MethodParameters attribute. */
  private void readMethodParameters(
      ImmutableList.Builder<ParameterInfo> parameters, ConstantPoolReader constantPool) {
    int unusedLength = reader.u4();
    int numParameters = reader.u1();
```

### BoundedWildcard
Can generalize to `? super S`
in `java/com/google/turbine/binder/env/CompoundEnv.java`
#### Snippet
```java
  private final Env<S, ? extends V> env;

  private CompoundEnv(@Nullable Env<S, ? extends V> base, Env<S, ? extends V> env) {
    this.base = base;
    this.env = requireNonNull(env);
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/processing/TurbineFiler.java`
#### Snippet
```java

  public TurbineFiler(
      Set<String> seen, Function<String, Supplier<byte[]>> classPath, ClassLoader loader) {
    this.seen = seen;
    this.classPath = classPath;
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/processing/TurbineFiler.java`
#### Snippet
```java

  public TurbineFiler(
      Set<String> seen, Function<String, Supplier<byte[]>> classPath, ClassLoader loader) {
    this.seen = seen;
    this.classPath = classPath;
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `java/com/google/turbine/processing/TurbineFiler.java`
#### Snippet
```java

  public TurbineFiler(
      Set<String> seen, Function<String, Supplier<byte[]>> classPath, ClassLoader loader) {
    this.seen = seen;
    this.classPath = classPath;
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  }

  private ImmutableList<AnnotationInfo> lowerAnnotations(ImmutableList<AnnoInfo> annotations) {
    ImmutableList.Builder<AnnotationInfo> lowered = ImmutableList.builder();
    for (AnnoInfo annotation : annotations) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  }

  private byte[] lower(SourceModuleInfo module, Set<ClassSymbol> symbols, int majorVersion) {
    String name = "module-info";
    ImmutableList<AnnotationInfo> annotations = lowerAnnotations(module.annos());
```

### BoundedWildcard
Can generalize to `? extends TyVarInfo`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java

    /** @param tyParams the initial lookup scope, e.g. a method's formal type parameters. */
    public TyVarEnv(Map<TyVarSymbol, TyVarInfo> tyParams) {
      this.tyParams = tyParams;
    }
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
   */
  private ClassFile.InnerClass innerClass(
      Env<ClassSymbol, TypeBoundClass> env, ClassSymbol innerSym) {
    TypeBoundClass inner = env.getNonNull(innerSym);
    // this inner class is known to have an owner
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
   */
  private ClassFile.InnerClass innerClass(
      Env<ClassSymbol, TypeBoundClass> env, ClassSymbol innerSym) {
    TypeBoundClass inner = env.getNonNull(innerSym);
    // this inner class is known to have an owner
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java

  private byte[] lower(
      SourceTypeBoundClass info, ClassSymbol sym, Set<ClassSymbol> symbols, int majorVersion) {
    int access = classAccess(info);
    String name = sig.descriptor(sym);
```

### BoundedWildcard
Can generalize to `? extends SourceTypeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  public static Lowered lowerAll(
      LanguageVersion languageVersion,
      ImmutableMap<ClassSymbol, SourceTypeBoundClass> units,
      ImmutableList<SourceModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> classpath) {
```

### BoundedWildcard
Can generalize to `? extends SourceModuleInfo`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      LanguageVersion languageVersion,
      ImmutableMap<ClassSymbol, SourceTypeBoundClass> units,
      ImmutableList<SourceModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> classpath) {
    CompoundEnv<ClassSymbol, TypeBoundClass> env =
```

### BoundedWildcard
Can generalize to `? extends BytecodeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      ImmutableMap<ClassSymbol, SourceTypeBoundClass> units,
      ImmutableList<SourceModuleInfo> modules,
      Env<ClassSymbol, BytecodeBoundClass> classpath) {
    CompoundEnv<ClassSymbol, TypeBoundClass> env =
        CompoundEnv.<ClassSymbol, TypeBoundClass>of(classpath).append(new SimpleEnv<>(units));
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private void addEnclosing(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> all,
      ClassSymbol sym) {
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private void addEnclosing(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> all,
      ClassSymbol sym) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> all,
      ClassSymbol sym) {
    TypeBoundClass info = env.get(sym);
```

### BoundedWildcard
Can generalize to `? extends TyVarInfo`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private void typeParameterAnnotations(
      ImmutableList.Builder<TypeAnnotationInfo> result,
      Iterable<TyVarInfo> typeParameters,
      TargetType targetType,
      TargetType boundTargetType) {
```

### BoundedWildcard
Can generalize to `? super TypeAnnotationInfo`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java

    public LowerTypeAnnotations(
        ImmutableList.Builder<TypeAnnotationInfo> result, TargetType targetType, Target target) {
      this.result = result;
      this.targetType = targetType;
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private static void addNestMembers(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> nestMembers,
      ClassSymbol sym) {
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
  private static void addNestMembers(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> nestMembers,
      ClassSymbol sym) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> nestMembers,
      ClassSymbol sym) {
    if (!nestMembers.add(sym)) {
```

### BoundedWildcard
Can generalize to `? extends Attribute`
in `java/com/google/turbine/bytecode/ClassWriter.java`
#### Snippet
```java

  private static void writeAttributes(
      ConstantPool pool, ByteArrayDataOutput body, List<Attribute> attributes) {
    body.writeShort(attributes.size());
    for (Attribute attribute : attributes) {
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      ClassSymbol s,
      PackageSymbol from,
      Multimap<String, TurbineExecutableElement> methods,
      TurbineExecutableElement m) {
    if (m.sym().owner().equals(s)) {
```

### BoundedWildcard
Can generalize to `? extends TurbineExecutableElement`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
      ClassSymbol s,
      PackageSymbol from,
      Multimap<String, TurbineExecutableElement> methods,
      TurbineExecutableElement m) {
    if (m.sym().owner().equals(s)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/binder/JimageClassBinder.java`
#### Snippet
```java
  private final Map<ClassSymbol, BytecodeBoundClass> env = new HashMap<>();

  public JimageClassBinder(ImmutableMultimap<String, String> packageMap, Path modules) {
    this.packageMap = packageMap;
    this.modulesRoot = modules;
```

### BoundedWildcard
Can generalize to `? super Attribute`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java

  private static void addAllTypeAnnotations(
      List<Attribute> attributes, ImmutableList<TypeAnnotationInfo> annotations) {
    List<TypeAnnotationInfo> visible = new ArrayList<>();
    List<TypeAnnotationInfo> invisible = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends TypeAnnotationInfo`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java

  private static void addAllTypeAnnotations(
      List<Attribute> attributes, ImmutableList<TypeAnnotationInfo> annotations) {
    List<TypeAnnotationInfo> visible = new ArrayList<>();
    List<TypeAnnotationInfo> invisible = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Attribute`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java

  static void addParameterAnnotations(
      List<Attribute> attributes, ImmutableList<ImmutableList<AnnotationInfo>> annotations) {
    List<List<AnnotationInfo>> visibles = new ArrayList<>();
    List<List<AnnotationInfo>> invisibles = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java

  static void addParameterAnnotations(
      List<Attribute> attributes, ImmutableList<ImmutableList<AnnotationInfo>> annotations) {
    List<List<AnnotationInfo>> visibles = new ArrayList<>();
    List<List<AnnotationInfo>> invisibles = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Attribute`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
  }

  static void addAllAnnotations(List<Attribute> attributes, List<AnnotationInfo> annotations) {
    List<AnnotationInfo> visible = new ArrayList<>();
    List<AnnotationInfo> invisible = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends AnnotationInfo`
in `java/com/google/turbine/bytecode/LowerAttributes.java`
#### Snippet
```java
  }

  static void addAllAnnotations(List<Attribute> attributes, List<AnnotationInfo> annotations) {
    List<AnnotationInfo> visible = new ArrayList<>();
    List<AnnotationInfo> invisible = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
   * future, e.g. as additional types are generated.
   */
  <T> Supplier<T> memoize(Supplier<T> s) {
    return new Supplier<T>() {
      T v;
```

### BoundedWildcard
Can generalize to `? extends AnnotationInfo`
in `java/com/google/turbine/binder/bytecode/BytecodeBinder.java`
#### Snippet
```java
  }

  static ImmutableList<AnnoInfo> bindAnnotations(List<AnnotationInfo> input) {
    ImmutableList.Builder<AnnoInfo> result = ImmutableList.builder();
    for (AnnotationInfo annotation : input) {
```

### BoundedWildcard
Can generalize to `? super String`
in `java/com/google/turbine/processing/TurbineProcessingEnvironment.java`
#### Snippet
```java
      SourceVersion sourceVersion,
      @Nullable ClassLoader processorLoader,
      Map<String, byte[]> statistics) {
    this.filer = filer;
    this.types = types;
```

### BoundedWildcard
Can generalize to `? extends Tree.Ident`
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
    }

    public static ErrorTy create(Iterable<Tree.Ident> names) {
      List<String> bits = new ArrayList<>();
      for (Tree.Ident ident : names) {
```

### BoundedWildcard
Can generalize to `? extends SimpleClassTy`
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java
    }

    private static boolean hasTargs(ImmutableList<SimpleClassTy> classes, int idx) {
      for (; idx >= 0; idx--) {
        SimpleClassTy simple = classes.get(idx);
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/deps/Dependencies.java`
#### Snippet
```java

  private static void addAnnotations(
      Set<ClassSymbol> closure, ImmutableList<AnnoInfo> annotations) {
    for (AnnoInfo annoInfo : annotations) {
      addAnnotation(closure, annoInfo);
```

### BoundedWildcard
Can generalize to `? extends Ident`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
  }

  private static String flatname(char join, ImmutableList<Ident> idents) {
    StringBuilder sb = new StringBuilder();
    boolean first = true;
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
  }

  private Type extraDims(Type type, Deque<ImmutableList<Anno>> extra) {
    if (extra.isEmpty()) {
      return type;
```

### BoundedWildcard
Can generalize to `? super Anno`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
  }

  private EnumSet<TurbineModifier> modifiersAndAnnotations(ImmutableList.Builder<Anno> annos) {
    EnumSet<TurbineModifier> access = EnumSet.noneOf(TurbineModifier.class);
    while (true) {
```

### BoundedWildcard
Can generalize to `? super VarDecl`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java

  private void formalParams(
      ImmutableList.Builder<VarDecl> builder, EnumSet<TurbineModifier> access) {
    while (token != Token.RPAREN) {
      VarDecl formal = formalParam();
```

### BoundedWildcard
Can generalize to `? super TurbineModifier`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java

  private void formalParams(
      ImmutableList.Builder<VarDecl> builder, EnumSet<TurbineModifier> access) {
    while (token != Token.RPAREN) {
      VarDecl formal = formalParam();
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/deps/Transitive.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/deps/Transitive.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/deps/Transitive.java`
#### Snippet
```java

  private static void addSuperTypes(
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
```

### BoundedWildcard
Can generalize to `? extends ParamInfo`
in `java/com/google/turbine/binder/bound/TypeBoundClass.java`
#### Snippet
```java
    }

    private static ImmutableList<Type> asTypes(ImmutableList<ParamInfo> parameters) {
      ImmutableList.Builder<Type> result = ImmutableList.builder();
      for (ParamInfo param : parameters) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/types/Erasure.java`
#### Snippet
```java

  private static ImmutableList<Type> erase(
      ImmutableList<Type> types, Function<TyVarSymbol, TyVarInfo> tenv) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? super FieldSymbol`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      SourceFile source,
      Scope scope,
      Env<FieldSymbol, Value> values,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      TurbineLogWithSource log) {
```

### BoundedWildcard
Can generalize to `? extends Value`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
      SourceFile source,
      Scope scope,
      Env<FieldSymbol, Value> values,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      TurbineLogWithSource log) {
```

### BoundedWildcard
Can generalize to `? extends AnnoInfo`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  }

  ImmutableList<AnnoInfo> evaluateAnnotations(ImmutableList<AnnoInfo> annotations) {
    ImmutableList.Builder<AnnoInfo> result = ImmutableList.builder();
    for (AnnoInfo annotation : annotations) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
  // TODO(cushon): consider memoizing this (or isAnnotationInherited) if they show up in profiles
  private static ImmutableSet<ClassSymbol> inheritedAnnotations(
      Set<ClassSymbol> seen, @Nullable ClassSymbol sym, Env<ClassSymbol, TypeBoundClass> env) {
    ImmutableSet.Builder<ClassSymbol> result = ImmutableSet.builder();
    ClassSymbol curr = sym;
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
  /** Returns a map from annotations present in the compilation to the annotated elements. */
  private static ImmutableSetMultimap<ClassSymbol, Symbol> getAllAnnotations(
      Env<ClassSymbol, TypeBoundClass> env, Iterable<ClassSymbol> syms) {
    ImmutableSetMultimap.Builder<ClassSymbol, Symbol> result = ImmutableSetMultimap.builder();
    for (ClassSymbol sym : syms) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java

  private static void addAnno(
      ImmutableSetMultimap.Builder<ClassSymbol, Symbol> result, AnnoInfo annoInfo, Symbol owner) {
    ClassSymbol sym = annoInfo.sym();
    if (sym != null) {
```

### BoundedWildcard
Can generalize to `? super Symbol`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java

  private static void addAnno(
      ImmutableSetMultimap.Builder<ClassSymbol, Symbol> result, AnnoInfo annoInfo, Symbol owner) {
    ClassSymbol sym = annoInfo.sym();
    if (sym != null) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java

  private static boolean isAnnotationInherited(
      Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    TypeBoundClass annoInfo = env.get(sym);
    if (annoInfo == null) {
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java

  private static boolean isAnnotationInherited(
      Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    TypeBoundClass annoInfo = env.get(sym);
    if (annoInfo == null) {
```

### BoundedWildcard
Can generalize to `? extends CompUnit`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
  static @Nullable BindingResult process(
      TurbineLog log,
      final ImmutableList<CompUnit> initialSources,
      final ClassPath classpath,
      ProcessorInfo processorInfo,
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Canonicalize(SourceFile source, int position, Env<ClassSymbol, TypeBoundClass> env) {
    this.source = source;
    this.position = position;
```

### BoundedWildcard
Can generalize to `? extends TypeBoundClass`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Canonicalize(SourceFile source, int position, Env<ClassSymbol, TypeBoundClass> env) {
    this.source = source;
    this.position = position;
```

### BoundedWildcard
Can generalize to `? super TyVarSymbol`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java

  /** Add the type arguments of a simple class type to a type mapping. */
  private void addInstantiation(Map<TyVarSymbol, Type> mapping, ClassTy.SimpleClassTy simpleType) {
    Collection<TyVarSymbol> symbols = getInfo(simpleType.sym()).typeParameters().values();
    if (simpleType.targs().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super Type`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java

  /** Add the type arguments of a simple class type to a type mapping. */
  private void addInstantiation(Map<TyVarSymbol, Type> mapping, ClassTy.SimpleClassTy simpleType) {
    Collection<TyVarSymbol> symbols = getInfo(simpleType.sym()).typeParameters().values();
    if (simpleType.targs().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
  }

  private ImmutableList<Type> canonicalize(ImmutableList<Type> targs, ClassSymbol base) {
    ImmutableList.Builder<Type> result = ImmutableList.builder();
    for (Type a : targs) {
```

### BoundedWildcard
Can generalize to `? extends PreprocessedCompUnit`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  /** Records enclosing declarations of member classes, and group classes by compilation unit. */
  static SimpleEnv<ClassSymbol, SourceBoundClass> bindSourceBoundClasses(
      ImmutableList<PreprocessedCompUnit> units) {
    SimpleEnv.Builder<ClassSymbol, SourceBoundClass> envBuilder = SimpleEnv.builder();
    for (PreprocessedCompUnit unit : units) {
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java

  private static Env<ClassSymbol, SourceTypeBoundClass> canonicalizeTypes(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> canonicalizeTypes(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends SourceTypeBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> canonicalizeTypes(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends HeaderBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
            @Override
            public SourceHeaderBoundClass complete(
                Env<ClassSymbol, HeaderBoundClass> henv, ClassSymbol sym) {
              PackageSourceBoundClass base = psenv.getNonNull(sym);
              return HierarchyBinder.bind(log.withSource(base.source()), sym, base, henv);
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
   */
  private static Env<ClassSymbol, SourceTypeBoundClass> disambiguateTypeAnnotations(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> disambiguateTypeAnnotations(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends SourceTypeBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> disambiguateTypeAnnotations(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> stenv,
      Env<ClassSymbol, TypeBoundClass> tenv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? super ModuleSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java

  private static ImmutableList<SourceModuleInfo> bindModules(
      SimpleEnv<ModuleSymbol, PackageSourceBoundModule> modules,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      CompoundEnv<ModuleSymbol, ModuleInfo> moduleEnv,
```

### BoundedWildcard
Can generalize to `? extends PackageSourceBoundModule`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java

  private static ImmutableList<SourceModuleInfo> bindModules(
      SimpleEnv<ModuleSymbol, PackageSourceBoundModule> modules,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      CompoundEnv<ModuleSymbol, ModuleInfo> moduleEnv,
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> bindTypes(
      TurbineLog log,
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceHeaderBoundClass> shenv,
      Env<ClassSymbol, HeaderBoundClass> henv) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      TurbineLog log,
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceHeaderBoundClass> shenv,
      Env<ClassSymbol, HeaderBoundClass> henv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends SourceHeaderBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      TurbineLog log,
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceHeaderBoundClass> shenv,
      Env<ClassSymbol, HeaderBoundClass> henv) {
    SimpleEnv.Builder<ClassSymbol, SourceTypeBoundClass> builder = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceHeaderBoundClass> bindHierarchy(
      TurbineLog log,
      Iterable<ClassSymbol> syms,
      final SimpleEnv<ClassSymbol, PackageSourceBoundClass> psenv,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      TurbineLog log,
      Iterable<ClassSymbol> syms,
      final SimpleEnv<ClassSymbol, PackageSourceBoundClass> psenv,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {
    ImmutableMap.Builder<
```

### BoundedWildcard
Can generalize to `? extends PackageSourceBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      TurbineLog log,
      Iterable<ClassSymbol> syms,
      final SimpleEnv<ClassSymbol, PackageSourceBoundClass> psenv,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {
    ImmutableMap.Builder<
```

### BoundedWildcard
Can generalize to `? extends BytecodeBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      Iterable<ClassSymbol> syms,
      final SimpleEnv<ClassSymbol, PackageSourceBoundClass> psenv,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {
    ImmutableMap.Builder<
            ClassSymbol, LazyEnv.Completer<ClassSymbol, HeaderBoundClass, SourceHeaderBoundClass>>
```

### BoundedWildcard
Can generalize to `? extends SourceBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static BindPackagesResult bindPackages(
      TurbineLog log,
      Env<ClassSymbol, SourceBoundClass> ienv,
      TopLevelIndex tli,
      ImmutableList<PreprocessedCompUnit> units,
```

### BoundedWildcard
Can generalize to `? extends PreprocessedCompUnit`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      Env<ClassSymbol, SourceBoundClass> ienv,
      TopLevelIndex tli,
      ImmutableList<PreprocessedCompUnit> units,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {

```

### BoundedWildcard
Can generalize to `? extends BytecodeBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
      TopLevelIndex tli,
      ImmutableList<PreprocessedCompUnit> units,
      CompoundEnv<ClassSymbol, BytecodeBoundClass> classPathEnv) {

    SimpleEnv.Builder<ClassSymbol, PackageSourceBoundClass> env = SimpleEnv.builder();
```

### BoundedWildcard
Can generalize to `? extends ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java

  private static Env<ClassSymbol, SourceTypeBoundClass> constants(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> env,
      CompoundEnv<ClassSymbol, TypeBoundClass> baseEnv,
```

### BoundedWildcard
Can generalize to `? super ClassSymbol`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> constants(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> env,
      CompoundEnv<ClassSymbol, TypeBoundClass> baseEnv,
      TurbineLog log) {
```

### BoundedWildcard
Can generalize to `? extends SourceTypeBoundClass`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
  private static Env<ClassSymbol, SourceTypeBoundClass> constants(
      ImmutableSet<ClassSymbol> syms,
      Env<ClassSymbol, SourceTypeBoundClass> env,
      CompoundEnv<ClassSymbol, TypeBoundClass> baseEnv,
      TurbineLog log) {
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
in `java/com/google/turbine/binder/bound/SourceHeaderBoundClass.java`
#### Snippet
```java

  private final PackageSourceBoundClass base;
  private final @Nullable ClassSymbol superclass;
  private final ImmutableList<ClassSymbol> interfaces;
  private final ImmutableMap<String, TyVarSymbol> typeParameters;
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.jspecify.nullness.Nullable'
in `java/com/google/turbine/binder/lookup/SimpleTopLevelIndex.java`
#### Snippet
```java
    }

    private final @Nullable ClassSymbol sym;

    // TODO(cushon): the set of children is typically going to be small, consider optimizing this
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
  }

  public void round(CompoundEnv<ClassSymbol, TypeBoundClass> env) {
    cache.clear();
    this.env = env;
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
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
  private final Env<ClassSymbol, BytecodeBoundClass> env;
  private final Supplier<ClassFile> classFile;
  private final @Nullable String jarFile;

  public BytecodeBoundClass(
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
  }

  private boolean isInterface(Type type, Env<ClassSymbol, TypeBoundClass> env) {
    return type.tyKind() == TyKind.CLASS_TY
        && env.getNonNull(((ClassTy) type).sym()).kind() == TurbineTyKind.INTERFACE;
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
in `java/com/google/turbine/bytecode/sig/Sig.java`
#### Snippet
```java

    private final String name;
    private final @Nullable TySig classBound;
    private final ImmutableList<TySig> interfaceBounds;

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

  private final LowerSignature sig = new LowerSignature();
  private final Env<ClassSymbol, TypeBoundClass> env;

  public Lower(Env<ClassSymbol, TypeBoundClass> env) {
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
  private static byte[] lower(
      SourceModuleInfo module,
      CompoundEnv<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> symbols,
      int majorVersion) {
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
  private static void addNestMembers(
      SourceFile source,
      Env<ClassSymbol, TypeBoundClass> env,
      Set<ClassSymbol> nestMembers,
      ClassSymbol sym) {
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
public class ModelFactory {

  public Env<ClassSymbol, ? extends TypeBoundClass> env;

  private final AtomicInteger round = new AtomicInteger(0);
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
      Set<ClassSymbol> closure, Env<ClassSymbol, TypeBoundClass> env, ClassSymbol sym) {
    if (!closure.add(sym)) {
      return;
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
    private final ImmutableList<AnnoInfo> annotations;

    private final Tree.@Nullable VarDecl decl;
    private final Const.@Nullable Value value;

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
      ClassSymbol owner,
      ClassTy classTy) {
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
      private final String name;
      private final String descriptor;
      private final @Nullable String signature;
      private final ImmutableList<AnnotationInfo> annotations;
      private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
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

      private final @Nullable TypePath parent;
      private final TypePath.@Nullable Kind kind;
      private final int index;

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
    private final String descriptor;
    private final @Nullable String signature;
    private final @Nullable Value value;
    private final List<AnnotationInfo> annotations;
    private final ImmutableList<TypeAnnotationInfo> typeAnnotations;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `java/com/google/turbine/processing/TurbineAnnotationProxy.java`
#### Snippet
```java

  @SuppressWarnings("unchecked") // Enum.class
  private static Object constEnumValue(ClassLoader loader, EnumConstantValue value) {
    Class<?> clazz;
    try {
```

## RuleId[id=IgnoreResultOfCall]
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
  @Override
  public @Nullable Void visitArrTy(Tree.ArrTy arrTy, @Nullable Void input) {
    arrTy.elem().accept(this, null);
    if (!arrTy.annos().isEmpty()) {
      append(' ');
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
        append(" ").append(binary.op().toString()).append(" ");
      }
      child.accept(this, null);
      first = false;
    }
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
          append(" & ");
        }
        bound.accept(this, null);
        first = false;
      }
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

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
    return new ModuleBinder(module, env, moduleEnv, moduleVersion, log).bind();
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
      ClassPath classpath,
      ClassPath bootclasspath,
      Optional<String> moduleVersion) {
    return bind(units, classpath, Processing.ProcessorInfo.empty(), bootclasspath, moduleVersion);
  }
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
      ClassPath classpath,
      ClassPath bootclasspath,
      Optional<String> moduleVersion) {
    ImmutableList<PreprocessedCompUnit> preProcessedUnits = CompUnitPreprocessor.preprocess(units);

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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
      ok = true;
    } catch (TurbineError | UsageException e) {
      System.err.println(e.getMessage());
      ok = false;
    } catch (Throwable turbineCrash) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `java/com/google/turbine/processing/TurbineTypeMirror.java`
#### Snippet
```java

    @Override
    public int hashCode() {
      return super.hashCode();
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      case FLOAT:
        try {
          value = new Const.FloatValue(Float.parseFloat(text.replace("_", "")));
        } catch (NumberFormatException e) {
          throw error(ErrorKind.INVALID_LITERAL, text);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      case DOUBLE:
        try {
          value = new Const.DoubleValue(Double.parseDouble(text.replace("_", "")));
        } catch (NumberFormatException e) {
          throw error(ErrorKind.INVALID_LITERAL, text);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/lookup/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.lookup;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/lookup/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.lookup;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/model/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.model;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/lower/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.lower;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/bytecode/package-info.java`
#### Snippet
```java
 */

@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.bytecode;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/tree/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.tree;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/tree/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.tree;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/bytecode/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.bytecode;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/bytecode/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.bytecode;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/diag/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.diag;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/zip/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.zip;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/processing/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.processing;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `java/com/google/turbine/bytecode/ByteReader.java`
#### Snippet
```java
  }

  /** {@link #pos} is protected in {@link java.io.ByteArrayInputStream}. */
  static class IndexedByteArrayInputStream extends ByteArrayInputStream {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/env/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.env;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/env/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.env;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/sym/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.sym;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/sym/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.sym;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/common/escape/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.common.escape;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/common/escape/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.common.escape;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/bound/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.bound;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/binder/bound/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.binder.bound;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/options/package-info.java`
#### Snippet
```java
 */

@org.jspecify.nullness.NullMarked
package com.google.turbine.options;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/deps/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.deps;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/types/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.types;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/parse/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.parse;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/main/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.main;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/type/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
package com.google.turbine.type;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/bytecode/sig/package-info.java`
#### Snippet
```java
 */

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.bytecode.sig;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jspecify.nullness` is unnecessary, and can be replaced with an import
in `java/com/google/turbine/bytecode/sig/package-info.java`
#### Snippet
```java

@com.google.errorprone.annotations.CheckReturnValue
@org.jspecify.nullness.NullMarked
package com.google.turbine.bytecode.sig;

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java
      ok = false;
    } catch (Throwable turbineCrash) {
      turbineCrash.printStackTrace();
      ok = false;
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `java/com/google/turbine/bytecode/sig/SigParser.java`
#### Snippet
```java
    StringBuilder name = new StringBuilder();
    char ch;
    while ((ch = eat()) != ';') {
      name.append(ch);
    }
```

### NestedAssignment
Result of assignment expression used
in `java/com/google/turbine/bytecode/sig/SigParser.java`
#### Snippet
```java
        StringBuilder identifier = new StringBuilder();
        char ch;
        while ((ch = eat()) != ':') {
          identifier.append(ch);
        }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Expression()` of an abstract class should not be declared 'public'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
  /** An expression. */
  public abstract static class Expression extends Tree {
    public Expression(int position) {
      super(position);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Type()` of an abstract class should not be declared 'public'
in `java/com/google/turbine/tree/Tree.java`
#### Snippet
```java
    private final ImmutableList<Anno> annos;

    public Type(int position, ImmutableList<Anno> annos) {
      super(position);
      this.annos = annos;
```

### NonProtectedConstructorInAbstractClass
Constructor `ReadOnlyFileObject()` of an abstract class should not be declared 'public'
in `java/com/google/turbine/processing/TurbineFiler.java`
#### Snippet
```java
    protected final String path;

    public ReadOnlyFileObject(String path) {
      this.path = path;
    }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Supplier() can be replaced with method reference
in `java/com/google/turbine/binder/CtSymClassBinder.java`
#### Snippet
```java
  private static Supplier<byte[]> toByteArrayOrDie(Zip.Entry ze) {
    return Suppliers.memoize(
        new Supplier<byte[]>() {
          @Override
          public byte[] get() {
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
    return Erasure.erase(
        type,
        new Function<TyVarSymbol, TyVarInfo>() {
          @Override
          public TyVarInfo apply(TyVarSymbol input) {
```

### Anonymous2MethodRef
Anonymous new Supplier() can be replaced with method reference
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
  private static Supplier<byte[]> toByteArrayOrDie(Zip.Entry ze) {
    return Suppliers.memoize(
        new Supplier<byte[]>() {
          @Override
          public byte[] get() {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
      Class<? extends Processor> clazz = processor.getClass();
      Stopwatch sw = processorTimers.get(clazz);
      if (sw == null) {
        sw = Stopwatch.createUnstarted();
        processorTimers.put(clazz, sw);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    this.annotationMirrors =
        factory.memoize(
            new Supplier<ImmutableList<AnnotationMirror>>() {
              @Override
              public ImmutableList<AnnotationMirror> get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      this.info =
          memoize(
              new Supplier<TypeBoundClass>() {
                @Override
                public TypeBoundClass get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    private static final Supplier<ElementKind> RECORD_COMPONENT =
        Suppliers.memoize(
            new Supplier<ElementKind>() {
              @Override
              public ElementKind get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    private static final Supplier<ElementKind> RECORD =
        Suppliers.memoize(
            new Supplier<ElementKind>() {
              @Override
              public ElementKind get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
  private final Supplier<TurbineTyKind> kind =
      Suppliers.memoize(
          new Supplier<TurbineTyKind>() {
            @Override
            public TurbineTyKind get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
    this.classFile =
        Suppliers.memoize(
            new Supplier<ClassFile>() {
              @Override
              public ClassFile get() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `java/com/google/turbine/binder/bytecode/BytecodeBoundClass.java`
#### Snippet
```java
      final ClassSymbol sym,
      final Map<String, TyVarSymbol> typeVariables) {
    return new Function<String, TyVarSymbol>() {
      @Override
      public TyVarSymbol apply(String input) {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/FileManagerClassBinder.java`
#### Snippet
```java
            new BytecodeBoundClass(
                sym,
                new Supplier<byte[]>() {
                  @Override
                  public byte[] get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/FileManagerClassBinder.java`
#### Snippet
```java
        return null;
      }
      return new Supplier<byte[]>() {
        @Override
        public byte[] get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/CtSymClassBinder.java`
#### Snippet
```java
  private static Supplier<byte[]> toByteArrayOrDie(Zip.Entry ze) {
    return Suppliers.memoize(
        new Supplier<byte[]>() {
          @Override
          public byte[] get() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
    return Erasure.erase(
        type,
        new Function<TyVarSymbol, TyVarInfo>() {
          @Override
          public TyVarInfo apply(TyVarSymbol input) {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
  private static Supplier<byte[]> toByteArrayOrDie(Zip.Entry ze) {
    return Suppliers.memoize(
        new Supplier<byte[]>() {
          @Override
          public byte[] get() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `java/com/google/turbine/binder/ClassPathBinder.java`
#### Snippet
```java
        transitive.computeIfAbsent(
            sym,
            new Function<ClassSymbol, BytecodeBoundClass>() {
              @Override
              public BytecodeBoundClass apply(ClassSymbol sym) {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/binder/JimageClassBinder.java`
#### Snippet
```java
  private static Supplier<byte[]> toByteArrayOrDie(Path path) {
    return Suppliers.memoize(
        new Supplier<byte[]>() {
          @Override
          public byte[] get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
    this.type =
        factory.memoize(
            new Supplier<DeclaredType>() {
              @Override
              public DeclaredType get() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
    this.elements =
        factory.memoize(
            new Supplier<ImmutableMap<String, MethodInfo>>() {
              @Override
              public ImmutableMap<String, MethodInfo> get() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
    this.elementValues =
        factory.memoize(
            new Supplier<ImmutableMap<ExecutableElement, AnnotationValue>>() {
              @Override
              public ImmutableMap<ExecutableElement, AnnotationValue> get() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
    this.elementValuesWithDefaults =
        factory.memoize(
            new Supplier<ImmutableMap<ExecutableElement, AnnotationValue>>() {
              @Override
              public ImmutableMap<ExecutableElement, AnnotationValue> get() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `java/com/google/turbine/processing/TurbineAnnotationMirror.java`
#### Snippet
```java
      this.elements =
          factory.memoize(
              new Supplier<ImmutableList<AnnotationValue>>() {
                @Override
                public ImmutableList<AnnotationValue> get() {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `java/com/google/turbine/processing/TurbineTypeMirror.java`
#### Snippet
```java

    @Override
    public int hashCode() {
      return super.hashCode();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `java/com/google/turbine/parse/UnicodeEscapePreprocessor.java`
#### Snippet
```java
  private final String input;

  private int idx = 0;
  private int ch;
  private boolean evenLeadingSlashes = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `java/com/google/turbine/parse/VariableInitializerParser.java`
#### Snippet
```java
  public Token token;
  FieldInitState state = FieldInitState.START;
  int depth = 0;

  final Lexer lexer;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java

  private final StringBuilder sb = new StringBuilder();
  int indent = 0;
  boolean newLine = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `java/com/google/turbine/tree/Pretty.java`
#### Snippet
```java
  private final StringBuilder sb = new StringBuilder();
  int indent = 0;
  boolean newLine = false;

  void printLine() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java

  /** A saved javadoc comment. */
  private String javadoc = null;

  public StreamLexer(UnicodeEscapePreprocessor reader) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `java/com/google/turbine/parse/StreamLexer.java`
#### Snippet
```java

  /** The value of the current string or character literal token. */
  private String value = null;

  /** A saved javadoc comment. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java

    private final Path path;
    private int cdindex = 0;
    private final MappedByteBuffer cd;
    private final CharsetDecoder decoder = UTF_8.newDecoder();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `java/com/google/turbine/bytecode/sig/SigParser.java`
#### Snippet
```java

  /** The current position. */
  private int idx = 0;

  /** Returns the next character to process, without advancing. */
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `access`
in `java/com/google/turbine/model/TurbineVisibility.java`
#### Snippet
```java

  public int setAccess(int access) {
    access &= ~(TurbineFlag.ACC_PUBLIC | TurbineFlag.ACC_PRIVATE | TurbineFlag.ACC_PROTECTED);
    access |= flag();
    return access;
```

### AssignmentToMethodParameter
Assignment to method parameter `access`
in `java/com/google/turbine/model/TurbineVisibility.java`
#### Snippet
```java
  public int setAccess(int access) {
    access &= ~(TurbineFlag.ACC_PUBLIC | TurbineFlag.ACC_PRIVATE | TurbineFlag.ACC_PROTECTED);
    access |= flag();
    return access;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `lookupKey`
in `java/com/google/turbine/binder/lookup/SimpleTopLevelIndex.java`
#### Snippet
```java
              return null;
            }
            lookupKey = lookupKey.rest();
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
    boolean neg = text.startsWith("-");
    if (neg) {
      text = text.substring(1);
    }
    for (int i = 0; i < text.length(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `term1`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      switch (op) {
        case TERNARY:
          term1 = ternary(term1);
          break;
        case ASSIGN:
```

### AssignmentToMethodParameter
Assignment to method parameter `term1`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
          break;
        case ASSIGN:
          term1 = assign(term1, op);
          break;
        default:
```

### AssignmentToMethodParameter
Assignment to method parameter `term1`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
            return null;
          }
          term1 = new Tree.Binary(pos, term1, term2, op);
      }
      if (term1 == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `java/com/google/turbine/parse/ConstExpressionParser.java`
#### Snippet
```java
      }
      eat();
      type = new Tree.ArrTy(position, ImmutableList.of(), type);
    }
    if (token != Token.DOT) {
```

### AssignmentToMethodParameter
Assignment to method parameter `symbol`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
                simples.addFirst(simple(symbol, info));
                while (info.owner() != null && (info.access() & TurbineFlag.ACC_STATIC) == 0) {
                  symbol = info.owner();
                  info = factory.getSymbol(symbol);
                  simples.addFirst(simple(symbol, info));
```

### AssignmentToMethodParameter
Assignment to method parameter `buf`
in `java/com/google/turbine/zip/Zip.java`
#### Snippet
```java

    public String string(ByteBuffer buf, int offset, int length) {
      buf = buf.duplicate();
      buf.position(offset);
      buf.limit(offset + length);
```

### AssignmentToMethodParameter
Assignment to method parameter `sym`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
        return Type.ErrorTy.create(bits);
      }
      sym = next;

      annotations = bindAnnotations(scope, curr.annos());
```

### AssignmentToMethodParameter
Assignment to method parameter `annotations`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java
      sym = next;

      annotations = bindAnnotations(scope, curr.annos());
      classes.add(
          Type.ClassTy.SimpleClassTy.create(sym, bindTyArgs(scope, curr.tyargs()), annotations));
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `java/com/google/turbine/binder/TypeBinder.java`
#### Snippet
```java

    // type parameters can refer to each other in f-bounds, so update the scope first
    scope = scope.append(new MapScope(typeParameters));
    ImmutableMap<TyVarSymbol, TyVarInfo> typeParameterTypes =
        bindTyParams(t.typarams(), scope, typeParameters);
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
      // perform repeated type substitution to get an instance of B with the type arguments
      // provided by A
      a = path.get(0);
      for (ClassTy ty : path) {
        ImmutableMap<TyVarSymbol, Type> mapping = getMapping(ty);
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
        if (mapping == null) {
          // if we encounter a raw type on the path from A to B the result is erased
          a = (ClassTy) erasure(a);
          break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
          break;
        }
        a = substClassTy(a, mapping);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `t1`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
        if (t2.tyKind() == TyKind.CLASS_TY) {
          ClassSymbol boxed = boxedClass(((PrimTy) t1).primkind());
          t1 = ClassTy.asNonParametricClassTy(boxed);
        }
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `t1`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
              return false;
            }
            t1 = PrimTy.create(unboxed, ImmutableList.of());
            break;
          case CLASS_TY:
```

### AssignmentToMethodParameter
Assignment to method parameter `annotations`
in `java/com/google/turbine/binder/DisambiguateTypeAnnotations.java`
#### Snippet
```java
    // desugar @Repeatable annotations before disambiguating: annotation containers may target
    // a subset of the types targeted by their element annotation
    annotations = groupRepeated(env, annotations);
    ImmutableList.Builder<AnnoInfo> typeAnnotations = ImmutableList.builder();
    for (AnnoInfo anno : annotations) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
      for (ArrayTy arrayTy : flat) {
        lowerTypeAnnotations(arrayTy.annos(), path);
        path = path.array();
      }
      lowerTypeAnnotations(base, path);
```

### AssignmentToMethodParameter
Assignment to method parameter `sym`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
        return sig.descriptor(sym);
      }
      sym = info.owner();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `java/com/google/turbine/lower/Lower.java`
#### Snippet
```java
          lowerTypeAnnotations(a, path.typeArgument(idx++));
        }
        path = path.nested();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `java/com/google/turbine/processing/TurbineMessager.java`
#### Snippet
```java
  private static int locate(Const toFind, Const v, Tree.Expression t) {
    // the element name can be omitted for `value`, e.g. in `@A({1, 2, 3})`
    t = t.kind().equals(Tree.Kind.ASSIGN) ? ((Tree.Assign) t).expr() : t;
    if (toFind.equals(v)) {
      return t.position();
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `java/com/google/common/escape/SourceCodeEscapers.java`
#### Snippet
```java
    r[1] = 'u';
    r[5] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[4] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `java/com/google/common/escape/SourceCodeEscapers.java`
#### Snippet
```java
    c >>>= 4;
    r[4] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[3] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `java/com/google/common/escape/SourceCodeEscapers.java`
#### Snippet
```java
    c >>>= 4;
    r[3] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[2] = HEX_DIGITS[c & 0xF];
    return r;
```

### AssignmentToMethodParameter
Assignment to method parameter `idx`
in `java/com/google/turbine/type/Type.java`
#### Snippet
```java

    private static boolean hasTargs(ImmutableList<SimpleClassTy> classes, int idx) {
      for (; idx >= 0; idx--) {
        SimpleClassTy simple = classes.get(idx);
        if (!simple.targs().isEmpty() || !simple.annos().isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `typeAnnos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    do {
      if (typeAnnos == null) {
        typeAnnos = maybeAnnos();
      }
      Ident name = eatIdent();
```

### AssignmentToMethodParameter
Assignment to method parameter `ty`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        tyargs = tyargs();
      }
      ty = new ClassTy(pos, Optional.ofNullable(ty), name, tyargs, typeAnnos);
      typeAnnos = null;
    } while (maybe(Token.DOT));
```

### AssignmentToMethodParameter
Assignment to method parameter `typeAnnos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
      }
      ty = new ClassTy(pos, Optional.ofNullable(ty), name, tyargs, typeAnnos);
      typeAnnos = null;
    } while (maybe(Token.DOT));
    return ty;
```

### AssignmentToMethodParameter
Assignment to method parameter `annos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java

    if (token == Token.AT) {
      annos = ImmutableList.<Anno>builder().addAll(annos).addAll(maybeAnnos()).build();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
                  ImmutableList.<Type>of(),
                  ImmutableList.of());
          pos = position;
          name = eatIdent();
          return memberRest(pos, access, annos, typaram, result, name);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    }
    result = maybeDims(maybeAnnos(), result);
    pos = position;
    name = eatIdent();
    switch (token) {
```

### AssignmentToMethodParameter
Assignment to method parameter `ty`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    while (maybe(Token.LBRACK)) {
      eat(Token.RBRACK);
      ty = new ArrTy(position, typeAnnos, ty);
      typeAnnos = maybeAnnos();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `typeAnnos`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
      eat(Token.RBRACK);
      ty = new ArrTy(position, typeAnnos, ty);
      typeAnnos = maybeAnnos();
    }
    return ty;
```

### AssignmentToMethodParameter
Assignment to method parameter `ty`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
      annos = maybeAnnos();
    }
    ty = extraDims(ty, extra);
    return ty;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
        first = false;
      } else {
        name = parser.eatIdent();
      }
      Type ty = baseTy;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    eat(Token.RPAREN);

    result = extraDims(result);

    ImmutableList.Builder<ClassTy> exceptions = ImmutableList.builder();
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `java/com/google/turbine/parse/Parser.java`
#### Snippet
```java
    }
    if (result == null) {
      name = new Ident(position, CTOR_NAME);
    }
    return new MethDecl(
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value unaryMinus(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value shiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value shiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value unaryPlus(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value shiftLeft(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value shiftLeft(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value bitwiseComp(int position, Value expr) {
    expr = promoteUnary(position, expr);
    switch (expr.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value mod(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private TurbineConstantTypeKind promoteBinary(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private TurbineConstantTypeKind promoteBinary(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value lessThanEqual(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value greaterThan(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value lessThan(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value mult(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value greaterThanEqual(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java

  private @Nullable Value unsignedShiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value unsignedShiftRight(int position, Value a, Value b) {
    a = promoteUnary(position, a);
    b = promoteUnary(position, b);
    switch (a.constantTypeKind()) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value divide(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `sym`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
        return field;
      }
      sym = info.owner();
    }
    return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    }
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
  private @Nullable Value subtract(int position, Value a, Value b) {
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `java/com/google/turbine/binder/ConstEvaluator.java`
#### Snippet
```java
    TurbineConstantTypeKind type = promoteBinary(position, a, b);
    a = coerce(position, a, type);
    b = coerce(position, b, type);
    switch (type) {
      case INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
      }
      log.clear();
      result =
          Binder.bind(
              log,
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
        units.add(Parser.parse(file));
      }
      result =
          Binder.bind(
              log,
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
      // add any generated class files to the output
      // TODO(cushon): consider handling generated classes after each round
      result = result.withGeneratedClasses(filer.generatedClasses());
    }
    if (!filer.generatedSources().isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
    }
    if (!filer.generatedSources().isEmpty()) {
      result = result.withGeneratedSources(filer.generatedSources());
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `java/com/google/turbine/binder/Processing.java`
#### Snippet
```java
    }

    result =
        result.withStatistics(Statistics.create(timers.build(), ImmutableMap.copyOf(statistics)));

```

### AssignmentToMethodParameter
Assignment to method parameter `owner`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
    while (canonOwner != null && owner != null) {
      if (!isSubclass(owner, canonOwner)) {
        owner = getInfo(owner).owner();
        continue;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
        return true;
      }
      s = getInfo(s).superclass();
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `ty`
in `java/com/google/turbine/types/Canonicalize.java`
#### Snippet
```java
      args.add(SimpleClassTy.create(s.sym(), canonicalize(s.targs(), base), s.annos()));
    }
    ty = ClassTy.create(args.build());
    return canon(base, ty);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `moduleEnv`
in `java/com/google/turbine/binder/Binder.java`
#### Snippet
```java
    // Allow resolution of modules in the current compilation. Currently this is only needed for
    // version strings in requires directives.
    moduleEnv =
        moduleEnv.append(
            new Env<ModuleSymbol, ModuleInfo>() {
```

## RuleId[id=UnnecessaryContinue]
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

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ConstCastError` does not end with 'Exception'
in `java/com/google/turbine/model/Const.java`
#### Snippet
```java

  /** An invalid constant cast. */
  public static class ConstCastError extends RuntimeException {
    public ConstCastError(TurbineConstantTypeKind type, TurbineConstantTypeKind target) {
      super(String.format("%s cannot be converted to %s", type, target));
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-11-18-53-53.114.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `java/com/google/turbine/parse/IteratorLexer.java`
#### Snippet
```java
  @Override
  public String javadoc() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Object getConstantValue() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public <A extends Annotation> A getAnnotation(Class<A> aClass) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      return info().defaultValue() != null
          ? TurbineAnnotationMirror.annotationValue(factory, info().defaultValue())
          : null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    TypeBoundClass info = factory.getSymbol(sym);
    if (info == null) {
      return null;
    }
    AnnoInfo anno = getAnnotation(annos(), sym);
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    AnnoInfo anno = getAnnotation(annos(), sym);
    if (anno == null) {
      return null;
    }
    return TurbineAnnotationProxy.create(factory, annotationType, anno);
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public String javadoc() {
      MethDecl decl = info().decl();
      return decl != null ? decl.javadoc() : null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public Object getConstantValue() {
      if (info().value() == null) {
        return null;
      }
      return info().value().getValue();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    TypeBoundClass info = factory.getSymbol(sym);
    if (info == null) {
      return null;
    }
    AnnotationMetadata metadata = info.annotationMetadata();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    AnnotationMetadata metadata = info.annotationMetadata();
    if (metadata == null) {
      return null;
    }
    List<A> result = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> aClass) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public String javadoc() {
      VarDecl decl = info().decl();
      return decl != null ? decl.javadoc() : null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    public Element getEnclosingElement() {
      // a package is not enclosed by another element
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      TypeBoundClass info = info();
      if (!(info instanceof SourceTypeBoundClass)) {
        return null;
      }
      return ((SourceTypeBoundClass) info).decl().javadoc();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
      }
      if (!isAnnotationInherited(sym)) {
        return null;
      }
      ClassSymbol superclass = infoNonNull().superclass();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
        superclass = info.superclass();
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public Object getConstantValue() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElement.java`
#### Snippet
```java
    @Override
    public String javadoc() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
        return TurbineConstantTypeKind.DOUBLE;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineTypes.java`
#### Snippet
```java
        return ((TurbineErrorType) t).asElement();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineTypeMirror.java`
#### Snippet
```java
    @Override
    public TypeMirror getSuperBound() {
      return type.boundKind() == BoundKind.LOWER ? factory.asTypeMirror(type.bound()) : null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineTypeMirror.java`
#### Snippet
```java
    @Override
    public TypeMirror getExtendsBound() {
      return type.boundKind() == BoundKind.UPPER ? factory.asTypeMirror(type.bound()) : null;
    }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    ClassSymbol sym = factory.inferSymbol(name);
    if (sym == null) {
      return null;
    }
    if (factory.getSymbol(sym) == null) {
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    }
    if (factory.getSymbol(sym) == null) {
      return null;
    }
    return factory.typeElement(sym);
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    ImmutableList<String> packageName = ImmutableList.copyOf(Splitter.on('.').split(name));
    if (factory.tli().lookupPackage(packageName) == null) {
      return null;
    }
    return factory.packageElement(new PackageSymbol(Joiner.on('/').join(packageName)));
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/TurbineElements.java`
#### Snippet
```java
    String comment = ((TurbineElement) e).javadoc();
    if (comment == null) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
    LookupResult lookup = tli.scope().lookup(new LookupKey(asIdents(name)));
    if (lookup == null) {
      return null;
    }
    ClassSymbol sym = (ClassSymbol) lookup.sym();
```

### ReturnNull
Return of `null`
in `java/com/google/turbine/processing/ModelFactory.java`
#### Snippet
```java
      sym = getSymbol(sym).children().get(bit.value());
      if (sym == null) {
        return null;
      }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `java/com/google/turbine/main/Main.java`
#### Snippet
```java

  private static void writeManifest(JarOutputStream jos, Manifest manifest) throws IOException {
    addEntry(jos, MANIFEST_DIR, new byte[] {});
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    manifest.write(out);
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=UnstableApiUsage]
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

  private final String source;
  private final ImmutableRangeMap<Integer, Integer> lines;

  private LineMap(String source, ImmutableRangeMap<Integer, Integer> lines) {
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
  public void writeAnnotation(ByteArrayDataOutput output, Annotations attribute) {
    output.writeShort(pool.utf8(attribute.kind().signature()));
    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();
    tmp.writeShort(attribute.annotations().size());
    for (AnnotationInfo annotation : attribute.annotations()) {
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
    ModuleInfo module = attribute.module();

    ByteArrayDataOutput tmp = ByteStreams.newDataOutput();

    tmp.writeShort(pool.moduleInfo(module.name()));
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

