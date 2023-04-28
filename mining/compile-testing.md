# compile-testing 
 
# Bad smells
I found 68 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 11 | true |
| OptionalUsedAsFieldOrParameterType | 10 | false |
| ConstantValue | 8 | false |
| BoundedWildcard | 6 | false |
| DataFlowIssue | 4 | false |
| OptionalContainsCollection | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| UnnecessaryReturn | 2 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| Convert2Lambda | 2 | false |
| OptionalIsPresent | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DeprecatedIsStillUsed | 1 | false |
| Convert2MethodRef | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| StringBufferReplaceableByString | 1 | false |
| FinalStaticMethod | 1 | false |
| OptionalAssignedToNull | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| RedundantFieldInitialization | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
      if (!identifier.isPresent()) {
        idsMatch = true;
      } else if (!idValue.isPresent()) {
        idsMatch = false;
      } else {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java

  /** The clause in the fluent API for further tests on successful compilations without warnings. */
  public interface CleanCompilationClause
      extends CompilationWithNotesClause<CleanCompilationClause>,
          ChainingClause<GeneratedPredicateClause<CleanCompilationClause>> {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the non-generic clause type implementing this interface
   */
  public interface GeneratedPredicateClause<T> {
    /**
     * Checks that a source file with an equivalent
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the non-generic clause type implementing this interface
   */
  public interface SuccessfulFileClause<T> extends ChainingClause<GeneratedPredicateClause<T>> {
    /**
     * Checks that the contents of the generated file match the contents of the specified
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the non-generic clause type implementing this interface
   */
  public interface CompilationWithNotesClause<T> {
    /**
     * Checks that a note exists that contains the given fragment in the
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface LineClause<T> extends ChainingClause<T> {
    @CanIgnoreReturnValue
    ColumnClause<T> onLine(long lineNumber);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the clause type returned by {@link #and()}
   */
  public interface ChainingClause<T> {
    T and();
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java

  /** The clause in the fluent API for further tests on unsuccessful compilations. */
  public interface UnsuccessfulCompilationClause
      extends CompilationWithWarningsClause<UnsuccessfulCompilationClause> {
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface ColumnClause<T> extends ChainingClause<T> {
    @CanIgnoreReturnValue
    ChainingClause<T> atColumn(long columnNumber);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java

  /** The clause in the fluent API for further tests on successful compilations. */
  public interface SuccessfulCompilationClause
      extends CompilationWithWarningsClause<SuccessfulCompilationClause>,
          ChainingClause<GeneratedPredicateClause<SuccessfulCompilationClause>> {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the clause type returned by {@link ChainingClause#and()}
   */
  public interface FileClause<T> extends ChainingClause<T> {
    @CanIgnoreReturnValue
    LineClause<T> in(JavaFileObject file);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/testing/compile/CompileTester.java`
#### Snippet
```java
   * @param T the non-generic clause type implementing this interface
   */
  public interface CompilationWithWarningsClause<T> extends CompilationWithNotesClause<T> {

    /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MoreTrees` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
 */
@SuppressWarnings("restriction") // Sun APIs usage intended
final class MoreTrees {

  /** Parses the source given into a {@link CompilationUnitTree}. */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `actual` to `Name` will produce `ClassCastException` for any non-null value
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
        boolean eq =
            (expected instanceof Name)
                ? namesEqual((Name) expected, (Name) actual)
                : Objects.equals(expected, actual);
        if (!eq) {
```

### DataFlowIssue
Argument `StandardSystemProperty.PATH_SEPARATOR.value()` might be null
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
        Iterables.addAll(
            classpaths,
            Splitter.on(StandardSystemProperty.PATH_SEPARATOR.value())
                .split(StandardSystemProperty.JAVA_CLASS_PATH.value()));
        break;
```

### DataFlowIssue
Argument `StandardSystemProperty.JAVA_CLASS_PATH.value()` might be null
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
            classpaths,
            Splitter.on(StandardSystemProperty.PATH_SEPARATOR.value())
                .split(StandardSystemProperty.JAVA_CLASS_PATH.value()));
        break;
      }
```

### DataFlowIssue
Unboxing of `index` may produce `NullPointerException`
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java
                  (line, index) -> line.contains(expectedLineSubstring) ? index : null)
              .filter(notNull())
              .map(index -> index + 1) // to 1-based line numbers
              .collect(toImmutableSet());
      checkArgument(
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `ImmutableList`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
      ImmutableList<Processor> processors,
      ImmutableList<String> options,
      Optional<ImmutableList<File>> classPath,
      Optional<ImmutableList<File>> annotationProcessorPath) {
    return new AutoValue_Compiler(
```

### OptionalContainsCollection
'Optional' contains collection `ImmutableList`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
      ImmutableList<String> options,
      Optional<ImmutableList<File>> classPath,
      Optional<ImmutableList<File>> annotationProcessorPath) {
    return new AutoValue_Compiler(
        javaCompiler(), processors, options, classPath, annotationProcessorPath);
```

### OptionalContainsCollection
'Optional' contains collection `ImmutableList`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
   * The annotation processor path. If not present, the system annotation processor path is used.
   */
  public abstract Optional<ImmutableList<File>> annotationProcessorPath();

  /**
```

### OptionalContainsCollection
'Optional' contains collection `ImmutableList`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java

  /** The compilation class path. If not present, the system class path is used. */
  public abstract Optional<ImmutableList<File>> classPath();

  /**
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'withClasspathFrom' is still used
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
   */
  @Deprecated
  public final Compiler withClasspathFrom(ClassLoader classloader) {
    return copy(
        processors(),
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
  private static ImmutableListMultimap<Diagnostic.Kind, Diagnostic<? extends JavaFileObject>>
      sortDiagnosticsByKind(Iterable<Diagnostic<? extends JavaFileObject>> diagnostics) {
    return Multimaps.index(diagnostics, input -> input.getKind());
  }

```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'getPlatformClassLoader'
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
    try {
      // JDK >= 9
      return (ClassLoader) ClassLoader.class.getMethod("getPlatformClassLoader").invoke(null);
    } catch (ReflectiveOperationException e) {
      // Java <= 8
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

              @Override
              protected @Nullable Void defaultAction(Tree tree, @Nullable Void p) {
                filteredActualTrees.add(tree);
                return null;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java
      failWithoutActual(
          simpleFact(
              new StringBuilder("Expected ")
                  .append(expectedDiagnostic)
                  .append(String.format(format, args))
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
        scan((Tree) expected, (Tree) actual);
      } else if (expected instanceof LineMap && actual instanceof LineMap) {
        return; // we don't require lines to match exactly
      } else if (expected instanceof JavaFileObject && actual instanceof JavaFileObject) {
        return; // these will never be equal unless the inputs are identical
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
        return; // we don't require lines to match exactly
      } else if (expected instanceof JavaFileObject && actual instanceof JavaFileObject) {
        return; // these will never be equal unless the inputs are identical
      } else {
        boolean eq =
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/google/testing/compile/JavaFileObjects.java`
#### Snippet
```java
    static final Splitter JAR_URL_SPLITTER = Splitter.on('!');

    static final URI getPathUri(URL jarUrl) {
      ImmutableList<String> parts = ImmutableList.copyOf(JAR_URL_SPLITTER.split(jarUrl.getPath()));
      checkArgument(parts.size() == 2,
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java

  private static void setLocation(
      InMemoryJavaFileManager fileManager, StandardLocation location, ImmutableList<File> path) {
    try {
      fileManager.setLocation(location, path);
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
   * processor path.
   */
  public final Compiler withAnnotationProcessorPath(Iterable<File> annotationProcessorPath) {
    return copy(
        processors(),
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java

  /** Uses the given classpath for the compilation instead of the system classpath. */
  public final Compiler withClasspath(Iterable<File> classPath) {
    return copy(
        processors(),
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/com/google/testing/compile/JavaSourcesSubject.java`
#### Snippet
```java

  @Override
  public JavaSourcesSubject withClasspath(Iterable<File> classPath) {
    this.classPath = ImmutableList.copyOf(classPath);
    return this;
```

### BoundedWildcard
Can generalize to `? extends JavaFileObject`
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java

  private JavaFileObjectSubject checkGeneratedFile(
      Optional<JavaFileObject> generatedFile, Location location, String path) {
    if (!generatedFile.isPresent()) {
      // TODO(b/132162475): Use Facts if it becomes public API.
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java
    }

    <T> Stream<T> mapDiagnostics(Function<? super Diagnostic<? extends JavaFileObject>, T> mapper) {
      return diagnostics.stream().map(mapper);
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MethodSignature` has no concrete subclass
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java

  @AutoValue
  abstract static class MethodSignature {
    abstract String name();
    abstract ImmutableList<Equivalence.Wrapper<TypeMirror>> parameterTypes();
```

### AbstractClassNeverImplemented
Abstract class `Compiler` has no concrete subclass
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
// clashes with java.lang.Compiler (which is deprecated for removal in 9)
@SuppressWarnings("JavaLangClash")
public abstract class Compiler {

  /** Returns the {@code javac} compiler. */
```

### AbstractClassNeverImplemented
Abstract class `TypedCompilationUnit` has no concrete subclass
in `src/main/java/com/google/testing/compile/JavaSourcesSubject.java`
#### Snippet
```java

  @AutoValue
  abstract static class TypedCompilationUnit {
    abstract CompilationUnitTree tree();

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'classPath'
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
      ImmutableList<Processor> processors,
      ImmutableList<String> options,
      Optional<ImmutableList<File>> classPath,
      Optional<ImmutableList<File>> annotationProcessorPath) {
    return new AutoValue_Compiler(
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'annotationProcessorPath'
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
      ImmutableList<String> options,
      Optional<ImmutableList<File>> classPath,
      Optional<ImmutableList<File>> annotationProcessorPath) {
    return new AutoValue_Compiler(
        javaCompiler(), processors, options, classPath, annotationProcessorPath);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'data'
in `src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java
      implements JavaFileObject {
    private long lastModified = 0L;
    private Optional<ByteSource> data = Optional.empty();

    InMemoryJavaFileObject(URI uri) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 't1'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
    /** Returns the first present value. If both values are absent, then returns absent .*/
    @Override
    public Optional<TreePath> reduce(Optional<TreePath> t1, Optional<TreePath> t2) {
      return t1.isPresent() ? t1 : t2;
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 't2'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
    /** Returns the first present value. If both values are absent, then returns absent .*/
    @Override
    public Optional<TreePath> reduce(Optional<TreePath> t1, Optional<TreePath> t2) {
      return t1.isPresent() ? t1 : t2;
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'identifier'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
    private final Tree.Kind kindSought;

    public SearchScanner(Tree.Kind kindSought, Optional<String> identifier) {
      this.kindSought = kindSought;
      this.identifier = identifier;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ret'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
     * {@code null}.
     */
    private Optional<TreePath> absentIfNull(Optional<TreePath> ret) {
      return (ret != null) ? ret : Optional.empty();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'idValue'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
     * and kind sought.
     */
    private boolean isMatch(Tree node, Optional<Object> idValue) {
      boolean idsMatch;
      if (!identifier.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'identifier'
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
  /** A {@link TreePathScanner} to power the subtree searches in this class */
  static final class SearchScanner extends TreePathScanner<Optional<TreePath>, @Nullable Void> {
    private final Optional<String> identifier;
    private final Tree.Kind kindSought;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'generatedFile'
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java

  private JavaFileObjectSubject checkGeneratedFile(
      Optional<JavaFileObject> generatedFile, Location location, String path) {
    if (!generatedFile.isPresent()) {
      // TODO(b/132162475): Use Facts if it becomes public API.
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
     */
    private Optional<TreePath> absentIfNull(Optional<TreePath> ret) {
      return (ret != null) ? ret : Optional.empty();
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java
  public JavaFileObjectSubject generatedSourceFile(String qualifiedName) {
    return generatedFile(
        StandardLocation.SOURCE_OUTPUT, qualifiedName.replaceAll("\\.", "/") + ".java");
  }

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `types` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/google/testing/compile/CompilationRule.java`
#### Snippet
```java

  private Elements elements;
  private Types types;

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elements` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/google/testing/compile/CompilationRule.java`
#### Snippet
```java
      JavaFileObjects.forSourceLines("Dummy", "final class Dummy {}");

  private Elements elements;
  private Types types;

```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/google/testing/compile/TypeEnumerator.java`
#### Snippet
```java
      Set<String> typeDeclSet = firstNonNull(scan(reference.getTypeDecls(), v), ImmutableSet.of());
      return FluentIterable.from(typeDeclSet)
          .transform(new Function<String, String>() {
            @Override public String apply(String typeName) {
              return packageName.isEmpty() ? typeName :
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/google/testing/compile/Breadcrumbs.java`
#### Snippet
```java
  static List<String> getBreadcrumbList(TreePath path) {
    return Lists.reverse(FluentIterable.from(path)
        .transform(new Function<Tree, String>() {
          @Override public String apply(Tree t) {
            return t.accept(BREADCRUMB_VISITOR, null);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java
  private static final class InMemoryJavaFileObject extends SimpleJavaFileObject
      implements JavaFileObject {
    private long lastModified = 0L;
    private Optional<ByteSource> data = Optional.empty();

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `JavaFileObject`
in `src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java

  private static final class InMemoryJavaFileObject extends SimpleJavaFileObject
      implements JavaFileObject {
    private long lastModified = 0L;
    private Optional<ByteSource> data = Optional.empty();
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-28-21-05-31.012.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/google/testing/compile/CompilationSubject.java`
#### Snippet
```java
      }
      failWithoutActual(
          fact("expected to generate file", "/" + path), facts.build().toArray(new Fact[0]));
      return ignoreCheck().about(javaFileObjects()).that(ALREADY_FAILED);
    }
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/com/google/testing/compile/Compiler.java`
#### Snippet
```java
   * @return a new instance with the same processors and the given options
   */
  public final Compiler withOptions(Iterable<? extends Object> options) {
    return copy(
        processors(),
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/google/testing/compile/MoreTrees.java`
#### Snippet
```java
    Preconditions.checkArgument(res.isPresent(), "Couldn't find any subtree matching the given "
        + "criteria. Root: %s, Class: %s, Identifier: %s", root, treeKind, identifier);
    return res.get();
  }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `packageSet.isEmpty()` is always `false`
in `src/main/java/com/google/testing/compile/TypeEnumerator.java`
#### Snippet
```java
            "package identifier. Found " + packageSet);
      }
      final String packageName = packageSet.isEmpty() ? "" : packageSet.iterator().next();
      Set<String> typeDeclSet = firstNonNull(scan(reference.getTypeDecls(), v), ImmutableSet.of());
      return FluentIterable.from(typeDeclSet)
```

### ConstantValue
Condition `expected instanceof JavaFileObject && actual instanceof JavaFileObject` is always `false`
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
      } else if (expected instanceof LineMap && actual instanceof LineMap) {
        return; // we don't require lines to match exactly
      } else if (expected instanceof JavaFileObject && actual instanceof JavaFileObject) {
        return; // these will never be equal unless the inputs are identical
      } else {
```

### ConstantValue
Condition `actual instanceof JavaFileObject` is always `false` when reached
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
      } else if (expected instanceof LineMap && actual instanceof LineMap) {
        return; // we don't require lines to match exactly
      } else if (expected instanceof JavaFileObject && actual instanceof JavaFileObject) {
        return; // these will never be equal unless the inputs are identical
      } else {
```

### ConstantValue
Condition `!actualsIterator.hasNext()` is always `true` when reached
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
        if (!expectedsIterator.hasNext() && actualsIterator.hasNext()) {
          diffBuilder.addExtraActualNode(actualPathPlus(actualsIterator.next()));
        } else if (expectedsIterator.hasNext() && !actualsIterator.hasNext()) {
          diffBuilder.addExtraExpectedNode(expectedPathPlus(expectedsIterator.next()));
        }
```

### ConstantValue
Result of `actualsIterator.hasNext()` is always 'false'
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
        if (!expectedsIterator.hasNext() && actualsIterator.hasNext()) {
          diffBuilder.addExtraActualNode(actualPathPlus(actualsIterator.next()));
        } else if (expectedsIterator.hasNext() && !actualsIterator.hasNext()) {
          diffBuilder.addExtraExpectedNode(expectedPathPlus(expectedsIterator.next()));
        }
```

### ConstantValue
Condition `expected != null` is always `true` when reached
in `src/main/java/com/google/testing/compile/TreeDiffer.java`
#### Snippet
```java
      } else if (expected != null && actual == null) {
        diffBuilder.addExtraExpectedNode(expectedPathPlus(expected));
      } else if (actual != null && expected != null) {
        pushPathAndAccept(expected, actual);
      }
```

### ConstantValue
Value `p` is always 'true'
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
        @Override
        public Boolean scan(Tree tree, Boolean p) {
          return isTrue(p) ? p : super.scan(tree, p);
        }

```

### ConstantValue
Value `p` is always 'false'
in `src/main/java/com/google/testing/compile/Parser.java`
#### Snippet
```java
        @Override
        public Boolean scan(Tree tree, Boolean p) {
          return isTrue(p) ? p : super.scan(tree, p);
        }

```

